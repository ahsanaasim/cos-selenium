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
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,2000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.BasicInformation));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.FessInformation));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.FeeModifier));

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
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.SessionFeeNameField));
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
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
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


    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckFeeModifierSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
////        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.FeeModifierEffectRates,feeStructure.FeeModifierAffectTheRates()));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(1000,CreateFeeStructure.FeeModifierNameField));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.FeeModifierNameFieldTitle));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.FeeModifierRateField));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.FeeModifierRateFieldTitle));

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckRequiredMsgForAllField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.FeeStructureNameRequired,"Fee structure name is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.SessionNameRequired,"Session fee name is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.SessionFeeRateRequired,"Session fee rate is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.UtilizationFeeNameRequired,"Utilization fee name is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.UtilizationFeeRateRequired,"Utilization fee rate is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.GracePeriodRequired,"Grace period is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.GracePeriodFeeRequired,"Grace period fee is required"));


    }




    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckRequiredAlertForFeeStructureNameAfterClearingField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated",500);
        operation.FieldClear(CreateFeeStructure.FeeStructureNameField);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.FeeStructureNameRequired,"Fee structure name is required"));
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"2",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"9",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"8",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.FeeStructureNameRequired,"Fee structure name is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }



    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckRequiredAlertForFeeStructureNameForEmptyField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
//        operation.writeInputText(CreateFeeStructure.FeeStructureNameField," ",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",1500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"2",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"9",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"8",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.FeeStructureNameRequired,"Fee structure name is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }


    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckRequiredAlertForFeeStructureNameForSpaceInput() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField," ",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",1500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"2",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"9",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"8",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.FeeStructureNameRequired,"Fee structure name is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }


    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_17_CheckRequiredAlertForSessionFeeNameAndRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"2",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"9",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"8",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee name is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert2,"Session fee rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }


    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckRequiredAlertForSessionFeeNameAndRateForSpaceInput() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField," ",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField," ",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"9",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"8",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee name is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert2,"Session fee rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckRequiredAlertForSessionFeeRateAfterClearingField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.FieldClear(CreateFeeStructure.SessionFeeNameField);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee name is required"));
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"2",500);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert2,"Session fee rate is required"));
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"9",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"8",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee name is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert2,"Session fee rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckRequiredAlertForSessionFeeRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField," ",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"9",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"8",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }


    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckRequiredAlertForUtilizationFeeNameAndRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"2",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField," ",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField," ",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"8",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee name is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert2,"Utilization fee rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckRequiredAlertForUtilizationFeeNameAndRateWhenDataIsCleared() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"2",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField," ",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee name is required"));
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"5",500);
        operation.FieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        Assert.assertTrue(feeStructure.verifyTextMatching(800,CreateFeeStructure.Alert2,"Utilization fee rate is required"));
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"8",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee name is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert2,"Utilization fee rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CheckRequiredAlertForGracePeriodAndIdleFeeRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"2",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
//        operation.writeInputText(CreateFeeStructure.GracePeriodField,"",500);
//        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"8",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert2,"Grace period fee is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckRequiredAlertForGracePeriodAndIdleFeeRateWhenFieldIsCleared() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"2",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
        operation.FieldClear(CreateFeeStructure.GracePeriodField);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period is required"));
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.FieldClear(CreateFeeStructure.IdleFeeRateField);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert2,"Grace period fee is required"));
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period is required"));
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert2,"Grace period fee is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }


    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_CheckRequiredAlertForFeeModifierRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"2",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Fee modifier rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }


    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_CheckRequiredAlertForFeeModifierName() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"2",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"10",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Fee modifier name is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_CheckInvalidInputForSessionFeeRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"0",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee rate is not valid"));
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee rate is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_CheckInvalidInputForSessionFeeRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
//        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"-2",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee rate is not valid"));
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
//        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
//        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
//        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"10",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee rate is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }


    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-28.2"})
    public void TC_28_2_CheckInvalidInputForSessionFeeRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
//        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"-90",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee rate is not valid"));
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
//        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
//        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
//        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"10",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee rate is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_CheckInvalidInputForSessionFeeRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
//        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"@@",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee rate is required"));
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
//        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
//        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
//        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"10",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-29.2"})
    public void TC_29_2_CheckInvalidInputForSessionFeeRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
//        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"///",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee rate is required"));
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
//        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
//        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
//        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"10",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }


    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_CheckInvalidInputForUtilizationFeeRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"0",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is not valid"));
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_CheckInvalidInputForUtilizationFeeRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
//        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.FieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"-52.22",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is not valid"));
//        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
//        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
//        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"10",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }


    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-31.2"})
    public void TC_31_2_CheckInvalidInputForUtilizationFeeRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
//        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.FieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"-8",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is not valid"));
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
//        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
//        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
//        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"10",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_CheckInvalidInputForUtilizationFeeRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
//        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.FieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"@@",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is required"));
//        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
//        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
//        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"10",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-32.2"})
    public void TC_32_2_CheckInvalidInputForUtilizationFeeRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
//        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.FieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"///",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is required"));
//        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
//        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
//        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"10",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }



    @Test(priority = 38)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_CheckInvalidInputForUtilizationFeeRateMinBased() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.ClickButton(CreateFeeStructure.KWhBasedFee,500);
        operation.ClickButton(CreateFeeStructure.MinBasedFeeFromOption,500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"-8",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is not valid"));
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 39)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_CheckInvalidInputForUtilizationFeeRateMinBased() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.ClickButton(CreateFeeStructure.KWhBasedFee,500);
        operation.ClickButton(CreateFeeStructure.MinBasedFeeFromOption,500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField," ",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 40)//Done
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_CheckInvalidInputForUtilizationFeeRateMinBased() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.ClickButton(CreateFeeStructure.KWhBasedFee,500);
        operation.ClickButton(CreateFeeStructure.MinBasedFeeFromOption,500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"0",500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is not valid"));
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void TC_36_CheckInvalidInputForUtilizationFeeRateMinBased() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
//        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
//        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
//        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
//        operation.ClickButton(CreateFeeStructure.KWhBasedFee,500);
//        operation.ClickButton(CreateFeeStructure.MinBasedFeeFromOption,500);
        operation.FieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"@@",500);
//        operation.writeInputText(CreateFeeStructure.GracePeriodField,"5",500);
//        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is required"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 42)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_CheckGracePeriodForLessThanTenMinutes() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"0",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 43)//Done
    @TestParameters(testCaseId = {"TC-37.1"})
    public void TC_37_1_CheckGracePeriodForLessThanTenMinutes() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"1.25",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period must be at least 3 minutes"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }
    @Test(priority = 44)//Done
    @TestParameters(testCaseId = {"TC-37.2"})
    public void TC_37_2_CheckGracePeriodForLessThanTenMinutes() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"2.99",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period must be at least 3 minutes"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-37.3"})
    public void TC_37_3_CheckGracePeriodForLessThanTenMinutes() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"1",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period must be at least 3 minutes"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 46)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_CheckGracePeriodForInvalidValue() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"-2",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 47)//Done
    @TestParameters(testCaseId = {"TC-38.2"})
    public void TC_38_2_CheckGracePeriodForInvalidValue() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"-2",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"20",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 48)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_CheckGracePeriodRateForInValidValue() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"-2",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period fee is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 49)//Done
    @TestParameters(testCaseId = {"TC-39.2"})
    public void TC_39_2_CheckGracePeriodRateForInValidValue() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"-65",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period fee is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 50)//Done
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_40_CheckInvalidValueForFeeModifierRateField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"0",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"0",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Fee Modifier rate is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 51)//Done
    @TestParameters(testCaseId = {"TC-40.2"})
    public void TC_40_2_CheckInvalidValueForFeeModifierRateField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"0",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"-5",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Fee Modifier rate is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-40.3"})
    public void TC_40_3_CheckInvalidValueForFeeModifierField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"0",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"-1",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Fee Modifier rate is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }


    @Test(priority = 53)//Done
    @TestParameters(testCaseId = {"TC-40.4"})
    public void TC_40_4_CheckInvalidValueForFeeModifierField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"0",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"-500",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Fee Modifier rate is not valid"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 54)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_CheckValueAboveHundredForFeeModifierField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"0",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"100.01",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Fee Modifier can't be more than 100%"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 55)//Done
    @TestParameters(testCaseId = {"TC-41.1"})
    public void TC_41_1_CheckValueAboveHundredForFeeModifierField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField,"Automated fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"12",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"0",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",500);
        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"120",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Fee Modifier can't be more than 100%"));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.DrawerTitle));


    }

    @Test(priority = 56)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_CheckSessionFeeIsUpdated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifySessionFeeIsUpdating());;


    }


    @Test(priority = 58)//Done
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_CheckUtilizationFeeIsUpdated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyUtilizationFeeIsUpdating());


    }

    @Test(priority = 59)//Done
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_CheckIdleFeeIsUpdated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyIdleFeeIsUpdating());


    }
    @Test(priority = 60)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_CheckFeeModifierIsUpdated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        Assert.assertTrue(feeStructure.verifyFeeModifierIsUpdating());

    }

    @Test(priority = 61)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_CheckSessionFeeIsUpdatingToZeroAfterClearingField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"56",1500);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        Assert.assertTrue(feeStructure.verifyFeeIsUpdatingToZeroAfterClearingField(feeStructure.SessionFeeExtractor()));


    }

    @Test(priority = 62)//Done
    @TestParameters(testCaseId = {"TC-48"})
    public void TC_48_CheckUtilizationFeeIsUpdatingToZeroAfterClearingField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"13.06",1500);
        operation.FieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        Assert.assertTrue(feeStructure.verifyFeeIsUpdatingToZeroAfterClearingField(feeStructure.UtilizationFeeExtractor()));


    }

    @Test(priority = 63)//Done
    @TestParameters(testCaseId = {"TC-49"})
    public void TC_49_CheckIdleFeeIsUpdatingToZeroAfterClearingField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"16.2",1500);
        operation.FieldClear(CreateFeeStructure.IdleFeeRateField);
        Assert.assertTrue(feeStructure.verifyFeeIsUpdatingToZeroAfterClearingField(feeStructure.IdleFeeExtractor()));


    }

    @Test(priority = 64)//Done
    @TestParameters(testCaseId = {"TC-50"})
    public void TC_50_CheckFeeModifierIsUpdatingToZeroAfterClearingField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(CreateFeeStructure.CreateFeeStructure,1000);
        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"10.00",1500);
        operation.FieldClear(CreateFeeStructure.FeeModifierRateField);
        Assert.assertTrue(feeStructure.verifyFeeIsUpdatingToZeroAfterClearingField(feeStructure.FeeModifierExtractor()));


    }

    @Test(priority = 70)//Done
    @TestParameters(testCaseId = {"TC-51"})
    public void TC_51_CheckFeeStructureIsCreatedSuccessfullyForValidInfo() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
        operation.writeInputText(CreateFeeStructure.FeeStructureNameField, feeStructure.GenerateFeeName(),500);
        operation.writeInputText(CreateFeeStructure.SessionFeeNameField,"Session fee",500);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeNameField,"Utilization Fee",500);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,"10",500);
        operation.writeInputText(CreateFeeStructure.GracePeriodField,"4",500);
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,"1.5",500);
//        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",500);
//        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"100.01",500);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,500);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.FeeStructureCreatedSuccessfully,"Fee structure created successfully"));
        Assert.assertTrue(feeStructure.verifyElementNotDisplayed(2000,CreateFeeStructure.DrawerTitle));



    }


















}
