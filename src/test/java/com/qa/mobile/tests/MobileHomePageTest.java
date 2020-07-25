package com.qa.mobile.tests;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mobile.base.MobileBase;
import com.qa.mobile.pages.MobileAccessibilityPage;
import com.qa.mobile.pages.MobileHomePage;
import com.qa.mobile.utils.MobileTestUtils;

public class MobileHomePageTest extends MobileBase
{
	MobileHomePage MHomePage;
	MobileAccessibilityPage MAccesibilityPage;
	File dir;
	File app;
	
	
	public MobileHomePageTest()
	{ //calling super class constructor (Properties file from TEstBase)
		super();
	}
    @BeforeMethod
	public void SetUp()
	{
    	
    	//to kill all the task from the commandPrompt, to make sure the port 4723 is free
    	MobileTestUtils.killAllNodes();
    	service=startAppiumServer();
    	Initialization();
    	
    	MHomePage = new MobileHomePage();
    	
    	//MAccesibilityPage = new MobileAccessibilityPage();
    	
	}
    
    @Test(priority=1)
    public void VerifyHomePage()
    {
    	
    	System.out.println("This is first test");
    	//MHomePage.ValidateHomePage();
    	
    	
    }
	/*
	 * @Test(priority=2) public void clickingOnAccessiblity() {
	 * MHomePage.clickingOnAccessibility(); }
	 */
    
    @Test(priority=2)
    public void clickingOnAccessiblity()
    { MHomePage.Accessibility();
    	
    }
    
    
    @AfterMethod
    public void TearDown()
    {
    	service.stop();
    }
	
	
}
