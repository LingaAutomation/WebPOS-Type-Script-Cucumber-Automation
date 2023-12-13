package com.qa.stepdef;

import com.qa.pages.OrderTypeWindow;
import com.qa.pages.TaxRoundingOff;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class TaxRoundingOffStepDef {
    @Given("I am logging in")
    public void i_am_logging_in() {
//        new ClockInScreen().ClockIn();
    }

    @And("^I have closed the order type window$")
    public void iHaveClosedTheOrderTypeWindow() throws InterruptedException {
        new OrderTypeWindow().pressCancelBtn();
    }

    @And("^I have selected category arrow$")
    public void iSelectedCategoryArrow() throws InterruptedException {
        new TaxRoundingOff().categoryArrowBtn();
    }

    @And("^Select the category Food items$")
    public void selectTheCategory() throws InterruptedException {
        new TaxRoundingOff().category1Selection();
    }

    @And("^Select the menu item testing menu7$")
    public void selectTheMenu() throws InterruptedException {
        new TaxRoundingOff().menu1Selection();
    }

    @And("^Check the amount of menu item \"([^\"]*)\"$")
    public void checkTheAmountOfMenuItem(String amount) throws InterruptedException {
        new TaxRoundingOff().checkingMenuPrice(amount);
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

    @And("^Verify if the tax is calculated correctly$")
    public void VerifyIfTaxIsCalculatedCorrectly() throws InterruptedException {

        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedCorrectly();
    }

    @And("^Verify if the total is calculated correctly$")
    public void VerifyIfTotalIsCalculatedCorrectly() throws InterruptedException {

        new TaxRoundingOff().VerifyIfTheTotalIsCalculatedCorrectly();
    }

    @And("^Verify if the balance due is calculated correctly$")
    public void VerifyIfBalanceDueIsCalculatedCorrectly() throws InterruptedException {

        new TaxRoundingOff().VerifyIfTheBalanceDueIsCalculatedCorrectly();
    }

    @And("^Verify if the balance due is displayed correctly after payment$")
    public void VerifyIfBalanceDueIsCalculatedCorrectlyAfterPayment() throws InterruptedException {

        new TaxRoundingOff().VerifyIfTheBalanceDueIsCalculatedCorrectlyAfterPayment();
    }

    @And("^Select the menu item with exclusive tax$")
    public void SelectTheExclusiveTaxMenuItem() throws InterruptedException {
        new TaxRoundingOff().SelectTheMenuItemWithTheExclusiveTax();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the ExcTax is calculated correctly$")
    public void VerifyIfExcTaxIsCalculatedCorrectly() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTheExcTaxIsCalculatedCorrectly();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total value is calculated correctly$")
    public void VerifyIfTheTotalValueIsCalculatedCorrectly() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTotalValueIsCalculatedCorrectly();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is calculated correctly$")
    public void VerifyIfTheBalanceDueValueIsCalculatedCorrectly() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueValueIsCalculatedCorrectly();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is displayed correctly after payment$")
    public void VerifyIfTheBalanceDueValueIsCalculatedCorrectlyAfterPayment() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueValueIsCalculatedCorrectlyAfterPayment();
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

    @And("^Verify if tax is calculated properly and calculate round-off$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOff()  {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOff();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total amount is calculated correctly$")
    public void VerifyIfTheTotalAmountIsCalculatedCorrectly()  {
        new TaxRoundingOff().VerifyIfTotalAmountIsCalculatedCorrectly();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due amount is calculated correctly$")
    public void VerifyIfTheBalanceDueAmounttIsCalculatedCorrectly()  {
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

    @And("^Verify if tax is calculated correctly and calculate round-off$")
    public void VerifyIfTaxIsCalculatedCorrectlyAndCalculateRoundOff() throws InterruptedException {
        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOff();
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

    @And("^Verify if the balance due amount is displayed correctly after the payment$")
    public void VerifyIfTheBalanceDueAmountIsCalculatedCorrectlyAfterThePayment() throws InterruptedException {
        new TaxRoundingOff().VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterThePayment();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Selected Options button$")
    public void SelectedOptionsButton() throws InterruptedException {
        new TaxRoundingOff().SelectOptionsButton();
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

    @And("^I entered course name as \"([^\"]*)\"$")
    public void iEnteredCourseNameAs(String menu) {
        new TaxRoundingOff().setMenuItemName(menu);
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

    @And("^I entered the price for the open item$")
    public void iEnteredThePriceForTheOpenItem() {
        new TaxRoundingOff().iEnteredPriceForTheOpenItem();
    }

    @And("^Select the menu item with both inclusive and exclusive tax$")
    public void selectTheMenuItemWithBothInclusiveAndExclusiveTax() {
        new TaxRoundingOff().selectMenuItemWithBothInclusiveAndExclusiveTax();
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
        new TaxRoundingOff().iSelectedTheInclusiveTax();
    }

    @And("^Verify if tax is calculated properly and calculated roundOff Inc And Exc$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffIncAndExc()  {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncAndExc();
    }

    @And("^Verify if the total value is calculated correctly for both inclusive and exclusive tax with discount$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffIncAndExcWithDiscount()  {
        new TaxRoundingOff().VerifyIfTotalIsCalculatedProperlyAndCalculateRoundOffIncAndExcWithDiscount();
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for amount discount$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffExcWithAmountDiscount()  {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffExcWithAmountDiscount();
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for amount discount Inclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffIncWithAmountDiscount()  {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncWithAmountDiscount();
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for set price discount Exclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffExcWithSetPriceDiscount()  {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffExcWithSetPriceDiscount();
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for set price discount Inclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffIncWithSetPriceDiscount()  {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncWithSetPriceDiscount();
    }

    @And("^Select the menu items with exclusive tax with check discount$")
    public void SelectTheMenuItemsWithExclusiveTaxWithCheckDiscountt()  {
        new TaxRoundingOff().SelectMenuItemsWithExclusiveTaxWithCheckDiscount();
    }

    @And("^Apply the check discount \"([^\"]*)\"$")
    public void ApplyTheCheckDiscount(String DiscountName) throws InterruptedException {
        new TaxRoundingOff().ApplyCheckDiscount(DiscountName);
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for check discount exclusive$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive() {
        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu items with inclusive tax with check discount$")
    public void SelectTheMenuItemsWithInclusiveTaxWithCheckDiscount() {
        new TaxRoundingOff().SelectMenuItemsWithInclusiveTaxWithCheckDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for check discount inclusive$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountInclusive() {
        new TaxRoundingOff().VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountInclusive();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu item with exclusive tax for open discount$")
    public void SelectTheMenuItemWithTheExclusiveTaxForOpenDiscount() {
        new TaxRoundingOff().SelectMenuItemWithTheExclusiveTaxForOpenDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected menu options$")
    public void iSelectedMenuOptions() {
        new TaxRoundingOff().iSelectedTheMenuOptions();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected Open Discount$")
    public void iSelectedOpenDiscount() {
        new TaxRoundingOff().iSelectedTheOpenDiscount();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I tapped the percentage field$")
    public void iTappedThePercentageField() {
        new TaxRoundingOff().iTappedPercentageField();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I entered the discount percentage$")
    public void iEnteredTheDiscountPercentage() {
        new TaxRoundingOff().iEneteredDiscountPercentage();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I tapped reason and entered the reason$")
    public void iTappedReasonAndEnteredTheReason() {
        new TaxRoundingOff().iTheTappedReasonAndEnteredTheReason();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the apply button$")
    public void iSelectedTheApplyButton() {
        new TaxRoundingOff().iSelectedApplyButton();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount Exclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountExclusive() {
        new TaxRoundingOff().VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountExclusive();
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
        new TaxRoundingOff().iClickedTheExclusiveTax();
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

    @And("^I selected quantity as \"([^\"]*)\"$")
    public void iSelectedQuantity(String quantity) throws InterruptedException {
        new TaxRoundingOff().iSelectedTheQuantity(quantity);
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

    @And("^I voided the menu item$")
    public void iVoidedTheMenuItem() throws InterruptedException {
        new TaxRoundingOff().iVoidedMenuItem();
        // new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff().verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

}
