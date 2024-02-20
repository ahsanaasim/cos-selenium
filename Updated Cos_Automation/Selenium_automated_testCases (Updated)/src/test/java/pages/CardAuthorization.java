package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardAuthorization extends BasePage{
    public CardAuthorization(WebDriver driver){
        super(driver);
    }

    public static  By promoCodeField = By.xpath("(//input[@placeholder='Enter Promo Code'])[2]");
    public static By applyButton = By.xpath("(//button[@type='button']//span[contains(text(),'Apply')])[2]");
}
