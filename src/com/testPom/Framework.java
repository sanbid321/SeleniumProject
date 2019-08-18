package com.testPom;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.bridj.ann.Optional;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import dataprovider_demo.ExcelUtility2;

public class Framework extends PropertiesHelperinfo {

	WebDriver driver = null;
	public Framework() throws Exception {
		super();
	}

	@Parameters({"browserName"})
	@BeforeClass
	public void setup(String browserName) {

//		driver = new ChromeDriver();
		
		driver = DriverHelper.driverHelper(browserName);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(properties.getProperty("pagewait")), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(properties.getProperty("implicitwait")), TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(properties.getProperty("url"));
	}

	@BeforeMethod
	public void login() throws Exception {
		
		
		List<Map<String,String>> li=ExcelUtility2.getTestData("resources\\testdata\\TestData.xlsx", "Sheet3");
		new LoginRepositories(driver);
		LoginRepositories.username.sendKeys(li.get(0).get("username"));
		LoginRepositories.password.sendKeys(li.get(1).get("password"));
		LoginRepositories.loginbutton.click();

	}

	//	@BeforeMethod
	//	public void login() throws Exception {
	////		PageFactory.initElements(driver, LoginRepositories.class);
	//		new LoginRepositories(driver);
	//		LoginRepositories.username.sendKeys("Admin");
	//		LoginRepositories.password.sendKeys("admin123");
	//		LoginRepositories.loginbutton.click();
	//	}

	@AfterMethod
	public void logout() throws Exception {
		//		PageFactory.initElements(driver, LogoutRepositories.class);
		new LogoutRepositories(driver);
		LogoutRepositories.welcomebtn.click();
		Thread.sleep(2000);
		LogoutRepositories.logoutbtn.click();
	}

	@AfterClass
	public void close() throws Exception {
		Thread.sleep(5000);
		driver.quit();

	}

}
