package tests.US178DashboardLoadMoreFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class LoadMoreFunctionalityTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_CheckLoadMoreButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdminWithTwentyPlusProperty();
        Assert.assertTrue((chargerListPropertyAdmin.verifyloadMoreButton()));
    }
    @Test(priority =2)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_CheckLoadMoreButtonNumber() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
        loginPage.VerifyValidLoginForPropertyAdminWithTwentyPlusProperty();
        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyloadMoreButtonNumber()));
    }
    @Test(priority =3)//Done
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_CheckWhatHappenedIfPadminClicksOnLoadMoreButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin =new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdminWithTwentyPlusProperty();
        Assert.assertTrue((chargerListPropertyAdmin.verifyLoadMoreButtonAction()));
    }
    @Test(priority =4)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_CheckShowingChargerCountIsIncreasingAfterLoadButtonClick() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
        loginPage.VerifyValidLoginForPropertyAdminWithTwentyPlusProperty();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyLoadMoreButtonActionWithShowingCount()));
    }
    @Test(priority =5)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_CheckTotalCountIsShowingBesideLoadMoreButton() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
        loginPage.VerifyValidLoginForPropertyAdminWithTwentyPlusProperty();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyTotalCountIsShowing()));
    }
    @Test(priority =6)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_CheckTotalCountNumberIsMatchedWithTableData() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin =new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdminWithTwentyPlusProperty();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue((chargerListPropertyAdmin.verifyTheWithTable()));
    }
    @Test(priority =7)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_CheckShowingCountIsDecreasingAfterRefreshing() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
        loginPage.VerifyValidLoginForPropertyAdminWithTwentyPlusProperty();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyShowingCountisDecreasingAfterRefreshing()));
    }
    @Test(priority =8)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_40_CheckTableDataCountAfterRefreshing() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin =new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLoginForPropertyAdminWithTwentyPlusProperty();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue((chargerListPropertyAdmin.verifyTableDataAfterRefreshing()));
    }
    @Test(priority =9)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_CheckTheLoadMoreButtonForEmptyView() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
        loginPage.VerifyValidLoginForPropertyAdminWithNoProperty();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyLoadmoreButtonNotExist()));
    }
    @Test(priority =10)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_CheckNoDataFoundForEmptyView() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
        loginPage.VerifyValidLoginForPropertyAdminWithNoProperty();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyNoDataFoundIsShowing()));
    }
    @Test(priority =11)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_CheckTheLoadMoreButtonWhenThereIsLessThanTheRequiredNumberOfPropertyList() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
        loginPage.VerifyValidLoginForPropertyAdminWithLessThanFiveProperty();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyLoadmoreButtonNotExist()));
    }



}
