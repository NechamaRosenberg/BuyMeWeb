import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseGift {
    private static WebElement element = null;

    public static WebElement ChooseGiftScreen (WebDriver driver) {
        element = driver.findElements(By.xpath("//a[@class='card-item ember-view']")).get(4);
        return element;

    }

}
