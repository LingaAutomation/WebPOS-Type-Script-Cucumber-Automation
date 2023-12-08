package com.qa.pages;

import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PaymentReasonsWindow extends TillManagementScreen{
    @iOSXCUITFindBy(accessibility = "Reasons" )
    private WebElement reasonsWindowTitle;

    @iOSXCUITFindBy(accessibility = "Paid In" )
    private WebElement paidInReasonBtn;

    @iOSXCUITFindBy(accessibility = "Paid Out" )
    private WebElement paidOutReasonBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Ok\"]" )
    private WebElement okBtn;

    public String getReasonsWindowTitle() {
        return elementGetText(reasonsWindowTitle, "Reasons window's name is - ");
    }

    public void selectPaymentReason(){
        elementClick(paidInReasonBtn, "Paid In selected as pay in reason." );
    }

    public void selectPayOutReason(){
        elementClick(paidOutReasonBtn, "Paid Out selected as pay in reason." );
    }

    public void clickOkBtn(){
        elementClick(okBtn, "Paid In selected as pay in reason." );
    }
}
