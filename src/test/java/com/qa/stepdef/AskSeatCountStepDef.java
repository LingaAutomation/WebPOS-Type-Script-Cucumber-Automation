package com.qa.stepdef;

import com.qa.pages.AskSeatNumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class AskSeatCountStepDef {

    @And("^I verify that ask seat count toggle is available$")
    public void iVerifyThatAskSeatCountToggleIsAvailable() throws Exception {
        new AskSeatNumber().verifyThatAskSeatCountIsAvailable();
    }

    @And("^I verify that ask seat count toggle is enabled$")
    public void iVerifyThatAskSeatCountToggleIsEnabled() throws Exception {
        new AskSeatNumber().verifyThatAskSeatCountIsEnabled();
    }

    @And("^I verify that ask seat count toggle is disabled$")
    public void iVerifyThatAskSeatCountToggleIsDisabled() throws Exception {
        new AskSeatNumber().verifyThatAskSeatCountIsDisabled();
    }

    @And ("^I verify that ask customer for Dine In is enabled$")
    public void iVerifyThatAskCustomerForDineInIsEnabled() throws Exception {
        new AskSeatNumber().verifyThatAskCustomerForDineInIsEnabled();
    }

    @And ("^I verify that ask customer for Dine In is disabled$")
    public void iVerifyThatAskCustomerForDineInIsDisabled() throws Exception {
        new AskSeatNumber().verifyThatAskCustomerForDineInIsDisabled();
    }

    @And ("^I select random table on the table layout$")
    public void iSelectRandomTableOnTheTableLayout(){
        new AskSeatNumber().selectRandomTable();
    }

    @When("^I should verify the ask seat number on the table layout$")
    public void iShouldVerifyTheAskSeatNumberOnTheTableLayout(){
        new AskSeatNumber().shouldVerifyTheAskSeatNumberOnTheTableLayout();
    }

    @When ("^I verify the seat count on the order screen$")
    public void iVerifyTheSeatCountOnTheOrderScreen(){
        new AskSeatNumber().verifySeatCountOnTheOrderScreen();
    }

    @When ("^I verify the seat count as \"([^\"]*)\" on the order screen$")
    public void iVerifyTheSeatCountAsOnTheOrderScreen(String value){
        new AskSeatNumber().verifySeatCountAsOnTheOrderScreen(value);
    }

    @And ("^I verify menu item on the order screen$")
    public void iVerifyMenuItemOnTheOrderScreen(){
        new AskSeatNumber().verifyMenuItemOnTheOrderScreen();
    }

    @And ("^I verify menu1 item on the order screen$")
    public void iVerifyMenu1ItemOnTheOrderScreen(){
        new AskSeatNumber().verifyMenu1ItemOnTheOrderScreen();
    }

    @And ("^I verify menu2 item on the order screen$")
    public void iVerifyMenu2ItemOnTheOrderScreen(){
        new AskSeatNumber().verifyMenu2ItemOnTheOrderScreen();
    }

    @And ("^I verify that service type should not changeable$")
    public void iVerifyThatServiceTypeShouldNotChangeable(){
        new AskSeatNumber().verifyThatServiceTypeShouldNotChangeable();
    }

    @And ("^I verify that service type should changeable$")
    public void iVerifyThatServiceTypeShouldChangeable(){
        new AskSeatNumber().verifyThatServiceTypeShouldChangeable();
    }

    @When ("^I should verify enter the number of customer popup$")
    public void iShouldVerifyEnterTheNumberOfCustomerPopup(){
        new AskSeatNumber().shouldVerifyEnterTheNumberOfCustomerPopup();
    }

    @When ("^I should verify enter the number of seats popup$")
    public void iShouldVerifyEnterTheNumberOfSeatsPopup(){
        new AskSeatNumber().shouldVerifyEnterTheNumberOfSeatsPopup();
    }

    @And ("^I click linga close button$")
    public void iClickLingaCloseBtn(){
        new AskSeatNumber().clickLingaCloseBtn();
    }
}
