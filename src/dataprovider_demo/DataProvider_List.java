package dataprovider_demo;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_List {
	
	@Test(dataProvider="getData",dataProviderClass=DataProvider_List.class)
	public void displayData(ArrayList<String> al)
	{
		System.out.println(al.get(0)+" "+al.get(1)+" "+al.get(2)+" "+al.get(3));
	}
	
	
	
	//DataProvider is a special annotaion present in Testng which will execute the same @Test multiple times for different set of data

	//Object[]   --->String[],int[],double[],Employee[]
	//Object[][]
	//Iterator<Object[]>
	//Iterator<Object[][]>		
			

	@DataProvider(name = "getData")
	public Iterator<Object[]> getData() throws Exception
	{
		
		List<ArrayList<String>> li=new ArrayList<ArrayList<String>>();//list is a collection of ArrayList i.e., all rows together
		ArrayList<String> al=null;//arraylist is collection of String i.e., individual row
		
		File file= new File("resources\\testdata\\TestData.xlsx");
		FileInputStream inputStream=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(inputStream);
		Sheet sheet=workbook.getSheet("Sheet1");
		
		
		for(int i=sheet.getFirstRowNum();i<sheet.getLastRowNum();i++)
		{
			al=new ArrayList<String>();
			for(int j=sheet.getRow(i).getFirstCellNum();j<sheet.getRow(i).getLastCellNum();j++)
			{
				al.add(sheet.getRow((i+1)).getCell(j).toString());//Fetching data from each row and store it in arraylist
			}
			li.add(al);//store arraylist into list
		}
		
		
		
		Collection<Object[]> dp = new ArrayList<Object[]>();
       
		for(ArrayList<String> al1:li){
            dp.add(new Object[]{al1});
        }
		
		
	
		workbook.close();
		return dp.iterator();
		
		
	}

}
