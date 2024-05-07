package com.WebDriverDemo;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D24HandlingTable {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Money")).click();
		driver.findElement(By.partialLinkText("More")).click();
		
		List<WebElement> Headers= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		//List<WebElement> Headers= driver.findElements(By.tagName("th"));
		
		
		for(WebElement h:Headers) // for each loop
		{
			System.out.println(h.getText());
		}
		
		List<WebElement> rows= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total rows: " + rows.size());
		
		
		Random rnd=new Random();
		int i=rnd.nextInt(rows.size());  // Generate any random number in the range of 0 to rows.size()-1
		
		System.out.println(i);
		System.out.println(rows.get(i).getText());	
		
		
		List<WebElement> Names=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		
		for(WebElement W:Names)
		{
			System.out.println(W.getText());
		}
		
		
		
		
		//driver.close();
		
		
	}

}
