package com.helper;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHelper {
	
	Workbook workbook = null;
	Sheet sheet =null;
	Row row = null;


	public String[][] getTestData()throws Exception
	{
		String[][] data=null;

		File file=new File("resources\\testdata\\TestData.xlsx");
		FileInputStream inputStream = new FileInputStream(file);

		workbook = WorkbookFactory.create(inputStream);
		sheet=workbook.getSheet("Sheet2");
		data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];//data[5][4]

		//Retriving all the rows excluding header		
		for(int i=sheet.getFirstRowNum();i<sheet.getLastRowNum();i++)
		{
			row=sheet.getRow(i+1);

			for(int j=row.getFirstCellNum();j<row.getLastCellNum();j++)
			{
				data[i][j]=row.getCell(j).toString();
			}
		}

		workbook.close();
		return data;

	}


}
