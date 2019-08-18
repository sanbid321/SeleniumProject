package com.automation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.xml.bind.v2.runtime.reflect.Accessor.GetterSetterReflection;

public class Script {

	@Test(dataProvider = "getData")
	public void dataRead(String a,String b,String c,String d)  {
		
		System.out.println(a+" "+b+" "+c+" "+d);
		
	}

		@DataProvider(name = "getData")
		public String[][] getData() throws Exception {
			
			String[][] data= null;
			
			File file = new File("C:\\Users\\Santunu Achary\\Desktop\\Excel1.xlsx");
			
			FileInputStream inputstream = new FileInputStream(file);
			
			Workbook workbook = new XSSFWorkbook(inputstream);
			
			Sheet sheet = workbook.getSheet("Sheet1");
			
//			data = new String[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getPhysicalNumberOfCells()];//[3][4]
			data = new String[sheet.getLastRowNum()][sheet.getRow(0).getPhysicalNumberOfCells()];//[2][4]
			
			for(int indexRow = sheet.getFirstRowNum(); indexRow<sheet.getLastRowNum(); indexRow++) {
			
				Row row = sheet.getRow(indexRow+1);
				
				for(int indexCol = row.getFirstCellNum(); indexCol<row.getLastCellNum(); indexCol++) {

//					System.out.print(row.getCell(indexCol)+" ");
					data[indexRow][indexCol]= row.getCell(indexCol).toString(); 
				}
//				System.out.println();
			}
			
	return data;
		}
		
	
}
