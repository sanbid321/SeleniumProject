package com.automation;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLocator {

	public static void main(String[] args) throws Exception {
			WebDriver driver = null;
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			URL url = new URL("http://newtours.demoaut.com/");
			driver.navigate().to(url);
			
			//driver.manage().window().maximize(); 
			
			
			driver.findElement(By.name("userName")).sendKeys("mercury");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();
			
			
			Thread.sleep(5000);
			
			driver.findElement(By.linkText("SIGN-OFF")).click();
			
			driver.close();

	}

}
