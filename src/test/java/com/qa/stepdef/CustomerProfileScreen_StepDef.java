//package com.qa.stepdef;
//
//import com.qa.pages.CICloseDayScreen;
//import com.qa.pages.CustomerProfileScreen_Pages;
//import com.qa.utils.TestUtils;
//import io.cucumber.java.en.*;
//import org.testng.Assert;
//
//public class CustomerProfileScreen_StepDef {
//
//    CustomerProfileScreen_Pages s = new CustomerProfileScreen_Pages();
//
//    @And("^User select the Phone Delivery order type$")
//    public void userSelectThePhoneDeliveryOrderType() throws InterruptedException {
//        s.clickPhoneDeliveryInOrderTypePopup();
//    }
//
//    @And("^User select the DELIVERY order type$")
//    public void userSelectTheDeliveryOrderType() throws InterruptedException {
//        s.clickDeliveryInOrderTypePopup();
//    }
//
//    @And("^User select the order type FORHERE$")
//    public void userSelectTheForHereOrderType() throws InterruptedException {
//        s.clickForHereInOrderTypePopup();
//    }
//
//    @And("^User select the TOGO order type$")
//    public void userSelectTheToGoOrderType() throws InterruptedException {
//        s.clickToGoInOrderTypePopup();
//    }
//
//    @And("^User select the Phone To Go order type$")
//    public void userSelectThePhoneToGoOrderType() throws InterruptedException {
//        s.clickPhoneTogoInOrderTypePopup();
//    }
//
//    @And("^Click the close button of Customer Profile Screen$")
//    public void clickTheCloseButtonOfCustomerProfileScreen()
//    {
//        s.clickCloseButn();
//    }
//
//    @And("^Click Yes button on Switch to QSR popup$")
//    public void clickYesButtonOnSwitchToQSRPopup()
//    {
//        s.clickYesBtnInPopup();
//    }
//
//    @And("^User click All button in QSR Screen$")
//    public void userClickAllButtonInQSRScreen() throws InterruptedException {
//        s.clickAllBtn();
//        Thread.sleep(500);
//    }
//
//    @Then("^User click QSR tab in the All Screen$")
//    public void userClickQSRTabInTheAllScreen() {
//        s.clickTheQSROption();
//    }
//
//    @Then("^Click the Operation button in the QSR order screen$")
//    public void clickTheOperationButtonInTheQSROrderScreen() {
//        s.clickTheOperationBtn();
//    }
//
//    @Then("^I click the POS settings$")
//    public void iClickThePOSSettings() {
//        s.clickThePOSSettingsOption();
//    }
//
//    @Then("^Enable the Required Phone Number for For Here Order toggle$")
//    public void enableTheRequiredPhoneNumberForForHereOrderToggle() throws Exception {
//        Thread.sleep(2000);
//        s.enableTheToggleOfRequiredPhoneNumberForFORHEREOrder();
//    }
//
//    @Then("^I click the menu option$")
//    public void iClickTheMenuOption() {
//        s.clickThemenuOptionInSettingsScreen();
//    }
//
//    @Then("^I click the \"([^\"]*)\" in the operation screen\"([^\"]*)\" for QSR$")
//    public void iClickTheInTheOperationScreenClickPOSForQSR(String opt, String msg) throws InterruptedException {
//        s.clickThePOSOption(opt, msg);
//    }
//
//    @Then("^Disable the Required Phone Number for For Here Order toggle$")
//    public void disableTheRequiredPhoneNumberForForHereOrderToggle() throws Exception {
//        Thread.sleep(2000);
//        s.disableTheToggleOfRequiredPhoneNumberForFORHEREOrder();
//    }
//
//    @Then("^I should see Check number in the order screen with \"([^\"]*)\" text$")
//    public void iShouldSeeCheckNumberInTheOrderScreen(String check) {
//        Assert.assertEquals(s.getCheckText(),check);
//    }
//
//    @When("^I click on \"([^\"]*)\" for closing order screen popup \"([^\"]*)\" in QSR$")
//    public void iClickOnForClosingOrderScreenPopupForCDS(String cancel, String msg) throws InterruptedException {
//        s.clickTheCancelBtn(cancel, msg);
//    }
//
//    @And("^User select Phone Delivery from Drop Down$")
//    public void userSelectPhoneDeliveryFromDropDown() {
//        s.clickThePhoneDeliveryFromDropDown();
//    }
//
//    @And("^User select the DELIVERY order type from Drop Down$")
//    public void userSelectDeliveryFromDropDown() {
//        s.clickTheDeliveryFromDropDown();
//    }
//
//    @And("^User select the order type FORHERE from Drop Down$")
//    public void userSelectForHereFromDropDown() {
//        s.clickTheForHereFromDropDown();
//    }
//
//    @And("^User select the order type Phone To Go from Drop Down$")
//    public void userSelectPhoneToGoFromDropDown() {
//        s.clickThePhoneToGoFromDropDown();
//    }
//
//    @And("^User select the order type To Go from Drop Down$")
//    public void userSelectToGoFromDropDown() {
//        s.clickTheToGoFromDropDown();
//    }
//
//    @And("^User select the order type QSR from Drop Down$")
//    public void userSelectQSRFromDropDown() {
//        s.clickTheQSRFromDropDown();
//    }
//
//    @And("^User click For Here on Menu Item page$")
//    public void userClickForHereOnMenuItemPage() {
//        s.clickTheForHereFromDropDown();
//    }
//
//    @And("^User click To Go on Menu Item page$")
//    public void userClickToGoOnMenuItemPage() throws InterruptedException {
//        Thread.sleep(500);
//        s.clickTheToGoFromDropDown();
//    }
//
//    @And("^Enter the \"([^\"]*)\" of existing customer in the search tab$")
//    public void enterThePhoneNumberOfExistingCustomerInTheSearchTab(String phnNumber) throws InterruptedException {
//        s.enterTheCustomerPhoneNumberInTheSearchField(phnNumber);
//    }
//
//    @And("^Click the search button$")
//    public void clickTheSearchBtn() {
//        s.clickTheSearchBtn();
//    }
//
//    @And("^Existing \"([^\"]*)\" should be displayed$")
//    public void existingCustomerNameShouldBeDisplayed(String custName) throws InterruptedException {
//        Thread.sleep(500);
//        String actCustName = s.getTheCustomerName();
//        Assert.assertEquals(actCustName,custName);
//    }
//
//    @And("^Click the finish button$")
//    public void clickTheFinishBtn() {
//        s.clickTheFinishButton();
//    }
//
//    @And("^Click QSR button in Check Stats window$")
//    public void clickQSRBtnInCheckStatsScreen() throws InterruptedException {
//        Thread.sleep(1500);
//        s.clickTheQSRButton();
//    }
//
//    @And("^Enter the First Name$")
//    public void enterTheFirstName() {
//        s.enterTheFirstNameInTheCustomerProfileScreen();
//    }
//
//    @Then("^Enter the Second Name$")
//    public void enterTheSecondName() {
//        s.enterTheSecondNameInTheCustomerProfileScreen();
//    }
//
//    @And("^Click the Add button of mobile number$")
//    public void clickTheAddButtonOfMobileNumber() {
//        s.clickTheAddBtnOfMobileNumberInCustomerProfileScreen();
//    }
//
//    @Then("^Enter the mobile number$")
//    public void enterTheMobileNumber() {
//        s.enterTheMobileNumberInTheCustomerProfileScreen();
//    }
//
//    @Then("^Click the Add button of Address$")
//    public void clickTheAddButtonOfAddress() {
//        s.clickTheAddBtnOfAddressInCustomerProfileScreen();
//    }
//
//    @And("^Click Enter Address button$")
//    public void clickEnterAddressButton() {
//        s.clickTheEnterAddressBtnInTheCustomerProfileScreen();
//    }
//
//    @And("^Enter the Address in the Add address popup$")
//    public void enterTheAddressInTheAddAddressPopup() throws InterruptedException {
//        s.enterTheAddressInTheCustomerProfileScreen();
//        Thread.sleep(3000);
//    }
//
//    @Then("^Verify the added customer should be added in the Order screen$")
//    public void verifyTheAddedCustomerShouldBeAddedInTheOrderScreen() {
//        if(s.getTheCustomerNameInTheOrderScreen().contains(s.getTheFirstNameInTheCustomerProfileScreen()))
//        {
//            TestUtils utils = new TestUtils();
//            utils.log().info("The mentioned Customer is available in the Customer Profile Screen");
//        }
//    }
//
//    @Then("^Click the drop down of mobile number field$")
//    public void clickTheDropDownOfMobileNumberField() {
//        s.clickTheMobileFieldInTheCustomerProfileScreen();
//    }
//
//    @And("^Verify the newly added number should be displayed$")
//    public void verifyTheNewlyAddedNumberShouldBeDisplayed() {
//        Assert.assertEquals(s.getTheMobileNumberInTheCustomerProfileScreen(),s.getTheAlreadySavedMobileNumberInTheCustomerProfileScreen());
//    }
//
//    @And("^Click the drop down of address field$")
//    public void clickTheDropDownOfAddressField() {
//        s.clickTheAddressFieldInTheCustomerProfileScreen();
//    }
//
//    @Then("^Verify the newly added address should be displayed$")
//    public void verifyTheNewlyAddedAddressShouldBeDisplayed() {
//        if(s.getTheAlreadySavedAddressInTheCustomerProfileScreen().contains(s.getTheAddressInTheCustomerProfileScreen()))
//        {
//            TestUtils utils = new TestUtils();
//            utils.log().info("The mentioned address is available in the Customer Profile Screen");
//        }
//    }
//
//    @And("^Click the Customer Plan button$")
//    public void clickTheCustomerPlanButton() {
//        s.clickTheCustomerPlanButtonInTheCustomerProfileScreen();
//    }
//
//    @And("^Verify the Account Types as \"([^\"]*)\"$")
//    public void verifyTheAccountTypeAs(String HouseAccount) {
//        String AccTypes = s.getTheAttributeValueOfAccountsType();
//        Assert.assertEquals(AccTypes,HouseAccount);
//    }
//
//    @And("^Click the searched result by \"([^\"]*)\"$")
//    public void clickTheSearchedCustomerBy(String ph) {
//        s.clickTheSearchedCustomer(ph);
//    }
//
//    @Then("^Verify the Account Types, Name, Balance, Card Number, Recharge, Limit, Max Limit, Limit Period and Allow Credit fields should be displayed$")
//    public void verifyTheAccountTypeNameBalanceCardNumberRechargeLimitMaxLimitLimitPeriodAndAllowCreditFieldsShouldBeDisplayed() {
//
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_AccountType(),"Account Types");
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_Name(),"Name");
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_Balance(),"Balance");
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_CardNumber(),"Card Number");
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_Recharge(),"Recharge");
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_Limit(),"Limit");
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_MaxLimit(),"Max Limit");
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_LimitPeriod(),"Limit Period");
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_AllowCredit(),"Allow Credit");
//    }
//
//    @And("^Click the drop down of Account Types$")
//    public void clickTheDropDownOfAccountTypes() {
//        s.clickDownArrowOfAccountTypesInTheCustomerProfileScreen();
//    }
//
//    @And("^Select the option as Membership$")
//    public void selectTheOptionAsMembership() {
//        s.clickTheMembershipOptionInAccountTypes();
//    }
//
//    @Then("^Verify the Account Types, Name, Balance, Card Number, Recharge, Membership Name, Membership Type, Issue Date and Expiry Date fields should be displayed$")
//    public void verifyTheAccountTypeNameBalanceCardNumberRechargeMembershipNameMembershipTypeIssueDateAndExpiryDateFieldsShouldBeDisplayed() {
//
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_AccountType(),"Account Types");
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_Name(),"Name");
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_Balance(),"Balance");
//        Assert.assertEquals(s.verifyTheHouseAccountsFields_Recharge(),"Recharge");
//        Assert.assertEquals(s.verifyTheMembershipFields_CardNumberOrResidentCode(),"Card Number / Resident Code");
//        Assert.assertEquals(s.verifyTheMembershipFields_MembershipName(),"Membership Name");
//        Assert.assertEquals(s.verifyTheMembershipFields_MembershipType(),"Membership Type");
//        Assert.assertEquals(s.verifyTheMembershipFields_IssueDate(),"Issue Date");
//        Assert.assertEquals(s.verifyTheMembershipFields_ExpiryDate(),"Expiry Date");
//    }
//
//    @And("^Click the Recharge field$")
//    public void clickTheRechargeField() {
//        s.clickTheRechargeField();
//    }
//
//    @And("^Enter the required amount$")
//    public void enterTheRequiredAmount() {
//        s.enterTheRequiredRechargeAmount();
//    }
//
//    @And("^Click the Update button$")
//    public void clickTheUpdateButton() {
//        s.clickTheUpdateButton();
//    }
//
//    @And("^Click the cash button$")
//    public void clickTheCashButton() {
//        s.clickTheCashTab();
//    }
//
//    @And("^Enter the Exact button$")
//    public void enterTheExactButton() {
//        s.clickTheExactButtonOption();
//    }
//
//    @Then("^Click the enter button$")
//    public void clickTheEnterButton() {
//        s.clickTheEnterButtonOption();
//    }
//
//    @And("^Add the menu item and complete the sale$")
//    public void addTheMenuItemAndCompleteTheSale() {
//        s.selectTheMenuRandomly();
//        s.clickTheCashTab();
//        s.clickTheExactButtonOption();
//        s.clickTheEnterButtonOption();
//    }
//
//    @Then("^Verify the Previous Orders should be displayed$")
//    public void verifyThePreviousOrderShouldBeDisplayed() {
//        Assert.assertEquals(s.getTheTextOfPreviousOrderInTheCustomerProfileScreen(),"PREVIOUS ORDERS");
//    }
//
//    @And("^Select anyone order from the list of previous orders$")
//    public void selectAnyoneOrderFromTheListOfPreviousOrders() {
//        s.clickThePreviouslyCompletedOrderFromPreviousOrderTable();
//    }
//
//    @And("^Click the Repeat Order button$")
//    public void clickTheRepeatOrderButton() {
//        s.clickTheRepeatOrderBtn();
//    }
//
//    @Then("^Order screen should be displayed$")
//    public void orderScreenShouldBeDisplayed() {
//        Assert.assertEquals(s.getTheTextOfSeatsInOrderScreen(),"Seats");
//    }
//
//    @And("^Click the display order button$")
//    public void clickTheDisplayOrderButton() {
//        s.clickTheDisplayOrderBtn();
//    }
//
//    @Then("^Order Summary should be displayed$")
//    public void orderSummaryShouldBeDisplayed() {
//        Assert.assertEquals(s.getTheTextOfOrderSummaryText(),"ORDER SUMMARY");
//    }
//
//    @And("^Click the Back button$")
//    public void clickTheBackButton() {
//        s.clickTheBackButton();
//    }
//
//    @And("^Click the Loyalty button$")
//    public void clickTheLoyaltyButton() {
//        s.clickTheLoyaltyBtn();
//    }
//
//    @Then("^Loyalty Balance screen should be displayed with Date, Check No, Type and Amount field$")
//    public void loyaltyBalanceScreenShouldBeDisplayedWithDateCheckNoTypeAndAmountField() {
//        Assert.assertEquals(s.getTheTextOfLoyaltyBalanceText(),"Loyalty Balance");
//        Assert.assertEquals(s.getTheTextOfDate_LoyaltyBalance(),"Date");
//        Assert.assertEquals(s.getTheTextOfCheckNumber_LoyaltyBalance(),"Check No");
//        Assert.assertEquals(s.getTheTextOfType_LoyaltyBalance(),"Type");
//        Assert.assertEquals(s.getTheTextOfAmount_LoyaltyBalance(),"Amount");
//    }
//
//    @And("^Click the Close button of Loyalty Balance screen$")
//    public void clickTheCloseButtonOfLoyaltyBalanceScreen() {
//        s.clickTheCloseBtn_LoyaltyBalance();
//    }
//
//    @And("^Enable the Tax Exempt option$")
//    public void enableTheTaxExemptOption() {
//        s.enableTheTaxExemptBtn();
//    }
//
//    @And("^Place the menu item$")
//    public void placeTheMenuItem() {
//        s.selectTheMenuRandomly();
//    }
//
//    @Then("^Verify the tax option in the check$")
//    public void verifyTheTaxOptionInTheCheck() {
//        s.verifyTheTextOfTax();
//    }
//
//    @And("^Click the Check Stats tab$")
//    public void clickTheCheckStatsTab() {
//        s.clickTheCheckStatsTab();
//    }
//
//    @And("^Click the closed Check tab$")
//    public void clickTheClosedCheckTab() {
//        s.clickTheClosedTab();
//    }
//
//    @And("^Click the recently closed check$")
//    public void clickTheRecentlyClosedCheck() throws Exception {
//        s.clickTheRecentlyClosedTab();
//    }
//
//    @And("^Click the Re-Open check$")
//    public void clickTheReopenCheck() {
//        s.clickTheReopenCheckBtn();
//    }
//
//    @And("^Click the Customer name in the Order Screen$")
//    public void clickTheCustomerNameInTheOrderScreen() {
//        s.clickTheCustomerName();
//    }
//
//    @And("^Enter the Email id$")
//    public void enterTheEmailId() {
//        s.enterTheEmailIdInCustomerProfileScreen();
//    }
//
//    @And("^Enter the Curbside Notes like Vehicle Number, Make, Model and Color fields$")
//    public void enterTheCurbSideNotesLikeVehicleNumberMakeModelAndColorFields() {
//        s.enterTheVehicleNoOrLicensePlateTxt_CustomerProfileScreen();
//        s.enterMakeTxt_CustomerProfileScreen();
//        new CICloseDayScreen().commonAccessibilityId("Hide keyboard","Click the Keyboard hide button");
//        s.enterTheModelTxt_CustomerProfileScreen();
//        s.enterTheColorTxt_CustomerProfileScreen();
//    }
//}
