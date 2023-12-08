package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.qa.pages.DriverSteup.driver;

public class PaymentReasonsWindow extends TillManagementScreen{
    @FindBy(name = "Reasons" )
    private WebElement reasonsWindowTitle;

    @FindBy(name = "Paid In" )
    private WebElement paidInReasonBtn;

    @FindBy(name = "Paid Out" )
    private WebElement paidOutReasonBtn;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Ok\"]" )
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
