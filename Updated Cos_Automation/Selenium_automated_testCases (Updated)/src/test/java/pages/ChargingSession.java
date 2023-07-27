package pages;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ChargingSession extends BasePage{
    public ChargingSession(WebDriver driver)  {
        super(driver);
    }


    Properties prop = ConfigUtill.getConfig();
    RandomData rdata = new RandomData();


    public void GoToChargingSessionPage() throws InterruptedException {
        Thread.sleep(3500);
        GoToWebsite(prop.getProperty("ChargingSessionReportPageURL"));

    }
}
