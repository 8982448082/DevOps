package StarAgileAssignments;


// Write a WebDriver script to capture a screenshot of a web page and save it to a specific location



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment5 {
	

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		
		driver.get("https://staragile.melimu.com");
		
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("G:\\StarAgileScreenShot.jpeg"));
		
		driver.close();
	
	
	
	}

}
