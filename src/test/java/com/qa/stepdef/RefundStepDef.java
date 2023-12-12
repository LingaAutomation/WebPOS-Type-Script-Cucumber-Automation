package com.qa.stepdef;

import com.qa.pages.RefundScreen;
import com.qa.pages.TillManagementScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.qa.utils.TestUtils.driver;

public class RefundStepDef {

    @And("^I click Refund button in the operation window$")
    public void iClickRefundButtonInTheOperationWindow(){
        new RefundScreen().clickRefundButton();
    }

    @When("^I should verify no checks found popup in Refund screen$")
    public void iShouldVerifyNoChecksFoundPopupInRefundScreen(){
        new RefundScreen().verifyNoChecksFoundPopup();
    }

    @When ("^I search the closed check in refund screen$")
    public void iSearchTheClosedCheckInRefundScreen() throws InterruptedException {
        new RefundScreen().searchTheClosedCheckInRefundScreen();
    }

    @And ("^I click refund button in the refund screen$")
    public void iClickRefundButtonInTheRefundScreen(){
        new RefundScreen().clickRefundButtonInRefundScreen();
    }

    @And ("^I verify check number in refund amount window$")
    public void iVerifyCheckNumberInRefundAmountWindow(){
        new RefundScreen().verifyCheckNumberInRefundAmountWindow();
    }

    @And ("^I verify check number in refund order screen$")
    public void iVerifyCheckNumberInRefundOrderScreen(){
        new RefundScreen().verifyCheckNumberWithRefundOrderSCreen();
    }
    @And ("^I verify total of menu in Refund screen amount$")
    public void iVerifyTotalOfMenuInRefundScreenAmount(){
        new RefundScreen().verifyTotalOfMenuInRefundScreenAmount();
    }
    @And ("^I verify check amount same with refund window amount and also defaulty check amount in number pad$")
    public void iVerifyCheckAmountSameWithRefundWindowAmountAndAlsoDefaultyCheckAmountInNumberPad(){
        new RefundScreen().verifyCheckAmountSameWithRefundWindowAmount();
    }

    @And ("^I click cancel button in the refund window$")
    public void iClickCancelButtonInTheRefundWindow(){
        new RefundScreen().clickCancelBtn();
    }

    @When ("^I enter the reason in the Refund window$")
    public void iEnterTheReasonInTheRefundWindow(){
        new RefundScreen().enterTheReasonInTheRefundWindow();
    }

    @When ("^I enter the reason in the Refund Order Screen$")
    public void iEnterTheReasonInTheRefundOrderScreen(){
        new RefundScreen().enterTheReasonInTheRefundOrderScreen();
    }

    @When ("^I enter the payment as \"([^\"]*)\" in the refund window$")
    public void iEnterThePaymentAsInTheRefundWindow(String payment){
        new RefundScreen().enterThePaymentInRefundWindow(payment);
    }

    @When ("^I enter the payment as \"([^\"]*)\" in the fast cash window$")
    public void iEnterThePaymentAsInTheFastCashWindow(String payment){
        new RefundScreen().enterThePaymentInRefundWindow(payment);
    }

    @Then("^I should see do you want to refund confirm popup$")
    public void iShouldSeeDoYouWantToRefundConfirmPopup(){
        new RefundScreen().verifyThePopupAsDoYouWantToRefundConfirm();
    }

    @Then ("^I should see refund success popup$")
    public void iShouldSeeRefundSuccessPopup() throws InterruptedException {
        new RefundScreen().verifyRefundSuccessPopup();
    }

    @Then ("^I should see the amount exceeds the paid amount popup$")
    public void iShouldSeeTheAmountExceedsThePaidAmountPopup(){
        new RefundScreen().verifyTheAmountExceedsThePaidAmountPopup();
    }
    @When ("^I enter the huge value than the refund value in refund window$")
    public void iEnterTheHugeValueThanTheRefundValueInRefundWindow(){
        new RefundScreen().enterTheHugeValueThanTheRefundValue();
    }

    @When ("^I enter the same value of the refund value in refund window$")
    public void iEnterTheSameValueOfTheRefundValueInRefundWindow(){
        new RefundScreen().enterTheSameValueOfTheRefundValue();
    }

    @When ("^I click refund without receipt button in the refund window$")
    public void iClickRefundWithoutReceiptButtonInTheRefundWindow(){
        new RefundScreen().clickRefundWithoutReceiptButton();
    }

    @Then ("^I should verify defaulty number pad should have \"([^\"]*)\" on the refund window$")
    public void iShouldVerifyDefaultyNumberPadShouldHaveOnTheRefundWindow(String amount){
        new RefundScreen().verifyNumberPadHasZero(amount);
    }

    @And ("^I enter the amount as \"([^\"]*)\" on the refund window$")
    public void iEnterTheAmountOnTheRefundWindow(String amount){
        new RefundScreen().enterTheAmount(amount);
    }

    @And ("^I enter the refund reason as \"([^\"]*)\" on the refund window$")
    public void iEnterTheRefundReasonAsOnTheRefundWindow(String refund){
        new RefundScreen().enterTheRefundReason(refund);
    }

    @And ("^I click refund menu items button on the refund screen$")
    public void iClickRefundMenuItemsButtonOnTheRefundWindow(){
        new RefundScreen().clickRefundMenuItemsBtn();
    }

    @Then ("^I should see please select the check popup$")
    public void iShouldSeePleaseSelectTheCheckPopup(){
        new RefundScreen().verifyPleaseSelectCheckPopup();
    }

    @Then ("^I should verify the refund check number with order screen check number$")
    public void iShouldVerifyTheRefundCheckNumberWithOrderScreenCheckNumber(){
        new RefundScreen().verifyRefundCheckNumberWithOrderScreenCheckNumber();
    }

    @And ("^I click the refund check button on the refund order screen$")
    public void iClickTheRefundCheckButtonOnTheRefundOrderScreen(){
        new RefundScreen().clickRefundCheckBtn();
    }

    @Then ("^I should verify the button as \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" on the refund order screen$")
    public void iShouldVerifyTheButtonAsOnTheRefundOrderScreen(String name, String name1, String name2){
        new RefundScreen().verifyTheButtonAs(name,name1,name2);
    }

    @Then ("^I should see check is refunded already popup$")
    public void iShouldSeeCheckIsRefundedAlreadyPopup(){
        new RefundScreen().verifyCheckIsRefundedAlready();
    }

    @And ("^I click refund items on the refund order screen$")
    public void iClickRefundItemsOnTheRefundOrderScreen(){
        new RefundScreen().clickRefundItemsBtn();
    }

    @And ("^I click Done button on the refund order screen$")
    public void iClickDoneButtonOnTheRefundOrderScreen(){
        new RefundScreen().clickDoneRefundScreen();
    }

    @And ("^I select the menu in the Refund order screen$")
    public void iSelectTheMenuInTheRefundOrderScreen() throws InterruptedException {
        new RefundScreen().clickTheMenuOnTheRefundScreen();
    }
}
