package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class CreatePromoCode extends BasePage{
    public CreatePromoCode(WebDriver driver){
        super(driver);
    }
    Properties prop = ConfigUtill.getConfig();


    public static By drawerTitle = By.xpath("//span[@class='drawerTitle']");
    public static By promoInformationLabel = By.xpath("//span[@class='drawerInsideTitle']");
    public static By propertyInformationLabel = By.xpath("(//span[@class='drawerInsideTitle'])[2]");
    public static By promoCodeLabel = By.xpath("//div[@class='text-14 weight-500 location-long-la mb-4']");
    public static By promoRulesLabel = By.xpath("(//div[@class='text-14 weight-500 location-long-la mb-4'])[2]");
    public static By promoStartDateLabel = By.xpath("(//div[@class='text-14 weight-500 location-long-la mb-4'])[3]");
    public static By promoExpiryDateLabel = By.xpath("(//div[@class='text-14 weight-500 location-long-la mb-4'])[4]");
    public static By reuseLimitPerPersonLabel = By.xpath("(//div[@class='text-14 weight-500 location-long-la mb-4'])[5]");
    public static By assignPropertyLabel = By.xpath("(//div[@class='text-14 weight-500 location-long-la mb-4'])[6]");
    public static By promoCodeField = By.xpath("//input[@placeholder='Promo Code']");
    public static By promoRulesField = By.xpath("//input[@placeholder='Promo Rules']");
    public static By promoStartDateField = By.xpath("//input[@placeholder='Select date']");
    public static By promoExpiryDateField = By.xpath("(//input[@placeholder='Select date'])[2]");
    public static By reuseLimitPerPersonField = By.xpath("//input[@placeholder='Reuse Limit Per Person']");
    public static By textUnderReuseLimitField = By.xpath("//p[@class='optional-color mt-4 mb-0']");
    public static By savePromoCodeButton = By.xpath("//button[@type='button']//span[contains(text(),'Save Promo Code')]");
    public static By saveAndCreateAnotherPromoCodeButton = By.xpath("//button[@type='button']//span[contains(text(),'Save & Create Another Promo Code')]");
    public static By assignedPropertyArrow = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm ant-btn-icon-only']");
    public static By unassignedPropertyArrow = By.xpath("(//button[@class='ant-btn ant-btn-primary ant-btn-sm ant-btn-icon-only'])[2]");
    public static By banasreePoliceParkProperty = By.xpath("//span[@class='ant-transfer-list-content-item-text'][contains(text(),'Banasree police park')]");
    public static By successfullyCreatedPopUp = By.xpath("//span[contains(text(),'Promo Code created successfully')]");
    public static By validationPopUpOfAlreadyActivePopUp = By.xpath("//span[contains(text(),'Promo already active for these date ranges')]");

}
