package com.qa.stepdef;

import com.qa.pages.CICloseDayScreen;
import com.qa.pages.TGCheckOptionPage;
import com.qa.pages.TGGiftCard;
import com.qa.pages.TGPaymentPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TGGiftCardStepDef {


    @Then("User verify Gift Card screen")
    public void userVerifyGiftCardScreen() {
        new TGGiftCard().verifyGiftCardScreen();
    }

    @And("User verify GivX tab is disable")
    public void userVerifyGivXTabIsDisable() {
        new TGGiftCard().verifyDisableGiveX();
    }

    @Then("User click gift card done button")
    public void userClickGiftCardDoneButton() {
        new TGGiftCard().clickGiftCardDoneButton();
    }

    @And("User verify missing charge amount warning popup")
    public void userVerifyMissingChargeAmountWarningPopup() {
        new TGGiftCard().missingChargeAmount();
    }

    @Then("User enter gift card charge amount")
    public void userEnterGiftCardChargeAmount() {
        new TGGiftCard().giftCardChargeAmount();
    }

    @And("User click gift card cancel button")
    public void userClickGiftCardCancelButton() {
        new TGGiftCard().giftCardCancelButton();
    }

    @And("User verify gift card balance")
    public void userVerifyGiftCardBalance() {
        new TGGiftCard().verifyGiftCardBalance();
    }

    @When("User enter gift card number for gift card option")
    public void userEnterGiftCardNumberForGiftCardOption() {
        new TGGiftCard().enterGiftCardCardNumber();
    }
    @When("User enter gift card number for gift card on check option")
    public void userEnterGiftCardNumberForGiftCardOnCheckOption() {
        new TGGiftCard().enterGiftCardNumberOnCheckOption();
    }

    @And("User verify gift card inactivated popup")
    public void userVerifyGiftCardInactivatedPopup() {
        new TGGiftCard().giftCardInactivatePopup();
    }

    @And("User verify gift card activate popup")
    public void userVerifyGiftCardActivatePopup() {
    }

    @And("User verify deleted card number")
    public void userVerifyDeletedCardNumber() {
        new TGGiftCard().verifyDeletedCardNumber();
    }

    @Then("User click Suspend Account toggle")
    public void userClickSuspendAccountToggle() {
        new TGGiftCard().clickSuspendAccountToggle();
    }

    @And("User click Activate Account toggle")
    public void userClickActivateAccountToggle() {
        new TGGiftCard().clickActivateAccountToggle();
    }

    @And("User open Activate Account toggle if disable")
    public void userOpenActivateAccountToggleIfDisable() {
        new TGGiftCard().openActivateAccountToggleIfDisable();
    }

    @When("User select GiveX option")
    public void userSelectGiveXOption() {
        new TGGiftCard().selectGiveXOption();
    }

    @Then("User enter GiveX card number")
    public void userEnterGiveXCardNumber() {
        new TGGiftCard().enterGiveXCardNumber();
    }

    @Then("User enter GiveX charge amount")
    public void userEnterGiveXChargeAmount() {
        new TGGiftCard().enterGiveXChargeAmount();
    }

    @And("User verify recurring balance for GiveX Card")
    public void userVerifyRecurringBalanceForGiveXCard() {
        new TGGiftCard().verifyRecurringBalanceForGiveXCard();
    }

    @When("User verify Beginning Balance and Recurring Balance amount")
    public void userVerifyBeginningBalanceAndRecurringBalanceAmount() {
        new TGGiftCard().verifyBeginningBalanceAndRecurringBalanceAmount();
    }

    @And("User verify beginning balance for GiveX Card")
    public void userVerifyBeginningBalanceForGiveXCard() {
        new TGGiftCard().verifyBeginningBalanceForGiveXCard();
    }

    @Then("User enter GiveX recharge amount")
    public void userEnterGiveXRechargeAmount() {
        new TGGiftCard().enterGiveXRechargeAmount();
    }

    @And("User click GiveX cancel button")
    public void userClickGiveXCancelButton() {
        new TGGiftCard().clickGiveXCancelButton();
    }

    @And("User verify new recurring balance of GiveX Card after recharge")
    public void userVerifyNewRecurringBalanceOfGiveXCardAfterRecharge() {
        new TGGiftCard().verifyNewRecurringBalanceOfGiveXCardAfterRecharge();
    }

    @And("User verify previous beginning balance for GiveX Card")
    public void userVerifyPreviousBeginningBalanceForGiveXCard() {
        new TGGiftCard().verifyPreviousBeginningBalanceForGiveXCard();
    }

    @Then("user verify Gift card activated successfully info popup")
    public void userVerifyGiftCardActivatedSuccessfullyInfoPopup() {
        new TGGiftCard().verifyGiftCardActivatedSuccessfullyInfoPopup();
    }

    @And("User verify Enter the Charge Amount info popup")
    public void userVerifyEnterTheChargeAmountInfoPopup() {
        new TGGiftCard().verifyEnterTheChargeAmountInfoPopup();
    }

    @When("User open Activate Account toggle if disable for GiveX")
    public void userOpenActivateAccountToggleIfDisableForGiveX() {
        new TGGiftCard().openActivateAccountToggleIfDisableForGiveX();
    }

    @Then("User verify recurring balance for GiveX Card after recharge")
    public void userVerifyRecurringBalanceForGiveXCardAfterRecharge() {
        new TGGiftCard().verifyRecurringBalanceForGiveXCardAfterRecharge();
    }

    @When("User enter GiveX card number on payment page")
    public void userEnterGiveXCardNumberOnPaymentPage() {
        new TGGiftCard().enterGiveXCardNumberOnPaymentPage();
    }

    @And("User verify Give X option")
    public void userVerifyGiveXOption() {
        new TGGiftCard().verifyGiveXOption();
    }

    @When("User verify if Suspend Account toggle is shown")
    public void userVerifyIfSuspendAccountToggleIsShown() {
        new TGGiftCard().verifyIfSuspendAccountToggleIsShown();
    }

    @And("User verify changing recurring balance")
    public void userVerifyChangingRecurringBalance() {
        new TGGiftCard().verifyChangingRecurringBalance();
    }

    @Then("User verify GivX Card screen")
    public void userVerifyGivXCardScreen() {
        new TGGiftCard().verifyGivXCardScreen();
    }

    @Then("User verify activate info message")
    public void userVerifyActivateInfoMessage() {
        new TGGiftCard().verifyActivateInfoMessage();
    }

    @Then("User verify recurring balance is added from the beginning balance with entered amount")
    public void userVerifyRecurringBalanceIsAddedFromTheBeginningBalanceWithEnteredAmount() {
        new TGGiftCard().verifyRecurringBalanceIsAddedFromTheBeginningBalanceWithEnteredAmount();
    }

    @And("User click GiveX done button")
    public void userClickGiveXDoneButton() {
        new TGGiftCard().clickGiveXDoneButton();
    }

    @Then("user verify the popup \"([^\"]*)\" \"([^\"]*)\"$")
    public void userVerifyThePopup(String btnPopup, String msg) {
//        String text =  new CICloseDayScreen().commonAccessibilityIdReturn(btnPopup,msg);
//        Assert.assertEquals(btnPopup, text);

    }
    @Then("user verify the enter the charge amount \"([^\"]*)\" \"([^\"]*)\"$")
    public void userVerifyTheEnterTheChargeAmount(String warningPopup, String msg) {
        String text =  new CICloseDayScreen().commonAccessibilityIdReturn(warningPopup,msg);
        Assert.assertEquals(warningPopup, text);
    }
    @Then("I click the \"([^\"]*)\" button in the popup screen \"([^\"]*)\"$")
    public void IClickTheButtonInThePopupScreen(String rechargeSucessFull, String msg) {
        new CICloseDayScreen().commonAccessibilityId(rechargeSucessFull,msg);

    }
    @Then("i should verify the deleted card number")
    public void IShouldVerifyTheDeletedCardNumber() {
        new TGGiftCard().verifyCreditCardTxtField();

    }

    @Then("^User enter GiveX recharge amount as thousand$")
    public void userEnterGiveXChargeAmountAsThousand() {
        new TGGiftCard().enterGiveXRechargeAmount1();
    }

    @Then("^User enter gift card charge amount as thousand$")
    public void userEnterGiftCardChargeAmountAsThousand() {
        new TGGiftCard().giftCardChargeAmount1();
    }
}
