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
        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/tIljMh");
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

    @Test(priority = 13)
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckTheFavoriteIconIsNotShowing() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(500,GuestVerificationPage.FavoriteIcon));

    }

    @Test(priority = 14)
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckShareButtonIsShowingSameAsDesign() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        dashboard.RefreshBrowser();
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.ShareButton));

    }

    @Test(priority = 15)
    @TestParameters(testCaseId = {"TC-14.1"})
    public void TC_14_1_CheckShareButtonIsResponding() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        operation.ClickButton(GuestVerificationPage.ShareButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.CopiedToolTip));

    }

    @Test(priority = 15)
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckLocationAddressIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.PropertyLocationAddress));

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

    @Test(priority = 18)
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckIfTheCarImageIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.CarImage));

    }

    @Test(priority = 22)
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckIfIdleFeeIsShowingSameAsDesign() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.IdleFee));

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

    @Test(priority = 27)
    @TestParameters(testCaseId = {"TC-27,28"})
    public void TC_27_28_CheckStartChargingButtonIsShowingAndDisabled() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.StatChargingButton));
        Assert.assertTrue(guestVerificationPage.verifyAFieldIsDisable(200,GuestVerificationPage.StatChargingButton));


    }

    @Test(priority = 29)
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_CheckNearbyChargersSectionIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.NearbyLocation));

    }

    @Test(priority = 30)
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_CheckNearbyLocationsTabIsNotExpanded() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyNearByLocationsTabIsNotExpanded());

    }

    @Test(priority = 31)
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_CheckNearbyLocationsTabIsExpandedAfterClickingOnIt() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        operation.ClickButton(GuestVerificationPage.NearbyLocation,1000);
        Assert.assertTrue(guestVerificationPage.verifyNearByLocationsTabIsExpanded());

    }
    @Test(priority = 33)
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_CheckWhatHappensWhenGuestClickOnContinueAsGuestKeepingThePhoneNumberFieldEmpty() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.PhoneNumberRequiredErrorMsg));

    }

    @Test(priority = 34)
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_34_CheckWhatHappensWhenGuestClickOnContinueAsGuestProvidingSevenDigitNumber() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        dashboard.RefreshBrowser();
        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"213211",2000);
        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.InvalidNumberErrorMsg));

    }

    @Test(priority = 35)
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_CheckWhatHappensWhenGuestClickOnContinueAsGuestProvidingFourDigitNumber() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        dashboard.RefreshBrowser();
        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"2132",2000);
        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.InvalidNumberErrorMsg));

    }

    @Test(priority = 36)
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_CheckWhatHappensWhenGuestClickOnContinueAsGuestProvidingNineDigitNumber() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        dashboard.RefreshBrowser();
        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"444788998",2000);
        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.InvalidNumberErrorMsg));

    }

    @Test(priority = 37)
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_CheckWhatHappensWhenGuestRefreshThePageAfterTypingPhoneNumberInProvidingPhoneNoField() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        dashboard.RefreshBrowser();
        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4447889989",2000);
        dashboard.RefreshBrowser();
        Assert.assertTrue(guestVerificationPage.verifyFieldIsEmpty(2000,GuestVerificationPage.PhoneNumberField));

    }

    @Test(priority = 38)
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_CheckWhatHappensWhenGuestClickOnContinueAsGuestProvidingAValidPhoneNumber() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        dashboard.RefreshBrowser();
        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4447889989",2000);
        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,OTPVerificationPage.OTPPageTitle));

    }
    @Test(priority = 39)
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_CheckProvidedPhoneNumberIsShowingAccuratelyInOTPVerification() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        OTPVerificationPage otpPage = new OTPVerificationPage(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
//        dashboard.RefreshBrowser();
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4447889989",2000);
//        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(otpPage.verifyProvidedPhoneNumberIsShowingAccurately("4447889989"));

    }

    @Test(priority = 50)
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_CheckWhatHappensWhenGuestClickOnChangeTheNumber() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        OTPVerificationPage otpPage = new OTPVerificationPage(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
//        dashboard.RefreshBrowser();
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4447889989",2000);
//        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        operation.ClickButton(OTPVerificationPage.ChangePhoneNumber,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.PhoneNumberField));

    }

    @Test(priority = 50)
    @TestParameters(testCaseId = {"TC-92,93,94,104"})
    public void TC_92_93_94_104_CheckWhatHappensWhenGuestComesToOTPPageAfterChangingTheNumber() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        OTPVerificationPage otpPage = new OTPVerificationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        dashboard.RefreshBrowser();
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4447889989",2000);
//        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        operation.ClickButton(OTPVerificationPage.ChangePhoneNumber,1000);
        guestFlow.ClearPhoneNumberField(GuestVerificationPage.PhoneNumberField);
        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4441254632",2000);
        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,OTPVerificationPage.OTPPageTitle));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(200,OTPVerificationPage.EnterVerificationCodeTitle));
        Assert.assertTrue(guestFlow.verifyTimer());
        Assert.assertTrue(guestVerificationPage.verifyAFieldIsDisable(500,OTPVerificationPage.VerifyButton));

    }

    @Test(priority = 51)
    @TestParameters(testCaseId = {"TC-95,100"})
    public void TC_95_100_CheckResendButtonIsShowingAfter30SecondsOfTimerAndDisabledVerifyField() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        OTPVerificationPage otpPage = new OTPVerificationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
//        dashboard.RefreshBrowser();
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4447889989",2000);
//        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
//        operation.ClickButton(OTPVerificationPage.ChangePhoneNumber,1000);
//        guestFlow.ClearPhoneNumberField(GuestVerificationPage.PhoneNumberField);
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4441254632",2000);
//        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,OTPVerificationPage.OTPPageTitle));
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(28000,OTPVerificationPage.ResendOTP));
        Assert.assertTrue(guestVerificationPage.verifyAFieldIsDisable(200,OTPVerificationPage.VerifyButton));

    }

    @Test(priority = 52)
    @TestParameters(testCaseId = {"TC-96"})
    public void TC_96_CheckResendButtonIsWorkingProperlyAfterClickingOnIt() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        OTPVerificationPage otpPage = new OTPVerificationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
//        dashboard.RefreshBrowser();
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4447889989",2000);
//        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
//        operation.ClickButton(OTPVerificationPage.ChangePhoneNumber,1000);
//        guestFlow.ClearPhoneNumberField(GuestVerificationPage.PhoneNumberField);
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4441254632",2000);
//        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,OTPVerificationPage.OTPPageTitle));
        operation.ClickButton(OTPVerificationPage.ResendOTP,1000);
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,OTPVerificationPage.VerificationCodeSent));
        Assert.assertTrue(guestVerificationPage.verifyAFieldIsDisable(200,OTPVerificationPage.VerifyButton));

    }
    @Test(priority = 54)
    @TestParameters(testCaseId = {"TC-98"})
    public void TC_98_CheckWhatHappensWhenGuestTryToClickVerifyWithoutProvidingValidOTP() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        OTPVerificationPage otpPage = new OTPVerificationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        dashboard.RefreshBrowser();
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4447889989",2000);
//        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
//        operation.ClickButton(OTPVerificationPage.ChangePhoneNumber,1000);
//        guestFlow.ClearPhoneNumberField(GuestVerificationPage.PhoneNumberField);
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4441254632",2000);
//        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,OTPVerificationPage.OTPPageTitle));
        guestFlow.SendOtp(2000,"555555");
        operation.ClickButton(OTPVerificationPage.VerifyButton,500);
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(700,OTPVerificationPage.InvalidOTP));

    }

    @Test(priority = 55)
    @TestParameters(testCaseId = {"TC-101"})
    public void TC_101_CheckWhatHappensWhenGuestTryToClickVerifyProvidingValidOTP() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        OTPVerificationPage otpPage = new OTPVerificationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
//        dashboard.RefreshBrowser();
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4447889989",2000);
//        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
//        operation.ClickButton(OTPVerificationPage.ChangePhoneNumber,1000);
//        guestFlow.ClearPhoneNumberField(GuestVerificationPage.PhoneNumberField);
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4441254632",2000);
//        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,OTPVerificationPage.OTPPageTitle));
        otpPage.ClearOTPField();
        operation.ClickButton(OTPVerificationPage.FirstOTPField,1500);
        guestFlow.SendOtp(2000,"666666");
        operation.ClickButton(OTPVerificationPage.VerifyButton,500);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(2000,OTPVerificationPage.SuccessFullyVerified));
        Assert.assertTrue(otpPage.verifyAFieldIsEnable(2500,GuestVerificationPage.StatChargingButton));

    }






}
