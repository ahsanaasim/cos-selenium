package pages;

import org.openqa.selenium.*;
import org.testng.Assert;

import java.util.Properties;
import java.util.Random;

public class DashboardPropertyDetails extends BasePage {
    public DashboardPropertyDetails(WebDriver driver)
    {
        super(driver);
    }
    Properties prop = ConfigUtill.getConfig();
    GuestFlow guestFlow = new GuestFlow(driver);
    LoginPage loginPage =new LoginPage(driver);
    CreateLocation createLocation = new CreateLocation(driver);
    Random objGenerator = new Random();
    CreateCharger createCharger = new CreateCharger(driver);
    EditChargerCosAdminUpdated editChargerCosAdminUpdated = new EditChargerCosAdminUpdated(driver);

    public static By DetailsBtn1 = By.xpath("//Button[@class='ant-btn ant-btn-default']");
    public static By DetailsBtn2 = By.xpath("(//Button[@class='ant-btn ant-btn-default'])[2]");
    public static By DetailsBtn3 = By.xpath("(//Button[@class='ant-btn ant-btn-default'])[3]");
    public static By DetailsBtn4 = By.xpath("(//Button[@class='ant-btn ant-btn-default'])[4]");
    public static By DetailsBtn5 = By.xpath("(//Button[@class='ant-btn ant-btn-default'])[5]");
    public static By PropertyTitle = By.xpath("//div[@class='wordBreak flex']");
    public static By SecondPropertyTitle = By.xpath("(//div[@class='wordBreak flex'])[2]");
    public static By DrawerTitle = By.xpath("//div[@class='drawerTitle wordBreak']");
    public static By DrawerLocationTitle = By.xpath("//div[@class='locationTitle']");
    public static By DrawerLocationTitle2 = By.xpath("(//div[@class='locationTitle'])[2]");
    public static By DrawerLocationTitle3 = By.xpath("(//div[@class='locationTitle'])[3]");
    public static By DrawerLocationTitle4 = By.xpath("(//div[@class='locationTitle'])[4]");
    public static By NoChargermsg = By.xpath("//div[contains(text(),'No charger found')]");
    public static By NoChargermsg2 = By.xpath("(//div[contains(text(),'No charger found')])[2]");
    public static By NoChargermsg3 = By.xpath("(//div[contains(text(),'No charger found')])[3]");
    public static By NoChargerAndLocation = By.xpath("//div[@class='noLocationView']");
    public static By OfflineTagBesideLocation = By.xpath("//span[@class='ant-tag ant-tag-warning offlineTag']");
    public static By OfflineTagBesideLocation2 = By.xpath("(//span[@class='ant-tag ant-tag-warning offlineTag'])[2]");
    public static By OfflineTagBesideLocation3 = By.xpath("(//span[@class='ant-tag ant-tag-warning offlineTag'])[3]");
    public static By ChargerName = By.xpath("//div[@class='chargerName']");
    public static By ChargerName2 = By.xpath("(//div[@class='chargerName'])[2]");
    public static By ChargerName3 = By.xpath("(//div[@class='chargerName'])[3]");
    public static By ChargerName4 = By.xpath("(//div[@class='chargerName'])[4]");
    public static By ChargerName5 = By.xpath("(//div[@class='chargerName'])[5]");
    public static By ChargerName6 = By.xpath("(//div[@class='chargerName'])[6]");
    public static By ChargerName7 = By.xpath("(//div[@class='chargerName'])[7]");
    public static By ChargerName25 = By.xpath("(//div[@class='chargerName'])[25]");

    public static By ChargerOfflineStatus = By.xpath("//div[@class='statusText offlineText']");
    public static By ChargerOfflineStatus2 = By.xpath("(//div[@class='statusText offlineText'])[2]");
    public static By ChargerOfflineStatus3 = By.xpath("(//div[@class='statusText offlineText'])[3]");
    public static By ChargerOtherStatus = By.xpath("//div[@class='statusText othersText'][contains(text(),'Others')]");
    public static By TopAccountName = By.xpath("//div[@class='primary-color mr-10 capitalizeIt']");
    public static By SimulatorChargerStatusField = By.id("rc_select_0");
    public static By AvailableStatus = By.xpath("//div[@class=' availableText']");
    public static By AvailableStatusInDashboard = By.xpath("//span[@class='ant-tag ant-tag-success']");
    public static By InUseStatus = By.xpath("//div[@class=' isUseText']");
    public static By InUseStatusInDashboard = By.xpath("//span[@class='ant-tag ant-tag-processing']");
    public static By AvailableStatusSimulator = By.xpath("//div[@class='ant-row mt-20 subTitle']//div[2]");
    public static By SimulatorChargerStatusSaveBtn = By.xpath("//button[@class='ant-btn ant-btn-default save-button']");
    public static By LocationCount = By.xpath("//div[@class='wordBreak']");
    public static By TotalChargerCount = By.xpath("(//div[@class='wordBreak'])[2]");
    public static By Logout = By.xpath("//div[normalize-space()='Logout']");



    public void LogoutFromExistingAccount() throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(3000);
        waitforPresence(EditChargerCosAdminUpdated.ProfileTop);
        click(EditChargerCosAdminUpdated.ProfileTop);
        waitforPresence(Logout);
        click(Logout);
    }




    public boolean verifyDetailsBesideEveryProperty(){
        waitforPresence(DetailsBtn1);
        if (driver.findElement(DetailsBtn1).isDisplayed() && driver.findElement(DetailsBtn2).isDisplayed() && driver.findElement(DetailsBtn3).isDisplayed() && driver.findElement(DetailsBtn4).isDisplayed() && driver.findElement(DetailsBtn5).isDisplayed()){
            System.out.println("There will a see details button under action column beside every property name");
            return true;
        }
        else {
            System.out.println("Not Showing Properly");
            return false;
        }
    }

    public boolean verifySeeDetailsButtonText(){
        waitforPresence(DetailsBtn1);
        String ButtonText = driver.findElement(DetailsBtn1).getText();
        String ExpectedButtonText = "See Details";
        if (ButtonText.equals(ExpectedButtonText)){
            System.out.println("Button text is fine");
            return true;
        }
        else {
            System.out.println("Button Text Mismatch");
            return false;
        }

    }
    public boolean verifyDetailsDrawerTitle() throws InterruptedException {
        Thread.sleep(5000);
        waitforPresence(DetailsBtn1);
        String PropertyName = driver.findElement(PropertyTitle).getText();
        System.out.println("Property name in table: "+PropertyName);
        click(DetailsBtn1);
        Thread.sleep(5000);
        waitforPresence(DrawerTitle);
        String Expected = driver.findElement(DrawerTitle).getText();
        System.out.println("Drawer title: "+Expected);
        if (PropertyName.equals(Expected)){
            System.out.println("Matched");
            return true;
        }
        else {
            System.out.println("Not Matched");
            return false;
        }

    }
    public boolean verifyDetailsDrawerLocationTitle() throws InterruptedException {
        waitforPresence(DetailsBtn1);
        click(DetailsBtn2);
        Thread.sleep(5000);
        waitforPresence(DrawerLocationTitle);
        String PropertyName = driver.findElement(DrawerLocationTitle).getText();
//        String Expected ="Charging Location";
        if (!PropertyName.isEmpty()){
            System.out.println("Matched");
            return true;
        }
        else {
            System.out.println("Not Matched");
            return false;
        }

    }
    //    public boolean verifyNoLocationMsg(){
//        waitforPresence(DetailsBtn1);
//        click(DetailsBtn4);
//        waitforPresence(PropertyTitle);
//        String NoFoundMsg = driver.findElement(Willbeadded)
//        String Expected = "No location found";
//        if (PropertyName.equals(Expected)){
//            System.out.println("Matched");
//            return true;
//        }
//        else {
//            System.out.println("Not Matched");
//            return false;
//        }
//
//    }
    public boolean verifyNoChargerMsg() throws InterruptedException {
        waitforPresence(DetailsBtn1);
        click(DetailsBtn1);
        Thread.sleep(5000);
        waitforPresence(NoChargermsg);
        String NoFoundMsg = driver.findElement(NoChargermsg).getText();
        System.out.println(NoFoundMsg);
        if (driver.findElement(NoChargermsg).isDisplayed() || driver.findElement(NoChargermsg2).isDisplayed() || driver.findElement(NoChargermsg3).isDisplayed()){
            System.out.println("Matched");
            return true;
        }
        else {
            System.out.println("Not Matched");
            return false;
        }

    }
    public boolean verifyNoLocationAndCharger() throws InterruptedException {
        waitforPresence(DetailsBtn1);
        click(DetailsBtn1);
        Thread.sleep(5000);
        String NoFoundMsg = driver.findElement(NoChargerAndLocation).getText();
        String Expected = "No location and charger found";
        if (NoFoundMsg.equals(Expected)){
            System.out.println("Matched");
            return true;
        }
        else {
            System.out.println("Not Matched");
            return false;
        }

    }
    public boolean verifyDrawerClosed() throws InterruptedException {
        Thread.sleep(5000);
        if (driver.findElement(TopAccountName).isDisplayed()){
            System.out.println("Pass");
            return true;
        }
        else {
            System.out.println("Fail");
            return false;
        }

    }
    public void selectChargerStatus(String text) throws InterruptedException {
        waitforPresence(SimulatorChargerStatusField);
        writeText(SimulatorChargerStatusField,text);
        WebElement ChargerStatus = driver.findElement(SimulatorChargerStatusField);
        Thread.sleep(2000);
        ChargerStatus.sendKeys(Keys.ENTER);

    }
    public boolean verifyChargerAvailabilityInSeeDetails() throws InterruptedException {
        Thread.sleep(10000);
        waitforPresence(AvailableStatusSimulator);
        String SimulatorStatus = driver.findElement(AvailableStatusSimulator).getText().replaceAll(": ","");
        System.out.println(SimulatorStatus);
        CloseTab();
        guestFlow.SwitchToTab(0);
        driver.navigate().refresh();
        Thread.sleep(7000);
        waitforPresence(DetailsBtn1);
        String Available = driver.findElement(AvailableStatusInDashboard).getText().replaceAll("[^0-9]","");
        int AvailableCount = Integer.parseInt(Available);
        System.out.println(AvailableCount);
        click(DetailsBtn1);
        Thread.sleep(4000);
        waitforPresence(DrawerTitle);
        String DetailsStatus = driver.findElement(AvailableStatus).getText();
        System.out.println(DetailsStatus);
        if (SimulatorStatus.equals(DetailsStatus) && AvailableCount==1 ){
            System.out.println("Charger Status Matched");
            return true;
        }
        else{
            System.out.println("Not Matched");
            return false;
        }


    }

    public boolean verifyChargerInUseStatusSeeDetails() throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(5000);
        waitforPresence(DetailsBtn1);
        String InUse = driver.findElement(InUseStatusInDashboard).getText().replaceAll("[^0-9]","");
        int InUseCount = Integer.parseInt(InUse);
        System.out.println(InUseCount);
        click(DetailsBtn1);
        Thread.sleep(5000);
        waitforPresence(DrawerLocationTitle);
        String DetailsStatus = driver.findElement(InUseStatus).getText();
        System.out.println(DetailsStatus);
        if (DetailsStatus.equals("In Use") && InUseCount==1){
            System.out.println("Charger Status Matched");
            return true;
        }
        else{
            System.out.println("Not Matched");
            return false;
        }


    }
    public void CloseTab() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }


    public boolean verifyOfflineTagsAreShowingForOfflineLocations() throws InterruptedException {
        Thread.sleep(3000);
        WebElement Tag1 = driver.findElement(OfflineTagBesideLocation);
        WebElement Tag2 = driver.findElement(OfflineTagBesideLocation2);
        if (Tag1.isDisplayed() && Tag2.isDisplayed()){
            System.out.println("Offline tags are showing for Offline locations");
            return true;
        }
        else {
            System.out.println("Offline tags are not showing for Offline locations");
            return false;
        }

    }
    public boolean verifyChargerStatusOfflineForOfflineLocations() throws InterruptedException {
        Thread.sleep(5000);
        waitforPresence(ChargerOfflineStatus3);
        String Charger = readText(ChargerName);
        String Status = readText(ChargerOfflineStatus);
        String ChargerNameWithStatus = Charger+" "+Status;
        System.out.println("Charger name:  "+Charger+" | "+"Status: "+Status);
        String Charger2 = readText(ChargerName2);
        String Status2 = readText(ChargerOfflineStatus2);
        String ChargerNameWithStatus2 = Charger2+" "+Status2;
        System.out.println("Charger name:  "+Charger2+" | "+"Status: "+Status2);
        String Charger3 = readText(ChargerName3);
        String Status3 = readText(ChargerOfflineStatus3);
        String ChargerNameWithStatus3 = Charger3+" "+Status3;
        System.out.println("Charger name:  "+Charger3+" | "+"Status: "+Status3);
        if (ChargerNameWithStatus.contains("Offline") && ChargerNameWithStatus2.contains("Offline") && ChargerNameWithStatus3.contains("Offline")){
            System.out.println("Offline status are showing for Offline locations Chargers");
            return true;
        }
        else {
            System.out.println("Offline status are not showing for Offline locations Chargers");
            return false;
        }

    }
    public String RandomLocationName(String text){
        int randomNumber = objGenerator.nextInt(10000);
        String temp=text+randomNumber;
        System.out.println(temp);
        return temp;

    }
    public void SelectItemFromDropDown(By element,String text) throws InterruptedException {
        Thread.sleep(2000);
        writeText(element,text);
        Thread.sleep(1500);
        WebElement Field = driver.findElement(element);
        Field.sendKeys(Keys.ENTER);
    }

    public boolean verifyLocationCountIncreasing() throws InterruptedException {
        Thread.sleep(5000);
        waitforPresence(DetailsBtn1);
        String Loaction = driver.findElement(LocationCount).getText();
        int TotalLocNum = Integer.parseInt(Loaction);
        System.out.println(TotalLocNum);
        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        loginPage.VerifyValidLogin();
        createLocation.GoToLocationPage();
        click(createLocation.createlocationbtn);
        Thread.sleep(10000);
        waitforPresence(createLocation.locationtitle);
        SelectItemFromDropDown(createLocation.selectcompanydropdown,"Rich Information Technology");
        Thread.sleep(3000);
        SelectItemFromDropDown(createLocation.selectpropertydropdown,"Pride and Property");
        writeText(createLocation.locationtitle,RandomLocationName("Automated Location "));
        click(createLocation.confirmlocationbtn);
        click(createLocation.DrawerCreateLocation);
        Thread.sleep(2000);
        CloseTab();
        guestFlow.SwitchToTab(0);
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        waitforPresence(DetailsBtn1);
        String LocationAfter = driver.findElement(LocationCount).getText();
        int ActualTotalLocation = Integer.parseInt(LocationAfter);
        System.out.println(ActualTotalLocation);
        int expected = TotalLocNum+1;
        if (ActualTotalLocation==expected){
            System.out.println("YES!! Location is increased");
            return true;
        }
        else {
            System.out.println("Location is not increased");
            return false;
        }

    }

    public boolean verifyLocationCountInTableMatchWithDrawer() throws InterruptedException {
        Thread.sleep(1500);
        waitVisibility(LocationCount);
        String Locations = driver.findElement(LocationCount).getText();
        int locationsCount = Integer.parseInt(Locations);
        System.out.println("Locations count in table: "+locationsCount);
        click(DetailsBtn1);
        waitforPresence(DrawerLocationTitle2);
        int locationsCountDrawer = driver.findElements(By.className("locationTitle")).size();
        System.out.println("Locations count in drawer:"+locationsCountDrawer);
        if (locationsCount==locationsCountDrawer){
            System.out.println("Locations count in table match with drawer");
            return true;
        }
        else {
            System.out.println("Locations count in table is not matching with drawer");
            return false;
        }

    }
    public boolean verifyChargerCountIncreasing() throws InterruptedException {
        Thread.sleep(7000);
        waitforPresence(DetailsBtn1);
        String Charger = driver.findElement(TotalChargerCount).getText();
        int TotalChargerNum = Integer.parseInt(Charger);
        System.out.println(TotalChargerNum);
        guestFlow.NewTabOpenAndSwitchToNewTab(1);
        loginPage.VerifyValidLogin();
        createCharger.GoToChargers();
        click(CreateCharger.addchargerbtn);
        Thread.sleep(10000);
        waitforPresence(CreateCharger.addnewchargerdrawer);
        writeText(CreateCharger.Chargername,RandomLocationName("Hello Charger "));
        Thread.sleep(1000);
        SelectItemFromDropDown(CreateCharger.selectproperty,"Pride and Property");
        Thread.sleep(1000);
        SelectItemFromDropDown(CreateCharger.location,"Automated Location 4616");
        Thread.sleep(2000);
        click(CreateCharger.savecharger);
        Thread.sleep(1000);
        CloseTab();
        guestFlow.SwitchToTab(0);
        driver.navigate().refresh();
        Thread.sleep(7000);
        waitforPresence(DetailsBtn1);
        String ChargerAfter = driver.findElement(TotalChargerCount).getText();
        int ActualTotalCharger = Integer.parseInt(ChargerAfter);
        System.out.println(ActualTotalCharger);
        int expected = TotalChargerNum+1;
        System.out.println(expected);
        if (ActualTotalCharger==expected){
            System.out.println("YES!! ChargerCount is increased");
            return true;
        }
        else {
            System.out.println("Charger Count is not increased");
            return false;
        }

    }

    public boolean verifyChargerCountInTableMatchWithDrawer() throws InterruptedException {
        Thread.sleep(1500);
        waitVisibility(LocationCount);
        String Chargers = driver.findElement(TotalChargerCount).getText();
        int chargersCount = Integer.parseInt(Chargers);
        System.out.println("Chargers count in table: "+chargersCount);
        click(DetailsBtn1);
        Thread.sleep(5000);
        waitVisibility(ChargerName7);
        int chargersCountDrawer = driver.findElements(By.className("chargerName")).size();
        System.out.println("Chargers count in drawer: "+chargersCountDrawer);
        if (chargersCount==chargersCountDrawer){
            System.out.println("Chargers count in table match with drawer");
            return true;
        }
        else {
            System.out.println("Chargers count in table is not matching with drawer");
            return false;
        }

    }
    public boolean verifyOthersStatus() throws InterruptedException {
        Thread.sleep(4000);
        waitforPresence(ChargerOtherStatus);
        if (driver.findElement(ChargerOtherStatus).isDisplayed()){
            System.out.println("Pass");
            return true;
        }
        else {
            System.out.println("Fail");
            return false;
        }
    }
    public boolean verifyOfflineLocationAndOfflineCharger() throws InterruptedException{
        Thread.sleep(5000);
        waitforPresence(ChargerOfflineStatus);
        WebElement LocationTag = driver.findElement(OfflineTagBesideLocation);
        WebElement ChargerStatus = driver.findElement(ChargerOfflineStatus);
        if (LocationTag.isDisplayed() && ChargerStatus.isDisplayed()){
            System.out.println("Both Offline");
            return true;
        }
        else {
            System.out.println("Fail");
            return false;
        }

    }
    public boolean verifyOnlineLocation() throws InterruptedException{
        Thread.sleep(8000);
        //waitforPresence(DrawerTitle);
        try {
            if (!driver.findElement(OfflineTagBesideLocation).isDisplayed()) {
                System.out.println("Perfect");
                return true;
            } else {
                System.out.println("Fail");
                return false;
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Not Found");
            return true;
        }
    }
    public boolean verifyInUseCharger() throws InterruptedException{
        Thread.sleep(4000);
        waitforPresence(InUseStatus);
        WebElement ChargerStatus = driver.findElement(InUseStatus);
        if (ChargerStatus.isDisplayed()) {
            System.out.println("Perfect");
            return true;
        }
        else {
            System.out.println("Fail");
            return false;
        }


    }


}
