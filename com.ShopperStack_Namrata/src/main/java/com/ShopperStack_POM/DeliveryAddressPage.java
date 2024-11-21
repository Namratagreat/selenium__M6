package com.ShopperStack_POM;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DeliveryAddressPage {
	
	public DeliveryAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		
	}
	
	//@FindBy(xpath = "//input[@type='radio']")
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement addressRBTn;
	
	
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement ProceedRBTn;



	public WebElement getAddressRBTn() {
		return addressRBTn;
	}



	public WebElement getProceedRBTn() {
		return ProceedRBTn;
	}
	
	
	
	

}
