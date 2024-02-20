package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        Duration time = Duration.ofSeconds(20);
        this.wait = new WebDriverWait(driver, time);
    }

    //Wait Wrapper Method
    public boolean waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        //wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        return true;
    }

    public boolean waitToAvoidStaleness(WebElement element) {
        wait.until(ExpectedConditions.stalenessOf(element));
        //wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        return true;
    }

    public void waitelemtclickable(By elementBy) {
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        //wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public void waitforInVisibility(By elementBy) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elementBy));
        //wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public void waitforPresence(By elementBy) {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
        //wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public void waitelementtobedisplayed(By elementBy) {
        if (driver.findElement((elementBy)).isDisplayed()) {
            System.out.println("Element has displayed");
        } else {
            System.out.println("Something wnet wrong.Element has not dislyed");
        }

    }

    public boolean verifyAnElementDisplayedOrNot(int delay, By element) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        if (driver.findElement(element).isDisplayed()) {
            System.out.println("Expected element is displayed");
            return true;
        } else {
            System.out.println("Expected element is not displayed");
            return false;

        }
    }

    public boolean verifyElementNotDisplayed(int delay, By element) throws InterruptedException {
        Thread.sleep(delay);
        try {
            if (!driver.findElement(element).isDisplayed()) {
                System.out.println("Perfect");
                return true;
            } else {
                System.out.println("Fail");
                return false;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Not Found");
            return true;
        }
    }

    public boolean verifyTextMatching(int delay, By element, String expected) throws InterruptedException {
        Thread.sleep(delay);
        waitVisibility(element);
        String S = driver.findElement(element).getText();
        System.out.println(S);
        String ExpectedText = expected;
        if (S.equals(ExpectedText)) {
            System.out.println("Matched with Expected");
            return true;
        } else {
            System.out.println("Not Matched with the expected");
            return false;
        }
    }

    public boolean verifyTextMatchingWithAttribute(int delay, By element, String attribute, String expected) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        String S = driver.findElement(element).getAttribute(attribute);
        System.out.println(S);
        String ExpectedText = expected;
        if (S.equals(ExpectedText)) {
            System.out.println("Matched with Expected");
            return true;
        } else {
            System.out.println("Not Matched with the expected");
            return false;
        }
    }

    public boolean verifyFieldIsNotEmpty(int delay, By element) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        String S = driver.findElement(element).getText();
        System.out.println(S);
        if (!S.isEmpty()) {
            System.out.println("Field is not empty");
            return true;
        } else {
            System.out.println("Field is empty");
            return false;
        }
    }

    public boolean verifyFieldIsEmpty(int delay, By element) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        String S = driver.findElement(element).getText();
        System.out.println(S);
        if (S.isEmpty()) {
            System.out.println("Field is empty");
            return true;
        } else {
            System.out.println("Field is not empty");
            return false;
        }
    }

    public boolean verifyFieldValueIsEmpty(int delay, By element) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        String S = driver.findElement(element).getAttribute("value");
        System.out.println(S);
        if (S.isEmpty()) {
            System.out.println("Field is empty");
            return true;
        } else {
            System.out.println("Field is not empty");
            return false;
        }
    }

    public boolean verifyAFieldIsDisable(int delay, By element) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        Boolean Show = driver.findElement(element).isEnabled();
        System.out.println(Show);
        if (Show) {
            System.out.println("Expected Button is Enabled");
            return false;
        } else {
            System.out.println("Expected Button is disabled");
            return true;
        }
    }


    public boolean verifyAFieldIsEnable(int delay, By element) throws InterruptedException {
        Thread.sleep(delay);
        Boolean Show = driver.findElement(element).isEnabled();
        System.out.println(Show);
        if (Show) {
            System.out.println("Expected Button is Enabled");
            return true;
        } else {
            System.out.println("Expected Button is disabled");
            return false;
        }
    }


    public void newTabOpenAndSwitchToNewTab(int num) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(num));
    }

    public void switchToTab(int num) throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(num));
    }

    public void goToWebsite(String url) throws InterruptedException {
        Thread.sleep(2000);
        driver.get(url);
    }


    public Boolean waitelementtobeEnabled(By elementBy) throws InterruptedException {
        Thread.sleep(3000);
        if (driver.findElement((elementBy)).isEnabled()) {
            System.out.println("Verification Successful!!! Element is Enabled");

        } else {
            System.out.println("Something wnet wrong.Element has not dislyed");
            return false;
        }
        return true;
    }

    public Boolean waitelementtobeDisabled(By elementBy) {
        if (!driver.findElement((elementBy)).isEnabled()) {
            System.out.println("Verification Successful!!! Element is Disabled");

        } else {
            System.out.println("Something wnet wrong.Element has not dislyed");
            return false;
        }
        return true;
    }


    //Click method
    public void click(By elementBy) {
        waitVisibility(elementBy);
        waitelemtclickable(elementBy);
        driver.findElement(elementBy).click();
    }
    //Click method with delay
    public boolean clickButton(By element, int delay)  throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        waitelemtclickable(element);
        waitelementtobeEnabled(element);
        click(element);
        return true;
    }

    //Clear Text
    public void clear(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
    }

    public boolean fieldClear(By element) throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(element);
        driver.findElement(element).sendKeys(Keys.chord(Keys.CONTROL + "a", Keys.DELETE));
        return true;
    }

    //Write Text
    public void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        waitelemtclickable(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }
    //Write Text with delay
    public boolean writeInputText(By element, String text, int delay)  throws InterruptedException {
        Thread.sleep(delay);
        waitVisibility(element);
        waitelemtclickable(element);
        writeText(element, text);
        return true;
    }


    //Read Text
    public String readText(By elementBy) {
        waitVisibility(elementBy);
        waitelemtclickable(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public String readTextFromAttribute(By elementBy,String AttributeName) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getAttribute(AttributeName);
    }

    //Assert
    public void assertEquals(By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
    }

    public void urlCheck(String actualUrl) {
        wait.until(ExpectedConditions.urlToBe(actualUrl));
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    public boolean pageUrlCheck(String ExpectedURL) throws InterruptedException {
        Thread.sleep(2500);
        wait.until(ExpectedConditions.urlToBe(ExpectedURL));
        String url = driver.getCurrentUrl();
        System.out.println("URL showing : "+url);
        String expectedUrl = ExpectedURL;
        if (url.equals(expectedUrl)) {
            System.out.println("Url is matched with the expected");
            return true;
        }
        else {
            System.out.println("Url is not matched with expected");
            return false;
        }
    }



    public boolean checkPageSize(By waitElement, String PageSize) throws InterruptedException {
        Thread.sleep(2500);
        waitelemtclickable(waitElement);
        try {
            if (driver.findElement(ChargerListPropertyAdmin.LoadMoreButton).isDisplayed()) {
                String pageSize = driver.findElement(ChargerListPropertyAdmin.LoadMoreButton).getText().replaceAll("[^0-9]", "");
                System.out.println("Page size: "+pageSize);
                if (pageSize.equals(PageSize)) {
                    System.out.println("Page size is ok");
                    return true;
                } else {
                    System.out.println("Page size is not OK");
                    return false;
                }
            }
            else {
                System.out.println("Load more buton not found");
                return false;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Load more button not found");
            return false;
        }

    }


    public boolean verifySearchFieldData(By waitButton,By SearchField,String ExpectedData){
        waitVisibility(waitButton);
        String DataInSearchBox = readTextFromAttribute(SearchField,"value");
        System.out.println("Data in search box: "+DataInSearchBox);
        String Expected = ExpectedData;
        if (DataInSearchBox.equals(Expected)){
            System.out.println("Search field is holding the expected search data");
            return true;
        }
        else {
            System.out.println("Search field is holding the expected search data");
            return false;
        }
    }

    public boolean verifySearchFieldIsEmpty(By searchField) throws InterruptedException {
        waitForFewMoment(3000);
        String DataInSearchBox = readTextFromAttribute(searchField,"value");
        System.out.println("Data in search box: "+DataInSearchBox);
        if (DataInSearchBox.isEmpty()){
            System.out.println("Search Field is empty");
            return true;
        }
        else {
            System.out.println("Search Field is not empty");
            return false;
        }
    }

    public String urlOfCustomerApp(String url){
        Properties prop = ConfigUtill.getConfig();
        String u = prop.getProperty("BaseURLCustomer")+url;
        return u;
    }

    public String urlOfAdminApp(String url){
        Properties prop = ConfigUtill.getConfig();
        String u = prop.getProperty("BaseURLAdmin")+url;
        return u;
    }

    public String urlOfCompanyAdminApp(String url){
        Properties prop = ConfigUtill.getConfig();
        String u = prop.getProperty("BaseURLCompanyAdmin")+url;
        return u;
    }

    public void waitForFewMoment(int waitingTimeLimit) throws InterruptedException {
        Thread.sleep(waitingTimeLimit);
    }

    public boolean refreshBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().refresh();
        return true;
    }
}