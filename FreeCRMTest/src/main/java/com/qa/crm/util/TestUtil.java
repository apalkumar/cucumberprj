package com.qa.crm.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{

	public static long PAGE_LOAD_TIMEOUT = 50;
	public static long IMPLICIT_WAIT = 10;
	public static String TESTDATA_SHEET_PATH = "E:\\TakeScreenShot\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\testData.xlsx";
	static Workbook book;
	static Sheet sheet;

	//	public void switchToFrame() {
	//		driver.switchTo().frame(0)
	//	}


	public static Object[][] getTestData(String sheetname)
	{
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book =  WorkbookFactory.create(file);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i =0; i< sheet.getLastRowNum();i++) {
			for(int k = 0; k< sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
	}
}
