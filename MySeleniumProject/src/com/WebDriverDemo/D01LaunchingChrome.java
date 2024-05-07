package com.WebDriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Web driver is an interface hence we can't create the object for this 

public class D01LaunchingChrome {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");  // if http is not there is URL then it will give invalid arguments exception
		driver.close();
	}

}
