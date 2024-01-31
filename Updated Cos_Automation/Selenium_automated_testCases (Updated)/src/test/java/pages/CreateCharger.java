package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Random;

public class CreateCharger extends BasePage {
    public CreateCharger(WebDriver driver)
    {

        super(driver);
    }
    Random randomName = new Random();

    public static By addChargerBtn = By.xpath("//button[@type='button']//span[contains(text(),'Add New Charger')]");
    public static By addChargerBtnDisabled= By.xpath("//button[@class='ant-btn ant-btn-primary btnPadding']");
    public static By addNewChargerDrawer = By.xpath("//span[@class='drawerTitle'][contains(.,'Add New Charger')]");
    public static By outsideDrawer = By.xpath("//div[@class='ant-drawer-mask']");
    public static By crossBtnOfDrawer = By.cssSelector("button[class='ant-drawer-close']");
    public static By cancelButtonOfDrawer = By.xpath("//span[contains(text(),'Cancel')]");
    public static By discardAndContinuePopUp = By.xpath("//div[@class='ant-modal-confirm-content'][contains(.,'Do you want to discard or continue?')]");
    public static By discardBtn = By.xpath("//button[@class='ant-btn ant-btn-default'][contains(.,'Discard')]");
    public static By continueBtn = By.xpath("//button[@class='ant-btn ant-btn-primary'][contains(.,'Continue')]");
    public static By chargerName = By.xpath("//input[@placeholder='Charger Name']");
    public static By chargerPlugType = By.xpath("//span[@title='J1772']");
    public static By chargingRateField = By.xpath("(//input[@class='ant-select-selection-search-input'])[2]");
    public static By fieldCrossButton = By.xpath("//span[@class='anticon anticon-close-circle']");
    public static By searchChargerField = By.xpath("//input[@placeholder='Search by property, charger & location title']");
    public static By searchChargerBtn = By.xpath("//span[contains(text(),'Search')]");
    public static By searchResultCount = By.xpath("//span[@class='showCount']");
    public static By chargerNameErrorMsg = By.xpath("//div[contains(text(),'Charger name is required')]");
    public static By propertyNameErrMsg = By.xpath("//div[contains(text(),'Property is required')]");
    public static By chargingRateRequiredMessage = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Charging rate is required')]");
    public static By PlugTypeRequiredErrorMessage = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Plug type is required')]");
    public static By selectproperty = By.xpath("(//input[@class='ant-select-selection-search-input'])[3]");
    public static By pname =By.xpath("(//div[contains(@class,'ant-select-item-option-content')])[1]");
    public static By lname= By.xpath("//div[contains(text(),'Electric Charger')]");
    //div[contains(@class,'ant-select-item-option-content')])[12]
    public static By selectlocation = By.id("rc_select_2");
    public static By savecharger = By.xpath("//button[@type='submit']//span[contains(text(),'Save Charger')]");
    public static By cancel= By.xpath("//button[@type='button']");
    public static By location = By.xpath("(//input[@class='ant-select-selection-search-input'])[4]");
    public static By confirmationpopup = By.xpath("//span[normalize-space()='Charger created successfully']");
    //span[contains(.,'Property created successfully')]
    public static By nodatafromsearch = By.xpath("//*[name()='path' and contains(@class,'ant-empty-')]");
    public static By loader = By.xpath("(//i[@class='ant-spin-dot-item'])[3]");

    public static By SelectManufacturer = By.xpath("(//input[@class='ant-select-selection-search-input'])[5]");
    public static By SelectDeviceModel = By.xpath("(//input[@class='ant-select-selection-search-input'])[6]");

    public void GoToChargers() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://test-admin.chargeonsite.com/property/charger");
    }

    public boolean ClickOnAddChargerButton () throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(addChargerBtn);
        click(addChargerBtn);
        return true;
    }

    public boolean clickonSaveChargerButton () throws InterruptedException {
        Thread.sleep(2000);
        waitelemtclickable(savecharger);
        click(savecharger);
        return true;
    }
    public boolean clickonPropertySelect () throws InterruptedException {
        Thread.sleep(2000);
        waitelemtclickable(selectproperty);
        click(selectproperty);
        return true;
    }

    public boolean clickonlocation() throws InterruptedException {
        Thread.sleep(1000);
        waitelemtclickable(location);
        click(location);
        return true;
    }

    public boolean clickonoutsidethedrawer() throws InterruptedException {
        Thread.sleep(1000);
        waitelemtclickable(outsideDrawer);
        click(outsideDrawer);
        return true;
    }
    public boolean clickOnCrossButtonOfTheDrawer() throws InterruptedException {
        Thread.sleep(2000);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(crossBtnOfDrawer);
        click(crossBtnOfDrawer);
        return true;
    }
    public boolean clickOnCancelButtonOfTheDrawer() throws InterruptedException {
        Thread.sleep(2000);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(cancelButtonOfDrawer);
        click(cancelButtonOfDrawer);
        return true;
    }
    public boolean clickOnDiscardButtonOfPopUp() throws InterruptedException {
        Thread.sleep(2000);
        //waitforInVisibility(loader);
        waitelementtobedisplayed(discardBtn);
        click(discardBtn);
        return true;
    }


    public boolean writeNewChargerName(String NewChargerName) throws InterruptedException {
        Thread.sleep(3000);
        writeText(chargerName,NewChargerName);
        return true;
    }

    public String writeChargerName(){
        String [] chargerNamePrefix = {"BRT","WQAA","DSAZ","QAXZ"};
        int ranPrefix = randomName.nextInt(chargerNamePrefix.length);
        int ranNum = randomName.nextInt(100);
        String chargerName=chargerNamePrefix[ranPrefix]+ranNum;
        System.out.println("Created charger : "+chargerName);
        return chargerName;
    }

    public boolean writePropertyName(String PropertyName3) throws InterruptedException {
        Thread.sleep(2000);
        writeText(selectproperty,PropertyName3);
        return true;
    }


    public boolean writeLocationName(String PropertyName3) throws InterruptedException {
        Thread.sleep(3000);
        writeText(selectproperty,PropertyName3);
        return true;
    }




    public boolean selectPropertyNameFromSelectPropertyDropdown() throws InterruptedException {
        Thread.sleep(3000);
        waitelementtobedisplayed(pname);
        //waitelemtclickable(pname);
        click(pname);
//        click(pname);
        return true;
    }
    public boolean selectLoactionNameFromSelectPropertyDropdown() throws InterruptedException {
        Thread.sleep(3000);
        waitelementtobedisplayed(lname);
        //waitelemtclickable(pname);

        click(lname);
//        click(pname);
        return true;
    }
    public boolean verifyAddNewChargerButtonHasDisplayed() throws InterruptedException {
        //company.waitForSpinner();
        Thread.sleep(3000);
        //waitVisibility(addchargerbtn);
        if (driver.findElement(addChargerBtn).isDisplayed()) {
            System.out.println("Add New Charger button has displayed and Drawer is Closed Now");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean verifyDrawerIsClosed() throws InterruptedException {
        //company.waitForSpinner();
        Thread.sleep(3000);
        waitVisibility(DashboardPropertyDetails.TopAccountName);
        if (driver.findElement(DashboardPropertyDetails.TopAccountName).isDisplayed()) {
            System.out.println("Drawer is closed");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }
    public boolean verifyAddNewChargerButtonHasnotDisplayed() throws InterruptedException {
        //company.waitForSpinner();
        Thread.sleep(2000);
        //waitVisibility(addchargerbtn);
        if (!driver.findElement(addChargerBtn).isDisplayed()) {
            System.out.println("Add New Charger button has not displayed");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }
    public boolean verifyChargerNameErrorMsgHasDisplayed() throws InterruptedException {
        //company.waitForSpinner();
        Thread.sleep(2000);
        waitVisibility(chargerNameErrorMsg);
        if (driver.findElement(chargerNameErrorMsg).isDisplayed()) {
            System.out.println("Error message is shown");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }
    public boolean verifyPropertyNameErrorMsgHasDisplayed() throws InterruptedException {
        //company.waitForSpinner();
        Thread.sleep(1000);
        waitVisibility(propertyNameErrMsg);
        if (driver.findElement(propertyNameErrMsg).isDisplayed()) {
            System.out.println("Error message is shown");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }

    public boolean VerifyAddNewChargerDrawerHasDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(addNewChargerDrawer);
        if( driver.findElement(By.xpath("//span[@class='drawerTitle'][contains(.,'Add New Charger')]")).isDisplayed())
        {
            System.out.println("Create New Entity drawer has displayed");
            return true;
        }
        else{
            System.out.println("Something Went Wrong!!");
            return false;
        }
    }
    public boolean VerifySearchResultCount() throws InterruptedException {
        Thread.sleep(4000);
        waitVisibility(searchResultCount);
        String countText = driver.findElement(searchResultCount).getText();
        countText = countText.replaceAll("Showing Chargers: ", "");
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
    public boolean VerifyConfirmationPopUpHasDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        waitVisibility(confirmationpopup);
        if( driver.findElement(confirmationpopup).isDisplayed())
        {
            System.out.println("New Charger Has been Created Successfully");
            return true;
        }
        else{
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }
    public boolean verifyDiscadContinuePopupHasDisplayed() throws InterruptedException {
        //company.waitForSpinner();
        Thread.sleep(1000);
        waitVisibility(discardAndContinuePopUp);
        if (driver.findElement(discardAndContinuePopUp).isDisplayed()) {
            System.out.println("Discard or Continue Pop up has displayed");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }
    public boolean verifyPopUpContainsDiscardAndContinueButton() throws InterruptedException {
        Thread.sleep(1000);
        if(driver.getPageSource().contains("Discard") && driver.getPageSource().contains("Continue")) {
            System.out.println("Verification Successful - Discard and Continue Button is showing");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }
    public boolean verifyDrawerContainsAllNecessarySection() throws InterruptedException {
        Thread.sleep(2000);
        if(driver.getPageSource().contains("Charger Name") && driver.getPageSource().contains("Plug Type") && driver.getPageSource().contains("Charging Rate") && driver.getPageSource().contains("Select Property") && driver.getPageSource().contains("Select Location")) {
            System.out.println("Verification Successful - All the Necessary Section in Drawer Showing");

        }else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
        return true;
    }
    public boolean verifyNoDataFromInvalidSearch() throws InterruptedException {
        Thread.sleep(2000);
        //waitVisibility(addchargerbtn);
        if (driver.findElement(nodatafromsearch).isDisplayed()) {
            System.out.println("Discard or Continue Pop up has displayed");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }


    public String RandomChargerNameWithNumber(String name){
        int randomNumber = randomName.nextInt(10000);
        System.out.println(randomNumber);
        String charger =name+randomNumber;
        return charger;
    }

    public void selectChargingRate(String ChargingRate) throws InterruptedException {
        waitforPresence(chargingRateField);
        click(chargingRateField);
        writeText(chargingRateField,ChargingRate);
        WebElement selectitem = driver.findElement(chargingRateField);
        Thread.sleep(3000);
        selectitem.sendKeys(Keys.ENTER);
    }

    public void selectProperty(String Property) throws InterruptedException {
        waitforPresence(selectproperty);
        clickButton(selectproperty,2500);
        writeInputText(selectproperty,Property,2500);
        WebElement selectitem = driver.findElement(selectproperty);
        Thread.sleep(4000);
        selectitem.sendKeys(Keys.ENTER);
    }

    public void selectLocation(String Location) throws InterruptedException {
        waitforPresence(location);
        clickButton(location,2500);
        writeInputText(location,Location,2500);
        WebElement selectitem = driver.findElement(location);
        Thread.sleep(4000);
        selectitem.sendKeys(Keys.ENTER);
    }

    public boolean verifyChargerPlugTypeIsByDefaultSelected(){
        waitforPresence(chargerPlugType);
        if (driver.findElement(chargerPlugType).isDisplayed()){
            System.out.println("Charger plug type is selected");
            return true;
        }
        else {
            System.out.println("Charger type is not selected");
            return false;
        }
    }

    public boolean clearChargerPlugTypeField() throws InterruptedException {
        waitVisibility(chargerPlugType);
        Thread.sleep(10000);
        click(fieldCrossButton);
        return true;
    }


    public void bootAChargerAsDummy(String ChargerName) throws InterruptedException {
        EditChargerCosAdminUpdated edit = new EditChargerCosAdminUpdated(driver);
        Dashboard dashboard = new Dashboard(driver);
        SimulationPage register = new SimulationPage(driver);
        GoToChargers();
        edit.writeInSearchBar(searchChargerField,ChargerName,3500);
        clickButton(CreateCharger.searchChargerBtn,2000);
        clickButton(CosAdminChargerList.EditButton,2000);
        clickButton(UpdateChargerPropertyAdmin.CopyButton,2000);
        dashboard.refreshBrowser();
        clickButton(SimulationPage.SimulationTab,2000);
        register.GoToRegisterPage();
        writeInputText(SimulationPage.RegisterField,register.getClipboardURL(),1500);
        clickButton(SimulationPage.BootChargerAsDummy,1000);



    }

    public String chargingRate() throws InterruptedException {
        Random random = new Random();
        Thread.sleep(1000);
        String[] chargerRate = {"7.70 kW","19.20 kW","9.60 kW","11.50 kW"};
        int index = random.nextInt(chargerRate.length);
        return chargerRate[index];

    }

    public String deviceModelEaton() throws InterruptedException {
        Random random = new Random();
        Thread.sleep(1000);
        String[] chargerRate = {"GMEV32BR-JB","GMEV32BR-WCPL","GMEV48CME1-WC","GMEV40CMC1B-WC","GMEV32BAB-DC","GMEV80CMC1B-WC","GMEV32BAB-JB","GMEV80CME1B-WC"};
        int index = random.nextInt(chargerRate.length);
        return chargerRate[index];

    }


    public void selectChargingRate() throws InterruptedException {
        waitforPresence(chargingRateField);
        click(chargingRateField);
        writeText(chargingRateField,chargingRate());
        WebElement selectitem = driver.findElement(chargingRateField);
        Thread.sleep(5000);
        selectitem.sendKeys(Keys.ENTER);
    }


    public void selectManufacturer() throws InterruptedException {
        waitforPresence(SelectManufacturer);
        click(SelectManufacturer);
        writeText(SelectManufacturer,"Eaton");
        WebElement selectitem = driver.findElement(SelectManufacturer);
        Thread.sleep(4000);
        selectitem.sendKeys(Keys.ENTER);
    }

    public void selectDeviceModel() throws InterruptedException {
        waitforPresence(SelectDeviceModel);
        click(SelectDeviceModel);
        writeText(SelectDeviceModel,deviceModelEaton());
        WebElement selectitem = driver.findElement(SelectDeviceModel);
        Thread.sleep(3000);
        selectitem.sendKeys(Keys.ENTER);
    }



    public String chargerName() throws InterruptedException {
        Random random = new Random();
        Thread.sleep(1000);
        String[] chargerName = {"Ac charger 7KW Wallbox", "Sinoliam", "Charger maker","Nanjing Kangni Energy","Zilong New Energy","Penoda Electrical Co", "Enel x"};
        int index = random.nextInt(chargerName.length);
        return chargerName[index];

    }

    /*public String writeChargerName() throws InterruptedException {
        Random numGenerator = new Random();
        Thread.sleep(1000);
        int randomNumber = numGenerator.nextInt(10000);
        String company=chargerName()+" "+randomNumber;
        return company;
    }*/







}
