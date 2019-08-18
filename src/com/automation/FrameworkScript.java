package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameworkScript {

		WebDriver driver;
			public void EmployeeSearch()
				{
				driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				//System.out.println("Open Browser");
				}
				public void Login()
				{
					driver.findElement(By.id("txtUsername")).sendKeys("Admin");
					driver.findElement(By.id("txtPassword")).sendKeys("admin123");
					driver.findElement(By.id("btnLogin")).click();
					//System.out.println("Login");
				}
				
				public void Logout() throws Exception
				{
					driver.findElement(By.xpath("//a[text()='Welcome Admin']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					//System.out.println("Logout");
				}	 
				public void Close()
				{
					driver.close();
				}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	FrameworkScript fs = new FrameworkScript();	
		fs.EmployeeSearch();
		fs.Login();
		fs.Logout();
		fs.Close();
	}

}
