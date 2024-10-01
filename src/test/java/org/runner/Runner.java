package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sheik althaf hussain\\eclipse-workspace\\AlthafMaven\\Workout3009\\src\\test\\resources\\Feature Files",
		glue = "org.step",
		tags = "@Amazon",
		dryRun = false,
		strict = true)
public class Runner {
	
	

}
