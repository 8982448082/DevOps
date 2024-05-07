package com.WebDriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03CheckTitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		String title=driver.getTitle(); // it is returning the value hence created the variable also
		System.out.println("Title is:" + title);
		
		if(title.contains("Selenium"))
			System.out.println("Test case is pass");
		else
			System.out.println("test case is fail");
		
		
		driver.close();
		
		
		
		
	}

}
