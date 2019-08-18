 package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcheckBox_radioButton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.thepancard.com/");
			
			driver.manage().window().maximize();
			
//			driver.manage().deleteAllCookies();
//			
//			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			
			
			WebElement LnkNewPan = driver.findElement(By.linkText("Apply New PAN Card"));
			LnkNewPan.click();
			
			Thread.sleep(3000);
			
		
		  WebElement rbButton = driver.findElement(By.id("rblCategory_0"));
		  rbButton.click(); 
		  //System.out.println(rbButton.isSelected());
		  
		  Thread.sleep(2000);

		  System.out.println(rbButton.getSize());
		  
		  WebElement rbArmy1 = driver.findElement(By.id("rblCategory_1"));
		  rbArmy1.click();
//		  System.out.println(rbArmy1.isSelected());
		  Thread.sleep(3000);
//		  
		  WebElement rbNavy = driver.findElement(By.id("rblCategory_2"));
		  rbNavy.click(); System.out.println(rbNavy.isSelected());
		  
		  Thread.sleep(3000); WebElement rbAriforce =
		  driver.findElement(By.id("rblCategory_3")); rbAriforce.click();
		  System.out.println(rbAriforce.isSelected());
		  
		  Thread.sleep(3000); 
		  WebElement gender = driver.findElement(By.id("rblGender_0"));
		  System.out.println(gender.isSelected());
		 			
////		  driver.navigate().back();
//		  WebElement MobText = driver.findElement(By.xpath("//input[@id='txtEmailId']"));
//		  System.out.println(MobText.isEnabled());
//		  Thread.sleep(2000);
//		  
//		  driver.close();
			
	}

}
