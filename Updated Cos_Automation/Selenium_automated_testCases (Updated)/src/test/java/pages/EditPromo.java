package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EditPromo extends BasePage{
    public EditPromo(WebDriver driver){
        super(driver);
    }



    public static By drawerTitle = By.xpath("(//span[@class='drawerTitle'])[2]");
    public static By crossButton = By.xpath("(//button[@class='ant-drawer-close'])[2]");
    public static By cancelButton = By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]");
    public static By validationPopUp = By.xpath("//div[@class='ant-message-custom-content ant-message-error']");

    public String expiredPromoCodeValidationPopUp(){
        return "Promo code is expired";
    }

    public String activeUsedValidationPopUp(){
        return "Editing not allowed for active used promo";
    }



    public String formatDateAccordingToInputField(String inputDate) {
        // Define the input and output formats
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        // Parse the input date string
        LocalDate date = LocalDate.parse(inputDate, inputFormatter);
        // Format the date in the desired output format
        System.out.println(date.format(outputFormatter));
        return date.format(outputFormatter);
    }




}
