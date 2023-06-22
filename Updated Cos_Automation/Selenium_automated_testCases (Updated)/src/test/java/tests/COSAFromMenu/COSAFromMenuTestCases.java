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
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckAfterClickingCOSAButtonFromMenu() throws InterruptedException {
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
        Assert.assertTrue(cosa.COSAPageURLCheck("https://test-app.chargeonsite.com/customer/cosa"));
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
        Assert.assertTrue(cosa.verifyTextMatching(1000,COSA.COSAFirstMsg,cosa.COSFirstMsgForTester()));



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
        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.COSAFromMenu,2000);
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.KeepAnEyeOnSomeLocations));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.ShowMeWatchList));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.ReportAProblem));
        Assert.assertTrue(cosa.verifyAnElementDisplayedOrNot(1000,COSA.HowDoIUseCharger));



    }
}
