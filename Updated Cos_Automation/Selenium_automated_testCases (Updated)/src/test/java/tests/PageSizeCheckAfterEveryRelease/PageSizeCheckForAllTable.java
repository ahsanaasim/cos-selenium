package tests.PageSizeCheckAfterEveryRelease;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class PageSizeCheckForAllTable extends BaseTest {

    Properties prop = ConfigUtill.getConfig();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_VerifyPageSizeForCompanyPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.checkPageSize(EditCompany.editcompanybtn,prop.getProperty("PageSize")));

    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyPageSizeForEntityPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(company.checkPageSize(EditCompany.editcompanybtn,prop.getProperty("PageSize")));

    }


    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifyPageSizeForPropertyPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(company.checkPageSize(EditCompany.editcompanybtn,prop.getProperty("PageSize")));

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_VerifyPageSizeForLocationPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(company.checkPageSize(EditCompany.editcompanybtn,prop.getProperty("PageSize")));

    }


    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_VerifyPageSizeForChargerPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(company.checkPageSize(EditCompany.editcompanybtn,prop.getProperty("PageSize")));

    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyPageSizeForChargingSessionReportPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargingSession session = new ChargingSession(driver);
        loginPage.VerifyValidLogin();
        session.GoToChargingSessionPage();
        Assert.assertTrue(session.checkPageSize(ChargerListPropertyAdmin.detailsbutton,prop.getProperty("PageSize")));

    }


    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_7_VerifyPageSizeForInvoicePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        InvoiceListAndSearch invoice = new InvoiceListAndSearch(driver);
        loginPage.VerifyValidLogin();
        invoice.GoToInvoicePage();
        Assert.assertTrue(invoice.checkPageSize(ChargerListPropertyAdmin.detailsbutton,prop.getProperty("PageSizeForInvoicePage")));

    }


    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_VerifyPageSizeForAllUsersPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        AllUsers allUsers = new AllUsers(driver);
        loginPage.VerifyValidLogin();
        allUsers.GoToAllUsersPage();
        Assert.assertTrue(allUsers.checkPageSize(EditCompany.editcompanybtn,prop.getProperty("PageSize")));

    }






}
