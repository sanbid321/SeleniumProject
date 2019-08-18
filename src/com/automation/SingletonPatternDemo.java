package com.automation;

import org.openqa.selenium.WebDriver;

public class SingletonPatternDemo {



	public static void main(String[] args) {

		WebDriver driver1,driver2;

		driver1=SingletonPattern.getInstance();

		driver1.get("https://www.facebook.com");

		System.out.println("Title Of Driver-1:"+ driver1.getTitle());

		driver2=SingletonPattern.getInstance();

		driver2.get("https://www.google.com");
		
		System.out.println("Title Of Driver-2:"+ driver2.getTitle());
		
		System.out.println("Title Of Driver-1:"+ driver1.getTitle());
		
		


	}


}
