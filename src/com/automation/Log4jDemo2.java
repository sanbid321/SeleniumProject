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

public class Log4jDemo2 {

	static Logger logger;
	public static void main(String[] args)  throws Exception{


		logger=Logger.getLogger(Log4jDemo2.class);//publish
//		BasicConfigurator.configure(new FileAppender(layout of log, "write the log"));
		BasicConfigurator.configure(new FileAppender(new SimpleLayout(), "Execution2.log"));
		BasicConfigurator.configure(new FileAppender(new HTMLLayout(), "Execution2.html"));
		BasicConfigurator.configure(new FileAppender(new XMLLayout(), "Execution2.xml"));
		BasicConfigurator.configure();//It is used to print the output on console rather than write it to a file
		
		logger.info("I am Info Level");
		logger.debug("I am Debug Level");
		logger.warn("I am Warning Level");
		logger.error("I am Error Level");
		logger.fatal("I am Fatal Level");
		
		
		
	}

}
