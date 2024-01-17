package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentReasonsWindow extends TillManagementScreen{
    @FindBy(xpath = "//ion-title[.='Reasons']" )
    private WebElement reasonsWindowTitle;

    @FindBy(xpath = "//button[.='Paid In']" )
    private WebElement paidInReasonBtn;

    @FindBy(xpath = "//button[.='Paid Out']" )
    private WebElement paidOutReasonBtn;

    @FindBy(xpath = "//span[contains(.,'Add')]" )
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
