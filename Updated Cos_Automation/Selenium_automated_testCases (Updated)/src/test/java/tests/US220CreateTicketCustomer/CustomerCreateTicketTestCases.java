package tests.US220CreateTicketCustomer;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class CustomerCreateTicketTestCases extends BaseTest {


    Properties prop = ConfigUtill.getConfig();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckIfThereIsACreateATicketButtonOnTheCustomerSupportPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        customerSupport.GoToCustomerLoginPage();
        customerLogin.loginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        operation.clickButton(CustomerSupport.Menu,2000);
        operation.clickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CustomerSupport.CreateATicket));


    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckIfThereIsACreateATicketButtonOnTheCustomerSupportPage() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(ticket.verifyTextMatching(1000,CustomerSupport.CreateATicket,"Create A Ticket"));

    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckCreateATicketButtonColorIsGreenOrNot() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(customerSupport.verifyCreateTicketButtonColor());

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckCreateATicketTextColorIsWhite() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(customerSupport.verifyCreateTicketTextColor());

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckIfTheCreateTicketPageUIIsShowingSameAsTheDesign() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        operation.clickButton(CustomerSupport.CreateATicket,2000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CustomerSupport.CreateTicketPageTitle));

    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckTheInputFields() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CustomerSupport.CategoryField));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.SelectASessionField));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CreateTicket.SubjectField));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.MessageField));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.UploadButton));

    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckTheMandatorySignInMandatoryField() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CustomerSupport.MandatoryCategorySign));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.MandatorySubjectSign));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.MandatoryMessageSign));

    }

//    @Test(priority = 8)//Done
//    @TestParameters(testCaseId = {"TC-8"})
//    public void TC_8_CheckThePlaceholderOfAllTheInputFieldsAreShowingSameAsTheDesign() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        CreateTicket ticket = new CreateTicket(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        CustomerSupport customerSupport = new CustomerSupport(driver);
////        customerSupport.GoToCustomerLoginPage();
////        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
////        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
////        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
////        operation.ClickButton(CustomerSupport.Menu,2000);
////        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        ticket.SelectOptionFromInputField(CustomerSupport.CategoryField,"Charging Issue");
//        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CustomerSupport.MandatoryCategorySign));
//        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.MandatorySubjectSign));
//        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.MandatoryMessageSign));
//
//    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckThePlaceholderOfCategoryField() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(ticket.verifyTextMatching(1000,CustomerSupport.CategoryPlaceholder,"Select"));

    }
    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckThePlaceholderOfSelectASessionInputFieldsAreShowingSameAsTheDesign() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(ticket.verifyTextMatching(500,CustomerSupport.SelectASessionPlaceholder,"Select"));

    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckTheSubjectFieldPlaceholder() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(ticket.verifyPlaceholder(CreateTicket.SubjectField,"Write here"));

    }
    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckTheMessageFieldPlaceholder() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(ticket.verifyPlaceholder(CustomerSupport.MessageField,"Write here"));

    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_13_CheckThereIsASubmitButtonInCreateTicketPage() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.SubmitButton));

    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckSubmitButtonIsGreenInCreateTicketPage() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(customerSupport.verifySubmitTicketButtonColor());

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckSubmitButtonTextColorIsWhite() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        Assert.assertTrue(customerSupport.verifySubmitTicketTextColor());

    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckIfThe3CategoriesIsShowingSameAsTheDesign() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        operation.clickButton(CustomerSupport.CategoryField,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.TicketTypeGeneral));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CreateTicket.TicketTypeTechnical));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CreateTicket.TicketTypeBilling));

    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-17,20"})
    public void TC_17_20_CheckWhatHappenedIfTheCustomerEntersAllTheInputAndClickOnTheSubmitButton() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        dashboard.refreshBrowser();
        ticket.SelectOptionFromInputField(CustomerSupport.CategoryField,"Software Issue");
        operation.writeInputText(CreateTicket.SubjectField,(prop.getProperty("TicketSubjectLessThanThirtyCharacter2")),1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),500);
        operation.clickButton(CustomerSupport.SubmitButton,2000);
        Assert.assertTrue(ticket.verifyTextMatching(300,CustomerSupport.FirstCreatedTicket,"Software Issue"));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.CreateATicket));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.TicketsHistory));

    }
    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckCreateTicketPageIsClosedAfterCreatingATicket() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        dashboard.RefreshBrowser();
        Assert.assertTrue(customerSupport.verifyCreateTicketPageIsClosedAfterCreatingNewTicket());

    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckIfCustomerCanSeeAllTheSessionIdHeHasAccessToInTheDropdownList() throws InterruptedException {
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
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        dashboard.RefreshBrowser();
        Assert.assertTrue(customerSupport.verifySessionsAreShowingInTheDropdownListAreSameAsChargingHistoryList());

    }
    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckWhatHappenedIfCosAdminTriesToCreateCustomerSupportTickerFromMenu() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateProperty property = new CreateProperty(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        dashboard.RefreshBrowser();
        customerLogin.LogoutFromCustomerAccount();
        customerLogin.loginToACustomerAccount((prop.getProperty("validEmail")),(prop.getProperty("validPassword")));
        operation.clickButton(CustomerSupport.Menu,2000);
        operation.clickButton(CustomerSupport.CustomerSupport,2000);
        operation.clickButton(CustomerSupport.CreateATicket,2000);
        ticket.SelectOptionFromInputField(CustomerSupport.CategoryField,"Charging Issue");
        operation.clickButton(CustomerSupport.SelectASessionField,2000);
        operation.clickButton(CustomerSupport.FirstSessionFromDropdown,2000);
        operation.writeInputText(CreateTicket.SubjectField,"This is admin creating the ticket",1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),500);
        operation.clickButton(CustomerSupport.UploadButton,2000);
        property.uploadImageMorethan2Mb();
        operation.clickButton(CustomerSupport.SubmitButton,2000);
        Thread.sleep(40000);
        dashboard.refreshBrowser();
        Assert.assertTrue(ticket.verifyTextMatching(4000,CustomerSupport.FirstCreatedTicket,"Charging Issue"));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.CreateATicket));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.OpenStatus1));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,CustomerSupport.TicketsHistory));
        Assert.assertTrue(customerSupport.verifyCreateTicketPageIsClosedAfterCreatingNewTicket());

    }
    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_CheckWhatHappenedIfCustomerDidnotSelectTheRequiredFieldAndClickOnTheSubmitButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateProperty property = new CreateProperty(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        dashboard.RefreshBrowser();
        customerLogin.LogoutFromCustomerAccount();
        customerLogin.loginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        operation.clickButton(CustomerSupport.Menu,2000);
        operation.clickButton(CustomerSupport.CustomerSupport,2000);
        operation.clickButton(CustomerSupport.CreateATicket,2000);
        operation.clickButton(CustomerSupport.SubmitButton,2000);
        Assert.assertTrue(ticket.verifyTextMatching(1500,CustomerSupport.CategoryRequiredMsg,customerSupport.categoryRequiredMsg()));
//        Assert.assertTrue(ticket.verifyTextMatching(500,CustomerSupport.SubjectRequiredMsg,customerSupport.SubjectRequiredMsg()));
//        Assert.assertTrue(ticket.verifyTextMatching(500,CustomerSupport.MessageFieldRequiredMsg,customerSupport.MessageRequiredMsg()));
        Assert.assertTrue(ticket.verifyElementNotDisplayed(2000,CustomerSupport.CreateATicket));
        Assert.assertTrue(customerSupport.verifyCurrentPageIsCreatingTicketPage());

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_CheckWhatHappenedIfCustomerDidNotSelectTheRequiredFieldAndClickOnTheSubmitButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateProperty property = new CreateProperty(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        dashboard.RefreshBrowser();
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        operation.ClickButton(CustomerSupport.CreateATicket,2000);
//        operation.ClickButton(CustomerSupport.SubmitButton,2000);
//        Assert.assertTrue(ticket.verifyTextMatching(1500,CustomerSupport.CategoryRequiredMsg,customerSupport.categoryRequiredMsg()));
        Assert.assertTrue(ticket.verifyTextMatching(500,CustomerSupport.SubjectRequiredMsg,customerSupport.SubjectRequiredMsg()));
//        Assert.assertTrue(ticket.verifyTextMatching(500,CustomerSupport.MessageFieldRequiredMsg,customerSupport.MessageRequiredMsg()));
        Assert.assertTrue(ticket.verifyElementNotDisplayed(2000,CustomerSupport.CreateATicket));
        Assert.assertTrue(customerSupport.verifyCurrentPageIsCreatingTicketPage());

    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_CheckWhatHappenedIfCustomerDidNotSelectTheRequiredFieldAndClickOnTheSubmitButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateProperty property = new CreateProperty(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        dashboard.RefreshBrowser();
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        operation.ClickButton(CustomerSupport.CreateATicket,2000);
//        operation.ClickButton(CustomerSupport.SubmitButton,2000);
//        Assert.assertTrue(ticket.verifyTextMatching(1500,CustomerSupport.CategoryRequiredMsg,customerSupport.categoryRequiredMsg()));
//        Assert.assertTrue(ticket.verifyTextMatching(500,CustomerSupport.SubjectRequiredMsg,customerSupport.SubjectRequiredMsg()));
        Assert.assertTrue(ticket.verifyTextMatching(500,CustomerSupport.MessageFieldRequiredMsg,customerSupport.MessageRequiredMsg()));

    }
    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_CheckWhatHappenedIfTheCustomerDidnotProvideTheSessionIdWhenSelectsTheCategoryChargingIssue() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateProperty property = new CreateProperty(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        dashboard.RefreshBrowser();
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        operation.ClickButton(CustomerSupport.CreateATicket,2000);
//        operation.ClickButton(CustomerSupport.SubmitButton,2000);
//        Assert.assertTrue(ticket.verifyTextMatching(1500,CustomerSupport.CategoryRequiredMsg,customerSupport.categoryRequiredMsg()));
        ticket.SelectOptionFromInputField(CustomerSupport.CategoryField,"Charging Issue");
        operation.clickButton(CustomerSupport.SubmitButton,2000);
//        Assert.assertTrue(ticket.verifyTextMatching(500,CustomerSupport.SubjectRequiredMsg,customerSupport.SubjectRequiredMsg()));
        Assert.assertTrue(ticket.verifyTextMatching(1000,CustomerSupport.SessionRequiredMsg,customerSupport.SessionRequiredMsg()));
        Assert.assertTrue(customerSupport.verifyCurrentPageIsCreatingTicketPage());

    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_CheckWhatHappenedIfTheCustomerDidnotProvideTheSessionIdWhenSelectsTheCategoryChargingIssue() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateProperty property = new CreateProperty(driver);
//        customerSupport.GoToCustomerLoginPage();
//        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
//        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
//        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        dashboard.RefreshBrowser();
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
//        operation.ClickButton(CustomerSupport.CreateATicket,2000);
//        operation.ClickButton(CustomerSupport.SubmitButton,2000);
//        Assert.assertTrue(ticket.verifyTextMatching(1500,CustomerSupport.CategoryRequiredMsg,customerSupport.categoryRequiredMsg()));
        operation.clickButton(CustomerSupport.SelectASessionField,2000);
        customerSupport.clickOnSessionFieldFirstDropdown();
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),500);
        operation.clickButton(CustomerSupport.SubmitButton,2000);
//        Assert.assertTrue(ticket.verifyTextMatching(500,CustomerSupport.SubjectRequiredMsg,customerSupport.SubjectRequiredMsg()));
        Assert.assertTrue(ticket.verifyTextMatching(3000,CustomerSupport.SubjectRequiredMsg,customerSupport.SubjectRequiredMsg()));
        Assert.assertTrue(customerSupport.verifyCurrentPageIsCreatingTicketPage());

    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CheckWhatHappenedIfCustomerTryToCreateATicketForChargingIssueTypeWhomHasNoChargingHistory() throws InterruptedException, IOException {
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

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-24,25"})
    public void TC_24_25_CheckWhatHappenedIfCustomerTryToCreateATicketForChargingIssueTypeWhomHasNoChargingHistory() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSupport customerSupport = new CustomerSupport(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateProperty property = new CreateProperty(driver);
//        customerSupport.GoToCustomerLoginPage();
//        customerLogin.LogoutFromCustomerAccount();
//        customerLogin.LoginToACustomerAccount((prop.getProperty("CustomerWithNoTicket")),"EitaiPassword10");
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
        operation.clickButton(CustomerSupport.CreateATicket,2000);
        operation.clickButton(CustomerSupport.SelectASessionField,2000);
        customerSupport.verifyAnElementDisplayedOrNot(1500,CustomerSupport.DropdownEmptyDataImage);
        customerSupport.verifyAnElementDisplayedOrNot(1000,CustomerSupport.DropdownNoData);

    }


}
