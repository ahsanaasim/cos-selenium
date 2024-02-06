package tests.US229UpdatedMapDetails;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

//Chargers of Rampura bridge and Banasree D 10 location should be Available before starting the charging session
public class UpdatedMapDetailsTestCase extends BaseTest {

    Properties prop = ConfigUtill.getConfig();



    @Test(priority = 1)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_MakeAvailableAllTheChargersUnderRampuraBridgeAndD10Location() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        loginPage.verifyValidLogin();
        mapDetails.makeD10LocationAndRampuraBridgeChargerAvailable();
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickOnChargers());
        mapDetails.MakeExpectedChargerOnline("D 11 charger");



    }

    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckChargeOnSiteLogo() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(3000,MapDetails.ChargeONSiteLogo));

    }

    @Test(priority = 3)
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckMenuAndFavoritesButton() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,CustomerLogin.Menu));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.FavoritesButton));

    }

    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckSearchLocationField() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        dashboard.refreshBrowser();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,MapDetails.SearchLocation));

    }

    @Test(priority = 5)
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckPropertyNameAndAddress() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyPropertyNameAndItsAddress());

    }

    @Test(priority = 6)
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_2_CheckLogoAfterMovingToLocation() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.switchToTab(0);
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyElementNotDisplayed(1000,MapDetails.ChargeONSiteLogo));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.UpperDrawer));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.LowerDrawer));

    }

    @Test(priority = 7)
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_8_CheckLocationNameAndAddress() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.LocationName));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.PropertyLocationAddress));

    }

    @Test(priority = 8)
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckPlugAvailableText() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyPlugAvailableText());


    }

    @Test(priority = 9)
    @TestParameters(testCaseId = {"TC-9,10"})
    public void TC_9_10_CheckFavoriteIconAndShareButton() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.FavoriteIcon));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.ShareButton));

    }

    @Test(priority = 10)
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckAvailabilityTitle() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.AvailabilityTitle));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1500,MapDetails.PlugType));


    }

    @Test(priority = 11)
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckScanQrText() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyTextMatching(1000,MapDetails.SCanQRCodeText,mapDetails.ScanTheQRText()));


    }

    @Test(priority = 12)
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckAssistMeAndScanNowButton() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.AskCOSAButton));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.ScanNow));


    }

    @Test(priority = 13)
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckScanQRTextAfterClickOnScanNow() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        operation.clickButton(MapDetails.ScanNow,1000);
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.ScanQrCodeWithCellPhoneText));


    }

    @Test(priority = 14)
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckChargerDetailsDrawerIsOpeningProperly() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        operation.clickButton(MapDetails.PlugType,2000);
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.ChargersDetailsTitle));


    }

    @Test(priority = 15)
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckChargerDetailsDrawerIsClosingProperly() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        operation.clickButton(MapDetails.PlugType,2000);
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.ChargersDetailsTitle));
        operation.clickButton(MapDetails.CloseButton,2000);
        Assert.assertTrue(mapDetails.verifyElementNotDisplayed(2000,MapDetails.ChargersDetailsTitle));



    }

    @Test(priority = 16)
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckChargerDetailsDrawerIsClosingProperlyAfterClickOnOutsideOfDrawer() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.GetDirection));
        operation.clickButton(MapDetails.GetDirection,2000);
        Assert.assertTrue(mapDetails.verifyGetDirectionButtonIsWorking());



    }

    @Test(priority = 17)
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckStatusOfRestrictedLocation() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToShantaHoldingsLocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.GetDirection));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.NoChargersAvailable));
        Assert.assertTrue(mapDetails.verifyTextMatching(1000,MapDetails.RestrictedLocationAlertMsg,mapDetails.RestrictedLocationMessage()));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.AskCOSAButton));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.ChargerRestrictedButton));
        Assert.assertTrue(mapDetails.verifyElementNotDisplayed(500,MapDetails.PlugType));


    }

    @Test(priority = 18)
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckAvailableChargerCountMatchWithDrawer() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
        Assert.assertTrue(mapDetails.verifyAvailableChargerCountMatchWithDetailsDrawer());
//        dashboard.RefreshBrowser();

    }



    @Test(priority = 19)
    @TestParameters(testCaseId = {"TC-20"})
    public void TC_20_CheckAvailableChargerCountIsDecreasingAfterMakingAChargerOffline() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
        Assert.assertTrue(mapDetails.verifyAvailableChargerCountIsDecreasingAfterMakingAChargerOffline());
//        dashboard.RefreshBrowser();

    }

    @Test(priority = 20)
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckAvailableChargerCountIsIncreasingAfterMakingAChargerOnline() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
        Assert.assertTrue(mapDetails.verifyAvailableChargerCountIsIncreasingAfterMakingAChargerOnline());
//        dashboard.RefreshBrowser();

    }

    @Test(priority = 21)
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckChargerStatusIsChangingToOffline() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.switchToTab(0);
        mapDetails.GoToD10LocationInMapDetails();
        Assert.assertTrue(mapDetails.verifyOfflineStatusOfChargerAfterMakingItOffline());
//        dashboard.RefreshBrowser();

    }

    @Test(priority = 22)
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CheckChargerStatusIsChangingToOnline() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.switchToTab(0);
        mapDetails.GoToD10LocationInMapDetails();
        Assert.assertTrue(mapDetails.verifyAvailableStatusOfChargerAfterMakingItOnline());
//        dashboard.RefreshBrowser();

    }

    @Test(priority = 23)
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckDownChargerStatus() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        guestFlow.switchToTab(0);
        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToSundarbanCourierLocation();
        operation.clickButton(MapDetails.PlugType,1500);
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,MapDetails.DownStatus));
//        dashboard.RefreshBrowser();

    }

    @Test(priority = 24)
    @TestParameters(testCaseId = {"TC-25"})
    public void TC_25_CheckInUseChargerStatus() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        guestFlow.switchToTab(0);
        mapDetails.GoToRampuraLocation();
        mapDetails.switchToTab(1);
        guestFlow.GoToSimulator();
        Assert.assertTrue(guestFlow.SelectChargerFromSimulator("Space 5"));
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        Assert.assertTrue(operation.clickButton(SimulationPage.BootChargerButton,3000));
        Assert.assertTrue(operation.clickButton(SimulationPage.ChargerQRCodeCopyLink,2000));
        simulationPage.pasteTheCopiedChargerQRCodeToAnotherPage();
        guestFlow.switchToTab(2);
        Assert.assertTrue(operation.writeInputText(GuestVerificationPage.PhoneNumberField,"4242424242",5000));
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.ContinueAsGuestButton,2000));
        Assert.assertTrue(guestFlow.SendOtp(2000,"666666"));
        operation.clickButton(OTPVerificationPage.VerifyButton,2000);
        guestFlow.switchToTab(1);
        Assert.assertTrue(operation.clickButton(GuestFlow.PluginChargerbtn,500));
        simulationPage.SelectChargerStatusFromSimulator("Charging");
        operation.click(SimulationPage.ChargerStatusSaveButton);
        guestFlow.switchToTab(2);
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.StatChargingButton,5000));
        guestFlow.SwitchToIframe();
        operation.click(GuestFlow.CardNumber);
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.clickButton(GuestFlow.AuthorizeButton,1500));
        System.out.println("URL  =  "+driver.getCurrentUrl());
        Assert.assertTrue(guestFlow.verifyChargingNowTitle());
        Thread.sleep(2000);
        driver.close();
        guestFlow.switchToTab(0);
        dashboard.refreshBrowser();
        operation.clickButton(MapDetails.PlugType,2500);
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,MapDetails.InUseStatus));
//        dashboard.RefreshBrowser();

    }


    @Test(priority = 25)
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_CheckAfterMakingAnLocationOffline() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany company = new EditCompany(driver);
        CreateLocation location = new CreateLocation(driver);
        UpdateChargerPropertyAdmin charger = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage login = new LoginPage(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
//        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        guestFlow.switchToTab(1);
        Thread.sleep(2000);
//        login.VerifyValidLogin();
        company.GoToCompanyPage();
        company.writeInCompanySearchBar("Local company");
        company.click(EditCompany.searchbtn);
        company.click(EditCompany.AccessCompanyPortal);
        Thread.sleep(5000);
        guestFlow.switchToTab(2);
        operation.clickButton(Dashboard.properties,3000);
        operation.clickButton(Dashboard.locations,3000);
        location.writeINLocationSearchBarCompanyPortal("Water pump");
        location.click(EditCompany.searchbtn);
        location.click(ChargerListPropertyAdmin.detailsbutton);
        charger.clickToggleButtonIfItIsOn();
        operation.clickButton(CreateLocation.savelocationbtn,2000);
        guestFlow.switchToTab(0);
        dashboard.refreshBrowser();
        mapDetails.GoToSundarbanCourierLocation();
        Assert.assertTrue(mapDetails.verifyElementNotDisplayed(2000,MapDetails.PlugType));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,MapDetails.NoChargersAvailable));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,MapDetails.NoChargerAvailableButton));


    }

    @Test(priority = 26)
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_CheckAfterMakingAnLocationOnlineToOffline() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany company = new EditCompany(driver);
        CreateLocation location = new CreateLocation(driver);
        UpdateChargerPropertyAdmin charger = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage login = new LoginPage(driver);
        guestFlow.switchToTab(0);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
//        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        guestFlow.switchToTab(2);
        Thread.sleep(2000);
//        login.VerifyValidLogin();
//        company.GoToCompanyPage();
//        company.writeInCompanySearchBar("Local company");
//        company.click(EditCompany.searchbtn);
//        company.click(EditCompany.AccessCompanyPortal);
//        Thread.sleep(5000);
//        location.GoToLocationPageInCompanyPortal();
//        operation.FieldClear(CreateLocation.searchbar);
//        location.writeINLocationSearchBarCompanyPortal("Water pump");
//        operation.ClickButton(EditCompany.searchbtn,1500);
        dashboard.refreshBrowser();
        operation.clickButton(ChargerListPropertyAdmin.detailsbutton,2500);
        charger.clickToggleButtonIfItIsOff();
        operation.clickButton(CreateLocation.savelocationbtn,2000);
        guestFlow.switchToTab(0);
        dashboard.refreshBrowser();
        mapDetails.GoToSundarbanCourierLocation();
        Assert.assertTrue(mapDetails.verifyPlugAvailableTextForSinglePlugAvailable());
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,MapDetails.ScanNow));


    }


    @Test(priority = 27)
    @TestParameters(testCaseId = {"TC-28"})
    public void TC_28_CheckAfterMakingAnLocationOffline() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany company = new EditCompany(driver);
        CreateLocation location = new CreateLocation(driver);
        UpdateChargerPropertyAdmin charger = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage login = new LoginPage(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
//        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        guestFlow.switchToTab(1);
        Thread.sleep(2000);
//        login.VerifyValidLogin();
        dashboard.refreshBrowser();
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        location.writeINLocationSearchBar("Water pump");
        location.click(EditCompany.searchbtn);
        location.ClickonEditbutton();
        charger.clickToggleButtonIfItIsOn();
        operation.clickButton(CreateLocation.savelocationbtn,2000);
        guestFlow.switchToTab(0);
        dashboard.refreshBrowser();
        mapDetails.GoToSundarbanCourierLocation();
        Assert.assertTrue(mapDetails.verifyElementNotDisplayed(2000,MapDetails.PlugType));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,MapDetails.NoChargersAvailable));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,MapDetails.NoChargerAvailableButton));
        Assert.assertTrue(mapDetails.verifyElementNotDisplayed(2000,MapDetails.ScanNow));


    }

    @Test(priority = 28)
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_CheckAfterMakingAnLocationOnlineToOffline() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        EditCompany company = new EditCompany(driver);
        CreateLocation location = new CreateLocation(driver);
        UpdateChargerPropertyAdmin charger = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        SimulationPage simulationPage = new SimulationPage(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        LoginPage login = new LoginPage(driver);
        guestFlow.switchToTab(0);
        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
//        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        guestFlow.switchToTab(1);
        Thread.sleep(2000);
//        login.VerifyValidLogin();
//        company.GoToCompanyPage();
//        company.writeInCompanySearchBar("Local company");
//        company.click(EditCompany.searchbtn);
//        company.click(EditCompany.AccessCompanyPortal);
//        Thread.sleep(5000);
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());
        location.writeINLocationSearchBar("Water pump");
        location.click(EditCompany.searchbtn);
        location.ClickonEditbutton();
        charger.clickToggleButtonIfItIsOff();
        operation.clickButton(CreateLocation.savelocationbtn,2000);
        guestFlow.switchToTab(0);
        dashboard.refreshBrowser();
        mapDetails.GoToSundarbanCourierLocation();
        Assert.assertTrue(mapDetails.verifyPlugAvailableTextForSinglePlugAvailable());
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,MapDetails.ScanNow));


    }









}