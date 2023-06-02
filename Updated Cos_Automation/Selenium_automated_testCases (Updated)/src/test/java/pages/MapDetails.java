package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.slf4j.Marker;

public class MapDetails extends BasePage{
    public MapDetails(WebDriver driver) {
        super(driver);
    }

    public static By UpperDrawer = By.xpath("//div[@class='ant-drawer-body']");
    public static By LowerDrawer = By.xpath("(//div[@class='ant-drawer-body'])[2]");
    public static By LocationMarker = By.xpath("//img[@src='https://maps.gstatic.com/mapfiles/transparent.png']");
    public static By SearchLocation = By.xpath("//input[@placeholder='Search location']");
    public static By FavoritesButton = By.xpath("//span[normalize-space()='Favorites']");
    public static By ChargeONSiteLogo = By.xpath("//img[@src='/images/cosLogo4.svg']");
    public static By LocationName = By.xpath("//h2[@class='drawerTopMainText']");
    public static By PropertyLocationAddress = By.xpath("//h4[@class='drawerTopSecondaryText']");
    public static By FavoriteIcon = By.xpath("//span[@class='anticon anticon-heart drawerIcon']");
    public static By ShareButton = By.xpath("//span[@class='anticon anticon-share-alt drawerIcon']");
    public static By AvailabilityStatusAsTitle = By.xpath("//h2[@class='drawerBottomMainText ml-12'][contains(text(),'Availability')]");








    public boolean verifySystemIsRedirectingToMapPage() throws InterruptedException {
        Thread.sleep(3000);
        String currentPage = driver.getCurrentUrl();
        System.out.println("Current page URL is: "+currentPage);
        if (currentPage.contains("https://test-app.chargeonsite.com/customer/map?")){
            System.out.println("System is redirecting to map page");
            return true;
        }
        else{
            System.out.println("System is not redirecting to map page");
            return false;
        }
    }

    public void GoToD10LocationInMapDetails() throws InterruptedException {
        Thread.sleep(3500);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=23.75840847262525&longitude=90.4292787187873&locationMarkerId=de085847-54de-4734-b108-426c7d61f8f4");

    }






}
