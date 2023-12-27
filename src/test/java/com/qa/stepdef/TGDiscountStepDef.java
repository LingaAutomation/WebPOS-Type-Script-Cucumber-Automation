package com.qa.stepdef;

import com.qa.pages.*;

import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TGDiscountStepDef {

    @And("^Go to the BO$")
    public void GoToTheBO() throws InterruptedException {
        new ClockInScreen().goToBO();
    }

    @When("^I search the store as \"([^\"]*)\"$")
    public void iSearchTheStoreAs(String store) throws InterruptedException {
        new ClockInScreen().selectTheStore(store);
    }

    @Then("User click Option Tab")
    public void userClickOptionTab() {
        new TGMenuItemPage().clickOptionTab();
        //checkOptionPage.verifyCheckOptionPage();
    }
    @And("User verify applied discount")
    public void userVerifyAppliedDiscount() {
        //%10 için -- discount method yazılcak
        new TGDiscountPage().verifyItemDiscountAmount();

    }
    @And("User verify applied discount with percentage")
    public void userVerifyAppliedDiscountWithPercentage() {
        new TGDiscountPage().verifyItemDiscountPercentage();
    }
    @And("User verify applied discount with check based")
    public void userVerifyAppliedDiscountWithCheckBased() {
        new TGDiscountPage().verifyCheckBasedDiscount();
    }
    @When("User select Item Discount option")
    public void userSelectItemDiscountOption() {
        new TGDiscountPage().selectItemDiscountTab();
    }

    @Then("User select item discount for item")
    public void userSelectItemDiscountForItem() {
        new TGDiscountPage().selectItemDiscountType();
    }

    @And("user verify applied item discount")
    public void userVerifyAppliedItemDiscount() {

    }

    @And("User select Discount Option")
    public void userSelectDiscountOption() {
        new TGDiscountPage().selectDiscountOption();
    }

    @When("User select Check Discount option")
    public void userSelectCheckDiscountOption() {
        new TGDiscountPage().selectCheckDiscountOption();
    }

    @Then("User select percentage of discount")
    public void userSelectPercentageOfDiscount() {
        new TGDiscountPage().selectCheckDiscountPercentage();
    }

    @Then("User select item based discount option")
    public void userSelectItemBasedDiscountOption() {
        new TGDiscountPage().selectItemBasedDiscount();
    }

    @Then("User select check based discount option")
    public void userSelectCheckBasedDiscountOption() {
        new TGDiscountPage().selectCheckBasedDiscount();
    }

    @Then("User select item based discount option with amount")
    public void userSelectItemBasedDiscountOptionWithAmount() {
        new TGDiscountPage().clickItemBasedWithAmountDiscount();
    }
    @When("^User take an order as \"([^\"]*)\"$")
    public void userTakeAnOrderAs(String menu) throws InterruptedException {
        new TGCheckStatusPage().takeOrderAs(menu);
    }
    @Then("User select item based discount option with percentage")
    public void userSelectItemBasedDiscountOptionWithPercentage() {
        new TGDiscountPage().clickDiscountWithPercentage();
    }

    @And("User select free item option")
    public void userSelectFreeItemOption() {
        new TGDiscountPage().clickFreeItemButton();
    }

    @And("User click discount back button")
    public void userClickDiscountBackButton() {
        new TGDiscountPage().clickCheckBasedAmountDiscountOption();
    }

    @Then("User select check based amount discount option")
    public void userSelectCheckBasedAmountDiscountOption() {
        new TGDiscountPage().clickCheckBasedAmountDiscountOption();
    }

    @And("User select check based percentage discount option")
    public void userSelectCheckBasedPercentageDiscountOption() {
        new TGDiscountPage().clickCheckBasedPercentageDiscountOption();
    }

    @And("User select check based as free discount option")
    public void userSelectCheckBasedAsFreeDiscountOption() {
        new TGDiscountPage().clickCheckBasedFreeOption();
    }

    @And("User select check based as free discount option after applied")
    public void userSelectCheckBasedAsFreeDiscountOptionAfterApplied() {
        new TGDiscountPage().clickCheckBasedFreeOptionAfterApplied();
    }

    @And("User select check based set price discount option")
    public void userSelectCheckBasedSetPriceDiscountOption() {
        new TGDiscountPage().clickCheckBasedSetPrice();
    }

    @Then("User select item based amount discount option")
    public void userSelectItemBasedAmountDiscountOption() {
        new TGDiscountPage().clickItemBasedAmountOption();
    }

    @Then("User select item based percentage discount option")
    public void userSelectItemBasedPercentageDiscountOption() {
        new TGDiscountPage().clickItemBasedPercentageOption();
    }

    @And("User select item based as free discount option")
    public void userSelectItemBasedAsFreeDiscountOption() {
        new TGDiscountPage().clickItemBasedFreeOption();
    }

    @Then("User verify no discount option")
    public void userVerifyNoDiscountOption() {
        new TGDiscountPage().verifyEmptyDiscountOption();
    }

    @And("User verify discount options")
    public void userVerifyDiscountOptions() {
        new TGDiscountPage().verifyFilledDiscountOptions();
    }

    @Then("User select item based discount after tax")
    public void userSelectItemBasedDiscountAfterTax() {
        new TGDiscountPage().selectItemBasedDiscountAfterTaxOption();
    }

    @Then("User select item based discount after tax day restrict")
    public void userSelectItemBasedDiscountAfterTaxDayRestrict() {
        new TGDiscountPage().selectItemBasedDiscountAfterTaxDayRestrict();
    }

    @Then("User select item based discount before tax")
    public void userSelectItemBasedDiscountBeforeTax() {
        new TGDiscountPage().selectItemBasedDiscountBeforeTaxOption();
    }

    @Then("User select item based discount before tax role restrict")
    public void userSelectItemBasedDiscountBeforeTaxRoleRestrict() {
        new TGDiscountPage().selectItemBasedDiscountBeforeTaxRoleRestrict();
    }

    @Then("User select item based discount after tax role restrict")
    public void userSelectItemBasedDiscountAfterTaxRoleRestrict() {
        new TGDiscountPage().selectItemBasedDiscountAfterTaxRoleRestrict();
    }

    @Then("User select check based discount after tax")
    public void userSelectCheckBasedDiscountAfterTax() {
        new TGDiscountPage().selectCheckBasedDiscountAfterTax();
    }

    @Then("User select item based discount before tax day restrict")
    public void userSelectItemBasedDiscountBeforeTaxDayRestrict() {
        new TGDiscountPage().selectItemBasedDiscountBeforeTaxRestrictDay();
    }

    @And("User verify item based discount after tax day restrict")
    public void userVerifyItemBasedDiscountAfterTaxDayRestrict() {
        new TGDiscountPage().verifyItemBasedAfterTaxDayRestrict();
    }

    @And("User verify item based discount before tax day restrict")
    public void userVerifyItemBasedDiscountBeforeTaxDayRestrict() {
        new TGDiscountPage().verifyItemBasedBeforeTaxDayRestrict();
    }

    @And("User verify item based discount after tax day restrict warning")
    public void userVerifyItemBasedDiscountAfterTaxDayRestrictWarning() {
        new TGDiscountPage().verifyItemBasedDiscountAfterTaxDayRestrictWarning();
    }

    @And("User verify item based discount before tax day restrict warning")
    public void userVerifyItemBasedDiscountBeforeTaxDayRestrictWarning() {
        new TGDiscountPage().verifyItemBasedDiscountBeforeTaxDayRestrictWarning();
    }

    @Then("User select check based discount before tax")
    public void userSelectCheckBasedDiscountBeforeTax() {
        new TGDiscountPage().selectCheckBasedBeforeTax();
    }

    @And("User verify check based discount before tax")
    public void userVerifyCheckBasedDiscountBeforeTax() {
        new TGDiscountPage().verifyCheckBasedDiscountBeforeTax();
    }

    @Then("User select check based discount before tax day restrict")
    public void userSelectCheckBasedDiscountBeforeTaxDayRestrict() {
        new TGDiscountPage().selectCheckBasedDiscountBeforeTaxDayRestrict();
    }

    @And("User verify check based discount before tax day restrict")
    public void userVerifyCheckBasedDiscountBeforeTaxDayRestrict() {
        new TGDiscountPage().verifyCheckBasedDiscountBeforeTaxDayRestrict();
    }

    @Then("User select check based discount before tax role restrict")
    public void userSelectCheckBasedDiscountBeforeTaxRoleRestrict() {
        new TGDiscountPage().selectCheckBasedDiscountBeforeTaxRoleRestrict();
    }

    @And("User verify check based discount before tax role restrict")
    public void userVerifyCheckBasedDiscountBeforeTaxRoleRestrict() {
        new TGDiscountPage().verifyCheckBasedDiscountBeforeTaxRoleRestrict();
    }

    @Then("User select CB-AfterTax-OpenItem menu item of pizza category")
    public void userSelectCBAfterTaxOpenItemMenuItemOfPizzaCategory() {
        new TGDiscountPage().selectCheckBasedDiscountAfterTaxOpenItem();
    }

    @And("User enter value of open menu item")
    public void userEnterValueOfOpenMenuItem() {
        new TGDiscountPage().enterOpenItemValue();
    }

   /* @When("User select check discount option")
    public void userSelectCheckDiscountOption() {
        new TGDiscountPage().clickCheckDiscountOption();
    }*/

    @When("User select Free discount option which has before tax")
    public void userSelectFreeDiscountOptionWhichHasBeforeTax() {
        new TGDiscountPage().selectItemBasedFreeDiscountOptionWhichHasBeforeTax();
    }

    @When("User select check based percentage discount option which has after tax")
    public void userSelectCheckBasedPercentageDiscountOptionWhichHasAfterTax() {
        new TGDiscountPage().selectCheckBasedPercentageDiscountOptionWhichHasAfterTax();
    }

    @When("User select check based amount discount option which has after tax")
    public void userSelectCheckBasedAmountDiscountOptionWhichHasAfterTax() {
        new TGDiscountPage().selectCheckBasedAmountDiscountOptionWhichHasAfterTax();
    }

    @When("User select check based set price discount option which has after tax")
    public void userSelectCheckBasedSetPriceDiscountOptionWhichHasAfterTax() {
        new TGDiscountPage().selectCheckBasedSetPriceDiscountOptionWhichHasAfterTax();
    }

    @When("User select check based as percentage discount option which has before tax")
    public void userSelectCheckBasedAsPercentageDiscountOptionWhichHasBeforeTax() {
        new TGDiscountPage().selectCheckBasedAsPercentageDiscountOptionWhichHasBeforeTax();
    }

    @When("User select check based amount discount option which has before tax")
    public void userSelectCheckBasedAmountDiscountOptionWhichHasBeforeTax() {
        new TGDiscountPage().selectCheckBasedAmountDiscountOptionWhichHasBeforeTax();
    }

    @When("User select check based set price discount option which has before tax")
    public void userSelectCheckBasedSetPriceDiscountOptionWhichHasBeforeTax() {
        new TGDiscountPage().selectCheckBasedSetPriceDiscountOptionWhichHasBeforeTax();
    }

    @When("User select check based Free discount option which has before tax")
    public void userSelectCheckBasedFreeDiscountOptionWhichHasBeforeTax() {
        new TGDiscountPage().selectCheckBasedFreeDiscountOptionWhichHasBeforeTax();
    }

    @When("User select check based as free discount option which has after tax")
    public void userSelectCheckBasedAsFreeDiscountOptionWhichHasAfterTax() {
        new TGDiscountPage().selectCheckBasedAsFreeDiscountOptionWhichHasAfterTax();
    }

    @And("User enter open discount amount as decimal")
    public void userEnterOpenDiscountAmountAsDecimal() {
        new TGDiscountPage().enterOpenDiscountAmountAsDecimal();
    }

    @And("User select after tax for open discount type")
    public void userSelectAfterTaxForOpenDiscountType() {
        new TGDiscountPage().selectAfterTaxForOpenDiscountType();
    }

    @And("User verify open discount with after tax")
    public void userVerifyOpenDiscountWithAfterTax() {
        new TGDiscountPage().verifyOpenDiscountWithAfterTax();
    }

    @And("User verify open discount with after tax for Margarita")
    public void userVerifyOpenDiscountWithAfterTaxForMargarita() {
        new TGDiscountPage().verifyOpenDiscountWithAfterTaxForMargarita();
    }

    @And("User enter open discount percentage value")
    public void userEnterOpenDiscountPercentageValue() {
        new TGDiscountPage().enterOpenDiscountPercentageValue();
    }

    @And("User select before tax for open discount type")
    public void userSelectBeforeTaxForOpenDiscountType() {
        new TGDiscountPage().selectBeforeTaxForOpenDiscountType();
    }

    @And("User enter open discount amount as whole number")
    public void userEnterOpenDiscountAmountAsWholeNumber() {
        new TGDiscountPage().enterOpenDiscountAmountAsWholeNumber();
    }

    @And("User verify open discount as percentage with after tax")
    public void userVerifyOpenDiscountAsPercentageWithAfterTax() {
        new TGDiscountPage().verifyOpenDiscountAsPercentageWithAfterTax();
    }

    @And("User verify open discount as percentage with before tax")
    public void userVerifyOpenDiscountAsPercentageWithBeforeTax() {
        new TGDiscountPage().verifyOpenDiscountAsPercentageWithBeforeTax();
    }

    @Then("User click bar tab order bill info details icon")
    public void userClickBarTabOrderBillInfoDetailsIcon() {
    }

    @Then("User verify exclusive tax for Hot Wings")
    public void userVerifyExclusiveTaxForHotWings() {
        new TGMenuItemPage().verifyExclusiveTaxForHorWings();
    }

    @When("User select item based discount after tax as amount")
    public void userSelectItemBasedDiscountAfterTaxAsAmount() {
        new TGDiscountPage().selectItemBasedDiscountAfterTaxAsAmount();
    }

    @When("User select item based discount before tax as amount")
    public void userSelectItemBasedDiscountBeforeTaxAsAmount() {
        new TGDiscountPage().selectItemBasedDiscountBeforeTaxAsAmount();
    }

    @When("User select item based discount after tax as set price")
    public void userSelectItemBasedDiscountAfterTaxAsSetPrice() {
        new TGDiscountPage().selectItemBasedDiscountAfterTaxAsSetPrice();
    }

    @When("User select item based discount before tax as set price")
    public void userSelectItemBasedDiscountBeforeTaxAsSetPrice() {
        new TGDiscountPage().selectItemBasedDiscountBeforeTaxAsSetPrice();
    }

    @When("User select item based discount after tax as Free item")
    public void userSelectItemBasedDiscountAfterTaxAsFreeItem() {
        new TGDiscountPage().selectItemBasedDiscountAfterTaxAsFreeItem();
    }

    @When("User select item based discount before tax as Free item")
    public void userSelectItemBasedDiscountBeforeTaxAsFreeItem() {
        new TGDiscountPage().selectItemBasedDiscountBeforeTaxAsFreeItem();
    }

    @When("User select item based discount before tax as percentage")
    public void userSelectItemBasedDiscountBeforeTaxAsPercentage() {
        new TGDiscountPage().selectItemBasedDiscountBeforeTaxAsPercentage();
    }

    @When("User select item based discount after tax as percentage")
    public void userSelectItemBasedDiscountAfterTaxAsPercentage() {
        new TGDiscountPage().selectItemBasedDiscountAfterTaxAsPercentage();
    }

    @When("User select check based discount after tax as percentage")
    public void userSelectCheckBasedDiscountAfterTaxAsPercentage() {
        new TGDiscountPage().selectCheckBasedDiscountAfterTaxAsPercentage();
    }

    @Then("^User verify check based discount after tax as percentage value as \"([^\"]*)\" with Sandwiches$")
    public void userVerifyCheckBasedDiscountAfterTaxAsPercentageValueAsWithSandwiches(String value) {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAsPercentageWithSandwiches(value);
    }

    @Then("^User verify check based discount before tax as percentage value as \"([^\"]*)\" with Sandwiches$")
    public void userVerifyCheckBasedDiscountBeforeTaxAsPercentageValueAsWithSandwiches(String value) {
        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxAsPercentageWithSandwiches(value);
    }

    @Then("^User verify check based discount after tax as amount value as \"([^\"]*)\" with Sandwiches$")
    public void userVerifyCheckBasedDiscountAfterTaxAsAmountValueASWithSandwiches(String value) {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAsAmountWithSandwiches(value);
    }

    @Then("^User verify check based discount before tax as amount value as \"([^\"]*)\" with Sandwiches$")
    public void userVerifyCheckBasedDiscountBeforeTaxAsAmountValueAsWithSandwiches(String value) {
        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxAsAmountWithSandwiches(value);
    }

    @Then("^User verify check based discount after tax as set price value as \"([^\"]*)\" with Sandwiches$")
    public void userVerifyCheckBasedDiscountAfterTaxAsSetPriceValueAsWithSandwiches(String value) {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAsSetPriceWithSandwiches(value);
    }

    @When("User select check based discount before tax as percentage")
    public void userSelectCheckBasedDiscountBeforeTaxAsPercentage() {
        new TGDiscountPage().selectCheckBasedDiscountBeforeTaxAsPercentage();
    }

    @When("User select check based discount before tax as amount")
    public void userSelectCheckBasedDiscountBeforeTaxAsAmount() {
        new TGDiscountPage().selectCheckBasedDiscountBeforeTaxAsAmount();
    }

    @When("User select check based discount after tax as set price")
    public void userSelectCheckBasedDiscountAfterTaxAsSetPrice() {
        new TGDiscountPage().selectCheckBasedDiscountAfterTaxAsSetPrice();
    }

    @When("User select check based discount before tax as set price")
    public void userSelectCheckBasedDiscountBeforeTaxAsSetPrice() {
        new TGDiscountPage().selectCheckBasedDiscountBeforeTaxAsSetPrice();
    }

    @When("User select check based discount after tax as amount")
    public void userSelectCheckBasedDiscountAfterTaxAsAmount() {
        new TGDiscountPage().selectCheckBasedDiscountAfterTaxAsAmount();
    }

    @When("User select check based discount after tax as free item")
    public void userSelectCheckBasedDiscountAfterTaxAsFreeItem() {
        new TGDiscountPage().selectCheckBasedDiscountAfterTaxAsFreeItem();
    }

    @When("User select check based discount before tax as free item")
    public void userSelectCheckBasedDiscountBeforeTaxAsFreeItem() {
        new TGDiscountPage().selectCheckBasedDiscountBeforeTaxAsFreeItem();
    }
//    @And("^User verify check based discount before tax as free item value as \"([^\"]*)\" for Brushetta$")
//    public void userVerifyCheckBasedDiscountBeforeTaxAsFreeItemValueAsForBrushetta(String value ) {
//        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxAsFreeItemForBrushetta(value);
//    }

    @Then("^User verify check based discount before tax as free item value as \"([^\"]*)\" with Sandwiches$")
    public void userVerifyCheckBasedDiscountBeforeTaxAsFreeItemValueAsWithSandwiches(String value) {
        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxAsFreeItemWithSandwiches(value);
    }

    @Then("^User verify check based discount after tax as free item value as \"([^\"]*)\" with Sandwiches$")
    public void userVerifyCheckBasedDiscountAfterTaxAsFreeItemValueAsWithSandwiches(String value) {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAsFreeItemWithSandwiches(value);
    }

    @Then("User select item based discount after tax with percentage")
    public void userSelectItemBasedDiscountAfterTaxWithPercentage() {
        new TGDiscountPage().selectItemBasedDiscountAfterTaxAsPercentage();
    }

    @Then("User select item based discount before tax with percentage")
    public void userSelectItemBasedDiscountBeforeTaxWithPercentage() {
        new TGDiscountPage().selectItemBasedDiscountBeforeTaxWithPercentage();
    }

    @Then("User select item based discount before tax with amount")
    public void userSelectItemBasedDiscountBeforeTaxWithAmount() {
        new TGDiscountPage().selectItemBasedDiscountBeforeTaxWithAmount();
    }

    @Then("User select item based discount after tax with amount")
    public void userSelectItemBasedDiscountAfterTaxWithAmount() {
        new TGDiscountPage().selectItemBasedDiscountAfterTaxWithAmount();
    }


    @And("User verify open discount as percentage with after tax for Margarita")
    public void userVerifyOpenDiscountAsPercentageWithAfterTaxForMargarita() {
        new TGDiscountPage().verifyOpenDiscountAsPercentageWithAfterTaxForMargarita();
    }

    @When("User select item based discount as amount option which has safety limit in decimal precision which has after tax")
    public void userSelectItemBasedDiscountAsAmountOptionWhichHasSafetyLimitInDecimalPrecisionWhichHasAfterTax() {
        new TGDiscountPage().selectItemBasedDiscountAsAmountOptionWhichHasSafetyLimitInDecimalPrecisionWhichHasAfterTax();
    }

    @Then("User select item based discount before tax tax as percentage")
    public void userSelectItemBasedDiscountBeforeTaxTaxAsPercentage() {
        new TGDiscountPage().selectItemBasedDiscountBeforeTaxTaxAsPercentage();
    }

    @Then("User select item based discount after tax tax as amount")
    public void userSelectItemBasedDiscountAfterTaxTaxAsAmount() {
        new TGDiscountPage().selectItemBasedDiscountAfterTaxTaxAsAmount();
    }

    @Then("User select check based discount before tax with open item")
    public void userSelectCheckBasedDiscountBeforeTaxWithOpenItem() {
        new TGDiscountPage().selectCheckBasedDiscountBeforeTaxWithOpenItem();
    }

    @When("I click the \"([^\"]*)\" in the discount screen \"([^\"]*)\"$")
    public void IClickTheInTheDiscountScreen(String btnDiscount,String msg){
        new CIPaymentScreen().clickDiscount2(btnDiscount,msg);
    }
    @Then("User select menu item and take an order")
    public void userSelectMenuItemAndTakeAnOrder() {
        new TGMenuItemPage().selectAutoDiscountMenuItemAndOrder();
    }
    @When("User click the \"([^\"]*)\" button in the Open item screen \"([^\"]*)\"$")
    public void IClickTheButtonInTheOpenItemScreen(String btnDiscount,String msg){
        new CICloseDayScreen().commonAccessibilityId(btnDiscount,msg);
    }
}
