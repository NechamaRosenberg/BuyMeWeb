import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginFunc {
    public static void Login (WebDriver driver){
        WebElement elementToClick =RegistrationPage.Registration(driver);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", elementToClick);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Press the Enter button

        WebElement LogeinEmail=RegistrationPage.Login(driver);
        LogeinEmail.sendKeys(ConstStrings.Mail);//Entering email to logein

        WebElement LoginPassword=RegistrationPage.PasswordLogin(driver);
        LoginPassword.sendKeys(ConstStrings.Password);//Entering password to logein

        WebElement RegistToBuyMe=RegistrationPage.RegistToBuyMe(driver);
        RegistToBuyMe.click();//Click the Register button and enter the site
    }
}
