package com.qa.stepdef;

import com.qa.pages.TGCheck;
import com.qa.pages.TGMenuItemPage;
import com.qa.pages.TGPaymentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TGCheckStepDef {

    TGCheck check=new TGCheck();
    @And("User select QSR mode")
    public void userSelectQSRMode() {
        check.goToQsrSelectDineInMode();
    }



    @When("User click Check Status tab")
    public void userClickCheckStatusTab() {
        check.clickCheckStatusTab();
    }



    @And("User verify active checks")
    public void userVerifyActiveChecks() {
        check.verifyActiveChecks();
    }



    @And("User verify closed checks")
    public void userVerifyClosedChecks() {
        check.verifyClosedChecks();
    }

    @When("User void ordered item")
    public void userVoidOrderedItem() {
        new TGMenuItemPage().selectMenuItemAndOrder();

        check.voidOrder();
    }



    @Then("User verify void checks")
    public void userVerifyVoidChecks() {
        check.verifyVoidChecks();
    }


    @Then("User click Future Checks tabs")
    public void userClickFutureChecksTabs() {
        check.clickFutureCheckTab();
    }

    @And("User verify future checks")
    public void userVerifyFutureChecks() {
    }

    @And("User close popup if exist")
    public void userClosePopupIfExist() {
        try {
            check.seePopup();
        } catch (Exception e) {
        }
    }



    @And("User verify void checks on void tab")
    public void userVerifyVoidChecksOnVoidTab() {
        check.verifyVoidCheckOnVoidTab();
    }

    @When("User select any closed order")
    public void userSelectAnyClosedOrder() {
        check.selectClosedCheck();
    }

    @Then("User click re-open check button")
    public void userClickReOpenCheckButton() {
        check.clickReOpenCheck();
    }

    @Then("User select last paid order")
    public void userSelectLastPaidOrder() {
        check.lastPaidOrder();
    }

    @Then("User verify no more payment popup")
    public void userVerifyNoMorePaymentPopup() {
        check.verifyNoMorePaymentPopup();

    }

    @And("User click open check button")
    public void userClickOpenCheckButton() {
        check.clickOpenCheck();
    }

    @Then("User verify Check Status tab")
    public void userVerifyCheckStatusTab() {
        check.verifyCheckStatusTab();
    }

    @When("User click QSR on Check Status page")
    public void userClickQSROnCheckStatusPage() {
        check.clickQsrOption();
    }


    @And("User verify last closed table service type check")
    public void userVerifyLastClosedTableServiceTypeCheck() {
        new TGPaymentPage().verifyLastClosedTableServiceTypeCheck();
    }


    @When("User select last void order")
    public void userSelectLastVoidOrder() {
        check.selectLastVoidCheck();
    }

    @Then("User select last void order on BarTab")
    public void userSelectLastVoidOrderOnBarTab() {
        check.selectLastVoidCheckForBarTab();
    }

    @Then("User click last void order detail")
    public void userClickLastVoidOrderDetail() {
        check.clickLastVoidCheck();
    }

    @And("User verify subtotal")
    public void userVerifySubtotal() {
        check.verifySubTotal();
    }

    @Then("User select Bar Tab")
    public void userSelectBarTab() {
        check.clickBarTab();
    }

    @And("User swipe until last Bar Tab order")
    public void userSwipeUntilLastBarTabOrder() throws Exception {
        check.swipeUntilLastBarTabOrder("down");
    }

    @When("User select last Bar Tab order")
    public void userSelectLastBarTabOrder() {
        check.clickLastClosedBarTabCheck();
    }

    @And("User swipe until last closed order")
    public void userSwipeUntilLastClosedOrder() throws Exception {
        check.swipeUntilLastClosedCheck("up");
    }

    @And("User swipe until last closed check on Phone Order")
    public void userSwipeUntilLastClosedCheckOnPhoneOrder() throws Exception {
        check.swipeUntilLastClosedCheck("up");
    }

    @And("User verify last voided order with Bar Tab")
    public void userVerifyLastVoidedOrderWithBarTab() {
        check.verifyLastVoidedOrderWithTip();
    }


    @And("User swipe until last voided order with Bar Tab")
    public void userSwipeUntilLastVoidedOrderWithBarTab() throws Exception {
        check.swipeUntilLastVoidedOrderWithBarTab("up");
    }

    @And("User select last check with paid CC Side on Closed Check Tab")
    public void userSelectLastCheckWithPaidCCSideOnClosedCheckTab() {
        check.selectLastCheckWithPaidCCSideOnClosedTab();
    }

    @And("User verify last closed check on Closed Check Tab")
    public void userVerifyLastClosedCheckOnClosedCheckTab() {
        check.verifyLastClosedCheckOnClosedCheckTab();
    }

    @When("User select last closed order detail icon")
    public void userSelectLastClosedOrderDetailIcon() {
        check.selectLastClosedOrderDetailIcon();
    }

    @Then("User verify GiveX card number")
    public void userVerifyGiveXCardNumber() {
        check.verifyGiveXCardNumber();
    }

    @And("User verify GiveX charge amount")
    public void userVerifyGiveXChargeAmount() {
        check.verifyGiveXChargeAmount();
    }

    @Then("User verify GiveX card number on Order Summary")
    public void userVerifyGiveXCardNumberOnOrderSummary() {
        check.verifyGiveXCardNumberOnOrderSummary();
    }

    @Then("User select last active check for BarTab")
    public void userSelectLastActiveCheckForBarTab() {
        check.selectLastActiveCheckForBarTab();
    }

    @And("User select last active check for Dine In")
    public void userSelectLastActiveCheckForDineIn() {
        check.selectLastActiveCheckForDineIn();
    }



    @And("User verify last closed check for QSR")
    public void userVerifyLastClosedCheckForQSR() {
        check.verifyLastClosedCheckForQSR();
    }

    @When("User click Bar Tab on Check Status page")
    public void userClickBarTabOnCheckStatusPage() {
        check.clickBarTabOnCheckStatusPage();
    }

    @Then("User verify last phone order check total with gift card")
    public void userVerifyLastPhoneOrderCheckTotalWithGiftCard() {
        check.verifyLastPhoneOrderCheckTotalWithGiftCard();
    }


    @And("User select last closed check")
    public void userSelectLastClosedCheck() {
        check.selectLastClosedCheck();
    }

    @And("User select first closed check")
    public void userSelectFirstClosedCheck() {
        check.selectFirstClosedCheck();
    }

    @Then("User verify void last check")
    public void userVerifyVoidLastCheck() {
        check.verifyVoidLastCheck();
    }

    @Then("User select last closed check on Table Layout")
    public void userSelectLastClosedCheckOnTableLayout() {
        check.selectLastClosedCheckOnTableLayout();
    }

    @When("User select first closed check for DineIn order type")
    public void userSelectFirstClosedCheckForDineInOrderType() {
        check.selectFirstClosedCheckForDineInOrderType();
    }

}
