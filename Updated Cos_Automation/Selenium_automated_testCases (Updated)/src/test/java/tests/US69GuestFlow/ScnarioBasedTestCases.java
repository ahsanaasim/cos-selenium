package tests.US69GuestFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest2;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ScnarioBasedTestCases extends BaseTest2 {


    //Make Selenium 5, Selenium 272 Charger Available Before running the script
    @Test(priority = 1)//Selenium 92
    @TestParameters(testCaseId = {"TC-109"})
    public void TC_109_CheckWhenGuest1AndGuest2ScansSameChargerButGuest1VerifiedHisPhoneNumberBeforeGuest2  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        driver.manage().deleteAllCookies();
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/dHvDx1"));
        Assert.assertTrue(createCharger.writeInputText(pages.GuestFlow.PhoneNoField, "1111111111111", 5000));
        Assert.assertTrue(createCharger.clickButton(pages.GuestFlow.ContinueGuestBtn, 2000));
        Assert.assertTrue(guestFlow.SendOtp(4000, "666666"));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.VerifyButton2, 300));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.StartChargingButton, 5000));
        Thread.sleep(5000);
        driver.close();
        String driverPath = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", driverPath + "\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://test-app.chargeonsite.com/charger/dHvDx1");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@class='form-control '])[2]")).sendKeys("1162356563");
        driver.findElement(By.xpath("//div[@class='ant-col ant-col-16']//div//div//form[@id='basic']//div//button[@type='submit']")).click();
        Thread.sleep(3000);
        WebElement currentElement = driver.switchTo().activeElement();
        currentElement.sendKeys("666666");
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-block common-btn-primary mt-10 mb-35']")).click();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        if(driver.findElement(By.xpath("(//span[@class='red-color weight-600'])[2]")).isDisplayed()){
            System.out.println("Expected element is displayed");
        }
        else{
            System.out.println("Expected element is not displayed");

        }
        driver.close();
    }

    @Test(priority = 2)//Selenium 65
    @TestParameters(testCaseId = {"TC-110"})
    public void TC_110_CheckWhenGuest1ScannedQRCodeOfAnAvailableChargerAndHeVerifiesThePhoneNumberAndLeavesAfter2MinHeComesBackToTheSameBrowserByScanningOrByURL() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/wkWAI4"));
        Assert.assertTrue(createCharger.writeInputText(pages.GuestFlow.PhoneNoField, "1111111111111", 5000));
        Assert.assertTrue(createCharger.clickButton(pages.GuestFlow.ContinueGuestBtn, 2000));
        Assert.assertTrue(guestFlow.SendOtp(4000,"666666"));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.VerifyButton,300));
        Thread.sleep(3000);
        driver.close();
        String driverPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", driverPath + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://test-app.chargeonsite.com/charger/wkWAI4");
        Thread.sleep(6000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        if(driver.findElement(By.xpath("(//input[@class='form-control '])[2]")).isDisplayed()){
            System.out.println("Expected element is displayed");
        }
        else{
            System.out.println("Expected element is not displayed");

        }
        driver.close();

    }

    @Test(priority = 3)//Selenium 889
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_111_CheckWhenGuest1AndGuest2ScansSameChargerButGuest1VerifiedHisPhoneNumberBeforeGuest2  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/tIljMh"));
        Assert.assertTrue(createCharger.writeInputText(pages.GuestFlow.PhoneNoField, "1111111111111", 5000));
        Assert.assertTrue(createCharger.clickButton(pages.GuestFlow.ContinueGuestBtn, 2000));
        Assert.assertTrue(guestFlow.SendOtp(4000,"666666"));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.VerifyButton,300));
        Thread.sleep(3000);
        driver.close();
        String driverPath = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", driverPath + "\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://test-app.chargeonsite.com/charger/tIljMh");
        Thread.sleep(3000);
        if(driver.findElement(By.xpath("(//input[@class='form-control '])[2]")).isDisplayed()){
            System.out.println("Expected element is displayed");
        }
        else{
            System.out.println("Expected element is not displayed");

        }
        driver.close();

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-112"})
    public void TC_112_CheckWhenGuest1AndGuest2ScansSameChargerButGuest1VerifiedHisPhoneNumberBeforeGuest2 () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/tIljMh"));
        Assert.assertTrue(createCharger.writeInputText(pages.GuestFlow.PhoneNoField, "1111111111111", 5000));
        Assert.assertTrue(createCharger.clickButton(pages.GuestFlow.ContinueGuestBtn, 2000));
        Assert.assertTrue(guestFlow.SendOtp(4000,"666666"));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.VerifyButton,300));
        Thread.sleep(3000);
        driver.close();
        String driverPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", driverPath + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://test-app.chargeonsite.com/charger/wkWAI4");
        Thread.sleep(10000);
        if(driver.findElement(By.xpath("(//input[@class='form-control '])[2]")).isDisplayed()){
            System.out.println("Expected element is displayed");
        }
        else{
            System.out.println("Expected element is not displayed");

        }
        driver.close();

    }

    @Test(priority = 5)//Selenium 719
    @TestParameters(testCaseId = {"TC-113"})
    public void TC_113_GuestFlow() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/T5vnCV"));
        driver.manage().deleteAllCookies();
        Assert.assertTrue(createCharger.writeInputText(pages.GuestFlow.PhoneNoField, "1234567890", 5000));
        Assert.assertTrue(createCharger.clickButton(pages.GuestFlow.ContinueGuestBtn, 2000));
        Assert.assertTrue(guestFlow.SendOtp(4000, "666666"));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.VerifyButton, 300));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.StartChargingButton, 10000));
        guestFlow.SwitchToIframe();
        Assert.assertTrue(createCharger.writeInputText(GuestFlow.CardNumber, "424242424242424242424242424", 6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(createCharger.clickButton(GuestFlow.AuthorizeButton, 1500));guestFlow.NewTabOpenAndSwitchToNewTab(1);
        loginPage.verifyValidLogin();
        guestFlow.GoToSimulator();
        Assert.assertTrue(guestFlow.SelectChargerFromSimulator("Selenium 719"));
        Thread.sleep(4000);
        Assert.assertTrue(createCharger.clickButton(GuestFlow.PluginChargerbtn, 500));
        Thread.sleep(5000);
        driver.close();
        guestFlow.SwitchToTab(0);
        driver.close();
        String driverPath = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", driverPath + "\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://test-app.chargeonsite.com/charger/Md_vU4");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@class='form-control '])[2]")).sendKeys("1234567890");
        driver.findElement(By.xpath("//div[@class='ant-col ant-col-16']//div//div//form[@id='basic']//div//button[@type='submit']")).click();
        Thread.sleep(3000);
        WebElement currentElement = driver.switchTo().activeElement();
        currentElement.sendKeys("666666");
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-block common-btn-primary mt-10 mb-35']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='ant-col ant-col-16']//span[contains(text(),'START CHARGING')]")).click();
        Thread.sleep(4000);
        WebElement iframeByTitleContains = driver.findElement(By.xpath("(//iframe[contains(@title,'Secure card payment input frame')])[4]"));
        driver.switchTo().frame(iframeByTitleContains);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Card number']")).sendKeys("424242424242424242424242424");
        driver.switchTo().defaultContent();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//button[@type='submit']/span[contains(text(),'AUTHORIZE')])[4]")).click();
        Thread.sleep(1500);
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(4000);
        driver.get("https://test-admin.chargeonsite.com/login");
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jo@email.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("2&57DyhUTH1c");
        driver.findElement(By.xpath("//span[contains(.,'Login')]")).click();
        Thread.sleep(2000);
        driver.get("https://test-admin.chargeonsite.com/simulation/simulator");
        Thread.sleep(1500);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("rc_select_2")).sendKeys("Selenium 529");
        WebElement selectitem = driver.findElement(By.id("rc_select_2"));
        Thread.sleep(2500);
        selectitem.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='ml-10'][contains(text(),'Plug In Your Charger')]")).click();
        Thread.sleep(4000);
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(10000);
        System.out.println("URL  =  "+driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
        if (driver.findElement(By.xpath("(//div[@class='pageTitle'][contains(text(),'Charging Now')])[2]")).isDisplayed()){
            System.out.println("Charging Now");
        }
        else {
            System.out.println("Error");
        }
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='ml-10'][contains(text(),'Disconnect the Charger')]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//span[@class='ant-select-clear']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("rc_select_2")).sendKeys("Selenium 719");
        WebElement selectitem2 = driver.findElement(By.id("rc_select_2"));
        Thread.sleep(2000);
        selectitem2.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='ml-10'][contains(text(),'Disconnect the Charger')]")).click();
        Thread.sleep(5000);
        driver.quit();


    }

    @Test(priority = 6)//Make Selenium 272 Charger Available Before running the script
    @TestParameters(testCaseId = {"TC-114"})
    public void TC_114_GuestFlow() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        driver.manage().deleteAllCookies();
        Assert.assertTrue(createCharger.writeInputText(pages.GuestFlow.PhoneNoField, "1234567890", 5000));
        Assert.assertTrue(createCharger.clickButton(pages.GuestFlow.ContinueGuestBtn, 2000));
        Assert.assertTrue(guestFlow.SendOtp(4000, "666666"));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.VerifyButton, 300));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.StartChargingButton, 10000));
        guestFlow.SwitchToIframe();
        Assert.assertTrue(createCharger.writeInputText(GuestFlow.CardNumber, "424242424242424242424242424", 6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(createCharger.clickButton(GuestFlow.AuthorizeButton, 1500));
        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        loginPage.verifyValidLogin();
        guestFlow.GoToSimulator();
        Assert.assertTrue(guestFlow.SelectChargerFromSimulator("Selenium 272"));
        Thread.sleep(4000);
        Assert.assertTrue(createCharger.clickButton(GuestFlow.PluginChargerbtn, 500));
        guestFlow.SwitchToTab(0);
        Thread.sleep(35000);
        guestFlow.sliderMover(GuestFlow.SliderStart,GuestFlow.OutsideSlider);
        Thread.sleep(3000);
        driver.close();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://test-app.chargeonsite.com/charger/K-5UbQ");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//input[@class='form-control '])[2]")).sendKeys("1234567890");
        driver.findElement(By.xpath("//div[@class='ant-col ant-col-16']//div//div//form[@id='basic']//div//button[@type='submit']")).click();
        Thread.sleep(3000);
        WebElement currentElement = driver.switchTo().activeElement();
        currentElement.sendKeys("666666");
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-block common-btn-primary mt-10 mb-35']")).click();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        if(driver.findElement(By.xpath("(//div[@class='idlePageTitle'])[2]")).isDisplayed()){
            System.out.println("Successfully redirect to Idle Session");
        }
        else{
            System.out.println("Not redirecting to Idle Session");

        }
        driver.quit();


    }

    @Test(priority = 7)//Make Selenium 5 Charger Available Before running the script
    @TestParameters(testCaseId = {"TC-113"})
    public void TC_115_116_GuestFlow() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/byjUql"));
        Assert.assertTrue(createCharger.writeInputText(pages.GuestFlow.PhoneNoField, "1234567890", 5000));
        Assert.assertTrue(createCharger.clickButton(pages.GuestFlow.ContinueGuestBtn, 2000));
        Assert.assertTrue(guestFlow.SendOtp(4000, "666666"));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.VerifyButton, 300));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.StartChargingButton, 10000));
        guestFlow.SwitchToIframe();
        Assert.assertTrue(createCharger.writeInputText(GuestFlow.CardNumber, "424242424242424242424242424", 6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(createCharger.clickButton(GuestFlow.AuthorizeButton, 1500));
        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        Thread.sleep(5000);
        loginPage.verifyValidLogin();
        guestFlow.GoToSimulator();
        Assert.assertTrue(guestFlow.SelectChargerFromSimulator("Selenium 5"));
        Thread.sleep(4000);
        Assert.assertTrue(createCharger.clickButton(GuestFlow.PluginChargerbtn, 500));
        guestFlow.SwitchToTab(0);
        Thread.sleep(30000);
        guestFlow.sliderMover(GuestFlow.SliderStart,GuestFlow.OutsideSlider);
        Thread.sleep(3000);
        driver.close();
        String driverPath = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", driverPath + "\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://test-app.chargeonsite.com/charger/byjUql");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//input[@class='form-control '])[2]")).sendKeys("1234567890");
        driver.findElement(By.xpath("//div[@class='ant-col ant-col-16']//div//div//form[@id='basic']//div//button[@type='submit']")).click();
        Thread.sleep(3000);
        WebElement currentElement = driver.switchTo().activeElement();
        currentElement.sendKeys("666666");
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-block common-btn-primary mt-10 mb-35']")).click();
        Thread.sleep(5000);
        if(driver.findElement(By.xpath("(//div[@class='idlePageTitle'])[2]")).isDisplayed()){
            System.out.println("Successfully redirect to Idle Session");
        }
        else{
            System.out.println("Not redirecting to Idle Session");

        }

    }

    @Test(priority = 8)//Selenium 889
    @TestParameters(testCaseId = {"TC-117"})
    public void TC_117_GuestFlow() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage Base = new BasePage(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/tIljMh"));
        Assert.assertTrue(createCharger.writeInputText(pages.GuestFlow.PhoneNoField, "2359784125", 5000));
        Assert.assertTrue(createCharger.clickButton(pages.GuestFlow.ContinueGuestBtn, 2000));
        Assert.assertTrue(guestFlow.SendOtp(4000, "666666"));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.VerifyButton, 300));
        Assert.assertTrue(createCharger.clickButton(GuestFlow.StartChargingButton, 10000));
        guestFlow.SwitchToIframe();
        Assert.assertTrue(createCharger.writeInputText(GuestFlow.CardNumber, "424242424242424242424242424", 6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(createCharger.clickButton(GuestFlow.AuthorizeButton, 1500));
        Assert.assertTrue(guestFlow.verifyLoading());
        Assert.assertTrue(Base.verifyTextMatching(5000, GuestFlow.ChargerNotConnected, "Charger Not Connected"));
    }


}
