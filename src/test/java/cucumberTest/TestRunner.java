package cucumberTest;

	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	/**
	 * The Class TestRunner.
	 */
	@RunWith(Cucumber.class)

	@CucumberOptions(features = "src/test/resources/cucumberFeatures", glue = "stepDefinition",
			monochrome = true,
			plugin = {"html:target/cucumber-html-reports", "json:target/cucumber-json-reports/cucumber.json" })
	public class TestRunner {
	}

