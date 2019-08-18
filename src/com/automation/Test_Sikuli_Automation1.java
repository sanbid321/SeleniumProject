package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class Test_Sikuli_Automation1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.indeed.co.in/?r=us");
		
		Screen screen = new Screen();
		
		driver.findElement(By.xpath("//span[text()='Post your resume']")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		screen.type("E:\\SessionWorkspace\\Selenium\\resources\\Resume.txt");
		screen.click("E:\\SessionWorkspace\\Selenium\\resources\\buttonOpen.PNG");
		
		
		
	}

}
