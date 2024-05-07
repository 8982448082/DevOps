package com.WebDriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D21Synchronization_ImplicitWait   {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
		//From
		driver.findElement(By.id("src")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]")).click();
		
		
		//To
		driver.findElement(By.id("dest")).sendKeys("Pune");
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]")).click();
		
		
		//Date
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/span[1]/div[7]/span[1]")).click();
	
		//Search Busses
		driver.findElement(By.id("search_button")).click();
	
		//Result
		System.out.println(driver.findElement(By.xpath("//*[@id=\"21904460\"]/div/div[1]/div[1]/div[1]/div[1]")).getText());
		
	
		driver.close();


	}

}
