package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJavaScript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("http://www.way2sms.com/");
		
		JavascriptExecutor jsscript = (JavascriptExecutor)driver;
		
		jsscript.executeScript("window.location = 'https://www.way2sms.com/'");
		
		String script = "document.getElementById('mobileNo').value='8374666252'";
		
		jsscript.executeScript(script);
		
//		script = "document.getElementsByName('password')[0].value='santunun321'";
//		
//		jsscript.executeScript(script);
		
		script  = "window.scrollTo(0, document.body.scrollHeight)";
		
		jsscript.executeScript(script);
		
		Thread.sleep(2000);
		script  = "window.scrollTo(0, -document.body.scrollHeight)";
		
		jsscript.executeScript(script);
	}

}
