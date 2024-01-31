package tests.US204DownCharger;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

public class DownChargerTestCases extends BaseTest {


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckAlertIconOfDownChargersBelowTheDashboardTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.AlertIcon));

    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckAlertTextOfDownChargersBelowTheDashboardTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
//        loginPage.VerifyValidLogin();
        Assert.assertTrue(downCharger.verifyDownChargerAlertText());

    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckTheSeeDetailsButtonOnDownChargersAlert() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerSeeDetails));

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckWhatHappensAfterClickingOnSeeDetailsButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
        operation.clickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTag));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.ChargerPageTitle));

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckTheTitleOfDownChargerPageList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTag));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.ChargerPageTitle));

    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckTheSearchBox() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger chargerlist = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTag));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,CreateCharger.searchChargerField));

    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckThePlaceholderOfSearchBox() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTag));
        Assert.assertTrue(downCharger.verifySearchBoXPlaceholder());

    }
    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckTheSearchBoxButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard=new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTag));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,CreateCharger.searchChargerBtn));

    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckTheAdddvanceFilterButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTag));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,AdvanceFilterPropertyAdmin.AdvanceFilter));

    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckTheShowingChargersSectionAboveTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTag));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,ChargerListPropertyAdmin.ChargerCountTop));
        Assert.assertTrue(chargerList.verifyChargerCountOnTop());

    }
    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckTheDownChargersFilterTagAboveTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTag));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTag));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTagCross));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.ClearAllTag));

    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckTheClearAllFilterTagAboveTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.ClearAllTag));

    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckAllTheColumnTitleOfDownChargerList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,ChargerListPropertyAdmin.ChargerColumn));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,ChargerListPropertyAdmin.PropertyNameColumn));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,ChargerListPropertyAdmin.PropertyAddressColumn));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,ChargerListPropertyAdmin.LocationNameColumn));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,ChargerListPropertyAdmin.ActionColumn));

    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckEditButtonUnderActionColumn() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.EditButton));

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckNameOfTheChargersUnderChargerTitleColumn() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(downCharger.verifyFieldUnderColumnContainsExpectedContent(ChargerListPropertyAdmin.ChargerTitle));

    }
    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckLocationNameUnderTheLocationTitleColumn() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(downCharger.verifyFieldUnderColumnContainsExpectedContent(ChargerListPropertyAdmin.LocationName));

    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckPropertyAddressUnderThePropertyAddressColumn() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(downCharger.verifyFieldUnderColumnContainsExpectedContent(ChargerListPropertyAdmin.PropertyAddress));
        Assert.assertTrue(downCharger.verifyFieldUnderColumnContainsExpectedContent(ChargerListPropertyAdmin.PropertyName));

    }

//    @Test(priority = 18)//Done
//    @TestParameters(testCaseId = {"TC-19"})
//    public void TC_19_CheckLoadMoreButtonUnderTable() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        BasePage basePage = new BasePage(driver);
//        DownCharger downCharger = new DownCharger(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(downCharger.verifyFieldUnderColumnContainsExpectedContent(ChargerListPropertyAdmin.LoadMoreButton));
//
//    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-28,29,30,31"})
    public void TC_28_29_30_31_CheckWhatHappensWhenDownChargersLocationIsMakingOffline() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.gotoDashboard();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(downCharger.verifyDownChargerIsRemovingFromTheListAfterMakingLocationOffline());

    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-32,33,34,35"})
    public void TC_32_33_34_35_CheckWhatHappensWhenDownChargersLocationIsMakingOffline() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.gotoDashboard();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(downCharger.verifyDownChargerIsAddingInTheListAfterMakingLocationOnline());

    }




    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_CheckDownChargersFilterUnderChargerStatusOfAdvanceFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        operation.clickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerInAdvanceFilter));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.UncheckDownChargerFilter));

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_40_CheckByDefaultDownChargersFilterUncheckedInAdvanceFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(dashboard.refreshBrowser());
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        operation.clickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.UncheckDownChargerFilter));

    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_CheckWhatHappensAfterSelectingDownChargersFilterFromAdvanceFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        loginPage.verifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(dashboard.refreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        operation.clickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
        operation.clickButton(DownCharger.UncheckDownChargerFilter,1500);
        operation.clickButton(InvoiceFilter.ApplyButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,DownCharger.DownChargerTag));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTagCross));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.ClearAllTag));

    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_CheckWhatHappensAfterSelectingDownChargersFilterFromAdvanceFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        operation.ClickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
//        operation.ClickButton(DownCharger.UncheckDownChargerFilter,1500);
//        operation.ClickButton(InvoiceFilter.ApplyButton,1500);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTag));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTagCross));
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,InvoiceFilter.ClearAllTag));
        Assert.assertTrue(chargerList.verifyChargerCountOnTop());


    }
    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_CheckChargersWithDownStatusShowingTheList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
        SearchChargers searchChargers = new SearchChargers(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        operation.ClickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
//        operation.ClickButton(DownCharger.UncheckDownChargerFilter,1500);
//        operation.ClickButton(InvoiceFilter.ApplyButton,1500);
//        Assert.assertTrue(basePage.verifyElementNotDisplayed(5000,InvoiceFilter.NoDataFoundInTable));
        Assert.assertTrue(searchChargers.verifyChargerWithSelectedtagAreShowingonChargersPage());


    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_CheckWhatHappensAfterClearingDownChargersTag() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.gotoDashboard());
        operation.clickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        operation.clickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
        operation.clickButton(DownCharger.UncheckDownChargerFilter,1500);
        operation.clickButton(InvoiceFilter.ApplyButton,1500);
        operation.clickButton(InvoiceFilter.ClearAllTag,1500);
        Assert.assertTrue(downCharger.verifyAnElementDisplayedOrNot(200,SearchCompany.Spiner));
        Assert.assertTrue(downCharger.verifyElementNotDisplayed(3000,InvoiceFilter.NoDataFoundInTable));


    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_CheckWhatHappensAfterClearingDownChargersTag() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
        loginPage.verifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        operation.ClickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
//        operation.ClickButton(DownCharger.CheckedDownChargerFilter,1500);
//        operation.ClickButton(InvoiceFilter.ApplyButton,1500);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,DownCharger.DownChargerTag));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,InvoiceFilter.ClearAllTag));

    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_CheckDownFilterCheckboxUnselectFromTheDrawerAfterClearingDownChargersTag() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
        loginPage.verifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        operation.clickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
//        operation.ClickButton(DownCharger.CheckedDownChargerFilter,1500);
//        operation.ClickButton(InvoiceFilter.ApplyButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,DownCharger.UncheckDownChargerFilter));

    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_CheckDownChargerFilterIsCheckedInAdvanceFilterWhenNavigateFromDownChargersDashboardalert() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
        loginPage.verifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.gotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        operation.clickButton(DownCharger.DownChargerSeeDetails,1500);
        operation.clickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
//        operation.ClickButton(DownCharger.CheckedDownChargerFilter,1500);
//        operation.ClickButton(InvoiceFilter.ApplyButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,DownCharger.CheckedDownChargerFilter));

    }

    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-48"})
    public void TC_48_CheckWhatHappensAfterClickingOnResetAllWhenDownChargerFilterIsChecked() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        operation.ClickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
        operation.clickButton(InvoiceFilter.ResetAllButton,1500);
//        operation.ClickButton(InvoiceFilter.ApplyButton,1500);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,DownCharger.DownChargerTag));
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,InvoiceFilter.ClearAllTag));

    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_CheckWhatHappensAfterScanningADownCharger() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        loginPage.verifyValidLogin();
        guestFlow.GoToSimulator();
        Assert.assertTrue(guestFlow.SelectChargerFromSimulator("Selenium 889"));
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        simulationPage.SelectChargerStatusFromSimulator("Faulted");
        operation.click(SimulationPage.ChargerStatusSaveButton);
        Assert.assertTrue(operation.clickButton(SimulationPage.ChargerQRCodeCopyLink,4000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(downCharger.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ChargerDownStatus));
        Assert.assertTrue(downCharger.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.PlugTypeForUnavailableChargers));
        Assert.assertTrue(downCharger.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.OfflineTextInBox));
        Assert.assertTrue(downCharger.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.ReportAProblem));
        Assert.assertTrue(downCharger.verifyAnElementDisplayedOrNot(200,GuestVerificationPage.AskCosaButton));
        Assert.assertTrue(downCharger.verifyElementNotDisplayed(200,GuestVerificationPage.StatChargingButton));
        Assert.assertTrue(downCharger.verifyElementNotDisplayed(200,GuestVerificationPage.ThanksForScanningTitle));

    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_CheckWhatHappensAfterMakingADownChargerToAvailableCharger() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        guestFlow.SwitchToTab(0);
//        loginPage.VerifyValidLogin();
//        guestFlow.GoToSimulator();
//        Assert.assertTrue(guestFlow.SelectChargerFromSimulator("Selenium 889"));
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        guestFlow.SwitchToTab(1);
        dashboard.refreshBrowser();
        Assert.assertTrue(downCharger.verifyTextMatching(3000,GuestVerificationPage.ChargerAvailableStatus,"Available Now"));
        Assert.assertTrue(downCharger.verifyAFieldIsDisable(1000,GuestVerificationPage.StatChargingButton));
        Assert.assertTrue(downCharger.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ThanksForScanningTitle));
        Assert.assertTrue(downCharger.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.ProvidePhnNumberTitle));
        Assert.assertTrue(downCharger.verifyAnElementDisplayedOrNot(1000,GuestVerificationPage.PhoneNumberField));

    }


}
