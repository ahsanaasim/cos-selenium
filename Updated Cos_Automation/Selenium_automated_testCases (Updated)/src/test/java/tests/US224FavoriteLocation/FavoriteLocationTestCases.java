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
    public void TC_0_PreConditionMakeTestingLocationsOnline() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        login.goToCustomerLoginPage();
        customerLogin.loginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        favoriteLocation.AddRawLocation3ToFavoriteLocation();
        favoriteLocation.AddOrtizAvenue80799629ToFavoriteLocation();
        favoriteLocation.AddGoldnerAvenue3LocationToFavoriteLocation();
        favoriteLocation.AddAutomatedLocation9129ToFavoriteLocation();
        favoriteLocation.RemoveBillingLocationFromFavorites();
        favoriteLocation.RemoveZboncakAvenue94377709FromFavorites();
        favoriteLocation.RemoveElectricChargerFromFavorites();
        favoriteLocation.RemoveBotsfordAvenue62659569FromFavorites();
        login.LogoutFromCustomerAccount();


    }



    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-0"})
    public void TC_0_PreConditionLoginToCOSAdmin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreateLocation createLocation=new CreateLocation(driver);
        createLocation.newTabOpenAndSwitchToNewTab(1);
        Thread.sleep(2500);
        loginPage.verifyValidLogin();
        Assert.assertTrue(dashboard.clickOnPropertiesFromLeftMenu());
        Assert.assertTrue(dashboard.clickonLocations());


    }


    @Test(priority = 3)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckWhatHappensWhenCustomerClickOnFavLocationFromMenu () throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        favoriteLocation.switchToTab(0);
        login.goToCustomerLoginPage();
        customerLogin.loginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
        operation.clickButton(CustomerLogin.Menu,2000);
        operation.clickButton(CustomerMenu.FavoriteFromMenu,2000);
        favoriteLocation.GoToFavoriteLocationPage();
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(5000,FavoriteLocation.NoDataInTableImage));
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(500,FavoriteLocation.NoFavoriteLocationText));

    }

    @Test(priority = 4)
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
    @Test(priority = 5)
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

    @Test(priority = 6)
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
        customerLogin.loginToACustomerAccount("mateg96752@saeoil.com","EitaiPassword10");
        operation.clickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(2000,CustomerMenu.FavoriteFromMenu));

    }
    @Test(priority = 7)
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

    @Test(priority = 8)
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
        dashboard.refreshBrowser();
        operation.clickButton(CustomerSupport.Menu,2000);
        operation.clickButton(CustomerMenu.FavoriteFromMenu,2000);
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
        Assert.assertTrue(favoriteLocation.verifyPropertyNameAndItsAddress());

    }

    @Test(priority = 12)
    @TestParameters(testCaseId = {"TC-10"})
    public void TC_10_CheckAddToWatchListUnderTheLocationAddressShouldBeDisabled () throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        Dashboard dashboard = new Dashboard(driver);
        customerLogin.switchToTab(0);
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount(prop.getProperty("CustomerWithNoTicket"),"EitaiPassword10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
//        dashboard.RefreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        favoriteLocation.GoToFavoriteLocationPage();
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(2000,FavoriteLocation.AddToWatchListButton1));
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(500,FavoriteLocation.AddToWatchListButton2));
        Assert.assertTrue(favoriteLocation.verifyTextMatching(2000,FavoriteLocation.AddToWatchListButton1,"Add to Watchlist"));
        Assert.assertTrue(favoriteLocation.verifyTextMatching(2000,FavoriteLocation.AddToWatchListButton2,"Add to Watchlist"));

    }

    @Test(priority = 13)
    @TestParameters(testCaseId = {"TC-11,18"})
    public void TC_11_18_CheckSeeInMapButton () throws InterruptedException {
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
        dashboard.refreshBrowser();
//        operation.ClickButton(CustomerSupport.Menu,2000);
        operation.clickButton(FavoriteLocation.SeeInMap,2000);
        Assert.assertTrue(mapDetails.verifySystemIsRedirectingToMapPage());
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.UpperDrawer));
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(500,MapDetails.LowerDrawer));

    }

    @Test(priority = 16)
    @TestParameters(testCaseId = {"TC-21"})
    public void TC_21_CheckFavIconIsMarkedInLocationDetails() throws InterruptedException {
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
        operation.clickButton(FavoriteLocation.SeeInMap,2000);
        Assert.assertTrue(mapDetails.verifySystemIsRedirectingToMapPage());
        Assert.assertTrue(mapDetails.verifyAnElementDisplayedOrNot(1000,MapDetails.FavoriteIconMarked));

    }

    @Test(priority = 21)
    @TestParameters(testCaseId = {"TC-22,24"})
    public void TC_22_24_CheckLocationIsRemovedFromTheListAfterUnselecting() throws InterruptedException {
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
    public void TC_22_2_CheckSuccessAlertAfterUnselecting() throws InterruptedException {
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
        operation.clickButton(FavoriteLocation.FavoriteLocationIcon1InList,2000);
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


    @Test(priority = 24)
    @TestParameters(testCaseId = {"TC-26"})
    public void TC_26_CheckLocationCountIsIncreasingAfterAddingAsFavorites() throws InterruptedException {
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
        Assert.assertTrue(favoriteLocation.verifyFavoriteLocationCountIsIncreasingAfterAddingFavorites());

    }

    @Test(priority = 25)
    @TestParameters(testCaseId = {"TC-26.2"})
    public void TC_26_2_CheckNewlyAddedLocationIsShowingInTheList() throws InterruptedException {
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
        Assert.assertTrue(favoriteLocation.verifyLocationIsShowingInTheFavoritesListAfterAdding());

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

//    @Test(priority = 1)//Done
//    @TestParameters(testCaseId = {"TC-1"})
//    public void TC_1_VerifyEditLocationButtonIsShowingontheLocationsPage() throws InterruptedException {
//        HomePage homePage = new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        Dashboard dashboard=new Dashboard(driver);
//        CreateCompany company = new CreateCompany(driver);
//        EditLocation editLocation=new EditLocation(driver);
//        FeeStructureList feeStructureList = new FeeStructureList(driver);
//        loginPage.VerifyValidLogin();
//        Assert.assertTrue(dashboard.clickonPropertiesFromLeftMenu());
//        Assert.assertTrue(dashboard.clickonLocations());
//        Assert.assertTrue(editLocation.verifyEditDetailsButtonHasDisplayed());
//        feeStructureList.ContiniousClickOnLoadMoreButton();
//
//    }


    @Test(priority = 45)
    @TestParameters(testCaseId = {"TC-37"})
    public void TC_37_CheckFavoriteLocationCountAfterAddingFromChargerDetails() throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        MapDetails mapDetails = new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("lomina8480@dekaps.com","EitaiPassword@10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        favoriteLocation.GoToFavoriteLocationPage();
//        operation.ClickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(favoriteLocation.verifyFavoriteLocationCountIsIncreasingAfterAddingFavoritesFromChargerDetails());

    }

    @Test(priority = 46)
    @TestParameters(testCaseId = {"TC-38"})
    public void TC_38_CheckNewlyAddedLocationAsFavoritesFromChargerDetails() throws InterruptedException {
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        MapDetails mapDetails = new MapDetails(driver);
        Dashboard dashboard = new Dashboard(driver);
//        customerLogin.LogoutFromCustomerAccount();
//        login.GoToCustomerLoginPage();
//        customerLogin.LoginToACustomerAccount("lomina8480@dekaps.com","EitaiPassword@10");
//        operation.ClickButton(CustomerLogin.Menu,2000);
//        operation.ClickButton(CustomerMenu.FavoriteFromMenu,2000);
        favoriteLocation.GoToFavoriteLocationPage();
//        operation.ClickButton(CustomerSupport.Menu,2000);
        Assert.assertTrue(favoriteLocation.verifyLocationIsShowingInTheFavoritesListAfterAddingFromChargerDetails());

    }



}