package Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OHRMLogin_Logout {
	WebDriver driver;
	String expUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index" , actUrl;
	
	
	
  @Test
  public void loginToOHRM()  {
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  
	  actUrl = driver.getCurrentUrl();
	  
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
  
  @Test
  public void loginToOHRM1()  {
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Shraddha");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  actUrl = driver.getCurrentUrl();
	  
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
  
  @Test
  public void loginToOHRM2()  {
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Test");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  actUrl = driver.getCurrentUrl();
	  
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
  
	  
	  

  
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}
