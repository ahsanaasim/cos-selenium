package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.security.PublicKey;

public class DownCharger extends BasePage {

    public DownCharger(WebDriver driver)
    {
        super(driver);
    }

    CreateLocation location = new CreateLocation(driver);
    EditLocation editLocation = new EditLocation(driver);
    Dashboard dashboard = new Dashboard(driver);

    public static By ChargerPageTitle = By.xpath("//div[@class='pageTitle m-auto-0'][contains(text(),'Charger')]");
    public static By DashboardDownChargerAlert = By.xpath("//div[@class='mr-auto']");
    public static By AlertIcon = By.xpath("//span[@class='anticon anticon-exclamation-circle ant-alert-icon']");
    public static By DownChargerSeeDetails = By.xpath("//a[@href='/property/charger?pageSize=3&current=1&chargerStatus=downChargers']");
    public static By DownChargerTag = By.xpath("//span[@class='ant-tag'][contains(text(),'Down Chargers')]");
    public static By DownChargerTagCross = By.xpath("//span[@class='anticon anticon-close ant-tag-close-icon']");
    public static By EditButton = By.xpath("//span[contains(text(),'Edit')]");

    public static By DownChargerInAdvanceFilter = By.xpath("//span[normalize-space()='Down chargers']");
    public static By UncheckDownChargerFilter = By.xpath("//span[@class='ant-checkbox']");
    public static By CheckedDownChargerFilter = By.xpath("//span[@class='ant-checkbox ant-checkbox-checked']");
    public static By BrokenChargerErrorMsg = By.xpath("(//span[@class='red-color weight-600'][contains(text(),'Charger Seems To Be Broken')])[2]");

    public static By DownChargerName1 = By.xpath("//div[@class='wordBreak']");
    public static By DownLocationName1 = By.xpath("(//div[@class='wordBreak'])[4]");






    public boolean verifyDownChargerAlertText(){
        waitforPresence(DashboardDownChargerAlert);
        String AlertText = driver.findElement(DashboardDownChargerAlert).getText();
        boolean matchesPattern = AlertText.matches("Total of \\d+ chargers are down.");
        if (matchesPattern) {
            System.out.println("Down Chargers Alert text is showing accurately");
            return true;
        } else {
            System.out.println("Down Chargers Alert text is not showing accurately");
            return false;
        }
    }

    public void GotoFauledCharger(){
        driver.get("https://test-app.chargeonsite.com/charger/GyF4ZS");
    }

    public boolean verifySearchBoXPlaceholder(){
        waitforPresence(CreateCharger.searchchargerfield);
        String S = driver.findElement(CreateCharger.searchchargerfield).getAttribute("placeholder");
        System.out.println(S);
        String ExpectedText = "Search by property, charger & location title";
        if (S.equals(ExpectedText)) {
            System.out.println("Matched with Expected");
            return true;
        } else {
            System.out.println("Not Matched with the expected");
            return false;
        }
    }

    public boolean verifyFieldUnderColumnContainsExpectedContent(By element){
        waitforPresence(element);
        String fieldContent = driver.findElement(element).getText(); //get the text value of the field
        if (!fieldContent.isEmpty()) { //check if the text is not empty
            System.out.println("The field contains expected text.");
            return true;
        } else {
            System.out.println("The field does not contain expected text.");
            return false;
        }
    }

//    public boolean ShowingChargerCountWithActualNumberOfChargerPresentInTheList() throws InterruptedException {
//        waitforPresence(ChargerListPropertyAdmin.ChargerCountTop);
//        while (driver.findElement(ChargerListPropertyAdmin.LoadMoreButton).isDisplayed()) {
//            Thread.sleep(2500);
//            if (driver.findElement(ChargerListPropertyAdmin.LoadMoreButton).isDisplayed()) {
//                click(ChargerListPropertyAdmin.LoadMoreButton);
//            } else {
//                break;
//            }
//            Thread.sleep(2500);
//            int RowCount = driver.findElements(ChargerListPropertyAdmin.Rows).size();
//            System.out.println(RowCount);
//            String TopOfTable = driver.findElement(ChargerListPropertyAdmin.ChargerCountTop).getText();
//            String replacing = TopOfTable.replaceAll("Showing Chargers: ","");
//            int ChargerCountOnTop = Integer.parseInt(replacing);
//            Thread.sleep(2500);
//            if (RowCount == ChargerCountOnTop) {
//                System.out.println("Great");
//                return true;
//            }
//        }
//        return true;
//    }

    public boolean verifyDownChargerIsRemovingFromTheListAfterMakingLocationOffline() throws InterruptedException {
        waitforPresence(DownChargerSeeDetails);
        String DashboardDownChargerCountBefore = driver.findElement(DashboardDownChargerAlert).getText().replaceAll("[^0-9]","");
        int DownChargerCountBefore = Integer.parseInt(DashboardDownChargerCountBefore);
        System.out.println("Down charger count before: "+DownChargerCountBefore);
        click(DownChargerSeeDetails);
        waitforPresence(EditButton);
        String Location = "Berkley";
        writeText(CreateCharger.searchchargerfield,Location);
        click(CreateCharger.searchargerbtn);
        waitforPresence(EditButton);
        Thread.sleep(2000);
        String charger = driver.findElement(DownChargerName1).getAttribute("title");
        System.out.println(charger);
        location.GoToLocationPage();
        location.clickonLocationSearchbar();
        writeText(CreateLocation.searchbar,Location);
        waitforPresence(location.editbtn);
        click(CreateCharger.searchargerbtn);
        click(location.editbtn);
        click(editLocation.togglebtn);
        click(CreateLocation.savelocationbtn);
        Thread.sleep(2000);
        dashboard.GotoDashboard();
        waitforPresence(DashboardDownChargerAlert);
        String DashboardDownChargerCountAfter = driver.findElement(DashboardDownChargerAlert).getText().replaceAll("[^0-9]","");
        int DownChargerCountAfter = Integer.parseInt(DashboardDownChargerCountAfter);
        System.out.println("Down charger count after: "+DownChargerCountAfter);
        click(DownChargerSeeDetails);
        waitforPresence(EditButton);
        writeText(CreateCharger.searchchargerfield,charger);
        click(CreateCharger.searchargerbtn);
        Thread.sleep(6000);
        waitforPresence(InvoiceFilter.NoDataFoundInTable);
        if (driver.findElement(InvoiceFilter.NoDataFoundInTable).isDisplayed() && DownChargerCountBefore>DownChargerCountAfter) {
            System.out.println("Down charger is vanished from the list after making it's location off");
            return true;
        } else {
            System.out.println("Down charger is not vanished from the list after making it's location off");
            return false;
        }
    }

    public boolean verifyDownChargerIsAddingInTheListAfterMakingLocationOnline() throws InterruptedException {
        waitforPresence(DownChargerSeeDetails);
        String DashboardDownChargerCountBefore = driver.findElement(DashboardDownChargerAlert).getText().replaceAll("[^0-9]","");
        int DownChargerCountBefore = Integer.parseInt(DashboardDownChargerCountBefore);
        System.out.println("Down charger count before: "+DownChargerCountBefore);
        String Location = "Berkley";
        location.GoToLocationPage();
        location.clickonLocationSearchbar();
        writeText(CreateLocation.searchbar,Location);
        waitforPresence(location.editbtn);
        click(CreateCharger.searchargerbtn);
        click(location.editbtn);
        click(editLocation.togglebtn);
        click(CreateLocation.savelocationbtn);
        Thread.sleep(2000);
        dashboard.GotoDashboard();
        waitforPresence(DashboardDownChargerAlert);
        Thread.sleep(5000);
        String DashboardDownChargerCountAfter = driver.findElement(DashboardDownChargerAlert).getText().replaceAll("[^0-9]","");
        int DownChargerCountAfter = Integer.parseInt(DashboardDownChargerCountAfter);
        System.out.println("Down charger count after: "+DownChargerCountAfter);
        if (DownChargerCountBefore<DownChargerCountAfter) {
            System.out.println("Down charger is added in the the list after making it's location on");
            return true;
        } else {
            System.out.println("Down charger is not added in the the list after making it's location on");
            return false;
        }
    }


}
