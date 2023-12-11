package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CIPaymentScreen extends BasePage{

    // Using Elements: Cancel , Payment, Gratuity ,paymentPin0,paymentPin5,paymentPin00,
    String btnCommonXPath = "//XCUIElementTypeButton[@name=\"{0}\"]";

    // Using Elements :  Discount,Total, Bar Tab
    String btnTextXPath = "//XCUIElementTypeStaticText[@name=\"{0}\"]";

    // Using Elements: Cash
    String btnTipXPath = "(//XCUIElementTypeStaticText[@name=\"{0}\"])[1]";

    // Using Elements: Verifying Total Amount
    String itemCIFoodXPath = "(//XCUIElementTypeStaticText[@name=\"{0}\"])[2]";

    // Using Elements: Verifying Menu Items, Discount, Empty List
    String itemXPath = "//XCUIElementTypeStaticText[@name=\"{0}\"]";

    String btnExitXPath= "//XCUIElementTypeButton[@name=\"  Exit\"]";

    String btnDelete="//XCUIElementTypeButton[@name=\"  Delete\"]";

    String optCreditCardAmount="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell";

    String btnWrongXPath="//XCUIElementTypeStaticText[@name=\"{0}\"]";

    String cardNumberTxtField="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField";

    String expireNumTxtField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[1]";

    String cvvTxtField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[2]";

    String zipCodeTxtField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[3]";

    String cardNameField="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField";

    String NoThanksBtn="No Thanks";

    String emptyListXpath="//XCUIElementTypeTable[@name=\"{0}\"]";

    String clickTextField="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextField";

    String clickNewTab="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]";

    String btnSubmit="//XCUIElementTypeButton[@name=\"  Submit\"]";

    String btnNoXPath="//XCUIElementTypeButton[@name=\"{0}\"]";

    String giftCardTextField="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String cardNumberHATxtField="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField";

    String textFieldPercentage="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String textFieldReason="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextView";

    String textFieldPercentageOpenItem="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String textFieldReasonOpenItem= "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextView";

    String txtMenuItem="(//XCUIElementTypeTable[@name=\"Empty list\"])[4]";

    String btnTable="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[4]";

    String txtMeals="(//XCUIElementTypeTable[@name=\"Empty list\"])[8]";

    String Search="//XCUIElementTypeSearchField[@name=\"Search\"]";

    String btnPreDefinedTaxExemptCustomer="//XCUIElementTypeStaticText[@name=\"predefinedTaxExcemptCustomer \"]";

//    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"arrow down\"])[2]")
//    WebElement btnDropDown;

    String btnDropDown="(//XCUIElementTypeButton[@name=\"arrow down\"])[2]";

//    @iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name=\"predefinedTaxExcemptCustomer \"]")
//    WebElement btnPreDefinedTaxExemptCustomer;

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
//    private WebElement optExistingCheck;

    String optExistingCheck= "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell";

    public String verifyValue(String item, String msg) {
//        WebElement element = mergeAndFindElement(item, "", TestUtils.Accessibility);
//        String Value=elementGetText(element, msg);
        return findAndGetText(item, "", TestUtils.Accessibility);
    }

    public void clickBtnDropDown(){
//        WebElement element = mergeAndFindElement(btnDropDown, "",TestUtils.XPath);
//        elementClick(element, "msg");
//        elementClick(btnDropDown,"Drop Down button clicked");
        findandclick(btnDropDown, "",TestUtils.XPath);
//        elementClick(element, "msg");
    }

    public void ClickExistingCheck(){
        findandclick(optExistingCheck, "",TestUtils.XPath);
//        elementClick(element, "msg");
//        click(optExistingCheck,"Existing check clicked");
    }

    public void commonBtnClick(String btnName, String msg){
//        WebElement element = mergeAndFindElement(btnName, "",TestUtils.Accessibility);
//        elementClick(element, msg);
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        WebElement element = mergeAndFindElement(btnName, "",TestUtils.Accessibility);
        elementClick(element, msg);
    }

    public void commonBtnClickPayment(String btnName, String msg){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        WebElement element = mergeAndFindElement(btnName,"",TestUtils.Accessibility);
        elementClick(element, msg);
      //  findandclick(btnTextXPath, btnName,TestUtils.XPath);

    }

    public void commonBtnClickReopen(String btnName, String msg){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        WebElement element = mergeAndFindElement(btnName,"",TestUtils.Accessibility);
        elementClick(element, msg);
   //     findandclick(btnCommonXPath, btnName,TestUtils.XPath);
//        elementClick(element, msg);
    }

    public void commonFutureBtnClick(String btnName, String msg){
        try {
            // wait 1 sec
            Thread.sleep(15000);

        } catch (InterruptedException e) {
            // handling InterruptedException
        }
//        WebElement element = mergeAndFindElement(btnName, "",TestUtils.Accessibility);
//        elementClick(element, msg);
        findandclick(btnName, "",TestUtils.Accessibility);


    }

    public void clickBtnPayment(String btnPayment, String msg){
//        WebElement element = mergeAndFindElement(btnTextXPath, btnPayment,TestUtils.XPath);
//        elementClick(element, msg);
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        findandclick(btnTextXPath, btnPayment,TestUtils.XPath);
        findandclickM(By.id("Yes"));
    }

    public void ClickBtnExit(String msg){
//        WebElement element = mergeAndFindElement(btnExitXPath, "",TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(btnExitXPath, "",TestUtils.XPath);
    }

    public void ClickBtnAdd(String btnAdd, String msg){
//        WebElement element = mergeAndFindElement(btnAdd,"" ,TestUtils.Accessibility);
//        elementClick(element, msg);
        findandclick(btnAdd,"" ,TestUtils.Accessibility);
    }

    public void ClickBtnOk(String btnOk, String msg){
        driver.manage().timeouts().implicitlyWait(13,TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(btnOk, "",TestUtils.Accessibility);
//        elementClick(element,msg);
        findandclick(btnOk, "",TestUtils.Accessibility);
    }

    public void commonBtnClickOption(String optionName, String msg) {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(optionName, "",TestUtils.Accessibility);
//        elementClick(element, msg);
        findandclick(optionName, "",TestUtils.Accessibility);
    }

    public void btnHideKeyboard(String optionName, String msg) {


//        try {
//            WebElement element = mergeAndFindElement(optionName, "", TestUtils.Accessibility);
//            elementClick(element, msg);
//        }catch(Exception ex){
//
//        }
        findandclick(optionName, "", TestUtils.Accessibility);
    }

    public String commonGetText(String Text, String msg) {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(Text,"" ,TestUtils.Accessibility);
//        String text =elementGetText(element, msg);
//        return text;
        try{
        return findAndGetText(Text,"" ,TestUtils.Accessibility);}
        catch(Exception e){
            return Text;
        }
    }

    public String commonBtnClickCIFood(String optionName, String msg) {
//        WebElement element = mergeAndFindElement(itemCIFoodXPath, optionName,TestUtils.XPath);
//        String CIFood=elementGetText(element, msg);
        return findAndGetText(itemCIFoodXPath, optionName,TestUtils.XPath);
    }

    public void btnClickTip(String optionName, String msg) {
//        WebElement element = mergeAndFindElement(btnTipXPath, optionName,TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnTipXPath, optionName,TestUtils.XPath);
//        elementClick(element, msg);
    }

    public void clickSubmit(){
//        WebElement element = mergeAndFindElement(btnSubmit, "",TestUtils.XPath);
//        elementClick(element, "Submit button Clicked");
        findandclick(btnSubmit, "",TestUtils.XPath);

    }

    public void clickPercentageTextField(){
//        WebElement element = mergeAndFindElement(clickTextField, "", TestUtils.XPath);
//        elementClick(element,"Click Percentage Text Field");
        findandclick(clickTextField, "", TestUtils.XPath);
    }

    public String GiveXCardNumber;

    public void passCardNumber(String Number,String msg){
//        WebElement element = mergeAndFindElement(cardNumberTxtField,"",TestUtils.XPath);
//        sendKeys(element, Number);
        WebElement element = mergeAndFindElement(cardNumberTxtField,"",TestUtils.XPath);

        sendKeys(element, Number);
//        findandclick_Skeys(cardNumberTxtField,"",TestUtils.XPath,"Skeys",Number);
        utils.log().info(msg);
    }

    @FindBy(xpath = "Continue")
    WebElement continueBtnn;

    public void enterGiveXNumber(String Number){
        WebElement giveXNumberField = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
        elementClick(giveXNumberField,"Tapped GiveX Number Field");
        //giveXNumberField.sendKeys(Number,"Passed Number as - "+Number);
        GiveXCardNumber = Number;
        TestUtils.GiveXCardNumber = GiveXCardNumber;

        int numberTxt =Number.length();
        for (int i = 0; i < numberTxt; i++) {

            char money = Number.charAt(i);
            String moneyTxt = String.valueOf(money);

            try {
                WebElement text = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"" + moneyTxt + "\"]"));
                elementClick(text, "Selected - " + moneyTxt);
            } catch (Exception h) {

            }
        }
        elementClick(continueBtnn, "Continue Selected");
    }

    public void passExpireNumber(String number,String cvv,String msg){
        WebElement element = mergeAndFindElement(expireNumTxtField,"",TestUtils.XPath);
        WebElement element1 = mergeAndFindElement(cvvTxtField,"",TestUtils.XPath);
        WebElement element2 = mergeAndFindElement(zipCodeTxtField,"",TestUtils.XPath);

        element.sendKeys(number);
        element.sendKeys(Keys.ENTER);
        element1.sendKeys(cvv);
        element1.sendKeys(Keys.ENTER);
        element2.sendKeys(Keys.ENTER);
        utils.log().info(msg);
    }

    public void passCardName(String card,String msg){
        WebElement element = mergeAndFindElement(cardNameField,"",TestUtils.XPath);
        element.sendKeys(card);
        element.sendKeys(Keys.ENTER);
        utils.log().info(msg);
    }

    public void pressNoThanks(String msg){
//        WebElement element = mergeAndFindElement(NoThanksBtn, "", TestUtils.Accessibility);
//        elementClick(element,msg);
        findandclick(NoThanksBtn, "", TestUtils.Accessibility);

    }

    public String getEmptyList(String emptyList,String msg ){
//        WebElement element = mergeAndFindElement(emptyList, "", TestUtils.Accessibility);
//        String text = elementGetText(element, msg);
        return findAndGetText(emptyList, "", TestUtils.Accessibility);
    }

    public void clickNewTab(){
//        WebElement element = mergeAndFindElement(clickNewTab, "", TestUtils.XPath);
//        elementClick(element,"Click New tab");
        findandclick(clickNewTab, "", TestUtils.XPath);

    }

    public void clickNo(String btnNo,String msg){
//        WebElement element = mergeAndFindElement(btnNo, "", TestUtils.Accessibility);
//        elementClick(element,msg);
        findandclick(btnNo, "", TestUtils.Accessibility);
    }

    public void clickOptCreditCardAmount(String msg) {
//        WebElement element = mergeAndFindElement(optCreditCardAmount, "", TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(optCreditCardAmount, "", TestUtils.XPath);
    }

    public void clickBtnDelete(String msg){
//        WebElement element = mergeAndFindElement(btnDelete, "", TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(btnDelete, "", TestUtils.XPath);
    }

    public void clickBtnWrong(String btnWrong,String msg){
//        WebElement element = mergeAndFindElement(btnWrong, "", TestUtils.Accessibility);
//        elementClick(element,msg);
        findandclick(btnWrong, "", TestUtils.Accessibility);
    }

    public void pressPercentagePin(String pin1, String pin2,
                                   String pinPoint, String pin0) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(pin1, "", TestUtils.Accessibility);
//        elementClick(element, "Tapped pin1");
        findandclick(pin1, "", TestUtils.Accessibility);
//        elementClick(element, "Tapped pin1");

//        WebElement elementPin0 = mergeAndFindElement(pin2, "", TestUtils.Accessibility);
//        elementClick(elementPin0, "Tapped pin2");
        findandclick(pin2, "", TestUtils.Accessibility);
//        elementClick(elementPin0, "Tapped pin2");

//        WebElement elementPin5 = mergeAndFindElement(pinPoint, "", TestUtils.Accessibility);
//        elementClick(elementPin5, "Tapped pin.");
        findandclick(pinPoint, "", TestUtils.Accessibility);


//        WebElement elementPin00 = mergeAndFindElement(pin0, "", TestUtils.Accessibility);
//        elementClick(elementPin00, "Tapped pin0");
        findandclick(pin0, "", TestUtils.Accessibility);
//        elementClick(elementPin00, "Tapped pin0");
    }

    public void clickTextFieldPercentage(){
//        WebElement element = mergeAndFindElement(textFieldPercentage, "", TestUtils.XPath);
//        elementClick(element, "Drop Down button clicked");
        findandclick(textFieldPercentage, "", TestUtils.XPath);

    }

    public void clickTextFieldPercentageOpenItem(){
//        WebElement element = mergeAndFindElement(textFieldPercentageOpenItem, "", TestUtils.XPath);
//        elementClick(element, "reason text field percentage clicked");

        findandclick(textFieldPercentageOpenItem, "", TestUtils.XPath);
    }

    public void clickTextFieldReason(){
//        WebElement element = mergeAndFindElement(textFieldReason, "", TestUtils.XPath);
//        elementClick(element, "reason text field clicked");
        findandclick(textFieldReason, "", TestUtils.XPath);
    }

    public void clickTextFieldReasonOpenItem(){
//        WebElement element = mergeAndFindElement(textFieldReasonOpenItem, "", TestUtils.XPath);
//        elementClick(element, "reason text field open item clicked");
        findandclick(textFieldReasonOpenItem, "", TestUtils.XPath);
    }

    public  void passReason(String Reason){
        WebElement element = mergeAndFindElement(textFieldReasonOpenItem,"",TestUtils.XPath);
        element.sendKeys(Reason);
//        findandclick_Skeys(textFieldReasonOpenItem,"",TestUtils.XPath,"Skeys",Reason);
    }

    public  void passReason1(String Reason1){
        WebElement element = mergeAndFindElement(textFieldReason,"",TestUtils.XPath);
        element.sendKeys(Reason1);
//        findandclick_Skeys(textFieldReason,"",TestUtils.XPath,"Skeys",Reason1);
    }

    public void clickTxtMenuItem(){
//        WebElement element = mergeAndFindElement(txtMenuItem, "", TestUtils.XPath);
//        elementClick(element, "Click the text menu item for selecting the discount");
//        WebElement element = mergeAndFindElement(txtMenuItem, "", TestUtils.XPath);
//        elementClick(element, "Click the text menu item for selecting the discount");
        findandclick(txtMenuItem, "", TestUtils.XPath);

    }

    public void passHACardNumber(String Number){
        WebElement element = mergeAndFindElement(cardNumberHATxtField,"",TestUtils.XPath);
        element.sendKeys(Number);
        element.sendKeys(Keys.ENTER);
    }

    public void clickTable() {
//        WebElement element = mergeAndFindElement(btnTable, "", TestUtils.XPath);
//        elementClick(element, "Click the table");
        findandclick(btnTable, "", TestUtils.XPath);
    }

    public void clickTxtMeals() {
//        WebElement element = mergeAndFindElement(txtMeals, "", TestUtils.XPath);
//        elementClick(element, "Click the meals");
        findandclick(txtMeals, "", TestUtils.XPath);
    }

    public void pressCardPin(String pin1, String pin2,
                             String pin3, String pin4,String pin5) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebElement elementPin1 = mergeAndFindElement(pin1, "", TestUtils.Accessibility);
//        click(elementPin1, "Tapped pin1");
        findandclick(pin1, "", TestUtils.Accessibility);

//        WebElement elementPin2 = mergeAndFindElement(pin2, "", TestUtils.Accessibility);
//        click(elementPin2, "Tapped pin2");
        findandclick(pin2, "", TestUtils.Accessibility);

//        WebElement elementPin3 = mergeAndFindElement(pin3, "", TestUtils.Accessibility);
//        click(elementPin3, "Tapped pin3");

        findandclick(pin3, "", TestUtils.Accessibility);


//        WebElement elementPin4 = mergeAndFindElement(pin4,"" , TestUtils.Accessibility);
//        click(elementPin4, "Tapped pin4");
        findandclick(pin4,"" , TestUtils.Accessibility);

//        WebElement elementPin5 = mergeAndFindElement(pin5,"" ,TestUtils.Accessibility);
//        click(elementPin5, "Tapped pin5");
        findandclick(pin5,"" ,TestUtils.Accessibility);

    }

    public void clickGiftCardTextField(){
//        WebElement element = mergeAndFindElement(giftCardTextField,"",TestUtils.XPath);
//        elementClick(element,"Gift Card Text Field Clicked");
        findandclick(giftCardTextField,"",TestUtils.XPath);
    }

    public void clickCardNameField(String msg){
//        WebElement element = mergeAndFindElement(cardNameField,"",TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(cardNameField,"",TestUtils.XPath);
    }
    public void enterName(String customerName,String msg){
        WebElement element = mergeAndFindElement(Search,"",TestUtils.XPath);
        element.sendKeys(customerName);
//        findandclick_Skeys(Search,"",TestUtils.XPath,"SKeys",customerName);
        utils.log().info(msg);
    }

    public void selectPredefinedTaxExempt(){
//        WebElement element = mergeAndFindElement(btnPreDefinedTaxExemptCustomer,"",TestUtils.XPath);
//        elementClick(element,"msg");
//        click(btnPreDefinedTaxExemptCustomer,"Select PreDefinedTaxExemptCustomer");

        findandclick(btnPreDefinedTaxExemptCustomer,"",TestUtils.XPath);
    }

    public void clickDiscount2(String btnDiscount,String msg){
//        WebElement element = mergeAndFindElement(itemCIFoodXPath, btnDiscount,TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(itemCIFoodXPath, btnDiscount,TestUtils.XPath);
//        elementClick(element, msg);
    }

    public void clickbtnTable(String btnPayment, String msg){
//        WebElement element = mergeAndFindElement(btnTextXPath, btnPayment,TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnTextXPath, btnPayment,TestUtils.XPath);
    }
}
