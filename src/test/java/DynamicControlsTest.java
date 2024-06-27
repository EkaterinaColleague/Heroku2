import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.testng.AssertJUnit.assertEquals;

public class DynamicControlsTest extends BaseTest {
    @Test
    public void dynamicControlsTest() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//*[@type = 'button']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        assertEquals(driver.findElements(By.id("checkbox")).size(), 0);
    }
}



