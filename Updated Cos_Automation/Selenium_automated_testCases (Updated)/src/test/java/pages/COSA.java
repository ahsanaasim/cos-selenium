package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.security.PublicKey;

public class COSA extends BasePage{
    public COSA(WebDriver driver)  {
        super(driver);
    }


    public static By COSALOGOInChatBot = By.xpath("//img[@src='/images/cos-icon-no-bg-green.svg']");
    public static By COSAFirstMsg = By.xpath("//div[@class='cosaBubble']");
    public static By COSASecondMsg = By.xpath("(//div[@class='cosaBubble'])[2]");
    public static By KeepAnEyeOnSomeLocations = By.xpath("//div[@class='options'][contains(text(),'Keep an eye on some locations')]");
    public static By ShowMeWatchList = By.xpath("//a[@href='/customer/cosa/watchlist']");
    public static By ReportAProblem = By.xpath("//a[@href='/customer/customer-support/create-ticket']");
    public static By HowDoIUseCharger = By.xpath("//div[@class='options'][contains(text(),'How do I use a charger?'])");
    public static By UserFirstMessage = By.xpath("//div[@class='userBubble']");


    public String COSFirstMsgForTester(){
        return "Hi Tester, I am COSA, your EV Assistant. How can I help you today?";
    }

    public boolean COSAPageURLCheck(String expected) throws InterruptedException {
        Thread.sleep(2500);
        wait.until(ExpectedConditions.urlToBe(expected));
        String currentUrl = driver.getCurrentUrl();
        String expectedURL = expected;
        if (currentUrl.equals(expectedURL)){
            System.out.println("Navigating to COSA Chatbot page");
            return true;
        }
        else {
            System.out.println("System is not navigating to COSA Chatbot page");
            return false;
        }

    }

}
