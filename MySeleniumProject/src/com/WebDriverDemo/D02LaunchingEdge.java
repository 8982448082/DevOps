package com.WebDriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D02LaunchingEdge {
	
	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");		
		
		driver.close();
				
		
	}

}
