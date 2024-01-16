package com.qa.stepdef;

import com.qa.pages.ClockInScreen;
import com.qa.pages.OrderTypeWindow;
import com.qa.pages.TaxRoundingOff;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class TaxRoundingOffStepDef {
    public WebDriver driver = TestUtils.driver;
    @Given("I am logging in")
    public void i_am_logging_in() throws InterruptedException {
        new ClockInScreen(driver).ClockIn();
    }
    @And("^I have closed the order type window$")
    public void iHaveClosedTheOrderTypeWindow() throws InterruptedException {
        new OrderTypeWindow(driver).pressCancelBtn();
    }

    @And("^I have selected category arrow$")
    public void iSelectedCategoryArrow() throws InterruptedException {
        new TaxRoundingOff(driver).categoryArrowBtn();
    }

    @And("^Select the category Food items$")
    public void selectTheCategory() throws InterruptedException {
        new TaxRoundingOff(driver).category1Selection();
    }

    @And("^Select the menu item testing menu7$")
    public void selectTheMenu() throws InterruptedException {
        new TaxRoundingOff(driver).menu1Selection();
    }

    @And("^Check the amount of menu item \"([^\"]*)\"$")
    public void checkTheAmountOfMenuItem(String amount) throws InterruptedException {
        new TaxRoundingOff(driver).checkingMenuPrice(amount);
    }

    @And("^Verify if menu price and subtotal are equal$")
    public void verifyIfMenuItemAndSubtotalAmountAreSame() throws InterruptedException {
        new TaxRoundingOff(driver).verifyIfMenuAmountAndSubtotalAreEqual();
    }

    @And("^Verify if tax is calculated as per the quantity \"([^\"]*)\"$")
    public void verifyIfTaxIsCalculatedAsPerTheQuantity(String quantity) throws InterruptedException {
        new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax(quantity);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated as per quantity2 \"([^\"]*)\"$")
    public void verifyIfTaxIsCalculatedAsPerTheQuantity2(String quantity2) throws InterruptedException {
        new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity2);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated as per the quantity3 \"([^\"]*)\"$")
    public void verifyIfTaxIsCalculatedAsPerTheQuantity3(String quantity3) throws InterruptedException {
        new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity3);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu item with inclusive tax$")
    public void SelectTheInclusiveTaxMenuItem() throws InterruptedException {
        new TaxRoundingOff(driver).SelectTheMenuItemWithTheInclusiveTax();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the tax is calculated correctly$")
    public void VerifyIfTaxIsCalculatedCorrectly() throws InterruptedException {

        new TaxRoundingOff(driver).VerifyIfTheTaxIsCalculatedCorrectly();
    }

    @And("^Verify if the total is calculated correctly$")
    public void VerifyIfTotalIsCalculatedCorrectly() throws InterruptedException {

        new TaxRoundingOff(driver).VerifyIfTheTotalIsCalculatedCorrectly();
    }

    @And("^Verify if the balance due is calculated correctly$")
    public void VerifyIfBalanceDueIsCalculatedCorrectly() throws InterruptedException {

        new TaxRoundingOff(driver).VerifyIfTheBalanceDueIsCalculatedCorrectly();
    }

    @And("^Verify if the balance due is displayed correctly after payment$")
    public void VerifyIfBalanceDueIsCalculatedCorrectlyAfterPayment() throws InterruptedException {

        new TaxRoundingOff(driver).VerifyIfTheBalanceDueIsCalculatedCorrectlyAfterPayment();
    }

    @And("^Select the menu item with exclusive tax$")
    public void SelectTheExclusiveTaxMenuItem() throws InterruptedException {
        new TaxRoundingOff(driver).SelectTheMenuItemWithTheExclusiveTax();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the ExcTax is calculated correctly$")
    public void VerifyIfExcTaxIsCalculatedCorrectly() throws InterruptedException {
        new TaxRoundingOff(driver).VerifyIfTheExcTaxIsCalculatedCorrectly();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total value is calculated correctly$")
    public void VerifyIfTheTotalValueIsCalculatedCorrectly() throws InterruptedException {
        new TaxRoundingOff(driver).VerifyIfTotalValueIsCalculatedCorrectly();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is calculated correctly$")
    public void VerifyIfTheBalanceDueValueIsCalculatedCorrectly() throws InterruptedException {
        new TaxRoundingOff(driver).VerifyIfBalanceDueValueIsCalculatedCorrectly();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due value is displayed correctly after payment$")
    public void VerifyIfTheBalanceDueValueIsCalculatedCorrectlyAfterPayment() throws InterruptedException {
        new TaxRoundingOff(driver).VerifyIfBalanceDueValueIsCalculatedCorrectlyAfterPayment();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu item with exclusive tax with discount$")
    public void SelectTheMenuItemWithExclusiveTaxWithDiscount() throws InterruptedException {
        new TaxRoundingOff(driver).SelectTheMenuItemWithExclusiveTaxAndDiscount();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Apply the item discount \"([^\"]*)\"$")
    public void ApplyTheItemDiscount(String DiscountName) throws InterruptedException {
        new TaxRoundingOff(driver).ApplyItemDiscount(DiscountName);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated properly and calculate round-off$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOff()  {
        new TaxRoundingOff(driver).VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOff();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total amount is calculated correctly$")
    public void VerifyIfTheTotalAmountIsCalculatedCorrectly()  {
        new TaxRoundingOff(driver).VerifyIfTotalAmountIsCalculatedCorrectly();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due amount is calculated correctly$")
    public void VerifyIfTheBalanceDueAmounttIsCalculatedCorrectly()  {
        new TaxRoundingOff(driver).VerifyIfBalanceDueAmountIsCalculatedCorrectly();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the balance due amount is displayed correctly after payment$")
    public void VerifyIfTheBalanceDueAmounttIsCalculatedCorrectlyAfterPayment() throws InterruptedException {
        new TaxRoundingOff(driver).VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterPayment();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu item with inclusive tax with discount$")
    public void SelectTheMenuItemWithTheInclusiveTaxAndDiscount() throws InterruptedException {
        new TaxRoundingOff(driver).SelectTheMenuItemWithInclusiveTaxAndDiscount();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Apply the item discount2 \"([^\"]*)\"$")
    public void ApplyTheItemDiscount2(String discountName2) throws InterruptedException {
        new TaxRoundingOff(driver).ApplyItemDiscount2(discountName2);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Verify if tax is calculated correctly and calculate round-off$")
    public void VerifyIfTaxIsCalculatedCorrectlyAndCalculateRoundOff() throws InterruptedException {
        new TaxRoundingOff(driver).VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOff();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Verify if the total amount is displayed correctly$")
    public void VerifyIfTheTotalAmountIsDisplayedCorrectly() throws InterruptedException {
        new TaxRoundingOff(driver).VerifyIfTotalAmountIsDisplayedCorrectly();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Verify if the balance due amount is displayed correctly$")
    public void VerifyIfTheBalanceDueAmountIsDisplayedCorrectly() throws InterruptedException {
        new TaxRoundingOff(driver).VerifyIfBalanceDueAmountIsDisplayedCorrectly();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Verify if the balance due amount is displayed correctly after the payment$")
    public void VerifyIfTheBalanceDueAmountIsCalculatedCorrectlyAfterThePayment() throws InterruptedException {
        new TaxRoundingOff(driver).VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterThePayment();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Selected Options button$")
    public void SelectedOptionsButton() throws InterruptedException {
        new TaxRoundingOff(driver).SelectOptionsButton();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Selected Open item option$")
    public void SelectedOpenItemOption() throws InterruptedException {
        new TaxRoundingOff(driver).SelectedOpenItemOption();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^Selected Coursing name field$")
    public void SelectedCoursingNameField() throws InterruptedException {
        new TaxRoundingOff(driver).SelectedTheCoursingNameField();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxR
    }

    @And("^I swipe to \"([^\"]*)\" Coursing Name$")
    public void iSwipeToTheCoursingName(String name) throws InterruptedException {
        new TaxRoundingOff(driver).swipeToTheCourseName(name);
    }

    @And("^I entered course name as \"([^\"]*)\"$")
    public void iEnteredCourseNameAs(String menu) {
        new TaxRoundingOff(driver).setMenuItemName(menu);
    }

    @And("^I selected the Price text field$")
    public void iSelectedThePriceTextField() {
        new TaxRoundingOff(driver).iSelectedPriceTextField();
    }

    @And("^I entered the price$")
    public void iEnteredThePrice() {
        new TaxRoundingOff(driver).iEnteredThePrice();
    }

    @And("^I selected the Continue button$")
    public void iSelectedTheContinueButton() {
        new TaxRoundingOff(driver).iSelectedContinueButton();
    }

    @And("^I selected the Tax$")
    public void iSelectedTheTax() {
        new TaxRoundingOff(driver).selectTheTax();
    }

    @And("^I selected the Exclusive Tax$")
    public void iSelectedTheTax2Exclusive() {
        new TaxRoundingOff(driver).selectTheTax2Exclusive();
    }

    @And("^I selected the back button$")
    public void iSelectedTheBackButton() {
        new TaxRoundingOff(driver).iSelectedBackButton();
    }

    @And("^Verify if tax and round-off are calculated properly for exclusive$")
    public void verifyIfTheTaxAndRoundOffAreCalculatedProperlyExclusive() {
        new TaxRoundingOff(driver).verifyIfTaxAndRoundOffAreCalculatedProperlyExclusive();
    }

    @And("^I selected the Inclusive Tax$")
    public void iSelectedTheTax2Inclusive() {
        new TaxRoundingOff(driver).selectTheTax2Inclusive();
    }

    @And("^Verify if tax and round-off are calculated properly for inclusive$")
    public void verifyIfTheTaxAndRoundOffAreCalculatedProperlyInclusive() {
        new TaxRoundingOff(driver).verifyIfTheTaxAndRoundOffAreCalculatedProperlyInclusive();
    }

    @And("^Select the menu item with check tax$")
    public void selectTheMenuItemWithCheckTax() {
        new TaxRoundingOff(driver).selectMenuItemWithCheckTax();
    }

    @And("^Verify if the CheckTax is calculated correctly and calculate round-off$")
    public void VerifyIfTheCheckTaxIsCalculatedCorrectlyAndCalculateRoundoff() {
        new TaxRoundingOff(driver).VerifyIfCheckTaxIsCalculatedCorrectlyAndCalculateRoundoff();
    }

    @And("^I entered the price for the open item$")
    public void iEnteredThePriceForTheOpenItem() {
        new TaxRoundingOff(driver).iEnteredPriceForTheOpenItem();
    }

    @And("^Select the menu item with both inclusive and exclusive tax$")
    public void selectTheMenuItemWithBothInclusiveAndExclusiveTax() {
        new TaxRoundingOff(driver).selectMenuItemWithBothInclusiveAndExclusiveTax();
    }

    @And("^Verify if both the taxes are calculated correctly and calculate round-off$")
    public void verifyIfBothTheTaxesAreCalculatedCorrectlyAndCalculateRoundoff() {
        new TaxRoundingOff(driver).verifyIfBothTaxesAreCalculatedCorrectlyAndCalculateRoundoff();
    }

    @And("^Verify if the total value is calculated correctly for both inclusive and exclusive tax$")
    public void verifyifTheTotalValueIsCalculatedCorrectlyBothInclusiveAndExclusive() {
        new TaxRoundingOff(driver).verifyifTotalValueIsCalculatedCorrectlyBothInclusiveAndExclusive();
    }

    @And("^I selected the exclusive tax$")
    public void iSelectedExclusiveTax() throws Exception {
        new TaxRoundingOff(driver).iSelectedTheExclusiveTax();
    }

    @And("^I selected the inclusive tax$")
    public void iSelectedInclusiveTax() throws Exception {
        new TaxRoundingOff(driver).iSelectedTheInclusiveTax();
    }

    @And("^Verify if tax is calculated properly and calculated roundOff Inc And Exc$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffIncAndExc()  {
        new TaxRoundingOff(driver).VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncAndExc();
    }

    @And("^Verify if the total value is calculated correctly for both inclusive and exclusive tax with discount$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffIncAndExcWithDiscount()  {
        new TaxRoundingOff(driver).VerifyIfTotalIsCalculatedProperlyAndCalculateRoundOffIncAndExcWithDiscount();
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for amount discount$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffExcWithAmountDiscount()  {
        new TaxRoundingOff(driver).VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffExcWithAmountDiscount();
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for amount discount Inclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffIncWithAmountDiscount()  {
        new TaxRoundingOff(driver).VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncWithAmountDiscount();
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for set price discount Exclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffExcWithSetPriceDiscount()  {
        new TaxRoundingOff(driver).VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffExcWithSetPriceDiscount();
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for set price discount Inclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffIncWithSetPriceDiscount()  {
        new TaxRoundingOff(driver).VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncWithSetPriceDiscount();
    }

    @And("^Select the menu items with exclusive tax with check discount$")
    public void SelectTheMenuItemsWithExclusiveTaxWithCheckDiscountt()  {
        new TaxRoundingOff(driver).SelectMenuItemsWithExclusiveTaxWithCheckDiscount();
    }

    @And("^Apply the check discount \"([^\"]*)\"$")
    public void ApplyTheCheckDiscount(String DiscountName) throws InterruptedException {
        new TaxRoundingOff(driver).ApplyCheckDiscount(DiscountName);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for check discount exclusive$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive() {
        new TaxRoundingOff(driver).VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu items with inclusive tax with check discount$")
    public void SelectTheMenuItemsWithInclusiveTaxWithCheckDiscount() {
        new TaxRoundingOff(driver).SelectMenuItemsWithInclusiveTaxWithCheckDiscount();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if tax is calculated properly and calculate roundOff for check discount inclusive$")
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountInclusive() {
        new TaxRoundingOff(driver).VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountInclusive();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu item with exclusive tax for open discount$")
    public void SelectTheMenuItemWithTheExclusiveTaxForOpenDiscount() {
        new TaxRoundingOff(driver).SelectMenuItemWithTheExclusiveTaxForOpenDiscount();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected menu options$")
    public void iSelectedMenuOptions() {
        new TaxRoundingOff(driver).iSelectedTheMenuOptions();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected Open Discount$")
    public void iSelectedOpenDiscount() {
        new TaxRoundingOff(driver).iSelectedTheOpenDiscount();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I tapped the percentage field$")
    public void iTappedThePercentageField() {
        new TaxRoundingOff(driver).iTappedPercentageField();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I entered the discount percentage$")
    public void iEnteredTheDiscountPercentage() {
        new TaxRoundingOff(driver).iEneteredDiscountPercentage();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I tapped reason and entered the reason$")
    public void iTappedReasonAndEnteredTheReason() {
        new TaxRoundingOff(driver).iTheTappedReasonAndEnteredTheReason();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the apply button$")
    public void iSelectedTheApplyButton() {
        new TaxRoundingOff(driver).iSelectedApplyButton();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount Exclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountExclusive() {
        new TaxRoundingOff(driver).VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountExclusive();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total amount is calculated correctly for exclusive open discount$")
    public void VerifyIfTheTotalAmountIsCalculatedCorrectlyExclusiveOpenDiscount() {
        new TaxRoundingOff(driver).VerifyIfTotalAmountIsCalculatedCorrectlyExclusiveOpenDiscount();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the menu item with inclusive tax for open discount$")
    public void SelectTheMenuItemWithTheInclusiveTaxForOpenDiscount() {
        new TaxRoundingOff(driver).SelectMenuItemWithTheInclusiveTaxForOpenDiscount();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount Inclusive$")
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountInclusive() {
        new TaxRoundingOff(driver).VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountInclusive();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I clicked the exclusive tax$")
    public void iClickedExclusiveTax() {
        new TaxRoundingOff(driver).iClickedTheExclusiveTax();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the exclusive tax menu item with after tax item discount$")
    public void iSelectedTheExclusiveTaxMenuItemWithAfterTaxItemDiscount() {
        new TaxRoundingOff(driver).iSelectedTheExclusiveTaxMenuItemWithAfterTaxItemDiscount();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and discount \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for item discount after tax Exclusive$")
    public void verifyIfTaxAndDiscountAreCalculatedProperly(double taxAmount, double discountAmount) {
        new TaxRoundingOff(driver).verifyIfTaxAndDiscountAreCalculatedProperly(taxAmount, discountAmount);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected quantity as \"([^\"]*)\"$")
    public void iSelectedQuantity(String quantity) throws InterruptedException {
        new TaxRoundingOff(driver).iSelectedTheQuantity(quantity);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the inclusive tax menu item with after tax item discount$")
    public void iSelectedTheInclusiveTaxMenuItemWithAfterTaxItemDiscount() throws InterruptedException {
        new TaxRoundingOff(driver).iSelectedInclusiveTaxMenuItemWithAfterTaxItemDiscount();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and discount \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for item discount after tax Inclusive$")
    public void verifyIfTaxAndDiscountAreCalculatedProperlyInclusiveAfterTaxDiscount(double taxAmount, double discountAmount) {
        new TaxRoundingOff(driver).verifyIfTaxAndDiscountAreCalculatedProperlyInclusiveAfterTaxDiscount(taxAmount, discountAmount);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu item with exclusive tax and tax on item tax$")
    public void iSelectedTheExclusiveTaxMenuItemWithTaxOnItemTax() {
        new TaxRoundingOff(driver).iSelectedExclusiveTaxMenuItemWithTaxOnItemTax();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and tax on item tax \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for item discount after tax Exclusive$")
    public void verifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemTaxExclusive(double taxAmount1, double taxAmount2) {
        new TaxRoundingOff(driver).verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemTaxExclusive(taxAmount1, taxAmount2);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu item with inclusive tax and tax on item tax$")
    public void iSelectedTheInclusiveTaxMenuItemWithTaxOnItemTax() {
        new TaxRoundingOff(driver).iSelectedInclusiveTaxMenuItemWithTaxOnItemTax();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and tax on item tax \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for item discount after tax Inclusive$")
    public void verifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemTaxInclusive(double taxAmount1, double taxAmount2) {
        new TaxRoundingOff(driver).verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemTaxInclusive(taxAmount1, taxAmount2);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu item with check tax and tax on check tax$")
    public void iSelectedTheMenuItemWithTaxOnCheckTax() {
        new TaxRoundingOff(driver).iSelectedMenuItemWithTaxOnCheckTax();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the All option$")
    public void iSelectedTheAllOption() {
        new TaxRoundingOff(driver).iSelectedAllOption();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu item with exclusive tax and mix and match discount$")
    public void iSelectedTheExclusiveTaxMenuItemWithMixAdMatchDiscout() {
        new TaxRoundingOff(driver).iSelectedExclusiveTaxMenuItemWithMixAdMatchDiscout();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Apply the mix and match discount \"([^\"]*)\"$")
    public void ApplyTheMixAndMatchDiscount(String DiscountName) throws InterruptedException {
        new TaxRoundingOff(driver).ApplyMixAndMatchDiscount(DiscountName);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for item discount after tax Exclusive$")
    public void verifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffMixAndMatchExclusive(double taxAmount1) {
        new TaxRoundingOff(driver).verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffMixAndMatchExclusive(taxAmount1);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the category IceCreams$")
    public void selectTheCategory2() throws InterruptedException {
        new TaxRoundingOff(driver).category2Selection();
    }

    @And("^I selected the menu item with inclusive tax and mix and match discount$")
    public void iSelectedTheInclusiveTaxMenuItemWithMixAdMatchDiscount() {
        new TaxRoundingOff(driver).iSelectedInclusiveTaxMenuItemWithMixAdMatchDiscount();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify If Tax \"([^\"]*)\" and discount \"([^\"]*)\" Is Calculated Properly And Calculate RoundOff for item discount before tax Inclusive$")
    public void verifyIfTaxAndDiscountAreCalculatedProperlyInclusiveBeforeTaxDiscount(double taxAmount, double discountAmount) {
        new TaxRoundingOff(driver).verifyIfTheTaxAndDiscountAreCalculatedProperlyInclusiveBeforeTaxDiscount(taxAmount, discountAmount);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu item with inclusive tax and mix and match discount Percentage$")
    public void iSelectedTheExclusiveTaxMenuItemWithMixAdMatchDiscountPercentage() {
        new TaxRoundingOff(driver).iSelectedExclusiveTaxMenuItemWithMixAdMatchDiscountPercentage();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the modifier with prefix$")
    public void iSelectedTheModifierWithPrefix() {
        new TaxRoundingOff(driver).iSelectedModifierWithPrefix();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Select the category as \"([^\"]*)\"$")
    public void SelectTheCategory(String CategoryName) throws InterruptedException {
        new TaxRoundingOff(driver).SelectCategory(CategoryName);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the menu item \"([^\"]*)\"$")
    public void iSelectedTheMenuItem(String MenuItemName) {
        new TaxRoundingOff(driver).iSelectedMenuItem(MenuItemName);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the size as \"([^\"]*)\"$")
    public void iSelectedTheSize(String Size) {
        new TaxRoundingOff(driver).iSelectedSize(Size);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax \"([^\"]*)\" is calculated properly and calculate roundoff$")
    public void verifyExcTaxAndRoundOffCalculation(Double taxValue) {
        new TaxRoundingOff(driver).verifyTheExcTaxAndRoundOffCalculation(taxValue);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total value is calculated correctly exc when free item amount is \"([^\"]*)\"$")
    public void verifyTotalValueWithFreeItemDiscount(Double freeItemValue) {
        new TaxRoundingOff(driver).verifyTheTotalValueWithFreeItemDiscount(freeItemValue);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if inclusive tax \"([^\"]*)\" is calculated properly and calculate roundoff$")
    public void verifyIncTaxAndRoundOffCalculation(Double taxValue) {
        new TaxRoundingOff(driver).verifyTheIncTaxAndRoundOffCalculation(taxValue);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total value is calculated correctly inc when free item amount is \"([^\"]*)\"$")
    public void verifyTotalValueIncWithFreeItemDiscount(Double freeItemValue) {
        new TaxRoundingOff(driver).verifyTheTotalValueIncWithFreeItemDiscount(freeItemValue);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if exclusive tax \"([^\"]*)\" and inclusive tax \"([^\"]*)\" are calculated properly and calculate roundoff$")
    public void verifyExcAndIncTaxAndRoundOffCalculation(Double taxValue1, Double taxValue2) {
        new TaxRoundingOff(driver).verifyTheExcAndIncTaxAndRoundOffCalculation(taxValue1, taxValue2);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^Verify if the total value is calculated correctly exc \"([^\"]*)\" and inc when free item amount is \"([^\"]*)\"$")
    public void verifyTotalValueExcAndIncWithFreeItemDiscount(Double taxValue, Double freeItemValue) {
        new TaxRoundingOff(driver).verifyTheTotalValueExcAndIncWithFreeItemDiscount(taxValue, freeItemValue);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected the check number \"([^\"]*)\"$")
    public void SeletcedTheCheckNumber(String CheckNumber) throws InterruptedException {
        new TaxRoundingOff(driver).SeletcedCheckNumber(CheckNumber);
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

    @And("^I selected Re-Open Check option$")
    public void SeletcedTheReopenCheckOption() throws InterruptedException {
        new TaxRoundingOff(driver).SeletcedReopenCheckOption();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

//    @And("^I selected Re-Open Check option$")
//    public void SeletcedTheReopenCheckOption() throws InterruptedException {
//        new TaxRoundingOff(driver).SeletcedReopenCheckOption();
//        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
//        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
//    }

    @And("^I voided the menu item$")
    public void iVoidedTheMenuItem() throws InterruptedException {
        new TaxRoundingOff(driver).iVoidedMenuItem();
        // new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax2(quantity);
        //new TaxRoundingOff(driver).verifyIfTaxIsCalculatedAsPerTheQuantityTax3(quantity);
    }

}
