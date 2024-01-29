package tests.US196UpdateLedgerAccounts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class UpdateLedgerAccountTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();

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
    public void TC_7_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,UpdateLedgerAccounts.EquipmentFee));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(100,UpdateLedgerAccounts.InstallationFee));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(100,UpdateLedgerAccounts.TransactionFee));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(100,UpdateLedgerAccounts.UtilizationFee));

    }

//    @Test(priority = 7)//Done
//    @TestParameters(testCaseId = {"TC-8"})
//    public void TC_8_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
////        loginPage.VerifyValidLogin();
////        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
////        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
//        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.EquipmentFeeSelectField,"Select"));
//        Assert.assertTrue(basePage.verifyTextMatching(100,UpdateLedgerAccounts.InstallationFeeSelectField,"Select"));
//        Assert.assertTrue(basePage.verifyTextMatching(100,UpdateLedgerAccounts.TransactionFeeSelectField,"Select"));
//        Assert.assertTrue(basePage.verifyTextMatching(100,UpdateLedgerAccounts.UtilizationFeeSelectField,"Select"));
//
//    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-9,10,11,12"})
    public void TC_9_10_11_12_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(3000,UpdateLedgerAccounts.EquipmentFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(200,UpdateLedgerAccounts.InstallationFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(200,UpdateLedgerAccounts.TransactionFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(200,UpdateLedgerAccounts.UtilizationFeeDisabled));

    }
    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckTheEditButtonByDefaultOnThisPage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.EditButton));


    }
    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckWhatHappensWhenAdminClickOnEditButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.CancelButton));


    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(3000,UpdateLedgerAccounts.EquipmentFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(100, UpdateLedgerAccounts.InstallationFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(100, UpdateLedgerAccounts.TransactionFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(100, UpdateLedgerAccounts.UtilizationFeeDisabled));
    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.EditButton));
    }
    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.EditButton));
    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckFieldsUnderBankAccountTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.BankAccount));
    }
    //    @Test(priority = 15)//Done
//    @TestParameters(testCaseId = {"TC-19"})
//    public void TC_19_CheckPlaceholderWhenNoDataIsSelectedInTheFields() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
////        loginPage.VerifyValidLogin();
////        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
////        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
////        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
//        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.ConnectBankSelectField,"Select"));
//    }
    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-20,21"})
    public void TC_20_21_CheckPlaceholderWhenNoDataIsSelectedInTheFields() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckWhatHappensWhenAdminClickOnEditButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.CancelButton));

    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CheckWhatHappensWhenAdminClickOnEditButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        Assert.assertTrue(basePage.verifyAFieldIsEnable(3000,UpdateLedgerAccounts.ConnectFeeDisabled));

    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_CheckWhatHappensWhenAdminClicksOnSaveButton  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_CheckTheFieldsUnderTaxInformationTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_62_63_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.EquipmentFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.EquipmentFeeDisabled,"Employee Advance");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.EquipmentFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.EquipmentFeeSelectedField,"Employee Advance"));


    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_62_63_2_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.InstallationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.InstallationFeeDisabled,"Prepaid Expenses");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.InstallationFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.InstallationFeeSelectedField,"Prepaid Expenses"));


    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_62_63_3_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.TransactionFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TransactionFeeDisabled,"Accounts Receivable");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TransactionFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TransactionFeeSelectedField,"Accounts Receivable"));


    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_62_63_4_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.UtilizationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.UtilizationFeeDisabled,"Sales");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.UtilizationFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.UtilizationFeeSelectedField,"Sales"));
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_68_CheckTheTitleOfThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        Thread.sleep(3000);
        loginPage.verifyValidLoginForCosPropertySupport();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 5000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.LedgerConfigTitle,"Ledger Configuration"));
    }
    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_70_CheckTheTabsTitleOnThePage  () throws InterruptedException {
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

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_71_CheckWhichTabSystemShowsByDefault() throws InterruptedException {
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
    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_72_CheckDefaultTabAfterRefreshingThePage () throws InterruptedException {
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

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_73_CheckWhatHappensWhenAdminRefreshThePageFromAnyOtherTabExceptLedgerAccountTab () throws InterruptedException {
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

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_74_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,UpdateLedgerAccounts.EquipmentFee));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(100,UpdateLedgerAccounts.InstallationFee));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(100,UpdateLedgerAccounts.TransactionFee));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(100,UpdateLedgerAccounts.UtilizationFee));

    }

//    @Test(priority = 7)//Done
//    @TestParameters(testCaseId = {"TC-8"})
//    public void TC_8_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
////        loginPage.VerifyValidLogin();
////        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
////        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
//        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.EquipmentFeeSelectField,"Select"));
//        Assert.assertTrue(basePage.verifyTextMatching(100,UpdateLedgerAccounts.InstallationFeeSelectField,"Select"));
//        Assert.assertTrue(basePage.verifyTextMatching(100,UpdateLedgerAccounts.TransactionFeeSelectField,"Select"));
//        Assert.assertTrue(basePage.verifyTextMatching(100,UpdateLedgerAccounts.UtilizationFeeSelectField,"Select"));
//
//    }

    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-9,10,11,12"})
    public void TC_75_76_77_78_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(3000,UpdateLedgerAccounts.EquipmentFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(100,UpdateLedgerAccounts.InstallationFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(100,UpdateLedgerAccounts.TransactionFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(100,UpdateLedgerAccounts.UtilizationFeeDisabled));

    }
    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_79_CheckTheEditButtonByDefaultOnThisPage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.EditButton));


    }
    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_80_CheckWhatHappensWhenAdminClickOnEditButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.CancelButton));


    }

    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_81_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(3000,UpdateLedgerAccounts.EquipmentFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(100, UpdateLedgerAccounts.InstallationFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(100, UpdateLedgerAccounts.TransactionFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(100, UpdateLedgerAccounts.UtilizationFeeDisabled));
    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_82_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.EditButton));
    }
    @Test(priority = 38)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_83_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.EditButton));
    }

    @Test(priority = 39)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_84_CheckFieldsUnderBankAccountTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.BankAccount));
    }
    //    @Test(priority = 15)//Done
//    @TestParameters(testCaseId = {"TC-19"})
//    public void TC_19_CheckPlaceholderWhenNoDataIsSelectedInTheFields() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
////        loginPage.VerifyValidLogin();
////        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
////        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
////        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
//        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.ConnectBankSelectField,"Select"));
//    }
    @Test(priority = 40)//Done
    @TestParameters(testCaseId = {"TC-20,21"})
    public void TC_85_86_CheckPlaceholderWhenNoDataIsSelectedInTheFields() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_87_CheckWhatHappensWhenAdminClickOnEditButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.CancelButton));

    }

    @Test(priority = 42)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_88_CheckWhatHappensWhenAdminClickOnEditButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        Assert.assertTrue(basePage.verifyAFieldIsEnable(3000,UpdateLedgerAccounts.ConnectFeeDisabled));

    }

    @Test(priority = 43)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_89_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 44)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_90_CheckWhatHappensWhenAdminClicksOnSaveButton  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_91_CheckTheFieldsUnderTaxInformationTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 46)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_110_111_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.EquipmentFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.EquipmentFeeDisabled,"Petty Cash");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.EquipmentFeeDisabled);
        basePage.verifyTextMatching(2000,UpdateLedgerAccounts.EquipmentFeeSelectedField,"Petty Cash");


    }

    @Test(priority = 47)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_110_111_2_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.InstallationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.InstallationFeeDisabled,"Bad Debt");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.InstallationFeeDisabled);
        basePage.verifyTextMatching(2000,UpdateLedgerAccounts.InstallationFeeSelectedField,"Bad Debt");


    }

    @Test(priority = 48)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_110_111_3_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.TransactionFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TransactionFeeDisabled,"Retained Earnings");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TransactionFeeDisabled);
        basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TransactionFeeSelectedField,"Retained Earnings");


    }

    @Test(priority = 49)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_110_111_4_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.UtilizationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.UtilizationFeeDisabled,"Inventory Asset");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.UtilizationFeeDisabled);
        basePage.verifyTextMatching(2000,UpdateLedgerAccounts.UtilizationFeeSelectedField,"Inventory Asset");
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }

    @Test(priority = 50)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_114_CheckTheTitleOfThePage () throws InterruptedException {
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
    @Test(priority = 51)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_115_CheckTheTabsTitleOnThePage  () throws InterruptedException {
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

    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_116_CheckWhichTabSystemShowsByDefault() throws InterruptedException {
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
    @Test(priority = 53)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_117_CheckDefaultTabAfterRefreshingThePage () throws InterruptedException {
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

    @Test(priority = 54)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_118_CheckWhatHappensWhenAdminRefreshThePageFromAnyOtherTabExceptLedgerAccountTab () throws InterruptedException {
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

    @Test(priority = 55)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_119_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,UpdateLedgerAccounts.EquipmentFee));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(100,UpdateLedgerAccounts.InstallationFee));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(100,UpdateLedgerAccounts.TransactionFee));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(100,UpdateLedgerAccounts.UtilizationFee));

    }

//    @Test(priority = 7)//Done
//    @TestParameters(testCaseId = {"TC-8"})
//    public void TC_8_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
////        loginPage.VerifyValidLogin();
////        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
////        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
//        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.EquipmentFeeSelectField,"Select"));
//        Assert.assertTrue(basePage.verifyTextMatching(100,UpdateLedgerAccounts.InstallationFeeSelectField,"Select"));
//        Assert.assertTrue(basePage.verifyTextMatching(100,UpdateLedgerAccounts.TransactionFeeSelectField,"Select"));
//        Assert.assertTrue(basePage.verifyTextMatching(100,UpdateLedgerAccounts.UtilizationFeeSelectField,"Select"));
//
//    }

    @Test(priority = 56)//Done
    @TestParameters(testCaseId = {"TC-9,10,11,12"})
    public void TC_120_121_122_123_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(3000,UpdateLedgerAccounts.EquipmentFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(100,UpdateLedgerAccounts.InstallationFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(100,UpdateLedgerAccounts.TransactionFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(100,UpdateLedgerAccounts.UtilizationFeeDisabled));

    }
    @Test(priority = 57)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_124_CheckTheEditButtonByDefaultOnThisPage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.EditButton));


    }
    @Test(priority = 58)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_125_CheckWhatHappensWhenAdminClickOnEditButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.CancelButton));


    }

    @Test(priority = 59)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_126_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(3000,UpdateLedgerAccounts.EquipmentFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(100, UpdateLedgerAccounts.InstallationFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(100, UpdateLedgerAccounts.TransactionFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(100, UpdateLedgerAccounts.UtilizationFeeDisabled));
    }

    @Test(priority = 60)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_127_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosDriverSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.EditButton));
    }
    @Test(priority = 61)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_128_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosDriverSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.EditButton));
    }

    @Test(priority = 62)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_129_CheckFieldsUnderBankAccountTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosDriverSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.BankAccount));
    }
    //    @Test(priority = 15)//Done
//    @TestParameters(testCaseId = {"TC-19"})
//    public void TC_19_CheckPlaceholderWhenNoDataIsSelectedInTheFields() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
////        loginPage.VerifyValidLogin();
////        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
////        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
////        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
//        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.ConnectBankSelectField,"Select"));
//    }
    @Test(priority = 63)//Done
    @TestParameters(testCaseId = {"TC-20,21"})
    public void TC_130_131_CheckPlaceholderWhenNoDataIsSelectedInTheFields() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    @Test(priority = 64)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_132_CheckWhatHappensWhenAdminClickOnEditButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosDriverSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.CancelButton));

    }

    @Test(priority = 65)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_133_CheckWhatHappensWhenAdminClickOnEditButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosDriverSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        Assert.assertTrue(basePage.verifyAFieldIsEnable(3000,UpdateLedgerAccounts.ConnectFeeDisabled));

    }

    @Test(priority = 66)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_134_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosDriverSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 67)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_135_CheckWhatHappensWhenAdminClicksOnSaveButton  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosDriverSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 68)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_136_CheckTheFieldsUnderTaxInformationTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosDriverSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 69)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_150_151_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosDriverSupport();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.EquipmentFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.EquipmentFeeDisabled,"Petty Cash");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.EquipmentFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.EquipmentFeeSelectedField,"Petty Cash"));


    }

    @Test(priority = 70)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_150_151_2_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLoginForCosDriverSupport();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.InstallationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.InstallationFeeDisabled,"Prepaid Expenses");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.InstallationFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.InstallationFeeSelectedField,"Prepaid Expenses"));


    }

    @Test(priority = 71)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_150_151_3_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosDriverSupport();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.TransactionFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TransactionFeeDisabled,"Advance Tax");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TransactionFeeDisabled);
        basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TransactionFeeSelectedField,"Advance Tax");


    }

    @Test(priority = 72)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_150_151_4_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosDriverSupport();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.UtilizationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.UtilizationFeeDisabled,"Sales");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.UtilizationFeeDisabled);
        basePage.verifyTextMatching(2000,UpdateLedgerAccounts.UtilizationFeeSelectedField,"Sales");
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }

    @Test(priority = 73)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_155_CheckTheTitleOfThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        Thread.sleep(4000);
        loginPage.verifyValidLoginForCosTechSupport();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 5000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyTextMatching(4000,UpdateLedgerAccounts.LedgerConfigTitle,"Ledger Configuration"));
    }
    @Test(priority = 74)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_156_CheckTheTabsTitleOnThePage  () throws InterruptedException {
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

    @Test(priority = 75)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_157_CheckWhichTabSystemShowsByDefault() throws InterruptedException {
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
    @Test(priority = 76)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_158_CheckDefaultTabAfterRefreshingThePage () throws InterruptedException {
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

    @Test(priority = 77)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_159_CheckWhatHappensWhenAdminRefreshThePageFromAnyOtherTabExceptLedgerAccountTab () throws InterruptedException {
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

    @Test(priority = 78)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_160_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,UpdateLedgerAccounts.EquipmentFee));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(100,UpdateLedgerAccounts.InstallationFee));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(100,UpdateLedgerAccounts.TransactionFee));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(100,UpdateLedgerAccounts.UtilizationFee));

    }

//    @Test(priority = 7)//Done
//    @TestParameters(testCaseId = {"TC-8"})
//    public void TC_8_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
////        loginPage.VerifyValidLogin();
////        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
////        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
//        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.EquipmentFeeSelectField,"Select"));
//        Assert.assertTrue(basePage.verifyTextMatching(100,UpdateLedgerAccounts.InstallationFeeSelectField,"Select"));
//        Assert.assertTrue(basePage.verifyTextMatching(100,UpdateLedgerAccounts.TransactionFeeSelectField,"Select"));
//        Assert.assertTrue(basePage.verifyTextMatching(100,UpdateLedgerAccounts.UtilizationFeeSelectField,"Select"));
//
//    }

    @Test(priority = 79)//Done
    @TestParameters(testCaseId = {"TC-9,10,11,12"})
    public void TC_161_162_163_164_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(3000,UpdateLedgerAccounts.EquipmentFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(100,UpdateLedgerAccounts.InstallationFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(100,UpdateLedgerAccounts.TransactionFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(100,UpdateLedgerAccounts.UtilizationFeeDisabled));

    }
    @Test(priority = 80)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_165_CheckTheEditButtonByDefaultOnThisPage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.EditButton));


    }
    @Test(priority = 81)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_166_CheckWhatHappensWhenAdminClickOnEditButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.CancelButton));


    }

    @Test(priority = 82)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_167_CheckTheFieldsUnderLedgerAccountTab () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(3000,UpdateLedgerAccounts.EquipmentFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(100, UpdateLedgerAccounts.InstallationFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(100, UpdateLedgerAccounts.TransactionFeeDisabled));
        Assert.assertTrue(basePage.verifyAFieldIsEnable(100, UpdateLedgerAccounts.UtilizationFeeDisabled));
    }

    @Test(priority = 83)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_168_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosTechSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.EditButton));
    }
    @Test(priority = 84)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_169_CheckWhatHappensWhenAdminClicksOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosTechSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.EditButton));
    }

    @Test(priority = 85)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_170_CheckFieldsUnderBankAccountTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosTechSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.BankAccount));
    }
    //    @Test(priority = 15)//Done
//    @TestParameters(testCaseId = {"TC-19"})
//    public void TC_19_CheckPlaceholderWhenNoDataIsSelectedInTheFields() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
////        loginPage.VerifyValidLogin();
////        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
////        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
////        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
//        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.ConnectBankSelectField,"Select"));
//    }
    @Test(priority = 86)//Done
    @TestParameters(testCaseId = {"TC-20,21"})
    public void TC_171_172_CheckPlaceholderWhenNoDataIsSelectedInTheFields() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
//        loginPage.VerifyValidLogin();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1000,UpdateLedgerAccounts.ConnectFeeDisabled));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.ConnectBankEditButton));
    }
    @Test(priority = 87)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_173_CheckWhatHappensWhenAdminClickOnEditButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosTechSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000,UpdateLedgerAccounts.CancelButton));

    }

    @Test(priority = 88)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_174_CheckWhatHappensWhenAdminClickOnEditButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosTechSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.BankAccountsTab,1000);
//        createCharger.ClickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        Assert.assertTrue(basePage.verifyAFieldIsEnable(3000,UpdateLedgerAccounts.ConnectFeeDisabled));

    }

    @Test(priority = 89)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_175_CheckWhatHappensWhenAdminClicksOnCancelButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosTechSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.CancelButton, 1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 90)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_176_CheckWhatHappensWhenAdminClicksOnSaveButton  () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosTechSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 91)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_178_CheckTheFieldsUnderTaxInformationTab() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosTechSupport();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.EditButton, 1000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.SaveButton));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(3000, UpdateLedgerAccounts.CancelButton));
        createCharger.clickButton(UpdateLedgerAccounts.ConnectBankEditButton, 1000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,UpdateLedgerAccounts.SaveButton));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1000,UpdateLedgerAccounts.CancelButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,UpdateLedgerAccounts.ConnectBankEditButton));
    }

    @Test(priority = 92)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_181_182_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosTechSupport();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 2000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,6000);
        createCharger.clickButton(UpdateLedgerAccounts.EquipmentFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.EquipmentFeeDisabled,"Petty Cash");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.EquipmentFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.EquipmentFeeSelectedField,"Petty Cash"));


    }

    @Test(priority = 93)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_181_182_2_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosTechSupport();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.InstallationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.InstallationFeeDisabled,"Drawings");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.InstallationFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.InstallationFeeSelectedField,"Drawings"));


    }

    @Test(priority = 94)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_181_182_3_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosTechSupport();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,3000);
        createCharger.clickButton(UpdateLedgerAccounts.TransactionFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TransactionFeeDisabled,"Travel Expense");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.TransactionFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TransactionFeeSelectedField,"Travel Expense"));


    }

    @Test(priority = 95)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_181_182_4_CheckWhatHappensWhenAdminChangeTheAccountFromTheDrropdownAndClickOnSaveButton () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        GuestFlow guestFlow =new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails = new DashboardPropertyDetails(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLoginForCosTechSupport();
        dashboard.refreshBrowser();
//        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 3000);
//        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 2000);
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,4000);
        createCharger.clickButton(UpdateLedgerAccounts.UtilizationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.UtilizationFeeDisabled,"Accounts Payable");
        createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,UpdateLedgerAccounts.UtilizationFeeDisabled));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.UtilizationFeeSelectedField,"Accounts Payable"));
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }








}
