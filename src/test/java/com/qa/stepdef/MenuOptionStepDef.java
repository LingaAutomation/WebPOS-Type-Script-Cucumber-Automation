package com.qa.stepdef;

import com.qa.pages.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MenuOptionStepDef {


    @And("^I click menu item as \"([^\"]*)\" to see Menu option screen$")
    public void iClickMenuItemAsToSeeMenuOptionScreen(String MenuItem) throws InterruptedException {
        new MenuOptionScreen().pressMenuItems(MenuItem);
    }

    @And("^I click open item as \"([^\"]*)\" to see Menu option screen$")
    public void iClickOpenItemAsToSeeMenuOptionScreen(String MenuItem){
        new MenuOptionScreen().pressOpenItems(MenuItem);
    }
    @And ("^I click Fire to send menu item to kitchen$")
    public void iClickFireToSendMenuItemToKitchen(){
        new MenuOptionScreen().pressFire();
    }

    @And ("^I click Repeat on menu option$")
    public void iClickRepeatOnMenuOption(){
        new MenuOptionScreen().pressRepeatMenuOption();
    }

    @Then("^I should see Repeated menu item as \"([^\"]*)\"$")
    public void iShouldSeeRepeatedMenuItemAs(String MenuItem) throws InterruptedException {
        new MenuOptionScreen().verifyRepeatedMenuItem(MenuItem);
    }

    @And ("^I click Quantity on menu option$")
    public void iClickQuantityOnMenuOption(){
        new MenuOptionScreen().pressQuantityBtn();
    }

    @And ("^I click \"([^\"]*)\"$")
    public void iClick(String number) throws InterruptedException {
        new MenuOptionScreen().pressQuantityNumber(number);
    }

    @Then ("^I should see \"([^\"]*)\" is Increased$")
    public void iShouldSeeIsIncreased(String number){
        new MenuOptionScreen().verifyQuantityNumber(number);
    }

    @And ("^I click Attach on menu option$")
    public void iClickAttachOnMenuOption(){
        new MenuOptionScreen().pressAttachBtn();
    }

    @And ("^I click discount on menu option$")
    public void iClickDiscountOnMenuOption(){
        new MenuOptionScreen().pressDiscountBtn();
    }

//    @And ("^I click discount in discount window$")
//    public void iClickDiscountInDiscountWindow(){
//        new MenuOptionScreen().clickDiscountInDiscountWindow();
//    }
//    @Then ("^I verify discount is applied or not in order screen$")
//    public void iVerifyDiscountIsAppliedOrNotInOrderScreen(){
//
//    }

    @And ("^I click discount as \"([^\"]*)\" in discount window$")
    public void iClickDiscountInDiscountWindow(String name){
        new MenuOptionScreen().clickDiscountInDiscountWindow(name);
    }

    @Then("^I verify Item discount as \"([^\"]*)\" is applied or not in order screen")
    public void iVerifyItemDiscountIsAppliedOrNotInOrderScreen(String discount){
        new MenuOptionScreen().verifyItemDiscountIsApplied(discount);
    }

    @Then("^I verify discount as \"([^\"]*)\" is applied or not in order screen")
    public void iVerifyDiscountIsAppliedOrNotInOrderScreen(String discount){
        new MenuOptionScreen().verifyDiscountIsApplied(discount);
    }

    @Then ("^I verify check discount is applied or not in order screen$")
    public void iVerifyCheckDiscountIsAppliedOrNotInOrderScreen(){
        new CheckOptionsScreen().verifyCheckDiscountIsApplied();
    }

    @Then ("^I verify open check discount is applied or not in order screen$")
    public void iVerifyOpenCheckDiscountIsAppliedOrNotInOrderScreen(){
        new CheckOptionsScreen().verifyOpenCheckDiscountIsApplied();
    }

    @Then ("^I should see Add Notes popup$")
    public void iShouldSeeAddNotesPopup(){
        Assert.assertEquals(new MenuOptionScreen().verifyAddNotesScreen(),"Add Notes");
    }
    @And ("^I click Add notes reason as \"([^\"]*)\"$")
    public void iClickAddNotesReasonAs(String Reasons){
        new MenuOptionScreen().pressAddNotesReason(Reasons);
    }
    @Then ("^I should see reason as \"([^\"]*)\" on the Order screen$")
    public void iShouldSeeReasonAsOnTheOrderScreen(String Reasons){
        new MenuOptionScreen().verifyAddNotesAddOnOrderScreen(Reasons);
    }
    @And ("^I click Togo on menu option$")
    public void iClickTogoOnMenuOption(){
        new MenuOptionScreen().pressTogoBtn();
    }
    @Then ("^I should see menu item with Togo Logo$")
    public void iShouldSeeMenuItemWithTogoLogo() throws InterruptedException {
        new OrderManagementScreen().togoIcon();
    }

    @Then ("^I should not see menu item with Togo Logo$")
    public void iShouldNotSeeMenuItemWithTogoLogo() throws InterruptedException {
        new OrderManagementScreen().togoIcon1();
    }
    @And ("^I click Open Discount on menu option$")
    public void iClickOpenDiscountOnMenuOption(){
        new MenuOptionScreen().pressOpenDiscount();
    }
    @Then ("^I should see Open discount Screen$")
    public void iShouldSeeOpenDiscountScreen(){
        new MenuOptionScreen().getOpenDiscountScreen();
    }
    @And ("^I pass the amount and reason on Open discount$")
    public void iPassTheAmountAndReasonOnOpenDiscount(){
        new MenuOptionScreen().passAmountAndReason();
    }

    @And ("^I pass the amount on open discount for open item discount safety percentage whole value as 20 for \"([^\"]*)\"$")
    public void iPassTheAmountOnOpenDiscountForOpenItemDiscountSafetyPercentageWholeValueAs20For(String discount) throws InterruptedException {
        new MenuOptionScreen().passAmountAndReasonMenuOptionForSafetyPercentageValue(discount);
    }

    @And ("^I pass the amount on open discount for open item discount safety percentage whole value as 20 for1 \"([^\"]*)\"$")
    public void iPassTheAmountOnOpenDiscountForOpenItemDiscountSafetyPercentageWholeValueAs20For1(String discount) throws InterruptedException {
        new MenuOptionScreen().passAmountAndReasonMenuOptionForSafetyPercentageValue1(discount);
    }

    @And ("^I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for \"([^\"]*)\"$")
    public void iPassTheAmountOnOpenDiscountForOpenItemDiscountSafetyPercentageDecimalValueAsFor(String discount) throws InterruptedException {
        new MenuOptionScreen().passAmountAndReasonMenuOptionForSafetyPercentageDecimalValue(discount);
    }

    @And ("^I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for1 \"([^\"]*)\"$")
    public void iPassTheAmountOnOpenDiscountForOpenItemDiscountSafetyPercentageDecimalValueAsFor1(String discount) throws InterruptedException {
        new MenuOptionScreen().passAmountAndReasonMenuOptionForSafetyPercentageDecimalValue1(discount);
    }

    @And ("^I pass the amount on open discount for open item discount as discount Percentage for \"([^\"]*)\"$")
    public void iPassTheAmountOnOPenDiscountForOpenItemDiscountAsDiscountPercentageFor(String discount){
        new MenuOptionScreen().passAmountAndReasonMenuOptionAsPercentage(discount);
    }

    @And ("^I pass the amount on open discount for open item discount as discount Percentage1 for \"([^\"]*)\"$")
    public void iPassTheAmountOnOPenDiscountForOpenItemDiscountAsDiscountPercentage1For(String discount){
        new MenuOptionScreen().passAmountAndReasonMenuOptionAsPercentage1(discount);
    }

    @Then ("^I should see discount applied on order screen$")
    public void iShouldSeeDiscountAppliedOnOrderScreen(){
        //  Assert.assertEquals(new MenuOptionScreen().verifyDiscountAppliedOnOrderScreen(),"open Item Discount"); // Staging
        Assert.assertEquals(new MenuOptionScreen().verifyDiscountAppliedOnOrderScreen(),"Open-Item Discount");//Production
    }

    @And ("^I click Open Modifier on menu option$")
    public void iClickOpenModifierOnMenuOption(){
        new MenuOptionScreen().pressOpenModifierBtn();
    }

    @And ("^I click change coursing on menu option$")
    public void iClickChangeCoursingOnMenuOption(){
        new MenuOptionScreen().pressChangeCoursingBtn();
    }
    @Then ("^I should see Open modifier Screen$")
    public void iShouldSeeOpenModifierScreen(){
        new MenuOptionScreen().verifyOpenModifiersScreen();
    }

    @Then ("^I should see coursing name as \"([^\"]*)\"$")
    public void iShouldSeeCoursingNameAs(String coursing){
        new MenuOptionScreen().verifyChangeCoursing(coursing);
    }
    @And ("^I pass the Name as \"([^\"]*)\" and price on Open Modifier$")
    public void iPassTheNameAndPriceOnOpenModifier(String Modifiers){
        new MenuOptionScreen().passNamePriceApplyTax(Modifiers);
    }
    @Then ("^I should see open modifier as \"([^\"]*)\" added on open modifiers screen$")
    public void iShouldSeeOpenModifierAsAddedOnOpenModifiersScreen(String modifier){
        new MenuOptionScreen().getModifierAddedOnOpenModifier(modifier);
    }
    @Then ("^I should see modifier as \"([^\"]*)\" applied on order screen$")
    public void iShouldSeeModifierAsAppliedOnOrderScreen(String Modifiers){
        new MenuOptionScreen().verifyModifyAddedOnOrderList(Modifiers);
    }

    @Then ("^I should not see modifier as \"([^\"]*)\" applied on order screen$")
    public void iShouldNotSeeModifierAsAppliedOnOrderScreen(String Modifiers){
        new MenuOptionScreen().verifyModifyAddedOnOrderList1(Modifiers);
    }

    @And ("^I swipe the modifiers for Delete in open modifiers screen$")
    public void iSwipeTheModifiersForDeleteInOpenModifiersScreen() throws InterruptedException {
        new MenuOptionScreen().swipeModifiersForDeleteInOpenModifyScreen();
    }
    @And ("^I click Done button on the Open modifiers screen$")
    public void iClickDoneButtonOnTheOpenModifiersScreen(){
        new MenuOptionScreen().clickDone();
    }
    @And ("^I swipe the modifiers for Delete in order screen$")
    public void iSwipeTheModifiersForDeleteInOrderScreen() throws InterruptedException {
        new MenuOptionScreen().swipeModifierForDeleteInOrderScreen();
    }
    @Then ("^I should see menu with Upcharge amount on order list as \"([^\"]*)\"$")
    public void iShouldSeeMenuWithUpchargeAmountOnOrderListAs(String price){
        new MenuOptionScreen().getAmount(price);

    }
    @And ("^I click sync button on the Order screen$")
    public void iClickSyncButtonOnTheOrderScreen() throws InterruptedException {
        new MenuOptionScreen().pressSyncBtn();
    }
    @Then ("^I should see Please close the sale to sync the data popup$")
    public void iShouldSeePleaseCloseTheSaleToSyncTheDataPopup(){
        Assert.assertEquals(new MenuOptionScreen().getPopupTxt(),"Please close the sale to sync the data");
    }
    @Then ("^I should see open item screen$")
    public void iShouldSeeOpenItemScreen(){
        Assert.assertEquals(new MenuOptionScreen().verifyOpenItemScreen(),"Open Item");
    }

    @And ("^I click void item on Menu option$")
    public void iClickVoidItemOnMenuOption(){
        new MenuOptionScreen().pressVoidBtnMenuOperation();
    }
    @And ("^I click Menu item on order screen$")
    public void iClickMenuItemOnOrderScreen(){
        new OrderTypeWindow().clickMenuItem();
    }

    @Then ("^I should see discount exceeds the safety limit popup$")
    public void iShouldSeeDiscountExceedsTheSafetyLimitPopup(){
        new CheckOptionsScreen().verifyDiscountExceedLimitPopup();
    }

//    @And("I should see Paid amount exceeding the sale amount popup")
//    public void iShouldSeePaidAmountExceedingTheSaleAmountPopup() {
//        new CheckOptions().verifyPaidAmountExceeds1();
//        Assert.assertEquals(new CheckOptions().getPaidAmountExceedsTxt1(), "Paid Amount exceeding Sale Amount");
//
//    }


}
