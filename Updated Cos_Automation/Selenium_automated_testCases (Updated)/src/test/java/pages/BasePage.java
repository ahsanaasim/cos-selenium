package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage (WebDriver driver){
        this.driver = driver;
        Duration time = Duration.ofSeconds(20);
        this.wait = new WebDriverWait(driver,time);
    }

    //Wait Wrapper Method
    public boolean waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
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
        if( driver.findElement((elementBy)).isDisplayed()){
            System.out.println("Element has displayed");
        }else{
            System.out.println("Something wnet wrong.Element has not dislyed");
        }

    }

    public boolean verifyAnElementDisplayedOrNot(int delay, By element) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        if(driver.findElement(element).isDisplayed()){
            System.out.println("Expected element is displayed");
            return true;
        }
        else{
            System.out.println("Expected element is not displayed");
            return false;

        }
    }

    public boolean verifyElementNotDisplayed(int delay, By element) throws InterruptedException{
        Thread.sleep(delay);
        try {
            if (!driver.findElement(element).isDisplayed()) {
                System.out.println("Perfect");
                return true;
            } else {
                System.out.println("Fail");
                return false;
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("Not Found");
            return true;
        }
    }

    public boolean verifyTextMatching(int delay, By element, String expected) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
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

    public boolean verifyTextMatchingWithAttribute(int delay, By element,String attribute, String expected) throws InterruptedException {
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

    public boolean verifyAFieldIsDisable(int delay, By element) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        Boolean Show=driver.findElement(element).isEnabled();
        System.out.println(Show);
        if (Show){
            System.out.println("Expected Button is Enabled");
            return false;
        }
        else {
            System.out.println("Expected Button is disabled");
            return true;
        }
    }


    public boolean verifyAFieldIsEnable(int delay, By element) throws InterruptedException {
        Thread.sleep(delay);
        Boolean Show=driver.findElement(element).isEnabled();
        System.out.println(Show);
        if (Show){
            System.out.println("Expected Button is Enabled");
            return true;
        }
        else {
            System.out.println("Expected Button is disabled");
            return false;
        }
    }


    public void NewTabOpenAndSwitchToNewTab(int num) throws InterruptedException{
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(num));
    }
    public void SwitchToTab(int num) throws InterruptedException{
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(num));
    }

    public void GoToWebsite (String url) throws InterruptedException{
        Thread.sleep(2000);
        driver.get(url);
    }



    public Boolean waitelementtobeEnabled(By elementBy) throws InterruptedException {
        Thread.sleep(3000);
        if( driver.findElement((elementBy)).isEnabled()){
            System.out.println("Verification Successful!!! Element is Enabled");

        }else{
            System.out.println("Something wnet wrong.Element has not dislyed");
            return false;
        }
        return true;
    }

    public Boolean waitelementtobeDisabled(By elementBy) {
        if(! driver.findElement((elementBy)).isEnabled()){
            System.out.println("Verification Successful!!! Element is Disabled");

        }else{
            System.out.println("Something wnet wrong.Element has not dislyed");
            return false;
        }
        return true;
    }



    //Click Method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        waitelemtclickable(elementBy);
        driver.findElement(elementBy).click();
    }

   //Clear Text
    public void clear (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
    }
    public boolean FieldClear(By element) throws InterruptedException{
        Thread.sleep(2000);
        waitforPresence(element);
        driver.findElement(element).sendKeys(Keys.chord(Keys.CONTROL+"a", Keys.DELETE));
        return true;
    }

    //Write Text
    public void writeText (By elementBy, String text) {
        waitVisibility(elementBy);
        waitelemtclickable(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }


    //Read Text
    public String readText (By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //Assert
   public void assertEquals (By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
    }

    public void urlCheck(String actualUrl){
        wait.until(ExpectedConditions.urlToBe(actualUrl));
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}