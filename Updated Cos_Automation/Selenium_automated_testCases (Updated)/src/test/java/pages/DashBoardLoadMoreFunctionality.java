package pages;

import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import java.util.Properties;
import java.util.concurrent.TransferQueue;

public class DashBoardLoadMoreFunctionality extends BasePage {
    public DashBoardLoadMoreFunctionality(WebDriver driver)
    {
        super(driver);
    }

    Properties prop = ConfigUtill.getConfig();

    public static By Nodata = By.xpath("//div[contains(text(),'No Data Found')]");

    public boolean verifyloadMoreButtonNumber() throws InterruptedException {
        Thread.sleep(1000);
        waitforPresence(ChargerListPropertyAdmin.LoadMoreButton);
        String LoadButtonNumberInText = driver.findElement(ChargerListPropertyAdmin.LoadMoreButton).getText().replaceAll("[^0-9]","");
        System.out.println(LoadButtonNumberInText);
        int LoadButtonNumber = Integer.parseInt(LoadButtonNumberInText);
        System.out.println(LoadButtonNumber);
        int RowCount = driver.findElements(ChargerListPropertyAdmin.Rows).size();
        if (LoadButtonNumber==RowCount) {
            System.out.println("Correct");
            return true;
        } else {
            System.out.println("Something Went Wrong!!");
            return false;
        }

    }
    public boolean verifyLoadMoreButtonActionWithShowingCount() throws InterruptedException{
        waitforPresence(ChargerListPropertyAdmin.LoadMoreButton);
        waitforPresence(ChargerListPropertyAdmin.LeftShowingCharger);
        String ShowingCharger = driver.findElement(ChargerListPropertyAdmin.LeftShowingCharger).getText().replaceAll("[^0-9]","");
        int ShowingChargerCountBefore = Integer.parseInt(ShowingCharger);
        System.out.println(ShowingChargerCountBefore);
        click(ChargerListPropertyAdmin.LoadMoreButton);
        Thread.sleep(4000);
        String ShowingChargerAfterClick = driver.findElement(ChargerListPropertyAdmin.LeftShowingCharger).getText().replaceAll("[^0-9]","");
        int ShowingChargerCountAfterClick = Integer.parseInt(ShowingChargerAfterClick);
        System.out.println(ShowingChargerCountAfterClick);
        if (ShowingChargerCountAfterClick>ShowingChargerCountBefore){
            System.out.println("Showing Charger count is increasing After click on Load more button");
            return true;
        }
        else{
            System.out.println("Wrongggg!!!");
            return false;
        }

    }


    public boolean verifyLoadMoreButtonActionWithAboveShowingCount() throws InterruptedException{
        waitforPresence(ChargerListPropertyAdmin.LoadMoreButton);
        waitforPresence(ChargerListPropertyAdmin.ChargerCountTop);
        String ShowingCharger = driver.findElement(ChargerListPropertyAdmin.ChargerCountTop).getText().replaceAll("[^0-9]","");
        int ShowingChargerCountBefore = Integer.parseInt(ShowingCharger);
        System.out.println(ShowingChargerCountBefore);
        click(ChargerListPropertyAdmin.LoadMoreButton);
        Thread.sleep(4000);
        String ShowingChargerAfterClick = driver.findElement(ChargerListPropertyAdmin.ChargerCountTop).getText().replaceAll("[^0-9]","");
        int ShowingChargerCountAfterClick = Integer.parseInt(ShowingChargerAfterClick);
        System.out.println(ShowingChargerCountAfterClick);
        if (ShowingChargerCountAfterClick>ShowingChargerCountBefore){
            System.out.println("Showing above count is increasing After click on Load more button");
            return true;
        }
        else{
            System.out.println("Wrongggg!!!");
            return false;
        }

    }
    public boolean verifyTotalCountIsShowing() throws InterruptedException{
        waitforPresence(ChargerListPropertyAdmin.LoadMoreButton);
        waitforPresence(ChargerListPropertyAdmin.TotalNum);
        if (driver.findElement(ChargerListPropertyAdmin.TotalNum).isDisplayed()){
            System.out.println("Total Number is showing");
            return true;
        }
        else {
            System.out.println("Total Number is not showing");
            return false;
        }

    }
    public boolean verifyShowingCountisDecreasingAfterRefreshing() throws InterruptedException{
        waitforPresence(ChargerListPropertyAdmin.LoadMoreButton);
        click(ChargerListPropertyAdmin.LoadMoreButton);
        Thread.sleep(2000);
        String ShowingCharger = driver.findElement(ChargerListPropertyAdmin.LeftShowingCharger).getText().replaceAll("[^0-9]","");
        int ShowingChargerCountBefore = Integer.parseInt(ShowingCharger);
        System.out.println(ShowingChargerCountBefore);
        driver.navigate().refresh();
        waitforPresence(ChargerListPropertyAdmin.LoadMoreButton);
        String ChargerCountAfterRefresh = driver.findElement(ChargerListPropertyAdmin.LeftShowingCharger).getText().replaceAll("[^0-9]","");
        int ShowingChargerCountNumberAfterRefresh = Integer.parseInt(ChargerCountAfterRefresh);
        System.out.println(ShowingChargerCountNumberAfterRefresh);
        if (ShowingChargerCountBefore>ShowingChargerCountNumberAfterRefresh){
            System.out.println("Count is decreasing after refresh");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }

    public boolean verifyLoadmoreButtonNotExist() throws InterruptedException {
        Thread.sleep(3000);
        try {
            if (!driver.findElement(ChargerListPropertyAdmin.LoadMoreButton).isDisplayed()) {
                System.out.println("Load More Button is not Displayed. Yahooooo");
                return true;
            } else {
                System.out.println("Something Went Wrong!!");
                return false;
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Load More Button is not Displayed");
            return true;

        }


    }
    public boolean verifyNoDataFoundIsShowing() throws InterruptedException {
        Thread.sleep(4000);
        if (driver.findElement(Nodata).isDisplayed()){
            System.out.println("No Data Found is showing");
            return true;
        }
        else {
            System.out.println("Something Wrong");
            return false;
        }
    }


}
