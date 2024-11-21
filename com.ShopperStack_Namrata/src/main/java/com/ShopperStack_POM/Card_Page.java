package com.ShopperStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Card_Page {
	
	public Card_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeSmall MuiButton-textSizeSmall  css-1bhvu8')]")
	 private WebElement RemoveFromCard;

	public WebElement getRemoveFromCard() {
		return RemoveFromCard;
	}
	@FindBy(xpath = "//span[text()='Buy Now']")
	private WebElement BuyNowBtn;

	public WebElement getBuyNowBtn() {
		return BuyNowBtn;
	}
	
	@FindBy(xpath = "//span[text()='Continue Shopping']")
	private WebElement continueshoppingBtn;

	public WebElement getContinueshoppingBtn() {
		return continueshoppingBtn;
	}
	
	
	
	
	
	
	

}
