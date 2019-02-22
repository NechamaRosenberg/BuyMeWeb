import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeScreen {
    private static WebElement element = null;

    public static WebElement Price (WebDriver driver) {
        element = driver.findElement(By.xpath("//span[.='סכום']"));

        return element;
    }

    public static WebElement ChoosePrice (WebDriver driver) {
        element = driver.findElement(By.xpath("//li[@data-option-array-index='2']"));
        return element;
    }
    public static WebElement Area (WebDriver driver) {
        element = driver.findElements(By.xpath("//a[@class='chosen-single']")).get(1);
        return element;
    }
    public static WebElement CooseArea (WebDriver driver) {
        element = driver.findElements(By.className("active-result")).get(1);
        return element;
    }
    public static WebElement Category(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[.='קטגוריה']"));
        return element;
    }
    public static WebElement CooseCategory(WebDriver driver) {
        element = driver.findElement(By.xpath ("//li[@data-option-array-index='3']"));
        return element;
    }
    public static WebElement FindGift(WebDriver driver) {
        element = driver.findElements(By.xpath("//a[@rel='nofollow']")).get(0);
        return element;
    }









}
