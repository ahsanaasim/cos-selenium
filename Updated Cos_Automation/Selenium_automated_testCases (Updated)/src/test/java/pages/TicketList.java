package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TicketList extends BasePage {

    public TicketList(WebDriver driver) {

        super(driver);
    }

    Dashboard dashboard = new Dashboard(driver);
    CreateCharger operation = new CreateCharger(driver);
    CreateTicket ticket = new CreateTicket(driver);

    public static By QuestionMarkSupportButton = By.xpath("//span[@class='anticon anticon-question-circle']");
    public static By CreatedDateTitle = By.xpath("//th[normalize-space()='Created Date']");
    public static By IDTitle = By.xpath("//th[normalize-space()='ID']");
    public static By SubjectTitle = By.xpath("//th[normalize-space()='Subject']");
    public static By CreatedByTitle = By.xpath("//th[normalize-space()='Created By']");
    public static By TypeTitle = By.xpath("//th[normalize-space()='Type']");
    public static By PropertyNameTitle = By.xpath("//th[normalize-space()='Property Name']");
    public static By StatusTitle = By.xpath("//th[normalize-space()='Status']");
    public static By ActionTitle = By.xpath("//th[normalize-space()='Action']");

    public static By SupportPageTitle = By.xpath("//div[@class='pageTitle m-auto-0 mr-auto']");
    public static By RepliedTag = By.xpath("//span[@class='ant-tag ant-tag-geekblue'][contains(text(),'Replied')]");
    public static By ClosedTabCreatedDateTitle = By.xpath("(//th[normalize-space()='Created Date'])[2]");
    public static By ClosedTabIDTitle = By.xpath("(//th[normalize-space()='ID'])[2]");
    public static By ClosedTabSubjectTitle = By.xpath("(//th[normalize-space()='Subject'])[2]");
    public static By ClosedTabCreatedByTitle = By.xpath("(//th[normalize-space()='Created By'])[2]");
    public static By ClosedTabTypeTitle = By.xpath("(//th[normalize-space()='Type'])[2]");
    public static By ClosedTabPropertyNameTitle = By.xpath("(//th[normalize-space()='Property Name'])[2]");
    public static By ClosedTabStatusTitle = By.xpath("(//th[normalize-space()='Status'])[2]");
    public static By ClosedTabActionTitle = By.xpath("(//th[normalize-space()='Action'])[2]");
    public static By TableCreatedDate1 = By.xpath("//div[@title='createdDate']");
    public static By TableID1 = By.xpath("//div[@title='id']");
    public static By TableSubject1 = By.xpath("//div[@title='subject']");
    public static By TableCreatedBy1 = By.xpath("//div[@class='createdByInTicketTable']");
    public static By TableType1 = By.xpath("//div[@class='recordInTicketTable']");
    public static By TablePropertyName1 = By.xpath("//div[@title='propertyName']");
    public static By OpenTab = By.xpath("//div[@class='openTab']");
    public static By OpenTag = By.xpath("//span[@class='ant-tag ant-tag-error'][contains(text(),'Open')]");
    public static By OpenTag2 = By.xpath("(//span[@class='ant-tag ant-tag-error'][contains(text(),'Open')])[2]");
    public static By OpenTag3 = By.xpath("(//span[@class='ant-tag ant-tag-error'][contains(text(),'Open')])[3]");
    public static By ClosedTag = By.xpath("//span[@class='ant-tag ant-tag-success'][contains(text(),'Closed')]");
    public static By ClosedTag2 = By.xpath("(//span[@class='ant-tag ant-tag-success'][contains(text(),'Closed')])[2]");
    public static By ClosedTag3 = By.xpath("(//span[@class='ant-tag ant-tag-success'][contains(text(),'Closed')])[3]");
    public static By ClosedTab = By.xpath("//div[@class='closeTab']");
    public static By ZohoAllTicketsFilter = By.xpath("//h1[@class='zd-heading-reset ']");
    public static By ZohoClosedTicketsFilter = By.xpath("//a[@data-title='Closed Tickets']");
    public static By ZohoOpenTicketsFilter = By.xpath("//a[@data-title='Open Tickets']");
    public static By ZohoAllTicketsFilterDropdown = By.xpath("//a[@data-title='All Tickets']");
    public static By ZohoStatusButton = By.xpath("//button[@data-id='tktStatus']");
    public static By ZohoOpenStatus = By.xpath("//div[@data-title='Open']");
    public static By ZohoClosedStatus = By.xpath("//div[@data-title='Closed']");
    public static By ZohoToastMessageCancel = By.xpath("//button[@data-id='toastMessage_cancelButton']");




    public boolean verifyOpenTagsUnderOpenTab() throws InterruptedException {
        Thread.sleep(6000);
        WebElement mytable = driver.findElement(By.xpath("//thead"));
        List<WebElement> headers = mytable.findElements(By.tagName("th"));
        int resultColumnIndex = 0;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equals("Status")) {
                resultColumnIndex = i;
                System.out.println(resultColumnIndex);
                System.out.println("Status");
                break;
            }
        }
        if (resultColumnIndex != 6) {
            // The "Result" column was not found
            throw new RuntimeException("The 'Status' column was not found");
        }

        WebElement myrows = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = myrows.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) { // start at index 1 to skip the header row
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            String result = cells.get(resultColumnIndex).getText();
            System.out.println(result);
            if (!result.equals("Open")) {
                // Verification failed
                throw new RuntimeException("Verification failed. Expected 'Success', but got '" + result + "' in row " + i);

            }
        }

        System.out.println("All cells under the 'Status' column contain the tag 'open'");
        return true;
    }

    public boolean verifyClosedTagsUnderClosedTab() throws InterruptedException {
        Thread.sleep(3000);
        WebElement mytable = driver.findElement(By.xpath("(//thead)[2]"));
        List<WebElement> headers = mytable.findElements(By.tagName("th"));
        int resultColumnIndex = 0;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equals("Status")) {
                resultColumnIndex = i;
                System.out.println(resultColumnIndex);
                System.out.println("Status");
                break;
            }
        }
        if (resultColumnIndex != 6) {
            // The "Result" column was not found
            throw new RuntimeException("The 'Status' column was not found");
        }

        WebElement myrows = driver.findElement(By.xpath("(//tbody)[2]"));
        List<WebElement> rows = myrows.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) { // start at index 1 to skip the header row
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            String result = cells.get(resultColumnIndex).getText();
            System.out.println(result);
            if (!result.equals("Closed")) {
                // Verification failed
                throw new RuntimeException("Verification failed. Expected 'Closed', but got '" + result + "' in row " + i);

            }
        }

        System.out.println("All cells under the 'Status' column contain the tag 'open'");
        return true;
    }





    public boolean verifyOpenTab(){
        waitforPresence(OpenTab);
        String OPen = driver.findElement(OpenTab).getText();
        System.out.println(OPen);
        if (OPen.matches("Open \\(\\d+\\)")) {
            System.out.println("Open tab is showing according to design");
            return true;
        } else {
            System.out.println("Open tab is not showing according to design");
            return false;
        }
    }

    public boolean verifyOpenTabContainsCount(){
        waitforPresence(OpenTab);
        String OPen = driver.findElement(OpenTab).getText().replaceAll("[^0-9]","");
        System.out.println(OPen);
        if (OPen.matches("\\d+")) {
            System.out.println("Open tab is showing with count");
            return true;
        } else {
            System.out.println("Open tab is not showing with count");
            return false;
        }
    }
    public boolean verifyCloseTabContainsCount(){
        waitforPresence(OpenTab);
        String OPen = driver.findElement(ClosedTab).getText().replaceAll("[^0-9]","");
        System.out.println(ClosedTab);
        if (OPen.matches("\\d+")) {
            System.out.println("Closed tab is showing with count");
            return true;
        } else {
            System.out.println("Closed tab is not showing with count");
            return false;
        }
    }

    public boolean verifyClosedTab(){
        waitforPresence(OpenTab);
        String close = driver.findElement(ClosedTab).getText();
        System.out.println(close);
        if (close.matches("Closed \\(\\d+\\)")) {
            System.out.println("Open tab is showing according to design");
            return true;
        } else {
            System.out.println("Open tab is not showing according to design");
            return false;
        }
    }

    public boolean verifyTotalTicketShowingOnTop(){
        waitforPresence(OpenTab);
        String close = driver.findElement(ChargerListPropertyAdmin.ChargerCountTop).getText();
        System.out.println(close);
        if (close.matches("Total Tickets Showing: \\d+")) {
            System.out.println("Total Tickets count is showing");
            return true;
        } else {
            System.out.println("Total Tickets count is not showing");
            return false;
        }
    }


    public boolean verifyTicketCreationDateAndTime() throws InterruptedException {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm a");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted Date Time: " + formattedDateTime);
        dashboard.RefreshBrowser();
        Thread.sleep(6000);
        waitforPresence(TableCreatedDate1);
        String TableDate = driver.findElement(TableCreatedDate1).getText();
        System.out.println(TableDate);
        if (formattedDateTime.equals(TableDate)){
            System.out.println("Created date is correct");
            return true;
        }
        else {
            System.out.println("Created date is not correct");
            return false;
        }
    }

    public boolean verifyTotalOpenTicketCountAndOPenTabsCountIsDecreasingAfterClosingATicket() throws InterruptedException {
        Thread.sleep(5000);
        String OPen = driver.findElement(OpenTab).getText().replaceAll("[^0-9]","");
        int openCount = Integer.parseInt(OPen);
        System.out.println("OPen count before closing ticket: "+openCount);
        String TotalOPen = driver.findElement(ChargerListPropertyAdmin.ChargerCountTop).getText().replaceAll("[^0-9]","");
        int TotalCount = Integer.parseInt(TotalOPen);
        System.out.println("Total count before closing ticket: "+TotalCount);
        ticket.NewTabOpenAndSwitchToNewTab(1);
        ticket.GoToWebsite("https://www.zoho.com/desk/");
        ticket.click(CreateTicket.ZohoSign);
        operation.writeInputText(UpdateLedgerAccounts.ZohoEmailField,"fahim@6sensehq.com",2000);
        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,1000);
        operation.writeInputText(UpdateLedgerAccounts.ZohoPasswordField,"WorkLOAD@10@",2000);
        operation.ClickButton(UpdateLedgerAccounts.ZohoNextBtn,2000);
        operation.ClickButton(ZohoAllTicketsFilter,5000);
        operation.ClickButton(ZohoToastMessageCancel,2000);
        operation.ClickButton(ZohoOpenTicketsFilter,2000);
        operation.ClickButton(ZohoOpenStatus,5000);
        operation.ClickButton(ZohoClosedStatus,2000);
        operation.ClickButton(ZohoAllTicketsFilter,2000);
        operation.ClickButton(ZohoAllTicketsFilterDropdown,2000);
        ticket.SwitchToTab(0);
        Thread.sleep(50000);
        dashboard.RefreshBrowser();
        Thread.sleep(3000);
        waitforPresence(OpenTab);
        waitforPresence(ChargerListPropertyAdmin.ChargerCountTop);
        String OPenAfter = driver.findElement(OpenTab).getText().replaceAll("[^0-9]","");
        int openCountAfter = Integer.parseInt(OPen);
        System.out.println("OPen count after closing ticket: "+openCount);
        String TotalOPenAfter = driver.findElement(ChargerListPropertyAdmin.ChargerCountTop).getText().replaceAll("[^0-9]","");
        int TotalCountAfter = Integer.parseInt(TotalOPen);
        System.out.println("Total count after closing ticket: "+TotalCount);
        int ExpectedOpenCount = openCount-1;
        int ExpectedTotalCount = TotalCount-1;
        if (openCountAfter==ExpectedOpenCount && TotalCountAfter==ExpectedTotalCount){
            System.out.println("Open ticket count is decreasing by one after closing a ticket from zoho");
            return true;
        }
        else{
            System.out.println("Open ticket count is not decreasing by one after closing a ticket from zoho");
            return false;
        }



    }
}