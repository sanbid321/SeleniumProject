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

public class DataProvider_Map6 {

	@Test(dataProvider = "getData", dataProviderClass = DataProvider_Map6.class)
	public void display(Map<String, String> map) {

		System.out.println(map.get("username") + " " + map.get("password") + " " + map.get("firstname") + " "
				+ map.get("lastname"));
	}

	@DataProvider(name = "getData")
	public Iterator<Object[]> getTestData() throws Exception {

//		List<Map<String, String>> lom = new ArrayList<Map<String, String>>();
//		Map<String, String> map = null;
//
//		File file = new File("resources\\testdata\\TestData.xlsx");
//		FileInputStream inputStream = new FileInputStream(file);
//		Workbook workbook = WorkbookFactory.create(inputStream);
//
//		Sheet sheet = workbook.getSheet("Sheet4");
//
//		for (int i = sheet.getFirstRowNum(); i < sheet.getLastRowNum(); i++) {
//
//			map = new HashMap<String, String>();
//
//			for (int j = sheet.getRow(i).getFirstCellNum(); j < sheet.getRow(i).getLastCellNum(); j++) {
//
//				map.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
//			}
//			lom.add(map);
//		}
//		Collection<Object[]> col = new ArrayList<Object[]>();
//
//		for (Map<String, String> map1 : lom) {
//			col.add(new Object[] {map1});
//		}
//		workbook.close();
//		return col.iterator();
		
		return ExcelUtility.getTestData("resources\\testdata\\TestData.xlsx", "Sheet1");
	}

}


