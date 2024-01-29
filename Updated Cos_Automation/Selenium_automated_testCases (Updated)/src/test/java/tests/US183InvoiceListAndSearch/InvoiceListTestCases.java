package tests.US183InvoiceListAndSearch;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

public class InvoiceListTestCases extends BaseTest {


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckTheBreadBarName () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        loginPage.verifyValidLogin();
        operation.clickButton(InvoiceListAndSearch.FinancialTab, 2000);
        operation.clickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        Assert.assertTrue(invoiceList.verifyBreadBarNameMatchWithTabName());
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckTheTitleOfThePage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        Assert.assertTrue(basePage.verifyTextMatching(1500,InvoiceListAndSearch.InvoicePageTitle,"Invoices"));
    }
    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckTheAccountNameOnTopOfThePage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        Assert.assertTrue(invoiceList.verifyAccountNameOnTop());
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckThreeBoxAreVisibleAboveTheInvoiceList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceListAndSearch.UnpaidBox));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceListAndSearch.OverdueBox));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceListAndSearch.PaidBox));
    }
    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckNameofTheBoxAreVisibleAboveTheInvoiceList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        Assert.assertTrue(basePage.verifyTextMatching(1000,InvoiceListAndSearch.UnpaidBoxTitle,"Unpaid"));
        Assert.assertTrue(basePage.verifyTextMatching(1000,InvoiceListAndSearch.OverdueBoxTitle,"Overdue"));
        Assert.assertTrue(basePage.verifyTextMatching(1000,InvoiceListAndSearch.PaidBoxTitle,"Paid"));
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckTheTableColumns() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        loginPage.verifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000, InvoiceListAndSearch.CompanyNameColumn));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(200, InvoiceListAndSearch.PropertyNameColumn));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(200, InvoiceListAndSearch.InvoiceNoColumn));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(200, InvoiceListAndSearch.InvoiceDateColumn));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(200, InvoiceListAndSearch.DueDateColumn));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(200, InvoiceListAndSearch.AmountPaidColumn));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(200, InvoiceListAndSearch.AmountDueColumn));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(200, InvoiceListAndSearch.StatusColumn));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(200, InvoiceListAndSearch.ActionColumn));
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckDetailsAndReceivePaymentButtonUnderActionColumn() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        loginPage.verifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000, InvoiceListAndSearch.DetailsButton));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(200, InvoiceListAndSearch.ReceivePaymentButton));
    }
    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckReceivePaymentOptionIsDisabledOrNot() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(200, InvoiceListAndSearch.ReceivePaymentButton));
    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckTheStatusColor() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        operation.writeInputText(InvoiceListAndSearch.SearchField,"INV-000042",3000);
        operation.clickButton(InvoiceListAndSearch.SearchButton,200);
        Assert.assertTrue(invoiceList.verifyDraftStatusColor());
    }
    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckTheStatusColor() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        loginPage.verifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        customerSignUp.fieldClear(InvoiceListAndSearch.SearchField);
        operation.writeInputText(InvoiceListAndSearch.SearchField,"INV-000018",3000);
        operation.clickButton(InvoiceListAndSearch.SearchButton,200);
        Assert.assertTrue(invoiceList.verifySentStatusColor());
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckTheStatusColor() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        loginPage.verifyValidLogin();
        customerSignUp.fieldClear(InvoiceListAndSearch.SearchField);
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        operation.writeInputText(InvoiceListAndSearch.SearchField,"INV-000015",3000);
        operation.clickButton(InvoiceListAndSearch.SearchButton,200);
        Assert.assertTrue(invoiceList.verifyPartiallyPaidStatusColor());
    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckTheStatusColor() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        loginPage.verifyValidLogin();
        customerSignUp.fieldClear(InvoiceListAndSearch.SearchField);
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        operation.writeInputText(InvoiceListAndSearch.SearchField,"INV-000010",3000);
        operation.clickButton(InvoiceListAndSearch.SearchButton,200);
        Assert.assertTrue(invoiceList.verifyPaidStatusColor());
    }
    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckIfThereIsASearchBoxAboveTheInvoiceTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        loginPage.verifyValidLogin();
        customerSignUp.fieldClear(InvoiceListAndSearch.SearchField);
        operation.clickButton(InvoiceListAndSearch.SearchButton,1000);
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(200, InvoiceListAndSearch.SearchButton));
    }
    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckPlaceHolderTextInSearchField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        Assert.assertTrue(invoiceList.verifySearchFieldPlaceholderText());
    }
    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckTitleOfSearchButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
        Assert.assertTrue(basePage.verifyTextMatching(2000,InvoiceListAndSearch.SearchButton,"Search"));
    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-49"})
    public void TC_49_CheckTheDraftStatusIsShowingForDraftedInvoice() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        operation.writeInputText(InvoiceListAndSearch.SearchField,"INV-000021",3000);
        operation.clickButton(InvoiceListAndSearch.SearchButton,200);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,InvoiceListAndSearch.DraftStatus));
    }
    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-50"})
    public void TC_50_52_CheckTheDPaidStatusIsShowingForPaidInvoice() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        loginPage.VerifyValidLogin();
        customerSignUp.fieldClear(InvoiceListAndSearch.SearchField);
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        operation.writeInputText(InvoiceListAndSearch.SearchField,"INV-000033",3000);
        operation.clickButton(InvoiceListAndSearch.SearchButton,200);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,InvoiceListAndSearch.PaidStatus));
    }
    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-51"})
    public void TC_51_55_CheckTheSentStatusIsShowingForSentInvoice() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
        customerSignUp.fieldClear(InvoiceListAndSearch.SearchField);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        operation.writeInputText(InvoiceListAndSearch.SearchField,"INV-000019",3000);
        operation.clickButton(InvoiceListAndSearch.SearchButton,200);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,InvoiceListAndSearch.SentStatus));
    }
    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-52"})
    public void TC_53_CheckTheSentStatusIsShowingForSentInvoice() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        loginPage.VerifyValidLogin();
        customerSignUp.fieldClear(InvoiceListAndSearch.SearchField);
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        operation.writeInputText(InvoiceListAndSearch.SearchField,"INV-000052",3000);
        operation.clickButton(InvoiceListAndSearch.SearchButton,200);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,InvoiceListAndSearch.OverdueStatus));
    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-54"})
    public void TC_54_CheckThePartiallyPaidStatusIsShowingForPartiallyPaidInvoice() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation = new CreateCharger(driver);
        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        loginPage.VerifyValidLogin();
        customerSignUp.fieldClear(InvoiceListAndSearch.SearchField);
//        operation.ClickButton(InvoiceListAndSearch.FinancialTab, 2000);
//        operation.ClickButton(InvoiceListAndSearch.InvoicesTab, 2000);
        operation.writeInputText(InvoiceListAndSearch.SearchField,"INV-000004",3000);
        operation.clickButton(InvoiceListAndSearch.SearchButton,200);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,InvoiceListAndSearch.PartiallyPaidStatus));
    }

//    @Test(priority = 1)//Done
//    @TestParameters(testCaseId = {"TC-58"})
//    public void TC_58_CheckLoadMoreButtonBelowTheInvoiceTable() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
////        loginPage.VerifyValidLogin();
////        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
////        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,ChargerListPropertyAdmin.LoadMoreButton));
//    }
//    @Test(priority = 17)//Done
//    @TestParameters(testCaseId = {"TC-59"})
//    public void TC_59_CheckLoadMoreButtonNumber() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
////        loginPage.VerifyValidLogin();
////        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
////        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        Assert.assertTrue(dashBoardLoadMoreFunctionality.verifyloadMoreButtonNumber());
//    }
//
//    @Test(priority = 18)//Done
//    @TestParameters(testCaseId = {"TC-60,61,62"})
//    public void TC_60_61_62_CheckLoadMoreButtonAction() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        ChargerListPropertyAdmin chargerList =new ChargerListPropertyAdmin(driver);
////        loginPage.VerifyValidLogin();
////        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
////        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        Assert.assertTrue(chargerList.verifyLoadMoreButtonAction());
//    }
//    @Test(priority = 19)//Done
//    @TestParameters(testCaseId = {"TC-63"})
//    public void TC_63_CheckCountOnTopOfTheLoadMoreButtonIncrease() throws InterruptedException {
//        Dashboard dashboard = new Dashboard(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.RefreshBrowser());
////        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
////        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyLoadMoreButtonActionWithAboveShowingCount()));
//    }
//
//
//
//    @Test(priority = 20)//Done
//    @TestParameters(testCaseId = {"TC-64"})
//    public void TC_64_CheckCountOnTheLeftSideOfTheLoadMoreButtonIncrease() throws InterruptedException {
//        Dashboard dashboard = new Dashboard(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
////        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.RefreshBrowser());
////        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
////        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyLoadMoreButtonActionWithShowingCount()));
//    }
//
//    @Test(priority = 21)//Done
//    @TestParameters(testCaseId = {"TC-66"})
//    public void TC_65_CheckTotalCountNumberIsMatchedWithTableData() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        ChargerListPropertyAdmin chargerList =new ChargerListPropertyAdmin(driver);
////        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
////        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
////        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        Assert.assertTrue((chargerList.verifyTheWithTable()));
//    }
//
//
//    @Test(priority = 22)//Done
//    @TestParameters(testCaseId = {"TC-66"})
//    public void TC_66_CheckTotalCountShowingBelowTheInvoiceTable() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
////        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
////        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
////        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyTotalCountIsShowing()));
//    }
//
//    @Test(priority = 23)//Done
//    @TestParameters(testCaseId = {"TC-70"})
//    public void TC_70_71_CheckWhatHappensWhenAdminRefreshThePageWhileClickingLoadMoreButton() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        InvoiceListAndSearch invoiceList = new InvoiceListAndSearch(driver);
//        ChargerListPropertyAdmin chargerList =new ChargerListPropertyAdmin(driver);
////        loginPage.VerifyValidLogin();
////        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
////        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        Assert.assertTrue(chargerList.verifyTableDataAfterRefreshing());
//    }
//
//    @Test(priority =24)//Done
//    @TestParameters(testCaseId = {"TC-72"})
//    public void TC_72_CheckTableDataCountDecreasingBelowTheTableAfterRefreshing() throws InterruptedException {
//        Dashboard dashboard = new Dashboard(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        BasePage basePage = new BasePage(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
//        loginPage.VerifyValidLogin();
////        Assert.assertTrue(dashboard.RefreshBrowser());
////        operation.ClickButton(InvoiceListAndSearch.FinancialTab,2000);
////        operation.ClickButton(InvoiceListAndSearch.InvoicesTab,2000);
//        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyShowingCountisDecreasingAfterRefreshing()));
//    }





}


