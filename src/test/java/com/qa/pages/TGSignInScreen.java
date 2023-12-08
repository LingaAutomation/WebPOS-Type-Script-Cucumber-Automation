package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TGSignInScreen extends BasePage {
    TestUtils utils = new TestUtils();

//    @iOSXCUITFindBy(id = "Sign In" )
//    private WebElement signInBtn;
    public By signInBtn = By.id("Sign In");

    private By signInButton = By.id("Sign In");
    public TGSignInScreen(){
    }

//    public TGSignInScreen() {
//    }

    public TGUserLoginScreen pressSignInBtn() {
        waitForVisibility(signInBtn);
        WebElement element=mergeAndFindMobileElement(signInBtn);
        elementClick(element, "press sign in button");
//        elementClick(signInBtn, "press sign in button");
        return new TGUserLoginScreen();
    }

    public TGUserLoginScreen signIn() throws InterruptedException {
        return pressSignInBtn();
    }
    public void verifyBeDirectedSignInPage(){
        WebElement element=mergeAndFindMobileElement(signInButton);
        elementClick(element,"Click Sign In");

    }


}
