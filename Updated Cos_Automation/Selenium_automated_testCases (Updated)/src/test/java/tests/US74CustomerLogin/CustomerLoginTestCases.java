package tests.US74CustomerLogin;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class CustomerLoginTestCases extends BaseTest {

    @Test(priority = 1)
    @TestParameters(testCaseId = {"TC-12"})
    public void TC_12_TestWhatHappensWhenCOSAdminTriesToLoginWithTheirCOSAccountCredential() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        login.GoToCustomerLoginPage();
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"jo@email.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"2&57DyhUTH1c",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(login.verifyRedirectingToMap());
        login.LogoutFromCustomerAccount();

    }

    @Test(priority = 2)
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_TestWhatHappensWhenPropertyAdminTriesToLoginWithTheirCompanyPanelAccountCredential() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
//        login.GoToCustomerLoginPage();
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"tahia@yahoo.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"T7777777",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(login.verifyRedirectingToMap());
        login.LogoutFromCustomerAccount();

    }

    @Test(priority = 3)
    @TestParameters(testCaseId = {"TC-13.2"})
    public void TC_13_2_TestWhatHappensWhenPropertyAdminTriesToLoginWithTheirCompanyPanelAccountCredential() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
//        login.GoToCustomerLoginPage();
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"komame4721@minterp.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"T7777777",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(login.verifyRedirectingToMap());
        login.LogoutFromCustomerAccount();

    }

    @Test(priority = 4)
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_TestIfSystemTakingValidEmailAndPasswordThatIsAlreadyRegisteredWithPassword() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
//        login.GoToCustomerLoginPage();
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"tahiatesting07@gmail.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"T7777777",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(login.verifyRedirectingToMap());
        login.LogoutFromCustomerAccount();

    }



    @Test(priority = 5)//Selenium 96
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_TestIfEmailFieldTakingInvalidInputInLoginPage() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
//        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/XnthEz"));
//        operation.ClickButton(GuestFlow.LoginBtn,5000);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"Test@test.",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"2&57DyhUTH1c",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());

    }
    @Test(priority = 6)//Selenium 96
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_2_TestIfEmailFieldTakingInvalidInputInLoginPage() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        customerSignUp.FieldClear(CustomerLogin.EmailField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"test@test",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());

    }

    @Test(priority = 7)//Selenium 96
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_3_TestIfEmailFieldTakingInvalidInputInLoginPage() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        customerSignUp.FieldClear(CustomerLogin.EmailField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"Test@test.",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());

    }

    @Test(priority = 8)//Selenium 96
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_4_TestIfEmailFieldTakingInvalidInputInLoginPage() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        customerSignUp.FieldClear(CustomerLogin.EmailField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"test@test.c",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());
    }

    @Test(priority = 9)//Selenium 96
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_5_TestIfEmailFieldTakingInvalidInputInLoginPage() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        customerSignUp.FieldClear(CustomerLogin.EmailField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"test",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());
    }

    @Test(priority = 10)//Selenium 96
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_6_TestIfEmailFieldTakingInvalidInputInLoginPage() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        customerSignUp.FieldClear(CustomerLogin.EmailField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"test@",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());
    }
    @Test(priority = 11)//Selenium 96
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_TestIfCustomerCanLoginWithoutEmailAddress() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        customerSignUp.FieldClear(CustomerLogin.EmailField);
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(login.VerifyNoEmailErrorMsg());
    }

    @Test(priority = 12)//Selenium 96
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_2_TestIfSystemTakingOnlySpaceInEmailField() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerLogin login = new CustomerLogin(driver);
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        customerSignUp.FieldClear(CustomerLogin.EmailField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField," ",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(login.VerifyNoEmailErrorMsg());
    }

    @Test(priority = 13)//Selenium 96
    @TestParameters(testCaseId = {"TC-3"})
    public void TC_3_TestIfPassFieldTakingWrongInputInPassField() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        customerSignUp.FieldClear(CustomerLogin.EmailField);
        customerSignUp.FieldClear(CustomerLogin.PasswordField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"jo@email.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"TTTTTTTT",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,1000));
        Assert.assertTrue(customerLogin.VerifyWrongPasswordAlert());

    }
    @Test(priority = 14)//Selenium 96
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_3_2_TestIfPassFieldTakingWrongInputInPassField() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin customerLogin = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        customerSignUp.FieldClear(CustomerLogin.PasswordField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"11111111",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(customerLogin.VerifyWrongPasswordAlert());

    }
    @Test(priority = 15)//Selenium 96
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_TestIfSystemTakingOnlySpaceInPassField() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger operation =new CreateCharger(driver);
        CustomerLogin login = new CustomerLogin(driver);
        customerSignUp.FieldClear(CustomerLogin.PasswordField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField," ",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(login.VerifyNoPasswordErrorMsg());

    }

    @Test(priority = 16)//Selenium 96
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_TestIfCustomerCanLoginWithoutPassword() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        customerSignUp.FieldClear(CustomerLogin.PasswordField);
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue((login.VerifyNoPasswordErrorMsg()));

    }

    @Test(priority = 17)//Selenium 96
    @TestParameters(testCaseId = {"TC-11"})
    public void TC_11_TestIfSystemTakingUnregisteredValidEmailAndPassword () throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
//        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/XnthEz"));
//        operation.ClickButton(GuestFlow.LoginBtn,5000);
        customerSignUp.FieldClear(CustomerLogin.EmailField);
//        customerSignUp.FieldClear(CustomerLogin.PasswordField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"tahiaislampeuli@gmail.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"ABC55555",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue((basePage.verifyAnElementDisplayedOrNot(1000,CustomerLogin.UnregisteredAlert)));

    }

    @Test(priority = 18)//Selenium 96
    @TestParameters(testCaseId = {"TC-11.2"})
    public void TC_11_2_TestIfSystemTakingUnregisteredValidEmailAndPassword () throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
//        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/XnthEz"));
//        operation.ClickButton(GuestFlow.LoginBtn,5000);
        customerSignUp.FieldClear(CustomerLogin.EmailField);
        customerSignUp.FieldClear(CustomerLogin.PasswordField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"fahimsdkj@gmail.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"ABC55555",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue((basePage.verifyAnElementDisplayedOrNot(1000,CustomerLogin.UnregisteredAlert)));

    }

    @Test(priority = 19)//Selenium 96
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_TestIfSystemTakingUnregisteredValidEmailAndPassword () throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/XnthEz"));
        operation.ClickButton(GuestFlow.LoginBtn,5000);
//        customerSignUp.FieldClear(CustomerLogin.EmailField);
//        customerSignUp.FieldClear(CustomerLogin.PasswordField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"tahiaislampeuli@gmail.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"ABC55555",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue((basePage.verifyAnElementDisplayedOrNot(1000,CustomerLogin.UnregisteredAlert)));

    }

    @Test(priority = 20)//Selenium 96
    @TestParameters(testCaseId = {"TC-14.2"})
    public void TC_14_2_TestIfSystemTakingUnregisteredValidEmailAndPassword () throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
//        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/XnthEz"));
//        operation.ClickButton(GuestFlow.LoginBtn,5000);
        customerSignUp.FieldClear(CustomerLogin.EmailField);
        customerSignUp.FieldClear(CustomerLogin.PasswordField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"fahimsdkj@gmail.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"ABC55555",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue((basePage.verifyAnElementDisplayedOrNot(1000,CustomerLogin.UnregisteredAlert)));

    }

    @Test(priority = 21)//Selenium 96
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_TestWhatHappensWhenCustomerTriesToLoginWithRegisteredEmailAfterScanningACharger() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
//        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/XnthEz"));
//        operation.ClickButton(GuestFlow.LoginBtn,5000);
        customerSignUp.FieldClear(CustomerLogin.EmailField);
        customerSignUp.FieldClear(CustomerLogin.PasswordField);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"tahiatesting07@gmail.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"T7777777",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue((basePage.verifyAnElementDisplayedOrNot(1000,GuestFlow.PhoneNoField)));
        login.LogoutFromCustomerAccount();

    }


    @Test(priority = 22)
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_TestWhatHappensWhenCOSAdminTriesToLoginWithTheirCOSAccountCredential() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/XnthEz"));
        operation.ClickButton(GuestFlow.LoginBtn,3000);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"jo@email.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"2&57DyhUTH1c",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,GuestFlow.StartChargingButton));
        login.LogoutFromCustomerAccount();

    }

    @Test(priority = 23)
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_TestWhatHappensWhenPropertyAdminTriesToLoginWithTheirCompanyPanelAccountCredential() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
//        login.GoToCustomerLoginPage();
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/XnthEz"));
        operation.ClickButton(GuestFlow.LoginBtn,3000);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"tahia@yahoo.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"T7777777",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,GuestFlow.StartChargingButton));
        login.LogoutFromCustomerAccount();

    }

    @Test(priority = 24)
    @TestParameters(testCaseId = {"TC-17.2"})
    public void TC_17_2_TestWhatHappensWhenPropertyAdminTriesToLoginWithTheirCompanyPanelAccountCredential() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CustomerLogin login = new CustomerLogin(driver);
        CreateCharger operation =new CreateCharger(driver);
        BasePage basePage = new BasePage(driver);
//        login.GoToCustomerLoginPage();
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/XnthEz"));
        operation.ClickButton(GuestFlow.LoginBtn,3000);
        Assert.assertTrue(operation.writeInputText(CustomerLogin.EmailField,"komame4721@minterp.com",500));
        Assert.assertTrue(operation.writeInputText(CustomerLogin.PasswordField,"T7777777",500));
        Assert.assertTrue(operation.ClickButton(CustomerLogin.CustomerLoginButton,500));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1500,GuestFlow.PhoneNoField));
        login.LogoutFromCustomerAccount();

    }







}
