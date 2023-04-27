package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvoiceDetails extends BasePage{
    public InvoiceDetails(WebDriver driver) {

        super(driver);
    }

    public static By TableInvoiceId1 = By.xpath("//div[@title='invoice']");
    public static By TableInvoiceDate1 = By.xpath("//div[@title='invoiceDate']");
    public static By TableDueDate1 = By.xpath("//div[@title='dueDate']");
    public static By TableAmountDue = By.xpath("//div[@title='amountDue']");
    public static By DrawerInvoiceDate = By.xpath("//input[@placeholder='Invoice Date']");
    public static By DrawerDueDate = By.xpath("//input[@placeholder='Due Date']");
    public static By InvoiceDrawerTitle = By.xpath("//span[@class='drawerTitle']");
    public static By InvoiceToSection = By.xpath("//div[@class='invoiceToTitle']");
    public static By InvoiceDetailsSection = By.xpath("//div[@class='invoiceDetailsTitle']");
    public static By DrawerBalanceDueTitle = By.xpath("//div[@class='balanceText']");
    public static By DrawerBalanceDueNumber = By.xpath("//div[@class='balanceTotal']");
    public static By CloseButton = By.xpath("//span[normalize-space()='Close']");
    public static By CrossButton = By.xpath("//button[@class='ant-drawer-close']");
    public static By DetailsNoColumn = By.xpath("//th[@class='ant-table-cell']");
    public static By DetailsDescriptionColumn = By.xpath("(//th[@class='ant-table-cell'])[2]");
    public static By DetailsLedgerColumn = By.xpath("(//th[@class='ant-table-cell'])[3]");
    public static By DetailsQtyColumn = By.xpath("(//th[@class='ant-table-cell'])[4]");
    public static By DetailsRateColumn = By.xpath("(//th[@class='ant-table-cell'])[5]");
    public static By DetailsTotalAmountColumn = By.xpath("(//th[@class='ant-table-cell'])[6]");
    public static By UnderNumberColumn = By.xpath("//div[@title='no']");
    public static By UnderDescriptionColumn = By.xpath("//input[@class='ant-input ant-input-disabled']");
    public static By UnderLedgerColumn = By.xpath("(//input[@class='ant-input ant-input-disabled'])[2]");
    public static By UnderQtyColumn = By.xpath("(//input[@class='ant-input ant-input-disabled'])[3]");
    public static By UnderRateColumn = By.xpath("(//input[@class='ant-input ant-input-disabled'])[4]");
    public static By UnderTotalAmountColumn = By.xpath("(//input[@class='ant-input ant-input-disabled'])[5]");
    public static By TotalAmountBottom = By.xpath("//div[@class='totalAmount']");
    public static By InvoiceToPropertyName = By.xpath("//div[@class='invoiceToText'][contains(text(),'Property Name')]");
    public static By InvoiceToPropertyAddress = By.xpath("//div[@class='invoiceToText'][contains(text(),'Property Address')]");
    public static By InvoiceToCompanyName = By.xpath("//div[@class='invoiceToText'][contains(text(),'Company Name')]");
    public static By InvoiceDetailsEntityName = By.xpath("//div[@class='invoiceToText'][contains(text(),'Entity Name')]");
    public static By InvoiceDateTitle = By.xpath("//div[contains(text(),'Invoice Date')]");
    public static By DueDateTitle = By.xpath("//div[contains(text(),'Due Date')]");
    public static By InvoiceDateRequiredSign = By.xpath("//span[@class='red-color']");
    public static By DueDateRequiredSign = By.xpath("(//span[@class='red-color'])[2]");








    public boolean verifyInvoiceDetailsDrawerTitle() throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(InvoiceListAndSearch.DetailsButton);
        String InvoiceID = driver.findElement(TableInvoiceId1).getText();
        System.out.println(InvoiceID);
        click(InvoiceListAndSearch.DetailsButton);
        Thread.sleep(2000);
        waitVisibility(InvoiceDrawerTitle);
        String Expected = driver.findElement(InvoiceDrawerTitle).getText();
        System.out.println(Expected);
        if (InvoiceID.equals(Expected)){
            System.out.println("Matched");
            return true;
        }
        else {
            System.out.println("Not Matched");
            return false;
        }

    }

    public boolean verifyInvoiceDetailsDates() throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(TableInvoiceDate1);
        String TableInvoiceDate = driver.findElement(TableInvoiceDate1).getText();
        String TableDueDate = driver.findElement(TableDueDate1).getText();
        System.out.println(TableInvoiceDate);
        System.out.println(TableDueDate);
        click(InvoiceListAndSearch.DetailsButton);
        Thread.sleep(3000);
        waitforPresence(DrawerInvoiceDate);
        String INVDateDrawer = driver.findElement(DrawerInvoiceDate).getAttribute("value");
        String DueDateDrawer = driver.findElement(DrawerDueDate).getAttribute("value");
        System.out.println(INVDateDrawer);
        if (TableInvoiceDate.equals(INVDateDrawer) && TableDueDate.equals(DueDateDrawer) ){
            System.out.println("Matched");
            return true;
        }
        else {
            System.out.println("Not Matched");
            return false;
        }

    }

    public boolean verifyBalanceDue() throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(InvoiceListAndSearch.DetailsButton);
        String DueTable = driver.findElement(TableAmountDue).getText().replace("$","");
        System.out.println(DueTable);
        click(InvoiceListAndSearch.DetailsButton);
        Thread.sleep(2000);
        waitVisibility(InvoiceDrawerTitle);
        String DrawerDue = driver.findElement(DrawerBalanceDueNumber).getText().replaceAll("[^0-9]","");
        System.out.println(DrawerDue);
        if (DueTable.equals(DrawerDue)){
            System.out.println("Matched");
            return true;
        }
        else {
            System.out.println("Not Matched");
            return false;
        }

    }
    public boolean verifyCurrency() throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(InvoiceDrawerTitle);
        String DrawerDue = driver.findElement(DrawerBalanceDueNumber).getText().replaceAll("[0-9]","");
        System.out.println(DrawerDue);
        if (DrawerDue.equals(" USD")){
            System.out.println("Currency unit is USD");
            return true;
        }
        else {
            System.out.println("Currency unit is not USD");
            return false;
        }

    }

    public boolean verifySerialNumberUnderNumberColumn() throws InterruptedException {
        Thread.sleep(1000);
        waitforPresence(UnderNumberColumn);
        //Assuming the field is represented by a WebElement object named "field"
        String fieldValue = driver.findElement(UnderNumberColumn).getText();
        System.out.println(fieldValue);
        //get the text value of the field
        if (fieldValue.matches("\\d+")) { //check if the text contains only digits
            System.out.println("The field contains Serial No.");
            return true;
        } else {
            System.out.println("The field does not contain serial number");
            return false;
        }

    }

    public boolean verifyQuantityUnderQtyColumn() throws InterruptedException {
        Thread.sleep(1000);
        waitforPresence(UnderQtyColumn);
        //Assuming the field is represented by a WebElement object named "field"
        String fieldValue = driver.findElement(UnderQtyColumn).getAttribute("value");
        System.out.println(fieldValue);
        //get the text value of the field
        if (fieldValue.matches("\\d+")) { //check if the text contains only digits
            System.out.println("The field contains number of quantity");
            return true;
        } else {
            System.out.println("The field does not contain quantity number");
            return false;
        }

    }

    public boolean verifyContentExistUnderDescriptionField() throws InterruptedException {
        waitforPresence(UnderDescriptionColumn);
        String fieldValue = driver.findElement(UnderDescriptionColumn).getAttribute("value"); //get the text value of the field
        if (!fieldValue.isEmpty()) { //check if the text is not empty
            System.out.println("The field contains text.");
            return true;
        } else {
            System.out.println("The field does not contain text.");
            return false;
        }

    }

    public boolean verifyLedgerAccountExistUnderLedgerField() throws InterruptedException {
        waitforPresence(UnderLedgerColumn);
        String fieldValue = driver.findElement(UnderLedgerColumn).getAttribute("value"); //get the text value of the field
        if (!fieldValue.isEmpty()) { //check if the text is not empty
            System.out.println("The field contains text.");
            return true;
        } else {
            System.out.println("The field does not contain text.");
            return false;
        }

    }

    public boolean verifyNumberUnderRateColumn() throws InterruptedException {
        Thread.sleep(1000);
        waitforPresence(UnderRateColumn);
        //Assuming the field is represented by a WebElement object named "field"
        String fieldValue = driver.findElement(UnderRateColumn).getAttribute("value");
        System.out.println(fieldValue);
        //get the text value of the field
        if (fieldValue.matches("\\$\\d+(\\.\\d{2})?")) { //check if the text contains a dollar symbol followed by a number
            System.out.println("The field contains a dollar currency symbol with a number.");
            return true;
        } else {
            System.out.println("The field does not contain a dollar currency symbol with a number.");
            return false;
        }

    }

    public boolean verifyTotalAmountSection() throws InterruptedException {
        Thread.sleep(1000);
        waitforPresence(TotalAmountBottom);
        //Assuming the field is represented by a WebElement object named "field"
        String Value = driver.findElement(TotalAmountBottom).getText();
        System.out.println(Value);//get the text value of the field
        if (Value.matches("Total: \\d+(\\.\\d{2})? USD")) { //check if the text contains a dollar symbol followed by a number and USD as the currency unit
            System.out.println("The field contains an amount of money in USD.");
            return true;
        } else {
            System.out.println("The field does not contain an amount of money in USD.");
            return false;
        }

    }

    public boolean verifyFieldUnderTotalAmountColumn() throws InterruptedException {
        waitforPresence(UnderTotalAmountColumn);
        //Assuming the field is represented by a WebElement object named "field"
        String fieldValue = driver.findElement(UnderTotalAmountColumn).getAttribute("value");
        System.out.println(fieldValue);
        //get the text value of the field
        if (fieldValue.matches("\\$\\d+(\\.\\d{2})?")) { //check if the text contains a dollar symbol followed by a number
            System.out.println("The field contains a dollar currency symbol with a number.");
            return true;
        } else {
            System.out.println("The field does not contain a dollar currency symbol with a number.");
            return false;
        }

    }
}
