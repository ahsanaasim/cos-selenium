package tests.US62FeeStructureList;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class FeeStructureListTestcases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckAllTheTitleOfTheTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        Assert.assertTrue(feeStructure.verifyTextMatching(2000,FeeStructureList.FeeStructureNameTitle,"Fee Structure Name"));
        Assert.assertTrue(feeStructure.verifyTextMatching(300,FeeStructureList.GroupTitle,"Group"));
        Assert.assertTrue(feeStructure.verifyTextMatching(300,FeeStructureList.SessionFeeTitle,"Session Fee"));
        Assert.assertTrue(feeStructure.verifyTextMatching(300,FeeStructureList.UtilizationFeeTitle,"Utilization Fee"));
        Assert.assertTrue(feeStructure.verifyTextMatching(300,FeeStructureList.IdleFeeTitle,"Idle Fee"));
        Assert.assertTrue(feeStructure.verifyTextMatching(300,FeeStructureList.FeeModifierTitle,"Fee Modifier"));
        Assert.assertTrue(feeStructure.verifyTextMatching(300,FeeStructureList.ActionTitle,"Action"));



    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_2_3_CheckBlankFieldForAllColumn() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.ContiniousClickOnLoadMoreButton();
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Fee Structure Name",0));
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Group",1));
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Session Fee",2));
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Utilization Fee",3));
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Idle Fee",4));
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Fee Modifier",5));
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Action",6));



    }

//    @Test(priority = 4)//Done
//    @TestParameters(testCaseId = {"TC-5"})
//    public void TC_5_CheckFeeStructureNameMatchWithTable() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard=new Dashboard(driver);
//        FeeStructureList list = new FeeStructureList(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
////        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Fee Structure Name",0));
//        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Group",1));
//        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Session Fee",2));
//        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Utilization Fee",3));
//        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Idle Fee",4));
//        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Fee Modifier",5));
//        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Action",6));
//
//
//
//    }

}
