package com.qa.stepdef;

import com.qa.pages.TGLogOuts;
import com.qa.pages.TGMenuItemPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TGLogoutStepDef {


    @When("User click logout button")
    public void userClickLogoutButton() {
        new TGLogOuts().pressLogOut();
    }


    @Then("User click yes button")
    public void userClickYesButton() {
        new TGLogOuts().pressYes();
    }

    @When("User enter pin number")
    public void userEnterPinNumber() {
        new TGLogOuts().pressLogOut1();

        new TGLogOuts().pressLogOut2();

        new TGLogOuts().pressLogOut3();

        new TGLogOuts().pressLogOut4();

        new TGLogOuts().pressContinue();
    }

}
