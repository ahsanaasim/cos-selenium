package pages;

import org.openqa.selenium.By;
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
        goToWebsite(prop.getProperty("ChargingSessionReportPageURL"));

    }


    public static By promoCodeAlert = By.xpath("(//div[@class='ant-alert-message'])[2]");
    public static By discountedFeeInFeeBreakdown = By.xpath("(//div[@class='wordBreak feeDetails'])[8]");
    public static By feeBreakdown = By.xpath("//span[@class='underline cursor countDetailsText2'][contains(text(),'Fee Breakdown')]");



    public String promoCodeAlert(){
        return "Promotions and discounts are applied at the completion of your session.";
    }

    public String discountedFeeInBreakdown(String promoCodeAmount){
        return "Discounted fee "+promoCodeAmount;
    }
}
