package com.qa.stepdef;

import com.qa.pages.TGGiftCard;
import com.qa.pages.TGLogOuts;
import com.qa.pages.TGSignInScreen;
import com.qa.pages.TGUserLoginScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TGSignInStepDef {


    @When("^I click the Sign In buttons$")
    public void iClickTheSignInButton() {
        // Write code here that turns the phrase above into concrete actions
        new TGSignInScreen().pressSignInBtn();

    }

    @Then("^I should see the users login screen with title \"([^\"]*)\"$")
    public void iShouldSeeTheUserLoginScreenWithTitle(String title) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(new TGUserLoginScreen().getTitle(), title);
    }

    @And("User verify be directed signIn page")
    public void userVerifyBeDirectedSignInPage() {
        new TGSignInScreen().verifyBeDirectedSignInPage();
    }
}
