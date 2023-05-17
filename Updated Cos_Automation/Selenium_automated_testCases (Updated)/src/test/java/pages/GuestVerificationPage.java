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
    public static By PropertyLocationAddress = By.xpath("//div[@class='chargerLocationAddress mt-10']");
    public static By ShareButton = By.xpath("//div[@class='shareDiv cursor-pointer']");
    public static By GetDirectionText = By.xpath("//div[@class='getDirectionText']");
    public static By GetDirectionIcon = By.xpath("//img[@src='/map/getDirection.svg']");
    public static By IdleFee = By.xpath("//div[@class='idleFeeText flex items-center mt-10']");
    public static By NearbyLocation = By.xpath("//div[@class='nearbyChargersText']");
    public static By AssistMeButton = By.xpath("//button[@class='ant-btn ant-btn-default assistButton']");


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












}
