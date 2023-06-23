package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class COSA extends BasePage{
    public COSA(WebDriver driver)  {
        super(driver);
    }


    public static By COSALOGOInChatBot = By.xpath("//img[@src='/images/cos-icon-no-bg-green.svg']");
    public static By COSAFirstMsg = By.xpath("//div[@class='cosaBubble']");
    public static By COSAFirstReply = By.xpath("(//div[@class='cosaBubble'])[2]");
    public static By COSASecondReply = By.xpath("(//div[@class='cosaBubble'])[3]");
    public static By COSAThirdReply = By.xpath("(//div[@class='cosaBubble'])[4]");
    public static By KeepAnEyeOnSomeLocations = By.xpath("//div[@class='options'][contains(text(),'Keep an eye on some locations')]");
    public static By ShowMeWatchList = By.xpath("//a[@href='/customer/cosa/watchlist']");
    public static By ReportAProblem = By.xpath("//a[@href='/customer/customer-support/create-ticket']");
    public static By HowDoIUseCharger = By.xpath("//div[@class='options'][contains(text(),'How do I use a charger?')]");
    public static By CustomerFirstMessage = By.xpath("//div[@class='userBubble']");
    public static By CustomerSecondMessage = By.xpath("(//div[@class='userBubble'])[2]");
    public static By DateBox = By.xpath("//input[@placeholder='Date']");
    public static By CalenderIcon = By.xpath("//span[@class='anticon anticon-calendar']");
    public static By TimeBox = By.xpath("//input[@placeholder='Time']");
    public static By ClockIcon = By.xpath("//span[@class='anticon anticon-clock-circle']");
    public static By AddressBox = By.xpath("//input[@placeholder='Address']");
    public static By SearchIcon = By.xpath("//span[@class='anticon anticon-search']");
    public static By ReturnToMainMenu = By.xpath("//div[@class='options returnOption'][contains(text(),'Return to the main menu')]");
    public static By TodayDate = By.xpath("//a[@class='ant-picker-today-btn']");




    public void GoToCOSAChatbot() throws InterruptedException {
        Thread.sleep(1500);
        driver.get("https://test-app.chargeonsite.com/customer/cosa");

    }

    public boolean CurrentPageURLCheck(String expected) throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.urlToBe(expected));
        String currentUrl = driver.getCurrentUrl();
        String expectedURL = expected;
        if (currentUrl.equals(expectedURL)){
            System.out.println("Navigating to COSA Chatbot page");
            return true;
        }
        else {
            System.out.println("System is not navigating to COSA Chatbot page");
            return false;
        }

    }

    public String COSFirstMsgForTester(){
        return "Hi Tester, I am COSA, your EV Assistant. How can I help you today?";
    }

    public String COSFResponseAfterClickingKeepOnEyeSomeLocations(){
        return "Sure Tester, Please give me an address near where you would like to charge and a date and time, and I will locate options for you.";
    }


    public boolean verifyCurrentDateIsShowingInChatAfterSelectingToday(){
        waitforPresence(TodayDate);
        click(TodayDate);
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate = currentDate.format(dateFormatter);
        String date = "Date: "+formattedDate;
        System.out.println("Today's date: "+date);
        String dateInChat = readText(CustomerSecondMessage);
        System.out.println("Customer reply in ChatBot: "+dateInChat);
        if (date.equals(dateInChat)){
            System.out.println("Date is posted in chatbot correctly");
            return true;
        }
        else {
            System.out.println("Date is not posted in chatbot correctly");
            return false;
        }



    }




}
