package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Properties;

public class PromoCodeList extends BasePage{
    public PromoCodeList(WebDriver driver){
        super(driver);
    }
    Properties prop = ConfigUtill.getConfig();

    public static By homeBreadCrumbLink = By.xpath("//span[@class='ant-breadcrumb-link']");
    public static By slashInBreadcrumb = By.xpath("//span[@class='ant-breadcrumb-separator']");
    public static By accessCodeBreadCrumbLink = By.xpath("(//span[@class='ant-breadcrumb-link'])[2]");
    public static By pageTitle = By.xpath("//div[@class='pageTitle m-auto-0']");
    public static By promoCodesTabIcon = By.xpath("//div[@class='tabIcon']");
    public static By createNewPromoCodeButton = By.xpath("//button[@type='button']//span[contains(text(),'Create New Promo')]");
    public static By addAdvanceFilter = By.xpath("//button[@type='button']//span[contains(text(),'Add Advance Filter')]");
    public static By searchPromoCodeField = By.xpath("//input[@placeholder='Search by promo code']");
    public static By searchPromoCodeButton = By.xpath("//button[@type='button']//span[contains(text(),'Search')]");
    public static By editButton = By.xpath("//button[@type='button']//span[contains(text(),'Edit')]");
    public static By LatestPromoCode = By.xpath("//td[@class='ant-table-cell ant-table-cell-ellipsis']");
    public static By LatestPromoCodeDetails = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[2]");
    public static By LatestPromoCodeStartDate = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[3]");
    public static By LatestPromoCodeExpiryDate = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[4]");
    public static By LatestPromoCodePropertiesCount = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[5]");
    public static By LatestPromoCodeChargersCount = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[6]");




    public void searchAPromoCode(String searchedData) throws InterruptedException {
        waitVisibility(editButton);
        writeText(searchPromoCodeField,searchedData);
        clickButton(searchPromoCodeButton,1000);
    }

    public boolean verifyColumnsHeader(String TableTitle,int IndexOfTitle) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(editButton);
        WebElement mytable = driver.findElement(By.xpath("//thead"));
        List<WebElement> headers = mytable.findElements(By.tagName("th"));
        int resultColumnIndex = 0;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equals(TableTitle)) {
                resultColumnIndex = i;
                System.out.println(resultColumnIndex);
                System.out.println(TableTitle);
                break;
            }
        }
        if (resultColumnIndex != IndexOfTitle) {
            // The "Result" column was not found
            throw new RuntimeException("The column was not found");
        }

        return true;
    }

    public boolean verifyExpectedTitleColumnOccupiedWithContent(String Title, int IndexOfTitle) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(editButton);
        WebElement mytable = driver.findElement(By.xpath("//thead"));
        List<WebElement> headers = mytable.findElements(By.tagName("th"));
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
        List<WebElement> rows = myrows.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) { // start at index 1 to skip the header row
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            String result = cells.get(resultColumnIndex).getText();
            System.out.println(result);
            if (result.isEmpty()) {
                // Verification failed
                throw new RuntimeException("Verification failed. Expected data in the specified column, but got nothing"+" in row " + i);

            }
        }

        System.out.println("Column is occupied with its content");
        return true;
    }





}
