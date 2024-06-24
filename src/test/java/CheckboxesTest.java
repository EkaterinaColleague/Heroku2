import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxesTest extends BaseTest {
    @Test
    public void checkboxesTest() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox = driver.findElement(By.xpath("//*[@type = 'checkbox']"));
        assertFalse(checkbox.isSelected());
        checkbox.click();
        assertTrue(checkbox.isSelected());
        WebElement checkboxTwo = driver.findElement(By.xpath( "//input [@type = 'checkbox' ][2]"));
        assertTrue(checkboxTwo.isSelected());
        checkboxTwo.click();
        assertFalse(checkboxTwo.isSelected());
    }

    private void assertTrue(boolean enabled) {
    }


}
