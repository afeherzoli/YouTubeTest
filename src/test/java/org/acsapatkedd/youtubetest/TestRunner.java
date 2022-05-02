package org.acsapatkedd.youtubetest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.acsapatkedd.youtubetest",
        stepNotifications = true,
        plugin = {"pretty", "html:target/test-report.html"}
)
public class TestRunner {

}