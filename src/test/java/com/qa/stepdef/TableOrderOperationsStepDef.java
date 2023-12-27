package com.qa.stepdef;


import com.qa.pages.*;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;


public class TableOrderOperationsStepDef {

    @And ("^I click right symbol$")
    public void iClickRightSymbol(){
        new TableLayOutScreen().clickRightBtn();
    }
    @Then ("^I should see next floor$")
    public void iShouldSeeNextFloor(){
        Assert.assertEquals(new TableLayOutScreen().verifyFloor2(),"Floor 2");
    }


    @And ("^I click Left symbol$")
    public void iClickLeftSymbol(){
        new TableLayOutScreen().clickLeftBtn();
    }

    @Then ("^I should see previous floor$")
    public void iShouldSeePreviousFloor(){
        Assert.assertEquals(new TableLayOutScreen().verifyFloor1(),"Floor 1");
    }

    @Then ("^I should see types of checks available on the Table layout screen$")
    public void iShouldSeeTypesOfChecksAvailableOnTheTableLayoutScreen(){
        new TableLayOutScreen().verifyAllTypeChecks();
    }

    @And("^I closed the order type window$")
    public void iClosedTheOrderTypeWindow() throws InterruptedException {
        new OrderTypeWindow().pressCancelBtn();
    }

    @And ("^I make a sale for Dummy$")
    public void iMakeASaleForDummy() throws InterruptedException {
        new OrderManagementScreen().createSAle();
    }
    @And ("^I click add button to create seat in order screen$")
    public void iClickAddButtonToCreateSeatInOrderScreen(){
        new OrderTypeWindow().addCreateSeatInOrderScreen();
    }

//    @And ("^I click table name in the order screen$")
//    public void iClickTableMenuInTheOrderScreen(){
//        new OrderTypeWindow().clickTableMenuInTheOrderScreen();
//    }

    @And ("^I click seat 1 for add menu item$")
    public void iClickSeat1ForAddMenuItem(){
        new OrderTypeWindow().clickSeat1ForAddMenuItem();
    }

    @And ("^I click seat 2 for add menu item$")
    public void iClickSeat2ForAddMenuItem(){
        new OrderTypeWindow().clickSeat2ForAddMenuItem();
    }
    @And ("^I click seat 3 for add menu item$")
    public void iClickSeat3ForAddMenuItem(){
        new OrderTypeWindow().clickSeat3ForAddMenuItem();
    }

    @Then ("^I should see the order type window$")
    public void iShouldSeeTheOrderTypeWindow() throws InterruptedException {
        new OrderTypeWindow().verifyOrderTypeWindow();
    }


    @And("^I click All$")
    public void iClickAll() {
        new OrderManagementScreen().pressAll();
    }

    @Then ("^I should see close your sale$")
    public void iShouldSeeCloseYourSale() throws InterruptedException {
        Assert.assertEquals(new OrderManagementScreen().verifyCloseSale(),"Close Your Sale");
    }

    @And ("^I should see close the sale$")
    public void iShouldSeeCloseTheSale() throws InterruptedException {
        new OrderManagementScreen().closeTheSale();
    }

    @And("^I click Table Layout tab$")
    public void iClickTableLayoutTab() throws InterruptedException {
        new OrdersAndDriversListScreen().selectTableLayoutTab();
    }

    @And("^I select table as \"([^\"]*)\"$")
    public void iSelectTableAs(String tableNo) {
        new TableLayOutScreen().selectTable(tableNo);
    }

    @Then ("^I should see service type as \"([^\"]*)\"$")
    public void iShouldSeeServiceTypeAs(String type) throws InterruptedException {
        new OrderManagementScreen().verifyServiceType(type);
    }

    @And("^I select the number of seats as \"([^\"]*)\"$")
    public void iSelectTheNumberOfSeatsAs(String noOfSeats) {
        new TableLayOutScreen().selectSeatNo(noOfSeats);
    }

    @And("^I tap Continue to finish selecting the number of seats$")
    public void iTapContinueToFinishSelectingTheNumberOfSeats() {
        new TableLayOutScreen().pressContinueBtn();
    }

    @And("^I should see numbers of seats as \"([^\"]*)\"$")
    public void iShouldSeeNumbersOfSeatsAs(String noOfSeats) {
        new OrderManagementScreen().checkNoOfSeats(noOfSeats);
    }

    @And("^I add a new seat$")
    public void iAddANewSeat() {
        new OrderManagementScreen().addNewSeat();
    }

    @And("^I delete the seat$")
    public void iDeleteTheSeat() throws InterruptedException {
        new OrderManagementScreen().deleteSeat();
    }

    @And ("^I delete the seat for QSR order type$")
    public void iDeleteTheSeatForQsrOrderType() throws InterruptedException {
        new OrderManagementScreen().deleteSeat2();
    }

    @And("^I select seat one$")
    public void iSelectSeatOne() {
        new OrderManagementScreen().selectSeat1();
    }

    @And("^I select Pizza as Category$")
    public void iSelectPizzaAsCategory() throws Exception {
        new OrderManagementScreen().selectPizzaCategory();
    }

    @And ("^I select Breakfast as Category$")
    public void iSelectBreakfastAsCategory() throws Exception {
        new OrderManagementScreen().selectBreakfastCategory();
    }

    @And("^I select Beverages as Category$")
    public void iSelectBeveragesAsCategory() throws Exception {
        new OrderManagementScreen().selectBeverages();
    }

    @And("^I select upcharge as Category$")
    public void iSelectUpchargeAsCategory() throws Exception {
        new OrderManagementScreen().selectUpcharge();
    }

    @And ("^I select Briyani as SubCategory$")
    public void iSelectBriyaniAsSubCategory(){
        new OrderManagementScreen().selectBriyaniSubCategory();
    }
    @And("^I click Done to get back$")
    public void iClickDoneToGetBack() {
        new OrderManagementScreen().doneForTheMenuItem();
    }

    @Then ("^I should see cash button is enable or not$")
    public void iShouldSeeCashButtonIsEnableOrNot(){
        new OrderManagementScreen().verifyCashButtonEnable();
    }
    @And ("^I click log off button in order screen$")
    public void iClickLogOffButtonInOrderScreen(){
        new OrderManagementScreen().clickLogOffBtn();
    }

    @Then ("^I should see Split button is visible$")
    public void iShouldSeeSplitButtonIsVisible(){
        new OrderManagementScreen().visibleSplitButton();
    }
    @And("^I select seat two$")
    public void iSelectSeatTwo() {
        new OrderManagementScreen().selectSeat2();
    }

    @And ("^I select seat as \"([^\"]*)\" on the order screen$")
    public void iSelectSeatAsOnTheOrderScreen(String value){
        new OrderManagementScreen().selectSeats(value);
    }

    @And("^I select Pasta as category$")
    public void iSelectPastaAsCategory() throws Exception {
        new OrderManagementScreen().selectPastaCategory();
    }
    @And ("^I select Menu as category$")
    public void iSelectMenuAsCategory() throws Exception {
        new OrderManagementScreen().selectMenuCategory();
    }

    @And ("^I select Desserts as category$")
    public void iSelectDessertsAsCategory() throws Exception {
        new OrderManagementScreen().selectDessertsCategory();
    }

    @When("^I click Finish Order button$")
    public void iClickFinishOrderButton() {
        new OrderManagementScreen().pressFinish();
    }

    @Then("^I should get back to the Table Layout tab and see the table as seated$")
    public void iShouldGetBackToTheTableLayoutTabAndSeeTheTableAsSeated() {
        new TableLayOutScreen().checkTableSeated();
    }

    @Then("^I should get back to the Table Layout tab and see the table as seated with one seat$")
    public void iShouldGetBackToTheTableLayoutTabAndSeeTheTableAsSeatedWithOneSeat() {
        new TableLayOutScreen().checkTableSeatedByOne();
    }

    @When("^I click on table \"([^\"]*)\"$")
    public void iClickOnTable(String tableNo) {
        new TableLayOutScreen().selectTable(tableNo);
    }

    @Then("^I should see \"([^\"]*)\" with modifiers \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" with modifier \"([^\"]*)\"$")
    public void iShouldSeeWithModifiersAndAndWithModifier(String menuItem1, String modifier1, String modifier2, String menuItem2, String modifier3) {
        //new OrderManagementScreen().verifyOrderedItemExists(menuItem1);
        new OrderManagementScreen().verifyOrderedMenuItemExists(menuItem1);
        new OrderManagementScreen().verifyOrderedMenuItemExists(menuItem2);
        new OrderManagementScreen().verifyOrderedItemExists(modifier1);
        new OrderManagementScreen().verifyOrderedItemExists(modifier2);
        new OrderManagementScreen().verifyOrderedItemExists(modifier3);

    }

    /****** Merge Operations ******/

    @And("^I click Merge button$")
    public void iClickMergeButton() {
        new TableLayOutScreen().pressMerge();
    }

    @And("^I select a table to be merged as \"([^\"]*)\"$")
    public void iSelectFirstTableToBeMergedAs(String firstTableToMerge) {
        new TableLayOutScreen().selectTable(firstTableToMerge);
    }

    @And("^I click already selected table as \"([^\"]*)\"$")
    public void iClickAlreadySelectedTableAs(String firstTableToMerge) {
        new TableLayOutScreen().selectTable(firstTableToMerge);
    }
    @And("^I select second table to be merged as \"([^\"]*)\"$")
    public void iSelectSecondTableToBeMergedAs(String secondTableToMerge) {
        new TableLayOutScreen().selectTable1(secondTableToMerge);
    }

    @And("^I click Done button to merge checks$")
    public void iClickDoneButtonToMergeChecks() throws InterruptedException {
        new TableLayOutScreen().pressMergeDone();
    }

    @When("^I click Done button on the pop-up to complete merging$")
    public void iClickDoneButtonOnThePopUpToCompleteMerging() throws InterruptedException {
        new TableLayOutScreen().pressMergeDone();
    }

    @Then ("^I should see the merged popup after merge$")
    public void iShouldSeetheMergedPopupAfterMerge(){
        new TableLayOutScreen().verifyMergedPopupAfterMerge();
    }

    @Then("^I should see three seats in the first table merged$")
    public void iShouldSeeThreeSeatsIn() {
        new TableLayOutScreen().verifyMerge();
    }

    @When("^I select the same table to be merged as \"([^\"]*)\"$")
    public void iSelectTheSameTableToBeMergedAs(String Double_Merge_table) {
        new TableLayOutScreen().selectTable(Double_Merge_table);
    }

    @Then("^I should see Check already added pop-up message$")
    public void iShouldSeeCheckAlreadyAddedPopUpMessage() {
        Assert.assertEquals( new TableLayOutScreen().getCheckAlreadyMergedString(), "Check already added");
    }
    @Then ("^I should see select at least 2 checks$")
    public void iShouldSeeSelectAtLeast2Checks() throws InterruptedException {
        Assert.assertEquals(new TableLayOutScreen().Atleast2Chceks(),"Select at least 2 checks");
    }
    @Then ("^I click cancel button on the pop-up for disappear merge box$")
    public void iClickCancelButtonOnThePopUPForDisappearMergeBox(){ new TableLayOutScreen().PressCancelBtn();}

    @And ("^I click Cash button for Complete Sale$")
    public void iClickCashButtonForCompleteSale(){
        new PaymentWindow().pressCashBtn();
    }

    @When ("^I verify the cash price value with fast cash value$")
    public void iVerifyTheCashPriceValueWithFastCashValue(){
        new PaymentWindow().verifyCashPriceValueWithFastCashValue();
    }

    @And ("^I click Exact button on the cash pop-up$")
    public void iClickExactButtonOnTheCashPopup(){
        new PaymentWindow().pressExact();
    }

    @When ("^I verify the fast cash value with total amount$")
    public void iVerifyTheFastCashValueWithTotalAmount(){
        new PaymentWindow().verifyTheFastCashValueWithTotalAmount();
    }

    @And ("^I click Enter Button on the cash pop-up$")
    public void iClickEnterButtonOnTheCashPopup(){
        new PaymentWindow().pressEnter();
    }

    @When ("^I verify the paid amount with partial paid amount$")
    public void iVerifyThePaidAmountWithPartialPaidAmount(){
        new PaymentWindow().verifyThePaidAmountWithPartialPaidAmount();
    }

    @When ("^I verify the paid amount with partial paid amount while gratuity$")
    public void iVerifyThePaidAmountWithPartialPaidAmountWhileGratuity(){
        new PaymentWindow().verifyThePaidAmountWithPartialPaidAmountWhileGratuity();
    }

    @When ("^I verify the partial amount is same with balance due amount on the payment screen$")
    public void iVerifyThePartialAmountIsSameWithBalanceDueAmountOnThePaymentScreen(){
        new PaymentWindow().verifyPartialAmountWithBalanceDueAmount();
    }

    @When ("^I verify the partial amount is same with cash price amount on the payment screen$")
    public void iVerifyThePartialAmountIsSameWithCashPriceAmountOnThePaymentScreen(){
        new PaymentWindow().verifyPartialAmountWithCashPriceAmount();
    }

    @And("^I click Done button on the Popup$")
    public void iClickDoneButtonOnThePopup(){
        new TableLayOutScreen().pressDone1();
    }

    @And("^I click Done button on the Popup from Table Layout$")
    public void iClickDoneButtonOnThePopupFromTableLayout(){
        new TableLayOutScreen().pressDone2();
    }



    @And ("^I click Back button in the menu options window$")
    public void iClickBackButtonInTheMenuOptionsWindow(){
        new MenuOptionScreen().clickBackBtn();
    }
    @Then ("^I should see the print or send receipt$")
    public void iShouldSeeThePrintOrSendReceipt(){
        Assert.assertEquals(new TableLayOutScreen().getPrintOrReceiptMsg(),"Print Or Send Receipt");
    }

    @And ("^I verify the Total value with digital receipt screen$")
    public void iVerifyTheTotalValueWithDigitalReceiptScreen(){
        new PaymentWindow().verifyTheTotalValueWithDigitalPrinterScreen4();
    }

    @And ("^I verify the pay amount value with digital receipt screen$")
    public void iVerifyThePayAmountValueWithDigitalReceiptScreen(){
        new PaymentWindow().verifyTheTotalValueWithDigitalPrinterScreen4();
    }

    @And ("^I verify the pay amount value with digital receipt screen while partial payment$")
    public void iVerifyThePayAmountValueWithDigitalReceiptScreenWhilePartialPayment(){
        new PaymentWindow().verifyTheTotalValueWithDigitalPrinterScreen5();
    }

    @Then ("^I should see merge box is hide$")
    public void iShouldSeeMergeBoxIsHide(){
        new TableLayOutScreen().findMergeBox();
    }
    /****** Add customer to table ******/

    @And("^I click Add Customer Button$")
    public void iClickAddCustomerButton() {
        new OrderManagementScreen().openCustomerSelectionMenu();
    }

    @Then ("^I should see the add customer window$")
    public void iShouldSeeTheAddCustomerWindow() throws InterruptedException {
        new OrderManagementScreen().shouldSeeTheAddCustomerWindow();
    }

    @And ("^I click x button on the Add customer window$")
    public void iClickXButtonOnTheAddCustomerWindow(){
        new OrderManagementScreen().clickXBtn();
    }

    @And ("^I click Add new button$")
    public void iClickAddNewButton(){
        new OrderManagementScreen().clickAddNewBtn();
    }

    @And ("^I pass the customer name$")
    public void iPassTheCustomerName(){
        new OrderManagementScreen().passTheCustomerName();
    }
    @And ("^I click remove button$")
    public void iClickRemoveButton(){
        new OrderManagementScreen().clickRemoveBtn();
    }

    @Then ("^I should see customer removed$")
    public void iShouldSeeCustomerRemoved() throws InterruptedException {
        Assert.assertEquals(new OrderManagementScreen().customerRemoved(),"Walk-in");
    }

    @Then ("^I should see the customer profile window$")
    public void iShouldSeeTheCustomerProfileWindow(){
        Assert.assertEquals(new OrderManagementScreen().verifyCustomerProfile(),"Customer Profile");
    }

    @And ("^I enter first name as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String first){
        new CustomerProfileWindow().iEnterCustomerFirstName(first);
    }
    @And ("^I enter last name as \"([^\"]*)\"$")
    public void iEnterLastNameAs(String last){
        new CustomerProfileWindow().iEnterCustomerLastName(last);
    }
    @And ("^I enter mobile number as \"([^\"]*)\"$")
    public void iEnterMobileNumberAs(String numb){
        new CustomerProfileWindow().iEnterCustomerMobileNumber(numb);
    }
    @And ("^I enter e-mail as \"([^\"]*)\" in customer profile$")
    public void iEnterEmailAsInCustomerProfile(String mail){
        new CustomerProfileWindow().iEnterCustomerEmail(mail);
    }
    @And("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String customerName)  {
        new OrderManagementScreen().searchForCustomer(customerName);
    }
    @And("^I click By Name Email Button$")
    public void iClickByNamEmailBtn()  {
        new OrderManagementScreen().clickByNameEmail();
    }

    @And ("^I click add customer button from the Add customer window$")
    public void iClickAddCustomerButtonFromTheAddCustomerWindow(){
        new OrderManagementScreen().clickAddCustomerBtnFrom();
    }

    @And("^I click \"([^\"]*)\" to select customer for the seat$")
    public void iClickToSelectCustomerForTheSeat(String customerName) {
        new OrderManagementScreen().selectCustomerNameToAddToTheTable(customerName);
    }

    @And("^I click \"([^\"]*)\" to select customer")
    public void iClickToSelectCustomer(String customerName) {
        new OrderManagementScreen().selectCustomerNameAsToAddToTheTable(customerName);
    }
    @Then ("^I should see customer as \"([^\"]*)\" added on order screen$")
    public void iShouldSeeCustomerAsAddedOnOrderScreen(String name) throws InterruptedException {
        new OrderManagementScreen().verifyCustomerAddOrderScreen(name);
    }

    @Then("^I should get back to the Table Layout tab and see the table as seated, I should see the selected customer's name$")
    public void iShouldGetBackToTheTableLayoutTabAndSeeTheTableAsSeatedIShouldSeeTheSelectedCustomerSName() {
        Assert.assertEquals(new TableLayOutScreen().getCustomerName(), "Auto r");
    }

    /****** Transfer Table ******/

    @And("^I click Transfer button$")
    public void iClickTransferButton() {
        new TableLayOutScreen().pressTransfer();
    }

    @Then ("^I should see transfer to server$")
    public void iShouldSeeTransferToServer(){
        Assert.assertEquals(new TableLayOutScreen().verifyTransferToServer(),"Transfer to Server");
    }

    @And("^I click Transfer to Table button$")
    public void iClickTransferToTableButton() {
        new TransferWindow().pressTransferToTable();
    }

    @And("^I select table to transfer from as \"([^\"]*)\"$")
    public void iSelectTableToTransferFromAs(String tableToTransferFrom) {
        new TransferWindow().selectTransferFromTable(tableToTransferFrom);
    }

    @And("^I select the check to be transferred as \"([^\"]*)\"$")
    public void iSelectTheCheckToBeTransferredAs(String checkToTransfer) throws Exception {
        new TransferWindow().selectCheck(checkToTransfer);
    }

    @And("^I select the check to be transferred$")
    public void iSelectTheCheckToBeTransferred(){
        new TransferWindow().selectCheckTransfer();
    }

    @And("^I select the table to transfer to as \"([^\"]*)\"$")
    public void iSelectTheTableToTransferToAs(String tableTransferTo) {
        new TransferWindow().selectTableTransferTo(tableTransferTo);
    }

    @When("^I click Done button to complete the transfer$")
    public void iClickDoneButtonToCompleteTheTransfer() {
        new TransferWindow().pressTransferDone();
    }

    @Then("^I should see transfer successful pop-up$")
    public void iShouldSeeTransferSuccessfulPopUp() {
        Assert.assertEquals(new TableLayOutScreen().getTransferSuccessfulMsg(), "Transferred Successfully");
    }

    @And("^I click Pay Check button$")
    public void iClickPayCheckButton() {
        new TableLayOutScreen().pressPayCheck();
    }

    /****** Transfer to Server ******/

    @And("^I click Transfer to Server Button$")
    public void iClickTransferToServerButton() {
        new TransferWindow().pressTransferToServer();
    }

    @And("^I select Server to transfer from$")
    public void iSelectServerToTransferFrom() {
        new TransferWindow().selectServerTransferFrom();
    }

    @And("^I select the Server to transfer to$")
    public void iSelectTheServerToTransferTo() {
        new TransferWindow().selectServerTransferTo();
    }

    @And("^I click Yes button on Employee is offline pop-up$")
    public void iClickYesButtonOnEmployeeIsOfflinePopUp() {
        new TransferWindow().pressYes();
    }

    @Then("^I should verify that the check is transferred to the selected server$")
    public void iShouldVerifyThatTheCheckIsTransferredToTheSelectedServer() {
        new TableLayOutScreen().verifyServer();
    }

    /****** Transfer Item ******/

    @And("I click Transfer Item Button")
    public void iClickTransferItemButton() {
        new TransferWindow().pressTransferItem();
    }

    @And("^I select table that the item will be transferred from$")
    public void iSelectTableThatTheItemWillBeTransferredFrom() {
        new TransferWindow().selectTransferItemFrom();
    }

    @And("^I select the item to be transferred$")
    public void iSelectTheItemToBeTransferred() {
        new TransferWindow().selectItemToTransfer();
    }

    @And("^I select the table to transfer the item$")
    public void iSelectTheTableToTransferTheItemAs() {
        new TransferWindow().selectTableToTransferTheItem();
    }

    @Then("^I should see item transfer successful pop-up$")
    public void iShouldSeeItemTransferSuccessfulPopUp() {
        Assert.assertEquals(new TableLayOutScreen().getItemTransferSuccessfulMsg(), "Transferred check success.");
    }

    @Then("^I should verify that the menu item \"([^\"]*)\" is transferred to the selected server$")
    public void iShouldVerifyThatTheMenuItemIsTransferredToTheSelectedServer(String menuItem) {
        new OrderManagementScreen().verifyOrderedItemExists(menuItem);
    }

    @And("I click Done button to complete item transfer")
    public void iClickDoneButtonToCompleteItemTransfer() {
        new TableLayOutScreen().pressItemTransferDone();
    }

    /****** Check Options ******/

    @And("^I select modifier as \"([^\"]*)\"$")
    public void iSelectModifierAs(String modifier) throws InterruptedException {
        new OrderManagementScreen().selectModifier(modifier);
    }

    @And("^I select modifier as \"([^\"]*)\" from the modifier window$")
    public void iSelectModifierAsFromTheModifierWindow(String modifier) throws InterruptedException {
        new OrderManagementScreen().selectModifier12(modifier);
    }

    @When ("^I verify tax as \"([^\"]*)\"$")
    public void iVerifyTaxAs(String tax) throws InterruptedException {
        new OrderManagementScreen().iVerifyTaxAs(tax);
    }

    @And("^I select modifier1 as \"([^\"]*)\"$")
    public void iSelectModifier1(String numb) {
        new OrderManagementScreen().selectModifier1(numb);
    }

    @And ("^I swipe auto discount in order screen$")
    public void iSwipeAutoDiscountInOrderScreen() throws InterruptedException {
        new OrderManagementScreen().swipeDiscount();
    }

    @And("^I click delete button$")
    public void iClickDeleteButton(){
        new OrderManagementScreen().clickDeleteBtn();
    }


    @And("^I select menu item as \"([^\"]*)\"$")
    public void iSelectMenuItemAs(String menuItem) throws Exception {
        new OrderManagementScreen().selectMenuItem(menuItem);
    }

    @When ("^I should verify subtotal value as \"([^\"]*)\"$")
    public void iShouldVerifySubtotalValueAs(String subtotal) throws InterruptedException {
        new OrderManagementScreen().verifyMenuSubTotalAs(subtotal);
    }

    @Then ("^I should verify tax value as \"([^\"]*)\"$")
    public void iShouldVerifyTaxValueAs(String value) throws InterruptedException {
         new OrderManagementScreen().verifyTaxValueAs(value);
    }

    @Then ("^I should verify discount value as \"([^\"]*)\"$")
    public void iShouldVerifyDiscountValueAs(String value) throws InterruptedException {
        new OrderManagementScreen().verifyDiscountValueAs(value);
    }

    @Then ("^I should verify discount value1 as \"([^\"]*)\"$")
    public void iShouldVerifyDiscountValue1As(String value) throws InterruptedException {
        new OrderManagementScreen().verifyDiscount1ValueAs(value);
    }

    @Then ("^I should verify service charge value as \"([^\"]*)\"$")
    public void iShouldVerifyServiceChargeValueAs(String value) throws InterruptedException {
        new OrderManagementScreen().verifyServiceChargeValueAs(value);
    }

    @Then ("^I should verify service charge value1 as \"([^\"]*)\"$")
    public void iShouldVerifyServiceChargeValue1As(String value) throws InterruptedException {
        new OrderManagementScreen().verifyServiceChargeValue1As(value);
    }

    @Then ("^I should verify service charge value2 as \"([^\"]*)\"$")
    public void iShouldVerifyServiceChargeValue2As(String value) throws InterruptedException {
        new OrderManagementScreen().verifyServiceChargeValue2As(value);
    }

    @Then ("^I should verify cash price value as \"([^\"]*)\"$")
    public void iShouldVerifyCashPriceValueAs(String value) throws InterruptedException {
        new OrderManagementScreen().verifyCashPriceValueAs(value);
    }

    @Then ("^I should verify cash price value as \"([^\"]*)\" for tax exempt$")
    public void iShouldVerifyCashPriceValueAsForTaxExempt(String value) throws InterruptedException {
        new OrderManagementScreen().verifyCashPriceValueAsForTaxExempt(value);
    }

    @Then ("^I should verify cash price value1 as \"([^\"]*)\"$")
    public void iShouldVerifyCashPriceValue1As(String value) throws InterruptedException {
        new OrderManagementScreen().verifyCashPriceValue1As(value);
    }

    @Then ("^I should verify cash price value2 as \"([^\"]*)\"$")
    public void iShouldVerifyCashPriceValue2As(String value) throws InterruptedException {
        new OrderManagementScreen().verifyCashPriceValue2As(value);
    }

    @Then ("^I should verify cash price value3 as \"([^\"]*)\"$")
    public void iShouldVerifyCashPriceValue3As(String value) throws InterruptedException {
        new OrderManagementScreen().verifyCashPriceValue3As(value);
    }

    @And ("^I verify the actual cash price with calculated cash price$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPrice(){
        new PaymentWindow().verifyTheActualCashPriceWithCalculatedCAshPrice();
    }

    @And ("^I verify the actual cash price with calculated cash price1$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPrice1(){
        new PaymentWindow().verifyTheActualCashPriceWithCalculatedCAshPrice1();
    }

    @And ("^I verify the actual cash price with calculated cash price while cash discount is enabled$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceWhileCashDiscountIsEnabled(){
        new PaymentWindow().verifyTheActualCashPriceWithCalculatedCAshPriceWhileCashDiscount();
    }

    @And ("^I verify the actual cash price with calculated cash price while cash discount is enabled when inclusive tax$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceWhileCashDiscountIsEnabledWhenInclusiveTax(){
        new PaymentWindow().verifyTheActualCashPriceWithCalculatedCAshPriceWhileCashDiscountInclusiveTax();
    }

    @And ("^I verify the actual cash price with calculated cash price while tax exempt$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceWhileTaxExempt(){
        new PaymentWindow().verifyTheActualCashPriceWithCalculatedCAshPriceWhileTaxExempt();
    }

    @And ("^I verify the actual cash price with calculated cash price cash discount enabled while tax exempt$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceCashDiscountEnabledWhileTaxExempt(){
        new PaymentWindow().verifyTheActualCashPriceWithCalculatedCAshPriceCashDiscountEnabledWhileTaxExempt();
    }

    @And ("^I verify the actual cash price with calculated cash price while gratuity$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceWhileGratuity(){
        new PaymentWindow().verifyTheActualCashPriceWithCalculatedCAshPriceWhileGratutity();
    }

    @And ("^I verify the actual cash price with calculated cash price while gratuity with inclusive tax$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceWhileGratuityWithInclusiveTax(){
        new PaymentWindow().verifyTheActualCashPriceWithCalculatedCAshPriceWhileGratutityWithInclusiveTax();
    }


    @And ("^I verify the actual total price with calculated total value cash discount enabled while gratuity$")
    public void iVerifyTheActualTotalPriceWithCalculatedTotalValueCashDiscountEnabledWhileGratuity(){
        new PaymentWindow().verifyTheActualCashPriceWithCalculatedCAshPriceCashDiscountWhileGratutity();
    }

    @And ("^I verify the actual cash price with calculated cash price while service charge$")
    public void iVerifyTheActualCashPriceWithCalculatedCAshPriceWhileServiceCharge(){
        new PaymentWindow().verifyTheActualCashPriceWithCalculatedCAshPriceWhileItemServiceCharge();
    }

    @Then ("^I should verify total value as \"([^\"]*)\"$")
    public void iShouldVerifyTotalValueAs(String value) throws InterruptedException {
        new OrderManagementScreen().verifyTotalValueAs(value);
    }

    @Then ("^I should verify total4 value as \"([^\"]*)\"$")
    public void iShouldVerifyTotal4ValueAs(String value) throws InterruptedException {
        new OrderManagementScreen().verifyTotal4ValueAs(value);
    }

    @And ("^I should verify paid amount as \"([^\"]*)\"$")
    public void iShouldVerifyPaidAmountAs(String value) throws InterruptedException {
        new OrderManagementScreen().verifyPaidAmountValueAs(value);
    }

    @And ("^I should verify paid amount0 as \"([^\"]*)\"$")
    public void iShouldVerifyPaidAmount0As(String value) throws InterruptedException {
        new OrderManagementScreen().verifyPaidAmountValueAs0(value);
    }

    @And ("^I should verify paid amount1 as \"([^\"]*)\"$")
    public void iShouldVerifyPaidAmount1As(String value) throws InterruptedException {
        new OrderManagementScreen().verifyPaidAmountValue1As(value);
    }

    @Then ("^I should verify total5 value as \"([^\"]*)\"$")
    public void iShouldVerifyTotal5ValueAs(String value) throws InterruptedException {
        new OrderManagementScreen().verifyTotal5ValueAs(value);
    }

    @Then ("^I should verify total6 value as \"([^\"]*)\"$")
    public void iShouldVerifyTotal6ValueAs(String value) throws InterruptedException {
        new OrderManagementScreen().verifyTotal6ValueAs(value);
    }

    @Then ("^I should verify total2 value as \"([^\"]*)\"$")
    public void iShouldVerifyTotal2ValueAs(String value) throws InterruptedException {
        new OrderManagementScreen().verifyTotal2ValueAs(value);
    }

    @When ("^I verify the cash price name on the order screen$")
    public void iVerifyTheCashPriceNameOnTheOrderScreen(){
        new OrderManagementScreen().verifyTheCashPriceNameONTheOrderScreen();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabled(){
        new OrderManagementScreen().verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscount();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled with gratuity is enabled$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabledWithGratuityIsEnabled(){
        new OrderManagementScreen().verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountWithGratuityEnabled();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled with item service charge$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabledWithItemServiceCharge(){
        new OrderManagementScreen().verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountWithServiceCharge();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled with discount$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabledWithDiscount(){
        new OrderManagementScreen().verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountWithDiscount();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled with item service charge also having gratuity$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabledWithItemServiceChargeAlsoHavingGratuity(){
        new OrderManagementScreen().verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountWithServiceChargeHavingGratuity();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled discount with item service charge also having gratuity$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabledDiscountWithItemServiceChargeAlsoHavingGratuity(){
        new OrderManagementScreen().verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountDiscountAndServiceChargeHavingGratuity();
    }

    @And ("^I verify the total value on the order screen when cash discount is enabled for tax exempt$")
    public void iVerifyTheTotalValueOnTheOrderScreenWhenCashDiscountIsEnabledForTaxExempt(){
        new OrderManagementScreen().verifyTheActualTotalWithCalculatedTotalPriceWhileCashDiscountForTaxExempt();
    }

    @Then ("^I should verify tax exempt total value as \"([^\"]*)\"$")
    public void iShouldVerifyTaxExemptTotal2ValueAs(String value) throws InterruptedException {
        new OrderManagementScreen().verifyTaxExemptTotalValueAs(value);
    }

    @And ("^I should verify cash option value as \"([^\"]*)\" with Gratuity$")
    public void iShouldVerifyCashOptionValueAsWithGratuity(String value) throws InterruptedException {
        new OrderManagementScreen().verifyCashOptionValueASWithGratuity(value);
    }

    @Then ("^I should verify gratuity value as \"([^\"]*)\"$")
    public void iShouldVerifyGratuityValueAs(String value) throws InterruptedException {
        new OrderManagementScreen().verifyGratuityValueAs(value);
    }

    @Then ("^I should verify gratuity value1 as \"([^\"]*)\"$")
    public void iShouldVerifyGratuityValue1As(String value)throws InterruptedException {
        new OrderManagementScreen().verifyGratuity1ValueAs(value);
    }

    @When ("^I get Total of menu while cash discount applied$")
    public void iGetTotalOfMenuWhileCashDiscountApplied()throws InterruptedException {
        new OrderManagementScreen().getTotalOfMenuWhileCashDiscountApplied();
    }

    @When ("^I verify total Menu same with Fast cash total when Cash discount applied")
    public void iVerifyTotalMenuSameWithFastCashTotaWhenCashDiscountIsApplied()throws InterruptedException {
        new OrderManagementScreen().verifyTheTotalValueWithPaymentScreen();
    }
    @And ("^I verify subtotal value with cash value in payemnt screen$")
    public void iVerifySubtotalValueWithCashValueInPaymentScreen()throws InterruptedException {
        new OrderManagementScreen().verifySubtotalValueWithCashValueInPaymentScreen();
    }
    @And ("^I select menu item  as \"([^\"]*)\" to see menu option window$")
    public void iSelectMenuItemAsToSeeMenuOptionWindow(String menuItem){
        new OrderManagementScreen().selectMenuItemToSeeMenuOptionWindow(menuItem);
    }
    @And ("^I select menu item as Ravioli for Item Based Exclusive Tax$")
    public void iSelectMenuItemAsRavioliForItemBasedExclusiveTax(){
        new OrderManagementScreen().selectMenuAsRavioli();
    }

    @And ("^I select menu item as RavioliPesto for Item Based Inclusive Tax$")
    public void iSelectMenuItemAsRavioliPestoForItemBasedInclusiveTax(){
        new OrderManagementScreen().selectMenuAsRavioliPesto();
    }

    @And ("^I select menu item as Cheesecake for Item Based Quantity Tax$")
    public void iSelectMenuItemAsFusRapiniForItemBasedQuantityTax(){
        new OrderManagementScreen().selectMenuAsCheeseCake();
    }

    @And ("^I select menu item as Ling Littlenck for free item auto Discount$")
    public void iSelectMenuItemAsLingLittleNckForFreeItemAutoDiscount(){
        new OrderManagementScreen().selectMenuAsLingLittlenck();
    }
    @And ("^I select menu item as Ling Pes Shrimp for free item auto Discount$")
    public void iSelectMenuItemAsLingPesShrimpForFreeItemAutoDiscount(){
        new OrderManagementScreen().selectMenuAsLingPesShrimp();
    }

    @And ("^I select menu item as Ling Meatballs for Tax on Item Tax$")
    public void iSelectMenuItemAsLingMeatballsForTaxOnItemTax(){
        new OrderManagementScreen().selectMenuAsLingMeatballs();
    }

    @And("^I select the serving size as \"([^\"]*)\"$")
    public void iSelectTheServingSizeAs(String servingSize) {

        new OrderManagementScreen().selectServingSize(servingSize);
    }

    @Then("^I should return back to the order management screen and I should verify that the \"([^\"]*)\" and \"([^\"]*)\" are listed under the menu item$")
    public void iShouldReturnBackToTheOrderManagementScreenAndIShouldVerifyThatTheAndAreListedUnderTheMenuItem(String modifier1, String modifier2) {
        new OrderManagementScreen().verifyOrderedItemExists(modifier1);
        new OrderManagementScreen().verifyOrderedItemExists(modifier2);
    }

    /****** Table Seated By One (Dine In) ******/

    @Then("^I should get back to the Table Layout tab and see the table as seated by one$")
    public void iShouldGetBackToTheTableLayoutTabAndSeeTheTableAsSeatedByOne() {
        new TableLayOutScreen().checkTableSeatedDineIn();
    }

    @Then ("^I should see that OrderScreen with modifiers as \"([^\"]*)\"$")
    public void iShouldSeeThatOrderScreenWithModifiers(String modify) throws InterruptedException {
        new OrderManagementScreen().verifyModifiersAddOrderScreen(modify);
    }

    /****** Split Option ******/

    @And ("^I click the Split Button from the Table Layout Screen$")
    public void iClickSplitButtonFromTheTableLayoutScreen(){
        new TableLayOutScreen().pressSplitBtn();
    }

    @And ("^I click split check button$")
    public void iClickSplitCheckButton(){
        new TableLayOutScreen().pressSplitCheckBtn();
    }


    @When ("^I click the Split By Seat on the Pop-up$")
    public void iClickTheSplitCheckOnThePopup(){
        new TableLayOutScreen().pressSplitBySeat();
    }

    @And("^I click the valid check \"([^\"]*)\"$")
    public void iClickTheValidCheck(String firstTableToMerge){
        new TableLayOutScreen().selectTable(firstTableToMerge);
    }
    @Then ("^I should see the Split Screen$")
    public void iShouldSeeTheSplitScreen() throws InterruptedException {
        new TableLayOutScreen().verifySplitScreen();
    }

    @Then ("^I should see subtotal as \"([^\"]*)\" in Split seat Screen$")
    public void iShouldSeeSubTotalAsInSplitSeatScreen(String value){
        new TableLayOutScreen().shouldSeeSubtotal(value);
    }

    @Then ("^I should see tax as \"([^\"]*)\" in Split seat Screen$")
    public void iShouldSeeTaxAsInSplitSeatScreen(String value){
        new TableLayOutScreen().shouldSeeTax(value);
    }

    @Then ("^I should see total as \"([^\"]*)\" in Split seat Screen$")
    public void iShouldSeeTotalAsInSplitSeatScreen(String value){
        new TableLayOutScreen().shouldSeeTotal(value);
    }
    @When ("^I verify the split seat is avilable in split seat screen$")
    public void iVerifyTheSplitSeatIsAvailableInSplitSeatScreen(){
        new TableLayOutScreen().verifySplitSeatIsAvailable();
    }

    @And ("^I get the first seat prize details$")
    public void iGetTheFirstSeatPrizeDetails(){
        new TableLayOutScreen().getFirstSeatPRizeDetails();
    }
    @Then ("^I should see Gift card amount add up into seat 1 with amount$")
    public void iShouldSeeGiftCardAmountAddUpIntoSeat1WithAmount(){
        new TableLayOutScreen().giftCardSeat1();
    }

    @And ("^I click Gift card in seat 1$")
    public void iClickGiftCardInSeat1(){
        new TableLayOutScreen().giftSeat1();
    }
    @Then ("^I should see Gift card amount add up into seat 2 with amount$")
    public void iShouldSeeGiftCardAmountAddUpIntoSeat2WithAmount(){
        new TableLayOutScreen().giftCardSeat2();
    }
    @Then ("^I should see paid amount as \"([^\"]*)\" in Split seat screen$")
    public void iShouldSeePaidAmountAsInSplitSeatScreen(String num){
        new TableLayOutScreen().verifyPaidAmount(num);
    }
    @Then ("^I should see created seat in split seat$")
    public void iShouldSeeCreatedSeatInSplitSeat(){
        new TableLayOutScreen().verifyCreatedSeat();
    }
    @Then ("^I should see menu item as Ravioli added into next seat$")
    public void iShouldSeeMenuItemAsAddedIntoNextSeat() throws InterruptedException {
        new TableLayOutScreen().verifyMenuAddedIntoNextSeat();
    }

    @Then ("^I should see discount as \"([^\"]*)\" moved into next seat$")
    public void iShouldSeeDiscountAsMovedIntoNextSeat(String discount){
        new TableLayOutScreen().verifyDiscountIsMovedIntoNextSeat(discount);
    }
    @Then ("^I should see menu item as cake added into next seat$")
    public void iShouldSeeMenuItemAsCakeAddedIntoNextSeat() throws InterruptedException {
        new TableLayOutScreen().verifyMenuAddedIntoNextSeat1();
    }
    @Then ("^I should see menu item as Ravioli Pesto added into next seat$")
    public void iShouldSeeMenuItemAsRavioliPestoAddedIntoNextSeat() throws InterruptedException {
        new TableLayOutScreen().verifyMenuAddedIntoNextSeat2();
    }
    @Then ("^I should see menu item as Ravioli added into next seat for gratuity$")
    public void iShouldSeeMenuItemaAsRavioliAddedIntoNextSeatForGratuity() throws InterruptedException {
        new TableLayOutScreen().verifyMenuAddedIntoNextSeat21();
    }
    @Then ("^I should see menu item as cheese cake added into next seat$")
    public void iShouldSeeMenuItemAsCheeseCakeAddedIntoNextSeat() throws InterruptedException {
        new TableLayOutScreen().verifyMenuAddedIntoNextSeat3();
    }

    @Then ("^I should see menu item as cheese cake added into next seat1$")
    public void iShouldSeeMenuItemAsCheeseCakeAddedIntoNextSeat1() throws InterruptedException {
        new TableLayOutScreen().verifyMenuAddedIntoNextSeat5();
    }

    @Then ("^I should see applied discount as \"([^\"]*)\"$")
    public void iShouldSeeAppliedDiscountAs(String name){
        new TableLayOutScreen().verifyDiscountIsApplied(name);
    }
    @Then ("^I should see menu item as Ravioli added into next seat for Free Item$")
    public void iShouldSeeMenuItemAsAddedIntoNextSeatForFreeItem() throws InterruptedException {
        new TableLayOutScreen().verifyMenuAddedIntoNextSeat4();
    }

    @Then ("^I should see menu item as Ravioli added into next seat for Free Item1$")
    public void iShouldSeeMenuItemAsAddedIntoNextSeatForFreeItem1() throws InterruptedException {
        new TableLayOutScreen().verifyMenuAddedIntoNextSeat42();
    }

    @Then ("^I should see seat as paid$")
    public void iShouldSeeSeatAsPaid(){
        Assert.assertEquals(new TableLayOutScreen().verifyPaidTxt(),"Paid");
    }

    @Then ("^I should see paid amount as \"([^\"]*)\" of French Friese$")
    public void iShouldSeePaidAmountAsOfFrenchFriese(String money){
        new TableLayOutScreen().verifyPaidAmountFrenchFriese(money);
    }
    @Then ("^I should see \"([^\"]*)\" present in respective seat in split screen$")
    public void iShouldSeeMenuItemPresentInRespectiveSeatInSplitScreen(String menu){
        new TableLayOutScreen().verifyMenuItem(menu);
    }
    @And ("^I click an unvalid check \"([^\"]*)\"$")
    public void iClickAnUnvalidCheck(String unvalidTable){
        new TableLayOutScreen().selectTable(unvalidTable);
    }

    @Then ("^I should see select Valid Check pop-up$")
    public void iShouldSeeSelectValidCheckPopup(){
        Assert.assertEquals( new TableLayOutScreen().getSelectValidCheckMsg(), "Select valid check");
    }
    @And ("^I click on item$")
    public void iClickOnItem(){
        new TableLayOutScreen().selectItem();
    }

    @And ("^I click on item as \"([^\"]*)\"$")
    public void iClickOnItemAs(String menu1)
    {
        new TableLayOutScreen().selectItem1(menu1);
    }

    @And ("^I click on item as Ravioli$")
    public void iClickOnItemAsRavioli(){
        new TableLayOutScreen().selectItem2();
    }
    @And ("^I click on item as Ravioli For Gratuity$")
    public void iClickOnItemAsRavioliForGratuity(){
        new TableLayOutScreen().selectRavioli();
    }
    @And ("^I click on item as cake")
    public void iClickOnItemAsCake(){
        new TableLayOutScreen().selectItem3();
    }
    @And ("^I click on item as cake on split seat screen")
    public void iClickOnItemAsCakeOnSplitSeatScreen(){
        new TableLayOutScreen().selectItem6();
    }
    @And ("^I click on item as Ravioli Pesto$")
    public void iClickOnItemAsRavioliPesto(){
        new TableLayOutScreen().selectItem4();
    }

    @And ("^I click on item as cheesecake$")
    public void iClickOnItemAsCheeseCake(){
        new TableLayOutScreen().selectItem5();
    }
    @And ("^I click Seperate item button$")
    public void iClickSeperateItemButton(){
        new TableLayOutScreen().seperateItem();
    }

    @And ("^I select the number of split item \"([^\"*])\"$")
    public void iSelectTheNumberOfSplitItem(String noOfSplit) throws InterruptedException {
        new TableLayOutScreen().selectSplit(noOfSplit);
    }

    @Then ("^I should see menu has separated as \"([^\"]*)\"$")
    public void iShouldSeeMenuHasSeparatedAs(String number){
        new TableLayOutScreen().verifyMenuHasSeperated(number);
    }

    @And ("^I select the number of split item \"([^\"]*)\" for Split check$")
    public void iSelectTheNumberOfSplitItemForSplitCheck(String number){
        new TableLayOutScreen().selectTheNumberOfSplitItem(number);
    }
    @And ("^I click the Back button on Split Screen$")
    public void iClickTheBackButtonOnSplitScreen(){
        new TableLayOutScreen().pressBack();
    }

    @Then ("^I should see the Changes made in split save and close pop-up$")
    public void iShouldSeeTheChangesMadeInSplitSaveAndClosePopUp(){
        Assert.assertEquals(new TableLayOutScreen().getChangesMadeinSplitMag(),"Changes made in split, save and close");
    }
    @And ("^I click Done button on the pop-up to cancel the Back condition$")
    public void iClickDoneButtonOnThePopupToCancelTheBackCondition(){
        new TableLayOutScreen().clickDone();
    }

    @And ("^I click the save & close button on the split screen$")
    public void iClickTheSaveCloseButtonOnTheSplitScreen() throws InterruptedException {
        new TableLayOutScreen().clickSaveandClose();
    }

    @Then ("^I Should get back to the Order Screen$")
    public void iShouldGetBackToTheOrderScreen() throws InterruptedException {
        new TableLayOutScreen().orderScreen();
    }

    @And ("^I wait sometimes$")
    public void iWaitSometimes() throws InterruptedException {
        Thread.sleep(7000);
    }

    @And ("^I verify the values after reopen the check$")
    public void iVerifyTheValuesAfterReopenTheChecks(){
        new Regression().validateTheMenuValueInOrderScreen1();
    }

    @And ("^I verify the values after reopen the check1$")
    public void iVerifyTheValuesAfterReopenTheChecks1(){
        new Regression().validateTheMenuValueInOrderScreen2();
    }

    @Then ("^I should see Delivery charge added to orderscreen$")
    public void iShouldSeeDeliveryChargeAddedToOrderScreen(){
        new TableLayOutScreen().verifyDeliveryChargeAdded();
    }

    @Then ("^I should see Delivery charge added to orderscreen for loyalty$")
    public void iShouldSeeDeliveryChargeAddedToOrderScreenForLoyalty(){
        new TableLayOutScreen().verifyDeliveryChargeAddedForLoyalty();
    }

    @Then ("I should see subtotal should not change when added delivery charge$")
    public void iShouldSeeSubtotalShouldNotChangeWhenAddedDeliveryCharge(){
        new TableLayOutScreen().verifySubtotalShouldNotChange();
    }
    @Then ("^I Should see Split Evenly is Disable")
    public void iShouldSeeSplitEvenlyIsDisable() throws InterruptedException {
        new TableLayOutScreen().splitEvently();
    }

    @Then ("^I should see Select the Order to Proceed Popup$")
    public void iShouldSeeSelectTheOrderToProceedPopUP(){
        Assert.assertEquals(new TableLayOutScreen().getSelectTheOrderToProceedMsg(),"Select the order to proceed");
    }
    @And ("^I click Add Button to create Seat$")
    public void iClickAddButtonToCreateSeat() throws InterruptedException {
        new TableLayOutScreen().pressAddBtn();
    }

    @Then ("^I should see created new seat$")
    public void iShouldSeeCreatedNewSeat(){
        new TableLayOutScreen().verifySeat2();
    }

    @Then ("^I should not see created new seat$")
    public void iShouldNotSeeCreatedNewSeat(){
        new TableLayOutScreen().verifySeat22();
    }

    @Then ("^I should see seat 3 is created$")
    public void iShouldSeeSeat3IsCreated(){
        new TableLayOutScreen().verifySeat3();
    }

    @Then ("^I should not see seat 3 is created$")
    public void iShouldNotSeeSeat3IsCreated(){
        new TableLayOutScreen().verifySeat33();
    }

    @And ("^I click Split Evenly Button$")
    public void iClickSplitEvenlyButton(){
        new TableLayOutScreen().pressSplitEvenly();
    }

    @Then ("^I should see cannot split as payments popup$")
    public void iShouldSeeCannotSplitAsPaymentsPopup(){
        new TableLayOutScreen().verifyCannotSplitAsPayments();
    }

    @Then ("^I should see menu item prize split evenly$")
    public void iShouldSeeMenuItemPrizeSplitEvenly(){
        new TableLayOutScreen().verifyMenuItemPrizeSplit();
    }
    @Then ("^I should see Seperate Item is Disable$")
    public void iShouldSeeSeperateItemIsDisable() throws InterruptedException {
        new TableLayOutScreen().seperateItemIsVisble();
    }

    @Then ("^I should see the additional seat & Item on the Split Seat$")
    public void iShouldSeeTheAdditionalSeatItemOnTheSplitSeat(){
        new TableLayOutScreen().verify2Table();
    }

    @And ("^I click the Group Seats button in the Split Seat$")
    public void iClickTheGroupSeatsButtonInTheSplitSeat() throws InterruptedException {
        new TableLayOutScreen().pressGroupSeat();
    }

    @Then ("^I should see the Select the Seats to Merge Popup message$")
    public void iShouldSeeTheSelectTheSeatsToMergePopupMessage() throws InterruptedException {
        Assert.assertEquals(new TableLayOutScreen().getPopupMessage(),"Select the seats to merge");
    }

    @And ("^I click Seat 4 for add menu item$")
    public void iClickSeat4ForAddMenuItem(){ new TableLayOutScreen().pressSeat4(); }

    @And ("^I click Seat 5 for add menu item$")
    public void iClickSeat5ForAddMenuItem(){ new TableLayOutScreen().pressSeat5(); }

    @And ("^I click seat to Group into one seat$")
    public void iClickSeatToGroupIntoOneSeat(){
        new TableLayOutScreen().pressSeat1Group();
    }

    @And ("^I click seat one on the split screen$")
    public void iClickSeatOneOnTheSplitScreen() throws InterruptedException {
        new TableLayOutScreen().pressSeat11();
    }

    @And ("^I click another seat for Group$")
    public void iClickAnotherSeatForGroup(){
        new TableLayOutScreen().pressSeat2Group();
    }

    @And ("^I click seat two on the split screen$")
    public void iClickSeatTwoOnTheSplitScreen(){
        new TableLayOutScreen().pressSeat2Table();
    }

    @And ("^I click seat three on the split screen$")
    public void iClickSeatThreeOnTheSplitScreen(){
        new TableLayOutScreen().pressSeat3Table();
    }

    @Then ("^I should see orderscreen with menu item prize as \"([^\"]*)\" in split seat1$")
    public void iShouldSeeOrderScreenWithMenuItemPrizeAsInSplitSeat(String amount){
        new Discount().verifyMenuItemPrizeIsDisplayedInSplitSeat1(amount);
    }

    @Then ("^I should see orderscreen with menu item prize as \"([^\"]*)\" in split seat2$")
    public void iShouldSeeOrderScreenWithMenuItemPrizeAsInSplitSeat2(String amount){
        new Discount().verifyMenuItemPrizeIsDisplayedInSplitSeat2(amount);
    }

    @Then ("^I should see order cannot moved popup message$")
    public void iShouldSeeOrderCannotMovedPopupMessage(){
        Assert.assertEquals(new TableLayOutScreen().verifyOrderCannotMovedPopup(),"Order cannot be moved, Payment(s) has been made in seat - 1");
    }

    @Then ("^I should see order cannot moved popup message1$")
    public void iShouldSeeOrderCannotMovedPopupMessage1(){
        Assert.assertEquals(new TableLayOutScreen().verifyOrderCannotMovedPopup1(),"Order cannot be moved, Payment(s) has been made in seat - 2");
    }

    @Then ("^I should see selected seat item should club into one seat$")
    public void iShouldSeeSelectedSeatItemShouldClubIntoOneSeat(){
        new TableLayOutScreen().verifyClubItem();
    }

    @Then ("^I should get back to the Table Layout tab$")
    public void iShouldGetBackToTheTableLayoutTab() throws InterruptedException {
        Assert.assertEquals(new OrdersAndDriversListScreen().verifyTableLayoutTab(),"Table layout");
    }
    @Then ("^I should see table layout Screen$")
    public void iShouldSeeTableLayoutScreen() throws InterruptedException {
        Assert.assertEquals(new OrdersAndDriversListScreen().verifyTableLayoutTab(),"Table layout");
    }
    @Then ("^I should see seated status is not change$")
    public void iShouldSeeSeatedStatusIsNotChange(){
        new TableLayOutScreen().verifySeatedStatus();
    }

    @Then ("^I should see check down is increased$")
    public void iShouldSeeCheckDownIsIncreased() throws InterruptedException {
        new TableLayOutScreen().verifyCheckDownIsIncreased();
    }

    @Then ("^I click Start Over Button to come back original stage$")
    public void iClickStartOverButtonToComeBackOriginalStage() throws InterruptedException {
        new TableLayOutScreen().clickStartOver();
    }

    @And ("^I click print button in the split seat screen$")
    public void iClickPrintButtonInTheSplitSeatScreen() throws InterruptedException {
        new TableLayOutScreen().pressPrintInSplitSeat();
    }

    @Then ("^I should see select the seat to print popup$")
    public void iShouldSeeSelectTheSeatToPrintPopup(){
        Assert.assertEquals(new TableLayOutScreen().getSelectTheSeatToPrint(),"Select the seat to print");
    }

    @Then ("^I should see Receipt Printer popup$")
    public void iShouldSeeReceiptPrinterPopup(){
        Assert.assertEquals(new TableLayOutScreen().getReceiptPrinterMsg(),"Receipt Printer");
    }

    @Then ("^I should see select any one seat/check for print popup$")
    public void iShouldSeeSelectAnyOneSeatOrCheckForPrintPopup(){
        Assert.assertEquals(new TableLayOutScreen().getSelectAnyOneSeatForPrint(),"Select any one seat/check for print");
    }

    @And ("^I click print All button in the split seat screen$")
    public void iClickPrintAllButtonInTheSplitSeatScreen(){
        new TableLayOutScreen().pressPrintAll();
    }

    @And ("^I click print button in the split check screen$")
    public void iClickPrintButtonInTheSplitCheckScreen(){
        new TableLayOutScreen().clickPrintButtonSplitCheck();
    }

    @And("^I click print All Button in the split check screen$")
     public void iClickPrintAllButtonInTheSplitCheckScreen(){
        new TableLayOutScreen().printAllBtn();
    }
    @Then ("^I should see Seat 2 is hide$")
    public void iShouldSeeSeat2IsHide(){
        new TableLayOutScreen().findSeat2();
    }

    @And ("^I click Pay Button in Split Screen$")
    public void iClickPayButtonInSplitScreen(){
        new TableLayOutScreen().pressPayBtn();
    }

    @Then ("^I should see empty seat cannot paid popup$")
    public void iShouldSeeEmptySeatCannotPaidPopup(){
        Assert.assertEquals(new TableLayOutScreen().verifyEmptySeatPopup(),"Empty seat cannot paid");
    }

    @And ("^I click the Exit button in the payment window$")
    public void iClickTheExitButtonInThePaymentWindow() throws InterruptedException {
        new PaymentWindow().pressExit();
    }

    @Then ("^I should see Select the seat to pay in popup$")
    public void iShouldSeeSelectTheSeatToPayInPopup() throws InterruptedException {
        Assert.assertEquals(new TableLayOutScreen().getSelectTheSeatToPay(),"Select the seat to Pay");
    }

    @Then ("^I should see Select any one seat/check for payment in popup$")
    public void iShouldSeeSelectAnyOneSeatCheckForPaymentInPopup() throws InterruptedException {
        Assert.assertEquals( new TableLayOutScreen().getSelectAnyOneSeatCheckForPaymentMsg(),"select any one seat/check for payment");
    }
    @Then ("^I should see selected seat item should club into seat two$")
    public void iShouldSeeSelectedSeatItemShouldClubIntoSeatTwo(){
        new TableLayOutScreen().verifyTouchAndAdd();
    }

    @And ("^I click the split seat from Order screen$")
    public void iClickTheSplitSeatFromOrderScreen() throws InterruptedException {
        new TableLayOutScreen().pressSplitSeatFromOrder();
    }

    @And ("^I click the split check from Order screen$")
    public void iClickTheSplitCheckFromOrderScreen() throws InterruptedException {
        new TableLayOutScreen().pressSplitCheckFromOrder();
    }
    @And ("^I click cash button from the payment method popup$")
    public void iClickCashButtonFromThePaymentMethodPopup() throws Exception {
        new TableLayOutScreen().pressCashBtnPaymentWindow();
    }

    @Then ("^I should see cash payment is added in payment window$")
    public void iShouldSeeCashPaymentIsAddedInPaymentWindow(){
        Assert.assertEquals(new TableLayOutScreen().verifyCashApplied(),"Cash(#1)");
    }
    @Then ("^I should see cash payment is added in payment window as \"([^\"]*)\"$")
    public void iShouldSeeCashPaymentIsAddedInPaymentWindowAs(String name){
        new TableLayOutScreen().verifyCashApplied1(name);
    }
    @Then ("^I should see amount as \"([^\"]*)\"$")
    public void iShouldSeeAmountAs(String name){
        new TableLayOutScreen().verifyCashApplied1(name);
    }
    @And ("^I click other button from the payment method popup$")
    public void iClickOtherButtonFromThePaymentMethodPopup() throws Exception {
        new PaymentWindow().clickOtherBtn();
    }

    @And ("^I click side cc button in the payment window$")
    public void iClickSideCCButtonInThePaymentWindow() throws Exception {
        new PaymentWindow().clickSideCCBtn();
    }

    @Then ("^I should see Split is not allowed no orders in this check$")
    public void iShouldSeeSplitIsNotAllowedNoOrdersInThisCheck(){
        Assert.assertEquals(new TableLayOutScreen().getSplitIsNotAllowedNoOrderInThisCheck(),"Split is not allowed, no order(s) in this check");
    }

    @Then ("^I should see Split is not allowed payment in this check$")
    public void iShouldSeeSplitIsNotAllowedPaymentInThisCheck(){
        Assert.assertEquals(new TableLayOutScreen().getSplitIsNotAllowedPaymentInThisCheck(),"Split is not allowed, payment(s) has been made in this check");
    }
    @And ("^I click the Operation button on the Table Layout$")
    public void iClickTheOperationButtonOnTheTableLayout(){
        new TableLayOutScreen().pressOperation();
    }

    @Then ("^I should see operation screen$")
    public void iShouldSeeOperationScreen(){
        new TableLayOutScreen().getOperationScene();
    }

    @And ("^I click close day tab$")
    public void iClickCloseDayTab(){
        new TableLayOutScreen().tapCloseDay();
    }
    @Then ("^I should see close day screen$")
    public void iShouldSeeCloseDayScreen(){
        new TableLayOutScreen().verifyCloseDayScreen();
    }

    @Then ("^I should see credit card value$")
    public void iShouldSeeCreditCardValue(){
        new TableLayOutScreen().getCreditCardValue();
    }

    @And ("^I click Void button on order management screen$")
    public void iClickVoidButtonOnOrderManagementScreen() throws InterruptedException {
        new OrderManagementScreen().pressVoidBtn();
    }

    @Then ("^I should see payment made on this check popup message$")
    public void iShouldSeePaymentMadeOnThisCheckPopupMessage(){
//        Assert.assertEquals(new OrderManagementScreen().getPaymentMadeOnThisCheck(),"Payment(s) made on this Check, Can you return this to Walkin");
        Assert.assertEquals(new OrderManagementScreen().getPaymentMadeOnThisCheck(),"Payment(s) made on this Check, Can you return this to Walkin Walkin");
    }

    @Then ("^I should see payment made on this check popup message1$")
    public void iShouldSeePaymentMadeOnThisCheckPopupMessage1(){
//        Assert.assertEquals(new OrderManagementScreen().getPaymentMadeOnThisCheck(),"Payment(s) made on this Check, Can you return this to Walkin");
        Assert.assertEquals(new OrderManagementScreen().getPaymentMadeOnThisCheck1(),"Payment(s) made on this Check, Can you return this to Walkin Test Automation");
    }

    @Then ("^I should see payment made on this check popup message for house account$")
    public void iShouldSeePaymentMadeOnThisCheckPopupMessageForHouseAccount(){
        Assert.assertEquals(new OrderManagementScreen().getPaymentMadeOnThisCheckHouseAccount(),"Payment(s) made on this check,Can you return this to Auto ragav");
    }


    @Then ("^I should see All orders are voided$")
    public void iShouldSeeAllOrdersAreVoided(){
        Assert.assertEquals(new OrderManagementScreen().getAllOrdersAreVoidedMsg(),"All Orders Are Voided");
    }

    @Then ("^I should see the void reason popup$")
    public void iShouldSeeTheVoidReasonPopup(){
        Assert.assertEquals(new OrderManagementScreen().getVoidReasonPopup(),"Void Reason");
    }
    @And ("^I click void Reason on the void popup$")
    public void iClickVoidReasonOnTheVoidPopup(){
        new OrderManagementScreen().selectOrderedWrongly();
    }

    @And ("^I click Add Button on the void reason popup$")
    public void iClickAddButtonOnTheVoidReasonPopup() throws InterruptedException {
        new OrderManagementScreen().pressAddVoidReasonBtn();
    }

    @And ("^I click Add Button on the void reason popup1$")
    public void iClickAddButtonOnTheVoidReasonPopup1(){
        new OrderManagementScreen().pressAddVoidReasonBtn1();
    }

    @And ("^I click Add Button on the void reason popup3$")
    public void iClickAddButtonOnTheVoidReasonPopup3(){
        new OrderManagementScreen().pressAdd2Void();
    }

    @Then ("^I should see that OrderScreen with Merge seats as \"([^\"]*)\"$")
    public void iShouldSeeThatOrderScreenWithMergeSeatsAs(String seat) throws InterruptedException {
        new TableLayOutScreen().verifyAllSeatIsMerged(seat);
    }
    @And ("^I click Search Button on the Order Screen$")
    public void iClickSearchButtonOnTheOrderScreen(){
        new OrderManagementScreen().pressOptions();
        new OrderManagementScreen().pressSearch();
    }
    @Then ("^I should see search field on the Order screen$")
    public void iShouldSeeSearchFieldOnTheOrderScreen(){
        new OrderManagementScreen().verifySearchField();
    }
    @Then ("^I should see Tick mark in the Menu item$")
    public void iShouldSeeTickMarkInTheMenuItem(){
        new OrderManagementScreen().verifyTickIcon();
    }
    @And ("^I click No thanks Button on the print receipt$")
    public void iClickNoThanksButtonOnThePrintReceipt(){
        new TableLayOutScreen().pressNoThanks();
    }

    @And ("^I click Order List with Menu item as \"([^\"]*)\"$")
    public void iClickOrderListWithMenuItemAs(String Name){
        new OrderManagementScreen().pressOrderListWithSale(Name);
    }

    @Then ("^I should see do you want to send hold menu items to kitchen popup message$")
    public void iShouldSeeDoYouWantToSendHoldMenuItemsToKitchenPopupMessage(){
        Assert.assertEquals(new OrderManagementScreen().getdoYouWantToSendHoldMenuItemToKitchenMsg(),"Do you want to send hold menu item(s) to kitchen?");
    }
    @And ("^I click Yes button on the popup for Hold item$")
    public void iClickYesButtonOnThePopupForHoldItem(){
        new OrderManagementScreen().pressYesForHold();
    }


    /******************* ORDER SCREEN ************************************/

    @And ("^I click huge amount for complete sale$")
    public void iClickHugeAmountForCompleteSale(){
        new PaymentWindow().pressTL100();
    }
    @Then ("^I should see change Due popup$")
    public void iShouldSeeChangeDuePopup(){
        Assert.assertEquals(new PaymentWindow().getChangeDueMsg(),"Change Due");
    }

    @And ("^I enter huge amount than Menu item price$")
    public void iEnterHugeAmountThanMenuItemPrice(){
        new PaymentWindow().enterHugePayment();
    }
    @And ("^I click table number on the Order Screen as \"([^\"]*)\"$")
    public void iClickTableNumberOnTheScreen(String table_no) throws InterruptedException {
        new OrderManagementScreen().pressTableNumber(table_no);
    }

    @Then ("^I should see cannot add modifiers popup$")
    public void iShouldSeeCannotAddModifiersPopup(){
        Assert.assertEquals(new OrderManagementScreen().verifyCannotAddModifierTxt(),"Cannot add modifiers, item already send to kitchen");
    }
    @Then ("^I should see You need to order before you paying popup$")
    public void iShouldSeeYouNeedToOrderBeforeYouPayingPopup() throws InterruptedException {
        Assert.assertEquals(new OrderManagementScreen().getYouNeedToOrderBeforeYouPayMsg(),"You need to order before paying");
    }
    @And ("^I click payment in the payment window$")
    public void iClickPaymentInThePaymentWindow(){
        new PaymentWindow().selectPayment();
    }

    @And ("^I click payment for all seat in the payment window$")
    public void iClickPaymentForAllInThePaymentWindow(){
        new PaymentWindow().selectPayment();
    }

    @And ("^I click payment for all seat in the payment window1$")
    public void iClickPaymentForAllInThePaymentWindow1(){
        new PaymentWindow().selectPayment1();
    }

    @And ("^I click Ok button in receipt printer popup$")
    public void iClickOkButtonInReceiptPrinterPopup(){
        new PaymentWindow().pressOKBtnPopup();
    }

    @Then ("^I should see device offline popup$")
    public void iShouldSeeDeviceOfflinePopup(){
        new PaymentWindow().verifyOfflinePopup();
    }
    @And ("^I click Delete button on the payment window$")
    public void iClickDeleteButtonOnThePaymentWindow(){
        new PaymentWindow().pressDeletePaymentBtn();
    }
    @And ("^I click Adjust button in the payment window$")
    public void iClickAdjustButtonInThePaymentWindow(){
        new PaymentWindow().pressAdjustBtn();
    }

    @And ("^I click Adjust button in the payment window after Payment$")
    public void iClickAdjustButtonInThePaymentWindowAfterPayment(){
        new PaymentWindow().pressAdjustBtnForPayment();
    }
    @Then ("^I should see No more payment needed popup$")
    public void iShouldSeeNoMorePaymentNeededPopUp() throws InterruptedException {
        new OrderManagementScreen().getNoMorePaymentNeedPopup();
    }
    @Then ("^I should see No more payment needed popup from Payment window$")
    public void iShouldSeeNoMorePaymentNeededPopUpFromPaymentWindow(){
        new OrderManagementScreen().getNoMorePaymentNeed1Popup();
    }

    @Then ("^I should see Cash payment is deleted$")
    public void iShouldSeeCashPaymentIsDeleted(){
        new PaymentWindow().verifyCashGotDel();
    }
    @Then ("^I should see select payment and try again popup$")
    public void iShouldSeeSelectPaymentAndTryAgainPopUp(){
        Assert.assertEquals(new PaymentWindow().getSelectAnyPaymentAndTryAgainMsg(),"Select a payment and try again!");
    }
    @Then ("^I should see Balance Due on the payment window$")
    public void iShouldSeeBalanceDueOnThePaymentWindow(){
        new PaymentWindow().verifyBalanceDue();
    }
    @And ("^I click Exact button on the payment pop-up$")
    public void iClickExactButtonOnThePaymentPopup(){

    }
    @Then ("^I should see No Due on the Payment window$")
    public void iShouldSeeNoDueOnThePaymentWindow(){
        new PaymentWindow().verifyNoDue();
    }

    @And ("^I click amount by manually$")
    public void iClickAmountByManually(){
        new ClockInScreen().priceFrenchFries();
    }
    @And ("^I click partial amount from the payment window$")
    public void iClickPartialAmountFromThePaymentWindow(){
        new PaymentWindow().pressTl10();
    }
    @Then ("^I should see please pay amount$")
    public void iShouldSeePleasePayAmount(){
        Assert.assertEquals(new PaymentWindow().getPleasePayAmountMsg(),"Please pay $ 5.00");
    }
    @Then ("^I should see please pay amount for One seat$")
    public void iShouldSeePleasePayAmountForOneSeat(){
        Assert.assertEquals(new PaymentWindow().getPleasePayAmountMsg1(),"Please pay $ 15.00");
    }
    @And ("^I click huge amount for complete payment by manually$")
    public void iClickHugeAmountForCompletePaymentByManually(){
        new ClockInScreen().enterHugePayment();
    }

    @And ("^I enter the payment value as \"([^\"]*)\"$")
    public void iEnterThePaymentValueAs(String value){
        new ClockInScreen().enterManualPayment(value);
    }
    @And ("^I click total payment by manually 2 seat$")
    public void iClickTotalPaymentByManually2Seat(){
        new ClockInScreen().enterFrenchFrieseAmount();
    }

    @And("^I click total payment by manually 3 seat$")
    public void iClickTotalPaymentByManually3Seat(){
        new ClockInScreen().enterFrenchFrieseAmount3seat();
    }
    @Then ("^I should see modifier screen$")
    public void iShouldSeeModifierScreen(){
        Assert.assertEquals(new OrderManagementScreen().getModifierScreen(),"Modifiers");
    }
    @And ("^I click modifier as \"([^\"]*)\" on modifier screen$")
    public void iClickModifier(String modifier_1) throws InterruptedException {
        new OrderManagementScreen().selectModifierInModifierScreen(modifier_1);
    }

    @And ("^I click Ok button on the modifier screen$")
    public void iClickOkButtonOnTheModifierScreen(){
        new PaymentWindow().pressOkButton();
    }

    @And ("^I should see selected Modifier as Butter$")
    public void iShouldSeeSelectedModifierAsButter(){
        new OrderTypeWindow().verifyModifierInOrderList();
    }
    @And ("^I click modifier as \"([^\"]*)\" Maximum time$")
    public void iClickModifierAsMaximumTime(String maxModify) throws InterruptedException {
        new OrderManagementScreen().selectModifierForMoreTime(maxModify);
    }
    @Then ("^I should see modifiers added in the Selected modifiers as \"([^\"]*)\"$")
    public void iShouldSeeModifiersAddedInTheSelectedModifiersAs(String name){
        new TableLayOutScreen().selectModifiersFromModifyScreen(name);
    }
    @And ("^I touch and swipe the modifiers$")
    public void iTouchAndSwipeTheModifiers() throws InterruptedException {
        new TableLayOutScreen().swipeTheModifiers();
    }

    @And ("^I click delete button for delete modifiers$")
    public void iClickDeleteButtonForDeleteModifiers(){
        new TableLayOutScreen().clickDeleteBtn();
    }
    @And ("^I click new check button on the Table layout screen$")
    public void iClickNewCheckButtonOnTheTableLayoutScreen(){
        new TableLayOutScreen().pressNewCheckButton();
    }
    @Then ("^I should see as \"([^\"]*)\" on the order screen$")
    public void iShouldSeeAsOnTheOrderScreen(String seatNo) throws InterruptedException {
        new OrderManagementScreen().seatWithOrderScreen(seatNo);
    }
    @Then ("^I should see mulitiple check change on Table layout screen$")
    public void iShouldSeeMultipleCheckChangeOnTableLayoutScreen(){
        new TableLayOutScreen().mulitpleCheckVisible();
    }
    @And ("^I select check for complete sale$")
    public void iSelectCheckForCompleteSale() throws Exception {
        new TableLayOutScreen().closeTheChecks1();
        new OrderManagementScreen().pressPayment();
        new TableLayOutScreen().pressCashBtnPaymentWindow();
        new PaymentWindow().pressSubmitBtn();
    }


    @Then ("^I should see menu items has to be sent to the kitchen$")
    public void iShouldSeeMenuItemsHasToBeSentToKitchen() throws InterruptedException {
        Assert.assertEquals(new TableLayOutScreen().MenuItemHasToSentKitchen(),"Item(s) has to be sent to kitchen");
    }
    @Then ("^I should see item need to send to kitchen popup$")
    public void iShouldSeeItemNeedToSendToKitchenPopup(){
        Assert.assertEquals(new TableLayOutScreen().getItemsNeedToSendToKitchen(),"Item(s) has to be sent to kitchen");
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
        new CheckStatusScreen().selectCloseCheck4(num);
    }

    @And ("^I pass menu item to search and click the menu item as \"([^\"]*)\"$")
    public void iPassMenuItemToSearchAndClickTheMenuItem(String menu_item) throws InterruptedException {
        new OrderManagementScreen().selectMenuItemSearch(menu_item);
    }
    @Then ("^I should see no menu item found text$")
    public void iShouldSeeNoMenuItemFoundText(){
        Assert.assertEquals(new OrderManagementScreen().verifyNoMenuItemFoundTxt(),"______ NO MENU ITEMS FOUND IN \"PAROTTAS\" ______");
    }
    @Then ("^I should see menu item added into Order list$")
    public void iShouldSeeMenuItemAddedIntoOrderList() throws InterruptedException {
        new OrderManagementScreen().getOrderList();
        new OrderTypeWindow().verifySearchSaleAdded();
    }
    @And ("^I click the arrow button in the Merge Box$")
    public void iClickTheArrowButtonInTheMergeBox(){
        new TableLayOutScreen().pressMergeSlider();
    }
    @And ("^I click the arrow button in the Merge Box1$")
    public void iClickTheArrowButtonInTheMergeBox1(){
        new TableLayOutScreen().pressMergeSlider1();
    }

    @Then ("^I should see transaction void successful popup$")
    public void iShouldSeeTransactionVoidSuccessfulPopup(){
        new PaymentWindow().verifyTransactionVoidSuccess();
    }

    @And ("^I click cancel button on the table layout screen$")
    public void iClickCancelButtonOnTheTableLayoutScreen(){
        new TableLayOutScreen().clickCancelBtn();
    }

    @Then("^I should see the serving size screen$")
    public void iShouldSeeTheServingSizeScreen() throws IOException {
        new OrderManagementScreen().verifyServingSize();
    }

    @And ("^I get the serving size$")
    public void iGetTheServingSize(){
        new OrderManagementScreen().getServingSize();
    }

    @Then ("^I should see the serving size cell$")
    public void iShouldSeeTheServingSizeCell(){
        new OrderManagementScreen().verifySizeCell();

    }
    @And ("^I click prefix modifier$")
    public void iClickPrefixModifier(){
        new OrderManagementScreen().clickPrefixModifierBtn();
    }

    @And ("^I click Mandatory Modifier in conversational screen$")
    public void iClickMandatoryModifierInConversationalScreen(){
        new OrderManagementScreen().clickModifierFromConversationalScreen();
    }

    @Then ("^I should see Mandatory Modifier in conversational screen$")
    public void iShouldSeeMandatoryModifierInConversationalScreen(){
        new OrderManagementScreen().verifyMandatoryModifierFromConversationalScreen();
    }
    @Then ("^I should see cancel button is enable$")
    public void iShouldSeeCancelButtonIsEnable(){
        new OrderManagementScreen().verifyCancelBtnIsEnable();
    }
    @Then ("^I should see start over button is enable$")
    public void iShouldSeeStartOverButtonIsEnable(){
        new OrderManagementScreen().verifyStartOverBtnIsEnable();
    }
    @Then ("^I should see done button is enable$")
    public void iShouldSeeDoneButtonIsEnable(){
        new OrderManagementScreen().verifyDoneBtnIsEnable();
    }

    @Then ("^I should see include modifier added with menu item$")
    public void iShouldSeeIncludeModifierAddedWithMenuItem(){
        new OrderManagementScreen().verifyIncludeModifierIsAdded();
    }

    @And ("^I click start over button in coversational modifier screen$")
    public void iClickStartOverButtonInConversationalModifierScreen(){
        new OrderManagementScreen().clickStartOverInConversational();
    }

    @And ("^I click include modifier in conversational screen$")
    public void iClickIncludeModifierInConversationalScreen(){
        new OrderManagementScreen().clickInculdeModifier();
    }

    @And ("^I click alternate modifier button in conversational modifier screen$")
    public void iClickAlternateModifierButtonInConversationalModifierScreen(){
        new OrderManagementScreen().clickAlternateModifierScreen();
    }

    @Then ("^I should see alternate modifier screen$")
    public void iShouldSeeAlternateModifierScreen(){
        new OrderManagementScreen().verifyAlternateModifierScreen();
    }
    @And ("^I click modifier from alternate modifier screen$")
    public void iClickModifierFromAlternateModifierScreen(){
        new OrderManagementScreen().clickModifierFromAlternateModifierScreen();
    }
    @And ("^I click ok button in alternate modifier screen$")
    public void iClickOkButtonInAlternateModifierScreen(){
        new OrderManagementScreen().clickOkBtnInAlternateModifierScreen();
    }

    @Then ("^I should see include modifier in conversational modifier screen$")
    public void iShouldSeeIncludeModifierInConversationalModifierScreen(){
        new OrderManagementScreen().verifyIncludeModifier();
    }

    @And ("^I click Revert button in alternate modifier screen$")
    public void iClickRevertButtonInAlternateModifierScreen(){
        new OrderManagementScreen().clickRevertButton();
    }

    @Then ("^I should see cannot remove customer for delivery popup$")
    public void iShouldSeeCannotRemoveCustomerForDeliveryPopup(){
        Assert.assertEquals(new OrderManagementScreen().verifyCannotRemoveCustomer(),"Cannot remove customer for Delivery");
    }
    @Then ("^I should see modifier added with menu item$")
    public void iShouldSeeModifierAddedWithMenuItem(){
        new OrderManagementScreen().verifyModifierAddedWithMenu();
    }

    @Then ("^I should see Mandatory Modifier in conversational screen with count of maximum and minimum$")
    public void iShouldSeeMandatoryModifierInConversationalScreenWithCountOfMaximumAndMinimum(){
        new OrderManagementScreen().verifyMaximumAndMinimumCount();
    }

    @Then("^I should see you need to pick atleast 1 modifiers from this group popup$")
    public void iShouldSeeYouNeedToPickAtleast1ModifiersFromThisGroupPopup(){
        Assert.assertEquals(new OrderManagementScreen().verifyYouNeedToPickAtleastModifierFromThisGroup(),"You need to pick at least 1 modifiers from this Group");
    }

    @And ("^I do split seat$")
    public void iDoSplitSeat(){
        new Regression().doSplitAction();
    }

    @And ("^I select the menu item for Split Evenly$")
    public void iSelectTheMenuItemForSplitEvenly(){
        new Regression().selectMenuForSplitEvenly();
    }
    @And ("^I select the menu item for Split")
    public void iSelectTheMenuItemForSplit(){
        new Regression().selectMenuForSplitAction();
    }

    @And ("^I select the menu item for Seperate item as \"([^\"]*)\"$")
    public void iSelectTheMenuItemForSeperateITemAs(String number){
        new Regression().splitSeperateItem(number);
    }

    @And ("^I select the menu item for group seat$")
    public void iSelectTheMenuItemForGroupSeat(){
        new Regression().selectMenuForGroupSeat();
    }

    @And ("^I open the active check do split$")
    public void iOpenTheActiveCheckDoSplit(){
        new Regression().openTheCheckByTableNum();
    }

    @And ("^I make the sale for new user$")
    public void iMakeTheSaleForNewUser() throws Exception {
        new Regression().makeSaleForNewUser();
    }

    @And ("^I select the menu for QSR$")
    public void iSelectTheMenuForQsr(){
        new Regression().selectMenuForQSR();
    }

    @And ("^I select Menu For Dine In$")
    public void iSelectMenuForDineIn(String cate) throws Exception {
        new Regression().selectMenuForDineIn(cate);
    }

    @And ("^I select Menu For Dine In1$")
    public void iSelectMenuForDineIn1() throws InterruptedException {
        new Regression().selectMenuForDineIn1();
    }

    @And ("^I do group seat$")
    public void iDoGroupSeat(){
        new Regression().dogroupSeat();
    }

    @And("^I select the Menu")
    public void iSelectTheMenu(){
        new Regression().selectMenu();
    }

    @And ("^I click Merge button for multi$")
    public void iClickMergeButtonForMulti(){
        new Regression().doMerge();
    }

    @And ("^I do merge$")
    public void iDoMerge() throws InterruptedException {
        new Regression().mergeAction1();
    }

    @And ("^I select Menu For Dine Merge$")
    public void iSelectMenuForDineMerge() throws Exception {
        new Regression().selectMenuForDineInMerge();
    }

    @And ("^I select Menu For Basic validation as \"([^\"]*)\"$")
    public void iSelectMenuForBasicValidationAs(String cate){
        new Regression().selectMenuForBasicValidation(cate);
    }

    @And ("^I select Menu For Basic validation2 as \"([^\"]*)\"$")
    public void iSelectMenuForBasicValidation2As(String cate){
        new Regression().selectMenuCloudPOSSs(cate);
    }


    @And ("^I get the total of menu item in order screen$")
    public void iGetTheTotalOfMenuItemInOrderScreen()throws InterruptedException {
        new OrderManagementScreen().getTotalOfMenuInOrderscreen();
    }

    @And ("^I get the menu from the order screen$")
    public void iGetTheMenuFromTheOrderScreen(){
        new OrderManagementScreen().getTheMenuInTheOrderScreen();
    }
    @And("^I select Menu of Basic validation for QSR as \"([^\"]*)\"")
    public void iSelectMenuOfBasicValidationForQsrAs(String cate){
        new Regression().selectMenuBasicValidationForQsr(cate);
    }

    @When ("^I click batch/Tip adjustment button$")
    public void iClickBatchTipAdjustmentButton(){
        new TableLayOutScreen().clickBatchTipButton();
    }

    @And ("^I click the device drop down button on the batch screen$")
    public void iClickTheDeviceDropDownButtonOnTheBatchScreen() throws InterruptedException {
        new TableLayOutScreen().clickDeviceDropDownButtonBatchScreen();
    }

    @Then ("^I should see the list of checks in batch screen$")
    public void iShouldSeeTheListOfChecksInBatchScreen(){
        new TableLayOutScreen().verifyChecksInBatchScreen();
    }
    @Then ("^I should see batch has been initiated popup$")
    public void iShouldSeeBatchHasBeenInitiatedPopup(){
        new TableLayOutScreen().verifyBatchInitiatedPopup();
    }

    @And ("^I select the MPPG Payment name in the device list$")
    public void iSelectTheMppgPaymentNameInTheDeviceList() throws Exception {
        new TableLayOutScreen().selectTheMppgPaymentInDevice();
    }

    @Then("^I should see last batch started text$")
    public void iShouldSeeLastBatchStartedText() throws Exception {
        new TableLayOutScreen().verifyLastBatchStartedText();
    }

    @When ("^I click the check from batch screen$")
    public void iClickTheCheckFromBatchScreen(){
        new TableLayOutScreen().clickTheCheckFromBatchScreen();
    }

    @When ("^I click the check from batch screen1$")
    public void iClickTheCheckFromBatchScreen1(){
        new TableLayOutScreen().clickTheCheckFromBatchScreen1();
    }

    @And ("^I change tip amount in batch screen$")
    public void iChangeTipAmountInBatchScreen(){
        new TableLayOutScreen().changeTipAmount();
    }

    @And ("^I change tip amount in batch screen1$")
    public void iChangeTipAmountInBatchScreen1(){
        new TableLayOutScreen().changeTipAmount1();
    }

    @Then ("^I should see invalid tip amount popup$")
    public void iShouldSeeInvalidTipAmountPopup(){
        new TableLayOutScreen().shouldSeeInvalidTipAmountPopup();
    }

    @Then ("^I should see tip Amount is applied or not$")
    public void iShouldSeeTipAmountIsAppliedOrNot(){
        new TableLayOutScreen().VerifyTipAmountIsAppliedOrNot();
    }

    @And ("^I have make sale for batch as \"([^\"]*)\"$")
    public void iHaveMakeSaleForBatchAs(String cate) throws Exception {
        new Regression().makeSaleForBatchInPhoneStore(cate);
    }

    @Then ("^I have verify check in the batch screen$")
    public void iHaveVerifyCheckInTheBatchScreen() throws InterruptedException {
        new Regression().verifyBatchCheckAvailable();
    }

    @And ("^I do batch for vourl as \"([^\"]*)\"$")
    public void iDoBatchForVourl(String cate){
        new Regression().doBatchForVourl(cate);
    }

    @And ("^I get value the menu values from order screen$")
    public void iGetValueTheMenuValuesFromOrderScreen(){
        new Regression().getMenuValues();
    }

    @And ("^I get order screen value the menu values from order screen$")
    public void iGetOrderScreenValueTheMenuValuesFromOrderScreen(){
        new Regression().getOrderScreenMenuValues();
    }

    @And ("^I get order screen value the menu values from order screen1$")
    public void iGetOrderScreenValueTheMenuValuesFromOrderScreen1(){
        new Regression().getOrderScreenMenuValues1();
    }

    @And ("^I get value the menu values from order screen1$")
    public void iGetValueTheMenuValuesFromOrderScreen1(){
        new Regression().getMenuValues1();
    }

    @When ("^I verify the menu after merge done$")
    public void iVerifyTheMenuAfterMergeDone(){
        new Regression().verifyMenuAfterMergeDone();
    }

    @When ("^I verify the menu prize after merge done$")
    public void iVerifyTheMenuPrizeAfterMergeDone(){
        new Regression().verifyTheMenuPrizeAfterMergeDone();
    }

    @When ("^I verify the menu prize after merge done for bartab only$")
    public void iVerifyTheMenuPrizeAfterMergeDoneForBarTabOnly(){
        new Regression().verifyTheMenuPrizeAfterMergeDoneForBarTabOnly();
    }
    @When ("^I verify the menu prize after merge done for check based amount$")
    public void iVerifyTheMenuPrizeAfterMergeDoneForCheckBasedAmount(){
        new Regression().verifyTheMenuPrizeAfterMergeDoneForCheckBasedAmount();
    }
    @When ("^I validate the menu values in the order screen$")
    public void iValidateTheMenuValuesInTheOrderScreen(){
        new Regression().validateTheMenuValueInOrderScreen();
    }

    @When ("^I click the check from the table layout$")
    public void iClickTheCheckFromTheTableLayout() throws InterruptedException {
        new TableLayOutScreen().selectTheCheckFromTableLayout();
    }

    @When ("^I click the check from the table layout for merged$")
    public void iClickTheCheckFromTheTableLayoutForMerged() throws InterruptedException {
        new OrderManagementScreen().clickTheCheckFromTheTableLayoutForMerged();
    }

    @Then ("^I should see on merging the particular checks popup$")
    public void iShouldSeeOnMergingTheParticularCheckPopup(){
        new TableLayOutScreen().ShouldSeeOnMergingTheParticularCheckPopup();
    }

    @Then("^I should see merge checks confirmation popup$")
    public void iShouldSeeMergeChecksConfirmationPopup(){
        new TableLayOutScreen().mergeCheckConfirmationPopup();
    }

    @And ("^I click confirm button on the merge check confirmation popup$")
    public void iClickConfirmButtonOntheMergeCheckConfirmationPopup(){
        new TableLayOutScreen().clickConfirmButton();
    }
    @When ("^I click the check from the table layout for merged1$")
    public void iClickTheCheckFromTheTableLayoutForMerged1() throws InterruptedException {
        new TableLayOutScreen().clickTheCheckFromTheTableLayoutForMerged1();
    }
    @Then ("^I should see the Split check screen$")
    public void iShouldSeeTheSplitCheckScreen(){
        new TableLayOutScreen().verifySplitCheckScren();
    }

    @When ("^I verify the Active check with split check$")
    public void iVerifyTheActiveCheckWithSplitCheck(){
        new Regression().verifyActiveCheckWithSplitCheck();
    }

    @And ("^I click Add Button on the split check screen$")
    public void iClickAddButtonOnTheSplitCheckScreen(){
        new Regression().clickAddButtonOntheSplitCheckScreen();
    }

    @Then ("^I should see new check added on the split check screen$")
    public void iShouldSeeNewCheckAddedOnTheSplitCheckScreen(){
        new Regression().VerifyNewCheckAddedOnTheSplitCheckScreen();
    }

    @And ("^I click the menu on the split check screen$")
    public void iClickTheMenuOnTheSplitCheckScreen(){
        new Regression().ClickTheMenuOnTheSplitCheckScreen();
    }

    @And("^I click the menu on the split seat screen$")
    public void iClickTheMenuOnTheSplitSeatScreen(){
        new Regression().ClickTheMenuOnTheNewSplitSeatScreen();
    }

    @And ("^I click new check added on the split check screen$")
    public void iClickNewCheckAddedOnTheSplitCheckScreen(){
        new Regression().clickNewCheckOnTheSplitCheckScreen();
    }

    @When ("^I verify the menu is moved to the added check seat$")
    public void iVerifyTheMenuIsMovedToTheAddedCheckSeat(){
    new Regression().verifyTheMenuIsMovedToTheAddedCheckSeat();
    }

    @Then ("^I should see please save all the changes to print popup$")
    public void iShouldSeePleaseSaveAllTheChangesToPrintPopup(){
        new Regression().verifyThePleaseSaveAlltheChangesToPrintPopup();
    }

    @When ("^I verify the check is splitted and check number is increased$")
    public void iVerifyTheCheckIsSplittedAndCheckNumberIsIncreased(){
        new Regression().verifyCheckNumberIsSplittedAndCheckNumberIsIncreased();
    }

    @When ("^I verify primary check is opened after split check is done$")
    public void iVerifyPrimaryCheckIsOpenedAfterSplitCheckIsDone(){
        new Regression().verifyPrimaryCheckIsOpened();
    }

    @And ("^I click split by seat in the split check screen$")
    public void iClickSplitBySeatInTheSplitCheckScreen(){
        new TableLayOutScreen().clickSplitBySeatInSplitCheck();
    }

    @Then ("^I should see seat available in the split check$")
    public void iShouldSeeSeatAvailableInTheSplitCheck(){
        new TableLayOutScreen().verifySeatsAvaliableInSplitCheck();
    }

    @Then ("^I should see seat available in the split check1$")
    public void iShouldSeeSeatAvailableInTheSplitCheck1(){
        new TableLayOutScreen().verifySeatsAvaliableInSplitCheck1();
    }

    @When ("^I verify the splitted check is available in active checks tab$")
    public void iVerifyTheSplittedCheckIsAvailableInActiveCheckTab(){
        new TableLayOutScreen().verifySplittedCheckAvailableInActiveCheck();
    }

    @And ("^I click split button on the bartab screen$")
    public void iClickSplitButtonOnTheBartabScreen(){
        new BarTabScreen().clickSplitBtn();
    }

    @When ("^I click the check from the bartab screen$")
    public void iClickTheCheckFromTheBartabScreen(){
        new BarTabScreen().clickTheCheckFromTheBartabScreen();
    }

    @When ("^I click the check from the bartab screen for merge$")
    public void iClickTheCheckFromTheBartabScreenForMerge(){
        new BarTabScreen().clickTheCheckFromTheBarTabScreenForMerge();
    }
    @When ("^I click the check from the bartab screen1 for merge$")
    public void iClickTheCheckFromTheBartabScreen1ForMerge(){
        new BarTabScreen().clickTheCheckFromTheBartabScreenForMerge1();
    }

    @Then ("^I should verify menu is splitted evenly$")
    public void iShouldVerifyMenuIsSplittedEvenly(){
        new TableLayOutScreen().verifyMenuIsSplittedEvenly();
    }

    @When ("^I verify all menu is club into single seat after click group seat$")
    public void iVerifyAllMenuIsClubIntoSingleSeatAfterClickGroupSeat(){
        new TableLayOutScreen().verifyAllMenuIsClubIntoSingleSeat();
    }

    @And ("^I verify seat 1 prize and seat 2 prize is same$")
    public void iVerifySeat1PrizeAndSeat2PrizeIsSame(){
        new TableLayOutScreen().verifySeat1PrizeAndSeat2PrizeIsSame();
    }

    @And ("^I get seat 1 prize details$")
    public void iGetSeat1PrizeDetails(){
        new TableLayOutScreen().getSeat1Prize();
    }

    @And ("^I get seat 2 prize details$")
    public void iGetSeat2PrizeDetails(){
        new TableLayOutScreen().getSeat2Prize();
    }

    @And ("^I verify prize details after group seats done$")
    public void iVerifyPrizeDetailsAfterGroupSeatsDone(){
        new TableLayOutScreen().verifyPrizeDetailsAfterGroupSeats();
    }

    @And ("^I get menu details from the group seat 2$")
    public void iGetMenuDetailsFromTheGroupSeat2(){
        new TableLayOutScreen().getMenuDetailsGroupSeat2();
    }

    @And ("^I verify split seat prize with order screen prize$")
    public void iVerifySplitSeatPrizeWithOrderScreenPrize(){
        new TableLayOutScreen().verifySplitSeatPrizeWithOrderScreenPrize();
    }


    @When ("^I verify split seat menu with order screen menu$")
    public void iVerifySplitSeatMenuWithOrderScreenMenu(){
        new TableLayOutScreen().verifySplitMenuWithOrderScreenMenu();
    }

    @When ("^I verify the seat 1 order screen menu with 1st check menu$")
    public void iVerifyTheMenuWithSeat1(){
        new TableLayOutScreen().verifyTheSeat1MenuWith1stCheck();
    }

    @When ("^I verify the seat 2 order screen menu with 2nd check menu$")
    public void iVerifyTheMenuWithSeat2(){
        new TableLayOutScreen().verifyTheSeat2MenuWith1stCheck();
    }

    @And ("^I click table number on the order screen$")
    public void iClickTableNumberOnTheOrderScreen(){
        new TableLayOutScreen().clickTableNumberOnTheOrderScreen();
    }

    @Then ("^I should verify the gratuity value after add auto gratuity value as \"([^\"]*)\"$")
    public void iShouldVerifyTheGratuityValueAfterAddAutoGratuityValueAs(String value){
        new TableLayOutScreen().verifyGratuityValueAfterAddAutoGratuity(value);
    }

    @When ("^I verify seat as paid$")
    public void iVerifySeatAsPaid(){
        new TableLayOutScreen().verifySeatAsPaid();
    }

    @Then ("^I should see the merged popup$")
    public void iShouldSeeTheMergedPopup(){
        new TableLayOutScreen().verifyTheMergedPopup();
    }

    @And ("^I created sale for Cashier out1 as \"([^\"]*)\"$")
    public void iCreatedSaleForCashierOut1As(String cashier) throws InterruptedException {
        new Regression().createdSaleForCashierOut1(cashier);
    }
    @And ("^I created sale for Cashier out2 as \"([^\"]*)\"$")
    public void iCreatedSaleForCashierOut2As(String cashier) throws InterruptedException {
        new Regression().createdSaleForCashierOut2(cashier);
    }
    @And ("^I created sale for Cashier out3 as \"([^\"]*)\"$")
    public void iCreatedSaleForCashierOut3As(String cashier) throws InterruptedException {
        new Regression().createdSaleForCashierOut3(cashier);
    }
    @And ("^I created sale for Cashier out4 as \"([^\"]*)\"$")
    public void iCreatedSaleForCashierOut4As(String cashier) throws InterruptedException {
        new Regression().createdSaleForCashierOut4(cashier);
    }

    @And ("^I created sale for Cashier out5 as \"([^\"]*)\"$")
    public void iCreatedSaleForCashierOut5As(String cashier,String cate) throws InterruptedException {
        new Regression().createdSaleForCashierOut5(cashier);
    }

    @And ("^I select the random table from the table layout$")
    public void iSelectTheRandomTableFromTheTableLayout(){
        new Regression().selectTheRandomTableFromTheTableLayout();
    }


}
