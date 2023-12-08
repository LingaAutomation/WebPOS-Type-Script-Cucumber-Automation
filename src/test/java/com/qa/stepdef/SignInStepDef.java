package com.qa.stepdef;

import com.qa.pages.ClockInScreen;
import com.qa.pages.SignInScreen;
import com.qa.pages.UserLoginScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignInStepDef {

    @When("^I click the Sign In button$")
    public void iClickTheSignInButton() {
        // Write code here that turns the phrase above into concrete actions
        new SignInScreen().pressSignInBtn();

    }

    @Then("^I should see the user login screen with title \"([^\"]*)\"$")
    public void iShouldSeeTheUserLoginScreenWithTitle(String title) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(new UserLoginScreen().getTitle(), title);
    }

    @And("I click the login")
    public void iClickTheLogin() {

    }
    @Given("^I'm logged in for Phone store$")
    public void iMLoggedInForPhoneStore(){
        new ClockInScreen().enterClockPinForPhone();
    }

    @Given ("^Im logged in for cashier1$")
    public void imLoggedInForCashier1(){
        new ClockInScreen().loggedInForCashier1();
    }


    @Given ("^Im logged in for cashier3$")
    public void imLoggedInForCashier3(){
        new ClockInScreen().loggedInForCashier3();
    }

    @Given ("^Im logged in for cashier2$")
    public void imLoggedInForCashier2(){
        new ClockInScreen().loggedInForCashier2();
    }

    @Given ("^Im logged in for cashier4$")
    public void imLoggedInForCashier4(){
        new ClockInScreen().loggedInForCashier4();
    }

    @And("^Enter the pin for Phone Store")
    public void enterThePinForPhoneStore(){
        new ClockInScreen().enterClockPinForPhone1();
    }


    @And ("^I click clockin Button$")
    public void iClickClockinButton(){
        new ClockInScreen().clickClockIn();
    }
    @And ("^I click clockout Button$")
    public void iClickClockOutButton(){
        new ClockInScreen().clickClockOut();
    }
    @Then ("^I should see enter Approver Pin popup$")
    public void iShouldSeeEnterApproverPinPopup(){
        Assert.assertEquals(new ClockInScreen().verifyApproverPin(),"Enter Approver PIN or Swipe Card");
    }


    @And("^I click time clock button in the clock in screen$")
    public void iClickTimeClockButtonInTheClockInScreen() throws InterruptedException {
        new ClockInScreen().clickTimeClockButtonInTheClockInScreen();
    }

    @Then ("^I should see clockin successful popup$")
    public void iShouldSeeClockinSuccessFulPopup(){
        Assert.assertEquals(new ClockInScreen().verifyClockInPopup(),"Clocked In Successfully");
    }

    @Then ("^I should see clock-out successful popup$")
    public void iShouldSeeClockOutSuccessfulPopup(){
        Assert.assertEquals(new ClockInScreen().verifyClockOutPopup(),"Clocked Out Successfully");
    }
    @Given("^I'm logged in from clockin button$")
    public void imLoggedInFromClockInButton(){
        new ClockInScreen().enterClockPin();
    }
    @When("Enter the clock-in pin")
    public void enterTheClockInPin(){
        new ClockInScreen().enterClockPin1();
    }

    @When ("^Enter the clock-out pin$")
    public void enterTheClockOutPin(){
        new ClockInScreen().enterClockPinOut();
    }
@When ("^Enter the clock-out pin for Multi role$")
public void enterTheClockOutPinForMultiRole(){
    new ClockInScreen().enterClockPinOutForMultiRole();
}

    @When ("^Enter the clock-in pin for Multi role$")
    public void EnterTheClockInPinForMultiRole(){
        new ClockInScreen().enterClockPin1ForMultiRole();
    }

    @When ("^Enter the pin for Multi roles$")
    public void EnterThePinForMultiRoles(){
        new ClockInScreen().enterClockPin1ForMultiRole1();
    }

    @Then ("^I should see shift record popup$")
    public void iShouldSeeShiftRecordPopup(){
        new ClockInScreen().verifyShiftRecordWindow();
    }

    @When ("^I click shift Record as \"([^\"]*)\"$")
    public void iClickShiftRecordAs(String Role){
        new ClockInScreen().clickShiftRole(Role);
    }

    @When ("^Enter the Invalid clock-in pin$")
    public void enterTheInvalidClockInPin(){
        new ClockInScreen().enterInvalidClockInPin();
    }

    @Then ("^I should see the invalid pin$")
    public void iShouldSeeTheInvalidPin(){
        new ClockInScreen().verifyInvalidPin();
    }

    @Then ("^I should see you have clocked in already popup$")
    public void iShouldSeeYouHaveClockedInAlreadyPopup(){
        new ClockInScreen().verifyPopupAsYouHaveClockedInAlreadyPopup();
    }
@Then ("^I should see you have clocked out already popup$")
public void iShouldSeeYouHaveClockedOutAlreadyPopup(){
    new ClockInScreen().verifyPopupAsYouHaveClockedOutAlreadyPopup();
}
    @When ("^Enter the Invalid clock-out pin$")
    public void enterTheInvalidClockOutPin(){
        new ClockInScreen().enterInvalidClockOutPin();
    }

    @Then ("^I should see you cant punch out with open till popup$")
    public void iShouldSeeYouCantPunchOutWithOpenTillPopup(){
        new ClockInScreen().verifyYouCantPunchOutOpenTillPopup();
    }

    @Then ("^I should see you cant punch out with active cashier popup$")
    public void iShouldSeeYouCantPunchOutWithActiveCashierPopup(){
        new ClockInScreen().verifyYouCantPunchOutWithActiveCashierPopup();
    }
}
