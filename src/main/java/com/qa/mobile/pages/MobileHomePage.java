package com.qa.mobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mobile.base.MobileBase;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class MobileHomePage extends MobileBase {

	
	@FindBy(xpath="//android.widget.TextView[text()='API Demos']")
	public WebElement APIDemos;
	
	/*
	 * @AndroidFindBy(xpath="//android.widget.TextView[@text='Accessibility']")
	 * public WebElement Accessibility;
	 */
	
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Animation']")
	public WebElement Animation;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='App']")
	public WebElement App;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Content']")
	public WebElement Content;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Graphics']")
	public WebElement Graphics;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Media']")
	public WebElement Media;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='NFC']")
	public WebElement NFC;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='OS']")
	public WebElement OS;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement Preference;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Text']")
	public WebElement Text;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Views']")
	public WebElement Views;
	
	
	public  void Accessibility()
	{
		driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility']")).click();
	}
	
	public MobileHomePage()
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void MobileWeb()
	{
		
	}
	
	public boolean  ValidateHomePage()
	{
		return APIDemos.isDisplayed();
	}
	
	/*
	 * public MobileAccessibilityPage clickingOnAccessibility() {
	 * Accessibility.click(); return new MobileAccessibilityPage(); }
	 */
	
	
	public MobileViewsPage clickingOnViews()
	{
		Views.click();
		return new MobileViewsPage();
	}
	
	
}
