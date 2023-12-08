package com.qa.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TGHoldScreenPage extends BasePage {


    public void clickHoldManualOption() {
        WebElement element = mergeAndFindMobileElement(holdManualOption);
        elementClick(element, "click holdManualOption ");

        WebElement element1 = mergeAndFindMobileElement(holdManuelDoneButton);
        elementClick(element1, "click holdManuelDoneButton ");

    }
}
