package cucumber.steps;

import Pages.CertificatePage;
import cucumber.BaseForCucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;


public class CerPageTest extends BaseForCucumber {
    CertificatePage certificatePage= PageFactory.initElements(driver,CertificatePage.class);
    @And("Enter certificate code {string}")
    public void enterCertificateCode(String cer) throws InterruptedException {
        certificatePage.getResultCertificate(cer);
        Thread.sleep(2000);
    }



    @Then("Check result")
    public void checkResult() {
        Assert.assertNotEquals(certificatePage.getMessage(),"Сертифікат не знайдено");

    }
}
