package Assignments;

//Assignment==>  Open https://www.echotrak.com/Login.aspx?ReturnUrl=%2f this link in any browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingWebsite {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();
		driver.close();
		
	}

}
