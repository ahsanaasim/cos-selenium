package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class TroubleshootCharger extends BasePage{
    public TroubleshootCharger(WebDriver driver) {

        super(driver);
    }
    CreateCharger charger = new CreateCharger(driver);
    CustomerSignUp clearOperation =new CustomerSignUp(driver);
    Dashboard dashboard = new Dashboard(driver);
    CreateProperty property = new CreateProperty(driver);
    Random randomNum = new Random();
    CreateLocation createLocation = new CreateLocation(driver);

    public static By ThreeDotBesideEditBtn = By.xpath("//span[@class='anticon anticon-more']");
    public static By TroubleshootButton = By.xpath("//div[@class='TroubleshootSubMenu']");
    public static By TroubleShootDrawerTitle = By.xpath("//div[@class='drawerTitle wordBreak']");
    public static By ChargerInfoSection = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Charger Info')]");
    public static By ChargerStatusActionsSection = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Charger Status & Actions')]");
    public static By DiagnosisInformationSection = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Diagnosis Information')]");

    public static By ChargerTitle = By.xpath("//div[@class='grayText'][contains(text(),'Charger Title')]");
    public static By PropertyAddress = By.xpath("//div[@class='grayText'][contains(text(),'Property Address')]");
    public static By LocationTitle = By.xpath("//div[@class='grayText'][contains(text(),'Location Title')]");
    public static By HardReset = By.xpath("//button[@class='ant-btn ant-btn-default buttonsDiv']//div[contains(text(),'Hard Reset')]");
    public static By SoftReset = By.xpath("//button[@class='ant-btn ant-btn-default buttonsDiv']//div[contains(text(),'Soft Reset')]");
    public static By BootCharger = By.xpath("//button[@class='ant-btn ant-btn-default buttonsDiv']//div[contains(text(),'Boot Charger')]");
    public static By UpgradeFirmware = By.xpath("//button[@class='ant-btn ant-btn-default buttonsDiv']//div[contains(text(),'Upgrade Firmware')]");

    public static By HardResetDisabled = By.xpath("//button[@class='ant-btn ant-btn-default buttonsDiv']");
    public static By SoftResetDisabled = By.xpath("(//button[@class='ant-btn ant-btn-default buttonsDiv'])[2]");
    public static By BootChargerDisabled = By.xpath("(//button[@class='ant-btn ant-btn-default buttonsDiv'])[3]");
    public static By UpgradeFirmwareDisabled = By.xpath("(//button[@class='ant-btn ant-btn-default buttonsDiv'])[4]");
    public static By ChargerTitleName = By.xpath("//div[@class='chargerInfoText']");
    public static By PropertyAddressName = By.xpath("(//div[@class='chargerInfoText'])[2]");
    public static By LocationTitleName = By.xpath("(//div[@class='chargerInfoText'])[3]");
    public static By ChargerNotConfiguredMsg = By .xpath("//div[contains(text(),'Charger is not configured yet.')]");

    public boolean verifyTableNameMatchingWithDrawer(By tableElement, By DrawerElement) throws InterruptedException {
        Thread.sleep(7000);
        waitforPresence(ThreeDotBesideEditBtn);
        String TableName = driver.findElement(tableElement).getText();
        System.out.println(TableName);
        click(ThreeDotBesideEditBtn);
        click(TroubleshootButton);
        Thread.sleep(1500);
        waitforPresence(DrawerElement);
        String DrawerName = driver.findElement(DrawerElement).getText();
        if (TableName.equals(DrawerName)){
            System.out.println("Table data is matched with drawer data");
            return true;
        }
        else {
            System.out.println("Table data is not matched with drawer data");
            return false;
        }
    }

    public boolean verifyChangerNameChangedInTroubleshootDrawer() throws InterruptedException {
        clearOperation.FieldClear(CreateCharger.Chargername);
        String troubleshootCharger = charger.RandomChargerNameWithNumber("Troubleshoot checker charger : ");
        writeText(CreateCharger.Chargername,troubleshootCharger);
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(5000);
        click(ThreeDotBesideEditBtn);
        click(TroubleshootButton);
        String UpdatedName = driver.findElement(ChargerTitleName).getText();
        if (UpdatedName.equals(troubleshootCharger)){
            System.out.println("Charge name updated in troubleshoot drawer");
            return true;
        }
        else {
            System.out.println("Charge name is not updated in troubleshoot drawer");
            return false;
        }

    }

    public boolean verifyPropertyAddressChangedInTroubleshootDrawer() throws InterruptedException {
        Thread.sleep(4000);
        String PrevPropertyAddress = driver.findElement(ChargerListPropertyAdmin.PropertyAddress).getText();
        String PrevPropertyName = driver.findElement(ChargerListPropertyAdmin.PropertyName).getText();
        dashboard.clickonProperty();
        writeText(property.searchbar,PrevPropertyName);
        click(CreateCharger.searchargerbtn);
        click(DownCharger.EditButton);
        clearOperation.FieldClear(property.propertyAddress);
        int randomNumber = randomNum.nextInt(10000);
        System.out.println(randomNumber);
        String propertyAdd ="12"+randomNumber;
        writeText(property.propertyAddress,propertyAdd);
        click(property.savepropertybtn);
        dashboard.clickOnChargers();
        Thread.sleep(5000);
        waitforPresence(DownCharger.EditButton);
        String troubleshootCharger = "Troubleshoot checker charger";
        writeText(CreateCharger.searchchargerfield,troubleshootCharger);
        click(CreateCharger.searchargerbtn);
        click(ThreeDotBesideEditBtn);
        click(TroubleshootButton);
        Thread.sleep(2500);
        String UpdatedName = driver.findElement(PropertyAddressName).getText();
        if (UpdatedName.equals(propertyAdd)){
            System.out.println("Property Address updated in troubleshoot drawer");
            return true;
        }
        else {
            System.out.println("Property Address is not updated in troubleshoot drawer");
            return false;
        }

    }

    public boolean verifyLocationNameChangedInTroubleshootDrawer() throws InterruptedException {
        Thread.sleep(4000);
        waitforPresence(ChargerListPropertyAdmin.LocationName);
        String PrevLoc = driver.findElement(ChargerListPropertyAdmin.LocationName).getText();
        dashboard.clickonLocations();
        writeText(CreateLocation.searchbar,PrevLoc);
        click(CreateCharger.searchargerbtn);
        click(DownCharger.EditButton);
        clearOperation.FieldClear(createLocation.locationtitle);
        int randomNumber = randomNum.nextInt(10);
        System.out.println(randomNumber);
        String LocationName ="Goldner Avenue "+randomNumber;
        writeText(createLocation.locationtitle,LocationName);
        click(CreateLocation.savelocationbtn);
        dashboard.clickOnChargers();
        Thread.sleep(5000);
        waitforPresence(ThreeDotBesideEditBtn);
        String troubleshootCharger = "Troubleshoot checker charger";
        writeText(CreateCharger.searchchargerfield,troubleshootCharger);
        click(CreateCharger.searchargerbtn);
        click(ThreeDotBesideEditBtn);
        click(TroubleshootButton);
        Thread.sleep(2500);
        String UpdatedName = driver.findElement(LocationTitleName).getText();
        if (UpdatedName.equals(LocationName)){
            System.out.println("Location name updated in troubleshoot drawer");
            return true;
        }
        else {
            System.out.println("Location name is not updated in troubleshoot drawer");
            return false;
        }

    }





}
