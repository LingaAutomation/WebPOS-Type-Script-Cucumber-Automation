package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenItemWindow extends CheckOptionsScreen{

    public OpenItemWindow(WebDriver driver) {

        super(driver);

        this.driver = TestUtils.driver;

        PageFactory.initElements(this.driver,this);

    }

    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]" )
    WebElement CoursingNameTxtFld;

    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]
    @FindBy(xpath = "//mat-select[@role='combobox']")
    WebElement CoursingNameTxtFldMenuOption;

    @FindBy(xpath = "//ion-col[contains(@class,'openItem__content_grid-row')]//input[contains(@class,'monitored ng-touched ng-dirty')]")
    WebElement ItemNameTxtFldMenuOption;

    @FindBy( xpath = "//ion-col[contains(@class,'openItem__content_grid-row')]//input[contains(@class,'field-autofill-monitored ng-touched')]")
    WebElement ItemNameTxtFld;

    @FindBy( xpath = "//ion-col[contains(@class,'openItem__content_grid-row')]//input[@readonly='true']")
    WebElement priceFld;
    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]

    @FindBy(xpath = "//ion-col[contains(@class,'openItem__content_grid-row')]//input[@readonly='true']")
    WebElement priceFldMenuOption;

    @FindBy( xpath = "//button[.='1']")
    WebElement price1;

    @FindBy( xpath = "//button[.='1']")
    WebElement price1Check;

    @FindBy(xpath = "0")
    WebElement price0;

    @FindBy(xpath = "//button[.='00']")
    WebElement price00;

    @FindBy( xpath = "//button[contains(.,'Continue')]")
    WebElement continueBtn;

    @FindBy( xpath = "7% Sales Tax")
    WebElement percent7Tax;

    @FindBy(xpath = "//button[contains(.,'Done')]")
    WebElement doneBtn;



    public void selectCoursingNameTextFld(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        elementClick(coursingNameTxt, "Coursing Name text field is selected -");
    }

    public void pressOpenItemTextFieldMenuOption(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        elementClick(CoursingNameTxtFldMenuOption,"Tapped Coursing name field");
    }

    public void swipeToDessert() throws InterruptedException {
        WebElement DatePickerWheel =(WebElement) driver.findElement(By.xpath("//XCUIElementTypePicker"));

        List<WebElement> course= DatePickerWheel.findElements(By.xpath("//XCUIElementTypePickerWheel"));

        course.get(0).sendKeys("DESSERT");
    }

    public void swipeToCourseName(String Name) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement DatePickerWheel = driver.findElement(By.xpath("//div[@role='listbox']//mat-option//span[contains(.,'"+Name+"')]"));

        DatePickerWheel.click();

//        List<WebElement> course= DatePickerWheel.findElements(By.xpath("//XCUIElementTypePickerWheel"));
//
//        course.get(0).sendKeys(Name);
    }

    public void swipeToCourseName_ChangeCoursing(String Name) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement DatePickerWheel = driver.findElement(By.xpath("//span[contains(.,'"+Name+"')]"));
        DatePickerWheel.click();

    }

    public void setItemName(String name) throws InterruptedException {
        Thread.sleep(200);
        sendKeys( ItemNameTxtFld, name);
    }

    public void setItemNameMenuOption(){
        sendKeys( ItemNameTxtFldMenuOption, "Tiramisu");
    }

    public void setOpenItemNameMenuOption(String item){
        sendKeys( ItemNameTxtFldMenuOption, item);
    }




    public void selectPriceFld(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        elementClick( priceFld, "Price field selected - ");
    }

    public void selectPriceFldMenuOption(){
        elementClick(priceFldMenuOption,"Price Field selected");
    }

    public void selectTax(){
        elementClick( percent7Tax, "%7 Tax is selected - ");
    }

    public void pressDoneOpenItemBtn(){
        elementClick( doneBtn, "Done button is tapped - ");
    }

    public void press1(){
        elementClick( price1, "1 is selected ");
    }
    public void press1ForCheckOpenItem(){
        elementClick(price1Check,"Tapped 1 Button ");
    }

    public void press0(){
        elementClick( price0, "0 is selected - ");
    }

    public void press00(){
        elementClick( price00, "00 is selected - ");
    }

    public void pressContinueAddingOpenItem(){
        elementClick( continueBtn, "Continue button is tapped - " );
    }

    public String getValueFromOpenItemFieldTxt1 = " ";
    public void getValueFromOpenItemScreen(){
        WebElement getValueFromOpenItemField = (WebElement) driver.findElements(By.xpath("//ion-row[contains(@class,'quantity_grid-inputrow')]//input[@readonly='true']"));
        String getValueFromOpenItemFieldTxt = getValueFromOpenItemField.getAttribute("value");
          getValueFromOpenItemFieldTxt1 = getValueFromOpenItemFieldTxt.replaceAll("[A-Z$,. ]","");
          TestUtils.openItemValue = getValueFromOpenItemFieldTxt1;
//          utils.log().info("Value From the Open Item Window - "+getValueFromOpenItemFieldTxt1);
      //  int getValueFromOpenItemFieldNumber = Integer.parseInt(getValueFromOpenItemFieldTxt1);


    }

    public void verifyOpenItemPriceWithOrderScreenPrice(){
        WebElement subTotal = driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
         String subTotalTxt = subTotal.getAttribute("value");
        String subTotalTxt1 = subTotalTxt.replaceAll("[A-Z$,. ]","");
        Assert.assertEquals(TestUtils.openItemValue,subTotalTxt1);
//        utils.log().info("Subtotal is Same - "+subTotalTxt1);

    }
}
