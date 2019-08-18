package com.automation;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeSrceenshotTest {

	public static void main(String[] args) throws Exception {

		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.thepancard.com/");
			
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			
			
			File dest = new File("E:\\image.JPG");
		
			FileHandler.copy(src, dest);
			
			dest = new File("E:\\image1.PNG");
			
			FileHandler.copy(src, dest);
			
			dest = new File("E:\\image2.BMP");
			
			FileHandler.copy(src, dest);
			
			Thread.sleep(3000);
			driver.close();
			
	}

}
