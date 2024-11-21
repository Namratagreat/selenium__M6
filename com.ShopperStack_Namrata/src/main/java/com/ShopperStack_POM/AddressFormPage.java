package com.ShopperStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage {

	public AddressFormPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="Home")
	private WebElement Home;
	
	
	public WebElement getHome() {
		return Home;
	}

	public void setHome(WebElement home) {
		Home = home;
	}
	@FindBy(id="Name")
	private WebElement NmaeField;
	
	@FindBy(id = "House/Office Info")
	private WebElement HouseOfficeField;
	
	
	@FindBy(id = "Street Info")
	private WebElement StressInfoField;
	
	@FindBy(id ="Landmark")
	private WebElement LnadmarkField;
	
	@FindBy(id = "Country")
	private WebElement CountryField;
	
	@FindBy(id = "State")
	private WebElement StateCityField;
	
	@FindBy(id = "City")
	private WebElement CityField;
	
	@FindBy(id = "Pincode")
	private WebElement pincodeField;
	
	@FindBy(id = "Phone Number")
	private WebElement phonenoField;
	
	@FindBy( xpath =  "//button[text()='Add Address']")
	private WebElement ADDAdressField;

	public WebElement getNmaeField() {
		return NmaeField;
	}

	public WebElement getHouseOfficeField() {
		return HouseOfficeField;
	}

	public WebElement getStressInfoField() {
		return StressInfoField;
	}

	public WebElement getLnadmarkField() {
		return LnadmarkField;
	}

	public WebElement getCountryField() {
		return CountryField;
	}

	public WebElement getStateCityField() {
		return StateCityField;
	}

	public WebElement getCityField() {
		return CityField;
	}

	public WebElement getPincodeField() {
		return pincodeField;
	}

	public WebElement getPhonenoField() {
		return phonenoField;
	}

	public WebElement getADDAdressField() {
		return ADDAdressField;
	}
	
	
}
