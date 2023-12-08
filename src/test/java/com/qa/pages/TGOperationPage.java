package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TGOperationPage extends BasePage {


    public void clickTillManagementTab(){
        WebElement element=mergeAndFindMobileElement(tillManagementTab);
        elementClick(element,"Click Till Management");
    }
    public void clickOperationButtonOnOperationPage(){
        WebElement element=mergeAndFindMobileElement(operationMenuIcon);
        elementClick(element,"Click Operation Menu Icon");
    }

    public void clickPosOption(){
        WebElement element=mergeAndFindMobileElement(posOption);
        elementClick(element,"Click Pos Option");

    }
    public void verifyDirectedOperationPage(){
        WebElement element=mergeAndFindMobileElement(operationTitle);
        String actualName= elementGetText(element,"Get Operation");
        String expectedName = "Operation";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickBatchAndAdjustmentTab(){
        WebElement element=mergeAndFindMobileElement(batchTipAdjustmentTab);
        elementClick(element,"batch Tip Adjustment Tab Clicked");
    }
    public void selectPOSSettingsTab(){
        WebElement element=mergeAndFindMobileElement(posSettings);
        elementClick(element,"Pos Settings Clicked");
    }
    public void clickOperationMenuIcon(){
        WebElement element=mergeAndFindMobileElement(operationMenuIcon);
        elementClick(element,"operation Menu Icon Clicked");
    }
    public void clickPOSOption(){
        WebElement element=mergeAndFindMobileElement(posSettings);
        elementClick(element,"Pos Settings Clicked");
    }

    public void verifyTotalPrice() {
        WebElement element=mergeAndFindMobileElement(taxAmountForSandwiches);
        String text=elementGetText(element,"total Price of Sandwiches");
        String Value="TL 1.100,00";
        Assert.assertEquals(text,Value);
    }

}
