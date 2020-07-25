package com.qa.mobile.base;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.qa.mobile.utils.MobileTestUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBase {
	
	public static AndroidDriver<AndroidElement> driver;
	public static File dir;
	public static File app;
	public static Properties prop;
	
	MobileTestUtils utils = new MobileTestUtils();
	
	public void Initialization()
	{
		
		
		
		try
		{   prop = new Properties();
				FileInputStream ip = new FileInputStream("src\\main\\java\\config.properties");
				prop.load(ip);
		}
		catch(Exception e)
		{
			System.out.println("cause is"+" "+e.getCause());
			System.out.println("message is"+" "+e.getMessage());
			e.printStackTrace();
		}
		
		File dir = new File("src/main/java");
		File app= new File(dir,prop.getProperty("apk_file"));
		 
		//File app= new File(dir,prop.getProperty("Browser_exe"));
		
	try {	DesiredCapabilities ds= new DesiredCapabilities();
		
		
		//ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("device_Name"));
		ds.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//ds.setCapability(MobileCapabilityType.BROWSER_NAME, prop.getProperty("browser_Name"));
		
		
		URL url= new URL (prop.getProperty("appiumServerURL"));
		driver = new AndroidDriver<AndroidElement>(url,ds);
		driver.manage().timeouts().implicitlyWait(utils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("url"));
	}
	
	catch(Exception e)
	{
		System.out.println("cause is"+" "+e.getCause());
		System.out.println("message is"+" "+e.getMessage());
		e.printStackTrace();
	}
		
		
		
	}

}
