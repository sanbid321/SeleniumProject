package com.automation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.thepancard.com/");
		
		WebElement lnkPanCard = driver.findElement(By.linkText("Apply New PAN Card"));
		lnkPanCard.click();
		
		WebElement rbArmy = driver.findElement(By.xpath("//input[@id='rblCategory_1']"));
		rbArmy.click();
		
		WebElement dobButton = driver.findElement(By.xpath("//input[@name='DOB']"));
		dobButton.sendKeys("15/07/1948");
		
		WebElement genButton = driver.findElement(By.xpath("//input[@id='rblGender_0']"));
		genButton.click();
		
		WebElement ddProofDob = driver.findElement(By.xpath("//select[@id='proof_dob']"));
		//ddProofDob.sendKeys(" AADHAAR Card issued by UIDAI");
		ddProofDob.click();
		Thread.sleep(2000);
		
		Select dobSelect=new Select( ddProofDob);
		//dobSelect.selectByVisibleText("AADHAAR Card issued by UIDAI");

		dobSelect.selectByIndex(1);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		WebElement ddPoi=driver.findElement(By.xpath("//select[@name='proof_identity']"));
		//ddPoi.sendKeys(" Bank Certificate in original on letter head from the branch");
		ddPoi.click();
		Thread.sleep(2000);
		
		Select poiSelect=new Select( ddPoi);
		//poiSelect.selectByVisibleText("Bank Certificate in original on letter head from the branch");
		
		poiSelect.selectByIndex(3);
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	
		WebElement rbTitle=driver.findElement(By.xpath("//input[@id='prefix_1']"));
		rbTitle.click();
		
		Thread.sleep(2000);
		
		WebElement lastNametxt = driver.findElement(By.xpath("//input[@id='txtNameLN']"));
		lastNametxt.sendKeys("ENTER THE LAST NAME");
	
		
		
		
		
		
		
		
		
//		WebElement txtDob = driver.findElement(By.xpath("//input[@id='txtDOB']"));
//		txtDob.sendKeys("15/08/1947");
//
//		WebElement rbGender = driver.findElement(By.xpath("//input[@id='rblGender_1']"));
//		rbGender.click();
//
//		WebElement ddProofDob = driver.findElement(By.xpath("//select[@id='proof_dob']"));
//		//ddProofDob.sendKeys(" AADHAAR Card issued by UIDAI");
//		ddProofDob.click();
//		Thread.sleep(2000);
//		
//		Select dobSelect=new Select( ddProofDob);
//		//dobSelect.selectByVisibleText("AADHAAR Card issued by UIDAI");
//
//		dobSelect.selectByIndex(1);
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		
//		
//		WebElement ddPoi=driver.findElement(By.xpath("//select[@name='proof_identity']"));
//		//ddPoi.sendKeys(" Bank Certificate in original on letter head from the branch");
//		ddPoi.click();
//		Thread.sleep(2000);
//		
//		Select poiSelect=new Select( ddPoi);
//		//poiSelect.selectByVisibleText("Bank Certificate in original on letter head from the branch");
//		
//		poiSelect.selectByIndex(3);
//		Thread.sleep(2000);
//		
//		driver.switchTo().alert().accept();
//		
////		//System.out.println(poiSelect.getFirstSelectedOption().getText());
////		
////		String compare = poiSelect.getFirstSelectedOption().getText();
////		if(compare != "Select")
////		{
////			// System.out.println(poiSelect.getFirstSelectedOption().getText());
////			
////			WebElement rbTitle=driver.findElement(By.xpath("//input[@id='prefix_1']"));
////			rbTitle.click();
////			
////			WebElement txtLN=driver.findElement(By.id("txtNameLN"));
////			txtLN.sendKeys("Last Name");
////			
////			WebElement txtFN=driver.findElement(By.id("txtNameFN"));
////			txtFN.sendKeys("First Name");
////			
////			WebElement txtMN=driver.findElement(By.id("txtNameMN"));
////			txtMN.sendKeys("Middle Name");
////			
////			WebElement txtDN=driver.findElement(By.id("txtAbbrFN"));
////			txtDN.clear();
////			txtDN.sendKeys("DISPLAY NAME");
////			
////			
////			WebElement rbOtherName=driver.findElement(By.id("rbOthers_0"));
////			rbOtherName.click();
////			
////			WebElement txtRefLN=driver.findElement(By.id("txtRefLN"));
////			txtRefLN.sendKeys(" Alias Last Name");
////			
////			WebElement txtRefFN=driver.findElement(By.id("txtRefFN"));
////			txtRefFN.sendKeys("Alias First Name");
////			
////			WebElement txtRefMN=driver.findElement(By.id("txtRefMN"));
////			txtRefMN.sendKeys("Alias Middle Name");
////			
////
////			WebElement txtFatherLN=driver.findElement(By.id("txtFatherLN"));
////			txtFatherLN.sendKeys("Father Last Name");
////			
////			WebElement txtFatherFN=driver.findElement(By.id("txtFatherFN"));
////			txtFatherFN.sendKeys("Father First Name");
////			
////			WebElement txtFatherMN=driver.findElement(By.id("txtFatherMN"));
////			txtFatherMN.sendKeys("Father Middle Name");
////			
////			
////
////			WebElement txtMotherLN=driver.findElement(By.id("mother_lname"));
////			txtMotherLN.sendKeys("Mother Last Name");
////			
////			WebElement txtMotherFN=driver.findElement(By.id("mother_fname"));
////			txtMotherFN.sendKeys("Mother First Name");
////			
////			WebElement txtMotherMN=driver.findElement(By.id("mother_mname"));
////			txtMotherMN.sendKeys("Mother Middle Name");
////			
////			WebElement ddParentSelect=driver.findElement(By.id("select_parent"));
////			
////			//ddParentSelect.sendKeys("FATHER'S NAME");
////			//ddParentSelect.click();
////			
////			Thread.sleep(1000);
////			
////			//ddParentSelect.sendKeys("MOTHER'S NAME");
////			//ddParentSelect.click();
////			
////			Select PNSelect=new Select(ddParentSelect);
////			PNSelect.selectByIndex(1);
////
////		}
//
//		
//		
//		
//		
//		
//		WebElement rbTitle=driver.findElement(By.xpath("//input[@id='prefix_1']"));
//		rbTitle.click();
//		
//		WebElement txtLN=driver.findElement(By.id("txtNameLN"));
//		txtLN.sendKeys("Last Name");
//		
//		WebElement txtFN=driver.findElement(By.id("txtNameFN"));
//		txtFN.sendKeys("First Name");
//		
//		WebElement txtMN=driver.findElement(By.id("txtNameMN"));
//		txtMN.sendKeys("Middle Name");
//		
//		WebElement txtDN=driver.findElement(By.id("txtAbbrFN"));
//		txtDN.clear();
//		txtDN.sendKeys("DISPLAY NAME");
//		
//		
//		WebElement rbOtherName=driver.findElement(By.id("rbOthers_0"));
//		rbOtherName.click();
//		
//		WebElement txtRefLN=driver.findElement(By.id("txtRefLN"));
//		txtRefLN.sendKeys(" Alias Last Name");
//		
//		WebElement txtRefFN=driver.findElement(By.id("txtRefFN"));
//		txtRefFN.sendKeys("Alias First Name");
//		
//		WebElement txtRefMN=driver.findElement(By.id("txtRefMN"));
//		txtRefMN.sendKeys("Alias Middle Name");
//		
//
//		WebElement txtFatherLN=driver.findElement(By.id("txtFatherLN"));
//		txtFatherLN.sendKeys("Father Last Name");
//		
//		WebElement txtFatherFN=driver.findElement(By.id("txtFatherFN"));
//		txtFatherFN.sendKeys("Father First Name");
//		
//		WebElement txtFatherMN=driver.findElement(By.id("txtFatherMN"));
//		txtFatherMN.sendKeys("Father Middle Name");
//		
//		
//
//		WebElement txtMotherLN=driver.findElement(By.id("mother_lname"));
//		txtMotherLN.sendKeys("Mother Last Name");
//		
//		WebElement txtMotherFN=driver.findElement(By.id("mother_fname"));
//		txtMotherFN.sendKeys("Mother First Name");
//		
//		WebElement txtMotherMN=driver.findElement(By.id("mother_mname"));
//		txtMotherMN.sendKeys("Mother Middle Name");
//		
//		WebElement ddParentSelect=driver.findElement(By.id("select_parent"));
//		
//		//ddParentSelect.sendKeys("FATHER'S NAME");
//		//ddParentSelect.click();
//		
//		//Thread.sleep(1000);
//		
//		//ddParentSelect.sendKeys("MOTHER'S NAME");
//		//ddParentSelect.click();
//		
//		Select PNSelect=new Select(ddParentSelect);
//		PNSelect.selectByIndex(1);
//		
//		
//		WebElement ddPOA = driver.findElement(By.xpath("//select[@id='ddlPOA']"));
//		Select POASelect=new Select(ddPOA);
//		
//		//POASelect.selectByVisibleText(" Allotment Letter of Accommodation issued by the Central or State Government                                    ");
//		POASelect.selectByVisibleText("Allotment Letter of Accommodation issued by the Central or State Government");
//		driver.switchTo().alert().accept();
//		
//		//POASelect.selectByVisibleText("Electricity Bill");
//		
//		
//		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		
//		WebElement txtAddNo=driver.findElement(By.xpath("//input[@id='txtaddNo']"));
//		txtAddNo.sendKeys("111");
//		
//		//driver.switchTo().frame(0);
//		
//		WebElement txtPremises=driver.findElement(By.xpath("//input[@id='txtaddPremises']"));
//		txtPremises.sendKeys("Premises");
//		
//		WebElement txtAddStreet=driver.findElement(By.xpath("//input[@id='txtaddStreet']"));
//		txtAddStreet.sendKeys("Street");
//		
//		WebElement txtAddArea=driver.findElement(By.xpath("//input[@id='txtaddArea']"));
//		txtAddArea.sendKeys("Area");
//		
//		WebElement ddState = driver.findElement(By.xpath("//select[@id='ddlAddState']"));
//		ddState.click();
//		
//		Select StateSelect=new Select(ddState);
//		StateSelect.selectByVisibleText("ANDHRA PRADESH");
//		
//		//Thread.sleep(5000);
//		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		
//		WebElement ddCity= driver.findElement(By.xpath("//select[@id='city_name']"));
//		//Thread.sleep(5000);
//		ddCity.click();
//		
//		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		Select CitySelect=new Select(ddCity);
//		CitySelect.selectByVisibleText("Vizianagaram");
//		
//		WebElement txtPincode = driver.findElement(By.xpath("//input[@id='txtaddPin']"));
//		txtPincode.sendKeys("535006");
//		
//		
//
//		WebElement rbResidence = driver.findElement(By.cssSelector("input[id='rbPOA_0']"));
//		
//		WebElement rbOffice=driver.findElement(By.cssSelector("input[id='rbPOA_1']"));
//		rbOffice.click();
//			
//		driver.switchTo().alert().accept();
//		
//		if(!rbResidence.isSelected())
//		{
//			
//			WebElement ddOffPOA=driver.findElement(By.xpath("//select[@id='ddlOffPOA1']"));
//			ddOffPOA.click();
//			
//			Select offSelect=new Select(ddOffPOA);
//			offSelect.selectByIndex(2);
//			
//			driver.switchTo().alert().accept();
//			
//			WebElement txtOffName =driver.findElement(By.xpath("//input[@id='txtOffName']"));
//			txtOffName.sendKeys("OFFICE NAME");
//			
//			WebElement txtOffNo=driver.findElement(By.xpath("//input[@id='txtOffNo']"));
//			txtOffNo.sendKeys("111");
//			
//			WebElement txtOffPremises=driver.findElement(By.xpath("//input[@id='txtOffPremises']"));
//			txtOffPremises.sendKeys("Office Premises");
//			
//			WebElement txtOffStreet=driver.findElement(By.xpath("//input[@id='txtOffStreet']"));
//			txtOffStreet.sendKeys("Office Street");
//			
//			WebElement txtOffArea=driver.findElement(By.xpath("//input[@id='txtOffArea']"));
//			txtOffArea.sendKeys("Office Area");
//			
//			WebElement ddOffState = driver.findElement(By.xpath("//select[@id='ddlOffState']"));
//			ddOffState.click();
//			
//			Select offStateSelect=new Select(ddOffState);
//			offStateSelect.selectByVisibleText("ANDHRA PRADESH");
//			
//			//Thread.sleep(5000);
//			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//			
//			WebElement ddOffCity= driver.findElement(By.xpath("//select[@id='ddlOffCity']"));
//			//Thread.sleep(5000);
//			ddOffCity.click();
//			
//			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			
//			Select offCitySelect=new Select(ddOffCity);
//			offCitySelect.selectByVisibleText("Vizianagaram");
//			
//			WebElement txtOffPincode = driver.findElement(By.xpath("//input[@id='txtOffPin']"));
//			txtOffPincode.sendKeys("535006");
//				
//		}
//		
//		WebElement txtMobNo = driver.findElement(By.xpath("//input[@id='txtMobNo']"));
//		txtMobNo.sendKeys("1234567890");
//		
//		
//		WebElement txtAadharNo=driver.findElement(By.cssSelector("input[id='txtAadhaarNo']"));
//		txtAadharNo.sendKeys("123412341234");
//		
//		
//		WebElement txtEnrollmentNo=driver.findElement(By.cssSelector("input[id='AadhaarenrolNo']"));
//		//Format : XXXX/XXXXX/XXXXX
//		txtEnrollmentNo.sendKeys("1234/12345/12345");
//		
//		
//		WebElement txtEmail=driver.findElement(By.cssSelector("input[id='txtEmailId']"));
//		txtEmail.sendKeys("email@email.com");
//		
//		WebElement txtAadhaar = driver.findElement(By.xpath("//input[@id='aadhaar_name']"));
//		txtAadhaar.sendKeys("AADHAAR NAME");
//		
//		
//		WebElement ddIncomeSource=driver.findElement(By.cssSelector("select[id='ddlIncomeSource']"));
//		ddIncomeSource.click();
//		
//		Select incomeSourceSelect=new Select(ddIncomeSource);
//		incomeSourceSelect.selectByValue("6");
//		
//		WebElement txtPlace=driver.findElement(By.xpath("//input[@id='ddlPlace']"));
//		txtPlace.sendKeys("VIZIANAGARAM");
		
		
		//Thread.sleep(3000);
		
		//driver.close();
		
	}

}
