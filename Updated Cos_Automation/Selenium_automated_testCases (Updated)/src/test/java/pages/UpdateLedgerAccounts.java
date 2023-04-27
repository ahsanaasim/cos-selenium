package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;


public class UpdateLedgerAccounts extends BasePage {
    public UpdateLedgerAccounts(WebDriver driver) {

        super(driver);
    }
    Random rand = new Random();

    public static By SettingsTab = By.xpath("//span[@class='ant-menu-title-content'][contains(.,'Settings')]");
    public static By LedgerConfigurationTab  = By.xpath("//a[@href='/settings/ledger-configuration']");

    public static By LedgerConfigTitle = By.xpath("//div[@class='pageTitle m-auto-0']");
    public static By LedgerAccountsTab = By.xpath("//div[@class='ant-tabs-tab ant-tabs-tab-active'][contains(.,'Ledger Accounts')]");
    public static By BankAccountsTab = By.xpath("//div[@class='ant-tabs-tab'][contains(.,'Bank Accounts')]");
    public static By TaxInformationTab = By.xpath("//div[@class='ant-tabs-tab'][contains(.,'Tax Information')]");
    public static By EquipmentFee = By.xpath("//div[@class='ledgerTitle'][contains(.,'Equipment Fee:')]");
    public static By EquipmentFeeSelectField = By.xpath("//span[@class='ant-select-selection-placeholder']");
    public static By InstallationFee = By.xpath("//div[@class='ledgerTitle'][contains(.,'Installation Fee:')]");
    public static By InstallationFeeSelectField = By.xpath("(//span[@class='ant-select-selection-placeholder'])[2]");
    public static By TransactionFee = By.xpath("//div[@class='ledgerTitle'][contains(.,'Transaction Fee:')]");
    public static By TransactionFeeSelectField = By.xpath("(//span[@class='ant-select-selection-placeholder'])[3]");
    public static By UtilizationFee = By.xpath("//div[@class='ledgerTitle'][contains(.,'Utilization Fee:')]");
    public static By BankAccount = By.xpath("//div[@class='ledgerTitle'][contains(.,'Bank Account:')]");
    public static By TaxAccount = By.xpath("//div[@class='ledgerTitle'][contains(.,'Tax Account:')]");
    public static By ConnectBankSelectField = By.xpath("(//span[@class='ant-select-selection-placeholder'])[5]");
    public static By UtilizationFeeSelectField = By.xpath("(//span[@class='ant-select-selection-placeholder'])[4]");
    public static By EditButton = By.xpath("//button[@class='ant-btn ant-btn-default editButton btn btn-primary']");
    public static By ConnectBankEditButton = By.xpath("(//button[@class='ant-btn ant-btn-default editButton btn btn-primary'])[2]");
    public static By TaxAccountEditButton = By.xpath("(//button[@class='ant-btn ant-btn-default editButton btn btn-primary'])[3]");
    public static By CancelButton = By.xpath("//button[@class='ant-btn ant-btn-default cancelButton mr-10']");
    public static By SaveButton = By.xpath("//button[@class='ant-btn ant-btn-default editButton btn-primary'][contains(.,'Save')]");
    public static By EquipmentFeeDisabled = By.xpath("//input[@type='search']");
    public static By InstallationFeeDisabled = By.xpath("(//input[@type='search'])[2]");
    public static By TransactionFeeDisabled = By.xpath("(//input[@type='search'])[3]");
    public static By UtilizationFeeDisabled = By.xpath("(//input[@type='search'])[4]");
    public static By ConnectFeeDisabled = By.xpath("(//input[@type='search'])[5]");
    public static By TaxAccountFeeDisabled = By.xpath("(//input[@type='search'])[5]");

    public static By EquipmentFeeSelectedField = By.xpath("//span[@class='ant-select-selection-item']");
    public static By InstallationFeeSelectedField = By.xpath("(//span[@class='ant-select-selection-item'])[2]");
    public static By TransactionFeeSelectedField = By.xpath("(//span[@class='ant-select-selection-item'])[3]");
    public static By UtilizationFeeSelectedField = By.xpath("(//span[@class='ant-select-selection-item'])[4]");
    public static By BankAccountFeeSelectedField = By.xpath("(//span[@class='ant-select-selection-item'])[5]");
    public static By TaxAccountFeeSelectedField = By.xpath("(//span[@class='ant-select-selection-item'])[5]");

    public static By EquipmentFeePlaceHolderSelect = By.xpath("//span[@class='ant-select-selection-placeholder']");
    public static By InstallationFeePlaceHolderSelect = By.xpath("(//span[@class='ant-select-selection-placeholder'])[2]");
    public static By TransactionFeePlaceHolderSelect = By.xpath("(//span[@class='ant-select-selection-placeholder'])[3]");
    public static By UtilizationFeePlaceHolderSelect = By.xpath("(//span[@class='ant-select-selection-placeholder'])[4]");

    public static By ActivatedTab = By.xpath("//div[@class='ant-tabs-tab ant-tabs-tab-active']");

    public static By CreateAccountZoho = By.xpath("//button[@class='btn btn-primary']");
    public static By CreateAccountZohoAccountName = By.xpath("//input[@name='account_name']");
    public static By AccountantTab = By.id("ember517");
    public static By ChartOfAccountTab = By.id("ember536");
    public static By SearchFieldZoho = By.xpath("//input[@id='app-quick-search-field']");
    public static By MoreButtonZoho =By.xpath("//button[@class='dropdown-toggle no-caret ember-view details-menu-item nav-link  ']");
    public static By DeleteButtonZoho = By.xpath("//div[@class='dropdown-menu dropdown-menu show show ember-view multi-level']/button[2]");
    public static By OKButtonZoho = By.xpath("//button[@class='btn btn-primary ember-view']");
    public static By SaveButtonZoho = By.xpath("(//button[@class='btn btn-primary'])[2]");
    public static By EditButtonZoho = By.xpath("//span[@class='pl-1']");
    public static By CloseButtonZoho = By.xpath("//a[@class='close']");
    public static By AccountNameTitle = By.xpath("//span[@class='page-header-title']");
    public static By ZohoLogin = By.xpath("//a[@class='zgh-login'][contains(text(),'Sign In')]");
    public static By ZohoEmailField = By.id("login_id");
    public static By ZohoPasswordField = By.id("password");
    public static By ZohoNextBtn = By.xpath("//button[@id='nextbtn']");
    public static By ZohoSearchResult = By.xpath("//span[@class='align-middle btn-link cursor-pointer ']");
    public static By ZohoMoreButton = By.id("ember1167");
    public static By VerifyBtn = By.xpath("//button[@id='nextbtn']//span[contains(text(),'Verify')]");
    public static By EmptyBankAccErrMsg = By.xpath("//div[@class='ant-form-item-explain-error']");
    public static By ClearField = By.xpath("//*[@class='ant-tabs-tabpane ant-tabs-tabpane-active']/div/div[2]/div/div/div[1]/div/div[1]/span[2]");
    public static By DropdownNoData = By.xpath("//div[@class='ant-empty ant-empty-normal ant-empty-small']");
    public static By DeletedAccountErrorMsg = By.xpath("//div[@class='red-color mt-5']");

//    public static By SelectedAccount = By.xpath("//span[@class='ant-select-selection-item']");





    public boolean SelectAccount(int delay, By element, String text) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        writeText(element,text);
        WebElement selectitem = driver.findElement(element);
        Thread.sleep(3500);
        selectitem.sendKeys(Keys.ENTER);
        return true;

    }

    public void SearchAccountInZoho(String text) throws InterruptedException {
        Thread.sleep(3000);
        writeText(SearchFieldZoho,text);
        WebElement Search = driver.findElement(SearchFieldZoho);
        Search.sendKeys(Keys.ENTER);
    }


    public boolean verifyCancelButtonActionAfterSelectingAnotherAccount(){
        String s = driver.findElement(BankAccountFeeSelectedField).getText();
        click(BankAccountFeeSelectedField);
        writeText(ConnectFeeDisabled,"Advance Tax");
        click(CancelButton);
        String s2 = driver.findElement(BankAccountFeeSelectedField).getText();
        if (s.equals(s2)){
            System.out.println("Matched with previous selected account");
            return true;
        }
        else {
            System.out.println("Not Matched with previous selected account");
            return false;
        }



    }

    public String RandomAccountName() {
        String[] prefixes = {"Tuition", "Loan", "Client", "Customer", "Member", "Subscriber","Books","ENTERTAINMENT", "Expensive"};
        String[] suffixes = {"123", "456", "Expenses", "Account"};
        String accountName = prefixes[rand.nextInt(prefixes.length)] + " " + suffixes[rand.nextInt(suffixes.length)];
        System.out.println(accountName);
        return accountName;
    }

    public String DeletedBankAccountErrorMsg(){
        return "The selected ledger account is not available anymore";
    }



}
