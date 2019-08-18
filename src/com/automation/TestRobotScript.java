package com.automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRobotScript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indeed.co.in/");
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
		driver.findElement(By.xpath("//span[text()='Post your resume']")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		StringSelection selection = new StringSelection("E:\\SessionWorkspace\\Selenium\\resources\\Autoit\\Resume.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robt = new Robot();
		
		robt.keyPress(KeyEvent.VK_CONTROL);
		robt.keyPress(KeyEvent.VK_V);
		

		robt.keyRelease(KeyEvent.VK_CONTROL);
		robt.keyRelease(KeyEvent.VK_V);
		
		robt.keyPress(KeyEvent.VK_TAB);
		robt.keyRelease(KeyEvent.VK_TAB);
		
		robt.keyPress(KeyEvent.VK_TAB);
		robt.keyRelease(KeyEvent.VK_TAB);
		
//		robt.keyPress(KeyEvent.VK_TAB);
//		robt.keyRelease(KeyEvent.VK_TAB);
		
		robt.keyPress(KeyEvent.VK_ENTER);
		robt.keyRelease(KeyEvent.VK_ENTER);
	}

}
