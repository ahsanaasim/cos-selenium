package tests.US228NewUpdatedWelcomeUI;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class UpdatedWelcomeUIForGuestTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();

    @Test(priority = 1)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckIfMenuButtonIsShowingAtTopRightCornerOfThePage() throws InterruptedException {
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
}
