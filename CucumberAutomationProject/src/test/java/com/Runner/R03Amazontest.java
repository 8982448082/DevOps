package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/CucumberAutomationProject/CucumberAutomationProject/F03AmazonTest.feature"},
				glue = {"com.Steps"},
				tags= "@AmazonLinks")
public class R03Amazontest {
	/*
	 * Single Scenario > tags = "@BestSellerLink
	 * Multiple Scenario > tags = "@MobileLink or @ElectronicsLink"
	 * Skip Scenario > tags ="not @ElectronicsLink"
	 */

}
