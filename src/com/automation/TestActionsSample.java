package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActionsSample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
//			driver.get("https://api.jquery.com/click/");
//			
//			driver.switchTo().frame(0); 
			
			//Action under single click()
			
//			WebElement object1 = driver.findElement(By.xpath("//p[text()='First Paragraph']"));
//			
//			Actions actions = new Actions(driver);
//			Thread.sleep(5000);
//			actions.click(object1).perform();
//			
//			
//			WebElement object2 = driver.findElement(By.xpath("//p[text()='Second Paragraph']"));
//			Thread.sleep(5000);
//			actions.click(object2).perform();
//			
//			
//			WebElement object3 = driver.findElement(By.xpath("//p[text()='Yet one more Paragraph']"));
//			Thread.sleep(3000);
//			actions.moveToElement(object3);
//			actions.click().perform();
			
			//Action under double click();
			
//			driver.get("https://api.jquery.com/dblclick/");
//			driver.switchTo().frame(0);
//			
//			WebElement object1 = driver.findElement(By.xpath("//span[text()='Double click the block']//preceding-sibling::*"));
//			Actions actions = new Actions(driver);
//			actions.doubleClick(object1).perform();
//			Thread.sleep(5000);
//			
//			WebElement object2 = driver.findElement(By.xpath("//div[@class='dbl']"));
//			actions.moveToElement(object2);
//			actions.doubleClick().perform();
//			Thread.sleep(5000);		
			
			//Action under contextclick();
			
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			WebElement object1 = driver.findElement(By.xpath("//span[text()='right click me']"));
			
			Thread.sleep(5000);	
			
			Actions actions = new Actions(driver);
			actions.contextClick(object1).perform();
			actions.sendKeys(Keys.ARROW_DOWN).build().perform();
			
			Thread.sleep(2000);
			actions.sendKeys(Keys.ARROW_DOWN).build().perform();
			
			Thread.sleep(2000);
			
			actions.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(2000);
			
			WebElement edit = driver.findElement(By.xpath("//span[text()='Delete']"));
			Thread.sleep(5000);	
			actions.contextClick(edit).perform();
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(5000);

			
			// Action under Drag and drop();
//			driver.get("https://jqueryui.com/droppable/");
//			driver.switchTo().frame(0);
//			Actions actions = new Actions(driver);
//			
//			WebElement source = driver.findElement(By.id("draggable"));
//			
//			WebElement destination = driver.findElement(By.id("droppable"));
//			actions.dragAndDrop(source, destination).perform();
//			
//			Thread.sleep(5000);
			
			// Action under Click and hold()
//			driver.get("https://jqueryui.com/droppable/");
//			driver.switchTo().frame(0);
//			Actions actions = new Actions(driver);
//			
//			WebElement source = driver.findElement(By.id("draggable"));
//			
//			WebElement destination = driver.findElement(By.id("droppable"));
//			actions.clickAndHold(source).perform();
//			Thread.sleep(3000);
//			actions.release(destination).perform();
			
			Thread.sleep(5000);

			driver.close();
	}

}
