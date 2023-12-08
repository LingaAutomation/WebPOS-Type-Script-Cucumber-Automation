package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SignInScreen extends BasePage {
    TestUtils utils = new TestUtils();

    @iOSXCUITFindBy( xpath = "//XCUIElementTypeStaticText[@name=\"Sign In\"]" )
    private WebElement signInBtn;




    public UserLoginScreen pressSignInBtn() {
        elementClick(signInBtn, "press sign in button");
        return new UserLoginScreen();
    }

    public UserLoginScreen signIn() throws InterruptedException {
        return pressSignInBtn();
    }
}
