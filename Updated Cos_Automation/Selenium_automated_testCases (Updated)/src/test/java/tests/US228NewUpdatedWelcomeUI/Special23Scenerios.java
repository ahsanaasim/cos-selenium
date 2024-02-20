package tests.US228NewUpdatedWelcomeUI;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest2;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class Special23Scenerios extends BaseTest2 {
    Properties prop = ConfigUtill.getConfig();


//    @Test(priority = 1)
//    @TestParameters(testCaseId = {"TC-00"})
//    public void TC_00_MakeChargerToAvailableFromAuthorizedState() throws InterruptedException {
//        CreateCharger operation =new CreateCharger(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
//        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
//        SimulationPage simulationPage = new SimulationPage(driver);
//        GuestFlow guestFlow = new GuestFlow(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.VerifyValidLogin();
//        guestFlow.GoToSimulator();
//        guestFlow.makeChargerAvailableFromAuthorizeState("Charger ev updated");
//        driver.quit();
//
//    }


    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-0"})
    public void TC_00_MakeUsedChargerAvailable() throws InterruptedException {
        MapDetails mapDetails = new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        loginPage.verifyValidLogin();
        guestFlow.makeScriptUsedChargerAvailable();
        driver.quit();
    }



    @Test(priority = 6)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckAvailableStatusForAvailableCharger() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        guestVerificationPage.GoToAvailableCharger(prop.getProperty("Selenium889ChargerQR"));//Selenium 889
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(1000,GuestVerificationPage.ChargerAvailableStatus,"Available Now"));
        Assert.assertTrue(guestVerificationPage.verifyAFieldIsDisable(1000,GuestVerificationPage.StatChargingButton));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ThanksForScanningTitle));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ProvidePhnNumberTitle));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.PhoneNumberField));
        driver.quit();

    }

    @Test(priority = 7)
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckRestrictedStatusForTheRestrictedCharger() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        guestVerificationPage.GoToRestrictedCharger(prop.getProperty("RestrictedChargerQR"));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ChargerRestrictedStatus));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.RestrictedTextInBox));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.MaxChargingRate,"N/A"));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.FeeToInitiate,"N/A"));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.FeePerKwh,"N/A"));
        driver.quit();

    }

    @Test(priority = 8)
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckDownStatusForDownCharger() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        guestVerificationPage.GoToRestrictedCharger(prop.getProperty("DownChargerQR"));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ChargerDownStatus));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.PlugTypeForUnavailableChargers));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.OfflineTextInBox));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.ReportAProblem));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.AskCosaButton));
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.StatChargingButton));
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.ThanksForScanningTitle));
        driver.quit();

    }

    @Test(priority = 9)
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckInvalidQRStatusForBrokenLink() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        guestVerificationPage.GoToRestrictedCharger(prop.getProperty("InvalidChargerQR"));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(3000,GuestVerificationPage.ChargerInvalidQRStatus));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.MsgUnderInvalidQRCode));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.PlugTypeForUnavailableChargers));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.OfflineTextInBox));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.ReportAProblem));
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.PhoneNumberField));
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.AskCosaButton));
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.StatChargingButton));
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.ThanksForScanningTitle));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.MaxChargingRate,"N/A"));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.FeeToInitiate,"N/A"));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.FeePerKwh,"N/A"));
        driver.quit();




    }

    @Test(priority = 10)
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckUnavailableStatus() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        LoginPage login = new LoginPage(driver);
        login.verifyValidLogin();
        editCharger.makeAChargerOfflineFromDrawer("D10 Charger-24");
        operation.clickButton(CosAdminChargerList.EditButton,3000);
        operation.clickButton(UpdateChargerPropertyAdmin.CopyButton,3000);
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestVerificationPage.switchToTab(1);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(3000,GuestVerificationPage.ChargerUnavailableStatus));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.OfflineTextInBox));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.ReportAProblem));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.AskCosaButton));
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.StatChargingButton));
        driver.quit();



    }

    @Test(priority = 11)
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckAvailableStatusAfterChangingFromUnavailable() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        LoginPage login = new LoginPage(driver);
        login.verifyValidLogin();
        editCharger.makeAChargerOnlineFromDrawer("D10 Charger-24");
        operation.clickButton(CosAdminChargerList.EditButton,3000);
        operation.clickButton(UpdateChargerPropertyAdmin.CopyButton,3000);
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestVerificationPage.switchToTab(1);
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(1000,GuestVerificationPage.ChargerAvailableStatus,"Available Now"));
        Assert.assertTrue(guestVerificationPage.verifyAFieldIsDisable(1000,GuestVerificationPage.StatChargingButton));
        driver.quit();



    }


    @Test(priority = 12)
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckGuest1CanMoveToIdlePage() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyValidLogin();
        guestFlow.goToSimulator();
        Assert.assertTrue(guestFlow.selectChargerFromSimulator("Selenium 5"));
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        Assert.assertTrue(operation.clickButton(SimulationPage.BootChargerButton,2000));
        Assert.assertTrue(operation.clickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.switchToTab(1);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(5000,"666666"));
        operation.clickButton(OTPVerificationPage.VerifyButton,2000);
        guestFlow.switchToTab(0);
        Assert.assertTrue(operation.clickButton(GuestFlow.PluginChargerbtn,2500));
        simulationPage.SelectChargerStatusFromSimulator("Charging");
        operation.clickButton(SimulationPage.ChargerStatusSaveButton,3000);
        guestFlow.switchToTab(1);
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.clickButton(GuestFlow.AuthorizeButton,1500));
        System.out.println("URL  =  "+driver.getCurrentUrl());
        Assert.assertTrue(guestFlow.verifyChargingNowTitle());
        guestFlow.LengthOfSession(20000);
        guestFlow.PressAndHold(GuestFlow.PressAndHoldButton);
        Assert.assertTrue(guestFlow.verifyAnElementDisplayedOrNot(5000,IdlePage.IdlePageTitle));
        guestFlow.LengthOfSession(20000);
        driver.quit();



    }
    //
    @Test(priority = 13)
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckGuest1CanMoveToIdlePageAfterClosingBrowser() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage login = new LoginPage(driver);
        guestVerificationPage.GoToAvailableCharger(prop.getProperty("Selenium5ChargerQR"));//Selenium 5
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(5000,"666666"));
        operation.clickButton(OTPVerificationPage.VerifyButton,2000);
        Assert.assertTrue(guestFlow.verifyAnElementDisplayedOrNot(5000,IdlePage.IdlePageTitle));
        driver.quit();




    }

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
        loginPage.verifyValidLogin();
        guestFlow.goToSimulator();
        Assert.assertTrue(guestFlow.selectChargerFromSimulator("Selenium 18"));
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        Assert.assertTrue(operation.clickButton(SimulationPage.BootChargerButton,2000));
        Assert.assertTrue(operation.clickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.switchToTab(1);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(5000,"666666"));
        operation.clickButton(OTPVerificationPage.VerifyButton,2000);
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.clickButton(GuestFlow.AuthorizeButton,1500));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(3000,GuestFlow.ChargerNotConnected,"Charger Not Connected"));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(3000,GuestFlow.AlertUnderChargerNotConnected,guestFlow.AlertTextUnderChargerNotConnected()));
        driver.quit();



    }


    @Test(priority = 16)
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckPlugConnectedAlertAfterAuthorizing() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyValidLogin();
        guestFlow.goToSimulator();
        Assert.assertTrue(guestFlow.selectChargerFromSimulator("Messi Charger"));
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        Assert.assertTrue(operation.clickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.switchToTab(1);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(5000,"666666"));
        operation.clickButton(OTPVerificationPage.VerifyButton,2000);
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.clickButton(GuestFlow.AuthorizeButton,1500));
        guestFlow.switchToTab(0);
        Assert.assertTrue(operation.clickButton(GuestFlow.PluginChargerbtn,2500));
        guestFlow.switchToTab(1);
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(4000,GuestFlow.PlugConnected,"Plug Connected."));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(1000,GuestFlow.AlertUnderPlugConnected,guestFlow.AlertTextUnderPlugConnected()));
        driver.quit();



    }


    @Test(priority = 18)
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckGuest1CanMoveToChargingNowPage() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyValidLogin();
        guestFlow.goToSimulator();
        Assert.assertTrue(guestFlow.selectChargerFromSimulator("Selenium 719"));
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        Assert.assertTrue(operation.clickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.switchToTab(1);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(5000,"666666"));
        operation.clickButton(OTPVerificationPage.VerifyButton,2000);
        guestFlow.switchToTab(0);
        Assert.assertTrue(operation.clickButton(GuestFlow.PluginChargerbtn,2500));
        simulationPage.SelectChargerStatusFromSimulator("Charging");
        operation.clickButton(SimulationPage.ChargerStatusSaveButton,3000);
        guestFlow.switchToTab(1);
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.clickButton(GuestFlow.AuthorizeButton,1500));
        System.out.println("URL  =  "+driver.getCurrentUrl());
        Assert.assertTrue(guestFlow.verifyChargingNowTitle());
        driver.quit();



    }
    //
    @Test(priority = 19)
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckGuest1CanMoveToChargingNowPageAfterClosingBrowser() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage login = new LoginPage(driver);
        guestVerificationPage.GoToAvailableCharger(prop.getProperty("Selenium719ChargerQR"));//Selenium 719
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(5000,"666666"));
        operation.clickButton(OTPVerificationPage.VerifyButton,2000);
        Assert.assertTrue(guestFlow.verifyChargingNowTitle());
        driver.quit();



    }


    @Test(priority = 21)
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckFaultedMessage() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyValidLogin();
        guestFlow.goToSimulator();
        Assert.assertTrue(guestFlow.selectChargerFromSimulator("D 11 Charger"));
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        Assert.assertTrue(operation.clickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.switchToTab(1);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(5000,"666666"));
        operation.clickButton(OTPVerificationPage.VerifyButton,2000);
        guestFlow.switchToTab(0);
        Assert.assertTrue(operation.clickButton(GuestFlow.PluginChargerbtn,2500));
        simulationPage.SelectChargerStatusFromSimulator("Charging");
        operation.clickButton(SimulationPage.ChargerStatusSaveButton,3000);
        guestFlow.switchToTab(1);
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.clickButton(GuestFlow.AuthorizeButton,1500));
        System.out.println("URL  =  "+driver.getCurrentUrl());
        Assert.assertTrue(guestFlow.verifyChargingNowTitle());
        guestFlow.switchToTab(0);
        simulationPage.SelectChargerStatusFromSimulator("Faulted");
        operation.clickButton(SimulationPage.ChargerStatusSaveButton,10000);
        guestFlow.switchToTab(1);
        Assert.assertTrue(guestFlow.verifyTextMatching(40000,GuestFlow.FirstAlertInChargingPage,guestFlow.AlertTextForFaultedCharger()));
        driver.quit();



    }


    @Test(priority = 22)
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckSuspendedEVAlertMessage() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyValidLogin();
        guestFlow.goToSimulator();
        Assert.assertTrue(guestFlow.selectChargerFromSimulator("D-10 Charger"));
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        Assert.assertTrue(operation.clickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.switchToTab(1);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(5000,"666666"));
        operation.clickButton(OTPVerificationPage.VerifyButton,2000);
        guestFlow.switchToTab(0);
        Assert.assertTrue(operation.clickButton(GuestFlow.PluginChargerbtn,2500));
        simulationPage.SelectChargerStatusFromSimulator("Charging");
        operation.clickButton(SimulationPage.ChargerStatusSaveButton,3000);
        guestFlow.switchToTab(1);
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.clickButton(GuestFlow.AuthorizeButton,1500));
        System.out.println("URL  =  "+driver.getCurrentUrl());
        Assert.assertTrue(guestFlow.verifyChargingNowTitle());
        guestFlow.switchToTab(0);
        simulationPage.SelectChargerStatusFromSimulator("Suspended EV");
        operation.clickButton(SimulationPage.ChargerStatusSaveButton,10000);
        guestFlow.switchToTab(1);
        Assert.assertTrue(guestFlow.verifyTextMatching(25000,GuestFlow.FirstAlertInChargingPage,guestFlow.AlertTextForSuspendedEvCharger()));
        driver.quit();



    }

    @Test(priority = 200)
    @TestParameters(testCaseId = {"TC-0"})
    public void TC_200_MakeUsedChargerAvailable() throws InterruptedException {
        MapDetails mapDetails = new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        loginPage.verifyValidLogin();
        guestFlow.makeScriptUsedChargerAvailable();
        driver.quit();
    }




//    @Test(priority = 17)
//    @TestParameters(testCaseId = {"TC-11"})
//    public void TC_15_ChangeTheStatusOfAllSimulatorChargerOnline() throws InterruptedException {
//        CreateCharger operation =new CreateCharger(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
//        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
//        SimulationPage simulationPage = new SimulationPage(driver);
//        GuestFlow guestFlow = new GuestFlow(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.VerifyValidLogin();
//        guestFlow.MakeAllChargerOfSimulatorOnline();
//        driver.quit();



//    }

//    @Test(priority = 2)//Done
//    @TestParameters(testCaseId = {"TC-1"})
//    public void TC_2_CheckAlertIconOfDownChargersBelowTheDashboardTitle() throws InterruptedException, IOException, IOException {
////        LoginPage loginPage = new LoginPage(driver);
////        loginPage.VerifyValidLogin();
//        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
//
//        try {
//            HttpPut request = new HttpPut("https://test-api.chargeonsite.com/simulator/dummy-status-notification/2c419e4b-ac7f-4179-abfe-e11fc021e162");
//            request.addHeader("Content-Type", "application/json");
//
//            // Add authentication headers
//            request.addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImpvQGVtYWlsLmNvbSIsInVzZXJJZCI6IjI3NmViM2EzLTc3YjEtNDQ5Ny1hN2M1LTA5Y2UyYmE4N2RjYyIsImNvbXBhbnkiOm51bGwsInNjb3BlcyI6WyJ2aWV3X3NlY3VyZV9kYXRhIiwibWFpbnRhaW5fc2VjdXJlX2RhdGEiLCJ2aWV3X2NvbXBhbmllc19hbmRfZW50aXRpZXMiLCJtYWludGFpbl9jb21wYW5pZXNfYW5kX2VudGl0aWVzIiwidmlld19jdXN0b21lcnMiLCJhZGRfY3VzdG9tZXIiLCJkZWFjdGl2YXRlX2N1c3RvbWVyIiwidmlld19ncm91cHMiLCJtYWludGFpbl9ncm91cHMiLCJ2aWV3X2NoYXJnZXJfYWNjZXNzIiwibWFpbnRhaW5fY2hhcmdlcl9hY2Nlc3MiLCJ2aWV3X3Byb3BlcnRpZXMiLCJlZGl0X3Byb3BlcnR5X2RhdGEiLCJkZWFjdGl2YXRlX3Byb3BlcnR5Iiwidmlld19hY2NvdW50cyIsIm1haW50YWluX2FjY291bnRzIiwicGF5X2ludm9pY2VzIiwidmlld19sb2NhdGlvbnMiLCJlZGl0X2xvY2F0aW9uX2RhdGEiLCJkZWFjdGl2YXRlX2xvY2F0aW9uIiwidmlld19jaGFyZ2VycyIsImVkaXRfY2hhcmdlcl9kYXRhIiwiZGVhY3RpdmF0ZV9jaGFyZ2VyIiwidmlld19mZWVfc3RydWN0dXJlIiwiZWRpdF9mZWVfc3RydWN0dXJlIiwiZGVsZXRlX2ZlZV9zdHJ1Y3R1cmUiLCJ2aWV3X3Byb3BlcnR5X3VzZXJzIiwibWFpbnRhaW5fcHJvcGVydHlfdXNlcnMiLCJ2aWV3X3Byb3ZpZGVycyIsIm1haW50YWluX3Byb3ZpZGVycyIsInZpZXdfd29ya19vcmRlcnMiLCJtYWludGFpbl93b3JrX29yZGVycyIsInByb3BlcnR5X3BvcnRhbF9hY2Nlc3MiLCJ2aWV3X3JlcG9ydHMiXSwiaWF0IjoxNjgxNTUyOTMxLCJleHAiOjE2ODE3MjU3MzF9.Oo9XtgmdaL8wcDADViZAzUBCN16ICEkSzZxKzVXkegM");
//
//            StringEntity params = new StringEntity("{\"status\":\"Faulted\"}");
//            request.setEntity(params);
//
//            HttpResponse response = httpClient.execute(request);
//            int statusCode = response.getStatusLine().getStatusCode();
//            String responseBody = EntityUtils.toString(response.getEntity());
//
//            System.out.println("Status code: " + statusCode);
//            System.out.println("Response body: " + responseBody);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        finally {
//            httpClient.close();
//        }
//    }
}