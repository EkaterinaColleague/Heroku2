import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

public ChromeDriver driver = new ChromeDriver();

@BeforeMethod
public void  setup() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized");
    // options.addArguments("headless");
    driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
    @AfterMethod
    public void close() {
        driver.quit();
    }
}
