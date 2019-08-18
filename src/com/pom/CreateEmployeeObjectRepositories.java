package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEmployeeObjectRepositories {

	WebDriver driver=null;
	
	@FindBy(id="menu_pim_viewPimModule") public static WebElement pimLink;

	@FindBy(id="menu_pim_addEmployee") 	public static WebElement addLink;

	@FindBy(id="firstName") public static WebElement fName;

	@FindBy(id="lastName") public static WebElement lName;

	@FindBy(id="btnSave")
	public static WebElement saveButton;
	
	
	public CreateEmployeeObjectRepositories(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}



}
