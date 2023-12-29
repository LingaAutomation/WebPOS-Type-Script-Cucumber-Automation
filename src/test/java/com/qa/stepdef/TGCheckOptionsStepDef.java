package com.qa.stepdef;

import com.qa.pages.OrderManagementScreen;
import com.qa.pages.TGCheckOptionPage;
import com.qa.pages.TGMenuItemPage;
import com.qa.pages.TGSplitCheckPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class TGCheckOptionsStepDef {


    @Then("User select Discount Option on check options page")
    public void userSelectDiscountOptionOnCheckOptionsPage() {
        new TGCheckOptionPage().selectDiscountOption();
    }

    @And("User select open check discount option")
    public void userSelectOpenCheckDiscountOption() {
        new TGCheckOptionPage().selectOpenCheckDiscountOption();
    }

    @When("User select charge type as percentage")
    public void userSelectChargeTypeAsPercentage() {
        new TGCheckOptionPage().selectChargeType();
    }

    @And("User enter discount percentage")
    public void userEnterDiscountPercentage() {
        new TGCheckOptionPage().enterPercentageForOpenCheck();
    }

    @And("User select after tax type applied time")
    public void userSelectAfterTaxTypeAppliedTime() {
        new TGCheckOptionPage().selectAfterTaxType();
    }

    @Then("User click apply button for open discount")
    public void userClickApplyButtonForOpenDiscount() {
        new TGCheckOptionPage().clickApplyButton();
    }

    @And("User enter open discount reason")
    public void userEnterOpenDiscountReason() {
        new TGCheckOptionPage().enterOpenDiscountReason();
    }

    @When("User select gratuity option")
    public void userSelectGratuityOption() {
        new TGCheckOptionPage().clickGratuityOption();
    }

    @Then("User verify gratuity page")
    public void userVerifyGratuityPage() {
        new TGCheckOptionPage().verifyGratuityPage();
    }

    @Then("User select fixed gratuity option")
    public void userSelectFixedGratuityOption() {
        new TGCheckOptionPage().selectFixedGratuity();
    }

    @Then("User select varying gratuity option")
    public void userSelectVaryingGratuityOption() {
        new TGCheckOptionPage().selectVaryingGratuityOption();
    }

    @And("User click apply button for varying gratuity")
    public void userClickApplyButtonForVaryingGratuity() {
        new TGCheckOptionPage().clickVaryingGratuityApplyButton();
    }

    @And ("^User verify varying gratuity as \"([^\"]*)\"$")
            public void userVerifyVaryingGratuityAs(String value){
        new TGCheckOptionPage().verifyVaryingGratuityAs(value);
            }

    @And ("^User verify fixed gratuity as \"([^\"]*)\"$")
    public void userVerifyFixedGratuityAs(String value){
        new TGCheckOptionPage().verifyVaryingGratuityAs(value);
    }

    @Then("^User verify exclusive tax value as \"([^\"]*)\" for Hot Wings$")
    public void userVerifyExclusiveTaxValueAsForHotWings(String value) {
        new TGMenuItemPage().verifyExclusiveTaxForHorWings(value);
    }


    @And("User enter percentage of varying gratuity")
    public void userEnterPercentageOfVaryingGratuity() {
        new TGCheckOptionPage().enterPercentageOfVarying();
    }

    @And("User click fire coursing option")
    public void userClickFireCoursingOption() {
        new TGCheckOptionPage().selectFireCoursingOption();
    }

    @When ("^I should see the please send all the menu items to kitchen popup$")
    public void iShouldSeeThePleaseSendAllTheMenuItemsToKitchenPopup(){
        new TGCheckOptionPage().shouldSeePleaseSendAlltheMenuItems();
    }

    @When ("^I should see the please order the menu popup$")
    public void iShouldSeeThePleaseOrderTheMenuPopup(){
        new TGCheckOptionPage().shouldSeePleaseOrderTheMenuPopup();
    }

    @And("User select to be prepared order")
    public void userSelectToBePreparedOrder() {
        new TGCheckOptionPage().selectPreparedOrder();

    }

    @And("User verify anything to fire")
    public void userVerifyAnythingToFire() {
        new TGCheckOptionPage().verifyAnythingToFire();
    }

    @And("User select service exempt option")
    public void userSelectServiceExemptOption() {
        new TGCheckOptionPage().selectServiceExempt();
    }


    @Then("User select cash drawer option")
    public void userSelectCashDrawerOption() {
        new TGCheckOptionPage().selectCashDrawer();
    }

    @And("User verify be directed menu item page")
    public void userVerifyBeDirectedMenuItemPage() {
        new TGCheckOptionPage().verifyDirectedMenuItemPage();
    }

    @When("User select Open Item option")
    public void userSelectOpenItemOption() {
        new TGCheckOptionPage().selectOpenItemOption();
    }

    @And("User enter coursing price")
    public void userEnterCoursingPrice() {
        new TGCheckOptionPage().enterCoursingPrice();
    }

    @And("User enter item name")
    public void userEnterItemName() {
        new TGCheckOptionPage().enterCoursingItemName();
    }

    @And("User select coursing tax")
    public void userSelectCoursingTax() {
        new TGCheckOptionPage().selectCoursingTax();
    }

    @And("User click coursing done button")
    public void userClickCoursingDoneButton() {
        new TGCheckOptionPage().clickCoursingDoneButton();
    }

    @When("User click option back button")
    public void userClickOptionBackButton() {
        new TGCheckOptionPage().clickCheckOptionBackButton();
    }

    @Then("User select tax exempt option")
    public void userSelectTaxExemptOption() {
        new TGCheckOptionPage().selectTaxExemptOption();
    }

    @When("User select charge type as amount")
    public void userSelectChargeTypeAsAmount() {
        new TGCheckOptionPage().selectChargeTypeWithAmount();
    }

    @And("User enter discount amount")
    public void userEnterDiscountAmount() {
        new TGCheckOptionPage().enterOpenDiscountAmount();

    }

    @When("User select item discount option tab")
    public void userSelectItemDiscountOptionTab() {
        new TGCheckOptionPage  ().selectItemDiscountOption();
    }

    @Then("User select auto discount option below item discount")
    public void userSelectAutoDiscountOptionBelowItemDiscount() {
        new TGCheckOptionPage  ().selectAutoDiscountBelowItemDiscount();
    }

    @And("User verify removed tax exempt successfully popup")
    public void userVerifyRemovedTaxExemptSuccessfullyPopup() {
        new TGCheckOptionPage  ().verifyRemovedTaxExemptPopup();
    }

    @When("User click Gift Card tab")
    public void userClickGiftCardTab() {
        new TGCheckOptionPage().clickGiftCardOption();
    }

    @Then("User click Tax Exempt on Check Options")
    public void userClickTaxExemptOnCheckOptions() {
        new TGCheckOptionPage().clickTaxExemptOnCheckOptions();
    }

    @And("User select Hold check option")
    public void userSelectHoldCheckOption() {
        new TGCheckOptionPage().selectHoldCheckOption();
    }


    @And("User verify option page")
    public void userVerifyOptionPage() {
        new TGCheckOptionPage().verifyCheckOptionPage();
    }

    @When("User select {string} as course name")
    public void userSelectAsCourseName(String name) throws InterruptedException {
        new TGCheckOptionPage().swipeUntilEntreeCoursingName(name);
    }

    @And("User enter open item item name")
    public void userEnterOpenItemItemName() {
        new TGCheckOptionPage().enterItemNameOfOpenItem();
    }

    @And("User enter open item price")
    public void userEnterOpenItemPrice() {
        new TGCheckOptionPage().enterPriceOfOpenItems();
    }

    @Then("User click open item done button")
    public void userClickOpenItemDoneButton() {
        new TGCheckOptionPage().openItemDoneButton();
    }

    @And("User verify open item for discount")
    public void userVerifyOpenItemForDiscount() {
        new TGCheckOptionPage().verifyAfterTaxWithOpenItem();
    }

    @When("User enter value less then minimum value of gratuity")
    public void userEnterValueLessThenMinimumValueOfGratuity() {
        new TGCheckOptionPage().enterLessValueThenMinimumGratuityVaryingValue();
    }

    @When("User enter value more then maximum value of gratuity")
    public void userEnterValueMoreThenMaximumValueOfGratuity() {
        new TGCheckOptionPage().enterLessValueThenMaximumGratuityVaryingValue();
    }

    @Then("User verify minimum value of gratuity warning popup")
    public void userVerifyMinimumValueOfGratuityWarningPopup() {
        new TGCheckOptionPage().verifyMinMaxGratuityValueWarningPopup();
    }

    @Then("User verify maximum value of gratuity warning popup")
    public void userVerifyMaximumValueOfGratuityWarningPopup() {
        new TGCheckOptionPage().verifyMinMaxGratuityValueWarningPopup();
    }

    @And("User enter open check discount percentage value")
    public void userEnterOpenCheckDiscountPercentageValue() {
        new TGCheckOptionPage().enterOpenCheckDiscountPercentageValue();
    }

    @And("User enter open check discount amount as decimal value")
    public void userEnterOpenCheckDiscountAmountAsDecimalValue() {
        new TGCheckOptionPage().enterOpenCheckDiscountAmountAsDecimalValue();
    }

    @And("User enter open check discount amount as non-decimal value")
    public void userEnterOpenCheckDiscountAmountAsNonDecimalValue() {
        new TGCheckOptionPage().enterOpenCheckDiscountAmountAsNonDecimalValue();
    }

    @When("User swipe until open item with before tax as amount discount option")
    public void userSwipeUntilOpenItemWithBeforeTaxAsAmountDiscountOption() throws Exception {
        new TGCheckOptionPage().swipeUntilOpenItemWithBeforeTaxAsAmountDiscountOption("up");
    }

    @And("User enter coursing done button")
    public void userEnterCoursingDoneButton() {
        new TGCheckOptionPage().enterCoursingDoneButton();
    }

    @And("User select Phone Order order type")
    public void userSelectPhoneOrderOrderType() {
    }

    @And("User enter coursing price as non-decimal value")
    public void userEnterCoursingPriceAsNonDecimalValue() {
        new TGCheckOptionPage().enterCoursingPriceAsNonDecimalValue();
    }

    @And("User select after tax amount with open item coursing tax")
    public void userSelectAfterTaxAmountWithOpenItemCoursingTax() {
        new TGCheckOptionPage().selectAfterTaxAmountWithOpenItemCoursingTax();
    }

    @And("User select before tax amount with open item coursing tax")
    public void userSelectBeforeTaxAmountWithOpenItemCoursingTax() {
        new TGCheckOptionPage().selectBeforeTaxAmountWithOpenItemCoursingTax();
    }

    @And("User enter coursing price as as decimal value")
    public void userEnterCoursingPriceAsAsDecimalValue() {
        new TGCheckOptionPage().enterCoursingPriceAsAsDecimalValue();
    }
    @When("User enter value of varying gratuity")
    public void userEnterValueOfVaryingGratuity() {
        new TGCheckOptionPage().enterValueOfVaryingGratuity();
    }

    @And("User verify warning popup for combination")
    public void userVerifyWarningPopupForCombination() {
        new TGCheckOptionPage().verifyWarningPopupForCombination();
    }

    @And("User enter open item price as decimal")
    public void userEnterOpenItemPriceAsDecimal() {
        new TGCheckOptionPage().enterOpenItemPriceAsDecimal();
    }

    @And("User enter open item price as whole number")
    public void userEnterOpenItemPriceAsWholeNumber() {
        new TGCheckOptionPage().enterOpenItemPriceAsWholeNumber();
    }

    @When("User click Gift Card check option")
    public void userClickGiftCardCheckOption() {
        new TGCheckOptionPage().clickGiftCardCheckOption();
    }

    @Then("User select void reason for gift card")
    public void userSelectVoidReasonForGiftCard() {
        new TGCheckOptionPage().selectVoidReasonForGiftCard();
    }

    @Then("User click Void Item option")
    public void userClickVoidItemOption() {

    }

    @And("User verify be directed to Check Option page")
    public void userVerifyBeDirectedToCheckOptionPage() {
        new TGCheckOptionPage().verifyBeDirectedToCheckOptionPage();
    }

    @And("User select table which will be split in check screen")
    public void userSelectTableWhichWillBeSplitInCheckScreen() {
        new TGCheckOptionPage().selectTable();
    }

    @When("User click save and close in check screen")
    public void userClickSaveAndCloseInCheckScreen() {
        new TGSplitCheckPage().clickSaveAndCloseButton();
    }

    @And ("^I get the next check number after done split check process$")
    public void iGetTheNextCheckNumberAfterDoneSplitCheckProcess(){
        new OrderManagementScreen().getTheNextCheckNumberAfterDoneSplitCheckProcess();
    }
    @Then("User click split by seat button1 in check screen")
    public void userClickSplitBySeatButtonInCheckScreen(int arg0) {
        new TGMenuItemPage().selectSplitBySeatOption1();
    }


}
