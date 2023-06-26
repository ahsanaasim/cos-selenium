package tests.US224FavoriteLocation;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class FavoriteLocationTestCases extends BaseTest {

    Properties prop = ConfigUtill.getConfig();


    @Test(priority = 1)
    @TestParameters(testCaseId = {"TC-0"})
    public void TC_1_MakeLocationsAllOnline() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        login.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        favoriteLocation.AddRawLocation3ToFavoriteLocation();
        favoriteLocation.AddOrtizAvenue80799629ToFavoriteLocation();
        favoriteLocation.AddGoldnerAvenue3LocationToFavoriteLocation();
        login.LogoutFromCustomerAccount();


    }


    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckWhatHappensWhenCustomerClickOnFavLocationFromMenu () throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        login.GoToCustomerLoginPage();
        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
        operation.ClickButton(CustomerLogin.Menu,2000);
        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        favoriteLocation.GoToFavoriteLocationPage();
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(5000,FavoriteLocation.NoDataInTableImage));
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(500,FavoriteLocation.NoFavoriteLocationText));

    }

    @Test(priority = 3)
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckLogoOfChargeOnSiteExistInFavoriteLocationsPage () throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(2000,FavoriteLocation.ChargeOnSiteLogo));

    }
    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_CheckMenuExistInFavoriteLocationsPage () throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(2000,CustomerLogin.Menu));
//        customerLogin.LogoutFromCustomerAccount();

    }

    @Test(priority = 5)
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckIfFavLocationOptionIsShowingUpOnMenuDrawer() throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        customerLogin.LogoutFromCustomerAccount();
        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        operation.ClickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(2000,CustomerMenu.FavoriteFromMenu));

    }
    @Test(priority = 6)
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckIfFavIconIsShowingUpOnMenuDrawer() throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        operation.ClickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(2000,CustomerMenu.FavoriteIconFromMenu));

    }

    @Test(priority = 7)
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckIfFavoeiteLocationsTitleInFavoriteLocationsList() throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        Dashboard dashboard = new Dashboard(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        dashboard.RefreshBrowser();
        operation.ClickButton(CustomerSupport.Menu,2000);
        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        Assert.assertTrue(favoriteLocation.verifyFavoriteLocationsTitle());

    }

    @Test(priority = 9)
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckLocationNameInFavoriteLocationsList() throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        Dashboard dashboard = new Dashboard(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(1000,FavoriteLocation.LocationName));

    }

    @Test(priority = 11)
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckLocationAddressInFavoriteLocationsList() throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        Dashboard dashboard = new Dashboard(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(1000,FavoriteLocation.LocationAddress));

    }

    @Test(priority = 12)
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckReserveOptionUnderTheLocationAddressShouldBeDisabled () throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        Dashboard dashboard = new Dashboard(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(2000,FavoriteLocation.AddToWatchListButton1));
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(500,FavoriteLocation.AddToWatchListButton2));
        Assert.assertTrue(favoriteLocation.verifyTextMatching(2000,FavoriteLocation.AddToWatchListButton1,"Add to Watchlist"));
        Assert.assertTrue(favoriteLocation.verifyTextMatching(2000,FavoriteLocation.AddToWatchListButton2,"Add to Watchlist"));

    }

    @Test(priority = 13)
    @TestParameters(testCaseId = {"TC-11,18"})
    public void TC_11_18_CheckSeeDetailsButton () throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        Dashboard dashboard = new Dashboard(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(2000,FavoriteLocation.SeeInMapButtonText1));
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(500,FavoriteLocation.SeeInMapButtonText2));

    }

    @Test(priority = 14)
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_CheckFavoriteIconInFavouriteLocationsList () throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        Dashboard dashboard = new Dashboard(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(1000,FavoriteLocation.FavoriteLocationIcon1InList));

    }

    @Test(priority = 15)
    @TestParameters(testCaseId = {"TC-18,19"})
    public void TC_18_19_CheckWhatHappensWhenIClickOnSeeDetailsButton() throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        MapDetails mapDetails = new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
        operation.ClickButton(FavoriteLocation.SeeInMap,2000);
        Assert.assertTrue(mapDetails.verifySystemIsRedirectingToMapPage());
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.UpperDrawer));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.LowerDrawer));

    }

    @Test(priority = 21)
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckLocationIsRemovedFromTheListAfterUnselecting() throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        MapDetails mapDetails = new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        favoriteLocation.GoToFavoriteLocationPage();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(favoriteLocation.verifyLocationIsRemovedFromTheList());

    }

    @Test(priority = 22)
    @TestParameters(testCaseId = {"TC-22.2"})
    public void TC_22_2_CheckLocationIsRemovedFromTheListAfterUnselecting() throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        MapDetails mapDetails = new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        favoriteLocation.GoToFavoriteLocationPage();
//        dashboard.RefreshBrowser();
        operation.ClickButton(FavoriteLocation.FavoriteLocationIcon1InList,2000);
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(1500,FavoriteLocation.PopUpUnmarkedSuccessfully));

    }

    @Test(priority = 23)
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CheckLocationCountIsDecreasingAfterUnSelectingFavoriteIcon() throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        MapDetails mapDetails = new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        favoriteLocation.GoToFavoriteLocationPage();
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue((favoriteLocation.verifyFavoriteLocationCountIsDecreasingAfterUnSelecting()));

    }



    @Test(priority = 28)
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_CheckFavoriteLocationCountAndNumberOfLocationInTheListMatching () throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        MapDetails mapDetails = new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        favoriteLocation.GoToFavoriteLocationPage();
//        operation.ClickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(favoriteLocation.verifyFavoriteLocationsCountInTitleMatchWithList());

    }
}