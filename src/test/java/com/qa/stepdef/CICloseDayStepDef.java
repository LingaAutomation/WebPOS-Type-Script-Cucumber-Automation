package com.qa.stepdef;

import com.qa.pages.*;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class CICloseDayStepDef {

    CICloseDayScreen ciCloseDayScreen = new CICloseDayScreen();
    CIPaymentScreen ciPaymentScreen=new CIPaymentScreen();

    @Given("^I enter the Pin number as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterThePinNumberAs(String pin1, String pin2, String pin3, String pin4) {
        ciPaymentScreen.pressPercentagePin(pin1, pin2, pin3, pin4);
    }

    @And("^I click the operation button in the login screen \"([^\"]*)\"$")
    public void iClickOnInTheLoginPage(String msg) {
        new CICloseDayScreen().clickBtnOperation(msg);
    }

    @And("^I click the operation button in the login screen$")
    public void iClickTheOperationButtonInTheLoginScreen() {
        new CICloseDayScreen().clickBtnOperation();
    }

    @When ("^I click the 86 list button in the operation screen$")
    public void iClickThe86ListButtonInTheOperationScreen() throws InterruptedException {
        new CICloseDayScreen().clickThe86ListButton();
    }


    @And("^I click the \"([^\"]*)\" in the operation screen\"([^\"]*)\"$")
    public void iClickTheInTheOperationScreen(String closeDay, String msg) {
        new CICloseDayScreen().commonAccessibilityId(closeDay, msg);
    }

    @And("^I click the Till Management \"([^\"]*)\" in the operation screen$")
    public void iClickTheTillManagementInTheOperationScreen(String tillMangement) throws InterruptedException {
        new CIPaymentScreen().clickTillManagement(tillMangement);
    }

    @Then("^I should verify the value Net Sale of \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheValueNetSaleOf(String txtTotal, String msg) throws InterruptedException {
       new CICloseDayScreen().getTxtTotalNetSale(txtTotal, msg);
    }

    @And("^I should verify the value of Gross Sale \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheGrossSaleShouldDisplayValue(String txtSale, String msg) {
      new CICloseDayScreen().getTxtGrossSale(txtSale, msg);
    }

    @And("^I should verify the value of Gross Sale1 \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheGrossSale1ShouldDisplayValue(String txtSale, String msg) {
        new CICloseDayScreen().getTxtGrossSale1(txtSale, msg);
    }

    @And("^I should verify the value of New Customer \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheNewCustomerShouldDisplayValue(String txtCustomer, String msg) {
       new CICloseDayScreen().getTxtNewCustomer(txtCustomer, msg);
    }

    @And("^I should verify the value of All Employees \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheAllEmployeesShouldDisplayValue(String txtEmployees, String msg) {
new CICloseDayScreen().getTxtAllEmployees(txtEmployees,msg);
    }

    @When("^I click the Close the day button in the operation screen \"([^\"]*)\" \"([^\"]*)\"$")
    public void iClickTheCloseTheDayButtonInTheOperationScreen(String name, String msg) {
        new CICloseDayScreen().btnCloseTheDay(name, msg);
    }

    @When("^I click the Close the day button in the operation screen$")
    public void iClickTheCloseTheDayButtonInTheOperationScreen() throws InterruptedException {
        new CICloseDayScreen().closeTheDayBtn();
    }

    @Then ("^I should see do you want to close the day popup$")
    public void iShouldSeeDoYouWantToCloseTheDayPopup() throws InterruptedException {
        new TableLayOutScreen().shouldSeeDoYouWantToCloseTheDayPopup();
    }

    @When ("^I click yes button on the do you want close the day popup$")
    public void iClickYesButtonOnTheDoYouWantCloseTheDayPopup() throws InterruptedException {
        new TableLayOutScreen().clickYesBtn();
    }

    @When ("^I click the submit button the close the day checklist$")
    public void iClickTheSubmitButtonTheCloseTheDayChecklist() throws InterruptedException {
        new TableLayOutScreen().clickSubmitBtn();
    }

    @When ("^I should see close day performed successfully popup$")
    public void iShouldSeeCloseDayPerformedSuccessfullyPopup() throws InterruptedException {
        new TableLayOutScreen().shouldSeeCloseDayPerformedSuccessPopup();
    }

    @And("^I click \"([^\"]*)\" in the close the day Popup window \"([^\"]*)\"$")
    public void iClickInTheCloseTheDayPopoupWindow(String btnYes, String msg) {
        new CIPaymentScreen().commonBtnClick(btnYes, msg);
    }

    @And("^I click Cashier text in the close the day checklist screen \"([^\"]*)\"$")
    public void iClickCashierTextInTheCloseTheDayChecklistScreen(String msg) throws InterruptedException {
        new CICloseDayScreen().clickTxtCashier(msg);
    }

    @And("^I click Goknur Bati in the active cashiers screen \"([^\"]*)\"$")
    public void iClickGoknurBatiInTheActiveCashiersScreen(String msg) throws InterruptedException {
        new CICloseDayScreen().clickTxtGoknur(msg);
    }

    @When("^I should not see open cashier in the close day checklist$")
    public void iShouldNotSeeOpenCashierInTheCloseDayChecklist(){
        new CICloseDayScreen().shouldNotSeeOpenCashierPopup();
    }

    @When("^I click Cashier Out button \"([^\"]*)\" in the active cashiers screen \"([^\"]*)\"$")
    public void iClickInTheActiveCashiersScreen(String btnChrOut, String msg) {
        new CICloseDayScreen().clickBtnCashier(btnChrOut, msg);
    }

    @And("^I click Cancel in the Active cashier screen \"([^\"]*)\"$")
    public void iClickCancelInTheActiveCashierScreen(String msg) {
        new CICloseDayScreen().clickPopupBtnCancel(msg);
    }

    @Then("^I should verify the \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyThe(String btnZeroCashier, String msg) throws InterruptedException {
        Assert.assertEquals(new CICloseDayScreen().getZeroOpenCashier(btnZeroCashier,msg), btnZeroCashier);
    }

    @Then("^I should verify the employee name \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheEmployeeName(String txtEmployee, String msg) throws InterruptedException {
new CICloseDayScreen().commonGetText(txtEmployee,msg);
    }

    @And("^I click the \"([^\"]*)\" in the close the day screen \"([^\"]*)\"$")
    public void iClickTheInTheCloseTheDayScreen(String btnCloseCashier, String msg) {
        new CIPaymentScreen().commonBtnClick(btnCloseCashier, msg);
    }

    @And("^I click \"([^\"]*)\" in the close the day screen \"([^\"]*)\"$")
    public void iClickInTheCloseTheDayScreen(String btnToggleIcon, String msg) {
        new CIPaymentScreen().commonBtnClick(btnToggleIcon, msg);
    }

    @And("^I click print button in the Close the day screen \"([^\"]*)\"$")
    public void iClickPrintButtonInTheCloseTheDayScreen(String msg) {
        new CICloseDayScreen().clickBtnPrint(msg);
    }

    @Then("^I should verify the Report of\"([^\"]*)\"\"([^\"]*)\"$")
    public void iShouldVerifyTheReportOf(String txtSales, String msg) {
        new CICloseDayScreen().getTxtCustomer(txtSales, msg);
    }

    @And("^I click the menu item for void the item \"([^\"]*)\"$")
    public void iClickTheMenuItemForSelectingTheDiscount(String msg) {
        new CICloseDayScreen().clickTxtMenuItem(msg);
    }

    @And("^I click the \"([^\"]*)\" in the operation screen employee \"([^\"]*)\"$")
    public void iClickTheInTheOperationScreenEmployee(String downArrow, String msg) {
        new CIWaitListPage().commonBtn(downArrow, msg);
    }

    @And("^I click Goknur B in the employee drop down \"([^\"]*)\"$")
    public void iClickGoknurBInTheEmployeeDropDown(String msg) {
        new CICloseDayScreen().clickGoknur(msg);
    }

    @Then("^I click the \"([^\"]*)\" in the employees list \"([^\"]*)\"$")
    public void iClickTheInTheEmployeesList(String employee, String msg) throws InterruptedException {
        new CIPaymentScreen().commonBtnClickOption(employee, msg);
    }

    @When ("^I click x button employee$")
    public void iClickXButtonEmployee(){
        new CIPaymentScreen().clickXBtn();
    }

    @Then ("^I click generate button$")
    public void iClickGenerateButton(){
        new CICloseDayScreen().clickGenerateBtn();
    }
    @Then("^It should show the \"([^\"]*)\" as \"([^\"]*)\"$")
    public void itShouldShowTheAs(String employee, String msg) throws InterruptedException {
      new CICloseDayScreen().commonGetText(employee, msg);
    }

    @Then("^I should verify the cash record in the sale recap after creating sale \"([^\"]*)\"$")
    public void iShouldVerifyTheCashRecordInTheSaleRecapAfterCreatingSale(String cashVal) throws Exception {
        new CICloseDayScreen().getCashValue(cashVal);
    }

    @Then("^I should verify the value of Credit card as Zero \"([^\"]*)\"$")
    public void iShouldVerifyTheValueOfCreditCardAs(String creditCard) {
        new CICloseDayScreen().getTxtCreditCard(creditCard);
    }

    @Then("^I should verify the Gift card value after creating sale \"([^\"]*)\"$")
    public void iShouldVerifyTheGiftCardValueAfterCreatingSale(String GiftCardAft) {
        new CICloseDayScreen().getGiftCardValue(GiftCardAft);
    }

    @Then("^I should verify the gratuity value \"([^\"]*)\"$")
    public void iShouldVerifyTheGratuityValue(String gratuityVal) {
        new CICloseDayScreen().getGratuityValue(gratuityVal);
    }

    @Then("^It should show the Gross Receipt as \"([^\"]*)\" \"([^\"]*)\"$")
    public void itShouldShowTheGrossReceiptAs(String grossReceipt, String msg) throws InterruptedException {
        new CICloseDayScreen().getGrossRceipt(grossReceipt,msg);
    }

    @Then("^It should show the Gross Sale \"([^\"]*)\" as \"([^\"]*)\"$")
    public void itShouldShowTheGrossSaleAs(String grossSale, String msg) throws InterruptedException {
        new CICloseDayScreen().getGrossSales(grossSale,msg);
    }

    @Then("^It should show the Net Sale \"([^\"]*)\" as \"([^\"]*)\"$")
    public void itShouldShowTheNetSaleAs(String netSale, String msg) {
        Assert.assertEquals(new CICloseDayScreen().getNetSales(msg),netSale);
    }

    @Then("^I should verify the net sale in the sale recap\"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldNetSaleValueInSaleRecapReport(String txtNetSaleValue, String msg) throws InterruptedException {
     new CICloseDayScreen().getNetSaleValue(txtNetSaleValue,msg);
    }

    @Then("^I should verify the value of \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheValueOf(String txtVoidNetSale,String msg) throws InterruptedException {
        new CICloseDayScreen().getTxtNetSale(txtVoidNetSale,msg);
    }

    @Then("^I should verify the net void in the sale recap after creating sale\"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheNetVoidInTheSaleRecapAfterCreatingSale(String txtNetVoidValue, String msg) {
       new CICloseDayScreen().getNetVoidValue(txtNetVoidValue,msg);
    }

    @Then("^I should verify the tax exempt in sale recap report before creating sale \"([^\"]*)\"$")
    public void iShouldVerifyTheTaxExemptInSaleRecapReportBeforeCreatingSale(String initalTaxExp) {
        new CICloseDayScreen().getInitialTaxExemptValue(initalTaxExp);
    }

    @Then("^I should verify the Tax exempt amount in sale recap report \"([^\"]*)\"$")
    public void iShouldVerifyTheTaxExemptAmountInSaleRecapReport(String initialTaxExempt) throws InterruptedException {
        new CICloseDayScreen().getTaxExcemptValue(initialTaxExempt);
    }

    @Then("^I should verify the value of the \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheValueOfThe(String txtInitialGrossVoid,String msg) throws InterruptedException {
        new CICloseDayScreen().getInitialGrossVoid(txtInitialGrossVoid,msg);
    }

    @Then("^I should verify the value Net void of the \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheValueNetVoidOfThe(String txtInitialGrossVoid,String msg) {
        new CICloseDayScreen().getNetVoidValue(txtInitialGrossVoid,msg);
    }

    @Then("^I should verify the gross void value in the sale recap after creating sale\"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheGrossVoidValueInTheSaleRecapAfterCreatingSale(String txtGrossVoidValue, String msg) throws InterruptedException {
      new CICloseDayScreen().getGrossVoidValue(txtGrossVoidValue,msg);
    }

    @Then("^I should verify the initial Gross sale value as\"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheInitialGrossSaleValueAs(String txtInitialGrossSale, String msg) throws InterruptedException {
      new CICloseDayScreen().getInitialGrossSale(txtInitialGrossSale,msg);
    }

    @Then("^I should verify the initial Grand sale value as\"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheInitialGrandSaleValueAs(String txtInitialGrandSale, String msg) throws InterruptedException {
        new CICloseDayScreen().getInitialGrandSale(txtInitialGrandSale, msg);
    }


    @Then("^I should verify the value of Paid In amount in sale recap report \"([^\"]*)\"$")
    public void iShouldVerifyTheValueOfPaidOutAmountInSaleRecapReport(String initialPaidIn) throws InterruptedException {
        new CICloseDayScreen().getPaidInAmountValue(initialPaidIn);
    }

    @Then("^I should verify the value of Paid Out amount in sale recap report \"([^\"]*)\"$")
    public void iShouldVerifyTheValueOfPaidInAmountInSaleRecapReport(String initialPaidOut) throws InterruptedException {
        new CICloseDayScreen().getPaidOutValue(initialPaidOut);
    }

    @Then("^I should verify the over shortage in sale recap report \"([^\"]*)\"$")
    public void iShouldVerifyTheOverShortageInSaleRecapReport(String overShortageInitialVal) {
        new CICloseDayScreen().getOverShortageValue(overShortageInitialVal);
    }

    @And("^I should verify employee \"([^\"]*)\"$")
    public void iShouldVerifyTheEmployee(String txtDate) throws InterruptedException {
        new CICloseDayScreen().verifyEmployee(txtDate);
    }

    @And("^I click finish button in the order screen \"([^\"]*)\"$")
    public void iClickFinishButtonInTheOrderScreen(String msg) {
        new CICloseDayScreen().clickBtnFinish(msg);
    }

    @And("^I click the Active Check in the close the day checklist \"([^\"]*)\"$")
    public void iClickTheActiveCheckInTheCloseTheDayChecklist(String msg) throws InterruptedException {
        new CICloseDayScreen().getBtnActiveCheck(msg);
    }

    @When("^I click \"([^\"]*)\" in the Active check popup\"([^\"]*)\"$")
    public void iClickInTheActiveCheckPopup(String btnActiveCheck, String msg) {
        new CIPaymentScreen().commonBtnClick(btnActiveCheck,msg);
    }

    @Then("^I should see the Active Check's as\"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldSeeTheActiveCheckSAs(String txtZeroActiveCheck,String msg) throws InterruptedException {
 new CICloseDayScreen().getTxtActiveCheck(txtZeroActiveCheck,msg);
    }

    @And("^I click the cancel button close the day check checklist popup \"([^\"]*)\"$")
    public void iClickInTheCloseTheDayCheckChecklist(String msg) {
        new CICloseDayScreen().clickbtnPopupCancel(msg);
    }

    @Then("^I should see the Active tab with \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldSeeTheActiveTabWith(String txtNoActiveChecks,String msg) throws InterruptedException {
      new CICloseDayScreen().getTxtNoActiveChecks(txtNoActiveChecks,msg);
    }

    @And("^I click the Drop down \"([^\"]*)\" button in the order screen \"([^\"]*)\"$")
    public void iClickTheDropDownButtonInTheOrderScreen(String btnDropDown,String msg) {
        ciCloseDayScreen.clickBtnDropDown(btnDropDown,msg);
    }

    @And("^I click on the Text Field in the open discount screen \"([^\"]*)\"$")
    public void iClickOnTheTextFieldInTheOpenDiscountScreen(String msg) {
        new CICloseDayScreen().clickTextFieldPercentage(msg);
    }

    @And("^I enter the number as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterTheNumberAs(String pin1, String pin2, String pinPoint, String pin0) {
        new CIPaymentScreen().pressPercentagePin(pin1,pin2,pinPoint,pin0);
    }

    @Then("^It should Scroll down to discount and verify Discount \"([^\"]*)\"$")
    public void itShouldScrollDownToDiscountAndVerifyDiscountAs(String Discount) {
        new CICloseDayScreen().getDiscountValue(Discount);
    }

    @Then("^It should Scroll down to discount tax \"([^\"]*)\"$")
    public void itShouldScrollDownToDiscountTax(String discountTax) {
        new CICloseDayScreen().getDiscountTaxValue(discountTax);
    }

    @And("^I click \"([^\"]*)\" in the Tip popup \"([^\"]*)\"$")
    public void iClickInTheTipPopup(String btnCustomTL, String msg) {
        new CIPaymentScreen().commonBtnClick(btnCustomTL,msg);
    }

    @Then("^It should scroll down to verify Total Tip \"([^\"]*)\"$")
    public void itShouldScrollDownToVerifyTotalTip(String txtTotal) {
        new CICloseDayScreen().getTotalTipValue(txtTotal);
    }

    @Then("^Verify total as \"([^\"]*)\"$")
    public void verifyTotalAs(String total) {
        Assert.assertEquals(new CICloseDayScreen().getNetTotal(),total);
    }

    @Then("^I scroll down to verify Cash Expected \"([^\"]*)\"$")
    public void iScrollDownToVerifyCashExpected(String cashExpBf) {
        new CICloseDayScreen().getCashExpectedValue(cashExpBf);
    }

    @Then("^I click on the paid in button in Till Management Screen$")
    public void iClickOnThePaidInButtonInTillManagementScreen() throws InterruptedException {
        new CICloseDayScreen().clickBtnPayIn();
    }

    @And("^I click on the form text field$")
    public void iClickOnTheFormTextField() {
        new CICloseDayScreen().clickPayByTextField();
    }

    @And("^I click on the form text field1$")
    public void iClickOnTheFormTextField1() {
        new CICloseDayScreen().clickPayByTextField1();
    }

    @Then("^I enter the name to pay in as \"([^\"]*)\"$")
    public void iEnterTheNameToPayInAs(String name) {
        new CICloseDayScreen().passNameBy(name);
    }

    @Then("^I enter the name to pay1 in as \"([^\"]*)\"$")
    public void iEnterTheNameToPay1InAs(String name) {
        new CICloseDayScreen().passNameBy1(name);
    }

    @Then("^I click \"([^\"]*)\" in the amount popup \"([^\"]*)\"$")
    public void iClickInTheAmountPopup(String btnContinue, String msg) {
        new CIPaymentScreen().commonBtnClick(btnContinue,msg);
    }

    @Then("^I click \"([^\"]*)\" in the reason screen \"([^\"]*)\"$")
    public void iClickInTheReasonScreen(String btnOk, String msg) {
        new CIPaymentScreen().commonBtnClick(btnOk,msg);
    }

    @Then("^I scroll down to verify paid in after creating sale \"([^\"]*)\" \"([^\"]*)\"$")
    public void iScrollDownToVerifyPaidInAfterCreatingSale(String aftPaidIn,String aftPaidInVal) {
        new CICloseDayScreen().getPaidInValue(aftPaidIn,aftPaidInVal);
    }

    @Then("^I click on the paid out button in Till Management Screen$")
    public void iClickOnThePaidOutButtonInTillManagementScreen() throws InterruptedException {
        new CICloseDayScreen().clickBtnPayOut();
    }

    @Then("^I scroll down to verify paid out after creating sale \"([^\"]*)\" \"([^\"]*)\"$")
    public void iScrollDownToVerifyPaidOutAfterCreatingSale(String paidOutAft, String paidOutVal) {
        new CICloseDayScreen().getAftPaidOutValue(paidOutAft,paidOutVal);
    }

    @Then("^I scroll down to verify gift card sold \"([^\"]*)\"$")
    public void iScrollDownToVerifyGiftCardSold(String giftCardSoldAft) {
        new CICloseDayScreen().getGiftCardSoldValue(giftCardSoldAft);
    }

    @And("^I should verify the current date is displayed$")
    public void iShouldVerifyTheCurrentDateIsDisplayed() {
        new CICloseDayScreen().isDateTimeDisplayed();
    }

    @Then("^It should show the Gross Receipt after sale as \"([^\"]*)\"$")
    public void itShouldShowTheGrossReceiptAfterSaleAs(String grossReceipt) {
        Assert.assertEquals(new CICloseDayScreen().getFullGrossReceipt(),grossReceipt);
    }

    @Then("^I should scroll down to verify credit card value after sale of partial payment \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldScrollDownToVerifyCreditCardValueAfterSaleOfPartialPayment(String creditCardPP,String creditCardPPVal) {
        new CICloseDayScreen().getCreditCardValue(creditCardPP,creditCardPPVal);
    }

    @And("^I enter the Gift Card Number as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnterTheGiftCardNumberAs(String num,String msg) {
        new CIPaymentScreen().passCardNumber(num,msg);
    }

    @Then("^I should scroll down to verify gift card value after creating partial sale \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldScrollDownToVerifyGiftCardValueAfterCreatingPartialSale(String giftCardPP,String giftCardPPVal) {
        new CICloseDayScreen().getAfterGiftCardValue(giftCardPP,giftCardPPVal);
    }

    @Then("^I should scroll down to verify Gross Receipt value \"([^\"]*)\"$")
    public void iShouldScrollDownToVerifyGrossReceiptValue(String grossReceiptAft) {
        new CICloseDayScreen().commGetValue(grossReceiptAft);
    }

    @Then("^I should scroll down to verify Cash \"([^\"]*)\"$")
    public void iShouldScrollDownToVerifyCash(String cashRecordPP) {
        new CICloseDayScreen().getCashRecordValue(cashRecordPP);
    }

    @Then("^I should verify Grand Sale value \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyGrandSaleValue(String grandSaleAft,String grandSaleAftVal) {
        new CICloseDayScreen().getGrandSaleValue(grandSaleAft,grandSaleAftVal);
    }

    @Then("^I should verify Grand Sale value of Partial pay \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyGrandSaleValueOfPartialPay(String grandSalePP,String grandSalePPVal) {
        new CICloseDayScreen().getGrandSaleValue1(grandSalePP,grandSalePPVal);
    }

    @Then("^I should scroll to verify cash expected \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldScrollToVerifyCashExpected(String cashExpPaidOut,String cashExpAft) {
        new CICloseDayScreen().getAfterSaleCashExpected(cashExpPaidOut,cashExpAft);
    }

    @Then("^I should see gross sale value as \"([^\"]*)\"$")
    public void iShouldSeeGrossSaleValueAs(String grossSale) {
        Assert.assertEquals(new CICloseDayScreen().getTxtAfterGrossSale(),grossSale);
    }

    @And("^I click \"([^\"]*)\" Table in the Table Layout screen \"([^\"]*)\"$")
    public void iClickTableInTheTableLayoutScreen(String T1, String msg) throws InterruptedException {
        new CIPaymentScreen().commonBtnClickOption(T1,msg);
    }

    @Then("^I select \"([^\"]*)\" in the total seats popup \"([^\"]*)\"$")
    public void iSelectInTheTotalSeatsPopup(String number, String msg) {
        new CIPaymentScreen().commonBtnClick(number,msg);
    }

    @Then("^I should see gross sale value as \"([^\"]*)\" in sale recap$")
    public void iShouldSeeGrossSaleValueAsInSaleRecap(String grossSale) throws InterruptedException {
    new CICloseDayScreen().getTxtAfterSaleRecapGrossSale(grossSale);
    }

    @Then("^I should see the close day with \"([^\"]*)\"$")
    public void iShouldSeeTheCloseDayWith(String coverCount) {
       new CICloseDayScreen().getTxtCoverCount(coverCount);
    }

    @Then("^I should verify the new customer as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheNewCustomerAs(String newCustomer, String msg) {
        Assert.assertEquals(new CIPaymentScreen().commonGetText(newCustomer,msg),newCustomer);
    }

    @And("^I click on the name Text Field in the customer button \"([^\"]*)\"$")
    public void iClickOnTheNameTextFieldInTheCustomerButton(String msg) {
        new CICloseDayScreen().clickNameTextField(msg);
    }

    @Then("^I enter the name as \"([^\"]*)\"$")
    public void iEnterTheNameAs(String Name) {
        new CICloseDayScreen().passName(Name);
    }

    @Then("^I click on the add button in the phone number field \"([^\"]*)\"$")
    public void iClickOnTheAddButtonInThePhoneNumberField(String msg) {
        new CICloseDayScreen().clickAdd(msg);
    }

    @And("^I enter the number as \"([^\"]*)\"$")
    public void iEnterTheNumberAs(String Number) {
        new CICloseDayScreen().passNumber(Number);
    }

    @Then("^I click on the save field in the phone number \"([^\"]*)\"$")
    public void iClickOnTheSaveFieldInThePhoneNumber(String msg) {
        new CICloseDayScreen().clickSave1(msg);
    }

    @And("^I click on the save button in the customer field \"([^\"]*)\"$")
    public void iClickOnTheSaveButtonInTheCustomerField(String msg) {
        new CICloseDayScreen().clickSave2(msg);
    }

    @Then("^I should verify the tax amount in sale recap report before creating sale \"([^\"]*)\"$")
    public void iShouldVerifyTheTaxAmountInSaleRecapReportBeforeCreatingSale(String initialTaxAmt) {
        new CICloseDayScreen().getInitialTaxAmountValue(initialTaxAmt);
    }

    @Then("^I should verify the Credit card value after creating sale\"([^\"]*)\"$")
    public void iShouldVerifyTheCreditCardValueAfterCreatingSale(String creditCardVal) {
        new CICloseDayScreen().getCreditCard(creditCardVal);
    }

    @Then("^I should verify the Tax amount in the sale recap report after creating sale\"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheTaxAmountInTheSaleRecapReportAfterCreatingSale(String tenPercentTax,String twentyPercentTax) throws InterruptedException {
        new CICloseDayScreen().getTaxAmountValue(tenPercentTax,twentyPercentTax);
    }

    @Then("^I should verify the over shortage in the sale recap after creating sale\"([^\"]*)\" \"([^\"]*)\"$")
    public void iShouldVerifyTheOverShortageInTheSaleRecapAfterCreatingSale(String overShortageVal,String txtOverShortageVal) throws Exception {
        new CICloseDayScreen().getOverShortage(overShortageVal,txtOverShortageVal);
    }

    @And("^I click Cancel button in the close the day checklist Popup \"([^\"]*)\"$")
    public void iClickCancelButtonInTheCloseTheDayChecklistPopup(String msg) {
        new CICloseDayScreen().clickBtnCancel(msg);
    }

    @And("^I scroll the close the day \"([^\"]*)\" \"([^\"]*)\"$")
    public void iScrollTheCloseTheDay(String num,String msg) throws InterruptedException {
        ciCloseDayScreen.verifyCrediCardOption(num,msg);
    }

    @And("^I verify the paid out value as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyThePaidOutValueAs(String num,String msg) throws InterruptedException {
        ciCloseDayScreen.verifyPaidOutValue(num,msg);
    }

    @And("^I verify the paid in value as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyThePaidInValueAs(String num,String msg) throws InterruptedException {
        ciCloseDayScreen.verifyPaidInValue(num,msg);
    }

//    @And("^I click cancel button in the till management screen if it appears \"([^\"]*)\"$")
//    public void iClickInTheTillManagementScreenIfItAppears( String msg) {
//        ciCloseDayScreen.clickBtnCancel(msg);
//    }

//    @And("^I click cancel button in the till management screen if it appears \"([^\"]*)\"$")
//    public void iClickCancelButtonInTheTillManagementScreenIfItAppears(String msg) {
//        ciCloseDayScreen.clickBtnCancel(msg);
//    }

//    @And("I click cancel button in the till management screen if it appears {string}")
//    public void iClickCancelButtonInTheTillManagementScreenIfItAppears(String arg0) {
//    }
}