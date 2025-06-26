package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  //to give must
@CucumberOptions(features = {"src/test/resources/Features/DataTable.feature"}, glue = "StepDefinitions"
,monochrome=true,
plugin= {"html:Reports\\CucumberhtmlReports.html",
		"json:Reports\\CucumberjsonReports.json",
		"junit:Reports\\CucumberxmlReports.xml",
		"pretty"
},
dryRun =false//set to true for dryrun to check if all stepsdefination present or not


		)//path where feature file and steps file is present

public class TestRun {

	
}
