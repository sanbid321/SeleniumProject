package com.testPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEmployeRepositories {

	
	WebDriver driver=null;

	
	@FindBy(id="menu_pim_viewPimModule")
	public static WebElement menu = null;
	
	@FindBy(id="menu_pim_addEmployee")
	public static WebElement addEmployee= null;
	
	@FindBy(id="firstName")
	public static WebElement fname = null;
	
	@FindBy(id="lastName")
	public static WebElement lname = null;
	
	@FindBy(id="btnSave")
	public static WebElement save = null;

	
	public CreateEmployeRepositories(WebDriver driver) {
		
		PageFactory.initElements(driver, this);//To Initialize the elements in this Page
	}

	
}
