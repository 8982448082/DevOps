package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05DataProviderDemo {
	WebDriver driver;
	String expUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index" , actUrl;

	
	@Test(dataProvider = "getLoginDetails")
  public void loginToOHRM(String un, String ps) {
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  actUrl = driver.getCurrentUrl();
	  
	  //Assert.assertEquals(actUrl, expUrl);
	  //Assert.assertTrue(actUrl.equals(expUrl));
	  Assert.assertTrue(actUrl.contains("dashboard")); // To check how many test cases are pass as per the correct details
	  
	  
  }
  @AfterMethod
  public void Logout() {
	  if(expUrl.equals(actUrl))
	  {
		  driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
		  driver.findElement(By.partialLinkText("Log")).click();
		  
	  }
	  
	  else
	  {
		  System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText());
	  }
	  
  }
	  
  


  @DataProvider
  public Object[][] getLoginDetails() {
    return new Object[][] {
      new Object[] { "admin", "admin123" },
      new Object[] { "Shraddha", "Shraddha123" },
      new Object[] { "Amit", "admin123" },
      new Object[] { "Aman", "Shraddha123" },
      
      
    };
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
}
}
