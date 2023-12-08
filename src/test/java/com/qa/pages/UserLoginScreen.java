package com.qa.pages;


import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserLoginScreen extends SignInScreen{


    @iOSXCUITFindBy (id ="User Login")
    private WebElement titleTxt;

    @iOSXCUITFindBy (xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    //@iOSXCUITFindBy (id = "ID")
    private WebElement eMailTxtFld;

    @iOSXCUITFindBy (xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
    private WebElement passwordTxtFld;

    @iOSXCUITFindBy (id = "Finish")
    private WebElement finishBtn;

    @iOSXCUITFindBy (accessibility = "Invalid username or password")
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
        return new ClockInScreen();
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
    @iOSXCUITFindBy(accessibility = "No license available")
    WebElement noLicenseAvailable;
    public void verifyNoLicenseAvailablePopup(){
        Assert.assertEquals(noLicenseAvailable,"No license available");
    }
}
