package com.frameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LinearApproach1 {
	
	@Test
	public void createEmployee() throws Exception
	{
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		WebDriverWait wait= new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_viewPimModule")));

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();

		
		driver.findElement(By.id("firstName")).sendKeys("Linear Approach 1 Firstname");
		driver.findElement(By.id("lastName")).sendKeys("Linear Approach 2 Lastname");
		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
