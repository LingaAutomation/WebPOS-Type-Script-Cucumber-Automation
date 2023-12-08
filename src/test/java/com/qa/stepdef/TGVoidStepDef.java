package com.qa.stepdef;


import com.qa.pages.TGVoidPage;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TGVoidStepDef {
    TestUtils utils=new TestUtils();

    TGVoidPage voidScreen = new TGVoidPage();
    @Given("Login with valid pin in void screen")
    public void loginWithValidPinInVoidScreen() {
        voidScreen.logInWithValidPin();
    }

    @And("^I click on \"([^\"]*)\" for closing order screen popup in void screen \"([^\"]*)\"$")
    public void iPressOnCancelButtonInVoidScreen(String btnCancelXPath, String msg) {
        voidScreen.commonAccessibilityId(btnCancelXPath, msg);
    }

    @When("User click QSR on Menu Item page in void screen")
    public void userClickQSROnMenuItemPageInVoidScreen() {
        voidScreen.clickQsrOrderType();
    }

    @And("User select first table in void screen")
    public void userSelectFirstTableInVoidScreen() {
        voidScreen.selectTableForSplit();
    }

    @Then("User select DineIn order type in void screen")
    public void userSelectDineInOrderTypeInVoidScreen() {
        voidScreen.selectDineInOrderType();
    }

    @When("User select any menu item in void screen")
    public void userSelectAnyMenuItemInVoidScreen() {
        voidScreen.selectMenuItem();
    }

    @Then("User click void button in void screen")
    public void userClickVoidButtonInVoidScreen() {
        voidScreen.clickVoidButton();
    }

    @And("User close void info popup in void screen")
    public void userCloseVoidInfoPopupInVoidScreen() {
        voidScreen.closeVoidPopup();
    }

    @And("User verify voided menu item in void screen")
    public void userVerifyVoidedMenuItemInVoidScreen() {
        voidScreen.verifyVoidItem();
    }

    @When("User take an order in void screen")
    public void userTakeAnOrderInVoidScreen() {
        voidScreen.takeOrder();
    }

    @When("User select void reason in void screen")
    public void userSelectVoidReasonInVoidScreen() {
        voidScreen.selectFirstVoidReason();

    }

    @And("User click add void button in void screen")
    public void userClickAddVoidButtonInVoidScreen() {
        voidScreen.clickAddVoidReasonButton();
    }

    @And("User click receipt printer button for void check in void screen")
    public void userClickReceiptPrinterButtonForVoidCheckInVoidScreen() {
        voidScreen.closeVoidReceiptPrinter();
    }

    @And("User close printer popup in void screen")
    public void userClosePrinterPopupInVoidScreen() {
        voidScreen.closePrinterInfoPopup();
    }

    @When("User click Check Status tab in void screen")
    public void userClickCheckStatusTabInVoidScreen() {
        voidScreen.clickCheckStatusTab();
    }

    @And("User click Void Checks tabs in void screen")
    public void userClickVoidChecksTabsInVoidScreen() {
        voidScreen.clickVoidChecksTab();
    }

    @And("User verify last voided order in void screen")
    public void userVerifyLastVoidedOrderInVoidScreen() {
        voidScreen.verifyVoidOrder();
    }

    @And("^I click \"([^\"]*)\" in the all tab screen in void screen \"([^\"]*)\"$")
    public void iClickInTheAllTabScreenInVoidScreen(String btnQsr, String msg) {
        voidScreen.commonBtn(btnQsr,msg);
    }

    @Then("User click payment button in void screen")
    public void userClickPaymentButtonInVoidScreen() {
        voidScreen.clickPaymentButtonOnMenuItemPage();
    }

    @And("USer click cash button in void screen")
    public void userClickCashButtonInVoidScreen() {
        voidScreen.clickCashButton();
    }

    @And("User click exit on payment page in void screen")
    public void userClickExitOnPaymentPageInVoidScreen() {
        voidScreen.clickExitButton();
    }

    @Then("^It should show the amount \"([^\"]*)\" value as \"([^\"]*)\" in void screen \"([^\"]*)\"$")
    public void textValue1InVoidScreen(String number,String value, String msg) {
        String text = voidScreen.getAmount(number,msg);
        Assert.assertEquals(text,value);
    }

    @Then("^I click \"([^\"]*)\" in the order screen in void screen \"([^\"]*)\"$")
    public void iClickInTheOrderScreenInVoidScreen(String btnCommon, String msg) {
        voidScreen.commonAccessibilityId(btnCommon, msg);
    }

    @And("^I click Done button on the Popup in void screen$")
    public void iClickDoneButtonOnThePopupInVoidScreen(){
        voidScreen.pressDone1();
    }

    @And("^I select the credit card check in the payment screen in void screen \"([^\"]*)\"$")
    public void iSelectTheCreditCardCheckInThePaymentScreenInVoidScreen(String msg) {
        voidScreen.clickOptCreditCardAmount(msg);
    }

    @When("^I click Delete in the payment screen in void screen \"([^\"]*)\"$")
    public void iClickDeleteInThePaymentScreenInVoidScreen(String msg) {
        voidScreen.clickBtnDelete(msg);
    }

    @And("^I click \"([^\"]*)\" in the receipt printer popup in void screen \"([^\"]*)\"$")
    public void iClickBtnOkInTheReceiptPrinterPopupInVoidScreen(String btnOkXPath, String msg) {
        voidScreen.ClickBtnOk(btnOkXPath, msg);
    }

    @And("^I click the Wrong Item Ordered \"([^\"]*)\" reason to void my menu item in void screen \"([^\"]*)\"$")
    public void iClickTheWrongItemOrderedReasonToVoidMyMenuItemInVoidScreen(String btnWrong,String msg) {
        voidScreen.clickBtnWrong(btnWrong,msg);
    }

    @And("I click \"([^\"]*)\" in the void screen in void screen \"([^\"]*)\"$")
    public void iClickInTheVoidScreenInVoidScreen(String btnAddXPath, String msg) {
        voidScreen.ClickBtnAdd(btnAddXPath, msg);
    }

    @When("^I click Exit in the payment screen in void screen \"([^\"]*)\"$")
    public void iClickExitInThePaymentScreenInVoidScreen(String msg) {
        voidScreen.ClickBtnExit(msg);
    }

    @And("^I click the \"([^\"]*)\" in the popup screen in void screen \"([^\"]*)\"$")
    public void iClickTheInThePopupScreenInVoidScreen(String btnDone, String msg) {
        voidScreen.commonAccessibilityId(btnDone, msg);
    }

    @And("^I click the \"([^\"]*)\" in the close the day screen in void screen \"([^\"]*)\"$")
    public void iClickTheInTheCloseTheDayScreenInVoidScreen(String btnCloseCashier, String msg) {
        voidScreen.commonBtnClick(btnCloseCashier, msg);
    }

    @When("^I get the check no in the order screen in void screen \"([^\"]*)\"$")
    public void iGetTheCheckNoInTheOrderScreenInVoidScreen(String msg) {
        voidScreen.getCheckNumber(msg);
    }

    @And("User click submit button in void screen")
    public void userClickSubmitButtonInVoidScreen() {
        voidScreen.clickSubmitButton();
    }

    @Then("User click Closed Checks tabs in void screen")
    public void userClickClosedChecksTabsInVoidScreen() {
        voidScreen.clickClosedChecks();
    }

    @Then("^I should see and select the closed check as in void screen \"([^\"]*)\"$")
    public void iShouldSeeAndSelectTheClosedCheckAsInVoidScreen(String msg) {
        voidScreen.passCheckNumber();
        utils.log().info(msg);
    }

    @Then("User click re-open check button in void screen")
    public void userClickReOpenCheckButtonInVoidScreen() {
        voidScreen.clickReOpenCheck();
    }

    @Then("User select paid order in void screen")
    public void userSelectPaidOrderInVoidScreen() {
        voidScreen.selectPaidOrder();

    }

    @And("I click \"([^\"]*)\" in the All Tab Screen in void screen1 \"([^\"]*)\"$")
    public void iClickInTheAllTabScreenInVoidScreen1(String btnAll, String msg) {
        voidScreen.commonBtnClick(btnAll,msg);
    }

    @Then("^I should verify the checks in void screen \"([^\"]*)\"$")
    public void iShouldVerifyTheChecksInVoidScreen(String msg) {
        boolean value=voidScreen.getVoidCheck(msg);
        Assert.assertTrue(value);
    }

    @When("User click setting icon in void screen")
    public void userClickSettingIconInVoidScreen() {
        voidScreen.clickSettingButton();
    }

    @Then("User verify setting options in void screen")
    public void userVerifySettingOptionsInVoidScreen() {
        voidScreen.verifySettingOptions();
    }

    @And("User select POS Settings tab in void screen")
    public void userSelectPOSSettingsTabInVoidScreen() {
        voidScreen.selectPOSSettingsTab();
    }

    @Given("User open ask customer name option if disable in void screen")
    public void userOpenAskCustomerNameOptionIfDisableInVoidScreen() throws Exception {
        voidScreen.openAskCustomerNameOptionIfDisable("up","down");
    }

    @And("^I click the \"([^\"]*)\" button for navigating to the pos screen in void screen \"([^\"]*)\"$")
    public void iClickThePosButtonForNavigatingToThePosScreenInVoidScreen(String btnPos,String msg) {
        voidScreen.commonAccessibilityId(btnPos,msg);
    }

    @Then("User click cancel button in void screen")
    public void userClickCancelButtonInVoidScreen() {
        voidScreen.pressCancel();
    }

    @Then("User select Bar Tab in order types in void screen")
    public void userSelectBarTabInOrderTypesInVoidScreen() {
        voidScreen.selectBarTabOrderType();
    }

    @And("^I click \"([^\"]*)\" in the preauth popup in void screen \"([^\"]*)\"$")
    public void iClickInThePreauthPopupInVoidScreen(String btnExit, String msg) {
        voidScreen.commonBtnClick(btnExit,msg);
    }

    @When("User enter customer name for bar tab in void screen")
    public void userEnterCustomerNameForBarTabInVoidScreen() {
        voidScreen.enterCustomerNameForBarTab();
    }

    @When("User click Cash Tab on Menu Item Page in void screen")
    public void userClickCashTabOnMenuItemPageInVoidScreen() {
        voidScreen.clickCashPaymentTab();
    }

    @And("User click exact option in void screen")
    public void userClickExactOptionInVoidScreen() {
        voidScreen.clickExactButtonOnCashTab();
    }

    @Then("User click enter button in void screen")
    public void userClickEnterButtonInVoidScreen() {
        voidScreen.clickEnterButtonOnCashButton();
    }

    @And("User verify paid order for Sandwiches in void screen")
    public void userVerifyPaidOrderForSandwichesInVoidScreen() {
        voidScreen.verifyPaidOrderForSandwiches();
    }

    @Then("User click finish button in void screen")
    public void userClickFinishButtonInVoidScreen() {
        voidScreen.clickFinishButton();
    }

    @Then("User select last active check for BarTab in void screen")
    public void userSelectLastActiveCheckForBarTabInVoidScreen() throws InterruptedException {
        voidScreen.selectLastActiveCheckForBarTab();
    }

    @Then("^I should get back to the \"([^\"]*)\", in void screen \"([^\"]*)\"$")
    public void iShouldGetBackToThe(String TxtBarTab, String msg) {
        String text = voidScreen.commonGetText(TxtBarTab,msg);
        Assert.assertEquals(TxtBarTab, text);
    }



}