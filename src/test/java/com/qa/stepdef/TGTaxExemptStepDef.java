package com.qa.stepdef;

import com.qa.pages.CIPaymentScreen;
import com.qa.pages.TGCheckOptionPage;
import com.qa.pages.TGTaxExempt;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.And;

public class TGTaxExemptStepDef {

    @And("User select tax exempt type")
    public void userSelectTaxExemptType() {
        new TGTaxExempt().selectFirstTaxExemptType();
    }

    @And("User verify apply tax exempt paid amount warning popup")
    public void userVerifyApplyTaxExemptPaidAmountWarningPopup() {
        new TGTaxExempt().verifyApplyTaxExemptPaidAmountWarningPopup();
    }

    @And("User select first tax exempt type")
    public void userSelectFirstTaxExemptType() {
        new TGTaxExempt().selectFirstTaxExemptType();
    }

    @And("I click \"([^\"]*)\" in the Modifier page \"([^\"]*)\"$")
    public void iClickInTheModifierPage(String btnModifier,String msg) {
        new CIPaymentScreen().commonBtnClickOption(btnModifier,msg);
    }
}
