package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    public static By FeeRemoveButton6 = By.xpath("(//span[@class='anticon anticon-minus-circle'])[6]");
    public static By FeeField1 = By.xpath("//input[@name='rate']");
    public static By FeeField2 = By.xpath("(//input[@name='rate'])[2]");
    public static By FeeField3 = By.xpath("(//input[@name='rate'])[3]");
    public static By FeeField4 = By.xpath("(//input[@name='rate'])[4]");
    public static By FeeField5 = By.xpath("(//input[@name='rate'])[5]");
    public static By FeeField6 = By.xpath("(//input[@name='rate'])[6]");
    public static By FeeField7 = By.xpath("(//input[@name='rate'])[7]");

    public static By TimeInAuditLog = By.xpath("//div[@class='infoUpload']");





    public boolean verifyDrawerTitleMatchingWithFeeStructureName() throws InterruptedException {
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


    public boolean verifyFeeHeadingIsUpdated(By element, String feeExtract, String expected){
        waitforPresence(element);
        String fee = feeExtract;
        String exp = expected;
        if (fee.equals(exp)) {
            System.out.println("Fee is updated");
            return true;
        }
        else {
            System.out.println("Fee is not updated");
            return false;
        }

    }

    public boolean verifyUpdateDataMatchWithInputField(int delay, By element,String attribute, String expected) throws InterruptedException {
        Thread.sleep(delay);
        waitforPresence(element);
        String S = driver.findElement(element).getAttribute(attribute);
        double data = Double.parseDouble(S);
        System.out.println("Data in input field: "+data);
        String ExpectedText = expected;
        double expectedData = Double.parseDouble(ExpectedText);
        System.out.println("Generated fee: "+expectedData);
        if (data==expectedData) {
            System.out.println("Matched with Expected");
            return true;
        } else {
            System.out.println("Not Matched with the expected");
            return false;
        }
    }


    public boolean verifyDataIsNotSavingAfterDiscarded(){
        waitforPresence(CreateFeeStructure.SessionFeeAmountField);
        String s = driver.findElement(CreateFeeStructure.SessionFeeAmountField).getAttribute("value");
        System.out.println("Session fee : "+s);
        String discardedValue = "96";
        if (!s.equals(discardedValue)){
            System.out.println("Discarded value is not saving");
            return true;
        }
        else {
            System.out.println("Discarded value is saving");
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
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
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
        double FormattedFee = Double.valueOf(decimalFormat.format(sum));
        click(CreateFeeStructure.SaveFeeStructureButton);
        Thread.sleep(3000);
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
                throw new RuntimeException("Verification failed. Got ' " + alert + "' for " + invalidValue[i]);

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
                throw new RuntimeException("Verification failed. Got ' " + alert + "' for " + invalidValue[i]);

            }

        }
        System.out.println("Alert is showing for invalid inputs");
        return true;
    }

    public boolean verifyInvalidDataForGracePeriod(By element, String alertMessage) throws InterruptedException {
        String[] invalidValue = {"-1", "0","-2","-40","-2.99"};
        for (int i = 0; i < invalidValue.length; i++) { // start at index 1 to skip the header row
            FieldClear(element);
            writeText(element,invalidValue[i]);
            click(CreateFeeStructure.SaveFeeStructureButton);
            Thread.sleep(1000);
            String alert = readText(CreateFeeStructure.Alert);
            if (!alert.equals(alertMessage)) {
                // Verification failed
                throw new RuntimeException("Verification failed. Got ' " + alert + "' for " + invalidValue[i]);

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
                throw new RuntimeException("Verification failed. Got ' " + alert + "' for " + invalidValue[i]);

            }

        }
        System.out.println("Alert is showing for invalid inputs");
        return true;
    }


    public boolean verifyAuditLogIsUpdatedAfterUpdatingAData() throws InterruptedException {
        FeeStructureList list = new FeeStructureList(driver);
        CreateCharger operation = new CreateCharger(driver);
        waitforPresence(AuditLog);
        int logCount = driver.findElements(By.className("ant-timeline-item-content")).size();
        System.out.println("log before updating data: " + logCount);
        click(CreateFeeStructure.SaveFeeStructureButton);
        operation.ClickButton(FeeStructureList.Edit, 3000);
        Thread.sleep(4000);
        waitforPresence(AuditLog);
        int logCount2 = driver.findElements(By.className("ant-timeline-item-content")).size();
        System.out.println("log after updating data: " + logCount2);
        if (logCount2 == logCount + 1) {
            System.out.println("Audit log is updated");
            return true;

        } else {
            System.out.println("Audit log is not updating");
            return false;
        }
    }


    public boolean verifyUpdatedTime() throws InterruptedException{
        click(CreateFeeStructure.SaveFeeStructureButton);
        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("h:mm aa");
        //get current date time with Date()
        Date date = new Date();
        // Now format the date
        String date1= dateFormat.format(date);
        // Print the Date
        System.out.println(date1);
        Thread.sleep(5000);
        waitforPresence(FeeStructureList.Edit);
        click(FeeStructureList.Edit);
        Thread.sleep(5000);
        waitforPresence(TimeInAuditLog);
        String webDate = driver.findElement(TimeInAuditLog).getText();
        System.out.println(webDate);
        if (date1.equals(webDate)){
            System.out.println("Matched");
            return true;
            }
        else {
            System.out.println("Not Matched");
            return false;
            }

    }

    public boolean verifyFeeIsAffectedByFeeModifier(By feeHeading, String feeExtractor, By tableElement ) throws InterruptedException {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        FeeStructureList list = new FeeStructureList(driver);
        CreateFeeStructure fee =  new CreateFeeStructure(driver);
        waitforPresence(feeHeading);
        String s = feeExtractor;
        double sfee = Double.parseDouble(s);
        System.out.println("Extract fee from fee from heading: "+sfee);
        String inputModifier = list.GenerateFee();
        System.out.println("generated fee: "+inputModifier);
        double modifier = Double.parseDouble(inputModifier);
        writeText(CreateFeeStructure.FeeModifierRateField, inputModifier);
        click(CreateFeeStructure.SaveFeeStructureButton);
        double calc = sfee+(sfee*(modifier/100));
        double finCalc2 = Double.valueOf(decimalFormat.format(calc));
        System.out.println(calc);
        System.out.println("Calculated fee: "+finCalc2);
        String s2 = list.FeeExtractorFromTable(tableElement);
        double TableValue = Double.parseDouble(s2);
        System.out.println("Fee from table: "+ TableValue);
        if(finCalc2==TableValue){
            System.out.println("Fee modifier is perfectly affected");
            return true;
        }
        else{
            System.out.println("Fee modifier is not perfectly affected");
            return false;
        }
    }


    public void GotoSmackdownCharger() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://test-app.chargeonsite.com/charger/TPL60M");
    }








}








