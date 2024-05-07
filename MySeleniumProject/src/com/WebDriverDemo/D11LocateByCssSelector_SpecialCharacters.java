package com.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11LocateByCssSelector_SpecialCharacters {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//*=> contains
		driver.findElement(By.cssSelector("input[placeholder*=\"phone\"]")).sendKeys("Test@123");
		//$ ==> ends with
		driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("7845145");
		//^(Circumflex) ==> starts with
		driver.findElement(By.cssSelector("button[id^=\"u_0_5\"]")).click();
	
	
	
	
	
	
	
	
	
	}

}
