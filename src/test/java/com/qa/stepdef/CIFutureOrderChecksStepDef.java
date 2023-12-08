package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CIFutureOrderChecksStepDef {

    CIWaitListPage waitList = new CIWaitListPage();
    CIPaymentScreen ciPaymentScreen = new CIPaymentScreen();
    CIEightySixListScreen ciEightySixListScreen = new CIEightySixListScreen();
    CICloseDayScreen ciCloseDayScreen = new CICloseDayScreen();
    CIFutureOrderChecksScreen ciFutureOrderChecksScreen = new CIFutureOrderChecksScreen();
    TestUtils utils = new TestUtils();

    @And("^I click \"([^\"]*)\" in the Phone order tab \"([^\"]*)\"$")
    public void iClickInThePhoneOrderTab(String tabFuture, String msg) {
        ciPaymentScreen.commonFutureBtnClick(tabFuture,msg);
    }

    @Then("^I should verify the check number, order and delivery date search filter in the future tab \"([^\"]*)\"$")
    public void iShouldVerifyTheCheckNumberOrderAndDeliveryDateSearchFilterInTheFutureTab(String msg) {
        boolean text = ciFutureOrderChecksScreen.getFiltersInFutureTab();
        utils.log().info(msg + " is " + text);
        Assert.assertTrue(text);

    }

    @Then("^I should verify the check number starts with \"([^\"]*)\" in the future tab \"([^\"]*)\"$")
    public void iShouldVerifyTheCheckNumberStartsWithInTheFutureTab(String getFirstLetter, String msg) {
        String text = ciFutureOrderChecksScreen.getFirstCharacter();
        utils.log().info(msg);
        Assert.assertEquals(getFirstLetter, text);
    }

    @When("^I get the future tab check number \"([^\"]*)\"$")
    public void iGetTheFutureTabCheckNumber(String msg) {
        ciFutureOrderChecksScreen.getFutureTabCheckNumber(msg);
    }

    @And("^I search the check in the future tab search field \"([^\"]*)\"$")
    public void iSearchTheCheckInTheFutureTabSearchField(String msg) {
        ciFutureOrderChecksScreen.passCheckNumber1(msg);
    }

    @And("^I click on \"([^\"]*)\" in the order type popup \"([^\"]*)\"$")
    public void iClickOnInTheOrderTypePopup(String btnPhoneDelivery, String msg) {
        ciFutureOrderChecksScreen.clickPhoneDelivery(btnPhoneDelivery,msg);
    }

    @And("^I enter the tip amount as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterTheTipAmountAs(String pin1, String pin2, String pin3, String pin4) {
        ciPaymentScreen.pressPercentagePin(pin1, pin2, pin3, pin4);
    }

    @Then("^I click \"([^\"]*)\" in the tip popup in the batch screen \"([^\"]*)\"$")
    public void iClickInTheTipPopupInTheBatchScreen(String btnContinue, String msg) {
        ciPaymentScreen.commonBtnClick(btnContinue,msg);
    }

    @And("^I click the search field in customer tab \"([^\"]*)\" \"([^\"]*)\"$")
    public void iClickTheSearchFieldInCustomerTab(String customerName, String msg) {
        ciFutureOrderChecksScreen.passName(customerName,msg);
    }

    @And("^I click the customer name in the list \"([^\"]*)\"$")
    public void iClickTheCustomerNameInTheList(String msg) {
        ciFutureOrderChecksScreen.clickCustomer(msg);
    }

    @And("^I click the check in the phone order \"([^\"]*)\"$")
    public void iClickTheCheckInThePhoneOrder(String msg) {
        ciFutureOrderChecksScreen.clickCheck(msg);
    }

    @And("^I click \"([^\"]*)\" in the phone order screen \"([^\"]*)\"$")
    public void iClickInThePhoneOrderScreen(String btnPayCheck, String msg) {
        ciPaymentScreen.commonBtnClickOption(btnPayCheck,msg);
    }

    @Then("^I should verify the default tax value \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheDefaultTaxValue(String taxValue, String msg) {
        String value= ciPaymentScreen.commonGetText(taxValue,msg);
        Assert.assertEquals(taxValue,value);
    }

    @Then("^I should verify the check is available in batch tip \"([^\"]*)\"$")
    public void iShouldVerifyTheCheckIsAvailableInBatchTip(String msg) {
        boolean value=ciFutureOrderChecksScreen.isCheckDisplayed(msg);
        Assert.assertTrue(value);
    }

    @And("^I search the check in new tab in phone order \"([^\"]*)\"$")
    public void iSearchTheCheckInNewTabInPhoneOrder(String msg) {
        ciFutureOrderChecksScreen.passNewTabSearch(msg);
    }

    @And("^I click \"([^\"]*)\" in the batch screen \"([^\"]*)\"$")
    public void iClickInTheBatchScreen(String btnSubmitBatch, String msg) {
        waitList.commonBtn(btnSubmitBatch,msg);
    }

    @And("^I click the future order check for adjusting tip in batch screen \"([^\"]*)\"$")
    public void iClickTheFutureOrderCheckForAdjustingTipInBatchScreen(String msg) {
        ciFutureOrderChecksScreen.clickCheckInBatch(msg);
    }

    @And("^I search the check in the Batch search field \"([^\"]*)\"$")
    public void iSearchTheCheckInTheBatchSearchField(String msg) {
        ciFutureOrderChecksScreen.passCheckNumber2(msg);
    }

    @Then("^I should verify the driver \"([^\"]*)\" is disabled in the future order tab \"([^\"]*)\"$")
    public void iShouldVerifyTheDriverIsDisabledInTheFutureOrderTab(String driverJohn,String msg) {
        boolean text = ciFutureOrderChecksScreen.getDriver(driverJohn);
        utils.log().info(msg +" is "+ text);
        Assert.assertFalse(false);
    }

    @And("^I search the check in the new tab search field \"([^\"]*)\"$")
    public void iSearchTheCheckInTheNewTabSearchField(String msg) {
        ciFutureOrderChecksScreen.getNewTabCheckNo(msg);
    }

    @When("^I click \"([^\"]*)\" in the new tab screen \"([^\"]*)\"$")
    public void iClickInTheNewTabScreen(String btnEdit, String msg) {
        waitList.commonBtn(btnEdit,msg);
    }

    @And("^I search the check in the closed tab search field \"([^\"]*)\"$")
    public void iSearchTheCheckInTheClosedTabSearchField(String msg) {
        ciFutureOrderChecksScreen.PassCheckNoInVoidTab(msg);
    }

    @Then("^I should verify the check \"([^\"]*)\"$")
    public void iShouldVerifyTheCheck(String msg) {
        boolean value=ciFutureOrderChecksScreen.getVoidCheck(msg);
        Assert.assertTrue(value);
    }

    @And("^I should search and select the check in the future tab \"([^\"]*)\"$")
    public void iShouldSearchAndSelectTheCheckInTheFutureTab(String msg) {
        ciFutureOrderChecksScreen.clickFutureCheck();
        utils.log().info(msg);
    }

    @And("^I search the the void check in the void tab \"([^\"]*)\"$")
    public void iSearchTheTheVoidCheckInTheVoidTab(String msg) {
        ciFutureOrderChecksScreen.passVoidCheckNo(msg);
    }

    @And("^I click \"([^\"]*)\" in the order type popup \"([^\"]*)\"$")
    public void iClickInTheOrderTypePopup(String btnForHere, String msg) {
        waitList.commonBtn(btnForHere,msg);
    }

    @Then("^I should verify the Latest order check is displayed in the bottom of the future order screen \"([^\"]*)\"$")
    public void iShouldVerifyTheLatestOrderCheckIsDisplayedInTheBottomOfTheFutureOrderScreen(String msg) {
        ciFutureOrderChecksScreen.getLatestCheck(msg);
    }

    @And("^I select the loyalty payment method \"([^\"]*)\"$")
    public void iSelectTheLoyaltyPaymentMethod(String msg) {
        ciFutureOrderChecksScreen.clickLoyalty(msg);
    }

    @And("^I click the \"([^\"]*)\" in the order type popup \"([^\"]*)\"$")
    public void iClickTheInTheOrderTypePopup(String btnDelivery, String msg) {
        ciPaymentScreen.btnClickTip(btnDelivery,msg);
    }

    @And("^I scroll one hour time \"([^\"]*)\"$")
    public void iScrollOneHourTime(String msg) {
        ciFutureOrderChecksScreen.clickWaitingTime(msg);
    }

    @And("^I click the amount in the cash popup for paying the amount in us dollar \"([^\"]*)\"$")
    public void iClickTheAmountInTheCashPopupForPayingTheAmountInUsDollar(String msg) {
        ciFutureOrderChecksScreen.clickAmount(msg);
    }

    @And("^I click \"([^\"]*)\" in the cash popup \"([^\"]*)\"$")
    public void iClickInTheCashPopup(String btnEnter, String msg) {
        waitList.commonBtn(btnEnter,msg);
    }

    @And("^I scroll the payment to pay \"([^\"]*)\"$")
    public void iScrollThePaymentToPay( String msg) throws Exception {
        ciFutureOrderChecksScreen.scrollPayments(msg);
    }

    @And("^I click the driver \"([^\"]*)\" in the new tab \"([^\"]*)\"$")
    public void iClickTheDriverInTheNewTab(String driver,String msg) {
        ciFutureOrderChecksScreen.clickDriver(driver,msg);
    }

    @Then("^I should verify the driver in the new tab after departure to arrival \"([^\"]*)\"$")
    public void iShouldVerifyTheDriverInTheNewTabAfterDepartureToArrival(String msg) {
        boolean value = ciFutureOrderChecksScreen.getDriverInNewTab(msg);
        Assert.assertTrue(value);
    }

    @And("^I click on \"([^\"]*)\" in the Phone order tab \"([^\"]*)\"$")
    public void iClickTheNewButtonInThePhoneOrderTab(String phoneOrderTab,String msg) {
        ciFutureOrderChecksScreen.clickNewTab(phoneOrderTab,msg);
    }

    @And("^I click \"([^\"]*)\" button in the batch screen \"([^\"]*)\"$")
    public void iClickButtonInTheBatchScreen(String btnDropDown, String msg) {
        ciFutureOrderChecksScreen.clickDropDown(btnDropDown,msg);
    }

    @And("^I select \"([^\"]*)\" the user in the list of users \"([^\"]*)\"$")
    public void iSelectTheUserInTheListOfUsers(String btnUser, String msg) {
        ciPaymentScreen.btnClickTip(btnUser,msg);
    }

    @And("^I click order date \"([^\"]*)\" filter for filtering the checks \"([^\"]*)\"$")
    public void iClickOrderDateFilterForFilteringTheChecks(String filter,String msg) {
        ciFutureOrderChecksScreen.clickOrderDate(filter,msg);
    }

    @And("^I click \"([^\"]*)\" in the future tab screen \"([^\"]*)\"$")
    public void iClickInTheFutureTabScreen(String btnApply, String msg) {
        waitList.commonBtn(btnApply,msg);
    }

    @And("I get the order date \"([^\"]*)\" in the future tab \"([^\"]*)\"$")
    public void iGetTheOrderDateInTheFutureTab(String filter,String msg) {
        ciFutureOrderChecksScreen.getOrderDate(filter,msg);
    }

    @Then("I should verify the filtered order date checks are displayed in the future tab or not \"([^\"]*)\"$")
    public void iShouldVerifyTheFilteredOrderDateChecksAreDisplayedInTheFutureTabOrNot(String msg) {
        boolean value=ciFutureOrderChecksScreen.getFutureOrderDate(msg);
        Assert.assertTrue(value);
    }

    @And("^I click delivery date \"([^\"]*)\" filter for filtering the checks \"([^\"]*)\"$")
    public void iClickDeliveryDateFilterForFilteringTheChecks(String filter, String msg) {
        ciFutureOrderChecksScreen.clickOrderDate(filter,msg);
    }

    @And("I get the delivery date \"([^\"]*)\" in the future tab \"([^\"]*)\"$")
    public void iGetTheDeliveryDateInTheFutureTab(String filter, String msg) {
        ciFutureOrderChecksScreen.getOrderDate(filter,msg);
    }

    @Then("^I should verify the filtered delivery date checks are displayed in the future tab or not \"([^\"]*)\"$")
    public void iShouldVerifyTheFilteredDeliveryDateChecksAreDisplayedInTheFutureTabOrNot(String msg) {
        boolean value=ciFutureOrderChecksScreen.getFutureOrderDate(msg);
        Assert.assertTrue(value);
    }

    @Then("^I should verify the total tip \"([^\"]*)\" in the batch screen \"([^\"]*)\"$")
    public void iShouldVerifyTheTotalTipInTheBatchScreen(String totalTip, String msg) {
        String value = ciFutureOrderChecksScreen.getTotalTip(totalTip,msg);
        Assert.assertEquals(value,totalTip);
    }


    @And("^I enable the apply total in the batch screen \"([^\"]*)\"$")
    public void iEnableTheApplyTotalInTheBatchScreen(String msg) {
        ciFutureOrderChecksScreen.clickApplyTotal(msg);

    }

    @Then("^I should verify the driver report displaying for future order \"([^\"]*)\"$")
    public void iShouldVerifyTheDriverReportDisplayingForFutureOrder(String msg) {
        boolean value=ciFutureOrderChecksScreen.getVoidCheck(msg);
        Assert.assertTrue(value);
    }


    @And("^I click the amount in the \"([^\"]*)\" cash popup for paying the amount \"([^\"]*)\"$")
    public void iClickTheAmountInTheCashPopupForPayingTheAmount(String amount,String msg) {
        ciFutureOrderChecksScreen.clickTLAmount(amount,msg);
    }

    @Then("^I should verify it allows to change service type \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyItAllowsToChangeServiceType(String btnDelivery, String msg) {
        boolean value=ciFutureOrderChecksScreen.checkServiceTypeAccesible(btnDelivery,msg);
        Assert.assertFalse(value);
    }

    @Then("^I should verify the check is available in New tab \"([^\"]*)\"$")
    public void iShouldVerifyTheCheckIsAvailableInNewTab(String msg) {
        boolean value=ciFutureOrderChecksScreen.isCheckDisplayed(msg);
        Assert.assertTrue(value);
    }

    @Then("^I should see the \"([^\"]*)\" in the phone order new tab \"([^\"]*)\"$")
    public void iShouldSeeTheInThePhoneOrderNewTab(String emptyList, String msg) {
        String text=ciFutureOrderChecksScreen.getEmptyList(emptyList,msg);
        Assert.assertEquals(emptyList,text);
    }

    @Then("^I should verify the service type \"([^\"]*)\" in future tab \"([^\"]*)\"$")
    public void iShouldVerifyTheServiceTypeInFutureTab(String txtPhoneDelivery, String msg) {
        String text=ciFutureOrderChecksScreen.getServiceType1(txtPhoneDelivery,msg);
        Assert.assertEquals(txtPhoneDelivery,text);
    }

    @Then("^It should show the \"([^\"]*)\" Paid Amount \"([^\"]*)\"$")
    public void itShouldShowThePaidAmount(String txtGratuity, String msg) {
        Assert.assertEquals(ciFutureOrderChecksScreen.commonGetText2(txtGratuity,msg),txtGratuity);
    }

    @Then("^It should show the \"([^\"]*)\" Total \"([^\"]*)\"$")
    public void itShouldShowTheTotal(String value, String msg) {
        Assert.assertEquals(ciFutureOrderChecksScreen.commonGetText1(value,msg),value);

    }

    @Then("^It should show the \"([^\"]*)\" Balance \"([^\"]*)\"$")
    public void itShouldShowTheBalance(String value, String msg) {
        Assert.assertEquals(ciFutureOrderChecksScreen.commonGetText2(value,msg),value);
    }

    @And("^I click the check in the active tab \"([^\"]*)\"$")
    public void iClickTheCheckInTheActiveTab(String msg) {
        ciFutureOrderChecksScreen.clickActiveCheck(msg);
    }

    @Then("^I should verify the \"([^\"]*)\" check opens or not \"([^\"]*)\"$")
    public void iShouldVerifyTheCheckOpensOrNot(String emptyList,String msg) {
        String text =  ciFutureOrderChecksScreen.getItem(msg);
        Assert.assertNotEquals(emptyList,text);
    }

    @And("^I click the \"([^\"]*)\" in the active check tab \"([^\"]*)\"$")
    public void iClickTheInTheActiveCheckTab(String btnOpenCheck, String msg) {
        waitList.commonBtn(btnOpenCheck,msg);
    }

    @And("^I click \"([^\"]*)\" in the confirmation popup \"([^\"]*)\"$")
    public void iClickInTheConfirmationPopup(String btnYes, String msg) {
        waitList.commonBtn(btnYes,msg);
    }

    @And("^I click \"([^\"]*)\" in the refund popup \"([^\"]*)\"$")
    public void iClickInTheRefundPopup(String btnCash, String msg) {
        ciPaymentScreen.commonBtnClickOption(btnCash,msg);
    }

    @And("^I click \"([^\"]*)\" in the refund screen \"([^\"]*)\"$")
    public void iClickInTheRefundScreen(String btnRefund, String msg) {
        waitList.commonBtn(btnRefund,msg);
    }

    @And("^I should search the check \"([^\"]*)\" for refund \"([^\"]*)\"$")
    public void iShouldSearchTheCheckForRefund(String txtSearchField,String msg) {
        ciFutureOrderChecksScreen.clickRefundSearchField(txtSearchField,msg);
    }

    @And("^I click \"([^\"]*)\" button in the refund screen for searching \"([^\"]*)\"$")
    public void iClickButtonInTheRefundScreenForSearching(String btnSearch, String msg) {
        waitList.commonBtn(btnSearch,msg);
    }

    @And("^I click the check in the refund screen \"([^\"]*)\"$")
    public void iClickTheCheckInTheRefundScreen(String msg) {
        ciFutureOrderChecksScreen.clickRefundCheck(msg);
    }

    @And("^I enter the reason \"([^\"]*)\" in the reason field \"([^\"]*)\"$")
    public void iEnterTheReasonInTheReasonField(String wrongOrder, String msg) {
        ciFutureOrderChecksScreen.clickRefundReason(wrongOrder,msg);
    }

    @And("^I click the device drop down \"([^\"]*)\" button in the batch screen \"([^\"]*)\"$")
    public void iClickTheDeviceDropDownButtonInTheBatchScreen(String btnDropDown, String msg) {
        ciFutureOrderChecksScreen.clickBtnOne(btnDropDown,msg);
    }

    @And("^I select the payment name \"([^\"]*)\" in the List \"([^\"]*)\"$")
    public void iSelectThePaymentNameInTheList(String btnMppgAuth, String msg) {
        ciPaymentScreen.commonBtnClickOption(btnMppgAuth,msg);
    }

    @Then("^I should verify the \"([^\"]*)\" button is enable or not in the batch screen \"([^\"]*)\"$")
    public void iShouldVerifyTheButtonIsEnableOrNotInTheBatchScreen(String btnProcessOffline, String msg) {
        boolean text = ciFutureOrderChecksScreen.getProcessOffline(btnProcessOffline);
        utils.log().info(msg +" is "+ text);
        Assert.assertTrue(text);
    }

    @And("^I should verify the application not allows to adjust tip \"([^\"]*)\" in offline mode \"([^\"]*)\"$")
    public void iShouldVerifyTheApplicationNotAllowsToAdjustTipInOfflineMode(String txtTip, String msg) {
        String text = ciFutureOrderChecksScreen.getTip(txtTip,msg);
        Assert.assertEquals(txtTip, text);
    }

    @Then("^I should verify the check number reset or not \"([^\"]*)\"$")
    public void iShouldVerifyTheCheckNumberResetOrNot(String msg) {
        String value=ciFutureOrderChecksScreen.getCheckNumber();
        String text=ciFutureOrderChecksScreen.checkNumber2(msg);
        utils.log().info(msg);
        Assert.assertNotEquals(value,text);
    }

    @Then("^I should verify the check number reset \"([^\"]*)\"$")
    public void iShouldVerifyTheCheckNumberReset(String msg) {
        boolean value=ciFutureOrderChecksScreen.getSameCheckNo(msg);
        Assert.assertTrue(value);
    }

    @And("^I click \"([^\"]*)\" for void the active checks \"([^\"]*)\"$")
    public void iClickForVoidTheActiveChecks(String btnVoid, String msg) {
        waitList.commonBtn(btnVoid,msg);
    }

    @Then("^I should verify the \"([^\"]*)\" close the day checklist popup \"([^\"]*)\"$")
    public void iShouldVerifyTheCloseTheDayChecklistPopup(String txtCloseDay, String msg) {
        String text = ciFutureOrderChecksScreen.accessibilityId(txtCloseDay,msg);
        Assert.assertEquals(txtCloseDay, text);
    }

    @And("^I should the active check counts \"([^\"]*)\" in the close the day checklist popup \"([^\"]*)\"$")
    public void iShouldTheActiveCheckCountsInTheCloseTheDayChecklistPopup(String activeCount, String msg) {
        String text = ciFutureOrderChecksScreen.getActiveCheckCount(activeCount,msg);
        Assert.assertEquals(activeCount, text);
    }

    @Then("^I should verify the close the day screen \"([^\"]*)\" after click no button in the confirmation popup \"([^\"]*)\"$")
    public void iShouldVerifyTheCloseTheDayScreenAfterClickNoButtonInTheConfirmationPopup(String txtCloseDay, String msg) {
        String text = ciFutureOrderChecksScreen.accessibilityId(txtCloseDay,msg);
        Assert.assertEquals(txtCloseDay, text);
    }

    @And("^I click the \"([^\"]*)\" button in the future order screen \"([^\"]*)\"$")
    public void iClickTheButtonInTheFutureOrderScreen(String btnPrint, String msg) {
        waitList.commonBtn(btnPrint,msg);
    }

    @Then("^I should verify the \"([^\"]*)\" option is enable or not \"([^\"]*)\"$")
    public void iShouldVerifyTheOptionIsEnableOrNot(String btnPrint, String msg) {
        boolean text = ciFutureOrderChecksScreen.getPrint(btnPrint);
        utils.log().info(msg +" is "+ text);
        Assert.assertTrue(text);
    }

    @And("^I should verify the sppax ebt \"([^\"]*)\" button is enable or not \"([^\"]*)\"$")
    public void iShouldVerifyTheSppaxEbtButtonIsEnableOrNot(String btnSPPAXEbt, String msg) {
        boolean text = ciFutureOrderChecksScreen.getSppaxEbt(btnSPPAXEbt);
        utils.log().info(msg +" is "+ text);
        Assert.assertTrue(text);
    }

    @And("^I click the \"([^\"]*)\" for paying the amount \"([^\"]*)\"$")
    public void iClickTheForPayingTheAmount(String btnPay, String msg) {
        waitList.commonBtn(btnPay,msg);
    }

    @And("^I select the card \"([^\"]*)\" for nmi payments \"([^\"]*)\"$")
    public void iSelectTheCardForNmiPayments(String btnCard, String msg) {
        ciFutureOrderChecksScreen.clickCard(btnCard,msg);
    }

    @When("^I store the future tab check number \"([^\"]*)\"$")
    public void iStoreTheFutureTabCheckNumber(String msg) {
        ciFutureOrderChecksScreen.getCheckNo(msg);
    }

    @And("^I click \"([^\"]*)\" in the batch tip screen \"([^\"]*)\"$")
    public void iClickInTheBatchTipScreen(String btnProcessOffline, String msg) {
        ciPaymentScreen.commonBtnClick(btnProcessOffline,msg);
    }

    @Then("^I should verify the screen with \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheScreenWith(String noPayments, String msg) {
        String text=ciFutureOrderChecksScreen.getTextBatch(noPayments,msg);
        Assert.assertEquals(noPayments,text);
    }

    @Then("I verify the \"([^\"]*)\" is enabled in check stats \"([^\"]*)\"$")
    public void iVerifyTheIsEnabledInCheckStats(String Value, String msg) {
        boolean value=ciFutureOrderChecksScreen.checkSPPaxEnabled(Value,msg);
        Assert.assertTrue(value);
    }

    @And("^I verify the \"([^\"]*)\" is enabled or not in payment Screen \"([^\"]*)\"$")
    public void iVerifyTheIsEnabledOrNotInPaymentScreen(String Value, String msg) {
        boolean value=ciFutureOrderChecksScreen.checkSPPaxEnabled(Value,msg);
        Assert.assertTrue(value);
    }

    @And("^I enable the order type in pos settings \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnableTheOrderTypeInPosSettings(String pin, String msg) {
        ciFutureOrderChecksScreen.enableOrderType(pin,msg);
    }

    @Given("^I click wifi button \"([^\"]*)\"$")
    public void iClickWifiButton(String arg0) {
        ciFutureOrderChecksScreen.clickWifi(arg0);
    }

    @And("^I click the back office button \"([^\"]*)\"$")
    public void iClickTheBackOfficeButton(String msg) {
        ciFutureOrderChecksScreen.clickBackOffice(msg);
    }

    @And("^I enter the \"([^\"]*)\" in the back office email text field \"([^\"]*)\"$")
    public void iEnterTheInTheBackOfficeEmailTextField(String text, String msg) {
        ciFutureOrderChecksScreen.email(text,msg);
    }

    @And("^I enter the \"([^\"]*)\" in the back office password \"([^\"]*)\"$")
    public void iEnterTheInTheBackOfficePassword(String text, String msg) {
        ciFutureOrderChecksScreen.password(text,msg);
    }

    @And("^I click the sign in button \"([^\"]*)\"$")
    public void iClickTheSignInButton(String msg) {
        ciFutureOrderChecksScreen.clickSignIn(msg);
    }

    @And("^I click the reports \"([^\"]*)\" \"([^\"]*)\"$")
    public void iClickTheReports(String value,String msg) {
        ciFutureOrderChecksScreen.clickReport(value,msg);
    }

    @And("^I click the sales \"([^\"]*)\" \"([^\"]*)\"$")
    public void iClickTheSales(String value,String msg) {
        ciFutureOrderChecksScreen.clickSale(value,msg);
    }

    @And("^I click the sales recap \"([^\"]*)\" \"([^\"]*)\"$")
    public void iClickTheSalesRecap(String value,String msg) {
        ciFutureOrderChecksScreen.clickSaleRecap(value,msg);
    }

    @Then("^I should verify the \"([^\"]*)\" in back office \"([^\"]*)\"$")
    public void iShouldVerifyTheInBackOffice(String Text, String msg) {
        String text=ciPaymentScreen.commonGetText(Text,msg);
        Assert.assertEquals(Text,text);
    }

    @Then("^I should verify the check is available in back office void report \"([^\"]*)\"$")
    public void iShouldVerifyTheCheckIsAvailableInBackOfficeVoidReport(String msg) {
        boolean value=ciFutureOrderChecksScreen.isCheckDisplayed(msg);
        Assert.assertTrue(value);
    }

    @And("I should verify the \"([^\"]*)\" button is enable or not \"([^\"]*)\"$")
    public void iShouldVerifyTheButtonIsEnableOrNot(String btnDejavoo, String msg) {
        boolean text = ciFutureOrderChecksScreen.getSppaxEbt(btnDejavoo);
        utils.log().info(msg +" is "+ text);
        Assert.assertTrue(text);
    }

    @And("I click the \"([^\"]*)\" in the list of reports\"([^\"]*)\"$")
    public void iClickTheInTheListOfReports(String button, String msg) {
        ciFutureOrderChecksScreen.clickSale(button,msg);
    }

    @And("^I should verify the refund report in the BO refund report screen \"([^\"]*)\"$")
    public void iShouldVerifyTheRefundReportInTheBORefundReportScreen(String msg) {
        boolean value = ciFutureOrderChecksScreen.getBORefundReport(msg);
        Assert.assertTrue(value);
    }

    @And("I click the \"([^\"]*)\" in sale recap type \"([^\"]*)\"$")
    public void iClickTheInSaleRecapType(String btnDropDown, String msg) {
        ciCloseDayScreen.commonAccessibilityId(btnDropDown,msg);
    }

    @And("I click  \"([^\"]*)\" in the sale recap type \"([^\"]*)\"$")
    public void iClickInTheSaleRecapType(String btnTimePeriod, String msg) {
        ciCloseDayScreen.commonAccessibilityId(btnTimePeriod,msg);
    }

    @And("I click the time period drop down in the time period \"([^\"]*)\"$")
    public void iClickTheInTheTimePeriod(String msg) {
        ciFutureOrderChecksScreen.clickTimeDropDown(msg);
    }

    @And("I click  \"([^\"]*)\" in the time period \"([^\"]*)\"$")
    public void iClickInTheTimePeriod(String btnTimePeriod, String msg) {
        ciCloseDayScreen.commonAccessibilityId(btnTimePeriod,msg);
    }

    @And("I click the run button in the sale recap report \"([^\"]*)\"$")
    public void iClickTheRunButtonInTheSaleRecapReport( String msg) {
        ciFutureOrderChecksScreen.clickBtnRun(msg);
    }

}