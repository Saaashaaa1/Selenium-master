package apium.steps;

import apium.pages.QAPage;
import apium.utill.AppiumUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class QASteps extends BaseAppiumSteps{
    @When("^Open site \"([^\"]*)\"$")
    public void openSite(String url) throws Throwable {
        driver.get(url);
        Thread.sleep(5000);
    }

    @Then("^Print list teachers$")
    public void printListTeachers() {
        By itList = By.id("swiper-coaches");
        AppiumUtil.scrollToElementVisibilityOf(driver, itList);
        QAPage.getListTeachers();
    }
}
