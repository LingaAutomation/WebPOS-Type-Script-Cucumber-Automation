package com.qa.stepdef;

import com.qa.pages.TGCheckStatusPage;
//import com.qa.pages.TGMenuItemPage;
//import com.qa.pages.TGPaymentPage;
import com.qa.pages.TGMenuItemPage;
import com.qa.pages.TGPaymentPage;
import com.qa.utils.TestUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class TGCheckStatusStepDef {

    TGCheckStatusPage checkStatus = new TGCheckStatusPage();
    TestUtils utils = new TestUtils();


    //new

    @When("User take an order in check status screen")
    public void userTakeAnOrderInCheckStatusScreen() throws InterruptedException {
        checkStatus.takeOrder();
    }

    @Then("User click Active Checks tabs in check status screen")
    public void userClickActiveChecksTabsInCheckStatusScreen() {
        checkStatus.clickActiveChecks();
    }

    @Then("User click Closed Checks tabs in check status screen")
    public void userClickClosedChecksTabsInCheckStatusScreen() {
        checkStatus.clickClosedChecks();
    }


    @When("User select void reason in check status screen")
    public void userSelectVoidReasonInCheckStatusScreen() {
        checkStatus.selectFirstVoidReason();

    }

    @And("User click Void Checks tabs in check status screen")
    public void userClickVoidChecksTabsInCheckStatusScreen() throws InterruptedException {
        checkStatus.clickVoidChecksTab();
    }

    @When("User select QSR order typ in check status screen")
    public void userSelectQSROrderTypInCheckStatusScreen() {
        checkStatus.clickQSROrderType();
    }

    @Given("Login with valid pin in check status screen")
    public void loginWithValidPinInCheckStatusScreen() {
        checkStatus.logInWithValidPin();
    }

    @And("^I click on \"([^\"]*)\" for closing order screen popup in check status screen \"([^\"]*)\"$")
    public void iPressOnCancelButtonInCheckStatusScreen(String btnCancelXPath, String msg) {
        checkStatus.commonAccessibilityId(btnCancelXPath, msg);
    }

    @When("User click QSR on Menu Item page in check status screen")
    public void userClickQSROnMenuItemPageInCheckStatusScreen() {
        checkStatus.clickQsrOrderType();
    }

    @Given("User select DineIn mode in check status screen")
    public void userSelectDineInModeInCheckStatusScreen() {
        checkStatus.selectDineInOrderType();
    }

    @And("^I select the \"([^\"]*)\" in the Table layout screen in check status screen \"([^\"]*)\"$")
    public void iSelectTheTableInTheTableLayoutScreenInCheckStatusScreen(String btnTable,String msg) {
        checkStatus.clickBtnPayment(btnTable,msg);
    }

    @And("User click food category in check status screen")
    public void userClickFoodCategoryInCheckStatusScreen() {
        checkStatus.clickFoodTab();
    }

//    @When("User take an order in check status screen")
//    public void userTakeAnOrderInCheckStatusScreen() {
//        checkStatus.takeOrder();
//    }

    @When("^I get the check no in the order screen in check status screen \"([^\"]*)\"$")
    public void iGetTheCheckNoInTheOrderScreenInCheckStatusScreen(String msg) {
        checkStatus.getCheckNumber(msg);
    }

    @And("^I click \"([^\"]*)\" in the order screen for closing order in check status screen \"([^\"]*)\"$")
    public void iClickInTheOrderScreenForClosingOrderInCheckStatusScreen(String btnFinish, String msg) {
        checkStatus.commonBtnClickOption(btnFinish,msg);
    }

    @And("I click \"([^\"]*)\" in the All Tab Screen in check status screen \"([^\"]*)\"$")
    public void iClickInTheAllTabScreenInCheckStatusScreen(String btnAll, String msg) {
        checkStatus.commonBtnClick(btnAll,msg);
    }

    @Then("^I should see and select the closed check as in check status screen \"([^\"]*)\"$")
    public void iShouldSeeAndSelectTheClosedCheckAsInCheckStatusScreen(String msg) {
        checkStatus.passCheckNumber();
        utils.log().info(msg);
    }

    @Then("^I should verify the checks in check status screen \"([^\"]*)\"$")
    public void iShouldVerifyTheChecksInCheckStatusScreen(String msg) {
        boolean value=checkStatus.getVoidCheck(msg);
        Assert.assertTrue(value);
    }

    @Then("User click Cash Tab in check status screen")
    public void userClickCashTabInCheckStatusScreen() {
        checkStatus.clickCashButton();
    }

    @And("User click exact option in check status screen")
    public void userClickExactOptionInCheckStatusScreen() {
        checkStatus.clickExactButtonOnCashTab();
    }

    @Then("User click enter button in check status screen")
    public void userClickEnterButtonInCheckStatusScreen() {
        checkStatus.clickEnterButtonOnCashButton();
    }

    @Then("User click cancel button in check status screen")
    public void userClickCancelButtonInCheckStatusScreen() {
        checkStatus.pressCancel();
    }

    @Then("User click void button in check status screen")
    public void userClickVoidButtonInCheckStatusScreen() {
        checkStatus.clickVoidButton();
    }

    @And("User click add void button in check status screen")
    public void userClickAddVoidButtonInCheckStatusScreen() {
        checkStatus.clickAddVoidReasonButton();
    }

    @Then("User click done button on modifier in check status screen")
    public void userClickDoneButtonOnModifierInCheckStatusScreen() {
        checkStatus.clickModifierDoneButton();
    }

    @Then("User click payment button in check status screen")
    public void userClickPaymentButtonInCheckStatusScreen() {
        checkStatus.clickPaymentButtonOnMenuItemPage();
    }

    @And("USer click cash button in check status screen")
    public void userClickCashButtonInCheckStatusScreen() {
        checkStatus.clickCashButton1();
    }

    @And("^I select the credit card check in the payment screen in check status screen \"([^\"]*)\"$")
    public void iSelectTheCreditCardCheckInThePaymentScreenInCheckStatusScreen(String msg) {
        checkStatus.clickOptCreditCardAmount(msg);
    }

    @When("^I click Delete in the payment screen in check status screen \"([^\"]*)\"$")
    public void iClickDeleteInThePaymentScreenInCheckStatusScreen(String msg) {
        checkStatus.clickBtnDelete(msg);
    }

    @And("^I click \"([^\"]*)\" in the receipt printer popup in check status screen \"([^\"]*)\"$")
    public void iClickBtnOkInTheReceiptPrinterPopupInCheckStatusScreen(String btnOkXPath, String msg) {
        checkStatus.ClickBtnOk(btnOkXPath, msg);
    }

    @When("^I click Exit in the payment screen in check status screen \"([^\"]*)\"$")
    public void iClickExitInThePaymentScreenInCheckStatusScreen(String msg) {
        checkStatus.ClickBtnExit(msg);
    }

    @When("User click All button in check status screen")
    public void userClickAllButtonInCheckStatusScreen() {
        checkStatus.clickAllTab();
    }

    @When("USer click log off button in check status screen")
    public void userClickLogOffButtonInCheckStatusScreen() {
        checkStatus.clickLogOffButton();
    }



    @When("User select QSR order typ")
    public void userSelectQSROrderTyp() {
        new TGCheckStatusPage().clickQSROrderType();
    }

    @When("User select void reason")
    public void userSelectVoidReason() {
        new TGCheckStatusPage().selectFirstVoidReason();

    }
    @And("User click Void Checks tabs")
    public void userClickVoidChecksTabs() throws InterruptedException {
        new TGCheckStatusPage().clickVoidChecksTab();
    }
    @Then("User click Closed Checks tabs")
    public void userClickClosedChecksTabs() {
        new TGCheckStatusPage().clickClosedChecks();
    }

    @Then("User click Active Checks tabs")
    public void userClickActiveChecksTabs() {
        new TGCheckStatusPage().clickActiveChecks();
    }
    @When("User take an order")
    public void userTakeAnOrder() throws InterruptedException {
        new TGCheckStatusPage().takeOrder();
    }





}
