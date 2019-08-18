package com.automation;

import java.io.File;
import java.util.concurrent.TimeUnit;

//import java.lang.Object;
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotDemo {

	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws Exception {
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.facebook.com");

		
		//dynamic time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		takeScreenshot("Facebook_LoginPage");

	}
	
	public static void takeScreenshot(String filename) throws Exception
	{
		//step -1 : Take a Screenshot and store it as a file format
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("E:\\SessionWorkspace\\Selenium\\Screenshots\\"+filename+".JPEG");
		
		//step - 2 : Now copy the Screenshot to the desired location using copyfile method
//		FileUtils.copyFile(src, dest);
		FileHandler.copy(src, dest);
		
		
	}
	
	
	
	

}
