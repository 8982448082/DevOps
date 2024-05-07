package Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class Assignment_WriteToExcel {
	
	String path = "G:\\Shraddha_SeleniumDemo\\Practice.xlsx";
	File file;
	FileOutputStream fs;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
  @Test
  public void f() {
	  
	  row = sheet.createRow(0);
	  cell = row.createCell(0);
	  cell.setCellValue("Shraddha");
	  
	  cell = row.createCell(1);
	  cell.setCellValue("Naphade");
	  
	  row = sheet.createRow(1);
	  cell = row.createCell(0);
	  cell.setCellValue("Utkarsh");
	  
	  cell = row.createCell(1);
	  cell.setCellValue("Kotulkar");
	  
	  row = sheet.createRow(2);
	  cell = row.createCell(0);
	  cell.setCellValue("Amit");
	  
	  cell = row.createCell(1);
	  cell.setCellValue("Mehta");
	  
	  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  
	  file = new File(path);
	  fs = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	  sheet = wb.createSheet("Sheet1");
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  
	  wb.write(fs);
	  fs.close();
  }

}
