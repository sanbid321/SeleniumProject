package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataprovider {

	@DataProvider(name = "getTestData")
	public String[][] getTestData(){

		String[][] data = new String[1][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		return data;
	}	
	@Test(dataProvider="getTestData")
	public void CreateEmployee(String userName, String password) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
}
