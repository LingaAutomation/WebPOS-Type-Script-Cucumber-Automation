package com.qa.pages;


import com.qa.utils.TestUtils;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.text.DecimalFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrderManagementScreen extends OrderTypeWindow{

//    public static WebDriver driver=TestUtils.driver;

//    public OrderManagementScreen(){
////        super(TestUtils.driver);
//
//        PageFactory.initElements(this.driver,this);
//    }

    public String checkNumber="";

    public String checkNumber1="";//Added Today

    public String modifier="";  //Added 23Nov

    @FindBy(xpath = "Counting Machine" ) //id("Counting Machine").click();
    private WebElement countingMachineBtn;

    @FindBy(xpath = "//button[@id='os_all']")
             WebElement allBtn;
//   String allBtn  = "//button[@id='os_all']";

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"QSR\"])[2]")
    private WebElement QSRCombo;

    @FindBy(xpath = "Dine In")
    private WebElement DineInCombo;

    @FindBy(xpath = "Bar Tab")
    private WebElement BarTabCombo;

    @FindBy(xpath = "To Go")
    private WebElement ToGoCombo;

    @FindBy(xpath = "Delivery")
    private WebElement deliveryCombo;


//    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Phone To Go\"][1])")
//    private WebElement PhoneToGoCombo;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"QSR\"])[3]")
    private WebElement QSROrderTypeBtn;

    @FindBy(xpath = "//button[.=' 1 ']" ) //seat number1
    private WebElement seat1;

    @FindBy(xpath = "//button[.=' 2 ']" ) //seat number2
    private WebElement seat2;

    @FindBy(xpath = "//button[.=' 3 ']" ) //seat number3 -to be deleted
    private WebElement seat3;

    String arrowDownForOtherMenuItems ="//button[@id='os_catMenu']";

  String doneForThisMenuItem = "//button[contains(.,'Done')]";

    String arrowDownBtn1 = "//ion-grid[@class='qsrSeats md hydrated']/ion-row/ion-col[2]/button[2]";



    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"arrow down\"])[2]")
    private WebElement arrowDownBtn2;

    @FindBy(xpath = "Tax" )
    private WebElement taxLbl;

                              //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeImage[2]
    @FindBy(xpath = "/html/body/app-root/app-dashboard-container/ion-app/ion-content/ion-grid/ion-row/ion-col[1]/app-order-list-container/ion-app/ion-content/div/app-ordered-list/ion-app/ion-content/div/div/div/div[2]/div/div/div[4]/img")
    private WebElement TickIcon;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeImage[2]")
    private WebElement holdIcon;

    @FindBy(xpath = "//p[.='Hold item(s) has to be sent to kitchen']")
    private WebElement doYouWantToSendHoldMenuItemToKitchen;

    @FindBy(xpath = "//p[.='Do you want to send hold item(s) to kitchen ?']")
    private WebElement doYouWantToSendHoldMenuItemToKitchen2;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-alertcontent/mat-dialog-content")
    private WebElement doYouWantToSendHoldMenuItemToKitchen1;
    @FindBy(xpath = "//button[.=' Yes ']")
    private WebElement yesForHold;

    @FindBy(xpath = "//p[contains(.,'No More payments Needed')]")
    private WebElement noMorePaymentNeed;

    @FindBy(xpath = "//p[contains(.,'No More payments Needed')]")
    private WebElement noMorePaymentNeed1;

    @FindBy(xpath = "(//p[.='You need to order before paying'])")
    private WebElement youNeedToOrderBeforeYouPay;

    @FindBy(xpath = "//p[contains(.,' Void Reason ')]")
    private WebElement voidReason;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"T2\"]")
    private WebElement tableOrderNumber;

    @FindBy (xpath = "(//label[(.='Modifiers')])")
    private WebElement modifierScreen;

    /****** Categories ******/

    String pizzaCategoryBtn = "//div[contains(@class,'center-name category-container')]/div[contains(.,'PIZZA')]";

    String breakFastBtn = "//div[contains(@class,'center-name category-container')]/div[contains(.,'Breakfast')]";

    String upchargeBtn = "//div[contains(@class,'center-name category-container')]/div[contains(.,'upcharge category')]";

    String beveragesBtn = "//div[contains(@class,'center-name category-container')]/div[contains(.,'Beverages')]";

    String foodCategoryBtn = "//div[contains(@class,'center-name category-container')]/div[contains(.,'FOOD')]" ;


    String pastaCategoryBtn = "//div[contains(@class,'center-name category-container')]/div[contains(.,'Pasta')]";

    String menuCategoryBtn = "//div[contains(@class,'center-name category-container')]/div[contains(.,'Menu')]";

    String dessertsCategoryBtn= "//div[contains(@class,'center-name category-container')]/div[contains(.,'Desserts')]" ;

    String saladCategoryBtn= "//div[contains(@class,'center-name category-container')]/div[contains(.,'Salad')]";

    String appetizersCategoryBtn= "//div[contains(@class,'center-name category-container')]/div[contains(.,'Appetizers')]" ;

    @FindBy(xpath = "Briyani")
    private WebElement briyaniBtn;

    //Open Item Menu Item

    @FindBy(xpath = "Tiramisu ")
    private WebElement tiramisuBtn;

    @FindBy(xpath = " NO TOMATO")
    private WebElement noTomatoMdf;

    @FindBy(xpath = "//span[contains(.,' Continue ')]")
    private WebElement continueButton;


    /***********************/

    @FindBy(xpath = "Done")
    private WebElement doneReceiptPrinter;

//    @FindBy(xpath = "ADD")
//    private WebElement addSeatBtn;

    @FindBy(xpath = "//button[@id='os_addSeat']")
    WebElement addSeatBtn;

    String editDeleteSeatsBtn = "//div[@role='menu']/div/div/ion-grid/ion-row/ion-footer/button";

    String doneDeleteSeatsBtn = "//div[@role='menu']/div/div/ion-grid/ion-row/ion-footer/button";

    @FindBy(xpath = "Delete_Seats")
    private WebElement delSeats;

    @FindBy(xpath = "//button[(@id='os_finish')]" )
    private WebElement finishOrderBtn;

    String optionBtn = "//linga-icon/../div[contains(.,'Option')]";

 //   @FindBy(xpath = "Option" )
 //   private WebElement optionBtn;

    @FindBy(xpath = "//ion-row/button[contains(.,'Order')]")
    private WebElement orderBtn;

    @FindBy(xpath = "//p[.='Already sent to Kitchen']")
    private WebElement alreadySentToKitchenTxt;

    @FindBy(xpath = "//button[.=' Done ']")
    private WebElement doneAlreadySentToKitchen;

    @FindBy(xpath = "//button[contains(.,'Payment')]")
    private WebElement paymentBtn;

    @FindBy(xpath = "//p[contains(.,'Payment(s) made on this Check, Can you return this to Walkin Walkin')]")
    private WebElement paymentMadeOnThisCheckPopup;

    @FindBy(xpath ="//p[contains(.,'Payment(s) made on this Check, Can you return this to Walkin Test Automation')]")
    private WebElement paymentMadeOnThisCheckPopup1;

    @FindBy(xpath = "Payment(s) made on this check,Can you return this to Auto ragav")
    private WebElement paymentMadeOnThisCheckPopupForHouseAccount;

    @FindBy(xpath = "//button//div[contains(.,'Print')]")
    private WebElement printBtn;

    @FindBy(xpath = "/html/body/app-root/app-dashboard-container/ion-app/ion-content/ion-grid/ion-row/ion-col[1]/app-order-list-container/ion-app/ion-content/div/app-ordered-list/ion-app/ion-content/div/div/div/div[2]/div/div/div[4]/img")
    private WebElement handIconForHold;

    String voidBtn = "//linga-icon/../div[contains(.,'Void')]";

    String allOrdersAreVoided = "//p[contains(.,'All Orders Are Voided')]";
   // @FindBy (xpath = "All orders are voided")
   // private WebElement allOrdersAreVoided;



    //Void!!
    @FindBy(xpath = "//button[contains(.,' Ordered Wrongly ')]")
    private WebElement orderedWronglyReason;

    @FindBy(xpath = "/html/body/div/div[2]/div/mat-dialog-container/app-voidreason/ion-footer/div[2]/button[2]")
    private WebElement addVoidReasonBtn;

    @FindBy(xpath = "(//button[contains(.,' Add ')])[1]")
    private WebElement addVoidReasonBtn1;


    //Add new customer to table
    @FindBy(xpath = "//button[@id='os_customer']")
    private WebElement addCustomerToTableBtn;

    @FindBy(xpath = "Add New")
    private WebElement addNewBtn;

    @FindBy(xpath = "//input[(@placeholder='Search customer by Name/Email')]")
    private WebElement search;

    String searchOrderScreen = "//label[contains(.,'Search Item')]";
 //   @FindBy(xpath = "Search")
//    private WebElement searchOrderScreen;

    String searchField = "(//input[@type='search'])[1]";

//    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
//    private WebElement searchField;

    @FindBy(xpath = "Tiramisu")
    private WebElement tiramisuMenu;


    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]")
    private WebElement checkNO;

    @FindBy(xpath = "//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[157]")
    private WebElement lastRow;

    /******************* Tax MENU Item **************************/
    @FindBy(xpath = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Ravioli')])[1]")
    private WebElement ravioliMenu;

    @FindBy(xpath = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Ravioli Pesto')])[1]")
    private WebElement ravioliPestoMenu;

    @FindBy(xpath = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Fus Rapini')])[1]")
    private WebElement fusRapiniMenu;

    @FindBy(xpath = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Cheesecake')])[1]")
    private WebElement CheeseckaeMenu;


    @FindBy(xpath = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Fett Fr di Mare')])[1]")
    private WebElement fettFrDiMareMenu;

    @FindBy(xpath = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Ling Meatballs')])[1]")
    private WebElement lingMeatballsMenu;

    @FindBy(xpath = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Potatoes')])[1]")
    private WebElement potatoesMenu;

    @FindBy(xpath = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Cannoli')])[1]")
    private WebElement cannoliMenu;

    @FindBy(xpath = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'TEA')])[1]")
    private WebElement teaMenu;


    @FindBy(xpath = "//div[@class='free-section']//div[contains(@class,'p-col-4 discount-section-name disc-padding')]")
    private WebElement onionRingEachMenu;

    @FindBy(xpath = "//div[@class='free-section']//div[contains(@class,'p-col-4 discount-section-name disc-padding')]")
    private WebElement dosaEachMenu;

    @FindBy(xpath = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Ling Littlenck')])[1]")
    private WebElement lingLittlenckMenu;

    @FindBy(xpath = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Ling Pes Shrimp')])[1]")
    private WebElement lingPesShrimpMenu;

    @FindBy(xpath = "//button[contains(.,' Remove')]")
    private WebElement removeBtn;

    @FindBy(xpath = "//p[.=' Walk-in ']")
    private WebElement walkinBtn;

    @FindBy(xpath = "//ion-title[contains(.,'Customer Profile')]")
    private WebElement customerProfileWindow;

    @FindBy(xpath = "Dine In")
    private WebElement dineInService;

    String seat2Del = "/html/body/div/div[2]/div/div/div/div/ion-grid/ion-row/div/button[2]/span[1]/div";

    String  closeYourSaleTxt = "//mat-dialog-content[contains(.,'Close Your Sale')]";

    String  closeTheSaleTxt = "//mat-dialog-content[contains(.,'close the sale')]";

    String logOffBtn = "//button[@id='os_logOff']";

    String splitBtn= "//linga-icon[@symbol='split']";

    @FindBy(xpath = "Cannot add modifiers, item already send to kitchen")
    private WebElement cannotAddModifier;

    @FindBy(xpath = "______ NO MENU ITEMS FOUND IN \"PAROTTAS\" ______")
    private WebElement noMenuItemTxt;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Button\"])[2]")
    private WebElement laterBtn;

    @FindBy(xpath = "Delete")
    private WebElement deleteBtn;

    @FindBy(xpath = "You cannot delete this Discount")
    private WebElement youCannotDeleteTxt;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[1]")
    private WebElement doneButton;


    @FindBy(xpath = "Cancel")
    private WebElement cancelBtnConversational;

    //@FindBy(xpath = ""//XCUIElementTypeStaticText[@name=\"Cancel\"]")

    @FindBy(xpath = "Start Over")
    private WebElement startOverBtn;

    @FindBy(xpath = "Done")
    private WebElement doneBtnConversational;

    @FindBy(xpath = "Alternate modifier")
    private WebElement alternateModifier;

    @FindBy(xpath = "Alternate Modifier")
    private WebElement alternateModifierScreen;

    @FindBy(xpath = "Ok")
    private WebElement okBtnAlternateModifier;

    @FindBy(xpath = "Revert")
    private WebElement revertBtn;

    @FindBy(xpath = "Cannot remove customer for Delivery")
    private WebElement cannotRemoveCustomerForDelivery;

    @FindBy (xpath = "You need to pick at least 1 modifiers from this Group")
    private WebElement youNeedToPickAtLeast1ModifiersFromThisGroup;


    public TillManagementScreen pressCountingMachineBtn(){
        elementClick(countingMachineBtn, "Counting Machine button pressed - ");
        return new TillManagementScreen();
    }

    public void pressOrderBtn(){
        elementClick(orderBtn, "Order button pressed - ");
    }

    public void pressAll() {
        elementClick(allBtn, "Tapped All button");
    }

    public void pressArrowDown1 (){
        elementClick(arrowDownBtn1, "ArrowDown Button 1 is tapped");
    }

    public void pressArrowDown2 () throws InterruptedException {
        Thread.sleep(1000);
        elementClick(arrowDownForOtherMenuItems, "the rest of the categories is listed");
    }

    public void checkNoOfSeats(String seatNo){
        WebElement seat=driver.findElement(By.xpath(seatNo));
        if(seat.isDisplayed()){
            utils.log().info("Seats are created correctly");
        }
        else
        {
            utils.log().info("Seats are not created correctly");
        }
    }
    public void noOfSplit(String splitNo){
        WebElement seat=driver.findElement(By.xpath(splitNo));
        if (seat.isDisplayed()){
            utils.log().info("Splits are created correctly - "+splitNo );
        }else
        {
            utils.log().info("Seats are not created correctly");
        }
    }

    public void addNewSeat(){
        elementClick(addSeatBtn, "added a new seat to the table");
    }

    public void openCustomerSelectionMenu(){
        elementClick(addCustomerToTableBtn, "customer list is opened");
    }

    public void shouldSeeTheAddCustomerWindow() throws InterruptedException {
        Thread.sleep(2000);
        if(driver.findElement(By.xpath("//p[contains(.,'Add Customer ')]")).isDisplayed()){
            utils.log().info("Displayed Add Customer WIndow");
        }else{
            utils.log().info("Not Displayed Add Customer Window");
            int w = 1/0;
        }
    }

    public void clickXBtn(){
        elementClick("//app-customer-container[@class='ng-star-inserted']//span[contains(.,'X')]","Selected X");
    }

    public void clickAddNewBtn(){
        elementClick(addNewBtn,"Tapped Add New Button");
    }

    public void searchForCustomer(String customerName) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        elementClick("//button[contains(.,'By Name / Email')]","BY Name / Email");
        sendKeys(search, customerName);
    }

    public void clickByNameEmail(){
        elementClick("//button[contains(.,'By Name / Email')]","BY Name / Email");
    }

    public void clickAddCustomerBtnFrom(){
        sendKeys(search, "huh");
        elementClick("//button[contains(.,' + Add customer ')]","Selected Add Customer");
    }

    public void selectCustomerNameToAddToTheTable(String customerName){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement customer = driver.findElement(By.xpath("(//span[contains(.,'"+customerName+"')])[1]"));
        elementClick(customer,"Tapped Customer - "+customerName);
    }

    public void selectCustomerNameAsToAddToTheTable(String customerName){
        WebElement customer = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+customerName+" \"]"));
        elementClick(customer,"Tapped Customer - "+customerName);
    }


    public void deleteSeat() throws InterruptedException {
        pressArrowDown1();
        Thread.sleep(2000);
        elementClick(editDeleteSeatsBtn,"editDeleteSeatsBtn is tapped");
        Thread.sleep(2000);
        elementClick("//button[@class='mat-focus-indicator mat-button mat-button-base active _mat-animation-noopable ng-star-inserted']//span[contains(.,' 3 ')]","selected seat3 to be deleted");
        Thread.sleep(2000);
        elementClick(doneDeleteSeatsBtn,"doneDeleteSeatsBtn is tapped");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='cdk-overlay-container']")).click();
    }

    public void deleteSeat2() throws InterruptedException {
        pressArrowDown1();
        elementClick(editDeleteSeatsBtn,"editDeleteSeatsBtn is tapped");
        elementClick(seat2Del,"Selected seat 2 to be deleted");
        elementClick(doneDeleteSeatsBtn,"doneDeleteSeatsBtn is tapped");
        Thread.sleep(1000);
//        pressArrowDown1();
        driver.findElement(By.xpath("//div[@class='cdk-overlay-container']")).click();
    }

    public void selectSeat1(){
        elementClick(seat1, "selected seat 1" );
    }

    public void selectSeat2(){
        elementClick(seat2, "selected seat 2" );
    }

    public void selectSeats(String value){
        WebElement seat =  driver.findElement(By.xpath(value));
        elementClick(seat,"Selected Seat - "+seat.getText());
    }

    public void selectQSRCombo(){
        elementClick(QSRCombo, "Order type combo is pressed");
    }

    public void selectDineIn(){
        elementClick(DineInCombo,"Dine In Order type combo is pressed");
    }

    public void selectBarTab(){
        elementClick(BarTabCombo,"Bar Tab Order type combo is pressed");
    }

    public void selectToGo(){
        elementClick(ToGoCombo,"TO GO Order type combo is pressed");
    }

    public void selectPhoneToGo(){
        elementClick(ToGoCombo,"Phone TO GO Order type combo is pressed");
    }

    public void selectDelivery(){
        elementClick(deliveryCombo,"Delivery Order type combo is pressed");
    }

    public void selectQSROrderType(){
        elementClick(QSROrderTypeBtn, "Order type combo is pressed" );
    }

    public void selectNoTomato(String modify){
        elementClick("//div[contains(@class,'modifier-section')]//div[contains(.,'"+modify+"')]","Selected Modifier as - "+modify);
    }
    /****** add a customer ******/

    public WebElement convertCustomerNameToMobileElement(String customerName){
        return  driver.findElement(By.xpath(customerName));
    }

    /****** verify already sent to kitchen ******/

    public String getAlreadySentToKitchenPopUpTxt(){
        return elementGetText(alreadySentToKitchenTxt, "Already sent to kitchen text is -");
    }

    public void pressDoneAlreadySentToKitchen (){
        elementClick(doneAlreadySentToKitchen, "Done (already sent to Kitchen pop-up) is tapped");
    }
    /****** Select Order Types ******/

    public void selectOrderType(String orderType){
        WebElement e = driver.findElement(By.xpath(orderType));
        elementClick(e, orderType + " selected");
    }


    /****** Select Categories ******/

    public void selectPizzaCategory() throws Exception {
        pressArrowDown2();
            elementClick(pizzaCategoryBtn, "Tapped Side CC Button");
    }

    public void selectBreakfastCategory() throws Exception {
        pressArrowDown2();
      //  elementClick(breakFastBtn, "Breakfast Category selected");
        try {
            if (find(convertWebElement(breakFastBtn), 2)) {
                elementClick(breakFastBtn, "Tapped Side CC Button");
            } else {
                scrollToElementCategory( "up");
                elementClick(breakFastBtn, "Tapped Side CC Button");
            }
        } catch (Exception e) {
            scrollToElementCategory( "down");
            elementClick(breakFastBtn, "Tapped Side CC Button");
        }
    }
    public void selectBriyaniSubCategory(){
        elementClick(briyaniBtn,"Briyani Sub-Category selected");
    }

    public void selectBeverages() throws Exception {
        pressArrowDown2();
//        elementClick(beveragesBtn,"Beverages Category selected");
        try {
            if (find(convertWebElement(beveragesBtn), 2)) {
                elementClick(beveragesBtn, "Tapped Side CC Button");
            } else {
                scrollToElementPayments(convertWebElement(beveragesBtn), "up");
                elementClick(beveragesBtn, "Tapped Side CC Button");
            }
        } catch (Exception e) {
            scrollToElementPayments(convertWebElement(beveragesBtn), "down");
            elementClick(beveragesBtn, "Tapped Side CC Button");
        }
    }

    public void selectUpcharge() throws Exception {
        pressArrowDown2();

        try {
            if (find(convertWebElement(upchargeBtn), 2)) {
                elementClick(upchargeBtn, "Tapped PAsta Button");
            } else {
                scrollToElementCategory( "up");
                elementClick(upchargeBtn, "Tapped Pasta Button");
            }
        } catch (Exception e) {
            scrollToElementCategory( "down");
            elementClick(upchargeBtn, "Tapped Pasta Button");
        }
    }

    public void selectPastaCategory() throws Exception {
        Thread.sleep(1000);
        pressArrowDown2();
        Thread.sleep(1000);
       // elementClick(pastaCategoryBtn, "Pizza Category selected");
        try {
            if (find(convertWebElement(pastaCategoryBtn), 2)) {
                elementClick(pastaCategoryBtn, "Tapped PAsta Button");
            } else {
                scrollToElementCategory( "up");
                elementClick(pastaCategoryBtn, "Tapped Pasta Button");
            }
        } catch (Exception e) {
            scrollToElementCategory( "down");
            elementClick(pastaCategoryBtn, "Tapped Pasta Button");
        }
    }
    public void selectMenuCategory() throws Exception {
        Thread.sleep(1000);
        Thread.sleep(200);
        pressArrowDown2();
        Thread.sleep(200);
        elementClick(menuCategoryBtn, "Pizza Category selected");
//        categorySelection(String.valueOf(menuCategoryBtn));

    }

    public void selectDessertsCategory() throws Exception {
        Thread.sleep(1000);
        Thread.sleep(200);
        pressArrowDown2();
        Thread.sleep(200);
        try {
            if (find(convertWebElement(dessertsCategoryBtn), 2)) {
                elementClick(dessertsCategoryBtn, "Tapped PAsta Button");
            } else {
                scrollToElementCategory( "up");
                elementClick(dessertsCategoryBtn, "Tapped Pasta Button");
            }
        } catch (Exception e) {
            scrollToElementCategory( "down");
            elementClick(dessertsCategoryBtn, "Tapped Pasta Button");
        }
    }

    public WebElement cate;
    public void categorySelection(String category) throws Exception {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        Thread.sleep(2000);
        pressArrowDown2();
        Thread.sleep(1500);
        cate =  driver.findElement(By.xpath("//div[contains(@class,'center-name category-container')]/div[contains(.,'"+category+"')]"));
        elementClick(cate,"Selected - "+cate.getText());
    }
String xpath = "//XCUIElementTypeStaticText[@name=\"{0}\"]";
public void selectCatc(String category) throws Exception {
            pressArrowDown2();
            findAndClickMobileElement(xpath,category,TestUtils.XPath);
        }

public  void selectCategory (String value) throws Exception {
    pressArrowDown2();
    WebElement cateee =  driver.findElement(By.xpath(value));
    elementClick(cateee,"Selected Category as - "+cateee.getText());
}    public void selectAppetizersCategory() throws Exception {
        pressArrowDown2();
        scrollToElementCategory("up");
        elementClick(appetizersCategoryBtn, "Appetizers Category selected");
    }

    public void selectSaladCategory() throws InterruptedException {
        pressArrowDown2();
        Thread.sleep(1500);
        elementClick(saladCategoryBtn, "Salad Category selected");
    }

    public void selectFoodCategory() throws InterruptedException {
        pressArrowDown2();
        Thread.sleep(1000);
        elementClick(foodCategoryBtn, "Food Category selected");
    }


    public void verifyCashPriceValueAs(String Amount) throws InterruptedException {
        Thread.sleep(1000);

//        WebElement totalValues =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStatic)Text[5]"));
        String totalAmount = totalValues.getText();
        TestUtils.cashOptionOrderScreen = totalAmount;
        Assert.assertEquals(totalAmount,Amount);
        utils.log().info("Total Value is SAME - "+Amount);
    }

    public void verifyCashPriceValueAsForTaxExempt(String Amount) throws InterruptedException {
        Thread.sleep(1000);

//        WebElement totalValues =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash PriceCash PriceCash Price\"]/../../XCUIElementTypeOther[2]/X)CUIElementTypeStaticText[4]"));
        String totalAmount = totalValues.getText();
        TestUtils.cashOptionOrderScreen = totalAmount;
        Assert.assertEquals(totalAmount,Amount);
        utils.log().info("Total Value is SAME - "+Amount);
    }


    public void verifyCashPriceValue1As(String Amount) throws InterruptedException {
        Thread.sleep(1000);
//        WebElement totalValues =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStatic)Text[6]"));
        String totalAmount = totalValues.getText();
        TestUtils.cashOptionOrderScreen = totalAmount;
        Assert.assertEquals(totalAmount,Amount);
        utils.log().info("Cash Price is SAME - "+Amount);
    }

    public void verifyCashPriceValue2As(String Amount) throws InterruptedException {
        Thread.sleep(1000);

//        WebElement totalValues =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStatic)Text[7]"));
        String totalAmount = totalValues.getText();
        TestUtils.cashOptionOrderScreen = totalAmount;
        Assert.assertEquals(totalAmount,Amount);
        utils.log().info("Cash Price is SAME - "+Amount);
    }

    public void verifyCashPriceValue3As(String Amount) throws InterruptedException {
        Thread.sleep(1000);

//        WebElement totalValues =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStatic)Text[8]"));
        String totalAmount = totalValues.getText();
        TestUtils.cashOptionOrderScreen = totalAmount;
        Assert.assertEquals(totalAmount,Amount);
        utils.log().info("Cash Price is SAME - "+Amount);
    }
    public void selectMenuItem(String menuItem) throws Exception {
        Thread.sleep(2000);
        WebElement e =  driver.findElement(By.xpath("(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'"+menuItem+"')])[1]"));
        Thread.sleep(2000);
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",e);
            elementClick(e, "Selected - " + menuItem);

    }

    public void verifyMenuSubTotalAs(String amount) throws InterruptedException {
        Thread.sleep(1000);

        WebElement e11 =  driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subtotalValue = e11.getAttribute("value");
        utils.log().info("Subtotal Value is - "+subtotalValue);
        Assert.assertEquals(subtotalValue,amount);
        TestUtils.subtotalTxt = subtotalValue;
        utils.log().info("Subtotal Value is - "+amount);
    }

    public void verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscount(){
        double cashPriceValue = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[A-Z$ ]",""));
        double cashReward = 5.32;
        double expectedTotalPrice1 = ((cashPriceValue) * cashReward);
        double expectedTotalPrice =  expectedTotalPrice1/100;

        WebElement cashPrice1 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)3]"));
        String actualCashPrice = cashPrice1.getText().replaceAll("[$ ]","");

        DecimalFormat dc1 = new DecimalFormat("0.00");
        double expectedCashValue = Double.parseDouble(dc1.format(expectedTotalPrice));
        utils.log().info(String.valueOf(expectedCashValue));
        double expectedTotalValue = cashPriceValue + expectedTotalPrice ;

        Assert.assertEquals(dc1.format(expectedTotalValue), actualCashPrice);
        TestUtils.totalTxt = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+actualCashPrice);
    }

    public void verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountWithGratuityEnabled(){
        double cashPriceValue = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[A-Z$ ]",""));
        double cashReward = 5.32;
        double expectedTotalPrice1 = ((cashPriceValue) * cashReward);
        double expectedTotalPrice =  expectedTotalPrice1/100;

        WebElement cashPrice1 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)4]"));
        String actualCashPrice = cashPrice1.getText().replaceAll("[$ ]","");

        DecimalFormat dc1 = new DecimalFormat("0.00");
        double expectedCashValue = Double.parseDouble(dc1.format(expectedTotalPrice));
        utils.log().info(String.valueOf(expectedCashValue));
        double expectedTotalValue = cashPriceValue + expectedTotalPrice ;

        Assert.assertEquals(dc1.format(expectedTotalValue), actualCashPrice);
        TestUtils.totalTxt = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+actualCashPrice);
    }

    public void verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountWithServiceCharge(){
        double cashPriceValue = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[A-Z$ ]",""));
        double cashReward = 5.32;
        double expectedTotalPrice1 = ((cashPriceValue) * cashReward);
        double expectedTotalPrice =  expectedTotalPrice1/100;

        WebElement cashPrice1 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)4]"));
        String actualCashPrice = cashPrice1.getText().replaceAll("[$ ]","");

        DecimalFormat dc1 = new DecimalFormat("0.00");
        double expectedCashValue = Double.parseDouble(dc1.format(expectedTotalPrice));
        utils.log().info(String.valueOf(expectedCashValue));
        double expectedTotalValue = cashPriceValue + expectedTotalPrice ;

        Assert.assertEquals(dc1.format(expectedTotalValue), actualCashPrice);
        TestUtils.totalTxt = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+actualCashPrice);
    }

    public void verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountWithDiscount(){
        double cashPriceValue = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[A-Z$ ]",""));
        double cashReward = 5.32;
        double expectedTotalPrice1 = ((cashPriceValue) * cashReward);
        double expectedTotalPrice =  expectedTotalPrice1/100;

        WebElement cashPrice1 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)4]"));
        String actualCashPrice = cashPrice1.getText().replaceAll("[$ ]","");

        DecimalFormat dc1 = new DecimalFormat("0.00");
        double expectedCashValue = Double.parseDouble(dc1.format(expectedTotalPrice));
        utils.log().info(String.valueOf(expectedCashValue));
        double expectedTotalValue = cashPriceValue + expectedTotalPrice ;

        Assert.assertEquals(dc1.format(expectedTotalValue), actualCashPrice);
        TestUtils.totalTxt = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+actualCashPrice);
    }

    public void verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountWithServiceChargeHavingGratuity(){
        double cashPriceValue = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[A-Z$ ]",""));
        double cashReward = 5.32;
        double expectedTotalPrice1 = ((cashPriceValue) * cashReward);
        double expectedTotalPrice =  expectedTotalPrice1/100;

        WebElement cashPrice1 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)5]"));
        String actualCashPrice = cashPrice1.getText().replaceAll("[$ ]","");

        DecimalFormat dc1 = new DecimalFormat("0.00");
        double expectedCashValue = Double.parseDouble(dc1.format(expectedTotalPrice));
        utils.log().info(String.valueOf(expectedCashValue));
        double expectedTotalValue = cashPriceValue + expectedTotalPrice ;

        Assert.assertEquals(dc1.format(expectedTotalValue), actualCashPrice);
        TestUtils.totalTxt = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+actualCashPrice);
    }

    public void verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountDiscountAndServiceChargeHavingGratuity(){
        double cashPriceValue = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[A-Z$ ]",""));
        double cashReward = 5.32;
        double expectedTotalPrice1 = ((cashPriceValue) * cashReward);
        double expectedTotalPrice =  expectedTotalPrice1/100;

        WebElement cashPrice1 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)6]"));
        String actualCashPrice = cashPrice1.getText().replaceAll("[$ ]","");

        DecimalFormat dc1 = new DecimalFormat("0.00");
        double expectedCashValue = Double.parseDouble(dc1.format(expectedTotalPrice));
        utils.log().info(String.valueOf(expectedCashValue));
        double expectedTotalValue = cashPriceValue + expectedTotalPrice ;

        Assert.assertEquals(dc1.format(expectedTotalValue), actualCashPrice);
        TestUtils.totalTxt = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+actualCashPrice);
    }
    public void verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountForTaxExempt(){
        double cashPriceValue = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[A-Z$ ]",""));
        double cashReward = 5.32;
        double expectedTotalPrice1 = ((cashPriceValue) * cashReward);
        double expectedTotalPrice =  expectedTotalPrice1/100;

        WebElement cashPrice1 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)2]"));
        String actualCashPrice = cashPrice1.getText().replaceAll("[$ ]","");

        DecimalFormat dc1 = new DecimalFormat("0.00");
        double expectedCashValue = Double.parseDouble(dc1.format(expectedTotalPrice));
        utils.log().info(String.valueOf(expectedCashValue));
        double expectedTotalValue = cashPriceValue + expectedTotalPrice ;

        Assert.assertEquals(dc1.format(expectedTotalValue), actualCashPrice);
        TestUtils.totalTxt = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+actualCashPrice);
    }


    public void verifyTaxValueAs(String Amount) throws InterruptedException {
        WebElement tax = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        if(tax.isDisplayed()){
            utils.log().info( " Tax is - "+ tax.getAttribute("value"));
            Assert.assertEquals(tax.getAttribute("value"),Amount);
            TestUtils.taxTxt = Amount;
        }else {
            utils.log().info("Tax is not Displayed");
        }

    }

    public void verifyDiscountValueAs(String Amount) throws InterruptedException {
        WebElement discount = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        if(discount.isDisplayed()){
            utils.log().info( "Discount is - "+ Amount);
            Assert.assertEquals(discount.getAttribute("value"),Amount);
            TestUtils.discountTxt = Amount;
        }else {
            utils.log().info("Discount is not Displayed");
        }

    }

    public void verifyDiscount1ValueAs(String Amount) throws InterruptedException {
        WebElement discount = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        if(discount.isDisplayed()){
            utils.log().info( "Discount is - "+ Amount);
            Assert.assertEquals(discount.getAttribute("value"),Amount);
            TestUtils.discountTxt = Amount;
        }else {
            utils.log().info("Discount is not Displayed");
        }

    }

    public void verifyServiceChargeValueAs(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement e11 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Service Charge\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeSt)aticText[3]"));
        String subtotalValue = e11.getText();
        TestUtils.serviceCharge = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
        utils.log().info("Service Charge Value is - "+Amount);

    }

    public void verifyServiceChargeValue1As(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement e11 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Service Charge\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeSt)aticText[4]"));
        String subtotalValue = e11.getText();
        TestUtils.serviceCharge = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
        utils.log().info("Service Charge Value is - "+Amount);

    }

    public void verifyServiceChargeValue2As(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement e11 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Service Charge\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeSt)aticText[5]"));
        String subtotalValue = e11.getText();
        TestUtils.serviceCharge = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
        utils.log().info("Service Charge Value is - "+Amount);

    }

    public void verifyTotalValueAs(String Amount) throws InterruptedException {
        WebElement discount = driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        if(discount.isDisplayed()){
            utils.log().info( "Discount is - "+ Amount);
            Assert.assertEquals(discount.getAttribute("value"),Amount);
            TestUtils.discountTxt = Amount;
        }else {
            utils.log().info("Discount is not Displayed");
        }
    }

    public void verifyTotal2ValueAs(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)3]"));
        String totalAmount = totalValues.getText();
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.totalTxt = totalAmount;
        utils.log().info("Total Value is SAME - "+Amount);
    }

    public void verifyTheCashPriceNameONTheOrderScreen(){
    WebElement cashPrice =  driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCU)IElementTypeStaticText[5]"));
    Assert.assertEquals(cashPrice.getText(),"Cash Price");
    utils.log().info("Displayed - "+cashPrice.getText());
    }

    public void verifyTotal4ValueAs(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)4]"));
        String totalAmount = totalValues.getText();
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.totalTxt = totalAmount;
        utils.log().info("Cash Price Value is SAME - "+Amount);
    }

    public void verifyPaidAmountValue1As(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Paid Amount\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStati)cText[6]"));
        String totalAmount = totalValues.getText();
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.paidAmount = totalAmount;
        utils.log().info("Paid Amount Value is SAME - "+Amount);
    }

    public void verifyPaidAmountValueAs(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Paid Amount\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStati)cText[5]"));
        String totalAmount = totalValues.getText();
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.paidAmount = totalAmount;
        utils.log().info("Cash Price Value is SAME - "+Amount);
    }
    public void verifyPaidAmountValueAs0(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Paid Amount\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStati)cText[4]"));
        String totalAmount = totalValues.getText();
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.paidAmount = totalAmount;
        utils.log().info("Cash Price Value is SAME - "+Amount);
    }
    public void verifyTotal5ValueAs(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)5]"));
        String totalAmount = totalValues.getText();
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.totalTxt = totalAmount;
        utils.log().info("Cash Price Value is SAME - "+Amount);
    }

    public void verifyTotal6ValueAs(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)6]"));
        String totalAmount = totalValues.getText();
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.totalTxt = totalAmount;
        utils.log().info("Cash Price Value is SAME - "+Amount);
    }

    public void verifyTaxExemptTotalValueAs(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)2]"));
        String totalAmount = totalValues.getText();
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.totalTxt = totalAmount;
        utils.log().info("Cash Price Value is SAME - "+Amount);
    }


    public void verifyCashOptionValueASWithGratuity(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStatic)Text[6]"));
        String totalAmount = totalValues.getText();
        Assert.assertEquals(totalAmount,Amount);
        utils.log().info("Cash Price Value is SAME - "+Amount);
    }
    public void verifyGratuityValueAs(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement e11 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Gratuity\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticTe)xt[3]"));
        String subtotalValue = e11.getText();
        TestUtils.gratutiy = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
        utils.log().info("Gratuity Value is - "+Amount);
    }

    public void verifyGratuity1ValueAs(String Amount) throws InterruptedException {
        Thread.sleep(1000);
        WebElement e11 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Gratuity\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticTe)xt[4]"));
        String subtotalValue = e11.getText();
        TestUtils.gratutiy = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
        utils.log().info("Gratuity Value is - "+Amount);
    }

//    public void getTheTotalValueInTheOrderScreen(){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)));
//        WebElement totalValues =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]");
//        String totalAmount = totalValues.getText();
//
//    }

    public void getTotalOfMenuWhileCashDiscountApplied() throws InterruptedException {
        Thread.sleep(1000);
        WebElement totalValues =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        String totalAmount = totalValues.getText();
        TestUtils.totalTxt1 = totalAmount;

    }

    public void verifyTheTotalValueWithPaymentScreen() throws InterruptedException {
        Thread.sleep(1000);
        WebElement totalPayment =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText"));
        String totalPaymentTxt = totalPayment.getText();
        String totalOrder = TestUtils.totalTxt1;
        Assert.assertEquals(totalOrder,totalPaymentTxt);
        WebElement totalTxtt =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]"));
        String totalTxtt1 = totalTxtt.getText();
        Assert.assertEquals(totalTxtt1,totalOrder);
        utils.log().info("Total Value is SAME With FAst cash Screen - "+totalTxtt1);

    }
    public void verifySubtotalValueWithCashValueInPaymentScreen() throws InterruptedException {
        Thread.sleep(1000);
        WebElement cashOptionValuePaymentScreen =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]"));
        String cashOptionValuePaymentScreenTxt = cashOptionValuePaymentScreen.getText();
        double subtotalValue = Double.parseDouble(TestUtils.subtotalTxt.replaceAll("[$ ]",""));
        double taxValue = Double.parseDouble(TestUtils.taxTxt.replaceAll("[$ ]",""));
        double totalValue = subtotalValue + taxValue;
        DecimalFormat dc = new DecimalFormat("0.00");

        Assert.assertEquals(cashOptionValuePaymentScreenTxt.replaceAll("[$ ]",""), dc.format(totalValue));
        utils.log().info("Subtotal same with cash value - "+subtotalValue);

    }
    public void selectMenuItemToSeeMenuOptionWindow(String menu){
        WebElement el1 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+menu+" \"]"));
        el1.click();
    }
    public void selectMenuAsRavioli(){
        elementClick(ravioliMenu, "Tapped Ravioli Menu");
    }

    public void selectMenuAsRavioliPesto(){
        elementClick(ravioliPestoMenu, "Tapped Ravioli Menu");
    }

    public void selectMenuAsCheeseCake(){
        elementClick(CheeseckaeMenu,"Tapped Cheesecake Menu");
    }

    public void selectMenuAsFusRapini(){
        elementClick(fusRapiniMenu, " Tapped Fus Rapini Menu");
    }

    public void selectMenuAsFettFrDiMare(){
        elementClick(fettFrDiMareMenu, " Tapped Fett Fr Di Mare Menu");
    }

    public void selectMenuAsLingMeatballs(){
        elementClick(lingMeatballsMenu," Tapped Ling Meatballs Menu");
    }


    public void selectMenuAsLingLittlenck(){
        elementClick(lingLittlenckMenu,"Tapped Ling littlenck Menu");
    }

    public void selectMenuAsLingPesShrimp(){
        elementClick(lingPesShrimpMenu,"Tapped Ling Pes Shrimp Menu");
    }



    public void selectMenuAsTea(){

        elementClick(teaMenu,"Tapped TEA Menu");
    }

    /****** Select & Verify Modifiers ******/


    public void selectModifier1(String modify){
        WebElement el1 = driver.findElement(By.xpath("//div[contains(@class,'modifier-section')]//div[contains(.,'"+modify+"')]"));
        elementClick(el1,"Tapped modifier");
    }

    public void verifyOrderedItemExists(String itemName) {
        if(driver.findElement(By.xpath("//div[contains(@class,'modifier-section')]//div[contains(.,'"+itemName+"')]")).isDisplayed())

        {
            utils.log().info("Modifier Item is added");
        }
        else {
            utils.log().info("Modifier Item is not added");
            int w = 1/0;
        }
    }

    public void verifyOrderedMenuItemExists(String itemName) {
        if(driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container')]//div[contains(.,'"+itemName+"')])[1]")).isDisplayed())

        {
            utils.log().info("Modifier Item is added");
        }
        else {
            utils.log().info("Modifier Item is not added");
            int w = 1/0;
        }
    }

    public void pressSearch(){ elementClick(searchOrderScreen,"Tapped Search Button on the Order screen"); }

    public void verifySearchField(){
        if(convertWebElement(searchField).isDisplayed()){
            utils.log().info("Search field got Visible");
        }else {
            utils.log().info("Search field is not visible");
        }
    }

    public void selectMenuItemSearch(String menu_item) throws InterruptedException {

        convertWebElement(searchField).sendKeys(menu_item);
        Thread.sleep(300);

            WebElement e = driver.findElement(By.xpath("(//div[contains(@class,'subCategoryBtn-txt noImg')])"));
            Thread.sleep(300);
            utils.log().info(e.getText());
            if (e.getText().equals(menu_item)) {
              e.click();
              utils.log().info("Selected - "+menu_item);
            }else{
                utils.log().info("Element Not Displayed - "+menu_item);
            }

        //searchField.sendKeys(Keys.ENTER);

    }
    public void doneForTheMenuItem(){
        elementClick(doneForThisMenuItem, "done for the menu item");
    }

    /****** Select Serving Sizes ******/

    public void selectServingSize(String modifier){
        WebElement e = driver.findElement(By.xpath("//span[contains(.,'"+modifier+"')]"));
        elementClick(e, modifier + " selected");
    }

    /**********************************/

    public void pressFinish(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        elementClick(finishOrderBtn, "finish button tapped");
    }

    /****** Hold operation ******/
    public void assertHold(){
        if(handIconForHold.isDisplayed()) {
            utils.log().info("Hold action is verified");
        }
        else{
            utils.log().info("Hold action is not verified, please check logs!");
        }
    }
    public void pressYesForHold(){
        elementClick(yesForHold,"Tapped Yes Button on the Hold Popup");
    }
//    public void pressYesForHold1(){
//        elementClick(yesForHold1,"Tapped Yes Button on the Hold Popup");
//    }
    public void pressOptions(){
        elementClick(optionBtn, "Options button is tapped");
    }
    @FindBy(xpath = "//p[contains(.,'Check Option')]")
    WebElement checkOptionsTitle;
    public String getCheckOptionsTitle() throws InterruptedException {
        Thread.sleep(2000);
        return elementGetText(checkOptionsTitle, "Check Options title is - ");
    }

    public void pressPrintBtn(){
        elementClick(printBtn, "Print button is tapped");
    }

    public void pressDoneReceiptPrinter(){
        elementClick(doneReceiptPrinter,"Done button tapped on receipt printer pop-up" );
    }

    /***** Void Order ******/

    public void pressVoidBtn() throws InterruptedException {
        Thread.sleep(2000);
        elementClick(voidBtn, "Void button tapped" );
    }
    public String getVoidReasonPopup(){

        return getText(voidReason,"void Reason txt is displayed - ");
    }


    public void selectOrderedWrongly(){
        elementClick(orderedWronglyReason, "Ordered wrongly is selected");
    }

    public void pressAddVoidReasonBtn() throws InterruptedException {
        Thread.sleep(2000);
        elementClick(addVoidReasonBtn, "Add (void reason) button is tapped");
    }

    public void pressAddVoidReasonBtn1(){
        elementClick(addVoidReasonBtn1, "Add (void reason) button is tapped");
    }

    public void pressAdd2Void(){
        elementClick("(//span[contains(.,' Add ')])","Add");
    }
    public String getAllOrdersAreVoidedMsg(){return elementGetText(convertWebElement(allOrdersAreVoided),"All Orders are voided is Displayed - ");}
    /****** Tax Exempt ******/
   public WebElement element;
    public void checkTaxExists() throws InterruptedException {
        Thread.sleep(1000);
       try {
            element = driver.findElement(By.xpath("//p[@id='os_taxAmount']"));
           if (element.isDisplayed()){
               utils.log().info("Tax is Available - "+element.getText());

           }
       }catch (Exception w){
           utils.log().info("Tax is Exempted ");
           Assert.assertEquals(element.getText(),"Tax1");
           utils.log().info("Tax is Exempted - "+element.getText());
       }
    }

    public void checkTaxExists1(){

        try {
            element = driver.findElement(By.xpath("//p[@id='os_taxAmount']"));
            if (element.isDisplayed()){
                utils.log().info("Tax is Not exempted - "+element.getText());
                Assert.assertEquals(element.getText(),"Tax");
                utils.log().info("Tax is Available - "+element.getText());
            }else{
                utils.log().info("Tax is exempted - ");
            }
        }catch (Exception w){
            utils.log().info("Tax is exempted - ");
        }
    }


    public void checkTaxValue(String value) throws InterruptedException {
        Thread.sleep(1000);
        WebElement tax = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        if(tax.isDisplayed()){
            utils.log().info( " Tax is - "+ tax.getAttribute("value"));
            Assert.assertEquals(tax.getAttribute("value"),value);
            TestUtils.taxTxt = value;
        }else {
            utils.log().info("Tax is not Displayed");
        }
    }
    /****** Payment ******/

    public void pressPayment(){
        elementClick(paymentBtn, "Payment button is tapped");
    }

    public void verifyThePaidAmountPartialPaidAmountOnthePaymentScreen() throws InterruptedException {
        Thread.sleep(1000);
        WebElement firstAmount =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIEleme)ntTypeCell[1]/XCUIElementTypeStaticText[3]"));
        String firstAmountTxt = firstAmount.getText();
        Assert.assertEquals(firstAmountTxt,TestUtils.paidAmount1.replaceAll("[$ ]",""));
        WebElement secondAmount =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIEleme)ntTypeCell[2]/XCUIElementTypeStaticText[3]"));
        String[] secondAmountTxt = secondAmount.getText().split("\\+");
        Assert.assertEquals(secondAmountTxt[0],TestUtils.BalanceCardAmount.replaceAll("[$ ]",""));
        Assert.assertEquals(secondAmountTxt[1],TestUtils.tipAmount.replaceAll("[$ ]",""));
        utils.log().info("All Paid the partial amount - "+firstAmountTxt+" "+secondAmount.getText());
    }


    /****** Open Item Verification ******/

    public void togoIcon() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("(//div[.='GO'])[2]"));
        if(element.isDisplayed()){
            utils.log().info("TOGO icon Displayed");
        }else{
            utils.log().info("Not TOGO icon Displayed");
            int w = 1/0;
        }
    }

    public void togoIcon1() throws InterruptedException {
        Thread.sleep(2000);
        try {
            WebElement element = driver.findElement(By.xpath("(//div[.='GO'])[2]"));
            if (element.isDisplayed()) {
                utils.log().info("TOGO icon Displayed");
                Assert.assertEquals("1","2");
            }
        }catch (Exception w){
            utils.log().info("TOGO icon Not Displayed");
        }
    }

    public void verifyTickIcon(){
        if(TickIcon.isDisplayed()){
            utils.log().info("Tick mark is Displayed");
        }
        else
        {
            utils.log().info("Tick mark is not Displayed");
        }
    }
    public String getdoYouWantToSendHoldMenuItemToKitchenMsg(){
        return elementGetText(doYouWantToSendHoldMenuItemToKitchen,"Do You Want To Send Hold Menu Item is Displayed - ");
    }

    public String getdoYouWantToSendHoldMenuItemToKitchenMsg2(){
        return elementGetText(doYouWantToSendHoldMenuItemToKitchen2,"Do You Want To Send Hold Menu Item is Displayed - ");
    }

    public String getdoYouWantToSendHoldMenuItemToKitchenMsg1(){
        return elementGetText(doYouWantToSendHoldMenuItemToKitchen1,"Do You Want To Send Hold Menu Item is Displayed - ");
    }

    public String getPaymentMadeOnThisCheck(){
        return getText(paymentMadeOnThisCheckPopup,"Payment made on this check is Displayed - ");
    }

    public String getPaymentMadeOnThisCheck1(){
        return getText(paymentMadeOnThisCheckPopup1,"Payment made on this check is Displayed - ");
    }


    public String getPaymentMadeOnThisCheckHouseAccount(){
        return elementGetText(paymentMadeOnThisCheckPopupForHouseAccount,"Payment made on this check is Displayed - ");
    }

    public void getNoMorePaymentNeedPopup() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(noMorePaymentNeed.getText(),"No More payments Needed");
        utils.log().info("No More payments Needed");
//        return elementGetText(noMorePaymentNeed,"No more payment need is Diplayed - ");
    }
    public String getNoMorePaymentNeed1Popup(){
        return elementGetText(noMorePaymentNeed1,"No more payment need is Diplayed - ");
    }

    public String getYouNeedToOrderBeforeYouPayMsg() throws InterruptedException {
        Thread.sleep(1000);
        return elementGetText(youNeedToOrderBeforeYouPay,"You Need to order before you paying txt is Displayed - ");
    }

    public void pressTableNumber(String Table1) throws InterruptedException {
        Thread.sleep(1000);
        WebElement e=driver.findElement(By.xpath( "//span[contains(.,'"+Table1+"')]")) ;
        elementClick(e,Table1 + "selected");
    }

    public String getModifierScreen(){
        return elementGetText(modifierScreen,"Modifier screen is displayed - ");
    }

    public void selectModifierInModifierScreen(String modifier) throws InterruptedException {
        Thread.sleep(1000);
        WebElement e1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-modify/ion-header/div[1]/ion-searchbar/div/input"));
        sendKeys(e1,modifier);
        Thread.sleep(1000);
        WebElement e = driver.findElement(By.xpath("//button[contains(.,' "+modifier+" ')]"));
        elementClick(e,modifier + "selected");
    }

    public void selectModifierForMoreTime(String modifier) throws InterruptedException {
        Thread.sleep(1000);
        WebElement e1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-modify/ion-header/div[1]/ion-searchbar/div/input"));
        sendKeys(e1,modifier);
        Thread.sleep(1000);
        WebElement e = driver.findElement(By.xpath("//button[contains(.,' "+modifier+" ')]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
        for(int i=0;i<5;i++) {
            elementClick(e, modifier + "selected");
            Thread.sleep(1000);
        }

//        elementClick(e,"Selected = "+modifier);

//        elementClick("//button[contains(.,'Ok')]","Selected OK");
//
//        WebElement e=driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\""+modifier+"\"]"));


    }
    public void verifyModifiersAddOrderScreen(String modifiers) throws InterruptedException {
        Thread.sleep(1000);
        WebElement el1 = driver.findElement(By.xpath("//div[@class='modifier-section']//div[contains(.,'"+modifiers+"')]"));
        String modi=el1.getText();
        if (el1.isDisplayed()) {
            utils.log().info("Modifiers Added into Menu Items "+modi);
        } else {
            utils.log().info("Modifiers Not Add into Menu Items");
        }
    }


    public void seatWithOrderScreen(String seat) throws InterruptedException {
        Thread.sleep(1000);
        WebElement e=driver.findElement(By.xpath("//button[@id='"+seat+"']"));
        if(e.isDisplayed()){
            utils.log().info("Seat added in Order screen");
        }else {
            utils.log().info("Seat is not added in order screen");
        }
    }

    public void enterMenuQuantity(String Number) throws InterruptedException {
        Thread.sleep(1000);
        WebElement el1 = driver.findElement(By.xpath("//div[contains(@class,'p-col-2 orderlist-qty')]"));
        el1.click();
            WebElement el2 = driver.findElement(By.xpath("//ion-col[contains(@class,'quantity_grid-row-col')]//span[contains(.,'"+Number+"')]"));
            elementClick(el2, Number + " selected");
            elementClick(continueButton, "Tapped Continue");
    }

    public void enterMenuQuantity$Store(String Number) throws InterruptedException {
        Thread.sleep(1000);
        WebElement el1 = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"1\"]"));
        el1.click();

        for (int i = 0; i < Number.length(); i++) {
            char c = Number.charAt(i);
            String ch = String.valueOf(c);
            utils.log().info("i " + c);
            if (ch.equals("1")) {
                WebElement e1 =  driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"1\"])[2]"));
            elementClick(e1,"Selected - "+e1);
            } else {
                WebElement el21 =  driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"" + c + "\"]"));
                elementClick(el21, c + " selected");
            }
        }
            elementClick(continueButton, "Tapped Continue");

    }
    public void enterMenuQty(String number){

        WebElement el = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"5\"]"));
        el.click();

        WebElement el3 = driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\""+number+"\"])"));
        elementClick(el3, " selected");

        elementClick(continueButton,"Tapped Continue");

    }

    public void checkDiscountValue(String value){
        WebElement discount = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        if(discount.isDisplayed()){
            utils.log().info( "Discount is - "+ value);
            Assert.assertEquals(discount.getAttribute("value"),value);
            TestUtils.discountTxt = value;
        }else {
            utils.log().info("Discount is not Displayed");
        }
    }

    public void checkGratuityValue(String value){
        WebElement discount= driver.findElement(By.xpath("//div[@id='os_gratuityAmountStr']//input"));

        if(discount.isDisplayed()){
            utils.log().info( " Gratuity is - "+ value);
            Assert.assertEquals(discount.getAttribute("value"),value);
        }else {
            utils.log().info("Gratuity is not Displayed");
        }
    }

    public String OnionRingsEachMenu() throws InterruptedException {
        Thread.sleep(2000);
        return getText(onionRingEachMenu,"Free Item Added in Menu - ");
    }

    public String dosaEach(){
        return elementGetText(dosaEachMenu,"Free Item Added In Menu ");
    }
    public void discountName(String discount){
        WebElement e2 = driver.findElement(By.xpath("//div[contains(@class,'p-col-4 discount-section-name disc-padding')]"));
          utils.log().info(e2.getText());
        if (e2.isDisplayed()) {
            utils.log().info(discount + " - is Displayed");
            Assert.assertEquals(e2.getText(),discount);
        } else {
            utils.log().info("Discount is not Displayed");
        }
    }

    public void mostDiscount(String discount){
        WebElement e2 = driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\""+discount+"\"])"));
        if (e2.isDisplayed()) {
            utils.log().info(discount + " - is Most Expensive Displayed");
        } else {
            utils.log().info("Discount is not Displayed");
        }

    }
    public String customerRemoved() throws InterruptedException {
        Thread.sleep(3000);
        utils.log().info(walkinBtn.getText());
        return elementGetText(walkinBtn,"Customer name is displayed - ");
    }
    public void LeastDiscount(String discount){
        WebElement e2 = driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\""+discount+"\"])[1]"));
        // String data= e2.getText().substring(1);
        if (e2.isDisplayed()) {
            utils.log().info(discount + " - is Least Expensive Displayed");
        } else {
            utils.log().info("Discount is not Displayed");
        }

    }

    public void verifyCustomerAddOrderScreen(String member) throws InterruptedException {
        Thread.sleep(1000);
        WebElement customerAddOrderScreen=driver.findElement(By.xpath("(//p[.=' "+member+" '])"));
        if(customerAddOrderScreen.isDisplayed()){
            utils.log().info(member+" - Customer Is added on Order Screen ");
        }else {
            utils.log().info("Customer is not added");
            int w = 1/0;
        }
    }








    public void clickRemoveBtn(){
        elementClick(removeBtn,"Tapped remove button");
    }



    public String verifyCustomerProfile() throws InterruptedException {
        Thread.sleep(2000);
        return elementGetText(customerProfileWindow,"Customer profile window is displayed - ");
    }

    public void verifyServiceType(String order) throws InterruptedException {
        Thread.sleep(2000);
        WebElement type=driver.findElement(By.xpath("//button[contains(@id,'os_menu')]"));
       Assert.assertEquals(type.getText(),order);
       utils.log().info("Service Type - "+order);
    }

    public String verifyCloseSale() throws InterruptedException {
        Thread.sleep(2000);
        return getText(convertWebElement(closeYourSaleTxt),"close your sale txt is displayed - ");
    }

    public String closeTheSale() throws InterruptedException {
        Thread.sleep(2000);
        return getText(convertWebElement(closeTheSaleTxt),"close your sale txt is displayed");
    }

    public void clickLogOffBtn(){

        elementClick(logOffBtn,"Tapped log Off Button");
    }

    public void visibleSplitButton(){
        if(convertWebElement(splitBtn).isEnabled()){
            utils.log().info("Split Button is Enabled");
        }else {
            utils.log().info("Split Button is Disabled");
        }
    }

    public String verifyCannotAddModifierTxt(){
        return elementGetText(cannotAddModifier,"Cannot add modifier txt is displayed - ");
    }

    public String verifyNoMenuItemFoundTxt(){
        return elementGetText(noMenuItemTxt,"No Menu Item Txt is displayed - ");
    }

    public void verifyCashButtonEnable(){
        WebElement cash=driver.findElement(By.xpath("Cash"));
        if(cash.isEnabled()){
            utils.log().info("cash Is Enable");
        }else {
            utils.log().info("Cash Is not Enable");
        }
    }

    public void ClickLaterCheckBoxBtn(){
        elementClick(laterBtn,"Tapped Later Button Check Box");
    }

    public void swipeDiscount() throws InterruptedException {
        swipe(32,296,-42,296,200);
    }
    public void selectModifier(String modifier) throws InterruptedException {
        Thread.sleep(1000);
        WebElement e = driver.findElement(By.xpath("//span[contains(.,'"+modifier+"')]"));
//        elementClick(e, modifier + " selected");
        Thread.sleep(2000);
//        if(e.isDisplayed()) {
//            elementClick(e, "Selected - " + modifier);
//        }
//        else{
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",e);
            elementClick(e, "Selected - " + modifier);
//        }
    }

    public void selectModifier12(String modifier) throws InterruptedException {
        WebElement e = driver.findElement(By.xpath("//button[contains(.,' "+modifier+" ')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
        Thread.sleep(500);
        elementClick(e,"Selected = "+modifier);

        elementClick("//button[contains(.,'Ok')]","Selected OK");

    }

    public void iVerifyTaxAs(String tax) throws InterruptedException {
        Thread.sleep(1000);
        WebElement e11 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Tax\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2])"));
        String subtotalValue = e11.getText();
        TestUtils.taxTxt = subtotalValue;
        Assert.assertEquals(subtotalValue,tax);
        utils.log().info("Tax Value is - "+tax);
    }

    public String verifyYouCannotDeletePopup(){
        return elementGetText(youCannotDeleteTxt,"Popup Text is Displayed");
    }

    public void clickDeleteBtn()
    {
        WebElement el1 = driver.findElement(By.xpath("Delete"));
        elementClick(el1,"Tapped Delete Button");
    }

    public void clickDoneButtonTypeWindow(){
        elementClick(doneButton,"Tapped done button");
    }

    public String getCheckNumberTxt(){
        WebElement checkNum=driver.findElement(By.xpath("(//p[contains(@class,'order-header-checkno')])"));
        checkNumber=checkNum.getText();
        TestUtils.globalCheckNumber=checkNumber;
        utils.log().info(checkNumber);
        return checkNumber;
    }

    public void verifyServingSize() throws IOException {
        try {
            WebElement modify =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));  //Changed mergeAndFindELement to driver.Findelement ( 3 DEC / Benseron)
            String modifier = modify.getText();
            if (find(modify, 2)) {
                elementClick(modify, "Conversational is enabled - " + modifier);
            }
        }
        catch (Exception e){
            utils.log().info("Conversational is disabled");
            //    }
        }
    }

    public void getServingSize(){
        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]
        List <WebElement> servingSize= (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText"));
        int size=servingSize.size();
        String servingName=" ";
        utils.log().info("Serving Size of The Menu item is - "+size);
        for(int i=1;i<=size;i++) {
            WebElement serving=driver.findElement(By.xpath( "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText["+i+"]"));
            servingName=serving.getText();
            utils.log().info("Serving Sizes - "+servingName);

        }


    }

    public void verifySizeCell(){
        try {
            WebElement size = driver.findElement(By.xpath("Size"));
            if (size.isDisplayed()) {
                utils.log().info("Size Cell is Displayed");
            }
        } catch (Exception r){
            utils.log().info("Size Cell Is not displayed");
        }
    }

    public void verifyCancelBtnIsEnable(){
        if(cancelBtnConversational.isDisplayed()){
            utils.log().info("Cancel Button is Displayed in Conversational Modifier Screen");
        }else{
            utils.log().info("Cancel Button is not displayed is Conversational Modifier Screen");
        }
    }
    public void verifyStartOverBtnIsEnable(){
        if(startOverBtn.isDisplayed()){
            utils.log().info("Start Over Button is Displayed in Conversational Modifier Screen");
        }else{
            utils.log().info("Start Over Button is not displayed in Conversational Modifier Screen");
        }
    }
    public void verifyDoneBtnIsEnable(){
        if(doneBtnConversational.isDisplayed()){
            utils.log().info("Done Button is Displayed in Conversational Modifier Screen");
        }else{
            utils.log().info("Done Button is not displayed in Conversational Modifier Screen");
        }
    }

    public void verifyIncludeModifierIsAdded(){
        try{
            WebElement modifier=driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell/XCUIElementTypeStaticText[1]"));
            String modi = modifier.getText();
            if (modifier.isDisplayed()) {
                utils.log().info("Include modifier is added with Menu Item - " + modi);
            }}catch (Exception h){
            utils.log().info("Include modifier is not added with Menu Item - ");
        }
    }

    public void clickStartOverInConversational(){
        elementClick(startOverBtn,"Tapped Start Over button");
    }

    public void clickInculdeModifier(){
        WebElement element=driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
        String modi = element.getText();
        elementClick(element,"Tapped Include Modifier - "+modi);
    }

    public void clickAlternateModifierScreen(){
        elementClick(alternateModifier,"Tapped Alternate Modifier button from conversational Screen");
    }

    public void verifyAlternateModifierScreen(){
        if(alternateModifierScreen.isDisplayed()){
            utils.log().info("Alternate Modifier Screen is Visible");
        }else{
            utils.log().info("Alternate Modifier Screen is not Visible");
        }
    }

    public void clickModifierFromAlternateModifierScreen(){
        WebElement alternate=driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeScrollView/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
        String data=alternate.getText();
        elementClick(alternate,"Tapped Alter modifier - "+data);

    }

    public void clickOkBtnInAlternateModifierScreen(){
        elementClick(okBtnAlternateModifier,"Tapped Ok Button In Alternate Modifier Screen");
    }

    public void verifyIncludeModifier(){
        try {
            WebElement modify = driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
            String modifier = modify.getText();
            if (modify.isDisplayed()) {
                elementClick(modify, "Include Modifier in Conversational modifier screen is displayed- " + modifier);
            }
        }catch (Exception e){
            utils.log().info("Include Modifier in Conversational modifier screen is not displayed ");
        }
    }


    public void clickRevertButton(){
        elementClick(revertBtn,"Tapped Revert Button");
    }

    public String verifyCannotRemoveCustomer(){
        return getText(cannotRemoveCustomerForDelivery,"Cannot Remove Customer is displayed - ");
    }

    //Added Today

    public String getCheckNumberTxt1(){
        WebElement checkNum=driver.findElement(By.xpath("(//p[contains(@class,'order-header-checkno')])"));
        checkNumber1=checkNum.getText();
        TestUtils.globalCheckNumber1=checkNumber1;
        utils.log().info(checkNumber1);
        return checkNumber1;
    }
    public void clickPrefixModifierBtn(){
        WebElement prefixBtn= driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
        String prefix=prefixBtn.getText();
        click(prefixBtn,"Tapped prefix Modifier is - "+prefix);

    }

    public String clickModifierFromConversationalScreen(){
        WebElement mandatoryModifier= driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
        modifier=mandatoryModifier.getText();
        TestUtils.modifiers = modifier;
        click(mandatoryModifier,"Tapped Mandatory Modifier in conversational Screen - "+modifier);
        return modifier;
    }

    public void verifyMandatoryModifierFromConversationalScreen() {
        String modifier = TestUtils.modifiers;
        List<WebElement> listOfModifier = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
        int listModifier = listOfModifier.size();
        utils.log().info("Modifier Size - " + listModifier);
        for (int i = 1; i <= listModifier; i++) {
            WebElement listOfModifier1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
            WebElement listOfModifier2 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[3]"));

            String data1 = listOfModifier1.getText();
            String data2 = listOfModifier2.getText();

            if (data1.contains(modifier)) {
                utils.log().info("Mandatory Modifier is same - " + data1 + " " + data2);
            } else {
                utils.log().info("Mandatory Modifier is not same - " + data1 + " " + data2);
            }
        }
    }

    public void verifyModifierAddedWithMenu(){
        List<WebElement> listOfModifier=(List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
        int listModifier=listOfModifier.size();
        utils.log().info("Modifier Size - "+listModifier);
        for (int i=1;i<=listModifier;i++){
            WebElement listOfModifier1= driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+i+"]/XCUIElementTypeStaticText[1]"));
            WebElement listOfModifier2= driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+i+"]/XCUIElementTypeStaticText[3]"));
            String data1=listOfModifier1.getText();
            String data2=listOfModifier2.getText();
            utils.log().info(" Modifier  - "+data1+ " "+data2);
        }

    }

    public void verifyMaximumAndMinimumCount(){
        WebElement maxAndMin= driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
        String minAndMax=maxAndMin.getText();
        if(maxAndMin.isDisplayed()){
            utils.log().info("Shown Minimum and Maximum Count - "+minAndMax);
        }else{
            utils.log().info("Not Shown Count of Minimum and Maximum");
        }
    }

    public String verifyYouNeedToPickAtleastModifierFromThisGroup(){
        return getText(youNeedToPickAtLeast1ModifiersFromThisGroup,"Popup is displayed as - ");
    }

    public String cashTxt1 = " ";
    public String getTotalOFMenu(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //    WebElement total =  driver.findElement(By.xpath()("(//XCUIElementTypeStaticText[@name=\"Total\"])[1]");
        //XCUIElementTypeApplication[@name="Lin)ga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]
        WebElement amount =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));

        //   String totalTxt = total.getText();
        cashTxt1 = amount.getText();
        TestUtils.cashTxt=cashTxt1;
        utils.log().info("Amount Paid in Cash Window "+ " - "+cashTxt1);

        return cashTxt1;
    }
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]")
    private WebElement firstNameFld;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[2]")
    private WebElement lastNameFld;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[5]")
    private WebElement mobileNumberFld;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[7]")
    private WebElement mailNameFld;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Add\"])[1]")
    private WebElement addMobileNumber;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Save\"])[1]")
    private WebElement saveMobileNumber;

    @FindBy(xpath =  "//XCUIElementTypeButton[@name=\"Save\"]")
    private WebElement saveBtn;

    public void passTheCustomerName(){


        for(int i =81;i<=120000;i++) {
            utils.log().info("Count - "+i);
            elementClick(addCustomerToTableBtn,"Add cutoemr button");

            elementClick(addNewBtn,"Add new Tapped");
            String xpath = RandomStringUtils.randomAlphabetic(6);
            sendKeys(firstNameFld, xpath);
            utils.log().info("First Name - " + xpath);

            String name1 = RandomStringUtils.randomAlphabetic(5);
            sendKeys(lastNameFld, name1);
            utils.log().info("Last name - " + name1);

            String number = RandomStringUtils.randomNumeric(10);
            utils.log().info("Mobile Number - " + number);
            elementClick(addMobileNumber, "Tapped Add button for Enter Mobile Number");
            sendKeys(mobileNumberFld, number);
            elementClick(saveMobileNumber, "Tapped Save button");

            elementClick(saveBtn, "Tapped Save");

            elementClick(addCustomerToTableBtn,"Add cutoemr button");

            elementClick(removeBtn,"Tapped REmove");

        }
    }
    @FindBy(xpath = "//p[(.='Gratuity cannot be removed for paid check')]")
    WebElement gratuityCannotBeRemovedForPaidCheck;

    public String  verifyGratuityCannotBeRemovedForPaidChecksPopup(){
        return getText(gratuityCannotBeRemovedForPaidCheck,"Displayed popup as - ");
        }

        public void verifyHoldIcon(){
         if (holdIcon.isEnabled()){
             utils.log().info("Hold icon is Enabled");
         }else{
             utils.log().info("Hold icon is NOT Enabled");
         }
        }

        public void getTotalOfMenuInOrderscreen() throws InterruptedException {
        Thread.sleep(1000);
          WebElement totalOfMenu =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
          String totalOfMenuTxt = totalOfMenu.getText();
            TestUtils.totalTxt = totalOfMenuTxt;
            utils.log().info("Total Of Menus - "+totalOfMenuTxt);

        }

        public void getTheMenuInTheOrderScreen() {

        ArrayList<String> menus = new ArrayList<>();
            List<WebElement> Listmenu = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell"));
            int countOfMenu = Listmenu.size();
            for (int i = 2; i <= countOfMenu; i++) {
                WebElement menu =  driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
                WebElement prize =  driver.findElement(By.xpath("///XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[2]"));
                String menuName = menu.getText();
                String priceOfPrize = prize.getText();
                TestUtils.menu = menuName;

                utils.log().info("Menus Are - " + menuName + " - " + priceOfPrize);
                menus.add(menu.getText());
                TestUtils.menuNames=menus;
                try {                                                                                  //XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]
                    List<WebElement> modifier = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable/XCUIElementTypeCell"));
                    int sizeOfModifier = modifier.size();
                    for (int w = 1; w <= sizeOfModifier; w++) {
                        WebElement modi =  driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
                        WebElement Modiprize =  driver.findElement(By.xpath("///XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[3]"));
                        String modiName = modi.getText();
                        String priceOfModi = Modiprize.getText();
                        utils.log().info("Modifiers Are - " + modiName + " - " + priceOfModi);
                    }
                } catch (Exception z) {

                }
            }
        }
        @FindBy(xpath = "Quantity is not enough.")
        WebElement quantityIsNotEnough;
        public void verifyQuantityIsNotEnoughPopup1(){
            Assert.assertEquals(quantityIsNotEnough.getText(),"Quantity is not enough.");
            utils.log().info("Displayed Popup as - "+quantityIsNotEnough.getText());
        }

        @FindBy(xpath = "86 List")
        WebElement listBtn;

        public void click86ListButton(){
            elementClick(listBtn,"Selected - "+listBtn.getText());
        }

        public void verify86ListWindow(){
            Assert.assertEquals(listBtn.getText(),"86 List");
            utils.log().info("Displayed window as - "+listBtn.getText());
        }

        @FindBy(xpath = "CheckDetialsIcon")
        WebElement checkDetailsIcon;
        public void clickClosedChecksDetailsIcon(){
            elementClick(checkDetailsIcon,"Selected Button as - "+checkDetailsIcon.getText());
        }

        @FindBy(xpath = "ORDER SUMMARY")
        WebElement orderSummaryScreen;
        public void verifyOrderSummaryScreen(){
            Assert.assertEquals(orderSummaryScreen.getText(),"ORDER SUMMARY");
        }

        public void verifySubtotalValueWithOrderSummarySubtotal(){
            WebElement subtotal =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
            String subtotalTxt =(subtotal.getText());
            Assert.assertEquals(subtotalTxt.replaceAll("[$ ]",""),(TestUtils.subtotalTxt).replaceAll("[$ ]",""));
            utils.log().info("Subtotal Same with Order summary subtotal - "+subtotalTxt);
        }

        public void verifyTotalValueWithOrderSummaryTotalValueCashReward(){
            WebElement totalValue =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
            String totalValueOrderSummary = totalValue.getText().replaceAll("[$ ]","");
            Assert.assertEquals(totalValueOrderSummary,TestUtils.totalTxt1.replaceAll("[$ ]",""));
            utils.log().info("Orde summary total is SAME "+totalValueOrderSummary);

        }

        public void clickBackToChecksBtn(){
            WebElement backToChecks =  driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Back To Checks\"]"));
            elementClick(backToChecks,"Selected - "+backToChecks.getText());
        }

    public void verifyTaxValueWithOrderSummaryTaxValueCashReward(){
        WebElement totalValue =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalValueOrderSummary = totalValue.getText().replaceAll("[$ ]","");
        Assert.assertEquals(totalValueOrderSummary,TestUtils.tipAmount.replaceAll("[$ ]",""));
        utils.log().info("Orde summary Tax is SAME "+totalValueOrderSummary);

    }

    public void verifyDiscountValueWithOrderSummaryDiscountValueCashReward(){
        WebElement totalValue =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalValueOrderSummary = totalValue.getText().replaceAll("[$ ]","");
        Assert.assertEquals(totalValueOrderSummary,TestUtils.discountTxt.replaceAll("[$ ]",""));
        utils.log().info("Orde summary Discount is SAME "+totalValueOrderSummary);

    }

    public void verifyGratuityValueWithOrderSummaryGratuityValueCashReward(){
        WebElement totalValue =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalValueOrderSummary = totalValue.getText().replaceAll("[$ ]","");
        Assert.assertEquals(totalValueOrderSummary,TestUtils.gratutiy.replaceAll("[$ ]",""));
        utils.log().info("Orde summary Gratuity is SAME "+totalValueOrderSummary);

    }


        public void clickSearchBtnIn86List(String menu){
            WebElement search86ListBtn =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSearchField"));
             elementClick(search86ListBtn,"selected search Button");
             sendKeys(search86ListBtn,"");

        }

    @FindBy(xpath =  "//XCUIElementTypeStaticText[@name=\"86 LIST\"]")
    WebElement listBtn1;

    public void click86ListButtonInLoginScreen(){
//        elementClick(listBtn1,"Selected - "+listBtn1.getText());
        WebElement phoneOrdersBtn =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeButton[4]/XCUIElementTypeStaticText"));
        Assert.assertEquals(phoneOrdersBtn.getText(), "86 LIST");
        elementClick(phoneOrdersBtn, "Selected Btn As - " + phoneOrdersBtn.getText());
    }

    @FindBy(xpath = "Pancake")
    WebElement pancake;
    @FindBy(xpath = "Onion Rings")
    WebElement onionRings;
    @FindBy(xpath = "Cash")
    WebElement cash;
    @FindBy(xpath = "Exact")
    WebElement exact;
    @FindBy(xpath = "Enter")
    WebElement enter;
    @FindBy(xpath = "Cancel")
    WebElement Cancel;
    public void createSAle() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        for(int i=391;i<=10000;i++){
            utils.log().info("Sale Count - "+i);
            WebElement checkNum= driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"));
            utils.log().info("Check Number - "+checkNum.getText());
            elementClick(pancake,"Selected - "+pancake.getText());
            elementClick(onionRings,"Selected - "+onionRings.getText());
            elementClick(cash,"Selected - "+cash.getText());
            elementClick(exact,"Selected - "+exact.getText());
            elementClick(enter,"Selected - "+enter.getText());
//            Thread.sleep(500);
//            elementClick(Cancel,"Selected - "+Cancel.getText());

        }
    }

    public void getTheCashRewardValueFromOrderScreen(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        WebElement cashRewardValue =  driver.findElement(By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        String cashRewardValue1  = cashRewardValue.getText();
        TestUtils.cashRewardValue  = cashRewardValue1;
        utils.log().info("Cash Reward Value - " +cashRewardValue1);
    }

    public void verifyCashRewardWithChangeDueValue(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        WebElement changeDue =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String changeDueValue  = changeDue.getText();
        Assert.assertEquals(TestUtils.cashRewardValue,changeDueValue);
        utils.log().info("Cash Reward & Change Due Value is SAME - " +changeDueValue);
    }

    public void verifyCashPriceWithChangeDueValue(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        WebElement changeDue =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String changeDueValue  = changeDue.getText();
        double total = Double.parseDouble(TestUtils.totalTxt.replaceAll("[$, ]",""));
        double cashPrice = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[$, ]",""));
        double changeDueee = total - cashPrice;
        DecimalFormat dc = new DecimalFormat("0.00");
        Assert.assertEquals(dc.format(changeDueee),changeDueValue.replaceAll("[$, ]",""));
        utils.log().info("Cash Reward & Change Due Value is SAME - " +changeDueValue);
    }
    public String tunaTacosEach(){
        return elementGetText(tunaTacosEachMenu,"Free Item Added In Menu ");
    }
    @FindBy(xpath = "//div[@class='free-section']//div[contains(@class,'p-col-4 discount-section-name disc-padding')]")
    private WebElement tunaTacosEachMenu;

    public void verifyCashPriceWithChangeDueValueWhileGratuityApplying(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        WebElement changeDue =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String changeDueValue  = changeDue.getText();
        double total = Double.parseDouble(TestUtils.totalTxt.replaceAll("[$, ]",""));
        double cashPrice = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[$, ]",""));
        double changeDueee = total - cashPrice;
        DecimalFormat dc = new DecimalFormat("0.00");
        Assert.assertEquals(dc.format(changeDueee),changeDueValue.replaceAll("[$, ]",""));
        utils.log().info("Cash Reward & Change Due Value is SAME - " +changeDueValue);
    }

    public void clickTheCheckFromTheTableLayoutForMerged() throws InterruptedException {
        String tableNo = TestUtils.tableNumberof;
        verifyTableMergee2(tableNo);
    }



    public void verifyTableMergee2(String m) throws InterruptedException {

        utils.log().info("M - "+m);
        Thread.sleep(1000);
        WebElement tableSelect =  driver.findElement(By.xpath("(//label[.='"+m+"'])[1]"));
        if (tableSelect.isDisplayed()) {                                                                     //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[15]

            Thread.sleep(1000);
            elementClick(tableSelect, "Selected Table - " + tableSelect.getText());
            try {
                WebElement checks =  driver.findElement(By.xpath("//ion-title[.='Checks']"));

                if (checks.isDisplayed()) {
                    Thread.sleep(1000);
                    String globalCheckNumber = TestUtils.globalCheckNumber;

                    WebElement checkNumberrr =  driver.findElement(By.xpath("//ion-content[contains(@class,'table-multiple-checks')]//div//p[.='"+globalCheckNumber+"']"));
                    if (checkNumberrr.isDisplayed()) {
                        Thread.sleep(1000);
                        elementClick(checkNumberrr, "Selected Check Number - " + checkNumberrr.getText());
                        Thread.sleep(1000);
                        WebElement x =  driver.findElement(By.xpath("//*[@id=\"multiple-Check\"]/app-table-multiple-checks/ion-header/ion-toolbar/button/span[1]/linga-icon"));
                        elementClick(x, "Tapped X Button");
                    } else {

                    }



                } else {
//                    WebElement table1 =  driver.findElement(By.xpath("//p[@id='tableNameId']//label[.='"+m+"']"));
//                    elementClick(table1, "table SELECTED - " + m);
                }
            } catch (Exception w) {

            }
        }
    }

    public void verifyTableMergeeTable(String m) throws InterruptedException {

        utils.log().info("M - "+m);
        Thread.sleep(1000);
        WebElement tableSelect =  driver.findElement(By.xpath("(//label[.='"+m+"'])[1]"));
        if (tableSelect.isDisplayed()) {                                                                     //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[15]

            Thread.sleep(1000);
            elementClick(tableSelect, "Selected Table - " + tableSelect.getText());
            try {
                WebElement checks =  driver.findElement(By.xpath("//ion-title[.='Checks']"));

                if (checks.isDisplayed()) {
                    Thread.sleep(1000);
                    String globalCheckNumber = TestUtils.globalCheckNumber;

                    WebElement checkNumberrr =  driver.findElement(By.xpath("//ion-content[contains(@class,'table-multiple-checks')]//div//p[.='"+globalCheckNumber+"']"));
                    if (checkNumberrr.isDisplayed()) {
                        Thread.sleep(1000);
                        elementClick(checkNumberrr, "Selected Check Number - " + checkNumberrr.getText());
                        Thread.sleep(1000);
//                        WebElement x =  driver.findElement(By.xpath("//*[@id=\"multiple-Check\"]/app-table-multiple-checks/ion-header/ion-toolbar/button/span[1]/linga-icon"));
//                        elementClick(x, "Tapped X Button");
                    } else {

                    }



                } else {
//                    WebElement table1 =  driver.findElement(By.xpath("//p[@id='tableNameId']//label[.='"+m+"']"));
//                    elementClick(table1, "table SELECTED - " + m);
                }
            } catch (Exception w) {

            }
        }
    }

    public void verifyTableMergee3(String m) throws InterruptedException {

        utils.log().info("M - "+m);
        Thread.sleep(1000);
        WebElement tableSelect =  driver.findElement(By.xpath("(//label[.='"+m+"'])[1]"));
        if (tableSelect.isDisplayed()) {                                                                     //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[15]

            Thread.sleep(1000);
            elementClick(tableSelect, "Selected Table - " + tableSelect.getText());
            try {
                Thread.sleep(1000);
                WebElement checks =  driver.findElement(By.xpath("//ion-title[.='Checks']"));

                if (checks.isDisplayed()) {
                    Thread.sleep(1200);
                    String globalCheckNumber = TestUtils.globalCheckNumber1;

                    WebElement checkNumberrr =  driver.findElement(By.xpath("//ion-content[contains(@class,'table-multiple-checks')]//div//p[.='"+globalCheckNumber+"']"));
                    if (checkNumberrr.isDisplayed()) {
                        elementClick(checkNumberrr, "Selected Check Number - " + checkNumberrr.getText());
                        Thread.sleep(1000);
                        WebElement x =  driver.findElement(By.xpath("//*[@id=\"multiple-Check\"]/app-table-multiple-checks/ion-header/ion-toolbar/button/span[1]/linga-icon"));
                        elementClick(x, "Tapped X Button");
                    } else {

                    }
                } else {
//                    WebElement table1 =  driver.findElement(By.xpath("//p[@id='tableNameId']//label[.='"+m+"']"));
//                    elementClick(table1, "table SELECTED - " + m);
                }
            } catch (Exception w) {

            }
        }
    }

    public String getTheNextCheckNumberAfterDoneSplitCheckProcess(){
        String number = ((TestUtils.globalCheckNumber)).replaceAll("[-]","");
        utils.log().info("CheckNumber  - "+number);
        int number1 = Integer.parseInt(number);
        int number2 = number1+1;
        String checkNumbers = String.valueOf(number2);
        int size = checkNumbers.length();
        String checknumber1 = checkNumbers.charAt(0)+"-"+ checkNumbers.substring(1,size);
        TestUtils.globalCheckNumber = checknumber1;
        utils.log().info("checkNumber  - "+checknumber1);
//        for(int i=0;i<=checkNumbers.length();i++) {
//            char ch = checkNumbers.charAt(i);
//        }
        return checknumber1;
    }

}



