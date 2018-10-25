package com.clopay.automationtesting.testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.clopay.automationtesting.basetest.BaseTest;

public class ValidatingAssociatePortalLogOutFunctionality extends BaseTest {
    @Test(priority = 7, enabled=true)
    public void ValidatingUserLoguOUtFunctionalityTest() throws Exception {
    test = extent.createTest("ValidatingAssociatePortalLogOutFunctionality");

    try{
    Actions a = new Actions(driver);
    a.moveToElement(driver.findElement(By.linkText("Logout"))).build().perform();
    a.click().build().perform();
   
    Thread.sleep(2000);
                 
    } catch (Exception e) {
           System.out.println("Exception throws"+e.getMessage());
           }
    }
   
          
    @Test(priority = 8, enabled=true)
    public void SitefinityLogin() throws Exception {
    test = extent.createTest("ValidatingAssociatePortalSitefinityLoginFunctionality");

   
    Thread.sleep(2000);
    driver.navigate().to("http://associateportal.clopay.com/Sitefinity/Login");
   
    driver.manage().window().maximize();
    Thread.sleep(1000);
    try{
    if(driver.findElement(By.xpath("//*[@id=\"ctl01_ctl00_ctl00_Logout\"]")).isDisplayed())
    {
           driver.findElement(By.xpath("//*[@id=\"ctl01_ctl00_ctl00_Logout\"]")).click();
           Thread.sleep(2000);
           Reusedmethods RM = new Reusedmethods();
           RM.SitefinityLogin("vsivarathri", "telephone1", driver);
           Thread.sleep(6000);
                         //RM.takeSS("Dashboard",driver);
           TakesScreenshot scrShot =((TakesScreenshot)driver);

           //Call getScreenshotAs method to create image file

                   File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

               //Move image file to new destination

                   File DestFile=new File(System.getProperty("user.dir") + "//Images//Expected//" + "Dashboard" + ".png");

                   //Copy file at destination

                   FileUtils.copyFile(SrcFile, DestFile); 
    }
    } catch (Exception e) {
           System.out.println("Exception throws"+e.getMessage());
          
   
    Reusedmethods RM = new Reusedmethods();
    RM.SitefinityLogin("vsivarathri", "telephone1", driver);
    Thread.sleep(6000);
                  RM.takeSS("Dashboard",driver);
   
    }
    }	@Test(priority = 9, enabled=true) 
	public void SitefinityLogOutFunctionalityTest() throws Exception {
	test = extent.createTest("ValidatingAssociatePortalSitefinityLogOutFunctionality");

	try{
	
	driver.findElement(By.id("T4C26EF62002_ctl00_ctl00_logoutButton")).click();
	} catch (Exception e) {
		System.out.println("Exception throws"+e.getMessage());
		} 
	}
}


