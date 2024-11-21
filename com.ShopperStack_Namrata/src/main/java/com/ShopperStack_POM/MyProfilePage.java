package com.ShopperStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
	
	public MyProfilePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
}
	
	@FindBy(xpath = "//div[text()=\"My Addresses\"]")
	private WebElement MyAddressBEt;
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement AddAddressBet;

	public WebElement getMyAddressBEt() {
		return MyAddressBEt;
	}

	public WebElement getAddAddressBet() {
		return AddAddressBet;
	}
	
	

}
