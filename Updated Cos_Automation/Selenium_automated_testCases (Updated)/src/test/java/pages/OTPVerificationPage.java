package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;

import static org.apache.commons.lang.StringUtils.substring;

public class OTPVerificationPage extends BasePage{
    public OTPVerificationPage(WebDriver driver) {
        super(driver);
    }


    public static By OTPPageTitle = By.xpath("//h1[@class='headingText'][contains(text(),'Check Your Message')]");
    public static By ProvidedPhoneNumber = By.xpath("//h4[@class='otpSubheadingText mr-5']");


    public boolean verifyProvidedPhoneNumberIsShowingAccurately(String PhoneNumber){
        waitVisibility(ProvidedPhoneNumber);
        String providedPhoneNumber = driver.findElement(ProvidedPhoneNumber).getText().replaceAll("Your Phone no: ","");
        String providedPhoneNumberWithoutCountryCode = providedPhoneNumber.substring(2);
        System.out.println(providedPhoneNumberWithoutCountryCode);
        if (providedPhoneNumberWithoutCountryCode.equals(PhoneNumber)){
            System.out.println("Provided number is showing accurately");
            return true;
        }
        else {
            System.out.println("Provided number is not showing accurately");
            return false;
        }

        }



}
