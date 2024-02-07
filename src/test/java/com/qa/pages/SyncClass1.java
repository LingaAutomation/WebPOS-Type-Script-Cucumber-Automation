package com.qa.pages;

import com.qa.utils.TestUtils;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
import java.util.concurrent.TimeUnit;

public class SyncClass1 {

    TestUtils utils = new TestUtils();
    public WebDriver driver1 = utils.driver1 ;

    public SyncClass1(){
        PageFactory.initElements(this.driver1,this);

    }


    public void moveToTheFirst() throws InterruptedException, AWTException {
        Thread.sleep(2000);
        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_ALT);
        rb.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        rb.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        ((JavascriptExecutor) driver1).executeScript("window.focus();");
    }

    public void elementClick1(String e, String msg) {
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(e)));
        utils.log().info(msg);
        element.click();
    }

    public void elementClick1(WebElement e, String msg) {
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(e));
        utils.log().info(msg);
        element.click();
    }


    String cancelBtn= "//button[contains(.,'Cancel')]";

    public void pressCancelBtn1() throws InterruptedException {

        Thread.sleep(3000);
        elementClick1(cancelBtn, "Order type selection is cancelled.");
    }



    String allBtn = "//button[@id='os_all']";


    String tableLayoutTab = "//button[contains(.,' Table layout ')]";

    public void clickAllButtonInOrderScreen1() throws InterruptedException {
//        Thread.sleep(2000);
        elementClick1(allBtn, "All Selected - 1");
    }


    public void clickTableLayoutTab1(){
        elementClick1(tableLayoutTab, "Table layout Selected - 1");
    }
    String checkStatsTab1 = "//span[contains(.,' Check Status ')]";


    public void selectCheckStatsTab1() throws InterruptedException {
        Thread.sleep(1000);
        elementClick1(checkStatsTab1, "Tapped Check Stats Tab - 1");
    }

    public void getDirectMenuSeat1Prize(){
        WebElement subTotal =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[1]//ion-col[2]"));
        WebElement tax =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[2]//ion-col[2]"));
        WebElement paidAmount =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[3]//ion-col[2]"));
        WebElement Total =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[4]//ion-col[2]"));

    }

    public void getSeat1Prize1() {
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement subTotal =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[1]//ion-col[2]"));
        WebElement tax =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[2]//ion-col[2]"));
        WebElement paidAmount =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[3]//ion-col[2]"));
        WebElement Total =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[4]//ion-col[2]"));
        String subTotalTxt = subTotal.getText();
        TestUtils.subtotalSeat1 = subTotalTxt;
        utils.log().info("Seat 1 SubTotal - " + subTotalTxt);


        TestUtils.taxTxtSeat1 = tax.getText();
        utils.log().info("Seat 1 Total - " + tax.getText());

        String paidAmountTxt = paidAmount.getText();
        TestUtils.paidAmountSeat1 = paidAmountTxt;
        utils.log().info("Seat 1 Paid Amount - " + paidAmountTxt);

        String totalTxt = Total.getText();
        TestUtils.totalSeat1 = totalTxt;
        utils.log().info("Seat 1 Total - " + totalTxt);
    }

    public void getSeat1Prize() {
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement subTotal =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[1]//ion-col[2]"));
        WebElement tax =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[2]//ion-col[2]"));
        WebElement paidAmount =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[3]//ion-col[2]"));
        WebElement Total =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[4]//ion-col[2]"));
        String subTotalTxt = subTotal.getText();
        String subTotalTxt1 = subTotalTxt.replaceAll("[A-Z$. ]","");
        String subTotalTxt11 = subTotalTxt1.replaceAll("[,]",".");
        double subTotalTxt2 = Double.parseDouble(subTotalTxt11);
        TestUtils.subtotalTxt = subTotalTxt;
        utils.log().info("Seat 1 SubTotal - " + subTotalTxt);
        double subtotalValue = Double.parseDouble(subTotalTxt11);
        double taxValue = ((subtotalValue*8)/100);//DefaultTAx
        // TestUtils.taxTxtOfBeforeRound = String.valueOf(taxValue);


        BigDecimal taxx=new BigDecimal(taxValue).setScale(2, RoundingMode.HALF_UP);
        double a=taxx.doubleValue();
        DecimalFormat ss = new DecimalFormat("0.00");

        //double a1 = (a*100.00/100.00 );
        String taxTxt = String.valueOf(ss.format(a));
        utils.log().info("taxTxt(Seat1) is : "+taxTxt);
//        String taxTxt = String.valueOf(a);
        TestUtils.taxTxtSeat1 = taxTxt;
        TestUtils.taxTxtOfBeforeRound1 = String.valueOf(taxValue);
        utils.log().info("Before Round 1 - "+taxValue);
        String ActualValueTax = tax.getText();
        String ActualValueTax1 = ActualValueTax.replaceAll("[A-Z$. ]","");
        String ActualValueTax3 = ActualValueTax1.replaceAll(",",".");

        double a2 = Double.parseDouble(ActualValueTax3);
        DecimalFormat ss1 = new DecimalFormat("0.00");
        //a2 = (a2*100.00)/100.00;
        String ActualValueTax2 = ss1.format(a2);
        utils.log().info("taxTxt - " + taxTxt);
        utils.log().info("ActualValueTax2 - " + ActualValueTax2);
        Assert.assertEquals(taxTxt,ActualValueTax2);
        utils.log().info("Seat 1 Tax - " + taxTxt);
        String paidAmountTxt = paidAmount.getText();
        TestUtils.paidAmount = paidAmountTxt;
        utils.log().info("Seat 1 Paid Amount - " + paidAmountTxt);

        String TotalTxt = Total.getText();
        String TotalTxt1 = TotalTxt.replaceAll("[A-Z$. ]","");
        String TotalTxt11 = TotalTxt1.replaceAll("[,]",".");
        double totalTxtt = Double.parseDouble(TotalTxt11);
        DecimalFormat sss = new DecimalFormat("0.00");
        String totalTxtt1 = String.valueOf(sss.format(totalTxtt));
        utils.log().info("totalTxtt1(seat1) is : "+totalTxtt1);

        double totalValuee = subTotalTxt2+taxValue;
        utils.log().info("subTotalTxt2 "+subTotalTxt2 );
        DecimalFormat sss1 = new DecimalFormat("0.00");
        String totall1 = String.valueOf(sss1.format(totalValuee));
//        utils.log().info("a "+a );
//        BigDecimal totall=new BigDecimal(totalValuee).setScale(2, RoundingMode.HALF_UP);
//        double totall1= totall.doubleValue();
//
        String totalValuee1 = String.valueOf(totall1);
        TestUtils.totalTxt = String.valueOf(totalValuee);
        Assert.assertEquals(totalValuee1,totalTxtt1);

        utils.log().info("Seat 1 Total - " + TotalTxt);
    }

    public void verifyIPad2MenuInIpad1() throws InterruptedException {
        Thread.sleep(3000);
        java.util.List<String> menuName1=new ArrayList<String>();
        java.util.List<String> modifierName1=new ArrayList<String>();
        java.util.List<String> menuPrize1=new ArrayList<String>();
        java.util.List<String> modifierPrize1=new ArrayList<String>();


        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        java.util.List<WebElement> orderMenu =  driver1.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
        utils.log().info("orderMenu.size - " + orderMenu.size());
        for (int i = 1; i <= orderMenu.size(); i++) {

            WebElement orderMenuName =  driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]"));
            menuName1.add( orderMenuName.getText());
            utils.log().info(i+" "+orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize1.add(orderMenuPrize1.getText());
            utils.log().info(i+" "+orderMenuPrize1.getText());

            Assert.assertEquals(TestUtils.menuName11.get(i-1), orderMenuName.getText());
            Assert.assertEquals(TestUtils.menuPrize11.get(i-1), orderMenuPrize1.getText());
            TestUtils.menuName1 = menuName1;
            TestUtils.menuPrize1 = menuPrize1;

            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText());
            try {
                List<WebElement> modifier =  driver1.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='"+ menuName1.get(i) +"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName1.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));

                    modifierName1.add(modifier1.getText());
                    TestUtils.modifierName1 = modifierName1;
                    WebElement modifierPrize1s = driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName1.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize1.add(modifierPrize1s.getText());
                    TestUtils.modifierPrize1 = modifierPrize1;
                    Assert.assertEquals(TestUtils.menuName11.get(i), orderMenuName.getText());
                    Assert.assertEquals(TestUtils.menuPrize11.get(i), orderMenuPrize1.getText());
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName1.get(m) + " Prize - " + modifierPrize1.get(m));
                }

            } catch (Exception g) {

            }
        }


        WebElement subTotalAmount = driver1.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        TestUtils.subTotal = subTotalAmountTxt;

        WebElement taxAmount = driver1.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - "+taxAmountTxt);
        TestUtils.tax = taxAmountTxt;

        WebElement totalAmount = driver1.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - "+totalAmountTxt);
        TestUtils.totalAmount = totalAmountTxt;

        WebElement paidAmount = driver1.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - "+paidAmountTxt);
        TestUtils.paidAmount = paidAmountTxt;

    }

    public void verifyIPad2MenuInIpad1Seat2() throws InterruptedException {
        Thread.sleep(3000);
        java.util.List<String> menuName1=new ArrayList<String>();
        java.util.List<String> modifierName1=new ArrayList<String>();
        java.util.List<String> menuPrize1=new ArrayList<String>();
        java.util.List<String> modifierPrize1=new ArrayList<String>();


        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        java.util.List<WebElement> orderMenu =  driver1.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
        utils.log().info("orderMenu.size - " + orderMenu.size());
        for (int i = 1; i <= orderMenu.size(); i++) {

            WebElement orderMenuName =  driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]"));
            menuName1.add( orderMenuName.getText());
            utils.log().info(i+" "+orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize1.add(orderMenuPrize1.getText());
            utils.log().info(i+" "+orderMenuPrize1.getText());

            Assert.assertEquals(TestUtils.menuNameSeat2.get(i-1), orderMenuName.getText());
            Assert.assertEquals(TestUtils.menuPrize2.get(i-1), orderMenuPrize1.getText());
            TestUtils.menuName2 = menuName1;
            TestUtils.menuPrize2 = menuPrize1;

            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText());
            try {

                List<WebElement> modifier =  driver1.findElements(By.xpath("(//div[contains(@class,'menu-section')]//div[contains(.,'"+menuName1.get(i-1)+"')])["+i+"]/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                utils.log().info(modifier.size());
                for (int w = 0; w < modifier.size(); w++) {
                    int m = w+1;
                    WebElement modifier1 = driver1.findElement(By.xpath("((//div[contains(@class,'menu-section')]//div[contains(.,'" + menuName1.get(i-1) + "')])["+i+"]/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));
                    modifierName1.add(modifier1.getText());
                    TestUtils.modifierName2 = modifierName1;
                    utils.log().info("Order Screen 1 Modifier Name "+modifier1.getText());

                    WebElement modifierPrize1s = driver1.findElement(By.xpath("((//div[contains(@class,'menu-section')]//div[contains(.,'" + menuName1.get(i-1) + "')])["+i+"]/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize1.add(modifierPrize1s.getText());
                    TestUtils.modifierPrize2 = modifierPrize1;
                    utils.log().info("Window 1 - Order Screen 1 Modifier Prize "+modifierPrize1s.getText());
                    utils.log().info("Window 1 Order Screen Menu SAME with Window 2 Modifier - " + modifierName1.get(w) + " Prize - " + modifierPrize1.get(w));
                    utils.log().info("Window 1 Order Screen Menu SAME with window 2 Modifier - " + TestUtils.modifierNameSeat1.get(w) + " Prize - " + TestUtils.modifierPrizeSeat1.get(w));

                    Assert.assertEquals(TestUtils.modifierNameSeat2.get(i), orderMenuName.getText());
                    Assert.assertEquals(TestUtils.modifierPrizeSeat2.get(i), orderMenuPrize1.getText());
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName1.get(m) + " Prize - " + modifierPrize1.get(m));
                }

            } catch (Exception g) {

            }
        }


        WebElement subTotalAmount = driver1.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        Assert.assertEquals(subTotalAmountTxt,TestUtils.subTotalFromSplitSeat2);
        utils.log().info("2- SubTotal Amount - "+subTotalAmountTxt);
        TestUtils.subTotal = subTotalAmountTxt;

        WebElement taxAmount = driver1.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        Assert.assertEquals(taxAmountTxt,TestUtils.taxFromSplitSeat2);
        utils.log().info("2 - Tax - "+taxAmountTxt);
        TestUtils.tax = taxAmountTxt;

        WebElement totalAmount = driver1.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        Assert.assertEquals(totalAmountTxt,TestUtils.totalAmountFromSplitSeat2);
        utils.log().info("2 - Total Amount - "+totalAmountTxt);
        TestUtils.totalAmount = totalAmountTxt;

        WebElement paidAmount = driver1.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        Assert.assertEquals(paidAmountTxt,TestUtils.paidAmountFromSplitSeat2);
        utils.log().info("2- Paid Amount - "+paidAmountTxt);
        TestUtils.paidAmount = paidAmountTxt;

    }


    String searchTabInActiveTab = "//input[@data-placeholder='Check No']";
    public void openTheActiveCheckFromIpad1() throws InterruptedException {
        Thread.sleep(2000);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        elementClick1("//span[contains(.,' Check Status ')]","check");
        Thread.sleep(2000);
        WebElement searchActive = driver1.findElement(By.xpath(searchTabInActiveTab));
        searchActive.clear();
        searchActive.sendKeys(globalCheckNumber);
        List<WebElement> phoneOrders1 = driver1.findElements(By.xpath("//div[(@class='cdk-virtual-scroll-content-wrapper')]//div"));
        utils.log().info(phoneOrders1.size());
        if(phoneOrders1.size() == 1)
        {
            elementClick1("//div[(@class='cdk-virtual-scroll-content-wrapper')]//div[1]", "Tapped Active Check in closed tab - " + globalCheckNumber);
        }else{
            utils.log().info("Active check is not available - "+ globalCheckNumber);
            int w = 1/0;
            elementClick1("//div[(@class='cdk-virtual-scroll-content-wrapper')]//div[1]", "Tapped Closed Check in closed tab - " + globalCheckNumber);
        }
        WebElement openCheck = driver1.findElement(By.xpath("(//button[(.=' Open Check ')])"));
        elementClick1(openCheck,"Selected - Open Check");

        Thread.sleep(3000);
    }

    public void verifyIPad2MenuInIpad1Seat1() throws InterruptedException {
        Thread.sleep(3000);
        java.util.List<String> menuName1=new ArrayList<String>();
        java.util.List<String> modifierName1=new ArrayList<String>();
        java.util.List<String> menuPrize1=new ArrayList<String>();
        java.util.List<String> modifierPrize1=new ArrayList<String>();


        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        java.util.List<WebElement> orderMenu =  driver1.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
        utils.log().info("orderMenu.size - " + orderMenu.size());
        for (int i = 1; i <= orderMenu.size(); i++) {

            WebElement orderMenuName =  driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]"));
            menuName1.add( orderMenuName.getText());
            utils.log().info(i+" "+orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize1.add(orderMenuPrize1.getText());
            utils.log().info(i+" "+orderMenuPrize1.getText());
           utils.log().info( TestUtils.menuName11 );
            utils.log().info( TestUtils.menuNameSeat1 );
            Assert.assertEquals(TestUtils.menuName11.get(i-1), orderMenuName.getText());
            Assert.assertEquals(TestUtils.menuPrize11.get(i-1), orderMenuPrize1.getText());

//            TestUtils.menuQtySeat1 = menuQtySeat1;


            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText());
            try {

                List<WebElement> modifier =  driver1.findElements(By.xpath("(//div[contains(@class,'menu-section')]//div[contains(.,'"+menuName1.get(i-1)+"')])["+i+"]/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                utils.log().info(modifier.size());
                for (int w = 0; w < modifier.size(); w++) {
                    int m = w+1;
                    WebElement modifier1 = driver1.findElement(By.xpath("((//div[contains(@class,'menu-section')]//div[contains(.,'" + menuName1.get(i-1) + "')])["+i+"]/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));
                    modifierName1.add(modifier1.getText());

                    utils.log().info("Order Screen 1 Modifier Name "+modifier1.getText());

                    WebElement modifierPrize1s = driver1.findElement(By.xpath("((//div[contains(@class,'menu-section')]//div[contains(.,'" + menuName1.get(i-1) + "')])["+i+"]/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize1.add(modifierPrize1s.getText());

                    utils.log().info("Window 1 Order Screen 1 Modifier Prize "+modifierPrize1s.getText());
                    utils.log().info("Window 1 Order Screen Menu SAME with Window 2 Modifier - " + modifierName1.get(w) + " Prize - " + modifierPrize1.get(w));
                    utils.log().info("Window 1 Order Screen Menu SAME with Window 2 Modifier - " + TestUtils.modifierNameSeat1.get(w) + " Prize - " + TestUtils.modifierPrizeSeat1.get(w));

                    Assert.assertEquals(TestUtils.modifierNameSeat1.get(w), modifier1.getText());
                    Assert.assertEquals(TestUtils.modifierPrizeSeat1.get(w), modifierPrize1s.getText());

                    utils.log().info("Window 1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName1.get(w) + " Prize - " + modifierPrize1.get(w));

                }
            } catch (Exception g) {

            }


        }

        WebElement subTotalAmount = driver1.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        Assert.assertEquals(subTotalAmountTxt,TestUtils.subTotalFromSplitSeat1);
        utils.log().info("1 - SubTotal Amount - "+subTotalAmountTxt);
        TestUtils.subTotal = subTotalAmountTxt;

        WebElement taxAmount = driver1.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        Assert.assertEquals(taxAmountTxt,TestUtils.taxFromSplitSeat1);
        utils.log().info("1 - Tax - "+taxAmountTxt);
        TestUtils.tax = taxAmountTxt;

        WebElement totalAmount = driver1.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        Assert.assertEquals(totalAmountTxt,TestUtils.totalAmountFromSplitSeat1);
        utils.log().info("1 - Total Amount - "+totalAmountTxt);
        TestUtils.totalAmount = totalAmountTxt;

        WebElement paidAmount = driver1.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        Assert.assertEquals(paidAmountTxt,TestUtils.paidAmountFromSplitSeat1);
        utils.log().info("1 - Paid Amount - "+paidAmountTxt);
        TestUtils.paidAmount = paidAmountTxt;

    }

    public void orderScreenForiPad2AfterSplitMenu1() throws InterruptedException {
        List<String> menuName11=new ArrayList<String>();
        List<String> modifierName11=new ArrayList<String>();
        List<String> menuPrize11=new ArrayList<String>();
        List<String> modifierPrize11=new ArrayList<String>();
        List<String> menuQty11=new ArrayList<String>();
        List<String> modifierQty11=new ArrayList<String>();
        Thread.sleep(1000);

        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver1.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]"));
        utils.log().info("orderMenu.size() 1 - " + orderMenu.size());
        for (int i = 1; i <=orderMenu.size(); i++) {

            WebElement orderMenuName =  driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'p-col-4 orderlist-menuname')])["+i+"]"));
            menuName11.add(orderMenuName.getText());
            utils.log().info(orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'p-col-4 orderlist-menuname')])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize11.add(orderMenuPrize1.getText());

            WebElement orderMenuQty1 =  driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'p-col-4 orderlist-menuname')])["+i+"]/..//div[@class='p-col-2 orderlist-qty text-pos-center  '][1]"));
            menuQty11.add(orderMenuQty1.getText());


            Assert.assertEquals(TestUtils.menuNamesGroup.get(i-1), orderMenuName.getText());
            Assert.assertEquals(TestUtils.menuPrizeGroup.get(i-1), orderMenuPrize1.getText());
            Assert.assertEquals(TestUtils.menuQtyGroup.get(i-1), orderMenuQty1.getText());

            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText()+" "+orderMenuQty1.getText());

            try {



                List<WebElement> modifier =  driver1.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='"+ menuName11.get(i) +"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));

                    modifierName11.add(modifier1.getText());
                    TestUtils.modifierName11 = modifierName11;
                    WebElement modifierPrize1s = driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize11.add(modifierPrize1s.getText());
                    TestUtils.modifierPrize11 = modifierPrize11;
                    Assert.assertEquals(TestUtils.modifierNameGroup.get(i-1), modifier1.getText());
                    Assert.assertEquals(TestUtils.modifierPrizeGroup.get(i-1), modifierPrize1s.getText());
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(m) + " Prize - " + modifierPrize11.get(m));
                }
            } catch (Exception g) {

            }
        }

        WebElement subTotalAmount = driver1.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        Assert.assertEquals(subTotalAmountTxt,TestUtils.subTotalTxtGroup);


        WebElement taxAmount = driver1.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        Assert.assertEquals(taxAmountTxt,TestUtils.taxTxtGroup);
        utils.log().info("Tax - "+taxAmountTxt);


        WebElement totalAmount = driver1.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        Assert.assertEquals(totalAmountTxt,TestUtils.totalTxtGroup);
        utils.log().info("Total Amount - "+totalAmountTxt);


        WebElement paidAmount = driver1.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        Assert.assertEquals(paidAmountTxt,TestUtils.paidAmountTxtGroup);
        utils.log().info("Paid Amount - "+paidAmountTxt);

    }

    public void orderScreenForiPad2AfterSplitMenu2() throws InterruptedException {


        Thread.sleep(1000);
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver1.findElements(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'p-col-4 orderlist-menuname')])"));
        utils.log().info("orderMenu.size() 2 - " + orderMenu.size());
        Assert.assertEquals(orderMenu.size(),0);
        utils.log().info("Seat 2 Count is Zero");
    }

}

