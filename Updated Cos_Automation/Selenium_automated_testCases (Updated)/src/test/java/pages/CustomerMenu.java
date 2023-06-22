package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerMenu extends BasePage{
    public CustomerMenu(WebDriver driver) {
        super(driver);
    }

    public static By ChargingHistoryFromMenu = By.xpath("//a[@href='/customer/charging-history']");
    public static By FavoriteFromMenu = By.xpath("(//a[@href='/customer/favorites'])[2]");
    public static By FavoriteIconFromMenu = By.xpath("//img[@src='/menu-icons/favorite.svg']");
    public static By COSAFromMenu = By.xpath("//div[@class='cosaDiv']");
    public static By COSALOGOFromMenu = By.xpath("//img[@src='/images/cosaLogo.svg']");
}
