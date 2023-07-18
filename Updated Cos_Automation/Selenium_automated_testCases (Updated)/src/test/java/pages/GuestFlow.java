package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GuestFlow extends BasePage {
    public GuestFlow(WebDriver driver) {
        super(driver);
    }

    RandomData rdata = new RandomData();

    public static By PhoneNoField = By.xpath("//input[@class='form-control ']");
    public static By PhoneNoFieldAfterRefresh = By.xpath("//input[@class='form-control ']");
    public static By ChangePhoneNumber = By.xpath("//span[@class='cursor']");
    public static By ChangePhoneNumberTab2 = By.xpath("(//span[@class='cursor'])[2]");
    public static By NumberVerifiedPageTitle = By.xpath("(//div[@class='pageTitle'][normalize-space()='Thanks for Verifying'])[2]");
    public static By PageTitleBrokenCharger = By.xpath("(//div[@class='pageTitle'][normalize-space()='We are sorry!'])[2]");
    public static By invalidPhnNumErrMsg = By.xpath("//div[@class='ant-form-item-explain-error']");
    public static By ContinueGuestBtn = By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-block phoneButton']");
    public static By CountryFlagWithCode = By.xpath("(//div[@class='selected-flag'])[2]");
    public static By ResendButton = By.xpath("//div[@class='underline cursor']");
    public static By ResendButton2 = By.xpath("(//div[@class='underline cursor'])[2]");
    public static By VerificationCodeSentNotify = By.xpath("//span[contains(text(),'Verification code sent')]");
    public static By InvalidOTPNotification = By.xpath("//span[contains(text(),'Invalid OTP code')]");
    public static By VerifyButton = By.xpath("//button[@type='submit']/span[contains(text(),'Verify')]");
    public static By VerifyButton2 = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-block common-btn-primary mt-10 mb-35']");
    public static By VeirfyDisabledButton = By.xpath("//button[@class='ant-btn ant-btn-secondary ant-btn-block mt-10 mb-35 common-btn-secondary OTPVerifyButton']");
    public static By StartChargingButton = By.xpath("//div[@class='ant-col ant-col-16']//span[contains(text(),'START CHARGING')]");
    public static By SignUpBtn = By.xpath("(//Button[@type='submit']/span[contains(text(),'Sign up')])[2]");

    public static By LoginBtn = By.xpath("(//Button[@type='submit']//span[contains(text(),'Login')])[2]");
    public static By OtpField1 = By.xpath("(//input[@data-id='0'])[3]");
    public static By OtpField2 = By.xpath("//input[@id='25157da6-3d14-44d9-b2c8-1aa4716d903c-1']");
    public static By OtpField3 = By.xpath("//input[@id='25157da6-3d14-44d9-b2c8-1aa4716d903c-2']");
    public static By OtpField4 = By.xpath("//input[@id='25157da6-3d14-44d9-b2c8-1aa4716d903c-3']");
    public static By OtpField5 = By.xpath("//input[@id='25157da6-3d14-44d9-b2c8-1aa4716d903c-4']");
    public static By OtpField6 = By.xpath("//input[@id='25157da6-3d14-44d9-b2c8-1aa4716d903c-5']");
    public static By CardPaymentIFrameTitle = By.xpath("(//iframe[contains(@title,'Secure card payment input frame')])[2]");
    public static By ForMembersTitle = By.xpath("(//div[@class='subTitle'])[2]");
    public static By ForMembersSubTitle = By.xpath("(//div[@class='doSignUp ml-15 mt-5'])[2]");
    public static By AuthorizeLoading = By.xpath("//span[@class='anticon anticon-loading anticon-spin']");
    public static By ChargerNotConnected = By.xpath("//span[@class='red-color weight-600']");
    public static By PlugConnected = By.xpath("(//span[@class='green-color weight-600'])[2]");
    public static By AlertUnderChargerNotConnected = By.xpath("//div[@class='ant-alert-description']");
    public static By AlertUnderPlugConnected = By.xpath("(//div[@class='ant-alert-description'])[2]");
    public static By CardNumber = By.xpath("//input[@placeholder='Card number']");
    public static By AuthorizeButton = By.xpath("(//button[@class='ant-btn ant-btn-primary ant-btn-block common-btn-primary authorizeButton'])[2]");
    public static By PluginChargerbtn = By.xpath("//div[@class='ml-10'][contains(text(),'Plug In Your Charger')]");
    public static By DisconnectChargerbtn = By.xpath("//div[@class='ml-10'][contains(text(),'Disconnect the Charger')]");
    public static By SearchFieldSimulator = By.id("rc_select_2");
    public static By ChargingNowTitle = By.xpath("(//div[@class='pageTitle'][contains(text(),'Charging Now')])[2]");
    public static By SessionEnded = By.xpath("(//div[@class='pageTitle'][contains(text(),'Session Ended')])[2]");
    public static By InitiateSession = By.xpath("(//div[@class='subDetails ml-15 mt-5'])[3]");
    public static By IdleFeeRate = By.xpath("(//div[@class='wordBreak feeDetails'])[3]");
    public static By GeneratedIdleSession = By.xpath("(//div[@class='sessionEndCountText'])[8]");
    public static By ChargingSession = By.xpath("(//div[@class='subDetails2 ml-15 mt-5'])[2]");
    public static By MaxChargingRate= By.xpath("(//div[@class='mt-5 chargingRate'])[2]");
    public static By LocationAndPropertyAddress = By.xpath("(//div[@class='mt-5 address'])[2]");
    public static By ChargerImage = By.xpath("(//img[@class='chargerLogoTab'])[2]");
    public static By ChargerOccupiedMsg = By.xpath("(//span[@class='red-color weight-600'])[2]");
    public static By Timer = By.id("resendOTPCounter");
    public static By Timer2 = By.xpath("(//div[@id='resendOTPCounter'])[2]");
    public static By SliderStart = By.xpath("(//span[@class='rsbcSliderCircle'])[2]");
    public static By IdlePageTitle = By.xpath("(//div[@class='idlePageTitle'])[2]");
    public static By OutsideSlider = By.xpath("(//div[@class='ant-col ant-col-4'])[2]");
    public static By FeeBreakdown = By.xpath("(//span[@class='feeBreakDownText cursor'])[2]");
    public static By SessionFee = By.xpath("//div[@class='wordBreak feeDetails']");
    public static By UtilizationFee = By.xpath("(//div[@class='wordBreak feeDetails'])[2]");
    public static By BreakDownFeeClose = By.xpath("//button[@class='ant-drawer-close']");
    public static By EnergyConsumed = By.xpath("(//div[@class='sessionEndCountText'])[5]");
    public static By TotalPaid = By.xpath("(//div[@class='totalFeeText'])[2]");
    public static By PressAndHoldButton = By.xpath("(//button[@class='ant-btn ant-btn-round ant-btn-default ant-btn-lg swipe-button'])[2]");
    public static By FirstAlertInChargingPage = By.xpath("(//div[@class='ant-alert-message'])[3]");




    public void makeScriptUsedChargerAvailable() throws InterruptedException {
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        CreateCharger operation = new CreateCharger(driver);
        String[] D10LocationCharger = {"Messi Charger","Selenium 18","Selenium 5","Selenium 272","Selenium 92","Selenium 889","Selenium 2","Selenium 529","D 10 charger 1170", "D-10 Charger", "D10 Charger-24", "D 11 charger", "Space 5","charger for noone","Charger ev updated"};
        // Loop through the array and print each element
        for (String Charger : D10LocationCharger) {
            System.out.println(Charger);
            guestFlow.GoToSimulator();
            simulationPage.SelectChargerFromSimulator(Charger);
            simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
            Thread.sleep(2000);
            String ChargerName = driver.findElement(SimulationPage.SelectedCharger).getAttribute("title");
            System.out.println("Charger name: "+ChargerName);
            waitVisibility(SimulationPage.SessionStatus);
            String SessionState = readText(SimulationPage.SessionStatus).replaceAll(": ","");
            System.out.println("Session Status: "+SessionState);
            if (SessionState.equals("Authorized")){
                operation.ClickButton(SimulationPage.PlugInCharger,1500);
                simulationPage.SelectChargerStatusFromSimulator("Charging");
                operation.ClickButton(SimulationPage.ChargerStatusSaveButton,3000);
                waitelementtobeEnabled(DisconnectChargerbtn);
                simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
                Thread.sleep(2000);
            }

        }
    }

    public void makeASpecificChargerAvailable(String chargername) throws InterruptedException {
        SimulationPage simulationPage = new SimulationPage(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        CreateCharger operation = new CreateCharger(driver);
        String[] D10LocationCharger = {chargername};
        guestFlow.GoToSimulator();
        simulationPage.SelectChargerFromSimulator(chargername);
        simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
        Thread.sleep(2000);
        String ChargerName = driver.findElement(SimulationPage.SelectedCharger).getAttribute("title");
        System.out.println("Charger name: "+ChargerName);
        waitVisibility(SimulationPage.SessionStatus);
        String SessionState = readText(SimulationPage.SessionStatus).replaceAll(": ","");
        System.out.println("Session Status: "+SessionState);
        if (SessionState.equals("Authorized")){
            operation.ClickButton(SimulationPage.PlugInCharger,1500);
            simulationPage.SelectChargerStatusFromSimulator("Charging");
            operation.ClickButton(SimulationPage.ChargerStatusSaveButton,3000);
            waitelementtobeEnabled(DisconnectChargerbtn);
            simulationPage.clickOnDisconnectTheChargerIfIsEnabled();
            Thread.sleep(2000);
            }


    }

    public void makeChargerAvailableFromAuthorizeState(String Charger) throws InterruptedException {
        CreateCharger operation = new CreateCharger(driver);
        SimulationPage simulator = new SimulationPage(driver);
        simulator.SelectChargerFromSimulator(Charger);
        String SessionState = readText(SimulationPage.SessionStatus).replaceAll(": ","");
        System.out.println(SessionState);
        if (SessionState.equals("Authorized")){
            operation.ClickButton(SimulationPage.PlugInCharger,1500);
            simulator.SelectChargerStatusFromSimulator("Charging");
            operation.ClickButton(SimulationPage.ChargerStatusSaveButton,3000);
            waitelementtobeEnabled(DisconnectChargerbtn);
            simulator.clickOnDisconnectTheChargerIfIsEnabled();
            Thread.sleep(2500);
        }


    }

    public String AlertTextUnderChargerNotConnected(){
        return "Please attach the charger plug into your car to complete the authorization.";
    }

    public String AlertTextUnderPlugConnected(){
        return "Your charging session will begin shortly.";
    }


    public String AlertTextForFaultedCharger(){
        return "We found some technical issues. Please unplug your charger.";
    }

    public boolean SendOtp(int delay, String text) throws InterruptedException {
        Thread.sleep(delay);
        WebElement currentElement = driver.switchTo().activeElement();
        currentElement.sendKeys(text);
        return true;
    }

    public void LengthOfSession(int timing) throws InterruptedException {
        Thread.sleep(timing);
    }


    public void PressAndHold(By element) throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(element);
        // Find the button element
        WebElement button = driver.findElement(element);
        // Create an instance of the Actions class
        Actions actions = new Actions(driver);
        // Click and hold the button for 10 seconds
        actions.clickAndHold(button).pause(Duration.ofSeconds(10)).release().perform();

    }



    public void ClearPhoneNumberField(By element) throws InterruptedException {
        Thread.sleep(5000);
        waitforPresence(GuestVerificationPage.PhoneNumberField);
        WebElement NumberField = driver.findElement(element);
        for(int i = 0; i <10 ;i++)
        {
            NumberField.sendKeys(Keys.chord(Keys.BACK_SPACE));
        }
    }


    public void GoToSimulator() throws InterruptedException {
        Thread.sleep(2500);
        driver.get("https://test-admin.chargeonsite.com/simulation/simulator");
    }
    public boolean SelectChargerFromSimulator(String text) throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(GuestFlow.SearchFieldSimulator);
        writeText(SearchFieldSimulator,text);
        WebElement selectitem = driver.findElement(SearchFieldSimulator);
        Thread.sleep(3500);
        selectitem.sendKeys(Keys.ENTER);
        return true;

    }
    public void MakeAllChargerOfSimulatorOnline() throws InterruptedException {
        SimulationPage simulator = new SimulationPage(driver);
        CreateCharger operation = new CreateCharger(driver);
        GuestFlow guestFlow = new GuestFlow(driver);
        guestFlow.GoToSimulator();
        for (int i = 0; i < 227; i++) {
            Thread.sleep(2000);
            waitforPresence(GuestFlow.SearchFieldSimulator);
            WebElement selectitem = driver.findElement(SearchFieldSimulator);
            Thread.sleep(3500);
            selectitem.sendKeys(Keys.DOWN);
            selectitem.sendKeys(Keys.DOWN);
            selectitem.sendKeys(Keys.ENTER);
            simulator.clickOnDisconnectTheChargerIfIsEnabled();
            Thread.sleep(2000);
            String ChargerName = driver.findElement(SimulationPage.SelectedCharger).getAttribute("title");
            System.out.println("Charger name: "+ChargerName);
            String SessionState = readText(SimulationPage.SessionStatus).replaceAll(": ","");
            System.out.println("Session Status: "+SessionState);
            System.out.println("Sl no."+i);
            if (SessionState.equals("Authorized")){
                operation.ClickButton(SimulationPage.PlugInCharger,1500);
                simulator.SelectChargerStatusFromSimulator("Charging");
                operation.ClickButton(SimulationPage.ChargerStatusSaveButton,3000);
                waitelementtobeEnabled(DisconnectChargerbtn);
                simulator.clickOnDisconnectTheChargerIfIsEnabled();
                Thread.sleep(2000);
            }
        }
    }

    public void ScanQROFSeleniumCharger() throws InterruptedException {
        Thread.sleep(2500);
        GoToWebsite("https://test-app.chargeonsite.com/charger/byjUql");
    }




    public void SwitchToIframe() throws InterruptedException{
        Thread.sleep(4000);
        waitVisibility(CardPaymentIFrameTitle);
        WebElement iframeByTitleContains = driver.findElement(CardPaymentIFrameTitle);
        driver.switchTo().frame(iframeByTitleContains);
    }
    public boolean SwitchToDefaultFromIframe() throws InterruptedException{
        driver.switchTo().defaultContent();
        return true;
    }
    public void NewTabOpenAndSwitchToNewTab(int num) throws InterruptedException{
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(num));
    }
    public void SwitchToTab(int num) throws InterruptedException{
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(num));
    }

    public boolean verifyChargingNowTitle() throws InterruptedException {
        waitforPresence(ChargingNowTitle);
        if (driver.findElement(ChargingNowTitle).isDisplayed()){
            System.out.println("Charging Now");
            return true;
        }
        else {
            System.out.println("Error");
            return false;
        }

    }
    public boolean verifyChargingSessionEnded() {
        waitforPresence(SessionEnded);
        if (driver.findElement(SessionEnded).isDisplayed()){
            System.out.println("Session Ended");
            return true;
        }
        else {
            System.out.println("Error");
            return false;
        }

    }

    public boolean verifyMaxChargingRateUnderTitle() throws InterruptedException {
        Thread.sleep(5000);
        String s = driver.findElement(MaxChargingRate).getText();
        String expected = "11.5 kW Max Charging Rate";
        if (s.equals(expected)){
            System.out.println("Max Charging rate is showing in Kw");
            return true;
        }
        else {
            System.out.println("Max Charging rate is not showing in Kw");
            return false;
        }
    }

    public boolean verifyPropertyAddressAndLocationAddress() throws InterruptedException {
        Thread.sleep(5000);
        String s = driver.findElement(LocationAndPropertyAddress).getText();
        System.out.println(s);
        String expected = "Electric Charger, East Avenue, Rochester, NY, USA";
        if (s.equals(expected)){
            System.out.println("Property Address and location address is showing");
            return true;
        }
        else {
            System.out.println("Property Address and location address is not showing");
            return false;
        }
    }


    public boolean CountryFlagNameWithCode() throws InterruptedException {
        Thread.sleep(5000);
        String CountryNameNCode = driver.findElement(CountryFlagWithCode).getAttribute("title");
        System.out.println(CountryNameNCode);
        String Expected = "United States: + 1";
        if (CountryNameNCode.equals(Expected)){
            System.out.println("Country Flag Name and code is showing");
            return true;
        }
        else {
            System.out.println("Country Flag Name and code is not showing");
            return false;
        }
    }

    public boolean verifyChargerImage() throws InterruptedException {
        Thread.sleep(5000);
        if (driver.findElement(ChargerImage).isDisplayed()){
            System.out.println("Charger Image is Showing");
            return true;
        }
        else {
            System.out.println("Charger Image is not showing");
            return false;
        }
    }

    public boolean verifyInitiateSession() throws InterruptedException {
        Thread.sleep(4000);
        String InitiateFee = driver.findElement(InitiateSession).getText();
        System.out.println(InitiateFee);
        String Expected = "$9.65 To Initiate Session";
        if (InitiateFee.equals(Expected)){
            System.out.println("Initiate Session is showing correctly");
            return true;
        }
        else {
            System.out.println("Initiate Session is not showing correctly");
            return false;
        }

    }
    public boolean verifyFeePerKwh() throws InterruptedException {
        Thread.sleep(4000);
        String ChargingFee = driver.findElement(ChargingSession).getText();
        System.out.println(ChargingFee);
        String Expected = "$1.01 /kWh";
        if (ChargingFee.equals(Expected)){
            System.out.println("Charging Fee is showing correctly");
            return true;
        }
        else {
            System.out.println("Charging Fee is not showing correctly");
            return false;
        }

    }
    public boolean verifyIdleFee() throws InterruptedException {
        Thread.sleep(4000);
        String Idle = driver.findElement(IdleFeeRate).getText().replaceAll("Idle Fee: ","");
        System.out.println(Idle);
        String Expected = "$2.15/Min After 10 Min";
        if (Idle.equals(Expected)){
            System.out.println("Idle Fee is showing correctly");
            return true;
        }
        else {
            System.out.println("Idle Fee is not showing correctly");
            return false;
        }

    }

    public boolean verifySignUpAndLoginButton() throws InterruptedException {
        Thread.sleep(4000);
        WebElement SignUp = driver.findElement(SignUpBtn);
        WebElement Login = driver.findElement(LoginBtn);
        if (SignUp.isDisplayed() && Login.isDisplayed() ){
            System.out.println("Sign Up And Login Button is Displayed");
            return true;
        }
        else {
            System.out.println("Sign Up And Login Button is not Displayed");
            return false;
        }
    }
    public boolean verifySignUpButtonIsWorking() throws InterruptedException {
        Thread.sleep(4000);
        String SignUpUrl = driver.getCurrentUrl();
        String Expected = "https://test-app.chargeonsite.com/customer/register-select";
        if (SignUpUrl.equals(Expected) ){
            System.out.println("Navigate to sign up page successfully");
            return true;
        }
        else {
            System.out.println("Not Navigating to sign up page successfully");
            return false;
        }
    }

    public boolean verifyLoginButtonButtonIsWorking() throws InterruptedException {
        Thread.sleep(4000);
        String SignUpUrl = driver.getCurrentUrl();
        String Expected = "https://test-app.chargeonsite.com/customer/login";
        if (SignUpUrl.equals(Expected) ){
            System.out.println("Navigate to Login page successfully");
            return true;
        }
        else {
            System.out.println("Not Navigating to Login page successfully");
            return false;
        }
    }
    public boolean verifyInvalidPhoneNumberErrorMsg() throws InterruptedException {
        Thread.sleep(3000);
        String ErrorMsg = driver.findElement(invalidPhnNumErrMsg).getText();
        String Expected = "Please provide a valid phone number";
        if (ErrorMsg.equals(Expected) ){
            System.out.println("Error message is showing");
            return true;
        }
        else {
            System.out.println("Error message is not showing");
            return false;
        }
    }

    public boolean verifyEmptyPhoneNumberFieldErrorMsg() throws InterruptedException {
        Thread.sleep(3000);
        String ErrorMsg = driver.findElement(invalidPhnNumErrMsg).getText();
        String Expected = "Phone number is required";
        if (ErrorMsg.equals(Expected) ){
            System.out.println("Correct Error message is showing");
            return true;
        }
        else {
            System.out.println("Error message is not showing");
            return false;
        }
    }


    public boolean verifyForMembersTitleAndSubtitle() throws InterruptedException {
        Thread.sleep(2000);
        String Title = driver.findElement(ForMembersTitle).getText();
        String ExpectedTitle = "FOR MEMBERS";
        String SubTitle = driver.findElement(ForMembersSubTitle).getText();
        String ExpectedSubTitle = "Please Sign up or login to see your price";
        if (Title.equals(ExpectedTitle) && SubTitle.equals(ExpectedSubTitle) ){
            System.out.println("Navigate to Login page successfully");
            return true;
        }
        else {
            System.out.println("Not Navigating to Login page successfully");
            return false;
        }
    }
    public boolean verifyButtonIsDisabled() throws InterruptedException {
        Thread.sleep(4000);
        Boolean Show=driver.findElement(VeirfyDisabledButton).isEnabled();
        System.out.println(Show);
        if (Show){
            System.out.println("Show Button is Enabled");
            return false;
        }
        else {
            System.out.println("Show Button is disabled");
            return true;
        }
    }

    public boolean verifyTimer(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String s = driver.findElement(OTPVerificationPage.Timer).getText().replaceAll(":","");
        int s1 = Integer.parseInt(s);
        System.out.println(s1);
        if (25<s1 && s1<30){
            System.out.println("30 sec timer is running");
            return true;
        }
        else{
            System.out.println("Timer is not running");
            return false;
        }
    }

    public void sliderMover(By element, By element2){
        waitforPresence(element);
        WebElement slider = driver.findElement(element);
//        int slidersizewidth = slider.Size.Width;//640
        Actions action = new Actions(driver);
        action.clickAndHold(slider);
        action.moveByOffset(200, 0).build().perform();
        driver.findElement(element2).click();
    }

    public boolean verifyLoading(){
        waitforPresence(AuthorizeLoading);
        String s = driver.findElement(AuthorizeLoading).getAttribute("aria-label");
        System.out.println(s);
        if (s.equals("loading")){
            System.out.println("Authorize button is in loading state");
            return true;
        }
        else {
            System.out.println("Authorize button is not in loading state");
            return false;
        }
    }



    public boolean verifyTotalFee() throws InterruptedException {
        Thread.sleep(5000);
        waitforPresence(EnergyConsumed);
        String EC = driver.findElement(EnergyConsumed).getText().replaceAll("[^.0-9]","");
        float EnergyConsumed = Float.parseFloat(EC);
        click(FeeBreakdown);
        Thread.sleep(2500);
        waitforPresence(SessionFee);
        String SF = driver.findElement(SessionFee).getText().replaceAll("[^.0-9]","");
        Thread.sleep(5000);
        float SessionFee = Float.parseFloat(SF);
        String UF = driver.findElement(UtilizationFee).getText().replaceAll("[^.0-9]","");
        float UtilizationFee = Float.parseFloat(UF);
        Float TF = (UtilizationFee*EnergyConsumed)+SessionFee;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Float TotalFee = Float.valueOf(decimalFormat.format(TF));
        System.out.println("Formula calculated Total fee: "+TotalFee);
        click(BreakDownFeeClose);
        Thread.sleep(2500);
        waitforPresence(TotalPaid);
        String TP = driver.findElement(TotalPaid).getText().replaceAll(".*\\$(\\d+\\.\\d+).*","$1");
        float TotalPaidAmount = Float.parseFloat(TP);
        System.out.println("System showing total fee: "+TotalPaidAmount);
        if (TotalFee==TotalPaidAmount){
            System.out.println("Total fee is correct");
            return true;
        }
        else{
            System.out.println("Total fee is not correct");
            return false;
        }


    }



    public boolean verifyTotalFeeIncludingIdleFee() throws InterruptedException {
        waitforPresence(EnergyConsumed);
        String EC = driver.findElement(EnergyConsumed).getText().replaceAll("[^.0-9]","");
        double EnergyConsumed = Double.parseDouble(EC);
        click(FeeBreakdown);
        Thread.sleep(2500);
        waitforPresence(SessionFee);
        String SF = driver.findElement(SessionFee).getText().replaceAll("[^.0-9]","");
        Thread.sleep(5000);
        double SessionFee = Double.parseDouble(SF);
        String UF = driver.findElement(UtilizationFee).getText().replaceAll("[^.0-9]","");
        double UtilizationFee = Double.parseDouble(UF);
        double IdleFee = IdleFeeCalculation();
        double TF = (UtilizationFee*EnergyConsumed)+SessionFee+IdleFee;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double TotalFee = Double.valueOf(decimalFormat.format(TF));
        System.out.println("Formula calculated Total fee: "+TotalFee);
        click(BreakDownFeeClose);
        Thread.sleep(2500);
        waitforPresence(TotalPaid);
        String TP = driver.findElement(TotalPaid).getText().replaceAll(".*\\$(\\d+\\.\\d+).*","$1");
        double TotalPaidAmount = Double.parseDouble(TP);
        System.out.println("System showing Total fee: "+TotalPaidAmount);
        if (TotalFee==TotalPaidAmount){
            System.out.println("Total fee is correct");
            return true;
        }
        else{
            System.out.println("Total fee is not correct");
            return false;
        }


    }

    public int ExtractMinValue(){
        waitforPresence(GeneratedIdleSession);
        String IdleFeeGenerated = driver.findElement(GeneratedIdleSession).getText();
        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("(\\d+) min (\\d+) sec");

        // Match the pattern against the time string
        Matcher matcher = pattern.matcher(IdleFeeGenerated);

        // Extract the hour and minute values
        int min = 0;
        if (matcher.find()) {
            min = Integer.parseInt(matcher.group(1));
        }
        System.out.println("min: " + min);
        return min;

    }

    public int ExtractSecValue(){
        waitforPresence(GeneratedIdleSession);
        String IdleFeeGenerated = driver.findElement(GeneratedIdleSession).getText();
        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("(\\d+) min (\\d+) sec");

        // Match the pattern against the time string
        Matcher matcher = pattern.matcher(IdleFeeGenerated);

        // Extract the hour and minute values
        int sec = 0;
        if (matcher.find()) {
            sec = Integer.parseInt(matcher.group(2));
        }
        System.out.println("sec: " + sec);
        return sec;

    }

    public double IdleFeeCalculation(){
        waitforPresence(IdleFeeRate);
        String IF = extractIdleFeeFromIdleFeeText();
        double IdleFee = Double.parseDouble(IF);
        System.out.println("Idle fee rate: "+IdleFee);
        int sec = ExtractSecValue();
        int min = ExtractMinValue();
        double totalMinutes = min + (sec/60.0);
        System.out.println("Total minutes: "+totalMinutes);
        // Calculate the fee
        double fee = totalMinutes * IdleFee;
        // Round the fee to two decimal places
        System.out.println(fee);
        return fee;


    }

    public String extractIdleFeeFromIdleFeeText(){
        waitforPresence(IdleFeeRate);
        String IF = driver.findElement(IdleFeeRate).getText();
        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("([\\d.]+)");

        // Match the pattern against the fee string
        Matcher matcher = pattern.matcher(IF);

        // Extract the dollar amount
        String dollarAmount = "";
        if (matcher.find()) {
            dollarAmount = matcher.group(1);


        }
        System.out.println("Dollar amount: " + dollarAmount);
        return dollarAmount;


    }






}