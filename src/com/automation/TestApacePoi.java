package com.automation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class TestApacePoi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Workbook workbook = null;
		
		File file = new File("resources\\ApacePOI\\HRMS.xls");
		
		FileInputStream inputStream = new FileInputStream(file);
	
		if(file.getName().endsWith(".xlsx")) {
		
			workbook = new XSSFWorkbook(inputStream);
			
		} else {
			
			workbook = new HSSFWorkbook(inputStream);
		}
//			Sheet sheet = workbook.getSheet("sheet2");
//			
//			Row row = sheet.getRow(0);
//				row = sheet.getRow(1);
			
//		System.out.println(sheet.getPhysicalNumberOfRows());
//		System.out.println(row.getPhysicalNumberOfCells());
//		System.out.println(sheet.getFirstRowNum());
//		System.out.println(sheet.getLastRowNum());
//		System.out.println(row.getFirstCellNum());
//		System.out.println(row.getLastCellNum());
			
//			for(int colIndex= row.getFirstCellNum(); colIndex<row.getLastCellNum(); colIndex++)	{
//				
//				System.out.println(row.getCell(colIndex));
//			}		
		Sheet sheet = workbook.getSheet("sheet2");
				
			for(int rowIndex = sheet.getFirstRowNum(); rowIndex<=sheet.getLastRowNum(); rowIndex++)
			{
				Row row = sheet.getRow(rowIndex);
				
				
				for(int colIndex=row.getFirstCellNum(); colIndex<row.getLastCellNum(); colIndex++)
				{
					System.out.println(row.getCell(colIndex));
				}
				System.out.println("");
				
			}
	}
}
