package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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
    public static By Edit = By.xpath("//button[@class='ant-btn ant-btn-default']");
    public static By LoadMoreButton= By.xpath("//button[@class='ant-btn ant-btn-default primary-color']");


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


}
