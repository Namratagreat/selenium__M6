package com.ShopperStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPgae {
	
	public LoginPgae(WebDriver driver) {
	PageFactory.initElements(driver, this);	
		
		
	}
	
	@FindBy(id="Email")
	private WebElement EmailTextfield;
	
	
	@FindBy(id="Password")
	private WebElement passTextField;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginBEt;

	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}

	public WebElement getPassTextField() {
		return passTextField;
	}

	public WebElement getLoginBEt() {
		return loginBEt;
	}
	
}
