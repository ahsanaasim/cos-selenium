package tests.US198UpdateTaxAccount;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Random;

public class UpdateTaxAccountTestCases extends BaseTest {


    // Before running the script make Tax account field occupied

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckTheTitleOfThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 5000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.LedgerConfigTitle,"Ledger Configuration"));
    }
    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckTheTabsTitleOnThePage  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 4000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(4000,UpdateLedgerAccounts.LedgerAccountsTab));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,UpdateLedgerAccounts.BankAccountsTab));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxInformationTab));
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckWhichTabSystemShowsByDefault() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }
    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckDefaultTabAfterRefreshingThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckWhatHappensWhenAdminRefreshThePageFromAnyOtherTabExceptLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(3000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(3000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckFieldsUnderTaxInformationTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000, UpdateLedgerAccounts.TaxAccount));
    }


    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckWhatHappensWhenAdminClickOnSaveButtonOfBankAccountsTabAfterSelectingDataFromField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }
    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsCreated() throws InterruptedException {
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
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.NewTabOpenAndSwitchToNewTab(1);
        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,2000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,AccountName));


    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_17_26_27_28_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsDeleted() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab,5000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.DeletedAccountErrorMsg,updateLedgerAccounts.DeletedBankAccountErrorMsg()));
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeDisabled,1500);
        operation.writeInputText(UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.DropdownNoData));


    }

    @Test(priority =12)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_CheckDropdownMenuOfBankAccountWhenNameIsChangedFromZoho () throws InterruptedException {
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab,5000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeDisabled,1500);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,AccountName));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,UpdateLedgerAccounts.DropdownNoData));

//        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2500,UpdateLedgerAccounts.DropdownNoData));
    }


    @Test(priority = 13)//Done
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,1500);
        operation.clickButton(UpdateLedgerAccounts.ClearField,1500);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.EmptyBankAccErrMsg,"Account selection is required"));

    }
    @Test(priority = 14)//Done
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        Assert.assertTrue(updateLedgerAccounts.verifyCancelButtonActionAfterSelectingAnotherAccount());
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1500,UpdateLedgerAccounts.TaxAccountFeeDisabled));


    }

    @Test(priority = 15)//Done
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,UpdateLedgerAccounts.TaxAccountFeeSelectedField));


    }

    @Test(priority = 16)//Done
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,"Shipping Charge");
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,"Shipping Charge"));
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_CheckTheTitleOfThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        Thread.sleep(3000);
        loginPage.verifyValidLoginForCosAccounting();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 5000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.LedgerConfigTitle,"Ledger Configuration"));
    }
    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_32_CheckTheTabsTitleOnThePage  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 4000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(4000,UpdateLedgerAccounts.LedgerAccountsTab));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,UpdateLedgerAccounts.BankAccountsTab));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxInformationTab));
    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_34_CheckWhichTabSystemShowsByDefault() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }
    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_35_CheckDefaultTabAfterRefreshingThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_36_CheckWhatHappensWhenAdminRefreshThePageFromAnyOtherTabExceptLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(3000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(3000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_37_CheckFieldsUnderTaxInformationTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000, UpdateLedgerAccounts.TaxAccount));
    }


    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_39_CheckWhatHappensWhenAdminClickOnSaveButtonOfBankAccountsTabAfterSelectingDataFromField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_40_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_41_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }
    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_42_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsCreated() throws InterruptedException {
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
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,2000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,AccountName));


    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_35_56_57_58_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsDeleted() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab,5000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.DeletedAccountErrorMsg,updateLedgerAccounts.DeletedBankAccountErrorMsg()));
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeDisabled,1500);
        operation.writeInputText(UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.DropdownNoData));


    }

    @Test(priority =28)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_48_CheckDropdownMenuOfBankAccountWhenNameIsChangedFromZoho () throws InterruptedException {
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab,5000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeDisabled,1500);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,AccountName));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,UpdateLedgerAccounts.DropdownNoData));

//        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2500,UpdateLedgerAccounts.DropdownNoData));
    }


    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_60_CheckWhatHappensWhenAdminDoesnotSelectAnyAccountAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,1500);
        operation.clickButton(UpdateLedgerAccounts.ClearField,1500);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.EmptyBankAccErrMsg,"Account selection is required"));

    }
    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_45_46_CheckWhatHappensWhenAdminClickOnCancelButtonAfterSelectingAnAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        Assert.assertTrue(updateLedgerAccounts.verifyCancelButtonActionAfterSelectingAnotherAccount());
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1500,UpdateLedgerAccounts.ConnectFeeDisabled));


    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_46_CheckTheFieldsAfterSelectingAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,UpdateLedgerAccounts.TaxAccountFeeSelectedField));


    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_53_54_CheckWhatHappensWhenAdminChangeTheAccountFromTheDropdownAndClickOnSaveButton() throws InterruptedException {
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,"Tax Payable");
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,"Tax Payable"));
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }


    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_59_CheckTheTitleOfThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        Thread.sleep(5000);
        loginPage.verifyValidLoginForCosPropertySupport();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 5000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.LedgerConfigTitle,"Ledger Configuration"));
    }
    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_61_CheckTheTabsTitleOnThePage  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 4000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(4000,UpdateLedgerAccounts.LedgerAccountsTab));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,UpdateLedgerAccounts.BankAccountsTab));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxInformationTab));
    }

    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_62_CheckWhichTabSystemShowsByDefault() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }
    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_63_CheckDefaultTabAfterRefreshingThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_64_CheckWhatHappensWhenAdminRefreshThePageFromAnyOtherTabExceptLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(3000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(3000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }

    @Test(priority = 38)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_65_CheckFieldsUnderTaxInformationTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000, UpdateLedgerAccounts.TaxAccount));
    }


    @Test(priority = 39)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_70_CheckWhatHappensWhenAdminClickOnSaveButtonOfBankAccountsTabAfterSelectingDataFromField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }

    @Test(priority = 40)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_71_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }

    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_72_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }
    @Test(priority = 42)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_74_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsCreated() throws InterruptedException {
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
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,2000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,AccountName));


    }

    @Test(priority = 43)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_75_89_90_91_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsDeleted() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab,5000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.DeletedAccountErrorMsg,updateLedgerAccounts.DeletedBankAccountErrorMsg()));
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeDisabled,1500);
        operation.writeInputText(UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.DropdownNoData));


    }

    @Test(priority =44)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_76_CheckDropdownMenuOfBankAccountWhenNameIsChangedFromZoho () throws InterruptedException {
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab,5000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeDisabled,1500);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,AccountName));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,UpdateLedgerAccounts.DropdownNoData));

//        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2500,UpdateLedgerAccounts.DropdownNoData));
    }


    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_77_CheckWhatHappensWhenAdminDoesnotSelectAnyAccountAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,1500);
        operation.clickButton(UpdateLedgerAccounts.ClearField,1500);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.EmptyBankAccErrMsg,"Account selection is required"));

    }
    @Test(priority = 46)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_78_79_CheckWhatHappensWhenAdminClickOnCancelButtonAfterSelectingAnAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        Assert.assertTrue(updateLedgerAccounts.verifyCancelButtonActionAfterSelectingAnotherAccount());
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1500,UpdateLedgerAccounts.TaxAccountFeeDisabled));


    }

    @Test(priority = 47)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_80_CheckTheFieldsAfterSelectingAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,UpdateLedgerAccounts.TaxAccountFeeSelectedField));


    }

    @Test(priority = 48)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_81_82_CheckWhatHappensWhenAdminChangeTheAccountFromTheDropdownAndClickOnSaveButton() throws InterruptedException {
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,"Tax Payable");
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,"Tax Payable"));
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }

    @Test(priority = 49)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_88_CheckTheTitleOfThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        Thread.sleep(3000);
        loginPage.verifyValidLoginForCosDriverSupport();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 5000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.LedgerConfigTitle,"Ledger Configuration"));
    }
    @Test(priority = 50)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_90_CheckTheTabsTitleOnThePage  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 4000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(4000,UpdateLedgerAccounts.LedgerAccountsTab));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,UpdateLedgerAccounts.BankAccountsTab));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxInformationTab));
    }

    @Test(priority = 51)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_91_CheckWhichTabSystemShowsByDefault() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }
    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_92_CheckDefaultTabAfterRefreshingThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }

    @Test(priority = 53)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_93_CheckWhatHappensWhenAdminRefreshThePageFromAnyOtherTabExceptLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(3000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(3000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }

    @Test(priority = 54)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_94_CheckFieldsUnderTaxInformationTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000, UpdateLedgerAccounts.TaxAccount));
    }


    @Test(priority = 55)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_99_CheckWhatHappensWhenAdminClickOnSaveButtonOfBankAccountsTabAfterSelectingDataFromField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }

    @Test(priority = 56)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_100_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }

    @Test(priority = 57)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_101_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }
    @Test(priority = 58)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_103_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsCreated() throws InterruptedException {
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
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,2000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,AccountName));


    }

    @Test(priority = 59)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_104_105_106_107_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsDeleted() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab,5000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.DeletedAccountErrorMsg,updateLedgerAccounts.DeletedBankAccountErrorMsg()));
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeDisabled,1500);
        operation.writeInputText(UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.DropdownNoData));


    }

    @Test(priority =60)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_108_CheckDropdownMenuOfBankAccountWhenNameIsChangedFromZoho () throws InterruptedException {
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab,5000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeDisabled,1500);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,AccountName));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,UpdateLedgerAccounts.DropdownNoData));

//        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2500,UpdateLedgerAccounts.DropdownNoData));
    }


    @Test(priority = 61)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_109_CheckWhatHappensWhenAdminDoesnotSelectAnyAccountAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,1500);
        operation.clickButton(UpdateLedgerAccounts.ClearField,1500);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.EmptyBankAccErrMsg,"Account selection is required"));

    }
    @Test(priority = 62)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_110_111_CheckWhatHappensWhenAdminClickOnCancelButtonAfterSelectingAnAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        Assert.assertTrue(updateLedgerAccounts.verifyCancelButtonActionAfterSelectingAnotherAccount());
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1500,UpdateLedgerAccounts.ConnectFeeDisabled));


    }

    @Test(priority = 63)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_112_CheckTheFieldsAfterSelectingAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,UpdateLedgerAccounts.TaxAccountFeeSelectedField));


    }

    @Test(priority = 64)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_113_114_CheckWhatHappensWhenAdminChangeTheAccountFromTheDropdownAndClickOnSaveButton() throws InterruptedException {
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,"Prepaid Expenses");
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,"Prepaid Expenses"));
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }

    @Test(priority = 65)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_117_CheckTheTitleOfThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        Thread.sleep(3000);
        loginPage.verifyValidLoginForCosTechSupport();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 5000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.LedgerConfigTitle,"Ledger Configuration"));
    }
    @Test(priority = 66)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_119_CheckTheTabsTitleOnThePage  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 4000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(4000,UpdateLedgerAccounts.LedgerAccountsTab));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,UpdateLedgerAccounts.BankAccountsTab));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxInformationTab));
    }

    @Test(priority = 67)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_120_CheckWhichTabSystemShowsByDefault() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }
    @Test(priority = 68)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_121_CheckDefaultTabAfterRefreshingThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }

    @Test(priority = 69)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_121_CheckWhatHappensWhenAdminRefreshThePageFromAnyOtherTabExceptLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab, 2000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(3000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        dashboard.refreshBrowser();
        Assert.assertTrue(basePage.verifyTextMatching(3000,UpdateLedgerAccounts.ActivatedTab,"Ledger Accounts"));

    }

    @Test(priority = 70)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_122_CheckFieldsUnderTaxInformationTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000, UpdateLedgerAccounts.TaxAccount));
    }


    @Test(priority = 71)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_127_CheckWhatHappensWhenAdminClickOnSaveButtonOfBankAccountsTabAfterSelectingDataFromField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }

    @Test(priority = 72)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_128_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton, 2500);
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }

    @Test(priority = 73)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_129_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.TaxAccountEditButton));
    }
    @Test(priority = 74)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_131_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsCreated() throws InterruptedException {
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
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        createCharger.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,2000);
        createCharger.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,2000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,AccountName));


    }

    @Test(priority = 75)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_132_133_134_135_CheckDropdownMenuOfBankAccountWhenANewBankAccountIsDeleted() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab,5000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.DeletedAccountErrorMsg,updateLedgerAccounts.DeletedBankAccountErrorMsg()));
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeDisabled,1500);
        operation.writeInputText(UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.DropdownNoData));


    }

    @Test(priority =76)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_136_CheckDropdownMenuOfBankAccountWhenNameIsChangedFromZoho () throws InterruptedException {
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        basePage.SwitchToTab(1);
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
        basePage.SwitchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab,5000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeDisabled,1500);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,AccountName);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,AccountName));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,UpdateLedgerAccounts.DropdownNoData));

//        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.ConnectFeeDisabled,AccountName);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2500,UpdateLedgerAccounts.DropdownNoData));
    }


    @Test(priority = 77)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_137_CheckWhatHappensWhenAdminDoesnotSelectAnyAccountAndClickOnSaveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,1500);
        operation.clickButton(UpdateLedgerAccounts.ClearField,1500);
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,UpdateLedgerAccounts.EmptyBankAccErrMsg,"Account selection is required"));

    }
    @Test(priority = 78)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_138_139_CheckWhatHappensWhenAdminClickOnCancelButtonAfterSelectingAnAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        Assert.assertTrue(updateLedgerAccounts.verifyCancelButtonActionAfterSelectingAnotherAccount());
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1500,UpdateLedgerAccounts.ConnectFeeDisabled));


    }

    @Test(priority = 79)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_140_CheckTheFieldsAfterSelectingAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        operation.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,UpdateLedgerAccounts.TaxAccountFeeSelectedField));


    }

    @Test(priority = 80)//Done
    @TestParameters(testCaseId = {"TC-141,142"})
    public void TC_141_142_CheckWhatHappensWhenAdminChangeTheAccountFromTheDropdownAndClickOnSaveButton() throws InterruptedException {
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
        operation.clickButton(UpdateLedgerAccounts.TaxInformationTab, 2000);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountEditButton,1500);
        operation.clickButton(UpdateLedgerAccounts.TaxAccountFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TaxAccountFeeDisabled,"Sales");
        operation.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TaxAccountFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TaxAccountFeeSelectedField,"Sales"));
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }





}