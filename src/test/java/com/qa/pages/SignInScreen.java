package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.qa.pages.DriverSteup.driver;
public class SignInScreen extends BasePage {
    TestUtils utils = new TestUtils();

    @FindBy( xpath = "//XCUIElementTypeStaticText[@name=\"Sign In\"]" )
    private WebElement signInBtn;




    public UserLoginScreen pressSignInBtn() {
        elementClick(signInBtn, "press sign in button");
        return new UserLoginScreen();
    }

    public UserLoginScreen signIn() throws InterruptedException {
        return pressSignInBtn();
    }
}
