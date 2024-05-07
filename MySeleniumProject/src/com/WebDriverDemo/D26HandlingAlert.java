package com.WebDriverDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/alerts");
		Alert alt;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("alertButton")));
		
		
		//driver.findElement(By.id("alertButton")).click();
		alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();   // Click on OK button
		
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("timerAlertButton")));
		Thread.sleep(5000); // because we have created implicitly wait for Web element only not for the js
		alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("confirmButton")));
		alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();  //clicks on cancel button
		System.out.println(driver.findElement(By.id("confirmResult")).getText());	
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("promtButton")));
		alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("Shraddha");
		alt.accept();
		System.out.println(driver.findElement(By.className("text-success")).getText());
	
	
	
	
	
	
	
	}

}
