package tests.US229UpdatedMapDetails;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerLogin;
import pages.FavoriteLocation;
import pages.GuestVerificationPage;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

public class UpdatedMapDetailsTestCase extends BaseTest {

    @Test(priority = 1)
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckIfMenuButtonIsNotShowingAtTopRightCornerOfThePage() throws InterruptedException {
        GuestVerificationPage guestVerificationPage = new GuestVerificationPage(driver);
        FavoriteLocation favoriteLocation = new FavoriteLocation(driver);
        guestVerificationPage.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/tIljMh");
        Assert.assertTrue(favoriteLocation.verifyElementNotDisplayed(6000, CustomerLogin.Menu));

    }
}
