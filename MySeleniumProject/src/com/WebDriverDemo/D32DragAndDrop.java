package com.WebDriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D32DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/");
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0); // need to check in inspect if there is "iframe" available then need to use this method because "NoSuchElementException" will come in this case
		
		// driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));		// This is also alternative method to use
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(source, target).perform();
	
	
	}

}
