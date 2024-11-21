package com.ShopperStack_testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShopperStack_POM.HomePage;
import com.ShopperStack_POM.MyAdressPage;
import com.ShopperStack_POM.MyProfilePage;
import com.ShoppersStack_GenericUtility.BaseTest;

public class Tc_002_User_AbleToDelateAddress_Or_Not_Test extends BaseTest{
	
	@Test
	public void DelateAddress() throws InterruptedException, IOException {
	
		homepage.getAccountSetting().click();
		homepage.getMyProfileBet().click();

		MyProfilePage profilepage = new MyProfilePage(driver);
		profilepage.getMyAddressBEt().click();

		MyAdressPage address = new MyAdressPage(driver);
		address.getDeleteBtn().click();
		
		Thread.sleep(2000);
		address.getYesBtn().click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    webdriverdriverutility.WebpageScreenshot(driver);
	    //Thread.sleep(2000);
	    
	    
	
		
		
		

		
		
		
	}
	
	
	
	

}
