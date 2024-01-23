package com.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;
import static com.qa.utils.TestUtils.driver;

public class LogOuts extends BasePage {

    /* Belong to clock in page */
    @FindBy(name = "Cancel")
    private WebElement cancelBtn;

    @FindBy (xpath = "//XCUIElementTypeApplication[@name='Linga POS']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[9]")
    private WebElement logOffBtn;

    @FindBy (id = "logout")
    private WebElement logOutBtn;

    @FindBy (id = "Yes")
    private WebElement yesBtn;

    @FindBy (name = "0")
    private WebElement logOut0Btn;
    @FindBy (name = "1")
    private WebElement logOut1Btn;

    @FindBy (name = "2")
    private WebElement logOut2Btn;

    @FindBy (name = "3")
    private WebElement logOut3Btn;

    @FindBy (name = "4")
    private WebElement logOut4Btn;

    @FindBy (name = "Continue")
    private WebElement continueBtn;

    /*************************/

    /* Belongs to Sign In page */

    @FindBy (id = "Device Id:")
    private WebElement staticTxt;

    /* Belongs To BarTab (and Other)*/
    @FindBy (xpath = "//linga-icon[(@symbol='logout')]")
    private WebElement powerBtn;

    @FindBy (xpath = "//linga-icon[@symbol='powerButton']")
    private WebElement powerBtn1;

    /*Methods*/

    public String checkStaticText(){
        return elementGetText(staticTxt, "user login window's title is - ");
    }

    public void pressCancel() {
        elementClick(cancelBtn, "Cancel button is clicked");
    }

    public void pressLogOff() {
        elementClick(logOffBtn, "Log off button is clicked");
    }

    public void pressLogOut() {
        elementClick(logOutBtn, "Log out button is clicked");
    }

    public void pressYes() {
        elementClick(yesBtn, "Yes button is clicked");
    }

    public void pressLogOut0()  {
        elementClick(logOut0Btn, "Logout0 button is clicked");
    }

    public void pressLogOut1()  {
        elementClick(logOut1Btn, "Logout1 button is clicked");
    }

    public void pressLogOut2()  {
        elementClick(logOut2Btn, "Logout2 button is clicked");
    }

    public void pressLogOut3()  {
        elementClick(logOut3Btn, "Logout3 button is clicked");
    }

    public void pressLogOut4()  {
        elementClick(logOut4Btn, "Logout4 button is clicked");
    }

    public SignInScreen pressContinue(){
        elementClick(continueBtn, "Continue button is clicked");
        return new SignInScreen();
    }

    public void pressPowerBtn() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        click(powerBtn, "Power button is clicked");
    }

    public void pressPowerBtn1() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        click(powerBtn1, "Power button is clicked");
    }

    public void logOutBeforeClockIn(){
        pressLogOut();
        pressYes();
        pressLogOut1();
        pressLogOut2();
        pressLogOut3();
        pressLogOut4();
        pressContinue();
    }
    public SignInScreen logOutAfterClockIn(){
        pressLogOff();
        pressLogOut();
        pressYes();
        pressLogOut1();
        pressLogOut2();
        pressLogOut3();
        pressLogOut4();
        return pressContinue();

    }

    public SignInScreen logOutAfterClockInForBarTab() throws InterruptedException {
        pressPowerBtn();
        pressLogOut();
        pressYes();
        pressLogOut0();
        pressLogOut0();
        pressLogOut0();
        pressLogOut0();
        return pressContinue();

    }

    public void pressPowerBtn_AllOrders() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(6000);
        WebElement powerBtn = driver.findElement(By.xpath("//linga-icon[@symbol='logout']"));
        elementClick(powerBtn, "Text");
    }


}
