package com.automation;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Allprograms {
	static Logger logger;

	public static void main(String[] args) throws Exception {

		logger=Logger.getLogger(Testing_Allprograms.class);
		BasicConfigurator.configure(new FileAppender(new XMLLayout(), "Execution3.xml"));
		System.out.println("Program is started");
		WebDriver driver = null;
		driver = new ChromeDriver();
		logger.info("Intialize chrome driver");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Manage the timeout");
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		logger.info("Open the chrome browser");
		Thread.sleep(3000);

		driver.close();
		logger.info("close the broswer");

	}

}
