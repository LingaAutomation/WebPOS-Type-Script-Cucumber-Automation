package com.qa.stepdef;

import com.qa.pages.CICloseDayScreen;
import com.qa.pages.CIPaymentScreen;
import com.qa.pages.CIWaitListPage;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class CIWaitListStepDef {

    CIWaitListPage waitList=new CIWaitListPage();
    CIPaymentScreen ciPaymentScreen=new CIPaymentScreen();
    CICloseDayScreen ciCloseDayScreen=new CICloseDayScreen();
    TestUtils utils = new TestUtils();

    @When("^I click \"([^\"]*)\" in the Wait List Tab \"([^\"]*)\"$")
    public void iClickInTheWaitListTab(String BtnAdd, String msg) {
        waitList.commonBtn(BtnAdd,msg);
    }

    @And("^I enter the \"([^\"]*)\" in the search field \"([^\"]*)\"$")
    public void iEnterTheInTheSearchField(String btnName,String msg) {
        waitList.passName(btnName,msg);
    }

    @And("^I select the Test Table customer in the field \"([^\"]*)\"$")
    public void iSelectTheTestTableCustomerInTheField(String msg) {
        waitList.clickName(msg);
    }

    @And("^I select \"([^\"]*)\" in the Size field \"([^\"]*)\"$")
    public void iSelectInTheSizeField(String btnOne, String msg) {
        waitList.commonBtn(btnOne,msg);
    }

    @When("^I click \"([^\"]*)\" in the Add Party Pop up \"([^\"]*)\"$")
    public void iClickInTheAddPartyPopUp(String btnNext, String msg) {
        waitList.commonBtn(btnNext,msg);
    }

    @And("^I click \"([^\"]*)\" in the Time Pop up \"([^\"]*)\"$")
    public void iClickInTheTimePopUp(String btnAdd, String msg) {
        waitList.commonBtn(btnAdd,msg);
    }

    @Then("^I Should verify the edit \"([^\"]*)\" in the Wait list Screen \"([^\"]*)\"$")
    public void iShouldVerifyTheEditInTheWaitListScreen(String btnEdit, String msg) throws InterruptedException {
        waitList.swipeList(btnEdit);
        String text = new CIPaymentScreen().commonGetText(btnEdit,msg);
        Assert.assertEquals(text,btnEdit);
    }

    @And("^I enter the \"([^\"]*)\" \"([^\"]*)\" in the notes field \"([^\"]*)\"$")
    public void iEnterTheInTheNotesField(String btnKeyboard,String Notes,String msg) {
        waitList.passNotes(btnKeyboard,Notes,msg);
    }

    @And("^I click the \"([^\"]*)\" in the Wait list Screen \"([^\"]*)\"$")
    public void iClickTheInTheWaitListScreen(String btnEdit, String msg) throws InterruptedException {
        waitList.swipeList(btnEdit);
        waitList.swipeListNew(btnEdit);
        waitList.commonBtn(btnEdit,msg);
    }

    @Then("^I should verify the edit popup \"([^\"]*)\" with confirmation msg \"([^\"]*)\"$")
    public void iShouldVerifyTheEditPopupWithConfirmationMsg(String txtEditPopup,String msg){
        String text = waitList.getTxtPopup(txtEditPopup,msg);
        Assert.assertEquals(txtEditPopup,text);
    }

    @And("^I click the \"([^\"]*)\" in the edit guest popup \"([^\"]*)\"$")
    public void iClickTheInTheEditGuestPopup(String btnYes, String msg) {
        waitList.commonBtn(btnYes,msg);
    }

    @Then("^I should verify the Add party popup \"([^\"]*)\" in the wait list screen \"([^\"]*)\"$")
    public void iShouldVerifyTheAddPartyPopupInTheWaitListScreen(String txtEditPopup, String msg) {
        String text = waitList.getTxtPopup(txtEditPopup,msg);
        Assert.assertEquals(txtEditPopup,text);
    }

    @Then("^I should verify the seat number \"([^\"]*)\" in the wait list screen \"([^\"]*)\"$")
    public void iShouldVerifyTheSeatNumberInTheWaitListScreen(String commonWaitList, String msg) {
        String text = waitList.getTxtSeatNumber(commonWaitList,msg);
        Assert.assertEquals(commonWaitList,text);
    }

    @And("^I click the \"([^\"]*)\" in the add party popup \"([^\"]*)\"$")
    public void iClickTheInTheAddPartyPopup(String btnChild, String msg) {
        waitList.commonBtn(btnChild,msg);
    }

    @Then("^I should verify the Persons \"([^\"]*)\" in the wait list screen \"([^\"]*)\"$")
    public void iShouldVerifyThePersonsInTheWaitListScreen(String commonWaitList, String msg) {
        String text = waitList.getTxtSeatNumber(commonWaitList,msg);
        Assert.assertEquals(commonWaitList,text);
    }

    @And("^I scroll down to change the waiting time \"([^\"]*)\" in the popup \"([^\"]*)\"$")
    public void iScrollDownToChangeTheWaitingInThePopup(String waitingTime, String msg) {
        waitList.clickWaitingTime(waitingTime, msg);
    }

    @Then("^I should verify the Waiting time \"([^\"]*)\" in the wait list screen \"([^\"]*)\"$")
    public void iShouldVerifyTheWaitingTimeInTheWaitListScreen(String commonWaitList, String msg) {
        String text = waitList.getTxtSeatNumber(commonWaitList,msg);
        Assert.assertEquals(commonWaitList,text);
    }

    @And("^I click \"([^\"]*)\" in the wait list screen \"([^\"]*)\"$")
    public void iClickInTheWaitListScreen(String btnAssign, String msg) {
        waitList.clickAssign(btnAssign,msg);
    }

    @And("^I should verify the customer name \"([^\"]*)\" in the wait list screen \"([^\"]*)\"$")
    public void iShouldVerifyTheCustomerNameInTheWaitListScreen(String commonWaitList, String msg) {
        String text = waitList.getTxtSeatNumber(commonWaitList,msg);
        Assert.assertEquals(commonWaitList,text);
    }

    @And("^I click the table in the table layout for placing the order \"([^\"]*)\"$")
    public void iClickTheTableTInTheTableLayoutForPlacingTheOrder(String msg) {
        waitList.clickTableTwo(msg);
    }

    @Then("^I should verify the the \"([^\"]*)\" in the table layout screen \"([^\"]*)\"$")
    public void iShouldVerifyTheTheInTheTableLayoutScreen(String txtTable, String msg) {
        String text = waitList.getTxtPopup(txtTable,msg);
        Assert.assertEquals(txtTable,text);
    }

    @Then("^I should verify the the table \"([^\"]*)\" is in wait list or not \"([^\"]*)\"$")
    public void iShouldVerifyTheTheTableIsInWaitListOrNot(String txtCustomerName,String msg) {
        String text = waitList.getCustomerName(msg);
        Assert.assertNotEquals(txtCustomerName, text);
    }

    @And("^I select the color in the edit pop up \"([^\"]*)\"$")
    public void iSelectTheColorInTheEditPopUp(String msg) {
        waitList.clickColor(msg);
    }

    @Then("^I should verify the seats \"([^\"]*)\" in the table layout screen \"([^\"]*)\"$")
    public void iShouldVerifyTheSeatsInTheTableLayoutScreen(String seatNumber, String msg) {
        String text = waitList.getTxtPopup(seatNumber,msg);
        Assert.assertEquals(seatNumber,text);
    }

    @And("^I click Submit button on the Payment Window \"([^\"]*)\"$")
    public void iClickSubmitButtonOnThePaymentWindow(String msg) {
        waitList.clickBtnSubmit(msg);
    }

    @And("^I click \"([^\"]*)\" in the Popup \"([^\"]*)\"$")
    public void iClickInThePopup(String btnYes, String msg) {
        waitList.commonBtn(btnYes,msg);
    }

    @Then("^i should verify the \"([^\"]*)\" in the wait list screen \"([^\"]*)\"$")
    public void iShouldVerifyTheInTheWaitListScreen(String txtWaitList, String msg) {
        String text = waitList.getTxtPopup(txtWaitList,msg);
        Assert.assertEquals(txtWaitList,text);
    }

    @Then("^I should verify the screen it came back to \"([^\"]*)\" screen \"([^\"]*)\"$")
    public void iShouldVerifyTheScreenItCameBackToScreen(String txtWaitList, String msg) {
        String text = waitList.getTxtPopup(txtWaitList,msg);
        Assert.assertEquals(text,txtWaitList);
    }

    @Then("^I Should verify the edited notes \"([^\"]*)\" in the wait list \"([^\"]*)\"$")
    public void iShouldVerifyTheEditedNotesInTheWaitList(String txtEdited, String msg) {
        String text = waitList.getWaitList(txtEdited,msg);
        Assert.assertEquals(text,txtEdited);
    }

    @Then("^I Should verify whether the color changed in the wait list \"([^\"]*)\"$")
    public void iShouldVerifyWhetherTheColorChangedInTheWaitList(String msg) {
        waitList.getWaitListRow(msg);
    }

    @And("^I click \"([^\"]*)\" in the QSR drop down \"([^\"]*)\"$")
    public void iClickInTheQSRDropDown(String btnBarTab, String msg) {
        ciPaymentScreen.commonBtnClickOption(btnBarTab,msg);
    }

    @And("^I enter the \"([^\"]*)\" in the name field \"([^\"]*)\"$")
    public void iEnterTheInTheNameField(String name, String msg) {
        waitList.passNameField(name,msg);
    }

    @And("^I enter the \"([^\"]*)\" in the phone field \"([^\"]*)\"$")
    public void iEnterTheInThePhoneField(String phone, String msg) {
        waitList.passPhoneField(phone,msg);
    }

    @And("^I click the \"([^\"]*)\" in the Wait list Screen for new customer \"([^\"]*)\"$")
    public void iClickTheInTheWaitListScreenForNewCustomer(String btnEdit, String msg) throws InterruptedException {
        waitList.swipeList(btnEdit);
//        waitList.swipeListNew();
        waitList.commonBtn(btnEdit,msg);
    }

    @And("^I enter the \"([^\"]*)\" in the search field for new customer \"([^\"]*)\"$")
    public void iEnterTheInTheSearchFieldForNewCustomer(String btnName,String msg) {
        waitList.passNameFieldNew(btnName,msg);
    }

    @Then("^I should verify the \"([^\"]*)\" in the payment screen \"([^\"]*)\"$")
    public void iShouldVerifyTheInThePaymentScreen(String loyaltyPoints, String msg) {
        Assert.assertEquals(loyaltyPoints,ciPaymentScreen.commonGetText(loyaltyPoints,msg));
    }

    @And("^I click on the \"([^\"]*)\" in the Wait list Screen \"([^\"]*)\"$")
    public void iClickOnTheInTheWaitListScreen(String btnCancel, String msg) throws InterruptedException {
        waitList.swipeList(btnCancel);
//        waitList.swipeListNew();
        waitList.commonBtn(btnCancel,msg);
    }

    @When("^I get the check no in the order screen \"([^\"]*)\"$")
    public void iGetTheCheckNoInTheOrderScreen(String msg) {
        waitList.getCheckNumber(msg);
    }

    @Then("^I should see and select the closed check as \"([^\"]*)\"$")
    public void iShouldSeeAndSelectTheClosedCheckAs(String msg) throws Exception {
        waitList.passCheckNumber();
        utils.log().info(msg);
    }

    @Then("^I should see the Void check as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldSeeTheVoidCheckAs(String name, String msg) throws Exception {
        waitList.passCheckNumber();
        String value= ciCloseDayScreen.commonGetText(name,msg);
        Assert.assertEquals(name,value);
    }

    @And("^I click \"([^\"]*)\" in the addparty popup \"([^\"]*)\"$")
    public void iClickInTheAddpartyPopup(String btnCancel, String msg) {
        waitList.commonBtn(btnCancel,msg);
    }

    @Then("^I should verify the checks \"([^\"]*)\"$")
    public void iShouldVerifyTheChecks(String msg) {
        boolean value=waitList.getVoidCheck(msg);
        Assert.assertTrue(value);
    }
}

