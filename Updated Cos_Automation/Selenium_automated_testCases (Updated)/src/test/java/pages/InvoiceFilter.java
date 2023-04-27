package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class InvoiceFilter extends BasePage{
    public InvoiceFilter(WebDriver driver) {

        super(driver);
    }


    public static By AdvanceFilterButton = By.xpath("//span[normalize-space()='Add Advance Filter']");
    public static By AdvanceFilterDrawerTitle = By.xpath("//span[@class='drawerTitle']");
    public static By InvoiceInformation = By.xpath("//span[@class='drawerInsideTitle']");
    public static By EntityTitle = By.xpath("//div[contains(text(),'Entity')]");
    public static By CompanyTitle = By.xpath("//div[@class='ant-col ant-col-5']//div[contains(text(),'Company')]");
    public static By PropertyTitle = By.xpath("//div[@class='ant-col ant-col-5']//div[contains(text(),'Property')]");
    public static By BillingDurationTitle = By.xpath("//div[contains(text(),'Billing Duration')]");
    public static By EntityField = By.xpath("(//input[@class='ant-select-selection-search-input'])[3]");
    public static By CompanyField = By.xpath("(//input[@class='ant-select-selection-search-input'])[4]");
    public static By PropertyField = By.xpath("(//input[@class='ant-select-selection-search-input'])[5]");
    public static By BillingDurationField = By.xpath("(//input[@class='ant-select-selection-search-input'])[6]");
    public static By AdvanceFilterCrossButton = By.xpath("//button[@class='ant-drawer-close']");
    public static By ResetAllButton = By.xpath("//button[@class='ant-btn ant-btn-default h-40 drawerFBtn underline']");
    public static By ApplyButton = By.xpath("//button[@class='ant-btn ant-btn-primary ml-15 h-40 drawerFBtn']");
    public static By DueNext7DaysFilter = By.xpath("//div[@title='Due in next 7 days']");
    public static By DueNext30DaysFilter = By.xpath("//div[@title='Due in next 30 days']");
    public static By DueInNextFilter = By.xpath("//div[@title='Due in this month']");
    public static By PlaceholderEntityField = By.xpath("//span[@class='ant-select-selection-placeholder']");
    public static By PlaceholderCompanyField = By.xpath("(//span[@class='ant-select-selection-placeholder'])[2]");
    public static By PlaceholderPropertyField = By.xpath("(//span[@class='ant-select-selection-placeholder'])[3]");
    public static By PlaceholderBillingDurationField = By.xpath("(//span[@class='ant-select-selection-placeholder'])[4]");
    public static By AllStatusesFilterButton = By.xpath("//span[@title='All Statuses']");
    public static By DropdownOptionAllStatus = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'All Statuses')]");
    public static By DropdownOptionSentStatus = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Sent')]");
    public static By DropdownOptionPaidStatus = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Paid')]");
    public static By DropdownOptionPartiallyPaidStatus = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Partially Paid')]");
    public static By DropdownOptionOverdueStatus = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Overdue')]");
    public static By DropdownOptionDraftStatus = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Draft')]");
    public static By DropdownOptionCustom = By.xpath("//div[@class='ant-select-item-option-content']//div[contains(text(),'Custom')]");
    public static By Last12DaysFilter = By.xpath("//div[@class='dateContainer']//div[@class='ant-select-selector']//span[2]");
    public static By Last12DaysFilterCrossOption = By.xpath("(//span[@class='ant-select-clear'])[1]");

    public static By AllStatusesCrossOption = By.xpath("(//span[@class='ant-select-clear'])[2]");
    public static By EntityCrossOption = By.xpath("(//span[@class='ant-select-clear'])[3]");
    public static By Tag1 = By.xpath("//span[@class='ant-tag']");
    public static By Tag2 = By.xpath("(//span[@class='ant-tag'])[2]");
    public static By ClearAllTag = By.xpath("//span[@class='ant-tag cursor tagCss clearAllTag']");
    public static By EntityFieldSelected = By.xpath("(//span[@class='ant-select-selection-item'])[3]");
    public static By CompanyFieldSelected = By.xpath("(//span[@class='ant-select-selection-item'])[3]");
    public static By PropertyFieldSelected = By.xpath("(//span[@class='ant-select-selection-item'])[3]");
    public static By BillingDurationFieldSelected = By.xpath("(//span[@class='ant-select-selection-item'])[6]");
    public static By Dropdown = By.xpath("//div[@class='ant-select-dropdown ant-select-dropdown-placement-bottomLeft ']");
    public static By DropdownList = By.xpath("//div[@class='rc-virtual-list-holder-inner']");
    public static By DropdownBar = By.xpath("//span[@class='ant-select-item-option-state']");
    public static By NoItem = By.xpath("//div[@class='ant-select-item-empty']");
    public static By Calender = By.xpath("//div[@class='ant-picker-range-wrapper ant-picker-date-range-wrapper']");
    public static By DropDownCustom = By.xpath("//div[contains(text(),'Custom')]");
    public static By CustomField = By.xpath("//span[@class='ant-select-selection-item']//input[@placeholder='Start date']");
    public static By AllStatusSelectedField = By.xpath("(//span[@class='ant-select-selection-item'])[2]");

    public static By NoDataFoundInTable = (By.xpath("//div[@class='noDataTableDiv']"));







    public void SelectFilterFromDropdown(String text, By element) throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(element);
        click(element);
        writeText(element,text);
        WebElement selectitem = driver.findElement(element);
        Thread.sleep(2000);
        selectitem.sendKeys(Keys.ENTER);

    }

    public boolean verifySelectedTag(String FilterName,By emptyfield, By selectedField) throws InterruptedException {
        Thread.sleep(2000);
        waitforPresence(emptyfield);
        SelectFilterFromDropdown(FilterName,emptyfield);
        String filter = driver.findElement(selectedField).getAttribute("title");
        System.out.println(filter);
        click(ApplyButton);
        Thread.sleep(1500);
        waitforPresence(Tag1);
        String tagFilter = driver.findElement(Tag1).getText();
        System.out.println(tagFilter);
        if (filter.equals(tagFilter)){
            System.out.println("Selected tag is matched");
            return true;
        }
        else {
            System.out.println("Selected tag is not matched");
            return false;
        }

    }

    public boolean verifyDropdownListExpanded(By element) throws InterruptedException {
        Thread.sleep(1500);
        String list = driver.findElement(element).getAttribute("aria-expanded");
        if (list.equals("true")){
            System.out.println("Dropdown list is showing");
            return true;
        }
        else {
            System.out.println("Dropdown list is not showing");
            return false;

        }


    }



    public void EntityListCount() throws InterruptedException {
        Thread.sleep(2000);
        // locate the dropdown element
        WebElement dropdown = driver.findElement(DropdownList);

// create a new Select object from the dropdown element
        Select select = new Select(dropdown);

// hover over the dropdown element to make it visible
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown).perform();

// scroll down the dropdown
        actions.sendKeys(select.getOptions().get(select.getOptions().size() - 1).getText()).perform();
    }








}
