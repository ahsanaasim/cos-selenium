package tests.US228NewUpdatedWelcomeUI;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest2;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class Special23Scenerios extends BaseTest2 {
    Properties prop = ConfigUtill.getConfig();


    @Test(priority = 1)
    @TestParameters(testCaseId = {"TC-00"})
    public void TC_00_MakeChargerToAvailableFromAuthorizedState() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        guestFlow.makeChargerAvailableFromAuthorizeState("Charger ev updated");
        driver.quit();

    }


    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-0"})
    public void TC_00_MakeUsedChargerAvailable() throws InterruptedException {
        MapDetails mapDetails = new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        loginPage.VerifyValidLogin();
        guestFlow.makeScriptUsedChargerAvailable();
    }



//    @Test(priority = 6)
//    @TestParameters(testCaseId = {"TC-1"})
//    public void TC_1_CheckAvailableStatusForAvailableCharger() throws InterruptedException {
//        CreateCharger operation =new CreateCharger(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
//        guestVerificationPage.GoToAvailableCharger(prop.getProperty("Selenium889ChargerQR"));//Selenium 889
//        Assert.assertTrue(guestVerificationPage.verifyTextMatching(1000,GuestVerificationPage.ChargerAvailableStatus,"Available Now"));
//        Assert.assertTrue(guestVerificationPage.verifyAFieldIsDisable(1000,GuestVerificationPage.StatChargingButton));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ThanksForScanningTitle));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ProvidePhnNumberTitle));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.PhoneNumberField));
//        driver.close();
//
//    }
//
//    @Test(priority = 7)
//    @TestParameters(testCaseId = {"TC-2"})
//    public void TC_2_CheckRestrictedStatusForTheRestrictedCharger() throws InterruptedException {
//        CreateCharger operation =new CreateCharger(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
//        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToRestrictedCharger(prop.getProperty("RestrictedChargerQR"));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ChargerRestrictedStatus));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.RestrictedTextInBox));
//        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.MaxChargingRate,"N/A"));
//        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.FeeToInitiate,"N/A"));
//        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.FeePerKwh,"N/A"));
//        driver.close();
//
//    }
//
//    @Test(priority = 8)
//    @TestParameters(testCaseId = {"TC-3"})
//    public void TC_3_CheckDownStatusForDownCharger() throws InterruptedException {
//        CreateCharger operation =new CreateCharger(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
//        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToRestrictedCharger(prop.getProperty("DownChargerQR"));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ChargerDownStatus));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.PlugTypeForUnavailableChargers));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.OfflineTextInBox));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.ReportAProblem));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.AskCosaButton));
//        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.StatChargingButton));
//        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.ThanksForScanningTitle));
//        driver.close();
//
//    }
//
//    @Test(priority = 9)
//    @TestParameters(testCaseId = {"TC-4"})
//    public void TC_4_CheckInvalidQRStatusForBrokenLink() throws InterruptedException {
//        CreateCharger operation =new CreateCharger(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
//        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToRestrictedCharger(prop.getProperty("InvalidChargerQR"));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(3000,GuestVerificationPage.ChargerInvalidQRStatus));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.MsgUnderInvalidQRCode));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.PlugTypeForUnavailableChargers));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.OfflineTextInBox));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.ReportAProblem));
//        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.PhoneNumberField));
//        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.AskCosaButton));
//        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.StatChargingButton));
//        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.ThanksForScanningTitle));
//        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.MaxChargingRate,"N/A"));
//        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.FeeToInitiate,"N/A"));
//        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.FeePerKwh,"N/A"));
//        driver.close();
//
//
//
//
//    }
//
//    @Test(priority = 10)
//    @TestParameters(testCaseId = {"TC-5"})
//    public void TC_5_CheckUnavailableStatus() throws InterruptedException {
//        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
//        CreateCharger operation =new CreateCharger(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
//        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
//        SimulationPage simulationPage = new SimulationPage(driver);
//        LoginPage login = new LoginPage(driver);
//        login.VerifyValidLogin();
//        editCharger.makeAChargerOfflineFromDrawer("D10 Charger-24");
//        operation.ClickButton(CosAdminChargerList.EditButton,3000);
//        operation.ClickButton(UpdateChargerPropertyAdmin.CopyButton,3000);
//        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
//        guestVerificationPage.SwitchToTab(1);
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(3000,GuestVerificationPage.ChargerUnavailableStatus));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.OfflineTextInBox));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.ReportAProblem));
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.AskCosaButton));
//        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.StatChargingButton));
//        driver.close();
//
//
//
//    }
//
//    @Test(priority = 11)
//    @TestParameters(testCaseId = {"TC-6"})
//    public void TC_6_CheckAvailableStatusAfterChangingFromUnavailable() throws InterruptedException {
//        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
//        CreateCharger operation =new CreateCharger(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
//        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
//        SimulationPage simulationPage = new SimulationPage(driver);
//        LoginPage login = new LoginPage(driver);
//        login.VerifyValidLogin();
//        editCharger.makeAChargerOnlineFromDrawer("D10 Charger-24");
//        operation.ClickButton(CosAdminChargerList.EditButton,3000);
//        operation.ClickButton(UpdateChargerPropertyAdmin.CopyButton,3000);
//        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
//        guestVerificationPage.SwitchToTab(1);
//        Assert.assertTrue(guestVerificationPage.verifyTextMatching(1000,GuestVerificationPage.ChargerAvailableStatus,"Available Now"));
//        Assert.assertTrue(guestVerificationPage.verifyAFieldIsDisable(1000,GuestVerificationPage.StatChargingButton));
//
//
//
//    }
//
//
    @Test(priority = 12)
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckWhenGuest1ComingBackBrowserAfter2MinVerifyingPhoneNumber() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        Assert.assertTrue(guestFlow.SelectChargerFromSimulator("Selenium 5"));
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        Assert.assertTrue(operation.ClickButton(SimulationPage.BootChargerButton,2000));
        Assert.assertTrue(operation.ClickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(2000,"666666"));
        operation.ClickButton(OTPVerificationPage.VerifyButton,2000);
        guestFlow.SwitchToTab(0);
        Assert.assertTrue(operation.ClickButton(GuestFlow.PluginChargerbtn,2500));
        simulationPage.SelectChargerStatusFromSimulator("Charging");
        operation.ClickButton(SimulationPage.ChargerStatusSaveButton,3000);
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.ClickButton(GuestFlow.AuthorizeButton,1500));
        System.out.println("URL  =  "+driver.getCurrentUrl());
        Assert.assertTrue(guestFlow.verifyChargingNowTitle());
        guestFlow.LengthOfSession(20000);
        guestFlow.PressAndHold(GuestFlow.PressAndHoldButton);
        guestFlow.LengthOfSession(20000);
        driver.close();



    }
//
//    @Test(priority = 13)
//    @TestParameters(testCaseId = {"TC-8"})
//    public void TC_8_CheckWhenGuest1ComingBackBrowserAfter2MinVerifyingPhoneNumber() throws InterruptedException {
//        CreateCharger operation =new CreateCharger(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
//        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
//        SimulationPage simulationPage = new SimulationPage(driver);
//        GuestFlow guestFlow = new GuestFlow(driver);
//        LoginPage login = new LoginPage(driver);
//        guestVerificationPage.GoToAvailableCharger(prop.getProperty("Selenium5ChargerQR"));//Selenium 5
//        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
//        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
//        Assert.assertTrue(guestFlow.SendOtp(2000,"666666"));
//        operation.ClickButton(OTPVerificationPage.VerifyButton,2000);
//        Assert.assertTrue(guestFlow.verifyAnElementDisplayedOrNot(5000,IdlePage.IdlePageTitle));
//
//
//
//
//    }

    @Test(priority = 15)
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckChargerNotConnectedAlertAfterAuthorizing() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        Assert.assertTrue(guestFlow.SelectChargerFromSimulator("Selenium 18"));
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        Assert.assertTrue(operation.ClickButton(SimulationPage.BootChargerButton,2000));
        Assert.assertTrue(operation.ClickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(2000,"666666"));
        operation.ClickButton(OTPVerificationPage.VerifyButton,2000);
        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.ClickButton(GuestFlow.AuthorizeButton,1500));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(3000,GuestFlow.ChargerNotConnected,"Charger Not Connected"));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(3000,GuestFlow.AlertUnderChargerNotConnected,guestFlow.AlertTextUnderChargerNotConnected()));
//        driver.quit();



    }


    @Test(priority = 16)
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckChargerNotConnectedAlertAfterAuthorizing() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        Assert.assertTrue(guestFlow.SelectChargerFromSimulator("Messi Charger"));
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        Assert.assertTrue(operation.ClickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(2000,"666666"));
        operation.ClickButton(OTPVerificationPage.VerifyButton,2000);
        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.ClickButton(GuestFlow.AuthorizeButton,1500));
        guestFlow.SwitchToTab(0);
        Assert.assertTrue(operation.ClickButton(GuestFlow.PluginChargerbtn,2500));
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(3000,GuestFlow.PlugConnected,"Plug Connected."));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(3000,GuestFlow.AlertUnderChargerNotConnected,guestFlow.AlertTextUnderPlugConnected()));

//        driver.quit();



    }




    @Test(priority = 17)
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_15_ChangeTheStatusOfAllSimulatorChargerOnline() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.VerifyValidLogin();
        guestFlow.MakeAllChargerOfSimulatorOnline();


//        driver.quit();



    }







}
