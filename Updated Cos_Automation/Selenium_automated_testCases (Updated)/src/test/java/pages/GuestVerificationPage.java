package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GuestVerificationPage extends BasePage{
    public GuestVerificationPage(WebDriver driver) {
        super(driver);
    }
    SimulationPage simulator = new SimulationPage(driver);
    Properties prop = ConfigUtill.getConfig();



    public static By ThanksForScanningTitle = By.xpath("//h1[@class='headingText'][contains(text(),'Thanks For Scanning')]");
    public static By WelcomeTitleForCustomer = By.xpath("//h1[@class='headingText']");
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
    public static By ChargerDownStatus = By.xpath("//div[@class='chargerUnavailable'][contains(text(),'Down')]");
    public static By ChargerInvalidQRStatus = By.xpath("//div[@class='chargerUnavailable'][contains(text(),'Invalid QR Code')]");
    public static By LocationName = By.xpath("//div[@class='chargerLocationName mt-10 ml-20']");
    public static By PropertyLocationAddress = By.xpath("//div[@class='chargerLocationAddress mt-10']");
    public static By FavoriteIcon = By.xpath("//span[@class='anticon anticon-heart heartOutlined drawerIcon']");
    public static By FavoriteIconMarked = By.xpath("//span[@class='anticon anticon-heart heartFilled drawerIcon']");
    public static By ShareButton = By.xpath("//div[@class='shareDiv cursor-pointer']");
    public static By CopiedToolTip = By.xpath("//div[@role='tooltip'][contains(text(),'Copied')]");
    public static By GetDirectionText = By.xpath("//div[@class='getDirectionText']");
    public static By GetDirectionIcon = By.xpath("//img[@src='/map/getDirection.svg']");
    public static By PlugType = By.xpath("//div[@class='plugIcon plugIconGreen plugIconSmall']");
    public static By PlugTypeForUnavailableChargers = By.xpath("//div[@class='plugIcon plugIconRed']");
    public static By OfflineTextInBox = By.xpath("//div[@class='invalidQrCodeOfflineText'][contains(text(),'Offline')]");
    public static By ReportAProblem = By.xpath("//button[@class='ant-btn ant-btn-default reportProblemButton']");
    public static By CarImage = By.xpath("//img[@src='/scan-charger/car.svg']");
    public static By IdleFee = By.xpath("//div[@class='idleFeeText flex items-center']");
    public static By NearbyLocation = By.xpath("//div[@class='nearbyChargersText'][contains(text(),'Nearby Locations')]");
    public static By NearbyLocationTab = By.xpath("//div[@class='ant-menu-submenu-title']");
    public static By AskCosaButton = By.xpath("//button[@class='ant-btn ant-btn-default assistButton']");
    public static By StatChargingButton = By.xpath("//button[@class='ant-btn ant-btn-default chargingButton']");
    public static By PhoneNumberRequiredErrorMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Phone number is required')]");
    public static By InvalidNumberErrorMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Please provide a valid phone number')]");
    public static By ChargerFeeBox = By.xpath("//div[@class='chargerFeeBox']");
    public static By MaxChargingRate = By.xpath("//div[@class='feeHeading']");
    public static By MaxChargingRateHeading = By.xpath("//div[@class='feeSubheading']");
    public static By FeeToInitiate = By.xpath("(//div[@class='feeHeading'])[2]");
    public static By FeeToInitiateHeading = By.xpath("(//div[@class='feeSubheading'])[2]");
    public static By FeePerKwh = By.xpath("(//div[@class='feeHeading'])[3]");
    public static By FeePerKwhHeading = By.xpath("(//div[@class='feeSubheading'])[3]");
    public static By SavePhoneNumberCheckbox = By.xpath("//span[@class='ant-checkbox']");
    public static By SavePhoneNumberCheckboxChecked = By.xpath("//span[@class='ant-checkbox ant-checkbox-checked']");
    public static By SavePhoneNumberText = By.xpath("//div[@class='checkboxText'][contains(text(),'Save this phone number')]");
    public static By MsgUnderInvalidQRCode = By.xpath("//div[contains(text(),'Please scan the QR code again or try with another charger.')]");



    public boolean GoToAvailableCharger (String url) throws InterruptedException{
        driver.get(url);
        urlCheck(url);
        return true;
    }

    public boolean GoToDownCharger (String url) throws InterruptedException{
        driver.get(url);
        urlCheck(url);
        return true;
    }

    public boolean GoToRestrictedCharger (String url) throws InterruptedException{
        driver.get(url);
        urlCheck(url);
        return true;
    }

    public boolean GoToBrokenLinkOfACharger(String url) throws InterruptedException{
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


    public boolean verifyAnyOfTheChargerStatusIsShowing(){
        waitforPresence(GetDirectionText);
        if (driver.findElement(ChargerAvailableStatus).isDisplayed() || driver.findElement(ChargerInUseStatus).isDisplayed()){
            System.out.println("Charger status is showing");
            return true;
        }
        else {
            System.out.println("Charger status is not showing");
            return false;
        }

    }

    public boolean verifyWelcomeTitleForCustomerAfterScanningAnCharger(){
        waitforPresence(WelcomeTitleForCustomer);
        String welcomeTitle = driver.findElement(WelcomeTitleForCustomer).getText();
        System.out.println("Title of the welcome page: "+welcomeTitle);
        if (welcomeTitle.contains("Welcome")){
            System.out.println("Welcome page title is showing correctly");
            return true;

        }
        else{
            System.out.println("Welcome page title is not showing correctly");
            return false;
        }

    }


    public boolean verifyClipboardIsGettingTheCorrectURLAfterClickingOnShareButton(){
        waitforPresence(ShareButton);
        String Url = simulator.getClipboardURL();
        if (Url.contains("https://test-app.chargeonsite.com/customer/map?")){
            System.out.println("Correct URL is copied in the clipboard");
            return true;
        }
        else {
            System.out.println("Correct URL is not copied in the clipboard");
            return false;
        }
    }


    public String extractIdleFee(){
        String input = readText(IdleFee);
        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d+");
        // Match the pattern against the input string
        Matcher matcher = pattern.matcher(input);
        // Extract the substring
        String idleFee = "";
        if (matcher.find()) {
            idleFee = matcher.group();
        }
        System.out.println("Extracted idleFee: " + idleFee);
        return idleFee;
    }

    public boolean verifyIdleFee(String Expected){
        waitforPresence(IdleFee);
        String s = extractIdleFee();
        String s2 = Expected;
        if (s.equals(s2)){
            System.out.println("IdleFee is showing correctly");
            return true;
        }
        else {
            System.out.println("IdleFee is not showing correctly");
            return false;
        }
    }






}