import org.junit.Test;
import org.openqa.selenium.By;
import static org.testng.Assert.assertTrue;

public class TyposTest extends BaseTest{
    @Test
    public void typosTest(){
        driver.get("http://the-internet.herokuapp.com/typos");
        assertTrue(driver.findElement(By.xpath("// */p[2]")).getText().contains("Sometimes you'll see a typo, other times you won't."));
    }
}
