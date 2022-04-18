package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = "src/test/java/resources/login.feature",
        glue = {"StepDefinitions"},
        tags = "@Smoke",
        plugin={"pretty","html:target/CucumberReport.html"}



)
public class Run extends AbstractTestNGCucumberTests {
}
