package com.qa.pages;


import com.qa.utils.TestUtils;
import static com.qa.utils.TestUtils.driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CIOrderPage  extends BasePage {

    // Using Elements: Pancake, Onion rings,Sandwiches,Hamburger,
    //                 Fixed gratuity,tax,subtotal,discount,gratuity,paid amount
    String itemXPath = "//XCUIElementTypeStaticText[@name=\"{0}\"]";

    // Using Elements: paymentPin1 for partial payment
    String btnPaymentPin1="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[@name=\"{0}\"]";

    // Using Elements: Cancel , Payment, Gratuity ,paymentPin0,paymentPin5,paymentPin00,
    String btnCommonXPath = "//XCUIElementTypeButton[@name=\"{0}\"]";

    // Using Elements: Cash button in the payment page
    String btnCashXPath = "(//XCUIElementTypeStaticText[@name=\"{0}\"])[2]";

    // Using Elements: Options button in order page
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[3]\n")
//    private MobileElement btnOption;
    String option = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[3]\n";

    // Using Elements: Exit button in payment page
    String btnExit="//XCUIElementTypeButton[@name=\"  Exit\"]";

    String amountXpath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[{0}]";

    public void clickMenuItem(String item, String msg) throws Exception {
//        MobileElement elementValue = mergeAndFindElement(itemXPath,item ,TestUtils.XPath);
        findandclick(itemXPath,item ,TestUtils.XPath);
//        elementClick(elementValue,msg);
    }

    public String txtValue(String item, String msg) {
//        MobileElement elementValue = mergeAndFindElement(item, "",TestUtils.Accessibility);
//        String text = elementGetText(elementValue, msg);
        return findAndGetText(item, "",TestUtils.Accessibility);
    }

    public void verifyDiscountAs(String value, String msg){
        WebElement element = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        Assert.assertEquals(element.getAttribute("value"), value);
        utils.log().info("Discount as - "+element.getAttribute("value")+" "+msg);

    }
    public void clickBtnOption(String msg) {
//        MobileElement element = mergeAndFindElement(option, "",TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(option, "",TestUtils.XPath);
    }

    public void commonBtnClick(String btnName, String msg) {
//        MobileElement element = mergeAndFindElement(btnName, "",TestUtils.Accessibility);
//        elementClick(element, msg);
        findandclick(btnName, "",TestUtils.Accessibility);
    }

    public void commonBtnClickOption(String optionName, String msg) {
//        MobileElement element = mergeAndFindElement(optionName, "",TestUtils.Accessibility);
//        elementClick(element, msg);
        findandclick(optionName, "",TestUtils.Accessibility);
    }

    public void BtnClickCash(String optionName, String msg) {
//        MobileElement element = mergeAndFindElement(btnCashXPath, optionName,TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnCashXPath, optionName,TestUtils.XPath);
    }

    // Enter partial payment amount as 10500
    public void pressPaymentPin(String paymentPin1XPath, String paymentPin0XPath,
                                String paymentPin5XPath, String paymentPin00XPath) {
        WebElement elementPin1 = driver.findElement(By.xpath("//ion-row[@class='payment-numberpad-grid-button md hydrated']//button[.=' "+paymentPin1XPath+" ']"));
        click(elementPin1, paymentPin1XPath);

        WebElement elementPin0 = driver.findElement(By.xpath("//ion-row[@class='payment-numberpad-grid-button md hydrated']//button[.=' "+paymentPin0XPath+" ']"));
        click(elementPin0, paymentPin0XPath);

        WebElement elementPin5 = driver.findElement(By.xpath("//ion-row[@class='payment-numberpad-grid-button md hydrated']//button[.=' "+paymentPin5XPath+" ']"));
        click(elementPin5, paymentPin5XPath);

        WebElement elementPin00 = driver.findElement(By.xpath("//ion-row[@class='payment-numberpad-grid-button md hydrated']//button[.=' "+paymentPin00XPath+" ']"));
        click(elementPin00, paymentPin00XPath);
//        findandclick(btnPaymentPin1, paymentPin1XPath,TestUtils.XPath);
//        findandclick(btnPaymentPin1, paymentPin0XPath,TestUtils.XPath);
//        findandclick(btnPaymentPin1, paymentPin5XPath,TestUtils.XPath);
//        findandclick(btnPaymentPin1, paymentPin00XPath,TestUtils.XPath);

    }

    public void clickExit(String msg) {
//        MobileElement element = mergeAndFindElement(btnExit, "",TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnExit, "",TestUtils.XPath);
    }

    public String getAmount(String number,String msg){
//        MobileElement element = mergeAndFindElement(amountXpath, number,TestUtils.XPath);
//        String text=elementGetText(element,msg);
        return findAndGetText(amountXpath, number,TestUtils.XPath);
    }
}
