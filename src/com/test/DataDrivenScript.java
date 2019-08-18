package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.frameworks.LinearApproach5;
import com.helper.ExcelHelper;

public class DataDrivenScript {

	Logger logger;

	@Test(dataProvider="getTestData")
	public void createEmployee(String uname,String pwd,String fname,String lname) throws Exception
	{


		logger=Logger.getLogger(LinearApproach5.class);
		BasicConfigurator.configure(new FileAppender(new SimpleLayout(), "Execution.log"));


			Properties prop= new Properties();

			prop.load(new FileInputStream(new File("EnvironmentVariables.properties")));

		logger.info("Properties File Loaded Successfully");

		/*
		 * ChromeOptions options = new ChromeOptions(); options.setHeadless(true);
		 */

		WebDriver driver = new ChromeDriver();
		logger.info("Chrome Browser Launched Succesfully");

		driver.manage().window().maximize();
		logger.info("Browser Maximized");
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(prop.getProperty("pagewait")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("implicitwait")), TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get(prop.getProperty("url"));
		logger.info("Entering an Url in launching browser");
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		logger.info("Username Entered");
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		logger.info("Password Entered");
		driver.findElement(By.id("btnLogin")).click();

		logger.info("Login Successfully");

		//		WebDriverWait wait= new WebDriverWait(driver, 300);
		//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_viewPimModule")));

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();


		driver.findElement(By.id("firstName")).sendKeys(fname);
		logger.info("Firstname Entered");
		driver.findElement(By.id("lastName")).sendKeys(lname);
		logger.info("Lastname Entered");
		driver.findElement(By.id("btnSave")).click();
		logger.info("Record Saved Successfully");
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();

		logger.info("Logout Successfully");
		Thread.sleep(5000);

		driver.quit();

		logger.info("Browser Closed Successfully");
	}



	@DataProvider(name="getTestData")

	public String[][] getTestData()throws Exception
	{
		String[][] data =null;
		ExcelHelper helper= new ExcelHelper();
		data=helper.getTestData();
		return data;
	}


}
