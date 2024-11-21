package com.ShoppersStack_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUtility implements ITestListener
{
	JavaUtility javaUtility = new JavaUtility();
	
	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) BaseTest.sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(FramworkConstants.screenshotpath+javaUtility.DateAndTime()+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}