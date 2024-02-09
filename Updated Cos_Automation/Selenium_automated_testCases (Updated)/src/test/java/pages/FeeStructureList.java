package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FeeStructureList extends BasePage{
    public FeeStructureList(WebDriver driver) {
        super(driver);
    }

    Random random = new Random();


    public static By FeeStructureNameTitle = By.xpath("//th[@class='ant-table-cell']");
    public static By GroupTitle = By.xpath("(//th[@class='ant-table-cell'])[2]");
    public static By SessionFeeTitle = By.xpath("(//th[@class='ant-table-cell'])[3]");
    public static By UtilizationFeeTitle = By.xpath("(//th[@class='ant-table-cell'])[4]");
    public static By IdleFeeTitle = By.xpath("(//th[@class='ant-table-cell'])[5]");
    public static By FeeModifierTitle = By.xpath("(//th[@class='ant-table-cell'])[6]");
    public static By ActionTitle = By.xpath("//th[@class='ant-table-cell ant-table-cell-fix-right ant-table-cell-fix-right-first']");
    public static By Edit = By.xpath("//span[contains(text(),'Edit')]");
    public static By LoadMoreButton= By.xpath("//button[@class='ant-btn ant-btn-default primary-color']");
    public static By SearchField= By.xpath("//input[@placeholder='Search by fee structure name']");
    public static By SearchButton = By.xpath("//button[@class='ant-btn ant-btn-primary ant-input-search-button']");
    public static By FeeStructureName1 = By.xpath("//td[@class='ant-table-cell']");
    public static By Group1 = By.xpath("//td[@class='ant-table-cell'][2]");
    public static By SessionFee1 = By.xpath("//td[@class='ant-table-cell'][3]");
    public static By UtilizationFee1 = By.xpath("//td[@class='ant-table-cell'][4]");
    public static By IdleFee1 = By.xpath("//td[@class='ant-table-cell'][5]");
    public static By FeeModifier1 = By.xpath("//td[@class='ant-table-cell'][6]");



    public boolean verifyExpectedTitleColumnOccupiedWithContent(String Title, int IndexOfTitle) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(Edit);
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
                throw new RuntimeException("Verification failed. Expected 'Success', but got '" + result + "' in row " + i);

            }
        }

        System.out.println("Column is occupied with its content");
        return true;
    }

    public boolean verifySessionFeeColumnOccupiedWithContentSessionFee(String Title, int IndexOfTitle) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(Edit);
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
            if (!result.matches("\\$\\d+\\.\\d{2}/Session")) {
                // Verification failed
                throw new RuntimeException("Verification failed. Expected 'Success', but got '" + result + "' in row " + i);

            }

        }
        return true;


    }


    public boolean verifyIdleFeeColumnOccupiedWithIdleFees(String Title, int IndexOfTitle) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(Edit);
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
            if (!result.matches("\\$\\d+\\.\\d{2}/minute")) {
                // Verification failed
                throw new RuntimeException("Verification failed. Expected 'Success', but got '" + result + "' in row " + i);

            }

        }
        System.out.println("Utilization fees contains kWh and minute based fees");
        return true;


    }


    public boolean verifyActionColumnOccupiedWithEditButton(String Title, int IndexOfTitle) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(Edit);
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
            if (!result.equals("Edit")) {
                // Verification failed
                throw new RuntimeException("Verification failed. Expected 'Edit' Button, but got '" + result + "' in row " + i);

            }

        }
        System.out.println("Action column occupied with edit button");
        return true;


    }


    public void ContiniousClickOnLoadMoreButton(){
        for (int i=0; i<2;i++ ){
            waitelemtclickable(LoadMoreButton);
            click(LoadMoreButton);
        }

    }

    public void writeInSearchField(String feeStructure) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(Edit);
        fieldClear(SearchField);
        writeText(SearchField,feeStructure);
    }

    public boolean verifyTableFeeStructureNameMatchWithDrawer(){
        waitforPresence(Edit);
        String s = driver.findElement(FeeStructureName1).getText();
        System.out.println("Fee structure name in table: "+s);
        click(Edit);
        waitforPresence(CreateFeeStructure.FeeStructureNameField);
        String s2 = driver.findElement(CreateFeeStructure.FeeStructureNameField).getAttribute("value");
        System.out.println("Fee structure nae in drawer: "+s2);
        if (s.equals(s2)){
            System.out.println("Table name is matching with drawer");
            return true;
        }
        else {
            System.out.println("Table name is not matching with drawer");
            return false;
        }

    }


    public boolean verifySessionFeeMatchWithDrawer() throws InterruptedException {
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        waitforPresence(Edit);
        String s = FeeExtractorFromTable(FeeStructureList.SessionFee1);
        System.out.println("Session fee in table: "+s);
        click(Edit);
        waitforPresence(CreateFeeStructure.SessionFeeHeading);
        String s2 = feeStructure.SessionFeeExtractor();
        System.out.println("Session fee in drawer: "+s2);
        if (s.equals(s2)){
            System.out.println("Session fee table data matching with drawer");
            return true;
        }
        else {
            System.out.println("Session fee table data is not matching with drawer");
            return false;
        }

    }

    public boolean verifyUtilizationFeeMatchWithDrawer() throws InterruptedException {
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        waitforPresence(Edit);
        String s = FeeExtractorFromTable(FeeStructureList.UtilizationFee1);
        System.out.println("Utilization Fee in table: "+s);
        click(Edit);
        waitforPresence(CreateFeeStructure.UtilizationFeeHeadingForkWh);
        String s2 = feeStructure.UtilizationFeeExtractor();
        System.out.println("Utilization Fee in drawer: "+s2);
        if (s.equals(s2)){
            System.out.println("Utilization Fee table data matching with drawer");
            return true;
        }
        else {
            System.out.println("Utilization Fee table data is not matching with drawer");
            return false;
        }

    }

    public boolean verifyIdleFeeMatchWithDrawer() throws InterruptedException {
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        waitforPresence(Edit);
        String s = FeeExtractorFromTable(FeeStructureList.IdleFee1);
        System.out.println("Idle Fee in table: "+s);
        click(Edit);
        waitforPresence(CreateFeeStructure.IdleFeeHeading);
        String s2 = feeStructure.IdleFeeExtractor();
        System.out.println("Idle Fee in drawer: "+s2);
        if (s.equals(s2)){
            System.out.println("Idle Fee table data matching with drawer");
            return true;
        }
        else {
            System.out.println("Idle Fee table data is not matching with drawer");
            return false;
        }

    }

    public boolean verifyFeeModifierMatchWithDrawer() throws InterruptedException {
        CreateFeeStructure feeStructure = new CreateFeeStructure(driver);
        waitforPresence(Edit);
        String s = driver.findElement(FeeModifier1).getText();
        System.out.println("Fee modifier in table: "+s);
        click(Edit);
        waitforPresence(EditFeeStructure.FeeModifier);
        String s2 = FeeModifierExtractorWithPercentage();
        System.out.println("Fee modifier in drawer: "+s2);
        if (s.equals(s2)){
            System.out.println("Fee modifier table data matching with drawer");
            return true;
        }
        else {
            System.out.println("Fee modifier table data is not matching with drawer");
            return false;
        }

    }



    public String FeeExtractorFromTable(By element) throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(element);
        String inputString = driver.findElement(element).getText();
        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("\\$(\\d+\\.\\d+)");
        // Match the pattern against the input string
        Matcher matcher = pattern.matcher(inputString);
        // Extract the value
        String value = "";
        if (matcher.find()) {
            value = matcher.group(1);
        }
        System.out.println("Value: " + value);
        return value;
    }

    public String FeeModifierExtractorWithPercentage() throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(CreateFeeStructure.FeeModifier);
        String inputString = driver.findElement(CreateFeeStructure.FeeModifier).getText();
        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("\\d+\\.\\d+%");
        // Match the pattern against the input string
        Matcher matcher = pattern.matcher(inputString);
        // Extract the value
        String value = "";
        if (matcher.find()) {
            value = matcher.group();
        }
        System.out.println("Value: " + value);
        return value;
    }


    public boolean verifyTotalNumberCountSectionShowing() throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(ChargerListPropertyAdmin.TotalNum);
        String title = driver.findElement(ChargerListPropertyAdmin.TotalNum).getText();
        System.out.println(title);
        if (title.matches("Total \\d+")){
            System.out.println("Total count section is showing ");
            return true;
        }
        else {
            System.out.println("Total count section is not showing");
            return false;
        }
    }

    public boolean verifyShowingFeesCountOnTopIsShowing() throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(ChargerListPropertyAdmin.ChargerCountTop);
        String title = driver.findElement(ChargerListPropertyAdmin.ChargerCountTop).getText();
        System.out.println(title);
        if (title.matches("Showing Fees: \\d+")){
            System.out.println("Showing fees count on top is showing");
            return true;
        }
        else {
            System.out.println("Showing fees count on top is not showing");
            return false;
        }
    }

    public boolean verifyShowingFeesCountOnBottomOfList() throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(ChargerListPropertyAdmin.LeftShowingCharger);
        String title = driver.findElement(ChargerListPropertyAdmin.LeftShowingCharger).getText();
        System.out.println(title);
        if (title.matches("Showing \\d+")){
            System.out.println("Showing fees count on bottom of list is showing");
            return true;
        }
        else {
            System.out.println("Showing fees count on bottom of list is not showing");
            return false;
        }
    }


    public boolean SearchFieldClear() throws InterruptedException{
        Thread.sleep(2000);
        waitforPresence(Edit);
        driver.findElement(SearchField).sendKeys(Keys.chord(Keys.CONTROL+"a", Keys.DELETE));
        return true;
    }


    public boolean verifyUpdatedDataInTable(By element,String value) throws InterruptedException {
        Thread.sleep(1000);
        waitforPresence(element);
        String s = FeeExtractorFromTable(element);
        System.out.println("Fee in table: "+s);
        String s2 = value;
        System.out.println("Generated fee: "+s2);
        if (s.equals(s2)){
            System.out.println("Fee is Updated");
            return true;
        }
        else {
            System.out.println("Fee is not updated");
            return false;
        }
    }


    public String GenerateFee() throws InterruptedException {
        Thread.sleep(1000);
        String[] Fees = {"11.00", "5.00", "4.00","15.38","1.00","1.25","13.00","8.05","11.30","9.00"};
        int index = random.nextInt(Fees.length);
        return Fees[index];



    }








}