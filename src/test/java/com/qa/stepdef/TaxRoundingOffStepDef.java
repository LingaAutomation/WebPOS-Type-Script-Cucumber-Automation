package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.TestUtils;
//import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

public class TaxRoundingOffStepDef {
    @Given("I am logging in")
    public void i_am_logging_in() {
        new ClockInScreen().ClockIn();
    }

    @Given("I am logging in2")
    public void i_am_logging_in2() {
        new ClockInScreen().ClockIn2();
    }

    @And("^I have closed the order type window$")
    public void iHaveClosedTheOrderTypeWindow() throws InterruptedException {
        new OrderTypeWindow().pressCancelBtn();
    }

    @And("^I am logging in new$")
    public void ILoginWebPos() throws InterruptedException {
        new ClockInScreen().goToWebPOS();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^I enter the pin in the pin screen$")
    public void i_am_logging_in_new() throws InterruptedException {
        new TaxRoundingOff().loginWebpos();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^I have selected category arrow$")
    public void iSelectedCategoryArrow() throws InterruptedException {
        new TaxRoundingOff().categoryArrowBtn();
    }

    @And("^Select the category \"([^\"]*)\"$")
    public void selectTheCategory(String category) throws Exception {
        new TaxRoundingOff().category1Selection(category);
//        nselectMenuBasicValidationForQsr
    }

    @And("^Select the sub category \"([^\"]*)\"$")
    public void selectTheSubCategory(String subcategory) throws Exception {
        new TaxRoundingOff().subCategory1Selection(subcategory);
//        nselectMenuBasicValidationForQsr
    }

    @And("^Select the menu item \"([^\"]*)\"$")
    public void selectTheMenu(String menuItem) throws Exception {
        new TaxRoundingOff().menu1Selection(menuItem);
    }

    @And("^Select the combo menu item \"([^\"]*)\"$")
    public void selectTheComboMenu(String menuItem) throws Exception {
        new BasePage().selectComboMenuItemAs(menuItem);
    }


    @And("^I selected the serving size as \"([^\"]*)\"$")
    public void selectTheMenuSizeAs(String ServingSize) throws Exception {
        new BasePage().selectTheMenuSize(ServingSize);
    }

    @And("^I selected the serving size as \"([^\"]*)\" conversational$")
    public void selectTheMenuSizeConversationalAs(String ServingSize) throws Exception {
        new BasePage().selectTheMenuSizeConversational(ServingSize);
    }

    @And("^I selected the modifier \"([^\"]*)\"$")
    public void selectTheModifier(String ModifierName) throws Exception {
        new BasePage().selectTheModifierAs(ModifierName);
    }

    @And("^I selected the modifier2 \"([^\"]*)\"$")
    public void selectTheModifier2(String ModifierName) throws Exception {
        new BasePage().selectTheModifierAs2(ModifierName);
    }


    @And("^Verify if inclusive tax menu \"([^\"]*)\" inclusive tax modifier \"([^\"]*)\" and discount \"([^\"]*)\" are calculated properly$")
    public void VerifyIfTheInclusiveTaxAndDiscountArecalculatedProperlyAmountBT(double taxPercent, double modifierTaxPercent, double discountAmount) {
        new TaxRoundingOff().VerifyIfInclusiveTaxAndDiscountArecalculatedProperlyAmountBT(taxPercent, modifierTaxPercent, discountAmount);

        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);

        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the alternate modifier \"([^\"]*)\"$")
    public void selectTheAlternateModifier(String ModifierName) throws Exception {
        new BasePage().selectTheAlternateModifierAs(ModifierName);
    }

    @And("^I selected the prefix \"([^\"]*)\"$")
    public void selectThePrefix(String PrefixName) throws Exception {
        new BasePage().selectThePrefixAs(PrefixName);
    }

    @And("^Check the amount of menu item \"([^\"]*)\"$")
    public void checkTheAmountOfMenuItem(String amount) throws InterruptedException {
        new TaxRoundingOff().checkingMenuPrice(amount);
    }

    @And("^Verify if exclusive tax menu \"([^\"]*)\" exclusive tax modifier \"([^\"]*)\" check tax \"([^\"]*)\" and discount \"([^\"]*)\" are calculated properly$")
    public void VerifyIfTheExclusiveTaxAndDiscountArecalculatedProperlyAmountBTWithCheckTax(double taxPercent, double modifierTaxPercent, double checkTaxPercent, double discPerc) {
        new TaxRoundingOff().VerifyIfExclusiveTaxAndDiscountArecalculatedProperlyAmountBTCheckTax(taxPercent, modifierTaxPercent, checkTaxPercent, discPerc);

        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);

        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax menu \"([^\"]*)\" inclusive tax modifier \"([^\"]*)\" check tax \"([^\"]*)\" are calculated properly$")
    public void VerifyIfTheInclusiveTaxAndCheckTaxArecalculatedProperlyWithCheckTax(double taxPercent, double modifierTaxPercent, double checkTaxPercent) {
        new TaxRoundingOff().VerifyIfInclusiveTaxAndCheckTaxArecalculatedProperlyWithCheckTax(taxPercent, modifierTaxPercent, checkTaxPercent);

        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);

        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax menu \"([^\"]*)\" check tax \"([^\"]*)\" are calculated properly$")
    public void VerifyIfTheExclusiveTaxAndCheckTaxArecalculatedProperlyWithCheckTax(double taxPercent, double checkTaxPercent) {
        new TaxRoundingOff().VerifyIfExclusiveTaxAndCheckTaxArecalculatedProperlyWithCheckTax(taxPercent, checkTaxPercent);

        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);

        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax menu \"([^\"]*)\" check tax \"([^\"]*)\" are calculated properly multiple menu$")
    public void VerifyIfTheExclusiveTaxAndCheckTaxArecalculatedProperlyWithCheckTaxMultipleMenu(double taxPercent, double checkTaxPercent) {
        new TaxRoundingOff().VerifyIfExclusiveTaxAndCheckTaxArecalculatedProperlyWithCheckTaxMultipleMenu(taxPercent, checkTaxPercent);

        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);

        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax menu \"([^\"]*)\" exclusive tax modifier \"([^\"]*)\" and percentage discount \"([^\"]*)\" are calculated properly$")
    public void VerifyIfTheExclusiveTaxAndDiscountArecalculatedProperlyPercBT(double taxPercent, double modifierTaxPercent, double discAmt) {
        new TaxRoundingOff().VerifyIfExclusiveTaxAndDiscountArecalculatedProperlyPercBT(taxPercent, modifierTaxPercent, discAmt);

        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);

        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax menu \"([^\"]*)\" exclusive tax modifier \"([^\"]*)\" and percentage discount \"([^\"]*)\" are calculated properly normal menu$")
    public void VerifyIfTheExclusiveTaxAndDiscountArecalculatedProperlyPercBTNormalMenu(double taxPercent, double modifierTaxPercent, double discAmt) {
        new TaxRoundingOff().VerifyIfExclusiveTaxAndDiscountArecalculatedProperlyPercBTNormalMenu(taxPercent, modifierTaxPercent, discAmt);

        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);

        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if menu price and subtotal are equal$")
    public void verifyIfMenuItemAndSubtotalAmountAreSame() throws InterruptedException {
        new TaxRoundingOff().verifyIfMenuAmountAndSubtotalAreEqual();
    }

    @And("^Verify if tax is calculated as per the quantity \"([^\"]*)\"$")
    public void verifyIfTaxIsCalculatedAsPerTheQuantity(String quantity) throws InterruptedException {
        new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax(quantity);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated as per quantity2 \"([^\"]*)\"$")
    public void verifyIfTaxIsCalculatedAsPerTheQuantity2(String quantity2) throws InterruptedException {
        new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated as per the quantity3 \"([^\"]*)\"$")
    public void verifyIfTaxIsCalculatedAsPerTheQuantity3(String quantity3) throws InterruptedException {
        new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity3);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu item with inclusive tax$")
    public void SelectTheInclusiveTaxMenuItem() throws InterruptedException {
        new TaxRoundingOff().SelectTheMenuItemWithTheInclusiveTax();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the tax \"([^\"]*)\" is calculated correctly$")
    public void VerifyIfTaxIsCalculatedCorrectly(double taxValue) throws InterruptedException {

        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedCorrectly1(taxValue);
    }

//    @And("^Verify if the tax value \"([^\"]*)\"$ is calculated correctly$")
//    public void VerifyIfTaxValueIsCalculatedCorrectly(double taxValue) throws InterruptedException {
//
//        new TaxRoundingOff().VerifyIfTheTaxValueIsCalculatedCorrectly(taxValue);
//
//    }

    @And("^Verify if the total is calculated correctly$")
    public void VerifyIfTotalIsCalculatedCorrectly() throws InterruptedException {

        new TaxRoundingOff().VerifyIfTheTotalIsCalculatedCorrectly();
    }

    @And("^Verify if the total is calculated correctly when inclusive tax and check tax are available$")
    public void VerifyIfTotalIsCalculatedCorrectlyWhenIncAndCheckTaxAvailable() throws InterruptedException {

        new TaxRoundingOff().VerifyIfTheTotalIsCalculatedCorrectlyWhenIncAndCheckTaxAvailable();
    }

    @And("^Verify if the total is calculated correctly when inclusive tax and check tax are available and item discount is applied$")
    public void VerifyIfTotalIsCalculatedCorrectlyWhenIncAndCheckTaxAvailableItemDiscApplied() throws InterruptedException {

        new TaxRoundingOff().VerifyIfTheTotalIsCalculatedCorrectlyWhenIncAndCheckTaxAvailableItemDiscApplied();
    }
    @And("^Verify if the balance due is calculated correctly$")
    public void VerifyIfBalanceDueIsCalculatedCorrectly() throws InterruptedException {

        new TaxRoundingOff().VerifyIfTheBalanceDueIsCalculatedCorrectly();
    }

    @And("^Verify if the balance due is displayed correctly after payment$")
    public void VerifyIfBalanceDueIsCalculatedCorrectlyAfterPayment() throws InterruptedException {

        new TaxRoundingOff().VerifyIfTheBalanceDueIsCalculatedCorrectlyAfterPayment();

    }

    @And("^Verify if the balance due is displayed correctly after payment weborder check$")
    public void VerifyIfBalanceDueIsCalculatedCorrectlyAfterPaymentWebOrder() throws InterruptedException {

        new TaxRoundingOff().VerifyIfTheBalanceDueIsCalculatedCorrectlyAfterPaymentWebOrder();

    }

    @And("^Select the menu item with exclusive tax$")
    public void SelectTheExclusiveTaxMenuItem() throws InterruptedException {
        new TaxRoundingOff().SelectTheMenuItemWithTheExclusiveTax();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the ExcTax \"([^\"]*)\" is calculated correctly$")
    public void VerifyIfExcTaxIsCalculatedCorrectly(double taxValue) throws InterruptedException {
        new TaxRoundingOff().VerifyIfTheExcTaxIsCalculatedCorrectly(taxValue);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the ExcTax and total are calculated correctly in check preview screen$")
    public void VerifyIfExcTaxndTotalAreCalculatedCorrectlyInCheckPreview() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTheExcTaxIsCalculatedCorrectlyInCheckPreview();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the IncTax and total are calculated correctly in check preview screen$")
    public void VerifyIfIncTaxndTotalAreCalculatedCorrectlyInCheckPreview() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTheIncTaxIsCalculatedCorrectlyInCheckPreview();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the ExcTax and total are calculated correctly in check preview screen when check tax is available$")
    public void VerifyIfExcTaxndTotalAreCalculatedCorrectlyInCheckPreviewCheckTaxAvailable() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTheExcTaxIsCalculatedCorrectlyInCheckPreviewCheckTaxAvailable();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the IncTax and total are calculated correctly in check preview screen when check tax is available$")
    public void VerifyIfIncTaxndTotalAreCalculatedCorrectlyInCheckPreviewCheckTaxAvailable() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTheIncTaxIsCalculatedCorrectlyInCheckPreviewCheckTaxAvailable();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax menu \"([^\"]*)\" exclusive tax modifier \"([^\"]*)\" and discount \"([^\"]*)\" are calculated properly$")
    public void VerifyIfTheExclusiveTaxAndDiscountArecalculatedProperlyAmountBT(double taxPercent, double modifierTaxPercent, double discountAmount) {
        new TaxRoundingOff().VerifyIfExclusiveTaxAndDiscountArecalculatedProperlyAmountBT(taxPercent, modifierTaxPercent, discountAmount);

    }

    @And("^Verify if the total value is calculated correctly$")
    public void VerifyIfTheTotalValueIsCalculatedCorrectly() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTotalValueIsCalculatedCorrectly();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }


    @And("^Verify if Total is calculated without tax exclusive$")
    public void VerifyIfTheTotalValueIsCalculatedCorrectlyWithoutTaxExclusive() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTotalValueIsCalculatedCorrectlyWithoutTaxExclusive();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if Tax is zero and Total is calculated without tax exclusive in check preview screen$")
    public void VerifyIfTheTotalValueIsCalculatedCorrectlyWithoutTaxExclusiveInCheckPreview() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTotalValueIsCalculatedCorrectlyWithoutTaxExclusiveInCheckPreview();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is calculated correctly$")
    public void VerifyIfTheBalanceDueValueIsCalculatedCorrectly() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueValueIsCalculatedCorrectly();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is calculated correctly after tax exempt$")
    public void VerifyIfTheBalanceDueValueIsCalculatedCorrectlyAfterTaxExempt() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueValueIsCalculatedCorrectlyAfterTaxExempt();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is calculated correctly when item service charge is present$")
    public void VerifyIfTheBalanceDueValueIsCalculatedCorrectlyISCIsPresent() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueValueIsCalculatedCorrectlyISCIsPresent();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If item service charge \"([^\"]*)\" Is Calculated Properly$")
    public void VerifyIfTheItemServiceChargeIsCalculatedCorrectly(double taxValue) throws InterruptedException {
        new TaxRoundingOff().VerifyIfItemServiceChargeIsCalculatedCorrectly(taxValue);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is displayed correctly after payment$")
    public void VerifyIfTheBalanceDueValueIsCalculatedCorrectlyAfterPayment() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueValueIsCalculatedCorrectlyAfterPayment();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is displayed correctly after payment already made$")
    public void VerifyIfTheBalanceDueValueIsCalculatedCorrectlyAfterPaymentAlreadyMade() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueValueIsCalculatedCorrectlyAfterPaymentAlreadyMade();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is displayed correctly after payment split merge$")
    public void VerifyIfTheBalanceDueValueIsCalculatedCorrectlyAfterPaymentSplitMerge() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueValueIsCalculatedCorrectlyAfterPaymentSplitMerge();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu item with exclusive tax with discount$")
    public void SelectTheMenuItemWithExclusiveTaxWithDiscount() throws InterruptedException {
        new TaxRoundingOff().SelectTheMenuItemWithExclusiveTaxAndDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Apply the item discount \"([^\"]*)\"$")
    public void ApplyTheItemDiscount(String DiscountName) throws InterruptedException {
        new TaxRoundingOff().ApplyItemDiscount(DiscountName);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax \"([^\"]*)\" \"([^\"]*)\" is calculated properly and calculate round-off$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOff(double DiscountPercent, double taxPercent) {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOff(DiscountPercent, taxPercent);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total amount is calculated correctly$")
    public void VerifyIfTheTotalAmountIsCalculatedCorrectly() {
        new TaxRoundingOff().VerifyIfTotalAmountIsCalculatedCorrectly();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due amount is calculated correctly$")
    public void VerifyIfTheBalanceDueAmounttIsCalculatedCorrectly() {
        new TaxRoundingOff().VerifyIfBalanceDueAmountIsCalculatedCorrectly();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due amount is displayed correctly after payment$")
    public void VerifyIfTheBalanceDueAmounttIsCalculatedCorrectlyAfterPayment() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterPayment();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due amount is displayed correctly after payment seat 1$")
    public void VerifyIfTheBalanceDueAmounttIsCalculatedCorrectlyAfterPaymentSeat1() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterPaymentSeat1();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu item with inclusive tax with discount$")
    public void SelectTheMenuItemWithTheInclusiveTaxAndDiscount() throws InterruptedException {
        new TaxRoundingOff().SelectTheMenuItemWithInclusiveTaxAndDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Apply the item discount2 \"([^\"]*)\"$")
    public void ApplyTheItemDiscount2(String discountName2) throws InterruptedException {
        new TaxRoundingOff().ApplyItemDiscount2(discountName2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Verify if tax \"([^\"]*)\" \"([^\"]*)\" is calculated correctly and calculate round-off$")
    public void VerifyIfTaxIsCalculatedCorrectlyAndCalculateRoundOff(Double DiscountPercent, Double taxPercent) throws InterruptedException {
        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOff(DiscountPercent,taxPercent);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Verify if the total amount is displayed correctly$")
    public void VerifyIfTheTotalAmountIsDisplayedCorrectly() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTotalAmountIsDisplayedCorrectly();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Verify if the balance due amount is displayed correctly$")
    public void VerifyIfTheBalanceDueAmountIsDisplayedCorrectly() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueAmountIsDisplayedCorrectly();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Verify if the balance due amount is displayed correctly reopen payment done already$")
    public void VerifyIfTheBalanceDueAmountIsDisplayedCorrectlyReopenPaymentDone() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueAmountIsDisplayedCorrectlyReopenPaymentDone();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Verify if the balance due amount is displayed correctly after the payment$")
    public void VerifyIfTheBalanceDueAmountIsCalculatedCorrectlyAfterThePayment() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterThePayment();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Verify if the balance due amount is displayed correctly after the payment done$")
    public void VerifyIfTheBalanceDueAmountIsCalculatedCorrectlyAfterThePaymentDone() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterThePaymentDone();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Selected Options button$")
    public void SelectedOptionsButton() throws InterruptedException {
        new TaxRoundingOff().SelectOptionsButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^I select service exempt button$")
    public void selectServiceExemptButton()
    {
        new TaxRoundingOff().selectTheServiceExemptButton();

    }

    @And("^I selected fire coursing button$")
    public void SelectedFireCoursingButton() throws InterruptedException {
        new TaxRoundingOff().SelectedTheFireCoursingButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Select tax exempt option$")
    public void SelectedTaxExemptOption() throws InterruptedException {
        new TaxRoundingOff().SelectedTheTaxExemptOption();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Selected Open item option$")
    public void SelectedOpenItemOption() throws InterruptedException {
        new TaxRoundingOff().SelectedOpenItemOption();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }


    @And("^Selected Coursing name field$")
    public void SelectedCoursingNameField() throws InterruptedException {
        new TaxRoundingOff().SelectedTheCoursingNameField();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^I swipe to \"([^\"]*)\" Coursing Name$")
    public void iSwipeToTheCoursingName(String name) throws InterruptedException {
        new TaxRoundingOff().swipeToTheCourseName(name);
    }

    @And("^I selected the coursing as \"([^\"]*)\"$")
    public void iSelectedTheCoursingAs(String name) throws InterruptedException {
        new TaxRoundingOff().iSelectedCoursingAs(name);
    }

    @And("^I swipe to \"([^\"]*)\" Coursing Name2$")
    public void iSwipeToTheCoursingName2(String name) throws InterruptedException {
        new TaxRoundingOff().swipeToTheCourseName2(name);
    }

    @And("^I entered course name$")
    public void iEnteredCourseNameAs() {
//        new TaxRoundingOff().setMenuItemName(menu);
        new  TaxRoundingOff().enterCoursingNameAs();
    }

    @And("^I selected the Price text field$")
    public void iSelectedThePriceTextField() {
        new TaxRoundingOff().iSelectedPriceTextField();
    }

    @And("^I entered the price$")
    public void iEnteredThePrice() {
        new TaxRoundingOff().iEnteredThePrice();
    }

    @And("^I selected the Continue button$")
    public void iSelectedTheContinueButton() {
        new TaxRoundingOff().iSelectedContinueButton();
    }

    @And("^I selected the Tax$")
    public void iSelectedTheTax() {
        new TaxRoundingOff().selectTheTax();
    }

    @And("^I selected the Exclusive Tax$")
    public void iSelectedTheTax2Exclusive() {
        new TaxRoundingOff().selectTheTax2Exclusive();
    }

    @And("^I selected the back button$")
    public void iSelectedTheBackButton() {
        new TaxRoundingOff().iSelectedBackButton();
    }

    @And("^Verify if tax and round-off are calculated properly for exclusive$")
    public void verifyIfTheTaxAndRoundOffAreCalculatedProperlyExclusive() {
        new TaxRoundingOff().verifyIfTaxAndRoundOffAreCalculatedProperlyExclusive();
    }

    @And("^I selected the Inclusive Tax$")
    public void iSelectedTheTax2Inclusive() {
        new TaxRoundingOff().selectTheTax2Inclusive();
    }

    @And("^Verify if tax and round-off are calculated properly for inclusive$")
    public void verifyIfTheTaxAndRoundOffAreCalculatedProperlyInclusive() {
        new TaxRoundingOff().verifyIfTheTaxAndRoundOffAreCalculatedProperlyInclusive();
    }

    @And("^Select the menu item with check tax$")
    public void selectTheMenuItemWithCheckTax() {
        new TaxRoundingOff().selectMenuItemWithCheckTax();
    }

    @And("^Verify if the CheckTax is calculated correctly and calculate round-off$")
    public void VerifyIfTheCheckTaxIsCalculatedCorrectlyAndCalculateRoundoff() {
        new TaxRoundingOff().VerifyIfCheckTaxIsCalculatedCorrectlyAndCalculateRoundoff();
    }

    @And("^Verify if the exclusive tax \"([^\"]*)\" CheckTax \"([^\"]*)\" is calculated correctly and calculate round-off$")
    public void VerifyIfTheExclusiveTaxAndCheckTaxIsCalculatedCorrectlyAndCalculateRoundoff(double taxValue, double taxValue2) {
        new TaxRoundingOff().VerifyIfExclusiveTaxAndCheckTaxIsCalculatedCorrectlyAndCalculateRoundoff(taxValue, taxValue2);
    }

    @And("^Verify if the CheckTax \"([^\"]*)\" is calculated correctly and calculate round-off$")
    public void VerifyIfTheCheckTaxIsCalculatedCorrectlyAndCalculateRoundoff(double taxValue) {
        new TaxRoundingOff().VerifyIfCheckTaxIsCalculatedCorrectlyAndCalculateRoundoff(taxValue);
    }

    @And("^Verify if the CheckTax \"([^\"]*)\" is calculated correctly and calculate round-off multiple menu$")
    public void VerifyIfTheCheckTaxIsCalculatedCorrectlyAndCalculateRoundoffMultipleMenu(double taxValue) {
        new TaxRoundingOff().VerifyIfCheckTaxIsCalculatedCorrectlyAndCalculateRoundoffMultipleMenu(taxValue);
    }

    @And("^I entered the price for the open item$")
    public void iEnteredThePriceForTheOpenItem() {
        new TaxRoundingOff().iEnteredPriceForTheOpenItem();
    }

    @And("^Select the menu item with both inclusive and exclusive tax$")
    public void selectTheMenuItemWithBothInclusiveAndExclusiveTax() {
        new TaxRoundingOff().selectMenuItemWithBothInclusiveAndExclusiveTax();
    }

    @And("^Verify if both the taxes exc \"([^\"]*)\" and inc \"([^\"]*)\" are calculated correctly and calculate round-off$")
    public void verifyIfBothTheTaxesExcIncAreCalculatedCorrectlyAndCalculateRoundoff(Double tax1, Double tax2) {
        new TaxRoundingOff().verifyIfBothTaxesExcIncAreCalculatedCorrectlyAndCalculateRoundoff(tax1, tax2);
    }

    @And("^Verify if both the taxes are calculated correctly and calculate round-off$")
    public void verifyIfBothTheTaxesAreCalculatedCorrectlyAndCalculateRoundoff() {
        new TaxRoundingOff().verifyIfBothTaxesAreCalculatedCorrectlyAndCalculateRoundoff();
    }

    @And("^Verify if the total value is calculated correctly for both inclusive and exclusive tax$")
    public void verifyifTheTotalValueIsCalculatedCorrectlyBothInclusiveAndExclusive() {
        new TaxRoundingOff().verifyifTotalValueIsCalculatedCorrectlyBothInclusiveAndExclusive();
    }

    @And("^I selected the exclusive tax$")
    public void iSelectedExclusiveTax() throws Exception {
        new TaxRoundingOff().iSelectedTheExclusiveTax();
    }

    @And("^I selected the inclusive tax$")
    public void iSelectedInclusiveTax() throws Exception {
//        new TaxRoundingOff().iSelectedTheInclusiveTax();
    }

    @And("^Verify if tax is calculated properly and calculated roundOff Inc And Exc$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffIncAndExc() {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncAndExc();
    }

    @And("^Verify if the total value is calculated correctly for both inclusive and exclusive tax with discount$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffIncAndExcWithDiscount() {
        new TaxRoundingOff().VerifyIfTotalIsCalculatedProperlyAndCalculateRoundOffIncAndExcWithDiscount();
    }

    @And("^Verify if tax \"([^\"]*)\" is calculated properly and calculate roundOff for amount discount \"([^\"]*)\"$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffExcWithAmountDiscount(double taxPercent, double DiscountAmount) {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffExcWithAmountDiscount(taxPercent,DiscountAmount);
    }

    @And("^Verify if tax \"([^\"]*)\" is calculated properly and calculate roundOff for amount discount Inclusive \"([^\"]*)\"$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffIncWithAmountDiscount(double taxPercent, double DiscountAmount) {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncWithAmountDiscount(taxPercent,DiscountAmount);
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for set price discount Exclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffExcWithSetPriceDiscount() {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffExcWithSetPriceDiscount();
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for set price discount Inclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffIncWithSetPriceDiscount() {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncWithSetPriceDiscount();
    }

    @And("^Select the menu items with exclusive tax with check discount$")
    public void SelectTheMenuItemsWithExclusiveTaxWithCheckDiscountt() {
        new TaxRoundingOff().SelectMenuItemsWithExclusiveTaxWithCheckDiscount();
    }

    @And("^Apply the check discount \"([^\"]*)\"$")
    public void ApplyTheCheckDiscount(String DiscountName) throws Exception {
        new TaxRoundingOff().ApplyCheckDiscount(DiscountName);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the option button$")
    public void selectTheOptionBtn() {
        new TaxRoundingOff().selectOptionBtn();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the discount button$")
    public void selectTheDiscountBtn() {
        new TaxRoundingOff().selectDiscountBtn();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the open check discount button$")
    public void selectTheOpenCheckDiscBtn() {
        new TaxRoundingOff().selectOpenCheckDiscBtn();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated properly \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and calculate roundOff for check discount exclusive$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive(double DiscountPercent, double taxPercent, double taxPercent2) {
        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive(DiscountPercent, taxPercent, taxPercent2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated properly \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and calculate roundOff for check discount exclusive repeat order$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusiveRepeatOrder(double DiscountPercent, double taxPercent, double taxPercent2) {
        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusiveRepeatOrder(DiscountPercent, taxPercent, taxPercent2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for check discount \"([^\"]*)\" exclusive \"([^\"]*)\"$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive(double DiscountPercent, double taxPercent) {
        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive(DiscountPercent, taxPercent);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for check discount \"([^\"]*)\" exclusive \"([^\"]*)\" and \"([^\"]*)\"$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive2(double DiscountPercent, double taxPercent, double taxPercent2) {
        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive2(DiscountPercent, taxPercent, taxPercent2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }


    @And("^Select the menu items with inclusive tax with check discount$")
    public void SelectTheMenuItemsWithInclusiveTaxWithCheckDiscount() {
        new TaxRoundingOff().SelectMenuItemsWithInclusiveTaxWithCheckDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax \"([^\"]*)\" is calculated properly and calculate roundOff for check discount \"([^\"]*)\" inclusive$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountInclusive(double taxPercent, double DiscountPercent) {
        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountInclusive(taxPercent, DiscountPercent);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu item with exclusive tax for open discount$")
    public void SelectTheMenuItemWithTheExclusiveTaxForOpenDiscount() {
        new TaxRoundingOff().SelectMenuItemWithTheExclusiveTaxForOpenDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected menu options disc$")
    public void iSelectedMenuOptionsDiscPresent() {
//        new TaxRoundingOff().iSelectedTheMenuOptionsDiscPresent();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected menu options2 disc$")
    public void iSelectedMenuOptions2DiscPresent() {
//        new TaxRoundingOff().iSelectedTheMenuOptions2DiscPresent();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected menu options$")
    public void iSelectedMenuOptions() {
        new TaxRoundingOff().iSelectedTheMenuOptions();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected menu options2$")
    public void iSelectedMenuOptions2() {
        new TaxRoundingOff().iSelectedTheMenuOptions2();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected menu options2 discount$")
    public void iSelectedMenuOptions2Disc() {
        new TaxRoundingOff().iSelectedTheMenuOptions2Disc();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected menu options for second menu$")
    public void iSelectedMenuOptionsForSecondMenu() {
//        new TaxRoundingOff().iSelectedTheMenuOptionsSecondMenu();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected menu options mod$")
    public void iSelectedMenuOptionsMod() {
//        new TaxRoundingOff().iSelectedTheMenuOptionsMod();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }
//
//    @And("^I selected menu options2$")
//    public void iSelectedMenuOptions2() {
////         new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
////        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
//    }

    @And("^I selected Open Discount$")
    public void iSelectedOpenDiscount() {
        new TaxRoundingOff().iSelectedTheOpenDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I tapped the percentage field$")
    public void iTappedThePercentageField() throws InterruptedException {
        new TaxRoundingOff().iTappedPercentageField();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

//    @And("^I tapped the percentage field open check$")
//    public void iTappedThePercentageFieldOpenCheck() throws InterruptedException {
//        new TaxRoundingOff().iTappedPercentageFieldOpenCheck();
//        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
//    }

    @And("^I tapped the amount field$")
    public void iTappedTheAmountField() throws InterruptedException {
        new TaxRoundingOff().iTappedAmountField();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I tapped the amount field open check discount$")
    public void iTappedTheAmountFieldOpenCheckDisc() throws InterruptedException {
        new TaxRoundingOff().iTappedAmountFieldOpenCheckDisc();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I entered the discount percentage as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnteredTheDiscountPercentageAs(String num1, String num2, String num3, String num4) {
        new TaxRoundingOff().iEneteredDiscountPercentageAs(num1, num2, num3, num4);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I entered the discount percentage$")
    public void iEnteredTheDiscountPercentage() {
        new TaxRoundingOff().iEneteredDiscountPercentage();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I entered the discount amount")
    public void iEnteredTheDiscountAmount() {
        new TaxRoundingOff().iEneteredDiscountAmount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I entered the discount amount as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"")
    public void iEnteredTheDiscountAmountAs(String digit1, String digit2, String digit3, String digit4) {
        new TaxRoundingOff().iEneteredDiscountAmountAs(digit1, digit2, digit3, digit4);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I entered the partial amount as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"")
    public void iEnteredThePartialAmountAs(String digit1, String digit2, String digit3, String digit4) {
        new TaxRoundingOff().iEneteredPartialAmountAs(digit1, digit2, digit3, digit4);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }


    @And("^I tapped reason and entered the reason$")
    public void iTappedReasonAndEnteredTheReason() {
        new TaxRoundingOff().iTheTappedReasonAndEnteredTheReason();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I tapped reason and entered the reason open check discount$")
    public void iTappedReasonAndEnteredTheReasonOpennCheckDisc() {
        new TaxRoundingOff().iTheTappedReasonAndEnteredTheReasonOpenCheckDisc();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the apply button$")
    public void iSelectedTheApplyButton() {
        new TaxRoundingOff().iSelectedApplyButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I added another seat$")
    public void iAddedOneNewSeat() {
        new TaxRoundingOff().andAddedAnotherSeat();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the QSR button$")
    public void iSelectedTheQSRButton() {
        new TaxRoundingOff().iSelectedQSRButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for Open Discount \"([^\"]*)\" Exclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountExclusive(double DiscountPercent,double taxPercent) {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountExclusive(DiscountPercent,taxPercent);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount \"([^\"]*)\" Exclusive \"([^\"]*)\" Amount BT$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountExclusiveAmountBT(double discountAmount, double taxPercent) {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountExclusiveAmountBT(discountAmount, taxPercent);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount \"([^\"]*)\" Inclusive \"([^\"]*)\" Amount BT$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountInclusiveAmountBT(double discountAmount, double taxPercent) {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountInclusiveAmountBT(discountAmount, taxPercent);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total amount is calculated correctly for exclusive open discount$")
    public void VerifyIfTheTotalAmountIsCalculatedCorrectlyExclusiveOpenDiscount() {
        new TaxRoundingOff().VerifyIfTotalAmountIsCalculatedCorrectlyExclusiveOpenDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu item with inclusive tax for open discount$")
    public void SelectTheMenuItemWithTheInclusiveTaxForOpenDiscount() {
        new TaxRoundingOff().SelectMenuItemWithTheInclusiveTaxForOpenDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount Inclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountInclusive() {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountInclusive();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I clicked the exclusive tax$")
    public void iClickedExclusiveTax() {
//        new TaxRoundingOff().iClickedTheExclusiveTax();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected After Tax option$")
    public void iSelectedTheAfterTaxOption() {
        new TaxRoundingOff().iSelectedAfterTaxOption();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the exclusive tax menu item with after tax item discount$")
    public void iSelectedTheExclusiveTaxMenuItemWithAfterTaxItemDiscount() {
        new TaxRoundingOff().iSelectedTheExclusiveTaxMenuItemWithAfterTaxItemDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and discount \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for item discount after tax Exclusive$")
    public void verifyIfTaxAndDiscountAreCalculatedProperly(double taxAmount, double discountAmount) {
        new TaxRoundingOff().verifyIfTaxAndDiscountAreCalculatedProperly(taxAmount, discountAmount);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and discount \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for open item discount after tax Exclusive$")
    public void verifyIfTaxAndDiscountAreCalculatedProperlyForOpenItemDiscountPercentageAfterTax(double taxAmount, double discountPercent) {
        new TaxRoundingOff().verifyIfTaxAndDiscountAreCalculatedProperlyOpenItemDiscountPercentageAfterTax(taxAmount, discountPercent);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and discount \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for open item discount after tax Inclusive$")
    public void verifyIfTaxAndDiscountAreCalculatedProperlyForInclusiveOpenItemDiscountPercentageAfterTax(double taxAmount, double discountPercent) {
        new TaxRoundingOff().verifyIfTaxAndDiscountAreCalculatedProperlyInclusiveOpenItemDiscountPercentageAfterTax(taxAmount, discountPercent);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected quantity as \"([^\"]*)\"$")
    public void iSelectedQuantity(String quantity) throws InterruptedException {
        new TaxRoundingOff().iSelectedTheQuantity(quantity);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected void quantity as \"([^\"]*)\"$")
    public void iSelectedVoidQuantity(String quantity) throws InterruptedException {
        new TaxRoundingOff().iSelectedTheVoidQuantity(quantity);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the modifier voided quantity \"([^\"]*)\" is displayed correctly$")
    public void iVerifyModifierVoidQuantity(String quantity) throws InterruptedException {
        new TaxRoundingOff().iVerifyTheModifierVoidQuantity(quantity);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the inclusive tax menu item with after tax item discount$")
    public void iSelectedTheInclusiveTaxMenuItemWithAfterTaxItemDiscount() throws InterruptedException {
        new TaxRoundingOff().iSelectedInclusiveTaxMenuItemWithAfterTaxItemDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and discount \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for item discount after tax Inclusive$")
    public void verifyIfTaxAndDiscountAreCalculatedProperlyInclusiveAfterTaxDiscount(double taxAmount, double discountAmount) {
        new TaxRoundingOff().verifyIfTaxAndDiscountAreCalculatedProperlyInclusiveAfterTaxDiscount(taxAmount, discountAmount);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu item with exclusive tax and tax on item tax$")
    public void iSelectedTheExclusiveTaxMenuItemWithTaxOnItemTax() {
        new TaxRoundingOff().iSelectedExclusiveTaxMenuItemWithTaxOnItemTax();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and tax on item tax \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for item discount after tax Exclusive$")
    public void verifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemTaxExclusive(double taxAmount1, double taxAmount2) {
        new TaxRoundingOff().verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemTaxExclusive(taxAmount1, taxAmount2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and tax on item service charge \"([^\"]*)\" Is Calculated Properly when item service charge \"([^\"]*)\"$")
    public void verifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemServiceChargeExclusive(double taxAmount1, double taxAmount2, double itemServiceCharge) {
        new TaxRoundingOff().verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemServiceChargeExclusive(taxAmount1, taxAmount2, itemServiceCharge);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Inclusive Tax \"([^\"]*)\" and tax on item service charge \"([^\"]*)\" Is Calculated Properly when item service charge \"([^\"]*)\"$")
    public void verifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemServiceChargeInclusive(double taxAmount1, double taxAmount2, double itemServiceCharge) {
        new TaxRoundingOff().verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemServiceChargeInclusive(taxAmount1, taxAmount2, itemServiceCharge);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Inclusive Tax \"([^\"]*)\" and tax on item service charge \"([^\"]*)\" Is Calculated Properly when item service charge \"([^\"]*)\" qty 2$")
    public void verifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemServiceChargeInclusiveQty2(double taxAmount1, double taxAmount2, double itemServiceCharge) {
        new TaxRoundingOff().verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemServiceChargeInclusiveQty2(taxAmount1, taxAmount2, itemServiceCharge);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu item with inclusive tax and tax on item tax$")
    public void iSelectedTheInclusiveTaxMenuItemWithTaxOnItemTax() {
        new TaxRoundingOff().iSelectedInclusiveTaxMenuItemWithTaxOnItemTax();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and tax on item tax \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for item discount after tax Inclusive$")
    public void verifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemTaxInclusive(double taxAmount1, double taxAmount2) {
        new TaxRoundingOff().verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemTaxInclusive(taxAmount1, taxAmount2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu item with check tax and tax on check tax$")
    public void iSelectedTheMenuItemWithTaxOnCheckTax() {
        new TaxRoundingOff().iSelectedMenuItemWithTaxOnCheckTax();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the All option$")
    public void iSelectedTheAllOption() {
        new TaxRoundingOff().iSelectedAllOption();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I click Closed tab on the Check stats$")
    public void iSelectedTheClosedTab() {
        new TaxRoundingOff().iSelectedClosedTab();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu item with exclusive tax and mix and match discount$")
    public void iSelectedTheExclusiveTaxMenuItemWithMixAdMatchDiscout() {
        new TaxRoundingOff().iSelectedExclusiveTaxMenuItemWithMixAdMatchDiscout();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Apply the mix and match discount \"([^\"]*)\"$")
    public void ApplyTheMixAndMatchDiscount(String DiscountName) throws InterruptedException {
        new TaxRoundingOff().ApplyMixAndMatchDiscount(DiscountName);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for item discount after tax Exclusive$")
    public void verifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffMixAndMatchExclusive(double taxAmount1) {
        new TaxRoundingOff().verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffMixAndMatchExclusive(taxAmount1);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the category IceCreams$")
    public void selectTheCategory2() throws InterruptedException {
        new TaxRoundingOff().category2Selection();
    }

    @And("^I selected the menu item with inclusive tax and mix and match discount$")
    public void iSelectedTheInclusiveTaxMenuItemWithMixAdMatchDiscount() {
        new TaxRoundingOff().iSelectedInclusiveTaxMenuItemWithMixAdMatchDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and discount \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for item discount before tax Inclusive$")
    public void verifyIfTaxAndDiscountAreCalculatedProperlyInclusiveBeforeTaxDiscount(double taxAmount, double discountAmount) {
        new TaxRoundingOff().verifyIfTheTaxAndDiscountAreCalculatedProperlyInclusiveBeforeTaxDiscount(taxAmount, discountAmount);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu item with inclusive tax and mix and match discount Percentage$")
    public void iSelectedTheExclusiveTaxMenuItemWithMixAdMatchDiscountPercentage() {
        new TaxRoundingOff().iSelectedExclusiveTaxMenuItemWithMixAdMatchDiscountPercentage();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the modifier with prefix$")
    public void iSelectedTheModifierWithPrefix() {
        new TaxRoundingOff().iSelectedModifierWithPrefix();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the category as \"([^\"]*)\"$")
    public void SelectTheCategory(String CategoryName) throws InterruptedException {
        new TaxRoundingOff().SelectCategory(CategoryName);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the category new as \"([^\"]*)\"$")
    public void SelectTheCategoryNew(String CategoryName) throws Exception {
        new TaxRoundingOff().SelectCategoryNew(CategoryName);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the sub category as \"([^\"]*)\"$")
    public void SelectTheSubCategory(String SubCategoryName) throws InterruptedException {
        new TaxRoundingOff().SelectSubCategory(SubCategoryName);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu item \"([^\"]*)\"$")
    public void iSelectedTheMenuItem(String MenuItemName) {
        new TaxRoundingOff().iSelectedMenuItem(MenuItemName);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the size as \"([^\"]*)\"$")
    public void iSelectedTheSize(String Size) {
        new TaxRoundingOff().iSelectedSize(Size);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax \"([^\"]*)\" is calculated properly and calculate roundoff$")
    public void verifyExcTaxAndRoundOffCalculation(Double taxValue) {
        new TaxRoundingOff().verifyTheExcTaxAndRoundOffCalculation(taxValue);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total value is calculated correctly exc when free item amount is \"([^\"]*)\"$")
    public void verifyTotalValueWithFreeItemDiscount(Double freeItemValue) {
        new TaxRoundingOff().verifyTheTotalValueWithFreeItemDiscount(freeItemValue);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if inclusive tax \"([^\"]*)\" is calculated properly and calculate roundoff$")
    public void verifyIncTaxAndRoundOffCalculation(Double taxValue) {
        new TaxRoundingOff().verifyTheIncTaxAndRoundOffCalculation(taxValue);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total value is calculated correctly inc when free item amount is \"([^\"]*)\"$")
    public void verifyTotalValueIncWithFreeItemDiscount(Double freeItemValue) {
        new TaxRoundingOff().verifyTheTotalValueIncWithFreeItemDiscount(freeItemValue);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax \"([^\"]*)\" and inclusive tax \"([^\"]*)\" are calculated properly and calculate roundoff$")
    public void verifyExcAndIncTaxAndRoundOffCalculation(Double taxValue1, Double taxValue2) {
        new TaxRoundingOff().verifyTheExcAndIncTaxAndRoundOffCalculation(taxValue1, taxValue2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total value is calculated correctly exc \"([^\"]*)\" and inc when free item amount is \"([^\"]*)\"$")
    public void verifyTotalValueExcAndIncWithFreeItemDiscount(Double taxValue, Double freeItemValue) {
        new TaxRoundingOff().verifyTheTotalValueExcAndIncWithFreeItemDiscount(taxValue, freeItemValue);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the check number \"([^\"]*)\"$")
    public void SeletcedTheCheckNumber(String CheckNumber) throws InterruptedException {
        new TaxRoundingOff().SeletcedCheckNumber(CheckNumber);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected Re-Open Check option$")
    public void SeletcedTheReopenCheckOption() throws InterruptedException {
        new TaxRoundingOff().SeletcedReopenCheckOption();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

//    @And("^I selected Re-Open Check option$")
//    public void SeletcedTheReopenCheckOption() throws InterruptedException {
//        new TaxRoundingOff().SeletcedReopenCheckOption();
//        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
//    }

    @And("^I deleted the payment$")
    public void iDeletedThePayment() throws InterruptedException {
        new TaxRoundingOff().iDeletedPayment();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the Tax exempt option as \"([^\"]*)\"$")
    public void selectTheTaxExemptOption(String taxExemptOption) throws InterruptedException {
        new TaxRoundingOff().selectTaxExemptOption(taxExemptOption);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I verfiy if the tax amount is exempted$")
    public void verifyIfTheTaxIsExempted() throws InterruptedException {
        new TaxRoundingOff().verifyIfTaxIsExempted();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I verfiy if the tax amount is exempted inclusive$")
    public void verifyIfTheTaxIsExemptedInclusive() throws InterruptedException {
        new TaxRoundingOff().verifyIfTaxIsExemptedInclusive();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is calculated correctly tax exempt$")
    public void VerifyIfTheBalanceDueValueIsCalculatedCorrectlyTaxExempt() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueValueIsCalculatedCorrectlyTaxExempt();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I verfiy if the tax amount is exempted both exclusive and inclusive$")
    public void verifyIfTheTaxIsExemptedBothExclusiveAndInclusive() throws InterruptedException {
        new TaxRoundingOff().verifyIfTaxIsExemptedBothExclusiveAndInclusive();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected void button$")
    public void iSelectedVoidButton() throws InterruptedException {
        new TaxRoundingOff().iSelectedTheVoidButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected void button in menu options$")
    public void iSelectedVoidButtonMenuOption() throws InterruptedException {
        new TaxRoundingOff().iSelectedTheVoidButtonMenuOption();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the Void reason as \"([^\"]*)\"$")
    public void SelectTheVoidReason(String voidReason) throws InterruptedException {
        new TaxRoundingOff().SelectedVoidReason(voidReason);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the Void item reason as \"([^\"]*)\"$")
    public void SelectTheVoidItemReason(String voidReason) throws InterruptedException {
        new TaxRoundingOff().SelectedVoidItemReason(voidReason);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I Selected payment button$")
    public void SelectThePaymentButton() throws InterruptedException {
        new TaxRoundingOff().SelectedThePaymentButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I Selected the payment button$")
    public void SelectThePaymentButton1() throws InterruptedException {
        new TaxRoundingOff().SelectedThePaymentButton1();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I select process button$")
    public void selectProcessButton()
    {
        new TaxRoundingOff().selectTheProcessButton();
    }

    @And("^I Selected submit button$")
    public void SelectTheSubmitButton() throws InterruptedException {
        new TaxRoundingOff().SelectedTheSubmitButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I Select submit button$")
    public void SelectSubmitButton() throws InterruptedException {
        new TaxRoundingOff().SelectTheSubmitButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the ExcTax is calculated correctly Reopen \"([^\"]*)\"$")
    public void verifyIfTheExcTaxIsCalculatedCorrectlyReopen(Double taxValue) throws InterruptedException {
        new TaxRoundingOff().verifyIfExcTaxIsCalculatedCorrectlyReopen(taxValue);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I have selected category arrow wait$")
    public void iHaveSelectedCategoryArrowWait() throws InterruptedException {
        new TaxRoundingOff().iHaveSelectedTheCategoryArrowWait();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If The Total Value Is Calculated Correctly Reopen Exc$")
    public void VerifyIfTheTotalValueIsCalculatedCorrectlyReopenExc() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTotalValueIsCalculatedCorrectlyReopenExc();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is calculated correctly After Reopen Exc$")
    public void verifyIfTheBalanceDueValueIsCalculatedCorrectlyAfterReopenExc() throws InterruptedException {
        new TaxRoundingOff().verifyIfBalanceDueValueIsCalculatedCorrectlyAfterReopenExc();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the IncTax is calculated correctly Reopen \"([^\"]*)\"$")
    public void verifyIfTheIncTaxIsCalculatedCorrectlyReopen(Double taxValue) throws InterruptedException {
        new TaxRoundingOff().verifyIfIncTaxIsCalculatedCorrectlyReopen(taxValue);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If The Total Value Is Calculated Correctly Reopen Inc$")
    public void VerifyIfTheTotalValueIsCalculatedCorrectlyReopenInc() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTotalValueIsCalculatedCorrectlyReopenInc();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }
//
//    @And("^Select the category Mojitos$")
//    public void selectTheCategoryMojitos() throws InterruptedException {
//        new TaxRoundingOff().selectCategoryMojitos();
//        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
//    }

    @And("^Verify if tax is calculated as per the quantity \"([^\"]*)\" and tax \"([^\"]*)\"$")
    public void verifyIfTaxIsCalculatedAsPerTheQuantity(String quantity, Double tax1) throws InterruptedException {
        new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax(quantity, tax1);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Exc Tax \"([^\"]*)\" and inclusive modifier tax \"([^\"]*)\" are Calculated Properly And Calculate RoundOff for item discount after tax Exclusive$")
    public void VerifyIfExcTaxAndInclusiveModifierTaxAreCalculatedProperlyAndCalculateRoundOffForItemDiscountAfterTaxExclusive(Double tax1, Double tax2) throws InterruptedException {
        new TaxRoundingOff().VerifyIfTheExcTaxAndInclusiveModifierTaxAreCalculatedProperlyAndCalculateRoundOffForItemDiscountAfterTaxExclusive(tax1, tax2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax \"([^\"]*)\" is calculated properly after removing discount and calculate round-off$")
    public void verifyIfTaxIsCalculatedAfterRemovingDiscount(Double tax1) throws InterruptedException {
        new TaxRoundingOff().verifyIfTheTaxIsCalculatedAfterRemovingDiscount(tax1);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Remove the item discount \"([^\"]*)\"$")
    public void RemoveTheItemDiscount(String discount) throws Exception {
        new TaxRoundingOff().RemovedTheItemDiscount(discount);
    }

    @And("^Remove the item discount2$")
    public void RemoveTheItemDiscount2() throws Exception {
        new TaxRoundingOff().RemovedTheItemDiscount2();
    }

    @And("^Verify if the balance due value is calculated correctly after removing discount$")
    public void VerifyIfTheBalanceDueValueIsCalculatedCorrectlyAfterRemovingDiscount() throws Exception {
        new TaxRoundingOff().VerifyIfBalanceDueValueIsCalculatedCorrectlyAfterRemovingDiscount();
    }

    @And("^I selected the included modifier$")
    public void iSelectedTheIncludedModifier() throws Exception {
        new TaxRoundingOff().iSelectedIncludedModifier();
    }

    @And("^I selected Alternate modifier button$")
    public void iSelectedAlternateModifierBtn() throws Exception {
        new TaxRoundingOff().iSelectedAlternateModifierBtn();
    }

    @And("^I selected the Alternate modifier$")
    public void iSelectedAlternateModifier() throws Exception {
        new TaxRoundingOff().iSelectedTheAlternateModifier();
    }

    @And("^I selected OK button$")
    public void iSelectedTheOKBtn() throws Exception {
        new TaxRoundingOff().iSelectedOKBtn();
    }

    @And("^I selected the Prefix \"([^\"]*)\"$")
    public void iSelectedThePrefix(String prefix) throws Exception {
        new TaxRoundingOff().iSelectedPrefix(prefix);
    }

    @And("^Verify If Inc Tax \"([^\"]*)\" and exclusive modifier tax \"([^\"]*)\" are Calculated Properly And Calculate RoundOff for item discount after tax Exclusive$")
    public void VerifyIfIncTaxAndExclusiveModifierTaxAreCalculatedProperlyAndCalculateRoundOffForItemDiscountAfterTaxExclusive(Double tax1, Double tax2) throws InterruptedException {
        new TaxRoundingOff().VerifyIfTheIncTaxAndExclusiveModifierTaxAreCalculatedProperlyAndCalculateRoundOffForItemDiscountAfterTaxExclusive(tax1, tax2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive taxes \"([^\"]*)\" and \"([^\"]*)\" are calculated properly and calculate roundoff$")
    public void verifyExcTaxesAndRoundOffCalculation(Double taxValue1, Double taxValue2) {
        new TaxRoundingOff().verifyTheExcTaxesAndRoundOffCalculation(taxValue1, taxValue2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the service type button$")
    public void selectServiceTypeButton() {
        new TaxRoundingOff().selectTheServiceTypeButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected DineIn option$")
    public void selectDineInOption() {
        new TaxRoundingOff().selectTheDineInOption();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the table$")
    public void selectTable() {
        new TaxRoundingOff().selectTheTable();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the split button$")
    public void selectSplitBtn() throws InterruptedException {
        new TaxRoundingOff().selectTheSplitBtn();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the split button in table layout$")
    public void selectSplitBtnInTableLayout() throws InterruptedException {
        new TaxRoundingOff().selectTheSplitBtnInTableLayout();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the split option as Split Check$")
    public void SelectTheSplitOption() throws InterruptedException {
        new TaxRoundingOff().SelectSplitOption();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the split option as Split Seat in table layout$")
    public void SelectTheSplitOptionTableLayout() throws InterruptedException {
        new TaxRoundingOff().SelectSplitOptionTableLayout();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected order button$")
    public void selectOrderBtn() {
        new TaxRoundingOff().selectTheOrderBtn();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I select add customer button$")
    public void selectAddCustomerBtn() {
        new TaxRoundingOff().selectAddNewCustomerBtn();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected Add button$")
    public void selectAddBtn() {
        new TaxRoundingOff().selectTheAddBtn();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu1$")
    public void selectTheMenu1() {
        new TaxRoundingOff().selectMenu1();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I transferred the menu to new check$")
    public void menuTransferToTheNewCheck() {
        new TaxRoundingOff().menuTransferToNewCheck();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I select seat 2$")
    public void selectSeatNum2() {
        new TaxRoundingOff().selectTheSeatNum2();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I select seat 1$")
    public void selectSeatNum1() {
        new TaxRoundingOff().selectTheSeatNum1();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I get the total amount for seat 2$")
    public void iGetTotalAmountOfSeat2() {
        new TaxRoundingOff().iGetTheTotalAmountOfSeat2();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I get the total amount for seat 1$")
    public void iGetTotalAmountOfSeat1() {
        new TaxRoundingOff().iGetTheTotalAmountOfSeat1();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I get the total amount$")
    public void iGetTotalAmount() {
        new TaxRoundingOff().iGetTheTotalAmount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I verify if the balance due is calculated correctly for the check seat 2$")
    public void iVerifyIfTotalIsDisplayedCorrectlyForTheSeat2() {
        new TaxRoundingOff().iVerifyIfTheTotalIsDisplayedCorrectlyForTheSeat2();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I verify if the balance due is calculated correctly for the check seat 1$")
    public void iVerifyIfTotalIsDisplayedCorrectlyForTheSeat1() {
        new TaxRoundingOff().iVerifyIfTheTotalIsDisplayedCorrectlyForTheSeat1();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected pay check option$")
    public void selectPayCheckOption() {
        new TaxRoundingOff().selectThePayCheckOption();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected pay check option2$")
    public void selectPayCheckOption2() {
        new TaxRoundingOff().selectThePayCheckOption2();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected arrival option$")
    public void selectArrivalOption() {
        new TaxRoundingOff().selectTheArrivalOption();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the driver$")
    public void selectDriver() {
        new TaxRoundingOff().selectTheDriver();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the driver icon$")
    public void selectDriverIcon() {
        new TaxRoundingOff().selectTheDriverIcon();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I select the depart button$")
    public void selectDepartButton() {
        new TaxRoundingOff().selectTheDepartButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I select the out button$")
    public void selectOutButton() {
        new TaxRoundingOff().selectTheOutButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive taxes \"([^\"]*)\" and \"([^\"]*)\" are calculated properly in split screen$")
    public void verifyExcTaxesCalcInSplitScreen(Double taxValue1, Double taxValue2) {
        new TaxRoundingOff().verifyTheExcTaxesCalcInSplitScreen(taxValue1, taxValue2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I check if exc tax \"([^\"]*)\" is calculated properly for first check$")
    public void verifyExcTaxCalcForFirstCheck(Double taxValue1) {
        new TaxRoundingOff().verifyTheExcTaxCalcForFirstCheck(taxValue1);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I check if exc tax \"([^\"]*)\" is calculated properly for second check$")
    public void verifyExcTaxCalcForSecondCheck(Double taxValue1) {
        new TaxRoundingOff().verifyTheExcTaxCalcForSecondCheck(taxValue1);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I select Print button$")
    public void iSelectThePrintButton() throws InterruptedException {
        new TaxRoundingOff().iSelectPrintButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected Print All Button$")
    public void iSelectThePrintAllButton() throws InterruptedException {
        new TaxRoundingOff().iSelectPrintAllButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I get check1 number$")
    public void iGetTheCheck1Number() {
        new TaxRoundingOff().iGetCheck1Number();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I get check2 number$")
    public void iGetTheCheck2Number() {
        new TaxRoundingOff().iGetCheck2Number();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I check if exc tax \"([^\"]*)\" is calculated properly in menu screen after split$")
    public void verifyExcTaxCalcInMenuScreenAfterSplit(Double taxValue1) {
        new TaxRoundingOff().verifyTheExcTaxCalcInMenuScreenAfterSplit(taxValue1);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I click Active tab on the Check stats$")
    public void iSelectTheActiveTab() {
        new TaxRoundingOff().iSelectActiveTab();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I should see active check2 in active check tab$")
    public void verifyTheActiveCheck2InActiveTab() throws InterruptedException {
        new TaxRoundingOff().verifyActiveCheck2InActiveTab();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I click open check button on the check stats screen$")
    public void iClickTheOpenCheckBtn() throws InterruptedException {
        new TaxRoundingOff().iClickOpenCheckBtn();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the tax is calculated correctly \"([^\"]*)\" and \"([^\"]*)\" inclusive$")
    public void VerifyIfTaxIsCalculatedCorrectlyInc2(Double taxValue1, Double taxValue2) throws InterruptedException {

        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedCorrectlyInc2(taxValue1, taxValue2);
    }


    @And("^Select the menu item with inclusive tax2$")
    public void iSelectedIncTax2Menu() throws InterruptedException {
        new TaxRoundingOff().iSelectedTheIncTax2Menu();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if inclusive taxes \"([^\"]*)\" and \"([^\"]*)\" are calculated properly and calculate roundoff$")
    public void verifyIncTaxesAndRoundOffCalculation(Double taxValue1, Double taxValue2) {
        new TaxRoundingOff().verifyTheIncTaxesAndRoundOffCalculation(taxValue1, taxValue2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I check if inc tax \"([^\"]*)\" is calculated properly for first check$")
    public void verifyIncTaxCalcForFirstCheck(Double taxValue1) {
        new TaxRoundingOff().verifyTheIncTaxCalcForFirstCheck(taxValue1);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I check if inc tax \"([^\"]*)\" is calculated properly for second check$")
    public void verifyIncTaxCalcForSecondCheck(Double taxValue1) {
        new TaxRoundingOff().verifyTheIncTaxCalcForSecondCheck(taxValue1);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I check if inc tax \"([^\"]*)\" is calculated properly in menu screen after split$")
    public void verifyIncTaxCalcInMenuScreenAfterSplit(Double taxValue1) {
        new TaxRoundingOff().verifyTheIncTaxCalcInMenuScreenAfterSplit(taxValue1);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax \"([^\"]*)\" and \"([^\"]*)\" are calculated properly and calculate roundoff$")
    public void verifyExccTaxesAndRoundOffCalculation(Double taxValue1, Double taxValue2) {
        new TaxRoundingOff().verifyTheExccTaxesAndRoundOffCalculation(taxValue1, taxValue2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected void item button$")
    public void iSelectedVoidItemButton() throws InterruptedException {
        new TaxRoundingOff().iSelectedTheVoidItemButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if inclusive tax \"([^\"]*)\" and \"([^\"]*)\" are calculated properly and calculate roundoff$")
    public void verifyInccTaxesAndRoundOffCalculation(Double taxValue1, Double taxValue2) {
        new TaxRoundingOff().verifyTheInccTaxesAndRoundOffCalculation(taxValue1, taxValue2);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the table1$")
    public void selectTable1() throws InterruptedException {
//        String m = TestUtils.globalTableNumber;

        new TaxRoundingOff().selectTheTable1();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the table2$")
    public void selectTable2() throws InterruptedException {
//        String n = TestUtils.globalTableNumber2;

        new TaxRoundingOff().selectTheTable2();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected Merge button$")
    public void selectMergeButton() throws InterruptedException {
        new TaxRoundingOff().selectTheMergeButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected seat number$")
    public void selectedSeatNumber() throws InterruptedException {
        new TaxRoundingOff().selectedTheSeatNumber();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected seat number as 100$")
    public void selectedSeatNumberAs100() throws InterruptedException {
        new TaxRoundingOff().selectedTheSeatNumberAs100();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }


    @And("^Select the exit button$")
    public void selectExitbutton()
    {
        new TaxRoundingOff().SelectTheExitButton();
    }

    @And("^Select the modify button on order screen$")
    public void selectModifyBtn()
    {
        new TaxRoundingOff().selectTheModifyBtn();
    }

    @And("^Select the anytime pre auth button$")
    public void selectAnytimePreAuthBtn()
    {
        new TaxRoundingOff().selectTheAnytimePreAuthBtn();
    }

    @And("^I selected the table1 order$")
    public void selectTable1Order() throws InterruptedException {
        new TaxRoundingOff().selectTheTable1Order();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the table2 order$")
    public void selectTable2Order() throws InterruptedException {
        new TaxRoundingOff().selectTheTable2Order();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the table with merged checks$")
    public void selectTableWithMergedChecks() throws InterruptedException {
        String m = TestUtils.globalTableNumber;

        new TaxRoundingOff().selectTheTableWithMergedChecks(m);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I get table number2$")
    public void iGetTableNumber2() {
        new TaxRoundingOff().getTableNumberTxt2();
    }


    @And("^I get table number$")
    public void iGetTableNumber() {
        new TaxRoundingOff().getTableNumberTxt();
    }

    @And ("^I get check number$")
    public void iGetCheckNumber(){
        new TaxRoundingOff().getCheckNumberTxt();
    }

    @And("^I get check number2$")
    public void iGetCheckNumber2() {
        new TaxRoundingOff().getCheckNumber2Txt();
    }

    @And("^I now merge the check1$")
    public void iNowMergeTheCheck1() throws InterruptedException {

        String m = TestUtils.globalTableNumber;
        new TaxRoundingOff().iNowMergeCheck1(m);

    }

    @And("^I selected the check to be splitted$")
    public void iNowSelectedCheckToBeSplitted() throws InterruptedException {

        String m = TestUtils.globalTableNumber;
        new TaxRoundingOff().iNowSelectedTheCheckToBeSplitted(m);

    }

    @And("^I now entered the check number in the transfer from table$")
    public void iNowEnteredTheCheckNumberInTransferFromTable() throws InterruptedException {

        new TaxRoundingOff().iNowEnteredCheckNumberInTransferFromTable();

    }

    @And("^I now entered the table number in the transfer from table$")
    public void iNowEnteredTheTableNumberInTransferFromTable() throws InterruptedException {

        new TaxRoundingOff().iNowEnteredTableNumberInTransferFromTable();

    }

    @And("^I now entered the check number in the transfer to table$")
    public void iNowEnteredTheCheckNumberInTransferToTable() throws InterruptedException {

        new TaxRoundingOff().iNowEnteredCheckNumberInTransferToTable();

    }

    @And("^I now entered the table number in the transfer to table$")
    public void iNowEnteredTheTableNumberInTransferToTable() throws InterruptedException {

        new TaxRoundingOff().iNowEnteredTableNumberInTransferToTable();

    }

    @Then("^I selected the menu item in the table$")
    public void iSelectedTheMenuItemInTheTable() throws InterruptedException {

        new TaxRoundingOff().iSelectedMenuItemInTheTable();

    }

    @Then("^I selected the check number in the table$")
    public void iSelectedTheCheckNumberInTheTable() throws InterruptedException {

        new TaxRoundingOff().iSelectedCheckNumberInTheTable();

    }


    @Then("^I Selected QSR in table layout screen$")
    public void iSelectedTheQSROptionInTableLayout() throws InterruptedException {

        new TaxRoundingOff().iSelectedQSROptionInTableLayout();

    }

    @And("^I selected the transfer button$")
    public void iClickTheTransferButton() throws InterruptedException {
        ;
        new TaxRoundingOff().iClickTransferButton();

    }

    @And("^I selected the transfer item tab$")
    public void iClickTheTransferItemTab() throws InterruptedException {
        ;
        new TaxRoundingOff().iClickTransferItemTab();

    }

    @And("^I selected the transfer to table tab$")
    public void iClickTheTransferToTableTab() throws InterruptedException {
        ;
        new TaxRoundingOff().iClickTransferToTableTab();

    }

    @And("^I now merge the check2$")
    public void iNowMergeTheCheck2() throws InterruptedException {

        String n = TestUtils.globalTableNumber2;
        new TaxRoundingOff().iNowMergeCheck2(n);

    }

    @And("^I now merge the check1 with discount$")
    public void iNowMergeTheCheck1WithDiscount() throws InterruptedException {
        String m = TestUtils.globalTableNumber;

        new TaxRoundingOff().iNowMergeCheck1WithDiscount(m);

    }

    @And("^I click Confirm button$")
    public void iClickConfirmBtn() throws InterruptedException {

        new TaxRoundingOff().iClickTheConfirmBtn();

    }

    @And("^I now merge the check2 with discount$")
    public void iNowMergeTheCheck2WithDiscount() throws InterruptedException {

        String n = TestUtils.globalTableNumber2;

        new TaxRoundingOff().iNowMergeCheck2WithDiscount(n);

    }

    @And("^I selected new check button$")
    public void selectNewCheck() {

        new TaxRoundingOff().selectTheNewCheck();
    }

    @And("^I selected new check button in bar tab$")
    public void selectNewCheckInBarTab() {

        new TaxRoundingOff().selectTheNewCheckInBarTab();
    }

    @And("^Select table layout option$")
    public void selectTheTableLayout() {

        new TaxRoundingOff().selectTableLayout();
    }

    @And("^Select bar tab option$")
    public void selectTheBarTab() {

        new TaxRoundingOff().selectBarTab();
    }

    @And("^Verify if the tax is calculated correctly after 100% discount$")
    public void VerifyIfTheTaxIsCalculatedCorrectlyAfter100PercentDiscount() {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedCorrectlyAfter100PercentDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total is calculated correctly after 100% discount$")
    public void VerifyIfTheTotalIsCalculatedCorrectlyAfter100PercentDiscount() {
        new TaxRoundingOff().VerifyIfTotalIsCalculatedCorrectlyAfter100PercentDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is calculated correctly after 100% discount$")
    public void VerifyIfTheBalanceDueIsCalculatedCorrectlyAfter100PercentDiscount() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueIsCalculatedCorrectlyAfter100PercentDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected repeat order$")
    public void iSelectedRepeatTheOrder() throws InterruptedException {
        new TaxRoundingOff().iSelectedRepeatOrder();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I added a new seat$")
    public void iAddedNewSeat() throws InterruptedException {
        new TaxRoundingOff().iAddedANewSeat();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Do exclusive tax calculation \"([^\"]*)\"$")
    public void exclusiveTaxCalculation(String menuValue, String taxValue) throws InterruptedException {
        new TaxRoundingOff().exclusiveTaxCalculation(menuValue, taxValue);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Do inclusive tax calculation \"([^\"]*)\"$")
    public void inclusiveTaxCalculation(String menuValue, String taxValue) throws InterruptedException {
        new TaxRoundingOff().inclusiveTaxCalculation(menuValue, taxValue);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Do total calculation \"([^\"]*)\"$")
    public void totalCalculation(String menuValue, String taxValue) throws InterruptedException {
        new TaxRoundingOff().forTotalCalculation(menuValue, taxValue);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Do total calculation inclusive \"([^\"]*)\"$")
    public void totalCalculationInclusive(String taxAmounts) throws InterruptedException {
        new TaxRoundingOff().forTotalCalculationInclusive(taxAmounts);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax menu \"([^\"]*)\" exclusive tax modifier \"([^\"]*)\" and discount amount \"([^\"]*)\" are calculated properly toggle disabled$")
    public void VerifyIfTheExclusiveTaxAndDiscountArecalculatedProperlyAmountBTToggleDisabled(double taxPercent, double modifierTaxPercent, double discountAmount) {
        new TaxRoundingOff().VerifyIfExclusiveTaxAndDiscountAreCalculatedProperlyAmountBTToggleDisabled(taxPercent, modifierTaxPercent, discountAmount);

        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);

        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if inclusive tax menu \"([^\"]*)\" inclusive tax modifier \"([^\"]*)\" and discount amount \"([^\"]*)\" are calculated properly toggle disabled$")
    public void VerifyIfTheInclusiveTaxAndDiscountArecalculatedProperlyAmountBTToggleDisabled(double taxPercent, double modifierTaxPercent, double discountAmount) {
        new TaxRoundingOff().VerifyIfInclusiveTaxAndDiscountAreCalculatedProperlyAmountBTToggleDisabled(taxPercent, modifierTaxPercent, discountAmount);

        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);

        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

//    @And("^I select Tax category$")
//    public void iSelectTaxCategory() throws Exception {
//        new OrderManagementScreen().clickTaxCategory();
//    }

    @And("^Verify if exclusive taxes \"([^\"]*)\" and \"([^\"]*)\" are calculated properly and calculate roundoff when combo discount \"([^\"]*)\" is applied$")
    public void verifyExcTaxesAndRoundOffCalculationComboDiscExc(Double taxValue1, Double taxValue2, Double discPerc) {
        new TaxRoundingOff().verifyTheExcTaxesAndRoundOffCalculationComboDiscExc(taxValue1, taxValue2, discPerc);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if inclusive taxes \"([^\"]*)\" and \"([^\"]*)\" are calculated properly and calculate roundoff when combo discount \"([^\"]*)\" is applied$")
    public void verifyIncTaxesAndRoundOffCalculationComboDiscExc(Double taxValue1, Double taxValue2, Double discPerc) {
        new TaxRoundingOff().verifyTheIncTaxesAndRoundOffCalculationComboDiscExc(taxValue1, taxValue2, discPerc);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated properly \"([^\"]*)\" \"([^\"]*)\" and calculate roundOff for check discount exclusive amount$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusiveAmount(double DiscountAmount, double taxPercent) {
        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusiveAmount(DiscountAmount, taxPercent);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax menu \"([^\"]*)\" and combo discount set price \"([^\"]*)\" are calculated properly$")
    public void verifyIfExclusiveTaxMenuAndComboDiscountSetPriceAreCalculatedProperly(Double taxValue, Double setPrice) {
        new TaxRoundingOff().verifyIfTheExclusiveTaxMenuAndComboDiscountSetPriceAreCalculatedProperly(taxValue, setPrice);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if inclusive tax menu \"([^\"]*)\" and combo discount set price \"([^\"]*)\" are calculated properly$")
    public void verifyIfInclusiveTaxMenuAndComboDiscountSetPriceAreCalculatedProperly(Double taxValue, Double setPrice) {
        new TaxRoundingOff().verifyIfTheInclusiveTaxMenuAndComboDiscountSetPriceAreCalculatedProperly(taxValue, setPrice);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax \"([^\"]*)\" is calculated properly when item discounts \"([^\"]*)\" and \"([^\"]*)\" are applied and calculate round-off$")
    public void verifyIfExclusiveTaxAreCalculatedProperlyWhenItemDiscountsAreApplied(Double taxValue, Double Disc1, Double Disc2) {
        new TaxRoundingOff().verifyIfTheExclusiveTaxAreCalculatedProperlyWhenItemDiscountsAreApplied(taxValue, Disc1, Disc2);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax \"([^\"]*)\" is calculated properly when check discounts \"([^\"]*)\" and \"([^\"]*)\" are applied and calculate round-off$")
    public void verifyIfExclusiveTaxAreCalculatedProperlyWhenCheckDiscountsAreApplied(Double taxValue, Double Disc1, Double Disc2) {
        new TaxRoundingOff().verifyIfTheExclusiveTaxAreCalculatedProperlyWhenCheckDiscountsAreApplied(taxValue, Disc1, Disc2);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax \"([^\"]*)\" is calculated properly when item discounts amount \"([^\"]*)\" and \"([^\"]*)\" are applied and calculate round-off$")
    public void verifyIfExclusiveTaxAreCalculatedProperlyWhenItemDiscountsAmountAreApplied(Double taxValue, Double Disc1, Double Disc2) {
        new TaxRoundingOff().verifyIfTheExclusiveTaxAreCalculatedProperlyWhenItemDiscountsAmountAreApplied(taxValue, Disc1, Disc2);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax \"([^\"]*)\" is calculated properly when item discounts \"([^\"]*)\" and \"([^\"]*)\" are applied and calculate round-off after tax$")
    public void verifyIfExclusiveTaxAreCalculatedProperlyWhenItemDiscountsAreAppliedAfterTax(Double taxValue, Double Disc1, Double Disc2) {
        new TaxRoundingOff().verifyIfTheExclusiveTaxAreCalculatedProperlyWhenItemDiscountsAreAppliedAfterTax(taxValue, Disc1, Disc2);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax \"([^\"]*)\" is calculated properly when item discounts amount after tax \"([^\"]*)\" and \"([^\"]*)\" are applied and calculate round-off$")
    public void verifyIfExclusiveTaxAreCalculatedProperlyWhenItemDiscountsAmountAreAppliedAfterTax(Double taxValue, Double Disc1, Double Disc2) {
        new TaxRoundingOff().verifyIfTheExclusiveTaxAreCalculatedProperlyWhenItemDiscountsAmountAreAppliedAfterTax(taxValue, Disc1, Disc2);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify exc tax \"([^\"]*)\" when multiple mix and match discounts set price are applied \"([^\"]*)\" and \"([^\"]*)\"$")
    public void VerifyExcTaxWithMultipleMixAndMatchDiscsAppliedSetPrice(Double taxValue, Double Disc1, Double Disc2) {
        new TaxRoundingOff().VerifyExcTaxWhenMultipleMixAndMatchDiscsAppliedSetPrice(taxValue, Disc1, Disc2);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify exc tax \"([^\"]*)\" when multiple mix and match discounts set price after tax are applied \"([^\"]*)\" and \"([^\"]*)\"$")
    public void VerifyExcTaxWithMultipleMixAndMatchDiscsAppliedSetPriceAfterTax(Double taxValue, Double Disc1, Double Disc2) {
        new TaxRoundingOff().VerifyExcTaxWhenMultipleMixAndMatchDiscsAppliedSetPriceAfterTax(taxValue, Disc1, Disc2);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRo
    }

    @And("^Verify inc tax \"([^\"]*)\" when multiple mix and match discounts set price are applied \"([^\"]*)\" and \"([^\"]*)\"$")
    public void VerifyIncTaxWithMultipleMixAndMatchDiscsAppliedSetPrice(Double taxValue, Double Disc1, Double Disc2) {
        new TaxRoundingOff().VerifyIncTaxWhenMultipleMixAndMatchDiscsAppliedSetPrice(taxValue, Disc1, Disc2);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify inc tax \"([^\"]*)\" when multiple mix and match discounts set price are applied after tax \"([^\"]*)\" and \"([^\"]*)\"$")
    public void VerifyIncTaxWithMultipleMixAndMatchDiscsAppliedSetPriceAfterTax(Double taxValue, Double Disc1, Double Disc2) {
        new TaxRoundingOff().VerifyIncTaxWhenMultipleMixAndMatchDiscsAppliedSetPriceAfterTax(taxValue, Disc1, Disc2);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify exc tax \"([^\"]*)\" when multiple mix and match discounts percentage are applied \"([^\"]*)\" and \"([^\"]*)\"$")
    public void VerifyExcTaxWithMultipleMixAndMatchDiscsAppliedPercentage(Double taxValue, Double Disc1, Double Disc2) {
        new TaxRoundingOff().VerifyExcTaxWhenMultipleMixAndMatchDiscsAppliedPercentage(taxValue, Disc1, Disc2);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify exc tax \"([^\"]*)\" when multiple mix and match discounts percentage are applied AT \"([^\"]*)\" and \"([^\"]*)\"$")
    public void VerifyExcTaxWithMultipleMixAndMatchDiscsAppliedPercentageAT(Double taxValue, Double Disc1, Double Disc2) {
        new TaxRoundingOff().VerifyExcTaxWhenMultipleMixAndMatchDiscsAppliedPercentageAT(taxValue, Disc1, Disc2);
// new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I verify if the modifier price \"([^\"]*)\" is correct for the first modifier$")
    public void iVerifyIfPriceIsCorrectForFirstModifier(Double modifierAmount) throws InterruptedException {

        new TaxRoundingOff().iVerifyIfPriceIsCorrectForTheFirstModifier(modifierAmount);

    }

    @And("^I verify if the modifier price \"([^\"]*)\" is correct for the second modifier$")
    public void iVerifyIfPriceIsCorrectForSecondModifier(Double modifierAmount) throws InterruptedException {

        new TaxRoundingOff().iVerifyIfPriceIsCorrectForTheSecondModifier(modifierAmount);

    }

    @And("^I reduced one quantity of the modifier$")
    public void iReduceQtyOfModifier() throws InterruptedException {

        new TaxRoundingOff().iReduceTheQtyOfModifier();

    }

    @And("^I reduced one quantity of the modifier conversational$")
    public void iReduceQtyOfModifierConversational() throws InterruptedException {

        new TaxRoundingOff().iReduceTheQtyOfModifierConversational();

    }

    @And("^I entered the discount percentage as 100$")
    public void iEnteredTheDiscountPercentageAs100() {
        new TaxRoundingOff().iEneteredDiscountPercentageAs100();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the discount is calculated correctly after 100 percent discount is applied$")
    public void VerifyIfTheDiscountIsCalculatedCorrectlyAfter100PercentDiscountIsApplied() throws InterruptedException {

        new TaxRoundingOff().VerifyIfDiscountIsCalculatedCorrectlyAfter100PercentDiscountIsApplied();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^I selected menu options Discount Present$")
    public void iSelectedMenuOptionsDiscountPresent() {
//        new TaxRoundingOff().iSelectedTheMenuOptionsDiscountPresent();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I have selected the check number from the list \"([^\"]*)\"$")
    public void iSelectedCheckFromList(String checkNum) throws InterruptedException {
        new TaxRoundingOff().iSelectedCheckFromTheList(checkNum);
    }

    @And("^Verify if the balance due amount is displayed correctly after payment web order$")
    public void VerifyIfTheBalanceDueAmounttIsCalculatedCorrectlyAfterPaymentWebOrder() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterPaymentWebOrder();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And ("^I click log off button in order screen$")
    public void iClickLogOffButtonInOrderScreen(){
        new TaxRoundingOff().clickLogOffBtn();
    }

    @And ("^I selected cancel button$")
    public void iClickCancelButton(){
        new TaxRoundingOff().iClickTheCancelButton();
    }

    @And("^I removed the menu item$")
    public void iRemovedTheMenuItem()
    {
      new TaxRoundingOff().iRemovedMenuItem();
    }

    @And ("^I selected cancel button2$")
    public void iClickCancelButton2(){
        new TaxRoundingOff().iClickTheCancelButton2();
    }
//
//    @And ("^I click Check Stats tab$")
//    public void iClickCheckStatsTab(){
//        new TaxRoundingOff().iClickOnCheckStatsTab();
//    }

    @Then("^I should see closed check in closed check tab$")
    public void iShouldSeeClosedCheckInClosedCheckTab() throws InterruptedException {
        new TaxRoundingOff().verifyClosedCheckInClosedCheckTab();
    }

    @And("^I selected name option$")
    public void iSelectNameOption() throws InterruptedException {
        new TaxRoundingOff().iSelectTheNameOption();
    }

    @And("^I selected the check option$")
    public void iSelectCheckOption() throws InterruptedException {
        new TaxRoundingOff().iSelectTheCheckOption();
    }


    @Then("^I should see the check in phone order tab$")
    public void iShouldSeeCheckInPhoneOrderTab() throws InterruptedException {
        new TaxRoundingOff().iShouldSeeTheCheckInPhoneOrderTab();
    }

    @And("^I verified if pay status is paid$")
    public void verifyIfStatusIsPaid()
    {
        new TaxRoundingOff().verifyIfTheStatusIsPaid();
    }

    @And("^I selected the edit button in phone order$")
    public void  selectEditButton()
    {
        new TaxRoundingOff().selectTheEditButton();
    }

    @Then("^I should see active check in active check tab$")
    public void iShouldSeeActiveCheckInActiveCheckTab() throws InterruptedException {
        new TaxRoundingOff().verifyActiveCheckInActiveCheckTab();
    }

    @And ("^I click reopen check button on the check stats screen$")
    public void iClickReopenCheckButtonOnTheCheckStatsScreen() throws InterruptedException {
        new TaxRoundingOff().pressReopenCheckStatsBtn();
    }

//    @And("^Verify if the total value is calculated correctly when check tax and exc tax are available disc applied \"([^\"]*)\"$")
//    public void VerifyIfTheTotalValueIsCalculatedCorrectlyCheckTaxAndExcTaxPresent(double discPerc) throws InterruptedException {
//        new excludeCheckTax().VerifyIfTotalValueIsCalculatedCorrectlyCheckTaxAndExcTaxPresent(discPerc);
//        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
//    }


}