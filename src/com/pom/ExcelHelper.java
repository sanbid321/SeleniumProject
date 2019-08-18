package com.pom;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHelper {

	public static String[][] getTestData(String filePath,String sheetName)throws Exception
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
			for (int columnIndex =row.getFirstCellNum() ; columnIndex < row.getLastCellNum(); columnIndex++) {
				data[rowIndex][columnIndex]=row.getCell(columnIndex).toString();

			}
		}

		return data;
	}

}
