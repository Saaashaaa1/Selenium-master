package apium.runners;

import apium.config.AppiumDriverConfig;
import apium.steps.BaseAppiumSteps;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/apium/features",
        glue = "appium.steps",
        tags = "@QA.Feature",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE)

public class AppiumRunner {
    @BeforeClass
    public static void start() {
        BaseAppiumSteps.driver = AppiumDriverConfig.initAndroidChrome();
    }

    @AfterClass
    public static void end(){
        BaseAppiumSteps.driver.quit();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}