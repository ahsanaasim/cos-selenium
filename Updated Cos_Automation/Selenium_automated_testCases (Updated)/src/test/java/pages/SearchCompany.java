package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SearchCompany extends BasePage{

    public SearchCompany(WebDriver driver)
    {
        super(driver);
    }

    Properties prop = ConfigUtill.getConfig();

    public static By companyEmail1InTable = By.xpath("(//div[@class='wordBreak'])[2]");
    public static By companyPhoneNumber1InTable = By.xpath("(//div[@class='wordBreak'])[3]");
    public static By advancefilterbtn = By.xpath("//button[contains(.,'Add Advance Filter')]");
    public static By statedroddown = By.xpath("(//div[@class='ant-select-selection-overflow'])[1]");
    public static By zipdroddown = By.xpath("(//div[@class='ant-select-selection-overflow'])[2]");
    public static By zipFieldToWrite = By.xpath("(//input[@class='ant-select-selection-search-input'])[2]");
    public static By selectstate = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'Alaska')]");
    public static By selectzip = By.xpath("//div[@class='ant-select-item-option-content'][contains(.,'99950')]");
    public static By statename = By.xpath("//span[@class='ant-tag'][contains(.,'Alaska')]");
    public static By companystatus = By.xpath("//span[contains(.,'Include deactivated companies')]");
    public static By applybtn = By.xpath("//button[contains(.,'Apply')]");
    public static By resetbtn = By.xpath("//button[contains(.,'Reset all')]");
    public static By advancefilter= By.xpath("//span[@class='drawerTitle'][contains(.,'Advanced Filter')]");
    public static By ascendingcompanyname = By.xpath("//span[contains(.,'Company Name')]");
    public static By ascendingemail = By.xpath("//span[contains(.,'Company Email')]");
    public static By loadmorebtn = By.xpath("//span[contains(.,'Load 3 More')]");
    public static By nodataimg = By.xpath("//img[@src='/images/noDataTable.svg']");
    public static By brandifocheckbox = By.xpath("//span[contains(.,'Show companies with logo')]");
    public static By removebtn = By.xpath("//span[@class='anticon anticon-close ant-tag-close-icon']");
    public static By ClearAll = By.xpath("//span[@class='ant-tag cursor tagCss clearAllTag']");




    EditCompany editCompany= new EditCompany(driver);
    CreateCompany company= new CreateCompany(driver);


    public boolean ClickonSearchbar() {
        company.waitForSpinner();
        waitVisibility(editCompany.searchbar);
        waitelementtobedisplayed(editCompany.searchbar);
        click(editCompany.searchbar);
        return true;
    }

    public boolean ClickonAdvanceFilterButton() throws InterruptedException {
        waitforInVisibility(company.spinner);
        driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
        waitVisibility(advancefilterbtn);
        waitelementtobedisplayed(advancefilterbtn);
        waitelemtclickable(advancefilterbtn);
        click(advancefilterbtn);
        return true;
    }

    public boolean ClickonAscedingArrowfromName() throws InterruptedException {
        Thread.sleep(3000);
        company.waitForSpinner();
        waitVisibility(ascendingcompanyname);
        click(ascendingcompanyname);
        return true;
    }

    public boolean ClickonLoadMoreButton() {
    //    WebElement loadmorebt= driver.findElement(By.xpath("//span[contains(.,'Show companies with no logo')]"));
        waitVisibility(loadmorebtn);
        click(loadmorebtn);
        return true;
    }

    public boolean ClickonAscedingfromEmail() {
        company.waitForSpinner();
        waitVisibility(ascendingemail);
        click(ascendingemail);
        return true;
    }

    public boolean ClickonApplyButton() throws InterruptedException {
        Thread.sleep(2000);
        waitelemtclickable(applybtn);
        //waitVisibility(applybtn);
        click(applybtn);
        return true;
    }

    public boolean ClickonResetButton() throws InterruptedException {
       // Thread.sleep(3000);
        waitVisibility(resetbtn);
        click(resetbtn);
        return true;
    }

    public boolean SearchbyEmail(String CompanyEmail) {
        company.waitForSpinner();
        writeText(editCompany.searchbar,CompanyEmail);
        return true;
    }

    public boolean ClickonSelectStateFromAdvanceFilterDrawer() {
        waitVisibility(statedroddown);
        click(statedroddown);
        return true;
    }

    public boolean SelectAlaskaStateFromDropDown() throws InterruptedException {
        Thread.sleep(2000);
        waitVisibility(selectstate);
      //  waitelementtobedisplayed(selectstate);
        click(selectstate);
        click(advancefilter);
        return true;
    }

    public boolean ClickonZipCodeDropdownFromAdvanceFilterDrawer() {
        waitVisibility(zipdroddown);
        click(zipdroddown);
        return true;
    }

    public boolean SelectZipFromDropDown() throws InterruptedException {
      //  company.waitForSpinner();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        waitVisibility(selectzip);
        click(selectzip);
        return true;
    }

    public boolean SelectZipFromAdvancedFilterDropDown() throws InterruptedException {
        //  company.waitForSpinner();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        waitVisibility(zipdroddown);
        click(advancefilter);
        click(zipdroddown);
        writeText(zipFieldToWrite,prop.getProperty("ZipCode"));
        click(selectzip);
        return true;
    }

    public boolean SelectComapnyStatus() {
        //waitVisibility(companystatus);
        click(companystatus);
        return true;
    }

    public boolean ClickShowCompanylogocheckbox() {
        waitVisibility(brandifocheckbox);
        click(brandifocheckbox);
        return true;
    }

    public boolean ClickonCrosstoRemoveStateTag() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(2000);
        waitVisibility(removebtn);
        click(removebtn);
        return true;
    }

    public boolean SearchbyPhoneNumber(String PhoneNumber) {
        company.waitForSpinner();
        writeText(editCompany.searchbar,PhoneNumber);
        return true;
    }

    public boolean VerifCompanywiththeEnteredEmailAddressIsShowing() {
        company.waitForSpinner();
        waitVisibility(companyEmail1InTable);
        String CompanyNameInFirstRow = readText(companyEmail1InTable);
        System.out.println("Company name in table: "+CompanyNameInFirstRow);
        String Expected = prop.getProperty("CompanyEmail");
        if(CompanyNameInFirstRow.equals(Expected))
        {
            System.out.println("Searched Email has displayed");
            return true;
        }else{
            System.out.println("Something Went Wrong!!");
            return false;
        }
    }

    public boolean VerifCompanywiththeEnteredPhoneNumberIsShowing() {
        company.waitForSpinner();
        waitVisibility(companyPhoneNumber1InTable);
        String CompanyPhoneNumberInFirstRow = readText(companyPhoneNumber1InTable);
        System.out.println("Phone number showing in table: "+CompanyPhoneNumberInFirstRow);
        String Expected = prop.getProperty("Phone");
        if(CompanyPhoneNumberInFirstRow.equals(Expected))
        {
            System.out.println("Company with the provided phone number is showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean verifNoDataisShowingafterProvidingInvalidData() throws InterruptedException {
        //waitVisibility(nodataimg);
        company.waitForSpinner();
        Thread.sleep(2000);
        if(driver.findElement(nodataimg).isDisplayed())
        {
            System.out.println("No Company is showing with the provided data ");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifStateNameTagisShowingaAfterSelectingtheStateFromAdncedFilter() {
        company.waitForSpinner();
        waitVisibility(statename);
        if( driver.findElement(statename).isDisplayed())
        {
            System.out.println("Alaska State name is showing");
            return true;
        }else{
            System.out.println("Something Went Wrong!!");
            return false;
        }
    }

    public boolean VerifyZipcodeTagisShowingAfterSelectingtheZipFromAdvancedFilter() {
        waitVisibility(statename);
        waitVisibility(companyEmail1InTable);
        waitVisibility(companyPhoneNumber1InTable);
        if( driver.findElement(By.xpath("//span[@class='ant-tag'][contains(.,'99950')]")).isDisplayed())
        {
            System.out.println("Zip code is showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifCompanyStatusTagisShowingaAfterSelectingtheZipFromAdncedFilter() {
        waitVisibility(statename);
        if( driver.findElement(By.xpath("//span[@class='ant-tag tagCss mb-10'][contains(.,'Deactivated Company included')]")).isDisplayed())
        {
            System.out.println("Zip code is showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifcompanyNameisSortedinAscendingOrder() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(2000);
        waitVisibility(ascendingcompanyname);
        if( driver.findElement(By.xpath("(//div[contains(@class,'wordBreak')])[1]")).isDisplayed())
        {
            System.out.println("Company Name is showing in Ascending Order");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifPagehasRefreshafterprrssingsearchbutton() {
        company.waitForSpinner();
        waitVisibility(ascendingcompanyname);
        if( driver.findElement(By.xpath("//span[contains(.,'Company Name')]")).isDisplayed())
        {
            System.out.println("Company Name is showing in Ascending Order");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifTwoHunderedMorecompaniesareShowingAfterPressingLoadMoreButton() {
        company.waitForSpinner();
        waitVisibility(ascendingcompanyname);
        if(driver.getPageSource().contains("Showing Companies: 400"))
        {
            System.out.println("200 more companies are showing after Clicking on Load more button. Total 400 companies are showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifTwoHunderedCompaniesareShowingAfterSorting() {
        waitVisibility(ascendingcompanyname);
        if(driver.getPageSource().contains("Showing Companies: 200"))
        {
            System.out.println("Total 200 companies are showing and sorted in ascending order");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyAdvanceFilterDrawerhasnotclosedAfterclcikingResetButton() {
        if(driver.getPageSource().contains("Advanced Filter"))
        {
            System.out.println("Company Drawer is Still Showing");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean Verifcheckboxhasdisabled() {
        boolean checked = driver.findElement(By.xpath("//xpath of the checkbox")).isSelected();
        return true;
    }

    public boolean VerifyStateTagHasbeenremoved() {
        try{
            WebElement statetag= driver.findElement(statename);
            if(!statetag.isDisplayed())
            {
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        }catch (NoSuchElementException e) {
            System.out.println("Verification Successful.State tag has been removed!!");

        }
        return true;

    }

    public boolean VerifyOtherFilterHasDiabled() {
            WebElement nologo= driver.findElement(By.xpath("//span[contains(.,'Show companies with no logo')]"));
            if(!nologo.isSelected())
            {
                System.out.println("Verification Successful.Show Company with no logo filter is disabled!!");
            }else {
                System.out.println("Verification UnSuccessful. Something Went Wrong!!");

            }
        return true;

    }


}
