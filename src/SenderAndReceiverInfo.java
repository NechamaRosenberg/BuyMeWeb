import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SenderAndReceiverInfo {
    private static WebElement element = null;

    public static WebElement RadioButten (WebDriver driver) {
        element = driver.findElements(By.className("circle")).get(0);
        return element;
    }
    public static WebElement SendTo (WebDriver driver) {
        element = driver.findElements(By.xpath("//input[@class='ember-view ember-text-field']")).get(0);
        return element;
    }
    public static WebElement From (WebDriver driver) {
        element = driver.findElements(By.xpath("//input[@class='ember-view ember-text-field']")).get(1);
        return element;
    }
    public static WebElement Blessing (WebDriver driver) {
        element = driver.findElement(By.xpath("//textarea[@placeholder='מזל טוב, תודה רבה או פשוט מלא אהבה? כאן כותבים מילים טובות ואיחולים שמחים, עד 100 תווים']"));
        return element;
    }
    public static WebElement Picture (WebDriver driver) {
        element = driver.findElement(By.name("fileUpload"));
        return element;
    }
    public static WebElement WhatEvent (WebDriver driver) {
        element = driver.findElement(By.xpath("//span[.='לאיזה אירוע?']"));
        return element;
    }
    public static WebElement ChooseWhatEvent (WebDriver driver) {
        element = driver.findElement(By.xpath("//li[@data-option-array-index='1']"));
        return element;
    }
    public static WebElement Press (WebDriver driver) {
        element = driver.findElement(By.xpath("//label[.='מיד אחרי התשלום']"));
        return element;
    }
    public static WebElement EmailButton (WebDriver driver) {
        element = driver.findElements(By.className("btn-send-option-inner")).get(1);
        return element;
    }
    public static WebElement Email (WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='כתובת המייל של מקבל/ת המתנה']"));
        return element;
    }
    public static WebElement ButtonSave (WebDriver driver) {
        element = driver.findElement(By.xpath("//button[.='שמירה']"));
        return element;
    }




}
