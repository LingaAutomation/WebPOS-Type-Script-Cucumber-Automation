package com.qa.stepdef;

import com.qa.pages.ClockInScreen;
import com.qa.pages.SignInScreen;
import com.qa.pages.UserLoginScreen;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SignInStepDef {

    public WebDriver driver = TestUtils.driver;

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
        new ClockInScreen(driver).enterClockPinForPhone();
    }

    @Given ("^Im logged in for cashier1$")
    public void imLoggedInForCashier1(){
        new ClockInScreen(driver).loggedInForCashier1();
    }


    @Given ("^Im logged in for cashier3$")
    public void imLoggedInForCashier3(){
        new ClockInScreen(driver).loggedInForCashier3();
    }

    @Given ("^Im logged in for cashier2$")
    public void imLoggedInForCashier2(){
        new ClockInScreen(driver).loggedInForCashier2();
    }

    @Given ("^Im logged in for cashier4$")
    public void imLoggedInForCashier4(){
        new ClockInScreen(driver).loggedInForCashier4();
    }

    @And("^Enter the pin for Phone Store")
    public void enterThePinForPhoneStore(){
        new ClockInScreen(driver).enterClockPinForPhone1();
    }


    @And ("^I click clockin Button$")
    public void iClickClockinButton(){
        new ClockInScreen(driver).clickClockIn();
    }
    @And ("^I click clockout Button$")
    public void iClickClockOutButton(){
        new ClockInScreen(driver).clickClockOut();
    }
    @Then ("^I should see enter Approver Pin popup$")
    public void iShouldSeeEnterApproverPinPopup(){
        Assert.assertEquals(new ClockInScreen(driver).verifyApproverPin(),"Enter Approver PIN or Swipe Card");
    }


    @And("^I click time clock button in the clock in screen$")
    public void iClickTimeClockButtonInTheClockInScreen() throws InterruptedException {
        new ClockInScreen(driver).clickTimeClockButtonInTheClockInScreen();
    }

    @Then ("^I should see clockin successful popup$")
    public void iShouldSeeClockinSuccessFulPopup(){
        Assert.assertEquals(new ClockInScreen(driver).verifyClockInPopup(),"Clocked In Successfully");
    }

    @Then ("^I should see clock-out successful popup$")
    public void iShouldSeeClockOutSuccessfulPopup(){
        Assert.assertEquals(new ClockInScreen(driver).verifyClockOutPopup(),"Clocked Out Successfully");
    }
    @Given("^I'm logged in from clockin button$")
    public void imLoggedInFromClockInButton(){
        new ClockInScreen(driver).enterClockPin();
    }
    @When("Enter the clock-in pin")
    public void enterTheClockInPin(){
        new ClockInScreen(driver).enterClockPin1();
    }

    @When ("^Enter the clock-out pin$")
    public void enterTheClockOutPin(){
        new ClockInScreen(driver).enterClockPinOut();
    }
@When ("^Enter the clock-out pin for Multi role$")
public void enterTheClockOutPinForMultiRole(){
    new ClockInScreen(driver).enterClockPinOutForMultiRole();
}

    @When ("^Enter the clock-in pin for Multi role$")
    public void EnterTheClockInPinForMultiRole(){
        new ClockInScreen(driver).enterClockPin1ForMultiRole();
    }

    @When ("^Enter the pin for Multi roles$")
    public void EnterThePinForMultiRoles(){
        new ClockInScreen(driver).enterClockPin1ForMultiRole1();
    }

    @Then ("^I should see shift record popup$")
    public void iShouldSeeShiftRecordPopup(){
        new ClockInScreen(driver).verifyShiftRecordWindow();
    }

    @When ("^I click shift Record as \"([^\"]*)\"$")
    public void iClickShiftRecordAs(String Role){
        new ClockInScreen(driver).clickShiftRole(Role);
    }

    @When ("^Enter the Invalid clock-in pin$")
    public void enterTheInvalidClockInPin(){
        new ClockInScreen(driver).enterInvalidClockInPin();
    }

    @Then ("^I should see the invalid pin$")
    public void iShouldSeeTheInvalidPin(){
        new ClockInScreen(driver).verifyInvalidPin();
    }

    @Then ("^I should see you have clocked in already popup$")
    public void iShouldSeeYouHaveClockedInAlreadyPopup(){
        new ClockInScreen(driver).verifyPopupAsYouHaveClockedInAlreadyPopup();
    }
@Then ("^I should see you have clocked out already popup$")
public void iShouldSeeYouHaveClockedOutAlreadyPopup(){
    new ClockInScreen(driver).verifyPopupAsYouHaveClockedOutAlreadyPopup();
}
    @When ("^Enter the Invalid clock-out pin$")
    public void enterTheInvalidClockOutPin(){
        new ClockInScreen(driver).enterInvalidClockOutPin();
    }

    @Then ("^I should see you cant punch out with open till popup$")
    public void iShouldSeeYouCantPunchOutWithOpenTillPopup(){
        new ClockInScreen(driver).verifyYouCantPunchOutOpenTillPopup();
    }

    @Then ("^I should see you cant punch out with active cashier popup$")
    public void iShouldSeeYouCantPunchOutWithActiveCashierPopup(){
        new ClockInScreen(driver).verifyYouCantPunchOutWithActiveCashierPopup();
    }
}
