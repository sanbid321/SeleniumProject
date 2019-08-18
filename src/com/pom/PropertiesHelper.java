package com.pom;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IInvokedMethodListener2;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;

public class PropertiesHelper  implements IInvokedMethodListener2 {
	
	
	Properties properties=null;
	
	public PropertiesHelper() throws Exception
	{
		properties = new Properties();
		
//		File file = new File("POM.properties");
//		FileInputStream inputStream = new FileInputStream(file);
//		properties.load(inputStream);
		
		
		properties.load(new FileInputStream(new File("POM.properties")));
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
		// TODO Auto-generated method stub
		
	}

		}

	

