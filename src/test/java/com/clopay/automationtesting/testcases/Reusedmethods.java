package com.clopay.automationtesting.testcases;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Reusedmethods{
	
	   public void Login(String Username, String Password, WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("txtUserName")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='BtnSubmit']")).click();

	}  
	   public void SitefinityLogin(String Username, String Password, WebDriver driver) throws InterruptedException{
		   driver.findElement(By.id("LoginFormControl_UserName")).sendKeys(Username);
		   Thread.sleep(1000);
		   driver.findElement(By.id("LoginFormControl_Password")).sendKeys(Password);
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//a[@id='LoginFormControl_LoginButton']")).click();

		   
	   }
	   

          
	   public void takeSS(String Filename,WebDriver driver) throws IOException {
               		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(3000)).takeScreenshot(driver);
               	   	ImageIO.write(screenshot.getImage(),"png",new File((System.getProperty("user.dir") + "\\Images\\Expected\\"+Filename+".png")));
               	}
               	
               	
               	
               	/*public void compareSS(String Expected,String Actual,String Difference, WebDriver driver) throws IOException  	{
               	   		
               	   		BufferedImage expectedImage = ImageIO.read(new File((System.getProperty("user.dir") + "\\Images\\Expected\\"+Expected+".png")));
                           Screenshot LogoImageScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(3000)).takeScreenshot(driver);
                           //Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
                              ImageIO.write(LogoImageScreenshot.getImage(),"png",new File((System.getProperty("user.dir") + "\\Images\\Actual\\"+Actual+".png")));
                              BufferedImage actualImage = LogoImageScreenshot.getImage();      
                                  ImageDiffer imgDiff = new ImageDiffer();
                                  ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
                                  BufferedImage diffImage = diff.getMarkedImage();
                                  ImageIO.write(diff.getDiffImage(),"png",new File((System.getProperty("user.dir") + "\\Images\\Difference\\"+Difference+".png")));
                                  Assert.assertFalse(diff.hasDiff(),"Images are equal");
	   	}*/
	   	
	   	
	}


