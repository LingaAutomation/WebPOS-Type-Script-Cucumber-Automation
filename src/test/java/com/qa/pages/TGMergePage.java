package com.qa.pages;

import io.appium.java_client.AppiumDriver;
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
            elementClick(element, "click firstTable ");
        }
        catch(Exception e){
            utils.log().info("merge button not clicked");
        }
    }
}


