package com.qa.stepdef;

import com.qa.pages.CICloseDayScreen;
import com.qa.pages.TGGiftCard;
import com.qa.pages.TGMenuItemPage;
import com.qa.pages.TGMergePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TGMergeCheckStepDef {


    @When("User click merge option")
    public void userClickMergeOption() {
        new TGMenuItemPage().clickMergeButton();
    }

    @Then("User merge first and second tables")
    public void userMergeFirstAndSecondTables() {
        new TGMenuItemPage().mergeTable();
    }

    @And("Verify the merged checks")
    public void verifyTheMergedChecks() {
        new TGMenuItemPage().verifyMergeCheck();
    }

    @Then("User select table for merge")
    public void userSelectTableForMerge() {
        new TGMergePage().selectTableForMerge();

        //new MergePage((IOSDriver)driver).selectTableForMerge();

    }
    @Then("User click Merge button in the table layout screen")
    public void userClickMergeButtonInTheTableLayoutScreen() {
        new TGMergePage().clickMergeButton();
    }

    @And("^I click the \"([^\"]*)\" in the table layout screen \"([^\"]*)\"$")
    public void iClickTheInTheTableLayoutScreen(String btnRight, String msg) {
//            new CICloseDayScreen().commonAccessibilityId(btnRight,msg);
            new CICloseDayScreen().clickRight(btnRight,"Floor 1",msg);
    }

    @And("^I click the \"([^\"]*)\" in the table layout screen1 \"([^\"]*)\"$")
    public void iClickTheInTheTableLayoutScreen1(String btnRight, String msg) {
//            new CICloseDayScreen().commonAccessibilityId(btnRight,msg);
        new CICloseDayScreen().commonAccessibilityId(btnRight,msg);
    }
}
