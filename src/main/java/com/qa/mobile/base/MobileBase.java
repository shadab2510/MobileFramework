package com.qa.mobile.base;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBase {
	
	public static AppiumDriver<AndroidElement> driver;
	public static File dir;
	public static File app;
	
	public void Initialization()
	{
		
		File dir = new File("src/main/java");
		//File app= new File(dir,"ApiDemos-debug.apk");
		File app= new File(dir,"chromedriver.exe");
		
	try {	DesiredCapabilities ds= new DesiredCapabilities();
		
		
		//ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		//ds.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		ds.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//ds.setCapability(MobileCapabilityType., value);
		
		URL url= new URL ("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<AndroidElement>(url,ds);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://traveltriangle.com");
	}
	
	catch(Exception e)
	{
		System.out.println("cause is"+" "+e.getCause());
		System.out.println("message is"+" "+e.getMessage());
		e.printStackTrace();
	}
		
		
		
	}

}
