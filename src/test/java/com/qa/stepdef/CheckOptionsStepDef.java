package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

//import javax.management.remote.rmi._RMIConnection_Stub;


public class CheckOptionsStepDef {

    public WebDriver driver = TestUtils.driver;

    /****** On Hold Check Down ******/
    @And("^I select Appetizers as category$")
    public void iSelectAppetizersAsCategory() throws Exception {
        new OrderManagementScreen(driver).selectAppetizersCategory();
    }

    @When("^I click Options button$")
    public void iClickOptionsButton() {
        new OrderManagementScreen(driver).pressOptions();
    }

    @Then("^I should see the Check Options screen$")
    public void iShouldSeeTheCheckOptionsScreen() {
        Assert.assertEquals(new CheckOptionsScreen(driver).getCheckOptionsTitle(), "Check Options");
    }

    @When ("^I click Gift card Button$")
    public void iClickGiftCardButton(){
        new CheckOptionsScreen(driver).clickGiftCardBtn();
    }

    @Then ("^I should see Gift card window$")
    public void iShouldSeeGiftCardWindow(){
        Assert.assertEquals(new CheckOptionsScreen(driver).verifyGiftCardWindow(),"Gift Card");
    }

    @And ("^I click GiveX option$")
    public void iClickGivexOption(){
        new CheckOptionsScreen(driver).clickGiveXBtn();
    }

    @Then ("^I should see givex screen$")
    public void iShouldSeeGivexScreen(){
        new CheckOptionsScreen(driver).shouldSeeGiveXScreen();
    }
    @And ("^I enter gift card number")
    public void iEnterGiftCardNumberAs() throws InterruptedException {
        new CheckOptionsScreen(driver).enterGiftCardNumber();
    }

    @And ("^I click charge amount field and pass the amount$")
    public void iClickChargeAmountFieldAndPassTheAmount() throws InterruptedException {
        new CheckOptionsScreen(driver).clickChargeAmountFieldPassAmount();
    }

    @And ("^I click charge amount field in Gift card window$")
    public void iClickChargeAmountFieldInGiftCardWindow(){
        new CheckOptionsScreen(driver).clickChargeAmountField();
    }

    @Then ("^I should see gift card amount add up into order screen$")
    public void iShouldSeeGiftCardAmountAddUpInToOrderScreen(){
        Assert.assertEquals(new CheckOptionsScreen(driver).verifyGiftCardAddup(),"GC-1111 ");
    }

    @And ("^I click discount on check option screen$")
    public void iClickDiscountOnCheckOptionScreen(){
        new CheckOptionsScreen(driver).selectDiscountOnCheckOption();
    }

    @And ("^I click item discount from the check options$")
    public void iClickItemDiscountFromTheCheckOptions(){
        new CheckOptionsScreen(driver).selectItemDiscount();
    }

    @And ("^I click check discount from the check options$")
    public void iClickCheckDiscountFromTheCheckOptions(){
        new CheckOptionsScreen(driver).selectCheckDiscount();
    }

    @And ("^I click open check discount button from the check options$")
    public void iClickOpenCheckDiscountButtonFromTheCheckOptions(){
        new CheckOptionsScreen(driver).selectOpenCheckDiscountBtn();
    }

    @And ("^I select tax as \"([^\"]*)\"$")
    public void iSelectTaxAs(String taxes){
        new CheckOptionsScreen(driver).selectTax(taxes);
    }

    @Then ("^I should see discount as \"([^\"]*)\" applied on order screen$")
    public void iShouldSeeDiscountAsAppliedOnOrderScreen(String discount){
        new CheckOptionsScreen(driver).selectDiscountAs(discount);
    }
    @Then ("^I should see item discount$")
    public void iShouldSeeItemDiscount(){
        Assert.assertEquals(new CheckOptionsScreen(driver).verifyOpenItemScreen(),"Item Discount");
    }
    @Then ("^I should see Check discount$")
    public void iShouldSeeCheckDiscount(){
        Assert.assertEquals(new CheckOptionsScreen(driver).verifyCheckDiscount(),"Check Discount");
    }
    @Then ("^I should see open check discount$")
    public void iShouldSeeOpenCheckDiscount(){
        Assert.assertEquals(new CheckOptionsScreen(driver).verifyOpenCheckDiscount(),"Open Check Discount");
    }
    @And ("^I select open check discount$")
    public void iSelectOpenCheckDiscount(){
        new CheckOptionsScreen(driver).selectOpenCheckDiscountBtn();
    }
    @And ("^I pass the amount on open discount for open check discount safety percentage whole value as 20 for \"([^\"]*)\"$")
    public void iPassTheAmountOnOpenDiscountForOpenCheckDiscountSafetyPercentageWholeValueAs20For(String discount){
        new CheckOptionsScreen(driver).passTheAmountForOpenCheckDiscountSafetyPercentageWholeValue(discount);
    }

    @And ("^I pass the amount as \"([^\"]*)\" on open discount as \"([^\"]*)\"$")
    public void iPassTheAmountAsOnOpenDiscountAs(String value, String percentage){
        new CheckOptionsScreen(driver).passTheAmountForOpenCheckDiscountAsAmountttt(value,percentage);
    }
    @And ("^I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for \"([^\"]*)\"$")
    public void iPassTheAmountOnOpenDiscountForOpenCheckDiscountSafetyLimitPercentageDecimalPrecisionAsFor(String name){
        new CheckOptionsScreen(driver).passTheAmountForOpenCheckDiscountSafetyPercentageDecimalPrecision(name);
    }
    @And ("^I pass the amount on open discount for open check discount percentage as 20 for \"([^\"]*)\"$")
    public void iPassTheAmountOnOpenDiscountForOpenCheckDiscountPercentageAsFor(String tax){
        new CheckOptionsScreen(driver).passTheAmountForOpenCheckDiscountAsPercentage(tax);
    }

    @Then ("^I should see orderscreen with open check discount$")
    public void iShouldSeeOrderScreenWithOpenCheckDiscount(){
        Assert.assertEquals(new CheckOptionsScreen(driver).verifyOpenDiscountAppliedOnOrderScreen(),"Open Check Discount");
    }

    @And("^I click Hold to put order on hold$")
    public void iClickHoldToPutOrderOnHold() {
        new CheckOptionsScreen(driver).selectHold();
    }

    @And("^I click Done in the hold window$")
    public void iClickDoneInTheHoldWindow() {
        new CheckOptionsScreen(driver).pressDoneHold();
    }

    @When("^I click Back to return to Order Management Screen$")
    public void iClickBackToReturnToOrderManagementScreen() {
        new CheckOptionsScreen(driver).pressBack();
    }

    @Then("^I should see the hold icon over the order section$")
    public void iShouldSeeTheHoldIconOverTheOrderSection() {
        new OrderManagementScreen(driver).assertHold();
    }

    @Then ("^I should see hold item need to send to kitchen popup$")
    public void iShouldSeeHoldItemNeedToSendToKitchenPopup(){
        Assert.assertEquals(new PaymentWindow(driver).getHoldItemHasToSentToKitchen(),"Hold item(s) has to be sent to kitchen");
    }
    @When("^I click Finish button$")
    public void iClickFinishButton() {
        new OrderManagementScreen(driver).pressFinish();
    }

    @Then("^I should navigate to the table layout screen and see that the table is on hold$")
    public void iShouldNavigateToTheTableLayoutScreenAndSeeThatTheTableIsOnHold() {
        new TableLayOutScreen(driver).assertTableOperation();
    }

    @And ("^I click open check button$")
    public void iClickOpenCheckButton(){
        new TableLayOutScreen(driver).pressOpenCheck();
    }

    @And ("^I click reprint Check button$")
    public void iClickReprintCheckButton(){
        new TableLayOutScreen(driver).pressReprintCheck();
    }

    @When("^I select \"([^\"]*)\" to pay check$")
    public void iSelectToPayCheck(String tableNo) {
        new TableLayOutScreen(driver).selectTable(tableNo);
    }

    @Then("^I should see the Payment window$")
    public void iShouldSeeThePaymentWindow() {
        Assert.assertEquals(new PaymentWindow(driver).getPaymentWindowTitle(), "PAYMENTS");
    }

    @And ("^I click loyalty payment$")
    public void iClickLoyaltyPayment(){
        new PaymentWindow(driver).clickLoyalty();
    }

    @Then ("^I should see loyalty balance after click loyalty payment in payment window$")
    public void iShouldSeeLoyaltyBalanceAfterClickLoyaltyPaymentInPaymentWindow() throws InterruptedException {
        new PaymentWindow(driver).verifyLoyaltyBalanceInPaymentWindow();
    }
    @And ("^I verify fixed gratuity is applied$")
    public void iVerifyFixedGratuityIsApplied(){
        new CheckOptionsScreen(driver).verifyFixedGratuityAmount();
    }
    @When ("^I verify auto gratuity is applied or not$")
    public void iVerifyAutoGratuityIsAppliedOrNot(){
        new CheckOptionsScreen(driver).verifyAutoGratuityAppliedOrNot();
    }

    @When ("^I verify auto gratuity is applied$")
    public void iVerifyAutoGratuityIsApplied(){
        new CheckOptionsScreen(driver).verifyAutoGratuityApplied();
    }

    @And ("^I click auto Gratuity varying button$")
    public void iClickAutoGratuityVaryingButton(){
        new CheckOptionsScreen(driver).pressAutoGratuityVaryingBtn();
    }

    @And ("^I click auto Gratuity Fixed button$")
    public void iClickAutoGratuityFixedButton(){
        new CheckOptionsScreen(driver).pressAutoGratuityFixedBtn();
    }

    @And ("^I select auto gratuity as \"([^\"]*)\"$")
    public void iSelectAutoGratuityAs(String gratuity){
        new CheckOptionsScreen(driver).selectAutoGratuityAs(gratuity);
    }

    @And ("^I click Gift card payment in payment window$")
    public void iClickGiftCardPaymentInPaymentWindow() throws Exception {
        new PaymentWindow(driver).TappedGiftCardPayment();
    }
    @Then ("^I should see payment as \"([^\"]*)\" is applied in payment window$")
    public void iShouldSeePaymentAsIsAppliedInPaymentWindow(String money){
        new PaymentWindow(driver).verifyAppliedCash(money);
    }
    @And("^I select Cash as payment method$")
    public void iSelectCashAsPaymentMethod() {
        new PaymentWindow(driver).selectCashPayment();
    }

    @Then("^I should see the send to kitchen warning popup$")
    public void iShouldSeeTheResendToKitchenWarningPopup() {
        Assert.assertEquals(new PaymentWindow(driver).getSendToKitchenPopUpTxt(),"Do you want to send hold menu item(s) to kitchen?");
    }

    @And("^I click No button on send to kitchen popup$")
    public void iClickNoButtonOnSendToKitchenPopup() {
        new PaymentWindow(driver).pressNoSendToKitchen();
    }

    @When("^I click Yes button on send to kitchen popup$")
    public void iYesButtonOnSendToKitchenPopup() {
        new PaymentWindow(driver).pressYesSendToKitchen();
    }


    @And("^I click Exit to return to Order Management Screen$")
    public void iClickExitToReturnToOrderManagementScreen() {
        new PaymentWindow(driver).pressExit();
    }

    @And("^I click Print$")
    public void iClickPrint() {
        new OrderManagementScreen(driver).pressPrintBtn();
    }

    @And("^I click Done on Receipt Printer popup$")
    public void iClickDoneOnReceiptPrinterPopup() {
        new OrderManagementScreen(driver).pressDoneReceiptPrinter();
    }

    @Then("^I should return back to the Table Layout window and see that the table is in check Down status$")
    public void iShouldReturnBackToTheTableLayoutWindowAndSeeThatTheTableIsInCheckDownStatus() {
        new TableLayOutScreen(driver).assertTableOperation();
    }

    @And("^I void and close the check for the table \"([^\"]*)\"$")
    public void iVoidAndCloseTheCheckForTheTable(String tableNo) {
        new TableLayOutScreen(driver).selectTable(tableNo);
        new OrderManagementScreen(driver).pressVoidBtn();
        new OrderManagementScreen(driver).pressDone();
        new PaymentWindow(driver).selectPayment();
        new PaymentWindow(driver).pressDeletePaymentBtn();
        new PaymentWindow(driver).pressOkToClosePrinterWarningPopUp();
        new PaymentWindow(driver).pressExit();
        new OrderManagementScreen(driver).pressVoidBtn();
        new OrderManagementScreen(driver).selectOrderedWrongly();
        new OrderManagementScreen(driver).pressAddVoidReasonBtn();
    }

    @And("^I click Print on the table layout screen$")
    public void iClickPrintOnTheTableLayoutScreen() {
        new TableLayOutScreen(driver).pressPrintBtn();
    }

    /****** Tax Exempt ******/

    @And("^I select Salad as category$")
    public void iSelectSaladAsCategory() {
        new OrderManagementScreen(driver).selectSaladCategory();
    }

    @And("^I should see the tax reflected to the check$")
    public void iShouldSeeTheTaxReflectedToTheCheck() {
        new OrderManagementScreen(driver).checkTaxExists();
    }

    @When("^I click Tax Exempt Button$")
    public void iClickTaxExemptButton() {
        new CheckOptionsScreen(driver).pressTaxExempt();
    }

    @And ("^I click Tax Exempt Button from the Payment Screen$")
    public void iClickTaxExemptButtonFromThePaymentScreen(){
        new PaymentWindow(driver).pressTaxExemptFromPaymentScreen();
    }

    @And ("^I click add gratuity from Payment screen$")
    public void iClickAddGratuityFromPaymentScreen(){
        new PaymentWindow(driver).addGratuityPaymentWindow();
    }

    @Then("^I should see tax exempt reasons$")
    public void iShouldSeeTaxExemptReasons() {
        Assert.assertEquals(new CheckOptionsScreen(driver).getTaxExemptTitle(), "Tax Exempt");
    }

    @When("^I select School as reason$")
    public void iSelectSchoolAsReason() {
        new CheckOptionsScreen(driver).selectSchoolAsTaxExemptReason();
    }

    @Then("^I should return back to the order management screen and I should not see the tax amount$")
    public void iShouldReturnBackToTheOrderManagementScreenAndIShouldNotSeeTheTaxAmount() {
        new CheckOptionsScreen(driver).checkTaxExists();
    }

    @And("^I click Back button on Tax Exempt window$")
    public void iClickBackButtonOnTaxExemptWindow() {
        new CheckOptionsScreen(driver).pressBackOnTaxExempt();
    }

    @Then("^I should see Tax Exempt removed successfully popup$")
    public void iShouldSeeTaxExemptRemovedSuccessfullyPopup() {
        Assert.assertEquals(new CheckOptionsScreen(driver).getTaxExemptRemovedTxt(), "Tax Exempt Removed Successfully");
    }

    /********** Credit card payment ***********/

    @And("^I click Payment button in the Order Management Screen$")
    public void iClickPaymentButtonInTheOrderManagementScreen() {
        new OrderManagementScreen(driver).pressPayment();
    }

    @Then ("^I verify the paid amount with partial paid amount on the payment screen$")
    public void iVerifyThePaidAmountWithPartialPaidAmountOnThePaymentScreen(){
        new PaymentWindow(driver).verifyThePaidAmountPartialPaidAmountOnthePaymentScreen();
    }

    @And ("^I verify the no due as zero on the payment screen$")
    public void iVerifyTheNoDueAsZeroOnThePaymentScreen(){
        new PaymentWindow(driver).verifyTheNoDueAsZeroOnThePayment();
    }

    @And ("^I click paid amount on the payment screen$")
    public void iClickPaidAmountOnThePaymentScreen(){
        new PaymentWindow(driver).clickPaidAmountOnThePaymentScreen();
    }

    @When ("^I verify the total value with balance due value in the payment window$")
    public void iVerifyTheTotalValueWithBalanceDueInThPaymentWindow(){
        new PaymentWindow(driver).verifyTheTotalValueWithBalanceDueValueInPaymentScreen();
    }

    @And ("^I click NMI payment button in the payment window$")
    public void iClickNMIPaymentButtonInThePaymentWindow() throws Exception {
        new PaymentWindow(driver).clickNmiPayment();
    }

    @Then ("^I should see No NMI sim cards available for walkin$")
    public void iShouldSeeNoNmiSimCardsAvailableForWalkin(){
        Assert.assertEquals(new PaymentWindow(driver).verifyNoNMIPopup(),"No NMI Save Card(s) Available For Walkin");
    }

    @And ("^I click house payment from the payment method popup$")
    public void iClickHousePaymentFromThePaymentMethodPopup() throws Exception {
        new PaymentWindow(driver).clickHousePaymentBtn();
    }

    @And ("^I click credit card payment on payment window$")
    public void iClickCreditCardPaymentOnPaymentWindow() throws Exception {
        new PaymentWindow(driver).clickCreditCardBtn();
    }

    @Then ("^I should see card type window$")
    public void iShouldSeeCardTypeWindow(){
        Assert.assertEquals(new PaymentWindow(driver).verifyCardTypeScreen(),"Card Type");
    }

    @When("^I should not see card type screen$")
    public void iShouldNotSeeCardTypeScreen(){
        new PaymentWindow(driver).iShouldNotSeeCardTypeScreen();
    }
    @And ("^I click visa card type as \"([^\"]*)\"$")
    public void iClickVisaCardTypeAs(String card){
        new PaymentWindow(driver).clickCardType(card);
    }
    @And ("^I click ok button in card type window$")
    public void iClickOkButtonInCardTypeWindow(){
        new PaymentWindow(driver).clickOkButton();
    }

    @Then ("^I should see total screen$")
    public void iShouldSeeTotalScreen(){
        new PaymentWindow(driver).verifyTotalScreen();
    }
    @And ("^I click the Continue button on the Total screen$")
    public void iClickTheContinueButtonOnTheTotalScreen(){
        new PaymentWindow(driver).clickContinueBtn();
    }
    @Then ("^I should see choose card window$")
    public void iShouldSeeChooseCardWindow(){
        Assert.assertEquals(new PaymentWindow(driver).verifyChooseCard(),"Choose Card");
    }
    @And ("^I select credit card from choose card window$")
    public void iSelectCreditCardFromChooseCardWindow(){
        new PaymentWindow(driver).selectCardInWindow1();
    }

    @And ("^I click pay button in choose card window$")
    public void iClickPayButtonInChooseCardWindow(){
        new PaymentWindow(driver).clickPayBtn();
    }
    @Then ("^I should see your order card screen$")
    public void iShouldSeeYourOrderCardScreen(){
        Assert.assertEquals(new PaymentWindow(driver).verifyYourOrder(),"Your Order");
    }

    @And ("^I click manual button on the your order screen$")
    public void iClickManualButtonOnTheYourOrderScreen(){
        new PaymentWindow(driver).clickManualButton();
    }

    @And ("^I pass the card number as \"([^\"]*)\"$")
    public void iPassTheCardNumberAs(String num){
        new PaymentWindow(driver).passCardNumber(num);
    }
    @And ("^I pass the Amex card number as \"([^\"]*)\"$")
    public void iPassTheAmexCardNumberAs(String num){
        new PaymentWindow(driver).passCardNumber1(num);
    }

    @And ("^I pass the Gift card number as \"([^\"]*)\"$")
    public void iPassTheGiftCardNumberAs(String num){
        new PaymentWindow(driver).passGiftCardNumber(num);
    }

    @And ("^I pass card name as \"([^\"]*)\"$")
    public void iPassCardNameAs(String name){
        new PaymentWindow(driver).passCardName(name);
    }

    @And ("^I pass expire date as \"([^\"]*)\"$")
    public void iPassExpireDateAs(String num){
        new PaymentWindow(driver).passExpireNumber(num);
    }

    @Then ("^I should see signature pad screen$")
    public void iShouldSeeSignaturePadScreen() {
        Assert.assertEquals(new PaymentWindow(driver).verifySignaturePad(),"Signature Pad");
    }

    @And ("^I click tick mark button$")
    public void iClickTickMarkButton(){
        new PaymentWindow(driver).clickTickIcon();
    }

    @And ("^I click Process button on card screen$")
    public void iClickProcessButtonOnCardScreen() throws InterruptedException {
        new PaymentWindow(driver).clickProcessButton();
    }

    @Then("^I should see Paid amount exceeds the sale amount popup$")
    public void iShouldSeePaidAmountExceedsTheSaleAmountPopup() {
        new CheckOptionsScreen(driver).verifyPaidAmountExceeds();
        Assert.assertEquals(new CheckOptionsScreen(driver).getPaidAmountExceedsTxt(), "Paid amount exceeds the sale amount");
    }

    @And("^I click Done button on the popup in check options page$")
    public void iClickDoneButtonOnThePopupInCheckOptionsPage() {
        new CheckOptionsScreen(driver).pressPaidAmountExceedsPopupDoneBtn();
    }

    @And("^I click Back button on Check Options Screen$")
    public void iClickBackButtonOnCheckOptionsScreen() {
        new CheckOptionsScreen(driver).pressBack();
    }

    @Then ("^I should see tip added on order screen")
    public void iShouldSeeTipAddedOnOrderScreen(){
        new PaymentWindow(driver).shouldSeeTipAddedOnOrderScreen();
    }

    @Then ("^I should see service charge as \"([^\"]*)\"$")
    public void iShouldSeeServiceChargeAs(String num){
        new PaymentWindow(driver).verifyServiceCharge(num);
    }


    @And ("^I click tip as 10$")
    public void iClickTipAs10(){
        new PaymentWindow(driver).clickTipAs10();
    }



    @Then ("^I should see tip is added with menu total as \"([^\"]*)\"$")
    public void iShouldSeeTipIsAddedWithMenuTotalAs(String tip){
        new PaymentWindow(driver).verifyTipAdded(tip);
    }

    @Then ("^I should see total amount as \"([^\"]*)\" on total screen$")
    public void iShouldSeeTotalAmountAsOnTotalScreen(String number){
        new PaymentWindow(driver).verifyTotalValue(number);
    }

    @And ("^I click custom for tip adjustment$")
    public void iClickCustomForTipAdjustment(){
        new PaymentWindow(driver).selectCustomTipAdjust();
    }


    //tax exempt reopen check scenario
    @And("^I select the payment$")
    public void iSelectThePayment() {
        new PaymentWindow(driver).selectPayment();
    }

    @And("I click Submit button on the Payment Window")
    public void iClickSubmitButtonOnThePaymentWindow() {
        new PaymentWindow(driver).pressSubmitBtn();
    }

    @And("^I select Closed checks tab$")
    public void iSelectClosedChecksTab() {
        new OrdersAndDriversListScreen().selectClosedChecksList();
    }

    @And("^I click reopen$")
    public void iClickReopen() {
        new OrdersAndDriversListScreen().pressReopenCheckBtn();
    }

    //Can't Hold on this time
    @Then("^I should see warning popup Can't Hold on this time$")
    public void iShouldSeeWarningPopupCanTHoldOnThisTime() {
        Assert.assertEquals(new CheckOptionsScreen(driver).getCantHoldOnThisTimeTxt(), "Can't Hold on this time");
    }

    @When("^I click resend to kitchen$")
    public void iClickResendToKitchen() {
        new CheckOptionsScreen(driver).pressResendToKitchen();
    }

    @Then("^Print should be generated to Kitchen Printer again with a title Resending to Kitchen$")
    public void printShouldBeGeneratedToKitchenPrinterAgainWithATitle() {
    }

    @And("^I select FOOD as category$")
    public void iSelectFOODAsCategory() throws InterruptedException {
        new OrderManagementScreen(driver).selectFoodCategory();
    }

    @And ("^I get check number$")
    public void iGetCheckNumber() throws InterruptedException {
        new OrderManagementScreen(driver).getCheckNumberTxt();
    }



    //Add Open Item Scenario
    @And("^I click Open Item button$")
    public void iClickOpenItemButton() {
        new CheckOptionsScreen(driver).pressOpenItem();
    }

    @And("^I click Coursing Name text field$")
    public void iClickCoursingNameTextField() {
        new OpenItemWindow(driver).selectCoursingNameTextFld();
    }

    @And ("^I click Coursing Name text field for Menu option$")
    public void iClickCoursingNameTextFieldForMenuOption(){
        new OpenItemWindow(driver).pressOpenItemTextFieldMenuOption();
    }

    @And("^I swipe to \"([^\"]*)\" as Coursing Name$")
    public void iSwipeToAsCoursingName(String name) throws InterruptedException {
        new OpenItemWindow(driver).swipeToCourseName_ChangeCoursing(name);
    }

    @And("^I enter course name as \"([^\"]*)\"$")
    public void iEnterCourseNameAs(String menu) throws InterruptedException {
        new OpenItemWindow(driver).setItemName(menu);
    }

    @And ("^I pass course name as \"([^\"]*)\"$")
    public void iPassCourseNameAs(String menu){
        new OpenItemWindow(driver).setOpenItemNameMenuOption(menu);
    }

    @And("^I enter course name as \"([^\"]*)\" for check based open item$")
    public void iEnterCourseNameAsForCheckBasedOpenItem(String menu) throws InterruptedException {
        new OpenItemWindow(driver).setItemName(menu);
    }

    @And("^I tap Price text field$")
    public void iTapPriceTextField() {
        new OpenItemWindow(driver).selectPriceFld();
    }

    @And("^I tap Price text field for menu option$")
    public void iTapPriceTextFieldForMenuOption() {
        new OpenItemWindow(driver).selectPriceFldMenuOption();
    }

    @And("^I enter the price$")
    public void iEnterThePrice() {
        new OpenItemWindow(driver).press1ForCheckOpenItem();
        new OpenItemWindow(driver).press00();
        new OpenItemWindow(driver).press00();
    }

    @And("^I enter the price with sale$")
    public void iEnterThePriceWithSale() {
        new OpenItemWindow(driver).press1();
        new OpenItemWindow(driver).press00();
        new OpenItemWindow(driver).press00();
    }

    @And ("^I get the open item value from open item window$")
    public void iGetTheOpenItemValueFromOpenItemWindow(){
        new OpenItemWindow(driver).getValueFromOpenItemScreen();
    }
    @And ("^I enter price for check based open item")
    public void iEnterPriceForCheckBasedOpenItem(){
        new OpenItemWindow(driver).press1ForCheckOpenItem();
        new OpenItemWindow(driver).press00();
        new OpenItemWindow(driver).press00();
    }

    @And("^I enter the price for Check based tax on Tirmasu$")
    public void iEnterThePriceForCheckBasedTaxOnTirmasu() {
        new OpenItemWindow(driver).pressPin9();
        new OpenItemWindow(driver).press0();
        new OpenItemWindow(driver).press00();
    }
    @And ("^I click 10 percentage Tax for open item$")
    public void iClick10PercentageTaxForOpenItem() throws InterruptedException {
        new CheckOptionsScreen(driver).press10percentage();
    }

    @And("^I select the Tax$")
    public void iSelectTheTax() {
        new OpenItemWindow(driver).selectTax();
    }

    @And("^I click Continue button on the Open Item Price numbers popup$")
    public void iClickContinueButtonOnTheOpenItemPriceNumbersPopup() {
        new OpenItemWindow(driver).pressContinueAddingOpenItem();
    }

    @And("^I click Done button on the open item window$")
    public void iClickDoneButtonOnTheOpenItemWindow() {
        new OpenItemWindow(driver).pressDoneOpenItemBtn();
    }

    @Then("^I should navigate to Order Management screen and see the added open item as \"([^\"]*)\"$")
    public void iShouldNavigateToOrderManagementScreenAndSeeTheAddedOpenItemAs(String open) {
        new OpenItemWindow(driver).verifyOpenItem(open);
    }

    @Then ("^I verify the open item value from open item window with order screen$")
    public void iVerifyTheOpenItemValueFromOpenItemWindowWithOrderScreen(){
        new OpenItemWindow(driver).verifyOpenItemPriceWithOrderScreenPrice();
    }

    /****** Check Options - Modify ******/

    @And("^I click Modify$")
    public void iClickModify() {
        new CheckOptionsScreen(driver).pressModify();
    }

    @And("^I select ordered item as \"([^\"]*)\"$")
    public void iSelectOrderedItemAs(String orderedItem) throws Exception {
        new CheckOptionsScreen(driver).selectMenuItem(orderedItem);
    }

    @When("^I click Done button to finish modifying$")
    public void iClickDoneButtonToFinishModifying() {
        new CheckOptionsScreen(driver).pressDone();
    }

    /*********** Gratuity ****************/
    @And ("^I click Gratuity button$")
    public void iClickGratuityButton(){
        new CheckOptionsScreen(driver).pressGratuityBtn();
    }
    @Then ("^I should see Add Gratuity screen$")
    public void iShoudlSeeAddGratuityScreen(){
        new CheckOptionsScreen(driver).verifyAddGratuityScreen();
    }
    @And ("^I click Gratuity Fixed button$")
    public void iClickGratuityFixedButton(){
        new CheckOptionsScreen(driver).pressGratuityFixedBtn();
    }
    @And ("^I click Gratuity varying button$")
    public void iClickGratuityVaryingButton(){
        new CheckOptionsScreen(driver).pressGratuityVaryingBtn();
    }
    @Then ("^I should return back to the order management screen and I should Gratuity is added$")
    public void iShouldReturnBackToTheOrderManagementScreenAndIShouldGratuityIsAdded(){
        new CheckOptionsScreen(driver).checkGratuityExists();
    }
    @Then ("^I should see enter Percentage popup$")
    public void iShouldSeeEnterPercentagePopup(){
        new CheckOptionsScreen(driver).verifyEnterPercentage();
    }


    @And ("^I pass the value and click Apply button as \"([^\"]*)\"$")
    public void iPassTheValueAndClickApplyButton(String percent){
        new CheckOptionsScreen(driver).passPercentage(percent);
    }

    @And ("^I pass the value and click Apply button$")
    public void iPassTheValueAndClickApplyButton(){
        new CheckOptionsScreen(driver).passPercentageEngin1();
    }

    @And ("^I pass the value as \"([^\"]*)\" and click Apply button$")
    public void iPassTheValueAsAndClickApplyButton(String value){
        new CheckOptionsScreen(driver).passPercentageEngin2(value);
    }

    @Then ("^I should see enter value according to BO$")
    public void iShouldSeeEnterValueAccordingToBO(){
        Assert.assertEquals(new CheckOptionsScreen(driver).enterValueAccordingBo(),"Enter Value from 5.0 - 15.0");
    }

    @And ("^I click Automatic button on Hold popup$")
    public void iClickAutomaticButtonOnHoldPopup(){
        new CheckOptionsScreen(driver).pressAutomaticBtn();
        new CheckOptionsScreen(driver).setTimeForAutomaticHold();
    }
    @Then ("^I should see hold Icon change to Tick Icon$")
    public void iShouldSeeHoldIconChangeToTickIcon() throws InterruptedException {
        Thread.sleep(53000);

        new OrderManagementScreen(driver).pressPayment();
        Thread.sleep(18000);
        new PaymentWindow(driver).pressExit();
        Thread.sleep(10000);
        new OrderManagementScreen(driver).pressPayment();
        new PaymentWindow(driver).pressExit();
        new OrderManagementScreen(driver).verifyTickIcon();
    }

    @And ("^I click open cash drawer Button$")
    public void iClickOpenCashDrawerButton(){
        new CheckOptionsScreen(driver).pressOpenCashDrawer();
    }
    @And ("^I select fire coursing Button$")
    public void iSelectFireCoursingButton(){
        new CheckOptionsScreen(driver).pressFireCoursing();
    }
    @Then ("^I should see fire coursing$")
    public void iShouldSeeFireCoursing(){
        Assert.assertEquals(new CheckOptionsScreen(driver).verifyFireCoursing(),"Fire Coursing");
    }
    @And ("^I click Coursing Name as \"([^\"]*)\"")
    public void iClickCoursingNameAsEntree(String courseName){
        new CheckOptionsScreen(driver).pressCoursing(courseName);
    }

    @And ("^I click Back button on the Fire Coursing screen$")
    public void iClickBackButtonOnTheFireCoursingScreen(){
        new CheckOptionsScreen(driver).pressBackForFireCoursing();
    }

    @Then ("^I should see you cannot delete this discount popup$")
    public void iShouldSeeYouCannotDeleteThisDiscountPopup(){
        Assert.assertEquals(new OrderManagementScreen(driver).verifyYouCannotDeletePopup(),"You cannot delete this Discount");
    }

    //today i done
    @And ("^I get check number1$")
    public void iGetCheckNumber1(){
        new OrderManagementScreen(driver).getCheckNumberTxt1();
    }

    @And ("^I select the card from card type$")
    public void iSelectTheCardFromCardType(){
        new CheckOptionsScreen(driver).selectCardFromOrderType();
    }

    @When ("^I verify balance due amount same with amount in total screen$")
    public void iVerifyBalanceDueAmountSameWithAmountInTotalScreen(){
        new cashOption(driver).verifyBalanceDueAmountSameWithAmount();
    }

    @When ("^I verify balance due amount same with amount in tip screen after tip selected$")
    public void iVerifyBalanceDueAmountSameWithAmountInTipScreenAfterTipSelected(){
        new cashOption(driver).verifyTheBalanceDueAmountSameWithTipScreenAmountAfterSelectedTip();
    }

    @When ("^I verify service charge amount in card screen$")
    public void iVerifyServiceChargeAmountInCardScreen(){
        new cashOption(driver).verifyServiceChargeInCardScreen();
    }
    @And ("^I verify varying gratuity is applied$")
    public void iVerifyVaryingGratuityIsApplied(){
        new CheckOptionsScreen(driver).verifyGratuityVarying();
    }

    @And ("^I click mppg auth payment in the payment window$")
    public void iClickMppgAuthPaymentInThePaymentWindow() throws Exception {
        new PaymentWindow(driver).clickMppgPayment();
    }

    @When ("^I verify the added tip is same in Payment screen$")
    public void iVerifyTheAddedTipIsSameInPaymentScreen(){
        new PaymentWindow(driver).verifyAddedTipIsSameWithPaymentScreen();
    }

    @Then ("^I should see gratuity cannot be removed for paid check popup$")
    public void iShouldSeeGratuityCannotBeRemovedForPaidCheckPopup(){
        Assert.assertEquals( new OrderManagementScreen(driver).verifyGratuityCannotBeRemovedForPaidChecksPopup(),"Gratuity cannot be removed for paid check");
    }

    @And ("^I get tip value from Tip screen$")
    public void iGetTipValueFromTipScreen(){
        new PaymentWindow(driver).tipAddedInTipScreen();
    }

    @Then ("^I verify Item discount is applied or not in order screen$")
    public void iVerifyItemDiscountIsAppliedOrNotInOrderScreen(){
        new CheckOptionsScreen(driver).verifyItemDiscountIsAppliedOrNot();
    }

    @Then ("^I verify beginning balance,recurring balance$")
    public void iVerifyBeginningBalanceRecurringBalanceAndChargeAmount() throws InterruptedException {
       new CheckOptionsScreen(driver).verifyBeginningBalanceAndRecurringBalanceAndChargeAmount();
    }

    @Then ("^I verify beginning balance,recurring balance for GiveX$")
    public void iVerifyBeginningBalanceRecurringBalanceAndChargeAmountForGiveX() throws InterruptedException {
        new CheckOptionsScreen(driver).verifyBeginningBalanceAndRecurringBalanceAndChargeAmountGiveX();
    }

    @When ("^I enter the charge amount as \"([^\"]*)\" on the Gift card window$")
    public void iEnterTheChargeAmountAsOnTheGiftCardWindow(String value){
        new CheckOptionsScreen(driver).enterTheChargeAmountOnTheGiftCardWindow(value);
    }
    @When ("^I click Active account button in the gift card window$")
    public void iClickActiveAccountButtonInTheGiftCardWindow(){
        new CheckOptionsScreen(driver).clickActiveAccountBtn();
    }

    @When ("^I click Suspend account button in the gift card window$")
    public void iClickSuspendAccountButtonInTheGiftCardWindow(){
        new CheckOptionsScreen(driver).clickSuspendAccountBtn();
    }

    @Then ("^I should see gift card inactivated successfully popup$")
            public void iShouldSeeGiftCardInActivatedSuccessfullyPopup(){
        new CheckOptionsScreen(driver).giftCardInactivatedSuccessfullPopup();
    }

    @Then ("^I should see gift card activated successfully popup$")
    public void iShouldSeeGiftCardActivatedSuccessfullyPopup(){
        new CheckOptionsScreen(driver).giftCardactivatedSuccessfullPopup();
    }
    @And ("^I click Done if its selectable$")
    public void iClickDoneIfItsSelectable(){
        new CheckOptionsScreen(driver).clickDoneIfItsSelectable();
    }

    @And ("^I select Menu For Dine order type as \"([^\"]*)\" for split Check$")
    public void iSelectMenuForDineOrderTypeAsForSplitCheck(String Cate) throws Exception {
        new Regression(driver).selectMenuForDineInForSplitCheck(Cate);
    }

    @And ("^I select Menu For Dine order type as \"([^\"]*)\" for split seat$")
    public void iSelectMenuForDineOrderTypeAsForSplitSeat(String cate) throws Exception {
        new Regression(driver).selectMenuForDineInForSplitSeat(cate);
    }
    @And ("^I select Menu For Bartab order type as \"([^\"]*)\" for split Check$")
    public void iSelectMenuForBartabOrderTypeAsForSplitCheck(String cate) throws Exception {
        new Regression(driver).selectMenuForBarTabForSplitCheck(cate);
    }

    @And ("^I select Menu For Bartab order type as \"([^\"]*)\" for merge Check$")
    public void iSelectMenuForBartabOrderTypeAsForMergeCheck(String cate) throws Exception {
        new Regression(driver).selectMenuForBarTabForSplitCheckMerge(cate);
    }
    @And ("^I select Menu For Bartab order type as \"([^\"]*)\" for split Check1$")
    public void iSelectMenuForBartabOrderTypeAsForSplitCheck1(String cate){
        new Regression(driver).selectMenuForBarTabForSplitCheck1(cate);
    }

    @And ("^I select Menu For Bartab order type as \"([^\"]*)\" for merge Check1$")
    public void iSelectMenuForBartabOrderTypeAsForMergeCheck1(String cate) throws Exception {
        new Regression(driver).selectMenuForBarTabForMergeCheck1(cate);
    }

    @And ("^I select Menu for DineIn as \"([^\"]*)\" for split check order screen$")
    public void iSelectMenuForDineInAsForSplitCheckOrderScreen(String cate) throws Exception {
        new Regression(driver).selectTheMenuFromOrderScreen(cate);
    }

    @And ("^I select Menu for DineIn as \"([^\"]*)\" for split seat order screen$")
    public void iSelectMenuForDineInAsForSplitSeatOrderScreen(String cate) throws InterruptedException {
        new Regression(driver).selectTheMenuFromOrderScreenSplitSeat(cate);
    }
    @And ("^I select Menu for DineIn as \"([^\"]*)\" for split seat order screen for merge$")
    public void iSelectMenuForDineInAsForSplitSeatOrderScreenForMerge(String cate) throws Exception {
        new Regression(driver).selectTheMenuFromOrderScreenSplitSeatForMerge(cate);
    }

    @And ("^I select Menu for DineIn as \"([^\"]*)\" for split seat order screen1$")
    public void iSelectMenuForDineInAsForSplitSeatOrderScreen1(String cate) throws Exception {
        new Regression(driver).selectTheMenuFromOrderScreenSplitSeat1(cate);
    }

    @And("^I select Menu for Bartab as \"([^\"]*)\" for split check order screen$")
    public void iSelectMenuForBarTabAsForSplitCheckOrderScreen(String cate) throws Exception {
        new Regression(driver).selectTheMenuFromOrderScreen(cate);
    }
    @And ("^I select Menu for QSR as \"([^\"]*)\"$")
    public void iSelectMenuForQsrAs(String cate) throws Exception {
        new Regression(driver).selectTheMenuFromOrderScreen(cate);
    }

    @And ("^I get the list of the menu from the order screen$")
    public void iGetTheListOfTheMenuFromTheOrderScreen(){
        new Regression(driver).getTheListOfTheMenuFromTheOrderScreen();
    }

    @And ("^I get the seat number from the check$")
    public void iGetTheSeatNumberFromTheCheck(){
        new Regression(driver).getSeatNumberFromCheck();
    }

    @And ("^I get the seat number from the check1$")
    public void iGetTheSeatNumberFromTheCheck1(){
        new Regression(driver).getSeatNumberFromCheck1();
    }
    @And ("^I get the list of the menu from the order screen1$")
    public void iGetTheListOfTheMenuFromTheOrderScreen1(){
        new Regression(driver).getTheListOfTheMenuFromTheOrderScreen1();
    }

    @When ("^I verify the seat number from the order screen$")
    public void iVerifyTheSeatNumberFromTheOrderScreen(){
        new Regression(driver).verifySeatNumberFromTheOrderScreen();
    }

    @And ("^I verify check number from the order screen$")
    public void iVerifyCheckNumberFromTheOrderScreen(){
        new Regression(driver).verifyCheckNumber();
    }



    @When("^I verify the Calculation pay amount with the card details pay amount$")
    public void iVerifyTheCalculationPayAmountWithTheCardDetailsPayAmount(){
        new Regression(driver). VerifiedPayAmountWithAllDataInTheCardDetailScreen();
    }

    @When("^I verify the Calculation pay amount with the card details pay amount while partial pay$")
    public void iVerifyTheCalculationPayAmountWithTheCardDetailsPayAmountWhilePartialPay(){
        new Regression(driver).verifyPayAmountWithTipAmountOnCardDetailsScreen();
    }
    @When ("^I verify the discount value with card details screen value$")
    public void iVerifyTheDiscountValueWithCardDetailsScreenValue(){
        new Regression(driver).verifyDiscountValueWithCardDetailsScreenValue();
    }

    @When ("^I verify the tip value with card details screen value$")
    public void iVerifyTheTipValueWithCardDetailsScreenValue(){
        new Regression(driver).verifyTipValueWithCardDetailsScreenValue();
    }

    @When ("^I verify the paid amount value is zero$")
    public void iVerifyThePaidAmountValueIsZero(){
        new Regression(driver).verifyPaidAmountValueIsZero();
    }


    @When ("^I verify the tip1 value with card details screen value$")
    public void iVerifyTheTip1ValueWithCardDetailsScreenValue(){
        new Regression(driver).verifyTip1ValueWithCardDetailsScreenValue();
    }

    @When ("^I verify the paid amount value with card details screen value$")
    public void iVerifyThePaidAmountValueWithCardDetailsScreenValue(){
        new Regression(driver).verifyPaidAmountValueWithCardDetailsScreenValue();
    }

    @Then ("^I verify card reader is not connected popup or not$")
    public void iVerifyCardReaderIsNotConnectedPopupOrNot(){
        new Regression(driver).verifyCardReaderIsNotConnectedPopup();
    }

    @When ("^I get the card name on the card details screen$")
    public void iGetTheCardNameOnTheCardDetailsScreen(){
        new Regression(driver).getTheCardNameOnTheCardDetailScreen();
    }

    @When ("^I verify the manual, clear and process emv button is enabled or not$")
    public void iVerifyTheManualClearAndProcessEmvButtonIsEnabledOrNot(){
        new Regression(driver).verifyManualClearProcessButtonIsEnabledOrNot();
    }

    @When ("^I verify subtotal,tax and total value with card details screen value$")
    public void iVerifySubtotalTaxAndTotalValueWithCardDetailsScreenValue(){
        new Regression(driver).verifySubtotalTaxAndTotalValueWithCardDetailsScreenValue();
    }

    @When ("^I verify subtotal,tax and total value with card details screen value while cash reward is enabled$")
    public void iVerifySubtotalTaxAndTotalValueWithCardDetailsScreenValueWhileCashRewardIsEnabled(){
        new Regression(driver).verifySubtotalTaxAndTotalValueWithCardDetailsScreenValue1();
    }

    @And ("^I get the pay amount value from the card details screen value$")
    public void iGetThePayAmountValueFromTheCardDetailsScreenValue(){
        new Regression(driver).getThePayAmountValueOnTheCardDetailsScreen();
    }

    @Then("^I should see tip screen$")
    public void iShouldSeeTipScreen(){
        new  Regression(driver).shouldSeeTipScreen();
    }

    @And("^I select the tip from the tip screen$")
    public void iSelectTheTipFromTheTipScreen() throws InterruptedException {
        new Regression(driver).selectTipFromTheTipScreen();
    }

    @Then ("^I should see the card details entry screen$")
    public void iShouldSeeTheCardDetailsEntryScreen(){
        new Regression(driver).shouldSeeTheCardDetailsEntryScreen();
    }

    @When ("^I check the all check has been batch$")
    public void iCheckTheAllCheckHasBeenBatch() throws Exception {
        new Regression(driver).checkAllTheCheckHasBeenBatch();
    }

    @And ("^I verify the cash price value with paid amount value is same$")
    public void iVerifyTheCashPriceValueWithPaidAmountValueIsSame(){
        new PaymentWindow(driver).verifyTheCashPriceValueWithPaidAmountValueIsSame();
    }

    @Then ("^I should see the do you want to tokenize your card popup$")
    public void iShouldSeeTheDoYouWantToTokenizeYourCardPopup() throws InterruptedException {
        new PaymentWindow(driver).verifyTheDoYouWantToTokenizeYourCardPopup();
    }

    @And("^I click No button on the tokenize popup$")
    public void iClickNoButtonOnTheTokenizePopup(){
        new PaymentWindow(driver).clickNoButtonOnThePopup();
    }
    @And("^I click Yes button on the tokenize popup$")
    public void iClickYesButtonOnTheTokenizePopup(){
        new PaymentWindow(driver).clickYesButtonOnThePopup();
    }

    @And ("^I search the existing customer on the order screen$")
    public void iSearchTheExistingCustomerOnTheOrderScreen() throws InterruptedException {
        new PaymentWindow(driver).searchTheExistingCustomerOnTheOrderScreen();
    }

    @And ("^I search the existing customer as \"([^\"]*)\" on the order screen$")
    public void iSearchTheExistingCustomerASOnTheOrderScreen(String Customer) throws InterruptedException {
        new PaymentWindow(driver).searchExitingCustomer(Customer);
    }

    @And ("^I click the customer name on the order screen$")
    public void iClickTheCustomerNameOnTheOrderScreen() throws InterruptedException {
        new PaymentWindow(driver).clickTheCustomerNameOnTheOrderScreen();
    }

    @And ("^I verify the applied existing customer name and phone number$")
    public void iVerifyTheAppliedExistingCustomerNumberAndPhoneNumber() throws InterruptedException {
        new PaymentWindow(driver).verifyAppliedExistingCustomerNameAndPhoneNumber();
    }

    @And ("^I get the credit card number from the customer$")
    public void iVerifyTheCreditCardNumberFromTheCustomer() throws InterruptedException {
        new PaymentWindow(driver).getCreditCardNumberIsAttachedTheCustomer();
    }

    @And ("^i verify the credit card should not add to the customer when click NO on the tokenized popup$")
    public void iVerifyTheCreditCardShouldNotAddToTheCustomerWhenClickNoOnTheTokenizedPopup(){
        new PaymentWindow(driver).verifyTheCreditCardShouldNotAddToTheCustomer();
    }
    @When("^I verify the encrypted credit card number with new credit card number$")
    public void iVerifyTheEncryptedCreditCardNumberWithNewCreditCardNumber(){
        new PaymentWindow(driver).verifyAddedExistingCreditCardNumberWithCustomerProfileCreditCardNumber();
    }

    @And ("^I click add button of the credit card to the customer$")
    public void iClickAddButtonOfTheCreditCardToTheCustomer(){
        new PaymentWindow(driver).clickAddButtonOfTheCreditCard();
    }

    @Then ("^I should see add card popup$")
    public void iShouldSeeAddCardPopup(){
        new PaymentWindow(driver).shouldSeeAddCardPopup();
    }

    @When("^I have entered the card number as \"([^\"]*)\" and expiry date \"([^\"]*)\" on the add card popup$")
    public void iHaveEnteredTheCardNumber(String number, String date){
        new PaymentWindow(driver).enterCardNumberFieldToTheCustomer(number,date);
    }

    @And ("^I click process token button$")
    public void iClickProcessTokenButton(){
        new PaymentWindow(driver).clickProcessTokenBtn();
    }

    @And ("^I verify the newly added credit card number with customer$")
    public void iVerifyTheNewlyAddedCreditCardNumberWithCustomer(){
        new PaymentWindow(driver).verifyAppliedCreditCardNumberIsAddedToTheCustomer();
    }

    @And("^Enter the new customer randomly1$")
    public void enterTheNewCustomerRandomly1() throws InterruptedException {
        new PaymentWindow(driver).enterTheCustomerNameRandomly1();
    }
    @And("^Enter the new customer randomlys$")
    public void enterTheNewCustomerRandomlys(){
        new PaymentWindow(driver).enterCustomerRandomlys();
    }

    @When ("^I verify the customer details in the customer profile$")
    public void iVerifyTheCustomerDetailsInTheCustomerProfile(){
        new PaymentWindow(driver).verifyCustomerDetails();
    }
    @And ("^I enter the above 150 words on the customer notes$")
    public void iEnterTheAbove150WordsOnTheCustomerNotes(){
         new PaymentWindow(driver).enterTheAbove150WordsOnTheCustomerNotes();
    }

    @And ("^I click the phone number field on the customer profile screen$")
    public void iClickThePhoneNumberFieldOnTheCustomerProfileScreen() throws InterruptedException {
//        new PaymentWindow(driver).ClickThePhoneNumberField();
    }
    @And ("^I get the mobile number from the customer profile screen$")
    public void iGetTheMobileNumberFromTheCustomerProfileScreen(){
        new PaymentWindow(driver).getTheMobileNumberFromTheCustomerProfileScreen();
    }

    @When ("^I select the MPPG Payment on the payment window$")
    public void iSelectTheMppgPaymentOnThePaymentWindow() throws Exception {
        new PaymentWindow(driver).selectMppgPayment();
    }

    @When ("^I verify the service Charge value with sale total$")
    public void iVerifyTheServiceChargeVAlueWithSaleTotal(){
        new PaymentWindow(driver).verifyTheServiceChargeValueWithSaleTotal();
    }

    @When ("^I verify the credit card number on the choose card window should be encrypted$")
        public void iVerifyTheCreditCardNumberOnTheChooseCardWindowShouldBeEncrypted(){
        new PaymentWindow(driver).verifyTheCreditCardNumberOnTheChooseCardWindowShouldBeEncrypted();
    }

    @When ("^I verify the credit card of the check from the batch screen should be encrypted$")
    public void iVerifyThatCreditCardOfTheCheckFromTheBatchScreenShouldBeEncrypted(){
        new PaymentWindow(driver).verifyTheCreditCardOfTheCheckFromTheBatchScreenShouldBeEncrypted();
    }

    @And ("^I enable the apply total in the batch screen$")
    public void iEnableTheApplyTotalInTheBatchScreen(){
        new PaymentWindow(driver).iEnableTheApplyTotalInBatchScreen();
    }
    @When ("^I verify the credit card of the check from the refund screen should be encrypted$")
    public void iVerifyThatCreditCardOfTheCheckFromTheRefundScreenShouldBeEncrypted(){
        new PaymentWindow(driver).verifyTheCreditCardOfTheCheckFromTheRefundScreenShouldBeEncrypted();
    }

    @And ("^I search the closed check in the Batch screen field$")
    public void iSearchTheClosedCheckInTheBatchScreenField(){
        new PaymentWindow(driver).searchTheClosedCheckInBatchScreen();
    }

    @And("Enter some name and click on Add Customer button")
    public void enterSomeNameAndClickOnAddCustomerButton() throws InterruptedException {
        new PaymentWindow(driver).enterCustomerandClickOnAddCustomer();

    }
}
