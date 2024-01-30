package tests.CompanyModule;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;
import java.util.Properties;

public class CompanyModule extends BaseTest {



    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyCreateNewCompanyButtonIsShowingtoAdmin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());

    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyCreateNewCompanyDraweHasDisplayedAfterClickingonCreateNewCompanyButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.verifyCreateNewCompanyDrawerDisplayed());


    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifyCompanyInformationFromCreateCompanyDrawerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.verifyCreateNewCompanyDrawerDisplayed());
        Assert.assertTrue(company.verifyCompanyInformationAreShowingOnCreateNewCompanyDrawer());


    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_VerifyCompnayLocationInformationFromCreateCompanyDrawerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.verifyCreateNewCompanyDrawerDisplayed());
        Assert.assertTrue(company.VerifyCompanyLocationInformationareShowingonCreateNewCompanyDrawer());

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_VerifyBrandInformationFromCreateCompanyDrawerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
      /*  Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.verifyCreateNewCompanyDrawerDisplayed());
        Assert.assertTrue(company.verifyUploadButtonIsShowing());
        Assert.assertTrue(company.VerifyBrandInformationareShowingonCreateNewCompanyDrawer());

    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_WhenAdminDoesnotProvideCompanyNameaonCreateNewCompanyDrawer_TC_6() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(""));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyCompanyNameErrorMessage(msg.CompanyNameErrorMsg()));
    }


    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_WhenAdminProvideInvalidPhoneNumberonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_WhenAdminEnterAlphabatesinPhoneNumberonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone1")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_WhenAdminEnterQuestionMarkinPhoneNumberonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_WhenAdminEnterStarsinPhoneNumberonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_WhenAdminProvideInvalidEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }


    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_WhenAdminEnterNumbersinEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_WhenAdminEnterAlbhatesinEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_WhenAdminEnterincompleteEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("IncompleteEmailAddress")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        //Assert.assertTrue(company.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_WhenAdminEnterspecialcharacterinEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_WhenAdminEnterinvalidEmailFormatInEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("InvalidEmailFormat")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }


    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_WhenAdminEnterinvalidFormatInEmailonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("WrongEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsg()));
    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_WhenAdminLeavesEmailFieldBlankIonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(""));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankEmailErrorMessage(msg.BlankEmailErrorMsg()));
    }

    /* @Test(priority = 21)//Done
     @TestParameters(testCaseId = {"TC-20"})
     public void TC_20_WhenAdminIncludesHTMLattheEndofWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
         HomePage homePage = new HomePage(driver);
         LoginPage loginPage = new LoginPage(driver);
         Dashboard dashboard=new Dashboard(driver);
         CreateCompany company = new CreateCompany(driver);
         loginPage.VerifyValidLogin();
         Assert.assertTrue(dashboard.RefreshBrowser());
         *//*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*//*
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        Assert.assertTrue(company.WriteCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("WebsiteWithHTMl")));
        Assert.assertTrue(company.EnterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }
*/
    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_WhenAdminProvidestheWebsitewhichIncludesSpacesinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("WebsiteWithSpaces")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_WhenAdminIncludestheCharactersinmiddleonWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("WebsiteWithCharacter")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_WhenAdminIncludesNumbersonWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_WhenAdminProvidesOnlySpecialCharacteronWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_WhenAdminProvidesOnlyAplhabatesonWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_WhenAdminProvidesOnlydotComonWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("WebsiteWithdotcomOnly")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }


    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_WhenAdminProvidesInvalidDatainEINFieldofCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
//        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_WhenAdminProvidesAlphabatesinEINFieldofCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
//        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_WhenAdminProvideInValidDatainZipCodefieldonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        //  Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }


    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_WhenAdminProvideinvalidZipCodefieldonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        //   Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_WhenAdminProvideZipCodewithLessthanFiveDigitsonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.VerifyCreateNewCompanyButtonHasDisplayed());*/
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCodewithFourDigits")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        //Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }


    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_WhenAdmindoesnotEnterZipCodeinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(""));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankZipCodeErrorMessage(msg.BlankZipCodeErrorMsg()));
    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_WhenAdmindoesnotEnterAddressinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(""));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankAddressErrorMessage(msg.BlankAddressErrorMsg()));
    }


    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_WhenAdminProvideValidDataonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        String companyName = company.writeAutomatedCompanyName();
        company.createCompany(companyName,company.generateRandomPhoneNumber(),company.generateRandomEmail());
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyAnElementDisplayedOrNot(2500,DashboardPropertyDetails.TopAccountName));
        Assert.assertTrue(createCharger.writeInputText(EditCompany.searchbar,companyName,3000));
        Assert.assertTrue(createCharger.clickButton(EditCompany.searchbtn,2000));
        Assert.assertTrue(editCompany.verifySearchResultCount());
    }

    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_VerifySaveandCancelButtonsareShowingontoSuperadminonCreateCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.verifySaveCompanyButtonAreShowingOnCreateCompanyDrawer());
        Assert.assertTrue(company.verifyCancelButtonIsShowing());

    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_WhenAdminClickonCrossButtonAfterProvidingAllInformationonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnCrossButton());
        Assert.assertTrue(createCharger.verifyDiscadContinuePopupHasDisplayed());
    }



    //Create company ends here
    //Search company starts from here


    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_WhenAdminClickSearchButtonWithouttypingAnything() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.verifyAnElementDisplayedOrNot(200,SearchCompany.Spiner));
    }



    @Test(priority = 46)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_WhenAdminSearchtheCompanybyCompanyName() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("CompanyName4")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editCompany.VerifUpdatedCompanyInformationIsShowing());
    }


    @Test(priority = 47)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_WhenAdminSearchCompanybyCompanyEmail() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.VerifCompanywiththeEnteredEmailAddressIsShowing());
    }

    @Test(priority = 48)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_WhenAdminSearchCompanybyPhone() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.VerifCompanywiththeEnteredPhoneNumberIsShowing());
    }

    @Test(priority = 49)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_WhenAdminSearchCompanybyEnteringInvalidCompanyEmail() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyEmail(prop.getProperty("invalidEmail")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.verifNoDataisShowingafterProvidingInvalidData());
    }

    @Test(priority = 50)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_WhenAdminSearchCompanybyStateNameFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
    }

    @Test(priority = 51)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_WhenAdminRemoveStateTag() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());*/
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
        Assert.assertTrue(searchcompany.ClickonCrosstoRemoveStateTag());
        Assert.assertTrue(searchcompany.VerifyStateTagHasbeenremoved());

    }


    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_WhenAdminSearchCompanybySelectingMultipleTagsFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchcompany.SelectZipFromAdvancedFilterDropDown());
        Assert.assertTrue(searchcompany.SelectComapnyStatus());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
        Assert.assertTrue(searchcompany.VerifyZipcodeTagisShowingAfterSelectingtheZipFromAdvancedFilter());
        Assert.assertTrue(searchcompany.verifyAnElementDisplayedOrNot(1000,SearchCompany.ClearAll));
    }


    @Test(priority = 53)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_WhenAdminClicksonResetButtonAfterSelectingFilterFromAdvanceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchcompany.SelectZipFromAdvancedFilterDropDown());
        Assert.assertTrue(searchcompany.SelectComapnyStatus());
        Assert.assertTrue(searchcompany.ClickonResetButton());
        Assert.assertTrue(searchcompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());

    }

    @Test(priority = 54)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_WhenAdminSelectsBrandLogoFilterFromAdvanceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickShowCompanylogocheckbox());
        Assert.assertTrue(searchcompany.VerifyOtherFilterHasDiabled());

    }


    @Test(priority = 55)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_WhenAdminClicksOnAccessCompanyPortal() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        CreateCharger operation = new CreateCharger(driver);
        COSA cosa = new COSA(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(operation.clickButton(EditCompany.AccessCompanyPortal,2000));
        Thread.sleep(3000);
        searchcompany.SwitchToTab(1);
        Assert.assertTrue(cosa.CurrentPageURLCheck(prop.getProperty("DashboardURLPropertyAdmin")));

    }



    //Search company ends here
    //Edit Company starts from here



    @Test(priority = 64)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyEditCompanyButtonIsShowingontheCompanyManagementPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        company.SwitchToTab(0);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        dashboard.gotoDashboard();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.VerifyEditButtonHasDisplayed());
    }

    @Test(priority = 65)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyEditCompanyDrawerHasDisplayedAfterClickingonEditButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.VerifyEditCompanyDrawerisShowing());
    }

    @Test(priority = 66)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifyComapnyStatusisShowingOnMoreSettingsSectionsOfEditCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(editCompany.VerifCompanyStatusisActiveonMoreSettingsSection());
    }

    @Test(priority = 67)//Done
    public void TC_4_VerifyDecativateCompanyButtonisShowingOnMoreSettingsSectionsOfEditCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(editCompany.VerifDeactivateCompanyButtonIsShowingonMoreSettingsSection());
    }


    @Test(priority = 68)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_VerifyAuditLogsIsShowingOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 69)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyLoadmoreButtonisShowingonAuditLogsIsSectionOfEditCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(editCompany.VerifLoadmoreButtonisShowingonAuditLogsofEditComapnyDrawer());
    }

    @Test(priority = 70)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_VerifyErrorMessageisShowingWhenUserDoesnotProvideCompanyNameOnEditCompanyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.ClearCompanyNameFromEditCompanyDrawer());
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyCompanyNameErrorMessage(msg.CompanyNameErrorMsg()));
    }


    @Test(priority = 71)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_WhenAdminProvideinvalidDatainthePhoneNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
//        Assert.assertTrue(editCompany.VerifyEditCompanyButtonHasDisplayed());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
//        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 72)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_WhenAdminEntersAlphabatesinPhoneNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone1")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 73)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_WhenAdminEntersQuestionmarkinPhoneNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankPhoneNumberErrorMessage(msg.BlankPhoneNumberErrorMsg()));
    }

    @Test(priority = 74)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_10_WhenAdminEntersSpecialCharactersinPhoneNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 75)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_WhenAdminEnterInvalidEmailOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }

    @Test(priority = 76)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_WhenAdminEnterNumbersinEmailOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }

    @Test(priority = 77)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_WhenAdminEnterAlphabatesinEmailOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }

    @Test(priority = 78)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_WhenAdminEnterIncompletEmaillOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("IncompleteEmailAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }


    @Test(priority = 78)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_WhenAdminEnterSpecialCharacterinEmailOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }

    @Test(priority = 79)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_17_WhenAdminEnterInvalidEmailFormatinEmailOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("InvalidEmailFormat")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }

    @Test(priority = 80)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_WhenAdminEnterEmailwithoutAddingdotcomOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("WrongEmail")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(editCompany.VerifyInvalidEmailErrorMessage(msg.Invalidemialerrormessageoneditcompanydrawer()));
    }

    @Test(priority = 81)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_VerifyErrorMessageisShowingWhenAdminLeavesEmailfieldBlankOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyEmail(""));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankEmailErrorMessage(msg.BlankEmailErrorMsg()));
    }

//Error message is not showing in this case
//    @Test(priority = 20)//Done
//    @TestParameters(testCaseId = {"TC-20"})
//    public void TC_20_VerifyErrorMessageisShowingWhenAdminProvidesIncorrectWebsiteAddressOnEditCompanyDrawer() throws InterruptedException {
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard=new Dashboard(driver);
//        CreateCompany company = new CreateCompany(driver);
//        EditCompany editCompany= new EditCompany(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.RefreshBrowser());
//       /* Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
//        Assert.assertTrue(editCompany.ClickonEditbutton());
//        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
//        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("WebsiteWithHTMl")));
//        Assert.assertTrue(company.ClickonSaveButton());
    //  Assert.assertTrue(company.VerifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
//    }


    @Test(priority = 82)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_VerifyErrorMessageisShowingWhenAdminEnterSpecialCharactersinWebsiteAddressOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }


    @Test(priority = 83)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_VerifyErrorMessageisShowingWhenAdminProvideWebsitewhichIncludesSpacesisOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("WebsiteWithSpaces")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 84)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_VerifyErrorMessageisShowingWhenAdminIncludestheCharactersinmiddleinWebsiteOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("WebsiteWithCharacter")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 85)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_VerifyErrorMessageisShowingWhenAdminIncludesNumbersinWebsiteOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("Numbers")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 86)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_VerifyErrorMessageisShowingWhenAdminOnlyAplhabatesonWebsitOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }


    @Test(priority = 87)//Done
    public void TC_26_VerifyErrorMessageisShowingWhenAdminProvidesOnlydotComonWebsiteinEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("WebsiteWithdotcomOnly")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 88)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_VerifyErrorMessageisShowingWhenAdminprovidesAplhabatesinEINNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());
    }

    @Test(priority = 89)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void VerifyErrorMessageisShowingWhenAdminprovidesSpecialCharactersinEINNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());
    }

    @Test(priority = 90)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void VerifyErrorMessageisShowingWhenAdminprovidesInvalidZaipcodeOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 91)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_VerifyErrorMessageisShowingWhenAdminUseInvalidFormatforZipcodeOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 92)//Done
    public void TC_31_VerifyErrorMessageisShowingWhenAdminEnterZipcodeWithLessthanFiveDigitsOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCodewithFourDigits")));
        // Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 93)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_VerifyErrorMessageisShowingWhenAdminEnterZipcodeUsingInvalidZipcodeFormatOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("InvalidZipcodeformat")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 94)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_VerifyErrorMessageisShowingWhenAdminLeavesZipcodefieldBlankOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(""));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankZipCodeErrorMessage(msg.BlankZipCodeErrorMsg()));
    }

    @Test(priority = 95)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_VerifyErrorMessageisShowingWhenAdminLeavesAddressfieldBlankOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveAddressFromEditCompanyDrawer());
        Assert.assertTrue(company.enterAddress(""));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankAddressErrorMessage(msg.BlankAddressErrorMsg()));
    }
    // User is able to upload the image using invalid dimension
    @Test(priority = 96)//Done
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_VerifyErrorMessageisShowingWhenAdminUploadtheImageMoreThan3MBOnEditCompanyDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.ClickonUploadButton());
        Assert.assertTrue(editCompany.uploadMoreThan3MBSizeLogo());
        Assert.assertTrue(editCompany.verifyTextMatching(2000,EditCompany.ErrorMsg,msg.Maximumimagesizeerrormsg()));
    }

    @Test(priority = 97)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_WhenAdminpressCancelButtonAfterChangingCompanyNameFromEditCompanyDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.ClearCompanyNameFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("UpdatedCompanyName")));
        Assert.assertTrue(editCompany.ClickCancelbutton());
        Assert.assertTrue(editCompany.VerifyDiscardButtonisShowingonConfirmationPopup());
        Assert.assertTrue(editCompany.ClickonDiscardButton());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
    }



    @Test(priority = 98)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_WhenAdminChangeInputFieldWithValidDataonEditCompanyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.ClearCompanyNameFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(editCompany.RemoveEmailFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(editCompany.RemoveAddressFromEditCompanyDrawer());
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(editCompany.VerifyEditButtonHasDisplayed());
    }

    @Test(priority = 99)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_CheckEinIsRemovedAfterClearingEinField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateCharger operations = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(operations.clickButton(EditCompany.ShowButtonBesideEINField,2000));
        Assert.assertTrue(editCompany.fieldClear(CreateCompany.ein));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(operations.clickButton(EditCompany.ShowButtonBesideEINField,2000));
        Assert.assertTrue(editCompany.verifyFieldIsEmpty(2000,CreateCompany.ein));
    }

    @Test(priority = 100)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_CheckEinIsRemovedAfterClearingWebsiteField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateCharger operations = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.fieldClear(CreateCompany.website));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.verifyFieldIsEmpty(2000,CreateCompany.website));
    }




    @Test(priority = 108)//Done
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
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        createCharger.writeInputText(EditCompany.searchbar,"Tesla company 2",5000);
        createCharger.clickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyAFieldIsEnable(2000,CreateCompany.ein));

    }
    @Test(priority = 109)//Done
    @TestParameters(testCaseId = {"TC-87"})
    public void TC_87_CheckEinFieldAfterClosingTheEditDrawerAndThenOpeningTheEditDrawerAgainAsCOSAdmin () throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());

    }
    @Test(priority = 110)//Done
    @TestParameters(testCaseId = {"TC-88"})
    public void TC_88_89_90_CheckEINAfterEditing() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Thread.sleep(3000);
        customerSignUp.fieldClear(EditCompany.searchbar);
        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
        createCharger.clickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinSaving());
        Assert.assertTrue(editCompany.verifyAuditLogStatusForEinChange());

    }
    @Test(priority = 111)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_CheckWhatHappensWhenIProvideInvalidEINumber() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,4000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5645657567567567567",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 112)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_2_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5445  6765765",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 113)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_3_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5--67567567567",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 114)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_4_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"22-4523789",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 115)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_5_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"aaertyuwe",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 116)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_6_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"er-yqsdert",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 117)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_7_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"1234567as",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());



    }



    @Test(priority = 118)//Done
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
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
        createCharger.clickButton(EditCompany.searchbtn, 1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn, 3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());
    }

    @Test(priority = 119)//Done
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
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
//            createCharger.writeInputText(EditCompany.searchbar,"Tesla company 2",5000);
//            createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyAFieldIsEnable(2000,CreateCompany.ein));

    }


    @Test(priority = 120)//Done
    @TestParameters(testCaseId = {"TC-97"})
    public void TC_97_CheckEinFieldAfterClosingTheEditDrawerAndThenOpeningTheEditDrawerAgainAsCOSAdmin () throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosAccounting();
        editCompany.ClickCancelbutton();
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());

    }
    @Test(priority = 121)//Done
    @TestParameters(testCaseId = {"TC-98,99,100"})
    public void TC_98_99_100_CheckEINAfterEditing() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosAccounting();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Thread.sleep(3000);
        customerSignUp.fieldClear(EditCompany.searchbar);
        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
        createCharger.clickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinSaving());
        Assert.assertTrue(editCompany.verifyAuditLogStatusForEinChange());

    }
    @Test(priority = 122)//Done
    @TestParameters(testCaseId = {"TC-101"})
    public void TC_101_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,4000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5645657567567567567",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }


    @Test(priority = 123)//Done
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
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
        createCharger.clickButton(EditCompany.searchbtn, 1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinSaving());
    }


    @Test(priority = 124)//Done
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
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        createCharger.clickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyAFieldIsDisable(4000,EditCompany.ShowButtonBesideEINField));
        Assert.assertTrue(editCompany.verifyAFieldIsDisable(1000,EditCompany.SaveCompanyButton));

    }


    @Test(priority = 125)//Done
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
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        createCharger.clickButton(EditCompany.searchbtn, 1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyAFieldIsDisable(4000,EditCompany.ShowButtonBesideEINField));
        Assert.assertTrue(editCompany.verifyAFieldIsDisable(1000,EditCompany.SaveCompanyButton));
    }









}
