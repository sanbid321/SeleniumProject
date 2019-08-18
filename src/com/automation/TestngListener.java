package com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener {

	int passcount = 0;
	int failcount = 0;

	long starttime;
	long endtime;

	@Override
	public void onFinish(ITestContext arg0) {

		System.out.println("Passcount" + passcount);
		System.out.println("Failcount" + failcount);

		endtime = System.currentTimeMillis();
		System.out.println("Endtime" + endtime);
		long executiontime = (endtime - starttime) / 1000;
		System.out.println("Executiontime" + executiontime);
		Workbook workbook = null;

		try {
			File file = new File("E:\\SessionWorkspace\\Selenium\\resources\\ApacePOI\\HRMS.xls");

			FileInputStream fileInputStream = new FileInputStream(file);
			workbook = new HSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet("sheet1");
			sheet.getRow(0).createCell(1).setCellValue(passcount);
			sheet.getRow(1).createCell(1).setCellValue(failcount);

			FileOutputStream fileOutputStream = new FileOutputStream(file);
			workbook.write(fileOutputStream);
		} catch (Exception e) {
		} finally {
				try {
					workbook.close();
				} catch (Exception exception) {
			}	
		}
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		starttime = System.currentTimeMillis();
		System.out.println("Starttime" +starttime);
		System.out.println("Passcount" +passcount);
		System.out.println("Failcount"+ failcount);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		failcount++;
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		passcount++;
	}

}
