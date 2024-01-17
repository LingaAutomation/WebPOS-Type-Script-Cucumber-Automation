package com.qa.stepdef;

import com.qa.pages.*;

import io.cucumber.java.da.Men;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class TGMenuItemStepDef {

    @When("User click popup menu")
    public void userClickPopupMenu() {
        new TGMenuItemPage().clickPopupMenu();
    }

    @And("User verify first category option")
    public void userVerifyFirstCategoryOption() {
        new TGMenuItemPage().verifyCategoryWithPopupMenu();
    }

    @When("User click add seat button")
    public void userClickAddSeatButton() {
        new TGMenuItemPage().clickAddSeatButton();
    }

    @Then("User verify new seat")
    public void userVerifyNewSeat() {
        new TGMenuItemPage().verifyAddedSeat();
    }

    @When("User click customer button")
    public void userClickCustomerButton() {
        new TGMenuItemPage().clickCustomerButton();
    }

    @Then("User click add customer button")
    public void userClickAddCustomerButton() {
        new TGMenuItemPage().clickCustomerButton();
    }

    @Then("User click edit button")
    public void userClickEditButton() {
        new TGMenuItemPage().clickDeleteSeatButton();
    }


    @And("User click done button")
    public void userClickDoneButton() {
        new TGMenuItemPage().clickEditDoneButton();
    }

    @And("User click done button1")
    public void userClickDoneButton1() {
        new TGMenuItemPage().clickEditDoneButton1();
    }

//    @And("User verify current seat")
//    public void userVerifyCurrentSeat() {
//
//    }

    @Given("User select DineIn mode")
    public void userSelectDineInMode() {
        new TGMenuItemPage().selectDineInOrderType();
    }

    @Then("User click finish button")
    public void userClickFinishButton() {
        new TGMenuItemPage().clickFinishButton();
    }


    @Then("User click split button on menu item page")
    public void userClickSplitButtonOnMenuItemPage() {
        new TGMenuItemPage().clickSplitButtonOnMenuItemPage();

    }

    @And("User click split check option on menu item")
    public void userClickSplitCheckOptionOnMenuItem() {
        new TGMenuItemPage().clickSplitCheckOnMenuItemPage();
    }

    @And("User click split by seat option on menu item page")
    public void userClickSplitBySeatOptionOnMenuItemPage() {
        new TGMenuItemPage().clickSplitBySeatOptionOnMenuItemPage();
    }

    @Then("User click payment button")
    public void userClickPaymentButton() {
        new TGMenuItemPage().clickPaymentButtonOnMenuItemPage();
    }

    @When("User select any menu item")
    public void userSelectAnyMenuItem() {
        new TGMenuItemPage().selectMenuItem();

    }

    @Then("User click void button")
    public void userClickVoidButton() {
        new TGMenuItemPage().clickVoidButton();
    }

    @And("User close void info popup")
    public void userCloseVoidInfoPopup() {
        new TGMenuItemPage().closeVoidPopup();
    }

    @And("User verify voided menu item")
    public void userVerifyVoidedMenuItem() {
        new TGMenuItemPage().verifyVoidItem();
    }

    @Then("User click Cash Tab")
    public void userClickCashTab() {
        new TGMenuItemPage().clickCashButton();
    }

    @And("User select first seat on menu item page")
    public void userSelectFirstSeatOnMenuItemPage() {
        new TGMenuItemPage().selectFirstSeat();
    }

    @Given("User select QSR mode on menu item page")
    public void userSelectQSRModeOnMenuItemPage() {
        new TGMenuItemPage().selectQsrOption();

    }

    @And("User click Discount tab on menu item page")
    public void userClickDiscountTabOnMenuItemPage() {
        new TGMenuItemPage().clickDiscountTab();
    }

    @And("User verify open check discount")
    public void userVerifyOpenCheckDiscount() {
        new TGMenuItemPage().verifyOpenCheckDiscountAmount();
    }

    @And("User verify exit button")
    public void userVerifyExitButton() {
        new TGMenuItemPage().verifyMenuItemPageWithEntree();
    }

    @Then("User verify has no any order")
    public void userVerifyHasNoAnyOrder() {
        new TGMenuItemPage().emptyCheckPopup();
    }

    @When("User select second seat on menu item page")
    public void userSelectSecondSeatOnMenuItemPage() {
        new TGMenuItemPage().selectSecondSeat();
    }

    @When("User select menu item with modifier")
    public void userSelectMenuItemWithModifier() {
        new TGMenuItemPage().selectMenuItemHasModifier();
    }

    @And("User select first modifier")
    public void userSelectFirstModifier() {
        new TGMenuItemPage().selectFirstModifier();
    }

    @Then("User click modify button")
    public void userClickModifyButton() {
        new TGMenuItemPage().clickModifyButton();
    }

    @And("User select first menu item with modifier")
    public void userSelectFirstMenuItemWithModifier() {
        new TGMenuItemPage().selectFirstOrderWithModifier();
    }


    @Then("User verify selected modifier on menu item page")
    public void userVerifySelectedModifierOnMenuItemPage() {
        new TGMenuItemPage().verifyAddedModifier();

    }

    @And("User add modifier maximum count")
    public void userAddModifierMaximumCount() {
        new TGMenuItemPage().addMaximumCountModifier();
    }

    @And("User verify maximum count popup")
    public void userVerifyMaximumCountPopup() {
        new TGMenuItemPage().verifyMaximumCount();
    }

    @And("User click modifier done button")
    public void userClickModifierDoneButton() {
        new TGMenuItemPage().modifierDoneButton();
    }

    @And("User verify ordered menu item modifier popup")
    public void userVerifyOrderedMenuItemModifierPopup() {
        new TGMenuItemPage().orderedAfterModifierPopup();
    }

    @And("User click order button")
    public void userClickOrderButton() {
        new TGMenuItemPage().clickOrderButton();

    }

    @And("User verify fixed gratuity")
    public void userVerifyFixedGratuity() {
        new TGMenuItemPage().verifyFixedGratuity();
    }

    @And("User verify varying gratuity")
    public void userVerifyVaryingGratuity() {
        new TGMenuItemPage().verifyVaryingGratuity();
    }

    @And("User verify deleted gratuity amount")
    public void userVerifyDeletedGratuityAmount() {
        new TGMenuItemPage().verifyDeletedGratuity();

    }

    @Then("User verify service exempt amount")
    public void userVerifyServiceExemptAmount() {
        new TGMenuItemPage().verifyServiceCharge();
    }

    @And("User verify deleted service charge")
    public void userVerifyDeletedServiceCharge() {
        new TGMenuItemPage().verifyDeletedServiceCharge();
    }

    @Then("User select Search Item option")
    public void userSelectSearchItemOption() {
        new TGMenuItemPage().selectSearchItemOption();
    }

    @When("User enter searched menu item not in the menu")
    public void userEnterSearchedMenuItemNotInTheMenu() {
        new TGMenuItemPage().NotSearchedMenuItem();
    }

    @When("User enter searched menu item")
    public void userEnterSearchedMenuItem() {
        new TGMenuItemPage().searchedMenuItem();
    }

    @Then("User verify searched menu item")
    public void userVerifySearchedMenuItem() {
        new TGMenuItemPage().verifiedSearchedMenuItem();
    }

    @Then("User verify no searched menu item")
    public void userVerifyNoSearchedMenuItem() {
        new TGMenuItemPage().verifiedSearchedNoMenuItem();
    }

    @When("User select upcharge menu item")
    public void userSelectUpchargeMenuItem() {
        new TGMenuItemPage().selectUpchargeMenuItem();
    }

    @Then("User take an order with upcharge menu item")
    public void userTakeAnOrderWithUpchargeMenuItem() {
        new TGMenuItemPage().selectOrderTab();
    }

    @And("User verify upcharge menu item")
    public void userVerifyUpchargeMenuItem() {
        new TGMenuItemPage().verifyUpchargeMenuItem();
    }

    @When("User select upcharge menu item with modifier")
    public void userSelectUpchargeMenuItemWithModifier() {
        new TGMenuItemPage().selectUpchargeMenuItemWithModifier();
    }

    @Then("User take an order upcharge menu item with modifier")
    public void userTakeAnOrderUpchargeMenuItemWithModifier() {
        new TGMenuItemPage().selectOrderTab();
    }

    @And("User verify upcharge menu item with modifier")
    public void userVerifyUpchargeMenuItemWithModifier() {
        new TGMenuItemPage().verifyUpchargeMenuItemWithModifier();
    }


    @And("User select last closed order")
    public void userSelectLastClosedOrder() {
        new TGMenuItemPage().selectLastClosedOrder();
    }

    @When("User click add new customer icon")
    public void userClickAddNewCustomerIcon() {
        new TGMenuItemPage().addNewCustomerIcon();
    }

    @Then("User select added customer on menu item page")
    public void userSelectAddedCustomerOnMenuItemPage() {
        new TGMenuItemPage().clickSelectedCustomer();
    }

    @When("USer verify customer name")
    public void userVerifyCustomerName() {
        new TGMenuItemPage().verifyAddedCustomer();
    }

    @When("User click Till Management icon")
    public void userClickTillManagementIcon() {
        new TGMenuItemPage().clickTillManagementButton();
    }

    @When("User click setting icon")
    public void userClickSettingIcon() {
        new TGMenuItemPage().clickSettingButton();
    }

    @Then("User verify setting options")
    public void userVerifySettingOptions() {
        new TGMenuItemPage().verifySettingOptions();
    }

    @When("User click sync icon")
    public void userClickSyncIcon() {
        new TGMenuItemPage().clickSyncIcon();
    }

    @Then("User verify sync info")
    public void userVerifySyncInfo() {
        new TGMenuItemPage().verifySyncInfo();
    }

    @When("USer click log off button")
    public void userClickLogOffButton() {
        new TGMenuItemPage().clickLogOffButton();
    }


    @And("User verify free item")
    public void userVerifyFreeItem() {
        new TGMenuItemPage().verifyFreeItem();
    }

    @Then("User verify open item")
    public void userVerifyOpenItem() {
        new TGMenuItemPage().verifyOpenItem();
    }

    @Then("User verify total amount with tax")
    public void userVerifyTotalAmountWithTax() {
        new TGMenuItemPage().verifyTotalAmountWithTax();
    }


    @And("User verify total amount with tax exempt")
    public void userVerifyTotalAmountWithTaxExempt() {
        new TGMenuItemPage().verifyTotalAmountWithoutTaxExempt();
    }

    @And("User verify applied check based amount discount")
    public void userVerifyAppliedCheckBasedAmountDiscount() {
        new TGMenuItemPage().verifyCheckBasedAmountDiscountType();
    }

    @And("User verify applied check based percentage discount")
    public void userVerifyAppliedCheckBasedPercentageDiscount() {
        new TGMenuItemPage().verifyCheckBasedPercentageDiscountType();
    }

    @And("User verify applied check based free item discount")
    public void userVerifyAppliedCheckBasedFreeItemDiscount() {
        new TGMenuItemPage().verifyCheckBasedFreeOptionDiscount();
    }

    @And("User verify applied check based set price discount")
    public void userVerifyAppliedCheckBasedSetPriceDiscount() {
        new TGMenuItemPage().verifyCheckBasedSetPriceDiscount();
    }

    @And("User verify applied item based amount discount")
    public void userVerifyAppliedItemBasedAmountDiscount() {
        new TGMenuItemPage().verifyItemBasedAmountDiscountType();
    }

    @And("User verify applied item based percentage discount")
    public void userVerifyAppliedItemBasedPercentageDiscount() {
        new TGMenuItemPage().verifyItemBasedPercentageDiscountType();
    }

    @And("User verify applied item based free item discount")
    public void userVerifyAppliedItemBasedFreeItemDiscount() {
        new TGMenuItemPage().verifyItemBasedFreeOptionDiscountType();
    }

    @Then("User verify auto discount amount")
    public void userVerifyAutoDiscountAmount() {
        new TGMenuItemPage().verifyAutoDiscount();
    }

    @When("User select menu item with auto discount")
    public void userSelectMenuItemWithAutoDiscount() {
        new TGMenuItemPage().selectAutoDiscountMenuItem();
    }

    @Then("User verify added new seat")
    public void userVerifyAddedNewSeat() {
        new TGMenuItemPage().verifyAddedNewSeat();
    }

    @When("User select last added seat")
    public void userSelectLastAddedSeat() {
        new TGMenuItemPage().verifyAddedNewSeat();
    }

    @And("User down arrow icon")
    public void userDownArrowIcon() {
        new TGMenuItemPage().clickDownArrowIcon();
    }

    @Then("User select edit seat button")
    public void userSelectEditSeatButton() {
        new TGMenuItemPage().seatEditButton();
    }

    @And("User delete selected seat")
    public void userDeleteSelectedSeat() {
        new TGMenuItemPage().selectToBeDeletedSeat();
    }

    @When("User click up arrow icon")
    public void userClickUpArrowIcon() {
        new TGMenuItemPage().clickUpArrowIcon();
    }

    @Then("User verify deleted seat")
    public void userVerifyDeletedSeat() {
        new TGMenuItemPage().verifyDeletedSeat();
    }

    @When("User click add new seat button on menu item")
    public void userClickAddNewSeatButtonOnMenuItem() {
        new TGMenuItemPage().clickAddSeatButtonOnMenuItemPage();
    }

    @And("User click done button for delete seat")
    public void userClickDoneButtonForDeleteSeat() {
        new TGMenuItemPage().clickDoneButtonForDelete();
    }

    @Then("User verify added inclusive tax rate")
    public void userVerifyAddedInclusiveTaxRate() {
        new TGMenuItemPage().verifyItemBasedInclusiveTax();
    }

    @Given("User select BarTab mode on menu item page")
    public void userSelectBarTabModeOnMenuItemPage() {
        new TGMenuItemPage().clickQsrOption();
        new TGMenuItemPage().selectBarTabOption();
    }

    @Then("User verify added exclusive tax rate")
    public void userVerifyAddedExclusiveTaxRate() {
        new TGMenuItemPage().verifyItemBasedExclusiveTax();
    }

    @Then("User verify added quantity tax rate")
    public void userVerifyAddedQuantityTaxRate() {
        new TGMenuItemPage().verifyItemBasedQuantityTax();
    }

    @Given("User select Delivery mode on menu item page")
    public void userSelectDeliveryModeOnMenuItemPage() {
        new TGMenuItemPage().clickQsrOption();
        new TGMenuItemPage().selectDeliveryOption();
    }

    @Then("User verify new customer")
    public void userVerifyNewCustomer() {
        new TGMenuItemPage().verifyNewlyAddedCustomer();
    }

    @Then("User click customer remove button")
    public void userClickCustomerRemoveButton() {
        new TGMenuItemPage().clickCustomerRemoveButton();
    }

//    @And("I enter an existing customer's name {string}")
//    public void ıEnterAnExistingCustomerSName(String arg0) {
//    }

//    @And("I select the customer")
//    public void ıSelectTheCustomer() {
//    }

//    @When("I click the Save button")
//    public void ıClickTheSaveButton() {
//    }

//    @And("I select search")
//    public void ıSelectSearch() {
//    }


    @Then("User select existing customer on menu item page")
    public void userSelectExistingCustomerOnMenuItemPage() {
        new TGMenuItemPage().selectExistingCustomer();
    }

    @Then("User verify close sale popup info")
    public void userVerifyCloseSalePopupInfo() {
        new TGMenuItemPage().verifyCloseSalePopUpInfo();
    }

    @Then("User verify sync popup info")
    public void userVerifySyncPopupInfo() {
        new TGMenuItemPage().verifySyncPopUpInfo();
    }

    @And("User click service type option")
    public void userClickServiceTypeOption() {
        new TGMenuItemPage().selectServiceType();
    }

    @Then("User verify first service type")
    public void userVerifyFirstServiceType() {
        new TGMenuItemPage().verifyFirstServiceType();
    }

    @When("User enter search any category and sub category")
    public void userEnterSearchAnyCategoryAndSubCategory() {
        new TGMenuItemPage().enterCategoryOrSubCategoryForSearch();
    }

    @Then("User verify search info message")
    public void userVerifySearchInfoMessage() {
        new TGMenuItemPage().verifySearchCategoryInfoMessage();
    }

    @Then("User select first added customer")
    public void userSelectFirstAddedCustomer() {
        new TGMenuItemPage().selectFirstAddedCustomer();
    }

    @And("User click selected first customer")
    public void userClickSelectedFirstCustomer() {
        new TGMenuItemPage().clickSelectedFirstCustomer();
    }

    @Then("User verify edited customer on menu item page")
    public void userVerifyEditedCustomerOnMenuItemPage() {
        new TGMenuItemPage().verifiedEditedCustomer();
    }

    @When("User select ForHere mode on menu item page")
    public void userSelectForHereModeOnMenuItemPage() {
        new TGMenuItemPage().selectForHereServiceType();
    }

    @And("User verify ForHere service type")
    public void userVerifyForHereServiceType() {
        new TGMenuItemPage().verifyForHereServiceType();
    }

    @When("User select ForHere from BarTab mode on menu item page")
    public void userSelectForHereFromBarTabModeOnMenuItemPage() {
        new TGMenuItemPage().selectForHereServiceTypeFromBarTab();
    }

    @When("User select ForHere from Phone ToGo mode on menu item page")
    public void userSelectForHereFromPhoneToGoModeOnMenuItemPage() {
        new TGMenuItemPage().selectForHereServiceTypeFromPhoneToGo();
    }

    @When("User select ForHere from Phone Delivery mode on menu item page")
    public void userSelectForHereFromPhoneDeliveryModeOnMenuItemPage() {
        new TGMenuItemPage().selectForHereServiceTypeFromPhoneDelivery();
    }

    @When("User select ForHere from Delivery mode on menu item page")
    public void userSelectForHereFromDeliveryModeOnMenuItemPage() {
        new TGMenuItemPage().selectForHereServiceTypeFromDelivery();
    }

    @And("User verify no customer on menu item page")
    public void userVerifyNoCustomerOnMenuItemPage() {
        new TGMenuItemPage().verifyNoSelectedCustomer();
    }

    @And("User select any customer on menu item page")
    public void userSelectAnyCustomerOnMenuItemPage() {
        new TGMenuItemPage().selectAnyCustomer();
    }

    @And("User verify new selected customer on menu item page")
    public void userVerifyNewSelectedCustomerOnMenuItemPage() {
        new TGMenuItemPage().verifyNewSelectedCustomer();
    }

    @When("User select first ordered item")
    public void userSelectFirstOrderedItem() {
        new TGMenuItemPage().selectFirstOrderedMenuItem();
    }

    @And("User verify deleted discount")
    public void userVerifyDeletedDiscount() {
        new TGMenuItemPage().verifyDeletedDiscount();
    }

    @And("User verify applied auto discount not delete")
    public void userVerifyAppliedAutoDiscountNotDelete() {
        new TGMenuItemPage().autoDiscountNotDeleted();
    }

    @Then("User verify added first ordered item")
    public void userVerifyAddedFirstOrderedItem() {
        new TGMenuItemPage().verifyRepeatMenuOption();
    }

    @And("User verify increased number of quantity")
    public void userVerifyIncreasedNumberOfQuantity() {
        new TGMenuItemPage().verifyIncreasedQuantity();
    }

    @And("User verify decreased number of quantity")
    public void userVerifyDecreasedNumberOfQuantity() {
        new TGMenuItemPage().verifyDecreasedQuantity();
    }

    @When("User select ForHere from DineIn order type on menu item page")
    public void userSelectForHereFromDineInOrderTypeOnMenuItemPage() {
        new TGMenuItemPage().selectForHereFromDineIn();
    }

    @When("User select another menu item with modifier")
    public void userSelectAnotherMenuItemWithModifier() {
        new TGMenuItemPage().selectFourthMenuItem();
    }

//    @Then("User add modifier over maximum count")
//    public void userAddModifierOverMaximumCount() {
//        new TGMenuItemPage().addModifierOverMaximumCount();
//    }

    @Then("User add modifier over maximum count")
    public void userAddModifierOverMaximumCount() {
        new TGMenuItemPage().addModifiersOverMaximumCount();
    }
    @Then("User add modifiers over maximum count")
    public void userAddModifiersOverMaximumCount() {
        new TGMenuItemPage().addModifierOverMaximumCount();
    }

    @And("User verify empty order page")
    public void userVerifyEmptyOrderPage() {
        new TGMenuItemPage().emptyOrderList();
    }

    @And("User verify added modifier")
    public void userVerifyAddedModifier() {
        new TGMenuItemPage().verifyAddedModifierToOrderList();

    }

    @Then("User verify added quantity of modifier for first modifier")
    public void userVerifyAddedQuantityOfModifierForFirstModifier() {
        new TGMenuItemPage().verifyAddedQuantityOfModifierForFirstModifier();
    }

    @When("User select another modifier for the same menu item")
    public void userSelectAnotherModifierForTheSameMenuItem() {
        new TGMenuItemPage().selectAnotherModifierForTheSameMenuItem();
    }

    @And("User verify added quantity of modifier for second modifier")
    public void userVerifyAddedQuantityOfModifierForSecondModifier() {
        new TGMenuItemPage().verifyAddedQuantityOfModifierForSecondModifier();
    }

    @And("User verify maximum quantity of modifiers for first and second modifiers")
    public void userVerifyMaximumQuantityOfModifiersForFirstAndSecondModifiers() {
        new TGMenuItemPage().verifyMaximumQuantityOfModifiersForFirstAndSecondModifiers();

    }

    @Then("User swipe modifier for delete")
    public void userSwipeModifierForDelete() throws InterruptedException {
        new TGMenuItemPage().swipe(50, 50, 30, 30, 3000);
    }

    @Then("User click modifier delete button")
    public void userClickModifierDeleteButton() {
        new TGMenuItemPage().deleteModifier();
    }

    @When("User verify added menu item without modifier")
    public void userVerifyAddedMenuItemWithoutModifier() {

    }

    @When("User select first menu item")
    public void userSelectFirstMenuItem() {
        new TGMenuItemPage().selectFirstMenuItem();
    }

    @And("User verify added tax exempt")
    public void userVerifyAddedTaxExempt() {
        new TGMenuItemPage().verifyAddedTaxExempt();
    }

    @And("User verify added tax exempt1")
    public void userVerifyAddedTaxExempt1() {
        new TGMenuItemPage().verifyAddedTaxExempt1();
    }

    @And("User verify removed tax exempt")
    public void userVerifyRemovedTaxExempt() {
        new TGMenuItemPage().verifyRemovedTaxExempt();
    }

    @When("User select second menu item with modifier")
    public void userSelectSecondMenuItemWithModifier() {
        new TGMenuItemPage().selectSecondMenuItemHasModifier();
    }

    @Then("User verify reached maximum count")
    public void userVerifyReachedMaximumCount() {
        new TGMenuItemPage().verifyReachedMaximumCount();
    }

    @Then("User add first modifier maximum count of second menu item")
    public void userAddFirstModifierMaximumCountOfSecondMenuItem() {
        new TGMenuItemPage().addFirstModifierMaximumCountOfSecondMenuItem();
    }

    @Then("User add second menu item modifier over maximum count")
    public void userAddSecondMenuItemModifierOverMaximumCount() {
        new TGMenuItemPage().addSecondMenuItemThirdModifierOverMaximumCount();
    }

    @Then("User select first modifier of third menu item")
    public void userSelectFirstModifierOfThirdMenuItem() {
        new TGMenuItemPage().selectFirstModifierOfThirdMenuItem();
    }

    @And("User click food category")
    public void userClickFoodCategory() {
        new TGMenuItemPage().clickFoodTab();
    }

    @And("User click add void button")
    public void userClickAddVoidButton() {
        new TGMenuItemPage().clickAddVoidReasonButton();
    }

    @And("User click receipt printer button for void check")
    public void userClickReceiptPrinterButtonForVoidCheck() {
        new TGMenuItemPage().closeVoidReceiptPrinter();
    }

    @And("User click first order menu item")
    public void userClickFirstOrderMenuItem() {
        new TGMenuItemPage().clickFirstOrderMenuItem();
    }

    @When("User click QSR on Menu Item page")
    public void userClickQSROnMenuItemPage() {
        new TGMenuItemPage().clickQsrOrderType();
    }

    @When("User enter customer name for bar tab")
    public void userEnterCustomerNameForBarTab() {
        new TGMenuItemPage().enterCustomerNameForBarTab();
    }

    @Then("User verify QSR order type")
    public void userVerifyQSROrderType() {
        new TGMenuItemPage().verifyQsrOrderType();
    }

    @When("User select third menu item with mandatory modifier")
    public void userSelectThirdMenuItemWithMandatoryModifier() {
        new TGMenuItemPage().selectThirdMenuItem();
    }

    @Then("User click done button on modifier")
    public void userClickDoneButtonOnModifier() {
        new TGMenuItemPage().clickModifierDoneButton();
    }

    @And("User verify mandatory modifier warning popup")
    public void userVerifyMandatoryModifierWarningPopup() {
        new TGMenuItemPage().mandatoryModifierWarningPopup();
    }

    @When("User select fourth menu item with modifier")
    public void userSelectFourthMenuItemWithModifier() {
        new TGMenuItemPage().selectFourthMenuItem();
    }

    @And("User verify order with fourth menu item with not selected modifier")
    public void userVerifyOrderWithFourthMenuItemWithNotSelectedModifier() {
        new TGMenuItemPage().verifyMenuItemWithNoMandatoryModifier();
    }


    @And("User verify order")
    public void userVerifyOrder() {
        new TGMenuItemPage().verifyOrder();
    }

    @Then("User select Bar Tab in order types")
    public void userSelectBarTabInOrderTypes() {
        new TGMenuItemPage().selectBarTabOrderType();
    }

    @Then("User select QSR in order types")
    public void userSelectQSRInOrderTypes() {
        new TGMenuItemPage().selectQSROrderType();
    }

    @Then("User click pizza category")
    public void userClickPizzaCategory() {
        new TGMenuItemPage().clickPizzaCategoryTab();
    }

    @Then("User select third modifier with prefix of second menu item of pizza")
    public void userSelectThirdModifierWithPrefixOfSecondMenuItemOfPizza() {
        new TGMenuItemPage().selectThirdModifierOfSecondPizzaMenuItem();
    }

    @And("User verify modifier prefix")
    public void userVerifyModifierPrefix() {
        new TGMenuItemPage().verifyModifierPrefix();
    }


    @Then("User select optional modifier")
    public void userSelectOptionalModifier() {
        new TGMenuItemPage().selectOptionalModifierOfGarlicBreadMenuItem();
    }

    @And("User verify optional modifier")
    public void userVerifyOptionalModifier() {
        new TGMenuItemPage().verifyOptionalModifier();
    }

    @Then("User select fifth menu item with mandatory modifier")
    public void userSelectFifthMenuItemWithMandatoryModifier() {
        new TGMenuItemPage().selectFifthMenuItemOfFoodCategory();
    }

    @When("User select first modifier for fifth menu item")
    public void userSelectFirstModifierForFifthMenuItem() {
        new TGMenuItemPage().selectFirstModifierOfFifthMenuItem();
    }

    @Then("User verify first modifier for fifth menu item in orders")
    public void userVerifyFirstModifierForFifthMenuItemInOrders() {
        new TGMenuItemPage().verifyFirstModifierOfFifthMenuItem();
    }

    @Then("User verify first modifier for third menu item in orders")
    public void userVerifyFirstModifierForThirdMenuItemInOrders() {
        new TGMenuItemPage().verifyFirstModifierOfThirdMenuItemInOrderList();
    }

    @Then("User verify inclusive tax")
    public void userVerifyInclusiveTax() {
        new TGMenuItemPage().verifyInclusiveTax();
    }


    @Then("User verify first modifier of seventh menu item prefixes")
    public void userVerifyFirstModifierOfSeventhMenuItemPrefixes() {
        new TGMenuItemPage().verifyFirstModifierOfSeventhMenuItemPrefixes();
    }

    @Then("User select menu item has exclusive tax")
    public void userSelectMenuItemHasExclusiveTax() {
        new TGMenuItemPage().selectMenuItemHasExclusiveTax();
    }



    @When("User select second pizza menu item with modifier")
    public void userSelectSecondPizzaMenuItemWithModifier() {
        new TGMenuItemPage().selectSecondMenuItemOnPizzaCategory();
    }

    @Then("User select second menu item of pizza category")
    public void userSelectSecondMenuItemOfPizzaCategory() {
        new TGMenuItemPage().selectSecondMenuItemOnPizzaCategory();
    }

    @And("User verify item based discount after tax")
    public void userVerifyItemBasedDiscountAfterTax() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTax();
    }

    @Then("User select PizzaRucola menu item of pizza category")
    public void userSelectPizzaRucolaMenuItemOfPizzaCategory() {
        new TGMenuItemPage().selectPizzaRucola();
    }

    @Then("User select PizzaRomano menu item of pizza category")
    public void userSelectPizzaRomanoMenuItemOfPizzaCategory() {
        new TGMenuItemPage().selectPizzaRomano();
    }

    @Then("User select BlackBluPizza menu item of pizza category")
    public void userSelectBlackBluPizzaMenuItemOfPizzaCategory() {
        new TGMenuItemPage().selectBlackBluPizza();
    }

    @And("User verify check based discount after tax")
    public void userVerifyCheckBasedDiscountAfterTax() {
        new TGMenuItemPage().verifyCheckBasedAfterTax();
    }

    @Then("User select PizzaLasagna menu item of pizza category")
    public void userSelectPizzaLasagnaMenuItemOfPizzaCategory() {
        new TGMenuItemPage().selectPizzaLasagna();
    }

    @And("User verify item based discount before tax")
    public void userVerifyItemBasedDiscountBeforeTax() {
        new TGMenuItemPage().verifyCheckBasedBeforeTax();
    }

    @And("User verify item based discount before tax role restrict")
    public void userVerifyItemBasedDiscountBeforeTaxRoleRestrict() {
        new TGMenuItemPage().verifyItemBasedRestrictDay();
    }

    @And("User verify item based discount after tax role restrict")
    public void userVerifyItemBasedDiscountAfterTaxRoleRestrict() {
        new TGMenuItemPage().verifyItemBasedAfterTaxRestrictRole();
    }

    @Then("User select check based discount after tax with open item")
    public void userSelectCheckBasedDiscountAfterTaxWithOpenItem() {
        new TGMenuItemPage().selectCheckBasedDiscountAfterTaxWithOpenItem();
    }

    @And("User verify check based discount after tax with open item")
    public void userVerifyCheckBasedDiscountAfterTaxWithOpenItem() {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxWithOpenItem();
    }

    @And("User verify auto discount with check based discount before tax")
    public void userVerifyAutoDiscountWithCheckBasedDiscountBeforeTax() {
        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxWithAutoDiscount();
    }

    @And("User verify total amount with fix gratuity value")
    public void userVerifyTotalAmountWithFixGratuityValue() {
        new TGMenuItemPage().verifyTotalAmountWithGratuity();
    }

    @And("User verify total amount without fix gratuity value")
    public void userVerifyTotalAmountWithoutFixGratuityValue() {
        new TGMenuItemPage().verifyTotalAmountWithoutGratuity();
    }

    @Then("User select OnionRings menu item of food category")
    public void userSelectOnionRingsMenuItemOfFoodCategory() {
        new TGMenuItemPage().selectOnionRingsMenuItemOnFoodCategory();
    }

    @Then("User select CheesePizza menu item of pizza category")
    public void userSelectCheesePizzaMenuItemOfPizzaCategory() {
        new TGMenuItemPage().selectCheesePizzaMenuItemOnPizzaCategory();
    }

    @Then("User select Margarita menu item of pizza category")
    public void userSelectMargaritaMenuItemOfPizzaCategory() {
        new TGMenuItemPage().selectMargaritaMenuItemOnPizzaCategory();
    }

    @Then("User select PizzaTomBasil menu item of pizza category")
    public void userSelectPizzaTomBasilMenuItemOfPizzaCategory() {
        new TGMenuItemPage().selectPizzaTomBasilMenuItemOnPizzaCategory();
    }

    @Then("User select PizzaMel menu item of pizza category")
    public void userSelectPizzaMelMenuItemOfPizzaCategory() {
        new TGMenuItemPage().selectPizzaMelMenuItemOnPizzaCategory();
    }

    @And("User verify default tax on PizzaMel")
    public void userVerifyDefaultTaxOnPizzaMel() {
        new TGMenuItemPage().verifyDefaultTaxOnPizzaMel();
    }

    @And("User verify quantity based tax on OnionRings")
    public void userVerifyQuantityBasedTaxOnOnionRings() {
        new TGMenuItemPage().verifyQuantityBasedTaxOnOnionRings();
    }

    @And("User verify inclusive tax on Cheese Pizza")
    public void userVerifyInclusiveTaxOnCheesePizza() {
        new TGMenuItemPage().verifyInclusiveTaxOnCheesePizza();
    }

    @And("User verify check based tax without subtotal on Margarita")
    public void userVerifyCheckBasedTaxWithoutSubtotalOnMargarita() {
        new TGMenuItemPage().verifyCheckBasedTaxWithoutSubtotalOnMargarita();
    }

    @And("User verify check based tax with subtotal on PizzaTomBasil")
    public void userVerifyCheckBasedTaxWithSubtotalOnPizzaTomBasil() {
        new TGMenuItemPage().verifyCheckBasedTaxWithSubtotalOnPizzaTomBasil();
    }

    @Then("User select California menu item of pizza category")
    public void userSelectCaliforniaMenuItemOfPizzaCategory() {
        new TGMenuItemPage().selectCaliforniaPizza();
    }

    @And("User verify tax on item tax for inclusive tax on PizzaTomBasil")
    public void userVerifyTaxOnItemTaxForInclusiveTaxOnPizzaTomBasil() {
        new TGMenuItemPage().verifyTaxOnItemTaxForInclusiveTaxOnPizzaTomBasil();
    }

    @Then("User select NeapolitanPizza menu item of pizza category")
    public void userSelectNeapolitanPizzaMenuItemOfPizzaCategory() {
        new TGMenuItemPage().selectNeapolitanPizza();
    }

    @And("User verify tax on item tax for inclusive tax on NeapolitanPizza")
    public void userVerifyTaxOnItemTaxForInclusiveTaxOnNeapolitanPizza() {
        new TGMenuItemPage().verifyTaxOnItemTaxForInclusiveTaxOnNeapolitanPizza();
    }

    @And("User verify item based free discount with before tax")
    public void userVerifyItemBasedFreeDiscountWithBeforeTax() {
        new TGMenuItemPage().verifyItemBasedFreeDiscountWithBeforeTax();
    }

    @Then("User verify check based percentage discount with after tax")
    public void userVerifyCheckBasedPercentageDiscountWithAfterTax() {
        new TGMenuItemPage().verifyCheckBasedPercentageDiscountWithAfterTax();
    }

    @Then("User verify check based percentage discount with after tax after applied open item")
    public void userVerifyCheckBasedPercentageDiscountWithAfterTaxAfterAppliedOpenItem() {
        new TGMenuItemPage().verifyCheckBasedPercentageDiscountWithAfterTaxAppliedOpenItem();
    }

    @Then("User verify check based amount discount with after tax")
    public void userVerifyCheckBasedAmountDiscountWithAfterTax() {
        new TGMenuItemPage().verifyCheckBasedAmountDiscountWithAfterTax();
    }

    @Then("User verify check based set price discount with after tax")
    public void userVerifyCheckBasedSetPriceDiscountWithAfterTax() {
        new TGMenuItemPage().verifyCheckBasedSetPriceDiscountWithAfterTax();
    }

    @Then("User verify check based free discount with after tax")
    public void userVerifyCheckBasedFreeDiscountWithAfterTax() {
        new TGMenuItemPage().verifyCheckBasedFreeDiscountWithAfterTax();
    }

    @Then("User verify check based amount discount with before tax")
    public void userVerifyCheckBasedAmountDiscountWithBeforeTax() {
        new TGMenuItemPage().verifyCheckBasedAmountDiscountWithBeforeTax();

    }

    @Then("User verify check based set price discount with before tax")
    public void userVerifyCheckBasedSetPriceDiscountWithBeforeTax() {
        new TGMenuItemPage().verifyCheckBasedSetPriceDiscountWithBeforeTax();
    }

    @Then("User verify check based free discount with before tax")
    public void userVerifyCheckBasedFreeDiscountWithBeforeTax() {
        new TGMenuItemPage().verifyCheckBasedFreeDiscountWithBeforeTax();
    }

    @And("User select Chicken Schnitzel")
    public void userSelectChickenSchnitzel() {
        new TGMenuItemPage().selectChickenSchnitzel();
    }

    @And("User verify open discount as amount with before tax")
    public void userVerifyOpenDiscountAsAmountWithBeforeTax() {
        new TGMenuItemPage().verifyOpenDiscountAsAmountWithBeforeTax();
    }

    @And("User verify open discount as amount with before tax for Margarita")
    public void userVerifyOpenDiscountAsAmountWithBeforeTaxForMargarita() {
        new TGMenuItemPage().verifyOpenDiscountAsAmountWithBeforeTaxForMargarita();
    }


    @And("User select Pollo Parm menu item")
    public void userSelectPolloParmMenuItem() {
        new TGMenuItemPage().selectPolloParmMenuItem();
    }

    @When("User select Sandwiches menu item")
    public void userSelectSandwichesMenuItem() {
        new TGMenuItemPage().selectSandwichesMenuItem();
    }

    @Then("User verify tax amount of sandwich")
    public void userVerifyTaxAmountOfSandwich() {
        new TGMenuItemPage().verifyTaxAmountOfSandwich();
    }

    @Then("User click selected customer for Bar Tab")
    public void userClickSelectedCustomerForBarTab() {
        new TGMenuItemPage().clickSelectedCustomerForBarTab();
    }

    @When("User click Food category option")
    public void userClickFoodCategoryOption() {
        new TGMenuItemPage().clickFoodCategoryOption();
    }

    @And("User verify Food category menu item")
    public void userVerifyFoodCategoryMenuItem() {
        new TGMenuItemPage().verifyFoodCategoryOption();
    }

    @And("User click added seat for delete")
    public void userClickAddedSeatForDelete() {
        new TGMenuItemPage().deleteAddedSeat();
    }

    @Then("User select DineIn order type")
    public void userSelectDineInOrderType() {
        new TGMenuItemPage().selectDineInOrderType();
    }

    @When("User select Garlic Bread menu item with mandatory modifier")
    public void userSelectGarlicBreadMenuItemWithMandatoryModifier() {
        new TGMenuItemPage().clickGarlicBreadMenuItemOfFood();
    }

    @And("User verify exclusive tax")
    public void userVerifyExclusiveTax() {
        new TGMenuItemPage().verifyExclusiveTax();
    }

    @And("User select Extra prefix for Anchovy modifier")
    public void userSelectExtraPrefixForAnchovyModifier() {
        new TGMenuItemPage().selectExtraPrefixForAnchovyModifier();
    }

    @And("User verify Extra prefix for Anchovy modifier")
    public void userVerifyExtraPrefixForAnchovyModifier() {
        new TGMenuItemPage().verifyExtraPrefixForAnchovyModifier();
    }

    @And("User verify total amount without tax exempt")
    public void userVerifyTotalAmountWithoutTaxExempt() {
        new TGMenuItemPage().verifyTotalAmountWithoutTaxExempt();
    }

    @Then("User verify tax amount for Sandwiches on Bar Tab")
    public void userVerifyTaxAmountForSandwichesOnBarTab() {
        new TGMenuItemPage().verifyTaxAmountForSandwichesOnBarTab();
    }

    @Then("User verify item based discount after tax as percentage")
    public void userVerifyItemBasedDiscountAfterTaxAsPercentage() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsPercentage();
    }

    @Then("User verify item based discount after tax as Free item with Sandwiches")
    public void userVerifyItemBasedDiscountAfterTaxAsFreeItemWithSandwiches() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsFreeItemWithSandwiches();
    }

    @Then("User verify item based discount before tax as Free item with Sandwiches")
    public void userVerifyItemBasedDiscountBeforeTaxAsFreeItemWithSandwiches() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsFreeItemWithSandwiches();
    }

    @Then("User verify item based discount before tax as set price with sandwiches")
    public void userVerifyItemBasedDiscountBeforeTaxAsSetPriceWithSandwiches() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsSetPriceWithSandwiches();
    }

    @Then("User verify check based discount after tax as percentage with Sandwiches")
    public void userVerifyCheckBasedDiscountAfterTaxAsPercentageWithSandwiches() {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAsPercentageWithSandwiches();
    }

    @Then("User verify check based discount before tax as percentage with Sandwiches")
    public void userVerifyCheckBasedDiscountBeforeTaxAsPercentageWithSandwiches() {
        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxAsPercentageWithSandwiches();
    }

    @Then("User verify check based discount before tax as amount with Sandwiches")
    public void userVerifyCheckBasedDiscountBeforeTaxAsAmountWithSandwiches() {
        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxAsAmountWithSandwiches();
    }

    @Then("User verify check based discount after tax as set price with Sandwiches")
    public void userVerifyCheckBasedDiscountAfterTaxAsSetPriceWithSandwiches() {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAsSetPriceWithSandwiches();
    }

    @Then("User verify check based discount before tax as set price with Sandwiches")
    public void userVerifyCheckBasedDiscountBeforeTaxAsSetPriceWithSandwiches() {
        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxAsSetPriceWithSandwiches();
    }

    @Then("User verify check based discount after tax as amount with Sandwiches")
    public void userVerifyCheckBasedDiscountAfterTaxAsAmountWithSandwiches() {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAsAmountWithSandwiches();
    }

    @Then("User verify check based discount after tax as free item with Sandwiches")
    public void userVerifyCheckBasedDiscountAfterTaxAsFreeItemWithSandwiches() {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAsFreeItemWithSandwiches();
    }

    @Then("User verify check based discount before tax as free item with Sandwiches")
    public void userVerifyCheckBasedDiscountBeforeTaxAsFreeItemWithSandwiches() {
        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxAsFreeItemWithSandwiches();
    }

    @Then("User verify open check discount with after tax as percentage")
    public void userVerifyOpenCheckDiscountWithAfterTaxAsPercentage() {
        new TGMenuItemPage().verifyOpenCheckDiscountWithAfterTaxAsPercentage();
    }

    @Then("User verify open check discount with before tax as percentage")
    public void userVerifyOpenCheckDiscountWithBeforeTaxAsPercentage() {
        new TGMenuItemPage().verifyOpenCheckDiscountWithBeforeTaxAsPercentage();
    }

    @Then("User verify open check discount with after tax as amount")
    public void userVerifyOpenCheckDiscountWithAfterTaxAsAmount() {
        new TGMenuItemPage().verifyOpenCheckDiscountWithAfterTaxAsAmountWithMargarita();
    }

    @Then("User verify open check discount with after tax as amount for decimal value")
    public void userVerifyOpenCheckDiscountWithAfterTaxAsAmountForDecimalValue() {
        new TGMenuItemPage().verifyOpenCheckDiscountWithAfterTaxAsAmountWithMargaritaForDecimalValue();
    }

    @Then("User verify open check discount with before tax as amount")
    public void userVerifyOpenCheckDiscountWithBeforeTaxAsAmount() {
        new TGMenuItemPage().verifyOpenCheckDiscountWithBeforeTaxAsAmount();
    }

    @Then("User select Sandwiches Upcharge Add Modifier menu item")
    public void userSelectSandwichesUpchargeAddModifierMenuItem() {
        new TGMenuItemPage().selectSandwichesUpchargeAddModifierMenuItem();
    }

    @And("User verify total amount of Sandwiches Upcharge Add Modifier menu item")
    public void userVerifyTotalAmountOfSandwichesUpchargeAddModifierMenuItem() {
        new TGMenuItemPage().verifyTotalAmountOfSandwichesUpchargeAddModifierMenuItem();
    }

    @And("User verify item based discount after tax with percentage")
    public void userVerifyItemBasedDiscountAfterTaxWithPercentage() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxWithPercentage();
    }

    @And("User verify item based discount before tax with percentage")
    public void userVerifyItemBasedDiscountBeforeTaxWithPercentage() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxWithPercentage();
    }

    @And("User verify item based discount before tax with amount")
    public void userVerifyItemBasedDiscountBeforeTaxWithAmount() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxWithAmount();
    }

    @And("User verify item based discount after tax with amount")
    public void userVerifyItemBasedDiscountAfterTaxWithAmount() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxWithAmount();
    }

    @And("User verify item based discount after tax as set price")
    public void userVerifyItemBasedDiscountAfterTaxAsSetPrice() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsSetPriceForChickenSchnitzel();
    }

    @And("User verify item based discount before tax as set price")
    public void userVerifyItemBasedDiscountBeforeTaxAsSetPrice() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsSetPrice();
    }

    @And("User verify item based discount before tax as set price for chicken schnitzel")
    public void userVerifyItemBasedDiscountBeforeTaxAsSetPriceForChickenSchnitzel() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsSetPriceForChickenSchnitzel();
    }

//    @Then("User click ordered first menu item")
//    public void userClickOrderedFirstMenuItem() {
//
//    }

    @Then("User verify void check info popup")
    public void userVerifyVoidCheckInfoPopup() {
        new TGMenuItemPage().verifyVoidCheckInfoPopup();
    }

    @And("User verify orders with seat")
    public void userVerifyOrdersWithSeat() {
        new TGMenuItemPage().verifyOrdersWithSeat();
    }

    @Then("User verify splited order on menu item page")
    public void userVerifySplitedOrderOnMenuItemPage() {
        new TGMenuItemPage().verifySplitedOrderOnMenuItemPage();
    }

    @Then("User verify orders which will be split")
    public void userVerifyOrdersWhichWillBeSplit() {
        new TGMenuItemPage().verifyOrdersWhichWillBeSplit();
    }

    @Then("User verify after tax as amount & safety limit as decimal value")
    public void userVerifyAfterTaxAsAmountSafetyLimitAsDecimalValue() {
        new TGMenuItemPage().verifyAfterTaxAsAmountSafetyLimitAsDecimalValue();
    }

    @And("User verify item based discount before tax role restrict discount")
    public void userVerifyItemBasedDiscountBeforeTaxRoleRestrictDiscount() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxRoleRestrictDiscount();
    }


    @And("User verify item based discount before tax with percentage for Margarita")
    public void userVerifyItemBasedDiscountBeforeTaxWithPercentageForMargarita() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxWithPercentageForMargarita();
    }

    @Then("User verify Varying Gratuity Discount price on menu item page for Sandwiches")
    public void userVerifyVaryingGratuityDiscountPriceOnMenuItemPageForSandwiches() {
        new TGMenuItemPage().verifyVaryingGratuityDiscountPriceOnMenuItemPageForSandwiches();
    }

    @And("User verify subtotal of order which is applied Varying Gratuity for Sandwiches")
    public void userVerifySubtotalOfOrderWhichIsAppliedVaryingGratuityForSandwiches() {
        new TGMenuItemPage().verifySubtotalOfOrderWhichIsAppliedVaryingGratuityForSandwiches();
    }

    @And("User verify total price of order which is applied Varying Gratuity for Sandwiches")
    public void userVerifyTotalPriceOfOrderWhichIsAppliedVaryingGratuityForSandwiches() {
        new TGMenuItemPage().verifyTotalPriceOfOrderWhichIsAppliedVaryingGratuityForSandwiches();
    }

    @And("User verify tax exempt for Sandwiches")
    public void userVerifyTaxExemptForSandwiches() {
        new TGMenuItemPage().verifyTaxExemptForSandwiches();
    }

    @And("User verify item based discount after tax as percentage with tax exempt for Sandwiches")
    public void userVerifyItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches1();
    }

    @And("User verify item based discount before tax as percentage with tax exempt for Sandwiches")
    public void userVerifyItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches();
    }

    @And("User verify item based discount after tax as amount with tax exempt for Sandwiches")
    public void userVerifyItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches();
    }

    @Then("User verify item based discount before tax as amount with tax exempt for Sandwiches")
    public void userVerifyItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches();
    }

    @Then("User verify item based discount after tax as set price with tax exempt for Sandwiches")
    public void userVerifyItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches();
    }

    @And("User verify item based discount before tax as set price with tax exempt for Sandwiches")
    public void userVerifyItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches();
    }

    @And("User verify item based discount after tax as free item with tax exempt for Sandwiches")
    public void userVerifyItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches();
    }

    @And("User verify item based discount before tax as free item with tax exempt for Sandwiches")
    public void userVerifyItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwiches() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwiches();
    }

    @And("User verify item based discount before tax as free item with tax exempt for Sandwich")
    public void userVerifyItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwich() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwich();
    }

    @When("User verify Fix Gratuity Discount price on menu item page for Sandwiches")
    public void userVerifyFixGratuityDiscountPriceOnMenuItemPageForSandwiches() {
        new TGMenuItemPage().verifyFixGratuityDiscountPriceOnMenuItemPageForSandwiches();
    }

    @Then("User verify subtotal of order which is applied Fix Gratuity for Sandwiches")
    public void userVerifySubtotalOfOrderWhichIsAppliedFixGratuityForSandwiches() {
        new TGMenuItemPage().verifySubtotalOfOrderWhichIsAppliedFixGratuityForSandwiches();
    }

    @And("User verify total price of order which is applied Fix Gratuity for Sandwiches")
    public void userVerifyTotalPriceOfOrderWhichIsAppliedFixGratuityForSandwiches() {
        new TGMenuItemPage().verifyTotalPriceOfOrderWhichIsAppliedFixGratuityForSandwiches();
    }

    @And("User click add new customer button")
    public void userClickAddNewCustomerButton() {
        new TGMenuItemPage().clickAddNewCustomerButton();
    }

    @When("User click Dine In order option")
    public void userClickDineInOrderOption() {
        new TGMenuItemPage().clickDineInOrderType();
    }


    @Then("User verify split is not allow payment popup")
    public void userVerifySplitIsNotAllowPaymentPopup() {
        new TGMenuItemPage().verifySplitIsNotAllowPaymentPopup();
    }

    @Then("User verify GiveX card recurring amount on menu item page")
    public void userVerifyGiveXCardRecurringAmountOnMenuItemPage() {
        new TGMenuItemPage().verifyGiveXCardRecurringAmountOnMenuItemPage();
    }

    @Then("User verify GiveX recharge amount on menu item page")
    public void userVerifyGiveXRechargeAmountOnMenuItemPage() {
        new TGMenuItemPage().verifyGiveXRechargeAmountOnMenuItemPage();
    }

    @And("User clear the search bar")
    public void userClearTheSearchBar(){
        new TGMenuItemPage().clearSearchMenuItem();
    }

    @Then("User select Tuna Tacos menu item")
    public void userSelectTunaTacosMenuItem() {
        new TGMenuItemPage().selectTunaTacosMenuItem();
    }

    @Then("User verify GiveX Recharge success info popup")
    public void userVerifyGiveXRechargeSuccessInfoPopup() {
        new TGMenuItemPage().verifyGiveXRechargeSuccessInfoPopup();
    }



    @Then("User verify item based discount as amount with safety limit in decimal precision and after tax")
    public void userVerifyItemBasedDiscountAsAmountWithSafetyLimitInDecimalPrecisionAndAfterTax() {
        new TGMenuItemPage().verifyItemBasedDiscountAsAmountWithSafetyLimitInDecimalPrecisionAndAfterTax();
    }

    @Then("User select Brushetta menu item")
    public void userSelectBrushettaMenuItem() {
        new TGMenuItemPage().selectBrushettaMenuItem();
    }

    @When("User select drinks category")
    public void userSelectDrinksCategory() {
        new TGMenuItemPage().selectDrinksCategory();
    }

    @Then("User select cocktail menu item")
    public void userSelectCocktailMenuItem() {
        new TGMenuItemPage().selectCocktailMenuItem();
    }

    @And("User verify service charge for cocktail menu item")
    public void userVerifyServiceChargeForCocktailMenuItem() {
        new TGMenuItemPage().verifyServiceChargeForCocktailMenuItem();
    }

    @And("User verify item based discount after tax as percentage for Brushetta")
    public void userVerifyItemBasedDiscountAfterTaxAsPercentageForBrushetta() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsPercentageForBrushetta();
    }

    @And("User verify item based discount before tax as percentage for Brushetta")
    public void userVerifyItemBasedDiscountBeforeTaxAsPercentageForBrushetta() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsPercentageForBrushetta();
    }

    @And("User verify item based discount after tax as amount for Brushetta")
    public void userVerifyItemBasedDiscountAfterTaxAsAmountForBrushetta() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsAmountForBrushetta();
    }

    @And("User verify item based discount after tax as amount for Brushetta1")
    public void userVerifyItemBasedDiscountAfterTaxAsAmountForBrushetta1() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsAmountForBrushetta1();
    }

    @And("User verify item based discount after tax as set price for Brushetta")
    public void userVerifyItemBasedDiscountAfterTaxAsSetPriceForBrushetta() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsSetPriceForBrushetta();
    }

    @And("User verify item based discount after tax as free item for Brushetta")
    public void userVerifyItemBasedDiscountAfterTaxAsFreeItemForBrushetta() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsFreeItemForBrushetta();
    }

    @And("User select last closed order for BarTab")
    public void userSelectLastClosedOrderForBarTab() {
        new TGMenuItemPage().selectLastBarTabServiceClosedOrder();
    }

    @And("User verify item based discount before tax as set price for Brushetta")
    public void userVerifyItemBasedDiscountBeforeTaxAsSetPriceForBrushetta() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsSetPriceForBrushetta();
    }

    @And("User verify item based discount before tax as free item for Brushetta")
    public void userVerifyItemBasedDiscountBeforeTaxAsFreeItemForBrushetta() {
        new TGMenuItemPage().verifyItemBasedDiscountBeforeTaxAsFreeItemForBrushetta();
    }

    @And("User verify check based discount after tax as percentage for Brushetta")
    public void userVerifyCheckBasedDiscountAfterTaxAsPercentageForBrushetta() {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAsPercentageForBrushetta();
    }

    @And("User verify check based discount after tax as amount for Brushetta")
    public void userVerifyCheckBasedDiscountAfterTaxAsAmountForBrushetta() {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAsAmountForBrushetta();
    }

    @And("User verify check based discount after tax as set price for Brushetta")
    public void userVerifyCheckBasedDiscountAfterTaxAsSetPriceForBrushetta() {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAsSetPriceForBrushetta();
    }

    @And("User verify check based discount after tax as free item for Brushetta")
    public void userVerifyCheckBasedDiscountAfterTaxAsFreeItemForBrushetta() {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAsFreeItemForBrushetta();
    }

    @And("User verify check based discount before tax as percentage for Brushetta")
    public void userVerifyCheckBasedDiscountBeforeTaxAsPercentageForBrushetta() {
        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxAsPercentageForBrushetta();
    }

    @And("User verify check based discount before tax as amount for Brushetta")
    public void userVerifyCheckBasedDiscountBeforeTaxAsAmountForBrushetta() {
        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxAsAmountForBrushetta();
    }

    @And("User verify check based discount before tax as set price for Brushetta")
    public void userVerifyCheckBasedDiscountBeforeTaxAsSetPriceForBrushetta() {
        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxAsSetPriceForBrushetta();
    }

    @And("User verify check based discount before tax as free item for Brushetta")
    public void userVerifyCheckBasedDiscountBeforeTaxAsFreeItemForBrushetta() {
        new TGMenuItemPage().verifyCheckBasedDiscountBeforeTaxAsFreeItemForBrushetta();
    }

    @And("User verify check based discount after tax and open item with decimal number for Brushetta")
    public void userVerifyCheckBasedDiscountAfterTaxAndOpenItemWithDecimalNumberForBrushetta() {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAndOpenItemWithDecimalNumberForBrushetta();
    }

    @And("User verify check based discount after tax and open item with whole number for Brushetta")
    public void userVerifyCheckBasedDiscountAfterTaxAndOpenItemWithWholeNumberForBrushetta() {
        new TGMenuItemPage().verifyCheckBasedDiscountAfterTaxAndOpenItemWithWholeNumberForBrushetta();
    }

    @Then("User select coke menu item")
    public void userSelectCokeMenuItem() {
        new TGMenuItemPage().selectCokeMenuItem();
    }

    @And("User verify total price of PizzaMel menu item")
    public void userVerifyTotalPriceOfPizzaMelMenuItem() {
        new TGMenuItemPage().verifyTotalPriceOfPizzaMelMenuItem();
    }

    @And("User verify total price of Margarita menu item")
    public void userVerifyTotalPriceOfMargaritaMenuItem() {
        new TGMenuItemPage().verifyTotalPriceOfMargaritaMenuItem();
    }

    @When("User verify discount price")
    public void userVerifyDiscountPrice() {
        new TGMenuItemPage().verifyAutoDiscountPrice();
    }

    @And("User verify total price of PizzaMel menu item with tax exempt")
    public void userVerifyTotalPriceOfPizzaMelMenuItemWithTaxExempt() {
        new TGMenuItemPage().verifyTotalPriceOfPizzaMelMenuItemWithTaxExempt();
    }

    @And("User verify total price of Margarita menu item with tax exempt")
    public void userVerifyTotalPriceOfMargaritaMenuItemWithTaxExempt() {
        new TGMenuItemPage().verifyTotalPriceOfMargaritaMenuItemWithTaxExempt();
    }

    @And("User verify fixed gratuity option applied on Brushetta")
    public void userVerifyFixedGratuityOptionAppliedOnBrushetta() {
        new TGMenuItemPage().verifyFixedGratuityOptionAppliedOnBrushetta();
    }

    @And("User verify total price of Brushetta with varying gratuity")
    public void userVerifyTotalPriceOfBrushettaWithVaryingGratuity() {
        new TGMenuItemPage().verifyTotalPriceOfBrushettaWithVaryingGratuity();
    }

    @Then("User select Hamburger menu item")
    public void userSelectHamburgerMenuItem() {
        new TGMenuItemPage().selectHamburgerMenuItem();
    }

    @When("User click plus button for add seat")
    public void userClickPlusButtonForAddSeat() {
        new TGMenuItemPage().clickPlusButtonForAddSeat();
    }

    @Then("User select Bacon Omelet Senior has exclusive tax")
    public void userSelectBaconOmeletSeniorHasExclusiveTax() {
        new TGMenuItemPage().selectBaconOmeletSeniorHasExclusiveTax();
    }

    @When("User verify exclusive tax amount for Bacon Omelet Senior")
    public void userVerifyExclusiveTaxAmountForBaconOmeletSenior() {
        new TGMenuItemPage().verifyExclusiveTaxAmountForBaconOmeletSenior();
    }

    @Then("User select Mantı has inclusive tax")
    public void userSelectMantıHasInclusiveTax() {
        new TGMenuItemPage().selectMantıHasInclusiveTax();
    }

    @When("User verify inclusive tax amount for Mantı")
    public void userVerifyInclusiveTaxAmountForMantı() {
        new TGMenuItemPage().verifyInclusiveTaxAmountForMantı();
    }

    @And("User verify selected customer for Bar tab order")
    public void userVerifySelectedCustomerForBarTabOrder() {
        new TGMenuItemPage().verifySelectedCustomerForBarTabOrder();
    }

    @And("User click selected customer for House Account on BarTab order")
    public void userClickSelectedCustomerForHouseAccountOnBarTabOrder() {
        new TGMenuItemPage().clickSelectedCustomerForHouseAccountOnBarTabOrder();
    }

    @Then("User select void reason for house account")
    public void userSelectVoidReasonForHouseAccount() {
        new TGMenuItemPage().selectVoidReasonForHouseAccount();
    }

    @Then("User verify new customer for House Account")
    public void userVerifyNewCustomerForHouseAccount() {
        new TGMenuItemPage().verifyNewCustomerForHouseAccount();
    }

    @And("User click new customer which is created for House Account")
    public void userClickNewCustomerWhichIsCreatedForHouseAccount() {
        new TGMenuItemPage().clickNewCustomerWhichIsCreatedForHouseAccount();
    }

    @And("User verify Phone To Go order type")
    public void userVerifyPhoneToGoOrderType() {
        new TGMenuItemPage().verifyPhoneToGoOrderType();
    }

    @And("User verify Dine In order type")
    public void userVerifyDineInOrderType() {
        new TGMenuItemPage().verifyDineInOrderType();
    }

    @And("User click exit button if SP Pax PreAuth popup is shown")
    public void userClickExitButtonIfSPPaxPreAuthPopupIsShown() {
        new TGMenuItemPage().clickExitButtonIfSPPaxPreAuthPopupIsShown();
    }

    @And("User verify recharge amount with GivX card")
    public void userVerifyRechargeAmountWithGivXCard() {
        new TGMenuItemPage().verifyRechargeAmountWithGivXCard();
    }


    @When("User select ForHere order option")
    public void userSelectForHereOrderOption() {
        new TGMenuItemPage().selectForHereOrderOption();
    }

    @When("User click BarTab order option")
    public void userClickBarTabOrderOption() {
        new TGMenuItemPage().clickBarTabOrderOption();
    }

    @When("User click Phone Order order option")
    public void userClickPhoneOrderOrderOption() {
        new TGMenuItemPage().clickPhoneOrderOrderOption();
    }

    @When("User click Phone Delivery order option")
    public void userClickPhoneDeliveryOrderOption() {
        new TGMenuItemPage().clickPhoneDeliveryOrderOption();
    }

    @And("User verify item based discount before tax as set price for menu item")
    public void userVerifyItemBasedDiscountBeforeTaxAsSetPriceForMenuItem() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsSetPriceForBrushetta();
    }
    //new nov 17
    @And("User verify item based discount before tax as set price for menu item1")
    public void userVerifyItemBasedDiscountBeforeTaxAsSetPriceForMenuItem1() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsSetPriceForBrushetta1();
    }

    @And("User verify item based discount before tax as amount for Brushetta")
    public void userVerifyItemBasedDiscountBeforeTaxAsAmountForBrushetta() {
        new TGMenuItemPage().verifyItemBasedDiscountAfterTaxAsAmountForBrushetta();
    }

    @When("User click the \"([^\"]*)\" on Menu Item page \"([^\"]*)\"$")
    public void userClickTheOnMenuItemPage(String btnQSR, String msg) {
        new CICloseDayScreen().commonAccessibilityId(btnQSR,msg);
    }

    @When("^User click \"([^\"]*)\" in the order Screen \"([^\"]*)\"$")
    public void userClickInTheOrderScreen(String btnTillManagement, String msg) {
        new CIWaitListPage().commonBtn(btnTillManagement,msg);
    }

    @And("^I verify the \"([^\"]*)\" in the check \"([^\"]*)\"$")
    public void iVerifyTheInTheCheck(String btnDriver, String msg) {
        new CIPaymentScreen().commonBtnClickOption(btnDriver,msg);
    }


    // Nov 16
    @And("User verify fixed gratuity1")
    public void userVerifyFixedGratuity1() {
        new TGMenuItemPage().verifyFixedGratuity1();
    }

//    @And("User verify varying gratuity")
//    public void userVerifyVaryingGratuity() {
//        new TGMenuItemPage().verifyVaryingGratuity();
//    }
//
//    @And("User verify deleted gratuity amount")
//    public void userVerifyDeletedGratuityAmount() {
//        new TGMenuItemPage().verifyDeletedGratuity();
//
//    }

    @And("^I select the \"([^\"]*)\" in the Table layout screen in Menu item \"([^\"]*)\"$")
    public void iSelectTheInTheTableLayoutScreenInMenuItem(String btnTable, String msg) {
        new CIPaymentScreen().clickbtnTable(btnTable,msg);
    }

}

