package com.automation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinkAndImages {
	
	/*Links are associated wuth a tag
	 * Images are associated with img tag
	 * 
	 * Links are having an attribute href for navigating
	 * <a href="https://www.google.com"></a>
	 * Images are having an attribute src for navigating
	 * <img src="https://www.google.com"></img>
	 * 
	 * It is not mandatory that either href or src must have value i.e.,it must be null also
	 * <a href=""></a>
	 * <img src=""></img>
	 * 
	 * It is not mandatory that either href or src attributes must present
	 * <a></a>
	 * <img></img>
	 * 
	 * <a href="https://www.google.com"></a>
	 * <a href=""></a>
	 * <a></a>
	 * 
	 * 
	 * 
	 * <img src="https://www.google.com"></img>
	 * <img src=""></img>
	 * <img></img>
	 * 
	 */

	static int i=0,j=0;
	public static void main(String[] args) throws Exception {

		System.out.println("Execution Started");
		
		
//		ChromeOptions options= new ChromeOptions();
//		options.setHeadless(true);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://www.amazon.in");
//		driver.get("https://www.flipkart.in/");
		driver.get("https://www.google.com/");
		
		//It is the collection of links and images including href and src
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
//		List<WebElement> allImages=driver.findElements(By.tagName("img"));
		allLinks.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("All Links Count:"+allLinks.size());
		
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		
		for(WebElement element:allLinks)
		{
			if(element.getAttribute("href")!= null)
			{
				activeLinks.add(element);
			}
			
			if(element.getAttribute("src")!= null)
			{
				activeLinks.add(element);
			}
		}
		
		System.out.println("Active Links Count:"+activeLinks.size());
		int nonActiveLinks=allLinks.size()-activeLinks.size();
		System.out.println("Non Active Links Count:"+nonActiveLinks);
		
		System.out.println("************************************************");

		
		for(WebElement element : activeLinks)
		{
			i++;
			if(element.getAttribute("href")!=null)
			{
				System.out.println("("+i+")"+element.getAttribute("href"));
			}
			
			if(element.getAttribute("src")!= null)
			{
				System.out.println("("+i+")"+element.getAttribute("src"));
			}
		}
		
		System.out.println("************************************************");
		
		for(WebElement element:activeLinks)
		{
			j++;
			//1. Create a URL object
		    //2.Obtain a URLConnection object from the URL
		    //3.Typecast it to HttpURLConnection
			//4.Open a Connection
			//5.Get Response Code
			//6.Disconnect the connection
			
	
			String urlString,response;
			
			if(element.getAttribute("href")!=null)
				urlString=element.getAttribute("href");
			else
				urlString=element.getAttribute("src");
			
			
			if(urlString.isEmpty() || urlString.contains(":0"))
				continue;
			
//			1. Create a URL object
			URL url= new URL(urlString);
			
//			2.Obtain a URLConnection object from the URL
			URLConnection urlconnection=url.openConnection();
//			3.Typecast it to HttpURLConnection
			HttpURLConnection connection=(HttpURLConnection)urlconnection;
			
//			HttpURLConnection connection=(HttpURLConnection) new URL(urlString).openConnection();
			
			connection.setReadTimeout(7000);
			connection.setConnectTimeout(7000);
			
//			4.Open a Connection
			connection.connect();
//			5.Get Response Code
			response=connection.getResponseMessage();
//			6.Disconnect the connection
			connection.disconnect();
			
			System.out.println("("+j+")" +urlString+"---->"+response);
		}
		driver.close();
		
		
		
		System.out.println("Execution Completed");

	}
	
}
