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


public class UserLoginStepDef {

    @Given("I clicked sign in button and see the login window")
    public void iClickedSignInButtonAndSeeTheLoginWindow() {
        new SignInScreen().pressSignInBtn();
    }

    @And("^I enter e-mail as \"([^\"]*)\"$")
    public void iEnterEMailAs(String eMail) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new UserLoginScreen().enterEMail(eMail);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        // Write code here that turns the phrase above into concrete actions
        new UserLoginScreen().enterPassword(password);
    }

    @When("^I click finish button$")
    public void iClickFinishButton()
    {
        new UserLoginScreen().pressFinishBtn();
    }

    @Then("^I should see clock in page with text \"([^\"]*)\"$")
    public void iShouldSeeClockInPageWithText(String text) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(new ClockInScreen().getTitle(), text);
    }

    @Then("^I should see error pop-up with the warning \"([^\"]*)\"$")
    public void iShouldSeeErrorPopUpWithTheWarning(String err) {
        Assert.assertEquals(new UserLoginScreen().getErrTxt(), err);
    }

    @And ("^I empty the email address field$")
    public void iEmptyTheEmailAddressField(){
        new UserLoginScreen().emptyUsernameField();
    }
    @When ("^I empty the password field$")
    public void iEmptyThePasswordField(){
        new UserLoginScreen().emptyPasswordField();
    }

    @Then ("^I should see no license available popup$")
    public void iShouldSeeNoLicenseAvailablePopup(){
        new UserLoginScreen().verifyNoLicenseAvailablePopup();
    }
}
