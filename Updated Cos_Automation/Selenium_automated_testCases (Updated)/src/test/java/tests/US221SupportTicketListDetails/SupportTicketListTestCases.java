package tests.US221SupportTicketListDetails;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

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
        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        operation.ClickButton(CustomerSupport.Menu,2000);
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
        operation.ClickButton(CustomerSupport.CustomerSupport,1000);
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
        operation.ClickButton(CustomerSupport.CreateATicket,2000);
        operation.ClickButton(CustomerSupport.CategoryField,1000);
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
        operation.ClickButton(CustomerSupport.TicketsSeeDetails,2000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(2000,CustomerSupport.SeeDetailsPageTitle));

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
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckTicketsCountAfterCreatingANewTicketFromSupportPage() throws InterruptedException {
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

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckTicketsCountAfterCreatingANewTicketFromSupportPage() throws InterruptedException {
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

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckTicketsCountAfterCreatingANewTicketFromSupportPage() throws InterruptedException {
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
        Assert.assertTrue(customerSupport.verifyNewlyCreatedTicketDateAndTime());

    }



}
