package tests.US228NewUpdatedWelcomeUI;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class UpdatedWelcomeUIForGuestTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();

    @Test(priority = 1)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckIfMenuButtonIsNotShowingAtTopRightCornerOfThePage() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(favoriteLocation.verifyElementNotDisplayed(6000,CustomerLogin.Menu));

    }

    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckTitleOfTheGuestVerificationPage() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        dashboard.RefreshBrowser();
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(2000,GuestVerificationPage.ThanksForScanningTitle));

    }

    @Test(priority = 3)
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckProvidePhoneNoTitleIsShowingAbovePhoneNumberField() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ProvidePhnNumberTitle));

    }

    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckPhoneNumberFieldIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.PhoneNumberField));

    }

    @Test(priority = 5)
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckCountryFlagWithCodeInPhoneNoIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.USAFlag));

    }

    @Test(priority = 6)
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckContinueAsAGuestButtonIsShowingSameAsTheDesign() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ContinueAsGuestButton));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ContinueAsGuestButtonText));

    }
    @Test(priority = 7)
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckTheColorContinueAsAGuestButtonIsShowingSameAsTheDesign() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyContinueAsGuestAsButtonColor());

    }

    @Test(priority = 8)
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckLoginButtonIsShowingSameAsTheDesign() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.LoginButton));

    }
    @Test(priority = 9)
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckSignUpButtonIsShowingSameAsTheDesign() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.SignUPButton));

    }

    @Test(priority = 10)
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckAvailabilityStatusForAvailableCharger() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.ChargerAvailableStatus));

    }

//    @Test(priority = 11)
//    @TestParameters(testCaseId = {"TC-11"})
//    public void TC_11_CheckAvailabilityStatusForAvailableCharger() throws InterruptedException {
//        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
//        CreateCharger operation =new CreateCharger(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
//        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
////        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.ChargerAvailableStatus));
//
//    }

    @Test(priority = 12)
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckShareButtonIsShowingSameAsDesign() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.ShareButton));

    }
    @Test(priority = 16)
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckGETDIRECTIONIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.GetDirectionIcon));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.GetDirectionText));

    }

    @Test(priority = 25)
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_CheckAssistMeButtonIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.AssistMeButton));

    }



}
