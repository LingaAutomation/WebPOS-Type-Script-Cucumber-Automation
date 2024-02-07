package com.qa.stepdef;

import com.qa.pages.Regression;
import io.cucumber.java.en.And;

public class RegressionStepDef {

    @And("^I do merge for Sync as \"([^\"]*)\"$")
    public void iDoMergeForSyncAs(String cate) throws Exception {
        new Regression().mergeBothIpad(cate);
    }

    @And("^I do merge for Sync1 as \"([^\"]*)\"$")
    public void iDoMergeForSync1As(String cate) throws Exception {
        new Regression().mergeBothIpad1(cate);
    }

    @And("^I do split for Sync as \"([^\"]*)\"$")
    public void iDoSplitForSyncAs(String cate) throws Exception {
        new Regression().splitBothIpad(cate);
    }

    @And ("^I do Split group for sync as \"([^\"]*)\"$")
    public void iDoSplitGroupForSync(String category) throws Exception {
        new Regression().splitGroupBothIpad(category);
    }

    @And ("^I do split for Sync as for Random Menu \"([^\"]*)\"$")
    public void iDoSplitForSyncAsForRandomMenu(String category) throws Exception {
        new Regression().splitGroupBothIpadRandom(category);
    }

    @And ("^I do Split group for sync Random menu of \"([^\"]*)\"$")
    public void iDoSplitGroupForSyncRandomMenuOf(String category) throws Exception {
        new Regression().splitGroupBothIpadRandom(category);
    }

//    @And("^I do split for Sync1 as \"([^\"]*)\"$")
//    public void iDoSplitForSync1As(String cate) throws Exception {
//        new Regression().mergeBothIpad1(cate);
//    }

    @And ("^I click power$")
    public void iClickPower(){
        new Regression().clickPower();
    }

    @And ("^I click power1$")
    public void iClickPower1(){
        new Regression().clickPower1();
    }

}
