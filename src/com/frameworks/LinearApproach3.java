package com.frameworks;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LinearApproach3 {
	
	@Test(dataProvider="getTestData")
	public void createEmployee(String uname,String pwd,String fname,String lname) throws Exception
	{
	
		
		Properties prop= new Properties();
		
		prop.load(new FileInputStream(new File("EnvironmentVariables.properties")));
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(prop.getProperty("pagewait")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("implicitwait")), TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
		
//		WebDriverWait wait= new WebDriverWait(driver, 300);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_viewPimModule")));

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();

		
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

	
	
	@DataProvider(name="getTestData")
	
	public String[][] getTestData()
	{
		String[][] data=new String[4][4];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[0][2]="Linear Approach 3.1 Firstname";
		data[0][3]="Linear Approach 3.1 Lastname";
		
		data[1][0]="Admin";
		data[1][1]="admin123";
		data[1][2]="Linear Approach 3.2 Firstname";
		data[1][3]="Linear Approach 3.2 Lastname";
		
		data[2][0]="Admin";
		data[2][1]="admin123";
		data[2][2]="Linear Approach 3.3 Firstname";
		data[2][3]="Linear Approach 3.3 Lastname";

		data[3][0]="Admin";
		data[3][1]="admin123";
		data[3][2]="Linear Approach 3.4 Firstname";
		data[3][3]="Linear Approach 3.4 Lastname";

		return data;
		
	}
}
