package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLogin extends BasePage {

    public CustomerLogin(WebDriver driver) {

        super(driver);
    }



    public static By CustomerLoginButton = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-block input-field-login-email']");
    public static By EmailField = By.xpath("//input[@placeholder='Email']");
    public static By PasswordField = By.xpath("//input[@placeholder='Password']");
    public static By LoginErrorMsgNoEmail = By.xpath("//div[@role='alert'][contains(text(),'Email field is required')]");
    public static By NoPasswordErrorMsg = By.xpath("//div[@class='ant-form-item-explain-error']");
    public static By Menu = By.xpath("//div[@class='flex items-center cursor-pointer']");
    public static By WrongPasswordAlert = By.xpath("//div[@class='ant-message-custom-content ant-message-error']");
    public static By UnregisteredAlert = By.xpath("//span[contains(text(),'User Does Not Exist')]");
    public static By Logout = By.xpath("//h4[normalize-space()='Sign Out']");


    public void GoToCustomerLoginPage(){
        driver.get("https://test-app.chargeonsite.com/customer/login");
    }




    public boolean VerifyNoEmailErrorMsg() throws InterruptedException{
        Thread.sleep(1500);
        String EmailFieldErrMsg = driver.findElement(LoginErrorMsgNoEmail).getText();
        System.out.println(EmailFieldErrMsg);
        String Expected = "Email field is required";
        if (EmailFieldErrMsg.equals(Expected)){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean VerifyNoPasswordErrorMsg() throws InterruptedException{
        Thread.sleep(1500);
        String EmailFieldErrMsg = driver.findElement(NoPasswordErrorMsg).getText();
        System.out.println(EmailFieldErrMsg);
        String Expected = "Password field is required";
        if (EmailFieldErrMsg.equals(Expected)){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }

    public boolean VerifyWrongPasswordAlert() throws InterruptedException{
        Thread.sleep(1000);
        waitforPresence(WrongPasswordAlert);
        String Alert = driver.findElement(WrongPasswordAlert).getText();
        System.out.println(Alert);
        String Expected = "Email/Password didn't match";
        if (Alert.equals(Expected)){
            System.out.println("Successful");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }

    public void LogoutFromCustomerAccount() throws InterruptedException {
        Thread.sleep(1500);
        click(Menu);
        click(Logout);

    }

    public boolean verifyRedirectingToMap() throws InterruptedException {
        Thread.sleep(3000);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        if (URL.contains("https://test-app.chargeonsite.com/customer/map")){
            System.out.println("Successfully Redirection To Map");
            return true;
        }
        else {
            System.out.println("Not Redirection To Map");
            return false;
        }

    }



}
