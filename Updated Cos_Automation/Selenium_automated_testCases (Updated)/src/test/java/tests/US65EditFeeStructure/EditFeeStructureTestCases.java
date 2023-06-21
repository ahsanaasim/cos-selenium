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
    @TestParameters(testCaseId = {"TC-2,3"})
    public void TC_2_3_CheckFeeDetailsDrawerSections() throws InterruptedException {
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
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckEveryMandatoryFields() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        FeeStructureList list = new FeeStructureList(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        dashboard.RefreshBrowser();
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
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckFeeRemoveButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.writeInSearchField("Multiple fee test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(1000,EditFeeStructure.FeeRemoveButton));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(1000,EditFeeStructure.FeeRemoveButton2));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(1000,EditFeeStructure.FeeRemoveButton3));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(1000,EditFeeStructure.FeeRemoveButton4));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(1000,EditFeeStructure.FeeRemoveButton5));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(1000,EditFeeStructure.FeeRemoveButton6));


    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckFeeRemoveButtonForSingleFees() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        Assert.assertTrue(editFee.verifyElementNotDisplayed(2000,EditFeeStructure.FeeRemoveButton));



    }


    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckDrawerTitleIsShowingCorrectly() throws InterruptedException {
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
        Assert.assertTrue(editFee.verifyDrawerTitleMatchingWithFeeStructureName());

    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckSessionFeeIsUpdated() throws InterruptedException {
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





    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckUtilizationFeeIsUpdated() throws InterruptedException {
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

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckIdleFeeIsUpdated() throws InterruptedException {
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

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckFeeModifierIsUpdated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.writeInSearchField("Fee modifier test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.FeeModifierNameField);
        operation.FieldClear(CreateFeeStructure.FeeModifierRateField);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",2000);
        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"3.50",2000);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyTextMatching(3000,FeeStructureList.FeeModifier1,"3.50%"));

    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckFeeModifierUpdatedToZeroIsShowingInTable() throws InterruptedException {
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
        operation.ClickButton(FeeStructureList.Edit,1500);
        operation.FieldClear(CreateFeeStructure.FeeModifierNameField);
        operation.FieldClear(CreateFeeStructure.FeeModifierRateField);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyTextMatching(4000,FeeStructureList.FeeModifier1,"0.00%"));

    }



    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckTotalOfMultipleSessionFeeIsShowingCorrectly() throws InterruptedException {
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

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckTotalOfMultipleUtilizationFeesAreShowingCorrectly() throws InterruptedException {
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





    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckWhenAdminClearTheSessionFee() throws InterruptedException {
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

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckWhenAdminRemoveTheUtilizationFee() throws InterruptedException {
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
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckWhenAdminRemoveTheGracePeriod() throws InterruptedException {
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
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckWhenAdminRemoveTheIdleFee() throws InterruptedException {
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
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckWhenAdminRemoveFeeModifierRate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.writeInSearchField("Fee modifier test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.FeeModifierNameField);
        operation.FieldClear(CreateFeeStructure.FeeModifierRateField);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",1000);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(feeStructure.verifyTextMatching(1000,CreateFeeStructure.Alert,"Fee modifier rate is required"));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(1500,EditFeeStructure.DrawerTitle));

    }

    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckWhenAdminProvideInvalidValueInSessionFee() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        Assert.assertTrue(editFee.verifyInvalidData(CreateFeeStructure.SessionFeeAmountField,"Session fee rate is not valid"));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(2000,EditFeeStructure.DrawerTitle));


    }


    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckWhenAdminProvideInvalidValueForUtilizationFee() throws InterruptedException {
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
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CheckWhenAdminProvideInvalidValueForGracePeriod() throws InterruptedException {
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
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckWhenAdminProvideInvalidValueForGracePeriod() throws InterruptedException {
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
    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_CheckWhenAdminProvideInvalidValueForGracePeriodFee() throws InterruptedException {
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


    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_CheckTheUpdatedInformationSavedOnDrawer() throws InterruptedException {
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
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        String fee = list.GenerateFee();
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,fee,2000);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        operation.ClickButton(FeeStructureList.Edit,2500);
        Assert.assertTrue(editFee.verifyUpdateDataMatchWithInputField(1500,CreateFeeStructure.SessionFeeAmountField,"value",fee));
        Assert.assertTrue(editFee.verifyFeeHeadingIsUpdated(CreateFeeStructure.SessionFeeHeading,feeStructure.SessionFeeExtractor(),fee));


    }

    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-40,41"})
    public void TC_40_41_CheckWhatHappensWhenClickOnCancelAfterModifyingSomething() throws InterruptedException {
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
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        String fee = list.GenerateFee();
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,fee,2000);
        operation.ClickButton(CreateFeeStructure.CancelButton,1000);
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(2000,CreateCharger.discardandcontinuepopup));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(1000,CreateCharger.discardbtn));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(1000,CreateCharger.continuebtn));


    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_CheckWhatHappensWhenClickOnCancelAfterModifyingSomething() throws InterruptedException {
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
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        String fee = list.GenerateFee();
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,fee,2000);
        operation.ClickButton(CreateFeeStructure.CancelButton,1000);
        operation.ClickButton(CreateCharger.discardbtn,1000);
        Assert.assertTrue(editFee.verifyElementNotDisplayed(2500,EditFeeStructure.DrawerTitle));




    }

    @Test(priority = 38)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_CheckDiscardedDataIsNotSaving() throws InterruptedException {
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
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,"96",2000);
        operation.ClickButton(CreateFeeStructure.CancelButton,1000);
        operation.ClickButton(CreateCharger.discardbtn,1000);
        operation.ClickButton(FeeStructureList.Edit,1500);
        Assert.assertTrue(editFee.verifyDataIsNotSavingAfterDiscarded());




    }

    @Test(priority = 39)//Done
    @TestParameters(testCaseId = {"TC-44,45"})
    public void TC_44_45_CheckWhatHappensWhenClickOnCancelAfterModifyingSomething() throws InterruptedException {
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
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        String fee = list.GenerateFee();
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,fee,2000);
        operation.ClickButton(CreateFeeStructure.CancelButton,1000);
        operation.ClickButton(CreateCharger.continuebtn,1000);
        Assert.assertTrue(editFee.verifyElementNotDisplayed(2500,CreateCharger.discardandcontinuepopup));
        Assert.assertTrue(editFee.verifyAnElementDisplayedOrNot(1000,EditFeeStructure.DrawerTitle));


    }


    @Test(priority = 40)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_CheckAuditLogIsUpdatedAfterUpdatingAData() throws InterruptedException {
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
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        String fee = list.GenerateFee();
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,fee,2000);
        Assert.assertTrue(editFee.verifyAuditLogIsUpdatedAfterUpdatingAData());


    }

    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_CheckUpdatedTimeInAuditLog() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        String fee = list.GenerateFee();
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,fee,2000);
        Assert.assertTrue(editFee.verifyUpdatedTime());


    }

    @Test(priority = 45)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_50_CheckFeeModifierAffectingSessionFeeOnTheTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Fee modifier test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.FeeModifierNameField);
        operation.FieldClear(CreateFeeStructure.FeeModifierRateField);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",1000);
        Assert.assertTrue(editFee.verifyFeeIsAffectedByFeeModifier(CreateFeeStructure.SessionFeeHeading,feeStructure.SessionFeeExtractor(),FeeStructureList.SessionFee1));


    }


    @Test(priority = 46)//Done
    @TestParameters(testCaseId = {"TC-51"})
    public void TC_51_CheckFeeModifierAffectingUtilizationFeeOnTheTable() throws InterruptedException {
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
        list.writeInSearchField("Fee modifier test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.FeeModifierNameField);
        operation.FieldClear(CreateFeeStructure.FeeModifierRateField);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",1000);
        Assert.assertTrue(editFee.verifyFeeIsAffectedByFeeModifier(CreateFeeStructure.UtilizationFeeAmountField,feeStructure.UtilizationFeeExtractor(),FeeStructureList.UtilizationFee1));


    }

    @Test(priority = 47)//Done
    @TestParameters(testCaseId = {"TC-52"})
    public void TC_52_CheckFeeModifierAffectingIdleFeeOnTheTable() throws InterruptedException {
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
        list.writeInSearchField("Fee modifier test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.FeeModifierNameField);
        operation.FieldClear(CreateFeeStructure.FeeModifierRateField);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",1000);
        Assert.assertTrue(editFee.verifyFeeIsAffectedByFeeModifier(CreateFeeStructure.IdleFeeHeading,feeStructure.IdleFeeExtractor(),FeeStructureList.IdleFee1));


    }


    @Test(priority = 49)//Done
    @TestParameters(testCaseId = {"TC-53"})
    public void TC_53_CheckSessionFeeIsUpdatingInChargerDetailsPage() throws InterruptedException {
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
        list.writeInSearchField("Effect test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.SessionFeeAmountField);
        String fee = list.GenerateFee();
        String feeWithDollarSign = "$"+fee;
        System.out.println(feeWithDollarSign);
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,fee,2000);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Thread.sleep(2000);
        editFee.NewTabOpenAndSwitchToNewTab(1);
//        editFee.SwitchToTab(1);
        editFee.GotoSmackdownCharger();
        Assert.assertTrue(editFee.verifyTextMatching(1000,GuestVerificationPage.FeeToInitiate,feeWithDollarSign));


    }

    @Test(priority = 50)//Done
    @TestParameters(testCaseId = {"TC-54"})
    public void TC_54_CheckUtilizationFeeIsUpdatingInChargerDetailsPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        editFee.SwitchToTab(0);
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Effect test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        String fee = list.GenerateFee();
        String feeWithDollarSign = "$"+fee;
        System.out.println(feeWithDollarSign);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,fee,2000);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Thread.sleep(2000);
//        editFee.NewTabOpenAndSwitchToNewTab(1);
        editFee.SwitchToTab(1);
        editFee.GotoSmackdownCharger();
        Assert.assertTrue(editFee.verifyTextMatching(1000,GuestVerificationPage.FeePerKwh,feeWithDollarSign));


    }

    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-55"})
    public void TC_55_CheckIdleFeeIsUpdatingInChargerDetailsPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        EditFeeStructure editFee = new EditFeeStructure(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        editFee.SwitchToTab(0);
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Effect test");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.ClickButton(FeeStructureList.Edit,1000);
        operation.FieldClear(CreateFeeStructure.IdleFeeRateField);
        String fee = list.GenerateFee();
        String feeWithDollarSign = "$"+fee;
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,fee,2000);
        operation.ClickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Thread.sleep(2000);
//        editFee.NewTabOpenAndSwitchToNewTab(1);
        editFee.SwitchToTab(1);
        editFee.GotoSmackdownCharger();
        Assert.assertTrue(guestVerificationPage.verifyIdleFee(feeWithDollarSign));


    }












}