package com.frameworks;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	Workbook workbook = null;
	Sheet sheet =null;
	Row row = null;
	
	@Test(dataProvider="getTestData")
	public void display(String a,String b,String c,String d)
	{
		System.out.println(a + " " + b + " " + c + " " + d);
	}
	
	@DataProvider(name="getTestData")
	public String[][] getTestData() throws Exception
	{
		String[][] data=null;
		
		File file=new File("resources\\testdata\\TestData.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		
		 workbook = WorkbookFactory.create(inputStream);
		
//		if(file.getName().endsWith(".xls"))
//		{
//			 workbook = new HSSFWorkbook(inputStream);
//			
//		}
//		
//		else
//		{
//			 workbook = new XSSFWorkbook(inputStream);
//		}
//		
//		
		sheet=workbook.getSheet("Sheet1");
		
		
		data = new String[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getLastCellNum()];//data[5][4]
		
		
		
		
		//Retriving all the rows including header
		for(int i=sheet.getFirstRowNum();i<=sheet.getLastRowNum();i++)
		{
			row=sheet.getRow(i);
			
			for(int j=row.getFirstCellNum();j<row.getLastCellNum();j++)
			{
				data[i][j]=row.getCell(j).toString();
			}
		}
		
		
//		data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];//data[5][4]
//		//Retriving all the rows excluding header		
//		for(int i=sheet.getFirstRowNum();i<sheet.getLastRowNum();i++)
//		{
//			row=sheet.getRow(i+1);
//			
//			for(int j=row.getFirstCellNum();j<row.getLastCellNum();j++)
//			{
//				data[i][j]=row.getCell(j).toString();
//			}
//		}
//		
//		
//		
//		
////		Retriving the values and printing only
//		for(int i=sheet.getFirstRowNum();i<=sheet.getLastRowNum();i++)
//		{
//			row=sheet.getRow(i);
//			
//			for(int j=row.getFirstCellNum();j<row.getLastCellNum();j++)
//			{
//				System.out.println(row.getCell(j));
//			}
//			System.out.println();
//		}
//		
		
		workbook.close();
		return data;
	}

}
