package com.qa.stepdef;

import com.qa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class TGOrderTypeWindowStepDef {
//
//    @And("^I'm logged in")
//    public void iMLoggedIn() {
//        new TGClockInScreen().ClockIn();
//    }

    @And("^I select the order type FOR HERE$")
    public void iSelectTheOrderTypeFORHERE() {
        new TGOrderTypeWindow().selectForHereOrderType();
    }


    @And("^I select the TO GO order type$")
    public void iSelectTheTOGOOrderType() {
        new TGOrderTypeWindow().selectToGoOrderType();
    }

    @And("^I select the DELIVERY order types$")
    public void iSelectTheDELIVERYOrderType() {
        new TGOrderTypeWindow().selectDeliveryOrderType();
    }

    @And("^I select the Phone To Go order types$")
    public void iSelectThePhoneToGoOrderType() {
        new TGOrderTypeWindow().selectPhoneToGoOrderType();
    }

    @And("^I select the Phone Delivery order types$")
    public void iSelectThePhoneDeliveryOrderType() {
        new TGOrderTypeWindow().selectPhoneDeliveryOrderType();
    }

    @When("^I click Done button to select the order types$")
    public void iClickDoneButtonToSelectTheOrderType() {
        new TGOrderTypeWindow().pressDoneBtn();
    }

    @Then("^I should see the Customers Profile page with title \"([^\"]*)\"$")
    public void iShouldSeeTheCustomerProfilePageWithTitle(String title) {
        Assert.assertEquals(new TGCustomerProfilePage().getTitle(), title);
    }


    @Then("User select ForHere order type")
    public void userSelectForHereOrderType() {
        new TGOrderTypeWindow().selectForHereOrderType();
    }

    @Then("User select ForHere order type in QSR Bar")
    public void userSelectForHereOrderTypeInQSRBar() {
        new TGOrderTypeWindow().selectForHereOrderTypeInQSRBar();
    }

    @And("User select Now delivery option")
    public void userSelectNowDeliveryOption() {
        new TGOrderTypeWindow().selectNowDeliveryOption();
    }

    @And("User click done button for order type")
    public void userClickDoneButtonForOrderType() {
        new TGOrderTypeWindow().clickDoneButtonForOrderType();
    }

    @And("User select Later delivery option")
    public void userSelectLaterDeliveryOption() {
        new TGOrderTypeWindow().selectLaterDeliveryOption();
    }

    @And("User select any delivery date for later")
    public void userSelectAnyDeliveryDateForLater() {
        new TGOrderTypeWindow().selectDeliveryDate();
    }

    @When("User select Phone ToGo order type")
    public void userSelectPhoneToGoOrderType() {
        new TGOrderTypeWindow().selectPhoneToGoOrderType();
    }

    @When("User select Phone Delivery order type")
    public void userSelectPhoneDeliveryOrderType() {
        new TGOrderTypeWindow().selectPhoneDeliveryOrderType();
    }

    @When("User select Delivery order type")
    public void userSelectDeliveryOrderType() {
        new TGOrderTypeWindow().selectDeliveryOrderType();
    }

    @Then("User select last future order")
    public void userSelectLastFutureOrder() {
        new TGOrderTypeWindow().selectLastFutureOrder();
    }

    @When("User click printer button")
    public void userClickPrinterButton() {
        new TGOrderTypeWindow().clickPrinterButton();
    }

    @When("User click cancel order button")
    public void userClickCancelOrderButton() {
        new TGOrderTypeWindow().clickCancelOrder();
    }

    @Then("User select last new order")
    public void userSelectLastNewOrder() {
        new TGOrderTypeWindow().selectLastNewOrder();
    }

    @When("User select last new order for For Here order type")
    public void userSelectLastNewOrderForForHereOrderType() {
        new TGOrderTypeWindow().selectLastNewOrderForHereOrderType();
    }

    @When("User select last new order for Dine In order type")
    public void userSelectLastNewOrderForDineInOrderType() {
        new TGOrderTypeWindow().selectLastNewOrderDineInOrderType();
    }

    @And("User verify last voided order")
    public void userVerifyLastVoidedOrder() {
        new TGOrderTypeWindow().verifyVoidOrder();
    }

    @Then("User verify last new order")
    public void userVerifyLastNewOrder() {
        new TGOrderTypeWindow().verifyLastNewOrder();
    }

    @And("User verify last check total")
    public void userVerifyLastCheckTotal() {
        new TGOrderTypeWindow().verifyLastFutureOrder();
    }

    @Then("User click Future Tab below Check Status")
    public void userClickFutureTabBelowCheckStatus() {
        new TGOrderTypeWindow().clickFutureButtonBelowPhoneOrder();
    }

    @And("User verify last future order below Check Status")
    public void userVerifyLastFutureOrderBelowCheckStatus() {
        new TGOrderTypeWindow().verifyLastFutureOrder();
    }

    @Then("User close popup if payment made on")
    public void userClosePopupIfPaymentMadeOn() {
        new TGOrderTypeWindow().paymentMadeOnPopup();
    }

    @When("^User click \"([^\"]*)\" on Menu Item page \"([^\"]*)\"$")
    public void userClickOnMenuItemPage(String btnServiceType,String msg){
        new CIWaitListPage().commonBtn(btnServiceType,msg);
    }

    @And("^I click the \"([^\"]*)\" in the customer profile page \"([^\"]*)\"$")
    public void iClickTheInTheCustomerProfilePage(String btnClose, String msg) {
        new CICloseDayScreen().btnCustomerProfileClose(btnClose, msg);
    }
}
