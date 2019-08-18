package com.testPom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider_demo.ExcelUtility2;

public class Approach3 extends Framework {

	//	Already Inherited from Framework (IS-A Relationship)and
	//	Webdriver driver is a variable declared in parent so it is available to child so no need to declare explicitly driver here
	//	WebDriver driver = null;
	public Approach3() throws Exception {
		super();

	}
	@Test(dataProvider="getTestDatainfo")
	public void createEmp(Map<String,String> map) throws Exception {

//		PageFactory.initElements(driver, CreateEmployeRepositories.class);
		
		new CreateEmployeRepositories(driver);
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_viewPimModule")));

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();

		driver.findElement(By.id("firstName")).sendKeys(map.get("firstname"));
		driver.findElement(By.id("lastName")).sendKeys(map.get("lastname"));
		driver.findElement(By.id("btnSave")).click();


	}

	@DataProvider(name="getTestDatainfo")
	public Iterator<Object[]> getTestDatainfo() throws Exception
	{
		List<Map<String,String>> lom= ExcelUtility2.getTestData("resources\\testdata\\TestData.xlsx", "Sheet4");
		
		Collection<Object[]> col=new ArrayList<Object[]>();
		
		for(Map<String,String> map :lom)
		{
			col.add(new Object[] {map});
		}
		
		return col.iterator();
	}

}
