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
        loginPage.verifyValidLoginForPropertyAdmin();
        operation.clickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
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
        loginPage.verifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
        operation.clickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
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
        loginPage.verifyValidLoginForPropertyAdmin();
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
        loginPage.verifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.ContiniousClickOnLoadMoreButton();
        Assert.assertTrue(list.verifyExpectedTitleColumnOccupiedWithContent("Session Fee",2));




    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-5.1"})
    public void TC_5_1_CheckSessionFeeColumnContainingSessionFees() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.verifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.ContiniousClickOnLoadMoreButton();
        Assert.assertTrue(list.verifySessionFeeColumnOccupiedWithContentSessionFee("Session Fee",2));




    }




    @Test(priority = 7)//Done
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



    @Test(priority = 8)//Done
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


    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckIdleFeeColumnContainsIdleFees() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.ContiniousClickOnLoadMoreButton();
        Assert.assertTrue(list.verifyIdleFeeColumnOccupiedWithIdleFees("Idle Fee",4));






    }

    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-8"})
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

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckActionColumnOccupiedWithEditButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.verifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.ContiniousClickOnLoadMoreButton();
        Assert.assertTrue(list.verifyActionColumnOccupiedWithEditButton("Action",6));



    }




    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckFeeStructureNameMatchWithTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.writeInSearchField("Automated");
        operation.clickButton(FeeStructureList.SearchButton,1000);
        Assert.assertTrue(list.verifyTableFeeStructureNameMatchWithDrawer());




    }



    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckFeeStructureNameMatchWithTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        Assert.assertTrue(list.verifyTableFeeStructureNameMatchWithDrawer());


    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckSessionFeeRateInTableMatchWithDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        Assert.assertTrue(list.verifySessionFeeMatchWithDrawer());


    }


    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckUtilizationFeeRateInTableMatchWithDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        Assert.assertTrue(list.verifyUtilizationFeeMatchWithDrawer());


    }

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckIdleFeeRateInTableMatchWithDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        Assert.assertTrue(list.verifyIdleFeeMatchWithDrawer());


    }


    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckFeeModifierInTableMatchWithDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        Assert.assertTrue(list.verifyFeeModifierMatchWithDrawer());


    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckUpdatedSessionFeeIsShowingInTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.clickButton(FeeStructureList.Edit,1000);
        operation.fieldClear(CreateFeeStructure.SessionFeeAmountField);
        String fee = list.GenerateFee();
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,fee,2000);
        operation.clickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyUpdatedDataInTable(FeeStructureList.SessionFee1,fee));


    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckUpdatedUtilizationFeeIsShowingInTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        String fee = list.GenerateFee();
        operation.clickButton(FeeStructureList.Edit,1000);
        operation.fieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,fee,2000);
        operation.clickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyUpdatedDataInTable(FeeStructureList.UtilizationFee1,fee));


    }

    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckUpdatedIdleFeeIsShowingInTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.clickButton(FeeStructureList.Edit,1000);
        operation.fieldClear(CreateFeeStructure.IdleFeeRateField);
        String fee = list.GenerateFee();
        operation.writeInputText(CreateFeeStructure.IdleFeeRateField,fee,2000);
        operation.clickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyUpdatedDataInTable(FeeStructureList.IdleFee1,fee));

    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckUpdatedFeeModifierIsShowingInTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.verifyValidLoginForPropertyAdmin();
        dashboard.refreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.clickButton(FeeStructureList.Edit,1000);
        operation.fieldClear(CreateFeeStructure.FeeModifierNameField);
        operation.fieldClear(CreateFeeStructure.FeeModifierRateField);
        operation.writeInputText(CreateFeeStructure.FeeModifierNameField,"Modifier",2000);
        operation.writeInputText(CreateFeeStructure.FeeModifierRateField,"2.50",2000);
        operation.clickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyTextMatching(3000,FeeStructureList.FeeModifier1,"2.50%"));

    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckFeeModifierUpdatedToZeroIsShowingInTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        loginPage.verifyValidLoginForPropertyAdmin();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
//        list.FieldClear(FeeStructureList.SearchField);
//        list.writeInSearchField("Automated");
//        operation.ClickButton(FeeStructureList.SearchButton,1000);
        operation.clickButton(FeeStructureList.Edit,1000);
        operation.fieldClear(CreateFeeStructure.FeeModifierNameField);
        operation.fieldClear(CreateFeeStructure.FeeModifierRateField);
        operation.clickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyTextMatching(3000,FeeStructureList.FeeModifier1,"0.00%"));

    }



    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckLoadMoreButtonDisplayed() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        dashboard.refreshBrowser();
        list.SearchFieldClear();
        Assert.assertTrue(list.verifyAnElementDisplayedOrNot(1000,FeeStructureList.LoadMoreButton));



    }



    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckTotalCountOfList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        Assert.assertTrue(list.verifyTotalNumberCountSectionShowing());



    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckCountOfListOnTopIsShowing() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        Assert.assertTrue(list.verifyShowingFeesCountOnTopIsShowing());



    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CheckCountOfListOnBottomOfList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        Assert.assertTrue(list.verifyShowingFeesCountOnBottomOfList());



    }

    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckShowingChargerCountIsIncreasingAfterLoadButtonClick() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger operation = new CreateCharger(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyLoadMoreButtonActionWithShowingCount()));
    }


    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_CheckShowingChargerCountIsIncreasingAfterLoadButtonClick() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger operation = new CreateCharger(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyLoadMoreButtonActionWithAboveShowingCount()));
    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_CheckShowingCountIsDecreasingAfterRefreshing() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        operation.ClickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        Assert.assertTrue((dashBoardLoadMoreFunctionality.verifyShowingCountisDecreasingAfterRefreshing()));
        dashboardPropertyDetails.LogoutFromExistingAccount();
    }

    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_CheckPropertyManagerCanEdit() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        CreateCharger operation = new CreateCharger(driver);
        FeeStructureList list = new FeeStructureList(driver);
        Thread.sleep(2000);
        loginPage.verifyValidLoginForPropertyManager();
        operation.clickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.fieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Automated");
        operation.clickButton(FeeStructureList.SearchButton,1000);
        operation.clickButton(FeeStructureList.Edit,1000);
        operation.fieldClear(CreateFeeStructure.SessionFeeAmountField);
        String fee = list.GenerateFee();
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,fee,2000);
        operation.clickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyUpdatedDataInTable(FeeStructureList.SessionFee1,fee));
        dashboardPropertyDetails.LogoutFromExistingAccount();
    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_CheckPropertyAssistantManagerCanEdit() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        CreateCharger operation = new CreateCharger(driver);
        FeeStructureList list = new FeeStructureList(driver);
        Thread.sleep(2000);
        loginPage.verifyValidLoginForPropertyAssistantManager();
        operation.clickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        String fee = list.GenerateFee();
        operation.clickButton(FeeStructureList.Edit,1000);
        operation.fieldClear(CreateFeeStructure.UtilizationFeeAmountField);
        operation.writeInputText(CreateFeeStructure.UtilizationFeeAmountField,fee,2000);
        operation.clickButton(CreateFeeStructure.SaveFeeStructureButton,1000);
        Assert.assertTrue(list.verifyUpdatedDataInTable(FeeStructureList.UtilizationFee1,fee));
        dashboardPropertyDetails.LogoutFromExistingAccount();
    }

    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_CheckPropertyPropertyLeasingAgentCanEdit() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        CreateCharger operation = new CreateCharger(driver);
        FeeStructureList list = new FeeStructureList(driver);
        Thread.sleep(2000);
        loginPage.verifyValidLoginForPropertyLeasingAgent();
        operation.clickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.fieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Automated");
        operation.clickButton(FeeStructureList.SearchButton,1000);
        operation.clickButton(FeeStructureList.Edit,1000);
        operation.fieldClear(CreateFeeStructure.SessionFeeAmountField);
        String fee = list.GenerateFee();
        operation.writeInputText(CreateFeeStructure.SessionFeeAmountField,fee,2000);
        Assert.assertTrue(list.verifyAFieldIsDisable(2000,CreateFeeStructure.SaveFeeStructureButton));
        dashboardPropertyDetails.LogoutFromExistingAccount();
    }

    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_CheckPropertyPropertyAssistantLeasingAgentCanEdit() throws InterruptedException {
        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashBoardLoadMoreFunctionality dashBoardLoadMoreFunctionality = new DashBoardLoadMoreFunctionality(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        CreateCharger operation = new CreateCharger(driver);
        FeeStructureList list = new FeeStructureList(driver);
        Thread.sleep(2000);
        loginPage.verifyValidLoginForPropertyAssistantLeasingAgent();
        operation.clickButton(CreateFeeStructure.FeeStructureFromMenu,4000);
        list.fieldClear(FeeStructureList.SearchField);
        list.writeInSearchField("Automated");
        operation.clickButton(FeeStructureList.SearchButton,1000);
        operation.clickButton(FeeStructureList.Edit,1000);
        Assert.assertTrue(list.verifyAFieldIsDisable(4000,CreateFeeStructure.SaveFeeStructureButton));
        dashboardPropertyDetails.LogoutFromExistingAccount();
    }



}