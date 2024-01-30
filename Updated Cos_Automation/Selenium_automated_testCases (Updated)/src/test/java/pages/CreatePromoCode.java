package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatePromoCode extends BasePage{
    public CreatePromoCode(WebDriver driver){
        super(driver);
    }

    public static By SuccessfullyCreatedPopUp = By.xpath("//span[contains(text(),'Promo Code created successfully')]");
    public static By ValidationPopUpOfAlreadyActivePopUp = By.xpath("//span[contains(text(),'Promo already active for these date ranges')]");

}
