package com.automation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//1.ExtentHtmlReporter : Report will be in HTML format (It is write the log)
//2.ExtentReports : publish the log
//ExtentTest :generate the log

public class ExtentReportLogDemo {

	public static void main(String[] args)throws Exception {
		
		BasicConfigurator.configure();
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("Non-Maven_ExtentReportLog.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
//		ExtentTest testLogger=extent.createTest("Working On OrangeHRM");
		ExtentTest testLogger=extent.createTest("TestCase-1", "Working On Orange HRM");
		
		
		testLogger.log(Status.INFO, "Test Case Started");
		WebDriver driver = new ChromeDriver();
		testLogger.log(Status.PASS, "Chrome Browser Sucessfully Launched");
		driver.manage().window().maximize();
		testLogger.log(Status.PASS, "Chrome Browser Sucessfully Maximized");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		testLogger.log(Status.PASS, "Timeout Sucessfully untilizied");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		testLogger.log(Status.PASS, "Entering URL");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		testLogger.log(Status.PASS, "Username Entered");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		testLogger.log(Status.PASS, "Password Entered");
		driver.findElement(By.id("btnLogin")).click();
		testLogger.log(Status.INFO, "Sucessfully logged-in to OrangeHRM URL");
		driver.findElement(By.id("welcome")).click();
		testLogger.log(Status.PASS, "Clicked On Welcome Link");
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		testLogger.log(Status.PASS, "Click On Logout");
		testLogger.log(Status.INFO, "Sucessfully Logged-out to OrangeHRM URL");
		driver.close();
		testLogger.log(Status.PASS, "Chrome Browser Closed Successfully");
		
		testLogger.log(Status.INFO, "Test Case Completed");
		extent.flush();
	}

}



