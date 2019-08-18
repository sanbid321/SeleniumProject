package com.pom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LinearApproach3 extends FrameworkScript {


	public LinearApproach3() throws Exception {
		super();
	}

	@Test(dataProvider="getTestData")
	public void createEmployee(String fname,String lname) throws Exception
	{
		System.out.println("I am in Test Method");


		//		WebDriverWait wait= new WebDriverWait(driver, 300);
	    //		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_viewPimModule")));
		//		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		//		driver.findElement(By.id("menu_pim_addEmployee")).click();
		//
		//
		//		driver.findElement(By.id("firstName")).sendKeys("Linear Approach 1 Firstname");
		//		driver.findElement(By.id("lastName")).sendKeys("Linear Approach 2 Lastname");
		//		driver.findElement(By.id("btnSave")).click();

		//		PageFactory.initElements(driver, CreateEmployeeObjectRepositories.class);
		//		WebDriverWait wait= new WebDriverWait(driver, 300);
		//		wait.until(ExpectedConditions.visibilityOf(CreateEmployeeObjectRepositories.pimLink));
		//
		//		
		//		CreateEmployeeObjectRepositories.pimLink.click();
		//		CreateEmployeeObjectRepositories.addLink.click();
		//		
		//		CreateEmployeeObjectRepositories.fName.sendKeys("Linear Approach 1 Firstname");
		//		CreateEmployeeObjectRepositories.lName.sendKeys("Linear Approach 2 Lastname");
		//		CreateEmployeeObjectRepositories.saveButton.click();

//		new CreateEmployeeObjectRepositories(driver);
//		WebDriverWait wait= new WebDriverWait(driver, 300);
//		wait.until(ExpectedConditions.visibilityOf(CreateEmployeeObjectRepositories.pimLink));
//		
//		CreateEmployeeObjectRepositories.pimLink.click();
//		CreateEmployeeObjectRepositories.addLink.click();
//		
//		CreateEmployeeObjectRepositories.fName.sendKeys("Linear Approach 1 Firstname");
//		CreateEmployeeObjectRepositories.lName.sendKeys("Linear Approach 2 Lastname");
//		CreateEmployeeObjectRepositories.saveButton.click();
		
		new CreateEmployeeObjectRepositories(driver);
		WebDriverWait wait= new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(CreateEmployeeObjectRepositories.pimLink));

		CreateEmployeeObjectRepositories.pimLink.click();
		CreateEmployeeObjectRepositories.addLink.click();
		
		CreateEmployeeObjectRepositories.fName.sendKeys(fname);
		CreateEmployeeObjectRepositories.lName.sendKeys(lname);
		CreateEmployeeObjectRepositories.saveButton.click();

	}
	
	@DataProvider(name="getTestData")
	public String[][] getTestData() throws Exception
	{
		String[][] data=null;
		data=ExcelHelper.getTestData("resources\\testdata\\TestData.xlsx", "Sheet4");
		return data;
	}
	
}
