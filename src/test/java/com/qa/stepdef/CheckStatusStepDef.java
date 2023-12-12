package com.qa.stepdef;

import com.qa.pages.CheckStatusScreen;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class CheckStatusStepDef {

    public WebDriver driver = TestUtils.driver;

    @And("^I select Closed Tab$")
    public void iSelectClosedTab() {
        new CheckStatusScreen(driver).selectClosedChecksTab();
    }

    @And("^I should see the first closed check$")
    public void iShouldSeeTheClosedCheck() {
        new CheckStatusScreen(driver).verifyClosedCheck1();
    }

    @And("^I should see the second closed check$")
    public void iShouldSeeTheSecondClosedCheck() {
        new CheckStatusScreen(driver).verifyClosedCheck2();
    }

    /****** (Store)TOGO Order from combo ******/

    @And("^I click Complete tab$")
    public void iClickCompleteTab() throws InterruptedException {
        new CheckStatusScreen(driver).selectCompleteTab();
    }

    @And("^I should see the STORE ToGo order's check is closed$")
    public void iShouldSeeTheSTOREToGoOrderSCheckIsClosed() {
        new CheckStatusScreen(driver).verifyToGoCheckClosed();
    }

    @And("^I should see the New Tab in the Check Status screen and DELIVERY order is placed$")
    public void iShouldSeeTheNewTabInTheCheckStatusScreenAndDELIVERYOrderIsPlaced() {
        new CheckStatusScreen(driver).verifyDeliveryOrderPlaced();
    }
}
