package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.qa.utils.TestUtils.driver;

public class TGTillManagementScreen extends TGOrderManagementScreen {
    public By tillTabName = By.id("Till");

//    @iOSXCUITFindBy(id = "Till" )
//    private WebElement tillTabName;

    public By tillTab = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]" )
//    private WebElement tillTab;

    public By setTillBtn = By.id("Set Till");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Set Till\"]" )
//    private WebElement setTillBtn;

    public By tillName = By.id("A001 - 6(G)");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"A001 - 6(G)\"]" )
//    private WebElement tillName;

    public By userName = By.id("EnginT");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"EnginT\"]" )
//    private WebElement userName;

    public By tillBalance = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 100,00\"]");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TL 100,00\"]" )
//    private WebElement tillBalance;

    public By activeBalance = By.id("Active Till");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Active Till\"]" )
//    private WebElement activeBalance;

    public By payInTab = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]" )
//    private WebElement payInTab;

    public By paidByTxt = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField" )
//    private WebElement paidByTxt;

    public By hideKeyboardButton = By.id("Hide keyboard");

//    @iOSXCUITFindBy(xpath ="//*[@name=\"Hide keyboard\"]")
//    private WebElement hideKeyboardButton;

    public By paidByNumber0 = By.id("0");

    public By paidByNumber1 = By.id("1");

    public By paidByNumber2 = By.id("2");

    public By paidByNumber3 = By.id("3");

    public By paidByNumber4 = By.id("4");

    public By paidByNumber5 = By.id("5");

    public By paidByNumber6 = By.id("6");

    public By paidByNumber7 = By.id("7");

    public By paidByNumber8 = By.id("8");

    public By paidByNumber9 = By.id("9");

    public By paidByNumber00 = By.id("00");

    public By paidByNumberC = By.id("C");


//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"0\"]" )
//    private WebElement paidByNumber0;

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"1\"]" )
//    private WebElement paidByNumber1;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"2\"]" )
//    private WebElement paidByNumber2;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"3\"]" )
//    private WebElement paidByNumber3;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"4\"]" )
//    private WebElement paidByNumber4;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"5\"]" )
//    private WebElement paidByNumber5;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"6\"]" )
//    private WebElement paidByNumber6;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"7\"]" )
//    private WebElement paidByNumber7;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"8\"]" )
//    private WebElement paidByNumber8;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"9\"]" )
//    private WebElement paidByNumber9;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"00\"]" )
//    private WebElement paidByNumber00;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"C\"]" )
//    private WebElement paidByNumberC;

    public By paidByContinueBtn = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther" )
//    private WebElement paidByContinueBtn;

    public By paidInSuccessfulMsg = By.id("Paid In Successfully");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Paid In Successfully\"]")
//    private WebElement paidInSuccessfulMsg;

    public By paidOutSuccessfulMsg = By.id("Paid Out Successfully");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Paid Out Successfully\"]")
//    private WebElement paidOutSuccessfulMsg;


    public void enterCashDropLimit(){
        WebElement element=mergeAndFindMobileElement(numberOne1);
        elementClick(element,"click numberOne ");

        WebElement element1=mergeAndFindMobileElement(numberDoubleZero);
        elementClick(element1,"click numberDoubleZero ");
        elementClick(element1,"click numberDoubleZero ");

        WebElement element2=mergeAndFindMobileElement(continued);
        elementClick(element2,"click continued ");
    }

    public void verifyCashDropSuccessfulPopup(){
        WebElement element=mergeAndFindMobileElement(cashDropSuccessPopup);
        String actualName = elementGetText(element,"verify cashDropSuccessPopup");
        String expectedName = "Cash Drop Successfully";

        Assert.assertEquals(actualName, expectedName);

        WebElement element1=mergeAndFindMobileElement(doneButton);
        elementClick(element1,"click doneButton");
    }

    public void enterCashDropAmount(){
        WebElement element=mergeAndFindMobileElement(numberOne1);
        elementClick(element,"click numberOne ");

        WebElement element1=mergeAndFindMobileElement(numberDoubleZero);
        elementClick(element1,"click numberDoubleZero ");
        elementClick(element1,"click numberDoubleZero ");

        WebElement element2=mergeAndFindMobileElement(continued);
        elementClick(element2,"click continued ");
    }

    public void clickCashDropTab(){
        WebElement element=mergeAndFindMobileElement(cashDropTab);
        elementClick(element,"click cashDropTab ");
    }

    public void selectActiveTill(){
        WebElement element=mergeAndFindMobileElement(activeTill);
        elementClick(element,"click activeTill ");

        WebElement element1=mergeAndFindMobileElement(closeTillButton);
        elementClick(element1,"click closeTillButton ");

        WebElement element2=mergeAndFindMobileElement(yesOptionOnPopup);
        elementClick(element2,"click closeTillButton ");

        WebElement element3=mergeAndFindMobileElement(numberOne1);
        elementClick(element3,"click numberOne ");

        WebElement element0=mergeAndFindMobileElement(numberDoubleZero);
        elementClick(element0,"click numberDoubleZero ");
        elementClick(element0,"click numberDoubleZero ");

        WebElement btnContinue=mergeAndFindMobileElement(continued);
        elementClick(btnContinue,"click continued ");

        WebElement btnSubmit=mergeAndFindMobileElement(tillSubmitButton);
        elementClick(btnSubmit,"click tillSubmitButton ");
    }

    public void selectLastActiveTillIfExist() throws InterruptedException {
        List<WebElement> list =  driver.findElements(By.xpath("//tbody[@role='rowgroup']//tr//td[contains(@class,'Till-Balance')]"));

        if (list != null && list.isEmpty()){
            driver.findElement(By.xpath(setTillButton)).click();
        }
        else{
            WebElement element= driver.findElement(By.xpath("(//tbody[@role='rowgroup']//tr//td[contains(@class,'Till-Balance')])["+list.size()+"]"));
            elementClick(element,"click activeTill ");

            WebElement element1= driver.findElement(By.xpath("//button[contains(.,'Close Till')]"));
            elementClick(element1,"click closeTillButton ");

            WebElement element2= driver.findElement(By.xpath("//button[contains(.,'Yes')]"));
            elementClick(element2,"click closeTillButton ");

            WebElement element3= driver.findElement(By.xpath("//button[contains(.,'1')]"));
            elementClick(element3,"click numberOne ");

            WebElement element0= driver.findElement(By.xpath("//button[contains(.,'00')]"));
            elementClick(element0,"click numberDoubleZero ");
            elementClick(element0,"click numberDoubleZero ");

            WebElement btnContinue= driver.findElement(By.xpath("//button[contains(.,'Continue')]"));
            elementClick(btnContinue,"click continued ");

//            String overShortageTitle =  "OVER SHORTAGE";
//            if(overShortageTitle==("OVER SHORTAGE")){
//                WebElement btnNotes=mergeAndFindMobileElement(discrepancyNotes);
//                elementClick(btnNotes,"click discrepancyNotes ");
//
//                driver.hideKeyboard();
//
//                btnNotes.sendKeys("Over Shortage Amount");
//                driver.hideKeyboard();
//
//                WebElement btnDone=mergeAndFindMobileElement(doneButton);
//                elementClick(btnDone,"click doneButton");
//            }
//            else{
//                WebElement btnSubmit=mergeAndFindMobileElement(tillSubmitButton);
//                elementClick(btnSubmit,"click tillSubmitButton ");
//            }
            Thread.sleep(4000);
            WebElement btnSubmit= driver.findElement(By.xpath("//button[contains(.,'Submit')]"));
            elementClick(btnSubmit,"click tillSubmitButton ");
        }
    }


    public void verifyPaidOutSuccessfullPopupInfo(){
        WebElement element=mergeAndFindMobileElement(successPaidOutPopup);
        String actualName = elementGetText(element,"verify successPaidOutPopup");

        String expectedName = "Paid Out Successfully";

        Assert.assertEquals(actualName, expectedName);

        WebElement btnDone=mergeAndFindMobileElement(doneButton);
        elementClick(btnDone,"click doneButton");
    }

    public void selectPaidOutReason(){
        WebElement btnDone=driver.findElement(By.xpath("//button[.='GROCERY']"));
        elementClick(btnDone,"click paidOutReason");

        WebElement element=driver.findElement(By.xpath("//button[.=' Add ']"));
        elementClick(element,"click okButton");
    }

    public void verifyUpdatedActiveTillBalance(){
        WebElement element=mergeAndFindMobileElement(successPaidOutPopup);
        String actualName = elementGetText(element,"verify successPaidOutPopup");
        String expectedName = "Paid Out Successfully";

        Assert.assertEquals(actualName, expectedName);

        WebElement btnDone=mergeAndFindMobileElement(doneButton);
        elementClick(btnDone,"click doneButton");
    }

    public void enterPaidOutAmount(){
        WebElement element3=driver.findElement(By.xpath("//button[.='1']"));
        elementClick(element3,"click numberOne ");

        WebElement element0=driver.findElement(By.xpath("//button[.='00']"));
        elementClick(element0,"click numberDoubleZero ");
        elementClick(element0,"click numberDoubleZero ");

        WebElement btnContinue=driver.findElement(By.xpath("//button[.=' Continue ']"));;
        elementClick(btnContinue,"click continued ");
    }

    public void enterPaidTo(){
        WebElement element=driver.findElement(By.xpath("//input[contains(@class,'quantity_grid-input')]"));
        elementClick(element,"click paidToTextBox ");
        element.sendKeys("Test Automation Cafe");
//        driver.hideKeyboard();
    }

    public void clickPayOutTab(){
        WebElement element= driver.findElement(By.xpath("//p[. ='Pay Out']"));
        elementClick(element,"click payOutTab ");
    }

    public void verifyPaidInSuccessfullPopupInfo(){
        WebElement element=mergeAndFindMobileElement(successPainInPopup);
        String actualName = elementGetText(element,"verify successPaidOutPopup");
        String expectedName = "Paid In Successfully";

        Assert.assertEquals(actualName, expectedName);

        WebElement btnDone=mergeAndFindMobileElement(doneButton);
        elementClick(btnDone,"click doneButton");
    }

    public void selectPaidReason() throws InterruptedException {
        Thread.sleep(4000);

        driver.findElement(By.xpath("//textarea[contains(@class,'payReason_content')]")).click();
        driver.findElement(By.xpath("//textarea[contains(@class,'payReason_content')]")).clear();
        driver.findElement(By.xpath("//textarea[contains(@class,'payReason_content')]")).sendKeys("Paid In");

    }

    public void enterPaidInAmount(){
        WebElement element3=mergeAndFindMobileElement(numberOne1);
        elementClick(element3,"click numberOne ");

        WebElement element0=mergeAndFindMobileElement(numberDoubleZero);
        elementClick(element0,"click numberDoubleZero ");
        elementClick(element0,"click numberDoubleZero ");

        WebElement btnContinue=mergeAndFindMobileElement(continued);
        elementClick(btnContinue,"click continued ");
    }

    @FindBy(xpath = "//input[contains(@class,'quantity_grid-input')]" )
    private WebElement paidByTxt1;
    public void enterPaidBy(){
        sendKeys(paidByTxt1, "KamilT", "Paid By text is entered.");
    }

    public void clickPayInTab(){
        WebElement element=driver.findElement(By.xpath("//linga-icon[@symbol='payIn']"));
        elementClick(element,"click payInButton ");
    }

    public void selectLastActiveTill(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"GöknurB\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> orders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < orders.size(); index++) {
//           /* WebElement firstOrder = orders.get(0);
//            driver.findElement(By.xpath(String.valueOf(firstOrder))).click();*/
//
//            orders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"GöknurB\"])[last()]"));
//            orders.get(orders.size() - 1).click();
//        }
    }
    public void closeUserGlobalOptionIfEnable() throws Exception {
        Thread.sleep(2000);
        WebElement element= driver.findElement(By.xpath("//ion-label[contains(.,'Global Till')]"));
        String actualName = elementGetText(element,"verify globalTillToggleText");
        String expectedName = "Global Till";

        Assert.assertEquals(actualName, expectedName);

        WebElement element1=driver.findElement(By.xpath("//ion-label[contains(.,'Global Till')]/..//ion-toggle"));
        String value = getAttribute(element1,"value");

        if (value.contains("1")) {
            WebElement element2=driver.findElement(By.xpath("//ion-label[contains(.,'Global Till')]/..//ion-toggle"));
            elementClick(element2,"click globalTillToggle ");

        } else if (value.contains("0")) {
            WebElement element3=driver.findElement(By.xpath("//ion-title[contains(.,'OPEN TILL')]"));
            String actualName1 = elementGetText(element3,"verify openTillHeader");
            String expectedName1 = "OPEN TILL";

            Assert.assertEquals(actualName1,expectedName1);
        }
    }
    public void openUserGlobalOptionIfDisable() throws Exception {
        Thread.sleep(2000);
        String actualName = driver.findElement(By.xpath("//ion-label[contains(.,'Global Till')]")).getText();
        String expectedName = "Global Till";

        Assert.assertEquals(actualName, expectedName);

        WebElement element1=driver.findElement(By.xpath("//ion-label[contains(.,'Global Till')]/..//ion-toggle"));
        String value = getAttribute(element1,"value");

        if (value.contains("1")) {
            WebElement element3=driver.findElement(By.xpath("//ion-title[contains(.,'OPEN TILL')]"));
            String actualName1 = elementGetText(element3,"verify openTillHeader");
            String expectedName1 = "Open Till";

            Assert.assertEquals(actualName1,expectedName1);
        } else if (value.contains("0")) {
            WebElement element2=driver.findElement(By.xpath("//ion-label[contains(.,'Global Till')]/..//ion-toggle"));
            elementClick(element2,"click globalTillToggle ");
        }
    }

    public void verifyLastActiveTill() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element3 = driver.findElement(By.xpath("//th[contains(.,'Till Balance')]"));
        String actualName = elementGetText(element3,"verify tillBalanceText");
        String expectedName = "Till Balance";

        Assert.assertEquals(actualName,expectedName);

        WebElement element= driver.findElement(By.xpath("//tbody[@role='rowgroup']//tr//td[contains(@class,'Till-Balance')]"));
        String actualName1 = elementGetText(element,"verify newTillBalance");

        String expectedName1 = "$ 100,00";

        Assert.assertEquals(actualName,expectedName);
    }
    public void enterTillAmount(){
        WebElement element3 = driver.findElement(By.xpath("//ion-col[contains(@class,'numberpad_grid-row-col')]//button//span[contains(.,'1')]"));
        elementClick(element3,"click numberOne ");

        WebElement element0= driver.findElement(By.xpath("//ion-col[contains(@class,'numberpad_grid-row-col')]//button//span[contains(.,'00')]"));
        elementClick(element0,"click numberDoubleZero ");
        elementClick(element0,"click numberDoubleZero ");

        WebElement btnContinue=driver.findElement(By.xpath("//button[contains(.,'Continue')]"));
        elementClick(btnContinue,"click tillContinueButton ");
    }

    public void verifyOpenTillPage() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element3= driver.findElement(By.xpath("//ion-title[contains(.,'OPEN TILL')]"));
        String actualName = elementGetText(element3,"verify openTillHeader");
        String expectedName = "OPEN TILL";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickSetTillButton(){
        WebElement element= driver.findElement(By.xpath("//button[contains(.,'Set Till')]"));
        elementClick(element,"click setTillButton ");
    }

    public String getTabName() {
        WebElement element=mergeAndFindMobileElement((WebElement) tillTabName);
        String value = elementGetText(element, "till tab's name is - ");
        return value;
    }

    public OpenTillWindow pressSetTillBtn() {
        WebElement element = mergeAndFindMobileElement((WebElement) setTillBtn);
        elementClick(element,"Tapped set till button.");
//        elementClick(setTillBtn, "Tapped set till button.");
        return new OpenTillWindow();
    }

    public void pressPayInTab() {
        WebElement element = mergeAndFindMobileElement((WebElement) payInTab);
        elementClick(element,"Tapped Pay In tab.");
//        elementClick(payInTab, "Tapped Pay In tab.");
    }

    public void setPaidBy(){
        WebElement element = mergeAndFindMobileElement((WebElement) paidByTxt);
//        elementClick(element,"Tapped Pay In tab.");
        element.sendKeys( "KamilT", "Paid By text is entered.");
    }

    public String getTillName() throws Exception {
        WebElement element = mergeAndFindMobileElement((WebElement) tillName);
        String value = elementGetText( element,"the name of the till is: ");
        return value;
    }

    public String getOpenedBy() throws Exception {
        WebElement element = mergeAndFindMobileElement(String.valueOf(userName));
        String value = elementGetText( element,"the name of the till is: ");
        return value;
//        return elementGetText( userName,"opened by: ");
    }

    public String getBalance() throws Exception {
        WebElement element = mergeAndFindMobileElement(String.valueOf(tillBalance));
        String value = elementGetText( element,"till balance is: ");
        return value;
//        return elementGetText( tillBalance,"till balance is: ");
    }

    public void pressHideKeyboardBtn() {
        WebElement element = mergeAndFindMobileElement((WebElement) hideKeyboardButton);
        elementClick(element,"Keyboard hidden.");
//        click(hideKeyboardButton, "Keyboard hidden.");
    }
    public void press0() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidByNumber0);
        elementClick(element,"Tapped number0");
//        elementClick(paidByNumber0, "Tapped number0");
    }

    public void press1() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidByNumber1);
        elementClick(element,"Tapped number1");
//        elementClick(paidByNumber1, "Tapped number1");
    }

    public void press2() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidByNumber2);
        elementClick(element,"Tapped number2");

//        elementClick(paidByNumber2, "Tapped number2");
    }

    public void press3() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidByNumber3);
        elementClick(element,"Tapped number3");
//        elementClick(paidByNumber3, "Tapped number3");
    }

    public void press4() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidByNumber4);
        elementClick(element,"Tapped number4");

//        elementClick(paidByNumber4, "Tapped number4");
    }

    public void press5() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidByNumber5);
        elementClick(element,"Tapped number5");
//        elementClick(paidByNumber5, "Tapped number5");
    }

    public void press6() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidByNumber6);
        elementClick(element,"Tapped number6");
//        elementClick(paidByNumber6, "Tapped number6");
    }

    public void press7() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidByNumber7);
        elementClick(element,"Tapped number7");
//        elementClick(paidByNumber7, "Tapped number7");
    }

    public void press8() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidByNumber8);
        elementClick(element,"Tapped number8");
//        elementClick(paidByNumber8, "Tapped number8");
    }

    public void press9() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidByNumber9);
        elementClick(element,"Tapped number9");
//        elementClick(paidByNumber9, "Tapped number9");
    }

    public void press00() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidByNumber00);
        elementClick(element,"Tapped number00");
//        elementClick(paidByNumber00, "Tapped number00");
    }

    public void pressC() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidByNumberC);
        elementClick(element,"Tapped numberC");
//        elementClick(paidByNumberC, "Tapped numberC");
    }

    public TGPaymentReasons pressPaidByContinueBtn(){
        click(paidByContinueBtn, "Paid By Continue button is tapped.");
        return new TGPaymentReasons();
    }

    public String getPaidInSuccessfulMsg() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidInSuccessfulMsg);
        String value = elementGetText( element,"paid in successfully - ");
        return value;
//        return getText(paidInSuccessfulMsg, "paid in successfully - ");
    }

    public String getPaidOutSuccessfulMsg() {
        WebElement element = mergeAndFindMobileElement((WebElement) paidOutSuccessfulMsg);
        String value = elementGetText( element,"paid out successfully - ");
        return value;
//        return getText(paidOutSuccessfulMsg, "paid out successfully - ");
    }

    public void pressPayOutTab() {
        WebElement element=mergeAndFindMobileElement(payOutTab);
        elementClick(element,"click payOutTab ");
    }

    public void setPaidTo(){
        WebElement element=mergeAndFindMobileElement((WebElement) paidByTxt);
        element.sendKeys( "KamilT", "Paid To text is entered.");
    }

    public TGPaymentReasons pressPaidOutContinueBtn(){
        WebElement element=mergeAndFindMobileElement((WebElement) paidByContinueBtn);
        elementClick(element,"Paid Out Continue button is tapped.");
//        elementClick(paidByContinueBtn, "Paid Out Continue button is tapped.");
        return new TGPaymentReasons();
    }
    public void enterTillBalance(){
        WebElement element5=mergeAndFindMobileElement(tillNumberFive);
        elementClick(element5,"click tillNumberFive ");

        WebElement element0=mergeAndFindMobileElement(tillNumberDoubleZero);
        elementClick(element0,"click tillNumberFive ");
        elementClick(element0,"click tillNumberFive ");

        WebElement btnContinue=mergeAndFindMobileElement(tillContinueButton);
        elementClick(btnContinue,"click tillNumberDoubleZero ");
    }

    public void verifyTillBalance(){
        WebElement element=mergeAndFindMobileElement(tillBalanceTitle);
        String actualName=elementGetText(element,"verify tillBalanceTitle");
        String expectedName = "Till Balance";

        Assert.assertEquals(actualName,expectedName);
    }

    public void selectActiveTillBalance(){
        WebElement element=mergeAndFindMobileElement(tillBalanceAmount);
        elementClick(element,"click tillBalanceAmount ");
    }

    public void clickTillCloseButton(){
        WebElement element=mergeAndFindMobileElement(closeTillButton);
        elementClick(element,"click closeTillButton ");
    }

    public void YesOptionCloseTillButton(){
        WebElement element=mergeAndFindMobileElement(yesOption);
        elementClick(element,"click yesOption ");
    }

    public void verifyClosedTill(){
        WebElement element=mergeAndFindMobileElement(expectedCashAmount);
        String actualName=elementGetText(element,"verify expectedCashAmount");

        WebElement element1=mergeAndFindMobileElement(endingCashAmount);
        String expectedName=elementGetText(element1,"verify endingCashAmount");

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickTillSubmitButton(){
        WebElement element=mergeAndFindMobileElement(tillSubmitButton);
        elementClick(element,"click tillSubmitButton ");
    }

    public void getLastDate(){
        LocalDate start = LocalDate.now();
        LocalDate end = LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());

        //Create stream of dates
        List<LocalDate> dates = Stream.iterate(start, date -> date.plusDays(1))
                .limit(ChronoUnit.DAYS.between(start, end))
                .collect(Collectors.toList());

        // Max Date
        LocalDate maxDate = dates.stream()
                .max( Comparator.comparing( LocalDate::toEpochDay ) )
                .get();

        // Min Date
        /*LocalDate minDate = dates.stream()
                .min( Comparator.comparing( LocalDate::toEpochDay ) )
                .get();*/

        System.out.println("maxDate = " + maxDate);
        //System.out.println("minDate = " + minDate);
    }

    //new (nov 15)
    public void selectLastActiveTillIfExistFirst(){

        List<WebElement> list = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable"));

        if (list != null && list.isEmpty()){
            driver.findElement(By.id(setTillButton)).click();
        }
        else{
            WebElement element=mergeAndFindMobileElement(activeTill);
            elementClick(element,"click activeTill ");

            WebElement element1=mergeAndFindMobileElement(closeTillButton);
            elementClick(element1,"click closeTillButton ");

            WebElement element2=mergeAndFindMobileElement(yesOptionOnPopup);
            elementClick(element2,"click closeTillButton ");

            WebElement element3=mergeAndFindMobileElement(numberOne1);
            elementClick(element3,"click numberOne ");

            WebElement element0=mergeAndFindMobileElement(numberDoubleZero);
            elementClick(element0,"click numberDoubleZero ");
            elementClick(element0,"click numberDoubleZero ");

            WebElement btnContinue=mergeAndFindMobileElement(continued);
            elementClick(btnContinue,"click continued ");

            String overShortageTitle =  "OVER SHORTAGE";
            WebElement element4=mergeAndFindElement(overShortageTitle,"", TestUtils.Accessibility);

            if(overShortageTitle=="OVER SHORTAGE"){
                WebElement btnNotes=mergeAndFindMobileElement(discrepancyNotes);
                elementClick(btnNotes,"click discrepancyNotes ");

//                driver.hideKeyboard();

                btnNotes.sendKeys("Over Shortage Amount");
//                driver.hideKeyboard();

                WebElement btnDone=mergeAndFindMobileElement(doneButton);
                elementClick(btnDone,"click doneButton");
            }
            else{
                WebElement btnSubmit=mergeAndFindMobileElement(tillSubmitButton);
                elementClick(btnSubmit,"click tillSubmitButton ");
            }
            WebElement btnSubmit=mergeAndFindMobileElement(tillSubmitButton);
            elementClick(btnSubmit,"click tillSubmitButton ");
        }
    }





}
