package tests.US220CreateTicketCustomer;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

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
        CustomerSupport customerSupport = new CustomerSupport(driver);
        customerSupport.GoToCustomerLoginPage();
        operation.writeInputText(CustomerLogin.EmailField,"mateg96752@saeoil.com",2000);
        operation.writeInputText(CustomerLogin.PasswordField,"EitaiPassword10",2000);
        operation.ClickButton(CustomerLogin.CustomerLoginButton,1000);
        operation.ClickButton(CustomerSupport.Menu,2000);
        operation.ClickButton(CustomerSupport.CustomerSupport,2000);
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
        operation.ClickButton(CustomerSupport.CreateATicket,2000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CustomerSupport.CustomerSupportTitle));

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
        operation.ClickButton(CustomerSupport.CategoryField,1000);
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
        dashboard.RefreshBrowser();
        ticket.SelectOptionFromInputField(CustomerSupport.CategoryField,"Software Issue");
        operation.writeInputText(CreateTicket.SubjectField,(prop.getProperty("TicketSubjectLessThanThirtyCharacter2")),1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),500);
        operation.ClickButton(CustomerSupport.SubmitButton,2000);
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
}
