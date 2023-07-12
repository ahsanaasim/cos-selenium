package tests.US228NewUpdatedWelcomeUI;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest2;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class Special23Scenerios extends BaseTest2 {
    Properties prop = ConfigUtill.getConfig();

    @Test(priority = 6)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckAvailableStatusForAvailableCharger() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        guestVerificationPage.GoToAvailableCharger(prop.getProperty("Selenium889ChargerQR"));//Selenium 889
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(1000,GuestVerificationPage.ChargerAvailableStatus,"Available Now"));
        Assert.assertTrue(guestVerificationPage.verifyAFieldIsDisable(1000,GuestVerificationPage.StatChargingButton));
        driver.close();

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
        driver.close();

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
//        Assert.assertTrue(guestVerificationPage.verifyNearByLocationsTabIsExpanded());
        driver.close();

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
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.AskCosaButton));
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.StatChargingButton));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.MaxChargingRate,"N/A"));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.FeeToInitiate,"N/A"));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.FeePerKwh,"N/A"));
        driver.close();




    }


    @Test(priority = 10)
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckUnAvailableStatus() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        LoginPage login = new LoginPage(driver);
        login.VerifyValidLogin();
        editCharger.makeAChargerOfflineFromDrawer("D-10 Charger");
        operation.ClickButton(CosAdminChargerList.EditButton,3000);
        operation.ClickButton(UpdateChargerPropertyAdmin.CopyButton,3000);
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestVerificationPage.SwitchToTab(1);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(3000,GuestVerificationPage.ChargerUnavailableStatus));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.OfflineTextInBox));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.ReportAProblem));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.AskCosaButton));
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(200,GuestVerificationPage.StatChargingButton));
        driver.close();



    }

    @Test(priority = 11)
    @TestParameters(testCaseId = {"TC-5.2"})
    public void TC_5_2_CheckAvailableStatusAfterChangingFromUnavailable() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        EditChargerCosAdminUpdated editCharger = new EditChargerCosAdminUpdated(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        LoginPage login = new LoginPage(driver);
        login.VerifyValidLogin();
        editCharger.makeAChargerOnlineFromDrawer("D-10 Charger");
        operation.ClickButton(CosAdminChargerList.EditButton,3000);
        operation.ClickButton(UpdateChargerPropertyAdmin.CopyButton,3000);
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestVerificationPage.SwitchToTab(1);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(3000,GuestVerificationPage.ChargerAvailableStatus));



    }

}
