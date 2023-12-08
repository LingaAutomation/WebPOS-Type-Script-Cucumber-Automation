package com.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TGTaxExempt extends BasePage {

    public void selectFirstTaxExemptType(){
        WebElement element=mergeAndFindMobileElement(firstTaxExemptType);
        elementClick(element,"click firstTaxExemptType ");
    }

    public void verifyApplyTaxExemptPaidAmountWarningPopup(){
        WebElement element=mergeAndFindMobileElement(taxExemptPaidAmountWarningText);
        String actualName = elementGetText(element,"verify taxExemptPaidAmountWarningText");
        String expectedName = "Paid amount exceeds the sale amount";

        Assert.assertEquals(expectedName,actualName);

//        WebElement element1=mergeAndFindMobileElement(doneButton);
//        elementClick(element1,"click doneButton");

    }












}
