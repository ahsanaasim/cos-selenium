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
    public static By notExistingBreadCrumbLink = By.xpath("(//span[@class='ant-breadcrumb-link'])[3]");
    public static By pageTitle = By.xpath("//div[@class='pageTitle m-auto-0']");
    public static By promoCodesTabIcon = By.xpath("//div[@class='tabIcon']");
    public static By createNewPromoCodeButton = By.xpath("//button[@type='button']//span[contains(text(),'Create New Promo')]");
    public static By addAdvanceFilter = By.xpath("//button[@type='button']//span[contains(text(),'Add Advance Filter')]");
    public static By searchPromoCodeField = By.xpath("//input[@placeholder='Search by promo code']");
    public static By searchPromoCodeButton = By.xpath("//button[@type='button']//span[contains(text(),'Search')]");
    public static By editButton = By.xpath("//button[@type='button']//span[contains(text(),'Edit')]");
    public static By loadMoreButton = By.xpath("//button[@class='ant-btn ant-btn-default primary-color']");
    public static By latestPromoCode = By.xpath("//td[@class='ant-table-cell ant-table-cell-ellipsis']");
    public static By latestPromoCodeDetails = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[2]");
    public static By latestPromoCodeStartDate = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[3]");
    public static By latestPromoCodeExpiryDate = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[4]");
    public static By latestPromoCodePropertiesCount = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[5]");
    public static By latestPromoCodeChargersCount = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[6]");
    public static By chargersCountLink = By.xpath("//div[@class='wordBreak underline inline-block']");
    public static By noDataTable = By.xpath("//div[@class='noDataTableDiv']");

//    Advance Filter

    public static By drawerTitle = By.xpath("//span[@class='drawerTitle']");




    public String noDatFound(){
        return "No data found";
    }

    public void searchAPromoCode(String searchedData) throws InterruptedException {
        waitVisibility(editButton);
        writeText(searchPromoCodeField,searchedData);
        clickButton(searchPromoCodeButton,1000);
    }

    public boolean verifyColumnsHeader(String TableTitle,int IndexOfTitle) throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(editButton);
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
        waitVisibility(editButton);
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


    public void clickOnLoadMoreButtonUntilItIsVisible() throws InterruptedException {
        while (true) {
            try {
                waitForFewMoment(4000);
                WebElement button = driver.findElement(loadMoreButton);
                if (button.isDisplayed()) {
                    button.click();
                    System.out.println("Load more button is clicked");
                }
            } catch (Exception e) {
                // Button not found or not clickable, wait and retry
                System.out.println("Button not found");
                waitForFewMoment(3000);
                break;
            }
        }
    }


    public boolean verifySearchingWithInvalidInfo() throws InterruptedException {
        String[] inputValues = {"08 Feb 2024 12:00 am","31 Jan 2024 11:59 pm","PromoBomoqqaa", "dsdsfsdf","13hjgasd","11111111","00000000","!@#$%^&*()_+/<>,.[]{]}:';';?","!","@","#","$","%","^","&","*","(",")","+","-","/","?","_"};
        boolean allValidationsPass = true;
        waitForFewMoment(2000);
        for (int i = 0; i < inputValues.length; i++) {
            try {
                fieldClear(searchPromoCodeField);
                waitForFewMoment(3500);
                writeText(searchPromoCodeField,inputValues[i]);
                clickButton(searchPromoCodeButton,1500);
                waitForFewMoment(1000);
                String validationMsg = readText(noDataTable);
                if (!validationMsg.equals(noDatFound())) {
                    System.out.println("Validation message not displayed for input value : " + inputValues[i]);
                    allValidationsPass = false;
                }
            } catch (Exception e) {
                // Print exception message along with the index of the array
                System.out.println("Exception for input value " + inputValues[i] + ": " + e.getMessage());
                allValidationsPass = false;
            }
        }

        if (allValidationsPass) {
            System.out.println("Validation message is showing for all invalid input");
        } else {
            System.out.println("Validation message is not showing for some invalid input values");
        }
        return allValidationsPass;
    }






}
