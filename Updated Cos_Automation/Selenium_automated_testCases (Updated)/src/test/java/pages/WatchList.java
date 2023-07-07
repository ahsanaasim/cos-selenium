package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WatchList extends BasePage{
    public WatchList(WebDriver driver){
        super(driver);
    }

    public static By WatchListTitle = By.xpath("//div[@class='mainTitle']");
    public static By WatchListContainer = By.xpath("//div[@class='watchlist-container']");

    public static By LocationName = By.xpath("//div[@class='locationName mt-5']");
    public static By LocationAddress = By.xpath("//div[@class='locationAddress']");
    public static By CrossButton = By.xpath("//span[@class='anticon anticon-close']");
    public static By YesButton = By.xpath("//span[normalize-space()='Yes']");
    public static By NoLocationInWatchlistText = By.xpath("//div[contains(text(),'No locations in watchlist')]");




    public void GoToWatchList() throws InterruptedException {
        Thread.sleep(2500);
        GoToWebsite("https://test-app.chargeonsite.com/customer/cosa/watchlist");

    }
}
