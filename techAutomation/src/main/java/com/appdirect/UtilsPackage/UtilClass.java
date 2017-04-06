package com.appdirect.UtilsPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

public class UtilClass {
	
	Properties properties = new Properties();
	InputStream input = null;
	
	String pagename;
	String getLoginButtonPath;
	String getGetSignupButtonPath;
	String EmailPath;
    String EmailId;
    String getSignUpPath;

	public void homepageUtil() throws Exception {
		try{	
			File file = new File("/Users/kanchan.sharma/Documents/workspace/techAutomation/src/main/java/com/appdirect/UtilsPackage/homepage.properties");
			input = new FileInputStream(file);
			properties.load(input);		
            pagename =properties.getProperty("pagename");
            getLoginButtonPath = properties.getProperty("loginButtonXpath");
		  }
	     catch(Exception e) {	    	   
		     e.printStackTrace();			   
	     }
           }
	
	public void loginpageUtil() throws Exception{
		try{
			File file = new File("/Users/kanchan.sharma/Documents/workspace/techAutomation/src/main/java/com/appdirect/UtilsPackage/loginpage.properties");
			input = new FileInputStream(file);
			properties.load(input);	
			getGetSignupButtonPath=properties.getProperty("signUpButtonXpath");
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	      }
	
   public void signuppageUtil() throws Exception{
	   try{
		   File file = new File("/Users/kanchan.sharma/Documents/workspace/techAutomation/src/main/java/com/appdirect/UtilsPackage/signuppage.properties");
		   input = new FileInputStream(file);
		   properties.load(input);
               EmailPath= properties.getProperty("emailXpath");
               Random rand = new Random(); 
               EmailId = rand.nextInt()+properties.getProperty("emailId");
               getSignUpPath= properties.getProperty("signUpXPath2");
	      }
	   catch(Exception e){
		   e.printStackTrace();
	   }
	     }        
	
	public String getEmailId() {
		return this.EmailId;
	}

	public  String getEmailPath() {
		return this.EmailPath;
	}

	public  String getGetSignUpPath() {
		return this.getSignUpPath;
	}


	public String getPagename() {
		return this.pagename;
	}

	public String getGetLoginButtonPath() {
		return this.getLoginButtonPath;
	}

	public  String getGetSignupButtonPath() {
		
		return this.getGetSignupButtonPath;
	}
	
}
