package com.qa.stepdef;

//import com.qa.pages.TGCheckStatusPage;
import com.qa.pages.TGMenuItemPage;
import com.qa.pages.OrderTypeWindow;
import com.qa.pages.TGPhoneOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TGPhoneOrderStepDef {



    @Then("User click Complete tab below Phone Order")
    public void userClickCompleteTabBelowPhoneOrder() {
        new TGPhoneOrderPage().selectCompletePhoneOrdersOption();
    }

    @And("User verify ForHere payment")
    public void userVerifyForHerePayment() {
        new TGPhoneOrderPage().verifyDeliveredForHereOrder();
    }

    @Then("User click Future tab below Phone Order")
    public void userClickFutureTabBelowPhoneOrder() {
        new TGPhoneOrderPage().clickFutureDeliveryOrder();
    }

    @When("User click New tab below Phone Order")
    public void userClickNewTabBelowPhoneOrder() {
        new TGPhoneOrderPage().clickNewTabBelowPhoneOrder();
    }

    @And("User verify ForHere future payment")
    public void userVerifyForHereFuturePayment() {
        new TGPhoneOrderPage().selectLastFutureOrder();
    }

    @When("User select active driver")
    public void userSelectActiveDriver() {
        new TGPhoneOrderPage().selectActiveDriver();
    }

    @And("User click Departure button")
    public void userClickDepartureButton() {
        new TGPhoneOrderPage().clickDepartureButton();
    }

    @When("User click Out tab below Phone Order")
    public void userClickOutTabBelowPhoneOrder() {
        new TGPhoneOrderPage().clickOutTabBelowPhoneOrder();
    }

    @Then("User click Arrival option")
    public void userClickArrivalOption() {
        new TGPhoneOrderPage().clickArrivalButton();
    }

    @And("User verify Fast Cash screen")
    public void userVerifyFastCashScreen() {
        new TGPhoneOrderPage().verifyFastCash();
    }

    @And("User verify last order")
    public void userVerifyLastOrder() {
        new TGPhoneOrderPage().verifyNewLastOrder();
    }

    @Then("User select last order")
    public void userSelectLastOrder() {
        new TGPhoneOrderPage().selectLastNewPhoneOrder();
    }
   /* @When("User swipe until last new order")
    public void userSwipeUntilLastNewOrder() throws Exception {
         new TGPhoneOrderPage().swipeUntilLastNewForHereOrderType("up");
    }*/

    @And("User verify no driver on the go")
    public void userVerifyNoDriverOnTheGo() {
        new TGPhoneOrderPage().verifyNoDriverOnTheGo();
    }

    @Then("User verify order which is departure")
    public void userVerifyOrderWhichIsDeparture() {
        new TGPhoneOrderPage().verifyDepartureOrder();
    }

    @And("User verify assigned driver for last order")
    public void userVerifyAssignedDriverForLastOrder() {
        new TGPhoneOrderPage().verifyAssignedLastOrder();
    }

    @When("User select last driver assigned order")
    public void userSelectLastDriverAssignedOrder() {
        new TGPhoneOrderPage().verifyAssignedLastOrder();
    }

    @When("User select assigned driver order")
    public void userSelectAssignedDriverOrder() {
        new TGPhoneOrderPage().selectAssignedDriverOrder();
    }

    @Then("User verify arrival last order")
    public void userVerifyArrivalLastOrder() {
        new TGPhoneOrderPage().verifyAssignedLastOrder();
    }

    @When("User select passive driver")
    public void userSelectPassiveDriver() {
        new TGPhoneOrderPage().selectPassiveDriver();
    }

    @Then("User verify passive driver popup")
    public void userVerifyPassiveDriverPopup() {
        new TGPhoneOrderPage().verifyPassiveDriverPopup();
    }

    @And("User verify check which matches with active driver")
    public void userVerifyCheckWhichMatchesWithActiveDriver() {
        new TGPhoneOrderPage().verifyAssignedLstOrder();
    }

    @When("User swipe until last active check on Phone Order")
    public void userSwipeUntilLastActiveCheckOnPhoneOrder() throws Exception {
        new TGPhoneOrderPage().swipeUntilLastActiveCheckOnPhoneOrder("up");
    }



    @When("User swipe until last new For Here type order")
    public void userSwipeUntilLastNewForHereTypeOrder() throws Exception {
        new TGPhoneOrderPage().swipeUntilLastNewForHereOrderType("up");
    }

    //add new step
    @And("User click edit button on Phone Order tab")
    public void userClickEditButtonOnPhoneOrderTab() {
        new TGPhoneOrderPage().clickEditButtonOnPhoneOrderTab();
    }


}
