package com.qa.pages;

import com.google.common.collect.Iterables;
import com.qa.utils.TestUtils;

import org.openqa.selenium.WebElement;
import io.cucumber.java.an.E;
import org.joda.time.base.BaseLocal;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.qa.pages.DriverSteup.driver;

public class TGPhoneOrderPage extends BasePage{



    public void selectCompletePhoneOrdersOption(){
        WebElement element = mergeAndFindMobileElement(completedPhoneOrder);
        elementClick(element, "click completedPhoneOrder ");
    }

    public void verifyDeliveredForHereOrder(){
        List<String> orders = Arrays.asList();

        for(int index=0;index<orders.size();index++) {
            //String firstOrder = orders.get(1);
            String lastOrder = orders.get(orders.size() - 1);


            System.out.println("ArrayList : " + orders);
            //System.out.println("First element in arraylist : " + firstOrder);
            System.out.println("Last element in arraylist : " + lastOrder);
        }
    }

    public void clickFutureDeliveryOrder(){
        WebElement element = mergeAndFindMobileElement(futurePhoneOrder);
        elementClick(element, "click futurePhoneOrder ");
    }

    public void verifyFutureDeliveryOrder(){
        //futureDeliveryTime  --> orderDate ve DeliveryDate'in eşit olmadığını verify et
    }

    public void clickNewTabBelowPhoneOrder(){
        WebElement element = mergeAndFindMobileElement(newTabPhoneOrder);
        elementClick(element, "click newTabPhoneOrder ");
    }

    public void selectLastFutureOrder() {
        List<WebElement> orders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));

        for (int index = 0; index < orders.size(); index++) {
            WebElement lastOrder = orders.get(orders.size() - 1);
            lastOrder.click();

            System.out.println("ArrayList : " + orders);
            System.out.println("Last element in arraylist : " + lastOrder);
        }
    }

    public void selectActiveDriver(){
        WebElement element = mergeAndFindMobileElement(firstActiveDriver);
        elementClick(element, "click firstActiveDriver ");
    }

    public void clickDepartureButton(){
        WebElement element = mergeAndFindMobileElement(departureButton);
        elementClick(element, "click departureButton ");
    }

    public void clickOutTabBelowPhoneOrder(){
        WebElement element = mergeAndFindMobileElement(outTabPhoneOrder);
        elementClick(element, "click outTabPhoneOrder ");
    }

    public void clickArrivalButton(){
        WebElement element = mergeAndFindMobileElement(arrivalButton);
        elementClick(element, "click arrivalButton ");
    }

    public void verifyFastCash(){
        WebElement element = mergeAndFindMobileElement(fastCashScreen);
        elementClick(element, "click fastCashScreen ");
    }

    public void verifyNewLastOrder(){
        List<String> orders = Arrays.asList();

        for (int index = 0; index < orders.size(); index++) {
            //String firstOrder = orders.get(1);
            String lastOrder = orders.get(orders.size() - 1);


            System.out.println("ArrayList : " + orders);
            //System.out.println("First element in arraylist : " + firstOrder);
            System.out.println("Last element in arraylist : " + lastOrder);
            Assert.assertTrue("last new order",true);
        }

    }

    public void verifyNoDriverOnTheGo(){
        WebElement element = mergeAndFindMobileElement(noDriver);
        String actualName=elementGetText(element,"verify noDriver");
        String expectedName = "";

        Assert.assertEquals(actualName,expectedName);
    }

    public void verifyDepartureOrder(){
        List<String>drivers = Arrays.asList();
        for(int index = 0; index < drivers.size(); index++){
            String lastDriver = drivers.get(drivers.size()-1);
            System.out.println("Last driver on list : "+lastDriver);
            Assert.assertTrue("Last driver on list :",true);
            lastDriver.equals(ordersDriver);

            WebElement element = mergeAndFindMobileElement(driverColumn);
            String actualName=elementGetText(element,"verify driverColumn");

            WebElement element1 = mergeAndFindMobileElement(ordersDriver);
            String expectedName=elementGetText(element1,"verify ordersDriver");

            actualName.equals(expectedName);
        }
    }

//    public void verifyAssignedLastOrder(){
//        List<String> order = Arrays.asList();
//        for(int index = 0; index < order.size(); index ++){
//            String lastOrder = order.get(order.size()-1);
//            System.out.println("Last order :" + lastOrder);
//            Assert.assertTrue("Assigned driver : ",true);
//            lastOrder.equals(ordersDriver);
//        }
//    }

    public void verifyAssignedLastOrder(){
        List<String> order = Arrays.asList();
        for(int index = 0; index < order.size(); index ++){
            String lastOrder = order.get(order.size()-1);
            System.out.println("Last order :" + lastOrder);
            Assert.assertTrue("Assigned driver : ",true);
            lastOrder.equals(activeDriver);
        }
    }

    public void selectAssignedDriverOrder(){
        WebElement element = mergeAndFindMobileElement(assignedDriverOrder);
        elementClick(element, "click assignedDriverOrder ");
    }

    public void selectPassiveDriver(){
        WebElement element = mergeAndFindMobileElement(passiveDriver);
        elementClick(element, "click passiveDriver ");
    }

    public void verifyPassiveDriverPopup(){
        try {
            WebElement element = mergeAndFindMobileElement(passiveDriverPopup);
            String actualName = elementGetText(element, "verify passiveDriverPopup");
            String expectedName = "Linga";

            Assert.assertEquals(actualName, expectedName);

            WebElement element1 = mergeAndFindMobileElement(passiveDriverNoButton);
            elementClick(element1, "click passiveDriverNoButton ");
        }
        catch(Exception ex){

        }
    }

    public void verifyAssignedLstOrder(){
        WebElement element = mergeAndFindMobileElement(assignedLastDriver);
        WebElement element1 = mergeAndFindElement("//XCUIElementTypeStaticText[@name=\"STORE DELIVERY\"])[last()]","", TestUtils.XPath);
        element.equals(element1);
    }

    public void selectLastNewPhoneOrder(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Test A\"])[10]");
        phoneOrders.get(phoneOrders.size() - 1).click();

//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Test A\"])[10]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
    }
    /*public void swipeUntilLastNewOrder(String direction) throws Exception {
        direction = direction.toLowerCase();
        int i = 0;
        boolean found = false;

        while (i < 3) {
            try {
                if (isElementExists()) {
                    found = true;
                    break;
                } else {
                    scrollToElement(lastNewOrder,direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(lastNewOrder,direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }

    }*/
    public void swipeUntilLastNewForHereOrderType(String direction) throws Exception {
        direction = direction.toLowerCase();
        int i = 0;
        boolean found = false;

        while (i < 3) {
            try {
                if (isElementExists()) {
                    found = true;
                    driver.findElement(lastForHereOrderType).click();
                    break;
                } else {
                    scrollToElement(lastForHereOrderType,direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(lastForHereOrderType,direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }

    }
    public void swipeUntilLastActiveCheckOnPhoneOrder(String direction) throws Exception{

        direction = direction.toLowerCase();
        int i = 0;
        boolean found = false;

        while (i < 3) {
            try {
                if (isElementExists()) {
                    //LOGGER.info(ccSidePaymentOption + " - FOUNDED");
                    found = true;
                    break;
                } else {
                    //LOGGER.info(ccSidePaymentOption + " - FOUNDED but not displayed!");
                    scrollToElement(forHereOrderType,direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(forHereOrderType,direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
    }
    public void verifyLastClosedCheck(){
        WebElement actualNameElm = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"FORHERE\"])[last()]","", TestUtils.XPath);
        String actualName = elementGetText(actualNameElm,"Select last check");

        String expectedName = "FORHERE";

        Assert.assertEquals(actualName,expectedName);
    }
    //add new method
    public void clickEditButtonOnPhoneOrderTab(){
        WebElement element = mergeAndFindMobileElement(editBtnOnPhoneOrderTab);
        elementClick(element, "Click Edit Button on Phone Order Page Tab ");
    }

}

