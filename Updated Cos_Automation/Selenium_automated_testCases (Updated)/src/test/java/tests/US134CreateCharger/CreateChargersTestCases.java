package tests.US134CreateCharger;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;
import java.util.Random;

public class CreateChargersTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();

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

}