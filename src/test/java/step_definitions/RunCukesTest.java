package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features", 
		glue = "step_definitions", 
		plugin = {
				"pretty", "html:target/cucumber-pretty", 
				"json:target/cucumber.json" 
				},
 tags = { "@sanity"
		})
public class RunCukesTest {
}