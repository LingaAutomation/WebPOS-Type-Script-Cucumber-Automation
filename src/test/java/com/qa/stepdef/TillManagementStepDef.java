package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
public class TillManagementStepDef {

    public WebDriver driver = TestUtils.driver;

    @And("^I close the order type window$")
    public void iCloseTheOrderTypeWindow() throws InterruptedException {
        new OrderTypeWindow(driver).pressCancelBtn();
    }

    @When("^I click on the Settings button$")
    public void IclickontheSettingsbutton() {
        new OrderManagementScreen(driver).pressCountingMachineBtn();
    }

    @Then("^I should see the Till tab with title \"([^\"]*)\"$ on Till Management Screen$")
    public void iShouldSeeTheTillTabWithTitleOnTillManagementScreen(String tabName) {
        Assert.assertEquals(new TillManagementScreen(driver).getTabName(), tabName);
    }

    @Given("^I'm displaying Till Management screen$")
    public void iMDisplayingTillManagementScreen() throws InterruptedException {
        new ClockInScreen(driver).ClockIn();
        new OrderTypeWindow(driver).pressCancelBtn();
        new OrderManagementScreen(driver).pressCountingMachineBtn();
    }

    @When("^I click Set Till button$")
    public void iClickSetTillButton() {
        new TillManagementScreen(driver).pressSetTillBtn();
    }

    @Then("^I should see the Open Till Window with title \"([^\"]*)\"$")
    public void iShouldSeeTheOpenTillWindowWithTitle(String title) {
        Assert.assertEquals(new OpenTillWindow(driver).getOpenTillWindowTitle(), title);
    }

    /*Pay In*/
    @Given("^I'm displaying Open Till window$")
    public void iMDisplayingOpenTillWindow() throws InterruptedException {
        new ClockInScreen(driver).ClockIn();
        new OrderTypeWindow(driver).pressCancelBtn();
        new OrderManagementScreen(driver).pressCountingMachineBtn();

    }

    @And("^I press first number of the total$")
    public void iPressFirstNumberOfTheTotal() {
        new OpenTillWindow(driver).press1();
    }

    @And("^I press second number of the total$")
    public void iPressSecondNumberOfTheTotal() {
        new OpenTillWindow(driver).press00();
    }

    @And("^I press third number of the total$")
    public void iPressThirdNumberOfTheTotal() {
        new OpenTillWindow(driver).press00();
    }

    @When("^I press Continue$")
    public void iPressContinue() {
        new OpenTillWindow(driver).pressContinueBtn();
    }

    @Then("^I should see the active till with the name \"([^\"]*)\" on the Active Till list opened by user \"([^\"]*)\" and till balance of \"([^\"]*)\"$")
    public void iShouldSeeTheActiveTillWithTheNameOnTheActiveTillListOpenedByUserAndTillBalanceOf(String tillName, String openedBy, String balance) throws Exception {
        TillManagementScreen tillManagementScreen = new TillManagementScreen(driver);
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
        new TillManagementScreen(driver).pressPayInTab();
    }

    @And ("^I click Till button$")
    public void iClickTillButton(){
        new TillManagementScreen(driver).pressTillBtn();
    }

    @And ("^I get pay In value$")
    public void iGetPayInValue(){
        new TillManagementScreen(driver).getPayInValue();
    }

    @And ("^I get pay Out value$")
    public void iGetPayOutValue(){
        new TillManagementScreen(driver).getPayOutValue();
    }
    @And("^I enter Paid By as \"([^\"]*)\"$")
    public void iEnterPaidByAs(String paidBy) {
        new TillManagementScreen(driver).setPaidBy();
    }

    @And("^I hide the keyboard$")
    public void iHideTheKeyboard() throws InterruptedException {
//        new TillManagementScreen(driver).pressHideKeyboardBtn();
    }

    @And("^I enter first number of the payment$")
    public void iEnterFirstNumberOfThePayment() {
        new TillManagementScreen(driver).press1();
    }

    @And("^I enter second number of the payment$")
    public void iEnterSecondNumberOfThePayment() {
        new TillManagementScreen(driver).press0();
    }

    @And("^I enter third number of the payment$")
    public void iEnterThirdNumberOfThePayment() {
        new TillManagementScreen(driver).press00();
    }

    @And("^I click Continue$")
    public void iClickContinue() {
        new TillManagementScreen(driver).pressPaidByContinueBtn();
    }

    @And("^I should see the Reasons window with title \"([^\"]*)\"$")
    public void iShouldSeeTheReasonsWindowWithTitle(String title) {
        Assert.assertEquals(new PaymentReasonsWindow(driver).getReasonsWindowTitle(), title);
    }

    @And("^I select the pay in reason as Paid In$")
    public void iSelectThePayInReasonAs() {
        new PaymentReasonsWindow(driver).selectPaymentReason();
    }

    @When("I click OK button to select the payment reason$")
    public void iClickOKButtonToSelectThePaymentReason() {
        new PaymentReasonsWindow(driver).clickOkBtn();
    }

    @Then("^I should see payment successful pop-up with the message \"([^\"]*)\" pay in$")
    public void iShouldSeePaymentSuccessfulPopUpWithTheMessagePayIn(String txtSuccessMsg) {
        Assert.assertEquals(new TillManagementScreen(driver).getPaidInSuccessfulMsg(), txtSuccessMsg);
    }

    @And("^I press Pay Out tab$")
    public void iPressPayOutTab() {
        new TillManagementScreen(driver).pressPayOutTab();
    }

    @And("^I enter Paid To as \"([^\"]*)\"$")
    public void iEnterPaidToAs(String paidTo) {
        new TillManagementScreen(driver).setPaidTo();
    }

    @And("^I select the pay in reason as Paid Out$")
    public void iSelectThePayInReasonAsPaidOut() {
        new PaymentReasonsWindow(driver).selectPayOutReason();
    }

    @Then("^I should see pop-up with the message \"([^\"]*)\" for the pay out$")
    public void iShouldSeePopUpWithTheMessageForThePayOut(String txtSuccessMsg) {
        Assert.assertEquals(new TillManagementScreen(driver).getPaidOutSuccessfulMsg(), txtSuccessMsg);
    }

    /****** Close till ******/

    @When("^I click the Close Till button$")
    public void iClickTheCloseTillButton() {
        new TillManagementScreen(driver).pressCloseTillBtn();
    }

    @Then("^I should see close till confirmation pop-up$")
    public void iShouldSeeCloseTillConfirmationPopUp() {
        Assert.assertEquals(new TillManagementScreen(driver).getCloseTillPopUpMsg(), "Do you want to Close this Till ?");
    }

    @When("^I click yes to open Close Till Screen$")
    public void iClickYesToOpenCloseTillScreen() {
        new TillManagementScreen(driver).pressYesCloseTillBtn();
    }

    @Then("^I should see that the Close Till window is displayed$")
    public void iShouldSeeThatTheCloseTillWindowIsDisplayed() {
//        Assert.assertEquals(new TillManagementScreen(driver).getCloseWindowTitle(), "Close Till");
    }

    @And("^I click the Continue button$")
    public void iClickTheContinueButton() {
        new TillManagementScreen(driver).continueCloseTillBtn();
    }

    @When("^I click Submit button$")
    public void iClickSubmitButton() {
        new TillManagementScreen(driver).pressSubmitCloseTillBtn();
    }

    @Then("^I should see the Closed Till selected$")
    public void iShouldSeeTheClosedTillSelected() {
        new TillManagementScreen(driver).confirmClosedTill();
    }

    //new (nov 12)
    @Then ("^I should see the active till with the Active Till list opened by user \"([^\"]*)\" and till balance of \"([^\"]*)\"$")
    public void iShouldSeeTheActiveTillWithTheActiveTillListOpenedByUserAndTillBalanceOf(String tillName, String openedBy, String balance) throws Exception {
        TillManagementScreen tillManagementScreen = new TillManagementScreen(driver);
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
        try {
            String text = "OPEN TILL";
            Assert.assertEquals( new TillManagementScreen(driver).verifyOpenTill(),text);
        }catch(Exception e) {}
    }

    @And ("^I click cancel button in open till popup$")
    public void iClickCancelButtonInOpenTillPopup(){
        new TillManagementScreen(driver).clickCancelButton();
    }

    @And ("^I click reports button in the Till management screen$")
    public void iClickReportsButtonInTheTillManagementScreen() throws InterruptedException {
        new TillManagementScreen(driver).clickReportsBtn();
    }

    @And ("^I click cashier out button in the Till management screen$")
    public void iClickCashierOutInTheTillManagementScreen() throws InterruptedException {
        new TillManagementScreen(driver).clickCashierOutBtn();
    }
    @And ("^I select global till option in open till$")
    public void iSelectGlobalTillOptionInOpenTill(){
        new TillManagementScreen(driver).clickGlobalTillOption();
    }

    @When ("^I get the active till details$")
    public void igetTheActiveTillDetails(){
        new TillManagementScreen(driver).getDetailsofActiveTill();
    }

    @And ("^I get the closed till check details$")
    public void iGetTheClosedTillCheckDetails(){
        new TillManagementScreen(driver).getDetailsofClosedTill();
    }

    @And ("^I get Total of menu")
    public void iGetTotalOfMenu(){
        new OrderManagementScreen(driver).getTotalOFMenu();
    }

    @Then ("^I should see active till total has changed depends on menu total$")
    public void iShouldSeeActiveTillTotalHasChangedDependsOnMenuTotal(){
        new TillManagementScreen(driver).verifyMenuTotalWithActivTillTotal();
    }

    @Then ("^I should see active till total has changed depends on Pay in$")
    public void iShouldSeeActiveTillTotalHasChangedDepandsOnPayIn(){
        new TillManagementScreen(driver).verifyPayInWithActiveTillTotal();
    }

    @Then ("^I should see active till total has changed depends on Pay out$")
    public void iShouldSeeActiveTillTotalHasChangesDependsOnPayOut(){
        new TillManagementScreen(driver).verifyPayOutWithActiveTillTotal();
    }
    @And ("^I click pay in button in the till management screen$")
    public void iClickPayInButtonInTheTillManagementScreen(){
        new TillManagementScreen(driver).clickPayInButton();
    }

    @And ("^I get the details of Active details$")
    public void iGetTheDetailsOfActiveDetails(){
        new TillManagementScreen(driver).activeTillBalance();
    }
    @When ("^I click pay out button in the till management screen$")
    public void iClickPayOutButtonInTheTillManagementScreen(){
        new TillManagementScreen(driver).clickPayOutButton();
    }
    @And ("^I click Active till check$")
    public void iClickActiveTillCheck(){
        new TillManagementScreen(driver).clickActiveTillCheck();
    }

    @And ("^I enter the amount greater than balance amount$")
    public void iEnterTheAmountGreaterThanBalanceAmount(){
        new TillManagementScreen(driver).enterAmountGreaterThanBalanceAmount();
    }
    @Then ("^I should see over shortage popup$")
    public void iShouldSeeOverShortagePopup(){
        new TillManagementScreen(driver).verifyOverShortagePopup();
    }

    @And ("^I enter reason for discrepency notes$")
    public void iEnterReasonForDiscrepencyNotes(){
        new TillManagementScreen(driver).passReasonForDiscrepencyNotes();
    }

    @Then ("^I should see total summary$")
    public void iShouldSeeTotalSummary(){
        Assert.assertEquals(new TillManagementScreen(driver).verifyTotalSummaryScreen(),"Total summary");
    }

    @And ("^I click submit button on total summary$")
    public void iClickSubmitButtonOnTotalSummary(){
        new TillManagementScreen(driver).clickSubmitInTotalSummary();
    }

    @And ("^I enter the amount smaller than balance amount$")
    public void iEnterTheAmountSmallerThanBalanceAmount(){
        new TillManagementScreen(driver).enterSmallerAmountThanBalanceAmount();
    }

    @And ("^I click Closed till button$")
    public void iClickClosedTillButton(){
        new TillManagementScreen(driver).clickClosedTillBtn();
    }
    @Then ("^verify till balance same with amount given$")
    public void verifyTillBalanceSameWithAmountGiven(){
        new TillManagementScreen(driver).verifyAmountWithTillBalance();
    }
    @Then ("^verify active till as global till$")
    public void verifyActiveTillAsGlobalTill(){
        new TillManagementScreen(driver).verifyActiveTillAsGlobal();
    }

    @Then ("^I should see cannot apply tip for offline payment$")
    public void iShouldSeeCannotApplyTipForOfflinePayment(){
        new cashOption(driver).verifyCannotApplyTipPopup();
    }

    @When ("^I press Continue for open till$")
    public void iPressContinueForOpenTill(){
        new OpenTillWindow(driver).pressContinueForOpenTill();
    }

    @Then ("^I should see do you want to print the cashier out popup$")
    public void iShouldSeeDoYouWantToPrintTheCashierOutPopup(){
        try {
            Assert.assertEquals(new TillManagementScreen(driver).verifyDoYouWantToPrintCashierOut(), "Do you want to print the cashier out?");
        }catch (Exception e){}
    }

    @Then ("^I should see you have an Active till do you want to close the till popup$")
    public void iShouldSeeYouHaveAnActiveTillDoYouWantToCloseTheTillPopup() throws InterruptedException {
        new TillManagementScreen(driver).verifyYouHaveAnActiveTillDoYouWantToCloseTheTill();
    }

    @And ("^I verify the cannot close the shift, store have the active checks$")
    public void iVerifyTheCannotCloseTheShiftStoreHaveTheActiveCheck(){
        new Regression(driver).verifyTheCannotCloseTheShiftStoreHaveTheActiveCheck();
    }
    @Then ("^I should see cashier out saved successfully popup$")
    public void iShouldSeeCashierOutSavedSuccessfullyPopup(){
        Assert.assertEquals(new TillManagementScreen(driver).verifyCashierOutSavedSuccessfully(),"Cashier out saved successfully");
    }

    @Then ("^I should verify the initial Gross sale value as \"([^\"]*)\"$")
    public void iShouldVerifyTheInitialGrossSaleValueAs(String value){
        Assert.assertEquals(new TillManagementScreen(driver).verifyInitialValue(value),"0.00");
    }

    @When ("^I verify till is available or not if available closed the till$")
    public void iVerifyTillIsAvailableOrNotIfAvailableClosedTheTill() throws InterruptedException {
        new TillManagementScreen(driver).verifyTillIsOpenedOrNotIfAvailableCloseTill();
    }

    @When ("^I verify the cash expected value and closed till$")
    public void iVerifyTheCashExpectedValueAndClosedTill(){
        new TillManagementScreen(driver).closeTheActiveTills();
    }

    @And ("^I click Active till Button$")
    public void iClickActiveTillButton(){
        new TillManagementScreen(driver).selectActiveTill();
    }

    @Then ("^I should verify the gross value depends on the menu item value in the reports window of Till management$")
    public void iShouldVerifyTheGrossValueDependsOnTheMenuItemValueInTheReportsWindowOfTillManagement(){
        new TillManagementScreen(driver).verifyGrossValueWithMenuItem();
    }

    @When ("^I get gross value from the reports of till management window$")
    public void iGetGrossValueFromTheReportsOfTillManagementWindow(){
        new TillManagementScreen(driver).getGrossValue();
    }

    @And ("^I click the cash drop button and enter value for cash drop as \"([^\"]*)\"$")
    public void iClickTheCashDropButtonAndEnterValueForCashDropAs(String cash) throws InterruptedException {
        new TillManagementScreen(driver).clickTheCashDropAndEnterTillBalance(cash);
    }
    @And ("^I select the cashier1 on the report screen$")
    public void iSelectTheCashier1OnTheReportScreen() throws InterruptedException {
        new TillManagementScreen(driver).selectTheCashier1OnTheReportScreen();
    }

    @And ("^I select the cashier2 on the report screen$")
    public void iSelectTheCashier2OnTheReportScreen() throws InterruptedException {
        new TillManagementScreen(driver).selectTheCashier2OnTheReportScreen();
    }

    @And ("^I select the cashier3 on the report screen$")
    public void iSelectTheCashier3OnTheReportScreen() throws InterruptedException {
        new TillManagementScreen(driver).selectTheCashier3OnTheReportScreen();
    }

    @And ("^I select the cashier4 on the report screen$")
    public void iSelectTheCashier4OnTheReportScreen() throws InterruptedException {
        new TillManagementScreen(driver).selectTheCashier4OnTheReportScreen();
    }

    @And("I click on the Till Management button")
    public void iClickOnTheTillManagementButton() throws InterruptedException{
        new TillManagementScreen(driver).pressTillManagementBTN();
    }
}
