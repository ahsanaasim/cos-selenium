package tests.US248COSAFromMenu;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class COSAFromMenuTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();


    @Test(priority = 1)
    @TestParameters(testCaseId = {"TC-0"})
    public void TC_0_PreConditionLoginToCOSAdmin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        createLocation.NewTabOpenAndSwitchToNewTab(1);
        Thread.sleep(2500);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());


    }

    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckCOSAInMenu() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        customerLogin.SwitchToTab(0);
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        operation.clickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(customerLogin.verifyAnElementDisplayedOrNot(2000,CustomerMenu.COSAFromMenu));
        Assert.assertTrue(customerLogin.verifyAnElementDisplayedOrNot(500,CustomerMenu.COSALOGOFromMenu));



    }

    @Test(priority = 3)
    @TestParameters(testCaseId = {"TC-6,20"})
    public void TC_6_20_CheckAfterClickingCOSAButtonFromMenu() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        dashboard.refreshBrowser();
        operation.clickButton(CustomerSupport.Menu,2000);
        operation.clickButton(CustomerMenu.COSAFromMenu,2000);
        Assert.assertTrue(cosa.CurrentPageURLCheck("https://test-app.chargeonsite.com/customer/cosa"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.COSAFirstMsg));




    }

    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckFirstMsgFromCOSA() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        dashboard.refreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        Assert.assertTrue(cosa.verifyTextMatching(2000,COSA.COSAFirstMsg,cosa.COSAFirstMsgForTester()));



    }

    @Test(priority = 5)
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

    @Test(priority = 6)
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

    @Test(priority = 7)
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
        operation.clickButton(CustomerSupport.Menu,2000);
        operation.clickButton(CustomerMenu.COSAFromMenu,2000);
        operation.clickButton(COSA.ShowMeWatchList,2000);
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
        operation.clickButton(COSA.ReportAProblem,2000);
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
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
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
        dashboard.refreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
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
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        operation.clickButton(COSA.DateBox,2000);
        Assert.assertTrue(cosa.verifyCurrentDateIsShowingInChatAfterSelectingToday());




    }

    @Test(priority = 13)
    @TestParameters(testCaseId = {"TC-27"})
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
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        operation.clickButton(COSA.DateBox,2000);
        operation.clickButton(COSA.TodayDate,2000);
        Assert.assertTrue(cosa.verifyElementNotDisplayed(2000,COSA.DateBox));




    }

    @Test(priority = 14)
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_CheckWhenUserTriesToAddPastDatesInTheDateField() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        Assert.assertTrue(cosa.verifyPastDateIsDisabled());




    }

    @Test(priority = 15)
    @TestParameters(testCaseId = {"TC-29,30"})
    public void TC_29_30_CheckWhenCustomerSelectsAStartingTimeFromTheOptions() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        cosa.GoToCOSAChatbot();
        dashboard.refreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        Assert.assertTrue(cosa.verifyTimeIsPostedCorrectlyOnChatBot("07"));




    }

    @Test(priority = 16)
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_CheckTimeBoxIsVanishedAfterSelectingATime() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(01);
        cosa.selectTime("05",COSA.AM);
        Assert.assertTrue(cosa.verifyElementNotDisplayed(2500,COSA.DateBox));
        Assert.assertTrue(cosa.verifyElementNotDisplayed(2500,COSA.TimeBox));





    }

    @Test(priority = 17)
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_CheckWhenUserStartsTypingToAddressFieldForEnteringTheAddress() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        cosa.GoToCOSAChatbot();
        dashboard.refreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(02);
        cosa.selectTime("05",COSA.PM);
        operation.writeInputText(COSA.AddressBox,"Aftab Nagar",1500);
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(2500,COSA.SearchBoxList));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(2500,COSA.Area));





    }

    @Test(priority = 18)
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_CheckWhenUserSelectALocationFromSuggestion() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(03);
        cosa.selectTime("05",COSA.AM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        Assert.assertTrue(cosa.verifyTextMatching(3000,COSA.CustomerFourthMessage,"Address: Aftab Nagar, Dhaka, Bangladesh"));




    }
    @Test(priority = 19)
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_CheckAddressFieldIsDisappearingAfterSelectingAnAddress() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        Assert.assertTrue(cosa.verifyElementNotDisplayed(2500,COSA.AddressBox));



    }


    @Test(priority = 20)
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_CheckCOSAReplyAfterSelectingDateTimeAndAddress() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        cosa.GoToCOSAChatbot();
        dashboard.refreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(04);
        cosa.selectTime("05",COSA.PM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        Assert.assertTrue(cosa.verifyElementNotDisplayed(2500,COSA.DateBox));
        Assert.assertTrue(cosa.verifyElementNotDisplayed(500,COSA.TimeBox));
        Assert.assertTrue(cosa.verifyElementNotDisplayed(500,COSA.AddressBox));
        Assert.assertTrue(cosa.verifyTextMatching(500,COSA.COSASecondReply, cosa.COSAReplyAfterProvidingAllInformationCorrectly()));



    }

    @Test(priority = 21)
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_CheckSuggestedNearbyLocationCount() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(05);
        cosa.selectTime("05",COSA.AM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        Assert.assertTrue(cosa.verifyElementNotDisplayed(2500,COSA.DateBox));
        Assert.assertTrue(cosa.verifyElementNotDisplayed(500,COSA.TimeBox));
        Assert.assertTrue(cosa.verifyElementNotDisplayed(500,COSA.AddressBox));
        Assert.assertTrue(cosa.verifyFourNearbyLocationsAreShowing());



    }

    @Test(priority = 22)
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_40_CheckSuggestedNearbyLocations() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(4);
        cosa.selectTime("4",COSA.PM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        Assert.assertTrue(cosa.verifySuggestedNearbyLocation(COSA.SuggestedLocation1));
        Assert.assertTrue(cosa.verifySuggestedNearbyLocation(COSA.SuggestedLocation2));
        Assert.assertTrue(cosa.verifySuggestedNearbyLocation(COSA.SuggestedLocation3));
        Assert.assertTrue(cosa.verifySuggestedNearbyLocation(COSA.SuggestedLocation4));



    }

    @Test(priority = 23)
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_CheckCustomerResponseMessageAfterClickOnWatch() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(2);
        cosa.selectTime("07",COSA.PM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        operation.clickButton(COSA.WatchButton,2000);
        Assert.assertTrue(cosa.verifyCustomerResponseMessageAfterWatchingALocation(COSA.SuggestedLocation1,COSA.AddressOfSuggestedLocation1,COSA.CustomerFifthMessage));



    }

    @Test(priority = 24)
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_CheckCOSAResponseAfterAddingALocationToWatchlist() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(4);
        cosa.selectTime("03",COSA.AM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        operation.clickButton(COSA.WatchButton,2000);
        Assert.assertTrue(cosa.verifyCOSAResponseAfterAddingALocationToWatchlist(COSA.SuggestedLocation1,COSA.AddressOfSuggestedLocation1,COSA.COSAThirdReply));



    }

    @Test(priority = 25)
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_CheckWatchButtonINSuggestedNearbyLocations() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(5);
        cosa.selectTime("01",COSA.AM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1500,COSA.WatchButton));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.WatchButton2));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.WatchButton3));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(500,COSA.WatchButton4));



    }

    @Test(priority = 26)
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_CheckWhenUserClicksOnTheWatchButtonFromTheLocationList() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(6);
        cosa.selectTime("12",COSA.PM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        operation.clickButton(COSA.WatchButton,2000);
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.WatchingButton));



    }

    @Test(priority = 27)
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_CheckWhenNoNearbyLocationFoundBesideTheUsersArea() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(6);
        cosa.selectTime("01",COSA.AM);
        cosa.selectLocationFromAddressField("Buenos Aires, Argentina");
        Assert.assertTrue(cosa.verifyTextMatching(3000,COSA.COSASecondReply, cosa.COSAReplyForNoNearbyLocations()));



    }

    @Test(priority = 28)
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_CheckLocationName() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(2);
        cosa.selectTime("04",COSA.PM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        Assert.assertTrue(cosa.verifyLocationName());



    }

    @Test(priority = 28)
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_CheckLocationAddress() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.SwitchToTab(0);
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(7);
        cosa.selectTime("04",COSA.AM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        Assert.assertTrue(cosa.verifyLocationAddress());



    }

    @Test(priority = 29)
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_CheckLocationDistanceIsShowingInMile() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.SwitchToTab(0);
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(1);
        cosa.selectTime("04",COSA.PM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        Assert.assertTrue(cosa.verifyLocationDistanceSectionIsShowing());



    }





    @Test(priority = 48)
    @TestParameters(testCaseId = {"TC-62"})
    public void TC_62_CheckTheOptionsInCOSAAfterAddingTheLocationsToWatchlist() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
        cosa.SwitchToTab(0);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(2);
        cosa.selectTime("05",COSA.AM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        operation.clickButton(COSA.WatchButton,2000);
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(2000,COSA.WatchAnotherLocationInThisArea));
        Assert.assertTrue(cosa.verifyTextMatching(2000,COSA.ShowMeWatchList,"Show me the locations I am watching"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(2000,COSA.ReturnToMainMenu));



    }


    @Test(priority = 50)
    @TestParameters(testCaseId = {"TC-64,65"})
    public void TC_64_65_CheckWhatHappenedWhenUserTriesToAddTheSameLocationTwice() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(8);
        cosa.selectTime("02",COSA.PM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        operation.clickButton(COSA.WatchButton,2000);
        operation.clickButton(COSA.WatchingButton,2000);
        Assert.assertTrue(cosa.verifyCOSAResponseWhileAddingAlreadyAddedLocationToWatchlist(COSA.COSAForthReply));



    }

    @Test(priority = 55)
    @TestParameters(testCaseId = {"TC-68"})
    public void TC_68_CheckWhenUserTriesToAddDifferentLocationAtASameTime() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(3);
        cosa.selectTime("06",COSA.AM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        operation.clickButton(COSA.WatchButton,2000);
        operation.clickButton(COSA.WatchButton2,2000);
        operation.clickButton(COSA.WatchButton3,2000);
        Assert.assertTrue(cosa.verifyCustomerResponseMessageAfterWatchingALocation(COSA.SuggestedLocation1,COSA.AddressOfSuggestedLocation1,COSA.CustomerFifthMessage));
        Assert.assertTrue(cosa.verifyCOSAResponseAfterAddingALocationToWatchlist(COSA.SuggestedLocation1,COSA.AddressOfSuggestedLocation1,COSA.COSAThirdReply));
        Assert.assertTrue(cosa.verifyCustomerResponseMessageAfterWatchingALocation(COSA.SuggestedLocation2,COSA.AddressOfSuggestedLocation2,COSA.CustomerSixthMessage));
        Assert.assertTrue(cosa.verifyCOSAResponseAfterAddingALocationToWatchlist(COSA.SuggestedLocation2,COSA.AddressOfSuggestedLocation2,COSA.COSAForthReply));
        Assert.assertTrue(cosa.verifyCustomerResponseMessageAfterWatchingALocation(COSA.SuggestedLocation3,COSA.AddressOfSuggestedLocation3,COSA.CustomerSeventhMessage));
        Assert.assertTrue(cosa.verifyCOSAResponseAfterAddingALocationToWatchlist(COSA.SuggestedLocation3,COSA.AddressOfSuggestedLocation3,COSA.COSAFifthReply));


    }


    @Test(priority = 60)
    @TestParameters(testCaseId = {"TC-77,78"})
    public void TC_77_78_CheckWhatHappensAfterClickOnReturnToMainMenu() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        COSA cosa = new COSA(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        cosa.GoToCOSAChatbot();
//        dashboard.RefreshBrowser();
        operation.clickButton(COSA.KeepAnEyeOnSomeLocations,2000);
        cosa.clickOnFutureDate(4);
        cosa.selectTime("01",COSA.PM);
        cosa.selectLocationFromAddressField("Aftab Nagar, Dhaka, Bangladesh");
        operation.clickButton(COSA.WatchButton,2000);
        operation.clickButton(COSA.ReturnToMainMenu,2000);
        Assert.assertTrue(cosa.verifyTextMatching(2000,COSA.COSAFirstMsg,cosa.COSAFirstMsgForTester()));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(2000,COSA.KeepAnEyeOnSomeLocations));
        Assert.assertTrue(cosa.verifyTextMatching(1000,COSA.ShowMeWatchList,"Show me the locations I am watching"));
        Assert.assertTrue(cosa.verifyTextMatching(1000,COSA.ReportAProblem,"Report a problem"));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.HowDoIUseCharger));
        Assert.assertTrue(cosa.verifyElementNotDisplayed(1000,COSA.CustomerFirstMessage));
        Assert.assertTrue(cosa.verifyElementNotDisplayed(1000,COSA.CustomerSecondMessage));
        Assert.assertTrue(cosa.verifyElementNotDisplayed(1000,COSA.COSAFirstReply));

    }





}