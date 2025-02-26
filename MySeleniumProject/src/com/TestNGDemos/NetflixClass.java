package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NetflixClass {
	
	WebDriver pomDriver;

	public NetflixClass(WebDriver driver) {
		this.pomDriver = driver;
	}
	
	public void setUserName(String un)
	{
		pomDriver.findElement(By.xpath("//*[@id=\":r0:\"]")).sendKeys(un);
		
	}
	
	public void setPassword(String ps)
	{
		pomDriver.findElement(By.xpath("//*[@id=\":r3:\"]")).sendKeys(ps);
	}
	
	public void signIn()
	{
		pomDriver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[2]/div/form/button[1]")).click();
	}
	
	public void showMessage()
	{
		System.out.println(pomDriver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[2]/div/header/div/div/div")).getText());
	}
	
	public String getMessage()
	{
		return pomDriver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[2]/div/header/div/div/div")).getText();
		
	}

}
