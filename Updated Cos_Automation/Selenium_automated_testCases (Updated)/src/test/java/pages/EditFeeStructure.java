package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.DecimalFormat;

public class EditFeeStructure extends BasePage{
    public EditFeeStructure(WebDriver driver)
    {
        super(driver);
    }


    public static By AuditLog = By.xpath("//span[@class='drawerInsideTitle'][contains(text(),'Audit Log')]");
    public static By FeeModifier = By.xpath("(//span[@class='drawerInsideTitle'])[3]");
    public static By DrawerTitle = By.xpath("//span[@class='drawerTitle']");
    public static By FeeRemoveButton = By.xpath("//span[@class='anticon anticon-minus-circle']");
    public static By FeeRemoveButton2 = By.xpath("(//span[@class='anticon anticon-minus-circle'])[2]");
    public static By FeeRemoveButton3 = By.xpath("(//span[@class='anticon anticon-minus-circle'])[3]");
    public static By FeeRemoveButton4 = By.xpath("(//span[@class='anticon anticon-minus-circle'])[4]");
    public static By FeeRemoveButton5 = By.xpath("(//span[@class='anticon anticon-minus-circle'])[5]");
    public static By FeeField1 = By.xpath("//input[@name='rate']");
    public static By FeeField2 = By.xpath("(//input[@name='rate'])[2]");
    public static By FeeField3 = By.xpath("(//input[@name='rate'])[3]");
    public static By FeeField4 = By.xpath("(//input[@name='rate'])[4]");
    public static By FeeField5 = By.xpath("(//input[@name='rate'])[5]");
    public static By FeeField6 = By.xpath("(//input[@name='rate'])[6]");
    public static By FeeField7 = By.xpath("(//input[@name='rate'])[7]");




    public boolean verifyDrawerTitleMatchingWithTableData() throws InterruptedException {
        Thread.sleep(2500);
        waitforPresence(FeeStructureList.Edit);
        String NameT = readText(FeeStructureList.FeeStructureName1);
        System.out.println("Fee name in table: "+NameT);
        click(FeeStructureList.Edit);
        String NameD = readText(DrawerTitle);
        System.out.println("Fee name in drawer: "+NameD);
        if (NameT.equals(NameD)){
            System.out.println("Drawer title is showing correctly");
            return true;
        }
        else {
            System.out.println("Drawer title is not showing correctly");
            return false;
        }

    }


    public boolean verifyFeeModifierHeading(){
        waitforPresence(FeeModifier);
        String ModifierHeading = readText(FeeModifier);
        if (ModifierHeading.matches("Fee Modifier \\(Total: \\d+\\.\\d{2}%\\)")) {
            System.out.println("Fee Modifier heading is showing");
            return true;
        } else {
            System.out.println("Fee Modifier heading is not showing");
            return false;
        }
    }


    public boolean verifyMandatoryFieldIsPopulated(int delay, By element) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        String S = driver.findElement(element).getAttribute("value");
        System.out.println(S);
        if (!S.isEmpty()) {
            System.out.println("Field is not empty");
            return true;
        } else {
            System.out.println("Field is empty");
            return false;
        }
    }


    public boolean verifySumOfFeesInTableShowingCorrectly() throws InterruptedException {
        FeeStructureList list = new FeeStructureList(driver);
        waitforPresence(DrawerTitle);
        String s = driver.findElement(FeeField1).getAttribute("value");
        double sessionFee1 = Double.parseDouble(s);
        String s2 = driver.findElement(FeeField2).getAttribute("value");
        double sessionFee2 = Double.parseDouble(s2);
        String s3 = driver.findElement(FeeField3).getAttribute("value");
        double sessionFee3 = Double.parseDouble(s3);
        double sum = sessionFee1+sessionFee2+sessionFee3;
        System.out.println("Sum of inputs from drawer: "+sum);
        click(CreateFeeStructure.SaveFeeStructureButton);
        String FeeIntable = list.FeeExtractorFromTable(FeeStructureList.SessionFee1);
        double SessionFeeInTable = Double.parseDouble(FeeIntable);
        System.out.println("Fee in table: "+SessionFeeInTable);
        if (sum==SessionFeeInTable){
            System.out.println("Sum of Multiple Session fees are showing correctly");
            return true;
        }
        else {
            System.out.println("Sum of multiple Session fees are not showing correctly");
            return false;
        }



    }

    public boolean verifySumOfUtilizationFeesInTableShowingCorrectly() throws InterruptedException {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        FeeStructureList list = new FeeStructureList(driver);
        waitforPresence(DrawerTitle);
        String s = driver.findElement(FeeField4).getAttribute("value");
        float UtilizationFee1 = Float.parseFloat(s);
        String s2 = driver.findElement(FeeField5).getAttribute("value");
        float UtilizationFee2 = Float.parseFloat(s2);
        String s3 = driver.findElement(FeeField6).getAttribute("value");
        float UtilizationFee3 = Float.parseFloat(s3);
        float sum = UtilizationFee1+UtilizationFee2+UtilizationFee3;
        float FormattedFee = Float.valueOf(decimalFormat.format(sum));
        System.out.println("Sum of inputs from drawer: "+FormattedFee);
        click(CreateFeeStructure.SaveFeeStructureButton);
        Thread.sleep(2500);
        String FeeIntable = list.FeeExtractorFromTable(FeeStructureList.UtilizationFee1);
        float UtilizationFeeInTable = Float.parseFloat(FeeIntable);
        System.out.println("Fee in table: "+UtilizationFeeInTable);
        if (FormattedFee==UtilizationFeeInTable){
            System.out.println("Sum of Multiple Utilization fees are showing correctly");
            return true;
        }
        else {
            System.out.println("Sum of multiple Utilization fees are not showing correctly");
            return false;
        }



    }


    public boolean verifyInvalidData(By element, String alertMessage) throws InterruptedException {
        String[] invalidValue = {"0", "-1", "-2.53","-100.00"};
        for (int i = 0; i < invalidValue.length; i++) { // start at index 1 to skip the header row
            FieldClear(element);
            writeText(element,invalidValue[i]);
            click(CreateFeeStructure.SaveFeeStructureButton);
            Thread.sleep(1000);
            String alert = readText(CreateFeeStructure.Alert);
            if (!alert.equals(alertMessage)) {
                // Verification failed
                throw new RuntimeException("Verification failed. Got ' " + alert + "' for " + i);

            }

        }
        System.out.println("Alert is showing for invalid inputs");
        return true;
    }

    public boolean verifyInvalidDataForIdleFee(By element, String alertMessage) throws InterruptedException {
        String[] invalidValue = {"-1", "-2.53","-100.00","-20"};
        for (int i = 0; i < invalidValue.length; i++) { // start at index 1 to skip the header row
            FieldClear(element);
            writeText(element,invalidValue[i]);
            click(CreateFeeStructure.SaveFeeStructureButton);
            Thread.sleep(1000);
            String alert = readText(CreateFeeStructure.Alert);
            if (!alert.equals(alertMessage)) {
                // Verification failed
                throw new RuntimeException("Verification failed. Got ' " + alert + "' for " + i);

            }

        }
        System.out.println("Alert is showing for invalid inputs");
        return true;
    }

    public boolean verifyInvalidDataForGracePeriod(By element, String alertMessage) throws InterruptedException {
        String[] invalidValue = {"-1", "0","-2","40","-2.99"};
        for (int i = 0; i < invalidValue.length; i++) { // start at index 1 to skip the header row
            FieldClear(element);
            writeText(element,invalidValue[i]);
            click(CreateFeeStructure.SaveFeeStructureButton);
            Thread.sleep(1000);
            String alert = readText(CreateFeeStructure.Alert);
            if (!alert.equals(alertMessage)) {
                // Verification failed
                throw new RuntimeException("Verification failed. Got ' " + alert + "' for " + i);

            }

        }
        System.out.println("Alert is showing for invalid inputs");
        return true;
    }
    public boolean verifyLessThanThreeValueForGracePeriod(By element, String alertMessage) throws InterruptedException {
        String[] invalidValue = {"1", "2","2.99","1.99"};
        for (int i = 0; i < invalidValue.length; i++) { // start at index 1 to skip the header row
            FieldClear(element);
            writeText(element,invalidValue[i]);
            click(CreateFeeStructure.SaveFeeStructureButton);
            Thread.sleep(1000);
            String alert = readText(CreateFeeStructure.Alert);
            if (!alert.equals(alertMessage)) {
                // Verification failed
                throw new RuntimeException("Verification failed. Got ' " + alert + "' for " + i);

            }

        }
        System.out.println("Alert is showing for invalid inputs");
        return true;
    }





}
