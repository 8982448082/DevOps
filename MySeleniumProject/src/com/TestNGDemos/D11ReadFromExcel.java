package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D11ReadFromExcel {
	
	String fpath = "G:\\Shraddha_SeleniumDemo\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
	@Test
  public void readData() {
		
//		/*row = sheet.getRow(0);
//		cell = row.getCell(0);
//		
//		System.out.println(cell.getStringCellValue());
//		
//		cell = row.getCell(1);
//		System.out.println(cell.getStringCellValue());
		
		
		int totalRows=sheet.getPhysicalNumberOfRows(); // this is the direct method to get the total number of rows instead of counting in excel 
		//int totalCells = sheet.getRow(0).getPhysicalNumberOfCells(); // there is no direct method for counting the cell hence it is written like this by using row
		
		for(int i=0; i<totalRows; i++)
		{
			row= sheet.getRow(i);
			int totalCells = sheet.getRow(i).getPhysicalNumberOfCells();

			for(int j=0; j<totalCells; j++)
			{
				cell = row.getCell(j);
				System.out.println(cell.getStringCellValue() + " \t ");
			}
		}
	
	
	
	}
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	  file = new File(fpath);
	  fis = new FileInputStream(file);
	  wb = new XSSFWorkbook(fis);
	  sheet = wb.getSheet("Sheet1");
	  
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  
	  wb.close();
	  fis.close();
  }

}
