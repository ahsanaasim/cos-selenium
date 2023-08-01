package tests.AllCreateOperations;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;
import java.util.Random;

public class Create extends BaseTest {


    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();


    //TC_34 from create company script
    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-01"})
    public void TC_01_CreateNewCompany() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        EditCompany editCompany = new EditCompany(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonCompanyManagement());
        Assert.assertTrue(company.ClickonCreateCompanybutton());
        String companyName = company.WriteAutomatedCompanyName();
        Assert.assertTrue(company.WriteCompanyName(companyName));
        Assert.assertTrue(company.WriteCompanyPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteRandomCompanyEmail());
        Assert.assertTrue(company.EnterCompanyWebsite(prop.getProperty("CompanyWebsite")));
        Assert.assertTrue(company.WriteRandomEINNumber());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
        Assert.assertTrue(company.ClickonSaveButton());
        Assert.assertTrue(company.verifyAnElementDisplayedOrNot(2500,DashboardPropertyDetails.TopAccountName));
        Assert.assertTrue(createCharger.writeInputText(EditCompany.searchbar,companyName,3000));
        Assert.assertTrue(createCharger.ClickButton(EditCompany.searchbtn,2000));
        Assert.assertTrue(editCompany.VerifySearchResultCount());
    }


    //TC_43 from create entity script
    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-02"})
    public void TC_02_CreateNewEntity() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateEntity createentity = new CreateEntity(driver);
        CreateCompany company=new CreateCompany(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
        Assert.assertTrue(dashboard.ClickonEntityManagement());
        Assert.assertTrue(createentity.ClickonCreateEntitybutton());
//        Assert.assertTrue(createentity.ClickonSelectCompanydropdownFromEntityDrawer());
        Assert.assertTrue(createentity.SelectCompanyNameFromDropdown());
        Assert.assertTrue(createentity.WriteAutomatedEntityName());
        Assert.assertTrue(createentity.WriteEntityPhoneNumber(prop.getProperty("Phone")));
        Assert.assertTrue(company.WriteCompanyEmail(prop.getProperty("CompanyEmail")));
        Assert.assertTrue(company.WriteRandomEINNumber());
        Assert.assertTrue(createentity.EnterNotesinEntityInformation());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(createentity.EnterAddress(prop.getProperty("CompnayAddress")));
        Assert.assertTrue(createentity.ClickonSaveButton());
        Assert.assertTrue(company.verifyAnElementDisplayedOrNot(2500,DashboardPropertyDetails.TopAccountName));
    }

    //TC_86 from create property script
    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-03"})
    public void TC_03_CreateNewProperty() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateCompany company = new CreateCompany(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateCharger createCharger = new CreateCharger(driver);
        EditProperty editProperty = new EditProperty(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonProperty());
        Assert.assertTrue(properties.clickonCreateNewPropertyButton());
        Assert.assertTrue(properties.clickonCompanyDropdown());
        Assert.assertTrue(properties.selectAutomatedCompanyFromSelectCompanyDropdown());
        Assert.assertTrue(properties.clickSelectEntityDropdown());
        Assert.assertTrue(properties.SelectEntityNameFromSelectEntityDropdown());
        Assert.assertTrue(properties.writeTemporaryPropertyNameInPropertyNameField());
        Assert.assertTrue(company.EnterZipCode(prop.getProperty("ZipCode")));
        Assert.assertTrue(company.WriteRandomCompanyAddress());
//        Assert.assertTrue(properties.clickHardwareProviderDropdown());
//        Assert.assertTrue(properties.selectHardwareProviderNameFromHardwareProviderDropdown());
       /* Assert.assertTrue(properties.clickOtherProviderDropdown());
        Assert.assertTrue(properties.selectOtherProviderNameFromDropdown());*/
        Assert.assertTrue(properties.enterEquimentFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickEquipmentFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromDropdown());
        Assert.assertTrue(properties.enterPerChargerFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickChargerFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMonthlyFeefromChargerFeeDropdown());
        Assert.assertTrue(properties.enterInstallationFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.clickInstallationFeeFrequencyDropdown());
        Assert.assertTrue(properties.selectMontlyFrequencyfromInstallationFeeDropdown());
        Assert.assertTrue(properties.enterSessionFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.enterSessionMinimumFees(prop.getProperty("Fees")));
        Assert.assertTrue(properties.SelectToday());
        Assert.assertTrue(properties.clickonCreatePropertyButton());
        Assert.assertTrue(properties.verifyNewPropertyHasCreated(msg.NewlyCreatedPropertymsg()));
        Assert.assertTrue(company.verifyAnElementDisplayedOrNot(2500,DashboardPropertyDetails.TopAccountName));
        Assert.assertTrue(createCharger.writeInputText(CreateProperty.searchbar,prop.getProperty("PropertyName5"),3000));
        Assert.assertTrue(createCharger.ClickButton(EditCompany.searchbtn,2000));
        Assert.assertTrue(editProperty.VerifySearchResultCount());
    }



    //TC_42 from create Location script
    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_04_CreateNewLocation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateProperty properties = new CreateProperty(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        loginPage.VerifyValidLogin();
        Assert.assertTrue(dashboard.RefreshBrowser());
        Assert.assertTrue(dashboard.GotoDashboard());
        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        Assert.assertTrue(createLocation.clickonCreateNewLocationbutton());
        Assert.assertTrue(properties.selectAutomatedCompanyFromSelectCompanyDropdown());
        Assert.assertTrue(createLocation.selectTemporaryPropertyNameFromSelectProperty());
        Assert.assertTrue(createLocation.enterLocationTitle());
        Assert.assertTrue(createLocation.enterLocationLandmark(prop.getProperty("LocationLandmark")));
        Assert.assertTrue(createLocation.RemoveLongitude());
        Assert.assertTrue(createLocation.enterLocationLongitude());
        Assert.assertTrue(createLocation.RemoveLatitude());
        Assert.assertTrue(createLocation.enterLocationLatitude());
        Assert.assertTrue(createLocation.verifyConfirmLocationButtonisShowingandEnabled());
        Assert.assertTrue(createLocation.clickConfirmLocationButton());
        Assert.assertTrue(createLocation.clickSaveLocationButton());
        Assert.assertTrue(createLocation.verifyAnElementDisplayedOrNot(2500,DashboardPropertyDetails.TopAccountName));
        Assert.assertTrue(createLocation.verifyNewLocationHasCreated(msg.NewlyCreatedLocationmsg()));

    }


    //TC_12 from Create charger
    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-05"})
    public void TC_05_CreateNewCharger() throws InterruptedException {
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
        String temp="BRT - "+randomNumber;
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.Chargername,temp,2000));
        createcharger.selectChargingRate("9.90");
        createcharger.selectProperty("Temporary Property");
        createcharger.selectLocation("Temporary Location");
        Assert.assertTrue(createcharger.clickonSaveChargerButton());
        Assert.assertTrue(createcharger.VerifyConfirmationPopUpHasDisplayed());
        Assert.assertTrue(createcharger.writeInputText(CreateCharger.searchchargerfield,temp,3000));
        Assert.assertTrue(createcharger.ClickButton(CreateCharger.searchargerbtn,2000));
        Assert.assertTrue(createcharger.VerifySearchResultCount());
    }

//    @Test(priority = 1)//Done
//    @TestParameters(testCaseId = {"TC-34"})
//    public void TC_100_WhenAdminProvideValidDataonCreateNewCompanyDrawer() throws InterruptedException {
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard = new Dashboard(driver);
//        CreateCompany company = new CreateCompany(driver);
//        EditCompany editCompany = new EditCompany(driver);
//        CreateCharger createCharger = new CreateCharger(driver);
//        FeeStructureList feeStructureList = new FeeStructureList(driver);
//        loginPage.VerifyValidLogin();
////        Assert.assertTrue(dashboard.RefreshBrowser());
//        Assert.assertTrue(dashboard.ClickonCompanyfromLeftMenuBar());
//        Assert.assertTrue(dashboard.ClickonCompanyManagement());
//        feeStructureList.ContiniousClickOnLoadMoreButton();
//    }







}