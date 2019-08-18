package com.testPom;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Excelinfo {

	
	public static String[][] getTestDatainfo(String filePath, String sheetName) throws Exception
	{

		String data[][]= null;

		File file = new File(filePath);
		FileInputStream inputStream = new FileInputStream(file);

		Workbook workbook=WorkbookFactory.create(inputStream);
		Sheet sheet=workbook.getSheet(sheetName);

		data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for(int rowIndex=sheet.getFirstRowNum();rowIndex<sheet.getLastRowNum();rowIndex++)
		{
			Row row = sheet.getRow(rowIndex+1);
			for (int columnIndex =row.getFirstCellNum(); columnIndex<row.getLastCellNum(); columnIndex++) {
				
				//Put the cell value into 2d array
				data[rowIndex][columnIndex] = row.getCell(columnIndex).toString();
				
//				To verify whether data is fetching correctly or not  I am printing the values on the console
//				System.out.print(row.getCell(columnIndex)); 
			}
//			System.out.println();
		}
		return data;
	}


}
