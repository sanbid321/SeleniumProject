package com.testPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverHelper {

	static WebDriver driver =null;

	public static WebDriver driverHelper(String browserName)
	{
		switch (browserName) {
		case "chrome":

			driver=new ChromeDriver();
			break;

		case "firefox":
			driver=new FirefoxDriver();
			break;

		case "ie":
			driver = new InternetExplorerDriver();
			break;
		}
		return driver;
	}
}
