package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerProfile extends BasePage{
    public CustomerProfile(WebDriver driver){
        super(driver);
    }

    public static By UpdateProfileButton = By.xpath("//button[@class='ant-btn ant-btn-default update-profile-button']");
    public static By UpdatePhone = By.xpath("//div[@class='update-phone-button']");
}
