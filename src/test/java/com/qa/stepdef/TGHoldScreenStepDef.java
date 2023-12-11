package com.qa.stepdef;

import com.qa.pages.TGCashPage;
import com.qa.pages.TGHoldScreenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TGHoldScreenStepDef {

    @When("User select manuel option for Hold check option")
    public void userSelectManuelOptionForHoldCheckOption() {
        new TGHoldScreenPage().clickHoldManualOption();
    }



}
