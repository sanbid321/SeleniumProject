package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngHRMS extends TestngRoot{
	
	@AfterTest
	public void CreateEmployee() {
		System.out.println("Create for Employee");
	}
	@Test(priority = 4)
	public void SearchEmployee() {
		System.out.println("Search for Employee");
	}
	@AfterTest
	public void DeleteEmployee() {
		System.out.println("Delete for Employee");
	}
}
