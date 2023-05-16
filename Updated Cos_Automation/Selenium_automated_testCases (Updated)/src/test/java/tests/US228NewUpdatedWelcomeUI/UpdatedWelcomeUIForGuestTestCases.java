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
    public void TC_1_CheckIfMenuButtonIsNotShowingAtTopRightCornerOfThePage() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(favoriteLocation.verifyElementNotDisplayed(6000,CustomerLogin.Menu));

    }

    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CheckIfMenuButtonIsNotShowingAtTopRightCornerOfThePage() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/Ocf68w");
        Assert.assertTrue(favoriteLocation.verifyElementNotDisplayed(6000,CustomerLogin.Menu));

    }

}
