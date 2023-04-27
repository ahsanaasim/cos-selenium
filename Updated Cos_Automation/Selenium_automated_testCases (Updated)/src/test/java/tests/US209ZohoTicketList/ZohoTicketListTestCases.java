package tests.US209ZohoTicketList;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

public class ZohoTicketListTestCases extends BaseTest {


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckIfThereIsSupportButtonOnTheTopOfTheEveryModuleInTheCompanyPanel() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DashboardPropertyAdmin dashboardPropertyAdmin = new DashboardPropertyAdmin(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000, CreateTicket.SupportButton));
        dashboard.clickonPropertiesFromLeftMenu();
        dashboard.clickonProperty();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000, CreateTicket.SupportButton));
        dashboard.clickOnChargersPropertyAdmin();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000, CreateTicket.SupportButton));
        dashboard.clickonLocationsPropertyAdmin();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000, CreateTicket.SupportButton));
        dashboardPropertyAdmin.clickonCustomersFromLeftMenu();
        dashboardPropertyAdmin.clickonGroupManagement();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000, CreateTicket.SupportButton));
        dashboardPropertyAdmin.clickonAllCustomers();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000, CreateTicket.SupportButton));
        dashboardPropertyAdmin.clickonChargerAccess();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000, CreateTicket.SupportButton));


    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckQuestionMarkBesideSupportButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DashboardPropertyAdmin dashboardPropertyAdmin = new DashboardPropertyAdmin(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
        dashboardPropertyAdmin.GotoDashboard();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000, TicketList.QuestionMarkSupportButton));


    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckIfThereIsACreateTicketButtonAboveTheSupportTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        operation.ClickButton(CreateTicket.SupportButton, 1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000, CreateTicket.CreateTicketButton));

    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckTheCreateTicketColorIsDarkGreen() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,1000);
        Assert.assertTrue(ticket.verifyCreateTicketButtonColor());

    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckIfTheTitleSameAsTheDesign() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,1000);
        Assert.assertTrue(ticket.verifyTextMatching(1000,CreateTicket.CreateTicketButton,"Create Ticket"));

    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckTheSupportPageTitleIsShowingSameAsTheDesign() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,1000);
        Assert.assertTrue(ticket.verifyElementNotDisplayed(1000,TicketList.SupportPageTitle));

    }
}
