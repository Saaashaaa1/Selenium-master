package util;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Util {
    public static void waitVisibilityOfElement(WebDriver driver, WebElement elemen, int i) { //ожидание загрузки элементов
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(elemen));

    }


    public static void scrollToElementVisibilityOf(WebDriver d, By by) {//метод который скролит до элемента
        JavascriptExecutor js = (JavascriptExecutor) d;
        boolean bool = false;
        while (!bool) {//цикл проверяет есть ли элемент, если не находит скролит до тех пор пока не найдет этот элемент
            try {
                d.findElement(by);
                bool = true;
            } catch (Exception ignore) {
                js.executeScript("window.scrollBy(0,50)");
            }
        }
    }
}
