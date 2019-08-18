package com.testPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRepositories {
	
	WebDriver driver=null;

	@FindBy(id="txtUsername")
	public static WebElement username = null;
	
	@FindBy(id="txtPassword")
	public static WebElement password = null;
	
	@FindBy(id="btnLogin")
	public static WebElement loginbutton = null;
	
	public LoginRepositories(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	}
