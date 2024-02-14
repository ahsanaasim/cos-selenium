package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    public static By crossButtonInSearchField = By.xpath("//span[@class='anticon anticon-close-circle']");
    public static By editButton = By.xpath("//button[@type='button']//span[contains(text(),'Edit')]");
    public static By loadMoreButton = By.xpath("//button[@class='ant-btn ant-btn-default primary-color']");
    public static By latestPromoCode = By.xpath("//td[@class='ant-table-cell ant-table-cell-ellipsis']");
    public static By latestPromoCodeDetails = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[2]");
    public static By latestPromoCodeStartDate = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[3]");
    public static By latestPromoCodeExpiryDate = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[4]");
    public static By latestPromoCodeStatus = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[5]");
    public static By latestPromoCodePropertiesCount = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[6]");
    public static By latestPromoCodeChargersCount = By.xpath("(//td[@class='ant-table-cell ant-table-cell-ellipsis'])[7]");
    public static By chargersCountLink = By.xpath("//div[@class='wordBreak underline inline-block']");
    public static By noDataTable = By.xpath("//div[@class='noDataTableDiv']");
    public static By spinner = By.xpath("//span[@class='ant-spin-dot ant-spin-dot-spin']");

//    Advance Filter

    public static By drawerTitle = By.xpath("//span[@class='drawerTitle']");
    public static By selectPropertyInFilter = By.xpath("//div[@class='ant-select-selection-overflow']");
    public static By propertyFieldToTypeInFilter = By.xpath("//input[@class='ant-select-selection-search-input']");
    public static By applyButton = By.xpath("//button[@type='button']//span[contains(text(),'Apply')]");
    public static By tag1 = By.xpath("//span[@class='ant-tag']");
    public static By tag2 = By.xpath("(//span[@class='ant-tag'])[2]");
    public static By clearAll = By.xpath("//span[@class='ant-tag cursor tagCss clearAllTag']");




    public String noDatFound(){
        return "No Data Found";
    }

    public String regexForStartEndDateField(){
        return "^(\\d{2} (?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2} (?:am|pm))$";
    }

    public String regexForNumber(){
        return "^(0|[1-9]\\d*)$";
    }

    public String regexForStatuses(){
        return "^(Active|Inactive|Expired)$";
    }

    public String loadMoreButtonText(){
        return "Load "+prop.getProperty("PageSizeInTest")+" More";
    }

    public String countAtTopLeftOfTheTable(String count){
        return "Showing Promo Codes: "+count;
    }

    public String countBesideLoadMoreButton(String count){
        return "Showing "+count;
    }
    public String totalCountText(String count){
        return "Total "+count;
    }



    public void selectAPropertyInAdvanceFilter(String property) throws InterruptedException {
        waitForFewMoment(2000);
        click(selectPropertyInFilter);
        writeText(propertyFieldToTypeInFilter,property);
        WebElement selectitem = driver.findElement(propertyFieldToTypeInFilter);
        waitForFewMoment(1000);
        selectitem.sendKeys(Keys.ENTER);




    }
    public void searchAPromoCode(String searchedData) throws InterruptedException {
        waitVisibility(editButton);
        writeText(searchPromoCodeField,searchedData);
        clickButton(searchPromoCodeButton,1000);
    }

    public void clickOnSearchButton(By waitButton,By searchButton) throws InterruptedException {
        waitVisibility(waitButton);
        clickButton(searchButton,1000);
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

    public boolean verifyExpectedTitleColumnNotRemainedBlank(String Title, int IndexOfTitle) throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(editButton);
        clickOnLoadMoreButtonUntilItIsVisible();
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
                throw new RuntimeException("Verification failed. Expected data in the specified column, but got nothing in row "+i);

            }
        }

        System.out.println("Column is occupied with its content");
        return true;
    }



    public boolean verifyExpectedColumnOccupiedWithExpectedContent(String Title,int IndexOfTitle,String regexForColumn) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(editButton);
        clickOnLoadMoreButtonUntilItIsVisible();
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
            if (!result.matches(regexForColumn)) {
                // Verification failed
                throw new RuntimeException("Verification failed. Got '" + result + "' in row " + i);

            }

        }
        return true;


    }

    public boolean verifyPromoCodeDetailsColumnExpectedContent() throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(editButton);
        clickOnLoadMoreButtonUntilItIsVisible();
        WebElement mytable = driver.findElement(By.xpath("//thead"));
        List<WebElement> headers = mytable.findElements(By.tagName("th"));
        int resultColumnIndex = 0;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equals("Promo Code Details")) {
                resultColumnIndex = i;
                System.out.println(resultColumnIndex);
                break;
            }
        }
        if (resultColumnIndex != 1) {
            // The "Result" column was not found
            throw new RuntimeException("The column was not found");
        }

        WebElement myrows = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = myrows.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) { // start at index 1 to skip the header row
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            String result = cells.get(resultColumnIndex).getText();
            System.out.println(result);
            if (!result.matches("^\\d+(\\.\\d+)?% Off$") && !result.matches("^\\$\\d+(\\.\\d+)? Off$")) {
                // Verification failed
                throw new RuntimeException("Verification failed. Expected 'Success', but got '" + result + "' in row " + i);

            }

        }
        return true;


    }



    public boolean verifyPromoCodeStatusColumnOccupiedExpectedStatuses() throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(editButton);
        clickOnLoadMoreButtonUntilItIsVisible();
        WebElement mytable = driver.findElement(By.xpath("//thead"));
        List<WebElement> headers = mytable.findElements(By.tagName("th"));
        int resultColumnIndex = 0;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equals("Promo Status")) {
                resultColumnIndex = i;
                System.out.println(resultColumnIndex);
                break;
            }
        }
        if (resultColumnIndex != 4) {
            // The "Result" column was not found
            throw new RuntimeException("The column was not found");
        }

        WebElement myrows = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = myrows.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) { // start at index 1 to skip the header row
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            String result = cells.get(resultColumnIndex).getText();
            System.out.println(result);
            if ((!result.equals("Active")) || (!result.equals("Inactive")) || (!result.equals("Expired")))  {
                // Verification failed
                throw new RuntimeException("Verification failed. Got " + result + " in row " + i);

            }

        }
        return true;


    }

    public boolean verifyExpectedColumnOccupiedWithNumber(String Title,int IndexOfTitle,String regexForColumn) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(editButton);
        clickOnLoadMoreButtonUntilItIsVisible();
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
            if (!result.matches(regexForColumn)) {
                // Verification failed
                throw new RuntimeException("Verification failed. Got '" + result + "' in row " + i);

            }

        }
        return true;


    }

    public boolean verifyLoadMoreButtonActionWithAboveShowingCount() throws InterruptedException{
        waitVisibility(ChargerListPropertyAdmin.LoadMoreButton);
        waitVisibility(ChargerListPropertyAdmin.ChargerCountTop);
        click(loadMoreButton);
        waitForFewMoment(4500);
        String showingTextOnTop = readText(ChargerListPropertyAdmin.ChargerCountTop);
        System.out.println("Promo codes count on top : "+showingTextOnTop);
        String ShowingChargerAfterClick = showingTextOnTop.replaceAll("[^0-9]","");
        int showingChargerCountAfterClick = Integer.parseInt(ShowingChargerAfterClick);
        int dataInList = driver.findElements(ChargerListPropertyAdmin.Rows).size();
        System.out.println("Data in the list : "+dataInList);
        int expectedCountTop = Integer.parseInt(prop.getProperty("PageSizeInTest"))+Integer.parseInt(prop.getProperty("PageSizeInTest"));
        String countOnTop = String.valueOf(expectedCountTop);
        String expectedText = countAtTopLeftOfTheTable(countOnTop);
        if (showingTextOnTop.equals(expectedText) && showingChargerCountAfterClick==dataInList){
            System.out.println("Showing above count is increasing After click on Load more button");
            return true;
        }
        else{
            System.out.println("Wrongggg!!!");
            return false;
        }

    }


    public boolean verifyLoadMoreButtonActionOnTextBesideTheButton() throws InterruptedException{
        waitVisibility(ChargerListPropertyAdmin.LoadMoreButton);
        waitVisibility(ChargerListPropertyAdmin.LeftShowingCharger);
        click(loadMoreButton);
        waitForFewMoment(3000);
        String showingTextOnTop = driver.findElement(ChargerListPropertyAdmin.LeftShowingCharger).getText();
        System.out.println("Promo codes count beside the load more button : "+showingTextOnTop);
        String ShowingChargerAfterClick = showingTextOnTop.replaceAll("[^0-9]","");
        int showingChargerCountAfterClick = Integer.parseInt(ShowingChargerAfterClick);
        int dataInList = driver.findElements(ChargerListPropertyAdmin.Rows).size();
        System.out.println("Data in the list : "+dataInList);
        int expectedCountTop = Integer.parseInt(prop.getProperty("PageSizeInTest"))+Integer.parseInt(prop.getProperty("PageSizeInTest"));
        String countOnTop = String.valueOf(expectedCountTop);
        String expectedText = countBesideLoadMoreButton(countOnTop);
        if (showingTextOnTop.equals(expectedText) && showingChargerCountAfterClick==dataInList){
            System.out.println("Count beside load more button is increasing after click on Load more button");
            return true;
        }
        else{
            System.out.println("Wrongggg!!!");
            return false;
        }

    }


    public boolean verifyTotalCount() throws InterruptedException{
        waitVisibility(ChargerListPropertyAdmin.TotalNum);
        String totalCount = readText(ChargerListPropertyAdmin.TotalNum);
        System.out.println("Promo codes count on top : "+totalCount);
        waitForFewMoment(1500);
        int dataInList = driver.findElements(ChargerListPropertyAdmin.Rows).size();
        System.out.println("Data in the list : "+dataInList);
        String totalC = String.valueOf(dataInList);
        String expectedText = totalCountText(totalC);
        if (totalCount.equals(expectedText)){
            System.out.println("Total Promo Code count in the list showing correctly");
            return true;
        }
        else{
            System.out.println("Wrongggg!!!");
            return false;
        }

    }



    public boolean verifySearchDataIsShowingCorrectly(String Title,int IndexOfTitle,String searchedData) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(editButton);
        clickOnLoadMoreButtonUntilItIsVisible();
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
            if (!result.equals(searchedData)) {
                // Verification failed
                throw new RuntimeException("Verification failed. Expected"+searchedData+" but Got " + result + "' in row " + i);

            }

        }
        return true;


    }

    public boolean verifyDataIsShowingAccordingToSpecifiedDateRange(String Title, int IndexOfTitle, String starDate, String enDate) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(editButton);
        clickOnLoadMoreButtonUntilItIsVisible();
        String startDateStr = starDate;
        String endDateStr = enDate;
        // Define the date format pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        // Parse the strings into LocalDate objects using the specified format
        LocalDate startDate = LocalDate.parse(startDateStr,formatter);
        LocalDate endDate = LocalDate.parse(endDateStr,formatter);
        boolean allDatesWithinRange = true;
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
            String result = cells.get(resultColumnIndex).getText().replaceAll("\\s+\\d{1,2}:\\d{2}\\s+[ap]m","");
            System.out.println(result);
            LocalDate dateToVerify = LocalDate.parse(result,formatter);
            if (dateToVerify.isBefore(startDate) || dateToVerify.isAfter(endDate)) {
                // Verification failed
                throw new RuntimeException("Verification failed. Got " + result + "' in row " + i);

            }

        }

        if (allDatesWithinRange) {
            System.out.println("All dates are within the specified range.");
            return true;
        } else {
            System.out.println("Not all dates are within the specified range.");
            return false;
        }



    }


    public boolean verifyPartiallySearchData(String Title,int IndexOfTitle,String searchedData) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(editButton);
        clickOnLoadMoreButtonUntilItIsVisible();
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
            if (!result.contains(searchedData)) {
                // Verification failed
                throw new RuntimeException("Verification failed. Expected"+searchedData+" but Got " + result + "' in row " + i);

            }

        }
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
                System.out.println("Load more button not found");
                waitForFewMoment(3000);
                break;
            }
        }
    }

    public void clickOnClearAllTagIfItIsVisible() throws InterruptedException {
        while (true) {
            try {
                waitForFewMoment(4000);
                WebElement button = driver.findElement(clearAll);
                if (button.isDisplayed()) {
                    button.click();
                    System.out.println("Clear all tag is clicked");
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
        String[] inputValues = {"08 Feb 2024 12:00 am","31 Jan 2024 11:59 pm","PromoBomoqqaa", "dsdsfsdf","13hjgasd","11111111","00000000","!@#$%^&*()_+/<>,.[]{]}:';';?","!","@","#","$","^","&","*","(",")","+","-","/","?","_"};
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
                System.out.println("Validation message is showing : "+validationMsg);
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
