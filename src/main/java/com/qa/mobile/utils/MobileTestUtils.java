package com.qa.mobile.utils;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.mobile.base.MobileBase;

public class MobileTestUtils extends MobileBase {
	
	public static long IMPLICIT_WAIT=20;

	
	// to kill all active nodes in the commandPrompt 
public static void killAllNodes()
{
	try{
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
	}
	catch(Exception e)
	{
		System.out.println("cause is"+" "+e.getCause());
		System.out.println("message is"+" "+e.getMessage());
		e.printStackTrace();
	}
		
	}

	
	//to start/stop appium server automatically
	
public  boolean checkIfServerIsRunnning(int port) {
		
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			
			serverSocket.close();
		} catch (IOException e) {
			//If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}
	
	
	
	public static void StaticWait()
	{
		try{Thread.sleep(5000);}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
	public static void takeScreenshotAtEndOfTest(String s) throws IOException
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + s + ".png"));
	
	
	}
}


