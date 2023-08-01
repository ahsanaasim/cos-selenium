package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Properties;

public class SearchEntity extends BasePage{

    public SearchEntity(WebDriver driver)
    {
        super(driver);
    }

    Properties prop = ConfigUtill.getConfig();

    EditCompany editCompany= new EditCompany(driver);
    CreateEntity createEntity= new CreateEntity(driver);
    SearchCompany searchCompany= new SearchCompany(driver);
    CreateCompany company= new CreateCompany(driver);

    public static By enttity = By.xpath("//span[contains(.,'Entity Name')]");
    public static By entitynumber= By.xpath("//span[@class='showCount'][contains(.,'Showing Entities: 0')]");
    public static By entityname= By.xpath("(//div[contains(.,'101')])[8]");
    public static By statedroddown= By.xpath("(//div[@class='ant-select-selection-overflow'])[2]");
    public static By zipdroddown= By.xpath("(//div[@class='ant-select-selection-overflow'])[3]");
    public static By zipFieldToWrite = By.xpath("(//input[@class='ant-select-selection-search-input'])[3]");
    public static By cleartag= By.xpath("//span[@class='ant-tag cursor tagCss clearAllTag'][contains(.,'Clear All')]");
    public static By ascendingnamearrow= By.xpath("//span[contains(.,'Entity Name')]");
    public static By ascendingnemail= By.xpath("//span[contains(.,'Entity Email')]");
    public static By ascendingnphone= By.xpath("//span[contains(.,'Entity Phone')]");
    By EntityEmail1InTable = By.xpath("//div[@class='wordBreak']");


    public boolean ClickonAscedingArrowfromName() throws InterruptedException {
        company.waitForSpinner();
        Thread.sleep(3000);
        waitelemtclickable(ascendingnamearrow);
        waitelementtobedisplayed(ascendingnamearrow);
        click(ascendingnamearrow);
        return true;
    }

    public boolean ClickonAscedingArrowfromEmail() throws InterruptedException {
        createEntity.waitforLoadertoLoadData();
        Thread.sleep(2000);
        waitVisibility(ascendingnemail);
        click(ascendingnemail);
        return true;
    }

    public boolean ClickonAscedingArrowfromphone() {
        waitVisibility(ascendingnphone);
        click(ascendingnphone);
        return true;
    }

    public boolean ClickonSelectStateFromAdvanceFilterDrawer() throws InterruptedException {
        Thread.sleep(3000);
        waitVisibility(statedroddown);
        click(statedroddown);
        return true;
    }

    public boolean ClickonSelectZipdropdownFromAdvanceFilterDrawer() {
        waitVisibility(zipdroddown);
        click(zipdroddown);
        return true;
    }

    public boolean SelectZipFromAdvancedFilterDropDown() throws InterruptedException {
        //  company.waitForSpinner();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        waitVisibility(zipdroddown);
        click(SearchCompany.advancefilter);
        click(zipdroddown);
        writeText(zipFieldToWrite,prop.getProperty("ZipCode"));
        click(SearchCompany.selectzip);
        return true;
    }

    public boolean ClickonClearAllTag() throws InterruptedException {
        waitforInVisibility(company.spinner);
       // Thread.sleep(3000);
       waitelementtobedisplayed(cleartag);
        waitVisibility(cleartag);
        click(cleartag);
        return true;
    }


    public boolean VerifPagehasRefreshafterprrssingsearchbutton() {
        company.waitForSpinner();
        waitVisibility(enttity);
        if( driver.findElement(By.xpath("//span[contains(.,'Entity Name')]")).isDisplayed())
        {
            System.out.println("Entity Name is showing in Ascending Order");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifNoEntityisShowingafterProvidingInvalidData() {
        waitVisibility(entitynumber);
        if( driver.findElement(SearchCompany.nodataimg).isDisplayed())
        {
            System.out.println("No entity has found with this name");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifEntityNameisSortedinAscendingOrder() {
        company.waitForSpinner();
        waitVisibility(entityname);
        if( driver.findElement(By.xpath("(//div[contains(.,'101')])[8]")).isDisplayed())
        {
            System.out.println("Entity Name is showing in Ascending Order");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifEntityEmailisSortedinAscendingOrder() {
        WebElement ele= driver.findElement(By.xpath("(//div[contains(.,'101')])[8]"));
        if( !ele.isDisplayed())
        {
            System.out.println("Entity Email is showing in Ascending Order");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifdMoreEntitiessareShowingAfterPressingLoadMoreButton() {
        company.waitForSpinner();
        if(driver.getPageSource().contains("Showing Entities: 100"))
        {
            System.out.println("Total 100 entites are showing after pressing Load more Button");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean WhenAdminsorttheEntitesAfterPressingLoadMoreButton() throws InterruptedException {
        Thread.sleep(3000);
        if( driver.findElement(By.xpath("//span[contains(@class,'showCount')]")).isDisplayed())
        {
            System.out.println("Entity Name is showing ");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }

    public boolean VerifyEntityManagementPageHasSettoDefaultVauleafterPressingCleerAllTag() throws InterruptedException {
        Thread.sleep(3000);

        if( driver.findElement(By.xpath("//span[contains(@class,'showCount')]")).isDisplayed())
        {
            System.out.println("Entity Name is showing ");
        }else{
            System.out.println("Something Went Wrong!!");
        }
        return true;
    }


    public boolean verifyExpectedColumnWithExpectedContent(String Header, String content, int IndexOfTitle) throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(FeeStructureList.Edit);
        WebElement mytable = driver.findElement(By.xpath("//thead"));
        List<WebElement> headers = mytable.findElements(By.tagName("th"));
        int resultColumnIndex = 0;
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equals(Header)) {
                resultColumnIndex = i;
                System.out.println(resultColumnIndex);
                System.out.println(Header);
                break;
            }
        }
        if (resultColumnIndex != IndexOfTitle) {
            // The "Result" column was not found
            throw new RuntimeException("The column was not found");
        }

        WebElement myrows = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = myrows.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) { // start at index 1 to skip the header row
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            String result = cells.get(resultColumnIndex).getText();
            System.out.println(result);
            if (!result.equals(content)) {
                // Verification failed
                throw new RuntimeException("Verification failed. Expected "+content+", but got '" + result + "' in row " + i);

            }

        }
        System.out.println("Given column occupied with expected content");
        return true;


    }



}
