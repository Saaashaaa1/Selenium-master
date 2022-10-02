package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaBasic {
    private static WebDriver driver;

    public JavaBasic(WebDriver driver) {
        JavaBasic.driver = driver;
    }

    public void  getCourseTitle() {
     System.out.println(driver.getTitle());
    }

    public void  getCourseRate() {
        WebElement rate=driver.findElement(By.className("course-rating_average"));
        System.out.println("Rating is "+rate.getText());
    }
    public void getCourseDescription() {
        WebElement description = driver.findElement(By.className("introduction_main"));
        System.out.println(description.getText());
    }
}