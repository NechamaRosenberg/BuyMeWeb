import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Homework10 {

    private static ChromeDriver driver;
    private static ExtentReports extent;
    private static ExtentTest test;

    @BeforeClass
    public static void main() throws ParserConfigurationException, IOException {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\User\\Desktop\\New folder\\1.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        test = extent.createTest("Google Translate", "Check");
        extent.setSystemInfo("Environment", "Production");
        extent.setSystemInfo("Tester", "Nechama");
        extent.setSystemInfo("Company", "D.B.D");
        String currentTime = String.valueOf(System.currentTimeMillis());
        boolean driverEstablish = false;
        try {
            test.log(Status.INFO, "The test started");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            driverEstablish = true;
        } catch (Exception e) {
            e.printStackTrace();
            driverEstablish = false;
        } finally {
            if (driverEstablish == true) {
                test.log(Status.PASS, "Driver established successfully", MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot("C:\\Users\\User\\Desktop\\New folder\\" + currentTime, driver)).build());
            } else {
                test.log(Status.FAIL, "Driver established failed", MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot("C:\\Users\\User\\Desktop\\New folder\\" + currentTime, driver)).build());
            }
        }
    }
    @Test
    public void Test01() throws IOException {
        String currentTime = String.valueOf(System.currentTimeMillis());
        boolean goTo=false;
        try {
            test.log(Status.INFO, "Go to google translate ");
            driver.get("https://translate.google.com/");
            goTo=true;
        }catch (Exception e){
            e.printStackTrace();
            goTo=false;
        }
        finally {
        if (goTo == true) {
            test.log(Status.PASS, "Google Translate page opened", MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot("C:\\Users\\User\\Desktop\\New folder\\" + currentTime, driver)).build());
        } else {
            test.log(Status.FAIL, "Google Translate page was not found", MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot("C:\\Users\\User\\Desktop\\New folder\\" + currentTime, driver)).build());
        }
      }
    }
    @Test
    public void Test02() throws IOException {
        String currentTime = String.valueOf(System.currentTimeMillis());
        boolean press=false;
        try {
            test.log(Status.INFO, "translate button pressed");
            driver.findElement(By.className("go-button")).click();
            press=true;
        }catch (Exception e)
        {e.printStackTrace();
        press=false;
        }finally {
            if (press == true) {
                test.log(Status.PASS, "Translate button click", MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot("C:\\Users\\User\\Desktop\\New folder\\" + currentTime, driver)).build());
            } else {
                test.log(Status.FAIL, "Translate button did not click", MediaEntityBuilder.createScreenCaptureFromPath(Reports.takeScreenShot("C:\\Users\\User\\Desktop\\New folder\\" + currentTime, driver)).build());
            }
           }
         }
    @AfterClass
    public static void RunAfter(){
        test.log(Status.INFO,"Test end");
        driver.quit();
        extent.flush();

    }
}

