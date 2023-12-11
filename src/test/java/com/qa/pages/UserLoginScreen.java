package com.qa.pages;


import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginScreen extends SignInScreen{


    @FindBy (id ="User Login")
    private WebElement titleTxt;

    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    //@FindBy (id = "ID")
    private WebElement eMailTxtFld;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
    private WebElement passwordTxtFld;

    @FindBy (id = "Finish")
    private WebElement finishBtn;

    @FindBy (xpath = "Invalid username or password")
    private WebElement errTxt;

    public String getTitle() {
        return elementGetText(titleTxt, "user login window's title is - ");
    }

    public UserLoginScreen enterEMail(String eMailAddress) throws InterruptedException {
        //clear(eMailTxtFld);
        sendKeys(eMailTxtFld, eMailAddress, "login with " + eMailAddress);
        return this;
    }

    public UserLoginScreen enterPassword(String password) {
        //clear(passwordTxtFld);
        sendKeys(passwordTxtFld, password, "password is " + password);
        return this;
    }

    public ClockInScreen pressFinishBtn() {
        elementClick(finishBtn, "press finish button");
        return new ClockInScreen(driver);
    }

    public ClockInScreen login(String eMail, String password) throws InterruptedException {
        enterEMail(eMail);
        enterPassword(password);
        return pressFinishBtn();
    }

    public String getErrTxt() {
//        waitForVisibility(errTxt);
        String err = getText(errTxt, "error text is - ");
        return err;
    }
    public void emptyUsernameField(){
     WebElement invalidEmail = (WebElement) driver.findElement(By.xpath("//input[@name='email']"));
     elementClick(invalidEmail,"Invalid Email Selected");
     invalidEmail.clear();
    }

    public void emptyPasswordField(){
        WebElement password = (WebElement) driver.findElement(By.xpath("//input[@name='password']"));
        elementClick(password,"Password Selected");
        password.clear();
    }
    @FindBy(xpath = "No license available")
    WebElement noLicenseAvailable;
    public void verifyNoLicenseAvailablePopup(){
        Assert.assertEquals(noLicenseAvailable,"No license available");
    }
}
