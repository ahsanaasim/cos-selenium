package tests.US241WatchLIst;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class WatchListTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();


    @Test(priority = 1)
    @TestParameters(testCaseId = {"TC-00"})
    public void TC_00_ClearWatchList() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation fav = new FavoriteLocation(driver);
        WatchList watchList = new WatchList(driver);
        COSA cosa = new COSA(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
        watchList.GoToWatchList();
        cosa.clearWatchList();
        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
//        watchList.GoToWatchList();
//        cosa.clearWatchList();
//        customerLogin.LogoutFromCustomerAccount();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        watchList.GoToWatchList();
        cosa.clearWatchList();
        customerLogin.LogoutFromCustomerAccount();



    }


    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-0"})
    public void TC_0_PreConditionLoginToCOSAdmin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        EditLocation editLocation = new EditLocation(driver);
        createLocation.NewTabOpenAndSwitchToNewTab(1);
        Thread.sleep(2500);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        editLocation.makeALocationOnline("Ramrpura Bridge");


    }





    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckWatchListISAccessibleWithoutLoginAsCustomer() throws InterruptedException {
        WatchList watchList = new WatchList(driver);
        COSA cosa = new COSA(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.LogoutFromCustomerAccount();
        watchList.SwitchToTab(0);
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
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        operation.ClickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(2000,CustomerMenu.Watchlist));
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(1000,CustomerMenu.WatchlistLogo));



    }

    @Test(priority = 7)
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckWhatHappensAfterClickOnWatchListFromMenu() throws InterruptedException {
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
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(3500,FavoriteLocation.NoDataInTableImage));
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
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckPropertyNameAndItsAddress() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
//        customerLogin.SwitchToTab(0);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"), "EitaiPassword10");
        watchList.AddRampuraLocationToWatchlist(5,"10",COSA.AM);
        watchList.GoToWatchList();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.Watchlist,2000);
        Assert.assertTrue(watchList.verifyPropertyNameAndItsAddress());



    }




    @Test(priority = 13)
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckAvailableChargersAndSeeInMapButtonVisibility() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        customerLogin.SwitchToTab(0);
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
//        customerLogin.GoToCustomerLoginPage();
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
    public void TC_34_CheckWhatHappenAfterOnCrossButtonToRemoveALocationFromWatchList() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        watchList.AddPaikareShopLocationToWatchlist(2,"01",COSA.PM);
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
        watchList.AddPaikareShopLocationToWatchlist(5,"04",COSA.PM);
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
        watchList.AddPaikareShopLocationToWatchlist(5,"02",COSA.PM);
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
        watchList.AddPaikareShopLocationToWatchlist(4,"03",COSA.AM);
        watchList.GoToWatchList();
        Assert.assertTrue(watchList.verifyLocationIsRemovedFromTheWatchList());


    }

    @Test(priority = 26)
    @TestParameters(testCaseId = {"TC-37"})
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
        watchList.AddPaikareShopLocationToWatchlist(1,"03",COSA.AM);
        watchList.GoToWatchList();
        operation.ClickButton(WatchList.CrossButton,2000);
        operation.ClickButton(WatchList.YesButton,2000);
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(1200,WatchList.RemoveSuccessfully));


    }


    @Test(priority = 27)
    @TestParameters(testCaseId = {"TC-43,44"})
    public void TC_43_44_CheckWatcherCountForSingleWatcher() throws InterruptedException {
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
        cosa.clearWatchList();
        watchList.AddRauAvenueLocationToWatchlist(3,"11",COSA.AM);
        watchList.GoToWatchList();
        Assert.assertTrue(watchList.verifyTextMatching(2000,WatchList.WatcherButton,"1 watcher"));


    }

    @Test(priority = 28)
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_CheckWatcherCountForMultipleWatcher() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
        watchList.GoToWatchList();
        cosa.clearWatchList();
        watchList.AddRauAvenueLocationToWatchlist(3,"09",COSA.AM);
        watchList.GoToWatchList();
        Assert.assertTrue(watchList.verifyTextMatching(1500,WatchList.WatcherButton,"2 watchers"));


    }


    @Test(priority = 29)
    @TestParameters(testCaseId = {"TC-45.2"})
    public void TC_45_2_CheckWatcherCountForMultipleWatcher() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        watchList.GoToWatchList();
        cosa.clearWatchList();
        watchList.AddRauAvenueLocationToWatchlist(3,"01",COSA.PM);
        watchList.GoToWatchList();
        Assert.assertTrue(watchList.verifyTextMatching(1500,WatchList.WatcherButton,"2 watchers"));



    }

    @Test(priority = 30)
    @TestParameters(testCaseId = {"TC-45.3"})
    public void TC_45_3_CheckWatcherCountForThreeWatcher() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        watchList.GoToWatchList();
        Assert.assertTrue(watchList.verifyTextMatching(1500,WatchList.WatcherButton,"3 watchers"));



    }


    @Test(priority = 31)
    @TestParameters(testCaseId = {"TC-45.3"})
    public void TC_46_CheckWatcherCountIsDecreasingAfterRemovingALocation() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
        customerLogin.LogoutFromCustomerAccount();
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
        watchList.GoToWatchList();
        cosa.clearWatchList();
        customerLogin.LogoutFromCustomerAccount();
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        watchList.GoToWatchList();
        Assert.assertTrue(watchList.verifyTextMatching(1500,WatchList.WatcherButton,"2 watchers"));



    }

    @Test(priority = 32)
    @TestParameters(testCaseId = {"TC-54"})
    public void TC_54_CheckCountInWatchlistIsIncreasingAfterAddingALocationToWatchList() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
        customerLogin.LogoutFromCustomerAccount();
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        Assert.assertTrue(watchList.verifyLocationCountIsIncreasingAfterAddingToWatchlist());



    }

    @Test(priority = 33)
    @TestParameters(testCaseId = {"TC-55"})
    public void TC_55_CheckCountInWatchlistIsDecreasingAfterRemovingALocationFromWatchList() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        cosa.AddLocationToWatchlistWithCurrentTiming();
        Assert.assertTrue(watchList.verifyLocationCountIsDecreasingAfterRemovingFromWatchlist());



    }

    @Test(priority = 34)
    @TestParameters(testCaseId = {"TC-56"})
    public void TC_56_CheckCountInWatchlistMatchingWithList() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        cosa.AddLocationToWatchlistWithCurrentTiming();
        watchList.GoToWatchList();
        Assert.assertTrue(watchList.verifyLocationsCountInTitleMatchWithList());



    }


    @Test(priority = 40)
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_40_CheckLocationStatusForAvailable() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        watchList.GoToWatchList();
        cosa.clearWatchList();
        watchList.AddRampuraLocationToWatchlist(7,"09",COSA.PM);
        watchList.GoToWatchList();
        Assert.assertTrue(watchList.verifyAvailableLocationStatus());



    }


    @Test(priority = 41)
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_CheckLocationStatusForUnavailability() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        watchList.GoToWatchList();
        cosa.clearWatchList();
        watchList.AddRampuraLocationToWatchlist(8,"10",COSA.PM);
        watchList.GoToWatchList();
        Assert.assertTrue(watchList.verifyUnavailableLocationStatus());



    }

    @Test(priority = 42)
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_CheckLocationStatusForUnavailabilityForNoChargers() throws InterruptedException {
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        WatchList watchList = new WatchList(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        watchList.GoToWatchList();
        cosa.clearWatchList();
        watchList.AddPaikareShopLocationToWatchlist(7,"12",COSA.PM);
        watchList.GoToWatchList();
        Assert.assertTrue(watchList.verifyAnElementDisplayedOrNot(2500,WatchList.UnavailableStatus));



    }














}
