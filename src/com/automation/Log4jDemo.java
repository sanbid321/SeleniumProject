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

public class Log4jDemo {

	static Logger logger;
	public static void main(String[] args)  throws Exception{

		
		logger=Logger.getLogger(Log4jDemo.class);//publish
//		BasicConfigurator.configure(new FileAppender(layout of log, "write the log"));
		BasicConfigurator.configure(new FileAppender(new SimpleLayout(), "Execution1.log"));
		BasicConfigurator.configure(new FileAppender(new HTMLLayout(), "Execution1.html"));
		BasicConfigurator.configure(new FileAppender(new XMLLayout(), "Execution1.xml"));
//		BasicConfigurator.configure();
		
		System.out.println("Program Execution is Started");
		WebDriver driver=null;
		System.out.println("Driver Object is Created");
		
		driver=new ChromeDriver();
		logger.info("Driver Initialise the chrome browser");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		logger.info("Page Load Timeout set");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("Implicit wait set");
		driver.manage().window().maximize();
		logger.info("Maximize the Browser");
		driver.manage().deleteAllCookies();
		logger.info("Delete All Cookies");
		driver.get("http://www.google.com/");
		logger.info("Enter an URL");
		Thread.sleep(3000);
		logger.info("Wait delibarately for 3 seconds");
//		System.exit(1);
		driver.close();
		logger.info("Crome Browser is closed");
		logger.info("Program Execution is Stopped");
		
		
		
	}

}
