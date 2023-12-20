package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.qa.utils.TestUtils.driver;

public class TGVoidPage extends BasePage {

    String checkNumber = "";

    String accessibilityIdForPin1 = "1";
    String accessibilityIdForPin2 = "2";
    String accessibilityIdForPin3 = "3";
    String accessibilityIdForPin4 = "4";
    String btnLoginXPath = "//XCUIElementTypeButton[@name=\"Login\"]";

    String closedSearchField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField";

    public By cancelBtn = By.id("Cancel");

    String staticTxtXpath = "//XCUIElementTypeStaticText[@name=\"{0}\"]";

    String btnExitXPath= "//button[@id='ps_exit']";

    String amountXpath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[{0}]";

    String optCreditCardAmount="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell";

    String btnXpath = "//XCUIElementTypeButton[@name=\"{0}\"]";

    String btnDelete="//button[contains(.,' Delete ')]";

    String Done1="Done";

    String chkNumber = "(//p[contains(@class,'order-header-checkno')])";


    public void logInWithValidPin() {
        WebElement pin1 = mergeAndFindMobileElement(accessibilityIdForPin1);
        WebElement pin2 = mergeAndFindMobileElement(accessibilityIdForPin2);
        WebElement pin3 = mergeAndFindMobileElement(accessibilityIdForPin3);
        WebElement pin4 = mergeAndFindMobileElement(accessibilityIdForPin4);
        WebElement btnLogin = mergeAndFindMobileElement(btnLoginXPath);
        elementClick(pin1, "Tapped pin1");
        elementClick(pin2, "Tapped pin2");
        elementClick(pin3, "Tapped pin3");
        elementClick(pin4, "Tapped pin4");
        elementClick(btnLogin, "Tapped Login.");
    }

    public void commonAccessibilityId(String id,String msg){
        WebElement element = mergeAndFindMobileElement(id);
        elementClick(element,msg);
//        findandclick(id);
    }

    public void clickQsrOrderType(){
        WebElement element = mergeAndFindMobileElement(qsrOption);
        elementClick(element,"Click qsrOption");
    }

    public void selectTableForSplit(){
        WebElement element = mergeAndFindMobileElement(firstTable);
        elementClick(element, "click firstTable");
    }

    public void selectDineInOrderType(){
        WebElement element = mergeAndFindMobileElement(dineInOrderType);
        elementClick(element,"Select DineIn OrderType");
    }

    public void selectMenuItem(){
        WebElement element = mergeAndFindMobileElement(firstMenuItem);
        elementClick(element,"Select MenuItem");
    }

    public void clickVoidButton(){
        WebElement element = mergeAndFindMobileElement(voidButton);
        elementClick(element,"Click Void Button");
    }

    public void closeVoidPopup(){
        WebElement element = mergeAndFindMobileElement(doneVoidInfoPopup);
        elementClick(element,"Click Done");
    }

    public void verifyVoidItem(){
        WebElement element = mergeAndFindMobileElement(emptyCheck);
        String actualName = elementGetText(element,"Verify Void Item");
        String expectedName = "No order to display";

        Assert.assertEquals(actualName,expectedName);
    }
    String arrowDownForOtherMenuItems ="//button[@id='os_catMenu']";
    public void pressArrowDown2 () throws InterruptedException {
        Thread.sleep(1000);
        elementClick(arrowDownForOtherMenuItems, "the rest of the categories is listed");
    }
    public void takeOrder() throws InterruptedException {
        pressArrowDown2();
        Thread.sleep(1500);
        elementClick(driver.findElement(By.xpath("//div[contains(@class,'center-name category-container')]/div[contains(.,'FOOD')]")),"Selected FOOD");


        WebElement element1 = mergeAndFindMobileElement(firstMenuItem);
        elementClick(element1,"Select MenuItem And Order");

        WebElement element2 = mergeAndFindMobileElement(orderButton);
        elementClick(element2,"Click Order");
    }

    public void selectFirstVoidReason(){
        WebElement element=mergeAndFindMobileElement(firstVoidReason);
        elementClick(element,"Click First Void Reason");
        /*driver.findElement(addVoidTypeButton).isDisplayed();
        driver.findElement(addVoidTypeButton).click();*/
    }


    public void clickAddVoidReasonButton(){
        WebElement element = mergeAndFindMobileElement(addVoidReasonButton);
        elementClick(element,"Click Add VoidReason");
    }

    public void closeVoidReceiptPrinter(){
        WebElement element = mergeAndFindMobileElement(voidReceiptPrinterDoneButton);
        elementClick(element,"Click Close");
    }

    public void closePrinterInfoPopup(){
        WebElement element1 = mergeAndFindMobileElement(printerPopupInfo);
        element1.isDisplayed();

        WebElement element = mergeAndFindMobileElement(receiptPrinterDoneButton);
        elementClick(element, "click receiptPrinterDoneButton");
    }

    public void clickCheckStatusTab() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element=mergeAndFindMobileElement(checkStatusTab);
        elementClick(element,"Click Check Status Tab Button");
    }

    public void clickVoidChecksTab(){
        WebElement element=mergeAndFindMobileElement(voidChecksTab);
        elementClick(element,"Click void Checks Tab");
//        findandclickM(voidChecksTab);
    }
    @FindBy(xpath = "//input[@data-placeholder='Check No']")
    private WebElement searchTabClosedTab;
    public void verifyVoidOrder() throws InterruptedException {
        Thread.sleep(1000);
        String globalCheckNumber = TestUtils.globalCheckNumber;
        searchTabClosedTab.clear();
        searchTabClosedTab.sendKeys(globalCheckNumber);

        List<WebElement> phoneOrders1 = driver.findElements(By.xpath("//div[(@class='cdk-virtual-scroll-content-wrapper')]//div"));
        utils.log().info(phoneOrders1.size());
        if(phoneOrders1.size() == 1)
        {
            elementClick("//div[(@class='cdk-virtual-scroll-content-wrapper')]//div[1]", "Tapped Closed Check in closed tab - " + globalCheckNumber);
        }else{
            utils.log().info("closed check is not available - "+ globalCheckNumber);
//            int w = 1/0;
            elementClick("//div[(@class='cdk-virtual-scroll-content-wrapper')]//div[1]", "Tapped Closed Check in closed tab - " + globalCheckNumber);

        }
    }

    public void commonBtn(String btnName, String msg) {
        WebElement elementTxtInPopup = mergeAndFindMobileElement(btnXpath);
        elementClick(elementTxtInPopup, msg);
//        findandclick(btnXpath,btnName , TestUtils.XPath);
    }

    public void clickPaymentButtonOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(paymentButtonOnMenuItemPage);
        elementClick(element,"Click Payment Button On MenuItem Page");
    }

    public void clickCashButton(){
        WebElement element = mergeAndFindMobileElement(cashButton);
        elementClick(element, "click cashButton ");
    }

    public void clickExitButton(){
        WebElement element = mergeAndFindMobileElement(exitButtonOnPayment);
        elementClick(element, "click exitButtonOnPayment ");
    }

    public String getAmount(String number,String msg){
        WebElement element = mergeAndFindMobileElement(amountXpath);
        String text=elementGetText(element,msg);
        return text;
    }

    public void pressDone1() {
        try{
            WebElement element=mergeAndFindMobileElement(Done1);
            elementClick(element, "Tapped Done Button on the Popup");}
        catch (Exception e){
            utils.log().info("Tapped Done");
        }
    }

    public void clickOptCreditCardAmount(String msg) {
        WebElement element = mergeAndFindMobileElement(optCreditCardAmount);
        elementClick(element,msg);
//        findandclick(optCreditCardAmount);
    }

    public void clickBtnDelete(String msg){
        WebElement element = mergeAndFindMobileElement(btnDelete);
        elementClick(element,msg);
//        findandclick(btnDelete);
    }

    public void ClickBtnOk(String btnOk, String msg){
        WebElement element = mergeAndFindMobileElement(btnOk);
        elementClick(element,msg);
//        findandclick(btnOk);
    }

    public void clickBtnWrong(String btnWrong,String msg){
        WebElement element = mergeAndFindMobileElement(btnWrong);
        elementClick(element,msg);
//        findandclick(btnWrong);
    }

    public void ClickBtnAdd(String btnAdd, String msg){
        WebElement element = mergeAndFindMobileElement(btnAdd);
        elementClick(element, msg);
//        findandclick(btnAdd);
    }

    public void ClickBtnExit(String msg){
        WebElement element = mergeAndFindMobileElement(btnExitXPath);
        elementClick(element,msg);
//        findandclick(btnExitXPath, "",TestUtils.XPath);
    }

    public void commonBtnClick(String btnName, String msg){
        WebElement element = mergeAndFindMobileElement(btnName);
        elementClick(element, msg);
//        findandclick(btnName);
    }

    public String getCheckNumber(String msg)
    {
        WebElement checkNum=driver.findElement(By.xpath("(//p[contains(@class,'order-header-checkno')])"));
        checkNumber=checkNum.getText();
        TestUtils.globalCheckNumber=checkNumber;
        utils.log().info(checkNumber);
        return checkNumber;
    }

    public void clickSubmitButton(){
        WebElement element = mergeAndFindMobileElement(submitButton);
        elementClick(element, "click submitButton ");
    }

    public void clickClosedChecks(){
        WebElement element=mergeAndFindMobileElement(closedChecks);
        elementClick(element,"Click Closed Check");
    }

    public void passCheckNumber(){
        try {
            // wait 1 sec
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            // handling InterruptedException
        }
        WebElement searchElement = mergeAndFindMobileElement(closedSearchField);
//        searchElement.sendKeys(checkNumber);
        searchElement.equals(checkNumber);
//        findandclick_Skeys(closedSearchField,"Skeys",checkNumber);
//        WebElement tableElement = mergeAndFindMobileElement(checkNumber,"" , TestUtils.Accessibility);
//        tableElement.click();
        findandclick(checkNumber,"" , TestUtils.Accessibility);
    }

    public void clickReOpenCheck(){
        WebElement element=mergeAndFindMobileElement(reopenCheck);
        elementClick(element,"Click reopenCheck");
    }

    public void selectPaidOrder(){
        WebElement element = mergeAndFindMobileElement(paidOrder);
        elementClick(element, "click paidOrder ");
    }

    public boolean getVoidCheck(String msg) {
        WebElement element = mergeAndFindMobileElement(staticTxtXpath);
        Boolean isDisplayed = false;
        if (element.isDisplayed()) {
            isDisplayed = true;
        }
        utils.log().info(msg + " is " + isDisplayed);
        return isDisplayed;
    }

    public void clickSettingButton(){
        WebElement element = mergeAndFindMobileElement(settingIcon);
        elementClick(element,"Click Setting Button");
    }

    public void verifySettingOptions(){
        WebElement element = mergeAndFindMobileElement(operationMenuTitle);
        String actualName = elementGetText(element,"Verify Setting Options");
        String expectedName = "Operation";
        Assert.assertEquals(actualName,expectedName);
    }

    public void selectPOSSettingsTab(){
        WebElement element=mergeAndFindMobileElement(posSettings);
        elementClick(element,"Pos Settings Clicked");
    }

    public void openAskCustomerNameOptionIfDisable() throws Exception {
        WebElement element= mergeAndFindMobileElement(posSettingHeader);
        String actualName=elementGetText(element,"verify posSettingHeader");

        String expectedName = "Till Settings";

        Assert.assertEquals(actualName, expectedName);

       Thread.sleep(1500);

        WebElement askCustomerName = driver.findElement(By.xpath("//ion-item[contains(.,' Ask Customer Name ')]//ion-toggle[@aria-checked='false']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", askCustomerName);
        askCustomerName.click();

    }

    public void swipeUntilSaveChangesButton(String direction) throws Exception {
        direction = direction.toLowerCase();

        int i = 0;
        boolean found = false;

        while (i < 3) {
            try {
                if (isElementExists()) {
                    found = true;
                    break;
                } else {
                    scrollToElement(By.id(saveChangesButton), direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(By.id(saveChangesButton), direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
    }

    public void pressCancel() {
//        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement((WebElement) cancelBtn);
        elementClick(element,"Cancel button is clicked");

//        findandclickM(cancelBtn);
//        elementClick(cancelBtn, "Cancel button is clicked");
    }

    public void selectBarTabOrderType(){
        WebElement element = mergeAndFindMobileElement(barTabOrderTypeButton);
        elementClick(element,"Click BarTab OrderType");
    }

    public void enterCustomerNameForBarTab() throws InterruptedException {
        WebElement element = mergeAndFindMobileElement(BarTabCustomerNameTitle);
        String actualName = elementGetText(element,"Verify Enter the Customer Name");
        String expectedName = "Enter the Customer Name";

        Assert.assertEquals(expectedName,actualName);
        WebElement searchCustomer = mergeAndFindMobileElement(customerSearchTextBoxForBarTab);
        searchCustomer.sendKeys("Test Automation");
        Thread.sleep(3000);
        WebElement btnOK = mergeAndFindMobileElement(customerNameOkButton);
        elementClick(btnOK,"Click dineIn");
    }

    public void clickCashPaymentTab(){
        WebElement element = mergeAndFindMobileElement(cashOnMenuItemPage);
        elementClick(element, "click cashOnMenuItemPage ");
    }

    public void clickExactButtonOnCashTab(){

        WebElement element=mergeAndFindMobileElement(exactButton);
        elementClick(element,"Exact Button Clicked");
    }
    public void clickEnterButtonOnCashButton(){
        WebElement element1=mergeAndFindMobileElement(enterButton);
        elementClick(element1,"Enter Button Clicked");
    }

    public void verifyPaidOrderForSandwiches() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element=mergeAndFindMobileElement(cashPaymentMethodDiyez);
        String actualName = elementGetText(element,"verify cashPaymentMethodDiyez");
        String expectedName = "Cash(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(voidSandwichesAmount1);
        String actualName1 = elementGetText(element1,"verify voidSandwichesAmount");

        String expectedName1 = "1.00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void clickFinishButton(){
        WebElement element = mergeAndFindMobileElement(finishButton);
        elementClick(element,"Click Finish Button");
    }

    public void selectLastActiveCheckForBarTab() throws InterruptedException {
//        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
//        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[last()]");
//        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> activeOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < activeOrders.size(); index++) {
//
//            activeOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[5]"));
//
//            activeOrders.get(activeOrders.size() - 1).click();
//        }
        Thread.sleep(5000);
        List<WebElement> activeOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Test Automation\"]"));

        activeOrders.get(activeOrders.size()-1).click();
    }

    public String commonGetText(String Text, String msg) {
        WebElement element = mergeAndFindMobileElement(Text);
        String text =elementGetText(element, msg);
        return text;
//        return findAndGetText(Text);
    }


};

