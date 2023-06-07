package pages;

import org.jsoup.Connection;
import org.openqa.selenium.*;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class SimulationPage extends BasePage {

    public SimulationPage(WebDriver driver) {

        super(driver);
    }

    public static By SimulationTab = By.xpath("//div[contains(text(),'Simulation')]");
    public static By Simulator  = By.xpath("//a[@href='/simulation/simulator']");
    public static By EmptySearchFieldBeforeClicking = By.xpath("//input[@class='ant-select-selection-search-input']");
    public static By MakeChargerAvailable = By.xpath("//button[@class='ant-btn ant-btn-default available-button mt-25']");
    public static By ChargerSelectedField = By.xpath("//span[@class='ant-select-selection-item']");
    public static By ChargerTitle = By.xpath("//div[@class='mb-10'][contains(text(),'Charger')]");
    public static By ChargerClear = By.xpath("//span[@class='ant-select-clear']");
    public static By SelectChargerStatusField = By.xpath("(//input[@class='ant-select-selection-search-input'])[2]");
    public static By ChargerStatusSaveButton = By.xpath("//button[@class='ant-btn ant-btn-default save-button']");
    public static By DisconnectCharger = By.xpath("//button[@class='ant-btn ant-btn-default disconnect-button mt-15']");
    public static By PlugInCharger = By.xpath("//button[@class='ant-btn ant-btn-default plug-button mt-15']");
    public static By FullBoxDisable = By.xpath("//div[@class='disabledDiv']");
    public static By BootChargerButton = By.xpath("//button[@class='ant-btn ant-btn-default boot-button mt-15']");
    public static By ChargerQRCodeCopyLink = By.xpath("//div[@class='copy-button ml-10']");


    public boolean SelectChargerFromSimulator(String text) throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(EmptySearchFieldBeforeClicking);
        writeText(EmptySearchFieldBeforeClicking,text);
        WebElement selectitem = driver.findElement(EmptySearchFieldBeforeClicking);
        Thread.sleep(2000);
        selectitem.sendKeys(Keys.ENTER);
        return true;

    }

    public void pasteTheCopiedChargerQRCodeToAnotherPage() throws InterruptedException {
        Thread.sleep(1000);
        // Open a new tab
        String url = getClipboardURL();
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.open(\'"+url+"\')");// launching a new tab window.location = \'"+url+"\'


    }


    public String getClipboardURL() {
        Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

        try {
            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String) transferable.getTransferData(DataFlavor.stringFlavor);
            }
        } catch (UnsupportedFlavorException | IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean SelectChargerStatusFromSimulator(String text) throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(GuestFlow.SearchFieldSimulator);
        writeText(SelectChargerStatusField,text);
        WebElement selectitem = driver.findElement(SelectChargerStatusField);
        Thread.sleep(3500);
        selectitem.sendKeys(Keys.ENTER);
        return true;

    }

    public void clickOnDisconnectTheChargerIfIsEnabled() throws InterruptedException {
        Thread.sleep(1200);
        waitforPresence(DisconnectCharger);
        if (driver.findElement(DisconnectCharger).isEnabled()){
            click(DisconnectCharger);
        }
        else {
            System.out.println("Disconnect button is disabled");
        }

    }
}