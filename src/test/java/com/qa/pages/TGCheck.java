package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TGCheck extends BasePage{
    String accessibilityIdForPin1 = "1";
    String accessibilityIdForPin2 = "2";
    String accessibilityIdForPin3 = "3";
    String accessibilityIdForPin4 = "4";
    String btnLoginXPath = "Login";

    String checkNumber = "";


    String btnDelete="//XCUIElementTypeButton[@name=\"  Delete\"]";

    String btnTextXPath = "//XCUIElementTypeStaticText[@name=\"{0}\"]";

    String btnExitXPath= "  Exit";

    String chkNumber = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]";

    String closedSearchField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField";

    String staticTxtXpath = "//XCUIElementTypeStaticText[@name=\"{0}\"]";

    public By cancelBtn = By.id("Cancel");

    String optCreditCardAmount="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell";

    public void selectFirstClosedCheckForDineInOrderType(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"DineIn\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"DineIn\"])[1]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void selectLastClosedCheckOnTableLayout(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"T1\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"T1\"])[last()]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }

    public void lastPaidOrder(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[last()]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }

    public void verifyVoidLastCheck(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Goknur BATI\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Goknur BATI\"])[last()]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void selectFirstClosedCheck(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"T1\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Göknur BATI\"])[1]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void selectLastClosedCheck(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Goknur BATI\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Goknur BATI\"])[10]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void verifyLastPhoneOrderCheckTotalWithGiftCard(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Phone To Go\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Phone To Go\"])[last()]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
        WebElement element=mergeAndFindMobileElement(voidedPhoneToGoOrderCheckTotal);
        String actualName = elementGetText(element,"Voided Phone To Go Order Check Total");
        String expectedName = "0,00";

        Assert.assertEquals(actualName,expectedName);

    }
    public void clickBarTabOnCheckStatusPage(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(barTabType);
        elementClick(element,"Click BarTab Type");
//        driver.findElement(barTabType).isDisplayed();
//        driver.findElement(barTabType).click();
    }
    public void verifyLastClosedCheckForQSR(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"QSR\"])[last()]"));
        String actualName = elementGetText(element,"Get QSR");
        String expectedName = "QSR";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectLastActiveCheckForDineIn(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView");
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeStaticText[@name=\"Walkin\"]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> activeOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView"));
//
//        for (int index = 0; index < activeOrders.size(); index++) {
//
//            activeOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Walkin\"])[1]"));
//
//            activeOrders.get(activeOrders.size() - 1).click();
//        }
    }
    public void selectLastActiveCheckForBarTab(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
//        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[last()]");
//        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> activeOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < activeOrders.size(); index++) {
//
//            activeOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[5]"));
//
//            activeOrders.get(activeOrders.size() - 1).click();
//        }
        List<WebElement> activeOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Test Automation\"]"));

        activeOrders.get(activeOrders.size() - 1).click();
    }
    public void verifyGiveXChargeAmount(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(giveXChargeAmount);
        String actualName1 = elementGetText(element,"Get GiveX Charge Amount");
        String expectedName1 = "1.000,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyGiveXCardNumber(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(giveXCardNumberOnMenuItemPage);
        String actualName = elementGetText(element,"Get GiveX Card Number On Menu Item Page");
        String expectedName = "GC-603628394562001380850";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyGiveXCardNumberOnOrderSummary(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(giveXCardNumberOnOrderSummary);
        String actualName = elementGetText(element,"Get GiveX Card Number On Order Summary");
        String expectedName = "GCX-603628394562001380850 ";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectLastClosedOrderDetailIcon(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(closedOrderDetailInfoIcon);
        elementClick(element,"Click Closed Order Detail Info Icon");
    }

    public void goToQsrSelectDineInMode(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(barTabChoice);
        elementClick(element,"Click Qsr Button");
        WebElement element1=mergeAndFindMobileElement(barTabChoice);
        elementClick(element,"Click barTab Choice");
    }

//    public void takeOrder(){
//        new TGMenuItemPage().selectMenuItemAndOrder();
//    }

    public void clickCheckStatusTab(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(checkStatusTab);
        elementClick(element,"Click Check Status Tab Button");
    }

    public void clickActiveChecks(){
        WebElement element=mergeAndFindMobileElement(activeCheck);
        elementClick(element,"Click Active Check");
    }

    public void verifyActiveChecks(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(qsrButton);
        String actualName = elementGetText(element,"Click Qsr Button");
        String expectedName = "QSR";
        Assert.assertEquals(actualName, expectedName);
    }
    public void clickClosedChecks(){
        WebElement element=mergeAndFindMobileElement(closedChecks);
        elementClick(element,"Click Closed Check");
    }
    public void verifyClosedChecks(){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(checkDetails);
        elementClick(element,"Click Check Details");
        WebElement element1=mergeAndFindMobileElement(orderSummary);
        String actualName = elementGetText(element1,"Get Order Summary");
        String expectedName = "ORDER SUMMARY";
        Assert.assertEquals(expectedName,actualName);
        WebElement element2=mergeAndFindMobileElement(backToChecks);
        elementClick(element2,"Click back To Checks");
    }
    public void voidOrder(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement element=mergeAndFindMobileElement(voidTab);
        elementClick(element,"Click void Tab");
        WebElement element1=mergeAndFindMobileElement(voidCauseType);
        elementClick(element1,"Click void Cause Type");
        WebElement element2=mergeAndFindMobileElement(addVoidTypeButton);
        elementClick(element2,"Click add Void Type Button");
        /*loginPage = new LoginPage((IOSDriver)driver);
        loginPage.clickCancel();*/
    }
    public void clickVoidChecksTab(){
//        WebElement element=mergeAndFindMobileElement(voidChecksTab);
//        elementClick(element,"Click void Checks Tab");
        findandclickM(voidChecksTab);
    }
    public void verifyVoidChecks(){
        WebElement element=mergeAndFindMobileElement(voidChecksTab);
        elementClick(element,"Click void Checks Tab");
        WebElement element1=mergeAndFindMobileElement(voidCheckDetails);
        elementClick(element1,"Click void Check Details");
        driver.findElement(orderSummary).isDisplayed();
        WebElement element2=mergeAndFindMobileElement(voidCause);
        String actualName = elementGetText(element2,"Get Void cause");
        String expectedName = "*Cold Food";

        Assert.assertEquals(expectedName,actualName);
        WebElement element3=mergeAndFindMobileElement(backToChecks);
        elementClick(element3,"Click Back To Checks");
    }
    public void clickFutureCheckTab(){
        WebElement element=mergeAndFindMobileElement(futureCheckTab);
        elementClick(element,"Click Future Check Tab");
    }
    public void seePopup(){
        WebElement element=mergeAndFindMobileElement(receiptPrinterPopup);
        elementClick(element,"Click Receipt Printer Popup");
    }
    public void selectFirstVoidReason(){
        WebElement element=mergeAndFindMobileElement(firstVoidReason);
        elementClick(element,"Click First Void Reason");
        /*driver.findElement(addVoidTypeButton).isDisplayed();
        driver.findElement(addVoidTypeButton).click();*/
    }
    //daha kullanışlı bir verify method yazılacak
    public void verifyVoidCheckOnVoidTab(){
        WebElement element=mergeAndFindMobileElement(checkTotalOnVoidTab);
        String actualName = elementGetText(element,"Click Check Total On Void Tab");
        String expectedName = "10,00";
        Assert.assertEquals(expectedName,actualName);
    }
    public void selectClosedCheck(){
        WebElement element=mergeAndFindMobileElement(tableOfTabOnClosedCheck);
        elementClick(element,"Click Table Of Tab On Closed Check");

    }
    public void clickReOpenCheck(){
        WebElement element=mergeAndFindMobileElement(reopenCheck);
        elementClick(element,"Click reopenCheck");
    }
    public void verifyNoMorePaymentPopup(){
        WebElement element=mergeAndFindMobileElement(noMorePaymentPopup);
        String actualName = elementGetText(element,"Click No More Payment Popup");
        String expectName = "No More Payment need";
        Assert.assertEquals(actualName,expectName);
        WebElement element1=mergeAndFindMobileElement(noMorePaymentPopupDoneButton);
        elementClick(element1,"Click No More Payment Popup Done Button");
    }
    public void clickOpenCheck(){
        WebElement element=mergeAndFindMobileElement(openCheckButton);
        elementClick(element,"Click Open Check Button");
    }
    public void verifyCheckStatusTab(){
        WebElement element=mergeAndFindMobileElement(checkStatusTab);
        String actualName =elementGetText(element,"Get check Status Tab");
        String expectedName = "Check Stats";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickQsrOption(){
        WebElement element=mergeAndFindMobileElement(qsrOptionOnCheckStatus);
        elementClick(element,"Click Qsr Option On Check Status");
    }
    public void selectLastVoidCheck(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();

        // List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));

//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[last()]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void selectLastVoidCheckForBarTab(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();

//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[last()]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void clickLastVoidCheck(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"30,00\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("((//XCUIElementTypeStaticText[@name=\"30,00\"]))[last()]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void verifySubTotal(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement subTotalElm =mergeAndFindMobileElement(subTotalOnOrderSummary);
        WebElement subTotalBalElm =mergeAndFindMobileElement(subTotalBalanceOnOrderSummary);
        subTotalElm.equals(subTotalBalElm);

        //driver.findElement(subTotalOnOrderSummary).equals(driver.findElement(subTotalBalanceOnOrderSummary));
    }
    public void clickBarTab(){
        WebElement element=mergeAndFindMobileElement(barTabButton);
        elementClick(element,"Click BarTab Button");
    }
    public void clickQSROrderType(){
        WebElement element=mergeAndFindMobileElement(qsrOrderType);
        elementClick(element,"Click Qsr Order Type");
    }
    public void swipeUntilLastBarTabOrder(String direction) throws Exception{

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
                    scrollToElement(lastBarTabOrder,direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(lastBarTabOrder,direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
    }
    public void clickLastClosedBarTabCheck(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("((//XCUIElementTypeStaticText[@name=\"Bar Tab\"]))[last()]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void clickBarTabOrderBillInfoDetailsIcon(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"CheckDetialsIcon\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeButton[@name=\"CheckDetialsIcon\"][last()]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void verifyTotalTaxForTaxExempt(){
        /*String actualName = driver.findElement(totalTaxAmount).getText();
        String expectedName = "TL 0,00";

        Assert.assertEquals(actualName,expectedName);*/
    }
    public void swipeUntilLastClosedCheck(String direction) throws Exception{

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        direction = direction.toLowerCase();
        int i = 0;
        boolean found = false;

        while (i < 5) {
            try {
                if (isElementExists()) {
                    //LOGGER.info(ccSidePaymentOption + " - FOUNDED");
                    found = true;
                    break;
                } else {
                    //LOGGER.info(ccSidePaymentOption + " - FOUNDED but not displayed!");
                    scrollToElement(closedCheckDetailIcon,direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(closedCheckDetailIcon,direction);
                i++;
                if (i == 5)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
    }
    public void verifyLastVoidedOrderWithTip(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("((//XCUIElementTypeStaticText[@name=\"Bar Tab\"]))[last()]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void selectLastCheckWithPaidCCSideOnClosedTab(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"T1\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"T1\"])[last()]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void verifyLastClosedCheckOnClosedCheckTab(){
        String actualName = driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Dine In\"])[last()]")).getText();
        String expectedName = "Dine In";

        Assert.assertEquals(actualName,expectedName);
    }
    public void swipeUntilLastVoidedOrderWithBarTab(String direction) throws Exception {
        direction = direction.toLowerCase();
        int i = 0;
        boolean found = false;

        while (i < 3) {
            try {
                if (isElementExists()) {
                    found = true;
                    break;
                } else {
                    scrollToElement(voidedCheckOnBarTab,direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(voidedCheckOnBarTab,direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
    }

    public void logInWithValidPin(){
        WebElement pin1 = mergeAndFindElement(accessibilityIdForPin1,"", TestUtils.Accessibility);
        WebElement pin2 = mergeAndFindElement(accessibilityIdForPin2,"",TestUtils.Accessibility);
        WebElement pin3 = mergeAndFindElement(accessibilityIdForPin3,"",TestUtils.Accessibility);
        WebElement pin4 = mergeAndFindElement(accessibilityIdForPin4,"",TestUtils.Accessibility);
        WebElement btnLogin = mergeAndFindElement(btnLoginXPath,"",TestUtils.Accessibility);
        elementClick(pin1,"Tapped pin1");
        elementClick(pin2,"Tapped pin2");
        elementClick(pin3,"Tapped pin3");
        elementClick(pin4,"Tapped pin4");
        elementClick(btnLogin,"Tapped Login.");
    };

    public void commonAccessibilityId(String id,String msg){
//        WebElement element = mergeAndFindElement(id, "", TestUtils.Accessibility);
//        elementClick(element,msg);
        findandclick(id, "", TestUtils.Accessibility);
    }

    public void clickQsrOrderType(){
        WebElement element = mergeAndFindMobileElement(qsrOption);
        elementClick(element,"Click qsrOption");
    }

    public void selectDineInOrderType(){
        WebElement element = mergeAndFindMobileElement(dineInOrderType);
        elementClick(element,"Select DineIn OrderType");
    }

    public void clickBtnPayment(String btnPayment, String msg){
//        WebElement element = mergeAndFindElement(btnTextXPath, btnPayment,TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnTextXPath, btnPayment,TestUtils.XPath);
    }

    public void clickFoodTab(){
        WebElement element = mergeAndFindMobileElement(foodTab);
        elementClick(element,"Click FoodTab");
    }

    public void takeOrder(){
        WebElement element = mergeAndFindMobileElement(foodTab);
        elementClick(element,"Select MenuItem And Order");

        WebElement element1 = mergeAndFindMobileElement(firstMenuItem);
        elementClick(element1,"Select MenuItem And Order");

        WebElement element2 = mergeAndFindMobileElement(orderButton);
        elementClick(element2,"Click Order");
    }

    public void getCheckNumber(String msg)
    {
        WebElement element = mergeAndFindElement(chkNumber, "", TestUtils.XPath);
        checkNumber =elementGetText(element,"test");
        utils.log().info(msg + " - " +checkNumber);
    }

    public void commonBtnClickOption(String optionName, String msg) {
//        WebElement element = mergeAndFindElement(optionName, "",TestUtils.Accessibility);
//        elementClick(element, msg);
        findandclick(optionName, "",TestUtils.Accessibility);
    }

    public void commonBtnClick(String btnName, String msg){
//        WebElement element = mergeAndFindElement(btnName, "",TestUtils.Accessibility);
//        elementClick(element, msg);
        findandclick(btnName, "",TestUtils.Accessibility);
    }

    public void passCheckNumber(){
        try {
            // wait 1 sec
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            // handling InterruptedException
        }
        WebElement searchElement = mergeAndFindElement(closedSearchField, "", TestUtils.XPath);
        searchElement.click();
        searchElement.sendKeys(checkNumber);
//        findandclick_Skeys(closedSearchField, "", TestUtils.XPath,"Skeys",checkNumber);
//        WebElement tableElement = mergeAndFindElement(checkNumber,"" , TestUtils.Accessibility);
//        tableElement.click();
        findandclick(checkNumber,"" , TestUtils.Accessibility);
    }

    public boolean getVoidCheck(String msg) {
        WebElement element = mergeAndFindElement(staticTxtXpath, checkNumber, TestUtils.XPath);
        Boolean isDisplayed = false;
        if (element.isDisplayed()) {
            isDisplayed = true;
        }
        utils.log().info(msg + " is " + isDisplayed);
        return isDisplayed;
    }

    public void clickCashButton(){
        WebElement element = mergeAndFindMobileElement(cashButtonOnMenuItem);
        elementClick(element,"Click Cash Button");
    }

    public void clickExactButtonOnCashTab(){

        WebElement element=mergeAndFindMobileElement(exactButton);
        elementClick(element,"Exact Button Clicked");
    }
    public void clickEnterButtonOnCashButton(){
        WebElement element1=mergeAndFindMobileElement(enterButton);
        elementClick(element1,"Enter Button Clicked");
    }

    public void pressCancel() {
//        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
//        WebElement element = mergeAndFindMobileElement(cancelBtn);
//        elementClick(element,"Cancel button is clicked");

        findandclickM(cancelBtn);
//        elementClick(cancelBtn, "Cancel button is clicked");
    }

    public void clickVoidButton(){
        WebElement element = mergeAndFindMobileElement(voidButton);
        elementClick(element,"Click Void Button");
    }

    public void clickAddVoidReasonButton(){
        WebElement element = mergeAndFindMobileElement(addVoidReasonButton);
        elementClick(element,"Click Add VoidReason");
    }

    public void clickModifierDoneButton(){
        WebElement element = mergeAndFindMobileElement(modifierDoneButton);
        elementClick(element,"Click Modifier Done Button");
    }

    public void clickPaymentButtonOnMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(paymentButtonOnMenuItemPage);
        elementClick(element,"Click Payment Button On MenuItem Page");
    }

    public void clickCashButton1(){
        WebElement element = mergeAndFindMobileElement(cashButton);
        elementClick(element, "click cashButton ");
    }

    public void clickOptCreditCardAmount(String msg) {
//        WebElement element = mergeAndFindElement(optCreditCardAmount, "", TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(optCreditCardAmount, "", TestUtils.XPath);
    }

    public void clickBtnDelete(String msg){
//        WebElement element = mergeAndFindElement(btnDelete, "", TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(btnDelete, "", TestUtils.XPath);
    }

    public void ClickBtnOk(String btnOk, String msg){
//        WebElement element = mergeAndFindElement(btnOk, "",TestUtils.Accessibility);
//        elementClick(element,msg);
        findandclick(btnOk, "",TestUtils.Accessibility);
    }

    public void ClickBtnExit(String msg){
//        WebElement element = mergeAndFindElement(btnExitXPath, "",TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(btnExitXPath, "",TestUtils.Accessibility);
    }

    public void clickAllTab(){
        WebElement tabAll = mergeAndFindMobileElement(allOptions);
        elementClick(tabAll,"Click All Tab");
    }

    public void clickLogOffButton(){
        WebElement element = mergeAndFindMobileElement(logOffButton);
        elementClick(element,"Click LogOff Button");
    }

}
