import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.xml.sax.SAXException;

import javax.lang.model.element.Name;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)//make the test run in the specific order.
public class Main {
    private static WebDriver driver;
    private static ExtentReports extent; // create ExtentReports and attach reporter(s)
    private static ExtentTest test;// creates a toggle for the given test, adds all log events under it



    @BeforeClass
    public static void main() throws ParserConfigurationException, SAXException, IOException {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(ConstStrings.ExtentHtml);
        extent=new ExtentReports();
       extent.attachReporter(htmlReporter);

        test = extent.createTest(ConstStrings.CreateTestName,ConstStrings.CreateTestDescription); // name your test and add description
        Constants constants = new Constants();
        String currentTime = String.valueOf(System.currentTimeMillis());



        boolean succsed=false;
        try {
            test.log(Status.INFO,ConstStrings.LogDetails);
            System.setProperty(ConstStrings.Property1,ConstStrings.Property2);
            driver =constants.GetBrowser();
            constants.OpenURL(driver);//open the buyme website.
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            succsed=true;
        }catch (Exception e)
        {
            e.printStackTrace();
           succsed=false;
        }
        finally {
            if (succsed==true) {
                test.log(Status.PASS, ConstStrings.SuccsedDetails1, MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot(ConstStrings.ImagewPath + currentTime,driver)).build());
            }
            else
            {
                test.log(Status.FAIL, ConstStrings.SuccsedDetails2,MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot(ConstStrings.ImagewPath + currentTime,driver)).build());
            }
        }
    }
//    @Test//runs only oneth for Registration to site.
//    public void Test00_Registration() throws IOException {
//        String currentTime = String.valueOf(System.currentTimeMillis());
//        boolean registration=false;
//        try {
//            test.log(Status.INFO, ConstStrings.RegistrationDetails1);
//            RegistrationFunc.Registration(driver);
//            registration=true;
//        }catch (Exception e){
//            e.printStackTrace();
//            registration=false;
//        }
//        finally {
//            if (registration==true) {
//            test.log(Status.PASS, ConstStrings.RegistrationDetails2, MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot(ConstStrings.ImagewPath+ currentTime,driver)).build());
//        }
//        else
//        {
//            test.log(Status.FAIL,ConstStrings.RegistrationDetails3,MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot(ConstStrings.ImagewPath + currentTime,driver)).build());
//        }
//        }
//    }
    @Test
    public void Test01_Login() throws IOException {
        String currentTime = String.valueOf(System.currentTimeMillis());
        boolean login=false;
        try {
            test.log(Status.INFO, ConstStrings.LoginDetails1);
            LoginFunc.Login(driver);
            login=true;
        }catch (Exception e)
        {e.printStackTrace();
            login=false;
        }
        finally {
            if (login==true) {
                test.log(Status.PASS, ConstStrings.LoginDetails2, MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot(ConstStrings.ImagewPath+ currentTime,driver)).build());
            }
            else
            {
                test.log(Status.FAIL, ConstStrings.LoginDetails3,MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot(ConstStrings.ImagewPath + currentTime,driver)).build());
            }
        }
    }
    @Test
    public void Test02_HomePage() throws InterruptedException, IOException {
        String currentTime = String.valueOf(System.currentTimeMillis());
        boolean homescreen=false;
        try {
            test.log(Status.INFO, ConstStrings.HomePageDetails1);
            HomeFunc.HomeScreen(driver);
            homescreen = true;
        } catch (Exception e) {
            e.printStackTrace();
            homescreen = false;
        }
        finally {
            if (homescreen==true) {
                test.log(Status.PASS, ConstStrings.HomePageDetails2, MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot(ConstStrings.ImagewPath + currentTime,driver)).build());
            }
            else
            {
                test.log(Status.FAIL, ConstStrings.HomePageDetails3,MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot(ConstStrings.ImagewPath + currentTime,driver)).build());
            }
        }
    }
    @Test
    public void Test03_ChooseGiftScreen() throws InterruptedException, IOException {
        String currentTime = String.valueOf(System.currentTimeMillis());
        boolean chooseGift=false;
        try {
            test.log(Status.INFO, ConstStrings.ChooseGiftScreenDetails1);
            ChooseGiftFunc.ChooseGift(driver);
            chooseGift=true;
        }catch (Exception e){
            e.printStackTrace();
            chooseGift=false;
        }
           finally {
            if (chooseGift==true) {
                test.log(Status.PASS, ConstStrings.ChooseGiftScreenDetails2, MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot(ConstStrings.ImagewPath + currentTime,driver)).build());
            }
            else
            {
                test.log(Status.FAIL, ConstStrings.ChooseGiftScreenDetails3,MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot(ConstStrings.ImagewPath + currentTime,driver)).build());
            }
        }
        }
    @Test
    public void Test04_SendereceivRer() throws InterruptedException, IOException {
        String currentTime = String.valueOf(System.currentTimeMillis());
        boolean sendAndReceive=false;
        try {
            test.log(Status.INFO, ConstStrings.SendAndReceiveDetails1);
            SenderAndReceivFunc.SenderAndReceiv(driver);
            sendAndReceive=true;
        }catch (Exception e){
            e.printStackTrace();
            sendAndReceive=false;
        }
            finally {
            if (sendAndReceive==true) {
                test.log(Status.PASS, ConstStrings.SendAndReceiveDetails2, MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot(ConstStrings.ImagewPath + currentTime,driver)).build());
            }
            else
            {
                test.log(Status.FAIL, ConstStrings.SendAndReceiveDetails3,MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot(ConstStrings.ImagewPath + currentTime,driver)).build());
            }
        }
    }
    @AfterClass
    public static void RunAfter(){
        driver.quit();
        extent.flush();

    }
}
















