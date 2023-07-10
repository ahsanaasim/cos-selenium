package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;
import java.util.function.Function;

public class WatchList extends BasePage{
    public WatchList(WebDriver driver){
        super(driver);
    }

    Properties prop = ConfigUtill.getConfig();

    public static By WatchListTitle = By.xpath("//div[@class='mainTitle']");
    public static By WatchListContainer = By.xpath("//div[@class='watchlist-container']");

    public static By LocationName = By.xpath("//div[@class='locationName mt-5']");
    public static By LocationAddress = By.xpath("//div[@class='locationAddress']");
    public static By CrossButton = By.xpath("//span[@class='anticon anticon-close']");
    public static By YesButton = By.xpath("//span[normalize-space()='Yes']");
    public static By No = By.xpath("//span[normalize-space()='No']");
    public static By RemoveSuccessfully = By.xpath("//span[normalize-space()='Removed Successfully']");
    public static By NoLocationInWatchlistText = By.xpath("//div[contains(text(),'No locations in watchlist')]");
    public static By AvailableChargers = By.xpath("//button[@class='ant-btn ant-btn-primary availableChargersButton']");
    public static By ChargerDetailsCloseButton = By.xpath("(//span[@class='anticon anticon-close'])[2]");
    public static By SeeInMap = By.xpath("//button[@class='ant-btn ant-btn-default seeMapButton']");
    public static By PhoneNumberAddingText = By.xpath("//div[@class='ant-alert-message']");
    public static By ClickHereToUpdateLink = By.xpath("//a[@href='/customer/profile']");
    public static By ClickHereToUpdateText = By.xpath("//span[@class='underline'][contains(text(),'Click here to update')]");
    public static By AvailableStatus = By.xpath("//div[@class='availableText']");
    public static By UnavailableStatus = By.xpath("//div[@class='unavailableText']");
    public static By RemoveAlert = By.xpath("//div[@class='modalText']");
    public static By WatcherButton = By.xpath("//div[@class='totalWatchersText']");
    public static By FeeDetails= By.xpath("//div[@class='feeDetails']");


    public void GoToWatchList() throws InterruptedException {
        Thread.sleep(2500);
        GoToWebsite(prop.getProperty("WatchListPageURL"));

    }


    public boolean verifyWatchListTitle() throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(WatchListTitle);
        String title = driver.findElement(WatchListTitle).getText();
        System.out.println(title);
        if (title.matches("Watchlist \\(\\d+\\)")){
            System.out.println("Favorite Locations title is showing");
            return true;
        }
        else {
            System.out.println("Favorite Locations Title is not showing");
            return false;
        }
    }

    public void AddRampuraLocationToWatchlist(int days, String time, By TimePeriod) throws InterruptedException {
        CreateCharger operation = new CreateCharger(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
        mapDetails.GoToRampuraLocation();
        operation.ClickButton(MapDetails.AskCOSAButton,2000);
        operation.ClickButton(COSA.KeepAnEyeOnThisLocation,2000);
        cosa.clickOnFutureDate(days);
        cosa.selectTiming(time,TimePeriod);
    }

    public void AddPaikareShopLocationToWatchlist(int days, String time, By TimePeriod) throws InterruptedException {
        CreateCharger operation = new CreateCharger(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
        mapDetails.GoToPaikareLocation();
        operation.ClickButton(MapDetails.AskCOSAButton,2000);
        operation.ClickButton(COSA.KeepAnEyeOnThisLocation,2000);
        cosa.clickOnFutureDate(days);
        cosa.selectTiming(time,TimePeriod);
    }

    public String AlertForRemoveALocationFromWatchlist(){
        return "Are you sure you want to remove this?";
    }


    public boolean verifyAlertForUpdatingCustomerNumber(){
        waitforPresence(ClickHereToUpdateText);
        String AlertText = readText(PhoneNumberAddingText);
        System.out.println(AlertText);
        String expected = "Please add mobile phone number to receive text updates. Click here to update";
        if (AlertText.equals(expected)){
            System.out.println("Alert text for phone number adding is showing correctly");
            return true;
        }
        else {
            System.out.println("Alert text for phone number adding is not showing correctly");
            return false;

        }

    }

    public boolean verifyLocationIsRemovedFromTheWatchList() throws InterruptedException {
        Thread.sleep(1000);
        waitforPresence(FeeDetails);
        String FeeBefore = readText(FeeDetails);
        System.out.println("Before remove: "+FeeBefore);
        click(CrossButton);
        click(YesButton);
        Thread.sleep(2500);
        String FeeAfter = readText(FeeDetails);
        System.out.println("After remove: "+FeeAfter);
        if (!FeeBefore.equals(FeeAfter)){
            System.out.println("Location is removed from watchlist");
            return true;
        }
        else {
            System.out.println("Location is not removed from watchlist");
            return false;
        }

    }


}
