package com.frameworks;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LinearApproach4 {


	Workbook workbook = null;
	Sheet sheet =null;
	Row row = null;


	@Test(dataProvider="getTestData")
	public void createEmployee(String uname,String pwd,String fname,String lname) throws Exception
	{


		Properties prop= new Properties();

		prop.load(new FileInputStream(new File("EnvironmentVariables.properties")));

		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);

		
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(prop.getProperty("pagewait")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("implicitwait")), TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get(prop.getProperty("url"));

		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();


		//		WebDriverWait wait= new WebDriverWait(driver, 300);
		//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_viewPimModule")));

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();


		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();

		Thread.sleep(5000);

		driver.quit();

	}



	@DataProvider(name="getTestData")

	public String[][] getTestData()throws Exception
	{
		String[][] data=null;

		File file=new File("resources\\testdata\\TestData.xlsx");
		FileInputStream inputStream = new FileInputStream(file);

		workbook = WorkbookFactory.create(inputStream);
		sheet=workbook.getSheet("Sheet1");
		data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];//data[5][4]

		//Retriving all the rows excluding header		
		for(int i=sheet.getFirstRowNum();i<sheet.getLastRowNum();i++)
		{
			row=sheet.getRow(i+1);

			for(int j=row.getFirstCellNum();j<row.getLastCellNum();j++)
			{
				data[i][j]=row.getCell(j).toString();
			}
		}

		workbook.close();
		return data;

	}
}
