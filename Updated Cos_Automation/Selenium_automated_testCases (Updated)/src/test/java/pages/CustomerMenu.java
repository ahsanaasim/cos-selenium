package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerMenu extends BasePage{
    public CustomerMenu(WebDriver driver) {
        super(driver);
    }

    public static By ChargingHistoryFromMenu = By.xpath("//a[@href='/customer/charging-history']");
    public static By FavoriteFromMenu = By.xpath("//a[@href='/customer/favorite']");
    public static By FavoriteIconFromMenu = By.xpath("//img[@src='/menu-icons/favorite.svg']");
}
