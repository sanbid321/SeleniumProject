package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjectRepositories {

	
	WebDriver driver=null;
	
//	WebElement username = driver.findElement(By.id("txtUsername"));
	

//	@FindBy(how =How.ID,using="txtUsername")
//	WebElement username;
	
	@FindBy(id="txtUsername")
	public static	WebElement username;
	
	@FindBy(id="txtPassword")
	public static	WebElement password;
	
	@FindBy(id="btnLogin")
	public static	WebElement logonButton;
	
	
	public LoginObjectRepositories(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}
