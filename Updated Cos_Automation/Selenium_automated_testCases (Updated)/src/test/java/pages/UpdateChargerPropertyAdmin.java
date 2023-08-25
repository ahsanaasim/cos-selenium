package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class UpdateChargerPropertyAdmin extends BasePage {

    public UpdateChargerPropertyAdmin(WebDriver driver) {

        super(driver);
    }

    RandomData rdata = new RandomData();
    Random data = new Random();
    EditChargerCosAdminUpdated editChargerCosAdminUpdated = new EditChargerCosAdminUpdated(driver);

    public static By ChargerInfoTitle = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Charger Information')]");
    public static By DetailsDrawerOfflineOnline = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Offline/Online')]");
    public static By DetailsDrawerPropertyInfo = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Property Information')]");
    public static By DetailsDrawerLocationInformation = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Location Information')]");
    public static By DetailsDrawerAuditLog = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Audit Log')]");
    public static By ToggleButton = By.xpath("//button[@role='switch']");
    public static By ChargerUrl = By.xpath("(//span[@class='ant-input-group-addon'])[3]");
    public static By QRCode = By.xpath("//input[@placeholder='Qr code']");
    public static By CopyButton = By.xpath("//button[@class='ant-btn ant-btn-default copy-button-qrCode']");
    public static By SaveCharger = By.xpath("//button[@type='button']//span[contains(text(),'Save Charger')]");
    public static By CancelButton = By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]");
    public static By NewTabPageTitle = By.xpath("//div[@class='ant-col ant-col-16']/div/div[@class='pageTitle']");
    public static By PopUpBoxText = By.xpath("//div[contains(@class,'ant-modal-confirm-content')]");

    public static By DiscardBtn = By.xpath("//button[@class='ant-btn ant-btn-default'][contains(.,'Discard')]");
    public static By ContinueBtn = By.xpath("//button[@class='ant-btn ant-btn-primary'][contains(.,'Continue')]");
    public static By AlertBox = By.xpath("//div[@class='ant-modal-body']");
    public static By UpdatedStatus = By.xpath("//*[@id=\"basic\"]/div[5]/div[2]/div/ul/li[1]/div[4]/span/span");
    public static By CopiedMessage = By.xpath("//div[@class='ant-tooltip-inner']");
    public static By WelcomePageTitleChargingFee = By.xpath("//div[@class='ant-col ant-col-16']//div[@class='pageTitle'][normalize-space()='Charging Fee']");
    public static By CreateNewLocation = By.xpath("//span[normalize-space()='Or, create a new location']");





    public boolean verifyActionColumnOccupiedWithDetailsButton(String Title, int IndexOfTitle) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(ChargerListPropertyAdmin.detailsbutton);
        WebElement mytable = driver.findElement(By.xpath("//thead"));
        java.util.List<WebElement> headers = mytable.findElements(By.tagName("th"));
        int resultColumnIndex = 0;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equals(Title)) {
                resultColumnIndex = i;
                System.out.println(resultColumnIndex);
                System.out.println(Title);
                break;
            }
        }
        if (resultColumnIndex != IndexOfTitle) {
            // The "Result" column was not found
            throw new RuntimeException("The column was not found");
        }

        WebElement myrows = driver.findElement(By.xpath("//tbody"));
        java.util.List<WebElement> rows = myrows.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) { // start at index 1 to skip the header row
            java.util.List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            String result = cells.get(resultColumnIndex).getText();
            System.out.println(result);
            if (!result.equals("Details")) {
                // Verification failed
                throw new RuntimeException("Verification failed. Expected 'Edit', but got '" + result + "' in row " + i);

            }

        }
        System.out.println("Action column occupied with edit button");
        return true;


    }

    public boolean verifyDrawerOpeningForDetailsButton(){
        waitVisibility(ChargerInfoTitle);
        String ChargerTitleInformation = driver.findElement(ChargerInfoTitle).getText();
        System.out.println(ChargerTitleInformation);
        if (driver.findElement(ChargerInfoTitle).isDisplayed()){
            System.out.println("Drawer opened");
            return true;
        }
        else {
            System.out.println("Not Opened");
            return false;
        }
    }

    public boolean verifyLocationFieldEmpty(){
        String EmptyLocation = driver.findElement(CreateCharger.selectlocation).getText();
        System.out.println(EmptyLocation);
        if (EmptyLocation.isEmpty()){
            System.out.println("Location Field for not Assigned Location");
            return true;
        }
        else {
            System.out.println("Fishy");
            return false;
        }
    }
    public boolean verifyDrawerNecessarySection() throws InterruptedException {
        Thread.sleep(1000);
        String ChargerTitleInformation = driver.findElement(ChargerInfoTitle).getText();
        String OnlineOfflineSection = driver.findElement(DetailsDrawerOfflineOnline).getText();
        String PropertyInfoSection = driver.findElement(DetailsDrawerPropertyInfo).getText();
        String LocationInformation =driver.findElement(DetailsDrawerLocationInformation).getText();
        String AuditLogSection = driver.findElement(DetailsDrawerAuditLog).getText();
        if (ChargerTitleInformation.contains("Charger Information") && OnlineOfflineSection.contains("Offline/Online") && PropertyInfoSection.contains("Property Information") && LocationInformation.contains("Location Information") && AuditLogSection.contains("Audit Log") ) {
            System.out.println("Verification Successful - All the Necessary Section of drawer is Showing");
            return true;

        } else {
            System.out.println("Verification UnSuccessful. Something Went Wrong!!");
            return false;
        }
    }
    public boolean verifyToggleButtonDefaultState() {
        String ToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
        if (ToggleButtonStatus.contains("true")) {
            System.out.println("Verification Successful!!! Toggle button has Set to Online By Default");
            return true;
        }
        else {
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
            return false;
        }
    }
    public boolean verifyUrlAndCopyButtonExist(){
        waitVisibility(ChargerUrl);
        String getUrl = driver.findElement(ChargerUrl).getText();
        System.out.println(getUrl);
        String expectedUrl = "https://test-app.chargeonsite.com/charger/drpWVC";
        if (getUrl.equals(expectedUrl) && driver.findElement(CopyButton).isDisplayed()){
            System.out.println("URL and Copy Button is visible");
            return true;
        }
        else {
            System.out.println("Something Wrong");
            return false;
        }
    }

    public boolean verifyURLOfChargerQRExist(){
        waitVisibility(ChargerUrl);
        String getUrl = driver.findElement(ChargerUrl).getText();
        System.out.println(getUrl);
        String expectedUrl = "https://test-app.chargeonsite.com/charger/";
        if (getUrl.contains(expectedUrl)){
            System.out.println("URL of charger QR code is visible");
            return true;
        }
        else {
            System.out.println("Something Wrong");
            return false;
        }
    }
    public boolean verifyChargerStatusAfterChanging() throws InterruptedException {
        waitforPresence(ToggleButton);
        String ToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
        System.out.println("Before clicking: "+ToggleButtonStatus);
        click(ToggleButton);
        click(SaveCharger);
        Thread.sleep(2000);
        waitVisibility(ChargerListPropertyAdmin.detailsbutton);
        click(ChargerListPropertyAdmin.detailsbutton);
        waitforPresence(ToggleButton);
        String ToggleButtonStatus2 = driver.findElement(ToggleButton).getAttribute("aria-checked");
        System.out.println("After clicking: "+ToggleButtonStatus2);
        if (!ToggleButtonStatus.equals(ToggleButtonStatus2)) {
            System.out.println("Verification Successful!!! Toggle button is switching properly");
            return true;
        } else {
            System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
            return false;

        }
    }




    public boolean verifyChargerStatusAfterMakingItOffline() throws InterruptedException {
        Thread.sleep(2500);
        waitVisibility(ChargerListPropertyAdmin.detailsbutton);
        driver.findElement(ChargerListPropertyAdmin.detailsbutton).click();
        try{
            String ToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
            if (ToggleButtonStatus.equals("false")) {
                System.out.println("Verification Successful!!! Toggle button has Set to Offline");
                return true;

            } else {
                System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
                return false;

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification UnSuccessful.Toggle button has Set to Online!!");
            return false;

        }
    }
    public boolean verifyChargerStatusAfterMakingItOnlineFromOffline() throws InterruptedException {
        Thread.sleep(1500);
        waitelemtclickable(ChargerListPropertyAdmin.detailsbutton);
        driver.findElement(ChargerListPropertyAdmin.detailsbutton).click();
        try{
            String ToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
            if (ToggleButtonStatus.equals("true")) {
                System.out.println("Verification Successful!!! Toggle button has Set to Offline");
                return true;

            } else {
                System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
                return false;

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification UnSuccessful.Toggle button has Set to Online!!");
            return false;

        }

    }

    public boolean clickToggleButtonIfItIsOff() throws InterruptedException {
        Thread.sleep(1500);
        waitforPresence(ToggleButton);
        try{
            String ToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
            if (ToggleButtonStatus.equals("true")) {
                System.out.println("Toggle button is not clicked");
                return true;

            } else {
                driver.findElement(ToggleButton).click();
                return true;
            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification UnSuccessful.Toggle button is not displayed");
            return false;

        }

    }

    public boolean clickToggleButtonIfItIsOn() throws InterruptedException {
        Thread.sleep(1500);
        waitforPresence(ToggleButton);
        try {
            String ToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
            if (ToggleButtonStatus.equals("false")) {
                System.out.println("Toggle button is not clicked");
                return true;

            } else {
                driver.findElement(ToggleButton).click();
                return true;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Verification UnSuccessful.Toggle button is not displayed");
            return false;

        }
    }

    public boolean verifyChargerStatusInWelcomePage() throws InterruptedException{
        waitelementtobedisplayed(ChargerUrl);
        String url = driver.findElement(ChargerUrl).getText();
        System.out.println(url);//copying the URL
        Thread.sleep(1500);
        ((JavascriptExecutor) driver).executeScript("window.open(\'"+url+"\')");// launching a new tab window.location = \'"+url+"\'
//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.CONTROL + "v").sendKeys(Keys.ENTER).build().perform();//sending the paste command
        // hold all window handles in array list
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTab.get(1));
        waitforPresence(GuestVerificationPage.ThanksForScanningTitle);
        String s =driver.findElement(GuestVerificationPage.ThanksForScanningTitle).getText();
        System.out.println("Title after scanning:"+s);
        String s2 =driver.findElement(GuestVerificationPage.ChargerAvailableStatus).getText();
        System.out.println("Charger status: "+s2);
        Thread.sleep(4000);
        driver.close();
        //switch to parent window
        driver.switchTo().window(newTab.get(0));
        if (s.contains("Thanks For Scanning") && s2.equals("Available Now")){
            System.out.println("Pass");
            return true;
        }
        else {
            System.out.println("Fail");
            return false;
        }
    }
    public boolean verifyChargerStatusInWelcomePageWhenToggleButtonIsOff() throws InterruptedException{
        waitVisibility(ChargerUrl);
        String url = driver.findElement(ChargerUrl).getText();
        String QR = driver.findElement(QRCode).getAttribute("value");
        String fullURL = url+QR;
        System.out.println(fullURL);//copying the URL
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.open(\'"+fullURL+"\')");// launching a new tab window.location = \'"+url+"\'
//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.CONTROL + "v").sendKeys(Keys.ENTER).build().perform();//sending the paste command
        // hold all window handles in array list
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTab.get(1));
        Thread.sleep(3000);
        waitforPresence(GuestVerificationPage.ChargerUnavailableStatus);
        String s =driver.findElement(GuestVerificationPage.ChargerUnavailableStatus).getText();
        System.out.println(s);
        Thread.sleep(3000);
        driver.close();
        //switch to parent window
        driver.switchTo().window(newTab.get(0));
        if (s.equals("Unavailable")){
            System.out.println("Pass");
            return true;
        }
        else {
            System.out.println("Fail");
            return false;
        }
    }
    public boolean verifyUpdatesOfChanges() throws InterruptedException{
        Thread.sleep(1000);
        waitVisibility(ToggleButton);
        String ToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
        System.out.println("Toggle button status before click: "+ToggleButtonStatus);
        click(ToggleButton);
        String chargingRate = editChargerCosAdminUpdated.GenerateChargingRateRandomly();
        editChargerCosAdminUpdated.selectChargingRateFromSelectedField(chargingRate);
        WebElement LocationNameField = driver.findElement(CreateCharger.selectlocation);
        String Location = editChargerCosAdminUpdated.GenerateRandomLocationName();
        Thread.sleep(1000);
        click(EditChargerCosAdminUpdated.SelectedLocationField);
        Thread.sleep(3000);
        LocationNameField.sendKeys(Location);
        Thread.sleep(2000);
        LocationNameField.sendKeys(Keys.ENTER);
        click(SaveCharger);
        Thread.sleep(1500);
        waitelemtclickable(ChargerListPropertyAdmin.detailsbutton);
        click(ChargerListPropertyAdmin.detailsbutton);
        waitVisibility(ToggleButton);
        String SelectedLocationNameField = driver.findElement(ChargerListPropertyAdmin.SelectedLocationName).getText();
        System.out.println("Selected location: "+SelectedLocationNameField );
        String ToggleButtonStatus2 = driver.findElement(ToggleButton).getAttribute("aria-checked");
        System.out.println("Toggle button status after changing: "+ToggleButtonStatus2);
        String chargingRateAfter = driver.findElement(EditChargerCosAdminUpdated.ChargingRateFieldSelected).getText();
        if (!ToggleButtonStatus.equals(ToggleButtonStatus2) && Location.equals(SelectedLocationNameField) && chargingRate.equals(chargingRateAfter)){
            System.out.println("Changes Updated");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }

    public boolean verifyAlertMessage() throws InterruptedException{
        Thread.sleep(1000);
        String PopupBoxMsg = driver.findElement(PopUpBoxText).getText();
        System.out.println(PopupBoxMsg);
        String Expected = "Do you want to discard or continue?";
        if (PopupBoxMsg.equals(Expected)){
            System.out.println("Pop Up Box Text is Showing");
            return true;
        }
        else {
            System.out.println("Something Wrong");
            return false;
        }

    }

    public boolean verifyDiscardAndContinueButton() throws InterruptedException{
        Thread.sleep(1000);
        if (driver.findElement(DiscardBtn).isDisplayed() && driver.findElement(ContinueBtn).isDisplayed()){
            System.out.println("Discard and Continue Button Are Displayed");
            return true;
        }
        else {
            System.out.println("Something Wrong");
            return false;
        }

    }
    public boolean VerifyingChangesNotSavedAfterPressingDiscardButton() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(ToggleButton).click();
        String BeforeToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
        driver.findElement(CancelButton).click();
        Thread.sleep(1500);
        driver.findElement(DiscardBtn).click();
        driver.findElement(ChargerListPropertyAdmin.detailsbutton).click();
        String AfterToggleButtonStatus = driver.findElement(ToggleButton).getAttribute("aria-checked");
        if (!BeforeToggleButtonStatus.equals(AfterToggleButtonStatus)){
            System.out.println("Congo!!!Changes has not been made");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean verifyConfirmationPopupHasClosed() throws InterruptedException {
        Thread.sleep(1000);
        try{
            WebElement confirmationpopup= driver.findElement(PopUpBoxText);
            if (!confirmationpopup.isDisplayed()) {
                System.out.println("Verification Successful!!! Confirmation Popup Has Closed ");
                return true;

            } else {
                System.out.println("Verification UnSuccessful!!!Something Went Wrong!!");
                return false;

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.Pop up Box is Gone!!");
            return true;

        }
    }

    public boolean verifyTime() throws InterruptedException{
        driver.findElement(SaveCharger).click();
        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("h:mm aa");
        //get current date time with Date()
        Date date = new Date();
        // Now format the date
        String date1= dateFormat.format(date);
        // Print the Date
        System.out.println(date1);
        Thread.sleep(5000);
        waitforPresence(ChargerListPropertyAdmin.detailsbutton);
        driver.findElement(ChargerListPropertyAdmin.detailsbutton).click();
        Thread.sleep(10000);
        String webDate = driver.findElement(By.xpath("//*[@id=\"basic\"]/div[5]/div[2]/div/ul/li[1]/div[1]/div[2]")).getText();
        System.out.println(webDate);
        if (date1.equals(webDate)){
            System.out.println("Matched");
            return true;
        }
        else {
            System.out.println("Not Matched");
            return false;
        }

    }
    public boolean verifyUpdateItemTitleInAuditLog() throws InterruptedException{
        Thread.sleep(1000);
        String Updatemsg = driver.findElement(UpdatedStatus).getText();
        System.out.println(Updatemsg);
        if (Updatemsg.equals("updated 1 item")){
            System.out.println("Congo!!!Changes has been made");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }

    public boolean verifyCopyButtonMsg() throws InterruptedException{
        driver.findElement(CopyButton).click();
        Thread.sleep(400);
        String Msg = driver.findElement(CopiedMessage).getText();
        System.out.println(Msg);
        if (Msg.equals("Copied")){
            System.out.println("Copied is Showing");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean verifyCopypasteUrl() throws InterruptedException {
        waitVisibility(ChargerUrl);
        driver.findElement(CopyButton).click();
// Open a new tab
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");

// Switch to the new tab
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

// Navigate to the URL in the address bar
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "v");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.ENTER);
        return true;
    }


    public String GenerateRandomLocationNameForSecureSmarterProperty() throws InterruptedException {
        Thread.sleep(2000);
        String[] LocationNames = {"Nearby car station", "Chicago"};
        int index = data.nextInt(LocationNames.length);
        return LocationNames[index];

    }
    public boolean SearchLocationAndSelectFromDropdown() throws InterruptedException{
        WebElement LocationNameField = driver.findElement(CreateCharger.selectlocation);
        String Location = editChargerCosAdminUpdated.GenerateRandomLocationName();
        Thread.sleep(1000);
        click(EditChargerCosAdminUpdated.SelectedLocationField);
//        ChargerNameField.click();
        Thread.sleep(2000);
        LocationNameField.sendKeys(Location);
        Thread.sleep(2000);
        LocationNameField.sendKeys(Keys.ENTER);
        String SelectedChargerNameField = driver.findElement(ChargerListPropertyAdmin.SelectedLocationName).getText();
        System.out.println(SelectedChargerNameField);
        if (SelectedChargerNameField.equals(Location)){
            System.out.println("Successfully Changed");
            return true;
        }
        else {
            System.out.println("Not Changed");
            return false;

        }
    }

    public boolean verifyUpdatedChargingRateAfterScanningCharger() throws InterruptedException, IOException, UnsupportedFlavorException {
        waitforPresence(UpdateChargerPropertyAdmin.CopyButton);
        String UpdatedChargerRate = editChargerCosAdminUpdated.GenerateChargingRateRandomly();
        System.out.println("Randomly generated charging rate: "+UpdatedChargerRate);
        editChargerCosAdminUpdated.selectChargingRateFromSelectedField(UpdatedChargerRate);
        Thread.sleep(2000);
        String UpdatedChargingRateInDrawer = driver.findElement(editChargerCosAdminUpdated.ChargingRateFieldSelected).getText();
        System.out.println("Charging rate in drawer: "+UpdatedChargingRateInDrawer);
        click(UpdateChargerPropertyAdmin.SaveCharger);
        Thread.sleep(1500);
        waitelemtclickable(ChargerListPropertyAdmin.detailsbutton);
        click(ChargerListPropertyAdmin.detailsbutton);
        waitforPresence(UpdateChargerPropertyAdmin.CopyButton);
        click(UpdateChargerPropertyAdmin.CopyButton);
        Thread.sleep(1500);
// Open a new tab
        String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting the text that was copied to the clipboard
        ((JavascriptExecutor) driver).executeScript("window.open(\""+myText+"\")");// launching a new tab window.location = \'"+url+"\'
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
// Switch to the new tab
        driver.switchTo().window(newTab.get(1));
        Thread.sleep(4000);
        waitforPresence(GuestVerificationPage.MaxChargingRate);
        String UpdatedChargingRateInScanningPage = driver.findElement(GuestVerificationPage.MaxChargingRate).getText();
        System.out.println("Charging rate in scanning page: "+UpdatedChargingRateInScanningPage);
        driver.close();
        driver.switchTo().window(newTab.get(0));
        if (UpdatedChargingRateInDrawer.equals(UpdatedChargingRateInScanningPage) && UpdatedChargerRate.equals(UpdatedChargingRateInScanningPage)){
            System.out.println("Updated charging rate is showing accurately");
            return true;
        }
        else {
            System.out.println("Updated charging rate is not showing accurately");
            return false;
        }

    }
}
