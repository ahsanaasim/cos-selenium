package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IdlePage extends BasePage{
    public IdlePage(WebDriver driver) {
        super(driver);
    }

    public static By IdlePageTitle = By.xpath("(//div[@class='idlePageTitle'][contains(text(),'Idle Time')])[2]");
    public static By ChargerConnected = By.xpath("//span[normalize-space()='CHARGER CONNECTED']");
    public static By IdleTiming = By.xpath("//div[@class='billingTimeText']");
    public static By IdleFeeForThatLocation = By.xpath("//div[@class='idleWarningText m-auto-0']");
    public static By StopChargingText = By.xpath("//div[@class='stopChargingWarningMessage']");
    public static By pressAndHoldButton = By.xpath("//button[@class='ant-btn ant-btn-round ant-btn-default ant-btn-lg swipe-button']");
}
