package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  //to give must
@CucumberOptions(features = {".//feature/Login.feature"}, glue = "StepDefinitions")//path where feature file and steps file is present
public class TestRun {

}
