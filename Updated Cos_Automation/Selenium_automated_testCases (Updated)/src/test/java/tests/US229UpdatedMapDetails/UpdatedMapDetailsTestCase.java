package tests.US229UpdatedMapDetails;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Map;
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
        customerLogin.GoToCustomerLoginPage();
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
        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.LocationName));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.PropertyLocationAddress));

    }

    @Test(priority = 8)
    @TestParameters(testCaseId = {"TC-9,10"})
    public void TC_9_10_CheckFavoriteIconAndShareButton() throws InterruptedException {
        MapDetails mapDetails =new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
        FavoriteLocation favoriteLocation= new FavoriteLocation(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        customerLogin.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerNotPhoneNumberSaved"),"EitaiPassword@10");
        mapDetails.GoToD10LocationInMapDetails();
//        dashboard.RefreshBrowser();
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.FavoriteIcon));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,mapDetails.ShareButton));

    }


}
