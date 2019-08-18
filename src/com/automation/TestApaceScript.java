package com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApaceScript {

		public void createEmployee() throws Exception
		{
			WebDriver driver = null;
			
			File file = new File("resources\\ApacePOI\\HRMS.xls");
			
			FileInputStream inputStream = new FileInputStream(file);
			
			Workbook workbook = new HSSFWorkbook(inputStream);
			Sheet sheet = workbook.getSheet("Sheet1");
//			Row row = sheet.getRow(1);
			
			String userName = sheet.getRow(1).getCell(1).toString();
			String password = sheet.getRow(1).getCell(2).toString();
			String firstName = sheet.getRow(1).getCell(3).toString();
			String lastName = sheet.getRow(1).getCell(4).toString();
			
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			driver.findElement(By.id("Username")).sendKeys(userName);
			
			driver.findElement(By.id("Password")).sendKeys(password);
			
			driver.findElement(By.id("btnLogin")).click();
			
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			
			driver.findElement(By.id("firstName")).sendKeys(firstName);
			
			driver.findElement(By.id("lastName")).sendKeys(lastName);
			
			driver.findElement(By.id("btnSave")).click();
			
			Thread.sleep(3000);
			
//			driver.findElement(By.id("welcome")).click();
//			
//			Thread.sleep(3000);
//			
//			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			
//			driver.close();
			
			sheet.getRow(1).createCell(4).setCellValue("pass");
			
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			
			workbook.write(fileOutputStream);
		}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestApaceScript ts = new TestApaceScript();
		ts.createEmployee();
	}

}
