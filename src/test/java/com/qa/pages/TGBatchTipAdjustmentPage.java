package com.qa.pages;

import com.fasterxml.jackson.databind.ser.Serializers;

import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.lang.invoke.SwitchPoint;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TGBatchTipAdjustmentPage extends BasePage {
    //private By clearTip ="");


    public void selectDeviceTypeForBatchAndAdjustment(){
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.findElement(merchantDeviceTypeSelectionArrow).isDisplayed();
        WebElement btnMerchant=mergeAndFindMobileElement(merchantDeviceTypeSelectionArrow);
        elementClick(btnMerchant,"select Device Type For Batch And Adjustment");
        // driver.findElement(merchantDeviceTypeSelectionArrow).click();
        WebElement btnCCSideDevice=mergeAndFindMobileElement(ccSideDeviceType);
        elementClick(btnCCSideDevice,"CC Side Button clicked");
//        driver.findElement(ccSideDeviceType).isDisplayed();
//        driver.findElement(ccSideDeviceType).click();
    }
    public void enterTipForPaidCheckWithCCSide(){
        WebElement btnClearNumberPad=mergeAndFindMobileElement(clearNumberPad);
//        driver.findElement(clearNumberPad).click();
        elementClick(btnClearNumberPad,"Clear Number Pad Clicked");
        WebElement btnNumberOne=mergeAndFindMobileElement(numberOne1);
//        driver.findElement(numberOne).click();
        elementClick(btnNumberOne,"number One Clicked");
        WebElement btnNumberDoubleZero=mergeAndFindMobileElement(numberDoubleZero);
//        driver.findElement(numberDoubleZero).click();
        elementClick(btnNumberDoubleZero,"Number Double Zero Clicked");
        WebElement btnNumberZero=mergeAndFindMobileElement(numberZero);
        elementClick(btnNumberZero,"Number Zero Clicked");
        elementClick(btnNumberZero,"Number Zero Clicked");
        elementClick(btnNumberZero,"Number Zero Clicked");
//        driver.findElement(numberZero).click();
//        driver.findElement(numberZero).click();
//        driver.findElement(numberZero).click();
        WebElement btnContinueButton=mergeAndFindMobileElement(continueButton);
//        driver.findElement(continueButton).click();
        elementClick(btnContinueButton,"Continue Button Clicked");
    }
    public void swipeUntilLastClosedCheckWhichIsPaidWithCCSide(String direction) throws Exception {
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
                    scrollToElement(By.id(ccSidePaymentOptionTable),direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(By.id(ccSidePaymentOptionTable),direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
    }
    public void selectLastCheckWithPaidCCSide(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Side CC - Others\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements"//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements"(//XCUIElementTypeStaticText[@name=\"Side CC - Others\"])[last()]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }

    public void verifyTipForPaidCheckWithCCSide(){
        WebElement actualValue=mergeAndFindMobileElement("//XCUIElementTypeStaticText[@name=\"100,00\"]");
        String actualName = elementGetText(actualValue,"Get Actual Amount");
//        String actualName = driver.findElement"//XCUIElementTypeStaticText[@name=\"100,00\"]")).getText();
        String expectedName = "100,00";

        Assert.assertEquals(actualName,expectedName);
    }
//nov 29
    public void verifyTipForPaidCheckWithCCSide1(){
        WebElement actualValue=mergeAndFindMobileElement("//XCUIElementTypeStaticText[@name=\"1.000,00\"]");
        String actualName = elementGetText(actualValue,"Get Actual Amount");
//        String actualName = driver.findElement"//XCUIElementTypeStaticText[@name=\"100,00\"]")).getText();
        String expectedName = "1.000,00";

        Assert.assertEquals(actualName,expectedName);
    }
    public void swipeUntilLastCCSidePaymentMethodOnBatchAndAdjustmentPage(String direction) throws Exception {

        direction = direction.toLowerCase();
        int i = 0;
        boolean found = false;

        while (i < 3) {
            try {
                if (isElementExists()) {
                    found = true;
                    break;
                } else {
                    scrollToElement(By.id(lastCcSidePaymentOption),direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(By.id(lastCcSidePaymentOption),direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
    }

    public void enterNewTipAmountOnBatchAndAdjustmentPage(){
//        WebElement btnOrderWithCCSideDevice=mergeAndFindMobileElement(OrderWithCCSideDevice);
//        elementClick(btnOrderWithCCSideDevice,"Order With CCSide Device Clicked");
//        driver.findElement(OrderWithCCSideDevice).click();
//        driver.findElement(clearNumberPad).isDisplayed();
        WebElement btnClearNumberPad=mergeAndFindMobileElement(clearNumberPad);
        elementClick(btnClearNumberPad,"Clear Number Pad Clicked");
//        driver.findElement(clearNumberPad).click();
        WebElement btnNumberOne=mergeAndFindMobileElement(numberOne1);
        elementClick(btnNumberOne,"Number One Clicked");
//        driver.findElement(numberOne).click();
        WebElement btnNumberDoubleZero=mergeAndFindMobileElement(numberDoubleZero);
        elementClick(btnNumberDoubleZero,"Number Double Zero Clicked");
        elementClick(btnNumberDoubleZero,"Number Double Zero Clicked");
//        driver.findElement(numberDoubleZero).click();
//        driver.findElement(numberDoubleZero).click();
        WebElement btnNumberZero=mergeAndFindMobileElement(numberZero);
        elementClick(btnNumberZero,"Number Zero Clicked");
        elementClick(btnNumberZero,"Number Zero Clicked");
//        driver.findElement(numberZero).click();
        WebElement btnContinueButton=mergeAndFindMobileElement(continueButton);
        elementClick(btnContinueButton,"Continue Button Clicked");
//        driver.findElement(continueButton).click();
    }
    public void verifyNewTipAmountOnBatchAndAdjustmentPage(String direction) throws Exception {
        direction = direction.toLowerCase();
        int i = 0;
        boolean found = false;

        while (i < 3) {
            try {
                if (isElementExists()) {
                    found = true;
                    break;
                } else {
                    scrollToElement(By.id(lastCcSidePaymentOption),direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(By.id(lastCcSidePaymentOption),direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
        WebElement actualValue=mergeAndFindMobileElement(lastModifiedTip);
        String actualName = elementGetText(actualValue,"get 10,00 Value");
        // driver.findElement(lastModifiedTip).getText();
        String expectedName = "10,00";

        Assert.assertEquals(actualName,expectedName);
    }
    public void directedMenuItemPage(){
//        driver.findElement(operationMenuIcon).isDisplayed();
        WebElement btnOperationMenuIcon=mergeAndFindMobileElement(operationMenuIcon);
        elementClick(btnOperationMenuIcon,"Operation Menu Icon Clicked");
//        driver.findElement(operationMenuIcon).click();
        WebElement btnPosOption=mergeAndFindMobileElement(posOption);
        elementClick(btnPosOption,"Pos Option Button Clicked");
//        driver.findElement(posOption).click();
    }

}



