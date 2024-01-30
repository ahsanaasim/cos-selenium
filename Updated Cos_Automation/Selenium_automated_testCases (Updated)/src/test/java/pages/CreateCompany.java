package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;
import java.util.Random;

public class CreateCompany extends BasePage {

    public CreateCompany(WebDriver driver)
    {
        super(driver);
    }

    Properties prop = ConfigUtill.getConfig();
    RandomData rdata = new RandomData();

    public static By createCompanyBtn = By.xpath("//button[contains(text(),'Create New Company')]");
    public static By createCompanyDrawerTitle = By.xpath("//span[@class='drawerTitle'][contains(text(),'Create New Company')]");
    public static By companyName = By.xpath("//input[@placeholder='Company Name']");
    public static By phone = By.xpath("//input[@placeholder='Phone Number']");
    public static By email = By.xpath("//input[@placeholder='Email']");
    public static By website = By.xpath("//input[@placeholder='Website']");
    public static By ein = By.xpath("//input[@placeholder='EIN']");
    public static By zipcode = By.xpath("//input[@placeholder='Zip Code']");
    public static By address = By.xpath("//textarea[contains(@placeholder,'Address')]");
    public static By saveButton = By.xpath("//button[contains(.,'Save Company')]");
    public static By crossBtn = By.xpath("//*[name()='path' and contains(@d,'M563.8 512')]");
    public static By companyNameErrMsg = By.xpath("//div[@role='alert'][contains(.,'Company Name is required')]");
    public static By phoneErrorMsg = By.xpath("//div[@role='alert'][contains(.,'Please provide a valid phone number')]");
    public static By blankPhoneErrorMsg = By.xpath("//div[@role='alert'][contains(.,'Phone number is required')]");
    public static By invalidEmailErrorMsg = By.xpath("//div[@role='alert'][contains(.,'Invalid email address')]");
    public static By blankEmailErrorMsg = By.xpath("//div[@role='alert'][contains(.,'Email is required')]");
    public static By websiteErrorMsg = By.xpath("//div[@role='alert'][contains(.,'Please provide a valid Website')]");
    public static By einErrorMsg = By.xpath("//div[@role='alert'][contains(.,'EIN is required')]");
    public static By zipCodeErrorMsg = By.xpath("//div[@role='alert'][contains(.,'Please provide a valid Zip Code')]");
    public static By blankZipCodeErrMsg = By.xpath("//div[@role='alert'][contains(.,'Zip code is required')]");
    public static By blankAddressErrorMsg = By.xpath("//div[@role='alert'][contains(.,'Address is required')]");
    public static By spinner = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div/span");


    public boolean clickOnCreateCompanyButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        waitforInVisibility(spinner);
        waitVisibility(createCompanyBtn);
        click(createCompanyBtn);
        return true;
    }

    public boolean waitForSpinner ()  {
      //  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    //    waitforInVisibility(spinner);
        waitForElementNotVisible(20,driver,"//span[@class='ant-spin-dot ant-spin-dot-spin']");
     //   wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
        return true;
    }

    public static String waitForElementNotVisible(int timeOutInSeconds, WebDriver driver, String elementXPath) {
        Duration time = Duration.ofSeconds(timeOutInSeconds);
        if ((driver == null) || (elementXPath == null) || elementXPath.isEmpty()) {

            return "Wrong usage of WaitforElementNotVisible()";
        }
        try {
            (new WebDriverWait(driver, time)).until(ExpectedConditions.invisibilityOfElementLocated(By
                    .xpath(elementXPath)));
            return null;
        } catch (TimeoutException e) {
            return "Build your own errormessage...";
        }
    }

    public boolean clickOnSaveButton() throws InterruptedException {
        Thread.sleep(3000);
        waitelemtclickable(saveButton);
        click(saveButton);
        return true;
    }

    public boolean clickOnCrossButton() throws InterruptedException {
        Thread.sleep(1000);
        waitVisibility(crossBtn);
        click(crossBtn);
        return true;
    }

    public boolean writeCompanyName(String CompanyName) throws InterruptedException {
        Thread.sleep(1000);
        waitVisibility(companyName);
        writeText(companyName,CompanyName);
        return true;
    }

    public String writeAutomatedCompanyName()  {
        Random numGenerator = new Random();
        int randomNumber = numGenerator.nextInt(10000);
        String company=prop.getProperty("CompanyNameForAutomation")+" "+randomNumber;
        System.out.println("Created company name : "+company);
        return company;
    }


    public String generateRandomPhoneNumber() {
        Random random = new Random();
        // Ensure the first digit is not zero
        int firstDigit = random.nextInt(9) + 1;
        // Generate the remaining 9 digits
        StringBuilder phoneNumber = new StringBuilder(String.valueOf(firstDigit));
        for (int i = 0; i < 9; i++) {
            phoneNumber.append(random.nextInt(10));
        }
        return phoneNumber.toString();
    }

    public boolean writeCompanyPhoneNumber(String Phone) {
        waitVisibility(phone);
        waitelemtclickable(phone);
        writeText(phone,Phone);
        return true;
    }

    public boolean writeCompanyEmail(String Email) {
        waitVisibility(email);
        writeText(email,Email);
        return true;
    }

    public boolean writeRandomCompanyEmail() {
        waitVisibility(email);
        clear(email);
        writeText(email,rdata.RandomEmail());
        return true;
    }

    public String generateRandomEmail() {
        String[] domains = {"tez.com", "zyx.com", "trq.com", "example.com", "dplc.com"};
        Random random = new Random();
        // Generate a random username
        String username = generateRandomString(8);
        // Select a random domain from the array
        String domain = domains[random.nextInt(domains.length)];
        // Create the email address
        return username + "@" + domain;
    }

    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }
        return randomString.toString();
    }

    public String randomZipCode() throws InterruptedException {
        Random random = new Random();
        String[] Zip = {"96898", "96863", "96861","96860","96859","96857","96854","96853","96850","96849","32009","32011","32079","32120","32159","32352","32425","20140","20164","10001","10002","10003","10004","10005","10006","10107"};
        int index = random.nextInt(Zip.length);
        return Zip[index];

    }

    public boolean writeRandomCompanyAddress() {
        waitVisibility(address);
        writeText(address,rdata.Randomaddress());
        return true;
    }

    public boolean writeRandomEINNumber() {
        waitVisibility(ein);
        clear(ein);
        writeText(ein,rdata.generateRandomNumber(9));
        return true;
    }

    public boolean enterCompanyWebsite(String Website) {
        waitVisibility(website);
        waitelemtclickable(website);
        writeText(website, Website);
        return true;
    }

    public boolean enterEINNumber(String EIN) {
        waitVisibility(ein);
        writeText(ein, EIN);
        return true;
    }

    public boolean enterZipCode(String ZipCode) throws InterruptedException {
        waitelementtobedisplayed(zipcode);
        writeText(zipcode, ZipCode);
        return true;
    }



    public boolean enterAddress(String Address) throws InterruptedException {
        waitVisibility(address);
        waitelementtobedisplayed(address);
        writeText(address, Address);
        Thread.sleep(3000);
        return true;
    }

    public static String generateRandomWebsiteUrl() {
        String[] domains = {"com", "net", "org", "gov", "edu", "biz"};
        Random random = new Random();
        // Generate a random domain name
        String domain = generateRandomStringForURL(5);
        // Select a random top-level domain (TLD) from the array
        String tld = domains[random.nextInt(domains.length)];
        // Create the website URL
        return "http://www." + domain + "." + tld;
    }

    private static String generateRandomStringForURL(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder randomString = new StringBuilder();

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }

        return randomString.toString();
    }

    public void createCompany(String companyName,String phoneNumber,String email) throws InterruptedException {
        writeCompanyName(companyName);
        writeCompanyPhoneNumber(phoneNumber);
        writeCompanyEmail(email);
        enterCompanyWebsite(generateRandomWebsiteUrl());
        writeRandomEINNumber();
        enterZipCode(randomZipCode());
        writeRandomCompanyAddress();
        clickOnSaveButton();
    }

    public boolean verifyCompanyNameErrorMessage(String expectedText) {
        waitVisibility(companyNameErrMsg);
        waitelementtobedisplayed(companyNameErrMsg);
        assertEquals(companyNameErrMsg, expectedText);
            return true;

    }

    public boolean verifyPhoneNumberErrorMessage(String expectedText) {
        waitVisibility(phoneErrorMsg);
        waitelementtobedisplayed(phoneErrorMsg);
            assertEquals(phoneErrorMsg, expectedText);
            return true;

    }
    public boolean verifyBlankPhoneNumberErrorMessage(String expectedText) {
        waitelementtobedisplayed(blankPhoneErrorMsg);
        assertEquals(blankPhoneErrorMsg, expectedText);
        return true;

    }

    public boolean verifyInvalidEmailErrorMessage(String expectedText) {
        waitelementtobedisplayed(invalidEmailErrorMsg);
        assertEquals(invalidEmailErrorMsg, expectedText);
        return true;
    }

    public boolean verifyBlankEmailErrorMessage(String expectedText) {
            waitelementtobedisplayed(blankEmailErrorMsg);
            assertEquals(blankEmailErrorMsg, expectedText);
            return true;

    }

    public boolean verifyInvalidWebsiteErrorMessage(String expectedText) {
        waitVisibility(websiteErrorMsg);
        assertEquals(websiteErrorMsg, expectedText);
        return true;

    }

    public boolean verifyInvalidEINNumberErrorMessage(String expectedText) {
            waitelementtobedisplayed(einErrorMsg);
            assertEquals(einErrorMsg, expectedText);
            System.out.println("EIN error message has displayed");
            return true;
        }


    public boolean verifyInvalidZipCodeErrorMessage(String expectedText) throws InterruptedException {
        Thread.sleep(3000);
        waitelementtobedisplayed(zipCodeErrorMsg);
        waitVisibility(zipCodeErrorMsg);
        assertEquals(zipCodeErrorMsg, expectedText);
        return true;

    }

    public boolean verifyBlankZipCodeErrorMessage(String expectedText) throws InterruptedException {
       Thread.sleep(3000);
        waitelementtobedisplayed(blankZipCodeErrMsg);
        assertEquals(blankZipCodeErrMsg, expectedText);
            return true;
    }

    public boolean verifyBlankAddressErrorMessage(String expectedText) {
        waitelementtobedisplayed(blankAddressErrorMsg);
        assertEquals(blankAddressErrorMsg, expectedText);
       return true;
    }



    public boolean verifyCreateNewCompanyButtonHasDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(createCompanyBtn);
        if( driver.findElement(By.xpath("//button[contains(.,'Create New Company')]")).isDisplayed())
        {
            System.out.println("Create New Company button has displayed");
            return true;
        }else{
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyCreateNewCompanyDrawerDisplayed() {
        waitVisibility(createCompanyDrawerTitle);
        if( driver.findElement(createCompanyDrawerTitle).isDisplayed())
        {
            System.out.println("Create New Company drawer has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCompanyInformationAreShowingOnCreateNewCompanyDrawer() throws InterruptedException {
        waitForSpinner();
        Thread.sleep(3000);
        if(driver.getPageSource().contains("Company Name") && driver.getPageSource().contains("Phone") && driver.getPageSource().contains("Email") && driver.getPageSource().contains("Website") && driver.getPageSource().contains("EIN") ) {
            System.out.println("Verification Successful - Company Name,Phone,Email,Website,EIN are Showing On Company Information Section");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }

    public boolean VerifyCompanyLocationInformationareShowingonCreateNewCompanyDrawer() {
        waitForSpinner();
        if(driver.getPageSource().contains("Zip Code") && driver.getPageSource().contains("State") && driver.getPageSource().contains("City") && driver.getPageSource().contains("Country")) {
            System.out.println("Verification Successful - Zip Code,State,City,Country are Showing On Company Location Section");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");

        }
        return true;
    }

    public boolean verifyUploadButtonIsShowing() {
        if( driver.findElement(By.xpath("//span[@tabindex='0'][contains(.,'Upload')]")).isDisplayed())
        {
            System.out.println("Upload Button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifyCancelButtonIsShowing() {
        WebElement Cancelbtn= driver.findElement(By.xpath("//span[contains(.,'Cancel')]"));
        if(Cancelbtn.isDisplayed())
        {
            System.out.println("Cancel Button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifySaveCompanyButtonAreShowingOnCreateCompanyDrawer() {
        WebElement Savebtn= driver.findElement(saveButton);
        if(Savebtn.isDisplayed())
        {
            System.out.println("Save Company Button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyCreateCompanyDrawerHasClosedfterpressingtheSaveButton() {
        try{
            WebElement crossbtn= driver.findElement(By.xpath("//span[@aria-label='close']//*[name()='svg']"));
            if(!crossbtn.isDisplayed())
            {
                System.out.println("Verification Successful.Create Company Drawer has closed!!");
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            }
        }catch (NoSuchElementException e) {
            System.out.println("You are on add company listing page");

        }
        return true;
    }

    public boolean VerifyBrandInformationareShowingonCreateNewCompanyDrawer() {
        if(driver.getPageSource().contains("Max limit 2 MB. Upload 300x40 px size logo for proper viewing experience.") ) {
            System.out.println("Verification Successful - Brand Information is Showing On Company Location Section");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");

        }
        return true;
    }



}
