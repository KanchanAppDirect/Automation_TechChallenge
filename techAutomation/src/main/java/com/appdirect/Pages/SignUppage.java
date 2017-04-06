package com.appdirect.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.appdirect.ResourcesPackage.WaitClass;

import junit.framework.Assert;

public class SignUppage {
	WebDriver driver;
	WaitClass wait =new WaitClass();

	public SignUppage(WebDriver driver){
		this.driver= driver;		
	}
	
	public void signUpMethod(String getEmailPath,String EmailId,String GetSignUpPath){
	          WebElement element =driver.findElement(By.xpath(getEmailPath));
	             element.sendKeys(EmailId); 
	             wait.waitCalling(driver); 
	             driver.findElement(By.xpath(GetSignUpPath)).click();
	}


	public void verifySignuppage() {
		   Reporter.log("AppDirect SignUp Page",true);  
		   wait.waitCalling(driver); 
		   
	       //Assert.assertTrue(driver.getTitle().contains("AppDirect"));
		
	}

}
