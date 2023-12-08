package com.qa.stepdef;

import com.qa.pages.TGMenuItemPage;
import com.qa.pages.TGOperationPage;
import com.qa.pages.TGSplitCheckPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class TGOperationStepDef {


    @And("User select POS option")
    public void userSelectPOSOption() throws InterruptedException {
        new TGOperationPage().clickPosOption();
    }

    @Then("User verify be directed operation page")
    public void userVerifyBeDirectedOperationPage() {
        new TGOperationPage().verifyDirectedOperationPage();
    }

    @Then("User click Batch and Adjustment tab")
    public void userClickBatchAndAdjustmentTab() {
        new TGOperationPage().clickBatchAndAdjustmentTab();
    }

    @And("User select POS Settings tab")
    public void userSelectPOSSettingsTab() {
        new TGOperationPage().selectPOSSettingsTab();
    }


    @And("User click POS Option")
    public void userClickPOSOption() {
        new TGOperationPage().clickPOSOption();
    }

    @Then("User click operation button on operation page")
    public void userClickOperationButtonOnOperationPage() {
        new TGOperationPage().clickOperationButtonOnOperationPage();
    }

    @When("User click Till Management tab")
    public void userClickTillManagementTab() {
        new TGOperationPage().clickTillManagementTab();
    }

    @And("User verify total price of Sandwiches")
    public void userVerifyTotalPriceOfSandwiches() {
        new TGOperationPage().verifyTotalPrice();
    }



}
