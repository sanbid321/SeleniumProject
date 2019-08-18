package com.pom;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Listeners;

@Listeners(com.pom.FrameworkScript.class)
public class FrameworkScript extends PropertiesHelper {
	
	
	WebDriver driver=null;
	public FrameworkScript() throws Exception {
		super();
	}

	@BeforeClass
	public void setUp()
	{
		System.out.println("i am in before test");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(properties.getProperty("pagewait")),TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(properties.getProperty("implicitwait")),TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get(properties.getProperty("url"));

	}



	@BeforeMethod
	public void login()throws Exception
	{
		System.out.println("I am in beforeMethod");

//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();

		
//		PageFactory.initElements(driver, LoginObjectRepositories.class);
//		LoginObjectRepositories.username.sendKeys("Admin");
//		LoginObjectRepositories.password.sendKeys("admin123");
//		LoginObjectRepositories.logonButton.click();
		
		
//		new LoginObjectRepositories(driver);
//		LoginObjectRepositories.username.sendKeys("Admin");
//		LoginObjectRepositories.password.sendKeys("admin123");
//		LoginObjectRepositories.logonButton.click();

		File file = new File("resources\\testdata\\TestData.xlsx");
		FileInputStream inputStream = new FileInputStream(file);

		Workbook workbook=WorkbookFactory.create(inputStream);
		Sheet sheet=workbook.getSheet("Sheet3");

		String username=sheet.getRow(1).getCell(0).toString();
		String password=sheet.getRow(1).getCell(1).toString();

		new LoginObjectRepositories(driver);
		LoginObjectRepositories.username.sendKeys(username);
		LoginObjectRepositories.password.sendKeys(password);
		LoginObjectRepositories.logonButton.click();
		
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("i am in after method");
//		driver.findElement(By.id("welcome")).click();
//		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
//		PageFactory.initElements(driver, LogoutObjectRespositories.class);
//		LogoutObjectRespositories.welcomeLink.click();
//		LogoutObjectRespositories.logoutLink.click();

		new LogoutObjectRespositories(driver);
		LogoutObjectRespositories.welcomeLink.click();
		LogoutObjectRespositories.logoutLink.click();

	}
	


	@AfterClass
	public void tearDown()
	{
		System.out.println("I am in after test");
		driver.quit();
	}

}
