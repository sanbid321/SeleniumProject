package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActionKeyboard {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys("santanu").perform();
		
		actions.sendKeys(Keys.TAB).build().perform();
		
		actions.sendKeys("acharya").perform();
		
		actions.sendKeys(Keys.TAB).build().perform();
		
		WebElement Mobile = driver.findElement(By.id("u_0_o"));
		
		actions.sendKeys(Mobile, "8374666252").perform();
		
		actions.sendKeys(Keys.chord(Keys.CONTROL, "a")).perform();
		
		actions.sendKeys(Keys.chord(Keys.CONTROL, "c")).perform();
		
		actions.sendKeys(Keys.TAB).build().perform();
		
		actions.sendKeys(Keys.chord(Keys.CONTROL, "v")).perform();
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	
	}

}
