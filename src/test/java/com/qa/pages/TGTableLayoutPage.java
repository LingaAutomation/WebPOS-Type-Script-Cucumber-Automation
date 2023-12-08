package com.qa.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TGTableLayoutPage extends BasePage {

    public By yesOptionForRemoveDiscount = By.id("Yes");

    public void selectMergedCheckOnTableLayout(){
        WebElement element = mergeAndFindMobileElement(firstMergedCheck);
        elementClick(element, "click firstMergedCheck");
    }

    public void selectSecondActiveTableCheck(){
        WebElement element = mergeAndFindMobileElement(secondActiveTable);
        elementClick(element, "click secondActiveTable");

        WebElement element1 = mergeAndFindMobileElement(yesButton);
        elementClick(element1, "click yesButton");
    }

    public void selectFirstActiveTableCheck(){
        WebElement element = mergeAndFindMobileElement(firstActiveTable);
        elementClick(element, "click firstActiveTable");

        WebElement element1 = mergeAndFindMobileElement(yesButton);
        elementClick(element1, "click yesButton");
    }

    public void selectLastCheckIfHasMoreThanOneCheck(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"T1\"])[1]");
        phoneOrders.get(phoneOrders.size() - 1).click();
        findandclickM(yesOptionForRemoveDiscount);



//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"T1\"])[1]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void selectTableWhichHasMoreThanOneSeat(){
        WebElement element = mergeAndFindMobileElement(tableHasMoreThanOneSeat);
        elementClick(element, "click tableHasMoreThanOneSeat");
    }

    public void clickSplitButton(){
        WebElement element = mergeAndFindMobileElement(tableLayout);
        element.isDisplayed();

        WebElement element1 = mergeAndFindMobileElement(splitButton);
        elementClick(element1, "click splitButton");
    }

//    public void clickSplitCheckOption(){
//        WebElement element = mergeAndFindMobileElement(splitCheckOption);
//        elementClick(element, "click splitCheckOption");
//    }
    public void clickSplitCheckOption(){
        WebElement element = mergeAndFindMobileElement(splitCheckOption);
        elementClick(element, "click splitCheckOption");
    }

    public void selectTableForSplit(){
        WebElement element = mergeAndFindMobileElement(firstTable);
        elementClick(element, "click firstTable");
    }

//    public void clickSplitBySeatOption(){
//        WebElement element = mergeAndFindMobileElement(splitBySeatButtonOnTableLayout);
//        elementClick(element, "click splitBySeatButtonOnTableLayout");
//    }

    public void clickSplitBySeatOption(){
//        nov 19
        WebElement element = mergeAndFindMobileElement(splitBySeatOption);
        elementClick(element, "click splitBySeatButtonOnTableLayout");
    }

    public void clickSplitBySeatInTablelayout(){
//        nov 19
        WebElement element = mergeAndFindMobileElement(splitBySeatButtonOnTableLayout);
        elementClick(element, "click splitBySeatButtonOnTableLayout");
    }

    public void verifyEmptyTable(){
        WebElement element = mergeAndFindMobileElement(firstTable);
        elementClick(element, "click firstTable");
        //select seat number on calculator
        /*driver.findElement().isDisplayed();
        driver.findElement().click();*/

        WebElement element1 = mergeAndFindMobileElement(emptyCheck);
        String actualName=elementGetText(element1,"value");
        String expectedName = "No orders to display";
        Assert.assertEquals(actualName,expectedName);
    }

    public void closePrinterInfoPopup(){
        WebElement element1 = mergeAndFindMobileElement(printerPopupInfo);
        element1.isDisplayed();

        WebElement element = mergeAndFindMobileElement(receiptPrinterDoneButton);
        elementClick(element, "click receiptPrinterDoneButton");
    }

    public void selectSecondTableForMerge(){
        WebElement element = mergeAndFindMobileElement(secondTable);
        elementClick(element, "click secondTable");
    }

    public void clickMergeButton(){
        WebElement element = mergeAndFindMobileElement(mergeButton);
        elementClick(element, "click mergeButton");
    }

    public void selectTablesForMerge(){
        try {
            WebElement element1 = mergeAndFindMobileElement(firstTable2);
            elementClick(element1, "click firstTable");

            WebElement element = mergeAndFindMobileElement(secondTable2);
            elementClick(element, "click secondTable");
        }
        catch(Exception e){
            utils.log().info("tables not clicked");
        }
    }

    public void clickMergeDoneButton(){
        try {
            WebElement element1 = mergeAndFindMobileElement(mergeDoneButton);
            elementClick(element1, "click mergeDoneButton");

        }
        catch(Exception e){
            utils.log().info("merge done button not clicked");
        }
    }

    public void closeMergedTablePopup(){
        WebElement element = mergeAndFindMobileElement(mergedTablesPopup);
        elementClick(element, "click mergedTablesPopup");

        WebElement element1 = mergeAndFindMobileElement(doneMergeButton);
        elementClick(element1, "click doneMergeButton");
    }

    public void clickOperationButton(){
        WebElement element = mergeAndFindMobileElement(tableLayout);
        elementClick(element, "click tableLayout");

        WebElement element1 = mergeAndFindMobileElement(operationButton);
        elementClick(element1, "click operationButton");
    }

    public void clickPayCheckButton(){
        WebElement element = mergeAndFindMobileElement(payCheckButton);
        elementClick(element, "click payCheckButton");
    }

    public void selectSecondTable(){
        WebElement element = mergeAndFindMobileElement(tableNoTwo);
        elementClick(element, "click tableNoTwo");
    }

    public void enterSeatNumber(){
        WebElement element = mergeAndFindMobileElement(numberOne);
        elementClick(element, "click numberOne");

        WebElement element1 = mergeAndFindMobileElement(calculatorContinueButton);
        elementClick(element1, "click calculatorContinueButton");
    }
    //nov 19
    public void clickSelectedTable(){
        WebElement element1 = mergeAndFindMobileElement(firstTable11);
        elementClick(element1, "click firstTable");
    }

    public void selectFirstSeatForMerge(){
        WebElement element = mergeAndFindMobileElement(secondTable);
        elementClick(element, "click secondTable");
    }
    public void selectSplitCheckItem(){
        WebElement element=mergeAndFindMobileElement(splitedOrderForFirstCheck);
        elementClick(element, "click Sandwiches");
    }
    public void selectSixthTable(){
        WebElement element = mergeAndFindMobileElement(tableNoSix);
        elementClick(element, "click tableNoSix");
    }

}


