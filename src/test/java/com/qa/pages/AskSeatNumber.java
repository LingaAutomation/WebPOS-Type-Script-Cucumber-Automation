package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AskSeatNumber extends BasePage {

    public void verifyThatAskSeatCountIsAvailable() throws Exception {
        WebElement askSeatCount =  driver.findElement(By.xpath("//ion-label[.='Ask Seat Count in Table Layout ']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", askSeatCount);
        String askSeatCountTxt = askSeatCount.getText();
        Assert.assertEquals(askSeatCountTxt, "Ask Seat Count in Table Layout");
        utils.log().info("Displayed as - " + askSeatCountTxt);
        WebElement askSeatCountToggle =  driver.findElement(By.xpath("//ion-label[.='Ask Seat Count in Table Layout ']/..//ion-toggle"));
        if (askSeatCountToggle.isDisplayed()) {
            utils.log().info("Ask Seat Number Toggle is Displayed");
        } else {
            utils.log().info("Ask Seat Number Toggle is Not Displayed");
            int w = 1 / 0;
        }
    }

    public void verifyThatAskSeatCountIsEnabled() throws Exception {
        WebElement askSeatCount =  driver.findElement(By.xpath("//ion-label[.='Ask Seat Count in Table Layout ']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", askSeatCount);
        String askSeatCountTxt = askSeatCount.getText();
        Assert.assertEquals(askSeatCountTxt, "Ask Seat Count in Table Layout");
        utils.log().info("Displayed as - " + askSeatCountTxt);
        WebElement askSeatCountToggle =  driver.findElement(By.xpath("//ion-label[.='Ask Seat Count in Table Layout ']/..//ion-toggle[@aria-checked='true']"));
        if (askSeatCountToggle.isDisplayed()) {
            utils.log().info("Ask Seat Number Toggle is Enabled");
        } else {
            utils.log().info("Ask Seat Number Toggle is Disabled");
            int w = 1 / 0;
        }
    }

    public void verifyThatAskCustomerForDineInIsEnabled() throws Exception {
        WebElement askSeatCustomer =  driver.findElement(By.xpath("//ion-label[.='Ask Customer Name ']"));
        scrollToElement(askSeatCustomer, "up");
        String askSeatCountTxt = askSeatCustomer.getText();
        Assert.assertEquals(askSeatCountTxt, "Ask Customer Name");
        WebElement askSeatCountToggle =  driver.findElement(By.xpath("//ion-label[.='Ask Customer Name ']/..//ion-toggle[@aria-checked='false']"));
//        utils.log().info("Ask Seat Count Toggle Value as - " + askSeatCountToggle.getAttribute("value"));
        if (askSeatCountToggle.isDisplayed()) {
            elementClick(askSeatCountToggle, "Enabled Ask Customer Toggle");
        } else {
            utils.log().info("Already Ask Customer Toggle is Enabled");
            int w = 1/0;
        }
    }

    public void verifyThatAskCustomerForDineInIsDisabled() throws Exception {
        WebElement askSeatCustomer =  driver.findElement(By.xpath("//ion-label[.='Ask Customer Name ']"));
        scrollToElement(askSeatCustomer, "up");
        String askSeatCountTxt = askSeatCustomer.getText();
        Assert.assertEquals(askSeatCountTxt, "Ask Customer Name");
        WebElement askSeatCountToggle =  driver.findElement(By.xpath("//ion-label[.='Ask Customer Name ']/..//ion-toggle[@aria-checked='false']"));
//        utils.log().info("Ask Seat Count Toggle Value as - " + askSeatCountToggle.getAttribute("value"));
        if (askSeatCountToggle.isDisplayed()) {
//            elementClick(askSeatCountToggle, "Disabled Ask Customer Toggle");
            utils.log().info("Ask Seat Customer is disabled");
        } else {
            utils.log().info("ASk Seat Customer is Enable");
            int w = 1/0;
        }
    }

    public void verifyThatAskSeatCountIsDisabled() throws Exception {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement Auto = driver.findElement(By.xpath("//p[.='Enable Order Types']"));
        driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
        try{
            if (Auto.isDisplayed()) {
                WebElement AskSeatNumber = driver.findElement(By.xpath("//ion-label[.='Ask Seat Count in Table Layout ']/..//ion-toggle[@aria-checked='true']"));
                if (AskSeatNumber.isDisplayed())   {
                    AskSeatNumber.click();
                }
            }
        }
        catch (Exception e) {
            WebElement AskSeatNumber = driver.findElement(By.xpath("//ion-label[.='Ask Seat Count in Table Layout ']/..//ion-toggle[@aria-checked='false']"));
            if (AskSeatNumber.isDisplayed())   {
            }
        }
    }

    public int itemToSelect;

    public void selectRandomTable() throws InterruptedException {
         Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT, TimeUnit.SECONDS);
        WebElement New =  driver.findElement(By.xpath("//div[contains(.,'New Check')]"));
        elementClick(New, "Tapped New Check");
        List<WebElement> tablee = (List<WebElement>) driver.findElements(By.xpath("//div[@class='table-layout-block ng-star-inserted']//button"));
        int count = tablee.size();
        utils.log().info("Total Count of the Table - " + count);

/*****  RandOm Select Table ****/

        Random rand = new Random();

        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(itemToSelect);
            WebElement tableNum =  driver.findElement(By.xpath("//div[@class='table-layout-block ng-star-inserted']//button["+itemToSelect+"]//div[1]//label[1]"));
            utils.log().info("Tabled Number - "+tableNum.getText());
            TestUtils.tableNumberof = tableNum.getText();
            elementClick(tableNum, "Tapped Table " + itemToSelect);

        }

    }

    public void shouldVerifyTheAskSeatNumberOnTheTableLayout(){
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        WebElement askSeatNumber = driver.findElement(By.xpath("//mat-dialog-container[@id='quantity-dialog']"));
        if(askSeatNumber.isDisplayed()){
            utils.log().info("Displayed Ask Seat Number Window");
        }else{
            utils.log().info("Not Displayed Ask Seat Number Window");
            int w = 1/0;
        }
    }

    public void verifySeatCountOnTheOrderScreen(){
        List<WebElement> seatCoutOnOrderScreen = driver.findElements(By.xpath("//ion-col[@class='qsrSeats_row-col md hydrated']//button"));
        String seatCountNumbers = String.valueOf(seatCoutOnOrderScreen.size());
        utils.log().info("Seat Number - "+seatCountNumbers);
        Assert.assertEquals(seatCountNumbers,TestUtils.seatNumber);
        utils.log().info("Verified Seat Number - "+seatCountNumbers);
    }


    public void verifySeatCountAsOnTheOrderScreen(String value){
        List<WebElement> seatCoutOnOrderScreen = driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        String seatCountNumbers = String.valueOf(seatCoutOnOrderScreen.size());
        utils.log().info("Seat Number - "+seatCountNumbers);
        Assert.assertEquals(seatCountNumbers,value);
        utils.log().info("Verified Seat Number - "+seatCountNumbers);
    }

    public void verifyMenuItemOnTheOrderScreen(){
        WebElement menu1 =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section orderlist-flex ')]//div[contains(.,'"+TestUtils.menu+"')])[1]"));
        if(menu1.isDisplayed()){
            utils.log().info("Seat -1 Menu item is Displayed - "+menu1.getText());
        }else{
            utils.log().info("Seat -1 Menu Item is NOT Displayed - "+menu1.getText());
            int w = 1/0;
        }
    }
    public void verifyMenu1ItemOnTheOrderScreen(){
        WebElement menu1 =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section orderlist-flex ')]//div[contains(.,'"+TestUtils.menu1+"')])[1]"));
        if(menu1.isDisplayed()){
            utils.log().info("Seat -2 Menu item is Displayed - "+menu1.getText());
        }else{
            utils.log().info("Seat -2 Menu Item is NOT Displayed - "+menu1.getText());
            int w = 1/0;
        }
    }
    public void verifyMenu2ItemOnTheOrderScreen(){
        WebElement menu1 =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section orderlist-flex ')]//div[contains(.,'"+TestUtils.menu2+"')])[1]"));
        if(menu1.isDisplayed()){
            utils.log().info("Seat -3 Menu item is Displayed - "+menu1.getText());
        }else{
            utils.log().info("Seat -3 Menu Item is NOT Displayed - "+menu1.getText());
            int w = 1/0;
        }
    }

    public void verifyThatServiceTypeShouldNotChangeable(){
        WebElement serviceType =  driver.findElement(By.xpath("//button[contains(@id,'os_menu')]"));
        if(serviceType.isSelected()){
            utils.log().info("Service type is Selectable");
            int u = 1/0;
        }else{
            utils.log().info("Service type is Not Selectable");
        }
    }

    public void verifyThatServiceTypeShouldChangeable(){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        WebElement serviceType1 =  driver.findElement(By.xpath("//button[contains(@id,'os_menu')]"));
        String serviceTypes= serviceType1.getText();
        utils.log().info(serviceTypes);
        if(serviceType1.isEnabled()){
            utils.log().info("Service type is Selectable");
        }else{
            utils.log().info("Service type is Not Selectable");
            int u = 1/0;
        }
    }

    public void verifyBalanceDueAmountAs(String value) {
        WebElement balanceDueAmount =  driver.findElement(By.xpath("//div[@class='balance ng-star-inserted']//label[2]"));
        utils.log().info("Balance Due Amount Same  - "+ balanceDueAmount.getText());
        String totalAmountTxt = balanceDueAmount.getText().replaceAll("[$A-Z .]","");
        if(totalAmountTxt.equals(value.replaceAll("[$A-Z .]",""))){
            utils.log().info("Balance Due Amount Same  - "+ totalAmountTxt);
        }else{
            utils.log().info("Balance Due Amount is NOT Same - "+ totalAmountTxt);
            int x = 1/0;
        }
    }

    public void shouldVerifyEnterTheNumberOfCustomerPopup(){
        WebElement enterTheNumberOfCustomer =  driver.findElement(By.xpath("Enter the Number of Customer"));
        Assert.assertEquals(enterTheNumberOfCustomer.getText(),"Enter the Number of Customer");
        utils.log().info("Displayed as - "+enterTheNumberOfCustomer.getText());
    }

    public void shouldVerifyEnterTheNumberOfSeatsPopup(){
        WebElement enterTheNumberOfCustomer =  driver.findElement(By.xpath("Enter the number of seats"));
        Assert.assertEquals(enterTheNumberOfCustomer.getText(),"Enter the number of seats");
        utils.log().info("Displayed as - "+enterTheNumberOfCustomer.getText());
    }

    public void clickLingaCloseBtn(){
        WebElement lingaCloseBtn =  driver.findElement(By.xpath("//linga-icon[@symbol='closeButton']"));
        elementClick(lingaCloseBtn,"Selected - "+"Linga Close");
    }


}
