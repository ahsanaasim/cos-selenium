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
    public void TC_2_3_CheckBlankFieldForColumn1() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.ContiniousClickOnLoadMoreButton();
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Fee Structure Name",0));




    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_4_CheckBlankFieldForColumn2() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.ContiniousClickOnLoadMoreButton();
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Group",1));




    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckBlankFieldForColumn3() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.ContiniousClickOnLoadMoreButton();
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Session Fee",2));




    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckBlankFieldForColumn4() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.ContiniousClickOnLoadMoreButton();
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Utilization Fee",3));







    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckBlankFieldForColumn5() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.ContiniousClickOnLoadMoreButton();
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Idle Fee",4));





    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_8_CheckBlankFieldForColumn6() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.ContiniousClickOnLoadMoreButton();
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Action",6));





    }




    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckFeeStructureNameMatchWithTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.writeInSearchField("Automated");
        operation.ClickButton(FeeStructureList.SearchButton,1000);
        Assert.assertTrue(list.verifyTableFeeStructureNameMatchWithDrawer());




    }



    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckFeeStructureNameMatchWithTable() throws InterruptedException {
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
        Assert.assertTrue(list.verifyTableFeeStructureNameMatchWithDrawer());


    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckSessionFeeRateInTableMatchWithDrawer() throws InterruptedException {
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
        Assert.assertTrue(list.verifySessionFeeMatchWithDrawer());


    }


    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckUtilizationFeeRateInTableMatchWithDrawer() throws InterruptedException {
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
        Assert.assertTrue(list.verifyUtilizationFeeMatchWithDrawer());


    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckIdleFeeRateInTableMatchWithDrawer() throws InterruptedException {
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
        Assert.assertTrue(list.verifyIdleFeeMatchWithDrawer());


    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckFeeModifierInTableMatchWithDrawer() throws InterruptedException {
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
        Assert.assertTrue(list.verifyFeeModifierMatchWithDrawer());


    }



    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckLoadMoreButtonDisplayed() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        Assert.assertTrue(list.verifyAnElementDisplayedOrNot(1000,FeeStructureList.LoadMoreButton));



    }

}