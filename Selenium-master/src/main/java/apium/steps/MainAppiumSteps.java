package apium.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MainAppiumSteps extends BaseAppiumSteps{


    @When("Open site string")
    public void openSite(String url) {
//        BaseAppiumSteps.driver= AppiumDriverConfig.initAndroidChrome();
        driver.get(url);
    }

    @Then("Title site")
    public void titleSite() {
        System.out.println(driver.getTitle());
    }
}
