import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.Keys.ARROW_UP;
import static org.testng.Assert.*;

public class InputsTest extends BaseTest{
    @Test
    public void inputsTest() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement element = By.xpath("//input[@type = 'number']").findElement(driver);
        element.sendKeys(ARROW_UP);
        String inputValue = element.getAttribute("value");
        assertEquals(inputValue, "1");
    }
}
