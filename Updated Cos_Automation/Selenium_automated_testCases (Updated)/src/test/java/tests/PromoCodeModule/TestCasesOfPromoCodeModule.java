package tests.PromoCodeModule;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class TestCasesOfPromoCodeModule extends BaseTest {


    Properties prop = ConfigUtill.getConfig();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void tc_01_create() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.click(PromoCodeList.createNewPromoCode);
        createPromoCode.click(CreatePromoCode.banasreePoliceParkProperty);


    }

}
