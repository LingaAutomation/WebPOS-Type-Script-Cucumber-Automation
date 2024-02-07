package com.qa.pages;

import com.qa.utils.TestUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SyncClass2 extends SyncClass1{

    TestUtils utils = new TestUtils();
    public WebDriver driver2 = utils.driver2 ;


    public SyncClass2(){
        PageFactory.initElements(this.driver2,this);
    }
    String allBtn = "//button[@id='os_all']";
    String tableLayoutTab = "//button[contains(.,' Table layout ')]";
    String cancelBtn= "//button[contains(.,'Cancel')]";

    public void elementClick2(String e, String msg) {
        WebDriverWait wait = new WebDriverWait(driver2, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(e)));
        utils.log().info(msg);
        element.click();
    }

    public void clickAllButtonInOrderScreen2(){
        elementClick2(allBtn, "All Selected - 2");
    }

    public void clickTableLayoutTab2(){
        elementClick2(tableLayoutTab, "Table layout Selected - 2");
    }

    public void pressCancelBtn2() throws InterruptedException {

        Thread.sleep(3000);
        elementClick2(cancelBtn, "Order type selection is cancelled.");
    }
    public void elementClick2(WebElement e, String msg) {
        WebDriverWait wait = new WebDriverWait(driver2, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(e));
        utils.log().info(msg);
        element.click();
    }


    public void moveToTheSecond() throws AWTException, InterruptedException {
        Thread.sleep(2000);
        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_ALT);
        rb.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1500);
        rb.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        ((JavascriptExecutor) driver2).executeScript("window.focus();");
    }
    String checkStatsTab1 = "//span[contains(.,' Check Status ')]";
    public void selectCheckStatsTab2() throws InterruptedException {
        Thread.sleep(1000);
        elementClick2(checkStatsTab1, "Tapped Check Stats Tab - 2");
    }

    public void getSeat2Prize() {
        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement subTotal =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[1]//ion-col[2]"));
        WebElement tax =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[2]//ion-col[2]"));
        WebElement paidAmount =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[3]//ion-col[2]"));
        WebElement Total =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[4]//ion-col[2]"));
        //        String subTotalTxt = subTotal.getText();
//        TestUtils.subtotalTxt1 = subTotalTxt;
//        utils.log().info("Seat 2 SubTotal - " + subTotalTxt);
//        String taxTxt = tax.getText();
//        TestUtils.taxTxt1 = taxTxt;
//        utils.log().info("Seat 2 Tax - " + taxTxt);
//        String paidAmountTxt = paidAmount.getText();
//        TestUtils.paidAmount1 = paidAmountTxt;
//        utils.log().info("Seat 2 Paid Amount - " + paidAmountTxt);
//        String TotalTxt = Total.getText();
//        TestUtils.totalTxt1 = TotalTxt;
//        utils.log().info("Seat 2 Total - " + TotalTxt);

        String subTotalTxt = subTotal.getText();
        String subTotalTxt1 = subTotalTxt.replaceAll("[A-Z$. ]","");
        String subTotalTxt11 = subTotalTxt1.replaceAll("[,]",".");
        double subTotalTxt2 = Double.parseDouble(subTotalTxt11);
        TestUtils.subtotalTxt1 = subTotalTxt;
        utils.log().info("Seat 1 SubTotal - " + subTotalTxt);
        double subtotalValue = Double.parseDouble(subTotalTxt11);
        double taxValue = ((subtotalValue*8)/100);//DefaultTAx

        BigDecimal taxx=new BigDecimal(taxValue).setScale(2, RoundingMode.HALF_UP);
        double a=taxx.doubleValue();
        //double a1 = (a*100.0)/100.0;

        DecimalFormat ss = new DecimalFormat("0.00");

        String taxTxt = String.valueOf(ss.format(a));
        utils.log().info("taxTxt is(Seat2) : + "+taxTxt);
        TestUtils.taxTxtSeat2=taxTxt;
        TestUtils.taxTxtOfBeforeRound2 = String.valueOf(taxValue);
        utils.log().info("Before Round 2 - "+taxValue);
        String ActualValueTax = tax.getText();
        String ActualValueTax1 = ActualValueTax.replaceAll("[A-Z$. ]","");
        String ActualValueTax2 = ActualValueTax1.replaceAll(",",".");

        Assert.assertEquals(taxTxt,ActualValueTax2);
        utils.log().info("Seat 2 Tax - " + taxTxt);
        String paidAmountTxt = paidAmount.getText();
        TestUtils.paidAmount1 = paidAmountTxt;
        utils.log().info("Seat 2 Paid Amount - " + paidAmountTxt);

        String TotalTxt = Total.getText();
        String TotalTxt1 = TotalTxt.replaceAll("[A-Z$. ]","");
        String TotalTxt11 = TotalTxt1.replaceAll("[,]",".");
        double totalTxtt = Double.parseDouble(TotalTxt11);
        DecimalFormat sss = new DecimalFormat("0.00");
        String totalTxtt1 = String.valueOf(sss.format(totalTxtt));
        utils.log().info("totalTxtt1(seat2) is : "+totalTxtt1);

        double totalValuee = subTotalTxt2+taxValue;
        utils.log().info("subTotalTxt2 "+subTotalTxt2 );
//        utils.log().info("a "+a );
        BigDecimal totall=new BigDecimal(totalValuee).setScale(2, RoundingMode.HALF_UP);
        double totall1= totall.doubleValue();
        DecimalFormat sss1 = new DecimalFormat("0.00");
        String totalValuee1 = String.valueOf(sss1.format(totall1));
//        String totalValuee1 = String.valueOf(totall1);
        TestUtils.totalTxt1 = String.valueOf(totalValuee);
        Assert.assertEquals(totalValuee1,totalTxtt1);

        utils.log().info("Seat 2 Total - " + TotalTxt);
    }

    public void getSeat2Prize1() {
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement subTotal =  driver1.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[1]//ion-col[2]"));
        WebElement tax =  driver1.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[2]//ion-col[2]"));
        WebElement paidAmount =  driver1.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[3]//ion-col[2]"));
        WebElement Total =  driver1.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[4]//ion-col[2]"));
        String subTotalTxt = subTotal.getText();
        TestUtils.subtotalSeat2 = subTotalTxt;
        utils.log().info("Seat 1 SubTotal - " + subTotalTxt);


        TestUtils.taxTxtSeat2 = tax.getText();
        utils.log().info("Seat 1 Total - " + tax.getText());

        String paidAmountTxt = paidAmount.getText();
        TestUtils.paidAmountSeat2 = paidAmountTxt;
        utils.log().info("Seat 1 Paid Amount - " + paidAmountTxt);

        String totalTxt = Total.getText();
        TestUtils.totalSeat2 = totalTxt;
        utils.log().info("Seat 1 Total - " + totalTxt);
    }

}
