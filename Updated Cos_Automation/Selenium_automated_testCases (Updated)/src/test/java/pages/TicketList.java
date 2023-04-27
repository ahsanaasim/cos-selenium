package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TicketList extends BasePage{

    public TicketList(WebDriver driver) {

        super(driver);
    }

    public static By QuestionMarkSupportButton = By.xpath("//span[@class='anticon anticon-question-circle']");
    public static By CreatedDateTitle = By.xpath("//th[normalize-space()='Created Date']");
    public static By IDTitle = By.xpath("//th[normalize-space()='ID']");
    public static By SubjectTitle = By.xpath("//th[normalize-space()='Subject']");
    public static By CreatedByTitle = By.xpath("//th[normalize-space()='Created By']");
    public static By TypeTitle = By.xpath("//th[normalize-space()='Type']");
    public static By PropertyNameTitle = By.xpath("//th[normalize-space()='Property Name']");
    public static By StatusTitle = By.xpath("//th[normalize-space()='Status']");
    public static By ActionTitle = By.xpath("//th[normalize-space()='Action']");
    public static By SupportPageTitle = By.xpath("//div[@class='pageTitle m-auto-0 mr-auto'][contains(text(),'Support')]");

}
