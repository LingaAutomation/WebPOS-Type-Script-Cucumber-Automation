package com.qa.pages;

import com.qa.pages.OrderManagementScreen;
import com.qa.utils.TestUtils;
import org.junit.Assert;
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

    @FindBy(xpath = "//label[contains(.,'Resend To Kitchen')]")
    WebElement resendToKitchenBtn;

    @FindBy(xpath = "//label[contains(.,'Modify')]")
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

    public void pressModify() throws InterruptedException {
        Thread.sleep(2000);
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

    public void pressOpenItemTextFieldMenuOption() throws InterruptedException {
        Thread.sleep(300);
        elementClick(CoursingNameTxtFldMenuOption,"Tapped Coursing name field");
    }

//    public void pressOpenItemTextFieldMenuOption1() throws InterruptedException {
//        Thread.sleep(300);
//        elementClick(CoursingNameTxtFldMenuOption1,"Tapped Coursing name field");
//    }
//
//    public void pressOpenItemTextFieldMenuOption2() throws InterruptedException {
//        Thread.sleep(300);
//        elementClick(CoursingNameTxtFldMenuOption2,"Tapped Coursing name field");
//    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-open-item/ion-content/ion-grid/ion-row[1]/ion-col[2]/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
    WebElement CoursingNameTxtFldMenuOption;

//    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-open-item/ion-content/ion-grid/ion-row[1]/ion-col[2]/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
//    WebElement CoursingNameTxtFldMenuOption1;
//
//    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-open-item/ion-content/ion-grid/ion-row[1]/ion-col[2]/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
//    WebElement CoursingNameTxtFldMenuOption2;

    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])[1]")
    WebElement ItemNameTxtFldMenuOption;

//    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])[1]")
//    WebElement ItemNameTxtFldMenuOption1;
//
//    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])[1]")
//    WebElement ItemNameTxtFldMenuOption2;

    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]")
    WebElement ItemNameTxtFld;


    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]")
    WebElement priceFld;
    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]

    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])")
    WebElement priceFldMenuOption;

//    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])")
//    WebElement priceFldMenuOption1;
//
//    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])")
//    WebElement priceFldMenuOption2;

    public void setOpenItemNameMenuOption(String item) throws InterruptedException {
        Thread.sleep(300);
        sendKeys( ItemNameTxtFldMenuOption, item);
    }

//    public void setOpenItemNameMenuOption1(String item) throws InterruptedException {
//        Thread.sleep(300);
//        sendKeys( ItemNameTxtFldMenuOption1, item);
//    }
//
//    public void setOpenItemNameMenuOption2(String item) throws InterruptedException {
//        Thread.sleep(300);
//        sendKeys( ItemNameTxtFldMenuOption2, item);
//    }


    public void setItemName(String name) throws InterruptedException {
        Thread.sleep(200);
        sendKeys( ItemNameTxtFld, name);
    }

    public void setItemNameMenuOption(){
        sendKeys( ItemNameTxtFldMenuOption, "Tiramisu");
    }


    public void selectPriceFld(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        elementClick( priceFld, "Price field selected - ");
    }

    public void selectPriceFldMenuOption(){
        elementClick(priceFldMenuOption,"Price Field selected");
    }

//    public void selectPriceFldMenuOption1(){
//        elementClick(priceFldMenuOption1,"Price Field selected");
//    }
//
//    public void selectPriceFldMenuOption2(){
//        elementClick(priceFldMenuOption2,"Price Field selected");
//    }
    @FindBy( xpath = "//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//button[contains(.,'1')]")
    WebElement price1;

    public void press1(){
        elementClick( price1, "1 is selected ");
    }

    @FindBy(xpath = "//ion-col[contains(@class,'quantity_grid-row-col')]//button[contains(.,'00')]")
    WebElement price00;
    public void press00(){
        elementClick( price00, "00 is selected - ");
    }

    @FindBy(xpath = "(//ion-col[contains(@class,'quantity_grid-row-col')]//button[contains(.,'0')])[2]")
    WebElement price0;
    public void press0(){
        elementClick( price0, "00 is selected - ");
    }

    @FindBy( xpath = "//button[contains(.,' Continue ')]")
    WebElement continueBtn;

    public void pressContinueAddingOpenItem(){
        elementClick( continueBtn, "Continue button is tapped - " );
    }

    @FindBy(xpath = "//button[contains(.,' Done ')]")
    WebElement doneBtn;
    public void pressDoneOpenItemBtn(){
        elementClick( doneBtn, "Done button is tapped - ");
    }

    public void verifyOpenItem(String name) throws InterruptedException {
        Thread.sleep(300);
        WebElement menu=driver.findElement(By.xpath("(//div[contains(@class,'p-col-4 orderlist-menuname')])[2]"));

        if(menu.isDisplayed())
        {
            utils.log().info("Open Item is added - "+menu.getText());
            Assert.assertEquals(menu.getText(), name);
        }
        else {
            utils.log().info("Open Item is not added - "+name);
        }
    }
    @FindBy(xpath = "//ion-toolbar//div//button[contains(.,' Process ')]")
    WebElement processBtn;

    public void clickProcessButton() throws InterruptedException {
        Thread.sleep(3000);
        if(processBtn.isDisplayed()) {
            utils.log().info("Displayed");
            processBtn.click();
        }else{
            utils.log().info("Not Displayed");
        }
    }

    @FindBy(xpath = "//label[contains(.,'Discount')]")
    private WebElement discountOnOption;

    public void selectDiscountOnCheckOption() {

        elementClick(discountOnOption, "Tapped Discount Button");
        //click(discountOnOptionScreen,"Tapped Discount Button");
    }
    @FindBy(name = "Open Check Discount")
    private WebElement openCheckDiscountOptionScreen;
    public void selectOpenCheckDiscountBtn() {
        elementClick(openCheckDiscountOptionScreen, "Tapped Open check Discount Button");
    }

}