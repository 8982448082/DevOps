package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/webtables");
		
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys("Shraddha");
		driver.findElement(By.id("lastName")).sendKeys("Naphade");
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("age")).sendKeys("28");
		driver.findElement(By.id("salary")).sendKeys("30000");
		driver.findElement(By.id("department")).sendKeys("Home");
		driver.findElement(By.id("submit")).click();
		
		List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div"));
		driver.findElement(By.id("delete-record-4")).click();
		
	}

}
