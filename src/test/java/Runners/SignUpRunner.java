package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features = {"src/test/resources/Features"},
glue = {"stepDefinitions"},
tags = {"@LoginLogout"}
//format = {"html:target/cucumber-html-report"}
)
public class SignUpRunner {

}
