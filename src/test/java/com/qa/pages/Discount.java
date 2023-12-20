package com.qa.pages;
import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.qa.utils.TestUtils.driver;
public class Discount extends BasePage{

    String discountCheck = "//ion-row/button[contains(.,'Discount')]";

    @FindBy(name = "Mix&Match SP(Before Tax)")
    private WebElement setPrizeBeforeTax;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[2]/XCUIElementTypeCell")
    private WebElement orderListWithDiscount;

    String discountPage= "//ion-col[contains(.,'Discounts')]";

    @FindBy(name = "Discount")
    private WebElement discountNameOrderList;

    @FindBy(name = "Subtotal")
    private WebElement subtotalOfMenuItem;

   String backBtnDiscount = "//span[contains(.,' Cancel ')]";

    String searchFldDiscount = "//ion-searchbar[contains(@class,'discount')]/div/input";

    public void pressDiscountBtn(){
        elementClick(discountCheck,"Tapped Discount on Check Based");
    }

    public void pressDiscount(String discount) throws InterruptedException {
        Thread.sleep(1000);
        sendKeys(convertWebElement(searchFldDiscount),discount);
        Thread.sleep(1000);
        WebElement e=driver.findElement(By.xpath("//span[contains(.,' "+discount+" ')]"));

        if (e.isDisplayed()){
            elementClick(e,discount +" Selected");
        }else{
            utils.log().info("Not discplayed - "+discount);
            int w = 1/ 0;
        }
    }

    public void pressDiscount1(String discount){
        sendKeys(convertWebElement(searchFldDiscount),discount);

        WebElement e1=mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"Check Based Amount\"])[2]","",TestUtils.XPath);

        if (e1.isDisplayed()) {
            elementClick(e1,discount +" Selected");
        }else{
            utils.log().info("Discount is not selected");
        }
    }
    public String discountPage() throws InterruptedException {
        Thread.sleep(500);
        return getText(convertWebElement(discountPage),"Discount Page txt is Displayed - ");
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

    public void verifyMenuItemPrizeIsDisplayed(String value) throws InterruptedException {
        WebElement e11 = driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        Thread.sleep(1000);
        if(e11.isDisplayed()){
            utils.log().info("SubTotal of Menu Item - "+ e11.getAttribute("value"));
            Assert.assertEquals(e11.getAttribute("value"),value);
            TestUtils.subtotalTxt = value;
        }else{
            utils.log().info("SubTotal Of Menu Item is not displayed");
        }

    }

    public void verifyMenuItemTotal(String value) throws InterruptedException {
        Thread.sleep(1000);
        WebElement e11 = driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));

        if(e11.isDisplayed()){
            utils.log().info("Total of Menu Item is - "+ e11.getAttribute("value"));
            Assert.assertEquals(e11.getAttribute("value"),value);
            TestUtils.totalTxt = value;
        }else{
            utils.log().info("Total Of Menu Item is not displayed");
            int i =  1/0;
        }
    }
    public void pressBackBtn(){
        elementClick(backBtnDiscount,"Tapped Back Button");
    }

    public void verifyMenuItemPrice(String value,String value1,String discount,String discount1) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
        WebElement e11 = driver.findElement(By.xpath("(//div[contains(@class,'p-col-3 text-pos-end ')])[1]"));
        utils.log().info(e11.getText());
        String data = e11.getText().replaceAll(",", "").substring(0);
        float price = Float.parseFloat(data);
        Thread.sleep(1000);
        WebElement e12 = driver.findElement(By.xpath("(//div[contains(@class,'p-col-3 text-pos-end ')])[2]"));
        utils.log().info(e12.getText());
        String data1 = e12.getText().replaceAll(",", "").substring(0);
        float price1 = Float.parseFloat(data1);
        Thread.sleep(1000);
        if (discount1.equalsIgnoreCase("Least")) {
            if (price < price1) {
                utils.log().info(discount + " - Discount is applied " + value + " on menu Item "+discount1+" expensive");
            } else {
                utils.log().info(discount + " Discount is not applied");
            }
        }
        Thread.sleep(1000);
        if (discount1.equalsIgnoreCase("Most")) {
            if (price1 > price) {
                utils.log().info(discount + " - Discount is applied " + value1 + " on menu Item "+discount1+" expensive");
            } else {
                utils.log().info(discount + " Discount is not applied");
            }
        }
    }

    public void verifyMenuItemTotal1(String value) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Thread.sleep(1000);
        WebElement e11 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String subtotalValue = e11.getAttribute("value");
        utils.log().info("Total Value is - "+subtotalValue);
        TestUtils.totalTxt = subtotalValue;
        Assert.assertEquals(subtotalValue,value);
        utils.log().info("Total Value is - "+value);
    }

    public void verifyMenuItemTotalGratuity1(String value) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Thread.sleep(1000);
        WebElement e11 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String subtotalValue = e11.getAttribute("value");
        TestUtils.totalTxt = subtotalValue;
        Assert.assertEquals(subtotalValue,value);
        utils.log().info("Total Value is - "+value);
    }

    public void verifyMenuItemTotal2(String value) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Thread.sleep(1000);
        WebElement e11 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String subtotalValue = e11.getAttribute("value");
        Assert.assertEquals(subtotalValue,value);
        utils.log().info("Total Value is - "+value);

    }
}
