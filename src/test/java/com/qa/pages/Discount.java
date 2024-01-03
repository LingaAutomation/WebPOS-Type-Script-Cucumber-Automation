package com.qa.pages;
import com.qa.utils.TestUtils;
import io.cucumber.java.it.Ma;
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

        WebElement e=driver.findElement(By.xpath("//span[contains(.,' "+discount+" ')]"));

        if (e.isDisplayed()){
            elementClick(e,discount +" Selected");
        }else{
            utils.log().info("Not discplayed - "+discount);
            int w = 1/ 0;
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
        Thread.sleep(2000);
        utils.log().info(value+value1+discount+discount1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        utils.log().info("Discount - " + discount1);
        Thread.sleep(1000);
        WebElement e11 = driver.findElement(By.xpath("(//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']//div[@class='p-col-3 text-pos-end '])[1]"));
        String data = e11.getText();
        Assert.assertEquals(data, value);
        double price = Double.parseDouble(data);
        utils.log().info("Price - " + price);
        Thread.sleep(1000);

        WebElement e12 = driver.findElement(By.xpath("(//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']//div[@class='p-col-3 text-pos-end '])[2]"));
        String data1 = e12.getText();
        Assert.assertEquals(data1, value1);
        double price1 = Double.parseDouble(data1);
        utils.log().info("Price 1 - " + price1);
        Thread.sleep(1000);


        if (discount1.equals("Least")) {
           double minim =  Math.min(price,price1);
            utils.log().info("Mini- " + minim);
            if (minim == price) {
                WebElement discountt = driver.findElement(By.xpath("//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']//div[.='" + value + "']/../..//div[@class='discount-section']//div[.='" + discount + "']"));
                utils.log().info(discountt.getText());
                Assert.assertEquals(discountt.getText(), discount);
                utils.log().info(discount + " - Discount is applied " + value + " on menu Item " + discount1 + " expensive");
            } else {
                WebElement discountt = driver.findElement(By.xpath("//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']//div[.='" + value1 + "']/../..//div[@class='discount-section']//div[.='" + discount + "']"));
                utils.log().info(discountt.getText());
                Assert.assertEquals(discountt.getText(), discount);
                utils.log().info(discount + " - Discount is applied " + value1 + " on menu Item " + discount1 + " expensive");
            }
            Thread.sleep(1000);
        } else if (discount1.equals("Most")) {
            double maxi =  Math.max(price,price1);
            utils.log().info("Maxi- " + maxi);
            if (maxi == price) {
                WebElement discountt = driver.findElement(By.xpath("//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']//div[.='" + value + "']/../..//div[@class='discount-section']//div[.='" + discount + "']"));
                utils.log().info(discountt.getText());
                Assert.assertEquals(discountt.getText(), discount);
                utils.log().info(discount + " - Discount is applied " + value + " on menu Item " + discount1 + " expensive");
            } else {
                WebElement discountt = driver.findElement(By.xpath("//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']//div[.='" + value1 + "']/../..//div[@class='discount-section']//div[.='" + discount + "']"));
                utils.log().info(discountt.getText());
                Assert.assertEquals(discountt.getText(), discount);
                utils.log().info(discount + " - Discount is applied " + value1 + " on menu Item " + discount1 + " expensive");
            }
        }
    }
    public void verifyMenuItemPrizeIsDisplayedInSplitSeat1(String value){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        WebElement e11 =  driver.findElement(By.xpath("//app-split-seat-orders//ion-header[@role='banner']//ion-col[.='Seat 1']/../../..//ion-footer//ion-row//ion-col//p[.='Subtotal']/../..//ion-col//p[@class='ion-float-right']"));
        String subtotalValue = e11.getText();
        Assert.assertEquals(subtotalValue,value);
        utils.log().info("Subtotal Value is - "+value);

    }

    public void verifyMenuItemPrizeIsDisplayedInSplitSeat2(String value){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
                WebElement e11 =  driver.findElement(By.xpath("//app-split-seat-orders//ion-header[@role='banner']//ion-col[.='Seat 2']/../../..//ion-footer//ion-row//ion-col//p[.='Subtotal']/../..//ion-col//p[@class='ion-float-right']"));
                String subtotalValue = e11.getText();
                Assert.assertEquals(subtotalValue,value);
                utils.log().info("Subtotal Value is - "+value);

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
