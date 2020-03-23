package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\shapbnil\\eclipse-workspace\\MyChart\\src\\main\\java\\features", 
				glue="pomMyChart",
				monochrome = true,
				plugin = {"pretty", "html:target/cucumber", "json: target/cucumber.json", "junit:target/cukes.xml"},
				dryRun = false,
				strict = false )


public class Runner {

}
