package com.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D17HandlingCheckbox {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement altmail=driver.findElement(By.cssSelector("input[name^=\"chk\"]"));
		
		System.out.println("Before clicking");
		System.out.println("Selected: " + altmail.isSelected());
		System.out.println("Visible: "+ altmail.isDisplayed());
		System.out.println("Enable" + altmail.isEnabled());
		
		
		
		if(altmail.isSelected()==false)
		altmail.click();
	
		System.out.println("After clicking:");
		System.out.println("Selected: " + altmail.isSelected());
	
		int arr[] = {1,2,3,4};
		
		//for(int a:arr) // for each loop
		{
			System.out.println();
		}
		
		driver.close();
		
	
	}

}
