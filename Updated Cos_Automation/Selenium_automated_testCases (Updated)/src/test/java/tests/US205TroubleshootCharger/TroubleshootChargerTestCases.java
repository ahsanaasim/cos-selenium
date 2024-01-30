package tests.US205TroubleshootCharger;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

public class TroubleshootChargerTestCases extends BaseTest {

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckIfThereIs3dotButtonBesideTheEditButtonOfChargerTable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(2000,TroubleshootCharger.ThreeDotBesideEditBtn));

    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckWhatHappenedWhenAdminClickOnThe3DotButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        operation.clickButton(TroubleshootCharger.ThreeDotBesideEditBtn,1000);
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,TroubleshootCharger.TroubleshootButton));

    }
    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckTheTitleOfTheTroubleshootingDrawerPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        operation.ClickButton(TroubleshootCharger.ThreeDotBesideEditBtn,5000);
        operation.clickButton(TroubleshootCharger.TroubleshootButton,100);
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,TroubleshootCharger.TroubleShootDrawerTitle));
        Assert.assertTrue(troubleshootCharger.verifyTextMatching(1000,TroubleshootCharger.TroubleShootDrawerTitle,"Troubleshooting"));

    }
    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckTheSectionOfTheDrawerAreShowingProperly() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        operation.clickButton(InvoiceFilter.AdvanceFilterCrossButton,2000);
        dashboard.refreshBrowser();
        operation.clickButton(TroubleshootCharger.ThreeDotBesideEditBtn,15000);
        operation.click(TroubleshootCharger.TroubleshootButton);
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1500,TroubleshootCharger.ChargerInfoSection));
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,TroubleshootCharger.ChargerStatusActionsSection));
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,TroubleshootCharger.DiagnosisInformationSection));

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckTheOptionsUnderChargerInfoSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        operation.ClickButton(TroubleshootCharger.ThreeDotBesideEditBtn,10000);
//        operation.click(TroubleshootCharger.TroubleshootButton);
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1500,TroubleshootCharger.ChargerTitle));
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,TroubleshootCharger.PropertyAddress));
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,TroubleshootCharger.LocationTitle));

    }
    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckTheButtonsUnderChargerStatusAndActionsSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        operation.ClickButton(InvoiceFilter.AdvanceFilterCrossButton,1000);
//        dashboard.RefreshBrowser();
//        operation.ClickButton(TroubleshootCharger.ThreeDotBesideEditBtn,10000);
//        operation.click(TroubleshootCharger.TroubleshootButton);
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1500,TroubleshootCharger.HardReset));
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,TroubleshootCharger.SoftReset));
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,TroubleshootCharger.BootCharger));
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,TroubleshootCharger.UpgradeFirmware));

    }@Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckWhatHappennsIfAdminClicksOnTheTroubleshootButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.GotoDashboard());
////        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        operation.clickButton(InvoiceFilter.AdvanceFilterCrossButton,1000);
//        dashboard.RefreshBrowser();
        operation.clickButton(TroubleshootCharger.ThreeDotBesideEditBtn,8000);
        operation.clickButton(TroubleshootCharger.TroubleshootButton,2000);
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,TroubleshootCharger.TroubleShootDrawerTitle));

    }@Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_checkIfTheChargerNameIsShowingCorrectlyInTheTroubleshootingDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(troubleshootCharger.verifyTableNameMatchingWithDrawer(ChargerListPropertyAdmin.ChargerTitle,TroubleshootCharger.ChargerTitleName));

    }
    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_checkIfThePropertyAddressIsShowingCorrectlyInTheTroubleshootingDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(troubleshootCharger.verifyTableNameMatchingWithDrawer(ChargerListPropertyAdmin.PropertyAddress,TroubleshootCharger.PropertyAddressName));

    }
    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_checkIfTheLocationNameIsShowingCorrectlyInTheTroubleshootingDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(troubleshootCharger.verifyTableNameMatchingWithDrawer(ChargerListPropertyAdmin.LocationName,TroubleshootCharger.LocationTitleName));

    }
    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckWhatHappenedIfAdminTryToHardResetAChargerThatIsNotConnectedToTheCentralSystem() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        operation.writeInputText(CreateCharger.searchchargerfield,"Testing Charger-1161",3000);
        operation.clickButton(CreateCharger.searchargerbtn,1000);
        operation.clickButton(TroubleshootCharger.ThreeDotBesideEditBtn,1000);
        operation.clickButton(TroubleshootCharger.TroubleshootButton,1000);
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1000,TroubleshootCharger.ChargerNotConfiguredMsg));

    }

    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-18,19"})
    public void TC_18_19_CheckDisableButtonsWhichIsNotIsNotConnectedToTheCentralSystem() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.GotoDashboard());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        operation.writeInputText(CreateCharger.searchchargerfield,"Testing Charger-1161",1000);
//        operation.ClickButton(CreateCharger.searchargerbtn,1000);
//        operation.ClickButton(TroubleshootCharger.ThreeDotBesideEditBtn,1000);
//        operation.ClickButton(TroubleshootCharger.TroubleshootButton,1000);
        Assert.assertTrue(troubleshootCharger.verifyAFieldIsDisable(1000,TroubleshootCharger.HardResetDisabled));
        Assert.assertTrue(troubleshootCharger.verifyAFieldIsDisable(1000,TroubleshootCharger.SoftResetDisabled));
        Assert.assertTrue(troubleshootCharger.verifyAFieldIsDisable(1000,TroubleshootCharger.BootChargerDisabled));
        Assert.assertTrue(troubleshootCharger.verifyAFieldIsDisable(1000,TroubleshootCharger.UpgradeFirmwareDisabled));

    }
    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_CheckTheChargerTitleIsChangingInTheTroubleshootDrawerWhenTheAdminChangeTheChargerTitleFromPanel() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        operation.writeInputText(CreateCharger.searchchargerfield,"Troubleshoot checker charger",1000);
        operation.clickButton(CreateCharger.searchargerbtn,1000);
        operation.clickButton(DownCharger.EditButton,1000);
        Assert.assertTrue(troubleshootCharger.verifyChangerNameChangedInTroubleshootDrawer());
        ;

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_CheckThePropertyAddressIsChangingInTheTroubleshootDrawerWhenTheAdminChangeThePropertyAddressFromPanel() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
        loginPage.verifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        operation.writeInputText(CreateCharger.searchchargerfield,"Troubleshoot checker charger",1000);
        operation.clickButton(CreateCharger.searchargerbtn,1000);
        Assert.assertTrue(troubleshootCharger.verifyPropertyAddressChangedInTroubleshootDrawer());


    }


    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_CheckTheLocationTitleIsChangingInTheTroubleshootDrawerWhenTheAdminChangeTheLocationTitleFromPanel() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        operation.writeInputText(CreateCharger.searchchargerfield,"Troubleshoot checker charger",1000);
        operation.clickButton(CreateCharger.searchargerbtn,1000);
        Assert.assertTrue(troubleshootCharger.verifyLocationNameChangedInTroubleshootDrawer());


    }
    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_CheckWhatHappenedWhenAdminClickCrossOnTheTopOfTheTroubleshootDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.gotoDashboard());
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        operation.clickButton(TroubleshootCharger.ThreeDotBesideEditBtn,15000);
        operation.clickButton(TroubleshootCharger.TroubleshootButton, 2000);
        operation.clickButton(InvoiceFilter.AdvanceFilterCrossButton, 1500);
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1500,EditChargerCosAdminUpdated.ProfileTop));
    }


    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_35_CheckWhatHappenedWhenAdminClickOutsideOfTroubleshootDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        BasePage basePage = new BasePage(driver);
        Dashboard dashboard = new Dashboard(driver);
        DownCharger downCharger = new DownCharger(driver);
        CreateCharger operation = new CreateCharger(driver);
        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
        operation.clickButton(TroubleshootCharger.ThreeDotBesideEditBtn, 1000);
        operation.clickButton(TroubleshootCharger.TroubleshootButton, 1000);
        operation.clickButton(CreateCharger.outsidedrawer, 1500);
        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(1500, EditChargerCosAdminUpdated.ProfileTop));

    }
//
//    @Test(priority = 16)//Done
//    @TestParameters(testCaseId = {"TC-16"})
//    public void TC_19_CheckIfThereIs3dotButtonBesideTheEditButtonOfChargerTable() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        BasePage basePage = new BasePage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        DownCharger downCharger = new DownCharger(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
//        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(2000,TroubleshootCharger.ThreeDotBesideEditBtn));
//
//    }
//    @Test(priority = 16)//Done
//    @TestParameters(testCaseId = {"TC-16"})
//    public void TC_17_CheckIfThereIs3dotButtonBesideTheEditButtonOfChargerTable() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        BasePage basePage = new BasePage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        DownCharger downCharger = new DownCharger(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
//        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(2000,TroubleshootCharger.ThreeDotBesideEditBtn));
//
//    }
//    @Test(priority = 16)//Done
//    @TestParameters(testCaseId = {"TC-16"})
//    public void TC_18_CheckIfThereIs3dotButtonBesideTheEditButtonOfChargerTable() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        BasePage basePage = new BasePage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        DownCharger downCharger = new DownCharger(driver);
//        CreateCharger operation = new CreateCharger(driver);
//        TroubleshootCharger troubleshootCharger = new TroubleshootCharger(driver);
//        ChargerListPropertyAdmin chargerList = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        Assert.assertTrue(troubleshootCharger.verifyAnElementDisplayedOrNot(2000,TroubleshootCharger.ThreeDotBesideEditBtn));
//
//    }





}
