package com.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

public class TGPaymentReasons extends TillManagementScreen{

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Reasons\"]" )
//    private WebElement reasonsWindowTitle;
    public By reasonsWindowTitle = By.id("Reasons");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Paid In\"]" )
//    private WebElement paidInReasonBtn;
    public By paidInReasonBtn = By.id("Paid In");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Paid Out\"]" )
//    private WebElement paidOutReasonBtn;
    public By paidOutReasonBtn = By.id("Paid Out");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Ok\"]" )
//    private WebElement okBtn;
    public By okBtn = By.id("Ok");



    public String getReasonsWindowTitle() {

        WebElement element=mergeAndFindMobileElement((WebElement) reasonsWindowTitle);
        String message = elementGetText(element, "Get payment Made On Message.");
        return message;
//        return elementGetText(reasonsWindowTitle, "Reasons window's name is - ");
    }

    public void selectPaymentReason(){
        WebElement element=mergeAndFindMobileElement((WebElement) paidInReasonBtn);
        elementClick(element, "Paid In selected as pay in reason.");

//        elementClick(paidInReasonBtn, "Paid In selected as pay in reason." );
    }

    public void selectPayOutReason(){
        WebElement element=mergeAndFindMobileElement((WebElement) paidOutReasonBtn);
        elementClick(element, "Paid Out selected as pay in reason.");
//        elementClick(paidOutReasonBtn, "Paid Out selected as pay in reason." );
    }

    public void clickOkBtn(){
        WebElement element=mergeAndFindMobileElement((WebElement) okBtn);
        elementClick(element, "Paid In selected as pay in reason.");
//        elementClick(okBtn, "Paid In selected as pay in reason." );
    }
}
