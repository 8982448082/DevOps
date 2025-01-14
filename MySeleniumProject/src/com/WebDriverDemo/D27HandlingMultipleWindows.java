package com.WebDriverDemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D27HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("//*[@id=\"popup1\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"loginId\"]/img")).click();
		System.out.println("Title: " + driver.getTitle());
		
		Set<String> windows=driver.getWindowHandles(); // to switch the another window
		
		Iterator<String> itr=windows.iterator();
		String win1=itr.next();
		String win2=itr.next();
		
		System.out.println(win1);
		System.out.println(win2);
		
		
		driver.switchTo().window(win2);
		System.out.println("Title: " + driver.getTitle());
		
		driver.findElement(By.id("User_Id")).sendKeys("jhuirhewj");
		Thread.sleep(2000);

		driver.switchTo().window(win1);
		driver.findElement(By.xpath("//*[@id=\"applylist\"]")).click();
	
		driver.quit();
		
	}

}
