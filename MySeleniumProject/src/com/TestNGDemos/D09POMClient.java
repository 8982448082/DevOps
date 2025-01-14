package com.TestNGDemos;

import org.testng.annotations.Test;

import graphql.Assert;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D09POMClient {
	WebDriver driver;
	NetflixClass n1;
	
  @Test
  public void login() throws InterruptedException {
	  
	  
	  n1.setUserName("8982448082");
	  n1.setPassword("Shraddha123");
	  n1.signIn();
	  Thread.sleep(5000);
	  //n1.showMessage();
	  System.out.println(n1.getMessage());
	  
	  
	  Assert.assertTrue(n1.getMessage().contains("Sorry"));
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.netflix.com/login");
 
	  n1 = new NetflixClass(driver);
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  //driver.close();
  }

}
