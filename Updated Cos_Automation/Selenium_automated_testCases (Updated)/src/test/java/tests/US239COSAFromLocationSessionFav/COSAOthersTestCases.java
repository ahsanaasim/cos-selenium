package tests.US239COSAFromLocationSessionFav;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

//In TC-68, Check The Location id from console that it is showing correctly or not
// Run the TC_100 to clear the watchlist

public class COSAOthersTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();

//    @Test(priority = 1)
//    @TestParameters(testCaseId = {"TC-0"})
//    public void TC_0_PreConditionLoginToCOSAdmin() throws InterruptedException {
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard=new Dashboard(driver);
//        CreateLocation createLocation=new CreateLocation(driver);
//        createLocation.NewTabOpenAndSwitchToNewTab(1);
//        Thread.sleep(2500);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickonLocations());
//
//
//    }

    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckAskCosaButtonInTheLocationDetailsDrawer() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
//        customerLogin.SwitchToTab(0);
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"), "EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,MapDetails.AskCOSAButton));
        Assert.assertTrue(mapDetails.verifyTextMatching(500,MapDetails.AskCOSAButton,"Ask Cosa"));



    }

    @Test(priority = 3)
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckAskCosaButtonInTheSessionDetailPage() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        fav.ScanChargerOFElectricChargerLocation();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,GuestVerificationPage.AskCosaButton));
        Assert.assertTrue(mapDetails.verifyTextMatching(500,GuestVerificationPage.AskCosaButton,"Ask Cosa"));



    }

    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckAskCosaButtonInTheOTPPage() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        fav.ScanChargerOFElectricChargerLocation();
        Assert.assertTrue(operation.writeInputText(GuestFlow.PhoneNoField,"424242424242",5000));
        Assert.assertTrue(operation.clickButton(GuestFlow.ContinueGuestBtn,2000));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,GuestVerificationPage.AskCosaButton));
        Assert.assertTrue(mapDetails.verifyTextMatching(500,GuestVerificationPage.AskCosaButton,"Ask Cosa"));



    }
    @Test(priority = 5)
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckAskCOSAButtonInTheSessionPage() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        fav.ScanChargerOFElectricChargerLocation();
        Assert.assertTrue(guestFlow.SendOtp(4000,"666666"));
        Assert.assertTrue(operation.clickButton(GuestFlow.VerifyButton,300));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,GuestVerificationPage.AskCosaButton));
        Assert.assertTrue(mapDetails.verifyTextMatching(500,GuestVerificationPage.AskCosaButton,"Ask Cosa"));



    }

    @Test(priority = 6)
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckAddToWatchlistButtonInTheFavoritePage() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        fav.ScanChargerOFElectricChargerLocation();
        fav.GoToFavoriteLocationPage();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,FavoriteLocation.AddToWatchListButton1));
        Assert.assertTrue(mapDetails.verifyTextMatching(500,FavoriteLocation.AddToWatchListButton1,"Add to Watchlist"));



    }

    @Test(priority = 7)
    @TestParameters(testCaseId = {"TC-18,19"})
    public void TC_18_19_CheckWhenCustomerClickOnAskCosaButtonFromLocationDetailsPage () throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        fav.ScanChargerOFElectricChargerLocation();
        mapDetails.GoToD10LocationInMapDetails();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        Assert.assertTrue(mapDetails.verifyTextMatching(2000,COSA.COSAFirstMsg,cosa.COSAFirstMsgForLM10()));


    }

    @Test(priority = 8)
    @TestParameters(testCaseId = {"TC-20,23"})
    public void TC_20_23_CheckALlTheMessageBoxAfterComingCosaFromLocationDetails() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        fav.ScanChargerOFElectricChargerLocation();
        mapDetails.GoToD10LocationInMapDetails();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,COSA.KeepAnEyeOnThisLocation));
        Assert.assertTrue(cosa.verifyTextMatching(500,COSA.ShowMeWatchList,"Show me the locations I am watching"));
        Assert.assertTrue(cosa.verifyTextMatching(500,COSA.ReportAProblem,"Report a problem"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.HowDoIUseCharger));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.COSALOGOInChatBot));





    }

    @Test(priority = 9)
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_CheckURLOfThePageAfterComingCOSAFromLocationDetails() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        fav.ScanChargerOFElectricChargerLocation();
        mapDetails.GoToD10LocationInMapDetails();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        Assert.assertTrue(cosa.URLCheckAfterMovingToCOSAFromLocationDetails());





    }

    @Test(priority = 10)
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_CheckLoggedOutUserCanAccessCOSA() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        fav.ScanChargerOFElectricChargerLocation();
        customerLogin.LogoutFromCustomerAccount();
        cosa.GoToCOSAWithD10LocationID();
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/login"));





    }

    @Test(priority = 11)
    @TestParameters(testCaseId = {"TC-34,35"})
    public void TC_34_35_CheckWhenCustomerClickOnTheAskCOSAButtonFromSessionDetailsPage() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        fav.ScanChargerOFElectricChargerLocation();
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        fav.ScanChargerOFEBotsfordAvenue62659569Location();
        operation.clickButton(GuestVerificationPage.AskCosaButton,2000);
        Assert.assertTrue(mapDetails.verifyTextMatching(2000,COSA.COSAFirstMsg,cosa.COSAFirstMsgForTester()));



    }


    @Test(priority = 12)
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_40_CheckWhenCustomerClickOnTheAskCOSAButtonFromSessionDetailsPage() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        fav.ScanChargerOFElectricChargerLocation();
        fav.ScanChargerOFEBotsfordAvenue62659569Location();
        operation.clickButton(GuestVerificationPage.AskCosaButton,2000);
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,COSA.KeepAnEyeOnThisLocation));
        Assert.assertTrue(cosa.verifyTextMatching(500,COSA.ShowMeWatchList,"Show me the locations I am watching"));
        Assert.assertTrue(cosa.verifyTextMatching(500,COSA.ReportAProblem,"Report a problem"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.HowDoIUseCharger));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.COSALOGOInChatBot));



    }
    @Test(priority = 13)
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_CheckIfGuestClicksOnTheAskCosaButtonAsAGuest() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        fav.ScanChargerOFElectricChargerLocation();
        customerLogin.LogoutFromCustomerAccount();
        guestFlow.ScanQROFSeleniumCharger();
        operation.clickButton(GuestVerificationPage.AskCosaButton,2000);
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/login"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,CustomerLogin.SignUpLink));




    }

//    @Test(priority = 11)
//    @TestParameters(testCaseId = {"TC-37"})
//    public void TC_37_CheckGuestIsRedirectingToCosaAfterLoginWhenGuestClicksOnTheAskCosaButtonAsAGuest() throws InterruptedException {
//        MapDetails mapDetails =new MapDetails(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        FavoriteLocation fav = new FavoriteLocation(driver);
//        COSA cosa = new COSA(driver);
//        GuestFlow guestFlow = new GuestFlow(driver);
////        customerLogin.SwitchToTab(0);
////        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
////        fav.ScanChargerOFElectricChargerLocation();
//        guestFlow.ScanQROFSeleniumCharger();
//        operation.ClickButton(GuestVerificationPage.AskCosaButton,2000);
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
//        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/login"));
//
//
//
//
//
//
//    }

    @Test(priority = 16)
    @TestParameters(testCaseId = {"TC-52"})
    public void TC_52_CheckURLWhenCustomerComingToCosaPageFromSessionPage() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.SwitchToTab(0);
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        fav.ScanChargerOFElectricChargerLocation();
        cosa.ScanRawLocationCharger();
        operation.clickButton(GuestVerificationPage.AskCosaButton,2000);
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/cosa/58e27a8d-9215-4b10-a579-815e124fbf92"));


    }

    @Test(priority = 17)
    @TestParameters(testCaseId = {"TC-53"})
    public void TC_53_CheckIfALoggedOutUserTriesToAccessCosaPageByCopingTheUrl() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        customerLogin.LogoutFromCustomerAccount();
        cosa.GoToCOSAWithRawLocationID();
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/login"));


    }

    @Test(priority = 18)
    @TestParameters(testCaseId = {"TC-54,55"})
    public void TC_54_55_CheckWhenCustomerClickOnAddToWatchlistFromFavoritesPage() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.SwitchToTab(0);
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        fav.GoToFavoriteLocationPage();
        operation.clickButton(FavoriteLocation.AddToWatchListButton1,2000);
        Assert.assertTrue(mapDetails.verifyTextMatching(2000,COSA.COSAFirstMsg,cosa.COSAFirstMsgForTester()));


    }

    @Test(priority = 19)
    @TestParameters(testCaseId = {"TC-56"})
    public void TC_56_CheckAllExpectedBoxWhenCustomerClickOnAddToWatchlistFromFavoritesPage() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        fav.GoToFavoriteLocationPage();
        operation.clickButton(FavoriteLocation.AddToWatchListButton1,2000);
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,COSA.KeepAnEyeOnThisLocation));
        Assert.assertTrue(cosa.verifyTextMatching(500,COSA.ShowMeWatchList,"Show me the locations I am watching"));
        Assert.assertTrue(cosa.verifyTextMatching(500,COSA.ReportAProblem,"Report a problem"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.HowDoIUseCharger));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.COSALOGOInChatBot));



    }

    @Test(priority = 22)
    @TestParameters(testCaseId = {"TC-68"})
    public void TC_68_CheckAllExpectedBoxWhenCustomerClickOnAddToWatchlistFromFavoritesPage() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        fav.GoToFavoriteLocationPage();
        operation.clickButton(FavoriteLocation.AddToWatchListButton1,2000);
        Assert.assertTrue(cosa.verifyCosaPageUrlWhenMovingFromFavorites());



    }

    @Test(priority = 24)
    @TestParameters(testCaseId = {"TC-70"})
    public void TC_70_CheckWhenCustomerClicksOnkeepOnEyeOnThisLocationFromTheChatbox() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        mapDetails.GoToD10LocationInMapDetails();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        Assert.assertTrue(cosa.verifyTextMatching(2000,COSA.CustomerFirstMessage,"Keep an eye on this location"));



    }

    @Test(priority = 25)
    @TestParameters(testCaseId = {"TC-71"})
    public void TC_71_CheckCOSAResponseWhenKeepOnEyeOnThisLocationClickedMovingFromLocationDetails() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        mapDetails.GoToD10LocationInMapDetails();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        Assert.assertTrue(cosa.verifyTextMatching(4500,COSA.COSAFirstReply,cosa.COSAMsgForD10LocationWhenTesterIsLoggedIn()));



    }

    @Test(priority = 26)
    @TestParameters(testCaseId = {"TC-72"})
    public void TC_72_CheckExpectedOptionsInCOSAWhenKeepOnEyeOnThisLocationClickedMovingFromLocationDetails() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        mapDetails.GoToD10LocationInMapDetails();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(2000,COSA.TimeBox));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.DateBox));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.ReturnToMainMenu));
        Assert.assertTrue(cosa.verifyElementNotDisplayed(1000,COSA.AddressBox));


    }

    @Test(priority = 27)
    @TestParameters(testCaseId = {"TC-73,74"})
    public void TC_73_74_CheckWhenDateIsSelectedFromDatePicker() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        dashboard.RefreshBrowser();
        mapDetails.GoToD10LocationInMapDetails();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        operation.clickButton(COSA.DateBox,2000);
        Assert.assertTrue(cosa.verifyCurrentDateIsShowingInChatAfterSelectingToday());



    }

    @Test(priority = 28)
    @TestParameters(testCaseId = {"TC-75"})
    public void TC_75_CheckDateBoxIsDisappearedAfterPostingTheDate() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        dashboard.RefreshBrowser();
        mapDetails.GoToD10LocationInMapDetails();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        operation.clickButton(COSA.DateBox,2000);
        cosa.clickOnFutureDate(3);
        Assert.assertTrue(cosa.verifyElementNotDisplayed(2000,COSA.DateBox));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.ReturnToMainMenu));




    }

    @Test(priority = 29)
    @TestParameters(testCaseId = {"TC-76"})
    public void TC_76_CheckPastDatesAreDisabled() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        dashboard.refreshBrowser();
//        mapDetails.GoToD10LocationInMapDetails();
//        operation.ClickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        operation.clickButton(COSA.DateBox,2000);
        Assert.assertTrue(cosa.verifyPastDateIsDisabled());


    }

    @Test(priority = 30)
    @TestParameters(testCaseId = {"TC-77,78"})
    public void TC_77_78_CheckSelectedTimeIsPostedWithCorrectFormat() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        dashboard.RefreshBrowser();
        mapDetails.GoToD10LocationInMapDetails();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        Assert.assertTrue(cosa.verifyTimeIsPostedCorrectlyOnChatBot("02"));


    }

    @Test(priority = 31)
    @TestParameters(testCaseId = {"TC-79"})
    public void TC_79_CheckTimeFieldIsVanishedAfterSelectingTime() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        dashboard.refreshBrowser();
//        mapDetails.GoToD10LocationInMapDetails();
//        operation.ClickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        cosa.selectTime("03",COSA.AM);
        Assert.assertTrue(cosa.verifyElementNotDisplayed(2000,COSA.TimeBox));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.ReturnToMainMenu));


    }

    @Test(priority = 32)
    @TestParameters(testCaseId = {"TC-80,82,83"})
    public void TC_80_82_83_CheckWhatHappensAfterPostingTimeAndDate() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        mapDetails.GoToPaikareLocation();
//        operation.ClickButton(MapDetails.AskCOSAButton,2000);
//        operation.ClickButton(COSA.KeepAnEyeOnThisLocation,2000);
//        cosa.clickOnFutureDate();
//        cosa.selectTime("03");
//        Assert.assertTrue(cosa.verifyElementNotDisplayed(2500,COSA.DateBox));
//        Assert.assertTrue(cosa.verifyElementNotDisplayed(500,COSA.TimeBox));
        Assert.assertTrue(cosa.verifyCOSAResponseAfterAddingASpecificLocationToWatchlist(COSA.COSASecondReply));


    }



//    @Test(priority = 33)
//    @TestParameters(testCaseId = {"TC-84"})
//    public void TC_84_CheckLocationIsAddedToWatchlist() throws InterruptedException {
//        MapDetails mapDetails =new MapDetails(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        FavoriteLocation fav = new FavoriteLocation(driver);
//        COSA cosa = new COSA(driver);
//        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        Assert.assertTrue(cosa.verifyLocationIsAddedToWatchlist());
//
//
//    }

    @Test(priority = 33)
    @TestParameters(testCaseId = {"TC-85"})
    public void TC_85_CheckWhatHappensAfterPostingTimeAndDate() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        mapDetails.GoToRampuraLocation();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        cosa.clickOnFutureDate(2);
        cosa.selectTime("07",COSA.AM);
        Assert.assertTrue(cosa.verifyElementNotDisplayed(2000,COSA.DateBox));
        Assert.assertTrue(cosa.verifyElementNotDisplayed(500,COSA.TimeBox));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.ShowMeWatchList));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.ReturnToMainMenu));


    }


    @Test(priority = 36)
    @TestParameters(testCaseId = {"TC-88"})
    public void TC_88_CheckShowMeTheLocationsIAmWatching() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        mapDetails.GoToRampuraLocation();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.ShowMeWatchList,2000);
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/cosa/watchlist"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,WatchList.WatchListTitle));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,WatchList.WatchListContainer));


    }

    @Test(priority = 39)
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_CheckWhenUserTapReportAProblem() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        mapDetails.GoToSundarbanCourierLocation();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.ReportAProblem,2000);
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/customer-support/create-ticket"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,CustomerSupport.CreateTicketPageTitle));


    }



    @Test(priority = 55)
    @TestParameters(testCaseId = {"TC-97,98"})
    public void TC_97_98_CheckWhatHappensWhenUserClicksOnTheReturnToTheMainMenu () throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        mapDetails.GoToRampuraLocation();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        cosa.clickOnFutureDate(3);
        cosa.selectTiming("11",COSA.AM);
        operation.clickButton(COSA.ReturnToMainMenu,2000);
        Assert.assertTrue(cosa.verifyElementNotDisplayed(2000,COSA.COSAFirstReply));
        Assert.assertTrue(cosa.verifyElementNotDisplayed(500,COSA.CustomerFirstMessage));
        Assert.assertTrue(cosa.verifyElementNotDisplayed(500,COSA.ReturnToMainMenu));


    }

    @Test(priority = 56)
    @TestParameters(testCaseId = {"TC-99"})
    public void TC_99_CheckReturnToTheMainMenu() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        mapDetails.GoToRampuraLocation();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(2000,COSA.ReturnToMainMenu));


    }


    @Test(priority = 60)
    @TestParameters(testCaseId = {"TC-106"})
    public void TC_106_CheckCOSAResponseForAlreadyWatchedLocation() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        mapDetails.GoToRampuraLocation();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        cosa.clickOnFutureDate(1);
        cosa.selectTime("12",COSA.PM);
        mapDetails.GoToRampuraLocation();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        cosa.clickOnFutureDate(1);
        cosa.selectTime("12",COSA.PM);
        Assert.assertTrue(cosa.verifyCOSAResponseWhileAddingAlreadyAddedLocationToWatchlist(COSA.COSASecondReply));


    }

    @Test(priority = 100)
    @TestParameters(testCaseId = {"TC-200"})
    public void TC_200_ClearWatchList() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        WatchList watchList = new WatchList(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        watchList.GoToWatchList();
        cosa.clearWatchList();


    }








}
