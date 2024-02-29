package com.qa.stepdef;

import com.qa.pages.TGCheckStatusPage;
import com.qa.pages.TGMenuItemPage;
import com.qa.pages.TGPaymentPage;
import com.qa.utils.TestUtils;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TGPaymentStepDef {

TestUtils utils = new TestUtils();
    @And("USer click cash button")
    public void userClickCashButton() throws InterruptedException {
        new TGPaymentPage().clickCashButton();
    }
    @And("User click submit button")
    public void userClickSubmitButton() throws InterruptedException {
        new TGPaymentPage().clickSubmitButton();
    }

    @When("User click Cash Tab on Menu Item Page")
    public void userClickCashTabOnMenuItemPage() {
        new TGPaymentPage().clickCashPaymentTab();
    }

    @And("User verify paid cash amount")
    public void userVerifyPaidCashAmount() {

        new TGMenuItemPage().clickAllTab();

        new TGCheckStatusPage().clickCheckStatusTab();

        new TGCheckStatusPage().clickClosedChecks();

        new TGPaymentPage().paidCashAmount();

    }

    @When("User click calculator split button")
    public void userClickCalculatorSplitButton() {
        new TGPaymentPage().clickSplitButtonOnCalculator();
    }

    @Then("User select type of split")
    public void userSelectTypeOfSplit() {
        new TGPaymentPage().selectSplitType();
    }

    @And("User select payment method with cash")
    public void userSelectPaymentMethodWithCash() {
        new TGPaymentPage().selectCashPaymentMethod();
    }

    @And("User verify paid amount and balance")
    public void userVerifyPaidAmountAndBalance() {
        new TGPaymentPage().verifyPaidAmountWithSplit();
    }

    @Then("User verify paid check void popup")
    public void userVerifyPaidCheckVoidPopup() {
        new TGPaymentPage().verifyVoidAfterPayment();
    }

    @Then("User pay with cash")
    public void userPayWithCash() {
        new TGPaymentPage().selectCashPaymentMethod();
    }

    @And("User click exit on payment page")
    public void userClickExitOnPaymentPage() {
        new TGPaymentPage().clickExitButton();
    }

    @Then("User select paid order")
    public void userSelectPaidOrder() {
        new TGPaymentPage().selectPaidOrder();

    }

    @And("User click delete button")
    public void userClickDeleteButton() {
        new TGPaymentPage().clickDeleteButton();

    }

    @And("User pay seat order")
    public void userPaySeatOrder() {
        new TGPaymentPage().paySeat();
    }

    @And("User verify payment page is opened")
    public void userVerifyPaymentPageIsOpened() {
        new TGPaymentPage().verifyPaymentPage();
    }

    @And("User close if printer popup is exist")
    public void userCloseIfPrinterPopupIsExist() {
        new TGPaymentPage().closeReceiptPrinter();
    }

    @And("User verify deleted paid order")
    public void userVerifyDeletedPaidOrder() {

    }

    @And("User verify paid cash on payment page")
    public void userVerifyPaidCashOnPaymentPage() {
        new TGPaymentPage().verifyCashPaidOnPaymentPage();
    }

    @And("User select payment method with credit card")
    public void userSelectPaymentMethodWithCreditCard() {
        new TGPaymentPage().selectCreditCardPaymentMethod();
    }

    @And("User select payment method with gift card")
    public void userSelectPaymentMethodWithGiftCard() {
        new TGPaymentPage().selectGiftCardPaymentMethod();
    }

    @And("User click manuel button")
    public void userClickManuelButton() throws InterruptedException {
        new TGPaymentPage().clickManuelButton();
    }

    @Then("User enter gift card number")
    public void userEnterGiftCardNumber() {
        new TGPaymentPage().enterGiftCardNumber();

    }

    @And("User enter gift card name")
    public void userEnterGiftCardName() {
        new TGPaymentPage().enterGiftCardName();
    }

    @And("User enter gift card expire date")
    public void userEnterGiftCardExpireDate() {
        new TGPaymentPage().enterGiftCardExpireDate();
    }

    @And("User enter gift card cvv number")
    public void userEnterGiftCardCvvNumber() {
        new TGPaymentPage().enterGiftCardCVV();
    }

    @And("User enter gift card zip code")
    public void userEnterGiftCardZipCode() {
        new TGPaymentPage().enterGiftCardZipCode();
    }

    @When("User click process")
    public void userClickProcess() throws InterruptedException {
        new TGPaymentPage().clickProcessButton();
    }

    @Then("User select loyalty button")
    public void userSelectLoyaltyButton() {
        new TGPaymentPage().selectLoyaltyPaymentMethod();
    }

    @And("User verify loyalty paid order")
    public void userVerifyLoyaltyPaidOrder() {
        new TGPaymentPage().verifyLoyaltyPayment();
    }


    @And("User select card type")
    public void userSelectCardType() {
        new TGPaymentPage().selectCardType();
    }

    @When("User click Custom button")
    public void userClickCustomButton() {
        new TGPaymentPage().clickCustomButton();
    }

    @Then("User enter tip amount")
    public void userEnterTipAmount() {
        new TGPaymentPage().enterTipBalance();
    }

    @And("User click Continue button")
    public void userClickContinueButton() {
        new TGPaymentPage().clickContinueButton();
    }

    @And("User verify CC Side payment")
    public void userVerifyCCSidePayment() {
        new TGPaymentPage().verifyCCSidePaymentMethod();
    }

    @And("User verify tip amount")
    public void userVerifyTipAmount() {
        new TGPaymentPage().verifyTipAmount();
    }

    @And("User select payment method with CC Side")
    public void userSelectPaymentMethodWithCCSide() throws Exception {

    }

    @And("User swipe until payment method with CC Side")
    public void userSwipeUntillPaymentMethodWithCCSide() throws Exception {
        new TGPaymentPage().swipeUntilCCSide("up");
    }

    @And("User click CC Side payment method")
    public void userClickCCSidePaymentMethod() {
        new TGPaymentPage().clickCCSidePaymentMethod();

    }

    @Then("User click no tip button")
    public void userClickNoTipButton() {
        new TGPaymentPage().clickNoTipButton();
    }

    @And("User select TL ten option")
    public void userSelectTLTenOption() {
        new TGPaymentPage().click10TLPartialPaymentOption();
    }

    @And("User verify CC Side payment method with partial payment")
    public void userVerifyCCSidePaymentMethodWithPartialPayment() {
        new TGPaymentPage().verifyPartialPaymentWithTen();
    }

    @When("User click adjust button")
    public void userClickAdjustButton() {
        new TGPaymentPage().clickAdjustButton();
    }

    @Then("User enter new payment amount")
    public void userEnterNewPaymentAmount() {
        new TGPaymentPage().enterNewPaidAmount();
    }

    @And("User click any split option")
    public void userClickAnySplitOption() {
        new TGPaymentPage().selectSplitOption();
    }

    @Then("User verify split paid amount")
    public void userVerifySplitPaidAmount() {
        new TGPaymentPage().verifySplitPaidAmount();
    }

    @Then("User verify last split paid cash amount")
    public void userVerifyLastSplitPaidCashAmount() {
        new TGPaymentPage().verifyLastSplitPaidAmount();
    }

    @Then("User verify Balance Due field changed No Due")
    public void userVerifyBalanceDueFieldChangedNoDue() {
        new TGPaymentPage().verifyBalanceDueChangedNoDue();
    }

    @And("User enter order amount manually verify payment field box changed to order amount")
    public void userEnterOrderAmountManuallyVerifyPaymentFieldBoxChangedToOrderAmount() {
        new TGPaymentPage().verifyChangedOrderAmount();
    }

    @When("User enter partial amount order")
    public void userEnterPartialAmountOrder() {
        new TGPaymentPage().enterPartialAmountOrder();
    }

    @Then("User verify partial payment warning popup")
    public void userVerifyPartialPaymentWarningPopup() {
        new TGPaymentPage().verifyPartialPaymentShortChangePopup();
    }

    @Then("User verify no more payment warning popup")
    public void userVerifyNoMorePaymentWarningPopup() {
        new TGPaymentPage().verifyNoMorePaymentPopup();
    }

    @And("User verify select payment warning popup")
    public void userVerifySelectPaymentWarningPopup() {
        new TGPaymentPage().verifySelectPaymentWarningPopup();
    }

    @And("User verify select payment warning popup1")
    public void userVerifySelectPaymentWarningPopup1() {
        new TGPaymentPage().verifySelectPaymentWarningPopup1();
    }

    @And("User verify deleted paid check")
    public void userVerifyDeletedPaidCheck() {
        new TGPaymentPage().verifyDeletedPaidCheck();
    }

   /* @And("User verify last closed check")
    public void userVerifyLastClosedCheck() {
         new TGPaymentPage().verifyLastClosedCheck();
    }*/

    @And("User click receipt printer button")
    public void userClickReceiptPrinterButton() {
        new TGPaymentPage().closeReceiptPrinterPopup();
    }
    @When("User click tax exempt on payment page")
    public void userClickTaxExemptOnPaymentPage() {
        new TGPaymentPage().clickTaxExempt();
    }
    @When("User click gift card payment method")
    public void userClickGiftCardPaymentMethod() {
        new TGPaymentPage().selectGiftCardPaymentMethod();
    }

    @Then("User click clear button on gift card payment option")
    public void userClickClearButtonOnGiftCardPaymentOption() {
        new TGPaymentPage().clickClearButtonOnGİftCard();
    }


    @Then("User click gift card number on payment method")
    public void userClickGiftCardNumberOnPaymentMethod() {
        new TGPaymentPage().enterGiftCardNumberOnPaymentPage();
    }

    @When("User verify paid order with gift card")
    public void userVerifyPaidOrderWithGiftCard() {
        new TGPaymentPage().verifyGiftCardSuccessPayment();
    }

    @Then("User verify be directed payment page")
    public void userVerifyBeDirectedPaymentPage() {
        new TGPaymentPage().verifyDirectedPaymentPage();
    }


    @And("User click no thank option on print receipt")
    public void userClickNoThankOptionOnPrintReceipt() {
        new TGPaymentPage().clickNoThanksPrintReceiptOption();
    }

    @When("User click printer popup")
    public void userClickPrinterPopup() {
        new TGPaymentPage().printerPopUp();
    }

    @When("User verify Credit Card payment method")
    public void userVerifyCreditCardPaymentMethod() {
        new TGPaymentPage().verifyCreditCardPaymentMethod();
    }

    @Then("User click Credit Card payment method")
    public void userClickCreditCardPaymentMethod() {
        new TGPaymentPage().clickCreditCardPaymentMethod();
    }

    @Then("User select any amount of tips")
    public void userSelectAnyAmountOfTips() {
        new TGPaymentPage().selectAnyAmountOfTips();
    }

    @When("User verify CC Side payment method")
    public void userVerifyCCSidePaymentMethod() {
        new TGPaymentPage().verifyCCSidePaymentMethod();
    }

    @Then("User enter credit card number")
    public void userEnterCreditCardNumber() {
        new TGPaymentPage().enterCreditCardNumber();
    }

    @And("User enter credit card CVV info")
    public void userEnterCreditCardCVVInfo() {
        new TGPaymentPage().enterCreditCardCVVInfo();
    }

    @Then("User enter Credit Card Expire Date")
    public void userEnterCreditCardExpireDate() {
        new TGPaymentPage().enterCreditCardExpireDate();
    }

    @When("User select tip amount which is entered")
    public void userSelectTipAmountWhichIsEntered() {
        new TGPaymentPage().selectTipAmountWhichIsEntered();
    }

    @And("User verify CC Side payment with tips and item based discount After tax as percentage")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsPercentage() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsPercentage();
    }

    @And("User User verify CC Side payment with tips and item based discount Before tax as percentage")
    public void userUserVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsPercentage() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsPercentage();
    }

    @And("User verify CC Side payment with tips and item based discount After tax as amount")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmount() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmount();
    }

    @And("User verify CC Side payment with tips and item based discount Before tax as amount")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsAmount() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsAmount();
    }

    @And("User verify CC Side payment with tips and item based discount After tax as set price")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPrice() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPrice();
    }

    @And("User verify CC Side payment with tips and item based discount After tax as free item")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsFreeItem() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsFreeItem();
    }

    @And("User verify CC Side payment with tips and item based discount Before tax as free item")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsFreeItem() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsFreeItem();
    }

    @And("User verify CC Side payment with tips and item based discount Before tax as set price")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPrice() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPrice();
    }

    @And("User verify CC Side payment with tips")
    public void userVerifyCCSidePaymentWithTips() {
        new TGPaymentPage().verifyCCSidePaymentWithTips();
    }

    @And("User verify CC Side payment with tips and check based discount before tax as percentage")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsPercentage() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsPercentage();
    }

    @And("User verify CC Side payment with tips and check based discount before tax as amount")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsAmount() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsAmount();
    }

    @And("User verify CC Side payment with tips and check based discount after tax as set price")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsSetPrice() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsSetPrice();
    }

    @And("User verify CC Side payment with tips and check based discount before tax as set price")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsSetPrice() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsSetPrice();
    }

    @And("User verify CC Side payment with tips and check based discount after tax as amount")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsAmount() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsAmount();
    }

    @And("User verify CC Side payment with tips and check based discount after tax as percentage")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsPercentage() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsPercentage();
    }

    //    @And("User verify CC Side payment with tips and check based discount after tax as free item")
//    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsFreeItem() {
//        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsFreeItemForSandwich();
//    }
    @And("User verify CC Side payment with tips and check based discount after tax as free item")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsFreeItem() {
        new TGPaymentPage().verifySideCCPaymentWithTipsAndOpenItemBeforeTaxAmountSafetyLimitAsDecimal();
    }
    //new nov 17
    @And("User verify CC Side payment with tips and check based discount after tax as free item1")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsFreeItem1() {
        new TGPaymentPage().verifySideCCPaymentWithTipsAndOpenItemBeforeTaxAmountSafetyLimitAsDecimal1();
    }

    @And("^User verify CC Side payment with tips value as \"([^\"]*)\" and check based discount after tax as percentage$")
    public void userVerifyCCSidePaymentWithTipsValueAsAndCheckBasedDiscountAfterTaxAsPercentage(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsPercentage(value);
    }

    @And("^User verify CC Side payment with tips value as \"([^\"]*)\" and check based discount before tax as percentage$")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsPercentage(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsPercentage(value);
    }

    @Then("^User verify item based discount after tax value as \"([^\"]*)\" with percentage with CC Side payment in payment screen and with tips$")
    public void userVerifyItemBasedDiscountAfterTaxValueAsWithPercentageWithCCSidePaymentInPaymentScreenAndWithTips(String value) {
        new TGPaymentPage().verifyItemBasedDiscountAfterTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTips(value);
    }

    @Then("^User verify item based discount before tax value as \"([^\"]*)\" with percentage with CC Side payment in payment screen and with tips for Margarita$")
    public void userVerifyItemBasedDiscountBeforeTaxValueAsWithPercentageWithCCSidePaymentInPaymentScreenAndWithTipsForMargarita(String value) {
        new TGPaymentPage().verifyItemBasedDiscountBeforeTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTipsForMargarita(value);
    }

    @Then("^User verify item based discount after tax value as \"([^\"]*)\" with amount with CC Side payment in payment screen and with tips for Chicken Schnitzel$")
    public void userVerifyItemBasedDiscountAfterTaxValueAsWithAmountWithCCSidePaymentInPaymentScreenAndWithTipsForChickenSchnitzel(String value) {
        new TGPaymentPage().userVerifyCCSidePaymentWithTipAmountAndItemBasedDiscountAfterTaxAsAmountForChickenSchnitzel(value);
    }

    @Then("^User verify CC Side payment with tips value as \"([^\"]*)\" and item based discount After tax as set price for Chicken Schnitzel$")
    public void userVerifyCCSidePaymentWithTipsValueAsAndItemBasedDiscountAfterTaxAsSetPriceForChickenSchnitzel(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceForChickenSchnitzel(value);
    }

    @And("^User verify item based discount before tax as set price value as \"([^\"]*)\" for chicken schnitzel$")
    public void userVerifyItemBasedDiscountBeforeTaxAsSetPriceValueAsForChickenSchnitzel(String value) {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsSetPriceForChickenSchnitzel(value);
    }


    @And("^User verify CC Side payment with tips value as \"([^\"]*)\" and check based discount after tax as amount$")
    public void userVerifyCCSidePaymentWithTipsValueAsAndCheckBasedDiscountAfterTaxAsAmount(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsAmount(value);
    }

    @And("^User verify CC Side payment with tips value as \"([^\"]*)\" and check based discount before tax as amount$")
    public void userVerifyCCSidePaymentWithTipsValueAsAndCheckBasedDiscountBeforeTaxAsAmount(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsAmount(value);
    }

    @And("^User verify CC Side payment with tips value as \"([^\"]*)\" and check based discount after tax as set price$")
    public void userVerifyCCSidePaymentWithTipsValueAsAndCheckBasedDiscountAfterTaxAsSetPrice(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsSetPrice(value);
    }

    @And("^User verify CC Side payment with tips value as \"([^\"]*)\" and check based discount before tax as set price$")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsSetPrice(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsSetPrice(value);
    }


    //    @And("User verify CC Side payment with tips and check based discount before tax as free item")
//    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsFreeItem() {
//        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenItemBeforeTaxAmountSafetyLimitAsDecimal();
//    }
    @And("User verify CC Side payment with tips and check based discount before tax as free item")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsFreeItem() {
        new TGPaymentPage().verifySideCCPaymentWithTipsAndOpenItemBeforeTaxAmountSafetyLimitAsDecimal();
    }
    //new nov 17
    @And("User verify CC Side payment with tips and check based discount before tax as free item1")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsFreeItem1() {
        new TGPaymentPage().verifySideCCPaymentWithTipsAndOpenItemBeforeTaxAmountSafetyLimitAsDecimal2();
    }

    @And("User verify CC Side payment with tips and check based discount before tax as free item for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsFreeItemForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenItemAfterTaxAsAmountSafetyLimitAsDecimalForSandwiches();
    }

    @And("User verify CC Side payment with tips and open item after tax as amount & safety limit as decimal")
    public void userVerifyCCSidePaymentWithTipsAndOpenItemAfterTaxAsAmountSafetyLimitAsDecimal() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenItemAfterTaxAsAmountSafetyLimitAsDecimal();
    }

    @And("User verify CC Side payment with tips and open item before tax as amount & safety limit as decimal")
    public void userVerifyCCSidePaymentWithTipsAndOpenItemBeforeTaxAsAmountSafetyLimitAsDecimal() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenItemBeforeTaxAsAmountSafetyLimitAsDecimal();
    }

    @And("User verify CC Side payment with tips and open item before tax as decimal for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndOpenItemBeforeTaxAsDecimalForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenItemBeforeTaxAsAmountSafetyLimitAsDecimalForSandwiches();
    }

    @And("User verify CC Side payment with tips and open item after tax as amount & safety limit as non-decimal value")
    public void userVerifyCCSidePaymentWithTipsAndOpenItemAfterTaxAsAmountSafetyLimitAsNonDecimalValue() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenItemAfterTaxAsAmountSafetyLimitAsNonDecimalValue();
    }

    @And("User verify CC Side payment with tips and open item before tax as amount & safety limit as non-decimal")
    public void userVerifyCCSidePaymentWithTipsAndOpenItemBeforeTaxAsAmountSafetyLimitAsNonDecimal() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenItemBeforeTaxAsAmountSafetyLimitAsNonDecimal();
    }

    @And("User verify CC Side payment with tips and open check after tax as percentage for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsPercentageForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsPercentageForSandwiches();
    }

    @And("User verify CC Side payment with tips and open check before tax as percentage for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckBeforeTaxAsPercentageForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckBeforeTaxAsPercentageForSandwiches();
    }

    @And("User verify CC Side payment with tips and open check after tax as amount for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsAmountForPolloParm() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsDecimalAmountForPolloParm();
    }

    @And("User verify CC Side payment with tips and open check after tax as amount for Margarita")
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsAmountForMargarita() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsAmountForMargarita1();
    }

    @And("User verify CC Side payment with tips and open check before tax as amount for Pollo Parm")
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckBeforeTaxAsAmountForPolloParm() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckBeforeTaxAsAmountForPolloParm();
    }

    @And("User verify CC Side payment amount as non-decimal with tips and open check before tax as amount for Pollo Parm")
    public void userVerifyCCSidePaymentAmountAsNonDecimalWithTipsAndOpenCheckBeforeTaxAsAmountForPolloParm() {
        new TGPaymentPage().verifyCCSidePaymentAmountAsNonDecimalWithTipsAndOpenCheckBeforeTaxAsAmountForPolloParm();
    }

    @And("User verify CC Side payment amount as non-decimal with tips and open check before tax as amount for Margarita")
    public void userVerifyCCSidePaymentAmountAsNonDecimalWithTipsAndOpenCheckBeforeTaxAsAmountForMargarita() {
        new TGPaymentPage().verifyCCSidePaymentAmountAsNonDecimalWithTipsAndOpenCheckBeforeTaxAsAmountForMargarita();
    }

    @And("User verify CC Side payment with tips and open check after tax as decimal amount for Pollo Parm")
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsDecimalAmountForPolloParm() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsDecimalAmountForPolloParm();
    }

    @And("User verify CC Side payment with Gratuity\\(Fixed) and with tips")
    public void userVerifyCCSidePaymentWithGratuityFixedAndWithTips() {
        new TGPaymentPage().verifyCCSidePaymentWithGratuityFixedAndWithTips();
    }

    @And("User verify CC Side payment with Gratuity\\(Varying) and with tips")
    public void userVerifyCCSidePaymentWithGratuityVaryingAndWithTips() {
        new TGPaymentPage().verifyCCSidePaymentWithGratuityVaryingAndWithTips();
    }

    @And("User verify CC Side payment with Tax Exempt as select customer and with tips")
    public void userVerifyCCSidePaymentWithTaxExemptAsSelectCustomerAndWithTips() {
        new TGPaymentPage().verifyCCSidePaymentWithTaxExemptAsSelectCustomerAndWithTips();
    }

    @And("User verify CC Side payment with Tax Exempt as not select customer in payment screen and with tips")
    public void userVerifyCCSidePaymentWithTaxExemptAsNotSelectCustomerInPaymentScreenAndWithTips() {
        new TGPaymentPage().verifyCCSidePaymentWithTaxExemptAsSelectCustomerAndWithTips();
    }

    @And("User verify CC Side payment with Tax Exempt as predefined customer in payment screen and with tips")
    public void userVerifyCCSidePaymentWithTaxExemptAsPredefinedCustomerInPaymentScreenAndWithTips() {
        new TGPaymentPage().verifyCCSidePaymentWithTaxExemptAsPredefinedCustomerInPaymentScreenAndWithTips();
    }

    @And("User verify CC Side payment with upcharge add modifier menu item in payment screen and with tips")
    public void userVerifyCCSidePaymentWithUpchargeAddModifierMenuItemInPaymentScreenAndWithTips() {
        new TGPaymentPage().verifyCCSidePaymentWithUpchargeAddModifierMenuItemInPaymentScreenAndWithTips();
    }

    @And("User verify CC Side payment in payment screen and without tips")
    public void userVerifyCCSidePaymentInPaymentScreenAndWithoutTips() {
        new TGPaymentPage().verifyCCSidePaymentInPaymentScreenAndWithoutTips();
    }

    @And("User verify CC Side payment in payment screen and with tips")
    public void userVerifyCCSidePaymentInPaymentScreenAndWithTips() {
        new TGPaymentPage().verifyCCSidePaymentInPaymentScreenAndWithTips();
    }

    @And("User verify tip amount with CC Side payment in payment screen")
    public void userVerifyTipAmountWithCCSidePaymentInPaymentScreen() {
        new TGPaymentPage().verifyTipAmountWithCCSidePaymentInPaymentScreen();
    }

    @Then("User verify item based discount after tax with percentage with CC Side payment in payment screen and with tips")
    public void userVerifyItemBasedDiscountAfterTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTips() {
        new TGPaymentPage().verifyItemBasedDiscountAfterTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTips();
    }

    @Then("User verify item based discount before tax with percentage with CC Side payment in payment screen and with tips")
    public void userVerifyItemBasedDiscountBeforeTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTips() {
        new TGPaymentPage().verifyItemBasedDiscountBeforeTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTips();
    }

    @Then("User verify item based discount before tax with amount with CC Side payment in payment screen and with tips")
    public void userVerifyItemBasedDiscountBeforeTaxWithAmountWithCCSidePaymentInPaymentScreenAndWithTips() {
        new TGPaymentPage().verifyItemBasedDiscountBeforeTaxWithAmountPriceWithCCSidePaymentInPaymentScreenAndWithTips();
    }

    @Then("User verify item based discount after tax with amount with CC Side payment in payment screen and with tips")
    public void userVerifyItemBasedDiscountAfterTaxWithAmountWithCCSidePaymentInPaymentScreenAndWithTips() {
        new TGPaymentPage().verifyItemBasedDiscountAfterTaxWithAmountWithCCSidePaymentInPaymentScreenAndWithTips();
    }


    @Then("User verify CC Side payment with tips and item based discount After tax as free item for Chicken Schnitzel")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsFreeItemForChickenSchnitzel() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsFreeItemForChickenSchnitzel();
    }

    @Then("User verify CC Side payment with tips and item based discount Before tax as free item for Chicken Schnitzel")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemForChickenSchnitzel() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemForChickenSchnitzel();
    }


    @Then("User verify item based discount after tax with amount with CC Side payment in payment screen and with tips for Chicken Schnitzel")
    public void userVerifyItemBasedDiscountAfterTaxWithAmountWithCCSidePaymentInPaymentScreenAndWithTipsForChickenSchnitzel() {
        new TGPaymentPage().userVerifyCCSidePaymentWithTipAmountAndItemBasedDiscountAfterTaxAsAmountForChickenSchnitzel();
    }

    @Then("User verify CC Side payment with tips and item based discount After tax as set price for Chicken Schnitzel")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceForChickenSchnitzel() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceForChickenSchnitzel();
    }

    @Then("User verify CC Side payment with tips and item based discount Before tax as set price for Chicken Schnitzel")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceForChickenSchnitzel() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceForChickenSchnitzel();
    }

    @Then("User verify CC Side payment with tips and check based discount after tax as open item with Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsOpenItemWithSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsOpenItemWithSandwiches();
    }

    @When("User verify CC Side payment with tips and open item discount after tax as percentage")
    public void userVerifyCCSidePaymentWithTipsAndOpenItemDiscountAfterTaxAsPercentage() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenItemDiscountAfterTaxAsPercentage();
    }

    @Then("User verify CC Side payment with tips and open check discount after tax as open discount")
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscount() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscount();
    }

    @Then("User verify CC Side payment with tips and open check discount before tax as open discount")
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscount() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscount();
    }

    //    @Then("User verify CC Side payment with tips and open check discount after tax as open discount with amount and decimal value")
//    public void userVerifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscountWithAmountAndDecimalValue() {
//
//    }
    @Then("User verify CC Side payment with tips and open check discount after tax as open discount with amount and decimal value")
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscountWithAmountAndDecimalValue() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckDiscountAmountBeforeTaxAsOpenDiscount();
    }

    @Then("User verify CC Side payment with tips and open check discount before tax as open discount with amount and decimal value")
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscountWithAmountAndDecimalValue() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscountWithAmountAndDecimalValue();
    }

    //    @Then("User verify CC Side payment with tips and open check discount after tax as open discount with amount and non-decimal value")
//    public void userVerifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscountWithAmountAndNonDecimalValue() {
//        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscountWithAmountAndNonDecimalValue();
//    }
    @Then("User verify CC Side payment with tips and open check discount after tax as open discount with amount and non-decimal value")
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscountWithAmountAndNonDecimalValue() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscountWithAmountAndNonDecimalValue();
    }

    @Then("User verify CC Side payment with tips and open check discount before tax as open discount with amount and non-decimal value")
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscountWithAmountAndNonDecimalValue() {
        new TGPaymentPage().userVerifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscountWithAmountAndNonDecimalValue();
    }



    @Then("User verify open check discount with before tax as amount for Margarita")
    public void userVerifyOpenCheckDiscountWithBeforeTaxAsAmountForMargarita() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsAmountForMargarita();
    }

    @And("User verify CC Side payment with tips and check based discount after tax as free item for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsFreeItemForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsFreeItemForSandwiches();
    }

    @Then("User verify item based discount before tax with percentage with CC Side payment in payment screen and with tips for Margarita")
    public void userVerifyItemBasedDiscountBeforeTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTipsForMargarita() {
        new TGPaymentPage().verifyItemBasedDiscountBeforeTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTipsForMargarita();
    }

    @And("User verify CC Side payment with tips and Varying Gratuity for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndVaryingGratuityForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndVaryingGratuityForSandwiches();
    }

    @And("User verify CC Side payment with tips and tax exempt for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndTaxExemptForSandwiches() {
        new TGPaymentPage().VerifyCCSidePaymentWithTipsAndTaxExemptForSandwiches();
    }
//new nov 29
    @And("User verify CC Side payment with tips and tax exempt for Sandwiches2")
    public void userVerifyCCSidePaymentWithTipsAndTaxExemptForSandwiches2() {
        new TGPaymentPage().VerifyCCSidePaymentWithTipsAndTaxExemptForSandwiches2();
    }
    //new nov 18
    @And("User verify CC Side payment with tips and tax exempt for Sandwiches1")
    public void userVerifyCCSidePaymentWithTipsAndTaxExemptForSandwiches1() {
        new TGPaymentPage().VerifyCCSidePaymentWithTipsAndTaxExemptForSandwiches1();
    }

    @And("User verify CC Side payment without tips and tax exempt for Sandwiches")
    public void userVerifyCCSidePaymentWithoutTipsAndTaxExemptForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithoutTipsAndTaxExemptForSandwiches();
    }

    @And("User verify CC Side payment with tips and item based discount after tax as percentage with tax exempt for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches();
    }

    @And("User verify CC Side payment with tips and item based discount after tax as percentage with tax exempt for Sandwiches1")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches1() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches1();
    }

    @And("User verify CC Side payment with tips and item based discount before tax as percentage with tax exempt for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches();
    }

    @And("User verify CC Side payment with tips and item based discount before tax as percentage with tax exempt for Sandwiches1")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches1() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches1();
    }

    @And("User verify CC Side payment with tips and item based discount after tax as amount with tax exempt for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches();
    }
    @And("User verify CC Side payment with tips and item based discount after tax as amount with tax exempt for Sandwiches1")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches1() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches1();
    }

    @And("User verify CC Side payment with tips and item based discount before tax as amount with tax exempt for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches();
    }
    @And("User verify CC Side payment with tips and item based discount before tax as amount with tax exempt for Sandwiches1")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches1() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches1();
    }

    @And("User verify CC Side payment with tips and item based discount after tax as set price with tax exempt for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches();
    }

    @And("User verify CC Side payment with tips and item based discount after tax as set price with tax exempt for Sandwiches1")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches1() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches1();
    }

    @And("User verify CC Side payment with tips and item based discount before tax as set price with tax exempt for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches();
    }

    @And("User verify CC Side payment with tips and item based discount before tax as set price with tax exempt for Sandwiches1")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches1() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches1();
    }

    @And("User verify CC Side payment with tips and item based discount after tax as free item with tax exempt for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches();
    }



    @And("User verify CC Side payment with tips and item based discount before tax as free item with tax exempt for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwiches();
    }

    @And("User verify CC Side payment with tips and Fix Gratuity for Sandwiches")
    public void userVerifyCCSidePaymentWithTipsAndFixGratuityForSandwiches() {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndFixGratuityForSandwiches();
    }


    @Then("User select GiveX payment method")
    public void userSelectGiveXPaymentMethod() {
        new TGPaymentPage().selectGiveXPaymentMethod();
    }

    @When("User enter GiveX card number for tip")
    public void userEnterGiveXCardNumberForTip() {
        new TGPaymentPage().enterGiveXCardNumberForTip();
    }

    @Then("User click Forced Redemption button")
    public void userClickForcedRedemptionButton() {
        new TGPaymentPage().clickForcedRedemptionButton();
    }

    @And("User verify receipt printer popup")
    public void userVerifyReceiptPrinterPopup() {
        new TGPaymentPage().verifyReceiptPrinterPopup();
    }

    @And("User verify GiveX payment method with Hamburger")
    public void userVerifyGiveXPaymentMethodWithHamburger() {
        new TGPaymentPage().verifyGiveXPaymentMethodWithHamburger();
    }

    @Then("User verify GiveX payment method and sandwiches total price for Void action")
    public void userVerifyGiveXPaymentMethodAndSandwichesTotalPriceForVoidAction() {
        new TGPaymentPage().verifyGiveXPaymentMethodAndTunaTacosTotalPriceForVoidAction();
    }

    @Then("User verify paid amount which will be void for Tuna Tacos")
    public void userVerifyPaidAmountWhichWillBeVoidForTunaTacos() {
        new TGPaymentPage().verifyPaidAmountWhichWillBeVoidForTunaTacos();
    }

    @Then("User verify GiveX payment method and total price for Tuna Tacos")
    public void userVerifyGiveXPaymentMethodAndTotalPriceForTunaTacos() {
        new TGPaymentPage().verifyGiveXPaymentMethodAndTotalPriceForTunaTacos();
    }


    @And("User verify cash payment for Sandwiches")
    public void userVerifyCashPaymentForSandwiches() {
        new TGPaymentPage().verifyCashPaymentForSandwiches();
    }

    @And("User verify cash payment for Cocktail with service charge")
    public void userVerifyCashPaymentForCocktailWithServiceCharge() {
        new TGPaymentPage().verifyCashPaymentForCocktailWithServiceCharge();
    }

    @And("User verify paid order for Sandwiches")
    public void userVerifyPaidOrderForSandwiches() {
        new TGPaymentPage().verifyPaidOrderForSandwiches();
    }

    @When("User click GiveX payment option")
    public void userClickGiveXPaymentOption() {
        new TGPaymentPage().clickGiveXPaymentOption();
    }

    @When("User verify Side CC payment for Sandwiches")
    public void userVerifySideCCPaymentForSandwiches() {
        new TGPaymentPage().verifySideCCPaymentForSandwiches();
    }

    @When("User verify Side CC payment for Sandwiches with tips and without service charge")
    public void userVerifySideCCPaymentForSandwichesWithTipsAndWithoutServiceCharge() {
        new TGPaymentPage().verifySideCCPaymentForSandwichesWithTipsAndWithoutServiceCharge();
    }

    @When("User verify Side CC payment for cocktail with tip and service charge")
    public void userVerifySideCCPaymentForCocktailWithTipAndServiceCharge() {
        new TGPaymentPage().verifySideCCPaymentForCocktailWithTipAndServiceCharge();
    }

    @When("User verify Side CC payment for coke without tip and service charge")
    public void userVerifySideCCPaymentForCokeWithoutTipAndServiceCharge() {
        new TGPaymentPage().verifySideCCPaymentForCokeWithoutTipAndServiceCharge();
    }

    @When("User click any partial amount for partial payment")
    public void userClickAnyPartialAmountForPartialPayment() {
        new TGPaymentPage().clickAnyPartialAmountForPartialPayment();
    }

    @Then("User verify will payment amount")
    public void userVerifyWillPaymentAmount() {
        new TGPaymentPage().verifyWillPaymentAmount();
    }

    @Then("User verify first paid amount with gift card and tip")
    public void userVerifyFirstPaidAmountWithGiftCardAndTip() {
        new TGPaymentPage().verifyFirstPaidAmountWithGiftCardAndTip();
    }

    @Then("User verify first paid amount with gift card and tip1")
    public void userVerifyFirstPaidAmountWithGiftCardAndTip1() {
        new TGPaymentPage().verifyFirstPaidAmountWithGiftCardAndTip1();
    }

    @When("^User verify Side CC payment for cocktail without tip and service charge$")
    public void userVerifySideCCPaymentForCocktailWithoutTipAndServiceCharge() {
        new TGPaymentPage().verifySideCCPaymentForCocktailWithoutTipAndServiceCharge();
    }
    @And("I click submit button")
    public void iClickSubmitButton() throws InterruptedException {
        Thread.sleep(10000);
        new TGPaymentPage().clickSubmitButton();
    }

    @And("I wait for the \"([^\"]*)\" \"([^\"]*)\"$")
    public void iWaitForThe(String time,String msg) throws InterruptedException {
        Thread.sleep(Long.parseLong(time));
        utils.log().info(msg);
    }

    @And("^User verify CC Side payment with tips value as \"([^\"]*)\" and item based discount after tax as percentage with tax exempt for Sandwiches$")
    public void userVerifyCCSidePaymentWithTipsValueAsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches(value);
    }

    @When("^User verify CC Side payment with tips value as \"([^\"]*)\" and open item discount after tax as percentage$")
    public void userVerifyCCSidePaymentWithTipsValueAsAndOpenItemDiscountAfterTaxAsPercentage(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenItemDiscountAfterTaxAsPercentage(value);
    }

    @Then("^User verify CC Side payment with tips value as \"([^\"]*)\" and open check discount after tax as open discount$")
    public void userVerifyCCSidePaymentWithTipsValueAsAndOpenCheckDiscountAfterTaxAsOpenDiscount(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscount(value);
    }

    @Then("^User verify CC Side payment with tips value as \"([^\"]*)\" and open check discount before tax as open discount$")
    public void userVerifyCCSidePaymentWithTipsValueAsAndOpenCheckDiscountBeforeTaxAsOpenDiscount(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscount(value);
    }

    @And("^User verify CC Side payment with tips value as \"([^\"]*)\" and item based discount before tax as percentage with tax exempt for Sandwiches$")
    public void userVerifyCCSidePaymentWithTipsValueAsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches(String text) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches(text);
    }

    @And("^User verify CC Side payment with tips value as \"([^\"]*)\" and item based discount after tax as amount with tax exempt for Sandwiches$")
    public void userVerifyCCSidePaymentWithTipsValueAsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches(value);
    }


    @And("^User verify CC Side payment with tips value as \"([^\"]*)\" and item based discount before tax as amount with tax exempt for Sandwiches$")
    public void userVerifyCCSidePaymentWithTipsValueASAndItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches(value);
    }

    @And("^User verify CC Side payment with tips value as \"([^\"]*)\" and item based discount after tax as set price with tax exempt for Sandwiches$")
    public void userVerifyCCSidePaymentWithTipsValueASAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches(value);
    }


    @And("^User verify CC Side payment with tips value as \"([^\"]*)\" and item based discount before tax as set price with tax exempt for Sandwiches$")
    public void userVerifyCCSidePaymentWithTipsValueAsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches(String value) {
        new TGPaymentPage().verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches(value);
    }

}
