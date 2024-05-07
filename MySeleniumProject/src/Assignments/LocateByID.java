package Assignments;

//Assignment==> Use name, id and class name locators.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByID {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f ");
		
		WebElement username=driver.findElement(By.id("txtCustomerID"));
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.id("Butsub"));
		login.click();
		
	}

}
