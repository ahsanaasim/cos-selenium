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
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckAvailableStatusForAvailableCharger() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/tIljMh");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ChargerAvailableStatus));

        driver.close();

    }

    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckRestrictedStatusForTheRestrictedCharger() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        guestVerificationPage.GoToRestrictedCharger(prop.getProperty("RestrictedChargerQR"));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ChargerRestrictedStatus));
        driver.close();

    }

    @Test(priority = 3)
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckDownStatusForDownCharger() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        guestVerificationPage.GoToRestrictedCharger(prop.getProperty("DownChargerQR"));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ChargerDownStatus));
        driver.close();

    }

    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckInvalidQRStatusForBrokenLink() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
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
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.MaxChargingRate,"N/A"));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.FeeToInitiate,"N/A"));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(200,GuestVerificationPage.FeePerKwh,"N/A"));




    }

}
