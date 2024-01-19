package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class TGCashPage extends BasePage{

    public void enterCashDropAmountForSandwiches(){
        WebElement element=mergeAndFindMobileElement(numberEight);
        elementClick(element,"Click Eight");
        WebElement element1=mergeAndFindMobileElement(numberOne);
        elementClick(element1,"Click One");
        WebElement element2=mergeAndFindMobileElement(numberZero);
        elementClick(element2,"Click Zero");
        elementClick(element2,"Click Zero");
//        elementClick(element1,"Click One");
        WebElement element3=driver.findElement(By.xpath("//button[contains(.,'Continue')]"));
        elementClick(element3,"Click Continue Button");

    }
    public void clickCashAmountExceedAmountPopoup(){
        WebElement element3=mergeAndFindMobileElement(exceedCashAmountPopup);
        String actualName =elementGetText(element3,"Get Exceed Cash Amount Popup");
        String expectedName = "Cash amount has exceeded the limit.Please make a drop now.";

        Assert.assertEquals(actualName,expectedName);
        WebElement element=mergeAndFindMobileElement(yesButton);
        elementClick(element,"Yes Button Clicked");
    }
    public void payOrder(){
        WebElement element=mergeAndFindMobileElement(exactButton);
        elementClick(element,"Exact Button Clicked");
        WebElement element1=mergeAndFindMobileElement(enterButton);
        elementClick(element1,"Enter Button Clicked");
    }
    public void clickExactButtonOnCashTab(){

        WebElement element=driver.findElement(By.xpath(exactButton));
        elementClick(element,"Exact Button Clicked");
    }
    public void clickEnterButtonOnCashButton(){
        WebElement element1=mergeAndFindMobileElement(enterButton);
        elementClick(element1,"Enter Button Clicked");
    }
    /*public void verifyTotalCheckAmountWithFixGratuity(){
        String actualName = driver.findElement(totalAmountWithGratuity).getText();
        String expectedName = "TL 0,30";

        Assert.assertEquals(expectedName,actualName);
    }*/

}


