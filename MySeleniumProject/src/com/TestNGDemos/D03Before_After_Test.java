package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_After_Test {
  
	WebDriver driver;
	
 @BeforeTest
 public void openBrowser()
 {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println("Before Test");
 }
 
 @AfterTest
 public void closeBrowser()
 {
	 driver.close();
	 System.out.println("After test");
 }
	
 @Test (priority = 2)
public void openAmazon() {
	  
	  driver.get("https://www.amazon.in");
	  System.out.println("Title :" + driver.getTitle());
	  
 }
  
  @Test (priority = 1)
  public void openMyntra()
  {
	  
	  driver.get("https://www.Myntra.com");
	  System.out.println("Title :" + driver.getTitle());
	  
  }
  
  @Test (priority = 3)
  public void openFlipkart()
  {
	  driver.get("https://www.flipkart.com");
	  System.out.println("Title :" + driver.getTitle());
	  
  }
  
  @Test (priority = 0)
  public void openAjio()
  {
	  driver.get("https://www.ajio.com");
	  System.out.println("Title :" + driver.getTitle());
	  
  }

  
  }

