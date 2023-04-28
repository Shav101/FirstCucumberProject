package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/features",
		glue = "step_definitions",
		tags = "@itemsTests",
		dryRun = true // it will just scans the feature file if there is an unimplemented steps // it will not run anything from steps definition
		)

public class CraterTestRunner {
	
	
}

