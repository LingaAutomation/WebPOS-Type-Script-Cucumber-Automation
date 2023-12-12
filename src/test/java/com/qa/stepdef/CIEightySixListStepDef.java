package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CIEightySixListStepDef {

    public WebDriver driver = TestUtils.driver;

    CIWaitListPage waitList=new CIWaitListPage();
    CIPaymentScreen ciPaymentScreen = new CIPaymentScreen();
    CIEightySixListScreen ciEightySixListScreen=new CIEightySixListScreen();
    CICloseDayScreen ciCloseDayScreen=new CICloseDayScreen();
    TestUtils utils = new TestUtils();


    @Given("^I click on the \"([^\"]*)\" in the top of the pos login screen \"([^\"]*)\"$")
    public void iClickOnTheInTheTopOfThePosLoginScreen(String btnEightySix, String msg) {
        waitList.commonBtn(btnEightySix,msg);
    }

    @Then("^I should verify the \"([^\"]*)\" in the eighty six list popup \"([^\"]*)\"$")
    public void iShouldVerifyTheInTheEightySixListPopup(String txtEightySixPopup, String msg) {
        String text = waitList.getTxtPopup(txtEightySixPopup,msg);
        Assert.assertEquals(txtEightySixPopup,text);
    }

    @Then("^I should verify the \"([^\"]*)\" in the operation screen \"([^\"]*)\"$")
    public void iShouldVerifyTheInTheOperationScreen(String txtEightySixPopup, String msg) {
        String text = waitList.getTxtPopup(txtEightySixPopup,msg);
        Assert.assertEquals(txtEightySixPopup,text);
    }

    @And("^I click the \"([^\"]*)\" in the operation Screen \"([^\"]*)\"$")
    public void iClickTheInTheOperationScreen(String btnEightySix, String msg) {
        ciPaymentScreen.commonBtnClickOption(btnEightySix,msg);
    }

    @And("^I click on the search field \"([^\"]*)\" for searching the menu item \"([^\"]*)\"$")
    public void iClickOnTheSearchFieldForSearchingTheMenuItem(String name, String msg) {
        ciEightySixListScreen.itemSearchField(name,msg);
    }

    @Then("^I should verify the \"([^\"]*)\" in the search list \"([^\"]*)\"$")
    public void iShouldVerifyTheInTheSearchList(String txtChickenBiriyani, String msg) {
        String text = waitList.getTxtPopup(txtChickenBiriyani,msg);
        Assert.assertEquals(txtChickenBiriyani,text);
    }

    @And("^I click the first item quantity text field in the eighty six list \"([^\"]*)\"$")
    public void iClickTheFirstItemQuantityTextFieldInTheEightySixList(String msg) {
        ciEightySixListScreen.clickQuantityTextField1(msg);
    }

    @And("^I click the second item quantity text field in the eighty six list \"([^\"]*)\"$")
    public void iClickTheSecondItemQuantityTextFieldInTheEightySixList(String msg) {
        ciEightySixListScreen.clickQuantityTextField2(msg);
    }

    @Then("^I verify the quantity value for first item in login screen as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyTheQuantityValueForFirstItemInLoginScreenAs(String quantity, String msg) {
        String value=ciEightySixListScreen.getQuantityTextField1(msg);
        Assert.assertEquals(quantity,value);
    }

    @And("^I verify the quantity value for second item in login screen as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyTheQuantityValueForSecondItemInLoginScreenAs(String quantity, String msg) {
        String value=ciEightySixListScreen.getQuantityTextField2(msg);
        Assert.assertEquals(quantity,value);
    }

    @And("^I click the \"([^\"]*)\" button \"([^\"]*)\"$")
    public void iClickTheToggleIconButton(String btnToggle,String msg) {
        waitList.commonBtn(btnToggle,msg);
    }

    @And("^I click the \"([^\"]*)\" button for navigating to the pos screen \"([^\"]*)\"$")
    public void iClickThePosButtonForNavigatingToThePosScreen(String btnPos,String msg) {
        ciCloseDayScreen.commonAccessibilityId(btnPos,msg);
    }

    @When("^I click the \"([^\"]*)\" in the order screen \"([^\"]*)\"$")
    public void iClickTheInTheOrderScreen(String btnSetting, String msg) {
        waitList.commonBtn(btnSetting,msg);
    }

    @Then("^I should verify the searched text in eighty six list is refresh or not \"([^\"]*)\"$")
    public void iShouldVerifyTheSearchedTextInEightySixListIsRefreshOrNot(String msg) {
        String text = ciEightySixListScreen.emptySearchField(msg);
        Assert.assertEquals(text,null);
    }

    @And("^I click the menu item qty for editing in the eighty six list popup \"([^\"]*)\"$")
    public void iClickTheMenuItemQtyForEditingInTheEightySixListPopup(String msg) {
        ciEightySixListScreen.clickMenuItemQty(msg);
    }

    @Then("^I should verify that quantity is displayed \"([^\"]*)\"$")
    public void iShouldVerifyThatQuantityIsDisplayed(String msg){
        boolean value= ciEightySixListScreen.verifyQuantity();
        utils.log().info(msg+" is "+value);
        Assert.assertTrue(value);

    }

    @And("^I should verify the close button \"([^\"]*)\" in the eighty six list popup in the login screen \"([^\"]*)\"$")
    public void iShouldVerifyTheInTheListPopupInTheLoginScreen(String txtClose, String msg) {
        String text = ciEightySixListScreen.getBtnClose(txtClose,msg);
        Assert.assertEquals(txtClose,text);
    }

    @And("^I click \"([^\"]*)\" in the eighty six list popup \"([^\"]*)\"$")
    public void iClickInTheEightySixListPopup(String btnClose, String msg) {
        waitList.commonBtn(btnClose,msg);
    }

    @And("^I enter the quantity value as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterTheQuantityValueAs(String pin1, String pin2, String pin3, String pin4) {
        ciPaymentScreen.pressPercentagePin(pin1, pin2, pin3, pin4);
    }

    @Then("^I click \"([^\"]*)\" in the Quantity popup \"([^\"]*)\"$")
    public void iClickInTheQuantityPopup(String btnContinue, String msg) {
        ciPaymentScreen.commonBtnClick(btnContinue,msg);
    }

    @And("^I click the quantity txt field in the eighty six list popup \"([^\"]*)\"$")
    public void iClickTheQuantityTxtFieldInTheListPopup(String msg) {
        ciEightySixListScreen.clickQtyTxtField(msg);
    }

    @Then("^I should verify the the available quantity \"([^\"]*)\" is displayed in the order screen \"([^\"]*)\"$")
    public void iShouldVerifyTheTheAvailableQuantityIsDisplayedInTheOrderScreen(String Qty,String msg) {
        String text = ciEightySixListScreen.getQty(Qty,msg);
        Assert.assertEquals(Qty,text);
    }

    @Then("^I should verify the the quantity \"([^\"]*)\" is displayed in the order screen is decreased after order \"([^\"]*)\"$")
    public void iShouldVerifyTheTheQuantityIsDisplayedInTheOrderScreenIsDecresedAfterOrder(String Qty, String msg) {
        String text = ciEightySixListScreen.getQty(Qty,msg);
        Assert.assertEquals(Qty,text);
    }

    @Then ("^I should verify the quantity \"([^\"]*)\" is displayed in the order screen is decreased after order with menu as \"([^\"]*)\"$")
    public void iShouldVerifyTheQuantityIsDisplayedInTheOrderScreenIsDecreasedAfterOrderWithMenuAs(String qty, String menu){
        new CIEightySixListScreen().getQtyOf86ListMenu(qty,menu);
    }

    @Then("^I verify the quantity value as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyTheQuantityValueAs(String quantity, String msg) {
        String value=ciEightySixListScreen.getQuantityTextField(msg);
        Assert.assertEquals(quantity,value);
    }

    @Then("^I verify the quantity value in login screen as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyTheQuantityValueInLoginScreenAs(String quantity, String msg) {
        String value=ciEightySixListScreen.getQuantityTextField(msg);
        Assert.assertEquals(quantity,value);
    }

    @Then("^I should verify the the quantity \"([^\"]*)\" is displayed in the order screen reverted after void \"([^\"]*)\"$")
    public void iShouldVerifyTheTheQuantityIsDisplayedInTheOrderScreenRevertedAfterVoid(String Qty, String msg) {
        String text = ciEightySixListScreen.getQty(Qty,msg);
        Assert.assertEquals(Qty,text);
    }

    @And("^I click \"([^\"]*)\" in the Option Screen \"([^\"]*)\"$")
    public void iClickInTheOptionScreen(String btnKitchen, String msg) {
        ciPaymentScreen.commonBtnClickOption(btnKitchen,msg);
    }

    @Then("^I should verify the the quantity \"([^\"]*)\" remains same when reopen and submit it \"([^\"]*)\"$")
    public void iShouldVerifyTheTheQuantityRemainsSameWhenReopenAndSubmitIt(String Qty, String msg) {
        String text = ciEightySixListScreen.getQty(Qty,msg);
        Assert.assertEquals(Qty,text);
    }

    @And("^I click log off \"([^\"]*)\" button in order screen \"([^\"]*)\"$")
    public void iClickLogOffButtonInOrderScreen(String btnLogOff, String msg) {
        ciCloseDayScreen.commonAccessibilityId(btnLogOff,msg);
    }

//    //new nov 17
//    @And("^I click the \"([^\"]*)\" in order screen$")
//    public void iClickTheInOrderScreen(String btnLogOff) {
//        ciCloseDayScreen.VerifycommonBtnLogoff(btnLogOff);
//    }

    @And("^I should verify the the applied quantity \"([^\"]*)\" reduces in login screen eighty six list after order \"([^\"]*)\"$")
    public void iShouldVerifyTheTheAppliedQuantityReducesInLoginScreenListAfterOrder(String txtQty, String msg) {
        String text = ciEightySixListScreen.getQuantityTextField(msg);
        Assert.assertEquals(txtQty,text);
    }

    @Then("^I should verify the the quantity \"([^\"]*)\" is decreased after order and changing the service type \"([^\"]*)\"$")
    public void iShouldVerifyTheTheQuantityIsDecreasedAfterOrderAndChangingTheServiceType(String txtQty, String msg) {
        String text = waitList.getTxtPopup(txtQty,msg);
        Assert.assertEquals(txtQty,text);
    }

    @When("^I click \"([^\"]*)\" in the QSR order screen \"([^\"]*)\"$")
    public void iClickInTheQSROrderScreen(String btnQsr, String msg) {
        ciEightySixListScreen.clickQsrBtn(btnQsr,msg);
    }

    @And("^I click \"([^\"]*)\" in the all tab screen \"([^\"]*)\"$")
    public void iClickInTheAllTabScreen(String btnQsr, String msg) {
        waitList.commonBtn(btnQsr,msg);
    }

    @Then("I should verify the the quantity \"([^\"]*)\" is displayed not depends on the serving size of an item \"([^\"]*)\"$")
    public void iShouldVerifyTheTheQuantityIsDisplayedNotDependsOnTheServingSizeOfAnItem(String Qty, String msg) throws InterruptedException {
        String text = ciCloseDayScreen.commonGetText(Qty,msg);
        Assert.assertEquals(Qty,text);
    }

    @Then("I should verify the the quantity \"([^\"]*)\" is displayed in the order screen is decreased after order\"([^\"]*)\"$")
    public void iShouldVerifyTheTheQuantityIsDisplayedInTheOrderScreenIsDecreasedAfterOrder(String Qty, String msg) throws InterruptedException {
        String text = ciCloseDayScreen.commonGetText(Qty,msg);
        Assert.assertEquals(Qty,text);
    }

    @Then("^I should verify the the quantity \"([^\"]*)\" is displayed in the order screen is decreased after order placed \"([^\"]*)\"$")
    public void iShouldVerifyTheTheQuantityIsDisplayedInTheOrderScreenIsDecreasedAfterOrderPlaced(String Qty, String msg) {
        String text = ciEightySixListScreen.getQty1(Qty,msg);
        Assert.assertEquals(Qty,text);
    }



    @When("^I click on the \"([^\"]*)\" in the operation screen \"([^\"]*)\"$")
    public void iClickOnTheInTheOperationScreen(String eightySixList, String msg) {
        ciPaymentScreen.commonBtnClickOption(eightySixList,msg);
    }

    @When("^I click on the enable lite mode switch \"([^\"]*)\"$")
    public void iClickOnTheEnableLiteModeSwitch(String msg) {
        ciEightySixListScreen.clickEnableLightMode(msg);
    }

    @When("^I select the \"([^\"]*)\" in the customer field \"([^\"]*)\"$")
    public void iSelectTheInTheCustomerField(String customerName, String msg) {
        ciPaymentScreen.btnClickTip(customerName,msg);
    }

    @And("^I click \"([^\"]*)\" in the customer field \"([^\"]*)\"$")
    public void iClickInTheCustomerField(String btnRepeat, String msg) {
        ciPaymentScreen.commonBtnClick(btnRepeat,msg);
    }

    @And("^I click the menu item ordered in the order screen \"([^\"]*)\"$")
    public void iClickTheMenuItemOrderedInTheOrderScreen(String msg) {
        ciEightySixListScreen.clickMenuItem(msg);
    }

    @When("^I click \"([^\"]*)\" in the option screen for repeat \"([^\"]*)\"$")
    public void iClickInTheOptionScreenForRepeat(String btnRepeat, String msg) {
        ciPaymentScreen.commonBtnClick(btnRepeat,msg);
    }

    @Then("^I should verify the \"([^\"]*)\" in the order screen in the category \"([^\"]*)\"$")
    public void iShouldVerifyTheInTheOrderScreenInTheCategory(String menuItem, String msg) {
        String value=ciPaymentScreen.commonGetText(menuItem,msg);
        Assert.assertEquals(menuItem,value);
    }

    @Then("^I should verify the \"([^\"]*)\" in the order screen of eighty six list \"([^\"]*)\"$")
    public void iShouldVerifyTheInTheOrderScreenOfEightySixList(String insufficientPopUp, String msg) {
        String value=ciEightySixListScreen.getInsufficientPopUp(insufficientPopUp,msg);
        Assert.assertEquals(insufficientPopUp,value);
    }

    @And("^I click \"([^\"]*)\" from the selected menu item quantity \"([^\"]*)\"$")
    public void iClickFromTheSelectedMenuItemQuantity(String btnValue,String msg) {
        ciPaymentScreen.commonBtnClick(btnValue,msg);
    }

    @Then("^I should verify the \"([^\"]*)\" is present not \"([^\"]*)\" in the order screen of added menu item in eighty six \"([^\"]*)\"$")
    public void iShouldVerifyTheInTheOrderScreenOfAddedMenuItemInEightySix(String btnValue,String btnValue2, String msg) {
        String value=ciEightySixListScreen.getMenuItemQuantity(btnValue,msg);
        Assert.assertNotEquals(btnValue2,value);
    }

    @And("^I click \"([^\"]*)\" in the order screen for closing order \"([^\"]*)\"$")
    public void iClickInTheOrderScreenForClosingOrder(String btnFinish, String msg) {
        ciPaymentScreen.commonBtnClickOption(btnFinish,msg);
    }

    @And("^I click \"([^\"]*)\" for future order \"([^\"]*)\"$")
    public void iClickForFutureOrder(String btnButton, String msg) {
        ciEightySixListScreen.clickLaterButton(btnButton,msg);
    }

    @And("^I click \"([^\"]*)\" for closing future order \"([^\"]*)\"$")
    public void iClickForClosingFutureOrder(String btnDone, String msg) {
        ciPaymentScreen.btnClickTip(btnDone,msg);
    }

    @Then("^I should verify the the quantity \"([^\"]*)\" is displayed in the order screen is decreased after order placed on item \"([^\"]*)\"$")
    public void iShouldVerifyTheTheQuantityIsDisplayedInTheOrderScreenIsDecreasedAfterOrderPlacedOnItem(String txtQty, String msg) {
        String value = ciEightySixListScreen.getQty2(txtQty,msg);
        Assert.assertEquals(txtQty,value);
    }

    @Then("^I should verify the the free item quantity \"([^\"]*)\" is displayed in the order screen reverted after void\"([^\"]*)\"$")
    public void iShouldVerifyTheTheFreeItemQuantityIsDisplayedInTheOrderScreenRevertedAfterVoid(String Qty, String msg) {
        String text = ciEightySixListScreen.getFreeItemQty(Qty,msg);
        Assert.assertEquals(Qty,text);
    }

    @Then("^I should verify the the free item quantity \"([^\"]*)\" is displayed in the order screen is decreased after order \"([^\"]*)\"$")
    public void iShouldVerifyTheTheFreeItemQuantityIsDisplayedInTheOrderScreenIsDecreasedAfterOrder(String Qty, String msg) {
        String text = ciEightySixListScreen.getFreeItemQty(Qty,msg);
        Assert.assertEquals(Qty,text);
    }

    @Then("^I verify the \"([^\"]*)\" in the Eighty six list \"([^\"]*)\"$")
    public void iVerifyTheInTheEightySixList(String menuItem, String msg) {
        String value=ciPaymentScreen.commonGetText(menuItem,msg);
        Assert.assertEquals(menuItem,value);
    }

    @Then("I should verify \"([^\"]*)\" Eighty six list disable menu item are not displayed in the login screen eighty six list \"([^\"]*)\"$")
    public void iShouldVerifyEightySixListDisableMenuItemAreNotDisplayedInTheLoginScreenEightySixList(String emptyList,String msg) {
        String text = ciEightySixListScreen.getEmptyList(emptyList,msg);
        Assert.assertEquals(emptyList,text);
    }

    @Then("^I should verify the empty list \"([^\"]*)\" in the login screen eighty six list \"([^\"]*)\"$")
    public void iShouldVerifyTheEmptyListInTheLoginScreenEightySixList(String emptyList, String msg) {
        String value=ciEightySixListScreen.getNoCountDownItem(emptyList,msg);
        Assert.assertEquals(emptyList,value);
    }

    @Then("^I should verify the \"([^\"]*)\" in the operation screen eighty six list \"([^\"]*)\"$")
    public void iShouldVerifyTheInTheOperationScreenEightySixList(String emptyList, String msg) {
        String value=ciEightySixListScreen.getNoCountDownItem(emptyList,msg);
        Assert.assertEquals(emptyList,value);
    }

    @Then("^I should verify the the quantity is displayed in order screen after placing future order \"([^\"]*)\"$")
    public void iShouldVerifyTheTheQuantityIsDisplayedInOrderScreenAfterPlacingFutureOrder(String msg) {
        boolean value=ciEightySixListScreen.verifyQuantityOrderScreen();
        utils.log().info(msg+" is "+value);
        Assert.assertTrue(value);
    }

    @Then("^I should verify the quantity tool tip is disappear in the order screen for Eighty six list disabled menu item \"([^\"]*)\"$")
    public void iShouldVerifyTheQuantityToolTipIsDisappearInTheOrderScreenForListDisabledMenuItem(String msg) {
        boolean text = ciEightySixListScreen.getDisappearQtyXpath();
        utils.log().info(msg +" is "+ text);
        Assert.assertTrue(text);
    }

    @Then("^I should verify the quantity button in login screen is enable or not \"([^\"]*)\"$")
    public void iShouldVerifyTheInTheEightySixListPopup(String msg) {
        boolean text = ciEightySixListScreen.getQtyBtn();
        utils.log().info(msg +" is "+ text);
        Assert.assertFalse(false);
    }

    @And("^I should verify the \"([^\"]*)\" after edit the quantity in operation screen \"([^\"]*)\"$")
    public void iShouldVerifyTheAfterEditTheQuantityInOperationScreen(String quantity,String msg) {
        String value=ciEightySixListScreen.getQuantityTextField(msg);
        Assert.assertEquals(quantity,value);
    }

    @Then("^i should verify the quantity displayed in the order screen in offline mode \"([^\"]*)\"$")
    public void iShouldVerifyTheQuantityDisplayedInTheOrderScreenInOfflineMode(String msg) {
        boolean value=ciEightySixListScreen.verifyQuantityOrderScreen();
        utils.log().info(msg+" is "+value);
        Assert.assertTrue(value);
    }

    @And("I click the \"([^\"]*)\" in the popup \"([^\"]*)\"$")
    public void iClickTheInThePopup(String btnClose, String msg) {
        waitList.commonBtn(btnClose,msg);
    }

    @And ("^I click 86List button in the login screen$")
    public void iClick86ListButtonInTheLoginScreen(){
        new OrderManagementScreen(driver).click86ListButtonInLoginScreen();
    }

    @Then ("^I should see quantity is not enough popup$")
    public void iShouldSeeQuantityIsNotEnoughPopup(){
        new OrderManagementScreen(driver).verifyQuantityIsNotEnoughPopup1();
    }

    @Then ("^I should verify 86 list menu as \"([^\"]*)\" with quantity as \"([^\"]*)\"$")
    public void iShouldVerify86ListMenuAsWithQuantityAs(String menu,String qty){
        new CIEightySixListScreen().verify86ListMenuQuantity(menu,qty);
    }
}

