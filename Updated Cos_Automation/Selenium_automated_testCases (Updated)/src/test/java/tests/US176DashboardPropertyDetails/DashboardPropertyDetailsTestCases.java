package tests.US176DashboardPropertyDetails;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class DashboardPropertyDetailsTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();

//    @Test(priority = 1)//Done
//    @TestParameters(testCaseId = {"TC-1"})
//    public void TC_1_CheckTheSeeDetailsButtonsUnderActionColumn() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsBesideEveryProperty()));
//    }
//    @Test(priority = 2)//Done
//    @TestParameters(testCaseId = {"TC-3"})
//    public void TC_3_TextTitleShouldBeTheSameAsTheDesign() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        Assert.assertTrue((dashboardPropertyDetails.verifySeeDetailsButtonText()));
//    }
//    @Test(priority = 3)//Done
//    @TestParameters(testCaseId = {"TC-4"})
//    public void TC_4_6_CheckTheTitleAboveTheDetailsDrawerAfterClickingOnDetailsButton() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsDrawerTitle()));
//    }
//    @Test(priority = 4)//Done
//    @TestParameters(testCaseId = {"TC-5"})
//    public void TC_5_CheckTheLocationTitleInDetailsDrawerAfterClickingOnDetailsButton() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        Dashboard dashboard =new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsDrawerLocationTitle()));
//    }
//    @Test(priority = 5)//Done
//    @TestParameters(testCaseId = {"TC-10"})
//    public void TC_10_CheckTheLocationTitleInDetailsDrawerAfterClickingOnDetailsButton() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        Dashboard dashboard =new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdmin();
//        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsDrawerTitle()));
//        dashboardPropertyDetails.LogoutFromExistingAccount();
//    }
//    //    @Test(priority = 6)//Done
////    @TestParameters(testCaseId = {"TC-10"})
////    public void TC_11_CheckNoLocationMessage() throws InterruptedException {
////        LoginPage loginPage = new LoginPage(driver);
////        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
////        loginPage.VerifyValidLoginForPropertyAdminWithPerfectCombination();
////        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsDrawerTitle()));
////    }
//    @Test(priority = 6)//Done
//    @TestParameters(testCaseId = {"TC-12"})
//    public void TC_12_CheckNoChargerMessage() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLoginForPropertyAdminWithPerfectCombination();
//        Assert.assertTrue((dashboardPropertyDetails.verifyNoChargerMsg()));
//    }
//    @Test(priority = 7)//Done
//    @TestParameters(testCaseId = {"TC-13"})
//    public void TC_13_CheckNoLocationAndChargerMessage() throws InterruptedException {
//        Dashboard dashboard =new Dashboard(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
////        loginPage.VerifyValidLoginForPropertyAdminWithPerfectCombination();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue((dashboardPropertyDetails.verifyNoLocationAndCharger()));
//        dashboardPropertyDetails.LogoutFromExistingAccount();
//    }
//    @Test(priority = 8)//Done
//    @TestParameters(testCaseId = {"TC-14"})
//    public void TC_14_CheckDrawerOpensForOnlyLocationsProperty() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        Thread.sleep(3000);
//        loginPage.VerifyValidLoginForPropertyAdminOnlyLocations();
//        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsDrawerTitle()));
//    }
//    @Test(priority = 9)//Done
//    @TestParameters(testCaseId = {"TC-15"})
//    public void TC_15_CheckLocationsAreShowingAfterClickOnSeeDetails() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        CreateCharger createCharger =new CreateCharger(driver);
//        Dashboard dashboard =new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdminOnlyLocations();
//        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.DetailsBtn1,6000));
//        Assert.assertTrue((dashboardPropertyDetails.verifyLocationsUnderAProperty()));
//    }
//    @Test(priority = 10)//Done
//    @TestParameters(testCaseId = {"TC-16"})
//    public void TC_16_CheckNoChargersForOnlyLocations() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        CreateCharger createCharger =new CreateCharger(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        Dashboard dashboard =new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdminOnlyLocations();
//        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.DetailsBtn1,6000));
//        Assert.assertTrue((dashboardPropertyDetails.verifyNoChargesAreShowingForOnlyLocations()));
//        dashboardPropertyDetails.LogoutFromExistingAccount();
//    }
//    @Test(priority = 11)//Done
//    @TestParameters(testCaseId = {"TC-17"})
//    public void TC_17_CheckDrawerOpenedWhenClicksOnSeeDetailsThatHasOfflineLocations() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        Thread.sleep(4000);
//        loginPage.VerifyValidLoginForPropertyAdminOfflineLocations();
//        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsDrawerTitle()));
//    }
//    @Test(priority = 12)//Done
//    @TestParameters(testCaseId = {"TC-18"})
//    public void TC_18_CheckNoLocationAndChargerMessage() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        CreateCharger createCharger =new CreateCharger(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        Dashboard dashboard =new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdminOfflineLocations();
//        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.DetailsBtn1,3000));
//        Assert.assertTrue((dashboardPropertyDetails.verifyOfflineTagsAreShowingForOfflineLocations()));
//    }
//    @Test(priority = 13)//Done
//    @TestParameters(testCaseId = {"TC-19"})
//    public void TC_19_CheckChargerStatusOfflineForOfflineLocations() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        CreateCharger createCharger =new CreateCharger(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        Dashboard dashboard =new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdminOfflineLocations();
//        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.DetailsBtn1,5000));
//        Assert.assertTrue((dashboardPropertyDetails.verifyChargerStatusOfflineForOfflineLocations()));
//        dashboardPropertyDetails.LogoutFromExistingAccount();
//
//    }
//    @Test(priority = 14)//Done
//    @TestParameters(testCaseId = {"TC-20"})
//    public void TC_20_CheckLocationCountAfterCreatingNewLocation() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        Thread.sleep(3000);
//        loginPage.VerifyValidLoginForPropertyAdminCountTest();
//        Assert.assertTrue((dashboardPropertyDetails.verifyLocationCountIncreasing()));
//    }
//    @Test(priority = 15)//Done
//    @TestParameters(testCaseId = {"TC-23"})
//    public void TC_23_CheckChargerCountAfterCreatingNewCharger() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        Thread.sleep(3000);
//        loginPage.VerifyValidLoginForPropertyAdminCountTest();
//        Assert.assertTrue((dashboardPropertyDetails.verifyChargerCountIncreasing()));
//    }
//    @Test(priority = 16)//Done
//    @TestParameters(testCaseId = {"TC-24"})
//    public void TC_24_CheckChargerStatusOthersAfterCreatingNewCharger() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        CreateCharger createCharger =new CreateCharger(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
////        loginPage.VerifyValidLoginForPropertyAdminCountTest();
//        Dashboard dashboard =new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.DetailsBtn1,5000));
//        Assert.assertTrue((dashboardPropertyDetails.verifyOthersStatus()));
//        dashboardPropertyDetails.LogoutFromExistingAccount();
//    }
//    @Test(priority = 17)//Done
//    @TestParameters(testCaseId = {"TC-30,31"})
//    public void TC_30_31_CheckWhenLocationIsTurningIntoOfflineWhileChargerSessionGoing () throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        GuestFlow guestFlow = new GuestFlow(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        CreateLocation createLocation =new CreateLocation(driver);
//        Thread.sleep(5000);
//        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
//        Thread.sleep(5000);
//        guestFlow.NewTabOpenAndSwitchToNewTab(1);
//        loginPage.VerifyValidLogin();
//        guestFlow.GoToSimulator();
//        Thread.sleep(5000);
//        guestFlow.SelectChargerFromSimulator("Automatable Charger");
//        dashboardPropertyDetails.selectChargerStatus("Preparing");
//        createCharger.ClickButton(DashboardPropertyDetails.SimulatorChargerStatusSaveBtn,2000);
//        dashboardPropertyDetails.selectChargerStatus("Charging");
//        createCharger.ClickButton(DashboardPropertyDetails.SimulatorChargerStatusSaveBtn,1000);
//        createLocation.GoToLocationPage();
//        createCharger.writeInputText(CreateLocation.searchbar,"Beautiful Location",8000);
//        createCharger.ClickButton(CreateCharger.searchargerbtn,1000);
//        createCharger.ClickButton(EditLocation.EditButton,1000);
//        createCharger.ClickButton(UpdateChargerPropertyAdmin.ToggleButton,6000);
//        createCharger.ClickButton(CreateLocation.savelocationbtn,2000);
//        guestFlow.SwitchToTab(0);
//        createCharger.ClickButton(DashboardPropertyDetails.DetailsBtn1,3000);
//        Assert.assertTrue(dashboardPropertyDetails.verifyOfflineLocationAndOfflineCharger());
//    }
//    @Test(priority = 18)//Done
//    @TestParameters(testCaseId = {"TC-32,33"})
//    public void TC_32_33_CheckWhenLocationIsTurningOnlineFromOfflineWhileChargerSessionGoing () throws InterruptedException {
//        CreateCharger createCharger = new CreateCharger(driver);
//        GuestFlow guestFlow = new GuestFlow(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        Dashboard dashboard =new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        guestFlow.SwitchToTab(1);
//        createCharger.ClickButton(EditLocation.EditButton,2000);
//        createCharger.ClickButton(UpdateChargerPropertyAdmin.ToggleButton,6000);
//        createCharger.ClickButton(CreateLocation.savelocationbtn,2000);
//        guestFlow.SwitchToTab(0);
//        createCharger.ClickButton(DashboardPropertyDetails.DetailsBtn1,3000);
//        Assert.assertTrue(dashboardPropertyDetails.verifyOnlineLocation());
//        Assert.assertTrue(dashboardPropertyDetails.verifyInUseCharger());
//        guestFlow.SwitchToTab(1);
//        guestFlow.GoToSimulator();
//        Thread.sleep(4000);
//        guestFlow.SelectChargerFromSimulator("Automatable Charger");
//        createCharger.ClickButton(GuestFlow.DisconnectChargerbtn,5000);
//        Thread.sleep(5000);
//        dashboardPropertyDetails.CloseTab();
//        guestFlow.SwitchToTab(0);
//
//    }
//    @Test(priority = 19)//Done
//    @TestParameters(testCaseId = {"TC-34"})
//    public void TC_34_CheckWhatHappenedIfTheUserClickOutsideTheDrawer() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        Dashboard dashboard =new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
//        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.DetailsBtn1,5000));
//        Assert.assertTrue(createCharger.ClickButton(CreateCharger.outsidedrawer,5000));
//        Assert.assertTrue(dashboardPropertyDetails.verifyDrawerClosed());
//    }
//    @Test(priority = 20)//Done
//    @TestParameters(testCaseId = {"TC-35"})
//    public void TC_35_CheckWhatHappenedIfTheUserClickCrossButtonOfTheDrawer() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
//        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.DetailsBtn1,5000));
//        Assert.assertTrue(createCharger.ClickButton(CreateCharger.crossbtnofdrawer,5000));
//        Assert.assertTrue(dashboardPropertyDetails.verifyDrawerClosed());
//    }
    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_CheckTheChargerStatusWhenChargerIsInAvailableStatus() throws InterruptedException {
        Dashboard dashboard =new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        dashboard.RefreshBrowser();
        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        guestFlow.SelectChargerFromSimulator("Automatable Charger");
        Assert.assertTrue(dashboardPropertyDetails.verifyChargerAvailabilityInSeeDetails());
    }
    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_CheckTheChargerStatusWhenChargerIsInPreparingStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.RefreshBrowser();
        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        guestFlow.SelectChargerFromSimulator("Automatable Charger");
        dashboardPropertyDetails.selectChargerStatus("Preparing");
        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.SimulatorChargerStatusSaveBtn,2000));
        dashboardPropertyDetails.CloseTab();
        guestFlow.SwitchToTab(0);
        Assert.assertTrue(dashboardPropertyDetails.verifyChargerInUseStatusSeeDetails());
    }
    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_CheckTheChargerStatusWhenChargerIsInChargingStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.RefreshBrowser();
        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        guestFlow.SelectChargerFromSimulator("Automatable Charger");
        dashboardPropertyDetails.selectChargerStatus("Charging");
        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.SimulatorChargerStatusSaveBtn,2000));
        dashboardPropertyDetails.CloseTab();
        guestFlow.SwitchToTab(0);
        Assert.assertTrue(dashboardPropertyDetails.verifyChargerInUseStatusSeeDetails());
    }
    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-40"})
    public void TC_40_CheckTheChargerStatusWhenChargerIsInSuspendedEVStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.RefreshBrowser();
        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        guestFlow.SelectChargerFromSimulator("Automatable Charger");
        dashboardPropertyDetails.selectChargerStatus("Suspended EV");
        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.SimulatorChargerStatusSaveBtn,2000));
        dashboardPropertyDetails.CloseTab();
        guestFlow.SwitchToTab(0);
        Assert.assertTrue(dashboardPropertyDetails.verifyChargerInUseStatusSeeDetails());
    }
    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_CheckTheChargerStatusWhenChargerIsInSuspendedEVSEStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.RefreshBrowser();
        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        guestFlow.SelectChargerFromSimulator("Automatable Charger");
        dashboardPropertyDetails.selectChargerStatus("Suspended EVSE");
        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.SimulatorChargerStatusSaveBtn,2000));
        dashboardPropertyDetails.CloseTab();
        guestFlow.SwitchToTab(0);
        Assert.assertTrue(dashboardPropertyDetails.verifyChargerInUseStatusSeeDetails());
    }
    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-43"})
    public void TC_43_CheckTheChargerStatusWhenChargerIsInFinishingStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.RefreshBrowser();
        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        guestFlow.SelectChargerFromSimulator("Automatable Charger");
        dashboardPropertyDetails.selectChargerStatus("Finishing");
        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.SimulatorChargerStatusSaveBtn,2000));
        dashboardPropertyDetails.CloseTab();
        guestFlow.SwitchToTab(0);
        Assert.assertTrue(dashboardPropertyDetails.verifyChargerInUseStatusSeeDetails());
    }
    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_CheckTheChargerStatusWhenChargerIsInAvailableStatusFromFinishStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.RefreshBrowser();
        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        guestFlow.SelectChargerFromSimulator("Automatable Charger");
        dashboardPropertyDetails.selectChargerStatus("Available");
        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.SimulatorChargerStatusSaveBtn,2000));
        Assert.assertTrue(dashboardPropertyDetails.verifyChargerAvailabilityInSeeDetails());
    }




}
