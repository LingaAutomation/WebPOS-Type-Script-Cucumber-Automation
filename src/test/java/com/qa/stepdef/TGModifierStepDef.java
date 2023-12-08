package com.qa.stepdef;

import com.qa.pages.CIPaymentScreen;
import com.qa.pages.TGMenuItemPage;
import com.qa.pages.TGModifierPage;
import com.qa.pages.TableLayOutScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TGModifierStepDef {

    @When("User select first modifier on modifier page")
    public void userSelectFirstModifierOnModifierPage() {
        new TGModifierPage().selectFirstItemForFirstModifier();
    }

    @And("User verify selected modifier on modifier page")
    public void userVerifySelectedModifierOnModifierPage() {
        new TGModifierPage().verifySelectedModifier();
    }

    @And("User click OK button")
    public void userClickOKButton() {
        new TGModifierPage().clickModifierOkButton();
    }

    @And("User click modifier cancel button")
    public void userClickModifierCancelButton() {
        new TGModifierPage().clickModifierCancelButton();
    }

    @And("User select \"([^\"]*)\" in the modifier page \"([^\"]*)\"$")
    public void userSelectInTheModifierPage(String btnModifier, String msg) {
        new CIPaymentScreen().commonBtnClickOption(btnModifier,msg);
    }

    @And("I touch and swipe and delete the modifiers")
    public void iTouchAndSwipeAndDeleteTheModifiers() throws InterruptedException {
            new TGModifierPage().swipeTheModifiersAndDelete();
            new TGModifierPage().swipeTheModifier();
            new TableLayOutScreen().clickDeleteBtn();

        }
    }

