package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MapDetails extends BasePage{
    public MapDetails(WebDriver driver) {
        super(driver);
    }
    LoginPage loginPage = new LoginPage(driver);
    GuestFlow guestFlow = new GuestFlow(driver);

    public static By UpperDrawer = By.xpath("//div[@class='ant-drawer-body']");
    public static By LowerDrawer = By.xpath("(//div[@class='ant-drawer-body'])[2]");
    public static By LocationMarker = By.xpath("//div[@role='button']");
    public static By SearchLocation = By.xpath("//input[@placeholder='Search location']");
    public static By FavoritesButton = By.xpath("//span[normalize-space()='Favorites']");
    public static By ChargeONSiteLogo = By.xpath("//img[@src='/images/cosLogo4.svg']");
    public static By LocationName = By.xpath("//h2[@class='drawerTopMainText']");
    public static By PropertyLocationAddress = By.xpath("//h4[@class='drawerTopSecondaryText']");
    public static By FavoriteIcon = By.xpath("//span[@class='anticon anticon-heart drawerIcon heartOutlined']");
    public static By FavoriteIconMarked = By.xpath("//span[@class='anticon anticon-heart drawerIcon heartFilled']");
    public static By ShareButton = By.xpath("//img[@alt='share']");
    public static By AvailabilityTitle = By.xpath("//h2[@class='drawerBottomMainText'][contains(text(),'Availability')]");
    public static By PlugType = By.xpath("//span[@class='plugTypeBtn'][contains(text(),'Plug Type')]");
    public static By ChargersDetailsTitle = By.xpath("//div[@class='ant-drawer-title'][contains(text(),'Chargers Details')]");
    public static By CloseButton = By.xpath("(//span[@class='anticon anticon-close'])[3]");
    public static By GetDirection = By.xpath("//img[@src='/map/direction.svg']");
    public static By AskCOSAButton = By.xpath("//button[@class='ant-btn ant-btn-default assist-me-btn pt-5 pb-5']");
    public static By ScanNow = By.xpath("//button[@class='ant-btn ant-btn-default scan-now-btn pt-5 pb-5']");
    public static By ChargerRestrictedButton = By.xpath("//button[@class='ant-btn ant-btn-default charger-restricted-btn pt-5 pb-5']");
    public static By NoChargersAvailable = By.xpath("//div[@class='plugUnavailable'][contains(text(),'No chargers available')]");
    public static By RestrictedLocationAlertMsg = By.xpath("//div[@class='ant-alert-message']");
    public static By ChargerAvailableText = By.xpath("//div[@class='plugAvailableSpan']");
    public static By AvailableStatus = By.xpath("//div[@class='availableText']");
    public static By OfflineStatus = By.xpath("//div[@class='offlineText']");
    public static By PlugAvailable = By.xpath("//div[@class='plugAvailable']");
    public static By DownStatus = By.xpath("//div[@class='downText'][contains(text(),'Down')]");
    public static By InUseStatus = By.xpath("//div[@class='inUseText'][contains(text(),'In Use')]");
    public static By SCanQRCodeText = By.xpath("//h4[@class='drawerBottomSecondaryText mt-5 mb-5 ml-15']");
    public static By ScanQrCodeWithCellPhoneText = By.xpath("//div[@class='ant-alert-message'][contains(text(),'To start charging please scan the QR code with your cell phone.')]");
    public static By NoChargerAvailableButton = By.xpath("//button[@class='ant-btn ant-btn-default no-charger-btn pt-5 pb-5']");





    public void makeD10LocationAndRampuraBridgeChargerAvailable() throws InterruptedException {
        SimulationPage simulationPage = new SimulationPage(driver);
        String[] D10LocationCharger = {"D 10 charger 1170", "D-10 Charger", "D10 Charger-24", "D 11 charger", "Space 5","charger for noone"};
        // Loop through the array and print each element
        for (String Charger : D10LocationCharger) {
            System.out.println(Charger);
            guestFlow.GoToSimulator();
            simulationPage.SelectChargerFromSimulator(Charger);
            simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
            click(SimulationPage.BootChargerButton);

        }
    }


    public void MakeExpectedChargerOnline(String chargerName) throws InterruptedException {
        EditChargerCosAdminUpdated charger = new EditChargerCosAdminUpdated(driver);
        CreateCharger operation = new CreateCharger(driver);
        UpdateChargerPropertyAdmin editCharger = new UpdateChargerPropertyAdmin(driver);
        charger.writeInSearchBar(CreateCharger.searchChargerField,chargerName,1000);
        click(CreateCharger.searchChargerBtn);
        operation.clickButton(CosAdminChargerList.EditButton,1000);
        editCharger.clickToggleButtonIfItIsOff();
        click(UpdateChargerPropertyAdmin.SaveCharger);

    }





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

    public boolean verifyGetDirectionButtonIsWorking() throws InterruptedException {
        Thread.sleep(5000);
        String currentPage = driver.getCurrentUrl();
        System.out.println("Current page URL is: "+currentPage);
        if (currentPage.contains("https://www.google.com/maps/dir/")){
            System.out.println("System is directing the location in map");
            return true;
        }
        else{
            System.out.println("System is not directing the location in map");
            return false;
        }
    }

    public void GoToD10LocationInMapDetails() throws InterruptedException {
        Thread.sleep(3500);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=23.75840847262525&longitude=90.4292787187873&locationMarkerId=de085847-54de-4734-b108-426c7d61f8f4");

    }


    //LocationWithNoAvailableChargersAndRestricted
    public void GoToShantaHoldingsLocationInMapDetails() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=23.766160943146946&longitude=90.42558830046805&locationMarkerId=1220abce-ba9b-456b-b33b-0968f4fc9ecf");

    }

    //This location has down charger
    public void GoToSundarbanCourierLocation() throws InterruptedException {
        Thread.sleep(2500);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=23.759977825336062&longitude=90.42947810701023&locationMarkerId=6e9e6ba2-5ada-42e5-9cbd-bbfdc34968eb");
    }

    public void GoToRampuraLocation() throws InterruptedException {
        Thread.sleep(2500);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=23.76836177360211&longitude=90.42349129915237&locationMarkerId=6282ba03-f41d-4016-ac5f-2ab7da2d75b3");
    }

    public void GoToPaikareLocation() throws InterruptedException {
        Thread.sleep(3500);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=23.75816740396393&longitude=90.42778544106802&locationMarkerId=55a8c1f9-0c9e-41f5-bdae-de6bf8e8542d");
    }

    public void GoToRauAvenue81Location() throws InterruptedException {
        Thread.sleep(4000);
        goToWebsite("https://test-app.chargeonsite.com/customer/map?latitude=28.23587&longitude=-104.30161&locationMarkerId=1ddb1600-abb7-437e-b45a-f53ec1091480");

    }

    public void GoToChargerModule() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://test-admin.chargeonsite.com/property/charger");
    }

    public String RestrictedLocationMessage(){
        return "Sorry, you don't have access to this location. This location’s charger is only available for this property's customers.";
    }

    public String ScanTheQRText(){
        return "You need to scan the QR code printed on the pedestal";
    }


    public boolean verifyPlugAvailableText() throws InterruptedException {
        Thread.sleep(4000);
        waitforPresence(ChargerAvailableText);
        String text = driver.findElement(ChargerAvailableText).getText();
        System.out.println(text);
        if (text.matches("\\d+ Plugs Available")){
            System.out.println("Plug available text is showing correctly");
            return true;
        }
        else {
            System.out.println("Plug available text is not showing correctly");
            return false;
        }
    }

    public boolean verifyPlugAvailableTextForSinglePlugAvailable() throws InterruptedException {
        Thread.sleep(4000);
        waitforPresence(ChargerAvailableText);
        String text = driver.findElement(ChargerAvailableText).getText();
        System.out.println(text);
        if (text.matches("1 Plug Available")){
            System.out.println("Plug available text is showing correctly");
            return true;
        }
        else {
            System.out.println("Plug available text is not showing correctly");
            return false;
        }
    }




    public int GetAvailableChargerCountFromAvailabilitySection(){
        waitforPresence(PlugAvailable);
        String s = driver.findElement(PlugAvailable).getText().replaceAll("[^0-9]","");
        int chargerAvailable = Integer.parseInt(s);
        return chargerAvailable;
    }

    public int AvailableChargerCountInChargerDetailsDrawer(){
        waitforPresence(AvailableStatus);
        int availableChargerInDetailsDrawer = driver.findElements(By.className("availableText")).size();
        return availableChargerInDetailsDrawer;
    }

    public boolean verifyAvailableChargerCountMatchWithDetailsDrawer(){
        int chargerAvailable = GetAvailableChargerCountFromAvailabilitySection();
        System.out.println("Number of available charger in availability section: "+chargerAvailable);
        click(PlugType);
        int chargerAvailableInDrawer = AvailableChargerCountInChargerDetailsDrawer();
        System.out.println("Number of available charger in chargers details drawer: "+ chargerAvailableInDrawer);
        if (chargerAvailable==chargerAvailableInDrawer){
            System.out.println("Charger available count match with drawer count");
            return true;
        }
        else {
            System.out.println("Charger available count is not matching with drawer count");
            return false;

        }
    }

    public boolean verifyAvailableChargerCountIsDecreasingAfterMakingAChargerOffline() throws InterruptedException {
        EditChargerCosAdminUpdated chargerList = new EditChargerCosAdminUpdated(driver);
        UpdateChargerPropertyAdmin editCharger = new UpdateChargerPropertyAdmin(driver);
        int chargerAvailable = GetAvailableChargerCountFromAvailabilitySection();
        System.out.println("Number of available charger in availability section: "+chargerAvailable);
        newTabOpenAndSwitchToNewTab(1);
//        loginPage.VerifyValidLogin();
        GoToChargerModule();
        chargerList.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"D 11 charger",1000);
        click(CreateCharger.searchChargerBtn);
        click(CosAdminChargerList.EditButton);
        editCharger.clickToggleButtonIfItIsOn();
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(2500);
        switchToTab(0);
        driver.navigate().refresh();
        int expected = chargerAvailable-1;
        int chargerAvailable2 = GetAvailableChargerCountFromAvailabilitySection();
        System.out.println("Number of available charger in availability section after making a charger offline: "+chargerAvailable2);
        if (chargerAvailable2==expected){
            System.out.println("Charger available count is decreasing after making a charger offline");
            return true;
        }
        else {
            System.out.println("Charger available count is not decreasing after making a charger offline");
            return false;

        }
    }

    public boolean verifyAvailableChargerCountIsIncreasingAfterMakingAChargerOnline() throws InterruptedException {
        EditChargerCosAdminUpdated chargerList = new EditChargerCosAdminUpdated(driver);
        UpdateChargerPropertyAdmin editCharger = new UpdateChargerPropertyAdmin(driver);
        int chargerAvailable = GetAvailableChargerCountFromAvailabilitySection();
        System.out.println("Number of available charger in availability section: "+chargerAvailable);
        switchToTab(1);
        GoToChargerModule();
        chargerList.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"D 11 charger",1000);
        click(CreateCharger.searchChargerBtn);
        click(CosAdminChargerList.EditButton);
        editCharger.clickToggleButtonIfItIsOff();
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(2500);
        switchToTab(0);
        driver.navigate().refresh();
        int expected = chargerAvailable+1;
        int chargerAvailable2 = GetAvailableChargerCountFromAvailabilitySection();
        System.out.println("Number of available charger in availability section after making a charger online: "+chargerAvailable2);
        if (chargerAvailable2==expected){
            System.out.println("Charger available count is increasing after making a charger online");
            return true;
        }
        else {
            System.out.println("Charger available count is not increasing after making a charger online");
            return false;

        }
    }

    public boolean verifyOfflineStatusOfChargerAfterMakingItOffline() throws InterruptedException {
        EditChargerCosAdminUpdated chargerList = new EditChargerCosAdminUpdated(driver);
        UpdateChargerPropertyAdmin editCharger = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
//        NewTabOpenAndSwitchToNewTab(1);
        switchToTab(1);
        Thread.sleep(2000);
        loginPage.verifyValidLogin();
        GoToChargerModule();
        chargerList.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"D 11 charger",1000);
        click(CreateCharger.searchChargerBtn);
        click(CosAdminChargerList.EditButton);
        editCharger.clickToggleButtonIfItIsOn();
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(2500);
        switchToTab(0);
        driver.navigate().refresh();
        operation.clickButton(PlugType,2500);
        waitforPresence(OfflineStatus);
        int offlineCharger = driver.findElements(By.className("offlineText")).size();
        System.out.println("Number of Offline chargers: "+offlineCharger);
        if (driver.findElement(OfflineStatus).isDisplayed() && offlineCharger==1){
            System.out.println("Charger status Is changing to Offline");
            return true;
        }
        else {
            System.out.println("Charger status Is not changing to Offline");
            return false;

        }
    }

    public boolean verifyAvailableStatusOfChargerAfterMakingItOnline() throws InterruptedException {
        EditChargerCosAdminUpdated chargerList = new EditChargerCosAdminUpdated(driver);
        UpdateChargerPropertyAdmin editCharger = new UpdateChargerPropertyAdmin(driver);
        CreateCharger operation = new CreateCharger(driver);
        operation.clickButton(PlugType,2500);
        waitforPresence(AvailableStatus);
        int availableCharger = driver.findElements(By.className("availableText")).size();
        System.out.println("Number of available chargers: "+availableCharger);
        switchToTab(1);
        GoToChargerModule();
        chargerList.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"D 11 charger",1000);
        click(CreateCharger.searchChargerBtn);
        click(CosAdminChargerList.EditButton);
        editCharger.clickToggleButtonIfItIsOff();
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(2500);
        switchToTab(0);
        driver.navigate().refresh();
        operation.clickButton(PlugType,2500);
        waitforPresence(AvailableStatus);
        int availableCharger2 = driver.findElements(By.className("availableText")).size();
        System.out.println("Number of available chargers in details drawer after making a charger online: "+availableCharger2);
        int expected = availableCharger+1;
        if (driver.findElement(AvailableStatus).isDisplayed() && availableCharger2==expected){
            System.out.println("Charger status Is changing to Offline");
            return true;
        }
        else {
            System.out.println("Charger status Is not changing to Offline");
            return false;

        }
    }


    public boolean verifyPropertyNameAndItsAddress() throws InterruptedException {
        CreateLocation location = new CreateLocation(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        waitforPresence(LocationName);
        String s = readText(LocationName);
        String s2 = readText(PropertyLocationAddress);
        System.out.println("Property name and its address in map details: "+s2);
        newTabOpenAndSwitchToNewTab(1);
        dashboard.clickonLocations();
        location.GoToLocationPage();
        location.writeINLocationSearchBar(s);
        operation.clickButton(EditCompany.searchbtn,1500);
        waitforPresence(EditLocation.PropertyName1InColumn);
        String propertyName = readText(EditLocation.PropertyName1InColumn);
        operation.clickButton(EditLocation.EditButton,1500);
        waitforPresence(EditLocation.PropertyAddressInDrawer);
        String propertyLocationAddress = readText(EditLocation.PropertyAddressInDrawer);
        String Expected = propertyName+","+" "+propertyLocationAddress;
        System.out.println("Property name and its address in drawer: "+Expected);
        driver.close();
        if (s2.equals(Expected)){
            System.out.println("Property name and its address is showing correctly");
            return true;
        }
        else {
            System.out.println("Property name and its address is not showing correctly");
            return false;
        }







    }








}