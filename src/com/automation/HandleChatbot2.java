package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * It is a program to handle chatbot
 * chatbot is nothing but the chatbox which is an Artificial Intelligence(AI)*/
public class HandleChatbot2 {
	
	public static void main(String[] args) throws Exception {

		//Disable Notifications
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(options);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.izooto.com/");
		
//		driver.switchTo().frame(1);
		driver.switchTo().frame("drift-widget");
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='drift-widget']")));
		
		WebDriverWait wait=new WebDriverWait(driver, 600);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(.,'When was')])[1]")));
		
		WebElement element=driver.findElement(By.xpath("(//span[contains(.,'When was')])[1]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		
		driver.findElement(By.xpath("//img[@class='_3sY_jwfgYHGUb3-n-s6cwm']")).click();
		
		
		driver.close();
	}

}
