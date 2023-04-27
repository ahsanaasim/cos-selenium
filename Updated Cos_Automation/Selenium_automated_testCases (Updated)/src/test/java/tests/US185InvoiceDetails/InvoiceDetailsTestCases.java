package tests.US185InvoiceDetails;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

public class InvoiceDetailsTestCases extends BaseTest {


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckTheTitleOfTheDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        loginPage.VerifyValidLogin();
        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        Assert.assertTrue(invoiceDetails.verifyInvoiceDetailsDrawerTitle());
    }
    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckHowManySectionAreThereInAnyDetailsDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.DetailsButton,2000);
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(2000,InvoiceDetails.InvoiceToSection));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.InvoiceDetailsSection));
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckTheOptionsToCloseTheDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.DetailsButton,2000);
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.CloseButton));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.CrossButton));
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckTheInvoiceToSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.DetailsButton,2000);
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.InvoiceToPropertyName));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.InvoiceToPropertyAddress));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.InvoiceToCompanyName));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.InvoiceDetailsEntityName));
    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5,6,7,8,9"})
    public void TC_5_6_7_8_9_CheckInvoiceDetailsDatesRelatedSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        Assert.assertTrue(invoiceDetails.verifyInvoiceDetailsDates());
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.InvoiceDateTitle));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.InvoiceDateRequiredSign));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.DueDateTitle));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.DueDateRequiredSign));
        Assert.assertTrue(basepage.verifyAFieldIsDisable(1000,InvoiceDetails.DrawerInvoiceDate));
        Assert.assertTrue(basepage.verifyAFieldIsDisable(1000,InvoiceDetails.DrawerDueDate));


    }
    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-10,11"})
    public void TC_10_11_CheckInvoiceDetailsBalanceRelatedSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.DetailsButton,2000);
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.DrawerBalanceDueTitle));
        Assert.assertTrue(basepage.verifyTextMatching(1000,InvoiceDetails.DrawerBalanceDueTitle,"Balance Due"));

    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-12,13"})
    public void TC_12_13_CheckBalanceDueAmount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        Assert.assertTrue(invoiceDetails.verifyBalanceDue());
        Assert.assertTrue(invoiceDetails.verifyCurrency());

    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-14,15"})
    public void TC_14_15_CheckTheTableColumnsInInvoiceDetails() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.DetailsButton, 2000);
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.DetailsNoColumn));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.DetailsDescriptionColumn));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.DetailsLedgerColumn));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.DetailsQtyColumn));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.DetailsRateColumn));
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(1000,InvoiceDetails.DetailsTotalAmountColumn));
    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckUnderNoColumnSerialNumberIsShowing() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.DetailsButton, 2000);
        Assert.assertTrue(invoiceDetails.verifySerialNumberUnderNumberColumn());
    }
    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckUnderDescriptionColumnItemsDescriptionShouldBeShown() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.DetailsButton,2000);
        Assert.assertTrue(invoiceDetails.verifyContentExistUnderDescriptionField());
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckLedgerAccountIsShowingUnderLedgerColumn() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.DetailsButton,2000);
        Assert.assertTrue(invoiceDetails.verifyLedgerAccountExistUnderLedgerField());
    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckUnderQtyColumnQuantityNumberIsShowing() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.DetailsButton, 2000);
        Assert.assertTrue(invoiceDetails.verifyQuantityUnderQtyColumn());
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckUnderRateColumnCurrencyIsShowing() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.DetailsButton,2000);
        Assert.assertTrue(invoiceDetails.verifyNumberUnderRateColumn());
    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckTheFieldUnderTotalAmountColumn() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.DetailsButton,2000);
        Assert.assertTrue(invoiceDetails.verifyFieldUnderTotalAmountColumn());
    }
    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckTotalAmountUnderTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceDetails = new InvoiceDetails(driver);
        BasePage basepage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.DetailsButton,2000);
        Assert.assertTrue(basepage.verifyAnElementDisplayedOrNot(2000,InvoiceDetails.TotalAmountBottom));
        Assert.assertTrue(invoiceDetails.verifyTotalAmountSection());


    }




}
