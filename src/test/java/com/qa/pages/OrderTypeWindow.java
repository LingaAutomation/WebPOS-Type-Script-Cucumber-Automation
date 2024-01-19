package com.qa.pages;


import com.qa.utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class OrderTypeWindow extends ClockInScreen {

//    public WebDriver driver = TestUtils.driver;
//
//    public OrderTypeWindow() {
//
//        PageFactory.initElements(this.driver,this);
//    }

    @FindBy(xpath = "(//span[contains(.,'FORHERE')])[1]")
    private WebElement forHereBtn;

    @FindBy(xpath = "(//button[@id='os_tableMenu']//span[contains(.,'TOGO')])[1]")
    private WebElement togoBtn;

    @FindBy( xpath = "//p[.='Order Type']")
    private WebElement orderTypeWindow;

    @FindBy(xpath = "(//button[contains(.,'DELIVERY')])[1]")
    private WebElement deliveryBtn;



    @FindBy(xpath = "//button[@id='os_tableMenu']//span[contains(.,'PHONE TOGO')]")
    private WebElement phoneToGoBtnService;   //Added Today

//    @FindBy(xpath = "(//button[@id='os_tableMenu']//span[contains(.,'QSR')])[1]")
//    private  WebElement qsrServiceType;
//
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/div/button[1]")
    private  WebElement qsrServiceType;

    @FindBy(name = "Phone Delivery")
    private WebElement phoneDeliveryBtnService;//Added Today

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"To Go\"])[2]")
    private WebElement phoneToGoBtn;//Added Today
    @FindBy(xpath = "//button[@id='os_tableMenu']//span[contains(.,'PHONE DELIVERY')]")
    private WebElement phoneDeliveryBtn;//Added Today

    @FindBy(xpath = "//span[contains(.,'Done')]")
    private WebElement doneBtn;

    String cancelBtn= "//button[contains(.,'Cancel')]";

    @FindBy(id = "Order Type")
    private WebElement titleTxt;

    @FindBy(xpath = "//p[contains(.,'Seats')]")
    private WebElement emptyList;

    String OrderListWithSale = "//p[contains(@class,'orderlist')]/../div";
//    @FindBy(xpath = "(//XCUIElementTypeTable[@name=\"Empty list\"])[3]")
 //   private WebElement OrderListWithSale;

   String OrderListFromSearch= "//p[contains(@class,'orderlist')]/../div";

    @FindBy( name = "Egg White")
    private WebElement eggWhite;


    public String orderTypeName(String xpath){
        WebElement order = driver.findElement(By.xpath("(//span[contains(.,'"+xpath+"')])[1]"));
        return elementGetText(order,"Order Type xpath is - ");
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

      Thread.sleep(2000);
        elementClick(cancelBtn, "Order type selection is cancelled.");
    }

    @FindBy(name = "ADD")
    WebElement addBtnOrderScreen;

    @FindBy(name = "2")
    WebElement seat2Numbers;
    public String seat2Number= " ";
    public void addCreateSeatInOrderScreen(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        elementClick(addBtnOrderScreen,"Selected Button as - "+addBtnOrderScreen.getText());
        seat2Number = seat2Numbers.getText();
        TestUtils.seatNumberOrderScreen = seat2Number;
    }



    public void clickSeat1ForAddMenuItem(){
      WebElement seat1 = (WebElement) driver.findElement(By.xpath("//button[@id='1']"));
       elementClick(seat1,"selected seat - "+seat1.getText());
    }

    public void clickSeat2ForAddMenuItem(){
        WebElement seat1 = (WebElement) driver.findElement(By.xpath("//button[@id='2']"));
        elementClick(seat1,"selected seat - "+seat1.getText());
    }

    public void clickSeat3ForAddMenuItem(){
        WebElement seat1 = (WebElement) driver.findElement(By.xpath("//button[@id='3']"));
        elementClick(seat1,"selected seat - "+seat1.getText());
    }

    public CustomerProfileWindow pressDoneBtn() {
        elementClick(doneBtn, "Order type selection is done.");
        return new CustomerProfileWindow();
    }

    public String visibleEmpty() {
        return elementGetText(emptyList, "Got Nothing is Displayed - ");
    }

    public void clickMenuItem() throws InterruptedException {
        Thread.sleep(2000);
        elementClick("//p[contains(@class,'orderlist')]/..//div[@class='p-col-4 orderlist-menuname']","Tapped Menu Item");
    }
    public void getOrderList() throws InterruptedException {
        Thread.sleep(300);
        if (find(convertWebElement(OrderListWithSale),2)) {
            utils.log().info("Existing Sale is Visble");
        } else {
            utils.log().info("Existing Sale is not Visible");
        }
    }
    public String txt;
    public void pressOrderListWithSale(String menu) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement e= driver.findElement(By.xpath("//div[contains(@class,'p-col-4 orderlist-menuname')]"));
        utils.log().info(e.getText());
        if(e.getText().equals(menu)) {
            elementClick(e, "Tapped Menu Items to see Menu Option Screen");
        }else{
            utils.log().info("Not Displayed Menu Option Screen");
        }

    }


    public void verifySearchSaleAdded() throws InterruptedException {
Thread.sleep(300);
        if (find(convertWebElement(OrderListFromSearch),2)) {
            utils.log().info("Search Item is added to Order List");
        } else {
            utils.log().info("Search item is not added to order list");
            int i = 1/0;
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
        WebElement e=driver.findElement(By.xpath("//button[contains(@id,'os_menu')]"));
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
    public void verifyOrderTypeWindow() throws InterruptedException {
        Thread.sleep(1000);
        if(orderTypeWindow.isDisplayed()){
            utils.log().info("Order Type Window is displayed");
        }else{
            utils.log().info("Order Type Window is not displayed");
        }
    }

    public void selectServiceTypeAs(String name){
        WebElement serviceType = driver.findElement(By.xpath("//button[.=' "+name+" ']"));
        elementClick(serviceType,"Selected - "+name);
    }

    public void selectToGoOrderTypepopup(String text) {
        driver.findElement(By.xpath("(//span[contains(.,'"+text+"')])[1]")).click();
    }


}



