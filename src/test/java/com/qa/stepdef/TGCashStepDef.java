package com.qa.stepdef;

import com.qa.pages.TGCashPage;
import com.qa.pages.TGMenuItemPage;
import com.qa.pages.TGSplitCheckPage;
import com.qa.pages.TGCashPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class TGCashStepDef {

    @And("User pay order")
    public void userPayOrder() {
        new TGCashPage().payOrder();

    }

    @And("User click exact option")
    public void userClickExactOption() {
        new TGCashPage().clickExactButtonOnCashTab();
    }

    @Then("User click enter button")
    public void userClickEnterButton() {
        new TGCashPage().clickEnterButtonOnCashButton();
    }

    @And("User click cash amount exceed amount popoup")
    public void userClickCashAmountExceedAmountPopoup() {
        new TGCashPage().clickCashAmountExceedAmountPopoup();
    }

    @And("User enter cash drop amount for Sandwiches")
    public void userEnterCashDropAmountForSandwiches() {
        new TGCashPage().enterCashDropAmountForSandwiches();
    }


}
