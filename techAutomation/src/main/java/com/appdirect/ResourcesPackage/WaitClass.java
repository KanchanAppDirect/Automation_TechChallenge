package com.appdirect.ResourcesPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WaitClass {
	
	public void waitCalling(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
