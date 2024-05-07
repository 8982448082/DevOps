package com.WebDriverDemo;

import java.awt.Scrollbar;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D29HandlingMenus {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://istqb.in/");
		
		List<WebElement> Menu=driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li"));
		
		for(WebElement m: Menu)
		{
			System.out.println(m.getText());
		}
		
		
		//driver.close();
	
	}

}
