package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogoutObjectRespositories {
	
	
	WebDriver driver=null;
	
	@FindBy(how = How.ID,using ="welcome")	public static WebElement welcomeLink;
	
	@FindBy(how = How.XPATH,using="//a[.='Logout']") public static WebElement logoutLink;

	
	
	public LogoutObjectRespositories(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
	}
}
