package tests.US210ZohoConversation;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class ZohoConversationTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckTheTicketIdOnTopOfTheDetailsDrawer () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        operation.ClickButton(CreateTicket.SupportButton,5000);
        operation.ClickButton(ZohoConversation.DetailsButton,3000);
        Assert.assertTrue(zohoConversation.verifyUniqueTicketIDIsShowing());


    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckIfSystemShowingAMessageUnderTicketId() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,3000);
        Assert.assertTrue(zohoConversation.verifyTextMatching(1000,ZohoConversation.MsgUnderTicketId, zohoConversation.MsgUnderID()));

    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckTheTitleOfTicketInformationSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,3000);
        Assert.assertTrue(zohoConversation.verifyAnElementDisplayedOrNot(500,ZohoConversation.DrawerTicketInformationTitle));

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckTicketInformationSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,3000);
        Assert.assertTrue(zohoConversation.verifyAnElementDisplayedOrNot(500,ZohoConversation.CreatedDateTitle));
        Assert.assertTrue(zohoConversation.verifyAnElementDisplayedOrNot(500,ZohoConversation.PropertyNameTitle));
        Assert.assertTrue(zohoConversation.verifyAnElementDisplayedOrNot(500,ZohoConversation.TicketTypeTitle));

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckTheTitleOfTicketDescriptionSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,3000);
        Assert.assertTrue(zohoConversation.verifyAnElementDisplayedOrNot(500,ZohoConversation.DrawerTicketDescriptionTitle));

    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckTheTitleOfTicketDescriptionSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,3000);
        Assert.assertTrue(zohoConversation.verifyAnElementDisplayedOrNot(500,ZohoConversation.DrawerSubjectTitle));
        Assert.assertTrue(zohoConversation.verifyAnElementDisplayedOrNot(500,ZohoConversation.DrawerSubjectText));

    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckTheRefreshButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,3000);
        Assert.assertTrue(zohoConversation.verifyAnElementDisplayedOrNot(500,ZohoConversation.RefreshButton));

    }



}
