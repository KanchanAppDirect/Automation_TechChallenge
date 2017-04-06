package com.appdirect.UtilsPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;

public class BrowserUtil {
	
	static Properties browserProperties = new Properties();
	static FileInputStream input =null;
	static WebDriver driver=null;
	
	public static WebDriver chromeBrowser() throws FileNotFoundException
	{
		try {
		Reporter.log("Chrome Browser",true);
		File fl = new File("/Users/kanchan.sharma/Documents/workspace/techAutomation/src/main/java/com/appdirect/UtilsPackage/browserDetails.properties");
		input = new FileInputStream(fl);
		browserProperties.load(input);
		System.setProperty(browserProperties.getProperty("chromeDrivername"),browserProperties.getProperty("chromePath"));
		driver=new ChromeDriver();
	}
	   catch(Exception e){
			e.printStackTrace();
	}
		return driver;
}
	
	public static WebDriver firefoxBrowser() throws FileNotFoundException
	{
		try {
		Reporter.log("Chrome Browser",true);
		File fl = new File("/Users/kanchan.sharma/Documents/workspace/techAutomation/src/main/java/com/appdirect/UtilsPackage/browserDetails.properties");
		input = new FileInputStream(fl);
		browserProperties.load(input);
		System.setProperty(browserProperties.getProperty("firefoxDrivername"),browserProperties.getProperty("firefoxpath"));
		DesiredCapabilities capabilities=DesiredCapabilities.safari();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);
	}
	   catch(Exception e){
			e.printStackTrace();
	}
		return driver;
}
	
	public static WebDriver safariBrowser() throws FileNotFoundException
	{
		try {
		Reporter.log("Chrome Browser",true);	
		File fl = new File("/Users/kanchan.sharma/Documents/workspace/techAutomation/src/main/java/com/appdirect/UtilsPackage/browserDetails.properties");
		input = new FileInputStream(fl);
		browserProperties.load(input);
		System.setProperty(browserProperties.getProperty("safariDrivername"),browserProperties.getProperty("safariPath"));
		DesiredCapabilities capabilities=DesiredCapabilities.safari();
        capabilities.setCapability("marionette", true);
        driver = new SafariDriver(capabilities);
	}
	   catch(Exception e){
			e.printStackTrace();
	}
		return driver;
}
}
