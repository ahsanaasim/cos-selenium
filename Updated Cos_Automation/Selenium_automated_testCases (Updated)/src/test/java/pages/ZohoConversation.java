package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;

public class ZohoConversation extends BasePage {
    public ZohoConversation(WebDriver driver) {

        super(driver);
    }

    CreateTicket ticket =new CreateTicket(driver);
    TicketList list = new TicketList(driver);
    CreateCharger operation = new CreateCharger(driver);
    Dashboard dashboard =new Dashboard(driver);
    Properties prop = ConfigUtill.getConfig();

    public static By DetailsButton = By.xpath("(//span[contains(text(),'Details')])[1]");
    public static By MsgUnderTicketId = By.xpath("//div[@class='ant-alert-message']");
    public static By TableRepliedTag1 = By.xpath("//span[@class='ant-tag ant-tag-geekblue'][contains(text(),'Replied')]");
    public static By DrawerTicketId = By.xpath("//div[@class='drawerTitle wordBreak']");
    public static By DrawerTicketInformationTitle = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Ticket Information')]");
    public static By DrawerTicketDescriptionTitle = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Ticket Description')]");
    public static By DrawerTicketDescription = By.xpath("//div[@class='singleThreadMsgContainer']");
    public static By DrawerZohoAdminReply = By.xpath("(//div[@class='singleThreadMsgContainer'])[2]");
    public static By ZohoAdminName = By.xpath("(//span[@class='user-name'])[2]");
    public static By CreatedDateTitle = By.xpath("//span[normalize-space()='Created Date']");
    public static By PropertyNameTitle = By.xpath("//span[normalize-space()='Property Name']");
    public static By TicketTypeTitle = By.xpath("//span[normalize-space()='Ticket Type']");
    public static By DrawerSubjectTitle = By.xpath("//span[@class='ticket-subject-heading mb-5']");
    public static By DrawerSubjectText = By.xpath("//span[@class='ticketSubject']");
    public static By RefreshButton = By.xpath("//span[normalize-space()='Refresh']");
    public static By TicketLogSectionTitle = By.xpath("//span[@class='drawerInsideTitle'][normalize-space()='Ticket Log']");
    public static By FirstLog = By.xpath("//div[@class='ticketLogText']");
    public static By SecondLog = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div[9]/div/ul/li[2]/div[4]/div");
    public static By Profile = By.xpath("//span[@class='ant-dropdown-menu-title-content']");
    public static By FirstName = By.xpath("//input[@placeholder='First Name']");
    public static By LastName = By.xpath("//input[@placeholder='Last Name']");
    public static By CreatedDateData = By.xpath("//span[@class='content-span']");
    public static By PropertyNameData = By.xpath("(//span[@class='content-span'])[2]");
    public static By TicketTypeData = By.xpath("(//span[@class='content-span'])[3]");
    public static By DrawerTicketClosed = By.xpath("//div[@class='ant-alert-message'][contains(text(),'This ticket is closed')]");
    public static By ClosedTabDetailsButton = By.xpath("//*[@id=\"rc-tabs-0-panel-2\"]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[8]/div/button");
    //*[@id="rc-tabs-0-panel-2"]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[8]/div/button
    public static By ZohoReplyButton = By.xpath("//button[@data-id='replyOption_Reply All']");
    public static By ZohoSendButton = By.xpath("//div[@data-title='Send']");
    public static By ZohoReplySpace = By.xpath("/html/body/div[1]");





    public String MsgUnderID(){
        return "Please be advised that you will receive email notifications for this support ticket conversation. You may also reply to the support team through your email.";
    }

    public boolean verifyUniqueTicketIDIsShowing(){
        waitforPresence(DrawerTicketId);
        String id = driver.findElement(DrawerTicketId).getText();
        if (id.matches("#\\d+")) {
            System.out.println("Unique Ticket ID is Showing");
            return true;
        } else {
            System.out.println("Unique Ticket ID is not Showing");
            return false;
        }

    }

    public boolean verifyFirstLogUnderTicketLog() throws InterruptedException {
        waitforPresence(CreateTicket.CreateTicketButton);
        click(DashboardPropertyDetails.TopAccountName);
        click(Profile);
        Thread.sleep(2500);
        String fName = driver.findElement(FirstName).getAttribute("value");
        String lName = driver.findElement(LastName).getAttribute("value");
        String AName =fName+" "+lName;
        click(CreateTicket.SupportButton);
        click(CreateTicket.CreateTicketButton);
        ticket.SelectOptionFromInputField(CreateTicket.SelectPropertyField,"prop-talha-6");
        ticket.SelectOptionFromInputField(CreateTicket.TicketTypeField,"Software Issue");
        operation.writeInputText(CreateTicket.SubjectField,"Software is not responding as expected",1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),500);
        click(CreateTicket.SubmitTicket);
        dashboard.refreshBrowser();
        Thread.sleep(3000);
        click(DetailsButton);
        Thread.sleep(5000);
        String log = driver.findElement(SecondLog).getText();
        System.out.println(log);
        String logMsg = AName+" "+"submitted a new ticket";
        if (log.equals(logMsg)) {
            System.out.println("Log msg is showing correctly");
            return true;
        } else {
            System.out.println("Log msg is not showing correctly");
            return false;
        }

    }

    public boolean verifyTableDataMatchingWithDrawer(By tableElement, By DrawerElement) throws InterruptedException {
        Thread.sleep(3500);
        waitforPresence(DetailsButton);
        String TableName = driver.findElement(tableElement).getText();
        System.out.println(TableName);
        click(DetailsButton);
        Thread.sleep(1500);
        waitforPresence(DrawerElement);
        String DrawerName = driver.findElement(DrawerElement).getText();
        if (TableName.equals(DrawerName)){
            System.out.println("Table data is matched with drawer data");
            return true;
        }
        else {
            System.out.println("Table data is not matched with drawer data");
            return false;
        }
    }


    public String zohoAdminReplyText(){
        return "Thanks for reaching us. We are checking the issue";
    }


    public void switchToIFrameElement(){
        WebElement iframeElement = driver.findElement(By.className("KB_Editor_iframe"));
// switch to the iframe
        driver.switchTo().frame(iframeElement);
    }

    public void switchBackFromIFrameElementToDefault(){
        driver.switchTo().defaultContent();
    }

    public boolean verifyReplyFromZohoAdminInDetailsDrawer() throws InterruptedException {
        Thread.sleep(2500);
        waitforPresence(DrawerZohoAdminReply);
        String reply = driver.findElement(DrawerZohoAdminReply).getText();
        if (reply.contains(zohoAdminReplyText())){
            System.out.println("Zoho admin reply is showing");
            return true;
        }
        else{
            System.out.println("Zoho admin reply is not showing");
            return false;

        }
    }

    public String EmailReplyRecievedInLog(){
        return "Email reply received from Zoho Admin";
    }
}
