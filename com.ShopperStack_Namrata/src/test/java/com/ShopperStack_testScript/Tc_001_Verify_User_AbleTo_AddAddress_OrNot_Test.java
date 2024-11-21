package com.ShopperStack_testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStack_POM.AddressFormPage;
import com.ShopperStack_POM.MyAdressPage;
import com.ShopperStack_POM.MyProfilePage;
import com.ShoppersStack_GenericUtility.BaseTest;
import com.ShoppersStack_GenericUtility.FileUtility;

public class Tc_001_Verify_User_AbleTo_AddAddress_OrNot_Test extends BaseTest {

	@Test
	public void AddAddress() throws EncryptedDocumentException, IOException {

		homepage.getAccountSetting().click();
		homepage.getMyProfileBet().click();

		MyProfilePage profilepage = new MyProfilePage(driver);
		profilepage.getMyAddressBEt().click();

		MyAdressPage address = new MyAdressPage(driver);
		address.getAddAdressBtn().click();

		AddressFormPage formpage = new AddressFormPage(driver);

		formpage.getHome().click();
		formpage.getNmaeField().sendKeys(file.ReadExclFile("sheet1", 1, 0));
		formpage.getHouseOfficeField().sendKeys(file.ReadExclFile("sheet1", 1, 1));
		formpage.getStressInfoField().sendKeys(file.ReadExclFile("sheet1", 1, 2));
		formpage.getLnadmarkField().sendKeys(file.ReadExclFile("sheet1", 1, 3));
		webdriverdriverutility.SelectByValue(formpage.getCountryField(), file.readpropertyFile("country"));
		webdriverdriverutility.SelectByValue(formpage.getStateCityField(), file.readpropertyFile("state"));
		webdriverdriverutility.SelectByValue(formpage.getCityField(), file.readpropertyFile("city"));

		formpage.getPincodeField().sendKeys(file.ReadExclFile("Sheet1", 1, 4));
		formpage.getPhonenoField().sendKeys(file.ReadExclFile("Sheet1", 1, 5));

		formpage.getADDAdressField().click();
		webdriverdriverutility.WebpageScreenshot(driver);

	}

}
