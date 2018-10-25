package com.clopay.automationtesting.testcases;

import org.testng.annotations.Test;

import com.clopay.automationtesting.basetest.BaseTest;

public class ValidatingAssociatePortalLoginPageFunctionalitiy extends BaseTest{
	@Test(priority=1, enabled=true)
	public void UserLogin(){
	test = extent.createTest("ValidatingAssociatePortalLoginPageFunctionalitiy");
	
	try{
		driver.manage().window().maximize();
		Reusedmethods RM = new Reusedmethods();
		RM.Login("Chirth", "welcome1", driver);
			
		}catch (Exception e) {
		System.out.println("Exception throws"+e.getMessage());
		}
	}
}


