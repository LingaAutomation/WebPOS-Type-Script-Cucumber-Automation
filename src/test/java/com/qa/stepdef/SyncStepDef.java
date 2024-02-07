package com.qa.stepdef;

import com.qa.pages.ClockInScreen;
import com.qa.pages.SyncClass1;
import com.qa.pages.SyncClass2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.apache.tools.ant.taskdefs.Sync;

import java.awt.*;

public class SyncStepDef {

    @Given("^I'm logged in for sync1$")
    public void iMLoggedInForSync() throws InterruptedException {
        new ClockInScreen().enterClockPinForPhone();
    }

    @And("^I move the cursor to the first$")
    public void iMoveTheCursorToTheFirst() throws InterruptedException, AWTException {
        new SyncClass1().moveToTheFirst();
    }

    @And("^I move the cursor to the second$")
    public void iMoveTheCursorToTheSecond() throws InterruptedException, AWTException {
      new SyncClass2().moveToTheSecond();
    }

    @Given("^I'm logged in for sync2$")
    public void iMLoggedInForSync1() throws InterruptedException {
        new ClockInScreen().enterClockPinForPhone1();
    }

    @And("^I close the order type window1$")
    public void iCloseTheOrderTypeWindow1() throws InterruptedException {
        new SyncClass1().pressCancelBtn1();
    }

    @And("^I close the order type window2$")
    public void iCloseTheOrderTypeWindow2() throws InterruptedException {
        new SyncClass2().pressCancelBtn2();
    }

    @And("^I click All button in order screen1$")
    public void iClickAllButtonInOrderScreen1() throws InterruptedException {
        new SyncClass1().clickAllButtonInOrderScreen1();
    }

    @And("^I click All button in order screen2$")
    public void iClickAllButtonInOrderScreen2() {
        new SyncClass2().clickAllButtonInOrderScreen2();
    }

    @And("^I click Table Layout Button1$")
    public void iClickTableLayoutButton1() throws InterruptedException {
        new SyncClass1().clickTableLayoutTab1();
    }

    @And("^I click Table Layout Button2$")
    public void iClickTableLayoutButton2() throws InterruptedException {
        new SyncClass2().clickTableLayoutTab2();
    }

    @And("^I click Check Stats tab1$")
    public void iClickCheckStatsTab1() throws InterruptedException {
        new SyncClass1().selectCheckStatsTab1();
    }

    @And("^I click Check Stats tab2$")
    public void iClickCheckStatsTab2() throws InterruptedException {
        new SyncClass2().selectCheckStatsTab2();
    }

}
