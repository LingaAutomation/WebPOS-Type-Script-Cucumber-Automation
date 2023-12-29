package com.qa.pages;


import com.qa.utils.TestUtils;
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

    public void selectServerWhichTransferFrom() throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")),TestUtils.ServerName1);
        Thread.sleep(2000);
        WebElement element=mergeAndFindMobileElement("//span[.='Admin u']");
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


        WebElement element1=driver.findElement(By.xpath(doneButton));
        elementClick(element1,"click doneButton");
    }

    public void clickTransferDoneButton() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element1=driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-table-transfer/ion-footer/div/button[2]"));
        elementClick(element1,"click doneButton");
        Thread.sleep(2000);
        try {
            WebElement element = mergeAndFindMobileElement(yesButton);
            elementClick(element, "click yesButton");
        }catch (Exception w){

        }
    }

    public void selectTransferItemButton() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element1=mergeAndFindMobileElement(transferItemButton);
        elementClick(element1,"click transferItemButton");
    }

    public void selectBarTabOrderForTransferMenuItem(){
        sendKeys(driver.findElement(By.xpath("(//div[@class='tabletransfer_positionstick']//input[@aria-label='search text'])[1]")), TestUtils.globalCheckNumber);
        WebElement element1=driver.findElement(By.xpath("//div[@class='transfer-from-to-item ng-star-inserted']"));
        elementClick(element1,"click barTabOrderForTransfer");
    }

    public void selectMenuItemWhichIsTransferred(){
        WebElement element1=driver.findElement(By.xpath(menuItemForTransfer));
        utils.log().info(element1.getText());
        elementClick(element1,"click menuItemForTransfer ");
    }

    public void selectBarTabWhichMenuItemTransferredTo() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element1=driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-table-transfer/mat-tab-group/div/mat-tab-body[2]/div/app-transfer-detail-content/ion-grid/ion-row/ion-col[3]/ul/div[4]/div"));
        String[] value = element1.getText().split(" ");
        utils.log().info(value[0]);
        TestUtils.globalCheckNumber1 = value[0];
        element1.click();
        utils.log().info(element1.getText());
        Thread.sleep(1000);
    }

    public void clickTransferToTableButton(){
        WebElement element1=mergeAndFindMobileElement(transferToTableButton);
        elementClick(element1,"click transferToTableButton");
    }

    public void selectTableWhichIsTransferFrom() throws InterruptedException {
        Thread.sleep(2000);
        utils.log().info(TestUtils.tableNumberof);
        sendKeys(driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")),"Floor 1-"+TestUtils.tableNumberof);
        Thread.sleep(2000);
        WebElement element1=mergeAndFindMobileElement("//span[.='Floor 1-"+TestUtils.tableNumberof+"']");
        elementClick(element1,"click tableWillBeTransferFrom");
    }

    public void selectTableWhichIsTransferTo() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element1=driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-table-transfer/mat-tab-group/div/mat-tab-body[2]/div/app-transfer-detail-content/ion-grid/ion-row/ion-col[3]/ul/div[4]/div"));
        String[] value = element1.getText().split(" ");
        utils.log().info(value[0]);
        TestUtils.globalCheckNumber1 = value[0];
        element1.click();
        utils.log().info(element1.getText());
        Thread.sleep(1000);
    }
}
