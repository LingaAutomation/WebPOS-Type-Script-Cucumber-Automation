package com.qa.stepdef;

import com.qa.pages.TGBarTab;
import com.qa.pages. TGTransferPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TGTransferStepDef {

    @Then("User verify transfer screen")
    public void userVerifyTransferScreen() {
        new  TGTransferPage().verifyTransferScreen();
    }

    @Then("User click Transfer to Server button")
    public void userClickTransferToServerButton() {
        new  TGTransferPage().clickTransferToServerButton();
    }

    @And("User verify transfer to server page")
    public void userVerifyTransferToServerPage() {
        new  TGTransferPage().verifyTransferToServerPage();
    }

    @When("User select server which transfer from")
    public void userSelectServerWhichTransferFrom() {
        new  TGTransferPage().selectServerWhichTransferFrom();
    }

    @Then("User select Bar Tab order which transfer")
    public void userSelectBarTabOrderWhichTransfer() {
        new  TGTransferPage().selectBarTabOrderWhichTransfer();
    }

    @And("User select server which transfer to")
    public void userSelectServerWhichTransferTo() {
        new  TGTransferPage().selectServerWhichTransferTo();
    }

    @And("User continue if server closed")
    public void userContinueIfServerClosed() {
        new  TGTransferPage().userContinueIfServerClosed();
    }

    @And("User verify transfer success popup")
    public void userVerifyTransferSuccessPopup() {
        new  TGTransferPage().verifyTransferSuccessPopup();
    }

    @And("User click transfer done button")
    public void userClickTransferDoneButton() {
        new  TGTransferPage().clickTransferDoneButton();
    }

    @Then("User select Transfer Item button")
    public void userSelectTransferItemButton() {
        new  TGTransferPage().selectTransferItemButton();
    }

    @When("User select Bar Tab order for transfer menu item")
    public void userSelectBarTabOrderForTransferMenuItem() {
        new  TGTransferPage().selectBarTabOrderForTransferMenuItem();
    }

    @Then("User select menu item which is transferred")
    public void userSelectMenuItemWhichIsTransferred() {
        new  TGTransferPage().selectMenuItemWhichIsTransferred();
    }

    @And("User select Bar Tab which menu item transferred to")
    public void userSelectBarTabWhichMenuItemTransferredTo() {
        new  TGTransferPage().selectBarTabWhichMenuItemTransferredTo();
    }

    @Then("User click Transfer to Table button")
    public void userClickTransferToTableButton() {
        new  TGTransferPage().clickTransferToTableButton();
    }

    @When("User select table which is transfer from")
    public void userSelectTableWhichIsTransferFrom() {
        new  TGTransferPage().selectTableWhichIsTransferFrom();
    }

    @And("User select table which is transfer to")
    public void userSelectTableWhichIsTransferTo() {
        new  TGTransferPage().selectTableWhichIsTransferTo();
    }
}
