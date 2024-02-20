package tests.US162Simulation;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.BaseTest;
import tests.US1AdminLogin.TestParameters;

public class OCPPSimulationTestCases extends BaseTest {


    @Test(priority = 1)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_1_CheckAllTheFieldsAndButtonsOnSimulationPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        SimulationPage simulator = new SimulationPage(driver);
        loginPage.verifyValidLogin();
        operation.clickButton(SimulationPage.SimulationTab,2000);
        operation.clickButton(SimulationPage.Simulator,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,SimulationPage.EmptySearchFieldBeforeClicking));
        Assert.assertTrue(simulator.SelectChargerFromSimulator("Automatable charger"));
        Assert.assertTrue(basePage.verifyTextMatching(1500,SimulationPage.ChargerSelectedField,"Automatable Charger"));
    }

    @Test(priority = 2)//Done
    @TestParameters(testCaseId = {"TC-1"})
    public void TC_2_CheckChargerTitleAboveOnSimulationPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        SimulationPage simulator = new SimulationPage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(SimulationPage.SimulationTab,2000);
//        operation.ClickButton(SimulationPage.Simulator,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,SimulationPage.ChargerTitle));
    }

    @Test(priority = 3)//Done
    @TestParameters(testCaseId = {"TC-2"})
    public void TC_3_CheckMakeChargerAvailableButtonOnSimulationPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        SimulationPage simulator = new SimulationPage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(SimulationPage.SimulationTab,2000);
//        operation.ClickButton(SimulationPage.Simulator,2000);
        guestFlow.goToSimulator();
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,SimulationPage.MakeChargerAvailable));

    }

    @Test(priority = 4)//Done
    @TestParameters(testCaseId = {"TC-4"})
    public void TC_4_CheckAllTheFieldsAndButtonsOnSimulationPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        SimulationPage simulator = new SimulationPage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(SimulationPage.SimulationTab,2000);
//        operation.ClickButton(SimulationPage.Simulator,2000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1000,SimulationPage.MakeChargerAvailable));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1000,SimulationPage.PlugInCharger));
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,SimulationPage.FullBoxDisable));
    }

    @Test(priority = 5)//Done
    @TestParameters(testCaseId = {"TC-5"})
    public void TC_5_CheckTheSelectChargerStatusesField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        SimulationPage simulator = new SimulationPage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(SimulationPage.SimulationTab,2000);
//        operation.ClickButton(SimulationPage.Simulator,2000);
        Assert.assertTrue(basePage.verifyAnElementDisplayedOrNot(1000,SimulationPage.SelectChargerStatusField));
    }

    @Test(priority = 6)//Done
    @TestParameters(testCaseId = {"TC-6"})
    public void TC_6_CheckTheMakeChargerAvailableButtonWhenAChargerIsAlreadyAvailable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        SimulationPage simulator = new SimulationPage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(SimulationPage.SimulationTab,2000);
//        operation.ClickButton(SimulationPage.Simulator,2000);
        Assert.assertTrue(simulator.SelectChargerFromSimulator("Newly Added Charger-3918"));
        Assert.assertTrue(basePage.verifyAFieldIsDisable(1000,SimulationPage.MakeChargerAvailable));
    }

    @Test(priority = 7)//Done
    @TestParameters(testCaseId = {"TC-7"})
    public void TC_7_CheckTheBootButtonWhenAChargerIsAvailable() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        SimulationPage simulator = new SimulationPage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(SimulationPage.SimulationTab,2000);
//        operation.ClickButton(SimulationPage.Simulator,2000);
        Assert.assertTrue(basePage.verifyAFieldIsEnable(1000,SimulationPage.BootChargerButton));
    }

    @Test(priority = 8)//Done
    @TestParameters(testCaseId = {"TC-8"})
    public void TC_8_CheckTheMakeChargerAvailableButtonWhenPlugInYourChargerIsClicked() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        SimulationPage simulator = new SimulationPage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(SimulationPage.SimulationTab,2000);
//        operation.ClickButton(SimulationPage.Simulator,2000);
        operation.clickButton(SimulationPage.PlugInCharger,1000);
        Assert.assertTrue(basePage.verifyAFieldIsEnable(2500,SimulationPage.MakeChargerAvailable));
    }
    @Test(priority = 9)//Done
    @TestParameters(testCaseId = {"TC-9"})
    public void TC_9_CheckPlugInYourChargerButtonWhenItIsClicked() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Dashboard dashboard = new Dashboard(driver);
        CreateCharger operation = new CreateCharger(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        BasePage basePage = new BasePage(driver);
        SimulationPage simulator = new SimulationPage(driver);
//        loginPage.VerifyValidLogin();
//        operation.ClickButton(SimulationPage.SimulationTab,2000);
//        operation.ClickButton(SimulationPage.Simulator,2000);
//        operation.ClickButton(SimulationPage.PlugInCharger,1000);
        Assert.assertTrue(basePage.verifyAFieldIsDisable(2000,SimulationPage.PlugInCharger));
    }


}