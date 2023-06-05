package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MapDetails extends BasePage{
    public MapDetails(WebDriver driver) {
        super(driver);
    }
    LoginPage loginPage = new LoginPage(driver);

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
    public static By AvailabilityTitle = By.xpath("//h2[@class='drawerBottomMainText'][contains(text(),'Availability')]");
    public static By DetailsButton = By.xpath("//span[@class='detailsBtn'][contains(text(),'Details')]");
    public static By ChargersDetailsTitle = By.xpath("//div[@class='ant-drawer-title'][contains(text(),'Chargers Details')]");
    public static By CloseButton = By.xpath("(//span[@class='anticon anticon-close'])[3]");
    public static By GetDirection = By.xpath("//img[@class='cursor-pointer ml-auto direction-img']");
    public static By AssistMeButton = By.xpath("//button[@class='ant-btn ant-btn-default assist-me-btn pt-5 pb-5']");
    public static By ScanNow = By.xpath("//button[@class='ant-btn ant-btn-default scan-now-btn pt-5 pb-5']");
    public static By ChargerRestrictedButton = By.xpath("//button[@class='ant-btn ant-btn-default charger-restricted-btn pt-5 pb-5']");
    public static By NoChargersAvailable = By.xpath("//div[@class='plugUnavailable'][contains(text(),'No chargers available')]");
    public static By RestrictedLocationAlertMsg = By.xpath("//div[@class='ant-alert-message']");
    public static By ChargerAvailableText = By.xpath("//div[@class='plugAvailableSpan']");
    public static By AvailableStatus = By.xpath("//div[@class='availableText']");
    public static By OfflineStatus = By.xpath("//div[@class='offlineText']");
    public static By PlugAvailable = By.xpath("//div[@class='plugAvailable']");
    public static By SCanQRCodeText = By.xpath("//h4[@class='drawerBottomSecondaryText mt-5 mb-5 ml-15']");
    public static By ScanQrCodeWithCellPhoneText = By.xpath("//div[@class='ant-alert-message'][contains(text(),'To start charging please scan the QR code with your cell phone.')]");









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
        Thread.sleep(3000);
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

    //LocationWithNoAvailableChargersAndRes
    public void GoToShantaHoldingsLocationInMapDetails() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://test-app.chargeonsite.com/customer/map?latitude=23.766160943146946&longitude=90.42558830046805&locationMarkerId=1220abce-ba9b-456b-b33b-0968f4fc9ecf");

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
        click(DetailsButton);
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
        NewTabOpenAndSwitchToNewTab(1);
        loginPage.VerifyValidLogin();
        GoToChargerModule();
        chargerList.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"D 11 charger",1000);
        click(CreateCharger.searchargerbtn);
        click(CosAdminChargerList.EditButton);
        editCharger.clickToggleButtonIfItIsOn();
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(2500);
        SwitchToTab(0);
        driver.navigate().refresh();
        int expected = chargerAvailable-1;
        int chargerAvailable2 = GetAvailableChargerCountFromAvailabilitySection();
        System.out.println("Number of available charger in availability section after making a charger offline: "+chargerAvailable2);
        if (chargerAvailable==expected){
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
        SwitchToTab(1);
        GoToChargerModule();
        chargerList.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"D 11 charger",1000);
        click(CreateCharger.searchargerbtn);
        click(CosAdminChargerList.EditButton);
        editCharger.clickToggleButtonIfItIsOff();
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(2500);
        SwitchToTab(0);
        driver.navigate().refresh();
        int expected = chargerAvailable+1;
        int chargerAvailable2 = GetAvailableChargerCountFromAvailabilitySection();
        System.out.println("Number of available charger in availability section after making a charger online: "+chargerAvailable2);
        if (chargerAvailable==expected){
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
        SwitchToTab(1);
        GoToChargerModule();
        chargerList.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"D 11 charger",1000);
        click(CreateCharger.searchargerbtn);
        click(CosAdminChargerList.EditButton);
        editCharger.clickToggleButtonIfItIsOn();
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(2500);
        SwitchToTab(0);
        driver.navigate().refresh();
        click(DetailsButton);
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
        click(DetailsButton);
        waitforPresence(AvailableStatus);
        int availableCharger = driver.findElements(By.className("availableText")).size();
        System.out.println("Number of available chargers: "+availableCharger);
        SwitchToTab(1);
        GoToChargerModule();
        chargerList.writeInSearchBar(ChargerListPropertyAdmin.SearchChargerField,"D 11 charger",1000);
        click(CreateCharger.searchargerbtn);
        click(CosAdminChargerList.EditButton);
        editCharger.clickToggleButtonIfItIsOff();
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(2500);
        SwitchToTab(0);
        driver.navigate().refresh();
        click(DetailsButton);
        waitforPresence(AvailableStatus);
        int availableCharger2 = driver.findElements(By.className("availableText")).size();
        System.out.println("Number of available chargers in details drawer after making a charger online: "+availableCharger2);
        int expected = availableCharger+1;
        if (driver.findElement(AvailableStatus).isDisplayed() && availableCharger==expected){
            System.out.println("Charger status Is changing to Offline");
            return true;
        }
        else {
            System.out.println("Charger status Is not changing to Offline");
            return false;

        }
    }








}