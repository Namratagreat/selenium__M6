package com.ShopperStack_testScript;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ShopperStack_POM.Card_Page;
import com.ShopperStack_POM.DeliveryAddressPage;
import com.ShopperStack_POM.PyementMethodPage;
import com.ShoppersStack_GenericUtility.BaseTest;

public class Tc__003_UserAbleTo_OrderdProduct_OR_Not extends BaseTest {
	
	@Test
	
	public void OrdedOrder() throws InterruptedException, IOException {
		
	webdriverdriverutility.javascriptexcuterScrollINtoview(driver, homepage.getFeaturedproduct());	
	
	Thread.sleep(2000);
	homepage.getAddToCard().click();
	homepage.getCardBtn().click();
	
	Card_Page cardpage=new Card_Page(driver);
	Thread.sleep(2000);
    cardpage.getBuyNowBtn().click();	
    
    
	DeliveryAddressPage deliverpage=new DeliveryAddressPage(driver);
	deliverpage.getAddressRBTn().click();
	
	webdriverdriverutility.javascriptexcuterScrollINtoview(driver, deliverpage.getProceedRBTn());
	deliverpage.getProceedRBTn().click();
   PyementMethodPage pyepage=new PyementMethodPage(driver);
   pyepage.getCashondeliveryRBtn().click();
   pyepage.getProccedBtn().click();
   
   Thread.sleep(2000);
   
   webdriverdriverutility.WebpageScreenshot(driver);
   
	
	
	
   
	
		 
	}
	
		
		
		
	}


