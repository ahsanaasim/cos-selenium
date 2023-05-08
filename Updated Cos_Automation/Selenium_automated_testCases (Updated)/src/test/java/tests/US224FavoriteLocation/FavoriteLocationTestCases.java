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
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(2000,FavoriteLocation.NoDataInTableImage));
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(2000,FavoriteLocation.NoFavoriteLocationText));

    }

    @Test(priority = 2)
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
    @Test(priority = 3)
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

    @Test(priority = 4)
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
    @Test(priority = 5)
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

    @Test(priority = 6)
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

    @Test(priority = 8)
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

    @Test(priority = 9)
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

    @Test(priority = 10)
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
        Assert.assertTrue(favoriteLocation.verifyAFieldIsDisable(2000,FavoriteLocation.ReserveButton1));
        Assert.assertTrue(favoriteLocation.verifyAFieldIsDisable(2000,FavoriteLocation.ReserveButton2));

    }

    @Test(priority = 11)
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_CheckSeeDetailsButton () throws InterruptedException {
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
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(2000,FavoriteLocation.SeeDetailsButton1));
        Assert.assertTrue(favoriteLocation.verifyAnElementDisplayedOrNot(500,FavoriteLocation.SeeDetailsButton2));

    }

    @Test(priority = 12)
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
}
