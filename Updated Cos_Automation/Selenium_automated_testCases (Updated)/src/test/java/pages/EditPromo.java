package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPromo extends BasePage{
    public EditPromo(WebDriver driver){
        super(driver);
    }

    public static By cancelButton = By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]");
    public static By validationPopUp = By.xpath("//div[@class='ant-message-custom-content ant-message-error']");

    public String expiredPromoCodeValidationPopUp(){
        return "Promo code is expired";
    }

    public String activeUsedValidationPopUp(){
        return "Editing not allowed for active used promo";
    }






}
