import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ChooseGiftFunc {

    public static void ChooseGift (WebDriver driver) throws InterruptedException {

        String URLPage="https://buyme.co.il/search?budget=2&category=8&region=13";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(URLPage,driver.getCurrentUrl());

        WebElement Choose=ChooseGift.ChooseGiftScreen(driver);
        Choose.click();//find the businessPromoCover element from chooseGiftScreen  class and click on it.
    }

}
