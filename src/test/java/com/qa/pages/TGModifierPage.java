package com.qa.pages;


import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofMillis;

public class TGModifierPage extends BasePage {




    public void selectFirstItemForFirstModifier(){
        WebElement element = mergeAndFindMobileElement(firstItemsFirstModifier);
        elementClick(element, "click firstItemsFirstModifier ");
    }

    public void verifySelectedModifier(){
        WebElement element = mergeAndFindMobileElement(firstModifier);
        String actualName = elementGetText(element,"Verify Added Modifier");
        String expectedName = "Add Veggies";
        Assert.assertEquals(actualName,expectedName);
//        WebElement element = mergeAndFindMobileElement(firstItemsFirstModifier);
//        String actualName = elementGetText(element,"verify firstItemsFirstModifier");
//
//        WebElement element1 = mergeAndFindMobileElement(selectedModifier);
//        String expectedName = elementGetText(element1,"verify selectedModifier");
//
//        Assert.assertEquals(actualName,expectedName);
    }

    public void clickModifierOkButton(){
        WebElement element = mergeAndFindMobileElement(modifierOkButton);
        elementClick(element, "click modifierOkButton ");
    }

    public void clickModifierCancelButton(){
        WebElement element = mergeAndFindMobileElement(modifierCancelButton);
        elementClick(element, "click modifierCancelButton ");
    }

    public void swipeTheModifiersAndDelete() throws InterruptedException {
        swipe(860,548,200,45,5000);

    }
    public void swipeTheModifier() throws InterruptedException {
        swipe(860,548,200,45,5000);

    }


}








