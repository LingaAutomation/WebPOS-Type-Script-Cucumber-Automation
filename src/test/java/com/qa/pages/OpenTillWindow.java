package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTillWindow extends TillManagementScreen{

    public WebDriver driver;



    @FindBy(name = "Open Till" )
    private WebElement openTillWindowTitle;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"0\"]" )
    private WebElement number0;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"1\"]" )
    private WebElement number1;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"2\"]" )
    private WebElement number2;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"3\"]" )
    private WebElement number3;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"4\"]" )
    private WebElement number4;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"5\"]" )
    private WebElement number5;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"6\"]" )
    private WebElement number6;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"7\"]" )
    private WebElement number7;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"8\"]" )
    private WebElement number8;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"9\"]" )
    private WebElement number9;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"00\"]" )
    private WebElement number00;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"C\"]" )
    private WebElement numberC;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]" )
    private WebElement continueBtn;



    public String getOpenTillWindowTitle() {
        return getText(openTillWindowTitle, "open till window's title is - ");
    }

    public void press0() {
        elementClick(number0, "Tapped number0");
    }

    public void press1() {
        click(number1, "Tapped number1");
    }

    public void press2() {
        click(number2, "Tapped number2");
    }

    public void press3() {
        click(number3, "Tapped number3");
    }

    public void press4() {
        click(number4, "Tapped number4");
    }

    public void press5() {
        click(number5, "Tapped number5");
    }

    public void press6() {
        click(number6, "Tapped number6");
    }

    public void press7() {
        click(number7, "Tapped number7");
    }

    public void press8() {
        click(number8, "Tapped number8");
    }

    public void press9() {
        click(number9, "Tapped number9");
    }

    public void press00() {
        click(number00, "Tapped number00");
    }

    public void pressC() {
        click(numberC, "Tapped numberC");
    }

    public TillManagementScreen pressContinueBtn() {
        elementClick(continueBtn, "Tapped Continue button");
        return new TillManagementScreen();
    }
    public String amountGivenTxt1 = " ";

    public String pressContinueForOpenTill(){
        WebElement amountGiven =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        amountGivenTxt1 = amountGiven.getText();
        TestUtils.amountGivenTxt=amountGivenTxt1;
        elementClick(continueBtn, "Tapped Continue button");
        utils.log().info("Amount Given in open Till - "+amountGivenTxt1);
        return amountGivenTxt1;
    }

}
