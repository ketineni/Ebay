package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",
		glue ="stepDef"
		//dryRun= true,
		
		//plugin= {"pretty","junit:target/cucumber-reports/Cucumber.xml"},
		//monochrome=true
		)

public class TestRunner {
	

	
}
