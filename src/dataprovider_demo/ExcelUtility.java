package dataprovider_demo;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	public static Iterator<Object[]> getTestData(String filePath,String sheetName)throws Exception
	{

		//Each Row will be treated as Single Entity and store all the entities in a List in the form of ArrayList
		List<Object[]> li=new ArrayList<Object[]>();
		
		//Entity will be represented as a Map<Key,Value> : Entity is nothing but my Row
		Map<String,String> map=null;
		
		File file=new File(filePath);
		FileInputStream inputStream=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(inputStream);
		Sheet sheet=workbook.getSheet(sheetName);
		
		for(int i=sheet.getFirstRowNum();i<sheet.getLastRowNum();i++) 
		{
			//For each and every row iteration  map object will be created
			map=new HashMap<String,String>();
			
			for(int j=sheet.getRow(i).getFirstCellNum();j<sheet.getRow(i).getLastCellNum();j++)
			{
				String key = sheet.getRow(0).getCell(j).toString();
				String value = sheet.getRow(i+1).getCell(j).toString();
				map.put(key,value);//Insertion Process for map
				
//				map.put(sheet.getRow(0).getCell(j).toString(),sheet.getRow(i+1).getCell(j).toString());
				
			}
//			Adding my Entity to list
			li.add(new Object[] {map});//Insertion Process for List
		}
		
		workbook.close();
		
		
		return li.iterator();
		
		
	}		
	
}
