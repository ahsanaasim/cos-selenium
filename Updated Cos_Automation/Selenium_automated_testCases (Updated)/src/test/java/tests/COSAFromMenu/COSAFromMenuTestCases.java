package tests.COSAFromMenu;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class COSAFromMenuTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();



    @Test(priority = 1)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckCOSAInMenu() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        operation.ClickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(customerLogin.verifyAnElementDisplayedOrNot(2000,CustomerMenu.COSAFromMenu));
        Assert.assertTrue(customerLogin.verifyAnElementDisplayedOrNot(500,CustomerMenu.COSALOGOFromMenu));



    }

    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-6,20"})
    public void TC_6_20_CheckAfterClickingCOSAButtonFromMenu() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        dashboard.RefreshBrowser();
        operation.ClickButton(CustomerSupport.Menu,2000);
        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/cosa"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.COSAFirstMsg));




    }

    @Test(priority = 3)
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckFirstMsgFromCOSA() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        Assert.assertTrue(cosa.verifyTextMatching(2000,COSA.COSAFirstMsg,cosa.COSFirstMsgForTester()));



    }

    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckAllTheMsgBoxInChatBot() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.KeepAnEyeOnSomeLocations));
        Assert.assertTrue(cosa.verifyTextMatching(1000,COSA.ShowMeWatchList,"Show me the locations I am watching"));
        Assert.assertTrue(cosa.verifyTextMatching(1000,COSA.ReportAProblem,"Report a problem"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.HowDoIUseCharger));



    }

    @Test(priority = 5)
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckCOSALogoAboveAllBoxes() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.COSALOGOInChatBot));




    }

    @Test(priority = 6)
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckLoggedOutUserCanAccessCOSA() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        customerLogin.LogoutFromCustomerAccount();
        cosa.GoToCOSAChatbot();
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/login"));



    }

    @Test(priority = 8)
    @TestParameters(testCaseId = {"TC-70,71"})
    public void TC_70_71_CheckShowMeTheLocationsIAmWatching() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        dashboard.RefreshBrowser();
        operation.ClickButton(CustomerSupport.Menu,2000);
        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        operation.ClickButton(COSA.ShowMeWatchList,2000);
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/cosa/watchlist"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,WatchList.WatchListTitle));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,WatchList.WatchListContainer));



    }

    @Test(priority = 9)
    @TestParameters(testCaseId = {"TC-72,73"})
    public void TC_72_73_CheckWhenUserTapReportAProblem() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        operation.ClickButton(COSA.ReportAProblem,2000);
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/customer-support/create-ticket"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,CustomerSupport.CreateTicketPageTitle));



    }

    @Test(priority = 10)
    @TestParameters(testCaseId = {"TC-22,23"})
    public void TC_22_23_CheckIfUserClicksOnTheKeepOnEyeSomeLocations() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        operation.ClickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        Assert.assertTrue(cosa.verifyTextMatching(2000,COSA.CustomerFirstMessage,"Keep an eye on some locations"));
        Assert.assertTrue(cosa.verifyTextMatching(2000,COSA.COSAFirstReply, cosa.COSFResponseAfterClickingKeepOnEyeSomeLocations()));




    }

    @Test(priority = 11)
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckAllTheBoxesAreShowingAfterClickingOnKeepAnEye() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        cosa.GoToCOSAChatbot();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        operation.ClickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        Assert.assertTrue(cosa.verifyTextMatching(2000,COSA.CustomerFirstMessage,"Keep an eye on some locations"));
        Assert.assertTrue(cosa.verifyTextMatching(2000,COSA.COSAFirstReply, cosa.COSFResponseAfterClickingKeepOnEyeSomeLocations()));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.DateBox));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.CalenderIcon));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.TimeBox));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.ClockIcon));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.AddressBox));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.SearchIcon));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.ReturnToMainMenu));




    }


    @Test(priority = 12)
    @TestParameters(testCaseId = {"TC-25,26"})
    public void TC_25_26_CheckWhenUserSelectADateFromDatePicker() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        operation.ClickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        operation.ClickButton(COSA.DateBox,2000);
        Assert.assertTrue(cosa.verifyCurrentDateIsShowingInChatAfterSelectingToday());




    }

    @Test(priority = 12)
    @TestParameters(testCaseId = {"TC-25,26"})
    public void TC_27_CheckDatePickerDisappearedAfterSelectingADateFromDatePicker() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        operation.ClickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        operation.ClickButton(COSA.DateBox,2000);
        operation.ClickButton(COSA.TodayDate,2000);
        Assert.assertTrue(cosa.verifyElementNotDisplayed(2000,COSA.DateBox));




    }

}
