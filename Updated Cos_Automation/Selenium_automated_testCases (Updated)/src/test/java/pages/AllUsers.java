package pages;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class AllUsers extends BasePage{

    public AllUsers(WebDriver driver) {

        super(driver);
    }

    Properties prop = ConfigUtill.getConfig();

    public void GoToAllUsersPage() throws InterruptedException {
        Thread.sleep(3000);
        GoToWebsite(prop.getProperty("AllUsersPageURL"));

    }

}
