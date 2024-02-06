package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class PromoCodeList extends BasePage{
    public PromoCodeList(WebDriver driver){
        super(driver);
    }
    Properties prop = ConfigUtill.getConfig();

    public static By createNewPromoCode = By.xpath("//button[@type='button']//span[contains(text(),'Create New Promo')]");
}
