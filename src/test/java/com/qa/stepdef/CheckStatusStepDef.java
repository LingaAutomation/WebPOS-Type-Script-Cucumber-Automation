package com.qa.stepdef;

import com.qa.pages.CheckStatusScreen;
import io.cucumber.java.en.And;

public class CheckStatusStepDef {
    @And("^I select Closed Tab$")
    public void iSelectClosedTab() {
        new CheckStatusScreen().selectClosedChecksTab();
    }

    @And("^I should see the first closed check$")
    public void iShouldSeeTheClosedCheck() {
        new CheckStatusScreen().verifyClosedCheck1();
    }

    @And("^I should see the second closed check$")
    public void iShouldSeeTheSecondClosedCheck() {
        new CheckStatusScreen().verifyClosedCheck2();
    }

    /****** (Store)TOGO Order from combo ******/

    @And("^I click Complete tab$")
    public void iClickCompleteTab() throws InterruptedException {
        new CheckStatusScreen().selectCompleteTab();
    }

    @And("^I should see the STORE ToGo order's check is closed$")
    public void iShouldSeeTheSTOREToGoOrderSCheckIsClosed() {
        new CheckStatusScreen().verifyToGoCheckClosed();
    }

    @And("^I should see the New Tab in the Check Status screen and DELIVERY order is placed$")
    public void iShouldSeeTheNewTabInTheCheckStatusScreenAndDELIVERYOrderIsPlaced() {
        new CheckStatusScreen().verifyDeliveryOrderPlaced();
    }
}
