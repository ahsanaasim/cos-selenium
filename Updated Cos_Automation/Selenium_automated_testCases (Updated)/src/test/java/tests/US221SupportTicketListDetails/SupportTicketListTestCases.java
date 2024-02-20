package tests.US221SupportTicketListDetails;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class SupportTicketListTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckIfThereIsACustomerSupportButtonInTheMenu() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        customerSupport.GoToCustomerLoginPage();
        customerLogin.loginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        operation.clickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CustomerSupport.CustomerSupport));


    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2,4"})
    public void TC_2_4_CheckWhatHappenedIfTheCustomerClickedOnTheCustomerSupportButtonFromMenu() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
//        customerSupport.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        operation.ClickButton(CustomerSupport.Menu,2000);
        operation.clickButton(CustomerSupport.CustomerSupport,1000);
        Assert.assertTrue(customerSupport.verifyTicketHistoryListTitle());


    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckIfThe3CategoriesIsShowingSameAsTheDesign() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
//        operation.ClickButton(CustomerSupport.Menu,2000);
        operation.clickButton(CustomerSupport.CreateATicket,2000);
        operation.clickButton(CustomerSupport.CategoryField,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.TicketTypeGeneral));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CreateTicket.TicketTypeTechnical));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CreateTicket.TicketTypeBilling));

    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckIfSeeDetailsButtonIsShowingInTheTicketList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
//        operation.ClickButton(CustomerSupport.Menu,2000);
        customerSupport.GoToCustomerSupportPage();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(2000,CustomerSupport.TicketsSeeDetails));


    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckTicketDetailsPageTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
        operation.clickButton(CustomerSupport.TicketsSeeDetails,2000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(2000,CustomerSupport.SeeDetailsPageTitle));

    }
    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckAlertMessageInTicketDetails() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
        customerSupport.GoToCustomerSupportPage();
        operation.clickButton(CustomerSupport.TicketsSeeDetails,2000);
        Assert.assertTrue(ticket.verifyTextMatching(4000,CustomerSupport.MsgUnderTitle,customerSupport.MsgUnderTitleInTicketDetails()));

    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckIfCategoryInListIsAsSameAsInDetails() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
        customerSupport.GoToCustomerSupportPage();
        Assert.assertTrue(customerSupport.verifyTicketListDataMatchingWithDrawer(CustomerSupport.TicketCategoryInList1,CustomerSupport.TicketCategoryInSeeDetails));

    }
    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckIfSessionInListIsAsSameAsInDetails() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
        customerSupport.GoToCustomerSupportPage();
        Assert.assertTrue(customerSupport.verifySessionIdIsMatchingWithSeeDetailsSessionId());

    }
    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckRefreshButtonInSeeDetails() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
//        customerSupport.GoToCustomerSupportPage();
        Assert.assertTrue(customerSupport.verifyAnElementDisplayedOrNot(1000,ZohoConversation.RefreshButton));

    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-17,18"})
    public void TC_17_18_CheckTicketsCountAfterCreatingANewTicketFromSupportPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
        customerSupport.GoToCustomerSupportPage();
        Assert.assertTrue(customerSupport.verifyTicketIsIncreasingTheListAfterCreatingANewTicket());

    }

//    @Test(priority = 14)//Done
//    @TestParameters(testCaseId = {"TC-18"})
//    public void TC_18_CheckTicketsCountAfterCreatingANewTicketFromSupportPage() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        CreateTicket ticket = new CreateTicket(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        CustomerSupport customerSupport = new CustomerSupport(driver);
////        customerSupport.GoToCustomerLoginPage();
////        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
////        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
////        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
//        customerSupport.GoToCustomerSupportPage();
//        Assert.assertTrue(customerSupport.verifyTicketIsIncreasingTheListAfterCreatingANewTicket());
//
//    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-8,20"})
    public void TC_8_20_CheckTimeAndDateAfterCreatingANewTicketFromSupportPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerSupport.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        customerSupport.GoToCustomerSupportPage();
        Assert.assertTrue(customerSupport.verifyNewlyCreatedTicketDateAndTime());

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-5,19"})
    public void TC_5_19_CheckOpenStatusForNewlyCreatedTicketFromSupportPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerSupport.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        customerSupport.GoToCustomerSupportPage();
        Assert.assertTrue(customerSupport.verifyOpenStatusForNewlyCreatedTicket());

    }
    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-23_46"})
    public void TC_23_46_checkTheListDetailsAfterChangingTheStatusToClosed() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerSupport.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        customerSupport.GoToCustomerSupportPage();
        ticket.newTabOpenAndSwitchToNewTab(1);
        ticket.goToWebsite("https://www.zoho.com/desk/");
        ticket.click(CreateTicket.ZohoSign);
        operation.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
        operation.clickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
        operation.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
        operation.clickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
        operation.clickButton(TicketList.ZohoToastMessageCancel,15000);
        operation.clickButton(TicketList.ZohoOpenStatus,5000);
        operation.clickButton(TicketList.ZohoClosedStatus,2000);
        ticket.switchToTab(0);
        Thread.sleep(5000);
        customerSupport.GoToCustomerSupportPage();
//        Assert.assertTrue(customerSupport.verifyAnElementDisplayedOrNot(2500,CustomerSupport.ClosedStatus1));
        Assert.assertTrue(customerSupport.verifyStatusOfFirstTicketInListIsClosed());


    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_checkTheListDetailsAfterChangingTheStatusToOpenFromZohoDesk() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerSupport.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        customerSupport.GoToCustomerSupportPage();
        ticket.switchToTab(1);
        operation.clickButton(TicketList.ZohoClosedStatus,2000);
        operation.clickButton(TicketList.ZohoOpenStatus,3000);
        Thread.sleep(2000);
        ticket.switchToTab(0);
        Thread.sleep(6500);
        customerSupport.GoToCustomerSupportPage();
//        Assert.assertTrue(customerSupport.verifyAnElementDisplayedOrNot(1000,CustomerSupport.OpenStatus1));
        Assert.assertTrue(customerSupport.verifyStatusOfFirstTicketInListIsOpen());

    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckTheEmptyViewWhenNoTicketIsCreated() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateProperty property = new CreateProperty(driver);
//        customerSupport.GoToCustomerLoginPage();
        customerLogin.LogoutFromCustomerAccount();
        customerLogin.loginToACustomerAccount((prop.getProperty("CustomerWithNoTicket")),"EitaiPassword10");
        operation.clickButton(CustomerSupport.Menu,2000);
        operation.clickButton(CustomerSupport.CustomerSupport,2000);
        customerSupport.verifyAnElementDisplayedOrNot(1000,CustomerSupport.NoDataTable);
        customerSupport.verifyAnElementDisplayedOrNot(1000,CustomerSupport.NoTicketText);

    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_CheckTicketCountInEmptyView() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateProperty property = new CreateProperty(driver);
//        customerSupport.GoToCustomerLoginPage();
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.LoginToACustomerAccount((prop.getProperty("CustomerWithNoTicket")),"EitaiPassword10");
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        customerSupport.verifyTicketCountInEmptyView();

    }


}

