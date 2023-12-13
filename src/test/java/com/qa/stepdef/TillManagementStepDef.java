package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TillManagementStepDef {
    @And("^I close the order type window$")
    public void iCloseTheOrderTypeWindow() throws InterruptedException {
        new OrderTypeWindow().pressCancelBtn();
    }

    @When("^I click counting machine icon$")
    public void iClickCountingMachineIcon() {
        new OrderManagementScreen().pressCountingMachineBtn();
    }

    @Then("^I should see the Till tab with title \"([^\"]*)\"$ on Till Management Screen$")
    public void iShouldSeeTheTillTabWithTitleOnTillManagementScreen(String tabName) {
        Assert.assertEquals(new TillManagementScreen().getTabName(), tabName);
    }

    @Given("^I'm displaying Till Management screen$")
    public void iMDisplayingTillManagementScreen() throws InterruptedException {
//        new ClockInScreen().ClockIn();
        new OrderTypeWindow().pressCancelBtn();
        new OrderManagementScreen().pressCountingMachineBtn();
    }

    @When("^I click Set Till button$")
    public void iClickSetTillButton() {
        new TillManagementScreen().pressSetTillBtn();
    }

    @Then("^I should see the Open Till Window with title \"([^\"]*)\"$")
    public void iShouldSeeTheOpenTillWindowWithTitle(String title) {
        Assert.assertEquals(new OpenTillWindow().getOpenTillWindowTitle(), title);
    }

    /*Pay In*/
    @Given("^I'm displaying Open Till window$")
    public void iMDisplayingOpenTillWindow() throws InterruptedException {
//        new ClockInScreen().ClockIn();
        new OrderTypeWindow().pressCancelBtn();
        new OrderManagementScreen().pressCountingMachineBtn();

    }

    @And("^I press first number of the total$")
    public void iPressFirstNumberOfTheTotal() {
        new OpenTillWindow().press1();
    }

    @And("^I press second number of the total$")
    public void iPressSecondNumberOfTheTotal() {
        new OpenTillWindow().press00();
    }

    @And("^I press third number of the total$")
    public void iPressThirdNumberOfTheTotal() {
        new OpenTillWindow().press00();
    }

    @When("^I press Continue$")
    public void iPressContinue() {
        new OpenTillWindow().pressContinueBtn();
    }

    @Then("^I should see the active till with the name \"([^\"]*)\" on the Active Till list opened by user \"([^\"]*)\" and till balance of \"([^\"]*)\"$")
    public void iShouldSeeTheActiveTillWithTheNameOnTheActiveTillListOpenedByUserAndTillBalanceOf(String tillName, String openedBy, String balance) throws Exception {
        TillManagementScreen tillManagementScreen = new TillManagementScreen();
        boolean tillNameCheck = tillManagementScreen.getTillName().equalsIgnoreCase(tillName);
        boolean openedByCheck = tillManagementScreen.getOpenedBy().equalsIgnoreCase(openedBy);
        boolean balanceCheck = tillManagementScreen.getBalance().equalsIgnoreCase(balance);
        System.out.println(tillManagementScreen.getTillName());
        System.out.println(tillManagementScreen.getOpenedBy());
        System.out.println(tillManagementScreen.getBalance());
        Assert.assertTrue("tillNameCheck = " + tillNameCheck + ", openedByCheck = " + openedByCheck + ", balanceCheck = " + balanceCheck,
                tillNameCheck & openedByCheck & balanceCheck);
    }

    /*Pay In*/
    @And("^I press Pay In tab$")
    public void iPressPayInTab() {
        new TillManagementScreen().pressPayInTab();
    }

    @And ("^I click Till button$")
    public void iClickTillButton(){
        new TillManagementScreen().pressTillBtn();
    }

    @And ("^I get pay In value$")
    public void iGetPayInValue(){
        new TillManagementScreen().getPayInValue();
    }

    @And ("^I get pay Out value$")
    public void iGetPayOutValue(){
        new TillManagementScreen().getPayOutValue();
    }
    @And("^I enter Paid By as \"([^\"]*)\"$")
    public void iEnterPaidByAs(String paidBy) {
        new TillManagementScreen().setPaidBy();
    }

    @And("^I hide the keyboard$")
    public void iHideTheKeyboard() throws InterruptedException {
        new TillManagementScreen().pressHideKeyboardBtn();
    }

    @And("^I enter first number of the payment$")
    public void iEnterFirstNumberOfThePayment() {
        new TillManagementScreen().press1();
    }

    @And("^I enter second number of the payment$")
    public void iEnterSecondNumberOfThePayment() {
        new TillManagementScreen().press0();
    }

    @And("^I enter third number of the payment$")
    public void iEnterThirdNumberOfThePayment() {
        new TillManagementScreen().press00();
    }

    @And("^I click Continue$")
    public void iClickContinue() {
        new TillManagementScreen().pressPaidByContinueBtn();
    }

    @And("^I should see the Reasons window with title \"([^\"]*)\"$")
    public void iShouldSeeTheReasonsWindowWithTitle(String title) {
        Assert.assertEquals(new PaymentReasonsWindow().getReasonsWindowTitle(), title);
    }

    @And("^I select the pay in reason as Paid In$")
    public void iSelectThePayInReasonAs() {
        new PaymentReasonsWindow().selectPaymentReason();
    }

    @When("I click OK button to select the payment reason$")
    public void iClickOKButtonToSelectThePaymentReason() {
        new PaymentReasonsWindow().clickOkBtn();
    }

    @Then("^I should see payment successful pop-up with the message \"([^\"]*)\" pay in$")
    public void iShouldSeePaymentSuccessfulPopUpWithTheMessagePayIn(String txtSuccessMsg) {
        Assert.assertEquals(new TillManagementScreen().getPaidInSuccessfulMsg(), txtSuccessMsg);
    }

    @And("^I press Pay Out tab$")
    public void iPressPayOutTab() {
        new TillManagementScreen().pressPayOutTab();
    }

    @And("^I enter Paid To as \"([^\"]*)\"$")
    public void iEnterPaidToAs(String paidTo) {
        new TillManagementScreen().setPaidTo();
    }

    @And("^I select the pay in reason as Paid Out$")
    public void iSelectThePayInReasonAsPaidOut() {
        new PaymentReasonsWindow().selectPayOutReason();
    }

    @Then("^I should see pop-up with the message \"([^\"]*)\" for the pay out$")
    public void iShouldSeePopUpWithTheMessageForThePayOut(String txtSuccessMsg) {
        Assert.assertEquals(new TillManagementScreen().getPaidOutSuccessfulMsg(), txtSuccessMsg);
    }

    /****** Close till ******/

    @When("^I click the Close Till button$")
    public void iClickTheCloseTillButton() {
        new TillManagementScreen().pressCloseTillBtn();
    }

    @Then("^I should see close till confirmation pop-up$")
    public void iShouldSeeCloseTillConfirmationPopUp() {
        Assert.assertEquals(new TillManagementScreen().getCloseTillPopUpMsg(), "Do you want to Close this Till ?");
    }

    @When("^I click yes to open Close Till Screen$")
    public void iClickYesToOpenCloseTillScreen() {
        new TillManagementScreen().pressYesCloseTillBtn();
    }

    @Then("^I should see that the Close Till window is displayed$")
    public void iShouldSeeThatTheCloseTillWindowIsDisplayed() {
        Assert.assertEquals(new TillManagementScreen().getCloseWindowTitle(), "Close Till");
    }

    @And("^I click the Continue button$")
    public void iClickTheContinueButton() {
        new TillManagementScreen().continueCloseTillBtn();
    }

    @When("^I click Submit button$")
    public void iClickSubmitButton() {
        new TillManagementScreen().pressSubmitCloseTillBtn();
    }

    @Then("^I should see the Closed Till selected$")
    public void iShouldSeeTheClosedTillSelected() {
        new TillManagementScreen().confirmClosedTill();
    }

    //new (nov 12)
    @Then ("^I should see the active till with the Active Till list opened by user \"([^\"]*)\" and till balance of \"([^\"]*)\"$")
    public void iShouldSeeTheActiveTillWithTheActiveTillListOpenedByUserAndTillBalanceOf(String tillName, String openedBy, String balance) throws Exception {
        TillManagementScreen tillManagementScreen = new TillManagementScreen();
        boolean tillNameCheck = tillManagementScreen.getTillName().equalsIgnoreCase(tillName);
        boolean openedByCheck = tillManagementScreen.getOpenedBy().equalsIgnoreCase(openedBy);
        boolean balanceCheck = tillManagementScreen.getBalance().equalsIgnoreCase(balance);
        System.out.println(tillManagementScreen.getTillName());
        System.out.println(tillManagementScreen.getOpenedBy());
        System.out.println(tillManagementScreen.getBalance());
        Assert.assertTrue("tillNameCheck = " + tillNameCheck + ", openedByCheck = " + openedByCheck + ", balanceCheck = " + balanceCheck,
                tillNameCheck & openedByCheck & balanceCheck);
    }

    @Then ("^I should see open till management screen$")
    public void iShouldSeeOpenTillManagementScreen(){
        Assert.assertEquals( new TillManagementScreen().verifyOpenTill(),"Open Till");
    }

    @And ("^I click cancel button in open till popup$")
    public void iClickCancelButtonInOpenTillPopup(){
        new TillManagementScreen().clickCancelButton();
    }

    @And ("^I click reports button in the Till management screen$")
    public void iClickReportsButtonInTheTillManagementScreen(){
        new TillManagementScreen().clickReportsBtn();
    }

    @And ("^I click cashier out button in the Till management screen$")
    public void iClickCashierOutInTheTillManagementScreen() throws InterruptedException {
        new TillManagementScreen().clickCashierOutBtn();
    }
    @And ("^I select global till option in open till$")
    public void iSelectGlobalTillOptionInOpenTill(){
        new TillManagementScreen().clickGlobalTillOption();
    }

    @When ("^I get the active till details$")
    public void igetTheActiveTillDetails(){
        new TillManagementScreen().getDetailsofActiveTill();
    }

    @And ("^I get the closed till check details$")
    public void iGetTheClosedTillCheckDetails(){
        new TillManagementScreen().getDetailsofClosedTill();
    }

    @And ("^I get Total of menu")
    public void iGetTotalOfMenu(){
        new OrderManagementScreen().getTotalOFMenu();
    }

    @Then ("^I should see active till total has changed depends on menu total$")
    public void iShouldSeeActiveTillTotalHasChangedDependsOnMenuTotal(){
        new TillManagementScreen().verifyMenuTotalWithActivTillTotal();
    }

    @Then ("^I should see active till total has changed depends on Pay in$")
    public void iShouldSeeActiveTillTotalHasChangedDepandsOnPayIn(){
        new TillManagementScreen().verifyPayInWithActiveTillTotal();
    }

    @Then ("^I should see active till total has changed depends on Pay out$")
    public void iShouldSeeActiveTillTotalHasChangesDependsOnPayOut(){
        new TillManagementScreen().verifyPayOutWithActiveTillTotal();
    }
    @And ("^I click pay in button in the till management screen$")
    public void iClickPayInButtonInTheTillManagementScreen(){
        new TillManagementScreen().clickPayInButton();
    }

    @And ("^I get the details of Active details$")
    public void iGetTheDetailsOfActiveDetails(){
        new TillManagementScreen().activeTillBalance();
    }
    @When ("^I click pay out button in the till management screen$")
    public void iClickPayOutButtonInTheTillManagementScreen(){
        new TillManagementScreen().clickPayOutButton();
    }
    @And ("^I click Active till check$")
    public void iClickActiveTillCheck(){
        new TillManagementScreen().clickActiveTillCheck();
    }

    @And ("^I enter the amount greater than balance amount$")
    public void iEnterTheAmountGreaterThanBalanceAmount(){
        new TillManagementScreen().enterAmountGreaterThanBalanceAmount();
    }
    @Then ("^I should see over shortage popup$")
    public void iShouldSeeOverShortagePopup(){
        new TillManagementScreen().verifyOverShortagePopup();
    }

    @And ("^I enter reason for discrepency notes$")
    public void iEnterReasonForDiscrepencyNotes(){
        new TillManagementScreen().passReasonForDiscrepencyNotes();
    }

    @Then ("^I should see total summary$")
    public void iShouldSeeTotalSummary(){
        Assert.assertEquals(new TillManagementScreen().verifyTotalSummaryScreen(),"TOTAL SUMMARY");
    }

    @And ("^I click submit button on total summary$")
    public void iClickSubmitButtonOnTotalSummary(){
        new TillManagementScreen().clickSubmitInTotalSummary();
    }

    @And ("^I enter the amount smaller than balance amount$")
    public void iEnterTheAmountSmallerThanBalanceAmount(){
        new TillManagementScreen().enterSmallerAmountThanBalanceAmount();
    }

    @And ("^I click Closed till button$")
    public void iClickClosedTillButton(){
        new TillManagementScreen().clickClosedTillBtn();
    }
    @Then ("^verify till balance same with amount given$")
    public void verifyTillBalanceSameWithAmountGiven(){
        new TillManagementScreen().verifyAmountWithTillBalance();
    }
    @Then ("^verify active till as global till$")
    public void verifyActiveTillAsGlobalTill(){
        new TillManagementScreen().verifyActiveTillAsGlobal();
    }

    @Then ("^I should see cannot apply tip for offline payment$")
    public void iShouldSeeCannotApplyTipForOfflinePayment(){
        new cashOption().verifyCannotApplyTipPopup();
    }

    @When ("^I press Continue for open till$")
    public void iPressContinueForOpenTill(){
        new OpenTillWindow().pressContinueForOpenTill();
    }

    @Then ("^I should see do you want to print the cashier out popup$")
    public void iShouldSeeDoYouWantToPrintTheCashierOutPopup(){
        Assert.assertEquals(new TillManagementScreen().verifyDoYouWantToPrintCashierOut(),"Do you want to print the Cashier Out?");
    }

    @Then ("^I should see you have an Active till do you want to close the till popup$")
    public void iShouldSeeYouHaveAnActiveTillDoYouWantToCloseTheTillPopup() throws InterruptedException {
        new TillManagementScreen().verifyYouHaveAnActiveTillDoYouWantToCloseTheTill();
    }

    @And ("^I verify the cannot close the shift, store have the active checks$")
    public void iVerifyTheCannotCloseTheShiftStoreHaveTheActiveCheck(){
        new Regression().verifyTheCannotCloseTheShiftStoreHaveTheActiveCheck();
    }
    @Then ("^I should see cashier out saved successfully popup$")
    public void iShouldSeeCashierOutSavedSuccessfullyPopup(){
        Assert.assertEquals(new TillManagementScreen().verifyCashierOutSavedSuccessfully(),"Cashier out saved successfully");
    }

    @Then ("^I should verify the initial Gross sale value as \"([^\"]*)\"$")
    public void iShouldVerifyTheInitialGrossSaleValueAs(String value){
        Assert.assertEquals(new TillManagementScreen().verifyInitialValue(value),"0.00");
    }

    @When ("^I verify till is available or not if available closed the till$")
    public void iVerifyTillIsAvailableOrNotIfAvailableClosedTheTill() throws InterruptedException {
        new TillManagementScreen().verifyTillIsOpenedOrNotIfAvailableCloseTill();
    }

    @When ("^I verify the cash expected value and closed till$")
    public void iVerifyTheCashExpectedValueAndClosedTill(){
        new TillManagementScreen().closeTheActiveTills();
    }

    @And ("^I click Active till Button$")
    public void iClickActiveTillButton(){
        new TillManagementScreen().selectActiveTill();
    }

    @Then ("^I should verify the gross value depends on the menu item value in the reports window of Till management$")
    public void iShouldVerifyTheGrossValueDependsOnTheMenuItemValueInTheReportsWindowOfTillManagement(){
        new TillManagementScreen().verifyGrossValueWithMenuItem();
    }

    @When ("^I get gross value from the reports of till management window$")
    public void iGetGrossValueFromTheReportsOfTillManagementWindow(){
        new TillManagementScreen().getGrossValue();
    }

    @And ("^I click the cash drop button and enter value for cash drop as \"([^\"]*)\"$")
    public void iClickTheCashDropButtonAndEnterValueForCashDropAs(String cash) throws InterruptedException {
        new TillManagementScreen().clickTheCashDropAndEnterTillBalance(cash);
    }
    @And ("^I select the cashier1 on the report screen$")
    public void iSelectTheCashier1OnTheReportScreen() throws InterruptedException {
        new TillManagementScreen().selectTheCashier1OnTheReportScreen();
    }

    @And ("^I select the cashier2 on the report screen$")
    public void iSelectTheCashier2OnTheReportScreen() throws InterruptedException {
        new TillManagementScreen().selectTheCashier2OnTheReportScreen();
    }

    @And ("^I select the cashier3 on the report screen$")
    public void iSelectTheCashier3OnTheReportScreen() throws InterruptedException {
        new TillManagementScreen().selectTheCashier3OnTheReportScreen();
    }

    @And ("^I select the cashier4 on the report screen$")
    public void iSelectTheCashier4OnTheReportScreen() throws InterruptedException {
        new TillManagementScreen().selectTheCashier4OnTheReportScreen();
    }
}
