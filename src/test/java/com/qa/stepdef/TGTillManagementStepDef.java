package com.qa.stepdef;

import com.qa.pages.*;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TGTillManagementStepDef {

    @Then("User enter amount of money for Till Balance")
    public void userEnterAmountOfMoneyForTillBalance() {
        new TGTillManagementScreen().enterTillBalance();
    }

    @And("User verify till balance")
    public void userVerifyTillBalance() {
        new TGTillManagementScreen().verifyTillBalance();
    }

    @When("User select active till balance")
    public void userSelectActiveTillBalance() {
        new TGTillManagementScreen().selectActiveTillBalance();
    }

    @Then("User click Close Till button")
    public void userClickCloseTillButton() {
        new TGTillManagementScreen().clickTillCloseButton();
    }

    @And("User click yes button for close till")
    public void userClickYesButtonForCloseTill() {
        new TGTillManagementScreen().YesOptionCloseTillButton();
    }

    @Then("User verify ending cash in Till")
    public void userVerifyEndingCashInTill() {
        new TGTillManagementScreen().verifyClosedTill();
    }

    @And("User click till submit button")
    public void userClickTillSubmitButton() {
        new TGTillManagementScreen().clickTillSubmitButton();

    }

    @Then("User click Set Till button")
    public void userClickSetTillButton() {
        new TGTillManagementScreen().clickSetTillButton();
    }

    @When("User verify Open Till page")
    public void userVerifyOpenTillPage() {
        new TGTillManagementScreen().verifyOpenTillPage();
    }

    @Then("User enter till amount")
    public void userEnterTillAmount() {
        new TGTillManagementScreen().enterTillAmount();
    }

    @Then("User verify last active till")
    public void userVerifyLastActiveTill() {
        new TGTillManagementScreen().verifyLastActiveTill();
    }

    @When("User close user global if enable")
    public void userCloseUserGlobalIfEnable() throws Exception {
        new TGTillManagementScreen().closeUserGlobalOptionIfEnable();
    }

    @Then("User open global till option if disable")
    public void userOpenGlobalTillOptionIfDisable() throws Exception {
        new TGTillManagementScreen().openUserGlobalOptionIfDisable();
    }

    @When("User select last active till")
    public void userSelectLastActiveTill() {
        new TGTillManagementScreen().selectLastActiveTill();
    }

    @Then("User click Pay In tab")
    public void userClickPayInTab() {
        new TGTillManagementScreen().clickPayInTab();
    }

    @When("User enter Paid By")
    public void userEnterPaidBy() {
        new TGTillManagementScreen().enterPaidBy();
    }

    @Then("User enter paid in amount")
    public void userEnterPaidInAmount() {
        new TGTillManagementScreen().enterPaidInAmount();
    }

    @And("User select Paid Reason")
    public void userSelectPaidReason() {
        new TGTillManagementScreen().selectPaidReason();
    }

    @And("User verify paid in successfull popup info")
    public void userVerifyPaidInSuccessfullPopupInfo() {
        new TGTillManagementScreen().verifyPaidInSuccessfullPopupInfo();
    }

    @Then("User click Pay Out tab")
    public void userClickPayOutTab() {
        new TGTillManagementScreen().clickPayOutTab();
    }

    @When("User enter Paid To")
    public void userEnterPaidTo() {
        new TGTillManagementScreen().enterPaidTo();
    }

    @Then("User enter paid out amount")
    public void userEnterPaidOutAmount() {
        new TGTillManagementScreen().enterPaidOutAmount();
    }

    @Then("User verify updated active till balance")
    public void userVerifyUpdatedActiveTillBalance() {
        new TGTillManagementScreen().verifyUpdatedActiveTillBalance();
    }

    @When("User select Paid Out Reason")
    public void userSelectPaidOutReason() {
        new TGTillManagementScreen().selectPaidOutReason();
    }

    @And("User verify paid out successfull popup info")
    public void userVerifyPaidOutSuccessfullPopupInfo() {
        new TGTillManagementScreen().verifyPaidOutSuccessfullPopupInfo();
    }

    @Then("User select last active till if exist")
    public void userSelectLastActiveTillIfExist() {
        new TGTillManagementScreen().selectLastActiveTillIfExist();
    }

    @When("User click Cash Drop tab")
    public void userClickCashDropTab() {
        new TGTillManagementScreen().clickCashDropTab();
    }

    @Then("user enter cash drop amount")
    public void userEnterCashDropAmount() {
        new TGTillManagementScreen().enterCashDropAmount();
    }

    @And("User verify cash drop successful popup")
    public void userVerifyCashDropSuccessfulPopup() {
        new TGTillManagementScreen().verifyCashDropSuccessfulPopup();
    }

    @Then("User select active till")
    public void userSelectActiveTill() {
        new TGTillManagementScreen().selectActiveTill();
    }

    @Then("User enter cash drop limit")
    public void userEnterCashDropLimit() {
        new TGTillManagementScreen().enterCashDropLimit();
    }

    //new (nov15)
    @Then("User select last active till if exist First")
    public void userSelectLastActiveTillIfExistFirst() {
        new TGTillManagementScreen().selectLastActiveTillIfExistFirst();
    }
}
