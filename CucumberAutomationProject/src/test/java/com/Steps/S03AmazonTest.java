package com.Steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S03AmazonTest {
	
	WebDriver driver;
	
	@Given("Open Amazon")
	public void open_amazon() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	@When("Click on Sell link")
	public void click_on_sell_link() {
		driver.findElement(By.linkText("Sell")).click();
	    }

	@Then("Sell page should openn")
	public void sell_page_should_openn() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Crossshop1"));
		driver.close();
	}

	@When("I click on Best Seller link")
	public void i_click_on_best_seller_link() {
		driver.findElement(By.partialLinkText("Best")).click();
	    }

	@Then("Best Sellers page should open")
	public void best_sellers_page_should_open() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Best"));

		driver.close();
	    }

	@When("I click on Mobile link")
	public void i_click_on_mobile_link() {
		driver.findElement(By.partialLinkText("Mobile")).click();
	    }

	@Then("Mobile page should open")
	public void mobile_page_should_open() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Mobile"));

		driver.close();
	    }

	@When("I click on Electronics link")
	public void i_click_on_electronics_link() {
	  
	driver.findElement(By.partialLinkText("Electro")).click();
	}

	@Then("Electronics page should open")
	public void electronics_page_should_open() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Electronics"));
		driver.close();
	    }


}