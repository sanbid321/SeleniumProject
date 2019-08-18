package com.pom;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelData {

	@Test
	public static void getTestData()throws Exception
	{

//		String data[][]= null;

		File file = new File("resources\\testData\\TestData.xlsx");
		FileInputStream inputStream = new FileInputStream(file);

		Workbook workbook=WorkbookFactory.create(inputStream);
		Sheet sheet=workbook.getSheet("Sheet4");

//		data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for(int rowIndex=sheet.getFirstRowNum();rowIndex<sheet.getLastRowNum();rowIndex++)
		{
			Row row = sheet.getRow(rowIndex+1);
			for (int columnIndex =row.getFirstCellNum() ; columnIndex < row.getLastCellNum(); columnIndex++) {
//				data[rowIndex][columnIndex]=row.getCell(columnIndex).toString();
				System.out.print(row.getCell(columnIndex));

			}
			System.out.println();
		}

//		return data;
	}



}
