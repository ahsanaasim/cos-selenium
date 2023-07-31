package tests.EntityModule;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class EntityModuleTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();


    //Create entity starts from here

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyCreateNewEntityButtonIsShowingtoAdminonEntityManagementPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.VerifyCreateNewEntityButtonHasDisplayed());

    }

    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyCreateNewEntityDraweHasDisplayedAfterClickingonCreateNewCompanyButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.VerifyCreateNewEntityDrawerHasDisplayed());
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_VerifyEntityInformationFromCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.VerifyEntityInformationareShowingonCreateNewEntityDrawer());


    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyEntitySameasCompanyLinkisShowinginEntityInformationsectiononCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.VerifyEntitySameasCompanyLinkisShowingonEntityInformationSection());


    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_VerifyCompnayLocationInformationFromCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.VerifyEntityLocationInformationareShowingonCreateNewCompanyDrawer());

    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_WhenAdminDoesnotProvideEntityNameaonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(""));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyEnttityNmaeErrorMessage(msg.EntityNameErrorMsg()));
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_WhenAdminProvideInvalidPhoneNumberonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_WhenAdminEnterAplhabatesinPhoneNumberFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone1")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_WhenAdminEnterQuestionmarkinPhoneNumberFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_WhenAdminEnterSpecialCharactersinPhoneNumberFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-17.2"})
    public void TC_17_2_WhenAdminEnter8DigitPhoneNumberInPhoneNumberFieldOnCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone4")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_WhenAdminEnterIvlaidEmailinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_WhenAdminEnterNumbersinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-21_22"})
    public void TC_21_22_WhenAdminEnterAplhabtesinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_WhenAdminprovidesincompletemailinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("IncompleteEmailAddress")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_WhenAdminEnterSpecialCharactersinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_WhenAdminEnterInvalidEmailFormatinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("InvalidEmailFormat")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_WhenAdminEnterWrongEmailFormatinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("WrongEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_WhenAdminLeavesEmailFieldBlankonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(""));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankEmailErrorMessage(msg.BlankEmailErrorMsg()));


    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_WhenAdminKeepEINFieldEmptyInCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.SelectCompanyNameFromDropdown());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));

    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_WhenAdminEnterAlphabatesinEINFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_WhenAdminEnterInvalidNumbersinEINFieldCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("ZipCodewithFourDigits")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_WhenAdminEnterInvalidZipcodeFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));

    }




    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_WhenAdminEnterInvalidZipcodeFromatonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));

    }


    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_WhenAdminProvidesFourDigitsZaipcodeonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCodewithFourDigits")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));

    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_VerifyStateFieldisDisabledAfterProvidingZipCodeonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.VerifyStateFieldisDisabled());
    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_VerifyCityFieldisDisabledAfterProvidingZipCodeonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.VerifyCityFieldisDisabled());
    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_VerifyCountryFieldisDisabledAfterProvidingZipCodeonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.VerifyCountryFieldisDisabled());
    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-3,4"})
    public void TC_3_VerifyCompanyInformationFromCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.verifyinputFieldIsShowingForCompanyInformationOnCreateNewEntityDrawer());
        Assert.assertTrue(createentity.verifyinputTypeisSerachOnCompanyInformationsectionOnCreateNewEntityDrawer());


    }
    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_WhenAdmindoesnotprovideCompanyNameonEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        //Assert.assertTrue(createentity.ClickonSelectCompanydropdownFromEntitysameasCompanyDrawer());
        // Assert.assertTrue(createentity.WriteCompanyName(""));
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.verifyCompanyNameErrorMessage(msg.BlankCompanyErrorMsg()));

    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_WhenAdminProvidesValidDataonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
//        Assert.assertTrue(createentity.ClickonSelectCompanydropdownFromEntityDrawer());
        Assert.assertTrue(createentity.SelectCompanyNameFromDropdown());
        Assert.assertTrue(createentity.WriteAutomatedEntityName());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.WriteRandomEINNumber());
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.verifyAnElementDisplayedOrNot(2500,DashboardPropertyDetails.TopAccountName));
    }

    /*@Test(priority = 31)//Done
    public void WhenAdminChoosetheCompanyNamefromDropdownonEntiysameasCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(createentity.ClickonSelectCompanydropdownFromEntitysameasCompanyDrawer());
        Assert.assertTrue(createentity.SelectCompanyNamefromDropdown());
        Assert.assertTrue(createentity.VerifyAlertMessageisShowingAfterSelectingtheCopmayfromCompanyList());
        Assert.assertTrue(createentity.VerifyEntityInformationareShowingonCreateNewEntityDrawer());
        Assert.assertTrue(createentity.VerifyEntityLocationInformationareShowingonCreateNewCompanyDrawer());
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyCreateNewEntityDrawerHasClosed());
        Assert.assertTrue(createentity.VerifyEntityNameisShowinginEntityTable());

    }*/

    //Create e entity ends here
    //Search Entity starts from here


    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_WhenAdminClickSearchButtonWithouttypingAnythingFromEntityManagementPage() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchEntity searchentity= new SearchEntity(driver);
        loginPage.VerifyValidLogin();
        // Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchentity.verifyAnElementDisplayedOrNot(200,SearchCompany.Spiner));
    }

    @Test(priority = 46)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void WhenAdminSearchtheEntitybyEntityName() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createEntity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchEntity searchEntity = new SearchEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("Entity")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchEntity.verifyExpectedColumnWithExpectedContent("Entity Name",prop.getProperty("Entity"),0));
    }

    @Test(priority = 47)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_WhenAdminSearchEntitybyEntityEmail() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchEntity searchEntity = new SearchEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchEntity.verifyExpectedColumnWithExpectedContent("Entity Email",prop.getProperty("CompanyEmail"),1));
    }

    @Test(priority = 48)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_WhenAdminSearchEntitybyEntityPhoneNumber() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchEntity searchEntity = new SearchEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchEntity.verifyExpectedColumnWithExpectedContent("Entity Phone",prop.getProperty("Phone"),2));
    }

    @Test(priority = 49)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_WhenAdminSearchEntitybyEnteringInvalidEntityNameonEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("NonExistingEntity")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchEntity.VerifNoEntityisShowingafterProvidingInvalidData());
    }


    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_WhenAdminSearchEntityybyStateNameFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
    }

    @Test(priority = 53)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_WhenAdminClicksonClearaaltagafterSelectingStateNameFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchEntity.ClickonClearAllTag());
        Assert.assertTrue(searchEntity.VerifyEntityManagementPageHasSettoDefaultVauleafterPressingCleerAllTag());
    }

    @Test(priority = 54)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_WhenAdminRemoveStateTagfromEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        //Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
        Assert.assertTrue(searchcompany.ClickonCrosstoRemoveStateTag());
        Assert.assertTrue(searchcompany.VerifyStateTagHasbeenremoved());

    }


    @Test(priority = 55)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_WhenAdminSearchEntitybySelectingMultipleTagsFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchEntity.ClickonSelectZipdropdownFromAdvanceFilterDrawer());
        Assert.assertTrue(searchEntity.SelectZipFromAdvancedFilterDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
        Assert.assertTrue(searchcompany.VerifyZipcodeTagisShowingAfterSelectingtheZipFromAdvancedFilter());
    }


    @Test(priority = 56)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_WhenAdminPressResetButtonAfterSelectingFilterFromAdvanceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
//        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
//        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
//        Assert.assertTrue(searchEntity.ClickonSelectZipdropdownFromAdvanceFilterDrawer());
//        Assert.assertTrue(searchEntity.SelectZipFromAdvancedFilterDropDown());
        Assert.assertTrue(searchcompany.ClickonResetButton());
        Assert.assertTrue(searchEntity.verifyAnElementDisplayedOrNot(200,SearchCompany.Spiner));
        Assert.assertTrue(searchcompany.verifyElementNotDisplayed(2000,SearchCompany.advancefilter));
    }





    //Search entity ends here
    //Edit entity starts from here



    /*@Test(priority = 70)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyEditEntityButtonIsShowingontheEntityManagementPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(editCompany.VerifyEditButtonHasDisplayed());
    }*/

    @Test(priority = 71)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifyEditEntityDrawerHasDisplayedAfterClickingonEditButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.VerifyEntityInformationareShowing());
    }

    @Test(priority = 72)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_VerifyAuditLogsSectionIsShowingOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(editCompany.VerifyEditCompanyButtonHasDisplayed());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.VerifAuditLogsareShowingonEditComapnyDrawer());
    }

    @Test(priority = 73)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_VerifyErrorMessageisShowingWhenAdminDoesnotProvideEntityNameOnEditCompanyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityNameFromEditEntityDrawer());
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyEnttityNmaeErrorMessage(msg.EntityNameErrorMsg()));
    }

    @Test(priority = 74)//Done
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
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        editEntity.FieldClear(EditCompany.searchbar);
        createCharger.writeInputText(EditCompany.searchbar,prop.getProperty("Entity2"), 5000);
        createCharger.ClickButton(EditCompany.searchbtn,1000);
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 75)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_WhenAdminEnterAlphabatesinPhoneNumberonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 76)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_WhenAdminEnterQuestionMarkinPhoneNumberonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 77)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_WhenAdminEnterSpecialCharactersinPhoneNumberonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
/*        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }


    @Test(priority = 78)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_2_WhenAdminEnter8digitPhoneNumberOnPhoneNumberField() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("InvalidPhone4")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }


    @Test(priority = 79)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_WhenAdminEnterInvalidEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }


    @Test(priority = 80)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_WhenAdminEnterNumbersinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 81)//Done
    @TestParameters(testCaseId = {"TC-27_28"})
    public void TC_27_WhenAdminEnterAlphabatesinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 82)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_WhenAdminEnterIncompleteEmailinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("IncompleteEmailAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 83)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_WhenAdminEnterSpecialCharactersinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 84)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_WhenAdminEnterinvalidEmailFormatinEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("InvalidEmailFormat")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 85)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_WhenAdminAddEmaiwithoutdotcominEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("WrongEmail")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }

    @Test(priority = 86)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_WhenAdminLeavesEmailFieldBlankOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(""));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyBlankEmailErrorMessage(msg.BlankEmailErrorMsg()));    }



    @Test(priority = 87)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_VerifyErrorMessageisShowingWhenAdminprovidesSpecialCharactersinEINNumberOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());
    }

    @Test(priority = 88)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_VerifyErrorMessageisShowingWhenAdminprovidesAlphabatesinEINNumberOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());
    }

    @Test(priority = 89)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_VerifyErrorMessageisShowingWhenAdminprovidesInvalidZipcodeOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 90)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_VerifyErrorMessageisShowingWhenAdminEnterInvalidFromatInZipcodeOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 91)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_VerifyErrorMessageisShowingWhenAdminEnterZipcodewithlessthanfivedigitsOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCodewithFourDigits")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 92)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_VerifyErrorMessageisShowingWhenAdminEnterInvalidZipcodeFormatOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("InvalidZipcodeformat")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 93)//Done
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_WhenAdminEnterInvalidZipcodeFormatOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.VerifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 94)//Done
    @TestParameters(testCaseId = {"TC-61"})
    public void TC_61_WhenAdminChangeInputFieldWithValidDataonEditEntityDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity=new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityNameFromEditEntityDrawer());
        Assert.assertTrue(createentity.WriteAutomatedEntityName());;
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(editEntity.RemoveAddressFromEditEntityDrawer());
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(createentity.VerifyCreateNewEntityButtonHasDisplayed());
    }

    @Test(priority = 95)//Done
    @TestParameters(testCaseId = {"TC-70"})
    public void TC_70_VerifyUpdatedInformationsisShowingAfterUpdatingtheEntity() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createEntity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("Entity")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editEntity.VerifyUpdatedEntityisShowinginEntityTable());
    }

    @Test(priority = 96)//Done
    @TestParameters(testCaseId = {"TC-75"})
    public void TC_75_WhenAdminpressCancelButtonAfterChangingEntityNameFromEditCompanyDrawer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity=new CreateEntity(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
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


    @Test(priority = 105)//Done
    @TestParameters(testCaseId = {"TC-85,86"})
    public void TC_85_86_CheckWhatHappensWhenClickOnTheShowButtonAsCOSAdmin () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyAFieldIsEnable(2000,CreateCompany.ein));

    }
    @Test(priority = 106)//Done
    @TestParameters(testCaseId = {"TC-87"})
    public void TC_87_CheckEinFieldAfterClosingTheEditDrawerAndThenOpeningTheEditDrawerAgainAsCOSAdmin () throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());

    }
    @Test(priority = 106)//Done
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
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        customerSignUp.FieldClear(EditCompany.searchbar);
        createCharger.writeInputText(EditCompany.searchbar,prop.getProperty("Entity3"), 5000);
        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinSaving());
        Assert.assertTrue(editCompany.verifyAuditLogStatusForEinChange());

    }
    @Test(priority = 107)//Done
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
        dashboard.RefreshBrowser();
/*        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        createCharger.writeInputText(EditCompany.searchbar, prop.getProperty("Entity3"), 5000);
        createCharger.ClickButton(EditCompany.searchbtn,1000);*/
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.ClickButton(EditCompany.ShowButtonEin,4000);
        customerSignUp.FieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5645657567567567567",2500);
        Assert.assertTrue(createEntity.ClickonSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 108)//Done
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
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.FieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5445  6765765",2500);
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 109)//Done
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
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.FieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5--67567567567",2500);
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 110)//Done
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
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.FieldClear(company.ein);
        createCharger.writeInputText(company.ein,"22-4523789",2500);
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 111)//Done
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
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.FieldClear(company.ein);
        createCharger.writeInputText(company.ein,"aaertyuwe",2500);
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 112)//Done
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
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.FieldClear(company.ein);
        createCharger.writeInputText(company.ein,"er-yqsdert",2500);
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 113)//Done
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
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.FieldClear(company.ein);
        createCharger.writeInputText(company.ein,"1234567as",2500);
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());



    }



    @Test(priority = 114)//Done
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
        loginPage.VerifyValidLoginForCosAccounting();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        createCharger.ClickButton(EditCompany.EditCompanyBtn, 3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());
    }

    @Test(priority = 115)//Done
    @TestParameters(testCaseId = {"TC-85"})
    public void TC_95_96_CheckWhatHappensWhenClickOnTheShowButtonAsCOSAdmin () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.VerifyValidLoginForCosAccounting();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
//            createCharger.writeInputText(EditCompany.searchbar,"Tesla company 2",5000);
//            createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyAFieldIsEnable(2000,CreateCompany.ein));

    }
    @Test(priority = 116)//Done
    @TestParameters(testCaseId = {"TC-97"})
    public void TC_97_CheckEinFieldAfterClosingTheEditDrawerAndThenOpeningTheEditDrawerAgainAsCOSAdmin () throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.VerifyValidLoginForCosAccounting();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());

    }
    @Test(priority = 117)//Done
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
        loginPage.VerifyValidLoginForCosAccounting();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        editEntity.FieldClear(EditCompany.searchbar);
        createCharger.writeInputText(EditCompany.searchbar,prop.getProperty("Entity2"),5000);
        createCharger.ClickButton(EditCompany.searchbtn,1000);
        editCompany.ClickonEditbutton();
        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinSaving());
        Assert.assertTrue(editCompany.verifyAuditLogStatusForEinChange());

    }
    @Test(priority = 118)//Done
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
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        editCompany.ClickonEditbutton();
        createCharger.ClickButton(EditCompany.ShowButtonEin,4000);
        customerSignUp.FieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5645657567567567567",2500);
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }


    @Test(priority = 119)//Done
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
        loginPage.VerifyValidLoginForCosPropertySupport();
        Thread.sleep(2000);
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        createCharger.writeInputText(EditCompany.searchbar,"Apple A",5000);
        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinSaving());
    }


    @Test(priority = 120)//Done
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
        loginPage.VerifyValidLoginForCosDriverSupport();
        Thread.sleep(2000);
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyAFieldIsDisable(4000,EditCompany.ShowButtonBesideEINField));
        Assert.assertTrue(editCompany.verifyAFieldIsDisable(1000,EditCompany.SaveCompanyButton));

    }


    @Test(priority = 121)//Done
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
        loginPage.VerifyValidLoginForCosTechSupport();
        Thread.sleep(2000);
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyAFieldIsDisable(4000,EditCompany.ShowButtonBesideEINField));
        Assert.assertTrue(editCompany.verifyAFieldIsDisable(1000,EditCompany.SaveCompanyButton));
    }







}
