package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.List;

import static org.apache.commons.lang.StringUtils.substring;

public class OTPVerificationPage extends BasePage{
    public OTPVerificationPage(WebDriver driver) {
        super(driver);
    }


    public static By OTPPageTitle = By.xpath("//h1[@class='headingText'][contains(text(),'Check Your Message')]");
    public static By ProvidedPhoneNumber = By.xpath("//h4[@class='otpSubheadingText mr-5']");
    public static By ChangePhoneNumber = By.xpath("//span[@class='anticon anticon-edit']");
    public static By Timer = By.xpath("//div[@class='ml-auto']");
    public static By ResendOTP = By.xpath("//div[@class='cursor-pointer'][contains(text(),'Resend OTP')]");
    public static By EnterVerificationCodeTitle = By.xpath("//div[normalize-space()='Enter Verification Code']");
    public static By VerifyButton = By.xpath("//button[@class='ant-btn ant-btn-secondary ant-btn-block mt-10 otpVerifyButton']");
    public static By VerificationCodeSent = By.xpath("//span[normalize-space()='Verification code sent']");
    public static By InvalidOTP = By.xpath("//span[normalize-space()='Invalid OTP code']");
    public static By SuccessFullyVerified = By.xpath("//span[normalize-space()='Successfully verified']");
    public static By FirstOTPField = By.xpath("//input[@type='number']");


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

    public void ClearOTPField(){
        List<WebElement> List1 = driver.findElements(By.tagName("input"));
        for (int i=0;i<List1.size();i++)
        {
            List1.get(i).clear();
        }
    }



}
