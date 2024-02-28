package com.qa.pages;


import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;

import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.qa.utils.TestUtils.driver;


public class TGMenuItemPage extends BasePage {


    public void clickPhoneDeliveryOrderOption(){
        WebElement element = mergeAndFindMobileElement(phoneDeliveryOrderOption);
        elementClick(element,"Click Phone Delivery Order Option");
    }
    public void clickPhoneOrderOrderOption(){
        WebElement element = mergeAndFindMobileElement(phoneOrderOrderOption);
        elementClick(element,"Click PhoneOrder Order Option");
    }
    public void clickBarTabOrderOption(){
        WebElement element = mergeAndFindMobileElement(barTabOrderOption);
        elementClick(element,"Click BarTab Order Option");
    }
    public void selectForHereOrderOption(){
        WebElement element = mergeAndFindMobileElement(forHereOrderOption);
        elementClick(element,"Click ForHere Order Option");
    }
    public void verifyRechargeAmountWithGivXCard(){
        WebElement element = mergeAndFindMobileElement(giveXCardNumberOnMenuItemPage);
        String actualName = elementGetText(element,"Verify Recharge Amount With GiveX Card");
        String expectedName = "GCX-603628394562001380850";

        Assert.assertEquals(actualName,expectedName);

        WebElement element2 = mergeAndFindMobileElement(giveXRechargeAmountOnMenuItemPage);
        String actualName1 = elementGetText(element2,"Verify Recharge Amount With GiveX Card");
        String expectedName1 = "500,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void clickExitButtonIfSPPaxPreAuthPopupIsShown(){
        String title = "SP Pax PreAuth";
        if(title.equals("QSR")){
            WebElement element1 = mergeAndFindMobileElement(qsrOrderType);
            String actualName1 = elementGetText(element1,"Verify QSR OrderType");
        }
        else{
            WebElement element = mergeAndFindMobileElement(exitButtonForSpPaxPreAuth);
            elementClick(element,"Click Exit button");
        }
    }

    public void clearSearchMenuItem(){
        WebElement element = mergeAndFindMobileElement(searchTextBox);
        element.clear();
    }

    public void verifyDineInOrderType(){
        WebElement element = mergeAndFindMobileElement(dineInOrderType);
        String actualName = elementGetText(element,"Verify DineIn OrderType");
        String expectedName = "Dine In";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyPhoneToGoOrderType(){
        WebElement element = driver.findElement(By.xpath("//span[.=' TOGO ']"));
        String actualName = elementGetText(element,"Verify Phone OrderType");
        String expectedName = "TOGO";

        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(toGoOrderType);
//        String actualName1 = elementGetText(element1,"Verify To Go OrderType");
//        String expectedName1 = "To Go";
//
//        Assert.assertEquals(actualName1,expectedName1);
    }
    public void clickNewCustomerWhichIsCreatedForHouseAccount(){
        WebElement element = mergeAndFindMobileElement(newCustomerForHouseAccount);
        elementClick(element,"Click New Customer");
    }
    public void verifyNewCustomerForHouseAccount(){
        WebElement element = mergeAndFindMobileElement(selectedCustomerNameForBarTab);
        String actualName = elementGetText(element,"Verify NewCustomer For House Account");
        String expectedName = "Test A";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectVoidReasonForHouseAccount(){
        WebElement element = mergeAndFindMobileElement(voidReasonForHA);
        elementClick(element,"Select Void Reason For HouseAccount");
    }
    public void clickSelectedCustomerForHouseAccountOnBarTabOrder(){
        WebElement element = mergeAndFindMobileElement(selectedCustomerForHouseAccount);
        elementClick(element,"Click Selected Customer");
    }

    //xpath changes(nov 11)
    public void verifySelectedCustomerForBarTabOrder(){
        WebElement element = mergeAndFindMobileElement(selectedCustomerNameForBarTab1);
        String actualName = elementGetText(element,"Verify Selected Customer For BarTab Order");
        String expectedName = "john k";

        Assert.assertEquals(actualName,expectedName);
    }
//    public void verifyInclusiveTaxAmountForMantı(){
//        WebElement element = mergeAndFindMobileElement(taxTitle);
//        String actualName = elementGetText(element,"Verify Inclusive TaxAmount For Mantı");
//        String expectedName = "Tax";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(mantiTotalPriceWithInclusiveTax);
//        String actualName1 = elementGetText(element1,"Verify Inclusive TaxAmount For Manti");
//        String expectedName1 = "$ 50,06";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    //tax xpath changes (nov11)
    public void verifyInclusiveTaxAmountForMantı(){
        WebElement element = driver.findElement(By.xpath("//p[@id='os_taxAmount']"));
        String actualName1 = elementGetText(element,"Verify ItemBased Inclusive Tax");
        String expectedName1="Tax";
        Assert.assertEquals(actualName1,expectedName1);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = element1.getAttribute("value");
        String expectedName="$ 0.21";
        Assert.assertEquals(actualName,expectedName);
    }
    public void selectMantıHasInclusiveTax(){
        WebElement element = mergeAndFindMobileElement(mantiMenuItem);
        elementClick(element,"Select Mantı Has InclusiveTax");
    }
//    public void verifyExclusiveTaxAmountForBaconOmeletSenior(){
//        WebElement element = mergeAndFindMobileElement(taxTitle);
//        String actualName = elementGetText(element,"Verify Exclusive TaxAmount ");
//        String expectedName = "Tax";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(baconOmeletTotalPriceWithExclusiveTax);
//        String actualName1 = elementGetText(element1,"Verify Exclusive TaxAmount");
//        String expectedName1 = "$ 105,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    public void verifyExclusiveTaxAmountForBaconOmeletSenior(){
        WebElement element = driver.findElement(By.xpath("//p[@id='os_taxAmount']"));
        String actualName1 = elementGetText(element,"Verify ItemBased Inclusive Tax");
        String expectedName1="Tax";
        Assert.assertEquals(actualName1,expectedName1);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = element1.getAttribute("value");
        String expectedName="$ 0.21";
        Assert.assertEquals(actualName,expectedName);
    }
    public void selectBaconOmeletSeniorHasExclusiveTax(){
        WebElement element = mergeAndFindMobileElement(baconOmeletMenuItem);
        elementClick(element,"Select BaconOmelet Senior Has ExclusiveTax");
    }
    public void clickPlusButtonForAddSeat(){
        WebElement element = mergeAndFindMobileElement(plusIconForAddSeat);
        elementClick(element,"click Plus Button For Add Seat");
    }
    public void selectHamburgerMenuItem(){
        WebElement element = mergeAndFindMobileElement(hamburgerMenuItem);
        TestUtils.menu = element.getText();
        elementClick(element,"Select Hamburger MenuItem");
    }
    public void verifyTotalPriceOfBrushettaWithVaryingGratuity(){
        WebElement element = mergeAndFindMobileElement(gratuityText);
        String actualName = elementGetText(element,"Verify Text Gratuity");
        String expectedName = "Gratuity";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(brushettaVaryingGratuityPrice);
        String actualName1 = elementGetText(element1,"Verify TotalPrice with Gratuity");
        String expectedName1 = "$ 50,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyFixedGratuityOptionAppliedOnBrushetta(){
//        WebElement element = mergeAndFindMobileElement(gratuityText);
//        String actualName = elementGetText(element,"Verify Fixed Gratuity");
//        String expectedName = "Gratuity";
//
//        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath(brushettaFixGratuityPrice));
        String actualName1 = element1.getAttribute("value");
        String expectedName1 = "$ 0.10";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyTotalPriceOfMargaritaMenuItemWithTaxExempt(){
        WebElement element = mergeAndFindMobileElement(totalText);
        String actualName = elementGetText(element,"Verify Total text");
        String expectedName = "Total";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(totalText);
        String actualName1 = elementGetText(element1,"Verify Total Price With TaxExempt");
        String expectedName1 = "$ 1.000,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyTotalPriceOfPizzaMelMenuItemWithTaxExempt(){
        WebElement element = mergeAndFindMobileElement(totalText);
        String actualName = elementGetText(element,"Verify Total text");
        String expectedName = "Total";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(pizzaMelTotalPriceWithTaxExempt);
        String actualName1 = elementGetText(element1,"Verify Total Price With TaxExempt");
        String expectedName1 = "$ 1.700,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyDiscountPrice(){
        WebElement element = mergeAndFindMobileElement(autoDiscountText);
        String actualName = elementGetText(element,"Verify Auto Discount");
        String expectedName = "Auto Discount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(autoDiscountPrice);
        String actualName1 = elementGetText(element1,"Verify Auto Discount Value");
        String expectedName1 = "$ 400,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyAutoDiscountPrice(){
        WebElement element = mergeAndFindMobileElement(autoDiscountText);
        String actualName = elementGetText(element,"Verify Discount");
        String expectedName = "Discount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(autoDiscountPrice);
        String actualName1 = elementGetText(element1,"Verify Auto Discount Value");
        String expectedName1 = "$ 400,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyTotalPriceOfMargaritaMenuItem(){
        WebElement element = mergeAndFindMobileElement(totalText);
        String actualName = elementGetText(element,"Verify Total Text");
        String expectedName = "Total";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(pizzaMargaritaTotalPrice1);
        String actualName1 = elementGetText(element1,"Verify Total Price Value");
        String expectedName1 = "$ 2.999,70";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyTotalPriceOfMargaritaMenuItem(){
//        WebElement element = mergeAndFindMobileElement(totalText);
//        String actualName = elementGetText(element,"Verify Total Text");
//        String expectedName = "Total";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(pizzaMargaritaTotalPrice);
//        String actualName1 = elementGetText(element1,"Verify Total Price Value");
//        String expectedName1 = "$ 3.267,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    public void verifyTotalPriceOfPizzaMelMenuItem(){
//        WebElement element = mergeAndFindMobileElement(totalText);
//        String actualName = elementGetText(element,"Verify Total Text");
//        String expectedName = "Total";
//
//        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath(pizzaMelTotalPrice));
        String actualName1 = element1.getAttribute("value");
        String expectedName1 = "$ 17.60";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void selectCokeMenuItem(){
        WebElement element = mergeAndFindMobileElement(cokeMenuItem);
        elementClick(element,"Select Coke MenuItem");
    }
//    public void verifyCheckBasedDiscountAfterTaxAndOpenItemWithWholeNumberForBrushetta(){
//        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemTitle);
//        String actualName = elementGetText(element,"Verify CheckBasedDiscount");
//        String expectedName = "CB-AfterTax-OpenItem";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemForBruchettas);
//        String actualName1 = elementGetText(element1,"Verify CheckBasedDiscount Value Before Tax");
//        String expectedName1 = "9,70";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    //nov 17
    public void verifyCheckBasedDiscountAfterTaxAndOpenItemWithWholeNumberForBrushetta(){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxWithOpenItemTitle);
        String actualName = elementGetText(element,"Verify CheckBasedDiscount");
        String expectedName = "CB-AfterTax-OpenItem";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemBruchettas1);
        String actualName1 = elementGetText(element1,"Verify CheckBasedDiscount Value Before Tax");
        String expectedName1 = "9,86";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCheckBasedDiscountAfterTaxAndOpenItemWithDecimalNumberForBrushetta(){
//        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemTitle);
//        String actualName = elementGetText(element,"Verify text CB-AfterTax-OpenItem");
//        String expectedName = "CB-AfterTax-OpenItem";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemForBruchetta);
//        String actualName1 = elementGetText(element1,"Verify CheckBasedDiscount Value Before Tax");
//        String expectedName1 = "9,69";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCheckBasedDiscountAfterTaxAndOpenItemWithDecimalNumberForBrushetta(){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemTitle);
        String actualName = elementGetText(element,"Verify text CB-AfterTax-OpenItem");
        String expectedName = "CB-AfterTax-OpenItem";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemBruchetta);
        String actualName1 = elementGetText(element1,"Verify CheckBasedDiscount Value Before Tax");
        String expectedName1 = "$ 10,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCheckBasedDiscountAfterTaxAndOpenItemWithDecimalNumberForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxWithOpenItemTitle);
        String actualName = elementGetText(element,"Verify text CB-AfterTax-OpenItem");
        String expectedName = "CB-AfterTax-OpenItem";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemBruchetta);
        String actualName1 = elementGetValue(element1,"Verify CheckBasedDiscount Value After Tax");
//        String expectedName1 = "$ 13.56";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountBeforeTaxAndOpenItemWithDecimalNumberForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemTitle);
        String actualName = elementGetText(element,"Verify text CB-BeforeTax-OpenItem");
        String expectedName = "CB-BeforeTax-OpenItem";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemBruchetta);
        String actualName1 = elementGetValue(element1,"Verify CheckBasedDiscount Value Before Tax");
//        String expectedName1 = "$ 13.56";

        Assert.assertEquals(actualName1,expectedName1);
    }


    public void verifyCheckBasedDiscountAfterTaxAndOpenItemWithWholeNumberForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxWithOpenItemTitle);
        String actualName = elementGetText(element,"Verify text CB-AfterTax-OpenItem");
        String expectedName = "CB-AfterTax-OpenItem";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemBruchetta);
        String actualName1 = elementGetValue(element1,"Verify CheckBasedDiscount Value Before Tax");
//        String expectedName1 = "$ 13.56";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountBeforeTaxAndOpenItemWithWholeNumberForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemTitle);
        String actualName = elementGetText(element,"Verify text CB-AfterTax-OpenItem");
        String expectedName = "CB-BeforeTax-OpenItem";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithOpenItemBruchetta);
        String actualName1 = elementGetValue(element1,"Verify CheckBasedDiscount Value Before Tax");
//        String expectedName1 = "$ 13.56";

        Assert.assertEquals(actualName1,expectedName1);
    }


    public void verifyCheckBasedDiscountBeforeTaxAsFreeItemForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithFreeItemTitle);
        String actualName = elementGetText(element,"Verify text CB-BeforeTax-FreeItem");
        String expectedName = "CB-BeforeTax-FreeItem";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
                ;

//      WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithFreeItemForBruchetta);
        String actualName1 = elementGetValue(element1,"Verify CheckBasedDiscount Value Before Tax WithFreeItem");
//        String expectedName1 = "0.00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountBeforeTaxAsFreeItemForBrushetta(){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithFreeItemTitle);
        String actualName = elementGetText(element,"Verify text CB-BeforeTax-FreeItem");
        String expectedName = "CB-BeforeTax-FreeItem";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithFreeItemForBruchetta);
        String actualName1 = elementGetText(element1,"Verify CheckBasedDiscount Value Before Tax WithFreeItem");
        String expectedName1 = "0,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountBeforeTaxAsSetPriceForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithSetPriceTitle);
        String actualName = elementGetText(element,"Verify text CB-BeforeTax-SetPrice");
        String expectedName = "CB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithSetPriceForBruchetta);
        String actualName1 =  elementGetValue(element1,"Verify CheckBasedDiscount Value With SetPrice");
//        String expectedName1 = "$ 0.17";

        Assert.assertEquals(actualName1,expectedName1);
    }

    //new nov 17
    public void verifyCheckBasedDiscountBeforeTaxAsSetPriceForBrushetta(){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithSetPriceTitle);
        String actualName = elementGetText(element,"Verify text CB-BeforeTax-SetPrice");
        String expectedName = "CB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedAfterTaxWithSetPriceAmountForBruchetta1);
        String actualName1 = elementGetText(element1,"Verify CheckBasedDiscount Value With SetPrice");
        String expectedName1 = "$ 970,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCheckBasedDiscountBeforeTaxAsAmountForBrushetta(){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithAmountTitle);
        String actualName = elementGetText(element,"Verify text CB-AmountBeforeTax");
        String expectedName = "CB-AmountBeforeTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithAmountForBruchetta);
        String actualName1 = elementGetText(element1,"Verify CheckBasedDiscount BeforeTax");
        String expectedName1 = "5,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountBeforeTaxAsAmountForBrushetta( String expectedName1 ){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithAmountTitle);
        String actualName = elementGetText(element,"Verify text CB-AmountBeforeTax");
        String expectedName = "CB-AmountBeforeTax";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxWithAmountForBruchetta);
        String actualName1 =  elementGetValue(element1,"Verify CheckBasedDiscount BeforeTax");
//        String expectedName1 = "0.67";

        Assert.assertEquals(actualName1,expectedName1);
    }

    //new nov 17
    public void verifyCheckBasedDiscountBeforeTaxAsPercentageForBrushetta(){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithPercentageTitle);
        String actualName = elementGetText(element,"Verify text CB-PercentageBeforeTax");
        String expectedName = "CB-PercentageBeforeTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedAmountAfterTaxForBruchetta1);
        String actualName1 = elementGetText(element1,"Verify CheckBasedDiscount BeforeTax");
        String expectedName1 = "100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountAfterTaxAsFreeItemForBrushetta(){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxWithFreeItemTitle);
        String actualName = elementGetText(element,"Verify text CB-AfterTax-FreeItem");
        String expectedName = "CB-AfterTax-FreeItem";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedAfterTaxWithFreeItemAmountForBruchetta);
        String actualName1 = elementGetText(element1,"Verify CheckBasedDiscount AfterTax");
        String expectedName1 = "0,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountAfterTaxAsFreeItemForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxWithFreeItemTitle);
        String actualName = elementGetText(element,"Verify text CB-AfterTax-FreeItem");
        String expectedName = "CB-AfterTax-FreeItem";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(checkBasedAfterTaxWithFreeItemAmountForBruchetta);
        String actualName1 =  elementGetValue(element1,"Verify CheckBasedDiscount AfterTax");
//        String expectedName1 = "0.00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCheckBasedDiscountAfterTaxAsSetPriceForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxAsSetPriceTitle);
        String actualName = elementGetText(element,"Verify text CB-AfterTax-SetPrice");
        String expectedName = "CB-AfterTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(checkBasedAfterTaxWithSetPriceAmountForBruchetta1);
        String actualName1 =  elementGetValue(element1,"Verify CheckBasedDiscount AfterTax As SetPrice");
//        String expectedName1 = "$ 0.61";

        Assert.assertEquals(actualName1,expectedName1);
    }

    //new nov 17
    public void verifyCheckBasedDiscountAfterTaxAsSetPriceForBrushetta(){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxAsSetPriceTitle);
        String actualName = elementGetText(element,"Verify text CB-AfterTax-SetPrice");
        String expectedName = "CB-AfterTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedAfterTaxWithSetPriceAmountForBruchetta1);
        String actualName1 = elementGetText(element1,"Verify CheckBasedDiscount AfterTax As SetPrice");
        String expectedName1 = "$ 970,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountAfterTaxAsAmountForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedAmountAfterTaxTitle);
        String actualName = elementGetText(element,"Verify text CheckBasedAmountAfterTax");
        String expectedName = "CheckBasedAmountAfterTax";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
//      WebElement element1 = mergeAndFindMobileElement(checkBasedAmountAfterTaxForBruchetta);
        String actualName1 = elementGetValue(element1,"Verify value CheckBasedAmountAfterTax");
//        String expectedName1 = "0.58";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountAfterTaxAsAmountForBrushetta(){
        WebElement element = mergeAndFindMobileElement(checkBasedAmountAfterTaxTitle);
        String actualName = elementGetText(element,"Verify text CheckBasedAmountAfterTax");
        String expectedName = "CheckBasedAmountAfterTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedAmountAfterTaxForBruchetta);
        String actualName1 =  elementGetValue(element1,"Verify value CheckBasedAmountAfterTax");
        String expectedName1 = "5,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //new (nov 17)
    public void verifyCheckBasedDiscountAfterTaxAsPercentageForBrushetta(){
        WebElement element = mergeAndFindMobileElement(checkBasedPercentageAfterTaxTitle);
        String actualName = elementGetText(element,"Verify text CB-PercentageAfterTax");
        String expectedName = "CB-PercentageAfterTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedAmountAfterTaxForBruchetta1);
        String actualName1 = elementGetText(element1,"Verify value CB-PercentageAfterTax");
        String expectedName1 = "100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCheckBasedDiscountAfterTaxAsPercentageForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedPercentageAfterTaxTitle);
        String actualName = elementGetText(element,"Verify text CB-PercentageAfterTax");
        String expectedName = "CB-PercentageAfterTax";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(checkBasedAmountAfterTaxForBruchetta1);
        String actualName1 = elementGetValue(element1,"Verify value CB-PercentageAfterTax");
//        String expectedName1 = "0.10";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountBeforeTaxAsPercentageForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxWithPercentageTitle);
        String actualName = elementGetText(element,"Verify text CB-PercentageBeforeTax");
        String expectedName = "CB-PercentageBeforeTax";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(checkBasedAmountAfterTaxForBruchetta1);
        String actualName1 = elementGetValue(element1,"Verify CheckBasedDiscount BeforeTax");
//        String expectedName1 = "0.10";

        Assert.assertEquals(actualName1,expectedName1);
    }


    public void verifyItemBasedDiscountBeforeTaxAsFreeItemForBrushetta(String expectedName1){

        WebElement element = mergeAndFindMobileElement(itemBasedBeforeTaxAsFreeItemTitle);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-FreeItem");
        String expectedName = "IB-BeforeTax-FreeItem";

        Assert.assertEquals(actualName,expectedName);

//      WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsFreeItemPriceForBruchetta);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName1 = elementGetValue(element1,"Verify value IB-BeforeTax-FreeItem");
//        String expectedName1 = "0.00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyItemBasedDiscountAfterTaxAsFreeItemForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(itemBasedAfterTaxAsFreeItemTitle);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-FreeItem");
        String expectedName = "IB-AfterTax-FreeItem";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
//      WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsFreeItemPriceForBruchetta);
        String actualName1 = elementGetValue(element1,"Verify value IB-BeforeTax-FreeItem");
//        String expectedName1 = "0.00";

        Assert.assertEquals(actualName1,expectedName1);
    }


    //new nov 17
    public void verifyItemBasedDiscountAfterTaxAsSetPriceForBrushetta1(String expectedName1){
        WebElement element = mergeAndFindMobileElement(itemBasedBeforeTaxAsSetPriceTitle);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-SetPrice");
        String expectedName = "IB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsSetPriceAmountBruchetta1);
        String actualName1 = elementGetValue(element1,"Verify value IB-BeforeTax-SetPrice");
//        String expectedName1 = "0.53";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyItemBasedDiscountBeforeTaxAsAmountForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxAsAmount);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-Amount");

        String expectedName = "IB-BeforeTax-Amount";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsAmountPriceBruchetta);
        String actualName1 = elementGetValue(element1,"Verify value IB-BeforeTax-Amount");
//        String expectedName1 = "1.00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //nov 17
    public void verifyItemBasedDiscountAfterTaxAsAmountForBrushetta1(String expectedName1){
       WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxAsAmount1);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-Amount");

        String expectedName = "IB-AfterTax-Amount";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsAmountPriceBruchetta);
        String actualName1 = elementGetValue(element1,"Verify value IB-BeforeTax-Amount");
//        String expectedName1 = "1.00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountBeforeTaxAsPercentageForBrushetta(String expectedName1){
       WebElement element = mergeAndFindMobileElement(itemBasedBeforeTaxPercentageText);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-Percentage");
        String expectedName = "IB-BeforeTax-Percentage";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//      WebElement element1 = mergeAndFindMobileElement(checkBasedAmountAfterTaxForBruchetta1);
        String actualName1 = elementGetValue(element1,"Verify value IB-BeforeTax-Percentage");
//        String expectedName1 = "0.10";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //new nov 17
    public void verifyItemBasedDiscountAfterTaxAsPercentageForBrushetta(String expectedName1){
        WebElement element = mergeAndFindMobileElement(itemBasedPercentageText);
        String actualName = elementGetText(element,"Verify text IB-AfterTax-Percentage");
        String expectedName = "IB-AfterTax-Percentage";
        Assert.assertEquals(actualName,expectedName);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
//      WebElement element1 = mergeAndFindMobileElement(checkBasedAmountAfterTaxForBruchetta1);
        String actualName1 = elementGetValue(element1,"Verify value IB-AfterTax-Percentage");
//        String expectedName1 = "0.10";
        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyItemBasedDiscountBeforeTaxAsFreeItemForBrushetta(){
        WebElement element = mergeAndFindMobileElement(itemBasedBeforeTaxAsFreeItemTitle);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-FreeItem");
        String expectedName = "IB-BeforeTax-FreeItem";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsFreeItemPriceForBruchetta);
        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-FreeItem");
        String expectedName1 = "0,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountBeforeTaxAsSetPriceForBrushetta(){
        WebElement element = mergeAndFindMobileElement(itemBasedBeforeTaxAsSetPriceTitle);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-SetPrice");
        String expectedName = "IB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountPriceForSetPriceForBruchetta);
        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-SetPrice");
        String expectedName1 = "400,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountAfterTaxAsFreeItemForBrushetta(){
        WebElement element = mergeAndFindMobileElement(itemBasedBeforeTaxAsFreeItemTitle);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-FreeItem");
        String expectedName = "IB-BeforeTax-FreeItem";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsFreeItemPriceForBruchetta);
        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-FreeItem");
        String expectedName1 = "0,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    //    public void verifyItemBasedDiscountAfterTaxAsSetPriceForBrushetta(){
//        WebElement element = mergeAndFindMobileElement(itemBasedBeforeTaxAsSetPriceTitle);
//        String actualName = elementGetText(element,"Verify text IB-BeforeTax-SetPrice");
//        String expectedName = "IB-BeforeTax-SetPrice";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsSetPriceAmountForBruchetta);
//        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-SetPrice");
//        String expectedName1 = "400,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyItemBasedDiscountAfterTaxAsSetPriceForBrushetta(){
        WebElement element = mergeAndFindMobileElement(itemBasedBeforeTaxAsSetPriceTitle);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-SetPrice");
        String expectedName = "IB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsSetPriceAmountBruchetta);
        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-SetPrice");
        String expectedName1 = "-500,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //new nov 17
    public void verifyItemBasedDiscountAfterTaxAsSetPriceForBrushetta1(){
        WebElement element = mergeAndFindMobileElement(itemBasedBeforeTaxAsSetPriceTitle);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-SetPrice");
        String expectedName = "IB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsSetPriceAmountBruchetta1);
        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-SetPrice");
        String expectedName1 = "0,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyItemBasedDiscountAfterTaxAsAmountForBrushetta(){
//        WebElement element = mergeAndFindMobileElement(itemBasedAfterTaxAsAmountText);
//        String actualName = elementGetText(element,"Verify text IB-AfterTax-Amount");
//
//        String expectedName = "IB-AfterTax-Amount";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsAmountPriceForBruchetta);
//        String actualName1 = elementGetText(element1,"Verify value IB-AfterTax-Amount");
//        String expectedName1 = "170,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }


    public void verifyItemBasedDiscountAfterTaxAsAmountForBrushetta(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxAsAmount);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-Amount");

        String expectedName = "IB-BeforeTax-Amount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsAmountPriceBruchetta);
        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-Amount");
        String expectedName1 = "10,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //nov 17
    public void verifyItemBasedDiscountAfterTaxAsAmountForBrushetta1(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxAsAmount1);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-Amount");

        String expectedName = "IB-AfterTax-Amount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAsAmountPriceBruchetta);
        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-Amount");
        String expectedName1 = "10,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountBeforeTaxAsPercentageForBrushetta(){
        WebElement element = mergeAndFindMobileElement(itemBasedBeforeTaxPercentageText);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-Percentage");
        String expectedName = "IB-BeforeTax-Percentage";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedAmountAfterTaxForBruchetta1);
        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-Percentage");
        String expectedName1 = "100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //new nov 17
    public void verifyItemBasedDiscountAfterTaxAsPercentageForBrushetta(){
        WebElement element = mergeAndFindMobileElement(itemBasedPercentageText);
        String actualName = elementGetText(element,"Verify text IB-AfterTax-Percentage");
        String expectedName = "IB-AfterTax-Percentage";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedAmountAfterTaxForBruchetta1);
        String actualName1 = elementGetText(element1,"Verify value IB-AfterTax-Percentage");
        String expectedName1 = "100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyServiceChargeForCocktailMenuItem(){
        WebElement element = mergeAndFindMobileElement(serviceChargeText);
        String actualName = elementGetText(element,"Verify text Service Charge");
        String expectedName = "Service Charge";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(serviceChargeAmountPrice);
        String actualName1 = elementGetText(element1,"Verify value Service Charge");
        String expectedName1 = "$ 9,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void selectDrinksCategory() throws InterruptedException {
        pressArrowDown2();
        Thread.sleep(2000);
        WebElement element = mergeAndFindMobileElement(drinksCategory);
        elementClick(element,"Select Drinks Category");
    }
    public void selectCocktailMenuItem(){
        WebElement element = mergeAndFindMobileElement(cocktailMenuItem);
        elementClick(element,"Select Cocktail MenuItem");
        WebElement element1 = mergeAndFindMobileElement(ojCoctailModifier);
        elementClick(element1,"Click Cocktail MenuItem");
        WebElement element2 = mergeAndFindMobileElement(doneButton);
        elementClick(element2,"Click Done");
    }
    public void selectBrushettaMenuItem(){
        WebElement element = mergeAndFindMobileElement(brushettaMenuItem);
        elementClick(element,"Select Brushetta MenuItem");
    }
    public void verifyItemBasedDiscountAsAmountWithSafetyLimitInDecimalPrecisionAndAfterTax(){
        WebElement element = mergeAndFindMobileElement(itemBasedAfterTaxAsAmountText);
        String actualName = elementGetText(element,"Verify text IB-AfterTax-Amount");
        String expectedName = "IB-AfterTax-Amount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedAfterTaxAsAmountPrice);
        String actualName1 = elementGetText(element1,"Verify value IB-AfterTax-Amount");
        String expectedName1 = "170,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyGiveXRechargeSuccessInfoPopup(){
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(5));
        WebElement element = mergeAndFindMobileElement(giveXRechargeSuccessPopupInfo);
        String actualName = elementGetText(element,"Verify text Recharge Success");
        String expectedName = "Recharge Success";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectTunaTacosMenuItem(){
        WebElement element = mergeAndFindMobileElement(tunaTacosMenuItem);
        elementClick(element,"Select TunaTacos MenuItem");
        WebElement element1 = mergeAndFindMobileElement(parmesanModifier);
        elementClick(element1,"Select parmesan Modifier");
        WebElement element2 = mergeAndFindMobileElement(modifierDoneButton);
        elementClick(element2,"Click Done");
    }

    public void verifyGiveXRechargeAmountOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(giveXCardNumberOnMenuItemPage1);
        String actualName = elementGetText(element,"Verify GiveX Recharge Amount");
        String expectedName = "GCX-603628237912001380863 ";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(giveXRechargeAmountOnMenuItemPage);
        String actualName1 = elementGetText(element1,"Verify GiveX Recharge Amount");
        String expectedName1 = "500,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyGiveXCardRecurringAmountOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(giveXCardNumberOnMenuItemPage);
        String actualName = elementGetText(element,"Verify GiveX CardRecurring Amount");
        String expectedName = "GC-603628394562001380850";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 = mergeAndFindMobileElement(giveXAmountOnMenuItemPage);
        String actualName1 = elementGetText(element1,"Verify GiveX CardRecurring Amount");
        String expectedName1 = "1.000,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifySplitIsNotAllowPaymentPopup(){
        /*String actualName= driver.findElement(splitNotAllowPaymentPopupText).getText();
        String expectedName="Split is not allowed, payment(s) has been made in this check";

        Assert.assertEquals(actualName,expectedName);*/
        WebElement btnDone = mergeAndFindMobileElement(doneButton);
        elementClick(btnDone,"Click Done");
    }

    public void clickAddNewCustomerButton(){
        WebElement element = mergeAndFindMobileElement(addNewCustomerButton);
        elementClick(element,"Click Add New Customer");
    }
    public void verifyTotalPriceOfOrderWhichIsAppliedFixGratuityForSandwiches(){
        WebElement element = mergeAndFindMobileElement(totalTitle);
        String actualName = elementGetText(element,"Verify text Total");
        String expectedName = "Total";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(totalPriceWithFixGratuityForSandwiches);
        String actualName1 = elementGetText(element1,"Verify Total Price Which Is Applied FixGratuity");
        String expectedName1 = "$ 1.299,99";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifySubtotalOfOrderWhichIsAppliedFixGratuityForSandwiches(){
        WebElement element = mergeAndFindMobileElement(subTotalTitle);
        String actualName = elementGetText(element,"Verify text Total");
        String expectedName = "Subtotal";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(subTotalPriceWithFixGratuityForSandwiches);
        String actualName1 = elementGetText(element1,"Verify Total Price value is applied FixGratuity");
        String expectedName1 = "$ 1.000,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyFixGratuityDiscountPriceOnMenuItemPageForSandwiches(){
        WebElement element = mergeAndFindMobileElement(gratuityAmountTitle);
        String actualName = elementGetText(element,"Verify text Gratuity");
        String expectedName = "Gratuity";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(fixGratuityAmountPrice);
        String actualName1 = elementGetText(element1,"Verify Gratuity value");
        String expectedName1 = "$ 99,99";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwiches(){
        /*String actualName = driver.findElement(tunaTacosFreeMenuItemWithSandwiches).getText();
        String expectedName = "(F) Tuna Tacos EACH";

        Assert.assertEquals(actualName,expectedName);*/

        WebElement element = mergeAndFindMobileElement(freeMenuItemAmountWithSandwiches);
        String actualName1 = elementGetText(element,"Verify ItemBased Discount BeforeTax As FreeItem");
        String expectedName1 = "629,90";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwich(){
//        WebElement element1 = mergeAndFindMobileElement(freeMenuItemAmountWithSandwich);
//        String actualName1 = elementGetText(element1,"Verify ItemBased Discount BeforeTax As FreeItem");
//        String expectedName1 = "$ 629,90";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwich(){
        WebElement element1 = mergeAndFindMobileElement(freeMenuItemAmountWithSandwich1);
        String actualName1 = elementGetText(element1,"Verify ItemBased Discount BeforeTax As FreeItem");
        String expectedName1 = "$ 1.079,90";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches(){
//        /*String actualName = driver.findElement(dietCokeFreeMenuItemWithSandwiches).getText();
//        String expectedName = "(F) Diet Coke EACH";
//
//        Assert.assertEquals(actualName,expectedName);*/
//
//        WebElement element1 = mergeAndFindMobileElement(freeMenuItemAmountWithSandwiches);
//        String actualName1 = elementGetText(element1,"Verify ItemBased Discount After Tax As Free");
//        String expectedName1 = "$ 599,90";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches(){
            /*String actualName = driver.findElement(dietCokeFreeMenuItemWithSandwiches).getText();
            String expectedName = "(F) Diet Coke EACH";

            Assert.assertEquals(actualName,expectedName);*/

        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"Verify ItemBased Discount After Tax As Free");
        String expectedName1 = "$ 999,90";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches(){
//        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxSetPrice);
//        String actualName = elementGetText(element,"Verify text IB-BeforeTax-SetPrice");
//        String expectedName = "IB-BeforeTax-SetPrice";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-SetPrice");
//        String expectedName1 = "$ 99,90";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    public void verifyItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxSetPrice);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-SetPrice");
        String expectedName = "IB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountBTAsSetPriceWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-SetPrice");
        String expectedName1 = "$ 999,90";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches(){
//        WebElement element = mergeAndFindMobileElement(itemBasedDiscountAfterTaxSetPrice);
//        String actualName = elementGetText(element,"Verify text IB-AfterTax-SetPrice");
//        String expectedName = "IB-AfterTax-SetPrice";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"Verify value IB-AfterTax-SetPrice");
//        String expectedName1 = "$ 169,90";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountAfterTaxSetPrice);
        String actualName = elementGetText(element,"Verify text IB-AfterTax-SetPrice");
        String expectedName = "IB-AfterTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"Verify value IB-AfterTax-SetPrice");
        String expectedName1 = "$ 999,90";

        Assert.assertEquals(actualName1,expectedName1);
    }

//    public void verifyItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches(){
//        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithAmount);
//        String actualName = elementGetText(element,"Verify text IB-BeforeTax-Amount");
//        String expectedName = "IB-BeforeTax-Amount";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-Amount");
//        String expectedName1 = "$ 539,90";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    //new nov 18
    public void verifyItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithAmount);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-Amount");
        String expectedName = "IB-BeforeTax-Amount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountATAsAmountWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-Amount");
        String expectedName1 = "$ 989,90";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches(){
//        WebElement element = mergeAndFindMobileElement(itemBasedAfterTaxWithAmount);
//        String actualName = elementGetText(element,"Verify text IB-AfterTax-Amount");
//        String expectedName = "IB-AfterTax-Amount";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"Verify value IB-AfterTax-Amount");
//        String expectedName1 = "$ 599,30";
//
//        Assert.assertEquals(actualName1,expectedName1);
//
//    }
    public void verifyItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches(){
        WebElement element = mergeAndFindMobileElement(itemBasedAfterTaxWithAmount);
        String actualName = elementGetText(element,"Verify text IB-AfterTax-Amount");
        String expectedName = "IB-AfterTax-Amount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountATAsAmountWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"Verify value IB-AfterTax-Amount");
        String expectedName1 = "$ 989,90";

        Assert.assertEquals(actualName1,expectedName1);

    }
    //    public void verifyItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches(){
//        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithPercentage);
//        String actualName = elementGetText(element,"Verify text IB-BeforeTax-Percentage");
//        String expectedName = "IB-BeforeTax-Percentage";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-Percentage");
//        String expectedName1 = "$ 499,90";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithPercentage);
        String actualName = elementGetText(element,"Verify text IB-BeforeTax-Percentage");
        String expectedName = "IB-BeforeTax-Percentage";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"Verify value IB-BeforeTax-Percentage");
        String expectedName1 = "$ 899,90";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountAfterTaxWithPercentage);
        String actualName = elementGetText(element,"Verify text IB-AfterTax-Percentage");
        String expectedName = "IB-AfterTax-Percentage";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"Verify value IB-AfterTax-Percentage");
        String expectedName1 = "$ 499,91";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches1(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountAfterTaxWithPercentage);
        String actualName = elementGetText(element,"Verify text IB-AfterTax-Percentage");
        String expectedName = "IB-AfterTax-Percentage";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(totalPriceOfItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"Verify value IB-AfterTax-Percentage");
        String expectedName1 = "$ 899,91";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyTaxExemptForSandwiches(){
        WebElement element = mergeAndFindMobileElement(totalTitle);
        String actualName = elementGetText(element,"Verify text Total");
        String expectedName = "Total";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(subTotalTitle);
        String actualName1 = elementGetText(element1,"Verify text Subtotal");
        String expectedName1 = "Subtotal";

        Assert.assertEquals(actualName1,expectedName1);

        WebElement element2 = mergeAndFindMobileElement(totalAmountWithTaxExempt);
        String actualName2 = elementGetText(element2,"Verify value Subtotal");
        String expectedName2 = "$ 999,90";

        Assert.assertEquals(actualName2,expectedName2);
    }

    public void verifyTotalPriceOfOrderWhichIsAppliedVaryingGratuityForSandwiches(){
        WebElement element = mergeAndFindMobileElement(totalTitle);
        String actualName = elementGetText(element,"Verify text Total");
        String expectedName = "Total";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(totalPriceWithVaryingGratuityForSandwiches);
        String actualName1 = elementGetText(element1,"Verify value Varying Gratuity");
        String expectedName1 = "$ 1.299,99";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifySubtotalOfOrderWhichIsAppliedVaryingGratuityForSandwiches(){
        WebElement element = mergeAndFindMobileElement(subTotalTitle);
        String actualName = elementGetText(element,"Verify text Subtotal");
        String expectedName = "Subtotal";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(subTotalPriceWithVaryingGratuityForSandwiches);
        String actualName1 = elementGetText(element1,"Verify value Subtotal");
        String expectedName1 = "$ 1.000,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyVaryingGratuityDiscountPriceOnMenuItemPageForSandwiches(){
        WebElement element = mergeAndFindMobileElement(varyingGratuityDiscountPriceForSandwiches);
        String actualName = elementGetText(element,"Verify value Varying Gratuity Discount Price");
        String expectedName = "$ 99,99";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyItemBasedDiscountBeforeTaxRoleRestrictDiscount(){
        WebElement element = mergeAndFindMobileElement(beforeTaxRoleRestrictionOnMenuItemPage);
        String actualName = elementGetText(element,"Verify text BeforeTaxRoleRestriction");
        String expectedName = "BeforeTaxRoleRestriction";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(beforeTaxRoleRestrictionPrice);
        String actualName1 = elementGetText(element1,"Verify value Item Based Discount");
        String expectedName1 = "100,00";

        Assert.assertEquals(actualName1,expectedName1);

    }
    public void verifyAfterTaxAsAmountSafetyLimitAsDecimalValue(){
        WebElement element = mergeAndFindMobileElement(openItemPriceTitle);
        String actualName = elementGetText(element,"Verify Test Automation");
        String expectedName = "Test Automation";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(openItemPriceAsDecimal);
        String actualName1 = elementGetText(element1,"Verify Amount Safety Limit As Decimal Value");
        String expectedName1 = "0,01";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyOrdersWhichWillBeSplit(){
        WebElement element = mergeAndFindMobileElement("(//div[@class='orderlist-container   highlight']//div[contains(.,'SANDWICHES')])[1]");
        String actualName = elementGetText(element,"Verify SANDWICHES");
        String expectedName = "SANDWICHES ";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifySplitedOrderOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(splitedOrderPrice);
        String actualName1 = elementGetText(element,"Verify value Splited Order");
        String expectedName1 = "15,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //Select table
//    public void selectTable(){
//        WebElement element = mergeAndFindMobileElement(selectTable1);
//        elementClick(element,"click table");
//    }

    //Click All tab
    public void clickAllTab(){
        WebElement tabAll = mergeAndFindMobileElement(allOptions);
        elementClick(tabAll,"Click All Tab");
    }
    //Select Table Layout tab
    public void clickTableLayoutTab(){
        WebElement tabTableLayout = mergeAndFindMobileElement(tableLayout);
        elementClick(tabTableLayout,"Select Table Layout tab");
    }
    //Click New Check button
    public void clickNewCheckButton(){
        WebElement btnNew = mergeAndFindMobileElement(newCheckTab);
        elementClick(btnNew,"Click New Check button");
    }
    //Select table
    public void selectFirstTable(){
        WebElement element = mergeAndFindMobileElement(firstTable);
        elementClick(element,"Select table");
    }
    //Enter number of seat - select 1
    public void selectNumberOfSeat(){
        WebElement element = mergeAndFindMobileElement(seatNum);
        elementClick(element,"Enter number of seat - select 1");
    }
    //Verify MenuItem Screen
    public void verifyMenuItemScreen(){
        if(qsrButton == dineIn){
            WebElement element = mergeAndFindMobileElement(dineIn);
            String actualName = elementGetText(element,"Verify text DineIn");
            String expectedName = "DineIn";
            Assert.assertEquals(actualName, expectedName);
        }
        else if(qsrButton == qsrOption){
            WebElement element = mergeAndFindMobileElement(qsrButton);
            String actualName = elementGetText(element,"Verify text QSR");
            String expectedName = "QSR";
            Assert.assertEquals(actualName, expectedName);
        }
    }
    //select merge button
    public void clickMergeButton(){
        WebElement element = mergeAndFindMobileElement(mergeButton);
        elementClick(element,"Select merge button");
    }
    //Merge Table
    public void mergeTable(){
        WebElement element = mergeAndFindMobileElement(firstTable);
        elementClick(element,"Select First Table");
        WebElement element1 = mergeAndFindMobileElement(secondTable);
        elementClick(element1,"Select Second Table");
        WebElement btnDone = mergeAndFindMobileElement(doneButton);
        elementClick(btnDone,"Click Done");
        driver.findElement(By.xpath(doneButton)).click();
    }
    //merge olan checkleri alan method yazılacak
    public void verifyMergeCheck(){
        WebElement element = mergeAndFindMobileElement(mergedChecked);
        String actualName = elementGetText(element,"Verify Merge Check");
        String expectedName = "Linga";
        Assert.assertEquals(actualName, expectedName);
    }
    //click split button
    public void clickSplitButton(){
        WebElement btnsplit = mergeAndFindMobileElement(splitButton);
        elementClick(btnsplit,"Click split button");
    }
    //select split check button
    public void selectSplitCheckOption(){
        WebElement element = mergeAndFindMobileElement(splitCheckOption);
        elementClick(element,"Click split Check Option");
    }

    public void selectSplitBySeatOption1(){
        WebElement element = mergeAndFindMobileElement(splitBySeatOption);
        elementClick(element,"Click Split By Seat Option");
    }

    public void selectMenuItemFromCheck(){
        WebElement element = mergeAndFindMobileElement(checkFirstItem);
        elementClick(element,"Select MenuItem From Check");
    }

    public void addItemToNewCheck(){
        WebElement element = mergeAndFindMobileElement(emtyCheck);
        elementClick(element,"Add Item To New Check");
    }

    public void saveAndCloseSplitedCheck(){
        WebElement element = mergeAndFindMobileElement(saveSplitedCheck);
        elementClick(element,"Save Splited Check");
    }

    public void verifyOrdersWithSeat(){
        WebElement element = mergeAndFindMobileElement(seatOne);
        String actualName = elementGetText(element,"Select Seat One");
        String expectedName = "Seat 1";

        WebElement element1 = mergeAndFindMobileElement(seatTwo);
        String actualName1 = elementGetText(element1,"Select Seat Two");
        String expectedName1 = "Seat 2";

        WebElement element2 = mergeAndFindMobileElement(firstOrderOnSeatOne);
        String actualName2 = elementGetText(element2,"SANDWICHES");
        String expectedName2 = "SANDWICHES";
    }
    public void splitCheck(){
        WebElement element = mergeAndFindMobileElement(addSplitCheckButton);
        elementClick(element,"Split Check");

        WebElement element1 = mergeAndFindMobileElement(newSplitCheck);
    }
    public void selectMenuItemAndOrder(){
        WebElement element = mergeAndFindMobileElement(foodTab);
        elementClick(element,"Select MenuItem And Order");

        WebElement element1 = mergeAndFindMobileElement(firstMenuItem);
        elementClick(element1,"Select MenuItem And Order");

        WebElement element2 = mergeAndFindMobileElement(orderButton);
        elementClick(element2,"Click Order");
    }
    public void clickCashTab(){
        WebElement element = mergeAndFindMobileElement(cashTab);
        elementClick(element,"Click Cash Tab");
    }
    public void clickOptionTab(){
        WebElement element = mergeAndFindMobileElement(optionTab);
        elementClick(element,"Click Option Tab");
    }
    public void clickTransferButton(){
        WebElement element = mergeAndFindMobileElement(transferButton);
        elementClick(element,"Click Transfer Button");
    }
    public void clickTransferToTable(){
        WebElement element = mergeAndFindMobileElement(transferToTableOption);
    }
    public void selectTransferFromTable(){
        WebElement element = mergeAndFindMobileElement(transferedFromTable);
        elementClick(element,"Select Transfer From Table");
    }
    public void selectTransferToTable(){
        WebElement element = mergeAndFindMobileElement(willBeTransferredTable);
        elementClick(element,"Select Transfer To Table");
    }
    public void selectTransferedCheck() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = mergeAndFindMobileElement("//div[@class='transfer-checks']//p[.='"+ TestUtils.globalCheckNumber +"']");
        elementClick(element,"Select Transfered Check");
    }
    public void clickTransferDone(){
        WebElement element = mergeAndFindMobileElement(transferDone);
        elementClick(element,"Click Transfer Done");
    }
    public void verifySuccessTransferredPopup(){
        WebElement element = mergeAndFindMobileElement(successPopup);
        String actualName = elementGetText(element,"Verify Transferred Successfully");
        String expectedName = "Transferred Successfully";
        Assert.assertEquals(actualName, expectedName);

        WebElement element1 = mergeAndFindMobileElement(successPopup);
        elementClick(element1,"Success Popup");
    }
    public void clickPayCheck(){
        try {
            WebElement element = mergeAndFindMobileElement(payCheckButton);
            elementClick(element, "Click Pay Check");

        }
        catch(Exception e){

            utils.log().info("Paycheck button not clicked");
        }
    }

    public void clickPayCheck1() throws InterruptedException {
        Thread.sleep(2000);

            WebElement element = mergeAndFindMobileElement("//button[contains(.,'Pay Check')]");
            elementClick(element, "Click Pay Check");

    }

    public void selectPayCheck(){
        WebElement element = mergeAndFindMobileElement(selectPayCheck);
        elementClick(element,"Select Pay Check");
    }
    public void clickPopupMenu(){
        WebElement element = mergeAndFindMobileElement(arrowDown);
        elementClick(element,"Click Popup Menu");
    }
    public void verifyCategoryWithPopupMenu(){
        WebElement element = mergeAndFindMobileElement(firstCategory);
        String actualName = elementGetText(element,"Verify First Category");
        WebElement element1 = mergeAndFindMobileElement(firstCategory);
        String expectedName = elementGetText(element1,"Verify First Category Popup");
        Assert.assertEquals(actualName, expectedName);
        WebElement element2 = mergeAndFindMobileElement(firstCategoryOnPopup);
        elementClick(element2,"Click First Category Popup");
    }

    @FindBy(xpath = "//button[@id='os_addSeat']")
    WebElement addSeatBtn;
    public void clickAddSeatButton(){

        elementClick(addSeatBtn,"Click Add Seat Button");
    }
    public void verifyAddedSeat(){
        WebElement element = mergeAndFindMobileElement(addedSeat);
        String actualName = elementGetText(element,"Verify Added Seat");
        String expectedName = "2";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickCustomerButton(){
        WebElement element = mergeAndFindMobileElement(customerButton);
        elementClick(element,"Click Customer Button");
    }
    public void clickAddCustomerButton(){
        WebElement element = mergeAndFindMobileElement(addNewCustomer);
        elementClick(element,"Click Add Customer Button");
    }
    public void clickDeleteSeatButton(){
        WebElement element = mergeAndFindMobileElement(deleteSeat);
        elementClick(element,"Click Delete Seat Button");
    }

    public void clickEditDoneButton(){
        WebElement element = mergeAndFindMobileElement("//button[@class='done']");
        elementClick(element,"Click Edit Done Button");
    }
    //new nov18
    public void clickEditDoneButton1(){
        waitForVisibility(By.xpath(giftCardDone));
        WebElement element = mergeAndFindMobileElement(giftCardDone);
        elementClick(element,"Click Edit Done Button");
    }

    public void visibleCheck(){
        WebElement element = mergeAndFindMobileElement(currentSeat);
    }
    public void clickQsrOption(){
        WebElement element = mergeAndFindMobileElement(qsrButton);
        elementClick(element,"Click QSR Option");
    }
    public void selectDineInOrderType(){
        WebElement element = mergeAndFindMobileElement(dineInOrderType);
        elementClick(element,"Select DineIn OrderType");
    }

    public void clickFinishButton(){
        WebElement element = mergeAndFindMobileElement(finishButton);
        elementClick(element,"Click Finish Button");
    }
    public void clickSplitButtonOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(splitButtonOnMenuItem);
        elementClick(element,"Click Split Button On MenuItem Page");
    }
    public void clickSplitCheckOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(splitCheckOptionButton);
        elementClick(element,"Click SplitCheck On MenuItem Page");
    }
    public void clickSplitBySeatOptionOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(splitBySeatOptionOnMenuItemPage);
        elementClick(element,"Click SplitBySeat On MenuItem Page");
    }
    public void clickPaymentButtonOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(paymentButtonOnMenuItemPage);
        elementClick(element,"Click Payment Button On MenuItem Page");
    }
    public void selectMenuItem(){
        WebElement element = mergeAndFindMobileElement(firstMenuItem);
        elementClick(element,"Select MenuItem");
    }
    public void selectThirdMenuItem(){
        WebElement element = mergeAndFindMobileElement(thirdMenuItem);
        elementClick(element,"Select Third MenuItem");
    }
    public void selectFourthMenuItem(){
        WebElement element = mergeAndFindMobileElement(fourthMenuItem);
        elementClick(element,"Select Fourth MenuItem");

        WebElement element1 = mergeAndFindMobileElement(noneOptionForFourthMenuItem);
        elementClick(element1,"Select None Option for Fourth MenuItem");

//        WebElement btnDone = mergeAndFindMobileElement(doneButton);
//        elementClick(btnDone,"Click Done");
    }
    public void clickModifierDoneButton(){
        WebElement element = mergeAndFindMobileElement(modifierDoneButton);
        elementClick(element,"Click Modifier Done Button");
    }
    public void clickVoidButton(){
        WebElement element = mergeAndFindMobileElement(voidButton);
        elementClick(element,"Click Void Button");
    }
    public void closeVoidPopup(){
        WebElement element = mergeAndFindMobileElement(doneVoidInfoPopup);
        elementClick(element,"Click Done");
    }
    public void verifyVoidItem(){
        WebElement element = mergeAndFindMobileElement(emptyCheck);
        String actualName = elementGetText(element,"Verify Void Item");
        String expectedName = "No orders to display";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickCashButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath(cashButtonOnMenuItem));
        elementClick(element,"Click Cash Button");
    }
    public void selectFirstSeat(){
        WebElement element = mergeAndFindMobileElement(firstSeatOnMenuItem);
        elementClick(element,"Select First Seat");
    }
    public void selectQsrOption(){
        WebElement element = mergeAndFindMobileElement(qsrOption);
        elementClick(element,"Select Qsr Option");
    }
    public void clickDiscountTab(){
        WebElement element = mergeAndFindMobileElement(discountOption);
        elementClick(element,"Click Discount Tab");
    }
    public void verifyOpenCheckDiscountAmount(){
        String actualName = driver.findElement(By.xpath(openCheckDiscountTitle)).getText();
        String expectedName = "Open Check Discount";
        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyMenuItemPageWithEntree(){
        WebElement element = mergeAndFindMobileElement(entreeTitleOnMenuItemPage);
        String actualName = elementGetText(element,"Verify MenuItem Page With Entree");
        String expectedName = "ENTREE";
        Assert.assertEquals(actualName,expectedName);
    }
    public void emptyCheckPopup(){
        WebElement element = mergeAndFindMobileElement(emptyCheckPopup);
        elementClick(element,"Empty Check Popup");

        WebElement element1 = mergeAndFindMobileElement(emptyCheckDoneButton);
        elementClick(element1," Done Popup");
    }

    public void clickHoldManualOption() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//span[.=' Manual ']"));
        elementClick(element, "click holdManualOption ");

        WebElement element1 = mergeAndFindMobileElement(holdManuelDoneButton);
        elementClick(element1, "click holdManuelDoneButton ");

    }

    public void clickDoneButton() throws InterruptedException {
        Thread.sleep(2000);
        WebElement DoneBtn = driver.findElement(By.xpath("//span[.='Done']"));
        DoneBtn.click();
    }
    public void selectSecondSeat(){
        WebElement element = mergeAndFindMobileElement(secondSeatOnMenuItem);
        elementClick(element,"Select Second Seat");
    }
    public void selectMenuItemHasModifier() throws InterruptedException {
        pressArrowDown2();
        WebElement element = mergeAndFindMobileElement(foodTab);
        elementClick(element,"Food Tab");
        WebElement element1 = mergeAndFindMobileElement(firstOrderWithModifier);
        elementClick(element1,"First Order With Modifier");
    }
    public void selectSecondMenuItemHasModifier() throws InterruptedException {
        pressArrowDown2();
        WebElement element = mergeAndFindMobileElement(foodTab);
        elementClick(element,"Food Tab");
        WebElement element1 = mergeAndFindMobileElement(secondMenuItemHasModifier);
        elementClick(element1,"Second Item With Modifier");
    }

    public void selectFirstModifier(){
        WebElement element = mergeAndFindMobileElement(firstModifierOfFirstItemName);
        elementClick(element,"Select First Modifier");
        WebElement element1 = mergeAndFindMobileElement(firstModifierOfThirdMenuItem);
        elementClick(element1,"Select First Modifier Of Third MenuItem");
    }
    public void selectFirstModifierOfThirdMenuItem(){
        WebElement element = mergeAndFindMobileElement(firstModifierOfThirdMenuItem);
        elementClick(element,"Select First Modifier Of Third MenuItem");
    }
    public void modifierDoneButton(){
        WebElement element = mergeAndFindMobileElement(modifierDone);
        elementClick(element,"Click Done");
    }
    public void clickModifyButton(){
        WebElement element = mergeAndFindMobileElement(modifyButton);
        elementClick(element,"Click Modify Button");
    }
    public void selectFirstOrderWithModifier(){
        WebElement element = mergeAndFindMobileElement(selectedOrderWithModifier);
        elementClick(element,"Select First Order With Modifier");
    }
    //    public void verifyAddedModifier(){
//        WebElement element = mergeAndFindMobileElement(selectedModifierInOrderPage);
//        String actualName = elementGetText(element,"Verify Added Modifier");
//        String expectedName = "Add Veggies";
//        Assert.assertEquals(actualName,expectedName);
//    }
    public void verifyAddedModifier(){
        WebElement element = mergeAndFindMobileElement(addedModifierInMenuItemPage);
        String actualName = elementGetText(element,"Verify Added Modifier");
        String expectedName = "Add Veggies";
        Assert.assertEquals(actualName,expectedName);
    }
    public void addMaximumModifier(){
        WebElement element = mergeAndFindMobileElement(addedModifier);
        elementClick(element,"Add Maximum Modifier");
        WebElement element1 = mergeAndFindMobileElement(addedModifier);
        elementClick(element1,"Add Maximum Modifier");
    }
//    public void verifyMaximumCount(){
//        WebElement element = mergeAndFindMobileElement(maximumCountPopup);
//        String actualName = elementGetText(element,"Verify Maximum Count");
//        String expectedName = "You reached the maximum count";
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(doneButton);
//        elementClick(element1,"Click Done");
//    }

    public void verifyMaximumCount(){
        WebElement element = mergeAndFindMobileElement(maximumCountText);
        String actualName = elementGetText(element,"Verify Maximum Count");
        String expectedName = "You reached maximum count";
        Assert.assertEquals(actualName,expectedName);

//        WebElement element1 = mergeAndFindMobileElement(doneButton);
//        elementClick(element1,"Click Done");
    }
    public void addMaximumCountModifier(){
        WebElement element = mergeAndFindMobileElement(addMaximumCountModifier);
        elementClick(element,"Add Maximum Count Modifier");
        WebElement element1 = mergeAndFindMobileElement(addMaximumCountModifier);
        elementClick(element1,"Add Maximum Count Modifier");
    }
    public void addFirstModifierMaximumCountOfSecondMenuItem(){
        for (int i = 0; i < 3; i++){
            //click the button
            WebElement element = mergeAndFindMobileElement(firstModifierForSecondMenuItem);
            elementClick(element,"Add Maximum Count Modifier Second MenuItem");
        }
    }
    public void orderedAfterModifierPopup(){
        WebElement element = mergeAndFindMobileElement(orderedAfterModifyPopup);
        String actualName = elementGetText(element,"Ordered After Modifier Popup");
        String expectedName = "Cannot add modifiers, item already send to kitchen";
        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(orderedAfterModifyPopupDoneButton);
        elementClick(element1,"Click Done");
    }
    public void clickOrderButton(){
        WebElement element1 = mergeAndFindMobileElement(orderButton);
        elementClick(element1,"Click Order Button");
    }
    public void verifyFixedGratuity(){
        WebElement element = mergeAndFindMobileElement(gratuityAmountTitle);
        String fixGratuity = elementGetText(element,"verifyFixedGratuity");
        WebElement element1 = mergeAndFindMobileElement(fixGratuityAmount);
        String actualName = elementGetText(element1,"fixGratuityAmount");
        String expectedName = "$ 99,99";
        Assert.assertEquals(actualName,expectedName);
        fixGratuity.equals(actualName);
    }

    // Nov 16
    public void verifyFixedGratuity1() throws InterruptedException {
        Thread.sleep(2000);
//        WebElement element = mergeAndFindMobileElement(gratuityAmountTitle);
//        String fixGratuity = elementGetText(element,"verifyFixedGratuity");
        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_gratuityAmountStr']//input"));
        String actualName = elementGetValue(element1,"fixGratuityAmount");
        String expectedName = "$ 0.90";
        Assert.assertEquals(actualName,expectedName);

    }
    public void verifyVaryingGratuity(){
//        WebElement element = mergeAndFindMobileElement(gratuityAmountTitle);
//        String fixGratuity = elementGetText(element,"Verify Varying Gratuity");

        WebElement element1= mergeAndFindMobileElement(varyingGratuityAmount);
        String actualName = elementGetText(element1,"Varying Gratuity Amount");
        String expectedName = "$ 149,99";
        Assert.assertEquals(actualName,expectedName);
//        fixGratuity.equals(actualName);
    }
    public void verifyDeletedGratuity() throws InterruptedException {
         Thread.sleep(1000);
        WebElement element1 = driver.findElement(By.xpath(withoutGratuityTotalAmount));
        utils.log().info(element1.getAttribute("value"));
        utils.log().info(element1.getText());
        String actualName1 = elementGetValue(element1,"Verify Deleted Gratuity");
        String expectedName1= "$ 1.00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyServiceCharge(){
        WebElement element = mergeAndFindMobileElement(serviceCharge);
        String actualName = elementGetText(element,"Verify Service Charge");

        WebElement element1 = mergeAndFindMobileElement(serviceChargeAmount);
        String expectedName = elementGetText(element1,"Verify Service Charge Amount");
        actualName.equals(expectedName);
    }
    public void verifyDeletedServiceCharge(){
        WebElement element = mergeAndFindMobileElement(serviceChargeRemoveMessage);
        WebElement element1 = mergeAndFindMobileElement(serviceChargeRemoveDoneButton);
        elementClick(element1,"Click Done");
    }
    public void selectSearchItemOption(){
        WebElement element = mergeAndFindMobileElement(searchItemOption);
        elementClick(element,"Select Search Item Option");
    }
    public void NotSearchedMenuItem(){
        WebElement searchMenuItem = mergeAndFindMobileElement(searchTextBox);
        elementClick(searchMenuItem,"Search MenuItem");
        searchMenuItem.sendKeys("Automation");
    }
    public void searchedMenuItem(){
        WebElement searchMenuItem = mergeAndFindMobileElement(searchTextBox);
        elementClick(searchMenuItem,"Search MenuItem");
        searchMenuItem.sendKeys("Sandwiches");
    }
    public void verifiedSearchedMenuItem(){
        WebElement element = mergeAndFindMobileElement(searchResultHasMenuItem);
        String actualName = elementGetText(element,"Verified Searched MenuItem");
        String expectedName = "SANDWICHES";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifiedSearchedNoMenuItem(){
        WebElement element = mergeAndFindMobileElement(searchResultHasNoMenuItem);
        String actualName = elementGetText(element,"Verified Searched No MenuItem");
        WebElement element1 = mergeAndFindMobileElement(searchResultHasNoMenuItem);
        String expectedName = elementGetText(element1,"Verified Searched No MenuItem");

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectUpchargeMenuItem(){
        WebElement element = mergeAndFindMobileElement(upchargeWithoutModifierMenuItem);
        elementClick(element,"Search Upcharge MenuItem");
    }
    public void selectOrderTab() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = mergeAndFindMobileElement(orderButton);
        elementClick(element,"Search OrderTab");
    }
    public void verifyUpchargeMenuItem() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("(//div[(@class='p-col-4 orderlist-menuname')])[1]"));
        String actualName = elementGetText(element,"Verify Upcharge MenuItem");
        String expectedName = "SANDWICHES";

        Assert.assertEquals(actualName,expectedName);
    }

    public void selectUpchargeMenuItemWithModifier(){
        WebElement element = mergeAndFindMobileElement(upchargeWithModifierMenuItem);
        elementClick(element,"Search Upcharge MenuItem WithModifier");
    }
    public void verifyUpchargeMenuItemWithModifier() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("(//div[(@class='p-col-4 orderlist-menuname')])[2]"));
        String actualName = elementGetText(element,"Verify Upcharge MenuItem WithModifier");
        String expectedName = "Sandwiches Upcharge Add Modifier";

        Assert.assertEquals(actualName,expectedName);
    }

    public void selectLastClosedOrder(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
    }
    public void selectLastTableServiceClosedOrder(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Dine In\"])[1]");
        phoneOrders.get(phoneOrders.size() - 1).click();
    }

    public void selectLastBarTabServiceClosedOrder(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[2]");
        phoneOrders.get(phoneOrders.size() - 1).click();
    }
    public void addNewCustomerIcon(){
        WebElement element = mergeAndFindMobileElement(addNewCustomerTab);
        elementClick(element,"Add New Customer Icon");
    }
    public void clickSelectedCustomer(){
        WebElement element = mergeAndFindMobileElement(selectedCustomer);
        elementClick(element,"Click Selected Customer");
    }
    public void verifyAddedCustomer(){
        WebElement element = mergeAndFindMobileElement(addedCustomer);
        String actualName = elementGetText(element,"Verify Added Customer");
        String expectedName = "Test A";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickTillManagementButton(){
        WebElement element = mergeAndFindMobileElement(tillManagementButton);
        elementClick(element,"Click TillManagement Button");
    }
    public void clickSettingButton(){
        WebElement element = mergeAndFindMobileElement(settingIcon);
        elementClick(element,"Click Setting Button");
    }
    public void verifySettingOptions(){
        WebElement element = mergeAndFindMobileElement(operationMenuTitle);
        String actualName = elementGetText(element,"Verify Setting Options");
        String expectedName = "Operation";
        Assert.assertEquals(actualName,expectedName);
    }
    public void clickSyncIcon(){
        WebElement element = mergeAndFindMobileElement(syncIcon);
        elementClick(element,"Click Sync Icon");
    }
    public void verifySyncInfo(){
        WebElement element = mergeAndFindMobileElement(syncInfo);
        String actualName = elementGetText(element,"Verify Sync Info");
        String expectedName = "Your iPad is up to date";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickLogOffButton(){
        WebElement element = mergeAndFindMobileElement(logOffButton);
        elementClick(element,"Click LogOff Button");
    }
    public void verifyFreeItem(){
        WebElement element = mergeAndFindMobileElement(freeMenuItem);
        String actualName = elementGetText(element,"Verify Free Item");
        String expectedName = "(F)Garlic Bread EACH";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyOpenItem(){
        WebElement element = mergeAndFindMobileElement(openItem);
        String actualName = elementGetText(element,"Verify OpenItem");
        String expectedName = "Test Automation ";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(openItemPrice);
        String actualName1 = elementGetText(element1,"Verify OpenItem Value");
        String expectedName1 = "10,05";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyTotalAmountWithTax(){
        WebElement element = mergeAndFindMobileElement(totalAmountWithTax);
        String actualName = elementGetText(element,"Verify Total Amount With Tax");
        String expectedName = "$ 1.100,00";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyTotalAmountWithoutTaxExempt(){
        WebElement element = mergeAndFindMobileElement(totalAmountWithoutTax);
        String actualName = elementGetText(element,"Verify Total Amount Without TaxExempt");
        String expectedName = "$ 999,90";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyCheckBasedAmountDiscountType(){
//        WebElement element = mergeAndFindMobileElement(checkBasedAmountTitle);
//        String actualName = elementGetText(element,"Verify CheckBased Amount Discount Type")
        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String expectedName = elementGetValue(element1,"Verify CheckBased Amount Discount Type");
        String actualName = "$ 10.00";
       Assert.assertEquals(expectedName,actualName);
    }
    //    public void verifyCheckBasedPercentageDiscountType(){
//        WebElement element = mergeAndFindMobileElement(checkBasedDiscountPercentageAmount);
//        String actualName = elementGetText(element,"Verify CheckBased Percentage Discount Type");
//        String expectedName = "$ 460,00";
//
//        Assert.assertEquals(actualName,expectedName);
//    }
    public void verifyCheckBasedPercentageDiscountType(){
        WebElement element =driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName = elementGetValue(element,"Verify CheckBased Percentage Discount Type");
        //        String expectedName = "$ 460,00";
        String expectedName = "$ 0.21";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyCheckBasedFreeOptionDiscount(){
//        WebElement element = mergeAndFindMobileElement(checkBasedFreeTitle);
//        String actualName = elementGetText(element,"Verify CheckBased Free Option Discount");
        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String expectedName = elementGetValue(element1,"Verify CheckBased Free Option Discount");
        String expectedName1 = "$ 0.00";
        Assert.assertEquals(expectedName1,expectedName);
    }
    public void verifyCheckBasedSetPriceDiscount(){
        WebElement element = mergeAndFindMobileElement(checkBasedSetPriceTitle);
        String actualName = elementGetText(element,"Verify CheckBased SetPrice Discount");
        WebElement element1 = mergeAndFindMobileElement(checkBasedSetPriceAmount);
        String expectedName = elementGetText(element1,"Verify CheckBased SetPrice Discount");
        actualName.equals(expectedName);
    }
    public void verifyItemBasedAmountDiscountType(){
        WebElement element = mergeAndFindMobileElement(itemBasedAmountTitle);
        String actualName = elementGetText(element,"Verify Item Based Amount Discount Type");
        WebElement element1 = mergeAndFindMobileElement(itemBasedAmount);
        String expectedName = elementGetText(element1,"Verify Item Based Amount Discount Type");
        actualName.equals(expectedName);
    }
    public void verifyItemBasedPercentageDiscountType(){
        WebElement element = mergeAndFindMobileElement(itemBasedPercentageTitle);
        String actualName = elementGetText(element,"Verify Item Based Percentage Discount Type");
        WebElement element1 = mergeAndFindMobileElement(itemBasedPercentageAmount);
        String expectedName = elementGetText(element1,"Verify Item Based Percentage Discount Type");
        actualName.equals(expectedName);
    }
    public void verifyItemBasedFreeOptionDiscountType(String expectedName){
//        WebElement element1 = mergeAndFindMobileElement(itemBasedFreeAmount);
//        String freeItem = elementGetText(element1,"applied - ");

        WebElement element =  driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container')]//div[contains(.,'Free Item')])[1]//div[5]"));

        String actualName = elementGetText(element,"Verify Item Based FreeOption Discount Type");
//        String expectedName = "0.00";

        Assert.assertEquals(actualName,expectedName);
    }

    public void verifyItemBasedFreeOptionDiscountType1(String expectedName) {
//        WebElement element1 = mergeAndFindMobileElement(itemBasedFreeAmount);
//        String freeItem = elementGetText(element1,"applied - ");

        WebElement element = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

        String actualName = elementGetValue(element, "Verify Item Based FreeOption Discount Type");
//        String expectedName = "0.00";

        Assert.assertEquals(actualName, expectedName);
    }

    public void verifyItemBasedFreeOptionDiscountType2(String expectedName) {
//        WebElement element1 = mergeAndFindMobileElement(itemBasedFreeAmount);
//        String freeItem = elementGetText(element1,"applied - ");

        WebElement element = driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container')]//div[contains(.,'Item-Based with Free')])[1]//div[5]"));

        String actualName = elementGetText(element, "Verify Item Based FreeOption Discount Type");
//        String expectedName = "0.00";

        Assert.assertEquals(actualName, expectedName);
    }
    public void verifyItemBasedFreeOptionDiscountType(){
        WebElement element = mergeAndFindMobileElement(itemBasedFreeAmount);
        String actualName = elementGetText(element,"Verify Item Based FreeOption Discount Type");
        String expectedName = "0,00";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectAutoDiscountMenuItem(){
        WebElement element = mergeAndFindMobileElement(autoDiscountMenuItem);
        elementClick(element,"select Auto Discount MenuItem");
    }
    public void verifyAutoDiscount(){
        WebElement element = mergeAndFindMobileElement(autoDiscountAmountOnList);
        String actualName = elementGetText(element,"Verify Auto Discount");
        WebElement element1 = mergeAndFindMobileElement(discountAmountForAutoDiscount);
        String expectedName = elementGetText(element1,"Verify Auto Discount");
        actualName.equals(expectedName);
    }
    public void verifyAddedNewSeat(){
        ArrayList<String>seat = new ArrayList<>();
        //final String table = seat.get(seat.size());
        System.out.println("There have: "+seat);

        if (seat != null && !seat.isEmpty()) {
            System.out.println("Seat number: ");
            System.out.println(seat.get(seat.size()-1));
        }

        /*ArrayList to Array Conversion */
        String array[] = new String[seat.size()];
        for(int j =0;j<seat.size();j++){
            array[j] = seat.get(j);
        }

        /*Displaying Array elements*/
        for(String lastSeat: array)
        {
            System.out.println(lastSeat);
        }
        WebElement element = mergeAndFindMobileElement(lastSeat);
        elementClick(element,"Last Seat");
    }
    public void clickDownArrowIcon(){
        WebElement element = mergeAndFindMobileElement(downArrowIcon);
        elementClick(element,"Click Down Arrow Icon");
    }
    public void seatEditButton(){
        WebElement element = mergeAndFindMobileElement(editSeatButton);
        elementClick(element,"Click Seat Edit Button");
    }
    public void selectLastSeatForDelete(){
        WebElement element = mergeAndFindMobileElement(lastSeat);
        elementClick(element,"select Last Seat For Delete");
    }

    //new nov 25
    public void selectToBeDeletedSeat(){
        WebElement element = mergeAndFindMobileElement(deleteTheSeat);
        elementClick(element,"Select ToBe Deleted Seat");
    }
    public void clickDoneButtonForDelete(){
        WebElement element = mergeAndFindMobileElement(editDoneButton);
        elementClick(element,"Click Done");
    }
    public void clickUpArrowIcon(){
        WebElement element = mergeAndFindMobileElement(upArrowIcon);
        elementClick(element,"Click UpArrow Icon");
    }
    public void verifyExistingSeat(){
        WebElement element = mergeAndFindMobileElement(secondSeatOnMenuItem);
        String actualName = elementGetText(element,"Verify Existing Seat");
        String expectedName = "2";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyDeletedSeat(){
        WebElement element = mergeAndFindMobileElement(firstSeatOnMenuItem);
        String iCount = elementGetText(element,"Verify Deleted Seat");
        if(!"2".equals(iCount))
        {
            System.out.println("last seat is deleted");
        }
    }
    public void clickAddSeatButtonOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(addSeat);
        elementClick(element,"Click Add Seat Button");
    }
//    public void verifyItemBasedInclusiveTax(){
//        WebElement element = mergeAndFindMobileElement(taxTitle);
//        String actualName = elementGetText(element,"Verify ItemBased Inclusive Tax");
//        WebElement element1 = mergeAndFindMobileElement(inclusiveTaxAmount);
//        String expectedName = elementGetText(element1,"Verify ItemBased Inclusive Tax");
//        actualName.equals(expectedName);
//    }

    //(tax xpath changes 11 nov)
    public void verifyItemBasedInclusiveTax(){
        WebElement element = driver.findElement(By.xpath("//p[@id='os_taxAmount']"));
        String actualName1 = elementGetText(element,"Verify ItemBased Inclusive Tax");
        String expectedName1="Tax";
        Assert.assertEquals(actualName1,expectedName1);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = element1.getAttribute("value");
        String expectedName="$ 0.00";
        Assert.assertEquals(actualName,expectedName);
    }
    public void selectDeliveryOption(){
        WebElement element = mergeAndFindMobileElement(deliveryOption);
        elementClick(element,"select Delivery Option");
    }
    public void selectBarTabOption(){
        WebElement element = mergeAndFindMobileElement(barTabOption);
        elementClick(element,"select BarTab Option");
    }
//    public void verifyItemBasedExclusiveTax(){
//        WebElement element = mergeAndFindMobileElement(taxTitle);
//        String actualName = elementGetText(element,"Verify ItemBased Exclusive Tax");
//        WebElement element1 = mergeAndFindMobileElement(exclusiveTaxAmount);
//        String expectedName = elementGetText(element1,"Verify ItemBased Exclusive Tax");
//        actualName.equals(expectedName);
//    }

    // (tax xpath changes nov 11)
    public void verifyItemBasedExclusiveTax(){
        WebElement element = driver.findElement(By.xpath("//p[@id='os_taxAmount']"));
        String actualName1 = elementGetText(element,"Verify ItemBased Inclusive Tax");
        String expectedName1="Tax";
        Assert.assertEquals(actualName1,expectedName1);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = element1.getAttribute("value");
        String expectedName="$ 0.00";
        Assert.assertEquals(actualName,expectedName);
    }
//    public void verifyItemBasedQuantityTax(){
//        WebElement element = mergeAndFindMobileElement(taxTitle);
//        String actualName = elementGetText(element,"Verify ItemBased Quantity Tax");
//        WebElement element1 = mergeAndFindMobileElement(quantityTaxAmount);
//        String expectedName = elementGetText(element1,"Verify ItemBased Quantity Tax");
//        actualName.equals(expectedName);
//    }

    public void verifyItemBasedQuantityTax(){
        WebElement element = driver.findElement(By.xpath("//p[@id='os_taxAmount']"));
        String actualName1 = elementGetText(element,"Verify ItemBased Inclusive Tax");
        String expectedName1="Tax";
        Assert.assertEquals(actualName1,expectedName1);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = element1.getAttribute("value");
        String expectedName="$ 0.00";
        Assert.assertEquals(actualName,expectedName);
//        WebElement element = mergeAndFindMobileElement(taxTitle);
//        String actualName = elementGetText(element,"Verify ItemBased Quantity Tax");
//        WebElement element1 = mergeAndFindMobileElement(quantityTaxAmount);
//        String expectedName = elementGetText(element1,"Verify ItemBased Quantity Tax");
//        actualName.equals(expectedName);
    }
    public void verifyNewlyAddedCustomer(){
        WebElement element = mergeAndFindMobileElement(newlyAddedCustomer);
        String actualName = elementGetText(element,"Verify Newly Added Customer");
        String expectedName = "Test A";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickCustomerRemoveButton(){
        WebElement element = mergeAndFindMobileElement(removeCustomerButton);
        elementClick(element,"Click Customer Remove Button");
    }
    //    public void selectExistingCustomer(){
//        WebElement element = mergeAndFindMobileElement(existingCustomer);
//        elementClick(element,"Select Existing Customer");
//        WebElement element1 = mergeAndFindMobileElement(existingCustomer);
//        elementClick(element1,"Select Existing Customer");
//    }
    public void selectExistingCustomer(){
        WebElement element = mergeAndFindMobileElement(existingCustomerName);
        elementClick(element,"Select Existing Customer");
//        WebElement element1 = mergeAndFindMobileElement(existingCustomer);
//        elementClick(element1,"Select Existing Customer");
    }
    public void verifyCloseSalePopUpInfo(){
        WebElement element = mergeAndFindMobileElement(closeSaleInfoPopUp);
        String actualName = elementGetText(element,"Verify Close Sale PopUp Info");
        String expectedName = "close the sale";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifySyncPopUpInfo(){
        WebElement element = mergeAndFindMobileElement(syncInfoPopUp);
        String actualName = elementGetText(element,"Verify Sync PopUp Info");
        String expectedName = "Please close the sale to sync the data";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectServiceType(){
        WebElement element = driver.findElement(By.xpath(serviceTypeButton));
        element.isEnabled();
        elementClick(element,"Select Service Type");
    }
    public void verifyFirstServiceType(){
        WebElement element = mergeAndFindMobileElement(qsrButton);
        String actualName = elementGetText(element,"Verify First Service Type");
        String expectedName = "QSR";

        Assert.assertEquals(actualName,expectedName);
    }
    public void enterCategoryOrSubCategoryForSearch(){
        WebElement element = mergeAndFindMobileElement(searchTextBox);
        element.sendKeys("BEVERAGES");
    }
    public void verifySearchCategoryInfoMessage(){
        WebElement element = mergeAndFindMobileElement(searchCategoryInfoMessage);
        String actualName = elementGetText(element,"Verify Search Category Info Message");
        String expectedName = "______ NO MENU ITEMS FOUND IN \"BEVERAGES\" ______";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectFirstAddedCustomer(){
        WebElement element = mergeAndFindMobileElement(firstAddedCustomer);
        elementClick(element,"Select First Added Customer");
    }
    //    public void clickSelectedFirstCustomer(){
//        WebElement element = mergeAndFindMobileElement(selectFirstCustomer);
//        elementClick(element,"Click Selected First Customer");
//    }
    public void clickSelectedFirstCustomer(){
//        WebElement element = mergeAndFindMobileElement(firstCustomer);
//        elementClick(element,"Click Selected First Customer");
        findandclickM(By.xpath(firstCustomer));
    }
//    public void verifiedEditedCustomer(){
//        WebElement element = mergeAndFindMobileElement(editedCustomer);
//        elementClick(element,"Verified Edited Customer");
//    }

    //added verification step (nov 12)
    public void verifiedEditedCustomer(){
        WebElement element = mergeAndFindMobileElement(firstCustomer);
        String actualName=elementGetText(element,"verify customer");
        String expectedName="Test A";
        Assert.assertEquals(actualName,expectedName);
    }
    public void selectForHereServiceType(){
        WebElement element = mergeAndFindMobileElement(qsrOption);
        elementClick(element,"Select QSR Option");
        WebElement element1 = mergeAndFindMobileElement(forHereServiceType);
        elementClick(element1,"Select ForHere Service Type");
    }
    public void selectForHereServiceTypeFromDineIn(){
        WebElement element = mergeAndFindMobileElement(dineIn);
        elementClick(element,"Select DineIn Option");
        WebElement element1 = mergeAndFindMobileElement(forHereServiceType);
        elementClick(element1,"Select ForHere Service Type");
    }
    public void selectForHereServiceTypeFromBarTab(){
        WebElement element = mergeAndFindMobileElement(selectedBarTabOption);
        elementClick(element,"Select BarTab Option");
        WebElement element1 = mergeAndFindMobileElement(forHereServiceType);
        elementClick(element1,"Select ForHere Service Type");
    }
    public void verifyForHereServiceType(){
        WebElement element = mergeAndFindMobileElement(selectedForHereServiceType);
        String actualName = elementGetText(element,"Verify ForHere ServiceType");
        String expectedName = "FORHERE";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectForHereServiceTypeFromPhoneToGo(){
        WebElement element = mergeAndFindMobileElement(selectedPhoneToGo);
        elementClick(element,"Select PhoneToGo Option");
        WebElement element1 = mergeAndFindMobileElement(forHereServiceType);
        elementClick(element1,"Select ForHere Service Type");
    }
    public void selectForHereServiceTypeFromPhoneDelivery(){
        WebElement element = mergeAndFindMobileElement(selectedPhoneDelivery);
        elementClick(element,"Select PhoneDelivery Option");
        WebElement element1 = mergeAndFindMobileElement(forHereServiceType);
        elementClick(element1,"Select ForHere Service Type");
    }
    public void selectForHereServiceTypeFromDelivery(){
        WebElement element = mergeAndFindMobileElement(selectedDelivery);
        elementClick(element,"Select Delivery Option");
        WebElement element1 = mergeAndFindMobileElement(forHereServiceType);
        elementClick(element1,"Select ForHere Service Type");
    }
    public void verifyNoSelectedCustomer(){
        WebElement element = mergeAndFindMobileElement(noSelectedCustomer);
        String actualName = elementGetText(element,"Verify No Selected Customer");
        String expectedName = "Walk-in";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectAnyCustomer(){
        WebElement element = mergeAndFindMobileElement(firstCustomer);
        elementClick(element,"Select Any Customer");
    }
    public void verifyNewSelectedCustomer(){
        WebElement element = mergeAndFindMobileElement(firstCustomer);
        String actualName = elementGetText(element,"Verify New Selected Customer");
        String expectedName = "Test A";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectFirstOrderedMenuItem(){
        WebElement element = mergeAndFindMobileElement(firstOrderedMenuItem);
        elementClick(element,"Select First Ordered MenuItem");
    }
    public void verifyDeletedDiscount(){

        if(!"Discount".equals(checkBasedDiscountAmount))
        {
            System.out.println("have no discount!!!");
        }
    }
    public void autoDiscountNotDeleted(){
        WebElement element = mergeAndFindMobileElement(autoDiscountAmountOnList);
        String actualName = elementGetText(element,"Verify AutoDiscount Not Deleted");
        WebElement element1 = mergeAndFindMobileElement(autoDiscountAmountOnBill);
        String expectedName = elementGetText(element1,"Verify AutoDiscount Not Deleted");
        actualName.equals(expectedName);
    }
    public void verifyRepeatMenuOption(){
        WebElement element = mergeAndFindMobileElement(repeatedMenuItem);
        String actualName = elementGetText(element,"Verify Repeat MenuOption");
        String expectedName = "SANDWICHES";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyIncreasedQuantity(){
        WebElement element = mergeAndFindMobileElement(quantityOfOrder);
        String actualName = elementGetText(element,"Verify Increased Quantity");
        String expectedName = "2";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyDecreasedQuantity(){
        WebElement element = mergeAndFindMobileElement(quantityOfOrderAfterDecrease);
        String actualName = elementGetText(element,"Verify Decreased Quantity");
        String expectedName = "1";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectForHereFromDineIn(){
        WebElement element = mergeAndFindMobileElement(dineInOptions);
        elementClick(element,"DineIn Options");
        WebElement element1 = mergeAndFindMobileElement(forHereServiceType);
        elementClick(element1,"Select ForHere From DineIn");
    }
    public void addModifierOverMaximumCount() throws InterruptedException {
//        for (int i = 1; i <= 3; i++){
            //click the button
            Thread.sleep(1000);
            WebElement element = mergeAndFindMobileElement(firstModifierOfFirstOrderName);
            elementClick(element,"Add Modifier Over Maximum Count");
        Thread.sleep(1000);
        WebElement element1 = mergeAndFindMobileElement(firstModifierOfFirstOrderName);
        elementClick(element1,"Add Modifier Over Maximum Count");
        Thread.sleep(1000);
        WebElement element2 = mergeAndFindMobileElement(firstModifierOfFirstOrderName);
        elementClick(element2,"Add Modifier Over Maximum Count");
//        }
    }

    public void addModifiersOverMaximumCount(){
        for (int i = 0; i < 3; i++){
            //click the button
            WebElement element = mergeAndFindMobileElement(firstModifierForSecondMenuItem);
            elementClick(element,"Add Modifier Over Maximum Count");
        }
    }

    public void addSecondMenuItemThirdModifierOverMaximumCount(){
        for (int i = 0; i < 3; i++){
            //click the button
            WebElement element = mergeAndFindMobileElement(secondItemThirdModifier);
            elementClick(element,"Add SecondMenuItem Third Modifier Maximum Count");
        }
    }
    public void emptyOrderList(){
        WebElement element = mergeAndFindMobileElement(emptyOrderList);
        String actualName = elementGetText(element,"Verify Empty Order List");
        String expectedName = "Got Nothing !";

        Assert.assertEquals(actualName,expectedName);
    }
    //    public void verifyAddedModifierToOrderList(){
//        WebElement element = mergeAndFindMobileElement(firstModifierOfFirstItemName);
//        String actualName = elementGetText(element,"Verify Added Modifier To OrderList");
//
//        WebElement element1 = mergeAndFindMobileElement(firstModifierOfFirstItemBalance);
//        String expectedName = elementGetText(element1,"Verify Added Modifier To OrderList");
//        actualName.equals(expectedName);
//        WebElement element = mergeAndFindMobileElement(addedModifierOfFirstItemName);
//        String actualName = elementGetText(element,"Verify Added Modifier To OrderList");
//        String expectedName="1/2 Romano";
//        Assert.assertEquals(actualName,expectedName);
    //   }
    public void verifyAddedModifierToOrderList() {
        WebElement element = mergeAndFindMobileElement(firstModifierOfFirstItemName);
        String actualName = elementGetText(element, "Verify Added Modifier To OrderList");
        String expectedName="1/2 Romano";
        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(firstModifierOfFirstItemBalance);
        String actualName1 = elementGetText(element1, "Verify Added Modifier To OrderList");
        String expectedName1="9.00";
//        actualName.equals(expectedName);
        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyAddedQuantityOfModifierForFirstModifier(){
        WebElement element = mergeAndFindMobileElement(firstModifierOfFirstItemName);
        String actualName = elementGetText(element,"Verify Added Quantity");
        String expectedName = "1/2 Romano";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyReachedMaximumCount(){
        WebElement element = mergeAndFindMobileElement(maximumCountText);
        String actualName = elementGetText(element,"Verify Reached Maximum Count");
        String expectedName = "You reached the maximum count";

        Assert.assertEquals(actualName,expectedName);
        WebElement btnDone = mergeAndFindMobileElement(doneButton);
        elementClick(btnDone,"Click Done");
    }
    //    public void selectAnotherModifierForTheSameMenuItem(){
//        WebElement element = mergeAndFindMobileElement(firstModifierForSecondMenuItem);
//        elementClick(element,"Select Another Modifier For The Same MenuItem");
//    }
    public void selectAnotherModifierForTheSameMenuItem(){
        WebElement element = mergeAndFindMobileElement(secondItemThirdModifier);
        elementClick(element,"Select Another Modifier For The Same MenuItem");
    }

    public void verifyAddedQuantityOfModifierForSecondModifier(){
        WebElement element = mergeAndFindMobileElement(secondOrderThirdModifier);
        String actualName = elementGetText(element,"Verify Quantity Of Modifier");
        String expectedName = "Wheat Bread";

        Assert.assertEquals(actualName,expectedName);

    }
    public void verifyMaximumQuantityOfModifiersForFirstAndSecondModifiers(){
        if(!firstModifierOfFirstItemAmount.equals(secondModifierOfFirstItemAmount))
        {
            Assert.assertTrue("Quantity of modifiers are true...",true);
        }
    }
    public void deleteModifier(){
        WebElement element = mergeAndFindMobileElement(deleteModifier);
        elementClick(element,"Delete Modifier");
    }
    public void verifyAddedMenuItemWithoutModifier(){
        WebElement element = mergeAndFindMobileElement(secondItemThirdModifier);
        String actualName = elementGetText(element,"Verify AddedMenu Item Without Modifier");
        if(!"Wheat Bread".equals(actualName))
        {
            System.out.println("Modifier is deleted !!!");
        }
    }
    public void selectFirstMenuItem(){
        WebElement element = mergeAndFindMobileElement(foodTab);
        elementClick(element,"Select First MenuItem");
        WebElement element1 = mergeAndFindMobileElement(firstMenuItem);
        elementClick(element1,"Select First MenuItem");
    }
    public void verifyRemovedTaxExempt(){
        WebElement element = mergeAndFindMobileElement(removedTaxExempt);
        String actualName = elementGetText(element,"Verify Removed TaxExempt");
        String expectedName = "$ 0,00";

        Assert.assertEquals(expectedName,actualName);
    }
    //new nov 17
    public void verifyAddedTaxExempt(){
       /* if("Total".equals(driver.findElement(totalBalanceWithTaxExempt)))
        {
            System.out.println("Tax amount didn't remove...");
        }
        else
            System.out.println("tax amount removed...");*/
        WebElement element = mergeAndFindMobileElement(subtotalAmountWithTaxExempt2);
        String actualName = elementGetText(element,"Verify Added TaxExempt");
        String expectedName = "$ 1.999,80";

        Assert.assertEquals(expectedName,actualName);
        WebElement element1 = mergeAndFindMobileElement(totalAmountWithTaxExempt2);
        String actualName1 = elementGetText(element1,"Verify Added TaxExempt Value");
        String expectedName1 = "$ 1.979,80";

        Assert.assertEquals(expectedName1,actualName1);
    }

    public void verifyAddedTaxExempt1(){
        WebElement element = mergeAndFindMobileElement(subtotalAmountWithTaxExempt);
        String actualName = elementGetText(element,"Verify Added TaxExempt");
        String expectedName = "$ 999,90";

        Assert.assertEquals(expectedName,actualName);
        WebElement element1 = mergeAndFindMobileElement(subtotalAmountWithTaxExempt);
        String actualName1 = elementGetText(element1,"Verify Added TaxExempt Value");
        String expectedName1 = "$ 999,90";

        Assert.assertEquals(expectedName1,actualName1);
    }
    public void pressArrowDown2 () throws InterruptedException {
        Thread.sleep(1000);
        elementClick(arrowDownForOtherMenuItems, "the rest of the categories is listed");
    }

    String arrowDownForOtherMenuItems ="//button[@id='os_catMenu']";
    public void clickFoodTab() throws InterruptedException {
        pressArrowDown2();
        WebElement element = mergeAndFindMobileElement(foodTab);
        elementClick(element,"Click FoodTab");
    }
    public void clickPizzaCategoryTab() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        elementClick(arrowDownForOtherMenuItems, "Arrow Down");
        WebElement cate1 = driver.findElement(By.xpath("//div[contains(@class,'center-name category-container')]//div[contains(.,'PIZZA')]"));
        elementClick(cate1, "Tapped category");
        Thread.sleep(5000);
    }
    public void selectThirdModifierOfSecondPizzaMenuItem(){
        WebElement element = mergeAndFindMobileElement(thirdModifierOfSecondPizzaMenuItem);
        elementClick(element,"Select Third Modifier Of Second Pizza MenuItem");
    }

    public void selectModifierAs12(){
        elementClick("/html/body/app-root/app-dashboard-container/ion-app/ion-content/ion-grid/ion-row/ion-col[2]/app-category-item-option-container/ion-app/ion-content/app-breadcrumb-modifier/div/ion-content/ion-grid/ion-row/ion-col[1]/button[1]","Selected 12");
    }
    public void verifyModifierPrefix(){
        WebElement element = mergeAndFindMobileElement(secondModifierPrefix);
        String actualName = elementGetText(element,"Verify Modifier Prefix");
        String expectedName = "Extra";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickGarlicBreadMenuItemOfFood(){
        WebElement element = mergeAndFindMobileElement(garlicBread);
        elementClick(element,"Click Garlic Bread");
        WebElement element1 = mergeAndFindMobileElement(bbqSource);
        elementClick(element1,"Click bbqSource");
    }
    public void selectOptionalModifierOfGarlicBreadMenuItem(){
        WebElement element = mergeAndFindMobileElement(wellDoneOptionalModifier);
        elementClick(element,"Well Done Optional Modifier");
        WebElement btnDone = mergeAndFindMobileElement(doneButton);
        elementClick(btnDone,"Click Done");
    }
    public void verifyOptionalModifier(){
        WebElement element = mergeAndFindMobileElement(wellDoneOptionalModifierOnOrderList);
        String actualName = elementGetText(element,"WELL DONE");
        String expectedName = "WELL DONE";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyFirstModifierOfSeventhMenuItemPrefixes(){
        WebElement element = mergeAndFindMobileElement(firstModifierPrefixOfSeventhMenuItemOnOrderList);
        String actualName = elementGetText(element,"Verify First Modifier");
        String expectedName = " 4 BBQ";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectFifthMenuItemOfFoodCategory(){
        WebElement element = mergeAndFindMobileElement(fifthMenuItemOfFood);
        elementClick(element,"Select Fifth MenuItem Of FoodCategory");
    }
    public void selectFirstModifierOfFifthMenuItem(){
        WebElement element = mergeAndFindMobileElement(firstModifierOfFifthMenuItem);
        elementClick(element,"select First Modifier Of FifthMenuItem");
    }

    public void verifyFirstModifierOfFifthMenuItem(){
        WebElement element = mergeAndFindMobileElement(firstModifierOfFifthMenuItemInOrderList);
        String actualName = elementGetText(element,"Verify First Modifier");
        String expectedName = "Enter the Customer Name";

        Assert.assertEquals(expectedName,actualName);
    }
    public void verifyFirstModifierOfThirdMenuItemInOrderList(){
        WebElement element = mergeAndFindMobileElement(firstModifierOfThirdMenuItemInOrderList);
        String actualName = elementGetText(element,"Verify First Modifier");
        String expectedName = "1/2 Romano";

        Assert.assertEquals(expectedName,actualName);
    }
    public void selectSecondMenuItem(){
        WebElement element = mergeAndFindMobileElement(secondMenuItem);
        elementClick(element,"select Second MenuItem");
    }
    public void selectSecondMenuItemOnPizzaCategory(){
        WebElement element = mergeAndFindMobileElement(secondMenuItemOfPizza);
        elementClick(element,"select Second MenuItem");
    }
    public void verifyInclusiveTax(){
        WebElement element = mergeAndFindMobileElement(inclusiveTaxAmountForModifier);
        String actualName = elementGetText(element,"Verify InclusiveTax");
        String expectedName = "$ 0,00";

        Assert.assertEquals(expectedName,actualName);
    }
    public void selectMenuItemHasExclusiveTax(){
        WebElement element = mergeAndFindMobileElement(menuItemHasExclusiveTax);
        elementClick(element,"select MenuItem Has ExclusiveTax");
        WebElement element1 = mergeAndFindMobileElement(eachOptionForHotWings);
        elementClick(element1,"select MenuItem Has ExclusiveTax");
        WebElement element2 = mergeAndFindMobileElement(firstModifierForMenuItemHasExclusiveTax);
        elementClick(element2,"select MenuItem Has ExclusiveTax");
    }
    //    public void verifyExclusiveTax(){
//        WebElement element = mergeAndFindMobileElement(exlusiveTaxAmount);
//        String actualName = elementGetText(element,"Verify ExclusiveTax");
//        String expectedName = "$ 210,11";
//
//        Assert.assertEquals(expectedName,actualName);
//    }
    //nov 16
    public void verifyExclusiveTax(){
        WebElement element = mergeAndFindMobileElement(exlusiveTaxAmount1);
        String actualName = elementGetText(element,"Verify ExclusiveTax");
        String expectedName = "$ 26,71";

        Assert.assertEquals(expectedName,actualName);
    }

    public void selectExtraPrefixForAnchovyModifier(){
        WebElement element = mergeAndFindMobileElement(extraPrefixForAnchovyModifier);
        elementClick(element,"select ExtraPrefix For Anchovy Modifier");
    }
    public void verifyExtraPrefixForAnchovyModifier(){
        WebElement element = mergeAndFindMobileElement(extraPrefixForAnchovyModifierOnOrderList);
        String actualName = elementGetText(element,"Verify Extra Anchovy");
        String expectedName = "Extra Anchovy";

        Assert.assertEquals(expectedName,actualName);
    }
    //    public void verifyExclusiveTaxForHorWings(){
//        WebElement element = mergeAndFindMobileElement(exlusiveTaxAmountForHotWings);
//        String actualName = elementGetText(element,"Verify value ExclusiveTax");
//        String expectedName = "$ 122,21";
//
//        Assert.assertEquals(expectedName,actualName);
//    }


    public void verifyExclusiveTaxForHorWings(String expectedName){
       WebElement element =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = elementGetValue(element,"Verify value ExclusiveTax");
//        String expectedName = "$ 1.55";

        Assert.assertEquals(expectedName,actualName);
    }

    public void verifyExclusiveTaxForHorWings(){
        WebElement element = mergeAndFindMobileElement(exlusiveTaxAmountHotWings);
        String actualName = elementGetText(element,"Verify value ExclusiveTax");
        String expectedName = "$ 20,11";

        Assert.assertEquals(expectedName,actualName);
    }
    public void clickAddVoidReasonButton(){
        WebElement element = mergeAndFindMobileElement(addVoidReasonButton);
        elementClick(element,"Click Add VoidReason");
    }
    public void closeVoidReceiptPrinter(){
        WebElement element = mergeAndFindMobileElement(voidReceiptPrinterDoneButton);
        elementClick(element,"Click Close");
    }
    public void clickFirstOrderMenuItem(){
        WebElement element = mergeAndFindMobileElement(firstOrderMenuItem);
    }

    public void clickQsrOrderType(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = mergeAndFindMobileElement(qsrOption);
        elementClick(element,"Click qsrOption");
    }

    public void clickQsrOrderType1(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = mergeAndFindMobileElement(qsrOption1);
        elementClick(element,"Click qsrOption");
    }

    public void clickDineInOrderType(){
        WebElement element = mergeAndFindMobileElement(dineIn);
        elementClick(element,"Click dineIn");
    }

    public void enterCustomerNameForBarTab() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = mergeAndFindMobileElement(BarTabCustomerNameTitle);
        String actualName = elementGetText(element,"Verify Enter the Customer Name");
        String expectedName = "Enter the Customer Name";

        Assert.assertEquals(expectedName,actualName);
        WebElement searchCustomer = mergeAndFindMobileElement(customerSearchTextBoxForBarTab);
        searchCustomer.sendKeys("goknur bati");
        Thread.sleep(1500);
        WebElement btnOK = mergeAndFindMobileElement(customerNameOkButton);
        elementClick(btnOK,"Click dineIn");
    }
    public void verifyQsrOrderType(){
        WebElement element = mergeAndFindMobileElement(qsrOption);
        String actualName = elementGetText(element,"Verify QSR");
        String expectedName = "QSR";

        Assert.assertEquals(expectedName,actualName);
    }
    public void mandatoryModifierWarningPopup(){
        WebElement element = mergeAndFindMobileElement(mandatoryWarningPopup);
        String actualName = elementGetText(element,"Verify Modifier Warning Popup");
        String expectedName = "You need to pick at least 1 modifiers from this Group";

        Assert.assertEquals(expectedName,actualName);
        WebElement btnDone = mergeAndFindMobileElement(mandatoryModifierWarningDoneButton);
        elementClick(btnDone,"Click Done");
    }
    public void verifyMenuItemWithNoMandatoryModifier(){
        WebElement element = mergeAndFindMobileElement(fourthMenuItem1);
        String actualName = elementGetText(element,"Verify MenuItem With No Mandatory Modifier");
        String expectedName = "Fried Crab Cakes";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyOrder(){
        WebElement element = mergeAndFindMobileElement(firstMenuItem);
        String actualName = elementGetText(element,"Verify Order");
        String expectedName = "SANDWICHES";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectBarTabOrderType(){
        WebElement element = mergeAndFindMobileElement(barTabOrderTypeButton);
        elementClick(element,"Click BarTab OrderType");
    }
    public void verifyItemBasedDiscountAfterTax(){
        WebElement element = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName = elementGetValue(element,"Verify ItemBasedDiscountAfterTax");
        String expectedName = "$ 2.25";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectBlackBluPizza(){
        WebElement element = mergeAndFindMobileElement(BlackBluPizza);
        elementClick(element,"Click BlackBluPizza");
    }
    public void selectPizzaRomano() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath(PizzaRomano));
        elementClick(element,"Click PizzaRomano");
    }
    public void selectPizzaRucola() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = mergeAndFindMobileElement(PizzaRucola);
        elementClick(element,"Click PizzaRucola");
    }
    public void selectPizzaLasagna() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = mergeAndFindMobileElement(PizzaLasagna);
        elementClick(element,"Click PizzaLasagna");
    }
//    public void verifyCheckBasedAfterTax(){
//        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxTitle);
//        String actualName = elementGetText(element,"Verify CheckBasedAfterTax");
//        WebElement element1 = mergeAndFindMobileElement(checkBasedAfterTaxAmount);
//        String expectedName = elementGetText(element1,"Verify CheckBasedAfterTax");
//        actualName.equals(expectedName);
//    }

    public void verifyCheckBasedAfterTax(){
        WebElement element = mergeAndFindMobileElement(checkBasedATTitle);
        String actualName = elementGetText(element,"Verify CheckBasedAfterTax");
        String expectedName = "CB-PercentageAfterTax";
        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedATAmount);
        String actualName1 = elementGetText(element1,"Verify CheckBasedAfterTax");
        String expectedName1 = "171,70";
        Assert.assertEquals(actualName1,expectedName1);
//        actualName.equals(expectedName);
    }

    public void verifyCheckBasedAfterTax(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedATTitle);
        String actualName = elementGetText(element,"Verify CheckBasedAfterTax");
        String expectedName = "CB-PercentageAfterTax";
        Assert.assertEquals(actualName,expectedName);
        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

//        MobileElement element1 = mergeAndFindMobileElement(checkBasedATAmount);
        String actualName1 = elementGetValue(element1,"Verify CheckBasedAfterTax");
//        String expectedName1 = "1.50";
        Assert.assertEquals(actualName1,expectedName1);
//        actualName.equals(expectedName);
    }

    public void verifyCheckBasedBeforeTax(){
        WebElement element = driver.findElement(By.xpath(itemBasedBeforeTaxAmount));
        String actualName = elementGetText(element,"Verify CheckBasedBeforeTax");
        String  expectedName = "IB-DiscountAfterTax";

        Assert.assertEquals(expectedName,actualName);
    }
    //    public void verifyItemBasedRestrictDay(){
//        WebElement element = mergeAndFindMobileElement(itemBasedAfterTaxRestrictRoleTitle);
//        String actualName = elementGetText(element,"Verify ItemBasedRestrictDay");
//        String expectedName = "AfterTax-RoleRestriction";
//
//        Assert.assertEquals(actualName,expectedName);
//    }
    public void verifyItemBasedRestrictDay(){
        //        WebElement element = mergeAndFindMobileElement(itemBasedAfterTaxRestrictRoleTitle);
        //        String actualName = elementGetText(element,"Verify ItemBasedRestrictDay");
        //        String expectedName = "AfterTax-RoleRestriction";
        //
        //        Assert.assertEquals(actualName,expectedName);

        WebElement element = driver.findElement(By.xpath(itemBasedDiscountBTRoleRestrict));
        String actualName = elementGetText(element,"Verify ItemBasedRestrictDay");
        String expectedName = "BeforeTaxRoleRestriction";

        Assert.assertEquals(actualName,expectedName);
    }
//    public void verifyItemBasedAfterTaxRestrictRole(){
//        WebElement element = mergeAndFindMobileElement(itemBasedAfterTaxRestrictRoleTitle);
//        String actualName = elementGetText(element,"Verify ItemBasedAfterTaxRestrictRole");
//        WebElement element1 = mergeAndFindMobileElement(itemBasedAfterTaxRestrictRoleAmount);
//        String expectedName = elementGetText(element1,"Verify ItemBasedAfterTaxRestrictRole");
//        actualName.equals(expectedName);
//    }

    public void verifyItemBasedAfterTaxRestrictRole() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element =driver.findElement(By.xpath(itemBasedATRestrictRoleTitle));
        utils.log().info(element.getText());
        String actualName = elementGetText(element,"Verify ItemBasedAfterTaxRestrictRole");
        String expectedName1 = "AfterTax-RoleRestriction";
        Assert.assertEquals(actualName,expectedName1);

//        WebElement element1 = mergeAndFindMobileElement(itemBasedAfterTaxRestrictRoleAmount);
//        String actualName1 = elementGetText(element1,"Verify ItemBasedAfterTaxRestrictRole");
//        String expectedName = "1.00";

//        Assert.assertEquals(actualName1,expectedName);
        // actualName.equals(expectedName);
    }
    public void selectCheckBasedDiscountAfterTaxWithOpenItem(){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxOpenItem);
        elementClick(element,"Click CheckBasedDiscountAfterTax");
    }
    public void verifyCheckBasedDiscountAfterTaxWithOpenItem(){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxOpenItem);
        String actualName = elementGetText(element,"Verify CheckBasedDiscountAfterTaxWith");
        String expectedName = "CB-AfterTax-OpenItem";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyCheckBasedDiscountBeforeTaxWithAutoDiscount(){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxAutoDiscountText);
        String actualName = elementGetText(element,"Verify CheckBased-BeforeTax-Auto");
        String expectedName = "CheckBased-BeforeTax-Auto";

        Assert.assertEquals(actualName,expectedName);
    }
    //    public void verifyTotalAmountWithGratuity(){
//        WebElement element = mergeAndFindMobileElement(fixGratuityAmount);
//        String actualName = elementGetText(element,"Verify Total AmountWithGratuity");
//        String expectedName = "$ 107,98";
//
//        Assert.assertEquals(actualName,expectedName);
//        WebElement element1 = mergeAndFindMobileElement(totalAmountWithGratuityAmount);
//        String actualName1 = elementGetText(element1,"Verify Value AmountWithGratuity");
//        String expectedName1 = "$ 917,99";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyTotalAmountWithGratuity(){
//        WebElement element = mergeAndFindMobileElement(fixGratuityAmount);
//        String actualName = elementGetText(element,"Verify Total AmountWithGratuity");
//        String expectedName = "$ 107,98";

//        Assert.assertEquals(actualName,expectedName);
        WebElement element1 = driver.findElement(By.xpath(totalAmountWithGratuity));
        String actualName1 = elementGetValue(element1,"Verify Value AmountWithGratuity");
        String expectedName1 = "$ 1.10";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyTotalAmountWithoutGratuity(){
        WebElement element = mergeAndFindMobileElement(totalAmountWithoutTaxAndGratuity);
        String actualName = elementGetText(element,"Verify Total AmountWithGratuity");
        String expectedName = "$ 810,01";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectOnionRingsMenuItemOnFoodCategory(){
        WebElement element = mergeAndFindMobileElement(onionRings);
        elementClick(element,"Click onionRings");
    }
    public void selectCheesePizzaMenuItemOnPizzaCategory(){
        WebElement element = mergeAndFindMobileElement(cheesePizza);
        elementClick(element,"Click cheesePizza");
    }
    public void selectMargaritaMenuItemOnPizzaCategory(){
        WebElement element = mergeAndFindMobileElement(margarita);
        elementClick(element,"Click margarita");
        WebElement btnDone = mergeAndFindMobileElement(doneButton);
        elementClick(btnDone,"Click Done");
    }
    public void selectPizzaTomBasilMenuItemOnPizzaCategory(){
        WebElement element = mergeAndFindMobileElement(pizzaTomBasil);
        elementClick(element,"Click pizzaTomBasil");
        WebElement element1 = mergeAndFindMobileElement(bigSizeOfTomBasilPizza);
        elementClick(element1,"Click bigSizeOfTomBasilPizza");
    }
    public void selectPizzaMelMenuItemOnPizzaCategory(){
        WebElement element = mergeAndFindMobileElement(pizzaMel);
        elementClick(element,"Click pizzaMel");
        WebElement btnDone = mergeAndFindMobileElement(doneButton);
        elementClick(btnDone,"Click Done");
    }

    //tax Xpath changes (nov 11)
    public void verifyDefaultTaxOnPizzaMel(){
        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = element1.getAttribute("value");
        String expectedName="$ 1.60";

        Assert.assertEquals(actualName,expectedName);
    }
//    public void verifyQuantityBasedTaxOnOnionRings(){
//        WebElement element = mergeAndFindMobileElement(quantityBasedTaxAmountOnOnionRings);
//        String actualName = elementGetText(element,"Verify value QuantityBasedTax");
//        String expectedName = "$ 25,00";
//
//        Assert.assertEquals(actualName,expectedName);
//    }

    //tax Xpath changes (nov 11)
    public void verifyQuantityBasedTaxOnOnionRings(){
        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = element1.getAttribute("value");
        String expectedName="$ 0.90";

        Assert.assertEquals(actualName,expectedName);
    }
//    public void verifyInclusiveTaxOnCheesePizza(){
//        WebElement element = mergeAndFindMobileElement(inclusiveTaxAmountOnCheesePizza);
//        String actualName = elementGetText(element,"Verify value InclusiveTax");
//        String expectedName = "$ 120,13";
//
//        Assert.assertEquals(actualName,expectedName);
//    }

    //(tax xpath changes nov 11)
    public void verifyInclusiveTaxOnCheesePizza(){
        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = element1.getAttribute("value");
        String expectedName = "$ 0.64";

        Assert.assertEquals(actualName,expectedName);
    }
//    public void verifyCheckBasedTaxWithoutSubtotalOnMargarita(){
//        WebElement element = mergeAndFindMobileElement(checkBasedTaxWithoutSubtotalAmountOnMargarita);
//        String actualName = elementGetText(element,"Verify value CheckBasedTax");
//        String expectedName = "$ 357,00";
//
//        Assert.assertEquals(actualName,expectedName);
//    }

    //tax Xpath changes (nov 11)
    public void verifyCheckBasedTaxWithoutSubtotalOnMargarita(){
        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = element1.getAttribute("value");
        String expectedName = "$ 1.60";

        Assert.assertEquals(actualName,expectedName);
    }
//    public void verifyCheckBasedTaxWithSubtotalOnPizzaTomBasil(){
//        WebElement element = mergeAndFindMobileElement(checkBasedTaxWithSubtotalAmountOnPizzaTomBasili);
//        String actualName = elementGetText(element,"Verify value CheckBasedTaxWithSubtotal");
//        String expectedName = "$ 487,90";
//
//        Assert.assertEquals(actualName,expectedName);
//    }

    //tax xpath changes (nov 11)
    public void verifyCheckBasedTaxWithSubtotalOnPizzaTomBasil(){
        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = element1.getAttribute("value");
        String expectedName = "$ 0.34";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectCaliforniaPizza(){
        WebElement element = mergeAndFindMobileElement(californiaPizza);
        elementClick(element,"Click californiaPizza");
    }
    public void verifyTaxOnItemTaxForInclusiveTaxOnPizzaTomBasil(){
        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = element1.getAttribute("value");
        String expectedName = "$ 0.33";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectNeapolitanPizza(){
        WebElement element = mergeAndFindMobileElement(neapolitanPizza);
        elementClick(element,"Click neapolitanPizza");
    }
    public void selectChickenSchnitzel(){
        WebElement element = mergeAndFindMobileElement(chickenSchnitzel);
        elementClick(element,"Click chickenSchnitzel");
    }
//    public void verifyTaxOnItemTaxForInclusiveTaxOnNeapolitanPizza(){
//        WebElement element = mergeAndFindMobileElement(taxOnItemTaxForInclusiveTaxTextOnNeapolitanPizza);
//        String actualName = elementGetText(element,"Verify value TaxOnItemTaxForInclusiveTax");
//        String expectedName = "$ 210,00";
//
//        Assert.assertEquals(actualName,expectedName);
//    }

    //tax xpath changes (nov 11)
    public void verifyTaxOnItemTaxForInclusiveTaxOnNeapolitanPizza(){
        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = element1.getAttribute("value");
        String expectedName = "$ 0.10";

        Assert.assertEquals(actualName,expectedName);
    }
    //    public void verifyItemBasedFreeDiscountWithBeforeTax(){
//        WebElement element = mergeAndFindMobileElement(itemBasedFreeDiscountBeforeTaxAmount);
//        String actualName = elementGetText(element,"Verify value ItemBasedFreeDiscount");
//        String expectedName = "$ 500,00";
//
//        Assert.assertEquals(expectedName,actualName);
//    }
    public void verifyItemBasedFreeDiscountWithBeforeTax(){
        WebElement element =driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName = elementGetValue(element,"Verify value ItemBasedFreeDiscount");
        String expectedName = "$ 0.10";

        Assert.assertEquals(expectedName,actualName);
    }
    //    public void verifyCheckBasedPercentageDiscountWithAfterTax(){
//        WebElement element = mergeAndFindMobileElement(checkBasedPercentageDiscountWithAfterTaxAmount);
//        String actualName = elementGetText(element,"Verify value CheckBasedPercentageDiscount");
//        String expectedName = "$ 460,00";
//
//        Assert.assertEquals(expectedName,actualName);
//    }
    public void verifyCheckBasedPercentageDiscountWithAfterTax(){
        WebElement element = mergeAndFindMobileElement(checkBasedPercentageDiscountWithATAmount);
        String actualName = elementGetText(element,"Verify value CheckBasedPercentageDiscount");
        String expectedName = "$ 100,00";

        Assert.assertEquals(expectedName,actualName);
    }

    public void verifyCheckBasedPercentageDiscountWithAfterTax(String expectedName){
//       WebElement element = mergeAndFindMobileElement(checkBasedPercentageDiscountWithATAmount);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

        String actualName = elementGetValue(element1,"Verify value CheckBasedPercentageDiscount");
//        String expectedName = "$ 0.10";

        Assert.assertEquals(expectedName,actualName);
    }

    //nov 17
    public void verifyCheckBasedPercentageDiscountWithAfterTaxAppliedOpenItem(){
        WebElement element = mergeAndFindMobileElement(checkBasedPercentageDiscountWithAfterTaxAmountAppliedOpenItem1);
        String actualName = elementGetText(element,"Verify value CheckBasedPercentageDiscountAfterTax");
        String expectedName = "99,99";

        Assert.assertEquals(expectedName,actualName);
    }

    public void verifyCheckBasedPercentageDiscountWithAfterTaxAppliedOpenItem( String expectedName){
//       WebElement element = mergeAndFindMobileElement(checkBasedPercentageDiscountWithAfterTaxAmountAppliedOpenItem1);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

        String actualName = elementGetValue(element1,"Verify value CheckBasedPercentageDiscountAfterTax");
//        String expectedName = "0.10";

        Assert.assertEquals(expectedName,actualName);
    }
    public void verifyCheckBasedAmountDiscountWithAfterTax(String expectedName){
//       WebElement element = mergeAndFindMobileElement(checkBasedAmountDiscountWithAfterTaxAmount1);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

        String actualName = elementGetValue(element1,"Verify value CheckBasedAmountDiscountWithAfterTax");
//        String expectedName = "$ 0.58";

        Assert.assertEquals(expectedName,actualName);
    }
    //new nov 17
    public void verifyCheckBasedAmountDiscountWithAfterTax(){
        WebElement element = mergeAndFindMobileElement(checkBasedAmountDiscountWithAfterTaxAmount1);
        String actualName = elementGetText(element,"Verify value CheckBasedAmountDiscountWithAfterTax");
        String expectedName = "$ 5,00";

        Assert.assertEquals(expectedName,actualName);
    }
    public void verifyCheckBasedSetPriceDiscountWithAfterTax( String expectedName){
//       WebElement element = mergeAndFindMobileElement(checkBasedSetPriceDiscountWithAfterTaxAmount);
        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

        String actualName = elementGetValue(element1,"Verify value checkBasedSetPriceDiscountWithAfterTaxAmount");
//        String expectedName = "$ 1.42";

        Assert.assertEquals(expectedName,actualName);
    }

    public void verifyCheckBasedSetPriceDiscountWithAfterTax(){
        WebElement element = mergeAndFindMobileElement(checkBasedSetPriceDiscountWithAfterTaxAmount);
        String actualName = elementGetText(element,"Verify value checkBasedSetPriceDiscountWithAfterTaxAmount");
        String expectedName = "$ 990,00";

        Assert.assertEquals(expectedName,actualName);
    }
    //    public void verifyCheckBasedFreeDiscountWithAfterTax(){
//        WebElement element = mergeAndFindMobileElement(checkBasedFreeDiscountAfterTaxAmount);
//        String actualName = elementGetText(element,"Verify value checkBasedFreeDiscountAfterTaxAmount");
//        String expectedName = "400,00";
//
//        Assert.assertEquals(expectedName,actualName);
//    }

        public void verifyCheckBasedFreeDiscountWithAfterTax(String expectedName){
//        WebElement element = mergeAndFindMobileElement(checkBasedFreeDiscountATAmount);
//        String actualName1 = elementGetText(element,"Verify value checkBasedFreeDiscountAfterTaxAmount");
       WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName = elementGetValue(element1,"Verify value checkBasedFreeDiscountAfterTaxAmount");

//        String expectedName = "0.00";

        Assert.assertEquals(expectedName,actualName);
    }

    public void verifyCheckBasedFreeDiscountWithAfterTax(){
        WebElement element = mergeAndFindMobileElement(checkBasedFreeDiscountATAmount);
        String actualName = elementGetText(element,"Verify value checkBasedFreeDiscountAfterTaxAmount");
        String expectedName = "0,00";

        Assert.assertEquals(expectedName,actualName);
    }
//    public void verifyCheckBasedAmountDiscountWithBeforeTax(){
//        WebElement element = mergeAndFindMobileElement(checkBasedAmountDiscountWithBeforeTaxAmount);
//        String actualName = elementGetText(element,"Verify value CheckBasedAmountDiscountWithBeforeTax");
//        String expectedName = "$ 410,00";
//
//        Assert.assertEquals(expectedName,actualName);
//    }


    public void verifyCheckBasedAmountDiscountWithBeforeTax(String expectedName){
//       WebElement element = mergeAndFindMobileElement(checkBasedAmountDiscountWithBTAmount);

        WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName = elementGetValue(element1,"Verify value CheckBasedAmountDiscountWithBeforeTax");
//        String expectedName = "$ 0.72";

        Assert.assertEquals(expectedName,actualName);
    }


    public void verifyCheckBasedAmountDiscountWithBeforeTax(){
        WebElement element = mergeAndFindMobileElement(checkBasedAmountDiscountWithBTAmount);
        String actualName = elementGetText(element,"Verify value CheckBasedAmountDiscountWithBeforeTax");
        String expectedName = "$ 10,00";

        Assert.assertEquals(expectedName,actualName);
    }


    public void verifyCheckBasedSetPriceDiscountWithBeforeTax(String expectedName){
//       WebElement element = mergeAndFindMobileElement(checkBasedSetPriceDiscountWithBeforeTaxAmount);
       WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));

        String actualName = elementGetValue(element1,"Verify value checkBasedSetPriceDiscountWithBeforeTaxAmount");
//        String expectedName = "$ 31.00";

        Assert.assertEquals(expectedName,actualName);
    }

    public void verifyCheckBasedSetPriceDiscountWithBeforeTax(){
        WebElement element = mergeAndFindMobileElement(checkBasedSetPriceDiscountWithBeforeTaxAmount);
        String actualName = elementGetText(element,"Verify value checkBasedSetPriceDiscountWithBeforeTaxAmount");
        String expectedName = "$ 995,00";

        Assert.assertEquals(expectedName,actualName);
    }
    public void verifyCheckBasedFreeDiscountWithBeforeTax(String expectedName){
//       WebElement element = mergeAndFindMobileElement(checkBasedFreeDiscountWithBeforeTaxAmount);
//        String actualName1 = elementGetText(element,"Verify value checkBasedFreeDiscountWithBeforeTaxAmount");
       WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName = elementGetValue(element1,"Verify value checkBasedFreeDiscountWithBeforeTaxAmount");
//        String expectedName = "0.00";

        Assert.assertEquals(expectedName,actualName);
    }

    public void verifyCheckBasedFreeDiscountWithBeforeTax(){
        WebElement element = mergeAndFindMobileElement(checkBasedFreeDiscountWithBeforeTaxAmount);
        String actualName = elementGetText(element,"Verify value checkBasedFreeDiscountWithBeforeTaxAmount");
        String expectedName = "0,00";

        Assert.assertEquals(expectedName,actualName);
    }
    //    public void verifyOpenDiscountAsAmountWithBeforeTax(){
//        WebElement element = mergeAndFindMobileElement(openCheckDiscountAsAmountAmountOnPriceSide);
//        String actualName = elementGetText(element,"Verify value openCheckDiscountAsAmountAmountOnPriceSide");
//        String expectedName = "$ 588,36";
//
//        Assert.assertEquals(actualName,expectedName);
//    }
    //new nov 17
    public void verifyOpenDiscountAsAmountWithBeforeTax(){
        WebElement element = mergeAndFindMobileElement(openCheckDiscountPercentage1);
        String actualName = elementGetText(element,"Verify value openCheckDiscountAsAmountAmountOnPriceSide");
        String expectedName = "5,00";

        Assert.assertEquals(actualName,expectedName);
    }
    //    public void verifyOpenDiscountAsAmountWithBeforeTaxForMargarita(){
//        WebElement element = mergeAndFindMobileElement(openCheckDiscountAsAmountAmountOnPriceSideForMargarita);
//        String actualName = elementGetText(element,"Verify value openCheckDiscountAsAmountAmountOnPriceSideForMargarita");
//        String expectedName = "$ 1.198,00";
//
//        Assert.assertEquals(actualName,expectedName);
//    }
    public void verifyOpenDiscountAsAmountWithBeforeTaxForMargarita(){
        WebElement element = mergeAndFindMobileElement(openCheckDiscountAsAmountOnPriceSideForMargarita);
        String actualName = elementGetText(element,"Verify value openCheckDiscountAsAmountAmountOnPriceSideForMargarita");
        String expectedName = "$ 5,00";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectPolloParmMenuItem(){
        WebElement element = mergeAndFindMobileElement(polloParm);
        elementClick(element,"Click polloParm");
        WebElement btnDone = mergeAndFindMobileElement(doneButton);
        elementClick(btnDone,"Click Done");
    }
    public void selectSandwichesMenuItem(){
        WebElement element = mergeAndFindMobileElement(sandwiches);
        elementClick(element,"Click sandwiches");
    }
    //    public void verifyTaxAmountOfSandwich(){
//        WebElement element = mergeAndFindMobileElement(sandwichesTaxAmount);
//        String actualName = elementGetText(element,"Verify value sandwichesTaxAmount");
//        String expectedName = "$ 210,11";
//
//        Assert.assertEquals(expectedName,actualName);
//    }
    public void verifyTaxAmountOfSandwich(){
        WebElement element = mergeAndFindMobileElement(sandwicheTaxAmount);
        String actualName = elementGetText(element,"Verify value sandwichesTaxAmount");
        String expectedName = "$ 100,10";

        Assert.assertEquals(expectedName,actualName);
    }

    public void verifyTaxAmountOfSandwich(String expectedName){
//      WebElement element = mergeAndFindMobileElement(sandwicheTaxAmount);
      WebElement element =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String actualName = elementGetValue(element,"Verify value sandwichesTaxAmount");
//        String expectedName = "$ 0.10";

        Assert.assertEquals(expectedName,actualName);
    }

    public void clickSelectedCustomerForBarTab(){
        WebElement element = mergeAndFindMobileElement(selectedCustomerForBarTab);
        elementClick(element,"Click selected Customer For BarTab");
        WebElement element1 = mergeAndFindMobileElement(selectedCustomerForBarTab);
        elementClick(element1,"Click selected Customer For BarTab");
    }
    public void clickFoodCategoryOption(){
        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'center-name category-container')]/div[contains(.,'FOOD')]"));
        elementClick(element,"Click food Category Option");
    }
    public void verifyFoodCategoryOption(){
        WebElement element = driver.findElement(By.xpath("//p[@class='hasMenuItem']"));

        String actualName = elementGetText(element,"Verify FoodCategory Option - ");
        utils.log().info(actualName);
        String expectedName = "__MENU ITEMS OF 'FOOD'__";

        Assert.assertEquals(actualName,expectedName);
    }

    //nov 25
    public void deleteAddedSeat(){
        WebElement element = mergeAndFindMobileElement(deleteTheSeat);
        elementClick(element," Verify delete Added Seat");
    }
    public void verifyTaxAmountForSandwichesOnBarTab(){
        WebElement element = mergeAndFindMobileElement(taxAmountForSandwiches);
        String actualName = elementGetText(element,"Verify taxAmountForSandwiches value");
        String expectedName = "$ 1.100,00";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyItemBasedDiscountAfterTaxAsPercentage(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountAfterTaxPercentageAmountOnOrderList);
        String actualName = elementGetText(element,"Verify ItemBasedDiscount value");
        String expectedName = "99,99";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyItemBasedDiscountAfterTaxAsFreeItemWithSandwiches(){
        WebElement element = mergeAndFindMobileElement(dietCokeFreeMenuItemWithSandwiches);
        String actualName = elementGetText(element,"Verify ItemBasedDiscountAfterTax");
        String expectedName = "(F) Diet Coke EACH";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 = mergeAndFindMobileElement(freeMenuItemAmountWithSandwiches);
        String actualName1 = elementGetValue(element1,"Verify freeMenuItemAmountWithSandwiches value");
        String expectedName1 = "10,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountBeforeTaxAsFreeItemWithSandwiches(){
        WebElement element = mergeAndFindMobileElement(tunaTacosFreeMenuItemWithSandwiches);
        String actualName = elementGetText(element,"Verify ItemBasedDiscountBeforeTax");
        String expectedName = "(F) Tuna Tacos EACH";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(freeMenuItemAmountWithSandwiches);
        String actualName1 = elementGetValue(element1,"Verify freeMenuItemAmountWithSandwiches value");
        String expectedName1 = "10,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountBeforeTaxAsSetPriceWithSandwiches(){
        WebElement element = mergeAndFindMobileElement(beforeTaxAsSetPriceForSandwiches);
        String actualName = elementGetText(element,"Verify IB-BeforeTax-SetPrice");
        String expectedName = "IB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(beforeTaxAsSetPriceAmountForSandwiches);
        String actualName1 = elementGetValue(element1,"Verify beforeTaxAsSetPriceAmountForSandwiches value");
        String expectedName1 = "$ 1.200,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyCheckBasedDiscountAfterTaxAsPercentageWithSandwiches(){
//        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxPercentageWithSandwiches);
//        String actualName = elementGetText(element,"Verify CB-PercentageAfterTax");
//        String expectedName = "CB-PercentageAfterTax";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(checkBasedAfterTaxAsPercentageAmountForSandwiches1);
//        String actualName1 = elementGetText(element1,"Verify checkBasedAfterTaxAsPercentageAmountForSandwiches value");
//        String expectedName1 = "99,99";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    public void verifyCheckBasedDiscountAfterTaxAsPercentageWithSandwiches(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxPercentageWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-PercentageAfterTax");
        String expectedName = "CB-PercentageAfterTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName1 = elementGetValue(element1,"Verify checkBasedAfterTaxAsPercentageAmountForSandwiches value");
//        String expectedName1 = "$ 0.10";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountBeforeTaxAsPercentageWithSandwiches(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxPercentageWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-PercentageBeforeTax");
        String expectedName = "CB-PercentageBeforeTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName1 = elementGetValue(element1,"Verify checkBasedBeforeTaxAsPercentageAmountForSandwiches value");
//        String expectedName1 = "0.10";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountAfterTaxAsPercentageWithSandwiches(){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxPercentageWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-PercentageAfterTax");
        String expectedName = "CB-PercentageAfterTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName1 = elementGetValue(element1,"Verify checkBasedAfterTaxAsPercentageAmountForSandwiches value");
        String expectedName1 = "$ 99,99";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCheckBasedDiscountBeforeTaxAsPercentageWithSandwiches(){
//        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxPercentageWithSandwiches);
//        String actualName = elementGetText(element,"Verify CB-PercentageBeforeTax");
//        String expectedName = "CB-PercentageBeforeTax";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(checkBasedBeforeTaxAsPercentageAmountForSandwiches);
//        String actualName1 = elementGetText(element1,"Verify checkBasedBeforeTaxAsPercentageAmountForSandwiches value");
//        String expectedName1 = "100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCheckBasedDiscountBeforeTaxAsPercentageWithSandwiches(){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxPercentageWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-PercentageBeforeTax");
        String expectedName = "CB-PercentageBeforeTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement("//div[@id='os_discountAmountStr']//input");
        String actualName1 = elementGetValue(element1,"Verify checkBasedBeforeTaxAsPercentageAmountForSandwiches value");
        String expectedName1 = "100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }


    public void verifyCheckBasedDiscountBeforeTaxAsAmountWithSandwiches(String expectedName1){
       WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxAmountWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-AmountBeforeTax");
        String expectedName = "CB-AmountBeforeTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName1 = elementGetValue(element1,"Verify checkBasedBeforeTaxAsAmountForSandwichesAmount value");
//        String expectedName1 = "0.67";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountAfterTaxAsSetPriceWithSandwiches(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxSetPriceWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-AfterTax-SetPrice");
        String expectedName = "CB-AfterTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

     WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName1 = elementGetValue(element1,"Verify checkBasedAfterTaxSetPriceAmountWithSandwiches value");
//        String expectedName1 = "0.61";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountBeforeTaxAsAmountWithSandwiches(){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxAmountWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-AmountBeforeTax");
        String expectedName = "CB-AmountBeforeTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement("//div[@id='os_discountAmountStr']//input");
        String actualName1 = elementGetValue(element1,"Verify checkBasedBeforeTaxAsAmountForSandwichesAmount value");
        String expectedName1 = "5,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    //    public void verifyCheckBasedDiscountAfterTaxAsSetPriceWithSandwiches(){
//        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxSetPriceWithSandwiches);
//        String actualName = elementGetText(element,"Verify CB-AfterTax-SetPrice");
//        String expectedName = "CB-AfterTax-SetPrice";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(checkBasedAfterTaxSetPriceAmountWithSandwiches);
//        String actualName1 = elementGetText(element1,"Verify checkBasedAfterTaxSetPriceAmountWithSandwiches value");
//        String expectedName1 = "970,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCheckBasedDiscountAfterTaxAsSetPriceWithSandwiches(){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxSetPriceWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-AfterTax-SetPrice");
        String expectedName = "CB-AfterTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement("//div[@id='os_discountAmountStr']//input");
        String actualName1 = elementGetValue(element1,"Verify checkBasedAfterTaxSetPriceAmountWithSandwiches value");
        String expectedName1 = "970,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountBeforeTaxAsSetPriceWithSandwiches(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxSetPriceWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-BeforeTax-SetPrice");
        String expectedName = "CB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName1 = elementGetValue(element1,"Verify checkBasedBeforeTaxSetPriceAmountWithSandwiches value");
//        String expectedName1 = "0.17";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountBeforeTaxAsSetPriceWithSandwiches(){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxSetPriceWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-BeforeTax-SetPrice");
        String expectedName = "CB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement("//div[@id='os_discountAmountStr']//input");
        String actualName1 = elementGetValue(element1,"Verify checkBasedBeforeTaxSetPriceAmountWithSandwiches value");
        String expectedName1 = "970,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    //    public void verifyCheckBasedDiscountAfterTaxAsAmountWithSandwiches(){
//        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxAsAmountWithSandwiches);
//        String actualName = elementGetText(element,"Verify CheckBasedAmountAfterTax");
//        String expectedName = "CheckBasedAmountAfterTax";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(checkBasedAfterTaxAmountAsAmountWithSandwiches);
//        String actualName1 = elementGetText(element1,"Verify checkBasedAfterTaxAmountAsAmountWithSandwiches value");
//        String expectedName1 = "5,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    public void verifyCheckBasedDiscountAfterTaxAsAmountWithSandwiches(String expectedName1){
       WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxAsAmountWithSandwiches);
        String actualName = elementGetText(element,"Verify CheckBasedAmountAfterTax");
        String expectedName = "CheckBasedAmountAfterTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName1 = elementGetValue(element1,"Verify checkBasedAfterTaxAmountAsAmountWithSandwiches value");
//        String expectedName1 = "0.58";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountAfterTaxAsAmountWithSandwiches(){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxAsAmountWithSandwiches);
        String actualName = elementGetText(element,"Verify CheckBasedAmountAfterTax");
        String expectedName = "CheckBasedAmountAfterTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement("//div[@id='os_discountAmountStr']//input");
        String actualName1 = elementGetText(element1,"Verify checkBasedAfterTaxAmountAsAmountWithSandwiches value");
        String expectedName1 = "5.00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCheckBasedDiscountAfterTaxAsFreeItemWithSandwiches(){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxAsFreeItemWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-AfterTax-FreeItem");
        String expectedName = "CB-AfterTax-FreeItem";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement("//div[@id='os_discountAmountStr']//input");
        String actualName1 = elementGetValue(element1,"Verify checkBasedAfterTaxAmountAsFreeItemWithSandwiches value");
        String expectedName1 = "0.00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCheckBasedDiscountBeforeTaxAsFreeItemWithSandwiches(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxAsFreeItemWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-BeforeTax-FreeItem");
        String expectedName = "CB-BeforeTax-FreeItem";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName1 = elementGetValue(element1,"Verify checkBasedBeforeTaxAmountAsFreeItemWithSandwiches value");
//        String expectedName1 = "0.00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountAfterTaxAsFreeItemWithSandwiches(String expectedName1){
        WebElement element = mergeAndFindMobileElement(checkBasedAfterTaxAsFreeItemWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-BeforeTax-FreeItem");
        String expectedName = "CB-AfterTax-FreeItem";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName1 = elementGetValue(element1,"Verify checkBasedBeforeTaxAmountAsFreeItemWithSandwiches value");
//        String expectedName1 = "0.00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCheckBasedDiscountBeforeTaxAsFreeItemWithSandwiches(){
        WebElement element = mergeAndFindMobileElement(checkBasedBeforeTaxAsFreeItemWithSandwiches);
        String actualName = elementGetText(element,"Verify CB-BeforeTax-FreeItem");
        String expectedName = "CB-BeforeTax-FreeItem";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement("//div[@id='os_discountAmountStr']//input");
        String actualName1 = elementGetValue(element1,"Verify checkBasedBeforeTaxAmountAsFreeItemWithSandwiches value");
        String expectedName1 = "0.00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyOpenCheckDiscountWithAfterTaxAsPercentage(){
        WebElement element = mergeAndFindMobileElement(openCheckDiscountText);
        String actualName = elementGetText(element,"Verify Open Check Discount");
        String expectedName = "Open Check Discount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedAfterTaxAsPercentageAmountForSandwich);
        String actualName1 = elementGetText(element1,"Verify checkBasedAfterTaxAsPercentageAmountForSandwich value");
        String expectedName1 = "$ 99,99";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyOpenCheckDiscountWithBeforeTaxAsPercentage(){
        WebElement element = mergeAndFindMobileElement(openCheckDiscountText);
        String actualName = elementGetText(element,"Verify Open Check Discount");
        String expectedName = "Open Check Discount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(checkBasedAfterTaxAsPercentageAmountForSandwiches);
        String actualName1 = elementGetText(element1,"Verify checkBasedAfterTaxAsPercentageAmountForSandwiches value");
        String expectedName1 = "$ 100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    //new nov 29
    public void verifyOpenCheckDiscountWithAfterTaxAsAmountWithMargarita(){
        WebElement element = mergeAndFindMobileElement(openCheckDiscountText);
        String actualName = elementGetText(element,"Verify Open Check Discount");
        String expectedName = "Open Check Discount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(openCheckDiscountWithAfterTaxAsNonDecimalAmountForMargarita);
        String actualName1 = elementGetText(element1,"Verify OpenCheckDiscount value");
        String expectedName1 = "$ 1.099,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyOpenCheckDiscountWithAfterTaxAsAmountWithMargaritaForDecimalValue(){
        WebElement element = mergeAndFindMobileElement(openCheckDiscountText);
        String actualName = elementGetText(element,"Verify Open Check Discount");
        String expectedName = "Open Check Discount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(openCheckDiscountWithAfterTaxAsNonDecimalAmountForMargaritaForDecimalValue);
        String actualName1 = elementGetText(element1,"Verify OpenCheckDiscount value");
        String expectedName1 = "$ 1.098,95";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyOpenCheckDiscountWithBeforeTaxAsAmount(){
        WebElement element = mergeAndFindMobileElement(openCheckDiscountText);
        String actualName = elementGetText(element,"Verify Open Check Discount");
        String expectedName = "Open Check Discount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(openCheckDiscountWithBeforeTaxAsAmountForPolloParm);
        String actualName1 = elementGetText(element1,"Verify OpenCheckDiscount value");
        String expectedName1 = "$ 1.097,75";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyOpenCheckDiscountWithBeforeTaxAsAmountForMargarita(){
        WebElement element = mergeAndFindMobileElement(openCheckDiscountText);
        String actualName = elementGetText(element,"Verify Open Check Discount");
        String expectedName = "Open Check Discount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(openCheckDiscountWithBeforeTaxAsAmountForMargarita);
        String actualName1 = elementGetText(element1,"Verify OpenCheckDiscount value");
        String expectedName1 = "120,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void selectSandwichesUpchargeAddModifierMenuItem(){
        WebElement element = mergeAndFindMobileElement(upchargeSandwiches);
        elementClick(element,"select Sandwiches Upcharge Add Modifier");
    }
    public void verifyTotalAmountOfSandwichesUpchargeAddModifierMenuItem(){
        WebElement element = mergeAndFindMobileElement(totalAmountWithoutTaxForUpchargeSandwiches);
        String actualName = elementGetText(element,"Verify value Upcharge with Add Modifier");
        String expectedName = "$ 12,00";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyMenuItemPageWithBarTab(){
        WebElement element = mergeAndFindMobileElement(menuItemListTitle);
        String actualName = elementGetText(element,"Verify MenuItem ListTitle");
        String expectedName = "__MENU ITEMS OF 'COMBO'__";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(barTabOption);
        String actualName1 = elementGetText(element1,"Verify BarTab Option");
        String expectedName1 = "Bar Tab";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyItemBasedDiscountAfterTaxWithPercentage(){
//        WebElement element = mergeAndFindMobileElement(itemBasedDiscountAfterTaxWithPercentage);
//        String actualName = elementGetText(element,"Verify IB-AfterTax-Percentage");
//        String expectedName = "IB-AfterTax-Percentage";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(itemBasedAfterTaxAsPercentageDiscountAmountForSandwiches);
//        String actualName1 = elementGetText(element1,"Verify TaxAsPercentage Discount Amount");
//        String expectedName1 = "$ 555,01";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    public void verifyItemBasedDiscountAfterTaxWithPercentage(String expectedName1){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountATWithPercentage);
        String actualName = elementGetText(element,"Verify IB-AfterTax-Percentage");
        String expectedName = "IB-AfterTax-Percentage";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName1 = elementGetValue(element1,"Verify TaxAsPercentage Discount Amount");
//        String expectedName1 = "$ 12.00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyItemBasedDiscountAfterTaxWithPercentage(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountATWithPercentage);
        String actualName = elementGetText(element,"Verify IB-AfterTax-Percentage");
        String expectedName = "IB-AfterTax-Percentage";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedATAsPercentageDiscountAmountForSandwiches);
        String actualName1 = elementGetValue(element1,"Verify TaxAsPercentage Discount Amount");
        String expectedName1 = "$ 12,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountBeforeTaxWithPercentage(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithPercentage);
        String actualName = elementGetText(element,"Verify IB-BeforeTax-Percentage");
        String expectedName = "IB-BeforeTax-Percentage";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedBeforeTaxAsPercentageDiscountAmountForSandwiches);
        String actualName1 = elementGetText(element1,"Verify TaxAsPercentage Discount Amount");
        String expectedName1 = "$ 14,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyItemBasedDiscountBeforeTaxWithPercentageForMargarita(){
//        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithPercentage);
//        String actualName = elementGetText(element,"Verify IB-BeforeTax-Percentage");
//        String expectedName = "IB-BeforeTax-Percentage";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(itemBasedBeforeTaxAsPercentageDiscountAmountForMargarita);
//        String actualName1 = elementGetText(element1,"Verify TaxAsPercentage Discount Amount");
//        String expectedName1 = "$ 100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }


    public void verifyItemBasedDiscountBeforeTaxWithPercentageForMargarita(String expectedName1){
       WebElement element = mergeAndFindMobileElement(itemBasedDiscountBTWithPercentage);
        String actualName = elementGetText(element,"Verify IB-BeforeTax-Percentage");
        String expectedName = "IB-BeforeTax-Percentage";

        Assert.assertEquals(actualName,expectedName);
       WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
//       WebElement element1 = mergeAndFindMobileElement(itemBasedBTAsPercentageDiscountAmountForMargarita);
        String actualName1 = elementGetValue(element1,"Verify TaxAsPercentage Discount Amount");
//        String expectedName1 = "$ 0.10";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyItemBasedDiscountBeforeTaxWithPercentageForMargarita(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBTWithPercentage);
        String actualName = elementGetText(element,"Verify IB-BeforeTax-Percentage");
        String expectedName = "IB-BeforeTax-Percentage";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedBTAsPercentageDiscountAmountForMargarita);
        String actualName1 = elementGetText(element1,"Verify TaxAsPercentage Discount Amount");
        String expectedName1 = "$ 101,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountBeforeTaxWithAmount(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountAfterTaxWithAmounts);
        String actualName = elementGetText(element,"Verify IB-BeforeTax-Amount");
        String expectedName = "IB-BeforeTax-Amount";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithAmountForSandwiches);
        String actualName1 = elementGetText(element1,"Verify TaxAsAmount Discount Value");
        String expectedName1 = "$ 1.569,11";

        Assert.assertEquals(actualName1,expectedName1);
    }


    public void verifyItemBasedDiscountAfterTaxWithAmount(String expectedName1){
       WebElement element = mergeAndFindMobileElement(itemBasedDiscountAfterTaxWithAmount);
        String actualName = elementGetText(element,"Verify IB-DiscountAfterTax");
        String expectedName = "IB-DiscountAfterTax";

        Assert.assertEquals(actualName,expectedName);
       WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
//
//       WebElement element1 = mergeAndFindMobileElement(itemBasedAfterTaxAsAmountDiscountAmountForSandwiches);
        String actualName1 = elementGetValue(element1,"Verify TaxAsAmount Discount Value");
//        String expectedName1 = "$ 4.59";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyItemBasedDiscountAfterTaxWithAmount(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountAfterTaxWithAmount);
        String actualName = elementGetText(element,"Verify IB-DiscountAfterTax");
        String expectedName = "IB-DiscountAfterTax";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedAfterTaxAsAmountDiscountAmountForSandwiches);
        String actualName1 = elementGetText(element1,"Verify TaxAsAmount Discount Value");
        String expectedName1 = "$ 1.400,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountAfterTaxAsSetPrice(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountAfterTaxSetPrice);
        String actualName = elementGetText(element,"Verify AfterTax-SetPrice");
        String expectedName = "IB-AfterTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedAfterTaxAsSetPriceDiscountAmountForSandwiches);
        String actualName1 = elementGetText(element1,"Verify TaxAsSetPriceDiscountAmount Value");
        String expectedName1 = "20,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountAfterTaxAsSetPriceForChickenSchnitzel(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountAfterTaxSetPrice);
        String actualName = elementGetText(element,"Verify IB-AfterTax-SetPrice");
        String expectedName = "IB-AfterTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyItemBasedDiscountBeforeTaxAsSetPrice(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxSetPrice);
        String actualName = elementGetText(element,"Verify IB-BeforeTax-SetPrice");
        String expectedName = "IB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath(itemBasedBeforeTaxAsSetPriceDiscountAmountForSandwiches));
        String actualName1 = element1.getAttribute("value");
        String expectedName1 = "$ 0.53";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyItemBasedDiscountBeforeTaxAsSetPriceForChickenSchnitzel(){
//        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxSetPrice);
//        String actualName = elementGetText(element,"Verify IB-BeforeTax-SetPrice");
//        String expectedName = "IB-BeforeTax-SetPrice";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(itemBasedBeforeTaxAsSetPriceDiscountAmountForChickenSchnitzel);
//        String actualName1 = elementGetText(element1,"Verify TaxAsSetPriceDiscountAmount Value");
//        String expectedName1 = "$ 20,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }


    public void verifyItemBasedDiscountBeforeTaxAsSetPriceForChickenSchnitzel(String expectedName1){
       WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxSetPrice);
        String actualName = elementGetText(element,"Verify IB-BeforeTax-SetPrice");
        String expectedName = "IB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

//       WebElement element1 = mergeAndFindMobileElement(itemBasedBTAsSetPriceDiscountAmountForChickenSchnitzel);
       WebElement element1 =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String actualName1 = elementGetValue(element1,"Verify TaxAsSetPriceDiscountAmount Value");
//        String expectedName1 = "$ 11.53";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyItemBasedDiscountBeforeTaxAsSetPriceForChickenSchnitzel(){
        WebElement element = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxSetPrice);
        String actualName = elementGetText(element,"Verify IB-BeforeTax-SetPrice");
        String expectedName = "IB-BeforeTax-SetPrice";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedBTAsSetPriceDiscountAmountForChickenSchnitzel);
        String actualName1 = elementGetText(element1,"Verify TaxAsSetPriceDiscountAmount Value");
        String expectedName1 = "$ -880,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyVoidCheckInfoPopup(){
        WebElement element = mergeAndFindMobileElement(voidCheckInfo);
        String actualName = elementGetText(element,"Verify void CheckInfo");
        String expectedName = "All orders are voided";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1 = mergeAndFindMobileElement(closeVoidCheckInfoPopup);
        elementClick(element1,"Close VoidCheck Info Popup");
    }

    public void selectAutoDiscountMenuItemAndOrder(){
//        WebElement element = mergeAndFindMobileElement(foodTab);
//        elementClick(element,"Select MenuItem And Order");

        WebElement element1 = mergeAndFindMobileElement(autoDiscountItem);
        elementClick(element1,"Select MenuItem And Order");

        WebElement element2 = mergeAndFindMobileElement(orderButton);
        elementClick(element2,"Click Order");
    }
    public void selectTable(){
        WebElement element = mergeAndFindMobileElement(selectTable2);
        elementClick(element,"click table");
    }
}
