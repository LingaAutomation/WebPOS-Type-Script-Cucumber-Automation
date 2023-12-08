package com.qa.stepdef;

import com.qa.pages.TGBatchTipAdjustmentPage;
import com.qa.pages.TGMenuItemPage;
import com.qa.pages.TGOperationPage;
import com.qa.pages.TGPaymentPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TGBatchTipAdjustmentStepDef {


    @When("User select device type for Batch and Adjustment")
    public void userSelectDeviceTypeForBatchAndAdjustment() {
        new TGBatchTipAdjustmentPage().selectDeviceTypeForBatchAndAdjustment();
    }

    @Then("User enter tip for paid check with CC Side")
    public void userEnterTipForPaidCheckWithCCSide() {
        new TGBatchTipAdjustmentPage().enterTipForPaidCheckWithCCSide();
    }

    @Then("User swipe until last closed check which is paid with CC Side")
    public void userSwipeUntilLastClosedCheckWhichIsPaidWithCCSide() throws Exception {
        new TGBatchTipAdjustmentPage().swipeUntilLastClosedCheckWhichIsPaidWithCCSide("up");
    }

    @And("User select last check with paid CC Side")
    public void userSelectLastCheckWithPaidCCSide() {
        new TGBatchTipAdjustmentPage().selectLastCheckWithPaidCCSide();
    }

    @Then("User verify tip for paid check with CC Side")
    public void userVerifyTipForPaidCheckWithCCSide() {
        new TGBatchTipAdjustmentPage().verifyTipForPaidCheckWithCCSide();
    }

//nov 29
    @Then("User verify tip for paid check with CC Side1")
    public void userVerifyTipForPaidCheckWithCCSide1() {
        new TGBatchTipAdjustmentPage().verifyTipForPaidCheckWithCCSide1();
    }

    @Then("User swipe until last CC Side payment method on Batch and Adjustment page")
    public void userSwipeUntilLastCCSidePaymentMethodOnBatchAndAdjustmentPage() throws Exception {
        new TGBatchTipAdjustmentPage().swipeUntilLastCCSidePaymentMethodOnBatchAndAdjustmentPage("up");
    }

    @When("User enter new tip amount on Batch and Adjustment page")
    public void userEnterNewTipAmountOnBatchAndAdjustmentPage() {
        new TGBatchTipAdjustmentPage().enterNewTipAmountOnBatchAndAdjustmentPage();
    }

    @Then("User verify new tip amount on Batch and Adjustment page")
    public void userVerifyNewTipAmountOnBatchAndAdjustmentPage() throws Exception {
        new TGBatchTipAdjustmentPage().verifyNewTipAmountOnBatchAndAdjustmentPage("up");
    }

    @And("User is directed menu item page")
    public void userIsDirectedMenuItemPage() {
        new TGBatchTipAdjustmentPage().directedMenuItemPage();
        new TGMenuItemPage().verifyMenuItemPageWithBarTab();
    }
}
