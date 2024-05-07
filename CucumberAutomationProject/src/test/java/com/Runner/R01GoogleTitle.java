package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/CucumberAutomationProject/CucumberAutomationProject/F01GoogleTitle.feature"}, 
					glue = {"com.Steps"},publish= true)
public class R01GoogleTitle {

}
