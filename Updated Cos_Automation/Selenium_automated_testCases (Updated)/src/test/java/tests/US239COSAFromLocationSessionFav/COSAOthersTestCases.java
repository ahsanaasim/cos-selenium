package tests.US239COSAFromLocationSessionFav;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

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
        Assert.assertTrue(operation.ClickButton(GuestFlow.ContinueGuestBtn,2000));
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
        Assert.assertTrue(operation.ClickButton(GuestFlow.VerifyButton,300));
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
        operation.ClickButton(MapDetails.AskCOSAButton,2000);
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
        operation.ClickButton(MapDetails.AskCOSAButton,2000);
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
        operation.ClickButton(MapDetails.AskCOSAButton,2000);
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
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"), "EitaiPassword@10");
        fav.ScanChargerOFEBotsfordAvenue62659569Location();
        operation.ClickButton(GuestVerificationPage.AskCosaButton,2000);
        Assert.assertTrue(mapDetails.verifyTextMatching(2000,COSA.COSAFirstMsg,cosa.COSAFirstMsgForLM10()));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,COSA.KeepAnEyeOnThisLocation));
        Assert.assertTrue(cosa.verifyTextMatching(500,COSA.ShowMeWatchList,"Show me the locations I am watching"));
        Assert.assertTrue(cosa.verifyTextMatching(500,COSA.ReportAProblem,"Report a problem"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.HowDoIUseCharger));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.COSALOGOInChatBot));





    }

    @Test(priority = 11)
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
        operation.ClickButton(GuestVerificationPage.AskCosaButton,2000);
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/login"));




    }

    @Test(priority = 11)
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_CheckGuestIsRedirectingToCosaAfterLoginWhenGuestClicksOnTheAskCosaButtonAsAGuest() throws InterruptedException {
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
        guestFlow.ScanQROFSeleniumCharger();
        operation.ClickButton(GuestVerificationPage.AskCosaButton,2000);
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/login"));






    }

    @Test(priority = 12)
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
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        fav.ScanChargerOFElectricChargerLocation();
        cosa.ScanRawLocationCharger();
        operation.ClickButton(GuestVerificationPage.AskCosaButton,2000);
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"), "EitaiPassword@10");
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/login"));






    }



}
