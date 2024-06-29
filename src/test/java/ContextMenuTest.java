import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuTest extends BaseTest {
    @Test
    public void contextMenuTest() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("hot-spot"));
        actions.contextClick(element).perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
