package com.qa.stepdef;

import com.qa.pages.TillManagementScreen;
import com.qa.pages.cashOption;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
public class CashOptionStepDef {

    public WebDriver driver = TestUtils.driver;

    @And("^I get the cash option value and add with menu total$")
    public void iGetTheCashOptionValueAndWithMenuTotal() throws InterruptedException {
        new TillManagementScreen(driver).getDetailsOfCashOption();
    }

    @When("^I get the balance Due Amount and cash option amount in payment window$")
    public void iGetTheBalanceDueAmountAndCashOptionAmountInPaymentWindow(){
        new cashOption(driver).getBalanceDueAndCashOptionAmount();
    }

    @Then ("^verify the cash option in payment screen$")
    public void verifyTheCashOptionInPaymentScreen(){
        new cashOption(driver).verifyCashOptionApplied();
    }

    @Then ("^verify the card option payment screen$")
    public void verifyTheCardOptionPaymentScreen(){
        new cashOption(driver).verifyCardOptionApplied();
    }
    @When ("^verify the paid Amount in Order Screen for cash option$")
    public void verifyThePaidAmountInOrderScreen(){
        new cashOption(driver).verifyPaidAmountForCash();
    }

    @When ("^verify the paid Amount in Order Screen for card option$")
    public void verifyThePaidAmountInOrderScreenForCardOption(){
        new cashOption(driver).verifyPaidAmountForCard();
    }

    @When ("^verify cash discount is display in order screen$")
    public void verifyCashDiscountIsDisplayInOrderScreen(){
        new cashOption(driver).verifyCashDiscount();
    }

    @When ("^i verify service charge without tax of menu$")
    public void iVerifyServiceChargeWithoutTaxOfMenu(){
        new cashOption(driver).getServiceChargeWith_out_Tax();
    }
    @When ("^i verify service charge with tax of menu$")
    public void iVerifyServiceChargeWithTaxOfMenu(){
        new cashOption(driver).getServiceChargeWithTax();
    }
}
