package com.qa.pages;

import com.qa.utils.TestUtils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.qa.utils.TestUtils.driver;

//import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class TGPaymentPage extends BasePage {


    public void verifyPaidCheckPopupInfo(){
        WebElement element=mergeAndFindMobileElement(paidCheckPopupInfo);
        String actualName = elementGetText(element,"verify paidCheckPopupInfo");

        String expectedName = "Payment(s) made on this check,Can you return this to Test Automation";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyFirstPaidAmountWithGiftCardAndTip(){
        WebElement element=mergeAndFindMobileElement(partialPaidAmountWithGiftCard2);
        String actualName = elementGetText(element,"verify partialPaidAmountWithGiftCard");

        String expectedName = "20,00+10,00";

        Assert.assertEquals(actualName,expectedName);
    }

    public void verifyFirstPaidAmountWithGiftCardAndTip1(){
        WebElement element=mergeAndFindMobileElement(partialPaidAmountWithGiftCard1);
        String actualName = elementGetText(element,"verify partialPaidAmountWithGiftCard");

        String expectedName = "20,00";

        Assert.assertEquals(actualName,expectedName);
    }

    public void verifyWillPaymentAmount(){
        WebElement element=mergeAndFindMobileElement(partialPaymentAmount);
        String actualName = elementGetText(element,"verify partialPaymentAmount");

        String expectedName = "TL 20,00";

        Assert.assertEquals(actualName,expectedName);
    }

    public void clickAnyPartialAmountForPartialPayment(){
        WebElement element=mergeAndFindMobileElement(partialPaymentAmount);
        elementClick(element,"click partialPaymentAmount");
    }

    public void verifySideCCPaymentForCokeWithoutTipAndServiceCharge(){
        WebElement element=mergeAndFindMobileElement(sideCCTitle);
        String actualName = elementGetText(element,"verify sideCCTitle");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(sideCCPaymentWithoutTipsAndWithServiceCharge);
        String actualName1 = elementGetText(element1,"verify sideCCPaymentWithoutTipsAndWithServiceCharge");

        String expectedName1 = "140,80";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifySideCCPaymentForCocktailWithTipAndServiceCharge(){
        WebElement element1=mergeAndFindMobileElement(sideCCTitle);
        String actualName = elementGetText(element1,"verify sideCCTitle");

        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element=mergeAndFindMobileElement(sideCCPaymentWithTipsAndWithServiceCharge);
        String actualName1 = elementGetText(element,"verify sideCCPaymentWithTipsAndWithServiceCharge");

        String expectedName1 = "2.033,50+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifySideCCPaymentForCocktailWithoutTipAndServiceCharge(){
        WebElement element1=mergeAndFindMobileElement(sideCCTitle);
        String actualName = elementGetText(element1,"verify sideCCTitle");

        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element=mergeAndFindMobileElement(coctailAmount);
        String actualName1 = elementGetText(element,"verify sideCCPaymentWithTipsAndWithServiceCharge");

        String expectedName1 = "2.033,50";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifySideCCPaymentForSandwichesWithTipsAndWithoutServiceCharge(){
        WebElement element=mergeAndFindMobileElement(sideCCTitle);
        String actualName = elementGetText(element,"verify sideCCTitle");

        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(sideCCPaymentWithTipsAndWithoutServiceCharge);
        String actualName1 = elementGetText(element1,"verify sideCCPaymentWithTipsAndWithoutServiceCharge");

        String expectedName1 = "1.100,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifySideCCPaymentForSandwiches(){
        WebElement element1=mergeAndFindMobileElement(sideCCTitle);
        String actualName = elementGetText(element1,"verify sideCCTitle");

        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element=mergeAndFindMobileElement(sideCCForSandwich);
        String actualName1 = elementGetText(element,"verify sideCCForSandwich");

        String expectedName1 = "1.100,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void clickGiveXPaymentOption(){
        WebElement element=mergeAndFindMobileElement(giveXButton);
        elementClick(element,"click giveXButton");
    }

    //nov 16
    public void verifyPaidOrderForSandwiches(){
        WebElement element=mergeAndFindMobileElement(cashPaymentMethodDiyez);
        String actualName = elementGetText(element,"verify cashPaymentMethodDiyez");
        String expectedName = "1. Cash(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(voidSandwichesAmount1);
        String actualName1 = elementGetText(element1,"verify voidSandwichesAmount");

        String expectedName1 = "1.200,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCashPaymentForCocktailWithServiceCharge(){
        WebElement element=mergeAndFindMobileElement(cashPaymentMethodDiyez);
        String actualName = elementGetText(element,"verify cashPaymentMethodDiyez");
        String expectedName = "1. Cash(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(coctailAmount);
        String actualName1 = elementGetText(element1,"verify coctailAmount");
        String expectedName1 = "2.033,50";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCashPaymentForSandwiches(){
        WebElement element=mergeAndFindMobileElement(cashPaymentMethodDiyez);
        String actualName = elementGetText(element,"verify cashPaymentMethodDiyez");
        String expectedName = "1. Cash(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(sandwichesPricePayWithCash);
        String actualName1 = elementGetText(element1,"verify sandwichesPricePayWithCash");
        String expectedName1 = "1.100,00";
        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyGiveXPaymentMethodAndTotalPriceForTunaTacos(){
        WebElement element=mergeAndFindMobileElement(giveXPaymentMethodDiyez);
        String actualName = elementGetText(element,"verify giveXPaymentMethodDiyez");
        String expectedName = "1. GiveX(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(tunaTacosTotalPrice);
        String actualName1 = elementGetText(element1,"verify tunaTacosTotalPrice");
        String expectedName1 = "1.244,42";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyPaidAmountWhichWillBeVoidForTunaTacos(){
        WebElement element=mergeAndFindMobileElement(giveXPaymentMethodDiyez);
        String actualName = elementGetText(element,"verify giveXPaymentMethodDiyez");
        String expectedName = "1. GiveX(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(tunaTacosTotalPrice);
        String actualName1 = elementGetText(element1,"verify tunaTacosTotalPrice");

        String expectedName1 = "1.243,18+10,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyGiveXPaymentMethodAndTunaTacosTotalPriceForVoidAction(){
        WebElement element=mergeAndFindMobileElement(giveXPaymentMethodDiyez);
        String actualName = elementGetText(element,"verify giveXPaymentMethodDiyez");
        String expectedName = "1. GiveX(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(tunaTacosTotalPriceForVoidAction);
        String actualName1 = elementGetText(element1,"verify tunaTacosTotalPriceForVoidAction");
        String expectedName1 = "33,00+10,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyGiveXPaymentMethodWithHamburger(){
        WebElement element=mergeAndFindMobileElement(giveXPaymentMethodDiyez);
        String actualName = elementGetText(element,"verify giveXPaymentMethodDiyez");
        String expectedName = "1. GiveX(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(paymentAmountForHamburger);
        String actualName1 = elementGetText(element1,"verify paymentAmountForHamburger");
        String expectedName1 = "1.000,00)";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyReceiptPrinterPopup(){
        WebElement element=mergeAndFindMobileElement(receiptPrinterTitle);
        String actualName = elementGetText(element,"verify giveXPaymentMethodDiyez");
        String expectedName = "Receipt Printer";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(okButton);
        elementClick(element1,"click okButton");
    }

    public void clickForcedRedemptionButton(){
        WebElement element1=mergeAndFindMobileElement(forceRedemption);
        elementClick(element1,"click forceRedemption");
    }

    public void enterGiveXCardNumberForTip(){
        WebElement element=mergeAndFindMobileElement(giveXCardNumberText);
        elementClick(element,"click giveXCardNumberText");

        WebElement element6 = mergeAndFindMobileElement(numberSix);
        elementClick(element6, "click numberSix ");

        WebElement element0 = mergeAndFindMobileElement(numberZero);
        elementClick(element0, "click numberZero ");

        WebElement element3 = mergeAndFindMobileElement(numberThree);
        elementClick(element3, "click numberThree ");

        elementClick(element6, "click numberSix ");

        WebElement element2 = mergeAndFindMobileElement(numberTwo);
        elementClick(element2, "click numberTwo ");

        WebElement element8 = mergeAndFindMobileElement(numberEight);
        elementClick(element8, "click numberEight ");

        elementClick(element3, "click numberThree ");

        WebElement element9 = mergeAndFindMobileElement(numberNine);
        elementClick(element9, "click numberNine ");

        WebElement element4 = mergeAndFindMobileElement(numberFour);
        elementClick(element4, "click numberFour ");

        WebElement element5 = mergeAndFindMobileElement(numberFive);
        elementClick(element5, "click numberFive ");

        elementClick(element6, "click numberSix ");

        elementClick(element2, "click numberTwo ");

        elementClick(element0, "click numberZero ");

        elementClick(element0, "click numberZero ");

        WebElement element1 = mergeAndFindMobileElement(numberOne);
        elementClick(element1, "click numberOne ");

        elementClick(element3, "click numberThree ");

        elementClick(element8, "click numberEight ");

        elementClick(element0, "click numberZero ");

        elementClick(element8, "click numberEight ");

        elementClick(element5, "click numberFive ");

        elementClick(element0, "click numberZero ");

        WebElement btnContinue = mergeAndFindMobileElement(continueGiftCart);
        elementClick(btnContinue, "click continueGiftCart ");
    }

    public void selectGiveXPaymentMethod(){
        WebElement btnContinue = mergeAndFindMobileElement(giveXPaymentMethod);
        elementClick(btnContinue, "click giveXPaymentMethod ");
    }

    public void verifyCCSidePaymentWithTipsAndFixGratuityForSandwiches(){
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndFixGratuityForSandwiches);
        String actualName1 = elementGetText(element1,"verify ccSidePaymentAmountWithTipsAndFixGratuityForSandwiches");
        String expectedName1 = "1.299,99+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwiches(){
//        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"verify the amount");
//
//        String expectedName1 = "629,90";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwiches(){
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsFreeItemWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"verify the amount");

        String expectedName1 = "1.079,90";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches(){
//        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"verify the amount");
//
//        String expectedName1 = "599,90";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches(){
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches1);
        String actualName1 = elementGetText(element1,"verify the amount");

        String expectedName1 = "999,90";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches(){
//        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"verify the amount");
//
//        String expectedName1 = "29,90+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches(){
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"verify the amount");

        String expectedName1 = "29,90+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }



    //    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches(){
//        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"verify the amount");
//        String expectedName1 = "29,90";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches(){
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "29,90+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches1(){
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches1);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "999,90";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches(){
//        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"verify the amount");
//        String expectedName1 = "539,90";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    //    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches(){
//        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"verify the amount");
//        String expectedName1 = "599,30";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches(){
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsAmountWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "994,90+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches1(){
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsAmountWithTaxExemptForSandwiches1);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "989,90";

        Assert.assertEquals(actualName1,expectedName1);
    }

    //    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches(){
//        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"verify the amount");
//        String expectedName1 = "499,90";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "899,90+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches1(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches1);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "899,90";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches(){
//        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches);
//        String actualName1 = elementGetText(element1,"verify the amount");
//        String expectedName1 = "499,91";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "899,91+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches1(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches1);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "899,91";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithoutTipsAndTaxExemptForSandwiches(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithoutTipsAndTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "999,90";

        Assert.assertEquals(actualName1,expectedName1);

    }
    public void VerifyCCSidePaymentWithTipsAndTaxExemptForSandwiches(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "999,90+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
//nov 29
    public void VerifyCCSidePaymentWithTipsAndTaxExemptForSandwiches2(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "999,90+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //new nov 18
    public void VerifyCCSidePaymentWithTipsAndTaxExemptForSandwiches1(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndTaxExemptForSandwiches);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "999,90+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndVaryingGratuityForSandwiches(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName = elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1=mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndVaryingGratuityForSandwiches);
        String actualName1 = elementGetText(element1,"verify the amount");
        String expectedName1 = "1.299,99+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void clickCashButton(){
        try {
            WebElement element = mergeAndFindMobileElement(cashButton);
            elementClick(element, "click cashButton ");
        }
        catch(Exception e){
            utils.log().info("cash button not clicked");
        }
    }

    public void clickSubmitButton(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        try {
            WebElement element = mergeAndFindMobileElement(submitButton);
            elementClick(element, "click submitButton ");
        }
        catch(Exception e){
            utils.log().info("submit button not clicked");

        }
    }

    public void clickCashPaymentTab(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(cashOnMenuItemPage);
        elementClick(element, "click cashOnMenuItemPage ");
    }

    public void paidCashAmount(){
        /*driver.findElement(paidCheckAmount).isDisplayed();
        driver.findElement(paidCheckAmount).click();
        driver.findElement(enter).click();
        */
    }

    public void clickSplitButtonOnCalculator(){
        WebElement element = mergeAndFindMobileElement(splitButtonOnCalculator);
        elementClick(element, "click splitButtonOnCalculator ");
    }

    public void selectSplitType(){
        WebElement element = mergeAndFindMobileElement(splitType);
        elementClick(element, "click splitType ");
    }

    public void selectCashPaymentMethod(){
        WebElement element = mergeAndFindMobileElement(cashButtonOnPayment);
        elementClick(element, "click cashButtonOnPayment ");
    }

    public void verifyPaidAmountWithSplit(){
        WebElement element=mergeAndFindMobileElement(paidAmount);
        String actualName = elementGetText(element,"verify paidAmount");
        //String expectedName = driver.findElement(balance).getText();

        //Assert.assertEquals(actualName,expectedName);
    }
    public void verifyVoidAfterPayment(){
        WebElement element=mergeAndFindMobileElement(voidAfterPaymentPopupInfo);
        String actualName = elementGetText(element,"verify voidAfterPaymentPopupInfo");
        String expectedName = "Payment(s) made on this check,Can you return this to Walkin";
        Assert.assertEquals(actualName,expectedName);
    }
    public void clickExitButton(){
        WebElement element = mergeAndFindMobileElement(exitButtonOnPayment);
        elementClick(element, "click exitButtonOnPayment ");
    }

    public void selectPaidOrder(){
        WebElement element = mergeAndFindMobileElement(paidOrder);
        elementClick(element, "click paidOrder ");
    }

    public void clickDeleteButton(){
        WebElement element = mergeAndFindMobileElement(deleteButtonOnPayment);
        elementClick(element, "click deleteButtonOnPayment ");
    }

    public void paySeat(){
        WebElement element = mergeAndFindMobileElement(exactButton);
        elementClick(element, "click exactButton ");

        WebElement element1 = mergeAndFindMobileElement(cashButtonOnPayment);
        elementClick(element1, "click cashButtonOnPayment ");

        WebElement element2 = mergeAndFindMobileElement(exitButtonOnPayment);
        elementClick(element2, "click exitButtonOnPayment ");
    }

    public void verifyPaymentPage(){
        WebElement element=mergeAndFindMobileElement(paymentMethodTitle);
        String actualName = elementGetText(element,"verify paymentMethodTitle");
        String expectedName = "Select Payment Method";
        Assert.assertEquals(actualName,expectedName);
    }
    public void closeReceiptPrinter(){
        WebElement element2 = mergeAndFindMobileElement(receiptPrinter);
        element2.isDisplayed();

        WebElement element = mergeAndFindMobileElement(receiptPrinterOkButton);
        elementClick(element, "click receiptPrinterOkButton ");
    }

    public void verifyEmptyPaymentArea(){
        WebElement element=mergeAndFindMobileElement(emptyPayment);
        String actualName = elementGetText(element,"verify emptyPayment");
        String expectedName = "";
        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyCashPaidOnPaymentPage(){
        WebElement element=mergeAndFindMobileElement(paymentStatusSuccess);
        String actualName = elementGetText(element,"verify paymentStatusSuccess");
        String expectedName = "Success";
        Assert.assertEquals(actualName,expectedName);
    }
    public void selectCreditCardPaymentMethod(){
        WebElement element1 = mergeAndFindMobileElement(creditCardOption);
        elementClick(element1, "click creditCardOption ");
    }

    public void selectGiftCardPaymentMethod(){
        WebElement element1 = mergeAndFindMobileElement(giftCardOption);
        elementClick(element1, "click giftCardOption ");
    }

    public void clickManuelButton(){
        WebElement element = mergeAndFindMobileElement(manuelButton);
        elementClick(element, "click manuelButton ");
    }

    public void clickProcessButton(){
        WebElement element = mergeAndFindMobileElement(giftProcessButton);
        elementClick(element, "click giftProcessButton ");
    }

    public void enterGiftCardNumber(){
        WebElement element = mergeAndFindMobileElement(giftCardNumberTextField);
        elementClick(element, "click giftCardNumberTextField ");
        element.sendKeys("12345");
//        driver.hideKeyboard();

        /*driver.findElement(numberOne).click();
        driver.findElement(numberTwo).click();
        driver.findElement(numberThree).click();
        driver.findElement(numberFour).click();
        driver.findElement(numberFive).click();
        driver.findElement(numberSix).click();
        driver.findElement(numberSeven).click();
        driver.findElement(numberEight).click();
        driver.findElement(numberNine).click();
        driver.findElement(numberZero).click();*/

        //driver.findElement(continueButton).click();
    }

    public void enterGiftCardName(){
        WebElement element = mergeAndFindMobileElement(giftCardName);
        elementClick(element, "click giftCardNumberTextField ");
        element.sendKeys("Test Automation");
//        driver.hideKeyboard();
    }

    public void enterGiftCardExpireDate(){
        WebElement element = mergeAndFindMobileElement(giftExpireDate);
        elementClick(element, "click giftExpireDate ");
    }

    public void enterGiftCardCVV(){
        WebElement element = mergeAndFindMobileElement(giftCVV);
        elementClick(element, "click giftCVV ");
        element.sendKeys("123");
    }

    public void enterGiftCardZipCode(){
        WebElement element = mergeAndFindMobileElement(giftZipCode);
        elementClick(element, "click giftZipCode ");
        element.sendKeys("3400");
//        driver.hideKeyboard();
    }

    public void selectLoyaltyPaymentMethod(){
        WebElement element = mergeAndFindMobileElement(LoyaltyPaymentButton);
        elementClick(element, "click LoyaltyPaymentButton ");
    }

    public void verifyLoyaltyPayment(){
        WebElement element=mergeAndFindMobileElement(PaidMethodWithLoyalty);
        String actualName = elementGetText(element,"verify PaidMethodWithLoyalty");
        String expectedName = "1. Loyalty(#1)";

        Assert.assertEquals(actualName,expectedName);
    }

    public void selectCardType(){
        WebElement element = mergeAndFindMobileElement(othersCardType);
        elementClick(element, "click othersCardType ");

        WebElement element1 = mergeAndFindMobileElement(okButton);
        elementClick(element1, "click okButton ");
    }

    public void clickCustomButton(){
        WebElement element = mergeAndFindMobileElement(customButton);
        elementClick(element, "click customButton ");
    }

    public void enterTipBalance(){
        WebElement element = mergeAndFindMobileElement(numberOne1);
        elementClick(element, "click numberOne ");

        WebElement element1 = mergeAndFindMobileElement(numberDoubleZero);
        elementClick(element1, "click numberDoubleZero ");

        WebElement element2 = mergeAndFindMobileElement(applyTip);
        elementClick(element2, "click applyTip ");
    }

    public void clickContinueButton(){
        WebElement element = mergeAndFindMobileElement(continueButton);
        elementClick(element, "click continueButton ");
    }

    public void verifyTipAmount(){
        WebElement element = mergeAndFindMobileElement(tipAmount);
        String actualName=elementGetText(element,"verify tipAmount");
        String expectedName = "10,00";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyCCSidePaymentMethod(){
        WebElement element = mergeAndFindMobileElement(paymentStatusSuccess);
        String actualName=elementGetText(element,"verify paymentStatusSuccess");
        String expectedName = "Success";

        Assert.assertEquals(actualName,expectedName);
    }
    public void swipeUntilCCSide(String direction) throws Exception{

        direction = direction.toLowerCase();
        int i = 0;
        boolean found = false;

        while (i < 3) {
            try {
                if (isElementExists()) {
                    //LOGGER.info(ccSidePaymentOption + " - FOUNDED");
                    found = true;
                    break;
                } else {
                    //LOGGER.info(ccSidePaymentOption + " - FOUNDED but not displayed!");
                    scrollToElement(ccSidePaymentOption,direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(ccSidePaymentOption,direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
    }

    public void clickCCSidePaymentMethod(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(ccSidePaymentOption);
        elementClick(element, "click ccSidePaymentOption ");
    }

    public void clickNoTipButton(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(noTipButton);
        elementClick(element, "click noTipButton ");
    }

    public void click10TLPartialPaymentOption(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(partialPaymentForTenPrice);
        elementClick(element, "click partialPaymentForTenPrice ");
    }

    public void verifyPartialPaymentWithTen(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(partialPaymentPriceSummary);
        String actualName=elementGetText(element,"verify partialPaymentPriceSummary");
        String expectedName = "990,00+10,00";

        Assert.assertEquals(actualName,expectedName);
    }

    public void clickAdjustButton(){
        WebElement element = mergeAndFindMobileElement(adjustButton);
        elementClick(element, "click adjustButton ");
    }

    public void enterNewPaidAmount(){
        WebElement element = mergeAndFindMobileElement(clearButtonOnCalculator);
        elementClick(element, "click clearButtonOnCalculator ");

        WebElement element1 = mergeAndFindMobileElement(numberOne);
        elementClick(element1, "click numberOne ");

        WebElement element00 = mergeAndFindMobileElement(numberDoubleZero);
        elementClick(element00, "click numberDoubleZero ");


        WebElement element0 = mergeAndFindMobileElement(numberZero);
        elementClick(element0, "click numberZero ");
    }

    public void selectSplitOption(){
        WebElement element= mergeAndFindMobileElement(halfSplitOption);
        elementClick(element, "click halfSplitOption ");
    }

    public void verifySplitPaidAmount(){
        WebElement element = mergeAndFindMobileElement(balanceDue);
        String actualName=getAttribute(element,"value");
        String expectedName = "TL 550,00";
        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyLastSplitPaidAmount(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(remainderSplitAmount);
        String actualName=elementGetText(element,"verify remainderSplitAmount");
        String expectedName = "550,00";

        actualName.equals(expectedName);
    }
    public void verifyBalanceDueChangedNoDue(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(balanceDue);
        String txtBalanceDue=elementGetText(element,"verify balanceDue");

        WebElement element1 = mergeAndFindMobileElement(cashButtonOnPayment);
        elementClick(element1, "click cashButtonOnPayment ");

        WebElement element2 = mergeAndFindMobileElement(noDueTextBox);
        String txtBoxNoDue=elementGetText(element2,"verify noDueTextBox");

        if(txtBalanceDue!=txtBoxNoDue){

            Assert.assertTrue("No Due", true);
        }
    }
    /*public String OrderAmountManually(){
        driver.findElement(paymentTextBox).sendKeys("10,00");
        return null;
    }*/
    public void verifyChangedOrderAmount(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(paymentTextBox);
        String actualName=getAttribute(element,"value");
        String expectedName = "TL 0,00";
        Assert.assertEquals(expectedName,actualName);

        WebElement element1 = mergeAndFindMobileElement(numberOne);
        elementClick(element1, "click numberOne ");

        WebElement element00 = mergeAndFindMobileElement(numberDoubleZero);
        elementClick(element00, "click numberDoubleZero ");


        WebElement element0 = mergeAndFindMobileElement(numberZero);
        elementClick(element0, "click numberZero ");

        WebElement element3= mergeAndFindMobileElement(paymentTextBox);
        String actualName2=getAttribute(element3,"value");
        String expectedName2 = "TL 10,00";

        Assert.assertEquals(expectedName2,actualName2);
        if(expectedName!=expectedName2){
            System.out.println("changed order amount");
        }
    }

    public void enterPartialAmountOrder(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element1 = mergeAndFindMobileElement(numberOne);
        elementClick(element1, "click numberOne ");

        WebElement element00 = mergeAndFindMobileElement(numberDoubleZero);
        elementClick(element00, "click numberDoubleZero ");


        WebElement element0 = mergeAndFindMobileElement(numberZero);
        elementClick(element0, "click numberZero ");
    }

    public void verifyPartialPaymentShortChangePopup(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element3= mergeAndFindMobileElement(shortChangedPopup);
        String expectedName=elementGetText(element3,"verify shortChangedPopup");
        String actualName = "Please pay TL 33,00";

        Assert.assertEquals(expectedName,actualName);

        WebElement element = mergeAndFindMobileElement(doneButton);
        elementClick(element, "click doneButton ");
    }
    //nov 18
    public void verifyNoMorePaymentPopup(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element3= mergeAndFindMobileElement(noMorePaymentPopup);
        String expectedName=elementGetText(element3,"verify noMorePaymentPopup");
        String actualName = "No More payments Needed";

        Assert.assertEquals(expectedName,actualName);

//        WebElement element = mergeAndFindMobileElement(doneButton);
//        elementClick(element, "click doneButton ");
    }
    //nov 18
    public void verifySelectPaymentWarningPopup(){
        WebElement element= mergeAndFindMobileElement(selectPaymentTryAgainWarningPopup);
        String expectedName=elementGetText(element,"verify selectPaymentTryAgainWarningPopup");
        String actualName = "Select a Payment and try again!";

        Assert.assertEquals(expectedName,actualName);

//        WebElement element1 = mergeAndFindMobileElement(doneButton);
//        elementClick(element1, "click doneButton ");
    }
    public void verifySelectPaymentWarningPopup1(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element= mergeAndFindMobileElement(selectPaymentTryAgainWarningPopup);
        String expectedName=elementGetText(element,"verify selectPaymentTryAgainWarningPopup");
        String actualName = "Select a Payment and try again!";

        Assert.assertEquals(expectedName,actualName);

//        WebElement element1 = mergeAndFindMobileElement(doneButton);
//        elementClick(element1, "click doneButton ");
    }

    public void verifyDeletedPaidCheck(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element= mergeAndFindMobileElement(emptyPaidOrder);
        String expectedName=elementGetText(element,"verify emptyPaidOrder");
        String actualName = "";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyLastClosedTableServiceTypeCheck(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"TABLESERVICE\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();

//        List<WebElement> lastClosedOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < lastClosedOrders.size(); index++) {
//
//            lastClosedOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"TABLESERVICE\"])[last()]"));
//
//            lastClosedOrders.get(lastClosedOrders.size() - 1).click();
//        }

    }
    public void closeReceiptPrinterPopup(){
        WebElement element = mergeAndFindMobileElement(receiptPrinter);
        element.isDisplayed();

        WebElement element1 = mergeAndFindMobileElement(receiptPrinterOkButton);
        elementClick(element1, "click receiptPrinterOkButton ");
    }

    public void clickTaxExempt(){
        WebElement element = mergeAndFindMobileElement(taxExemptOption);
        elementClick(element, "click taxExemptOption ");
    }

    public void enterGiftCardNumberOnPaymentPage(){
        WebElement element = mergeAndFindMobileElement(giftCardNumber);
        element.sendKeys("1234567890");
    }

    public void verifyDirectedPaymentPage(){
        WebElement element = mergeAndFindMobileElement(paymentMethodTitle);
        String actualName=elementGetText(element,"verify paymentMethodTitle");
        String expectedName = "Select Payment Method";

        Assert.assertEquals(actualName,expectedName);
    }
    //nov 19
    public void clickClearButtonOnGİftCard(){
//        WebElement element = mergeAndFindMobileElement(clearGiftCardInfo);
//        elementClick(element, "click clearGiftCardInfo ");
        WebElement element = mergeAndFindElement(cardNumberTxtField,"", TestUtils.XPath);
//        sendKeys(element, "Number");
        element.clear();
    }

    public void verifyGiftCardSuccessPayment(){
        WebElement element = mergeAndFindMobileElement(giftCardPaymentSummary);
        String actualName=elementGetText(element,"verify giftCardPaymentSummary");
        String expectedName = "1. Gift Card(#1)";

        Assert.assertEquals(actualName,expectedName);
    }

    public void clickNoThanksPrintReceiptOption(){
        WebElement element = mergeAndFindMobileElement(noThanksOption);
        elementClick(element, "click noThanksOption ");
    }

    public void printerPopUp(){
        WebElement element = mergeAndFindMobileElement(printerOkButton);
        elementClick(element, "click printerOkButton ");
    }

    public void verifyCreditCardPaymentMethod(){
        WebElement element = mergeAndFindMobileElement(creditCardPaymentMethod);
        String actualName=elementGetText(element,"verify creditCardPaymentMethod");
        String expectedName = "Credit Card";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickCreditCardPaymentMethod(){
        WebElement element = mergeAndFindMobileElement(creditCardPaymentMethod);
        elementClick(element, "click creditCardPaymentMethod");
    }

    public void selectAnyAmountOfTips(){
        WebElement element = mergeAndFindMobileElement(firstTipOption);
        elementClick(element, "click firstTipOption");
    }

    public void enterCreditCardNumber() {
        WebElement element = mergeAndFindMobileElement(creditCardNumber);
        element.sendKeys("411111111111111");
    }

    public void enterCreditCardCVVInfo(){
        WebElement element = mergeAndFindMobileElement(creditCardCVVInfo);
        element.sendKeys("411111111111111");
    }

    public void enterCreditCardExpireDate(){
        WebElement element = mergeAndFindMobileElement(creditCardExpireDate);
        element.sendKeys("0222");
    }

    public void selectTipAmountWhichIsEntered(){
        WebElement element = mergeAndFindMobileElement(firstEnteredTip);
        elementClick(element, "click firstEnteredTip");
    }
    //nov 18
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsPercentage(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsPercentage);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.100,01+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //nov 18
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsPercentage(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsPercentage);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "1.080,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //nov 18
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsAmount(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsAmount);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "1.190,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //nov 18
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsAmount(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsAmount);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "1.659,89+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //nov 18
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPrice(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsSetPrice);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "1.463,59+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    //nov 18
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsFreeItem(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsFreeItem);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "1.200,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //nov 18
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPrice(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsSetPrice);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.200,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    //nov 18
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsFreeItem(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsFreeItem);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "1.212,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTips(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetail);
        String actualName=elementGetText(element,"verify CCSidePaymentDetail");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmount);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.200,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsPercentage(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsPercentage);
//        String actualName1=elementGetText(element1,"verify Amount");
//
//        String expectedName1 = "1.080,00+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsPercentage(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountBTAsPercentage);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "1.080,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsAmount(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsAmount);
//        String actualName1=elementGetText(element1,"verify Amount");
//
//        String expectedName1 = "1.194,00+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsAmount(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsAmount);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "1.194,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsSetPrice(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsSetPrice);
//        String actualName1=elementGetText(element1,"verify Amount");
//
//        String expectedName1 = "230,00+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsSetPrice(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsSetPrice);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "230,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsSetPrice(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsSetPrice);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "36,00+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsSetPrice(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsSetPrice);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "36,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsAmount(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsAmount);
//        String actualName1=elementGetText(element1,"verify Amount");
//
//        String expectedName1 = "1.195,00+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsAmount(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountATAsAmount);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "1.195,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsPercentage(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsPercentageForSandwiches);
//        String actualName1=elementGetText(element1,"verify Amount");
//
//        String expectedName1 = "1.100,01+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsPercentage(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountATAsPercentageForSandwiches);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "1.000,01+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsFreeItem(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItem);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "810,01+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsFreeItemForSandwich(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItemForSandwich);
//        String actualName1=elementGetText(element1,"verify Amount");
//
//        String expectedName1 = "810,01+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
//    public void verifySideCCPaymentWithTipsAndOpenItemBeforeTaxAmountSafetyLimitAsDecimal(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC(#1)";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(sidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "1.201,10+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    //nov 18
    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsFreeItemForSandwiches(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItemForSandwiches);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.200,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountBeforeTaxAsFreeItem(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItem);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "44,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndOpenItemAfterTaxAsAmountSafetyLimitAsDecimal(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItemForSandwich);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "2.211,06+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndOpenItemBeforeTaxAmountSafetyLimitAsDecimal(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "810,02+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifySideCCPaymentWithTipsAndOpenItemBeforeTaxAmountSafetyLimitAsDecimal(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(sidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.201,10+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }


    public void verifySideCCPaymentWithTipsAndOpenItemBeforeTaxAmountSafetyLimitAsDecimal1(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(sidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem1);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.200,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //nov 18
    public void verifyCCSidePaymentWithTipsAndOpenItemAfterTaxAsAmountSafetyLimitAsDecimalForSandwiches(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItemForSandwiches);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.200,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyCCSidePaymentWithTipsAndOpenItemBeforeTaxAsAmountSafetyLimitAsDecimal(){
//        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
//        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "810,01+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    public void verifyCCSidePaymentWithTipsAndOpenItemBeforeTaxAsAmountSafetyLimitAsDecimal(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountBTAsFreeItem);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "2.211,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCCSidePaymentWithTipsAndOpenItemBeforeTaxAsAmountSafetyLimitAsDecimalForSandwiches(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxForSandwiches);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "2.211,06+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCCSidePaymentWithTipsAndOpenItemAfterTaxAsAmountSafetyLimitAsNonDecimalValue(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenItemDiscountAfterTax);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "2.211,06+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndOpenItemBeforeTaxAsAmountSafetyLimitAsNonDecimal(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenItemDiscountBeforeTaxWithNonDecimalValue);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "2.211,06+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsPercentageForSandwiches(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithPercentage);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.000,01+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndOpenCheckBeforeTaxAsPercentageForSandwiches(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxWithPercentage);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "990,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsAmountForSandwiches(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName = "1. CC Side";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmount);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "50,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsAmountForMargarita(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountForMargarita);
        String actualName1=elementGetText(element,"verify Amount");
        String expectedName1 = "TL 10,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
     //new nov 29
    public void verifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsAmountForMargarita1(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountForMargarita1);
        String actualName1=elementGetText(element,"verify Amount");
        String expectedName1 = "1.099,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndOpenCheckBeforeTaxAsAmountForPolloParm(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxWithAmount);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.097,75+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentAmountAsNonDecimalWithTipsAndOpenCheckBeforeTaxAsAmountForPolloParm(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName = "1. CC Side";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmount);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "50,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentAmountAsNonDecimalWithTipsAndOpenCheckBeforeTaxAsAmountForMargarita(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountAndTipForMargarita);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.100,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndOpenCheckAfterTaxAsDecimalAmountForPolloParm(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithNonDecimalAmount);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.098,95+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyCCSidePaymentWithGratuityFixedAndWithTips(){
//        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
//        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithGratuityFixAndWithTips);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "917,99+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    public void verifyCCSidePaymentWithGratuityFixedAndWithTips(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(sideCCPaymentDetailAmountWithGratuityFixAndWithTips);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.199,99+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

//    public void verifyCCSidePaymentWithGratuityVaryingAndWithTips(){
//        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
//        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithGratuityVaryingAndWithTips);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "900,00+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    public void verifyCCSidePaymentWithGratuityVaryingAndWithTips(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(sideCCPaymentDetailAmountWithGratuityVaryingAndWithTips);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.249,99+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyCCSidePaymentWithTaxExemptAsSelectCustomerAndWithTips(){
//        WebElement element = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithTaxExemptAndWithTips);
//        String actualName1=elementGetText(element,"verify ccSidePaymentMethod");
//        String expectedName1 = "599,90+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    //xpath changes (nov 11)
    public void verifyCCSidePaymentWithTaxExemptAsSelectCustomerAndWithTips(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches2);
        String actualName1=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName1 = "999,90+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCCSidePaymentWithTaxExemptAsNotSelectCustomerInPaymentScreenAndWithTips(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithNotSelectedCustomer);
        String actualName1=elementGetText(element,"verify Amount");
        String expectedName1 = "599,90+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyCCSidePaymentWithTaxExemptAsPredefinedCustomerInPaymentScreenAndWithTips(){
//        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
//        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
//        String expectedName = "1. CC Side";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithPreDefinedCustomer);
//        String actualName1=elementGetText(element1,"verify Amount");
//
//        String expectedName1 = "30,00+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }

    //xpath changes (nov 11)
    public void verifyCCSidePaymentWithTaxExemptAsPredefinedCustomerInPaymentScreenAndWithTips(){
        WebElement element = mergeAndFindMobileElement(ccSidePaymentMethod);
        String actualName=elementGetText(element,"verify ccSidePaymentMethod");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithPreDefinedCustomer1);
        String actualName1=elementGetText(element1,"verify Amount");

        String expectedName1 = "999,90+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void verifyCCSidePaymentWithUpchargeAddModifierMenuItemInPaymentScreenAndWithTips(){
        WebElement element = mergeAndFindMobileElement(CCSideOpenItemPaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSideOpenItemPaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithUpchargeOrderAndWithTips);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "12,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentInPaymentScreenAndWithoutTips(){
        WebElement element = mergeAndFindMobileElement(CCSideOpenItemPaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSideOpenItemPaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithoutTip);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentInPaymentScreenAndWithTips(){
        WebElement element = mergeAndFindMobileElement(CCSideOpenItemPaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSideOpenItemPaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithTip);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.100,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyTipAmountWithCCSidePaymentInPaymentScreen(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetail);
        String actualName=elementGetText(element,"verify CCSidePaymentDetail");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithTipForBarTab);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.100,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyItemBasedDiscountAfterTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTips(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAfterTaxWithPercentagePaymentDetailAmountWithTip);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "555,01+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
    // }
    public void verifyItemBasedDiscountAfterTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTips(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountATWithPercentagePaymentDetailAmountWithTip);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "132,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountBeforeTaxWithAmountPriceWithCCSidePaymentInPaymentScreenAndWithTips(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithAmountPaymentDetailAmountWithTip);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.617,90+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountBeforeTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTips(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. CC Side";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithAmountPaymentDetailAmountWithTip);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "138,60+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyItemBasedDiscountBeforeTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTipsForMargarita(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithAmountPaymentDetailAmountWithTipForMargarita);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "1.089,00+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyItemBasedDiscountBeforeTaxWithPercentageWithCCSidePaymentInPaymentScreenAndWithTipsForMargarita(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountBTWithAmountPaymentDetailAmountWithTipForMargarita);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "999,90+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountBeforeTaxWithAmountWithCCSidePaymentInPaymentScreenAndWithTips(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithAmountPaymentDetailAmountWithTip);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "20,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyItemBasedDiscountAfterTaxWithAmountWithCCSidePaymentInPaymentScreenAndWithTips(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAfterTaxWithAmountPaymentDetailAmountWithTip);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "20,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsFreeItemForChickenSchnitzel(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountAfterTaxWithFreeItemPaymentDetailForChickenSchinitzel);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "605,01+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsFreeItemForChickenSchnitzel(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountBTWithFreeItemPaymentDetailForChickenSchinitzel);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "144,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemForChickenSchnitzel(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithFreeItemPaymentDetailForChickenSchinitzel);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "638,01+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemForChickenSchnitzel(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(itemBasedDiscountATWithFreeItemPaymentDetailForChickenSchinitzel);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "240,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);

    }
    //    public void userVerifyCCSidePaymentWithTipAmountAndItemBasedDiscountAfterTaxAsAmountForChickenSchnitzel(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsPercentageForChickenSchinitzel);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "787,90+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void userVerifyCCSidePaymentWithTipAmountAndItemBasedDiscountAfterTaxAsAmountForChickenSchnitzel(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithItemBasedDiscountATAsPercentageForChickenSchinitzel);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "780,59+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceForChickenSchnitzel(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsSetPriceForPizzaRomano);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "657,90+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountAfterTaxAsSetPriceForChickenSchnitzel(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithItemBasedDiscountATAsSetPriceForPizzaRomano);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.463,59+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceForChickenSchnitzel(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithItemBasedDiscountBeforeTaxAsSetPriceForChickenSchinitzel);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "121,00+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceForChickenSchnitzel(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithItemBasedDiscountBTAsSetPriceForChickenSchinitzel);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.200,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsOpenItemWithSandwiches(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenItemDiscountAfterTaxForSandwiches);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "810,02+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndCheckBasedDiscountAfterTaxAsOpenItemWithSandwiches(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenItemDiscountATForSandwiches);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.101,10+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndOpenItemDiscountAfterTaxAsPercentage(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenItemDiscountAfterTaxPercentageForSandwiches);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "810,02+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndOpenItemDiscountAfterTaxAsPercentage(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenItemDiscountATPercentageForSandwiches);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.101,10+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscount(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxForSandwiches);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "750,02+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscount(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountATForSandwiches);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "900,02+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscount(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxForSandwiches);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "743,41+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscount(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountBTForSandwiches);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "960,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndOpenCheckDiscountAmountBeforeTaxAsOpenDiscount(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(sidePaymentDetailAmountWithOpenCheckDiscountAmountBeforeTaxForSandwiches);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.106,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscountWithAmountAndDecimalValue(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxForSandwiches);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "29,70+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscountWithAmountAndDecimalValue(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxForMargarita);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "1.198,84+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscountWithAmountAndDecimalValue(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountBTForMargarita);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.105,50+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    //    public void verifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscountWithAmountAndNonDecimalValue(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueAfterTaxForMargarita);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "1.321,00+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscountWithAmountAndNonDecimalValue(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueATForMargarita);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.101,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void userVerifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscountWithAmountAndNonDecimalValue(){
        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailBarTab);
        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
        String expectedName = "1. Side CC(#1)";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueBTForMargarita);
        String actualName1=elementGetText(element1,"verify Amount");
        String expectedName1 = "1.100,00+100,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void userVerifyCCSidePaymentWithTipsAndOpenCheckDiscountBeforeTaxAsOpenDiscountWithAmountAndNonDecimalValue(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueBeforeTaxForMargarita);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "1.198,90+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
//    public void verifyCCSidePaymentWithTipsAndOpenCheckDiscountAfterTaxAsOpenDiscountWithAmountAndNonDecimalValue(){
//        WebElement element = mergeAndFindMobileElement(CCSidePaymentDetailForBarTab);
//        String actualName=elementGetText(element,"verify CCSidePaymentDetailForBarTab");
//        String expectedName = "1. Side CC(#1)";
//
//        Assert.assertEquals(actualName,expectedName);
//
//        WebElement element1 = mergeAndFindMobileElement(ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueAfterTaxForMargarita);
//        String actualName1=elementGetText(element1,"verify Amount");
//        String expectedName1 = "1.101,00+100,00";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }


}





