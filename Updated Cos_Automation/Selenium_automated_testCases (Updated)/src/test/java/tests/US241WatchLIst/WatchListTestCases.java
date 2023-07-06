package tests.US241WatchLIst;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class WatchListTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();


    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckWatchListISAccessibleWithoutLoginAsCustomer() throws InterruptedException {
        WatchList watchList = new WatchList(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.SwitchToTab(0);
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
        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        customerLogin.LogoutFromCustomerAccount();
        watchList.GoToWatchList();
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/login"));



    }
}
