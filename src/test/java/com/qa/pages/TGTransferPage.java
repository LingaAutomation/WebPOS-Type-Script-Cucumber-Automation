package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TGTransferPage extends BasePage {

    public void verifyTransferScreen(){
        WebElement element=mergeAndFindMobileElement(transferToServerButton);
        String actualName = elementGetText(element,"verify transferToServerButton");
        String expectedName = "Transfer to Server";

        Assert.assertEquals(expectedName,actualName);
    }

    public void clickTransferToServerButton(){
        WebElement element=mergeAndFindMobileElement(transferToServerButton);
        elementClick(element,"click transferToServerButton");
    }

    public void verifyTransferToServerPage(){
        WebElement element=mergeAndFindMobileElement(transferToServerButton);
        String actualName = elementGetText(element,"verify transferToServerButton");
        String expectedName = "Transfer to Server";

        Assert.assertEquals(expectedName,actualName);
    }

    public void selectServerWhichTransferFrom(){
        WebElement element=mergeAndFindMobileElement(serverOne);
        elementClick(element,"click serverOne");
    }

    public void selectBarTabOrderWhichTransfer(){
        WebElement element=mergeAndFindMobileElement(checkWillBeTransferredOnBarTab);
        elementClick(element,"click checkWillBeTransferredOnBarTab");
    }

    public void selectServerWhichTransferTo(){
        WebElement element=mergeAndFindMobileElement(serverTwo);
        elementClick(element,"click serverTwo");
    }

    public void userContinueIfServerClosed(){
        String infoMessage = "Employee is offline Still Do you want to continue";

        if(infoMessage=="Employee is offline Still Do you want to continue"){
            WebElement element=mergeAndFindMobileElement(yesButton);
            elementClick(element,"click yesButton");
        }
        else {
            WebElement element=mergeAndFindMobileElement(serverTwo);
            String actualName = elementGetText(element,"verify serverTwo");
            String expectedName = "Karthick T";

            Assert.assertEquals(actualName,expectedName);
        }

    }
    public void verifyTransferSuccessPopup(){
        WebElement element=mergeAndFindMobileElement(transferSuccessMessage);
        String actualName = elementGetText(element,"verify transferSuccessMessage");
        String expectedName = "Transferred Successfully";

        Assert.assertEquals(actualName,expectedName);


        WebElement element1=mergeAndFindMobileElement(doneButton);
        elementClick(element1,"click doneButton");
    }

    public void clickTransferDoneButton(){
        WebElement element1=mergeAndFindMobileElement(doneButton);
        elementClick(element1,"click doneButton");

        WebElement element=mergeAndFindMobileElement(yesButton);
        elementClick(element,"click yesButton");
    }

    public void selectTransferItemButton(){
        WebElement element1=mergeAndFindMobileElement(transferItemButton);
        elementClick(element1,"click transferItemButton");
    }

    public void selectBarTabOrderForTransferMenuItem(){
        WebElement element1=mergeAndFindMobileElement(barTabOrderForTransfer);
        elementClick(element1,"click barTabOrderForTransfer");
    }

    public void selectMenuItemWhichIsTransferred(){
        WebElement element1=mergeAndFindMobileElement(menuItemForTransfer);
        elementClick(element1,"click menuItemForTransfer");
    }

    public void selectBarTabWhichMenuItemTransferredTo(){
        WebElement element1=mergeAndFindMobileElement(barTabWillBeTransferTo);
        elementClick(element1,"click barTabWillBeTransferTo");
    }

    public void clickTransferToTableButton(){
        WebElement element1=mergeAndFindMobileElement(transferToTableButton);
        elementClick(element1,"click transferToTableButton");
    }

    public void selectTableWhichIsTransferFrom(){
        WebElement element1=mergeAndFindMobileElement(tableWillBeTransferFrom);
        elementClick(element1,"click tableWillBeTransferFrom");
    }

    public void selectTableWhichIsTransferTo(){
        WebElement element1=mergeAndFindMobileElement(tableWillBeTransferTo);
        elementClick(element1,"click tableWillBeTransferTo");
    }
}
