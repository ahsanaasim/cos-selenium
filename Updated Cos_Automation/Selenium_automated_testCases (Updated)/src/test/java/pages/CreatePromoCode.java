package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CreatePromoCode extends BasePage{
    public CreatePromoCode(WebDriver driver){
        super(driver);
    }
    Properties prop = ConfigUtill.getConfig();


    public static By drawerTitle = By.xpath("//span[@class='drawerTitle']");
    public static By promoInformationLabel = By.xpath("//span[@class='drawerInsideTitle']");
    public static By propertyInformationLabel = By.xpath("(//span[@class='drawerInsideTitle'])[2]");
    public static By promoCodeLabel = By.xpath("//div[@class='text-14 weight-500 location-long-la mb-4']");
    public static By promoRulesLabel = By.xpath("(//div[@class='text-14 weight-500 location-long-la mb-4'])[2]");
    public static By promoStartDateLabel = By.xpath("(//div[@class='text-14 weight-500 location-long-la mb-4'])[3]");
    public static By promoExpiryDateLabel = By.xpath("(//div[@class='text-14 weight-500 location-long-la mb-4'])[4]");
    public static By reuseLimitPerPersonLabel = By.xpath("(//div[@class='text-14 weight-500 location-long-la mb-4'])[5]");
    public static By assignPropertyLabel = By.xpath("(//div[@class='text-14 weight-500 location-long-la mb-4'])[6]");
    public static By promoCodeField = By.xpath("//input[@placeholder='Promo Code']");
    public static By promoRulesField = By.xpath("//input[@placeholder='Promo Rules']");
    public static By promoStartDateField = By.xpath("//input[@placeholder='Select date']");
    public static By promoExpiryDateField = By.xpath("(//input[@placeholder='Select date'])[2]");
    public static By reuseLimitPerPersonField = By.xpath("//input[@placeholder='Reuse Limit Per Person']");
    public static By percentageType = By.xpath("//span[@title='Percentage']");
    public static By flatType = By.xpath("//span[@title='Flat Base']");
    public static By calenderBoxOfStartDateField = By.xpath("//span[@class='anticon anticon-calendar']");
    public static By calenderBoxOfExpiryDateField = By.xpath("(//span[@class='anticon anticon-calendar'])[2]");
    public static By crossIconOfStartDateField = By.xpath("//span[@class='anticon anticon-close-circle']");
    public static By crossIconOfExpiryDateField = By.xpath("//span[@class='anticon anticon-close-circle']");
    public static By percentageInOption = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Percentage')]");
    public static By flatBaseInOption = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Flat Base')]");
    public static By promoRulesUnit = By.xpath("(//span[@class='ant-input-group-addon'])[3]");
    public static By reuseLimitAddOn = By.xpath("(//span[@class='ant-input-group-addon'])[4]");
    public static By textUnderReuseLimitField = By.xpath("//p[@class='optional-color mt-4 mb-0']");
    public static By savePromoCodeButton = By.xpath("//button[@type='button']//span[contains(text(),'Save Promo Code')]");
    public static By saveAndCreateAnotherPromoCodeButton = By.xpath("//button[@type='button']//span[contains(text(),'Save & Create Another Promo Code')]");
    public static By assignedPropertyArrow = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm ant-btn-icon-only']");
    public static By unassignedPropertyArrow = By.xpath("(//button[@class='ant-btn ant-btn-primary ant-btn-sm ant-btn-icon-only'])[2]");
    public static By today = By.xpath("//a[@class='ant-picker-today-btn']");
    public static By yearInDatePicker = By.xpath("//button[@class='ant-picker-year-btn']");
    public static By yearInDatePickerForExpiryDate = By.xpath("(//button[@class='ant-picker-year-btn'])[2]");
    public static By monthInDatePicker = By.xpath("//button[@class='ant-picker-month-btn']");
    public static By monthInDatePickerForExpiryDate = By.xpath("(//button[@class='ant-picker-month-btn'])[2]");
    public static By januaryMonth = By.xpath("//div[@class='ant-picker-cell-inner']");
    public static By banasreePoliceParkProperty = By.xpath("//span[@class='ant-transfer-list-content-item-text'][contains(text(),'Banasree police park')]");
    public static By tempXyzProperty = By.xpath("//span[@class='ant-transfer-list-content-item-text'][contains(text(),'Temporary Property xyz')]");
    public static By successfullyCreatedPopUp = By.xpath("//span[contains(text(),'Promo Code created successfully')]");
    public static By validationPopUpOfAlreadyActivePopUp = By.xpath("//span[contains(text(),'Promo already active for these date ranges')]");
    public static By crossButton = By.xpath("//span[@class='anticon anticon-close']");
    public static By modalTitle = By.xpath("//span[@class='ant-modal-confirm-title']");
    public static By modalContent = By.xpath("//div[@class='ant-modal-confirm-content']");
    public static By discardButton = By.xpath("//button[@type='button']//span[contains(text(),'Discard')]");
    public static By continueButton = By.xpath("//button[@type='button']//span[contains(text(),'Continue')]");
    public static By unassignedPropertiesCount = By.xpath("//span[@class='ant-transfer-list-header-title']");
    public static By assignedPropertiesCount = By.xpath("(//span[@class='ant-transfer-list-header-title'])[2]");
    public static By noDataView = By.xpath("//img[@src='/images/noDataTable.svg']");
    public static By createNewPromoCodeButton = By.xpath("//button[@type='button']//span[contains(text(),'Create New Promo')]");
    public static By editButton = By.xpath("//button[@type='button']//span[contains(text(),'Edit')]");
    public static By validationMsgForField1 = By.xpath("//div[@class='ant-form-item-explain-error']");
    public static By validationMsgForField2 = By.xpath("(//div[@class='ant-form-item-explain-error'])[2]");
    public static By validationMsgForField3 = By.xpath("(//div[@class='ant-form-item-explain-error'])[3]");
    public static By validationMsgForField4 = By.xpath("(//div[@class='ant-form-item-explain-error'])[4]");
    public static By validationMsgForPropertySelection = By.xpath("//div[@class='red-color mt-5']");




    public String requiredMsgForPromoCode(){
        return "Promo code is required";
    }
    public String requiredMsgForPromoRules(){
        return "Promo rules is required";
    }
    public String requiredMsgForStartDate(){
        return "Start date is required";
    }
    public String requiredMsgForExpiryDate(){
        return "Expiry date is required";
    }
    public String requiredMsgForProperty(){
        return "Property is required";
    }
    public String validationMsgForInvalidValuesInPromoRules(){
        return "Please provide a valid promo rules";
    }
    public String validationMsgInvalidIntervalBetweenDates(){
        return "Ensure 1 day interval between start and expiry date";
    }

    public String validationMsgForExistingPromoCodeNameAndDateRanges(){
        return "Promo already active for these date ranges";
    }

    public String validationMsgForInvalidLimitInReuseLimitField(){
        return "Please provide a valid limit";
    }


    public String createPromoDrawerTitle(){
        return "Create New Promo Code";
    }

    public String textUnderReuseLimitField(){
        return "No usage limits on promo until reuse limit is set";
    }

    public String areYouSureText(){
        return "Are you sure?";
    }

    public String discardAndContinueText(){
        return "Do you want to discard or continue?";
    }




    public boolean verifyPromoCodeInPropertyList() throws InterruptedException {
        goToWebsite(urlOfAdminApp(prop.getProperty("PropertyURL")));
        waitVisibility(SearchandFilterProperties.totalCount);
        String pCount = driver.findElement(SearchandFilterProperties.totalCount).getText().replaceAll("Total ","");
        int pCountInNumber = Integer.parseInt(pCount);
        System.out.println("Actual total property count: "+pCountInNumber);
        goToWebsite(urlOfAdminApp(prop.getProperty("AccessCodePageURL")));
        clickOnCreateNewCompanyButton();
        String expected = "Unassigned Properties ("+pCountInNumber+")";
        String propertyCountInTheDrawer = readText(unassignedPropertiesCount);
        System.out.println("Property count in the create promo drawer: "+propertyCountInTheDrawer);
        if (propertyCountInTheDrawer.equals(expected)){
            System.out.println("Property count is showing correctly");
            return true;
        }
        else{
            System.out.println("Property count is not showing correctly");
            return false;
        }

    }


    public boolean verifyCountOfAssignedPropertiesHasIncreased(String propertyToAdd) throws InterruptedException {
        waitVisibility(assignedPropertiesCount);
        String assignedPCountBefore = readText(assignedPropertiesCount);
        String pCount = assignedPCountBefore.replaceAll("Assigned Properties \\((\\d+)\\)","$1");
        int assignedPCount = Integer.parseInt(pCount);
        System.out.println("Assigned properties count before selecting a property : "+assignedPCountBefore);
        selectProperty(propertyToAdd);
        waitForFewMoment(1000);
        String assignedProperty = readText(assignedPropertiesCount);
        String assignedPCountAfter = assignedProperty.replaceAll("Assigned Properties \\((\\d+)\\)", "$1");
        int assignedPCountA = Integer.parseInt(assignedPCountAfter);
        int expected2 = assignedPCount+1;
        String expected = "Assigned Properties (1)";
        System.out.println("Assigned properties count after selecting a property : "+assignedProperty);
        if (assignedProperty.equals(expected) || assignedPCountA==expected2){
            System.out.println("Property count is increasing correctly");
            return true;
        }
        else{
            System.out.println("Property count is not increasing correctly");
            return false;
        }

    }

    public boolean verifyPastDateIsDisabledStartDate(By dateField) throws InterruptedException {
        // Locate and click on the date picker element
        waitVisibility(dateField);
        WebElement datePicker = driver.findElement(dateField);
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


    public boolean verifyPastDateIsDisabledForExpireDates(By dateField) throws InterruptedException {
        // Locate and click on the date picker element
        waitVisibility(dateField);
        WebElement datePicker = driver.findElement(dateField);
        datePicker.click();
        LocalDate currentDate = LocalDate.now();
        LocalDate pastDate = currentDate.minusDays(1);
        // Define the desired date format
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Format the future date as per the desired format
        String formattedPastDate = pastDate.format(dateFormatter);
        // Locate and interact with the specific date element representing the future date
        String cls = driver.findElement(By.xpath("(//td[@title='"+formattedPastDate+"'])[2]")).getAttribute("class");
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

    public void clickOnCreateNewCompanyButton() throws InterruptedException {
        waitForFewMoment(2000);
        waitVisibility(editButton);
        click(createNewPromoCodeButton);
    }

    public void changePromoRulesTypeToFlatBase() throws InterruptedException {
        waitForFewMoment(1000);
        click(percentageType);
        click(flatBaseInOption);
    }




    public String generatePromoCodes() throws InterruptedException {
        Random numGenerator = new Random();
        String[] feeName = {"CAR","EV","TESCO","Fast","Discount","Sale"};
        int index = numGenerator.nextInt(feeName.length);
        int randomNumber = numGenerator.nextInt(50);
        String promoName=feeName[index]+" "+randomNumber;
        System.out.println(promoName);
        return promoName;
    }
    public String generatePromoRule() throws InterruptedException {
        Random numGenerator = new Random();
        int randomNumber = numGenerator.nextInt(40)+1;
        String promoRules=String.valueOf(randomNumber);
        return promoRules;
    }


    public String generateReuseLimit() throws InterruptedException {
        Random numGenerator = new Random();
        int randomNumber = numGenerator.nextInt(20)+1;
        String limit=String.valueOf(randomNumber);
        System.out.println("Randomly generated limit : "+limit);
        return limit;
    }



    public void selectMonthAndDate(By dateField, By monthElement, String month, String date) throws InterruptedException {
        waitForFewMoment(3000);
        waitVisibility(dateField);
        // Locate and click on the date picker element
        WebElement datePicker = driver.findElement(dateField);
        datePicker.click();
        click(monthElement);
        waitForFewMoment(3500);
        WebElement monthPick = driver.findElement(By.xpath("//div[@class='ant-picker-cell-inner'][contains(text(),'"+month+"')]"));
        monthPick.click();
        // Locate and interact with the specific date element representing the future date
        WebElement futureDateElement = driver.findElement(By.xpath("//td[@title='"+date+"']"));
        waitForFewMoment(4000);
        futureDateElement.click();

    }


    public void selectMonthYearAndDate(By dateField,By yearPicker,By monthPicker,String year, String month, String date) throws InterruptedException {
        waitForFewMoment(3000);
        waitVisibility(dateField);
        // Locate and click on the date picker element
        WebElement datePicker = driver.findElement(dateField);
        datePicker.click();
        click(yearPicker);
        waitForFewMoment(2000);
        WebElement yearPick = driver.findElement(By.xpath("//div[@class='ant-picker-cell-inner'][contains(text(),'"+year+"')]"));
        yearPick.click();
        click(monthPicker);
        waitForFewMoment(2000);
        WebElement monthPick = driver.findElement(By.xpath("//div[@class='ant-picker-cell-inner'][contains(text(),'"+month+"')]"));
        monthPick.click();
        // Locate and interact with the specific date element representing the future date
        WebElement futureDateElement = driver.findElement(By.xpath("//td[@title='"+date+"']"));
        waitForFewMoment(4000);
        futureDateElement.click();

    }


    public void selectMonthAndDateForExpiryDate(By dateField, By monthElement, String month, String date) throws InterruptedException {
        Thread.sleep(4000);
        waitVisibility(dateField);
        // Locate and click on the date picker element
        WebElement datePicker = driver.findElement(dateField);
        datePicker.click();
        click(monthElement);
        waitVisibility(By.xpath("//td[@title='"+month+"']"));
        WebElement monthPick = driver.findElement(By.xpath("//td[@title='"+month+"']"));
        monthPick.click();
        waitForFewMoment(2000);
        // Locate and interact with the specific date element representing the future date
        WebElement futureDateElement = driver.findElement(By.xpath("//td[@title='"+date+"']"));
        waitForFewMoment(4000);
        futureDateElement.click();

    }


    public void selectDate(By dateField,int days) throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(dateField);
        // Locate and click on the date picker element
        WebElement datePicker = driver.findElement(dateField);
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
        waitForFewMoment(4000);
        futureDateElement.click();

    }

    public void selectDateForExpiryDate(int days) throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(promoExpiryDateField);
        // Locate and click on the date picker element
        WebElement datePicker = driver.findElement(promoExpiryDateField);
        datePicker.click();
        // Calculate the future date you want to select (e.g., 7 days from today)
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(days);
        // Define the desired date format
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Format the future date as per the desired format
        String formattedFutureDate = futureDate.format(dateFormatter);
        // Locate and interact with the specific date element representing the future date
        WebElement futureDateElement = driver.findElement(By.xpath("(//td[@title='"+formattedFutureDate+"'])[2]"));
        waitForFewMoment(4000);
        futureDateElement.click();

    }

    public String generateDate(int days) throws InterruptedException {
        // Calculate the future date you want to select (e.g., 7 days from today)
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(days);
        // Define the desired date format
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        // Format the future date as per the desired format
        String formattedFutureDate = futureDate.format(dateFormatter);
        System.out.println(formattedFutureDate);
        return formattedFutureDate;
    }


    public void selectProperty(String property) throws InterruptedException {
        waitVisibility(drawerTitle);
        waitForFewMoment(2000);
        driver.findElement(By.xpath("//span[@class='ant-transfer-list-content-item-text'][contains(text(),'"+property+"')]")).click();
        click(assignedPropertyArrow);

    }
    public void removeAProperty(String property) throws InterruptedException {
        waitVisibility(CreatePromoCode.assignedPropertiesCount);
        waitForFewMoment(2000);
        driver.findElement(By.xpath("//span[@class='ant-transfer-list-content-item-text'][contains(text(),'"+property+"')]")).click();
        click(unassignedPropertyArrow);

    }



    public void createAPromoCodeWithoutOptionalField(String pCode,String pRules,int startDay,int exDay,String property,By submitButton) throws InterruptedException {
        waitVisibility(drawerTitle);
        writeText(promoCodeField,pCode);
        writeText(promoRulesField,pRules);
        selectDate(CreatePromoCode.promoStartDateField,startDay);
        selectDateForExpiryDate(exDay);
        selectProperty(property);
        clickButton(submitButton,2000);

    }

    public void createAFlatBasePromoCode(String pCode,String pRules,int startDay,int exDay,String property,By submitButton) throws InterruptedException {
        waitVisibility(drawerTitle);
        writeText(promoCodeField,pCode);
        changePromoRulesTypeToFlatBase();
        writeText(promoRulesField,pRules);
        selectDate(CreatePromoCode.promoStartDateField,startDay);
        selectDateForExpiryDate(exDay);
        selectProperty(property);
        clickButton(submitButton,2000);

    }


    public void createAPromoCodeWithOptionalField(String pCode,String pRules,int startDay,int exDay,String limit,String property,By submitButton) throws InterruptedException {
        waitVisibility(drawerTitle);
        writeText(promoCodeField,pCode);
        writeText(promoRulesField,pRules);
        selectDate(CreatePromoCode.promoStartDateField,startDay);
        selectDateForExpiryDate(exDay);
        writeText(CreatePromoCode.reuseLimitPerPersonField,limit);
        selectProperty(property);
        clickButton(submitButton,2000);

    }




    public void createAPromoCode(String pCode,String pRules,String monthStartDay,String startDate,String monthEndDate,String endDate,String property,By submitButton) throws InterruptedException {
        waitVisibility(drawerTitle);
        writeText(promoCodeField,pCode);
        writeText(promoRulesField,pRules);
        selectMonthAndDate(CreatePromoCode.promoStartDateField,monthInDatePicker,monthStartDay,startDate);
        selectMonthAndDate(CreatePromoCode.promoExpiryDateField,monthInDatePickerForExpiryDate,monthEndDate,endDate);
        selectProperty(property);
        clickButton(submitButton,2000);

    }

    public void createAPromoCodeSelectingYearMonth(String pCode,String pRules,String yearStartDay,String monthStartDay,String startDate,String yearEndDay,String monthEndDay,String endaDate,String property,By submitButton) throws InterruptedException {
        waitVisibility(drawerTitle);
        writeText(promoCodeField,pCode);
        writeText(promoRulesField,pRules);
        selectMonthYearAndDate(promoStartDateField,yearInDatePicker,monthInDatePicker,yearStartDay,monthStartDay,startDate);
        selectMonthYearAndDate(promoExpiryDateField,yearInDatePickerForExpiryDate,monthInDatePickerForExpiryDate,yearEndDay,monthEndDay,endaDate);
        selectProperty(property);
        clickButton(submitButton,2000);

    }


    public String randomDateGenerator(String mon,int year, int monthNumber ) {
        // Define the year and month
        int inputYear = year;
        String month = mon;
        // Generate a random day between 1 and 20
        int randomDay = ThreadLocalRandom.current().nextInt(1, 21);
        // Create LocalDate object
        LocalDate date = LocalDate.of(year,monthNumber,randomDay);
        // Format the date to desired format
        String formattedDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // Print the generated random date
        System.out.println("Randomly generated date: " + formattedDate);
        return formattedDate;
        }
        // Method to get the month number from month abbreviation
        /*private int getMonthNumber(String month) {
            return switch (month.toLowerCase()) {
                case "jan" -> 1;
                case "feb" -> 2;
                case "mar" -> 3;
                case "apr" -> 4;
                case "may" -> 5;
                case "jun" -> 6;
                case "jul" -> 7;
                case "aug" -> 8;
                case "sep" -> 9;
                case "oct" -> 10;
                case "nov" -> 11;
                case "dec" -> 12;
                default -> throw new IllegalArgumentException("Invalid month: " + month);
            };
        }*/




    public boolean verifyInvalidInputForPromoRulesField() throws InterruptedException {
        String[] inputValues = {"asdasd","AXXDDASASA","0", "-1","-0.01","!","-33","+","-1000"};
        boolean allValidationsPass = true;
        waitForFewMoment(1000);
        for (int i = 0; i < inputValues.length; i++) {
            try {
                fieldClear(promoRulesField);
                writeText(promoRulesField,inputValues[i]);
                clickButton(savePromoCodeButton,1000);
                waitForFewMoment(1000);
                String validationMsg = readText(validationMsgForField1);
                if (!validationMsg.equals(validationMsgForInvalidValuesInPromoRules())) {
                    System.out.println("Validation message not displayed for input value : " + inputValues[i]);
                    allValidationsPass = false;
                }
            } catch (Exception e) {
                // Print exception message along with the index of the array
                System.out.println("Exception for input value " + inputValues[i] + ": " + e.getMessage());
                allValidationsPass = false;
            }
        }

        if (allValidationsPass) {
            System.out.println("Validation message is showing for all invalid input");
        } else {
            System.out.println("Validation message is not showing for some invalid input values");
        }
        return allValidationsPass;
    }

    public boolean verifyInvalidInputForReuseLimitField() throws InterruptedException {
        String[] inputValues = {"asdasd","AXXDDASASA","0", "-1","-0.01","-999999","-33","-1000","1.024","0.01","99.366","+","!","%"};
        boolean allValidationsPass = true;
        waitForFewMoment(1000);
        for (int i = 0; i < inputValues.length; i++) {
            try {
                fieldClear(reuseLimitPerPersonField);
                writeText(reuseLimitPerPersonField,inputValues[i]);
                clickButton(savePromoCodeButton,1000);
                waitForFewMoment(1000);
                String validationMsg = readText(validationMsgForField1);
                if (!validationMsg.equals(validationMsgForInvalidLimitInReuseLimitField())) {
                    System.out.println("Validation message not displayed for input value : " + inputValues[i]);
                    allValidationsPass = false;
                }
            } catch (Exception e) {
                // Print exception message along with the index of the array
                System.out.println("Exception for input value " + inputValues[i] + ": " + e.getMessage());
                allValidationsPass = false;
            }
        }

        if (allValidationsPass) {
            System.out.println("Validation message is showing for all invalid input");
        } else {
            System.out.println("Validation message is not showing for some invalid input values");
        }
        return allValidationsPass;
    }






}
