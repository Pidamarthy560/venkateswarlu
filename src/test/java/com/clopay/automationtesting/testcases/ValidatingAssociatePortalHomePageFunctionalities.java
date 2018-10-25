package com.clopay.automationtesting.testcases;
 
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
 
import com.clopay.automationtesting.basetest.BaseTest;
 
//code for firefox and chrome
 
/*public class ValidatingAssociatePortalHomePageFunctionalities extends BaseTest {
@Test(priority = 2, enabled=true)
public void AssociatePortalUS_Stores() throws Exception {
test = extent.createTest("ValidatingAssociatePortalHomePageFunctionalities");
try{
Reusedmethods RM = new Reusedmethods();
//RM.Login("rveguru", "welcome1", driver);
driver.findElement(By.xpath("//span[text()='US User']")).click();
Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='txtUsStores']")).sendKeys("4601");
            driver.findElement(By.xpath("//input[@id='btnGetstoreOrders']")).click();
        Thread.sleep(8000);
        driver.findElement(By.id("btnExportOrders")).click();
        Robot robot = new Robot();
        Thread.sleep(3000);
       
        //while running chrome comment below code
        
                robot.keyPress(KeyEvent.VK_ALT);
                robot.keyPress(KeyEvent.VK_S);
                robot.keyRelease(KeyEvent.VK_S);
                robot.keyRelease(KeyEvent.VK_ALT);
                robot.keyPress(KeyEvent.VK_ALT);
                robot.keyPress(KeyEvent.VK_A);
                robot.keyRelease(KeyEvent.VK_A);
                robot.keyRelease(KeyEvent.VK_ALT);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(2000);
       
                // till here
    
        RM.takeSS("Screen_US1",driver);
    //RM.compareSS("Screen_Us1", "Screen_Us1", "Screen_Us1", driver);
    Actions actions = new Actions(driver);
         actions.moveToElement(driver.findElement((By.xpath("//*[@id=\"ordersListGrid\"]/div[2]/table/tbody/tr/td[3]")))).build().perform();
         actions.doubleClick().build().perform();
   
          
         Thread.sleep(2000);
    
          RM.takeSS("Screen_US2",driver);
         //RM.compareSS("Screen_us2", "Screen_us2", "Screen_us2", driver);
       String mainWindowHandle=driver.getWindowHandle();
           driver.findElement(By.xpath("//a[text()='Order']")).click();
          
Thread.sleep(2000);
              Set s = driver.getWindowHandles();
                Iterator ite = s.iterator();
                while(ite.hasNext())
                {
                     String popupHandle=ite.next().toString();
                     if(!popupHandle.contains(mainWindowHandle))
                     {
                           driver.switchTo().window(popupHandle);
                           Thread.sleep(5000);
                        RM.takeSS("Screen_US3",driver);
                  driver.close();
                     }
          
  
                }
             driver.switchTo().window( mainWindowHandle );
             Thread.sleep(1000);
                  driver.findElement(By.linkText("Home")).click();
      
       Thread.sleep(2000);
      
       driver.navigate().to("https://test-associateportal.clopay.com/showdocument?documentid=52119883");
  
       
              Reusedmethods RM3=new Reusedmethods();
          RM3.takeSS("Screen_US3",driver);
        
//RM.compareSS("Screen_us3", "Screen_us3", "Screen_us3", driver);
 
     
} catch (Exception e) {
System.out.println("Exception throws"+e.getMessage());
}
}
@Test(priority = 3, enabled=true)
public void AssociatePortalCanada_Stores() throws Exception {
test = extent.createTest("ValidatingAssociatePortalHomePageFunctionalities");
try{
Reusedmethods RM = new Reusedmethods();
//RM.Login("rveguru", "welcome1", driver);
        Thread.sleep(5000);
      
        driver.findElement(By.xpath("//span[@id='rbtnCaUser']/span[@class='rbPrimaryIcon rbToggleRadio']")).click();
     
        Thread.sleep(5000);
      
       
        Actions a=new Actions(driver);
WebElement e= driver.findElement(By.xpath("//input[@id='radCmbDistricts_Input']"));
a.click(e).build().perform();
a.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
    
       driver.findElement(By.xpath("//input[@id='btnGetDistricOrders']")).click();
       Thread.sleep(7000);
          
RM.takeSS("Screen_CANADA1",driver);
          
Thread.sleep(1000);
           driver.findElement(By.id("btnExportOrders")).click();
                Actions actions = new Actions(driver);
          actions.moveToElement(driver.findElement((By.xpath("//*[@id=\"ordersListGrid\"]/div[2]/table/tbody/tr[1]/td[1]")))).build().perform();
          actions.doubleClick().build().perform();
         
            
                     Thread.sleep(5000);
         
                   RM.takeSS("Screen_CANADA2",driver);
        
             String mainWindowHandle=driver.getWindowHandle();
                driver.findElement(By.xpath("//a[text()='Order']")).click();
                  Thread.sleep(2000);
                   Set s = driver.getWindowHandles();
                     Iterator ite = s.iterator();
                     while(ite.hasNext())
                     {
                          String popupHandle=ite.next().toString();
                          if(!popupHandle.contains(mainWindowHandle))
                          {
                                driver.switchTo().window(popupHandle);
                                Thread.sleep(5000);
                               RM.takeSS("Screen_CANADA3",driver);
                       driver.close();
                          }
                         
                     }
                  driver.switchTo().window(mainWindowHandle );
                     //driver.findElement(By.linkText("Home")).click();
         
} catch (Exception e) {
System.out.println("Exception throws"+e.getMessage());
}
finally {
JavascriptExecutor js01 = (JavascriptExecutor)driver;
js01.executeScript("window.scrollBy(0,-10000)");
}
}*/

 
//*********************************************************************************************************************************************
//code for IE
 
public class ValidatingAssociatePortalHomePageFunctionalities extends BaseTest {
 
       @Test(priority = 2, enabled = true)
       public void AssociatePortalUS_Stores() throws Exception {
              test = extent.createTest("Validating AssociatePortalHomePageFunctionalities");
 
              try {
                    
                     //if (prop.get("browser").equals("ie")) {
                     Reusedmethods RM = new Reusedmethods();
                     // RM.Login("rveguru", "welcome1", driver);
                     driver.findElement(By.xpath("//span[text()='US User']")).click();
                     Thread.sleep(2000);
                     driver.findElement(By.xpath("//input[@id='txtUsStores']")).sendKeys("4601");
                     driver.findElement(By.xpath("//input[@id='btnGetstoreOrders']")).click();
                     Thread.sleep(8000);
                      //driver.findElement(By.id("btnExportOrders")).click();//for ff and chrome
                     driver.findElement(By.id("btnExportOrders")).sendKeys(""); // for ie
                     Thread.sleep(3000);
                     // driver.switchTo().activeElement();
 
                     Robot robot = new Robot();
 
                     // for IE browser
 
                     robot.keyPress(KeyEvent.VK_ENTER);
                     robot.keyRelease(KeyEvent.VK_ENTER);
                     Thread.sleep(2000);
                     robot.keyPress(KeyEvent.VK_ALT);
                     robot.keyPress(KeyEvent.VK_S);
                     Thread.sleep(2000);
                     robot.keyRelease(KeyEvent.VK_S);
                     robot.keyRelease(KeyEvent.VK_ALT);
                     
                     /*robot.keyPress(KeyEvent.VK_ALT);
                     robot.keyPress(KeyEvent.VK_P);
                     Thread.sleep(2000);
                     robot.keyRelease(KeyEvent.VK_P);
                     robot.keyRelease(KeyEvent.VK_ALT);
                    
                     robot.keyPress(KeyEvent.VK_ALT);
                     robot.keyPress(KeyEvent.VK_F4);
                     Thread.sleep(2000);
                     robot.keyRelease(KeyEvent.VK_F4);
                     robot.keyRelease(KeyEvent.VK_ALT);
                    */
 
                     // for FF browser
 
                    
                    /* robot.keyPress(KeyEvent.VK_ALT);
                      robot.keyPress(KeyEvent.VK_S);
                      
                      robot.keyRelease(KeyEvent.VK_S);
                     robot.keyRelease(KeyEvent.VK_ALT);
                    
                      robot.keyPress(KeyEvent.VK_ALT);
                     robot.keyPress(KeyEvent.VK_A);
                      
                      robot.keyRelease(KeyEvent.VK_A);
                     robot.keyRelease(KeyEvent.VK_ALT);
                    
                      robot.keyPress(KeyEvent.VK_ENTER);
                     robot.keyRelease(KeyEvent.VK_ENTER);
 */                   
 
                     Thread.sleep(2000);
                     RM.takeSS("Screen_US1", driver);
                     // RM.compareSS("Screen_Us1", "Screen_Us1", "Screen_Us1", driver);
                    
                    
                    
                     
                     Actions actions = new Actions(driver);
                     actions.moveToElement(
                           driver.findElement((By.xpath("//*[@id=\"ordersListGrid\"]/div[2]/table/tbody/tr/td[3]")))).build().perform();
                     actions.doubleClick().build().perform();
 
                     Thread.sleep(5000);
                    
                     TakesScreenshot scrShot =((TakesScreenshot)driver);
 
               //Call getScreenshotAs method to create image file
 
                       File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
 
                   //Move image file to new destination
 
                       File DestFile=new File(System.getProperty("user.dir") + "//Images//Expected//" + "Screen_US2" + ".png");
 
                       //Copy file at destination
 
                       FileUtils.copyFile(SrcFile, DestFile);
 
                     //RM.takeSS("Screen_US2", driver);
                     Thread.sleep(5000);
                    
                     JavascriptExecutor jse30 = (JavascriptExecutor) driver;
                     jse30.executeScript("window.scrollBy(0,-1000)");
 
              System.out.println(driver.findElement(By.id("divEbsOrderDocuments")).findElement(By.tagName("div")).getAttribute("data-documenturl"));
                     String url = driver.findElement(By.id("divEbsOrderDocuments")).findElement(By.tagName("div")).getAttribute("data-documenturl");
 
                     Thread.sleep(1000);
 
                     driver.get(url);
 
 
                    
                     Thread.sleep(6000);
                    
 
                     String path = System.getProperty("user.dir") + "//Images//Expected//" + "Screen_US3" + ".png";
                     Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                     BufferedImage Image = robot.createScreenCapture(capture);
                     ImageIO.write(Image, "png", new File(path));
                     Thread.sleep(5000);
                    
                     robot.mouseMove(15, 70);
                     robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                     robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                     Thread.sleep(2000);
                     robot.keyPress(KeyEvent.VK_ALT); 
          			robot.keyPress(KeyEvent.VK_F);
          			robot.keyRelease(KeyEvent.VK_F);
          			robot.keyRelease(KeyEvent.VK_ALT); 
                     Thread.sleep(2000);
                     robot.keyPress(KeyEvent.VK_A);
                     robot.keyRelease(KeyEvent.VK_A);
                    
                     Thread.sleep(5000);
                    
                     robot.keyPress(KeyEvent.VK_CONTROL);
                     robot.keyPress(KeyEvent.VK_S);
                     robot.keyRelease(KeyEvent.VK_CONTROL);
                     robot.keyRelease(KeyEvent.VK_S);
                    
                     String a = "D:\"";
                     String b = "\\Images\\Expected\\";
                     String c = "Screen_US3";
                     String myString = System.getProperty("user.dir") + b +c;
                     StringSelection stringSelection = new StringSelection(myString);
                     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                     clipboard.setContents(stringSelection, null);
                     robot.keyPress(KeyEvent.VK_CONTROL);
               robot.keyPress(KeyEvent.VK_V);
               robot.keyRelease(KeyEvent.VK_CONTROL);
               robot.keyRelease(KeyEvent.VK_V);
                     robot.keyPress(KeyEvent.VK_ENTER);
                     robot.keyRelease(KeyEvent.VK_ENTER);
                     robot.keyPress(KeyEvent.VK_Y);
               robot.keyPress(KeyEvent.VK_Y);
               robot.keyPress(KeyEvent.VK_ENTER);
                     robot.keyRelease(KeyEvent.VK_ENTER);
 
                     Thread.sleep(5000);
                    
                     driver.navigate().back();
                    
                     Thread.sleep(3000);
                    
                     driver.findElement(By.linkText("Home")).click();
                    
                     //}
                    
 
              } catch (Exception e) {
                     System.out.println("Exception throws" + e.getMessage());
              }
 
       }
 
       @Test(priority = 3, enabled = true)
       public void AssociatePortalCanada_Stores() throws Exception {
              test = extent.createTest("Validating AssociatePortalHomePageFunctionalities");
 
              try {
                     Reusedmethods RM = new Reusedmethods();
                     // RM.Login("rveguru", "welcome1", driver);
                     Thread.sleep(5000);
 
                     driver.findElement(By.xpath("//span[@id='rbtnCaUser']/span[@class='rbPrimaryIcon rbToggleRadio']")).click();
 
                     Thread.sleep(5000);
 
                     Actions a = new Actions(driver);
                     WebElement e = driver.findElement(By.xpath("//input[@id='radCmbDistricts_Input']"));
                     a.click(e).build().perform();
                     a.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
 
                     driver.findElement(By.xpath("//input[@id='btnGetDistricOrders']")).click();
                     Thread.sleep(6000);
                    
 
                     RM.takeSS("Screen_CANADA1", driver);
 
                     // driver.findElement(By.id("btnExportOrders")).click();
                     driver.findElement(By.id("btnExportOrders")).sendKeys("");
                    
                    
                     Robot robot = new Robot();
                     // for IE browser
 
                                         robot.keyPress(KeyEvent.VK_ENTER);
                                         robot.keyRelease(KeyEvent.VK_ENTER);
                                         Thread.sleep(2000);
                                         robot.keyPress(KeyEvent.VK_ALT);
                                         robot.keyPress(KeyEvent.VK_S);
                                         Thread.sleep(2000);
                                         robot.keyRelease(KeyEvent.VK_S);
                                         robot.keyRelease(KeyEvent.VK_ALT);
                                        
                          
                    
                     Actions actions = new Actions(driver);
              actions.moveToElement(driver.findElement((By.xpath("//*[@id=\"ordersListGrid\"]/div[2]/table/tbody/tr[1]/td[1]")))).build().perform();
                     actions.doubleClick().build().perform();
 
                     Thread.sleep(5000);
 
                     //RM.takeSS("Screen_CANADA2", driver);
                    
                     TakesScreenshot scrShot =((TakesScreenshot)driver);
 
               //Call getScreenshotAs method to create image file
 
                       File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
 
                   //Move image file to new destination
 
                       File DestFile=new File(System.getProperty("user.dir") + "//Images//Expected//" + "Screen_CANADA2" + ".png");
 
                       //Copy file at destination
 
                       FileUtils.copyFile(SrcFile, DestFile);
                    
                     Thread.sleep(5000);
                     // System.out.println(driver.findElement(By.id("divEbsOrderDocuments")).findElement(By.tagName("div")).getAttribute("data-documenturl"));
 
                    
              System.out.println(driver.findElement(By.id("divEbsOrderDocuments")).findElement(By.tagName("div"))
                                  .getAttribute("data-documenturl"));
                     String url = driver.findElement(By.id("divEbsOrderDocuments")).findElement(By.tagName("div"))
                                  .getAttribute("data-documenturl");
 
                     Thread.sleep(1000);
 
                     driver.get(url);
 
                     // driver.switchTo().window(str[0]);
                     Thread.sleep(6000);
                    
 
                     String path = System.getProperty("user.dir") + "//Images//Expected//" + "Screen_CANADA3" + ".png";
                     Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                     BufferedImage Image = robot.createScreenCapture(capture);
                     ImageIO.write(Image, "png", new File(path));
                     Thread.sleep(5000);
                    
                     robot.mouseMove(15, 70);
                     robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                     robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                     Thread.sleep(2000);
                     robot.keyPress(KeyEvent.VK_ALT); 
         			robot.keyPress(KeyEvent.VK_F);
         			robot.keyRelease(KeyEvent.VK_F);
         			robot.keyRelease(KeyEvent.VK_ALT); 
                     robot.keyPress(KeyEvent.VK_A);
                     robot.keyRelease(KeyEvent.VK_A);
                    
                     Thread.sleep(5000);
                    
                     robot.keyPress(KeyEvent.VK_CONTROL);
                     robot.keyPress(KeyEvent.VK_S);
                     robot.keyRelease(KeyEvent.VK_CONTROL);
                     robot.keyRelease(KeyEvent.VK_S);
                    
                     //String a = "E:\"";
                     String b = "\\Images\\Expected\\";
                     String c = "Screen_CANADA3";
                     String myString = System.getProperty("user.dir") + b +c;
                     StringSelection stringSelection = new StringSelection(myString);
                     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                     clipboard.setContents(stringSelection, null);
                     robot.keyPress(KeyEvent.VK_CONTROL);
               robot.keyPress(KeyEvent.VK_V);
               robot.keyRelease(KeyEvent.VK_CONTROL);
               robot.keyRelease(KeyEvent.VK_V);
                     robot.keyPress(KeyEvent.VK_ENTER);
                     robot.keyRelease(KeyEvent.VK_ENTER);
                     robot.keyPress(KeyEvent.VK_Y);
               robot.keyPress(KeyEvent.VK_Y);
               robot.keyPress(KeyEvent.VK_ENTER);
                     robot.keyRelease(KeyEvent.VK_ENTER);
 
                     Thread.sleep(5000);
                    
                     driver.navigate().back();
                    
                     Thread.sleep(3000);
                    
                     driver.findElement(By.linkText("Home")).click();    
                    
                     Thread.sleep(6000);
 
              } catch (Exception e) {
                     System.out.println("Exception throws" + e.getMessage());
              } finally {
                     JavascriptExecutor js01 = (JavascriptExecutor) driver;
                     js01.executeScript("window.scrollBy(0,-10000)");
              }
       }
 
} 

 
 

 
 
 
 