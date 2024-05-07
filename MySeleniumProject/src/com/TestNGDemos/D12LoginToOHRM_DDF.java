package com.TestNGDemos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D12LoginToOHRM_DDF {
	
	String fpath = "G:\\Shraddha_SeleniumDemo\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int totalRows, totalCells, i, j, index;
	WebDriver driver;
	String expUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index" , actUrl;

	
	
	
  @Test(dataProvider = "getLoginData")
  public void login(String un, String ps) {
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  actUrl = driver.getCurrentUrl();
	  
  }
  @AfterMethod
  public void afterMethod() {
	  
	  row = sheet.getRow(index++); // index++ will fill all the result in excel after execution 
	  cell = row.getCell(2);
	  
	  
		  if(expUrl.equals(actUrl))
		  {
			  driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
			  driver.findElement(By.partialLinkText("Log")).click();
			  cell.setCellValue("Pass");
		  }
		  
		  else
		  {
			  System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText());
			  cell.setCellValue("Fail");
		  }
		  
	  }
	  
  


  @DataProvider
  public Object[][] getLoginData() {
	  
	  totalRows = sheet.getPhysicalNumberOfRows();	
	  String[][] loginData = new String[totalRows][2];
	  
	  for(int i=0; i<totalRows;i++)
	  {
		  row=sheet.getRow(i);
		  for(int j=0;j<2;j++)
		  {
			  cell=row.getCell(j);
			  loginData[i][j] = cell.getStringCellValue();
		  }
	  }
	  
	  return loginData;
	  
    };
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	  file =new File(fpath);
	  fis = new FileInputStream(file);
	  wb = new XSSFWorkbook(fis);
	  sheet = wb.getSheetAt(0); // if the sheet is on 2nd number in folder then index value will be 1 and so on 
	  fos = new FileOutputStream(file); // if the read & write both are together then this method always comes after sheet otherwise file get corrupted
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
	  wb.close();
	  fis.close();
  }

}
