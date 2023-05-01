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
        Assert.assertTrue(zohoConversation.verifyAnElementDisplayedOrNot(300,ZohoConversation.RefreshButton));

    }
    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckTheTitleOfTicketLogSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,3000);
        Assert.assertTrue(zohoConversation.verifyAnElementDisplayedOrNot(300,ZohoConversation.TicketLogSectionTitle));

    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckTheLogsUnderThisSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,3000);
        Assert.assertTrue(zohoConversation.verifyFirstLogUnderTicketLog());

    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckIfThereIsACrossButtonOnTopOfTheDetailsDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        TicketList list = new TicketList(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,5000);
        Assert.assertTrue(list.verifyAnElementDisplayedOrNot(500,CreateCharger.crossbtnofdrawer));

    }


    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckTheTicketIdInDrawerMatchWithTableData () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        TicketList list = new TicketList(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,5000);
        Assert.assertTrue(zohoConversation.verifyTableDataMatchingWithDrawer(TicketList.TableID1,ZohoConversation.DrawerTicketId));

    }
    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-12,13,14"})
    public void TC_12_13_14_CheckTicketCreatedDateInDrawerMatchWithTableData () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        TicketList list = new TicketList(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,5000);
        Assert.assertTrue(zohoConversation.verifyTableDataMatchingWithDrawer(TicketList.TableCreatedDate1,ZohoConversation.CreatedDateData));

    }
    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-15,16"})
    public void TC_15_16_CheckPropertyNameInDrawerMatchWithTableData () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        TicketList list = new TicketList(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,5000);
        Assert.assertTrue(zohoConversation.verifyTableDataMatchingWithDrawer(TicketList.TablePropertyName1,ZohoConversation.PropertyNameData));

    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-17,18"})
    public void TC_17_18_CheckTicketTypeInDrawerMatchWithTableData () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        TicketList list = new TicketList(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,5000);
        Assert.assertTrue(zohoConversation.verifyTableDataMatchingWithDrawer(TicketList.TableType1,ZohoConversation.TicketTypeData));

    }
//    @Test(priority = 15)//Done
//    @TestParameters(testCaseId = {"TC-17,18"})
//    public void TC_19_CheckTicketDescriptionInDrawerMatchWithTableData () throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        TicketList list = new TicketList(driver);
//        CreateTicket ticket = new CreateTicket(driver);
//        ZohoConversation zohoConversation = new ZohoConversation(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
////        operation.ClickButton(CreateTicket.SupportButton,5000);
////        operation.ClickButton(ZohoConversation.DetailsButton,5000);
//        operation.ClickButton(CreateTicket.CreateTicketButton,3000);
//        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"Broadleaf Homes");
//        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Software Issue");
//        operation.writeInputText(CreateTicket.SubjectField,(prop.getProperty("TicketSubjectLessThanThirtyCharacter")),1000);
//        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("ShortTicketDescription")),500);
//        operation.ClickButton(CreateTicket.SubmitTicket,1000);
//        operation.ClickButton(ZohoConversation.DetailsButton,4000);
//
//
//    }

//    @Test(priority = 15)//Done
//    @TestParameters(testCaseId = {"TC-20"})
//    public void TC_20_CheckTicketDescriptionInDrawerMatchWithTableData () throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        TicketList list = new TicketList(driver);
//        CreateTicket ticket = new CreateTicket(driver);
//        ZohoConversation zohoConversation = new ZohoConversation(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
////        operation.ClickButton(CreateTicket.SupportButton,5000);
////        operation.ClickButton(ZohoConversation.DetailsButton,5000);
//        operation.ClickButton(CreateTicket.CreateTicketButton,3000);
//        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"Broadleaf Homes");
//        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Software Issue");
//        operation.writeInputText(CreateTicket.SubjectField,(prop.getProperty("TicketSubjectLessThanThirtyCharacter")),1000);
//        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("ShortTicketDescription")),500);
//        operation.ClickButton(CreateTicket.SubmitTicket,1000);
//        operation.ClickButton(ZohoConversation.DetailsButton,4000);
//
//
//    }
    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckDetailsDrawerAfterChangingStatusToClosed() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        TicketList list = new TicketList(driver);
        CreateTicket ticket = new CreateTicket(driver);
        ZohoConversation zohoConversation = new ZohoConversation(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
//        operation.ClickButton(ZohoConversation.DetailsButton,5000);
        operation.ClickButton(TicketList.ClosedTab,3000);
        operation.ClickButton(ZohoConversation.ClosedTabDetailsButton,3000);
        zohoConversation.verifyAnElementDisplayedOrNot(2000,ZohoConversation.DrawerTicketClosed);


    }



}
