package com.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocateByName {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		//Please find the control on this page whose name is email.
		// and store that control in email object
		// In another word object email is referring to Email id text box on FB
	
		email.sendKeys("snlittlechamp@gmail.com");
		
		//password text box
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Test@123");
		
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	
	
	
	
	}

}
