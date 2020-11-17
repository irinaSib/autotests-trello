package cucumber;

import cucumber.api.CucumberOptions;


@CucumberOptions(
        glue = {"cucumber", "steps"},
        features = {"src/test/resources/features"},
        plugin = {"pretty", "html:target/cucumber-reports/",
                "pretty", "html:target/cucumber-html-reports",
                "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                "json:target/cucumber-html-reports/cucumber.json",
                "rerun:target/failed_scenarios.txt"}
)
public class CucumberRunner {
}
