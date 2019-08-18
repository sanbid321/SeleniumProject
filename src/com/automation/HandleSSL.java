package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/*It is the class which handles SSL certificates.
 * All the sites does not have SSL Certificates due to some reasons like
 * 1.Certificate Expired
 * 2.Unauthorised Access
 * et....*/
public class HandleSSL {

	
	public static void main(String[] args) {
		
		//Handle SSL in Chrome Browser using ChromeOptions
				ChromeOptions options = new ChromeOptions();
//				options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
				DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
				desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
				desiredCapabilities.setCapability(ChromeOptions.CAPABILITY,options);
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.cacert.org/");
				driver.close();
		
		
		
		//Handle SSL in Chrome Browser without using ChromeOptions
//		DesiredCapabilities desiredCapabilities=DesiredCapabilities.chrome();
//		DesiredCapabilities desiredCapabilities=DesiredCapabilities.firefox();
//		DesiredCapabilities desiredCapabilities=DesiredCapabilities.internetExplorer();
//		desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
//		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new InternetExplorerDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.cacert.org/");
//		driver.get("https://pvr.co.in/");
//		driver.close();
	
//		
//		
//		
//		
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		
////		ChromeDriver driver=new ChromeDriver(options);
//		WebDriver driver=new ChromeDriver(options);
//		driver.get("https://www.pvrcinemas.com");
	}
}
