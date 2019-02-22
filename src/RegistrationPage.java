import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    private static WebElement element = null;

    public static WebElement Registration(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[@class='seperator-link']"));
        return element;
    }

    public static WebElement RegistrationLink (WebDriver driver) {
        element = driver.findElement(By.xpath("//span[@class='text-btn']"));
        return element;
    }
    public static WebElement FirstName (WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='שם פרטי']"));
        return element;
    }
    public static WebElement Email (WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='מייל']"));
        return element;
    }
    public static WebElement Password (WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='סיסמה']"));
        return element;
    }
    public static WebElement ConfirmPassword(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='אימות סיסמה']"));
        return element;
    }
    public static WebElement Agreement(WebDriver driver) {
        element = driver.findElements(By.xpath("//input[@type='checkbox']")).get(0);
        return element;
    }
    public static WebElement RegistToBuyMe(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        return element;
    }
    public static WebElement Login(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='מייל']"));
        return element;
    }
    public static WebElement PasswordLogin (WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='סיסמה']"));
        return element;
    }
}