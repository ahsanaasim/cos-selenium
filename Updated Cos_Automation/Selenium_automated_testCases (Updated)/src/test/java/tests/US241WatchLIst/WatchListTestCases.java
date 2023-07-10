package tests.US241WatchLIst;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class WatchListTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();


//    @Test(priority = 1)
//    @TestParameters(testCaseId = {"TC-00"})
//    public void TC_00_ClearWatchList() throws InterruptedException {
//        MapDetails mapDetails =new MapDetails(driver);
//        CustomerLogin customerLogin = new CustomerLogin(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        FavoriteLocation fav = new FavoriteLocation(driver);
//        WatchList watchList = new WatchList(driver);
//        COSA cosa = new COSA(driver);
//        GuestFlow guestFlow = new GuestFlow(driver);
//        watchList.GoToWatchList();
////        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        watchList.GoToWatchList();
//        cosa.clearWatchList();
//
//
//    }


    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckWatchListISAccessibleWithoutLoginAsCustomer() throws InterruptedException {
        WatchList watchList = new WatchList(driver);
        COSA cosa = new COSA(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.LogoutFromCustomerAccount();
        watchList.GoToWatchList();
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/login"));


    }

    @Test(priority = 5)
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckWatchListISAccessibleWithoutLoginAsCustomer() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
        customerLogin.LogoutFromCustomerAccount();
        watchList.GoToWatchList();
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/login"));



    }

    @Test(priority = 6)
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckWatchListOptionInCustomerMenu() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
        operation.ClickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(2000,CustomerMenu.Watchlist));
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(1000,CustomerMenu.WatchlistLogo));



    }

    @Test(priority = 7)
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckWhatHapeensAfterClickOnWatchListFromMenu() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
        dashboard.RefreshBrowser();
        operation.ClickButton(CustomerSupport.Menu,2000);
        operation.ClickButton(CustomerMenu.Watchlist,2000);
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/cosa/watchlist"));



    }

    @Test(priority = 7)
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckWatchListCountForEmptyWatchList() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
//        dashboard.RefreshBrowser();
        watchList.GoToWatchList();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.Watchlist,2000);
        cosa.clearWatchList();
        Assert.assertTrue(cosa.verifyTextMatching(2000,WatchList.WatchListTitle,"Watchlist (0)"));



    }

    @Test(priority = 8)
    @TestParameters(testCaseId = {"TC-6,7"})
    public void TC_6_7_CheckWatchListCountForEmptyWatchList() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.Watchlist,2000);
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(2000,FavoriteLocation.NoDataInTableImage));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,WatchList.NoLocationInWatchlistText));



    }

    @Test(priority = 8)
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckTitleOFWatchList() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.Watchlist,2000);
        Assert.assertTrue(watchList.verifyWatchListTitle());




    }





    @Test(priority = 12)
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckAvailableChargersAndSeeInMapButtonVisibility() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
        watchList.AddRampuraLocationToWatchlist(1,"9",COSA.PM);
        watchList.GoToWatchList();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.Watchlist,2000);
        Assert.assertTrue(watchList.verifyTextMatching(2000,WatchList.AvailableChargers,"Available Chargers"));
        Assert.assertTrue(watchList.verifyTextMatching(1000,WatchList.SeeInMap,"See in Map"));



    }

    @Test(priority = 14)
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckWatcherButton() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
        watchList.GoToWatchList();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.Watchlist,2000);
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(2000,WatchList.WatcherButton));



    }

    @Test(priority = 15)
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckAvailableChargersButtonFunctionality() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
        watchList.GoToWatchList();
//        operation.ClickButton(CustomerSupport.Menu,2000);
        operation.ClickButton(WatchList.AvailableChargers,2000);
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(2000,MapDetails.ChargersDetailsTitle));
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(1000,WatchList.ChargerDetailsCloseButton));




    }

    @Test(priority = 16)
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckSeeInMapButtonFunctionality() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
        watchList.GoToWatchList();
//        operation.ClickButton(CustomerSupport.Menu,2000);
        operation.ClickButton(WatchList.SeeInMap,2000);
        Assert.assertTrue(mapDetails.verifySystemIsRedirectingToMapPage());
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.UpperDrawer));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.LowerDrawer));




    }

    @Test(priority = 17)
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_CheckAlertForUpdatingCustomerNumber() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        customerLogin.LogoutFromCustomerAccount();
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        watchList.GoToWatchList();
//        operation.ClickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(watchList.verifyAlertForUpdatingCustomerNumber());




    }
    @Test(priority = 18)
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_CheckUnderlinedClickHereToUpdateText() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
//        watchList.GoToWatchList();
//        operation.ClickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(2000,WatchList.ClickHereToUpdateText));




    }



    @Test(priority = 19)
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_CheckClickHereToUpdateLinkISWorking() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        watchList.GoToWatchList();
        operation.ClickButton(WatchList.ClickHereToUpdateLink,2000);
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/profile"));
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(1000,CustomerProfile.UpdateProfileButton));
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(1000,CustomerProfile.UpdatePhone));




    }

    @Test(priority = 22)
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_CheckWhatHappenAfterOnWatchButton() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        watchList.AddPaikareShopLocationToWatchlist(3,"09",COSA.PM);
        watchList.GoToWatchList();
        operation.ClickButton(WatchList.CrossButton,2000);
        Assert.assertTrue(watchList.verifyTextMatching(1000,WatchList.RemoveAlert,watchList.AlertForRemoveALocationFromWatchlist()));
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(1000,WatchList.YesButton));
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(1000,WatchList.No));




    }

    @Test(priority = 23)
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_CheckPopUpIsClosedAfterClickOnNo() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.LogoutFromCustomerAccount();
        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        watchList.AddPaikareShopLocationToWatchlist(5,"01",COSA.PM);
        watchList.GoToWatchList();
        operation.ClickButton(WatchList.CrossButton,2000);
        operation.ClickButton(WatchList.No,2000);
        Assert.assertTrue(watchList.verifyElementNotDisplayed(2000,WatchList.RemoveAlert));


    }

    @Test(priority = 24)
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_CheckPopUpIsClosedAfterClickOnNYes() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.LogoutFromCustomerAccount();
        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        watchList.AddPaikareShopLocationToWatchlist(5,"01",COSA.PM);
        watchList.GoToWatchList();
        operation.ClickButton(WatchList.CrossButton,2000);
        operation.ClickButton(WatchList.YesButton,2000);
        Assert.assertTrue(watchList.verifyElementNotDisplayed(2000,WatchList.RemoveAlert));


    }

    @Test(priority = 25)
    @TestParameters(testCaseId = {"TC-36.2"})
    public void TC_36_2_CheckLocationIsRemovedAfterClickOnNYes() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        watchList.AddPaikareShopLocationToWatchlist(4,"02",COSA.PM);
        watchList.GoToWatchList();
        Assert.assertTrue(watchList.verifyLocationIsRemovedFromTheWatchList());


    }

    @Test(priority = 26)
    @TestParameters(testCaseId = {"TC-36.2"})
    public void TC_37_CheckSuccessAlertAfterRemovingALocationFromWatchList() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        watchList.AddPaikareShopLocationToWatchlist(1,"03",COSA.PM);
        watchList.GoToWatchList();
        operation.ClickButton(WatchList.CrossButton,2000);
        operation.ClickButton(WatchList.YesButton,2000);
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(1500,WatchList.RemoveSuccessfully));


    }



}
