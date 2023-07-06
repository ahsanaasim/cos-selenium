package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class COSA extends BasePage{
    public COSA(WebDriver driver)  {
        super(driver);
    }


    public static By COSALOGOInChatBot = By.xpath("//img[@src='/images/cos-icon-no-bg-green.svg']");
    public static By COSAFirstMsg = By.xpath("//div[@class='cosaBubble']");
    public static By COSAFirstReply = By.xpath("(//div[@class='cosaBubble'])[2]");
    public static By COSASecondReply = By.xpath("(//div[@class='cosaBubble'])[3]");
    public static By COSAThirdReply = By.xpath("(//div[@class='cosaBubble'])[4]");
    public static By COSAForthReply = By.xpath("(//div[@class='cosaBubble'])[5]");
    public static By COSAFifthReply = By.xpath("(//div[@class='cosaBubble'])[6]");
    public static By COSASixthReply = By.xpath("(//div[@class='cosaBubble'])[7]");
    public static By COSASeventhReply = By.xpath("(//div[@class='cosaBubble'])[8]");
    public static By KeepAnEyeOnSomeLocations = By.xpath("//div[@class='options'][contains(text(),'Keep an eye on some locations')]");
    public static By KeepAnEyeOnThisLocation = By.xpath("//div[@class='options'][contains(text(),'Keep an eye on this location')]");
    public static By ShowMeWatchList = By.xpath("//a[@href='/customer/cosa/watchlist']");
    public static By ReportAProblem = By.xpath("//a[@href='/customer/customer-support/create-ticket']");
    public static By HowDoIUseCharger = By.xpath("//a[@href='https://support.chargeonsite.com'][contains(text(),'How do I use a charger?')]");
    public static By CustomerFirstMessage = By.xpath("//div[@class='userBubble']");
    public static By CustomerSecondMessage = By.xpath("(//div[@class='userBubble'])[2]");
    public static By CustomerThirdMessage = By.xpath("(//div[@class='userBubble'])[3]");
    public static By CustomerFourthMessage = By.xpath("(//div[@class='userBubble'])[4]");
    public static By CustomerFifthMessage = By.xpath("(//div[@class='userBubble'])[5]");
    public static By CustomerSixthMessage = By.xpath("(//div[@class='userBubble'])[6]");
    public static By CustomerSeventhMessage = By.xpath("(//div[@class='userBubble'])[7]");
    public static By CustomerEighthMessage = By.xpath("(//div[@class='userBubble'])[8]");
    public static By DateBox = By.xpath("//input[@placeholder='Date']");
    public static By CalenderIcon = By.xpath("//span[@class='anticon anticon-calendar']");
    public static By TimeBox = By.xpath("//input[@placeholder='Time']");
    public static By ClockIcon = By.xpath("//span[@class='anticon anticon-clock-circle']");
    public static By AddressBox = By.xpath("//input[@placeholder='Address']");
    public static By SearchIcon = By.xpath("//span[@class='anticon anticon-search']");
    public static By WatchAnotherLocationInThisArea = By.xpath("//div[@class='options'][contains(text(),'Watch another location in this area')]");
    public static By ReturnToMainMenu = By.xpath("//div[@class='options returnOption'][contains(text(),'Return to the main menu')]");
    public static By TodayDate = By.xpath("//a[@class='ant-picker-today-btn']");
    public static By AM = By.xpath("//div[@class='ant-picker-time-panel-cell-inner'][contains(text(),'AM')]");
    public static By PM = By.xpath("//div[@class='ant-picker-time-panel-cell-inner'][contains(text(),'PM')]");
    public static By TimePickerOK = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']");
    public static By Area = By.xpath("//div[contains(text(),'Area')]");
    public static By SearchBoxList = By.xpath("//div[@class='isCosa-searchbox-list']");
    public static By FirstSuggestedAddressFromOption = By.xpath("//li[@role='option']");
    public static By SecondSuggestedAddressFromOption = By.xpath("(//li[@role='option'])[2]");
    public static By WatchButton = By.xpath("//div[@class='locationWatchButton'][contains(text(),'Watch')]");
    public static By WatchButton2 = By.xpath("(//div[@class='locationWatchButton'][contains(text(),'Watch')])[2]");
    public static By WatchButton3 = By.xpath("(//div[@class='locationWatchButton'][contains(text(),'Watch')])[3]");
    public static By WatchButton4 = By.xpath("(//div[@class='locationWatchButton'][contains(text(),'Watch')])[4]");
    public static By WatchingButton = By.xpath("//div[@class='locationWatchButton'][contains(text(),'Watching')]");
    public static By SuggestedLocation1 = By.xpath("//div[@class='locationName']");
    public static By SuggestedLocation2 = By.xpath("(//div[@class='locationName'])[2]");
    public static By SuggestedLocation3 = By.xpath("(//div[@class='locationName'])[3]");
    public static By SuggestedLocation4 = By.xpath("(//div[@class='locationName'])[4]");
    public static By AddressOfSuggestedLocation1 = By.xpath("//div[@class='locationAddress']");
    public static By AddressOfSuggestedLocation2 = By.xpath("(//div[@class='locationAddress'])[2]");
    public static By AddressOfSuggestedLocation3 = By.xpath("(//div[@class='locationAddress'])[3]");
    public static By AddressOfSuggestedLocation4 = By.xpath("(//div[@class='locationAddress'])[4]");
    public static By LocationDistance = By.xpath("//div[@class='locationDistance']");






    public void GoToCOSAChatbot() throws InterruptedException {
        Thread.sleep(3500);
        driver.get("https://test-app.chargeonsite.com/customer/cosa");

    }

    public void GoToCOSAWithD10LocationID() throws InterruptedException {
        Thread.sleep(3500);
        driver.get("https://test-app.chargeonsite.com/customer/cosa/de085847-54de-4734-b108-426c7d61f8f4");

    }

    public void GoToCOSAWithRawLocationID() throws InterruptedException {
        Thread.sleep(2500);
        GoToWebsite("https://test-app.chargeonsite.com/customer/cosa/58e27a8d-9215-4b10-a579-815e124fbf92");

    }

    public void ScanRawLocationCharger() throws InterruptedException {
        Thread.sleep(3500);
        GoToWebsite("https://test-app.chargeonsite.com/charger/8RZGZQ");

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

    public boolean URLCheckAfterMovingToCOSAFromLocationDetails() throws InterruptedException {
        Thread.sleep(3000);
        String expectedURL = "https://test-app.chargeonsite.com/customer/cosa/"+D10LocationId();
        wait.until(ExpectedConditions.urlToBe(expectedURL));
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals(expectedURL)){
            System.out.println("Navigating to COSA Chatbot page from location details page");
            return true;
        }
        else {
            System.out.println("System is not navigating to COSA Chatbot page");
            return false;
        }

    }

    public boolean URLCheckAfterMovingToCOSAFromSessionDetails() throws InterruptedException {
        Thread.sleep(3000);
        String expectedURL = "https://test-app.chargeonsite.com/customer/cosa/"+D10LocationId();
        wait.until(ExpectedConditions.urlToBe(expectedURL));
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals(expectedURL)){
            System.out.println("Navigating to COSA Chatbot page from location details page");
            return true;
        }
        else {
            System.out.println("System is not navigating to COSA Chatbot page");
            return false;
        }

    }

    public String COSAFirstMsgForTester(){
        return "Hi Tester, I am COSA, your EV Assistant. How can I help you today?";
    }

    public String COSAFirstMsgForLM10(){
        return "Hi LM, I am COSA, your EV Assistant. How can I help you today?";
    }



    public String COSFResponseAfterClickingKeepOnEyeSomeLocations(){
        return "Sure Tester, Please give me an address near where you would like to charge and a date and time, and I will locate options for you.";
    }

    public String COSAReplyAfterProvidingAllInformationCorrectly(){
        return "Thank You. Here are some locations that might work for you. Please select one to add it to your watchlist.";
    }

    public String COSAReplyForNoNearbyLocations(){
        return "I am sorry. I couldn't find any suitable locations at the moment. Please check back later for more options.";
    }

    public String D10LocationId(){
        return "de085847-54de-4734-b108-426c7d61f8f4";
    }

    public String COSAMsgForD10LocationWhenTesterIsLoggedIn(){
        return "Sure Tester, Please give me a date and time to watch the location named Banasree D-10 located in Police park, Banasree.";
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


    public void clickOnFutureDate(int days) throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(DateBox);
        // Locate and click on the date picker element
        WebElement datePicker = driver.findElement(By.xpath("//div[@class='ant-picker-input']"));
        datePicker.click();

        // Calculate the future date you want to select (e.g., 7 days from today)
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(days);

        // Define the desired date format
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Format the future date as per the desired format
        String formattedFutureDate = futureDate.format(dateFormatter);

        // Locate and interact with the specific date element representing the future date
        WebElement futureDateElement = driver.findElement(By.xpath("//td[@title='"+formattedFutureDate+"']"));
        Thread.sleep(2500);
        futureDateElement.click();

    }


    public boolean verifyPastDateIsDisabled() throws InterruptedException {
        // Locate and click on the date picker element
        WebElement datePicker = driver.findElement(By.xpath("//div[@class='ant-picker-input']"));
        datePicker.click();
        LocalDate currentDate = LocalDate.now();
        LocalDate pastDate = currentDate.minusDays(1);
        // Define the desired date format
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Format the future date as per the desired format
        String formattedPastDate = pastDate.format(dateFormatter);
        // Locate and interact with the specific date element representing the future date
        String cls = driver.findElement(By.xpath("//td[@title='"+formattedPastDate+"']")).getAttribute("class");
        System.out.println(cls);
        String expected = "disabled";
        Thread.sleep(2500);
        if (cls.contains(expected)){
            System.out.println("past days are disabled");
            return true;
        }
        else{
            System.out.println("past days are disabled");
            return false;
        }

    }

    public void selectTime(String time,By period) throws InterruptedException {
        waitforPresence(TimeBox);
        WebElement TimePicker = driver.findElement(By.xpath("//div[@class='ant-picker timePick']"));
        TimePicker.click();
        // Locate and interact with the specific date element representing the future date
        WebElement TimeElement = driver.findElement(By.xpath("//div[@class='ant-picker-time-panel-cell-inner'][contains(text(),'"+time+"')]"));
        Thread.sleep(2500);
        TimeElement.click();
        Thread.sleep(1500);
        click(period);
        click(TimePickerOK);


    }

    public void selectTiming(String time,By period) throws InterruptedException {
        waitforPresence(TimeBox);
        WebElement TimePicker = driver.findElement(By.xpath("//div[@class='ant-picker timePick']"));
        TimePicker.click();
        // Locate and interact with the specific date element representing the future date
        WebElement TimeElement = driver.findElement(By.xpath("//div[@class='ant-picker-time-panel-cell-inner'][contains(text(),'07')]"));
        TimeElement.click();
        Thread.sleep(2500);
        TimeElement.click();
        WebElement TimeElement2 = driver.findElement(By.xpath("//div[@class='ant-picker-time-panel-cell-inner'][contains(text(),'"+time+"')]"));
        Thread.sleep(1500);
        TimeElement2.click();
        click(period);
        click(TimePickerOK);


    }



    public boolean verifyTimeIsPostedCorrectlyOnChatBot(String time) throws InterruptedException {
        Thread.sleep(1500);
        waitforPresence(TimeBox);
        WebElement TimePicker = driver.findElement(By.xpath("//div[@class='ant-picker timePick']"));
        TimePicker.click();
        // Locate and interact with the specific date element representing the future date
        WebElement TimeElement = driver.findElement(By.xpath("//div[@class='ant-picker-time-panel-cell-inner'][contains(text(),'"+time+"')]"));
        Thread.sleep(2500);
        TimeElement.click();
        Thread.sleep(1500);
        click(PM);
        click(TimePickerOK);
        String postedTime = readText(CustomerSecondMessage);
        System.out.println("Time posted in chatbox: "+postedTime);
        String expected = "Time: "+time+":00 PM";
        if (postedTime.equals(expected)){
            System.out.println("Time posted correctly on chatbot");
            return true;
        }
        else{
            System.out.println("Time is not posted correctly on chatbot");
            return false;
        }

    }

    public void selectLocationFromAddressField(String Address) throws InterruptedException {
        CreateCharger operation = new CreateCharger(driver);
        Thread.sleep(1000);
        waitforPresence(COSA.AddressBox);
        click(COSA.AddressBox);
        operation.writeInputText(COSA.AddressBox,Address,1000);
        operation.ClickButton(COSA.FirstSuggestedAddressFromOption,2000);


    }

    public boolean verifyFourNearbyLocationsAreShowing() throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(WatchButton);
        int locationCount = driver.findElements(By.className("locationName")).size();
        System.out.println("Number of nearby locations are showing : "+locationCount);
        if (locationCount==4){
            System.out.println("Four nearby locations are showing");
            return true;
        }
        else {
            System.out.println("Four nearby locations are not showing");
            return false;
        }
    }


    public boolean verifySuggestedNearbyLocation(By element) throws InterruptedException {
        Thread.sleep(1000);
        waitforPresence(element);
        String location1 = "Nearby loc 101";
        String location2 = "Sundarban courier";
        String location3 = "Banasree D-10";
        String location4 = "Paikare shop";
        String location5 = "Rampura Bridge";
        String location6 = "Tesla Destination Charger";
        String location7 = "Shanta holdings";
        String Location = readText(element);
        System.out.println("Suggested location: "+Location);
        if (Location.contains(location1) || Location.contains(location2) || Location.contains(location3) || Location.contains(location4) || Location.contains(location5) || Location.contains(location6) || Location.contains(location7)){
            System.out.println("Suggested first location is within 10 km");
            return true;
        }
        else {
            System.out.println("Suggested first location is not within 10 km");
            return true;

        }

    }

    public boolean verifyCustomerResponseMessageAfterWatchingALocation(By SuggestedLoc, By AddressOfLoc, By CustomerMsg) throws InterruptedException {
        Thread.sleep(2500);
        String LocationName = readText(SuggestedLoc);
        String Address = readText(AddressOfLoc);
        String CustomerMessage = readText(CustomerMsg);
        System.out.println("Customer response after click on watch: "+CustomerMessage);
        String expected = "Keep me in the watchlist on the "+LocationName+", "+Address;
        if (CustomerMessage.equals(expected)){
            System.out.println("Keep me in the watchlist message is showing correctly");
            return true;
        }
        else {
            System.out.println("Keep me in the watchlist message is not showing correctly");
            return false;
        }


    }

    public boolean verifyCOSAResponseAfterAddingALocationToWatchlist(By SuggestedLoc, By AddressOfLoc, By Cosareply) throws InterruptedException {
        Thread.sleep(2500);
        String LocationName = readText(SuggestedLoc);
        String Address = readText(AddressOfLoc);
        String DateMsg = readText(CustomerSecondMessage).replaceAll("Date: ","");
        System.out.println("Date msg :"+DateMsg);
        String COSAMessage = readText(Cosareply);
        System.out.println("COSA response after click on watch: "+COSAMessage);
        String expected = "I have added "+LocationName+", "+Address+" to your watchlist. I will keep you updated on the availability of this location on "+DateMsg+".";
        System.out.println(expected);
        if (COSAMessage.equals(expected)){
            System.out.println("COSA response message is showing correctly");
            return true;
        }
        else {
            System.out.println("COSA response message is not showing correctly");
            return false;
        }


    }


    public boolean verifyCOSAResponseAfterAddingASpecificLocationToWatchlist(By Cosareply) throws InterruptedException {
        MapDetails mapDetails = new MapDetails(driver);
        mapDetails.GoToPaikareLocation();
        Thread.sleep(2500);
        waitforPresence(MapDetails.LocationName);
        String LocationName = readText(MapDetails.LocationName);
        String Address = readText(MapDetails.PropertyLocationAddress);
        String[] parts = Address.split(",");
        String LocationAddress = parts[1]+","+parts[2];
        System.out.println("Location address : "+LocationAddress);
        click(MapDetails.AskCOSAButton);
        click(KeepAnEyeOnThisLocation);
        clickOnFutureDate(05);
        selectTime("03",COSA.PM);
        Thread.sleep(2500);
        String DateMsg = readText(CustomerSecondMessage).replaceAll("Date: ","");
        System.out.println("Date msg :"+DateMsg);
        String COSAMessage = readText(Cosareply);
        System.out.println("COSA response after click on watch: "+COSAMessage);
        String expected = "I have added "+LocationName+","+LocationAddress+" to your watchlist. I will keep you updated on the availability of this location on "+DateMsg+".";
        System.out.println(expected);
        if (COSAMessage.equals(expected)){
            System.out.println("COSA response message is showing correctly");
            return true;
        }
        else {
            System.out.println("COSA response message is not showing correctly");
            return false;
        }


    }

    public boolean verifyLocationIsAddedToWatchlist() throws InterruptedException {
        MapDetails mapDetails = new MapDetails(driver);
        mapDetails.GoToShantaHoldingsLocationInMapDetails();
        Thread.sleep(2500);
        waitforPresence(MapDetails.LocationName);
        String LocationName = readText(MapDetails.LocationName);
        String Address = readText(MapDetails.PropertyLocationAddress);
        System.out.println("Location address : "+Address);
        click(MapDetails.AskCOSAButton);
        click(KeepAnEyeOnThisLocation);
        clickOnFutureDate(9);
        selectTiming("10",COSA.PM);
        Thread.sleep(2500);
        click(ShowMeWatchList);
        Thread.sleep(2500);
        String LocationName2 = readText(WatchList.LocationName);
        System.out.println("Location name in watchlist: "+LocationName2);
        String Address2 = readText(WatchList.LocationAddress);
        System.out.println("Location address in watchlist :"+Address2);
        if (LocationName.equals(LocationName2) || Address.equals(Address2)){
            System.out.println("Location is added to watchlist");
            return true;
        }
        else {
            System.out.println("Location is not added to watchlist");
            return false;
        }


    }

    public boolean verifyLocationIsAddedToWatchlist2() throws InterruptedException {
        MapDetails mapDetails = new MapDetails(driver);
        mapDetails.GoToShantaHoldingsLocationInMapDetails();
        Thread.sleep(2500);
        waitforPresence(MapDetails.LocationName);
        String LocationName = readText(MapDetails.LocationName);
        String Address = readText(MapDetails.PropertyLocationAddress);
        System.out.println("Location address : "+Address);
        click(MapDetails.AskCOSAButton);
        click(KeepAnEyeOnThisLocation);
        clickOnFutureDate(04);
        selectTiming("10",COSA.PM);
        Thread.sleep(2500);
        click(ShowMeWatchList);
        Thread.sleep(2500);
        List<WebElement> locationElements = driver.findElements(By.className("locationName mt-5"));
        System.out.println("location elements: "+ locationElements);
        // Create an ArrayList to store the text values
        ArrayList<String> locationTexts = new ArrayList<>();
        // Iterate through each location element and add its text to the ArrayList
        for (WebElement element : locationElements) {
            locationTexts.add(element.getText());
        }
        // Verify if the expected string is present in the ArrayList
        String expected = LocationName;
        boolean isExpectedPresent = locationTexts.contains(expected);
        if (isExpectedPresent){
            System.out.println("Location is added to watchlist");
            return true;
        }
        else {
            System.out.println("Location is not added to watchlist");
            return false;
        }


    }




    public boolean verifyCOSAResponseWhileAddingAlreadyAddedLocationToWatchlist(By Cosareply) throws InterruptedException {
        Thread.sleep(2500);
        String TimeMsg = readText(CustomerThirdMessage).replaceAll("Time: ","");
        String DateMsg = readText(CustomerSecondMessage).replaceAll("Date: ","");
        System.out.println("Date msg :"+DateMsg);
        String COSAMessage = readText(Cosareply);
        System.out.println("COSA response after click on watching: "+COSAMessage);
        String expected = "You are already watching this location for "+TimeMsg+", "+DateMsg;
        System.out.println(expected);
        if (COSAMessage.equals(expected)){
            System.out.println("COSA response message is showing correctly");
            return true;
        }
        else {
            System.out.println("COSA response message is not showing correctly");
            return false;
        }


    }

    public boolean verifyLocationName() throws InterruptedException {
        CreateLocation location = new CreateLocation(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        Thread.sleep(1500);
        waitforPresence(FavoriteLocation.LocationName);
        String s = readText(FavoriteLocation.LocationName);
        System.out.println("Location name in COSA: " + s);
        SwitchToTab(1);
        location.GoToLocationPage();
        location.writeINLocationSearchBar(s);
        operation.ClickButton(EditCompany.searchbtn,1500);
        waitforPresence(EditLocation.PropertyName1InColumn);
        String LocationName = readText(EditLocation.LocationName1InColumn);
        System.out.println("location address in drawer: " + LocationName);
        if (s.equals(LocationName)) {
            System.out.println("Location name is showing correctly");
            return true;
        } else {
            System.out.println("Location name is not showing correctly");
            return false;
        }
    }

    public boolean verifyLocationAddress() throws InterruptedException {
        CreateLocation location = new CreateLocation(driver);
        CreateCharger operation = new CreateCharger(driver);
        Dashboard dashboard = new Dashboard(driver);
        Thread.sleep(1500);
        waitforPresence(FavoriteLocation.LocationName);
        String s = readText(FavoriteLocation.LocationName);
        String s2 = readText(FavoriteLocation.LocationAddress);
        System.out.println("Location address: " + s2);
        SwitchToTab(1);
        location.GoToLocationPage();
        location.writeINLocationSearchBar(s);
        operation.ClickButton(EditCompany.searchbtn,1500);
        operation.ClickButton(EditLocation.EditButton,1500);
        waitforPresence(EditLocation.PropertyName1InColumn);
        String propertyLocationAddress = readText(EditLocation.PropertyAddressInDrawer);
        System.out.println("location address in drawer: " + propertyLocationAddress);
        if (s2.equals(propertyLocationAddress)) {
            System.out.println("Location address is showing correctly");
            return true;
        } else {
            System.out.println("Location address is not showing correctly");
            return false;
        }
    }

    public boolean verifyLocationDistanceSectionIsShowing() throws InterruptedException {
        Thread.sleep(1500);
        String s = readText(LocationDistance);
        if (s.matches("\\d mi")) {
            System.out.println("Location distance is showing in mile");
            return true;
        } else {
            System.out.println("Location distance is not showing in mile");
            return false;
        }
    }

    public boolean verifyCosaPageUrlWhenMovingFromFavorites() throws InterruptedException {
        Thread.sleep(3000);
        String currentUrl = driver.getCurrentUrl();
        String LocID = currentUrl.replaceAll("https://test-app.chargeonsite.com/customer/cosa/","");
        System.out.println("Location id: "+LocID);
        if (!LocID.isEmpty()) {
            System.out.println("Url is showing with location id");
            return true;
        } else {
            System.out.println("Url is not showing with location id");
            return false;
        }

    }


    public void clearWatchList() throws InterruptedException {
        Thread.sleep(4000);
        try {
            while (driver.findElement(WatchList.CrossButton).isDisplayed()){
                Thread.sleep(2500);
                click(WatchList.CrossButton);
                click(WatchList.YesButton);

            }
        }
        catch (NoSuchElementException e){
            System.out.println("not found");
        }

    }







}