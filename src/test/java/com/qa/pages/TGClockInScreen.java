package com.qa.pages;

import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TGClockInScreen extends UserLoginScreen{

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"0\"]")
//    private WebElement pin0;

    public By pin0 = By.id("0");

    public By pin1 = By.id("1");

//    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"1\"]")
//    private WebElement pin1;

    public By pin2 = By.id("2");

//    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"2\"]")
//    private WebElement pin2;

    public By pin3 = By.id("3");

//    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"3\"]")
//    private WebElement pin3;

    public By pin4 = By.id("4");
//    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"4\"]")
//    private WebElement pin4;

    public By pin5 = By.id("5");
//    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"5\"]")
//    private WebElement pin5;

    public By pin6 = By.id("6");
//    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"6\"]")
//    private WebElement pin6;

    public By pin7 = By.id("7");
//    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"7\"]")
//    private WebElement pin7;

    public By pin8 = By.id("8");
//    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"8\"]")
//    private WebElement pin8;

    public By pin9 = By.id("9");

//    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"9\"]")
//    private WebElement pin9;

    public By clearBtn = By.id("Clear");

//    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"Clear\"]")
//    private WebElement clearBtn;

    public By loginBtn = By.id("Login");

//    @iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"Login\"]")
//    private WebElement loginBtn;

    public By titleTxt = By.id("To Login enter your ID number or swipe the card");

//    @iOSXCUITFindBy (id = "To Login enter your ID number or swipe the card")
//    private WebElement titleTxt;

    public By doneBtn = By.id("Done");

//    @iOSXCUITFindBy (xpath  = "//XCUIElementTypeButton[@name='Done']")
//    private WebElement doneBtn;

    public By errTxt = By.id("Invalid Pin");

//    @iOSXCUITFindBy (xpath  = "//XCUIElementTypeStaticText[@name=\"Invalid Pin\"]")
//    private WebElement errTxt;

    public By pinEntryInfo = By.id("To Login enter your ID number or swipe the card");

    public By clockInButton = By.id("Clock In");

    public By continueButton = By.id("Continue");

    public By clockInSuccessMessage = By.id("Clocked IN successfully");



//    private By pinEntryInfo = By.xpath("//XCUIElementTypeStaticText[@name=\"To Login enter your ID number or swipe the card\"]");
//    private By clockInButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Clock In\"]");
//    private By continueButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]");
//    private By clockInSuccessMessage = By.xpath("//XCUIElementTypeStaticText[@name=\"Clocked IN successfully\"]");

    public String getTitle() {
        WebElement element = mergeAndFindMobileElement(titleTxt);
        waitForVisibility(element);
//        WebElement element = mergeAndFindMobileElement(titleTxt);
        return elementGetText(element, "user login window's title is - ");
    }

    public void pressPin0() {
        WebElement element = mergeAndFindMobileElement(pin0);
        elementClick(element,"Select Brushetta MenuItem");
//        elementClick(pin0, "Tapped pin0");
    }

    public void pressPin1() {
        WebElement element = mergeAndFindMobileElement(pin1);
        elementClick(element,"Tapped pin1");
//        elementClick(pin1, "Tapped pin1");
    }

    public void pressPin2() {
        WebElement element = mergeAndFindMobileElement(pin2);
        elementClick(element,"Tapped pin2");
//        elementClick(pin2, "Tapped pin2");
    }


    public void pressPin3() {
        WebElement element = mergeAndFindMobileElement(pin3);
        elementClick(element,"Tapped pin3");
//        elementClick(pin3, "Tapped pin3");
    }

    public void pressPin4() {
        WebElement element = mergeAndFindMobileElement(pin4);
        elementClick(element,"Tapped pin4");
//        elementClick(pin4, "Tapped pin4");
    }

    public void pressPin5() {
        WebElement element = mergeAndFindMobileElement(pin5);
        elementClick(element,"Tapped pin5");
//        elementClick(pin5, "Tapped pin5");
    }

    public void pressPin6() {
        WebElement element = mergeAndFindMobileElement(pin6);
        elementClick(element,"Tapped pin6");
//        elementClick(pin6, "Tapped pin6");
    }

    public void pressPin7() {
        WebElement element = mergeAndFindMobileElement(pin7);
        elementClick(element,"Tapped pin7");
//        elementClick(pin7, "Tapped pin7");
    }

    public void pressPin8() {
        WebElement element = mergeAndFindMobileElement(pin8);
        elementClick(element,"Tapped pin8");
//        elementClick(pin8, "Tapped pin8");
    }

    public void pressPin9() {
        WebElement element = mergeAndFindMobileElement(pin9);
        elementClick(element,"Tapped pin9");
//        elementClick(pin9, "Tapped pin9");
    }

    public void pressClear() {
        WebElement element = mergeAndFindMobileElement(clearBtn);
        elementClick(element,"Pin text field is cleared.");
//        elementClick(clearBtn, "Pin text field is cleared.");
    }

    public void pressLogin(){
        WebElement element = mergeAndFindMobileElement(loginBtn);
        elementClick(element,"Tapped Login.");
//        elementClick(loginBtn, "Tapped Login.");
    }

    public void pressDone(){
        WebElement element = mergeAndFindMobileElement(doneBtn);
        elementClick(element,"Tapped Done button.");
//        elementClick(doneBtn, "Tapped Done button.");
    }

    public String getErrTxt() {
        WebElement element = mergeAndFindMobileElement(errTxt);
        String err = elementGetText(element, "error text is - ");
        return err;
    }

    public OrderTypeWindow ClockIn (){
        pressPin1();
        pressPin2();
        pressPin3();
        pressPin4();
        pressLogin();
        return new OrderTypeWindow();
    }

    public void verifiedClockInPage(){
        WebElement element = mergeAndFindMobileElement(pinEntryInfo);
        String actualName=elementGetText(element,"verify pinEntryInfo");
        String expectedName = "To Login enter your ID number or swipe the card";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickClockInButton(){
        WebElement element = mergeAndFindMobileElement(clockInButton);
        elementClick(element, "click clockInButton ");
    }
    public void enterDriverPinNumber(){
        pressPin1();
        pressPin1();
        pressPin1();
        pressPin1();
        WebElement element = mergeAndFindMobileElement(continueButton);
        elementClick(element, "click continueButton ");
    }
    public void verifyClockInSuccessMessage(){
        WebElement element = mergeAndFindMobileElement(clockInSuccessMessage);
        String actualName=elementGetText(element,"verify clockInSuccessMessage");
        String  expectedName = "Clocked IN successfully";

        Assert.assertEquals(actualName,expectedName);
    }

}
