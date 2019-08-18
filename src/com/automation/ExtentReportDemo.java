package com.automation;


import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ExtentReportDemo {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeClass
	public void setUp()
	{
		
		System.out.println(System.getProperty("user.dir"));
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\ExtentReportsFolder\\ExtentReportDark.html");
//		htmlReporter=new ExtentHtmlReporter("ExtentReportsFolder\\ExtentReportSTANDARD.html");
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
		extent.setSystemInfo("OS", "Microsoft-Windows-10");
		extent.setSystemInfo("Host Name", "Santanu");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("UserName", "Santanu Achary");
		
		
		htmlReporter.config().setDocumentTitle("Automation Extent Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setReportName("Extent Report By Santanu Achary");
		
//		In Version 3.x It is work
//		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
	}

	@Test
	public void demoTestPass()
	{
		test=extent.createTest("demoTestPass", "This will demonstrate the PASS Test Case");
		Assert.assertTrue(true);
	}
	
	@Test
	public void demoTestFail()
	{
		test=extent.createTest("demoTestFail", "This will demonstrate the FAIL Test Case");
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void demoTestSkip()
	{
		test=extent.createTest("demoTestSkip", "This will demonstrate the Skip Test Case");
		throw new SkipException("This test case is not ready for Execution");
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" : Test Case Passed", ExtentColor.GREEN));
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" : Test Case Failed due to below Reasons", ExtentColor.RED));
			test.fail(result.getThrowable());
		}
		
		else 
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" : Test Case Skipped due to below Reasons", ExtentColor.YELLOW));
			test.skip(result.getThrowable());
		}
	}
	
	
	@AfterClass
	public void tearDown()
	{
		extent.flush();
	}
}
