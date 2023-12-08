package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TGMenuOption extends BasePage{


    public void selectRepeatMenuOption(){
        WebElement element = mergeAndFindMobileElement(repeatMenuOption);
        elementClick(element, "click repeatMenuOption ");
    }

    public void selectQuantityMenuOption(){
        WebElement element = mergeAndFindMobileElement(quantityMenuOption);
        elementClick(element, "click quantityMenuOption ");
    }

    public Object enterQuantityOfOrder(){
        WebElement element = mergeAndFindMobileElement(calculatorNumberTwo);
        elementClick(element, "click calculatorNumberTwo ");

        WebElement element1 = mergeAndFindMobileElement(continueForCalculator);
        elementClick(element1, "click continueForCalculator ");

        return null;
    }

    public Object enterQuantityOfOrderForDecrease(){
        WebElement element = mergeAndFindMobileElement(calculatorNumberOne);
        elementClick(element, "click calculatorNumberTwo ");

        WebElement element1 = mergeAndFindMobileElement(continueForCalculator);
        elementClick(element1, "click continueForCalculator ");

        return null;
    }

    public void clickHoldMenuOption(){
        WebElement element = mergeAndFindMobileElement(holdMenuOption);
        elementClick(element, "click holdManualOption ");
    }

    public void verifyHoldScreen(){
        WebElement element = mergeAndFindMobileElement(holdHeaderText);
        String actualName=elementGetText(element,"verify holdHeaderText");
        String expectedName = "Hold";

        Assert.assertEquals(expectedName,actualName);
    }
    public void verifyHoldTypeButtons(){
        WebElement element = mergeAndFindMobileElement(holdAutomationButton);
        String actualName=elementGetText(element,"verify holdAutomationButton");
        String expectedName = "Automatic";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = mergeAndFindMobileElement(holdManuelButton);
        String actualName1=elementGetText(element1,"verify holdManuelButton");
        String expectedName1 = "Manual";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void clickFireMenuOption(){
        WebElement element = mergeAndFindMobileElement(fireMenuOption);
        elementClick(element, "click fireMenuOption ");
    }

    public void clickRepeatMenuOption(){
        WebElement element = mergeAndFindMobileElement(repeatMenuOption);
        elementClick(element, "click repeatMenuOption ");
    }

    public void verifyRepeatedMenuItem(){
        WebElement element1 = mergeAndFindMobileElement(firstMenuItem);
        String actualName=elementGetText(element1,"verify firstMenuItem");

        WebElement element = mergeAndFindMobileElement(repeatedMenuItem);
        String expectedName=elementGetText(element,"verify repeatedMenuItem");

        Assert.assertEquals(actualName,expectedName);
    }

    public void enterQuantityOfRepeatMenuItem(){
        WebElement element = mergeAndFindMobileElement(calculatorNumberTwo);
        elementClick(element, "click calculatorNumberTwo ");

        WebElement element1 = mergeAndFindMobileElement(continueForCalculator);
        elementClick(element1, "click continueForCalculator ");
    }

    public void verifyQuantityOfOrder(){
        WebElement element1 = mergeAndFindMobileElement(quantityOfOrder);
        String actualName=elementGetText(element1,"verify quantityOfOrder");
        String expectedName = "2";

        Assert.assertEquals(expectedName,actualName);
    }

    public void clickAttachMenuOption(){
        WebElement element1 = mergeAndFindMobileElement(attachMenuOption);
        elementClick(element1, "click attachMenuOption ");
    }

    public void selectAnyAttachNote(){
        WebElement element1 = mergeAndFindMobileElement(attachNoteTitle);
        String actualName=elementGetText(element1,"verify attachNoteTitle");
        String expectedName = "Add Notes";

        Assert.assertEquals(actualName,expectedName);

        WebElement element = mergeAndFindMobileElement(firstAttachNote);
        elementClick(element, "click firstAttachNote ");

        WebElement element2 = mergeAndFindMobileElement(addAttachNoteButton);
        elementClick(element2, "click addAttachNoteButton ");
    }

    public void verifyAttachedNotes(){
        WebElement element1 = mergeAndFindMobileElement(attachedNotesOnOrder);
        String actualName=elementGetText(element1,"verify attachedNotesOnOrder");
        String expectedName = "Toasted";

        Assert.assertEquals(expectedName,actualName);
    }
    public void clickToGoMenuOption(){
        WebElement element2 = mergeAndFindMobileElement(ToGoMenuOption);
        elementClick(element2, "click ToGoMenuOption ");
    }


}
