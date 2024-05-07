package StarAgileAssignments;


// Implement a Page Object Model for a login page using WebDriver.


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Assignment2 {
	
	WebDriver driver;
	PageObjectModel pom;
	
	@Test
  public void f() {

  pom.userName("1234567890");
  pom.password("56412365");
  pom.submit(null);
  //pom.error();
  System.out.println(pom.getMessage());
  }
  
	@BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.facebook.com/");
	  
	  pom=new PageObjectModel(driver);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
