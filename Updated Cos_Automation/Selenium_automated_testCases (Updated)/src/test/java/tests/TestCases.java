package tests;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;
import java.util.Properties;


public class TestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();
    ExtentTest logger;


    @Test(priority = 0)//Done
    public void WhenAdminLeavesEmailFieldBlank() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(""));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("validPassword")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyBlankEmailErrorMessage(msg.BlanklEmailErrorMsg()));
    }

    @Test(priority = 1)//Done
    public void WhenAdminLeavesPasswordFieldBlank() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("invalidEmail")));
        Assert.assertTrue(loginPage.EnterPassword(""));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyBlankPasswordErrorMessage(msg.BlanklPassErrorMsg()));
    }

    @Test(priority = 2)//Done
    public void WhenAdminLeavesBothEmailandPasswordFieldBlank() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(""));
        Assert.assertTrue(loginPage.EnterPassword(""));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyBlankEmailErrorMessage(msg.BlanklEmailErrorMsg()));
        Assert.assertTrue(loginPage.verifyBlankPasswordErrorMessage(msg.BlanklPassErrorMsg()));
    }

    @Test(priority = 3)//Done
    public void WhenAdminLoginusingInvalidEmailandInvalidPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("invalidEmail")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("Numbers")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidPasswordErrorMessage(msg.InvalidEmailPasswordMsg()));
    }

    @Test(priority = 4)//Done
    public void WhenAdminProvidesInvalidEmailbutCorrectPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("EmailwithoutCom")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("validPassword")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidPasswordErrorMessage(msg.InvalidEmailPasswordMsg()));
    }

    @Test(priority = 5)//Done
    public void WhenAdminProvidesincomplateEmailbutCorrectPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("incompletedEmail")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("validPassword")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidEmailErrorMessage(msg.InvalidEmailErrorMsg()));
    }

    @Test(priority = 6)//Done
    public void WhenAdminEnteresNumberintheEmailField() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("validPassword")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidEmailErrorMessage(msg.InvalidEmailErrorMsg()));
    }

    @Test(priority = 7)//Done
    public void WhenAdminEntersInvalidEmailbutCorrectPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("validPassword")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidEmailErrorMessage(msg.InvalidEmailErrorMsg()));
    }

    @Test(priority = 7)//Done
    public void WhenAdminEntersValidEmailandInvalidPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("validEmail")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("InvalidPassword")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidPasswordErrorMessage(msg.InvalidEmailPasswordMsg()));
    }

    @Test(priority = 7)//Done
    public void WhenAdminEnterValidEmailandbracketsinPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("validEmail")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("InvalidPassword1")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidPasswordErrorMessage(msg.InvalidEmailPasswordMsg()));
    }

    @Test(priority = 8)//Done
    public void WhenAdminEnterValidEmailandincorrectPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("validEmail")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("InvalidPassword2")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidPasswordErrorMessage(msg.InvalidEmailPasswordMsg()));
    }

    @Test(priority = 9)//Done
    public void WhenAdminEnterValidEmailandunderscoreinPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterEmail(prop.getProperty("validEmail")));
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("InvalidPassword3")));
        Assert.assertTrue(loginPage.ClickLoginButton());
        Assert.assertTrue(loginPage.verifyInvalidPasswordErrorMessage(msg.InvalidEmailPasswordMsg()));
    }

    @Test(priority = 10)//Done
    public void ShowAndHidePassFromLoginPage() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.EnterPassword(prop.getProperty("validPassword")));
        Assert.assertTrue(loginPage.ClickonEyetoShowthePassword());
        Assert.assertTrue(loginPage.VerifyPasswordISShowingAfterClickingonEyeIcon());
        Assert.assertTrue(loginPage.ClickonEyetoHidethePassword());
        Assert.assertTrue(loginPage.VerifyPasswordHasHideAfterClickingonEyeIcon());
    }



    @Test(priority = 11)//Done
    public void WhenAdminClickonForgoPasswordLink() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.geturl();
        Assert.assertTrue(loginPage.ClickForgotPassword());
       // Assert.assertTrue(loginPage.VerifyForgotPasswordMessage(msg.ForgotPasswordMessage()));
    }

    @Test(priority = 12)//Done
    public void WhenAdminLoginUsingValidEmailandValidPassword() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyValidLogin();

    }

    @Test(priority = 13)//Done
    public void VerifyCreateNewCompanyButtonIsShowingtoAdmin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());

    }

    @Test(priority = 14)//Done
    public void VerifyCreateNewCompanyDraweHasDisplayedAfterClickingonCreateNewCompanyButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.verifyCreateNewCompanyDrawerDisplayed());


    }

    @Test(priority = 15)//Done
    public void VerifyCompanyInformationFromCreateCompanyDrawerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        Assert.assertTrue(dashboard.refreshBrowser());
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.verifyCreateNewCompanyDrawerDisplayed());
        Assert.assertTrue(company.verifyCompanyInformationAreShowingOnCreateNewCompanyDrawer());


    }

    @Test(priority = 16)//Done
    public void VerifyCompnayLocationInformationFromCreateCompanyDrawerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.verifyCreateNewCompanyDrawerDisplayed());
        Assert.assertTrue(company.VerifyCompanyLocationInformationareShowingonCreateNewCompanyDrawer());

    }

    @Test(priority = 17)//Done
    public void VerifyBrandInformationFromCreateCompanyDrawerDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.verifyCreateNewCompanyDrawerDisplayed());
        Assert.assertTrue(company.verifyUploadButtonIsShowing());
        Assert.assertTrue(company.VerifyBrandInformationareShowingonCreateNewCompanyDrawer());

    }

    @Test(priority = 18)//Done
    public void VerifySaveandCancelButtonsareShowingontoSuperadminonCreateCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.VerifySaveCompanyButtonAreShowingOnCreateCompanyDrawer());
        Assert.assertTrue(company.verifyCancelButtonIsShowing());

    }

    @Test(priority = 19)//Done
    public void WhenAdminClickonCrossButtonAfterProvidingAllInformationonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
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
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
    }

    @Test(priority = 20)//Done
    public void WhenAdminDoesnotProvideCompanyNameaonCreateNewCompanyDrawer() throws InterruptedException {
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


    @Test(priority = 21)//Done
    public void WhenAdminProvideInvalidPhoneNumberonCreateNewCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 22)//Done
    public void WhenAdminEnterAlphabatesinPhoneNumberonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
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
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 23)//Done
    public void WhenAdminEnterQuestionMarkinPhoneNumberonCreateNewCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 24)//Done
    public void WhenAdminEnterStarsinPhoneNumberonCreateNewCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 25)//Done
    public void WhenAdminProvideInvalidEmailonCreateNewCompanyDrawer() throws InterruptedException {
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


    @Test(priority = 26)//Done
    public void WhenAdminEnterNumbersinEmailonCreateNewCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 27)//Done
    public void WhenAdminEnterAlbhatesinEmailonCreateNewCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 28)//Done
    public void WhenAdminEnterincompleteEmailonCreateNewCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 29)//Done
    public void WhenAdminEnterspecialcharacterinEmailonCreateNewCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 30)//Done
    public void WhenAdminEnterinvalidEmailFormatInEmailonCreateNewCompanyDrawer() throws InterruptedException {
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


    @Test(priority = 31)//Done
    public void WhenAdminEnterinvalidFormatInEmailonCreateNewCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 32)//Done
    public void WhenAdminLeavesEmailFieldBlankIonCreateNewCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 33)//Done
    public void WhenAdminIncludesHTMLattheEndofWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("WebsiteWithHTMl")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 34)//Done
    public void WhenAdminProvidestheWebsitewhichIncludesSpacesinCreateNewCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 35)//Done
    public void WhenAdminIncludestheCharactersinmiddleonWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 36)//Done
    public void WhenAdminIncludesNumbersonWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 37)//Done
    public void WhenAdminProvidesOnlySpecialCharacteronWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 38)//Done
    public void WhenAdminProvidesOnlyAplhabatesonWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 39)//Done
    public void WhenAdminProvidesOnlydotComonWebsiteinCreateNewCompanyDrawer() throws InterruptedException {
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


    @Test(priority = 40)//Done
    public void WhenAdminProvidesInvalidDatainEINFieldofCreateNewCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.verifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 41)//Done
    public void WhenAdminProvidesAlphabatesinEINFieldofCreateNewCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 42)//Done
    public void WhenAdminProvideInValidDatainZipCodefieldonCreateNewCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }


    @Test(priority = 43)//Done
    public void WhenAdminProvideinvalidZipCodefieldonCreateNewCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.enterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 44)//Done
    public void WhenAdminProvideZipCodewithLessthanFiveDigitsonCreateNewCompanyDrawer() throws InterruptedException {
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


    @Test(priority = 45)//Done
    public void WhenAdmindoesnotEnterZipCodeinCreateNewCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.enterZipCode(""));
        Assert.assertTrue(company.enterAddress(prop.getProperty("CompnayAddress")));
        //Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.verifyBlankZipCodeErrorMessage(msg.BlankZipCodeErrorMsg()));
    }

    @Test(priority = 46)//Done
    public void WhenAdmindoesnotEnterAddressinCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
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
        Assert.assertTrue(company.enterAddress(""));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankAddressErrorMessage(msg.BlankAddressErrorMsg()));
    }


    @Test(priority = 47)//Done
    public void WhenAdminProvideValidDataonCreateNewCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.clickOnCreateCompanyButton());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeRandomCompanyEmail());
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.writeRandomEINNumber());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.writeRandomCompanyAddress());
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
    }

    @Test(priority = 48)//Done
    public void VerifyEditCompanyButtonIsShowingontheCompanyManagementPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.VerifyEditButtonHasDisplayed());
    }

    @Test(priority = 49)//Done
    public void VerifyEditCompanyDrawerHasDisplayedAfterClickingonEditButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
       // Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.VerifyEditButtonHasDisplayed());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(company.verifyCompanyInformationAreShowingOnCreateNewCompanyDrawer());
    }

    @Test(priority = 50)//Done
    public void VerifyComapnyStatusisShowingOnMoreSettingsSectionsOfEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 51)//Done
    public void VerifyDecativateCompanyButtonisShowingOnMoreSettingsSectionsOfEditCompanyDrawer() throws InterruptedException {
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


    @Test(priority = 52)//Done
    public void VerifyAuditLogsIsShowingOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 53)//Done
    public void VerifyLoadmoreButtonisShowingonAuditLogsIsSectionOfEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 54)//Done
    public void VerifyErrorMessageisShowingWhenUserDoesnotProvideCompanyNameOnEditCompanyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.ClearCompanyNameFromEditCompanyDrawer());
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyCompanyNameErrorMessage(msg.CompanyNameErrorMsg()));
    }


    @Test(priority = 55)//Done
    public void WhenAdminProvideinvalidDatainthePhoneNumberOnEditCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 56)//Done
    public void WhenAdminEntersAlphabatesinPhoneNumberOnEditCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone1")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 57)//Done
    public void WhenAdminEntersQuestionmarkinPhoneNumberOnEditCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 58)//Done
    public void WhenAdminEntersSpecialCharactersinPhoneNumberOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemovePhoneNumberFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 59)//Done
    public void WhenAdminEnterInvalidEmailOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 60)//Done
    public void WhenAdminEnterNumbersinEmailOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 61)//Done
    public void WhenAdminEnterAlphabatesinEmailOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 62)//Done
    public void WhenAdminEnterIncompletEmaillOnEditCompanyDrawer() throws InterruptedException {
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


    @Test(priority = 63)//Done
    public void WhenAdminEnterSpecialCharacterinEmailOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 64)//Done
    public void WhenAdminEnterInvalidEmailFormatinEmailOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 65)//Done
    public void WhenAdminEnterEmailwithoutAddingdotcomOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 66)//Done
    public void VerifyErrorMessageisShowingWhenAdminLeavesEmailfieldBlankOnEditCompanyDrawer() throws InterruptedException {
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


    @Test(priority = 67)//Done
    public void VerifyErrorMessageisShowingWhenAdminProvidesIncorrectWebsiteAddressOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("WebsiteWithHTMl")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }


    @Test(priority = 68)//Done
    public void VerifyErrorMessageisShowingWhenAdminEnterSpecialCharactersinWebsiteAddressOnEditCompanyDrawer() throws InterruptedException {
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


    @Test(priority = 69)//Done
    public void VerifyErrorMessageisShowingWhenAdminProvideWebsitewhichIncludesSpacesisOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 70)//Done
    public void VerifyErrorMessageisShowingWhenAdminIncludestheCharactersinmiddleinWebsiteOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveWebsiteFromEditCompanyDrawer());
        Assert.assertTrue(company.enterCompanyWebsite(prop.getProperty("WebsiteWithCharacter")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidWebsiteErrorMessage(msg.InvalidWebsiteErrorMsg()));
    }

    @Test(priority = 71)//Done
    public void VerifyErrorMessageisShowingWhenAdminIncludesNumbersinWebsiteOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 72)//Done
    public void VerifyErrorMessageisShowingWhenAdminOnlyAplhabatesonWebsitOnEditCompanyDrawer() throws InterruptedException {
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


    @Test(priority = 73)//Done
    public void VerifyErrorMessageisShowingWhenAdminProvidesOnlydotComonWebsiteinEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 74)//Done
    public void VerifyErrorMessageisShowingWhenAdminprovidesAplhabatesinEINNumberOnEditCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.verifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 75)//Done
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
        Assert.assertTrue(company.verifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 76)//Done
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
       // Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 77)//Done
    public void VerifyErrorMessageisShowingWhenAdminUseInvalidFormatforZipcodeOnEditCompanyDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.enterZipCode(prop.getProperty("InvalidZipcode")));
        // Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 78)//Done
    public void VerifyErrorMessageisShowingWhenAdminEnterZipcodeWithLessthanFiveDigitsOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 79)//Done
    public void VerifyErrorMessageisShowingWhenAdminEnterZipcodeUsingInvalidZipcodeFormatOnEditCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("InvalidZipcodeformat")));
        Assert.assertTrue(company.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 80)//Done
    public void VerifyErrorMessageisShowingWhenAdminLeavesZipcodefieldBlankOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 81)//Done
    public void VerifyErrorMessageisShowingWhenAdminLeavesAddressfieldBlankOnEditCompanyDrawer() throws InterruptedException {
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

    @Test(priority = 82)//Done
    public void VerifyErrorMessageisShowingWhenAdminUploadtheImageUsingInvalidDimensionOnEditCompanyDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.ClickonUploadButton());
        Assert.assertTrue(editCompany.uploadMoreThan3MBSizeLogo());
        Assert.assertTrue(editCompany.VerifyInvalidImageDimesionErrorMessage(msg.Invalidimagedimensionerrormsg()));
    }

    @Test(priority = 83)//Done
    public void WhenAdminpressCancelButtonAfterChangingCompanyNameFromEditCompanyDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.ClearCompanyNameFromEditCompanyDrawer());
        Assert.assertTrue(company.writeCompanyName(prop.getProperty("UpdatedCompanyName")));
        Assert.assertTrue(editCompany.ClickCancelbutton());
        Assert.assertTrue(editCompany.VerifyDiscardButtonisShowingonConfirmationPopup());
        Assert.assertTrue(editCompany.ClickonDiscardButton());
        Assert.assertTrue(company.verifyCreateNewCompanyButtonHasDisplayed());
    }



    @Test(priority = 84)//Done
    public void WhenAdminChangeInputFieldWithValidDataonEditCompanyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
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

    @Test(priority = 85)//Done
    public void WhenAdminClickSearchButtonWithouttypingAnything() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.VerifPagehasRefreshafterprrssingsearchbutton());
    }

    @Test(priority = 86)//Done
    public void WhenAdminSorttheCompanyNameinAscendingorder() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAscedingArrowfromName());
    }

    @Test(priority = 87)//Done
    public void WhenAdminSorttheCompanyEmailinAscendingorder() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        //Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(searchcompany.ClickonAscedingfromEmail());
    }

    @Test(priority = 88)//Done
    public void VerifyCompanyNameisShowinginAscendingorder() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAscedingArrowfromName());
        Assert.assertTrue(searchcompany.VerifcompanyNameisSortedinAscendingOrder());

    }

    @Test(priority = 89)//Done
    public void WhenAdminVistsAnotherPageAfterApplyingAscendingorder() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(searchcompany.ClickonAscedingArrowfromName());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());

    }

    @Test(priority = 90)//Done
    public void WhenAdminRefreshtheBrowserAfterApplyingAscendingorder() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(searchcompany.ClickonAscedingArrowfromName());
        Assert.assertTrue(dashboard.refreshBrowser());
    }

    @Test(priority = 91)//Done
    public void WhenAdminUseSortingAfterPressingLoadMoreButton() throws InterruptedException, IOException {
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
        Assert.assertTrue(searchcompany.ClickonLoadMoreButton());
        Assert.assertTrue(searchcompany.VerifTwoHunderedMorecompaniesareShowingAfterPressingLoadMoreButton());
        Assert.assertTrue(searchcompany.ClickonAscedingArrowfromName());
        Assert.assertTrue(searchcompany.VerifTwoHunderedCompaniesareShowingAfterSorting());

    }


    @Test(priority = 92)//Done
    public void WhenAdminSearchtheCompanybyCompanyName() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editCompany.VerifUpdatedCompanyInformationIsShowing());
    }


    @Test(priority = 93)//Done
    public void WhenAdminSearchCompanybyCompanyEmail() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.VerifCompanywiththeEnteredEmailAddressIsShowing());
    }

    @Test(priority = 94)//Done
    public void WhenAdminSearchCompanybyPhone() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.VerifCompanywiththeEnteredPhoneNumberIsShowing());
    }

    @Test(priority = 95)//Done
    public void WhenAdminSearchCompanybyEnteringInvalidCompanyEmail() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyEmail(prop.getProperty("invalidEmail")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.verifNoDataisShowingafterProvidingInvalidData());
    }

    @Test(priority = 96)//Done
    public void WhenAdminSearchCompanybyStateNameFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
    }

    @Test(priority = 97)//Done
    public void WhenAdminRemoveStateTag() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        // Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());*/
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
        Assert.assertTrue(searchcompany.ClickonCrosstoRemoveStateTag());
        Assert.assertTrue(searchcompany.VerifyStateTagHasbeenremoved());

    }


    @Test(priority = 98)//Done
    public void WhenAdminSearchCompanybySelectingMultipleTagsFromAdnaceFilterDrawer() throws InterruptedException, IOException {
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
        Assert.assertTrue(searchcompany.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonZipCodeDropdownFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.SelectComapnyStatus());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
        Assert.assertTrue(searchcompany.VerifyZipcodeTagisShowingAfterSelectingtheZipFromAdvancedFilter());
        Assert.assertTrue(searchcompany.VerifCompanyStatusTagisShowingaAfterSelectingtheZipFromAdncedFilter());
    }


    @Test(priority = 99)//Done
    public void WhenAdminClicksonResetButtonAfterSelectingFilterFromAdvanceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
       /* Assert.assertTrue(searchcompany.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonZipCodeDropdownFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.SelectComapnyStatus());*/
        Assert.assertTrue(searchcompany.ClickonResetButton());
        Assert.assertTrue(searchcompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());

    }

    @Test(priority = 100)//Done
    public void WhenAdminSelectsBrandLogoFilterFromAdvanceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchcompany.ClickShowCompanylogocheckbox());
        Assert.assertTrue(searchcompany.VerifyOtherFilterHasDiabled());

    }

    @Test(priority = 101)//Done
    public void VerifyCreateNewEntityButtonIsShowingtoAdminonEntityManagementPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(createentity.VerifyCreateNewEntityButtonHasDisplayed());

    }

    @Test(priority = 102)//Done
    public void VerifyCreateNewEntityDraweHasDisplayedAfterClickingonCreateNewCompanyButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.VerifyCreateNewEntityDrawerHasDisplayed());
    }

    @Test(priority = 103)//Done
    public void VerifyCompanyInformationFromCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.VerifyEntityInformationareShowingonCreateNewEntityDrawer());


    }

    @Test(priority = 104)//Done
    public void VerifyCompnayLocationInformationFromCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.VerifyEntityLocationInformationareShowingonCreateNewCompanyDrawer());

    }

    @Test(priority = 105)//Done
    public void WhenAdminDoesnotProvideEntityNameaonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(""));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyEnttityNmaeErrorMessage(msg.EntityNameErrorMsg()));
    }

    @Test(priority = 106)//Done
    public void WhenAdminProvideInvalidPhoneNumberonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 107)//Done
    public void WhenAdminEnterAplhabatesinPhoneNumberFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("InvalidPhone1")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 108)//Done
    public void WhenAdminEnterQuestionmarkinPhoneNumberFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("InvalidPhone2")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 109)//Done
    public void WhenAdminEnterSpecialCharactersinPhoneNumberFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 110)//Done
    public void WhenAdminEnterIvlaidEmailinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 111)//Done
    public void WhenAdminEnterNumbersinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 112)//Done
    public void WhenAdminEnterAplhabtesinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 113)//Done
    public void WhenAdminprovidesincompletemailinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("IncompleteEmailAddress")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 114)//Done
    public void WhenAdminEnterSpecialCharactersinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 115)//Done
    public void WhenAdminEnterInvalidEmailFormatinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("InvalidEmailFormat")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 116)//Done
    public void WhenAdminEnterWrongEmailFormatinemailFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("WrongEmail")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));

    }

    @Test(priority = 117)//Done
    public void WhenAdminLeavesEmailFieldBlankonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(""));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyBlankEmailErrorMessage(msg.BlankEmailErrorMsg()));


    }

    @Test(priority = 118)//Done
    public void WhenAdminEnterSpecialCharctersinEINFieldCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));

    }

    @Test(priority = 119)//Done
    public void WhenAdminEnterAlphabatesinEINFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));

    }

    @Test(priority = 120)//Done
    public void WhenAdminEnterInvalidNumbersinEINFieldCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));

    }

    @Test(priority = 121)//Done
    public void WhenAdminEnterAlphabatesinEINFieldCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Alphabates")));
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));

    }

    @Test(priority = 122)//Done
    public void WhenAdminEnterInvalidZipcodeFieldonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));

    }

    @Test(priority = 123)//Done
    public void WhenAdminEnterInvalidZipcodeFromatonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("InvalidZipcode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));

    }


    @Test(priority = 124)//Done
    public void WhenAdminProvidesFourDigitsZaipcodeonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCodewithFourDigits")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));

    }

    @Test(priority = 125)//Done
    public void VerifyStateFieldisDisabledAfterProvidingZipCodeonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.VerifyStateFieldisDisabled());
    }

    @Test(priority = 126)//Done
    public void VerifyCityFieldisDisabledAfterProvidingZipCodeonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.VerifyCityFieldisDisabled());
    }

    @Test(priority = 127)//Done
    public void VerifyCountryFieldisDisabledAfterProvidingZipCodeonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.VerifyCountryFieldisDisabled());
    }

    @Test(priority = 128)//Done
    public void WhenAdminProvidesValidDataonCreateNewEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.WriteEntityName(prop.getProperty("Entity")));
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("Numbers")));
        Assert.assertTrue(createentity.enterNotesInEntityInformation());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.enterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.clickOnSaveButton());
    }

    @Test(priority = 129)//Done
    public void VerifyNewDrawerHasOpenedafterClickingonEntiysameasCompany() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.ClickoEntitysameasCompany());
        //Assert.assertTrue(createentity.VerifyNewDrawerwithEmptyFieldisShowingAfterClickingonEntitySameasCompanyLink());
    }

    @Test(priority = 130)//Done
    public void WhenAdminprovideInvalidCompanyNameonEntiysameasCompanyDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
        Assert.assertTrue(createentity.ClickoEntitysameasCompany());
        //Assert.assertTrue(createentity.ClickonSelectCompanydropdownFromEntitysameasCompanyDrawer());
        Assert.assertTrue(createentity.WriteCompanyName(prop.getProperty("Alphabates")));
        Assert.assertTrue(createentity.VerifyNoSugessuionISShowingAfterProvidingInvalidCompanyNameonEntitySameasCompanyDrawer());


    }

//    @Test(priority = 131)//Done
//    public void WhenAdminChoosetheCompanyNamefromDropdownonEntiysameasCompanyDrawer() throws InterruptedException {
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard=new Dashboard(driver);
//        CreateEntity createentity = new CreateEntity(driver);
//        CreateCompany company=new CreateCompany(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.RefreshBrowser());
//        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
//        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
//        Assert.assertTrue(createentity.ClickoEntitysameasCompany());
//        //Assert.assertTrue(createentity.ClickonSelectCompanydropdownFromEntitysameasCompanyDrawer());
//        Assert.assertTrue(createentity.SelectCompanyNamefromDropdown());
//        Assert.assertTrue(createentity.VerifyAlertMessageisShowingAfterSelectingtheCopmayfromCompanyList());
//        Assert.assertTrue(createentity.VerifyEntityInformationareShowingonCreateNewEntityDrawer());
//        Assert.assertTrue(createentity.VerifyEntityLocationInformationareShowingonCreateNewCompanyDrawer());
//        Assert.assertTrue(createentity.ClickonSaveButton());
//        Assert.assertTrue(createentity.VerifyCreateNewEntityDrawerHasClosed());
//        Assert.assertTrue(createentity.VerifyEntityNameisShowinginEntityTable());
//
//    }

    @Test(priority = 132)//Done
    public void WhenAdminClickSearchButtonWithouttypingAnythingFromEntityManagementPage() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchEntity searchentity= new SearchEntity(driver);
        loginPage.verifyValidLogin();
        // Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchentity.VerifPagehasRefreshafterprrssingsearchbutton());
    }

    @Test(priority = 133)//Done
    public void WhenAdminSearchtheEntitybyEntityName() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createEntity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("CompanyName")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(createEntity.VerifyEntityNameisShowinginEntityTable());
    }

    @Test(priority = 134)//Done
    public void WhenAdminSearchEntitybyEntityEmail() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.VerifCompanywiththeEnteredEmailAddressIsShowing());
    }

    @Test(priority = 135)//Done
    public void WhenAdminSearchEntitybyEntityPhoneNumber() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(searchcompany.SearchbyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.VerifCompanywiththeEnteredPhoneNumberIsShowing());
    }

    @Test(priority = 136)//Done
    public void WhenAdminSearchEntitybyEnteringInvalidEntityNameonEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("Alphabates")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchEntity.VerifNoEntityisShowingafterProvidingInvalidData());
    }

    @Test(priority = 137)//Done
    public void WhenAdminSorttheEntityNameinAscendingorderonEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromName());
    }

    @Test(priority = 138)//Done
    public void WhenAdminSorttheEntityEmailinAscendingorderonEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromName());
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromEmail());
    }

    @Test(priority = 139)//Done
    public void VerifyEntityNameisShowinginAscendingorderonEntityManagementPage() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
         Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromName());
        Assert.assertTrue(searchEntity.VerifEntityNameisSortedinAscendingOrder());

    }

    @Test(priority = 140)//Done
    public void WhenAdminVistsAnotherPageAfterApplyingAscendingorderonEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
         Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromName());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());

    }

    @Test(priority = 141)//Done
    public void WhenAdminRefreshtheBrowserAfterApplyingAscendingorderonEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromName());
        Assert.assertTrue(dashboard.refreshBrowser());
    }

    @Test(priority = 142)//Done
    public void WhenAdminUseSortingAfterPressingLoadMoreButtonFromEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(searchcompany.ClickonLoadMoreButton());
        Assert.assertTrue(searchEntity.VerifdMoreEntitiessareShowingAfterPressingLoadMoreButton());
        Assert.assertTrue(searchEntity.ClickonAscedingArrowfromName());
        Assert.assertTrue(searchEntity.WhenAdminsorttheEntitesAfterPressingLoadMoreButton());

    }

    @Test(priority = 143)//Done
    public void WhenAdminSearchEntityybyStateNameFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
    }

    @Test(priority = 144)//Done
    public void WhenAdminClicksonClearaaltagafterSelectingStateNameFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity= new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectStateFromDropDown());*/
        Assert.assertTrue(searchEntity.ClickonClearAllTag());
        Assert.assertTrue(searchEntity.VerifyEntityManagementPageHasSettoDefaultVauleafterPressingCleerAllTag());
    }

    @Test(priority = 145)//Done
    public void WhenAdminRemoveStateTagfromEntityManagementPage() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
       /* Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());*/
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        //Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
        Assert.assertTrue(searchcompany.ClickonCrosstoRemoveStateTag());
        Assert.assertTrue(searchcompany.VerifyStateTagHasbeenremoved());

    }


    @Test(priority = 146)//Done
    public void WhenAdminSearchEntitybySelectingMultipleTagsFromAdnaceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchEntity.ClickonSelectZipdropdownFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.ClickonApplyButton());
        Assert.assertTrue(searchcompany.VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter());
        Assert.assertTrue(searchcompany.VerifyZipcodeTagisShowingAfterSelectingtheZipFromAdvancedFilter());
    }


    @Test(priority = 147)//Done
    public void WhenAdminPressResetButtonAfterSelectingFilterFromAdvanceFilterDrawer() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        SearchEntity searchEntity=new SearchEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(searchcompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchEntity.ClickonSelectStateFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectAlaskaStateFromDropDown());
        Assert.assertTrue(searchEntity.ClickonSelectZipdropdownFromAdvanceFilterDrawer());
        Assert.assertTrue(searchcompany.SelectZipFromDropDown());
        Assert.assertTrue(searchcompany.ClickonResetButton());
        Assert.assertTrue(searchcompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());
    }

    @Test(priority = 148)//Done
    public void VerifyEditEntityButtonIsShowingontheEntityManagementPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(editCompany.VerifyEditButtonHasDisplayed());
    }

    @Test(priority = 149)//Done
    public void VerifyEditEntityDrawerHasDisplayedAfterClickingonEditButton() throws InterruptedException {
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

    @Test(priority = 150)//Done
    public void VerifyAuditLogsSectionIsShowingOnEditEntityDrawer() throws InterruptedException {
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

    @Test(priority = 151)//Done
    public void VerifyErrorMessageisShowingWhenAdminDoesnotProvideEntityNameOnEditCompanyDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        loginPage.verifyValidLogin();
         Assert.assertTrue(dashboard.GotoDashboard());
         Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityNameFromEditEntityDrawer());
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyEnttityNmaeErrorMessage(msg.EntityNameErrorMsg()));
    }

   @Test(priority = 152)//Done
    public void WhenAdminProvideInvalidPhoneNumberonEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEntityPhoneNumber());
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("InvalidPhone")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 153)//Done
    public void WhenAdminEnterAlphabatesinPhoneNumberonEditEntityDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 153)//Done
    public void WhenAdminEnterQuestionMarkinPhoneNumberonEditEntityDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }

    @Test(priority = 154)//Done
    public void WhenAdminEnterSpecialCharactersinPhoneNumberonEditEntityDrawer() throws InterruptedException {
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
        Assert.assertTrue(createentity.writeEntityPhoneNumber(prop.getProperty("InvalidPhone3")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyPhoneNumberErrorMessage(msg.InvalidPhoneErrorMsg()));
    }


    @Test(priority = 155)//Done
    public void WhenAdminEnterInvalidEmailOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditEntity editEntity=new EditEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editEntity.RemoveEmailFromEditEntityDrawer());
        Assert.assertTrue(company.writeCompanyEmail(prop.getProperty("invalidEmail1")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(createentity.VerifyInvalidEmailErrorMessage(msg.InvalidemailErrorMsgonCreateNewEntityDrawer()));
    }


    @Test(priority = 156)//Done
    public void WhenAdminEnterNumbersinEmailOnEditEntityDrawer() throws InterruptedException {
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

    @Test(priority = 157)//Done
    public void WhenAdminEnterAlphabatesinEmailOnEditEntityDrawer() throws InterruptedException {
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

    @Test(priority = 158)//Done
    public void WhenAdminEnterIncompleteEmailinEmailOnEditEntityDrawer() throws InterruptedException {
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

    @Test(priority = 159)//Done
    public void WhenAdminEnterSpecialCharactersinEmailOnEditEntityDrawer() throws InterruptedException {
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

    @Test(priority = 160)//Done
    public void WhenAdminEnterinvalidEmailFormatinEmailOnEditEntityDrawer() throws InterruptedException {
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

    @Test(priority = 161)//Done
    public void WhenAdminAddEmaiwithoutdotcominEmailOnEditEntityDrawer() throws InterruptedException {
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

    @Test(priority = 162)//Done
    public void WhenAdminLeavesEmailFieldBlankOnEditEntityDrawer() throws InterruptedException {
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



    @Test(priority = 163)//Done
    public void VerifyErrorMessageisShowingWhenAdminprovidesSpecialCharactersinEINNumberOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveEINFromEditCompanyDrawer());
        Assert.assertTrue(company.enterEINNumber(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(createentity.clickOnSaveButton());
        Assert.assertTrue(company.verifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 164)//Done
    public void VerifyErrorMessageisShowingWhenAdminprovidesAlphabatesinEINNumberOnEditEntityDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.verifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }

    @Test(priority = 165)//Done
    public void VerifyErrorMessageisShowingWhenAdminprovidesInvalidZipcodeOnEditEntityDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateEntity createentity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editCompany.RemoveZipcodeFromEditCompanyDrawer());
        Assert.assertTrue(company.enterZipCode(prop.getProperty("Numbers")));
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 166)//Done
    public void VerifyErrorMessageisShowingWhenAdminEnterInvalidFromatInZipcodeOnEditEntityDrawer() throws InterruptedException {
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

    @Test(priority = 167)//Done
    public void VerifyErrorMessageisShowingWhenAdminEnterZipcodewithlessthanfivedigitsOnEditEntityDrawer() throws InterruptedException {
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
        Assert.assertTrue(company.verifyInvalidZipCodeErrorMessage(msg.InvalidZipCodeErrorMsg()));
    }

    @Test(priority = 168)//Done
    public void VerifyErrorMessageisShowingWhenAdminEnterInvalidZipcodeFormatOnEditEntityDrawer() throws InterruptedException {
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

    @Test(priority = 169)//Done
    public void WhenAdminChangeInputFieldWithValidDataonEditEntityDrawer() throws InterruptedException {
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

    @Test(priority = 170)//Done
    public void VerifyUpdatedInformationsisShowingAfterUpdatingtheEntity() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createEntity = new CreateEntity(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditEntity editEntity= new EditEntity(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        /*Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());*/
        Assert.assertTrue(searchcompany.ClickonSearchbar());
        Assert.assertTrue(editCompany.SearchbyName(prop.getProperty("Entity")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(editEntity. VerifyUpdatedEntityisShowinginEntityTable());
    }

    @Test(priority = 171)//Done
    public void WhenAdminpressCancelButtonAfterChangingEntityNameFromEditCompanyDrawer() throws InterruptedException, IOException {
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
        Assert.assertTrue(createentity.VerifyCreateNewEntityButtonHasDisplayed());
    }

    @Test(priority = 172)//Done
    public void LogoutfromtheSystem() throws InterruptedException {
        Dashboard dashboard=new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.clickOnDropdownArrow());
        Assert.assertTrue(dashboard.clickOnLogout());
        Assert.assertTrue(dashboard.verifyUserHasLogoutFromTheSystem());

    }

}
