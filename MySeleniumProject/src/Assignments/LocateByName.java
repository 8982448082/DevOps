package Assignments;

//Assignment==> Try to login with any credentials (eg. user name - admin, password - admin123)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {

	public static void main(String[] args) {
		
		String expMsg = "Invalid Username/Password" , actualmsg;

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f ");
		
		WebElement username=driver.findElement(By.name("txtCustomerID"));
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.name("Butsub"));
		login.click();
		
		WebElement error=driver.findElement(By.id("lblMsg"));
		actualmsg =error.getText();
		System.out.println("Error essage: " + actualmsg);
		
		if(expMsg.equals(actualmsg))
			System.out.println("Error message matching: Test case pass");
		else
			System.out.println("Error message not matching: Test case fail");
		
		
	}

}
