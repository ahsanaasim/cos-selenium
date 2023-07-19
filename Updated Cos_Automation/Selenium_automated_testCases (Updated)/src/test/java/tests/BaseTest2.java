package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class BaseTest2 {
    public WebDriver driver;

    Set<Cookie> cookies;

    public ExtentReports extent;
    public ExtentTest extentTest;

    @BeforeMethod
    public void setup () throws IOException {

        try
        {
            for(Cookie cookie:cookies)
            {
                driver.manage().addCookie(cookie);
            }
        }
        catch(Throwable e)
        {
            System.err.println("Error While setting Cookies: "+ e.getMessage());
        }
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        String driverPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", driverPath + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            // Take screenshot and save it to the "screenshots" folder
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("screenshots/" + result.getName() + ".jpg"));
        }
    }



    @AfterMethod
    public void teardown () {
        try
        {
            cookies=driver.manage().getCookies();
            /*if(driver != null){
                driver.quit();
            }*/
        }
        catch(Throwable e)
        {
            System.err.println("Error While getting Cookies:" + e.getMessage());
        }
//         driver.quit();
    }
}
