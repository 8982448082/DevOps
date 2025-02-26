package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTests {
  @Test (priority = 2)
  public void openAmazon() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.amazon.in");
	  
	  System.out.println("Title :" + driver.getTitle());
	  driver.close();
	  
	  
  }
  
  @Test (priority = 1)
  public void openMyntra()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.Myntra.com");
	  
	  System.out.println("Title :" + driver.getTitle());
	  driver.close();
	  
  }
  
  @Test (priority = -1)
  public void openFlipkart()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.flipkart.com");
	  
	  System.out.println("Title :" + driver.getTitle());
	  driver.close();
	  
  }
  
  @Test (priority = 0)
  public void openAjio()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.ajio.com");
	  
	  System.out.println("Title :" + driver.getTitle());
	  driver.close();
	  
  }
}
