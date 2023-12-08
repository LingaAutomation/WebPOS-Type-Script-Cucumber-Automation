package com.qa.stepdef;

import com.qa.pages.TGMenuItemPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class TGCreateCheckStepDef {


    @When("User click All button")
    public void userClickAllButton() {
        new TGMenuItemPage().clickAllTab();
    }

    @Then("User click Table Layout menu")
    public void userClickTableLayoutMenu() {
        new TGMenuItemPage().clickTableLayoutTab();
    }

    @Then("User click New Check option")
    public void userClickNewCheckOption() {
        new TGMenuItemPage().clickNewCheckButton();
    }

    @And("User select table")
    public void userSelectTable() {
        new TGMenuItemPage().selectFirstTable();
    }

    @And("User enter number of seat")
    public void userEnterNumberOfSeat() {
        new TGMenuItemPage().selectNumberOfSeat();
    }

    @And("User verify menu screen")
    public void userVerifyMenuScreen() {
        new TGMenuItemPage().verifyMenuItemScreen();
    }

    @When("User click transfer button")
    public void userClickTransferButton() {
        new TGMenuItemPage().clickTransferButton();
    }

    @Then("User select transfer to table option")
    public void userSelectTransferToTableOption() {
        new TGMenuItemPage().selectTransferToTable();
    }

    @And("User select table from which will be transfer")
    public void userSelectTableFromWhichWillBeTransfer() {
        new TGMenuItemPage().selectTransferFromTable();
    }

    @And("User select check which will be transfer")
    public void userSelectCheckWhichWillBeTransfer() {
        new TGMenuItemPage().selectTransferedCheck();
    }

    @And("User select table to which will be transfer")
    public void userSelectTableToWhichWillBeTransfer() {
        new TGMenuItemPage().selectTransferToTable();
    }

    @And("User select click done button")
    public void userSelectClickDoneButton() {
        new TGMenuItemPage().clickTransferDone();
    }

    @And("User verify success transferred popup")
    public void userVerifySuccessTransferredPopup() {
        new TGMenuItemPage().verifySuccessTransferredPopup();
    }

    @When("User click Pay Check button")
    public void userClickPayCheckButton() {
        new TGMenuItemPage().clickPayCheck();
    }

    @Then("User select check")
    public void userSelectCheck() {
        new TGMenuItemPage().selectPayCheck();
    }


}

