package com.automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.App;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class Test_Sikuli_Automation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		  driver.get("https://www.facebook.com/");
		  
		  Screen screen = new Screen();
		  //Pattern pattern = new Pattern();
		  Thread.sleep(2000); //
		  screen.type("E:\\SessionWorkspace\\Selenium\\resources\\txtfirstname.PNG","santanu"); 
		  
		  for(int i=1;i<5;i++) {
		  screen.type(Key.TAB);
		  screen.type("19"); 
		  screen.type(Key.TAB); 
		  screen.type("JAN"); 
		  screen.type(Key.TAB);
		  screen.type("1986");
		  screen.type(Key.TAB); 
		  screen.type(Key.TAB); 
		  screen.click("E:\\SessionWorkspace\\Selenium\\resources\\generMale.PNG"); 
		  Thread.sleep(2000);
		 		
		//driver.get("https://electoralsearch.in/");
		//ImagePath.setBundlePath("E:\\SessionWorkspace\\Selenium\\resources\\Sikuli\\Chrome.PNG");
		/*
		 * App.open("C:\\Program Files (x86)\\Google\\Chrome\\Application\\Chrome.exe");
		 * Screen screen = new Screen(); screen.type("https://electoralsearch.in/");
		 * screen.type(Key.ENTER); Thread.sleep(2000); screen.click(
		 * "E:\\SessionWorkspace\\Selenium\\resources\\Sikuli\\Continue.PNG");
		 * Thread.sleep(2000);
		 */		
		driver.close();
		
		  }
	}
}
