package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PhoneOrderStepDef {

    public WebDriver driver = TestUtils.driver;

    @Then("^I should see the Phone Order tab$")
    public void iShouldSeeThePhoneOrderTab() {
        new PhoneOrderScreen().verifyPhoneOrderTab();
    }

    @And ("^I click future tab$")
    public void iClickFutureTab(){
        new PhoneOrderScreen().clickFutureTab();
    }

    @And ("^I click new tab button after click Future tab$")
    public void iClickNewTabButtonAfterClickFutureTab() throws InterruptedException {
        Thread.sleep(50000);
        new PhoneOrderScreen().clickPhoneOrderTab();
        Thread.sleep(10000);
    }

    @And ("^I click new tab button$")
    public void iClickNewTabButton() throws InterruptedException {
        new PhoneOrderScreen().clickNewTab();
    }

    @And("^I click active driver as \"([^\"]*)\"$")
    public void iClickActiveDriverAs(String driver) throws InterruptedException {
        new PhoneOrderScreen().clickActiveDriver(driver);
    }

    @Then("^I should see driver is offline popup$")
    public void iShouldSeeDriverIsOfflinePopup() {
        new PhoneOrderScreen().verifyPopup();
    }

    @And("^I click No button on driver is offline popup$")
    public void iClickNoButtonOnDriverIsOfflinePopup() {
        new PhoneOrderScreen().tapNoButton();
    }

    @And ("^I click Yes button on driver is offline popup$")
    public void iClickYesButtonOnDriverIsOfflinePopup(){
        new PhoneOrderScreen().tapYesButton();
    }

    @Then ("^I should see driver as \"([^\"]*)\" is added$")
    public void iShouldSeeDriverAsIsAdded(String name){
        new PhoneOrderScreen().verifyDriverAdded(name);
    }

    @And("^I click phone order tab$")
    public void iClickPhoneOrderTab() {
        new PhoneOrderScreen().clickPhoneOrderTab();
    }

    @And("^I click for here button in phone order tab$")
    public void iClickForHereButtonInPhoneOrderTab() {
        new PhoneOrderScreen().clickForHereTab();
    }

    @And("^I click TOGO button in phone order tab$")
    public void iClickToGOButtonInPhoneOrderTab() {
        new PhoneOrderScreen().clickToGoTab();
    }

    @And("^I click edit button in phone order tab$")
    public void iClickEditButtonInPhoneOrderTab() {
        new PhoneOrderScreen().clickEditBtn();
    }

    @And("^I click cancel order button in phone order screen$")
    public void iClickCancelOrderButtonInPhoneOrderScreen() {
        new PhoneOrderScreen().clickCancelOrderBtn();
    }

    @And("^I click Print in phone order tab$")
    public void iClickPrintInPhoneOrderTab() {
        new PhoneOrderScreen().clickPrintBtn();
    }

    @When("I click departure button$")
    public void iClickDepartureButton(){
        new PhoneOrderScreen().clickDepartureBtn();
    }

    @And ("^I click out tab in phone order screen$")
    public void iClickOutTabInPhoneOrderScreen() throws InterruptedException {
        new PhoneOrderScreen().clickOutTab();
    }
    @And ("^I click new tab button in phone order screen$")
    public void iClickNewTabButtonInPhoneOrdeScreen(){
        new PhoneOrderScreen().clickNewTab();
    }

    @And ("^I click new tab button in phone order screen from out$")
    public void iClickNewTabButtonInPhoneOrderScreenFromOut(){
        new PhoneOrderScreen().clickNewTab1();
    }

    @When ("^I click Arrival button in phone order screen$")
    public void iClickArrivalButtonInPhoneOrderScreen(){
        new PhoneOrderScreen().clickArrivalTab();
    }

    @Then ("^I should see cash window$")
    public void iShouldSeeCashWindow(){
        Assert.assertEquals(new PhoneOrderScreen().verifyCashWindow(),"Cash");
    }

    @Then ("^I should see delivery orders cannot submitted here warning message$")
    public void iShouldSeeDeliveryOrdersCannotSubmittedHereWarningMessage(){
        Assert.assertEquals(new PhoneOrderScreen().getWarningMsg(),"Delivery orders cannot be submitted here.");
    }

    @Then ("^I should see payment made on this check popup message for Phone order$")
    public void iShouldSeePaymentMadeOnThisCheckPopupMessageForPhoneOrder(){
        Assert.assertEquals(new PhoneOrderScreen().verifyPaymentMadePopup(),"Payment(s) made on this check,Can you return this to Auto r");
    }

    @Then ("^I should see closed check in complete tab$")
    public void iShouldSeeClosedCheckInCompleteTab() throws InterruptedException {
        new PhoneOrderScreen().verifyClosedCheckInCompleteTab();
    }
    @Then ("^I should see closed check in new tab$")
    public void iShouldSeeClosedCheckInNewTab() throws InterruptedException {
        new PhoneOrderScreen().verifyClosedCheckInNewTab();
    }
    @Then ("^I should see closed check in out tab$")
    public void iShouldSeeClosedCheckInOutTab() throws InterruptedException {
        new PhoneOrderScreen().verifyClosedCheckInOutTab();
    }
    @Then ("^I should see closed check in future tab$")
    public void iShouldSeeClosedCheckInFutureTab() throws InterruptedException {
        new PhoneOrderScreen().verifyClosedCheckInFutureTab();
    }

    @Then ("^I should see active check")
    public void iShouldSeeActiveCheck() throws InterruptedException {
        new PhoneOrderScreen().verifyClosedCheckInActiveCheckTab();
    }
    @Then ("^I should see closed check in closed check tab$")
    public void iShouldSeeClosedCheckInClosedCheckTab() throws InterruptedException {
        new PhoneOrderScreen().verifyClosedCheckInClosedCheckTab();
    }

    @And ("^I click closed checks details icon button$")
    public void iClickClosedChecksDetailsIconButton(){
        new OrderManagementScreen(driver).clickClosedChecksDetailsIcon();
    }

    @Then ("^I should see order summary screen$")
    public void iShouldSeeOrderSummaryScreen(){
        new OrderManagementScreen(driver).verifyOrderSummaryScreen();
    }

    @When ("^I verify subtotal value with order summary subtotal value$")
    public void iVerifySubtotalValueWithOrderSummarySubtotalValue(){
        new OrderManagementScreen(driver).verifySubtotalValueWithOrderSummarySubtotal();
    }

    @When ("^I verify total value with order summary total value when cash reward is enabled$")
    public void iVerifyTotalValueWithOrderSummarySubtotalValueWhenCashRewardIsEnabled(){
        new OrderManagementScreen(driver).verifyTotalValueWithOrderSummaryTotalValueCashReward();
    }

    @When ("^I verify tax value with order summary tax value when cash reward is enabled$")
    public void iVerifyTaxValueWithOrderSummaryTaxValueWhenCashRewardIsEnabled(){
        new OrderManagementScreen(driver).verifyTotalValueWithOrderSummaryTotalValueCashReward();
    }

    @And ("^I click back to checks button$")
    public void iClickBackToChecksButton(){
        new OrderManagementScreen(driver).clickBackToChecksBtn();
    }

    @When ("^I verify gratuity value with order summary total value when cash reward is enabled$")
    public void iVerifyGratuityValueWithOrderSummaryGratuityValueWhenCashRewardIsEnabled(){
        new OrderManagementScreen(driver).verifyTotalValueWithOrderSummaryTotalValueCashReward();
    }

    @When ("^I verify discount value with order summary discount value when cash reward is enabled$")
    public void iVerifyDiscountValueWithOrderSummaryDiscountValueWhenCashRewardIsEnabled(){
        new OrderManagementScreen(driver).verifyTotalValueWithOrderSummaryTotalValueCashReward();
    }

    @And ("^I click the Closed check on check stats$")
    public void iClickTheClosedCheckOnCheckStats() throws InterruptedException {
        new PhoneOrderScreen().selectClosedCheckFromClosedTab();
    }

    @And ("^I click the Closed check on check stats1$")
    public void iClickTheClosedCheckOnCheckStats1() throws InterruptedException {
        new PhoneOrderScreen().selectClosedCheckFromClosedTab1();
    }
    @And("^I click the active check on check stats")
    public void iClickTheActiveCheckOnCheckStats() throws InterruptedException {
        new PhoneOrderScreen().selectClosedCheckFromActiveTab();
    }

    @And ("^I click the Closed check in future tab$")
    public void iClickTheClosedCheckInFutureTab() throws Exception {
        new PhoneOrderScreen().selectCloseCheckInFutureTab();
    }

    @And ("^I click the Closed check in out tab$")
    public void iClickTheClosedCheckInOutTab() throws InterruptedException {
        new PhoneOrderScreen().selectCloseCheckInOutTab();
    }
    @And ("^I click the Closed check in new tab window$")
    public void iClickTheClosedCheckInNewTabWindow() throws InterruptedException {
        new PhoneOrderScreen().selectCloseCheckInNewTab();
    }

    @And ("^I click the Closed check in complete tab$")
    public void iClickTheClosedCheckInCompleteTab() throws InterruptedException {
        new PhoneOrderScreen().selectCloseCheckInCompleteTab();
    }

    @Then ("^I should see paid check is visible or not in phone order screen$")
    public void iShouldSeePaidCheckIsVisibleOrNotInPhoneOrderScreen() throws InterruptedException {
        new PhoneOrderScreen().verifyPaidCheckIsVisibleOrNot();
    }


    //Added Today

    @And ("^I click closed check in bar tab$")
    public void iClickClosedCheckInBarTab() throws InterruptedException {
        new PhoneOrderScreen().pressClosedCheckInBarTab();
    }
    @And ("^I click closed check in bar tab1$")
    public void iClickClosedCheckInBarTab1() throws InterruptedException {
        new PhoneOrderScreen().pressClosedCheckInBarTab1();
    }

    @And ("^I click merged barTab$")
    public void iClickMergedBarTab() throws InterruptedException {
        new PhoneOrderScreen().clickMergedBar();
    }

    @And ("^I click clear text button$")
    public void iClickClearTextButton() throws InterruptedException {
        new PhoneOrderScreen().clickClearText();
    }

    @And ("^I select prefix modifier$")
    public void iSelectPrefixModifier(){
        new CheckOptionsScreen(driver).selectPrefixModifier();
    }

    @Then ("^I should verify prefix modifier added to the menu$")
    public void iShouldVerifyPrefixModifierAddedToTheMenu(){
        new CheckOptionsScreen(driver).verifyPrefixAddedToTheMenu();
    }
    @And ("^I select Menu For Dine order type as \"([^\"]*)\"$")
    public void iSelectMenuForDineOrderType(String name) throws Exception {
        new Regression(driver).selectMenuForDineOrderType(name);
    }

    @Then ("^I should see Delivery charge is match with Amount in order screen$")
    public void iShouldSeeDeliveryChargeIsMatchWithAmountInOrderScreen(){
        new TableLayOutScreen(driver).verifyAmountWithDeliveryCharge();
    }
    @And ("^I click the Exit to close the preauth window$")
    public void iClickTheExitToCloseThePreauthWindow(){
        new PaymentWindow(driver).pressExitBtn();
    }

    @Then ("^I should see preauth window$")
    public void iShouldSeePreAuthWindow(){
        new BarTabScreen(driver).verifyPreAuthWindow();
    }

    @Then ("^I should see no device is connected to iPad$")
    public void iShouldSeeNoDeviceIsConnectedToIpad(){
        Assert.assertEquals(new BarTabScreen(driver).verifyNoDeviceIsConnected(),"No Device is connected to this iPad");
    }
    @And("^I enter the customer name randomly$")
    public void iEnterTheCustomerNameRandomly(){
        new PaymentWindow(driver).enterTheCustomerNameRandomly();
    }

    @And ("^I select category as \"([^\"]*)\"$")
    public void iSelectCategoryAs(String category) throws Exception {
//        new PaymentWindow(driver).categorySelection(category);
//        new BasePage().findAndClickMobileElement(ca);

        new PaymentWindow(driver).selectCategory1(category);
    }


    @And ("^I select uzumaki category$")
    public void iSelectUzumakiCategory() throws Exception {
//        new PaymentWindow(driver).categorySelection(category);
//        new BasePage().findAndClickMobileElement(ca);

        new PaymentWindow(driver).selectUzumakiCategory();
    }



    @And ("^I select the customer for basic$")
    public void iSelectTheCustomerForBasic(){
        new PaymentWindow(driver).selectCustomerBasic();
    }

    @And ("^I verify the customer previous order menu with order menu$")
    public void iVerifyTheCustomerPreviousOrderMenuWithOrderMenu(){
        new PaymentWindow(driver).verifyCustomerPreviousOrderMenuWithOrderMenu();
    }

    @When ("^I select the previous order on customer profile screen$")
    public void iSelectThePreviousOrderOnCustomerProfileScreen(){
        new PaymentWindow(driver).selectPreviousOrderOnCustomer();
    }

    @And ("^I delete the menu item in the order screen$")
    public void iDeleteTheMenuItemInTheOrderScreen() throws InterruptedException {
        new PaymentWindow(driver).deleteTheMenuItemIntheOrderScreen();
    }

    @When ("^I verify value with order summary screen$")
    public void iVerifyValueWithOrderSummaryScreen(){
        new PaymentWindow(driver).verifyValueWithOrderSummaryScreen();
    }

    @When ("^I verify the Total value with digital printer screen$")
    public void iVerifyTheTotalValueWithDigitalPrinterScreen(){
        new PaymentWindow(driver).verifyTheTotalValueWithDigitalPrinterScreen();
    }

    @And ("^I verify the cash price value with digital receipt screen$")
    public void iVerifyTheCashPriceValueWithDigitalReceiptScreen(){
        new PaymentWindow(driver).verifyTheCashPriceValueWithDigitalReceiptScreen();
    }

    @And ("^I verify the fast cash price value with digital receipt screen$")
    public void iVerifyTheFastCashPriceValueWithDigitalReceiptScreen(){
        new PaymentWindow(driver).verifyTheCashPrice1ValueWithDigitalReceiptScreen();
    }
    @When ("^I verify the Total value with digital printer screen1$")
    public void iVerifyTheTotalValueWithDigitalPrinterScreen1(){
        new PaymentWindow(driver).verifyTheTotalValueWithDigitalPrinterScreen1();
    }

    @When ("^I verify the Total value with digital printer screen2$")
    public void iVerifyTheTotalValueWithDigitalPrinterScreen2(){
        new PaymentWindow(driver).verifyTheTotalValueWithDigitalPrinterScreen2();

    }

    @When ("^I verify the Total value with digital printer screen for Cash Reward$")
    public void iVerifyTheTotalValueWithDigitalPrinterScreenForCashReward(){
        new PaymentWindow(driver).verifyTheTotalValueWithDigitalPrinterScreenForCashReward();

    }
    @When ("^I verify the Total value with digital printer screen3$")
    public void iVerifyTheTotalValueWithDigitalPrinterScreen3(){
        new PaymentWindow(driver).verifyTheTotalValueWithDigitalPrinterScreen3();

    }

    @When ("^I verify value with order summary screen1$")
    public void iVerifyValueWithOrderSummaryScreen1(){
        new PaymentWindow(driver).verifyValueWithOrderSummaryScreen1();
    }

    @And ("^I get the cash reward value from the order screen$")
    public void iGetTheCashRewardValueFromTheOrderScreen(){
        new OrderManagementScreen(driver).getTheCashRewardValueFromOrderScreen();
    }

    @When ("^I verify the Change due value with Cash reward value is Same$")
    public void iVerifyTheChangeDueValueWithCashRewardValueIsSame(){
        new OrderManagementScreen(driver).verifyCashRewardWithChangeDueValue();
    }

    @When ("^I verify the Change due value with Cash Price value is Same$")
    public void iVerifyTheChangeDueValueWithCashPriceValueIsSame(){
        new OrderManagementScreen(driver).verifyCashPriceWithChangeDueValue();
    }

    @When ("^I verify the paid amount is same with the total amount in payment window$")
    public void iVerifyThePaidAmountIsSameWithTheTotalAmountInPaymentWindow(){
        new PaymentWindow(driver).verifyThePaidAmountWithTotalAmount();
    }

    @And ("^I get the paid amount value in the payment window$")
    public void iGetThePaidAmountValueInThePaymentWindow(){
        new PaymentWindow(driver).getThePaidAmountValueInThePaymentWindow();
    }
}
