package com.ShoppersStack_GenericUtility;

import java.io.IOException;
import java.time.Duration;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShopperStack_POM.HomePage;
import com.ShopperStack_POM.LoginPgae;
import com.ShopperStack_POM.WelcomePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {

	public FileUtility file=new FileUtility();
	
	public WebDriver driver;
	public static WebDriver sdriver;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	public ExtentReports reporter;
	public WelcomePage welcomePage;
	public HomePage homepage;
	public LoginPgae loginpage;
	public JavaUtility javaUtility = new JavaUtility();
	public WebDriverWait wait;
	public WebdriverUtility webdriverdriverutility=new WebdriverUtility();
	
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
		
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("@BeforeTest");
		
		 spark = new ExtentSparkReporter(FramworkConstants.extentReportpath+javaUtility.DateAndTime()+".html");
		
		reporter = new ExtentReports();
		reporter.attachReporter(spark);
		
	}

	@BeforeClass
	public void BeforeClass1() throws IOException {
		
		 System.out.println("@BeforeClass");
		 
		 String Browser = file.readpropertyFile("Browser");
		 String url = file.readpropertyFile("url");
		 
		// String url = System.getProperty("url");
		 
		 
		// String Browser="chrome";
		 
		 if (Browser.contains("chrome")) {
			 driver=new ChromeDriver();
		}
		 
		 else if (Browser.contains("Firefox")) {
			 driver=new FirefoxDriver(); 
			
		}
		 else if (Browser.contains("Edge")) {
			 
	      driver=new EdgeDriver(); 
			
		}
		 else {
			 
			 System.out.println("Enter valid Browser Name");
		 }
			 
		 sdriver= driver;
		 homepage =new HomePage(driver);
			 
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	       driver.get(url);
		 
		 
	 }
	
	@BeforeMethod
	public void BeforeClass() throws IOException, InterruptedException {
		
		System.out.println("@BeforeMethod");
		
	 String username = file.readpropertyFile("username");
	 String password = file.readpropertyFile("password");
	 
	 welcomePage=new WelcomePage(driver);
	 
	 wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	 wait.until(ExpectedConditions.elementToBeClickable(welcomePage.getLoginBET()));
	 Thread.sleep(3000);
	 
		welcomePage.getLoginBET().click();
		 
		
		loginpage = new LoginPgae(driver);
		loginpage.getEmailTextfield().sendKeys(username);
		loginpage.getPassTextField().sendKeys(password);
		loginpage.getLoginBEt().click();
		
	}


	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		System.out.println("@AfterMethod");
		Thread.sleep(5000);
		homepage.getAccountSetting().click();
		homepage.getLogoutBet().click();;
		
		
	}
		
	@AfterClass

	public void AfterClass() throws InterruptedException {
		System.out.println("@AfterClass");
		Thread.sleep(3000);
		driver.quit();
	}	

	@AfterTest
	public void AfterTest() {
		System.out.println("@AfterTest");
		
		reporter.flush();
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("@AfterSuite");
	}
		
		
		
	
	
}
