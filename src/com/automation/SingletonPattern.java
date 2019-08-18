package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonPattern {
	
	//1.Create a Constructor with a private access modifier
	//2.create a static variable with private access modifier
	//3.Create a static method which returns the private variable which we have declared in the previous steps by initialize it. 
	
	
	
	private static WebDriver driver=null;
	
	private SingletonPattern()
	{
		
	}
	
	public static WebDriver  getInstance()
	{
		if(driver == null)
			driver=new ChromeDriver();
		
		return driver;
	}

}
