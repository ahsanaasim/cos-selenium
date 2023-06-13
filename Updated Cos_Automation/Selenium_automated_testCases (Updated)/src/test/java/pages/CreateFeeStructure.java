package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateFeeStructure extends BasePage{
    public CreateFeeStructure(WebDriver driver)
    {
        super(driver);
    }

    public static By CreateFeeStructure = By.xpath("//span[normalize-space()='Create A Fee Structure']");
    public static By FeeStructureFromMenu = By.xpath("//a[@href='/fee-structure']");
    public static By DrawerTitle = By.xpath("//span[@class='drawerTitle'][contains(text(),'Create A Fee Structure')]");
    public static By BasicInformation = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Basic Information')]");
    public static By FessInformation = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Fees Information')]");
    public static By FeeModifier = By.xpath("//span[normalize-space()='Fee Modifier (Total: 0.00%)']");
    public static By FeeStructureNameInputTitle = By.xpath("//div[@class='drawerInputTitle']");
    public static By FeeStructureNameField = By.id("basic_feeStructureName");
    public static By NotifiedMsgUnderFeeStructureNameField = By.xpath("//span[@class='ant-typography ant-typography-secondary mt-10']");
    public static By SessionFeeHeading = By.xpath("//span[@class='ant-typography']");
    public static By TextUnderSessionFeeHeading = By.xpath("//span[@class='ant-typography ant-typography-secondary']");
    public static By SessionFeeFieldTitle = By.xpath("(//div[@class='drawerInputTitle'])[2]");
    public static By SessionFeeNameField = By.xpath("//input[@placeholder='Name']");
    public static By SessionFeeChargeText = By.xpath("//div[@class='drawerInputTitle top-5'][contains(text(),'Charge')]");
    public static By SessionFeeAmountField = By.xpath("//input[@name='rate']");
    public static By PerSessionText = By.xpath("//div[@class='top-5'][contains(text(),'Per Session')]");
    public static By AddMoreSessionFeeButton = By.xpath("//button[@class='ant-btn ant-btn-default green-text no-border']");
    public static By AddMoreSessionFeeText = By.xpath("//span[normalize-space()='+ add more session fee']");
    public static By UtilizationFeeHeadingForkWh = By.xpath("(//span[@class='ant-typography'])[2]");
    public static By UtilizationFeeHeadingForPerMin = By.xpath("(//span[@class='ant-typography'])[2]");
    public static By UtilizationFeeFieldTitle = By.xpath("(//div[@class='drawerInputTitle'])[3]");
    public static By TextUnderUtilizationFeeHeading = By.xpath("(//span[@class='ant-typography ant-typography-secondary'])[2]");
    public static By UtilizationFeeNameField = By.xpath("(//input[@placeholder='Name'])[2]");
    public static By UtilizationFeeAmountField = By.xpath("(//input[@name='rate'])[2]");
    public static By UtilizationFeeChargeText = By.xpath("(//div[@class='drawerInputTitle top-5'][contains(text(),'Charge')])[2]");
    public static By UtilizationFeeUnit = By.xpath("(//div[@class='top-5'])[2]");
    public static By KWhBasedFee = By.xpath("//span[@title='kWh Based Fee']");
    public static By KWhBasedFeeFromOption = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'kWh Based Fee')]");
    public static By MinBasedFee = By.xpath("//span[@title='Min Based Fee']");
    public static By MinBasedFeeFromOption = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Min Based Fee')]");
    public static By AddMoreUtilizationFeeButton = By.xpath("(//button[@class='ant-btn ant-btn-default green-text no-border'])[2]");
    public static By FeeModifierNameField = By.xpath("(//input[@placeholder='Name'])[3]");
    public static By AddMoreFeeModifierButton = By.xpath("(//button[@class='ant-btn ant-btn-default green-text no-border'])[3]");
    public static By IdleFeeHeading = By.xpath("(//span[@class='ant-typography'])[3]");
    public static By TextUnderIdleFeeHeading = By.xpath("(//span[@class='ant-typography ant-typography-secondary'])[3]");
    public static By IdleFeeGracePeriod = By.xpath("//div[@class='idle-fee-align']");
    public static By GracePeriodField = By.id("basic_graceFee");
    public static By IdleFeeGracePeriodUnit = By.xpath("//div[@class='idle-fee-align'][contains(text(),'Minutes')]");
    public static By FeeAfterThat = By.xpath("(//div[@class='idle-fee-align'])[3]");
    public static By IdleFeeRateField = By.id("basic_idleFeeRate");
    public static By IdleFeeRateUnit = By.xpath("//div[@class='idle-fee-align bold']");
    public static By FeeModifierEffectRates = By.xpath("(//span[@class='ant-typography ant-typography-secondary'])[6]");
    public static By FeeModifierNameFieldTitle = By.xpath("//div[@class='drawerInputTitle'][contains(text(),'Modifier Name')]");
    public static By FeeModifierRateFieldTitle = By.xpath("//div[@class='drawerInputTitle'][contains(text(),'Fee Modifier')]");
    public static By FeeModifierRateField = By.xpath("(//input[@name='rate'])[4]");
    public static By FeeStructureNameRequired = By.xpath("//div[@role='alert']");
    public static By SessionNameRequired = By.xpath("(//div[@role='alert'])[2]");
    public static By SessionFeeRateRequired = By.xpath("(//div[@role='alert'])[3]");
    public static By UtilizationFeeNameRequired = By.xpath("(//div[@role='alert'])[4]");
    public static By UtilizationFeeRateRequired = By.xpath("(//div[@role='alert'])[5]");
    public static By GracePeriodRequired = By.xpath("(//div[@role='alert'])[6]");
    public static By GracePeriodFeeRequired = By.xpath("(//div[@role='alert'])[7]");
    public static By Alert = By.xpath("//div[@role='alert']");
    public static By Alert2 = By.xpath("(//div[@role='alert'])[2]");
    public static By Alert3 = By.xpath("(//div[@role='alert'])[3]");
    public static By Alert4 = By.xpath("(//div[@role='alert'])[4]");
    public static By Alert5 = By.xpath("(//div[@role='alert'])[5]");
    public static By Alert6 = By.xpath("(//div[@role='alert'])[6]");
    public static By Alert7 = By.xpath("(//div[@role='alert'])[7]");
    public static By SaveFeeStructureButton = By.xpath("//button[@class='ant-btn ant-btn-primary ml-15 h-40 drawerFBtn']");
    public static By CancelButton = By.xpath("//span[contains(text(),'Cancel')]");
    public static By SaveFeeStructureText = By.xpath("//span[normalize-space()='Save Fee Structure']");





    public void GoToFeeStructurePage() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://test-company.chargeonsite.com/fee-structure");
    }


    public String notifiedMsgUnderFeeStructureNameField(){
        return "Your customers/members won't see this fee name.";
    }


    public String CustomerWillSeeAmountInReceipt(){
        return "Your customers will see the total amount in their receipt.";
    }

    public String FeeModifierAffectTheRates(){
        return "Fee modifier will effect all the rates";
    }


    public boolean verifySessionFeeIsUpdating() throws InterruptedException {
        waitforPresence(SessionFeeHeading);
        String SessionFee = "12.30";
        writeText(SessionFeeAmountField,SessionFee);
        String expected = SessionFeeExtractor();
        if (SessionFee.equals(expected)) {
            System.out.println("Session fee is updating");
            return true;
        }
        else {
            System.out.println("Session fee is not updating");
            return false;
        }
    }



    public String SessionFeeExtractor() throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(SessionFeeHeading);
        String inputString = driver.findElement(SessionFeeHeading).getText();
        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("\\$(\\d+\\.\\d+)");
        // Match the pattern against the input string
        Matcher matcher = pattern.matcher(inputString);
        // Extract the value
        String value = "";
        if (matcher.find()) {
            value = matcher.group(1);
        }
        System.out.println("Value: " + value);
        return value;
    }


    public boolean verifyUtilizationFeeIsUpdating() throws InterruptedException {
        waitforPresence(UtilizationFeeHeadingForkWh);
        String UtilizationFee = "12.30";
        double SFee = Double.parseDouble(UtilizationFee);
        writeText(UtilizationFeeAmountField,UtilizationFee);
        String expected = UtilizationFeeExtractor();
        if (UtilizationFee.equals(expected)) {
            System.out.println("Utilization fee is updating");
            return true;
        }
        else {
            System.out.println("Utilization fee is not updating");
            return false;
        }
    }



    public String UtilizationFeeExtractor() throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(UtilizationFeeHeadingForkWh);
        String inputString = driver.findElement(UtilizationFeeHeadingForkWh).getText();
        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("\\$(\\d+\\.\\d+)");
        // Match the pattern against the input string
        Matcher matcher = pattern.matcher(inputString);
        // Extract the value
        String value = "";
        if (matcher.find()) {
            value = matcher.group(1);
        }
        System.out.println("Value: " + value);
        return value;
    }


    public boolean verifyIdleFeeIsUpdating() throws InterruptedException {
        waitforPresence(IdleFeeHeading);
        String IFee = "12";
        double IFee2 = Double.parseDouble(IFee);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double IFee3 = Double.valueOf(decimalFormat.format(IFee2));
        System.out.println("decimal format of input:"+IFee3);
        writeText(IdleFeeRateField,IFee);
        String IdleFee = IdleFeeExtractor();
        double expected = Double.parseDouble(IdleFee);
        System.out.println("value in system: "+expected);
        if (IFee3==expected) {
            System.out.println("Idle fee is updating");
            return true;
        }
        else {
            System.out.println("Idle fee is not updating");
            return false;
        }
    }



    public String IdleFeeExtractor() throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(IdleFeeHeading);
        String inputString = driver.findElement(IdleFeeHeading).getText();
        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("\\$(\\d+\\.\\d+)");
        // Match the pattern against the input string
        Matcher matcher = pattern.matcher(inputString);
        // Extract the value
        String value = "";
        if (matcher.find()) {
            value = matcher.group(1);
        }
        System.out.println("Value: " + value);
        return value;
    }


    public boolean verifyFeeModifierIsUpdating() throws InterruptedException {
        waitforPresence(FeeModifier);
        String Mod = "7.50";
        writeText(FeeModifierRateField,Mod);
        String expected = FeeModifierExtractor();
        if (Mod.equals(expected)) {
            System.out.println("Fee modifier is updating");
            return true;
        }
        else {
            System.out.println("Fee modifier is not updating");
            return false;
        }
    }



    public String FeeModifierExtractor() throws InterruptedException {
        Thread.sleep(2000);
        String inputString = driver.findElement(By.xpath("(//span[@class='drawerInsideTitle'])[3]")).getText();
        // Define the regular expression pattern
        Pattern pattern = Pattern.compile("(\\d+\\.\\d+)");
        // Match the pattern against the input string
        Matcher matcher = pattern.matcher(inputString);
        // Extract the value
        String value = "";
        if (matcher.find()) {
            value = matcher.group(1);
        }
        System.out.println("Value: " + value);
        return value;
    }


    public boolean verifyFeeIsUpdatingToZeroAfterClearingField(String Fee) throws InterruptedException {
        waitforPresence(SessionFeeHeading);
        String s = Fee;
        String s2 = "0.00";
        if (s.equals(s2)){
            System.out.println("Data is updated after clearing field");
            return true;
        }
        else {
            System.out.println("Data is not updated after clearing field");
            return false;
        }
    }







}
