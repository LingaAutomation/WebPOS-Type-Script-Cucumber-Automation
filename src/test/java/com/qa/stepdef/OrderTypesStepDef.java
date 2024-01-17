package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OrderTypesStepDef {

    @And("^I'm logged in$")
    public void i_m_logged_in() {
        new ClockInScreen().ClockIn();
    }

//    @When ("^I go to WebPOS$")
//    public void iGoToWebPos() throws InterruptedException {
//        new ClockInScreen().goToWebPOS();
//    }

    @Given ("^I'm logged in for clock-in required$")
    public void iMLoggedInForClockInRequired(){
        new ClockInScreen().ClockInForClockInRequired();
    }

    @And("^Enter the clock pin for clock-in required$")
    public void enterTheClockPinForClockInRequired(){
        new ClockInScreen().ClockInForClockInRequired1();
    }

    @Given ("^I'm logged in of multi role user for clock-in required$")
    public void iMLoggedInOfMultiRoleUserForClockinRequired(){
        new ClockInScreen().loggedInOfMultiRoleForClockInRequired();
    }

    @Given ("^I enter clock in pin$")
    public void iEnterClockInPin(){
        new ClockInScreen().clockinPin();
    }

    @Given ("^I enter clock in pin for Server Role$")
    public void iEnterClockInPinForServerRole(){
        new ClockInScreen().clockInPinForServerRole();
    }

    @Given ("^I enter clock in pin for Server Role1$")
    public void iEnterClockInPinForServerRole1(){
        new ClockInScreen().clockInPinForServerRole1();
    }

    @When ("^Enter the clock-out pin for server role$")
    public void enterTheClockOutPinForServerRole(){
        new ClockInScreen().clockOutPinForServerRole();
    }

    @When ("^Enter the clock-out pin for server role1$")
    public void enterTheClockOutPinForServerRole1(){
        new ClockInScreen().clockOutPinForServerRole1();
    }

    @And ("^I click operation button in the clock in screen$")
    public void iClickOperationButtonInTheClockInScreen(){
        new ClockInScreen().clickOperationButton();
    }

    @Then ("^I should see the operation screen$")
    public void iShouldSeeTheOperationScreen(){
        new ClockInScreen().verifyOperationScreen();
    }

    @Then ("^I should see clockin required to login popup$")
    public void iShouldSeeClockinRequiredToLoginPopip(){
        new ClockInScreen().ClockIsInRequiredForClockIn();
    }
    @And("^I select the order type FORHERE$")
    public void iSelectTheOrderTypeFORHERE() {
        new OrderTypeWindow().selectForHereOrderType();
    }


    @And("^I select the TOGO order type$")
    public void iSelectTheTOGOOrderType() {
        new OrderTypeWindow().selectToGoOrderType();
    }

    @And("^I select the DELIVERY order type$")
    public void iSelectTheDELIVERYOrderType() {
        new OrderTypeWindow().selectDeliveryOrderType();
    }

    @And("^I select the Phone To Go order type$")
    public void iSelectThePhoneToGoOrderType() {
        new OrderTypeWindow().selectPhoneToGoOrderType();
    }

    @And ("^I select service type as qsr$")
    public void iSelectServiceTypeAsQsr(){
        new OrderTypeWindow().selectQsrOrderType();
    }

    @And("^I select the Phone Delivery order type$")
    public void iSelectThePhoneDeliveryOrderType() {
        new OrderTypeWindow().selectPhoneDeliveryOrderType();
    }

    @When("^I click Done button to select the order type$")
    public void iClickDoneButtonToSelectTheOrderType() {
        new OrderTypeWindow().pressDoneBtn();
    }

    @And ("^I click service type button in order screen$")
    public void iClickServiceTypeButtonInOrderScreen(){
        new OrderTypeWindow().clickServiceTypeBtn();
    }

    @Then("^I should see the Customer Profile page with title \"([^\"]*)\"$")
    public void iShouldSeeTheCustomerProfilePageWithTitle(String title) {
        Assert.assertEquals(new CustomerProfileWindow().getTitle(), title);
    }

    @And("^I should see that \"([^\"]*)\" and \"([^\"]*)\" are added to the check$")
    public void iShouldSeeThatAndAreAddedToTheCheck(String menuItem, String modifier) {
        new OrderManagementScreen().verifyOrderedItemExists1(menuItem);
        new OrderManagementScreen().verifyOrderedItemExists(modifier);
    }

    @And("^I click Order button in the order management screen$")
    public void iClickOrderButtonInTheOrderManagementScreen() {
        new OrderManagementScreen().pressOrderBtn();
    }

    @And("^I click modifier as \"([^\"]*)\" on the order screen$")
    public void iClickModifierAsOnTheOrderScreen(String name) {
        new OrderManagementScreen().selectNoTomato(name);
    }

    @Then("^I should see Already sent to Kitchen warning pop-up$")
    public void iShouldSeeAlreadySentToKitchenWarningPopUp() {
        Assert.assertEquals(new OrderManagementScreen().getAlreadySentToKitchenPopUpTxt(), "Already sent to Kitchen" );
    }

    /****** already sent to Kitchen pop-up ******/

    @And("^I tap Done button at sent to Kitchen warning pop-up$")
    public void iTapDoneButtonAtSentToKitchenWarningPopUp() {
        new OrderManagementScreen().pressDoneAlreadySentToKitchen();
    }

    /****** Order Types ******/

    @And("^I tap QSR button to open the order types combo$")
    public void iTapQSRButtonToOpenTheOrderTypesCombo() {
        new OrderManagementScreen().selectQSRCombo();
    }

    @And ("^I tap dine in to open the order type$")
    public void iTapDineInToOpenTheOrderType(){
        new OrderManagementScreen().selectDineIn();
    }

    @And ("^I tap BarTab to open the order type$")
    public void iTapBarTabToOpenTheOrderType(){
        new OrderManagementScreen().selectBarTab();
    }

    @And ("^I tap To Go to open the order type$")
    public void iTapTogoToOpenTheOrderType(){
        new OrderManagementScreen().selectToGo();
    }

    @And ("^I tap Phone ToGo to open the order type$")
    public void iTapPhoneToGoOpenTheOrderType(){
        new OrderManagementScreen().selectPhoneToGo();
    }

    @And ("^I tap Delivery to open the order type$")
    public void iTapDeliveryToOpenTheOrderType(){
        new OrderManagementScreen().selectDelivery();
    }

    @And("^I select order type as QSR$")
    public void iSelectOrderTypeAsQSR() {
        new OrderManagementScreen().selectQSRCombo();
        new OrderManagementScreen().selectQSROrderType();
    }

    @And("^I select order type as \"([^\"]*)\"$")
    public void iSelectOrderTypeAs(String orderType) {
        new OrderManagementScreen().selectOrderType(orderType);
    }

    @And("^I should see that \"([^\"]*)\" is added to the check$")
    public void iShouldSeeThatIsAddedToTheCheck(String menuItem) {
        new OrderManagementScreen().verifyOrderedItemExists1(menuItem);
    }
    @And ("I click the Settings button")
    public void iClickTheSettingsButton(){ new BarTabScreen().pressSettings();}

    @And ("^I click 86List button in the operation window$")
    public void iClick86ListButtonInTheOperationWindow() throws InterruptedException {
        new OrderManagementScreen().click86ListButton();
    }

    @Then ("^I should see 86 list window$")
    public void iShouldSee86ListWindow() throws InterruptedException {
        new OrderManagementScreen().verify86ListWindow();
    }

    @And ("^I click search button in the 86 list window pass the menu as \"([^\"]*)\"$")
    public void iClickSearchButtonInThe86ListWindowPassTheMenuAs(String Menu){
        new OrderManagementScreen().clickSearchBtnIn86List(Menu);
    }
    @And ("I click the POS settings from Toggle")
    public void iClickThePOSSettingsFromToggle(){ new BarTabScreen().pressPOSset();}

    @And ("^I enable the required enable phone order tab on the POS settings screen$")
    public void iEnableTheRequiredEnablePhoneOrderTabOnThePosSettingsScreen() throws InterruptedException {
        new BarTabScreen().enableTheRequiredEnable();
    }
    @And("I click the Quick Bar Icon")
    public void iClickTheQuickBarIcon() throws Exception {new BarTabScreen().pressQuickBar();}

    @And("I click the Toggle Icon button")
    public void iClickTheToggleIconButton() throws InterruptedException {new BarTabScreen().pressToggleBtn();}

    @And ("I click POS Icon from Toggle")
    public void iClickPOSIconFromToggle(){new BarTabScreen().pressPOSIcon();}

    @When ("^I verify POS is enable or not$")
    public void iVerifyPosIsEnableOrNot(){
        new BarTabScreen().verifyPOSIsEnableOrNot();
    }
    @Then ("I should see that OrderScreen")
    public void iShouldSeeThatOrderScreen(){
        Assert.assertEquals(new OrderTypeWindow().visibleEmpty(),"Seats");}

    /****** BarTab ******/
    @Then("^I should see the Bar Tab screen and a new BarTab is created$")
    public void iShouldSeeTheBarTabScreenAndANewBarTabIsCreated() {
        new BarTabScreen().verifyBarTab1();
    }

    @Then ("^I should see that BarTab is open$")
    public void iShouldSeeThatBarTabIsOpen(){new BarTabScreen().verifyBarTabIsOpen();}

    @And ("^I click BarTab Layout$")
    public void iClickBarTabLayout() throws InterruptedException {new BarTabScreen().pressBarTabBtn();}

    @And ("^I click NewTab from BarTab Layout$")
    public void iClickNewTabFromBarTabLayout(){new BarTabScreen().pressNewTabBtn();}

    @And ("^I click the active check1 from Bartab Layout$")
    public void iClickTheActiveCheck1FromBarTabLayout(){new BarTabScreen().prsssCheck1();}

    @And ("^I click the active check2 from Bartab Layout$")
    public void iClickTheActiveCheck2FromBarTabLayout(){new BarTabScreen().pressCheck2();}

    @And ("^I click already selected Active Check$")
    public void iClickAlreadySelectedActiveChecks(){new BarTabScreen().pressCheck2();}

    @Then ("^I should see that OrderScreen with sales$")
    public void iShouldSeeThatOrderscreenWithSales() throws InterruptedException {
        new OrderTypeWindow().getOrderList();
    }
    @And ("^I click print button on the order screen$")
    public void iClickPrintButtonOnTheOrderScreen(){
        new OrderManagementScreen().pressPrintBtn();
    }

    @And ("^I should see the Discount amount reflected to the check as \"([^\"]*)\"$")
    public void iShouldSeeTheDiscountAmountReflectedToTheCheckAs(String name){
        new OrderManagementScreen().checkDiscountValue(name);
    }
    @Then ("^I should see the Gratuity amount reflected to the check as \"([^\"]*)\"$")
    public void iShouldSeeTheGratuityAmountReflectedToTheCheckAs(String name){
        new OrderManagementScreen().checkGratuityValue(name);
    }
    @Then ("^I should see orderscreen with as Onion Rings EACH$")
    public void iShouldSeeOrderscreenWithAsOnionRingsEach() throws InterruptedException {
        Assert.assertEquals(new OrderManagementScreen().OnionRingsEachMenu(),"(F)Onion Rings EACH");
    }

    @Then ("^I should see orderscreen with as Dosa EACH$")
    public void iShouldSeeOrderScreenWithAsDosaEach(){
        Assert.assertEquals(new OrderManagementScreen().dosaEach(),"(F) Dosa EACH");
    }
    @Then ("^I should see discount as \"([^\"]*)\" on the order screen$")
    public void iShouldSeeDiscountAsOnTheOrderScreen(String num){
        new OrderManagementScreen().discountName(num);
    }

    @Then ("^I should see discount as \"([^\"]*)\" on the order screen for least expensive$")
    public void iShouldSeeDiscountAsOnTheOrderScreenFor(String name){
        new OrderManagementScreen().LeastDiscount(name);
    }

    @Then ("^I should see discount as \"([^\"]*)\" on the order screen for most expensive$")
    public void ishouldSeeDiscountAsOnTheOrderScreenForMostExpensive(String name){
        new OrderManagementScreen().mostDiscount(name);
    }

    @And ("^I click Later check box$")
    public void iClickLaterCheckBox(){
        new OrderManagementScreen().ClickLaterCheckBoxBtn();
    }

    @And ("^I click done button in the order type window$")
    public void iClickDoneButtonInTheOrderTypeWindow(){
        new OrderManagementScreen().clickDoneButtonTypeWindow();
    }

    @And ("^I select the Phone To Go Service type$")
    public void iSelectThePhoneToGoServiceType(){
        new OrderTypeWindow().selectPhoneToGoServiceType(); //Added Today
    }

    @And ("^I select the Phone Delivery Service type$")
    public void iSelectThePhoneDeliveryServiceType(){
        new OrderTypeWindow().selectPhoneDeliveryServiceType();//Added Today
    }
    //new (nov12)
    @Then ("^I should see the bar tab screen$")
    public void iShouldSeeTheBarTabScreen(){
        Assert.assertEquals(new BarTabScreen().verifyBarTabScreen(),"BarTab");
    }

    @And ("^I select order type as QSR in order screen$")
    public void iSelectOrderTypeAsQsrInOrderScreen(){
        new OrderManagementScreen().selectQSRCombo();
    }

    @And("I select order type as {string} method")
    public void iSelectOrderTypeAsMethod(String arg0) throws InterruptedException {
        new OrderManagementScreen().selectOrderTypeMethod();
    }

    @And ("^I select service type as \"([^\"]*)\" on the order screen$")
    public void iSelectServiceTypeAsOnTheOrderScreen(String type){
        new OrderTypeWindow().selectServiceTypeAs(type);
    }

    @And ("^I click the active check from bar tab$")
    public void iClickTheActiveCheckFromBarTab() throws InterruptedException {
        new BarTabScreen().clickBarTabCheck();
    }
    @And ("^I click the active check from bar tab1$")
    public void iClickTheActiveCheckFromBarTab1() throws InterruptedException {
        new BarTabScreen().clickBarTabCheck1();
    }
    @When ("^I get he Bussiness date from the order screen$")
    public void iGetHeBussinessDateFromTheOrderScreen(){
        new ClockInScreen().getBussinessDate();
    }

    @When ("^I verify bussiness date with close day screen$")
    public void iVerifyBussinessDateWithCloseDayScreen(){
        new ClockInScreen().verifyBussinessDateWithCloseDayScreen();
    }

    @When ("^I click qsr button from the pos settings window$")
    public void iClickQsrButtonFromThePosSettingsWindow() throws Exception {
        new ClockInScreen().clickQsrButton();
    }

    @Then ("^I should see QSR service is disabled in POS settings popup$")
    public void iShouldSeeQsrServiceIsDisabledInPosSettingsPopup(){
        new ClockInScreen().verifyQsrServiceIsDisabled();
    }

    @And ("^I click Bartab button from pos settings window$")
    public void iClickBarTabButtonFromPosSettingsWindow() throws Exception {
        new ClockInScreen().clickBarTabButton();
    }

    @And ("^I click Dine-In from pos settings window$")
    public void iClickDineInFromPosSettingsWindow() throws Exception {
        new ClockInScreen().clickDineInButtonInPOSSettings();
    }
    @Then ("^I should see Bartab service is disabled in POS settings popup$")
    public void iShouldSeeBarTabServiceIsDisabledInPosSettingsPopup(){
        new ClockInScreen().verifyBarTabServiceIsDisabled();
    }

    @When ("^Enter the clock-in pin for server and Manager role$")
    public void enterTheClockInPinForServerAndManagerRole(){
        new ClockInScreen().enterClockInForServerManagerRole();
    }

    @Then ("^I should see dine-In service is disabled in POS settings popup$")
    public void iShouldSeeDineInServiceIsDisableInPosSettingsPopup(){
        new ClockInScreen().verifyDineInServiceIsDisabled();
    }

    @And ("^I click cash drop from Till settings$")
    public void iClickCashDropFromTillSettings() throws InterruptedException {
        new TillManagementScreen().clickCashDropFromTillSettings();
    }

    @And ("^I click till management button from the operation window$")
    public void iClickTillManagementButtonFromTheOperationWindow(){
        new TillManagementScreen().clickTheTillManagement();
    }

    @When ("^I click cash drop button from the till window$")
    public void iClickCashDropButtonFromTheTillWindow(){
        new TillManagementScreen().clickTheCashDropBtn();
    }



        @Given("^User click All button in QSR$")
        public void userClickAllButtonInQSR() {
            new CheckAndItemTransfer().clickTheAllButtonInQSRScreen();
        }

        @When("^User click the Table Layout option$")
        public void userClickTheTableLayoutOption() {
            new CheckAndItemTransfer().clickTheTableLayoutButton();
        }

        @And("^User select the two Empty table and take the order$")
        public void userSelectTheEmptyTableFromTheList() throws InterruptedException {
            for(int i = 1; i<= 2; i++)
            {
                new CheckAndItemTransfer().clickTheEmptyTableFromTheListOfTable();
                Thread.sleep(3000);
                new CheckAndItemTransfer().selectTheNumberOfSeatAndClickContinue();
                Thread.sleep(3000);
                new CheckAndItemTransfer().selectTheMenuRandomly();
            }

        }

        @And("^User select the Transfer button$")
        public void userSelectTheTransferButton() {
            new CheckAndItemTransfer().selectTheTransferOption();
        }

        @And("^User verify Transfer to Server, Transfer to Table and Transfer Item are displayed$")
        public void userVerifyTransferToServerTransferToTableTransferItemAreDisplayedOrNot() {
            Assert.assertEquals("Transfer to Server",new CheckAndItemTransfer().verifyTransferToServerBtnInTransferWindow());
            Assert.assertEquals("Transfer to Table", new CheckAndItemTransfer().verifyTransferToTableBtnInTransferWindow());
            Assert.assertEquals("Transfer Item",new CheckAndItemTransfer().verifyTransferItemBtnInTransferWindow());
        }

        @And("^User select the Transfer Item Option$")
        public void userSelectTheTransferItemOption() {
            new CheckAndItemTransfer().selectTheTransferItemBtn();
        }

        @Then("^Select anyone Check from the Transfer From Table$")
        public void selectAnyoneCheckFromTheTransferFromTable() {
            new CheckAndItemTransfer().selectTheFirstTableFromTheTransferFromTable();
        }

        @When ("^I select check for transferred$")
        public void iSelectCheckForTransferred() throws InterruptedException {

        new CheckAndItemTransfer().selectTheCheckForTransfer();
        }

    @When ("^I select check for transferred1$")
    public void iSelectCheckForTransferred1() throws InterruptedException {

        new CheckAndItemTransfer().selectTheCheckForTransfer1();
    }

        @And("^Select the required menu item from the Menu Item Table$")
        public void selectTheRequiredMenuItemFromTheMenuItemTable() {
            new CheckAndItemTransfer().selectTheFirstOptionFromTheMenuItemTable();
        }

        @Then("^Select anyone Check from the Transfer To Table$")
        public void selectAnyoneCheckFromTheTransferToTable() {
            new CheckAndItemTransfer().selectTheFirstTableFromTheTransferToTable();
        }

        @And("^Click the Done button$")
        public void clickTheDoneButton() {
            new CheckAndItemTransfer().clickTheDoneBtn();
        }

        @And("^Verify the Successful message of Transfer Item$")
        public void verifyTheSuccessfulMessageOfTransferItem() {
            Assert.assertEquals("Transferred check success.",new CheckAndItemTransfer().getTheSuccessmessage());
        }

        @Then ("^I should see the all the menu items will be transferred popup$")
        public void iShouldSeeTheAllTheMenuItemsWillBeTransferredPopup(){
//                 new CheckAndItemTransfer.should
        }

        @When ("^I click transferred table after done transfer process$")
        public void iClickTransferredTableAfterDoneTransferProcess() throws InterruptedException {
        new CheckAndItemTransfer().clickTheTransferredTable();
        }
        @And("^Click the Transferred from table$")
        public void clickTheTransferredFromTable() throws InterruptedException {
            new CheckAndItemTransfer().clickTheFromTableFromTheListOfTables();
            Thread.sleep(3000);
        }

        @Then("^Verify the Transferred menu item is available or not in the sending table$")
        public void verifyTheTransferredMenuItemIsAvailableOrNotInTheSendingTable() {
            new CheckAndItemTransfer().verifyTheMenuItemInTheSendingTable();
        }

        @And("^Click the finish button$")
        public void clickTheFinishButton() {
            new CheckAndItemTransfer().clickTheFinishButton();
        }

        @And("^Click the Transferred To table$")
        public void clickTheTransferredToTable() {
            new CheckAndItemTransfer().clickTheToTableFromTheListOfTables();
        }

        @Then("^Verify the Transferred menu item is available or not in the receiving table$")
        public void verifyTheTransferredMenuItemIsAvailableOrNotInTheReceivingTable() {
            new CheckAndItemTransfer().verifyTheMenuItemInTheReceivingTable();
        }

        @Then ("^I verify the Transferred menu item is available on the selected transferred table$")
        public void iVerifyTheTransferredMenuItemIsAvailableOnTheSelectedTransferredTable(){
        new CheckAndItemTransfer().verifyTheMenuItemInOrderScreenAfterTransferDone();
        }
        @And("^User select the Transfer to Table Option$")
        public void userSelectTheTransferToTableOptions() {
            new CheckAndItemTransfer().clickTheTransferredToTableOption();
        }

        @Then("^Select anyone Table from the Transfer From Table$")
        public void selectAnyoneTableFromTheTransferFromTable() {
            new CheckAndItemTransfer().selectTheTransferToTableFromTheTransferFromTable();
        }

        @Then("^Select anyone Table from the Transfer To Table$")
        public void selectAnyoneTableFromTheTransferToTable() {
            new CheckAndItemTransfer().selectTheFirstTableforTransferChecksFromTheTransferToTable();
        }

        @And("^Verify the Successful message of Transfer To Table$")
        public void verifyTheSuccessfulMessageOfTransferToTable() {
            Assert.assertEquals("Transferred Successfully",new CheckAndItemTransfer().getTheSuccessmessageForTransferToTable());
        }

        @And("^Check the Transferred from table$")
        public void checkTheTransferredFromTable() {
            new CheckAndItemTransfer().verifyTheCheckTransferredToTheCorrespondingTableOrNotFromTheBeginningTable();
        }

        @Then("^Verify the receiving table it should contain more than one table$")
        public void verifyTheReceivingTableItShouldContainMoreThanOneTable() {
            new CheckAndItemTransfer().verifyTheCheckTransferredToTheCorrespondingTableOrNotToTheReceivingTable();
        }

        @And("^Click the close button$")
        public void clickTheCloseButton() {
            new CheckAndItemTransfer().clickTheCloseBtn();
        }

        @And("^User select the Empty table and take the order$")
        public void userSelectTheEmptyTableAndTakeTheOrder() throws InterruptedException {
            new CheckAndItemTransfer().clickTheEmptyTableFromTheListOfTable();
            Thread.sleep(3000);
            new CheckAndItemTransfer().selectTheNumberOfSeatAndClickContinue();
            Thread.sleep(3000);
            new CheckAndItemTransfer().selectTheMenuRandomly();
        }

        @And("^User select the Transfer to Server Option$")
        public void userSelectTheTransferToServerOption() {
            new CheckAndItemTransfer().clickTheTransferredToServerOption();
        }

        @And("^Get the Server Name from The required Table$")
        public void getTheServerNameFromTheRequiredTable() {
            new CheckAndItemTransfer().getTheServerFromTheTable();
        }

        @Then("^Select correct server from the Transfer From Table$")
        public void selectCorrectServerFromTheTransferFromTable() throws InterruptedException {
            new CheckAndItemTransfer().selectTheRequiredServerFromTheListOfServersTableFrom();
        }

        @And("^Select the required check from the Checks Table$")
        public void selectTheRequiredCheckFromTheChecksTable() {
            new CheckAndItemTransfer().selectTheFirstCheckFromTheCheckTable();
        }

    @And("^Select the required check from the Checks Table for Transfer Server$")
    public void selectTheRequiredCheckFromTheChecksTableForTransferServer() throws InterruptedException {
        new CheckAndItemTransfer().selectThecheckFromTheTransferServer();
    }

        @Then("^Select anyone server from the Transfer To Table$")
        public void selectAnyoneServerFromTheTransferToTable() throws InterruptedException {
            new CheckAndItemTransfer().selectTheTransferredToServerFromTheListOfTransferTo();
        }

        @And("^Verify the Successful message of Transfer To Server$")
        public void verifyTheSuccessfulMessageOfTransferToServer() {
            Assert.assertEquals("Transferred Successfully",new CheckAndItemTransfer().getTheSuccessmessageForTransferToTable());
        }

        @Then("^Verify the server name is available or not in the required table$")
        public void verifyTheServerNameIsAvailableOrNotInTheRequiredTable() {
            new CheckAndItemTransfer().verifyTheTransferredToServer();
        }

        @And("^Close all the active checks$")
        public void closeAllTheActiveChecks(){
            new CheckAndItemTransfer().closeTheActiveChecks();
        }

}

