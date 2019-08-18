package com.automation;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class SeleniumGridDemo {
	
	@Test
	public void sampleDemo() throws Exception
	{
		
//		WebDriver driver=new ChromeDriver();
//		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.3:4444/wd/hub"),new DesiredCapabilities().chrome());

		URL remoteURL=new URL("http://192.168.0.3:4444/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities().chrome();
		dc.setPlatform(Platform.WINDOWS);
		WebDriver driver=new RemoteWebDriver(remoteURL,dc);

		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();
	}

}
