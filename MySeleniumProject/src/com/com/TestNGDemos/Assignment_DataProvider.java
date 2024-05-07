package com.com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Assignment_DataProvider {
	WebDriver driver;
	String expUrl="https://practicetestautomation.com/logged-in-successfully/", actUrl; 
	
  @Test(dataProvider = "Assignment")
  public void Login(String un, String ps) {
	  
	  driver.findElement(By.id("username")).sendKeys(un);
	  driver.findElement(By.id("password")).sendKeys(ps);
	  driver.findElement(By.id("submit")).click();
	  
	  actUrl = driver.getCurrentUrl();
	  
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  
	  if(expUrl.equals(actUrl))
	  {
		  driver.findElement(By.linkText("HOME")).click();
		  driver.navigate().back();
		  driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	  }
	  
	  else {
		  driver.findElement(By.id("error")).getText();
	  }
	  
	  
  }


  @DataProvider
  public Object[][] Assignment() {
    return new Object[][] {
      new Object[] { "student", "Password123" },
      new Object[] { "School", "School123" },
      new Object[] { "College", "College123" }
    };
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new ChromeDriver();  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

	  
  }

  @AfterTest
  public void afterTest() {
	  
	  //driver.close();

}
}
