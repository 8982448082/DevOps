package com.WebDriverDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

//If type is "file" then we have to use robot class otherwise we can just copy paste the path to upload the file by using send keys..

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D25RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException  {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		
		driver.findElement(By.partialLinkText("Auto")).click();
		driver.findElement(By.id("enterinsurantdata")).click();
	
		driver.findElement(By.xpath("//*[@id=\"open\"]")).click();
		
		Robot rbt=new Robot();
		//Thread.sleep(2000);
		//rbt.keyPress(KeyEvent.VK_TAB);
		
		for(int i=1; i<=8;i++)
		{
			Thread.sleep(2000);
			rbt.keyPress(KeyEvent.VK_TAB);
		}
		
		for(int j=1;j<=8;j++)
		{
			Thread.sleep(2000);
			rbt.keyPress(KeyEvent.VK_DOWN);
			
		}
		
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_TAB);
		
		for(int l=1; l<=8;l++)
		{
			Thread.sleep(2000);
			rbt.keyPress(KeyEvent.VK_DOWN);
			
		}
		
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}

}
