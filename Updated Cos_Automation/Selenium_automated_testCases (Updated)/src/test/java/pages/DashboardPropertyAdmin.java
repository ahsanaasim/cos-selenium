package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Properties;

public class DashboardPropertyAdmin extends BasePage{
    public DashboardPropertyAdmin(WebDriver driver)
    {
        super(driver);

    }
    Properties prop = ConfigUtill.getConfig();

    By customers = By.xpath("//span[@class='ant-menu-title-content'][contains(.,'Customers')]");
    By GroupManagement = By.xpath("//span[@class='ant-menu-title-content']//a[normalize-space()='Group Management']");
    By AllCustomers = By.xpath("//span[@class='ant-menu-title-content']//a[normalize-space()='All Customers']");
    By ChargerAccess = By.xpath("//span[@class='ant-menu-title-content']//a[normalize-space()='Charger Access']");





    public boolean GotoDashboard () throws InterruptedException {
        Thread.sleep(3000);
        driver.get(prop.getProperty("DashboardURLPropertyAdmin"));
        urlCheck(prop.getProperty("DashboardURLPropertyAdmin"));
        return true;

    }
    public boolean clickonCustomersFromLeftMenu () {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //   Createcompany.waitForSpinner();
        waitVisibility(customers);
        waitelemtclickable(customers);
        click(customers);
        return true;
    }

    public boolean clickonGroupManagement () throws InterruptedException {
        Thread.sleep(1500);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //  Createcompany.waitForSpinner();
        waitelementtobedisplayed(GroupManagement);
        waitelemtclickable(GroupManagement);
        click(GroupManagement);
        return true;
    }
    public boolean clickonAllCustomers() throws InterruptedException {
        Thread.sleep(1500);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //  Createcompany.waitForSpinner();
        waitelementtobedisplayed(AllCustomers);
        waitelemtclickable(AllCustomers);
        click(AllCustomers);
        return true;
    }

    public boolean clickonChargerAccess() throws InterruptedException {
        Thread.sleep(1500);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //  Createcompany.waitForSpinner();
        waitelementtobedisplayed(ChargerAccess);
        waitelemtclickable(ChargerAccess);
        click(ChargerAccess);
        return true;
    }

    public void GoToCompanyPanelLoginPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.get(prop.getProperty("HomeURLPropertyAdmin"));
    }
}
