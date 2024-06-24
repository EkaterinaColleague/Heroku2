import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.ObjectInputStream;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.WebDriver.*;
import static org.testng.AssertJUnit.assertEquals;


public class AddDeleteTest extends BaseTest {


    @Test
    public void addRemoveTest() {

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[text() = 'Add Element']")).click();
         driver. findElement(By.xpath("//button[text() = 'Add Element']")).click();
        driver.findElement(By.xpath("//button[text() = 'Delete']")).click();
        assertEquals(driver.findElements(By.xpath("//button[text() = 'Delete']")).size(), 1);

    }

}
