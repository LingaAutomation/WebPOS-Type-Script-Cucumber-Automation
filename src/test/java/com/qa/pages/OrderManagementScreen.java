package com.qa.pages;


import com.qa.utils.TestUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrderManagementScreen extends OrderTypeWindow{

    public WebDriver driver;


    public OrderManagementScreen(){
        super(TestUtils.driver);

        this.driver =TestUtils.driver;

        PageFactory.initElements(this.driver,this);
    }
    public OrderManagementScreen(WebDriver driver) {
        super(driver);
    }

    public String checkNumber="";

    public String checkNumber1="";//Added Today

    public String modifier="";  //Added 23Nov

    @FindBy(xpath = "//linga-icon[@symbol='operationGear']" ) //id("Counting Machine").click();
    private WebElement QSRSettingsBtn;

    @FindBy(xpath = "//span[contains(.,'All')]")
    private WebElement allBtn;

    @FindBy(xpath = "//button[contains(.,'QSR')]//linga-icon[@symbol='down']")
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

    @FindBy(xpath = "(//ion-col[@class='qsrSeats_row-col md hydrated']//button[contains(@class,'qsrSeats_row-col')]//span[@class='mat-button-wrapper'])[1]" ) //seat number1
    private WebElement seat1;

    @FindBy(xpath = "(//ion-col[@class='qsrSeats_row-col md hydrated']//button[contains(@class,'qsrSeats_row-col')]//span[@class='mat-button-wrapper'])[2]" ) //seat number2
    private WebElement seat2;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"3\"])[2]" ) //seat number3 -to be deleted
    private WebElement seat3;

    @FindBy(xpath ="(//XCUIElementTypeButton[@name=\"arrow down\"])[2]")
    public WebElement arrowDownForOtherMenuItems;

    @FindBy(xpath = "//ion-footer[contains(@class,'modifier_footer')]//span[contains(.,'Done')]")
    private WebElement doneForThisMenuItem;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"arrow down\"])[1]")
    private WebElement arrowDownBtn1;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"arrow down\"])[2]")
    private WebElement arrowDownBtn2;

    @FindBy(xpath = "Tax" )
    private WebElement taxLbl;

                              //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeImage[2]
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeImage[2]")
    private WebElement TickIcon;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeImage[2]")
    private WebElement holdIcon;

    @FindBy(xpath = "Do you want to send hold menu item(s) to kitchen?")
    private WebElement doYouWantToSendHoldMenuItemToKitchen;

    @FindBy(xpath = "//button[contains(.,'Yes')]")
    private WebElement yesForHold;

    @FindBy(xpath = "No More Payment need")
    private WebElement noMorePaymentNeed;

    @FindBy(xpath = "No More payments Needed")
    private WebElement noMorePaymentNeed1;

    @FindBy(xpath = "Order Item Before Paying")
    private WebElement youNeedToOrderBeforeYouPay;

    @FindBy(xpath = "//p[contains(.,'Void Reason')]")
    private WebElement voidReason;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"T2\"]")
    private WebElement tableOrderNumber;

    @FindBy (xpath = "Modifiers")
    private WebElement modifierScreen;

    /****** Categories ******/

    @FindBy(xpath = "PIZZA" )
    private WebElement pizzaCategoryBtn;

    @FindBy(xpath = "Breakfast")
    private WebElement breakFastBtn;

    @FindBy(xpath = "upcharge category")
    private WebElement upchargeBtn;

    @FindBy(xpath = "Beverages")
    private WebElement beveragesBtn;

    @FindBy(xpath = "FOOD" )
    private WebElement foodCategoryBtn;

    @FindBy(xpath = "Pasta" )
    private WebElement pastaCategoryBtn;

    @FindBy(xpath = "Menu" )
    private WebElement menuCategoryBtn;

    @FindBy(xpath = "Desserts" )
    private WebElement dessertsCategoryBtn;

    @FindBy(xpath = "Salad" )
    private WebElement saladCategoryBtn;

    @FindBy(xpath = "Appetizers" )
    private WebElement appetizersCategoryBtn;

    @FindBy(xpath = "Briyani")
    private WebElement briyaniBtn;

    //Open Item Menu Item

    @FindBy(xpath = "Tiramisu ")
    private WebElement tiramisuBtn;

    @FindBy(xpath = " NO TOMATO")
    private WebElement noTomatoMdf;

    @FindBy(xpath = "//button[contains(.,'Continue')]")
    private WebElement continueButton;

    /***********************/

    @FindBy(xpath = "Done")
    private WebElement doneReceiptPrinter;

    @FindBy(xpath = "//button[@id='os_addSeat']")
    private WebElement addSeatBtn;

    @FindBy(xpath = "edit DeleteSeats" )
    private WebElement editDeleteSeatsBtn;

    @FindBy(xpath = "done DeleteSeats" )
    private WebElement doneDeleteSeatsBtn;

    @FindBy(xpath = "Delete_Seats")
    private WebElement delSeats;

    @FindBy(xpath = "//button[contains(.,'Finish')]")
    private WebElement finishOrderBtn;

    @FindBy(xpath = "//div[.='Option']")
    private WebElement optionBtn;

    @FindBy(xpath = "//div[.='Order']")
    private WebElement orderBtn;

    @FindBy(xpath = "Already sent to Kitchen")
    private WebElement alreadySentToKitchenTxt;

    @FindBy(xpath = "Done")
    private WebElement doneAlreadySentToKitchen;

    @FindBy(xpath = "//span//div[.='Payment']")
    private WebElement paymentBtn;

    @FindBy(xpath = "Payment(s) made on this check,Can you return this to Walkin")
    private WebElement paymentMadeOnThisCheckPopup;

    @FindBy(xpath = "Payment(s) made on this check,Can you return this to Auto ragav")
    private WebElement paymentMadeOnThisCheckPopupForHouseAccount;

    @FindBy(xpath = "Print")
    private WebElement printBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeImage[2]")
    private WebElement handIconForHold;

    @FindBy(xpath = "//button[contains(.,'Void')]")
    private WebElement voidBtn;

    @FindBy (xpath = "//p[.='All Orders Are Voided']")
    private WebElement allOrdersAreVoided;

    //Void!!
    @FindBy(xpath = "//span[contains(.,'Ordered Wrongly')]")
    private WebElement orderedWronglyReason;

    @FindBy(xpath = "//button[contains(.,'Add')]")
    private WebElement addVoidReasonBtn;

    @FindBy(xpath = "//div[@class='voidfooter-grd']//button[contains(.,'Add')]")
    private WebElement addNotesReasonBtn;

    //Add new customer to table
    @FindBy(xpath = "//linga-icon[@symbol='addUser']")
    private WebElement addCustomerToTableBtn;

    @FindBy(xpath = "//linga-icon[@symbol='addUser']")
    private WebElement addNewBtn;

    @FindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search\"]")
    private WebElement search;

    @FindBy(xpath = "Search")
    private WebElement searchOrderScreen;

    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private WebElement searchField;

    @FindBy(xpath = "Tiramisu")
    private WebElement tiramisuMenu;


    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]")
    private WebElement checkNO;

    @FindBy(xpath = "//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[157]")
    private WebElement lastRow;

    /******************* Tax MENU Item **************************/
    @FindBy(xpath = "Ravioli")
    private WebElement ravioliMenu;

    @FindBy(xpath = "Ravioli Pesto")
    private WebElement ravioliPestoMenu;

    @FindBy(xpath = "Fus Rapini")
    private WebElement fusRapiniMenu;

    @FindBy(xpath = "Cheesecake")
    private WebElement CheeseckaeMenu;


    @FindBy(xpath = "Fett Fr di Mare")
    private WebElement fettFrDiMareMenu;

    @FindBy(xpath = "Ling Meatballs")
    private WebElement lingMeatballsMenu;

    @FindBy(xpath = "Potatoes")
    private WebElement potatoesMenu;

    @FindBy(xpath = "Cannoli")
    private WebElement cannoliMenu;

    @FindBy(xpath = "TEA")
    private WebElement teaMenu;

    @FindBy(xpath = "(F) Onion Rings EACH")
    private WebElement onionRingEachMenu;

    @FindBy(xpath = "(F) Dosa EACH")
    private WebElement dosaEachMenu;

    @FindBy(xpath = "Ling Littlenck")
    private WebElement lingLittlenckMenu;

    @FindBy(xpath = "Ling Pes Shrimp")
    private WebElement lingPesShrimpMenu;

    @FindBy(xpath = "//button[contains(.,'Remove')]")
    private WebElement removeBtn;

    @FindBy(xpath = "Walkin")
    private WebElement walkinBtn;

    @FindBy(xpath = "//ion-title[.='Customer Profile']")
    private WebElement customerProfileWindow;

    @FindBy(xpath = "//ion-header//p[contains(.,'Add Customer')]")
    private WebElement AddCustomerSCreen;

    @FindBy(xpath = "Dine In")
    private WebElement dineInService;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"2\"])[2]")
    private WebElement seat2Del;

    @FindBy(xpath = "Close your Sale")
    private WebElement closeYourSaleTxt;

    @FindBy(xpath = "//button[contains(.,'Log Off')]")
    private WebElement logOffBtn;

    @FindBy(xpath = "Split")
    private WebElement splitBtn;

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

    @FindBy(xpath = "//button[contains(.,'Done')]")
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
        elementClick(QSRSettingsBtn, "Settings button pressed - ");
        return new TillManagementScreen(driver);
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

    public void pressArrowDown2 (){
        elementClick(arrowDownForOtherMenuItems, "the rest of the categories is listed");
    }

    public void checkNoOfSeats(String seatNo){
        WebElement seat=mergeAndFindElement(seatNo,"",TestUtils.Accessibility);
        if(seat.isDisplayed()){
            utils.log().info("Seats are created correctly");
        }
        else
        {
            utils.log().info("Seats are not created correctly");
        }
    }
    public void noOfSplit(String splitNo){
        WebElement seat=mergeAndFindElement(splitNo,"",TestUtils.Accessibility);
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

    public void clickAddNewBtn(){
        elementClick(addNewBtn,"Tapped Add New Button");
    }

    public void searchForCustomer(String customerName) {
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        sendKeys(search, customerName);
    }

    public void selectCustomerNameToAddToTheTable(String customerName){
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        WebElement customer = mergeAndFindElement("//XCUIElementTypeStaticText[@name=\""+customerName+"\"]","",TestUtils.Accessibility);
        elementClick(customer,"Tapped Customer - "+customerName);
    }

    public void selectCustomerNameAsToAddToTheTable(String customerName){
        WebElement customer = mergeAndFindElement("//XCUIElementTypeStaticText[@name=\""+customerName+" \"]","",TestUtils.Accessibility);
        elementClick(customer,"Tapped Customer - "+customerName);
    }


    public void deleteSeat(){
        pressArrowDown1();
        elementClick(editDeleteSeatsBtn,"editDeleteSeatsBtn is tapped");
        elementClick(seat3,"selected seat3 to be deleted");
        elementClick(doneDeleteSeatsBtn,"doneDeleteSeatsBtn is tapped");
        pressArrowDown1();
    }

    public void deleteSeat2(){
        pressArrowDown1();
        click(editDeleteSeatsBtn,"editDeleteSeatsBtn is tapped");
        click(seat2Del,"Selected seat 2 to be deleted");
        click(doneDeleteSeatsBtn,"doneDeleteSeatsBtn is tapped");
        pressArrowDown1();
    }

    public void selectSeat1(){
        elementClick(seat1, "selected seat 1" );
    }

    public void selectSeat2(){
        elementClick(seat2, "selected seat 2" );
    }

    public void selectSeats(String value){
        WebElement seat = (WebElement) driver.findElement(By.xpath("//ion-col[contains(@class,'qsrSeats_row-col')]//p[.='Seats']/..//button[contains(@class,'qsrSeats_row-col')]//span[contains(.,'"+value+"')]"));
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
//        WebElement e=mergeAndFindElement( "//XCUIElementTypeStaticText[@name="+modify+""]",TestUtils.Accessibility);
//        elementClick(e, modify +" modifier is selected");
    }
    /****** add a customer ******/

    public WebElement convertCustomerNameToMobileElement(String customerName){
        return (WebElement) driver.findElement(By.xpath(customerName));
    }

    /****** verify already sent to kitchen ******/

    public String getAlreadySentToKitchenPopUpTxt(){
        return elementGetText(alreadySentToKitchenTxt,"Text");
    }

    public void pressDoneAlreadySentToKitchen (){
        elementClick(doneAlreadySentToKitchen, "Done (already sent to Kitchen pop-up) is tapped");
    }
    /****** Select Order Types ******/

    public void selectOrderType(String orderType){
        WebElement e = mergeAndFindElement(orderType,"",TestUtils.Accessibility);
        elementClick(e, orderType + " selected");
    }


    /****** Select Categories ******/

    public void selectPizzaCategory() throws Exception {
        pressArrowDown2();
      //  elementClick(pizzaCategoryBtn, "Pizza Category selected");
        try {
            if (find(pizzaCategoryBtn, 2)) {
                elementClick(pizzaCategoryBtn, "Tapped Side CC Button");
            } else {
                scrollToElementCategory("up");
                elementClick(pizzaCategoryBtn, "Tapped Side CC Button");
            }
        } catch (Exception e) {
            scrollToElementCategory( "down");
            elementClick(pizzaCategoryBtn, "Tapped Side CC Button");
        }
    }

    public void selectBreakfastCategory() throws Exception {
        pressArrowDown2();
      //  elementClick(breakFastBtn, "Breakfast Category selected");
        try {
            if (find(breakFastBtn, 2)) {
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
            if (find(beveragesBtn, 2)) {
                elementClick(beveragesBtn, "Tapped Side CC Button");
            } else {
                scrollToElementPayments(beveragesBtn, "up");
                elementClick(beveragesBtn, "Tapped Side CC Button");
            }
        } catch (Exception e) {
            scrollToElementPayments(beveragesBtn, "down");
            elementClick(beveragesBtn, "Tapped Side CC Button");
        }
    }

    public void selectUpcharge() throws Exception {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        elementClick(arrowDownForOtherMenuItems, "Arrow Down");
        WebElement cate1 = driver.findElement(By.xpath("//div[contains(@class,'center-name category-container')]//div[contains(.,'upcharge')]"));
        elementClick(cate1, "Tapped category");
        Thread.sleep(5000);
    }

    public void selectPastaCategory() throws Exception {
        pressArrowDown2();
       // elementClick(pastaCategoryBtn, "Pizza Category selected");
        try {
            if (find(pastaCategoryBtn, 2)) {
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
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        pressArrowDown2();
        elementClick(menuCategoryBtn, "Pizza Category selected");
//        categorySelection(String.valueOf(menuCategoryBtn));

    }

    public void selectDessertsCategory() throws Exception {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        pressArrowDown2();
        try {
            if (find(dessertsCategoryBtn, 2)) {
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
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        pressArrowDown2();
        cate = (WebElement) driver.findElement(By.xpath(category));
        try {
            if (cate.isDisplayed()) {
                elementClick(cate, cate.getText() + " - Selected");
            } else {
                scrollToElementCategory("up");
                elementClick(cate, cate.getText() + " - Selected");
            }
        } catch (Exception z) {
            scrollToElementCategory("down");
            elementClick(cate, cate.getText() + " - Selected");
        }
    }
String xpath = "//XCUIElementTypeStaticText[@name=\"{0}\"]";
public void selectCatc(String category) throws Exception {
            pressArrowDown2();
            findAndClickMobileElement(xpath,category,TestUtils.Accessibility);
        }

public  void selectCategory (String value) throws Exception {
    pressArrowDown2();
    WebElement cateee = (WebElement) driver.findElement(By.xpath(value));
    elementClick(cateee,"Selected Category as - "+cateee.getText());
}    public void selectAppetizersCategory() throws Exception {
        pressArrowDown2();
        scrollToElementCategory("up");
        elementClick(appetizersCategoryBtn, "Appetizers Category selected");
    }

    public void selectSaladCategory(){
        pressArrowDown2();
        elementClick(saladCategoryBtn, "Salad Category selected");
    }

    public void selectFoodCategory() throws InterruptedException {
//        pressArrowDown2();
//        elementClick(foodCategoryBtn, "Food Category selected");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        elementClick(arrowDownForOtherMenuItems, "Arrow Down");
        WebElement cate1 = driver.findElement(By.xpath("//div[contains(@class,'center-name category-container')]//div[.='FOOD']"));
        elementClick(cate1, "Tapped category");
        Thread.sleep(5000);
    }

    public void verifyCashPriceValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

//        WebElement totalValues = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//div[@id='os_cashOptionStr']//input"));
        String totalAmount = totalValues.getAttribute("value");
        TestUtils.cashOptionOrderScreen = totalAmount;
        Assert.assertEquals(totalAmount,Amount);
//        utils.log().info("Total Value is SAME - "+Amount);
    }

    public void verifyCashPriceValueAsForTaxExempt(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

//        WebElement totalValues = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash PriceCash PriceCash Price\"]/../../XCUIElementTypeOther[2]/X)CUIElementTypeStaticText[4]"));
        String totalAmount = totalValues.getText();
        TestUtils.cashOptionOrderScreen = totalAmount;
        Assert.assertEquals(totalAmount,Amount);
        utils.log().info("Total Value is SAME - "+Amount);
    }


    public void verifyCashPriceValue1As(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        WebElement totalValues = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStatic)Text[6]"));
        String totalAmount = totalValues.getText();
        TestUtils.cashOptionOrderScreen = totalAmount;
        Assert.assertEquals(totalAmount,Amount);
        utils.log().info("Cash Price is SAME - "+Amount);
    }

    public void verifyCashPriceValue2As(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

//        WebElement totalValues = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//div[@id='os_cashOptionStr']//input"));
        String totalAmount = totalValues.getAttribute("value");
        TestUtils.cashOptionOrderScreen = totalAmount;
        Assert.assertEquals(totalAmount,Amount);
//        utils.log().info("Cash Price is SAME - "+Amount);
    }

    public void verifyCashPriceValue3As(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

//        WebElement totalValues = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStatic)Text[8]"));
        String totalAmount = totalValues.getText();
        TestUtils.cashOptionOrderScreen = totalAmount;
        Assert.assertEquals(totalAmount,Amount);
        utils.log().info("Cash Price is SAME - "+Amount);
    }
    public void selectMenuItem(String menuItem) throws Exception {
        WebElement e = driver.findElement(By.xpath("//button[contains(@id,'menu-item')]//div[.='"+menuItem+"']"));
            elementClick(e, menuItem + " selected");
    }

    public void verifyMenuSubTotalAs(String amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        WebElement subtotalValues = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]");
//         String subTotalAmount = subtotalValues.getText();
//         TestUtils.subtotalTxt = subTotalAmount;
//         Assert.assertEquals(subTotalAmount,amount);
//         utils.log().info("Subtotal Value as Same with Price Level 2 - "+amount);
        WebElement e11 = driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subtotalValue = e11.getAttribute("value");
        Assert.assertEquals(subtotalValue,amount);
        TestUtils.subtotalTxt = subtotalValue;
//        utils.log().info("Subtotal Value is - "+amount);
    }

    public void verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscount(){
        double cashPriceValue = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[A-Z$ ]",""));
        double cashReward = 5.32;
        double expectedTotalPrice1 = ((cashPriceValue) * cashReward);
        double expectedTotalPrice =  expectedTotalPrice1/100;

        WebElement cashPrice1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)3]"));
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

        WebElement cashPrice1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)4]"));
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

        WebElement cashPrice1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)4]"));
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

        WebElement cashPrice1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)4]"));
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

        WebElement cashPrice1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)5]"));
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

        WebElement cashPrice1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)6]"));
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

        WebElement cashPrice1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)2]"));
        String actualCashPrice = cashPrice1.getText().replaceAll("[$ ]","");

        DecimalFormat dc1 = new DecimalFormat("0.00");
        double expectedCashValue = Double.parseDouble(dc1.format(expectedTotalPrice));
        utils.log().info(String.valueOf(expectedCashValue));
        double expectedTotalValue = cashPriceValue + expectedTotalPrice ;

        Assert.assertEquals(dc1.format(expectedTotalValue), actualCashPrice);
        TestUtils.totalTxt = actualCashPrice;
        utils.log().info("Expected Cash Price is SAME with Actual Cash Price - "+actualCashPrice);
    }


    public void verifyTaxValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement e11 = (WebElement) driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String subtotalValue = e11.getAttribute("value");
        TestUtils.taxTxt = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
//        utils.log().info("Tax Value is - "+Amount);

    }

    public void verifyDiscountValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement e11 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Discount\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticTe)xt[3]"));
        String subtotalValue = e11.getText();
        TestUtils.taxTxt = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
        utils.log().info("Tax Value is - "+Amount);

    }

    public void verifyDiscount1ValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement e11 = (WebElement) driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String subtotalValue = e11.getAttribute("value");
        TestUtils.taxTxt = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
//        utils.log().info("Tax Value is - "+Amount);

    }

    public void verifyServiceChargeValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement e11 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Service Charge\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeSt)aticText[3]"));
        String subtotalValue = e11.getText();
        TestUtils.serviceCharge = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
        utils.log().info("Service Charge Value is - "+Amount);

    }

    public void verifyServiceChargeValue1As(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement e11 = (WebElement) driver.findElement(By.xpath("//div[@id='os_serviceChargeStr']//input"));
        String subtotalValue = e11.getAttribute("value");
        TestUtils.serviceCharge = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
//        utils.log().info("Service Charge Value is - "+Amount);

    }

    public void verifyServiceChargeValue2As(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement e11 = (WebElement) driver.findElement(By.xpath("//div[@id='os_serviceChargeStr']//input"));
        String subtotalValue = e11.getAttribute("value");
        TestUtils.serviceCharge = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
//        utils.log().info("Service Charge Value is - "+Amount);

    }

    public void verifyTotalValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement totalValues = driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmount = totalValues.getText();
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.totalTxt = totalAmount;
//        utils.log().info("Cash Price Value is SAME - "+Amount);
    }

    public void verifyTotal2ValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmount = totalValues.getAttribute("value");
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.totalTxt = totalAmount;
//        utils.log().info("Total Value is SAME - "+Amount);
    }

    public void verifyTheCashPriceNameONTheOrderScreen(){
    WebElement cashPrice = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCU)IElementTypeStaticText[5]"));
    Assert.assertEquals(cashPrice.getText(),"Cash Price");
    utils.log().info("Displayed - "+cashPrice.getText());
    }

    public void verifyTotal4ValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)4]"));
        String totalAmount = totalValues.getText();
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.totalTxt = totalAmount;
        utils.log().info("Cash Price Value is SAME - "+Amount);
    }

    public void verifyPaidAmountValue1As(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String totalAmount = totalValues.getAttribute("value");
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.paidAmount = totalAmount;
        utils.log().info("Paid Amount Value is SAME - "+Amount);
    }

    public void verifyPaidAmountValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String totalAmount = totalValues.getAttribute("value");
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.paidAmount = totalAmount;
//        utils.log().info("Cash Price Value is SAME - "+Amount);
    }
    public void verifyPaidAmountValueAs0(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String totalAmount = totalValues.getAttribute("value");
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.paidAmount = totalAmount;
//        utils.log().info("Cash Price Value is SAME - "+Amount);
    }
    public void verifyTotal5ValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmount = totalValues.getAttribute("value");
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.totalTxt = totalAmount;
//        utils.log().info("Cash Price Value is SAME - "+Amount);
    }

    public void verifyTotal6ValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmount = totalValues.getAttribute("value");
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.totalTxt = totalAmount;
        utils.log().info("Cash Price Value is SAME - "+Amount);
    }

    public void verifyTaxExemptTotalValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[)2]"));
        String totalAmount = totalValues.getText();
        Assert.assertEquals(totalAmount,Amount);
        TestUtils.totalTxt = totalAmount;
        utils.log().info("Cash Price Value is SAME - "+Amount);
    }


    public void verifyCashOptionValueASWithGratuity(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//div[@id='os_cashOptionStr']//input"));
        String totalAmount = totalValues.getAttribute("value");
        Assert.assertEquals(totalAmount,Amount);
//        utils.log().info("Cash Price Value is SAME - "+Amount);
    }
    public void verifyGratuityValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement e11 = (WebElement) driver.findElement(By.xpath("//div[@id='os_gratuityAmountStr']//input"));
        String subtotalValue = e11.getText();
        TestUtils.gratutiy = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
//        utils.log().info("Gratuity Value is - "+Amount);
    }

    public void verifyGratuity1ValueAs(String Amount){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement e11 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Gratuity\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticTe)xt[4]"));
        String subtotalValue = e11.getText();
        TestUtils.gratutiy = subtotalValue;
        Assert.assertEquals(subtotalValue,Amount);
        utils.log().info("Gratuity Value is - "+Amount);
    }

//    public void getTheTotalValueInTheOrderScreen(){
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        WebElement totalValues = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUI)ElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]");
//        String totalAmount = totalValues.getText();
//
//    }

    public void getTotalOfMenuWhileCashDiscountApplied(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement totalValues = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        String totalAmount = totalValues.getText();
        TestUtils.totalTxt1 = totalAmount;

    }

    public void verifyTheTotalValueWithPaymentScreen(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement totalPayment = (WebElement) driver.findElement(By.xpath("//div[@class='fcashfooter-rw']//div[@class='fcashfooter_balanceStr']//span"));
        String totalPaymentTxt = totalPayment.getText();
        String totalOrder = TestUtils.totalTxt1;
        Assert.assertEquals(totalOrder,totalPaymentTxt);
        WebElement totalTxtt = (WebElement) driver.findElement(By.xpath("//div[@class='fcashfooter-rw']//div[@class='fcashfooter_balanceStr amount-right']//span"));
        String totalTxtt1 = totalTxtt.getText();
        Assert.assertEquals(totalTxtt1,totalOrder);
//        utils.log().info("Total Value is SAME With FAst cash Screen - "+totalTxtt1);

    }
    public void verifySubtotalValueWithCashValueInPaymentScreen(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement cashOptionValuePaymentScreen = (WebElement) driver.findElement(By.xpath("//ion-toolbar//div//p//label[contains(.,'Cash Price')]/..//label[2]"));
        String cashOptionValuePaymentScreenTxt = cashOptionValuePaymentScreen.getText();
        double subtotalValue = Double.parseDouble(TestUtils.subtotalTxt.replaceAll("[$ ]",""));
        double taxValue = Double.parseDouble(TestUtils.taxTxt.replaceAll("[$ ]",""));
        double totalValue = subtotalValue + taxValue;
        DecimalFormat dc = new DecimalFormat("0.00");

        Assert.assertEquals(cashOptionValuePaymentScreenTxt.replaceAll("[$ ]",""), dc.format(totalValue));
//        utils.log().info("Subtotal same with cash value - "+subtotalValue);

    }
    public void selectMenuItemToSeeMenuOptionWindow(String menu){
        WebElement el1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+menu+" \"]"));
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

    public void selectModifier(String modifier){
        WebElement e = driver.findElement(By.xpath("//ion-col[contains(@class,'mod-but')]//button//span[contains(.,'"+modifier+"')]"));
        elementClick(e, modifier + " selected");
    }
    public void selectModifier1(String modify){
        WebElement el1 = mergeAndFindElement("//XCUIElementTypeStaticText[@name=\" "+modify+"\"]","",TestUtils.Accessibility);
        elementClick(el1,"Tapped modifier");
    }

    public void verifyOrderedItemExists(String itemName) {
        if(driver.findElements(By.name(itemName)).isEmpty())
        {
            utils.log().info("Order Item is added");
        }
        else
            utils.log().info("Order Item is not added");
    }

    public void pressSearch(){ elementClick(searchOrderScreen,"Tapped Search Button on the Order screen"); }

    public void verifySearchField(){
        if(searchField.isDisplayed()){
            utils.log().info("Search field got Visible");
        }else {
            utils.log().info("Search field is not visible");
        }
    }

    public void selectMenuItemSearch(String menu_item){

        searchField.sendKeys(menu_item);
        try {
            WebElement e = mergeAndFindElement(menu_item, "", TestUtils.Accessibility);
            if (find(e, 2)) {
                elementClick(e, menu_item + " - selected");
            }
        }catch (Exception h) {
            utils.log().info(menu_item + " - not visible");
        }
        //searchField.sendKeys(Keys.ENTER);

    }
    public void doneForTheMenuItem(){
        elementClick(doneForThisMenuItem, "done for the menu item");
    }

    /****** Select Serving Sizes ******/

    public void selectServingSize(String modifier){
        WebElement e = mergeAndFindElement(modifier,"",TestUtils.Accessibility);
        elementClick(e, modifier + " selected");
    }

    /**********************************/

    public void pressFinish(){
        driver.manage().timeouts().implicitlyWait(16,TimeUnit.SECONDS);
        elementClick(finishOrderBtn, "finish button tapped");
    }

    /****** Hold operation ******/
    public void assertHold(){
        if(find(handIconForHold,2)) {
            utils.log().info("Hold action is verified");}
        else{
            utils.log().info("Hold action is not verified, please check logs!");}
    }
    public void pressYesForHold(){
        elementClick(yesForHold,"Tapped Yes Button on the Hold Popup");
    }

    public void pressOptions(){
        elementClick(optionBtn, "Options button is tapped");
    }

    public void pressPrintBtn(){
        elementClick(printBtn, "Print button is tapped");
    }

    public void pressDoneReceiptPrinter(){
        elementClick(doneReceiptPrinter,"Done button tapped on receipt printer pop-up" );
    }

    /***** Void Order ******/

    public void pressVoidBtn(){
        elementClick(voidBtn, "Void button tapped" );
    }
    public String getVoidReasonPopup(){
        return elementGetText(voidReason,"Text");
    }


    public void selectOrderedWrongly(){
        elementClick(orderedWronglyReason, "Ordered wrongly is selected");
    }

    public void pressAddVoidReasonBtn(){
        elementClick(addNotesReasonBtn, "Add (void reason) button is tapped");
    }

    public String getAllOrdersAreVoidedMsg(){return elementGetText(allOrdersAreVoided,"Text");}
    /****** Tax Exempt ******/

    public void checkTaxExists() {

        try {
            if (driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input")).isDisplayed()) {
//                utils.log().info("Tax is exempted");
            } else {
//                utils.log().info("Tax is not exempted");
            }
        } catch (Exception e) {

        }
    }



    public void checkTaxValue(String value){
        WebElement tax = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        if(tax.isDisplayed()){
//            utils.log().info( " Tax is - "+ value);
            TestUtils.taxTxt = value;
        }else {
//            utils.log().info("Tax is not Displayed");
        }
    }
    /****** Payment ******/

    public void pressPayment(){
        elementClick(paymentBtn, "Payment button is tapped");
    }

    public void verifyThePaidAmountPartialPaidAmountOnthePaymentScreen(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement firstAmount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIEleme)ntTypeCell[1]/XCUIElementTypeStaticText[3]"));
        String firstAmountTxt = firstAmount.getText();
        Assert.assertEquals(firstAmountTxt,TestUtils.paidAmount1.replaceAll("[$ ]",""));
        WebElement secondAmount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIEleme)ntTypeCell[2]/XCUIElementTypeStaticText[3]"));
        String[] secondAmountTxt = secondAmount.getText().split("\\+");
        Assert.assertEquals(secondAmountTxt[0],TestUtils.BalanceCardAmount.replaceAll("[$ ]",""));
        Assert.assertEquals(secondAmountTxt[1],TestUtils.tipAmount.replaceAll("[$ ]",""));
        utils.log().info("All Paid the partial amount - "+firstAmountTxt+" "+secondAmount.getText());
    }


    /****** Open Item Verification ******/

    public void verifyOpenItem(String name) {
        WebElement menu = driver.findElement(By.xpath("//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']//div[text()='"+name+"']"));
        if(menu.isDisplayed())
        {
//            utils.log().info("Open Item is added");
        }
        else {
//            utils.log().info("Open Item is not added");
        }
    }
    public void verifyTickIcon(){
        if(find(TickIcon,2)){
            utils.log().info("Tick mark is Displayed");
        }
        else
        {
            utils.log().info("Tick mark is not Displayed");
        }
    }
    public String getdoYouWantToSendHoldMenuItemToKitchenMsg(){
        return elementGetText(doYouWantToSendHoldMenuItemToKitchen,"Text");
    }
    public String getPaymentMadeOnThisCheck(){
        return elementGetText(paymentMadeOnThisCheckPopup,"Text");
    }

    public String getPaymentMadeOnThisCheckHouseAccount(){
        return elementGetText(paymentMadeOnThisCheckPopupForHouseAccount,"Text");
    }

    public String getNoMorePaymentNeedPopup(){
        return elementGetText(noMorePaymentNeed,"Text");
    }
    public String getNoMorePaymentNeed1Popup(){
        return elementGetText(noMorePaymentNeed1,"Text");
    }

    public String getYouNeedToOrderBeforeYouPayMsg(){
        return elementGetText(youNeedToOrderBeforeYouPay,"Text");
    }

    public void pressTableNumber(String Table1){
        WebElement e=mergeAndFindElement( Table1,"",TestUtils.Accessibility) ;
        elementClick(e,Table1 + "selected");
    }

    public String getModifierScreen(){
        return elementGetText(modifierScreen,"Text");
    }

    public void selectModifierInModifierScreen(String modifier){
        WebElement e=mergeAndFindElement("//XCUIElementTypeButton[@name=\""+modifier+"\"]","",TestUtils.Accessibility);
        elementClick(e,modifier + "selected");
    }

    public void selectModifierForMoreTime(String modifier){
        WebElement e=mergeAndFindElement("//XCUIElementTypeButton[@name=\""+modifier+"\"]","",TestUtils.Accessibility);
        for(int i=0;i<5;i++) {
            elementClick(e, modifier + "selected");
        }

    }
    public void verifyModifiersAddOrderScreen(String modifiers) {

        WebElement el1 = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\" " + modifiers + "\"])","",TestUtils.Accessibility);
        String modi=el1.getText();
        if (el1.isDisplayed()) {
            utils.log().info("Modifiers Added into Menu Items "+modi);
        } else {
            utils.log().info("Modifiers Not Add into Menu Items");
        }
    }


    public void seatWithOrderScreen(String seat){
        WebElement e=mergeAndFindElement(seat,"",TestUtils.Accessibility);
        if(e.isDisplayed()){
            utils.log().info("Seat added in Order screen");
        }else {
            utils.log().info("Seat is not added in order screen");
        }
    }

    public void enterMenuQuantity(String Number){
        WebElement el1 = driver.findElement(By.xpath("//p[contains(@class,'orderlist-courseName')]/../div//div//div[contains(@class,'rderlist-qty text')]"));
        el1.click();
            WebElement el2 = driver.findElement(By.xpath("//ion-col[contains(@class,'quantity_grid-row')]//button//span[.='"+Number+"']"));
            elementClick(el2, Number + " selected");
            elementClick(continueButton, "Tapped Continue");
    }

    public void enterMenuQuantity$Store(String Number) {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement el1 = mergeAndFindElement("//XCUIElementTypeButton[@name=\"1\"]", "", TestUtils.Accessibility);
        el1.click();

        for (int i = 0; i < Number.length(); i++) {
            char c = Number.charAt(i);
            String ch = String.valueOf(c);
            utils.log().info("i " + c);
            if (ch.equals("1")) {
                WebElement e1 = (WebElement) driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"1\"])[2]"));
            elementClick(e1,"Selected - "+e1);
            } else {
                WebElement el21 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"" + c + "\"]"));
                elementClick(el21, c + " selected");
            }
        }
            elementClick(continueButton, "Tapped Continue");

    }
    public void enterMenuQty(String number){

        WebElement el = driver.findElement(By.xpath("//p[contains(@class,'orderlist-courseName')]/../div//div//div[contains(@class,'rderlist-qty text')]"));
        el.click();

        WebElement el3 = driver.findElement(By.xpath("//ion-col[contains(@class,'quantity_grid-row')]//button//span[.='"+number+"']"));
        elementClick(el3, " selected");

        elementClick(continueButton,"Tapped Continue");

    }

    public void checkDiscountValue(String value){
        WebElement discount=mergeAndFindElement(value,"",TestUtils.Accessibility);
        if(discount.isDisplayed()){
            utils.log().info( " Discount is - "+ value);
        }else {
            utils.log().info("Discount is not Displayed");
        }
    }

    public void checkGratuityValue(String value){
        WebElement discount=mergeAndFindElement(value,"",TestUtils.Accessibility);
        if(discount.isDisplayed()){
            utils.log().info( " Gratuity is - "+ value);
        }else {
            utils.log().info("Gratuity is not Displayed");
        }
    }

    public String OnionRingsEachMenu(){
        return elementGetText(onionRingEachMenu,"Text");
    }

    public String dosaEach(){
        return elementGetText(dosaEachMenu,"Text");
    }
    public void discountName(String discount){
        WebElement e2 = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"" + discount + "\"])","",TestUtils.Accessibility);
        if (e2.isDisplayed()) {
            utils.log().info(discount + " - is Displayed");
        } else {
            utils.log().info("Discount is not Displayed");
        }
    }

    public void mostDiscount(String discount){
        WebElement e2 = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\""+discount+"\"])","",TestUtils.Accessibility);
        if (e2.isDisplayed()) {
            utils.log().info(discount + " - is Most Expensive Displayed");
        } else {
            utils.log().info("Discount is not Displayed");
        }

    }

    public void LeastDiscount(String discount){
        WebElement e2 = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\""+discount+"\"])[1]","",TestUtils.Accessibility);
        // String data= e2.getText().substring(1);
        if (e2.isDisplayed()) {
            utils.log().info(discount + " - is Least Expensive Displayed");
        } else {
            utils.log().info("Discount is not Displayed");
        }

    }

    public void verifyCustomerAddOrderScreen(String member){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement customerAddOrderScreen= driver.findElement(By.xpath("//button[@id='os_selectedSeat']/../p[@slot='end']"));
        if(customerAddOrderScreen.isDisplayed()){
//            utils.log().info(member+" - Customer Is added on Order Screen ");
        }else {
//            utils.log().info("Customer is not added");
        }
    }

    public void clickRemoveBtn(){
        elementClick(removeBtn,"Tapped remove button");
    }

    public String customerRemoved(){
        return elementGetText(walkinBtn,"Text");
    }

    public String verifyCustomerProfile(){
        return elementGetText(customerProfileWindow,"Text");
    }

    public void verifyServiceType(String order){
        WebElement type=mergeAndFindElement(order,"",TestUtils.Accessibility);
        if(type.isDisplayed()){
            utils.log().info(order + " - Service Type Is displayed");
        }else {
            utils.log().info("Service Type as not - "+order);
        }
    }

    public String verifyCloseSale(){
        return elementGetText(closeYourSaleTxt,"Text");
    }

    public void clickLogOffBtn(){
        elementClick(logOffBtn,"Tapped log Off Button");
    }

    public void visibleSplitButton(){
        if(splitBtn.isEnabled()){
            utils.log().info("Split Button is Enabled");
        }else {
            utils.log().info("Split Button is Disabled");
        }
    }

    public String verifyCannotAddModifierTxt(){
        return elementGetText(cannotAddModifier,"Text");
    }

    public String verifyNoMenuItemFoundTxt(){
        return elementGetText(noMenuItemTxt,"Text");
    }

    public void verifyCashButtonEnable(){
        WebElement cash=mergeAndFindElement("Cash","",TestUtils.Accessibility);
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

    public String verifyYouCannotDeletePopup(){
        return elementGetText(youCannotDeleteTxt,"Text");
    }

    public void clickDeleteBtn()
    {
        WebElement el1 = mergeAndFindElement("Delete","",TestUtils.Accessibility);
        elementClick(el1,"Tapped Delete Button");
    }

    public void clickDoneButtonTypeWindow(){
        elementClick(doneButton,"Tapped done button");
    }

    public String getCheckNumberTxt(){
        WebElement checkNum= driver.findElement(By.xpath("//p[@class='order-header-checkno']"));
        checkNumber=checkNum.getText();
        TestUtils.globalCheckNumber=checkNumber;
//        utils.log().info(checkNumber);
        return checkNumber;
    }

    public void verifyServingSize() throws IOException {
        try {
            WebElement modify = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));  //Changed mergeAndFindELement to driver.Findelement ( 3 DEC / Benseron)
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
            WebElement serving=mergeAndFindElement( "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText["+i+"]","",TestUtils.Accessibility);
            servingName=serving.getText();
            utils.log().info("Serving Sizes - "+servingName);

        }


    }

    public void verifySizeCell(){
        try {
            WebElement size = mergeAndFindElement("Size","",TestUtils.Accessibility);
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
            WebElement modifier=mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell/XCUIElementTypeStaticText[1]","",TestUtils.Accessibility);
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
        WebElement element=mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]","",TestUtils.Accessibility);
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
        WebElement alternate=mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeScrollView/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"," ",TestUtils.Accessibility);
        String data=alternate.getText();
        elementClick(alternate,"Tapped Alter modifier - "+data);

    }

    public void clickOkBtnInAlternateModifierScreen(){
        elementClick(okBtnAlternateModifier,"Tapped Ok Button In Alternate Modifier Screen");
    }

    public void verifyIncludeModifier(){
        try {
            WebElement modify = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]", "", TestUtils.Accessibility);
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
        WebElement checkNum = driver.findElement(By.xpath("//div[@id='os_check']//p[contains(@class,'checkno')]"));
        checkNumber1=checkNum.getText();
        TestUtils.globalCheckNumber1=checkNumber1;
//        utils.log().info(checkNumber1);
        return checkNumber1;
    }
    public void clickPrefixModifierBtn(){
        WebElement prefixBtn=(WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
        String prefix=prefixBtn.getText();
        click(prefixBtn,"Tapped prefix Modifier is - "+prefix);

    }

    public String clickModifierFromConversationalScreen(){
        WebElement mandatoryModifier=(WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
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
            WebElement listOfModifier1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
            WebElement listOfModifier2 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[3]"));

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
            WebElement listOfModifier1=(WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+i+"]/XCUIElementTypeStaticText[1]"));
            WebElement listOfModifier2=(WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+i+"]/XCUIElementTypeStaticText[3]"));
            String data1=listOfModifier1.getText();
            String data2=listOfModifier2.getText();
            utils.log().info(" Modifier  - "+data1+ " "+data2);
        }

    }

    public void verifyMaximumAndMinimumCount(){
        WebElement maxAndMin=(WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIE)lementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
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
        //    WebElement total = (WebElement) driver.findElement(By.xpath()("(//XCUIElementTypeStaticText[@name=\"Total\"])[1]");
        //XCUIElementTypeApplication[@name="Lin)ga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]
        WebElement amount = driver.findElement(By.xpath("//ion-footer[contains(@class,'fcashfooter')]//div//div[contains(.,'Total')]//span"));

        //   String totalTxt = total.getText();
        cashTxt1 = amount.getText();
        TestUtils.cashTxt=cashTxt1;
//        utils.log().info("Amount Paid in Cash Window "+ " - "+cashTxt1);

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

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        for(int i =81;i<=120000;i++) {
            utils.log().info("Count - "+i);
            elementClick(addCustomerToTableBtn,"Add cutoemr button");

            elementClick(addNewBtn,"Add new Tapped");
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

            elementClick(addCustomerToTableBtn,"Add cutoemr button");

            elementClick(removeBtn,"Tapped REmove");

        }
    }
    @FindBy(xpath = "Gratuity cannot be removed for paid check")
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

        public void getTotalOfMenuInOrderscreen(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
          WebElement totalOfMenu = driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
          String totalOfMenuTxt = totalOfMenu.getAttribute("Value");
            TestUtils.totalTxt = totalOfMenuTxt;
//            utils.log().info("Total Of Menus - "+totalOfMenuTxt);
        }

        public void getTheMenuInTheOrderScreen() {

        ArrayList<String> menus = new ArrayList<>();
            List<WebElement> Listmenu = (List<WebElement>) driver.findElement(By.xpath("//div[contains(@class,'orderlist-container ordr-border')]"));
            int countOfMenu = Listmenu.size();
            for (int i = 1; i <= countOfMenu; i++) {
                WebElement menu = (WebElement) driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container ordr-border')]//div[contains(@class,'menu-section orderlist')]//div[contains(@class,'orderlist-menuname')])["+i+"]"));
                WebElement prize = (WebElement) driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container ordr-border')]//div[contains(@class,'menu-section orderlist')]//div[contains(@class,'text-pos-end')])["+i+"]"));
                String menuName = menu.getText();
                String priceOfPrize = prize.getText();
                TestUtils.menu = menuName;

//                utils.log().info("Menus Are - " + menuName + " - " + priceOfPrize);
                menus.add(menu.getText());
                TestUtils.menuNames=menus;
                try {                                                                                  //XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]
                    List<WebElement> modifier = (List<WebElement>) driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container ordr-border')])["+i+"]//div[contains(@class,'modifier-section')]//div[contains(@class,'menuname qsr-mod')]"));
                    int sizeOfModifier = modifier.size();
                    for (int w = 1; w <= sizeOfModifier; w++) {
                        WebElement modi = (WebElement) driver.findElement(By.xpath("((//div[contains(@class,'orderlist-container ordr-border')])["+i+"]//div[contains(@class,'modifier-section')]//div[contains(@class,'menuname qsr-mod')])["+w+"]"));
                        WebElement Modiprize = (WebElement) driver.findElement(By.xpath("((//div[contains(@class,'orderlist-container ordr-border')])["+i+"]//div[contains(@class,'modifier-section')]//div[contains(@class,'pos-end qsr-mod')])["+w+"]"));
                        String modiName = modi.getText();
                        String priceOfModi = Modiprize.getText();
//                        utils.log().info("Modifiers Are - " + modiName + " - " + priceOfModi);
                    }
                } catch (Exception z) {

                }
            }
        }
        @FindBy(xpath = "//p[.='Quantity is not enough.']")
        WebElement quantityIsNotEnough;
        public void verifyQuantityIsNotEnoughPopup1(){
            Assert.assertEquals(quantityIsNotEnough.getText(),"Quantity is not enough.");
//            utils.log().info("Displayed Popup as - "+quantityIsNotEnough.getText());
        }

        @FindBy(xpath = "//label[.='86 List']")
        WebElement listBtn;

        public void click86ListButton(){
            elementClick(listBtn,"Selected - "+listBtn.getText());
        }

        public void verify86ListWindow(){
            Assert.assertEquals(listBtn.getText(),"86 List");
//            utils.log().info("Displayed window as - "+listBtn.getText());
        }

        @FindBy(xpath = "//button[contains(@class,'viewCheckIcon mat-button')]")
        WebElement checkDetailsIcon;
        public void clickClosedChecksDetailsIcon(){
            elementClick(checkDetailsIcon,"Selected Button as - "+checkDetailsIcon.getText());
        }

        @FindBy(xpath = "//ion-label[.='ORDER SUMMARY']")
        WebElement orderSummaryScreen;
        public void verifyOrderSummaryScreen(){
            Assert.assertEquals(orderSummaryScreen.getText(),"ORDER SUMMARY");
        }

        public void verifySubtotalValueWithOrderSummarySubtotal(){
            WebElement subtotal = (WebElement) driver.findElement(By.xpath(" //ion-grid[contains(@class,'sub-total')]//ion-row//ion-col[contains(@class,'ion-text-right')]"));
            String subtotalTxt =(subtotal.getText());
            Assert.assertEquals(subtotalTxt.replaceAll("[$ ]",""),(TestUtils.subtotalTxt).replaceAll("[$ ]",""));
//            utils.log().info("Subtotal Same with Order summary subtotal - "+subtotalTxt);
            driver.findElement(By.xpath("//linga-icon[@symbol='clearArrow']")).click();
        }

        public void verifyTotalValueWithOrderSummaryTotalValueCashReward(){
            WebElement totalValue = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
            String totalValueOrderSummary = totalValue.getText().replaceAll("[$ ]","");
            Assert.assertEquals(totalValueOrderSummary,TestUtils.totalTxt1.replaceAll("[$ ]",""));
            utils.log().info("Orde summary total is SAME "+totalValueOrderSummary);

        }

        public void clickBackToChecksBtn(){
            WebElement backToChecks = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Back To Checks\"]"));
            elementClick(backToChecks,"Selected - "+backToChecks.getText());
        }

    public void verifyTaxValueWithOrderSummaryTaxValueCashReward(){
        WebElement totalValue = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalValueOrderSummary = totalValue.getText().replaceAll("[$ ]","");
        Assert.assertEquals(totalValueOrderSummary,TestUtils.tipAmount.replaceAll("[$ ]",""));
        utils.log().info("Orde summary Tax is SAME "+totalValueOrderSummary);

    }

    public void verifyDiscountValueWithOrderSummaryDiscountValueCashReward(){
        WebElement totalValue = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalValueOrderSummary = totalValue.getText().replaceAll("[$ ]","");
        Assert.assertEquals(totalValueOrderSummary,TestUtils.discountTxt.replaceAll("[$ ]",""));
        utils.log().info("Orde summary Discount is SAME "+totalValueOrderSummary);

    }

    public void verifyGratuityValueWithOrderSummaryGratuityValueCashReward(){
        WebElement totalValue = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalValueOrderSummary = totalValue.getText().replaceAll("[$ ]","");
        Assert.assertEquals(totalValueOrderSummary,TestUtils.gratutiy.replaceAll("[$ ]",""));
        utils.log().info("Orde summary Gratuity is SAME "+totalValueOrderSummary);

    }


        public void clickSearchBtnIn86List(String menu){
            WebElement search86ListBtn = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSearchField"));
             elementClick(search86ListBtn,"selected search Button");
             sendKeys(search86ListBtn,"");

        }

    @FindBy(xpath =  "//XCUIElementTypeStaticText[@name=\"86 LIST\"]")
    WebElement listBtn1;

    public void click86ListButtonInLoginScreen(){
//        elementClick(listBtn1,"Selected - "+listBtn1.getText());
        WebElement phoneOrdersBtn = (WebElement) driver.findElement(By.xpath(""));
        Assert.assertEquals(phoneOrdersBtn.getText(), "86 LIST");
        elementClick(phoneOrdersBtn, "Selected Btn As - " + phoneOrdersBtn.getText());
    }

    @FindBy(xpath = "Pancake")
    WebElement pancake;
    @FindBy(xpath = "Onion Rings")
    WebElement onionRings;
    @FindBy(xpath = "//div[.='Cash']")
    WebElement cash;
    @FindBy(xpath = "//button[contains(.,'Exact')]")
    WebElement exact;
    @FindBy(xpath = "//button[contains(.,'Enter')]")
    WebElement enter;
    @FindBy(xpath = "Cancel")
    WebElement Cancel;
    public void createSAle() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        for(int i=391;i<=10000;i++){
            utils.log().info("Sale Count - "+i);
            WebElement checkNum=(WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"));
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
        WebElement cashRewardValue = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        String cashRewardValue1  = cashRewardValue.getText();
        TestUtils.cashRewardValue  = cashRewardValue1;
        utils.log().info("Cash Reward Value - " +cashRewardValue1);
    }

    public void verifyCashRewardWithChangeDueValue(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        WebElement changeDue = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String changeDueValue  = changeDue.getText();
        Assert.assertEquals(TestUtils.cashRewardValue,changeDueValue);
        utils.log().info("Cash Reward & Change Due Value is SAME - " +changeDueValue);
    }

    public void verifyCashPriceWithChangeDueValue(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        WebElement changeDue = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String changeDueValue  = changeDue.getText();
        double total = Double.parseDouble(TestUtils.totalTxt.replaceAll("[$, ]",""));
        double cashPrice = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[$, ]",""));
        double changeDueee = total - cashPrice;
        DecimalFormat dc = new DecimalFormat("0.00");
        Assert.assertEquals(dc.format(changeDueee),changeDueValue.replaceAll("[$, ]",""));
        utils.log().info("Cash Reward & Change Due Value is SAME - " +changeDueValue);
    }

    public void verifyCashPriceWithChangeDueValueWhileGratuityApplying(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        WebElement changeDue = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String changeDueValue  = changeDue.getText();
        double total = Double.parseDouble(TestUtils.totalTxt.replaceAll("[$, ]",""));
        double cashPrice = Double.parseDouble(TestUtils.cashOptionOrderScreen.replaceAll("[$, ]",""));
        double changeDueee = total - cashPrice;
        DecimalFormat dc = new DecimalFormat("0.00");
        Assert.assertEquals(dc.format(changeDueee),changeDueValue.replaceAll("[$, ]",""));
        utils.log().info("Cash Reward & Change Due Value is SAME - " +changeDueValue);
    }
}



