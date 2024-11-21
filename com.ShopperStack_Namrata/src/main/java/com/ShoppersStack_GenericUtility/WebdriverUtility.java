package com.ShoppersStack_GenericUtility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	JavaUtility javaUtility = new JavaUtility();
	
	
	public void SelectByValue(WebElement element, String value) {
		
		Select st =new Select(element);
		st.selectByValue(value);
		
	}
	
	public void selectByIndex(WebElement ele,int index) {
		
		Select st1=new Select(ele);
		st1.selectByIndex( index);
	}
	
	
	public void selectByVisibleText(WebElement ele1, String visibleindex) {
		
		Select st2=new Select(ele1);
		st2.selectByVisibleText(visibleindex);
		
	}
	
	public void deselectbyvalue(WebElement ele2, String value) {
		
		  Select st3=new Select(ele2);
		  st3.deselectByValue(value);
		  
	}
	
	
	public void deselectbyIndex(WebElement ele3, int value) {
		Select st4=new Select(ele3);
		st4.selectByIndex(value);
		
		
	}
	
	public void deselectbyvisibleText(WebElement ele3, String value) {
		
		Select st5=new Select(ele3);
		st5.deselectByValue(value);
		
		
		
	}
	
	
	public void WebpageScreenshot(WebDriver driver) throws IOException {
		
	TakesScreenshot ts=(TakesScreenshot) driver;	
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(FramworkConstants.screenshotpath+javaUtility.DateAndTime()+".png");
	FileHandler.copy(temp, dest);
	
		
	}
	
	
	public void webelementScreenshot(WebElement ele) throws IOException {
		
			
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File dest=new File(FramworkConstants.screenshotpath+javaUtility.DateAndTime()+".png");
		FileHandler.copy(temp, dest);
	}
	
	
	public void javascriptexcuterScrollINtoview(WebDriver driver , WebElement ele) {
		
   
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
