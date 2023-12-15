package com.qa.pages;

import com.qa.utils.TestUtils;

import io.cucumber.java.bs.A;
import io.cucumber.java.hu.De;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Time;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.qa.utils.TestUtils.driver;

public class Regression extends TableLayOutScreen {
    public String checkNumber = "";
    @FindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search\"]")
    private WebElement searchFldDiscount;

    @FindBy(name = "Garlic Bread")
    private WebElement Menu;

    @FindBy(name = "4 BBQ")
    private WebElement modifier;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Cash\"])[2]")
    private WebElement CashbtnPaymentWindow;


    @FindBy(name = "Credit Card")
    WebElement creditCardBtn;

    @FindBy(name = "JCB")
    WebElement jcbBtn;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Total\"])[1]")
    WebElement totalScreen;

    @FindBy(name = "Continue")
    WebElement continueBtn;

    @FindBy(name = "Your Order")
    WebElement yourOrder;

    @FindBy(name = "Process")
    WebElement processBtn;

    @FindBy(name = "Card Type")
    WebElement cardTypeScreen;

    @FindBy(name = "Ok")
    WebElement okButtonCardTypeWindow;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Manual\"]")
    WebElement manualButton;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    WebElement cardNumberTxtField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[1]")
    WebElement expireNumTxtField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[2]")
    WebElement cvvTxtField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[3]")
    WebElement zipCodeTxtField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    WebElement cardNameField;

    @FindBy(name = "Finish")
    WebElement FinishBtn;

    @FindBy(name = "finish")
    private WebElement finishOrderBtn;

    @FindBy(name = "Signature Pad")
    WebElement signaturePadScreen;

    @FindBy(name = "Others")
    WebElement otherBtn;

    @FindBy(name = "No Thanks")
    WebElement noThanks;

    @FindBy(name = "  Submit")
    WebElement submit;

    @FindBy(name = "T1")
    WebElement secondTable;

    @FindBy(name = "1")
    WebElement singleSeat;

    @FindBy(name = "Corona Extra")
    WebElement coronaExtra;

    @FindBy(name = "Ultra")
    WebElement ultra;

    @FindBy(name = "Havana Lager")
    WebElement havana;

    @FindBy(name = "Lagunitas (IPA)")
    WebElement lagunitas;

    @FindBy(name = "Corona Light")
    WebElement coronaLight;

    @FindBy(name = "Blue Moon")
    WebElement blueMoon;


    @FindBy(name = "Angry Orchard (Cider)")
    WebElement angryOrchard;


    @FindBy(name = "Virgin Frozen")
    WebElement heinken;


    @FindBy(name = "Water")
    WebElement budweiser;


    @FindBy(name = "Hot Tea")
    WebElement budLight;

    @FindBy(name = "Heineken Double Zero")
    WebElement heinkenDouble;

    @FindBy(name = "Decaf Coffee")
    WebElement gingerBeer;

    @FindBy(name = "Virgin Mojito")
    WebElement miller;

    @FindBy(name = "Apple Juice")
    WebElement solaIPA;

    @FindBy(name = "Yuengling (Lager)")
    WebElement yuenglingLager;


    @FindBy(name = "Un-Holly (Belgian Ale)")
    WebElement unHolly;


    @FindBy(name = "Schofferhofer")
    WebElement schofferhofer;

    @FindBy(name = "All")
    private WebElement allBtn;

    @FindBy(name = "Table Layout")
    private WebElement tableLayoutTab;

    @FindBy(name = "MPPG AUTH")
    private WebElement mppgPayment;

    @FindBy(name = "MPPG")
    private WebElement mppgSal;

    @FindBy(name = "New Tab")
    private WebElement newTab;

    @FindBy(name = "New Check")
    private WebElement newCheck;

    @FindBy(name = "Exit")
    WebElement exitPreauth;

    @FindBy(name = "Check")
    private WebElement Order1;

    @FindBy(name = "Payment receipt did not print to TCP:192.168.2.161")
    private WebElement paymentPrint;

    @FindBy(name = "Done")
    private WebElement done;

    @FindBy(name = "OK")
    private WebElement okBtn;

    @FindBy(name = "Ok")
    private WebElement okBtn1;


    @FindBy(name = "BerryFruit Cup")
    private WebElement berrry;
    @FindBy(name = "Side Sweet Fries")
    private WebElement sideSweet;
    @FindBy(name = "Oyster Cracker,")
    private WebElement oyster;

    @FindBy(name = "Side ColeSlaw")
    private WebElement sideCole;
    @FindBy(name = "Fries")
    private WebElement fries;
    @FindBy(name = "1Pc Bana Bread")
    private WebElement banaBread;
    @FindBy(name = "Add 1 Egg")
    private WebElement addEgg;
    @FindBy(name = "Bacon Side")
    private WebElement baconSide;
    @FindBy(name = "1Pc Toast")
    private WebElement Toast;
    @FindBy(name = "Home Fries")
    private WebElement homeFries;
    @FindBy(name = "2Pcs BanaBread")
    private WebElement PcsBana;
    @FindBy(name = "Side Fruit")
    private WebElement sideFruit;

    @FindBy(name = "Cheesecake")
    private WebElement cheese;

    @FindBy(name = "Cannoli")
    private WebElement cannoli;

    @FindBy(name = "Tiramisu")
    private WebElement tiramisu;

    @FindBy(name = "Choc Torte")
    private WebElement choc;

    @FindBy(name = "Key Lime Pie")
    private WebElement keyLime;

    @FindBy(name = "Potatoes")
    private WebElement potatoes;
    @FindBy(name = "cake")
    private WebElement cake;
    @FindBy(name = "Halwa")
    private WebElement halwa;
    @FindBy(name = "Dosa")
    private WebElement dosa;
    @FindBy(name = "Donut")
    private WebElement donut;

    @FindBy(name = "Melon Ball")
    private WebElement menu1;
    @FindBy(name = "Lemon Drop")
    private WebElement mymenu1;
    @FindBy(name = "Ketel 1.")
    private WebElement mobmenu;
    @FindBy(name = "Jager Bomb")
    private WebElement dummy;
    @FindBy(name = "Jager")
    private WebElement rsMenu;
    @FindBy(name = "Fireball.")
    private WebElement gmenu;

    @FindBy(name = "test13")
    private WebElement test13;
    @FindBy(name = "Test321")
    private WebElement test321;
    @FindBy(name = "Retail")
    private WebElement retail;
    @FindBy(name = "Test456")
    private WebElement test4;
    @FindBy(name = "Child Retail")
    private WebElement childRetail;


    @FindBy(name = "Cash")
    private WebElement cashPayment;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Cash\"])[2]")
    private WebElement cashPayment1;

    @FindBy(name = "Exact")
    private WebElement exactBtn;


    @FindBy(name = "Enter")
    private WebElement Enter;

    @FindBy(name = "MPPG AUTH")
    private WebElement mppgAuth2;

    @FindBy(name = "mppg auth")
    private WebElement mppgAuth;

    @FindBy(name = "MPPG Auth")
    private WebElement mppgAuth1;

    @FindBy(name = "Beverages")
    private WebElement bever;

    @FindBy(name = "Pineapple Juice")
    private WebElement pineapple;
    @FindBy(name = "Grapefruit")
    private WebElement grape;
    @FindBy(name = "Milk")
    private WebElement milk;
    @FindBy(name = "Virgin Mojito")
    private WebElement virginMo;
    @FindBy(name = "Hot Tea")
    private WebElement hotTea;
    @FindBy(name = "Soda")
    private WebElement soda;
    @FindBy(name = "coffee")
    private WebElement coffee;
    @FindBy(name = "Espresso")
    private WebElement esp;
    @FindBy(name = "Party Drink")
    private WebElement partyDrink;
    @FindBy(name = "Apple Juice")
    private WebElement apple;
    @FindBy(name = "Cappuccino")
    private WebElement cap;

    @FindBy(name = "Coke Products")
    private WebElement cakeProd;
    @FindBy(name = "Salgam")
    private WebElement salgam;
    @FindBy(name = "Ayran")
    private WebElement Ayran;
    @FindBy(name = "Ayran 3")
    private WebElement Ayran3;
    @FindBy(name = "Turkish Tea")
    private WebElement turkishteapot;
    @FindBy(name = "Cofeeee")
    private WebElement cofeee;


    @FindBy(name = "cc")
    private WebElement cc;

    @FindBy(name = "HA")
    private WebElement ha;

    @FindBy(name = "5.00%")
    WebElement tipss;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[1]")
    private WebElement doneButton;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"arrow down\"])[2]")
    public WebElement arrowDownForOtherMenuItems;

    @FindBy(name = "Cancel")
    private WebElement cancelBtn;
    @FindBy(name = "parent")
    WebElement parent;
    @FindBy(name = "VegBiriyani")
    WebElement VegBri;
    @FindBy(name = "incluse")
    WebElement incluse;
    @FindBy(name = "normal")
    WebElement normal;
    @FindBy(name = "taxmenu")
    WebElement taxMenu;
    @FindBy(name = "EggBiriyani")
    WebElement EggB;
    @FindBy(name = "New2")
    WebElement new2;
    @FindBy(name = "Cate-Menu 1")
    WebElement cateMe;
    @FindBy(name = "Cate-Menu 2")
    WebElement cateMe2;

    @FindBy(name = "Arab Biriyani")
    WebElement ArabBr;
    @FindBy(name = "5.00")
    WebElement tipAs10;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment\"]")
    private WebElement paymentBtn;

    public void mppgSale() throws Exception {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for (int i = 1; i <= 150; i++) {

            pressPayment();
            try {

                scrollToElementPayments(mppgAuth, "up");
                click(mppgAuth);
            } catch (Exception z) {
                scrollToElementPayments(mppgAuth, "down");
                click(mppgAuth);
            }
            click(continueBtn);
            click(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");


            cardNameField.sendKeys("GFT");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            click(processBtn, "Tapped process Button");

            try {
                click(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
            click(cancelBtn);
        }
    }

    public void makeSaleForTipStore() throws Exception {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        for (int z = 1; z <= 40; z++) {
            utils.log().info("Sale Count - " + z);
//            if (tableLayoutTab.isDisplayed()) {
//                utils.log().info("Table Layout visible");
//            }
//            elementClick(newCheck,"Tapped new check");
//            WebElement table3 = (WebElement) driver.findElements(By.xpath()("T9");
//            elementClick(table3,"");
//            elementClick(singleSeat, "Tapped Single ");
//            elementClick(continueBtn, "Tapped Continue");
//            if (Order1.isDisplayed()){
//                utils.log().info("Order screen is visible");
//            }
            pressArrowDown2();
//            elementClick(ArabBr, "bever");
//            elementClick(normal, "Pine");
//            elementClick(new2, "");
//            elementClick(cateMe2, "");
//            elementClick(EggB, "");
//            elementClick(taxMenu, "");
//            elementClick(parent, "");
//            elementClick(cateMe, "");
            WebElement rbg = (WebElement) driver.findElement(By.xpath("SHOTS"));
            elementClick(rbg, "");
            elementClick(mobmenu, "");
            elementClick(menu1, "");
            elementClick(gmenu, "");
            elementClick(mymenu1, "");
            elementClick(dummy, "");
            elementClick(paymentBtn, "Payment button is tapped");
            try {
                if (find(mppgAuth, 2)) {
                    elementClick(mppgAuth, "Tapped NMI Payment");
                } else {
                    scrollToElementPayments(mppgAuth, "up");
                    elementClick(mppgAuth, "Tapped NMI Payment");
                }
            } catch (Exception w) {
                scrollToElementPayments(mppgAuth, "down");
                elementClick(mppgAuth, "Tapped NMI Payment");
            }
            //scrollToElementPayment(mppgAuth, "up");
            //elementClick(mppgAuth, "");

            elementClick(tipAs10, "Tapped tip As 10");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");

            try {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }

            elementClick(cancelBtn, "");
        }
        for (int z = 31; z <= 70; z++) {
            utils.log().info("Sale Count - " + z);
//            if (tableLayoutTab.isDisplayed()) {
//                utils.log().info("Table Layout visible");
//            }
//            elementClick(newCheck,"Tapped new check");
//            WebElement table3 = (WebElement) driver.findElements(By.xpath()("T9");
//            elementClick(table3,"");
//            elementClick(singleSeat, "Tapped Single ");
//            elementClick(continueBtn, "Tapped Continue");
//            if (Order1.isDisplayed()){
//                utils.log().info("Order screen is visible");
//            }
            //   pressArrowDown2();
            elementClick(ArabBr, "bever");
            elementClick(normal, "Pine");
            elementClick(new2, "");
            elementClick(cateMe2, "");
            elementClick(new2, "");
            elementClick(taxMenu, "");
            elementClick(incluse, "");
            elementClick(parent, "");
            elementClick(cateMe, "");
            elementClick(paymentBtn, "Payment button is tapped");

            scrollToElementPayments(mppgAuth1, "up");
            elementClick(mppgAuth1, "");

            elementClick(tipAs10, "Tapped tip As 10");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");

            try {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }

            elementClick(cancelBtn, "");
        }


    }

    public void saleForTestStatePost1() throws InterruptedException {
        for (int z = 1; z <= 32; z++) {
            utils.log().info("Table Count - " + z);
            elementClick(newCheck, "Tapped new check");
            // elementClick(exitPreauth,"");
            WebElement table3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"T" + z + "\"]"));
            elementClick(table3, "");
            elementClick(singleSeat, "Tapped Single ");
            elementClick(continueBtn, "Tapped Continue");
            // For get check number
            getCheckNumberTxt();
            // utils.log().info( TestUtils.globalCheckNumber);
            pressArrowDown2();
            WebElement rbg = (WebElement) driver.findElement(By.xpath("SHOTS"));
            elementClick(rbg, "");
            elementClick(mobmenu, "");
            elementClick(menu1, "");
            elementClick(gmenu, "");
            elementClick(mymenu1, "");
            elementClick(dummy, "");


//            pressPayment();
//            click(mppgSale, "Tapped mppg");
//            WebElement visa = (WebElement) driver.findElement(By.xpath()("Visa");
//            click(visa);
//            click(okBtn1);
//            click(continueBtn);
//            click(manualButton, "Tapped Manual Button");
//
//            cardNumberTxtField.sendKeys("4111111111111111");
//
//            cardNameField.sendKeys("JCB");
//            cardNameField.sendKeys(Keys.ENTER);
//
//            expireNumTxtField.sendKeys("1222");
//
//            cvvTxtField.sendKeys(Keys.ENTER);
//
//            zipCodeTxtField.sendKeys(Keys.ENTER);
//
//            click(processBtn, "Tapped process Button");
//
//            try {
//                click(okBtn, "Tapped Ok Button on the Popup");
//            } catch (Exception e) {
//            }
            elementClick(finishOrderBtn, "");
        }
        for (int y = 31; y > 1; y--) {
            utils.log().info("table count - " + y);
            elementClick(newCheck, "Tapped new check");
            //  elementClick(exitPreauth,"");
            WebElement table31 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"T" + y + "\"]"));
            elementClick(table31, "");
            elementClick(singleSeat, "Tapped Single ");
            elementClick(continueBtn, "Tapped Continue");
            getCheckNumberTxt();
            pressArrowDown2();
            WebElement rbg = (WebElement) driver.findElement(By.xpath("SHOTS"));
            elementClick(rbg, "");
            elementClick(mobmenu, "");
            elementClick(menu1, "");
            elementClick(rsMenu, "");
            elementClick(mymenu1, "");
            elementClick(dummy, "");
            elementClick(gmenu, "");
            elementClick(finishOrderBtn, "");
        }

    }

    public void PalaceStore() throws Exception {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for (int j = 1; j <= 50; j++) {
            utils.log().info("Sale - " + j);
            getCheckNumberTxt();
            pressArrowDown2();
            WebElement rbg = (WebElement) driver.findElement(By.xpath("Beverages"));
            elementClick(rbg, "");
            elementClick(solaIPA, "");
            elementClick(budLight, "");
            elementClick(budweiser, "");
            elementClick(heinken, "");
            elementClick(miller, "");
            elementClick(gingerBeer, "");


//                    pressPayment();
//                    click(otherBtn);
//                    click(submit);

            pressPayment();
            scrollToElementPayments(mppgAuth, "up");
            elementClick(mppgPayment, "");

            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");

            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }


        }
        for (int j = 51; j <= 100; j++) {
            utils.log().info("Sale - " + j);
            getCheckNumberTxt();
            pressArrowDown2();
            WebElement rbg = (WebElement) driver.findElement(By.xpath("Beverages"));
            elementClick(rbg, "");
            elementClick(solaIPA, "");
            elementClick(budLight, "");
            elementClick(budweiser, "");
            elementClick(heinken, "");
            elementClick(gingerBeer, "");

//                    pressPayment();
//                    click(otherBtn);
//                    click(submit);

            pressPayment();
            scrollToElementPayments(mppgAuth, "up");
            elementClick(mppgPayment, "");

            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");

            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
        }

        for (int j = 101; j <= 180; j++) {
            utils.log().info("Sale - " + j);
            getCheckNumberTxt();
            pressArrowDown2();
            WebElement rbg = (WebElement) driver.findElement(By.xpath("Beverages"));
            elementClick(rbg, "");
            elementClick(solaIPA, "");
            elementClick(gingerBeer, "");

            elementClick(budLight, "");
            elementClick(budweiser, "");
            elementClick(heinken, "");
            elementClick(gingerBeer, "");


//                    pressPayment();
//                    click(otherBtn);
//                    click(submit);

            pressPayment();
            scrollToElementPayments(mppgAuth, "up");
            elementClick(mppgPayment, "");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");

            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
        }
        for (int k = 181; k <= 250; k++) {
            utils.log().info("Sale - " + k);
            getCheckNumberTxt();
            pressArrowDown2();
            WebElement rbg = (WebElement) driver.findElement(By.xpath("Beverages"));
            elementClick(rbg, "");
            elementClick(solaIPA, "");
            elementClick(budLight, "");
            elementClick(budweiser, "");
            elementClick(heinken, "");
            elementClick(budLight, "");
            elementClick(gingerBeer, "");


//                    pressPayment();
//                    click(otherBtn);
//                    click(submit);

            pressPayment();
            scrollToElementPayments(mppgAuth, "up");
            elementClick(mppgPayment, "");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");

            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
        }

        for (int j = 251; j <= 320; j++) {
            utils.log().info("Sale - " + j);
            getCheckNumberTxt();
            pressArrowDown2();
            WebElement rbg = (WebElement) driver.findElement(By.xpath("Beverages"));
            elementClick(rbg, "");
            elementClick(solaIPA, "");
            elementClick(budLight, "");
            elementClick(budweiser, "");
            elementClick(heinken, "");
            elementClick(gingerBeer, "");
            elementClick(heinken, "");


//                    pressPayment();
//                    click(otherBtn);
//                    click(submit);

            pressPayment();
            scrollToElementPayments(mppgAuth, "up");
            elementClick(mppgPayment, "");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");

            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }

        }
    }

    public void makeTableSale() throws Exception {
        for (int m = 1; m <= 25; m++) {

            utils.log().info("Sale Count - " + m);
//                  if (tableLayoutTab.isDisplayed()) {
//                        utils.log().info("Table Layout visible");
//                    }
//                    elementClick(newCheck,"Tapped new check");
//                    WebElement table = (WebElement) driver.findElement(By.xpath()("T8");
//                    elementClick(table,"");
//                    elementClick(singleSeat, "Tapped Single ");
//                    elementClick(continueBtn, "Tapped Continue");

            pressArrowDown2();
            elementClick(bever, "Tapped bever");
            //elementClick(pineapple,"pinapple");
            elementClick(grape, "grapes");
            elementClick(hotTea, "hot Tea");
            // elementClick(milk,"milk");
            elementClick(coffee, "coffee");
            elementClick(soda, "soda");
            elementClick(esp, "esp");


//                      pressPayment();
//                    scrollToElementPayment(otherBtn,"up");
//                    elementClick(otherBtn,"");
//                    elementClick(submit,"");
//                    pressPayment();
//
//                    elementClick(cashPayment1,"");
            // elementClick(exactBtn,"");
            // elementClick(Enter,"");
            //   elementClick(submit,"");
//Thread.sleep(50);
            //      elementClick(cancelBtn,"");
//                    pressPayment();
//                    scrollToElementPayment(cc,"up");
//                    elementClick(cc,"");
//                    elementClick(continueBtn,"");
//                    elementClick(submit,"");
            pressPayment();
            scrollToElementPayments(mppgAuth, "up");
            elementClick(mppgAuth, "");
            elementClick(tipss, "");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");

            try {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            elementClick(cancelBtn, "");
        }
        for (int m = 26; m <= 70; m++) {

            utils.log().info("Sale Count - " + m);
//                  if (tableLayoutTab.isDisplayed()) {
//                        utils.log().info("Table Layout visible");
//                    }
//                    elementClick(newCheck,"Tapped new check");
//                    WebElement table = (WebElement) driver.findElement(By.xpath()("T8");
//                    elementClick(table,"");
//                    elementClick(singleSeat, "Tapped Single ");
//                    elementClick(continueBtn, "Tapped Continue");

            pressArrowDown2();
            elementClick(bever, "Tapped bever");
            //elementClick(pineapple,"pinapple");
            elementClick(grape, "grapes");
            elementClick(hotTea, "hot Tea");
            // elementClick(milk,"milk");
            elementClick(coffee, "coffee");
            elementClick(esp, "esp");
            elementClick(soda, "soda");
            elementClick(esp, "esp");


//                      pressPayment();
//                    scrollToElementPayment(otherBtn,"up");
//                    elementClick(otherBtn,"");
//                    elementClick(submit,"");
//                    pressPayment();
//
//                    elementClick(cashPayment1,"");
            // elementClick(exactBtn,"");
            // elementClick(Enter,"");
            //   elementClick(submit,"");
//Thread.sleep(50);
            //      elementClick(cancelBtn,"");
//                    pressPayment();
//                    scrollToElementPayment(cc,"up");
//                    elementClick(cc,"");
//                    elementClick(continueBtn,"");
//                    elementClick(submit,"");
            pressPayment();
            scrollToElementPayments(mppgAuth, "up");
            elementClick(mppgAuth, "");
            elementClick(tipss, "");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");


            try {
                driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
            driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
            elementClick(cancelBtn, "");
        }
        for (int m = 71; m <= 100; m++) {

            utils.log().info("Sale Count - " + m);
//                  if (tableLayoutTab.isDisplayed()) {
//                        utils.log().info("Table Layout visible");
//                    }
//                    elementClick(newCheck,"Tapped new check");
//                    WebElement table = (WebElement) driver.findElement(By.xpath()("T8");
//                    elementClick(table,"");
//                    elementClick(singleSeat, "Tapped Single ");
//                    elementClick(continueBtn, "Tapped Continue");

            pressArrowDown2();
            elementClick(bever, "Tapped bever");
            //elementClick(pineapple,"pinapple");
            elementClick(grape, "grapes");
            elementClick(hotTea, "hot Tea");
            elementClick(hotTea, "hot Tea");
            // elementClick(milk,"milk");
            elementClick(coffee, "coffee");
            elementClick(soda, "soda");
            elementClick(esp, "esp");


//                      pressPayment();
//                    scrollToElementPayment(otherBtn,"up");
//                    elementClick(otherBtn,"");
//                    elementClick(submit,"");
//                    pressPayment();
//
//                    elementClick(cashPayment1,"");
            // elementClick(exactBtn,"");
            // elementClick(Enter,"");
            //   elementClick(submit,"");
//Thread.sleep(50);
            //      elementClick(cancelBtn,"");
//                    pressPayment();
//                    scrollToElementPayment(cc,"up");
//                    elementClick(cc,"");
//                    elementClick(continueBtn,"");
//                    elementClick(submit,"");
            pressPayment();
            scrollToElementPayments(mppgAuth, "up");
            elementClick(mppgAuth, "");
            elementClick(tipss, "");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");


            try {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            elementClick(cancelBtn, "");
        }
        for (int m = 21; m <= 40; m++) {
            utils.log().info("Sale Count - " + m);
            if (tableLayoutTab.isDisplayed()) {
                utils.log().info("Table Layout visible");
            }

            elementClick(newCheck, "Tapped new check");
            WebElement table = (WebElement) driver.findElement(By.xpath("T2"));
            elementClick(table, "");

            elementClick(singleSeat, "Tapped Single ");
            elementClick(continueBtn, "Tapped Continue");
            if (Order1.isDisplayed()) {
                utils.log().info("Order screen is visible");
            }
            pressArrowDown2();
            elementClick(bever, "Tapped bever");
            elementClick(pineapple, "pinapple");
            elementClick(grape, "grapes");
            elementClick(hotTea, "hot Tea");
            elementClick(milk, "milk");
            elementClick(coffee, "coffee");
            elementClick(soda, "soda");
            elementClick(esp, "esp");
            elementClick(partyDrink, "partyDrink");
            elementClick(apple, "Apple");


            elementClick(cashPayment, "");
            elementClick(exactBtn, "");
            elementClick(Enter, "");

        }

        for (int n = 41; n <= 60; n++) {
            utils.log().info("Sale Count - " + n);
            if (tableLayoutTab.isDisplayed()) {
                utils.log().info("Table Layout visible");
            }
            elementClick(newCheck, "Tapped new check");
            WebElement table1 = (WebElement) driver.findElement(By.xpath("T3"));
            click(table1);
            elementClick(singleSeat, "Tapped Single ");
            elementClick(continueBtn, "Tapped Continue");
            if (Order1.isDisplayed()) {
                utils.log().info("Order screen is visible");
            }
            pressArrowDown2();
            elementClick(bever, "");
            elementClick(pineapple, "");
            elementClick(grape, "");
            elementClick(hotTea, "");
            elementClick(milk, "");
            elementClick(coffee, "");
            elementClick(soda, "");
            elementClick(esp, "");
            elementClick(partyDrink, "");
            elementClick(virginMo, "");

            pressPayment();
            elementClick(otherBtn, "");
            elementClick(submit, "");
            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }

        }

        for (int w = 61; w <= 80; w++) {
            utils.log().info("Sale Count - " + w);
            if (tableLayoutTab.isDisplayed()) {
                utils.log().info("Table Layout visible");
            }
            elementClick(newCheck, "Tapped new check");
            WebElement table3 = (WebElement) driver.findElement(By.xpath("T13"));
            elementClick(table3, "");
            elementClick(singleSeat, "Tapped Single ");
            elementClick(continueBtn, "Tapped Continue");
            if (Order1.isDisplayed()) {
                utils.log().info("Order screen is visible");
            }
            pressArrowDown2();
            elementClick(bever, "");
            elementClick(pineapple, "");
            elementClick(grape, "");
            elementClick(hotTea, "");
            elementClick(milk, "");
            elementClick(coffee, "");
            elementClick(soda, "");
            elementClick(esp, "");
            elementClick(partyDrink, "");
            pressPayment();
            elementClick(cc, "");
            elementClick(continueBtn, "");
            elementClick(submit, "");

            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
        }

        for (int z = 81; z <= 100; z++) {
            utils.log().info("Sale Count - " + z);
            if (tableLayoutTab.isDisplayed()) {
                utils.log().info("Table Layout visible");
            }
            elementClick(newCheck, "Tapped new check");
            WebElement table3 = (WebElement) driver.findElements(By.xpath("T9"));
            elementClick(table3, "");
            elementClick(singleSeat, "Tapped Single ");
            elementClick(continueBtn, "Tapped Continue");
            if (Order1.isDisplayed()) {
                utils.log().info("Order screen is visible");
            }
            pressArrowDown2();
            elementClick(bever, "bever");
            elementClick(pineapple, "Pine");
            elementClick(grape, "");
            elementClick(hotTea, "");
            elementClick(milk, "");
            elementClick(coffee, "");
            elementClick(soda, "");
            elementClick(esp, "");
            elementClick(partyDrink, "");
            pressPayment();

            scrollToElementPayments(mppgAuth, "up");
            elementClick(mppgAuth, "");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");

            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
        }
        for (int y = 1; y <= 15; y++) {
            utils.log().info("Sale Count - " + y);
            if (tableLayoutTab.isDisplayed()) {
                utils.log().info("Table Layout visible");
            }
            elementClick(newCheck, "Tapped new check");
            WebElement table3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"T" + y + "\"]"));
            elementClick(table3, "");
            elementClick(singleSeat, "Tapped Single ");
            elementClick(continueBtn, "Tapped Continue");
            if (Order1.isDisplayed()) {
                utils.log().info("Order screen is visible");
            }
            pressArrowDown2();
            click(bever);
            click(pineapple);
            click(grape);
            click(hotTea);
            click(milk);
            click(coffee);
            click(soda);
            click(esp);
            click(partyDrink);
            click(virginMo);
            click(apple);

        }
    }

    public void batchProd() throws Exception {
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        for (int z = 1; z <= 50; z++) {
            utils.log().info("Table Count - " + z);
            elementClick(newTab, "Tapped new check");
            elementClick(cancelBtn, "");
            pressArrowDown2();
            WebElement rbg = (WebElement) driver.findElement(By.xpath("WheatGrass"));
            elementClick(rbg, "");

            elementClick(test4, "");
            elementClick(test13, "");
            elementClick(retail, "");
            elementClick(childRetail, "");

            elementClick(retail, "");
            elementClick(test321, "");
            elementClick(paymentBtn, "Payment button is tapped");

            scrollToElementPayments(mppgAuth1, "up");
            elementClick(mppgAuth1, "");
            WebElement rbg1 = (WebElement) driver.findElement(By.xpath("Visa"));
            elementClick(rbg1, "");

            WebElement rbg2 = (WebElement) driver.findElement(By.xpath("Ok"));
            elementClick(rbg2, "");


            elementClick(tipAs10, "Tapped tip As 10");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");

            try {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }

        }
    }

    public void saleForTestzamBar() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for (int z = 1; z <= 40; z++) {
            utils.log().info("Bar Count - " + z);
            //  elementClick(barTab,"");
            elementClick(newTab, "Tapped new check");
            elementClick(cancelBtn, "");
            //elementClick(exitPreauth, "");
            //    WebElement table3 = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeStaticText[@name=\"T" + z + "\"]");
            //    elementClick(table3,"");
            //   elementClick(singleSeat, "Tapped Single ");
            //  elementClick(continueBtn, "Tapped Continue");
            // For get check number
            getCheckNumberTxt();
            // utils.log().info( TestUtils.globalCheckNumber);

            pressArrowDown2();
            elementClick(bever, "");
            //elementClick(pineapple, "");
            elementClick(grape, "");
            elementClick(hotTea, "");

            //  elementClick(coffee, "");
            elementClick(esp, "");
            elementClick(partyDrink, "");
            elementClick(apple, "");

            elementClick(finishOrderBtn, "");

        }

    }

    public void saleForTestzam() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        for (int z = 1; z <= 16; z++) {
            utils.log().info("Table Count - " + z);
            elementClick(newCheck, "Tapped new check");
            // elementClick(exitPreauth,"");
            WebElement table3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"T" + z + "\"]"));
            elementClick(table3, "");
            elementClick(singleSeat, "Tapped Single ");
            elementClick(continueBtn, "Tapped Continue");
            // For get check number
            getCheckNumberTxt();
            // utils.log().info( TestUtils.globalCheckNumber);
            pressArrowDown2();
            elementClick(bever, "");
            // elementClick(pineapple, "");
            elementClick(grape, "");
            elementClick(hotTea, "");

            //      elementClick(coffee, "");
            elementClick(grape, "");
            elementClick(esp, "");
            elementClick(partyDrink, "");
            elementClick(apple, "");
            elementClick(finishOrderBtn, "");
        }
        for (int y = 16; y >= 1; y--) {
            utils.log().info("table count - " + y);
            elementClick(newCheck, "Tapped new check");
            //  elementClick(exitPreauth,"");
            WebElement table31 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"T" + y + "\"]"));
            elementClick(table31, "");
            elementClick(singleSeat, "Tapped Single ");
            elementClick(continueBtn, "Tapped Continue");
            getCheckNumberTxt();
            pressArrowDown2();
            elementClick(bever, "");
            //  elementClick(pineapple, "");
            elementClick(grape, "");
            elementClick(hotTea, "");

            //elementClick(coffee, "");
            elementClick(grape, "");
            elementClick(esp, "");
            elementClick(partyDrink, "");
            elementClick(apple, "");
            elementClick(finishOrderBtn, "");
        }

    }

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[4]")
    private WebElement SplitBtn;

    @FindBy(name = "Split By Seat")
    private WebElement splitSeat;
    public int itemToSelect;
    public int itemToSelect1;
    public int itemToSelect3;
    public int itemToSelect4;


    public void selectMenuForSplitEvenly() {
        selectMenu();
        //   verifyTableSeat(itemToSelect);
        splitEvenlyAction();
        // verifyTableSeat(r);
    }

    public void selectMenuForSplitAction() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        selectMenu();
        doSplitAction();
        elementClick(SaveClose, "");
        elementClick(paymentBtn, "");
        elementClick(cashPayment1, "");
        elementClick(submit, "");
        //  splitEvenlyAction(itemToSelect);
    }


    public void verifyTableSeat(int h) {
        String m = Integer.toString(h);
        utils.log().info("TAble number - " + m);
        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther
        WebElement table = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + m + "]/XCUIElementTypeStaticText[4]"));
        String number = table.getText();
        utils.log().info(number);
        try {
            if (number != "1") {
                elementClick(table, "");
//              WebElement clickTable = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
//              String seatNumberTable = clickTable.getText();
//              utils.log().info("Seat num - "+seatNumberTable);
                WebElement tableClick = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + number + "]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
                elementClick(tableClick, "Click the Table - " + number);
                //  elementClick(clickTable, "Click the Table" + seatNumberTable);
            } else {
                WebElement table1 = (WebElement) driver.findElement(By.xpath("T" + m + ""));
                elementClick(table1, "");
            }
        } catch (Exception w) {

        }
    }

    public void verifyTableMerge(String m) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        utils.log().info("Table num - " + m);
//
//
        //     String m=Integer.toString(h);
        utils.log().info("m - " + m);
        String data = m.replaceAll("[A-Z]", "");
        utils.log().info("Table num after regex - " + data);
        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther
        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[18]
        WebElement table = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + data + "]/XCUIElementTypeStaticText[4]"));
        //   WebElement table = (WebElement) driver.findElement(By.xpath()(m);
        String number1 = table.getText();
        int number = Integer.parseInt(number1);
        utils.log().info("Seat Number - " + number);

        try {
            if (number != 1) {
                elementClick(table, "Table Selected - " + number);
//              WebElement clickTable = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
//              String seatNumberTable = clickTable.getText();
//              utils.log().info("Seat num - "+seatNumberTable);
                //  int no = number -1;

                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell
                List<WebElement> checksCollect =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                int countofCollect = checksCollect.size();
                utils.log().info("Check count in the table - " + countofCollect);
                WebElement lastOne = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + countofCollect + "]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[4]"));
                String lastOneTxt = lastOne.getText();
                elementClick(lastOne, "Selected the last check in the table & check number as - " + lastOneTxt);

//                WebElement tableClick = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + number + "]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
//                elementClick(tableClick, "selected the seat Number - " + number +" - - "+tableClick.getText());

                WebElement x = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeButton[@name=\"X\"]"));
                if (x.isDisplayed()) {
                    elementClick(x, "Tapped X");
                } else {

                }
                //  elementClick(clickTable, "Click the Table" + seatNumberTable);
            } else {
                WebElement table1 = (WebElement) driver.findElement(By.xpath(m));
                elementClick(table1, "table SELECTED - " + m);
            }
        } catch (Exception w) {

        }
    }

    public void afterMergeOpenSeat(String m) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        utils.log().info("Table num - " + m);
        String data = m.replaceAll("[A-Z]", "");
        utils.log().info("Table num after regex - " + data);
        //     String m=Integer.toString(h);
        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther
        WebElement table = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + data + "]/XCUIElementTypeStaticText[4]"));
        //  WebElement table = (WebElement) driver.findElement(By.xpath()(m);
        String number1 = table.getText();
        int number = Integer.parseInt(number1);
        utils.log().info(String.valueOf(number));
        try {
            if (number != 1) {
                elementClick(table, "table selected - " + number);

                int no = number - 1;
                utils.log().info(" After subtract 1 seat from Table Seat count- " + no);
//              WebElement clickTable = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
//              String seatNumberTable = clickTable.getText();
//              utils.log().info("Seat num - "+seatNumberTable);
                //XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther
//                WebElement tableClick = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + no + "]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
//                elementClick(tableClick, "Click the Table - " + number+" - - "+tableClick.getText());
//
//  elementClick(clickTable, "Click the Table" + seatNumberTable);

                List<WebElement> checksCollect =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                int countofCollect = checksCollect.size();
                utils.log().info("Merged Table - " + m + " - check count - " + countofCollect);
                WebElement lastOne = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + countofCollect + "]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[4]"));
                String lastOneTxt = lastOne.getText();
                elementClick(lastOne, "Selected the last check in the table & check number as - " + lastOneTxt);

            } else {
            }
        } catch (Exception w) {
            WebElement table1 = (WebElement) driver.findElement(By.xpath(m));
            elementClick(table1, "table Selected - " + m);
        }
    }

    public void verifyTableSeat1(String m) {
        utils.log().info("Table num - " + m);
        String data = m.replaceAll("[A-Z]", "");
        utils.log().info("Table num after regex - " + data);
        //     String m=Integer.toString(h);
        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther
        WebElement table = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + data + "]/XCUIElementTypeStaticText[4]"));
        String number = table.getText();
        utils.log().info(number);
        try {
            if (number != "1") {
                elementClick(table, "");
//              WebElement clickTable = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
//              String seatNumberTable = clickTable.getText();
//              utils.log().info("Seat num - "+seatNumberTable);
                WebElement tableClick = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + number + "]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
                elementClick(tableClick, "Click the Table - " + number);
                //  elementClick(clickTable, "Click the Table" + seatNumberTable);
            } else {
                WebElement table1 = (WebElement) driver.findElement(By.xpath("T" + data + ""));
                elementClick(table1, "");
            }
        } catch (Exception w) {

        }
    }

    public void RandomClickTable() {

        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));

        Random rand = new Random();
        WebElement New = (WebElement) driver.findElement(By.xpath("New"));
        elementClick(New, "Tapped New");
        for (int i = 1; i <= 2; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
            WebElement tableNum = (WebElement) mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]", "", TestUtils.XPath);
            utils.log().info(tableNum.getText());
            elementClick(tableNum, "Tapped Table Number");
        }
        WebElement seat = (WebElement) driver.findElement(By.xpath("1"));
        elementClick(seat, "Tapped seat Number");
        WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
        elementClick(cont, "Tapped continue");
        elementClick(arrowDownForOtherMenuItems, "");
    }

    @FindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    private WebElement item;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
    private WebElement verifyItem;

    @FindBy(name = "Seat 2")
    private WebElement seat2;

    public void doSplitAction() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        elementClick(AddBtn, "Add Button Selected");
        String itemName = item.getText();
        WebElement price = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]"));
        String price1 = price.getText();

        elementClick(item, "Select Item - " + itemName + " - " + price1);

        String seatName = seat2.getText();
        elementClick(seat2, seatName + " - selected");

        String itemName2 = verifyItem.getText();
        if (itemName.equalsIgnoreCase(itemName2)) {
            utils.log().info("Menu Item is moved from seat 1 to seat 2 - " + itemName2);
        } else {
            utils.log().info("Menu Item is not moved");
        }

    }

    public void splitEvenlyAction() {
        elementClick(AddBtn, "");
        WebElement splitEvenly = (WebElement) driver.findElement(By.xpath("Split Evenly"));
        elementClick(splitEvenly, "Split Evenly Selected");
        List<WebElement> coll =  driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        int cell = coll.size();
        utils.log().info("split seat - " + cell);
        for (int i = 1; i <= cell; i++) {
            List<WebElement> seat1Table =  driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + i + "]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell"));
            int cells = seat1Table.size();
            utils.log().info("seat " + i + " menu items - " + cells);
            for (int a = 1; a <= cells; a++) {
                WebElement type = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + a + "]/XCUIElementTypeStaticText[1]"));
                String name = type.getText();
                WebElement prices = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + a + "]/XCUIElementTypeStaticText[2]"));
                String price11 = prices.getText();
                utils.log().info("Menus are - " + name + " - " + price11);
            }
        }
//    List<WebElement> seat2Table =  driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell");
//    int cells1 = seat2Table.size();
//    utils.log().info("seat 2 menu items - "+cells1);
//    for(int a = 1;a<=cells1;a++){
//                                                                               //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]
//        WebElement type1 = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+a+"]/XCUIElementTypeStaticText[1]");
//        String name1 = type1.getText();
//        utils.log().info("Menus - "+name1);
//    }

    }

    public void splitSeperateItem(String noOfSplit) {

        selectMenu();
        elementClick(tableLayoutTab, "");

        elementClick(SplitBtn, "");
        elementClick(splitSeat, "");

        verifyTableSeat(itemToSelect);
        //  splitEvenlyAction(itemToSelect);
        doSeperate(noOfSplit);
        elementClick(SaveClose, "");
        elementClick(paymentBtn, "");
        elementClick(cashPayment1, "");
        elementClick(submit, "");

    }

    public void doSeperate(String no) {
        elementClick(item, "");
        String data = item.getText();
        WebElement price = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]"));
        String price1 = price.getText();
        utils.log().info("Menu for Seperate - " + data + " - " + price1);
        WebElement seperateItem = (WebElement) driver.findElement(By.xpath("Seperate Item"));
        elementClick(seperateItem, "");

        WebElement num = (WebElement) driver.findElement(By.xpath(no));
        elementClick(num, "");

        elementClick(continueBtn, "");

        List<WebElement> tale =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell"));
        int count = tale.size();

        utils.log().info("Counts of menu Item - " + count);
        for (int i = 1; i <= count; i++) {
            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]
            WebElement menuss = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
            String nameOfMenu = menuss.getText();
            WebElement prices = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[2]"));
            String price11 = prices.getText();
            utils.log().info("Menus are - " + nameOfMenu + " - " + price11);
        }
    }

    public void selectMenu() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));

/*****  RandOm Select Table ****/

        Random rand = new Random();
        WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
        elementClick(New, "Tapped New");
        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
            WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[3]"));
            utils.log().info(tableNum.getText());
            elementClick(tableNum, "Tapped Table Number");

            WebElement seat = (WebElement) driver.findElement(By.xpath("1"));
            elementClick(seat, "Tapped seat Number");
            WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
            elementClick(cont, "Tapped continue");
            elementClick(arrowDownForOtherMenuItems, "Arrow Down");

            getCheckNumberTxt();
            WebElement cate = (WebElement) driver.findElement(By.xpath("FOOD"));
            elementClick(cate, "Tapped category");

            /*****  RandOm Select Menu ****/

            List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
            int count1 = menuCollection.size();
            Random rand1 = new Random();
            for (int j = 1; j <= 2; j++) {
                itemToSelect1 = rand1.nextInt(count1);

                if (itemToSelect1 == 0) {
                    itemToSelect1 = 1;
                }
                utils.log().info(String.valueOf(itemToSelect1));
                WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                utils.log().info(menu.getText());
                elementClick(menu, "Tapped Menu");
                try {
                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                    if ((mainModi.isDisplayed())) {
                        String mainModifier = mainModi.getText();
                        elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                        try {
                            WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                            WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            if (remainingModi.isDisplayed()) {
                                String SubModifier1 = subModi1.getText();
                                elementClick(subModi1, SubModifier1 + " - SubModifier");
                                String SubModifier2 = subModi2.getText();
                                elementClick(subModi2, SubModifier2 + " - SubModifier");
                                String SubModifier3 = subModi3.getText();
                                elementClick(subModi3, SubModifier3 + " - SubModifier");
                                elementClick(doneButton, "Tapped Done");

                            } else {

                            }
                        } catch (Exception h) {
                            elementClick(doneButton, "Tapped Done");
                        }
                    } else {

                    }

                } catch (Exception x) {
                    try {
                        WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                        WebElement size2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]"));
                        WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                        String mini = minimum.getText();
                        if (find(size2, 1)) {
                            String data = size1.getText();
                            elementClick(size1, data + " - selected");
                            WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String mainModi = mainModi1.getText();
                            elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                            elementClick(doneButton, "Tapped Done");
                        } else if (find(minimum, 1)) {
                            utils.log().info(mini + " - Additional Modifiers ");
                            //             if (find(minimum, 2)) {
                            WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                            String modiname = addMeats.getText();
                            elementClick(addMeats, "Modifier selected - " + modiname);
                            elementClick(doneButton, "Tapped Done");
                        } else {
                            //          }
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]
                        }
                    } catch (Exception z) {

                    }
                }


            }
            elementClick(finishOrderBtn, "Finish Button");
        }
        elementClick(tableLayoutTab, "Table Layout");

        elementClick(SplitBtn, "Split Button");
        elementClick(splitSeat, "Split Seat button");

        verifyTableSeat(itemToSelect);

    }

    @FindBy(name = "Group Seats")
    WebElement groupSeat;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Seat 1\"])[2]")
    WebElement seat1;

    public String check = " ";

    public String selectMenuForDineIn(String cate) throws Exception {

        //   utils.log().info("First iPad Menu - "+k);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
        elementClick(New, "Tapped New");
        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));

/*****  RandOm Select Table ****/

        Random rand = new Random();

        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
            WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]"));
            String tableNumber = "T" + itemToSelect;

            utils.log().info("Table Number  - " + tableNumber);
            elementClick(tableNum, "Tapped Table Number");

            WebElement seat = (WebElement) driver.findElement(By.xpath("1"));
            elementClick(seat, "Tapped seat Number");
            WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
            elementClick(cont, "Tapped continue");
            elementClick(arrowDownForOtherMenuItems, "Arrow Down");

            getCheckNumberTxt();
            WebElement cate1 = (WebElement) driver.findElement(By.xpath(cate));
            elementClick(cate1, "Tapped category");

            /*****  RandOm Select Menu ****/

            WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
            check = order.getText();
            TestUtils.tableNumberof = check;
            //  utils.log().info(tableNumber+" - Table Number");

            List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
            int count1 = menuCollection.size();
            Random rand1 = new Random();
            for (int j = 1; j <= 2; j++) {
                itemToSelect1 = rand1.nextInt(count1);

                if (itemToSelect1 == 0) {
                    itemToSelect1 = 1;
                }

                utils.log().info(String.valueOf(itemToSelect1));


                WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                utils.log().info(menu.getText());
                elementClick(menu, "Tapped Menu");
                try {
                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                    if ((mainModi.isDisplayed())) {
                        String mainModifier = mainModi.getText();
                        elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                        try {
                            WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                            WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            if (remainingModi.isDisplayed()) {
                                String SubModifier1 = subModi1.getText();
                                elementClick(subModi1, SubModifier1 + " - SubModifier");
                                String SubModifier2 = subModi2.getText();
                                elementClick(subModi2, SubModifier2 + " - SubModifier");
                                String SubModifier3 = subModi3.getText();
                                elementClick(subModi3, SubModifier3 + " - SubModifier");
                                elementClick(doneButton, "Tapped Done");

                            } else {

                            }
                        } catch (Exception h) {
                            elementClick(doneButton, "Tapped Done");
                        }
                    } else {

                    }

                } catch (Exception x) {
                    try {


                        //  utils.log().info(size2.getText());
                        WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                        String data = size1.getText();
                        WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                        if (size2.isDisplayed()) {
                            elementClick(size1, data + " - selected");
                            WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String mainModi = mainModi1.getText();
                            elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                            elementClick(doneButton, "Tapped Done");
                        } else {
                            WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                            String mini = minimum.getText();
                            utils.log().info(mini + " - Additional Modifiers ");
                            //             if (find(minimum, 2)) {
                            WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                            String modiname = addMeats.getText();
                            elementClick(addMeats, "Modifier selected - " + modiname);
                            elementClick(doneButton, "Tapped Done");
                        }

                        //          }
                        ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                        ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                    } catch (Exception v) {

                    }
                }


            }
            // elementClick(finishOrderBtn, "Finish Button");
        }
        return check;
    }

    @FindBy(name = "Check Stats")
    WebElement checkStatsTab;

    public String selectMenuForDineInMerge() throws Exception {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        for (int k = 1; k <= 2; k++) {

            WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
            elementClick(New, "Tapped New");
            List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
            int count = tablee.size();
            utils.log().info("Total Count of the Table - " + count);

/*****  RandOm Select Table ****/

            Random rand = new Random();

            for (int i = 1; i <= 1; i++) {
                itemToSelect = rand.nextInt(count);

                if (itemToSelect == 0) {
                    itemToSelect = 1;
                }
                utils.log().info(String.valueOf(itemToSelect));
                WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]"));
                elementClick(tableNum, "Tapped Table " + itemToSelect);

                WebElement seat = (WebElement) driver.findElement(By.xpath("1"));
                elementClick(seat, "Tapped seat Number");
                WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
                elementClick(cont, "Tapped continue");
                getCheckNumberTxt();
                elementClick(arrowDownForOtherMenuItems, "Arrow Down");

                /**** Random Select Category ****/

                WebElement cate = (WebElement) driver.findElement(By.xpath("APPETIZERS"));
                elementClick(cate, "Tapped category");
//                List<WebElement> categories =  driver.findElements(By.xpath()("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell");
//                int cateSize = categories.size();
//                utils.log().info("Category Available count in this Store - " + cateSize);
//
//                for (int m = 1; m <= 1; m++) {
//                    itemToSelect3 = rand.nextInt(cateSize);
//
//                    if (itemToSelect3 == 0) {
//                        itemToSelect3 = 1;
//                    }
//
//                    WebElement categoryName = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect3 + "]/XCUIElementTypeStaticText[1]");
//                    String categoryNameTxt = categoryName.getText();
//                    elementClick(categoryName, "Category place - " + itemToSelect3 + " Selected Category - " + categoryNameTxt);

                /*****  RandOm Select Menu ****/

                WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
                check = order.getText();
                TestUtils.tableNumberof = check;
                utils.log().info("Table Number from the order screen - " + check);
                ///XCUIElementTypeOther[2]/XCUIElementTypeCollectionView

                try {
                    WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

                    if (find(menuCollection1, 2)) {
                        List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                        int count1 = menuCollection.size();
                        Random rand1 = new Random();
                        for (int j = 1; j <= 2; j++) {
                            itemToSelect1 = rand1.nextInt(count1);

                            if (itemToSelect1 == 0) {
                                itemToSelect1 = 1;
                            }

                            utils.log().info(String.valueOf(itemToSelect1));


                            WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                            utils.log().info(menu.getText());
                            elementClick(menu, "Tapped Menu");
                            try {
                                WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                if ((mainModi.isDisplayed())) {
                                    String mainModifier = mainModi.getText();
                                    elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                                    try {
                                        WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                        WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                        WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                        WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                        if (remainingModi.isDisplayed()) {
                                            String SubModifier1 = subModi1.getText();
                                            elementClick(subModi1, SubModifier1 + " - SubModifier");
                                            String SubModifier2 = subModi2.getText();
                                            elementClick(subModi2, SubModifier2 + " - SubModifier");
                                            String SubModifier3 = subModi3.getText();
                                            elementClick(subModi3, SubModifier3 + " - SubModifier");
                                            elementClick(doneButton, "Tapped Done");

                                        } else {

                                        }
                                    } catch (Exception h) {
                                        elementClick(doneButton, "Tapped Done");
                                    }
                                } else {

                                }

                            } catch (Exception x) {
                                try {


                                    //  utils.log().info(size2.getText());
                                    WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                    String data = size1.getText();
                                    WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                                    if (size2.isDisplayed()) {
                                        elementClick(size1, data + " - selected");
                                        WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                        String mainModi = mainModi1.getText();
                                        elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                        elementClick(doneButton, "Tapped Done");
                                    } else {
                                        WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                        String mini = minimum.getText();
                                        utils.log().info(mini + " - Additional Modifiers ");
                                        //             if (find(minimum, 2)) {
                                        WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                        String modiname = addMeats.getText();
                                        elementClick(addMeats, "Modifier selected - " + modiname);
                                        elementClick(doneButton, "Tapped Done");
                                    }

                                    //          }
                                    ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                                    ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                                    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                                    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                                } catch (Exception v) {

                                }
                            }


                        }
                    }

                    elementClick(finishOrderBtn, "Finish Button");
                } catch (Exception h) {
                    List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                    int count1 = menuCollection2.size();
                    Random rand1 = new Random();
                    for (int j = 1; j <= 2; j++) {
                        itemToSelect1 = rand1.nextInt(count1);

                        if (itemToSelect1 == 0) {
                            itemToSelect1 = 1;
                        }

                        utils.log().info(String.valueOf(itemToSelect1));


                        WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                        utils.log().info(menu.getText());
                        elementClick(menu, "Tapped Menu");
                        try {
                            WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            if ((mainModi.isDisplayed())) {
                                String mainModifier = mainModi.getText();
                                elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                                try {
                                    WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                    WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                    WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                    WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                    if (remainingModi.isDisplayed()) {
                                        String SubModifier1 = subModi1.getText();
                                        elementClick(subModi1, SubModifier1 + " - SubModifier");
                                        String SubModifier2 = subModi2.getText();
                                        elementClick(subModi2, SubModifier2 + " - SubModifier");
                                        String SubModifier3 = subModi3.getText();
                                        elementClick(subModi3, SubModifier3 + " - SubModifier");
                                        elementClick(doneButton, "Tapped Done");

                                    } else {

                                    }
                                } catch (Exception M) {
                                    elementClick(doneButton, "Tapped Done");
                                }
                            } else {

                            }

                        } catch (Exception x) {
                            try {


                                //  utils.log().info(size2.getText());
                                WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String data = size1.getText();
                                WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                                if (size2.isDisplayed()) {
                                    elementClick(size1, data + " - selected");
                                    WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                    String mainModi = mainModi1.getText();
                                    elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                    elementClick(doneButton, "Tapped Done");
                                } else {
                                    WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                    String mini = minimum.getText();
                                    utils.log().info(mini + " - Additional Modifiers ");
                                    //             if (find(minimum, 2)) {
                                    WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                    String modiname = addMeats.getText();
                                    elementClick(addMeats, "Modifier selected - " + modiname);
                                    elementClick(doneButton, "Tapped Done");
                                }

                                //          }
                                ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                                ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            } catch (Exception v) {

                            }
                        }

                    }
                    elementClick(finishOrderBtn, "Tapped finish Button");

                }
            }


            Thread.sleep(50000);
            elementClick(checkStatsTab, "Check Stats");
            Thread.sleep(50000);
            elementClick(tableLayoutTab, "Table Layout");
            Thread.sleep(15000);
            elementClick(checkStatsTab, "Check Stats");
            Thread.sleep(12000);
            elementClick(tableLayoutTab, "Table Layout");
        }
        return check;

    }


    public void selectMenuForBasicValidation(String category) {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
        elementClick(New, "Tapped New");
        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));
/*****  Random Select Table ****/
        Random rand = new Random();
        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);
            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
            WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]"));
            String tableNumber = "T" + itemToSelect;
            utils.log().info("Table Number  - " + tableNumber);
            elementClick(tableNum, "Tapped Table Number");
            WebElement seat = (WebElement) driver.findElement(By.xpath("1"));
            elementClick(seat, "Tapped seat Number");
            WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
            elementClick(cont, "Tapped continue");
            getCheckNumberTxt();
            driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
            WebElement arrowDownn = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"arrow down\"])[2]"));
            elementClick(arrowDownn, "Arrow Done on iPad 1");
            /*** Random Select Category ***/
            WebElement cate1 = (WebElement) driver.findElement(By.xpath(category));
            elementClick(cate1, "Tapped category");
            /****  RandOm Select Menu ***/
            WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
            check = order.getText();
            TestUtils.tableNumberof = check;
            try {
                WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));
                if (find(menuCollection1, 2)) {
                    List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                    int count1 = menuCollection.size();
                    Random rand1 = new Random();
                    for (int j = 1; j <= 2; j++) {
                        int itemToSelect1 = rand1.nextInt(count1);
                        if (itemToSelect1 == 0) {
                            itemToSelect1 = 1;
                        }
                        utils.log().info(String.valueOf(itemToSelect1));
                        WebElement menuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                        TestUtils.menu = menuName.getText();
                        elementClick(menuName, "Tapped Menu - "+menuName.getText());
                        try {
                            WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                            if ((mainModi1.isDisplayed())) {
                                List<WebElement> mainModi10 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                                int count2 = mainModi10.size();
                                Random rand2 = new Random();
                                for (int k = 1; k <= 1; k++) {
                                    int itemToSelect2 = rand2.nextInt(count2);

                                    if (itemToSelect2 == 0) {
                                        itemToSelect2 = 1;
                                    }
                                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect2 + "]/XCUIElementTypeStaticText[1]"));
                                    elementClick(mainModi, mainModi.getText() + " - Tapped Main Modifier");
                                }
                                WebElement donee = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Done\"])[1]"));
                                elementClick(donee, "Done Selected");
                            }else{ }
                        }catch (Exception x) {
                        }
                    }
                }
            } catch (Exception h) {
                List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                int count1 = menuCollection2.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 2; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);
                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }
                    utils.log().info("Random Number - "+itemToSelect1);
                    WebElement menuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    TestUtils.menu = menuName.getText();
                    elementClick(menuName, "Tapped Menu - "+menuName.getText());
                    try {
                        WebElement mainModdii = (WebElement)  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                        if ((mainModdii.isDisplayed())) {
                            List<WebElement> mainModi =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                            int count2 = mainModi.size();
                            Random rand2 = new Random();
                            for (int jk = 1; jk <= 1; jk++) {
                                int itemToSelect2 = rand2.nextInt(count2);
                                if (itemToSelect2 == 0) {
                                    itemToSelect2 = 1;
                                }
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell["+itemToSelect2+"]/XCUIElementTypeStaticText[1]"));
                                elementClick(mainModi1, mainModi1.getText() + " - Tapped Main Modifier");
                            }
                            WebElement donee = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Done\"])[1]"));
                            elementClick(donee, "Tapped Done");
                        } else {
                        }
                    } catch (Exception M) {
                    }
                }
            }
        }

        WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Subtotal\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subTotalAmount = subtotalValues.getText();
        TestUtils.subtotalTxt = subTotalAmount;
        utils.log().info("Subtotal Value as Same with Price Level 2 - "+subTotalAmount);
        WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Tax\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taxAmount = taxValues.getText();
        TestUtils.taxTxt = taxAmount;
        utils.log().info("Tax Value is SAME - "+taxAmount);
        WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String totalAmount = totalValues.getText();
        TestUtils.totalTxt = totalAmount;
        utils.log().info("Tptal Value is SAME - "+totalAmount);
        WebElement cashValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
//        WebElement cashValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]");
        String totalAmount1 = cashValues.getText();
        TestUtils.cashDiscountTxt = totalAmount1;
        utils.log().info("Cash Discount Value is SAME - "+totalAmount1);
    }

    public String[] a = {};

    public void selectMenuBasicValidationForQsr(String category) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        elementClick(arrowDownForOtherMenuItems, "Arrow Down");
        WebElement cate = (WebElement) driver.findElement(By.xpath(category));
        elementClick(cate, "Tapped category");
        /*****  RandOm Select Menu ****/
        WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
        check = order.getText();
        TestUtils.tableNumberof = check;
        try {
            WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));
            if (find(menuCollection1, 2)) {
                List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                int count1 = menuCollection.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 2; j++) {
                    itemToSelect1 = rand1.nextInt(count1);
                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }
                    utils.log().info(String.valueOf(itemToSelect1));
                    WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    utils.log().info(menu.getText());
                    elementClick(menu, "Tapped Menu");
                    try {
                        WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                        if ((mainModi.isDisplayed())) {
                            String mainModifier = mainModi.getText();
                            elementClick(mainModi, mainModifier + " - Tapped Main Modifier");
                                elementClick(doneButton, "Tapped Done");
                        } else {}
                    } catch (Exception x) {}
                }
            }
        } catch (Exception h) {
            List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
            int count1 = menuCollection2.size();
            Random rand1 = new Random();
            for (int j = 1; j <= 1; j++) {
                itemToSelect1 = rand1.nextInt(count1);
                if (itemToSelect1 == 0) {
                    itemToSelect1 = 1;
                }
                utils.log().info(String.valueOf(itemToSelect1));
                WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                utils.log().info(menu.getText());
                elementClick(menu, "Tapped Menu");
                try {
                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                    if ((mainModi.isDisplayed())) {
                        String mainModifier = mainModi.getText();
                        elementClick(mainModi, mainModifier + " - Tapped Main Modifier");
                            elementClick(doneButton, "Tapped Done");
                    } else {
                    }
                } catch (Exception x) { }
            }
        }
    }


    public String check1 = " ";

    public String selectMenuForDineIn1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        // for(int w=1;w<=2;w++) {
        WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
        elementClick(New, "Tapped New");
        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info("Total Count of the Table - " + count);
/*****  RandOm Select Table ****/
        Random rand = new Random();
        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);
            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info("Selected the number of Table - " + itemToSelect);
            WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]"));
            String tableNumber = "T" + itemToSelect;
            utils.log().info("Table Number  - " + tableNumber);
            elementClick(tableNum, "Tapped Table Number");
            WebElement seat = (WebElement) driver.findElement(By.xpath("1"));
            elementClick(seat, "Tapped seat Number");
            WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
            elementClick(cont, "Tapped continue");
            getCheckNumberTxt();
            elementClick(arrowDownForOtherMenuItems, "Arrow Down");
            /**** Random Select Category ****/
            WebElement cate = (WebElement) driver.findElement(By.xpath("APPETIZERS"));
            elementClick(cate, "Tapped category");
//                List<WebElement> categories =  driver.findElements(By.xpath()("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell");
//                int cateSize = categories.size();
//                utils.log().info("Category Available count in this Store - " + cateSize);
//
//                for (int m = 1; m <= 1; m++) {
//                    itemToSelect3 = rand.nextInt(cateSize);
//
//                    if (itemToSelect3 == 0) {
//                        itemToSelect3 = 1;
//                    }
//
//                    WebElement categoryName = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect3 + "]/XCUIElementTypeStaticText[1]");
//                    String categoryNameTxt = categoryName.getText();
//                    elementClick(categoryName, "Category place - " + itemToSelect3 + " Selected Category - " + categoryNameTxt);

            /*****  RandOm Select Menu ****/
//                WebElement tableNO1 = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]");
//                String tableNO1Txt = tableNO1.getText();
//                utils.log().info("Table Number - "+tableNO1Txt);

            WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
            check1 = order.getText();
            TestUtils.tableNumberof1 = check1;
            utils.log().info("Table Number from the order Screen - " + check1);
            //  utils.log().info(tableNumber+" - Table Number");
            ///XCUIElementTypeOther[2]/XCUIElementTypeCollectionView

            try {
                WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

                if (find(menuCollection1, 2)) {
                    List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                    int count1 = menuCollection.size();
                    Random rand1 = new Random();
                    for (int j = 1; j <= 2; j++) {
                        itemToSelect1 = rand1.nextInt(count1);

                        if (itemToSelect1 == 0) {
                            itemToSelect1 = 1;
                        }

                        utils.log().info(String.valueOf(itemToSelect1));


                        WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                        utils.log().info(menu.getText());
                        elementClick(menu, "Tapped Menu");
                        try {
                            WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            if ((mainModi.isDisplayed())) {
                                String mainModifier = mainModi.getText();
                                elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                                try {
                                    WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                    WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                    WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                    WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                    if (remainingModi.isDisplayed()) {
                                        String SubModifier1 = subModi1.getText();
                                        elementClick(subModi1, SubModifier1 + " - SubModifier");
                                        String SubModifier2 = subModi2.getText();
                                        elementClick(subModi2, SubModifier2 + " - SubModifier");
                                        String SubModifier3 = subModi3.getText();
                                        elementClick(subModi3, SubModifier3 + " - SubModifier");
                                        elementClick(doneButton, "Tapped Done");

                                    } else {

                                    }
                                } catch (Exception h) {
                                    elementClick(doneButton, "Tapped Done");
                                }
                            } else {

                            }

                        } catch (Exception x) {
                            try {


                                //  utils.log().info(size2.getText());
                                WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String data = size1.getText();
                                WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                                if (size2.isDisplayed()) {
                                    elementClick(size1, data + " - selected");
                                    WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                    String mainModi = mainModi1.getText();
                                    elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                    elementClick(doneButton, "Tapped Done");
                                } else {
                                    WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                    String mini = minimum.getText();
                                    utils.log().info(mini + " - Additional Modifiers ");
                                    //             if (find(minimum, 2)) {
                                    WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                    String modiname = addMeats.getText();
                                    elementClick(addMeats, "Modifier selected - " + modiname);
                                    elementClick(doneButton, "Tapped Done");
                                }

                                //          }
                                ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                                ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            } catch (Exception v) {

                            }
                        }


                    }
                }
                elementClick(finishOrderBtn, "Tapped finish Button");
            } catch (Exception h) {


                List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                int count1 = menuCollection2.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 2; j++) {
                    itemToSelect4 = rand1.nextInt(count1);

                    if (itemToSelect4 == 0) {
                        itemToSelect4 = 1;
                    }

                    utils.log().info(String.valueOf(itemToSelect4));


                    WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect4 + "]/XCUIElementTypeStaticText[1]"));
                    utils.log().info(menu.getText());
                    elementClick(menu, "Tapped Menu");
                    try {
                        WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                        if ((mainModi.isDisplayed())) {
                            String mainModifier = mainModi.getText();
                            elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                            try {
                                WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                if (remainingModi.isDisplayed()) {
                                    String SubModifier1 = subModi1.getText();
                                    elementClick(subModi1, SubModifier1 + " - SubModifier");
                                    String SubModifier2 = subModi2.getText();
                                    elementClick(subModi2, SubModifier2 + " - SubModifier");
                                    String SubModifier3 = subModi3.getText();
                                    elementClick(subModi3, SubModifier3 + " - SubModifier");
                                    elementClick(doneButton, "Tapped Done");

                                } else {

                                }
                            } catch (Exception M) {
                                elementClick(doneButton, "Tapped Done");
                            }
                        } else {
                        }

                    } catch (Exception x) {
                        try {

                            //  utils.log().info(size2.getText());
                            WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String data = size1.getText();
                            WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                            if (size2.isDisplayed()) {
                                elementClick(size1, data + " - selected");
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String mainModi = mainModi1.getText();
                                elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                            } else {
                                WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                String mini = minimum.getText();
                                utils.log().info(mini + " - Additional Modifiers ");
                                //             if (find(minimum, 2)) {
                                WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                String modiname = addMeats.getText();
                                elementClick(addMeats, "Modifier selected - " + modiname);
                            }
                            elementClick(doneButton, "Tapped Done");

                            //          }
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                        } catch (Exception v) {

                        }
                    }

                }
                elementClick(finishOrderBtn, "Tapped finish Button");

            }
        }

        //}
        return check1;
    }


    public void selectMenuForQSR() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try {
            WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

            if (find(menuCollection1, 2)) {
                List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                int count1 = menuCollection.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 2; j++) {
                    itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }

                    utils.log().info(String.valueOf(itemToSelect1));


                    WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    utils.log().info(menu.getText());
                    elementClick(menu, "Tapped Menu");
                    try {
                        WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                        if ((mainModi.isDisplayed())) {
                            String mainModifier = mainModi.getText();
                            elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                            try {
                                WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                if (remainingModi.isDisplayed()) {
                                    String SubModifier1 = subModi1.getText();
                                    elementClick(subModi1, SubModifier1 + " - SubModifier");
                                    String SubModifier2 = subModi2.getText();
                                    elementClick(subModi2, SubModifier2 + " - SubModifier");
                                    String SubModifier3 = subModi3.getText();
                                    elementClick(subModi3, SubModifier3 + " - SubModifier");
                                    elementClick(doneButton, "Tapped Done");

                                } else {

                                }
                            } catch (Exception h) {
                                elementClick(doneButton, "Tapped Done");
                            }
                        } else {

                        }

                    } catch (Exception x) {
                        try {


                            //  utils.log().info(size2.getText());
                            WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String data = size1.getText();
                            WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                            if (size2.isDisplayed()) {
                                elementClick(size1, data + " - selected");
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String mainModi = mainModi1.getText();
                                elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                elementClick(doneButton, "Tapped Done");
                            } else {
                                WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                String mini = minimum.getText();
                                utils.log().info(mini + " - Additional Modifiers ");
                                //             if (find(minimum, 2)) {
                                WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                String modiname = addMeats.getText();
                                elementClick(addMeats, "Modifier selected - " + modiname);
                                elementClick(doneButton, "Tapped Done");
                            }

                            //          }
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                        } catch (Exception v) {

                        }
                    }


                }
            }
            //   elementClick(finishOrderBtn, "Tapped finish Button");
        } catch (Exception h) {


            List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
            int count1 = menuCollection2.size();
            Random rand1 = new Random();
            for (int j = 1; j <= 2; j++) {
                itemToSelect4 = rand1.nextInt(count1);

                if (itemToSelect4 == 0) {
                    itemToSelect4 = 1;
                }

                utils.log().info(String.valueOf(itemToSelect4));


                WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect4 + "]/XCUIElementTypeStaticText[1]"));
                utils.log().info(menu.getText());
                elementClick(menu, "Tapped Menu");
                try {
                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                    if ((mainModi.isDisplayed())) {
                        String mainModifier = mainModi.getText();
                        elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                        try {
                            WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                            WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            if (remainingModi.isDisplayed()) {
                                String SubModifier1 = subModi1.getText();
                                elementClick(subModi1, SubModifier1 + " - SubModifier");
                                String SubModifier2 = subModi2.getText();
                                elementClick(subModi2, SubModifier2 + " - SubModifier");
                                String SubModifier3 = subModi3.getText();
                                elementClick(subModi3, SubModifier3 + " - SubModifier");
                                elementClick(doneButton, "Tapped Done");

                            } else {

                            }
                        } catch (Exception M) {
                            elementClick(doneButton, "Tapped Done");
                        }
                    } else {
                    }

                } catch (Exception x) {
                    try {

                        //  utils.log().info(size2.getText());
                        WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                        String data = size1.getText();
                        WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                        if (size2.isDisplayed()) {
                            elementClick(size1, data + " - selected");
                            WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String mainModi = mainModi1.getText();
                            elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                        } else {
                            WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                            String mini = minimum.getText();
                            utils.log().info(mini + " - Additional Modifiers ");
                            //             if (find(minimum, 2)) {
                            WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                            String modiname = addMeats.getText();
                            elementClick(addMeats, "Modifier selected - " + modiname);
                        }
                        elementClick(doneButton, "Tapped Done");

                        //          }
                        ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                        ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                    } catch (Exception v) {

                    }
                }

            }
            //  elementClick(finishOrderBtn, "Tapped finish Button");

        }
    }


    public void selectMenuForGroupSeat() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        selectMenu();
        doSplitAction();
        elementClick(seat1, "Seat 1 selected");
        elementClick(seat2, "Seat 2 selected");
        elementClick(groupSeat, "Group seat Button Selected");
        List<WebElement> tale =  driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell"));
        int count = tale.size();

        utils.log().info("Counts of menu Item - " + count);
        for (int i = 1; i <= count; i++) {
            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]
            WebElement menuss = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
            String nameOfMenu = menuss.getText();
            WebElement prices = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[2]"));
            String price11 = prices.getText();
            utils.log().info("Menus are - " + nameOfMenu + " - " + price11);
        }
        elementClick(SaveClose, "save And Close");
        elementClick(paymentBtn, "Payment");
        elementClick(cashPayment1, "Cash Button");
        elementClick(submit, "Submit ");
    }

    @FindBy(name = "Open check")
    WebElement OpenCheckStats;

    public void openTheCheckByTableNum() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[8]"));
        String number = tableNum.getText();

        elementClick(OpenCheckStats, "opened Check");
        selectMenuForQSR();

        elementClick(finishOrderBtn, "Finish button");
        elementClick(tableLayoutTab, "Table Layout Tab");
        elementClick(SplitBtn, "Split Button");
        elementClick(splitSeat, "Split Seat button");

        verifyTableSeat1(number);
        doSplitAction();
        splitEvenlyAction();
    }

    public void makeSaleForNewUser() throws Exception {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        for (int w = 6; w <= 19; w++) {
            utils.log().info("Sale Count - " + w);
            if (tableLayoutTab.isDisplayed()) {
                utils.log().info("Table Layout visible");
            }
            elementClick(newCheck, "Tapped new check");
            WebElement table3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"T" + w + "\"]"));
            elementClick(table3, "");
            elementClick(singleSeat, "Tapped Single ");
            elementClick(continueBtn, "Tapped Continue");

            getCheckNumberTxt();
            pressArrowDown2();
            WebElement table31 = (WebElement) driver.findElement(By.xpath("Soft Drinks"));
            elementClick(table31, "");
            elementClick(cakeProd, "");
            elementClick(salgam, "");
            elementClick(Ayran, "");
            elementClick(Ayran3, "");
            elementClick(turkishteapot, "");
            elementClick(cofeee, "");
            elementClick(turkishteapot, "");

            pressPayment();
            scrollToElementPayments(mppgAuth, "up");
            elementClick(mppgAuth, "");
            elementClick(tipAs10, "");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");


            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
        }
        for (int w = 20; w <= 37; w++) {
            utils.log().info("Sale Count - " + w);
            if (tableLayoutTab.isDisplayed()) {
                utils.log().info("Table Layout visible");
            }
            elementClick(newCheck, "Tapped new check");
            WebElement table3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"T" + w + "\"]"));
            elementClick(table3, "");
            elementClick(singleSeat, "Tapped Single ");
            elementClick(continueBtn, "Tapped Continue");

            getCheckNumberTxt();
            pressArrowDown2();
            WebElement table31 = (WebElement) driver.findElement(By.xpath("Soft Drinks"));
            elementClick(table31, "");
            elementClick(cakeProd, "");
            elementClick(salgam, "");
            elementClick(Ayran3, "");
            elementClick(Ayran, "");
            elementClick(cofeee, "");
            elementClick(Ayran3, "");
            elementClick(cofeee, "");
            elementClick(turkishteapot, "");

            pressPayment();
            scrollToElementPayments(mppgAuth, "up");
            elementClick(mppgAuth, "");
            elementClick(tipAs10, "");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");


            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }

        }
        for (int w = 38; w <= 50; w++) {
            utils.log().info("Sale Count - " + w);
            if (tableLayoutTab.isDisplayed()) {
                utils.log().info("Table Layout visible");
            }
            elementClick(newCheck, "Tapped new check");
            WebElement table3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"T" + w + "\"]"));
            elementClick(table3, "");
            elementClick(singleSeat, "Tapped Single ");
            elementClick(continueBtn, "Tapped Continue");

            getCheckNumberTxt();
            pressArrowDown2();
            WebElement table31 = (WebElement) driver.findElement(By.xpath("Soft Drinks"));
            elementClick(table31, "");
            elementClick(cakeProd, "");
            elementClick(salgam, "");
            elementClick(Ayran, "");
            elementClick(Ayran3, "");
            elementClick(cakeProd, "");
            elementClick(cofeee, "");
            elementClick(salgam, "");
            elementClick(turkishteapot, "");

            pressPayment();
            scrollToElementPayments(mppgAuth, "up");
            elementClick(mppgAuth, "");
            elementClick(tipAs10, "");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");


            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
        }
    }

    public void needToWait() throws InterruptedException {
        Thread.sleep(50000);

    }

    public void dogroupSeat() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        elementClick(seat1, "Seat 1 selected");
        elementClick(seat2, "Seat 2 selected");
        elementClick(groupSeat, "Group seat Button Selected");

        List<WebElement> coll =  driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        int cell = coll.size();
        utils.log().info("split seat - " + cell);
        for (int a = 1; a <= cell; a++) {
            List<WebElement> seat1Table =  driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + a + "]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell"));
            int cells = seat1Table.size();
            utils.log().info("seat " + a + " menu items - " + cells);
            for (int i = 1; i <= cells; i++) {
                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]
                WebElement menuss = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
                String nameOfMenu = menuss.getText();
                WebElement prices = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[2]"));
                String price11 = prices.getText();
                utils.log().info(" Group Menus are - " + nameOfMenu + " - " + price11);
            }
        }
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Merge\"]")
    private WebElement mergeBtn;

    @FindBy(name = "Done")
    WebElement doneBtnn;

    public void doMerge() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        elementClick(mergeBtn, "Merge Button Selected");

        verifyTableMerge(TestUtils.tableNumberof);

        verifyTableMerge(TestUtils.tableNumberof1);


        elementClick(doneBtnn, "Merge Done");

        WebElement LingaPopup = (WebElement) driver.findElement(By.xpath("Linga"));
        String Txt = LingaPopup.getText();
        utils.log().info("Merge popup is Displayed");
        elementClick(doneBtnn, "Popup Done");

        afterMergeOpenSeat(TestUtils.tableNumberof);

    }

    @FindBy(name = "openCheck")
    private WebElement openCheckBtn;

    @FindBy(name = "Cash")
    private WebElement Cash;

    @FindBy(name = "Exact")
    private WebElement Exact;

    @FindBy(name = "Enter")
    private WebElement Enter1;

    @FindBy(name = "Delivery")
    private WebElement deliveryBtn;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Button\"])[2]")
    private WebElement laterBtn;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[1]")
    private WebElement doneButton1;
    @FindBy(name = "Customer Profile")
    private WebElement customerProfileWindow;
    @FindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search\"]")
    private WebElement searchField;


    public void mergeAction1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        Thread.sleep(50000);
        elementClick(allBtn, "Tapped All button");
        Thread.sleep(18000);
        for (int i = 1; i <= 2; i++) {
            utils.log().info("Merge Count - " + i);
            elementClick(checkStatsTab, "Tapped Check Stats Tab");
            //   new PhoneOrderScreen().selectActiveCheckForMulti();
            elementClick(openCheckBtn, "Open Check button is tapped");
            orderScreen();
            selectMenuForQSR();
            elementClick(finishOrderBtn, "finish button tapped");
            elementClick(tableLayoutTab, "Tapped Table Layout Tab");
            selectMenuForDineIn1();
            doMerge();
            orderScreen();
            elementClick(Cash, "Tapped Cash button for Close Sale");
            elementClick(Exact, "Tapped Exact button ");
            elementClick(Enter1, "Tapped Enter button ");

        }
    }

    @FindBy(name = "QSR")
    private WebElement qsrTab;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
    private WebElement saveBtn;
    @FindBy(name = "  Exit")
    WebElement exitBtn;

    @FindBy(name = "Future")
    WebElement futureTab;

    @FindBy(name = "Done")
    private WebElement doneBtn;

    public void makeSaleForBatchInPhoneStore(String category) throws Exception {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        for (int k = 1; k <= 100; k++) {
            elementClick(deliveryBtn, "Delivery selected");
            elementClick(laterBtn, "Delivery later selected");

            elementClick(doneButton1, "Delivery selected");
            elementClick(doneBtn, "done button selected");
            sendKeys(searchField, "aaron czx");
            WebElement cust = (WebElement) driver.findElement(By.xpath("aaron czx 567998654688 "));
            elementClick(cust, "Selected customer");
            elementClick(saveBtn, "Save selected");
            getCheckNumberTxt();
            selectMenuBasicValidationForQsr(category);

            pressPayment();
            scrollToElementPayments(mppgAuth2, "up");
            elementClick(mppgAuth2, "Mppg Auth Selected");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");

            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
            elementClick(exitBtn, "Exit selected");
            elementClick(finishOrderBtn, "Finish selected");
            elementClick(futureTab, "Future Button selected");
            elementClick(qsrTab, "Qsr Selected");
        }

        elementClick(allBtn, "Selected All");
        for (int i = 21; i <= 50; i++) {
            utils.log().info("count - " + i);

            elementClick(tableLayoutTab, "Table Layout Selected");
            //getCheckNumberTxt();
            selectMenuForBasicValidation(category);
            pressPayment();
            scrollToElementPayments(mppgAuth2, "up");
            elementClick(mppgAuth2, "Mppg Auth Selected");
            elementClick(continueBtn, "");
            elementClick(manualButton, "Tapped Manual Button");

            cardNumberTxtField.sendKeys("4111111111111111");

            cardNameField.sendKeys("JCB");
            cardNameField.sendKeys(Keys.ENTER);

            expireNumTxtField.sendKeys("1222");

            cvvTxtField.sendKeys(Keys.ENTER);

            zipCodeTxtField.sendKeys(Keys.ENTER);

            elementClick(processBtn, "Tapped process Button");

            try {
                elementClick(okBtn, "Tapped Ok Button on the Popup");
            } catch (Exception e) {
            }
        }
    }

    @FindBy(name = "Batch In Progress")
    WebElement batchInProgress;
    @FindBy(name = "Batch Completed")
    WebElement batchComplete;
    @FindBy(name = "ToggleIcon")
    WebElement ToggleIcon;
    @FindBy(name = "Batch/Tip Adjustment")
    WebElement batchTipAdjustBtn;

    public void verifyBatchCheckAvailable() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        List<WebElement> check =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell"));
        int checkCount = check.size();
        utils.log().info("Batch Check count - " + checkCount);
//        String batchText = batchInProgress.getText();
        String batchCompleteText = batchComplete.getText();
        while (true) {
            elementClick(ToggleIcon, "Toggle Icon Selected");
            Thread.sleep(1000);
            elementClick(batchTipAdjustBtn, "Batch/Tip Selected");
            Thread.sleep(1000);
            if (find(batchInProgress, 2)) {
                utils.log().info("Batch IN Process - "  + " - Check Count - " + checkCount);
            } else {
                utils.log().info("Batch Process Has been Completed - " + batchCompleteText + " - Check count - " + checkCount);
                break;
            }
        }


    }

    public void doBatchForVourl(String catego) {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        selectMenuForBasicValidation(catego);
    }


    public String selectMenuForDineOrderType(String cate1) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
        elementClick(New, "Tapped New");
        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));

/****  RandOm Select Table ***/

        Random rand = new Random();

        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
            WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]"));
            String tableNumber = "T" + itemToSelect;

            utils.log().info("Table Number  - " + tableNumber);
            elementClick(tableNum, "Tapped Table Number");

            WebElement seat = (WebElement) driver.findElement(By.xpath("1"));
            elementClick(seat, "Tapped seat Number");
            WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
            elementClick(cont, "Tapped continue");
            getCheckNumberTxt();
            elementClick(arrowDownForOtherMenuItems, "Arrow Down");

            /*** Random Select Category ***/

            WebElement cate = (WebElement) driver.findElement(By.xpath(cate1));
            elementClick(cate, "Tapped category");
//            List<WebElement> categories =  driver.findElements(By.xpath()("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell");
//            int cateSize = categories.size();
//            utils.log().info("Category Available count in this Store - " + cateSize);
//
//            for (int m = 1; m <= 1; m++) {
//                itemToSelect3 = rand.nextInt(cateSize);
//
//                if (itemToSelect3 == 0) {
//                    itemToSelect3 = 1;
//                }
//
//                WebElement categoryName = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect3 + "]/XCUIElementTypeStaticText[1]");
//                String categoryNameTxt = categoryName.getText();
//                elementClick(categoryName, "Category place - " + itemToSelect3 + " Selected Category - " + categoryNameTxt);

            /****  RandOm Select Menu ***/

            WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
            check = order.getText();
            TestUtils.tableNumberof1 = check;
            //  utils.log().info(tableNumber+" - Table Number");
            ///XCUIElementTypeOther[2]/XCUIElementTypeCollectionView

            try {
                WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

                if (find(menuCollection1, 2)) {
                    List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                    int count1 = menuCollection.size();
                    Random rand1 = new Random();
                    for (int j = 1; j <= 2; j++) {
                        int itemToSelect1 = rand1.nextInt(count1);

                        if (itemToSelect1 == 0) {
                            itemToSelect1 = 1;
                        }

                        utils.log().info(String.valueOf(itemToSelect1));


                        WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                        utils.log().info(menu.getText());
                        elementClick(menu, "Tapped Menu");
                        try {
                            WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            if ((mainModi.isDisplayed())) {
                                String mainModifier = mainModi.getText();
                                elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                                try {
                                    WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                    WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                    WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                    WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                    if (remainingModi.isDisplayed()) {
                                        String SubModifier1 = subModi1.getText();
                                        elementClick(subModi1, SubModifier1 + " - SubModifier");
                                        String SubModifier2 = subModi2.getText();
                                        elementClick(subModi2, SubModifier2 + " - SubModifier");
                                        String SubModifier3 = subModi3.getText();
                                        elementClick(subModi3, SubModifier3 + " - SubModifier");
                                        elementClick(doneButton, "Tapped Done");

                                    } else {

                                    }
                                } catch (Exception h) {
                                    elementClick(doneButton, "Tapped Done");
                                }
                            } else {

                            }

                        } catch (Exception x) {
                            try {


                                //  utils.log().info(size2.getText());
                                WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String data = size1.getText();
                                WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                                if (size2.isDisplayed()) {
                                    elementClick(size1, data + " - selected");
                                    WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                    String mainModi = mainModi1.getText();
                                    elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                    elementClick(doneButton, "Tapped Done");
                                } else {
                                    WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                    String mini = minimum.getText();
                                    utils.log().info(mini + " - Additional Modifiers ");
                                    //             if (find(minimum, 2)) {
                                    WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                    String modiname = addMeats.getText();
                                    elementClick(addMeats, "Modifier selected - " + modiname);
                                    elementClick(doneButton, "Tapped Done");
                                }

                                //          }
                                ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                                ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            } catch (Exception v) {

                            }
                        }


                    }
                }
                // elementClick(finishOrderBtn, "Finish Button");
            } catch (Exception h) {


                List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                int count1 = menuCollection2.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 2; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }

                    utils.log().info(String.valueOf(itemToSelect1));


                    WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    utils.log().info(menu.getText());
                    elementClick(menu, "Tapped Menu");
                    try {
                        WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                        if ((mainModi.isDisplayed())) {
                            String mainModifier = mainModi.getText();
                            elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                            try {
                                WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                if (remainingModi.isDisplayed()) {
                                    String SubModifier1 = subModi1.getText();
                                    elementClick(subModi1, SubModifier1 + " - SubModifier");
                                    String SubModifier2 = subModi2.getText();
                                    elementClick(subModi2, SubModifier2 + " - SubModifier");
                                    String SubModifier3 = subModi3.getText();
                                    elementClick(subModi3, SubModifier3 + " - SubModifier");
                                    elementClick(doneButton, "Tapped Done");

                                } else {

                                }
                            } catch (Exception M) {
                                elementClick(doneButton, "Tapped Done");
                            }
                        } else {

                        }

                    } catch (Exception x) {
                        try {


                            //  utils.log().info(size2.getText());
                            WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String data = size1.getText();
                            WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                            if (size2.isDisplayed()) {
                                elementClick(size1, data + " - selected");
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String mainModi = mainModi1.getText();
                                elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                elementClick(doneButton, "Tapped Done");
                            } else {
                                WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                String mini = minimum.getText();
                                utils.log().info(mini + " - Additional Modifiers ");
                                //             if (find(minimum, 2)) {
                                WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                String modiname = addMeats.getText();
                                elementClick(addMeats, "Modifier selected - " + modiname);
                                elementClick(doneButton, "Tapped Done");
                            }

                            //          }
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                        } catch (Exception v) {

                        }
                    }

                }
                //    elementClick(finishOrderBtn,"Tapped finish Button");

            }
        }
        return check;
    }


    public void getMenuValues() {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        List<WebElement> listOfValues =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
        int countOfListValues = listOfValues.size();
        utils.log().info("Size of Field " + countOfListValues);
        if (countOfListValues == 5) {
            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            TestUtils.subtotalTxt = subtotalValues1;
            String subTotal1 = subtotalValues1.replaceAll("[A-Z$,. ]", "");
            int subTotal2 = Integer.parseInt(subTotal1);
            utils.log().info(" Subtotal Values - " + subtotalValues1);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues1 = taxValues.getText();

            TestUtils.taxTxt = taxValues1;
            int taxxxx = (subTotal2 * 8) / 100;

            TestUtils.MergeTax = String.valueOf(taxxxx);
            String tax1 = taxValues1.replaceAll("[A-Z$,. ]", "");
            int tax2 = Integer.parseInt(tax1);
            utils.log().info(" Tax Values - " + taxValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String totalValues1 = totalValues.getText();
            TestUtils.totalTxt = totalValues1;
            utils.log().info(" Total Values - " + totalValues1);

            /////  Cash Price VALUES  ///////
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
            String cashOptionValues1 = cashOptionValues.getText();
            TestUtils.cashOptionOrderScreen = cashOptionValues1;
            utils.log().info(" Cash Price Values - " + cashOptionValues1);

            int CashDiscountValue = ((subTotal2 + tax2) * 5) / 100;
            utils.log().info("Cash Discount Value - " + CashDiscountValue);
            String cashDiscountt = String.valueOf(CashDiscountValue);
            utils.log().info("Cash Discount Values - " + cashDiscountt);
            TestUtils.cashDiscountTxt = cashDiscountt;


        } else {
            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            TestUtils.subtotalTxt = subtotalValues1;
            String subTotal1 = subtotalValues1.replaceAll("[A-Z$,. ]", "");
            int subTotal2 = Integer.parseInt(subTotal1);
            utils.log().info(" Subtotal Values - " + subtotalValues1);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues1 = taxValues.getText();
            TestUtils.taxTxt = taxValues1;
            int taxxxx = (subTotal2 * 8) / 100;
            TestUtils.MergeTax = String.valueOf(taxxxx);
            String tax1 = taxValues1.replaceAll("[A-Z$,. ]", "");
            int tax2 = Integer.parseInt(tax1);
            utils.log().info(" Tax Values - " + taxValues1);

            /////  Discount VALUES  ///////
            WebElement discountValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String discountValues1 = discountValues.getText();
            TestUtils.discountTxt = discountValues1;
            utils.log().info(" Discount Values - " + discountValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
            String totalValues1 = totalValues.getText();
            TestUtils.totalTxt = totalValues1;
            utils.log().info(" Total Values - " + totalValues1);

            /////  Cash Price VALUES  ///////
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
            String cashOptionValues1 = cashOptionValues.getText();
            TestUtils.cashOptionOrderScreen = cashOptionValues1;
            utils.log().info(" Cash Price Values - " + cashOptionValues1);

            int CashDiscountValue = ((subTotal2 + tax2) * 5) / 100;
            utils.log().info("Cash Discount Value - " + CashDiscountValue);
            String cashDiscountt = String.valueOf(CashDiscountValue);
            utils.log().info("Cash Discount Values - " + cashDiscountt);
            TestUtils.cashDiscountTxt = cashDiscountt;


        }
    }

    public void getMenuValues1() {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        List<WebElement> listOfValues =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
        int countOfListValues = listOfValues.size();
        utils.log().info("Size of Field " + countOfListValues);
        if (countOfListValues == 5) {
            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            TestUtils.subtotalTxt1 = subtotalValues1;
            String subTotal1 = subtotalValues1.replaceAll("[A-Z$,. ]", "");
            int subTotal2 = Integer.parseInt(subTotal1);
            utils.log().info(" Subtotal Values - " + subtotalValues1);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues1 = taxValues.getText();
            TestUtils.taxTxt1 = taxValues1;
            int taxxxx = (subTotal2 * 8) / 100;

            TestUtils.MergeTax1 = String.valueOf(taxxxx);
            String tax1 = taxValues1.replaceAll("[A-Z$,. ]", "");
            int tax2 = Integer.parseInt(tax1);
            utils.log().info(" Tax Values - " + taxValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String totalValues1 = totalValues.getText();
            TestUtils.totalTxt1 = totalValues1;
            utils.log().info(" Total Values - " + totalValues1);

            /////  Cash Price VALUES  ///////
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
            String cashOptionValues1 = cashOptionValues.getText();
            TestUtils.cashOptionOrderScreen1 = cashOptionValues1;
            utils.log().info(" Cash Price Values - " + cashOptionValues1);

            int CashDiscountValue = ((subTotal2 + tax2) * 5) / 100;
            utils.log().info("Cash Discount Value - " + CashDiscountValue);
            String cashDiscountt = String.valueOf(CashDiscountValue);
            utils.log().info("Cash Discount Values - " + cashDiscountt);
            TestUtils.cashDiscountTxt1 = cashDiscountt;


        } else {
            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            TestUtils.subtotalTxt1 = subtotalValues1;
            String subTotal1 = subtotalValues1.replaceAll("[A-Z$,. ]", "");
            int subTotal2 = Integer.parseInt(subTotal1);
            utils.log().info(" Subtotal Values - " + subtotalValues1);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues1 = taxValues.getText();
            TestUtils.taxTxt1 = taxValues1;
            int taxxxx = (subTotal2 * 8) / 100;
            TestUtils.MergeTax1 = String.valueOf(taxxxx);
            String tax1 = taxValues1.replaceAll("[A-Z$,. ]", "");
            int tax2 = Integer.parseInt(tax1);
            utils.log().info(" Tax Values - " + taxValues1);

            /////  Discount VALUES  ///////
            WebElement discountValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String discountValues1 = discountValues.getText();
            TestUtils.discountTxt1 = discountValues1;
            utils.log().info(" Discount Values - " + discountValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
            String totalValues1 = totalValues.getText();
            TestUtils.totalTxt1 = totalValues1;
            utils.log().info(" Total Values - " + totalValues1);

            /////  Cash Price VALUES  ///////
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
            String cashOptionValues1 = cashOptionValues.getText();
            TestUtils.cashOptionOrderScreen1 = cashOptionValues1;
            utils.log().info(" Cash Price Values - " + cashOptionValues1);

            int CashDiscountValue = ((subTotal2 + tax2) * 5) / 100;
            String cashDiscountt = String.valueOf(CashDiscountValue);
            utils.log().info("Cash Discount Values - " + cashDiscountt);
            TestUtils.cashDiscountTxt1 = cashDiscountt;

        }
    }

    public void getOrderScreenMenuValues1() {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        List<WebElement> listOfValues =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
        int countOfListValues = listOfValues.size();
        utils.log().info("Size of Field " + countOfListValues);

        /////  SubTotal VALUES  ///////
        WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subtotalValues1 = subtotalValues.getText();
        TestUtils.subtotalTxt1 = subtotalValues1;
        String subTotal1 = subtotalValues1.replaceAll("[A-Z$,. ]", "");
        int subTotal2 = Integer.parseInt(subTotal1);
        utils.log().info(" Subtotal Values - " + subtotalValues1);

        /////  TAX VALUES  ///////
        WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taxValues1 = taxValues.getText();
        TestUtils.taxTxt1 = taxValues1;
        String tax1 = taxValues1.replaceAll("[A-Z$,. ]", "");
        int tax2 = Integer.parseInt(tax1);
        utils.log().info(" Tax Values - " + taxValues1);

        /////  Total VALUES  ///////
        WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String totalValues1 = totalValues.getText();
        TestUtils.totalTxt1 = totalValues1;
        utils.log().info(" Total Values - " + totalValues1);

        /////  Total VALUES  ///////
        WebElement paidAmount = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String paidAmount11 = paidAmount.getText();
        TestUtils.paidAmount1 = paidAmount11;
        utils.log().info(" paidAmount Value - " + paidAmount11);
    }

    public void getOrderScreenMenuValues() {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        List<WebElement> listOfValues =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
        int countOfListValues = listOfValues.size();
        utils.log().info("Size of Field " + countOfListValues);

        /////  SubTotal VALUES  ///////
        WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subtotalValues1 = subtotalValues.getText();
        TestUtils.subtotalTxt = subtotalValues1;
        String subTotal1 = subtotalValues1.replaceAll("[A-Z$,. ]", "");
        int subTotal2 = Integer.parseInt(subTotal1);
        utils.log().info(" Subtotal Values - " + subtotalValues1);

        /////  TAX VALUES  ///////
        WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taxValues1 = taxValues.getText();
        TestUtils.taxTxt = taxValues1;
        String tax1 = taxValues1.replaceAll("[A-Z$,. ]", "");
        int tax2 = Integer.parseInt(tax1);
        utils.log().info(" Tax Values - " + taxValues1);

        /////  Total VALUES  ///////
        WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String totalValues1 = totalValues.getText();
        TestUtils.totalTxt = totalValues1;
        utils.log().info(" Total Values - " + totalValues1);

        /////  Paid Amount  ///////
        WebElement paidAmount = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String paidAmount11 = paidAmount.getText();
        TestUtils.paidAmount = paidAmount11;
        utils.log().info(" paidAmount Value - " + paidAmount11);
    }

    public void verifyMenuAfterMergeDone() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        List<WebElement> orderMenu =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell"));
        utils.log().info("orderMenu.size() " + orderMenu.size());
        for (int i = 2; i <= orderMenu.size(); i++) {


            WebElement orderMenuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
            orderMenuName1[i - 1] = orderMenuName.getText();
            if (TestUtils.orderMenuName[i - 1].equalsIgnoreCase(orderMenuName1[i - 1])) {
                TestUtils.orderMenuName[i - 1] = orderMenuName1[i - 1];

                WebElement orderMenuPrize1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[2]"));
                orderMenuPrize[i - 1] = orderMenuPrize1.getText();
                TestUtils.orderMenuPrize[i - 1] = orderMenuPrize[i - 1];
                Assert.assertEquals(TestUtils.orderMenuName[i - 1], orderMenuName1[i - 1]);
                Assert.assertEquals(TestUtils.orderMenuPrize[i - 1], orderMenuPrize[i - 1]);
                utils.log().info("Order Screen menu SAME with Seat 1 Menu - " + (i - 1) + " " + orderMenuName1[i - 1] + " Prize " + orderMenuPrize[i - 1]);
                try {
                    List<WebElement> modifier =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + (i) + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
                    for (int m = 1; m <= modifier.size(); m++) {
                        WebElement modifier1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + m + "]/XCUIElementTypeStaticText[1]"));
                        modifieR[m] = modifier1.getText();
                        // TestUtils.modifier[m] = modifieR[m];
                        WebElement modifierPrize1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + m + "]/XCUIElementTypeStaticText[3]"));
                        modifierPrize[m] = modifierPrize1.getText();
                        //   TestUtils.modifierPrize[m] = modifierPrize[m];
                        Assert.assertEquals(TestUtils.modifier[m], modifieR[m]);
                        Assert.assertEquals(TestUtils.modifierPrize[m], modifierPrize[m]);
                        utils.log().info("Seat 1 Modifier - " + modifieR[m] + " Prize - " + modifierPrize[m]);
                    }

                } catch (Exception g) {

                }
            } else if (TestUtils.orderMenuName2[i - 1].equalsIgnoreCase(orderMenuName1[i - 1])) {
                TestUtils.orderMenuName2[i - 1] = orderMenuName1[i - 1];

                WebElement orderMenuPrize1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[2]"));
                orderMenuPrize[i - 1] = orderMenuPrize1.getText();
                TestUtils.orderMenuPrize2[i - 1] = orderMenuPrize[i - 1];
                Assert.assertEquals(TestUtils.orderMenuName2[i - 1], orderMenuName1[i - 1]);
                Assert.assertEquals(TestUtils.orderMenuPrize2[i - 1], orderMenuPrize[i - 1]);
                utils.log().info("Order Screen menu SAME with SEAT 2 Menu - " + (i - 1) + " " + orderMenuName1[i - 1] + " Prize " + orderMenuPrize[i - 1]);
                try {
                    List<WebElement> modifier =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + (i) + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
                    for (int m = 1; m <= modifier.size(); m++) {
                        WebElement modifier1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + m + "]/XCUIElementTypeStaticText[1]"));
                        modifieR2[m] = modifier1.getText();
                        // TestUtils.modifier[m] = modifieR[m];
                        WebElement modifierPrize1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + m + "]/XCUIElementTypeStaticText[3]"));
                        modifierPrize2[m] = modifierPrize1.getText();
                        //   TestUtils.modifierPrize[m] = modifierPrize[m];
                        Assert.assertEquals(TestUtils.modifier2[m], modifieR2[m]);
                        Assert.assertEquals(TestUtils.modifierPrize2[m], modifierPrize2[m]);
                        utils.log().info("Seat 2 Modifier - " + modifieR2[m] + " Prize - " + modifierPrize2[m]);
                    }

                } catch (Exception g) {

                }
            } else {
                utils.log().info("Menu is NOT Merged");
            }
        }
    }

    public void verifyTheMenuPrizeAfterMergeDoneForCheckBasedAmount() {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        List<WebElement> listOfValues =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
        int countOfListValues = listOfValues.size();
        utils.log().info("countOfListValues - " + countOfListValues);
        if (countOfListValues == 5) {
            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            String subTotalValueTxt = subtotalValues1.replaceAll("[A-Z$,. ]", "");
            String subTotal = (TestUtils.subtotalTxt).replaceAll("[A-Z$,. ]", "");
            int subTotalValue = Integer.parseInt(subTotal);
            String subTotal1 = (TestUtils.subtotalTxt1).replaceAll("[A-Z$., ]", "");
            int subTotalValue1 = Integer.parseInt(subTotal1);
            int subTotalFinalValue = subTotalValue + subTotalValue1;
            String subTotalFinalValue1 = String.valueOf(subTotalFinalValue);
            Assert.assertEquals(subTotalValueTxt, subTotalFinalValue1);
            utils.log().info(" Subtotal Values same  " + subtotalValues1);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues1 = taxValues.getText();
            String taxValues11 = taxValues1.replaceAll("[A-Z$., ]", "");
            String tax = (TestUtils.taxTxt).replaceAll("[A-Z$,. ]", "");
            int taxValuee = Integer.parseInt(tax);
            String tax1 = (TestUtils.taxTxt1).replaceAll("[A-Z$,. ]", "");
            int taxValuee1 = Integer.parseInt(tax1);
            int taxValueees = taxValuee + taxValuee1;
//            BigDecimal taxx=new BigDecimal(taxValueees).setScale(2, RoundingMode.HALF_UP);
//            double a=taxx.doubleValue();
            String taxValueees1 = String.valueOf(taxValueees);
            Assert.assertEquals(taxValues11, taxValueees1);
            utils.log().info(" Tax Values same - " + taxValues1);


//            /////  Cash Discount VALUES  ///////
//            WebElement cashDiscountValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
//            String cashDiscountValues1 = cashDiscountValues.getText();
//            String cashDiscountValues2 = cashDiscountValues1.replaceAll("[A-Z,. ]", "");
//            int cashDiscount1 = Integer.parseInt(cashDiscountValues2);
////            utils.log().info("cashDiscount1 - "+cashDiscount1);
//            int cashDiscount = Integer.parseInt(TestUtils.cashDiscountTxt);
//            Assert.assertEquals(cashDiscount, cashDiscount1);
//            utils.log().info(" Cash Discount Values Same - " + cashDiscountValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String totalValues1 = totalValues.getText();
            String totalValuess1 = totalValues1.replaceAll("[A-Z$,. ]", "");
            String total = TestUtils.totalTxt;
            String totall = total.replaceAll("[A-Z$,. ]", "");
            int totalValue1 = Integer.parseInt(totall);
            String total1 = TestUtils.totalTxt1;
            String total2 = total1.replaceAll("[A-Z$., ]", "");
            int totalValue2 = Integer.parseInt(total2);
            int totalValueTotal = totalValue1 + totalValue2 - 1000;
            String totalValueTotalTxt = String.valueOf(totalValueTotal);
            Assert.assertEquals(totalValuess1, totalValueTotalTxt);
            utils.log().info(" Total Values - " + totalValues1);

            /////  Cash Price VALUES  ///////
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
            String cashOptionValues1 = cashOptionValues.getText();
            String cashOptionValuesTxt = cashOptionValues1.replaceAll("[A-Z$,. ]", "");
            String cashOption = TestUtils.cashOptionOrderScreen;
            String cashOptionTxt = cashOption.replaceAll("[A-Z$,. ]", "");
            int cashOptionTxt1 = Integer.parseInt(cashOptionTxt);
            String cashOption2 = TestUtils.cashOptionOrderScreen1;
            String cashOptionTxt2 = cashOption2.replaceAll("[A-Z$,. ]", "");
            int cashOptionTxtt2 = Integer.parseInt(cashOptionTxt2);
            int cashOptionValue1 = cashOptionTxt1 + cashOptionTxtt2 - 1000;
            String cashOptionValue2 = String.valueOf(cashOptionValue1);
            Assert.assertEquals(cashOptionValuesTxt, cashOptionValue2);
            utils.log().info(" Cash Price Values - " + cashOptionValues1);

        } else {

            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            String subTotalValueTxt = subtotalValues1.replaceAll("[A-Z$,. ]", "");
            String subTotal = (TestUtils.subtotalTxt).replaceAll("[A-Z$,. ]", "");
            int subTotalValue = Integer.parseInt(subTotal);
            String subTotal1 = (TestUtils.subtotalTxt1).replaceAll("[A-Z$., ]", "");
            int subTotalValue1 = Integer.parseInt(subTotal1);
            int subTotalFinalValue = subTotalValue + subTotalValue1;
            String subTotalFinalValue1 = String.valueOf(subTotalFinalValue);
            Assert.assertEquals(subTotalValueTxt, subTotalFinalValue1);
            utils.log().info(" Subtotal Values same  " + subtotalValues1);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues111 = taxValues.getText();
            String taxValues1111 = taxValues111.replaceAll("[A-Z$., ]", "");
            DecimalFormat df =new DecimalFormat("0.00");
            String taxValues11 = df.format(Double.parseDouble(taxValues1111));
            String tax = (TestUtils.MergeTax).replaceAll("[A-Z$,. ]", "");
            double taxx = Double.parseDouble(tax);
//            DecimalFormat df1 =new DecimalFormat("0.00");
//           double taxxx = Double.parseDouble(df1.format(taxx));
            utils.log().info("taxValuee - " + taxx);
            String tax1 = (TestUtils.MergeTax1).replaceAll("[A-Z$,. ]", "");
            double taxx1 = Double.parseDouble(tax1);
//            DecimalFormat df2 =new DecimalFormat("0.00");
//            double taxxx1 = Double.parseDouble(df2.format(taxx1));
            utils.log().info("taxValuee1 - " + taxx1);
            double taxValueees = taxx + taxx1;
            DecimalFormat df3 =new DecimalFormat("0.00");
            String taxValueees1 = String.valueOf(df3.format(taxValueees));
            Assert.assertEquals(taxValues11, taxValueees1);
            utils.log().info(" Tax Values same - " + taxValues111);

            /////  Discount VALUES  ///////
            WebElement discountValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String discountValues1 = discountValues.getText();
            String discountValuesTxt1 = discountValues1.replaceAll("[A-Z$,. ]", "");
            String discount = TestUtils.discountTxt;
            String discount1 = discount.replaceAll("[A-Z$,. ]", "");
            int discountValue1 = Integer.parseInt(discount1);
            String discount2 = TestUtils.discountTxt1;
            String discount22 = discount2.replaceAll("[A-Z$,. ]", "");
            int discountValue2 = Integer.parseInt(discount22);
            // int discountWholeValue = discountValue1 + discountValue2;
            String discountWholeValueTxt = String.valueOf(discountValue1);
            Assert.assertEquals(discountValuesTxt1, discountWholeValueTxt);
            utils.log().info(" Discount Values Same - " + discountValuesTxt1);

            /////  Cash Discount VALUES  ///////
//            WebElement cashDiscountValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]");
//            String cashDiscountValues1 = cashDiscountValues.getText();
//            String cashDiscountValues2 = cashDiscountValues1.replaceAll("[A-Z,. ]", "");
//            int cashDiscount1 = Integer.parseInt(cashDiscountValues2);
//            String cashDiscount2 = TestUtils.cashDiscountTxt;
//            int cashDiscount = Integer.parseInt(cashDiscount2);
//            Assert.assertEquals(cashDiscount, cashDiscount1);
//            utils.log().info(" Cash Discount Values Same - " + cashDiscountValues1);

            // WebElement totalValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]");


            /////  Cash Price VALUES  ///////
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
            String cashOptionValues1 = cashOptionValues.getText();
            String cashOptionValuesTxt = cashOptionValues1.replaceAll("[A-Z$,. ]", "");
            int cashOptionValueAmount = Integer.parseInt(cashOptionValuesTxt);
            String cashOption = TestUtils.cashOptionOrderScreen;
            String cashOptionTxt = cashOption.replaceAll("[A-Z$,. ]", "");
            int cashOptionTxt1 = Integer.parseInt(cashOptionTxt);
            String cashOptionTxt11 = cashOption.replaceAll("[A-Z$. ]", "");
            String cashOptionTxt111 = cashOptionTxt11.replaceAll("[,]", ".");
            double cashOptionDouble = Double.parseDouble(cashOptionTxt111);

            String cashOption2 = TestUtils.cashOptionOrderScreen1;
            String cashOptionTxt2 = cashOption2.replaceAll("[A-Z$,. ]", "");
            int cashOptionTxtt2 = Integer.parseInt(cashOptionTxt2);
            String cashOptionTxt22 = cashOption2.replaceAll("[A-Z$. ]", "");
            String cashOptionTxt222 = cashOptionTxt22.replaceAll("[,]", ".");
            double cashOptionDouble1 = Double.parseDouble(cashOptionTxt222);
            double cashOptionTotal = cashOptionDouble + cashOptionDouble1 + 10.00;

//            BigDecimal dd=new BigDecimal(cashOptionTotal).setScale(2, RoundingMode.HALF_UP);
//            double a1=dd.doubleValue();
            //  utils.log().info("Double CAsh Option Value - "+cashOptionTotal);
            int cashOptionValue1 = cashOptionTxt1 + cashOptionTxtt2 + 1000;

            String cashOptionValue2 = String.valueOf(cashOptionValue1);
            Assert.assertEquals(cashOptionValuesTxt, cashOptionValue2);
            utils.log().info(" Cash Price Values - " + cashOptionValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
            String totalValues1 = totalValues.getText();
            String totalValuess1 = totalValues1.replaceAll("[A-Z$. ]", "");
            String totalValuess11 = totalValuess1.replaceAll("[,]", ".");
            double totalValues11 = Double.parseDouble(totalValuess11);
            String totalValues11Txt = String.valueOf(totalValues11);
            //  double totalValues22 = ((a*5)/100)+a;
            BigDecimal dd1 = new BigDecimal(totalValues11Txt).setScale(2, RoundingMode.HALF_UP);
            double a1 = dd1.doubleValue();
            String totalValues22Txt = String.valueOf(a1);
            Assert.assertEquals(totalValues11Txt, totalValues22Txt);


//            int totalValuess2 = Integer.parseInt(totalValuess1) ;
//            String totalValuess21 = String.valueOf(totalValuess2);
//           utils.log().info("totalValuess21 "+totalValuess21);
//            int AfterCashOptionTotal = (cashOptionValueAmount*5)/100;
//            int totalValuesDone = cashOptionValueAmount+AfterCashOptionTotal;
//
//            String totalValueDonee1 = String.valueOf(totalValuesDone);
//            utils.log().info("totalValueDonee1 "+totalValueDonee1);
//            Assert.assertEquals(totalValueDonee1,totalValuess21);

//            String totalValuess3 = String.valueOf(totalValuess2);
//            String total = TestUtils.totalTxt;
//            String totall = total.replaceAll("[A-Z$,. ]", "");
//            int totalValue1 = Integer.parseInt(totall);
//            String total1 = TestUtils.totalTxt1;
//            String total2 = total1.replaceAll("[A-Z$., ]", "");
//            int totalValue2 = Integer.parseInt(total2);
//            int totalValueTotal = totalValue1 + totalValue2;
//            String totalValueTotalTxt = String.valueOf(totalValuesDone);
//            Assert.assertEquals(totalValuess3, totalValueTotalTxt);
            utils.log().info("Total Values - " + totalValues11Txt);

        }
    }

    public void verifyTheMenuPrizeAfterMergeDone() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> listOfValues =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
        int countOfListValues = listOfValues.size();
        utils.log().info("countOfListValues - " + countOfListValues);
        if (countOfListValues == 5) {
            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            String subTotalValueTxt = subtotalValues1.replaceAll("[A-Z$,. ]", "");
            String subTotal = (TestUtils.subtotalTxt).replaceAll("[A-Z$,. ]", "");
            int subTotalValue = Integer.parseInt(subTotal);
            String subTotal1 = (TestUtils.subtotalTxt1).replaceAll("[A-Z$., ]", "");
            int subTotalValue1 = Integer.parseInt(subTotal1);
            int subTotalFinalValue = subTotalValue + subTotalValue1;
            String subTotalFinalValue1 = String.valueOf(subTotalFinalValue);
            Assert.assertEquals(subTotalValueTxt, subTotalFinalValue1);
            utils.log().info(" Subtotal Values same  " + subtotalValues1);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues1 = taxValues.getText();
            String taxValues11 = taxValues1.replaceAll("[A-Z$., ]", "");
            String tax = (TestUtils.MergeTax).replaceAll("[A-Z$,. ]", "");
            int taxValuee = Integer.parseInt(tax);
            String tax1 = (TestUtils.MergeTax1).replaceAll("[A-Z$,. ]", "");
            int taxValuee1 = Integer.parseInt(tax1);
            int taxValueees = taxValuee + taxValuee1;
            String taxValueees1 = String.valueOf(taxValueees);
            Assert.assertEquals(taxValues11, taxValueees1);
            utils.log().info(" Tax Values same - " + taxValues1);


//            /////  Cash Discount VALUES  ///////
//            WebElement cashDiscountValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
//            String cashDiscountValues1 = cashDiscountValues.getText();
//            String cashDiscountValues2 = cashDiscountValues1.replaceAll("[A-Z,. ]", "");
//            int cashDiscount1 = Integer.parseInt(cashDiscountValues2);
////            utils.log().info("cashDiscount1 - "+cashDiscount1);
//            int cashDiscount = Integer.parseInt(TestUtils.cashDiscountTxt);
//            Assert.assertEquals(cashDiscount, cashDiscount1);
//            utils.log().info(" Cash Discount Values Same - " + cashDiscountValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String totalValues1 = totalValues.getText();
            String totalValuess1 = totalValues1.replaceAll("[A-Z$,. ]", "");
            String total = TestUtils.totalTxt;
            String totall = total.replaceAll("[A-Z$,. ]", "");
            int totalValue1 = Integer.parseInt(totall);
            String total1 = TestUtils.totalTxt1;
            String total2 = total1.replaceAll("[A-Z$., ]", "");
            int totalValue2 = Integer.parseInt(total2);
            // int totalValueTotal = totalValue1;
            String totalValueTotalTxt = String.valueOf(totalValue2);
            Assert.assertEquals(totalValuess1, totalValueTotalTxt);
            utils.log().info(" Total Values - " + totalValues1);

            /////  Cash Price VALUES  ///////
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
            String cashOptionValues1 = cashOptionValues.getText();
            String cashOptionValuesTxt = cashOptionValues1.replaceAll("[A-Z$,. ]", "");
            String cashOption = TestUtils.cashOptionOrderScreen;
            String cashOptionTxt = cashOption.replaceAll("[A-Z$,. ]", "");
            int cashOptionTxt1 = Integer.parseInt(cashOptionTxt);
            String cashOption2 = TestUtils.cashOptionOrderScreen1;
            String cashOptionTxt2 = cashOption2.replaceAll("[A-Z$,. ]", "");
            int cashOptionTxtt2 = Integer.parseInt(cashOptionTxt2);
            int cashOptionValue1 = cashOptionTxt1 + cashOptionTxtt2;
            String cashOptionValue2 = String.valueOf(cashOptionValue1);
            Assert.assertEquals(cashOptionValuesTxt, cashOptionValue2);
            utils.log().info(" Cash Price Values - " + cashOptionValues1);

        } else {

            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            String subTotalValueTxt = subtotalValues1.replaceAll("[A-Z$,. ]", "");
            String subTotal = (TestUtils.subtotalTxt).replaceAll("[A-Z$,. ]", "");
            int subTotalValue = Integer.parseInt(subTotal);
            String subTotal1 = (TestUtils.subtotalTxt1).replaceAll("[A-Z$., ]", "");
            int subTotalValue1 = Integer.parseInt(subTotal1);
            int subTotalFinalValue = subTotalValue + subTotalValue1;
            String subTotalFinalValue1 = String.valueOf(subTotalFinalValue);
            Assert.assertEquals(subTotalValueTxt, subTotalFinalValue1);
            utils.log().info(" Subtotal Values same  " + subtotalValues1);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues1 = taxValues.getText();
            String taxValues11 = taxValues1.replaceAll("[A-Z$., ]", "");
            String tax = (TestUtils.taxTxt).replaceAll("[A-Z$,. ]", "");
            int taxValuee = Integer.parseInt(tax);
            String tax1 = (TestUtils.taxTxt1).replaceAll("[A-Z$,. ]", "");
            int taxValuee1 = Integer.parseInt(tax1);
            int taxValueees = taxValuee + taxValuee1;
            String taxValueees1 = String.valueOf(taxValueees);
            Assert.assertEquals(taxValues11, taxValueees1);
            utils.log().info(" Tax Values same - " + taxValues1);

            /////  Discount VALUES  ///////
            WebElement discountValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String discountValues1 = discountValues.getText();
            String discountValuesTxt1 = discountValues1.replaceAll("[A-Z$,. ]", "");
            String discount = TestUtils.discountTxt;
            String discount1 = discount.replaceAll("[A-Z$,. ]", "");
            int discountValue1 = Integer.parseInt(discount1);
            String discount2 = TestUtils.discountTxt1;
            String discount22 = discount2.replaceAll("[A-Z$,. ]", "");
            int discountValue2 = Integer.parseInt(discount22);
            int discountWholeValue = discountValue1 + discountValue2;
            String discountWholeValueTxt = String.valueOf(discountWholeValue);
            Assert.assertEquals(discountValuesTxt1, discountWholeValueTxt);
            utils.log().info(" Discount Values Same - " + discountValuesTxt1);

            /////  Cash Discount VALUES  ///////
//            WebElement cashDiscountValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]");
//            String cashDiscountValues1 = cashDiscountValues.getText();
//            String cashDiscountValues2 = cashDiscountValues1.replaceAll("[A-Z,. ]", "");
//            int cashDiscount1 = Integer.parseInt(cashDiscountValues2);
//            String cashDiscount2 = TestUtils.cashDiscountTxt;
//            int cashDiscount = Integer.parseInt(cashDiscount2);
//            Assert.assertEquals(cashDiscount, cashDiscount1);
//            utils.log().info(" Cash Discount Values Same - " + cashDiscountValues1);

            // WebElement totalValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]");


            /////  Cash Price VALUES  ///////
//            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]");
//            String cashOptionValues1 = cashOptionValues.getText();
//            String cashOptionValuesTxt = cashOptionValues1.replaceAll("[A-Z$,. ]","");
//            String cashOption = TestUtils.cashOptionOrderScreen;
//            String cashOptionTxt = cashOption.replaceAll("[A-Z$,. ]","");
//            int cashOptionTxt1 = Integer.parseInt(cashOptionTxt);
//            String cashOption2 = TestUtils.cashOptionOrderScreen1;
//            String cashOptionTxt2 = cashOption2.replaceAll("[A-Z$,. ]","");
//            int cashOptionTxtt2 = Integer.parseInt(cashOptionTxt2);
//            int cashOptionValue1 = cashOptionTxt1+cashOptionTxtt2;
//            String cashOptionValue2 = String.valueOf(cashOptionValue1);
//            Assert.assertEquals(cashOptionValuesTxt, cashOptionValue2);
//            utils.log().info(" Cash Price Values - " + cashOptionValues1);
//
//            /////  Total VALUES  ///////
//            WebElement totalValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]");
//            String totalValues1 = totalValues.getText();
//            String totalValuess1 = totalValues1.replaceAll("[A-Z$,. ]","");
//            String total = TestUtils.totalTxt;
//            String totall = total.replaceAll("[A-Z$,. ]","");
//            int totalValue1 = Integer.parseInt(totall);
//            String total1 = TestUtils.totalTxt1;
//            String total2 = total1.replaceAll("[A-Z$., ]","");
//            int totalValue2 = Integer.parseInt(total2);
//            int totalValueTotal = totalValue1+totalValue2;
//            String totalValueTotalTxt = String.valueOf(totalValueTotal);
//            Assert.assertEquals(totalValuess1, totalValueTotalTxt);
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
            String cashOptionValues1 = cashOptionValues.getText();
            String cashOptionValuesTxt = cashOptionValues1.replaceAll("[A-Z$,. ]", "");
            int cashOptionValueAmount = Integer.parseInt(cashOptionValuesTxt);
            String cashOption = TestUtils.cashOptionOrderScreen;
            String cashOptionTxt = cashOption.replaceAll("[A-Z$,. ]", "");
            int cashOptionTxt1 = Integer.parseInt(cashOptionTxt);
            String cashOptionTxt11 = cashOption.replaceAll("[A-Z$. ]", "");
            String cashOptionTxt111 = cashOptionTxt11.replaceAll("[,]", "");
            double cashOptionDouble = Double.parseDouble(cashOptionTxt111);

            String cashOption2 = TestUtils.cashOptionOrderScreen1;
            String cashOptionTxt2 = cashOption2.replaceAll("[A-Z$,. ]", "");
            int cashOptionTxtt2 = Integer.parseInt(cashOptionTxt2);
            String cashOptionTxt22 = cashOption2.replaceAll("[A-Z$. ]", "");
            String cashOptionTxt222 = cashOptionTxt22.replaceAll("[,]", "");
            double cashOptionDouble1 = Double.parseDouble(cashOptionTxt222);
            double cashOptionTotal = cashOptionDouble + cashOptionDouble1;

            BigDecimal dd = new BigDecimal(cashOptionTotal).setScale(2, RoundingMode.HALF_UP);
            double a = dd.doubleValue();
            //  utils.log().info("Double CAsh Option Value - "+cashOptionTotal);
            int cashOptionValue1 = cashOptionTxt1 + cashOptionTxtt2;

            String cashOptionValue2 = String.valueOf(cashOptionValue1);
            Assert.assertEquals(cashOptionValuesTxt, cashOptionValue2);
            utils.log().info(" Cash Price Values - " + cashOptionValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
            String totalValues1 = totalValues.getText();
            String totalValuess1 = totalValues1.replaceAll("[A-Z$. ]", "");
            String totalValuess11 = totalValuess1.replaceAll("[,]", "");
            double totalValues11 = Double.parseDouble(totalValuess11);
            String totalValues11Txt = String.valueOf((int) Math.round(totalValues11));

            double totalValues22 = ((a * 5) / 100) + a;
//            BigDecimal dd1=new BigDecimal(totalValues22).setScale(2, RoundingMode.HALF_UP);
//            double a1=dd1.doubleValue();
            String totalValues22Txt = String.valueOf((int) Math.round(totalValues22));
            Assert.assertEquals(totalValues11Txt, totalValues22Txt);
            utils.log().info("Total Values - " + totalValues11Txt);

        }
    }


    public void verifyTheMenuPrizeAfterMergeDoneForBarTabOnly() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> listOfValues =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
        int countOfListValues = listOfValues.size();
        utils.log().info("countOfListValues - " + countOfListValues);
        if (countOfListValues == 5) {
            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            String subTotalValueTxt = subtotalValues1.replaceAll("[A-Z$,. ]", "");
            String subTotal = (TestUtils.subtotalTxt).replaceAll("[A-Z$,. ]", "");
            int subTotalValue = Integer.parseInt(subTotal);
            String subTotal1 = (TestUtils.subtotalTxt1).replaceAll("[A-Z$., ]", "");
            int subTotalValue1 = Integer.parseInt(subTotal1);
            int subTotalFinalValue = subTotalValue + subTotalValue1;
            String subTotalFinalValue1 = String.valueOf(subTotalFinalValue);
            Assert.assertEquals(subTotalValueTxt, subTotalFinalValue1);
            utils.log().info(" Subtotal Values same  " + subtotalValues1);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues1 = taxValues.getText();
            String taxValues11 = taxValues1.replaceAll("[A-Z$., ]", "");
            String tax = (TestUtils.taxTxt).replaceAll("[A-Z$,. ]", "");
            int taxValuee = Integer.parseInt(tax);
            utils.log().info("taxValuee - " + taxValuee);
            String tax1 = (TestUtils.taxTxt1).replaceAll("[A-Z$,. ]", "");
            int taxValuee1 = Integer.parseInt(tax1);
            utils.log().info("taxValuee 1- " + taxValuee1);
            int taxValueees = taxValuee + taxValuee1;
            String taxValueees1 = String.valueOf(taxValueees);
            Assert.assertEquals(taxValues11, taxValueees1);
            utils.log().info(" Tax Values same - " + taxValues1);


//            /////  Cash Discount VALUES  ///////
//            WebElement cashDiscountValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");
//            String cashDiscountValues1 = cashDiscountValues.getText();
//            String cashDiscountValues2 = cashDiscountValues1.replaceAll("[A-Z,. ]", "");
//            int cashDiscount1 = Integer.parseInt(cashDiscountValues2);
////            utils.log().info("cashDiscount1 - "+cashDiscount1);
//            int cashDiscount = Integer.parseInt(TestUtils.cashDiscountTxt);
//            Assert.assertEquals(cashDiscount, cashDiscount1);
//            utils.log().info(" Cash Discount Values Same - " + cashDiscountValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String totalValues1 = totalValues.getText();
            String totalValuess1 = totalValues1.replaceAll("[A-Z$,. ]", "");
            String total = TestUtils.totalTxt;
            String totall = total.replaceAll("[A-Z$,. ]", "");
            int totalValue1 = Integer.parseInt(totall);
            String total1 = TestUtils.totalTxt1;
            String total2 = total1.replaceAll("[A-Z$., ]", "");
            int totalValue2 = Integer.parseInt(total2);
            int totalValueTotal = totalValue1 + totalValue2;
            String totalValueTotalTxt = String.valueOf(totalValueTotal);
            Assert.assertEquals(totalValuess1, totalValueTotalTxt);
            utils.log().info(" Total Values - " + totalValues1);

            /////  Cash Price VALUES  ///////
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
            String cashOptionValues1 = cashOptionValues.getText();
            String cashOptionValuesTxt = cashOptionValues1.replaceAll("[A-Z$,. ]", "");
            String cashOption = TestUtils.cashOptionOrderScreen;
            String cashOptionTxt = cashOption.replaceAll("[A-Z$,. ]", "");
            int cashOptionTxt1 = Integer.parseInt(cashOptionTxt);
            String cashOption2 = TestUtils.cashOptionOrderScreen1;
            String cashOptionTxt2 = cashOption2.replaceAll("[A-Z$,. ]", "");
            int cashOptionTxtt2 = Integer.parseInt(cashOptionTxt2);
            int cashOptionValue1 = cashOptionTxt1 + cashOptionTxtt2;
            String cashOptionValue2 = String.valueOf(cashOptionValue1);
            Assert.assertEquals(cashOptionValuesTxt, cashOptionValue2);
            utils.log().info(" Cash Price Values - " + cashOptionValues1);

        } else {

            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            String subTotalValueTxt = subtotalValues1.replaceAll("[A-Z$,. ]", "");
            String subTotal = (TestUtils.subtotalTxt).replaceAll("[A-Z$,. ]", "");
            int subTotalValue = Integer.parseInt(subTotal);
            String subTotal1 = (TestUtils.subtotalTxt1).replaceAll("[A-Z$., ]", "");
            int subTotalValue1 = Integer.parseInt(subTotal1);
            int subTotalFinalValue = subTotalValue + subTotalValue1;
            String subTotalFinalValue1 = String.valueOf(subTotalFinalValue);
            Assert.assertEquals(subTotalValueTxt, subTotalFinalValue1);
            utils.log().info(" Subtotal Values same  " + subtotalValues1);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues1 = taxValues.getText();
            String taxValues11 = taxValues1.replaceAll("[A-Z$., ]", "");
            String tax = (TestUtils.taxTxt).replaceAll("[A-Z$,. ]", "");
            int taxValuee = Integer.parseInt(tax);
            String tax1 = (TestUtils.taxTxt1).replaceAll("[A-Z$,. ]", "");
            int taxValuee1 = Integer.parseInt(tax1);
            int taxValueees = taxValuee + taxValuee1;
            String taxValueees1 = String.valueOf(taxValueees);
            Assert.assertEquals(taxValues11, taxValueees1);
            utils.log().info(" Tax Values same - " + taxValues1);

            /////  Discount VALUES  ///////
            WebElement discountValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String discountValues1 = discountValues.getText();
            String discountValuesTxt1 = discountValues1.replaceAll("[A-Z$,. ]", "");
            String discount = TestUtils.discountTxt;
            String discount1 = discount.replaceAll("[A-Z$,. ]", "");
            int discountValue1 = Integer.parseInt(discount1);
            String discount2 = TestUtils.discountTxt1;
            String discount22 = discount2.replaceAll("[A-Z$,. ]", "");
            int discountValue2 = Integer.parseInt(discount22);
            int discountWholeValue = discountValue1 + discountValue2;
            String discountWholeValueTxt = String.valueOf(discountWholeValue);
            Assert.assertEquals(discountValuesTxt1, discountWholeValueTxt);
            utils.log().info(" Discount Values Same - " + discountValuesTxt1);

            /////  Cash Discount VALUES  ///////
//            WebElement cashDiscountValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]");
//            String cashDiscountValues1 = cashDiscountValues.getText();
//            String cashDiscountValues2 = cashDiscountValues1.replaceAll("[A-Z,. ]", "");
//            int cashDiscount1 = Integer.parseInt(cashDiscountValues2);
//            String cashDiscount2 = TestUtils.cashDiscountTxt;
//            int cashDiscount = Integer.parseInt(cashDiscount2);
//            Assert.assertEquals(cashDiscount, cashDiscount1);
//            utils.log().info(" Cash Discount Values Same - " + cashDiscountValues1);

            // WebElement totalValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]");


            /////  Cash Price VALUES  ///////
//            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]");
//            String cashOptionValues1 = cashOptionValues.getText();
//            String cashOptionValuesTxt = cashOptionValues1.replaceAll("[A-Z$,. ]","");
//            String cashOption = TestUtils.cashOptionOrderScreen;
//            String cashOptionTxt = cashOption.replaceAll("[A-Z$,. ]","");
//            int cashOptionTxt1 = Integer.parseInt(cashOptionTxt);
//            String cashOption2 = TestUtils.cashOptionOrderScreen1;
//            String cashOptionTxt2 = cashOption2.replaceAll("[A-Z$,. ]","");
//            int cashOptionTxtt2 = Integer.parseInt(cashOptionTxt2);
//            int cashOptionValue1 = cashOptionTxt1+cashOptionTxtt2;
//            String cashOptionValue2 = String.valueOf(cashOptionValue1);
//            Assert.assertEquals(cashOptionValuesTxt, cashOptionValue2);
//            utils.log().info(" Cash Price Values - " + cashOptionValues1);
//
//            /////  Total VALUES  ///////
//            WebElement totalValues = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]");
//            String totalValues1 = totalValues.getText();
//            String totalValuess1 = totalValues1.replaceAll("[A-Z$,. ]","");
//            String total = TestUtils.totalTxt;
//            String totall = total.replaceAll("[A-Z$,. ]","");
//            int totalValue1 = Integer.parseInt(totall);
//            String total1 = TestUtils.totalTxt1;
//            String total2 = total1.replaceAll("[A-Z$., ]","");
//            int totalValue2 = Integer.parseInt(total2);
//            int totalValueTotal = totalValue1+totalValue2;
//            String totalValueTotalTxt = String.valueOf(totalValueTotal);
//            Assert.assertEquals(totalValuess1, totalValueTotalTxt);
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
            String cashOptionValues1 = cashOptionValues.getText();
            String cashOptionValuesTxt = cashOptionValues1.replaceAll("[A-Z$,. ]", "");
            int cashOptionValueAmount = Integer.parseInt(cashOptionValuesTxt);
            String cashOption = TestUtils.cashOptionOrderScreen;
            String cashOptionTxt = cashOption.replaceAll("[A-Z$,. ]", "");
            int cashOptionTxt1 = Integer.parseInt(cashOptionTxt);
            String cashOptionTxt11 = cashOption.replaceAll("[A-Z$. ]", "");
            String cashOptionTxt111 = cashOptionTxt11.replaceAll("[,]", ".");
            double cashOptionDouble = Double.parseDouble(cashOptionTxt111);

            String cashOption2 = TestUtils.cashOptionOrderScreen1;
            String cashOptionTxt2 = cashOption2.replaceAll("[A-Z$,. ]", "");
            int cashOptionTxtt2 = Integer.parseInt(cashOptionTxt2);
            String cashOptionTxt22 = cashOption2.replaceAll("[A-Z$. ]", "");
            String cashOptionTxt222 = cashOptionTxt22.replaceAll("[,]", ".");
            double cashOptionDouble1 = Double.parseDouble(cashOptionTxt222);
            double cashOptionTotal = cashOptionDouble + cashOptionDouble1;

            BigDecimal dd = new BigDecimal(cashOptionTotal).setScale(2, RoundingMode.HALF_UP);
            double a = dd.doubleValue();
            //  utils.log().info("Double CAsh Option Value - "+cashOptionTotal);
            int cashOptionValue1 = cashOptionTxt1 + cashOptionTxtt2;

            String cashOptionValue2 = String.valueOf(cashOptionValue1);
            Assert.assertEquals(cashOptionValuesTxt, cashOptionValue2);
            utils.log().info(" Cash Price Values - " + cashOptionValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
            String totalValues1 = totalValues.getText();
            String totalValuess1 = totalValues1.replaceAll("[A-Z$. ]", "");
            String totalValuess11 = totalValuess1.replaceAll("[,]", ".");
            double totalValues11 = Double.parseDouble(totalValuess11);
            String totalValues11Txt = String.valueOf(totalValues11);
            double totalValues22 = ((a * 5) / 100) + a;
            BigDecimal dd1 = new BigDecimal(totalValues22).setScale(2, RoundingMode.HALF_UP);
            double a1 = dd1.doubleValue();
            String totalValues22Txt = String.valueOf(a1);
            Assert.assertEquals(totalValues11Txt, totalValues22Txt);


            utils.log().info("Total Values - " + totalValues11Txt);

        }
    }

    public void validateTheMenuValueInOrderScreen() {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        List<WebElement> listOfValues =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
        int countOfListValues = listOfValues.size();
        utils.log().info("countOfListValues - " + countOfListValues);
        if (countOfListValues == 6) {
            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            String subTotal = TestUtils.subtotalTxt;
            Assert.assertEquals(subTotal, subtotalValues1);
            utils.log().info(" Subtotal Values same  " + subTotal);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues1 = taxValues.getText();
            String tax = TestUtils.taxTxt;
            Assert.assertEquals(tax, taxValues1);
            utils.log().info(" Tax Values same - " + tax);


            /////  Cash Discount VALUES  ///////
            WebElement cashDiscountValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String cashDiscountValues1 = cashDiscountValues.getText();
            String cashDiscountValues2 = cashDiscountValues1.replaceAll("[A-Z$,. ]", "");
            int cashDiscount1 = Integer.parseInt(cashDiscountValues2);
//            utils.log().info("cashDiscount1 - "+cashDiscount1);
            int cashDiscount = Integer.parseInt(TestUtils.cashDiscountTxt);
            Assert.assertEquals(cashDiscount, cashDiscount1);
            utils.log().info(" Cash Discount Values Same - " + cashDiscountValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
            String totalValues1 = totalValues.getText();
            String total = TestUtils.cashOptionOrderScreen;
            Assert.assertEquals(totalValues1, total);
            utils.log().info(" Total Values - " + total);

            /////  Cash Price VALUES  ///////
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
            String cashOptionValues1 = cashOptionValues.getText();
            String cashOption = TestUtils.cashOptionOrderScreen;
            Assert.assertEquals(cashOption, cashOptionValues1);
            utils.log().info(" Cash Price Values - " + cashOption);

        } else {

            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            String subTotal = TestUtils.subtotalTxt;
            Assert.assertEquals(subTotal, subtotalValues1);
            utils.log().info(" Subtotal Values Same  " + subTotal);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues1 = taxValues.getText();
            String tax = TestUtils.taxTxt;
            Assert.assertEquals(tax, taxValues1);
            utils.log().info(" Tax Values Same - " + tax);

            /////  Discount VALUES  ///////
            WebElement discountValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String discountValues1 = discountValues.getText();
            String discount = TestUtils.discountTxt;
            Assert.assertEquals(discount, discountValues1);
            utils.log().info(" Discount Values Same - " + discountValues1);

            /////  Cash Discount VALUES  ///////
            WebElement cashDiscountValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
            String cashDiscountValues1 = cashDiscountValues.getText();
            String cashDiscountValues2 = cashDiscountValues1.replaceAll("[A-Z$,. ]", "");
            int cashDiscount1 = Integer.parseInt(cashDiscountValues2);
            String cashDiscount2 = TestUtils.cashDiscountTxt;
            int cashDiscount = Integer.parseInt(cashDiscount2);
            Assert.assertEquals(cashDiscount, cashDiscount1);
            utils.log().info(" Cash Discount Values Same - " + cashDiscountValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
            String totalValues1 = totalValues.getText();
            String total = TestUtils.totalTxt;
            Assert.assertEquals(totalValues1, total);
            utils.log().info(" Total Values Same - " + total);


            /////  Cash Price VALUES  ///////
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[7]"));
            String cashOptionValues1 = cashOptionValues.getText();
            String cashOption = TestUtils.cashOptionOrderScreen;
            Assert.assertEquals(cashOption, cashOptionValues1);
            utils.log().info(" Cash Price Values Same- " + cashOption);

        }
    }
    public void validateTheMenuValueInOrderScreen2() {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        /////  SubTotal VALUES  ///////
        WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subtotalValues1 = subtotalValues.getText();
        String subTotal = TestUtils.subtotalTxt;
        Assert.assertEquals(subTotal, subtotalValues1);
        utils.log().info(" Subtotal Values same  " + subTotal);

        /////  TAX VALUES  ///////
        WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taxValues1 = taxValues.getText();
        String tax = TestUtils.taxTxt;
        Assert.assertEquals(tax, taxValues1);
        utils.log().info(" Tax Values same - " + tax);


        /////  Cash Discount VALUES  ///////
        WebElement cashDiscountValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String cashDiscountValues1 = cashDiscountValues.getText();
        String cashDiscountValues2 = cashDiscountValues1.replaceAll("[A-Z$,. ]", "");
        int cashDiscount1 = Integer.parseInt(cashDiscountValues2);
//            utils.log().info("cashDiscount1 - "+cashDiscount1);
        int cashDiscount = Integer.parseInt(TestUtils.gratutiy.replaceAll("[$. ]",""));
        Assert.assertEquals(cashDiscount, cashDiscount1);
        utils.log().info(" Cash Discount Values Same - " + cashDiscountValues1);

        /////  Total VALUES  ///////
        WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String totalValues1 = totalValues.getText().replaceAll("[$ ]","");
        String total = TestUtils.totalTxt.replaceAll("[$ ]","");
        Assert.assertEquals(totalValues1, total);
        utils.log().info(" Total Values - " + total);

        /////  Cash Price VALUES  ///////
        WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        String cashOptionValues1 = cashOptionValues.getText().replaceAll("[$ ]","");
        String cashOption = TestUtils.totalTxt1.replaceAll("[$ ]","");
        Assert.assertEquals(cashOption, cashOptionValues1);
        utils.log().info(" Cash Price Values - " + cashOption);

    }
    public void validateTheMenuValueInOrderScreen1() {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

            /////  SubTotal VALUES  ///////
            WebElement subtotalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subtotalValues1 = subtotalValues.getText();
            String subTotal = TestUtils.subtotalTxt;
            Assert.assertEquals(subTotal, subtotalValues1);
            utils.log().info(" Subtotal Values same  " + subTotal);

            /////  TAX VALUES  ///////
            WebElement taxValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxValues1 = taxValues.getText();
            String tax = TestUtils.taxTxt;
            Assert.assertEquals(tax, taxValues1);
            utils.log().info(" Tax Values same - " + tax);


            /////  Cash Discount VALUES  ///////
            WebElement cashDiscountValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String cashDiscountValues1 = cashDiscountValues.getText();
            String cashDiscountValues2 = cashDiscountValues1.replaceAll("[A-Z$,. ]", "");
            int cashDiscount1 = Integer.parseInt(cashDiscountValues2);
//            utils.log().info("cashDiscount1 - "+cashDiscount1);
            int cashDiscount = Integer.parseInt(TestUtils.totalTxt.replaceAll("[$. ]",""));
            Assert.assertEquals(cashDiscount, cashDiscount1);
            utils.log().info(" Cash Discount Values Same - " + cashDiscountValues1);

            /////  Total VALUES  ///////
            WebElement totalValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
            String totalValues1 = totalValues.getText().replaceAll("[$ ]","");
            String total = TestUtils.totalTxt1.replaceAll("[$ ]","");
            Assert.assertEquals(totalValues1, total);
            utils.log().info(" Total Values - " + total);

            /////  Cash Price VALUES  ///////
            WebElement cashOptionValues = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
            String cashOptionValues1 = cashOptionValues.getText().replaceAll("[$ ]","");
            String cashOption = TestUtils.totalTxt1.replaceAll("[$ ]","");
            Assert.assertEquals(cashOption, cashOptionValues1);
            utils.log().info(" Cash Price Values - " + cashOption);


    }

    public String seatNumber = " ";

    public String selectMenuForDineInForSplitCheck(String cate) {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
        elementClick(New, "Tapped New");
        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));

/****  RandOm Select Table ***/

        Random rand = new Random();

        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
            WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]"));
            String tableNumber = "T" + itemToSelect;

            utils.log().info("Table Number  - " + tableNumber);
            elementClick(tableNum, "Tapped Table Number");

            WebElement seat = (WebElement) driver.findElement(By.xpath("2"));
            seatNumber = seat.getText();
            elementClick(seat, "Tapped seat Number");
            TestUtils.seatNumber = seatNumber;
            WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
            elementClick(cont, "Tapped continue");
            getCheckNumberTxt();
            elementClick(arrowDownForOtherMenuItems, "Arrow Down");

            /*** Random Select Category ***/

            WebElement cate1 = (WebElement) driver.findElement(By.xpath(cate));
            elementClick(cate1, "Tapped category");
//            List<WebElement> categories =  driver.findElements(By.xpath()("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell");
//            int cateSize = categories.size();
//            utils.log().info("Category Available count in this Store - " + cateSize);
//
//            for (int m = 1; m <= 1; m++) {
//                itemToSelect3 = rand.nextInt(cateSize);
//
//                if (itemToSelect3 == 0) {
//                    itemToSelect3 = 1;
//                }
//
//                WebElement categoryName = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect3 + "]/XCUIElementTypeStaticText[1]");
//                String categoryNameTxt = categoryName.getText();
//                elementClick(categoryName, "Category place - " + itemToSelect3 + " Selected Category - " + categoryNameTxt);

            /****  RandOm Select Menu ***/

            WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
            check = order.getText();
            TestUtils.tableNumberof = check;
            //  utils.log().info(tableNumber+" - Table Number");
            ///XCUIElementTypeOther[2]/XCUIElementTypeCollectionView

            try {
                WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

                if (find(menuCollection1, 2)) {
                    List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                    int count1 = menuCollection.size();
                    Random rand1 = new Random();
                    for (int j = 1; j <= 2; j++) {
                        int itemToSelect1 = rand1.nextInt(count1);

                        if (itemToSelect1 == 0) {
                            itemToSelect1 = 1;
                        }

                        utils.log().info(String.valueOf(itemToSelect1));


                        WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                        utils.log().info(menu.getText());
                        elementClick(menu, "Tapped Menu");
                        try {
                            WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            if ((mainModi.isDisplayed())) {
                                String mainModifier = mainModi.getText();
                                elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                                try {
                                    WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                    WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                    WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                    WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                    if (remainingModi.isDisplayed()) {
                                        String SubModifier1 = subModi1.getText();
                                        elementClick(subModi1, SubModifier1 + " - SubModifier");
                                        String SubModifier2 = subModi2.getText();
                                        elementClick(subModi2, SubModifier2 + " - SubModifier");
                                        String SubModifier3 = subModi3.getText();
                                        elementClick(subModi3, SubModifier3 + " - SubModifier");
                                        elementClick(doneButton, "Tapped Done");

                                    } else {

                                    }
                                } catch (Exception h) {
                                    elementClick(doneButton, "Tapped Done");
                                }
                            } else {

                            }

                        } catch (Exception x) {
                            try {


                                //  utils.log().info(size2.getText());
                                WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String data = size1.getText();
                                WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                                if (size2.isDisplayed()) {
                                    elementClick(size1, data + " - selected");
                                    WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                    String mainModi = mainModi1.getText();
                                    elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                    elementClick(doneButton, "Tapped Done");
                                } else {
                                    WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                    String mini = minimum.getText();
                                    utils.log().info(mini + " - Additional Modifiers ");
                                    //             if (find(minimum, 2)) {
                                    WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                    String modiname = addMeats.getText();
                                    elementClick(addMeats, "Modifier selected - " + modiname);
                                    elementClick(doneButton, "Tapped Done");
                                }

                                //          }
                                ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                                ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            } catch (Exception v) {

                            }
                        }


                    }
                }
                // elementClick(finishOrderBtn, "Finish Button");
            } catch (Exception h) {


                List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                int count1 = menuCollection2.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 2; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }

                    utils.log().info(String.valueOf(itemToSelect1));


                    WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    utils.log().info(menu.getText());
                    elementClick(menu, "Tapped Menu");
                    try {
                        WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                        if ((mainModi.isDisplayed())) {
                            String mainModifier = mainModi.getText();
                            elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                            try {
                                WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                if (remainingModi.isDisplayed()) {
                                    String SubModifier1 = subModi1.getText();
                                    elementClick(subModi1, SubModifier1 + " - SubModifier");
                                    String SubModifier2 = subModi2.getText();
                                    elementClick(subModi2, SubModifier2 + " - SubModifier");
                                    String SubModifier3 = subModi3.getText();
                                    elementClick(subModi3, SubModifier3 + " - SubModifier");
                                    elementClick(doneButton, "Tapped Done");

                                } else {

                                }
                            } catch (Exception M) {
                                elementClick(doneButton, "Tapped Done");
                            }
                        } else {

                        }

                    } catch (Exception x) {
                        try {


                            //  utils.log().info(size2.getText());
                            WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String data = size1.getText();
                            WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                            if (size2.isDisplayed()) {
                                elementClick(size1, data + " - selected");
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String mainModi = mainModi1.getText();
                                elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                elementClick(doneButton, "Tapped Done");
                            } else {
                                WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                String mini = minimum.getText();
                                utils.log().info(mini + " - Additional Modifiers ");
                                //             if (find(minimum, 2)) {
                                WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                String modiname = addMeats.getText();
                                elementClick(addMeats, "Modifier selected - " + modiname);
                                elementClick(doneButton, "Tapped Done");
                            }

                            //          }
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                        } catch (Exception v) {

                        }
                    }

                }
                //    elementClick(finishOrderBtn,"Tapped finish Button");

            }
        }
        return check;
    }


    public String selectMenuForDineInForSplitSeat(String cate) {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
        elementClick(New, "Tapped New");
        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));

/****  RandOm Select Table ***/

        Random rand = new Random();

        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
            WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]"));
            String tableNumber = "T" + itemToSelect;

            utils.log().info("Table Number  - " + tableNumber);
            elementClick(tableNum, "Tapped Table Number");

            WebElement seat = (WebElement) driver.findElement(By.xpath("1"));
            seatNumber = seat.getText();
            elementClick(seat, "Tapped seat Number");
            TestUtils.seatNumber = seatNumber;
            WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
            elementClick(cont, "Tapped continue");
            getCheckNumberTxt();
            elementClick(arrowDownForOtherMenuItems, "Arrow Down");

            /*** Random Select Category ***/

            WebElement cate1 = (WebElement) driver.findElement(By.xpath(cate));
            elementClick(cate1, "Tapped category");
//            List<WebElement> categories =  driver.findElements(By.xpath()("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell");
//            int cateSize = categories.size();
//            utils.log().info("Category Available count in this Store - " + cateSize);
//
//            for (int m = 1; m <= 1; m++) {
//                itemToSelect3 = rand.nextInt(cateSize);
//
//                if (itemToSelect3 == 0) {
//                    itemToSelect3 = 1;
//                }
//
//                WebElement categoryName = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect3 + "]/XCUIElementTypeStaticText[1]");
//                String categoryNameTxt = categoryName.getText();
//                elementClick(categoryName, "Category place - " + itemToSelect3 + " Selected Category - " + categoryNameTxt);

            /****  RandOm Select Menu ***/

            WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
            check = order.getText();
            TestUtils.tableNumberof = check;
            //  utils.log().info(tableNumber+" - Table Number");
            ///XCUIElementTypeOther[2]/XCUIElementTypeCollectionView

            try {
                WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

                if (find(menuCollection1, 2)) {
                    List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                    int count1 = menuCollection.size();
                    Random rand1 = new Random();
                    for (int j = 1; j <= 2; j++) {
                        int itemToSelect1 = rand1.nextInt(count1);

                        if (itemToSelect1 == 0) {
                            itemToSelect1 = 1;
                        }

                        utils.log().info(String.valueOf(itemToSelect1));


                        WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                        utils.log().info(menu.getText());
                        elementClick(menu, "Tapped Menu");
                        try {
                            WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            if ((mainModi.isDisplayed())) {
                                String mainModifier = mainModi.getText();
                                elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                                try {
                                    WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                    WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                    WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                    WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                    if (remainingModi.isDisplayed()) {
                                        String SubModifier1 = subModi1.getText();
                                        elementClick(subModi1, SubModifier1 + " - SubModifier");
                                        String SubModifier2 = subModi2.getText();
                                        elementClick(subModi2, SubModifier2 + " - SubModifier");
                                        String SubModifier3 = subModi3.getText();
                                        elementClick(subModi3, SubModifier3 + " - SubModifier");
                                        elementClick(doneButton, "Tapped Done");

                                    } else {

                                    }
                                } catch (Exception h) {
                                    elementClick(doneButton, "Tapped Done");
                                }
                            } else {

                            }

                        } catch (Exception x) {
                            try {


                                //  utils.log().info(size2.getText());
                                WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String data = size1.getText();
                                WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                                if (size2.isDisplayed()) {
                                    elementClick(size1, data + " - selected");
                                    WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                    String mainModi = mainModi1.getText();
                                    elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                    elementClick(doneButton, "Tapped Done");
                                } else {
                                    WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                    String mini = minimum.getText();
                                    utils.log().info(mini + " - Additional Modifiers ");
                                    //             if (find(minimum, 2)) {
                                    WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                    String modiname = addMeats.getText();
                                    elementClick(addMeats, "Modifier selected - " + modiname);
                                    elementClick(doneButton, "Tapped Done");
                                }

                                //          }
                                ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                                ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            } catch (Exception v) {

                            }
                        }


                    }
                }
                // elementClick(finishOrderBtn, "Finish Button");
            } catch (Exception h) {


                List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                int count1 = menuCollection2.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 2; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }

                    utils.log().info(String.valueOf(itemToSelect1));


                    WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    utils.log().info(menu.getText());
                    elementClick(menu, "Tapped Menu");
                    try {
                        WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                        if ((mainModi.isDisplayed())) {
                            String mainModifier = mainModi.getText();
                            elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                            try {
                                WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                if (remainingModi.isDisplayed()) {
                                    String SubModifier1 = subModi1.getText();
                                    elementClick(subModi1, SubModifier1 + " - SubModifier");
                                    String SubModifier2 = subModi2.getText();
                                    elementClick(subModi2, SubModifier2 + " - SubModifier");
                                    String SubModifier3 = subModi3.getText();
                                    elementClick(subModi3, SubModifier3 + " - SubModifier");
                                    elementClick(doneButton, "Tapped Done");

                                } else {

                                }
                            } catch (Exception M) {
                                elementClick(doneButton, "Tapped Done");
                            }
                        } else {

                        }

                    } catch (Exception x) {
                        try {


                            //  utils.log().info(size2.getText());
                            WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String data = size1.getText();
                            WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                            if (size2.isDisplayed()) {
                                elementClick(size1, data + " - selected");
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String mainModi = mainModi1.getText();
                                elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                elementClick(doneButton, "Tapped Done");
                            } else {
                                WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                String mini = minimum.getText();
                                utils.log().info(mini + " - Additional Modifiers ");
                                //             if (find(minimum, 2)) {
                                WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                String modiname = addMeats.getText();
                                elementClick(addMeats, "Modifier selected - " + modiname);
                                elementClick(doneButton, "Tapped Done");
                            }

                            //          }
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                        } catch (Exception v) {

                        }
                    }

                }
                //    elementClick(finishOrderBtn,"Tapped finish Button");

            }
        }
        return check;
    }

    public String selectMenuForBarTabForSplitCheck1(String cate) {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        getCheckNumberTxt1();
        elementClick(arrowDownForOtherMenuItems, "Arrow Down");

        /*** Random Select Category ***/

        WebElement cate1 = (WebElement) driver.findElement(By.xpath(cate));
        elementClick(cate1, "Tapped category");

        /****  RandOm Select Menu ***/

        WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
        check = order.getText();
        TestUtils.tableNumberof1 = check1;
        //  utils.log().info(tableNumber+" - Table Number");
        ///XCUIElementTypeOther[2]/XCUIElementTypeCollectionView

        try {
            WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

            if (find(menuCollection1, 2)) {
                List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                int count1 = menuCollection.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 1; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }

                    utils.log().info(String.valueOf(itemToSelect1));


                    WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    utils.log().info(menu.getText());
                    elementClick(menu, "Tapped Menu");
                    try {
                        WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                        if ((mainModi.isDisplayed())) {
                            String mainModifier = mainModi.getText();
                            elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                            try {
                                WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                if (remainingModi.isDisplayed()) {
                                    String SubModifier1 = subModi1.getText();
                                    elementClick(subModi1, SubModifier1 + " - SubModifier");
                                    String SubModifier2 = subModi2.getText();
                                    elementClick(subModi2, SubModifier2 + " - SubModifier");
                                    String SubModifier3 = subModi3.getText();
                                    elementClick(subModi3, SubModifier3 + " - SubModifier");
                                    elementClick(doneButton, "Tapped Done");

                                } else {

                                }
                            } catch (Exception h) {
                                elementClick(doneButton, "Tapped Done");
                            }
                        } else {

                        }

                    } catch (Exception x) {
                        try {


                            //  utils.log().info(size2.getText());
                            WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String data = size1.getText();
                            WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                            if (size2.isDisplayed()) {
                                elementClick(size1, data + " - selected");
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String mainModi = mainModi1.getText();
                                elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                elementClick(doneButton, "Tapped Done");
                            } else {
                                WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                String mini = minimum.getText();
                                utils.log().info(mini + " - Additional Modifiers ");
                                //             if (find(minimum, 2)) {
                                WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                String modiname = addMeats.getText();
                                elementClick(addMeats, "Modifier selected - " + modiname);
                                elementClick(doneButton, "Tapped Done");
                            }

                        } catch (Exception v) {

                        }
                    }


                }
            }
            // elementClick(finishOrderBtn, "Finish Button");
        } catch (Exception h) {


            List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
            int count1 = menuCollection2.size();
            Random rand1 = new Random();
            for (int j = 1; j <= 1; j++) {
                int itemToSelect1 = rand1.nextInt(count1);

                if (itemToSelect1 == 0) {
                    itemToSelect1 = 1;
                }

                utils.log().info(String.valueOf(itemToSelect1));


                WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                utils.log().info(menu.getText());
                elementClick(menu, "Tapped Menu");
                try {
                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                    if ((mainModi.isDisplayed())) {
                        String mainModifier = mainModi.getText();
                        elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                        try {
                            WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                            WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            if (remainingModi.isDisplayed()) {
                                String SubModifier1 = subModi1.getText();
                                elementClick(subModi1, SubModifier1 + " - SubModifier");
                                String SubModifier2 = subModi2.getText();
                                elementClick(subModi2, SubModifier2 + " - SubModifier");
                                String SubModifier3 = subModi3.getText();
                                elementClick(subModi3, SubModifier3 + " - SubModifier");
                                elementClick(doneButton, "Tapped Done");

                            } else {

                            }
                        } catch (Exception M) {
                            elementClick(doneButton, "Tapped Done");
                        }
                    } else {

                    }

                } catch (Exception x) {
                    try {


                        //  utils.log().info(size2.getText());
                        WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                        String data = size1.getText();
                        WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                        if (size2.isDisplayed()) {
                            elementClick(size1, data + " - selected");
                            WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String mainModi = mainModi1.getText();
                            elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                            elementClick(doneButton, "Tapped Done");
                        } else {
                            WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                            String mini = minimum.getText();
                            utils.log().info(mini + " - Additional Modifiers ");
                            //             if (find(minimum, 2)) {
                            WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                            String modiname = addMeats.getText();
                            elementClick(addMeats, "Modifier selected - " + modiname);
                            elementClick(doneButton, "Tapped Done");
                        }


                    } catch (Exception v) {

                    }
                }

            }
            //    elementClick(finishOrderBtn,"Tapped finish Button");

        }

        return check1;
    }


    public String selectMenuForBarTabForMergeCheck1(String cate) {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        getCheckNumberTxt1();
        elementClick(arrowDownForOtherMenuItems, "Arrow Down");

        /*** Random Select Category ***/

        WebElement cate1 = (WebElement) driver.findElement(By.xpath(cate));
        elementClick(cate1, "Tapped category");

        /****  RandOm Select Menu ***/

        WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
        check = order.getText();
        TestUtils.tableNumberof1 = check1;
        //  utils.log().info(tableNumber+" - Table Number");
        ///XCUIElementTypeOther[2]/XCUIElementTypeCollectionView

        try {
            WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

            if (find(menuCollection1, 2)) {
                List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                int count1 = menuCollection.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 1; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }

                    utils.log().info(String.valueOf(itemToSelect1));


                    WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    utils.log().info(menu.getText());
                    elementClick(menu, "Tapped Menu");
                    try {
                        WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                        if ((mainModi.isDisplayed())) {
                            String mainModifier = mainModi.getText();
                            elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                            try {
                                WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                if (remainingModi.isDisplayed()) {
                                    String SubModifier1 = subModi1.getText();
                                    elementClick(subModi1, SubModifier1 + " - SubModifier");
                                    String SubModifier2 = subModi2.getText();
                                    elementClick(subModi2, SubModifier2 + " - SubModifier");
                                    String SubModifier3 = subModi3.getText();
                                    elementClick(subModi3, SubModifier3 + " - SubModifier");
                                    elementClick(doneButton, "Tapped Done");

                                } else {

                                }
                            } catch (Exception h) {
                                elementClick(doneButton, "Tapped Done");
                            }
                        } else {

                        }

                    } catch (Exception x) {
                        try {


                            //  utils.log().info(size2.getText());
                            WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String data = size1.getText();
                            WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                            if (size2.isDisplayed()) {
                                elementClick(size1, data + " - selected");
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String mainModi = mainModi1.getText();
                                elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                elementClick(doneButton, "Tapped Done");
                            } else {
                                WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                String mini = minimum.getText();
                                utils.log().info(mini + " - Additional Modifiers ");
                                //             if (find(minimum, 2)) {
                                WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                String modiname = addMeats.getText();
                                elementClick(addMeats, "Modifier selected - " + modiname);
                                elementClick(doneButton, "Tapped Done");
                            }

                        } catch (Exception v) {

                        }
                    }


                }
            }
            // elementClick(finishOrderBtn, "Finish Button");
        } catch (Exception h) {


            List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
            int count1 = menuCollection2.size();
            Random rand1 = new Random();
            for (int j = 1; j <= 1; j++) {
                int itemToSelect1 = rand1.nextInt(count1);

                if (itemToSelect1 == 0) {
                    itemToSelect1 = 1;
                }

                utils.log().info(String.valueOf(itemToSelect1));


                WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                utils.log().info(menu.getText());
                elementClick(menu, "Tapped Menu");
                try {
                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                    if ((mainModi.isDisplayed())) {
                        String mainModifier = mainModi.getText();
                        elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                        try {
                            WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                            WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            if (remainingModi.isDisplayed()) {
                                String SubModifier1 = subModi1.getText();
                                elementClick(subModi1, SubModifier1 + " - SubModifier");
                                String SubModifier2 = subModi2.getText();
                                elementClick(subModi2, SubModifier2 + " - SubModifier");
                                String SubModifier3 = subModi3.getText();
                                elementClick(subModi3, SubModifier3 + " - SubModifier");
                                elementClick(doneButton, "Tapped Done");

                            } else {

                            }
                        } catch (Exception M) {
                            elementClick(doneButton, "Tapped Done");
                        }
                    } else {

                    }

                } catch (Exception x) {
                    try {


                        //  utils.log().info(size2.getText());
                        WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                        String data = size1.getText();
                        WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                        if (size2.isDisplayed()) {
                            elementClick(size1, data + " - selected");
                            WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String mainModi = mainModi1.getText();
                            elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                            elementClick(doneButton, "Tapped Done");
                        } else {
                            WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                            String mini = minimum.getText();
                            utils.log().info(mini + " - Additional Modifiers ");
                            //             if (find(minimum, 2)) {
                            WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                            String modiname = addMeats.getText();
                            elementClick(addMeats, "Modifier selected - " + modiname);
                            elementClick(doneButton, "Tapped Done");
                        }


                    } catch (Exception v) {

                    }
                }

            }
            //    elementClick(finishOrderBtn,"Tapped finish Button");

        }

        return check1;
    }

    public String selectMenuForBarTabForSplitCheck(String cate) {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        getCheckNumberTxt();
        elementClick(arrowDownForOtherMenuItems, "Arrow Down");

        /*** Random Select Category ***/

        WebElement cate1 = (WebElement) driver.findElement(By.xpath(cate));
        elementClick(cate1, "Tapped category");
//            List<WebElement> categories =  driver.findElements(By.xpath()("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell");
//            int cateSize = categories.size();
//            utils.log().info("Category Available count in this Store - " + cateSize);
//
//            for (int m = 1; m <= 1; m++) {
//                itemToSelect3 = rand.nextInt(cateSize);
//
//                if (itemToSelect3 == 0) {
//                    itemToSelect3 = 1;
//                }
//
//                WebElement categoryName = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect3 + "]/XCUIElementTypeStaticText[1]");
//                String categoryNameTxt = categoryName.getText();
//                elementClick(categoryName, "Category place - " + itemToSelect3 + " Selected Category - " + categoryNameTxt);

        /****  RandOm Select Menu ***/

        WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
        check = order.getText();
        TestUtils.tableNumberof = check;
        //  utils.log().info(tableNumber+" - Table Number");
        ///XCUIElementTypeOther[2]/XCUIElementTypeCollectionView

        try {
            WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

            if (find(menuCollection1, 2)) {
                List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                int count1 = menuCollection.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 2; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }

                    utils.log().info(String.valueOf(itemToSelect1));


                    WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    utils.log().info(menu.getText());
                    elementClick(menu, "Tapped Menu");
                    try {
                        WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                        if ((mainModi.isDisplayed())) {
                            String mainModifier = mainModi.getText();
                            elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                            try {
                                WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                if (remainingModi.isDisplayed()) {
                                    String SubModifier1 = subModi1.getText();
                                    elementClick(subModi1, SubModifier1 + " - SubModifier");
                                    String SubModifier2 = subModi2.getText();
                                    elementClick(subModi2, SubModifier2 + " - SubModifier");
                                    String SubModifier3 = subModi3.getText();
                                    elementClick(subModi3, SubModifier3 + " - SubModifier");
                                    elementClick(doneButton, "Tapped Done");

                                } else {

                                }
                            } catch (Exception h) {
                                elementClick(doneButton, "Tapped Done");
                            }
                        } else {

                        }

                    } catch (Exception x) {
                        try {


                            //  utils.log().info(size2.getText());
                            WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String data = size1.getText();
                            WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                            if (size2.isDisplayed()) {
                                elementClick(size1, data + " - selected");
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String mainModi = mainModi1.getText();
                                elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                elementClick(doneButton, "Tapped Done");
                            } else {
                                WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                String mini = minimum.getText();
                                utils.log().info(mini + " - Additional Modifiers ");
                                //             if (find(minimum, 2)) {
                                WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                String modiname = addMeats.getText();
                                elementClick(addMeats, "Modifier selected - " + modiname);
                                elementClick(doneButton, "Tapped Done");
                            }

                            //          }
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                        } catch (Exception v) {

                        }
                    }


                }
            }
            // elementClick(finishOrderBtn, "Finish Button");
        } catch (Exception h) {


            List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
            int count1 = menuCollection2.size();
            Random rand1 = new Random();
            for (int j = 1; j <= 2; j++) {
                int itemToSelect1 = rand1.nextInt(count1);

                if (itemToSelect1 == 0) {
                    itemToSelect1 = 1;
                }

                utils.log().info(String.valueOf(itemToSelect1));


                WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                utils.log().info(menu.getText());
                elementClick(menu, "Tapped Menu");
                try {
                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                    if ((mainModi.isDisplayed())) {
                        String mainModifier = mainModi.getText();
                        elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                        try {
                            WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                            WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            if (remainingModi.isDisplayed()) {
                                String SubModifier1 = subModi1.getText();
                                elementClick(subModi1, SubModifier1 + " - SubModifier");
                                String SubModifier2 = subModi2.getText();
                                elementClick(subModi2, SubModifier2 + " - SubModifier");
                                String SubModifier3 = subModi3.getText();
                                elementClick(subModi3, SubModifier3 + " - SubModifier");
                                elementClick(doneButton, "Tapped Done");

                            } else {

                            }
                        } catch (Exception M) {
                            elementClick(doneButton, "Tapped Done");
                        }
                    } else {

                    }

                } catch (Exception x) {
                    try {


                        //  utils.log().info(size2.getText());
                        WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                        String data = size1.getText();
                        WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                        if (size2.isDisplayed()) {
                            elementClick(size1, data + " - selected");
                            WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String mainModi = mainModi1.getText();
                            elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                            elementClick(doneButton, "Tapped Done");
                        } else {
                            WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                            String mini = minimum.getText();
                            utils.log().info(mini + " - Additional Modifiers ");
                            //             if (find(minimum, 2)) {
                            WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                            String modiname = addMeats.getText();
                            elementClick(addMeats, "Modifier selected - " + modiname);
                            elementClick(doneButton, "Tapped Done");
                        }

                        //          }
                        ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                        ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                    } catch (Exception v) {

                    }
                }

            }
            //    elementClick(finishOrderBtn,"Tapped finish Button");

        }

        return check;
    }

    public String selectMenuForBarTabForSplitCheckMerge(String cate) {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

//        WebElement New = (WebElement) driver.findElement(By.xpath()("New Check");
//        elementClick(New, "Tapped New");
//        List<WebElement> tablee =  driver.findElements(By.xpath()("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton");
//        int count = tablee.size();
//        utils.log().info(count);
//
///****  RandOm Select Table ***/
//
//        Random rand = new Random();
//
//        for (int i = 1; i <= 1; i++) {
//            itemToSelect = rand.nextInt(count);
//
//            if (itemToSelect == 0) {
//                itemToSelect = 1;
//            }
//            utils.log().info(itemToSelect);
//            WebElement tableNum = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]");
//            String tableNumber = "T" + itemToSelect;
//
//            utils.log().info("Table Number  - " + tableNumber);
//            elementClick(tableNum, "Tapped Table Number");
//
//            WebElement seat = (WebElement) driver.findElement(By.xpath()("2");
//            seatNumber = seat.getText();
//            elementClick(seat, "Tapped seat Number");
//            TestUtils.seatNumber = seatNumber;
//            WebElement cont = (WebElement) driver.findElement(By.xpath()("Continue");
//            elementClick(cont, "Tapped continue");
        getCheckNumberTxt();
        elementClick(arrowDownForOtherMenuItems, "Arrow Down");

        /*** Random Select Category ***/

        WebElement cate1 = (WebElement) driver.findElement(By.xpath(cate));
        elementClick(cate1, "Tapped category");
//            List<WebElement> categories =  driver.findElements(By.xpath()("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell");
//            int cateSize = categories.size();
//            utils.log().info("Category Available count in this Store - " + cateSize);
//
//            for (int m = 1; m <= 1; m++) {
//                itemToSelect3 = rand.nextInt(cateSize);
//
//                if (itemToSelect3 == 0) {
//                    itemToSelect3 = 1;
//                }
//
//                WebElement categoryName = (WebElement) driver.findElements(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect3 + "]/XCUIElementTypeStaticText[1]");
//                String categoryNameTxt = categoryName.getText();
//                elementClick(categoryName, "Category place - " + itemToSelect3 + " Selected Category - " + categoryNameTxt);

        /****  RandOm Select Menu ***/

        WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
        check = order.getText();
        TestUtils.tableNumberof = check;
        //  utils.log().info(tableNumber+" - Table Number");
        ///XCUIElementTypeOther[2]/XCUIElementTypeCollectionView

        try {
            WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

            if (find(menuCollection1, 2)) {
                List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                int count1 = menuCollection.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 1; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }

                    utils.log().info(String.valueOf(itemToSelect1));


                    WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    utils.log().info(menu.getText());
                    elementClick(menu, "Tapped Menu");
                    try {
                        WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                        if ((mainModi.isDisplayed())) {
                            String mainModifier = mainModi.getText();
                            elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                            try {
                                WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                                WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                                WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                                if (remainingModi.isDisplayed()) {
                                    String SubModifier1 = subModi1.getText();
                                    elementClick(subModi1, SubModifier1 + " - SubModifier");
                                    String SubModifier2 = subModi2.getText();
                                    elementClick(subModi2, SubModifier2 + " - SubModifier");
                                    String SubModifier3 = subModi3.getText();
                                    elementClick(subModi3, SubModifier3 + " - SubModifier");
                                    elementClick(doneButton, "Tapped Done");

                                } else {

                                }
                            } catch (Exception h) {
                                elementClick(doneButton, "Tapped Done");
                            }
                        } else {

                        }

                    } catch (Exception x) {
                        try {


                            //  utils.log().info(size2.getText());
                            WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String data = size1.getText();
                            WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                            if (size2.isDisplayed()) {
                                elementClick(size1, data + " - selected");
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                                String mainModi = mainModi1.getText();
                                elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                                elementClick(doneButton, "Tapped Done");
                            } else {
                                WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                                String mini = minimum.getText();
                                utils.log().info(mini + " - Additional Modifiers ");
                                //             if (find(minimum, 2)) {
                                WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                                String modiname = addMeats.getText();
                                elementClick(addMeats, "Modifier selected - " + modiname);
                                elementClick(doneButton, "Tapped Done");
                            }

                            //          }
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                            ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                            //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                        } catch (Exception v) {

                        }
                    }


                }
            }
            // elementClick(finishOrderBtn, "Finish Button");
        } catch (Exception h) {


            List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
            int count1 = menuCollection2.size();
            utils.log().info(String.valueOf(count1));
            Random rand1 = new Random();
            for (int j = 1; j <= 1; j++) {
                int itemToSelect1 = rand1.nextInt(count1);

                if (itemToSelect1 == 0) {
                    itemToSelect1 = 1;
                }

                utils.log().info(String.valueOf(itemToSelect1));


                WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                utils.log().info(menu.getText());
                elementClick(menu, "Tapped Menu");
                try {
                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                    if ((mainModi.isDisplayed())) {
                        String mainModifier = mainModi.getText();
                        elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                        try {
                            WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
                            WebElement subModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi2 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                            WebElement subModi3 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                            if (remainingModi.isDisplayed()) {
                                String SubModifier1 = subModi1.getText();
                                elementClick(subModi1, SubModifier1 + " - SubModifier");
                                String SubModifier2 = subModi2.getText();
                                elementClick(subModi2, SubModifier2 + " - SubModifier");
                                String SubModifier3 = subModi3.getText();
                                elementClick(subModi3, SubModifier3 + " - SubModifier");
                                elementClick(doneButton, "Tapped Done");

                            } else {

                            }
                        } catch (Exception M) {
                            elementClick(doneButton, "Tapped Done");
                        }
                    } else {

                    }

                } catch (Exception x) {
                    try {


                        //  utils.log().info(size2.getText());
                        WebElement size1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                        String data = size1.getText();
                        WebElement size2 = (WebElement) driver.findElement(By.xpath("Size"));

                        if (size2.isDisplayed()) {
                            elementClick(size1, data + " - selected");
                            WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                            String mainModi = mainModi1.getText();
                            elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                            elementClick(doneButton, "Tapped Done");
                        } else {
                            WebElement minimum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                            String mini = minimum.getText();
                            utils.log().info(mini + " - Additional Modifiers ");
                            //             if (find(minimum, 2)) {
                            WebElement addMeats = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                            String modiname = addMeats.getText();
                            elementClick(addMeats, "Modifier selected - " + modiname);
                            elementClick(doneButton, "Tapped Done");
                        }

                        //          }
                        ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView
                        ////XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]
                        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]

                    } catch (Exception v) {

                    }
                }

            }
            //    elementClick(finishOrderBtn,"Tapped finish Button");

        }

        return check;
    }

    public void getTheListOfTheMenuFromTheOrderScreen() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell"));
        utils.log().info("orderMenu.size() " + orderMenu.size());
        for (int i = 2; i <= orderMenu.size(); i++) {

            WebElement orderMenuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
            orderMenuName1[i - 1] = orderMenuName.getText();
            TestUtils.orderMenuName[i - 1] = orderMenuName1[i - 1];
            WebElement orderMenuPrize1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[2]"));
            orderMenuPrize[i - 1] = orderMenuPrize1.getText();
            TestUtils.orderMenuPrize[i - 1] = orderMenuPrize[i - 1];
            utils.log().info("Order Screen menu SAME with Split Menu 1 - " + (i - 1) + " " + orderMenuName1[i - 1] + " Prize " + orderMenuPrize[i - 1]);
            try {
                List<WebElement> modifier =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
                utils.log().info(" MOdifier 1 Size - " + modifier.size());
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + m + "]/XCUIElementTypeStaticText[1]"));
                    modifierCheck1[m] = modifier1.getText();
                    TestUtils.modifier[m] = modifierCheck1[m];
                    utils.log().info("modifier1.getText() - " + modifier1.getText());
                    WebElement modifierPrize1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + m + "]/XCUIElementTypeStaticText[3]"));
                    modifierPrizeCheck1[m] = modifierPrize1.getText();
                    TestUtils.modifierPrize[m] = modifierPrizeCheck1[m];
                    utils.log().info("  TestUtils.modifierPrize[m] - " + TestUtils.modifierPrize[m]);
                    utils.log().info("Modifier  - " + m + modifierCheck1[m] + " Prize - " + modifierPrizeCheck1[m]);
                }

                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTable[2]
                List<WebElement> discount =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[2]/XCUIElementTypeCell"));
                //utils.log().info("discount.size() - "+discount.size());
                for (int h = 1; h <= discount.size(); h++) {
                    WebElement discountName1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[2]/XCUIElementTypeCell[" + h + "]/XCUIElementTypeStaticText[1]"));
                    discountName[h] = discountName1.getText();
                    TestUtils.discountName[h] = discountName[h];
                    WebElement discountCount1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[2]/XCUIElementTypeCell[" + h + "]/XCUIElementTypeStaticText[2]"));
                    discountCount[h] = discountCount1.getText();
                    TestUtils.discountCount1[h] = discountCount[h];
                    WebElement discountPrize1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[2]/XCUIElementTypeCell[" + h + "]/XCUIElementTypeStaticText[3]"));
                    discountPrize[h] = discountPrize1.getText();
                    utils.log().info("Discount 1 as - " + discountName[h] + " Qty - " + discountCount[h] + " Amount - " + discountPrize[h]);
                }
            } catch (Exception g) {

            }
//            try{
//
//
//            }catch (Exception w){
//
//            }
        }

    }

    public int seatNumberCount;

    public void getSeatNumberFromCheck() {
        List<WebElement> seatNumbers =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        seatNumberCount = seatNumbers.size();
        TestUtils.seatCount = seatNumberCount;
    }

    public int seatNumberCount1;

    public void getSeatNumberFromCheck1() {
        List<WebElement> seatNumbers =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        seatNumberCount1 = seatNumbers.size();
        TestUtils.seatCount1 = seatNumberCount1;
    }

    public void verifySeatNumberFromTheOrderScreen() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        List<WebElement> seatNumbers =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        int seatNumberCount2 = seatNumbers.size();
        String SeatCountTxt1 = String.valueOf(seatNumberCount2);
        int seat = TestUtils.seatCount;
        int seat1 = TestUtils.seatCount1;
        int seatCount = seat + seat1;
        String seatCountTxt = String.valueOf(seatCount);
        Assert.assertEquals(SeatCountTxt1, seatCountTxt);
        utils.log().info("Seat Number Count is SAME - " + seatNumberCount2);
    }

    public void verifyCheckNumber() {
        WebElement checkNumber = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"));
        String checkNumber1 = checkNumber.getText();
        String checkNumber2 = TestUtils.globalCheckNumber;
        Assert.assertEquals(checkNumber1, checkNumber2);
        utils.log().info("After Merged open check - " + checkNumber1);

    }

    public void getTheListOfTheMenuFromTheOrderScreen1() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell"));
        utils.log().info("orderMenu.size() - " + orderMenu.size());
        for (int i = 2; i <= orderMenu.size(); i++) {

            WebElement orderMenuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
            orderMenuName2[i - 1] = orderMenuName.getText();
            TestUtils.orderMenuName2[i - 1] = orderMenuName2[i - 1];

            WebElement orderMenuPrize1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[2]"));
            orderMenuPrize2[i - 1] = orderMenuPrize1.getText();
            TestUtils.orderMenuPrize2[i - 1] = orderMenuPrize2[i - 1];
            utils.log().info("Order Screen menu SAME with Split Menu 2 - " + (i - 1) + " " + orderMenuName2[i - 1] + " Prize " + orderMenuPrize2[i - 1]);
            try {
                List<WebElement> modifier =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + m + "]/XCUIElementTypeStaticText[1]"));
                    // modifieR2[m] = modifier1.getText();
                    TestUtils.modifier2[m] = modifier1.getText();
                    WebElement modifierPrize1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + m + "]/XCUIElementTypeStaticText[3]"));
                    modifierPrize2[m] = modifierPrize1.getText();
                    TestUtils.modifierPrize2[m] = modifierPrize2[m];
                    utils.log().info("Modifier 2 - " + TestUtils.modifier2[m] + " Prize - " + modifierPrize2[m]);
                }
                List<WebElement> discount =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[2]/XCUIElementTypeCell"));
                for (int h = 1; h <= discount.size(); h++) {
                    WebElement discountName1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[2]/XCUIElementTypeCell[" + h + "]/XCUIElementTypeStaticText[1]"));
                    discountName11[h] = discountName1.getText();
                    TestUtils.discountName1[h] = discountName11[h];
                    WebElement discountCount1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[2]/XCUIElementTypeCell[" + h + "]/XCUIElementTypeStaticText[2]"));
                    discountCount11[h] = discountCount1.getText();
                    TestUtils.discountCount1[h] = discountCount11[h];
                    WebElement discountPrize1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[2]/XCUIElementTypeCell[" + h + "]/XCUIElementTypeStaticText[3]"));
                    discountPrize11[h] = discountPrize1.getText();
                    TestUtils.discountPrize1[h] = discountPrize11[h];
                    utils.log().info("Discount as 2 - " + discountName11[h] + " Qty - " + discountCount11[h] + " Amount - " + discountPrize11[h]);
                }

            } catch (Exception g) {

            }
            try {


            } catch (Exception w) {

            }
        }

    }

    public String selectTheMenuFromOrderScreen(String cate) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
        elementClick(New, "Tapped New");
        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));

/****  RandOm Select Table ***/

        Random rand = new Random();

        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
            WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]"));
            String tableNumber = "T" + itemToSelect;

            utils.log().info("Table Number  - " + tableNumber);
            elementClick(tableNum, "Tapped Table Number");

            WebElement seat = (WebElement) driver.findElement(By.xpath("2"));
            seatNumber = seat.getText();
            elementClick(seat, "Tapped seat Number");
            TestUtils.seatNumber = seatNumber;
            WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
            elementClick(cont, "Tapped continue");
            getCheckNumberTxt();
            driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
            WebElement arrowDownn = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"arrow down\"])[2]"));
            elementClick(arrowDownn, "Arrow Done on iPad 1");

            /*** Random Select Category ***/
            WebElement cate1 = (WebElement) driver.findElement(By.xpath(cate));
            elementClick(cate1, "Tapped category");
            /****  RandOm Select Menu ***/

            WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
            check = order.getText();
            TestUtils.tableNumberof = check;

            try {
                WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

                if (find(menuCollection1, 2)) {
                    List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                    int count1 = menuCollection.size();
                    Random rand1 = new Random();
                    for (int j = 1; j <= 2; j++) {
                        int itemToSelect1 = rand1.nextInt(count1);

                        if (itemToSelect1 == 0) {
                            itemToSelect1 = 1;
                        }

                        utils.log().info(String.valueOf(itemToSelect1));

                        WebElement menuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                        TestUtils.menu = menuName.getText();
                        elementClick(menuName, "Tapped Menu - "+menuName.getText());

                        try {
                            WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                            if ((mainModi1.isDisplayed())) {
                                List<WebElement> mainModi10 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                                int count2 = mainModi10.size();
                                Random rand2 = new Random();
                                for (int k = 1; k <= 2; k++) {
                                    int itemToSelect2 = rand2.nextInt(count2);

                                    if (itemToSelect2 == 0) {
                                        itemToSelect2 = 1;
                                    }
                                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect2 + "]/XCUIElementTypeStaticText[1]"));
                                    elementClick(mainModi, mainModi.getText() + " - Tapped Main Modifier");
                                }
                                WebElement donee = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Done\"])[1]"));
                                elementClick(donee, "Done Selected");
                            }else{ }

                        }catch (Exception x) {
                        }
                    }
                }
            } catch (Exception h) {
                List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                int count1 = menuCollection2.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 2; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }
                    utils.log().info("Random Number - "+itemToSelect1);
                    WebElement menuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    TestUtils.menu = menuName.getText();
                    elementClick(menuName, "Tapped Menu - "+menuName.getText());

                    try {
                        WebElement mainModdii = (WebElement)  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                        if ((mainModdii.isDisplayed())) {
                            List<WebElement> mainModi =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                            int count2 = mainModi.size();
                            Random rand2 = new Random();
                            for (int jk = 1; jk <= 2; jk++) {
                                int itemToSelect2 = rand2.nextInt(count2);

                                if (itemToSelect2 == 0) {
                                    itemToSelect2 = 1;
                                }
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell["+itemToSelect2+"]/XCUIElementTypeStaticText[1]"));
                                elementClick(mainModi1, mainModi1.getText() + " - Tapped Main Modifier");
                            }

                            WebElement donee = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Done\"])[1]"));
                            elementClick(donee, "Tapped Done");
                        } else {
                        }
                    } catch (Exception M) {
                    }
                }
            }
        }
        return check;
    }


    public String selectTheMenuFromOrderScreenSplitSeat(String cate) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
        elementClick(New, "Tapped New");
        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));

/****  RandOm Select Table ***/

        Random rand = new Random();

        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
            WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]"));
            String tableNumber = "T" + itemToSelect;

            utils.log().info("Table Number  - " + tableNumber);
            elementClick(tableNum, "Tapped Table Number");

            WebElement seat = (WebElement) driver.findElement(By.xpath("1"));
            seatNumber = seat.getText();
            elementClick(seat, "Tapped seat Number");
            TestUtils.seatNumber = seatNumber;
            WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
            elementClick(cont, "Tapped continue");
            getCheckNumberTxt();
            driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
            WebElement arrowDownn = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"arrow down\"])[2]"));
            elementClick(arrowDownn, "Arrow Done on iPad 1");

            /*** Random Select Category ***/
            WebElement cate1 = (WebElement) driver.findElement(By.xpath(cate));
            elementClick(cate1, "Tapped category");
            /****  RandOm Select Menu ***/

            WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
            check = order.getText();
            TestUtils.tableNumberof = check;

            try {
                WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

                if (find(menuCollection1, 2)) {
                    List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                    int count1 = menuCollection.size();
                    Random rand1 = new Random();
                    for (int j = 1; j <= 2; j++) {
                        int itemToSelect1 = rand1.nextInt(count1);

                        if (itemToSelect1 == 0) {
                            itemToSelect1 = 1;
                        }

                        utils.log().info(String.valueOf(itemToSelect1));

                        WebElement menuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                        TestUtils.menu = menuName.getText();
                        elementClick(menuName, "Tapped Menu - "+menuName.getText());

                        try {
                            WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                            if ((mainModi1.isDisplayed())) {
                                List<WebElement> mainModi10 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                                int count2 = mainModi10.size();
                                Random rand2 = new Random();
                                for (int k = 1; k <= 1; k++) {
                                    int itemToSelect2 = rand2.nextInt(count2);

                                    if (itemToSelect2 == 0) {
                                        itemToSelect2 = 1;
                                    }
                                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect2 + "]/XCUIElementTypeStaticText[1]"));
                                    elementClick(mainModi, mainModi.getText() + " - Tapped Main Modifier");
                                }
                                WebElement donee = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Done\"])[1]"));
                                elementClick(donee, "Done Selected");
                            }else{ }

                        }catch (Exception x) {
                        }
                    }
                }
            } catch (Exception h) {
                List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                int count1 = menuCollection2.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 2; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }
                    utils.log().info("Random Number - "+itemToSelect1);
                    WebElement menuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    TestUtils.menu = menuName.getText();
                    elementClick(menuName, "Tapped Menu - "+menuName.getText());

                    try {
                        WebElement mainModdii = (WebElement)  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                        if ((mainModdii.isDisplayed())) {
                            List<WebElement> mainModi =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                            int count2 = mainModi.size();
                            Random rand2 = new Random();
                            for (int jk = 1; jk <= 1; jk++) {
                                int itemToSelect2 = rand2.nextInt(count2);

                                if (itemToSelect2 == 0) {
                                    itemToSelect2 = 1;
                                }
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell["+itemToSelect2+"]/XCUIElementTypeStaticText[1]"));
                                elementClick(mainModi1, mainModi1.getText() + " - Tapped Main Modifier");
                            }

                            WebElement donee = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Done\"])[1]"));
                            elementClick(donee, "Tapped Done");
                        } else {
                        }
                    } catch (Exception M) {
                    }
                }
            }
        }
        return check;
    }

    public String selectTheMenuFromOrderScreenSplitSeatForMerge(String cate) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
        elementClick(New, "Tapped New");
        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));

/****  RandOm Select Table ***/

        Random rand = new Random();

        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
            WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]"));
            String tableNumber = "T" + itemToSelect;

            utils.log().info("Table Number  - " + tableNumber);
            elementClick(tableNum, "Tapped Table Number");

            WebElement seat = (WebElement) driver.findElement(By.xpath("1"));
            seatNumber = seat.getText();
            elementClick(seat, "Tapped seat Number");
            TestUtils.seatNumber = seatNumber;
            WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
            elementClick(cont, "Tapped continue");
            getCheckNumberTxt();
            driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
            WebElement arrowDownn = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"arrow down\"])[2]"));
            elementClick(arrowDownn, "Arrow Done on iPad 1");

            /*** Random Select Category ***/
            WebElement cate1 = (WebElement) driver.findElement(By.xpath(cate));
            elementClick(cate1, "Tapped category");
            /****  RandOm Select Menu ***/

            WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
            check = order.getText();
            TestUtils.tableNumberof = check;

            try {
                WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

                if (find(menuCollection1, 2)) {
                    List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                    int count1 = menuCollection.size();
                    Random rand1 = new Random();
                    for (int j = 1; j <= 1; j++) {
                        int itemToSelect1 = rand1.nextInt(count1);

                        if (itemToSelect1 == 0) {
                            itemToSelect1 = 1;
                        }

                        utils.log().info(String.valueOf(itemToSelect1));

                        WebElement menuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                        TestUtils.menu = menuName.getText();
                        elementClick(menuName, "Tapped Menu - "+menuName.getText());

                        try {
                            WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                            if ((mainModi1.isDisplayed())) {
                                List<WebElement> mainModi10 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                                int count2 = mainModi10.size();
                                Random rand2 = new Random();
                                for (int k = 1; k <= 1; k++) {
                                    int itemToSelect2 = rand2.nextInt(count2);

                                    if (itemToSelect2 == 0) {
                                        itemToSelect2 = 1;
                                    }
                                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect2 + "]/XCUIElementTypeStaticText[1]"));
                                    elementClick(mainModi, mainModi.getText() + " - Tapped Main Modifier");
                                }
                                WebElement donee = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Done\"])[1]"));
                                elementClick(donee, "Done Selected");
                            }else{ }

                        }catch (Exception x) {
                        }
                    }
                }
            } catch (Exception h) {
                List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                int count1 = menuCollection2.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 1; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }
                    utils.log().info("Random Number - "+itemToSelect1);
                    WebElement menuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    TestUtils.menu = menuName.getText();
                    elementClick(menuName, "Tapped Menu - "+menuName.getText());

                    try {
                        WebElement mainModdii = (WebElement)  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                        if ((mainModdii.isDisplayed())) {
                            List<WebElement> mainModi =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                            int count2 = mainModi.size();
                            Random rand2 = new Random();
                            for (int jk = 1; jk <= 1; jk++) {
                                int itemToSelect2 = rand2.nextInt(count2);

                                if (itemToSelect2 == 0) {
                                    itemToSelect2 = 1;
                                }
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell["+itemToSelect2+"]/XCUIElementTypeStaticText[1]"));
                                elementClick(mainModi1, mainModi1.getText() + " - Tapped Main Modifier");
                            }

                            WebElement donee = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Done\"])[1]"));
                            elementClick(donee, "Tapped Done");
                        } else {
                        }
                    } catch (Exception M) {
                    }
                }
            }
        }
        return check;
    }

    public String selectTheMenuFromOrderScreenSplitSeat1(String cate) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
        elementClick(New, "Tapped New");
        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));

/****  RandOm Select Table ***/

        Random rand = new Random();

        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
            WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]"));
            String tableNumber = "T" + itemToSelect;

            utils.log().info("Table Number  - " + tableNumber);
            elementClick(tableNum, "Tapped Table Number");

            WebElement seat = (WebElement) driver.findElement(By.xpath("1"));
            seatNumber = seat.getText();
            elementClick(seat, "Tapped seat Number");
            TestUtils.seatNumber = seatNumber;
            WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
            elementClick(cont, "Tapped continue");
            getCheckNumberTxt1();
            driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
            WebElement arrowDownn = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"arrow down\"])[2]"));
            elementClick(arrowDownn, "Arrow Done on iPad 1");

            /*** Random Select Category ***/
            WebElement cate1 = (WebElement) driver.findElement(By.xpath(cate));
            elementClick(cate1, "Tapped category");
            /****  RandOm Select Menu ***/

            WebElement order = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
            check = order.getText();
            TestUtils.tableNumberof1 = check;

            try {
                WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]"));

                if (find(menuCollection1, 2)) {
                    List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
                    int count1 = menuCollection.size();
                    Random rand1 = new Random();
                    for (int j = 1; j <= 1; j++) {
                        int itemToSelect1 = rand1.nextInt(count1);

                        if (itemToSelect1 == 0) {
                            itemToSelect1 = 1;
                        }

                        utils.log().info(String.valueOf(itemToSelect1));

                        WebElement menuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                        TestUtils.menu = menuName.getText();
                        elementClick(menuName, "Tapped Menu - "+menuName.getText());

                        try {
                            WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                            if ((mainModi1.isDisplayed())) {
                                List<WebElement> mainModi10 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                                int count2 = mainModi10.size();
                                Random rand2 = new Random();
                                for (int k = 1; k <= 1; k++) {
                                    int itemToSelect2 = rand2.nextInt(count2);

                                    if (itemToSelect2 == 0) {
                                        itemToSelect2 = 1;
                                    }
                                    WebElement mainModi = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect2 + "]/XCUIElementTypeStaticText[1]"));
                                    elementClick(mainModi, mainModi.getText() + " - Tapped Main Modifier");
                                }
                                WebElement donee = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Done\"])[1]"));
                                elementClick(donee, "Done Selected");
                            }else{ }

                        }catch (Exception x) {
                        }
                    }
                }
            } catch (Exception h) {
                List<WebElement> menuCollection2 =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                int count1 = menuCollection2.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 1; j++) {
                    int itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }
                    utils.log().info("Random Number - "+itemToSelect1);
                    WebElement menuName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
                    TestUtils.menu = menuName.getText();
                    elementClick(menuName, "Tapped Menu - "+menuName.getText());

                    try {
                        WebElement mainModdii = (WebElement)  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                        if ((mainModdii.isDisplayed())) {
                            List<WebElement> mainModi =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
                            int count2 = mainModi.size();
                            Random rand2 = new Random();
                            for (int jk = 1; jk <= 1; jk++) {
                                int itemToSelect2 = rand2.nextInt(count2);

                                if (itemToSelect2 == 0) {
                                    itemToSelect2 = 1;
                                }
                                WebElement mainModi1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell["+itemToSelect2+"]/XCUIElementTypeStaticText[1]"));
                                elementClick(mainModi1, mainModi1.getText() + " - Tapped Main Modifier");
                            }

                            WebElement donee = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeButton[@name=\"Done\"])[1]"));
                            elementClick(donee, "Tapped Done");
                        } else {
                        }
                    } catch (Exception M) {
                    }
                }
            }
        }
        return check1;
    }

    public void selectTheCheckFromTableLayout() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String tableNo = TestUtils.tableNumberof;
        //    verifyTableMerge(tableNo);
        verifyTableMergee2(tableNo);
    }

    public void clickTheCheckFromTheTableLayoutForMerged() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String tableNo = TestUtils.tableNumberof;
        verifyTableMergee2(tableNo);
    }

    public void clickTheCheckFromTheTableLayoutForMerged1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String tableNo = TestUtils.tableNumberof1;
        verifyTableMergee3(tableNo);
    }

    @FindBy(name = "Split Check")
    WebElement splitCheckBtn;

    public void verifySplitCheckScren() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(splitCheckBtn.getText(), "Split Check");
        utils.log().info("Displayed Screen as - " + splitCheckBtn.getText());
    }

    public void verifyTableMergee2(String m) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        utils.log().info("m - " + m);
//    String data = m.replaceAll("[A-Z ]", "");
//    utils.log().info("Table num after regex - " + data);

        WebElement tableSelect = (WebElement) driver.findElement(By.xpath(m));
        if (tableSelect.isDisplayed()) {                                                                     //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[15]
//            WebElement seatt = BasePage1.mergeAndFindMobileElement12("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + data + "]", "", TestUtils.XPath);
//            String number1 = seatt.getText();
            Thread.sleep(100);
            elementClick(tableSelect, "Selected Table - " + tableSelect.getText());
            try {
                WebElement checks = (WebElement) driver.findElement(By.xpath("Checks"));

                if (checks.isDisplayed()) {
                    Thread.sleep(200);
                    String globalCheckNumber = TestUtils.globalCheckNumber;
                    //utils.log().info("Tapped Merging checks - " + globalCheckNumber);
                    WebElement checkNumberrr = (WebElement) driver.findElement(By.xpath(globalCheckNumber));
                    if (checkNumberrr.isDisplayed()) {
                        elementClick(checkNumberrr, "Selected Check Number - " + checkNumberrr.getText());
                    } else {

                    }
                    WebElement x = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeButton[@name=\"X\"]"));
                    if (x.isDisplayed()) {
                        elementClick(x, "Tapped X Button");
                    } else {
                    }
                } else {
                    WebElement table1 = (WebElement) driver.findElement(By.xpath(m));
                    elementClick(table1, "table SELECTED - " + m);
                }
            } catch (Exception w) {

            }
        }
    }

    public void verifyTableMergee3(String m) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        utils.log().info("m - " + m);
//    String data = m.replaceAll("[A-Z ]", "");
//    utils.log().info("Table num after regex - " + data);

        WebElement tableSelect = (WebElement) driver.findElement(By.xpath(m));
        if (tableSelect.isDisplayed()) {                                                                     //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[15]
//            WebElement seatt = BasePage1.mergeAndFindMobileElement12("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + data + "]", "", TestUtils.XPath);
//            String number1 = seatt.getText();
            Thread.sleep(100);
            elementClick(tableSelect, "Selected Table - " + tableSelect.getText());
            try {
                WebElement checks = (WebElement) driver.findElement(By.xpath("Checks"));

                if (checks.isDisplayed()) {
                    Thread.sleep(200);
                    String globalCheckNumber = TestUtils.globalCheckNumber1;
                    //utils.log().info("Tapped Merging checks - " + globalCheckNumber);
                    WebElement checkNumberrr = (WebElement) driver.findElement(By.xpath(globalCheckNumber));
                    if (checkNumberrr.isDisplayed()) {
                        elementClick(checkNumberrr, "Selected Check Number - " + checkNumberrr.getText());
                    } else {
                    }
                    WebElement x = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeButton[@name=\"X\"]"));
                    if (x.isDisplayed()) {
                        elementClick(x, "Tapped X Button");
                    } else {
                    }
                } else {
                    WebElement table1 = (WebElement) driver.findElement(By.xpath(m));
                    elementClick(table1, "table SELECTED - " + m);
                }
            } catch (Exception w) {

            }
        }
    }

    public void verifyActiveCheckWithSplitCheck() {
        WebElement activeCheck = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText"));
        String expectedActiveChecks = activeCheck.getText();
        String actualActiveChecks = TestUtils.globalCheckNumber;
        Assert.assertEquals(expectedActiveChecks, actualActiveChecks);
        utils.log().info("Split Check - " + expectedActiveChecks);
    }

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Add\"]")
    WebElement addBtnSplitCheck;

    public void clickAddButtonOntheSplitCheckScreen() {
        elementClick(addBtnSplitCheck, "Selected Add Button");
    }


    public void VerifyNewCheckAddedOnTheSplitCheckScreen() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement checkSeat = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText"));
        String checkSeatTxt = checkSeat.getText();
        Assert.assertEquals(checkSeatTxt, "Check");
        utils.log().info("Extra one Checks is ADDED");


    }

    public void ClickTheMenuOnTheSplitCheckScreen() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement menuItem = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
        elementClick(menuItem, "Selected Menu Item As - " + menuItem.getText());
        TestUtils.menuNameSplitCheck = menuItem.getText();
    }

    public void ClickTheMenuOnTheNewSplitSeatScreen() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement menuItem = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
        elementClick(menuItem, "Selected Menu Item As - " + menuItem.getText());
        TestUtils.menuNameSplitCheck = menuItem.getText();
    }

    public void clickNewCheckOnTheSplitCheckScreen() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement checkSeat = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText"));
        elementClick(checkSeat, "Selected Added Check");
    }

    public void verifyTheMenuIsMovedToTheAddedCheckSeat() {
        List<WebElement> checkMenu =  driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell"));
        for (int i = 1; i <= checkMenu.size(); i++) {
            WebElement menuNames = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
            String menuNameTxt = menuNames.getText();
            Assert.assertEquals(menuNameTxt, TestUtils.menuNameSplitCheck);
            utils.log().info("Menu item is Same - " + menuNames.getText());
        }
    }

    @FindBy(name = "Please save all the changes to print. Do you wish to save the changes?")
    WebElement pleaseSaveAllTheChangesPopup;

    public void verifyThePleaseSaveAlltheChangesToPrintPopup() {
        Assert.assertEquals(pleaseSaveAllTheChangesPopup.getText(), "Please save all the changes to print. Do you wish to save the changes?");
    }

    public void verifyCheckNumberIsSplittedAndCheckNumberIsIncreased() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement checkNumber = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText"));
        String IncreasedCheckNumber = checkNumber.getText();
        TestUtils.globalCheckNumber1 = IncreasedCheckNumber;
        String IncreasedCheckNumberTxt = IncreasedCheckNumber.replaceAll("[A-Za-z- ]", "");
        int checkNumberrr = Integer.parseInt(IncreasedCheckNumberTxt);
        WebElement CheckNumber1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText"));
        String defaultCheckNumber = CheckNumber1.getText();
        String defaultCheckNumberTxt = defaultCheckNumber.replaceAll("[A-Za-z- ]", "");
        int defaultCheckNumberrrr = Integer.parseInt(defaultCheckNumberTxt);
        int increaedNumber = defaultCheckNumberrrr + 1;
        Assert.assertEquals(increaedNumber, checkNumberrr);
        utils.log().info("Split Check Number - " + IncreasedCheckNumber);

    }

    public void verifyPrimaryCheckIsOpened() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement checkNumber = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"));
        Assert.assertEquals((checkNumber.getText()), TestUtils.globalCheckNumber);
        utils.log().info("Primary Check is SAME After Split Check - " + checkNumber.getText());
    }

    public void selectMenuCloudPOSSs(String category) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        for (int o = 1; o <= 180; o++) {
            utils.log().info("Sync - " + o);

            elementClick(newTab, "Tapped new Tab");
            getCheckNumberTxt();
            elementClick(arrowDownForOtherMenuItems, "Arrow Down");

            /**** Random Select Category ****/

            WebElement cate = (WebElement) driver.findElement(By.xpath(category));
            elementClick(cate, "Tapped category");

            /*****  RandOm Select Menu ****/

            WebElement menuCollection1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]"));

            if (find(menuCollection1, 2)) {
                List<WebElement> menuCollection =  driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell"));

                int count1 = menuCollection.size();
                Random rand1 = new Random();
                for (int j = 1; j <= 4; j++) {
                    itemToSelect1 = rand1.nextInt(count1);

                    if (itemToSelect1 == 0) {
                        itemToSelect1 = 1;
                    }

                    utils.log().info(String.valueOf(itemToSelect1));

                    WebElement menu = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));

                    elementClick(menu, "Tapped Menu " + menu.getText());
                }
            }


            elementClick(cashPayment, "Tapped Cash");
            elementClick(Exact, "Exact ");
            elementClick(Enter, "Enter ");
        }
    }

    public void createdSaleForCashierOut1(String Cate) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT, TimeUnit.SECONDS);

        elementClick(cancelBtn, "Closed the Order Type window");
        WebElement cashierName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[5]/XCUIElementTypeStaticText[1]"));
        String name = (cashierName.getText()).substring(9);
        utils.log().info("Cashier Name - " + name);
        TestUtils.cashier_Name1 = name;

        elementClick(allBtn, "Selected All");
        elementClick(tableLayoutTab, "Table Layout");

        for (int i = 1; i <= 1; i++) {
            utils.log().info("Sale Count - " + i);


            selectMenuForDineOrderType(Cate);
//        elementClick(finishOrderBtn,"Finish Button");
            elementClick(cash, "Cash Button");
            elementClick(Exact, "Exact Button");
            elementClick(enter, "Enter Button");
            elementClick(tableLayoutTab, "Selected Table Layout Screen");
        }

        for (int i = 1; i <= 1; i++) {
            utils.log().info("Active Sale Count - " + i);
            selectMenuForDineOrderType(Cate);
            elementClick(finishOrderBtn, "Finish Button");

        }

    }


    public void createdSaleForCashierOut2(String Cate) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT, TimeUnit.SECONDS);

        elementClick(cancelBtn, "Cancel selected");
        WebElement cashierName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[5]/XCUIElementTypeStaticText[1]"));
        String name = (cashierName.getText()).substring(9);
        utils.log().info("Cashier Name - " + name);
        TestUtils.cashier_Name2 = name;

        elementClick(allBtn, "Selected All");
        elementClick(tableLayoutTab, "Table Layout");

        for (int i = 1; i <= 1; i++) {
            utils.log().info("Sale Count - " + i);


            selectMenuForDineOrderType(Cate);
//            elementClick(finishOrderBtn,"Finish Button");
            elementClick(cash, "Cash Button");
            elementClick(Exact, "Exact Button");
            elementClick(enter, "Enter Button");
            elementClick(tableLayoutTab, "Selected Table Layout Screen");
        }

        for (int i = 1; i <= 1; i++) {
            utils.log().info("Sale Count - " + i);

//            elementClick(tableLayoutTab,"Selected Table Layout Screen");
            selectMenuForDineOrderType(Cate);
            elementClick(finishOrderBtn, "Finish Button");

        }
    }

    public void createdSaleForCashierOut3(String cate) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT, TimeUnit.SECONDS);
        elementClick(cancelBtn, "Cancel selected");
        WebElement cashierName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[5]/XCUIElementTypeStaticText[1]"));
        String name = (cashierName.getText()).substring(9);
        utils.log().info("Cashier Name - " + name);
        TestUtils.cashier_Name3 = name;
        elementClick(allBtn, "Selected All");
        elementClick(tableLayoutTab, "Table Layout");

        for (int i = 1; i <= 1; i++) {
            utils.log().info("Sale Count - " + i);

//            elementClick(tableLayoutTab,"Selected Table Layout Screen");
            selectMenuForDineOrderType(cate);
//            elementClick(finishOrderBtn,"Finish Button");
            elementClick(cash, "Cash Button");
            elementClick(Exact, "Exact Button");
            elementClick(enter, "Enter Button");
            elementClick(tableLayoutTab, "Selected Table Layout Screen");

        }

        for (int i = 1; i <= 1; i++) {
            utils.log().info("Sale Count - " + i);

//            elementClick(tableLayoutTab,"Selected Table Layout Screen");
            selectMenuForDineOrderType(cate);
            elementClick(finishOrderBtn, "Finish Button");

        }
    }

    public void createdSaleForCashierOut4(String Cate) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT, TimeUnit.SECONDS);
        elementClick(cancelBtn, "Cancel selected");
        WebElement cashierName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[5]/XCUIElementTypeStaticText[1]"));
        String name = (cashierName.getText()).substring(9);
        utils.log().info("Cashier Name - " + name);
        TestUtils.cashier_Name4 = name;
        elementClick(allBtn, "Selected All");
        elementClick(tableLayoutTab, "Table Layout");

        for (int i = 1; i <= 1; i++) {
            utils.log().info("Sale Count - " + i);

//            elementClick(tableLayoutTab,"Selected Table Layout Screen");
            selectMenuForDineOrderType(Cate);
//            elementClick(finishOrderBtn,"Finish Button");
            elementClick(cash, "Cash Button");
            elementClick(Exact, "Exact Button");
            elementClick(enter, "Enter Button");
            elementClick(tableLayoutTab, "Selected Table Layout Screen");
        }

        for (int i = 1; i <= 1; i++) {
            utils.log().info("Sale Count - " + i);

//            elementClick(tableLayoutTab,"Selected Table Layout Screen");
            selectMenuForDineOrderType(Cate);
            elementClick(finishOrderBtn, "Finish Button");

        }
    }

    public void createdSaleForCashierOut5(String Cate) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT, TimeUnit.SECONDS);
        elementClick(cancelBtn, "Cancel selected");
        WebElement cashierName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[5]/XCUIElementTypeStaticText[1]"));
        String name = (cashierName.getText()).substring(9);
        utils.log().info("Cashier Name - " + name);
        TestUtils.cashier_Name5 = name;
        elementClick(allBtn, "Selected All");
        elementClick(tableLayoutTab, "Table Layout");

        for (int i = 1; i <= 1; i++) {
            utils.log().info("Sale Count - " + i);

//            elementClick(tableLayoutTab,"Selected Table Layout Screen");
            selectMenuForDineOrderType(Cate);
//            elementClick(finishOrderBtn,"Finish Button");
            elementClick(cash, "Cash Button");
            elementClick(Exact, "Exact Button");
            elementClick(enter, "Enter Button");
            elementClick(tableLayoutTab, "Selected Table Layout Screen");
        }

        for (int i = 1; i <= 1; i++) {
            utils.log().info("Sale Count - " + i);

//            elementClick(tableLayoutTab,"Selected Table Layout Screen");
            selectMenuForDineOrderType(Cate);
            elementClick(finishOrderBtn, "Finish Button");

        }
    }

    public void selectTheRandomTableFromTheTableLayout() {
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT, TimeUnit.SECONDS);
        WebElement New = (WebElement) driver.findElement(By.xpath("New Check"));
        elementClick(New, "Tapped New");
        List<WebElement> tablee =  driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));

/****  RandOm Select Table ***/

        Random rand = new Random();

        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
            WebElement tableNum = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[" + itemToSelect + "]/XCUIElementTypeStaticText[2]"));
            String tableNumber = "T" + itemToSelect;

            utils.log().info("Table Number  - " + tableNumber);
            elementClick(tableNum, "Tapped Table Number");

            WebElement seat = (WebElement) driver.findElement(By.xpath("1"));
            seatNumber = seat.getText();
            elementClick(seat, "Tapped seat Number");
            TestUtils.seatNumber = seatNumber;
            WebElement cont = (WebElement) driver.findElement(By.xpath("Continue"));
            elementClick(cont, "Tapped continue");
            getCheckNumberTxt1();
        }

    }



    public void verifyTip1ValueWithCardDetailsScreenValue(){
        WebElement tipValue = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(tipValue.getText().replaceAll("[A-Z$ ,.]",""),TestUtils.tipAmount1.replaceAll("[A-Z$ ,.]",""));
        utils.log().info("Tip Value Same With Card Details Screen - "+tipValue.getText());
    }

    public void verifyPaidAmountValueWithCardDetailsScreenValue(){
        WebElement paidAmountValue = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[14]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(paidAmountValue.getText().replaceAll("[A-Z$ ,.]",""),TestUtils.paidAmount.replaceAll("[A-Z$ ,.]",""));

        utils.log().info("Paid Amount Value Same With Card Details Screen - "+paidAmountValue.getText());
    }

    public void verifyCardReaderIsNotConnectedPopup(){
        WebElement cardReader = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]"));
        org.testng.Assert.assertEquals(cardReader.getText(),"Card reader is not connected");
        utils.log().info("Displayed - "+cardReader.getText());
    }

    public void getTheCardNameOnTheCardDetailScreen(){
        WebElement getTheCardName = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeImage"));
        utils.log().info("Card Name - "+getTheCardName.getText());
    }

    public void verifyManualClearProcessButtonIsEnabledOrNot(){
        WebElement manualButton = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeButton[@name=\"Manual\"]"));
        WebElement ClearButton = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeButton[@name=\"Clear\"]"));
        WebElement ProcessEmvButton = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeButton[@name=\"Process EMV\"]"));

        if(manualButton.isEnabled() && ClearButton.isEnabled() && ProcessEmvButton.isEnabled()){
            utils.log().info("Manual , Clear , Process EMV Button is Enabled");
        }else{
            utils.log().info("Manual , Clear , Process EMV Button is NOT Enabled");
            int i =1/0;
        }
    }


    public void VerifiedPayAmountWithAllDataInTheCardDetailScreen(){

        double serviceCharge = Double.parseDouble(TestUtils.ServiceCharge.replaceAll("[A-Z$, ]",""));

        double tipValue = Double.parseDouble(TestUtils.tipAmount.replaceAll("[A-Z$, ]",""));

        double checkTotal = Double.parseDouble(TestUtils.totalTxt.replaceAll("[A-Z$, ]",""));

        double payAmount1 = checkTotal +  tipValue;
        double cardAmount = checkTotal+serviceCharge;
        DecimalFormat ss = new DecimalFormat("0.00");
        TestUtils.amountForSale = ss.format(cardAmount);
        utils.log().info("Amount for Sale - "+ss.format(cardAmount));
//        utils.log().info("Calculation subTotal - "+ (ss.format(subTotal)));
//        utils.log().info("Calculation tax - "+(ss.format(tax)));
        utils.log().info("Calculation check total - "+(ss.format(checkTotal)));
        utils.log().info("Calculation service charge - "+(ss.format(serviceCharge)));
        utils.log().info("Calculation tipValue - "+ss.format(tipValue));
        utils.log().info("Calculation PayAmount - "+ss.format(payAmount1));

        org.testng.Assert.assertEquals(ss.format(payAmount1).replaceAll("[A-Z$,. ]",""),TestUtils.payAmount.replaceAll("[A-Z$,. ]",""));
        utils.log().info("Calculation Pay Amount is Same With the Card details Screen Pay amount - "+payAmount1);

    }

    public void verifyPayAmountWithTipAmountOnCardDetailsScreen(){
        double calculatedPayAmount = Double.parseDouble(TestUtils.tipTotal.replaceAll("[$ ]",""));
        DecimalFormat dc = new DecimalFormat("0.00");
        WebElement payAmount = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]"));
        String payAmountTxt = payAmount.getText();
        utils.log().info("Need to Pay AMount " +payAmountTxt);
        Assert.assertEquals(dc.format(calculatedPayAmount),payAmountTxt.replaceAll("[$ ]",""));
        utils.log().info("Pay Amount is Same with Tip Screen amount - "+payAmountTxt);
    }

    public void verifyDiscountValueWithCardDetailsScreenValue(){
        WebElement discountValue = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(discountValue.getText().replaceAll("[A-Z$ ,.]",""),TestUtils.discountTxt.replaceAll("[A-Z$ ,.]",""));
        utils.log().info("Subtotal Value Same With Card Details Screen - "+discountValue.getText());

    }

    public void verifyPaidAmountValueIsZero(){
        WebElement paidAmount = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[14]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(paidAmount.getText().replaceAll("[A-Z$., ]",""),"000");
        utils.log().info(" paid amount is Zero - "+paidAmount.getText());
    }


    public void verifyTipValueWithCardDetailsScreenValue(){
        WebElement tipValue = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(tipValue.getText().replaceAll("[A-Z$ ,.]",""),TestUtils.tipAmount.replaceAll("[A-Z$ ,.]",""));
        utils.log().info("Tip Value Same With Card Details Screen - "+tipValue.getText());
    }

    public void shouldSeeTheCardDetailsEntryScreen(){
        WebElement cardDetailsScreen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        org.testng.Assert.assertEquals(cardDetailsScreen.getText(),"Your Order");
        utils.log().info("Card Details Entry Screen - "+cardDetailsScreen.getText());
    }

    public void verifySubtotalTaxAndTotalValueWithCardDetailsScreenValue(){
        WebElement subtotal = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(subtotal.getText().replaceAll("[A-Z$ ,.]",""), TestUtils.subtotalTxt.replaceAll("[A-Z$ ,.]",""));
        utils.log().info("Subtotal Value Same With Card Details Screen - "+subtotal.getText());
        WebElement tax = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(tax.getText().replaceAll("[A-Z$ ,.]",""), TestUtils.taxTxt.replaceAll("[A-Z$ ,.]",""));
        utils.log().info("Tax Value Same With Card Details Screen - "+tax.getText());
        WebElement serviceCharge = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeStaticText[2]"));
        TestUtils.ServiceCharge = serviceCharge.getText();
        utils.log().info("Service Charge - "+serviceCharge.getText());
        WebElement CheckTotal = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[12]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(CheckTotal.getText().replaceAll("[A-Z$ ,.]",""), TestUtils.totalTxt.replaceAll("[A-Z$ ,.]",""));
        utils.log().info("Total Value Same With Card Details Screen - "+CheckTotal.getText());
    }

    public void verifySubtotalTaxAndTotalValueWithCardDetailsScreenValue1(){
        WebElement subtotal = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(subtotal.getText().replaceAll("[A-Z$ ,.]",""), TestUtils.subtotalTxt.replaceAll("[A-Z$ ,.]",""));
        utils.log().info("Subtotal Value Same With Card Details Screen - "+subtotal.getText());
        WebElement tax = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(tax.getText().replaceAll("[A-Z$ ,.]",""), TestUtils.taxTxt.replaceAll("[A-Z$ ,.]",""));
        utils.log().info("Tax Value Same With Card Details Screen - "+tax.getText());
        WebElement serviceCharge = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeStaticText[2]"));
        TestUtils.ServiceCharge = serviceCharge.getText();
        utils.log().info("Service Charge - "+serviceCharge.getText());
        WebElement CheckTotal = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[12]/XCUIElementTypeStaticText[2]"));
        double fastCashAmount = Double.parseDouble(TestUtils.fastCash.replaceAll("[$ ]",""));
        double paidAmount = Double.parseDouble(TestUtils.paidAmount1.replaceAll("[$ ]",""));
        double totalTxt = fastCashAmount - paidAmount ;
        double totalAmount = Double.parseDouble(TestUtils.totalTxt.replaceAll("[$ ]",""));
        double totalTxt1 = totalAmount - totalTxt;
        utils.log().info(String.valueOf(totalTxt1));
        DecimalFormat dc = new DecimalFormat("0.00");

        org.testng.Assert.assertEquals(CheckTotal.getText().replaceAll("[A-Z$ ]",""), dc.format(totalTxt1));
        TestUtils.totalTxt1 = dc.format(totalTxt1);
        utils.log().info("Total Value Same With Card Details Screen - "+CheckTotal.getText());
    }

    public void verifySubtotalTaxAndTotal1ValueWithCardDetailsScreenValue(){
        WebElement subtotal = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(subtotal.getText().replaceAll("[A-Z$ ,.]",""), TestUtils.subtotalTxt.replaceAll("[A-Z$ ,.]",""));
        utils.log().info("Subtotal Value Same With Card Details Screen - "+subtotal.getText());
        WebElement tax = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(tax.getText().replaceAll("[A-Z$ ,.]",""), TestUtils.taxTxt.replaceAll("[A-Z$ ,.]",""));
        utils.log().info("Tax Value Same With Card Details Screen - "+tax.getText());
        WebElement serviceCharge = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeStaticText[2]"));
        TestUtils.ServiceCharge1 = serviceCharge.getText();
        utils.log().info("Service Charge - "+serviceCharge.getText());
        WebElement CheckTotal = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[12]/XCUIElementTypeStaticText[2]"));
        org.testng.Assert.assertEquals(CheckTotal.getText().replaceAll("[A-Z$ ,.]",""), TestUtils.totalTxt.replaceAll("[A-Z$ ,.]",""));
        utils.log().info("Total Value Same With Card Details Screen - "+CheckTotal.getText());
    }

    public void getThePayAmountValueOnTheCardDetailsScreen(){
        WebElement payAmount = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]"));
        String payAmountTxt = payAmount.getText();
        utils.log().info("Need to Pay AMount " +payAmountTxt);
        TestUtils.payAmount = payAmountTxt;
    }

    public void getThePayAmount1ValueOnTheCardDetailsScreen(){
        WebElement payAmount = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]"));
        String payAmountTxt = payAmount.getText();
        utils.log().info("Need to Pay AMount " +payAmountTxt);
        TestUtils.payAmount1 = payAmountTxt;
    }

    public void shouldSeeTipScreen(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement checkTotal = (WebElement) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Check Total\"])[1]"));
        org.testng.Assert.assertEquals(checkTotal.getText(),"Check Total");
        utils.log().info("Tip Screen is displayed");
    }

    public void selectTipFromTheTipScreen() throws InterruptedException {
        Thread.sleep(2500);

        WebElement tipAmount1 = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[9]"));
        String tipAmount1Txt = tipAmount1.getText();
        utils.log().info("Tip Amount - "+tipAmount1.getText());
//        Assert.assertEquals(tipTxt,tipAmount1Txt);
        TestUtils.tipAmount = tipAmount1Txt;
        elementClick(tipAmount1,"Selected TIP as - "+tipAmount1.getText());
    }
    public void shouldSeeBatchScreen() throws InterruptedException {
       Thread.sleep(2000);
        WebElement batchScreen = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[6]//XCUIElementTypeOther/XCUIElementTypeStaticText[1]"));
        Assert.assertEquals(batchScreen.getText(),"Last Batch Started");
        utils.log().info("Displayed Screen as- "+"Last Batch Started");
    }
    @FindBy (name = "Power button")
    private WebElement powerBtn;

    public void checkAllTheCheckHasBeenBatch() throws Exception {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement checkNumber = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"));
        String checkNumberTxt = checkNumber.getText();
        int number = Integer.parseInt(checkNumberTxt);
        utils.log().info("Current Check count on batch screen - "+checkNumberTxt);
        if(number != 0){
            elementClick(ToggleIcon,"Selected - "+ToggleIcon.getText());
            Thread.sleep(2000);
            elementClick(batchTipAdjustBtn,"selected Btn as - "+batchTipAdjustBtn.getText());
            clickDeviceDropDownButtonBatchScreen();
            selectTheMppgPaymentInDevice();
            shouldSeeBatchScreen();
            checkAllTheCheckHasBeenBatch();
        }else{
            Thread.sleep(1000);
            WebElement batchStatus = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeStaticText"));
            utils.log().info("Batch Status Should - "+batchStatus.getText());
            elementClick(powerBtn,"Selected - "+powerBtn.getText());
        }
    }

    @FindBy(name = "Cashier out saved successfully")
    WebElement cashierOutSavedSuccessfullyPopup;
    @FindBy(name = "Done")
    private WebElement Done1;

    public void verifyTheCannotCloseTheShiftStoreHaveTheActiveCheck() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try {
            if (cashierOutSavedSuccessfullyPopup.isDisplayed()) {
                utils.log().info("Displayed Popup as - " + cashierOutSavedSuccessfullyPopup.getText());
                elementClick(Done1, "Tapped Done Button on the Popup");
            }
        } catch (Exception z) {
            WebElement cashBtn = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeButton[@name=\"Cash\"]"));
            elementClick(cashBtn, "Selected - " + cashBtn.getText());
            utils.log().info("Displayed Popup as - " + cashierOutSavedSuccessfullyPopup.getText());
            elementClick(Done1, "Tapped Done Button on the Popup");
        }
    }
}

