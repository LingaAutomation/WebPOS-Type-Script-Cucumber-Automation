package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TGMenuOption extends BasePage{


    public void selectRepeatMenuOption(){
        WebElement element = driver.findElement(By.xpath(repeatMenuOption));
        elementClick(element, "click repeatMenuOption ");
    }

    public void selectQuantityMenuOption(){
        WebElement element = driver.findElement(By.xpath(quantityMenuOption));
        elementClick(element, "click quantityMenuOption ");
    }

    public Object enterQuantityOfOrder(){
        WebElement element = driver.findElement(By.xpath(calculatorNumberTwo));
        elementClick(element, "click calculatorNumberTwo ");

        WebElement element1 = driver.findElement(By.xpath(continueForCalculator));
        elementClick(element1, "click continueForCalculator ");

        return null;
    }

    public Object enterQuantityOfOrderForDecrease(){
        WebElement element = driver.findElement(By.xpath(calculatorNumberOne));
        elementClick(element, "click calculatorNumberTwo ");

        WebElement element1 = driver.findElement(By.xpath(continueForCalculator));
        elementClick(element1, "click continueForCalculator ");

        return null;
    }

    public void clickHoldMenuOption(){
        WebElement element = driver.findElement(By.xpath(holdMenuOption));
        elementClick(element, "click holdManualOption ");
    }

    public void verifyHoldScreen(){
        WebElement element = driver.findElement(By.xpath(holdHeaderText));
        String actualName=elementGetText(element,"verify holdHeaderText");
        String expectedName = "Hold";

        Assert.assertEquals(expectedName,actualName);
    }
    public void verifyHoldTypeButtons(){
        WebElement element = driver.findElement(By.xpath(holdAutomationButton));
        String actualName=elementGetText(element,"verify holdAutomationButton");
        String expectedName = "Automatic";

        Assert.assertEquals(actualName,expectedName);

        WebElement element1 = driver.findElement(By.xpath(holdManuelButton));
        String actualName1=elementGetText(element1,"verify holdManuelButton");
        String expectedName1 = "Manual";

        Assert.assertEquals(actualName1,expectedName1);
    }

    public void clickFireMenuOption(){
        WebElement element = driver.findElement(By.xpath(fireMenuOption));
        elementClick(element, "click fireMenuOption ");
    }

    public void clickRepeatMenuOption(){
        WebElement element = driver.findElement(By.xpath(repeatMenuOption));
        elementClick(element, "click repeatMenuOption ");
    }

    public void verifyRepeatedMenuItem(){
        WebElement element1 = driver.findElement(By.xpath(firstMenuItem));
        String actualName=elementGetText(element1,"verify firstMenuItem");

        WebElement element = driver.findElement(By.xpath(repeatedMenuItem));
        String expectedName=elementGetText(element,"verify repeatedMenuItem");

        Assert.assertEquals(actualName,expectedName);
    }

    public void enterQuantityOfRepeatMenuItem(){
        WebElement element = driver.findElement(By.xpath(calculatorNumberTwo));
        elementClick(element, "click calculatorNumberTwo ");

        WebElement element1 = driver.findElement(By.xpath(continueForCalculator));
        elementClick(element1, "click continueForCalculator ");
    }

    public void verifyQuantityOfOrder(){
        WebElement element1 = driver.findElement(By.xpath(quantityOfOrder));
        String actualName=elementGetText(element1,"verify quantityOfOrder");
        String expectedName = "2";

        Assert.assertEquals(expectedName,actualName);
    }

    public void clickAttachMenuOption(){
        WebElement element1 = driver.findElement(By.xpath(attachMenuOption));
        elementClick(element1, "click attachMenuOption ");
    }

    public void selectAnyAttachNote(){
        WebElement element1 = driver.findElement(By.xpath(attachNoteTitle));
        String actualName=elementGetText(element1,"verify attachNoteTitle");
        String expectedName = "Add Notes";

        Assert.assertEquals(actualName,expectedName);

        WebElement element = driver.findElement(By.xpath(firstAttachNote));
        elementClick(element, "click firstAttachNote ");

        WebElement element2 = driver.findElement(By.xpath(addAttachNoteButton));
        elementClick(element2, "click addAttachNoteButton ");
    }

    public void verifyAttachedNotes(){
        WebElement element1 = driver.findElement(By.xpath(attachedNotesOnOrder));
        String actualName=elementGetText(element1,"verify attachedNotesOnOrder");
        String expectedName = "Toasted";

        Assert.assertEquals(expectedName,actualName);
    }
    public void clickToGoMenuOption(){
        WebElement element2 = driver.findElement(By.xpath(ToGoMenuOption));
        elementClick(element2, "click ToGoMenuOption ");
    }


}
