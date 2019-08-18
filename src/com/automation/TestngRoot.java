package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngRoot {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void OpenBrowser()
	{
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		System.out.println("openBrowser");
	}
	
	@Test(priority = 1)
	public void login()
	{
//		driver.findElement(By.id("Username")).sendKeys("Admin");
//		driver.findElement(By.id("Password")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println("login");
	}
	@Test(priority = 2)
	public void logout()
	{
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		System.out.println("logout");
	}
	
	@Test(priority = 3)
	public void close()
	{
//		driver.close();
		System.out.println("close");
	}
}
