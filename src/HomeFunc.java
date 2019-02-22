import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeFunc {
    public static void  HomeScreen (WebDriver driver) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement PriceClick=HomeScreen.Price(driver);
        PriceClick.click();//Click the Amount button to open the list of amounts to choose
        WebElement ChoosePrice=HomeScreen.ChoosePrice(driver);
        ChoosePrice.click();//Choose the third amount in the list
        WebElement AreaClick=HomeScreen.Area(driver);
        AreaClick.click();//Click the Area button to open the list of areas to choose
        WebElement ChooseArea=HomeScreen.CooseArea(driver);
        ChooseArea.click();//Selects the second area
        WebElement CategoryClick=HomeScreen.Category(driver);
        CategoryClick.click();//Click the Category button to open the list of Categories to choose
        WebElement ChooseCategory=HomeScreen.CooseCategory(driver);
        ChooseCategory.click();//Selects the third category in the list
        WebElement FindGiftButton=HomeScreen.FindGift(driver);
        FindGiftButton.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
    }

