package com.qa.stepdef;

import com.qa.pages.CheckOptionsScreen;
import com.qa.pages.CheckStatusScreen;
import com.qa.pages.Discount;
import com.qa.pages.OrderManagementScreen;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static com.qa.utils.TestUtils.driver;
public class CheckBasedDiscountStepDef {

    public WebDriver driver = TestUtils.driver;

    @And("^I select Discount on the Order screen$")
    public void iSelectDiscountOnTheOrderScreen(){
        new Discount().pressDiscountBtn();
    }
    @Then("^I should see Check Based Discount Screen$")
    public void iShouldSeeCheckBasedDiscountScreen(){
        Assert.assertEquals(new Discount().discountPage(),"Discounts");
    }

    @And ("^I click Discount as \"([^\"]*)\"$")
    public void iClickDiscountAs(String discount){
        new Discount().pressDiscount(discount);
    }
    @And ("^I click Discount1 as \"([^\"]*)\"$")
    public void iClickDiscount1As(String discount){
        new Discount().pressDiscount1(discount);
    }
    @And ("^I click Back button on Discount Screen$")
    public void iClickBackButtonOnDiscountScreen(){
        new Discount().pressBackBtn();
    }

    @Then ("^I should see orderscreen with as \"([^\"]*)\"$")
    public void iShouldSeeOrderScreenWithAs(String discount){
        new Discount().verifyDiscountIsDisplayed(discount);
    }

    @And ("^I compare menu price as \"([^\"]*)\" \"([^\"]*)\" and applied \"([^\"]*)\" on \"([^\"]*)\" menu Item$")
    public void iCompareMenuPriceAsAndAppliedOnMenuItem(String amount,String amount1,String name, String name1){
        new Discount().verifyMenuItemPrice(amount,amount1,name,name1);
    }
    @Then ("^I should see orderscreen with menu item prize as \"([^\"]*)\"$")
    public void iShouldSeeOrderScreenWithMenuItemPrizeAs(String amount){
        new Discount().verifyMenuItemPrizeIsDisplayed(amount);
    }
    @Then ("^I should see orderscreen with menu item Total as \"([^\"]*)\"$")
    public void iShouldSeeOrderScreenWithMenuItemTotalAs(String amount){
        new Discount().verifyMenuItemTotal(amount);
    }

    @Then ("^I should see the tax amount reflected to the check as \"([^\"]*)\"$")
    public void iShouldSeeTheTaxAmountReflectedToTheCheckAs(String amount){
        new OrderManagementScreen(driver).checkTaxValue(amount);
    }

    @Then ("^I should see orderscreen with menu item Total without Discount or Tax as \"([^\"]*)\"$")
    public void iShouldSeeOrderScreenWithMenuItemTotalWithoutDiscountOrTaxAs(String amount){
        new Discount().verifyMenuItemTotal1(amount);
    }

    @Then ("^I should see orderscreen with menu item Total without Discount or Tax as \"([^\"]*)\" while Gratuity$")
    public void iShouldSeeOrderScreenWithMenuItemTotalWithoutDiscountOrTaxAsWhileGratuity(String amount){
        new Discount().verifyMenuItemTotalGratuity1(amount);
    }

    @And ("^I change the Quantity of menu Item as \"([^\"]*)\"$")
    public void iChangeTheQuantityOfMenuItemAs(String number){
        new OrderManagementScreen(driver).enterMenuQuantity(number);
    }

    @And ("^I change the Quantity of menu Item1 as \"([^\"]*)\"$")
    public void iChangeTheQuantityOfMenuItem1As(String number){
        new OrderManagementScreen(driver).enterMenuQuantity$Store(number);
    }

    @And ("^I change the Quantity1 of menu Item as \"([^\"]*)\"$")
    public void iChangeTheQuantity1OfMenuItemAs(String Num){
        new OrderManagementScreen(driver).enterMenuQty(Num);
    }

    @And ("^I select menu item as Tea For mix&Match SP Before Tax$")
    public void iSelectMenuItemAsTeaForMixMatchSpBeforeTax(){
        new OrderManagementScreen(driver).selectMenuAsTea();
    }
    @Then ("^I should see Need to attach customer popup$")
    public void iShouldSeeNeedToAttachCustomerPopup(){
        Assert.assertEquals(new CheckOptionsScreen(driver).verifyNeedToAttachCustomer(),"Need to Attach Customer");
    }

}
