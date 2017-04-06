
package com.appdirect.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import com.appdirect.ResourcesPackage.WaitClass;
import junit.framework.Assert;

/**
 * @author kanchan.sharma
 * Appdirect Home page
 */
public class Homepage {
	WebDriver driver;
	WaitClass wait =new WaitClass();
	
	public Homepage(WebDriver driver){
		this.driver= driver;		
	}
	
    public void verifyHomepage(){  
       Reporter.log("AppDirect HomePage",true);
       Assert.assertTrue(driver.getTitle().contains("AppDirect")); 
       }
   
    public void pagename(String pagename){
	   driver.get(pagename);
	   wait.waitCalling(driver); 	   
   }
  
	 public void clickOnLoginButton(String getGetLoginButtonPath){
		driver.findElement(By.xpath(getGetLoginButtonPath)).click();
	}
	
 
      
      
	
}
