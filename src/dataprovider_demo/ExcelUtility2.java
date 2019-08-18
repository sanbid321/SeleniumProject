package dataprovider_demo;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bridj.cpp.std.list;

public class ExcelUtility2 {


	public static List<Map<String, String>> getTestData(String filePath,String sheetName)throws Exception
	{
		List<Map<String,String>> lom=new ArrayList<Map<String,String>>();
		Map<String,String> map=null;



		File file= new File("resources\\testdata\\TestData.xlsx");
		FileInputStream inputStream=new FileInputStream(file);

		Workbook workbook=WorkbookFactory.create(inputStream);
		Sheet sheet=workbook.getSheet("Sheet4");


		for(int i=sheet.getFirstRowNum();i<sheet.getLastRowNum();i++)
		{
			map=new HashMap<String, String>();
			for(int j=sheet.getRow(i).getFirstCellNum();j<sheet.getRow(i).getLastCellNum();j++)
			{
				map.put(sheet.getRow(0).getCell(j).toString(),sheet.getRow((i+1)).getCell(j).toString());
			}
			lom.add(map);
		}

		workbook.close();
		return lom;
	}		

}
