package pages;

import org.openqa.selenium.*;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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

    public static By editcompanybtn = By.xpath("(//span[contains(.,'Edit')])[2]");
    public static By EditCompanyBtn = By.xpath("//span[contains(.,'Edit')]");
    public static By ShowButtonEin= By.xpath("//span[normalize-space()='Show']");
    public static By DisabledShowButton = By.xpath("//button[@class='ant-btn ant-btn-default ml-10']");
    public static By HideButtonEin= By.xpath("//span[normalize-space()='Hide']");
    public static By InvalidEinErrorMsg = By.xpath("//div[@role='alert'][contains(text(),'Please provide a valid EIN number')]");
    public static By activestatus = By.xpath("//div[@class='mt-5'][contains(.,'Active')]");
    public static By deactivatebutton = By.xpath("//span[contains(.,'Deactivate Company')]");
    public static By auditlogs = By.xpath("//span[@class='drawerInsideTitle'][contains(.,'Audit Log')]");
    public static By loadmorebtn = By.xpath("//li[contains(@class,'ant-timeline-item ant-timeline-item-last ant-timeline-item-left')]");
    public static By invalidemailerrmsg = By.xpath("//div[@role='alert'][contains(.,'Invalid email address')]");
    public static By uploadbtn = By.xpath("//span[@class='ant-upload']");
    public static By invalidimesionerrmsg = By.xpath("//div[@role='alert'][contains(.,'Image resolution should be 300x40 px')]");
    public static By searchbar = By.xpath("//input[@placeholder='Search by name, email or phone no']");
    public static By searchbtn = By.xpath("//button[contains(.,'Search')]");
    public static By companyname = By.xpath("(//div[@class='wordBreak'][contains(.,'Rich Information Technology')])[1]");
    public static By cancelbtn = By.xpath("//button[@type='button'][contains(.,'Cancel')]");
    public static By discardbtn = By.xpath("//button[contains(.,'Discard')]");
    public static By EinUpdatedStatus = By.xpath("//span[@id='einAuditLog']");

    public static By SearchCompany = By.xpath("//input[@placeholder='Search by name, email or phone no']");
    public static By AccessCompanyPortal = By.xpath("//span[@class='actionTag cursor']");
    public static By ErrorMsg = By.xpath("//div[@class='ant-form-item-explain-error']");
    public static By SaveCompanyButton = By.xpath("//button[@class='ant-btn ant-btn-primary ml-15 h-40 drawerFBtn']");
    public static By ShowButtonBesideEINField = By.xpath("//button[@class='ant-btn ant-btn-default ml-10']");





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
        waitVisibility(EditCompanyBtn);
        click(EditCompanyBtn);
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

    public boolean ClickonSearchButton() throws InterruptedException {
        company.waitForSpinner();
        waitVisibility(searchbtn);
        waitelemtclickable(searchbtn);
        click(searchbtn);
        return true;
    }



    public boolean ClickonDiscardButton() {
        waitVisibility(discardbtn);
        click(discardbtn);
        return true;
    }

    public boolean uploadMoreThan3MBSizeLogo() throws IOException, InterruptedException {
        Thread.sleep(2000);
        String workingDir = System.getProperty("user.dir");
        Runtime.getRuntime().exec(workingDir + "\\resources\\MoreThan3MB.exe");
        return true;
    }


    public boolean ClearCompanyNameFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.companyname);
        Thread.sleep(2000);
        WebElement companyname= driver.findElement(company.companyname);
       /* driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        clear(company.companyname);*/
        companyname.sendKeys(Keys.CONTROL + "a");
        Thread.sleep(1000);
        companyname.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemovePhoneNumberFromEditCompanyDrawer () throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(company.phone);
        waitforPresence(CreateCompany.phone);
        waitelemtclickable(CreateCompany.phone);
        WebElement NumberField = driver.findElement(CreateCompany.phone);
        for(int i = 0; i <10 ;i++)
        {
            NumberField.sendKeys(Keys.chord(Keys.BACK_SPACE));
        }
        return true;
    }

    public boolean RemoveEmailFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.email);
        WebElement email= driver.findElement(By.xpath("//input[@placeholder='Email']"));
        Thread.sleep(3000);
        email.sendKeys(Keys.CONTROL + "a");
        email.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveWebsiteFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.website);
        Thread.sleep(1500);
        WebElement web= driver.findElement(company.website);
        //driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        web.sendKeys(Keys.CONTROL + "a");
        Thread.sleep(1000);
        web.sendKeys(Keys.DELETE);
        return true;
    }

    public boolean RemoveEINFromEditCompanyDrawer () throws InterruptedException {
        waitVisibility(company.ein);
        Thread.sleep(3000);
        click(EditCompany.ShowButtonEin);
        Thread.sleep(2000);
        WebElement web= driver.findElement(CreateCompany.ein);
        // driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
        web.sendKeys(Keys.CONTROL + "a");
        web.sendKeys(Keys.DELETE);
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
        if( driver.findElement(By.xpath("(//div[@class='wordBreak'][contains(.,'Rich Information Technology')])[1]")).isDisplayed())
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
        createCharger.ClickButton(EditCompany.SaveCompanyButton,1500);
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
    public boolean verifyErrorMsgForInvalidEINInput() throws InterruptedException {
        Thread.sleep(2000);
        String EinErrMsg = driver.findElement(InvalidEinErrorMsg).getText();
        String Expected = "Please provide a valid EIN number";
        if (EinErrMsg.equals(Expected)){
            System.out.println("Error Message is showing perfectly");
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

    public boolean VerifySearchResultCount() throws InterruptedException {
        Thread.sleep(4000);
        waitVisibility(CreateCharger.SearchResultCount);
        String countText = driver.findElement(CreateCharger.SearchResultCount).getText();
        countText = countText.replaceAll("Showing Companies: ", "");
        int count = Integer.parseInt(countText);
        System.out.println(count);
        if(count==1)
        {
            System.out.println("Search Count is 1");
            return true;
        }
        else{
            System.out.println("Something Went Wrong!!");
            return false;
        }
    }



}