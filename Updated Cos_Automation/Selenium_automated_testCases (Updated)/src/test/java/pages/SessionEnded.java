package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionEnded extends BasePage{
    public SessionEnded(WebDriver driver) {

        super(driver);
    }

    public static By feeBreakdown = By.xpath("//span[@class='feeBreakDownText cursor']");
    public static By discountedFeeInFeeBreakdown = By.xpath("(//div[@class='wordBreak feeDetails'])[4]");
}
