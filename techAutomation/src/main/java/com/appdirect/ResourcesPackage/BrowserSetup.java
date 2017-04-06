package com.appdirect.ResourcesPackage;

import java.io.FileNotFoundException;
import org.openqa.selenium.WebDriver;
import com.appdirect.UtilsPackage.BrowserUtil;

//Setup for all the Browser

public class BrowserSetup {
	
	static WebDriver driver;
    static BrowserUtil browser ;
	
public static WebDriver startBrowser(String browserName) throws FileNotFoundException{
	
	if(browserName.equalsIgnoreCase("firefox")){
		driver =BrowserUtil.firefoxBrowser();	
	}
	else if(browserName.equalsIgnoreCase("chrome")){
		driver = BrowserUtil.chromeBrowser();
	}
	else if(browserName.equalsIgnoreCase("Safari")){
		driver =BrowserUtil.safariBrowser();
	}
	else{
		driver = BrowserUtil.chromeBrowser();
	}
	return driver;
	
}
}
