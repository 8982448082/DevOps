package com.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByCssSelector {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("Test@123");
		driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("7845145");
		driver.findElement(By.cssSelector("button[name=\"login\"]")).click();
	}

}
