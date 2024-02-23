package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardAuthorization extends BasePage{
    public CardAuthorization(WebDriver driver){
        super(driver);
    }

    public static  By promoCodeFieldLabel = By.xpath("(//div[@class='promoText'])[2]");
    public static  By promoCodeField = By.xpath("(//input[@placeholder='Enter Promo Code'])[2]");
    public static By applyButton = By.xpath("(//button[@type='button']//span[contains(text(),'Apply')])[2]");
    public static By disabledApplyButton = By.xpath("(//div[@class='disabledDivPromoApply'])[2]");
    public static By validationMsg = By.xpath("//div[@class='red-color mt-5']");




    public String notExistingPromoCodeValidationMsg(){
        return "Invalid promo code. Promo code does not exist";
    }

    public String expiredPromoCodeValidationMsg(){
        return "Invalid promo code. Promo code has expired";
    }

    public String usageLimitPromoCodeValidationMsg(){
        return "Invalid promo code. Usage limit has been exceed";
    }

    public String inactivePromoCodeValidationMsg(){
        return "Invalid promo code. Promo code is inactive";
    }


    public boolean verifyNotExistingPromoCodesAfterApplying() throws InterruptedException {
        String[] inputValues = {"EV 12010101","sdgFRTRT6567","EV", "Test","test000","Sale"};
        boolean allValidationsPass = true;
        waitForFewMoment(1000);
        for (int i = 0; i < inputValues.length; i++) {
            try {
                fieldClear(promoCodeField);
                writeText(promoCodeField,inputValues[i]);
                clickButton(applyButton,1000);
                waitForFewMoment(1000);
                String valMsg = readText(validationMsg);
                if (!valMsg.equals(notExistingPromoCodeValidationMsg())) {
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



    public boolean verifyExpiredPromoCodesAfterApplying() throws InterruptedException {
        String[] inputValues = {"Fast 26","CAR 31","Sale 1", "Fast 15","CAR 19"};
        boolean allValidationsPass = true;
        waitForFewMoment(1000);
        for (int i = 0; i < inputValues.length; i++) {
            try {
                fieldClear(promoCodeField);
                writeText(promoCodeField,inputValues[i]);
                clickButton(applyButton,1000);
                waitForFewMoment(1000);
                String valMsg = readText(validationMsg);
                if (!valMsg.equals(expiredPromoCodeValidationMsg())) {
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


    public boolean verifyInactivePromoCodesAfterApplying() throws InterruptedException {
        String[] inputValues = {"Discount 40","EV 0","Discount 00"};
        boolean allValidationsPass = true;
        waitForFewMoment(1000);
        for (int i = 0; i < inputValues.length; i++) {
            try {
                fieldClear(promoCodeField);
                writeText(promoCodeField,inputValues[i]);
                clickButton(applyButton,1000);
                waitForFewMoment(1000);
                String valMsg = readText(validationMsg);
                if (!valMsg.equals(inactivePromoCodeValidationMsg())) {
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
