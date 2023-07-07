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
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithSavedPhoneNumber"),"EitaiPassword10");
        watchList.GoToWatchList();
        cosa.clearWatchList();


    }


    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckWatchListISAccessibleWithoutLoginAsCustomer() throws InterruptedException {
        WatchList watchList = new WatchList(driver);
        COSA cosa = new COSA(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerLogin.SwitchToTab(0);
        customerLogin.LogoutFromCustomerAccount();
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
        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.Watchlist,2000);
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
}
