package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/CucumberAutomationProject/CucumberAutomationProject/F02LoginFunctionality.feature"},
					glue = {"com.Steps"}, publish=true)
public class R02LoginFunctionality {

}
