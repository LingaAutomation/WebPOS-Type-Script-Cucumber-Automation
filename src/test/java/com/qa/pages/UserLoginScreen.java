package com.qa.pages;


import com.qa.utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UserLoginScreen extends SignInScreen{

    public WebDriver driver = TestUtils.driver;

    public UserLoginScreen() {

        PageFactory.initElements(this.driver,this);
    }
    @FindBy(id ="User Login")
    private WebElement titleTxt;

    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    //@FindBy (id = "ID")
    private WebElement eMailTxtFld;

    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
    private WebElement passwordTxtFld;

    @FindBy (id = "Finish")
    private WebElement finishBtn;

    @FindBy (name = "Invalid username or password")
    private WebElement errTxt;

    public String getTitle() {
        return elementGetText(titleTxt, "user login window's title is - ");
    }

    public void enterEMail(String eMailAddress) throws InterruptedException {
        //clear(eMailTxtFld);
        sendKeys(eMailTxtFld, eMailAddress, "login with " + eMailAddress);
    }

    public void enterPassword(String password) {
        //clear(passwordTxtFld);
        sendKeys(passwordTxtFld, password, "password is " + password);
    }

    public ClockInScreen pressFinishBtn() {
        elementClick(finishBtn, "press finish button");
        return new ClockInScreen();
    }

    public ClockInScreen login(String eMail, String password) throws InterruptedException {
        enterEMail(eMail);
        enterPassword(password);
        return pressFinishBtn();
    }

    public String getErrTxt() {
//        waitForVisibility(errTxt);
        return getText(errTxt, "error text is - ");
    }
    public void emptyUsernameField(){
     WebElement invalidEmail =  driver.findElement(By.xpath("//input[@name='email']"));
     elementClick(invalidEmail,"Invalid Email Selected");
     invalidEmail.clear();
    }

    public void emptyPasswordField(){
        WebElement password =  driver.findElement(By.xpath("//input[@name='password']"));
        elementClick(password,"Password Selected");
        password.clear();
    }
    @FindBy(name = "No license available")
    WebElement noLicenseAvailable;
    public void verifyNoLicenseAvailablePopup(){
        Assert.assertEquals(noLicenseAvailable.getText(),"No license available");
    }
}
