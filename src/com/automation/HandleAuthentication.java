package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAuthentication {

	
	static String username="admin";
	static String password="admin";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
//		driver.get("https://www.engprod-charter.net");
//		driver.get("https://username:password@url");
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
//		driver.switchTo().alert().dismiss();
		

	}

}
