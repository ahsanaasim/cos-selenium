package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FavoriteLocation extends BasePage{
    public FavoriteLocation(WebDriver driver) {

        super(driver);
    }

    public static By NoDataInTableImage = By.xpath("//img[@src='/images/noDataTable.svg']");
    public static By NoFavoriteLocationText = By.xpath("//div[contains(text(),'No Favorite Locations')]");
    public static By FavoriteLocationsTitle = By.xpath("//div[@class='mainTitle']");
    public static By ChargeOnSiteLogo = By.xpath("//img[@class='cursor ml-5 cosLogo']");
    public static By FavoriteLocationIcon1InList = By.xpath("//span[@class='anticon anticon-heart']");
    public static By AddToWatchListButton1 = By.xpath("//button[@class='ant-btn ant-btn-text mr-auto reserveButton']");
    public static By AddToWatchListButton2 = By.xpath("(//button[@class='ant-btn ant-btn-text mr-auto reserveButton'])[2]");
    public static By SeeInMap = By.xpath("//button[@class='ant-btn ant-btn-text seeDetailsButton']");
    public static By SeeInMapButtonText1 = By.xpath("//div[@class='seeDetailsText'][contains(text(),'See in Map')]");
    public static By SeeInMapButtonText2 = By.xpath("(//div[@class='seeDetailsText'][contains(text(),'See in Map')])[2]");
    public static By LocationName = By.xpath("//div[@class='locationName']");
    public static By LocationAddress = By.xpath("//div[@class='locationAddress']");





    public void GoToFavoriteLocationPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://test-app.chargeonsite.com/customer/favorites");
    }
    public boolean verifyFavoriteLocationsTitle() throws InterruptedException {
        Thread.sleep(4000);
        waitforPresence(FavoriteLocationsTitle);
        String title = driver.findElement(FavoriteLocationsTitle).getText();
        System.out.println(title);
        if (title.matches("Favorites \\(\\d+\\)")){
            System.out.println("Favorite Locations title is showing");
            return true;
        }
        else {
            System.out.println("Favorite Locations Title is not showing");
            return false;
        }
    }



//    public boolean verifyAddToWatchlistButton() throws InterruptedException {
//        Thread.sleep(2000);
//        waitforPresence(AddToWatchListButton1);
//        List<WebElement> rows = driver.findElements(By.className("ant-btn ant-btn-text mr-auto reserveButton"));
//        for (int i = 1; i < rows.size(); i++) { // start at index 1 to skip the header row
//            String result = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-text mr-auto reserveButton']['i']")).getText();
//            System.out.println(result);
//            if (!result.matches("\\$\\d+\\.\\d{2}/Session")) {
//                // Verification failed
//                throw new RuntimeException("Verification failed. Expected 'Success', but got '" + result + "' in row " + i);
//
//            }
//
//        }
//        return true;
//    }



    public boolean verifyFavoriteLocationsCountInTitleMatchWithList() throws InterruptedException {
        Thread.sleep(4000);
        waitforPresence(FavoriteLocationsTitle);
        String title = driver.findElement(FavoriteLocationsTitle).getText().replaceAll("[^0-9]","");
        int titleCount = Integer.parseInt(title);
        System.out.println("Location count in title: "+titleCount);
        int locationsInList = driver.findElements(By.className("favoriteDetailsDiv")).size();
        System.out.println("Favorite loctions are in the list: "+locationsInList);
        if (titleCount==locationsInList){
            System.out.println("Favorite Locations title count is matching with list");
            return true;
        }
        else {
            System.out.println("Favorite Locations title count is matching with list");
            return false;
        }
    }





}