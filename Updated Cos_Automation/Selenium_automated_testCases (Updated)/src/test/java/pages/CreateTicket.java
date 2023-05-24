package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CreateTicket extends BasePage{

    public CreateTicket(WebDriver driver) {

        super(driver);
    }
    Dashboard dashboard =new Dashboard(driver);
    CreateProperty property = new CreateProperty(driver);

    public static By CreateTicketButton = By.xpath("//button[@class='ant-btn ant-btn-primary btnPadding pl-30 pr-30']");
    public static By CreateTicketDrawerTitle = By.xpath("//div[@class='drawerTitle wordBreak createTicketDrawer'][contains(text(),'Create New Ticket')]");
    public static By TicketInformationTitle = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Ticket Information')]");
    public static By SupportButton = By.xpath("//div[@class='supportContainer'][normalize-space()='Support']");
    public static By SupportQuestionMark = By.xpath("//span[@class='anticon anticon-question-circle']");
    public static By SelectPropertyTitle = By.xpath("//div[@class='drawerInputTitle']");
    public static By TicketTypeTitle = By.xpath("(//div[@class='drawerInputTitle'])[2]");
    public static By SubjectTitle = By.xpath("(//div[@class='drawerInputTitle'])[3]");
    public static By SubjectField = By.xpath("//input[@class='ant-input']");
    public static By SubjectFieldOccupied = By.xpath("//input[@class='ant-input ant-input-status-success']");
    public static By TicketDescriptionTitle = By.xpath("//div[@class='drawerInputTitle mt-20']");
    public static By AttachmentTitle = By.xpath("//div[@class='drawerInputTitle attachmentText mt-20']");
    public static By SelectPropertyField = By.xpath("//input[@class='ant-select-selection-search-input']");
    public static By SelectPropertyFieldSelected = By.xpath("//span[@class='ant-select-selection-item']");
    public static By SelectPropertyPlaceholder = By.xpath("//span[@class='ant-select-selection-placeholder']");
    public static By TicketTypeFieldSelected = By.xpath("(//span[@class='ant-select-selection-item'])[2]");
    public static By TicketTypeField = By.xpath("(//input[@class='ant-select-selection-search-input'])[2]");
    public static By TicketTypePlaceholder = By.xpath("(//span[@class='ant-select-selection-placeholder'])[2]");
    public static By ChargerField = By.xpath("(//input[@class='ant-select-selection-search-input'])[3]");
    public static By ChargerFieldSelected = By.xpath("(//span[@class='ant-select-selection-item'])[3]");
    public static By ChargerPlaceholder = By.xpath("//span[@class='ant-select-selection-placeholder']");
    public static By DescriptionField = By.xpath("//textarea[@class='ant-input']");
    public static By DescriptionFieldWithText = By.xpath("//textarea[@class='ant-input ant-input-status-success']");
    public static By UploadFile = By.xpath("//span[@class='ant-upload']");
    public static By UploadText = By.xpath("//div[@style='margin-top: 8px;'][contains(text(),'Upload')]");
    public static By UploadLimitationText = By.xpath("//div[@class='uploadText']");
    public static By SubmitTicket = By.xpath("//button[@class='ant-btn ant-btn-primary ml-15 h-40 drawerSubmitButton']//span[contains(text(),'Submit Ticket')]");
    public static By SubmitTicketButtonOnly = By.xpath("//button[@class='ant-btn ant-btn-primary ml-15 h-40 drawerSubmitButton']");
    public static By CancelButtonOnly = By.xpath("//button[@class='ant-btn ant-btn-default ml-15 h-40 drawerCloseButton']");
    public static By CrossButtonOnly = By.xpath("//span[@class='anticon anticon-close']");
    public static By PropertyDropdownOption1 = By.xpath("//div[@class='ant-select-item-option-content']");
    public static By PropertyDropdownOption2 = By.xpath("(//div[@class='ant-select-item-option-content'])[2]");
    public static By PropertyDropdownOption3 = By.xpath("(//div[@class='ant-select-item-option-content'])[3]");
    public static By PropertyDropdownOption4 = By.xpath("(//div[@class='ant-select-item-option-content'])[4]");
    public static By PropertyDropdownOption5 = By.xpath("(//div[@class='ant-select-item-option-content'])[5]");
    public static By PropertyDropdownOption6 = By.xpath("(//div[@class='ant-select-item-option-content'])[6]");
    public static By PropertyDropdownOption7 = By.xpath("(//div[@class='ant-select-item-option-content'])[7]");
    public static By PropertyDropdownOption8 = By.xpath("(//div[@class='ant-select-item-option-content'])[8]");
    public static By TicketTypeGeneral = By.xpath("//div[@title='Software Issue']");
    public static By TicketTypeTechnical = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Charging Issue']");
    public static By TicketTypeBilling = By.xpath("//div[@title='Billing']");
    public static By RequiredSignSelectProperty = By.xpath("//span[@class='red-color'][normalize-space()='*']");
    public static By RequiredSignTicket = By.xpath("(//span[@class='red-color'][normalize-space()='*'])[2]");
    public static By RequiredSignCharger = By.xpath("(//span[@class='red-color'][normalize-space()='*'])[3]");
    public static By RequiredSignSubject = By.xpath("(//span[@class='red-color'][normalize-space()='*'])[4]");
    public static By RequiredSignTicketDescription = By.xpath("(//span[@class='red-color'][normalize-space()='*'])[5]");
    public static By DropdownList = By.xpath("//div[@class='rc-virtual-list-holder-inner']");
    public static By OptionsList = By.className("ant-select-item-option-content");
    public static By PropertyRequiredMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Property is required')]");
    public static By TicketTypeRequiredMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Ticket type is required')]");
    public static By SubjectRequiredMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Subject is required')]");
    public static By TicketDescriptionRequiredMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Ticket description is required')]");
    public static By ChargerRequiredMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Charger is required')]");
    public static By MinimumFiftyCharacterMsg = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Write a minimum of 50 characters')]");
    public static By ReportProblem = By.xpath("//div[@class='reportProblemText']");
    public static By ZohoSign = By.xpath("//div[@class='zgh-utilities']//a[@class='zgh-login'][normalize-space()='SIGN IN']");
    public static By FirstTicket = By.xpath("//*[@id=\"react\"]/desk/div[1]/div/div/section/section/article/div/div/div/div[2]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div/div/div/a");
    public static By FirstTicketClickable = By.xpath("//div[@class='zd-modulelistnew-subjectInnerEle']");
    public static By ReportAProblemDisabled = By.xpath("//li[@class='ant-dropdown-menu-item ant-dropdown-menu-item-disabled ant-dropdown-menu-item-only-child']");


    public boolean verifyCreateTicketButtonColor() throws InterruptedException {
        Thread.sleep(3000);
        // identify text
        WebElement CreateTicket = driver.findElement(CreateTicketButton);
        //obtain color in rgba
        String s = CreateTicket.getCssValue("background").replaceAll(" none repeat scroll 0% 0% / auto padding-box border-box","");
        // convert rgba to hex
        String Hexcode = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Color is :" + Hexcode);
        String CreateTicketButtonColor = "#115955";
        if (Hexcode.equals(CreateTicketButtonColor)){
            System.out.println("Colour of Create Button is dark green");
            return true;
        }
        else {
            System.out.println("Colour of Create Button is not dark green");
            return false;
        }

    }

    public boolean verifySubmitTicketButtonColor() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        waitforPresence(SubmitTicketButtonOnly);
        // identify text
        WebElement Submit = driver.findElement(SubmitTicketButtonOnly);
        //obtain color in rgba
        String s = Submit.getCssValue("background").replaceAll(" none repeat scroll 0% 0% / auto padding-box border-box","");
        // convert rgba to hex
        String Hexcode = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Color is :" + Hexcode);
        String SubmitTicketButtonColor = "#115955";
        if (Hexcode.equals(SubmitTicketButtonColor)){
            System.out.println("Colour of Submit ticket Button is dark green");
            return true;
        }
        else {
            System.out.println("Colour of Submit ticket Button is not dark green");
            return false;
        }

    }

    public boolean verifyCancelButtonColor() throws InterruptedException {
        Thread.sleep(3000);
        // identify text
        WebElement Cancel = driver.findElement(CancelButtonOnly);
        //obtain color in rgba
        String s = Cancel.getCssValue("background").replaceAll(" none repeat scroll 0% 0% / auto padding-box border-box","");
        System.out.println("Color is :" + s);
        // convert rgba to hex
        String Hexcode = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Color is :" + Hexcode);
        String CancelButtonColor = "#ffffff";
        if (Hexcode.equals(CancelButtonColor)){
            System.out.println("Colour of Cancel Button is white");
            return true;
        }
        else {
            System.out.println("Colour of Cancel Button is not white");
            return false;
        }

    }



    public void SelectOptionFromInputField(By element,String text) throws InterruptedException {
        waitforPresence(element);
        click(element);
        writeText(element,text);
        WebElement selectItem = driver.findElement(element);
        Thread.sleep(2600);
        selectItem.sendKeys(Keys.ENTER);
    }

    public boolean verifyTheFieldIsTextType(By element){
        waitforPresence(element);
        String FiledType = driver.findElement(element).getAttribute("type");
        if (FiledType.equals("text")){
            System.out.println("The field is text type");
            return true;
        }
        else {
            System.out.println("The field is not text type");
            return false;
        }
    }

    public boolean verifyPlaceholder(By element, String expected){
        waitforPresence(element);
        String s = driver.findElement(element).getAttribute("placeholder");
        String placeholderExpected = expected;
        if (s.equals(placeholderExpected)){
            System.out.println("Placeholder is correct");
            return true;
        }
        else{
            System.out.println("Placeholder is not correct");
            return false;

        }

    }

    public String FileLimitationMsg(){
        return "Max file size limit 20 MB.";
    }

    public boolean verifyPropertyDropdownListContainsAllTheProperties() throws InterruptedException {
        Thread.sleep(2500);
        waitforPresence(ChargerListPropertyAdmin.TotalNum);
        String pcount = driver.findElement(ChargerListPropertyAdmin.TotalNum).getText().replaceAll("[^0-9]","");
        int TotalProperty = Integer.parseInt(pcount);
        System.out.println("Number of Actual property in property list : " + TotalProperty);
        click(SupportButton);
        click(CreateTicketButton);
        click(SelectPropertyField);
        Thread.sleep(1500);
        int count = driver.findElements(OptionsList).size();
        System.out.println("Number of options in the Select property dropdown: " + count);
        if (TotalProperty==count){
            System.out.println("All property is showing in the property dropdown list");
            return true;
        }
        else{
            System.out.println("All property is not showing in the property dropdown list");
            return false;
        }
    }

    public boolean verifyChargersDropdownListContainsAllTheChargers() throws InterruptedException {
        waitforPresence(property.ChargersNumbersUnderChargerColumn);
        String ccount = driver.findElement(property.ChargersNumbersUnderChargerColumn).getText();
        int TotalChargers = Integer.parseInt(ccount);
        System.out.println("Number of chargers under the property : " + TotalChargers);
        click(SupportButton);
        click(CreateTicketButton);
        SelectOptionFromInputField(SelectPropertyField,"Broadleaf Homes");
        SelectOptionFromInputField(TicketTypeField,"Charging Issue");
        click(ChargerField);
        Thread.sleep(1500);
        int count = driver.findElements(OptionsList).size()-2;
        System.out.println("Number of options in the chargers dropdown: " + count);
        if (TotalChargers==count){
            System.out.println("All chargers is showing in the dropdown list");
            return true;
        }
        else{
            System.out.println("All chargers is not showing in the dropdown list");
            return false;
        }
    }

    public boolean uploadImageMorethan15Mb() throws IOException, InterruptedException {
        Thread.sleep(5000);
        String workingDir = System.getProperty("user.dir");
        Runtime.getRuntime().exec(workingDir + "\\resources\\MoreThan15MB.png");
        return true;
    }


    public boolean verifyTableNameMatchingWithDrawer(By tableElement, By DrawerElement) throws InterruptedException {
        Thread.sleep(9000);
        waitforPresence(TroubleshootCharger.ThreeDotBesideEditBtn);
        String TableName = driver.findElement(tableElement).getText();
        System.out.println(TableName);
        click(TroubleshootCharger.ThreeDotBesideEditBtn);
        click(ReportProblem);
        Thread.sleep(1500);
        waitforPresence(DrawerElement);
        String DrawerName = driver.findElement(DrawerElement).getText();
        if (TableName.equals(DrawerName)){
            System.out.println("Table data is matched with drawer data");
            return true;
        }
        else {
            System.out.println("Table data is not matched with drawer data");
            return false;
        }
    }

    public boolean verifyReportProblemButtonDisabled() throws InterruptedException {
        Thread.sleep(3000);
        waitforPresence(ReportAProblemDisabled);
        String disabledMsg = driver.findElement(ReportAProblemDisabled).getAttribute("aria-disabled");
        if (disabledMsg.equals("true")){
            System.out.println("Report Problem button is disabled for hardware unit");
            return true;
        }
        else{
            System.out.println("Report Problem button is not disabled for hardware unit");
            return false;
        }

    }
}
