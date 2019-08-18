package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSyncWait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		 Wait unit alert is displayed.
		
//		driver.get("file:///E:/sync/WaitUntilAlertDisplayed.html");
//		driver.findElement(By.xpath("//button[text()='Click']")).click();

//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		
//		WebDriverWait wait = new WebDriverWait(driver, 300);
//		wait.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(2000);
//		driver.close();
	
		
//		driver.get("file:///E:/sync/WaitUntilTextFieldIsVisible.html");

//		WaitUntilTextFieldDisplayed in Implicitly way
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
//		driver.findElement(By.id("lastName")).sendKeys("acharya");

//		WaitUntilTextFieldDisplayed in Explicitly way		
		
//		driver.findElement(By.id("firstName")).sendKeys("santanu");;
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("lastName")));
//		driver.findElement(By.id("lastName")).sendKeys("acharya");

//		Button 'Search' will be enabled: by explicitly and implicitly 
		
//		driver.get("file:///E:/sync/WaitUntilButtonEnabled.html");
		
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("btn01")));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn01")));
//		driver.findElement(By.id("btn01")).click();
//		Thread.sleep(5000);
	
//		You will be redirected to a new page in ... seconds
		
//		driver.get("file:///E:/sync/WaitUntilPageRedirect.html");
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
//		Thread.sleep(5000);
		
//		WebDriverWait wait = new WebDriverWait(driver, 600);
//		String url = "https://www.facebook.com/";
//		wait.until(ExpectedConditions.urlToBe(url));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		
		
//		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
//		WebDriverWait wait = new WebDriverWait(driver, 600);
//		String url = "https://www.facebook.com/";
//		wait.until(ExpectedConditions.urlToBe(url));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		
		
		//doubt on frame sync

//		driver.get("file:///E:/sync/WaitUntilPageRedirect_Frame.html");
// 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		
//		WebDriverWait wait = new WebDriverWait(driver, 600);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		
		
//		Thread.sleep(5000);
//		driver.close();
	}

}
