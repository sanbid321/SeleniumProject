package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Table_index_Test  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
//			driver.get("https://apsrtconline.in/oprs-web/");
//			driver.manage().window().maximize();
//			
//			WebElement journey = driver.findElement(By.id("txtJourneyDate"));
//			journey.click();
//			
//			List<WebElement> selectdat = driver.findElements(By.xpath("(//table)[1]//thead//th"));
//			
//			System.out.println("Number of day"+ selectdat.size());
//			
//			List<WebElement> row = driver.findElements(By.xpath("(//table)[1]//tbody//tr"));
//			
//			System.out.println("Number of row"+ row.size());

			
			driver.get("https://datatables.net/extensions/select/examples/initialisation/i18n.html");
			driver.manage().window().maximize();
			WebElement table = driver.findElement(By.id("example"));
			table.getSize();
			System.out.println(table.getText());
			
			List<WebElement> tablelist = driver.findElements(By.xpath(("(//table)[1]//tr")));
			System.out.println(tablelist.size());
			
			//WebElement namecount = driver.findElement("(//table)[1]//tr")));
			
			Thread.sleep(3000);
			driver.close();
	}

}
