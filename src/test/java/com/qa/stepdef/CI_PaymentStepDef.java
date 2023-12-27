package com.qa.stepdef;

import com.qa.pages.CIPaymentScreen;
import com.qa.pages.CICloseDayScreen;
import com.qa.pages.CIWaitListPage;
import com.qa.pages.CheckOptionsScreen;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import com.qa.utils.TestUtils;

public class CI_PaymentStepDef {

    CIPaymentScreen ciPaymentScreen = new CIPaymentScreen();
    CICloseDayScreen ciCloseDayScreen = new CICloseDayScreen();
    CIWaitListPage ciWaitListPage = new CIWaitListPage();
    TestUtils utils = new TestUtils();

    @Then("^I click \"([^\"]*)\" in the order screen \"([^\"]*)\"$")
    public void iClickInTheOrderScreen(String btnCommon, String msg) {
        ciCloseDayScreen.commonAccessibilityId(btnCommon, msg);
    }

    @When("^I click the existing credit card check in closed tab")
    public void iClickTheExistingCreditCardCheckInClosedTab() {
        new CIPaymentScreen().ClickExistingCheck();
    }

    @And("I click \"([^\"]*)\" in the check stats tab \"([^\"]*)\"$")
    public void iClickInTheCheckStatsTab(String tabClosed, String msg) {
        ciPaymentScreen.commonBtnClickReopen(tabClosed, msg);
    }

    @And("^I select the credit card check in the payment screen \"([^\"]*)\"$")
    public void iSelectTheCreditCardCheckInThePaymentScreen(String msg) {
        ciPaymentScreen.clickOptCreditCardAmount(msg);
    }

    @And("^I click \"([^\"]*)\" in the receipt printer popup\"([^\"]*)\"$")
    public void iClickBtnOkInTheReceiptPrinterPopup(String btnOkXPath, String msg) {
        ciPaymentScreen.ClickBtnOk(btnOkXPath, msg);
    }

    @And("^I click the Wrong Item Ordered \"([^\"]*)\" reason to void my menu item \"([^\"]*)\"$")
    public void iClickTheWrongItemOrderedReasonToVoidMyMenuItem(String btnWrong,String msg) {
        ciPaymentScreen.clickBtnWrong(btnWrong,msg);
    }

    @And("I click \"([^\"]*)\" in the void screen\"([^\"]*)\"$")
    public void iClickInTheVoidScreen(String btnAddXPath, String msg) {
        ciPaymentScreen.ClickBtnAdd(btnAddXPath, msg);
    }

    @When("^I click Exit in the payment screen \"([^\"]*)\"$")
    public void iClickExitInThePaymentScreen(String msg) {
        ciPaymentScreen.ClickBtnExit(msg);
    }

    @And("I click \"([^\"]*)\" in the order screen for void the credit card amount\"([^\"]*)\"$")
    public void iClickInTheOrderScreenForVoidTheCreditCardAmount(String btnPaymentXPath, String msg) {
        ciPaymentScreen.clickBtnPayment(btnPaymentXPath, msg);
    }

    @When("^I click Delete in the payment screen \"([^\"]*)\"$")
    public void iClickDeleteInThePaymentScreen(String msg) {
        ciPaymentScreen.clickBtnDelete(msg);
    }

    @When("I click \"([^\"]*)\" in the top order screen \"([^\"]*)\"$")
    public void iClickInTheTopOrderScreen(String Category, String msg) {
        ciPaymentScreen.commonBtnClickOption(Category, msg);
    }

    @When("^I click \"([^\"]*)\" from the menu item \"([^\"]*)\"$")
    public void iClickFromTheMenuItem(String item, String msg) {
        ciPaymentScreen.commonBtnClickOption(item, msg);
    }

    @And("^I click \"([^\"]*)\" in the option screen\"([^\"]*)\"$")
    public void iClickInTheOptionScreen(String btnTaxExempt, String msg) {
        ciPaymentScreen.commonBtnClick(btnTaxExempt, msg);
    }

    @And("I select \"([^\"]*)\" as goknur loyalty \"([^\"]*)\"$")
    public void iSelectAsGoknurLoyalty(String customer, String msg) {
        new CIPaymentScreen().commonBtnClickOption(customer, msg);
    }

    @And("^I click \"([^\"]*)\" in the order screen for selecting Option \"([^\"]*)\"$")
    public void iClickInTheOrderScreenForSelectingTaxExempt(String btnOption, String msg) {
        ciPaymentScreen.commonBtnClickOption(btnOption, msg);
    }

    @And("^I select the \"([^\"]*)\" in the Tax exempt screen\"([^\"]*)\"$")
    public void iSelectTheInTheTaxExemptScreen(String optCharity, String msg) {
        ciPaymentScreen.commonBtnClickOption(optCharity, msg);
    }

    @Then("^It should show the \"([^\"]*)\" Total amount \"([^\"]*)\"$")
    public void itShouldShowTheTotalAmount(String txtTotal, String msg) {
        String text = ciPaymentScreen.commonBtnClickCIFood(txtTotal,msg);
        Assert.assertEquals(txtTotal,text);
    }

    @And("I click the Drop down button in the order screen")
    public void iClickTheDropDownButtonInTheOrderScreen() {
        ciPaymentScreen.clickBtnDropDown();
    }

    @And("I click \"([^\"]*)\" in the All Tab Screen \"([^\"]*)\"$")
    public void iClickInTheAllTabScreen(String btnAll, String msg) {
        ciPaymentScreen.commonBtnClick(btnAll,msg);
    }

    @And("I click New Tab in the Bar Tab Screen")
    public void iClickNewTabInTheBarTabScreen() {
        new CIPaymentScreen().clickNewTab();
    }

    @And("^I click \"([^\"]*)\" in the preauth popup \"([^\"]*)\"$")
    public void iClickInThePreauthPopup(String btnExit, String msg) {
        new CIPaymentScreen().commonBtnClick(btnExit,msg);
    }

    @Then("I click \"([^\"]*)\" in the lower order screen \"([^\"]*)\"$")
    public void iClickInTheLowerOrderScreen(String btnPayment, String msg) {
        ciPaymentScreen.commonBtnClickPayment(btnPayment, msg);
    }

    @And("^I select \"([^\"]*)\" payment method \"([^\"]*)\"$")
    public void iSelectPaymentMethod(String btnCreditCard, String msg) {
        ciPaymentScreen.commonBtnClickOption(btnCreditCard, msg);
    }

    @And("^I select \"([^\"]*)\" option in the apply tip popup \"([^\"]*)\"$")
    public void iSelectOptionInTheApplyTipPopup(String tip, String msg) {
        ciPaymentScreen.btnClickTip(tip, msg);
    }

    @Then("^I click \"([^\"]*)\" in the tip popup \"([^\"]*)\"$")
    public void iClickInTheTipPopup(String btnContinue, String msg) {
        ciPaymentScreen.commonBtnClick(btnContinue, msg);
    }

    @And("I click Submit button in the Payment popup")
    public void iClickSubmitButtonInThePaymentPopup() {
        new CIPaymentScreen().clickSubmit();
    }

    @And("^I click \"([^\"]*)\" in the Credit Card popup \"([^\"]*)\"$")
    public void iClickInTheCreditCardPopup(String btnManual, String msg) {
        ciPaymentScreen.commonBtnClick(btnManual, msg);
    }

    @And("^I enter the card number as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnterTheCardNumberAs(String number,String msg) {
        ciPaymentScreen.passCardNumber(number,msg);
    }

    @And("^I enter card name as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnterCardNameAs(String name,String msg) {
        ciPaymentScreen.passCardName(name,msg);
    }

    @And("^I enter expire date as \"([^\"]*)\",\"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnterExpireDateAs(String num, String cvv,String msg) {
        new CIPaymentScreen().passExpireNumber(num, cvv,msg);
    }


    @When("^I click \"([^\"]*)\" in the discount screen \"([^\"]*)\"$")
    public void iClickInTheDiscountScreen(String btnDiscount, String msg) {
        ciPaymentScreen.btnHideKeyboard(btnDiscount, msg);
    }

    @Then("It should show the amount \"([^\"]*)\",\"([^\"]*)\"$")
    public void itShouldShowTheAmount(String discount, String msg) {
        String text = ciPaymentScreen.verifyValue(discount,msg);
        Assert.assertEquals(discount,text);
    }

    @Then("^I should see the order screen with \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldSeeTheOrderScreenWith(String emptyList,String msg) {
        String text = ciPaymentScreen.getEmptyList(emptyList,msg);
        Assert.assertEquals(emptyList,text);
    }

    @And("^I select customer as predefinedTaxExemptCustomer \"([^\"]*)\"$")
    public void iSelectAsPredefinedTaxExemptCustomer(String customer, String msg) {
        new CIPaymentScreen().selectPredefinedTaxExempt();
    }

    @Then("I click \"([^\"]*)\" in the gratuity popup \"([^\"]*)\"$")
    public void iClickInTheGratuityPopup(String btnApply, String msg) {
        new CIPaymentScreen().commonBtnClick(btnApply, msg);
    }

    @And("^I enter the percentage as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterThePercentageAs(String pin1, String pin2, String pinPoint, String pin0) {
        new CIPaymentScreen().pressPercentagePin(pin1,pin2,pinPoint,pin0);
    }

    @And("^I enter the percentage1 as \"([^\"]*)\"$")
    public void iEnterThePercentage1As(String pin1) throws InterruptedException {
        new CIPaymentScreen().pressPercentagePin1(pin1);
    }

    @And("I click on the text field in the varying gratuity popup")
    public void iClickOnTheTextFieldInTheVaryingGratuityPopup() {
        new CIPaymentScreen().clickPercentageTextField();
    }

    @And("^I click \"([^\"]*)\" in the percentage screen \"([^\"]*)\"$")
    public void iClickInThePercentageScreen(String btnContinue, String msg) {
        new CIPaymentScreen().commonBtnClick(btnContinue, msg);
    }

    @Then("^It should show the \"([^\"]*)\" Gratuity amount \"([^\"]*)\"$")
    public void itShouldShowTheGratuityAmount(String txtGratuity, String msg) {
        Assert.assertEquals(ciPaymentScreen.commonGetText(txtGratuity,msg),txtGratuity);
    }

    @Then("^I should get back to the \"([^\"]*)\",\"([^\"]*)\"$")
    public void iShouldGetBackToThe(String TxtBarTab, String msg) {
        String text = ciPaymentScreen.commonGetText(TxtBarTab,msg);
        Assert.assertEquals(TxtBarTab, text);
    }

    @And("^I click No thanks in the Print or Send receipt popup \"([^\"]*)\"$")
    public void iClickNoThanksInThePrintOrSendReceiptPopup(String msg) {
        ciPaymentScreen.pressNoThanks(msg);
    }

    @When("I Click \"([^\"]*)\" button in the tokenize popup \"([^\"]*)\"$")
    public void iClickNoButtonInTheTokenizePopup(String btnNo,String msg) {
        ciPaymentScreen.clickNo(btnNo,msg);
    }

    @Then("^I click \"([^\"]*)\" in the Open Check Discount screen \"([^\"]*)\"$")
    public void iClickInTheOpenCheckDiscountScreen(String btnPercentage, String msg) {
        new CIPaymentScreen().commonBtnClick(btnPercentage,msg);
    }

    @And("I click on the Text Field in the open discount screen")
    public void iClickOnTheTextFieldInTheOpenDiscountScreen() {
        new CIPaymentScreen().clickTextFieldPercentage();
    }

    @Then("^I should get back to the payment Screen with \"([^\"]*)\" Option \"([^\"]*)\"$")
    public void iShouldGetBackToThePaymentScreenWithOption(String giftCard,String msg) {
        Assert.assertEquals(new CIPaymentScreen().commonGetText(giftCard,msg),giftCard);
    }

    @Then("I should see the insufficient popup with \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldSeeTheInsufficientPopupWith(String popUp, String msg) {
        Assert.assertEquals(new CIPaymentScreen().commonGetText(popUp,msg),popUp);
    }

    @And("I click \"([^\"]*)\" in the insufficient popup \"([^\"]*)\"$")
    public void iClickInTheInsufficientPopup(String btnYes, String msg) {
        new CIPaymentScreen().commonBtnClick(btnYes,msg);
    }

    @Then("I click on \"([^\"]*)\" to pay the Gift Card amount \"([^\"]*)\"$")
    public void iClickOnToPayTheGiftCardAmount(String giftCard, String msg) {
        new CIPaymentScreen().commonBtnClickOption(giftCard,msg);
    }

    @And("^I click on the card number text field \"([^\"]*)\"$")
    public void iClickOnTheCardNumberTextField(String msg) {
        ciPaymentScreen.clickCardNameField(msg);
    }

    @And("I enter the GiveX Number as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnterTheGiveXNumberAs(String number,String msg) {
        new CIPaymentScreen().passCardNumber(number,msg);
    }

    @And("^I Enter the GiveX Number value as \"([^\"]*)\"")
    public void iEnterTheGiveXNumberValueAs(String Numberr){
        new CIPaymentScreen().enterGiveXNumber(Numberr);
    }
    @When ("^I verify recharge givex amount is same with order screen givex amount$")
    public void iVerifyRechargeGivexAmountIsSameWithOrderScreenGivexAmount(){
        new CheckOptionsScreen().verifyRechargeGivexAmountIsSameWithOrderScreenGivexAmount();
    }

    @And("I click \"([^\"]*)\" in the Give-X Card popup \"([^\"]*)\"$")
    public void iClickInTheGiveXCardPopup(String btn, String msg) {
        new CIPaymentScreen().commonBtnClick(btn,msg);
    }

    @Then("I click on the recharge text field")
    public void iClickOnTheRechargeTextField() {
        new CIPaymentScreen().clickGiftCardTextField();
    }

    @And("I click on the gift card \"([^\"]*)\" \"([^\"]*)\"$")
    public void iClickOnTheGiftCard(String textField, String msg) {
        new CICloseDayScreen().commonAccessibilityId(textField,msg);
    }

    @And("I click \"([^\"]*)\" in the number popup \"([^\"]*)\"$")
    public void iClickInTheNumberPopup(String btnContinue, String msg) {
        new CIPaymentScreen().commonBtnClick(btnContinue,msg);
    }

    @And("I enter the giftcard number as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterTheGiftCardNumberAs(String pin1, String pin2, String pin3, String pin4, String pin5) {
        new CIPaymentScreen().pressCardPin(pin1,pin2,pin3,pin4,pin5);
    }

    @And("I enter the recharge amount as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterTheRechargeAmountAs(String pin1, String pin2, String pin3, String pin4) {
        new CIPaymentScreen().pressPercentagePin(pin1,pin2,pin3,pin4);
    }

    @And("I click \"([^\"]*)\" in the Gift Card Popup \"([^\"]*)\"$")
    public void iClickInTheGiftCardPopup(String btnManual, String msg) {
        new CIPaymentScreen().commonBtnClickOption(btnManual,msg);
    }

    @And("I click the menu item for selecting the discount")
    public void iClickTheMenuItemForSelectingTheDiscount() {
        new CIPaymentScreen().clickTxtMenuItem();
    }

    @And("I click the \"([^\"]*)\" menu option screen\"([^\"]*)\"$")
    public void iClickTheMenuOptionScreen(String btnOpenDiscount, String msg) {
        new CIPaymentScreen().commonBtnClick(btnOpenDiscount, msg);
    }

    @And("^I enter the House Account card number as \"([^\"]*)\"$")
    public void iPassTheHouseAccountCardNumberAs(String num) {
        new CIPaymentScreen().passHACardNumber(num);
    }

    @And("^I enter the Gift card number as \"([^\"]*)\"$")
    public void iPassTheGiftCardNumberAs(String num) {
        new CIPaymentScreen().passHACardNumber(num);
    }

    @And("I click on the Percentage Text Field in the open item discount screen")
    public void iClickOnThePercentageTextFieldInTheOpenItemDiscountScreen() {
        new CIPaymentScreen().clickTextFieldPercentageOpenItem();
    }

    @And("^I click \"([^\"]*)\" button in the keyboard \"([^\"]*)\"$")
    public void iClickButtonInTheKeyboard(String Back, String msg) {
        ciCloseDayScreen.commonAccessibilityId(Back, msg);
    }

    @Then("^I enter the reason as \"([^\"]*)\" in the open check discount screen")
    public void iEnterTheReasonAsInTheOpenCheckDiscountScreen(String reason1) {
        new CIPaymentScreen().passReason1(reason1);
    }

    @When("^I click \"([^\"]*)\" in the order screen for selecting the customer \"([^\"]*)\"$")
    public void iClickInTheOrderScreenForSelectingTheCustomer(String btnCustomerTab, String msg) {
        new CIPaymentScreen().commonBtnClick(btnCustomerTab, msg);
    }

    @And("I click on the Reason Text Field in the open discount screen")
    public void iClickOnTheReasonTextFieldInTheOpenDiscountScreen() {
        new CIPaymentScreen().clickTextFieldReason();
    }

    @And("^I click \"([^\"]*)\" in the open discount screen \"([^\"]*)\"$")
    public void iClickInTheOpenDiscountScreen(String btnApply, String msg) {
        new CIPaymentScreen().commonBtnClick(btnApply, msg);
    }

    @Then("^I enter the reason as \"([^\"]*)\"$")
    public void iEnterTheReasonAs(String reason) {
        new CIPaymentScreen().passReason(reason);
    }

    @And("^I click the \"([^\"]*)\" in the popup screen\"([^\"]*)\"$")
    public void iClickTheInThePopupScreen(String btnDone, String msg) {
        ciCloseDayScreen.commonAccessibilityId(btnDone, msg);
    }

    @And("^I click the \"([^\"]*)\" in the All tab screen\"([^\"]*)\"$")
    public void iClickTheInTheAllTabScreen(String tabCheckStats, String msg) {
        new CIPaymentScreen().commonBtnClick(tabCheckStats, msg);
    }

    @And("^I enter seat number as\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterSeatNumberAs(String pin1, String msg) {
        new CIPaymentScreen().commonBtnClick(pin1, msg);
    }

    @And("^I select the \"([^\"]*)\" in the Table layout screen\"([^\"]*)\"$")
    public void iSelectTheTableInTheTableLayoutScreen(String btnTable,String msg) {
//        ciPaymentScreen.clickBtnPayment(btnTable,msg);
        new CIPaymentScreen().selectTheTable(btnTable,msg);
    }

    @And("^I select the \"([^\"]*)\" in the Table layout screen1\"([^\"]*)\"$")
    public void iSelectTheTableInTheTableLayoutScreen1(String btnTable,String msg) {
//        ciPaymentScreen.clickBtnPayment(btnTable,msg);
        new CIPaymentScreen().selectTheTable1(btnTable,msg);
    }

    @And("^I click \"([^\"]*)\" in the order screen for placing the menu item\"([^\"]*)\"$")
    public void iClickInTheOrderScreenForPlacingTheMenuItem(String btnSeat, String msg) {
        ciPaymentScreen.clickBtnPayment(btnSeat,msg);
    }

    @And("I click the menu item for selecting the void item button")
    public void iClickTheMenuItemForSelectingTheVoidItemButton() {
        new CIPaymentScreen().clickTxtMeals();
    }

    @Then("I should verify the {string} in the closed tab")
    public void iShouldVerifyTheInTheClosedTab(String txtClosedCheck,String msg) {
        new CIPaymentScreen().clickBtnPayment(txtClosedCheck,msg);
    }

    @And("^I click \"([^\"]*)\" in the lower option screen\"([^\"]*)\"$")
    public void iClickInTheLowerOptionScreen(String Discount, String msg) {
        new CICloseDayScreen().commonAccessibilityId(Discount, msg);
    }

    @And("I click on the Amount Text Field in the open discount screen")
    public void iClickOnTheAmountTextFieldInTheOpenDiscountScreen() {
        new CIPaymentScreen().clickTextFieldPercentage();
    }

    @And("^I click \"([^\"]*)\" in the percentage apply screen \"([^\"]*)\"$")
    public void iClickInThePercentageApplyScreen(String btnContinue, String msg) {
        ciPaymentScreen.commonBtnClick(btnContinue, msg);
    }

    @And("I click back button in the keyboard")
    public void iClickBackButtonInTheKeyboard(String id, String msg) {
        new CICloseDayScreen().commonAccessibilityId(id, msg);
    }

    @And("I click on the Reason Text Field in the open item discount screen")
    public void iClickOnTheReasonTextFieldInTheOpenItemDiscountScreen() {
        new CIPaymentScreen().clickTextFieldReasonOpenItem();
    }

    @And("^I enter the reason as \"([^\"]*)\" in the open item discount screen")
    public void iEnterTheReasonAsInTheOpenItemDiscountScreen(String reasonOpenItem) {
        new CIPaymentScreen().passReason(reasonOpenItem);
    }

    @And("^I select \"([^\"]*)\" in the customer tab\"([^\"]*)\"$")
    public void iSelectInTheCustomerTab(String Customer, String msg) {
        new CIPaymentScreen().clickBtnPayment(Customer, msg);
    }

    @And("^I enter the customer name as \"([^\"]*)\" in the notes field \"([^\"]*)\"$")
    public void iEnterTheCustomerNameAsInTheNotesField(String customerName, String msg) {
        ciPaymentScreen.enterName(customerName,msg);
    }

    @And("^I select the \"([^\"]*)\" as john \"([^\"]*)\"$")
    public void iSelectTheAsJohn(String customerName, String msg) {
        ciPaymentScreen.commonBtnClickOption(customerName,msg);
    }

    //nov 15
    @And("^I select the \"([^\"]*)\" as thomas \"([^\"]*)\"$")
    public void iSelectTheAsThomas(String customerName, String msg) {
        ciCloseDayScreen.commonAccessibilityId(customerName,msg);
    }

    @Then("^I verify the Ask Customer BarTab is disable or not in the POS Settings screen \"([^\"]*)\"$")
    public void iVerifyTheAskCustomerBarTabIsDisableOrNotInThePOSSettingsScreen(String msg) throws InterruptedException {
        boolean value=ciWaitListPage.verifyDisableBarTabAskCustomer();
        Assert.assertTrue(value);
        utils.log().info(msg);
    }

    @Then("^I verify the Wait List is enable or not in the POS Settings screen \"([^\"]*)\"$")
    public void iVerifyTheWaitListIsEnableOrNotInThePOSSettingsScreen(String msg) throws InterruptedException {
        boolean value=ciWaitListPage.verifyEnableWaitList();
        Assert.assertTrue(value);
        utils.log().info(msg);
    }
}