package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue = {"stepdefinitions", "utils"},
        monochrome = true,
        plugin = {"pretty", "html:tardget/Cucumber-Reports"}
)
public class CucumberTestRunnerTest {
}
