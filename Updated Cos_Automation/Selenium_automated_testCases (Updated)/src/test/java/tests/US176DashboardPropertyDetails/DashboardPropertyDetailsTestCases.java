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

    @Test(priority = 1)
    @TestParameters(testCaseId = {"TC-0"})
    public void TC_0_PreConditionLoginToCOSAdmin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        createLocation.NewTabOpenAndSwitchToNewTab(1);
        Thread.sleep(2500);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());


    }

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckTheSeeDetailsButtonsUnderActionColumn() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        dashboardPropertyDetails.SwitchToTab(0);
        loginPage.verifyValidLoginForPropertyAdmin();
        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsBesideEveryProperty()));
    }
    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_TextTitleShouldBeTheSameAsTheDesign() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        loginPage.verifyValidLoginForPropertyAdmin();
        Assert.assertTrue((dashboardPropertyDetails.verifySeeDetailsButtonText()));
    }
    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_6_CheckTheTitleAboveTheDetailsDrawerAfterClickingOnDetailsButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        loginPage.verifyValidLoginForPropertyAdmin();
        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsDrawerTitle()));
    }
    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckTheLocationTitleInDetailsDrawerAfterClickingOnDetailsButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.refreshBrowser();
        loginPage.verifyValidLoginForPropertyAdmin();
        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsDrawerLocationTitle()));
    }
    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckTheLocationTitleInDetailsDrawerAfterClickingOnDetailsButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.refreshBrowser();
        loginPage.verifyValidLoginForPropertyAdmin();
        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsDrawerTitle()));

    }
    //    @Test(priority = 6)//Done
//    @TestParameters(testCaseId = {"TC-10"})
//    public void TC_11_CheckNoLocationMessage() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        loginPage.VerifyValidLoginForPropertyAdminWithPerfectCombination();
//        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsDrawerTitle()));
//    }
    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckNoChargerMessage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        CreateCharger operation = new CreateCharger(driver);
        dashboardPropertyDetails.LogoutFromExistingAccount();
        Thread.sleep(3000);
        loginPage.verifyValidLoginForPropertyAdminWithPerfectCombination();
        operation.clickButton(Dashboard.PropertyFilterField,2000);
        operation.clickButton(Dashboard.StardewValleyPropertyFromOption,2000);
        Assert.assertTrue((dashboardPropertyDetails.verifyNoChargerMsg()));

    }
    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckNoLocationAndChargerMessage() throws InterruptedException {
        DashboardPropertyAdmin dashboard =new DashboardPropertyAdmin(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        CreateCharger operation = new CreateCharger(driver);
//        loginPage.VerifyValidLoginForPropertyAdminWithPerfectCombination();
//        dashboard.RefreshBrowser();
        dashboard.GotoDashboard();
        operation.clickButton(Dashboard.PropertyFilterField,2000);
        operation.clickButton(Dashboard.AutomationPropertyFromOption,2000);
        Assert.assertTrue((dashboardPropertyDetails.verifyNoLocationAndCharger()));
//        dashboardPropertyDetails.LogoutFromExistingAccount();
    }
    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckDrawerOpensForOnlyLocationsProperty() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        dashboardPropertyDetails.LogoutFromExistingAccount();
        Thread.sleep(3000);
        loginPage.verifyValidLoginForPropertyAdminOnlyLocations();
        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsDrawerTitle()));
    }
    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckLocationsAreShowingAfterClickOnSeeDetails() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.refreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdminOnlyLocations();
        Assert.assertTrue(createCharger.clickButton(DashboardPropertyDetails.DetailsBtn1,6000));
        Assert.assertTrue(dashboardPropertyDetails.verifyTextMatching(2000,DashboardPropertyDetails.DrawerLocationTitle,"Maven Location"));
        Assert.assertTrue(dashboardPropertyDetails.verifyTextMatching(2000,DashboardPropertyDetails.DrawerLocationTitle2,"Enterprise Location"));
        Assert.assertTrue(dashboardPropertyDetails.verifyTextMatching(2000,DashboardPropertyDetails.DrawerLocationTitle3,"Eastern Way"));
    }
    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckNoChargersForOnlyLocations() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.refreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdminOnlyLocations();
        Assert.assertTrue(createCharger.clickButton(DashboardPropertyDetails.DetailsBtn1,4000));
        Assert.assertTrue(dashboardPropertyDetails.verifyAnElementDisplayedOrNot(2000,DashboardPropertyDetails.NoChargermsg));
        Assert.assertTrue(dashboardPropertyDetails.verifyAnElementDisplayedOrNot(1000,DashboardPropertyDetails.NoChargermsg2));
        Assert.assertTrue(dashboardPropertyDetails.verifyAnElementDisplayedOrNot(1000,DashboardPropertyDetails.NoChargermsg3));

    }
    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckDrawerOpenedWhenClicksOnSeeDetailsThatHasOfflineLocations() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        dashboardPropertyDetails.LogoutFromExistingAccount();
        Thread.sleep(4000);
        loginPage.verifyValidLoginForPropertyAdminOfflineLocations();
        Assert.assertTrue((dashboardPropertyDetails.verifyDetailsDrawerTitle()));
    }
    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckOfflineTagsForOfflineLocations() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.refreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdminOfflineLocations();
        Assert.assertTrue(createCharger.clickButton(DashboardPropertyDetails.DetailsBtn1,3000));
        Assert.assertTrue(dashboardPropertyDetails.verifyAnElementDisplayedOrNot(2000,DashboardPropertyDetails.OfflineTagBesideLocation));
        Assert.assertTrue(dashboardPropertyDetails.verifyAnElementDisplayedOrNot(1000,DashboardPropertyDetails.OfflineTagBesideLocation2));
        Assert.assertTrue(dashboardPropertyDetails.verifyAnElementDisplayedOrNot(1000,DashboardPropertyDetails.OfflineTagBesideLocation3));
    }
    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckChargerStatusOfflineForOfflineLocations() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.refreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdminOfflineLocations();
        Assert.assertTrue(createCharger.clickButton(DashboardPropertyDetails.DetailsBtn1,5000));
        Assert.assertTrue((dashboardPropertyDetails.verifyChargerStatusOfflineForOfflineLocations()));

    }
//    @Test(priority = 14)//Done
//    @TestParameters(testCaseId = {"TC-20"})
//    public void TC_20_CheckLocationCountAfterCreatingNewLocation() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
////        dashboardPropertyDetails.LogoutFromExistingAccount();
//        Thread.sleep(3000);
//        loginPage.VerifyValidLoginForPropertyAdminCountTest();
//        Assert.assertTrue((dashboardPropertyDetails.verifyLocationCountIncreasing()));
//    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckLocationCountInTableMatchWithDrawerLocationCount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        dashboardPropertyDetails.LogoutFromExistingAccount();
        Thread.sleep(3000);
        loginPage.verifyValidLoginForPropertyAdminCountTest();
        Assert.assertTrue((dashboardPropertyDetails.verifyLocationCountInTableMatchWithDrawer()));
    }
//    @Test(priority = 15)//Done
//    @TestParameters(testCaseId = {"TC-23"})
//    public void TC_23_CheckChargerCountAfterCreatingNewCharger() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        Thread.sleep(3000);
//        loginPage.VerifyValidLoginForPropertyAdminCountTest();
//        Assert.assertTrue((dashboardPropertyDetails.verifyChargerCountIncreasing()));
//    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_2_CheckChargersCountInTableMatchWithDrawerChargersCount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
//        dashboardPropertyDetails.LogoutFromExistingAccount();
//        Thread.sleep(3000);
//        loginPage.VerifyValidLoginForPropertyAdminCountTest();
        dashboard.refreshBrowser();
        Assert.assertTrue((dashboardPropertyDetails.verifyChargerCountInTableMatchWithDrawer()));
    }


    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckChargerStatusOthersAfterCreatingNewCharger() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        Dashboard dashboard =new Dashboard(driver);
//        loginPage.VerifyValidLoginForPropertyAdminCountTest();
        dashboard.refreshBrowser();
        Assert.assertTrue(createCharger.clickButton(DashboardPropertyDetails.DetailsBtn1,5000));
        Assert.assertTrue((dashboardPropertyDetails.verifyOthersStatus()));

    }


    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-30,31"})
    public void TC_30_31_CheckWhenLocationIsTurningIntoOfflineWhileChargerSessionGoing () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger operation = new CreateCharger(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        CreateLocation createLocation =new CreateLocation(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        UpdateChargerPropertyAdmin editCharger = new UpdateChargerPropertyAdmin(driver);
        dashboardPropertyDetails.LogoutFromExistingAccount();
        Thread.sleep(5000);
        loginPage.verifyValidLoginForPropertyAdminChargerStatusCheck();
        Thread.sleep(5000);
        guestFlow.SwitchToTab(1);
//        guestFlow.NewTabOpenAndSwitchToNewTab(1);
//        loginPage.VerifyValidLogin();
        createLocation.GoToLocationPage();
        operation.writeInputText(CreateLocation.searchbar,"Beautiful Location",8000);
        operation.clickButton(CreateCharger.searchargerbtn,1000);
        operation.clickButton(EditLocation.EditButton,1000);
        editCharger.clickToggleButtonIfItIsOn();
        operation.clickButton(CreateLocation.savelocationbtn,2000);
        guestFlow.SwitchToTab(0);
        operation.clickButton(DashboardPropertyDetails.DetailsBtn1,3000);
        Assert.assertTrue(dashboardPropertyDetails.verifyOfflineLocationAndOfflineCharger());
    }
    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-32,33"})
    public void TC_32_33_CheckWhenLocationIsTurningOnlineFromOfflineWhileChargerSessionGoing () throws InterruptedException {
        CreateCharger createCharger = new CreateCharger(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        Dashboard dashboard =new Dashboard(driver);
        UpdateChargerPropertyAdmin editCharger = new UpdateChargerPropertyAdmin(driver);
        dashboard.refreshBrowser();
        guestFlow.SwitchToTab(1);
        createCharger.clickButton(EditLocation.EditButton,2000);
        editCharger.clickToggleButtonIfItIsOff();
        createCharger.clickButton(CreateLocation.savelocationbtn,2000);
        guestFlow.SwitchToTab(0);
        createCharger.clickButton(DashboardPropertyDetails.DetailsBtn1,3000);
        Assert.assertTrue(dashboardPropertyDetails.verifyOnlineLocation());
//        Assert.assertTrue(dashboardPropertyDetails.verifyInUseCharger());

    }
    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_CheckWhatHappenedIfTheUserClickOutsideTheDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        Dashboard dashboard =new Dashboard(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        guestFlow.SwitchToTab(0);
        dashboard.refreshBrowser();
        loginPage.verifyValidLoginForPropertyAdminChargerStatusCheck();
        Assert.assertTrue(createCharger.clickButton(DashboardPropertyDetails.DetailsBtn1,5000));
        Assert.assertTrue(createCharger.clickButton(CreateCharger.outsidedrawer,5000));
        Assert.assertTrue(dashboardPropertyDetails.verifyDrawerClosed());
    }
    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_CheckWhatHappenedIfTheUserClickCrossButtonOfTheDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        loginPage.verifyValidLoginForPropertyAdminChargerStatusCheck();
        Assert.assertTrue(createCharger.clickButton(DashboardPropertyDetails.DetailsBtn1,5000));
        Assert.assertTrue(createCharger.clickButton(CreateCharger.crossbtnofdrawer,5000));
        Assert.assertTrue(dashboardPropertyDetails.verifyDrawerClosed());
    }
    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_CheckTheChargerStatusWhenChargerIsInAvailableStatus() throws InterruptedException {
        Dashboard dashboard =new Dashboard(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        dashboard.refreshBrowser();
        loginPage.verifyValidLoginForPropertyAdminChargerStatusCheck();
//        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        guestFlow.SwitchToTab(1);
//        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        guestFlow.makeASpecificChargerAvailable("Automatable Charger");
        Assert.assertTrue(dashboardPropertyDetails.verifyChargerAvailabilityInSeeDetails());
    }
    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_CheckTheChargerStatusWhenChargerIsInPreparingStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.refreshBrowser();
        loginPage.verifyValidLoginForPropertyAdminChargerStatusCheck();
//        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        guestFlow.SwitchToTab(1);
//        loginPage.VerifyValidLogin();
        guestFlow.GoToSimulator();
        guestFlow.makeASpecificChargerAvailable("Automatable Charger");
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        Assert.assertTrue(operation.clickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.SwitchToTab(2);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(5000,"666666"));
        operation.clickButton(OTPVerificationPage.VerifyButton,2000);
        guestFlow.SwitchToTab(1);
        Assert.assertTrue(operation.clickButton(GuestFlow.PluginChargerbtn,1000));
        guestFlow.SwitchToTab(0);
        Assert.assertTrue(dashboardPropertyDetails.verifyChargerInUseStatusSeeDetails());

    }



    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-39"})
    public void TC_39_CheckTheChargerStatusWhenChargerIsInChargingStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger operation = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.refreshBrowser();
        loginPage.verifyValidLoginForPropertyAdminChargerStatusCheck();
        guestFlow.SwitchToTab(1);
        guestFlow.GoToSimulator();
        guestFlow.SelectChargerFromSimulator("Automatable Charger");
        dashboardPropertyDetails.selectChargerStatus("Charging");
        Assert.assertTrue(operation.clickButton(DashboardPropertyDetails.SimulatorChargerStatusSaveBtn,2000));
        guestFlow.SwitchToTab(2);
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.clickButton(GuestFlow.AuthorizeButton,1500));
        guestFlow.SwitchToTab(0);
        Assert.assertTrue(dashboardPropertyDetails.verifyChargerInUseStatusSeeDetails());
    }
//    @Test(priority = 24)//Done
//    @TestParameters(testCaseId = {"TC-40"})
//    public void TC_40_CheckTheChargerStatusWhenChargerIsInSuspendedEVStatus() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        GuestFlow guestFlow = new GuestFlow(driver);
//        Dashboard dashboard =new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
//        guestFlow.SwitchToTab(1);
//        guestFlow.GoToSimulator();
//        guestFlow.SelectChargerFromSimulator("Automatable Charger");
//        dashboardPropertyDetails.selectChargerStatus("Suspended EV");
//        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.SimulatorChargerStatusSaveBtn,2000));
//        guestFlow.SwitchToTab(0);
//        Assert.assertTrue(dashboardPropertyDetails.verifyChargerInUseStatusSeeDetails());
//    }
    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_CheckTheChargerStatusWhenChargerIsInSuspendedEVSEStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard =new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
        guestFlow.SwitchToTab(1);
        guestFlow.GoToSimulator();
        guestFlow.SelectChargerFromSimulator("Automatable Charger");
        dashboardPropertyDetails.selectChargerStatus("Faulted");
        Assert.assertTrue(createCharger.clickButton(DashboardPropertyDetails.SimulatorChargerStatusSaveBtn,2000));
        guestFlow.SwitchToTab(0);
        Assert.assertTrue(dashboardPropertyDetails.verifyChargerDownStatusSeeDetails());
    }



//    @Test(priority = 26)//Done
//    @TestParameters(testCaseId = {"TC-43"})
//    public void TC_43_CheckTheChargerStatusWhenChargerIsInFinishingStatus() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
//        GuestFlow guestFlow = new GuestFlow(driver);
//        Dashboard dashboard =new Dashboard(driver);
//        dashboard.RefreshBrowser();
//        loginPage.VerifyValidLoginForPropertyAdminChargerStatusCheck();
//        guestFlow.NewTabOpenAndSwitchToNewTab(1);
//        loginPage.VerifyValidLogin();
//        guestFlow.GoToSimulator();
//        guestFlow.SelectChargerFromSimulator("Automatable Charger");
//        dashboardPropertyDetails.selectChargerStatus("Finishing");
//        Assert.assertTrue(createCharger.ClickButton(DashboardPropertyDetails.SimulatorChargerStatusSaveBtn,2000));
//        dashboardPropertyDetails.CloseTab();
//        guestFlow.SwitchToTab(0);
//        Assert.assertTrue(dashboardPropertyDetails.verifyChargerInUseStatusSeeDetails());
//    }
    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_CheckTheChargerStatusWhenChargerIsInAvailableStatusFromFinishStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        DashboardPropertyDetails dashboardPropertyDetails =new DashboardPropertyDetails(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Dashboard dashboard =new Dashboard(driver);
        dashboard.refreshBrowser();
        loginPage.verifyValidLoginForPropertyAdminChargerStatusCheck();
        guestFlow.SwitchToTab(1);
        guestFlow.GoToSimulator();
        guestFlow.SelectChargerFromSimulator("Automatable Charger");
        Assert.assertTrue(createCharger.clickButton(SimulationPage.DisconnectCharger,2000));
        Assert.assertTrue(dashboardPropertyDetails.verifyChargerAvailabilityInSeeDetails());
    }




}
