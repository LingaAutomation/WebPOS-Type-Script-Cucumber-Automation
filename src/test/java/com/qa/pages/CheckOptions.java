package com.qa.pages;

import com.qa.pages.OrderManagementScreen;
import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class CheckOptions extends OrderManagementScreen {


    @FindBy(xpath = "//label[contains(.,'Gratuity')]")
    WebElement gratuityBtn;

    @FindBy(xpath = "//ion-title[contains(.,'Add Gratuity')]")
    WebElement addGratuityScreen;

    @FindBy(xpath = "//button[.=' Fixed Gratuity ']")
    WebElement gratuityFixedBtn;

    @FindBy(xpath = "//button[.=' Gratuity Varying ']")
    WebElement gratuityVaryingBtn;

    @FindBy(xpath = "//input[contains(@placeholder,'Enter value between 5.0-15.0')]")
    WebElement passPercentageValue;

    @FindBy(xpath = "//ion-title[contains(.,'Enter Gratuity Percentage')]")
    WebElement enterPercentagePopup;

    @FindBy(xpath = "//button[contains(.,' Apply ')]")
    WebElement applyBtn;

    @FindBy(xpath = "//label[contains(.,'Hold')]")
    WebElement holdBtn;

    @FindBy(xpath = "//label[contains(.,'Tax Exempt')]")
    WebElement taxExemptBtn;

    @FindBy(xpath = "//label[contains(.,'Open Item')]")
    WebElement openItemBtn;

    @FindBy(name = "//label[contains(.,'Resend To Kitchen')]")
    WebElement resendToKitchenBtn;

    @FindBy(name = "//label[contains(.,'Modify')]")
    WebElement modifyBtn;

    public void pressGratuityBtn() {
        elementClick(gratuityBtn, "Tapped Gratuity Button");
    }
    public void verifyEnterPercentage() {
        if (enterPercentagePopup.isDisplayed()) {
            utils.log().info("Percentage popup is visible");
        } else {
            utils.log().info("Percentage popup is not visible");
        }
    }
    public String verifyAddGratuityScreen() {
        return elementGetText(addGratuityScreen, "Add Gratuity Screen is Displayed - ");
    }

    public void pressGratuityFixedBtn() {
        elementClick(gratuityFixedBtn, "Tapped Gratuity Fixed Button");
    }


    public void pressGratuityVaryingBtn() {
        elementClick(gratuityVaryingBtn, "Tapped Gratuity Varying Button");
    }

    public void passPercentage(String number) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        elementClick(passPercentageValue, "Pass percentage value field is clicked.");
        elementClick("//ion-col[contains(@class,'quantity_grid-row-col')]//button[contains(.,'C')]", "Tapped Pin C");
        WebElement el2 =  driver.findElement(By.xpath("//ion-col[contains(@class,'quantity_grid-row-col')]//button[contains(.,'"+number+"')]"));
        elementClick(el2, "Tapped number as - " + number);
        elementClick("//ion-col[contains(@class,'quantity_grid-row-col')]//button[contains(.,'00')]", "Tapped Pin 00");
        WebElement el5 =  driver.findElement(By.xpath("//span[contains(.,'Continue')]"));
        elementClick(el5, "Tapped continue Button ");

        elementClick(applyBtn, "Tapped Apply button");
    }
    public String a = " ";

    public String passPercentageEngin1() {
        a = "8";
        WebElement valueBetween =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextField"));
        String valueBetweenTxt = valueBetween.getText();
        utils.log().info("Percentage value - " + valueBetweenTxt);
        elementClick(passPercentageValue, "Pass percentage value field is clicked.");

        WebElement el2 =  driver.findElement(By.xpath(a));
        TestUtils.percent = a;
        String number = el2.getText();
        elementClick(el2, "Tapped number as - " + number);

        WebElement el5 =  driver.findElement(By.xpath("Continue"));
        elementClick(el5, "Tapped continue Button ");

        elementClick(applyBtn, "Tapped Apply button");

        return a;

    }


    public String passPercentageEngin2(String value) {

        WebElement valueBetween =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextField"));
        String valueBetweenTxt = valueBetween.getText();
        utils.log().info("Percentage value - " + valueBetweenTxt);
        elementClick(passPercentageValue, "Pass percentage value field is clicked.");

        WebElement el2 =  driver.findElement(By.xpath(value));
        TestUtils.percent = value;
        String number = el2.getText();
        elementClick(el2, "Tapped number as - " + number);

        WebElement el5 =  driver.findElement(By.xpath("Continue"));
        elementClick(el5, "Tapped continue Button ");

        elementClick(applyBtn, "Tapped Apply button");

        return value;

    }

    public void passPercentageEngin() {

        elementClick(passPercentageValue, "Pass percentage value field is clicked.");

        WebElement el2 =  driver.findElement(By.xpath("8"));
        String number = el2.getText();
        elementClick(el2, "Tapped number as - " + number);

        WebElement el5 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
        elementClick(el5, "Tapped continue Button ");

        elementClick(applyBtn, "Tapped Apply button");
    }

    public void pressTaxExempt() {
        elementClick(taxExemptBtn, "- Tax Exempt is tapped");
    }

    public void selectHold() {
        elementClick(holdBtn, "- Hold option is selected");
    }

    public void pressModify() {
        elementClick(modifyBtn, "- Modify is tapped");
    }



    public void pressResendToKitchen() {
        elementClick(resendToKitchenBtn, "- Resend to kitchen is tapped");
    }

    @FindBy(name = "Tax Exempt Removed Successfully")
    WebElement taxExemptRemovedTxt;

    public String getTaxExemptRemovedTxt() {
        return elementGetText(taxExemptRemovedTxt, "Tax exempt removed text is - ");
    }

    public String getTaxExemptTitle() {
        return elementGetText(taxExemptTitle, "Tax Exempt title is - ");
    }


    @FindBy(xpath = "//label[contains(.,'Tax Exempt')]")
    WebElement taxExemptTitle;

    @FindBy(xpath = "//button[contains(.,'School')]")
    WebElement schoolTaxExemptReason;

    public void selectSchoolAsTaxExemptReason() {
        elementClick(schoolTaxExemptReason, "- School Tax Exempt Reason is selected");
    }

    public void pressOpenItem() {
//        openItemBtn.click();
        elementClick(openItemBtn, "Tax Exempt is tapped");
    }


    public void swipeToCourseName(String Name) throws InterruptedException {
        Thread.sleep(300);
//        List<WebElement> element = driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));

        WebElement element = driver.findElement(By.xpath("//mat-option//span[contains(.,' "+Name+" ')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(300);
        element.click();
//        Select s = new Select(element);
//        Thread.sleep(300);
//        s.selectByVisibleText(Name);
    }

    public void pressOpenItemTextFieldMenuOption(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        elementClick(CoursingNameTxtFldMenuOption,"Tapped Coursing name field");
    }

    @FindBy(xpath = "//div[@id='mat-select-value-1']")
    WebElement CoursingNameTxtFldMenuOption;
}