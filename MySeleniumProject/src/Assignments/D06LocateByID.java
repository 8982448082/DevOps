package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateByID {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailID= driver.findElement(By.id("email"));
		emailID.sendKeys("snlittlechamp@gmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("12345678");
		
		WebElement login=driver.findElement(By.name("login")); // as it was giving an error "NoSuchElementException" error hence used by.name instead of by.id
		login.click();
		
	}	

}
