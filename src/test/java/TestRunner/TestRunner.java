package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
			
		features="src/test/java/feature",	
		glue= {"StepDefination","utlities"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/cucumber-pretty"}
		
			
			)
	public class TestRunner {
}

