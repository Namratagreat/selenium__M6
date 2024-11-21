package com.ShopperStack_POM;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PyementMethodPage {

	public PyementMethodPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//input[@name='radio-buttons-group'])[2]")
	private WebElement cashondeliveryRBtn;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proccedBtn;

	public WebElement getCashondeliveryRBtn() {
		return cashondeliveryRBtn;
	}

	public WebElement getProccedBtn() {
		return proccedBtn;
	}
	
}
