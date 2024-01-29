package tests.US201EINEditCompany;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class EINEditCompanyTestcase extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-82,83,84"})
    public void TC_82_83_84_CheckTheSeeDetailsButtonsUnderActionColumn() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
        createCharger.clickButton(EditCompany.searchbtn, 1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn, 3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-85,86"})
    public void TC_85_86_CheckWhatHappensWhenClickOnTheShowButtonAsCOSAdmin () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
//            Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//            Assert.assertTrue(dashboard.ClickonCompanyManagement());
//            createCharger.writeInputText(EditCompany.searchbar,"Tesla company 2",5000);
//            createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinNumberGetEnabled());

    }
    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-87"})
    public void TC_87_CheckEinFieldAfterClosingTheEditDrawerAndThenOpeningTheEditDrawerAgainAsCOSAdmin () throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        editCompany.ClickCancelbutton();
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());

    }
    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-88"})
    public void TC_88_89_90_CheckEINAfterEditing() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Thread.sleep(3000);
        customerSignUp.fieldClear(EditCompany.searchbar);
        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
        createCharger.clickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinSaving());
        Assert.assertTrue(editCompany.verifyAuditLogStatusForEinChange());
        createCharger.clickButton(EditCompany.HideButtonEin,3000);

    }
    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,4000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5645657567567567567",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_2_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5445  6765765",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_3_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5--67567567567",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_4_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"22-4523789",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_5_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"aaertyuwe",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_6_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLogin();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"er-yqsdert",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_7_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        loginPage.verifyValidLogin();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"1234567as",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }



    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-92,93,94"})
    public void TC_92_93_94_CheckTheSeeDetailsButtonsUnderActionColumn() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        Thread.sleep(4000);
        loginPage.verifyValidLoginForCosAccounting();
        Thread.sleep(2000);
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
        createCharger.clickButton(EditCompany.searchbtn, 1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn, 3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());
    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-85"})
    public void TC_95_96_CheckWhatHappensWhenClickOnTheShowButtonAsCOSAdmin () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosAccounting();
        dashboard.refreshBrowser();
//            Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//            Assert.assertTrue(dashboard.ClickonCompanyManagement());
//            createCharger.writeInputText(EditCompany.searchbar,"Tesla company 2",5000);
//            createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinNumberGetEnabled());

    }
    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-97"})
    public void TC_97_CheckEinFieldAfterClosingTheEditDrawerAndThenOpeningTheEditDrawerAgainAsCOSAdmin () throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosAccounting();
        editCompany.ClickCancelbutton();
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());

    }
    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-98,99,100"})
    public void TC_98_99_100_CheckEINAfterEditing() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosAccounting();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Thread.sleep(3000);
        customerSignUp.fieldClear(EditCompany.searchbar);
        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
        createCharger.clickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinSaving());
        Assert.assertTrue(editCompany.verifyAuditLogStatusForEinChange());
        createCharger.clickButton(EditCompany.HideButtonEin,3000);

    }
    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-101"})
    public void TC_101_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,4000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5645657567567567567",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-101"})
    public void TC_101_2_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosAccounting();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5445  6765765",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-101"})
    public void TC_101_3_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosAccounting();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5--67567567567",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-101"})
    public void TC_101_4_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosAccounting();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"22-4523789",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-101"})
    public void TC_101_5_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosAccounting();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"aaertyuwe",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-101"})
    public void TC_101_6_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosAccounting();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"er-yqsdert",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-101"})
    public void TC_101_7_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        loginPage.verifyValidLoginForCosAccounting();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"1234567as",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-102,103,104"})
    public void TC_102_103_104_CheckTheSeeDetailsButtonsUnderActionColumn() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        Thread.sleep(4000);
        loginPage.verifyValidLoginForCosPropertySupport();
        Thread.sleep(2000);
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
        createCharger.clickButton(EditCompany.searchbtn, 1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn, 3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());
    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-105,106"})
    public void TC_105_106_CheckWhatHappensWhenClickOnTheShowButtonAsCOSAdmin () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosPropertySupport();;
        dashboard.refreshBrowser();
//            Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//            Assert.assertTrue(dashboard.ClickonCompanyManagement());
//            createCharger.writeInputText(EditCompany.searchbar,"Tesla company 2",5000);
//            createCharger.ClickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinNumberGetEnabled());

    }
    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-107"})
    public void TC_107_CheckEinFieldAfterClosingTheEditDrawerAndThenOpeningTheEditDrawerAgainAsCOSAdmin () throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosPropertySupport();;
        editCompany.ClickCancelbutton();
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());

    }
    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-108,109,110"})
    public void TC_108_109_110_CheckEINAfterEditing() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosPropertySupport();;
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        Thread.sleep(3000);
        customerSignUp.fieldClear(EditCompany.searchbar);
        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
        createCharger.clickButton(EditCompany.searchbtn,1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,2000);
        Assert.assertTrue(editCompany.verifyEinSaving());
        Assert.assertTrue(editCompany.verifyAuditLogStatusForEinChange());
        createCharger.clickButton(EditCompany.HideButtonEin,3000);

    }
    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-111"})
    public void TC_111_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
        createCharger.clickButton(EditCompany.ShowButtonEin,4000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5645657567567567567",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-111"})
    public void TC_111_2_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5445  6765765",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-111"})
    public void TC_111_3_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"5--67567567567",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-111"})
    public void TC_111_4_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"22-4523789",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-111"})
    public void TC_111_5_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"aaertyuwe",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-111"})
    public void TC_111_6_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"er-yqsdert",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());

    }
    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-111"})
    public void TC_111_7_CheckWhatHappensWhenIProvideInvalidEINumber () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        loginPage.verifyValidLoginForCosPropertySupport();
////        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar,"Selenium Company (Automation purpose)",5000);
//        createCharger.ClickButton(EditCompany.searchbtn,1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn,3000);
//        createCharger.ClickButton(EditCompany.ShowButtonEin,2000);
        customerSignUp.fieldClear(company.ein);
        createCharger.writeInputText(company.ein,"1234567as",2500);
        Assert.assertTrue(company.clickOnSaveButton());;
        Assert.assertTrue(editCompany.verifyErrorMsgForInvalidEINInput());
        dashboardPropertyDetails.LogoutFromExistingAccount();


    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-112,113,114"})
    public void TC_112_113_114_CheckEinNumberAfterOpeningTheEditDrawerAsCOSDriverSupport() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        Thread.sleep(4000);
        loginPage.verifyValidLoginForCosDriverSupport();
        Thread.sleep(2000);
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
        createCharger.clickButton(EditCompany.searchbtn, 1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn, 3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());
    }
    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-115"})
    public void TC_115_CheckEinNumberAfterOpeningTheEditDrawerAsCOSDriverSupport() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
//        loginPage.VerifyValidLoginForCosDriverSupport();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
//        createCharger.ClickButton(EditCompany.searchbtn, 1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn, 3000);
        Assert.assertTrue(editCompany.verifyShowButtonDisabled());
    }
    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-116"})
    public void TC_116_CheckWhatHappensWhenIClickOnTheShowButtonAsCOSDriverSupport () throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
//        Thread.sleep(4000);
//        loginPage.VerifyValidLoginForCosDriverSupport();
//        Thread.sleep(2000);
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
//        createCharger.ClickButton(EditCompany.searchbtn, 1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn, 3000);
        createCharger.clickButton(EditCompany.DisabledShowButton, 3000);
        Assert.assertTrue(editCompany.verifyShowButtonClickable());
    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-117"})
    public void TC_117_CheckEinFieldAfterClosingTheEditDrawerAndThenOpeningTheEditDrawerAgainAsCOSDriverSupport() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosDriverSupport();
        editCompany.ClickCancelbutton();
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());

    }
    @Test(priority = 38)//Done
    @TestParameters(testCaseId = {"TC-118"})
    public void TC_118_CheckEinNumberAfterOpeningTheEditDrawerAsCOSDriverSupport() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLoginForCosDriverSupport();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
//        createCharger.ClickButton(EditCompany.searchbtn, 1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn, 3000);
        Assert.assertTrue(editCompany.verifyShowButtonDisabled());
        dashboardPropertyDetails.LogoutFromExistingAccount();

    }

    @Test(priority = 39)//Done
    @TestParameters(testCaseId = {"TC-119,120,121"})
    public void TC_119_120_121_CheckEinNumberAfterOpeningTheEditDrawerAsCOSTechSupport() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        Thread.sleep(4000);
        loginPage.verifyValidLoginForCosTechSupport();
        Thread.sleep(2000);
        Assert.assertTrue(dashboard.clickOnCompanyFromLeftMenuBar());
        Assert.assertTrue(dashboard.clickOnCompanyManagement());
        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
        createCharger.clickButton(EditCompany.searchbtn, 1000);
        createCharger.clickButton(EditCompany.EditCompanyBtn, 3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());
    }
    @Test(priority = 40)//Done
    @TestParameters(testCaseId = {"TC-122"})
    public void TC_122_CheckEinNumberAfterOpeningTheEditDrawerAsCOSTechSupport() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
//        loginPage.VerifyValidLoginForCosTechSupport();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
//        createCharger.ClickButton(EditCompany.searchbtn, 1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn, 5000);
        Assert.assertTrue(editCompany.verifyShowButtonDisabled());
    }
    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-123"})
    public void TC_123_CheckWhatHappensWhenIClickOnTheShowButtonAsCOSTechSupport() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
//        Thread.sleep(4000);
//        loginPage.VerifyValidLoginForCosDriverSupport();
//        Thread.sleep(2000);
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
//        createCharger.ClickButton(EditCompany.searchbtn, 1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn, 3000);
        createCharger.clickButton(EditCompany.DisabledShowButton, 3000);
        Assert.assertTrue(editCompany.verifyShowButtonClickable());
    }

    @Test(priority = 42)//Done
    @TestParameters(testCaseId = {"TC-124"})
    public void TC_124_CheckEinFieldAfterClosingTheEditDrawerAndThenOpeningTheEditDrawerAgainAsCOSTechSupport() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.verifyValidLoginForCosTechSupport();
        editCompany.ClickCancelbutton();
        createCharger.clickButton(EditCompany.EditCompanyBtn,3000);
        Assert.assertTrue(editCompany.verifyHiddenEINNumberAndShowButton());

    }
    @Test(priority = 43)//Done
    @TestParameters(testCaseId = {"TC-125"})
    public void TC_125_CheckEinNumberAfterOpeningTheEditDrawerAsCOSTechSupport() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
//        loginPage.VerifyValidLoginForCosDriverSupport();
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        createCharger.writeInputText(EditCompany.searchbar, "Tesla company 2", 5000);
//        createCharger.ClickButton(EditCompany.searchbtn, 1000);
//        createCharger.ClickButton(EditCompany.EditCompanyBtn, 3000);
        Assert.assertTrue(editCompany.verifyShowButtonDisabled());
    }










}
