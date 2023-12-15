package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;


import java.text.DecimalFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class PaymentWindow extends OrderManagementScreen{

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"1\"])[3]")
    WebElement paymentPin1;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Cash\"])[2]")
    WebElement cashPaymentBtn;

    @FindBy(name = "Yes")
    WebElement yesSendToKitchenBtn;

    @FindBy(name = "No")
    WebElement noSendToKitchenBtn;

    @FindBy(xpath = "//span[contains(.,'Payment methods')]")
    WebElement paymentWindowTitle;

    @FindBy(name = "Do you want to send hold menu item(s) to kitchen?")
    WebElement sendToKitchenPopUpTxt;

    @FindBy(name = "Hold item(s) has to be sent to kitchen")
    WebElement holdItemSendToKitchen;

    @FindBy(xpath = "//button[contains(@id,'ps_exit')]")
    WebElement exitBtn;

    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"  Adjust\"]")
    // @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Adjust\"]")
    WebElement adjustBtn;

    @FindBy (name = "Adjust")
    WebElement adjustBtnPayment;

    @FindBy (name = "OK")
    private WebElement okBtn;

    @FindBy(name = "Ok")
    private WebElement okBtnForModifier;

    @FindBy(xpath = "//ion-item-sliding[contains(@class,'ng-star-inserted md hydrated')]")
    private WebElement selectPaymentBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
    private WebElement selectPaymentBtn1;

    @FindBy(xpath = "//button[contains(@id,'ps_delete')]")
    private WebElement deletePaymentBtn;


    @FindBy(xpath = "//button[contains(.,'Submit')]")
    private WebElement submitBtn;

    @FindBy ( xpath = "//button[contains(.,'Cash')]")
    private WebElement Cash;

    @FindBy ( xpath = "//button[contains(.,'Exact')]")
    private WebElement Exact;

    @FindBy (xpath = "//button[contains(.,'Enter')]")
    private WebElement Enter;

    @FindBy (name = "TL 100")
    private WebElement hugeAmount;

    @FindBy (name = "Change Due")
    private WebElement changeDue;

    @FindBy (name = "Select a Payment and try again!")
    private WebElement selectAPaymentAndTryAgain;

    @FindBy (name = "Balance Due")
    private WebElement balanceDue;

    @FindBy(name = "No Due")
    private WebElement noDue;

    @FindBy (name = "TL 10")
    private WebElement Tl10;

    @FindBy (name = "Linga Payment")
    private WebElement pleasePayTl;

    @FindBy (name = "Linga Payment")
    private WebElement pleasePayTl1;

    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
    WebElement taxExemptPayment;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[2]")
    WebElement addGratuityPayment;

    @FindBy(xpath = "//span[.='Payment methods']/../ion-grid/ion-row/ion-col/button/span[contains(.,' House Account ')]")
    WebElement housePaymentBtn;

    @FindBy(xpath = "//span[.='Payment methods']/../ion-grid/ion-row/ion-col/button/span[contains(.,' Credit Card ')]")
    WebElement creditCardBtn;

    @FindBy(xpath = "//span[contains(.,' No Tip ')]")
 //  @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Total\"])[1]")
    WebElement totalScreen;

    @FindBy(xpath = "//button[contains(.,' Process Payment ')]")
    WebElement continueBtn;

    @FindBy(xpath = "//ion-label[contains(.,'Your Order')]")
    WebElement yourOrder;



    @FindBy(name = "Card Type")
    WebElement cardTypeScreen;

    @FindBy(name = "Ok")
    WebElement okButtonCardTypeWindow;

    @FindBy(name = "//ion-toolbar//button[contains(.,' Manual ')]")
    WebElement manualButton;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    //  @FindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"XXXXXXXXXXXXXXXX\"`]")
    WebElement cardNumberTxtField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[1]")
    //@FindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"1218\"`]")
    WebElement expireNumTxtField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[2]")
    // @FindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"XXXX\"`]")
    WebElement cvvTxtField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[3]")
    // @FindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"XXXXX\"`]")
    WebElement zipCodeTxtField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    // @FindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"John Smith\"`]")
    WebElement cardNameField;

    @FindBy(name = "Signature Pad")
    WebElement signaturePadScreen;

    @FindBy(xpath = "//p[contains(.,'$ 10.00')]")
    WebElement tipAs10;

    @FindBy(name = "Finish")
    WebElement finishBtn;

    @FindBy(xpath = "//span[contains(.,' Custom Tip ')]")
    WebElement customTL;

    @FindBy(name = "Apply Tip")
    WebElement applyTipBtn;

    @FindBy(name = "Transaction Void Successful")
    WebElement transactionVoidSuccess;

    @FindBy(xpath = "//span[.='Payment methods']/../ion-grid/ion-row/ion-col/button/span[contains(.,' Side CC ')]")
    WebElement cCSideBtn;

    @FindBy(xpath = "//span[.='Payment methods']/../ion-grid/ion-row/ion-col/button/span[contains(.,' Others ')]")
    WebElement otherBtn;

    @FindBy(name = "NMI")
    WebElement nMIPaymentBtn;

    @FindBy(name = "No NMI Save Card(s) Available For Walkin")
    WebElement noNmiSaveCardText;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
    WebElement selectCard;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    WebElement selectCard1;

    //@FindBy(name = "Choose Card")
    @FindBy(name = "Choose Card")
    WebElement chooseCardTxt;

    @FindBy(name = "Pay")
    WebElement payBtn;

    @FindBy(name = "Gift Card")
    WebElement giftCardPayment;

//    public PaymentWindow() {
//        super(driver);
//    }


    public String getPaymentWindowTitle(){
        return elementGetText(paymentWindowTitle, "Payment window title is -");
    }

    public void selectCashPayment(){
        elementClick(cashPaymentBtn, "Cash Payment is selected" );
    }

    public String getSendToKitchenPopUpTxt(){
        return elementGetText(sendToKitchenPopUpTxt, "Send to kitchen pop-up text is-");
    }

    public void pressYesSendToKitchen(){
        elementClick(yesSendToKitchenBtn, "Order is sent to kitchen" );
    }

    public void pressNoSendToKitchen(){
        elementClick(noSendToKitchenBtn, "Order is not sent to kitchen" );
    }

    public void pressExit(){ elementClick(exitBtn, "Exit button is tapped" ); }

    public void selectPayment(){ elementClick(selectPaymentBtn, "Payment  selected"); }

    public void selectPayment1(){elementClick(selectPaymentBtn1,"Payment selected ");}

    public void pressDeletePaymentBtn(){
        elementClick(deletePaymentBtn, "Delete button tapped to delete the payment");
    }

    public void pressOkToClosePrinterWarningPopUp(){
        elementClick(okBtn, "Tapped OK to close the printer warning pop-up");
    }

    public void pressSubmitBtn() throws InterruptedException {
        Thread.sleep(500);
        elementClick(submitBtn, "Submit button is tapped" );
    }

    public void pressCashBtn(){ elementClick(Cash,"Tapped Cash button for Close Sale");}

    public void pressExact(){ elementClick(Exact,"Tapped Exact button ");}

    public void pressEnter(){ elementClick(Enter,"Tapped Enter for Finish Sale"); }

    public void pressTL100(){elementClick(hugeAmount,"Tapped TL100 for Complete Sale");}

    public void pressOKBtnPopup() {
        driver.manage().timeouts().implicitlyWait(17,TimeUnit.SECONDS);
        try {
            elementClick(okBtn, "Tapped Ok Button on the Popup");
        } catch (Exception e) {
        }
    }

    public void pressAdjustBtn(){elementClick(adjustBtn,"Tapped Adjust button ");}

    public void pressOkButton(){elementClick(okBtnForModifier,"Tapped Ok Button");}



    public void verifyCashGotDel(){
        if(find(selectPaymentBtn,1)){
            utils.log().info("Payment is not Deleted");
        }else{
            utils.log().info("Payment Got deleted");
        }
    }

    public String getSelectAnyPaymentAndTryAgainMsg(){
        return elementGetText(selectAPaymentAndTryAgain,"Select a Payment and try Again text is displayed - ");
    }

    public String getChangeDueMsg(){
        return elementGetText(changeDue,"Change Due text is Displayed - ");
    }

    public void verifyBalanceDue(){
        if(balanceDue.isDisplayed()){
            utils.log().info("Balance Due field is visible");
        }else{
            utils.log().info("Balance Due is not visible");
        }
    }
    public void verifyNoDue(){
        if (noDue.isDisplayed()){
            utils.log().info("No due field is visible");
        }else {
            utils.log().info("No due is not visible");
        }
    }
    public void pressTl10(){
        elementClick(Tl10,"Tapped TL 10 Button");
    }

    public String getPleasePayAmountMsg1(){
        return elementGetText(pleasePayTl1,"Please pay text is displayed");
    }

    public String getPleasePayAmountMsg(){
        return elementGetText(pleasePayTl,"Please pay text is displayed");
    }

    public String getHoldItemHasToSentToKitchen(){
        return elementGetText(holdItemSendToKitchen,"Hold item has to send to kitchen txt is displayed - ");
    }

    public void pressTaxExemptFromPaymentScreen(){
        elementClick(taxExemptPayment,"Tapped Tax Exempt Button");
    }

    public void addGratuityPaymentWindow(){
        elementClick(addGratuityPayment,"Tapped Add Gratuity from Payment Screen");
    }

    public void clickHousePaymentBtn() throws Exception {
        try {
            if(find(housePaymentBtn,2)){
                elementClick(housePaymentBtn, "Tapped credit card Payment");
            }else {
                scrollToElementPayments(housePaymentBtn, "up");
                elementClick(housePaymentBtn, "Tapped credit card Payment");
            }
        }catch (Exception w){
            scrollToElementPayments(housePaymentBtn, "down");
            elementClick(housePaymentBtn, "Tapped credit card Payment");
        }
        //  elementClick(housePaymentBtn,"Tapped House Payment");
    }

    public void verifyTotalScreen() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Thread.sleep(1000);
        if(totalScreen.isDisplayed()){
            Assert.assertEquals(totalScreen.getText(),"No Tip");
            utils.log().info("Should see Total screen - "+"No Tip");
        }else {
            utils.log().info("Total Screen is not displayed");
        }
    }

    public void clickContinueBtn() throws InterruptedException {
        Thread.sleep(1000);

        elementClick(continueBtn,"Tapped Continue Button");
    }

    public String verifyYourOrder() throws InterruptedException {
        Thread.sleep(5000);
        return elementGetText(yourOrder,"your order screen is displayed - ");
    }



    public void clickCreditCardBtn() throws Exception {
        try {
            if(find(creditCardBtn,2)){
                elementClick(creditCardBtn, "Tapped credit card Payment");
            }else {
                scrollToElementPayments(creditCardBtn, "up");
                elementClick(creditCardBtn, "Tapped credit card Payment");
            }
        }catch (Exception w){
            scrollToElementPayments(creditCardBtn, "down");
            elementClick(creditCardBtn, "Tapped credit card Payment");
        }
        // click(nMIPaymentBtn,"Tapped NMI Payment button");
        //elementClick(creditCardBtn,"Tapped credit card Button");
    }

    public String verifyCardTypeScreen(){
        return elementGetText(cardTypeScreen,"Card screen is displayed - ");
    }

    public void iShouldNotSeeCardTypeScreen(){
        try {
            if (cardTypeScreen.isDisplayed()){
                utils.log().info("Card Type screen is Displayed");
                int h = 1/0;
            }else{
                utils.log().info("Card Type screen is NOT Displayed");
            }
        }catch (Exception w){

        }
    }

    public void clickCardType(String name){
        WebElement e2=mergeAndFindElement(name,"", TestUtils.Accessibility);
        elementClick(e2,name +" Tapped Visa Button");
    }

    public void clickOkButton(){ elementClick(okButtonCardTypeWindow,"Tapped Ok Button"); }

    public void clickManualButton(){ elementClick(manualButton,"Tapped Manual Button"); }

    public void passCardNumber(String Number){
        cardNumberTxtField.sendKeys(Number);
        TestUtils.cardNumber = Number;
        cardNumberTxtField.sendKeys(Keys.ENTER);
    }
    public void passCardNumber1(String Number){
        cardNumberTxtField.sendKeys(Number);
        TestUtils.cardNumber = Number;
        cardNumberTxtField.sendKeys(Keys.ENTER);
    }

    public void passGiftCardNumber(String Number){
        cardNumberTxtField.sendKeys(Number);
        cardNumberTxtField.sendKeys(Keys.ENTER);
    }

    public void passExpireNumber(String number){
        expireNumTxtField.sendKeys(number);
        expireNumTxtField.sendKeys(Keys.ENTER);

        cvvTxtField.sendKeys(Keys.ENTER);

        zipCodeTxtField.sendKeys(Keys.ENTER);
    }

    public void passCardName(String card){
        cardNameField.sendKeys(card);
        TestUtils.cardName = card;
        cardNameField.sendKeys(Keys.ENTER);
    }

    public String verifySignaturePad(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return getText(signaturePadScreen,"Screen Is displayed - ");
    }


    public void clickTipAs10(){
        elementClick(tipAs10,"Tapped tip As 10");
    }

    public void clickTickIcon(){
        elementClick(finishBtn,"Tapped Finish button");
    }

    public void verifyTipAdded(String num){
        WebElement tip=driver.findElement(By.xpath("//ion-title[contains(.,' "+num+" + $ 10.00')]"));
        if (tip.isDisplayed()){
            utils.log().info("Tip is added with menu total");
        }else {
            utils.log().info("Tip is not added with menu total");

        }
    }

    public void shouldSeeTipAddedOnOrderScreen(){
        WebElement tipAmount=mergeAndFindElement("//XCUIElementTypeStaticText[@name=\"TL 10,00\"]","",TestUtils.XPath);
        if(tipAmount.isDisplayed()){
            utils.log().info("Tip is Displayed");
        }else {
            utils.log().info("Tip is not displayed");
        }
    }

    public void selectCustomTipAdjust(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        elementClick(customTL,"Tapped Custom Tl Button");
        elementClick("//ion-col[@class='quantity_grid-row-col md hydrated']//span[contains(.,'1')]","1 Tapped");
        elementClick("//ion-col[@class='quantity_grid-row-col md hydrated']//span[contains(.,'0')]","0 Tapped");
        elementClick("//ion-col[@class='quantity_grid-row-col ng-star-inserted md hydrated']//span[contains(.,'00')]","00 Tapped");
        elementClick("//span[contains(.,' Continue ')]","Tapped Apply Tip");
    }
//    public void selectCustomTipAdjust(){       //Nov 16
//        elementClick(customTL,"Tapped Custom Tl Button");
//        elementClick(pin1,"Tapped Pin 1");
//        elementClick(pin0,"Tapped Pin 0");
//        elementClick(pin00,"Tapped Pin 00");
//
//        elementClick(applyTipBtn,"Tapped Apply Tip");
//    }

    public void verifyTotalValue(String value){
        WebElement total=driver.findElement(By.xpath("//p[@class='main ion-text-center']"));
        if(total.isDisplayed()){
            utils.log().info("Total value is displayed - "+total.getText());
            Assert.assertEquals(total.getText(),value);
        }else {
            utils.log().info("Total value is not displayed - "+value);
        }
    }

    public void verifyTransactionVoidSuccess(){
        try {
            if(transactionVoidSuccess.isDisplayed()){
                utils.log().info("Transaction void successful popup is displayed");
            }else {}
        }
        catch (Exception e){
            utils.log().info("Transaction void successful is not displayed");
        }
    }

//    public void clickSideCCBtn(){
//        elementClick(cCSideBtn,"Tapped Side CC Button");
//    }
//
//    public void clickOtherBtn(){
//        elementClick(otherBtn,"Tapped others button");
//    }
//
//    public void clickNmiPayment() throws Exception {
//       // swipe(565, 332, 565, 246, 50);
//        scrollToElementPayments(nMIPaymentBtn,"up");
//        elementClick(nMIPaymentBtn,"Tapped NMI Payment");
//           // click(nMIPaymentBtn,"Tapped NMI Payment button");
//    }

    public String verifyNoNMIPopup(){
        return elementGetText(noNmiSaveCardText,"Popup txt is displayed - ");
    }

    public String verifyChooseCard(){
        return elementGetText(chooseCardTxt,"Choose card window is displayed - ");
    }

    public void selectCardInWindow(){ elementClick(selectCard,"Tapped credit card"); }

    public void selectCardInWindow1(){
        WebElement selectCard1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]"));
        elementClick(selectCard1,"Tapped credit card");
    }

    public void clickPayBtn(){elementClick(payBtn,"Tapped Pay Button");}

    public void verifyServiceCharge(String value){
        WebElement e1=mergeAndFindElement(value,"",TestUtils.Accessibility);
        if(find(e1,3)){
            utils.log().info("Service charge is - "+value);
        }else{
            utils.log().info("Service charge is not applied");
        }
    }

    public void verifyAppliedCash(String cash){
        WebElement price = mergeAndFindElement(cash,"",TestUtils.Accessibility);
        if (price.isDisplayed()){
            utils.log().info("Payment is Applied as - "+cash);
        }else {
            utils.log().info("Different payment is applied");
        }
    }

    public void TappedGiftCardPayment() throws Exception {
        try {
            if(find(giftCardPayment,2)){
                elementClick(giftCardPayment,"Tapped Gift Card Payment");
            }else {
                scrollToElementPayments(giftCardPayment, "up");
                elementClick(giftCardPayment,"Tapped Gift Card Payment");
            }
        }catch (Exception w){
            scrollToElementPayments(giftCardPayment, "down");
            elementClick(giftCardPayment,"Tapped Gift Card Payment");
        }
    }

    public void clickLoyalty(){
        WebElement loyalPayment=mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]//XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]","",TestUtils.XPath);
        String payment=loyalPayment.getText();
        elementClick(loyalPayment,"Tapped Loyalty Payment - "+ payment);

    }

    public String verifyLoyaltyBalanceInPaymentWindow() throws InterruptedException {
        Thread.sleep(1000);
        WebElement loyalPayment=(WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]//XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
        String payment=loyalPayment.getText();
        return payment;
    }

    public void clickSideCCBtn() throws Exception {
        Thread.sleep(1000);
//        try {
//            if (find(cCSideBtn, 2)) {
//                elementClick(cCSideBtn, "Tapped Side CC Button");
//            } else {
//                scrollToElementPayments(cCSideBtn, "up");
//                elementClick(cCSideBtn, "Tapped Side CC Button");
//            }
//        } catch (Exception e) {
//            scrollToElementPayments(cCSideBtn, "down");
            elementClick(cCSideBtn, "Tapped Side CC Button");
//        }
    }
//    public void clickOtherBtn() throws Exception {
////        try {
////            if(find(otherBtn,2)) {
////                elementClick(otherBtn, "Tapped others button");
////            }else {
////                scrollToElementPayments(otherBtn, "up");
////                elementClick(otherBtn, "Tapped others button");
////            }
////        }catch (Exception h){
////            scrollToElementPayments(otherBtn, "down");
//            elementClick(otherBtn, "Tapped others button");
////        }
//    }


//    public void clickNmiPayment() throws Exception {
//        // swipe(565, 332, 565, 246, 50);
//        try {
//            if(find(nMIPaymentBtn,2)){
//                elementClick(nMIPaymentBtn, "Tapped NMI Payment");
//            }else {
//                scrollToElementPayments(nMIPaymentBtn, "up");
//                elementClick(nMIPaymentBtn, "Tapped NMI Payment");
//            }
//        }catch (Exception w){
//            scrollToElementPayments(nMIPaymentBtn, "down");
//            elementClick(nMIPaymentBtn, "Tapped NMI Payment");
//        }
//        // click(nMIPaymentBtn,"Tapped NMI Payment button");
//    }

    public void pressAdjustBtnForPayment(){
        elementClick(adjustBtnPayment,"Tapped Adjust button");
    }

    public void clickOtherBtn() throws Exception {
        Thread.sleep(1000);
//        try {
//            if(find(otherBtn,2)) {
                elementClick(otherBtn, "Tapped others button");
//            }else {
//                scrollToElementPayments(otherBtn, "up");
////                listScroller("Others",636,175,636,343,5000);
////                listScroller("Others",636,343,636,175,5000);
//                elementClick(otherBtn, "Tapped others button");
//            }
//        }catch (Exception h){
//            scrollToElementPayments(otherBtn, "down");
////            listScroller("Others",636,343,636,175,5000);
//            elementClick(otherBtn, "Tapped others button");
//        }
    }
    public void clickNmiPayment() throws Exception {
        // swipe(565, 332, 565, 246, 50);
        try {
            if(find(nMIPaymentBtn,2)){
                elementClick(nMIPaymentBtn, "Tapped NMI Payment");
            }else {
                scrollToElementPayments(nMIPaymentBtn, "up");
               // listScroller("Others",636,175,636,343,5000);
                elementClick(nMIPaymentBtn, "Tapped NMI Payment");
            }
        }catch (Exception w){
            scrollToElementPayments(nMIPaymentBtn, "down");
           // listScroller("Others",636,343,636,175,5000);
            elementClick(nMIPaymentBtn, "Tapped NMI Payment");
        }
        // click(nMIPaymentBtn,"Tapped NMI Payment button");
    }

    @FindBy(name = "Seems like device is offline Do you want to do offline transaction")
    WebElement offlinePopup;

    public void verifyOfflinePopup(){
        if(find(offlinePopup,2))
        {
            utils.log().info("Offline Popup is displayed ");
        }else{
            utils.log().info("Offline Popup is NOT displayed ");
        }
    }



    @FindBy(name = "MPPG Auth")
    WebElement mppgAuth;
    public void clickMppgPayment() throws Exception {
        try {
            if (find(mppgAuth, 2)) {
                elementClick(mppgAuth, "Tapped Side CC Button");
            } else {
                scrollToElementPayments(mppgAuth, "up");
                elementClick(mppgAuth, "Tapped Side CC Button");
            }
        } catch (Exception e) {
            scrollToElementPayments(mppgAuth, "down");
            elementClick(mppgAuth, "Tapped Side CC Button");
        }
    }

    public void verifyTheNoDueAsZeroOnThePayment(){
        WebElement noDue = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        Assert.assertEquals(noDue.getText().replaceAll("[$ ]",""),"0.00");
        utils.log().info("No DUE is Displayed");
    }

    public void clickPaidAmountOnThePaymentScreen(){
        WebElement paidAmount = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]"));
        elementClick(paidAmount,"First Paid Amount");
    }

    public String tipss =" ";
    public void tipAddedInTipScreen(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement tip_From_Tip_Screen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[6]"));
        String tipss1 =  tip_From_Tip_Screen.getText();
        tipss = tipss1.replaceAll("[A-Z ]","");
        TestUtils.tips = tipss;
        utils.log().info("Tip Screen Amount with TIP - "+tipss);

    }
    public void verifyAddedTipIsSameWithPaymentScreen(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement tip_Payment = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[3]"));
//<<<<<<< HEAD
        String tipAmount = (tip_Payment.getText()).replaceAll("[A-Z ]","");
        Assert.assertEquals(TestUtils.tips,tipAmount);
        utils.log().info("Tips are same in Both Tip screen and Payment screen - "+tipAmount);

    }

    public void pressExitBtn(){
        elementClick(exitPreAuth,"Exit Button is tapped");
    }
    @FindBy(xpath = "//span[contains(.,'Exit')]")
    WebElement exitPreAuth;
    @FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]")
    private WebElement firstNameFld;

    @FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[2]")
    private WebElement lastNameFld;

    @FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[5]")
    private WebElement mobileNumberFld;

    @FindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[7]")
    private WebElement mailNameFld;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Add\"])[1]")
    private WebElement addMobileNumber;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Save\"])[1]")
    private WebElement saveMobileNumber;

    @FindBy(xpath =  "//XCUIElementTypeButton[@name=\"Save\"]")
    private WebElement saveBtn;

    @FindBy(name = "New Customer")
    private WebElement addCustomerToTableBtn;

    public void enterTheCustomerNameRandomly(){
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        String name = RandomStringUtils.randomAlphabetic(6);
        sendKeys(firstNameFld, name);
        utils.log().info("First Name - " + name);

        String name1 = RandomStringUtils.randomAlphabetic(5);
        sendKeys(lastNameFld, name1);
        utils.log().info("Last name - " + name1);

        String number = RandomStringUtils.randomNumeric(10);
        utils.log().info("Mobile Number - " + number);

        elementClick(addMobileNumber, "Tapped Add button for Enter Mobile Number");
        sendKeys(mobileNumberFld, number);
        elementClick(saveMobileNumber, "Tapped Save button");

        elementClick(saveBtn, "Tapped Save");

        elementClick(addCustomerToTableBtn, "Add cutoemr button");

        WebElement removeBtn1 = (WebElement) driver.findElements(By.xpath("Remove"));
        elementClick(removeBtn1, "Remove button");

    }

    public void enterTheAbove150WordsOnTheCustomerNotes(){
        WebElement customerNotes = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView"));
        String name = RandomStringUtils.randomAlphabetic(150);
        sendKeys(customerNotes, name);
        TestUtils.customerNotes = name;
    }

    @FindBy(xpath ="//*[@name=\"Hide keyboard\"]")
    private WebElement hideKeyboardButton;

    public void enterTheCustomerNameRandomly1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        String name = RandomStringUtils.randomAlphabetic(6);
        sendKeys(firstNameFld, name);
        utils.log().info("First Name - " + name);
        TestUtils.firstNameCustomer=name;

        String name1 = RandomStringUtils.randomAlphabetic(5);
        sendKeys(lastNameFld, name1);
        utils.log().info("Last name - " + name1);
        TestUtils.lastNameCustomer=name1;

        String number = RandomStringUtils.randomNumeric(10);
        utils.log().info("Mobile Number - " + number);
        TestUtils.MobileNumber = number;
        elementClick(addMobileNumber, "Tapped Add button for Enter Mobile Number");
        sendKeys(mobileNumberFld, number);
        elementClick(saveMobileNumber, "Tapped Save button");

        WebElement addAddress = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Add\"])[2]"));
        elementClick(addAddress,"Selected Add ");

        WebElement AddAddress = (WebElement) driver.findElements(By.xpath("Add Address"));
        Assert.assertEquals(AddAddress.getText(),"Add Address");

        WebElement enterAddress = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeButton[@name=\"Enter Address\"]"));
        elementClick(enterAddress,"Selected Enter Address");

        Thread.sleep(2000);

        WebElement addres1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        sendKeys(addres1,"iajfh");

        WebElement addres5 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[5]"));
        sendKeys(addres5,"834848");

        elementClick(hideKeyboardButton, "Keyboard hidden.");

        WebElement saveBtn = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Save\"])[2]"));
        elementClick(saveBtn,"Selected Save Btn");


    }

    public void enterCustomerRandomlys(){
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        String name = RandomStringUtils.randomAlphabetic(6);
        sendKeys(firstNameFld, name);
        utils.log().info("First Name - " + name);
        TestUtils.firstNameCustomer=name;

        String name1 = RandomStringUtils.randomAlphabetic(5);
        sendKeys(lastNameFld, name1);
        utils.log().info("Last name - " + name1);
        TestUtils.lastNameCustomer=name1;

        String number = RandomStringUtils.randomNumeric(10);
        utils.log().info("Mobile Number - " + number);
        TestUtils.MobileNumber = number;
        elementClick(addMobileNumber, "Tapped Add button for Enter Mobile Number");
        sendKeys(mobileNumberFld, number);
        elementClick(saveMobileNumber, "Tapped Save button");

    }

    public void verifyCustomerDetails(){
        Assert.assertEquals(firstNameFld.getText(),TestUtils.firstNameCustomer);
        utils.log().info("First Name - "+firstNameFld.getText());

        Assert.assertEquals(lastNameFld.getText(),TestUtils.lastNameCustomer);
        utils.log().info("Last Name - "+lastNameFld.getText());

        Assert.assertEquals(mobileNumberFld.getText(),TestUtils.MobileNumber);
        utils.log().info("Mobile Number - "+mobileNumberFld.getText());

        WebElement customerNotes = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView"));

        Assert.assertEquals(customerNotes.getText(),TestUtils.customerNotes);
        utils.log().info("Customer notes - "+customerNotes.getText());


    }

    public void selectCategory(String catee) throws Exception {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        pressArrowDown2();
        Thread.sleep(1500);
//        categorySelection(catee);

//        scrollToElementPayments("up");
//        findandclick(catee,"",TestUtils.Accessibility);
        WebElement cate1 = (WebElement) driver.findElements(By.xpath(catee));
        Thread.sleep(1500);
        elementClick(cate1," Selected Category as - "+catee);

    }

    @FindBy(name = "Uzumaki")
    WebElement uzumakiBtn;
    public void selectUzumakiCategory() throws Exception {

pressArrowDown2();
Thread.sleep(1500);
            try {
                if (find(uzumakiBtn, 2)) {
                    elementClick(uzumakiBtn, "Tapped Side CC Button");
                } else {
                    scrollToElementPayments(uzumakiBtn, "up");
                    elementClick(uzumakiBtn, "Tapped Side CC Button");
                }
            } catch (Exception e) {
                scrollToElementPayments(uzumakiBtn, "down");
                elementClick(uzumakiBtn, "Tapped Side CC Button");
            }
        }

    public void selectCategory1(String catee) throws Exception {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        pressArrowDown2();
        categorySelection(catee);

//        scrollToElementPayments("up");
////        findandclick(catee,"",TestUtils.Accessibility);
//        WebElement cate1 = (WebElement) driver.findElements(By.xpath()(catee);
//        elementClick(cate1," Selected Category as - "+catee);

    }

    public void selectCustomerBasic(){
        WebElement customerName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]"));
        String nameTxt = customerName.getText();
        elementClick(customerName,"Selected customer as - "+nameTxt);

    }

    public void verifyValueWithOrderSummaryScreen(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement subtotal = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String subtotalTxtOrderSummary = subtotal.getText().replaceAll(" ","");
        Assert.assertEquals(subtotalTxtOrderSummary,TestUtils.subtotalTxt);
        utils.log().info("Subtotal is SAME with Order summary - "+subtotalTxtOrderSummary);

        WebElement tax = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
         String taxOrderSummary = tax.getText().replaceAll(" ","");
         Assert.assertEquals(taxOrderSummary,TestUtils.taxTxt);
        utils.log().info("Tax is SAME with Order summary - "+taxOrderSummary);

         WebElement total = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
         String totalOrderSummary = total.getText().replaceAll(" ","");
         Assert.assertEquals(totalOrderSummary, TestUtils.cashOptionOrderScreen);
        utils.log().info("Total is SAME with Order summary - "+totalOrderSummary);
    }

    public void verifyValueWithOrderSummaryScreen1(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement subtotal = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String subtotalTxtOrderSummary = subtotal.getText().replaceAll(" ","");
        Assert.assertEquals(subtotalTxtOrderSummary,TestUtils.subtotalTxt1);
        utils.log().info("Subtotal is SAME with Order summary - "+subtotalTxtOrderSummary);

        WebElement tax = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String taxOrderSummary = tax.getText().replaceAll(" ","");
        Assert.assertEquals(taxOrderSummary,TestUtils.taxTxt1);
        utils.log().info("Tax is SAME with Order summary - "+taxOrderSummary);

        WebElement total = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalOrderSummary = total.getText().replaceAll(" ","");
        Assert.assertEquals(totalOrderSummary, TestUtils.cashOptionOrderScreen1);
        utils.log().info("Total is SAME with Order summary - "+totalOrderSummary);
    }

    public void verifyTheTotalValueWithDigitalPrinterScreen(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
                                                                                               //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]
        WebElement totalOfDigitalScreen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        String totalOfDigitalScreen1 = (totalOfDigitalScreen.getText()).replaceAll("[A-Za-z$ ]","");
        String ActualTotalOfOrderScreen = (TestUtils.cashOptionOrderScreen).replaceAll("[A-Z$ ]","");
        Assert.assertEquals(totalOfDigitalScreen1,ActualTotalOfOrderScreen);
        utils.log().info("Total Value is Same with the Digital Receipt Screen - "+totalOfDigitalScreen1);
    }

    public void verifyTheCashPriceValueWithDigitalReceiptScreen(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
         WebElement totalOfDigitalScreen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        String totalOfDigitalScreen1 = (totalOfDigitalScreen.getText()).replaceAll("[A-Za-z$ ]","");
        String ActualTotalOfOrderScreen = (TestUtils.cashOptionOrderScreen).replaceAll("[A-Z$ ]","");
        utils.log().info(totalOfDigitalScreen1);
        Assert.assertEquals(totalOfDigitalScreen1,ActualTotalOfOrderScreen);
        utils.log().info("Cash Price Value is Same with the Digital Receipt Screen - "+totalOfDigitalScreen1);
    }


    public void verifyTheCashPrice1ValueWithDigitalReceiptScreen(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement totalOfDigitalScreen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        String totalOfDigitalScreen1 = (totalOfDigitalScreen.getText()).replaceAll("[A-Za-z$ ]","");
        String ActualTotalOfOrderScreen = (TestUtils.cashOptionOrderScreen).replaceAll("[A-Z$ ]","");
        utils.log().info(totalOfDigitalScreen1);
        Assert.assertEquals(totalOfDigitalScreen1,ActualTotalOfOrderScreen);
        utils.log().info("Cash Price Value is Same with the Digital Receipt Screen - "+totalOfDigitalScreen1);
    }

    public void verifyTheTotalValueWithDigitalPrinterScreen1(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        WebElement totalOfDigitalScreen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        String totalOfDigitalScreen1 = (totalOfDigitalScreen.getText()).replaceAll("[A-Za-z$ ]","");
        String ActualTotalOfOrderScreen = (TestUtils.totalTxt1).replaceAll("[A-Z$ ]","");
        Assert.assertEquals(totalOfDigitalScreen1,ActualTotalOfOrderScreen);
        utils.log().info("Total Value is Same with the Digital Receipt Screen - "+totalOfDigitalScreen1);
    }

    public void verifyTheTotalValueWithDigitalPrinterScreen4(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement totalOfDigitalScreen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        String totalOfDigitalScreen1 = (totalOfDigitalScreen.getText()).replaceAll("[A-Za-z$ ]","");
        utils.log().info(totalOfDigitalScreen1);
        String ActualTotalOfOrderScreen = (TestUtils.payAmount).replaceAll("[A-Z$ ]","");
        Assert.assertEquals(totalOfDigitalScreen1,ActualTotalOfOrderScreen);
        utils.log().info("Total Value is Same with the Digital Receipt Screen - "+totalOfDigitalScreen1);
    }

    public void verifyTheTotalValueWithDigitalPrinterScreen5(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement totalOfDigitalScreen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        String totalOfDigitalScreen1 = (totalOfDigitalScreen.getText()).replaceAll("[A-Za-z$ ]","");
        utils.log().info(totalOfDigitalScreen1);
        double paidAmount = Double.parseDouble(TestUtils.paidAmount1.replaceAll("[$ ]",""));
        double ActualTotalOfOrderScreen = Double.parseDouble((TestUtils.payAmount).replaceAll("[A-Z$ ]","")) + paidAmount;
        Assert.assertEquals(totalOfDigitalScreen1,String.valueOf(ActualTotalOfOrderScreen));
        utils.log().info("Total Value is Same with the Digital Receipt Screen - "+totalOfDigitalScreen1);
    }

    public void verifyTheTotalValueWithDigitalPrinterScreen2(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        WebElement totalOfDigitalScreen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        String totalOfDigitalScreen1 = (totalOfDigitalScreen.getText()).replaceAll("[A-Za-z$ ]","");
        String ActualTotalOfOrderScreen = (TestUtils.cashOptionOrderScreen).replaceAll("[A-Z$ ]","");
        Assert.assertEquals(ActualTotalOfOrderScreen,totalOfDigitalScreen1);
        utils.log().info("Total Value is Same with the Digital Receipt Screen - "+totalOfDigitalScreen1);
    }

    public void verifyTheTotalValueWithDigitalPrinterScreenForCashReward(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        WebElement totalOfDigitalScreen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        String totalOfDigitalScreen1 = (totalOfDigitalScreen.getText()).replaceAll("[A-Za-z$ ]","");
        String ActualTotalOfOrderScreen = (TestUtils.paidAmount).replaceAll("[A-Z$ ]","");
        Assert.assertEquals(totalOfDigitalScreen1,ActualTotalOfOrderScreen);
        utils.log().info("Total Value is Same with the Digital Receipt Screen - "+totalOfDigitalScreen1);
    }

    public void verifyTheTotalValueWithDigitalPrinterScreen3(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        WebElement totalOfDigitalScreen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        String totalOfDigitalScreen1 = (totalOfDigitalScreen.getText()).replaceAll("[A-Za-z$ ]","");
        String ActualTotalOfOrderScreen = (TestUtils.totalTxt1).replaceAll("[A-Z$ ]","");
        Assert.assertEquals(totalOfDigitalScreen1,ActualTotalOfOrderScreen);
        utils.log().info("Total Value is Same with the Digital Receipt Screen - "+totalOfDigitalScreen1);
    }

    public void verifyThePaidAmountWithTotalAmount(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement paidAmount = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[3]"));
         String paidAmountTxt = (paidAmount.getText()).replaceAll("A-Z$ ","");
         String ExpectedPaidAmount = (TestUtils.totalTxt).replaceAll("A-Z$ ","");
         Assert.assertEquals(paidAmountTxt,ExpectedPaidAmount);
         utils.log().info("Total is Same with Paid AMount - "+paidAmountTxt);
    }

    public void getThePaidAmountValueInThePaymentWindow(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement paidAmount = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[3]"));
        String paidAmountTxt = (paidAmount.getText()).replaceAll("A-Z$ ","");
        TestUtils.paidAmount=paidAmountTxt;
        utils.log().info("Total is Same with Paid AMount - "+paidAmountTxt);
    }

    public void verifyCashPriceValueWithFastCashValue(){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        WebElement fastCash = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText"));
        String actualFastCash = fastCash.getText();
        Assert.assertEquals(TestUtils.cashOptionOrderScreen.replaceAll("[$ ]",""),actualFastCash.replaceAll("[$ ]",""));
        WebElement total = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]"));
        String actualTotal = total.getText();
        Assert.assertEquals(TestUtils.cashOptionOrderScreen.replaceAll("[$ ]",""),actualTotal.replaceAll("[$ ]",""));
        WebElement balanceAmount = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField[2]"));
        String actualBalanceAmount = balanceAmount.getText();
        Assert.assertEquals(TestUtils.cashOptionOrderScreen.replaceAll("[$ ]",""),actualBalanceAmount.replaceAll("[$ ]",""));
        utils.log().info("Fast Cash Value is SAME with cash price - "+actualFastCash);
    }

    public void verifyTheFastCashValueWithTotalAmount(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        WebElement fastCash = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String actualFastCash = fastCash.getText();
        Assert.assertEquals(TestUtils.cashOptionOrderScreen.replaceAll("[$ ]",""),actualFastCash.replaceAll("[$ ]",""));
        utils.log().info("Cash value is SAME - "+actualFastCash);
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment\"]")
    private WebElement paymentBtn;

    public void verifyPartialAmountWithBalanceDueAmount(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        double paidAmount = Double.parseDouble(TestUtils.fastCash.replaceAll("[$ ]",""));
        utils.log().info("Paid Amount 1 - "+paidAmount);
        double totalAmount = Double.parseDouble(TestUtils.totalTxt.replaceAll("[$ ]",""));
        utils.log().info("Total Amount - "+totalAmount);
        double amountValue = totalAmount - paidAmount;
        DecimalFormat dc = new DecimalFormat("0.00");

        elementClick(paymentBtn,"Payment button is tapped");
        WebElement balanceDueAmount = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String balanceDueCardAmount = balanceDueAmount.getText().replaceAll("[$ ]","");
         Assert.assertEquals(dc.format(amountValue), balanceDueCardAmount);
         TestUtils.BalanceCardAmount = balanceDueCardAmount;
         utils.log().info("Balance Due is SAME with Remaining AMount - "+amountValue);
    }

    public void verifyPartialAmountWithCashPriceAmount(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        double paidAmount = Double.parseDouble(TestUtils.paidAmount1.replaceAll("[$ ]",""));
        utils.log().info("Paid Amount 1 - "+paidAmount);
        double totalAmount = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[$ ]",""));
        utils.log().info("Total Amount - "+totalAmount);
        double amountValue = totalAmount - paidAmount;
        DecimalFormat dc = new DecimalFormat("0.00");

        elementClick(paymentBtn,"Payment button is tapped");
        WebElement balanceDueAmount = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]"));
        String balanceDueCardAmount = balanceDueAmount.getText().replaceAll("[$ ]","");
        Assert.assertEquals(dc.format(amountValue), balanceDueCardAmount);
        utils.log().info("Balance Due is SAME with Remaining AMount - "+amountValue);
    }

    public void verifyThePaidAmountWithPartialPaidAmount(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        DecimalFormat dc = new DecimalFormat("0.00");
        double fastCash = Double.parseDouble(TestUtils.fastCash.replaceAll("[$ ]",""));
        utils.log().info("FastAS - "+fastCash);
        double calculatedFastCash = (fastCash * 12.25)/100;

        utils.log().info(dc.format(calculatedFastCash));
        double ActualPaidAmount = fastCash - Double.parseDouble(dc.format(calculatedFastCash)) ;
        utils.log().info(String.valueOf(ActualPaidAmount));
        WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Paid Amount\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String totalAmount = totalValues.getText().replaceAll("[$ ]","");
        Assert.assertEquals(String.valueOf(ActualPaidAmount),totalAmount);
        TestUtils.paidAmount1 = totalAmount;
        utils.log().info("Paid Amount is SAME - "+totalAmount);
    }

    public void verifyThePaidAmountWithPartialPaidAmountWhileGratuity(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        DecimalFormat dc = new DecimalFormat("0.00");
        double fastCash = Double.parseDouble(TestUtils.fastCash.replaceAll("[$ ]",""));
        utils.log().info("FastAS - "+fastCash);
        double calculatedFastCash = (fastCash * 12.25)/100;
        utils.log().info(dc.format(calculatedFastCash));
        double ActualPaidAmount = fastCash - Double.parseDouble(dc.format(calculatedFastCash)) ;
        utils.log().info(String.valueOf(ActualPaidAmount));
        WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Paid Amount\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        String totalAmount = totalValues.getText().replaceAll("[$ ]","");
        Assert.assertEquals(String.valueOf(ActualPaidAmount),totalAmount);
        TestUtils.paidAmount1 = totalAmount;
        utils.log().info("Paid Amount is SAME - "+totalAmount);
    }
    public void verifyTheActualCashPriceWithCalculatedCAshPrice1(){
        double subtotalTxt =  Double.parseDouble(TestUtils.subtotalTxt.replaceAll("[A-Z$ ]",""));
        double taxTxt =  Double.parseDouble(TestUtils.taxTxt.replaceAll("[A-Z$ ]",""));
        double gratuityTxt =  Double.parseDouble(TestUtils.gratutiy.replaceAll("[A-Z$ ]",""));
        DecimalFormat dc1 = new DecimalFormat("0.00");
        double totalValue = subtotalTxt+ taxTxt + gratuityTxt;
        utils.log().info(String.valueOf(totalValue));
        double cashReward = 12.25;
        double cashPrice = (totalValue * cashReward);
        double expectedCashPrice = Double.parseDouble(String.valueOf(cashPrice/100));


        WebElement cashPrice1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
        String actualCashPrice = cashPrice1.getText().replaceAll("[$ ]","");


        double expectedCashValue = Double.parseDouble(dc1.format(expectedCashPrice));
        utils.log().info(String.valueOf(expectedCashValue));
        double expectedTotal = totalValue - expectedCashPrice;
        Assert.assertEquals(actualCashPrice,dc1.format(expectedTotal));
        TestUtils.cashOptionOrderScreen = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+expectedTotal);
    }

    public void verifyTheActualCashPriceWithCalculatedCAshPrice(){
        double subtotalTxt =  Double.parseDouble(TestUtils.subtotalTxt.replaceAll("[A-Z$ ]",""));
        double taxTxt =  Double.parseDouble(TestUtils.taxTxt.replaceAll("[A-Z$ ]",""));
        double totalValue = subtotalTxt+ taxTxt;
        double cashReward = 12.25;
        double cashPrice = (totalValue * cashReward);
        double expectedCashPrice = Double.parseDouble(String.valueOf(cashPrice/100));


        WebElement cashPrice1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        String actualCashPrice = cashPrice1.getText().replaceAll("[$ ]","");

        DecimalFormat dc1 = new DecimalFormat("0.00");
        double expectedCashValue = Double.parseDouble(dc1.format(expectedCashPrice));
        utils.log().info(String.valueOf(expectedCashValue));
        double expectedTotal = totalValue - expectedCashPrice;
        Assert.assertEquals(actualCashPrice,dc1.format(expectedTotal));
        TestUtils.cashOptionOrderScreen = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+expectedTotal);
    }


    public void verifyTheActualCashPriceWithCalculatedCAshPriceWhileCashDiscount(){
        double subTotalValue = Double.parseDouble(TestUtils.subtotalTxt.replaceAll("[A-Z$ ]",""));
        double taxValue = Double.parseDouble(TestUtils.taxTxt.replaceAll("[A-Z$ ]",""));
        double totalValue = Double.parseDouble(TestUtils.totalTxt.replaceAll("[A-Z$ ]",""));
        double cashReward = 5.32;
        double cashPrice = ((subTotalValue+taxValue) * cashReward);
        double expectedCashPrice = cashPrice/100;

        WebElement cashPrice1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        String actualCashPrice = cashPrice1.getText().replaceAll("[$ ]","");

        DecimalFormat dc1 = new DecimalFormat("0.00");
        double expectedCashValue = Double.parseDouble(dc1.format(expectedCashPrice));
        utils.log().info(String.valueOf(expectedCashValue));
        double expectedTotal = (totalValue) - expectedCashPrice;
        Assert.assertEquals(actualCashPrice,dc1.format(expectedTotal));
        TestUtils.cashOptionOrderScreen = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+expectedTotal);
    }

    public void verifyTheActualCashPriceWithCalculatedCAshPriceWhileCashDiscountInclusiveTax(){
        double subTotalValue = Double.parseDouble(TestUtils.subtotalTxt.replaceAll("[A-Z$ ]",""));
        double taxValue = Double.parseDouble(TestUtils.taxTxt.replaceAll("[A-Z$ ]",""));
        double totalValue = Double.parseDouble(TestUtils.totalTxt.replaceAll("[A-Z$ ]",""));
        double cashReward = 5.32;
        double cashPrice = ((subTotalValue) * cashReward);
        double expectedCashPrice = cashPrice/100;

        WebElement cashPrice1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        String actualCashPrice = cashPrice1.getText().replaceAll("[$ ]","");

        DecimalFormat dc1 = new DecimalFormat("0.00");
        double expectedCashValue = Double.parseDouble(dc1.format(expectedCashPrice));
        utils.log().info(String.valueOf(expectedCashValue));
        double expectedTotal = (totalValue) - expectedCashPrice;
        Assert.assertEquals(actualCashPrice,dc1.format(expectedTotal));
        TestUtils.cashOptionOrderScreen = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+expectedTotal);
    }

    public void verifyTheActualCashPriceWithCalculatedCAshPriceWhileGratutity1(){
        double totalValue = Double.parseDouble(TestUtils.totalTxt.replaceAll("[A-Z$ ]",""));
        double gratuityValue = Double.parseDouble(TestUtils.gratutiy.replaceAll("[A-Z$ ]",""));
        DecimalFormat dc2 = new DecimalFormat("0.00");
        double gratuityPrice = Double.parseDouble(dc2.format(gratuityValue));
        utils.log().info(String.valueOf(gratuityPrice));

        double cashReward = 12.25;
        double totalPriceForGratuity = totalValue - gratuityPrice ;
        utils.log().info("Total Prize - "+totalPriceForGratuity);

        double cashPrice = (totalPriceForGratuity * cashReward );

        DecimalFormat dc1 = new DecimalFormat("0.00");
        utils.log().info(dc1.format(cashPrice));
        double expectedCashPrice = Double.parseDouble(String.valueOf(cashPrice/100));
        double expectedTotal = Double.parseDouble(String.valueOf(totalValue)) - expectedCashPrice;
        WebElement cashPrice1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
        String actualCashPrice = cashPrice1.getText();

        DecimalFormat dc = new DecimalFormat("0.00");
        Assert.assertEquals(actualCashPrice.replaceAll("[$ ]",""),dc.format(expectedTotal));
        TestUtils.cashOptionOrderScreen = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+dc.format(expectedTotal));

    }

    public void verifyTheActualCashPriceWithCalculatedCAshPriceWhileGratutity(){
        double subTotalValue = Double.parseDouble(TestUtils.subtotalTxt.replaceAll("[A-Z$ ]",""));
        double taxValue = Double.parseDouble(TestUtils.taxTxt.replaceAll("[A-Z$ ]",""));
        double gratuityValue = Double.parseDouble(TestUtils.gratutiy.replaceAll("[A-Z$ ]",""));
        DecimalFormat dc2 = new DecimalFormat("0.00");
        double gratuityPrice = Double.parseDouble(dc2.format(gratuityValue));
        utils.log().info(String.valueOf(gratuityPrice));

        double cashReward = 12.25;
        double totalPriceForGratuity = subTotalValue +taxValue ;
        utils.log().info("Total Prize - "+totalPriceForGratuity);

        double cashPrice = (totalPriceForGratuity * cashReward );

        DecimalFormat dc1 = new DecimalFormat("0.00");

        double expectedCashPrice = Double.parseDouble(String.valueOf(cashPrice/100));
        utils.log().info(String.valueOf(expectedCashPrice));
        double expectedTotal = totalPriceForGratuity - expectedCashPrice + gratuityValue;
        utils.log().info(String.valueOf(expectedTotal));
        WebElement cashPrice1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
        String actualCashPrice = cashPrice1.getText();

        DecimalFormat dc = new DecimalFormat("0.00");
        Assert.assertEquals(actualCashPrice.replaceAll("[$ ]",""),dc.format(expectedTotal));
        TestUtils.cashOptionOrderScreen = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+dc.format(expectedTotal));

    }

    public void verifyTheActualCashPriceWithCalculatedCAshPriceWhileGratutityWithInclusiveTax(){
        double subTotalValue = Double.parseDouble(TestUtils.subtotalTxt.replaceAll("[A-Z$ ]",""));
        double taxValue = Double.parseDouble(TestUtils.taxTxt.replaceAll("[A-Z$ ]",""));
        double gratuityValue = Double.parseDouble(TestUtils.gratutiy.replaceAll("[A-Z$ ]",""));
        DecimalFormat dc2 = new DecimalFormat("0.00");
        double gratuityPrice = Double.parseDouble(dc2.format(gratuityValue));
        utils.log().info(String.valueOf(gratuityPrice));

        double cashReward = 12.25;
        utils.log().info("Total Prize - "+ subTotalValue);

        double cashPrice = (subTotalValue * cashReward );

        DecimalFormat dc1 = new DecimalFormat("0.00");

        double expectedCashPrice = Double.parseDouble(String.valueOf(cashPrice/100));
        utils.log().info(String.valueOf(expectedCashPrice));
        double expectedTotal = subTotalValue - expectedCashPrice + gratuityValue;
        utils.log().info(String.valueOf(expectedTotal));
        WebElement cashPrice1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
        String actualCashPrice = cashPrice1.getText();

        DecimalFormat dc = new DecimalFormat("0.00");
        Assert.assertEquals(actualCashPrice.replaceAll("[$ ]",""),dc.format(expectedTotal));
        TestUtils.cashOptionOrderScreen = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+dc.format(expectedTotal));

    }

    public void verifyTheActualCashPriceWithCalculatedCAshPriceCashDiscountWhileGratutity(){
//        double subTotalValue = Double.parseDouble(TestUtils.subtotalTxt.replaceAll("[A-Z$ ]",""));
//        double taxValue = Double.parseDouble(TestUtils.taxTxt.replaceAll("[A-Z$ ]",""));
        double totalValue = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[A-Z$ ]",""));
//        double gratuityValue = Double.parseDouble(TestUtils.gratutiy.replaceAll("[A-Z$ ]",""));
//        DecimalFormat dc2 = new DecimalFormat("0.00");
//        double gratuityPrice = Double.parseDouble(dc2.format(gratuityValue));
//        utils.log().info(gratuityPrice);

        double cashReward = 5.32;
//        double totalPriceForGratuity = subTotalValue +taxValue ;
//        utils.log().info("Total Prize - "+totalPriceForGratuity);

        double cashPrice = (totalValue * cashReward );

        DecimalFormat dc1 = new DecimalFormat("0.00");

        double expectedCashPrice = cashPrice/100;
        utils.log().info(String.valueOf(expectedCashPrice));
        double expectedTotal = totalValue + expectedCashPrice;
        utils.log().info(String.valueOf(expectedTotal));
        WebElement cashPrice1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String actualCashPrice = cashPrice1.getText();

        DecimalFormat dc = new DecimalFormat("0.00");
        Assert.assertEquals(actualCashPrice.replaceAll("[$ ]",""),dc.format(expectedTotal));
        TestUtils.totalTxt = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+dc.format(expectedTotal));

    }
    public void verifyTheActualCashPriceWithCalculatedCAshPriceWhileItemServiceCharge(){
        double subTotalValue = Double.parseDouble(TestUtils.subtotalTxt.replaceAll("[A-Z$ ]",""));
        double taxValue = Double.parseDouble(TestUtils.taxTxt.replaceAll("[A-Z$ ]",""));
        double serviceChargeValue = Double.parseDouble(TestUtils.serviceCharge.replaceAll("[A-Z$ ]",""));
        DecimalFormat dc2 = new DecimalFormat("0.00");
        double gratuityPrice = Double.parseDouble(dc2.format(serviceChargeValue));
        utils.log().info(String.valueOf(gratuityPrice));

        double cashReward = 12.25;
        double totalPriceForGratuity = subTotalValue +taxValue + serviceChargeValue;
        utils.log().info("Total Prize - "+totalPriceForGratuity);

        double cashPrice = (totalPriceForGratuity * cashReward );

        DecimalFormat dc1 = new DecimalFormat("0.00");

        double expectedCashPrice = cashPrice/100;
        utils.log().info(String.valueOf(expectedCashPrice));

        double expectedTotal = totalPriceForGratuity - expectedCashPrice;

        WebElement cashPrice1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
        String actualCashPrice = cashPrice1.getText();

        DecimalFormat dc = new DecimalFormat("0.00");
        Assert.assertEquals(actualCashPrice.replaceAll("[$ ]",""),dc.format(expectedTotal));
        TestUtils.cashOptionOrderScreen = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+dc.format(expectedTotal));

    }

    public void verifyTheActualCashPriceWithCalculatedCAshPriceWhileTaxExempt(){
        double totalValue = Double.parseDouble(TestUtils.totalTxt.replaceAll("[A-Z$ ]",""));
        double cashReward = 12.25;
        double cashPrice = (totalValue * cashReward);
        utils.log().info(String.valueOf(cashPrice));
        WebElement cashPrice1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String actualCashPrice = cashPrice1.getText();
        double expectedCashPrice = Double.parseDouble(String.valueOf(cashPrice/100));
        double expectedTotal = Double.parseDouble(String.valueOf(totalValue)) - expectedCashPrice;
        DecimalFormat dc = new DecimalFormat("0.00");
        Assert.assertEquals(actualCashPrice.replaceAll("[$ ]",""),dc.format(expectedTotal));
        TestUtils.cashOptionOrderScreen = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+dc.format(expectedTotal));
    }

    public void verifyTheActualCashPriceWithCalculatedCAshPriceCashDiscountEnabledWhileTaxExempt(){
        double totalValue = Double.parseDouble(TestUtils.totalTxt.replaceAll("[A-Z$ ]",""));
        double subtotalValue = Double.parseDouble(TestUtils.subtotalTxt.replaceAll("[A-Z$ ]",""));
        double cashReward = 5.32;
        double cashPrice = (subtotalValue * cashReward);

        WebElement cashPrice1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String actualCashPrice = cashPrice1.getText();
        double expectedCashPrice = cashPrice/100;
        utils.log().info(String.valueOf(expectedCashPrice));
        double expectedTotal = totalValue - expectedCashPrice;
        DecimalFormat dc = new DecimalFormat("0.00");
        Assert.assertEquals(actualCashPrice.replaceAll("[$ ]",""),dc.format(expectedTotal));
        TestUtils.cashOptionOrderScreen = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+dc.format(expectedTotal));
    }
    public void verifyTheTotalValueWithBalanceDueValueInPaymentScreen(){
        String total = TestUtils.totalTxt;
        WebElement balanceDue = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String balanceDueTxt = balanceDue.getText();
        Assert.assertEquals(total.replaceAll("[$ ]",""),balanceDueTxt.replaceAll("[$ ]",""));
        utils.log().info("Total is SAME with Balance Due Payment screen - "+total);
    }

    public void verifyTheCashPriceValueWithPaidAmountValueIsSame(){
        WebElement paidAmountValue = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]"));
        String actualPaidAmountValue = paidAmountValue.getText();
        Assert.assertEquals(TestUtils.cashOptionOrderScreen.replaceAll("[$ ]",""),actualPaidAmountValue.replaceAll("[$ ]",""));
        utils.log().info("Cash Price is Same with Paid Amount - "+actualPaidAmountValue);
    }

    public void verifyTheTotalValueWithDigitalReceiptScreen(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement totalOfDigitalScreen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        String totalOfDigitalScreen1 = (totalOfDigitalScreen.getText()).replaceAll("[A-Za-z$ ]","");
        utils.log().info(totalOfDigitalScreen1);
        String ActualTotalOfOrderScreen = (TestUtils.totalTxt).replaceAll("[A-Z$ ]","");
        Assert.assertEquals(totalOfDigitalScreen1,ActualTotalOfOrderScreen);
        utils.log().info("Cash Price Value is Same with the Digital Receipt Screen - "+totalOfDigitalScreen1);
    }

    public void verifyCustomerPreviousOrderMenuWithOrderMenu(){
        WebElement orderMenu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
        utils.log().info(orderMenu.getText());
        utils.log().info(TestUtils.menuNames.get(0));
        Assert.assertEquals(orderMenu.getText(),TestUtils.menuNames.get(0));
    }

    public void selectPreviousOrderOnCustomer(){
        WebElement orderMenu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
elementClick(orderMenu,"Selected Order Menu - "+orderMenu.getText());
    }
    @FindBy(name = "Delete")
    private WebElement deleteBtn;
    public void deleteTheMenuItemIntheOrderScreen() throws InterruptedException {
        WebElement deleteMenu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[3]"));
        swipe( 32, 320, -42, 320,5000);
        elementClick(deleteBtn,"Tapped Delete Button");
    }

    public void verifyTheDoYouWantToTokenizeYourCardPopup() throws InterruptedException {
        Thread.sleep(1500);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

        WebElement doYouWantToTokenize = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(doYouWantToTokenize.getText(),"Do you want to tokenize your card?");
        utils.log().info("Displayed Popup as - "+doYouWantToTokenize.getText());
    }

    public void clickNoButtonOnThePopup(){
        WebElement clickNoButton = (WebElement) driver.findElements(By.xpath("No"));
        elementClick(clickNoButton,"Selected No Button");
    }

    public void clickYesButtonOnThePopup(){
        WebElement clickYesButton = (WebElement) driver.findElements(By.xpath("Yes"));
        elementClick(clickYesButton,"Selected YES Button");
    }

    @FindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search\"]")
    private WebElement search;

    public void searchTheExistingCustomerOnTheOrderScreen() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(400);
        String existingCustomer = TestUtils.firstNameCustomer+TestUtils.lastNameCustomer;
        sendKeys(search,existingCustomer);
        utils.log().info("Existing customer As - "+existingCustomer);

        WebElement exitCustomer = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText"));
        TestUtils.customerName = exitCustomer.getText().split(" ");
        elementClick(exitCustomer,"Selected Existing customer as - "+exitCustomer.getText());
        Thread.sleep(100);
        utils.log().info("Customer name splited - "+ Arrays.toString(TestUtils.customerName));
    }

    public void searchExitingCustomer(String name) throws InterruptedException {
        utils.log().info("Existing customer As - "+name);
        sendKeys(search,name);
        WebElement exitCustomer = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText"));
        TestUtils.customerName = exitCustomer.getText().split(" ");
        elementClick(exitCustomer,"Selected Existing customer as - "+exitCustomer.getText());
        Thread.sleep(100);
        utils.log().info("Customer name splited - "+ Arrays.toString(TestUtils.customerName));

    }

    public void clickTheCustomerNameOnTheOrderScreen() throws InterruptedException {
        Thread.sleep(800);
        WebElement customerName = driver.findElement(By.xpath("(//p[contains(@class,'tablecommon-label ng-star-inserted')])[2]"));
        String name = customerName.getText();
        elementClick(customerName,"Selected name as - "+name);
    }


    public void verifyAppliedExistingCustomerNameAndPhoneNumber() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(1000);
        WebElement firstName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]"));
        org.testng.Assert.assertEquals(firstName.getText(),TestUtils.customerName[0]);
        utils.log().info("First Name of customer profile screen is SAME with existing customer first name - "+firstName.getText());

        WebElement lastName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[2]"));
        org.testng.Assert.assertEquals(lastName.getText(),TestUtils.customerName[1]);
        utils.log().info("Last Name of customer profile screen is SAME with existing customer last name - "+lastName.getText());

        WebElement phoneNumber = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[5]"));
        org.testng.Assert.assertEquals(phoneNumber.getText(),TestUtils.MobileNumber);
        utils.log().info("Phone Number of customer profile screen is SAME with existing customer Phone number - "+phoneNumber.getText());

        WebElement email = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[7]"));
        utils.log().info("Email from the customer details screen "+email.getText());
        TestUtils.emailCustomerDetailsScreen = email.getText();

    }

    public void verifyTheCreditCardShouldNotAddToTheCustomer(){

        WebElement creditCardBtn = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTextField[9]"));
        elementClick(creditCardBtn,"Selected Credit card button on the customer profile screen");

        try {
            WebElement creditCardNumber = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell"));
            if (!creditCardNumber.isDisplayed()) {
                utils.log().info("Credit Card is NOT Displayed");
            }
        }catch (Exception h){
            List<WebElement> listOfCreditCardNumber = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell"));
            utils.log().info("List of credit card - " + listOfCreditCardNumber.size());
            int number = listOfCreditCardNumber.size();
            {
                WebElement creditCardNumber1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[" + number + "]/XCUIElementTypeStaticText"));
                String creditCardNumberTxt = creditCardNumber1.getText().substring(10);
                utils.log().info("Credit card for the customer Crypted - " + creditCardNumberTxt);
                utils.log().info("Credit card for the customer11 - " + TestUtils.cardNumber.replaceAll("[A-Z$, ]", "").substring(12));
                org.testng.Assert.assertEquals(creditCardNumberTxt, TestUtils.cardNumber.replaceAll("[A-Z$, ]", "").substring(12));
                TestUtils.creditCardNumberCustomerProfile = creditCardNumberTxt;
                utils.log().info("Credit card for the customer - " + creditCardNumberTxt);
                elementClick(creditCardNumber1, "Selected Credit Card Number as - " + creditCardNumber1.getText());
            }

        }
    }


    public void getCreditCardNumberIsAttachedTheCustomer() throws InterruptedException {
        Thread.sleep(3500);
        WebElement creditCardBtn = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTextField[9]"));
        elementClick(creditCardBtn,"Selected Credit card button on the customer profile screen");

        try {
            WebElement creditCardNumber = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell"));
            if (creditCardNumber.isDisplayed()) {
                List<WebElement> listOfCreditCardNumber = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell"));
                utils.log().info("List of credit card - "+listOfCreditCardNumber.size());
                int number = listOfCreditCardNumber.size();
                if (number == 1 ) {
                    WebElement creditCardNumber1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText"));
                    String creditCardNumberTxt = creditCardNumber1.getText();
                    TestUtils.creditCardNumberCustomerProfile = creditCardNumberTxt;
                    utils.log().info("Credit card for the customer - " + creditCardNumberTxt);
                }else{

                    WebElement creditCardNumber1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[" + number + "]/XCUIElementTypeStaticText"));
                    String creditCardNumberTxt = creditCardNumber1.getText();
                    TestUtils.creditCardNumberCustomerProfile = creditCardNumberTxt;
                    utils.log().info("Credit card for the customer - " + creditCardNumberTxt);
                }

            }
        }catch (Exception h){
            utils.log().info("Credit card is not attached to the customer");
            int i=1/0;
        }

    }

    public void verifyAddedExistingCreditCardNumberWithCustomerProfileCreditCardNumber(){
//        WebElement creditCardBtn = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeOther[2]/XCUIElementTypeTextField[9]");
//        elementClick(creditCardBtn,"Selected Credit card button on the customer profile screen");

        WebElement creditCardNumber = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell"));
        if (creditCardNumber.isDisplayed()) {
            List<WebElement> listOfCreditCardNumber = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell"));
            utils.log().info("List of credit card - "+listOfCreditCardNumber.size());
            int number = listOfCreditCardNumber.size();
            {
                WebElement creditCardNumber1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell["+number+"]/XCUIElementTypeStaticText"));
                String creditCardNumberTxt = creditCardNumber1.getText();
                utils.log().info("Credit card for the customer Crypted - " + creditCardNumberTxt);
                int sizeOfCardNumber = creditCardNumberTxt.length();
                utils.log().info("Length of the Card Number "+sizeOfCardNumber);
                int size1 = sizeOfCardNumber-4;
                utils.log().info("Size of the Card Number "+size1);
                for(int i=0;i<sizeOfCardNumber-4;i++) {
                    if (creditCardNumberTxt.charAt(i) == '*') {
                        utils.log().info("Encrypted Card Number - " + creditCardNumberTxt.charAt(i));
                    }else{
                        utils.log().info("Not Encrypted Card Number - " + creditCardNumberTxt.charAt(i));
                        int w = 1/0;
                    }
                }
                utils.log().info("Expected Encrypted Credit card Number - " + TestUtils.cardNumber.substring(TestUtils.cardNumber.length() - 4));
                String substring = creditCardNumberTxt.substring(creditCardNumberTxt.length() - 4);
                utils.log().info("Actual Encrypted Credit card Number - " + substring);
                org.testng.Assert.assertEquals(substring,TestUtils.cardNumber.substring(TestUtils.cardNumber.length() - 4));
                TestUtils.creditCardNumberCustomerProfile = creditCardNumberTxt;
                utils.log().info("Credit card for the customer in Encrypted - " + creditCardNumberTxt);
            }

        }else{
            utils.log().info("Credit Card is not Displayed");
            int i =1/0;
        }

    }

    public void clickAddButtonOfTheCreditCard(){

        WebElement addButton = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Add\"])[3]"));
        elementClick(addButton,"Selected Add Button of the credit card");
    }

    public void shouldSeeAddCardPopup(){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        WebElement addCardPopup = (WebElement) driver.findElements(By.xpath("Add Card"));
        elementClick(addCardPopup,"Seen Add Card Popup");
    }

    public void enterCardNumberFieldToTheCustomer(String Number, String Date){
        WebElement cardNumber = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));
        cardNumber.sendKeys(Number);
        utils.log().info("Card Number as - "+Number);
        TestUtils.NewCardNumber = Number;
        WebElement expireDate = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField"));
        expireDate.sendKeys(Date);
        utils.log().info("Expiry Date - "+Date);
        TestUtils.expireNumber = Date;

    }

    public void clickProcessTokenBtn(){
        WebElement processToken = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeButton[@name=\"Process Token\"]"));
        elementClick(processToken,"Selected Process Token Button");
    }

    public void verifyAppliedCreditCardNumberIsAddedToTheCustomer(){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        WebElement creditCardBtn = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTextField[9]"));
        elementClick(creditCardBtn,"Selected Credit card button on the customer profile screen");

        List<WebElement> listOfCreditCardNumber = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell"));
        utils.log().info("List of credit card - "+listOfCreditCardNumber.size());
        int number = listOfCreditCardNumber.size();
        WebElement creditCardNumber1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell["+number+"]/XCUIElementTypeStaticText"));
        String creditCardNumberTxt = creditCardNumber1.getText();

        int sizeOfCardNumber = creditCardNumberTxt.length();
        utils.log().info("Length of the Card Number "+sizeOfCardNumber);
        int size1 = sizeOfCardNumber-4;
        utils.log().info("Size of the Card Number "+size1);
        for(int i=0;i<sizeOfCardNumber-4;i++) {
            if (creditCardNumberTxt.charAt(i) == '*') {
                utils.log().info("Encrypted Card Number - " + creditCardNumberTxt.charAt(i));
            }else{
                utils.log().info("Not Encrypted Card Number - " + creditCardNumberTxt.charAt(i));
                break;
            }
        }
        utils.log().info("Expected Encrypted Credit card Number - " + TestUtils.NewCardNumber.substring(TestUtils.NewCardNumber.length() - 4));
        String substring = creditCardNumberTxt.substring(creditCardNumberTxt.length() - 4);
        utils.log().info("Actual Encrypted Credit card Number - " + substring);
        org.testng.Assert.assertEquals(substring,TestUtils.NewCardNumber.substring(TestUtils.NewCardNumber.length() - 4));
        TestUtils.creditCardNumberCustomerProfile = creditCardNumberTxt;

//        org.testng.Assert.assertEquals(TestUtils.NewCardNumber.substring(12),creditCardNumberTxt.substring(12));
        utils.log().info("Newly Credit card for the customer is Encrypted- " + creditCardNumberTxt);

    }

    public void verifyTheServiceChargeValueWithSaleTotal(){
        WebElement serviceCharge = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeStaticText[2]"));
        String ActualServiceCharge = serviceCharge.getText().replaceAll("[A-Z$, ]","");

//        WebElement CheckTotal = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[12]/XCUIElementTypeStaticText[2]");
//        double total = Double.parseDouble(CheckTotal.getText().replaceAll("[A-Z$., ]",""));
//        double expectedServiceCharge = (total*(2.5/100))/100;
//        DecimalFormat ds = new DecimalFormat("0.00");
//       Assert.assertEquals(ds.format(expectedServiceCharge),ActualServiceCharge);
        org.testng.Assert.assertEquals(ActualServiceCharge,"0.00");
        utils.log().info("Expected and Actual Service Charge is SAME - "+ActualServiceCharge);

    }

    public void verifyTheCreditCardOfTheCheckFromTheBatchScreenShouldBeEncrypted(){
        WebElement creditCheck = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]"));
                 String creditCardNumberTxt= creditCheck.getText();
        int sizeOfCardNumber = creditCardNumberTxt.length();
        utils.log().info("Length of the Card Number "+sizeOfCardNumber);
        int size1 = sizeOfCardNumber-4;
        utils.log().info("Size of the Card Number "+size1);
        for(int i=0;i<sizeOfCardNumber-4;i++) {
            if (creditCardNumberTxt.charAt(i) == '*') {
                utils.log().info("Encrypted Card Number - " + creditCardNumberTxt.charAt(i));
            }else{
                utils.log().info("Not Encrypted Card Number - " + creditCardNumberTxt.charAt(i));
                break;
            }
        }
        utils.log().info("Expected Encrypted Credit card Number - " + TestUtils.cardNumber.substring(TestUtils.cardNumber.length() - 4));
        String substring = creditCardNumberTxt.substring(creditCardNumberTxt.length() - 4);
        utils.log().info("Actual Encrypted Credit card Number - " + substring);
        org.testng.Assert.assertEquals(substring,TestUtils.cardNumber.substring(TestUtils.cardNumber.length() - 4));

    }

    public void verifyTheCreditCardOfTheCheckFromTheRefundScreenShouldBeEncrypted(){
        WebElement creditCheck = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]"));
        String creditCardNumberTxt= creditCheck.getText();
        int sizeOfCardNumber = creditCardNumberTxt.length();
        utils.log().info("Length of the Card Number "+sizeOfCardNumber);
        int size1 = sizeOfCardNumber-4;
        utils.log().info("Size of the Card Number "+size1);
        for(int i=0;i<sizeOfCardNumber-4;i++) {
            if (creditCardNumberTxt.charAt(i) == '*') {
                utils.log().info("Encrypted Card Number - " + creditCardNumberTxt.charAt(i));
            }else{
                utils.log().info("Not Encrypted Card Number - " + creditCardNumberTxt.charAt(i));
                break;
            }
        }
        utils.log().info("Expected Encrypted Credit card Number - " + TestUtils.cardNumber.substring(TestUtils.cardNumber.length() - 4));
        String substring = creditCardNumberTxt.substring(creditCardNumberTxt.length() - 4);
        utils.log().info("Actual Encrypted Credit card Number - " + substring);
        org.testng.Assert.assertEquals(substring,TestUtils.cardNumber.substring(TestUtils.cardNumber.length() - 4));

    }

    public void verifyTheCreditCardNumberOnTheChooseCardWindowShouldBeEncrypted(){
        WebElement selectCard1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]"));
        String creditCardNumberTxt= selectCard1.getText();

        int sizeOfCardNumber = creditCardNumberTxt.length();
        utils.log().info("Length of the Card Number "+sizeOfCardNumber);
        int size1 = sizeOfCardNumber-4;
        utils.log().info("Size of the Card Number "+size1);
        for(int i=0;i<sizeOfCardNumber-4;i++) {
            if (creditCardNumberTxt.charAt(i) == '*') {
                utils.log().info("Encrypted Card Number - " + creditCardNumberTxt.charAt(i));
            }else{
                utils.log().info("Not Encrypted Card Number - " + creditCardNumberTxt.charAt(i));
                break;
            }
        }
        utils.log().info("Expected Encrypted Credit card Number - " + TestUtils.cardNumber.substring(TestUtils.cardNumber.length() - 4));
        String substring = creditCardNumberTxt.substring(creditCardNumberTxt.length() - 4);
        utils.log().info("Actual Encrypted Credit card Number - " + substring);
        org.testng.Assert.assertEquals(substring,TestUtils.cardNumber.substring(TestUtils.cardNumber.length() - 4));


    }

    public void ClickThePhoneNumberField() throws InterruptedException {
        Thread.sleep(3000);
        WebElement phoneNumberField = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"CustomerProfile DownArrow\"])[1]"));
        elementClick(phoneNumberField,"Selected Phone number field on the customer profile screen");
    }

    public void ClickTheCreditCardNumberField(){
        WebElement creditCardNumberField = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"CustomerProfile DownArrow\"])[4]"));
        elementClick(creditCardNumberField,"Selected credit Card number field on the customer profile screen");
    }

    public void getTheMobileNumberFromTheCustomerProfileScreen(){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        WebElement MobileNumber = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText"));
        String MobileNumberTxt = MobileNumber.getText();
        utils.log().info("Customer has Mobile number - "+MobileNumberTxt);
        TestUtils.MobileNumber = MobileNumberTxt;
    }
    public void selectMppgPayment() throws Exception {
        try {
            if (find(mppgAuth, 2)) {
                elementClick(mppgAuth, "Tapped Mppg Auth Payment");
            } else {
                scrollToElementPayments(mppgAuth, "up");
                elementClick(mppgAuth, "Tapped Mppg Auth Payment");
            }
        } catch (Exception w) {
            scrollToElementPayments(mppgAuth, "down");
            elementClick(mppgAuth, "Tapped Mppg Auth Payment");
        }
    }

    public void searchTheClosedCheckInBatchScreen(){
        WebElement searchField = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField"));
        searchField.sendKeys(TestUtils.globalCheckNumber);
    }

    public void iEnableTheApplyTotalInBatchScreen(){
        WebElement applyTotal = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch"));
        if(Objects.equals(applyTotal.getAttribute("value"), "0")){
            elementClick(applyTotal,"Apply total toggle is Enabled");
        }else{
            utils.log().info("Apply total toggle is enabled");
        }
    }
}




