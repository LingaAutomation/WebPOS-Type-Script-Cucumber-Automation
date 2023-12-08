package com.qa.stepdef;

import com.qa.pages.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class TGUserLoginStepDef {


    @Given("I clicked sign in button and see login window")
    public void iClickedSignInButtonAndSeeTheLoginWindow() {
        new TGSignInScreen().pressSignInBtn();
    }

    @And("^I enter email as \"([^\"]*)\"$")
    public void iEnterEMailAs(String eMail) throws InterruptedException {
        new UserLoginScreen().enterEMail(eMail);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        new UserLoginScreen().enterPassword(password);
    }

    @When("^I click finish buttons$")
    public void iClickFinishButton()
    {
        new UserLoginScreen().pressFinishBtn();
    }

    @Then("^I should see clockin page with text \"([^\"]*)\"$")
    public void iShouldSeeClockInPageWithText(String text) {
        Assert.assertEquals( new TGClockInScreen().getTitle(), text);
    }

    @Then("^I should see error popup with the warning \"([^\"]*)\"$")
    public void iShouldSeeErrorPopUpWithTheWarning(String err) {
        Assert.assertEquals(new TGUserLoginScreen().getErrTxt(), err);
    }

    @Then("User click cancel button")
    public void userClickCancelButton() throws InterruptedException {
        new TGLogOuts().pressCancel();
    }

    @And("I clear the email text field")
    public void iClearTheEmailTextField() {
        new TGUserLoginScreen().clearEmailId();
    }

    @And("I clear the password text field")
    public void iClearThePasswordTextField() {
        new TGUserLoginScreen().clearPassword();
    }

    @Then("I should see error popup with the warning message\"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldSeeErrorPopupWithTheWarningMessage(String btnWarning,String msg) {
        new CICloseDayScreen().commonAccessibilityIdReturn(btnWarning,msg);
    }
}
