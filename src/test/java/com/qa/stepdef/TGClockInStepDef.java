package com.qa.stepdef;

import com.qa.pages.*;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TGClockInStepDef {

//    @And("I press on first number of the pin code")
//    public void iPressOnFirstNumberOfThePinCode() {
//        new TGClockInScreen().pressPin1();
//    }
//
//    @And("I press on second number of the pin code")
//    public void iPressOnSecondNumberOfThePinCode() {
//        new TGClockInScreen().pressPin2();
//    }
//
//    @And("I press on third number of the pin code")
//    public void iPressOnThirdNumberOfThePinCode() {
//        new TGClockInScreen().pressPin3();
//    }
//
//    @And("I press on fourth as wrong number of the pin code")
//    public void iPressOnFourthAsWrongNumberOfThePinCode() {
//        new TGClockInScreen().pressPin5();
//    }
//
//    @And("I press on fourth number of the pin code")
//    public void iPressOnFourthNumberOfThePinCode() {
//        new TGClockInScreen().pressPin4();
//    }


    @And("^I press cancel button")
    public void iPressCancelButton() throws InterruptedException {
        new TGLogOuts().pressCancel();
    }


    @And("Done button to select the order type")
    public void doneButtonToSelectTheOrderType() {
        new TGClockInScreen().pressDone();
    }

    @Then("User verify customer ClockIn Screen")
    public void userVerifyCustomerClockInScreen() {
        new TGClockInScreen().verifiedClockInPage();
    }

    @When("User click Clock In button")
    public void userClickClockInButton() {
        new TGClockInScreen().clickClockInButton();
    }

    @Then("User enter pin number for driver")
    public void userEnterPinNumberForDriver() {
        new TGClockInScreen().enterDriverPinNumber();
    }

    @And("User verify clock in pop up")
    public void userVerifyClockInPopUp() {
        new TGClockInScreen().verifyClockInSuccessMessage();
    }

    @Given("User should be logout")
    public void userShouldBeLogout() throws InterruptedException {
        new TGLogOuts().logout();
    }
}
