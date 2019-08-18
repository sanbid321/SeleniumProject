package com.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAutoIt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
//		driver.navigate().to("https://www.indeed.co.in/");
//		driver.findElement(By.xpath("//span[text()='Post your resume']")).click();
//		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
//		
//		//Runtime.getRuntime().exec("E:\\SessionWorkspace\\Selenium\\resources\\Autoit\\Resume.txt");
//		
//		Runtime.getRuntime().exec("resources\\Autoit\\OpenButton.exe");

			
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//input[@class='plainBtn']")).click();
		
		driver.switchTo().alert().accept();
		
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
		
		WebDriverWait wait = new WebDriverWait(driver, 600);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));		
		Runtime.getRuntime().exec("resources\\\\Autoit\\\\NaukriButton.exe");
			Thread.sleep(5000);
	}

}


