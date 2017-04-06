package com.appdirect.TestPackage;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.appdirect.Pages.Homepage;
import com.appdirect.Pages.Loginpage;
import com.appdirect.Pages.SignUppage;
import com.appdirect.ResourcesPackage.BrowserSetup;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.UtilClass;


public class HomePageTest {
	UtilClass util =new UtilClass();
	WaitClass wait =new WaitClass();
	WebDriver driver=null;
	
	@BeforeClass
	public void setupBrowser() throws Exception{
		try{
			Reporter.log("Browsers Options :: ",true);
			Reporter.log("Firefox",true);
			Reporter.log("Chrome",true);
			Reporter.log("Safari",true);
			
			Scanner sc=new Scanner(System.in);
			String browserName=sc.next();
			
	        driver = BrowserSetup.startBrowser(browserName);
	     	driver.manage().window().maximize();
			
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	

	  @Test  
	  public void openHomePage() throws Exception {	
		  try{
		  Homepage home =PageFactory.initElements(driver, Homepage.class); 
		  util.homepageUtil();
		  home.pagename(util.getPagename());
		  home.verifyHomepage();
		  home.clickOnLoginButton(util.getGetLoginButtonPath());
	}
	    catch(Exception e){
	    	e.printStackTrace();
	    }
	  }
		
	  @Test
	  public void openLoginPage() throws Exception {
		  try{
	     Loginpage  login =PageFactory.initElements(driver, Loginpage.class);
	     util.loginpageUtil();
	     login.verifyLoginpage();
		 login.clickOnSignupButton(util.getGetSignupButtonPath());
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
	  }
		  
     @Test
    	 public void opensignupPage() throws Exception {
    	 try {
		  SignUppage signUp =PageFactory.initElements(driver, SignUppage.class);
		  util.signuppageUtil();
		  signUp.verifySignuppage();
		  signUp.signUpMethod(util.getEmailPath(),util.getEmailId(),util.getGetSignUpPath());		
	      }
		 catch(Exception e){
			e.printStackTrace();
		}
}
     
     @AfterClass
     public void closeDriver() throws Exception{
    	 try{
    		 driver.close();
    	 }
    	 catch(Exception e){
    		 e.printStackTrace();
    	 }
     }
	
}