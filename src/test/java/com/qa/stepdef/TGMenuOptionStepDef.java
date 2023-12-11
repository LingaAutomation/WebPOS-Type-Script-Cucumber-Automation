package com.qa.stepdef;

import com.qa.pages.TGMenuOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TGMenuOptionStepDef {



    @When("User click Repeat menu option")
    public void userClickRepeatMenuOption() {
        new TGMenuOption().selectRepeatMenuOption();
    }

    @When("User click Quantity menu option")
    public void userClickQuantityMenuOption() {
        new TGMenuOption().selectQuantityMenuOption();
    }

    @Then("User enter number of quantity for add")
    public void userEnterNumberOfQuantity(){
        new TGMenuOption().enterQuantityOfOrder();
    }

    @When("User click Hold check option")
    public void userClickHoldCheckOption() {
        new TGMenuOption().clickHoldMenuOption();
    }
    @Then("User verify Hold screen")
    public void userVerifyHoldScreen() {
        new TGMenuOption().verifyHoldScreen();
    }

    @And("User verify Hold Automation and Hold Manuel options")
    public void userVerifyHoldAutomationAndHoldManuelOptions() {
        new TGMenuOption().verifyHoldTypeButtons();
    }

    @When("User select Fire menu option")
    public void userSelectFireMenuOption() {
        new TGMenuOption().clickFireMenuOption();
    }

    @When("User select Repeat menu option")
    public void userSelectRepeatMenuOption() {
        new TGMenuOption().clickRepeatMenuOption();
    }

    @And("User verify repeated menu item")
    public void userVerifyRepeatedMenuItem() {
        new TGMenuOption().verifyRepeatedMenuItem();
    }

    @When("User enter quantity of repeat menu item")
    public void userEnterQuantityOfRepeatMenuItem() {
        new TGMenuOption().enterQuantityOfRepeatMenuItem();
    }

    @Then("User verify quantity of menu item")
    public void userVerifyQuantityOfMenuItem() {
        new TGMenuOption().verifyQuantityOfOrder();
    }

    @When("User click Attach menu option")
    public void userClickAttachMenuOption() {
        new TGMenuOption().clickAttachMenuOption();
    }

    @Then("User select any notes for attach to menu item")
    public void userSelectAnyNotesForAttachToMenuItem() {
        new TGMenuOption().selectAnyAttachNote();
    }

    @And("User verify attached notes to menu item")
    public void userVerifyAttachedNotesToMenuItem() {
        new TGMenuOption().verifyAttachedNotes();
    }

    @When("User select ToGo menu option")
    public void userSelectToGoMenuOption() {
        new TGMenuOption().clickToGoMenuOption();
    }


    @When("User swipe until last new order")
    public void userSwipeUntilLastNewOrder() {

    }

    @Then("User enter number of quantity for decrease")
    public void userEnterNumberOfQuantityForDecrease() {
        new TGMenuOption().enterQuantityOfOrderForDecrease();
    }



}
