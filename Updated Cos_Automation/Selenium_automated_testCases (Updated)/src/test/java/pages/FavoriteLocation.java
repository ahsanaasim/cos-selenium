package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoriteLocation extends BasePage{
    public FavoriteLocation(WebDriver driver) {

        super(driver);
    }

    public static By NoDataInTableImage = By.xpath("//img[@src='/images/noDataTable.svg']");
    public static By NoFavoriteLocationText = By.xpath("//div[contains(text(),'No Favorite Locations')]");
    public static By FavoriteLocationsTitle = By.xpath("//div[@class='mainTitle']");
    public static By ChargeOnSiteLogo = By.xpath("//img[@class='cursor ml-5 cosLogo']");
    public static By FavoriteLocationIcon1InList = By.xpath("//span[@class='anticon anticon-heart']");
    public static By ReserveButton1 = By.xpath("//button[@class='ant-btn ant-btn-text mr-auto reserveButton']");
    public static By ReserveButton2 = By.xpath("(//button[@class='ant-btn ant-btn-text mr-auto reserveButton'])[2]");
    public static By SeeDetailsButton = By.xpath("//button[@class='ant-btn ant-btn-text seeDetailsButton']");
    public static By SeeDetailsButtonText1 = By.xpath("//div[@class='seeDetailsText'][contains(text(),'See Details')]");
    public static By SeeDetailsButtonText2 = By.xpath("(//div[@class='seeDetailsText'][contains(text(),'See Details')])[2]");
    public static By LocationName = By.xpath("//div[@class='locationName']");
    public static By LocationAddress = By.xpath("//div[@class='locationAddress']");




    public boolean verifyFavoriteLocationsTitle() throws InterruptedException {
        Thread.sleep(4000);
        waitforPresence(FavoriteLocationsTitle);
        String title = driver.findElement(FavoriteLocationsTitle).getText();
        System.out.println(title);
        if (title.matches("Favorite Locations \\(\\d+\\)")){
            System.out.println("Favorite Locations title is showing");
            return true;
        }
        else {
            System.out.println("Favorite Locations Title is not showing");
            return false;
        }
    }



}