package com.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

public class TGOpenTillWindow extends TillManagementScreen{
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Open Till\"]" )
//    private WebElement openTillWindowTitle;

    String openTillWindowTitle = "Open Till";

    String number0 = "0";


//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"0\"]" )
//    private WebElement number0;

    String number1 = "1";

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"1\"]" )
//    private WebElement number1;

    String number2 = "2";

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"2\"]" )
//    private WebElement number2;

    String number3 = "3";

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"3\"]" )
//    private WebElement number3;

    String number4 = "4";

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"4\"]" )
//    private WebElement number4;

    String number5 = "5";

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"5\"]" )
//    private WebElement number5;

    String number6 = "6";

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"6\"]" )
//    private WebElement number6;

    String number7 = "7";

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"7\"]" )
//    private WebElement number7;

    String number8 = "8";

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"8\"]" )
//    private WebElement number8;

    String number9 = "9";

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"9\"]" )
//    private WebElement number9;

    String number00 = "00";

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"00\"]" )
//    private WebElement number00;

    String numberC = "C";

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"C\"]" )
//    private WebElement numberC;

    String continueBtn = "Continue";

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]" )
//    private WebElement continueBtn;

    public String getOpenTillWindowTitle() {
        WebElement element = mergeAndFindMobileElement(openTillWindowTitle);
//        elementClick(element,"Select Brushetta MenuItem");
        String value = elementGetText(element, "open till window's title is - ");
        return value;
    }

    public void press0() {
        WebElement element = mergeAndFindMobileElement(number0);
        elementClick(element,"Tapped number0");
//        elementClick(number0, "Tapped number0");
    }

    public void press1() {
        WebElement element = mergeAndFindMobileElement(number1);
        elementClick(element,"Tapped number1");
//        elementClick(number1, "Tapped number1");
    }

    public void press2() {
        WebElement element = mergeAndFindMobileElement(number2);
        elementClick(element,"Tapped number2");
//        elementClick(number2, "Tapped number2");
    }

    public void press3() {
        WebElement element = mergeAndFindMobileElement(number3);
        elementClick(element,"Tapped number3");
//        elementClick(number3, "Tapped number3");
    }

    public void press4() {
        WebElement element = mergeAndFindMobileElement(number4);
        elementClick(element,"Tapped number4");
//        elementClick(number4, "Tapped number4");
    }

    public void press5() {
        WebElement element = mergeAndFindMobileElement(number5);
        elementClick(element,"Tapped number5");
//        elementClick(number5, "Tapped number5");
    }

    public void press6() {
        WebElement element = mergeAndFindMobileElement(number6);
        elementClick(element,"Tapped number6");
//        elementClick(number6, "Tapped number6");
    }

    public void press7() {
        WebElement element = mergeAndFindMobileElement(number7);
        elementClick(element,"Tapped number7");
//        elementClick(number7, "Tapped number7");
    }

    public void press8() {
        WebElement element = mergeAndFindMobileElement(number8);
        elementClick(element,"Tapped number8");
//        elementClick(number8, "Tapped number8");
    }

    public void press9() {
        WebElement element = mergeAndFindMobileElement(number9);
        elementClick(element,"Tapped number9");
//        elementClick(number9, "Tapped number9");
    }

    public void press00() {
        WebElement element = mergeAndFindMobileElement(number00);
        elementClick(element,"Tapped number00");
//        elementClick(number00, "Tapped number00");
    }

    public void pressC() {
        WebElement element = mergeAndFindMobileElement(numberC);
        elementClick(element,"Tapped numberc");
//        elementClick(numberC, "Tapped numberC");
    }

    public TGTillManagementScreen pressContinueBtn() {
        WebElement element = mergeAndFindMobileElement(continueBtn);
        elementClick(element,"Tapped Continue button");
//        elementClick(continueBtn, "Tapped Continue button");
        return  new TGTillManagementScreen();
    }



}
