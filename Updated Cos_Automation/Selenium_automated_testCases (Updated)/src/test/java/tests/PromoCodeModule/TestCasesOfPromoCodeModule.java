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

    @Test(priority = 16)//Done
    @TestParameters(testCaseId = {"TC-16"})
    public void tc_16_checkSuccessAlertAfterCreatingAPromoCode() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        String promo = createPromoCode.generatePromoCodes();
        String promoDetails = "$50 Off";
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.createAFlatBasePromoCode(promo,"50",2,4,"Raw property",CreatePromoCode.savePromoCodeButton);
        softAssert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.successfullyCreatedPopUp));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(1000,PromoCodeList.latestPromoCode,promo));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,PromoCodeList.latestPromoCodeDetails,promoDetails));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,PromoCodeList.latestPromoCodeStatus,"Inactive"));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,PromoCodeList.latestPromoCodePropertiesCount,"1"));
        softAssert.assertAll();


    }

    @Test(priority = 17)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void tc_17_checkActiveStatusAfterCreatingAPromoCode() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        String promo = createPromoCode.generatePromoCodes();
        String promoDetails = "20% Off";
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.createAPromoCodeWithOptionalField(promo,"20",0,1,"5","Raw property",CreatePromoCode.savePromoCodeButton);
        softAssert.assertTrue(createPromoCode.verifyTextMatching(3000,PromoCodeList.latestPromoCode,promo));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(300,PromoCodeList.latestPromoCodeDetails,promoDetails));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(300,PromoCodeList.latestPromoCodeStatus,"Active"));
        softAssert.assertAll();


    }

    @Test(priority = 18)//Done
    @TestParameters(testCaseId = {"TC-17"})
    public void tc_18_checkActiveStatusOfAfterCreatingAPromoCode() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        String promo = createPromoCode.generatePromoCodes();
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.createAPromoCodeWithOptionalField(promo,"20",0,1,"5","Raw property",CreatePromoCode.savePromoCodeButton);
        Assert.assertTrue(createPromoCode.verifyTextMatching(1500,PromoCodeList.latestPromoCode,promo));
        Assert.assertTrue(createPromoCode.verifyTextMatching(500,PromoCodeList.latestPromoCodeStatus,"Active"));


    }

    @Test(priority = 19)//Done
    @TestParameters(testCaseId = {"TC-19"})
    public void tc_19_checkCreatingAPromoCodeAfterClickingOnSaveAndCreateButton() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        String promo = createPromoCode.generatePromoCodes();
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();*/
        createPromoCode.refreshBrowser();
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.createAPromoCodeWithOptionalField(promo,"20",1,3,"5","Raw property",CreatePromoCode.saveAndCreateAnotherPromoCodeButton);
        softAssert.assertTrue(createPromoCode.verifyFieldValueIsEmpty(1500,CreatePromoCode.promoCodeField));
        softAssert.assertTrue(createPromoCode.verifyFieldValueIsEmpty(500,CreatePromoCode.promoRulesField));
        softAssert.assertTrue(createPromoCode.verifyFieldValueIsEmpty(500,CreatePromoCode.promoStartDateField));
        softAssert.assertTrue(createPromoCode.verifyFieldValueIsEmpty(500,CreatePromoCode.promoExpiryDateField));
        softAssert.assertTrue(createPromoCode.verifyFieldValueIsEmpty(500,CreatePromoCode.reuseLimitPerPersonField));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.assignedPropertiesCount,"Assigned Properties (0)"));
        createPromoCode.refreshBrowser();
        softAssert.assertTrue(createPromoCode.verifyTextMatching(1500,PromoCodeList.latestPromoCode,promo));
        softAssert.assertAll();



    }

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
        createPromoCode.waitForFewMoment(4000);
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,promoCode);
        createPromoCode.writeText(CreatePromoCode.promoRulesField,"10");
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,0);
        createPromoCode.selectDateForExpiryDate(1);
        createPromoCode.selectProperty("Raw property");
        createPromoCode.clickButton(CreatePromoCode.savePromoCodeButton,2000);
        Assert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.validationPopUpOfAlreadyActivePopUp,createPromoCode.validationMsgForExistingPromoCodeNameAndDateRanges()));


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
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Code",0));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Code Details",1));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Start Date",2));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Expiry Date",3));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Status",4));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Properties linked",5));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Chargers",6));
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
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.drawerTitle,"Advanced Filter"));

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


    @Test(priority = 62)//Done
    @TestParameters(testCaseId = {"TC-62"})
    public void tc_62_checkAfterEnteringSpaceOnlyInSearchField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        FeeStructureList list = new FeeStructureList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.searchAPromoCode(Keys.chord(Keys.SPACE));
        promoCodeList.waitForFewMoment(2500);
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Code",0));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Code Details",1));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Start Date",2));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Expiry Date",3));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Status",4));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Properties linked",5));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Chargers",6));
        Assert.assertTrue(list.verifyActionColumnOccupiedWithEditButton("Action",7));

    }



    @Test(priority = 63)//Done
    @TestParameters(testCaseId = {"TC-63"})
    public void tc_63_checkAfterEnteringNothingInSearchField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        FeeStructureList list = new FeeStructureList(driver);
        loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickOnSearchButton(PromoCodeList.editButton,PromoCodeList.searchPromoCodeButton);
        promoCodeList.waitForFewMoment(2500);
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Code",0));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Code Details",1));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Start Date",2));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Expiry Date",3));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Status",4));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Properties linked",5));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Chargers",6));
        Assert.assertTrue(list.verifyActionColumnOccupiedWithEditButton("Action",7));

    }


    @Test(priority = 64)//Done
    @TestParameters(testCaseId = {"TC-64"})
    public void tc_64_checkCrossButtonInTheSearchField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.writeInputText(PromoCodeList.searchPromoCodeField,"EVCAR20",3000);
        Assert.assertTrue(promoCodeList.verifyAnElementDisplayedOrNot(1000,PromoCodeList.crossButtonInSearchField));

    }

    @Test(priority = 65)//Done
    @TestParameters(testCaseId = {"TC-64"})
    public void tc_65_checkAfterClickingCrossButtonWhenNoDataIsSearched() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        promoCodeList.fieldClear(PromoCodeList.searchPromoCodeField);
        promoCodeList.writeInputText(PromoCodeList.searchPromoCodeField,"EVCAR30",1000);
        promoCodeList.clickButton(PromoCodeList.crossButtonInSearchField,1000);
        Assert.assertTrue(promoCodeList.verifyAnElementDisplayedOrNot(100,PromoCodeList.spinner));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(100,PromoCodeList.crossButtonInSearchField));
        Assert.assertTrue(promoCodeList.verifySearchFieldIsEmpty(PromoCodeList.searchPromoCodeField));

    }


    @Test(priority = 67)//Done
    @TestParameters(testCaseId = {"TC-67"})
    public void tc_67_checkAfterClickingCrossButtonAfterSearchingData() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        promoCodeList.fieldClear(PromoCodeList.searchPromoCodeField);
        promoCodeList.searchAPromoCode("sadasghasdhja2has");
        promoCodeList.clickButton(PromoCodeList.crossButtonInSearchField,2000);
        Assert.assertTrue(promoCodeList.verifyAnElementDisplayedOrNot(100,PromoCodeList.spinner));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(100,PromoCodeList.crossButtonInSearchField));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Code",0));
        Assert.assertTrue(promoCodeList.verifyPromoCodeDetailsColumnExpectedContent());
        Assert.assertTrue(promoCodeList.verifyExpectedColumnOccupiedWithExpectedContent("Start Date",2,promoCodeList.regexForStartEndDateField()));
        Assert.assertTrue(promoCodeList.verifyExpectedColumnOccupiedWithExpectedContent("Expiry Date",3,promoCodeList.regexForStartEndDateField()));
        Assert.assertTrue(promoCodeList.verifyExpectedColumnOccupiedWithExpectedContent("Promo Status",4,promoCodeList.regexForStatuses()));
        Assert.assertTrue(promoCodeList.verifyExpectedColumnOccupiedWithNumber("Properties linked",5,promoCodeList.regexForNumber()));
        Assert.assertTrue(promoCodeList.verifyExpectedColumnOccupiedWithNumber("Chargers",6,promoCodeList.regexForNumber()));

    }

    @Test(priority = 69)//Done
    @TestParameters(testCaseId = {"TC-69"})
    public void tc_69_checkWhenAnyExistingPromoCodeIsSearched() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        promoCodeList.fieldClear(PromoCodeList.searchPromoCodeField);
        promoCodeList.searchAPromoCode(prop.getProperty("SearchedPromoCodeTest"));
        Assert.assertTrue(promoCodeList.verifySearchDataIsShowingCorrectly("Promo Code",0, prop.getProperty("SearchedPromoCodeTest")));


    }


    @Test(priority = 70)//Done
    @TestParameters(testCaseId = {"TC-70"})
    public void tc_70_checkPartialSearching() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.fieldClear(PromoCodeList.searchPromoCodeField);
        promoCodeList.searchAPromoCode(prop.getProperty("PartiallySearchedPromoCodeTest"));
        Assert.assertTrue(promoCodeList.verifyPartiallySearchData("Promo Code",0, prop.getProperty("PartiallySearchedPromoCodeTest")));


    }

    @Test(priority = 71)//Done
    @TestParameters(testCaseId = {"TC-71"})
    public void tc_71_checkSearchFieldDataIsRemainSameAfterRefreshing() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        promoCodeList.refreshBrowser();
        Assert.assertTrue(promoCodeList.verifySearchFieldData(CreatePromoCode.editButton,PromoCodeList.searchPromoCodeField,prop.getProperty("PartiallySearchedPromoCodeTest")));


    }


    @Test(priority = 72)//Done
    @TestParameters(testCaseId = {"TC-72"})
    public void tc_72_checkLoadMoreButtonText() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.loadMoreButton,promoCodeList.loadMoreButtonText()));


    }


    @Test(priority = 73)//Done
    @TestParameters(testCaseId = {"TC-73"})
    public void tc_73_checkLoadMoreButtonActionOnListAndAboveCount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        Assert.assertTrue(promoCodeList.verifyLoadMoreButtonActionWithAboveShowingCount());


    }
    @Test(priority = 75)//Done
    @TestParameters(testCaseId = {"TC-75"})
    public void tc_75_checkLoadMoreButtonActionOnListAndCountBesideLoadMoreButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        Assert.assertTrue(promoCodeList.verifyLoadMoreButtonActionOnTextBesideTheButton());


    }

    @Test(priority = 76)//Done
    @TestParameters(testCaseId = {"TC-76"})
    public void tc_76_checkTotalCount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        Assert.assertTrue(promoCodeList.verifyTotalCount());


    }

    @Test(priority = 81)//Done
    @TestParameters(testCaseId = {"TC-81"})
    public void tc_81_checkExpiredStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.searchAPromoCode(prop.getProperty("PromoCodeToTestExpiredZStatus"));
        Assert.assertTrue(promoCodeList.verifySearchDataIsShowingCorrectly("Promo Code",0,prop.getProperty("PromoCodeToTestExpiredZStatus")));
        Assert.assertTrue(promoCodeList.verifySearchDataIsShowingCorrectly("Promo Status",4,"Expired"));


    }

    @Test(priority = 85)//Done
    @TestParameters(testCaseId = {"TC-85"})
    public void tc_85_checkStartExpiryDateInTheList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        String promo = createPromoCode.generatePromoCodes();
        String startDate = createPromoCode.generateDate(0)+" 12:00 am";
        String expiryDate = createPromoCode.generateDate(2)+" 11:59 pm";
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.createAPromoCodeWithOptionalField(promo,"5",0,2,"20", prop.getProperty("PropertyForPromoCode"),CreatePromoCode.savePromoCodeButton);
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.latestPromoCodeStartDate,startDate));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.latestPromoCodeExpiryDate,expiryDate));


    }

    @Test(priority = 87)//Done
    @TestParameters(testCaseId = {"TC-87"})
    public void tc_87_checkPromoCodeInTheListAfterEditingNameAndDetails() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        String promo = createPromoCode.generatePromoCodes();
        String promoDetails = "3% Off";
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.editButton,2000);
        promoCodeList.fieldClear(CreatePromoCode.promoCodeField);
        promoCodeList.fieldClear(CreatePromoCode.promoRulesField);
        promoCodeList.writeText(CreatePromoCode.promoCodeField,promo);
        promoCodeList.writeText(CreatePromoCode.promoRulesField,"3");
        promoCodeList.clickButton(CreatePromoCode.savePromoCodeButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.latestPromoCode,promo));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.latestPromoCodeDetails,promoDetails));


    }

    @Test(priority = 88)//Done
    @TestParameters(testCaseId = {"TC-88"})
    public void tc_88_checkPromoRulesInTheListAfterChangingFromPercentageToFlatBase() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        String promoRulesInput = createPromoCode.generatePromoRule();
        String promoDetails = "$"+promoRulesInput+" Off";
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.createAPromoCodeWithoutOptionalField(createPromoCode.generatePromoCodes(),createPromoCode.generatePromoRule(),2,4, prop.getProperty("PropertyForPromoCode"),CreatePromoCode.savePromoCodeButton);
        promoCodeList.clickButton(PromoCodeList.editButton,2000);
        createPromoCode.changePromoRulesTypeToFlatBase();
        promoCodeList.fieldClear(CreatePromoCode.promoRulesField);
        promoCodeList.writeText(CreatePromoCode.promoRulesField,promoRulesInput);
        promoCodeList.clickButton(CreatePromoCode.savePromoCodeButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.latestPromoCodeDetails,promoDetails));

    }

    @Test(priority = 90)//Done
    @TestParameters(testCaseId = {"TC-90"})
    public void tc_90_checkPromoRulesInTheListAfterFlatBaseValue() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        String promoRulesInput = createPromoCode.generatePromoRule();
        String promoDetails = "$"+promoRulesInput+" Off";
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.editButton,2000);
        promoCodeList.fieldClear(CreatePromoCode.promoRulesField);
        promoCodeList.writeText(CreatePromoCode.promoRulesField,promoRulesInput);
        promoCodeList.clickButton(CreatePromoCode.savePromoCodeButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.latestPromoCodeDetails,promoDetails));


    }

    @Test(priority = 91)//Done
    @TestParameters(testCaseId = {"TC-91"})
    public void tc_91_checkInTheListAfterUpdatingDates() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        String startDate = createPromoCode.generateDate(1)+" 12:00 am";
        String expiryDate = createPromoCode.generateDate(2)+" 11:59 pm";
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.editButton,2000);
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,1);
        createPromoCode.selectDateForExpiryDate(2);
        promoCodeList.clickButton(CreatePromoCode.savePromoCodeButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(3000,PromoCodeList.latestPromoCodeStartDate,startDate));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.latestPromoCodeExpiryDate,expiryDate));


    }

    @Test(priority = 94)//Done
    @TestParameters(testCaseId = {"TC-94"})
    public void tc_94_checkForMultiplePropertiesWhileCreatingPromoCodes() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        createPromoCode.clickOnCreateNewCompanyButton();
        createPromoCode.writeText(CreatePromoCode.promoCodeField,createPromoCode.generatePromoCodes());
        createPromoCode.writeText(CreatePromoCode.promoRulesField, createPromoCode.generatePromoRule());
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,0);
        createPromoCode.selectDateForExpiryDate(3);
        createPromoCode.selectProperty(prop.getProperty("PropertyForPromoCode"));
        createPromoCode.selectProperty(prop.getProperty("Property2ForPromoCode"));
        createPromoCode.selectProperty(prop.getProperty("Property3ForPromoCode"));
        promoCodeList.clickButton(CreatePromoCode.savePromoCodeButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(3000,PromoCodeList.latestPromoCodePropertiesCount,"3"));


    }

    @Test(priority = 95)//Done
    @TestParameters(testCaseId = {"TC-95"})
    public void tc_95_checkInTheListWhenAPropertyIsRemoved() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.editButton,2000);
        createPromoCode.removeAProperty(prop.getProperty("Property3ForPromoCode"));
        promoCodeList.clickButton(CreatePromoCode.savePromoCodeButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(3000,PromoCodeList.latestPromoCodePropertiesCount,"2"));


    }

    @Test(priority = 96)//Done
    @TestParameters(testCaseId = {"TC-96"})
    public void tc_96_checkPropertyCountIsIncreasing() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.editButton,2000);
        createPromoCode.selectProperty(prop.getProperty("Property4ForPromoCode"));
        promoCodeList.clickButton(CreatePromoCode.savePromoCodeButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(3000,PromoCodeList.latestPromoCodePropertiesCount,"3"));


    }
    @Test(priority = 97)//Done
    @TestParameters(testCaseId = {"TC-97"})
    public void tc_97_checkWhenAPropertyIsReplaced() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.editButton,2000);
        createPromoCode.removeAProperty(prop.getProperty("Property4ForPromoCode"));
        createPromoCode.selectProperty(prop.getProperty("Property5ForPromoCode"));
        promoCodeList.clickButton(CreatePromoCode.savePromoCodeButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(3000,PromoCodeList.latestPromoCodePropertiesCount,"3"));


    }

    @Test(priority = 103)//Done
    @TestParameters(testCaseId = {"TC-103"})
    public void tc_103_checkAdvancedFilterAppliedOnProperty() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        FeeStructureList list = new FeeStructureList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property3ForPromoCode"));
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag1,prop.getProperty("Property3ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Code",0));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Code Details",1));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Start Date",2));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Expiry Date",3));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Status",4));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Properties linked",5));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Chargers",6));
        Assert.assertTrue(list.verifyActionColumnOccupiedWithEditButton("Action",7));


    }

    @Test(priority = 106)//Done
    @TestParameters(testCaseId = {"TC-106"})
    public void tc_106_checkStartEndDateFilterInTheList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        String date1 = createPromoCode.generateDate(-7);
        String date2 = createPromoCode.generateDate(3);
        String startDate = "Start Date - "+createPromoCode.generateDate(-7);
        String expiryDate = "End Date - "+createPromoCode.generateDate(3);
        /*loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        promoCodeList.clickOnClearAllTagIfItIsVisible();
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,-7);
        createPromoCode.selectDateForExpiryDate(3);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag1,startDate));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag2,expiryDate));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        Assert.assertTrue(promoCodeList.verifyDataIsShowingAccordingToSpecifiedDateRange("Start Date",2,date1,date2));
        Assert.assertTrue(promoCodeList.verifyDataIsShowingAccordingToSpecifiedDateRange("Expiry Date",3,date1,date2));

    }

    @Test(priority = 110)//Done
    @TestParameters(testCaseId = {"TC-110"})
    public void tc_110_checkActiveStatusFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        promoCodeList.clickOnClearAllTagIfItIsVisible();
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        promoCodeList.clickButton(PromoCodeList.activePromoCodeRadioButton,1500);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(4000,PromoCodeList.tag1,promoCodeList.activeTag()));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(500,PromoCodeList.tag2));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        Assert.assertTrue(promoCodeList.verifySearchDataIsShowingCorrectly("Promo Status",4,"Active"));

    }

    @Test(priority = 113)//Done
    @TestParameters(testCaseId = {"TC-113"})
    public void tc_113_checkExpiredStatusFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        promoCodeList.clickOnClearAllTagIfItIsVisible();
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        promoCodeList.clickButton(PromoCodeList.expiredPromoCodeRadioButton,1500);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag1,promoCodeList.expiredTag()));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(500,PromoCodeList.tag2));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        Assert.assertTrue(promoCodeList.verifySearchDataIsShowingCorrectly("Promo Status",4,"Expired"));

    }

    @Test(priority = 116)//Done
    @TestParameters(testCaseId = {"TC-116"})
    public void tc_116_checkInactiveStatusFilter() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        /*promoCodeList.clickOnClearAllTagIfItIsVisible();*/
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        promoCodeList.clickButton(PromoCodeList.inactivePromoCodeRadioButton,1500);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag1,promoCodeList.inactiveTag()));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(500,PromoCodeList.tag2));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        Assert.assertTrue(promoCodeList.verifySearchDataIsShowingCorrectly("Promo Status",4,"Inactive"));

    }


    @Test(priority = 119)//Done
    @TestParameters(testCaseId = {"TC-119"})
    public void tc_119_checkAdvancedFilterAppliedOnMultipleProperties() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        FeeStructureList list = new FeeStructureList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("PropertyForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property2ForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property3ForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property4ForPromoCode"));
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.tag1,prop.getProperty("PropertyForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag2,prop.getProperty("Property2ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag3,prop.getProperty("Property3ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag4,prop.getProperty("Property4ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Code",0));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Code Details",1));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Start Date",2));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Expiry Date",3));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Promo Status",4));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Properties linked",5));
        Assert.assertTrue(promoCodeList.verifyExpectedTitleColumnNotRemainedBlank("Chargers",6));
        Assert.assertTrue(list.verifyActionColumnOccupiedWithEditButton("Action",7));


    }


    @Test(priority = 121)//Done
    @TestParameters(testCaseId = {"TC-121"})
    public void tc_121_checkAdvancedFilterOnMultiplePropertiesAndDateRange() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        String date1 = createPromoCode.generateDate(-6);
        String date2 = createPromoCode.generateDate(1);
        String startDate = "Start Date - "+createPromoCode.generateDate(-6);
        String expiryDate = "End Date - "+createPromoCode.generateDate(1);
        loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("PropertyForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property2ForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property3ForPromoCode"));
        promoCodeList.click(PromoCodeList.drawerTitle);
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,-6);
        createPromoCode.selectDateForExpiryDate(1);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag1,startDate));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag2,expiryDate));
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.tag3,prop.getProperty("PropertyForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag4,prop.getProperty("Property2ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag5,prop.getProperty("Property3ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        Assert.assertTrue(promoCodeList.verifyDataIsShowingAccordingToSpecifiedDateRange("Start Date",2,date1,date2));
        Assert.assertTrue(promoCodeList.verifyDataIsShowingAccordingToSpecifiedDateRange("Expiry Date",3,date1,date2));



    }

    @Test(priority = 123)//Done
    @TestParameters(testCaseId = {"TC-123"})
    public void tc_123_checkAdvancedFilterOnMultiplePropertiesDateRangeActiveStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        String date1 = createPromoCode.generateDate(-5);
        String date2 = createPromoCode.generateDate(0);
        String startDate = "Start Date - "+createPromoCode.generateDate(-5);
        String expiryDate = "End Date - "+createPromoCode.generateDate(0);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("PropertyForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property2ForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property3ForPromoCode"));
        promoCodeList.click(PromoCodeList.drawerTitle);
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,-5);
        createPromoCode.selectDateForExpiryDate(0);
        promoCodeList.clickButton(PromoCodeList.activePromoCodeRadioButton,1000);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag1,startDate));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag2,expiryDate));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag3,promoCodeList.activeTag()));
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.tag4,prop.getProperty("PropertyForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag5,prop.getProperty("Property2ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag6,prop.getProperty("Property3ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        Assert.assertTrue(promoCodeList.verifyDataIsShowingAccordingToSpecifiedDateRange("Start Date",2,date1,date2));
        Assert.assertTrue(promoCodeList.verifyDataIsShowingAccordingToSpecifiedDateRange("Expiry Date",3,date1,date2));
        Assert.assertTrue(promoCodeList.verifySearchDataIsShowingCorrectly("Promo Status",4,"Active"));


    }


    @Test(priority = 125)//Done
    @TestParameters(testCaseId = {"TC-125"})
    public void tc_125_checkAdvancedFilterOnMultiplePropertiesDateRangeInactiveStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        String date1 = createPromoCode.generateDate(-4);
        String date2 = createPromoCode.generateDate(0);
        String startDate = "Start Date - "+createPromoCode.generateDate(-4);
        String expiryDate = "End Date - "+createPromoCode.generateDate(0);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("PropertyForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property2ForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property3ForPromoCode"));
        promoCodeList.click(PromoCodeList.drawerTitle);
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,-4);
        createPromoCode.selectDateForExpiryDate(0);
        promoCodeList.clickButton(PromoCodeList.inactivePromoCodeRadioButton,1000);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag1,startDate));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag2,expiryDate));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag3,promoCodeList.inactiveTag()));
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.tag4,prop.getProperty("PropertyForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag5,prop.getProperty("Property2ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag6,prop.getProperty("Property3ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        Assert.assertTrue(promoCodeList.verifyDataIsShowingAccordingToSpecifiedDateRange("Start Date",2,date1,date2));
        Assert.assertTrue(promoCodeList.verifyDataIsShowingAccordingToSpecifiedDateRange("Expiry Date",3,date1,date2));
        Assert.assertTrue(promoCodeList.verifySearchDataIsShowingCorrectly("Promo Status",4,"Inactive"));


    }

    @Test(priority = 127)//Done
    @TestParameters(testCaseId = {"TC-127"})
    public void tc_127_checkAdvancedFilterOnMultiplePropertiesDateRangeExpiredStatus() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        String date1 = createPromoCode.generateDate(-3);
        String date2 = createPromoCode.generateDate(1);
        String startDate = "Start Date - "+createPromoCode.generateDate(-3);
        String expiryDate = "End Date - "+createPromoCode.generateDate(1);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property2ForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property3ForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property4ForPromoCode"));
        promoCodeList.click(PromoCodeList.drawerTitle);
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,-3);
        createPromoCode.selectDateForExpiryDate(1);
        promoCodeList.clickButton(PromoCodeList.expiredPromoCodeRadioButton,1000);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag1,startDate));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag2,expiryDate));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag3,promoCodeList.expiredTag()));
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.tag4,prop.getProperty("Property2ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag5,prop.getProperty("Property3ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(1500,PromoCodeList.tag6,prop.getProperty("Property4ForPromoCode")));
        Assert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        Assert.assertTrue(promoCodeList.verifyDataIsShowingAccordingToSpecifiedDateRange("Start Date",2,date1,date2));
        Assert.assertTrue(promoCodeList.verifyDataIsShowingAccordingToSpecifiedDateRange("Expiry Date",3,date1,date2));
        Assert.assertTrue(promoCodeList.verifySearchDataIsShowingCorrectly("Promo Status",4,"Expired"));


    }



    @Test(priority = 129)//Done
    @TestParameters(testCaseId = {"TC-129"})
    public void tc_129_checkWhenPromoCodesFilteredByDateRangeAfterSearchingPromoCode() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        String date1 = promoCodeList.formatDate("2024-01-26");
        String date2 = createPromoCode.generateDate(0);
        String startDate = "Start Date - "+date1;
        String expiryDate = "End Date - "+createPromoCode.generateDate(0);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.searchAPromoCode(prop.getProperty("PartiallySearchedPromoCodeTest"));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,4000);
        createPromoCode.selectMonthAndDate(CreatePromoCode.promoStartDateField,CreatePromoCode.monthInDatePicker,"Jan","2024-01-26");
        createPromoCode.selectDate(CreatePromoCode.promoExpiryDateField,0);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        softAssert.assertTrue(promoCodeList.verifySearchFieldData(PromoCodeList.editButton,PromoCodeList.searchPromoCodeField,prop.getProperty("PartiallySearchedPromoCodeTest")));
        softAssert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.tag1,startDate));
        softAssert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.tag2,expiryDate));
        softAssert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        softAssert.assertTrue(promoCodeList.verifyPartiallySearchData("Promo Code",0,prop.getProperty("PartiallySearchedPromoCodeTest")));
        softAssert.assertTrue(promoCodeList.verifyDataIsShowingAccordingToSpecifiedDateRange("Start Date",2,date1,date2));
        softAssert.assertTrue(promoCodeList.verifyDataIsShowingAccordingToSpecifiedDateRange("Expiry Date",3,date1,date2));
        softAssert.assertAll();


    }


    @Test(priority = 131)//Done
    @TestParameters(testCaseId = {"TC-131"})
    public void tc_131_checkWhenPromoCodesFilteredByActiveStatusAfterSearchingPromoCode() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.searchAPromoCode(prop.getProperty("PartiallySearchedPromoCodeTest2"));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,4000);
        promoCodeList.clickButton(PromoCodeList.activePromoCodeRadioButton,1000);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        softAssert.assertTrue(promoCodeList.verifySearchFieldData(PromoCodeList.editButton,PromoCodeList.searchPromoCodeField,prop.getProperty("PartiallySearchedPromoCodeTest2")));
        softAssert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.tag1, promoCodeList.activeTag()));
        softAssert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        softAssert.assertTrue(promoCodeList.verifyPartiallySearchData("Promo Code",0,prop.getProperty("PartiallySearchedPromoCodeTest2")));
        softAssert.assertTrue(promoCodeList.verifySearchDataIsShowingCorrectly("Promo Status",4,"Active"));
        softAssert.assertAll();


    }

    @Test(priority = 133)//Done
    @TestParameters(testCaseId = {"TC-133"})
    public void tc_133_checkWhenPromoCodesFilteredByExpiredStatusAfterSearchingPromoCode() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.searchAPromoCode(prop.getProperty("PartiallySearchedPromoCodeTest2"));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,3000);
        promoCodeList.clickButton(PromoCodeList.expiredPromoCodeRadioButton,1000);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        softAssert.assertTrue(promoCodeList.verifySearchFieldData(PromoCodeList.editButton,PromoCodeList.searchPromoCodeField,prop.getProperty("PartiallySearchedPromoCodeTest2")));
        softAssert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.tag1,promoCodeList.expiredTag()));
        softAssert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        softAssert.assertTrue(promoCodeList.verifyPartiallySearchData("Promo Code",0,prop.getProperty("PartiallySearchedPromoCodeTest2")));
        softAssert.assertTrue(promoCodeList.verifySearchDataIsShowingCorrectly("Promo Status",4,"Expired"));
        softAssert.assertAll();


    }

    @Test(priority = 135)//Done
    @TestParameters(testCaseId = {"TC-135"})
    public void tc_135_checkWhenPromoCodesFilteredByInactiveStatusAfterSearchingPromoCode() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.searchAPromoCode(prop.getProperty("PartiallySearchedPromoCodeTest2"));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,3000);
        promoCodeList.clickButton(PromoCodeList.inactivePromoCodeRadioButton,1000);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        softAssert.assertTrue(promoCodeList.verifySearchFieldData(PromoCodeList.editButton,PromoCodeList.searchPromoCodeField,prop.getProperty("PartiallySearchedPromoCodeTest2")));
        softAssert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.tag1,promoCodeList.inactiveTag()));
        softAssert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        softAssert.assertTrue(promoCodeList.verifyPartiallySearchData("Promo Code",0,prop.getProperty("PartiallySearchedPromoCodeTest2")));
        softAssert.assertTrue(promoCodeList.verifySearchDataIsShowingCorrectly("Promo Status",4,"Inactive"));
        softAssert.assertAll();


    }

    @Test(priority = 137)//Done
    @TestParameters(testCaseId = {"TC-137"})
    public void tc_137_checkWhenPromoCodesFilteredByPropertyAfterSearchingPromoCode() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.searchAPromoCode(prop.getProperty("PartiallySearchedPromoCodeTest2"));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,3000);
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property3ForPromoCode"));
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        softAssert.assertTrue(promoCodeList.verifySearchFieldData(PromoCodeList.editButton,PromoCodeList.searchPromoCodeField,prop.getProperty("PartiallySearchedPromoCodeTest2")));
        softAssert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.tag1,prop.getProperty("Property3ForPromoCode")));
        softAssert.assertTrue(promoCodeList.verifyTextMatching(500,PromoCodeList.clearAll,"Clear All"));
        softAssert.assertAll();


    }



    @Test(priority = 139)//Done
    @TestParameters(testCaseId = {"TC-139"})
    public void tc_139_checkWhenClearAllTagIsClicked() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        /*promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        promoCodeList.refreshBrowser();
        promoCodeList.clickButton(PromoCodeList.clearAll,2000);
        Assert.assertTrue(promoCodeList.verifyAnElementDisplayedOrNot(100,PromoCodeList.spinner));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(1000,PromoCodeList.tag1));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(1000,PromoCodeList.tag2));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(1000,PromoCodeList.clearAll));


    }


    @Test(priority = 140)//Done
    @TestParameters(testCaseId = {"TC-140"})
    public void tc_140_checkAdvanceFilterDrawerIsEmptyAfterClickOnClearAllTag() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        /*promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        Assert.assertTrue(promoCodeList.verifyFieldValueIsEmpty(2000,PromoCodeList.propertyFieldToTypeInFilter));
        Assert.assertTrue(promoCodeList.verifyFieldValueIsEmpty(500,CreatePromoCode.promoStartDateField));
        Assert.assertTrue(promoCodeList.verifyFieldValueIsEmpty(500,CreatePromoCode.promoExpiryDateField));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(500,PromoCodeList.radioButtonChecked));


    }

    @Test(priority = 141)//Done
    @TestParameters(testCaseId = {"TC-141"})
    public void tc_141_checkResetAllButtonFunctionality() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("PropertyForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property2ForPromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("Property3ForPromoCode"));
        promoCodeList.click(PromoCodeList.drawerTitle);
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,-5);
        createPromoCode.selectDateForExpiryDate(0);
        promoCodeList.clickButton(PromoCodeList.activePromoCodeRadioButton,1000);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        promoCodeList.clickButton(PromoCodeList.resetAll,2000);
        Assert.assertTrue(promoCodeList.verifyAnElementDisplayedOrNot(100,PromoCodeList.spinner));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(1000,PromoCodeList.drawerTitle));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(1000,PromoCodeList.tag1));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(1000,PromoCodeList.tag2));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(1000,PromoCodeList.clearAll));


    }

    @Test(priority = 142)//Done
    @TestParameters(testCaseId = {"TC-142"})
    public void tc_142_checkResetAllButtonEffectOnFilterDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        /*promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,4000);
        Assert.assertTrue(promoCodeList.verifyFieldValueIsEmpty(2000,PromoCodeList.propertyFieldToTypeInFilter));
        Assert.assertTrue(promoCodeList.verifyFieldValueIsEmpty(500,CreatePromoCode.promoStartDateField));
        Assert.assertTrue(promoCodeList.verifyFieldValueIsEmpty(500,CreatePromoCode.promoExpiryDateField));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(500,PromoCodeList.radioButtonChecked));



    }

    @Test(priority = 143)//Done
    @TestParameters(testCaseId = {"TC-143"})
    public void tc_143_checkCrossIconFunctionalityInTag() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        loginPage.verifyValidLogin();
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,2000);
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("PropertyForPromoCode"));
        promoCodeList.click(PromoCodeList.drawerTitle);
        promoCodeList.clickButton(PromoCodeList.expiredPromoCodeRadioButton,1000);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        promoCodeList.clickButton(PromoCodeList.crossIconInTag,2000);
        promoCodeList.clickButton(PromoCodeList.crossIconInTag2,2000);
        Assert.assertTrue(promoCodeList.verifyAnElementDisplayedOrNot(100,PromoCodeList.spinner));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(1000,PromoCodeList.drawerTitle));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(1000,PromoCodeList.tag1));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(1000,PromoCodeList.clearAll));


    }

    @Test(priority = 144)//Done
    @TestParameters(testCaseId = {"TC-144"})
    public void tc_144_checkEffectOnFilterDrawerAfterCrossInTagClicked() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        /*promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));*/
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,4000);
        Assert.assertTrue(promoCodeList.verifyFieldValueIsEmpty(2000,PromoCodeList.propertyFieldToTypeInFilter));
        Assert.assertTrue(promoCodeList.verifyElementNotDisplayed(500,PromoCodeList.radioButtonChecked));

    }

    @Test(priority = 145)//Done
    @TestParameters(testCaseId = {"TC-145"})
    public void tc_145_checkFilterForNoPromoCodes() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,4000);
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("PropertyDoEsNotHavePromoCode"));
        promoCodeList.selectAPropertyInAdvanceFilter(prop.getProperty("PropertyDoEsNotHavePromoCode2"));
        promoCodeList.click(PromoCodeList.drawerTitle);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.noDataTable,promoCodeList.noDataFound()));

    }

    @Test(priority = 146)//Done
    @TestParameters(testCaseId = {"TC-146"})
    public void tc_146_checkFilterIsAppliedWhereStartDateIsAheadOfEndDate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.addAdvanceFilter,4000);
        createPromoCode.selectDate(CreatePromoCode.promoStartDateField,2);
        createPromoCode.selectDateForExpiryDate(0);
        promoCodeList.click(PromoCodeList.drawerTitle);
        promoCodeList.clickButton(PromoCodeList.applyButton,1500);
        Assert.assertTrue(promoCodeList.verifyTextMatching(2000,PromoCodeList.noDataTable,promoCodeList.noDataFound()));

    }


    @Test(priority = 149)//Done
    @TestParameters(testCaseId = {"TC-149"})
    public void tc_149_checkLabelsOfTheEditPromoDrawer() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        promoCodeList.clickButton(PromoCodeList.editButton,4000);
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

    @Test(priority = 153)//Done
    @TestParameters(testCaseId = {"TC-153"})
    public void tc_153_checkAllTheFieldsInTheEditPromoCodeDrawer() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();*/
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.promoCodeField));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.promoRulesField));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.promoStartDateField));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.promoExpiryDateField));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.reuseLimitPerPersonField));
    }

    @Test(priority = 154)//Done
    @TestParameters(testCaseId = {"TC-154"})
    public void tc_154_checkTextUnderReuseLimitPerPersonFieldInTheEditPromoCodeDrawer() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();
        dashboard.clickOnAccessCodeFromLeftMenuBar();
        createPromoCode.clickOnCreateNewCompanyButton();*/
        Assert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.textUnderReuseLimitField,createPromoCode.textUnderReuseLimitField()));
    }

    @Test(priority = 155)//Done
    @TestParameters(testCaseId = {"TC-155"})
    public void tc_155_checkAddOnOfReuseLimitInTheEditPromoCodeDrawer() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();*/
        Assert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.reuseLimitAddOn,"Times"));
    }

    @Test(priority = 158)//Done
    @TestParameters(testCaseId = {"TC-158"})
    public void tc_158_checkAllTheButtonsInEditPromoCodeDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();*/
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(500,CreatePromoCode.savePromoCodeButton));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(200,PromoCodeList.cancelButton));
        Assert.assertTrue(createPromoCode.verifyAnElementDisplayedOrNot(200,CreatePromoCode.crossButton));
    }
    @Test(priority = 159)//Done
    @TestParameters(testCaseId = {"TC-159"})
    public void tc_159_checkDisabledArrowsWhenNoPropertiesAreSelectedInEditPromoCodeDrawer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        /*loginPage.verifyValidLogin();*/
        Assert.assertTrue(createPromoCode.verifyAFieldIsDisable(500,CreatePromoCode.assignedPropertyArrow));
        Assert.assertTrue(createPromoCode.verifyAFieldIsDisable(500,CreatePromoCode.unassignedPropertyArrow));

    }

    @Test(priority = 160)//Done
    @TestParameters(testCaseId = {"TC-160"})
    public void tc_160_checkRequiredValidationInEditPromoCodeDrawer() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard=new Dashboard(driver);
        CreatePromoCode createPromoCode = new CreatePromoCode(driver);
        PromoCodeList promoCodeList = new PromoCodeList(driver);
        /*loginPage.verifyValidLogin();*/
        promoCodeList.goToWebsite(promoCodeList.urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        createPromoCode.createAPromoCodeWithoutOptionalField();
        promoCodeList.clickButton(PromoCodeList.editButton,4000);
        promoCodeList.fieldClear(CreatePromoCode.promoCodeField);
        promoCodeList.fieldClear(CreatePromoCode.promoRulesField);
        promoCodeList.hoverOverAnIconThenClick(CreatePromoCode.promoStartDateField,CreatePromoCode.calenderBoxOfStartDateField,CreatePromoCode.crossIconOfStartDateField);
        promoCodeList.hoverOverAnIconThenClick(CreatePromoCode.promoStartDateField,CreatePromoCode.calenderBoxOfExpiryDateField,CreatePromoCode.crossIconOfExpiryDateField);
        promoCodeList.fieldClear(CreatePromoCode.reuseLimitPerPersonField);
        createPromoCode.removeAProperty("Temporary Property 20");
        createPromoCode.clickButton(CreatePromoCode.savePromoCodeButton,2000);
        softAssert.assertTrue(createPromoCode.verifyTextMatching(1000,CreatePromoCode.validationMsgForField1,createPromoCode.requiredMsgForPromoCode()));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.validationMsgForField2,createPromoCode.requiredMsgForPromoRules()));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.validationMsgForField3,createPromoCode.requiredMsgForStartDate()));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.validationMsgForField4,createPromoCode.requiredMsgForExpiryDate()));
        softAssert.assertTrue(createPromoCode.verifyTextMatching(500,CreatePromoCode.validationMsgForPropertySelection,createPromoCode.requiredMsgForProperty()));
        softAssert.assertAll();



    }












































}
