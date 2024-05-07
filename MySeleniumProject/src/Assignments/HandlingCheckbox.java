package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		WebElement milk=driver.findElement(By.cssSelector("input[name^=\"option1\"]"));
		
		if(milk.isSelected()==false);
		milk.click();
		
		WebElement butter= driver.findElement(By.cssSelector("input[value^=\"Milk\"]"));
		
		if(butter.isSelected()==false);
		butter.click();
		
		WebElement cheese=driver.findElement(By.cssSelector("input[value^=\"Cheese\"]"));
		
		if(cheese.isSelected()==false);
		cheese.click();
		
	
		// alternative option
		
		List<WebElement> products=driver.findElements(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
	
	
	for(WebElement p: products)
		
		//getAttribute() method to get the text where it is mentioned the product name so selected that attribute only 
		
	{
		System.out.println("Before:");
		System.out.println(p.getAttribute("value") + "Selected: " + p.isSelected());
		System.out.println(p.getAttribute("value") + "Displayed: " + p.isDisplayed());
		System.out.println(p.getAttribute("value") + "Enabled: " + p.isEnabled());
		
		if(p.isSelected()==false);
		p.click();
		
		
		System.out.println("After:");
		System.out.println(p.getAttribute("value") + "Selected: " + p.isSelected());
		System.out.println(p.getAttribute("value") + "Displayed: " + p.isDisplayed());
		System.out.println(p.getAttribute("value") + "Enabled: " + p.isEnabled());
		
	}
	
		driver.close();
		
		
		//int arr[] = {1,2,3,4,5}
		
	}

}
