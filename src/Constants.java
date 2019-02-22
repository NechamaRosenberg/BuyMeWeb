import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Constants {
    //open the byme website
    public static final void OpenURL(WebDriver driver) throws IOException, SAXException, ParserConfigurationException {
        driver.navigate().to(getData("URL"));
    }
    public static String getData(String keyName) throws ParserConfigurationException, IOException, SAXException {
        File configXmlFile = new File("C:\\Users\\User\\Documents\\config.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(configXmlFile);

        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        assert doc != null;
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }
    //Do when simple click does not work
    public  static void ClickByJS(WebDriver driver,String className){
        WebElement elementToClick = driver.findElement(By.className(className));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", elementToClick);
    }
    //opening the correct(chrome) browser.
    public  WebDriver GetBrowser() throws IOException, SAXException, ParserConfigurationException {
        WebDriver driver=null;

        String browserType = getData("BrowserType");
        if (browserType.equals("Chrome")) {
            driver = new ChromeDriver();

        } else if (browserType.equals("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browserType.equals("IE")) {
            driver = new InternetExplorerDriver();
        }
        return driver;

    }



}