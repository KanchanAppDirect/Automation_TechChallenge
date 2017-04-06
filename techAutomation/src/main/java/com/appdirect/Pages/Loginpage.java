package com.appdirect.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.appdirect.ResourcesPackage.WaitClass;

public class Loginpage {
		WebDriver driver;
		WaitClass wait =new WaitClass();

	public Loginpage (WebDriver driver){
		this.driver= driver;		
	}
	
	public void clickOnSignupButton(String getGetSignupButtonPath){
		driver.findElement(By.xpath(getGetSignupButtonPath)).click();
		wait.waitCalling(driver); 
		
	}

	public void verifyLoginpage() {
		   Reporter.log("AppDirect LoginPage",true);
		  // Assert.assertTrue(driver.getTitle().contains("AppDirect"));
		
	}


}
