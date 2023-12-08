package com.qa.stepdef;

//import com.qa.pages.TGCheckStatusPage;
import com.qa.pages.TGMenuItemPage;
import com.qa.pages.TGTableLayoutPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TGTableLayoutStepDef {

    @Then("User click split button")
    public void userClickSplitButton() {
        new TGTableLayoutPage().clickSplitButton();
    }

    @And("User click split check option")
    public void userSelectSplitCheckOption() {
        new TGTableLayoutPage().clickSplitCheckOption();
    }
    @And("User select first table")
    public void userSelectFirstTable() {
        new TGTableLayoutPage().selectTableForSplit();
    }
    @And("User click split by seat option")
    public void userClickSplitBySeatOption() {
        new TGTableLayoutPage().clickSplitBySeatOption();
    }


    @And("User verify empty check on table layout")
    public void userVerifyEmptyCheckOnTableLayout() {
        new TGTableLayoutPage().verifyEmptyTable();
    }
    @And("User close printer popup")
    public void userClosePrinterPopup() {
        new TGTableLayoutPage().closePrinterInfoPopup();
    }

    @When("User select another table for merge")
    public void userSelectAnotherTableForMerge() {
        new TGTableLayoutPage().selectSecondTableForMerge();
    }

    @When("User click merge button")
    public void userClickMergeButton() {
        new TGTableLayoutPage().clickMergeButton();
    }

    @Then("User select table which will be merge")
    public void userSelectTableWhichWillBeMerge() {
        new TGTableLayoutPage().selectTablesForMerge();
    }

    @And("User click merge done button")
    public void userClickMergeDoneButton() {
        new TGTableLayoutPage().clickMergeDoneButton();
    }

    @And("User verify merged tables on popup")
    public void userVerifyMergedTablesOnPopup() {
        new TGTableLayoutPage().closeMergedTablePopup();
    }

    @Then("User click operation button")
    public void userClickOperationButton() {
        new TGTableLayoutPage().clickOperationButton();
    }

    @When("User click Pay Check button on Table Layout")
    public void userClickPayCheckButtonOnTableLayout() {
        new TGTableLayoutPage().clickPayCheckButton();
    }
    @Then("User select second table")
    public void userSelectSecondTable() {
        new TGTableLayoutPage().selectSecondTable();
    }

    @And("User enter seat number")
    public void userEnterSeatNumber() {
        new TGTableLayoutPage().enterSeatNumber();
    }

    @When("User click selected table")
    public void userClickSelectedTable() {
        new TGTableLayoutPage().clickSelectedTable();
    }

    @And("User select table which has more than one seat")
    public void userSelectTableWhichHasMoreThanOneSeat() {
        new TGTableLayoutPage().selectTableWhichHasMoreThanOneSeat();
    }

    @And("User select last check if has more than one check")
    public void userSelectLastCheckIfHasMoreThanOneCheck() {
        new TGTableLayoutPage().selectLastCheckIfHasMoreThanOneCheck();
    }

    @When("User select first seat for merge")
    public void userSelectFirstSeatForMerge() {
        new TGTableLayoutPage().selectFirstSeatForMerge();
    }

    @And("User select first active table check")
    public void userSelectFirstActiveTableCheck() {
        new TGTableLayoutPage().selectFirstActiveTableCheck();
    }

    @And("User select second active table check")
    public void userSelectSecondActiveTableCheck() {
        new TGTableLayoutPage().selectSecondActiveTableCheck();
    }

    @Then("User select merged check on Table Layout")
    public void userSelectMergedCheckOnTableLayout() {
        new TGTableLayoutPage().selectMergedCheckOnTableLayout();
    }

    //    nov 19

    @Then("User select sixth table")
    public void userSelectSixthTable() {
        new TGTableLayoutPage().selectSixthTable();
    }

}
