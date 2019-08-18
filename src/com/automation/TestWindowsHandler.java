package com.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestWindowsHandler {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		// How to communicate with window and browser
		
//		driver.get("http://www.hondacarindia.com/");
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//i[@class='menuIcon serviceIcon']")).click();
//		
//		Set<String> set = driver.getWindowHandles();
//		
//		List<String> list = new ArrayList<String>(set);
//		
//		driver.switchTo().window(list.get(1));
//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[span='BOOK A SERVICE']")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.id("txt_Name")).sendKeys("santanu");
//		
//		
//		Thread.sleep(3000);
//
//		driver.close();
//		driver.switchTo().window(list.get(0));
		
		//  using with movetoelement method to communicate with window and browser
		driver.get("http://www.ghmc.gov.in/");
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'OUR SERVICES')]"))).click().build().perform();
		Thread.sleep(3000);
		actions.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Property Tax')])[1]"))).click().build().perform();
		Thread.sleep(3000);
		actions.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Property Tax')])[2]"))).click().build().perform();
		Thread.sleep(3000);
		actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'GHMC ')]"))).click().build().perform();
		Thread.sleep(3000);
		actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Search your Property Tax')]"))).click().build().perform();
		Thread.sleep(3000);
		
		String Script = "Property Tax Search";
		
		Set<String> set = driver.getWindowHandles();
		//List<String> list = new ArrayList<String>(set);
		for(String id: set) {
			
			String title = driver.switchTo().window(id).getTitle();
			
			if(title.contains(Script))
			{
				break;
			}
				driver.findElement(By.id("ContentPlaceHolder1_txtptinno")).sendKeys("00000000");
		}
		
		Thread.sleep(3000);
			driver.close();
	}

}
