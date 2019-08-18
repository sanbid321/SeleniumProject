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
import org.testng.annotations.Test;

public class LinearApproach2 {
	
	@Test
	public void createEmployee() throws Exception
	{
	
		
		Properties prop= new Properties();
		
		prop.load(new FileInputStream(new File("EnvironmentVariables.properties")));
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(prop.getProperty("pagewait")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("implicitwait")), TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		WebDriverWait wait= new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_viewPimModule")));

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();

		
		driver.findElement(By.id("firstName")).sendKeys("Linear Approach 2Firstname");
		driver.findElement(By.id("lastName")).sendKeys("Linear Approach 2 Lastname");
		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
