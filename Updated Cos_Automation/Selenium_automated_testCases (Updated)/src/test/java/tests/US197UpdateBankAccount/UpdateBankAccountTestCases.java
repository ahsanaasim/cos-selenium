package tests.US197UpdateBankAccount;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Random;

public class UpdateBankAccountTestCases extends BaseTest {

    // Before running the script make Bank account field occupied
    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckFieldsUnderBankAccountTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000, UpdateLedgerAccounts.BankAccount));
    }


    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckWhatHappensWhenAdminClickOnSaveButtonOfBankAccountsTabAfterSelectingDataFromField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsCreated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        Random objGenerator = new Random();
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        basePage.newTabOpenAndSwitchToNewTab(1);
        basePage.goToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
        createCharger.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
        createCharger.clickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
        createCharger.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
        createCharger.clickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
        createCharger.clickButton(UpdateLedgerAccounts.AccountantTab,3000);
        createCharger.clickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
        createCharger.clickButton(UpdateLedgerAccounts.CreateAccountZoho,3000);
        int randomNumber = objGenerator.nextInt(100);
        System.out.println(randomNumber);
        String AccountName="Temporary Account "+randomNumber;
        createCharger.writeInputText(UpdateLedgerAccounts.CreateAccountZohoAccountName,AccountName,2000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButtonZoho,1000);
        basePage.switchToTab(0);
        dashboard.refreshBrowser();
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,2000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,AccountName));


    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_20_21_22_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsDeleted() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        basePage.switchToTab(1);
//        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
//        operation.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        operation.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        operation.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
//        operation.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
        updateLedgerAccounts.SearchAccountInZoho("Temporary");
        Thread.sleep(4000);
        String AccountName = driver.findElement(UpdateLedgerAccounts.ZohoSearchResult).getText();
        operation.clickButton(UpdateLedgerAccounts.ZohoSearchResult,3000);
        operation.clickButton(UpdateLedgerAccounts.MoreButtonZoho,2500);
        operation.clickButton(UpdateLedgerAccounts.DeleteButtonZoho,1000);
        operation.clickButton(UpdateLedgerAccounts.OKButtonZoho,1500);
        basePage.switchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab,5000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.DeletedAccountErrorMsg,updateLedgerAccounts.DeletedBankAccountErrorMsg()));
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.ConnectFeeDisabled,1500);
        operation.writeInputText(UpdateLedgerAccounts.ConnectFeeDisabled,AccountName,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.DropdownNoData));


    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CheckDropdownMenuOfBankAccountWhenNameIsChangedFromZoho () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        basePage.switchToTab(1);
//        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
//        operation.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        operation.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        operation.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
//        operation.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
        updateLedgerAccounts.SearchAccountInZoho("Nice");
        operation.clickButton(UpdateLedgerAccounts.ZohoSearchResult,3000);
        operation.clickButton(UpdateLedgerAccounts.EditButtonZoho,1000);
        customerSignUp.fieldClear(UpdateLedgerAccounts.CreateAccountZohoAccountName);
        String AccountName = updateLedgerAccounts.RandomAccountName();
        operation.writeInputText(UpdateLedgerAccounts.CreateAccountZohoAccountName,AccountName,2000);
        operation.clickButton(UpdateLedgerAccounts.SaveButtonZoho,1000);
        basePage.switchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab,5000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.ConnectFeeDisabled,1500);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,AccountName));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,UpdateLedgerAccounts.DropdownNoData));

//        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2500,UpdateLedgerAccounts.DropdownNoData));
    }


    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckWhatHappensWhenAdminDoesnotSelectAnyAccountAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,1500);
        operation.clickButton(UpdateLedgerAccounts.ClearField,1500);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.EmptyBankAccErrMsg,"Account selection is required"));

    }
    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_13_14_CheckWhatHappensWhenAdminClickOnCancelButtonAfterSelectingAnAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        Assert.assertTrue(updateLedgerAccounts.verifyCancelButtonActionAfterSelectingAnotherAccount());
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1500,UpdateLedgerAccounts.ConnectFeeDisabled));


    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckTheFieldsAfterSelectingAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,UpdateLedgerAccounts.BankAccountFeeSelectedField));


    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_17_18_CheckWhatHappensWhenAdminChangeTheAccountFromTheDropdownAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        Random objGenerator = new Random();
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,"Petty Cash");
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,"Petty Cash"));
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }



    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckFieldsUnderBankAccountTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        Thread.sleep(4000);
        loginPage.verifyValidLoginForCosAccounting();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000, UpdateLedgerAccounts.BankAccount));
    }


    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_29_CheckWhatHappensWhenAdminClickOnSaveButtonOfBankAccountsTabAfterSelectingDataFromField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_30_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_31_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_33_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsCreated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        Random objGenerator = new Random();
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        basePage.switchToTab(1);
        dashboard.refreshBrowser();
//        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
//        createCharger.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        createCharger.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
        createCharger.clickButton(UpdateLedgerAccounts.CreateAccountZoho,3000);
        int randomNumber = objGenerator.nextInt(100);
        System.out.println(randomNumber);
        String AccountName="Temporary Account "+randomNumber;
        createCharger.writeInputText(UpdateLedgerAccounts.CreateAccountZohoAccountName,AccountName,2000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButtonZoho,1000);
        basePage.switchToTab(0);
        dashboard.refreshBrowser();
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,5000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,AccountName));


    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-11,43,44,45"})
    public void TC_34_43_44_45_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsDeleted() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        basePage.switchToTab(1);
//        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
//        operation.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        operation.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        operation.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
//        operation.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
        updateLedgerAccounts.SearchAccountInZoho("Temporary");
        Thread.sleep(4000);
        String AccountName = driver.findElement(UpdateLedgerAccounts.ZohoSearchResult).getText();
        operation.clickButton(UpdateLedgerAccounts.ZohoSearchResult,3000);
        operation.clickButton(UpdateLedgerAccounts.MoreButtonZoho,2500);
        operation.clickButton(UpdateLedgerAccounts.DeleteButtonZoho,1000);
        operation.clickButton(UpdateLedgerAccounts.OKButtonZoho,1500);
        basePage.switchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab,5000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.DeletedAccountErrorMsg,updateLedgerAccounts.DeletedBankAccountErrorMsg()));
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.ConnectFeeDisabled,1500);
        operation.writeInputText(UpdateLedgerAccounts.ConnectFeeDisabled,AccountName,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.DropdownNoData));


    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_CheckDropdownMenuOfBankAccountWhenNameIsChangedFromZoho () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        basePage.switchToTab(1);
//        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
//        operation.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        operation.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        operation.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
//        operation.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
        updateLedgerAccounts.SearchAccountInZoho("Nice");
        operation.clickButton(UpdateLedgerAccounts.ZohoSearchResult,3000);
        operation.clickButton(UpdateLedgerAccounts.EditButtonZoho,1000);
        customerSignUp.fieldClear(UpdateLedgerAccounts.CreateAccountZohoAccountName);
        String AccountName = updateLedgerAccounts.RandomAccountName();
        operation.writeInputText(UpdateLedgerAccounts.CreateAccountZohoAccountName,AccountName,2000);
        operation.clickButton(UpdateLedgerAccounts.SaveButtonZoho,1000);
        basePage.switchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab,5000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.ConnectFeeDisabled,1500);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,AccountName));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,UpdateLedgerAccounts.DropdownNoData));

//        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2500,UpdateLedgerAccounts.DropdownNoData));
    }


    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_35_CheckWhatHappensWhenAdminDoesNotSelectAnyAccountAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,1500);
        operation.clickButton(UpdateLedgerAccounts.ClearField,1500);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.EmptyBankAccErrMsg,"Account selection is required"));



    }
    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-32,33"})
    public void TC_36_37_CheckWhatHappensWhenAdminClickOnCancelButtonAfterSelectingAnAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        Assert.assertTrue(updateLedgerAccounts.verifyCancelButtonActionAfterSelectingAnotherAccount());
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1500,UpdateLedgerAccounts.ConnectFeeDisabled));


    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_39_CheckTheFieldsAfterSelectingAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,UpdateLedgerAccounts.BankAccountFeeSelectedField));


    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-35,36"})
    public void TC_40_41_CheckWhatHappensWhenAdminChangeTheAccountFromTheDropdownAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        Random objGenerator = new Random();
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,"Accounts Receivable");
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,"Accounts Receivable"));
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_47_CheckFieldsUnderBankAccountTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        Thread.sleep(4000);
        loginPage.verifyValidLoginForCosPropertySupport();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000, UpdateLedgerAccounts.BankAccount));
    }


    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_CheckWhatHappensWhenAdminClickOnSaveButtonOfBankAccountsTabAfterSelectingDataFromField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_43_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_44_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_56_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsCreated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        Random objGenerator = new Random();
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        basePage.switchToTab(1);
        dashboard.refreshBrowser();
//        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
//        createCharger.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        createCharger.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
        createCharger.clickButton(UpdateLedgerAccounts.CreateAccountZoho,3000);
        int randomNumber = objGenerator.nextInt(100);
        System.out.println(randomNumber);
        String AccountName="Temporary Account "+randomNumber;
        createCharger.writeInputText(UpdateLedgerAccounts.CreateAccountZohoAccountName,AccountName,2000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButtonZoho,1000);
        basePage.switchToTab(0);
        dashboard.refreshBrowser();
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,5000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,AccountName));


    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-57,66,67,68"})
    public void TC_57_66_67_68_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsDeleted() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        basePage.switchToTab(1);
//        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
//        operation.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        operation.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        operation.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
//        operation.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
        updateLedgerAccounts.SearchAccountInZoho("Temporary");
        Thread.sleep(4000);
        String AccountName = driver.findElement(UpdateLedgerAccounts.ZohoSearchResult).getText();
        operation.clickButton(UpdateLedgerAccounts.ZohoSearchResult,3000);
        operation.clickButton(UpdateLedgerAccounts.MoreButtonZoho,2500);
        operation.clickButton(UpdateLedgerAccounts.DeleteButtonZoho,1000);
        operation.clickButton(UpdateLedgerAccounts.OKButtonZoho,1500);
        basePage.switchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab,5000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.DeletedAccountErrorMsg,updateLedgerAccounts.DeletedBankAccountErrorMsg()));
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.ConnectFeeDisabled,1500);
        operation.writeInputText(UpdateLedgerAccounts.ConnectFeeDisabled,AccountName,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.DropdownNoData));


    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-69"})
    public void TC_69_CheckDropdownMenuOfBankAccountWhenNameIsChangedFromZoho () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        basePage.switchToTab(1);
//        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
//        operation.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        operation.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        operation.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
//        operation.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
        updateLedgerAccounts.SearchAccountInZoho("Nice");
        operation.clickButton(UpdateLedgerAccounts.ZohoSearchResult,3000);
        operation.clickButton(UpdateLedgerAccounts.EditButtonZoho,1000);
        customerSignUp.fieldClear(UpdateLedgerAccounts.CreateAccountZohoAccountName);
        String AccountName = updateLedgerAccounts.RandomAccountName();
        operation.writeInputText(UpdateLedgerAccounts.CreateAccountZohoAccountName,AccountName,2000);
        operation.clickButton(UpdateLedgerAccounts.SaveButtonZoho,1000);
        basePage.switchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab,5000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.ConnectFeeDisabled,1500);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,AccountName));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,UpdateLedgerAccounts.DropdownNoData));

//        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2500,UpdateLedgerAccounts.DropdownNoData));
    }
    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_CheckWhatHappensWhenAdminDoesnotSelectAnyAccountAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,1500);
        operation.clickButton(UpdateLedgerAccounts.ClearField,1500);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.EmptyBankAccErrMsg,"Account selection is required"));



    }
    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-48,49"})
    public void TC_48_49_CheckWhatHappensWhenAdminClickOnCancelButtonAfterSelectingAnAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        Assert.assertTrue(updateLedgerAccounts.verifyCancelButtonActionAfterSelectingAnotherAccount());
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1500,UpdateLedgerAccounts.ConnectFeeDisabled));


    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-50"})
    public void TC_50_CheckTheFieldsAfterSelectingAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,UpdateLedgerAccounts.BankAccountFeeSelectedField));


    }

    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-35,36"})
    public void TC_51_52_CheckWhatHappensWhenAdminChangeTheAccountFromTheDropdownAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        Random objGenerator = new Random();
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,"Unearned Revenue");
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,"Unearned Revenue"));
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_57_CheckFieldsUnderBankAccountTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        Thread.sleep(4000);
        loginPage.verifyValidLoginForCosDriverSupport();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000, UpdateLedgerAccounts.BankAccount));
    }


    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_59_CheckWhatHappensWhenAdminClickOnSaveButtonOfBankAccountsTabAfterSelectingDataFromField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_60_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_61_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    //    @Test(priority = 6)//Done
//    @TestParameters(testCaseId = {"TC-10"})
//    public void TC_10_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsCreated() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        Random objGenerator = new Random();
//        CreateCharger createCharger = new CreateCharger(driver);
//        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
//        basePage.NewTabOpenAndSwitchToNewTab(1);
//        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
//        createCharger.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        createCharger.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.CreateAccountZoho,3000);
//        int randomNumber = objGenerator.nextInt(100);
//        System.out.println(randomNumber);
//        String AccountName="Nice Savings "+randomNumber;
//        createCharger.writeInputText(UpdateLedgerAccounts.CreateAccountZohoAccountName,AccountName,2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.SaveButtonZoho,1000);
//        basePage.SwitchToTab(0);
//        dashboard.RefreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ConnectBankEditButton,5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,3000);
//        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
//        Assert.assertTrue(createCharger.ClickButton(UpdateLedgerAccounts.SaveButton,3000));
//        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,AccountName));
//
//
//    }
//
//    @Test(priority = 7)//Done
//    @TestParameters(testCaseId = {"TC-11"})
//    public void TC_11_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsCreated() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
//        operation.ClickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
//        basePage.NewTabOpenAndSwitchToNewTab(1);
//        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
//        operation.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        operation.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        operation.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
//        operation.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
//        updateLedgerAccounts.SearchAccountInZoho("Expensive Account");
//        Thread.sleep(4000);
//        String AccountName = driver.findElement(UpdateLedgerAccounts.ZohoSearchResult).getText();
//        operation.ClickButton(UpdateLedgerAccounts.ZohoSearchResult,3000);
//        operation.ClickButton(UpdateLedgerAccounts.MoreButtonZoho,2500);
//        operation.ClickButton(UpdateLedgerAccounts.DeleteButtonZoho,1000);
//        operation.ClickButton(UpdateLedgerAccounts.OKButtonZoho,1500);
//        basePage.SwitchToTab(0);
//        dashboard.RefreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.BankAccountsTab,5000);
//        operation.ClickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
//        operation.ClickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,1500);
//        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2500,UpdateLedgerAccounts.DropdownNoData));
//
//
//    }
    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-62"})
    public void TC_62_CheckWhatHappensWhenAdminDoesnotSelectAnyAccountAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,1500);
        operation.clickButton(UpdateLedgerAccounts.ClearField,1500);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.EmptyBankAccErrMsg,"Account selection is required"));



    }
    @Test(priority = 42)//Done
    @TestParameters(testCaseId = {"TC-32,33"})
    public void TC_63_64_CheckWhatHappensWhenAdminClickOnCancelButtonAfterSelectingAnAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        Assert.assertTrue(updateLedgerAccounts.verifyCancelButtonActionAfterSelectingAnotherAccount());
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1500,UpdateLedgerAccounts.ConnectFeeDisabled));


    }

    @Test(priority = 43)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_65_CheckTheFieldsAfterSelectingAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,UpdateLedgerAccounts.BankAccountFeeSelectedField));


    }

    @Test(priority = 44)//Done
    @TestParameters(testCaseId = {"TC-35,36"})
    public void TC_66_67_CheckWhatHappensWhenAdminChangeTheAccountFromTheDropdownAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        Random objGenerator = new Random();
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,"Bad Debt");
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,"Bad Debt"));
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }

    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-72"})
    public void TC_72_CheckFieldsUnderBankAccountTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        Thread.sleep(4000);
        loginPage.verifyValidLoginForCosTechSupport();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab,2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000, UpdateLedgerAccounts.BankAccount));
    }



    @Test(priority = 46)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_74_CheckWhatHappensWhenAdminClickOnSaveButtonOfBankAccountsTabAfterSelectingDataFromField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    @Test(priority = 47)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_75_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 48)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_76_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    //    @Test(priority = 6)//Done
//    @TestParameters(testCaseId = {"TC-10"})
//    public void TC_10_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsCreated() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        Random objGenerator = new Random();
//        CreateCharger createCharger = new CreateCharger(driver);
//        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
//        basePage.NewTabOpenAndSwitchToNewTab(1);
//        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
//        createCharger.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        createCharger.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.CreateAccountZoho,3000);
//        int randomNumber = objGenerator.nextInt(100);
//        System.out.println(randomNumber);
//        String AccountName="Nice Savings "+randomNumber;
//        createCharger.writeInputText(UpdateLedgerAccounts.CreateAccountZohoAccountName,AccountName,2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.SaveButtonZoho,1000);
//        basePage.SwitchToTab(0);
//        dashboard.RefreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ConnectBankEditButton,5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,3000);
//        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
//        Assert.assertTrue(createCharger.ClickButton(UpdateLedgerAccounts.SaveButton,3000));
//        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,AccountName));
//
//
//    }
//
//    @Test(priority = 7)//Done
//    @TestParameters(testCaseId = {"TC-11"})
//    public void TC_11_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsCreated() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
//        operation.ClickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
//        basePage.NewTabOpenAndSwitchToNewTab(1);
//        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
//        operation.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
//        operation.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
//        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
//        operation.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
//        operation.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
//        updateLedgerAccounts.SearchAccountInZoho("Expensive Account");
//        Thread.sleep(4000);
//        String AccountName = driver.findElement(UpdateLedgerAccounts.ZohoSearchResult).getText();
//        operation.ClickButton(UpdateLedgerAccounts.ZohoSearchResult,3000);
//        operation.ClickButton(UpdateLedgerAccounts.MoreButtonZoho,2500);
//        operation.ClickButton(UpdateLedgerAccounts.DeleteButtonZoho,1000);
//        operation.ClickButton(UpdateLedgerAccounts.OKButtonZoho,1500);
//        basePage.SwitchToTab(0);
//        dashboard.RefreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.BankAccountsTab,5000);
//        operation.ClickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
//        operation.ClickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,1500);
//        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2500,UpdateLedgerAccounts.DropdownNoData));
//
//
//    }
    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_79_CheckWhatHappensWhenAdminDoesnotSelectAnyAccountAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,1500);
        operation.clickButton(UpdateLedgerAccounts.ClearField,1500);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.EmptyBankAccErrMsg,"Account selection is required"));



    }
    @Test(priority = 53)//Done
    @TestParameters(testCaseId = {"TC-105,106"})
    public void TC_105_106_CheckWhatHappensWhenAdminClickOnCancelButtonAfterSelectingAnAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        Assert.assertTrue(updateLedgerAccounts.verifyCancelButtonActionAfterSelectingAnotherAccount());
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1500,UpdateLedgerAccounts.ConnectFeeDisabled));


    }

    @Test(priority = 54)//Done
    @TestParameters(testCaseId = {"TC-108"})
    public void TC_108_CheckTheFieldsAfterSelectingAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,UpdateLedgerAccounts.BankAccountFeeSelectedField));


    }

    @Test(priority = 55)//Done
    @TestParameters(testCaseId = {"TC-109,110"})
    public void TC_109_110_CheckWhatHappensWhenAdminChangeTheAccountFromTheDropdownAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        Random objGenerator = new Random();
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.ConnectBankEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.BankAccountFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,"Accounts Receivable");
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.BankAccountFeeSelectedField,"Accounts Receivable"));
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }



}
