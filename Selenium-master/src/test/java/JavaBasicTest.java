import Pages.JavaBasic;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaBasicTest {

@Test
public void Test(){
    //System.setProperty("webdriver.chrome.driver", "/users/sofianikonova/downloads/chromedriver");
WebDriver driver = new ChromeDriver();
    driver.get("https://ithillel.ua/courses/java-basic");
JavaBasic javaBasic = new JavaBasic(driver);
    javaBasic.getCourseTitle();
    javaBasic.getCourseRate();
    javaBasic.getCourseDescription();
    driver.close();
}
}
