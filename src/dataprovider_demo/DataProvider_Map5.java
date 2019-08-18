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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Map5 {
	
	@Test(dataProvider="getData",dataProviderClass=DataProvider_Map5.class)
	public void displayData(Map<String,String> map)
	{
		System.out.println(map.get("username")+" "+map.get("password")+" "+map.get("firstname")+" "+map.get("lastname"));
	}
	//DataProvider is a special annotaion present in Testng which will execute the same @Test multiple times for different set of data

	//Object[]   --->String[],int[],double[],Employee[]
	//Object[][]
	//Iterator<Object[]>
	//Iterator<Object[][]>		

	@DataProvider(name = "getData")
	public Iterator<Object[]> getData() throws Exception
	{
		
		List<Map<String,String>> lom=new ArrayList<Map<String,String>>();//list is a collection of Map<key,value> i.e., all rows together
		Map<String,String> map=null;//map<key,value> is collection of String i.e., individual row
		
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
		
		Collection<Object[]> dp = new ArrayList<Object[]>();
       
		for(Map<String,String> map1:lom){
            dp.add(new Object[]{map1});
        }
		
		workbook.close();
		return dp.iterator();
//		return lom.iterator();
	}
}
