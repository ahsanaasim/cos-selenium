package tests.US196UpdateLedgerAccounts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Random;

public class LedgerAccountUpdateDeleteFromZohoTestCases extends BaseTest {





    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_49_50_51_52_CheckDropdownMenuOfEquipmentFeeWhenAnLedgerAccountIsCreated () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        Random objGenerator = new Random();
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 5000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
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
        String AccountName="Nice Savings "+randomNumber;
        createCharger.writeInputText(UpdateLedgerAccounts.CreateAccountZohoAccountName,AccountName,2000);
        createCharger.clickButton(UpdateLedgerAccounts.SaveButtonZoho,1000);
        basePage.switchToTab(0);
        dashboard.refreshBrowser();
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.clickButton(UpdateLedgerAccounts.EquipmentFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.EquipmentFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.EquipmentFeeSelectedField,AccountName));
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.clickButton(UpdateLedgerAccounts.InstallationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.InstallationFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.InstallationFeeSelectedField,AccountName));
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.clickButton(UpdateLedgerAccounts.TransactionFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TransactionFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TransactionFeeSelectedField,AccountName));
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.clickButton(UpdateLedgerAccounts.UtilizationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.UtilizationFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.UtilizationFeeSelectedField,AccountName));


    }

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_53_54_55_56_CheckDropdownMenuOfEquipmentFeeWhenAnLedgerAccountIsCreated () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        Random objGenerator = new Random();
        CreateCharger createCharger = new CreateCharger(driver);
        UpdateLedgerAccounts updateLedgerAccounts = new UpdateLedgerAccounts(driver);
        loginPage.verifyValidLogin();
        createCharger.clickButton(UpdateLedgerAccounts.SettingsTab, 5000);
        createCharger.clickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        basePage.newTabOpenAndSwitchToNewTab(1);
        basePage.goToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
        createCharger.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
        createCharger.clickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
        createCharger.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
        createCharger.clickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
        createCharger.clickButton(UpdateLedgerAccounts.AccountantTab,3000);
        createCharger.clickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
        updateLedgerAccounts.SearchAccountInZoho("Expensive");
        Thread.sleep(4000);
        String AccountName = driver.findElement(UpdateLedgerAccounts.ZohoSearchResult).getText();
        createCharger.clickButton(UpdateLedgerAccounts.ZohoSearchResult,3000);
        createCharger.clickButton(UpdateLedgerAccounts.MoreButtonZoho,2500);
        createCharger.clickButton(UpdateLedgerAccounts.DeleteButtonZoho,1000);
        createCharger.clickButton(UpdateLedgerAccounts.OKButtonZoho,1500);
        basePage.switchToTab(0);
        dashboard.refreshBrowser();
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.clickButton(UpdateLedgerAccounts.EquipmentFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.EquipmentFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2500,UpdateLedgerAccounts.DropdownNoData));
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.clickButton(UpdateLedgerAccounts.InstallationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.InstallationFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.InstallationFeeSelectedField,AccountName));
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.clickButton(UpdateLedgerAccounts.TransactionFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TransactionFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TransactionFeeSelectedField,AccountName));
        createCharger.clickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.clickButton(UpdateLedgerAccounts.UtilizationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.UtilizationFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.clickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.UtilizationFeeSelectedField,AccountName));


    }







}
