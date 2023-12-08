package com.qa.pages;
import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.qa.pages.DriverSteup.driver;

public class Discount extends BasePage{

    @FindBy(name = "Discount")
    private WebElement discountCheck;

    @FindBy(name = "Mix&Match SP(Before Tax)")
    private WebElement setPrizeBeforeTax;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[2]/XCUIElementTypeCell")
    private WebElement orderListWithDiscount;

    @FindBy(name = "Discounts")
    private WebElement discountPage;

    @FindBy(name = "Discount")
    private WebElement discountNameOrderList;

    @FindBy(name = "Subtotal")
    private WebElement subtotalOfMenuItem;

    @FindBy(name = "Back")
    public WebElement backBtnDiscount;

    @FindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search\"]")
    private WebElement searchFldDiscount;

    public void pressDiscountBtn(){
        elementClick(discountCheck,"Tapped Discount on Check Based");
    }

    public void pressDiscount(String discount) {
        sendKeys(searchFldDiscount,discount);
        WebElement e=mergeAndFindElement(discount,"",TestUtils.Accessibility);

        if (e.isDisplayed()){
            elementClick(e,discount +" Selected");
        }
    }

    public void pressDiscount1(String discount){
        sendKeys(searchFldDiscount,discount);
        WebElement e1=mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"Check Based Amount\"])[2]","",TestUtils.XPath);

        if (e1.isDisplayed()) {
            elementClick(e1,discount +" Selected");
        }else{
            utils.log().info("Discount is not selected");
        }
    }
    public String discountPage(){
        return elementGetText(discountPage,"Discount Page txt is Displayed - ");
    }

    public void  verifyDiscountIsDisplayed(String discount){
        try{
            WebElement discount1=mergeAndFindElement(discount,"", TestUtils.Accessibility);
            if(discount1.isDisplayed()){
                utils.log().info("Discount is Applied - "+ discount);
            }}
        catch (Exception e){
            utils.log().info("Discount is not Applied");
        }
    }

    public void verifyMenuItemPrizeIsDisplayed(String value) {
        WebElement e11 = mergeAndFindElement(value,"",TestUtils.Accessibility);
        if(e11.isDisplayed()){
            utils.log().info("SubTotal of Menu Item - "+ value);
            TestUtils.subtotalTxt = value;
        }else{
            utils.log().info("SubTotal Of Menu Item is not displayed");
        }

    }

    public void verifyMenuItemTotal(String value){
        WebElement e11 = mergeAndFindElement(value,"",TestUtils.Accessibility);
        if(e11.isDisplayed()){
            utils.log().info("Total of Menu Item is - "+ value);

        }else{
            utils.log().info("Total Of Menu Item is not displayed");
            int i =  1/0;
        }
    }
    public void pressBackBtn(){
        elementClick(backBtnDiscount,"Tapped Back Button");
    }

    public void verifyMenuItemPrice(String value,String value1,String discount,String discount1) {
        WebElement e11 = mergeAndFindElement(value,"",TestUtils.Accessibility);
        String data = e11.getText().replaceAll(",", "").substring(0);
        Float price = Float.parseFloat(data);

        WebElement e12 = mergeAndFindElement(value1,"",TestUtils.Accessibility);
        String data1 = e12.getText().replaceAll(",", "").substring(0);
        Float price1 = Float.parseFloat(data1);

        if (discount1.equalsIgnoreCase("Least")) {
            if (price < price1) {
                utils.log().info(discount + " - Discount is applied " + value + " on menu Item "+discount1+" expensive");
            } else {
                utils.log().info(discount + " Discount is not applied");
            }
        }
        if (discount1.equalsIgnoreCase("Most")) {
            if (price1 > price) {
                utils.log().info(discount + " - Discount is applied " + value1 + " on menu Item "+discount1+" expensive");
            } else {
                utils.log().info(discount + " Discount is not applied");
            }
        }
    }

    public void verifyMenuItemTotal1(String value){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        WebElement e11 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String subtotalValue = e11.getText();
        TestUtils.totalTxt = subtotalValue;
        Assert.assertEquals(subtotalValue,value);
        utils.log().info("Total Value is - "+value);
    }

    public void verifyMenuItemTotalGratuity1(String value){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        WebElement e11 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String subtotalValue = e11.getText();
        TestUtils.totalTxt = subtotalValue;
        Assert.assertEquals(subtotalValue,value);
        utils.log().info("Total Value is - "+value);
    }

}
