package tests.US69GuestFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class GuestFlowTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_GuestFlow() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        Assert.assertTrue(guestFlow.SelectChargerFromSimulator("Selenium 18"));
        Assert.assertTrue(operation.ClickButton(SimulationPage.BootChargerButton,2000));
        Assert.assertTrue(operation.ClickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(2000,"666666"));
        operation.ClickButton(OTPVerificationPage.VerifyButton,2000);
        guestFlow.SwitchToTab(0);
        Assert.assertTrue(operation.ClickButton(GuestFlow.PluginChargerbtn,500));
        simulationPage.SelectChargerStatusFromSimulator("Charging");
        operation.click(SimulationPage.ChargerStatusSaveButton);
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.ClickButton(GuestFlow.AuthorizeButton,1500));
        System.out.println("URL  =  "+driver.getCurrentUrl());
        Assert.assertTrue(guestFlow.verifyChargingNowTitle());
        guestFlow.LengthOfSession(90000);
        guestFlow.SwitchToTab(0);
        operation.ClickButton(GuestFlow.DisconnectChargerbtn,3000);
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(guestFlow.verifyTotalFee());
        Assert.assertTrue(guestFlow.verifyChargingSessionEnded());


  }


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_GuestFlowWithIDleSession() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        Assert.assertTrue(guestFlow.SelectChargerFromSimulator("Selenium 529"));
        Assert.assertTrue(operation.ClickButton(SimulationPage.BootChargerButton,2000));
        Assert.assertTrue(operation.ClickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(2000,"666666"));
        operation.ClickButton(OTPVerificationPage.VerifyButton,2000);
        guestFlow.SwitchToTab(0);
        Assert.assertTrue(operation.ClickButton(GuestFlow.PluginChargerbtn,500));
        simulationPage.SelectChargerStatusFromSimulator("Charging");
        operation.click(SimulationPage.ChargerStatusSaveButton);
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.ClickButton(GuestFlow.AuthorizeButton,1500));
        System.out.println("URL  =  "+driver.getCurrentUrl());
        Assert.assertTrue(guestFlow.verifyChargingNowTitle());
        guestFlow.LengthOfSession(10000);
        guestFlow.PressAndHold(GuestFlow.PressAndHoldButton);
        guestFlow.LengthOfSession(810000);
        guestFlow.SwitchToTab(0);
        operation.ClickButton(GuestFlow.DisconnectChargerbtn,3000);
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(guestFlow.verifyTotalFeeIncludingIdleFee());
//        Assert.assertTrue(guestFlow.verifyChargingSessionEnded());




    }





    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-118"})
    public void TC_118_CheckChargersDetailsAndPlugType() throws InterruptedException{
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));


    }
    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-119"})
    public void TC_119_CheckMaxChargingRateAndPropertyAddress() throws InterruptedException{
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        Thread.sleep(7000);
        Assert.assertTrue(guestFlow.verifyMaxChargingRateUnderTitle());
        Assert.assertTrue(guestFlow.verifyPropertyAddressAndLocationAddress());

    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-119"})
    public void TC_119_1_CheckMaxChargingRateAndPropertyAddress() throws InterruptedException{
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(guestFlow.verifyMaxChargingRateUnderTitle());
        Assert.assertTrue(guestFlow.verifyPropertyAddressAndLocationAddress());

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-121"})
    public void TC_121_CheckChargerImage() throws InterruptedException{
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        Thread.sleep(7000);
        Assert.assertTrue(guestFlow.verifyChargerImage());

    }
    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-122"})
    public void TC_122_CheckChargingFeeDetails() throws InterruptedException{
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        Thread.sleep(7000);
        Assert.assertTrue(guestFlow.verifyInitiateSession());
        Assert.assertTrue(guestFlow.verifyFeePerKwh());
        Assert.assertTrue(guestFlow.verifyIdleFee());

    }
    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-123"})
    public void TC_123_CheckSignUpAndLoginButton() throws InterruptedException{
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        Thread.sleep(7000);
        Assert.assertTrue(guestFlow.verifySignUpAndLoginButton());

    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-124,125"})
    public void TC_124_125_CheckTitleAndSubtitleAboveSignUpButton() throws InterruptedException{
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        Thread.sleep(7000);
        Assert.assertTrue(guestFlow.verifyForMembersTitleAndSubtitle());

    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-126"})
    public void TC_126_CheckWhatHappensWhenGuestClicksOnSignUpButton() throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        Thread.sleep(7000);
        createCharger.ClickButton(GuestFlow.SignUpBtn,2000);
        Assert.assertTrue(guestFlow.verifySignUpButtonIsWorking());

    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-127"})
    public void TC_127_CheckWhatHappensWhenGuestClicksOnLoginButton() throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        Thread.sleep(7000);
        createCharger.ClickButton(GuestFlow.LoginBtn,2000);
        Assert.assertTrue(guestFlow.verifyLoginButtonButtonIsWorking());

    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-129"})
    public void TC_129_CheckWhatHappensWhenGuestRefreshThePage() throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        Dashboard dashboard =new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        Thread.sleep(6000);
        dashboard.RefreshBrowser();
        Thread.sleep(2000);
        Assert.assertTrue(guestFlow.verifyMaxChargingRateUnderTitle());
        Assert.assertTrue(guestFlow.verifyPropertyAddressAndLocationAddress());
        Assert.assertTrue(guestFlow.verifyChargerImage());
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(5000,GuestFlow.PhoneNoField));
        Assert.assertTrue(guestFlow.verifySignUpAndLoginButton());

    }
    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-131"})
    public void TC_131_CheckCountryFlagWithCode() throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        Dashboard dashboard =new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        Thread.sleep(6000);
        Assert.assertTrue(guestFlow.CountryFlagNameWithCode());

    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-132"})
    public void TC_132_CheckWhatHappensWhenGuestProvideAnInvalidInputInPhoneNumberField() throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        Thread.sleep(7000);
//        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"11",5000);
        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,2000));
        Assert.assertTrue(guestFlow.verifyEmptyPhoneNumberFieldErrorMsg());

    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-132"})
    public void TC_132_1CheckWhatHappensWhenGuestProvideAnInvalidInputInPhoneNumberField() throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        Thread.sleep(7000);
        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"1122",5000);
        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,2000));
        Assert.assertTrue(guestFlow.verifyInvalidPhoneNumberErrorMsg());

    }
    //    @Test(priority = 10)//Done
//    @TestParameters(testCaseId = {"TC-133"})
//    public void TC_133_CheckWhatHappensWhenGuestProvideAnInvalidInputInPhoneNumberField() throws InterruptedException{
//        CreateCharger createCharger = new CreateCharger(driver);
//        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
//        GuestFlow guestFlow = new GuestFlow(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"213333333333354645",5000);
//        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,2000));
//        Assert.assertTrue(guestFlow.verifyInvalidPhoneNumberErrorMsg());
//
//    }
    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-135"})
    public void TC_135_CheckWhatHappensWhenGuestDoesNotProvideAnyNumber () throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard = new Dashboard(driver);
        guestFlow.ClearPhoneNumberField(GuestFlow.PhoneNoField);
//        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"213333333333354645",5000);
        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,7000));
//        Assert.assertTrue(guestFlow.verifyTimer());
        Assert.assertTrue(guestFlow.verifyEmptyPhoneNumberFieldErrorMsg());

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-140"})
    public void TC_140_CheckWhatHappensWhenGuestClickOnChangeTheNumber () throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp =new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"1321545431",7000);
        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,2000));
        createCharger.ClickButton(GuestFlow.ChangePhoneNumber,3000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(5000,GuestFlow.PhoneNoField));

    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-142"})
    public void TC_141_142_CheckWhatHappensWhenGuestVerifyTheNewPhoneNumber () throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp =new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"1321545431",7000);
        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,2000));
        createCharger.ClickButton(GuestFlow.ChangePhoneNumber,3000);
        guestFlow.ClearPhoneNumberField(GuestFlow.PhoneNoField);
        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"8272543146",7000);
        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,2000));
        Assert.assertTrue(guestFlow.SendOtp(4000,"666666"));
        Assert.assertTrue(createCharger.ClickButton(GuestFlow.VerifyButton,300));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(5000,GuestFlow.NumberVerifiedPageTitle));

    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-143"})
    public void TC_143_CheckWhatHappensWhenGuestVerifyTheNewPhoneNumber () throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp =new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard = new Dashboard(driver);
        Thread.sleep(6000);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        createCharger.ClickButton(GuestFlow.ChangePhoneNumberTab2,6000);
        Thread.sleep(3000);
        dashboard.RefreshBrowser();
        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"1321545431",7000);
        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,1000));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(35000,GuestFlow.ResendButton));

    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-144,145,146"})
    public void TC_144_145_146_CheckWhatHappensWhenGuestClickOnResendButtonAfterThirtySeconds () throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp =new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard = new Dashboard(driver);
//        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
//        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"1321545431",7000);
//        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,1000));
        Assert.assertTrue(createCharger.ClickButton(GuestFlow.ResendButton,3000));
        Assert.assertTrue(guestFlow.verifyTimer());
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,GuestFlow.VerificationCodeSentNotify));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,GuestFlow.ResendButton));

    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-149"})
    public void TC_149_CheckVerifyFieldIsDisabledBeforeProvidingOTP () throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp =new CustomerSignUp(driver);
        Dashboard dashboard = new Dashboard(driver);
//        createCharger.ClickButton(GuestFlow.ChangePhoneNumberTab2,8000);
//        dashboard.RefreshBrowser();
//        Thread.sleep(2000);
//        driver.navigate().back();
//        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
//        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"1321545431",7000);
//        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,1000));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(4000,GuestFlow.VeirfyDisabledButton));

    }
    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-149"})
    public void TC_149_1_CheckVerifyFieldIsDisabledBeforeProvidingOTP () throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp =new CustomerSignUp(driver);
        Dashboard dashboard = new Dashboard(driver);
//        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
//        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"1321545431",7000);
//        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,1000));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(4000,GuestFlow.VeirfyDisabledButton));

    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-150"})
    public void TC_150_CheckWhatHappensWhenGuestProvidesWrongVerificationCode () throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp =new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard = new Dashboard(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/wkWAI4"));
//        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"1321545431",7000);
//        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,1000));
//        createCharger.ClickButton(GuestFlow.ResendButton2,30000);
        Assert.assertTrue(guestFlow.SendOtp(4000,"555555"));
        Assert.assertTrue(createCharger.ClickButton(GuestFlow.VerifyButton2,1500));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(0,GuestFlow.InvalidOTPNotification));

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-150"})
    public void TC_151_CheckWhatHappensWhenGuestProvidesValidVerificationCode () throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp =new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard = new Dashboard(driver);
//        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
//        createCharger.writeInputText(pages.GuestFlow.PhoneNoField,"1321545431",7000);
//        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn,1000));
        dashboard.RefreshBrowser();
        Assert.assertTrue(guestFlow.SendOtp(4000,"666666"));
        Assert.assertTrue(createCharger.ClickButton(GuestFlow.VerifyButton2,300));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(5000,GuestFlow.NumberVerifiedPageTitle));

    }
    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-152"})
    public void TC_152_CheckWhatHappensWhenGuestRefreshThePageAfterProvidingValidVerificationCode () throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp =new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard = new Dashboard(driver);
        dashboard.RefreshBrowser();
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(5000,GuestFlow.NumberVerifiedPageTitle));

    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-152"})
    public void TC_153_CheckWhatHappensWhenGuestRefreshThePageAfterProvidingValidVerificationCode () throws InterruptedException{
        CreateCharger createCharger = new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp =new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard = new Dashboard(driver);
        dashboard.RefreshBrowser();
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(5000,GuestFlow.NumberVerifiedPageTitle));

    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_109_CheckWhenGuest1AndGuest2ScansSameChargerButGuest1VerifiedHisPhoneNumberBeforeGuest2  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        driver.manage().deleteAllCookies();
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/dHvDx1"));
        Assert.assertTrue(createCharger.writeInputText(pages.GuestFlow.PhoneNoField, "1111111111111", 5000));
        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn, 2000));
        Assert.assertTrue(guestFlow.SendOtp(4000, "666666"));
        Assert.assertTrue(createCharger.ClickButton(GuestFlow.VerifyButton2, 300));
        Assert.assertTrue(createCharger.ClickButton(GuestFlow.StartChargingButton, 5000));
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
        if(driver.findElement(By.xpath("(//span[@class='red-color weight-600'])[2]")).isDisplayed()){
            System.out.println("Expected element is displayed");
        }
        else{
            System.out.println("Expected element is not displayed");

        }
        driver.close();
    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1054549_CheckWhenGuest1AndGuest2ScansSameChargerButGuest1VerifiedHisPhoneNumberBeforeGuest2  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/wkWAI4"));
//        Assert.assertTrue(createCharger.writeInputText(pages.GuestFlow.PhoneNoField, "1111111111111", 5000));
//        Assert.assertTrue(createCharger.ClickButton(pages.GuestFlow.ContinueGuestBtn, 2000));
//        Assert.assertTrue(guestFlow.SendOtp(4000,"666666"));
//        Assert.assertTrue(createCharger.ClickButton(GuestFlow.VerifyButton,300));
//        Thread.sleep(3000);
//        driver.close();
////        String driverPath = System.getProperty("user.dir");
////        System.setProperty("webdriver.chrome.driver", driverPath + "\\drivers\\chromedriver.exe");
////        driver = new ChromeDriver();
////        driver.manage().window().maximize();
////        Thread.sleep(5000);
//        driver.get("https://test-app.chargeonsite.com/charger/dHvDx1");
//        Thread.sleep(3000);
//        if(driver.findElement(By.xpath("(//input[@class='form-control '])[2]")).isDisplayed()){
//            System.out.println("Expected element is displayed");
//        }
//        else{
//            System.out.println("Expected element is not displayed");
//
//        }
////
    }
    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-135"})
    public void TC_135_CheckWhatHahjbhkjhkj() throws InterruptedException {
        driver.get("https://www.google.com/");
        String s = "0.19 kWh";
        String EC = s.replaceAll("/[^.0-9]/g", "");
        System.out.println(EC);
        Float EnergyConsumed = Float.parseFloat(EC);
        String m = "Session fee $11.22";
        String SF = m.replaceAll("/[^.0-9]/g", "");
        Float SessionFee = Float.parseFloat(SF);
        System.out.println(SessionFee);
        String n = "Utilization fee $11.22/ kWh";
        String UF = n.replaceAll("/[^.0-9]/g", "");
        Float UtilizationFee = Float.parseFloat(UF);
        Float TotalFee = (UtilizationFee * EnergyConsumed) + SessionFee;
        System.out.println(TotalFee);
    }




}
