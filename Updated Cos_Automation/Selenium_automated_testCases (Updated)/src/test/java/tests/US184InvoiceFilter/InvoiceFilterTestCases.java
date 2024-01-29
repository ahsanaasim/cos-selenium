package tests.US184InvoiceFilter;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

public class InvoiceFilterTestCases extends BaseTest {


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckIfAdvanceFilterButtonIsShowingUpOnUserTable () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
        loginPage.verifyValidLogin();
        operation.clickButton(InvoiceListAndSearch.FinancialTab,2000);
        operation.clickButton(InvoiceListAndSearch.InvoicesTab,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.AdvanceFilterButton));
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckWhatHappensWhenIClickOnTheAdvancedFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.AdvanceFilterDrawerTitle));
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckTheFilterSectionOnTheAdvancedFilterDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
        loginPage.verifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.InvoiceInformation));
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckTheInputFieldsOnTheAdvancedFilterDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.EntityTitle));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.EntityField));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.CompanyTitle));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.CompanyField));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.PropertyTitle));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.PropertyField));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.BillingDurationTitle));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.BillingDurationField));
    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckBillingDurationFilters() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.BillingDurationField,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.DueNext7DaysFilter));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.DueNext30DaysFilter));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.DueInNextFilter));
    }
    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckTheButtonsOnTheAdvancedFilter () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.ResetAllButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.ApplyButton));
    }
    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckCrossButtonVisibilityOnTheAdvancedFilter () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.AdvanceFilterCrossButton));
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckThePlaceholderOfAllTheFilterFieldUnderInvoiceInformationSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        Assert.assertTrue(basePage.verifyTextMatching(500,InvoiceFilter.PlaceholderEntityField,"Select"));
        Assert.assertTrue(basePage.verifyTextMatching(500,InvoiceFilter.PlaceholderCompanyField,"Select"));
        Assert.assertTrue(basePage.verifyTextMatching(500,InvoiceFilter.PlaceholderPropertyField,"Select"));
        Assert.assertTrue(basePage.verifyTextMatching(500,InvoiceFilter.PlaceholderBillingDurationField,"Select"));
    }
    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckTheStatusFilterUIAboveTheInvoiceTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.AllStatusesFilterButton));

    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckAllTheStatusInFilterDropDown() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AllStatusesFilterButton,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.DropdownOptionAllStatus));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.DropdownOptionSentStatus));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.DropdownOptionPaidStatus));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.DropdownOptionPartiallyPaidStatus));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.DropdownOptionOverdueStatus));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.DropdownOptionDraftStatus));


    }
    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckTheLAstTwelveMonthsFilterUIAboveTheInvoiceTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceFilter.AllStatusesFilterButton,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.Last12DaysFilter));


    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckTheCustomOptionUnderLastTwelveMonthsFilterAboveTheInvoiceTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.Last12DaysFilter,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(500,InvoiceFilter.DropdownOptionCustom));


    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckWhatHappensWhenIClickOnTheCrossOptionWithoutSelectingAnyFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterCrossButton,2000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,InvoiceFilter.AdvanceFilterDrawerTitle));

    }
    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckWhatHappensWhenIClickOnTheCrossOptionWithoutSelectingAnyFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceDetails invoiceFilter = new InvoiceDetails(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterCrossButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,1000);
        Assert.assertTrue(basePage.verifyTextMatching(500,InvoiceFilter.PlaceholderEntityField,"Select"));
        Assert.assertTrue(basePage.verifyTextMatching(500,InvoiceFilter.PlaceholderCompanyField,"Select"));
        Assert.assertTrue(basePage.verifyTextMatching(500,InvoiceFilter.PlaceholderPropertyField,"Select"));
        Assert.assertTrue(basePage.verifyTextMatching(500,InvoiceFilter.PlaceholderBillingDurationField,"Select"));

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckWhatHappensWhenIClickOnTheCrossOptionAfterSelectingAnyFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        invoiceFilter.SelectFilterFromDropdown("New",InvoiceFilter.EntityField);
        operation.clickButton(InvoiceFilter.EntityCrossOption,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterCrossButton,1000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,InvoiceFilter.AdvanceFilterDrawerTitle));
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        Assert.assertTrue(basePage.verifyTextMatching(500,InvoiceFilter.PlaceholderEntityField,"Select"));

    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckWhatHappensWhenIClickOnTheCrossOptionAfterSelectingAnyFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        invoiceFilter.SelectFilterFromDropdown("One",InvoiceFilter.EntityField);
//        operation.ClickButton(InvoiceFilter.EntityCrossOption,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterCrossButton,1000);
//        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,InvoiceFilter.AdvanceFilterDrawerTitle));
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        Assert.assertTrue(basePage.verifyTextMatching(500,InvoiceFilter.PlaceholderEntityField,"Select"));

    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-17,18"})
    public void TC_17_18_CheckWhatHappensWhenIClickOnApplyAfterWithoutSelectingAnyFilter () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        invoiceFilter.SelectFilterFromDropdown("One",InvoiceFilter.EntityField);
//        operation.ClickButton(InvoiceFilter.EntityCrossOption,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterCrossButton,1000);
//        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,InvoiceFilter.AdvanceFilterDrawerTitle));
        operation.clickButton(InvoiceFilter.ApplyButton,2000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,InvoiceFilter.AdvanceFilterDrawerTitle));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.AdvanceFilterButton));

    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-19,20"})
    public void TC_19_20_CheckWhatHappensWhenIClickOnApplyAfterSelectingAnyFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
////        dashboard.RefreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        invoiceFilter.SelectFilterFromDropdown("New",InvoiceFilter.EntityField);
//        operation.ClickButton(InvoiceFilter.EntityCrossOption,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterCrossButton,1000);
//        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,InvoiceFilter.AdvanceFilterDrawerTitle));
        operation.clickButton(InvoiceFilter.ApplyButton,2000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(1500,InvoiceFilter.AdvanceFilterDrawerTitle));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.Tag1));

    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckWhatHappensWhenIClickOnApplyAfterSelectingAnyFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
////        dashboard.RefreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        Assert.assertTrue(invoiceFilter.verifySelectedTag("Walmart",InvoiceFilter.EntityField,InvoiceFilter.EntityFieldSelected));

    }
    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-22,23"})
    public void TC_22_23_CheckWhatHappensAfterClickingOnTheDropdownOption () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.EntityField,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.Dropdown));

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_CheckWhatHappensWhenITypeAnyExistingEntityName() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.EntityField,2000);
        invoiceFilter.SelectFilterFromDropdown("Alpha",InvoiceFilter.EntityField);
        operation.clickButton(InvoiceFilter.EntityCrossOption,1000);
        invoiceFilter.SelectFilterFromDropdown("Yellow",InvoiceFilter.EntityField);
        operation.clickButton(InvoiceFilter.EntityCrossOption,1000);
        invoiceFilter.SelectFilterFromDropdown("Lark Homes 55",InvoiceFilter.EntityField);
        operation.clickButton(InvoiceFilter.EntityCrossOption,1000);

    }
    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_27_CheckWhatHappenedWhenClickRightOnTheDropdownOptionFromTheAdvanceFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        operation.ClickButton(InvoiceFilter.ResetAllButton,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.EntityField,2000);
        Assert.assertTrue(invoiceFilter.verifyDropdownListExpanded(InvoiceFilter.EntityField));
    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_CheckWhatHappensWhenISelectOneValueFromTheDropdownDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        operation.ClickButton(InvoiceFilter.ResetAllButton,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.EntityField,2000);
        invoiceFilter.SelectFilterFromDropdown("Tesla company 20",InvoiceFilter.EntityField);
        Assert.assertTrue(basePage.verifyTextMatching(1500,InvoiceFilter.EntityFieldSelected,"Tesla company 20"));
    }


    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_CheckWhatHappensWhenITypeInvalidDataOnField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
////        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        operation.ClickButton(InvoiceFilter.ResetAllButton,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.EntityFieldSelected,2000);
        operation.writeInputText(InvoiceFilter.EntityField,"sdfsfsdfs",1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.NoItem));

    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-30,31,32"})
    public void TC_30_31_32_CheckWhatHappenedWhenSelectEntityFromTheDropdownAndClickOnApplyButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        operation.ClickButton(InvoiceFilter.ResetAllButton,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        operation.ClickButton(InvoiceFilter.EntityField,2000);
        Assert.assertTrue(invoiceFilter.verifySelectedTag("Apple entity",InvoiceFilter.EntityField,InvoiceFilter.EntityFieldSelected));

    }
    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-33,34"})
    public void TC_33_34_CheckWhatHappenedWhenIClickClearAllAboveTheTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.EntityField,2000);
        invoiceFilter.SelectFilterFromDropdown("Lark Homes",InvoiceFilter.EntityField);
        operation.clickButton(InvoiceFilter.ApplyButton,2000);
        Assert.assertTrue(invoiceFilter.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.Tag1));
        Assert.assertTrue(invoiceFilter.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.ClearAllTag));
        operation.clickButton(InvoiceFilter.ClearAllTag,2000);

    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-36,37"})
    public void TC_36_37_CheckWhatHappensAfterClickingOnTheDropdownOption () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.CompanyField,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.Dropdown));

    }

    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_CheckWhatHappensWhenITypeAnyExistingCompanyName() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.CompanyField,2000);
        invoiceFilter.SelectFilterFromDropdown("Angel In Us",InvoiceFilter.CompanyField);
        operation.clickButton(InvoiceFilter.EntityCrossOption,1000);
        invoiceFilter.SelectFilterFromDropdown("test company99",InvoiceFilter.CompanyField);
        operation.clickButton(InvoiceFilter.EntityCrossOption,1000);
        invoiceFilter.SelectFilterFromDropdown("My Property Company29",InvoiceFilter.CompanyField);
        operation.clickButton(InvoiceFilter.EntityCrossOption,1000);

    }
    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-40,41"})
    public void TC_40_41_CheckWhatHappenedWhenClickRightOnTheDropdownOptionFromTheAdvanceFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.CompanyField,2000);
        Assert.assertTrue(invoiceFilter.verifyDropdownListExpanded(InvoiceFilter.CompanyField));
    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_CheckWhatHappensWhenISelectOneValueFromTheDropdownDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        operation.ClickButton(InvoiceFilter.ResetAllButton,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.CompanyField,2000);
        invoiceFilter.SelectFilterFromDropdown("Walmart90",InvoiceFilter.CompanyField);
        Assert.assertTrue(basePage.verifyTextMatching(1500,InvoiceFilter.CompanyFieldSelected,"Walmart90"));
    }


    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_CheckWhatHappensWhenITypeInvalidDataOnField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
////        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,1000);
        operation.clickButton(InvoiceFilter.ResetAllButton,1000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,1000);
        operation.clickButton(InvoiceFilter.CompanyField,2000);
        operation.writeInputText(InvoiceFilter.CompanyField,"sdfsfsdfs",1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.NoItem));

    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-44,45,46"})
    public void TC_44_45_46_CheckWhatHappenedWhenSelectCompanyFromTheDropdownAndClickOnApplyButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        operation.ClickButton(InvoiceFilter.ResetAllButton,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
        Assert.assertTrue(invoiceFilter.verifySelectedTag("Angel In Us",InvoiceFilter.CompanyField,InvoiceFilter.CompanyFieldSelected));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(3000,InvoiceFilter.NoDataFoundInTable));

    }
    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-47,48"})
    public void TC_47_48_CheckWhatHappenedWhenIClickClearAllAboveTheTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.CompanyField,2000);
        invoiceFilter.SelectFilterFromDropdown("Selenium Company 3",InvoiceFilter.CompanyField);
        operation.clickButton(InvoiceFilter.ApplyButton,2000);
        Assert.assertTrue(invoiceFilter.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.Tag1));
        Assert.assertTrue(invoiceFilter.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.ClearAllTag));
        operation.clickButton(InvoiceFilter.ClearAllTag,2000);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(3000,InvoiceFilter.ClearAllTag));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(3000,InvoiceFilter.Tag1));

    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-50,51"})
    public void TC_50_51_CheckWhatHappensAfterClickingOnTheDropdownOption () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.PropertyField,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.Dropdown));

    }

    @Test(priority = 39)//Done
    @TestParameters(testCaseId = {"TC-53"})
    public void TC_53_CheckWhatHappensWhenITypeAnyExistingCompanyName() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.PropertyField,2000);
        invoiceFilter.SelectFilterFromDropdown("My",InvoiceFilter.PropertyField);
        operation.clickButton(InvoiceFilter.EntityCrossOption,1000);
        invoiceFilter.SelectFilterFromDropdown("Property Tesla",InvoiceFilter.PropertyField);
        operation.clickButton(InvoiceFilter.EntityCrossOption,1000);
        invoiceFilter.SelectFilterFromDropdown("Cloudy",InvoiceFilter.PropertyField);
        operation.clickButton(InvoiceFilter.EntityCrossOption,1000);

    }
    @Test(priority = 40)//Done
    @TestParameters(testCaseId = {"TC-54,55"})
    public void TC_54_55_CheckWhatHappenedWhenClickRightOnTheDropdownOptionFromTheAdvanceFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.PropertyField,2000);
        Assert.assertTrue(invoiceFilter.verifyDropdownListExpanded(InvoiceFilter.PropertyField));
    }

    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-56"})
    public void TC_56_CheckWhatHappensWhenISelectOneValueFromTheDropdownDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        operation.ClickButton(InvoiceFilter.ResetAllButton,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.PropertyField,2000);
        invoiceFilter.SelectFilterFromDropdown("EV company",InvoiceFilter.PropertyField);
        Assert.assertTrue(basePage.verifyTextMatching(1500,InvoiceFilter.PropertyFieldSelected,"EV company"));
    }


    @Test(priority = 42)//Done
    @TestParameters(testCaseId = {"TC-57"})
    public void TC_57_CheckWhatHappensWhenITypeInvalidDataOnField () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
////        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,1000);
        operation.clickButton(InvoiceFilter.ResetAllButton,1000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,1000);
        operation.clickButton(InvoiceFilter.PropertyField,2000);
        operation.writeInputText(InvoiceFilter.PropertyField,"sdfsfsdfs",1000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.NoItem));

    }

    @Test(priority = 43)//Done
    @TestParameters(testCaseId = {"TC-58,59,60"})
    public void TC_58_59_60_CheckWhatHappenedWhenSelectEntityFromTheDropdownAndClickOnApplyButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        operation.ClickButton(InvoiceFilter.ResetAllButton,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
        Assert.assertTrue(invoiceFilter.verifySelectedTag("Selenium Property 2",InvoiceFilter.PropertyField,InvoiceFilter.PropertyFieldSelected));

    }
    @Test(priority = 44)//Done
    @TestParameters(testCaseId = {"TC-61,62"})
    public void TC_61_62_CheckWhatHappenedWhenIClickClearAllAboveTheTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.PropertyField,2000);
        invoiceFilter.SelectFilterFromDropdown("Ganymede",InvoiceFilter.PropertyField);
        operation.clickButton(InvoiceFilter.ApplyButton,2000);
        Assert.assertTrue(invoiceFilter.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.Tag1));
        Assert.assertTrue(invoiceFilter.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.ClearAllTag));
        operation.clickButton(InvoiceFilter.ClearAllTag,2000);
        Assert.assertTrue(invoiceFilter.verifyElementNotDisplayed(2000,InvoiceFilter.ClearAllTag));


    }

//    @Test(priority = 45)//Done
//    @TestParameters(testCaseId = {"TC-72"})
//    public void TC_67_CheckWhatHappensWhenISelectCustomFromTheDropdown() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
//        BasePage basePage = new BasePage(driver);
////        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
////        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
////        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        operation.ClickButton(InvoiceFilter.ResetAllButton,2000);
//        operation.ClickButton(InvoiceFilter.Last12DaysFilter,2000);
//        operation.ClickButton(InvoiceFilter.DropDownCustom,2000);
//        operation.ClickButton(InvoiceFilter.CustomField,2000);
//        Assert.assertTrue(invoiceFilter.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.Calender));
//
//
//    }

//    @Test(priority = 46)//Done
//    @TestParameters(testCaseId = {"TC-6"})
//    public void TC_68_CheckWhatHappensWhenISelectOneValueFromTheDropdownDrawer() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
//        BasePage basePage = new BasePage(driver);
////        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
////        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
////        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        operation.ClickButton(InvoiceFilter.AdvanceFilterButton,2000);
//        operation.ClickButton(InvoiceFilter.ResetAllButton,2000);
//        operation.ClickButton(InvoiceFilter.AllStatusesFilterButton,2000);
//        operation.ClickButton(InvoiceFilter.DropdownOptionSentStatus,2000);
//        operation.ClickButton(InvoiceFilter.CustomField,2000);
//        operation.ClickButton(InvoiceFilter.Last12DaysFilterCrossOption,2000);
//        Assert.assertTrue(invoiceFilter.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.Last12DaysFilter));
//
//
//    }


    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-72"})
    public void TC_72_CheckWhatHappensWhenISelectCustomFromTheDropdown() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.Last12DaysFilter,2000);
        operation.clickButton(InvoiceFilter.DropDownCustom,2000);
        operation.clickButton(InvoiceFilter.CustomField,2000);
        Assert.assertTrue(invoiceFilter.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.Calender));


    }

    @Test(priority = 46)//Done
    @TestParameters(testCaseId = {"TC-73"})
    public void TC_73_CheckWhatHappenedWhenISelectCustomFilterFromTheDropdownAndClickOnTheCrossButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        InvoiceFilter invoiceFilter = new InvoiceFilter(driver);
        BasePage basePage = new BasePage(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterButton,2000);
        operation.clickButton(InvoiceFilter.ResetAllButton,2000);
        operation.clickButton(InvoiceFilter.Last12DaysFilter,2000);
        operation.clickButton(InvoiceFilter.DropDownCustom,2000);
        operation.clickButton(InvoiceFilter.CustomField,2000);
        operation.clickButton(InvoiceFilter.Last12DaysFilterCrossOption,2000);
        Assert.assertTrue(invoiceFilter.verifyAnElementDisplayedOrNot(1500,InvoiceFilter.Last12DaysFilter));


    }

}