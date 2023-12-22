package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static com.qa.utils.TestUtils.driver;

public class OrderManagementScreen_NewPage {

    public String checkNumber="";

    public String getCheckNumberTxt1() throws InterruptedException {
        Thread.sleep(7000);
        WebElement checkNum= driver.findElement(By.xpath("//p[@class='order-header-checkno']"));
        checkNumber=checkNum.getText();
        TestUtils.globalCheckNumber=checkNumber;
//        utils.log().info(checkNumber);
        return checkNumber;
    }

    public void getTotalOfMenuInOrderscreen1(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement totalOfMenu = driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalOfMenuTxt = totalOfMenu.getAttribute("value");
        TestUtils.totalTxt = totalOfMenuTxt;
        WebElement CashPriceOfMenu = driver.findElement(By.xpath("//div[@id='os_cashOptionStr']//input"));
        String CashPriceOfMenutxt = CashPriceOfMenu.getAttribute("value");
        TestUtils.CasePriceTxt = CashPriceOfMenutxt;
        WebElement PaidAMountMenu = driver.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String PaidAMountMenutxt = PaidAMountMenu.getAttribute("value");
        TestUtils.PaidTxt = PaidAMountMenutxt;
        System.err.println(totalOfMenuTxt);
//            utils.log().info("Total Of Menus - "+totalOfMenuTxt);
    }


}
