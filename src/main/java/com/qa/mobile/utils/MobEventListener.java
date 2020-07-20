package com.qa.mobile.utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.mobile.base.MobileBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.events.api.general.AppiumWebDriverEventListener;

public class MobEventListener extends MobileBase implements AppiumWebDriverEventListener {				
		
		public void beforeNavigateTo(String url, AppiumDriver driver) {		
			System.out.println("Before navigating to: '" + url + "'");	
		}		
				
		public void afterNavigateTo(String url, AppiumDriver driver) {		
			System.out.println("Navigated to:'" + url + "'");	
		}		
				
		public void beforeChangeValueOf(WebElement element, AppiumDriver driver) {		
			System.out.println("Value of the:" + element.toString() + " before any changes made");	
		}		
				
		public void afterChangeValueOf(WebElement element, AppiumDriver driver) {		
			System.out.println("Element value changed to: " + element.toString());	
		}		
				
		public void beforeClickOn(WebElement element, AppiumDriver driver) {		
			System.out.println("Trying to click on: " + element.toString());	
		}		
				
		public void afterClickOn(WebElement element, AppiumDriver driver) {		
			System.out.println("Clicked on: " + element.toString());	
		}		
				
		public void beforeNavigateBack(AppiumDriver driver) {		
			System.out.println("Navigating back to previous page");	
		}		
				
		public void afterNavigateBack(AppiumDriver driver) {		
			System.out.println("Navigated back to previous page");	
		}		
				
		public void beforeNavigateForward(AppiumDriver driver) {		
			System.out.println("Navigating forward to next page");	
		}		
				
		public void afterNavigateForward(AppiumDriver driver) {		
			System.out.println("Navigated forward to next page");	
		}		
				
		public void onException(Throwable error, AppiumDriver driver) {		
			System.out.println("Exception occured: " + error);	
		}		
				
		public void beforeFindBy(By by, WebElement element, AppiumDriver driver) {		
			System.out.println("Trying to find Element By : " + by.toString());	
		}		
				
		public void afterFindBy(By by, WebElement element, AppiumDriver driver) {		
			System.out.println("Found Element By : " + by.toString());	
		}		
				
		/*		
		 * non overridden methods of WebListener class		
		 */		
		public void beforeScript(String script, AppiumDriver driver) {		
		}		
				
		public void afterScript(String script, AppiumDriver driver) {		
		}		
				
		public void beforeAlertAccept(AppiumDriver driver) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public void afterAlertAccept(AppiumDriver driver) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public void afterAlertDismiss(AppiumDriver driver) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public void beforeAlertDismiss(AppiumDriver driver) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public void beforeNavigateRefresh(AppiumDriver driver) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public void afterNavigateRefresh(AppiumDriver driver) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public void beforeChangeValueOf(WebElement element, AppiumDriver driver, CharSequence[] keysToSend) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public void afterChangeValueOf(WebElement element, AppiumDriver driver, CharSequence[] keysToSend) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public void afterGetText(WebElement arg0, AppiumDriver arg1, String arg2) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public void afterSwitchToWindow(String arg0, AppiumDriver arg1) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public void beforeGetText(WebElement arg0, AppiumDriver arg1) {		
			// TODO Auto-generated method stub	
				
		}		
				
		public void beforeSwitchToWindow(String arg0, AppiumDriver arg1) {		
			// TODO Auto-generated method stub	
				
		}

		@Override
		public void beforeAlertAccept(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterAlertAccept(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeNavigateTo(String url, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterNavigateTo(String url, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeNavigateBack(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterNavigateBack(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeNavigateForward(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterNavigateForward(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeFindBy(By by, WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterFindBy(By by, WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeClickOn(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterClickOn(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeScript(String script, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterScript(String script, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeSwitchToWindow(String windowName, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterSwitchToWindow(String windowName, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onException(Throwable throwable, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeGetText(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterGetText(WebElement element, WebDriver driver, String text) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeChangeValueOf(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterChangeValueOf(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}		
				
	}			

	
	


