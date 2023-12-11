package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;


import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TillManagementScreen extends OrderManagementScreen {

    public TillManagementScreen(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "Till" )
    private WebElement tillTabName;

    @FindBy(xpath = "//label[contains(.,'Till Management')]/../linga-icon/../.." )
    private WebElement tillmanagementBtn_Opt;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]" )
    private WebElement tillTab;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Set Till\"]" )
    private WebElement setTillBtn;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"A001 - 3\"]" )
    private WebElement tillName;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"EnginT\"]" )
    private WebElement userName;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TL 100,00\"]" )
    private WebElement tillBalance;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Active Till\"]" )
    private WebElement activeBalance;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]" )
    private WebElement payInTab;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField" )
    private WebElement paidByTxt;

    @FindBy(xpath ="//*[@name=\"Hide keyboard\"]")
    private WebElement hideKeyboardButton;

    @FindBy(xpath = "0")
    private WebElement paidByNumber0;

    @FindBy(xpath = "1")
    private WebElement paidByNumber1;

    @FindBy(xpath = "2" )
    private WebElement paidByNumber2;

    @FindBy(xpath = "3")
    private WebElement paidByNumber3;

    @FindBy(xpath = "4" )
    private WebElement paidByNumber4;

    @FindBy(xpath = "5")
    private WebElement paidByNumber5;

    @FindBy(xpath = "6")
    private WebElement paidByNumber6;

    @FindBy(xpath = "7")
    private WebElement paidByNumber7;

    @FindBy(xpath = "8")
    private WebElement paidByNumber8;

    @FindBy(xpath = "9")
    private WebElement paidByNumber9;

    @FindBy(xpath = "00" )
    private WebElement paidByNumber00;

    @FindBy(xpath = "C" )
    private WebElement paidByNumberC;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther" )
    private WebElement paidByContinueBtn;

    @FindBy(xpath = "Paid In Successfully")
    private WebElement paidInSuccessfulMsg;

    @FindBy(xpath = "Paid Out Successfully")
    private WebElement paidOutSuccessfulMsg;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[4]")
    private WebElement payOutTab;

    @FindBy(xpath = "//button[contains(.,'Close Till')]")
    private WebElement closeTillBtn;

    @FindBy(xpath = "//button[contains(.,'Yes')]")
    private WebElement yesCloseTillBtn;

    @FindBy(xpath = "Continue")
    private WebElement continueCloseTillBtn;

    @FindBy(xpath= "(//XCUIElementTypeStaticText[@name=\"Close Till\"])[1]")
    private WebElement closeTillTitle;

    @FindBy(xpath = "//ion-grid[@class='numberpad_grid md hydrated']//ion-row//ion-col//button//span[contains(.,'Continue')]")
    private WebElement continueCloseBtn;

    @FindBy(xpath = "Submit")
    private WebElement submitCloseTillBtn;

    @FindBy(xpath= "Do you want to Close this Till ?")
    private WebElement closeTillPopUpMsg;

    @FindBy(xpath = "Closed Till")
    private WebElement closeTillTabBtn;



    public String getTabName() {
        return elementGetText(tillTabName, "till tab's name is - ");
    }

    public OpenTillWindow pressSetTillBtn() {
        elementClick(setTillBtn, "Tapped set till button.");
        return new OpenTillWindow(driver);
    }

    public void pressPayInTab() {
        elementClick(payInTab, "Tapped Pay In tab.");
    }

    public void pressTillManagementBTN() {elementClick(tillmanagementBtn_Opt, "Clicked on Till management button in the operation option");
    }

    public void setPaidBy(){
        sendKeys(paidByTxt, "KamilT", "Paid By text is entered.");
    }

    public String getTillName() throws Exception {
        return elementGetText( tillName,"the name of the till is: ");
    }

    public String getOpenedBy() throws Exception {
        return elementGetText( userName,"opened by: ");
    }

    public String getBalance() throws Exception {
        return elementGetText( tillBalance,"till balance is: ");
    }

    public void pressHideKeyboardBtn() throws InterruptedException {
        Thread.sleep(100);
        elementClick(hideKeyboardButton, "Keyboard hidden.");
    }

    public void press0() {
        elementClick(paidByNumber0, "Tapped number0");
    }

    public void press1() {
        elementClick(paidByNumber1, "Tapped number1");
    }

    public void press2() {
        elementClick(paidByNumber2, "Tapped number2");
    }

    public void press3() {
        elementClick(paidByNumber3, "Tapped number3");
    }

    public void press4() {
        elementClick(paidByNumber4, "Tapped number4");
    }

    public void press5() {
        elementClick(paidByNumber5, "Tapped number5");
    }

    public void press6() {
        elementClick(paidByNumber6, "Tapped number6");
    }

    public void press7() {
        elementClick(paidByNumber7, "Tapped number7");
    }

    public void press8() {
        elementClick(paidByNumber8, "Tapped number8");
    }

    public void press9() {
        elementClick(paidByNumber9, "Tapped number9");
    }

    public void press00() {
        elementClick(paidByNumber00, "Tapped number00");
    }

    public void pressC() {
        elementClick(paidByNumberC, "Tapped numberC");
    }

    public PaymentReasonsWindow pressPaidByContinueBtn(){
        elementClick(paidByContinueBtn, "Paid By Continue button is tapped.");
        return new PaymentReasonsWindow(driver);
    }

    public String getPaidInSuccessfulMsg() {
        return elementGetText(paidInSuccessfulMsg, "paid in successfully - ");
    }

    public String getPaidOutSuccessfulMsg() {
        return elementGetText(paidOutSuccessfulMsg, "paid out successfully - ");
    }

    public void pressPayOutTab() {
        elementClick(payOutTab, "Tapped Pay Out tab.");
    }

    public void setPaidTo(){
        sendKeys(paidByTxt, "KamilT", "Paid To text is entered.");
    }

    public PaymentReasonsWindow pressPaidOutContinueBtn(){
        elementClick(paidByContinueBtn, "Paid Out Continue button is tapped.");
        return new PaymentReasonsWindow(driver);
    }

    public void pressCloseTillBtn(){
        elementClick(closeTillBtn, "Close Till button is tapped.");
    }

    public void pressYesCloseTillBtn(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        elementClick(yesCloseTillBtn, "Yes (Close Till) button is tapped.");
    }

    public void continueCloseTillBtn(){
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        elementClick(continueCloseTillBtn, "Continue (Close Till) button is tapped.");
    }

    public void pressSubmitCloseTillBtn(){
        elementClick(submitCloseTillBtn, "Continue (Close Till) button is tapped.");
    }
    public String getCloseWindowTitle() {
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        return elementGetText(closeTillTitle, "till tab's name is - ");
    }

    public String getCloseTillPopUpMsg(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        return elementGetText(closeTillPopUpMsg, "pop-up message - ");
    }

    public void confirmClosedTill(){
        if(closeTillTabBtn.isSelected() == true)
            utils.log().info("Closed Till table is active - Till closed");
        else
            utils.log().info("Error closing till");
    }
    @FindBy(xpath = "//ion-title[contains(.,'OPEN TILL')]")
    WebElement openTill;

    @FindBy(xpath = "Done")
    WebElement Doneee;

    public String verifyOpenTill() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return elementGetText(openTill, "till Management screen - ");
    }
    @FindBy(xpath = "**/XCUIElementTypeSwitch[`value == \"1\"`]")
    WebElement globalEnable;
    //**/XCUIElementTypeSwitch[`value == "0"`]
    public void clickGlobalTillOption() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            //         WebElement globalEnable = (WebElement) driver.findElement(By.xpath()("**/XCUIElementTypeSwitch[`value == \"1\"`]");
            if (globalEnable.isDisplayed()) {
                elementClick(globalEnable, "Disable Global Till");
            } else {
            }
        } catch (Exception h) {

        }
    }
    public String tillBalanceee = " ";
    public void activeTillBalance(){
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement tillBalance = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[5]"));
         tillBalanceee = tillBalance.getText();
         utils.log().info("Active Till Balance - "+tillBalanceee);
        TestUtils.ActiveTill = tillBalanceee;

    }
public String cashDropPoint2= " ";
    public void clickTheCashDropAndEnterTillBalance(String cashDrop) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(1000);
        elementClick(cashDropBtn,"Cash Drop Button Selected");
//        WebElement cashDropPoint = (WebElement) driver.findElement(By.xpath()(cashDrop);
//        String cashDropPoint1 = cashDropPoint.getText();
         cashDropPoint2 = cashDrop.replaceAll("[A-Z$., ]","");
         utils.log().info("Cash Drop Point - "+cashDrop);
         TestUtils.cashDropPoint = cashDropPoint2;
       int cashPoints = cashDropPoint2.length();
        for(int i =0;i<cashPoints;i++) {

            char money = cashDropPoint2.charAt(i);
            String moneyTxt = String.valueOf(money);

            try {
                WebElement text = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"" + moneyTxt + "\"]"));
                elementClick(text, "Selected - " + moneyTxt);
            }catch (Exception h){

            }
        }

        elementClick(continueCloseBtn,"Continue Button");
        WebElement cashDropSuccess = (WebElement) driver.findElement(By.xpath("Cash Drop Successfully"));
        String cashDropSucc = cashDropSuccess.getText();
        utils.log().info("Displayed popup as - "+cashDropSucc);
        elementClick(Doneee,"Done selected ");
        String cashDropValue = TestUtils.cashDropPoint;
        int cashDropValueAmount = Integer.parseInt(cashDropValue);
        String activeTillBalance = TestUtils.ActiveTill;
        String activeee = activeTillBalance.replaceAll("[A-Z$,. ]","");
        int activeTillBalance1 = Integer.parseInt(activeee);

        int activeTillValueCurrent = activeTillBalance1-cashDropValueAmount;
        String currentActiveTillBalance = String.valueOf(activeTillValueCurrent);

        elementClick(tillBtn,"Till Btn Selected");
        WebElement tillBalance = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[5]"));
        String tillBalanceee = tillBalance.getText();
        String tillBalance1 = tillBalanceee.replaceAll("[A-Z$,. ]","");
        Assert.assertEquals(tillBalance1,currentActiveTillBalance);
        utils.log().info("After The Cash Drop , Till balance - "+tillBalanceee);

    }

//    public void verifyTillBalanceWithCashDrop(){
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        String cashDropValue = TestUtils.cashDropPoint;
//        int cashDropValueAmount = Integer.parseInt(cashDropValue);
//        String activeTillBalance = TestUtils.ActiveTill;
//        int activeTillBalance1 = Integer.parseInt(activeTillBalance);
//
//        int activeTillValueCurrent = activeTillBalance1-cashDropValueAmount;
//        utils.log().info("");
//    }
    public String balance1= " ";
    public String getDetailsofActiveTill(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<WebElement> details = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell"));
        int activeTillSize = details.size();
        utils.log().info("Active Till Count - "+activeTillSize);
        WebElement dateTime = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]"));
        WebElement TillName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[2]"));
        WebElement User = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[3]"));
        WebElement Device = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[4]"));
        WebElement tillBalance = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[5]"));
        String time = dateTime.getText();
        String name = TillName.getText();
        String user1 = User.getText();
        String type = Device.getText();
        balance1 = tillBalance.getText();
        TestUtils.balance = balance1;
        utils.log().info(time+" - "+name+" - "+user1+" - "+type+" - "+balance1);

//             String cashTxt =TestUtils.cashTxt;
//             utils.log().info(" - "+cashTxt);
//            if(balance1.equalsIgnoreCase(cashTxt)){
//                utils.log().info("Active Till is Equal - "+ cashTxt);
//            }else{
//                utils.log().info("Active till is not Equal");
//            }
        return balance1;
    }



    public String amountTxt = " ";

    public String getTotal(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement total = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        WebElement amount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));

        String totalTxt = total.getText();
        amountTxt = amount.getText();

        utils.log().info(totalTxt+ " - "+amountTxt);

        return amountTxt;
    }
public String totalOfActiveTillTxt = " ";
    public void verifyMenuTotalWithActivTillTotal(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement totalOfActiveTill =  (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[5]"));
         totalOfActiveTillTxt = totalOfActiveTill.getText();
        TestUtils.totalTxt1= totalOfActiveTillTxt;
        String balance = (TestUtils.balance).replaceAll("[A-Z$., ]","");
        String cashTxt =(TestUtils.cashTxt).replaceAll("[A-Z$., ]","");
        utils.log().info(balance+" - "+cashTxt);
        int bal =Integer.parseInt(balance);
        int cas =Integer.parseInt(cashTxt);
        int total = bal+cas;
        // utils.log().info("Total = "+total);
        String totalWhole ="$ "+total;
        utils.log().info("Before Active Till total - $ "+balance+" Cash Paid for menu - $ "+cashTxt+" Total - $ "+total+" After Till value - "+totalOfActiveTillTxt);
//              if(totalWhole.equalsIgnoreCase(totalOfActiveTillTxt)){
//                  utils.log().info("Active Till Total as - "+totalWhole);
//              }else{
//                  utils.log().info("not correct");
//              }

    }

    public String payInValueTxt1 = " ";

    public void getPayInValue(){
        WebElement payInValue = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField"));
        String payInValueTxt = payInValue.getText();
        payInValueTxt1 =  payInValueTxt.replaceAll("[A-Z$., ]","");
       utils.log().info("Pay In Value - "+payInValueTxt1);
       TestUtils.getValue = payInValueTxt1;

    }
    public String payOutValueTxt2 = " ";
    public void getPayOutValue(){
        WebElement payOutValue = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField"));
        String payOutValueTxt = payOutValue.getText();
        payOutValueTxt2 =  payOutValueTxt.replaceAll("[A-Z$., ]","");
        utils.log().info("Pay Out Value - "+ payOutValueTxt2);
        TestUtils.getValue= payOutValueTxt2;
    }

    public void verifyPayInWithActiveTillTotal(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement totalOfActiveTill =  (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[5]"));
        String totalOfActiveTillTxt = totalOfActiveTill.getText();
        String TotalOfActiveTillTxt1 = totalOfActiveTillTxt.replaceAll("[A-Z$., ]","");
        int ActualTotalOfActiveTill = Integer.parseInt(TotalOfActiveTillTxt1);

         String payInValue =TestUtils.getValue ;
         int payInValueInt = Integer.parseInt(payInValue);
        utils.log().info("Pay in value - "+payInValueInt);
        String ActiveTillValue = (TestUtils.totalTxt1);
        String ActiveTillValue1= ActiveTillValue.replaceAll("[A-Z$., ]","");
        utils.log().info("active - "+ActiveTillValue1);
        int ActiveTillValeuInt = Integer.parseInt(ActiveTillValue1);
        int ExpectedActiveTillValue = payInValueInt + ActiveTillValeuInt;

        Assert.assertEquals(ExpectedActiveTillValue,ActualTotalOfActiveTill);
        utils.log().info("Active Till is - "+ExpectedActiveTillValue);

    }

    public void verifyPayOutWithActiveTillTotal(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement totalOfActiveTill =  (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[5]"));
        String totalOfActiveTillTxt = totalOfActiveTill.getText();
        String TotalOfActiveTillTxt1 = totalOfActiveTillTxt.replaceAll("[A-Z$., ]","");
        int ActualTotalOfActiveTill = Integer.parseInt(TotalOfActiveTillTxt1);

        String payOutValue = TestUtils.getValue;
        int payOutValueInt = Integer.parseInt(payOutValue);
        String ActiveTillValue = (TestUtils.ActiveTill).replaceAll("[A-Z$., ]","");
        int ActiveTillValeuInt = Integer.parseInt(ActiveTillValue);
        utils.log().info("ActiveTillValeuInt - "+ActiveTillValeuInt);
        utils.log().info("payOutValueInt - "+payOutValueInt);
        utils.log().info("ActualTotalOfActiveTill - "+ActualTotalOfActiveTill);
        int ExpectedActiveTillValue =  ActiveTillValeuInt - payOutValueInt;

        Assert.assertEquals(ExpectedActiveTillValue,ActualTotalOfActiveTill);
        utils.log().info("Active Till is - "+ExpectedActiveTillValue);

    }

    public void clickActiveTillCheck(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement activeTillCheck = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell"));
        elementClick(activeTillCheck,"Active Till check selected");


    }

    public void enterAmountGreaterThanBalanceAmount(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement cashExpect = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]"));
        String cashExpectTxt = cashExpect.getText();
        utils.log().info(cashExpectTxt);
        String amount = cashExpectTxt.replaceAll("\\p{Punct}","");
        int count = Integer.parseInt(amount);
        int cashTotalNumber = count+1000;
        utils.log().info("Greater balance - "+cashTotalNumber);
        String cashTotal = String.valueOf(cashTotalNumber);
        int sizeofamount = cashTotal.length();
        utils.log().info(String.valueOf(sizeofamount));
        for(int i =0;i<sizeofamount;i++) {

            char money = cashTotal.charAt(i);
            String moneyTxt = String.valueOf(money);

            try {
                WebElement text = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"" + moneyTxt + "\"]"));
                elementClick(text, "Selected - " + moneyTxt);
            }catch (Exception h){

            }
        }

    }
    @FindBy(xpath = "OVER SHORTAGE")
    WebElement overShortageTxt;
    public String verifyOverShortagePopup(){
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement amountOfDiscrepency = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeStaticText[3]"));
        String discrepencyAmount = amountOfDiscrepency.getText();
        utils.log().info("Discrepancy Amount - "+discrepencyAmount);
        return elementGetText(overShortageTxt,"Popup As - ");
    }

    @FindBy(xpath = "//*[@name='Hide keyboard']")
    WebElement btn_hideKeyboard;
    public void passReasonForDiscrepencyNotes(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement notes = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextView"));
        sendKeys(notes,"The amount should greater than the amount which is in Balance amount ");

//            IOSDriver<WebElement> AD= (IOSDriver) driver;
//            AD.getKeyboard().sendKeys(Keys.RETURN);
        elementClick(btn_hideKeyboard,"Tapped Down");
    }
    @FindBy(xpath = "TOTAL SUMMARY")
    WebElement totalSummary;
    public String verifyTotalSummaryScreen(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return elementGetText(totalSummary,"Summary Screen - ");
    }

    @FindBy(xpath = "//button[contains(.,'Submit')]")
    WebElement submitTotalSummary;

    public void clickSubmitInTotalSummary(){
        elementClick(submitTotalSummary,"Submit Button Selected");
    }

    public void enterSmallerAmountThanBalanceAmount(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement cashExpect = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]"));
        String cashExpectTxt = cashExpect.getText();
        //  utils.log().info(cashExpectTxt);
        String amount = cashExpectTxt.replaceAll("\\p{Punct}","");
        int count = Integer.parseInt(amount);
        int cashTotalNumber = count-1000;
        utils.log().info("Small balance - "+cashTotalNumber);
        String cashTotal = String.valueOf(cashTotalNumber);
        int sizeofamount = cashTotal.length();
        utils.log().info(String.valueOf(sizeofamount));
        for(int i =0;i<sizeofamount;i++) {

            char money = cashTotal.charAt(i);
            String moneyTxt = String.valueOf(money);

            try {
                WebElement text = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"" + moneyTxt + "\"]"));
                elementClick(text, "Selected - " + moneyTxt);
            }catch (Exception h){

            }
        }
    }
    @FindBy(xpath = "Closed Till")
    WebElement closedTillBtn;
    public void clickClosedTillBtn(){
        elementClick(closedTillBtn,"Closed Till Button Selected");
    }

    public void getDetailsofClosedTill(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<WebElement> details = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell"));
        //  int closedTillSize = details.size();
        int leastNumber = details.size();
        WebElement lastOne = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell["+leastNumber+"]"));
        elementClick(lastOne,"Tapped closed till");
        utils.log().info("Closed Till Count - "+leastNumber);
        WebElement dateTime = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell["+leastNumber+"]/XCUIElementTypeStaticText[1]"));

        WebElement TillName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell["+leastNumber+"]/XCUIElementTypeStaticText[2]"));
        WebElement User = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell["+leastNumber+"]/XCUIElementTypeStaticText[3]"));
        WebElement Device = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell["+leastNumber+"]/XCUIElementTypeStaticText[4]"));
        WebElement tillBalance = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell["+leastNumber+"]/XCUIElementTypeStaticText[5]"));
        String time = dateTime.getText();
        String name = TillName.getText();
        String user1 = User.getText();
        String type = Device.getText();
        String balance2 = tillBalance.getText();
        utils.log().info(time+" - "+name+" - "+user1+" - "+type+" - "+balance2);
    }

    public void verifyAmountWithTillBalance(){
        String amountGiven = TestUtils.amountGivenTxt;
        WebElement tillBalance = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[5]"))
                ;
        String balance2 = tillBalance.getText();
        if(amountGiven.equalsIgnoreCase(balance2)){
            utils.log().info("Amount Given is same with Till Balance");
        }else{
            utils.log().info("Amount Given is not same");
        }
    }

    public void verifyActiveTillAsGlobal(){
        WebElement TillName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[2]"));
        String name = TillName.getText();
        if(name.contains("(G)")){
            utils.log().info("Active till as Global Till");
        }else{
            utils.log().info("Active Till is not Active Till");
        }
    }
    public String percentageOfDiscountTxt2 = " ";
    public String getCalculationsOfCashDiscount(){

        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement option = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        String cashOptionTxt = option.getText();
        WebElement total = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String totalTxt = total.getText();
        String cashTxt1 = cashOptionTxt.replaceAll("[$A-Z,.]","");

        //   MathContext mc = new MathContext(3);

        double cash = Double.parseDouble(cashTxt1);
        double disc =(cash*5)/100;
        //   BigDecimal a = new BigDecimal(disc);
        BigDecimal dd=new BigDecimal(disc).setScale(2, RoundingMode.HALF_UP);
        double a=dd.doubleValue();
        String percentageOfDiscount = String.valueOf(a);
        String percentageOfDiscountTxt = percentageOfDiscount.replaceAll("[$A-Z,.]","");

        percentageOfDiscountTxt2 = "TL "+percentageOfDiscountTxt;
        utils.log().info("Discount Amount  - "+percentageOfDiscountTxt2);
        TestUtils.CashDiscountCalculation = percentageOfDiscountTxt2;
        utils.log().info("Cash Price with 5% discount - "+a);
        double cal = cash+disc;
        BigDecimal dd1=new BigDecimal(cal).setScale(2, RoundingMode.HALF_UP);
        double a1=dd1.doubleValue();
        String menuTotal = String.valueOf(a1);

        String menuTotal1 = menuTotal.replaceAll("[$A-Z,.]","");

        String menuTotal2 = "TL "+menuTotal1;

        utils.log().info(cashTxt1+" + "+a+" = "+a1);

        utils.log().info("Total After Calculation - "+menuTotal2);
//        if(menuTotal2.equalsIgnoreCase(totalTxt)){
//            utils.log().info("Cash discount Total calculation is correct - "+totalTxt);
//        }else{
//            utils.log().info("Not Correct cash option");
//        }
        return percentageOfDiscountTxt2;
    }

    public String percentageOfDiscountTxt1 = " ";
    public String getCalculationsOfCashDiscountForDollar(){

        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement option = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        String cashOptionTxt = option.getText();
        WebElement total = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String totalTxt = total.getText();
        String cashTxt1 = cashOptionTxt.replaceAll("[$A-Z,.]","");
        utils.log().info(cashTxt1);
        //String cashTxt2 = cashTxt1.replace(".","");
        // String cashTxt2 = cashTxt3.replaceAll(",",".");
        //   MathContext mc = new MathContext(3);

        double cash = Double.parseDouble(cashTxt1);
        double disc =(cash*5)/100;
        //   BigDecimal a = new BigDecimal(disc);
        BigDecimal dd=new BigDecimal(disc).setScale(2, RoundingMode.HALF_UP);
        double a=dd.doubleValue();
        String percentageOfDiscount = String.valueOf(a);
        //String percentageOfDiscountTxt = percentageOfDiscount.replace(".",",");

        percentageOfDiscountTxt1 = "$ "+percentageOfDiscount;
        utils.log().info("Discount Amount  - "+percentageOfDiscountTxt1);
        TestUtils.CashDiscountCalculation = percentageOfDiscountTxt1;
        utils.log().info("Cash Price with 5% discount - "+a);
        double cal = cash+disc;
        BigDecimal dd1=new BigDecimal(cal).setScale(2, RoundingMode.HALF_UP);
        double a1=dd1.doubleValue();
        String menuTotal = String.valueOf(a1);

        //  String menuTotal1 = menuTotal.replace(".",",");

        String menuTotal2 = "$ "+menuTotal;

        utils.log().info(cashTxt1+" + "+a+" = "+a1);

        utils.log().info("Total After Calculation - "+menuTotal2);
//        if(menuTotal2.equalsIgnoreCase(totalTxt)){
//            utils.log().info("Cash discount Total calculation is correct - "+totalTxt);
//        }else{
//            utils.log().info("Not Correct cash option");
//        }
        return percentageOfDiscountTxt1;
    }

    public String cashOptionTxt = " ";

    public String getDetailsOfCashOption(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement option = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        cashOptionTxt = option.getText();
        TestUtils.cashOptionOrderScreen = cashOptionTxt;
        WebElement total = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String totalTxt = total.getText();
        WebElement subtotal = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subtotal1 = subtotal.getText();
        WebElement tax = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taxTxt = tax.getText();
        utils.log().info("Actual Subtotal of Menu - "+subtotal1);
        utils.log().info("Actual Tax of Menu - "+taxTxt);
        utils.log().info("Actual Total of Menu - "+totalTxt);
        utils.log().info("Cash Price value - "+cashOptionTxt);

//        String cashTxt1 = cashOptionTxt.replaceAll("[A-Z]","");
//        String cashTxt2 = cashTxt1.replaceAll(",",".");
//
//        double cash = Double.parseDouble(cashTxt2);
//        double disc =(cash*5)/100;
//
//        String percentageOfDiscount = String.valueOf(disc);
//        String percentageOfDiscountTxt = percentageOfDiscount.replace(".",",");
//
//         percentageOfDiscountTxt1 = "TL "+percentageOfDiscountTxt;
//         TestUtils.CashDiscountCalculation = percentageOfDiscountTxt1;
//        utils.log().info("Cash Price with 5% discount - "+disc);
//        double cal = cash+disc;
//
//        String menuTotal = String.valueOf(cal);
//
//        String menuTotal1 = menuTotal.replace(".",",");
//
//        String menuTotal2 = "TL "+menuTotal1;
//
//        utils.log().info(cashTxt2+" + "+disc+" = "+cal);
//
//        utils.log().info("Total After Calculation - "+menuTotal2);
////        if(menuTotal2.equalsIgnoreCase(totalTxt)){
////            utils.log().info("Cash discount Total calculation is correct - "+totalTxt);
////        }else{
////            utils.log().info("Not Correct cash option");
////        }
        getCalculationsOfCashDiscountForDollar();
        return cashOptionTxt;
    }

    public void clickCancelButton(){
        WebElement cancelBtn = (WebElement) driver.findElement(By.xpath("Cancel"));
        elementClick(cancelBtn,"Cancel Button Selected");
    }

    public void clickReportsBtn(){
        WebElement reportsBtn = (WebElement) driver.findElement(By.xpath("//P[.='Reports']"));
        elementClick(reportsBtn,"Reports Button Selected");
    }

    public void clickCashierOutBtn() throws InterruptedException {
        Thread.sleep(6000);
        WebElement cashierOutBtn = (WebElement) driver.findElement(By.xpath("//ion-footer//ion-col//button[contains(.,' Cashier Out ')]"));
        elementClick(cashierOutBtn,"Cashier out Button Selected");
    }
    @FindBy(xpath = "//p[.='Do you want to print the cashier out?']")
    WebElement doYouWantToPrintTxt;
    public String verifyDoYouWantToPrintCashierOut(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        return getText(doYouWantToPrintTxt,"Displayed popup as - ");
    }

   @FindBy(xpath = "You have an Active Till. Do you want to close the Till ?")
   WebElement youHaveAnActiveTillPopup;

   public void verifyYouHaveAnActiveTillDoYouWantToCloseTheTill() throws InterruptedException {
       Thread.sleep(800);
        String youHaveActiveTillText = youHaveAnActiveTillPopup.getText();
       Assert.assertEquals(youHaveActiveTillText,"You have an Active Till. Do you want to close the Till ?");
   }
    @FindBy(xpath = "//p[.='Cashier out saved successfully']")
    WebElement cashierOutSavedSuccessfullyPopup;

    public String verifyCashierOutSavedSuccessfully(){
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        return getText(cashierOutSavedSuccessfullyPopup,"Displayed popup as - ");
    }

    public String verifyInitialValue(String numb){
        WebElement number = (WebElement) driver.findElement(By.xpath(numb));
        return getText(number,"Initial Gross Value as - ");
    }

    @FindBy(xpath = "//button[contains(.,'Set Till')]")
    WebElement setTillBtnTill;
    public void verifyTillIsOpenedOrNotIfAvailableCloseTill() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            WebElement till_Balance = (WebElement) driver.findElement(By.xpath("//tbody/tr//td[contains(@class,'Till-Balance')]"));
            if (till_Balance.isDisplayed()) {
                elementClick(till_Balance, "Active Till Selected");
                elementClick(closeTillBtn, "Selected Closed Till Button");
                elementClick(yesCloseTillBtn, "Yes to close till");
                Thread.sleep(400);
                WebElement cashExpected = (WebElement) driver.findElement(By.xpath("//span[@slot='end']"));
                String Balance = cashExpected.getText().substring(17);
                System.out.println("Cash Expected :"+ Balance);
//                utils.log().info("Cash Expected - " + Balance);
                String balanceTxt1 = Balance.replaceAll("[$A-Z,.]","");
                int len = balanceTxt1.length();
                for (int i = 0; i < len; i++) {
                    char letter = balanceTxt1.charAt(i);
                    String let = String.valueOf(letter);
//                    utils.log().info("vale - " + let);
                    WebElement numbers = (WebElement) driver.findElement(By.xpath("//ion-grid[@class='numberpad_grid md hydrated']//ion-row//ion-col//button//span[contains(.,'"+let+"')]"));
                    elementClick(numbers, "Selected - " + numbers.getText());
                }
                elementClick(continueCloseBtn, "Continue Button Selected");
                Thread.sleep(4000);
                elementClick(submitTotalSummary, "Submit the Total Summary");
                elementClick(setTillBtnTill, "Set Till Button is selected");
            } else {
                int a = Integer.parseInt("1a");
            }
        } catch (Exception w) {
//            utils.log().info("Active Till is NOT Available");
        }
    }

    public void closeTheActiveTills(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            WebElement cashExpected = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]"));
                String Balance = cashExpected.getText();
                utils.log().info("Cash Expected - " + Balance);
                String balanceTxt1 = Balance.replaceAll("[$A-Z,. ]","");
                int len = balanceTxt1.length();
                for (int i = 0; i < len; i++) {
                    char letter = balanceTxt1.charAt(i);
                    String let = String.valueOf(letter);
                    utils.log().info("vale - " + let);
                    WebElement numbers = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"" + let + "\"]"));
                    elementClick(numbers, "Selected - " + numbers.getText());
                }
                elementClick(continueCloseBtn, "Continue Button Selected");
               Thread.sleep(5000);
                elementClick(submitTotalSummary, "Submit the Total Summary");
//                elementClick(setTillBtnTill, "Set Till Button is selected");

        } catch (Exception w) {
            utils.log().info("Active Till is NOT Available");
        }
    }

    @FindBy(xpath = "Active Till")
    WebElement activeTill;
    public void selectActiveTill(){
        elementClick(activeTill,"Active Till Selected");
    }

    @FindBy(xpath = "Pay In")
    WebElement payInBtn;
    public void clickPayInButton(){
        elementClick(payInBtn,"Pay In Button Selected ");
    }
    @FindBy(xpath = "Pay Out")
    WebElement payOutBtn;
    public void clickPayOutButton(){
        elementClick(payOutBtn,"Pay Out Button Selected ");
    }
    @FindBy(xpath = "Till")
    WebElement tillBtn;
    public void pressTillBtn(){
elementClick(tillBtn,"Tapped Till Button");
    }


    public void verifyGrossValueWithMenuItem(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        WebElement grossValue = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
        WebElement grossValueAmount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String grossValueTxt =  grossValue.getText();
        String grossValueAmount1 = grossValueAmount.getText();
        String grossValueAmount2 = grossValueAmount1.replaceAll("[A-Z$., ]","");
        int grossValueAmount3 =  Integer.parseInt(grossValueAmount2);
        utils.log().info(grossValueTxt+" - "+grossValueAmount1);
        String beforeSaleGrossValue = (TestUtils.GrossValue);
        String beforeSaleGrossValue1 = beforeSaleGrossValue.replaceAll("[A-Z$., ]","");
        int beforeGrossValue = Integer.parseInt(beforeSaleGrossValue1);
        utils.log().info("beforeGrossValue- "+beforeGrossValue);
        int actualGrossValue = grossValueAmount3 - beforeGrossValue;
        String actualGrossValueTxt = String.valueOf(actualGrossValue);
        utils.log().info("actualGrossValueTxt - "+actualGrossValueTxt);
        String expectedGrossValue = (TestUtils.totalTxt).replaceAll("[A-Z$., ]","");
        utils.log().info("expectedGrossValue - "+expectedGrossValue);
        Assert.assertEquals(expectedGrossValue,actualGrossValueTxt);

        utils.log().info("Gross value is same with Menu Total value "+actualGrossValueTxt);

    }

    public void getGrossValue(){
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        WebElement grossValueAmount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String grossValueAmount1 = grossValueAmount.getText();
        TestUtils.GrossValue = grossValueAmount1;
        utils.log().info("Before Sale Gross Sales - "+grossValueAmount1);
    }
    @FindBy (xpath = "ToggleIcon")
    WebElement ToggleIcon;

    @FindBy (xpath = "POS Settings")
    WebElement posSettings;

    public void clickCashDropFromTillSettings(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        for(int i =1;i<=2;i++) {
            elementClick(ToggleIcon,"Toggle Icon Selected");
            elementClick(posSettings,"posSettings Selected");
            WebElement cashDropBtn = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch"));
            elementClick(cashDropBtn, "Cash Drop Button Selected");
            WebElement saveChanges = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Save Changes\"]"));
            elementClick(saveChanges, "Save Changes Button Selected");
            WebElement successPopup = (WebElement) driver.findElement(By.xpath("Successfully Updated the POS Settings"));
            String successPopupTxt = successPopup.getText();
            Assert.assertEquals(successPopupTxt,"Successfully Updated the POS Settings");
            utils.log().info("Displayed popup as - "+successPopupTxt);
            WebElement donee = (WebElement) driver.findElement(By.xpath("Done"));
             elementClick(donee,"Done button selected");
        }
    }

    @FindBy (xpath = "Till Management")
    WebElement tillManagement;

    public void clickTheTillManagement(){
        elementClick(tillManagement,"Till Management selected");
    }

    @FindBy (xpath = "Cash Drop")
    WebElement cashDropBtn;

    @FindBy(xpath = "downarrow")
    WebElement downArrowBtn;
    public void clickArrowDownBtnReportScreen(){
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
        elementClick(downArrowBtn,"Down Arrow Button");
    }
    @FindBy(xpath = "**/XCUIElementTypeTextField[`value == \"Search Employees\"`]")
    WebElement searchEmployeees;

    @FindBy(xpath = "search icon")
    WebElement search_icon;
    public void selectTheEmployeee(String Employe_Name){
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
        utils.log().info("Employe - "+Employe_Name);
        findandclick(Employe_Name, "",TestUtils.Accessibility);
        utils.log().info("Selected Cashier as - "+Employe_Name);

    }

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Generate\"]")
    WebElement generate_Button;
    public void clickTheGenerateButton(){
        elementClick(generate_Button,"Generate Button Selected");
    }

    public String user_Name1="";
    public void verifyTheSelectedUserAppearInTheReportScreen(String userName) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement user_Name = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"));
        user_Name1 = user_Name.getText();
        utils.log().info("user_Name1 -"+user_Name1);
        Assert.assertEquals(userName,user_Name1);
        utils.log().info("Selected User is SAME - "+userName);
    }


    public void clickTheCashDropBtn(){
        elementClick(cashDropBtn,"Cash Drop Button Selected");
    }
    public void selectTheCashier1OnTheReportScreen() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
        Thread.sleep(6000);
        clickArrowDownBtnReportScreen();
        selectTheEmployeee(TestUtils.cashier_Name1);
        clickTheGenerateButton();
        verifyTheSelectedUserAppearInTheReportScreen(TestUtils.cashier_Name1);
    }

    public void selectTheCashier2OnTheReportScreen() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
        Thread.sleep(6000);
        clickArrowDownBtnReportScreen();
        selectTheEmployeee(TestUtils.cashier_Name2);
        clickTheGenerateButton();
        verifyTheSelectedUserAppearInTheReportScreen(TestUtils.cashier_Name2);
    }

    public void selectTheCashier3OnTheReportScreen() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
        Thread.sleep(6000);
        clickArrowDownBtnReportScreen();
        selectTheEmployeee(TestUtils.cashier_Name3);
        clickTheGenerateButton();
        verifyTheSelectedUserAppearInTheReportScreen(TestUtils.cashier_Name3);
    }

    public void selectTheCashier4OnTheReportScreen() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
        Thread.sleep(6000);
        clickArrowDownBtnReportScreen();
        selectTheEmployeee(TestUtils.cashier_Name4);
        clickTheGenerateButton();
        verifyTheSelectedUserAppearInTheReportScreen(TestUtils.cashier_Name4);
    }
}
