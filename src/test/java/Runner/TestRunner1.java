package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/features/Login.feature",glue="stepdefinitions",plugin = { "pretty" },
monochrome = true)
public class TestRunner1 {
	}


