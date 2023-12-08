package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.logging.log4j.Level;
import org.openqa.selenium.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CheckStatusScreen extends OrderManagementScreen {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Closed\"]")
    private WebElement closedTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
    private WebElement closedCheck1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
    private WebElement closedCheck2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Complete\"]")
    private WebElement completeTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1])")
    private WebElement storeToGoOrder;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell")
    private WebElement deliveryOrder;

    @iOSXCUITFindBy(accessibility = "Linga")
    private WebElement lingaPage;

    @iOSXCUITFindBy(accessibility = "Operation")
    private WebElement operationBtnCheckStats;

    @iOSXCUITFindBy(accessibility = "QSR")
    private WebElement qsrTab;



    public void selectClosedChecksTab(){
        click(closedTab, "Closed checks tab is tapped");
    }

    public void verifyClosedCheck1(){
        if(closedCheck1.isDisplayed()){
            utils.log().info("Check is closed successfully");
        }
        else
        {
            utils.log().info("Check is not closed successfully");
        }
    }

    public void verifyClosedCheck2(){
        if(closedCheck2.isDisplayed()){
            utils.log().info("Check is closed successfully");
        }
        else
        {
            utils.log().info("Check is not closed successfully");
        }
    }

    /****** (Store)ToGo order ******/
    public void selectCompleteTab() throws InterruptedException {
        Thread.sleep(1000);
        elementClick(completeTab, "Complete tab is tapped");
    }

    public void verifyToGoCheckClosed(){
        if(storeToGoOrder.isDisplayed()){
            utils.log().info("Check is closed successfully");
        }
        else
        {
            utils.log().info("Check is not closed successfully");
        }
    }

    /****** Store Delivery order ******/

    public void verifyDeliveryOrderPlaced(){
        if(storeToGoOrder.isDisplayed()){
            utils.log().info("Order is placed successfully");
        }
        else
        {
            utils.log().info("Check is not placed successfully");
        }
    }

    public void selectCloseCheck4(String table) {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));

        for (int index = 0; index < phoneOrders.size(); index++) {

            phoneOrders = (List<WebElement>) driver.findElement(By.xpath(table));

            phoneOrders.get(phoneOrders.size() - 1).click();
        }
        utils.log().info("Closed check is visible");
    }

    public void verifyClosedCheck(String table){

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));

        for (int index = 0; index < phoneOrders.size(); index++) {

            phoneOrders = (List<WebElement>) driver.findElement(By.xpath(table));

            phoneOrders.get(phoneOrders.size() - 1).click();
        }
        utils.log().info("Closed check is visible");
    }

    public void clickActiveChecks1(String table){

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));

        for (int index = 0; index < phoneOrders.size(); index++) {

            phoneOrders = (List<WebElement>) driver.findElement(By.xpath(table));

            phoneOrders.get(phoneOrders.size() - 1).click();

        }
        utils.log().info("Active check is visible");

    }
    public void clickActiveChecks(String table){


        List<WebElement> phoneOrders = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));

        for (int index = 0; index < phoneOrders.size(); index++) {

            phoneOrders = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+table+"\"][last()]"));

            phoneOrders.get(phoneOrders.size() - 1 ).click();
        }
    }

    public String verifyLinga(){
        driver.manage().timeouts().implicitlyWait(13,TimeUnit.SECONDS);
        return elementGetText(lingaPage,"Linga txt is displayed - ");
    }

    public void pressOperationOnCheckStats(){elementClick(operationBtnCheckStats,"Tapped Operation Button");}

    public void clickQsrButton(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        elementClick(qsrTab,"Tapped QSR button");
    }


}



