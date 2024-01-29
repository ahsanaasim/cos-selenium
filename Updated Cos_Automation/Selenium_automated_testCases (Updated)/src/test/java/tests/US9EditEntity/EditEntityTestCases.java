package tests.US9EditEntity;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import pages.*;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class EditEntityTestCases extends BaseTest{
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyEditEntityButtonIsShowingontheEntityManagementPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(editCompany.VerifyEditButtonHasDisplayed());
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifyEditEntityDrawerHasDisplayedAfterClickingonEditButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.VerifyEntityInformationareShowing());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_VerifyAuditLogsSectionIsShowingOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(editCompany.VerifyEditCompanyButtonHasDisplayed());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.VerifAuditLogsareShowingonEditComapnyDrawer());
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_VerifyErrorMessageisShowingWhenAdminDoesnotProvideEntityNameOnEditCompanyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityNameFromEditEntityDrawer());
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyEnttityNmaeErrorMessage(msg.EntityNameErrorMsg()));
    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_WhenAdminProvideInvalidPhoneNumberonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        editEntity.fieldClear(EditCompany.searchbar);
        createCharger.writeInputText(EditCompany.searchbar,prop.getProperty("Entity2"), 5000);
        createCharger.clickButton(EditCompany.searchbtn,1000);
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_WhenAdminEnterAlphabatesinPhoneNumberonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_WhenAdminEnterQuestionMarkinPhoneNumberonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_WhenAdminEnterSpecialCharactersinPhoneNumberonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
/*        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }


    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_2_WhenAdminEnter8digitPhoneNumberOnPhoneNumberField() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("InvalidPhone4")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }


    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_WhenAdminEnterInvalidEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }


    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_WhenAdminEnterNumbersinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-27_28"})
    public void TC_27_WhenAdminEnterAlphabatesinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_WhenAdminEnterIncompleteEmailinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("IncompleteEmailAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_WhenAdminEnterSpecialCharactersinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_WhenAdminEnterinvalidEmailFormatinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("InvalidEmailFormat")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_WhenAdminAddEmaiwithoutdotcominEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("WrongEmail")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_WhenAdminLeavesEmailFieldBlankOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.writeCompanyEmail(""));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankEmailErrorMessage(msg.BlankEmailErrorMsg()));    }



    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_VerifyErrorMessageisShowingWhenAdminprovidesSpecialCharactersinEINNumberOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());
    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_VerifyErrorMessageisShowingWhenAdminprovidesAlphabatesinEINNumberOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());
    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_VerifyErrorMessageisShowingWhenAdminprovidesInvalidZipcodeOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_VerifyErrorMessageisShowingWhenAdminEnterInvalidFromatInZipcodeOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_VerifyErrorMessageisShowingWhenAdminEnterZipcodewithlessthanfivedigitsOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCodewithFourDigits")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_VerifyErrorMessageisShowingWhenAdminEnterInvalidZipcodeFormatOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("InvalidZipcodeformat")));
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_WhenAdminEnterInvalidZipcodeFormatOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-61"})
    public void TC_61_WhenAdminChangeInputFieldWithValidDataonEditEntityDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity=new CreateEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityNameFromEditEntityDrawer());
        Assert.assertTrue(createentity.writeAutomatedEntityName(createentity.writeEntityName()));;
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(editEntity.RemoveAddressFromEditEntityDrawer());
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyCreateNewEntityButtonHasDisplayed());
    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-70"})
    public void TC_70_VerifyUpdatedInformationsisShowingAfterUpdatingtheEntity() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createEntity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("Entity")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editEntity.VerifyUpdatedEntityisShowinginEntityTable());
    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-75"})
    public void TC_75_WhenAdminpressCancelButtonAfterChangingEntityNameFromEditCompanyDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity=new CreateEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityNameFromEditEntityDrawer());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(editCompany.ClickCancelbutton());
        Assert.assertTrue(editCompany.VerifyDiscardButtonisShowingonConfirmationPopup());
        Assert.assertTrue(editCompany.ClickonDiscardButton());
        Assert.assertTrue(createentity.verifyElementNotDisplayed(2000,EditEntity.companyInformationTitle));
    }

   /* @Test(priority = 130)//Done
    public void VerifyErrorMessageIsShowingWenAdminDoesnotEnterCompanyNameonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditEntity entity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        //Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.WriteCompanyName(""));

        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.verifyCompanyNameErrorMessage(msg.BlankCompanyErrorMsg()));

    }*/

   /* @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-75"})
    public void WhenAdminprovideInvalidCompanyNameonEntiysameasCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        *//*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*//*
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.ClickoEntitysameasCompany());
        //Assert.assertTrue(createentity.ClickonSelectCompanydropdownFromEntitysameasCompanyDrawer());
        Assert.assertTrue(createentity.WriteCompanyName(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.VerifyNoSugessuionISShowingAfterProvidingInvalidCompanyNameonEntitySameasCompanyDrawer());

    }*/


    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-85,86"})
    public void TC_85_86_CheckWhatHappensWhenClickOnTheShowButtonAsCOSAdmin () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyAFieldIsEnable(2000,CreateCompany.ein));

    }
    @Test(priority = 42)//Done
    @TestParameters(testCaseId = {"TC-87"})
    public void TC_87_CheckEinFieldAfterClosingTheEditDrawerAndThenOpeningTheEditDrawerAgainAsCOSAdmin () throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());

    }
    @Test(priority = 43)//Done
    @TestParameters(testCaseId = {"TC-88"})
    public void TC_88_89_90_CheckEINAfterEditing() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        EditEntity editEntity = new EditEntity(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        customerSignUp.fieldClear(EditCompany.searchbar);
        createCharger.writeInputText(EditCompany.searchbar,prop.getProperty("Entity3"), 5000);
        createCharger.clickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinSaving());
        Assert.assertTrue(editCompany.verifyAuditLogStatusForEinChange());

    }
    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_CheckWhatHappensWhenIProvideInvalidEINumber() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CreateEntity createEntity = new CreateEntity(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
/*        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        createCharger.writeInputText(EditCompany.searchbar, prop.getProperty("Entity3"), 5000);
        createCharger.ClickButton(EditCompany.searchbtn,1000);*/
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,4000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5645657567567567567",2500);
        Assert.assertTrue(createEntity.clickOnSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 46)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_2_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5445  6765765",2500);
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 47)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_3_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5--67567567567",2500);
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 48)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_4_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"22-4523789",2500);
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 49)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_5_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"aaertyuwe",2500);
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 50)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_6_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"er-yqsdert",2500);
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 51)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_7_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"1234567as",2500);
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());



    }



    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-92,93,94"})
    public void TC_92_93_94_CheckTheSeeDetailsButtonsUnderActionColumn() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        dashboardPropertyDetails.LogoutFromExistingAccount();
        Thread.sleep(5000);
        loginPage.verifyValidLoginForCosAccounting();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        createCharger.clickButton(EditCompany.EditCompanyBtn, 3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());
    }

    @Test(priority = 53)//Done
    @TestParameters(testCaseId = {"TC-85"})
    public void TC_95_96_CheckWhatHappensWhenClickOnTheShowButtonAsCOSAdmin () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosAccounting();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
//            createCharger.writeInputText(EditCompany.searchbar,"Tesla company 2",5000);
//            createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyAFieldIsEnable(2000,CreateCompany.ein));

    }
    @Test(priority = 54)//Done
    @TestParameters(testCaseId = {"TC-97"})
    public void TC_97_CheckEinFieldAfterClosingTheEditDrawerAndThenOpeningTheEditDrawerAgainAsCOSAdmin () throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosAccounting();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());

    }
    @Test(priority = 55)//Done
    @TestParameters(testCaseId = {"TC-98,99,100"})
    public void TC_98_99_100_CheckEINAfterEditing() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        EditEntity editEntity = new EditEntity(driver);
        loginPage.verifyValidLoginForCosAccounting();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        editEntity.fieldClear(EditCompany.searchbar);
        createCharger.writeInputText(EditCompany.searchbar,prop.getProperty("Entity2"),5000);
        createCharger.clickButton(EditCompany.searchbtn,1000);
        editCompany.ClickonEditbutton();
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinSaving());
        Assert.assertTrue(editCompany.verifyAuditLogStatusForEinChange());

    }
    @Test(priority = 56)//Done
    @TestParameters(testCaseId = {"TC-101"})
    public void TC_101_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CreateEntity createentity = new CreateEntity(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        editCompany.ClickonEditbutton();
        createCharger.clickButton(EditCompany.ShowButtonEin,4000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5645657567567567567",2500);
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }


    @Test(priority = 57)//Done
    @TestParameters(testCaseId = {"TC- 112"})
    public void TC_112_CheckCOSPropertySupportCanEdit() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        dashboardPropertyDetails.LogoutFromExistingAccount();
        Thread.sleep(4000);
        loginPage.verifyValidLoginForCosPropertySupport();
        Thread.sleep(2000);
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        createCharger.writeInputText(EditCompany.searchbar,"Apple A",5000);
        createCharger.clickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinSaving());
    }


    @Test(priority = 58)//Done
    @TestParameters(testCaseId = {"TC-112,113,114"})
    public void TC_112_113_114_CheckEinNumberCanBeEditedAsCOSDriverSupport() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        dashboardPropertyDetails.LogoutFromExistingAccount();
        Thread.sleep(4000);
        loginPage.verifyValidLoginForCosDriverSupport();
        Thread.sleep(2000);
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyAFieldIsDisable(4000,EditCompany.ShowButtonBesideEINField));
        Assert.assertTrue(editCompany.verifyAFieldIsDisable(1000,EditCompany.SaveCompanyButton));

    }


    @Test(priority = 59)//Done
    @TestParameters(testCaseId = {"TC-116"})
    public void TC_116_CheckCOSTechCanSaveEditedData() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        dashboardPropertyDetails.LogoutFromExistingAccount();
        Thread.sleep(4000);
        loginPage.verifyValidLoginForCosTechSupport();
        Thread.sleep(2000);
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyAFieldIsDisable(4000,EditCompany.ShowButtonBesideEINField));
        Assert.assertTrue(editCompany.verifyAFieldIsDisable(1000,EditCompany.SaveCompanyButton));
    }

}
