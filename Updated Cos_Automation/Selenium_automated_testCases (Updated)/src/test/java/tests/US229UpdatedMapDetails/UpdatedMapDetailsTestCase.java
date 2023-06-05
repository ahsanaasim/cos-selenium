package tests.US229UpdatedMapDetails;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class UpdatedMapDetailsTestCase extends BaseTest {

    Properties prop = ConfigUtill.getConfig();

    @Test(priority = 1)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckChargeOnSiteLogo() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        customerLogin.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(3000,MapDetails.ChargeONSiteLogo));

    }

    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckMenuAndFavoritesButton() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,CustomerLogin.Menu));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.FavoritesButton));

    }

    @Test(priority = 3)
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckSearchLocationField() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(2000,MapDetails.SearchLocation));

    }

    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckMarkerForLocation() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        Dashboard dashboard = new Dashboard(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.LocationMarker));

    }

    @Test(priority = 5)
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_2_CheckLogoAfterMovingToLocation() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyElementNotDisplayed(1000,MapDetails.ChargeONSiteLogo));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.UpperDrawer));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.LowerDrawer));

    }

    @Test(priority = 6)
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

    @Test(priority = 7)
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

    @Test(priority = 8)
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

    @Test(priority = 9)
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
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.DetailsButton));


    }

    @Test(priority = 10)
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

    @Test(priority = 11)
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
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.AssistMeButton));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.ScanNow));


    }

    @Test(priority = 12)
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
        operation.ClickButton(MapDetails.ScanNow,1000);
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.ScanQrCodeWithCellPhoneText));


    }

    @Test(priority = 13)
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
        operation.ClickButton(MapDetails.DetailsButton,2000);
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.ChargersDetailsTitle));



    }

    @Test(priority = 14)
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
        operation.ClickButton(MapDetails.DetailsButton,2000);
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.ChargersDetailsTitle));
        operation.ClickButton(MapDetails.CloseButton,2000);
        Assert.assertTrue(mapDetails.verifyElementNotDisplayed(2000,MapDetails.ChargersDetailsTitle));



    }

    @Test(priority = 15)
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
        operation.ClickButton(MapDetails.GetDirection,2000);
        Assert.assertTrue(mapDetails.verifyGetDirectionButtonIsWorking());



    }

    @Test(priority = 16)
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckStatusOfRestrictedLocation() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToShantaHoldingsLocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.GetDirection));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.NoChargersAvailable));
        Assert.assertTrue(mapDetails.verifyTextMatching(1000,MapDetails.RestrictedLocationAlertMsg,mapDetails.RestrictedLocationMessage()));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.AssistMeButton));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.ChargerRestrictedButton));
        Assert.assertTrue(mapDetails.verifyElementNotDisplayed(500,MapDetails.DetailsButton));



    }

    @Test(priority = 17)
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
        mapDetails.verifyAvailableChargerCountMatchWithDetailsDrawer();
//        dashboard.RefreshBrowser();

    }



    @Test(priority = 18)
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
        mapDetails.verifyAvailableChargerCountIsDecreasingAfterMakingAChargerOffline();
//        dashboard.RefreshBrowser();

    }

    @Test(priority = 19)
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
        mapDetails.verifyAvailableChargerCountIsIncreasingAfterMakingAChargerOnline();
//        dashboard.RefreshBrowser();

    }

    @Test(priority = 20)
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckChargerStatusIsChangingToOffline() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
        mapDetails.verifyOfflineStatusOfChargerAfterMakingItOffline();
//        dashboard.RefreshBrowser();

    }

    @Test(priority = 21)
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CheckChargerStatusIsChangingToOffline() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
        mapDetails.verifyAvailableStatusOfChargerAfterMakingItOnline();
//        dashboard.RefreshBrowser();

    }






}