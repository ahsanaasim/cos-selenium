package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateFeeStructure extends BasePage{
    public CreateFeeStructure(WebDriver driver)
    {
        super(driver);
    }

    public static By CreateFeeStructure = By.xpath("//span[normalize-space()='Create A Fee Structure']");
    public static By FeeStructureFromMenu = By.xpath("//a[@href='/fee-structure']");
    public static By DrawerTitle = By.xpath("//span[@class='drawerTitle'][contains(text(),'Create A Fee Structure')]");
    public static By BasicInformation = By.xpath("//span[@class='drawerTitle'][contains(text(),'Create A Fee Structure')]");
    public static By FessInformation = By.xpath("//span[@class='drawerTitle'][contains(text(),'Create A Fee Structure')]");
    public static By FeeModifier = By.xpath("//span[normalize-space()='Fee Modifier (Total: 0.00%)']");




    public void GoToFeeStructurePage() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://test-company.chargeonsite.com/fee-structure");
    }






}
