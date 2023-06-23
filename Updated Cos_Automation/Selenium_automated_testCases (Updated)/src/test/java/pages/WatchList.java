package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WatchList extends BasePage{
    public WatchList(WebDriver driver){
        super(driver);
    }

    public static By WatchListTitle = By.xpath("//div[@class='mainTitle']");
    public static By WatchListContainer = By.xpath("//div[@class='watchlist-container']");
}
