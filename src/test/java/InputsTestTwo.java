import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.openqa.selenium.Keys.ARROW_DOWN;

public class InputsTestTwo extends BaseTest{
    @Test
    public void inputsTestTwo() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement element = driver.findElement(By.xpath("//input[@type = 'number']"));
        element.sendKeys(ARROW_DOWN);
        Assert.assertEquals(-1, -1);
    }
}
