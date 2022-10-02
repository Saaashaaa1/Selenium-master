package cucumber.steps;

import Pages.MainPage;
import cucumber.BaseForCucumber;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MainPageSteps extends BaseForCucumber{
    static MainPage mainPage = null;
    static final String mainUrl= "https://dnipro.ithillel.ua/";
    @When("I open the site {string}")
    public void iOpenTheSite(String url) {
        driver.get(url);
        switch (url){
            case mainUrl:
                mainPage=new MainPage(driver);
                break;
        }
    }



    @Then("The text description button should be equal {string}")
    public void theTextDescriptionButtonShouldBeEqual(String text) {
        Assert.assertEquals(mainPage.getMTitleText(),text);
    }
}


