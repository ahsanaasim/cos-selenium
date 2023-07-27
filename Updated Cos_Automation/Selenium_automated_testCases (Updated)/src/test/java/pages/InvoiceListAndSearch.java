package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.US1AdminLogin.TestParameters;

import java.util.Properties;
import java.util.Random;

public class InvoiceListAndSearch extends BasePage{

    public InvoiceListAndSearch(WebDriver driver) {

        super(driver);
    }
    Random rand = new Random();
    Properties prop = ConfigUtill.getConfig();

    public static By FinancialTab = By.xpath("//span[@class='ant-menu-title-content'][contains(.,'Financials')]");
    public static By InvoicesTab  = By.xpath("//a[@href='/financials/invoices']");
    public static By BreadBarName = By.xpath("(//span[@class='ant-breadcrumb-link'])[3]");
    public static By InvoicePageTitle = By.xpath("//div[@class='pageTitle m-auto-0']");
    public static By UnpaidBox = By.xpath("//div[@class='invoiceTotalDiv']");
    public static By OverdueBox = By.xpath("(//div[@class='invoiceTotalDiv'])[2]");
    public static By PaidBox = By.xpath("(//div[@class='invoiceTotalDiv'])[3]");
    public static By UnpaidBoxTitle = By.xpath("//div[@class='typeText']");
    public static By OverdueBoxTitle = By.xpath("(//div[@class='typeText'])[2]");
    public static By PaidBoxTitle = By.xpath("(//div[@class='typeText'])[3]");
    public static By SearchField = By.xpath("//input[@placeholder='Search by invoice no.']");
    public static By SearchButton = By.xpath("//button[@class='ant-btn ant-btn-primary ant-input-search-button']");
    public static By CompanyNameColumn = By.xpath("//th[@class='ant-table-cell'][contains(text(),'Company Name')]");
    public static By PropertyNameColumn = By.xpath("//th[@class='ant-table-cell'][contains(text(),'Property Name')]");
    public static By InvoiceNoColumn = By.xpath("//th[@class='ant-table-cell'][contains(text(),'Invoice No.')]");
    public static By InvoiceDateColumn = By.xpath("//th[@class='ant-table-cell'][contains(text(),'Invoice Date')]");
    public static By DueDateColumn = By.xpath("//th[@class='ant-table-cell'][contains(text(),'Due Date')]");
    public static By AmountPaidColumn = By.xpath("//th[@class='ant-table-cell'][contains(text(),'Amount Paid')]");
    public static By AmountDueColumn = By.xpath("//th[@class='ant-table-cell'][contains(text(),'Amount Due')]");
    public static By StatusColumn = By.xpath("//th[@class='ant-table-cell'][contains(text(),'Status')]");
    public static By ActionColumn = By.xpath("//th[@class='ant-table-cell ant-table-cell-fix-right ant-table-cell-fix-right-first']");
    public static By DetailsButton = By.xpath("//button[@class='ant-btn ant-btn-default mr-10']");
    public static By ReceivePaymentButton = By.xpath("(//button[@class='ant-btn ant-btn-default'])[2]");
    public static By DraftStatus = By.xpath("//span[@class='ant-tag ant-tag-processing'][normalize-space()='Draft']");
    public static By SentStatus = By.xpath("//span[@class='ant-tag ant-tag-error'][normalize-space()='Sent']");
    public static By PartiallyPaidStatus = By.xpath("//span[@class='ant-tag ant-tag-cyan'][normalize-space()='Partially Paid']");
    public static By PaidStatus = By.xpath("//span[@class='ant-tag ant-tag-success'][normalize-space()='Paid']");
    public static By OverdueStatus = By.xpath("//span[@class='ant-tag ant-tag-warning']");




    public void GoToInvoicePage() throws InterruptedException {
        Thread.sleep(3500);
        GoToWebsite(prop.getProperty("InvoicePageURL"));

    }

    public boolean verifyBreadBarNameMatchWithTabName() throws InterruptedException {
        Thread.sleep(1000);
        waitforPresence(InvoicePageTitle);
        String InvoiceTab = "Invoices";
        String BreadBar = driver.findElement(BreadBarName).getText();
        if (InvoiceTab.equals(BreadBar)){
            System.out.println("Bread bar Name is Showing Accurately");
            return true;
        }
        else {
            System.out.println("Bread bar Name is not Showing Accurately");
            return false;
        }
    }
    public boolean verifyAccountNameOnTop() throws InterruptedException {
        Thread.sleep(1000);
        waitforPresence(InvoicePageTitle);
        String ProfileName = driver.findElement(EditChargerCosAdminUpdated.ProfileTop).getText();
        String ExpectedProfileName = "J. Doe";
        if (ProfileName.equals(ExpectedProfileName)){
            System.out.println("Profile Name is Showing Accurately");
            return true;
        }
        else {
            System.out.println("Profile Name is not Showing Accurately");
            return false;
        }
    }

    public boolean verifyDraftStatusColor() throws InterruptedException {
        Thread.sleep(3000);
        // identify text
        WebElement Draft = driver.findElement(DraftStatus);
        //obtain color in rgba
        String s = Draft.getCssValue("color");
        // convert rgba to hex
        String Hexcode = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Color is :" + Hexcode);
        String BlueColor = "#2f54eb";
        if (Hexcode.equals(BlueColor)){
            System.out.println("Colour of Draft status is blue");
            return true;
        }
        else {
            System.out.println("Colour of Draft status is not blue");
            return false;
        }

    }

    public boolean verifySentStatusColor() throws InterruptedException {
        Thread.sleep(3000);
        // identify text
        WebElement Draft = driver.findElement(SentStatus);
        //obtain color in rgba
        String s = Draft.getCssValue("color");
        // convert rgba to hex
        String Hexcode = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Color is :" + Hexcode);
        String RedColor = "#ff4d4f";
        if (Hexcode.equals(RedColor)){
            System.out.println("Colour of Sent status is RED");
            return true;
        }
        else {
            System.out.println("Colour of Sent status is not RED");
            return false;
        }

    }
    public boolean verifyPartiallyPaidStatusColor() throws InterruptedException {
        Thread.sleep(3000);
        // identify text
        WebElement PartiallyPaid = driver.findElement(PartiallyPaidStatus);
        //obtain color in rgba
        String s = PartiallyPaid.getCssValue("color");
        // convert rgba to hex
        String Hexcode = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Color is :" + Hexcode);
        String PasteColor = "#08979c";
        if (Hexcode.equals(PasteColor)){
            System.out.println("Colour of Sent status is Paste");
            return true;
        }
        else {
            System.out.println("Colour of Sent status is not Paste");
            return false;
        }

    }
    public boolean verifyPaidStatusColor() throws InterruptedException {
        Thread.sleep(3000);
        // identify text
        WebElement Paid = driver.findElement(PaidStatus);
        //obtain color in rgba
        String s = Paid.getCssValue("color");
        // convert rgba to hex
        String Hexcode = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Color is :" + Hexcode);
        String GreenColor = "#52c41a";
        if (Hexcode.equals(GreenColor)){
            System.out.println("Colour of Sent status is Green");
            return true;
        }
        else {
            System.out.println("Colour of Sent status is not Green");
            return false;
        }

    }

    public boolean verifySearchFieldPlaceholderText() throws InterruptedException {
        Thread.sleep(4000);
        waitforPresence(SearchField);
        String S = driver.findElement(SearchField).getAttribute("placeholder");
        System.out.println(S);
        String ExpectedText = "Search by invoice no.";
        if (S.equals(ExpectedText)) {
            System.out.println("Matched with Expected");
            return true;
        } else {
            System.out.println("Not Matched with the expected");
            return false;
        }
    }

    public String RandomProperty() {
        String[] PropertyId = {"705d0330-c1ca-4443-bbaf-30c861c03bca", "7a136bb4-bd00-4efe-9fac-bc1fd9c5e18a", "ccf46fde-73a3-4f09-b391-e91b6fbf91de"};
        String property = PropertyId[rand.nextInt(PropertyId.length)];
        System.out.println(property);
        return property;
    }





}
