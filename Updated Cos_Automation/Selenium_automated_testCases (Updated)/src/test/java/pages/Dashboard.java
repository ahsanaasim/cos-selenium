package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Properties;

public class Dashboard extends BasePage {

    public Dashboard(WebDriver driver)
    {
        super(driver);
    }

    Properties prop = ConfigUtill.getConfig();


    public static By loginMsg = By.xpath("//span[contains(.,'Login Successful')]");
    public static By dropdown = By.xpath("//span[@class='anticon anticon-user']//*[name()='svg']");
    public static By logout = By.xpath("//div[@class='flex flex-center-v'][contains(.,'Logout')]");
    public static By company = By.xpath("(//span[contains(.,'Company')])[1]");
    public static By cManagementText = By.xpath("//a[@href='/company/company-management']");
    public static By entityManagement = By.xpath("//a[@href='/company/entity-management']");
    public static By locations = By.xpath("//a[@href='/property/location']");
    public static By properties = By.xpath("//span[@class='ant-menu-title-content'][contains(.,'Properties')]");
    public static By property = By.xpath("//span[@class='ant-menu-title-content']//a[normalize-space()='Property']");
    //    By dashboard = By.xpath("(//li[@role='menuitem'])[1]");
    public static By dashboard = By.xpath("//span[@class='ant-menu-title-content']//a[@href='/dashboard']");
    public static By PropertyFilterField = By.xpath("//div[@class='ant-select-selection-overflow']");
    public static By StardewValleyPropertyFromOption = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Stardew Valley')]");
    public static By AutomationPropertyFromOption = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Automation Property')]");


    public boolean clickOnDropdownArrow() {
        waitVisibility(dropdown);
        click(dropdown);
        return true;
    }

    public boolean clickOnLogout() {
        waitVisibility(logout);
        click(logout);
        return true;
    }

    public boolean clickOnCompanyFromLeftMenuBar() throws InterruptedException {
        /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));*/
        waitForFewMoment(2000);
        click(company);
        return true;
    }

    public boolean clickOnProperty() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(property);
        waitelemtclickable(property);
        click(property);
        return true;
    }

    public boolean clickOnCompanyManagement() {
        waitVisibility(cManagementText);
        waitelemtclickable(cManagementText);
        click(cManagementText);
        return true;
    }

    public boolean clickOnEntityManagement() throws InterruptedException {
        Thread.sleep(1500);
        waitVisibility(entityManagement);
        waitelemtclickable(entityManagement);
        click(entityManagement);
        return true;
    }

    public boolean clickOnPropertiesFromLeftMenu() {
        waitVisibility(properties);
        waitelemtclickable(properties);
        click(properties);
        return true;
    }

    public boolean clickonLocations () throws InterruptedException {
        //   Createcompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       /* waitVisibility(locations);
        waitelementtobedisplayed(locations);
      //  waitelemtclickable(locations);
        click(locations);*/
        driver.get(prop.getProperty("LocationpageURL"));
        urlCheck(prop.getProperty("LocationpageURL"));
        return true;
    }

    public boolean clickOnLocationsPropertyAdmin() throws InterruptedException {
        //   Createcompany.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       /* waitVisibility(locations);
        waitelementtobedisplayed(locations);
      //  waitelemtclickable(locations);
        click(locations);*/
        driver.get(prop.getProperty("LocationpageURLPropertyAdmin"));
        urlCheck(prop.getProperty("LocationpageURLPropertyAdmin"));
        return true;
    }
    public boolean clickOnChargers() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(prop.getProperty("ChrgerpageURL"));
        urlCheck(prop.getProperty("ChrgerpageURL"));
        return true;
    }

    public boolean clickOnChargersPropertyAdmin() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(prop.getProperty("ChargerpageURLForPropertyAdmin"));
        urlCheck(prop.getProperty("ChargerpageURLForPropertyAdmin"));
        return true;
    }

    public boolean refreshBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().refresh();
        return true;
    }

    public boolean gotoDashboard() throws InterruptedException {
        Thread.sleep(3000);
        driver.get(prop.getProperty("DashboardURL"));
        urlCheck(prop.getProperty("DashboardURL"));
        return true;

    }


    public boolean verifyUserHasLogoutFromTheSystem() {
        urlCheck(prop.getProperty("LoginURL"));
        return true;
    }

    public boolean verifyLoginMessage(String expectedText) {
        try {
            //waitelementtobedisplayed(loginmsg);
            waitVisibility(loginMsg);
            assertEquals(loginMsg, expectedText);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void goToCosAdminLoginPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.get(prop.getProperty("HomeURL"));
    }



}