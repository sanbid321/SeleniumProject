package com.testPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class LogoutRepositories {

	WebDriver driver=null;//Declaring a driver variable of Type WebDriver and initialize it to null
	
	@FindBy(id="welcome")
	public static WebElement welcomebtn = null;
	
	@FindBy(xpath="//a[@href='/index.php/auth/logout']")
	public static WebElement logoutbtn = null;
	
	
	public LogoutRepositories(WebDriver driver) {
		
		PageFactory.initElements(driver, this);//To Initialize the elements in current Page
	}
	
}

