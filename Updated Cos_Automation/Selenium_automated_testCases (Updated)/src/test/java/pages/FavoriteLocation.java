package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
    public static By PopUpUnmarkedSuccessfully = By.xpath("//span[contains(text(),'Location unmarked successfully')]");






    public void GoToFavoriteLocationPage() throws InterruptedException {
        Thread.sleep(1500);
        driver.get("https://test-app.chargeonsite.com/customer/favorites");
    }


    public boolean AddGoldnerAvenue3LocationToFavoriteLocation() throws InterruptedException{
        Thread.sleep(2000);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=-78.30617730022657&longitude=31.228567157012616&locationMarkerId=c35b3b6a-9af3-4c21-b782-76d002a8fca9");
        try {
            Thread.sleep(3500);
            if (driver.findElement(MapDetails.FavoriteIcon).isDisplayed()) {
                click(MapDetails.FavoriteIcon);
                return true;
            } else {
                System.out.println("Already listed as favorite list");;
                return true;
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Already listed as favorite list");
            return true;
        }
    }

    public boolean AddRawLocation3ToFavoriteLocation() throws InterruptedException{
        Thread.sleep(2000);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=36.07499123063481&longitude=-79.84843297324281&locationMarkerId=8ad4c7cf-87ef-4179-bf62-e1ade98e7485");
        try {
            Thread.sleep(5000);
            if (driver.findElement(MapDetails.FavoriteIcon).isDisplayed()) {
                click(MapDetails.FavoriteIcon);
                return true;
            } else {
                System.out.println("Already listed as favorite");;
                return true;
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Already listed as favorite");
            return true;
        }
    }

    public boolean AddOrtizAvenue80799629ToFavoriteLocation() throws InterruptedException{
        Thread.sleep(2000);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=54.55128&longitude=-89.41867&locationMarkerId=480ccee9-c63c-4231-9e53-14fa0845f30e");
        try {
            Thread.sleep(3500);
            if (driver.findElement(MapDetails.FavoriteIcon).isDisplayed()) {
                click(MapDetails.FavoriteIcon);
                return true;
            } else {
                System.out.println("Already listed as favorite list");;
                return true;
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Already listed as favorite list");
            return true;
        }
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

    public boolean verifyFavoriteLocationCountIsDecreasingAfterUnSelecting() throws InterruptedException {
        Thread.sleep(1500);
        waitforPresence(LocationName);
        String LCount = driver.findElement(FavoriteLocationsTitle).getText().replaceAll("[^0-9]","");
        int count = Integer.parseInt(LCount);
        System.out.println("Location count before unselecting fav icon: "+count);
        click(FavoriteLocationIcon1InList);
        Thread.sleep(2000);
        waitforPresence(LocationName);
        String LCountAfter = driver.findElement(FavoriteLocationsTitle).getText().replaceAll("[^0-9]","");
        int count2 = Integer.parseInt(LCountAfter);
        System.out.println("Location count after unselecting fav icon: "+count2);
        int expected =count-1;
        if (count2==expected){
            System.out.println("Location count is decreasing by one after removing");
            return true;
        }
        else {
            System.out.println("Location count is not decreasing after removing");
            return false;

        }



    }

    public boolean verifyLocationIsRemovedFromTheList() throws InterruptedException {
        Thread.sleep(1500);
        waitforPresence(LocationName);
        String LName = driver.findElement(LocationName).getText();
        System.out.println("Location name before unselecting fav icon: "+LName);
        click(FavoriteLocationIcon1InList);
        Thread.sleep(3000);
        waitforPresence(LocationName);
        String LNameAfter = driver.findElement(LocationName).getText();
        System.out.println("Location name after unselecting fav icon: "+LNameAfter);
        if (!LName.equals(LNameAfter)){
            System.out.println("Location is removed from the list");
            return true;
        }
        else {
            System.out.println("Location is not removed from the list");
            return false;

        }



    }






}