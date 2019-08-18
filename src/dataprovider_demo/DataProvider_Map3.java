package dataprovider_demo;

import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Map3 {
	
	@Test(dataProvider="getData")
	public void displayData(Map<String,String> map)
	{
		System.out.println(map.get("username")+" "+map.get("password")+" "+map.get("firstname")+" "+map.get("lastname"));
	}
	
	
	
	
	@DataProvider(name="getData")
	public Iterator<Object[]> getData()throws Exception
	{
		return ExcelUtility.getTestData("resources\\testdata\\TestData.xlsx","Sheet4");
	}

}





