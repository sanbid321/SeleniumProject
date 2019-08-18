package com.frameworks;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
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


public class LinearApproach5 {


	Workbook workbook = null;
	Sheet sheet =null;
	Row row = null;

	Logger logger;

	@Test(dataProvider="getTestData")
	public void createEmployee(String uname,String pwd,String fname,String lname) throws Exception
	{


		logger=Logger.getLogger(LinearApproach5.class);
		BasicConfigurator.configure(new FileAppender(new SimpleLayout(), "Execution.log"));


		Properties prop= new Properties();

		prop.load(new FileInputStream(new File("EnvironmentVariables.properties")));

		logger.info("Properties File Loaded Successfully");

		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);


		WebDriver driver = new ChromeDriver(options);
		logger.info("Chrome Browser Launched Succesfully");

		driver.manage().window().maximize();
		logger.info("Browser Maximized");
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(prop.getProperty("pagewait")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("implicitwait")), TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get(prop.getProperty("url"));
		logger.info("Entering an Url in launching browser");
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		logger.info("Username Entered");
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		logger.info("Password Entered");
		driver.findElement(By.id("btnLogin")).click();

		logger.info("Login Successfully");

		//		WebDriverWait wait= new WebDriverWait(driver, 300);
		//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_viewPimModule")));

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();


		driver.findElement(By.id("firstName")).sendKeys(fname);
		logger.info("Firstname Entered");
		driver.findElement(By.id("lastName")).sendKeys(lname);
		logger.info("Lastname Entered");
		driver.findElement(By.id("btnSave")).click();
		logger.info("Record Saved Successfully");
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();

		logger.info("Logout Successfully");
		Thread.sleep(5000);

		driver.quit();

		logger.info("Browser Closed Successfully");
	}



	@DataProvider(name="getTestData")

	public String[][] getTestData()throws Exception
	{
		String[][] data=null;

		File file=new File("resources\\testdata\\TestData.xlsx");
		FileInputStream inputStream = new FileInputStream(file);

		workbook = WorkbookFactory.create(inputStream);
		sheet=workbook.getSheet("Sheet2");
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
