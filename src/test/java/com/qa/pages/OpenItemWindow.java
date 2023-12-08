package com.qa.pages;

import com.qa.utils.TestUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.qa.pages.DriverSteup.driver;

public class OpenItemWindow extends CheckOptionsScreen{

    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]" )
    WebElement CoursingNameTxtFld;

    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]")
    WebElement CoursingNameTxtFldMenuOption;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]")
    WebElement ItemNameTxtFldMenuOption;

    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]")
    WebElement ItemNameTxtFld;


    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]")
    WebElement priceFld;
    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]

    @FindBy(xpath = " //XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]")
    WebElement priceFldMenuOption;

    @FindBy( xpath = "(//XCUIElementTypeButton[@name=\"1\"])[2]")
    WebElement price1;

    @FindBy( name = "1")
    WebElement price1Check;

    @FindBy(name = "0")
    WebElement price0;

    @FindBy(name = "00")
    WebElement price00;

    @FindBy( name = "Continue")
    WebElement continueBtn;

    @FindBy( name = "7% Sales Tax")
    WebElement percent7Tax;

    @FindBy(name = "Done")
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
        WebElement DatePickerWheel =mergeAndFindElement("//XCUIElementTypePicker","", TestUtils.XPath);

        List<WebElement> course= DatePickerWheel.findElements(By.xpath("//XCUIElementTypePickerWheel"));

        course.get(0).sendKeys(Name);
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
        WebElement getValueFromOpenItemField = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));
        String getValueFromOpenItemFieldTxt = getValueFromOpenItemField.getText();
          getValueFromOpenItemFieldTxt1 = getValueFromOpenItemFieldTxt.replaceAll("[A-Z$,. ]","");
          TestUtils.openItemValue = getValueFromOpenItemFieldTxt1;
          utils.log().info("Value From the Open Item Window - "+getValueFromOpenItemFieldTxt1);
      //  int getValueFromOpenItemFieldNumber = Integer.parseInt(getValueFromOpenItemFieldTxt1);


    }

    public void verifyOpenItemPriceWithOrderScreenPrice(){
        WebElement subTotal = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
         String subTotalTxt = subTotal.getText();
        String subTotalTxt1 = subTotalTxt.replaceAll("[A-Z$,. ]","");
        Assert.assertEquals(TestUtils.openItemValue,subTotalTxt1);
        utils.log().info("Subtotal is Same - "+subTotalTxt1);

    }
}
