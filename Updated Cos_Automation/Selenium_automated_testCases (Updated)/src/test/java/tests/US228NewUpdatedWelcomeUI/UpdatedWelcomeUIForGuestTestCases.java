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
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/tIljMh");
        Assert.assertTrue(favoriteLocation.verifyElementNotDisplayed(6000,CustomerLogin.Menu));

    }

    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckTitleOfTheGuestVerificationPage() throws InterruptedException {
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
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyContinueAsGuestAsButtonColor());

    }

    @Test(priority = 8)
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckLoginButtonIsShowingSameAsTheDesign() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.LoginButton));

    }
    @Test(priority = 9)
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckSignUpButtonIsShowingSameAsTheDesign() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.SignUPButton));

    }

    @Test(priority = 10)
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckAvailabilityStatusForAvailableCharger() throws InterruptedException {
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
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(500,GuestVerificationPage.FavoriteIcon));

    }

    @Test(priority = 14)
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckShareButtonIsShowingSameAsDesign() throws InterruptedException {
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
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        operation.ClickButton(GuestVerificationPage.ShareButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.CopiedToolTip));
        Assert.assertTrue(guestVerificationPage.verifyClipboardIsGettingTheCorrectURLAfterClickingOnShareButton());

    }

    @Test(priority = 15)
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckLocationAddressIsShowingOrNot() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.PropertyLocationAddress));

    }


    @Test(priority = 16)
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckGETDIRECTIONIsShowingOrNot() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.GetDirectionIcon));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.GetDirectionText));

    }

    @Test(priority = 17)
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckPlugTypeIsShowingOrNot() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.PlugType));

    }


    @Test(priority = 18)
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckIfTheCarImageIsShowingOrNot() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.CarImage));

    }

    @Test(priority = 19)
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckChargingFeeSectionIsShowing() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.ChargerFeeBox));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.MaxChargingRate));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.MaxChargingRateHeading));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.FeeToInitiate));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.FeeToInitiateHeading));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.FeePerKwh));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.FeePerKwhHeading));

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
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.AskCosaButton));

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
    public void TC_37_69_CheckWhatHappensWhenGuestClickOnContinueAsGuestProvidingAValidPhoneNumber() throws InterruptedException {
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
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.ShareButton));
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.MaxChargingRate));
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.ChargerFeeBox));
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.IdleFee));
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.NearbyLocationTab));
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.PropertyLocationAddress));



    }

    @Test(priority = 56)
    @TestParameters(testCaseId = {"TC-103"})
    public void TC_103_CheckIfTheStatusOfTheChargerIsShowingInWelcomePage() throws InterruptedException {
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
//        otpPage.ClearOTPField();
//        operation.ClickButton(OTPVerificationPage.FirstOTPField,1500);
//        guestFlow.SendOtp(2000,"666666");
//        operation.ClickButton(OTPVerificationPage.VerifyButton,500);
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(2000,OTPVerificationPage.SuccessFullyVerified));
        Assert.assertTrue(guestVerificationPage.verifyAnyOfTheChargerStatusIsShowing());

    }


    @Test(priority = 57)
    @TestParameters(testCaseId = {"TC-119"})
    public void TC_119_CheckMenuButtonIsShowingAfterLoginAsCustomer() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        OTPVerificationPage otpPage = new OTPVerificationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        Assert.assertTrue(customerLogin.verifyAnElementDisplayedOrNot(2000,CustomerLogin.Menu));

    }

    @Test(priority = 58)
    @TestParameters(testCaseId = {"TC-121"})
    public void TC_121_CheckTheTitleForCustomerAfterScanningACharger() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        OTPVerificationPage otpPage = new OTPVerificationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        CustomerSignUp customer = new CustomerSignUp(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaPassword@11@");
        customer.GoToAvailableChargerAfterLoginAsCustomer("https://test-app.chargeonsite.com/charger/p-4_iE");
        operation.ClickButton(OTPVerificationPage.ChangePhoneNumber,2000);
        Assert.assertTrue(guestVerificationPage.verifyWelcomeTitleForCustomerAfterScanningAnCharger());

    }

    @Test(priority = 59)
    @TestParameters(testCaseId = {"TC-122,123"})
    public void TC_122_23_CheckTheProvidePhoneNoFieldAndTitleForCustomerAfterScanningACharger() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        OTPVerificationPage otpPage = new OTPVerificationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaPassword@11@");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(2000,GuestVerificationPage.ProvidePhnNumberTitle));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(2000,GuestVerificationPage.PhoneNumberField));

    }

    @Test(priority = 60)
    @TestParameters(testCaseId = {"TC-124"})
    public void TC_124_CheckCountryFlagWithCodeInPhoneNoIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.USAFlag));

    }

    @Test(priority = 61)
    @TestParameters(testCaseId = {"TC-125"})
    public void TC_125_CheckContinueButtonIsShowingSameAsTheDesign() throws InterruptedException {
        CustomerSignUp customer = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
//        customer.GoToAvailableChargerAfterLoginAsCustomer("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ContinueAsGuestButton));
        Assert.assertTrue(guestVerificationPage.verifyTextMatching(1500,GuestVerificationPage.ContinueAsGuestButton,"Continue"));

    }

    @Test(priority = 62)
    @TestParameters(testCaseId = {"TC-126"})
    public void TC_126_CheckTheColorContinueButtonIsShowingSameAsTheDesign() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyContinueAsGuestAsButtonColor());

    }

    @Test(priority = 63)
    @TestParameters(testCaseId = {"TC-127"})
    public void TC_127_CheckIfThePhoneNumberSavingSectionIsShowingSameAsTheDesign() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"), "EitaiPassword@10");
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000, GuestVerificationPage.SavePhoneNumberCheckbox));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000, GuestVerificationPage.SavePhoneNumberText));

    }

    @Test(priority = 64)
    @TestParameters(testCaseId = {"TC-127.1"})
    public void TC_127_1_CheckIfThePhoneNumberSavingCheckBoxIsWorking() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"), "EitaiPassword@10");
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.SavePhoneNumberCheckbox,1000));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.SavePhoneNumberCheckboxChecked));
        Assert.assertTrue(operation.ClickButton(GuestVerificationPage.SavePhoneNumberCheckboxChecked,1000));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000, GuestVerificationPage.SavePhoneNumberCheckbox));

    }

    @Test(priority = 65)
    @TestParameters(testCaseId = {"TC-131"})
    public void TC_131_CheckFavoriteIconIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000, GuestVerificationPage.FavoriteIcon));

    }

    @Test(priority = 66)
    @TestParameters(testCaseId = {"TC-132"})
    public void TC_132_CheckShareButtonIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000, GuestVerificationPage.ShareButton));

    }

    @Test(priority = 67)
    @TestParameters(testCaseId = {"TC-133"})
    public void TC_133_CheckShareButtonIsResponding() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        operation.ClickButton(GuestVerificationPage.ShareButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.CopiedToolTip));
        Assert.assertTrue(guestVerificationPage.verifyClipboardIsGettingTheCorrectURLAfterClickingOnShareButton());

    }

    @Test(priority = 68)
    @TestParameters(testCaseId = {"TC-134"})
    public void TC_134_CheckLocationAddressIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000, GuestVerificationPage.PropertyLocationAddress));

    }


    @Test(priority = 69)
    @TestParameters(testCaseId = {"TC-135"})
    public void TC_135_CheckGetDirectionButtonIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000, GuestVerificationPage.GetDirectionIcon));

    }
    @Test(priority = 70)
    @TestParameters(testCaseId = {"TC-136"})
    public void TC_136_CheckPlugTypeIsShowingOrNotForCustomer() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.PlugType));

    }





    @Test(priority = 71)
    @TestParameters(testCaseId = {"TC-137"})
    public void TC_137_CheckIfTheCarImageIsShowingOrNot() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.CarImage));

    }

    @Test(priority = 72)
    @TestParameters(testCaseId = {"TC-138,139"})
    public void TC_138_139_CheckChargingFeeSectionIsShowing() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.ChargerFeeBox));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.MaxChargingRate));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.MaxChargingRateHeading));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.FeeToInitiate));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.FeeToInitiateHeading));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.FeePerKwh));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1500,GuestVerificationPage.FeePerKwhHeading));

    }

    @Test(priority = 73)
    @TestParameters(testCaseId = {"TC-143,144"})
    public void TC_143_144_CheckIfIdleFeeIsShowingSameAsDesign() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.IdleFee));

    }

    @Test(priority = 74)
    @TestParameters(testCaseId = {"TC-140"})
    public void TC_140_CheckAssistMeButtonIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.AskCosaButton));
        Assert.assertTrue(guestVerificationPage.verifyAFieldIsEnable(500,GuestVerificationPage.AskCosaButton));

    }

    @Test(priority = 75)
    @TestParameters(testCaseId = {"TC-141"})
    public void TC_141_CheckStartChargingButtonIsShowingAndDisabled() throws InterruptedException {
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

    @Test(priority = 76)
    @TestParameters(testCaseId = {"TC-145"})
    public void TC_145_CheckNearbyChargersSectionIsShowingOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.NearbyLocation));

    }

    @Test(priority = 77)
    @TestParameters(testCaseId = {"TC-146"})
    public void TC_146_CheckNearbyLocationsTabIsNotExpanded() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(guestVerificationPage.verifyNearByLocationsTabIsNotExpanded());

    }

    @Test(priority = 78)
    @TestParameters(testCaseId = {"TC-147"})
    public void TC_147_CheckNearbyLocationsTabIsExpandedAfterClickingOnIt() throws InterruptedException {
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
    @Test(priority = 80)
    @TestParameters(testCaseId = {"TC-149"})
    public void TC_149_CheckWhatHappensWhenCustomerClickOnContinueAsGuestKeepingThePhoneNumberFieldEmpty() throws InterruptedException {
        GuestFlow guestFlow = new GuestFlow(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"12451232",2000);
        guestFlow.ClearPhoneNumberField(GuestVerificationPage.PhoneNumberField);
        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.PhoneNumberRequiredErrorMsg));

    }

    @Test(priority = 81)
    @TestParameters(testCaseId = {"TC-150"})
    public void TC_150_CheckWhatHappensWhenCustomerClickOnContinueAsGuestProvidingSevenDigitNumber() throws InterruptedException {
        GuestFlow guestFlow = new GuestFlow(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        guestFlow.ClearPhoneNumberField(GuestVerificationPage.PhoneNumberField);
        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"213211",2000);
        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.InvalidNumberErrorMsg));

    }

    @Test(priority = 82)
    @TestParameters(testCaseId = {"TC-151"})
    public void TC_151_CheckWhatHappensWhenCustomerClickOnContinueAsGuestProvidingFourDigitNumber() throws InterruptedException {
        GuestFlow guestFlow = new GuestFlow(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        guestFlow.ClearPhoneNumberField(GuestVerificationPage.PhoneNumberField);
        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"2132",2000);
        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.InvalidNumberErrorMsg));

    }

    @Test(priority = 83)
    @TestParameters(testCaseId = {"TC-152"})
    public void TC_152_CheckWhatHappensWhenCustomerClickOnContinueAsGuestProvidingNineDigitNumber() throws InterruptedException {
        GuestFlow guestFlow = new GuestFlow(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        guestFlow.ClearPhoneNumberField(GuestVerificationPage.PhoneNumberField);
        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"444788998",2000);
        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.InvalidNumberErrorMsg));

    }
//
//    @Test(priority = 37)
//    @TestParameters(testCaseId = {"TC-39"})
//    public void TC_39_CheckWhatHappensWhenGuestRefreshThePageAfterTypingPhoneNumberInProvidingPhoneNoField() throws InterruptedException {
//        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
//        CreateCharger operation =new CreateCharger(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
//        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
////        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
//        dashboard.RefreshBrowser();
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4447889989",2000);
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(guestVerificationPage.verifyFieldIsEmpty(2000,GuestVerificationPage.PhoneNumberField));
//
//    }
//
    @Test(priority = 84)
    @TestParameters(testCaseId = {"TC-154,166"})
    public void TC_154_166_CheckWhatHappensWhenGuestClickOnContinueAsGuestProvidingAValidPhoneNumber() throws InterruptedException {
        GuestFlow guestFlow = new GuestFlow(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        guestFlow.ClearPhoneNumberField(GuestVerificationPage.PhoneNumberField);
        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",2000);
        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(1000,OTPVerificationPage.OTPPageTitle));

    }
    @Test(priority = 85)
    @TestParameters(testCaseId = {"TC-155"})
    public void TC_155_CheckProvidedPhoneNumberIsShowingAccuratelyInOTPVerification() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        OTPVerificationPage otpPage = new OTPVerificationPage(driver);
//        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
//        dashboard.RefreshBrowser();
//        operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4447889989",2000);
//        operation.ClickButton(GuestVerificationPage.ContinueAsGuestButton,1000);
        Assert.assertTrue(otpPage.verifyProvidedPhoneNumberIsShowingAccurately("4242424242"));

    }
//
    @Test(priority = 86)
    @TestParameters(testCaseId = {"TC-156"})
    public void TC_156_CheckWhatHappensWhenGuestClickOnChangeTheNumber() throws InterruptedException {
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
//
    @Test(priority = 87)
    @TestParameters(testCaseId = {"TC-157,158,159"})
    public void TC_157_158_159_CheckWhatHappensWhenGuestComesToOTPPageAfterChangingTheNumber() throws InterruptedException {
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
//
    @Test(priority = 88)
    @TestParameters(testCaseId = {"TC-160"})
    public void TC_160_CheckResendButtonIsShowingAfter30SecondsOfTimerAndDisabledVerifyField() throws InterruptedException {
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
//
    @Test(priority = 89)
    @TestParameters(testCaseId = {"TC-161"})
    public void TC_161_CheckResendButtonIsWorkingProperlyAfterClickingOnIt() throws InterruptedException {
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
    @Test(priority = 90)
    @TestParameters(testCaseId = {"TC-162"})
    public void TC_162_CheckWhatHappensWhenGuestTryToClickVerifyWithoutProvidingValidOTP() throws InterruptedException {
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

    @Test(priority = 91)
    @TestParameters(testCaseId = {"TC-163"})
    public void TC_163_CheckWhatHappensWhenGuestTryToClickVerifyProvidingValidOTP() throws InterruptedException {
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
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.ShareButton));
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.MaxChargingRate));
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.ChargerFeeBox));
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.IdleFee));
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.NearbyLocationTab));
        Assert.assertTrue(otpPage.verifyAnElementDisplayedOrNot(500,GuestVerificationPage.PropertyLocationAddress));



    }
//
    @Test(priority = 92)
    @TestParameters(testCaseId = {"TC-164"})
    public void TC_164_CheckIfTheStatusOfTheChargerIsShowingInWelcomePage() throws InterruptedException {
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
//        otpPage.ClearOTPField();
//        operation.ClickButton(OTPVerificationPage.FirstOTPField,1500);
//        guestFlow.SendOtp(2000,"666666");
//        operation.ClickButton(OTPVerificationPage.VerifyButton,500);
//        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(2000,OTPVerificationPage.SuccessFullyVerified));
        Assert.assertTrue(guestVerificationPage.verifyAnyOfTheChargerStatusIsShowing());

    }


    @Test(priority = 93)
    @TestParameters(testCaseId = {"TC-186"})
    public void TC_186_CheckCustomerIsNavigatingToWelcomePageAfterScanningAChargerWhenPhoneNumberIsSaved() throws InterruptedException {
        CreateCharger operation =new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        CustomerSignUp customer = new CustomerSignUp(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        customerLogin.LogoutFromCustomerAccount();
        customerLogin.LoginToACustomerAccount(prop.getProperty("validEmail"),prop.getProperty("validPassword"));
        customer.GoToAvailableChargerAfterLoginAsCustomer("https://test-app.chargeonsite.com/charger/tIljMh");
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(2000,GuestVerificationPage.ProvidePhnNumberTitle));
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(2000,GuestVerificationPage.PhoneNumberField));
        Assert.assertTrue(guestVerificationPage.verifyElementNotDisplayed(2000,GuestVerificationPage.PhoneNumberField));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(2000,CustomerLogin.Menu));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(2000,GuestVerificationPage.StatChargingButton));
        Assert.assertTrue(guestVerificationPage.verifyAnElementDisplayedOrNot(2000,GuestVerificationPage.AskCosaButton));
        Assert.assertTrue(guestVerificationPage.verifyAFieldIsEnable(2000,GuestVerificationPage.StatChargingButton));
        Assert.assertTrue(guestVerificationPage.verifyAFieldIsEnable(2000,GuestVerificationPage.AskCosaButton));

    }













}
