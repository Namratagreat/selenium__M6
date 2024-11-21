package com.ShopperStack_POM;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[contains(@class,'BaseBadge-badge MuiBadge')]")
	private WebElement accountSetting;
	
	
	@FindBy(xpath = "//li[contains(@class,'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz')][1]")
	private WebElement MyProfileBet;
	
	@FindBy(id = "cart")
	private WebElement cardBtn;
	
	
	
	public WebElement getCardBtn() {
		return cardBtn;
	}
	
	@FindBy(xpath = "//span[text()='FOREVER21']/../../../div[3]/div[2]")
	private WebElement addToCard;
	
	 public WebElement getAddToCard() {
		return addToCard;
	}
	 @FindBy(xpath = "//h1[text()='Featured Products']")
	 private WebElement featuredproduct;
	 
	 
	 
	public WebElement getFeaturedproduct() {
		return featuredproduct;
	}
	@FindBy(xpath = "//li[contains(@class,'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz')][6]")
     private WebElement LogoutBet;
	


	public WebElement getAccountSetting() {
		return accountSetting;
	}


	public WebElement getMyProfileBet() {
		return MyProfileBet;
	}


	public WebElement getLogoutBet() {
		return LogoutBet;
	}
	
	
}
