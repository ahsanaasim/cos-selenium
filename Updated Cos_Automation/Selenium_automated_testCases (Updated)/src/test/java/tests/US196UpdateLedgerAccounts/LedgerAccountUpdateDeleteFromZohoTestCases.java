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
        loginPage.VerifyValidLogin();
        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        basePage.NewTabOpenAndSwitchToNewTab(1);
        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
        createCharger.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
        createCharger.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
        createCharger.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
        createCharger.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
        createCharger.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
        createCharger.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
        createCharger.ClickButton(UpdateLedgerAccounts.CreateAccountZoho,3000);
        int randomNumber = objGenerator.nextInt(100);
        System.out.println(randomNumber);
        String AccountName="Nice Savings "+randomNumber;
        createCharger.writeInputText(UpdateLedgerAccounts.CreateAccountZohoAccountName,AccountName,2000);
        createCharger.ClickButton(UpdateLedgerAccounts.SaveButtonZoho,1000);
        basePage.SwitchToTab(0);
        dashboard.RefreshBrowser();
        createCharger.ClickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.ClickButton(UpdateLedgerAccounts.EquipmentFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.EquipmentFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.ClickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.EquipmentFeeSelectedField,AccountName));
        createCharger.ClickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.ClickButton(UpdateLedgerAccounts.InstallationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.InstallationFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.ClickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.InstallationFeeSelectedField,AccountName));
        createCharger.ClickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.ClickButton(UpdateLedgerAccounts.TransactionFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TransactionFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.ClickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TransactionFeeSelectedField,AccountName));
        createCharger.ClickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.ClickButton(UpdateLedgerAccounts.UtilizationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.UtilizationFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.ClickButton(UpdateLedgerAccounts.SaveButton,3000));
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
        loginPage.VerifyValidLogin();
        createCharger.ClickButton(UpdateLedgerAccounts.SettingsTab, 5000);
        createCharger.ClickButton(UpdateLedgerAccounts.LedgerConfigurationTab, 3000);
        basePage.NewTabOpenAndSwitchToNewTab(1);
        basePage.GoToWebsite("https://accounts.zoho.com/signin?servicename=ZohoBooks&signupurl=https://www.zoho.com/books/signup/index.html");
        createCharger.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
        createCharger.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
        createCharger.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
        createCharger.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,5000);
        createCharger.ClickButton(UpdateLedgerAccounts.AccountantTab,3000);
        createCharger.ClickButton(UpdateLedgerAccounts.ChartOfAccountTab,3000);
        updateLedgerAccounts.SearchAccountInZoho("Expensive");
        Thread.sleep(4000);
        String AccountName = driver.findElement(UpdateLedgerAccounts.ZohoSearchResult).getText();
        createCharger.ClickButton(UpdateLedgerAccounts.ZohoSearchResult,3000);
        createCharger.ClickButton(UpdateLedgerAccounts.MoreButtonZoho,2500);
        createCharger.ClickButton(UpdateLedgerAccounts.DeleteButtonZoho,1000);
        createCharger.ClickButton(UpdateLedgerAccounts.OKButtonZoho,1500);
        basePage.SwitchToTab(0);
        dashboard.RefreshBrowser();
        createCharger.ClickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.ClickButton(UpdateLedgerAccounts.EquipmentFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.EquipmentFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.ClickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2500,UpdateLedgerAccounts.DropdownNoData));
        createCharger.ClickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.ClickButton(UpdateLedgerAccounts.InstallationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.InstallationFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.ClickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.InstallationFeeSelectedField,AccountName));
        createCharger.ClickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.ClickButton(UpdateLedgerAccounts.TransactionFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.TransactionFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.ClickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.TransactionFeeSelectedField,AccountName));
        createCharger.ClickButton(UpdateLedgerAccounts.EditButton,5000);
        createCharger.ClickButton(UpdateLedgerAccounts.UtilizationFeeSelectedField,3000);
        updateLedgerAccounts.SelectAccount(3000,UpdateLedgerAccounts.UtilizationFeeDisabled,AccountName);
        Assert.assertTrue(createCharger.ClickButton(UpdateLedgerAccounts.SaveButton,3000));
        Assert.assertTrue(basePage.verifyTextMatching(2000,UpdateLedgerAccounts.UtilizationFeeSelectedField,AccountName));


    }







}
