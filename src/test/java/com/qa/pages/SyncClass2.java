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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SyncClass2 extends SyncClass1 {

    TestUtils utils = new TestUtils();
    public WebDriver driver2 = utils.driver2;


    public SyncClass2() {
        PageFactory.initElements(this.driver2, this);
    }

    String allBtn = "//button[@id='os_all']";
    String tableLayoutTab = "//button[contains(.,' Table layout ')]";
    String cancelBtn = "//button[contains(.,'Cancel')]";

    public void elementClick2(String e, String msg) {
        WebDriverWait wait = new WebDriverWait(driver2, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(e)));
        utils.log().info(msg);
        element.click();
    }

    public void clickAllButtonInOrderScreen2() {
        elementClick2(allBtn, "All Selected - 2");
    }

    public void clickTableLayoutTab2() {
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
        Robot rb = new Robot();
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
        WebElement subTotal = driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[1]//ion-col[2]"));
        WebElement tax = driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[2]//ion-col[2]"));
        WebElement paidAmount = driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[3]//ion-col[2]"));
        WebElement Total = driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[4]//ion-col[2]"));
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
        String subTotalTxt1 = subTotalTxt.replaceAll("[A-Z$. ]", "");
        String subTotalTxt11 = subTotalTxt1.replaceAll("[,]", ".");
        double subTotalTxt2 = Double.parseDouble(subTotalTxt11);
        TestUtils.subtotalTxt1 = subTotalTxt;
        utils.log().info("Seat 1 SubTotal - " + subTotalTxt);
        double subtotalValue = Double.parseDouble(subTotalTxt11);
        double taxValue = ((subtotalValue * 8) / 100);//DefaultTAx

        BigDecimal taxx = new BigDecimal(taxValue).setScale(2, RoundingMode.HALF_UP);
        double a = taxx.doubleValue();
        //double a1 = (a*100.0)/100.0;

        DecimalFormat ss = new DecimalFormat("0.00");

        String taxTxt = String.valueOf(ss.format(a));
        utils.log().info("taxTxt is(Seat2) : + " + taxTxt);
        TestUtils.taxTxtSeat2 = taxTxt;
        TestUtils.taxTxtOfBeforeRound2 = String.valueOf(taxValue);
        utils.log().info("Before Round 2 - " + taxValue);
        String ActualValueTax = tax.getText();
        String ActualValueTax1 = ActualValueTax.replaceAll("[A-Z$. ]", "");
        String ActualValueTax2 = ActualValueTax1.replaceAll(",", ".");

        Assert.assertEquals(taxTxt, ActualValueTax2);
        utils.log().info("Seat 2 Tax - " + taxTxt);
        String paidAmountTxt = paidAmount.getText();
        TestUtils.paidAmount1 = paidAmountTxt;
        utils.log().info("Seat 2 Paid Amount - " + paidAmountTxt);

        String TotalTxt = Total.getText();
        String TotalTxt1 = TotalTxt.replaceAll("[A-Z$. ]", "");
        String TotalTxt11 = TotalTxt1.replaceAll("[,]", ".");
        double totalTxtt = Double.parseDouble(TotalTxt11);
        DecimalFormat sss = new DecimalFormat("0.00");
        String totalTxtt1 = String.valueOf(sss.format(totalTxtt));
        utils.log().info("totalTxtt1(seat2) is : " + totalTxtt1);

        double totalValuee = subTotalTxt2 + taxValue;
        utils.log().info("subTotalTxt2 " + subTotalTxt2);
//        utils.log().info("a "+a );
        BigDecimal totall = new BigDecimal(totalValuee).setScale(2, RoundingMode.HALF_UP);
        double totall1 = totall.doubleValue();
        DecimalFormat sss1 = new DecimalFormat("0.00");
        String totalValuee1 = String.valueOf(sss1.format(totall1));
//        String totalValuee1 = String.valueOf(totall1);
        TestUtils.totalTxt1 = String.valueOf(totalValuee);
        Assert.assertEquals(totalValuee1, totalTxtt1);

        utils.log().info("Seat 2 Total - " + TotalTxt);
    }

    public void getSeat2Prize1() {
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement subTotal = driver1.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[1]//ion-col[2]"));
        WebElement tax = driver1.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[2]//ion-col[2]"));
        WebElement paidAmount = driver1.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[3]//ion-col[2]"));
        WebElement Total = driver1.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[4]//ion-col[2]"));
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

    public void selectClosedCheckFromClosedTabOnTheIpad2() throws InterruptedException {
        Thread.sleep(2000);
        String globalCheckNumber = TestUtils.globalCheckNumber;
        elementClick2("//span[contains(.,' Check Status ')]", "check");
        Thread.sleep(2000);
        WebElement searchActive = driver2.findElement(By.xpath(searchTabInActiveTab));
        searchActive.clear();
        searchActive.sendKeys(globalCheckNumber);
        List<WebElement> phoneOrders1 = driver2.findElements(By.xpath("//div[(@class='cdk-virtual-scroll-content-wrapper')]//div"));
        utils.log().info(phoneOrders1.size());
        if (phoneOrders1.size() == 1) {
            elementClick2("//div[(@class='cdk-virtual-scroll-content-wrapper')]//div[1]", "Tapped Active Check in closed tab - " + globalCheckNumber);
        } else {
            utils.log().info("Active check is not available - " + globalCheckNumber);
//            int w = 1/0;
            elementClick2("//div[(@class='cdk-virtual-scroll-content-wrapper')]//div[1]", "Tapped Closed Check in closed tab - " + globalCheckNumber);
        }
        WebElement openCheck = driver2.findElement(By.xpath("(//button[(.=' Open Check ')])"));
        elementClick2(openCheck, "Selected - Open Check");

    }

    public void verifySeatNumber1() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> seatsOnOrderScreen = driver2.findElements(By.xpath("//ion-col[@class='qsrSeats_row-col md hydrated']//button"));
        utils.log().info("Seat Count - "+ TestUtils.seatNumber);
        int counts = seatsOnOrderScreen.size();
        Assert.assertEquals(seatsOnOrderScreen.size(),Integer.parseInt(TestUtils.seatNumber));

        for (int i = 1; i <= counts; i++) {

            WebElement numbers = driver2.findElement(By.xpath("//ion-col[@class='qsrSeats_row-col md hydrated']//button[" + i + "]"));
            String numbersTxt = numbers.getText();
            Assert.assertEquals(numbersTxt, String.valueOf(i));
            utils.log().info("Window 2 Seat Numbers on the order screen = " + numbersTxt);
        }

    }

    public void verifySeatNumber2() {
        List<WebElement> seatsOnOrderScreen = driver2.findElements(By.xpath("//ion-col[@class='qsrSeats_row-col md hydrated']//button"));
        utils.log().info("Seat Count - "+ TestUtils.seatNumber);
        int counts = seatsOnOrderScreen.size();

        TestUtils.seatNumber = String.valueOf(seatsOnOrderScreen.size());
            WebElement numbers = driver2.findElement(By.xpath("//ion-col[@class='qsrSeats_row-col md hydrated']//button[1]"));
            String numbersTxt = numbers.getText();
            Assert.assertEquals(numbersTxt, "1");
            utils.log().info("Window 2 Seat Numbers on the order screen = " + numbersTxt);

        WebElement numbers1 = driver2.findElement(By.xpath("//ion-col[@class='qsrSeats_row-col md hydrated']//button[2]"));
        String numbersTxt1 = numbers1.getText();
        Assert.assertEquals(numbersTxt1, "2");
        utils.log().info("Window 2 Seat Numbers on the order screen = " + numbersTxt1);

        WebElement numbers2 = driver2.findElement(By.xpath("//ion-col[@class='qsrSeats_row-col md hydrated']//button[3]"));
        String numbersTxt2 = numbers2.getText();
        Assert.assertEquals(numbersTxt2, "3");
        utils.log().info("Window 2 Seat Numbers on the order screen = " + numbersTxt2);

        WebElement numbers3 = driver2.findElement(By.xpath("//ion-col[@class='qsrSeats_row-col md hydrated']//button[4]"));
        String numbersTxt3 = numbers3.getText();
        Assert.assertEquals(numbersTxt3, "4");
        utils.log().info("Window 2 Seat Numbers on the order screen = " + numbersTxt3);

    }

    public void verifyMenuItemFromSeatOnIpad2WithIpad1() throws InterruptedException {
        Thread.sleep(3000);
        List<String> menuName11=new ArrayList<String>();
        List<String> modifierName11=new ArrayList<String>();
        List<String> menuPrize11=new ArrayList<String>();
        List<String> modifierPrize11=new ArrayList<String>();


        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
        utils.log().info("orderMenu.size - " + orderMenu.size());
        for (int i = 1; i < orderMenu.size(); i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]"));
            menuName11.add( orderMenuName.getText());
            utils.log().info(i+" "+orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize11.add(orderMenuPrize1.getText());
            utils.log().info(i+" "+orderMenuPrize1.getText());

            Assert.assertEquals(TestUtils.MenuCounts.get(i-1), orderMenuName.getText());



            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText());
            try {
                List<WebElement> modifier =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='"+ menuName11.get(i) +"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m < modifier.size(); m++) {
                    WebElement modifier1 = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));

                    modifierName11.add(modifier1.getText());
                    TestUtils.modifierName11 = modifierName11;
                    WebElement modifierPrize1s = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize11.add(modifierPrize1s.getText());
                    TestUtils.modifierPrize11 = modifierPrize11;
                    Assert.assertEquals(TestUtils.ModifierCounts.get(i-1), modifierPrize1s.getText());
//                    Assert.assertEquals(TestUtils.menuPrize1.get(i), orderMenuPrize1.getText());
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(m) + " Prize - " + modifierPrize11.get(m));
                }

            } catch (Exception g) {

            }
        }


        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        Assert.assertEquals(TestUtils.subTotal,subTotalAmountTxt);

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - "+taxAmountTxt);
        Assert.assertEquals(TestUtils.tax,taxAmountTxt);

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - "+totalAmountTxt);
        Assert.assertEquals(TestUtils.totalAmount,totalAmountTxt);


        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - "+paidAmountTxt);
        Assert.assertEquals(TestUtils.paidAmount,paidAmountTxt);



    }
    public void selectYesBtn() throws InterruptedException {
        Thread.sleep(2000);
        WebElement finishOrder = driver2.findElement(By.xpath("//button[.=' Yes ']"));
        elementClick1(finishOrder, "Finish Order selected");

    }
    public void selectSeatNumberOnOrderScreen1(String number) throws InterruptedException {
        WebElement numbers =  driver2.findElement(By.xpath("//ion-col[@class='qsrSeats_row-col md hydrated']//button["+number+"]"));
        String numbersTxt = numbers.getText();
        Assert.assertEquals(numbersTxt,number);
        elementClick2( numbers, " Window 2 Selected Seat as - "+numbersTxt);
        Thread.sleep(2000);
    }

    public void verifyMenuItemFromSeat3OnIpad2WithIpad1() throws InterruptedException {
        Thread.sleep(2000);
        List<String> menuName11=new ArrayList<String>();
        List<String> modifierName11=new ArrayList<String>();
        List<String> menuPrize11=new ArrayList<String>();
        List<String> modifierPrize11=new ArrayList<String>();


        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
        utils.log().info("orderMenu.size - " + orderMenu.size());
        for (int i = 1; i < orderMenu.size(); i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]"));
            menuName11.add( orderMenuName.getText());
            utils.log().info(i+" "+orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize11.add(orderMenuPrize1.getText());
            utils.log().info(i+" "+orderMenuPrize1.getText());

            Assert.assertEquals(TestUtils.MenuCounts2.get(i-1), orderMenuName.getText());

            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText());
            try {
                List<WebElement> modifier =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='"+ menuName11.get(i) +"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));

                    modifierName11.add(modifier1.getText());
                    TestUtils.modifierName11 = modifierName11;
                    WebElement modifierPrize1s = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize11.add(modifierPrize1s.getText());
                    TestUtils.modifierPrize11 = modifierPrize11;
                    Assert.assertEquals(TestUtils.ModifierCounts2.get(i-1), modifierPrize1s.getText());
//                    Assert.assertEquals(TestUtils.menuPrize1.get(i), orderMenuPrize1.getText());
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(m) + " Prize - " + modifierPrize11.get(m));
                }

            } catch (Exception g) {

            }
        }


        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
         Assert.assertEquals(TestUtils.subTotal2,subTotalAmountTxt);

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - "+taxAmountTxt);
        Assert.assertEquals(TestUtils.tax2,taxAmountTxt);

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - "+totalAmountTxt);
        Assert.assertEquals(TestUtils.totalAmount2,totalAmountTxt);


        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - "+paidAmountTxt);
        Assert.assertEquals(TestUtils.paidAmount2,paidAmountTxt);

    }


    public void verifyMenuItemFromSeat4OnIpad2WithIpad1() throws InterruptedException {
        Thread.sleep(3000);
        List<String> menuName11=new ArrayList<String>();
        List<String> modifierName11=new ArrayList<String>();
        List<String> menuPrize11=new ArrayList<String>();
        List<String> modifierPrize11=new ArrayList<String>();


        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
        utils.log().info("orderMenu.size - " + orderMenu.size());
        for (int i = 1; i < orderMenu.size(); i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]"));
            menuName11.add( orderMenuName.getText());
            utils.log().info(i+" "+orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize11.add(orderMenuPrize1.getText());
            utils.log().info(i+" "+orderMenuPrize1.getText());

            Assert.assertEquals(TestUtils.MenuCounts21.get(i-1), orderMenuName.getText());



            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText());
            try {
                List<WebElement> modifier =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='"+ menuName11.get(i) +"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));

                    modifierName11.add(modifier1.getText());
                    TestUtils.modifierName11 = modifierName11;
                    WebElement modifierPrize1s = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize11.add(modifierPrize1s.getText());
                    TestUtils.modifierPrize11 = modifierPrize11;
                    Assert.assertEquals(TestUtils.ModifierCounts21.get(i-1), modifierPrize1s.getText());
//                    Assert.assertEquals(TestUtils.menuPrize1.get(i), orderMenuPrize1.getText());
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(m) + " Prize - " + modifierPrize11.get(m));
                }

            } catch (Exception g) {

            }
        }


        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        Assert.assertEquals(TestUtils.subTotal4,subTotalAmountTxt);

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - "+taxAmountTxt);
        Assert.assertEquals(TestUtils.tax4,taxAmountTxt);

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - "+totalAmountTxt);
        Assert.assertEquals(TestUtils.totalAmount4,totalAmountTxt);


        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - "+paidAmountTxt);
        Assert.assertEquals(TestUtils.paidAmount4,paidAmountTxt);

    }

    public void verifyMenuItemFromSeat2OnIpad2WithIpad1() throws InterruptedException {
        Thread.sleep(3000);
        List<String> menuName11=new ArrayList<String>();
        List<String> modifierName11=new ArrayList<String>();
        List<String> menuPrize11=new ArrayList<String>();
        List<String> modifierPrize11=new ArrayList<String>();


        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
        utils.log().info("Window 2 Seat 2 orderMenu.size - " + orderMenu.size());
        for (int i = 1; i < orderMenu.size(); i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]"));
            menuName11.add( orderMenuName.getText());
            utils.log().info(i+" "+orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize11.add(orderMenuPrize1.getText());
            utils.log().info(i+" "+orderMenuPrize1.getText());
             utils.log().info(TestUtils.MenuCounts1);

            Assert.assertEquals(TestUtils.MenuCounts1.get(i-1), orderMenuName.getText());



            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText());
            try {
                List<WebElement> modifier =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='"+ menuName11.get(i) +"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m < modifier.size(); m++) {
                    WebElement modifier1 = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));

                    modifierName11.add(modifier1.getText());
//                    TestUtils.modifierName11 = modifierName11;
                    WebElement modifierPrize1s = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize11.add(modifierPrize1s.getText());
//                    TestUtils.modifierPrize11 = modifierPrize11;
                    Assert.assertEquals(TestUtils.ModifierCounts1.get(i-1), modifierPrize1s.getText());
//                    Assert.assertEquals(TestUtils.menuPrize1.get(i), orderMenuPrize1.getText());
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(m) + " Prize - " + modifierPrize11.get(m));
                }

            } catch (Exception g) {

            }
        }


        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        Assert.assertEquals(TestUtils.subTotal1,subTotalAmountTxt);

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - "+taxAmountTxt);
        Assert.assertEquals(TestUtils.tax1,taxAmountTxt);

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - "+totalAmountTxt);
        Assert.assertEquals(TestUtils.totalAmount1,totalAmountTxt);

        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - "+paidAmountTxt);
        Assert.assertEquals(TestUtils.paidAmount1,paidAmountTxt);

    }
public int listOfSeats;
    public void removeSeat2() throws InterruptedException {
        elementClick2("//button[@id='os_seatList']","Window 2 - Selected arrow Down");
        Thread.sleep(500);
        List<WebElement> listSeats = driver2.findElements(By.xpath("//div[@class='seatDropDown_row-seatCountButton']//button"));
         listOfSeats = listSeats.size();
        elementClick2("//linga-icon[@symbol='create']","Window 2 - Create Symbol");
        Thread.sleep(2000);

        elementClick2("//div[@class='seatDropDown_row-seatCountButton']//button[5]//div[.=' X ']","Window 2 -Selected Seat - 2");
        Thread.sleep(1500);


        List<WebElement> listSeats1 = driver2.findElements(By.xpath("//div[@class='seatDropDown_row-seatCountButton']//button"));
        int listOfSeats1 = listSeats1.size();
        Assert.assertNotEquals(listOfSeats,listOfSeats1);
        Thread.sleep(1000);

        elementClick2("//linga-icon[@symbol='tick']","Window 2 - Tick Selected ");
        Thread.sleep(1000);
        WebElement listSeats2 = driver2.findElement(By.xpath("(//ion-footer[@role='contentinfo'])[5]"));
        elementClick2(listSeats2,"Selected");
        Thread.sleep(1000);
    }

    public void addNewSeat1(){
        utils.log().info("Window 1 Seat Count Before Add - "+ TestUtils.seatNumber);
        elementClick2("//button[@id='os_addSeat']", "Added a new seat to the table");
    }

    public void getSeatNumberOnOrderScreen2() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> seatsOnOrderScreen =  driver2.findElements(By.xpath("//ion-col[@class='qsrSeats_row-col md hydrated']//button"));
        int counts = seatsOnOrderScreen.size();
        utils.log().info("");
        TestUtils.seatNumber = String.valueOf(counts);
        utils.log().info("Window 1 Seat Count After Add - "+ TestUtils.seatNumber);
    }

    public String selectRandomMenu21(String category) {

        WebElement arrowDonwForCate = driver2.findElement(By.xpath("//button[@id='os_catMenu']"));
        elementClick2(arrowDonwForCate, "Arrow Done");

        /**** Random Select Category ****/

        WebElement cate = driver2.findElement(By.xpath("//div[contains(@class,'center-name category-container')]/div[contains(.,'" + category + "')]"));
        elementClick2(cate, "Tapped category - " + cate.getText());

        /****  RandOm Select Menu ***/

        WebElement order =  driver2.findElement(By.xpath("//button[@id='os_selectedSeat']"));
        String check = order.getText();
        utils.log().info("2 - Selected - "+check);

        TestUtils.tableNumberof = check;
        WebElement menuCollection1 =  driver2.findElement(By.xpath("//div[@class='ion-col fill-container   menuItem-col']"));
        if (menuCollection1.isDisplayed()) {
            List<WebElement > menuCollection =  driver2.findElements(By.xpath("//div[@class='ion-col fill-container   menuItem-col']//button"));
            int count1 = menuCollection.size();
            Random rand1 = new Random();

            for (int j = 1; j <= 2; j++) {
                int itemToSelect1 = rand1.nextInt(count1);

                if (itemToSelect1 == 0) {
                    itemToSelect1 = 1;
                }

                utils.log().info(itemToSelect1);

                WebElement menuName =  driver2.findElement(By.xpath("//div[@class='ion-col fill-container   menuItem-col']//button["+itemToSelect1+"]//div"));
                TestUtils.menu3 = menuName.getText();
                elementClick2(menuName, "Tapped Menu - " + menuName.getText());

                try {
                    WebElement mainModi1 =  driver2.findElement(By.xpath("//ion-col[@class='mod-but md hydrated']"));
                    if ((mainModi1.isDisplayed())) {
                        List<WebElement > mainModi10 =  driver2.findElements(By.xpath("//ion-col[@class='mod-but md hydrated']//button"));
                        int count2 = mainModi10.size();
                        Random rand2 = new Random();
                        for (int k = 1; k <= 1; k++) {
                            int itemToSelect2 = rand2.nextInt(count2);

                            if (itemToSelect2 == 0) {
                                itemToSelect2 = 1;
                            }
                            WebElement mainModi =  driver2.findElement(By.xpath("//ion-col[@class='mod-but md hydrated']//button["+itemToSelect2+"]//span[1]"));
                            elementClick2(mainModi, mainModi.getText() + " - Tapped Main Modifier");
                        }
                        WebElement donee =  driver2.findElement(By.xpath("//button[contains(.,'Done')]"));
                        elementClick2(donee, "1 - Done Selected");
                    } else {
                    }

                } catch (Exception x) {
                }
            }
        }

        return category;
    }
    public void getTheMenuNameWithModifierFromTheSeat4InIpad2() throws InterruptedException {
        ArrayList<String> menuName1 = new ArrayList<String>();
        ArrayList<String> modifierName1 = new ArrayList<String>();
        ArrayList<String> menuPrize1 = new ArrayList<String>();
        ArrayList<String> modifierPrize1 = new ArrayList<String>();
        Thread.sleep(2000);
        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu = driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
        utils.log().info("1 - orderMenu.size - " + orderMenu.size());
        for (int i = 1; i <= orderMenu.size(); i++) {

            WebElement orderMenuName = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])[" + i + "]"));
            menuName1.add(orderMenuName.getText());
            utils.log().info(orderMenuName.getText());
//        TestUtils.menuName1 = menuName1;

            WebElement orderMenuPrize1 = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])[" + i + "]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize1.add(orderMenuPrize1.getText());
            utils.log().info(orderMenuPrize1.getText());
//        TestUtils.menuPrize1 = menuPrize1;
            TestUtils.MenuCounts21 = menuName1;
            utils.log().info("Window 1 - Seat 2 iPad -1 Order Screen Menu SAME with iPad-2 Menu - " + menuName1 + " Prize " + menuPrize1);
            try {
                List<WebElement> modifier = driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='" + menuName1.get(i - 1) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName1.get(i - 1) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));
                    if (modifier1.isDisplayed()) {
                        modifierName1.add(modifier1.getText());
                        TestUtils.modifierName1 = modifierName1;
                        WebElement modifierPrize1s = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName1.get(i - 1) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                        modifierPrize1.add(modifierPrize1s.getText());
                        TestUtils.modifierPrize1 = modifierPrize1;
                        utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName1.get(m) + " Prize - " + modifierPrize1.get(m));
                        TestUtils.ModifierCounts21 = modifierName1;
                        utils.log().info("Menus available in the iPad1 - " + orderMenuName.getText());
                        utils.log().info("Modifiers available in the iPad1 - " + modifier1.getText());
                    } else {
                        modifierName1.add(null);
                        modifierPrize1.add(null);
                    }

                }


            } catch (Exception g) {

            }
        }
        utils.log().info("Menu name Seat 4 - " + menuName1);
        utils.log().info("Menu Prize Seat 4 - " + menuPrize1);
        utils.log().info("Modifier name Seat 4 - " + modifierName1);
        utils.log().info("Modifier Prize Seat 4 - " + modifierPrize1);
    }

    public void getTheMenuNameWithModifierFromTheSeat2InIpad2() throws InterruptedException {
        ArrayList<String> menuName1 = new ArrayList<String>();
        ArrayList<String> modifierName1 = new ArrayList<String>();
        ArrayList<String> menuPrize1 = new ArrayList<String>();
        ArrayList<String> modifierPrize1 = new ArrayList<String>();
        Thread.sleep(2000);
        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu = driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
        utils.log().info("1 - orderMenu.size - " + orderMenu.size());
        for (int i = 1; i <= orderMenu.size(); i++) {

            WebElement orderMenuName = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])[" + i + "]"));
            menuName1.add(orderMenuName.getText());
            utils.log().info(orderMenuName.getText());
//        TestUtils.menuName1 = menuName1;

            WebElement orderMenuPrize1 = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])[" + i + "]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize1.add(orderMenuPrize1.getText());
            utils.log().info(orderMenuPrize1.getText());
//        TestUtils.menuPrize1 = menuPrize1;
            TestUtils.MenuCounts1 = menuName1;
            utils.log().info("Window 1 - Seat 2 iPad -1 Order Screen Menu SAME with iPad-2 Menu - " + menuName1 + " Prize " + menuPrize1);
            try {
                List<WebElement> modifier = driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='" + menuName1.get(i - 1) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName1.get(i - 1) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));
                    if (modifier1.isDisplayed()) {
                        modifierName1.add(modifier1.getText());
                        TestUtils.modifierName1 = modifierName1;
                        WebElement modifierPrize1s = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName1.get(i - 1) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                        modifierPrize1.add(modifierPrize1s.getText());
                        TestUtils.modifierPrize1 = modifierPrize1;
                        utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName1.get(m) + " Prize - " + modifierPrize1.get(m));
                        TestUtils.ModifierCounts1 = modifierName1;
                        utils.log().info("Menus available in the iPad1 - " + orderMenuName.getText());
                        utils.log().info("Modifiers available in the iPad1 - " + modifier1.getText());
                    } else {
                        modifierName1.add(null);
                        modifierPrize1.add(null);
                    }

                }


            } catch (Exception g) {

            }
        }
        utils.log().info("Menu name Seat 4 - " + menuName1);
        utils.log().info("Menu Prize Seat 4 - " + menuPrize1);
        utils.log().info("Modifier name Seat 4 - " + modifierName1);
        utils.log().info("Modifier Prize Seat 4 - " + modifierPrize1);
    }

    public void getTheValueFromTheSeat4OnTheIpad2() throws InterruptedException {
        Thread.sleep(1000);
        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - " + subTotalAmountTxt);
        TestUtils.subTotal4 = subTotalAmountTxt;

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - " + taxAmountTxt);
        TestUtils.tax4 = taxAmountTxt;

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - " + totalAmountTxt);
        TestUtils.totalAmount4 = totalAmountTxt;

        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - " + paidAmountTxt);
        TestUtils.paidAmount4 = paidAmountTxt;
    }

    public void clickFinishIPad2() throws InterruptedException {
        Thread.sleep(1000);
        WebElement finishOrder = driver2.findElement(By.xpath("//button[(@id='os_finish')]"));
        elementClick1(finishOrder, "Finish Order selected");
    }
    public void verifySubtotalShouldNotChange1() throws InterruptedException {
        Thread.sleep(1000);
        WebElement subtotalValue =  driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        Assert.assertEquals(subtotalValue.getAttribute("value"),"$ 0.00");
        utils.log().info("Subtotal Not Change");
    }

    public void verifyMenuItemFromSeat4OnIpad2WithIpad11() throws InterruptedException {
        Thread.sleep(3000);
        List<String> menuName11=new ArrayList<String>();
        List<String> modifierName11=new ArrayList<String>();
        List<String> menuPrize11=new ArrayList<String>();
        List<String> modifierPrize11=new ArrayList<String>();


        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
        utils.log().info("orderMenu.size - " + orderMenu.size());
        for (int i = 1; i <= orderMenu.size(); i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]"));
            menuName11.add( orderMenuName.getText());
            utils.log().info(i+" "+orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize11.add(orderMenuPrize1.getText());
            utils.log().info(i+" "+orderMenuPrize1.getText());

            Assert.assertEquals(TestUtils.MenuCounts3.get(i-1), orderMenuName.getText());



            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText());
            try {
                List<WebElement> modifier =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='"+ menuName11.get(i) +"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));

                    modifierName11.add(modifier1.getText());
//                    TestUtils.modifierName11 = modifierName11;
                    WebElement modifierPrize1s = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize11.add(modifierPrize1s.getText());
//                    TestUtils.modifierPrize11 = modifierPrize11;
                    Assert.assertEquals(TestUtils.ModifierCounts3.get(i-1), modifierPrize1s.getText());
//                    Assert.assertEquals(TestUtils.menuPrize1.get(i), orderMenuPrize1.getText());
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(m) + " Prize - " + modifierPrize11.get(m));
                }

            } catch (Exception g) {

            }
        }


        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        Assert.assertEquals(TestUtils.subTotal3,subTotalAmountTxt);

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - "+taxAmountTxt);
        Assert.assertEquals(TestUtils.tax3,taxAmountTxt);

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - "+totalAmountTxt);
        Assert.assertEquals(TestUtils.totalAmount3,totalAmountTxt);


        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - "+paidAmountTxt);
        Assert.assertEquals(TestUtils.paidAmount3,paidAmountTxt);

    }

    public void verifyMenuItemFromSeat5OnIpad2WithIpad1() throws InterruptedException {
        Thread.sleep(3000);
        List<String> menuName11=new ArrayList<String>();
        List<String> modifierName11=new ArrayList<String>();
        List<String> menuPrize11=new ArrayList<String>();
        List<String> modifierPrize11=new ArrayList<String>();


        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
        utils.log().info("orderMenu.size - " + orderMenu.size());
        for (int i = 1; i <= orderMenu.size(); i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]"));
            menuName11.add( orderMenuName.getText());
            utils.log().info(i+" "+orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize11.add(orderMenuPrize1.getText());
            utils.log().info(i+" "+orderMenuPrize1.getText());

            Assert.assertEquals(TestUtils.MenuCounts4.get(i-1), orderMenuName.getText());



            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText());
            try {
                List<WebElement> modifier =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='"+ menuName11.get(i) +"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));

                    modifierName11.add(modifier1.getText());
                    TestUtils.modifierName11 = modifierName11;
                    WebElement modifierPrize1s = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize11.add(modifierPrize1s.getText());
                    TestUtils.modifierPrize11 = modifierPrize11;
                    Assert.assertEquals(TestUtils.ModifierCounts4.get(i-1), modifierPrize1s.getText());
//                    Assert.assertEquals(TestUtils.menuPrize1.get(i), orderMenuPrize1.getText());
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(m) + " Prize - " + modifierPrize11.get(m));
                }

            } catch (Exception g) {

            }
        }


        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        Assert.assertEquals(TestUtils.subTotal4,subTotalAmountTxt);

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - "+taxAmountTxt);
        Assert.assertEquals(TestUtils.tax4,taxAmountTxt);

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - "+totalAmountTxt);
        Assert.assertEquals(TestUtils.totalAmount4,totalAmountTxt);


        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - "+paidAmountTxt);
        Assert.assertEquals(TestUtils.paidAmount4,paidAmountTxt);

    }

    public void verifyTheValueFromCheckOnTheWindow2(){
        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        Assert.assertEquals(TestUtils.subTotalCheck,subTotalAmountTxt);

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - "+taxAmountTxt);
        Assert.assertEquals(TestUtils.taxCheck,taxAmountTxt);

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - "+totalAmountTxt);
        Assert.assertEquals(TestUtils.totalAmountCheck,totalAmountTxt);


        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - "+paidAmountTxt);
        Assert.assertEquals(TestUtils.paidAmountCheck,paidAmountTxt);

    }

    public void verifyTheValueFromCheckOnTheWindow21(){
        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        Assert.assertEquals(TestUtils.subTotal,subTotalAmountTxt);

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - "+taxAmountTxt);
        Assert.assertEquals(TestUtils.tax,taxAmountTxt);

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - "+totalAmountTxt);
        Assert.assertEquals(TestUtils.totalAmount,totalAmountTxt);


        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - "+paidAmountTxt);
        Assert.assertEquals(TestUtils.paidAmount,paidAmountTxt);

    }
    public void getTheValueFromTheCheckOnTheIpad2(){
        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - " + subTotalAmountTxt);
        TestUtils.subTotalCheck = subTotalAmountTxt;

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - " + taxAmountTxt);
        TestUtils.taxCheck = taxAmountTxt;

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - " + totalAmountTxt);
        TestUtils.totalAmountCheck = totalAmountTxt;

        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - " + paidAmountTxt);
        TestUtils.paidAmountCheck = paidAmountTxt;
    }

    public void selectFirstMenuFromTheSeatInWindow2ToSeeMenuOptionScreen(String  number) throws InterruptedException {

        WebElement numbers =  driver2.findElement(By.xpath("//ion-col[@class='qsrSeats_row-col md hydrated']//button["+number+"]"));
        String numbersTxt = numbers.getText();
        Assert.assertEquals(numbersTxt,number);
        elementClick2( numbers, " Window 2 Selected Seat as - "+numbersTxt);
        Thread.sleep(2000);

        WebElement e =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])[1]"));
//        String SelectedMenu = orderMenuName.getText();
//        TestUtils.RepeatMenu = SelectedMenu;
//        utils.log().info("Selected Menu Items - "+SelectedMenu);
//        elementClick2(orderMenuName,"selected - "+SelectedMenu);
//        Thread.sleep(2000);
//        WebElement e= driver2.findElement(By.xpath("(//div[@class='menu-section orderlist-flex ']//div[contains(.,'"+SelectedMenu+"')])[1]"));
        utils.log().info(e.getText());
        String SelectedMenu = e.getText();
        TestUtils.RepeatMenu = SelectedMenu;
        utils.log().info("Selected Menu Items - "+SelectedMenu);
        if(e.getText().equals(SelectedMenu)) {
            elementClick2(e, "Tapped Menu Items to see Menu Option Screen - ");
            Thread.sleep(3000);
            WebElement el9 = driver2.findElement(By.xpath("//p[contains(.,' Menu Option - "+SelectedMenu+" ')]"));
            String txt =el9.getText();
            utils.log().info(txt);
        }else{
            utils.log().info("Not Displayed Menu Option Screen");
            int w = 1/0;
        }

    }

    public void clickRepeatOptionWindow2(){

        WebElement el9 = driver2.findElement(By.xpath("//label[.='Repeat']"));
        String txt =el9.getText();
        elementClick2(el9,"Selected "+txt);

    }

    public void verifyMenuCountIsIncreaseAndVerifyRepeatMenuAddedWindow2() throws InterruptedException {
        Thread.sleep(3000);
        List<String> menuName11=new ArrayList<String>();
        List<String> modifierName11=new ArrayList<String>();
        List<String> menuPrize11=new ArrayList<String>();
        List<String> modifierPrize11=new ArrayList<String>();


        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
        utils.log().info("Window 2 Seat 2 orderMenu.size - " + orderMenu.size());
//        for (int i = 1; i < orderMenu.size()-1; i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+orderMenu.size()+"]"));
            menuName11.add( orderMenuName.getText());
            utils.log().info(orderMenu.size()+" "+orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+orderMenu.size()+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize11.add(orderMenuPrize1.getText());
            utils.log().info(orderMenu.size()+" "+orderMenuPrize1.getText());
            utils.log().info(TestUtils.RepeatMenu);

            Assert.assertEquals(TestUtils.RepeatMenu, orderMenuName.getText());

            utils.log().info("Verified Repeated Menu  - " + " " + orderMenuName.getText());

//        }
    }

}