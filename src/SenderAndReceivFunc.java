import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SenderAndReceivFunc {
    public static void SenderAndReceiv(WebDriver driver) throws InterruptedException {
        WebElement Choose=SenderAndReceiverInfo.RadioButten(driver);
        Thread.sleep(2000);
        Choose.click();//find the anotherPerson element from sendAndRecive class and click on it.
        WebElement Send=SenderAndReceiverInfo.SendTo(driver);
        Send.sendKeys("Sara Lave");//find the receiverName (SendTo) element from sendAndReceive class and write in the receiver name.
        WebElement SendFrom=SenderAndReceiverInfo.From(driver);
        SendFrom.clear();//find the senderName (from) element from sendAndReceive class and clear it.
        SendFrom.sendKeys("Nechama Rosenberg");//add sender name
        WebElement Wish=SenderAndReceiverInfo.Blessing(driver);
        Wish.sendKeys("מזל טוב! ברכות ואיחולים");//find the Blessing element from sendAndReceive class and write un a wish.
        WebElement Picture=SenderAndReceiverInfo.Picture(driver);
        Picture.sendKeys("C:\\test\\1.jpg");//upload a picture.
        try {//wait until loads.
            Thread.sleep(9000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        WebElement Event=SenderAndReceiverInfo.WhatEvent(driver);
        Event.click();//find the Pressing button which event from sendAndReceive class to open list event
        WebElement ChooseEvent=SenderAndReceiverInfo.ChooseWhatEvent(driver);
        ChooseEvent.click();//Choose Event and click.
        WebElement AafterPay=SenderAndReceiverInfo.Press(driver);
        AafterPay.click();//find the afterPay (press) element from sendAndReceive class and click on it.
        WebElement Email=SenderAndReceiverInfo.EmailButton(driver);
        Email.click();//find the emailButton element from sendAndReceive class and click on it.
        WebElement AddEmail=SenderAndReceiverInfo.Email(driver);
        AddEmail.sendKeys("aaa@gmail.com");//add email adress
        WebElement Save=SenderAndReceiverInfo.ButtonSave(driver);
        Save.click();//find the ButtonSave element from sendAndReceive class and click on it.
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}
