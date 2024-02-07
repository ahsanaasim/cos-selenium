package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.Random;

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
    public static By banasreePoliceParkProperty = By.xpath("//span[@class='ant-transfer-list-content-item-text'][contains(text(),'Banasree police park')]");
    public static By tempXyzProperty = By.xpath("//span[@class='ant-transfer-list-content-item-text'][contains(text(),'Temporary Property xyz')]");
    public static By successfullyCreatedPopUp = By.xpath("//span[contains(text(),'Promo Code created successfully')]");
    public static By validationPopUpOfAlreadyActivePopUp = By.xpath("//span[contains(text(),'Promo already active for these date ranges')]");
    public static By crossButton = By.xpath("//span[@class='anticon anticon-close']");
    public static By modalTitle = By.xpath("//span[@class='ant-modal-confirm-title']");
    public static By discountButton = By.xpath("//button[@type='button']//span[contains(text(),'Discount')]");
    public static By continueButton = By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]");
    public static By unassignedPropertiesCount = By.xpath("//span[@class='ant-transfer-list-header-title']");
    public static By assignedPropertiesCount = By.xpath("(//span[@class='ant-transfer-list-header-title'])[2]");

    public String areYouSureText(){
        return "Are you sure?";
    }

    public String discardAndContinueText(){
        return "Do you want to discard or continue?";
    }





    public void changePromoRulesTypeToFlatBase() throws InterruptedException {
        waitForFewMoment(1000);
        click(percentageType);
        click(flatBaseInOption);
    }



    public String promoCodes() throws InterruptedException {
        Random random = new Random();
        Thread.sleep(1000);
        String[] feeName = {"CAR","EV","TESCO","Fast","Discount","Sale"};
        int index = random.nextInt(feeName.length);
        return feeName[index];

    }

    public String generatePromoCodes() throws InterruptedException {
        Random numGenerator = new Random();
        int randomNumber = numGenerator.nextInt(50);
        String promoName=promoCodes()+" "+randomNumber;
        return promoName;
    }



    public void selectDate(By dateField,int days) throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(promoStartDateField);
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
        Thread.sleep(2500);
        futureDateElement.click();

    }


    public void selectProperty(String property){
        waitVisibility(drawerTitle);
        driver.findElement(By.xpath("//span[@class='ant-transfer-list-content-item-text'][contains(text(),'"+property+"')]")).click();
        click(assignedPropertyArrow);

    }



    public void createAPromoCodeWithoutOptionalField(String pCode,String pRules,int startDay,int exDay,String property) throws InterruptedException {
        waitVisibility(drawerTitle);
        writeText(promoCodeField,pCode);
        writeText(promoRulesField,pRules);
        selectDate(CreatePromoCode.promoStartDateField,startDay);
        selectDate(CreatePromoCode.promoExpiryDateField,exDay);
        selectProperty(property);

    }


    public void createAPromoCodeWithOptionalField(String pCode,String pRules,int startDay,int exDay,String limit,String property) throws InterruptedException {
        waitVisibility(drawerTitle);
        writeText(promoCodeField,pCode);
        writeText(promoRulesField,pRules);
        selectDate(CreatePromoCode.promoStartDateField,startDay);
        selectDate(CreatePromoCode.promoExpiryDateField,exDay);
        writeText(CreatePromoCode.reuseLimitPerPersonField,limit);
        selectProperty(property);

    }






}
