package tests.US204DownCharger;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.io.IOException;

public class DownChargerTestCases extends BaseTest {


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckAlertIconOfDownChargersBelowTheDashboardTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        loginPage.VerifyValidLogin();
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
        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
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
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,CreateCharger.searchchargerfield));

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
        dashboard.RefreshBrowser();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,DownCharger.DownChargerTag));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,CreateCharger.searchargerbtn));

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

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckLoadMoreButtonUnderTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(downCharger.verifyFieldUnderColumnContainsExpectedContent(ChargerListPropertyAdmin.LoadMoreButton));

    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-28,29,30,31"})
    public void TC_28_29_30_31_CheckWhatHappensWhenDownChargersLocationIsMakingOffline() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        dashboard.GotoDashboard();
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
        loginPage.VerifyValidLogin();
        dashboard.GotoDashboard();
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
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        operation.ClickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
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
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        operation.ClickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
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
        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        operation.ClickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
        operation.ClickButton(DownCharger.UncheckDownChargerFilter,1500);
        operation.ClickButton(InvoiceFilter.ApplyButton,1500);
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
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        operation.ClickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
//        operation.ClickButton(DownCharger.CheckedDownChargerFilter,1500);
        operation.ClickButton(InvoiceFilter.ClearAllTag,1500);
        Assert.assertTrue(basePage.verifyElementNotDisplayed(2000,InvoiceFilter.NoDataFoundInTable));



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
        loginPage.VerifyValidLogin();
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
        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        operation.ClickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
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
        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
        operation.ClickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
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
        operation.ClickButton(InvoiceFilter.ResetAllButton,1500);
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
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        operation.ClickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        downCharger.GotoFauledCharger();
//        operation.ClickButton(InvoiceFilter.ApplyButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,DownCharger.BrokenChargerErrorMsg));

    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_CheckWhatHappensAfterScanningADownCharger() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        operation.ClickButton(DownCharger.DownChargerSeeDetails,1500);
//        operation.ClickButton(AdvanceFilterPropertyAdmin.AdvanceFilter,1500);
//        guestFlow.NewTabOpenAndSwitchToNewTab(1);
//        downCharger.GotoFauledCharger();
//        operation.ClickButton(InvoiceFilter.ApplyButton,1500);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(2000,GuestFlow.PageTitleBrokenCharger));

    }


}
