package com.ShopperStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAdressPage {

public MyAdressPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}	

@FindBy(xpath = "//Button[text()='Add Address']")
private WebElement addAdressBtn;

@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon MuiButton-')])[2]")
private WebElement deleteBtn;

@FindBy(xpath = "//button[text()='Yes']")
private WebElement yesBtn;

public WebElement getAddAdressBtn() {
	return addAdressBtn;
}

public WebElement getDeleteBtn() {
	return deleteBtn;
}

public WebElement getYesBtn() {
	return yesBtn;
}






}
