package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TGOrderTypeWindow extends ClockInScreen {

    public TGOrderTypeWindow(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[contains(.,'Change Due')]")
    private WebElement changeDue;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"To Go\"]")
//    private WebElement togoBtn;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Phone To Go\"]")
//    private WebElement phoneToGoBtn;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Phone Delivery\"]")
//    private WebElement phoneDeliveryBtn;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
//    private WebElement doneBtn;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
//    private WebElement cancelBtn;
//
//    @iOSXCUITFindBy(id = "Order Type")
//    private WebElement titleTxt;
//    private By deliveryButton = By.xpath("//XCUIElementTypeButton[@name=\"DELIVERY\"]");

    // 23 Nov start
    //edit xpath
//    private By forHereBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"For Here\"]");
    public By forHereBtn = By.id("For Here");

    //edit xpath
//    private By togoBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"To Go\"]");
    public By togoBtn = By.id("To Go");

    //edit xpath
//    private By phoneToGoBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"Phone To Go\"]");
    public By phoneToGoBtn = By.id("Phone To Go");

    //edit xpath
//    private By phoneDeliveryBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"Phone Delivery\"]");
    public By phoneDeliveryBtn = By.id("Phone Delivery");

    //edit xpath
//    private By doneBtn = By.xpath("//XCUIElementTypeButton[@name=\"Done\"]");
    public By doneBtn = By.id("Done");

    //edit xpath
//    private By cancelBtn = By.xpath("//XCUIElementTypeButton[@name=\"Cancel\"]");
    public By cancelBtn = By.id("Cancel");

    //edit xpath
    private By titleTxt = By.id("Order Type");
    private String orderTypeName;


    // 23 Nov end

    public String getTitle() {
        return elementGetText((WebElement) titleTxt, "user login window's title is - ");
    }

//    public void selectForHereOrderType() {
////        WebElement element=mergeAndFindMobileElement(forHereBtn);
//        elementClick(forHereBtn, "FORHERE order type is selected.");
//        WebElement element1=mergeAndFindMobileElement(doneButton);
//        elementClick(element1, "Click Done Button");
//
////        driver.findElement(doneButton).click();
//
//    }

    public void selectForHereOrderType() {
        WebElement element=mergeAndFindMobileElement(forHereBtn);
        elementClick(element, "FORHERE order type is selected.");
        WebElement element1=mergeAndFindMobileElement(doneButton);
        elementClick(element1, "Click Done Button");

//        driver.findElement(doneButton).click();

    }

    public void selectForHereOrderTypeInQSRBar() {
        WebElement element=mergeAndFindMobileElement(forHereBtn);
        elementClick(element, "FORHERE order type is selected.");

//        driver.findElement(doneButton).click();

    }

//    public void selectToGoOrderType() {
////        WebElement element=mergeAndFindMobileElement(togoBtn);
//        elementClick(togoBtn, "TOGO order type is selected.");
//    }

    public void selectToGoOrderType() {
        WebElement element=mergeAndFindMobileElement(togoBtn);
        elementClick(element, "TOGO order type is selected.");
    }

    public void selectDeliveryOrderType() {
        WebElement element=mergeAndFindMobileElement(deliveryButton);
        elementClick(element, "Delivery Button is selected.");
//        driver.findElement(deliveryButton).isDisplayed();
//        driver.findElement(deliveryButton).click();
    }

    //    public void selectPhoneToGoOrderType() {
// //       WebElement element=mergeAndFindMobileElement(phoneToGoBtn);
//        elementClick(phoneToGoBtn, "Phone To Go order type is selected.");
//    }
    public void selectPhoneToGoOrderType() {
        WebElement element=mergeAndFindMobileElement(phoneToGoBtn);
        elementClick(element, "Phone To Go order type is selected.");

//        driver.findElement(phoneToGoBtn).isDisplayed();
//        driver.findElement(phoneToGoBtn).click();
    }
    public void selectPhoneDeliveryOrderType() {
        WebElement element=mergeAndFindMobileElement(phoneDeliveryBtn);
        elementClick(element, "Phone Delivery order type is selected.");
    }

    public void pressCancelBtn() {
        WebElement element=mergeAndFindMobileElement(cancelBtn);
        elementClick(element, "Order type selection is cancelled.");
    }

    public TGCustomerProfilePage pressDoneBtn() {
        WebElement element=mergeAndFindMobileElement(doneBtn);
        elementClick(element, "Order type selection is Clicked.");
        return new TGCustomerProfilePage();
    }

    public void selectNowDeliveryOption() {
        WebElement element=mergeAndFindMobileElement(nowDeliveryOption);
        elementClick(element, "Now Delivery Option is Clicked.");
//        driver.findElement(nowDeliveryOption).isDisplayed();
//        driver.findElement(nowDeliveryOption).click();
    }

    public void clickDoneButtonForOrderType() {
        WebElement element=mergeAndFindMobileElement(orderTypeDoneButton);
        elementClick(element, "Order Type Done Button is Clicked.");
//        driver.findElement(orderTypeDoneButton).isDisplayed();
//        driver.findElement(orderTypeDoneButton).click();
    }

    public void selectLaterDeliveryOption() {
        WebElement element=mergeAndFindMobileElement(laterDeliveryOption);
        elementClick(element, "later Delivery Option is Clicked.");
//        driver.findElement(laterDeliveryOption).isDisplayed();
//        driver.findElement(laterDeliveryOption).click();
    }

    public void selectDeliveryDate() {
        WebElement element=mergeAndFindMobileElement(deliveryTimeDoneButton);
        elementClick(element, "Delivery Time Done Button is Clicked.");
//        driver.findElement(deliveryTimeDoneButton).isDisplayed();
//        driver.findElement(deliveryTimeDoneButton).click();
    }

    public void selectLastFutureOrder() {
//        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable");
//        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"STORE DELIVERY\"])[last()]");
//        phoneOrders.get(phoneOrders.size() - 1).click();

        List<WebElement> orders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));

        for(int index=0;index<orders.size();index++) {

            orders= (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"For Here\"])[1]"));
            orders.get(orders.size() - 1).click();
        }
    }

    public void clickPrinterButton() {
        WebElement element=mergeAndFindMobileElement(printerButton);
        elementClick(element, "printer Button is Clicked.");
//        driver.findElement(printerButton).isDisplayed();
//        driver.findElement(printerButton).click();
    }

    public void clickCancelOrder() {
        WebElement element=mergeAndFindMobileElement(cancelOrderButton);
        elementClick(element, "cancel Order Button is Clicked.");
//        driver.findElement(cancelOrderButton).isDisplayed();
//        driver.findElement(cancelOrderButton).click();

    }

    //    public void selectLastNewOrder() {
//        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
//        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"For Here\"])[last()]");
//        phoneOrders.get(phoneOrders.size() - 1).click();
////        List<WebElement> orders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
////
////        for (int index = 0; index < orders.size(); index++) {
////           /* WebElement firstOrder = orders.get(0);
////            driver.findElement(By.xpath(String.valueOf(firstOrder))).click();*/
////
////            orders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"For Here\"])[10]"));
////            orders.get(orders.size() - 1).click();
////        }
//    }
    //edited
    public void selectLastNewOrder() {
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"For Here\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
        //        List<WebElement> orders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
        //
        //        for (int index = 0; index < orders.size(); index++) {
        //           /* WebElement firstOrder = orders.get(0);
        //            driver.findElement(By.xpath(String.valueOf(firstOrder))).click();*/
        //
        //            orders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"For Here\"])[10]"));
        //            orders.get(orders.size() - 1).click();
        //        }
    }

    public void selectLastNewOrderForHereOrderType() {
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"For Here\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> orders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < orders.size(); index++) {
//           /* WebElement firstOrder = orders.get(0);
//            driver.findElement(By.xpath(String.valueOf(firstOrder))).click();*/
//
//            orders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"For Here\"])[1]"));
//            orders.get(orders.size() - 1).click();
//        }
    }
    public void selectLastNewOrderDineInOrderType() {
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"DineIn\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> orders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < orders.size(); index++) {
//           /* WebElement firstOrder = orders.get(0);
//            driver.findElement(By.xpath(String.valueOf(firstOrder))).click();*/
//
//            orders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"DineIn\"])[1]"));
//            orders.get(orders.size() - 1).click();
//        }
    }

    public void verifyVoidOrder() {
        List<WebElement> orders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));

        for (int index = 0; index < orders.size(); index++) {
            WebElement lastOrder = orders.get(orders.size() - 1);
            lastOrder.click();

            System.out.println("ArrayList : " + orders);
            System.out.println("Last element in arraylist : " + lastOrder);
        }
    }

    public void verifyLastNewOrder() {
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"STORE DELIVERY\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> orders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < orders.size(); index++) {
//           /* WebElement firstOrder = orders.get(0);
//            driver.findElement(By.xpath(String.valueOf(firstOrder))).click();*/
//
//            orders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"STORE DELIVERY\"])[last()]"));
//            orders.get(orders.size() - 1).click();
//        }
    }
    public void verifyLastFutureOrder(){

        List<WebElement> orders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));

        for (int index = 0; index < orders.size(); index++) {
            WebElement lastOrder = orders.get(orders.size() - 1);
            lastOrder.click();

            System.out.println("ArrayList : " + orders);
            System.out.println("Last element in arraylist : " + lastOrder);
        }
    }
    public void clickFutureButtonBelowPhoneOrder(){
        WebElement element=mergeAndFindMobileElement(futureButton);
        elementClick(element, "future Button is Clicked.");
//        driver.findElement(futureButton).isDisplayed();
//        driver.findElement(futureButton).click();
    }

    public void notSeeChangeDueMsg(){
        try {
            if (changeDue.isDisplayed()) {
                utils.log().info("Seen Change Due");
                Assert.assertEquals(changeDue.getText(),"Chanege");
            } else {
                utils.log().info("Not See Change Due");
            }
        }catch (Exception w)
        {
        }
    }

    //new (nov 16)
    public void paymentMadeOnPopup(){
        WebElement element=mergeAndFindMobileElement(paymentMadeOnMessage1);
        String actualName = elementGetText(element, "Get payment Made On Message.");
        String expectedName = "Payment(s) made on this check,Can you return this to thomas";

        Assert.assertEquals(actualName,expectedName);
//        WebElement element1=mergeAndFindMobileElement(doneButton);
//        elementGetText(element1,"Done Button Clicked");
    }

}

