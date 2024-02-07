package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPromo extends BasePage{
    public EditPromo(WebDriver driver){
        super(driver);
    }

    public static By cancelButton = By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]");
}
