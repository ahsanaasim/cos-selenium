package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.US1AdminLogin.TestParameters;

public class EditFeeStructure extends BasePage{
    public EditFeeStructure(WebDriver driver)
    {
        super(driver);
    }


    public static By AuditLog = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Audit Log')]");
    public static By FeeModifier = By.xpath("(//span[@class='drawerInsideTitle'])[3]");


    public boolean verifyFeeModifierHeading(){
        waitforPresence(FeeModifier);
        String ModifierHeading = readText(FeeModifier);
        if (ModifierHeading.matches("Fee Modifier \\(Total: \\d+\\.\\d{2}%\\)")) {
            System.out.println("Fee Modifier heading is showing");
            return true;
        } else {
            System.out.println("Fee Modifier heading is not showing");
            return false;
        }
    }


    public boolean verifyMandatoryFieldIsPopulated(int delay, By element) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        String S = driver.findElement(element).getAttribute("value");
        System.out.println(S);
        if (!S.isEmpty()) {
            System.out.println("Field is not empty");
            return true;
        } else {
            System.out.println("Field is empty");
            return false;
        }
    }





}
