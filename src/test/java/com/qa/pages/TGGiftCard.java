package com.qa.pages;

import com.qa.utils.TestUtils;

import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static com.qa.utils.TestUtils.driver;

public class TGGiftCard extends BasePage{




    public void clickGiveXDoneButton(){
        WebElement element = mergeAndFindMobileElement(giftCardDoneButton);
        elementClick(element, "click giftCardDoneButton ");
    }
    public void verifyRecurringBalanceIsAddedFromTheBeginningBalanceWithEnteredAmount(){

        int chargeAmount=100;

        Integer.parseInt(driver.findElement(By.id(beginningAmount)).getText());

        ArrayList<Integer> beginningBalance = new ArrayList<>();

        for (int i = 0; i < beginningBalance.size(); i++) {

            Integer.parseInt(driver.findElement(By.id(recurringAmount)).getText());

            int recurringBalance = Integer.parseInt(driver.findElement(By.id(beginningAmount)).getText()) + chargeAmount;
            Assert.assertEquals(recurringBalance,"recurring balance: ");

        }

    }

    public void verifyActivateInfoMessage(){
        WebElement element = mergeAndFindMobileElement(giveXactivateMessage);
        String actualName = elementGetText(element,"value");
        String expectedName = "Cert already active on 2021-09-23";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(doneButton);
        elementClick(element1, "click doneButton ");
    }

    public void verifyGivXCardScreen(){
        WebElement element = mergeAndFindMobileElement(giveXHeader);
        String actualName = elementGetText(element,"value");
        String expectedName = "GiveX";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyChangingRecurringBalance(){

        String lastBeginningBalance =mergeAndFindMobileElement("//XCUIElementTypeStaticText[@name=\"TL 9.389,99\"]").getText();
        String firstRecurringBalance = mergeAndFindMobileElement("//XCUIElementTypeStaticText[@name=\"TL 9.489,99\"]").getText();

        String chargeAmount = mergeAndFindMobileElement(("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField")).getText();

        if(Integer.parseInt(lastBeginningBalance) <= Integer.parseInt(firstRecurringBalance) ){

            int newBeginningBalance= Integer.parseInt(firstRecurringBalance) + Integer.parseInt(chargeAmount);
            System.out.printf("New Beginning Balance: " + newBeginningBalance);
        }
    }
    public void verifyIfSuspendAccountToggleIsShown(){
        WebElement element = driver.findElement(By.xpath(giftActivateInactivateToggle));
        String value=getAttribute(element,"value");

        if (value.contains("0")) {
            WebElement element2 =driver.findElement(By.xpath(activateAccountToggleText));
            element2.isDisplayed();

            WebElement element1 = driver.findElement(By.xpath(giftActivateInactivateToggle));
            elementClick(element1, "click giftActivateInactivateToggle ");
            //toggle activate oldu
        } else if (value.contains("1")) {
            WebElement element1 = driver.findElement(By.xpath(suspendAccountToggleText));
            String actualName=elementGetText(element1,"suspendAccountToggleText");

            String expectedName = "Suspend Account";

            Assert.assertEquals(actualName,expectedName);
            //toggle inactivate oldu
        }
    }
    public void verifyGiveXOption(){
        WebElement element1 = mergeAndFindMobileElement(giveXButton);
        String actualName=elementGetText(element1,"verify giveXButton");

        String expectedName = "GiveX";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyEnterTheChargeAmountInfoPopup(){
        WebElement element1 = mergeAndFindMobileElement(enterChargeAmountWarningPopup);
        String actualName=elementGetText(element1,"verify enterChargeAmountWarningPopup");

        String expectedName = "Enter charge amount";

        Assert.assertEquals(actualName,expectedName);

        try{
            WebElement element2 = driver.findElement(By.xpath("(//button[contains(.,' Done ')])[2]"));
            element2.click();
            utils.log().info("Done Button");
        }catch (Exception w){

        }
    }
    public void verifyGiftCardActivatedSuccessfullyInfoPopup(){
        WebElement element1 = mergeAndFindMobileElement(activatedSuccessfullyInfoPopup);
        String actualName=elementGetText(element1,"verify activatedSuccessfullyInfoPopup");

        String expectedName = "Cert already active on 2021-06-01";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyPreviousBeginningBalanceForGiveXCard(){
        WebElement element1 = mergeAndFindMobileElement(beginningBalanceTex);
        String actualName=elementGetText(element1,"verify activatedSuccessfullyInfoPopup");

        String expectedName = "Beginning Balance :";

        Assert.assertEquals(actualName,expectedName);

        /*String actualName1 = driver.findElement(previousBeginningBalanceAmount).getText();
        String expectedName1 = "TL 1.256,74";

        Assert.assertEquals(actualName1,expectedName1);*/
    }
    public void verifyNewRecurringBalanceOfGiveXCardAfterRecharge(){
        WebElement element1 = mergeAndFindMobileElement(recurringBalanceText);
        String actualName=elementGetText(element1,"verify recurringBalanceText");

        String expectedName = "Recurring Balance :";

        Assert.assertEquals(actualName,expectedName);

       /* String actualName1 = driver.findElement(newRecurringBalanceAmountAfterRecharge).getText();
        String expectedName1 = "TL 3.000,00";

        Assert.assertEquals(actualName1,expectedName1);*/
    }
    public void clickGiveXCancelButton(){
        WebElement element1 = mergeAndFindMobileElement(giftCardCancelButton);
        elementClick(element1, "click giftCardCancelButton ");
    }
    public void enterGiveXRechargeAmount(){
        WebElement element = mergeAndFindMobileElement(giveXChargeAmountText);
        elementClick(element, "click giveXChargeAmountText ");

        WebElement element1 = mergeAndFindMobileElement(numberFive);
        elementClick(element1, "click numberFive ");

        WebElement element2 = mergeAndFindMobileElement(numberDoubleZero);
        elementClick(element2, "click numberDoubleZero ");
        elementClick(element2, "click numberDoubleZero ");

        WebElement element3 = mergeAndFindMobileElement(continueGiftCart);
        elementClick(element3, "click continueGiftCart ");
    }

    public void verifyBeginningBalanceForGiveXCard(){
        WebElement element = mergeAndFindMobileElement(beginningBalanceTex);
        String actualName=elementGetText(element,"verify beginningBalanceTex");
        String expectedName = "Beginning Balance :";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(beginningBalanceAmount);
        String actualName1=elementGetText(element1,"verify beginningBalanceAmount");
        String expectedName1 = "TL 0,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyBeginningBalanceAndRecurringBalanceAmount(){
        WebElement element = mergeAndFindMobileElement(beginningBalanceTex);
        String actualName=elementGetText(element,"verify beginningBalanceTex");
        String expectedName = "Beginning Balance :";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(beginningBalanceAmount);
        String actualName1=elementGetText(element1,"verify beginningBalanceAmount");
        String expectedName1 = "TL 0,00";

        Assert.assertEquals(actualName1,expectedName1);
    }
    public void verifyRecurringBalanceForGiveXCard(){
        WebElement element = mergeAndFindMobileElement(recurringBalanceText);
        String actualName=elementGetText(element,"verify recurringBalanceText");
        String expectedName = "Recurring Balance :";

        Assert.assertEquals(actualName,expectedName);
/*
        String actualName1 = driver.findElement(recurringBalanceAmount).getText();
        String expectedName1 = "TL 2.000,00";

        Assert.assertEquals(actualName1,expectedName1);*/

    }
    public void verifyRecurringBalanceForGiveXCardAfterRecharge(){
        WebElement element = mergeAndFindMobileElement(recurringBalanceText);
        String actualName=elementGetText(element,"verify recurringBalanceText");
        String expectedName = "Recurring Balance :";

        Assert.assertEquals(actualName,expectedName);

       /* String actualName1 = driver.findElement(recurringBalanceAmountAfterRecharge).getText();
        String expectedName1 = "TL 3.000,00";

        Assert.assertEquals(actualName1,expectedName1);
*/
    }
    public void enterGiveXChargeAmount(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(giveXChargeAmountText);
        elementClick(element, "click giveXChargeAmountText ");

        WebElement element1 = mergeAndFindMobileElement(BtnNumberOne);
        elementClick(element1, "click numberOne ");

        WebElement element2 = mergeAndFindMobileElement(numberDoubleZero);
        elementClick(element2, "click numberDoubleZero ");
        elementClick(element2, "click numberDoubleZero ");

        WebElement element3 = mergeAndFindMobileElement(numberZero);
        elementClick(element3, "click numberZero ");

        WebElement element4 = mergeAndFindMobileElement(continueGiftCart);
        elementClick(element4, "click continueGiftCart ");

    }
    public void enterGiveXCardNumberOnPaymentPage(){

        WebElement element = mergeAndFindMobileElement(giveXCardNumberTextOnPayment);
        elementClick(element, "click giveXCardNumberTextOnPayment ");
        element.sendKeys("603628237912001380863");
//        driver.hideKeyboard();
    }
    public void enterGiveXCardNumber() {

        WebElement element = mergeAndFindMobileElement(giveXCardNumberTextField);
        elementClick(element, "click giveXCardNumberTextField ");

        WebElement element6 = mergeAndFindMobileElement(giftCardNumberSix);
        elementClick(element6, "click numberSix ");

        WebElement element0 = mergeAndFindMobileElement(numberZero);
        elementClick(element0, "click numberZero ");

        WebElement element3 = mergeAndFindMobileElement(numberThree);
        elementClick(element3, "click numberThree ");

        elementClick(element6, "click numberSix ");



        WebElement element2 = mergeAndFindMobileElement(numberTwo);
        elementClick(element2, "click numberTwo ");

        WebElement element8 = mergeAndFindMobileElement(numberEight);
        elementClick(element8, "click numberEight ");

        elementClick(element2, "click numberTwo ");

        elementClick(element3, "click numberThree ");



        WebElement element7 = mergeAndFindMobileElement(numberSeven);
        elementClick(element7, "click numberEight ");

        WebElement element9 = mergeAndFindMobileElement(numberNine);
        elementClick(element9, "click numberNine ");

        WebElement element1 = mergeAndFindMobileElement(BtnNumberOne);
        elementClick(element1, "click numberOne ");

        elementClick(element2, "click numberTwo ");




//        WebElement element4 = mergeAndFindMobileElement(numberFour);
//        elementClick(element4, "click numberFour ");
//
//        WebElement element5 = mergeAndFindMobileElement(numberFive);
//        elementClick(element5, "click numberFive ");
//
//        elementClick(element6, "click numberSix ");

//        elementClick(element2, "click numberTwo ");

        elementClick(element0, "click numberZero ");

        elementClick(element0, "click numberZero ");


        elementClick(element1, "click numberOne ");

        elementClick(element3, "click numberThree ");

        elementClick(element8, "click numberEight ");



        elementClick(element0, "click numberZero ");

        elementClick(element8, "click numberEight ");

//        elementClick(element5, "click numberFive ");
        elementClick(element6, "click numberSix ");

        elementClick(element3, "click numberThree ");
//        elementClick(element0, "click numberZero ");

        WebElement elementContinueGiftCart = mergeAndFindMobileElement(continueGiftCart);
        elementClick(elementContinueGiftCart, "click continueGiftCart ");

    }

    public void selectGiveXOption(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(giveXButton);
        elementClick(element, "click giveXButton ");
    }

    public void verifyGiftCardScreen(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(giftCardScreenTitle);
        String actualName=elementGetText(element,"verify title");

        String expectedName = "Gift Card";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyDisableGiveX(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(disableGiveX));
     if(element.isSelected()){
         utils.log().info("It's Enabled");
         int w = 1/0;
     }else{
         utils.log().info("It's Disabled");
     }
    }
    public void clickGiftCardDoneButton(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(giftCardDoneButton);
        elementClick(element, "click giftCardDoneButton ");
    }
    public void openActivateAccountToggleIfDisable(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(giftActivateInactivateToggle));
        String value=getAttribute(element,"value");
        utils.log().info(value);
        if (value.contains("0")) {
            WebElement element1 = driver.findElement(By.xpath(giftActivateInactivateToggle));
            elementClick(element1, "click giftActivateInactivateToggle ");

        }

    }
    public void openActivateAccountToggleIfDisableForGiveX(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element1 = mergeAndFindMobileElement(giftActivateInactivateToggle);
        String value=getAttribute(element1,"value");

        if (value.contains("0")) {
//            WebElement element2 = mergeAndFindMobileElement(activateAccountToggleText);
//            element2.isDisplayed();

            WebElement element = mergeAndFindMobileElement(giftActivateInactivateToggle);
            elementClick(element, "click giftActivateInactivateToggle ");

            //toggle activate oldu
        }
//        else if (value.contains("1")) {
//            WebElement element2 = mergeAndFindMobileElement(activateAccountToggleText);
//            element2.isDisplayed();

            //driver.findElement(giftActivateInactivateToggle).click();
            //toggle inactivate oldu
        //}
    }

    public void clickSuspendAccountToggle(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(suspendAccountToggle);
        elementClick(element, "click suspendAccountToggle ");
    }

    public void clickActivateAccountToggle(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(activateAccountToggle);
        elementClick(element, "click activateAccountToggle ");
    }

    public void missingChargeAmount(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(missingChargeAmountWarning);
        String actualName=elementGetText(element,"verify missingChargeAmountWarning");

        String expectedName = "Enter charge amount";

        Assert.assertEquals(actualName,expectedName);
    }

    public void missingGiftCardWarningPopup(){
        WebElement element = mergeAndFindMobileElement(missingGiftCardNumber);
        String actualName=elementGetText(element,"verify missingGiftCardNumber");

        String expectedName = "Enter gift card number";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(warningPopupDoneButton);
        elementClick(element1, "click warningPopupDoneButton ");
    }

    public void giftCardChargeAmount(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(giftCardChargeAmountText));
        elementClick(element, "click giftCardChargeAmountText ");

        WebElement element1 = driver.findElement(By.xpath(BtnNumberOne));
        elementClick(element1, "click numberOne ");

        WebElement element0 = driver.findElement(By.xpath(numberZero));
        elementClick(element0, "click numberZero ");

        elementClick(element0, "click numberZero ");

        elementClick(element0, "click numberZero ");

        WebElement elementContinueGiftCart = driver.findElement(By.xpath(continueGiftCart));
        elementClick(elementContinueGiftCart, "click continueGiftCart ");

    }

    public void giftCardCancelButton(){
        WebElement element1 = mergeAndFindMobileElement(giftCardCancelButton);
        elementClick(element1, "click giftCardCancelButton ");
    }

    public void verifyGiftCardBalance(){
        WebElement element = mergeAndFindMobileElement(giftCardName);
        String actualName=elementGetText(element,"verify giftCardName");

        String expectedName = "GC-1000 ";

        Assert.assertEquals(actualName,expectedName);
    }
    public void enterGiftCardCardNumber(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(giftCardCardNumberText);
        elementClick(element, "click giftCardCardNumberText ");

        WebElement element1 = mergeAndFindMobileElement(BtnNumberOne);
        elementClick(element1, "click numberOne ");

        WebElement element2 = mergeAndFindMobileElement(numberTwo);
        elementClick(element2, "click numberTwo ");

        WebElement element3 = mergeAndFindMobileElement(numberThree);
        elementClick(element3, "click numberThree ");

        WebElement element4 = mergeAndFindMobileElement(numberFour);
        elementClick(element4, "click numberFour ");

        WebElement element5 = mergeAndFindMobileElement(numberFive);
        elementClick(element5, "click numberFive ");

//        WebElement element6 = mergeAndFindMobileElement(numberSix);
//        elementClick(element6, "click numberSix ");
//
//        WebElement element7 = mergeAndFindMobileElement(numberSeven);
//        elementClick(element7, "click numberSeven ");
//
//        WebElement element8 = mergeAndFindMobileElement(numberEight);
//        elementClick(element8, "click numberEight ");
//
//        WebElement element9 = mergeAndFindMobileElement(numberNine);
//        elementClick(element9, "click numberNine ");
//
//        WebElement element0 = mergeAndFindMobileElement(numberZero);
//        elementClick(element0, "click numberZero ");

        WebElement elementContinueGiftCart = mergeAndFindMobileElement(continueGiftCart);
        elementClick(elementContinueGiftCart, "click continueGiftCart ");

        //driver.findElement(giftCardDoneButton).click();
    }

    public void enterGiftCardNumberOnCheckOption(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(giftCardNumberTextOnCheckOption);
        elementClick(element, "click giftCardNumberTextOnCheckOption ");

        WebElement element1 = mergeAndFindMobileElement(numberOne);
        elementClick(element1, "click numberOne ");

        WebElement element2 = mergeAndFindMobileElement(numberTwo);
        elementClick(element2, "click numberTwo ");

        WebElement element3 = mergeAndFindMobileElement(numberThree);
        elementClick(element3, "click numberThree ");

        WebElement element4 = mergeAndFindMobileElement(numberFour);
        elementClick(element4, "click numberFour ");

        WebElement element5 = mergeAndFindMobileElement(numberFive);
        elementClick(element5, "click numberFive ");

        WebElement element6 = mergeAndFindMobileElement(numberSix);
        elementClick(element6, "click numberSix ");

        WebElement element7 = mergeAndFindMobileElement(numberSeven);
        elementClick(element7, "click numberSeven ");

        WebElement element8 = mergeAndFindMobileElement(numberEight);
        elementClick(element8, "click numberEight ");

        WebElement element9 = mergeAndFindMobileElement(numberNine);
        elementClick(element9, "click numberNine ");

        WebElement element0 = mergeAndFindMobileElement(numberZero);
        elementClick(element0, "click numberZero ");

        WebElement elementContinueGiftCart = mergeAndFindMobileElement(continueGiftCart);
        elementClick(elementContinueGiftCart, "click continueGiftCart ");

    }

    public void giftCardInactivatePopup(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(giftCardInactivateText);
        elementGetText(element,"verify giftCardInactivateText");

        WebElement element0 = mergeAndFindMobileElement(inactivateGiftCardDoneButton);
        elementClick(element0, "click inactivateGiftCardDoneButton ");
    }

    public void giftCardActivatePopup(){
        WebElement element = mergeAndFindMobileElement(giftCardActivateText);
        elementGetText(element,"verify giftCardActivateText");
        WebElement element0 = mergeAndFindMobileElement(inactivateGiftCardDoneButton);
        elementClick(element0, "click inactivateGiftCardDoneButton ");
    }

    public void verifyDeletedCardNumber(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(giftCardNumberTextField);
        String actualName=elementGetText(element,"verify giftCardNumberTextField");
        String expectedName = "XXXXXXXXXXXXXXXX";

        Assert.assertEquals(actualName,expectedName);

    }
    //nov 19
    public void verifyCreditCardTxtField() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='XXXXXXXXXXXXXXXX']"));
        String actualName =element.getText();
//        String actualName=elementGetText(element,"verify giftCardNumberTextField");
        String expectedName = "XXXXXXXXXXXXXXXX";

        Assert.assertEquals(actualName,expectedName);

    }

    public void enterGiveXRechargeAmount1(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(giveXChargeAmountText);
        elementClick(element, "click giveXChargeAmountText ");

        WebElement element1 = mergeAndFindMobileElement(numberOne1);
        elementClick(element1, "click numberFive ");

        WebElement element2 = mergeAndFindMobileElement(numberDoubleZero);
        elementClick(element2, "click numberDoubleZero ");
        elementClick(element2, "click numberDoubleZero ");

        findandclickM(By.id("0"));

        WebElement element3 = mergeAndFindMobileElement(continueGiftCart);
        elementClick(element3, "click continueGiftCart ");
    }

    public void giftCardChargeAmount1(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement element = mergeAndFindMobileElement(giftCardChargeAmountText);
        elementClick(element, "click giftCardChargeAmountText ");

        WebElement element1 = mergeAndFindMobileElement(numberTwo);
        elementClick(element1, "click numberOne ");

        WebElement element00 = mergeAndFindMobileElement(numberDoubleZero);
        elementClick(element00, "click numberDoubleZero ");

        elementClick(element00, "click numberDoubleZero ");

        elementClick(element00, "click numberDoubleZero ");

        WebElement elementContinueGiftCart = mergeAndFindMobileElement(continueGiftCart);
        elementClick(elementContinueGiftCart, "click continueGiftCart ");

    }

}
