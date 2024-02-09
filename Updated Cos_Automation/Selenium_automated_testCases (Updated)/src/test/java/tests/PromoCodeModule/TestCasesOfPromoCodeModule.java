package tests.PromoCodeModule;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;

public class TestCasesOfPromoCodeModule extends BaseTest {


    Properties prop = ConfigUtill.getConfig();

    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void tc_01_checkCreatePromoCodeDrawerTitle() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();
        Assert.assertTrue(createPromoCode.verifyTextMatching(2000,CreatePromoCode.drawerTitle,createPromoCode.createPromoDrawerTitle()));

    }


    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-2,9,10"})
    public void tc_02_checkAllTheLabelsOfTheDrawer() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();*/
        softAssert.assertTrue(createPromoCode.verifyTextMatching(1000,CreatePromoCode.promoInformationLabel,"Promo Information"));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.promoCodeLabel,"* Promo Code"));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.promoRulesLabel,"* Promo Rules"));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.promoStartDateLabel,"* Promo Start Date"));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.promoExpiryDateLabel,"* Promo Expiry Date"));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.reuseLimitPerPersonLabel,"Reuse Limit Per Person (optional)"));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.propertyInformationLabel,"Property Information"));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.assignPropertyLabel,"* Assign Property"));
        softAssert.assertAll();

    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-3"})
    public void tc_03_checkPromoRulesIsSetByPercentage() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();*/
        softAssert.assertTrue(createPromoCode.verifyTextMatching(1000,CreatePromoCode.percentageType,"Percentage"));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.promoRulesUnit,"% Off"));
        softAssert.assertAll();


    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void tc_04_checkPromoRulesForFlatBase() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();*/
        createPromoCode.changePromoRulesTypeToFlatBase();
        softAssert.assertTrue(createPromoCode.verifyTextMatching(1000,CreatePromoCode.flatType,"Flat Base"));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.promoRulesUnit,"$ Off"));
        softAssert.assertAll();

    }


    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void tc_05_checkPreviousDatesOfCalendarIsDisabled() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();*/
        Assert.assertTrue(createPromoCode.verifyPastDateIsDisabledStartDate(CreatePromoCode.promoStartDateField));
        createPromoCode.click(CreatePromoCode.drawerTitle);
        Assert.assertTrue(createPromoCode.verifyPastDateIsDisabledForExpireDates(CreatePromoCode.promoExpiryDateField));

    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void tc_06_checkAlTheField() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();*/
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.promoCodeField));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.promoRulesField));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.promoStartDateField));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.promoExpiryDateField));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.reuseLimitPerPersonField));
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void tc_07_checkTextUnderReuseLimitPerPersonField() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();*/
        Assert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.textUnderReuseLimitField,createPromoCode.textUnderReuseLimitField()));
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void tc_08_checkAddOnOfReuseLimit() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();*/
        Assert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.reuseLimitAddOn,"Times"));
    }

    @Test(priority = 11)//Done
    @TestParameters(testCaseId = {"TC-11"})
    public void tc_11_checkAllTheButtonInCreatePromoDrawer() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();*/
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.savePromoCodeButton));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(200,CreatePromoCode.saveAndCreateAnotherPromoCodeButton));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(200,CreatePromoCode.crossButton));
    }
    @Test(priority = 12)//Done
    @TestParameters(testCaseId = {"TC-12"})
    public void tc_12_checkDisabledArrowsWhenNoPropertiesAreSelected() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();*/
        Assert.assertTrue(createPromoCode.verifyAFieldIsDisable(500,CreatePromoCode.assignedPropertyArrow));
        Assert.assertTrue(createPromoCode.verifyAFieldIsDisable(500,CreatePromoCode.unassignedPropertyArrow));

    }

    @Test(priority = 13)//Done
    @TestParameters(testCaseId = {"TC-13"})
    public void tc_13_checkEmptyViewOfAssignedPropertiesBox() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();*/
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.noDataView));

    }


    @Test(priority = 14)//Done
    @TestParameters(testCaseId = {"TC-14"})
    public void tc_14_checkTheCountOfUnassignedProperties() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();*/
        Assert.assertTrue(createPromoCode.verifyPromoCodeInPropertyList());

    }

    @Test(priority = 15)//Done
    @TestParameters(testCaseId = {"TC-15"})
    public void tc_15_checkTheCountOfAssignedPropertiesIsIncreasing() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        dashboard.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        Assert.assertTrue(createPromoCode.verifyCountOfAssignedPropertiesHasIncreased("Raw property"));

    }

    /*@Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void tc_16_checkSuccessAlertAfterCreatingAPromoCode() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        *//*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*//*
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.createAPromoCodeWithoutOptionalField(createPromoCode.generatePromoCodes(),"20",5,6,"Raw Property");
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.successfullyCreatedPopUp));


    }*/

    @Test(priority = 21)//Done
    @TestParameters(testCaseId = {"TC-21"})
    public void tc_21_checkRequiredMsgForAllFields() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.clickButton(CreatePromoCode.savePromoCodeButton,2000);
        softAssert.assertTrue(createPromoCode.verifyTextMatching(1000,CreatePromoCode.validationMsgForField1,createPromoCode.requiredMsgForPromoCode()));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.validationMsgForField2,createPromoCode.requiredMsgForPromoRules()));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.validationMsgForField3,createPromoCode.requiredMsgForStartDate()));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.validationMsgForField4,createPromoCode.requiredMsgForExpiryDate()));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.validationMsgForPropertySelection,createPromoCode.requiredMsgForProperty()));
        softAssert.assertAll();


    }


    @Test(priority = 22)//Done
    @TestParameters(testCaseId = {"TC-22"})
    public void tc_22_checkInvalidInputForPromoRulesFieldWhenPercentageItIs() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,"EVVeh10");
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,1);
        createPromoCode.selectDateForExpiryDate(5);
        createPromoCode.selectProperty("Raw property");
        createPromoCode.clickButton(CreatePromoCode.savePromoCodeButton,2000);
        Assert.assertTrue(createPromoCode.verifyInvalidInputForPromoRulesField());



    }


    @Test(priority = 23)//Done
    @TestParameters(testCaseId = {"TC-23"})
    public void tc_23_checkOnlySpaceInputForPromoRulesFieldWhenPercentageItIs() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,"EVVeh10");*/
        createPromoCode.fieldClear(CreatePromoCode.promoRulesField);
        createPromoCode.writeText(CreatePromoCode.promoRulesField,Keys.chord(Keys.SPACE));
        /*createPromoCode.selectDate(CreatePromoCode.promoStartDateField,1);
        createPromoCode.selectDateForExpiryDate(4);
        createPromoCode.selectProperty("Raw property");*/
        createPromoCode.clickButton(CreatePromoCode.savePromoCodeButton,2000);
        Assert.assertTrue(createPromoCode.verifyTextMatching(1000,CreatePromoCode.validationMsgForField1,createPromoCode.requiredMsgForPromoRules()));



    }

    @Test(priority = 24)//Done
    @TestParameters(testCaseId = {"TC-24"})
    public void tc_24_checkInvalidInputForPromoRulesFieldWhenFlatBaseItIs() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,createPromoCode.generatePromoCodes());
        createPromoCode.changePromoRulesTypeToFlatBase();
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,1);
        createPromoCode.selectDateForExpiryDate(5);
        createPromoCode.selectProperty("Raw property");
        createPromoCode.clickButton(CreatePromoCode.savePromoCodeButton,2000);
        Assert.assertTrue(createPromoCode.verifyInvalidInputForPromoRulesField());


    }

    @Test(priority = 25)//Done
    @TestParameters(testCaseId = {"TC-25"})
    public void tc_25_checkOnlySpaceInputForPromoRulesFieldWhenFlatBaseItIs() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,"EVVeh10");*/
        createPromoCode.fieldClear(CreatePromoCode.promoRulesField);
        createPromoCode.writeText(CreatePromoCode.promoRulesField,Keys.chord(Keys.SPACE));
        /*createPromoCode.selectDate(CreatePromoCode.promoStartDateField,1);
        createPromoCode.selectDateForExpiryDate(4);
        createPromoCode.selectProperty("Raw property");*/
        createPromoCode.clickButton(CreatePromoCode.savePromoCodeButton,2000);
        Assert.assertTrue(createPromoCode.verifyTextMatching(1000,CreatePromoCode.validationMsgForField1,createPromoCode.requiredMsgForPromoRules()));


    }



    @Test(priority = 26)//Done
    @TestParameters(testCaseId = {"TC-26"})
    public void tc_26_checkWhenExpiryDateIsBeforeTheStartDate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,createPromoCode.generatePromoCodes());
        createPromoCode.writeText(CreatePromoCode.promoRulesField,"20");
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,1);
        createPromoCode.selectDateForExpiryDate(0);
        createPromoCode.selectProperty("Raw property");
        createPromoCode.clickButton(CreatePromoCode.savePromoCodeButton,2000);
        Assert.assertTrue(createPromoCode.verifyTextMatching(1000,CreatePromoCode.validationMsgForField1,createPromoCode.validationMsgInvalidIntervalBetweenDates()));


    }


    @Test(priority = 27)//Done
    @TestParameters(testCaseId = {"TC-27"})
    public void tc_27_checkWhenPromoCodeNameAndDateRangesAreSame() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        String promoCode = createPromoCode.generatePromoCodes();
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,promoCode);
        createPromoCode.writeText(CreatePromoCode.promoRulesField,"20");
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,0);
        createPromoCode.selectDateForExpiryDate(1);
        createPromoCode.selectProperty("Raw property");
        createPromoCode.clickButton(CreatePromoCode.savePromoCodeButton,2000);
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,promoCode);
        createPromoCode.writeText(CreatePromoCode.promoRulesField,"10");
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,0);
        createPromoCode.selectDateForExpiryDate(1);
        createPromoCode.click(CreatePromoCode.savePromoCodeButton);
        Assert.assertTrue(createPromoCode.verifyTextMatching(1000,CreatePromoCode.validationMsgForField1,createPromoCode.validationMsgForExistingPromoCodeNameAndDateRanges()));


    }


    @Test(priority = 28)//Done
    @TestParameters(testCaseId = {"TC-28"})
    public void tc_28_checkValidationForInvalidReuseLimit() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,createPromoCode.generatePromoCodes());
        createPromoCode.writeText(CreatePromoCode.promoRulesField,"20");
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,0);
        createPromoCode.selectDateForExpiryDate(1);
        createPromoCode.selectProperty("Raw property");
        Assert.assertTrue(createPromoCode.verifyInvalidInputForReuseLimitField());


    }

    @Test(priority = 29)//Done
    @TestParameters(testCaseId = {"TC-29"})
    public void tc_29_checkDrawerClosingAfterClickingOutsideOfDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.clickButton(CreateCharger.outsideDrawer,2000);
        Assert.assertTrue(createPromoCode.verifyElementNotDisplayed(2500,CreatePromoCode.drawerTitle));
        Assert.assertTrue(createPromoCode.verifyElementNotDisplayed(500,CreatePromoCode.promoCodeField));

    }


    @Test(priority = 30)//Done
    @TestParameters(testCaseId = {"TC-30"})
    public void tc_30_checkDrawerClosingAfterClickingCrossButtonOfDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.clickButton(CreatePromoCode.crossButton,2000);
        Assert.assertTrue(createPromoCode.verifyElementNotDisplayed(2500,CreatePromoCode.drawerTitle));
        Assert.assertTrue(createPromoCode.verifyElementNotDisplayed(500,CreatePromoCode.promoCodeField));

    }

    @Test(priority = 31)//Done
    @TestParameters(testCaseId = {"TC-31"})
    public void tc_31_checkAfterClickingCrossButtonOfDrawerAfterEnteringAnyInput() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,createPromoCode.generatePromoCodes());
        createPromoCode.writeText(CreatePromoCode.promoRulesField,"20");
        createPromoCode.clickButton(CreatePromoCode.crossButton,2000);
        Assert.assertTrue(createPromoCode.verifyTextMatching(1000,CreatePromoCode.modalTitle,createPromoCode.areYouSureText()));
        Assert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.modalContent,createPromoCode.discardAndContinueText()));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(1000,CreatePromoCode.discardButton));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.continueButton));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(200,CreatePromoCode.promoCodeField));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(200,CreatePromoCode.drawerTitle));

    }

    @Test(priority = 33)//Done
    @TestParameters(testCaseId = {"TC-33"})
    public void tc_33_checkAfterClickingDiscardButtonFromModal() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,createPromoCode.generatePromoCodes());
        createPromoCode.writeText(CreatePromoCode.promoRulesField,"20");
        createPromoCode.clickButton(CreatePromoCode.crossButton,2000);
        createPromoCode.clickButton(CreatePromoCode.discardButton,2000);
        Assert.assertTrue(createPromoCode.verifyElementNotDisplayed(2500,CreatePromoCode.drawerTitle));
        Assert.assertTrue(createPromoCode.verifyElementNotDisplayed(500,CreatePromoCode.promoCodeField));

    }


    @Test(priority = 34)//Done
    @TestParameters(testCaseId = {"TC-34"})
    public void tc_34_checkAfterClickingCrossButtonOfDrawerAfterEnteringAnyInput() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,createPromoCode.generatePromoCodes());
        createPromoCode.writeText(CreatePromoCode.promoRulesField,"20");
        createPromoCode.clickButton(CreateCharger.outsideDrawer,2000);
        Assert.assertTrue(createPromoCode.verifyTextMatching(1000,CreatePromoCode.modalTitle,createPromoCode.areYouSureText()));
        Assert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.modalContent,createPromoCode.discardAndContinueText()));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(1000,CreatePromoCode.discardButton));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.continueButton));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(200,CreatePromoCode.promoCodeField));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(200,CreatePromoCode.drawerTitle));

    }

    @Test(priority = 36)//Done
    @TestParameters(testCaseId = {"TC-36"})
    public void tc_36_checkAfterClickingDiscardButtonFromModal() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,createPromoCode.generatePromoCodes());
        createPromoCode.writeText(CreatePromoCode.promoRulesField,"20");
        createPromoCode.clickButton(CreateCharger.outsideDrawer,2000);
        createPromoCode.clickButton(CreatePromoCode.discardButton,2000);
        Assert.assertTrue(createPromoCode.verifyElementNotDisplayed(2500,CreatePromoCode.drawerTitle));
        Assert.assertTrue(createPromoCode.verifyElementNotDisplayed(500,CreatePromoCode.promoCodeField));

    }

    @Test(priority = 37)//Done
    @TestParameters(testCaseId = {"TC-37"})
    public void tc_37_checkAfterClickingContinueButtonFromModal() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,createPromoCode.generatePromoCodes());
        createPromoCode.writeText(CreatePromoCode.promoRulesField,"20");
        createPromoCode.clickButton(CreateCharger.outsideDrawer,2000);
        createPromoCode.clickButton(CreatePromoCode.continueButton,2000);
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(2000,CreatePromoCode.drawerTitle));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.promoCodeField));

    }


    @Test(priority = 40)//Done
    @TestParameters(testCaseId = {"TC-40"})
    public void tc_40_checkBreadCrumbOfPromoCodesList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        String promoCode = createPromoCode.generatePromoCodes();
        loginPage.verifyValidLogin();
        /*dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.goToWebsite(createPromoCode.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        Assert.assertTrue(createPromoCode.verifyTextMatching(2000,PromoCodeList.homeBreadCrumbLink,"Home"));
        Assert.assertTrue(createPromoCode.verifyTextMatching(1000,PromoCodeList.slashInBreadcrumb,"/"));
        Assert.assertTrue(createPromoCode.verifyTextMatching(1000,PromoCodeList.accessCodeBreadCrumbLink,"Access Code"));
        Assert.assertTrue(createPromoCode.verifyElementNotDisplayed(200,PromoCodeList.notExistingBreadCrumbLink));

    }

    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-41"})
    public void tc_41_checkTitleOfListPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.goToWebsite(createPromoCode.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        Assert.assertTrue(createPromoCode.verifyTextMatching(2000,PromoCodeList.pageTitle,"Access Code"));

    }

    @Test(priority = 41)//Done
    @TestParameters(testCaseId = {"TC-42"})
    public void tc_42_checkTabOfThePromoCode() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.goToWebsite(createPromoCode.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        Assert.assertTrue(createPromoCode.verifyTextMatching(1000,PromoCodeList.promoCodesTabIcon,"Promo Codes"));

    }


    @Test(priority = 47)//Done
    @TestParameters(testCaseId = {"TC-47"})
    public void tc_47_checkButtonsInTheListOfPromoCodes() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.goToWebsite(createPromoCode.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,PromoCodeList.searchPromoCodeButton));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,PromoCodeList.addAdvanceFilter));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,PromoCodeList.createNewPromoCodeButton));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,PromoCodeList.editButton));

    }
    @Test(priority = 48)//Done
    @TestParameters(testCaseId = {"TC-48"})
    public void tc_48_checkSearchField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.goToWebsite(createPromoCode.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,PromoCodeList.searchPromoCodeField));
    }

    @Test(priority = 49)//Done
    @TestParameters(testCaseId = {"TC-48"})
    public void tc_49_checkTheColumnNames() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        Assert.assertTrue(promoCodeList.verifyColumnsHeader("Promo Code",0));
        Assert.assertTrue(promoCodeList.verifyColumnsHeader("Promo Code Details",1));
        Assert.assertTrue(promoCodeList.verifyColumnsHeader("Start Date",2));
        Assert.assertTrue(promoCodeList.verifyColumnsHeader("Expiry Date",3));
        Assert.assertTrue(promoCodeList.verifyColumnsHeader("Promo Status",4));
        Assert.assertTrue(promoCodeList.verifyColumnsHeader("Properties linked",5));
        Assert.assertTrue(promoCodeList.verifyColumnsHeader("Chargers",6));
        Assert.assertTrue(promoCodeList.verifyColumnsHeader("Action",7));


    }


    @Test(priority = 50)//Done
    @TestParameters(testCaseId = {"TC-50"})
    public void tc_50_checkTheInfoUnderEachColumnNotRemainedBlank() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        FeeStructureList list = new FeeStructureList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickOnLoadMoreButtonUntilItIsVisible();
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnOccupiedWithContent("Promo Code",0));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnOccupiedWithContent("Promo Code Details",1));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnOccupiedWithContent("Start Date",2));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnOccupiedWithContent("Expiry Date",3));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnOccupiedWithContent("Promo Status",4));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnOccupiedWithContent("Properties linked",5));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnOccupiedWithContent("Chargers",6));
        Assert.assertTrue(list.verifyActionColumnOccupiedWithEditButton("Action",7));


    }


    @Test(priority = 52)//Done
    @TestParameters(testCaseId = {"TC-52"})
    public void tc_52_checkTheHomeLinkOfBreadCrumb() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.homeBreadCrumbLink,2000);
        Assert.assertTrue(promoCodeList.pageUrlCheck(promoCodeList.urlOfAdminApp(prop.getProperty("DashboardURL"))));

    }

    @Test(priority = 53)//Done
    @TestParameters(testCaseId = {"TC-53"})
    public void tc_53_checkTheAccessCodeLinkOfBreadCrumb() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.accessCodeBreadCrumbLink,2000);
        Assert.assertTrue(promoCodeList.pageUrlCheck(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL"))));

    }

    @Test(priority = 54)//Done
    @TestParameters(testCaseId = {"TC-54"})
    public void tc_54_checkAddAdvanceFilterButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.drawerTitle,"Advance Filter"));

    }


    @Test(priority = 56)//Done
    @TestParameters(testCaseId = {"TC-56"})
    public void tc_56_checkEditButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.editButton,2000);
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.drawerTitle,"Edit Promo Code"));

    }

    @Test(priority = 57)//Done
    @TestParameters(testCaseId = {"TC-57"})
    public void tc_57_checkLinksOfChargersCountClickable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.chargersCountLink,2000);
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,ChargerListPropertyAdmin.pageTitle,"Charger"));

    }

    @Test(priority = 58)//Done
    @TestParameters(testCaseId = {"TC-58"})
    public void tc_58_checkSearchingWithInvalidValues() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        Assert.assertTrue(promoCodeList.verifySearchingWithInvalidInfo());

    }
























}
