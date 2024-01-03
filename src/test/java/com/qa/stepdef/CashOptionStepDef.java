package com.qa.stepdef;

import com.qa.pages.CheckOptions;
import com.qa.pages.TillManagementScreen;
import com.qa.pages.cashOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CashOptionStepDef {

    @And("^I get the cash option value and add with menu total$")
    public void iGetTheCashOptionValueAndWithMenuTotal(){
        new TillManagementScreen().getDetailsOfCashOption();
    }

    @When("^I get the balance Due Amount and cash option amount in payment window$")
    public void iGetTheBalanceDueAmountAndCashOptionAmountInPaymentWindow(){
        new cashOption().getBalanceDueAndCashOptionAmount();
    }

    @Then ("^verify the cash option in payment screen$")
    public void verifyTheCashOptionInPaymentScreen(){
        new cashOption().verifyCashOptionApplied();
    }

    @Then ("^verify the card option payment screen$")
    public void verifyTheCardOptionPaymentScreen(){
        new cashOption().verifyCardOptionApplied();
    }
    @When ("^verify the paid Amount in Order Screen for cash option$")
    public void verifyThePaidAmountInOrderScreen(){
        new cashOption().verifyPaidAmountForCash();
    }

    @When ("^verify the paid Amount in Order Screen for card option$")
    public void verifyThePaidAmountInOrderScreenForCardOption(){
        new cashOption().verifyPaidAmountForCard();
    }

    @When ("^verify cash discount is display in order screen$")
    public void verifyCashDiscountIsDisplayInOrderScreen(){
        new cashOption().verifyCashDiscount();
    }

    @When ("^i verify service charge without tax of menu$")
    public void iVerifyServiceChargeWithoutTaxOfMenu(){
        new cashOption().getServiceCharge();
    }
    @When ("^i verify service charge with tax of menu$")
    public void iVerifyServiceChargeWithTaxOfMenu(){
        new cashOption().getServiceChargeWithTax();
    }

    @And("I should see Paid amount exceeding the sale amount popup")
    public void iShouldSeePaidAmountExceedingTheSaleAmountPopup() {
        new CheckOptions().verifyPaidAmountExceeds1();
        Assert.assertEquals(new CheckOptions().getPaidAmountExceedsTxt1(), "Paid Amount exceeding Sale Amount");
    }
}
