package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 * It is a program to handle chatbot
 * chatbot is nothing but the chatbox which is an Artificial Intelligence(AI)*/
public class HandleChatbot {
	
	public static void main(String[] args) throws Exception {

		//Disable Notifications
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.get("http://www.irctc.co.in/");
//		driver.findElement(By.xpath("//b[.='X']")).click();
//		Thread.sleep(3000);
		
		driver.get("https://ksrtc.in/oprs-web/login/show.do");
		driver.findElement(By.xpath("//div[@id='corover-close-btn']")).click();
		driver.close();
	}

}
