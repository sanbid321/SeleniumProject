package com.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest
{
	public static void main(String[] args) throws Exception
		{
			System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
			ChromeDriver driver;
			//ChromeDriver driver = null; //primitive type
			driver= new ChromeDriver();
			Thread.sleep(5000);
			driver.close();
			
		}
}
