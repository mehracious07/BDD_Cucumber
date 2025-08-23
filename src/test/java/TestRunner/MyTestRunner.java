package TestRunner;
 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
	    features = "src/test/resources/features/Registration.feature",
	    glue = {"stepDefinitions3","Hooks"},
	    tags="@sanity",
	    plugin = {
	        "pretty",
	        "html:target/cucumber-html-report",
	        "json:target/cucumber.json",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  // ✅ correct extent adapter
	    }
	)
 
public class MyTestRunner extends AbstractTestNGCucumberTests {
 
}
 