package tests.FullCustomerFlow;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.text.DecimalFormat;

public class CustomerFlow extends BaseTest {



    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CustomerFlowAfterScanningCharger() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/dHvDx1"));
        driver.manage().deleteAllCookies();
        operation.clickButton(GuestFlow.LoginBtn,5000);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"tahiatesting07@gmail.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"T7777777",500));
        Assert.assertTrue(operation.clickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(operation.writeInputText(pages.GuestFlow.PhoneNoField,"1111111111111",5000));
        Assert.assertTrue(operation.clickButton(pages.GuestFlow.ContinueGuestBtn,2000));
        Assert.assertTrue(guestFlow.SendOtp(4000,"666666"));
        Assert.assertTrue(operation.clickButton(GuestFlow.VerifyButton,300));
        Assert.assertTrue(operation.clickButton(GuestVerificationPage.StatChargingButton,10000));
        guestFlow.SwitchToIframe();
        Assert.assertTrue(operation.writeInputText(GuestFlow.CardNumber,"424242424242424242424242424",6000));
        guestFlow.SwitchToDefaultFromIframe();
        Assert.assertTrue(operation.clickButton(GuestFlow.AuthorizeButton,1500));
        guestFlow.newTabOpenAndSwitchToNewTab(1);
        loginPage.verifyValidLogin();
        guestFlow.goToSimulator();
        Assert.assertTrue(guestFlow.selectChargerFromSimulator("Selenium 92"));
        Assert.assertTrue(operation.clickButton(GuestFlow.PluginChargerbtn,500));
        Thread.sleep(40000);
        guestFlow.switchToTab(0);
        Thread.sleep(10000);
        System.out.println("URL  =  "+driver.getCurrentUrl());
        Assert.assertTrue(guestFlow.verifyChargingNowTitle());
        guestFlow.switchToTab(1);
        operation.clickButton(GuestFlow.DisconnectChargerbtn,3000);
        Thread.sleep(5000);
        guestFlow.switchToTab(0);
        Thread.sleep(70000);
        Assert.assertTrue(guestFlow.verifyTotalFee());
        Assert.assertTrue(guestFlow.verifyChargingSessionEnded());


    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_CustomerFlowAfterLoginWithCosAdminCredentialWhenPhoneNumberIsSaved() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreateCharger operation = new CreateCharger(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/--GF8Y"));
        driver.manage().deleteAllCookies();
        operation.clickButton(GuestFlow.LoginBtn,5000);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"jo@email.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"2&57DyhUTH1c",500));
        Assert.assertTrue(operation.clickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(operation.clickButton(GuestFlow.StartChargingButton,5000));
        Assert.assertTrue(operation.clickButton(GuestFlow.AuthorizeButton,2500));
        Thread.sleep(1500);
        guestFlow.newTabOpenAndSwitchToNewTab(1);
        loginPage.verifyValidLogin();
        guestFlow.goToSimulator();
        Assert.assertTrue(guestFlow.selectChargerFromSimulator("Available charger"));
        Assert.assertTrue(operation.clickButton(GuestFlow.PluginChargerbtn,1000));
        Thread.sleep(40000);
        guestFlow.switchToTab(0);
        Thread.sleep(10000);
        System.out.println("URL  =  "+driver.getCurrentUrl());
        Assert.assertTrue(guestFlow.verifyChargingNowTitle());
        guestFlow.switchToTab(1);
        operation.clickButton(GuestFlow.DisconnectChargerbtn,3000);
        Thread.sleep(5000);
        guestFlow.switchToTab(0);
        Thread.sleep(10000);
        Assert.assertTrue(guestFlow.verifyTotalFee());
        Assert.assertTrue(guestFlow.verifyChargingSessionEnded());


    }

    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-135"})
    public void TC_135_CheckWhatHahjbhkjhkj() throws InterruptedException {
        driver.get("https://www.google.com/");
        String s = "0.19 kWh";
        String EC = s.replaceAll("[^.0-9]", "");
        System.out.println(EC);
        float EnergyConsumed = Float.parseFloat(EC);
        String m = "Session fee $11.22";
        String SF = m.replaceAll("[^.0-9]", "");
        float SessionFee = Float.parseFloat(SF);
        System.out.println(SessionFee);
        String n = "Utilization fee $11.22/ kWh";
        String UF = n.replaceAll("[^.0-9]", "");
        float UtilizationFee = Float.parseFloat(UF);
        float TotalFee = (UtilizationFee * EnergyConsumed) + SessionFee;
        System.out.println(TotalFee);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Float twoDigitsF = Float.valueOf(decimalFormat.format(TotalFee));
        System.out.println(twoDigitsF);
    }
}