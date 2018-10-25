package com.clopay.automationtesting.basetest;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
 
public class BaseTest {
 
public static WebDriver driver;
public static WebDriver driver2;
public ExtentHtmlReporter htmlReporter;
public static ExtentReports extent;
public static ExtentTest test;
public static String strResultName;
public FileInputStream fis = null;
public Properties prop = null;
@BeforeSuite
public void init() throws IOException {
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
String  strFrameworkPath = new java.io.File(".").getCanonicalPath();
strResultName="Result_" + dateFormat.format(new Date()).replace("/", "_").replace(" ", "").replace(":", "");
 
File  f = new File(strFrameworkPath + "\\Results\\" + strResultName);
        f.mkdir();
 
fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/com.clopay.automationtesting/repo/config.properties");
prop = new Properties();
prop.load(fis);
String hostname = "Unknown";
InetAddress addr;
    addr = InetAddress.getLocalHost();
    hostname = addr.getHostName();
    System.out.println(addr);
    System.out.println(hostname);
 
if (extent == null) {
htmlReporter = new ExtentHtmlReporter(
System.getProperty("user.dir") +"/test-output/"+getCurrentDateTime()+"_"+"AssociatePortalDailyCheckListReport.html");
extent = new ExtentReports();
extent.attachReporter(htmlReporter);
 
extent.setSystemInfo("OS", "Windows");
extent.setSystemInfo("Host Name", hostname);
extent.setSystemInfo("Environment", "QA");
extent.setSystemInfo("User Name", "AutomationUser");
 
htmlReporter.config().setChartVisibilityOnOpen(true);
htmlReporter.config().setDocumentTitle("AutomationTesting.in Demo Report");
htmlReporter.config().setReportName("Clopay Automation Report");
htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
htmlReporter.config().setTheme(Theme.DARK);
}
 
if (driver == null) {
 
if (prop.get("browser").equals("chrome")) {
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/com.clopay.automationtesting.drivers/chromedriver.exe");
driver = new ChromeDriver();
 
} else if (prop.get("browser").equals("firefox")) {
System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/main/resources/com.clopay.automationtesting.drivers/geckodriver.exe");
/*//driver = new FirefoxDriver();
FirefoxProfile profile = new FirefoxProfile();
//fp = webdriver.FirefoxProfile()
profile.setPreference("browser.download.manager.showWhenStarting", false);
profile.setPreference("browser.download.manager.showAlertOnComplete", false);
profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv");
profile.setPreference("browser.download.dir", download_dir);
//return webdriver.Firefox(firefox_profile=fp)
profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;");
profile.setPreference( "browser.download.manager.showWhenStarting", false );
profile.setPreference( "pdfjs.disabled", true );
FirefoxOptions firefoxOptions = new FirefoxOptions();
//firefoxOptions.setCapability("marionette", true);
driver = new FirefoxDriver(firefoxOptions);
*/}
/*else if (prop.get("browser").equals("edge")) {
System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/src/main/resources/com.clopay.automationtesting.drivers/MicrosoftWebDriver.exe");
driver = new EdgeDriver();
}*/
else if (prop.get("browser").equals("ie")) {
System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/main/resources/com.clopay.automationtesting.drivers/IEDriverServer.exe");
driver = new InternetExplorerDriver();
/*DesiredCapabilities ieCapabilities=DesiredCapabilities.internetExplorer();
ieCapabilities.setCapability("nativeEvents",false);
ieCapabilities.setCapability("unexpectedAlertBehaviour","accept");
ieCapabilities.setCapability("ignoreProtectedModeSettings",true);
ieCapabilities.setCapability("disable-popup-blocking",true);
ieCapabilities.setCapability("PersistentHover",false);
ieCapabilities.setCapability("RequireWindowFocus ", true);
ieCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
*/

//ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
}
driver.manage().window().maximize();
driver.get(prop.getProperty("siteUrl"));
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
}
 
public void logIntoReport(String logInfo) {
test.info(MarkupHelper.createLabel(logInfo, ExtentColor.BLUE));
}
 
@AfterMethod
public void getResult(ITestResult result) throws IOException {
if (result.getStatus() == ITestResult.FAILURE) {
String screenShotPath = capture(driver, "screenShotName");
//test.fail(MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:",
//ExtentColor.RED));
//test.fail(result.getThrowable());
//test.fail("Snapshot below: " + test.addScreenCaptureFromPath(screenShotPath));
test.fail("Test Script failed due to below issues: <br /><br /> " + result.getThrowable());
 
} else if (result.getStatus() == ITestResult.SUCCESS) {
test.pass(MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
} else {
test.skip(MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
test.skip(result.getThrowable());
}
}
 
public void verifyTitle(String title) {
Assert.assertEquals(driver.getTitle(), title);
}
 
public static String capture(WebDriver driver, String screenShotName) throws IOException {
TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
String dest = System.getProperty("user.dir") + "/ErrorScreenshots/" + screenShotName + getCurrentDateTime()
+ ".png";
File destination = new File(dest);
FileUtils.copyFile(source, destination);
 
return dest;
}
 
public static String getCurrentDateTime() {
                SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmss");
//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
//SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
Date date = new Date();
//sdf.format(date).replace(" ", "_").replace(":", "_");
 
return sdf.format(date);
}
 
@AfterSuite
public void teardown() {
extent.flush();
driver.quit();
}
}
 
 