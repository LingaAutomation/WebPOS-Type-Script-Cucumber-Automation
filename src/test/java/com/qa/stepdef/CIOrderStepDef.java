package com.qa.stepdef;

import com.qa.pages.CICloseDayScreen;
import com.qa.pages.CIOrderPage;
import com.qa.pages.CIPaymentScreen;
import com.qa.pages.ClockInScreen;
import com.qa.pages.CIOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CIOrderStepDef {

    ClockInScreen clockInScreen = new ClockInScreen();
    CIOrderPage orderPage = new CIOrderPage();
    CICloseDayScreen ciCloseDayScreen= new CICloseDayScreen();

    @Given("Login with valid pin")
    public void loginWithValidPin() {
        clockInScreen.logInWithValidPin();
    }

    @Given("I login with valid pin")
    public void ILoginWithValidPin() {
        clockInScreen.LogInWithValidPin();
    }

    @And("^I click on \"([^\"]*)\" for closing order screen popup \"([^\"]*)\"$")
    public void iPressOnCancelButton(String btnCancelXPath, String msg) {
        ciCloseDayScreen.commonAccessibilityId(btnCancelXPath, msg);
    }

    @Then("^It should show the amount \"([^\"]*)\" value as \"([^\"]*)\" \"([^\"]*)\"$")
    public void textValue1(String number,String value, String msg) {
        String text = orderPage.getAmount(number,msg);
        Assert.assertEquals(text,value);

    }

    @And("^I click the \"([^\"]*)\" from the menu item \"([^\"]*)\"$")
    public void iPressOnOptionPanButton(String item, String msg) throws Exception {
        orderPage.clickMenuItem(item, msg);
    }


    @And("I click option button \"([^\"]*)\"$")
    public void iClickOptionButton(String msg) {
        orderPage.clickBtnOption(msg);
    }

    @And("^I click on \"([^\"]*)\" for choose gratuity \"([^\"]*)\"$")
    public void iClickGratuityButton(String btnGratuityXPath, String msg) {
        orderPage.commonBtnClick(btnGratuityXPath, msg);
    }

    @When("^I click on \"([^\"]*)\" \"([^\"]*)\"$")
    public void iClickFixedGratuityButton(String optionBtnXPath, String msg) {
        orderPage.commonBtnClickOption(optionBtnXPath, msg);
    }

    @Then("^It should show the amount value as \"([^\"]*)\" \"([^\"]*)\"$")
    public void textValue(String value, String msg) {
        String text = orderPage.txtValue(value,msg);
        Assert.assertEquals(text,value);

    }

    @And("^I click on \"([^\"]*)\" in the order screen for paying amount \"([^\"]*)\"$")
    public void iClickThePaymentButtonInTheOrderScreen(String btnPayment, String msg) throws Exception {
        orderPage.clickMenuItem(btnPayment, msg);
    }

    @And("^I enter partial payment amount \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterPartialPaymentAmount(String paymentPin1, String paymentPin0,
                                           String paymentPin5, String paymentPin00) {
        orderPage.pressPaymentPin(paymentPin1, paymentPin0, paymentPin5, paymentPin00);
    }

    @And("^I click on \"([^\"]*)\" to pay the amount \"([^\"]*)\"$")
    public void iClickCashButton(String btnCash, String msg) {
        orderPage.BtnClickCash(btnCash, msg);
    }

    @When("I click on the exit button to close the Payment Popup \"([^\"]*)\"$")
    public void iClickOnExitButton(String msg) {
        orderPage.clickExit(msg);
    }
}
