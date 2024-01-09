package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class TGSplitCheckPage extends BasePage{

    String accessibilityIdForPin1 = "1";
    String accessibilityIdForPin2 = "2";
    String accessibilityIdForPin3 = "3";
    String accessibilityIdForPin4 = "4";
    String btnLoginXPath = "//XCUIElementTypeButton[@name=\"Login\"]";

    public By newTabButton = By.id("New Tab");

    public By yesOptionForRemoveDiscount = By.id("Yes");



    public void verifyMergeSeats(){
        WebElement element=mergeAndFindMobileElement(subtotalForSeatOneAfterMerge);
        String actualName =  elementGetText(element,"Get Subtotal For Seat One After Merge");
        String expectedName = "TL 2.000,00";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1=mergeAndFindMobileElement(subtotalForSeatTwoAfterMerge);

        String actualName1 =  elementGetText(element,"Get Subtotal For Seat Two After Merge");
        String expectedName1 = "TL 0,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void selectSeatsWhichAreMerge(){
//        WebElement element=mergeAndFindMobileElement(seatOneForGroupSeat);
//        elementClick(element,"Click Seat One For Group Seat");
//        WebElement element1=mergeAndFindMobileElement(seatTwoForGroupSeat);
//        elementClick(element1,"Click Seat Two For Group Seat");
//    }
    public void selectSeatsWhichAreMerge(){
        WebElement element=mergeAndFindMobileElement(seatOneForGroupSeat1);
        elementClick(element,"Click Seat One For Group Seat");
        WebElement element1=mergeAndFindMobileElement(seatTwoForGroupSeat);
        elementClick(element1,"Click Seat Two For Group Seat");
    }

    public void verifyTotalPriceOfSplitedSeat(){
        WebElement element=mergeAndFindMobileElement(subtotalForSeatOne);
        String actualName =  elementGetText(element,"Get subtotal For Seat One");
        String expectedName = "TL 1.000,00";

        Assert.assertEquals(actualName,expectedName);
//        WebElement element1=mergeAndFindMobileElement(subtotalForSeatTwo);
//        String actualName1 =  elementGetText(element1,"Get subtotal For Seat Two");
//        String expectedName1 = "TL 1.000,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifySeparatedItems(){
        WebElement element1=mergeAndFindMobileElement(separatedHamburgerPrice);
        String actualName =  elementGetText(element1,"Get Separated Hamburger Price");
        String expectedName = "750,00";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickSeperateItemButton(){
        WebElement element=mergeAndFindMobileElement(separateItemButton);
        elementClick(element,"Click Seperate Item Button");
    }
    public void selectFirstItemToSplit(){
        WebElement element=mergeAndFindMobileElement(selectFirstItemToSplit);
        elementClick(element,"Select First Item To Split");
    }
    public void clickSaveAndCloseButtonOnSplitCheckPage(){
        WebElement element=mergeAndFindMobileElement(saveAndCloseButton);
        elementClick(element,"Select Save And Close Button");
    }

    public void verifyFirstOrderPlacedToSecondSeat(){
        WebElement element=mergeAndFindMobileElement(hamburgerPrice);
        elementGetText(element,"Get hamburger Price");
        String actualName =elementGetText(element,"Get hamburger Price");
        String expectedName = "1.500,00";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1=mergeAndFindMobileElement(subTotalForSplitedSeat);
        String actualName1 =  elementGetText(element,"Get subTotal For Splited Seat");
        String expectedName1 = "TL 1.500,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void clickSecondSeat(){
        WebElement element=mergeAndFindMobileElement(seatForSplit);
        elementClick(element,"Select Seat For Split Button");
    }
    public void selectFirstSeatFirstOrder(){
        WebElement element=mergeAndFindMobileElement(firstOrderForSplit);
        elementClick(element,"Select First Order For Split Button");
    }
    public void clickAddButtonForSplit(){
        WebElement element=mergeAndFindMobileElement(addButtonForSplit);
        elementClick(element,"Select Add Button For Split Button");
    }

    public void verifySplitedChecksOnSplitCheckPage(){
        WebElement element=mergeAndFindMobileElement(splitedOrderForFirstCheck);
        String actualName = elementGetText(element,"Get Splited Order For First Check");
        String expectedName = "SANDWICHES ";
//        WebElement element1=mergeAndFindMobileElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"30,00\"])[3]"));

        Assert.assertEquals(actualName,expectedName);
//        element.equals(element1);
        WebElement element2=mergeAndFindMobileElement(splitedOrderForSecondCheck);

        String actualName1 =  elementGetText(element2,"Get Splited Order For Second Check");
        String expectedName1 = "SANDWICHES ";
//        WebElement element3=mergeAndFindMobileElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"30,00\"])[4]"));

        Assert.assertEquals(actualName1,expectedName1);
//        element2.equals(element3);

    }
    public void verifySplitItemsForSplitedOrder(){
        WebElement element=mergeAndFindMobileElement(splitedOrderItem);
        String actualName =  elementGetText(element,"Get Splited Order Item");
        String expectedName = "SANDWICHES";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1=mergeAndFindMobileElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[4]"));
        element.equals(element1);
        WebElement element2=mergeAndFindMobileElement(splitedOrderPrice);
        String actualName1 =  elementGetText(element2,"Get Splited Order Price");
        String expectedName1 = "15,00";

        Assert.assertEquals(actualName1,expectedName1);

    }
    public void enterNumberOfPiecesForSplitItem(){
        WebElement element= mergeAndFindMobileElement(numberTwo);
        WebElement element1= mergeAndFindMobileElement(continueButton);
        elementClick(element,"Click Number Two");
        elementClick(element1,"Click Continue Button");
    }
    public void selectOrderForSplitItem(){
        WebElement element= mergeAndFindMobileElement(orderWillBeSplited);
        elementClick(element,"Click Order Will Be Splited");
    }
    public void clickGroupSeatOption(){
        WebElement element= mergeAndFindMobileElement(groupBySeatButton);
        elementClick(element,"Click Group By Seat Button");
    }

    public void verifyLastSeatIsEmpty(){
        WebElement element= mergeAndFindMobileElement(seatTwoOnSplitSeatPage);
        String actualName =  elementGetText(element,"Get Seat Two On Split Seat Page");
        String expectedName = "Seat 2";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1= mergeAndFindMobileElement(By.xpath("(//XCUIElementTypeTable[@name=\"Empty list\"])[13]"));
        element.equals(element1);

    }

    public void selectSeatsForGroupSeat(){
        WebElement element= mergeAndFindMobileElement(seatOneOnSplitSeatPage);
        elementClick(element,"Click Seat One On Split Seat Page");
        WebElement element1= mergeAndFindMobileElement(seatTwoOnSplitSeatPage);
        elementClick(element1,"Click Seat Two On Split Seat Page");

    }
    public void clickSaveAndCloseButton(){
        WebElement element= mergeAndFindMobileElement(saveAndCloseButton);
        elementClick(element,"Click Save And Close Button");
    }

    public void selectSplitCheckOption(){
        WebElement element= mergeAndFindMobileElement(splitCheckOption);
        elementClick(element,"Click Split Check Option");
    }

    public void selectFirstCheckItem(){
        WebElement element= mergeAndFindMobileElement(selectItemInCheck);
        elementClick(element,"Click Select Item In Check");
    }
    public void clickAddSeatForSplit(){
        WebElement element= mergeAndFindMobileElement(addNewSeatForSplit);
        elementClick(element,"Click Add New Seat For Split");
    }
    public void clickSplitEvenlyButton(){
        WebElement element= mergeAndFindMobileElement(splitEvenly);
        elementClick(element,"Click Split Evenly");
    }
    public void verifySplitEvenlyAmount(){
        WebElement element= mergeAndFindMobileElement(separatedFirstItemAmount);
        WebElement element1= mergeAndFindMobileElement(separatedSecondItemAmount);
        String actualName = elementGetText(element,"Click Separated First Item Amount");
        String expectedName = elementGetText(element1,"Click Separated Second Item Amount");
        Assert.assertEquals(expectedName,actualName);
    }
    public void clickSeparateItem(){
        WebElement element=mergeAndFindMobileElement(separateItemButton);
        elementClick(element,"Click Separate Item Button");
    }
    public void selectFirstOrderItem(){
        WebElement element=mergeAndFindMobileElement(firstOrderItem);
        elementClick(element,"Click First Order Item");
    }

    public void clickAddedSeat(){
        WebElement element=mergeAndFindMobileElement(emptySeat);
        elementClick(element,"Click Empty Seat");
    }
    public void verifySeparatedItem(){
        WebElement element=mergeAndFindMobileElement(separatedFirstItemAmount);
        WebElement element1=mergeAndFindMobileElement(separatedSecondItemAmount);
        String actualName = elementGetText(element,"Get Separated First Item Amount");
        String expectedName = elementGetText(element1,"Get Separated Second Item Amount");
        Assert.assertEquals(expectedName,actualName);
    }

//    public void verifySplitCheckTitle(){
//        WebElement element=mergeAndFindMobileElement(firstOrderItem);
//        WebElement element1=mergeAndFindMobileElement(firstSplitedItem);
//        String actualName = elementGetText(element,"Click First Order Item");
//        String expectedName =  elementGetText(element1,"Click First Splited Item");
//        Assert.assertEquals(expectedName,actualName);
//    }

    public void verifySplitCheckTitle(){
            /*WebElement element=mergeAndFindMobileElement(firstOrderItem);
            WebElement element1=mergeAndFindMobileElement(firstSplitedItem);
            String actualName = elementGetText(element,"Click First Order Item");
            String expectedName =  elementGetText(element1,"Click First Splited Item");
            Assert.assertEquals(expectedName,actualName);*/

        //edit method
        WebElement element=mergeAndFindMobileElement(splitCheckPageTitle);
        String actualName = elementGetText(element,"Split Check");
        String expectedName = "Split Check";
        Assert.assertEquals(expectedName,actualName);
    }
    public void selectFirstItemOnFirstSeat(){
        WebElement element=mergeAndFindMobileElement(firstItemOnFirstSeat);
        elementClick(element,"Click First Item On First Seat");
    }
    public void separateItemNumber(){
        WebElement element=mergeAndFindMobileElement(separateItemNumber);
        WebElement element1=mergeAndFindMobileElement(separateContinueButton);
        elementClick(element,"Click Separate Item Number");
        elementClick(element1,"Click Separate Continue Button");
    }
    public void closeOrderPopup(){
        WebElement element=mergeAndFindMobileElement(selectOrderWarning);
        String actualName = elementGetText(element,"Click First Seat Title");
        String expectedName = "Select the Order to Proceed";
        Assert.assertEquals(expectedName,actualName);
        WebElement element1=mergeAndFindMobileElement(selectOrderWarningDoneButton);
        elementClick(element1,"Click First Seat Title");
    }
    public void selectFirstSeat(){
        WebElement element=mergeAndFindMobileElement(firstSeatTitle1);
        elementClick(element,"Click First Seat Title");
    }
    //    public void selectFirstSeat(){
//        WebElement element=mergeAndFindMobileElement(firstSeatTitle);
//        elementClick(element,"Click First Seat Title");
//    }
    public void clickPayButtonOnSplitSeatPage(){
        WebElement element=mergeAndFindMobileElement(payButtonOnSplitSeat);
        elementClick(element,"Click Pay Button On Split Seat");

    }
    public void clickGroupSeatButton(){
        WebElement element=mergeAndFindMobileElement(groupSeatButton);
        elementClick(element,"Click Group Seat Button");
    }
    public void selectSeatsForMerge(){
        WebElement element=mergeAndFindMobileElement(firstSeatTitle);
        elementClick(element,"Get First Seat Title");
//        elementClick(element,"Get First Seat Title");

        WebElement element1=mergeAndFindMobileElement(secondSeatTitle);
        elementClick(element1,"Get Second Seat Title");
    }

    //nov 25
    public void verifyMergedGroupSeat(){
        WebElement element=mergeAndFindMobileElement(firstSeatTotalAmountTitle);
        String actualName =elementGetText(element,"msg");
        String expectedName = "Total";

        Assert.assertEquals(actualName,expectedName);

//        WebElement element1=mergeAndFindMobileElement(firstSeatTotalAmount);
//        elementClick(element1,"Get Second Seat Title");

//        WebElement element1=mergeAndFindMobileElement(firstSeatTotalAmountTitle1);
//        elementClick(element1,"Get Second Seat Title");

//
//        String actualName = driver.findElement(firstSeatTotalAmountTitle).getText();
//        String expectedName = driver.findElement(firstSeatTotalAmount).getText();

//        element.equals(element1);
//        WebElement element2=mergeAndFindMobileElement(secondSeatTotalAmountTitle2);
//        elementClick(element2,"Get Second Seat Title");
        WebElement element3=mergeAndFindMobileElement(seatTwoTotal);
        String actualName1=elementGetText(element3,"msg");
        String expectedName1 = "TL 2.200,00";
        Assert.assertEquals(actualName1,expectedName1);
//        driver.findElement(secondSeatTotalAmountTitle).getText();
//        driver.findElement(secondSeatTotalAmount).getText();

//        element2.equals(element3);

    }
    public void verifyWarningPopup(){
        WebElement element=mergeAndFindMobileElement(mergeSeatWarningPopup);
        String actualName = elementGetText(element,"Get Merge Seat Warning Popup");
        String expectedName = "Select the seats to Merge";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectSeatPayable(){
        WebElement element=mergeAndFindMobileElement(firstSeatTitle);
        elementClick(element,"Click First Seat Title");
    }
    public void verifyDisableSplitButton(){
        WebElement element=mergeAndFindMobileElement(splitButton);
        Assert.assertFalse(element.isEnabled());
    }
    public void selectOrderForSplitItem1(){
        WebElement element= mergeAndFindMobileElement(orderWillBeSplited1);
        elementClick(element,"Click Order Will Be Splited");
    }


    public void selectTable(){
        WebElement element = mergeAndFindMobileElement(selectTable2);
        elementClick(element,"click table");
    }

    public void clickSplitBySeatInTablelayout(){
//        nov 19
        WebElement element = mergeAndFindMobileElement(splitBySeatButtonOnTableLayout);
        elementClick(element, "click splitBySeatButtonOnTableLayout");
    }

    public void selectSplitBySeatOption1(){
        WebElement element = mergeAndFindMobileElement(splitBySeatOption);
        elementClick(element,"Click Split By Seat Option");
    }

    public void selectMenuItemFromCheck(){
        WebElement element = mergeAndFindMobileElement(checkFirstItem);
        elementClick(element,"Select MenuItem From Check");
    }

//    public void addItemToNewCheck(){
//        WebElement element = mergeAndFindMobileElement(emtyCheck);
//        elementClick(element,"Add Item To New Check");
//    }

    public void saveAndCloseSplitedCheck(){
        WebElement element = driver.findElement(By.xpath("//button[contains(.,'Save & Close')]"));
        elementClick(element,"Save Splited Check");
    }

    public void selectSaveButton() throws InterruptedException {
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//button[contains(.,'Save')]"));
        elementClick(element,"Save button selected");
    }

    public void addItemToNewCheck(){
        WebElement element = mergeAndFindMobileElement(emtyCheck);
        elementClick(element,"Add Item To New Check");
    }

    public void selectSplitCheckItem(){
        WebElement element=mergeAndFindMobileElement(splitedOrderForFirstCheck);
        elementClick(element, "click Sandwiches");
    }

    public void commonAccessibilityId(String id,String msg){
//        WebElement element = mergeAndFindElement(id, "", TestUtils.Accessibility);
//        elementClick(element,msg);
        findandclick(id, "", TestUtils.Accessibility);
    }
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"6\"])[1]")
    WebElement pin6Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"5\"])[1]")
    WebElement pin5Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"4\"])[1]")
    WebElement pin4Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"3\"])[1]")
    WebElement pin3Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"2\"])[1]")
    WebElement pin2Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"1\"])[1]")
    WebElement pin1Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"7\"])[1]")
    WebElement pin7Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"8\"])[1]")
    WebElement pin8Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"9\"])[1]")
    WebElement pin9Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"0\"])[1]")
    WebElement pin0Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Clear\"])[1]")
    WebElement pinClrTime1;
    public void pressPin4Time() {
        elementClick(pin4Time1, "Tapped pin 4");
    }
    public void pressPin3Time() {
        elementClick(pin3Time1, "Tapped pin 3");
    }

    public void pressPin2Time() {
        elementClick(pin2Time1, "Tapped pin 2");
    }
    public void pressPin1Time() {
        elementClick(pin1Time1, "Tapped pin 1");
    }
    public void pressLogin(){
        elementClick(loginBtn, "Tapped Login.");

    }
    @FindBy(name = "Login")
    private WebElement loginBtn;
    public void logInWithValidPin() {

        pressPin1Time();
        pressPin2Time();
        pressPin3Time();
        pressPin4Time();
        pressLogin();
    }

    public void clickQsrOrderType(){
        WebElement element = driver.findElement(By.xpath("//button[@id='os_menu']"));
        elementClick(element,"Click qsrOption");
    }

    public void selectDineInOrderType(){
        WebElement element = driver.findElement(By.xpath("//span[contains(.,'DINE IN')]"));
        elementClick(element,"Select DineIn OrderType");
    }

    public void selectDeliveryOrderType(){
        WebElement element = driver.findElement(By.xpath("//span[contains(.,'DELIVERY')]"));
        elementClick(element,"Select Delivery OrderType");
    }

    public void selectSixthTable(){
        WebElement element = mergeAndFindMobileElement(tableNoSix);
        elementClick(element, "click tableNoSix");
        findandclickM(yesOptionForRemoveDiscount);
    }

    public void clickAddSeatButton(){
        WebElement element = mergeAndFindMobileElement(addSeat);
        elementClick(element,"Click Add Seat Button");
    }

    public void selectMenuItemAndOrder(){
        WebElement element = mergeAndFindMobileElement(foodTab);
        elementClick(element,"Select MenuItem And Order");

        WebElement element1 = mergeAndFindMobileElement(firstMenuItem);
        elementClick(element1,"Select MenuItem And Order");

        WebElement element2 = mergeAndFindMobileElement(orderButton);
        elementClick(element2,"Click Order");
    }

    public void selectFirstSeatInSplitScreen(){
        WebElement element = mergeAndFindMobileElement(firstSeatOnMenuItem);
        elementClick(element,"Select First Seat");
    }

    public void clickFinishButton(){
        WebElement element = driver.findElement(By.xpath("//button[contains(.,'Finish')]"));
        elementClick(element,"Click Finish Button");
    }

    public void clickSplitButton(){
        WebElement element = mergeAndFindMobileElement(tableLayout);
        element.isDisplayed();

        WebElement element1 = mergeAndFindMobileElement(splitButton);
        elementClick(element1, "click splitButton");
    }

    public void clickSplitCheckOption(){
        WebElement element = mergeAndFindMobileElement(splitCheckOption);
        elementClick(element, "click splitCheckOption");
    }

    public void clickSplitBySeatOption(){
//        nov 19
        WebElement element = mergeAndFindMobileElement(splitBySeatOption);
        elementClick(element, "click splitBySeatButtonOnTableLayout");
    }

    public void commonBtnClick(String btnName, String msg){
        WebElement element = mergeAndFindElement(btnName, "",TestUtils.Accessibility);
        elementClick(element, msg);
//        findandclick(btnName, "",TestUtils.Accessibility);
    }

    public void selectLastActiveCheckForDineIn(){
//        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView");
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeStaticText[@name=\"Walkin\"]");
        phoneOrders.get(phoneOrders.size() - 1).click();
        findandclickM(yesOptionForRemoveDiscount);

//        List<WebElement> activeOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView"));
//
//        for (int index = 0; index < activeOrders.size(); index++) {
//
//            activeOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Walkin\"])[1]"));
//
//            activeOrders.get(activeOrders.size() - 1).click();
//        }
    }

    public void clickCashButton(){
        WebElement element = mergeAndFindMobileElement(cashButtonOnMenuItem);
        elementClick(element,"Click Cash Button");
    }

    public void clickExactButtonOnCashTab(){

        WebElement element=mergeAndFindMobileElement(exactButton);
        elementClick(element,"Exact Button Clicked");
    }
    public void clickEnterButtonOnCashButton(){
        WebElement element1=mergeAndFindMobileElement(enterButton);
        elementClick(element1,"Enter Button Clicked");
    }

    public void ClickBtnOk(String btnOk, String msg){
//        WebElement element = mergeAndFindElement(btnOk, "",TestUtils.Accessibility);
//        elementClick(element,msg);
        findandclick(btnOk, "",TestUtils.Accessibility);
    }

    public void clickSplitButtonOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(splitButtonOnMenuItem);
        elementClick(element,"Click Split Button On MenuItem Page");
    }

    public void clickSplitBySeatOptionOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(splitBySeatOptionOnMenuItemPage);
        elementClick(element,"Click SplitBySeat On MenuItem Page");
    }

    public void clickCashButtonInPayment(){
        WebElement element = mergeAndFindMobileElement(cashButton);
        elementClick(element, "click cashButton ");
    }

    public void clickSubmitButton(){
        WebElement element = mergeAndFindMobileElement(submitButton);
        elementClick(element, "click submitButton ");
    }

    public void clickPaymentButtonOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(paymentButtonOnMenuItemPage);
        elementClick(element,"Click Payment Button On MenuItem Page");
    }

    public void clickSplitButtonOnCalculator(){
        WebElement element = mergeAndFindMobileElement(splitButtonOnCalculator);
        elementClick(element, "click splitButtonOnCalculator ");
    }

    public void selectSplitType(){
        WebElement element = mergeAndFindMobileElement(splitType);
        elementClick(element, "click splitType ");
    }

    public void selectCashPaymentMethod(){
        WebElement element = mergeAndFindMobileElement(cashButtonOnPayment);
        elementClick(element, "click cashButtonOnPayment ");
    }

    public void verifyLastSplitPaidAmount(){
        WebElement element = mergeAndFindMobileElement(remainderSplitAmount);
        String actualName=elementGetText(element,"verify remainderSplitAmount");
        String expectedName = "600,00";

        actualName.equals(expectedName);
    }

    public void clickSplitCheckOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(splitCheckOptionButton);
        elementClick(element,"Click SplitCheck On MenuItem Page");
    }

    public void clickAllTab(){
        WebElement tabAll = mergeAndFindMobileElement(allOptions);
        elementClick(tabAll,"Click All Tab");
    }

    public void clickBarTabOnCheckStatusPage(){
        WebElement element=mergeAndFindMobileElement(barTabType);
        elementClick(element,"Click BarTab Type");
//        driver.findElement(barTabType).isDisplayed();
//        driver.findElement(barTabType).click();
    }

    public void clickNewTab(){
        WebElement tabNew = mergeAndFindMobileElement(newTabButton);
        elementClick(tabNew,"Click New Tab");
    }

    public void enterCustomerNameForBarTab(){
        WebElement element = mergeAndFindMobileElement(BarTabCustomerNameTitle);
        String actualName = elementGetText(element,"Verify Enter the Customer Name");
        String expectedName = "Enter the Customer Name";

        Assert.assertEquals(expectedName,actualName);
        WebElement searchCustomer = mergeAndFindMobileElement(customerSearchTextBoxForBarTab);
//        searchCustomer.sendKeys("Test Automation");
        searchCustomer.equals("Test Automation");
        WebElement btnOK = mergeAndFindMobileElement(customerNameOkButton);
        elementClick(btnOK,"Click dineIn");
    }

    public void clickPizzaCategoryTab(){
        WebElement element = mergeAndFindMobileElement(pizzaTab);
        elementClick(element,"Click Pizza Category Tab");
    }

    public void selectPizzaMelMenuItemOnPizzaCategory(){
        WebElement element = mergeAndFindMobileElement(pizzaMel);
        elementClick(element,"Click pizzaMel");
        WebElement btnDone = mergeAndFindMobileElement(doneButton);
        elementClick(btnDone,"Click Done");
    }

    public void clickOrderButton(){
        WebElement element1 = mergeAndFindMobileElement(orderButton);
        elementClick(element1,"Click Order Button");
    }

    public void selectMargaritaMenuItemOnPizzaCategory(){
        WebElement element = mergeAndFindMobileElement(margarita);
        elementClick(element,"Click margarita");
        WebElement btnDone = mergeAndFindMobileElement(doneButton);
        elementClick(btnDone,"Click Done");
    }

    public void verifyTotalPriceOfMargaritaMenuItem(){
        WebElement element = mergeAndFindMobileElement(totalText);
        String actualName = elementGetText(element,"Verify Total Text");
        String expectedName = "Total";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(pizzaMargaritaTotalPrice1);
        String actualName1 = elementGetText(element1,"Verify Total Price Value");
        String expectedName1 = "TL 2.999,70";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void clickFoodTab(){
        WebElement element = mergeAndFindMobileElement(foodTab);
        elementClick(element,"Click FoodTab");
    }

    public void selectHamburgerMenuItem(){
        WebElement element = mergeAndFindMobileElement(hamburgerMenuItem);
        elementClick(element,"Select Hamburger MenuItem");
    }

    public void selectSecondSeat(){
        WebElement element = mergeAndFindMobileElement(secondSeatOnMenuItem);
        elementClick(element,"Select Second Seat");
    }

    public void clickPlusButtonForAddSeat(){
        WebElement element = mergeAndFindMobileElement(plusIconForAddSeat);
        elementClick(element,"click Plus Button For Add Seat");
    }


}

