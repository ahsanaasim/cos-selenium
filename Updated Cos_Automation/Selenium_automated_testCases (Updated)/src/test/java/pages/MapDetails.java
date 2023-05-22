package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MapDetails extends BasePage{
    public MapDetails(WebDriver driver) {
        super(driver);
    }

    public static By UpperDrawer = By.xpath("//div[@class='ant-drawer-body']");
    public static By LowerDrawer = By.xpath("(//div[@class='ant-drawer-body'])[2]");





    public boolean verifySystemIsRedirectingToMapPage() throws InterruptedException {
        Thread.sleep(3000);
        String currentPage = driver.getCurrentUrl();
        System.out.println("Current page URL is: "+currentPage);
        if (currentPage.contains("https://test-app.chargeonsite.com/customer/map?")){
            System.out.println("System is redirecting to map page");
            return true;
        }
        else{
            System.out.println("System is not redirecting to map page");
            return false;
        }
    }




}
