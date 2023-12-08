package com.qa.stepdef;

import com.qa.pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TGCustomerProfileStepDef {


    @And("User select search")
    public void userSelectSearch() {
        new TGCustomerProfilePage().pressSearchField();
    }

    @And("User enter an existing customer's name {string}")
    public void userEnterAnExistingCustomerSName(String customerName) {
        new TGCustomerProfilePage().sendCustomerName();
    }
    @And("User select the customer")
    public void userSelectTheCustomer() {
        new TGCustomerProfilePage().selectCustomer();
    }

    @And("User save customer profile")
    public void userSaveCustomerProfile() {
        new TGCustomerProfilePage().pressSaveBtn();
    }

    @And("User verify selected customer")
    public void userVerifySelectedCustomer() {
        new TGCustomerProfilePage().verifySelectedCustomer();
    }

    @When("User click the Save button")
    public void userClickTheSaveButton() {
        new TGCustomerProfilePage().pressSaveBtn();
    }

    @Then("User enter customer first name")
    public void userEnterCustomerFirstName() {
        new TGCustomerProfilePage().enterFirstName();
    }

    @And("User enter customer last name")
    public void userEnterCustomerLastName() {
        new TGCustomerProfilePage().enterLastName();
    }

    @And("User click add button for phone number")
    public void userClickAddButtonForPhoneNumber() {
        new TGCustomerProfilePage().addPhoneNumberButton();
    }

    @And("User enter phone number")
    public void userEnterPhoneNumber() {
        new TGCustomerProfilePage().randomNumGen();
    }

    @And("User enter save button for phone number")
    public void userEnterSaveButtonForPhoneNumber() {
        new TGCustomerProfilePage().savePhoneNumberButton();
    }

    @And("User enter add button for customer address")
    public void userEnterAddButtonForCustomerAddress() {
        new TGCustomerProfilePage().addCustomerAddressButton();
    }

    @And("User search customer address")
    public void userSearchCustomerAddress() {
        new TGCustomerProfilePage().searchAddress();
    }

    @And("User enter customer city")
    public void userEnterCustomerCity() {
        new TGCustomerProfilePage().enterCity();
    }

    @And("User click customer profile save button")
    public void userClickCustomerProfileSaveButton() {
        new TGCustomerProfilePage().pressSaveBtn();
    }

    @Then("User search any customer")
    public void userSearchAnyCustomer() {
        new TGCustomerProfilePage().searchCustomer();
    }

    @And("User verify customer profile page")
    public void userVerifyCustomerProfilePage() {
        new TGCustomerProfilePage().verifyCustomerProfilePage();
    }

    @When("User search any customer phone on customer profile")
    public void userSearchAnyCustomerPhoneOnCustomerProfile() {
        new TGCustomerProfilePage().searchCustomer();
    }

//    @And("User enter customer email address")
//    public void userEnterCustomerEmailAddress() {
//        new TGCustomerProfilePage().enterEmail();
//    }

    @And("^User enter customer email address \"([^\"]*)\"$")
    public void userEnterCustomerEmailAddress(String email) {
        new CICloseDayScreen().passEmail(email);
    }

    @Then("User click close button for add customer mobile phone")
    public void userClickCloseButtonForAddCustomerMobilePhone() {
        new TGCustomerProfilePage().closeButtonForMobile();
    }

    @Then("User verify mobile number and email popup")
    public void userVerifyMobileNumberAndEmailPopup() {
        new TGCustomerProfilePage().verifyMobilePhoneEmailWarningPopup();
    }

    @And("User enter new customer mobile phone number")
    public void userEnterNewCustomerMobilePhoneNumber() {
        new TGCustomerProfilePage().randomNumGen();
    }

    @Then("User click customer address dropdown list")
    public void userClickCustomerAddressDropdownList() {
        new TGCustomerProfilePage().clickCustomerAddressDropDownIcon();
    }

    @And("User verify empty customer address dropdown list")
    public void userVerifyEmptyCustomerAddressDropdownList() {
        new TGCustomerProfilePage().verifyEmptyCustomerAddressList();
    }

    @When("User edit customer first name")
    public void userEditCustomerFirstName() {
        try {
        new TGCustomerProfilePage().editCustomerFirstName();}
        catch(Exception e){

        }
    }

    @Then("User select last added customer")
    public void userSelectLastAddedCustomer() {
        new TGCustomerProfilePage().selectLastAddedCustomer();
    }

    @And("User swipe until last added customer")
    public void userSwipeUntilLastAddedCustomer() throws Exception {
        new TGCustomerProfilePage().swipeUntilLastAddedCustomer("up");
    }

    @When("User click Customer Plan button")
    public void userClickCustomerPlanButton() {
        new TGCustomerProfilePage().clickCustomerPlanButton();
    }

    @Then("User verify House Account page")
    public void userVerifyHouseAccountPage() {
        new TGCustomerProfilePage().verifyHouseAccountPage();
    }

    @And("User click the Update button for house account")
    public void userClickTheUpdateButtonForHouseAccount() {
        new TGCustomerProfilePage().clickTheUpdateButtonForHouseAccount();
    }

    @When("User enter recharge amount for House Account")
    public void userEnterRechargeAmountForHouseAccount() {
        new TGCustomerProfilePage().enterRechargeAmountForHouseAccount();
    }

    @And("User verify recharged amount on House Account")
    public void userVerifyRechargedAmountOnHouseAccount() {
        new TGCustomerProfilePage().verifyRechargedAmountOnHouseAccount();
    }

    @When("User enter house account card number \"([^\"]*)\"$")
    public void userEnterHouseAccountCardNumber(String number) {
        new TGCustomerProfilePage().enterHouseAccountCardNumber(number);
    }

    @And("User open Limit toggle if it is closed")
    public void userOpenLimitToggleIfItIsClosed() {
        new TGCustomerProfilePage().openLimitToggleIfItIsClosed();
    }

    @And("User enter limit amount for house account")
    public void userEnterLimitAmountForHouseAccount() {
        new TGCustomerProfilePage().enterLimitAmountForHouseAccount();
    }

    @And("User open max limit toggle if it is closed")
    public void userOpenMaxLimitToggleIfItIsClosed() {
        new TGCustomerProfilePage().openMaxLimitToggleIfItIsClosed();
    }

    @And("User click the Save button for house account")
    public void userClickTheSaveButtonForHouseAccount() {
        new TGCustomerProfilePage().clickTheSaveButtonForHouseAccount();
    }

    @And("User select searched customer")
    public void userSelectSearchedCustomer() {
        new TGCustomerProfilePage().selectSearchedCustomer();
    }

    @And("I enter the percentage in Ha screen as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterThePercentageInHaScreenAs(String pin2, String pin0, String pin00, String pin1) {
        new TGCustomerProfilePage().enterPercentage(pin2,pin0,pin00,pin1);
    }

    @When("^User click the \"([^\"]*)\" button in the customer profile screen \"([^\"]*)\"$")
    public void userClickTheButtonInTheCustomerProfileScreen(String btnCustomerPlan, String msg) {
        new CIWaitListPage().commonBtn(btnCustomerPlan,msg);

    }

    @When("^User click the \"([^\"]*)\" in the house account screen \"([^\"]*)\"$")
    public void userClickTheInTheHouseAccountScreen(String btnUpdate, String msg) {
        new CIWaitListPage().commonBtn(btnUpdate,msg);
    }

    //add new step
    @And("User click close button on Customer Profile")
    public void userClickCloseButtonOnCustomerProfile() {
        new TGCustomerProfilePage().clickCloseButtonOnCustomerProfile();}

        //new step (nov12)
    @When("^I click \"([^\"]*)\" on Menu Item page \"([^\"]*)\"$")
    public void iClickOnMenuItemPage(String btnServiceType, String msg) {
        new CICloseDayScreen().commonAccessibilityId(btnServiceType,msg);
    }

    @And("^I click the \"([^\"]*)\" in the customer profile screen \"([^\"]*)\"$")
    public void iClickTheInTheCustomerProfileScreen(String btnSave, String msg) {
        new CICloseDayScreen().commonAccessibilityId(btnSave,msg);
    }
}
