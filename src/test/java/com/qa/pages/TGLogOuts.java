package com.qa.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TGLogOuts extends BasePage {

    public By cancelBtn = By.id("Cancel");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
//    private WebElement cancelBtn;

    public By logOffBtn = By.xpath("//XCUIElementTypeApplication[@name='Linga POS']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[9]");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='Linga POS']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[9]")
//    private WebElement logOffBtn;

    public By logOutBtn = By.id("logout");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"logout\"]")
//    private WebElement logOutBtn;

    public By yesBtn = By.id("Yes");

//    @iOSXCUITFindBy(id = "Yes")
//    private WebElement yesBtn;

    public By logOut1Btn = By.id("1");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='1']")
//    private WebElement logOut1Btn;

    public By logOut2Btn = By.id("1");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='2']")
//    private WebElement logOut2Btn;

    public By logOut3Btn = By.id("3");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='3']")
//    private WebElement logOut3Btn;

    public By logOut4Btn = By.id("4");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='4']")
//    private WebElement logOut4Btn;

    public By continueBtn = By.id("Continue");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
//    private WebElement continueBtn;

    public By staticTxt = By.id("Device Id:");

//    @iOSXCUITFindBy(id = "Device Id:")
//    private WebElement staticTxt;

    public By btn = By.id("Sign In");
//    @iOSXCUITFindBy(id = "Sign In")
//    //private WebElement signInBtn;
//    private String btn;

    private By signInBtn = By.id("Sign In");


    public TGLogOuts(IOSDriver driver) {
    }

    public TGLogOuts() {

    }

    public String checkStaticText() {
        WebElement element = mergeAndFindMobileElement(staticTxt);
        String value = elementGetText(element, "user login window's title is - ");
        return value;
    }

    public void pressCancel() throws InterruptedException {
        Thread.sleep(500);
//        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
//        WebElement element = mergeAndFindMobileElement(cancelBtn);
//        elementClick(element,"Cancel button is clicked");
driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        findandclickM(cancelBtn);
//        elementClick(cancelBtn, "Cancel button is clicked");
    }

    public void pressLogOff() {
        WebElement element = mergeAndFindMobileElement(logOffBtn);
        elementClick(element,"Log off button is clicked");
//        elementClick(logOffBtn, "Log off button is clicked");
    }

    public void pressLogOut() {
        WebElement element = mergeAndFindMobileElement(logOutBtn);
        elementClick(element,"Log out button is clicked");
//        elementClick(logOutBtn, "Log out button is clicked");
    }

    public void pressYes() {
        WebElement element = mergeAndFindMobileElement(yesBtn);
        elementClick(element,"Yes button is clicked");
//        elementClick(yesBtn, "Yes button is clicked");
    }

    public void pressLogOut1() {
        WebElement element = mergeAndFindMobileElement(logOut1Btn);
        elementClick(element,"Logout1 button is clicked");
//        elementClick(logOut1Btn, "Logout1 button is clicked");
    }

    public void pressLogOut2() {
        WebElement element = mergeAndFindMobileElement(logOut2Btn);
        elementClick(element,"Logout2 button is clicked");
//        elementClick(logOut2Btn, "Logout1 button is clicked");
    }

    public void pressLogOut3() {
        WebElement element = mergeAndFindMobileElement(logOut3Btn);
        elementClick(element,"Logout3 button is clicked");
//        elementClick(logOut3Btn, "Logout1 button is clicked");
    }

    public void pressLogOut4() {
        WebElement element = mergeAndFindMobileElement(logOut4Btn);
        elementClick(element,"Logout4 button is clicked");
//        elementClick(logOut4Btn, "Logout1 button is clicked");
    }
    private By pinEntryInfo = By.xpath("//XCUIElementTypeStaticText[@name=\"To Login enter your ID number or swipe the card\"]");


    public SignInScreen pressContinue() {
        WebElement element = mergeAndFindMobileElement(continueBtn);
        elementClick(element, "Logout1 button is clicked");
        return new SignInScreen();
    }

    public void logOutBeforeClockIn() {
        pressLogOut();
        pressYes();
        pressLogOut1();
        pressLogOut2();
        pressLogOut3();
        pressLogOut4();
        pressContinue();
    }

    public SignInScreen logOutAfterClockIn() {
        pressLogOff();
        pressLogOut();
        pressYes();
        pressLogOut1();
        pressLogOut2();
        pressLogOut3();
        pressLogOut4();
        return pressContinue();
    }

    public void logout() throws InterruptedException {
        List<WebElement> signInBtn = (List<WebElement>) driver.findElements(By.id("Sign In"));

        if(signInBtn.size()>=1){
            WebElement signinbutton = signInBtn.get(signInBtn.size() - 1);
            signinbutton.click();
        }
        else{
            pressLogOut();
            pressYes();
            pressLogOut1();
            pressLogOut2();
            pressLogOut3();
            pressLogOut4();
            pressContinue();
        }


    }
}




