package com.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest
{
	public static void main(String[] args) throws Exception
		{
		ChromeDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
			
			Thread.sleep(5000);
			driver.close();
			
		}
}
