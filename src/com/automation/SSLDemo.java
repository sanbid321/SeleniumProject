package com.automation;

import java.security.DrbgParameters.Capability;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.session.CapabilityTransform;

public class SSLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities().chrome();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.it.telangana.gov.in/hy-fi/");
		

	}

}
