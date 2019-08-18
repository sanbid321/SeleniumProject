package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLHandleDemo {
	public static void main(String[] args) {
		
		//Handle SSL in Chrome Browser without using ChromeOptions
//		DesiredCapabilities desiredCapabilities=DesiredCapabilities.chrome();
//		desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.it.telangana.gov.in/hy-fi/");
//		driver.close();
//		
		
		//Handle SSL in Chrome Browser using ChromeOptions
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
		desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		desiredCapabilities.setCapability(ChromeOptions.CAPABILITY,options);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.it.telangana.gov.in/hy-fi/");
		driver.close();
		
	}

}
