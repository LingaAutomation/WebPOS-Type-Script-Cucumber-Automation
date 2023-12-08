package com.qa.stepdef;


import com.qa.pages.TGMenuItemPage;
import com.qa.pages.TGSplitCheckPage;

import com.qa.pages.TGTableLayoutPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TGSplitCheckStepDef {

    TGSplitCheckPage split = new TGSplitCheckPage();

    @And("User click split by seat button in split screen")
    public void userClickSplitBySeatButtonInSplitScreen() {
//        nov 19
        split.clickSplitBySeatInTablelayout();
    }

    @And("User click split by seat button1 in split screen")
    public void userClickSplitBySeatButton1InSplitScreen() {
        split.selectSplitBySeatOption1();
    }

    @And("User select menu item which will be split in split screen")
    public void userSelectMenuItemWhichWillBeSplitInSplitScreen() {
        split.selectMenuItemFromCheck();
    }
//    @And("User tab check which is oped newly in split screen")
//    public void userTabCheckWhichIsOpedNewlyInSplitScreen() {
//        split.addItemToNewCheck();
//    }

    @And("User click save and close in split screen")
    public void userClickSaveAndCloseInSplitScreen() {
        split.saveAndCloseSplitedCheck();
    }

    @Then("User click Add button")
    public void userClickAddButton() {
        //split.clickAddButton();
    }

    @When("User click first item")
    public void userClickFirstItem() {
        split.selectFirstCheckItem();
    }

    @And("User move to separated item to new check in split screen")
    public void userMoveToSeparatedItemToNewCheckInSplitScreen() {
        split.addItemToNewCheck();
    }

    @And("User click add new seat button")
    public void userClickAddNewSeatButton() {
        split.clickAddSeatForSplit();
    }

    @And("User click split evenly button")
    public void userClickSplitEvenlyButton() {
        split.clickSplitEvenlyButton();
    }

    @And("User verify split evenly check total amount")
    public void userVerifySplitEvenlyCheckTotalAmount() {
        split.verifySplitEvenlyAmount();
    }

    @And("User click separate item button")
    public void userClickSeparateItemButton() {
        split.clickSeparateItem();
    }

    @And("User select first order item")
    public void userSelectFirstOrderItem() {
        split.selectFirstOrderItem();
    }

    @And("User verify separate item")
    public void userVerifySeparateItem() {
        split.verifySeparatedItem();
    }

    @And("User verify split check page")
    public void userVerifySplitCheckPage() {
        split.verifySplitCheckTitle();
    }

    @And("User click added seat")
    public void userClickAddedSeat() {
        split.clickAddedSeat();
    }

    @And("User select first item on first seat")
    public void userSelectFirstItemOnFirstSeat() {
        split.selectFirstItemOnFirstSeat();
    }

    @And("User select separate number for item")
    public void userSelectSeparateNumberForItem() {
        split.separateItemNumber();
    }

    @And("User verify select order popup")
    public void userVerifySelectOrderPopup() {
        split.closeOrderPopup();

    }

    @When("User select first seat")
    public void userSelectFirstSeat() {
        split.selectFirstSeat();
    }

    @Then("User click pay button on split seat")
    public void userClickPayButtonOnSplitSeat() {
        split.clickPayButtonOnSplitSeatPage();

    }

    @When("User click group seat button")
    public void userClickGroupSeatButton() {
        split.clickGroupSeatButton();
    }

    @Then("User select seats to merge")
    public void userSelectSeatsToMerge() {
        split.selectSeatsForMerge();
    }

    @Then("User verify group seat option")
    public void userVerifyGroupSeatOption() {
        split.verifyMergedGroupSeat();
    }

    @Then("User verify seats to merge warning popup")
    public void userVerifySeatsToMergeWarningPopup() {
        split.verifyWarningPopup();
    }

    @When("User select seat is payable")
    public void userSelectSeatIsPayable() {
        split.selectSeatPayable();
    }

    @And("User verify split button is disable for QSR service type")
    public void userVerifySplitButtonIsDisableForQSRServiceType() {
        split.verifyDisableSplitButton();
    }

    @And("User select split check option")
    public void userSelectSplitCheckOption() {
        split.selectSplitCheckOption();

    }

    @When("User click Save and Close button")
    public void userClickSaveAndCloseButton() {
        split.clickSaveAndCloseButton();
    }

    @When("User select seats for group seat")
    public void userSelectSeatsForGroupSeat() {
        split.selectSeatsForGroupSeat();
    }

    @And("User verify last seat is empty")
    public void userVerifyLastSeatIsEmpty() {
        split.verifyLastSeatIsEmpty();
    }

    @And("User click group seat option")
    public void userClickGroupSeatOption() {
        split.clickGroupSeatOption();
    }

    @When("User select order for split item")
    public void userSelectOrderForSplitItem() {
        split.selectOrderForSplitItem();
    }

    @When("User enter number of pieces for split item")
    public void userEnterNumberOfPiecesForSplitItem() {
        split.enterNumberOfPiecesForSplitItem();
    }

    @Then("User verify split items for splited order")
    public void userVerifySplitItemsForSplitedOrder() {
        split.verifySplitItemsForSplitedOrder();
    }


    @And("User verify splited checks on Split Check page")
    public void userVerifySplitedChecksOnSplitCheckPage() {
        split.verifySplitedChecksOnSplitCheckPage();
    }

    @And("User click Add button for split")
    public void userClickAddButtonForSplit() {
        split.clickAddButtonForSplit();
    }

    @When("User select first seat first order")
    public void userSelectFirstSeatFirstOrder() {
        split.selectFirstSeatFirstOrder();
    }

    @Then("User click second seat")
    public void userClickSecondSeat() {
        split.clickSecondSeat();
    }

    @And("User verify first order placed to second seat")
    public void userVerifyFirstOrderPlacedToSecondSeat() {
        split.verifyFirstOrderPlacedToSecondSeat();
    }

    @When("User click Save and Close button on Split Check page")
    public void userClickSaveAndCloseButtonOnSplitCheckPage() {
        split.clickSaveAndCloseButtonOnSplitCheckPage();
    }

    @When("User select first item to split")
    public void userSelectFirstItemToSplit() {
        split.selectFirstItemToSplit();
    }
    @And("User click Seperate Item button")
    public void userClickSeperateItemButton() {
        split.clickSeperateItemButton();
    }

    @Then("User verify separated items")
    public void userVerifySeparatedItems() {
        split.verifySeparatedItems();
    }

    @Then("User verify total price of splited seat")
    public void userVerifyTotalPriceOfSplitedSeat() {
        split.verifyTotalPriceOfSplitedSeat();
    }

    @Then("User select seats which are merge")
    public void userSelectSeatsWhichAreMerge() {
        split.selectSeatsWhichAreMerge();
    }

    @Then("User verify merge seats")
    public void userVerifyMergeSeats() {
        split.verifyMergeSeats();
    }

    @And("User select first order which is separate in split screen")
    public void userSelectFirstOrderWhichIsSeparateInSplitScreen() {
        split.selectSplitCheckItem();
    }

    @And("User enter separate number in split screen")
    public void userEnterSeparateNumber() {
        split.selectSplitCheckItem();    }

    //nov 19
    @When("User select order for split item1")
    public void userSelectOrderForSplitItem1() {
        split.selectOrderForSplitItem1();
    }





    //new

    @Given("Login with valid pin in split screen")
    public void loginWithValidPinInSplitScreen() {
        split.logInWithValidPin();
    }

    @And("^I click on \"([^\"]*)\" for closing order screen popup in split screen \"([^\"]*)\"$")
    public void iPressOnCancelButtonInSplitScreen(String btnCancelXPath, String msg) {
        split.commonAccessibilityId(btnCancelXPath, msg);
    }

    @Given("^User click QSR on Menu Item page in split screen$")
    public void userClickQSROnMenuItemPageInSplitScreen() {
        split.clickQsrOrderType();
    }

    @Given("User select DineIn mode in split screen")
    public void userSelectDineInModeInSplitScreen() {
        split.selectDineInOrderType();
    }

    @Then("User select sixth table in split screen")
    public void userSelectSixthTableInSplitScreen() {
        split.selectSixthTable();
    }

    @When("User click add seat button in split screen")
    public void userClickAddSeatButtonInSplitScreen() {
        split.clickAddSeatButton();
    }

    @When("User take an order in split screen")
    public void userTakeAnOrderInSplitScreen() {
        split.selectMenuItemAndOrder();
    }

    @And("User select first seat on menu item page in split screen")
    public void userSelectFirstSeatOnMenuItemPageInSplitScreen() {
        split.selectFirstSeatInSplitScreen();
    }

    @Then("User click finish button in split screen")
    public void userClickFinishButtonInSplitScreen() {
        split.clickFinishButton();
    }

    @Then("User click split button in split screen")
    public void userClickSplitButtonInSplitScreen() {
        split.clickSplitButton();
    }

    @And("User click split check option in split screen")
    public void userSelectSplitCheckOptionInSplitScreen() {
        split.clickSplitCheckOption();
    }

    @And("User click split by seat option in split screen")
    public void userClickSplitBySeatOptionInSplitScreen() {
        split.clickSplitBySeatOption();
    }

//    @And("User click save and close")
//    public void userClickSaveAndClose() {
//        split.saveAndCloseSplitedCheck();
//    }

    @And("^I click the \"([^\"]*)\" in the close the day screen in split screen \"([^\"]*)\"$")
    public void iClickTheInTheCloseTheDayScreenInSplitScreen(String btnCloseCashier, String msg) {
        split.commonBtnClick(btnCloseCashier, msg);
    }

    @And("User select last active check for Dine In in split screen")
    public void userSelectLastActiveCheckForDineInInSplitScreen() {
        split.selectLastActiveCheckForDineIn();
    }

    @Then("User click Cash Tab in split screen")
    public void userClickCashTabInSplitScreen() {
        split.clickCashButton();
    }

    @And("User click exact option in split screen")
    public void userClickExactOptionInSplitScreen() {
        split.clickExactButtonOnCashTab();
    }

    @Then("User click enter button in split screen")
    public void userClickEnterButtonInSplitScreen() {
        split.clickEnterButtonOnCashButton();
    }

    @And("^I click \"([^\"]*)\" in the receipt printer popup in split screen \"([^\"]*)\"$")
    public void iClickBtnOkInTheReceiptPrinterPopupInSplitScreen(String btnOkXPath, String msg) {
        split.ClickBtnOk(btnOkXPath, msg);
    }

//    @And("User select first order which is separate")
//    public void userSelectFirstOrderWhichIsSeparate() {
//       split.selectSplitCheckItem();
//    }


    @Then("User click split button on menu item page in split screen")
    public void userClickSplitButtonOnMenuItemPageInSplitScreen() {
        split.clickSplitButtonOnMenuItemPage();

    }

    @And("User click split by seat option on menu item page in split screen")
    public void userClickSplitBySeatOptionOnMenuItemPageInSplitScreen() {
        split.clickSplitBySeatOptionOnMenuItemPage();
    }

    @And("USer click cash button in split screen")
    public void userClickCashButtonInSplitScreen() {
        split.clickCashButtonInPayment();
    }

    @And("User click submit button in split screen")
    public void userClickSubmitButtonInSplitScreen() {
        split.clickSubmitButton();
    }

    @Then("User click payment button in split screen")
    public void userClickPaymentButtonInSplitScreen() {
        split.clickPaymentButtonOnMenuItemPage();
    }

    @When("User click calculator split button in split screen")
    public void userClickCalculatorSplitButtonInSplitScreen() {
        split.clickSplitButtonOnCalculator();
    }

    @Then("User select type of split in split screen")
    public void userSelectTypeOfSplitInSplitScreen() {
        split.selectSplitType();
    }

    @And("User select payment method with cash in split screen")
    public void userSelectPaymentMethodWithCashInSplitScreen() {
        split.selectCashPaymentMethod();
    }

    @Then("User verify last split paid cash amount in split screen")
    public void userVerifyLastSplitPaidCashAmountInSplitScreen() {
        split.verifyLastSplitPaidAmount();
    }

    @And("User click split check option on menu item in split screen")
    public void userClickSplitCheckOptionOnMenuItemInSplitScreen() {
        split.clickSplitCheckOnMenuItemPage();
    }

    @When("User click All button in split screen")
    public void userClickAllButtonInSplitScreen() {
        split.clickAllTab();
    }

    @When("User click Bar Tab on Check Status page in split screen")
    public void userClickBarTabOnCheckStatusPageInSplitScreen() {
        split.clickBarTabOnCheckStatusPage();
    }

    @When("User click new tab on Bar tab in split screen")
    public void userClickNewTabOnBarTabInSplitScreen() {
        split.clickNewTab();
    }

    @And("^I click \"([^\"]*)\" in the preauth popup in split screen \"([^\"]*)\"$")
    public void iClickInThePreauthPopupInSplitScreen(String btnExit, String msg) {
        split.commonBtnClick(btnExit,msg);
    }

    @When("User enter customer name for bar tab in split screen")
    public void userEnterCustomerNameForBarTabInSplitScreen() {
        split.enterCustomerNameForBarTab();
    }

    @Then("User click pizza category in split screen")
    public void userClickPizzaCategoryInSplitScreen() {
        split.clickPizzaCategoryTab();
    }

    @Then("User select PizzaMel menu item of pizza category in split screen")
    public void userSelectPizzaMelMenuItemOfPizzaCategoryInSplitScreen() {
        split.selectPizzaMelMenuItemOnPizzaCategory();
    }

    @And("User click order button in split screen")
    public void userClickOrderButtonInSplitScreen() {
        split.clickOrderButton();

    }

    @Then("User select Margarita menu item of pizza category in split screen")
    public void userSelectMargaritaMenuItemOfPizzaCategoryInSplitScreen() {
        split.selectMargaritaMenuItemOnPizzaCategory();
    }

    @And("User verify total price of Margarita menu item in split screen")
    public void userVerifyTotalPriceOfMargaritaMenuItemInSplitScreen() {
        split.verifyTotalPriceOfMargaritaMenuItem();
    }

    @And("User click food category in split screen")
    public void userClickFoodCategoryInSplitScreen() {
        split.clickFoodTab();
    }

    @Then("User select Hamburger menu item in split screen")
    public void userSelectHamburgerMenuItemInSplitScreen() {
        split.selectHamburgerMenuItem();
    }

    @When("User select second seat on menu item page in split screen")
    public void userSelectSecondSeatOnMenuItemPageInSplitScreen() {
        split.selectSecondSeat();
    }

    @When("User click plus button for add seat in split screen")
    public void userClickPlusButtonForAddSeatInSplitScreen() {
        split.clickPlusButtonForAddSeat();
    }

    @And("User select table which will be split")
    public void userSelectTableWhichWillBeSplit() {
        new TGMenuItemPage().selectTable();
    }

    //    @And("User click split by seat button")
//    public void userClickSplitBySeatButton() {
//        new TGMenuItemPage().selectSplitBySeatOption();
//    }
    /*@And("User add another check")
    public void userAddAnotherCheck() {

    }*/


    @And("User select first order which is separate")
    public void userSelectFirstOrderWhichIsSeparate() {
        new TGTableLayoutPage().selectSplitCheckItem();
    }
    @And("User move to separated item to new check")
    public void userMoveToSeparatedItemToNewCheck() {
        new TGMenuItemPage().addItemToNewCheck();
    }

    @And("User click split by seat button")
    public void userClickSplitBySeatButton() {
//        nov 19
        new TGTableLayoutPage().clickSplitBySeatInTablelayout();
    }

    @And("User click split by seat button1")
    public void userClickSplitBySeatButton1() {
        new TGMenuItemPage().selectSplitBySeatOption1();
    }

    @And("User select menu item which will be split")
    public void userSelectMenuItemWhichWillBeSplit() {
        new TGMenuItemPage().selectMenuItemFromCheck();
    }
    @And("User tab check which is oped newly")
    public void userTabCheckWhichIsOpedNewly() {
        new TGMenuItemPage().addItemToNewCheck();
    }

    @And("User click save and close")
    public void userClickSaveAndClose() {
        new TGMenuItemPage().saveAndCloseSplitedCheck();
    }


}

