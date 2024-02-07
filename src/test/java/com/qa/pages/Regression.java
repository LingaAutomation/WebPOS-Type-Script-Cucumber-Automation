package com.qa.pages;

import com.qa.utils.TestUtils;
import io.cucumber.java.sl.In;
import io.opentelemetry.api.internal.ApiUsageLogger;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.qa.utils.TestUtils.*;
import static com.qa.utils.TestUtils.modifierQtySeat1;


public class Regression extends ClockInScreen{
    TestUtils utils = new TestUtils();
    public void mergeBothIpad(String Cate) throws Exception {

        for(int i =1;i<=2;i++) {
            utils.log().info("Sync Count - "+i);
            selectMenuForDineInMerge(Cate);
//            getTheMenuNamesFromWindow1();

            new SyncClass2().moveToTheSecond();
            openTheActiveCheckFromIpad2();
            verifyIPad1MenuInIpad2();

            WebElement finishOrder =  driver2.findElement(By.xpath("//button[(@id='os_finish')]"));
            elementClick2(finishOrder, "Finish Order selected - 2");

            selectMenuForDineIn2();
//            getTheMenuNamesFromWindow2();
            doMerge1();
            WebElement seat1 =  driver2.findElement(By.xpath("//button[@id='1']"));
            elementClick2(seat1,"selected seat - "+seat1.getText());
            orderScreenForiPad2();
            WebElement seat2 =  driver2.findElement(By.xpath("//button[@id='2']"));
            elementClick2(seat2,"selected seat - "+seat2.getText());
            verifyIPad1MenuInIpad2Seat2AfterMergeDone();
            verifyCheckValueAfterMergeDone();
            elementClick2(payment,"Selected Payment");
            elementClick2(cash,"Selected Payment");
            elementClick2(submit,"Selected Payment");
            Thread.sleep(1500);
        }
    }

    public void verifyCheckValueAfterMergeDone() throws InterruptedException {

        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        int actualSubTotal = Integer.parseInt(subTotalAmountTxt.replaceAll("[A-Z$., ]",""));
        int seat1Subtotal = Integer.parseInt(TestUtils.subTotal.replaceAll("[A-Z$., ]",""));
                int seat2Subtotal = Integer.parseInt(TestUtils.subTotal1.replaceAll("[A-Z$., ]",""));
                int checkSubTotal = seat1Subtotal + seat2Subtotal ;
        utils.log().info("Check SubTotal Amount - "+checkSubTotal);
        Assert.assertEquals(actualSubTotal,checkSubTotal);
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);

        Thread.sleep(2000);
        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        int actualTax = Integer.parseInt(taxAmountTxt.replaceAll("[A-Z$., ]",""));
        int seat1Tax = Integer.parseInt(TestUtils.tax.replaceAll("[A-Z$., ]",""));
        int seat2Tax = Integer.parseInt(TestUtils.tax1.replaceAll("[A-Z$., ]",""));
        int checkTax = seat1Tax + seat2Tax ;
        utils.log().info("Tax - "+taxAmountTxt);
        utils.log().info("Check Tax Amount - "+checkTax);
        Assert.assertEquals(checkTax,actualTax);
        utils.log().info("Tax - "+taxAmountTxt);

        Thread.sleep(2000);
        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        int actualTotal = Integer.parseInt(totalAmountTxt.replaceAll("[A-Z$., ]",""));
        int seat1Total = Integer.parseInt(TestUtils.totalAmount.replaceAll("[A-Z$., ]",""));
        int seat2Total = Integer.parseInt(TestUtils.totalAmount1.replaceAll("[A-Z$., ]",""));
        int checkTotal = seat1Total + seat2Total ;
        utils.log().info("Check Total Amount - "+checkTax);
        Assert.assertEquals(checkTotal,actualTotal);
        utils.log().info("Total Amount - "+totalAmountTxt);

        Thread.sleep(2000);
        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        int actualPaidAmount = Integer.parseInt(paidAmountTxt.replaceAll("[A-Z$., ]",""));
        int seat1PaidAmount = Integer.parseInt(TestUtils.paidAmount.replaceAll("[A-Z$., ]",""));
        int seat2PaidAmount = Integer.parseInt(TestUtils.paidAmount1.replaceAll("[A-Z$., ]",""));
        int checkPaidAmount = seat1PaidAmount + seat2PaidAmount ;
        utils.log().info("Check Paid Amount - "+checkPaidAmount);
        Assert.assertEquals(checkPaidAmount,actualPaidAmount);
        utils.log().info("Paid Amount - "+paidAmountTxt);
        Thread.sleep(1000);

        WebElement order =  driver2.findElement(By.xpath("//button[@id='os_selectedSeat']"));
        String check = order.getText();
        utils.log().info("2 - Selected - "+check);
        elementClick2(order,"Selected - "+check);
        Thread.sleep(2500);

    }

    public void verifyCheckValueAfterSplitDone() throws InterruptedException {

        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        int actualSubTotal = Integer.parseInt(subTotalAmountTxt.replaceAll("[A-Z$., ]",""));
        int seat1Subtotal = Integer.parseInt(subTotalFromSplitSeat1.replaceAll("[A-Z$., ]",""));
        int seat2Subtotal = Integer.parseInt(TestUtils.subTotalFromSplitSeat2.replaceAll("[A-Z$., ]",""));
        int checkSubTotal = seat1Subtotal + seat2Subtotal ;
        utils.log().info("Check SubTotal Amount - "+checkSubTotal);
        Assert.assertEquals(actualSubTotal,checkSubTotal);
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);

        Thread.sleep(2000);
        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        int actualTax = Integer.parseInt(taxAmountTxt.replaceAll("[A-Z$., ]",""));
        int seat1Tax = Integer.parseInt(taxFromSplitSeat1.replaceAll("[A-Z$., ]",""));
        int seat2Tax = Integer.parseInt(taxFromSplitSeat2.replaceAll("[A-Z$., ]",""));
        int checkTax = seat1Tax + seat2Tax ;
        utils.log().info("Tax - "+taxAmountTxt);
        utils.log().info("Check Tax Amount - "+checkTax);
        Assert.assertEquals(checkTax,actualTax);
        utils.log().info("Tax - "+taxAmountTxt);

        Thread.sleep(2000);
        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        int actualTotal = Integer.parseInt(totalAmountTxt.replaceAll("[A-Z$., ]",""));
        int seat1Total = Integer.parseInt(totalAmountFromSplitSeat1.replaceAll("[A-Z$., ]",""));
        int seat2Total = Integer.parseInt(totalAmountFromSplitSeat2.replaceAll("[A-Z$., ]",""));
        int checkTotal = seat1Total + seat2Total ;
        utils.log().info("Check Total Amount - "+checkTax);
        Assert.assertEquals(checkTotal,actualTotal);
        utils.log().info("Total Amount - "+totalAmountTxt);

        Thread.sleep(2000);
        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        int actualPaidAmount = Integer.parseInt(paidAmountTxt.replaceAll("[A-Z$., ]",""));
        int seat1PaidAmount = Integer.parseInt(paidAmountFromSplitSeat1.replaceAll("[A-Z$., ]",""));
        int seat2PaidAmount = Integer.parseInt(paidAmountFromSplitSeat2.replaceAll("[A-Z$., ]",""));
        int checkPaidAmount = seat1PaidAmount + seat2PaidAmount ;
        utils.log().info("Check Paid Amount - "+checkPaidAmount);
        Assert.assertEquals(checkPaidAmount,actualPaidAmount);
        utils.log().info("Paid Amount - "+paidAmountTxt);
        Thread.sleep(1500);

//        WebElement order =  driver2.findElement(By.xpath("//button[@id='os_selectedSeat']"));
//        String check = order.getText();
//        utils.log().info("2 - Selected - "+check);
//        elementClick2(order,"Selected - "+check);
//        Thread.sleep(2500);

    }

    public void mergeBothIpad1(String Cate) throws Exception {

        for(int i =1;i<=2;i++) {
            utils.log().info("Sync Count - "+i);
            selectRandomMenuForDineInMerge(Cate);
//            getTheMenuNamesFromWindow1();

            new SyncClass2().moveToTheSecond();
            openTheActiveCheckFromIpad2();
            verifyIPad1MenuInIpad2();

            WebElement finishOrder =  driver2.findElement(By.xpath("//button[(@id='os_finish')]"));
            elementClick2(finishOrder, "Finish Order selected - 2");

            selectRandomMenuForDineInMerge2(Cate);
//            getTheMenuNamesFromWindow2();
            doMerge1();
            WebElement seat1 =  driver2.findElement(By.xpath("//button[@id='1']"));
            elementClick2(seat1,"selected seat - "+seat1.getText());
            orderScreenForiPad2();
            WebElement seat2 =  driver2.findElement(By.xpath("//button[@id='2']"));
            elementClick2(seat2,"selected seat - "+seat2.getText());
            verifyIPad1MenuInIpad2Seat2AfterMergeDone();

            verifyCheckValueAfterMergeDone();
            elementClick2(payment,"Selected Payment");
            elementClick2(cash,"Selected Payment");
            elementClick2(submit,"Selected Payment");
            Thread.sleep(1500);
            new SyncClass2().moveToTheFirst();
        }
    }


    public void selectTableNumberOnTheOrderScreen2() throws InterruptedException {
        Thread.sleep(2000);
        WebElement order =  driver2.findElement(By.xpath("//button[@id='os_selectedSeat']"));
        String check = order.getText();
        utils.log().info("Selected - "+check);

    }
public void getTheMenuNamesFromWindow1() throws InterruptedException {
    ArrayList<String> menuName1=new ArrayList<String>();
    ArrayList<String> modifierName1=new ArrayList<String>();
    ArrayList<String> menuPrize1=new ArrayList<String>();
    ArrayList<String> modifierPrize1=new ArrayList<String>();
     Thread.sleep(1000);
    driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    List<WebElement> orderMenu =  driver1.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname']"));
    utils.log().info("1 - orderMenu.size - " + orderMenu.size());
    for (int i = 1; i <= orderMenu.size(); i++) {

        WebElement orderMenuName =  driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]"));
        menuName1.add(orderMenuName.getText());
        utils.log().info(orderMenuName.getText());
        TestUtils.menuName1 = menuName1;

        WebElement orderMenuPrize1 =  driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[@class='p-col-4 orderlist-menuname'])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
        menuPrize1.add(orderMenuPrize1.getText());
        utils.log().info(orderMenuPrize1.getText());
        TestUtils.menuPrize1 = menuPrize1;

        utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Menu - " + menuName1+ " Prize " + menuPrize1);
        try {
            List<WebElement> modifier =  driver1.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='"+ menuName1.get(i-1) +"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
            for (int m = 1; m <= modifier.size(); m++) {
                WebElement modifier1 = driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName1.get(i-1) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));
                if (modifier1.isDisplayed()) {
                    modifierName1.add(modifier1.getText());
                    TestUtils.modifierName1 = modifierName1;
                    WebElement modifierPrize1s = driver1.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName1.get(i-1) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize1.add(modifierPrize1s.getText());
                    TestUtils.modifierPrize1 = modifierPrize1;
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName1.get(m) + " Prize - " + modifierPrize1.get(m));
                }else {
                    modifierName1.add(null);
                    modifierPrize1.add(null);
                }
            }


        } catch (Exception g) {

        }
    }
    utils.log().info("Menu name - "+menuName1);
    utils.log().info("Menu Prize - "+menuPrize1);
    utils.log().info("Modifier name - "+modifierName1);
    utils.log().info("Modifier Prize - "+modifierPrize1);

}
    public void getTheMenuNamesFromWindow2() throws InterruptedException {
        Thread.sleep(1000);
        List<String> menuName2=new ArrayList<String>();
        List<String> modifierName2=new ArrayList<String>();
        List<String> menuPrize2=new ArrayList<String>();
        List<String> modifierPrize2s=new ArrayList<String>();

        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]"));
        utils.log().info("orderMenu.size() " + orderMenu.size());
        for (int i = 1; i <= orderMenu.size(); i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')])["+i+"]"));
            menuName2.add( orderMenuName.getText());

            TestUtils.menuName2 = menuName2;

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize2.add(orderMenuPrize1.getText());
            TestUtils.menuPrize2 = menuPrize2;

            utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Menu - " + menuName2+ " Prize " + menuPrize2);
            try {
                List<WebElement> modifier =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='"+ menuName2.get(i-1) +"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName2.get(i-1) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));
//                    if (modifier1.isDisplayed()) {
                        modifierName2.add(modifier1.getText());
                        TestUtils.modifierName2 = modifierName2;
                        WebElement modifierPrize1s = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName2.get(i-1) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                        modifierPrize2s.add(modifierPrize1s.getText());
                        TestUtils.modifierPrize2 = modifierPrize2s;
                        utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName2.get(m) + " Prize - " + modifierPrize2s.get(m));
//                    }else {
//                        modifierName2.add(null);
//                        modifierPrize2s.add(null);
//                    }
                }


            } catch (Exception g) {

            }
        }
        utils.log().info("Menu name - "+menuName2);
        utils.log().info("Menu Prize - "+menuPrize2);
        utils.log().info("Modifier name - "+modifierName2);
        utils.log().info("Modifier Prize - "+modifierPrize2s);

    }
 String payment = "//button[contains(.,'Payment')]";

    String cash = "//span[contains(.,' Cash ')]";
    String submit = "//button[contains(.,'Submit')]";

    public void orderScreenForiPad2AfterSplitMenu1() throws InterruptedException {
        Thread.sleep(2000);

        List<String> menuName11=new ArrayList<String>();
        List<String> modifierName11=new ArrayList<String>();
        List<String> menuPrize11=new ArrayList<String>();
        List<String> modifierPrize11=new ArrayList<String>();
        List<String> menuQty11=new ArrayList<String>();
        List<String> modifierQty11=new ArrayList<String>();


        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]"));
        utils.log().info("orderMenu.size() 1 - " + orderMenu.size());
        for (int i = 1; i <=orderMenu.size(); i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'p-col-4 orderlist-menuname')])["+i+"]"));
            menuName11.add(orderMenuName.getText());
             utils.log().info(orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'p-col-4 orderlist-menuname')])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize11.add(orderMenuPrize1.getText());

            WebElement orderMenuQty1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'p-col-4 orderlist-menuname')])["+i+"]/..//div[@class='p-col-2 orderlist-qty text-pos-center  '][1]"));
            menuQty11.add(orderMenuQty1.getText());


            Assert.assertEquals(TestUtils.menuNameSeat1.get(i-1), orderMenuName.getText());
            Assert.assertEquals(TestUtils.menuPrize1.get(i-1), orderMenuPrize1.getText());
            Assert.assertEquals(TestUtils.menuQtySeat1.get(i-1), orderMenuQty1.getText());
            TestUtils.menuName11 = menuName11;
            TestUtils.menuPrize11 = menuPrize11;
            TestUtils.menuQty11 = menuQty11;
            utils.log().info(menuName11);
            utils.log().info( menuName11.get(i-1));
            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText()+" "+orderMenuQty1.getText());

            try {
                List<WebElement> modifier =  driver2.findElements(By.xpath("(//div[contains(@class,'menu-section')]//div[contains(.,'"+menuName11.get(i-1)+"')])["+i+"]/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                 utils.log().info(modifier.size());
                for (int w = 0; w < modifier.size(); w++) {
                   int m = w+1;
                    WebElement modifier1 = driver2.findElement(By.xpath("((//div[contains(@class,'menu-section')]//div[contains(.,'" + menuName11.get(i-1) + "')])["+i+"]/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));
                    modifierName11.add(modifier1.getText());

                    utils.log().info("Order Screen 1 Modifier Name "+modifier1.getText());

                    WebElement modifierPrize1s = driver2.findElement(By.xpath("((//div[contains(@class,'menu-section')]//div[contains(.,'" + menuName11.get(i-1) + "')])["+i+"]/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize11.add(modifierPrize1s.getText());

                    utils.log().info("Order Screen 1 Modifier Prize "+modifierPrize1s.getText());
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(w) + " Prize - " + modifierPrize11.get(w));
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + TestUtils.modifierNameSeat1.get(w) + " Prize - " + TestUtils.modifierPrizeSeat1.get(w));

                    Assert.assertEquals(TestUtils.modifierNameSeat1.get(w), modifier1.getText());
                    Assert.assertEquals(TestUtils.modifierPrizeSeat1.get(w), modifierPrize1s.getText());

                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(w) + " Prize - " + modifierPrize11.get(w));
                    TestUtils.modifierName11 = modifierName11;
                    TestUtils.modifierPrize11 = modifierPrize11;
                }
            } catch (Exception g) {

            }
        }

        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        Assert.assertEquals(subTotalAmountTxt,TestUtils.subTotalFromSplitSeat1);


        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        Assert.assertEquals(taxAmountTxt,TestUtils.taxFromSplitSeat1);
        utils.log().info("Tax - "+taxAmountTxt);


        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        Assert.assertEquals(totalAmountTxt,TestUtils.totalAmountFromSplitSeat1);
        utils.log().info("Total Amount - "+totalAmountTxt);


        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        Assert.assertEquals(paidAmountTxt,TestUtils.paidAmountFromSplitSeat1);
        utils.log().info("Paid Amount - "+paidAmountTxt);


    }

    public void orderScreenForiPad2AfterSplitMenu2() throws InterruptedException {
        List<String> menuName11=new ArrayList<String>();
        List<String> modifierName11=new ArrayList<String>();
        List<String> menuPrize11=new ArrayList<String>();
        List<String> modifierPrize11=new ArrayList<String>();
        List<String> menuQty11=new ArrayList<String>();
        List<String> modifierQty11=new ArrayList<String>();

        Thread.sleep(2000);
        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'p-col-4 orderlist-menuname')])"));
        utils.log().info("orderMenu.size() 2 - " + orderMenu.size());
        for (int i = 1; i <=orderMenu.size(); i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'p-col-4 orderlist-menuname')])["+i+"]"));
            menuName11.add( orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'p-col-4 orderlist-menuname')])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize11.add(orderMenuPrize1.getText());

            WebElement orderMenuQty1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'p-col-4 orderlist-menuname')])["+i+"]/..//div[@class='p-col-2 orderlist-qty text-pos-center  '][1]"));
            menuQty11.add(orderMenuQty1.getText());

           utils.log().info(TestUtils.menuNameSeat2.get(i-1));
            Assert.assertEquals(TestUtils.menuNameSeat2.get(i-1), orderMenuName.getText());
            Assert.assertEquals(TestUtils.menuPrize2.get(i-1), orderMenuPrize1.getText());
            Assert.assertEquals(TestUtils.menuQtySeat2.get(i-1), orderMenuQty1.getText());
            TestUtils.menuName12 = menuName11;
            TestUtils.menuPrize12 = menuPrize11;
            TestUtils.menuQty12 = menuQty11;


            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText()+" "+orderMenuQty1.getText());

            try {

                List<WebElement> modifier =  driver2.findElements(By.xpath("(//div[contains(@class,'menu-section')]//div[contains(.,'"+menuName11.get(i-1)+"')])["+i+"]/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                utils.log().info(modifier.size());
                for (int w = 0; w < modifier.size(); w++) {
                    int m = w+1;
                    WebElement modifier1 = driver2.findElement(By.xpath("((//div[contains(@class,'menu-section')]//div[contains(.,'" + menuName11.get(i-1) + "')])["+i+"]/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));
                    modifierName11.add(modifier1.getText());
                    utils.log().info("Order Screen 1 Modifier Name "+modifier1.getText());
                    TestUtils.modifierName12 = modifierName11;
                    WebElement modifierPrize1s = driver2.findElement(By.xpath("((//div[contains(@class,'menu-section')]//div[contains(.,'" + menuName11.get(i-1) + "')])["+i+"]/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize11.add(modifierPrize1s.getText());
                    TestUtils.modifierPrize12 = modifierPrize11;
                    utils.log().info("Order Screen 2 Modifier Prize "+modifierPrize1s.getText());
                    utils.log().info("Seat 2 Modifier - " + modifierName11.get(w) + " Prize - " + modifierPrize11.get(w));
                    utils.log().info("SEat 2 Modifiers - " + TestUtils.modifierName12.get(w) + " Prize - " + TestUtils.modifierPrize12.get(w));


                    Assert.assertEquals(TestUtils.modifierNameSeat2.get(w), modifier1.getText());
                    Assert.assertEquals(TestUtils.modifierPrizeSeat2.get(w), modifierPrize1s.getText());
                    utils.log().info("iPad -2 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(w) + " Prize - " + modifierPrize11.get(w));

                }
            } catch (Exception g) {

            }
        }

        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        Assert.assertEquals(subTotalAmountTxt,TestUtils.subTotalFromSplitSeat2);


        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        Assert.assertEquals(taxAmountTxt,TestUtils.taxFromSplitSeat2);
        utils.log().info("Tax - "+taxAmountTxt);


        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        Assert.assertEquals(totalAmountTxt,TestUtils.totalAmountFromSplitSeat2);
        utils.log().info("Total Amount - "+totalAmountTxt);


        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        Assert.assertEquals(paidAmountTxt,TestUtils.paidAmountFromSplitSeat2);
        utils.log().info("Paid Amount - "+paidAmountTxt);


    }
    public void orderScreenForiPad2() throws InterruptedException {

        List<String> menuName11=new ArrayList<String>();
        List<String> modifierName11=new ArrayList<String>();
        List<String> menuPrize11=new ArrayList<String>();
        List<String> modifierPrize11=new ArrayList<String>();


        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]"));
        utils.log().info("orderMenu.size() " + orderMenu.size());
        for (int i = 1; i < orderMenu.size(); i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')])["+i+"]"));
            menuName11.add( orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize11.add(orderMenuPrize1.getText());

            Assert.assertEquals(TestUtils.menuName1.get(i-1), orderMenuName.getText());
            Assert.assertEquals(TestUtils.menuPrize1.get(i-1), orderMenuPrize1.getText());
            TestUtils.menuName11 = menuName11;
            TestUtils.menuPrize11 = menuPrize11;

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
                    Assert.assertEquals(TestUtils.menuName1.get(i-1), orderMenuName.getText());
                    Assert.assertEquals(TestUtils.menuPrize1.get(i-1), orderMenuPrize1.getText());
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(m) + " Prize - " + modifierPrize11.get(m));
                }

            } catch (Exception g) {

            }
        }

        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        Assert.assertEquals(subTotalAmountTxt,TestUtils.subTotal);


        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        Assert.assertEquals(taxAmountTxt,TestUtils.tax);
        utils.log().info("Tax - "+taxAmountTxt);


        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        Assert.assertEquals(totalAmountTxt,TestUtils.totalAmount);
        utils.log().info("Total Amount - "+totalAmountTxt);


        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        Assert.assertEquals(paidAmountTxt,TestUtils.paidAmount);
        utils.log().info("Paid Amount - "+paidAmountTxt);


    }


    public void orderScreenForiPad22() throws InterruptedException {


        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]"));
        utils.log().info("orderMenu.size() " + orderMenu.size());
        for (int i = 1; i <= orderMenu.size(); i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')])["+i+"]"));
            orderMenuName1[i - 1] = orderMenuName.getText();

            TestUtils.orderMenuName[i - 1] = orderMenuName1[i - 1];

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            orderMenuPrize[i - 1] = orderMenuPrize1.getText();
            TestUtils.orderMenuPrize[i - 1] = orderMenuPrize[i - 1];
            Assert.assertEquals(TestUtils.orderMenuName[i - 1], orderMenuName1[i - 1]);
            Assert.assertEquals(TestUtils.orderMenuPrize[i - 1], orderMenuPrize[i - 1]);
            utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Menu - " + (i - 1) + " " + orderMenuName1[i - 1] + " Prize " + orderMenuPrize[i - 1]);
            try {
                List<WebElement> modifier =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='"+orderMenuName1[i]+"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='"+orderMenuName1[i]+"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])["+m+"]"));
                    modifieR[m] = modifier1.getText();
                    // TestUtils.modifier[m] = modifieR[m];
                    WebElement modifierPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='"+orderMenuName1[i]+"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])["+m+"]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize[m] = modifierPrize1.getText();
                    //   TestUtils.modifierPrize[m] = modifierPrize[m];
                    Assert.assertEquals(TestUtils.modifier[m], modifieR[m]);
                    Assert.assertEquals(TestUtils.modifierPrize[m], modifierPrize[m]);
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifieR[m] + " Prize - " + modifierPrize[m]);
                }

            } catch (Exception g) {

            }
        }
        WebElement subTotalAmount =  driver2.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        Assert.assertEquals(subTotalAmountTxt,TestUtils.subTotal1);
        utils.log().info("SubTotal Amount Is SAME in iPad1 & iPad2 - "+subTotalAmountTxt);


        WebElement taxAmount =  driver2.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        Assert.assertEquals(taxAmountTxt,TestUtils.tax1);
        utils.log().info("Tax Is SAME in iPad1 & iPad2 - "+taxAmountTxt);


        WebElement totalAmount =  driver2.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        Assert.assertEquals(totalAmountTxt,TestUtils.totalAmount1);
        utils.log().info("Total AmountIs SAME in iPad1 & iPad2 - "+totalAmountTxt);


        WebElement paidAmount =  driver2.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        Assert.assertEquals(paidAmountTxt,TestUtils.paidAmount1);
        utils.log().info("Paid Amount Is SAME in iPad1 & iPad2 - "+paidAmountTxt);



    }


    public void doMerge1() throws InterruptedException {
        driver2.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(200);
        WebElement mergeBtnn =  driver2.findElement(By.xpath("//span[contains(.,'Merge')]"));
        elementClick1(mergeBtnn, "Merge Button Selected");
        String tableNo = TestUtils.tableNumberof;
        verifyTableMergee2(tableNo);
        String tableNo1 = TestUtils.tableNumberof1;
        utils.log().info("tableNo1 "+tableNo1);
        verifyTableMergee3(tableNo1);

        WebElement doneBtnn =  driver2.findElement(By.xpath("//button[contains(.,' Done ')]"));
        elementClick1(doneBtnn, "Merge Done Button Selected");

        Thread.sleep(2000);
try {
    WebElement doneBtnn1 = driver2.findElement(By.xpath("//button[contains(.,'Done')]"));
    elementClick1(doneBtnn1, "POPUP Done Button Selected");
}catch (Exception w){

}
        //   afterMergeOpenSeat(tableNo);
        afterMergeOpenCheck(tableNo);
    }



    public void verifyTableMergee2(String m) throws InterruptedException {

        utils.log().info("M - "+m);
        Thread.sleep(1000);
        WebElement tableSelect =  driver2.findElement(By.xpath("(//label[.='"+m+"'])[1]"));
        if (tableSelect.isDisplayed()) {                                                                     //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[15]
            Thread.sleep(1500);
            elementClick2(tableSelect, "Selected Table - " + tableSelect.getText());
            try {
                WebElement checks =  driver2.findElement(By.xpath("//ion-title[.='Checks']"));

                if (checks.isDisplayed()) {
                    Thread.sleep(1500);
                    String globalCheckNumber = TestUtils.globalCheckNumber;

                    WebElement checkNumberrr =  driver2.findElement(By.xpath("//ion-content[contains(@class,'table-multiple-checks')]//div//p[.='"+globalCheckNumber+"']"));
                    if (checkNumberrr.isDisplayed()) {
                        Thread.sleep(1500);
                        elementClick2(checkNumberrr, " Selected Check Number - " + checkNumberrr.getText());
                        Thread.sleep(1500);
                        WebElement x =  driver2.findElement(By.xpath("//*[@id='multiple-Check']/app-table-multiple-checks/ion-header/ion-toolbar/button/span[1]/linga-icon"));
                        elementClick2(x, "Tapped X Button");
                    } else {

                    }



                } else {
//                    WebElement table1 =  driver.findElement(By.xpath("//p[@id='tableNameId']//label[.='"+m+"']"));
//                    elementClick(table1, "table SELECTED - " + m);
                }
            } catch (Exception w) {

            }
        }
    }

    public void verifyTableMergee1(String m) throws InterruptedException {

        utils.log().info("M - "+m);
        Thread.sleep(1000);
        WebElement tableSelect =  driver1.findElement(By.xpath("(//label[.='"+m+"'])[1]"));
        if (tableSelect.isDisplayed()) {                                                                     //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[15]

            Thread.sleep(1500);
            elementClick1(tableSelect, "Selected Table - " + tableSelect.getText());
            try {
                WebElement checks =  driver1.findElement(By.xpath("//ion-title[.='Checks']"));

                if (checks.isDisplayed()) {
                    Thread.sleep(1500);
                    String globalCheckNumber = TestUtils.globalCheckNumber;

                    WebElement checkNumberrr =  driver1.findElement(By.xpath("//ion-content[contains(@class,'table-multiple-checks')]//div//p[.='"+globalCheckNumber+"']"));
                    if (checkNumberrr.isDisplayed()) {
                        Thread.sleep(1500);
                        elementClick1(checkNumberrr, " Selected Check Number - " + checkNumberrr.getText());
                        Thread.sleep(1500);
                        WebElement x =  driver1.findElement(By.xpath("//*[@id='multiple-Check']/app-table-multiple-checks/ion-header/ion-toolbar/button/span[1]/linga-icon"));
                        elementClick1(x, "Tapped X Button");
                    } else {

                    }



                } else {
//                    WebElement table1 =  driver.findElement(By.xpath("//p[@id='tableNameId']//label[.='"+m+"']"));
//                    elementClick(table1, "table SELECTED - " + m);
                }
            } catch (Exception w) {

            }
        }
    }

    public void afterMergeOpenCheck(String m) throws InterruptedException {
        utils.log().info("M - "+m);
        Thread.sleep(1000);
        WebElement tableSelect =  driver2.findElement(By.xpath("(//label[.='"+m+"'])[1]"));
        if (tableSelect.isDisplayed()) {                                                                     //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[15]

            Thread.sleep(1000);
            elementClick2(tableSelect, "1 -Selected Table - " + tableSelect.getText());
            try {
                WebElement checks =  driver2.findElement(By.xpath("//ion-title[.='Checks']"));

                if (checks.isDisplayed()) {
                    Thread.sleep(1000);
                    String globalCheckNumber = TestUtils.globalCheckNumber;

                    WebElement checkNumberrr =  driver2.findElement(By.xpath("//ion-content[contains(@class,'table-multiple-checks')]//div//p[.='"+globalCheckNumber+"']"));
                    if (checkNumberrr.isDisplayed()) {
                        Thread.sleep(1000);
                        elementClick2(checkNumberrr, "1 -Selected Check Number - " + checkNumberrr.getText());
                        Thread.sleep(1000);
                        WebElement x =  driver2.findElement(By.xpath("//*[@id='multiple-Check']/app-table-multiple-checks/ion-header/ion-toolbar/button/span[1]/linga-icon"));
                        elementClick2(x, "1 -Tapped X Button");
                    } else {

                    }
                } else {
                }
            } catch (Exception w) {

            }
        }
    }


    public void verifyTableMergee3(String m) throws InterruptedException {

        utils.log().info("M2 - "+m);
        Thread.sleep(1000);
        WebElement tableSelect =  driver2.findElement(By.xpath("(//label[.='"+m+"'])[1]"));
        if (tableSelect.isDisplayed()) {                                                                     //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[15]

            Thread.sleep(1000);
            elementClick2(tableSelect, "2 - Selected Table - " + tableSelect.getText());
            try {
                WebElement checks =  driver2.findElement(By.xpath("//ion-title[.='Checks']"));

                if (checks.isDisplayed()) {
                    Thread.sleep(1000);
                    String globalCheckNumber = TestUtils.globalCheckNumber1;

                    WebElement checkNumberrr =  driver2.findElement(By.xpath("//ion-content[contains(@class,'table-multiple-checks')]//div//p[.='"+globalCheckNumber+"']"));
                    if (checkNumberrr.isDisplayed()) {
                        Thread.sleep(1000);
                        elementClick2(checkNumberrr, " 2 - Selected Check Number - " + checkNumberrr.getText());
                        Thread.sleep(1000);
                        WebElement x =  driver2.findElement(By.xpath("//*[@id='multiple-Check']/app-table-multiple-checks/ion-header/ion-toolbar/button/span[1]/linga-icon"));
                        elementClick2(x, "2 - Tapped X Button");
                    } else {

                    }

                } else {
//                    WebElement table1 =  driver.findElement(By.xpath("//p[@id='tableNameId']//label[.='"+m+"']"));
//                    elementClick(table1, "table SELECTED - " + m);
                }
            } catch (Exception w) {

            }
        }
    }


    String arrowDownForOtherMenuItems ="//button[@id='os_catMenu']";
    public String checkNumber="";
    public String getCheckNumberTxt(){
        WebElement checkNum=driver1.findElement(By.xpath("(//p[contains(@class,'order-header-checkno')])"));
        checkNumber=checkNum.getText();
        TestUtils.globalCheckNumber=checkNumber;
        utils.log().info(checkNumber);
        return checkNumber;
    }

    public String getCheckNumberTxt1(){
        WebElement checkNum=driver2.findElement(By.xpath("(//p[contains(@class,'order-header-checkno')])"));
        checkNumber=checkNum.getText();
        TestUtils.globalCheckNumber1=checkNumber;
        utils.log().info(checkNumber);
        return checkNumber;
    }

    public int itemToSelect;
    public String selectMenuForDineIn2() throws Exception {
            selectRandomTable1("1");
            getCheckNumberTxt1();

            WebElement arrowDonwForCate = driver2.findElement(By.xpath("//button[@id='os_catMenu']"));
            elementClick1(arrowDonwForCate, "Arrow Done");

            /**** Random Select Category ****/

            WebElement cate =  driver2.findElement(By.xpath("//div[contains(@class,'center-name category-container')]/div[contains(.,'CIMiniFood')]"));
            elementClick1(cate, "Tapped category - " + cate.getText());

            /*****  RandOm Select Menu ****/

            WebElement order =  driver2.findElement(By.xpath("//button[@id='os_selectedSeat']"));
             check = order.getText();
            TestUtils.tableNumberof1 = check;
            utils.log().info("Table Number from the order screen - " + check);


            WebElement miniParota = driver2.findElement(By.xpath("(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Mini parota')])[1]"));
             TestUtils.menu3 = miniParota.getText();
            elementClick1(miniParota, "2 - Tapped Menu - " + miniParota.getText());
            WebElement miniIdly = driver2.findElement(By.xpath("(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Mini idly')])[1]"));
            TestUtils.menu4 = miniIdly.getText();
            elementClick1(miniIdly, "2 - Tapped Menu" + miniIdly.getText());

            /////////     GET THE DETAILS OF MENU VALUES  ////////////
        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        TestUtils.subTotal1 = subTotalAmountTxt;

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - "+taxAmountTxt);
        TestUtils.tax1 = taxAmountTxt;

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - "+totalAmountTxt);
        TestUtils.totalAmount1 = totalAmountTxt;

        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - "+paidAmountTxt);
        TestUtils.paidAmount1 = paidAmountTxt;
        //getTheMenuFromOrderScreen();
        //  getTheListOfTheMenuFromTheOrderScreen();
getTheMenuNamesFromWindow2();
        WebElement finishOrder = driver2.findElement(By.xpath("//button[(@id='os_finish')]"));
        elementClick1(finishOrder, "Finish Order selected");

        return check;
        }



    public String check=" ";

    public String tableNumber = " ";
    public String selectRandomTable(String number) throws InterruptedException {
        Thread.sleep(2000);
        driver1.manage().timeouts().implicitlyWait(TestUtils.driverWAIT, TimeUnit.SECONDS);
        WebElement New =  driver1.findElement(By.xpath("//div[contains(.,'New Check')]"));
        elementClick1(New, "Tapped New");
        List<WebElement> tablee = driver1.findElements(By.xpath("//div[@class='table-layout-block ng-star-inserted']//button"));
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
            WebElement tableNum =  driver1.findElement(By.xpath("//div[@class='table-layout-block ng-star-inserted']//button["+itemToSelect+"]//div[1]//label[1]"));
            utils.log().info(tableNum.getText());
            elementClick1(tableNum, "Tapped Table " + itemToSelect);

            WebElement seat =  driver1.findElement(By.xpath("//span[.='"+number+"']"));
            elementClick1(seat, "Tapped seat Number");
            WebElement cont =  driver1.findElement(By.xpath("//span[.=' Continue ']"));
            elementClick1(cont, "Tapped continue");

        }
        return tableNumber;
    }

    public String selectRandomTable1(String number) throws InterruptedException {
        Thread.sleep(2000);
        elementClick2(tableLayoutTab, "Table layout Selected - 2");
        Thread.sleep(1000);
        WebElement New =  driver2.findElement(By.xpath("//div[contains(.,'New Check')]"));
        elementClick1(New, "Tapped New");
        List<WebElement> tablee = driver2.findElements(By.xpath("//div[@class='table-layout-block ng-star-inserted']//button"));
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
            WebElement tableNum =  driver2.findElement(By.xpath("//div[@class='table-layout-block ng-star-inserted']//button["+itemToSelect+"]//div[1]//label[1]"));
            utils.log().info(tableNum.getText());
            elementClick1(tableNum, "Tapped Table " + itemToSelect);

            WebElement seat =  driver2.findElement(By.xpath("//span[.='"+number+"']"));
            elementClick1(seat, "Tapped seat Number");
            WebElement cont =  driver2.findElement(By.xpath("//span[.=' Continue ']"));
            elementClick1(cont, "Tapped continue");

        }
        return tableNumber;
    }

    String searchTabInActiveTab = "//input[@data-placeholder='Check No']";

    String searchTabClosedTab = "//input[@data-placeholder='Check No']";
    public void openTheActiveCheckFromIpad2() throws InterruptedException {
        Thread.sleep(2000);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        elementClick2("//span[contains(.,' Check Status ')]","check");
        Thread.sleep(2000);
        WebElement searchActive = driver2.findElement(By.xpath(searchTabInActiveTab));
        searchActive.clear();
        searchActive.sendKeys(globalCheckNumber);
        List<WebElement> phoneOrders1 = driver2.findElements(By.xpath("//div[(@class='cdk-virtual-scroll-content-wrapper')]//div"));
        utils.log().info(phoneOrders1.size());
        if(phoneOrders1.size() == 1)
        {
            elementClick2("//div[(@class='cdk-virtual-scroll-content-wrapper')]//div[1]", "Tapped Active Check in closed tab - " + globalCheckNumber);
        }else{
            utils.log().info("Active check is not available - "+ globalCheckNumber);
//            int w = 1/0;
            elementClick2("//div[(@class='cdk-virtual-scroll-content-wrapper')]//div[1]", "Tapped Closed Check in closed tab - " + globalCheckNumber);
        }
        WebElement openCheck = driver2.findElement(By.xpath("(//button[(.=' Open Check ')])"));
        elementClick2(openCheck,"Selected - Open Check");


    }

    public String[] orderMenuName1 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifieR = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] orderMenuPrize = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifierPrize = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

    public String[] orderMenuName2 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifieR2 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] orderMenuPrize2 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] OmodifierPrize2 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

    public void verifyIPad1MenuInIpad2() throws InterruptedException {
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

            Assert.assertEquals(TestUtils.menuName1.get(i-1), orderMenuName.getText());
            Assert.assertEquals(TestUtils.menuPrize1.get(i-1), orderMenuPrize1.getText());
            TestUtils.menuName11 = menuName11;
            TestUtils.menuPrize11 = menuPrize11;

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
                        Assert.assertEquals(TestUtils.menuName1.get(i), orderMenuName.getText());
                        Assert.assertEquals(TestUtils.menuPrize1.get(i), orderMenuPrize1.getText());
                        utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(m) + " Prize - " + modifierPrize11.get(m));
                }

            } catch (Exception g) {

            }
        }


        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        TestUtils.subTotal = subTotalAmountTxt;

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - "+taxAmountTxt);
        TestUtils.tax = taxAmountTxt;

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - "+totalAmountTxt);
        TestUtils.totalAmount = totalAmountTxt;

        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - "+paidAmountTxt);
        TestUtils.paidAmount = paidAmountTxt;

    }



    public void verifyIPad1MenuInIpad2Seat2AfterMergeDone() throws InterruptedException {
        List<String> menuName11=new ArrayList<String>();
        List<String> modifierName11=new ArrayList<String>();
        List<String> menuPrize11=new ArrayList<String>();
        List<String> modifierPrize11=new ArrayList<String>();


        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]"));
        utils.log().info("orderMenu.size() " + orderMenu.size());
        for (int i = 1; i <= orderMenu.size(); i++) {

            WebElement orderMenuName =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')])["+i+"]"));
            menuName11.add( orderMenuName.getText());

            WebElement orderMenuPrize1 =  driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')])["+i+"]/..//div[@class='p-col-3 text-pos-end '][1]"));
            menuPrize11.add(orderMenuPrize1.getText());

            Assert.assertEquals(TestUtils.menuName2.get(i-1), orderMenuName.getText());
            Assert.assertEquals(TestUtils.menuPrize2.get(i-1), orderMenuPrize1.getText());
//            TestUtils.menuName11 = menuName11;
//            TestUtils.menuPrize11 = menuPrize11;

            utils.log().info("Verified - " + " " + orderMenuName.getText() + " Prize " + orderMenuPrize1.getText());
            try {
                List<WebElement> modifier =  driver2.findElements(By.xpath("//div[contains(@class,'menu-section')]//div[text()='"+ menuName11.get(i) +"']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')]"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]"));
                    modifierName11.add(modifier1.getText());
                    utils.log().info("Modifier Name - "+modifier1.getText());
//                    TestUtils.modifierName11 = modifierName11;
                    WebElement modifierPrize1s = driver2.findElement(By.xpath("(//div[contains(@class,'menu-section')]//div[text()='" + menuName11.get(i) + "']/../..//div[contains(@class,'modifier-section')]/div[contains(@class,'menuname')])[" + m + "]/../div[@class='p-col-3 text-pos-end qsr-mod-padding '][1]"));
                    modifierPrize11.add(modifierPrize1s.getText());
                    utils.log().info("Modifier Prize - "+modifierPrize1s.getText());
//                    TestUtils.modifierPrize11 = modifierPrize11;
                    Assert.assertEquals(TestUtils.modifierName2.get(i-1), modifier1.getText());
                    Assert.assertEquals(TestUtils.modifierPrize2.get(i-1), modifierPrize1s.getText());
                    utils.log().info("iPad -1 Order Screen Menu SAME with iPad-2 Modifier - " + modifierName11.get(m) + " Prize - " + modifierPrize11.get(m));
                }

            } catch (Exception g) {

            }
        }


        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        Assert.assertEquals(subTotalAmountTxt,TestUtils.subTotal1);
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);


        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        Assert.assertEquals(taxAmountTxt,TestUtils.tax1);
        utils.log().info("Tax - "+taxAmountTxt);


        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        Assert.assertEquals(totalAmountTxt,TestUtils.totalAmount1);
        utils.log().info("Total Amount - "+totalAmountTxt);


        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        Assert.assertEquals(paidAmountTxt,TestUtils.paidAmount1);
        utils.log().info("Paid Amount - "+paidAmountTxt);
        Thread.sleep(1000);

        WebElement order =  driver2.findElement(By.xpath("//button[@id='os_selectedSeat']"));
        String check = order.getText();
        utils.log().info("2 - Selected - "+check);
        elementClick2(order,"Selected - "+check);
        Thread.sleep(2500);
    }

    public String selectRandomMenu2(String category) {

        WebElement arrowDonwForCate = driver2.findElement(By.xpath("//button[@id='os_catMenu']"));
        elementClick1(arrowDonwForCate, "Arrow Done");

        /**** Random Select Category ****/

        WebElement cate = driver2.findElement(By.xpath("//div[contains(@class,'center-name category-container')]/div[contains(.,'" + category + "')]"));
        elementClick1(cate, "Tapped category - " + cate.getText());

        /****  RandOm Select Menu ***/

        WebElement order =  driver2.findElement(By.xpath("//button[@id='os_selectedSeat']"));
        String check = order.getText();
        utils.log().info("2 - Selected - "+check);



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
                TestUtils.menu1 = menuName.getText();
                elementClick1(menuName, "Tapped Menu - " + menuName.getText());

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
                            elementClick1(mainModi, mainModi.getText() + " - Tapped Main Modifier");
                        }
                        WebElement donee =  driver2.findElement(By.xpath("//button[contains(.,'Done')]"));
                        elementClick1(donee, "1 - Done Selected");
                    } else {
                    }

                } catch (Exception x) {
                }
            }
        }

        return category;
    }


    public String selectRandomMenu(String category) {

        WebElement arrowDonwForCate = driver1.findElement(By.xpath("//button[@id='os_catMenu']"));
        elementClick1(arrowDonwForCate, "Arrow Done");

        /**** Random Select Category ****/

        WebElement cate = driver1.findElement(By.xpath("//div[contains(@class,'center-name category-container')]/div[contains(.,'" + category + "')]"));
        elementClick1(cate, "Tapped category - " + cate.getText());

        /****  RandOm Select Menu ***/

        WebElement order =  driver1.findElement(By.xpath("//button[@id='os_selectedSeat']"));
        String check = order.getText();
        utils.log().info("2 - Selected - "+check);



            WebElement menuCollection1 =  driver1.findElement(By.xpath("//div[@class='ion-col fill-container   menuItem-col']"));
            if (menuCollection1.isDisplayed()) {
                List<WebElement > menuCollection =  driver1.findElements(By.xpath("//div[@class='ion-col fill-container   menuItem-col']//button"));
                int count1 = menuCollection.size();
                Random rand1 = new Random();

                for (int j = 1; j <= 2; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }

                    utils.log().info(itemToSelect1);

                    WebElement menuName =  driver1.findElement(By.xpath("//div[@class='ion-col fill-container   menuItem-col']//button["+itemToSelect1+"]//div"));
                    TestUtils.menu = menuName.getText();
                    elementClick1(menuName, "Tapped Menu - " + menuName.getText());

                    try {
                        WebElement mainModi1 =  driver1.findElement(By.xpath("//ion-col[@class='mod-but md hydrated']"));
                        if ((mainModi1.isDisplayed())) {
                            List<WebElement > mainModi10 =  driver1.findElements(By.xpath("//ion-col[@class='mod-but md hydrated']//button"));
                            int count2 = mainModi10.size();
                            Random rand2 = new Random();
                            for (int k = 1; k <= 1; k++) {
                                int itemToSelect2 = rand2.nextInt(count2);

                                if (itemToSelect2 == 0) {
                                    itemToSelect2 = 1;
                                }
                                WebElement mainModi =  driver1.findElement(By.xpath("//ion-col[@class='mod-but md hydrated']//button["+itemToSelect2+"]//span[1]"));
                                elementClick1(mainModi, mainModi.getText() + " - Tapped Main Modifier");
                            }
                            WebElement donee =  driver1.findElement(By.xpath("//button[contains(.,'Done')]"));
                            elementClick1(donee, "1 - Done Selected");
                        } else {
                        }

                    } catch (Exception x) {
                    }
                }
            }

        return category;
    }



    public String selectRandomMenuForDineInMerge(String cate1) throws Exception {
        selectRandomTable("1");
        getCheckNumberTxt();

        WebElement arrowDonwForCate = driver1.findElement(By.xpath("//button[@id='os_catMenu']"));
        elementClick1(arrowDonwForCate, "Arrow Done");

        /**** Random Select Category ****/

        WebElement cate = driver1.findElement(By.xpath("//div[contains(@class,'center-name category-container')]/div[contains(.,'" + cate1 + "')]"));
        elementClick1(cate, "Tapped category - " + cate.getText());

        /*****  RandOm Select Menu ****/

        WebElement order = driver1.findElement(By.xpath("//button[@id='os_selectedSeat']"));
        check = order.getText();
        TestUtils.tableNumberof = check;
        utils.log().info("Table Number from the order screen - " + check);
             selectRandomMenu(cate1);
           getTheMenuNamesFromWindow1();
            /////////     GET THE DETAILS OF MENU VALUES  ////////////
            WebElement subTotalAmount = driver1.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
            String subTotalAmountTxt = subTotalAmount.getAttribute("value");
            utils.log().info("SubTotal Amount - " + subTotalAmountTxt);
            TestUtils.subTotal = subTotalAmountTxt;

            WebElement taxAmount = driver1.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
            String taxAmountTxt = taxAmount.getAttribute("value");
            utils.log().info("Tax - " + taxAmountTxt);
            TestUtils.tax = taxAmountTxt;

            WebElement totalAmount = driver1.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
            String totalAmountTxt = totalAmount.getAttribute("value");
            utils.log().info("Total Amount - " + totalAmountTxt);
            TestUtils.totalAmount = totalAmountTxt;

            WebElement paidAmount = driver1.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
            String paidAmountTxt = paidAmount.getAttribute("value");
            utils.log().info("Paid Amount - " + paidAmountTxt);
            TestUtils.paidAmount = paidAmountTxt;
            //getTheMenuFromOrderScreen();
            //  getTheListOfTheMenuFromTheOrderScreen();
            getTheMenuNamesFromWindow1();
            WebElement finishOrder = driver1.findElement(By.xpath("//button[(@id='os_finish')]"));
            elementClick1(finishOrder, "Finish Order selected");

        return check;
    }

    public String selectRandomMenuForDineInMerge2(String cate1) throws Exception {
        selectRandomTable1("1");
        getCheckNumberTxt1();

        WebElement arrowDonwForCate = driver2.findElement(By.xpath("//button[@id='os_catMenu']"));
        elementClick1(arrowDonwForCate, "Arrow Done");

        /**** Random Select Category ****/

        WebElement cate =  driver2.findElement(By.xpath("//div[contains(@class,'center-name category-container')]/div[contains(.,'CIMiniFood')]"));
        elementClick1(cate, "Tapped category - " + cate.getText());

        /*****  RandOm Select Menu ****/

        WebElement order =  driver2.findElement(By.xpath("//button[@id='os_selectedSeat']"));
        check = order.getText();
        TestUtils.tableNumberof1 = check;
        selectRandomMenu2(cate1);

        /////////     GET THE DETAILS OF MENU VALUES  ////////////
        WebElement subTotalAmount = driver2.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmountTxt = subTotalAmount.getAttribute("value");
        utils.log().info("SubTotal Amount - "+subTotalAmountTxt);
        TestUtils.subTotal1 = subTotalAmountTxt;

        WebElement taxAmount = driver2.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String taxAmountTxt = taxAmount.getAttribute("value");
        utils.log().info("Tax - "+taxAmountTxt);
        TestUtils.tax1 = taxAmountTxt;

        WebElement totalAmount = driver2.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String totalAmountTxt = totalAmount.getAttribute("value");
        utils.log().info("Total Amount - "+totalAmountTxt);
        TestUtils.totalAmount1 = totalAmountTxt;

        WebElement paidAmount = driver2.findElement(By.xpath("//div[@id='os_paidAmountStr']//input"));
        String paidAmountTxt = paidAmount.getAttribute("value");
        utils.log().info("Paid Amount - "+paidAmountTxt);
        TestUtils.paidAmount1 = paidAmountTxt;
        //getTheMenuFromOrderScreen();
        //  getTheListOfTheMenuFromTheOrderScreen();
        getTheMenuNamesFromWindow2();
        WebElement finishOrder = driver2.findElement(By.xpath("//button[(@id='os_finish')]"));
        elementClick1(finishOrder, "Finish Order selected");

        return check;
    }

    public String selectMenuForDineInMerge(String cate1) throws Exception {
        selectRandomTable("1");
        getCheckNumberTxt();

        WebElement arrowDonwForCate = driver1.findElement(By.xpath("//button[@id='os_catMenu']"));
        elementClick1(arrowDonwForCate, "Arrow Done");

        /**** Random Select Category ****/

        WebElement cate =  driver1.findElement(By.xpath("//div[contains(@class,'center-name category-container')]/div[contains(.,'"+cate1+"')]"));
        elementClick1(cate, "Tapped category - " + cate.getText());

        /*****  RandOm Select Menu ****/

        WebElement order =  driver1.findElement(By.xpath("//button[@id='os_selectedSeat']"));
        check = order.getText();
        TestUtils.tableNumberof = check;
        utils.log().info("Table Number from the order screen - " + check);


        WebElement miniParota = driver1.findElement(By.xpath("(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Mini parota')])[1]"));
        TestUtils.menu1 = miniParota.getText();
        elementClick1(miniParota, "1 - Tapped Menu - " + miniParota.getText());
        WebElement miniIdly = driver1.findElement(By.xpath("(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Mini idly')])[1]"));
        TestUtils.menu2 = miniIdly.getText();
        elementClick1(miniIdly, "1 - Tapped Menu" + miniIdly.getText());

        /////////     GET THE DETAILS OF MENU VALUES  ////////////
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
        //getTheMenuFromOrderScreen();
        //  getTheListOfTheMenuFromTheOrderScreen();
        getTheMenuNamesFromWindow1();
        WebElement finishOrder = driver1.findElement(By.xpath("//button[(@id='os_finish')]"));
        elementClick1(finishOrder, "Finish Order selected");

        return check;
    }
    @FindBy (xpath = "//linga-icon[(@symbol='logout')]")
    private WebElement powerBtn;
public void clickPower(){
        elementClick1("//linga-icon[(@symbol='logout')]","1 - Power");
}

    public void clickPower1(){
        elementClick2("//linga-icon[(@symbol='logout')]","2 - Power");
    }

    public void splitGroupBothIpad(String cate) throws Exception {
        for(int i =1;i<=2;i++) {
            utils.log().info("Sync Count - "+i);
            selectMenuForDineInMerge(cate);
            openTheActiveCheckFromIpad2();
            verifyIPad1MenuInIpad2();
            WebElement finishOrder =  driver2.findElement(By.xpath("//button[(@id='os_finish')]"));
            elementClick2(finishOrder, "Finish Order selected - 2");

            doSplit();

            WebElement saveAndClose =  driver2.findElement(By.xpath("(//button[.=' Save & Close '])"));
            elementClick1(saveAndClose,"Selected - "+saveAndClose.getText());

            WebElement seat1 =  driver2.findElement(By.xpath("//button[@id='1']"));
            elementClick2(seat1,"selected seat - "+seat1.getText());

            orderScreenForiPad2AfterSplitMenu1();

            WebElement seat2 =  driver2.findElement(By.xpath("//button[@id='2']"));
            elementClick2(seat2,"selected seat - "+seat2.getText());

            orderScreenForiPad2AfterSplitMenu2();

            WebElement order =  driver2.findElement(By.xpath("//button[@id='os_selectedSeat']"));
            String check = order.getText();

            elementClick2(order,"Selected - "+check);

            verifyCheckValueAfterSplitDone();

            WebElement finishOrder1 =  driver2.findElement(By.xpath("//button[(@id='os_finish')]"));
            elementClick2(finishOrder1, "Finish Order selected - 2");

            Thread.sleep(1000);

            moveToTheFirst();

            new SyncClass1().openTheActiveCheckFromIpad1();

            WebElement seat11 =  driver1.findElement(By.xpath("//button[@id='1']"));
            elementClick1(seat11,"selected seat - "+seat11.getText());

            new SyncClass1().verifyIPad2MenuInIpad1Seat1();

//            new SyncClass1().verifyIPad2MenuInIpad1();

            WebElement seat12 =  driver1.findElement(By.xpath("//button[@id='2']"));
            elementClick1(seat12,"selected seat - "+seat12.getText());

            new SyncClass1().verifyIPad2MenuInIpad1Seat2();

            WebElement finishOrder2 =  driver1.findElement(By.xpath("//button[(@id='os_finish')]"));
            elementClick1(finishOrder2, "Finish Order selected - 1");

            doGroupActionInIpad1();

            WebElement seat111 =  driver1.findElement(By.xpath("//button[@id='1']"));
            elementClick2(seat111,"selected seat - "+seat111.getText());

            new SyncClass1().orderScreenForiPad2AfterSplitMenu1();

            WebElement seat21 =  driver1.findElement(By.xpath("//button[@id='2']"));
            elementClick2(seat21,"selected seat - "+seat21.getText());

            new SyncClass1().orderScreenForiPad2AfterSplitMenu2();

            WebElement order1 =  driver1.findElement(By.xpath("//button[@id='os_selectedSeat']"));
            String check1 = order1.getText();
            elementClick1(order1,"Selected - "+check1);

            elementClick1(payment,"Selected Payment");
            elementClick1(cash,"Selected Payment");
            elementClick1(submit,"Selected Payment");

            Thread.sleep(500);
        }
    }

    public void splitGroupBothIpadRandom(String cate) throws Exception {
        for(int i =1;i<=1;i++) {
            utils.log().info("Sync Count - "+i);
            selectRandomMenuForDineInMerge(cate);
            openTheActiveCheckFromIpad2();
            verifyIPad1MenuInIpad2();
            WebElement finishOrder =  driver2.findElement(By.xpath("//button[(@id='os_finish')]"));
            elementClick2(finishOrder, "Finish Order selected - 2");

            doSplitRandom();

            WebElement saveAndClose =  driver2.findElement(By.xpath("(//button[.=' Save & Close '])"));
            elementClick1(saveAndClose,"Selected - "+saveAndClose.getText());

            WebElement seat1 =  driver2.findElement(By.xpath("//button[@id='1']"));
            elementClick2(seat1,"selected seat - "+seat1.getText());

            orderScreenForiPad2AfterSplitMenu1();

            WebElement seat2 =  driver2.findElement(By.xpath("//button[@id='2']"));
            elementClick2(seat2,"selected seat - "+seat2.getText());

            orderScreenForiPad2AfterSplitMenu2();

            WebElement order =  driver2.findElement(By.xpath("//button[@id='os_selectedSeat']"));
            String check = order.getText();

            elementClick2(order,"Selected - "+check);

            verifyCheckValueAfterSplitDone();

            WebElement finishOrder1 =  driver2.findElement(By.xpath("//button[(@id='os_finish')]"));
            elementClick2(finishOrder1, "Finish Order selected - 2");

            Thread.sleep(1000);

            moveToTheFirst();

            new SyncClass1().openTheActiveCheckFromIpad1();

            WebElement seat11 =  driver1.findElement(By.xpath("//button[@id='1']"));
            elementClick1(seat11,"selected seat - "+seat11.getText());

            new SyncClass1().verifyIPad2MenuInIpad1Seat1();

//            new SyncClass1().verifyIPad2MenuInIpad1();

            WebElement seat12 =  driver1.findElement(By.xpath("//button[@id='2']"));
            elementClick1(seat12,"selected seat - "+seat12.getText());

            new SyncClass1().verifyIPad2MenuInIpad1Seat2();

            WebElement finishOrder2 =  driver1.findElement(By.xpath("//button[(@id='os_finish')]"));
            elementClick1(finishOrder2, "Finish Order selected - 1");

            doGroupActionInIpad1();

            WebElement seat111 =  driver1.findElement(By.xpath("//button[@id='1']"));
            elementClick2(seat111,"selected seat - "+seat111.getText());

            new SyncClass1().orderScreenForiPad2AfterSplitMenu1();

            WebElement seat21 =  driver1.findElement(By.xpath("//button[@id='2']"));
            elementClick2(seat21,"selected seat - "+seat21.getText());

            new SyncClass1().orderScreenForiPad2AfterSplitMenu2();

            WebElement order1 =  driver1.findElement(By.xpath("//button[@id='os_selectedSeat']"));
            String check1 = order1.getText();
            elementClick1(order1,"Selected - "+check1);

            elementClick1(payment,"Selected Payment");
            elementClick1(cash,"Selected Payment");
            elementClick1(submit,"Selected Payment");

            Thread.sleep(500);
        }
    }


    public void doGroupActionInIpad1() throws Exception {
        WebElement table = driver1.findElement(By.xpath("//button[contains(.,' Table layout ')]"));
        elementClick1(table,"Selected - Table 2");
        Thread.sleep(1000);
        WebElement splitBtnn =  driver1.findElement(By.xpath("//button[contains(.,'Split')]"));
        elementClick1(splitBtnn, "Split Button Selected - "+splitBtnn.getText());
        Thread.sleep(2000);
        WebElement splitBtnn1 =  driver1.findElement(By.xpath("//ion-label[.='Split']"));
        Assert.assertEquals(splitBtnn1.getText(),"Split");
        utils.log().info("Split window - "+splitBtnn1.getText());
        Thread.sleep(2000);
        WebElement splitSeat1 =  driver1.findElement(By.xpath("//button[contains(.,' Split By Seat ')]"));
        elementClick1(splitSeat1, "Selected Button as - "+splitSeat1.getText());
        Thread.sleep(200);
        String tableNo = TestUtils.tableNumberof;
        verifyTableMergee1(tableNo);
        Thread.sleep(2000);
        WebElement splitSeatScreen =  driver1.findElement(By.xpath("//p[.=' Split Seat ']"));
        Assert.assertEquals(splitSeatScreen.getText(),"Split Seat");
        utils.log().info("Split Seat Screen - "+splitSeatScreen.getText());

        doGroup();
    }

    public void getMenuNameSeat1() throws InterruptedException {
        ArrayList<String> menuNameSeat1 = new ArrayList<>();
        ArrayList<String> modifierName1=new ArrayList<String>();
        ArrayList<String> menuPrize1=new ArrayList<String>();
        ArrayList<String> modifierPrize1=new ArrayList<String>();
        ArrayList<String> modifierQtySeat1=new ArrayList<String>();
        List<WebElement> menuItem = driver1.findElements(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]//ion-col[contains(@class,'menu-name')]"));
        Thread.sleep(1000);
        utils.log().info("Menu Items count in the Seat 1 - " + menuItem.size());
        TestUtils.countOfMenuSeat1 = menuItem.size();

        for (int i = 1; i < menuItem.size(); i++) {
            WebElement menuItems = driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')][" + i + "]//ion-col[contains(@class,'menu-name')]"));
            utils.log().info(i + " Menu Items in the Seat 1 - " + menuItems.getText());
            menuNameSeat1.add(menuItems.getText());
            TestUtils.menuNameSeat1 = menuNameSeat1;
            utils.log().info(i + " Menu Items in the Seat 1 Lists - " + menuNameSeat1.get(i-1));
            utils.log().info(i + " Menu Items in the Seat 1 List - " + menuNameSeat1);
            WebElement menuPrize = driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]["+i+"]//ion-col[contains(@class,'menu-name')]"));
            utils.log().info(i+" Menu Prize in the Seat 1 - "+menuPrize.getText());
            menuPrize1.add(menuPrize.getText());
            TestUtils.menuPrizeSeat1 = menuPrize1;
            Thread.sleep(1000);
            try {
                WebElement modifierNameItem12 = driver2.findElement(By.xpath("(//ion-app[@id='seat1']//p[contains(.,' "+menuNameSeat1.get(i-1)+"    ')])["+i+"]/../../ion-row[1]//ion-col[1]"));
                String modifierItem12 = modifierNameItem12.getText();
                utils.log().info("Window 23 Seat 1 Modifier Name - " + modifierItem12);
                List<WebElement> modifierItem1 =  driver2.findElements(By.xpath("(//ion-app[@id='seat1']//p[contains(.,' "+menuNameSeat1.get(i-1)+"    ')])["+i+"]/../../ion-row"));
                utils.log().info(modifierItem1.size());
                for (int w = 0; w < modifierItem1.size(); w++) {
                    int m = w + 1;
                    WebElement modifierNameItem1 = driver2.findElement(By.xpath("(//ion-app[@id='seat1']//p[contains(.,' "+menuNameSeat1.get(i-1)+"    ')])["+i+"]/../../ion-row["+m+"]//ion-col[1]"));
                    String modifierItem11 = modifierNameItem1.getText();
                    modifierName1.add(modifierItem11);
                    TestUtils.modifierNameSeat1 = modifierName1;
                    utils.log().info("Window 2 Seat 1 Modifier Name - " + modifierName1);
                    WebElement modifierPrizeItem1 = driver2.findElement(By.xpath("(//ion-app[@id='seat1']//p[contains(.,' "+menuNameSeat1.get(i-1)+"    ')])["+i+"]/../../ion-row["+m+"]//ion-col[4]"));
                    String modifierPrizeItem11 = modifierPrizeItem1.getText();
                    modifierPrize1.add(modifierPrizeItem11);
                    TestUtils.modifierPrizeSeat1 = modifierPrize1;
                    utils.log().info("Window 2 Seat 1 Modifier Prize - " + modifierPrize1);
                    WebElement modifierQtyItem1 = driver2.findElement(By.xpath("(//ion-app[@id='seat1']//p[contains(.,' "+menuNameSeat1.get(i-1)+"    ')])["+i+"]/../../ion-row["+m+"]//ion-col[2]"));
                    String modifierQtyItem11 = modifierQtyItem1.getText();
                    modifierQtySeat1.add(modifierQtyItem11);
                    utils.log().info("Window 2 Seat 1 Modifier Qty- " + modifierQtySeat1);
                }

            } catch (Exception w) {
//                utils.log().info(" Menu Items in the Seat 1- " + menuNameSeat1);
            }
        }
    }

    public void getMenuNameSeat2() throws InterruptedException {
        ArrayList<String> menuNameSeat2=new ArrayList<>();
        ArrayList<String> modifierName2=new ArrayList<String>();
        ArrayList<String> menuPrize2=new ArrayList<String>();
        ArrayList<String> modifierPrize2=new ArrayList<String>();
        ArrayList<String> modifierQtySeat2=new ArrayList<String>();
        List<WebElement> menuItem = driver1.findElements(By.xpath("//ion-app[@id='seat2']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]//ion-col[contains(@class,'menu-name')]"));
        Thread.sleep(1000);
        utils.log().info("Menu Items count in the Seat 2- "+menuItem.size());
        TestUtils.countOfMenuSeat2 = menuItem.size();
        for(int i=1; i<=menuItem.size();i++){  //ion-app[@id='seat2']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')][1]//ion-col[contains(@class,'menu-name')]/../ion-col[2]
            WebElement menuItems = driver1.findElement(By.xpath("//ion-app[@id='seat2']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]["+i+"]//ion-col[contains(@class,'menu-name')]"));
            utils.log().info(i+" Menu Items in the Seat 2 - "+menuItems.getText());
            menuNameSeat2.add(menuItems.getText());
            TestUtils.menuNameSeat2 = menuNameSeat2;

            WebElement menuPrize = driver1.findElement(By.xpath("//ion-app[@id='seat2']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]["+i+"]//ion-col[contains(@class,'menu-name')]"));
            utils.log().info(i+" Menu Prize in the Seat 2 - "+menuPrize.getText());
            menuPrize2.add(menuPrize.getText());
            TestUtils.menuPrizeSeat2 = menuPrize2;
            utils.log().info(" Menu Items in the Seat 2- "+menuNameSeat2+ " Prize - "+menuPrize2);
            try {

                List<WebElement> modifierItem1 =  driver2.findElements(By.xpath("(//ion-app[@id='seat2']//p[contains(.,' "+menuNameSeat2.get(i-1)+"    ')])["+i+"]/../../ion-row"));
                utils.log().info(modifierItem1.size());
                for (int w = 0; w < modifierItem1.size(); w++) {
                    int m = w + 1;
                    WebElement modifierNameItem1 = driver2.findElement(By.xpath("(//ion-app[@id='seat2']//p[contains(.,' "+menuNameSeat2.get(i-1)+"    ')])["+i+"]/../../ion-row["+m+"]//ion-col[1]"));
                    String modifierItem11 = modifierNameItem1.getText();
                    modifierName2.add(modifierItem11);
                    TestUtils.modifierNameSeat2 = modifierName2;
                    utils.log().info("Window 2 Seat 2 Modifier Name 2 - " + modifierName2);
                    WebElement modifierPrizeItem1 = driver2.findElement(By.xpath("(//ion-app[@id='seat2']//p[contains(.,' "+menuNameSeat2.get(i-1)+"    ')])["+i+"]/../../ion-row["+m+"]//ion-col[4]"));
                    String modifierPrizeItem11 = modifierPrizeItem1.getText();
                    modifierPrize2.add(modifierPrizeItem11);
                    TestUtils.modifierPrizeSeat2 = modifierPrize2;
                    utils.log().info("Window 2 Seat 2 Modifier Prize 2 - " + modifierPrize2);
                    WebElement modifierQtyItem1 = driver2.findElement(By.xpath("(//ion-app[@id='seat2']//p[contains(.,' "+menuNameSeat1.get(i-1)+"    ')])["+i+"]/../../ion-row["+m+"]//ion-col[2]"));
                    String modifierQtyItem11 = modifierQtyItem1.getText();
                    modifierQtySeat2.add(modifierQtyItem11);
                    utils.log().info("Window 2 Seat 2 Modifier Qty 2 - " + modifierQtySeat2);
                }

            } catch (Exception w) {
//                utils.log().info(" Menu Items in the Seat 1- " + menuNameSeat1);
            }

        }
//        utils.log().info(" Menu Items in the Seat 2- "+menuNameSeat2+ " Prize - "+menuPrize2);
    }

    public void verifyMenuItemAreClubbedInSeat1() throws InterruptedException {
      Thread.sleep(2000);
        ArrayList<String> menuNameSeat1 = new ArrayList<>();
        ArrayList<String> modifierName1=new ArrayList<String>();
        ArrayList<String> menuPrize1=new ArrayList<String>();
        ArrayList<String> modifierPrize1=new ArrayList<String>();
        ArrayList<String> modifierQtySeat1=new ArrayList<String>();
        List<WebElement> menuItem =  driver1.findElements(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]//ion-col[contains(@class,'menu-name')]"));
        int countOfMenuSeat = TestUtils.countOfMenuSeat2 + TestUtils.countOfMenuSeat1;
        utils.log().info("Menu Items count in the Seats - "+countOfMenuSeat);
        utils.log().info("Menu Items count in the Seat - "+menuItem.size());
        Assert.assertEquals(menuItem.size(),countOfMenuSeat);
        utils.log().info("Menu Items count in the Seat - "+menuItem.size());
        for(int i=3; i<=menuItem.size();i++){
            WebElement menuItems =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]["+i+"]//ion-col[contains(@class,'menu-name')]"));
            utils.log().info("Menu Items in the Seat - "+menuItems.getText());
            utils.log().info(TestUtils.menuNameSeat2.get(i - 3));
            Assert.assertEquals(TestUtils.menuNameSeat2.get(i - 3),menuItems.getText());


            WebElement menuPrize = driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]["+i+"]//ion-col[contains(@class,'menu-name')]"));
            utils.log().info(i+" Menu Prize in the Seat 1 - "+menuPrize.getText());
//            menuPrize1.add(menuPrize.getText());
//            TestUtils.menuPrizeSeat1 = menuPrize1;
            utils.log().info(TestUtils.menuPrizeSeat2.get(i - 3));
            Assert.assertEquals(TestUtils.menuPrizeSeat2.get(i - 3),menuPrize.getText());
            utils.log().info("Al Menu Items Are clubbed - "+i+" "+menuItems.getText()+"  Prize - "+menuPrize.getText());

            try {

                List<WebElement> modifierItem1 =  driver1.findElements(By.xpath("(//ion-app[@id='seat1']//p[contains(.,' "+menuItems.getText()+"    ')])["+i+"]/../../ion-row"));
                utils.log().info(modifierItem1.size());
                for (int w = 0; w < modifierItem1.size(); w++) {
                    int m = w + 1;
                    WebElement modifierNameItem1 = driver1.findElement(By.xpath("(//ion-app[@id='seat1']//p[contains(.,' "+menuItems.getText()+"    ')])["+i+"]/../../ion-row["+m+"]//ion-col[1]"));
                    String modifierItem11 = modifierNameItem1.getText();
//                    modifierName1.add(modifierItem11);
                    Assert.assertEquals(TestUtils.modifierNameSeat2.get(i - 3),modifierItem11);
//                    TestUtils.modifierNameSeat1 = modifierName1;
                    utils.log().info("Window 2 Seat 1 Modifier Name - " + modifierItem11);
                    WebElement modifierPrizeItem1 = driver1.findElement(By.xpath("(//ion-app[@id='seat1']//p[contains(.,' "+menuItems.getText()+"    ')])["+i+"]/../../ion-row["+m+"]//ion-col[4]"));
                    String modifierPrizeItem11 = modifierPrizeItem1.getText();
//                    modifierPrize1.add(modifierPrizeItem11);
                    Assert.assertEquals(TestUtils.modifierPrizeSeat2.get(i - 3),modifierPrizeItem11);
//                    TestUtils.modifierPrizeSeat1 = modifierPrize1;
                    utils.log().info("Window 2 Seat 1 Modifier Prize - " + modifierPrizeItem11);
                    WebElement modifierQtyItem1 = driver1.findElement(By.xpath("(//ion-app[@id='seat1']//p[contains(.,' "+menuItems.getText()+"    ')])["+i+"]/../../ion-row["+m+"]//ion-col[2]"));
                    String modifierQtyItem11 = modifierQtyItem1.getText();
                    modifierQtySeat1.add(modifierQtyItem11);
                    Assert.assertEquals(TestUtils.modifierQtySeat2.get(i - 3),modifierQtyItem11);
                    utils.log().info("Window 2 Seat 1 Modifier Qty- " + modifierQtyItem11);
                }

            } catch (Exception w) {
//                utils.log().info(" Menu Items in the Seat 1- " + menuNameSeat1);
            }
        }

    }
    public void doGroup() throws InterruptedException {
        driver1.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);


        WebElement SplitEvenly =  driver1.findElement(By.xpath("//div[.='Split Evenly']"));
        elementClick1(SplitEvenly, "Tapped Split Evenly in the Split Seat");
        getMenuNameSeat1();
        getMenuNameSeat2();
        verifyMenuIsSplittedEvenly();
        getMenuNameSeat1();
        getMenuNameSeat2();
//        getSeat1Prize();
        getSeat1Prize1();
        getSeat2Prize1();
//        getSeat2Prize();

        WebElement seat1 =  driver1.findElement(By.xpath("//ion-col[.='Seat 1']"));
        elementClick1(seat1,"Selected - Seat -1 in iPad-1");
        WebElement seat2 =  driver1.findElement(By.xpath("//ion-col[.='Seat 2']"));
        elementClick1(seat2,"Selected - Seat -2 in iPad-1");
        WebElement groupSeat =  driver1.findElement(By.xpath("//div[.='Group Seats']"));
        elementClick1(groupSeat,"Selected Group Seat iPad -1");
        verifyMenuItemAreClubbedInSeat1();
//        verifyPrizeDetailsAfterGroupSeats();
        verifyAllClubbedSeatPrizeAfterGroupSeatDoneDirect();
//        getMenuNameSeat1();
        getMenuDetailsGroupSeat1();
        WebElement saveAndClose =  driver1.findElement(By.xpath("(//button[.=' Save & Close '])"));
        elementClick1(saveAndClose,"Selected - "+saveAndClose.getText()+"in iPad -1");

    }

    public void getMenuDetailsGroupSeat1() {

        ArrayList<String> menuItemSeat = new ArrayList<>();
        ArrayList<String> menuPrizeSeat = new ArrayList<>();
        ArrayList<String> menuQtySeat = new ArrayList<>();
        ArrayList<String> modifierNameSeat1 = new ArrayList<>();
        ArrayList<String> modifierPrizeSeat1 = new ArrayList<>();
        ArrayList<String> modifierQtySeat1 = new ArrayList<>();
        List<WebElement> menuItem = driver1.findElements(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]//ion-col[contains(@class,'menu-name')]"));
        TestUtils.countOfMenuSeat1 = menuItem.size();
        for(int i=1; i<=menuItem.size();i++){
            WebElement menuItems = driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]["+i+"]//ion-col[1]"));
            utils.log().info("Menu Items in the Seat 1- "+menuItems.getText());
            menuItemSeat.add(menuItems.getText());
            WebElement price =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]["+i+"]//ion-col[4]"));
            String price1 = price.getText();
            menuPrizeSeat.add(price1);
            utils.log().info("Menu Prize in the Seat 1- "+price1);
            WebElement Qty =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]["+i+"]//ion-col[2]"));
            String Qty1 = Qty.getText();
            menuQtySeat.add(Qty1);
            utils.log().info("Menu Qty in the Seat 1- "+Qty1);
            try{
                WebElement modifierItem1 =  driver2.findElement(By.xpath("(//ion-app[@id='seat1']//ion-col[@class='menu-name ion-text-left md hydrated'])["+i+"]/../ion-row[1]//ion-col[1]"));
               if(modifierItem1.isDisplayed()) {
                   String modifierItem11 = modifierItem1.getText();
                   modifierNameSeat1.add(modifierItem11);
                   utils.log().info("Seat 1 Modifier Qty- " + modifierNameSeat1);
                   WebElement modifierPrizeItem1 = driver2.findElement(By.xpath("(//ion-app[@id='seat1']//ion-col[@class='menu-name ion-text-left md hydrated'])[" + i + "]/../ion-row[1]//ion-col[4]"));
                   String modifierPrizeItem11 = modifierPrizeItem1.getText();
                   modifierPrizeSeat1.add(modifierPrizeItem11);
                   utils.log().info("Seat 1 Modifier Qty- " + modifierPrizeSeat1);
                   WebElement modifierQtyItem1 = driver2.findElement(By.xpath("(//ion-app[@id='seat1']//ion-col[@class='menu-name ion-text-left md hydrated'])[" + i + "]/../ion-row[1]//ion-col[2]"));
                   String modifierQtyItem11 = modifierQtyItem1.getText();
                   modifierQtySeat1.add(modifierQtyItem11);
                   utils.log().info("Seat 1 Modifier Qty- " + modifierQtySeat1);
               }else {
                   modifierNameSeat1.add(null);
                   modifierPrizeSeat1.add(null);
                   modifierQtySeat1.add(null);
               }
                TestUtils.modifierNameGroup = modifierNameSeat1;
                TestUtils.modifierPrizeGroup = modifierPrizeSeat1;
                TestUtils.modifierQtyGroup = modifierQtySeat1;
            }catch (Exception w){

            }
        }
        utils.log().info("List of the Menu in the Seat 1 - "+menuItemSeat);
        TestUtils.menuNamesGroup = menuItemSeat;
        TestUtils.menuPrizeGroup = menuPrizeSeat;
        TestUtils.menuQtyGroup = menuQtySeat;
    }

    public void verifyMenuIsSplittedEvenly() throws InterruptedException {

        ArrayList<String> menuNameSeat2=new ArrayList<>();
        ArrayList<String> menuNameSeat1=new ArrayList<>();
        ArrayList<String> menuQty1=new ArrayList<>();
        ArrayList<String> menuQty2=new ArrayList<>();
        List<WebElement> menuItem = driver1.findElements(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]//ion-col[contains(@class,'menu-name')]"));
        Thread.sleep(1000);
        utils.log().info("Menu Items count in the Seat 1 - "+menuItem.size());

        for(int i=1; i<=menuItem.size();i++){
            WebElement menuItems = driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]["+i+"]//ion-col[contains(@class,'menu-name')]"));
            utils.log().info(i+" Menu Items in the Seat - "+menuItems.getText());
            menuNameSeat1.add(menuItems.getText());
            WebElement menuQty = driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]["+i+"]//ion-col[contains(@class,'menu-name')]/../ion-col[2]"));
            utils.log().info(i+" Menu Items Seat 1 in the Qty - "+menuQty.getText());
            menuQty1.add(menuQty.getText());
            TestUtils.menuNameSeat1 = menuNameSeat1;
            TestUtils.menuQtySeat1 = menuQty1;
        }
        utils.log().info(" Menu Items in the Seat 1- "+menuNameSeat1);



        List<WebElement> menuItem1 = driver1.findElements(By.xpath("//ion-app[@id='seat2']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]//ion-col[contains(@class,'menu-name')]"));
        Thread.sleep(1000);
        utils.log().info("Menu Items count in the Seat 2- "+menuItem1.size());

        for(int i=1; i<=menuItem1.size();i++){
            WebElement menuItems = driver1.findElement(By.xpath("//ion-app[@id='seat2']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]["+i+"]//ion-col[contains(@class,'menu-name')]"));
            utils.log().info(i+" Menu Items in the Seat - "+menuItems.getText());
            menuNameSeat2.add(menuItems.getText());
            WebElement menuQty = driver1.findElement(By.xpath("//ion-app[@id='seat2']//ion-grid[contains(@class,'orderDetails')]//ion-list//ion-item[contains(@class,'inserted item md item-lines')]["+i+"]//ion-col[contains(@class,'menu-name')]/../ion-col[2]"));
            utils.log().info(i+" Menu Items Seat 2 in the Qty - "+menuQty.getText());
            menuQty2.add(menuQty.getText());
            TestUtils.menuNameSeat2 = menuNameSeat2;
            TestUtils.menuQtySeat2 = menuQty2;

        }
        utils.log().info(" Menu Items in the Seat 2- "+menuNameSeat2);


        Assert.assertEquals(String.valueOf(menuItem.size()), String.valueOf(menuItem1.size()));
        utils.log().info("Menu Size is SAME - " + menuItem1.size());
        for (int i = 0; i < menuItem1.size(); i++) {
            Assert.assertEquals(menuNameSeat1.get(i), menuNameSeat2.get(i));
            //    utils.log().info("Splitted Menu is SAME - " + MenuNameTxt[i]);
            Assert.assertEquals(menuQty1.get(i),menuQty2.get(i));
//            Assert.assertEquals(MenuNamePrize[i], MenuNamePrize2[i]);
            utils.log().info("Splitted Menu is SAME - " +i+" "+ menuNameSeat1.get(i) +" Qty - "+menuQty1.get(i) );
            try {
                Assert.assertEquals(ModifierName[i], ModifierName2[i]);
                //Assert.assertEquals(ModifierPrize[i], ModifierPrize2[i]);
                Assert.assertEquals(ModifierQty[i], ModifierQty2[i]);
                utils.log().info("Splitted Modifier is SAME - "+i+" " + ModifierName[i] + " Qty - " + ModifierQty[i] + " Price - " + ModifierPrize[i]);
            } catch (Exception s) {

            }
        }
    }

    public void verifyPrizeDetailsAfterGroupSeats() {
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //////  SUBTOTAL AFTER GROUP SEATS  /////////
        String subTotalTxt1 = TestUtils.subtotalTxt;
        String subTotalTxt2 = subTotalTxt1.replaceAll("[A-Z$,. ]", "");
        int subTotalAmount1 = Integer.parseInt(subTotalTxt2);
        String subTotalTxt11 = TestUtils.subtotalTxt1;
        String subTotalTxt22 = subTotalTxt11.replaceAll("[A-Z$,. ]", "");
        int subTotalAmount2 = Integer.parseInt(subTotalTxt22);
        int subTotalAmount = subTotalAmount1 + subTotalAmount2;
        //XCUIElementTypeApplication[@name="Cloud POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]
        WebElement subTotal =  driver1.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Cloud POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subtotal = subTotal.getText();
        TestUtils.subtotalTxt = subtotal;
        String subtotal1 = subtotal.replaceAll("[A-Z$., ]", "");
        int subtotalAmount = Integer.parseInt(subtotal1);
        Assert.assertEquals(String.valueOf(subTotalAmount), String.valueOf(subtotalAmount));
        utils.log().info("Subtotal is SAME After Group Seats Done - " + subtotal);

        //////  TAX AFTER GROUP SEATS  /////////

        String taxTxt1 = TestUtils.taxTxtOfBeforeRound1;
        // String taxTxt2 = taxTxt1.replaceAll("[A-Z$ ]", "");
        double taxAmount1 = Double.parseDouble(taxTxt1);
        String taxTxt11 = TestUtils.taxTxtOfBeforeRound2;
        //  String taxTxt22 = taxTxt11.replaceAll("[A-Z$ ]", "");
        double taxAmount2 = Double.parseDouble(taxTxt11);
        double taxAmount11 = taxAmount1 + taxAmount2;
        BigDecimal taxAmount111=new BigDecimal(taxAmount11).setScale(2, RoundingMode.HALF_UP);
        double taxAmount= taxAmount111.doubleValue();

        WebElement tax =  driver1.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Cloud POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taX = tax.getText();
        TestUtils.taxTxtGroup = taX;
        String taX1 = taX.replaceAll("[A-Z$. ]", "");
        String tax11 = taX1.replaceAll(",",".");
        double taXAmount = Double.parseDouble(tax11);
        Assert.assertEquals(String.valueOf(taxAmount), String.valueOf(taXAmount));
        utils.log().info("Tax is SAME After Group Seats Done - " + taX);

        //////  PAID AMOUNT AFTER GROUP SEATS  /////////

        String paidAmounT = TestUtils.paidAmount;
        String paidAmounT2 = paidAmounT.replaceAll("[A-Z$,. ]", "");
        int paidAmounT1 = Integer.parseInt(paidAmounT2);
        String paidAmounT11 = TestUtils.paidAmount1;
        String paidAmounT22 = paidAmounT11.replaceAll("[A-Z$,. ]", "");
        int paidAmounT12 = Integer.parseInt(paidAmounT22);
        int paidAmount = paidAmounT1 + paidAmounT12;

        WebElement paidAmountt =  driver1.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Cloud POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String paidAmountt1 = paidAmountt.getText();
        TestUtils.paidAmount1 = paidAmountt1;
        String paidAmountt11 = paidAmountt1.replaceAll("[A-Z$., ]", "");
        int paidAmounTT = Integer.parseInt(paidAmountt11);
        Assert.assertEquals(String.valueOf(paidAmount), String.valueOf(paidAmounTT));
        utils.log().info("Paid AMount is SAME After Group Seats Done - " + paidAmountt1);

        //////  TOTAL AMOUNT AFTER GROUP SEATS  /////////

        String totalTxt1 = TestUtils.totalTxt;
        String totalTxt12 = totalTxt1.replaceAll("[A-Z$ ]", "");
        double totalTxt = Double.parseDouble(totalTxt12);
        String totalTxt11 = TestUtils.totalTxt1;
        String totalTxt22 = totalTxt11.replaceAll("[A-Z$ ]", "");
        double totalTxT2 = Double.parseDouble(totalTxt22);
        double totalTxTT2 = totalTxt + totalTxT2;
        BigDecimal  totalTxTT3=new BigDecimal(totalTxTT2).setScale(2, RoundingMode.HALF_UP);
        double totalTxTT= totalTxTT3.doubleValue();


        WebElement Total =  driver1.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Cloud POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String Total1 = Total.getText();
        TestUtils.totalTxt = Total1;
        String Total11 = Total1.replaceAll("[A-Z$. ]", "");
        String Total111 = Total11.replaceAll(",",".");
        double TotaL = Double.parseDouble(Total111);
        Assert.assertEquals(String.valueOf(totalTxTT), String.valueOf(TotaL));
        utils.log().info("TOTAL is SAME After Group Seats Done - " + Total1);

    }

    public void splitBothIpad(String Cate) throws Exception {


        for(int i =1;i<=2;i++) {
            utils.log().info("Sync Count - "+i);
            selectMenuForDineInMerge(Cate);
            openTheActiveCheckFromIpad2();
            verifyIPad1MenuInIpad2();
            WebElement finishOrder =  driver2.findElement(By.xpath("//button[(@id='os_finish')]"));
            elementClick2(finishOrder, "Finish Order selected - 2");
            doSplit();
            WebElement saveAndClose =  driver2.findElement(By.xpath("(//button[.=' Save & Close '])"));
            elementClick1(saveAndClose,"Selected - "+saveAndClose.getText());

            Thread.sleep(2000);
            elementClick2(payment,"Selected Payment");
            elementClick2(cash,"Selected Payment");
            elementClick2(submit,"Selected Payment");
            Thread.sleep(2000);
        }


    }
    public void doSplitRandom() throws Exception {
        driver2.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement table = driver2.findElement(By.xpath("//button[contains(.,' Table layout ')]"));
        elementClick2(table,"Selected - Table 2");
        WebElement splitBtnn =  driver2.findElement(By.xpath("//button[contains(.,'Split')]"));
        elementClick2(splitBtnn, "Split Button Selected - "+splitBtnn.getText());
        Thread.sleep(2000);
        WebElement splitBtnn1 =  driver2.findElement(By.xpath("//ion-label[.='Split']"));
        Assert.assertEquals(splitBtnn1.getText(),"Split");
        utils.log().info("Split window - "+splitBtnn1.getText());
        Thread.sleep(2000);
        WebElement splitSeat1 =  driver2.findElement(By.xpath("//button[contains(.,' Split By Seat ')]"));
        elementClick2(splitSeat1, "Selected Button as - "+splitSeat1.getText());
        Thread.sleep(200);
        String tableNo = TestUtils.tableNumberof;
        verifyTableMergee2(tableNo);
        Thread.sleep(2000);
        WebElement splitSeatScreen =  driver2.findElement(By.xpath("//p[.=' Split Seat ']"));
        Assert.assertEquals(splitSeatScreen.getText(),"Split Seat");
        utils.log().info("Split Seat Screen - "+splitSeatScreen.getText());
        doSplitActionRandom();

    }

public void getSeat1MenuDetailsForSplitAction() throws InterruptedException {

    ArrayList<String> menuNameSeat1 = new ArrayList<>();
    ArrayList<String> menuPrizeSeat1 = new ArrayList<>();
    ArrayList<String> modifierPrizeSeat1 = new ArrayList<>();
    ArrayList<String> modifierQtySeat1 = new ArrayList<>();
    ArrayList<String> menuQtySeat1 = new ArrayList<>();
    ArrayList<String> modifierNameSeat1 = new ArrayList<>();
Thread.sleep(2000);
   List<WebElement> listOfMEnus =  driver2.findElements(By.xpath("//ion-app[@id='seat1']//ion-item//ion-grid[1]//ion-row"));
    utils.log().info("Size of Seat 1 - "+listOfMEnus.size());
    for(int i =1;i<listOfMEnus.size();i++) {
        WebElement verifyItem1 = driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-item["+i+"]//ion-grid[1]//ion-row[1]//ion-col[1]"));
    String itemName2 = verifyItem1.getText();
//        Assert.assertEquals(itemName2,itemName);
    menuNameSeat1.add(itemName2);
    utils.log().info("Seat 1 Menu - " + menuNameSeat1);
    WebElement verifyItemPrize1 = driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-item["+i+"]//ion-grid[1]//ion-row[1]//ion-col[4]"));
    String itemNamePrize2 = verifyItemPrize1.getText();
    menuPrizeSeat1.add(itemNamePrize2);
    utils.log().info("Seat 1 Menu Prize - " + menuPrizeSeat1);
    WebElement verifyItemQty1 = driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-item["+i+"]//ion-grid[1]//ion-row[1]//ion-col[2]"));
    String itemNameQty2 = verifyItemQty1.getText();
//        Assert.assertEquals(itemNameQty2,Qty1);
    menuQtySeat1.add(itemNameQty2);
    utils.log().info("Seat 1 Menu Qty- " + menuQtySeat1);
    TestUtils.menuNameSeat1 = menuNameSeat1;
    TestUtils.menuPrize1 = menuPrizeSeat1;
    TestUtils.menuQtySeat1 = menuQtySeat1;
    try {
        WebElement modifierItem1 =  driver2.findElement(By.xpath("(//ion-app[@id='seat1']//ion-col[@class='menu-name ion-text-left md hydrated'])["+i+"]/../ion-row[1]//ion-col[1]"));
        if(modifierItem1.isDisplayed()) {
            String modifierItem11 = modifierItem1.getText();
            modifierNameSeat1.add(modifierItem11);
            utils.log().info("Seat 1 Modifier Name - " + modifierNameSeat1);
            WebElement modifierPrizeItem1 = driver2.findElement(By.xpath("(//ion-app[@id='seat1']//ion-col[@class='menu-name ion-text-left md hydrated'])[" + i + "]/../ion-row[1]//ion-col[4]"));
            String modifierPrizeItem11 = modifierPrizeItem1.getText();
            modifierPrizeSeat1.add(modifierPrizeItem11);
            utils.log().info("Seat 1 Modifier Prize - " + modifierPrizeSeat1);
            WebElement modifierQtyItem1 = driver2.findElement(By.xpath("(//ion-app[@id='seat1']//ion-col[@class='menu-name ion-text-left md hydrated'])[" + i + "]/../ion-row[1]//ion-col[2]"));
            String modifierQtyItem11 = modifierQtyItem1.getText();
            modifierQtySeat1.add(modifierQtyItem11);
            utils.log().info("Seat 1 Modifier Qty - " + modifierQtySeat1);
        }else {
            modifierNameSeat1.add(null);
            modifierPrizeSeat1.add(null);
            modifierQtySeat1.add(null);
        }

        TestUtils.modifierNameSeat1 = modifierNameSeat1;
        utils.log().info(TestUtils.modifierNameSeat1);
        TestUtils.modifierPrizeSeat1 = modifierPrizeSeat1;
        utils.log().info(TestUtils.modifierPrizeSeat1 );
        TestUtils.modifierQtySeat1 = modifierQtySeat1;
        utils.log().info(TestUtils.modifierQtySeat1);
    } catch (Exception w) {

    }
}
    ///   GET SEAT 1 FOOTER VALUES  ///
    WebElement subTotal1 =  driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[1]//ion-col[2]"));
    WebElement tax1 =  driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[2]//ion-col[2]"));
    WebElement paidAmount1 =  driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[3]//ion-col[2]"));
    WebElement Total1 =  driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[4]//ion-col[2]"));
    String subtotalTxt = subTotal1.getText();
    TestUtils.subTotalFromSplitSeat1 = subtotalTxt;
    utils.log().info("Subtotal Seat 1 - "+subtotalTxt);
    String taxTxt = tax1.getText();
    TestUtils.taxFromSplitSeat1 = taxTxt;
    utils.log().info("Tax Seat 1 - "+taxTxt);
    String paidAmountTxt = paidAmount1.getText();
    TestUtils.paidAmountFromSplitSeat1 = paidAmountTxt;
    utils.log().info("Paid Amount Seat 1 - "+paidAmountTxt);
    String totalTxt = Total1.getText();
    TestUtils.totalAmountFromSplitSeat1 = totalTxt;
    utils.log().info("Total Seat 1 - "+totalTxt);

}

    public void getSeat2MenuDetailsForSplitAction() throws InterruptedException {
        ArrayList<String> menuNameSeat2 = new ArrayList<>();
        ArrayList<String> menuPrizeSeat2 = new ArrayList<>();
        ArrayList<String> modifierPrizeSeat2 = new ArrayList<>();
        ArrayList<String> modifierQtySeat2 = new ArrayList<>();
        ArrayList<String> menuQtySeat2 = new ArrayList<>();
        ArrayList<String> modifierNameSeat2 = new ArrayList<>();
        Thread.sleep(2000);
        List<WebElement> listOfMEnus =  driver2.findElements(By.xpath("//ion-app[@id='seat2']//ion-item//ion-grid[1]//ion-row"));
        utils.log().info("Size of Seat 2 - "+listOfMEnus.size());
        for(int i =1;i<listOfMEnus.size();i++) {
            WebElement verifyItem1 = driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-item["+i+"]//ion-grid[1]//ion-row[1]//ion-col[1]"));
            String itemName2 = verifyItem1.getText();
//        Assert.assertEquals(itemName2,itemName);
            menuNameSeat2.add(itemName2);
            utils.log().info("Seat 2 Menu - " + menuNameSeat2);
            WebElement verifyItemPrize1 = driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-item["+i+"]//ion-grid[1]//ion-row[1]//ion-col[4]"));
            String itemNamePrize2 = verifyItemPrize1.getText();
            menuPrizeSeat2.add(itemNamePrize2);
            utils.log().info("Seat 2 Menu Prize - " + menuPrizeSeat2);
            WebElement verifyItemQty1 = driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-item["+i+"]//ion-grid[1]//ion-row[1]//ion-col[2]"));
            String itemNameQty2 = verifyItemQty1.getText();
//        Assert.assertEquals(itemNameQty2,Qty1);
            menuQtySeat2.add(itemNameQty2);
            utils.log().info("Seat 2 Menu Qty- " + menuQtySeat2);
            TestUtils.menuNameSeat2 = menuNameSeat2;
            TestUtils.menuPrize2 = menuPrizeSeat2;
            TestUtils.menuQtySeat2 = menuQtySeat2;
            try {
                WebElement modifierItem1 =  driver2.findElement(By.xpath("(//ion-app[@id='seat2']//ion-col[@class='menu-name ion-text-left md hydrated'])["+i+"]/../ion-row[1]//ion-col[1]"));
                if(modifierItem1.isDisplayed()) {
                    String modifierItem11 = modifierItem1.getText();
                    modifierNameSeat2.add(modifierItem11);
                    utils.log().info("Seat 2 Modifier Qty- " + modifierNameSeat2);
                    WebElement modifierPrizeItem1 = driver2.findElement(By.xpath("(//ion-app[@id='seat2']//ion-col[@class='menu-name ion-text-left md hydrated'])[" + i + "]/../ion-row[1]//ion-col[4]"));
                    String modifierPrizeItem11 = modifierPrizeItem1.getText();
                    modifierPrizeSeat2.add(modifierPrizeItem11);
                    utils.log().info("Seat 2 Modifier Qty- " + modifierPrizeSeat2);
                    WebElement modifierQtyItem1 = driver2.findElement(By.xpath("(//ion-app[@id='seat2']//ion-col[@class='menu-name ion-text-left md hydrated'])[" + i + "]/../ion-row[1]//ion-col[2]"));
                    String modifierQtyItem11 = modifierQtyItem1.getText();
                    modifierQtySeat2.add(modifierQtyItem11);
                    utils.log().info("Seat 2 Modifier Qty- " + modifierQtySeat2);
                }else {
                    modifierNameSeat2.add(null);
                    modifierPrizeSeat2.add(null);
                    modifierQtySeat2.add(null);
                }
                TestUtils.modifierNameSeat2 = modifierNameSeat2;
                utils.log().info(TestUtils.modifierNameSeat2);
                TestUtils.modifierPrizeSeat2 = modifierPrizeSeat2;
                utils.log().info(TestUtils.modifierPrizeSeat2 );
                TestUtils.modifierQtySeat2 = modifierQtySeat2;
                utils.log().info(TestUtils.modifierQtySeat2);
            } catch (Exception w) {

            }
        }
        ///   GET SEAT 2 FOOTER VALUES  ///
        WebElement subTotal1 =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[1]//ion-col[2]"));
        WebElement tax1 =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[2]//ion-col[2]"));
        WebElement paidAmount1 =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[3]//ion-col[2]"));
        WebElement Total1 =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[4]//ion-col[2]"));
        String subtotalTxt = subTotal1.getText();
        TestUtils.subTotalFromSplitSeat2 = subtotalTxt;
        utils.log().info("Subtotal Seat 2 - "+subtotalTxt);
        String taxTxt = tax1.getText();
        TestUtils.taxFromSplitSeat2 = taxTxt;
        utils.log().info("Tax Seat 2 - "+taxTxt);
        String paidAmountTxt = paidAmount1.getText();
        TestUtils.paidAmountFromSplitSeat2 = paidAmountTxt;
        utils.log().info("Paid Amount Seat 2 - "+paidAmountTxt);
        String totalTxt = Total1.getText();
        TestUtils.totalAmountFromSplitSeat2 = totalTxt;
        utils.log().info("Total Seat 2 - "+totalTxt);

    }
    public void doSplitActionRandom() throws InterruptedException {
        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement addBtnSync1 =  driver2.findElement(By.xpath("//button[@class='add-seat']"));
        elementClick2(addBtnSync1, "Add Button Selected");
        Thread.sleep(2000);
        WebElement newSeat = driver2.findElement(By.xpath("//span[.=' 2 ']"));
        if (newSeat.isDisplayed()) {
            utils.log().info("Seat 2 is Added ");
        } else {
            utils.log().info("Seat2 is not Added");
            int w = 1/0;
        }

        WebElement item1 =  driver2.findElement(By.xpath("(//ion-col[@class='menu-name ion-text-left md hydrated'])[1]"));
        String itemName = item1.getText();
        WebElement price =  driver2.findElement(By.xpath("(//ion-col[@class='menu-name ion-text-left md hydrated'])[1]/../ion-col[4]"));
        String price1 = price.getText();
        WebElement Qty =  driver2.findElement(By.xpath("(//ion-col[@class='menu-name ion-text-left md hydrated'])[1]/../ion-col[2]"));
        String Qty1 = Qty.getText();

        elementClick2(item1, "Select Item - " + itemName + " - " + price1);

        WebElement seat21 =  driver2.findElement(By.xpath("//ion-col[.='Seat 2']"));
        String seatName = seat21.getText();
        elementClick2(seat21, seatName + " - selected");


        ///   GET SEAT 1 MENU VALUES  ///
        getSeat1MenuDetailsForSplitAction();
        ///   GET SEAT 2 MENU VALUES  ///
        getSeat2MenuDetailsForSplitAction();
    }


    public void doSplit() throws Exception {
        driver2.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement table = driver2.findElement(By.xpath("//button[contains(.,' Table layout ')]"));
        elementClick2(table,"Selected - Table 2");
        WebElement splitBtnn =  driver2.findElement(By.xpath("//button[contains(.,'Split')]"));
        elementClick2(splitBtnn, "Split Button Selected - "+splitBtnn.getText());
        Thread.sleep(2000);
        WebElement splitBtnn1 =  driver2.findElement(By.xpath("//ion-label[.='Split']"));
        Assert.assertEquals(splitBtnn1.getText(),"Split");
        utils.log().info("Split window - "+splitBtnn1.getText());
        Thread.sleep(2000);
        WebElement splitSeat1 =  driver2.findElement(By.xpath("//button[contains(.,' Split By Seat ')]"));
        elementClick2(splitSeat1, "Selected Button as - "+splitSeat1.getText());
        Thread.sleep(200);
        String tableNo = TestUtils.tableNumberof;
        verifyTableMergee2(tableNo);
        Thread.sleep(2000);
        WebElement splitSeatScreen =  driver2.findElement(By.xpath("//p[.=' Split Seat ']"));
        Assert.assertEquals(splitSeatScreen.getText(),"Split Seat");
        utils.log().info("Split Seat Screen - "+splitSeatScreen.getText());
        doSplitAction();

    }

    public void doSplitAction() throws InterruptedException {
    ArrayList<String> menuNameSeat1 = new ArrayList<>();
        ArrayList<String> menuNameSeat2 = new ArrayList<>();
        ArrayList<String> menuPrizeSeat1 = new ArrayList<>();
        ArrayList<String> menuPrizeSeat2 = new ArrayList<>();
        ArrayList<String> modifierPrizeSeat1 = new ArrayList<>();
        ArrayList<String> modifierPrizeSeat2 = new ArrayList<>();
        ArrayList<String> modifierQtySeat1 = new ArrayList<>();
        ArrayList<String> modifierQtySeat2 = new ArrayList<>();
        ArrayList<String> menuQtySeat1 = new ArrayList<>();
        ArrayList<String> menuQtySeat2 = new ArrayList<>();
        ArrayList<String> modifierNameSeat1 = new ArrayList<>();
        ArrayList<String> modifierNameSeat2 = new ArrayList<>();
        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement addBtnSync1 =  driver2.findElement(By.xpath("//button[@class='add-seat']"));
        elementClick2(addBtnSync1, "Add Button Selected");
        Thread.sleep(2000);
        WebElement newSeat = driver2.findElement(By.xpath("//span[.=' 2 ']"));
        if (newSeat.isDisplayed()) {
            utils.log().info("Seat 2 is Added ");
        } else {
            utils.log().info("Seat2 is not Added");
            int w = 1/0;
        }

        WebElement item1 =  driver2.findElement(By.xpath("(//ion-col[@class='menu-name ion-text-left md hydrated'])[1]"));
        String itemName = item1.getText();
        WebElement price =  driver2.findElement(By.xpath("(//ion-col[@class='menu-name ion-text-left md hydrated'])[1]/../ion-col[4]"));
        String price1 = price.getText();
        WebElement Qty =  driver2.findElement(By.xpath("(//ion-col[@class='menu-name ion-text-left md hydrated'])[1]/../ion-col[2]"));
        String Qty1 = Qty.getText();

        elementClick2(item1, "Select Item - " + itemName + " - " + price1);

        WebElement seat21 =  driver2.findElement(By.xpath("//ion-col[.='Seat 2']"));
        String seatName = seat21.getText();
        elementClick2(seat21, seatName + " - selected");


        ///   GET SEAT 1 MENU VALUES  ///
        WebElement verifyItem1 =  driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-col[@class='menu-name ion-text-left md hydrated']"));
        String itemName2 = verifyItem1.getText();
//        Assert.assertEquals(itemName2,itemName);
        menuNameSeat1.add(itemName2);
        utils.log().info("Seat 1 Menu - "+menuNameSeat1);
        WebElement verifyItemPrize1 =  driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-col[@class='menu-name ion-text-left md hydrated']/../ion-col[4]"));
        String itemNamePrize2 = verifyItemPrize1.getText();
//        Assert.assertEquals(itemNamePrize2,price1);
        menuPrizeSeat1.add(itemNamePrize2);
        utils.log().info("Seat 1 Menu Prize - "+menuPrizeSeat1);
        WebElement verifyItemQty1 =  driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-col[@class='menu-name ion-text-left md hydrated']/../ion-col[2]"));
        String itemNameQty2 = verifyItemQty1.getText();
//        Assert.assertEquals(itemNameQty2,Qty1);
        menuQtySeat1.add(itemNameQty2);
        utils.log().info("Seat 1 Menu Qty- "+menuQtySeat1);
        TestUtils.menuNameSeat1 = menuNameSeat1;
        TestUtils.menuPrize1 = menuPrizeSeat1;
        TestUtils.menuQtySeat1 = menuQtySeat1;
        try{
            WebElement modifierItem1 =  driver2.findElement(By.xpath("(//ion-app[@id='seat1']//ion-col[@class='menu-name ion-text-left md hydrated'])[2]/../ion-row[1]//ion-col[1]"));
            String modifierItem11 = modifierItem1.getText();
            modifierNameSeat1.add(modifierItem11);
            utils.log().info("Seat 1 Modifier Qty- "+modifierNameSeat1);
            WebElement modifierPrizeItem1 =  driver2.findElement(By.xpath("(//ion-app[@id='seat1']//ion-col[@class='menu-name ion-text-left md hydrated'])[2]/../ion-row[1]//ion-col[4]"));
            String modifierPrizeItem11 = modifierPrizeItem1.getText();
            modifierPrizeSeat1.add(modifierPrizeItem11);
            utils.log().info("Seat 1 Modifier Qty- "+modifierPrizeSeat1);
            WebElement modifierQtyItem1 =  driver2.findElement(By.xpath("(//ion-app[@id='seat1']//ion-col[@class='menu-name ion-text-left md hydrated'])[2]/../ion-row[1]//ion-col[2]"));
            String modifierQtyItem11 = modifierQtyItem1.getText();
            modifierQtySeat1.add(modifierQtyItem11);
            utils.log().info("Seat 1 Modifier Qty- "+modifierQtySeat1);
            TestUtils.modifierNameSeat1 = modifierNameSeat1;
            TestUtils.modifierPrizeSeat1 = modifierPrizeSeat1;
            TestUtils.modifierQtySeat1 = modifierQtySeat1;

        }catch (Exception w){

        }
        ///   GET SEAT 1 FOOTER VALUES  ///
        WebElement subTotal1 =  driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[1]//ion-col[2]"));
        WebElement tax1 =  driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[2]//ion-col[2]"));
        WebElement paidAmount1 =  driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[3]//ion-col[2]"));
        WebElement Total1 =  driver2.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[4]//ion-col[2]"));
        String subtotalTxt = subTotal1.getText();
        TestUtils.subTotalFromSplitSeat1 = subtotalTxt;
        utils.log().info("Subtotal Seat 1 - "+subtotalTxt);
        String taxTxt = tax1.getText();
        TestUtils.taxFromSplitSeat1 = taxTxt;
        utils.log().info("Tax Seat 1 - "+taxTxt);
        String paidAmountTxt = paidAmount1.getText();
        TestUtils.paidAmountFromSplitSeat1 = paidAmountTxt;
        utils.log().info("Paid Amount Seat 1 - "+paidAmountTxt);
        String totalTxt = Total1.getText();
        TestUtils.totalAmountFromSplitSeat1 = totalTxt;
        utils.log().info("Total Seat 1 - "+totalTxt);

        ///   GET SEAT 2 MENU VALUES  ///
        WebElement verifyItem2 =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-col[@class='menu-name ion-text-left md hydrated']"));
        String itemName22 = verifyItem2.getText();
        Assert.assertEquals(itemName22,itemName);
        menuNameSeat2.add(itemName22);
        utils.log().info("Moved Menu - "+menuNameSeat2);
        WebElement verifyItemPrize2 =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-col[@class='menu-name ion-text-left md hydrated']/../ion-col[4]"));
        String itemNamePrize22 = verifyItemPrize2.getText();
        Assert.assertEquals(itemNamePrize22,price1);
        menuPrizeSeat2.add(itemNamePrize22);
        utils.log().info("Moved Menu Prize - "+menuPrizeSeat2);
        WebElement verifyItemQty2 =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-col[@class='menu-name ion-text-left md hydrated']/../ion-col[2]"));
        String itemNameQty22 = verifyItemQty2.getText();
        Assert.assertEquals(itemNameQty22,Qty1);
        menuQtySeat2.add(itemNameQty22);
        utils.log().info("Moved Menu Qty- "+menuQtySeat2);
            TestUtils.menuNameSeat2 = menuNameSeat2;
            TestUtils.menuPrize2 = menuPrizeSeat2;
            TestUtils.menuQtySeat2 = menuQtySeat2;

        try{
            WebElement modifierItem1 =  driver2.findElement(By.xpath("(//ion-app[@id='seat2']//ion-col[@class='menu-name ion-text-left md hydrated'])[2]/../ion-row[1]//ion-col[1]"));
            String modifierItem11 = modifierItem1.getText();
            modifierNameSeat2.add(modifierItem11);
            utils.log().info("Seat 2 Modifier Qty- "+modifierNameSeat1);
            WebElement modifierPrizeItem1 =  driver2.findElement(By.xpath("(//ion-app[@id='seat2']//ion-col[@class='menu-name ion-text-left md hydrated'])[2]/../ion-row[1]//ion-col[4]"));
            String modifierPrizeItem11 = modifierPrizeItem1.getText();
            modifierPrizeSeat2.add(modifierPrizeItem11);
            utils.log().info("Seat 2 Modifier Qty- "+modifierPrizeSeat2);
            WebElement modifierQtyItem1 =  driver2.findElement(By.xpath("(//ion-app[@id='seat2']//ion-col[@class='menu-name ion-text-left md hydrated'])[2]/../ion-row[1]//ion-col[2]"));
            String modifierQtyItem11 = modifierQtyItem1.getText();
            modifierQtySeat2.add(modifierQtyItem11);
            utils.log().info("Seat 2 Modifier Qty- "+modifierQtySeat2);
            TestUtils.modifierNameSeat2 = modifierNameSeat2;
            TestUtils.modifierPrizeSeat2 = modifierPrizeSeat2;
            TestUtils.modifierQtySeat2 = modifierQtySeat2;

        }catch (Exception w){

        }
            ///   GET SEAT 2 FOOTER VALUES  ///
        WebElement subTotal =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[1]//ion-col[2]"));
        WebElement tax =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[2]//ion-col[2]"));
        WebElement paidAmount =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[3]//ion-col[2]"));
        WebElement Total =  driver2.findElement(By.xpath("//ion-app[@id='seat2']//ion-footer//ion-row[4]//ion-col[2]"));
        String subtotalTxt2 = subTotal.getText();
        TestUtils.subTotalFromSplitSeat2 = subtotalTxt2;
        utils.log().info("Subtotal Seat 2 - "+subtotalTxt2);
        String taxTxt2 = tax.getText();
        TestUtils.taxFromSplitSeat2 = taxTxt2;
        utils.log().info("Tax Seat 2 - "+taxTxt2);
        String paidAmountTxt2 = paidAmount.getText();
        TestUtils.paidAmountFromSplitSeat2 = paidAmountTxt2;
        utils.log().info("Paid Amount Seat 2- "+paidAmountTxt2);
        String totalTxt2 = Total.getText();
        TestUtils.totalAmountFromSplitSeat2 = totalTxt2;
        utils.log().info("Total Seat 2- "+totalTxt2);
    }

    public void verifyAllClubbedSeatPrizeAfterGroupSeatDoneDirect(){
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //////  SUBTOTAL AFTER GROUP SEATS  /////////
        String subTotalTxt1 = TestUtils.subtotalSeat2;
        String subTotalTxt2 = subTotalTxt1.replaceAll("[A-Z$,. ]", "");
        int subTotalAmount1 = Integer.parseInt(subTotalTxt2);
        String subTotalTxt11 = TestUtils.subtotalSeat1;
        String subTotalTxt22 = subTotalTxt11.replaceAll("[A-Z$,. ]", "");
        int subTotalAmount2 = Integer.parseInt(subTotalTxt22);
        int subTotalAmount = subTotalAmount1 + subTotalAmount2;
        utils.log().info("Subtotal Merged Seat 1 After Group - " + subTotalAmount);
        WebElement subTotal =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[1]//ion-col[2]"));
        String subtotal = subTotal.getText();
        TestUtils.subTotalTxtGroup = subtotal;
        String subtotal1 = subtotal.replaceAll("[A-Z$., ]", "");
        int subtotalAmount = Integer.parseInt(subtotal1);
        utils.log().info("Subtotal AMount Seat 1 After Group - " + subtotalAmount);
        Assert.assertEquals(String.valueOf(subTotalAmount), String.valueOf(subtotalAmount));
        utils.log().info("Subtotal is SAME After Group Seats Done - " + subtotal);

        //////  TAX AFTER GROUP SEATS  /////////

        String taxSeat2 = taxTxtSeat2;
        String taxTxt2 = taxSeat2.replaceAll("[A-Z$,. ]", "");
        int tax2 = Integer.parseInt(taxTxt2);
        String taxSeat1 = taxTxtSeat2;
        String taxTxt1 = taxSeat1.replaceAll("[A-Z$,. ]", "");
        int tax1 = Integer.parseInt(taxTxt1);
        int taxAmount = tax2 + tax1;
        utils.log().info("tax Merged Seat 1 After Group - " + taxAmount);

        WebElement tax =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[2]//ion-col[2]"));
        String taX = tax.getText();
        TestUtils.taxTxtGroup = taX;
        String taX1 = taX.replaceAll("[A-Z$,. ]", "");
        int taXAmount = Integer.parseInt(taX1);
        utils.log().info("Tax AMount Seat 1 After Group - " + taXAmount);
        Assert.assertEquals(taxAmount, taXAmount);
        utils.log().info("Tax is SAME After Group Seats Done - " + taX);

        //////  PAID AMOUNT AFTER GROUP SEATS  /////////

        String paidAmounT = TestUtils.paidAmountSeat1;
        String paidAmounT2 = paidAmounT.replaceAll("[A-Z$,. ]", "");
        int paidAmounT1 = Integer.parseInt(paidAmounT2);
        String paidAmounT11 = TestUtils.paidAmountSeat2;
        String paidAmounT22 = paidAmounT11.replaceAll("[A-Z$,. ]", "");
        int paidAmounT12 = Integer.parseInt(paidAmounT22);
        int paidAmount = paidAmounT1 + paidAmounT12;
        utils.log().info("Paid AMount Merged Seat 1 After Group - " + paidAmount);
        WebElement paidAmountt =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[3]//ion-col[2]"));
        String paidAmountt1 = paidAmountt.getText();
        TestUtils.paidAmountTxtGroup = paidAmountt1;
        TestUtils.paidAmount1 = paidAmountt1;
        String paidAmountt11 = paidAmountt1.replaceAll("[A-Z$., ]", "");
        int paidAmounTT = Integer.parseInt(paidAmountt11);
        utils.log().info("Paid AMount Seat 1 After Group - " + paidAmounTT);
        Assert.assertEquals(String.valueOf(paidAmount), String.valueOf(paidAmounTT));
        utils.log().info("Paid AMount is SAME After Group Seats Done - " + paidAmountt1);

        //////  TOTAL AMOUNT AFTER GROUP SEATS  /////////

        String totalTxt1 = TestUtils.totalSeat1;
        String totalTxt12 = totalTxt1.replaceAll("[A-Z$., ]", "");
        int totalTxt = Integer.parseInt(totalTxt12);
        String totalTxt11 = TestUtils.totalSeat2;
        String totalTxt22 = totalTxt11.replaceAll("[A-Z$., ]", "");
        int totalTxt2 = Integer.parseInt(totalTxt22);
        int totalTxTT = totalTxt2 + totalTxt;
        utils.log().info("Total AMount Merged Seat 1 After Group - " + totalTxTT);

        WebElement Total =  driver1.findElement(By.xpath("//ion-app[@id='seat1']//ion-footer//ion-row[4]//ion-col[2]"));
        String Total1 = Total.getText();
        TestUtils.totalTxtGroup = Total1;
        TestUtils.totalAmount1 = Total1;
        String Total11 = Total1.replaceAll("[A-Z$., ]", "");
        int TotaL = Integer.parseInt(Total11);
        utils.log().info("Total Seat 1 After Group - " + TotaL);
        Assert.assertEquals(totalTxTT, TotaL);
        utils.log().info("TOTAL is SAME After Group Seats Done - " + Total1);
    }

}
