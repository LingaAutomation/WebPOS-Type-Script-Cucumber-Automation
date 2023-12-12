package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TGTillManagementStepDef {

    public WebDriver driver = TestUtils.driver;

    @Then("User enter amount of money for Till Balance")
    public void userEnterAmountOfMoneyForTillBalance() {
        new TGTillManagementScreen(driver).enterTillBalance();
    }

    @And("User verify till balance")
    public void userVerifyTillBalance() {
        new TGTillManagementScreen(driver).verifyTillBalance();
    }

    @When("User select active till balance")
    public void userSelectActiveTillBalance() {
        new TGTillManagementScreen(driver).selectActiveTillBalance();
    }

    @Then("User click Close Till button")
    public void userClickCloseTillButton() {
        new TGTillManagementScreen(driver).clickTillCloseButton();
    }

    @And("User click yes button for close till")
    public void userClickYesButtonForCloseTill() {
        new TGTillManagementScreen(driver).YesOptionCloseTillButton();
    }

    @Then("User verify ending cash in Till")
    public void userVerifyEndingCashInTill() {
        new TGTillManagementScreen(driver).verifyClosedTill();
    }

    @And("User click till submit button")
    public void userClickTillSubmitButton() {
        new TGTillManagementScreen(driver).clickTillSubmitButton();

    }

    @Then("User click Set Till button")
    public void userClickSetTillButton() {
        new TGTillManagementScreen(driver).clickSetTillButton();
    }

    @When("User verify Open Till page")
    public void userVerifyOpenTillPage() {
        new TGTillManagementScreen(driver).verifyOpenTillPage();
    }

    @Then("User enter till amount")
    public void userEnterTillAmount() {
        new TGTillManagementScreen(driver).enterTillAmount();
    }

    @Then("User verify last active till")
    public void userVerifyLastActiveTill() {
        new TGTillManagementScreen(driver).verifyLastActiveTill();
    }

    @When("User close user global if enable")
    public void userCloseUserGlobalIfEnable() throws Exception {
        new TGTillManagementScreen(driver).closeUserGlobalOptionIfEnable();
    }

    @Then("User open global till option if disable")
    public void userOpenGlobalTillOptionIfDisable() throws Exception {
        new TGTillManagementScreen(driver).openUserGlobalOptionIfDisable();
    }

    @When("User select last active till")
    public void userSelectLastActiveTill() {
        new TGTillManagementScreen(driver).selectLastActiveTill();
    }

    @Then("User click Pay In tab")
    public void userClickPayInTab() {
        new TGTillManagementScreen(driver).clickPayInTab();
    }

    @When("User enter Paid By")
    public void userEnterPaidBy() {
        new TGTillManagementScreen(driver).enterPaidBy();
    }

    @Then("User enter paid in amount")
    public void userEnterPaidInAmount() {
        new TGTillManagementScreen(driver).enterPaidInAmount();
    }

    @And("User select Paid Reason")
    public void userSelectPaidReason() {
        new TGTillManagementScreen(driver).selectPaidReason();
    }

    @And("User verify paid in successfull popup info")
    public void userVerifyPaidInSuccessfullPopupInfo() {
        new TGTillManagementScreen(driver).verifyPaidInSuccessfullPopupInfo();
    }

    @Then("User click Pay Out tab")
    public void userClickPayOutTab() {
        new TGTillManagementScreen(driver).clickPayOutTab();
    }

    @When("User enter Paid To")
    public void userEnterPaidTo() {
        new TGTillManagementScreen(driver).enterPaidTo();
    }

    @Then("User enter paid out amount")
    public void userEnterPaidOutAmount() {
        new TGTillManagementScreen(driver).enterPaidOutAmount();
    }

    @Then("User verify updated active till balance")
    public void userVerifyUpdatedActiveTillBalance() {
        new TGTillManagementScreen(driver).verifyUpdatedActiveTillBalance();
    }

    @When("User select Paid Out Reason")
    public void userSelectPaidOutReason() {
        new TGTillManagementScreen(driver).selectPaidOutReason();
    }

    @And("User verify paid out successfull popup info")
    public void userVerifyPaidOutSuccessfullPopupInfo() {
        new TGTillManagementScreen(driver).verifyPaidOutSuccessfullPopupInfo();
    }

    @Then("User select last active till if exist")
    public void userSelectLastActiveTillIfExist() {
        new TGTillManagementScreen(driver).selectLastActiveTillIfExist();
    }

    @When("User click Cash Drop tab")
    public void userClickCashDropTab() {
        new TGTillManagementScreen(driver).clickCashDropTab();
    }

    @Then("user enter cash drop amount")
    public void userEnterCashDropAmount() {
        new TGTillManagementScreen(driver).enterCashDropAmount();
    }

    @And("User verify cash drop successful popup")
    public void userVerifyCashDropSuccessfulPopup() {
        new TGTillManagementScreen(driver).verifyCashDropSuccessfulPopup();
    }

    @Then("User select active till")
    public void userSelectActiveTill() {
        new TGTillManagementScreen(driver).selectActiveTill();
    }

    @Then("User enter cash drop limit")
    public void userEnterCashDropLimit() {
        new TGTillManagementScreen(driver).enterCashDropLimit();
    }

    //new (nov15)
    @Then("User select last active till if exist First")
    public void userSelectLastActiveTillIfExistFirst() {
        new TGTillManagementScreen(driver).selectLastActiveTillIfExistFirst();
    }
}
