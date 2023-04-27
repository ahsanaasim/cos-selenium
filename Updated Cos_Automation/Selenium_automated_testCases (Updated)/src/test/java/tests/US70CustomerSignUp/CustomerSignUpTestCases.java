package tests.US70CustomerSignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Properties;

public class CustomerSignUpTestCases extends BaseTest {
    Properties prop = ConfigUtill.getConfig();
    Messages msg = new Messages();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void TC_13_CheckWhenUserScanAChargerWithoutLoginOrSignup () throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        Assert.assertTrue(customerSignUp.GoToAvailableCharger("https://test-app.chargeonsite.com/charger/K-5UbQ"));
        Assert.assertTrue(customerSignUp.VerifyNumberVerificationPage());

    }
    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void TC_14_CheckWhenUserClickOnSigUpButtonOnVerificationPage  () throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpBtn,5000));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpWithEmail,5000));
        Assert.assertTrue(customerSignUp.VerifyUserIsInRegistrationPage());

    }
    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void TC_15_CheckIfUserCanSignUpWithoutProvidingFirstName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.LastName,"Islam",500));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.EmailField,"fahim@6sensehq.com",500));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.ZipField,"55555",500));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.Password,"A7777777",500));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.ConfirmPassword,"A7777777",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.AgreeCheckBox,500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyFirstNameErrorMsg());

    }
    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void TC_16_CheckIfSystemIsTakingInvalidInputInFirstName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.FirstName,"@@",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyFirstNameErrorMsgForInvalidInput());

    }
    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void TC_17_CheckIfSystemIsTakingInvalidInputInFirstName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.FirstName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.FirstName,"!!",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyFirstNameErrorMsgForInvalidInput());

    }
    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-17.1"})
    public void TC_17_1_CheckIfSystemIsTakingInvalidInputInFirstName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.FirstName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.FirstName,"&&",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyFirstNameErrorMsgForInvalidInput());

    }
    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-17.2"})
    public void TC_17_2_CheckIfSystemIsTakingInvalidInputInFirstName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.FirstName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.FirstName,"++",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyFirstNameErrorMsgForInvalidInput());

    }
    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-17.3"})
    public void TC_17_3_CheckIfSystemIsTakingInvalidInputInFirstName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.FirstName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.FirstName,"%",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyFirstNameErrorMsgForInvalidInput());

    }
    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-17.4"})
    public void TC_17_4_CheckIfSystemIsTakingInvalidInputInFirstName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.FirstName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.FirstName,"##",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyFirstNameErrorMsgForInvalidInput());

    }
    @Test(priority = 10)//Done
    @TestParameters(testCaseId = {"TC-17.5"})
    public void TC_17_5_CheckIfSystemIsTakingInvalidInputInFirstName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.FirstName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.FirstName,"F@him",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyFirstNameErrorMsgForInvalidInput());

    }
    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-17.6"})
    public void TC_17_6_CheckIfSystemIsTakingInvalidInputInFirstName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.FirstName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.FirstName,"!mran",300));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,300));
        Assert.assertTrue(customerSignUp.VerifyFirstNameErrorMsgForInvalidInput());

    }
    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-18"})
    public void TC_18_CheckIfSystemIsTakingInvalidInputInLastName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.FirstName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.FirstName,"Fahim",500));
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.LastName));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyLastNameErrorMsg());

    }
    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void TC_19_CheckIfSystemIsTakingInvalidInputInLastName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.LastName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.LastName,"@@",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyLastNameErrorMsgForInvalidInput());

    }@Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-20.1"})
    public void TC_20_1_CheckIfSystemIsTakingInvalidInputInLastName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.LastName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.LastName,"&&",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyLastNameErrorMsgForInvalidInput());

    }
    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-20.2"})
    public void TC_20_2_CheckIfSystemIsTakingInvalidInputInLastName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.LastName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.LastName,"++",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyLastNameErrorMsgForInvalidInput());

    }
    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-20.3"})
    public void TC_20_3_CheckIfSystemIsTakingInvalidInputInLastName() throws InterruptedException, IOException, UnsupportedFlavorException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.LastName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.LastName,"%",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyLastNameErrorMsgForInvalidInput());

    }
    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-20.4"})
    public void TC_20_4_CheckIfSystemIsTakingInvalidInputInLastName() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.LastName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.LastName,"##",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyLastNameErrorMsgForInvalidInput());

    }
    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-20.5"})
    public void TC_20_5_CheckIfSystemIsTakingInvalidInputInLastName() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.LastName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.LastName,"Fah+13",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyLastNameErrorMsgForInvalidInput());

    }
    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-20.6"})
    public void TC_20_6_CheckIfSystemIsTakingInvalidInputInLastName() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.LastName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.LastName,"Ahmed*",500));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyLastNameErrorMsgForInvalidInput());

    }
    @Test(priority = 20)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void TC_22_CheckIfSystemIsTakingNoEmailOrNot() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.LastName));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.LastName,"Ahmed",500));
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.EmailField));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyNoEmailErrorMsg());

    }
    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void TC_23_CheckIfSystemIsTakingInvalidInputInLastEmail() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.EmailField));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.EmailField,"tahia@tahia",300));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());

    }
    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void TC_24_CheckIfSystemIsTakingInvalidInputInEmail() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.EmailField));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.EmailField,"test@test",300));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());
    }
    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-24.1"})
    public void TC_24_1_CheckIfSystemIsTakingInvalidInputInEmail() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.EmailField));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.EmailField,"@",300));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());
    }
    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-24.2"})
    public void TC_24_2_CheckIfSystemIsTakingInvalidInputInEmail() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.EmailField));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.EmailField,"testtest.test@",300));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());
    }
    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-24.3"})
    public void TC_24_3_CheckIfSystemIsTakingInvalidInputInEmail() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.EmailField));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.EmailField,"test@test.",300));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());
    }
    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-24.4"})
    public void TC_24_4_CheckIfSystemIsTakingInvalidInputInEmail() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.EmailField));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.EmailField,"testtest.test",300));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());
    }
    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-24.4"})
    public void TC_24_5_CheckIfSystemIsTakingInvalidInputInEmail() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.EmailField));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.EmailField," Tahia@gmail.c",300));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidEmailErrorMsg());
    }
    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void TC_27_CheckIfUserCanRegisterInvalidZipCode() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.EmailField));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.EmailField,"Yoyo@yahoo.com",300));
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.ZipField));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.ZipField,"0000",300));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,500));
        Assert.assertTrue(customerSignUp.VerifyInvalidZipCode());
    }
    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void TC_29_CheckIfUserCanSignupWithoutProvidingPassword() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.ZipField));
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.Password));
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.ConfirmPassword));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,300));
        Assert.assertTrue(customerSignUp.VerifyWithNoPassword());
    }
    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void TC_30_CheckIfUserCanSignupProvidingSixDigitPassword() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.ZipField,"12345",200));
        driver.findElement(CustomerSignUp.Password).sendKeys("A@1234");
        driver.findElement(CustomerSignUp.ConfirmPassword).sendKeys("A@1234");
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,300));
        Assert.assertTrue(customerSignUp.VerifyWithLessThanEightDigitPassword());
    }
    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void TC_31_CheckIfUserCanSignupProvidingSevenDigitPassword() throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.Password));
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.ConfirmPassword));
        driver.findElement(CustomerSignUp.Password).sendKeys("A@12345");
        driver.findElement(CustomerSignUp.ConfirmPassword).sendKeys("A@12345");
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,300));
        Assert.assertTrue(customerSignUp.VerifyWithLessThanEightDigitPassword());
    }
    @Test(priority = 32)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_33_CheckIfUserCanSignupWithoutSelectingTC () throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.Password));
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.ConfirmPassword));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.Password,"A@12345678",100));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.ConfirmPassword,"A@12345678",100));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.AgreeCheckBoxChecked,300));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,300));
        Assert.assertTrue(customerSignUp.VerifyWithoutSelectingCheckboxOfTC());
    }
    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void TC_32_CheckEmailVerificationPageAfterProvidingAllValidInfo () throws InterruptedException {
        CustomerSignUp customerSignUp = new CustomerSignUp(driver);
        CreateCharger createCharger =new CreateCharger(driver);
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.Password));
        Assert.assertTrue(customerSignUp.FieldClear(CustomerSignUp.ConfirmPassword));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.Password,"A@12345678",100));
        Assert.assertTrue(createCharger.writeInputText(CustomerSignUp.ConfirmPassword,"A@12345678",100));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.AgreeCheckBox,300));
        Assert.assertTrue(createCharger.ClickButton(CustomerSignUp.SignUpConfirm,300));
        Assert.assertTrue(customerSignUp.VerifyEmailVerificationTitle());
    }


}
