package tests.FullChargerModule;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class ChargerModuleTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();



    //Create charger starts

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_VerifyCreateNewChargerIsShowingtoAdmin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());

    }
    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_AddNewChargerDrawerHasDisplayedAfterClickingonAddNewChargerButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.VerifyAddNewChargerDrawerHasDisplayed());
    }


    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_NewlyAddedChargerShowingInTheTable() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        Random objGenerator = new Random();
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        int randomNumber = objGenerator.nextInt(10000);
        System.out.println(randomNumber);
        String temp="C4X- "+randomNumber;
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,temp,2000));
        createcharger.selectChargingRate("9.90");
        createcharger.selectProperty("Sydney Nienow");
        createcharger.selectLocation("Sydney");
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.VerifyConfirmationPopUpHasDisplayed());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.searchchargerfield,temp,3000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,2000));
        Assert.assertTrue(createcharger.VerifySearchResultCount());
    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-82"})
    public void TC_82_CheckChargerPlugTypeIsSelectedAfterEnteringIntoCreateNewChargerSection() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        Random objGenerator = new Random();
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.verifyTextMatching(1500,CreateCharger.ChargerPlugType,"J1772"));
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.verifyTextMatching(1500,CreateCharger.ChargerPlugType,"J1772"));

    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CosAccountingCanSeeAddChargerButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        DashboardPropertyDetails logoutOperation = new DashboardPropertyDetails(driver);
        logoutOperation.LogoutFromExistingAccount();
        Thread.sleep(3000);
        loginPage.VerifyValidLoginForCosAccounting();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());

    }
    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CosAccountingCanClickOnAddNewChargerButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
//        loginPage.VerifyValidLoginForCosAccounting();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.VerifyAddNewChargerDrawerHasDisplayed());

    }
    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_NewlyAddedChargerByCosAccountingShowingInTheTable() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        Random objGenerator = new Random();
        loginPage.VerifyValidLoginForCosAccounting();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        int randomNumber = objGenerator.nextInt(10000);
        System.out.println(randomNumber);
        String temp="APN-"+randomNumber;
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,temp,1000));
        createcharger.selectChargingRate("9.90");
        createcharger.selectProperty("Broadleaf Homes");
        createcharger.selectLocation("McLaughlin Avenue 88194004");
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.VerifyConfirmationPopUpHasDisplayed());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.searchchargerfield,temp,3000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,2000));
        Assert.assertTrue(createcharger.VerifySearchResultCount());
    }
    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CosPropertySupportCanSeeAddChargerButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        DashboardPropertyDetails logoutOperation = new DashboardPropertyDetails(driver);
        logoutOperation.LogoutFromExistingAccount();
        Thread.sleep(2500);
        loginPage.VerifyValidLoginForCosPropertySupport();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CosPropertySupportCanClickOnAddNewChargerButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLoginForCosPropertySupport();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.VerifyAddNewChargerDrawerHasDisplayed());
    }
    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_NewlyAddedChargerByCosPropertySupportShowingInTheTable() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        Random objGenerator = new Random();
        loginPage.VerifyValidLoginForCosPropertySupport();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        int randomNumber = objGenerator.nextInt(2000);
        System.out.println(randomNumber);
        String temp="Angel- "+randomNumber;
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,temp,2000));
        createcharger.selectChargingRate("11.50");
        createcharger.selectProperty("Angel in us property");
        createcharger.selectLocation("Angel in US");
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.VerifyConfirmationPopUpHasDisplayed());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.searchchargerfield,temp,3000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,2000));
        Assert.assertTrue(createcharger.VerifySearchResultCount());
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CosDriverSupportCanSeeAddChargerButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        DashboardPropertyDetails logoutOperation = new DashboardPropertyDetails(driver);
        logoutOperation.LogoutFromExistingAccount();
        loginPage.VerifyValidLoginForCosDriverSupport();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CosDriverSupportCanClickOnAddNewChargerButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLoginForCosDriverSupport();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.verifyAFieldIsDisable(3000,CreateCharger.addChargerBtnDisabled));
//        Assert.assertTrue(createcharger.VerifyAddNewChargerDrawerHasDisplayed());
    }
    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_NewlyAddedChargerByCosDriverSupportShowingInTheTable() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        Random objGenerator = new Random();
//        loginPage.VerifyValidLoginForCosDriverSupport();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.verifyAFieldIsDisable(3000,CreateCharger.addChargerBtnDisabled));
//        Thread.sleep(3000);
//        int randomNumber = objGenerator.nextInt(10000);
//        System.out.println(randomNumber);
//        String temp="My New Charger-"+randomNumber;
//        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,temp,2000));
//        Assert.assertTrue(createcharger.clickonPropertySelect());
//        Assert.assertTrue(createcharger.writeInputText(CreateCharger.selectproperty,"East Avenue",2000));
//        Assert.assertTrue(createcharger.selectPropertyNameFromSelectPropertyDropdown());
//        Assert.assertTrue((createcharger.clickonlocation()));
//        Assert.assertTrue(createcharger.writeInputText(CreateCharger.location,"Electric Charger",2000));
//        Assert.assertTrue(createcharger.selectLoactionNameFromSelectPropertyDropdown());
//        Assert.assertTrue(createcharger.clickonSaveChargerButton());
//        Assert.assertTrue(createcharger.VerifyConfirmationPopUpHasDisplayed());
//        Assert.assertTrue(createcharger.writeInputText(CreateCharger.searchchargerfield,temp,3000));
//        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,2000));
//        Assert.assertTrue(createcharger.VerifySearchResultCount());
    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CosTechSupportCanSeeAddChargerButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        DashboardPropertyDetails logoutOperation = new DashboardPropertyDetails(driver);
        logoutOperation.LogoutFromExistingAccount();
        loginPage.VerifyValidLoginForCosTechSupport();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CosTechSupportCanClickOnAddNewChargerButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLoginForCosTechSupport();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.VerifyAddNewChargerDrawerHasDisplayed());
    }
    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_NewlyAddedChargerByCosTechSupportShowingInTheTable() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        Random objGenerator = new Random();
        loginPage.VerifyValidLoginForCosTechSupport();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Thread.sleep(3000);
        int randomNumber = objGenerator.nextInt(5000);
        System.out.println(randomNumber);
        String temp="B2W Charger- "+randomNumber;
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,temp,2000));
        createcharger.selectChargingRate("9.90");
        createcharger.selectProperty("New Haven Studio");
        createcharger.selectLocation("South avenue");
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.VerifyConfirmationPopUpHasDisplayed());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.searchchargerfield,temp,3000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,2000));
        Assert.assertTrue(createcharger.VerifySearchResultCount());
    }
    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_CheckPropertyAdminCanNotSeeAddChargerButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        DashboardPropertyAdmin dashboardPropertyAdmin = new DashboardPropertyAdmin(driver);
        DashboardPropertyDetails logoutOperation = new DashboardPropertyDetails(driver);
        logoutOperation.LogoutFromExistingAccount();
        dashboardPropertyAdmin.GoToCompanyPanelLoginPage();
        Thread.sleep(2000);
        loginPage.VerifyValidLoginForPropertyAdmin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargersPropertyAdmin());
        Assert.assertTrue(createcharger.verifyElementNotDisplayed(5000,CreateCharger.addchargerbtn));
    }
    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-50"})
    public void TC_50_CheckAdminCanSeeAllTheSectionProperlyInTheDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        DashboardPropertyDetails logoutOperation = new DashboardPropertyDetails(driver);
        logoutOperation.LogoutFromExistingAccount();
        dashboard.GoToCosAdminLoginPage();
        Thread.sleep(2000);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.verifyDrawerContainsAllNecessarySection());
    }
    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-51"})
    public void TC_51_CheckAdminCanWriteInInputFieldOfTheDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My New Charger-20",2000));
        createcharger.selectProperty("Automation Property 2");
        createcharger.selectLocation("Beautiful Location");
    }
    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-53"})
    public void TC_53_CheckAdminCanWriteInInputAndGetSearchResultFromFieldOffTheDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My New Charger-30",2000));
        Assert.assertTrue(createcharger.clickonPropertySelect());
        createcharger.selectProperty("Automation Property 2");
        createcharger.selectLocation("Beautiful Location");
    }

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-55"})
    public void TC_55_CheckAdminCanGetNoDataAfterInvalidSearchForProperty() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My New Charger-30",2000));
        Assert.assertTrue(createcharger.clickonPropertySelect());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.selectproperty,"No Property-22",2000));
        Assert.assertTrue(createcharger.verifyNoDataFromInvalidSearch());
    }

    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-56"})
    public void TC_56_CheckAdminCanGetNoDataAfterInvalidSearchForProperty() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My New Charger-30",2000));
        Assert.assertTrue(createcharger.clickonPropertySelect());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.selectproperty,"East Avenue",2000));
        Assert.assertTrue(createcharger.selectPropertyNameFromSelectPropertyDropdown());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.location,"No dataaaa",2000));
        Assert.assertTrue(createcharger.verifyNoDataFromInvalidSearch());
    }


    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-57"})
    public void TC_57_WhenAdminClicksOutsideTheDrawer() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue((createcharger.clickonoutsidethedrawer()));
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-58"})
    public void TC_58_WhenAdminClicksCrossButtonOfTheDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-59"})
    public void TC_59_WhenAdminClicksCancelButtonOfTheDrawerWithoutInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }

    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-60"})
    public void TC_60_WhenAdminClicksCrossButtonOfTheDrawerAfterEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My Another New Charger-10",1000));
        Assert.assertTrue(createcharger.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyDiscadContinuePopupHasDisplayed());
    }
    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-61"})
    public void TC_61_WhenAdminClicksCrossButtonEnteringAnyInputPopUpContainsNecessaryButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My Another New Charger-01",1000));
        Assert.assertTrue(createcharger.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyPopUpContainsDiscardAndContinueButton());
    }
    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-62"})
    public void TC_62_WhenAdminClicksDiscardButtonEnteringAnyInputPopUpContainsNecessaryButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My Another New Charger",1000));
        Assert.assertTrue(createcharger.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(createcharger.clickOnDiscardButtonOfPopUp());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-63"})
    public void TC_63_WhenAdminClicksCancelButtonOfTheDrawerAfterEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My Another New Charger-01",1000));
        Assert.assertTrue(createcharger.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyDiscadContinuePopupHasDisplayed());
    }
    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-64"})
    public void TC_64_WhenAdminClicksCancelButtonEnteringAnyInputPopUpContainsNecessaryButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My Another New Charger-01",1000));
        Assert.assertTrue(createcharger.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyPopUpContainsDiscardAndContinueButton());
    }
    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-65"})
    public void TC_65_AdminClicksDiscardButtonEnteringAnyInputWhenPopUpContainsNecessaryButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My Another New Charger-01",1000));
        Assert.assertTrue(createcharger.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(createcharger.clickOnDiscardButtonOfPopUp());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-66"})
    public void TC_66_WhenAdminClicksOutsideOfTheDrawerAfterEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My Another New Charger-01",1000));
        Assert.assertTrue(createcharger.clickonoutsidethedrawer());
        Assert.assertTrue(createcharger.verifyDiscadContinuePopupHasDisplayed());
    }
    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-67"})
    public void TC_67_WhenAdminClicksOutsideOfTheDrawerAfterEnteringAnyInputNeccessaryButtonShowing() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My Another New Charger-01",1000));
        Assert.assertTrue(createcharger.clickonoutsidethedrawer());
        Assert.assertTrue(createcharger.verifyPopUpContainsDiscardAndContinueButton());
    }
    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-68"})
    public void TC_68_AdminClicksOutsideOfTheDrawerAndDiscardButtonAfterEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My Another New Charger-01",1000));
        Assert.assertTrue(createcharger.clickonoutsidethedrawer());
        Assert.assertTrue(createcharger.clickOnDiscardButtonOfPopUp());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 35)//Done
    @TestParameters(testCaseId = {"TC-70"})
    public void TC_70_WhenPressSaveButtonWithoutChargerNameInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        createcharger.selectProperty("Banasree police park");
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.verifyChargerNameErrorMsgHasDisplayed());
//
//        Assert.assertTrue(company.VerifyInvalidEINNumberErrorMessage(msg.InvalidEINNumberErrorMsg()));
    }
    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-71"})
    public void TC_71_WhenPressSaveButtonWithoutPropertyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My Another New Charger-01",1000));
        createcharger.selectChargingRate("9.90");
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.verifyPropertyNameErrorMsgHasDisplayed());
    }
    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-72"})
    public void TC_72_WhenAdminProvidesValidDataExceptLocationInFieldOfCreateNewCharger() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        Random numGenerator = new Random();
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        int randomNumber = numGenerator.nextInt(10000);
        System.out.println(randomNumber);
        String temp="D 10 charger "+randomNumber;
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,temp,2000));
        createcharger.selectChargingRate("9.90");
        createcharger.selectProperty("Stardew Valley");
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.VerifyConfirmationPopUpHasDisplayed());
    }
    @Test(priority = 38)//Done
    @TestParameters(testCaseId = {"TC-73"})
    public void TC_73_WhenPressSaveButtonWithoutAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.verifyChargerNameErrorMsgHasDisplayed());
        Assert.assertTrue(createcharger.verifyPropertyNameErrorMsgHasDisplayed());
        Assert.assertTrue(createcharger.verifyAnElementDisplayedOrNot(1000,CreateCharger.ChargingRaterequiredMessage));
        Assert.assertTrue(createcharger.verifyElementNotDisplayed(1000,CreateCharger.PlugTypeRequiredErrorMessage));



    }

    @Test(priority = 39)//Done
    @TestParameters(testCaseId = {"TC-75"})
    public void TC_75_CheckDrawerClosingAfterProvidingAllValidInformation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        Random numGenerator = new Random();
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        int randomNumber = numGenerator.nextInt(3000);
        System.out.println(randomNumber);
        String temp="D 10 charger "+randomNumber;
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,temp,2000));
        createcharger.selectChargingRate("9.90");
        createcharger.selectProperty("Banasree police park");
        createcharger.selectLocation("Banasree D-10");
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
        Assert.assertTrue(createcharger.VerifyConfirmationPopUpHasDisplayed());

    }
    //    @Test(priority = 40)//Done
//    @TestParameters(testCaseId = {"TC-76"})
//    public void TC_76_WhenAdminProvidesValidDatainFieldofCreateNewCharger() throws InterruptedException {
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        CreateCharger createcharger = new CreateCharger(driver);
////        loginPage.VerifyValidLogin();
////        Assert.assertTrue(dashboard.RefreshBrowser());
////        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
////        Assert.assertTrue(dashboard.clickOnChargers());
////        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
////        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My New Charger-30",2000));
////        Assert.assertTrue(createcharger.clickonPropertySelect());
////        Assert.assertTrue(createcharger.writeInputText(CreateCharger.selectproperty,"East Avenue",2000));
////        Assert.assertTrue(createcharger.selectPropertyNameFromSelectPropertyDropdown());
////        Assert.assertTrue((createcharger.clickonlocation()));
////        Assert.assertTrue(createcharger.writeInputText(CreateCharger.location,"Electric Charger",2000));
////        Assert.assertTrue(createcharger.selectLoactionNameFromSelectPropertyDropdown());
////        Assert.assertTrue(createcharger.clickonSaveChargerButton());
//        Assert.assertTrue(createcharger.VerifyConfirmationPopUpHasDisplayed());
//    }
    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-77"})
    public void TC_77_CheckWhatHappenedIfAdminDoNotChooseAnyChargingRate() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        Random numGenerator = new Random();
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(createcharger.ClickOnAddChargerButton());
        int randomNumber = numGenerator.nextInt(10000);
        String temp="My New Charger-"+randomNumber;
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,temp,2000));
        createcharger.selectProperty("Automation Property 2");
        createcharger.selectLocation("Beautiful Location");
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.verifyAnElementDisplayedOrNot(1000,CreateCharger.ChargingRaterequiredMessage));
        Assert.assertTrue(createcharger.verifyAnElementDisplayedOrNot(2500,CreateCharger.addnewchargerdrawer));

    }

    // Create Charger Ends


    //EditChargerStarts

    @Test(priority = 50)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckTheHeaderOfColumnAlternative() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.verifyHeaderColumnAlternative());
    }
//    @Test(priority = 2)//Done
//    @TestParameters(testCaseId = {"TC-2"})
//    public void TC_2_CheckAllSectionShowingActualData() throws InterruptedException {
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard=new Dashboard(driver);
//        CosAdminChargerList cosAdminChargerList = new CosAdminChargerList(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        Assert.assertTrue(cosAdminChargerList.verifyActualData());
//    }


    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckBlankContentUnderEachColumn() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        CosAdminChargerList cosAdminChargerList = new CosAdminChargerList(driver);
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(cosAdminChargerList.verifyExpectedTitleColumnOccupiedWithContent("Charger Title",0));
        Assert.assertTrue(cosAdminChargerList.verifyExpectedTitleColumnOccupiedWithContent("Property Name",1));
        Assert.assertTrue(cosAdminChargerList.verifyExpectedTitleColumnOccupiedWithContent("Property Address",2));
        Assert.assertTrue(cosAdminChargerList.verifyExpectedTitleColumnOccupiedWithContent("Location Name",3));
        Assert.assertTrue(cosAdminChargerList.verifyExpectedTitleColumnOccupiedWithContent("Action",4));
    }


    @Test(priority = 53)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckTheLocationColumnWhenAdminDidNotAssignAnyChargerToLocation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        dashboard.RefreshBrowser();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.writeInputText(ChargerListPropertyAdmin.SearchChargerField,"B2W Charger",5000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,1000));
        Assert.assertTrue(chargerListPropertyAdmin.verifyNAForNoLocation());
    }
    @Test(priority = 54)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckUpdatedLocation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        CosAdminChargerList cosAdminChargerList =new CosAdminChargerList(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.writeInputText(ChargerListPropertyAdmin.SearchChargerField,prop.getProperty("ChargerForCheckingDefaultState"), 5000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,2000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,2000));
        Assert.assertTrue(chargerListPropertyAdmin.verifyEditedLocation());

    }

    @Test(priority = 55)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckEditButtonUnderActionColumn() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,2000));
    }
    @Test(priority = 56)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckLoadMoreButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue((chargerListPropertyAdmin.verifyloadMoreButton()));

    }
    @Test(priority = 57)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckLoadMoreButtonWithText() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue((chargerListPropertyAdmin.verifyloadMoreButtonWithDigit()));
//        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.LoadMoreButton,2000));
    }

    @Test(priority = 58)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckActualNumberOfChargerWithLeftSideOfLoadMoreButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.verifyTheChargerCountWithLeftSideOFLoadMoreButton());
    }

//    @Test(priority = 10)//Done
//    @TestParameters(testCaseId = {"TC-11"})
//    public void TC_11_VerifyActualNumberOfChargerWithTableCharger() throws InterruptedException {
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        Assert.assertTrue(chargerListPropertyAdmin.verifyTheWithTable());
//    }

    @Test(priority = 60)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckWhatHappensWhenPAdminClicksOnTheLoadMoreButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.verifyLoadMoreButtonAction());
    }

    @Test(priority = 61)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckTheChargerCountOnTopOfTheTable () throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.LoadMoreButton,1000));
        Assert.assertTrue(chargerListPropertyAdmin.verifyChargerCountOnTop());
    }

    @Test(priority = 62)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckWhatHappensWhenAdminRefreshThePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.verifyTableDataAfterRefreshing());
    }
    @Test(priority = 63)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckWhatHappensWhenAdminRefreshThePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.verifyChargerCountOnTopAfterRefreshing());
    }


    //Search charger starts

    @Test(priority = 64)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_WhenAdminSearchChargerByInvalidChargerTitle() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        //    Assert.assertTrue(searchChargers.clickonChargersSearchbar());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("SpecialCharacter")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.verifNoDataisShowingafterProvidingInvalidData());
    }

    @Test(priority = 65)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_WhenAdminEntersAlphabatesinChargerTitle() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        //    Assert.assertTrue(searchChargers.clickonChargersSearchbar());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("Alphabates")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchcompany.verifNoDataisShowingafterProvidingInvalidData());
    }

    @Test(priority = 66)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_VerifyBrowserhasRereshafterProvidingSpaceinSearchBar() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        //    Assert.assertTrue(searchChargers.clickonChargersSearchbar());
        Assert.assertTrue(searchChargers.enterSpaceinSearchbar());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifPagehasRefreshafterpressingsearchbutton());
    }

    @Test(priority = 67)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_WhenAdminClickSearchButtonWithouttypingAnything() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifPagehasRefreshafterpressingsearchbutton());
    }

    @Test(priority = 68)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_VerifyCrossButtonHasDisplayedAfterTypingtheValidChargertitle() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(searchproperty.verifCrossButtonHasDisplyed());
    }

    @Test(priority = 69)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckWhatHappensWhenAdminClicksonCrossOption() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(searchproperty.clickOnCross());
        Assert.assertTrue(searchChargers.verifyProvidedtNameisNotShowingAfterClickingonCross());
    }

    @Test(priority = 70)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_VerifyPageHasRefreshedAfterClickingonCrossOption() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(searchproperty.clickOnCross());
        Assert.assertTrue(searchChargers.verifPagehasRefreshafterpressingsearchbutton());
    }

    @Test(priority = 71)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckWhatHappensWhenAdminClicksonCrossOptionAfterSearchingCharger() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());*/
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchproperty.clickOnCross());
        Assert.assertTrue(searchChargers.verifyProvidedtNameisNotShowingAfterClickingonCross());
    }

    @Test(priority = 72)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_VerifyChargerPageHasResetToDefaultvalueAfterPressingCrossButton() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchproperty.clickOnCross());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());
    }

    @Test(priority = 73)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_WhenAdminOpenLocationPageInIncognitoMode () throws InterruptedException, IOException {
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        Assert.assertTrue(searchChargers.openChargerPageinIncognitoModeForCOSAdmin());
    }

    @Test(priority = 74)//Done
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_WhenAdminPressEnterAfterSearchingtheCharger() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(searchChargers.pressEnterButton());
        Assert.assertTrue(searchChargers.verifyChargerWithProvidedTitleisShowing());
    }

    @Test(priority = 75)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_VerifyCountAftersearchingCharger () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifyChargerPageCount());
    }

    @Test(priority = 76)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckWhatHappensWhwnAdminSearchTheChargerByChargerTitle () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifyChargerWithProvidedTitleisShowing());
    }

    @Test(priority = 77)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckWhatHappensWhwnAdminSearchTheChargerByLocationTitle () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("Locationwithchargers")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.verifyChargerWithProvidedLocationTitleisShowing());
    }

    @Test(priority = 78)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckWhatHappensWhwnAdminRefreshthePageAfterSearchingTheCharger () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchcompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchChargers.SearchbyChargerTitle(prop.getProperty("validchargername")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(searchChargers.verifySearchInputRemainsSameAfterRefreshingTeBrowser());
    }

    @Test(priority = 79)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_verifyPropertyNameisShowinginPropertyDropdownAfterTypingValidPropertyName () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.verifyPropertyisShowingInTheDropDown());
    }

    @Test(priority = 80)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_VerifyAdvanceFilterDrawerHasClosedAfterSelectiongPropertyFromAdvanceFilterDrawer () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchproperty.verifyAdvanceFilterDrawerHasClosed());
    }

    @Test(priority = 81)//Done
    @TestParameters(testCaseId = {"TC-32"})
    public void TC_32_VerifyChargerWithSelectedPropertyisShowing () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyChargerWithSelectedtagAreShowingonChargersPage());
    }

    @Test(priority = 82)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_VerifyPropertyTagisShowingonChargerPageAfterSelectingPropertyFromAdvanceFilter () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchLocation.verifyPropertyTagisShowingonLocationPage());
    }

    @Test(priority = 83)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void TC_34_VerifyClaerAllTagisShowingonLocationPageAfterSelectingPropertyFromAdvanceFilter () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchproperty.verifyClearAllTagisShowingonPropertyPage());
    }

   /* @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-35"})
    public void TC_35_VerifyConnectionStatusisShowingonChargerPageAfterSelectingPropertyFromAdvanceFilter () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyConnectionStatusISShowingonChargerTable());
    }

*/

    @Test(priority = 85)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void TC_41_CheckWhatWhenAdminClicksonResetAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchCompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());
        Assert.assertTrue(searchChargers.VerifyTagHasbeenremovedAfterClickingonResetAllButton());
    }

    @Test(priority = 86)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void TC_42_VerifyPageHasResetToDefaultAfterClickingonResetAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchLocation.selectAnotherPropertyFromDropdown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchCompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());
        Assert.assertTrue(searchChargers.VerifyTagHasbeenremovedAfterClickingonResetAllButton());
        Assert.assertTrue(searchLocation.clickOutsideDrawer());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());
    }

    @Test(priority = 87)//Done
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_verifyLocationNameisShowinginDropdownAfterTypingValidLocationName () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.verifyLocationisShowingInTheDropDown());
    }

    @Test(priority = 88)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_VerifyAdvanceFilterDrawerHasClosedAfterSelectiongLocationFromAdvanceFilterDrawer () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchproperty.verifyAdvanceFilterDrawerHasClosed());
    }

    @Test(priority = 89)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void TC_47_VerifyLocationWithSelectedLocationsareShowingOnChargerPage () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyChargerWithSelectedtagAreShowingonChargersPage());

    }


    @Test(priority = 90)//Done
    @TestParameters(testCaseId = {"TC-48"})
    public void TC_48_VerifyLocationTagisShowingonChargerPageAfterSelectinglocationFromAdvanceFilter () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyLocationTagisShowingonChargerPage());
    }

    @Test(priority = 91)//Done
    @TestParameters(testCaseId = {"TC-49"})
    public void TC_49_CheckWhatHappensWhenAdmnSearchChargerBySelectingMutipleTags () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyChargerWithSelectedtagAreShowingonChargersPage());
    }


    @Test(priority = 92)//Done
    @TestParameters(testCaseId = {"TC-50"})
    public void TC_50_VerifySelectedTagsAreShowingonChargerPage () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        /*Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyChargerWithSelectedtagAreShowingonChargersPage());*/
        Assert.assertTrue(searchLocation.verifyPropertyTagisShowingonLocationPage());
        Assert.assertTrue(searchChargers.verifyLocationTagisShowingonChargerPage());
    }

    @Test(priority = 93)//Done
    @TestParameters(testCaseId = {"TC-53"})
    public void TC_53_CheckWhatHappensWhenAdminremoesOneTagafterSelectingMultipletags () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickOnCross());
        Assert.assertTrue(searchChargers.verifyTagHasbeenremovedAfterClickingonCrossButton());
    }


    @Test(priority = 94)//Done
    @TestParameters(testCaseId = {"TC-54"})
    public void TC_54_CheckWhatHappensWhenAdminremoesOneTagafterSelectingMultipletags () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickOnCross());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchChargers.verifyChargerIsNotShowingonChargerPgeAfterRemovingFromAdvanceFilterDrawer());
    }

    @Test(priority = 95)//Done
    @TestParameters(testCaseId = {"TC-55"})
    public void TC_54_CheckPreviouslySelectedInputFieldsAreShowingAfterOpeningAdvanceFilterDrawerAgain () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.verifySelectedFiltersAreShowingonAdvanceFilterDrawer());
    }

    @Test(priority = 96)//Done
    @TestParameters(testCaseId = {"TC-56"})
    public void TC_56_checkWhathappensWhenAdmincliksOnresetAllButtonAfterSelectingMltipleFiltersFromAdvanceFilerDrawer () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchCompany.VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton());
        /*Assert.assertTrue(searchChargers.VerifyPropertyTagHasbeenremovedAfterClickingonResetAllButton());
        Assert.assertTrue(searchLocation.clickOutsideDrawer());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());*/
    }

    @Test(priority = 97)//Done
    @TestParameters(testCaseId = {"TC-57"})
    public void TC_57_CheckWhathappensWhenAdmincliksOnresetAllButtonAfterSelectingMltipleFiltersFromAdvanceFilerDrawer () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchChargers.VerifyTagHasbeenremovedAfterClickingonResetAllButton());
        /*Assert.assertTrue(searchChargers.VerifyPropertyTagHasbeenremovedAfterClickingonResetAllButton());
        Assert.assertTrue(searchLocation.clickOutsideDrawer());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());*/
    }


    @Test(priority = 98)//Done
    @TestParameters(testCaseId = {"TC-58"})
    public void TC_58_VerifyChargerTableHasResetToDefaultAfertclickingonResetAllButton () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchCompany searchCompany=new SearchCompany(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        SearchandFilterProperties searchproperty=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchChargers.clickononLocationsDropdown());
        Assert.assertTrue(searchChargers.writeLocationName());
        Assert.assertTrue(searchChargers.clickonLocationNameFromDropDown());
        Assert.assertTrue(searchLocation.clickOnDrawerTitle());
        Assert.assertTrue(searchChargers.clickononPropertyDropdown());
        Assert.assertTrue(searchChargers.writePropertyName());
        Assert.assertTrue(searchLocation.ClickonPropertyNameFromDropDown());
        Assert.assertTrue(searchCompany.ClickonApplyButton());
        Assert.assertTrue(searchCompany.ClickonAdvanceFilterButton());
        Assert.assertTrue(searchCompany.ClickonResetButton());
        Assert.assertTrue(searchLocation.clickOutsideDrawer());
        Assert.assertTrue(searchLocation.verifyPageHasResettoDefaultData());
    }

    @Test(priority = 99)//Done
    @TestParameters(testCaseId = {"TC-68"})
    public void TC_68_VerifyUserHasRedirectedToTheChargerPageAfterClickingOnChargerCountFromLocatonTable () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle3")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.clickOnChargerCount());
        Assert.assertTrue(searchChargers.verifyAdminHasRedirectedToTheChargersPage());


    }

    @Test(priority = 100)//Done
    @TestParameters(testCaseId = {"TC-69"})
    public void TC_69_VerifyAllTheChargersAreShowingOnTheChargerPageAfterClickingOnChargerCountFromLocatonTable () throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        SearchLocation searchLocation=new SearchLocation(driver);
        EditCompany editCompany=new EditCompany(driver);
        SearchChargers searchChargers=new SearchChargers(driver);
        SearchandFilterProperties searchandfilter=new SearchandFilterProperties(driver);
        CreateProperty properties = new CreateProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
       /* Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(searchLocation.enterLocationName(prop.getProperty("LocationTitle3")));
        Assert.assertTrue(editCompany.ClickonSearchButton());
        Assert.assertTrue(searchChargers.clickOnChargerCount());*/
        Assert.assertTrue(searchChargers.verifyAllChargersAreShowingAfterClickingonChargerCountFromLocationpage());


    }

    //US-136 Edi charger starts

    @Test(priority = 101)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckEditButton() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated = new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.verifyEditButton());
    }
    @Test(priority = 102)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckTheChargerTitleAboveEditDrawer() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated = new EditChargerCosAdminUpdated(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.verifyChargerTitleAboveEditDrawer());
    }

    @Test(priority = 103)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckAllSectionTitleOfEditDrawer() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated = new EditChargerCosAdminUpdated(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,10000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyEditDrawerNecessarySection());
    }

    @Test(priority = 104)//Done
    @TestParameters(testCaseId = {"TC-44"})
    public void TC_44_VerifyEditChargerDrawerHasDisplayedAfterClickingOnEditButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
//        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargerCosAdminUpdated.verifyEditDrawerNecessarySection());
        Assert.assertTrue(editChargerCosAdminUpdated.verifyAnElementDisplayedOrNot(1000,CreateCharger.ChargerPlugType));
//        Assert.assertTrue(editChargerCosAdminUpdated.verifyAnElementDisplayedOrNot(1000,EditChargerCosAdminUpdated.ChargingRateFieldSelected));
    }

    @Test(priority = 105)//Done
    @TestParameters(testCaseId = {"TC-45"})
    public void TC_45_CheckUserCanEditTheInputField() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditCharger editChargers=new EditCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(editChargerCosAdminUpdated.verifyInputFieldEditble());
    }

    @Test(priority = 107)//Done
    @TestParameters(testCaseId = {"TC-46"})
    public void TC_46_CheckCrossButtonVisibleInsideLocationField() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        EditCharger editChargers=new EditCharger(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Space 10",2000));
        Assert.assertTrue(createCharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createCharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyCrossButtonInsideLocationField());
    }

    @Test(priority = 108)//Done
    @TestParameters(testCaseId = {"TC-49"})
    public void TC_49_CheckSearchLocationAndSelectFromDropdown() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated = new EditChargerCosAdminUpdated(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.writeInputText(ChargerListPropertyAdmin.SearchChargerField,"Selenium",8000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(createcharger.ClickButton(ChargerListPropertyAdmin.SelectedLocationName,1500));
        Assert.assertTrue(editChargerCosAdminUpdated.verifySearchLocationAndSelectFromDropdown());

    }
    @Test(priority = 109)//Done
    @TestParameters(testCaseId = {"TC-53"})
    public void TC_53_CheckCopiedMsgAfterClickOnCopyButton () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        CosAdminChargerList cosAdminChargerList = new CosAdminChargerList(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        dashboard.GotoDashboard();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,5000));
        Assert.assertTrue(updateChargerPropertyAdmin.verifyCopyButtonMsg());
    }

    @Test(priority = 110)//Done
    @TestParameters(testCaseId = {"TC-54"})
    public void TC_54_CheckCopiedUrlCanPasteToAnotherTabToSeeTheCharger() throws InterruptedException, IOException, UnsupportedFlavorException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium",1500));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyCopyPasteUrl());
    }
    @Test(priority = 111)//Done
    @TestParameters(testCaseId = {"TC-56"})
    public void TC_56_CheckCreateNewLocationDrawer() throws InterruptedException, IOException, UnsupportedFlavorException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        editCompany.SwitchToTab(0);
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(EditChargerCosAdminUpdated.CreateNewLocation,1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(UpdateChargerPropertyAdmin.DiscardBtn,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyCreateNewLocationDrawerFromEditDrawer());
    }
    @Test(priority = 112)//Done
    @TestParameters(testCaseId = {"TC-57"})
    public void TC_57_CheckClickOnViewLocationNavigateToGoogleMap() throws InterruptedException, IOException, UnsupportedFlavorException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium",1000));
        Assert.assertTrue(createCharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(EditChargerCosAdminUpdated.ViewLocation,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyGoogleMapLink());
    }

    @Test(priority = 113)//Done
    @TestParameters(testCaseId = {"TC-60"})
    public void TC_60_DeactivateChargerPopUpMsgWithButtons() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditCompany editCompany= new EditCompany(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        editChargerCosAdminUpdated.SwitchToTab(0);
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(EditChargerCosAdminUpdated.DeactivateChargerButton,2000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyPopUpMsgWithTwoButtonsOfDeactivateCharger());
    }
    @Test(priority = 114)//Done
    @TestParameters(testCaseId = {"TC-62"})
    public void TC_62_CheckFromTableShowingTheEditedData() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Automated-815 ",1000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyTheEditedInfoInTable());

    }
    @Test(priority = 115)//Done
    @TestParameters(testCaseId = {"TC-63"})
    public void TC_63_CheckEditedDataFromDrawer() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium",1000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyTheEditedInfoInDrawer());

    }
    @Test(priority = 116)//Done
    @TestParameters(testCaseId = {"TC-64"})
    public void TC_64_CheckErrorMsgForInvalidDataForMandatoryField() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium",1000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyErrorMsgForInvalidData());

    }

    @Test(priority = 117)//Done
    @TestParameters(testCaseId = {"TC-65"})
    public void TC_65_CheckWhatHappensWhenAdminSearchForInvalidDataInTheSelectField() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium",1000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyNoDataMsgForSearchingInvalidData());

    }

    @Test(priority = 118)//Done
    @TestParameters(testCaseId = {"TC-68"})
    public void TC_68_WhenAdminClicksCrossButtonOfTheDrawer() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }

    @Test(priority = 119)//Done
    @TestParameters(testCaseId = {"TC-69"})
    public void TC_69_WhenAdminClicksCancelButtonOfTheDrawerWithoutInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 120)//Done
    @TestParameters(testCaseId = {"TC-70"})
    public void TC_70_WhenAdminClicksOutsideTheDrawer() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue((createcharger.clickonoutsidethedrawer()));
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 121)//Done
    @TestParameters(testCaseId = {"TC-71"})
    public void TC_71_WhenAdminClicksCrossButtonOfEditDrawerAfterEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"Selenium",1000));
        Assert.assertTrue(createcharger.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyDiscadContinuePopupHasDisplayed());
    }
    @Test(priority = 122)//Done
    @TestParameters(testCaseId = {"TC-72"})
    public void TC_72_WhenAdminClicksCrossButtonEnteringAnyInputPopUpContainsNecessaryButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        UpdateChargerPropertyAdmin updateChargerPropertyAdmin = new UpdateChargerPropertyAdmin(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My new charger",1000));
        Assert.assertTrue(createcharger.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(updateChargerPropertyAdmin.verifyDiscardAndContinueButton());
    }
    @Test(priority = 123)//Done
    @TestParameters(testCaseId = {"TC-73"})
    public void TC_73_WhenAdminClicksDiscardButtonEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My new charger",1500));
        Assert.assertTrue(createcharger.clickOnCrossButtonOfTheDrawer());
        Assert.assertTrue(createcharger.clickOnDiscardButtonOfPopUp());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }

    @Test(priority = 124)//Done
    @TestParameters(testCaseId = {"TC-74"})
    public void TC_74_WhenAdminClicksCancelButtonOfTheDrawerAfterEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditCompany editCompany= new EditCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My new charger",1000));
        Assert.assertTrue(createcharger.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyDiscadContinuePopupHasDisplayed());
    }
    @Test(priority = 125)//Done
    @TestParameters(testCaseId = {"TC-75"})
    public void TC_75_WhenAdminClicksCancelButtonEnteringAnyInputPopUpContainsNecessaryButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My new charger",1000));
        Assert.assertTrue(createcharger.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(createcharger.verifyPopUpContainsDiscardAndContinueButton());
    }
    @Test(priority = 126)//Done
    @TestParameters(testCaseId = {"TC-76"})
    public void TC_76_AdminClicksDiscardButtonEnteringAnyInputWhenPopUpContainsNecessaryButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My new charger",1000));
        Assert.assertTrue(createcharger.clickOnCancelButtonOfTheDrawer());
        Assert.assertTrue(createcharger.clickOnDiscardButtonOfPopUp());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }
    @Test(priority = 127)//Done
    @TestParameters(testCaseId = {"TC-77"})
    public void TC_77_WhenAdminClicksOutsideOfTheDrawerAfterEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My new charger",1000));
        Assert.assertTrue(createcharger.clickonoutsidethedrawer());
        Assert.assertTrue(createcharger.verifyDiscadContinuePopupHasDisplayed());
    }
    @Test(priority = 128)//Done
    @TestParameters(testCaseId = {"TC-78"})
    public void TC_78_WhenAdminClicksOutsideOfTheDrawerAfterEnteringAnyInputNeccessaryButtonShowing() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My new charger",1000));
        Assert.assertTrue(createcharger.clickonoutsidethedrawer());
        Assert.assertTrue(createcharger.verifyPopUpContainsDiscardAndContinueButton());
    }
    @Test(priority = 129)//Done
    @TestParameters(testCaseId = {"TC-79"})
    public void TC_79_AdminClicksOutsideOfTheDrawerAndDiscardButtonAfterEnteringAnyInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany editCompany= new EditCompany(driver);
        CreateCharger createcharger = new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(editCompany.ClickonEditbutton());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,"My new charger",6000));
        Assert.assertTrue(createcharger.clickonoutsidethedrawer());
        Assert.assertTrue(createcharger.clickOnDiscardButtonOfPopUp());
        Assert.assertTrue(createcharger.verifyAddNewChargerButtonHasDisplayed());
    }

    @Test(priority = 130)//Done
    @TestParameters(testCaseId = {"TC-82"})
    public void TC_82_CheckEditedDataFromDrawerInAuditLog() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCharger createcharger = new CreateCharger(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated= new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Raw charger ",1000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,1000));
        Assert.assertTrue(createcharger.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyChangeNameInAuditLog());
    }

    @Test(priority = 131)//Done
    @TestParameters(testCaseId = {"TC-83"})
    public void TC_83_CheckUserNameOfAuditLogMatchWithAccountName() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated =new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Raw charger ", 1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,1500));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyAccountNameInAuditLog());
    }

    //    @Test(priority = 30)//Done
//    @TestParameters(testCaseId = {"TC-84"})
//    public void TC_84_CheckUpdateTimeOfAuditLog() throws InterruptedException{
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard=new Dashboard(driver);
//        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
//        EditChargerCosAdminUpdated editChargerCosAdminUpdated =new EditChargerCosAdminUpdated(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium", 1000));
//        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,1500));
//        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
//        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(UpdateChargerPropertyAdmin.ToggleButton,1000));
//        Assert.assertTrue(editChargerCosAdminUpdated.verifyUpdatedTime());
//    }
    @Test(priority = 132)//Done
    @TestParameters(testCaseId = {"TC-85"})
    public void TC_85_CheckUpdateDateOfAuditLog() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated =new EditChargerCosAdminUpdated(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Raw charger ", 1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,1500));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(UpdateChargerPropertyAdmin.ToggleButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyUpdatedDate());
    }
    //Max Rate and plug type related start

    @Test(priority = 133)//Done
    @TestParameters(testCaseId = {"TC-90"})
    public void TC_90_CheckChargingRateFieldIsOccupiedWithValidRates() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated =new EditChargerCosAdminUpdated(driver);
        CreateCharger createCharger =new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium", 1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,1500));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyChargingRateFieldIsOccupiedWithValidChargingRates());
    }


    @Test(priority = 134)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void TC_91_CheckUpdatedChargingRateIsShowingCorrectlyAfterScanningCharger() throws InterruptedException, IOException, UnsupportedFlavorException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
        EditChargerCosAdminUpdated editChargerCosAdminUpdated =new EditChargerCosAdminUpdated(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium", 1000));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,1500));
        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
        Assert.assertTrue(editChargerCosAdminUpdated.verifyUpdatedChargingRateAfterScanningCharger());
    }

//    @Test(priority = 35)//Done
//    @TestParameters(testCaseId = {"TC-92"})
//    public void TC_92_CheckUpdatedChargingRateIsShowingCorrectlyInAuditLog() throws InterruptedException, IOException, UnsupportedFlavorException {
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard=new Dashboard(driver);
//        ChargerListPropertyAdmin chargerListPropertyAdmin = new ChargerListPropertyAdmin(driver);
//        EditChargerCosAdminUpdated editChargerCosAdminUpdated =new EditChargerCosAdminUpdated(driver);
//        CreateCharger createCharger =new CreateCharger(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickOnChargers());
//        Assert.assertTrue(editChargerCosAdminUpdated.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"Selenium", 1000));
//        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(ChargerListPropertyAdmin.searchargerbtn,1500));
//        Assert.assertTrue(chargerListPropertyAdmin.ClickButton(CosAdminChargerList.EditButton,1000));
//        Assert.assertTrue(editChargerCosAdminUpdated.verifyUpdatedChargingRateInAuditLog());
//    }


}