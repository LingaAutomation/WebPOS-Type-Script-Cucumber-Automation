package com.qa.pages;


import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class OrderTypeWindow extends ClockInScreen {

    @iOSXCUITFindBy(accessibility = "For Here")
    private WebElement forHereBtn;

    @iOSXCUITFindBy(accessibility = "To Go")
    private WebElement togoBtn;

    @iOSXCUITFindBy( accessibility = "Order Type")
    private WebElement orderTypeWindow;


    @iOSXCUITFindBy(accessibility = "Delivery")
    private WebElement deliveryBtn;

    @iOSXCUITFindBy(accessibility = "Phone To Go")
    private WebElement phoneToGoBtnService;//Added Today

    @iOSXCUITFindBy(accessibility = "QSR")
    private  WebElement qsrServiceType;

    @iOSXCUITFindBy(accessibility = "Phone Delivery")
    private WebElement phoneDeliveryBtnService;//Added Today

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"To Go\"])[2]")
    private WebElement phoneToGoBtn;//Added Today
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Delivery\"])[2]")
    private WebElement phoneDeliveryBtn;//Added Today

    @iOSXCUITFindBy(accessibility = "Done")
    private WebElement doneBtn;

    @iOSXCUITFindBy(accessibility = "Cancel")
    private WebElement cancelBtn;

    @iOSXCUITFindBy(id = "Order Type")
    private WebElement titleTxt;

    @iOSXCUITFindBy(accessibility = "Empty list")
    private WebElement emptyList;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTable[@name=\"Empty list\"])[3]")
    private WebElement OrderListWithSale;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTable[@name=\"Empty list\"])[4]")
    private WebElement OrderListFromSearch;

    @iOSXCUITFindBy( accessibility = "Egg White")
    private WebElement eggWhite;


    public String orderTypeName(String name){
        WebElement order=mergeAndFindElement(name,"",TestUtils.Accessibility);
        return elementGetText(order,"Order Type name is - ");
    }

    public String getTitle() {
        return elementGetText(titleTxt, "user login window's title is - ");

    }

    public void selectForHereOrderType() {
        elementClick(forHereBtn, "FORHERE order type is selected.");
    }

    public void selectToGoOrderType() {
        elementClick(togoBtn, "TOGO order type is selected.");
    }

    public void selectDeliveryOrderType() {
        elementClick(deliveryBtn, "DELIVERY order type is selected.");
    }

//    public void selectPhoneToGoOrderType() {
//        elementClick(phoneToGoBtn, "Phone To Go order type is selected.");
//    }
//
//    public void selectPhoneDeliveryOrderType() {
//        elementClick(phoneDeliveryBtn, "Phone Delivery order type is selected.");
//    }

    // Nov 15 2021
    public void selectPhoneToGoOrderType() {
        //elementClick(phoneToGoBtn, "Phone To Go order type is selected.");
        if (find(phoneToGoBtnService, 2)) {
            elementClick(phoneToGoBtnService, "Phone To Go order type is selected");  //Benseron - (11/11/2021)
        } else {
            elementClick(phoneToGoBtn, "Phone To Go order type is selected.");
        }
    }
    // Nov 15 2021
    public void selectPhoneDeliveryOrderType() {
        if (find(phoneDeliveryBtn, 2)) {
            elementClick(phoneDeliveryBtn, "Phone Delivery order type is selected.");
            // elementClick(phoneDeliveryBtnService, "Phone Delivery order type is selected");  //Benseron - (11/11/2021)
        } else {
            elementClick(phoneDeliveryBtnService, "Phone Delivery order type is selected");
        }
    }

    public void pressCancelBtn() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
      Thread.sleep(1000);
        elementClick(cancelBtn, "Order type selection is cancelled.");
    }

    @iOSXCUITFindBy(accessibility = "ADD")
    WebElement addBtnOrderScreen;

    @iOSXCUITFindBy(accessibility = "2")
    WebElement seat2Numbers;
    public String seat2Number= " ";
    public void addCreateSeatInOrderScreen(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        elementClick(addBtnOrderScreen,"Selected Button as - "+addBtnOrderScreen.getText());
        seat2Number = seat2Numbers.getText();
        TestUtils.seatNumberOrderScreen = seat2Number;
    }



    public void clickSeat1ForAddMenuItem(){
      WebElement seat1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText"));
       elementClick(seat1,"selected seat - "+seat1.getText());
    }

    public CustomerProfileWindow pressDoneBtn() {
        elementClick(doneBtn, "Order type selection is done.");
        return new CustomerProfileWindow();
    }

    public String visibleEmpty() {
        return elementGetText(emptyList, "Got Nothing is Displayed - ");
    }

    public void clickMenuItem(){
        elementClick(OrderListWithSale,"Tapped Menu Item");
    }
    public void getOrderList() {
        if (find(OrderListWithSale,2)) {
            utils.log().info("Existing Sale is Visble");
        } else {
            utils.log().info("Existing Sale is not Visible");
        }
    }

    public void pressOrderListWithSale(String menu) {

            WebElement e = mergeAndFindElement("(//XCUIElementTypeTable[@name=\""+menu+" \"]","",TestUtils.XPath);
                elementClick(e,"Tapped Order List");

    }


    public void verifySearchSaleAdded() {

        if (find(OrderListFromSearch,2)) {
            utils.log().info("Search Item is added to Order List");
        } else {
            utils.log().info("Search item is not added to order list");
        }
    }

    public void verifyModifierInOrderList() {
        WebElement e=mergeAndFindElement( "(//XCUIElementTypeStaticText[@name=\" Butter\"])[2]","",TestUtils.XPath);
        if (find(e,2)) {
            utils.log().info("Modifiers are Added");
        } else {
            utils.log().info("Modifiers not Added");
        }
    }

    public void clickServiceTypeBtn(){
        WebElement e=mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]","",TestUtils.XPath);
        String orderType = e.getText();
        elementClick(e,"Tapped Order Type as - "+orderType);
    }

    public void selectQsrOrderType(){
        elementClick(qsrServiceType,"Tapped QSR Service Type");
    }

    public void selectPhoneToGoServiceType() {
        elementClick(phoneToGoBtnService, "Phone To Go order type is selected.");//Added Today
    }

    public void selectPhoneDeliveryServiceType() {
        elementClick(phoneDeliveryBtn, "Phone Delivery order type is selected.");//Added Today
    }
    public void verifyOrderTypeWindow(){
        if(find(orderTypeWindow,2)){
            utils.log().info("Order Type Window is displayed");
        }else{
            utils.log().info("Order Type Window is not displayed");
        }
    }

    public void selectServiceTypeAs(String name){
        WebElement serviceType = (WebElement) driver.findElement(By.xpath(name));
        elementClick(serviceType,"Selected - "+name);
    }

}


