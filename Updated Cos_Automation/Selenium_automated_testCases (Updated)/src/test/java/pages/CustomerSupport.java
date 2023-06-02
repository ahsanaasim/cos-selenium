package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class CustomerSupport extends BasePage{
    public CustomerSupport(WebDriver driver) {
        super(driver);
    }

    CreateTicket ticket = new CreateTicket(driver);
    CreateCharger operation = new CreateCharger(driver);
    Properties prop = ConfigUtill.getConfig();

    public static By Menu = By.xpath("//div[@class='ml-5 font-bold'][contains(text(),'Menu')]");
    public static By CustomerSupport = By.xpath("//h4[@class='mb-0 ml-10'][contains(text(),'Customer Support')]");
    public static By CreateATicket = By.xpath("//button[@class='ant-btn ant-btn-default createButton']");
    public static By CustomerSupportTitle = By.xpath("//div[@class='mainTitle'][contains(text(),'Customer Support')]");
    public static By CategoryField = By.xpath("//input[@class='ant-select-selection-search-input']");
    public static By MandatoryCategorySign = By.xpath("//span[@class='red-color'][contains(text(),'*')]");
    public static By MandatorySubjectSign = By.xpath("(//span[@class='red-color'][contains(text(),'*')])[2]");
    public static By MandatoryMessageSign = By.xpath("(//span[@class='red-color'][contains(text(),'*')])[3]");
    public static By SelectASessionTitle = By.xpath("//div[contains(text(),' Select A session')]");
    public static By SelectASessionField = By.xpath("(//input[@class='ant-select-selection-search-input'])[2]");
    public static By UploadButton = By.xpath("//div[@class='uploadBtn']");
    public static By MessageField = By.xpath("//textarea[@class='ant-input']");
    public static By UploadField = By.xpath("//div[@class='uploadDiv']");
    public static By UploadText = By.xpath("//div[@class='uploadText']");
    public static By SubmitButton = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-block submitButton']");
    public static By CategoryPlaceholder = By.xpath("//span[@class='ant-select-selection-placeholder']");
    public static By SelectASessionPlaceholder = By.xpath("(//span[@class='ant-select-selection-placeholder'])");
    public static By FirstCreatedTicket = By.xpath("//div[@class='locationName']");
    public static By OpenStatus1 = By.xpath("//div[@class='openText'][contains(text(),'Open')]");
    public static By ClosedStatus1 = By.xpath("//div[@class='closedText'][contains(text(),'Closed')]");
    public static By TicketsHistory = By.xpath("//div[@class='mainTitle']");
    public static By FirstSessionFromDropdown = By.xpath("(//div[@class='ant-select-item-option-content'])[4]");
    public static By CategoryRequiredMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Category field is required')]");
    public static By SessionRequiredMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Session field is required')]");
    public static By SubjectRequiredMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Subject field is required')]");
    public static By MessageFieldRequiredMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Message field is required')]");
    public static By NoDataTable = By.xpath("//img[@src='/images/noDataTable.svg']");
    public static By NoTicketText = By.xpath("//div[contains(text(),'No Tickets')]");
    public static By DropdownEmptyDataImage = By.xpath("//div[@class='ant-empty-image']");
    public static By DropdownNoData = By.xpath("//div[@class='ant-empty-description'][contains(text(),'No Data')]");
    public static By TicketsSeeDetails = By.xpath("//button[@class='ant-btn ant-btn-text seeDetailsButton']");
    public static By SeeDetailsPageTitle = By.xpath("//div[@class='pageTitle'][contains(text(),'Customer support')]");
    public static By TicketCategoryInList1 = By.xpath("//div[@class='locationName']");
    public static By SessionInList1 = By.xpath("//div[@class='dateDiv']");
    public static By TicketCategoryInSeeDetails = By.xpath("//span[@class='content-span']");
    public static By SessionInSeeDetails = By.xpath("(//span[@class='content-span'])[2]");
    public static By SubjectInSeeDetails = By.xpath("(//span[@class='content-span'])[3]");
    public static By MsgUnderTitle = By.xpath("//div[@class='ant-alert-message']");





    public void GoToCustomerLoginPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://test-app.chargeonsite.com/customer/login");
    }

    public void GoToCustomerSupportPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://test-app.chargeonsite.com/customer/customer-support");
    }

    public String MsgUnderTitleInTicketDetails(){
        return "Please be advised that you will receive email notifications for this support ticket conversation. You may also reply to the support team through your email.";
    }



    public boolean verifyCreateTicketTextColor() throws InterruptedException {
        Thread.sleep(3000);
        // identify text
        WebElement CreateTicket = driver.findElement(CreateATicket);
        //obtain color in rgba
        String s = CreateTicket.getCssValue("color");
        // convert rgba to hex
        String Hexcode = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Color is :" + Hexcode);
        String CreateTicketButtonTextColor = "#ffffff";
        if (Hexcode.equals(CreateTicketButtonTextColor)){
            System.out.println("Text colour of Create Button is white");
            return true;
        }
        else {
            System.out.println("Text colour of Create Button is not white");
            return false;
        }

    }

    public boolean verifySubmitTicketTextColor() throws InterruptedException {
        Thread.sleep(3000);
        // identify text
        WebElement CreateTicket = driver.findElement(SubmitButton);
        //obtain color in rgba
        String s = CreateTicket.getCssValue("color");
        // convert rgba to hex
        String Hexcode = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Color is :" + Hexcode);
        String CreateTicketButtonTextColor = "#ffffff";
        if (Hexcode.equals(CreateTicketButtonTextColor)){
            System.out.println("Text colour of Submit Button is white");
            return true;
        }
        else {
            System.out.println("Text colour of Submit Button is not white");
            return false;
        }

    }

    public boolean verifyCreateTicketButtonColor() throws InterruptedException {
        Thread.sleep(3000);
        // identify text
        WebElement CreateTicket = driver.findElement(CreateATicket);
        //obtain color in rgba
        String s = CreateTicket.getCssValue("background").replaceAll(" none repeat scroll 0% 0% / auto padding-box border-box","");
        // convert rgba to hex
        String Hexcode = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Color is :" + Hexcode);
        String CreateTicketButtonColor = "#115955";
        if (Hexcode.equals(CreateTicketButtonColor)){
            System.out.println("Colour of Create Button is dark green");
            return true;
        }
        else {
            System.out.println("Colour of Create Button is not dark green");
            return false;
        }

    }

    public boolean verifySubmitTicketButtonColor() throws InterruptedException {
        Thread.sleep(3000);
        // identify text
        WebElement CreateTicket = driver.findElement(SubmitButton);
        //obtain color in rgba
        String s = CreateTicket.getCssValue("background").replaceAll(" none repeat scroll 0% 0% / auto padding-box border-box","");
        // convert rgba to hex
        String Hexcode = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Color is :" + Hexcode);
        String CreateTicketButtonColor = "#115955";
        if (Hexcode.equals(CreateTicketButtonColor)){
            System.out.println("Colour of Submit Button is dark green");
            return true;
        }
        else {
            System.out.println("Colour of Submit Button is not dark green");
            return false;
        }

    }

    public boolean verifyCreateTicketPageIsClosedAfterCreatingNewTicket() throws InterruptedException {
        Thread.sleep(5000);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String expectedUrl = "https://test-app.chargeonsite.com/customer/customer-support";
        if (url.equals(expectedUrl)){
            System.out.println("Create ticket page is close after creating a ticket");
            return true;
        }
        else {
            System.out.println("Create ticket page is not close after creating a ticket");
            return false;
        }

    }

    public boolean verifyCurrentPageIsCreatingTicketPage() throws InterruptedException {
        Thread.sleep(2500);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String expectedUrl = "https://test-app.chargeonsite.com/customer/customer-support/create-ticket";
        if (url.equals(expectedUrl)){
            System.out.println("Create ticket page is still open");
            return true;
        }
        else {
            System.out.println("Create ticket page is closed");
            return false;
        }

    }

    public boolean verifySessionsAreShowingInTheDropdownListAreSameAsChargingHistoryList() throws InterruptedException {
        GoToCustomerSupportPage();
        waitforPresence(Menu);
        click(Menu);
        click(CustomerMenu.ChargingHistoryFromMenu);
        Thread.sleep(2500);
        int ChargingHistoryCount = driver.findElements(By.className("historyDetailsDiv")).size();
        System.out.println("Total charging history: "+ ChargingHistoryCount);
        click(Menu);
        click(CustomerSupport);
        click(CreateATicket);
        click(SelectASessionField);
        Thread.sleep(2000);
        int dropdownSessionCount = driver.findElements(By.className("ant-select-item-option-content")).size();
        System.out.println("Total session showing in dropdown: "+dropdownSessionCount);
        if (ChargingHistoryCount==dropdownSessionCount){
            System.out.println("All session id's are showing in the dropdown list");
            return true;
        }
        else {
            System.out.println("All the session id's are not showing in the dropdown list");
            return false;
        }

    }


    public String categoryRequiredMsg(){
        return "Category field is required";
    }

    public String SubjectRequiredMsg(){
        return "Subject field is required";
    }

    public String SessionRequiredMsg(){
        return "Session field is required";
    }

    public String MessageRequiredMsg(){
        return "Message field is required";
    }

    public void clickOnSessionFieldFirstDropdown() throws InterruptedException {
        Thread.sleep(1500);
        WebElement firstOption = driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[3]"));
        firstOption.click();
    }

    public boolean verifyTicketHistoryListTitle() throws InterruptedException {
        Thread.sleep(4000);
        waitforPresence(TicketsHistory);
        String title = driver.findElement(TicketsHistory).getText();
        System.out.println(title);
        if (title.matches("Ticket History \\(\\d+\\)")){
            System.out.println("Ticket History title is showing");
            return true;
        }
        else {
            System.out.println("Ticket History title is not showing");
            return false;
        }
    }

    public boolean verifyTicketListDataMatchingWithDrawer(By listElement, By DrawerElement) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(TicketsSeeDetails);
        String TableName = driver.findElement(listElement).getText();
        System.out.println(TableName);
        click(TicketsSeeDetails);
        Thread.sleep(1500);
        waitforPresence(DrawerElement);
        String DrawerName = driver.findElement(DrawerElement).getText();
        if (TableName.equals(DrawerName)){
            System.out.println("Ticket list data is matched with drawer data");
            return true;
        }
        else {
            System.out.println("Ticket list is not matched with drawer data");
            return false;
        }
    }


    public boolean verifySessionIdIsMatchingWithSeeDetailsSessionId() throws InterruptedException {
        Thread.sleep(1500);
        waitforPresence(SessionInList1);
        String listSession = driver.findElement(SessionInList1).getText().replace("Session: ","");
        System.out.println("Session in Ticket list: "+listSession);
        click(TicketsSeeDetails);
        waitforPresence(SessionInSeeDetails);
        String DetailsSession = driver.findElement(SessionInSeeDetails).getText().replace("Session: ","");
        System.out.println("Session in Details section: "+DetailsSession);
        if (listSession.equals(DetailsSession)){
            System.out.println("Session ID is showing correctly");
            return true;
        }
        else {
            System.out.println("Session ID is not showing correctly");
            return false;
        }
    }

    public boolean verifyTicketIsIncreasingTheListAfterCreatingANewTicket() throws InterruptedException {
        waitforPresence(TicketsSeeDetails);
        String Tickets = driver.findElement(TicketsHistory).getText().replaceAll("[^0-9]","");
        int TicketNumberBesideHistory = Integer.parseInt(Tickets);
        System.out.println("Tickets before creating a new ticket: "+TicketNumberBesideHistory);
        int TicketsInTheList = driver.findElements(By.className("historyDetailsDiv")).size();
        operation.ClickButton(CreateATicket,2000);
        ticket.SelectOptionFromInputField(CategoryField,"Software Issue");
        operation.writeInputText(CreateTicket.SubjectField,(prop.getProperty("TicketSubjectLessThanThirtyCharacter2")),1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("ShortTicketDescription")),500);
        operation.ClickButton(SubmitButton,2000);
        waitforPresence(TicketsSeeDetails);
        String TicketsAfter = driver.findElement(TicketsHistory).getText().replaceAll("[^0-9]","");
        int TicketNumberBesideHistoryAfter = Integer.parseInt(TicketsAfter);
        System.out.println("Tickets after creating a new ticket: "+TicketNumberBesideHistoryAfter);
        int TicketsInTheListAfter = driver.findElements(By.className("historyDetailsDiv")).size();
        int ExpectedTicketsBesideHistory = TicketNumberBesideHistory+1;
        int ExpectedTicketInTheList = TicketsInTheList+1;
        if (TicketNumberBesideHistoryAfter==ExpectedTicketsBesideHistory && TicketsInTheListAfter==ExpectedTicketInTheList){
            System.out.println("Tickets count is correct after creating a new ticket");
            return true;
        }
        else{
            System.out.println("Tickets count is not correct after creating a new ticket");
            return true;
        }
    }

    public boolean verifyNewlyCreatedTicketDateAndTime() throws InterruptedException {
        operation.ClickButton(CreateATicket,2000);
        ticket.SelectOptionFromInputField(CategoryField,"Billing");
        operation.writeInputText(CreateTicket.SubjectField,(prop.getProperty("TicketSubjectForBilling")),1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("TicketDescriptionForBillingIssue")),500);
        operation.ClickButton(SubmitButton,2000);
        // Parse the date string into a LocalDateTime object
        LocalDateTime now = LocalDateTime.now();
        // Create a formatter with the desired format
        DateTimeFormatter patternFormatter = DateTimeFormatter.ofPattern("MM/dd/yy, ha");
        // Format the date and time using the formatter
        String buttonClickedTime = now.format(patternFormatter);
        // Output the formatted date and time
        System.out.println("Button clicked on: "+buttonClickedTime);
        waitforPresence(TicketsSeeDetails);
        String listSession1 = driver.findElement(SessionInList1).getText().replace("Session: ","");
        System.out.println("Latest Ticket's session in Ticket list: "+listSession1);
        if (buttonClickedTime.equals(listSession1)){
            System.out.println("Date and time of created ticket is showing correctly");
            return true;
        }
        else {
            System.out.println("Date and time of created ticket is showing correctly");
            return false;

        }

    }


    public boolean verifyOpenStatusForNewlyCreatedTicket() throws InterruptedException {
        operation.ClickButton(CreateATicket,3000);
        ticket.SelectOptionFromInputField(CategoryField,"Charging Issue");
        click(SelectASessionField);
        click(FirstSessionFromDropdown);
        operation.writeInputText(CreateTicket.SubjectField,"Charger gets heated too much",1000);
        operation.writeInputText(CreateTicket.DescriptionField,(prop.getProperty("Paragraph")),500);
        operation.ClickButton(SubmitButton,2000);
        waitforPresence(OpenStatus1);
        String firstTicketStatus = driver.findElement(By.xpath("//div[@class='availableDiv flex items-center']")).getText();
        System.out.println(firstTicketStatus);
        if (firstTicketStatus.contains("Open")){
            System.out.println("Status of Latest created ticket is Open");
            return true;
        }
        else {
            System.out.println("Status of Latest created ticket is not Open");
            return false;
        }

    }


    public boolean verifyTicketCountInEmptyView(){
        waitforPresence(TicketsHistory);
        String Tickets = driver.findElement(TicketsHistory).getText().replaceAll("[^0-9]","");
        String expected = "0";
        if (Tickets.equals(expected)){
            System.out.println("Ticket count is showing zero in empty view");
            return true;
        }
        else {
            System.out.println("Ticket count is not showing zero in empty view");
            return false;
        }
    }

    public boolean verifyStatusOfFirstTicketInListIsOpen(){
        waitforPresence(SessionInList1);
        String firstTicketStatus = driver.findElement(By.xpath("//div[@class='availableDiv flex items-center']")).getText();
        System.out.println(firstTicketStatus);
        if (firstTicketStatus.contains("Open")){
            System.out.println("Status of Latest created ticket is Open");
            return true;
        }
        else {
            System.out.println("Status of Latest created ticket is not Open");
            return false;
        }
    }

    public boolean verifyStatusOfFirstTicketInListIsClosed(){
        waitforPresence(SessionInList1);
        String firstTicketStatus = driver.findElement(By.xpath("//div[@class='availableDiv flex items-center']")).getText();
        System.out.println(firstTicketStatus);
        if (firstTicketStatus.contains("Closed")){
            System.out.println("Status of Latest created ticket is Closed");
            return true;
        }
        else {
            System.out.println("Status of Latest created ticket is not Closed");
            return false;
        }
    }





}