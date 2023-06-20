package tests.US65EditFeeStructure;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

public class EditFeeStructureTestCases extends BaseTest {

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckEditButtonForEditFeeStructure() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.ContiniousClickOnLoadMoreButton();
        Assert.assertTrue(list.verifyActionColumnOccupiedWithEditButton("Action",6));



    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckFeeDetailsDrawerTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(FeeStructureList.Edit,4000);
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(2000,CreateFeeStructure.BasicInformation));
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(500,CreateFeeStructure.FessInformation));
        Assert.assertTrue(editFee.verifyFeeModifierHeading());
        Assert.assertTrue(feeStructure.verifyAnElementDisplayedOrNot(1000,EditFeeStructure.AuditLog));



    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckEveryMandatoryFields() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        FeeStructureList list = new FeeStructureList(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        dashboard.RefreshBrowser();
        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,4000);
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(2000,CreateFeeStructure.FeeStructureNameField));
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(500,CreateFeeStructure.SessionFeeNameField));
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(500,CreateFeeStructure.SessionFeeAmountField));
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(500,CreateFeeStructure.UtilizationFeeNameField));
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(500,CreateFeeStructure.UtilizationFeeAmountField));
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(500,CreateFeeStructure.GracePeriodField));
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(500,CreateFeeStructure.IdleFeeRateField));


    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckSessionFeeIsUpdated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        String fee = list.GenerateFee();
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,fee,2000);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyUpdatedDataInTable(FeeStructureList.SessionFee1,fee));


    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckUtilizationFeeIsUpdated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        String fee = list.GenerateFee();
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,fee,2000);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyUpdatedDataInTable(FeeStructureList.UtilizationFee1,fee));


    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckIdleFeeIsUpdated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.IdleFeeRateField);
        String fee = list.GenerateFee();
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,fee,2000);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyUpdatedDataInTable(FeeStructureList.IdleFee1,fee));

    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckFeeModifierIsUpdated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Fee modifier test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.FeeModifierNameField);
        operation.FieldClear(CreateFeeStructure.FeeModifierRateField);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",2000);
        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"2.50",2000);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyTextMatching(3000,FeeStructureList.FeeModifier1,"2.50%"));

    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-7.2"})
    public void TC_7_2_CheckFeeModifierUpdatedToZeroIsShowingInTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.FeeModifierNameField);
        operation.FieldClear(CreateFeeStructure.FeeModifierRateField);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyTextMatching(3000,FeeStructureList.FeeModifier1,"0.00%"));

    }


    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckDrawerTitleIsShowingCorrectly() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        CreateCharger operation = new CreateCharger(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        Assert.assertTrue(editFee.verifyDrawerTitleMatchingWithTableData());

    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_10_CheckTotalOfMultipleSessionFeeIsShowingCorrectly() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        CreateCharger operation = new CreateCharger(driver);
        FeeStructureList list = new FeeStructureList(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Multiple fee test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        list.FieldClear(EditFeeStructure.FeeField1);
        list.FieldClear(EditFeeStructure.FeeField2);
        list.FieldClear(EditFeeStructure.FeeField3);
        operation.writeInputText(EditFeeStructure.FeeField1,list.GenerateFee(), 500);
        operation.writeInputText(EditFeeStructure.FeeField2,list.GenerateFee(),500);
        operation.writeInputText(EditFeeStructure.FeeField3,list.GenerateFee(),500);
        Assert.assertTrue(editFee.verifySumOfFeesInTableShowingCorrectly());

    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckTotalOfMultipleUtilizationFeesAreShowingCorrectly() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        CreateCharger operation = new CreateCharger(driver);
        FeeStructureList list = new FeeStructureList(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Multiple fee test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        list.FieldClear(EditFeeStructure.FeeField4);
        list.FieldClear(EditFeeStructure.FeeField5);
        list.FieldClear(EditFeeStructure.FeeField6);
        operation.writeInputText(EditFeeStructure.FeeField4,list.GenerateFee(), 500);
        operation.writeInputText(EditFeeStructure.FeeField5,list.GenerateFee(),500);
        operation.writeInputText(EditFeeStructure.FeeField6,list.GenerateFee(),500);
        Assert.assertTrue(editFee.verifySumOfUtilizationFeesInTableShowingCorrectly());

    }



    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckWhenAdminRemoveTheSessionFee() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Session fee rate is required"));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(1000,EditFeeStructure.DrawerTitle));


    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckWhenAdminRemoveTheUtilizationFee() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Utilization fee rate is required"));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(2000,EditFeeStructure.DrawerTitle));

    }


    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckWhenAdminRemoveTheGracePeriod() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.GracePeriodField);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period is required"));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(2000,EditFeeStructure.DrawerTitle));

    }


    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckWhenAdminRemoveTheIdleFee() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.IdleFeeRateField);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Grace period fee is required"));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(2000,EditFeeStructure.DrawerTitle));

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckWhenAdminRemoveFeeModifierRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Fee modifier test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.FeeModifierRateField);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(500,CreateFeeStructure.Alert,"Fee modifier rate is required"));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(1500,EditFeeStructure.DrawerTitle));

    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckWhenAdminProvideInvalidValueInSessionFee() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        Assert.assertTrue(editFee.verifyInvalidData(CreateFeeStructure.SessionFeeAmountField,"Session fee rate is not valid"));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(2000,EditFeeStructure.DrawerTitle));


    }


    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckWhenAdminProvideInvalidValueForUtilizationFee() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        Assert.assertTrue(editFee.verifyInvalidData(CreateFeeStructure.UtilizationFeeAmountField,"Utilization fee rate is not valid"));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(2000,EditFeeStructure.DrawerTitle));



    }
    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckWhenAdminProvideInvalidValueForGracePeriod() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        Assert.assertTrue(editFee.verifyInvalidDataForGracePeriod(CreateFeeStructure.GracePeriodField,"Grace period is not valid"));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(2000,EditFeeStructure.DrawerTitle));


    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-19.2"})
    public void TC_19_2_CheckWhenAdminProvideInvalidValueForGracePeriod() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        Assert.assertTrue(editFee.verifyLessThanThreeValueForGracePeriod(CreateFeeStructure.GracePeriodField,"Grace period must be at least 3 minutes"));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(2000,EditFeeStructure.DrawerTitle));


    }
    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckWhenAdminProvideInvalidValueForGracePeriodFee() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        Assert.assertTrue(editFee.verifyInvalidDataForIdleFee(CreateFeeStructure.IdleFeeRateField,"Grace period fee is not valid"));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(2000,EditFeeStructure.DrawerTitle));


    }


}
