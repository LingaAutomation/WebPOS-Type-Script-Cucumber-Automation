package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ClockInStepDef {
    @Given("^I'm signed in$")
    public void iMSignedIn() throws InterruptedException {
        new SignInScreen().signIn();
        new UserLoginScreen().login("auto@engin.com","auto123");
    }

    @And("^I press on first number of the pin code$")
    public void iPressOnFirstNumberOfThePinCode() {
        new ClockInScreen().pressPin1();
    }

    @And("^I press on second number of the pin code$")
    public void iPressOnSecondNumberOfThePinCode() {
        new ClockInScreen().pressPin2();
    }

    @And("^I press on third number of the pin code$")
    public void iPressOnThirdNumberOfThePinCode() {
        new ClockInScreen().pressPin3();
    }

    @And("^I press on fourth as wrong number of the pin code$")
    public void iPressOnFourthAsWrongNumberOfThePinCode() {
        new ClockInScreen().pressPin5();
    }

    @And("^I press on fourth number of the pin code$")
    public void iPressOnFourthNumberOfThePinCode() {
        new ClockInScreen().pressPin4();
    }

    @And ("^I tap zero number of the pin code$")
    public void iTapZeroNumberOfThePinCode(){new ClockInScreen().pressPin0();}

    @When("^I click login button$")
    public void iClickLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        new ClockInScreen().pressLogin();
    }

    @Then("^I should see the order type window with the title \"([^\"]*)\"$")
    public void iShouldSeeToOrderTypeWindowWithTheTitle(String title) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(new OrderTypeWindow().getTitle(), title);
    }

    @And("^I click Done button$")
    public void iClickDoneButton() {
        new ClockInScreen().pressDone();
    }

    @And("^I log out$")
    public void iLogOut() {
        new LogOuts().logOutAfterClockIn();
    }

    @And("^I log out without login$")
    public void iLogOutWithoutLogin() {
        new LogOuts().logOutBeforeClockIn();
    }

    @Then("^I should see the sign in page with \"([^\"]*)\"$")
    public void iShouldSeeTheSignInPageWith(String staticTxt) {
        Assert.assertEquals(new LogOuts().checkStaticText(), staticTxt);
    }

    @And("^I press cancel button$")
    public void iPressCancelButton() {
        new LogOuts().pressCancel();
    }

    @Then("^I should see error invalid pin pop-up with the warning \"([^\"]*)\"$")
    public void iShouldSeeErrorInvalidPinPopUpWithTheWarning(String err) {
        Assert.assertEquals(new ClockInScreen().getErrTxt(), err);
    }

    @And("^Done button to select the order type$")
    public void doneButtonToSelectTheOrderType() {
        new ClockInScreen().pressDone();
    }

    @Given ("^I'm logged in for Each sale$")
    public void imLoggedInForEachSale(){
        new ClockInScreen().clockInForEachSale();
    }
    /*Clock in to see bartab */

    @Given("^I'm logged in for BarTab$")
    public void iMLoggedInForBarTab() {
        new ClockInScreen().ClockInForBarTab();
    }

    @Given("^I'm logged in for BarTab for basic validation$")
    public void iMLoggedInForBarTabForBasicValidation() {
        new ClockInScreen().ClockInForBarTabForBasicValidation();
    }

    @Given("^I'm logged in for Table Layout$")
    public void imLoggedInForTableLayout(){
        new ClockInScreen().ClockInForTableScreen();
    }

    @And("^I click power button$")
    public void iClickPowerButton() throws InterruptedException {
        new LogOuts().pressPowerBtn();
    }

    @And("^I click power button1$")
    public void iClickPowerButton1() throws InterruptedException {
        new LogOuts().pressPowerBtn1();
    }

    @And("^I log out from BarTab user$")
    public void iLogOutFromBarTabUser() throws InterruptedException {
        new LogOuts().logOutAfterClockInForBarTab();
    }

    @And("^I click the BarTab button from clock in screen$")
    public void iClickTheBarTabButtonFromClockInScreen() throws InterruptedException {
        new ClockInScreen().pressBarTabBtn();
    }

    @When("^I login after I click BarTab button$")
    public void iLoginAfterIClickBarTabButton() {
        new ClockInScreen().ClockInForBarTabUsingBarTabButton();
    }

    @Given("^I'm in the clock in screen$")
    public void iMInTheClockInScreen() {
    }

    @Then ("^I should see the access denied popup$")
    public void iShouldSeeTheAccessDeniedPopup(){
        new ClockInScreen().verifyTheAccessDeniedPopup();
    }

    @Given ("^I'm logged in for Dine-In$")
    public void iMLoggedInForDineIn(){
        new ClockInScreen().clockInForDineIn();
    }

    @And("^Enter the pin for Dine-In$")
    public void enterThePinForDineIn(){
        new ClockInScreen().clockInForDineIn1();
    }

    @And("^Enter the pin for BarTab$")
    public void enterThePinForBarTab(){
        new ClockInScreen().ClockInForBarTab1();
    }

}
