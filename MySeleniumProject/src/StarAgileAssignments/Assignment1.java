package StarAgileAssignments;

import java.time.Duration;

//  Write a WebDriver script to navigate to a Website and click on a specific link.



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.mozilla.org/en-US/firefox/new/");
		
		driver.findElement(By.linkText("Features")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
		
		
		
	}

}
