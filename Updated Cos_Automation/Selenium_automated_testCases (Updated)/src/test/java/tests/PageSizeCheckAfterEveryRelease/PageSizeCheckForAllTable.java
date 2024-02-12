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
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Assert.assertTrue(company.checkPageSize(EditCompany.editcompanybtn,prop.getProperty("PageSizeInTest")));

    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyPageSizeForEntityPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnEntityManagement());
        Assert.assertTrue(company.checkPageSize(EditCompany.editcompanybtn,prop.getProperty("PageSizeInTest")));

    }


    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_VerifyPageSizeForPropertyPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnProperty());
        Assert.assertTrue(company.checkPageSize(EditCompany.editcompanybtn,prop.getProperty("PageSizeInTest")));

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_VerifyPageSizeForLocationPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(company.checkPageSize(EditCompany.editcompanybtn,prop.getProperty("PageSizeInTest")));

    }


    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_VerifyPageSizeForChargerPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(company.checkPageSize(EditCompany.editcompanybtn,prop.getProperty("PageSizeInTest")));

    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyPageSizeForChargingSessionReportPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargingSession session = new ChargingSession(driver);
        loginPage.verifyValidLogin();
        session.GoToChargingSessionPage();
        Assert.assertTrue(session.checkPageSize(ChargerListPropertyAdmin.detailsbutton,prop.getProperty("PageSizeInTest")));

    }


    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_7_VerifyPageSizeForInvoicePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        InvoiceListAndSearch invoice = new InvoiceListAndSearch(driver);
        loginPage.verifyValidLogin();
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
        loginPage.verifyValidLogin();
        allUsers.GoToAllUsersPage();
        Assert.assertTrue(allUsers.checkPageSize(EditCompany.editcompanybtn,prop.getProperty("PageSizeInTest")));

    }






}
