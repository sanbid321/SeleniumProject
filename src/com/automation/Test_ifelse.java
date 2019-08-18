package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test_ifelse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.manage().window().maximize();
//		
//		WebElement firsttxt = driver.findElement(By.id("txtUsername"));
//		 
//		Boolean status = firsttxt.isSelected(); 
//		
//		if(status==true)
//		{
//			System.out.println("my name is visible");
//		} else
//		{
//			System.out.println("my name is not visible");
//		}
		
		
		WebDriver driver = null;
		String Browser = "chrome";
		
		if(Browser.equals("chrome"))
		{
			driver = new ChromeDriver();
			Thread.sleep(3000);
		} else if(Browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
			Thread.sleep(3000);
		} else if(Browser.equals("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement firsttxt = driver.findElement(By.id("txtUsername"));
		firsttxt.sendKeys("santanu");
		Thread.sleep(3000);
		driver.close();
	}

}
