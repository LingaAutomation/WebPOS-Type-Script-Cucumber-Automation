package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import static com.qa.pages.DriverSteup.driver;
import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RefundScreen extends BasePage{

    public WebDriver driver = TestUtils.driver;

    @FindBy(xpath = "//label[.='Refund']")
    WebElement RefundBtn;
    public void clickRefundButton(){
        elementClick(RefundBtn, "Refund Button Selected");
    }

    public void verifyNoChecksFoundPopup(){
        WebElement noRefundCheck = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView"));
        String noRefund = noRefundCheck.getText();
        utils.log().info("Displayed Popup as - "+noRefund);
    }
    @FindBy(xpath = "//input[@data-placeholder='Check No']")
    WebElement searchTabInRefund;

    public void searchTheClosedCheckInRefundScreen() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        Thread.sleep(1000);
        String globalCheckNumber = TestUtils.globalCheckNumber;
        searchTabInRefund.clear();
        searchTabInRefund.sendKeys(globalCheckNumber);
        WebElement searchBtn = driver.findElement(By.xpath("//span[contains(.,'Search')]"));
        elementClick(searchBtn,"Search Button Tapped");
        Thread.sleep(3000);
        WebElement phoneOrders1 = driver.findElement(By.xpath("//tbody[@role='rowgroup']//tr//td[contains(@class,'checkNo')]"));
        if (phoneOrders1.isDisplayed()) {
            elementClick(phoneOrders1, "Tapped Closed Check in closed tab - " + globalCheckNumber);
        }else{
//            utils.log().info("closed check is not available"+ globalCheckNumber);
        }
    }
    @FindBy(xpath = "//linga-icon[@symbol='refundRefundBlack']")
    WebElement RefundBtnn;
    public void clickRefundButtonInRefundScreen(){
        elementClick(RefundBtnn,"Selected Refund Button");
    }

    public void verifyCheckNumberInRefundAmountWindow(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        String globalCheckNumber = TestUtils.globalCheckNumber;
        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]
        WebElement refundCheckNumber = driver.findElement(By.xpath("//span[contains(@class,'refundReason-title-ticket')]"));
        String refundCheckNumberTxt = refundCheckNumber.getText();
        try {
            Assert.assertEquals(globalCheckNumber,refundCheckNumberTxt);
        }catch (Exception e) {}

//        utils.log().info("Refund amount Window check number is Same - "+globalCheckNumber);

    }

    public void verifyCheckNumberWithRefundOrderSCreen(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        String globalCheckNumber = TestUtils.globalCheckNumber;
        WebElement refundCheckNumber = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"));
        String refundCheckNumberTxt = refundCheckNumber.getText();
        Assert.assertEquals(globalCheckNumber,refundCheckNumberTxt);
        utils.log().info("Refund amount Window check number is Same - "+globalCheckNumber);
    }
    public void verifyTotalOfMenuInRefundScreenAmount(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        String totalAmount = TestUtils.totalTxt;
        String totalAmountTxt = totalAmount.replaceAll("[ ]","");
        WebElement refundAmount = driver.findElement(By.xpath("//tbody[@role='rowgroup']//tr//td[contains(@class,'Amount')]"));
        String refundAmountTxt = refundAmount.getText();
        TestUtils.refundAmountTxt = refundAmountTxt;
        try {
            Assert.assertEquals(totalAmountTxt,refundAmountTxt);
        }catch (Exception e){}

//        utils.log().info("Refund Amount SAME with Total of Menu - "+totalAmountTxt);

    }

    public void verifyCheckAmountSameWithRefundWindowAmount(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        String refundAmountTxt = TestUtils.refundAmountTxt;
        WebElement refundAmount =  driver.findElement(By.xpath("//span[contains(@class,'refundReason-amt')]"));
        String refundAmountValueTxt = refundAmount.getText().substring(8);
        Assert.assertEquals(refundAmountTxt,refundAmountValueTxt);
//        utils.log().info("Refund Check Total SAME with Refund Window total - " +refundAmountTxt);
        WebElement defaultAmount =  driver.findElement(By.xpath("//input[contains(@class,'control inputrow')]"));
        String defaultAmountTxt = defaultAmount.getAttribute("value");
        Assert.assertEquals(refundAmountValueTxt,defaultAmountTxt);
//        utils.log().info("Default check amount SAME with Refund Window Total - "+refundAmountValueTxt);
    }
    @FindBy(xpath = "//button[contains(.,'Cancel')]")
    WebElement cancelBtn;
    public void clickCancelBtn(){
        elementClick(cancelBtn,"Tapped Cancel Button");
    }

    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView
    @FindBy(xpath = "//input[contains(@class,'refundReason-content-textReason')]")
    WebElement reasonTextView;
    public void enterTheReasonInTheRefundWindow(){
        reasonTextView.sendKeys("Refund");
    }

    @FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView")
    WebElement reasonTextViewRefundOrder;
    public void enterTheReasonInTheRefundOrderScreen(){
        reasonTextViewRefundOrder.sendKeys("Refund");
    }
    public void enterThePaymentInRefundWindow(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement payment = driver.findElement(By.xpath("//span[contains(.,'Cash')]"));
        TestUtils.fastCash = payment.getText();
        elementClick(payment,"Selected Payment as - "+payment.getText());

    }

    public void verifyThePopupAsDoYouWantToRefundConfirm(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement refundConfirm = driver.findElement(By.xpath("//p[.='Do you want to refund?']"));
        String refundConfirmTxt = refundConfirm.getText();
        Assert.assertEquals(refundConfirmTxt,"Do you want to refund?");
        utils.log().info("Displayed popup as - "+refundConfirmTxt);
    }

    @FindBy(xpath = "//p[.='Refund Success']")
    WebElement refundSuccessPopup;
    public void verifyRefundSuccessPopup() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        Assert.assertEquals(refundSuccessPopup.getText(),"Refund Success");
//        utils.log().info("Displayed popup as - "+"Refund Success");
    }

    @FindBy(xpath = "//p[.='Amount exceeds the paid amount']")
    WebElement amountExceedThPaidAmount;
    public void verifyTheAmountExceedsThePaidAmountPopup(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        String amountExceedsPaidAmountTxt = amountExceedThPaidAmount.getText();
        Assert.assertEquals(amountExceedsPaidAmountTxt,"Amount Exceeds the Paid Amount");
//        utils.log().info("Displayed Popup as - "+amountExceedsPaidAmountTxt);
    }

    @FindBy(xpath = "//span[.='C']")
    WebElement cBtn;
    public void enterTheHugeValueThanTheRefundValue(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement amountRefund = (WebElement) driver.findElement(By.xpath("//span[contains(@class,'refundReason-amt')]"));
        String amountRefundTxt = amountRefund.getText();
        String amountREfundTxt11 = amountRefundTxt.replaceAll("[A-Z$,. ]","");
//        utils.log().info("amountREfundTxt11  - "+amountREfundTxt11 );
        int countREfundValue = Integer.parseInt(amountREfundTxt11);
        int refundTotalCount1 =countREfundValue+1000;
        String refundTotalCount21 = String.valueOf(refundTotalCount1);
//        utils.log().info("refundTotalCount21 - "+refundTotalCount21);
        elementClick(cBtn,"Tapped C ");
        for(int i =0;i<refundTotalCount21.length();i++) {
            char letter = refundTotalCount21.charAt(i);
            String let = String.valueOf(letter);
            utils.log().info("vale - " + let);
            WebElement enterTheAmount = (WebElement) driver.findElement(By.xpath("//ion-col[contains(@class,'refund-numberpad-grid')]//button//span[contains(.,'"+let+"')]"));
            elementClick(enterTheAmount,"Selected - "+enterTheAmount.getText());
        }
        reasonTextView.sendKeys("Refund");
    }

    public void enterTheSameValueOfTheRefundValue(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        elementClick(cBtn,"Tapped C ");
        String refundAmountTxt = TestUtils.refundAmountTxt;
        String refundAmountTxt1 =  refundAmountTxt.replaceAll("[A-Z$,. ]","");
        for(int i =0;i<refundAmountTxt1.length();i++) {
            char letter = refundAmountTxt1.charAt(i);
            String let = String.valueOf(letter);
//            utils.log().info("vale - " + let);
            WebElement enterTheAmount = (WebElement) driver.findElement(By.xpath("//ion-col[contains(@class,'refund-numberpad-grid')]//button//span[contains(.,'"+let+"')]"));
            elementClick(enterTheAmount,"Selected - "+enterTheAmount.getText());
        }
        reasonTextView.sendKeys("Refund");
    }

    @FindBy(xpath = "//linga-icon[@symbol='refundPrint']")
    WebElement refundWithoutReceipt;
    public void clickRefundWithoutReceiptButton(){
        elementClick(refundWithoutReceipt,"Selected button as - "+refundWithoutReceipt.getText());
    }

   public void verifyNumberPadHasZero(String number){
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement tyepField = (WebElement) driver.findElement(By.xpath("//input[contains(@class,'control inputrow')]"));
           String typeFieldTxt = (tyepField.getAttribute("value")).replaceAll("[A-Z$,. ]","");
           String zeroValue = number.replaceAll("[A-Z$,. ]","");
           Assert.assertEquals(typeFieldTxt,zeroValue);
//          utils.log().info("Default number field has Zer0 - "+number);
    }

    public void enterTheAmount(String value){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        for(int i =0; i<value.length();i++) {
            char valu = value.charAt(i);
            WebElement refundAmount = (WebElement) driver.findElement(By.xpath("//ion-col[contains(@class,'refund-numberpad-grid')]//button//span[contains(.,'"+valu+"')]"));
            elementClick(refundAmount,"Enter the Amount - "+refundAmount.getText());
        }
    }

    public void enterTheRefundReason(String reason){
        reasonTextView.sendKeys(reason);
    }

    @FindBy(xpath = "//linga-icon[@symbol='refundItem']")
    WebElement refundMenuItemsBtn;
    public void clickRefundMenuItemsBtn(){
    elementClick(refundMenuItemsBtn,"Selected - "+refundMenuItemsBtn.getText());
    }
    @FindBy(xpath = "//p[.='Please select the check']")
    WebElement pleaseSelectTheCheckTxt;
    public void verifyPleaseSelectCheckPopup(){
        Assert.assertEquals(pleaseSelectTheCheckTxt.getText(),"Please select the check");
//        utils.log().info("Displayed popup as - "+"Please select the check");
    }

    public void verifyRefundCheckNumberWithOrderScreenCheckNumber(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        String globalCheckNumber = TestUtils.globalCheckNumber;
        WebElement refundCheckNumber = driver.findElement(By.xpath("//p[@class='order-header-checkno']"));
        String refundCheckNumberTxt = refundCheckNumber.getText();
//        utils.log().info("REfund menu items Check number - "+refundCheckNumberTxt);
        String refundCheckNumberTxt1 = refundCheckNumberTxt.replaceAll("[A-Z]","");
        Assert.assertEquals(refundCheckNumberTxt1,globalCheckNumber);
//        utils.log().info("Check Number - "+globalCheckNumber+" REfund Check Number - "+refundCheckNumberTxt);

    }

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Refund Check\"]")
    WebElement refundCheckBtn;
    public void clickRefundCheckBtn(){
        elementClick(refundCheckBtn,"Selected - "+refundCheckBtn.getText());
    }

    @FindBy(xpath = "//div[.='Refund Items']")
    WebElement refundItemsBtn;
    public void clickRefundItemsBtn(){
        elementClick(refundItemsBtn,"Selected - "+refundItemsBtn.getText());
    }

    public void verifyTheButtonAs(String check, String items, String done){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement check1 = (WebElement) driver.findElement(By.xpath("//div[.='Refund Check']"));
        WebElement itmes1 = (WebElement) driver.findElement(By.xpath("//div[.='Refund Items']"));
        WebElement done1 = (WebElement) driver.findElement(By.xpath("//div[.='Done']"));

        Assert.assertEquals(check1.getText(),check);
//        utils.log().info("Displayed Button as - "+check);
        Assert.assertEquals(itmes1.getText(),items);
//        utils.log().info("Displayed Button as - "+items);
        Assert.assertEquals(done1.getText(),done);
//        utils.log().info("Displayed Button as - "+done);
    }

    @FindBy(xpath = "//p[.='Check is refunded already']")
    WebElement checkIsRefundAlready;
    public void verifyCheckIsRefundedAlready(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     Assert.assertEquals(checkIsRefundAlready.getText(),"check is refunded already");
     utils.log().info("Displayed popup as - "+checkIsRefundAlready.getText());
    }

    @FindBy(xpath = "//div[.='Done']")
    WebElement refundDoneBtn;
    public void clickDoneRefundScreen(){
        elementClick(refundDoneBtn,"Selected - "+refundDoneBtn.getText());
    }


    public void clickTheMenuOnTheRefundScreen() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(300);
       WebElement menu = (WebElement) driver.findElement(By.xpath("//div[contains(@class,'orderlist-container')]//div[@class='menu-section orderlist-flex ']//div[2]"));
        String menuName = menu.getText();
        elementClick(menu,"Selected menu Name as - "+menuName);

    }
}
