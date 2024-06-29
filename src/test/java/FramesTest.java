import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTest {
    @Test
    public void framesTest() {
        driver.get("http://the-internet.herokuapp.com/iframe");
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        assertEquals(driver.findElement(By.id("tinymce")).getText(), "Your content goes here.");
        driver.switchTo().defaultContent();
    }
}
