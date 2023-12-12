package com.qa.stepdef;

import com.qa.pages.ClockInScreen;
import com.qa.pages.CustomerProfileWindow;
import com.qa.pages.OrderTypeWindow;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerProfileStepDef {

    public WebDriver driver = TestUtils.driver;

    @And("I should see an asterisk next to the Mobile field")
    public void iShouldSeeAnAsteriskNextToTheMobileField() {
        Assert.assertEquals(new CustomerProfileWindow(driver).getPhoneAsterisk(), "*" );
    }

    @And("^I should see an asterisk next to the Address field$")
    public void iShouldSeeAnAsteriskNextToTheAddressField() {
        Assert.assertEquals(new CustomerProfileWindow(driver).getAddressAsterisk(), "*");
    }

    @And("^I select search$")
    public void iSelectSearch() {
        new CustomerProfileWindow(driver).pressSearchField();
    }

    @When ("^I verify the customer as \"([^\"]*)\" is available in the customer profile window$")
    public void iVerifyTheCustomerIsAvailableInTheCustomerProfileWindow(String customer) throws Exception {
        new CustomerProfileWindow(driver).verifyTheCustomerIsAvailableInTheCustomerProfileWindow(customer);
    }

    @And("^I enter an existing customer's name \"([^\"]*)\"$")
    public void iEnterAnExistingCustomerSName(String customerName) {
        new CustomerProfileWindow(driver).sendCustomerName(customerName);
    }

    @And("^I select an existing customer's name \"([^\"]*)\"$")
    public void iSelectAnExistingCustomerSName(String customerName) {
        new CustomerProfileWindow(driver).sendAndSelectCustomerName(customerName);
    }

    @And("^I select the customer")
    public void iSelectTheCustomer() {
        new CustomerProfileWindow(driver).selectCustomer();
    }

    @When ("^I select the last sale of the customer$")
    public void iSelectTheLastSaleOfTheCustomer(){
        new CustomerProfileWindow(driver).selectTheLastSaleOfTheCustomer();
    }

    @When("^I click repeat Order button on the customer profile window$")
    public void iClickRepeatOrderButtonOnTheCustomerProfileWindow(){
        new CustomerProfileWindow(driver).clickRepeatOrderButton();
    }

    @And("^I select the customer for autoMembership")
    public void iSelectTheCustomerForAutoMembership() {
        new CustomerProfileWindow(driver).selectCustomerForMembership();
    }

    @And ("^I select the customer for tax exempt$")
    public void iSelectTheCustomerForTaxExempt(){
        new CustomerProfileWindow(driver).selectCustomerforTaxExempt();
    }

    @And("^I select the customer for NMI")
    public void iSelectTheCustomerForNmi() {
        new CustomerProfileWindow(driver).selectCustomerForNmi();
    }

    @And ("^I select the customer for loyalty$")
    public void iSelectTheCustomerForLoyalty(){
        new CustomerProfileWindow(driver).selectCustomerLoyalty();
    }

    @And ("^I click customer plan button$")
    public void iClickCustomerPlanButton(){
        new CustomerProfileWindow(driver).selectCustomerPlan();
    }

    @Then ("^I should see Account type screen$")
    public void iShouldSeeAccountTypeScreen() {
        Assert.assertEquals(new CustomerProfileWindow(driver).verifyAccountType(), "Account Types");
    }

    @And ("^I click membership from the account type screen$")
    public void iClickMembershipFromTheAccountTypeScreen() throws InterruptedException {
        new CustomerProfileWindow(driver).selectMembershipFromAccountType();
    }
    @And ("^I click house account field and enter recharge amount$")
    public void iClickHouseAccountFieldAndEnterRechargeAmount(){
        new CustomerProfileWindow(driver).clickAccountTypeField();
    }

    @And ("^I click update button$")
    public void iClickUpdateButton(){
        new CustomerProfileWindow(driver).clickUpdateBtn();
    }

    @Then ("^I should see house account add on order screen$")
    public void iShouldSeeHouseAccountAddOnOrderScreen(){
        Assert.assertEquals(new CustomerProfileWindow(driver).houseAccountOnOrderScreen(),"HA-3578655");
    }

    @And ("^I select tax exempt on customer profile screen$")
    public void iSelectTaxExemptOnCustomerProfileScreen() throws InterruptedException {
        new CustomerProfileWindow(driver).selectTaxExemptCustomerProfile();
    }

    @When("^I click the Save button$")
    public void iClickTheSaveButton() throws InterruptedException {
        new CustomerProfileWindow(driver).pressSaveBtn();
    }

    @Then ("^I should see enter email or mobile number popup$")
    public void iShouldSeeEnterEmailOrMobileNumberPopup(){
        new CustomerProfileWindow(driver).verifyEmailOrMobileTxt();
    }

    @Then("^I should see the Ordering Screen with a button with the label \"([^\"]*)\"$")
    public void iShouldSeeTheOrderingScreenWithAButtonWithTheLabel(String label) {
        Assert.assertEquals(new OrderTypeWindow(driver).orderTypeName(label), label);
    }

    @And ("^I click loyalty button on the customer profile window$")
    public void iClickLoyaltyButtonOnTheCustomerProfileWindow(){
        new CustomerProfileWindow(driver).clickLoyaltyButton();
    }

    @Then ("^I should see loyalty balance window$")
    public void iShouldSeeLoyaltyBalanceWindow(){
        new CustomerProfileWindow(driver).verifyLoyaltyScreen();
    }

    @Then ("^I should see loyalty on the loyalty balance window$")
    public void iShouldSeeLoyaltyOnTheLoyaltyBalanceWindow() throws Exception {
        new CustomerProfileWindow(driver).verifyLoyaltyBalance();
    }

    @Then ("^I should see loyalty balance$")
    public void iShouldSeeLoyaltyBalance(){
        new CustomerProfileWindow(driver).verifyLoyaltyBalanceInCustomerProfileWindow();
    }

    @And ("^I close the loyalty balance window$")
    public void iCloseTheLoyaltyBalanceWindow(){
        new CustomerProfileWindow(driver).closeLoyaltyBalanceWindow();
    }

    @Then ("^I should see loyalty changes$")
    public void iShouldSeeLoyaltyChanges(){
        new CustomerProfileWindow(driver).compareLoyaltyBalance();
    }

    @And ("^I get the loyalty balance in customer profile window$")
    public void iGetTheLoyaltyBalanceInCustomerProfileWindow() throws InterruptedException {
        new CustomerProfileWindow(driver).getLoyaltyBalance();
    }

    @And ("^I closed customer profile window$")
    public void iClosedCustomerProfileWindow(){
        new CustomerProfileWindow(driver).closedCustomerProfile();
    }

    @When ("^I enter the card number as \"([^\"]*)\" on the account type screen$")
    public void iEnterTheCardNumberAsOnTheAccountTypeScreen(String Number){
        new CustomerProfileWindow(driver).enterTheCardNumberAccountTypeScreen(Number);
    }

    @And ("^I set the membership name$")
    public void iSetTheMembershipName() throws Exception {
        new CustomerProfileWindow(driver).setTheMembershipName();
    }

    @And ("^I set the membership type$")
    public void iSetTheMembershipType() throws Exception {
        new CustomerProfileWindow(driver).setTheMembershipType();
    }

    @And ("^I set the issue Date$")
    public void iSetTheIssueDate(){
        new CustomerProfileWindow(driver).setTheIssueDate();
    }

    @And ("^I set the expiry date$")
    public void iSetTheExpiryDate(){
        new CustomerProfileWindow(driver).setTheExpiryDate();
    }

    @And ("^I enter recharge amount as \"([^\"]*)\" in the account types screen for membership$")
    public void iEnterRechargeAmountInTheAccountTypesScreenForMembership(String number){
        new CustomerProfileWindow(driver).enterTheRechargeAmount(number);
    }

    @And ("^I click save button in the account type screen$")
    public void iClickSaveButtonInTheAccountTypeScreen(){
        new CustomerProfileWindow(driver).clickSaveBtnInTheAccountTypeScreen();
    }

    @Then("I should see the add customer screen in the window")
    public void iShouldSeeTheAddCustomerScreenInTheWindow() {

       String Add_Customer_Text = driver.findElement(By.xpath("//ion-header//p[contains(.,'Add Customer')]")).getText();
       if (Add_Customer_Text.equals("Add Customer")) {

       }else {

       }

    }

//    @And("I Click on the ByPhone Option")
//    public void iClickOnTheByPhoneOption() {
//
//        driver.findElement(By.xpath("//div[.='By Phone']")).click();
//
//
//    }

    @And("I Click on the Byname Option")
    public void iClickOnTheBynameOption() {

        driver.findElement(By.xpath("//div[.='By Name / Email']")).click();
    }
}
