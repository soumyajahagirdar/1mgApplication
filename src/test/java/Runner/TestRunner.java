package Runner;


import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import config.ConfigFileReader;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/resources/features", glue = { "stepdefs" },
tags = {"@1mgTest"}, 
 format = {
		
		// @SmokeTest @OnlyFunctionality
		"pretty", "html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt" },
 plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"})


public class TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)

	public void setUpClass() throws Exception {
		ConfigFileReader.ExecutionRoundCount();
		ConfigFileReader.getTargetData();
		
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider(parallel=false)
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		/*Reporter.loadXMLConfig(new File("extent-config.xml"));
		Reporter.assignAuthor(System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("Windows", "64 bit");
		Reporter.setTestRunnerOutput("Test Case");
		Reporter.setSystemInfo("Selenium", "3.7.0");
	    Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");*/
		testNGCucumberRunner.finish();
		
	}
}




