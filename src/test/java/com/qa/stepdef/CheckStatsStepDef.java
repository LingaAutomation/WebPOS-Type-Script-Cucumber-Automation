package com.qa.stepdef;

import com.qa.pages.CheckStatusScreen;
import com.qa.pages.OrdersAndDriversListScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckStatsStepDef {

    public WebDriver driver = Hooks.driver;


    @And("^I click Check Stats tab$")
    public void iClickCheckStatsTab() throws InterruptedException {
        new OrdersAndDriversListScreen().selectCheckStatsTab();
    }


    @And("^I click Active check as \"([^\"]*)\"$")
    public void iClickActiveCheck(String number) throws Exception {
        new CheckStatusScreen(driver).clickActiveChecks(number);
    }
    @Then ("^I should see the Active check as \"([^\"]*)\"$")
    public void iShouldSeeTheActiveCheck(String number1) throws Exception {
        new CheckStatusScreen(driver).clickActiveChecks1(number1);
    }

    @Then ("^I should see check stats Screen$")
    public void iShouldSeeCheckStatsScreen(){
        Assert.assertEquals(new OrdersAndDriversListScreen().verifyCheckStatsScreen(),"Check Stats");
    }
    @Then ("^I should see the Linga Popup$")
    public void iShouldSeeTheLingaPopup(){
        Assert.assertEquals(new CheckStatusScreen(driver).verifyLinga(),"Linga");
    }

    @Then ("^I should see the closed check as \"([^\"]*)\"$")
    public void iShouldSeeTheCloseCheckAs(String TableNum){
        new CheckStatusScreen(driver).verifyClosedCheck(TableNum);
    }
    @And ("^I click the Operation button on the check stats$")
    public void iClickTheOperationButtonOnTheCheckStats(){
        new CheckStatusScreen(driver).pressOperationOnCheckStats();
    }

    @And ("^I click QSR tab")
    public void iClickQsrTab(){
        new CheckStatusScreen(driver).clickQsrButton();
    }


}
