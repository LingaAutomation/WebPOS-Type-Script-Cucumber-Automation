package com.qa.stepdef;

import com.qa.pages.CheckOptionsScreen;
import com.qa.pages.MenuOptionScreen;
import com.qa.pages.OrderManagementScreen;
import com.qa.pages.OrderTypeWindow;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MenuOptionStepDef {

    public  WebDriver driver = TestUtils.driver;;


    @And("^I click menu item as \"([^\"]*)\" to see Menu option screen$")
    public void iClickMenuItemAsToSeeMenuOptionScreen(String MenuItem){
        new MenuOptionScreen(driver).pressMenuItems(MenuItem);
    }

    @And("^I click open item as \"([^\"]*)\" to see Menu option screen$")
    public void iClickOpenItemAsToSeeMenuOptionScreen(String MenuItem){
        new MenuOptionScreen(driver).pressOpenItems(MenuItem);
    }
    @And ("^I click Fire to send menu item to kitchen$")
    public void iClickFireToSendMenuItemToKitchen(){
        new MenuOptionScreen(driver).pressFire();
    }

    @And ("^I click Repeat on menu option$")
    public void iClickRepeatOnMenuOption(){
        new MenuOptionScreen(driver).pressRepeatMenuOption();
    }

    @Then("^I should see Repeated menu item as \"([^\"]*)\"$")
    public void iShouldSeeRepeatedMenuItemAs(String MenuItem){
        new MenuOptionScreen(driver).verifyRepeatedMenuItem(MenuItem);
    }

    @And ("^I click Quantity on menu option$")
    public void iClickQuantityOnMenuOption(){
        new MenuOptionScreen(driver).pressQuantityBtn();
    }

    @And ("^I click \"([^\"]*)\"$")
    public void iClick(String number){
        new MenuOptionScreen(driver).pressQuantityNumber(number);
    }

    @Then ("^I should see \"([^\"]*)\" is Increased$")
    public void iShouldSeeIsIncreased(String number){
        new MenuOptionScreen(driver).verifyQuantityNumber1(number);
    }

    @And ("^I click Attach on menu option$")
    public void iClickAttachOnMenuOption(){
        new MenuOptionScreen(driver).pressAttachBtn();
    }

    @And ("^I click discount on menu option$")
    public void iClickDiscountOnMenuOption(){
        new MenuOptionScreen(driver).pressDiscountBtn();
    }

//    @And ("^I click discount in discount window$")
//    public void iClickDiscountInDiscountWindow(){
//        new MenuOptionScreen(driver).clickDiscountInDiscountWindow();
//    }
//    @Then ("^I verify discount is applied or not in order screen$")
//    public void iVerifyDiscountIsAppliedOrNotInOrderScreen(){
//
//    }

    @And ("^I click discount as \"([^\"]*)\" in discount window$")
    public void iClickDiscountInDiscountWindow(String name){
        new MenuOptionScreen(driver).clickDiscountInDiscountWindow(name);
    }

    @Then("^I verify Item discount as \"([^\"]*)\" is applied or not in order screen")
    public void iVerifyItemDiscountIsAppliedOrNotInOrderScreen(String discount){
        new MenuOptionScreen(driver).verifyItemDiscountIsApplied(discount);
    }

    @Then("^I verify discount as \"([^\"]*)\" is applied or not in order screen")
    public void iVerifyDiscountIsAppliedOrNotInOrderScreen(String discount){
        new MenuOptionScreen(driver).verifyDiscountIsApplied(discount);
    }

    @Then ("^I verify check discount is applied or not in order screen$")
    public void iVerifyCheckDiscountIsAppliedOrNotInOrderScreen(){
        new CheckOptionsScreen(driver).verifyCheckDiscountIsApplied();
    }

    @Then ("^I verify open check discount is applied or not in order screen$")
    public void iVerifyOpenCheckDiscountIsAppliedOrNotInOrderScreen(){
        new CheckOptionsScreen(driver).verifyOpenCheckDiscountIsApplied();
    }

    @Then ("^I should see Add Notes popup$")
    public void iShouldSeeAddNotesPopup(){
        Assert.assertEquals(new MenuOptionScreen(driver).verifyAddNotesScreen(),"Add Notes");
    }
    @And ("^I click Add notes reason as \"([^\"]*)\"$")
    public void iClickAddNotesReasonAs(String Reasons){
        new MenuOptionScreen(driver).pressAddNotesReason(Reasons);
    }
    @Then ("^I should see reason as \"([^\"]*)\" on the Order screen$")
    public void iShouldSeeReasonAsOnTheOrderScreen(String Reasons){
        new MenuOptionScreen(driver).verifyAddNotesAddOnOrderScreen(Reasons);
    }
    @And ("^I click Togo on menu option$")
    public void iClickTogoOnMenuOption(){
        new MenuOptionScreen(driver).pressTogoBtn();
    }
    @Then ("^I should see menu item with Togo Logo$")
    public void iShouldSeeMenuItemWithTogoLogo(){
        new OrderManagementScreen(driver).verifyTickIcon();
    }
    @And ("^I click Open Discount on menu option$")
    public void iClickOpenDiscountOnMenuOption(){
        new MenuOptionScreen(driver).pressOpenDiscount();
    }
    @Then ("^I should see Open discount Screen$")
    public void iShouldSeeOpenDiscountScreen(){
        new MenuOptionScreen(driver).getOpenDiscountScreen();
    }
    @And ("^I pass the amount and reason on Open discount$")
    public void iPassTheAmountAndReasonOnOpenDiscount(){
        new MenuOptionScreen(driver).passAmountAndReason();
    }

    @And ("^I pass the amount on open discount for open item discount safety percentage whole value as 20 for \"([^\"]*)\"$")
    public void iPassTheAmountOnOpenDiscountForOpenItemDiscountSafetyPercentageWholeValueAs20For(String discount){
        new MenuOptionScreen(driver).passAmountAndReasonMenuOptionForSafetyPercentageValue(discount);
    }

    @And ("^I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for \"([^\"]*)\"$")
    public void iPassTheAmountOnOpenDiscountForOpenItemDiscountSafetyPercentageDecimalValueAsFor(String discount){
        new MenuOptionScreen(driver).passAmountAndReasonMenuOptionForSafetyPercentageDecimalValue(discount);
    }

    @And ("^I pass the amount on open discount for open item discount as discount Percentage for \"([^\"]*)\"$")
    public void iPassTheAmountOnOPenDiscountForOpenItemDiscountAsDiscountPercentageFor(String discount){
        new MenuOptionScreen(driver).passAmountAndReasonMenuOptionAsPercentage(discount);
    }

    @And ("^I pass the amount on open discount for open item discount as discount Percentage1 for \"([^\"]*)\"$")
    public void iPassTheAmountOnOPenDiscountForOpenItemDiscountAsDiscountPercentage1For(String discount){
        new MenuOptionScreen(driver).passAmountAndReasonMenuOptionAsPercentage1(discount);
    }

    @Then ("^I should see discount applied on order screen$")
    public void iShouldSeeDiscountAppliedOnOrderScreen(){
        //  Assert.assertEquals(new MenuOptionScreen(driver).verifyDiscountAppliedOnOrderScreen(),"open Item Discount"); // Staging
        Assert.assertEquals(new MenuOptionScreen(driver).verifyDiscountAppliedOnOrderScreen(),"Open Item Discount");//Production
    }

    @And ("^I click Open Modifier on menu option$")
    public void iClickOpenModifierOnMenuOption(){
        new MenuOptionScreen(driver).pressOpenModifierBtn();
    }

    @And ("^I click change coursing on menu option$")
    public void iClickChangeCoursingOnMenuOption(){
        new MenuOptionScreen(driver).pressChangeCoursingBtn();
    }
    @Then ("^I should see Open modifier Screen$")
    public void iShouldSeeOpenModifierScreen(){
        new MenuOptionScreen(driver).verifyOpenModifiersScreen();
    }

    @Then ("^I should see coursing name as \"([^\"]*)\"$")
    public void iShouldSeeCoursingNameAs(String coursing){
        new MenuOptionScreen(driver).verifyChangeCoursing(coursing);
    }
    @And ("^I pass the Name as \"([^\"]*)\" and price on Open Modifier$")
    public void iPassTheNameAndPriceOnOpenModifier(String Modifiers){
        new MenuOptionScreen(driver).passNamePriceApplyTax(Modifiers);
    }
    @Then ("^I should see open modifier as \"([^\"]*)\" added on open modifiers screen$")
    public void iShouldSeeOpenModifierAsAddedOnOpenModifiersScreen(String modifier){
        new MenuOptionScreen(driver).getModifierAddedOnOpenModifier(modifier);
    }
    @Then ("^I should see modifier as \"([^\"]*)\" applied on order screen$")
    public void iShouldSeeModifierAsAppliedOnOrderScreen(String Modifiers){
        new MenuOptionScreen(driver).verifyModifyAddedOnOrderList(Modifiers);
    }
    @And ("^I swipe the modifiers for Delete in open modifiers screen$")
    public void iSwipeTheModifiersForDeleteInOpenModifiersScreen() throws InterruptedException {
        new MenuOptionScreen(driver).swipeModifiersForDeleteInOpenModifyScreen();
    }
    @And ("^I click Done button on the Open modifiers screen$")
    public void iClickDoneButtonOnTheOpenModifiersScreen(){
        new MenuOptionScreen(driver).clickDone();
    }
    @And ("^I swipe the modifiers for Delete in order screen$")
    public void iSwipeTheModifiersForDeleteInOrderScreen() throws InterruptedException {
        new MenuOptionScreen(driver).swipeModifierForDeleteInOrderScreen();
    }
    @Then ("^I should see menu with Upcharge amount on order list as \"([^\"]*)\"$")
    public void iShouldSeeMenuWithUpchargeAmountOnOrderListAs(String price){
        new MenuOptionScreen(driver).getAmount(price);

    }
    @And ("^I click sync button on the Order screen$")
    public void iClickSyncButtonOnTheOrderScreen() throws InterruptedException {
        new MenuOptionScreen(driver).pressSyncBtn();
    }
    @Then ("^I should see Please close the sale to sync the data popup$")
    public void iShouldSeePleaseCloseTheSaleToSyncTheDataPopup(){
        Assert.assertEquals(new MenuOptionScreen(driver).getPopupTxt(),"Please close the sale to sync the data");
    }
    @Then ("^I should see open item screen$")
    public void iShouldSeeOpenItemScreen(){
        Assert.assertEquals(new MenuOptionScreen(driver).verifyOpenItemScreen(),"Open Item");
    }

    @And ("^I click void item on Menu option$")
    public void iClickVoidItemOnMenuOption(){
        new MenuOptionScreen(driver).pressVoidBtnMenuOperation();
    }
    @And ("^I click Menu item on order screen$")
    public void iClickMenuItemOnOrderScreen(){
        new OrderTypeWindow(driver).clickMenuItem();
    }

    @Then ("^I should see discount exceeds the safety limit popup$")
    public void iShouldSeeDiscountExceedsTheSafetyLimitPopup(){
        new CheckOptionsScreen(driver).verifyDiscountExceedLimitPopup();
    }
}
