package com.acc.cucumber_practice4;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"}
		,features = "Feature4"
		,glue= {"step_defination"}
	//	,tags= {"@SmokeTest"}
	//	,tags= {"@RegressionTest"}
	//	,tags= {"@FunctionalTest"}
	//	,tags= {"@SmokeTest,@RegressionTest"} //or tags
	//	,tags= {"@SmokeTest","@RegressionTest"} //and  tags
    //	,tags= {"@SmokeTest","~@RegressionTest"} //ignoring regressionTest
		,tags= {"@SmokeTest","~@RegressionTest","~@End2End"} //without tag scenario no.
		)


public class Testrunner {

}  
