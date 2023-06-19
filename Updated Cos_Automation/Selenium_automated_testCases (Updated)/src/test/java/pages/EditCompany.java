package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class EditCompany extends BasePage {

    public EditCompany(WebDriver driver)
    {
        super(driver);
    }


    CreateCompany company = new CreateCompany(driver);
    CreateEntity createEntity=new CreateEntity(driver);
    Random NumGenerator = new Random();
    CustomerSignUp customerSignUp = new CustomerSignUp(driver);
    CreateCharger createCharger = new CreateCharger(driver);

    By editcompanybtn = By.xpath("(//span[contains(.,'Edit')])[2]");
    public static By EditCompanyBtn = By.xpath("//span[contains(.,'Edit')]");
    public static By ShowButtonEin= By.xpath("//span[normalize-space()='Show']");
    public static By DisabledShowButton = By.xpath("//button[@class='ant-btn ant-btn-default ml-10']");
    public static By HideButtonEin= By.xpath("//span[normalize-space()='Hide']");
    public static By InvalidEinErrorMsg = By.xpath("//div[@role='alert'][contains(text(),'Please provide a valid EIN number')]");
    By activestatus = By.xpath("//div[@class='mt-5'][contains(.,'Active')]");
    By deactivatebutton = By.xpath("//span[contains(.,'Deactivate Company')]");
    By auditlogs = By.xpath("//span[@class='drawerInsideTitle'][contains(.,'Audit Log')]");
    By loadmorebtn = By.xpath("//li[contains(@class,'ant-timeline-item ant-timeline-item-last ant-timeline-item-left')]");
    By invalidemailerrmsg = By.xpath("//div[@role='alert'][contains(.,'Invalid email address')]");
    By uploadbtn = By.xpath("//span[@class='ant-upload']");
    By invalidimesionerrmsg = By.xpath("//div[@role='alert'][contains(.,'Image resolution should be 300x40 px')]");
    public static By searchbar = By.xpath("//input[@placeholder='Search by name, email or phone no']");
    public static By searchbtn = By.xpath("//button[contains(.,'Search')]");
    By companyname = By.xpath("(//div[@class='wordBreak'][contains(.,'Walmart')])[1]");
    By cancelbtn = By.xpath("//button[@type='button'][contains(.,'Cancel')]");
    By discardbtn = By.xpath("//button[contains(.,'Discard')]");
    public static By EinUpdatedStatus = By.xpath("//span[@id='einAuditLog']");

    public static By SearchCompany = By.xpath("//input[@placeholder='Search by name, email or phone no']");
    public static By AccessCompanyPortal = By.xpath("//span[@class='actionTag cursor']");




    public void GoToCompanyPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://test-admin.chargeonsite.com/company/company-management");

    }

    public void writeInCompanySearchBar(String company) throws InterruptedException {
        Thread.sleep(2500);
        waitforPresence(EditCompanyBtn);
        writeText(SearchCompany,company);
    }





    public boolean ClickonEditbutton () throws InterruptedException {
        company.waitForSpinner();
        waitVisibility(editcompanybtn);
        // waitelementtobedisplayed(editcompanybtn);
        //  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//span[contains(.,'Edit')])[2]")));
        click(editcompanybtn);
        return true;
    }

    public boolean ClickonUploadButton() {
        waitVisibility(uploadbtn);
        click(uploadbtn);
        return true;
    }

    public boolean SearchbyName(String CompanyName) {
        company.waitForSpinner();
        waitVisibility(searchbar);
        click(searchbar);
        writeText(searchbar,CompanyName);
        return true;
    }

    public boolean ClickCancelbutton () {
        waitVisibility(cancelbtn);
        click(cancelbtn);
        return true;
    }

    public boolean ClickonSearchButton() {
        //   company.waitForSpinner();
        waitelemtclickable(searchbtn);
        //  waitelementtobedisplayed(searchbtn);
        click(searchbtn);
        return true;
    }



    public boolean ClickonDiscardButton() {
        waitVisibility(discardbtn);
        click(discardbtn);
        return true;
    }

    public boolean updateLogoUsingInvalidDimension() throws IOException, InterruptedException {
        Thread.sleep(2000);
        String workingDir = System.getProperty("user.dir");
        Runtime.getRuntime().exec(workingDir + "\\resources\\UploadImage.exe");
        return true;
    }


    public boolean ClearCompanyNameFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.companyname);
        WebElement companyname= driver.findElement(By.xpath("//input[@placeholder='Company Name']"));
       /* driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        clear(company.companyname);*/
        companyname.sendKeys(Keys.CONTROL + "a");
        companyname.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemovePhoneNumberFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.phone);
        WebElement phonenumber= driver.findElement(By.xpath("//input[@placeholder='Phone']"));
       /* driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        clear(company.companyname);*/
        phonenumber.sendKeys(Keys.CONTROL + "a");
        phonenumber.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveEmailFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.email);
        WebElement email= driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys(Keys.CONTROL + "a");
        driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        email.sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        return true;
    }

    public boolean RemoveWebsiteFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.website);
        WebElement web= driver.findElement(By.xpath("//input[@placeholder='Website']"));
        //driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        web.sendKeys(Keys.CONTROL + "a");
        web.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveEINFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.ein);
        Thread.sleep(3000);
        WebElement web= driver.findElement(By.xpath("(//input[contains(@class,'ant-input')])[5]"));
        // driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        web.sendKeys(Keys.CONTROL + "a");
        web.sendKeys(Keys.DELETE);
        //Thread.sleep(2000);
        return true;
    }


    public boolean RemoveZipcodeFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.zipcode);
        Thread.sleep(3000);
        WebElement web= driver.findElement(By.xpath("//input[@placeholder='Zip Code']"));
        //driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        web.sendKeys(Keys.CONTROL + "a");
        web.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveAddressFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.address);
        Thread.sleep(3000);
        WebElement web= driver.findElement(By.xpath("//textarea[contains(@placeholder,'Address')]"));
        //driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        web.sendKeys(Keys.CONTROL + "a");
        web.sendKeys(Keys.DELETE);
        return true;
    }



    public boolean VerifyEditButtonHasDisplayed() {
        company.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if( driver.findElement(By.xpath("(//button[contains(.,'Edit')])[2]")).isDisplayed())
        {
            System.out.println("Edit button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifCompanyStatusisActiveonMoreSettingsSection() {
        waitVisibility(activestatus);
        if( driver.findElement(By.xpath("//div[@class='mt-5'][contains(.,'Active')]")).isDisplayed())
        {
            System.out.println("Company Status is Showing on Edit Company Drawer");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifDeactivateCompanyButtonIsShowingonMoreSettingsSection() {
        waitVisibility(deactivatebutton);
        if( driver.findElement(By.xpath("//span[contains(.,'Deactivate Company')]")).isDisplayed())
        {
            System.out.println("Deactivate Company button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifAuditLogsareShowingonEditComapnyDrawer() {
        waitVisibility(auditlogs);
        if( driver.findElement(By.xpath("//span[@class='drawerInsideTitle'][contains(.,'Audit Log')]")).isDisplayed())
        {
            System.out.println("Audit log section is showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifLoadmoreButtonisShowingonAuditLogsofEditComapnyDrawer() {
        waitVisibility(loadmorebtn);
        if( driver.findElement(By.xpath("//li[contains(@class,'ant-timeline-item ant-timeline-item-last ant-timeline-item-left')]")).isDisplayed())
        {
            System.out.println("Load more button has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifUpdatedCompanyInformationIsShowing() {
        company.waitForSpinner();
        waitVisibility(companyname);
        if( driver.findElement(By.xpath("(//div[@class='wordBreak'][contains(.,'Walmart')])[1]")).isDisplayed())
        {
            System.out.println("Updated Company Name has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyEditCompanyDrawerisShowing() throws InterruptedException {
        Thread.sleep(3000);
        if( driver.findElement(By.xpath("//span[@class='drawerInsideTitle'][contains(.,'Company Information')]")).isDisplayed())
        {
            System.out.println("Edit Company Drawer has displayed");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyDiscardButtonisShowingonConfirmationPopup() {
        waitVisibility(discardbtn);
        if( driver.findElement(By.xpath("//button[contains(.,'Discard')]")).isDisplayed())
        {
            System.out.println("Discard Button Is Showing on Confirmation Popup.Clicking on it...");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }


    public boolean VerifyInvalidEmailErrorMessage(String expectedText) {
        assertEquals(invalidemailerrmsg, expectedText);
        return true;


    }

    public boolean VerifyInvalidImageDimesionErrorMessage(String expectedText) {
        try {
            waitVisibility(invalidimesionerrmsg);
            assertEquals(invalidimesionerrmsg, expectedText);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean verifyHiddenEINNumberAndShowButton() throws InterruptedException {
        Thread.sleep(5000);
        waitforPresence(company.ein);
        String EinProtected = driver.findElement(company.ein).getAttribute("value");
        String FieldDisable = driver.findElement(company.ein).getAttribute("class");
        System.out.println(EinProtected);
        System.out.println(FieldDisable);
        if (EinProtected.contains("*****") && FieldDisable.contains("ant-input ant-input-disabled") && driver.findElement(ShowButtonEin).isDisplayed()){
            System.out.println("Encrypted & Field disabled and Show button is visible");
            return true;
        }
        else {
            System.out.println("Not Encrypted");
            return false;
        }
    }
    public boolean verifyEinNumberGetEnabled() throws InterruptedException {
        Thread.sleep(5000);
        waitforPresence(company.ein);
        String FieldEnable = driver.findElement(company.ein).getAttribute("class");
        String EIN = driver.findElement(company.ein).getAttribute("value");
        System.out.println(FieldEnable);
        System.out.println(EIN);
        String Expected = "234567899";
        if (FieldEnable.contains("ant-input ant-input-status-success") && EIN.equals(Expected)){
            System.out.println("Ein Number enabled & Number is Showing");
            return true;
        }
        else {
            System.out.println("Problem");
            return false;
        }
    }



    public boolean verifyEinSaving() throws InterruptedException {
        customerSignUp.FieldClear(company.ein);
        int EinNumber = 100000000 + NumGenerator.nextInt(900000000);
        String LatestEin = Integer.toString(EinNumber);
        System.out.println("Ein Number: "+EinNumber);
        createCharger.writeInputText(company.ein,LatestEin,1000);
        createCharger.ClickButton(EditEntity.SaveEntityButton,1500);
        createCharger.ClickButton(EditCompanyBtn,3500);
        createCharger.ClickButton(ShowButtonEin,2000);
        Thread.sleep(1500);
        String Ein = driver.findElement(company.ein).getAttribute("value");
        if (LatestEin.equals(Ein)){
            System.out.println("Ein Edited Successfully");
            return true;
        }
        else {
            System.out.println("Not edited");
            return false;
        }

    }
    public boolean verifyErrorMsgForInvalidInput() throws InterruptedException {
        Thread.sleep(2000);
        String EinErrMsg = driver.findElement(InvalidEinErrorMsg).getText();
        String Expected = "Please provide a valid EIN number";
        if (EinErrMsg.equals(Expected)){
            System.out.println("Error Message is showing perfecty");
            return true;
        }
        else {
            System.out.println("Not edited");
            return false;
        }

    }
    public boolean verifyShowButtonDisabled() throws InterruptedException {
        Thread.sleep(4000);
        Boolean Show=driver.findElement(DisabledShowButton).isEnabled();
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
    public boolean verifyShowButtonClickable() throws InterruptedException {
        Thread.sleep(3000);
        String FieldDisable = driver.findElement(company.ein).getAttribute("class");
        System.out.println(FieldDisable);
        String Expected = "ant-input ant-input-disabled";
        if (FieldDisable.equals(Expected)){
            System.out.println("Field is disable");
            return true;
        }
        else {
            System.out.println("Something wrong");
            return false;
        }

    }

    public boolean verifyAuditLogStatusForEinChange(){
        String UpdateStatus = driver.findElement(EinUpdatedStatus).getText();
        String Expected = "EIN updated";
        if (UpdateStatus.equals(Expected)){
            System.out.println("Ein number changed showing in audit log");
            return true;
        }
        else {
            System.out.println("Wrong!!!!!!!");
            return false;
        }

    }



}


