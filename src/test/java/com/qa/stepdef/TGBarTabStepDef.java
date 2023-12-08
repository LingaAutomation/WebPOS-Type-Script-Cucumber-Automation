package com.qa.stepdef;

import com.qa.pages.TGBarTab;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.*;

public class TGBarTabStepDef {

    TGBarTab barTab=new TGBarTab();

    @When("User click new tab on Bar tab")
    public void userClickNewTabOnBarTab() {
        barTab.clickNewTab();
    }

    @When("User click Transfer option on Bar tab")
    public void userClickTransferOptionOnBarTab() {
        barTab.clickTransferBarTabButton();
    }

    @When("User select Split option on Bar tab")
    public void userSelectSplitOptionOnBarTab() {
        barTab.clickSplitButton();
    }

    @Then("User select split by seat option")
    public void userSelectSplitBySeatOption() {
        barTab.clickSplitBySeat();
    }

    @And("User select first bar tab order")
    public void userSelectFirstBarTabOrder() {
        barTab.selectFirstBarTabOrder();
    }

    @When("User click split evenly option")
    public void userClickSplitEvenlyOption() {
        barTab.clickSplitEvenlyBarTab();
    }

    @When("User click Merge option on bar tab")
    public void userClickMergeOptionOnBarTab() {
        barTab.clickMergeBarTabButton();
    }

    @And("User click done button for merge")
    public void userClickDoneButtonForMerge() {
        barTab.clickMergeDoneButton();
    }

    @When("User click Pay Check option")
    public void userClickPayCheckOption() {
        barTab.clickPayCheckBarTabButton();
    }

    @Then("User select bar tab check")
    public void userSelectBarTabCheck() {
        barTab.clickFirstBarTabCheck();
    }

    @And("User verify All Tab option on Bar Tab")
    public void userVerifyAllTabOptionOnBarTab() {
        barTab.verifyAllTabIcon();
    }

    @And("User verify Seated option on Bar Tab")
    public void userVerifySeatedOptionOnBarTab() {
        barTab.verifySeatedIcon();
    }

    @And("User verify Check Down option on Bar Tab")
    public void userVerifyCheckDownOptionOnBarTab() {
        barTab.verifyCheckDownIcon();
    }

    @And("User verify On Hold option on Bar Tab")
    public void userVerifyOnHoldOptionOnBarTab() {
        barTab.verifyOnHoldIcon();
    }

    @And("User verify Expired option on Bar Tab")
    public void userVerifyExpiredOptionOnBarTab() {
        barTab.verifyExpiredIcon();
    }

    @And("User verify be directed bar tab page")
    public void userVerifyBeDirectedBarTabPage() {
        barTab.verifyDirectedBarTab();
    }

    @And("User verify be directed bar tab screen")
    public void userVerifyBeDirectedBarTabScreen() {
        barTab.verifyDirectedBarTab();
    }

    @When("User click sort A-Z button on bar tab")
    public void userClickSortAZButtonOnBarTab() {
        barTab.clickSortAtoZButton();
    }

    @When("User click sort Z-A button on bar tab")
    public void userClickSortZAButtonOnBarTab() {
        barTab.clickSortZtoAButton();
    }

    @Then("User enter customer name on bar tab search textfield")
    public void userEnterCustomerNameOnBarTabSearchTextfield() {
        barTab.enterCustomerNameForSearch();
    }

    @And("User verify searched customer name")
    public void userVerifySearchedCustomerName() {
        barTab.verifySearchCustomerName();
    }

    @Then("User enter check number on bar tab search textfield")
    public void userEnterCheckNumberOnBarTabSearchTextfield() {
        barTab.checkNumberOnBarTabSearchTextfield();
    }

    @When("User click searched bar tab order")
    public void userClickSearchedBarTabOrder() {
        barTab.clickSearchedBarTabOrder();
    }

    @And("User verify last bar tab order")
    public void userVerifyLastBarTabOrder() {
        barTab.verifyLastBarTabOrder();
    }

    @Then("User verify hold menu item")
    public void userVerifyHoldMenuItem() {
        barTab.verifyHoldBarTabOrder();
    }

    @And("User verify expired order")
    public void userVerifyExpiredOrder() {
        barTab.verifyExpiredBarTabOrder();
    }

    @Then("User verify bar tab orders from A to Z")
    public void userVerifyBarTabOrdersFromAToZ() {
        barTab.verifyBarTabOrdersSortedFromAToZ();
    }

    @Then("User verify bar tab orders from Z to A")
    public void userVerifyBarTabOrdersFromZToA() {
        barTab.verifyBarTabOrdersSortedFromZToA();
    }

    @And("User verify last customer name as floating on bar tab")
    public void userVerifyLastCustomerNameAsFloatingOnBarTab() {
        barTab.verifyLastCustomerNameOnBarTab();
    }

    @And("User verify updated customer name")
    public void userVerifyUpdatedCustomerName() {
        barTab.verifyLastUpdatedBarTabOrder();
    }

    @When("User verify search name and check number textfield on bar tab")
    public void userVerifySearchNameAndCheckNumberTextfieldOnBarTab() {
        barTab.verifyBarTabSearchTextField();
    }

    @When("User select last bar tab check")
    public void userSelectLastBarTabCheck() {
        barTab.selectLastBarTabCheck();
    }

    @When("User select first bar tab check")
    public void userSelectFirstBarTabCheck() {
        barTab.selectFirstBarTabCheck();
    }

    @And("User close delete discount info popup")
    public void userCloseDeleteDiscountInfoPopup() {
        barTab.closeDeleteDiscountInfoPopup();
    }

    @Then("User confirm merge checks confirmation popup")
    public void userConfirmMergeChecksConfirmationPopup() {
        barTab.confirmMergeChecksConfirmationPopup();
    }

    @When("User click searched last bar tab order")
    public void userClickSearchedLastBarTabOrder() {
        barTab.clickSearchedLastBarTabOrder();
    }

    @When("User click cancel button for customer name popup")
    public void userClickCancelButtonForCustomerNamePopup() {
        barTab.clickCancelButtonForCustomerNamePopup();
    }

    @When("User select first Bar Tab order on BarTab order tab")
    public void userSelectFirstBarTabOrderOnBarTabOrderTab() {
        barTab.selectFirstBarTabOrderOnBarTabOrderTab();
    }

    @And("User click last BarTab order type check")
    public void userClickLastBarTabOrderTypeCheck() {
        barTab.clickLastBarTabOrderTypeCheck();
    }


    @Then("User select first order which is merge")
    public void userSelectFirstOrderWhichIsMerge() {
        barTab.selectFirstOrderWhichIsMerge();
    }

    @And("User select second order which is merge")
    public void userSelectSecondOrderWhichIsMerge() {
        barTab.selectSecondOrderWhichIsMerge();
    }

    @And("User verify merge success message")
    public void userVerifyMergeSuccessMessage() {
        barTab.verifyMergeSuccessMessage();
    }

    @Then("User select merged check on BarTab")
    public void userSelectMergedCheckOnBarTab() {
        barTab.selectMergedCheckOnBarTab();
    }

    @And("User click remove discount option")
    public void userClickRemoveDiscountOption() {
        barTab.clickRemoveDiscountOptionOnBarTab();
    }


    @When("User click Split button on Bar tab")
    public void userClickSplitButtonOnBarTab() {
        barTab.clickSplitButtonOnBarTab();
    }

    @Then("User select order which is split")
    public void userSelectOrderWhichIsSplit() {
        barTab.selectOrderWhichIsSplit();
    }

    @Then("User select remainder order")
    public void userSelectRemainderOrder() {
        barTab.selectRemainderOrder();
    }

    @And("User select second bar tab check")
    public void userSelectSecondBarTabCheck() {
        barTab.selectSecondBarTabCheck();
    }

    @Then("User click yes button in Bar Tab")
    public void userClickYesButtonInBarTab() {
        barTab.clickYes();
    }
}
