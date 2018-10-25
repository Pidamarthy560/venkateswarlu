package com.clopay.automationtesting.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.clopay.automationtesting.basetest.BaseTest;

public class ValidatingAssociatePortalManageUsersPageFunctionality extends BaseTest {
	@Test(priority=4, enabled=true)
	public void AssociatePortalManageUsers(){
	test = extent.createTest("ValidatingAssociatePortalManageUsersPageFunctionalitiy");
	
	try{
		
		driver.findElement(By.xpath("//a[text()='Manage Users']")).click();
		Thread.sleep(5000);
		Reusedmethods RM = new Reusedmethods();
		//RM.Login("rveguru", "welcome1", driver);
		RM.takeSS("ManageUsers",driver); 		
  			//RM.compareSS("ManageUsers", "ManageUsers", "ManageUsers", driver);
		   
			
		}catch (Exception e) {
		System.out.println("Exception throws"+e.getMessage());
		}
	finally {
		JavascriptExecutor js01 = (JavascriptExecutor)driver;
		js01.executeScript("window.scrollBy(0,-10000)");
	}
	}
	@Test(priority=5, enabled=true)
	public void AssociatePortalManageSupervisors(){
	test = extent.createTest("ValidatingAssociatePortalManageSupervisorsPageFunctionalitiy");
	
	try{
		
	   driver.findElement(By.linkText("Manage Supervisors")).click();
		Thread.sleep(5000);
		Reusedmethods RM = new Reusedmethods();
		//RM.Login("rveguru", "welcome1", driver);
		RM.takeSS("ManageSupervisors",driver); 		
  			//RM.compareSS("ManageSupervisors", "ManageSupervisors", "ManageSupervisors", driver);
		   
			
		}catch (Exception e) {
		System.out.println("Exception throws"+e.getMessage());
	}
	
	}
	
@Test(priority=6, enabled=true)
public void AssociatePortalContactUs(){
test = extent.createTest("ValidatingAssociatePortalContactUsPageFunctionalitiy");

try{
        driver.findElement(By.linkText("Home")).click();
		Thread.sleep(8000);
	driver.findElement(By.xpath("//a[@id='asstContactUs']")).click();
	Reusedmethods RM = new Reusedmethods();
	//RM.Login("rveguru", "welcome1", driver);

	 String mainWindowHandle=driver.getWindowHandle();
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
		                      RM.takeSS("ContactUs",driver);
			              driver.close();
		                 }
		                 
		            }
		         driver.switchTo().window(mainWindowHandle );
		         driver.findElement(By.linkText("Home")).click();
		 		Thread.sleep(5000);

		} catch (Exception e) {
System.out.println("Exception throws"+e.getMessage());
} 
	finally {
	JavascriptExecutor js01 = (JavascriptExecutor)driver;
	js01.executeScript("window.scrollBy(0,-10000)");
}

}
}