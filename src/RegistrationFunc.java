import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationFunc {
    public static void Registration(WebDriver driver){
        WebElement EnterButton=RegistrationPage.Registration(driver);
        EnterButton.click();//Click on the Sign In or Register button
        WebElement RegisterButton=RegistrationPage.RegistrationLink(driver);
        RegisterButton.click();//Register for the first time Click Sign Up
        WebElement Name=RegistrationPage.FirstName(driver);
        Name.sendKeys(ConstStrings.Name);//Entering name
        WebElement Email=RegistrationPage.Email(driver);
        Email.sendKeys(ConstStrings.Mail);//Entering email adress
        WebElement Password=RegistrationPage.Password(driver);
        Password.sendKeys(ConstStrings.Password);//Entering password
        WebElement Confirm=RegistrationPage.ConfirmPassword(driver);
        Confirm.sendKeys(ConstStrings.ConfirmPassword);//Entering password
        WebElement elementToClick = RegistrationPage.Agreement(driver);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", elementToClick);//Radio button confirming the agreement to the site rules.
        WebElement RegistToBuyMe=RegistrationPage.RegistToBuyMe(driver);
        RegistToBuyMe.click();//Click the Register button and enter the site

    }
}
