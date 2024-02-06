package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

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
    public static By AvailableStatus = By.xpath("//div[@class='availableText'][contains(text(),'Available')]");
    public static By UnavailableStatus = By.xpath("//div[@class='unavailableText'][contains(text(),'Unavailable')]");
    public static By RemoveAlert = By.xpath("//div[@class='modalText']");
    public static By WatcherButton = By.xpath("//div[@class='totalWatchersText']");
    public static By FeeDetails= By.xpath("//div[@class='feeDetails']");


    public void GoToWatchList() throws InterruptedException {
        Thread.sleep(3500);
        goToWebsite(prop.getProperty("WatchListPageURL"));

    }


    public boolean verifyWatchListTitle() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(WatchListTitle);
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
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        cosa.clickOnFutureDate(days);
        cosa.selectTiming(time,TimePeriod);
        Thread.sleep(2000);
    }

    public void AddPaikareShopLocationToWatchlist(int days, String time, By TimePeriod) throws InterruptedException {
        CreateCharger operation = new CreateCharger(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
        mapDetails.GoToPaikareLocation();
        operation.clickButton(MapDetails.AskCOSAButton,2000);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2000);
        cosa.clickOnFutureDate(days);
        cosa.selectTime(time,TimePeriod);
        Thread.sleep(2000);
    }

    public void AddRauAvenueLocationToWatchlist(int days, String time, By TimePeriod) throws InterruptedException {
        CreateCharger operation = new CreateCharger(driver);
        MapDetails mapDetails = new MapDetails(driver);
        COSA cosa = new COSA(driver);
        mapDetails.GoToRauAvenue81Location();
        operation.clickButton(MapDetails.AskCOSAButton,2500);
        operation.clickButton(COSA.KeepAnEyeOnThisLocation,2500);
        cosa.clickOnFutureDate(days);
        cosa.selectTiming(time,TimePeriod);
        Thread.sleep(2500);
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
        Thread.sleep(2500);
        waitforPresence(FeeDetails);
        String FeeBefore = readText(FeeDetails);
        System.out.println("Before remove: "+FeeBefore);
        click(CrossButton);
        click(YesButton);
        Thread.sleep(2500);
        waitVisibility(FeeDetails);
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


    public boolean verifyLocationCountIsIncreasingAfterAddingToWatchlist() throws InterruptedException {
        CreateCharger operation = new CreateCharger(driver);
        COSA cosa = new COSA(driver);
        GoToWatchList();
        Thread.sleep(2000);
        waitforPresence(LocationName);
        String LCount = driver.findElement(WatchListTitle).getText().replaceAll("[^0-9]","");
        int count = Integer.parseInt(LCount);
        System.out.println("Location count in list before adding: "+count);
        cosa.AddLocationToWatchlistWithCurrentTiming();
        GoToWatchList();
        Thread.sleep(2000);
        waitforPresence(LocationName);
        String LCountAfter = driver.findElement(WatchListTitle).getText().replaceAll("[^0-9]","");
        int count2 = Integer.parseInt(LCountAfter);
        System.out.println("Location count in list after adding: "+count2);
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

    public boolean verifyLocationCountIsDecreasingAfterRemovingFromWatchlist() throws InterruptedException {
        CreateCharger operation = new CreateCharger(driver);
        COSA cosa = new COSA(driver);
        GoToWatchList();
        Thread.sleep(2000);
        waitforPresence(LocationName);
        String LCount = driver.findElement(WatchListTitle).getText().replaceAll("[^0-9]","");
        int count = Integer.parseInt(LCount);
        System.out.println("Location count in list before : "+count);
        Thread.sleep(2000);
        click(CrossButton);
        click(YesButton);
        Thread.sleep(3000);
        waitVisibility(WatchListTitle);
        String LCountAfter = driver.findElement(WatchListTitle).getText().replaceAll("[^0-9]","");
        int count2 = Integer.parseInt(LCountAfter);
        System.out.println("Location count in list after removing : "+count2);
        int expected =count-1;
        if (count2==expected){
            System.out.println("Location count is decreased by one after removing");
            return true;
        }
        else {
            System.out.println("Location count is not increased by one after adding");
            return false;

        }


    }

    public boolean verifyLocationsCountInTitleMatchWithList() throws InterruptedException {
        Thread.sleep(4000);
        waitforPresence(WatchListTitle);
        String title = driver.findElement(WatchListTitle).getText().replaceAll("[^0-9]","");
        int titleCount = Integer.parseInt(title);
        System.out.println("Location count in title: "+titleCount);
        int locationsInList = driver.findElements(By.className("watchlistDetailsDiv")).size();
        System.out.println("Loctions in the watchlist: "+locationsInList);
        if (titleCount==locationsInList){
            System.out.println("Title count is matching with list");
            return true;
        }
        else {
            System.out.println("Title count is not matching with list");
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
        System.out.println("Property name and its address in watchlist: " + s2);
        switchToTab(1);
        location.GoToLocationPage();
        location.writeINLocationSearchBar(s);
        operation.clickButton(EditCompany.searchbtn, 1500);
        waitforPresence(EditLocation.PropertyName1InColumn);
        String propertyName = readText(EditLocation.PropertyName1InColumn);
        operation.clickButton(EditLocation.EditButton, 1500);
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



    public boolean verifyAvailableLocationStatus() throws InterruptedException {
        CreateLocation location = new CreateLocation(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        UpdateChargerPropertyAdmin editCharger = new UpdateChargerPropertyAdmin(driver);
        LoginPage login = new LoginPage(driver);
        waitforPresence(LocationName);
        String s = readText(LocationName);
        String s2 = readText(LocationAddress);
        System.out.println("Location name : " + s);
//        NewTabOpenAndSwitchToNewTab(1);
//        login.VerifyValidLogin();
        switchToTab(1);
        location.GoToLocationPage();
        location.writeINLocationSearchBar("Rampura Bridge");
        operation.clickButton(EditCompany.searchbtn, 1500);
        waitforPresence(EditLocation.EditButton);
        operation.clickButton(EditLocation.EditButton, 1500);
        waitforPresence(UpdateChargerPropertyAdmin.ToggleButton);
        editCharger.clickToggleButtonIfItIsOff();
        operation.clickButton(CreateLocation.savelocationbtn,1500);
        Thread.sleep(2000);
        switchToTab(0);
        dashboard.refreshBrowser();
        Thread.sleep(2500);
        waitVisibility(LocationName);
        if (driver.findElement(AvailableStatus).isDisplayed()) {
            System.out.println("Location status is showing available");
            return true;
        } else {
            System.out.println("Location status is not showing available");
            return false;
        }
    }


    public boolean verifyUnavailableLocationStatus() throws InterruptedException {
        CreateLocation location = new CreateLocation(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        UpdateChargerPropertyAdmin editCharger = new UpdateChargerPropertyAdmin(driver);
        LoginPage login = new LoginPage(driver);
        waitforPresence(LocationName);
        String s = readText(LocationName);
        String s2 = readText(LocationAddress);
        System.out.println("Location name : " + s);
//        NewTabOpenAndSwitchToNewTab(1);
//        login.VerifyValidLogin();
        switchToTab(1);
        location.GoToLocationPage();
        location.writeINLocationSearchBar("Rampura Bridge");
        operation.clickButton(EditCompany.searchbtn, 1500);
        waitforPresence(EditLocation.EditButton);
        operation.clickButton(EditLocation.EditButton, 1500);
        waitforPresence(UpdateChargerPropertyAdmin.ToggleButton);
        editCharger.clickToggleButtonIfItIsOn();
        operation.clickButton(CreateLocation.savelocationbtn,1500);
        Thread.sleep(2000);
        switchToTab(0);
        dashboard.refreshBrowser();
        waitVisibility(LocationName);
        if (driver.findElement(UnavailableStatus).isDisplayed()) {
            System.out.println("Location status is showing unavailable");
            return true;
        } else {
            System.out.println("Location status is not showing unavailable");
            return false;
        }
    }


}
