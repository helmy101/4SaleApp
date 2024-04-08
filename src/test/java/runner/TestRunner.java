package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps" , "connector"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@regression"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}