package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInScreen extends BasePage {
    TestUtils utils = new TestUtils();

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sign In\"]" )
    private WebElement signInBtn;

    public WebDriver driver = TestUtils.driver;

    public SignInScreen() {

        PageFactory.initElements(this.driver,this);
    }


    public UserLoginScreen pressSignInBtn() {
        elementClick(signInBtn, "press sign in button");
        return new UserLoginScreen();
    }

    public UserLoginScreen signIn() throws InterruptedException {
        return pressSignInBtn();
    }
}
