package cucumber;
import driverConfig.DriverFactory;
import org.openqa.selenium.WebDriver;
public class BaseForCucumber {

  public static WebDriver driver= DriverFactory.getDriver("CHROME");
 //public static WebDriver driver= DriverFactory.getDriver(String.valueOf("CHROME"));


}

