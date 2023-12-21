package com.qa.stepdef;


import com.qa.pages.*;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class TableOrderOperationsStepDef {

    public WebDriver driver = TestUtils.driver;

    @And ("^I click right symbol$")
    public void iClickRightSymbol(){
        new TableLayOutScreen(driver).clickRightBtn();
    }
    @Then ("^I should see next floor$")
    public void iShouldSeeNextFloor(){
        Assert.assertEquals(new TableLayOutScreen(driver).verifyFloor2(),"Floor 2");
    }


    @And ("^I click Left symbol$")
    public void iClickLeftSymbol(){
        new TableLayOutScreen(driver).clickLeftBtn();
    }

    @Then ("^I should see previous floor$")
    public void iShouldSeePreviousFloor(){
        Assert.assertEquals(new TableLayOutScreen(driver).verifyFloor1(),"Floor 1");
    }

    @Then ("^I should see types of checks available on the Table layout screen$")
    public void iShouldSeeTypesOfChecksAvailableOnTheTableLayoutScreen(){
        new TableLayOutScreen(driver).verifyAllTypeChecks();
    }

    @And("^I closed the order type window$")
    public void iClosedTheOrderTypeWindow() throws InterruptedException {
        new OrderTypeWindow(driver).pressCancelBtn();
    }

    @And ("^I make a sale for Dummy$")
    public void iMakeASaleForDummy() throws InterruptedException {
        new OrderManagementScreen(driver).createSAle();
    }
    @And ("^I click add button to create seat in order screen$")
    public void iClickAddButtonToCreateSeatInOrderScreen(){
        new OrderTypeWindow(driver).addCreateSeatInOrderScreen();
    }

//    @And ("^I click table name in the order screen$")
//    public void iClickTableMenuInTheOrderScreen(){
//        new OrderTypeWindow(driver).clickTableMenuInTheOrderScreen();
//    }

    @And ("^I click seat 1 for add menu item$")
    public void iClickSeat1ForAddMenuItem(){
        new OrderTypeWindow(driver).clickSeat1ForAddMenuItem();
    }
    @Then ("^I should see the order type window$")
    public void iShouldSeeTheOrderTypeWindow(){
        new OrderTypeWindow(driver).verifyOrderTypeWindow();
    }


    @And("^I click All$")
    public void iClickAll() {
        new OrderManagementScreen(driver).pressAll();
    }

    @Then ("^I should see close your sale$")
    public void iShouldSeeCloseYourSale(){
        Assert.assertEquals(new OrderManagementScreen(driver).verifyCloseSale(),"Close your Sale");
    }
    @And("^I click Table Layout tab$")
    public void iClickTableLayoutTab() {
        new OrdersAndDriversListScreen().selectTableLayoutTab();
    }

    @And("^I select table as \"([^\"]*)\"$")
    public void iSelectTableAs(String tableNo) {
        new TableLayOutScreen(driver).selectTable(tableNo);
    }

    @Then ("^I should see service type as \"([^\"]*)\"$")
    public void iShouldSeeServiceTypeAs(String type){
        new OrderManagementScreen(driver).verifyServiceType(type);
    }

    @And("^I select the number of seats as \"([^\"]*)\"$")
    public void iSelectTheNumberOfSeatsAs(String noOfSeats) {
        new TableLayOutScreen(driver).selectSeatNo(noOfSeats);
    }

    @And("^I tap Continue to finish selecting the number of seats$")
    public void iTapContinueToFinishSelectingTheNumberOfSeats() {
        new TableLayOutScreen(driver).pressContinueBtn();
    }

    @And("^I should see numbers of seats as \"([^\"]*)\"$")
    public void iShouldSeeNumbersOfSeatsAs(String noOfSeats) {
        new OrderManagementScreen(driver).checkNoOfSeats(noOfSeats);
    }

    @And("^I add a new seat$")
    public void iAddANewSeat() {
        new OrderManagementScreen(driver).addNewSeat();
    }

    @And("^I delete the seat$")
    public void iDeleteTheSeat() {
        new OrderManagementScreen(driver).deleteSeat();
    }

    @And ("^I delete the seat for QSR order type$")
    public void iDeleteTheSeatForQsrOrderType(){
        new OrderManagementScreen(driver).deleteSeat2();
    }

    @And("^I select seat one$")
    public void iSelectSeatOne() {
        new OrderManagementScreen(driver).selectSeat1();
    }

    @And("^I select Pizza as Category$")
    public void iSelectPizzaAsCategory() throws Exception {
        new OrderManagementScreen(driver).selectPizzaCategory();
    }

    @And ("^I select Breakfast as Category$")
    public void iSelectBreakfastAsCategory() throws Exception {
        new OrderManagementScreen(driver).selectBreakfastCategory();
    }

    @And("^I select Beverages as Category$")
    public void iSelectBeveragesAsCategory() throws Exception {
        new OrderManagementScreen(driver).selectBeverages();
    }

    @And("^I select upcharge as Category$")
    public void iSelectUpchargeAsCategory() throws Exception {
        new OrderManagementScreen(driver).selectUpcharge();
    }

    @And ("^I select Briyani as SubCategory$")
    public void iSelectBriyaniAsSubCategory(){
        new OrderManagementScreen(driver).selectBriyaniSubCategory();
    }
    @And("^I click Done to get back$")
    public void iClickDoneToGetBack() {
        new OrderManagementScreen(driver).doneForTheMenuItem();
    }

    @Then ("^I should see cash button is enable or not$")
    public void iShouldSeeCashButtonIsEnableOrNot(){
        new OrderManagementScreen(driver).verifyCashButtonEnable();
    }
    @And ("^I click log off button in order screen$")
    public void iClickLogOffButtonInOrderScreen(){
        new OrderManagementScreen(driver).clickLogOffBtn();
    }

    @Then ("^I should see Split button is visible$")
    public void iShouldSeeSplitButtonIsVisible(){
        new OrderManagementScreen(driver).visibleSplitButton();
    }
    @And("^I select seat two$")
    public void iSelectSeatTwo() {
        new OrderManagementScreen(driver).selectSeat2();
    }

    @And ("^I select seat as \"([^\"]*)\" on the order screen$")
    public void iSelectSeatAsOnTheOrderScreen(String value){
        new OrderManagementScreen(driver).selectSeats(value);
    }

    @And("^I select Pasta as category$")
    public void iSelectPastaAsCategory() throws Exception {
        new OrderManagementScreen(driver).selectPastaCategory();
    }
    @And ("^I select Menu as category$")
    public void iSelectMenuAsCategory() throws Exception {
        new OrderManagementScreen(driver).selectMenuCategory();
    }

    @And ("^I select Desserts as category$")
    public void iSelectDessertsAsCategory() throws Exception {
        new OrderManagementScreen(driver).selectDessertsCategory();
    }

    @When("^I click Finish Order button$")
    public void iClickFinishOrderButton() {
        new OrderManagementScreen(driver).pressFinish();
    }

    @Then("^I should get back to the Table Layout tab and see the table as seated$")
    public void iShouldGetBackToTheTableLayoutTabAndSeeTheTableAsSeated() {
        new TableLayOutScreen(driver).checkTableSeated();
    }

    @Then("^I should get back to the Table Layout tab and see the table as seated with one seat$")
    public void iShouldGetBackToTheTableLayoutTabAndSeeTheTableAsSeatedWithOneSeat() {
        new TableLayOutScreen(driver).checkTableSeatedByOne();
    }

    @When("^I click on table \"([^\"]*)\"$")
    public void iClickOnTable(String tableNo) {
        new TableLayOutScreen(driver).selectTable(tableNo);
    }

    @Then("^I should see \"([^\"]*)\" with modifiers \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" with modifier \"([^\"]*)\"$")
    public void iShouldSeeWithModifiersAndAndWithModifier(String menuItem1, String modifier1, String modifier2, String menuItem2, String modifier3) {
        //new OrderManagementScreen(driver).verifyOrderedItemExists(menuItem1);
        new OrderManagementScreen(driver).verifyOrderedItemExists(menuItem2);
        new OrderManagementScreen(driver).verifyOrderedItemExists(modifier1);
        new OrderManagementScreen(driver).verifyOrderedItemExists(modifier2);
        new OrderManagementScreen(driver).verifyOrderedItemExists(modifier3);
    }

    /****** Merge Operations ******/

    @And("^I click Merge button$")
    public void iClickMergeButton() {
        new TableLayOutScreen(driver).pressMerge();
    }

    @And("^I select a table to be merged as \"([^\"]*)\"$")
    public void iSelectFirstTableToBeMergedAs(String firstTableToMerge) {
        new TableLayOutScreen(driver).selectTable(firstTableToMerge);
    }

    @And("^I click already selected table as \"([^\"]*)\"$")
    public void iClickAlreadySelectedTableAs(String firstTableToMerge) {
        new TableLayOutScreen(driver).selectTable(firstTableToMerge);
    }
    @And("^I select second table to be merged as \"([^\"]*)\"$")
    public void iSelectSecondTableToBeMergedAs(String secondTableToMerge) {
        new TableLayOutScreen(driver).selectTable(secondTableToMerge);
    }

    @And("^I click Done button to merge checks$")
    public void iClickDoneButtonToMergeChecks() {
        new TableLayOutScreen(driver).pressMergeDone();
    }

    @When("^I click Done button on the pop-up to complete merging$")
    public void iClickDoneButtonOnThePopUpToCompleteMerging() {
        new TableLayOutScreen(driver).pressMergeDone();
    }

    @Then ("^I should see the merged popup after merge$")
    public void iShouldSeetheMergedPopupAfterMerge(){
        new TableLayOutScreen(driver).verifyMergedPopupAfterMerge();
    }

    @Then("^I should see three seats in the first table merged$")
    public void iShouldSeeThreeSeatsIn() {
        new TableLayOutScreen(driver).verifyMerge();
    }

    @When("^I select the same table to be merged as \"([^\"]*)\"$")
    public void iSelectTheSameTableToBeMergedAs(String Double_Merge_table) {
        new TableLayOutScreen(driver).selectTable(Double_Merge_table);
    }

    @Then("^I should see Check already added pop-up message$")
    public void iShouldSeeCheckAlreadyAddedPopUpMessage() {
        Assert.assertEquals( new TableLayOutScreen(driver).getCheckAlreadyMergedString(), "Check already added");
    }
    @Then ("^I should see select at least 2 checks$")
    public void iShouldSeeSelectAtLeast2Checks(){
        Assert.assertEquals(new TableLayOutScreen(driver).Atleast2Chceks(),"Select at least 2 checks");
    }
    @Then ("^I click cancel button on the pop-up for disappear merge box$")
    public void iClickCancelButtonOnThePopUPForDisappearMergeBox(){ new TableLayOutScreen(driver).PressCancelBtn();}

    @And ("^I click Cash button for Complete Sale$")
    public void iClickCashButtonForCompleteSale(){
        new PaymentWindow(driver).pressCashBtn();
    }

    @When ("^I verify the cash price value with fast cash value$")
    public void iVerifyTheCashPriceValueWithFastCashValue(){
        new PaymentWindow(driver).verifyCashPriceValueWithFastCashValue();
    }

    @And ("^I click Exact button on the cash pop-up$")
    public void iClickExactButtonOnTheCashPopup(){
        new PaymentWindow(driver).pressExact();
    }

    @When ("^I verify the fast cash value with total amount$")
    public void iVerifyTheFastCashValueWithTotalAmount(){
        new PaymentWindow(driver).verifyTheFastCashValueWithTotalAmount();
    }

    @And ("^I click Enter Button on the cash pop-up$")
    public void iClickEnterButtonOnTheCashPopup(){
        new PaymentWindow(driver).pressEnter();
    }

    @When ("^I verify the paid amount with partial paid amount$")
    public void iVerifyThePaidAmountWithPartialPaidAmount(){
        new PaymentWindow(driver).verifyThePaidAmountWithPartialPaidAmount();
    }

    @When ("^I verify the paid amount with partial paid amount while gratuity$")
    public void iVerifyThePaidAmountWithPartialPaidAmountWhileGratuity(){
        new PaymentWindow(driver).verifyThePaidAmountWithPartialPaidAmountWhileGratuity();
    }

    @When ("^I verify the partial amount is same with balance due amount on the payment screen$")
    public void iVerifyThePartialAmountIsSameWithBalanceDueAmountOnThePaymentScreen(){
        new PaymentWindow(driver).verifyPartialAmountWithBalanceDueAmount();
    }

    @When ("^I verify the partial amount is same with cash price amount on the payment screen$")
    public void iVerifyThePartialAmountIsSameWithCashPriceAmountOnThePaymentScreen(){
        new PaymentWindow(driver).verifyPartialAmountWithCashPriceAmount();
    }

    @And("^I click Done button on the Popup$")
    public void iClickDoneButtonOnThePopup() throws InterruptedException {
        Thread.sleep(3000);
        new TableLayOutScreen(driver).pressDone1();
    }



    @And ("^I click Back button in the menu options window$")
    public void iClickBackButtonInTheMenuOptionsWindow(){
        new MenuOptionScreen(driver).clickBackBtn();
    }
    @Then ("^I should see the print or send receipt$")
    public void iShouldSeeThePrintOrSendReceipt(){
        Assert.assertEquals(new TableLayOutScreen(driver).getPrintOrReceiptMsg(),"Print Or Send Receipt");
    }

    @And ("^I verify the Total value with digital receipt screen$")
    public void iVerifyTheTotalValueWithDigitalReceiptScreen(){
        new PaymentWindow(driver).verifyTheTotalValueWithDigitalPrinterScreen4();
    }

    @And ("^I verify the pay amount value with digital receipt screen$")
    public void iVerifyThePayAmountValueWithDigitalReceiptScreen(){
        new PaymentWindow(driver).verifyTheTotalValueWithDigitalPrinterScreen4();
    }

    @And ("^I verify the pay amount value with digital receipt screen while partial payment$")
    public void iVerifyThePayAmountValueWithDigitalReceiptScreenWhilePartialPayment(){
        new PaymentWindow(driver).verifyTheTotalValueWithDigitalPrinterScreen5();
    }

    @Then ("^I should see merge box is hide$")
    public void iShouldSeeMergeBoxIsHide(){
        new TableLayOutScreen(driver).findMergeBox();
    }
    /****** Add customer to table ******/

    @And("^I click Add Customer Button$")
    public void iClickAddCustomerButton() {
        new OrderManagementScreen(driver).openCustomerSelectionMenu();
    }

    @And ("^I click Add new button$")
    public void iClickAddNewButton(){
        new OrderManagementScreen(driver).clickAddNewBtn();
    }

    @And ("^I pass the customer name$")
    public void iPassTheCustomerName(){
        new OrderManagementScreen(driver).passTheCustomerName();
    }
    @And ("^I click remove button$")
    public void iClickRemoveButton(){
        new OrderManagementScreen(driver).clickRemoveBtn();
    }

    @Then ("^I should see customer removed$")
    public void iShouldSeeCustomerRemoved(){
        Assert.assertEquals(new OrderManagementScreen(driver).customerRemoved(),"Walkin");
    }

    @Then ("^I should see the customer profile window$")
    public void iShouldSeeTheCustomerProfileWindow(){
        Assert.assertEquals(new OrderManagementScreen(driver).verifyCustomerProfile(),"Customer Profile");
    }

    @And ("^I enter first name as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String first){
        new CustomerProfileWindow(driver).iEnterCustomerFirstName(first);
    }
    @And ("^I enter last name as \"([^\"]*)\"$")
    public void iEnterLastNameAs(String last){
        new CustomerProfileWindow(driver).iEnterCustomerLastName(last);
    }
    @And ("^I enter mobile number as \"([^\"]*)\"$")
    public void iEnterMobileNumberAs(String numb){
        new CustomerProfileWindow(driver).iEnterCustomerMobileNumber(numb);
    }
    @And ("^I enter e-mail as \"([^\"]*)\" in customer profile$")
    public void iEnterEmailAsInCustomerProfile(String mail){
        new CustomerProfileWindow(driver).iEnterCustomerEmail(mail);
    }
    @And("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String customerName)  {
        new OrderManagementScreen(driver).searchForCustomer(customerName);
    }

    @And("^I click \"([^\"]*)\" to select customer for the seat$")
    public void iClickToSelectCustomerForTheSeat(String customerName) {
        new OrderManagementScreen(driver).selectCustomerNameToAddToTheTable(customerName);
    }

    @And("^I click \"([^\"]*)\" to select customer")
    public void iClickToSelectCustomer(String customerName) {
        new OrderManagementScreen(driver).selectCustomerNameAsToAddToTheTable(customerName);
    }
    @Then ("^I should see customer as \"([^\"]*)\" added on order screen$")
    public void iShouldSeeCustomerAsAddedOnOrderScreen(String name){
        new OrderManagementScreen(driver).verifyCustomerAddOrderScreen(name);
    }

    @Then("^I should get back to the Table Layout tab and see the table as seated, I should see the selected customer's name$")
    public void iShouldGetBackToTheTableLayoutTabAndSeeTheTableAsSeatedIShouldSeeTheSelectedCustomerSName() {
        Assert.assertEquals(new TableLayOutScreen(driver).getCustomerName(), "Auto r");
    }

    /****** Transfer Table ******/

    @And("^I click Transfer button$")
    public void iClickTransferButton() {
        new TableLayOutScreen(driver).pressTransfer();
    }

    @Then ("^I should see transfer to server$")
    public void iShouldSeeTransferToServer(){
        Assert.assertEquals(new TableLayOutScreen(driver).verifyTransferToServer(),"Transfer to Server");
    }

    @And("^I click Transfer to Table button$")
    public void iClickTransferToTableButton() {
        new TransferWindow(driver).pressTransferToTable();
    }

    @And("^I select table to transfer from as \"([^\"]*)\"$")
    public void iSelectTableToTransferFromAs(String tableToTransferFrom) {
        new TransferWindow(driver).selectTransferFromTable(tableToTransferFrom);
    }

    @And("^I select the check to be transferred as \"([^\"]*)\"$")
    public void iSelectTheCheckToBeTransferredAs(String checkToTransfer) throws Exception {
        new TransferWindow(driver).selectCheck(checkToTransfer);
    }

    @And("^I select the check to be transferred$")
    public void iSelectTheCheckToBeTransferred(){
        new TransferWindow(driver).selectCheckTransfer();
    }

    @And("^I select the table to transfer to as \"([^\"]*)\"$")
    public void iSelectTheTableToTransferToAs(String tableTransferTo) {
        new TransferWindow(driver).selectTableTransferTo(tableTransferTo);
    }

    @When("^I click Done button to complete the transfer$")
    public void iClickDoneButtonToCompleteTheTransfer() {
        new TransferWindow(driver).pressTransferDone();
    }

    @Then("^I should see transfer successful pop-up$")
    public void iShouldSeeTransferSuccessfulPopUp() {
        Assert.assertEquals(new TableLayOutScreen(driver).getTransferSuccessfulMsg(), "Transferred Successfully");
    }

    @And("^I click Pay Check button$")
    public void iClickPayCheckButton() {
        new TableLayOutScreen(driver).pressPayCheck();
    }

    /****** Transfer to Server ******/

    @And("^I click Transfer to Server Button$")
    public void iClickTransferToServerButton() {
        new TransferWindow(driver).pressTransferToServer();
    }

    @And("^I select Server to transfer from$")
    public void iSelectServerToTransferFrom() {
        new TransferWindow(driver).selectServerTransferFrom();
    }

    @And("^I select the Server to transfer to$")
    public void iSelectTheServerToTransferTo() {
        new TransferWindow(driver).selectServerTransferTo();
    }

    @And("^I click Yes button on Employee is offline pop-up$")
    public void iClickYesButtonOnEmployeeIsOfflinePopUp() {
        new TransferWindow(driver).pressYes();
    }

    @Then("^I should verify that the check is transferred to the selected server$")
    public void iShouldVerifyThatTheCheckIsTransferredToTheSelectedServer() {
        new TableLayOutScreen(driver).verifyServer();
    }

    /****** Transfer Item ******/

    @And("I click Transfer Item Button")
    public void iClickTransferItemButton() {
        new TransferWindow(driver).pressTransferItem();
    }

    @And("^I select table that the item will be transferred from$")
    public void iSelectTableThatTheItemWillBeTransferredFrom() {
        new TransferWindow(driver).selectTransferItemFrom();
    }

    @And("^I select the item to be transferred$")
    public void iSelectTheItemToBeTransferred() {
        new TransferWindow(driver).selectItemToTransfer();
    }

    @And("^I select the table to transfer the item$")
    public void iSelectTheTableToTransferTheItemAs() {
        new TransferWindow(driver).selectTableToTransferTheItem();
    }

    @Then("^I should see item transfer successful pop-up$")
    public void iShouldSeeItemTransferSuccessfulPopUp() {
        Assert.assertEquals(new TableLayOutScreen(driver).getItemTransferSuccessfulMsg(), "Transferred check success.");
    }

    @Then("^I should verify that the menu item \"([^\"]*)\" is transferred to the selected server$")
    public void iShouldVerifyThatTheMenuItemIsTransferredToTheSelectedServer(String menuItem) {
        new OrderManagementScreen(driver).verifyOrderedItemExists(menuItem);
    }

    @And("I click Done button to complete item transfer")
    public void iClickDoneButtonToCompleteItemTransfer() {
        new TableLayOutScreen(driver).pressItemTransferDone();
    }

    /****** Check Options ******/

    @And("^I select modifier as \"([^\"]*)\"$")
    public void iSelectModifierAs(String modifier) {
        new CheckOptionsScreen(driver).selectModifier(modifier);
    }
    @And("^I select modifier1 as \"([^\"]*)\"$")
    public void iSelectModifier1(String numb) {
        new CheckOptionsScreen(driver).selectModifier1(numb);
    }

    @And ("^I swipe auto discount in order screen$")
    public void iSwipeAutoDiscountInOrderScreen() throws InterruptedException {
        new OrderManagementScreen(driver).swipeDiscount();
    }

    @And("^I click delete button$")
    public void iClickDeleteButton(){
        new OrderManagementScreen(driver).clickDeleteBtn();
    }


    @And("^I select menu item as \"([^\"]*)\"$")
    public void iSelectMenuItemAs(String menuItem) throws Exception {
        new OrderManagementScreen(driver).selectMenuItem(menuItem);
    }

    @When ("^I should verify subtotal value as \"([^\"]*)\"$")
    public void iShouldVerifySubtotalValueAs(String subtotal){
        new OrderManagementScreen(driver).verifyMenuSubTotalAs(subtotal);
    }

    @Then ("^I should verify tax value as \"([^\"]*)\"$")
    public void iShouldVerifyTaxValueAs(String value){
         new OrderManagementScreen(driver).verifyTaxValueAs(value);
    }

    @Then ("^I should verify discount value as \"([^\"]*)\"$")
    public void iShouldVerifyDiscountValueAs(String value){
        new OrderManagementScreen(driver).verifyDiscountValueAs(value);
    }

    @Then ("^I should verify discount value1 as \"([^\"]*)\"$")
    public void iShouldVerifyDiscountValue1As(String value){
        new OrderManagementScreen(driver).verifyDiscount1ValueAs(value);
    }

    @Then ("^I should verify service charge value as \"([^\"]*)\"$")
    public void iShouldVerifyServiceChargeValueAs(String value){
        new OrderManagementScreen(driver).verifyServiceChargeValueAs(value);
    }

    @Then ("^I should verify service charge value1 as \"([^\"]*)\"$")
    public void iShouldVerifyServiceChargeValue1As(String value){
        new OrderManagementScreen(driver).verifyServiceChargeValue1As(value);
    }

    @Then ("^I should verify service charge value2 as \"([^\"]*)\"$")
    public void iShouldVerifyServiceChargeValue2As(String value){
        new OrderManagementScreen(driver).verifyServiceChargeValue2As(value);
    }

    @Then ("^I should verify cash price value as \"([^\"]*)\"$")
    public void iShouldVerifyCashPriceValueAs(String value){
        new OrderManagementScreen(driver).verifyCashPriceValueAs(value);
    }

    @Then ("^I should verify cash price value as \"([^\"]*)\" for tax exempt$")
    public void iShouldVerifyCashPriceValueAsForTaxExempt(String value){
        new OrderManagementScreen(driver).verifyCashPriceValueAsForTaxExempt(value);
    }

    @Then ("^I should verify cash price value1 as \"([^\"]*)\"$")
    public void iShouldVerifyCashPriceValue1As(String value){
        new OrderManagementScreen(driver).verifyCashPriceValue1As(value);
    }

    @Then ("^I should verify cash price value2 as \"([^\"]*)\"$")
    public void iShouldVerifyCashPriceValue2As(String value){
        new OrderManagementScreen(driver).verifyCashPriceValue2As(value);
    }

    @Then ("^I should verify cash price value3 as \"([^\"]*)\"$")
    public void iShouldVerifyCashPriceValue3As(String value){
        new OrderManagementScreen(driver).verifyCashPriceValue3As(value);
    }

    @And ("^I verify the actual cash price with calculated cash price$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPrice(){
        new PaymentWindow(driver).verifyTheActualCashPriceWithCalculatedCAshPrice();
    }

    @And ("^I verify the actual cash price with calculated cash price1$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPrice1(){
        new PaymentWindow(driver).verifyTheActualCashPriceWithCalculatedCAshPrice1();
    }

    @And ("^I verify the actual cash price with calculated cash price while cash discount is enabled$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceWhileCashDiscountIsEnabled(){
        new PaymentWindow(driver).verifyTheActualCashPriceWithCalculatedCAshPriceWhileCashDiscount();
    }

    @And ("^I verify the actual cash price with calculated cash price while cash discount is enabled when inclusive tax$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceWhileCashDiscountIsEnabledWhenInclusiveTax(){
        new PaymentWindow(driver).verifyTheActualCashPriceWithCalculatedCAshPriceWhileCashDiscountInclusiveTax();
    }

    @And ("^I verify the actual cash price with calculated cash price while tax exempt$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceWhileTaxExempt(){
        new PaymentWindow(driver).verifyTheActualCashPriceWithCalculatedCAshPriceWhileTaxExempt();
    }

    @And ("^I verify the actual cash price with calculated cash price cash discount enabled while tax exempt$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceCashDiscountEnabledWhileTaxExempt(){
        new PaymentWindow(driver).verifyTheActualCashPriceWithCalculatedCAshPriceCashDiscountEnabledWhileTaxExempt();
    }

    @And ("^I verify the actual cash price with calculated cash price while gratuity$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceWhileGratuity(){
        new PaymentWindow(driver).verifyTheActualCashPriceWithCalculatedCAshPriceWhileGratutity();
    }

    @And ("^I verify the actual cash price with calculated cash price while gratuity with inclusive tax$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceWhileGratuityWithInclusiveTax(){
        new PaymentWindow(driver).verifyTheActualCashPriceWithCalculatedCAshPriceWhileGratutityWithInclusiveTax();
    }


    @And ("^I verify the actual total price with calculated total value cash discount enabled while gratuity$")
    public void iVerifyTheActualTotalPriceWithCalculatedTotalValueCashDiscountEnabledWhileGratuity(){
        new PaymentWindow(driver).verifyTheActualCashPriceWithCalculatedCAshPriceCashDiscountWhileGratutity();
    }

    @And ("^I verify the actual cash price with calculated cash price while service charge$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceWhileServiceCharge(){
        new PaymentWindow(driver).verifyTheActualCashPriceWithCalculatedCAshPriceWhileItemServiceCharge();
    }

    @Then ("^I should verify total value as \"([^\"]*)\"$")
    public void iShouldVerifyTotalValueAs(String value){
        new OrderManagementScreen(driver).verifyTotalValueAs(value);
    }

    @Then ("^I should verify total4 value as \"([^\"]*)\"$")
    public void iShouldVerifyTotal4ValueAs(String value){
        new OrderManagementScreen(driver).verifyTotal4ValueAs(value);
    }

    @And ("^I should verify paid amount as \"([^\"]*)\"$")
    public void iShouldVerifyPaidAmountAs(String value){
        new OrderManagementScreen(driver).verifyPaidAmountValueAs(value);
    }

    @And ("^I should verify paid amount0 as \"([^\"]*)\"$")
    public void iShouldVerifyPaidAmount0As(String value){
        new OrderManagementScreen(driver).verifyPaidAmountValueAs0(value);
    }

    @And ("^I should verify paid amount1 as \"([^\"]*)\"$")
    public void iShouldVerifyPaidAmount1As(String value){
        new OrderManagementScreen(driver).verifyPaidAmountValue1As(value);
    }

    @Then ("^I should verify total5 value as \"([^\"]*)\"$")
    public void iShouldVerifyTotal5ValueAs(String value){
        new OrderManagementScreen(driver).verifyTotal5ValueAs(value);
    }

    @Then ("^I should verify total6 value as \"([^\"]*)\"$")
    public void iShouldVerifyTotal6ValueAs(String value){
        new OrderManagementScreen(driver).verifyTotal6ValueAs(value);
    }

    @Then ("^I should verify total2 value as \"([^\"]*)\"$")
    public void iShouldVerifyTotal2ValueAs(String value){
        new OrderManagementScreen(driver).verifyTotal2ValueAs(value);
    }

    @When ("^I verify the cash price name on the order screen$")
    public void iVerifyTheCashPriceNameOnTheOrderScreen(){
        new OrderManagementScreen(driver).verifyTheCashPriceNameONTheOrderScreen();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabled(){
        new OrderManagementScreen(driver).verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscount();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled with gratuity is enabled$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabledWithGratuityIsEnabled(){
        new OrderManagementScreen(driver).verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountWithGratuityEnabled();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled with item service charge$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabledWithItemServiceCharge(){
        new OrderManagementScreen(driver).verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountWithServiceCharge();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled with discount$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabledWithDiscount(){
        new OrderManagementScreen(driver).verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountWithDiscount();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled with item service charge also having gratuity$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabledWithItemServiceChargeAlsoHavingGratuity(){
        new OrderManagementScreen(driver).verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountWithServiceChargeHavingGratuity();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled discount with item service charge also having gratuity$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabledDiscountWithItemServiceChargeAlsoHavingGratuity(){
        new OrderManagementScreen(driver).verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountDiscountAndServiceChargeHavingGratuity();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled for tax exempt$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabledForTaxExempt(){
        new OrderManagementScreen(driver).verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountForTaxExempt();
    }

    @Then ("^I should verify tax exempt total value as \"([^\"]*)\"$")
    public void iShouldVerifyTaxExemptTotal2ValueAs(String value){
        new OrderManagementScreen(driver).verifyTaxExemptTotalValueAs(value);
    }

    @And ("^I should verify cash option value as \"([^\"]*)\" with Gratuity$")
    public void iShouldVerifyCashOptionValueAsWithGratuity(String value){
        new OrderManagementScreen(driver).verifyCashOptionValueASWithGratuity(value);
    }

    @Then ("^I should verify gratuity value as \"([^\"]*)\"$")
    public void iShouldVerifyGratuityValueAs(String value){
        new OrderManagementScreen(driver).verifyGratuityValueAs(value);
    }

    @Then ("^I should verify gratuity value1 as \"([^\"]*)\"$")
    public void iShouldVerifyGratuityValue1As(String value){
        new OrderManagementScreen(driver).verifyGratuity1ValueAs(value);
    }

    @When ("^I get Total of menu while cash discount applied$")
    public void iGetTotalOfMenuWhileCashDiscountApplied(){
        new OrderManagementScreen(driver).getTotalOfMenuWhileCashDiscountApplied();
    }

    @When ("^I verify total Menu same with Fast cash total when Cash discount applied")
    public void iVerifyTotalMenuSameWithFastCashTotaWhenCashDiscountIsApplied(){
        new OrderManagementScreen(driver).verifyTheTotalValueWithPaymentScreen();
    }
    @And ("^I verify subtotal value with cash value in payemnt screen$")
    public void iVerifySubtotalValueWithCashValueInPaymentScreen(){
        new OrderManagementScreen(driver).verifySubtotalValueWithCashValueInPaymentScreen();
    }
    @And ("^I select menu item  as \"([^\"]*)\" to see menu option window$")
    public void iSelectMenuItemAsToSeeMenuOptionWindow(String menuItem){
        new OrderManagementScreen(driver).selectMenuItemToSeeMenuOptionWindow(menuItem);
    }
    @And ("^I select menu item as Ravioli for Item Based Exclusive Tax$")
    public void iSelectMenuItemAsRavioliForItemBasedExclusiveTax(){
        new OrderManagementScreen(driver).selectMenuAsRavioli();
    }

    @And ("^I select menu item as RavioliPesto for Item Based Inclusive Tax$")
    public void iSelectMenuItemAsRavioliPestoForItemBasedInclusiveTax(){
        new OrderManagementScreen(driver).selectMenuAsRavioliPesto();
    }

    @And ("^I select menu item as Cheesecake for Item Based Quantity Tax$")
    public void iSelectMenuItemAsFusRapiniForItemBasedQuantityTax(){
        new OrderManagementScreen(driver).selectMenuAsCheeseCake();
    }

    @And ("^I select menu item as Ling Littlenck for free item auto Discount$")
    public void iSelectMenuItemAsLingLittleNckForFreeItemAutoDiscount(){
        new OrderManagementScreen(driver).selectMenuAsLingLittlenck();
    }
    @And ("^I select menu item as Ling Pes Shrimp for free item auto Discount$")
    public void iSelectMenuItemAsLingPesShrimpForFreeItemAutoDiscount(){
        new OrderManagementScreen(driver).selectMenuAsLingPesShrimp();
    }

    @And ("^I select menu item as Ling Meatballs for Tax on Item Tax$")
    public void iSelectMenuItemAsLingMeatballsForTaxOnItemTax(){
        new CheckOptionsScreen(driver).selectMenuAsLingMeatballs();
    }

    @And("^I select the serving size as \"([^\"]*)\"$")
    public void iSelectTheServingSizeAs(String servingSize) {
        new CheckOptionsScreen(driver).selectServingSize(servingSize);
    }

    @Then("^I should return back to the order management screen and I should verify that the \"([^\"]*)\" and \"([^\"]*)\" are listed under the menu item$")
    public void iShouldReturnBackToTheOrderManagementScreenAndIShouldVerifyThatTheAndAreListedUnderTheMenuItem(String modifier1, String modifier2) {
        new OrderManagementScreen(driver).verifyOrderedItemExists(modifier1);
        new OrderManagementScreen(driver).verifyOrderedItemExists(modifier2);
    }

    /****** Table Seated By One (Dine In) ******/

    @Then("^I should get back to the Table Layout tab and see the table as seated by one$")
    public void iShouldGetBackToTheTableLayoutTabAndSeeTheTableAsSeatedByOne() {
        new TableLayOutScreen(driver).checkTableSeatedDineIn();
    }

    @Then ("^I should see that OrderScreen with modifiers as \"([^\"]*)\"$")
    public void iShouldSeeThatOrderScreenWithModifiers(String modify){
        new OrderManagementScreen(driver).verifyModifiersAddOrderScreen(modify);
    }

    /****** Split Option ******/

    @And ("^I click the Split Button from the Table Layout Screen$")
    public void iClickSplitButtonFromTheTableLayoutScreen(){
        new TableLayOutScreen(driver).pressSplitBtn();
    }

    @And ("^I click split check button$")
    public void iClickSplitCheckButton(){
        new TableLayOutScreen(driver).pressSplitCheckBtn();
    }


    @When ("^I click the Split By Seat on the Pop-up$")
    public void iClickTheSplitCheckOnThePopup(){
        new TableLayOutScreen(driver).pressSplitBySeat();
    }

    @And("^I click the valid check \"([^\"]*)\"$")
    public void iClickTheValidCheck(String firstTableToMerge){
        new TableLayOutScreen(driver).selectTable(firstTableToMerge);
    }
    @Then ("^I should see the Split Screen$")
    public void iShouldSeeTheSplitScreen(){
        new TableLayOutScreen(driver).verifySplitScreen();
    }

    @When ("^I verify the split seat is avilable in split seat screen$")
    public void iVerifyTheSplitSeatIsAvailableInSplitSeatScreen(){
        new TableLayOutScreen(driver).verifySplitSeatIsAvailable();
    }

    @And ("^I get the first seat prize details$")
    public void iGetTheFirstSeatPrizeDetails(){
        new TableLayOutScreen(driver).getFirstSeatPRizeDetails();
    }
    @Then ("^I should see Gift card amount add up into seat 1 with amount$")
    public void iShouldSeeGiftCardAmountAddUpIntoSeat1WithAmount(){
        new TableLayOutScreen(driver).giftCardSeat1();
    }

    @And ("^I click Gift card in seat 1$")
    public void iClickGiftCardInSeat1(){
        new TableLayOutScreen(driver).giftSeat1();
    }
    @Then ("^I should see Gift card amount add up into seat 2 with amount$")
    public void iShouldSeeGiftCardAmountAddUpIntoSeat2WithAmount(){
        new TableLayOutScreen(driver).giftCardSeat2();
    }
    @Then ("^I should see paid amount as \"([^\"]*)\" in Split seat screen$")
    public void iShouldSeePaidAmountAsInSplitSeatScreen(String num){
        new TableLayOutScreen(driver).verifyPaidAmount(num);
    }
    @Then ("^I should see created seat in split seat$")
    public void iShouldSeeCreatedSeatInSplitSeat(){
        new TableLayOutScreen(driver).verifyCreatedSeat();
    }
    @Then ("^I should see menu item as Ravioli added into next seat$")
    public void iShouldSeeMenuItemAsAddedIntoNextSeat(){
        new TableLayOutScreen(driver).verifyMenuAddedIntoNextSeat();
    }

    @Then ("^I should see discount as \"([^\"]*)\" moved into next seat$")
    public void iShouldSeeDiscountAsMovedIntoNextSeat(String discount){
        new TableLayOutScreen(driver).verifyDiscountIsMovedIntoNextSeat(discount);
    }
    @Then ("^I should see menu item as cake added into next seat$")
    public void iShouldSeeMenuItemAsCakeAddedIntoNextSeat(){
        new TableLayOutScreen(driver).verifyMenuAddedIntoNextSeat1();
    }
    @Then ("^I should see menu item as Ravioli Pesto added into next seat$")
    public void iShouldSeeMenuItemAsRavioliPestoAddedIntoNextSeat(){
        new TableLayOutScreen(driver).verifyMenuAddedIntoNextSeat2();
    }
    @Then ("^I should see menu item as Ravioli added into next seat for gratuity$")
    public void iShouldSeeMenuItemaAsRavioliAddedIntoNextSeatForGratuity(){
        new TableLayOutScreen(driver).verifyMenuAddedIntoNextSeat2();
    }
    @Then ("^I should see menu item as cheese cake added into next seat$")
    public void iShouldSeeMenuItemAsCheeseCakeAddedIntoNextSeat(){
        new TableLayOutScreen(driver).verifyMenuAddedIntoNextSeat3();
    }
    @Then ("^I should see applied discount as \"([^\"]*)\"$")
    public void iShouldSeeAppliedDiscountAs(String name){
        new TableLayOutScreen(driver).verifyDiscountIsApplied(name);
    }
    @Then ("^I should see menu item as Ravioli added into next seat for Free Item$")
    public void iShouldSeeMenuItemAsAddedIntoNextSeatForFreeItem(){
        new TableLayOutScreen(driver).verifyMenuAddedIntoNextSeat4();
    }
    @Then ("^I should see seat as paid$")
    public void iShouldSeeSeatAsPaid(){
        Assert.assertEquals(new TableLayOutScreen(driver).verifyPaidTxt(),"Paid");
    }

    @Then ("^I should see paid amount as \"([^\"]*)\" of French Friese$")
    public void iShouldSeePaidAmountAsOfFrenchFriese(String money){
        new TableLayOutScreen(driver).verifyPaidAmountFrenchFriese(money);
    }
    @Then ("^I should see \"([^\"]*)\" present in respective seat in split screen$")
    public void iShouldSeeMenuItemPresentInRespectiveSeatInSplitScreen(String menu){
        new TableLayOutScreen(driver).verifyMenuItem(menu);
    }
    @And ("^I click an unvalid check \"([^\"]*)\"$")
    public void iClickAnUnvalidCheck(String unvalidTable){
        new TableLayOutScreen(driver).selectTable(unvalidTable);
    }

    @Then ("^I should see select Valid Check pop-up$")
    public void iShouldSeeSelectValidCheckPopup(){
        Assert.assertEquals( new TableLayOutScreen(driver).getSelectValidCheckMsg(), "Select valid check");
    }
    @And ("^I click on item$")
    public void iClickOnItem(){
        new TableLayOutScreen(driver).selectItem();
    }

    @And ("^I click on item as \"([^\"]*)\"$")
    public void iClickOnItemAs(String menu1)
    {
        new TableLayOutScreen(driver).selectItem1(menu1);
    }

    @And ("^I click on item as Ravioli$")
    public void iClickOnItemAsRavioli(){
        new TableLayOutScreen(driver).selectItem2();
    }
    @And ("^I click on item as Ravioli For Gratuity$")
    public void iClickOnItemAsRavioliForGratuity(){
        new TableLayOutScreen(driver).selectRavioli();
    }
    @And ("^I click on item as cake")
    public void iClickOnItemAsCake(){
        new TableLayOutScreen(driver).selectItem3();
    }
    @And ("^I click on item as cake on split seat screen")
    public void iClickOnItemAsCakeOnSplitSeatScreen(){
        new TableLayOutScreen(driver).selectItem6();
    }
    @And ("^I click on item as Ravioli Pesto$")
    public void iClickOnItemAsRavioliPesto(){
        new TableLayOutScreen(driver).selectItem4();
    }

    @And ("^I click on item as cheesecake$")
    public void iClickOnItemAsCheeseCake(){
        new TableLayOutScreen(driver).selectItem5();
    }
    @And ("^I click Seperate item button$")
    public void iClickSeperateItemButton(){
        new TableLayOutScreen(driver).seperateItem();
    }

    @And ("^I select the number of split item \"([^\"*])\"$")
    public void iSelectTheNumberOfSplitItem(String noOfSplit) throws InterruptedException {
        new TableLayOutScreen(driver).selectSplit(noOfSplit);
    }

    @Then ("^I should see menu has separated as \"([^\"]*)\"$")
    public void iShouldSeeMenuHasSeparatedAs(String number){
        new TableLayOutScreen(driver).verifyMenuHasSeperated(number);
    }

    @And ("^I select the number of split item \"([^\"]*)\" for Split check$")
    public void iSelectTheNumberOfSplitItemForSplitCheck(String number){
        new TableLayOutScreen(driver).selectTheNumberOfSplitItem(number);
    }
    @And ("^I click the Back button on Split Screen$")
    public void iClickTheBackButtonOnSplitScreen(){
        new TableLayOutScreen(driver).pressBack();
    }

    @Then ("^I should see the Changes made in split save and close pop-up$")
    public void iShouldSeeTheChangesMadeInSplitSaveAndClosePopUp(){
        Assert.assertEquals(new TableLayOutScreen(driver).getChangesMadeinSplitMag(),"Changes made in split, save and close");
    }
    @And ("^I click Done button on the pop-up to cancel the Back condition$")
    public void iClickDoneButtonOnThePopupToCancelTheBackCondition(){
        new TableLayOutScreen(driver).clickDone();
    }

    @And ("^I click the save & close button on the split screen$")
    public void iClickTheSaveCloseButtonOnTheSplitScreen(){
        new TableLayOutScreen(driver).clickSaveandClose();
    }

    @Then ("^I Should get back to the Order Screen$")
    public void iShouldGetBackToTheOrderScreen() throws InterruptedException {
        new TableLayOutScreen(driver).orderScreen();
    }

    @And ("^I wait sometimes$")
    public void iWaitSometimes() throws InterruptedException {
        Thread.sleep(5000);
    }

    @And ("^I verify the values after reopen the check$")
    public void iVerifyTheValuesAfterReopenTheChecks(){
        new Regression(driver).validateTheMenuValueInOrderScreen1();
    }

    @And ("^I verify the values after reopen the check1$")
    public void iVerifyTheValuesAfterReopenTheChecks1(){
        new Regression(driver).validateTheMenuValueInOrderScreen2();
    }

    @Then ("^I should see Delivery charge added to orderscreen$")
    public void iShouldSeeDeliveryChargeAddedToOrderScreen(){
        new TableLayOutScreen(driver).verifyDeliveryChargeAdded();
    }

    @Then ("^I should see Delivery charge added to orderscreen for loyalty$")
    public void iShouldSeeDeliveryChargeAddedToOrderScreenForLoyalty(){
        new TableLayOutScreen(driver).verifyDeliveryChargeAddedForLoyalty();
    }

    @Then ("I should see subtotal should not change when added delivery charge$")
    public void iShouldSeeSubtotalShouldNotChangeWhenAddedDeliveryCharge(){
        new TableLayOutScreen(driver).verifySubtotalShouldNotChange();
    }
    @Then ("^I Should see Split Evenly is Disable")
    public void iShouldSeeSplitEvenlyIsDisable(){
        new TableLayOutScreen(driver).splitEvently();
    }

    @Then ("^I should see Select the Order to Proceed Popup$")
    public void iShouldSeeSelectTheOrderToProceedPopUP(){
        Assert.assertEquals(new TableLayOutScreen(driver).getSelectTheOrderToProceedMsg(),"Select the Order to Proceed");
    }
    @And ("^I click Add Button to create Seat$")
    public void iClickAddButtonToCreateSeat(){
        new TableLayOutScreen(driver).pressAddBtn();
    }

    @Then ("^I should see created new seat$")
    public void iShouldSeeCreatedNewSeat(){
        new TableLayOutScreen(driver).verifySeat2();
    }

    @Then ("^I should see seat 3 is created$")
    public void iShouldSeeSeat3IsCreated(){
        new TableLayOutScreen(driver).verifySeat3();
    }

    @And ("^I click Split Evenly Button$")
    public void iClickSplitEvenlyButton(){
        new TableLayOutScreen(driver).pressSplitEvenly();
    }

    @Then ("^I should see cannot split as payments popup$")
    public void iShouldSeeCannotSplitAsPaymentsPopup(){
        new TableLayOutScreen(driver).verifyCannotSplitAsPayments();
    }

    @Then ("^I should see menu item prize split evenly$")
    public void iShouldSeeMenuItemPrizeSplitEvenly(){
        new TableLayOutScreen(driver).verifyMenuItemPrizeSplit();
    }
    @Then ("^I should see Seperate Item is Disable$")
    public void iShouldSeeSeperateItemIsDisable(){
        new TableLayOutScreen(driver).seperateItemIsVisble();
    }

    @Then ("^I should see the additional seat & Item on the Split Seat$")
    public void iShouldSeeTheAdditionalSeatItemOnTheSplitSeat(){
        new TableLayOutScreen(driver).verify2Table();
    }

    @And ("^I click the Group Seats button in the Split Seat$")
    public void iClickTheGroupSeatsButtonInTheSplitSeat(){
        new TableLayOutScreen(driver).pressGroupSeat();
    }

    @Then ("^I should see the Select the Seats to Merge Popup message$")
    public void iShouldSeeTheSelectTheSeatsToMergePopupMessage(){
        Assert.assertEquals(new TableLayOutScreen(driver).getPopupMessage(),"Select the seats to Merge");
    }

    @And ("^I click Seat 2 for add menu item$")
    public void iClickSeat2ForAddMenuItem(){
        new TableLayOutScreen(driver).pressSeat2();
    }

    @And ("^I click Seat 3 for add menu item$")
    public void iClickSeat3ForAddMenuItem(){ new TableLayOutScreen(driver).pressSeat3(); }

    @And ("^I click Seat 4 for add menu item$")
    public void iClickSeat4ForAddMenuItem(){ new TableLayOutScreen(driver).pressSeat4(); }

    @And ("^I click Seat 5 for add menu item$")
    public void iClickSeat5ForAddMenuItem(){ new TableLayOutScreen(driver).pressSeat5(); }

    @And ("^I click seat to Group into one seat$")
    public void iClickSeatToGroupIntoOneSeat(){
        new TableLayOutScreen(driver).pressSeat1Group();
    }

    @And ("^I click seat one on the split screen$")
    public void iClickSeatOneOnTheSplitScreen(){
        new TableLayOutScreen(driver).pressSeat1();
    }

    @And ("^I click another seat for Group$")
    public void iClickAnotherSeatForGroup(){
        new TableLayOutScreen(driver).pressSeat2Group();
    }

    @And ("^I click seat two on the split screen$")
    public void iClickSeatTwoOnTheSplitScreen(){
        new TableLayOutScreen(driver).pressSeat2Table();
    }

    @And ("^I click seat three on the split screen$")
    public void iClickSeatThreeOnTheSplitScreen(){
        new TableLayOutScreen(driver).pressSeat3Table();
    }

    @Then ("^I should see order cannot moved popup message$")
    public void iShouldSeeOrderCannotMovedPopupMessage(){
        Assert.assertEquals(new TableLayOutScreen(driver).verifyOrderCannotMovedPopup(),"Order cannot be moved, Payment(s) has been made in seat - 1");
    }

    @Then ("^I should see order cannot moved popup message1$")
    public void iShouldSeeOrderCannotMovedPopupMessage1(){
        Assert.assertEquals(new TableLayOutScreen(driver).verifyOrderCannotMovedPopup1(),"Order cannot be moved, Payment(s) has been made in seat - 2");
    }

    @Then ("^I should see selected seat item should club into one seat$")
    public void iShouldSeeSelectedSeatItemShouldClubIntoOneSeat(){
        new TableLayOutScreen(driver).verifyClubItem();
    }

    @Then ("^I should get back to the Table Layout tab$")
    public void iShouldGetBackToTheTableLayoutTab() throws InterruptedException {
        Assert.assertEquals(new OrdersAndDriversListScreen().verifyTableLayoutTab(),"Table Layout");
    }
    @Then ("^I should see table layout Screen$")
    public void iShouldSeeTableLayoutScreen() throws InterruptedException {
        Assert.assertEquals(new OrdersAndDriversListScreen().verifyTableLayoutTab(),"Table Layout");
    }
    @Then ("^I should see seated status is not change$")
    public void iShouldSeeSeatedStatusIsNotChange(){
        new TableLayOutScreen(driver).verifySeatedStatus();
    }

    @Then ("^I should see check down is increased$")
    public void iShouldSeeCheckDownIsIncreased(){
        new TableLayOutScreen(driver).verifyCheckDownIsIncreased();
    }

    @Then ("^I click Start Over Button to come back original stage$")
    public void iClickStartOverButtonToComeBackOriginalStage(){
        new TableLayOutScreen(driver).clickStartOver();
    }

    @And ("^I click print button in the split seat screen$")
    public void iClickPrintButtonInTheSplitSeatScreen(){
        new TableLayOutScreen(driver).pressPrintInSplitSeat();
    }

    @Then ("^I should see select the seat to print popup$")
    public void iShouldSeeSelectTheSeatToPrintPopup(){
        Assert.assertEquals(new TableLayOutScreen(driver).getSelectTheSeatToPrint(),"Select the Seat to Print");
    }

    @Then ("^I should see Receipt Printer popup$")
    public void iShouldSeeReceiptPrinterPopup(){
        Assert.assertEquals(new TableLayOutScreen(driver).getReceiptPrinterMsg(),"Receipt Printer");
    }

    @Then ("^I should see select any one seat/check for print popup$")
    public void iShouldSeeSelectAnyOneSeatOrCheckForPrintPopup(){
        Assert.assertEquals(new TableLayOutScreen(driver).getSelectAnyOneSeatForPrint(),"select any one seat/check for print");
    }

    @And ("^I click print All button in the split seat screen$")
    public void iClickPrintAllButtonInTheSplitSeatScreen(){
        new TableLayOutScreen(driver).pressPrintAll();
    }

    @And ("^I click print button in the split check screen$")
    public void iClickPrintButtonInTheSplitCheckScreen(){
        new TableLayOutScreen(driver).clickPrintButtonSplitCheck();
    }

    @And("^I click print All Button in the split check screen$")
     public void iClickPrintAllButtonInTheSplitCheckScreen(){
        new TableLayOutScreen(driver).printAllBtn();
    }
    @Then ("^I should see Seat 2 is hide$")
    public void iShouldSeeSeat2IsHide(){
        new TableLayOutScreen(driver).findSeat2();
    }

    @And ("^I click Pay Button in Split Screen$")
    public void iClickPayButtonInSplitScreen(){
        new TableLayOutScreen(driver).pressPayBtn();
    }

    @Then ("^I should see empty seat cannot paid popup$")
    public void iShouldSeeEmptySeatCannotPaidPopup(){
        Assert.assertEquals(new TableLayOutScreen(driver).verifyEmptySeatPopup(),"Empty seat cannot paid");
    }

    @And ("^I click the Exit button in the payment window$")
    public void iClickTheExitButtonInThePaymentWindow(){
        new PaymentWindow(driver).pressExit();
    }

    @Then ("^I should see Select the seat to pay in popup$")
    public void iShouldSeeSelectTheSeatToPayInPopup(){
        Assert.assertEquals(new TableLayOutScreen(driver).getSelectTheSeatToPay(),"Select the Seat to Pay");
    }

    @Then ("^I should see Select any one seat/check for payment in popup$")
    public void iShouldSeeSelectAnyOneSeatCheckForPaymentInPopup(){
        Assert.assertEquals( new TableLayOutScreen(driver).getSelectAnyOneSeatCheckForPaymentMsg(),"select any one seat/check for payment");
    }
    @Then ("^I should see selected seat item should club into seat two$")
    public void iShouldSeeSelectedSeatItemShouldClubIntoSeatTwo(){
        new TableLayOutScreen(driver).verifyTouchAndAdd();
    }

    @And ("^I click the split seat from Order screen$")
    public void iClickTheSplitSeatFromOrderScreen() throws InterruptedException {
        new TableLayOutScreen(driver).pressSplitSeatFromOrder();
    }

    @And ("^I click the split check from Order screen$")
    public void iClickTheSplitCheckFromOrderScreen() throws InterruptedException {
        new TableLayOutScreen(driver).pressSplitCheckFromOrder();
    }
    @And ("^I click cash button from the payment method popup$")
    public void iClickCashButtonFromThePaymentMethodPopup() throws Exception {
        new TableLayOutScreen(driver).pressCashBtnPaymentWindow();
    }

    @Then ("^I should see cash payment is added in payment window$")
    public void iShouldSeeCashPaymentIsAddedInPaymentWindow(){
        Assert.assertEquals(new TableLayOutScreen(driver).verifyCashApplied(),"1. Cash(#1)");
    }
    @Then ("^I should see cash payment is added in payment window as \"([^\"]*)\"$")
    public void iShouldSeeCashPaymentIsAddedInPaymentWindowAs(String name){
        new TableLayOutScreen(driver).verifyCashApplied1(name);
    }
    @Then ("^I should see amount as \"([^\"]*)\"$")
    public void iShouldSeeAmountAs(String name){
        new TableLayOutScreen(driver).verifyCashApplied1(name);
    }
    @And ("^I click other button from the payment method popup$")
    public void iClickOtherButtonFromThePaymentMethodPopup() throws Exception {
        new PaymentWindow(driver).clickOtherBtn();
    }

    @And ("^I click side cc button in the payment window$")
    public void iClickSideCCButtonInThePaymentWindow() throws Exception {
        new PaymentWindow(driver).clickSideCCBtn();
    }

    @Then ("^I should see Split is not allowed no orders in this check$")
    public void iShouldSeeSplitIsNotAllowedNoOrdersInThisCheck(){
        Assert.assertEquals(new TableLayOutScreen(driver).getSplitIsNotAllowedNoOrderInThisCheck(),"Split is not allowed, no order(s) in this check");
    }

    @Then ("^I should see Split is not allowed payment in this check$")
    public void iShouldSeeSplitIsNotAllowedPaymentInThisCheck(){
        Assert.assertEquals(new TableLayOutScreen(driver).getSplitIsNotAllowedPaymentInThisCheck(),"Split is not allowed, payment(s) has been made in this check");
    }
    @And ("^I click the Operation button on the Table Layout$")
    public void iClickTheOperationButtonOnTheTableLayout(){
        new TableLayOutScreen(driver).pressOperation();
    }

    @Then ("^I should see operation screen$")
    public void iShouldSeeOperationScreen(){
        new TableLayOutScreen(driver).getOperationScene();
    }

    @And ("^I click close day tab$")
    public void iClickCloseDayTab(){
        new TableLayOutScreen(driver).tapCloseDay();
    }
    @Then ("^I should see close day screen$")
    public void iShouldSeeCloseDayScreen(){
        new TableLayOutScreen(driver).verifyCloseDayScreen();
    }

    @Then ("^I should see credit card value$")
    public void iShouldSeeCreditCardValue(){
        new TableLayOutScreen(driver).getCreditCardValue();
    }

    @And ("^I click Void button on order management screen$")
    public void iClickVoidButtonOnOrderManagementScreen(){
        new OrderManagementScreen(driver).pressVoidBtn();
    }

    @Then ("^I should see payment made on this check popup message$")
    public void iShouldSeePaymentMadeOnThisCheckPopupMessage(){
        Assert.assertEquals(new OrderManagementScreen(driver).getPaymentMadeOnThisCheck(),"Payment(s) made on this check,Can you return this to Walkin");
    }

    @Then ("^I should see payment made on this check popup message for house account$")
    public void iShouldSeePaymentMadeOnThisCheckPopupMessageForHouseAccount(){
        Assert.assertEquals(new OrderManagementScreen(driver).getPaymentMadeOnThisCheckHouseAccount(),"Payment(s) made on this check,Can you return this to Auto ragav");
    }


    @Then ("^I should see All orders are voided$")
    public void iShouldSeeAllOrdersAreVoided(){
        Assert.assertEquals(new OrderManagementScreen(driver).getAllOrdersAreVoidedMsg(),"All orders are voided");
    }

    @Then ("^I should see the void reason popup$")
    public void iShouldSeeTheVoidReasonPopup(){
        Assert.assertEquals(new OrderManagementScreen(driver).getVoidReasonPopup(),"Void Reason");
    }
    @And ("^I click void Reason on the void popup$")
    public void iClickVoidReasonOnTheVoidPopup(){
        new OrderManagementScreen(driver).selectOrderedWrongly();
    }

    @And ("^I click Add Button on the void reason popup$")
    public void iClickAddButtonOnTheVoidReasonPopup(){
        new OrderManagementScreen(driver).pressAddVoidReasonBtn();
    }

    @Then ("^I should see that OrderScreen with Merge seats as \"([^\"]*)\"$")
    public void iShouldSeeThatOrderScreenWithMergeSeatsAs(String seat){
        new TableLayOutScreen(driver).verifyAllSeatIsMerged(seat);
    }
    @And ("^I click Search Button on the Order Screen$")
    public void iClickSearchButtonOnTheOrderScreen(){
        new OrderManagementScreen(driver).pressSearch();
    }
    @Then ("^I should see search field on the Order screen$")
    public void iShouldSeeSearchFieldOnTheOrderScreen(){
        new OrderManagementScreen(driver).verifySearchField();
    }
    @Then ("^I should see Tick mark in the Menu item$")
    public void iShouldSeeTickMarkInTheMenuItem(){
        new OrderManagementScreen(driver).verifyTickIcon();
    }
    @And ("^I click No thanks Button on the print receipt$")
    public void iClickNoThanksButtonOnThePrintReceipt(){
        new TableLayOutScreen(driver).pressNoThanks();
    }

    @And ("^I click Order List with Menu item as \"([^\"]*)\"$")
    public void iClickOrderListWithMenuItemAs(String Name){
        new OrderManagementScreen(driver).pressOrderListWithSale(Name);
    }

    @Then ("^I should see do you want to send hold menu items to kitchen popup message$")
    public void iShouldSeeDoYouWantToSendHoldMenuItemsToKitchenPopupMessage(){
        Assert.assertEquals(new OrderManagementScreen(driver).getdoYouWantToSendHoldMenuItemToKitchenMsg(),"Do you want to send hold menu item(s) to kitchen?");
    }
    @And ("^I click Yes button on the popup for Hold item$")
    public void iClickYesButtonOnThePopupForHoldItem(){
        new OrderManagementScreen(driver).pressYesForHold();
    }


    /******************* ORDER SCREEN ************************************/

    @And ("^I click huge amount for complete sale$")
    public void iClickHugeAmountForCompleteSale(){
        new PaymentWindow(driver).pressTL100();
    }
    @Then ("^I should see change Due popup$")
    public void iShouldSeeChangeDuePopup(){
        Assert.assertEquals(new PaymentWindow(driver).getChangeDueMsg(),"Change Due");
    }

    @And ("^I enter huge amount than Menu item price$")
    public void iEnterHugeAmountThanMenuItemPrice(){
        new PaymentWindow(driver).enterHugePayment();
    }
    @And ("^I click table number on the Order Screen as \"([^\"]*)\"$")
    public void iClickTableNumberOnTheScreen(String table_no){
        new OrderManagementScreen(driver).pressTableNumber(table_no);
    }

    @Then ("^I should see cannot add modifiers popup$")
    public void iShouldSeeCannotAddModifiersPopup(){
        Assert.assertEquals(new OrderManagementScreen(driver).verifyCannotAddModifierTxt(),"Cannot add modifiers, item already send to kitchen");
    }
    @Then ("^I should see You need to order before you paying popup$")
    public void iShouldSeeYouNeedToOrderBeforeYouPayingPopup(){
        Assert.assertEquals(new OrderManagementScreen(driver).getYouNeedToOrderBeforeYouPayMsg(),"Order Item Before Paying");
    }
    @And ("^I click payment in the payment window$")
    public void iClickPaymentInThePaymentWindow(){
        new PaymentWindow(driver).selectPayment();
    }

    @And ("^I click payment for all seat in the payment window$")
    public void iClickPaymentForAllInThePaymentWindow(){
        new PaymentWindow(driver).selectPayment1();
    }

    @And ("^I click Ok button in receipt printer popup$")
    public void iClickOkButtonInReceiptPrinterPopup(){
        new PaymentWindow(driver).pressOKBtnPopup();
    }

    @Then ("^I should see device offline popup$")
    public void iShouldSeeDeviceOfflinePopup(){
        new PaymentWindow(driver).verifyOfflinePopup();
    }
    @And ("^I click Delete button on the payment window$")
    public void iClickDeleteButtonOnThePaymentWindow(){
        new PaymentWindow(driver).pressDeletePaymentBtn();
    }
    @And ("^I click Adjust button in the payment window$")
    public void iClickAdjustButtonInThePaymentWindow(){
        new PaymentWindow(driver).pressAdjustBtn();
    }

    @And ("^I click Adjust button in the payment window after Payment$")
    public void iClickAdjustButtonInThePaymentWindowAfterPayment(){
        new PaymentWindow(driver).pressAdjustBtnForPayment();
    }
    @Then ("^I should see No more payment needed popup$")
    public void iShouldSeeNoMorePaymentNeededPopUp(){
        new OrderManagementScreen(driver).getNoMorePaymentNeedPopup();
    }
    @Then ("^I should see No more payment needed popup from Payment window$")
    public void iShouldSeeNoMorePaymentNeededPopUpFromPaymentWindow(){
        new OrderManagementScreen(driver).getNoMorePaymentNeed1Popup();
    }

    @Then ("^I should see Cash payment is deleted$")
    public void iShouldSeeCashPaymentIsDeleted(){
        new PaymentWindow(driver).verifyCashGotDel();
    }
    @Then ("^I should see select payment and try again popup$")
    public void iShouldSeeSelectPaymentAndTryAgainPopUp(){
        Assert.assertEquals(new PaymentWindow(driver).getSelectAnyPaymentAndTryAgainMsg(),"Select a Payment and try again!");
    }
    @Then ("^I should see Balance Due on the payment window$")
    public void iShouldSeeBalanceDueOnThePaymentWindow(){
        new PaymentWindow(driver).verifyBalanceDue();
    }
    @And ("^I click Exact button on the payment pop-up$")
    public void iClickExactButtonOnThePaymentPopup(){

    }
    @Then ("^I should see No Due on the Payment window$")
    public void iShouldSeeNoDueOnThePaymentWindow(){
        new PaymentWindow(driver).verifyNoDue();
    }

    @And ("^I click amount by manually$")
    public void iClickAmountByManually(){
        new ClockInScreen(driver).priceFrenchFries();
    }
    @And ("^I click partial amount from the payment window$")
    public void iClickPartialAmountFromThePaymentWindow(){
        new PaymentWindow(driver).pressTl10();
    }
    @Then ("^I should see please pay amount$")
    public void iShouldSeePleasePayAmount(){
        Assert.assertEquals(new PaymentWindow(driver).getPleasePayAmountMsg(),"Linga Payment");
    }
    @Then ("^I should see please pay amount for One seat$")
    public void iShouldSeePleasePayAmountForOneSeat(){
        Assert.assertEquals(new PaymentWindow(driver).getPleasePayAmountMsg1(),"Linga Payment");
    }
    @And ("^I click huge amount for complete payment by manually$")
    public void iClickHugeAmountForCompletePaymentByManually(){
        new ClockInScreen(driver).enterHugePayment();
    }

    @And ("^I enter the payment value as \"([^\"]*)\"$")
    public void iEnterThePaymentValueAs(String value){
        new ClockInScreen(driver).enterManualPayment(value);
    }
    @And ("^I click total payment by manually 2 seat$")
    public void iClickTotalPaymentByManually2Seat(){
        new ClockInScreen(driver).enterFrenchFrieseAmount();
    }

    @And("^I click total payment by manually 3 seat$")
    public void iClickTotalPaymentByManually3Seat(){
        new ClockInScreen(driver).enterFrenchFrieseAmount3seat();
    }
    @Then ("^I should see modifier screen$")
    public void iShouldSeeModifierScreen(){
        Assert.assertEquals(new OrderManagementScreen(driver).getModifierScreen(),"Modifiers");
    }
    @And ("^I click modifier as \"([^\"]*)\" on modifier screen$")
    public void iClickModifier(String modifier_1){
        new OrderManagementScreen(driver).selectModifierInModifierScreen(modifier_1);
    }

    @And ("^I click Ok button on the modifier screen$")
    public void iClickOkButtonOnTheModifierScreen(){
        new PaymentWindow(driver).pressOkButton();
    }

    @And ("^I should see selected Modifier as Butter$")
    public void iShouldSeeSelectedModifierAsButter(){
        new OrderTypeWindow(driver).verifyModifierInOrderList();
    }
    @And ("^I click modifier as \"([^\"]*)\" Maximum time$")
    public void iClickModifierAsMaximumTime(String maxModify){
        new OrderManagementScreen(driver).selectModifierForMoreTime(maxModify);
    }
    @Then ("^I should see modifiers added in the Selected modifiers as \"([^\"]*)\"$")
    public void iShouldSeeModifiersAddedInTheSelectedModifiersAs(String name){
        new TableLayOutScreen(driver).selectModifiersFromModifyScreen(name);
    }
    @And ("^I touch and swipe the modifiers$")
    public void iTouchAndSwipeTheModifiers() throws InterruptedException {
        new TableLayOutScreen(driver).swipeTheModifiers();
    }

    @And ("^I click delete button for delete modifiers$")
    public void iClickDeleteButtonForDeleteModifiers(){
        new TableLayOutScreen(driver).clickDeleteBtn();
    }
    @And ("^I click new check button on the Table layout screen$")
    public void iClickNewCheckButtonOnTheTableLayoutScreen(){
        new TableLayOutScreen(driver).pressNewCheckButton();
    }
    @Then ("^I should see as \"([^\"]*)\" on the order screen$")
    public void iShouldSeeAsOnTheOrderScreen(String seatNo){
        new OrderManagementScreen(driver).seatWithOrderScreen(seatNo);
    }
    @Then ("^I should see mulitiple check change on Table layout screen$")
    public void iShouldSeeMultipleCheckChangeOnTableLayoutScreen(){
        new TableLayOutScreen(driver).mulitpleCheckVisible();
    }
    @And ("^I select check for complete sale$")
    public void iSelectCheckForCompleteSale() throws Exception {
        new TableLayOutScreen(driver).closeTheChecks1();
        new OrderManagementScreen(driver).pressPayment();
        new TableLayOutScreen(driver).pressCashBtnPaymentWindow();
        new PaymentWindow(driver).pressSubmitBtn();
    }


    @Then ("^I should see menu items has to be sent to the kitchen$")
    public void iShouldSeeMenuItemsHasToBeSentToKitchen(){
        Assert.assertEquals(new TableLayOutScreen(driver).MenuItemHasToSentKitchen(),"Menu items(s) has to be sent to the kitchen");
    }
    @Then ("^I should see item need to send to kitchen popup$")
    public void iShouldSeeItemNeedToSendToKitchenPopup(){
        Assert.assertEquals(new TableLayOutScreen(driver).getItemsNeedToSendToKitchen(),"item(s) need to send to kitchen");
    }
    /***************** Check Stats **************************************/

    @And ("^I click reopen check button on the check stats screen$")
    public void iClickReopenCheckButtonOnTheCheckStatsScreen(){
        new OrdersAndDriversListScreen().pressReopenCheckStatsBtn();
    }
    @And ("^I click Closed tab on the Check stats$")
    public void iClickClosedTabOnTheCheckStats(){
        new OrdersAndDriversListScreen().pressClosedCheck();
    }


    @And ("^I click the Closed check as \"([^\"]*)\"$")
    public void iClickTheClosedCheck(String num) throws Exception {
        new CheckStatusScreen(driver).selectCloseCheck4(num);
    }

    @And ("^I pass menu item to search and click the menu item as \"([^\"]*)\"$")
    public void iPassMenuItemToSearchAndClickTheMenuItem(String menu_item){
        new OrderManagementScreen(driver).selectMenuItemSearch(menu_item);
    }
    @Then ("^I should see no menu item found text$")
    public void iShouldSeeNoMenuItemFoundText(){
        Assert.assertEquals(new OrderManagementScreen(driver).verifyNoMenuItemFoundTxt(),"______ NO MENU ITEMS FOUND IN \"PAROTTAS\" ______");
    }
    @Then ("^I should see menu item added into Order list$")
    public void iShouldSeeMenuItemAddedIntoOrderList(){
        new OrderManagementScreen(driver).getOrderList();
        new OrderTypeWindow(driver).verifySearchSaleAdded();
    }
    @And ("^I click the arrow button in the Merge Box$")
    public void iClickTheArrowButtonInTheMergeBox(){
        new TableLayOutScreen(driver).pressMergeSlider();
    }
    @And ("^I click the arrow button in the Merge Box1$")
    public void iClickTheArrowButtonInTheMergeBox1(){
        new TableLayOutScreen(driver).pressMergeSlider1();
    }

    @Then ("^I should see transaction void successful popup$")
    public void iShouldSeeTransactionVoidSuccessfulPopup(){
        new PaymentWindow(driver).verifyTransactionVoidSuccess();
    }

    @And ("^I click cancel button on the table layout screen$")
    public void iClickCancelButtonOnTheTableLayoutScreen(){
        new TableLayOutScreen(driver).clickCancelBtn();
    }

    @Then("^I should see the serving size screen$")
    public void iShouldSeeTheServingSizeScreen() throws IOException {
        new OrderManagementScreen(driver).verifyServingSize();
    }

    @And ("^I get the serving size$")
    public void iGetTheServingSize(){
        new OrderManagementScreen(driver).getServingSize();
    }

    @Then ("^I should see the serving size cell$")
    public void iShouldSeeTheServingSizeCell(){
        new OrderManagementScreen(driver).verifySizeCell();

    }
    @And ("^I click prefix modifier$")
    public void iClickPrefixModifier(){
        new OrderManagementScreen(driver).clickPrefixModifierBtn();
    }

    @And ("^I click Mandatory Modifier in conversational screen$")
    public void iClickMandatoryModifierInConversationalScreen(){
        new OrderManagementScreen(driver).clickModifierFromConversationalScreen();
    }

    @Then ("^I should see Mandatory Modifier in conversational screen$")
    public void iShouldSeeMandatoryModifierInConversationalScreen(){
        new OrderManagementScreen(driver).verifyMandatoryModifierFromConversationalScreen();
    }
    @Then ("^I should see cancel button is enable$")
    public void iShouldSeeCancelButtonIsEnable(){
        new OrderManagementScreen(driver).verifyCancelBtnIsEnable();
    }
    @Then ("^I should see start over button is enable$")
    public void iShouldSeeStartOverButtonIsEnable(){
        new OrderManagementScreen(driver).verifyStartOverBtnIsEnable();
    }
    @Then ("^I should see done button is enable$")
    public void iShouldSeeDoneButtonIsEnable(){
        new OrderManagementScreen(driver).verifyDoneBtnIsEnable();
    }

    @Then ("^I should see include modifier added with menu item$")
    public void iShouldSeeIncludeModifierAddedWithMenuItem(){
        new OrderManagementScreen(driver).verifyIncludeModifierIsAdded();
    }

    @And ("^I click start over button in coversational modifier screen$")
    public void iClickStartOverButtonInConversationalModifierScreen(){
        new OrderManagementScreen(driver).clickStartOverInConversational();
    }

    @And ("^I click include modifier in conversational screen$")
    public void iClickIncludeModifierInConversationalScreen(){
        new OrderManagementScreen(driver).clickInculdeModifier();
    }

    @And ("^I click alternate modifier button in conversational modifier screen$")
    public void iClickAlternateModifierButtonInConversationalModifierScreen(){
        new OrderManagementScreen(driver).clickAlternateModifierScreen();
    }

    @Then ("^I should see alternate modifier screen$")
    public void iShouldSeeAlternateModifierScreen(){
        new OrderManagementScreen(driver).verifyAlternateModifierScreen();
    }
    @And ("^I click modifier from alternate modifier screen$")
    public void iClickModifierFromAlternateModifierScreen(){
        new OrderManagementScreen(driver).clickModifierFromAlternateModifierScreen();
    }
    @And ("^I click ok button in alternate modifier screen$")
    public void iClickOkButtonInAlternateModifierScreen(){
        new OrderManagementScreen(driver).clickOkBtnInAlternateModifierScreen();
    }

    @Then ("^I should see include modifier in conversational modifier screen$")
    public void iShouldSeeIncludeModifierInConversationalModifierScreen(){
        new OrderManagementScreen(driver).verifyIncludeModifier();
    }

    @And ("^I click Revert button in alternate modifier screen$")
    public void iClickRevertButtonInAlternateModifierScreen(){
        new OrderManagementScreen(driver).clickRevertButton();
    }

    @Then ("^I should see cannot remove customer for delivery popup$")
    public void iShouldSeeCannotRemoveCustomerForDeliveryPopup(){
        Assert.assertEquals(new OrderManagementScreen(driver).verifyCannotRemoveCustomer(),"Cannot remove customer for Delivery");
    }
    @Then ("^I should see modifier added with menu item$")
    public void iShouldSeeModifierAddedWithMenuItem(){
        new OrderManagementScreen(driver).verifyModifierAddedWithMenu();
    }

    @Then ("^I should see Mandatory Modifier in conversational screen with count of maximum and minimum$")
    public void iShouldSeeMandatoryModifierInConversationalScreenWithCountOfMaximumAndMinimum(){
        new OrderManagementScreen(driver).verifyMaximumAndMinimumCount();
    }

    @Then("^I should see you need to pick atleast 1 modifiers from this group popup$")
    public void iShouldSeeYouNeedToPickAtleast1ModifiersFromThisGroupPopup(){
        Assert.assertEquals(new OrderManagementScreen(driver).verifyYouNeedToPickAtleastModifierFromThisGroup(),"You need to pick at least 1 modifiers from this Group");
    }

    @And ("^I do split seat$")
    public void iDoSplitSeat(){
        new Regression(driver).doSplitAction();
    }

    @And ("^I select the menu item for Split Evenly$")
    public void iSelectTheMenuItemForSplitEvenly(){
        new Regression(driver).selectMenuForSplitEvenly();
    }
    @And ("^I select the menu item for Split")
    public void iSelectTheMenuItemForSplit(){
        new Regression(driver).selectMenuForSplitAction();
    }

    @And ("^I select the menu item for Seperate item as \"([^\"]*)\"$")
    public void iSelectTheMenuItemForSeperateITemAs(String number){
        new Regression(driver).splitSeperateItem(number);
    }

    @And ("^I select the menu item for group seat$")
    public void iSelectTheMenuItemForGroupSeat(){
        new Regression(driver).selectMenuForGroupSeat();
    }

    @And ("^I open the active check do split$")
    public void iOpenTheActiveCheckDoSplit(){
        new Regression(driver).openTheCheckByTableNum();
    }

    @And ("^I make the sale for new user$")
    public void iMakeTheSaleForNewUser() throws Exception {
        new Regression(driver).makeSaleForNewUser();
    }

    @And ("^I select the menu for QSR$")
    public void iSelectTheMenuForQsr(){
        new Regression(driver).selectMenuForQSR();
    }

    @And ("^I select Menu For Dine In$")
    public void iSelectMenuForDineIn(String cate) throws Exception {
        new Regression(driver).selectMenuForDineIn(cate);
    }

    @And ("^I select Menu For Dine In1$")
    public void iSelectMenuForDineIn1() throws InterruptedException {
        new Regression(driver).selectMenuForDineIn1();
    }

    @And ("^I do group seat$")
    public void iDoGroupSeat(){
        new Regression(driver).dogroupSeat();
    }

    @And("^I select the Menu")
    public void iSelectTheMenu(){
        new Regression(driver).selectMenu();
    }

    @And ("^I click Merge button for multi$")
    public void iClickMergeButtonForMulti(){
        new Regression(driver).doMerge();
    }

    @And ("^I do merge$")
    public void iDoMerge() throws InterruptedException {
        new Regression(driver).mergeAction1();
    }

    @And ("^I select Menu For Dine Merge$")
    public void iSelectMenuForDineMerge() throws Exception {
        new Regression(driver).selectMenuForDineInMerge();
    }

    @And ("^I select Menu For Basic validation as \"([^\"]*)\"$")
    public void iSelectMenuForBasicValidationAs(String cate) throws Exception {
        new Regression(driver).selectMenuForBasicValidation(cate);
    }

    @And ("^I select Menu For Basic validation2 as \"([^\"]*)\"$")
    public void iSelectMenuForBasicValidation2As(String cate){
        new Regression(driver).selectMenuCloudPOSSs(cate);
    }


    @And ("^I get the total of menu item in order screen$")
    public void iGetTheTotalOfMenuItemInOrderScreen(){
        new OrderManagementScreen(driver).getTotalOfMenuInOrderscreen();
    }

    @And ("^I get the menu from the order screen$")
    public void iGetTheMenuFromTheOrderScreen(){
        new OrderManagementScreen(driver).getTheMenuInTheOrderScreen();
    }
    @And("^I select Menu of Basic validation for QSR as \"([^\"]*)\"")
    public void iSelectMenuOfBasicValidationForQsrAs(String cate) throws Exception {
        new Regression(driver).selectMenuBasicValidationForQsr(cate);
    }

    @When ("^I click batch/Tip adjustment button$")
    public void iClickBatchTipAdjustmentButton(){
        new TableLayOutScreen(driver).clickBatchTipButton();
    }

    @And ("^I click the device drop down button on the batch screen$")
    public void iClickTheDeviceDropDownButtonOnTheBatchScreen() throws InterruptedException {
        new TableLayOutScreen(driver).clickDeviceDropDownButtonBatchScreen();
    }

    @Then ("^I should see the list of checks in batch screen$")
    public void iShouldSeeTheListOfChecksInBatchScreen(){
        new TableLayOutScreen(driver).verifyChecksInBatchScreen();
    }
    @Then ("^I should see batch has been initiated popup$")
    public void iShouldSeeBatchHasBeenInitiatedPopup(){
        new TableLayOutScreen(driver).verifyBatchInitiatedPopup();
    }

    @And ("^I select the MPPG Payment name in the device list$")
    public void iSelectTheMppgPaymentNameInTheDeviceList() throws Exception {
        new TableLayOutScreen(driver).selectTheMppgPaymentInDevice();
    }

    @Then("^I should see last batch started text$")
    public void iShouldSeeLastBatchStartedText() throws Exception {
        new TableLayOutScreen(driver).verifyLastBatchStartedText();
    }

    @When ("^I click the check from batch screen$")
    public void iClickTheCheckFromBatchScreen(){
        new TableLayOutScreen(driver).clickTheCheckFromBatchScreen();
    }

    @When ("^I click the check from batch screen1$")
    public void iClickTheCheckFromBatchScreen1(){
        new TableLayOutScreen(driver).clickTheCheckFromBatchScreen1();
    }

    @And ("^I change tip amount in batch screen$")
    public void iChangeTipAmountInBatchScreen(){
        new TableLayOutScreen(driver).changeTipAmount();
    }

    @And ("^I change tip amount in batch screen1$")
    public void iChangeTipAmountInBatchScreen1(){
        new TableLayOutScreen(driver).changeTipAmount1();
    }

    @Then ("^I should see invalid tip amount popup$")
    public void iShouldSeeInvalidTipAmountPopup(){
        new TableLayOutScreen(driver).shouldSeeInvalidTipAmountPopup();
    }

    @Then ("^I should see tip Amount is applied or not$")
    public void iShouldSeeTipAmountIsAppliedOrNot(){
        new TableLayOutScreen(driver).VerifyTipAmountIsAppliedOrNot();
    }

    @And ("^I have make sale for batch as \"([^\"]*)\"$")
    public void iHaveMakeSaleForBatchAs(String cate) throws Exception {
        new Regression(driver).makeSaleForBatchInPhoneStore(cate);
    }

    @Then ("^I have verify check in the batch screen$")
    public void iHaveVerifyCheckInTheBatchScreen() throws InterruptedException {
        new Regression(driver).verifyBatchCheckAvailable();
    }

    @And ("^I do batch for vourl as \"([^\"]*)\"$")
    public void iDoBatchForVourl(String cate) throws Exception {
        new Regression(driver).doBatchForVourl(cate);
    }

    @And ("^I get value the menu values from order screen$")
    public void iGetValueTheMenuValuesFromOrderScreen(){
        new Regression(driver).getMenuValues();
    }

    @And ("^I get order screen value the menu values from order screen$")
    public void iGetOrderScreenValueTheMenuValuesFromOrderScreen(){
        new Regression(driver).getOrderScreenMenuValues();
    }

    @And ("^I get order screen value the menu values from order screen1$")
    public void iGetOrderScreenValueTheMenuValuesFromOrderScreen1(){
        new Regression(driver).getOrderScreenMenuValues1();
    }

    @And ("^I get value the menu values from order screen1$")
    public void iGetValueTheMenuValuesFromOrderScreen1(){
        new Regression(driver).getMenuValues1();
    }

    @When ("^I verify the menu after merge done$")
    public void iVerifyTheMenuAfterMergeDone(){
        new Regression(driver).verifyMenuAfterMergeDone();
    }

    @When ("^I verify the menu prize after merge done$")
    public void iVerifyTheMenuPrizeAfterMergeDone(){
        new Regression(driver).verifyTheMenuPrizeAfterMergeDone();
    }

    @When ("^I verify the menu prize after merge done for bartab only$")
    public void iVerifyTheMenuPrizeAfterMergeDoneForBarTabOnly(){
        new Regression(driver).verifyTheMenuPrizeAfterMergeDoneForBarTabOnly();
    }
    @When ("^I verify the menu prize after merge done for check based amount$")
    public void iVerifyTheMenuPrizeAfterMergeDoneForCheckBasedAmount(){
        new Regression(driver).verifyTheMenuPrizeAfterMergeDoneForCheckBasedAmount();
    }
    @When ("^I validate the menu values in the order screen$")
    public void iValidateTheMenuValuesInTheOrderScreen(){
        new Regression(driver).validateTheMenuValueInOrderScreen();
    }

    @When ("^I click the check from the table layout$")
    public void iClickTheCheckFromTheTableLayout() throws InterruptedException {
        new Regression(driver).selectTheCheckFromTableLayout();
    }

    @When ("^I click the check from the table layout for merged$")
    public void iClickTheCheckFromTheTableLayoutForMerged() throws InterruptedException {
        new Regression(driver).clickTheCheckFromTheTableLayoutForMerged();
    }

    @Then ("^I should see on merging the particular checks popup$")
    public void iShouldSeeOnMergingTheParticularCheckPopup(){
        new TableLayOutScreen(driver).ShouldSeeOnMergingTheParticularCheckPopup();
    }

    @Then("^I should see merge checks confirmation popup$")
    public void iShouldSeeMergeChecksConfirmationPopup(){
        new TableLayOutScreen(driver).mergeCheckConfirmationPopup();
    }

    @And ("^I click confirm button on the merge check confirmation popup$")
    public void iClickConfirmButtonOntheMergeCheckConfirmationPopup(){
        new TableLayOutScreen(driver).clickConfirmButton();
    }
    @When ("^I click the check from the table layout for merged1$")
    public void iClickTheCheckFromTheTableLayoutForMerged1() throws InterruptedException {
        new Regression(driver).clickTheCheckFromTheTableLayoutForMerged1();
    }
    @Then ("^I should see the Split check screen$")
    public void iShouldSeeTheSplitCheckScreen(){
        new Regression(driver).verifySplitCheckScren();
    }

    @When ("^I verify the Active check with split check$")
    public void iVerifyTheActiveCheckWithSplitCheck(){
        new Regression(driver).verifyActiveCheckWithSplitCheck();
    }

    @And ("^I click Add Button on the split check screen$")
    public void iClickAddButtonOnTheSplitCheckScreen(){
        new Regression(driver).clickAddButtonOntheSplitCheckScreen();
    }

    @Then ("^I should see new check added on the split check screen$")
    public void iShouldSeeNewCheckAddedOnTheSplitCheckScreen(){
        new Regression(driver).VerifyNewCheckAddedOnTheSplitCheckScreen();
    }

    @And ("^I click the menu on the split check screen$")
    public void iClickTheMenuOnTheSplitCheckScreen(){
        new Regression(driver).ClickTheMenuOnTheSplitCheckScreen();
    }

    @And("^I click the menu on the split seat screen$")
    public void iClickTheMenuOnTheSplitSeatScreen(){
        new Regression(driver).ClickTheMenuOnTheNewSplitSeatScreen();
    }

    @And ("^I click new check added on the split check screen$")
    public void iClickNewCheckAddedOnTheSplitCheckScreen(){
        new Regression(driver).clickNewCheckOnTheSplitCheckScreen();
    }

    @When ("^I verify the menu is moved to the added check seat$")
    public void iVerifyTheMenuIsMovedToTheAddedCheckSeat(){
    new Regression(driver).verifyTheMenuIsMovedToTheAddedCheckSeat();
    }

    @Then ("^I should see please save all the changes to print popup$")
    public void iShouldSeePleaseSaveAllTheChangesToPrintPopup(){
        new Regression(driver).verifyThePleaseSaveAlltheChangesToPrintPopup();
    }

    @When ("^I verify the check is splitted and check number is increased$")
    public void iVerifyTheCheckIsSplittedAndCheckNumberIsIncreased(){
        new Regression(driver).verifyCheckNumberIsSplittedAndCheckNumberIsIncreased();
    }

    @When ("^I verify primary check is opened after split check is done$")
    public void iVerifyPrimaryCheckIsOpenedAfterSplitCheckIsDone(){
        new Regression(driver).verifyPrimaryCheckIsOpened();
    }

    @And ("^I click split by seat in the split check screen$")
    public void iClickSplitBySeatInTheSplitCheckScreen(){
        new TableLayOutScreen(driver).clickSplitBySeatInSplitCheck();
    }

    @Then ("^I should see seat available in the split check$")
    public void iShouldSeeSeatAvailableInTheSplitCheck(){
        new TableLayOutScreen(driver).verifySeatsAvaliableInSplitCheck();
    }

    @Then ("^I should see seat available in the split check1$")
    public void iShouldSeeSeatAvailableInTheSplitCheck1(){
        new TableLayOutScreen(driver).verifySeatsAvaliableInSplitCheck1();
    }

    @When ("^I verify the splitted check is available in active checks tab$")
    public void iVerifyTheSplittedCheckIsAvailableInActiveCheckTab(){
        new TableLayOutScreen(driver).verifySplittedCheckAvailableInActiveCheck();
    }

    @And ("^I click split button on the bartab screen$")
    public void iClickSplitButtonOnTheBartabScreen(){
        new BarTabScreen(driver).clickSplitBtn();
    }

    @When ("^I click the check from the bartab screen$")
    public void iClickTheCheckFromTheBartabScreen(){
        new BarTabScreen(driver).clickTheCheckFromTheBartabScreen();
    }

    @When ("^I click the check from the bartab screen for merge$")
    public void iClickTheCheckFromTheBartabScreenForMerge(){
        new BarTabScreen(driver).clickTheCheckFromTheBarTabScreenForMerge();
    }
    @When ("^I click the check from the bartab screen1 for merge$")
    public void iClickTheCheckFromTheBartabScreen1ForMerge(){
        new BarTabScreen(driver).clickTheCheckFromTheBartabScreenForMerge1();
    }

    @Then ("^I should verify menu is splitted evenly$")
    public void iShouldVerifyMenuIsSplittedEvenly(){
        new TableLayOutScreen(driver).verifyMenuIsSplittedEvenly();
    }

    @When ("^I verify all menu is club into single seat after click group seat$")
    public void iVerifyAllMenuIsClubIntoSingleSeatAfterClickGroupSeat(){
        new TableLayOutScreen(driver).verifyAllMenuIsClubIntoSingleSeat();
    }

    @And ("^I verify seat 1 prize and seat 2 prize is same$")
    public void iVerifySeat1PrizeAndSeat2PrizeIsSame(){
        new TableLayOutScreen(driver).verifySeat1PrizeAndSeat2PrizeIsSame();
    }

    @And ("^I get seat 1 prize details$")
    public void iGetSeat1PrizeDetails(){
        new TableLayOutScreen(driver).getSeat1Prize();
    }

    @And ("^I get seat 2 prize details$")
    public void iGetSeat2PrizeDetails(){
        new TableLayOutScreen(driver).getSeat2Prize();
    }

    @And ("^I verify prize details after group seats done$")
    public void iVerifyPrizeDetailsAfterGroupSeatsDone(){
        new TableLayOutScreen(driver).verifyPrizeDetailsAfterGroupSeats();
    }

    @And ("^I get menu details from the group seat 2$")
    public void iGetMenuDetailsFromTheGroupSeat2(){
        new TableLayOutScreen(driver).getMenuDetailsGroupSeat2();
    }

    @And ("^I verify split seat prize with order screen prize$")
    public void iVerifySplitSeatPrizeWithOrderScreenPrize(){
        new TableLayOutScreen(driver).verifySplitSeatPrizeWithOrderScreenPrize();
    }


    @When ("^I verify split seat menu with order screen menu$")
    public void iVerifySplitSeatMenuWithOrderScreenMenu(){
        new TableLayOutScreen(driver).verifySplitMenuWithOrderScreenMenu();
    }

    @When ("^I verify the seat 1 order screen menu with 1st check menu$")
    public void iVerifyTheMenuWithSeat1(){
        new TableLayOutScreen(driver).verifyTheSeat1MenuWith1stCheck();
    }

    @When ("^I verify the seat 2 order screen menu with 2nd check menu$")
    public void iVerifyTheMenuWithSeat2(){
        new TableLayOutScreen(driver).verifyTheSeat2MenuWith1stCheck();
    }

    @And ("^I click table number on the order screen$")
    public void iClickTableNumberOnTheOrderScreen(){
        new TableLayOutScreen(driver).clickTableNumberOnTheOrderScreen();
    }

    @Then ("^I should verify the gratuity value after add auto gratuity value as \"([^\"]*)\"$")
    public void iShouldVerifyTheGratuityValueAfterAddAutoGratuityValueAs(String value){
        new TableLayOutScreen(driver).verifyGratuityValueAfterAddAutoGratuity(value);
    }

    @When ("^I verify seat as paid$")
    public void iVerifySeatAsPaid(){
        new TableLayOutScreen(driver).verifySeatAsPaid();
    }

    @Then ("^I should see the merged popup$")
    public void iShouldSeeTheMergedPopup(){
        new TableLayOutScreen(driver).verifyTheMergedPopup();
    }

    @And ("^I created sale for Cashier out1 as \"([^\"]*)\"$")
    public void iCreatedSaleForCashierOut1As(String cashier) throws Exception {
        new Regression(driver).createdSaleForCashierOut1(cashier);
    }
    @And ("^I created sale for Cashier out2 as \"([^\"]*)\"$")
    public void iCreatedSaleForCashierOut2As(String cashier) throws Exception {
        new Regression(driver).createdSaleForCashierOut2(cashier);
    }
    @And ("^I created sale for Cashier out3 as \"([^\"]*)\"$")
    public void iCreatedSaleForCashierOut3As(String cashier) throws Exception {
        new Regression(driver).createdSaleForCashierOut3(cashier);
    }
    @And ("^I created sale for Cashier out4 as \"([^\"]*)\"$")
    public void iCreatedSaleForCashierOut4As(String cashier) throws Exception {
        new Regression(driver).createdSaleForCashierOut4(cashier);
    }

    @And ("^I created sale for Cashier out5 as \"([^\"]*)\"$")
    public void iCreatedSaleForCashierOut5As(String cashier,String cate) throws Exception {
        new Regression(driver).createdSaleForCashierOut5(cashier);
    }

    @And ("^I select the random table from the table layout$")
    public void iSelectTheRandomTableFromTheTableLayout() throws Exception {
        new Regression(driver).selectTheRandomTableFromTheTableLayout();
    }


    @And("I click new seat added on the split seat screen")
    public void iClickNewSeatAddedOnTheSplitSeatScreen() {
        new Regression(driver).clickNewSeatOnTheSplitSeatScreen();
    }
}
