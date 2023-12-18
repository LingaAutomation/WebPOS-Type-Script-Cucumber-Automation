package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ClockInStepDef {

    public WebDriver driver = TestUtils.driver;

    @Given("^I'm signed in$")
    public void iMSignedIn() throws InterruptedException {
        new SignInScreen().signIn();
        new UserLoginScreen().login("auto@engin.com","auto123");
    }

    @And("^I press on first number of the pin code$")
    public void iPressOnFirstNumberOfThePinCode() {
        new ClockInScreen(driver).pressPin1();
    }

    @And("^I press on second number of the pin code$")
    public void iPressOnSecondNumberOfThePinCode() {
        new ClockInScreen(driver).pressPin2();
    }

    @And("^I press on third number of the pin code$")
    public void iPressOnThirdNumberOfThePinCode() {
        new ClockInScreen(driver).pressPin3();
    }

    @And("^I press on fourth as wrong number of the pin code$")
    public void iPressOnFourthAsWrongNumberOfThePinCode() {
        new ClockInScreen(driver).pressPin5();
    }

    @And("^I press on fourth number of the pin code$")
    public void iPressOnFourthNumberOfThePinCode() {
        new ClockInScreen(driver).pressPin4();
    }

    @And ("^I tap zero number of the pin code$")
    public void iTapZeroNumberOfThePinCode(){new ClockInScreen(driver).pressPin0();}

    @When("^I click login button$")
    public void iClickLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        new ClockInScreen(driver).pressLogin();
    }

    @Then("^I should see the order type window with the title \"([^\"]*)\"$")
    public void iShouldSeeToOrderTypeWindowWithTheTitle(String title) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(new OrderTypeWindow(driver).getTitle(), title);
    }

    @And("^I click Done button$")
    public void iClickDoneButton() {
        new ClockInScreen(driver).pressDone();
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
        Assert.assertEquals(new ClockInScreen(driver).getErrTxt(), err);
    }

    @And("^Done button to select the order type$")
    public void doneButtonToSelectTheOrderType() {
        new ClockInScreen(driver).pressDone();
    }

    @Given ("^I'm logged in for Each sale$")
    public void imLoggedInForEachSale(){
        new ClockInScreen(driver).clockInForEachSale();
    }
    /*Clock in to see bartab */

    @Given("^I'm logged in for BarTab$")
    public void iMLoggedInForBarTab() {
        new ClockInScreen(driver).ClockInForBarTab();
    }

    @Given("^I'm logged in for BarTab for basic validation$")
    public void iMLoggedInForBarTabForBasicValidation() {
        new ClockInScreen(driver).ClockInForBarTabForBasicValidation();
    }

    @Given("^I'm logged in for Table Layout$")
    public void imLoggedInForTableLayout(){
        new ClockInScreen(driver).ClockInForTableScreen();
    }

    @And("^I click power button$")
    public void iClickPowerButton() throws InterruptedException {
        new LogOuts().pressPowerBtn();
    }

    @And("^I log out from BarTab user$")
    public void iLogOutFromBarTabUser() throws InterruptedException {
        new LogOuts().logOutAfterClockInForBarTab();
    }

    @And("^I click the BarTab button from clock in screen$")
    public void iClickTheBarTabButtonFromClockInScreen() throws InterruptedException {
        new ClockInScreen(driver).pressBarTabBtn();
    }

    @When("^I login after I click BarTab button$")
    public void iLoginAfterIClickBarTabButton() {
//        new ClockInScreen(driver).ClockInForBarTabUsingBarTabButton();
    }

    @Given("^I'm in the clock in screen$")
    public void iMInTheClockInScreen() {
    }

    @Then ("^I should see the access denied popup$")
    public void iShouldSeeTheAccessDeniedPopup(){
        new ClockInScreen(driver).verifyTheAccessDeniedPopup();
    }

    @Given ("^I'm logged in for Dine-In$")
    public void iMLoggedInForDineIn(){
        new ClockInScreen(driver).clockInForDineIn();
    }

    @And("^Enter the pin for Dine-In$")
    public void enterThePinForDineIn(){
        new ClockInScreen(driver).clockInForDineIn1();
    }

    @And("^Enter the pin for BarTab$")
    public void enterThePinForBarTab(){
        new ClockInScreen(driver).ClockInForBarTab1();
    }

    @And("I click power button in the All Orders screen")
    public void iClickPowerButtonInTheAllOrdersScreen() throws InterruptedException {
        new LogOuts().pressPowerBtn_AllOrders();
    }
}
