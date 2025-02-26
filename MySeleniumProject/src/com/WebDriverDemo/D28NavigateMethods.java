package com.WebDriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D28NavigateMethods {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.google.co.in");
		driver.findElement(By.partialLinkText("Gmail")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().refresh();
		//driver.navigate().forward();
		
		
	}

}
