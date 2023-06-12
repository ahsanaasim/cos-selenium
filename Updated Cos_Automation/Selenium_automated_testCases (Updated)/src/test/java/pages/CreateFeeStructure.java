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








}
