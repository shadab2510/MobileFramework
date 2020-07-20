package com.qa.mobile.tests;

import java.io.File;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.mobile.base.MobileBase;
import com.qa.mobile.pages.MobileHomePage;

public class MobileHomePageTest extends MobileBase
{
	MobileHomePage MHomePage;
	File dir;
	File app;
	
	public MobileHomePageTest()
	{ //calling super class constructor (Properties file from TEstBase)
		super();
	}
    @BeforeTest
	public void SetUp()
	{
    	Initialization();
    	
    	//MHomePage = new MobileHomePage();
	}
    
    @Test(priority=1)
    public void VerifyHomePage()
    {
    	
    	System.out.println("This is first test");
    	//MHomePage.ValidateHomePage();
    	
    }
    @Test(priority=2)
    public void clickingOnAccessiblity()
    {
    	MHomePage.Accessibility();
    }
    
    
    @AfterTest
    public void TearDown()
    {
    	
    }
	
	
}
