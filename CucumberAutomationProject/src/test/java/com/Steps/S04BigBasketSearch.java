package com.Steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S04BigBasketSearch {
	WebDriver driver;
	
	@Given("Open {string}")
	public void open(String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		}

	@When("I search for {string}")
	public void i_search_for(String product) {
		driver.findElement(By.xpath("//*[@id=\"siteLayout\"]/header[2]/div[1]/div[1]/div/div/div/div/input")).sendKeys(product);

	  }

	@When("I hit enter")
	public void i_hit_enter() {
		driver.findElement(By.xpath("//*[@id=\"siteLayout\"]/header[2]/div[1]/div[1]/div/div/div/div/input")).sendKeys(Keys.ENTER);

	  }

	@Then("Search for Mango should display")
	public void search_for_mango_should_display() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getCurrentUrl().contains("mango"));
		driver.close();  
	}
	
	@Given("Given Open {string}")
	public void given_open(String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

	@When("search for {string}")
	public void search_for(String product) {
		driver.findElement(By.xpath("//*[@id=\"siteLayout\"]/header[2]/div[1]/div[1]/div/div/div/div/input")).sendKeys(product);

	   }

	@When("hit enter")
	public void hit_enter() {
		driver.findElement(By.xpath("//*[@id=\"siteLayout\"]/header[2]/div[1]/div[1]/div/div/div/div/input")).sendKeys(Keys.ENTER);

	   }

	@Then("Search for mashroom should display")
	public void search_for_mashroom_should_display() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getCurrentUrl().contains("mushroom"));
		driver.close();
	    }

}
