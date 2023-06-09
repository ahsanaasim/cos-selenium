package tests.US61CreateFeeStructure;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class FeeStructureTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();



    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckCreateAFeeStructureButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.CreateFeeStructure));


    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckCreateAFeeStructureDrawerTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,2000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,2000);
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));



    }


    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckTheTitlesForAllSections() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,2000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.BasicInformation));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.FessInformation));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.FeeModifier));

    }


    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckBasicInformationSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(1000,CreateFeeStructure.FeeStructureNameInputTitle,"*  Fee Structure Name"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(1000,CreateFeeStructure.FeeStructureNameField));
        Assert.assertTrue(feeStructure.verifyTextMatching(1000,CreateFeeStructure.NotifiedMsgUnderFeeStructureNameField,feeStructure.notifiedMsgUnderFeeStructureNameField()));

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckSessionFeeNameAndField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(1000,CreateFeeStructure.SessionFeeHeading,"Session Fee (Total: $0.00/ Session)"));
        Assert.assertTrue(feeStructure.verifyTextMatching(1000,CreateFeeStructure.TextUnderSessionFeeHeading,feeStructure.CustomerWillSeeAmountInReceipt()));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(1000,CreateFeeStructure.FeeStructureNameField));
        Assert.assertTrue(feeStructure.verifyTextMatching(1000,CreateFeeStructure.NotifiedMsgUnderFeeStructureNameField,feeStructure.notifiedMsgUnderFeeStructureNameField()));
        Assert.assertTrue(feeStructure.verifyTextMatching(1000,CreateFeeStructure.SessionFeeFieldTitle,"* Name"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.SessionFeeChargeText));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.SessionFeeAmountField));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.PerSessionText));



    }


    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckAddMoreSessionFee() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(1000,CreateFeeStructure.AddMoreSessionFeeButton));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.AddMoreSessionFeeText));



    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckUtilizationFeeHeading() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(1000,CreateFeeStructure.UtilizationFeeHeadingForkWh,"Utilization Fee (Total: $0.00/ per kWh)"));
        Assert.assertTrue(feeStructure.verifyTextMatching(1000,CreateFeeStructure.TextUnderUtilizationFeeHeading,feeStructure.CustomerWillSeeAmountInReceipt()));




    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-7.1"})
    public void TC_7_1_CheckUtilizationFeeNameAmountFieldAndTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(1000,CreateFeeStructure.UtilizationFeeFieldTitle,"* Name"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.UtilizationFeeNameField));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.UtilizationFeeChargeText));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.UtilizationFeeAmountField));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.UtilizationFeeUnit,"per kWh"));



    }

    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckUtilizationFeeChangeBox() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.ClickButton(CreateFeeStructure.KWhBasedFee,1000);
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.KWhBasedFeeFromOption));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(1000,CreateFeeStructure.MinBasedFeeFromOption));


    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckWhBasedIsSelectedByDefault() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(1000,CreateFeeStructure.KWhBasedFee));


    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckAddMoreUtilizationFeeButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(1000,CreateFeeStructure.AddMoreUtilizationFeeButton));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.AddMoreUtilizationFeeButton,"+ add more utilization fee"));


    }


    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckIdleFeeHeading() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.IdleFeeHeading,"Idle Fee (Total: $0.00/min)"));
        Assert.assertTrue(feeStructure.verifyTextMatching(1000,CreateFeeStructure.TextUnderIdleFeeHeading,feeStructure.CustomerWillSeeAmountInReceipt()));



    }
    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-11.2"})
    public void TC_11_2_CheckIdleFeeField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.IdleFeeGracePeriod,"* Grace Period"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(1000,CreateFeeStructure.GracePeriodField));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(1000,CreateFeeStructure.IdleFeeGracePeriodUnit));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.FeeAfterThat,"* Fee after that"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.IdleFeeRateField));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.IdleFeeRateUnit,"USD per minute"));


    }


//    @Test(priority = 14)//Done
//    @TestParameters(testCaseId = {"TC-12.2"})
//    public void TC_12_2_CheckIdleFeeField() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard=new Dashboard(driver);
//        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
////        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
//        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.IdleFeeGracePeriod,"* Grace Period"));
//        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(1000,CreateFeeStructure.GracePeriodField));
//        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(1000,CreateFeeStructure.IdleFeeGracePeriodUnit));
//        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.FeeAfterThat,"* Fee after that"));
//        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.IdleFeeRateField));
//        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.IdleFeeRateUnit,"USD per minute"));
//
//
//    }








}
