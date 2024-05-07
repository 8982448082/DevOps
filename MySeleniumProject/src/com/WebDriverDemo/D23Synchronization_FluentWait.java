package com.WebDriverDemo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class D23Synchronization_FluentWait {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		
		//From
		driver.findElement(By.id("src")).sendKeys("Mumbai");
		wait.withTimeout(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofMillis(1))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]"))).click();
		
		
		//To
		driver.findElement(By.id("dest")).sendKeys("Pune");
		wait.withTimeout(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofMillis(1))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]"))).click();
		
		
		
		//Date
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]")).click();
		wait.withTimeout(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofMillis(1))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/span[1]/div[7]/span[1]"))).click();
	
		//Search Busses
		driver.findElement(By.id("search_button")).click();
	
		//Result
		System.out.println(driver.findElement(By.xpath("//*[@id=\"21904460\"]/div/div[1]/div[1]/div[1]/div[1]")).getText());
		
	

	}

}
