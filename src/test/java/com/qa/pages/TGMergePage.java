package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TGMergePage extends BasePage{

    public void selectTableForMerge(){
        WebElement element = mergeAndFindMobileElement(firstTable);
        elementClick(element, "click firstTable ");
    }
    public void clickMergeButton(){
        try {
            WebElement element = mergeAndFindMobileElement(btnMerge);
            elementClick(element, "click Merge ");
        }
        catch(Exception e){
            utils.log().info("merge button not clicked");
        }
    }
}


