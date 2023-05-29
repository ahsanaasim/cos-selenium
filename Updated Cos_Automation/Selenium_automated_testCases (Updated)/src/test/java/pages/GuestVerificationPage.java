package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class GuestVerificationPage extends BasePage{
    public GuestVerificationPage(WebDriver driver) {
        super(driver);
    }


    public static By ThanksForScanningTitle = By.xpath("//h1[@class='headingText'][contains(text(),'Thanks For Scanning')]");
    public static By ProvidePhnNumberTitle = By.xpath("//h4[@class='subheadingText'][contains(text(),'Provide phone no.')]");
    public static By USAFlag = By.xpath("//div[@title='United States: + 1']");
    public static By PhoneNumberField = By.xpath("//input[@class='form-control ']");
    public static By ContinueAsGuestButton = By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-block phoneButton']");
    public static By ContinueAsGuestButtonText = By.xpath("//span[normalize-space()='Continue as a Guest']");
    public static By LoginButton = By.xpath("//span[normalize-space()='LOGIN']");
    public static By SignUPButton = By.xpath("//span[normalize-space()='SIGN UP']");
    public static By ChargerAvailableStatus = By.xpath("//div[@class='chargerAvailable']");
    public static By ChargerUnavailableStatus = By.xpath("//div[@class='chargerUnavailable'][contains(text(),'unavailable')]");
    public static By ChargerInUseStatus = By.xpath("//div[@class='chargerUnavailable'][contains(text(),'In Use')]");
    public static By ChargerRestrictedStatus = By.xpath("//div[@class='chargerUnavailable'][contains(text(),'Restricted')]");
    public static By PropertyLocationAddress = By.xpath("//div[@class='chargerLocationAddress mt-10']");
    public static By FavoriteIcon = By.xpath("//div[@class='heartDiv']");
    public static By ShareButton = By.xpath("//div[@class='shareDiv cursor-pointer']");
    public static By CopiedToolTip = By.xpath("//div[@role='tooltip'][contains(text(),'Copied')]");
    public static By GetDirectionText = By.xpath("//div[@class='getDirectionText']");
    public static By GetDirectionIcon = By.xpath("//img[@src='/map/getDirection.svg']");
    public static By CarImage = By.xpath("//img[@src='/scan-charger/car.svg']");
    public static By IdleFee = By.xpath("//div[@class='idleFeeText flex items-center']");
    public static By NearbyLocation = By.xpath("//div[@class='nearbyChargersText'][contains(text(),'Nearby Locations')]");
    public static By NearbyLocationTab = By.xpath("//div[@class='ant-menu-submenu-title']");
    public static By AssistMeButton = By.xpath("//button[@class='ant-btn ant-btn-default assistButton']");
    public static By StatChargingButton = By.xpath("//button[@class='ant-btn ant-btn-default chargingButton']");
    public static By PhoneNumberRequiredErrorMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Phone number is required')]");
    public static By InvalidNumberErrorMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Please provide a valid phone number')]");
    public static By ChargerFeeBox = By.xpath("//div[@class='chargerFeeBox']");
    public static By MaxChargingRate = By.xpath("//div[@class='feeHeading']");
    public static By MaxChargingRateHeading = By.xpath("//div[@class='feeSubheading']");


    public boolean GoToAvailableCharger (String url) throws InterruptedException{
        driver.get(url);
        urlCheck(url);
        return true;
    }

    public boolean verifyContinueAsGuestAsButtonColor() throws InterruptedException {
        Thread.sleep(3000);
        // identify text
        WebElement Draft = driver.findElement(ContinueAsGuestButton);
        //obtain color in rgba
        String s = Draft.getCssValue("background-color");
        // convert rgba to hex
        String Hexcode = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Color is :" + Hexcode);
        String BlueColor = "#ff924e";
        if (Hexcode.equals(BlueColor)){
            System.out.println("Color of Continue As a Guest Button is Orange");
            return true;
        }
        else {
            System.out.println("Color of Continue As a Guest Button is not Orange");
            return false;
        }

    }

    public boolean verifyNearByLocationsTabIsNotExpanded(){
        waitforPresence(NearbyLocationTab);
        String tabState = driver.findElement(NearbyLocationTab).getAttribute("aria-expanded");
        String Expected = "false";
        if (tabState.equals(Expected)){
            System.out.println("Nearby locations tab is closed");
            return true;
        }
        else {
            System.out.println("Nearby locations tab is not closed");
            return false;
        }
    }
    public boolean verifyNearByLocationsTabIsExpanded() throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(NearbyLocationTab);
        String tabState = driver.findElement(NearbyLocationTab).getAttribute("aria-expanded");
        String Expected = "true";
        if (tabState.equals(Expected)){
            System.out.println("Nearby locations tab is expanded");
            return true;
        }
        else {
            System.out.println("Nearby locations tab is not expanded");
            return false;
        }
    }





}