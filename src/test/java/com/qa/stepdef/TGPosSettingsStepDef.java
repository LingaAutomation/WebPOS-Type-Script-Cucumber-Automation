package com.qa.stepdef;

import com.qa.pages.TGMenuItemPage;
import com.qa.pages.TGOperationPage;
import com.qa.pages.TGPosSettingsPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TGPosSettingsStepDef {

    @And("User close ask customer name option if enable")
    public void userCloseAskCustomerNameOptionIfEnable() throws Exception {
       /* posSettings = new PosSettingsPage((AppiumDriver<?>) driver);
        posSettings.closeAskCustomerNameOptionIfEnable("up");*/

        new TGPosSettingsPage().closeAskCustomerNameOptionIfEnable("up","down");
    }


    @Given("User open ask customer name option if disable")
    public void userOpenAskCustomerNameOptionIfDisable() throws Exception {
        new TGPosSettingsPage().openAskCustomerNameOptionIfDisable("up","down");
    }

    @Then("User open Enable Cash Drop option if disable")
    public void userOpenEnableCashDropOptionIfDisable() throws Exception {
        new TGPosSettingsPage().openEnableCashDropOptionIfDisable("up");
    }

    @Then("User close Enable Cash Drop option if enable")
    public void userCloseEnableCashDropOptionIfEnable() throws Exception {
        new TGPosSettingsPage().closeEnableCashDropOptionIfDisable("up");

    }
}
