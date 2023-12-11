package com.qa.stepdef;

import com.qa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TGOrderTypeWindowStepDef {
    public WebDriver driver = Hooks.driver;
//
//    @And("^I'm logged in")
//    public void iMLoggedIn() {
//        new TGClockInScreen().ClockIn();
//    }

    @And("^I select the order type FOR HERE$")
    public void iSelectTheOrderTypeFORHERE() {
        new TGOrderTypeWindow(driver).selectForHereOrderType();
    }


    @And("^I select the TO GO order type$")
    public void iSelectTheTOGOOrderType() {
        new TGOrderTypeWindow(driver).selectToGoOrderType();
    }

    @And("^I select the DELIVERY order types$")
    public void iSelectTheDELIVERYOrderType() {
        new TGOrderTypeWindow(driver).selectDeliveryOrderType();
    }

    @And("^I select the Phone To Go order types$")
    public void iSelectThePhoneToGoOrderType() {
        new TGOrderTypeWindow(driver).selectPhoneToGoOrderType();
    }

    @And("^I select the Phone Delivery order types$")
    public void iSelectThePhoneDeliveryOrderType() {
        new TGOrderTypeWindow(driver).selectPhoneDeliveryOrderType();
    }

    @When("^I click Done button to select the order types$")
    public void iClickDoneButtonToSelectTheOrderType() {
        new TGOrderTypeWindow(driver).pressDoneBtn();
    }

    @Then("^I should see the Customers Profile page with title \"([^\"]*)\"$")
    public void iShouldSeeTheCustomerProfilePageWithTitle(String title) {
        Assert.assertEquals(new TGCustomerProfilePage().getTitle(), title);
    }


    @Then("User select ForHere order type")
    public void userSelectForHereOrderType() {
        new TGOrderTypeWindow(driver).selectForHereOrderType();
    }

    @Then("User select ForHere order type in QSR Bar")
    public void userSelectForHereOrderTypeInQSRBar() {
        new TGOrderTypeWindow(driver).selectForHereOrderTypeInQSRBar();
    }

    @And("User select Now delivery option")
    public void userSelectNowDeliveryOption() {
        new TGOrderTypeWindow(driver).selectNowDeliveryOption();
    }

    @And("User click done button for order type")
    public void userClickDoneButtonForOrderType() {
        new TGOrderTypeWindow(driver).clickDoneButtonForOrderType();
    }

    @And("User select Later delivery option")
    public void userSelectLaterDeliveryOption() {
        new TGOrderTypeWindow(driver).selectLaterDeliveryOption();
    }

    @And("User select any delivery date for later")
    public void userSelectAnyDeliveryDateForLater() {
        new TGOrderTypeWindow(driver).selectDeliveryDate();
    }

    @When("User select Phone ToGo order type")
    public void userSelectPhoneToGoOrderType() {
        new TGOrderTypeWindow(driver).selectPhoneToGoOrderType();
    }

    @When("User select Phone Delivery order type")
    public void userSelectPhoneDeliveryOrderType() {
        new TGOrderTypeWindow(driver).selectPhoneDeliveryOrderType();
    }

    @When("User select Delivery order type")
    public void userSelectDeliveryOrderType() {
        new TGOrderTypeWindow(driver).selectDeliveryOrderType();
    }

    @Then("User select last future order")
    public void userSelectLastFutureOrder() {
        new TGOrderTypeWindow(driver).selectLastFutureOrder();
    }

    @When("User click printer button")
    public void userClickPrinterButton() {
        new TGOrderTypeWindow(driver).clickPrinterButton();
    }

    @When("User click cancel order button")
    public void userClickCancelOrderButton() {
        new TGOrderTypeWindow(driver).clickCancelOrder();
    }

    @Then("User select last new order")
    public void userSelectLastNewOrder() {
        new TGOrderTypeWindow(driver).selectLastNewOrder();
    }

    @When("User select last new order for For Here order type")
    public void userSelectLastNewOrderForForHereOrderType() {
        new TGOrderTypeWindow(driver).selectLastNewOrderForHereOrderType();
    }

    @When("User select last new order for Dine In order type")
    public void userSelectLastNewOrderForDineInOrderType() {
        new TGOrderTypeWindow(driver).selectLastNewOrderDineInOrderType();
    }

    @And("User verify last voided order")
    public void userVerifyLastVoidedOrder() {
        new TGOrderTypeWindow(driver).verifyVoidOrder();
    }

    @Then("User verify last new order")
    public void userVerifyLastNewOrder() {
        new TGOrderTypeWindow(driver).verifyLastNewOrder();
    }

    @And("User verify last check total")
    public void userVerifyLastCheckTotal() {
        new TGOrderTypeWindow(driver).verifyLastFutureOrder();
    }

    @Then("User click Future Tab below Check Status")
    public void userClickFutureTabBelowCheckStatus() {
        new TGOrderTypeWindow(driver).clickFutureButtonBelowPhoneOrder();
    }

    @And("User verify last future order below Check Status")
    public void userVerifyLastFutureOrderBelowCheckStatus() {
        new TGOrderTypeWindow(driver).verifyLastFutureOrder();
    }

    @Then("User close popup if payment made on")
    public void userClosePopupIfPaymentMadeOn() {
        new TGOrderTypeWindow(driver).paymentMadeOnPopup();
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
