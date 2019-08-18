package dataprovider_demo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Array {
	
	@Test(dataProvider="getData",dataProviderClass=DataProvider_Array.class)
	public void displayData(String uname,String pwd,String fname,String lname)
	{
		System.out.println(uname+" "+pwd+" "+fname+" "+lname);
	}
	
	
	//DataProvider is a special annotaion present in Testng which will execute the same @Test multiple times for different set of data

	//Object[]   --->String[],int[],double[],Employee[]
	//Object[][]
	//Iterator<Object[]>
	//Iterator<Object[][]>		
			

	@DataProvider(name = "getData")
	public String[][] getData() throws Exception
	{
		File file= new File("resources\\testdata\\TestData.xlsx");
		FileInputStream inputStream=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(inputStream);
		Sheet sheet=workbook.getSheet("Sheet4");
		
		String[][] data=new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=sheet.getFirstRowNum();i<sheet.getLastRowNum();i++)
		{
			for(int j=sheet.getRow(i).getFirstCellNum();j<sheet.getRow(i).getLastCellNum();j++)
			{
				data[i][j]=sheet.getRow((i+1)).getCell(j).toString();
			}
		}
		
		workbook.close();
		return data;
	}
}
