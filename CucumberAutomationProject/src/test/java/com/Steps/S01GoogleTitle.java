package com.Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S01GoogleTitle {
	@Given("I open Google")
	public void i_open_google() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in");
	}

	@When("Enter valid keyword in search box")
	public void enter_valid_keyword_in_search_box() {
		
		driver.findElement(By.name("q")).sendKeys("Doremon");
	   }

	@When("Hit enter")
	public void hit_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   }

	@Then("Valid search should display")
	public void valid_search_should_display() {
		
		if(driver.getTitle().contains("Doremon"))
			System.out.println("Search working fine");
		else
			System.out.println("Not working");
		driver.close();
	   	}

	
	
	WebDriver driver;
	String expTitle;
	
	
	@Given("Open google")
	public void open_google() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in");
	}

	@When("Read title")
	public void read_title() {

	 expTitle=driver.getTitle();
		
		
	}

	@Then("Title should be Google")
	public void title_should_be_google() {

	if(expTitle.equals("Google"))
		System.out.println("Title matching");
	else
		System.out.println("Title not matching");
	driver.close();
		
	}
	



	
}

