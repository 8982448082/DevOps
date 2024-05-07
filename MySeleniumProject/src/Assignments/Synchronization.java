package Assignments;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://dash.bling-center.com/platform/signIn.html");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[5]/button/p")).click();
		driver.findElement(By.id("email1")).sendKeys("Shraddhanaphade4@gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/button[2]")).click();
		
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetsuccess"))).getText());
		//System.out.println(driver.findElement(By.id("resetsuccess")).getText());	
	
	}

}
