package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FeeStructureList extends BasePage{
    public FeeStructureList(WebDriver driver) {
        super(driver);
    }


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

        System.out.println("All cells under the Charger column contain the chargers name");
        return true;
    }


    public void ContiniousClickOnLoadMoreButton(){
        for (int i=0; i<15;i++ ){
            waitforPresence(LoadMoreButton);
            click(LoadMoreButton);
        }

    }

    public void writeInSearchField(String feeStructure){
        waitforPresence(Edit);
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
        waitforPresence(CreateFeeStructure.FeeModifier);
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



}