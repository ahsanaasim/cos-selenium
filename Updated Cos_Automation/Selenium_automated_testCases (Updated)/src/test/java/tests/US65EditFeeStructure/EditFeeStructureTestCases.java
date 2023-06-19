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
        loginPage.VerifyValidLoginForPropertyAdmin();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        operation.ClickButton(FeeStructureList.Edit,4000);
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(2000,CreateFeeStructure.FeeStructureNameField));
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(500,CreateFeeStructure.SessionFeeNameField));
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(500,CreateFeeStructure.SessionFeeAmountField));
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(500,CreateFeeStructure.UtilizationFeeNameField));
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(500,CreateFeeStructure.UtilizationFeeAmountField));
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(500,CreateFeeStructure.GracePeriodField));
        Assert.assertTrue(editFee.verifyMandatoryFieldIsPopulated(500,CreateFeeStructure.IdleFeeRateField));


    }

}
