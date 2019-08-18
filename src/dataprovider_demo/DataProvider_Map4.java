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

public class DataProvider_Map4 {
	
	@Test(dataProvider="getData",dataProviderClass=DataProvider_Map1.class)
	public void displayData(Map<String,String> map)
	{
		System.out.println(map.get("username")+" "+map.get("password")+" "+map.get("firstname")+" "+map.get("lastname"));
	}
	

	@DataProvider(name = "getData")
	public Iterator<Object[]> getData() throws Exception
	{
		//Stupid not ExcelUtility it is ExcelUtility2  call me pls
		
		List<Map<String,String>> lom = ExcelUtility2.getTestData("resources\\testdata\\TestData.xlsx", "Sheet4");
		
		Collection<Object[]> col = new ArrayList<Object[]>();
       
		for(Map<String,String> map1:lom){
            col.add(new Object[]{map1});
        }
		
		
		return col.iterator();
		
		
	}

}
