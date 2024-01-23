package com.qa.stepdef;

import com.qa.pages.CustomerProfileWindow;
import com.qa.pages.OrderTypeWindow;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CustomerProfileStepDef {

    @And("I should see an asterisk next to the Mobile field")
    public void iShouldSeeAnAsteriskNextToTheMobileField() {
        Assert.assertEquals(new CustomerProfileWindow().getPhoneAsterisk(), "*" );
    }

    @And("^I should see an asterisk next to the Address field$")
    public void iShouldSeeAnAsteriskNextToTheAddressField() {
        Assert.assertEquals(new CustomerProfileWindow().getAddressAsterisk(), "*");
    }

    @And("^I select search$")
    public void iSelectSearch() throws InterruptedException {
        new OrderTypeWindow().pressSearchField();
    }

    @When ("^I verify the customer as \"([^\"]*)\" is available in the customer profile window$")
    public void iVerifyTheCustomerIsAvailableInTheCustomerProfileWindow(String customer) throws Exception {
        new CustomerProfileWindow().verifyTheCustomerIsAvailableInTheCustomerProfileWindow(customer);
    }

    @And("^I enter an existing customer's name \"([^\"]*)\"$")
    public void iEnterAnExistingCustomerSName(String customerName) throws InterruptedException {
        new CustomerProfileWindow().sendCustomerName(customerName);
    }

    @And("^I select an existing customer's name \"([^\"]*)\"$")
    public void iSelectAnExistingCustomerSName(String customerName) {
        new CustomerProfileWindow().sendAndSelectCustomerName(customerName);
    }

    @And("^I select the customer")
    public void iSelectTheCustomer() throws InterruptedException {
        new CustomerProfileWindow().selectCustomer();
    }

    @When ("^I select the last sale of the customer$")
    public void iSelectTheLastSaleOfTheCustomer(){
        new CustomerProfileWindow().selectTheLastSaleOfTheCustomer();
    }

    @When("^I click repeat Order button on the customer profile window$")
    public void iClickRepeatOrderButtonOnTheCustomerProfileWindow(){
        new CustomerProfileWindow().clickRepeatOrderButton();
    }

    @And("^I select the customer for autoMembership")
    public void iSelectTheCustomerForAutoMembership() throws InterruptedException {
        new CustomerProfileWindow().selectCustomerForMembership();
    }

    @And ("^I select the customer for tax exempt$")
    public void iSelectTheCustomerForTaxExempt() throws InterruptedException {
        new CustomerProfileWindow().selectCustomerforTaxExempt();
    }

    @And("^I select the customer for NMI")
    public void iSelectTheCustomerForNmi() {
        new CustomerProfileWindow().selectCustomerForNmi();
    }

    @And ("^I select the customer for loyalty$")
    public void iSelectTheCustomerForLoyalty(){
        new CustomerProfileWindow().selectCustomerLoyalty();
    }

    @And ("^I click customer plan button$")
    public void iClickCustomerPlanButton() throws InterruptedException {
        new CustomerProfileWindow().selectCustomerPlan();
    }

    @Then ("^I should see Account type screen$")
    public void iShouldSeeAccountTypeScreen() throws InterruptedException {
        Assert.assertEquals(new CustomerProfileWindow().verifyAccountType(), "Account Types");
    }

    @And ("^I click membership from the account type screen$")
    public void iClickMembershipFromTheAccountTypeScreen() throws InterruptedException {
        new CustomerProfileWindow().selectMembershipFromAccountType();
    }
    @And ("^I click house account field and enter recharge amount$")
    public void iClickHouseAccountFieldAndEnterRechargeAmount(){
        new CustomerProfileWindow().clickAccountTypeField();
    }

    @And ("^I click update button$")
    public void iClickUpdateButton() throws InterruptedException {
        new CustomerProfileWindow().clickUpdateBtn();
    }

    @Then ("^I should see house account add on order screen$")
    public void iShouldSeeHouseAccountAddOnOrderScreen(){
        Assert.assertEquals(new CustomerProfileWindow().houseAccountOnOrderScreen(),"HA-3578655");
    }

    @And ("^I select tax exempt on customer profile screen$")
    public void iSelectTaxExemptOnCustomerProfileScreen() throws InterruptedException {
        new CustomerProfileWindow().selectTaxExemptCustomerProfile();
    }

    @And ("^I not select tax exempt on customer profile screen$")
    public void iNotSelectTaxExemptOnCustomerProfileScreen() throws InterruptedException {
        new CustomerProfileWindow().selectTaxExemptCustomerProfile1();
    }

    @And ("^I remove tax exempt on customer profile screen$")
    public void iRemoveTaxExemptOnCustomerProfileScreen() throws InterruptedException {
        new CustomerProfileWindow().removeTaxExemptCustomerProfile();
    }

    @When("^I click the Save button$")
    public void iClickTheSaveButton() throws InterruptedException {
        new CustomerProfileWindow().pressSaveBtn();
    }

    @Then ("^I should see enter email or mobile number popup$")
    public void iShouldSeeEnterEmailOrMobileNumberPopup(){
        new CustomerProfileWindow().verifyEmailOrMobileTxt();
    }

    @Then("^I should see the Ordering Screen with a button with the label \"([^\"]*)\"$")
    public void iShouldSeeTheOrderingScreenWithAButtonWithTheLabel(String label) {
        Assert.assertEquals(new OrderTypeWindow().orderTypeName(label), label);
    }

    @And ("^I click loyalty button on the customer profile window$")
    public void iClickLoyaltyButtonOnTheCustomerProfileWindow(){
        new CustomerProfileWindow().clickLoyaltyButton();
    }

    @Then ("^I should see loyalty balance window$")
    public void iShouldSeeLoyaltyBalanceWindow(){
        new CustomerProfileWindow().verifyLoyaltyScreen();
    }

    @Then ("^I should see loyalty on the loyalty balance window$")
    public void iShouldSeeLoyaltyOnTheLoyaltyBalanceWindow() throws Exception {
        new CustomerProfileWindow().verifyLoyaltyBalance();
    }

    @Then ("^I should see loyalty balance$")
    public void iShouldSeeLoyaltyBalance(){
        new CustomerProfileWindow().verifyLoyaltyBalanceInCustomerProfileWindow();
    }

    @And ("^I close the loyalty balance window$")
    public void iCloseTheLoyaltyBalanceWindow(){
        new CustomerProfileWindow().closeLoyaltyBalanceWindow();
    }

    @Then ("^I should see loyalty changes$")
    public void iShouldSeeLoyaltyChanges(){
        new CustomerProfileWindow().compareLoyaltyBalance();
    }

    @And ("^I get the loyalty balance in customer profile window$")
    public void iGetTheLoyaltyBalanceInCustomerProfileWindow() throws InterruptedException {
        new CustomerProfileWindow().getLoyaltyBalance();
    }

    @And ("^I closed customer profile window$")
    public void iClosedCustomerProfileWindow(){
        new CustomerProfileWindow().closedCustomerProfile();
    }

    @And ("^I closed customer profile window1$")
    public void iClosedCustomerProfileWindow1(){
        new CustomerProfileWindow().closedCustomerProfile1();
    }

    @When ("^I enter the card number as \"([^\"]*)\" on the account type screen$")
    public void iEnterTheCardNumberAsOnTheAccountTypeScreen(String Number){
        new CustomerProfileWindow().enterTheCardNumberAccountTypeScreen(Number);
    }

    @And ("^I set the membership name$")
    public void iSetTheMembershipName() throws Exception {
        new CustomerProfileWindow().setTheMembershipName();
    }

    @And ("^I set the membership type$")
    public void iSetTheMembershipType() throws Exception {
        new CustomerProfileWindow().setTheMembershipType();
    }

    @And ("^I set the issue Date$")
    public void iSetTheIssueDate(){
        new CustomerProfileWindow().setTheIssueDate();
    }

    @And ("^I set the expiry date$")
    public void iSetTheExpiryDate(){
        new CustomerProfileWindow().setTheExpiryDate();
    }

    @And ("^I enter recharge amount as \"([^\"]*)\" in the account types screen for membership$")
    public void iEnterRechargeAmountInTheAccountTypesScreenForMembership(String number){
        new CustomerProfileWindow().enterTheRechargeAmount(number);
    }

    @And ("^I click save button in the account type screen$")
    public void iClickSaveButtonInTheAccountTypeScreen(){
        new CustomerProfileWindow().clickSaveBtnInTheAccountTypeScreen();
    }
}
