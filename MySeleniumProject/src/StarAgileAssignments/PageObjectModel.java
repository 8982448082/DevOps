package StarAgileAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModel {
	
	WebDriver driver;

	public PageObjectModel(WebDriver driver) {
		this.driver = driver;
	}
		public void userName(String un)
		{
			driver.findElement(By.id("email")).sendKeys(un);
		}
		
		public void password(String ps)
		{
			driver.findElement(By.id("pass")).sendKeys(ps);
		}
	
		public void submit(String btn)
		{
			driver.findElement(By.name("login")).click();
		}
		public void error()
		{
			System.out.println(driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getText());
		}
		public String getMessage()
		{
			return driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getText();
		}

}
