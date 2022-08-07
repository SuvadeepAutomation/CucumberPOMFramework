package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\My_Workspace\\CucumberPOMSeries\\src\\test\\java\\com\\features"},
		glue = {"stepdefinations", "AppHooks"},
		plugin = {"pretty"	
		}
		
		)


public class MyTestRunner {

}
