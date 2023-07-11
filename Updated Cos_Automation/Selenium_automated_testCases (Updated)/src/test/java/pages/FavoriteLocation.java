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
        Thread.sleep(2000);
        driver.get("https://test-app.chargeonsite.com/customer/favorites");
    }

    public void GoToZboncakAvenue94377709Location() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=55.78445&longitude=-103.74461&locationMarkerId=02d084be-7e6a-4694-a2c3-e5c1b14655c4");
    }

    public void GoToBillingLocation() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=33.2043261&longitude=-87.4636565&locationMarkerId=59a6e048-3732-478a-a36c-3d908d639fa4");
    }

    public void GoToBotsfordAvenue62659569Location() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=35.01764&longitude=-118.27717&locationMarkerId=7439b651-2916-49e6-af25-3c803ee4f4e6");
    }
    public void GoToElectricChargerLocation() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=43.1478841&longitude=-77.5651629&locationMarkerId=4c3eec15-cbd1-4057-a2cd-1b15a1868eca");
    }

    public void ScanChargerOFElectricChargerLocation() throws InterruptedException {
        Thread.sleep(2000);
        GoToWebsite("https://test-app.chargeonsite.com/charger/byjUql");

    }

    public void ScanChargerOFEBotsfordAvenue62659569Location() throws InterruptedException {
        Thread.sleep(2000);
        GoToWebsite("https://test-app.chargeonsite.com/charger/tIljMh");

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
                System.out.println("Already listed as favorite");;
                return true;
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Already listed as favorite");
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
                System.out.println("Already listed as favorite");;
                return true;
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Already listed as favorite");
            return true;
        }
    }

    public void AddAutomatedLocation9129ToFavoriteLocation() throws InterruptedException{
        Thread.sleep(2000);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=33.8528917&longitude=-96.5617912&locationMarkerId=06acaf60-a0ae-4aab-81c5-1846ca206e71");
        try {
            Thread.sleep(3500);
            if (driver.findElement(MapDetails.FavoriteIcon).isDisplayed()) {
                click(MapDetails.FavoriteIcon);
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Already listed as favorite");
        }
    }


    public void RemoveBillingLocationFromFavorites() throws InterruptedException{
        Thread.sleep(1000);
        GoToBillingLocation();
        try {
            Thread.sleep(3500);
            if (driver.findElement(MapDetails.FavoriteIconMarked).isDisplayed()) {
                click(MapDetails.FavoriteIconMarked);
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Already removed from favorites");
        }
    }


    public void RemoveZboncakAvenue94377709FromFavorites() throws InterruptedException{
        Thread.sleep(2000);
        GoToZboncakAvenue94377709Location();
        try {
            Thread.sleep(3500);
            if (driver.findElement(MapDetails.FavoriteIconMarked).isDisplayed()) {
                click(MapDetails.FavoriteIconMarked);
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Already removed from favorites");
        }
    }

    public void RemoveElectricChargerFromFavorites() throws InterruptedException{
        Thread.sleep(2000);
        GoToElectricChargerLocation();
        try {
            Thread.sleep(3500);
            if (driver.findElement(MapDetails.FavoriteIconMarked).isDisplayed()) {
                click(MapDetails.FavoriteIconMarked);
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Already removed from favorites");
        }
    }

    public void RemoveBotsfordAvenue62659569FromFavorites() throws InterruptedException{
        Thread.sleep(2000);
        GoToBotsfordAvenue62659569Location();
        try {
            Thread.sleep(3500);
            if (driver.findElement(MapDetails.FavoriteIconMarked).isDisplayed()) {
                click(MapDetails.FavoriteIconMarked);
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Already removed from favorites");
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
        Thread.sleep(3000);
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



    public boolean verifyFavoriteLocationCountIsIncreasingAfterAddingFavorites() throws InterruptedException {
        CreateCharger operation = new CreateCharger(driver);
        Thread.sleep(1500);
        waitforPresence(LocationName);
        String LCount = driver.findElement(FavoriteLocationsTitle).getText().replaceAll("[^0-9]","");
        int count = Integer.parseInt(LCount);
        System.out.println("Location count before adding: "+count);
        GoToBillingLocation();
        operation.ClickButton(MapDetails.FavoriteIcon,2500);
        Thread.sleep(2000);
        GoToFavoriteLocationPage();
        waitforPresence(LocationName);
        String LCountAfter = driver.findElement(FavoriteLocationsTitle).getText().replaceAll("[^0-9]","");
        int count2 = Integer.parseInt(LCountAfter);
        System.out.println("Location count after adding: "+count2);
        int expected =count+1;
        if (count2==expected){
            System.out.println("Location count is increased by one after adding");
            return true;
        }
        else {
            System.out.println("Location count is not increased by one after adding");
            return false;

        }


    }


    public boolean verifyLocationIsShowingInTheFavoritesListAfterAdding() throws InterruptedException {
        CreateCharger operation = new CreateCharger(driver);
        Thread.sleep(1500);
        waitforPresence(LocationName);
        GoToZboncakAvenue94377709Location();
        waitforPresence(MapDetails.LocationName);
        String LName = driver.findElement(MapDetails.LocationName).getText();
        System.out.println("Location name in map details: "+LName);
        operation.ClickButton(MapDetails.FavoriteIcon,2500);
        Thread.sleep(2000);
        GoToFavoriteLocationPage();
        waitforPresence(LocationName);
        String LName2 = driver.findElement(LocationName).getText();
        System.out.println("Location name in the favorite location list: "+LName2);
        if (LName.equals(LName2)){
            System.out.println("Location is added successfully as favorites");
            return true;
        }
        else {
            System.out.println("Location is not added as favorites");
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

    public boolean verifyPropertyNameAndItsAddress() throws InterruptedException {
        CreateLocation location = new CreateLocation(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        waitforPresence(LocationName);
        String s = readText(LocationName);
        String s2 = readText(LocationAddress);
        System.out.println("Property name and its address in favorites: " + s2);
        SwitchToTab(1);
        location.GoToLocationPage();
        location.writeINLocationSearchBar(s);
        operation.ClickButton(EditCompany.searchbtn, 1500);
        waitforPresence(EditLocation.PropertyName1InColumn);
        String propertyName = readText(EditLocation.PropertyName1InColumn);
        operation.ClickButton(EditLocation.EditButton, 1500);
        waitforPresence(EditLocation.PropertyAddressInDrawer);
        String propertyLocationAddress = readText(EditLocation.PropertyAddressInDrawer);
        String Expected = propertyName + "," + " " + propertyLocationAddress;
        System.out.println("Property name and its address in drawer: " + Expected);
        if (s2.equals(Expected)) {
            System.out.println("Property name and its address is showing correctly");
            return true;
        } else {
            System.out.println("Property name and its address is not showing correctly");
            return false;
        }
    }

    public boolean verifyFavoriteLocationCountIsIncreasingAfterAddingFavoritesFromChargerDetails() throws InterruptedException {
        CreateCharger operation = new CreateCharger(driver);
        Thread.sleep(1500);
        waitforPresence(LocationName);
        String LCount = driver.findElement(FavoriteLocationsTitle).getText().replaceAll("[^0-9]","");
        int count = Integer.parseInt(LCount);
        System.out.println("Location count before adding: "+count);
        ScanChargerOFElectricChargerLocation();
        operation.ClickButton(GuestVerificationPage.FavoriteIcon,2500);
        Thread.sleep(2000);
        GoToFavoriteLocationPage();
        waitforPresence(LocationName);
        String LCountAfter = driver.findElement(FavoriteLocationsTitle).getText().replaceAll("[^0-9]","");
        int count2 = Integer.parseInt(LCountAfter);
        System.out.println("Location count after adding: "+count2);
        int expected =count+1;
        if (count2==expected){
            System.out.println("Location count is increased by one after adding");
            return true;
        }
        else {
            System.out.println("Location count is not increased by one after adding");
            return false;

        }



    }
    public boolean verifyLocationIsShowingInTheFavoritesListAfterAddingFromChargerDetails() throws InterruptedException {
        CreateCharger operation = new CreateCharger(driver);
        Thread.sleep(1500);
        ScanChargerOFEBotsfordAvenue62659569Location();
        waitforPresence(GuestVerificationPage.LocationName);
        String LName = driver.findElement(GuestVerificationPage.LocationName).getText();
        System.out.println("Location name in charger details: "+LName);
        operation.ClickButton(GuestVerificationPage.FavoriteIcon,3000);
        Thread.sleep(2000);
        GoToFavoriteLocationPage();
        waitforPresence(LocationName);
        String LName2 = driver.findElement(LocationName).getText();
        System.out.println("Location name in the favorite location list: "+LName2);
        if (LName.equals(LName2)){
            System.out.println("Location is added successfully as favorites");
            return true;
        }
        else {
            System.out.println("Location is not added as favorites");
            return false;

        }


    }






}