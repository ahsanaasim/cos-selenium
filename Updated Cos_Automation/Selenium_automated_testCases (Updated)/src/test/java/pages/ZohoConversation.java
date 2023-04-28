package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZohoConversation extends BasePage {
    public ZohoConversation(WebDriver driver) {

        super(driver);
    }

    public static By DetailsButton = By.xpath("(//span[contains(text(),'Details')])[1]");
    public static By MsgUnderTicketId = By.xpath("//div[@class='ant-alert-message']");

    public static By DrawerTicketId = By.xpath("//div[@class='drawerTitle wordBreak']");
    public static By DrawerTicketInformationTitle = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Ticket Information')]");
    public static By DrawerTicketDescriptionTitle = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Ticket Description')]");
    public static By CreatedDateTitle = By.xpath("//span[normalize-space()='Created Date']");
    public static By PropertyNameTitle = By.xpath("//span[normalize-space()='Property Name']");
    public static By TicketTypeTitle = By.xpath("//span[normalize-space()='Ticket Type']");
    public static By DrawerSubjectTitle = By.xpath("//span[@class='ticket-subject-heading mb-5']");
    public static By DrawerSubjectText = By.xpath("//span[@class='ticketSubject']");
    public static By RefreshButton = By.xpath("//span[normalize-space()='Refresh']");





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
}
