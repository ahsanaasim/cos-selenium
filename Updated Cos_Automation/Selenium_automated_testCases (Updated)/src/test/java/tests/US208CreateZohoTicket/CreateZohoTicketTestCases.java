package tests.US208CreateZohoTicket;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class CreateZohoTicketTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckIfThereIsSupportButtonOnTheTopOfTheEveryModuleInTheCompanyPanel() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        loginPage.verifyValidLoginForPropertyAdmin();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.SupportButton));


    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckThereShouldBeAQuestionMarkBesideTheSupportButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.SupportQuestionMark));


    }
    //    @Test(priority = 3)//Done
//    @TestParameters(testCaseId = {"TC-3"})
//    public void TC_3_CheckThereShouldBeACountAboveTheSupportButtonForTheMessages() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        BasePage basePage = new BasePage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        DownCharger downCharger = new DownCharger(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
//        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//
//
//    }
    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckIfThereIsACreateTicketButtonAboveTheSupportTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        operation.clickButton(CreateTicket.SupportButton,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.CreateTicketButton));


    }
    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckTheCreateTicketColorIsDarkGreen() throws InterruptedException {
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

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckIfTheTitleSameAsTheDesign() throws InterruptedException {
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

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckIfTheTicketInfoSectionIsShowingAllTheInformationAlongWithTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,2000);
        operation.clickButton(CreateTicket.CreateTicketButton,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1500,CreateTicket.TicketInformationTitle));
        Assert.assertTrue(ticket.verifyTextMatching(1000,CreateTicket.SelectPropertyTitle,"* Select Property"));
        Assert.assertTrue(ticket.verifyTextMatching(500,CreateTicket.TicketTypeTitle,"* Ticket Type"));
        Assert.assertTrue(ticket.verifyTextMatching(500,CreateTicket.SubjectTitle,"* Subject"));
        Assert.assertTrue(ticket.verifyTextMatching(500,CreateTicket.TicketDescriptionTitle,"* Ticket Description"));
        Assert.assertTrue(ticket.verifyTextMatching(500,CreateTicket.AttachmentTitle,"Attachment"));


    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckIfTheTicketTypeIsShowingSameAsTheDesign() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        operation.clickButton(CreateTicket.TicketTypeField,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.TicketTypeGeneral));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.TicketTypeTechnical));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.TicketTypeBilling));


    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckIfAllTheInputFieldIsShowingSameAsTheDesign() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"East Avenue");
        operation.clickButton(CreateTicket.SelectPropertyFieldSelected,1000);
        operation.clickButton(CreateTicket.PropertyDropdownOption3,1000);
        Assert.assertTrue(ticket.verifyFieldIsNotEmpty(1500,CreateTicket.SelectPropertyFieldSelected));



    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckSelectPropertyInputField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,1000);
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Software Issue");
        operation.clickButton(CreateTicket.SelectPropertyFieldSelected,1000);
        operation.clickButton(CreateTicket.PropertyDropdownOption2,1000);
        Assert.assertTrue(ticket.verifyFieldIsNotEmpty(1500,CreateTicket.SelectPropertyFieldSelected));


    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckChargerInputFieldIsShowingSameAsTheDesign() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"East Avenue");
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Charging Issue");
        ticket.SelectOptionFromInputField(CreateTicket.ChargerField,"Selenium");
        operation.clickButton(CreateTicket.ChargerFieldSelected,2000);
        operation.clickButton(CreateTicket.PropertyDropdownOption8,1000);
        Assert.assertTrue(ticket.verifyFieldIsNotEmpty(1500,CreateTicket.ChargerFieldSelected));

    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckSubjectFieldIsTextTypeField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(ticket.verifyTheFieldIsTextType(CreateTicket.SubjectField));

    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckDescriptionFieldIsTextTypeField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),1000);
        Assert.assertTrue(ticket.verifyFieldIsNotEmpty(1000,CreateTicket.DescriptionFieldWithText));

    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckAttachmentsFieldIsUploadTypeField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.UploadFile));

    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckThePlaceholderOfAllTheInputFieldsAreShowingSameAsTheDesign() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        Assert.assertTrue(ticket.verifyTextMatching(1000,CreateTicket.SelectPropertyPlaceholder,"Select"));

    }
    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckThePlaceholderOfAllTheInputFieldsAreShowingSameAsTheDesign() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        Assert.assertTrue(ticket.verifyTextMatching(500,CreateTicket.TicketTypePlaceholder,"Select"));

    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckChargerFieldPlaceholder() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"East Avenue");
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Charging Issue");
        Assert.assertTrue(ticket.verifyTextMatching(500,CreateTicket.ChargerPlaceholder,"Select"));

    }


    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckThePlaceholderOfAllTheInputFieldsAreShowingSameAsTheDesign() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(ticket.verifyPlaceholder(CreateTicket.SubjectField,"Write here"));

    }
    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckThePlaceholderOfAllTheInputFieldsAreShowingSameAsTheDesign() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(ticket.verifyPlaceholder(CreateTicket.DescriptionField,"Write here"));

    }
    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckTheUploadPlaceholder() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.UploadText));
        Assert.assertTrue(ticket.verifyTextMatching(500,CreateTicket.UploadLimitationText,ticket.FileLimitationMsg()));

    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckIfTheButtonIsShowingInTheCreateTicketDrawerProperly() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateCharger.crossBtnOfDrawer));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(500,CreateCharger.cancelButtonOfDrawer));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(500,CreateTicket.SubmitTicket));

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckIfTheCancelButtonColorIsWhite() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
//        operation.ClickButton(CreateTicket.CreateTicketButton,2000);
        Assert.assertTrue(ticket.verifyCancelButtonColor());

    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_CheckIfTheSubmitTicketButtonColorIsDarkGreen() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
//        operation.ClickButton(CreateTicket.CreateTicketButton,2000);
        Assert.assertTrue(ticket.verifySubmitTicketButtonColor());

    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_CheckIfTheRequiredSignIsShowingAboveTheRequiredFieldInReportProblemDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.RequiredSignSelectProperty));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(500,CreateTicket.RequiredSignTicket));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(500,CreateTicket.RequiredSignCharger));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(500,CreateTicket.RequiredSignSubject));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(500,CreateTicket.RequiredSignTicketDescription));

    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_CheckWhatHappenedIfPAdminProvidesAllInfoAndClickOnTheSubmitTicketButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
        dashboard.refreshBrowser();
        operation.clickButton(CreateTicket.CreateTicketButton,3500);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"East Avenue");
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Charging Issue");
        ticket.SelectOptionFromInputField(CreateTicket.ChargerField,"Selenium");
        operation.writeInputText(CreateTicket.SubjectField,"Taking Huge time while charging",1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),500);
        operation.clickButton(CreateTicket.SubmitTicket,1000);
//        dashboard.RefreshBrowser();
        Assert.assertTrue(ticketList.verifyTicketCreationDateAndTime());
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,DashboardPropertyDetails.TopAccountName));


    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-28,29"})
    public void TC_28_29_CheckUpdatedInfoAfterCreatingNewTicket() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TicketList ticketList = new TicketList(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateTicket.SupportButton,5000);
        Assert.assertTrue(ticketList.verifyTextMatching(6500,TicketList.TableType1,"Charging Issue"));
        Assert.assertTrue(ticketList.verifyTextMatching(1000,TicketList.TableSubject1,"Taking Huge time while chargin..."));
        Assert.assertTrue(ticketList.verifyTextMatching(500,TicketList.TablePropertyName1,"East Avenue"));
        Assert.assertTrue(ticketList.verifyTextMatching(500,TicketList.TableCreatedBy1,(prop.getProperty("PropertyAdmin"))));
        Assert.assertTrue(ticketList.verifyAnElementDisplayedOrNot(1000,TicketList.OpenTag));

    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_CheckIfPAdminCanSeeAllThePropertiesInTheDropdownListThatHeHasAccess() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CustomerSignUp clearOperation = new CustomerSignUp(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        dashboard.clickOnProperty();
        Assert.assertTrue(ticket.verifyPropertyDropdownListContainsAllTheProperties());

    }
    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_CheckIfPAdminCanSeeAllTheChargersHeHasAccessToTnTheDropdownListAfterSelectingTheTechnicalType() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        dashboard.clickOnProperty();
        property.searchPropertyByName("Broadleaf Homes");
        operation.click(CreateCharger.searchChargerBtn);
        Assert.assertTrue(ticket.verifyChargersDropdownListContainsAllTheChargers());

    }
    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_CheckIfPAdminSelectAPropertyAndTypeTechnicalWhichHasNoConnectedCharger() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"East Avenue");
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Charging Issue");
        operation.clickButton(CreateTicket.ChargerField,1000);
        operation.writeInputText(CreateTicket.ChargerField,"uytrgdf",1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.DropdownNoData));

    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-33_1"})
    public void TC_33_1_CheckIfTicketIsCreatedOrNotAfterProvidingLessThan50WordsDescription() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
        loginPage.verifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
        operation.clickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"East Avenue");
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Charging Issue");
        ticket.SelectOptionFromInputField(CreateTicket.ChargerField,"Selenium");
        operation.writeInputText(CreateTicket.SubjectField,"Defect charger issue",1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("LessThanFiftyCharacterText")),1000);
        operation.clickButton(CreateTicket.SubmitTicket,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.MinimumFiftyCharacterMsg));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(4000,CreateTicket.CreateTicketDrawerTitle));


    }

//    @Test(priority = 29)//Done
//    @TestParameters(testCaseId = {"TC-34"})
//    public void TC_34_CheckIfTicketIsCreatedOrNotAfterProvidingLessThan50WordsDescription() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        CreateTicket ticket = new CreateTicket(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
//        operation.ClickButton(CreateTicket.CreateTicketButton,2000);
//        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"East Avenue");
//        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Charging Issue");
//        ticket.SelectOptionFromInputField(CreateTicket.ChargerField,"Selenium");
//        operation.writeInputText(CreateTicket.SubjectField,"Defect charger issue",1000);
//        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),1000);
//        operation.ClickButton(CreateTicket.SubmitTicket,1000);
//        ticket.NewTabOpenAndSwitchToNewTab(1);
//        ticket.GoToWebsite("https://www.zoho.com/desk/");
//        ticket.click(CreateTicket.ZohoSign);
//        operation.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        operation.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        Assert.assertTrue(ticket.verifyTextMatching(6000,CreateTicket.FirstTicket,"Defect charger issue"));
//        ticket.SwitchToTab(0);
//        Thread.sleep(3000);
//
//
//
//    }
    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_CheckWhatHappenedIfPAdminDidNotSelectTheRequiredFieldAndClickOnTheSubmitTicketButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        operation.clickButton(CreateTicket.SubmitTicket,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.PropertyRequiredMsg));

    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_CheckWhatHappenedIfPAdminDidNotSelectTheRequiredFieldAndClickOnTheSubmitTicketButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.CreateTicketButton,2000);
//        operation.ClickButton(CreateTicket.SubmitTicket,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.TicketTypeRequiredMsg));

    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_CheckWhatHappenedIfPAdminDidNotSelectTheRequiredFieldAndClickOnTheSubmitTicketButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.CreateTicketButton,2000);
//        operation.ClickButton(CreateTicket.SubmitTicket,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(500,CreateTicket.SubjectRequiredMsg));

    }

    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_CheckWhatHappenedIfPAdminDidNotSelectTheRequiredFieldAndClickOnTheSubmitTicketButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.CreateTicketButton,2000);
//        operation.ClickButton(CreateTicket.SubmitTicket,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(5000,CreateTicket.TicketDescriptionRequiredMsg));

    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_40_CheckWhatHappenedIfPAdminDidNotSelectTheRequiredFieldAndClickOnTheSubmitTicketButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Charging Issue");
        operation.clickButton(CreateTicket.SubmitTicket,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.ChargerRequiredMsg));

    }

    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_CheckWhatHappensIfPAdminEnterDescriptionLessThan50CharactersAndClicksOnTheSubmitTicketButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("LessThanFiftyCharacterText")),1000);
        operation.clickButton(CreateTicket.SubmitTicket,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateTicket.MinimumFiftyCharacterMsg));


    }

//    @Test(priority = 35)//Done
//    @TestParameters(testCaseId = {"TC-44"})
//    public void TC_44_CheckWhatHappensIfPAdminTryToUploadAttachmentThatIsLargerThan15MB() throws InterruptedException, IOException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        CreateTicket ticket = new CreateTicket(driver);
//        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
////        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
//        operation.ClickButton(CreateTicket.CreateTicketButton,2000);
//        operation.ClickButton(CreateTicket.UploadFile,2000);
//        Assert.assertTrue(ticket.uploadImageMorethan15Mb());
//
//
//    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_CheckWhatHappenedIfPAdminTryToLeaveTheDrawerAfterEnteringInfoInTheCreateTicketDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Charging Issue");
        Assert.assertTrue((operation.clickOnOutsideTheDrawer()));
        Assert.assertTrue(operation.verifyDiscadContinuePopupHasDisplayed());

    }

    @Test(priority = 38)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_CheckWhatHappenedIfPAdminTryToLeaveTheDrawerAfterEnteringInfoInTheCreateTicketDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Charging Issue");
        Assert.assertTrue(operation.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(operation.verifyDiscadContinuePopupHasDisplayed());

    }

    @Test(priority = 39)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_CheckWhatHappenedIfPAdminTryToLeaveTheDrawerAfterEnteringInfoInTheCreateTicketDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"East Avenue");
        Assert.assertTrue(operation.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(operation.verifyDiscadContinuePopupHasDisplayed());

    }

    @Test(priority = 40)//Done
    @TestParameters(testCaseId = {"TC-48"})
    public void TC_48_CheckWhatHappensIfPadminClickOutsideTheDrawerAndClicksOnDiscardButtonAfterEnteringAnyData() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"East Avenue");
        Assert.assertTrue((operation.clickOnOutsideTheDrawer()));
        Assert.assertTrue(operation.clickOnDiscardButtonOfPopUp());
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(2000,DashboardPropertyDetails.TopAccountName));

    }

    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-49"})
    public void TC_49_CheckWhatHappenedIfPAdminTryToLeaveTheDrawerAfterEnteringInfoInTheCreateTicketDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"East Avenue");
        Assert.assertTrue(operation.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(operation.clickOnDiscardButtonOfPopUp());
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(2000,DashboardPropertyDetails.TopAccountName));

    }

    @Test(priority = 42)//Done
    @TestParameters(testCaseId = {"TC-50"})
    public void TC_50_CheckWhatHappenedIfPAdminTryToLeaveTheDrawerAfterEnteringInfoInTheCreateTicketDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        operation.clickButton(CreateTicket.CreateTicketButton,2000);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"East Avenue");
        Assert.assertTrue(operation.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(operation.clickOnDiscardButtonOfPopUp());
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(2000,DashboardPropertyDetails.TopAccountName));

    }


    @Test(priority = 43)//Done
    @TestParameters(testCaseId = {"TC-51"})
    public void TC_51_CheckIfThereIsA3DotButtonBesideTheDetailsButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        CreateProperty property =new CreateProperty(driver);
        loginPage.verifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        operation.writeInputText(CreateCharger.searchChargerField,"US Charger",5000);
        operation.clickButton(CreateCharger.searchChargerBtn,500);
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(2000,TroubleshootCharger.ThreeDotBesideEditBtn));

    }
    @Test(priority = 44)//Done
    @TestParameters(testCaseId = {"TC-52"})
    public void TC_52_CheckIfThereIsReportAProblemButtonAfterClickingOnThe3DotButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        operation.clickButton(TroubleshootCharger.ThreeDotBesideEditBtn,1000);
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,CreateTicket.ReportProblem));

    }
    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-53"})
    public void TC_53_CheckTheDetailsOfReportAProblemButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
//        operation.ClickButton(TroubleshootCharger.ThreeDotBesideEditBtn,1000);
        operation.clickButton(CreateTicket.ReportProblem,500);
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,CreateTicket.CreateTicketDrawerTitle));

    }

    @Test(priority = 46)//Done
    @TestParameters(testCaseId = {"TC-54"})
    public void TC_54_CheckTheDetailsOfReportAProblemButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        operation.writeInputText(CreateCharger.searchChargerField,"US Charger",3000);
        operation.clickButton(CreateCharger.searchChargerBtn,500);
//        operation.ClickButton(TroubleshootCharger.ThreeDotBesideEditBtn,1000);
//        operation.ClickButton(CreateTicket.ReportProblem,1000);
//        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(ticket.verifyTableNameMatchingWithDrawer(ChargerListPropertyAdmin.PropertyName,CreateTicket.SelectPropertyFieldSelected));

    }

    @Test(priority = 47)//Done
    @TestParameters(testCaseId = {"TC-56"})
    public void TC_56_CheckTheDetailsOfReportAProblemButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        operation.clickButton(TroubleshootCharger.ThreeDotBesideEditBtn,10000);
        operation.clickButton(CreateTicket.ReportProblem,1000);
        Assert.assertTrue(ticket.verifyTextMatching(2000,CreateTicket.TicketTypeFieldSelected,"Charging Issue"));

    }

    @Test(priority = 48)//Done
    @TestParameters(testCaseId = {"TC-55"})
    public void TC_55_CheckTheDetailsOfReportAProblemButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        operation.writeInputText(CreateCharger.searchChargerField,"US Charger",3000);
        operation.clickButton(CreateCharger.searchChargerBtn,500);
//        operation.ClickButton(TroubleshootCharger.ThreeDotBesideEditBtn,1000);
//        operation.ClickButton(CreateTicket.ReportProblem,1000);
        Assert.assertTrue(ticket.verifyTableNameMatchingWithDrawer(ChargerListPropertyAdmin.ChargerTitle,CreateTicket.ChargerFieldSelected));

    }

    @Test(priority = 49)//Done
    @TestParameters(testCaseId = {"TC-57"})
    public void TC_57_CheckIfTheInputFieldsAreShowingSameAsTheDesign() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        operation.clickButton(TroubleshootCharger.ThreeDotBesideEditBtn,10000);
        operation.clickButton(CreateTicket.ReportProblem,1000);
        Assert.assertTrue(ticket.verifyTheFieldIsTextType(CreateTicket.SubjectField));

    }
    @Test(priority = 50)//Done
    @TestParameters(testCaseId = {"TC-57"})
    public void TC_57_2_CheckIfTheInputFieldsAreShowingSameAsTheDesign() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
//        operation.ClickButton(TroubleshootCharger.ThreeDotBesideEditBtn,1000);
//        operation.ClickButton(CreateTicket.ReportProblem,1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),1000);
        Assert.assertTrue(ticket.verifyFieldIsNotEmpty(1000,CreateTicket.DescriptionFieldWithText));

    }

    @Test(priority = 51)//Done
    @TestParameters(testCaseId = {"TC-58"})
    public void TC_58_CheckIfTheInputFieldsAreShowingSameAsTheDesign() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
//        operation.ClickButton(TroubleshootCharger.ThreeDotBesideEditBtn,8000);
//        operation.ClickButton(CreateTicket.ReportProblem,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(1000,CreateCharger.crossBtnOfDrawer));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(500,CreateCharger.cancelButtonOfDrawer));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(500,CreateTicket.SubmitTicket));

    }

    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-62"})
    public void TC_62_CheckIfTheRequiredSignIsShowingAboveTheRequiredFieldInReportProblemDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
//        operation.ClickButton(TroubleshootCharger.ThreeDotBesideEditBtn,1000);
//        operation.ClickButton(CreateTicket.ReportProblem,1000);
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(500,CreateTicket.RequiredSignSubject));
        Assert.assertTrue(ticket.verifyAnElementDisplayedOrNot(500,CreateTicket.RequiredSignTicketDescription));
        Assert.assertTrue(ticket.verifyTextMatching(500,CreateTicket.TicketDescriptionTitle,"* Ticket Description"));

    }

    @Test(priority = 53)//Done
    @TestParameters(testCaseId = {"TC-68"})
    public void TC_68_CheckWhatHappenedIfPAdminTryToReportAProblemForAChargerWhichIsNotConnectedToTheHardwareUnit() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateTicket ticket = new CreateTicket(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        CreateProperty property =new CreateProperty(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateTicket.SupportButton,3000);
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        operation.writeInputText(CreateCharger.searchChargerField,"Testing ticket",4500);
        operation.clickButton(CreateCharger.searchChargerBtn,500);
        operation.clickButton(TroubleshootCharger.ThreeDotBesideEditBtn,1000);
        Assert.assertTrue(ticket.verifyReportProblemButtonDisabled());

    }










}
