package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  //to give must
@CucumberOptions(features = {"src/test/resources/Features/TagsDemo.feature"}, glue = "StepDefinitions"
,monochrome=false,
plugin= {"html:Reports\\CucumberhtmlReports.html",
		"json:Reports\\CucumberjsonReports.json",
		"junit:Reports\\CucumberxmlReports.xml",
		"pretty"
},
dryRun =false,//set to true for dryrun to check if all stepsdefination present or not
tags= "@SmokeTest or @SanityTest" //all 3 scenario will execute
//tags= "@SmokeTest and @SanityTest" //will look for scenario where both test tags are present
//tags="@FunctionalTest" //will run all tests as its feature level tag

		)//path where feature file and steps file is present

public class TestRun {

	
}
