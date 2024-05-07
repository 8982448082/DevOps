package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownList {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement Date=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		WebElement Month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		WebElement Year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		
		Select s1=new Select(Date);
		Select s2=new Select(Month);
		Select s3=new Select(Year);
		
		s1.selectByValue("27");
		s2.selectByValue("12");
		s3.selectByValue("1995");
		
		System.out.println("My Birth date is: " + s1.getFirstSelectedOption().getText() + "-" + s2.getFirstSelectedOption().getText() + "-" + s3.getFirstSelectedOption().getText());
		
		//System.out.println("My Birth date is: "  + s1.selectByValue("27") + s2.selectByValue("12") + s3.selectByValue("1995"));
		
	
	}

}
