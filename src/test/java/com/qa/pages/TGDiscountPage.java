package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TGDiscountPage extends BasePage {


    public void selectCheckBasedDiscountBeforeTaxWithOpenItem(){
//        driver.findElement(checkBasedDiscountBeforeTaxWithOpenItem).isDisplayed();
        WebElement btnCheckBasedDiscountBeforeTaxWithOpenItem=mergeAndFindMobileElement(checkBasedDiscountBeforeTaxWithOpenItem);
        elementClick(btnCheckBasedDiscountBeforeTaxWithOpenItem,"Check Based Discount Before Tax With Open Item Clicked");
        //        driver.findElement(checkBasedDiscountBeforeTaxWithOpenItem).click();
    }
    public void selectItemBasedDiscountAfterTaxTaxAsAmount(){
//        driver.findElement(itemBasedDiscountAfterTaxAsAmount).isDisplayed();
        WebElement btnItemBasedDiscountAfterTaxAsAmount=mergeAndFindMobileElement(itemBasedDiscountAfterTaxAsAmount);
        elementClick(btnItemBasedDiscountAfterTaxAsAmount,"Item Based Discount After Tax As Amount Clicked");
//        driver.findElement(itemBasedDiscountAfterTaxAsAmount).click();
    }
    public void selectItemBasedDiscountBeforeTaxTaxAsPercentage(){
//        driver.findElement(itemBasedDiscountBeforeTaxAsPercentage).isDisplayed();
        WebElement btnItemBasedDiscountBeforeTaxAsPercentage=mergeAndFindMobileElement(itemBasedDiscountBeforeTaxAsPercentage);
        elementClick(btnItemBasedDiscountBeforeTaxAsPercentage,"Item Based Discount After Tax As Percentage Clicked");
//        driver.findElement(itemBasedDiscountBeforeTaxAsPercentage).click();
    }
    public void selectItemBasedDiscountAsAmountOptionWhichHasSafetyLimitInDecimalPrecisionWhichHasAfterTax(){
        WebElement btnItemBasedDiscountAfterTaxAsAmount=mergeAndFindMobileElement(itemBasedDiscountAfterTaxAsAmount);
        elementClick(btnItemBasedDiscountAfterTaxAsAmount,"Item Based Discount After Tax As Amount Clicked");
//        driver.findElement(itemBasedDiscountAfterTaxAsAmount).isDisplayed();
//        driver.findElement(itemBasedDiscountAfterTaxAsAmount).click();
    }
    public void selectDiscountOption() {
        WebElement btnDiscountOption=mergeAndFindMobileElement(discountOption);
        elementClick(btnDiscountOption,"Discount Option Clicked");

//        driver.findElement(discountOption).isDisplayed();
//        driver.findElement(discountOption).click();
    }
    public void selectCheckDiscountOption() {
        WebElement btnCheckDiscountOption=mergeAndFindMobileElement(checkDiscountOption);
        elementClick(btnCheckDiscountOption,"Check Discount Option Clicked");
//        driver.findElement(checkDiscountOption).isDisplayed();
//        driver.findElement(checkDiscountOption).click();
    }
    public void selectCheckDiscountPercentage() {
        WebElement btnDiscountPercentage=mergeAndFindMobileElement(discountPercentage);
        elementClick(btnDiscountPercentage,"Discount Percentage Option Clicked");
//        driver.findElement(discountPercentage).isDisplayed();
//        driver.findElement(discountPercentage).click();
    }
    public void verifyItemBasedDiscount() {
        WebElement actualValue=mergeAndFindMobileElement(discountPercentage);
        String actualName = elementGetText(actualValue,"Get Discount Percentage Value");
//                driver.findElement(discountPercentage).getText();
        String expectedName = "10%";
        Assert.assertEquals(actualName, expectedName);
    }
    public void selectItemDiscountTab() {
        WebElement btnItemDiscountTab=mergeAndFindMobileElement(itemDiscountTab);
        elementClick(btnItemDiscountTab,"Click Item Discount Tab");
//        driver.findElement(itemDiscountTab).isDisplayed();
//        driver.findElement(itemDiscountTab).click();

       /* String actualName = driver.findElement(itemDiscount).getText();
        String expectedName = "All days - Item Discount";
        Assert.assertEquals(actualName, expectedName);*/
    }
    public void selectItemDiscountType() {
        WebElement btnItemDiscount=mergeAndFindMobileElement(itemDiscount);
        elementClick(btnItemDiscount,"Click Item Discount Tab");
//        driver.findElement(itemDiscount).isDisplayed();
//        driver.findElement(itemDiscount).click();
    }
    public void verifyItemDiscountAmount() {
        WebElement txtDiscountWithAmount=mergeAndFindMobileElement(discountWithAmount);
        String actualName =elementGetText(txtDiscountWithAmount,"Get Discount Text With Amount");
//                driver.findElement(discountWithAmount).getText();
        String expectedName = "ItemBased with Amount";
        Assert.assertEquals(actualName, expectedName);
        WebElement txtDiscountWithAmountPrice=mergeAndFindMobileElement(discountWithAmountPrice);
        String actualName1 =elementGetText(txtDiscountWithAmountPrice,"Get Discount Text With Amount Price");
//        String actualName1 = driver.findElement(discountWithAmountPrice).getText();
        String expectedName1 = "1.000,00";

        Assert.assertEquals(actualName1, expectedName1);
    }
    public void verifyItemDiscountPercentage() {
        WebElement txtDiscountWithPercentage=mergeAndFindMobileElement(discountWithPercentage);
        String actualName = elementGetText(txtDiscountWithPercentage," Get Discount With Percentage");
        String expectedName = "ItemBased with Percentage";
        Assert.assertEquals(actualName, expectedName);
    }
    public void verifyCheckBasedDiscount() {
        WebElement element=mergeAndFindMobileElement(checkBasedDiscount);
        String actualName = elementGetText(element,"Check-Based Discount");
        String expectedName = "Check-Based Discount";
        Assert.assertEquals(actualName, expectedName);
    }
    public void selectItemBasedDiscount() {
        WebElement btnItemBasedDiscountOption=mergeAndFindMobileElement(itemBasedDiscountOption);
        elementClick(btnItemBasedDiscountOption,"Item Based Discount Option Selected");
//        driver.findElement(itemBasedDiscountOption).isDisplayed();
//        driver.findElement(itemBasedDiscountOption).click();
    }
    public void selectCheckBasedDiscount() {
        WebElement btnCheckBasedDiscount=mergeAndFindMobileElement(checkBasedDiscount);
        elementClick(btnCheckBasedDiscount,"Check Based Discount Selected");
//        driver.findElement(checkBasedDiscount).isDisplayed();
//        driver.findElement(checkBasedDiscount).click();
        WebElement btnBackButton=mergeAndFindMobileElement(backButton);
        elementClick(btnBackButton,"Back Button Selected");
//        driver.findElement(backButton).click();
    }
    public void clickItemBasedWithAmountDiscount() {
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement btnDiscountWithAmount=mergeAndFindMobileElement(discountWithAmount);
        elementClick(btnDiscountWithAmount,"Discount With Amount Selected");
//        driver.findElement(discountWithAmount).isDisplayed();
//        driver.findElement(discountWithAmount).click();
    }
    public void clickDiscountWithPercentage() {
        WebElement btnDiscountWithPercentage=mergeAndFindMobileElement(discountWithPercentage);
        elementClick(btnDiscountWithPercentage,"Discount With Percentage Selected");
//        driver.findElement(discountWithPercentage).isDisplayed();
//        driver.findElement(discountWithPercentage).click();
    }
    public void clickFreeItemButton() {
        WebElement btnFreeItemOption=mergeAndFindMobileElement(freeItemOption);
        elementClick(btnFreeItemOption,"Free Item Option Selected");
//        driver.findElement(freeItemOption).isDisplayed();
//        driver.findElement(freeItemOption).click();
        //driver.findElement(discountBackButton).click();
    }
    public void clickCheckBasedAmountDiscountOption() {
        WebElement btnCheckBasedAmount=mergeAndFindMobileElement(checkBasedAmount);
        elementClick(btnCheckBasedAmount,"Check Based Amount Selected");
//        driver.findElement(checkBasedAmount).isDisplayed();
//        driver.findElement(checkBasedAmount).click();
    }
    public void clickCheckDiscountOption() {
        WebElement btnCheckDiscountOption=mergeAndFindMobileElement(checkDiscountOption);
        elementClick(btnCheckDiscountOption,"Check Discount Option Selected");
//        driver.findElement(checkDiscountOption).isDisplayed();
//        driver.findElement(checkDiscountOption).click();
    }
    public void clickCheckBasedPercentageDiscountOption() {
        WebElement btnCheckBasedPercentage=mergeAndFindMobileElement(checkBasedPercentage);
        elementClick(btnCheckBasedPercentage,"Check Based Percentage Selected");
//        driver.findElement(checkBasedPercentage).isDisplayed();
//        driver.findElement(checkBasedPercentage).click();
    }
    public void clickCheckBasedFreeOption() {
        WebElement btnCheckBasedFreeOption=mergeAndFindMobileElement(checkBasedFreeOption);
        elementClick(btnCheckBasedFreeOption,"Check Based Free Option Selected");
//        driver.findElement(checkBasedFreeOption).isDisplayed();
//        driver.findElement(checkBasedFreeOption).click();
    }

    public void clickCheckBasedFreeOptionAfterApplied() {
        WebElement btnCheckBasedFreeOption=mergeAndFindMobileElement(checkBasedFreeOptionAfterApplied);
        elementClick(btnCheckBasedFreeOption,"Check Based Free Option Selected After Applied");
//        driver.findElement(checkBasedFreeOption).isDisplayed();
//        driver.findElement(checkBasedFreeOption).click();
    }

    public void clickCheckBasedSetPrice() {
        WebElement btnCheckBasedSetPriceOption=mergeAndFindMobileElement(checkBasedSetPriceOption);
        elementClick(btnCheckBasedSetPriceOption,"Check Based Set Price Option Selected");
//        driver.findElement(checkBasedSetPriceOption).isDisplayed();
//        driver.findElement(checkBasedSetPriceOption).click();
    }
    public void clickItemBasedAmountOption() {
        WebElement btnItemBasedWithAmount=mergeAndFindMobileElement(itemBasedWithAmount);
        elementClick(btnItemBasedWithAmount,"Item Based With Amount Selected");
//        driver.findElement(itemBasedWithAmount).isDisplayed();
//        driver.findElement(itemBasedWithAmount).click();
    }
    public void clickItemBasedPercentageOption() {
        WebElement btnItemBasedWithPercentage=mergeAndFindMobileElement(itemBasedWithPercentage);
        elementClick(btnItemBasedWithPercentage,"Item Based With Percentage Selected");
//        driver.findElement(itemBasedWithPercentage).isDisplayed();
//        driver.findElement(itemBasedWithPercentage).click();
    }
    public void clickItemBasedFreeOption() {
        WebElement btnItemBasedWithFree=mergeAndFindMobileElement(itemBasedWithFree);
        elementClick(btnItemBasedWithFree,"Item Based With Free Selected");
//        driver.findElement(itemBasedWithFree).isDisplayed();
//        driver.findElement(itemBasedWithFree).click();
        //driver.findElement(discountBackButton).click();
    }
    public void verifyEmptyDiscountOption() {
        WebElement btnItemBasedWithFree=mergeAndFindMobileElement(emptyDiscountOption);
        String actualName = elementGetText(btnItemBasedWithFree,"Get Empty discount");
        String expectedName = "";

        Assert.assertEquals(actualName, expectedName);
    }
    public void verifyFilledDiscountOptions() {
        WebElement btnItemBasedWithFree=mergeAndFindMobileElement(itemDiscountTab);
        String actualName = elementGetText(btnItemBasedWithFree,"Get Item Discount");
        String expectedName = "Item Discount";
        Assert.assertEquals(actualName, expectedName);
    }
    public void selectItemBasedDiscountAfterTaxOption() {
        WebElement btnItemBasedDiscountAfterTax=mergeAndFindMobileElement(itemBasedDiscountAfterTax);
        elementClick(btnItemBasedDiscountAfterTax,"Item Based Discount After Tax Selected");
//        driver.findElement(itemBasedDiscountAfterTax).isDisplayed();
//        driver.findElement(itemBasedDiscountAfterTax).click();
    }
    public void selectItemBasedDiscountAfterTaxDayRestrict() {
        WebElement btnItemBasedDiscountAfterTaxDayRestrict=mergeAndFindMobileElement(itemBasedDiscountAfterTaxDayRestrict);
        elementClick(btnItemBasedDiscountAfterTaxDayRestrict,"Item Based Discount After Tax Day Restrict Selected");
//        driver.findElement(itemBasedDiscountAfterTaxDayRestrict).isDisplayed();
//        driver.findElement(itemBasedDiscountAfterTaxDayRestrict).click();
    }
    public void selectItemBasedDiscountAfterTaxRoleRestrict() {
        WebElement btnItemBasedDiscountAfterTaxRoleRestrict=mergeAndFindMobileElement(itemBasedDiscountAfterTaxRoleRestrict);
        elementClick(btnItemBasedDiscountAfterTaxRoleRestrict,"Item Based Discount After Tax Role Restrict Selected");
//        driver.findElement(itemBasedDiscountAfterTaxRoleRestrict).isDisplayed();
//        driver.findElement(itemBasedDiscountAfterTaxRoleRestrict).click();

    }
    public void selectItemBasedDiscountBeforeTaxOption() {
        WebElement btnItemBasedDiscountAfterTax=mergeAndFindMobileElement(itemBasedDiscountAfterTax);
        elementClick(btnItemBasedDiscountAfterTax,"Item Based Discount After Tax Selected");
//        driver.findElement(itemBasedDiscountAfterTax).isDisplayed();
//        driver.findElement(itemBasedDiscountAfterTax).click();
    }
    public void selectItemBasedDiscountBeforeTaxRoleRestrict() {
        WebElement btnItemBasedDiscountBeforeTaxRoleRestrict=mergeAndFindMobileElement(itemBasedDiscountBeforeTaxRoleRestrict);
        elementClick(btnItemBasedDiscountBeforeTaxRoleRestrict,"Item Based Discount Before Tax Role Restrict Selected");
//        driver.findElement(itemBasedDiscountBeforeTaxRoleRestrict).isDisplayed();
//        driver.findElement(itemBasedDiscountBeforeTaxRoleRestrict).click();
    }
    public void selectCheckBasedDiscountAfterTax() {
        WebElement btnCheckBasedDiscountAfterTax=mergeAndFindMobileElement(checkBasedDiscountAfterTax);
        elementClick(btnCheckBasedDiscountAfterTax,"Check Based Discount After Tax Selected");
//        driver.findElement(checkBasedDiscountAfterTax).isDisplayed();
//        driver.findElement(checkBasedDiscountAfterTax).click();
    }
    public void selectItemBasedDiscountBeforeTaxRestrictDay() {
        WebElement btnItemBasedDiscountBeforeTaxRestrictDay=mergeAndFindMobileElement(itemBasedDiscountBeforeTaxRestrictDay);
        elementClick(btnItemBasedDiscountBeforeTaxRestrictDay,"Item Based Discount Before Tax Restrict Day Selected");
//        driver.findElement(itemBasedDiscountBeforeTaxRestrictDay).isDisplayed();
//        driver.findElement(itemBasedDiscountBeforeTaxRestrictDay).click();
    }

    //nov 17
    public void verifyItemBasedAfterTaxDayRestrict(){
        WebElement element=mergeAndFindMobileElement(itemBasedDiscountBeforeTaxRestrictDay1);
        String actualName = elementGetText(element,"After Tax Day Restriction");
        String expectedName =  "After Tax Day Restriction";

        Assert.assertEquals(actualName,expectedName);
        WebElement element1=mergeAndFindMobileElement(afterTaxDayRestrictDiscountAmount1);
        String actualName1 = elementGetText(element1,"Get TL 1,00");
        String expectedName1 = "TL 1,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyItemBasedBeforeTaxDayRestrict(){
//        WebElement element=mergeAndFindMobileElement(itemBasedDiscountBeforeTaxRestrictDay);
//        String actualName = elementGetText(element,"Get Before Tax Day Restriction");
//        String expectedName =  "BeforeTaxDayRestriction";
//
//        Assert.assertEquals(actualName,expectedName);
//        WebElement btnAfterTaxDayRestrictWarningText=mergeAndFindMobileElement(AfterTaxDayRestrictWarningText);
//        String actualName1 = elementGetText(btnAfterTaxDayRestrictWarningText,"Get TL 0,50");
//        String expectedName1 = "TL 0,50";
//
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyItemBasedBeforeTaxDayRestrict(){
        WebElement element=mergeAndFindMobileElement(itemBasedDiscountBRestrictDay);
        String actualName = elementGetText(element,"Get Before Tax Day Restriction");
        String expectedName =  "BeforeTaxDayRestriction";

        Assert.assertEquals(actualName,expectedName);
    //        WebElement btnAfterTaxDayRestrictWarningText=mergeAndFindMobileElement(AfterTaxDayRestrictWarningText);
    //        String actualName1 = elementGetText(btnAfterTaxDayRestrictWarningText,"Get TL 1.000,00");
    //        String expectedName1 = "TL 1.000,00";
    //
    //        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyItemBasedDiscountAfterTaxDayRestrictWarning(){
        WebElement btnAfterTaxDayRestrictWarningText=mergeAndFindMobileElement(AfterTaxDayRestrictWarningText);
        String actualName = elementGetText(btnAfterTaxDayRestrictWarningText,"Get After Tax Day Restrict Warning Text");
        String expectedName = "Paid amount exceeds the sale amount";
        Assert.assertEquals(actualName,expectedName);

        WebElement btnDoneButton=mergeAndFindMobileElement(doneButton);
        elementClick(btnDoneButton,"click Done");
    }
    public void verifyItemBasedDiscountBeforeTaxDayRestrictWarning(){
        WebElement btnAfterTaxDayRestrictWarningText=mergeAndFindMobileElement(AfterTaxDayRestrictWarningText);
        String actualName = elementGetText(btnAfterTaxDayRestrictWarningText,"Get After Tax Day Restrict Warning Text");
        String expectedName = "Paid amount exceeds the sale amount";
        Assert.assertEquals(actualName,expectedName);
        WebElement btnDoneButton=mergeAndFindMobileElement(doneButton);
        elementClick(btnDoneButton,"click Done");
    }
    public void selectCheckBasedBeforeTax(){
        WebElement btnCheckBasedBeforeTax=mergeAndFindMobileElement(checkBasedBeforeTax);
        elementClick(btnCheckBasedBeforeTax,"Check Based Before Tax Selected");
//        driver.findElement(checkBasedBeforeTax).isDisplayed();
//        driver.findElement(checkBasedBeforeTax).click();
    }
    public void verifyCheckBasedDiscountBeforeTax(){
        WebElement txtCheckBasedBeforeTaxText=mergeAndFindMobileElement(checkBasedBeforeTaxText);
        String actualName = elementGetText(txtCheckBasedBeforeTaxText,"Get Check Based Before Tax Text");
        String expectedName =  "CheckBased-BeforeTax";
        Assert.assertEquals(actualName,expectedName);
    }
    public void selectCheckBasedDiscountBeforeTaxDayRestrict(){
        WebElement btnCheckBasedDiscountBeforeTaxDayRestrict=mergeAndFindMobileElement(checkBasedDiscountBeforeTaxDayRestrict);
        elementClick(btnCheckBasedDiscountBeforeTaxDayRestrict,"Check Based Discount Before Tax Day Restrict Selected");
//        driver.findElement(checkBasedDiscountBeforeTaxDayRestrict).isDisplayed();
//        driver.findElement(checkBasedDiscountBeforeTaxDayRestrict).click();
    }
    public void verifyCheckBasedDiscountBeforeTaxDayRestrict(){
        WebElement btnCheckBasedDiscountBeforeTaxDayRestrictText=mergeAndFindMobileElement(checkBasedDiscountBeforeTaxDayRestrictText);
        String actualName = elementGetText(btnCheckBasedDiscountBeforeTaxDayRestrictText,"Get Check Based Discount Before Tax Day Restrict Text");
        String expectedName =  "CB-AfterTax-RestrictDay";
        Assert.assertEquals(actualName,expectedName);
    }
    public void selectCheckBasedDiscountBeforeTaxRoleRestrict(){
        WebElement btnCheckBasedDiscountBeforeTaxRoleRestrict=mergeAndFindMobileElement(checkBasedDiscountBeforeTaxRoleRestrict);
        elementClick(btnCheckBasedDiscountBeforeTaxRoleRestrict,"Check Based Discount Before Tax Role Restrict Selected");
//        driver.findElement(checkBasedDiscountBeforeTaxRoleRestrict).isDisplayed();
//        driver.findElement(checkBasedDiscountBeforeTaxRoleRestrict).click();
    }
    public void verifyCheckBasedDiscountBeforeTaxRoleRestrict(){
        WebElement txtCheckBasedDiscountBeforeTaxRoleRestrict=mergeAndFindMobileElement(checkBasedDiscountBeforeTaxRoleRestrict);
        String actualName = elementGetText(txtCheckBasedDiscountBeforeTaxRoleRestrict,"Get Check Based Discount Before Tax Role Restrict");
        String expectedName =  "CB-AfterTax-RestrictRole";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectCheckBasedDiscountAfterTaxOpenItem(){
        WebElement btnCheckBasedDiscountAfterTaxOpenItem=mergeAndFindMobileElement(checkBasedDiscountAfterTaxOpenItem);
        elementClick(btnCheckBasedDiscountAfterTaxOpenItem,"Check Based Discount After Tax Open Item Selected");
//        driver.findElement(checkBasedDiscountAfterTaxOpenItem).isDisplayed();
//        driver.findElement(checkBasedDiscountAfterTaxOpenItem).click();
    }
    public void enterOpenItemValue(){
        WebElement btnNumberOne=mergeAndFindMobileElement(numberOne);
        elementClick(btnNumberOne,"Number One Selected");
//        driver.findElement(numberOne).isDisplayed();
//        driver.findElement(numberOne).click();
        WebElement btnNumberDoubleZero=mergeAndFindMobileElement(numberDoubleZero);
        elementClick(btnNumberDoubleZero,"Number Double Zero Selected");
        elementClick(btnNumberDoubleZero,"Number Double Zero Selected");
//        driver.findElement(numberDoubleZero).click();
//        driver.findElement(numberDoubleZero).click();
        WebElement btnNumberZero=mergeAndFindMobileElement(numberZero);
        elementClick(btnNumberZero,"Number Zero Selected");
//        driver.findElement(numberZero).click();
    }

    public void selectItemBasedFreeDiscountOptionWhichHasBeforeTax(){
        WebElement btnItemBasedFreeDiscountOptionWhichHasBeforeTax=mergeAndFindMobileElement(itemBasedFreeDiscountOptionWhichHasBeforeTax);
        elementClick(btnItemBasedFreeDiscountOptionWhichHasBeforeTax,"Item Based Free Discount Option Which Has Before Tax Selected");
//        driver.findElement(itemBasedFreeDiscountOptionWhichHasBeforeTax).isDisplayed();
//        driver.findElement(itemBasedFreeDiscountOptionWhichHasBeforeTax).click();
    }
    public void selectCheckBasedPercentageDiscountOptionWhichHasAfterTax(){
        WebElement btnCheckBasedPercentageDiscountOptionWhichHasAfterTax=mergeAndFindMobileElement(checkBasedPercentageDiscountOptionWhichHasAfterTax);
        elementClick(btnCheckBasedPercentageDiscountOptionWhichHasAfterTax,"Check Based Percentage Discount Option Which Has After Tax Selected");
//        driver.findElement(checkBasedPercentageDiscountOptionWhichHasAfterTax).isDisplayed();
//        driver.findElement(checkBasedPercentageDiscountOptionWhichHasAfterTax).click();
    }
    public void selectCheckBasedAmountDiscountOptionWhichHasAfterTax(){
        WebElement btnCheckBasedAmountDiscountOptionWhichHasAfterTax=mergeAndFindMobileElement(checkBasedAmountDiscountOptionWhichHasAfterTax);
        elementClick(btnCheckBasedAmountDiscountOptionWhichHasAfterTax,"Check Based Amount Discount Option Which Has After Tax Selected");
//        driver.findElement(checkBasedAmountDiscountOptionWhichHasAfterTax).isDisplayed();
//        driver.findElement(checkBasedAmountDiscountOptionWhichHasAfterTax).click();
    }
    public void selectCheckBasedSetPriceDiscountOptionWhichHasAfterTax(){
        WebElement btnCheckBasedSetPriceOption=mergeAndFindMobileElement(checkBasedSetPriceOption);
        elementClick(btnCheckBasedSetPriceOption,"Check Based Set Price Option Selected");
//        driver.findElement(checkBasedSetPriceOption).isDisplayed();
//        driver.findElement(checkBasedSetPriceOption).click();
    }
    public void selectCheckBasedAsPercentageDiscountOptionWhichHasBeforeTax(){
        WebElement btnCheckBasedPercentageBeforeTax=mergeAndFindMobileElement(checkBasedPercentageBeforeTax);
        elementClick(btnCheckBasedPercentageBeforeTax,"Check Based Percentage Before Tax Selected");
//        driver.findElement(checkBasedPercentageBeforeTax).isDisplayed();
//        driver.findElement(checkBasedPercentageBeforeTax).click();
    }
    public void selectCheckBasedAmountDiscountOptionWhichHasBeforeTax(){
        WebElement btnCheckBasedAmountBeforeTax=mergeAndFindMobileElement(checkBasedAmountBeforeTax);
        elementClick(btnCheckBasedAmountBeforeTax,"Check Based Amount Before Tax Selected");
//        driver.findElement(checkBasedAmountBeforeTax).isDisplayed();
//        driver.findElement(checkBasedAmountBeforeTax).click();
    }
    public void selectCheckBasedSetPriceDiscountOptionWhichHasBeforeTax(){
        WebElement btnCheckBasedSetPriceBeforeTax=mergeAndFindMobileElement(checkBasedSetPriceBeforeTax);
        elementClick(btnCheckBasedSetPriceBeforeTax,"Check Based Set Price Before Tax Selected");
//        driver.findElement(checkBasedSetPriceBeforeTax).isDisplayed();
//        driver.findElement(checkBasedSetPriceBeforeTax).click();
    }
    public void selectCheckBasedFreeDiscountOptionWhichHasBeforeTax(){
        WebElement btnCheckBasedFreeBeforeTax=mergeAndFindMobileElement(checkBasedFreeBeforeTax);
        elementClick(btnCheckBasedFreeBeforeTax,"Check Based Free Before Tax Selected");
//        driver.findElement(checkBasedFreeBeforeTax).isDisplayed();
//        driver.findElement(checkBasedFreeBeforeTax).click();
    }
    public void selectCheckBasedAsFreeDiscountOptionWhichHasAfterTax(){
        WebElement btnCheckBasedFreeAfterTax=mergeAndFindMobileElement(checkBasedFreeAfterTax);
        elementClick(btnCheckBasedFreeAfterTax,"Check Based Free After Tax Selected");
//        driver.findElement(checkBasedFreeAfterTax).isDisplayed();
//        driver.findElement(checkBasedFreeAfterTax).click();
    }
//    public void enterOpenDiscountAmountAsDecimal(){
//        WebElement btnOpenDiscountAmountTexBox=mergeAndFindMobileElement(openDiscountAmountTexBox);
//        elementClick(btnOpenDiscountAmountTexBox,"Open Discount Amount Text Box Selected");
////        driver.findElement(openDiscountAmountTexBox).isDisplayed();
////        driver.findElement(openDiscountAmountTexBox).click();
//        WebElement btnNumberOne=mergeAndFindMobileElement(numberOne);
//        elementClick(btnNumberOne,"Number One Selected");
////        driver.findElement(numberOne).click();
//        WebElement btnNumberZero=mergeAndFindMobileElement(numberZero);
//        elementClick(btnNumberZero,"Number Zero Selected");
//        elementClick(btnNumberZero,"Number Zero Selected");
////        driver.findElement(numberZero).click();
////        driver.findElement(numberZero).click();
//        WebElement btnNumberFive=mergeAndFindMobileElement(numberFive);
//        elementClick(btnNumberFive,"Number Five Selected");
////        driver.findElement(numberFive).click();
//        WebElement btnContinueButton=mergeAndFindMobileElement(continueButton);
//        elementClick(btnContinueButton,"Continue Button Selected");
////        driver.findElement(continueButton).click();
//    }

    public void enterOpenDiscountAmountAsDecimal(){
        WebElement btnOpenDiscountAmountTexBox=mergeAndFindMobileElement(openDiscountAmountTexBox);
        elementClick(btnOpenDiscountAmountTexBox,"Open Discount Amount Text Box Selected");
//        driver.findElement(openDiscountAmountTexBox).isDisplayed();
//        driver.findElement(openDiscountAmountTexBox).click();
//        WebElement btnNumberOne=mergeAndFindMobileElement(numberOneOnOpenDiscount);
//        elementClick(btnNumberOne,"Number One Selected");

        WebElement btnNumberFive=mergeAndFindMobileElement(numberFive);
        elementClick(btnNumberFive,"Number Five Selected");
//        driver.findElement(numberOne).click();
        WebElement btnNumberZero=mergeAndFindMobileElement(numberZero);
        elementClick(btnNumberZero,"Number Zero Selected");
        elementClick(btnNumberZero,"Number Zero Selected");
//        driver.findElement(numberZero).click();
//        driver.findElement(numberZero).click();

//        driver.findElement(numberFive).click();
        WebElement btnContinueButton=mergeAndFindMobileElement(continueButton);
        elementClick(btnContinueButton,"Continue Button Selected");
//        driver.findElement(continueButton).click();
    }
    public void selectAfterTaxForOpenDiscountType(){
        WebElement btnOpenDiscountAfterTaxOption=mergeAndFindMobileElement(openDiscountAfterTaxOption);
        elementClick(btnOpenDiscountAfterTaxOption,"Open Discount After Tax Option Selected");
//        driver.findElement(openDiscountAfterTaxOption).isDisplayed();
//        driver.findElement(openDiscountAfterTaxOption).click();
    }
//    public void verifyOpenDiscountWithAfterTax(){
//        /*String actualName = driver.findElement(openCheckDiscountAmountAfterTaxOnOrderSide).getText();
//        String expectedName = "115,00";
//        Assert.assertEquals(actualName,expectedName);*/
//        WebElement element=mergeAndFindMobileElement(openCheckDiscountAmountAfterTaxOnPriceSide);
//        String actualName1 =elementGetText(element,"Get TL 15,00");
//        String expectedName1 = "TL 15,00";
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyOpenDiscountWithAfterTax(){
        /*String actualName = driver.findElement(openCheckDiscountAmountAfterTaxOnOrderSide).getText();
        String expectedName = "115,00";
        Assert.assertEquals(actualName,expectedName);*/
        WebElement element=mergeAndFindMobileElement(openCheckDiscountAmountATOnPriceSide);
        String actualName1 =elementGetText(element,"Get TL 5,00");
        String expectedName1 = "TL 5,00";
        Assert.assertEquals(actualName1,expectedName1);
    }
//    public void verifyOpenDiscountWithAfterTaxForMargarita(){
//        WebElement element=mergeAndFindMobileElement(openCheckDiscountAmountAfterTaxOnOrderSideForMargarita);
//        String actualName =elementGetText(element,"Get TL 1.199,95");
//        String expectedName = "TL 1.199,95";
//        Assert.assertEquals(actualName,expectedName);
//
//        /*String actualName1 = driver.findElement(openCheckDiscountAmountAfterTaxOnPriceSideForMargarita).getText();
//        String expectedName1 = "TL 1.109,95";
//        Assert.assertEquals(actualName1,expectedName1);*/
//    }
    public void verifyOpenDiscountWithAfterTaxForMargarita(){
        WebElement element=mergeAndFindMobileElement(openCheckDiscountAmountATOnOrderSideForMargarita);
        String actualName =elementGetText(element,"Get TL 5,00");
        String expectedName = "TL 5,00";
        Assert.assertEquals(actualName,expectedName);

        /*String actualName1 = driver.findElement(openCheckDiscountAmountAfterTaxOnPriceSideForMargarita).getText();
        String expectedName1 = "TL 1.109,95";
        Assert.assertEquals(actualName1,expectedName1);*/
    }
//    public void enterOpenDiscountPercentageValue(){
//        WebElement btnOpenDiscountPercentageTexBox=mergeAndFindMobileElement(openDiscountPercentageTexBox);
//        elementClick(btnOpenDiscountPercentageTexBox,"Open Discount Percentage Text Box Selected");
////        driver.findElement(openDiscountPercentageTexBox).isDisplayed();
////        driver.findElement(openDiscountPercentageTexBox).click();
//        WebElement btnNumberOne=mergeAndFindMobileElement(numberOne);
//        elementClick(btnNumberOne,"Number One Selected");
////        driver.findElement(numberOne).click();
//        WebElement btnNumberDoubleZero=mergeAndFindMobileElement(numberDoubleZero);
//        elementClick(btnNumberDoubleZero,"Number Double Zero Selected");
////        driver.findElement(numberDoubleZero).click();
//        WebElement btnNumberZero=mergeAndFindMobileElement(numberZero);
//        elementClick(btnNumberZero,"Number Zero Selected");
////        driver.findElement(numberZero).click();
//        WebElement btnContinueButton=mergeAndFindMobileElement(continueButton);
//        elementClick(btnContinueButton,"Continue Button Selected");
////        driver.findElement(continueButton).click();
//    }
    public void enterOpenDiscountPercentageValue(){
        WebElement btnOpenDiscountPercentageTexBox=mergeAndFindMobileElement(openDiscountPercentageTexBox);
        elementClick(btnOpenDiscountPercentageTexBox,"Open Discount Percentage Text Box Selected");
    //        driver.findElement(openDiscountPercentageTexBox).isDisplayed();
    //        driver.findElement(openDiscountPercentageTexBox).click();
        WebElement btnNumberOne=mergeAndFindMobileElement(numberTwo);
        elementClick(btnNumberOne,"Number One Selected");
    //        driver.findElement(numberOne).click();
        WebElement btnNumberDoubleZero=mergeAndFindMobileElement(numberDoubleZero);
        elementClick(btnNumberDoubleZero,"Number Double Zero Selected");
    //        driver.findElement(numberDoubleZero).click();
        WebElement btnNumberZero=mergeAndFindMobileElement(numberZero);
        elementClick(btnNumberZero,"Number Zero Selected");
    //        driver.findElement(numberZero).click();
        WebElement btnContinueButton=mergeAndFindMobileElement(continueButton);
        elementClick(btnContinueButton,"Continue Button Selected");
    //        driver.findElement(continueButton).click();
    }
    public void selectBeforeTaxForOpenDiscountType(){
        WebElement btnOpenDiscountBeforeTaxOption=mergeAndFindMobileElement(openDiscountBeforeTaxOption);
        elementClick(btnOpenDiscountBeforeTaxOption,"Open Discount Before Tax Option Selected");
//        driver.findElement(openDiscountBeforeTaxOption).isDisplayed();
//        driver.findElement(openDiscountBeforeTaxOption).click();
    }
//    public void enterOpenDiscountAmountAsWholeNumber(){
//        WebElement btnOpenDiscountAmountTextBox=mergeAndFindMobileElement(openDiscountAmountTextBox);
//        elementClick(btnOpenDiscountAmountTextBox,"Open Discount Amount Text Box Selected");
////        driver.findElement(openDiscountAmountTextBox).isDisplayed();
////        driver.findElement(openDiscountAmountTextBox).click();
//        WebElement btnNumberOne=mergeAndFindMobileElement(numberOne);
//        elementClick(btnNumberOne,"Number One Selected");
////        driver.findElement(numberOne).click();
//        WebElement btnNumberFive=mergeAndFindMobileElement(numberFive);
//        elementClick(btnNumberFive,"Number Five Selected");
////        driver.findElement(numberFive).click();
//        WebElement btnNumberDoubleZero=mergeAndFindMobileElement(numberDoubleZero);
//        elementClick(btnNumberDoubleZero,"Check Based Discount After Tax As Set Price Selected");
////        driver.findElement(numberDoubleZero).click();
//        WebElement btnContinueButton=mergeAndFindMobileElement(continueButton);
//        elementClick(btnContinueButton,"Continue Button Selected");
////        driver.findElement(continueButton).click();
//    }
    public void enterOpenDiscountAmountAsWholeNumber(){
        WebElement btnOpenDiscountAmountTextBox=mergeAndFindMobileElement(openDiscountAmountTextBox);
        elementClick(btnOpenDiscountAmountTextBox,"Open Discount Amount Text Box Selected");
    //        driver.findElement(openDiscountAmountTextBox).isDisplayed();
    //        driver.findElement(openDiscountAmountTextBox).click();
    //        WebElement btnNumberOne=mergeAndFindMobileElement(numberOne);
    //        elementClick(btnNumberOne,"Number One Selected");
    //        driver.findElement(numberOne).click();
        WebElement btnNumberFive=mergeAndFindMobileElement(numberFive);
        elementClick(btnNumberFive,"Number Five Selected");
    //        driver.findElement(numberFive).click();
        WebElement btnNumberDoubleZero=mergeAndFindMobileElement(numberDoubleZero);
        elementClick(btnNumberDoubleZero,"Check Based Discount After Tax As Set Price Selected");
    //        driver.findElement(numberDoubleZero).click();
        WebElement btnContinueButton=mergeAndFindMobileElement(continueButton);
        elementClick(btnContinueButton,"Continue Button Selected");
    //        driver.findElement(continueButton).click();
    }
    public void verifyOpenDiscountAsPercentageWithAfterTax(){
        WebElement txtOpenCheckDiscountPercentageOnOrderSide=mergeAndFindMobileElement(openCheckDiscountPercentageOnOrderSide);
        String actualName = elementGetText(txtOpenCheckDiscountPercentageOnOrderSide,"Get Open Check Discount Percentage On Order Side");
        String expectedName = "12,00";
        Assert.assertEquals(actualName,expectedName);
        WebElement txtOpenCheckDiscountPercentageOnPriceSide=mergeAndFindMobileElement(openCheckDiscountPercentageOnPriceSide);
        String actualName1 = elementGetText(txtOpenCheckDiscountPercentageOnPriceSide," Get Open Check Discount Percentage On Price Side");
        String expectedName1 = "TL 12,00";
        Assert.assertEquals(actualName1,expectedName1);

    }
//    public void verifyOpenDiscountAsPercentageWithAfterTaxForMargarita(){
//        /*String actualName = driver.findElement(openCheckDiscountPercentageOnOrderSideForMargarita).getText();
//        String expectedName = "100,00";
//        Assert.assertEquals(actualName,expectedName);*/
//        WebElement txtOpenCheckDiscountPercentageOnPriceSideForMargarita=mergeAndFindMobileElement(openCheckDiscountPercentageOnPriceSideForMargarita);
//        String actualName1 = elementGetText(txtOpenCheckDiscountPercentageOnPriceSideForMargarita,"Get Open Check Discount Percentage On Price Side For Margarita");
//        String expectedName1 = "TL 1.110,00";
//        Assert.assertEquals(actualName1,expectedName1);
//
//    }
    public void verifyOpenDiscountAsPercentageWithAfterTaxForMargarita(){
        /*String actualName = driver.findElement(openCheckDiscountPercentageOnOrderSideForMargarita).getText();
        String expectedName = "100,00";
        Assert.assertEquals(actualName,expectedName);*/
        WebElement txtOpenCheckDiscountPercentageOnPriceSideForMargarita=mergeAndFindMobileElement(openCheckDiscountPercentageOnPriceForMargarita);
        String actualName1 = elementGetText(txtOpenCheckDiscountPercentageOnPriceSideForMargarita,"Get Open Check Discount Percentage On Price Side For Margarita");
        String expectedName1 = "TL 202,00";
        Assert.assertEquals(actualName1,expectedName1);

    }
//    public void verifyOpenDiscountAsPercentageWithBeforeTax(){
//        WebElement txtOpenCheckDiscountPercentageOnOrderSide=mergeAndFindMobileElement(openCheckDiscountPercentageOnOrderSide);
//        String actualName = elementGetText(txtOpenCheckDiscountPercentageOnOrderSide,"Open Check Discount Percentage On Order Side");
//        String expectedName = "50,00";
//        Assert.assertEquals(actualName,expectedName);
//        WebElement txtOpenCheckDiscountPercentageOnPriceSide=mergeAndFindMobileElement(openCheckDiscountPercentageOnPriceSide);
//        String actualName1 = elementGetText(txtOpenCheckDiscountPercentageOnPriceSide,"Open Check Discount Percentage On Price Side");
//        String expectedName1 = "TL 549,51";
//        Assert.assertEquals(actualName1,expectedName1);
//    }
    public void verifyOpenDiscountAsPercentageWithBeforeTax(){
        WebElement txtOpenCheckDiscountPercentageOnOrderSide=mergeAndFindMobileElement(openCheckDiscountPercentageOnOrderSide1);
        String actualName = elementGetText(txtOpenCheckDiscountPercentageOnOrderSide,"Open Check Discount Percentage On Order Side");
        String expectedName = "24,00";
        Assert.assertEquals(actualName,expectedName);
    //        WebElement txtOpenCheckDiscountPercentageOnPriceSide=mergeAndFindMobileElement(openCheckDiscountPercentageOnPriceSide);
    //        String actualName1 = elementGetText(txtOpenCheckDiscountPercentageOnPriceSide,"Open Check Discount Percentage On Price Side");
    //        String expectedName1 = "TL 549,51";
    //        Assert.assertEquals(actualName1,expectedName1);
    }
    public void selectItemBasedDiscountAfterTaxAsAmount(){
        WebElement btnItemBasedDiscountAfterTaxAsAmount=mergeAndFindMobileElement(itemBasedDiscountAfterTaxAsAmount);
        elementClick(btnItemBasedDiscountAfterTaxAsAmount,"Item Based Discount After Tax As Amount Selected");
//        driver.findElement(itemBasedDiscountAfterTaxAsAmount).isDisplayed();
//        driver.findElement(itemBasedDiscountAfterTaxAsAmount).click();
    }
    public void selectItemBasedDiscountBeforeTaxAsAmount(){
        WebElement btnItemBasedDiscountBeforeTaxAsAmount=mergeAndFindMobileElement(itemBasedDiscountBeforeTaxAsAmount);
        elementClick(btnItemBasedDiscountBeforeTaxAsAmount,"Item Based Discount Before Tax As Amount Selected");
//        driver.findElement(itemBasedDiscountBeforeTaxAsAmount).isDisplayed();
//        driver.findElement(itemBasedDiscountBeforeTaxAsAmount).click();
    }
    public void selectItemBasedDiscountAfterTaxAsSetPrice(){
        WebElement btnItemBasedDiscountAfterTaxAsSetPrice=mergeAndFindMobileElement(itemBasedDiscountAfterTaxAsSetPrice);
        elementClick(btnItemBasedDiscountAfterTaxAsSetPrice,"Item Based Discount After Tax As Set Price Selected");
//        driver.findElement(itemBasedDiscountAfterTaxAsSetPrice).isDisplayed();
//        driver.findElement(itemBasedDiscountAfterTaxAsSetPrice).click();
    }
    public void selectItemBasedDiscountBeforeTaxAsSetPrice(){
        WebElement btnItemBasedDiscountBeforeTaxAsSetPrice=mergeAndFindMobileElement(itemBasedDiscountBeforeTaxAsSetPrice);
        elementClick(btnItemBasedDiscountBeforeTaxAsSetPrice,"Item Based Discount Before Tax As Set Price Selected");
//        driver.findElement(itemBasedDiscountBeforeTaxAsSetPrice).isDisplayed();
//        driver.findElement(itemBasedDiscountBeforeTaxAsSetPrice).click();
    }
    public void selectItemBasedDiscountAfterTaxAsFreeItem(){
        WebElement btnItemBasedDiscountAfterTaxAsFreeItem=mergeAndFindMobileElement(itemBasedDiscountAfterTaxAsFreeItem);
        elementClick(btnItemBasedDiscountAfterTaxAsFreeItem,"Item Based Discount After Tax As Free Item Selected");
//        driver.findElement(itemBasedDiscountAfterTaxAsFreeItem).isDisplayed();
//        driver.findElement(itemBasedDiscountAfterTaxAsFreeItem).click();
    }
    public void selectItemBasedDiscountBeforeTaxAsFreeItem(){
        WebElement btnItemBasedDiscountBeforeTaxAsFreeItem=mergeAndFindMobileElement(itemBasedDiscountBeforeTaxAsFreeItem);
        elementClick(btnItemBasedDiscountBeforeTaxAsFreeItem,"Item Based Discount Before Tax As Free Item Selected");
//        driver.findElement(itemBasedDiscountBeforeTaxAsFreeItem).isDisplayed();
//        driver.findElement(itemBasedDiscountBeforeTaxAsFreeItem).click();
    }
    public void selectItemBasedDiscountBeforeTaxAsPercentage(){
        WebElement btnItemBasedDiscountBeforeTaxAsPercentage=mergeAndFindMobileElement(itemBasedDiscountBeforeTaxAsPercentage);
        elementClick(btnItemBasedDiscountBeforeTaxAsPercentage,"Item Based Discount Before Tax As Percentage Selected");
//        driver.findElement(itemBasedDiscountBeforeTaxAsPercentage).isDisplayed();
//        driver.findElement(itemBasedDiscountBeforeTaxAsPercentage).click();
    }
    public void selectItemBasedDiscountAfterTaxAsPercentage(){
        WebElement btnItemBasedDiscountAfterTaxAsPercentage=mergeAndFindMobileElement(itemBasedDiscountAfterTaxAsPercentage);
        elementClick(btnItemBasedDiscountAfterTaxAsPercentage,"Item Based Discount After Tax As Percentage Selected");
//        driver.findElement(itemBasedDiscountAfterTaxAsPercentage).isDisplayed();
//        driver.findElement(itemBasedDiscountAfterTaxAsPercentage).click();
    }
    public void selectCheckBasedDiscountAfterTaxAsPercentage(){
        WebElement btnCheckBasedDiscountAfterTaxAsPercentage=mergeAndFindMobileElement(checkBasedDiscountAfterTaxAsPercentage);
        elementClick(btnCheckBasedDiscountAfterTaxAsPercentage,"Check Based Discount After Tax As Percentage Selected");
//        driver.findElement(checkBasedDiscountAfterTaxAsPercentage).isDisplayed();
//        driver.findElement(checkBasedDiscountAfterTaxAsPercentage).click();
    }
    public void selectCheckBasedDiscountBeforeTaxAsPercentage(){
        WebElement btnCheckBasedDiscountBeforeTaxAsPercentage=mergeAndFindMobileElement(checkBasedDiscountBeforeTaxAsPercentage);
        elementClick(btnCheckBasedDiscountBeforeTaxAsPercentage,"Check Based Discount Before Tax As Percentage Selected");
//        driver.findElement(checkBasedDiscountBeforeTaxAsPercentage).isDisplayed();
//        driver.findElement(checkBasedDiscountBeforeTaxAsPercentage).click();
    }
    public void selectCheckBasedDiscountBeforeTaxAsAmount(){
        WebElement btnCheckBasedDiscountBeforeTaxAsAmount=mergeAndFindMobileElement(checkBasedDiscountBeforeTaxAsAmount);
        elementClick(btnCheckBasedDiscountBeforeTaxAsAmount,"Check Based Discount Before Tax As Amount Selected");
//        driver.findElement(checkBasedDiscountBeforeTaxAsAmount).isDisplayed();
//        driver.findElement(checkBasedDiscountBeforeTaxAsAmount).click();
    }
    public void selectCheckBasedDiscountAfterTaxAsSetPrice(){
        WebElement btnCheckBasedDiscountAfterTaxAsSetPrice=mergeAndFindMobileElement(checkBasedDiscountAfterTaxAsSetPrice);
        elementClick(btnCheckBasedDiscountAfterTaxAsSetPrice,"Check Based Discount After Tax As Set Price Selected");
//        driver.findElement(checkBasedDiscountAfterTaxAsSetPrice).isDisplayed();
//        driver.findElement(checkBasedDiscountAfterTaxAsSetPrice).click();
    }
    public void selectCheckBasedDiscountBeforeTaxAsSetPrice(){
        WebElement btnCheckBasedDiscountBeforeTaxAsSetPrice=mergeAndFindMobileElement(checkBasedDiscountBeforeTaxAsSetPrice);
        elementClick(btnCheckBasedDiscountBeforeTaxAsSetPrice,"Check Based Discount Before Tax As Set Price Selected");
//        driver.findElement(checkBasedDiscountBeforeTaxAsSetPrice).isDisplayed();
//        driver.findElement(checkBasedDiscountBeforeTaxAsSetPrice).click();
    }
    public void selectCheckBasedDiscountAfterTaxAsAmount(){
        WebElement btnCheckBasedDiscountAfterTaxAsAmount=mergeAndFindMobileElement(checkBasedDiscountAfterTaxAsAmount);
        elementClick(btnCheckBasedDiscountAfterTaxAsAmount,"Check Based Discount After Tax As Amount Selected");
//        driver.findElement(checkBasedDiscountAfterTaxAsAmount).isDisplayed();
//        driver.findElement(checkBasedDiscountAfterTaxAsAmount).click();
    }
    public void selectCheckBasedDiscountAfterTaxAsFreeItem(){
        WebElement btnCheckBasedDiscountBeforeTaxAsFreeItem=mergeAndFindMobileElement(checkBasedDiscountAfterTaxAsFreeItem);
        elementClick(btnCheckBasedDiscountBeforeTaxAsFreeItem,"Check Based Discount After Tax As Free Item Selected");
//        driver.findElement(checkBasedDiscountAfterTaxAsFreeItem).isDisplayed();
//        driver.findElement(checkBasedDiscountAfterTaxAsFreeItem).click();
    }
    public void selectCheckBasedDiscountBeforeTaxAsFreeItem(){
        WebElement btnCheckBasedDiscountBeforeTaxAsFreeItem=mergeAndFindMobileElement(checkBasedDiscountBeforeTaxAsFreeItem);
        elementClick(btnCheckBasedDiscountBeforeTaxAsFreeItem,"Check Based Discount Before Tax As Free Item Selected");
//        driver.findElement(checkBasedDiscountBeforeTaxAsFreeItem).isDisplayed();
//        driver.findElement(checkBasedDiscountBeforeTaxAsFreeItem).click();
    }
    public void selectItemBasedDiscountBeforeTaxWithPercentage(){
        WebElement btnItemBasedDiscountBeforeTaxWithPercentage=mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithPercentage);
        elementClick(btnItemBasedDiscountBeforeTaxWithPercentage,"Item Based Discount Before Tax With Percentage Selected");
//        driver.findElement(itemBasedDiscountBeforeTaxWithPercentage).isDisplayed();
//        driver.findElement(itemBasedDiscountBeforeTaxWithPercentage).click();
    }
    public void selectItemBasedDiscountBeforeTaxWithAmount(){
        WebElement btnItemBasedDiscountBeforeTaxWithAmount=mergeAndFindMobileElement(itemBasedDiscountBeforeTaxWithAmount);
        elementClick(btnItemBasedDiscountBeforeTaxWithAmount,"Item Based Discount Before Tax With Amount Selected");
//        driver.findElement(itemBasedDiscountBeforeTaxWithAmount).isDisplayed();
//        driver.findElement(itemBasedDiscountBeforeTaxWithAmount).click();
    }
    public void selectItemBasedDiscountAfterTaxWithAmount(){
        WebElement btnItemBasedDiscountAfterTaxWithAmount=mergeAndFindMobileElement(itemBasedDiscountAfterTaxWithAmount);
        elementClick(btnItemBasedDiscountAfterTaxWithAmount,"Item Based Discount After Tax With Amount Selected");
//        driver.findElement(itemBasedDiscountAfterTaxWithAmount).isDisplayed();
//        driver.findElement(itemBasedDiscountAfterTaxWithAmount).click();
    }

}
