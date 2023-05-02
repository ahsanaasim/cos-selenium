package tests.US209ZohoTicketList;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class ZohoTicketListTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();


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
        Assert.assertTrue(ticket.verifyTextMatching(1000,TicketList.SupportPageTitle,"Support"));

    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-9,10"})
    public void TC_9_10_CheckIfTheTabsAreShowingSameAsTheDesignInTheSupportTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
        Assert.assertTrue(ticketList.verifyOpenTab());
        Assert.assertTrue(ticketList.verifyClosedTab());

    }



    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckIfTheColumnsAreShowingSameAsTheDesignUnderOpenTabs() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,TicketList.CreatedDateTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.IDTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.SubjectTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.CreatedByTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.TypeTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.PropertyNameTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.StatusTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.ActionTitle));

    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckOpenTagForOpenTabs() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
        Assert.assertTrue(ticketList.verifyOpenTagsUnderOpenTab());


    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckIfTheColumnsAreShowingTheSameAsTheDesignUnderClosedTabs() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
        operation.ClickButton(TicketList.ClosedTab,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1500,TicketList.ClosedTabCreatedDateTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.ClosedTabIDTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.ClosedTabSubjectTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.ClosedTabCreatedByTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.ClosedTabTypeTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.ClosedTabPropertyNameTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.ClosedTabStatusTitle));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(300,TicketList.ClosedTabActionTitle));

    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckIfTheColumnsAreShowingTheSameAsTheDesignUnderClosedTabs() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(TicketList.ClosedTab,1000);
        Assert.assertTrue(ticketList.verifyClosedTagsUnderClosedTab());


    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckIfThereIsACountShowingBesideTheTabsNameInTheSupportTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
        operation.ClickButton(TicketList.OpenTab,1000);
//        dashboard.RefreshBrowser();
        Assert.assertTrue(ticketList.verifyOpenTabContainsCount());
        Assert.assertTrue(ticketList.verifyCloseTabContainsCount());

    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckIfThereIsATotalNumberOfTicketCountShowingAboveTheTicketList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(TicketList.OpenTab,1000);
//        dashboard.RefreshBrowser();
        Assert.assertTrue(ticketList.verifyTotalTicketShowingOnTop());

    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckIDColumnWhenZohoRepliedToAnyConversation() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(TicketList.OpenTab,1000);
//        dashboard.RefreshBrowser();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,TicketList.RepliedTag));

    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckCreatedDateAfterCreatingATicket () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
        operation.ClickButton(CreateTicket.CreateTicketButton,3500);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"East Avenue");
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Charging Issue");
        ticket.SelectOptionFromInputField(CreateTicket.ChargerField,"Selenium");
        operation.writeInputText(CreateTicket.SubjectField,"Taking Huge time while charging",1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),500);
        operation.ClickButton(CreateTicket.SubmitTicket,1000);
//        dashboard.RefreshBrowser();
        Assert.assertTrue(ticketList.verifyTicketCreationDateAndTime());

    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckTheCreatedByColumnAfterCreatingATicket () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(CreateTicket.CreateTicketButton,1000);
//        operation.ClickButton(CreateTicket.SubmitTicket,1000);
//        dashboard.RefreshBrowser();
        Assert.assertTrue(ticketList.verifyTextMatching(1000,TicketList.TableCreatedBy1,(prop.getProperty("PropertyAdmin"))));

    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckTheTypeColumnAfterSelectingChargingIssueAsTicketTypeWhileCreatingATicket () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(CreateTicket.CreateTicketButton,1000);
//        operation.ClickButton(CreateTicket.SubmitTicket,1000);
//        dashboard.RefreshBrowser();
        Assert.assertTrue(ticketList.verifyTextMatching(1000,TicketList.TableType1,"Charging Issue"));

    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CheckPropertyColumnAfterCreatingANewTicket() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(CreateTicket.CreateTicketButton,1000);
//        operation.ClickButton(CreateTicket.SubmitTicket,1000);
//        dashboard.RefreshBrowser();
        Assert.assertTrue(ticketList.verifyTextMatching(500,TicketList.TablePropertyName1,"East Avenue"));

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckStatusColumnAfterCreatingANewTicket () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(CreateTicket.CreateTicketButton,1000);
//        operation.ClickButton(CreateTicket.SubmitTicket,1000);
//        dashboard.RefreshBrowser();
        Assert.assertTrue(ticketList.verifyAnElementDisplayedOrNot(1000,TicketList.OpenTag));

    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_CheckTheSubjectColumnAfterCreatingaTicket() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(CreateTicket.CreateTicketButton,1000);
//        operation.ClickButton(CreateTicket.SubmitTicket,1000);
//        dashboard.RefreshBrowser();
        Assert.assertTrue(ticketList.verifyTextMatching(1000,TicketList.TableSubject1,"Taking Huge time while chargin..."));

    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckTheTypeColumnAfterSelectingSoftwareIssueAsTicketTypeWhileCreatingATicket () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
        operation.ClickButton(CreateTicket.CreateTicketButton,3000);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"Reliance");
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Software Issue");
        operation.writeInputText(CreateTicket.SubjectField,"Ohoo! Cos is not working",1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),500);
        operation.ClickButton(CreateTicket.SubmitTicket,1000);
        Assert.assertTrue(ticketList.verifyTicketCreationDateAndTime());
        Assert.assertTrue(ticketList.verifyTextMatching(6500,TicketList.TableType1,"Software Issue"));
        Assert.assertTrue(ticketList.verifyTextMatching(1000,TicketList.TableSubject1,"Ohoo! Cos is not working"));
        Assert.assertTrue(ticketList.verifyTextMatching(500,TicketList.TablePropertyName1,"Reliance"));
        Assert.assertTrue(ticketList.verifyTextMatching(500,TicketList.TableCreatedBy1,(prop.getProperty("PropertyAdmin"))));
        Assert.assertTrue(ticketList.verifyAnElementDisplayedOrNot(1000,TicketList.OpenTag));

    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckTypeColumnAfterSelectingBillingAsTicketTypeWhileCreatingATicket () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
        operation.ClickButton(CreateTicket.CreateTicketButton,3000);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"Broadleaf Homes");
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Billing");
        operation.writeInputText(CreateTicket.SubjectField,"Wrong calculation on my bill",1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),500);
        operation.ClickButton(CreateTicket.SubmitTicket,1000);
        Assert.assertTrue(ticketList.verifyTicketCreationDateAndTime());
        Assert.assertTrue(ticketList.verifyTextMatching(6500,TicketList.TableType1,"Billing"));
        Assert.assertTrue(ticketList.verifyTextMatching(1000,TicketList.TableSubject1,"Wrong calculation on my bill"));
        Assert.assertTrue(ticketList.verifyTextMatching(500,TicketList.TablePropertyName1,"Broadleaf Homes"));
        Assert.assertTrue(ticketList.verifyTextMatching(500,TicketList.TableCreatedBy1,(prop.getProperty("PropertyAdmin"))));
        Assert.assertTrue(ticketList.verifyAnElementDisplayedOrNot(1000,TicketList.OpenTag));

    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_CheckOpenTabsCountAfterClosingAnOpenTicket() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        operation.ClickButton(CreateTicket.SupportButton,5000);
        Assert.assertTrue(ticketList.verifyTotalOpenTicketCountAndOPenTabsCountIsDecreasingAfterClosingATicket());

    }

//    @Test(priority = 25)//Done
//    @TestParameters(testCaseId = {"TC-22"})
//    public void TC_31_CheckTypeColumnAfterSelectingBillingAsTicketTypeWhileCreatingATicket () throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        CreateTicket ticket = new CreateTicket(driver);
//        TicketList ticketList = new TicketList(driver);
//        CreateCharger operation = new CreateCharger(driver);
////        loginPage.VerifyValidLoginForPropertyAdmin();
////        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(CreateTicket.CreateTicketButton,3000);
//        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"Broadleaf Homes");
//        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Billing");
//        operation.writeInputText(CreateTicket.SubjectField,"Wrong calculation on my bill",1000);
//        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),500);
//        operation.ClickButton(CreateTicket.SubmitTicket,1000);
//        Assert.assertTrue(ticketList.verifyTicketCreationDateAndTime());
//        Assert.assertTrue(ticketList.verifyTextMatching(6500,TicketList.TableType1,"Billing"));
//        Assert.assertTrue(ticketList.verifyTextMatching(1000,TicketList.TableSubject1,"Wrong calculation on my bill"));
//        Assert.assertTrue(ticketList.verifyTextMatching(500,TicketList.TablePropertyName1,"Broadleaf Homes"));
//        Assert.assertTrue(ticketList.verifyTextMatching(500,TicketList.TableCreatedBy1,(prop.getProperty("PropertyAdmin"))));
//        Assert.assertTrue(ticketList.verifyAnElementDisplayedOrNot(1000,TicketList.OpenTag));
//
//    }


}
