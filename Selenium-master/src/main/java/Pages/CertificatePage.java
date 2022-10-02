package Pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Util;

import static cucumber.BaseForCucumber.driver;


public class CertificatePage {
    @FindBy(name = "certificate")
    WebElement cerField;

    @FindBy(xpath = "//button[contains(@class,'btn') and contains(@class,'certificate-check_submit')]")
    WebElement buttonSubmit;

    @FindBy(xpath = "//p[@class='certificate-check_message']")
    WebElement messageField;
    public void getResultCertificate(String cer){
        cerField.sendKeys(cer);
        buttonSubmit.click();

    }

    public String getMessage(){
        try {
            Util.waitVisibilityOfElement(driver,messageField,5);
            return messageField.getText();
        }catch (TimeoutException ignore){
            return "Certificate exist";
        }
    }




}
