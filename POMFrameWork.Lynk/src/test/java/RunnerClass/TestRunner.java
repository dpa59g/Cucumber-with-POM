package RunnerClass;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		
		features={"C:/Users/995-222-0065/eclipse-workspace/POMFrameWork.Lynk/src/test/java/Features"},
		
		glue={"StepDefinitions"}, //the path of the step definition files
		
		monochrome = true ,//display the console output in a proper readable format
		
		plugin = { "pretty", 
					"html:target/cucumber-reports/test-HTMLoutput",
					"json:target/cucumber.json",
					"junit:target/cucumber-reports/Cucumber.xml",
					"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Extentreport.html"
				 },
		
		dryRun = false
		
		)


public class TestRunner {
	


}
