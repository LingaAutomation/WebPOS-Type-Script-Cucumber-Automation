package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TaxRoundingOff extends ClockInScreen{

    @FindBy(xpath = "(//XCUIElementTypeButton[@name='arrow down'])[2]")
    WebElement downarrow1;

    @FindBy(name = "FOOD ITEMS")
    WebElement category1;

    @FindBy(name = "IceCreams")
    WebElement category2;

    @FindBy(name = "PIZZA")
    WebElement category3;

    @FindBy(name = "Sambar")
    WebElement modifier1;

    @FindBy(name = "Meals")
    WebElement prefix1;

    @FindBy(name = "Done")
    WebElement donebtn;

    @FindBy(name = "testing menu7")
    WebElement menu1;

    @FindBy(name = "testing menu8")
    WebElement menu2;

    @FindBy(name = "testing menu9")
    WebElement menu3;

    @FindBy(name = "testing menu10")
    WebElement menu4;

    @FindBy(name = "testing menu11")
    WebElement menu5;

    @FindBy(name = "testing menu12")
    WebElement menu6;

    @FindBy(name = "testing menu13")
    WebElement menu7;

    @FindBy(name = "testing menu14")
    WebElement menu8;

    @FindBy(name = "pizza supreme")
    WebElement menu9;

    @FindBy(name = "pizza dominator")
    WebElement menu10;

    @FindBy(name = "chicken farmhouse pizza")
    WebElement menu11;

    @FindBy(name = "cheesy pasta pizza")
    WebElement menu12;

    @FindBy(name = "testing menu15")
    WebElement menu13;

    @FindBy(name = "testing menu16")
    WebElement menu14;

    @FindBy(name = "testing menu17")
    WebElement menu15;

    @FindBy(name = "testing menu18")
    WebElement menu16;

    @FindBy(name = "testing menu19")
    WebElement menu17;

    @FindBy(name = "testing menu20")
    WebElement menu18;

    @FindBy(name = "testing menu21")
    WebElement menu19;

    @FindBy(name = "testing menu22")
    WebElement menu20;

    @FindBy(name = "testing menu23")
    WebElement menu21;

    @FindBy(name = "testing menu24")
    WebElement menu22;
    @FindBy(name = "1")
    WebElement press1;

    @FindBy(name = "2")
    WebElement press2;

    @FindBy(name = "3")
    WebElement press3;

    @FindBy(name = "4")
    WebElement press4;

    @FindBy(name = "5")
    WebElement press5;

    @FindBy(name = "5")
    WebElement AllButton;

    @FindBy(name = "6")
    WebElement press6;

    @FindBy(name = "7")
    WebElement press7;

    @FindBy(name = "8")
    WebElement press8;

    @FindBy(name = "9")
    WebElement press9;

    @FindBy(name = "3")
    WebElement quantity3;

    @FindBy(xpath = "//span[contains(.,'Continue')]")
    WebElement ContinueBtn;

    @FindBy(name = "5")
    WebElement quantity5;

    @FindBy(xpath = ("//XCUIElementTypeStaticText[@name=\"Payment\"]"))
    WebElement PaymentBtn;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Cash\"])[2]")
    WebElement cashBtn;
    //XCUIElementTypeStaticText[@name=" Submit"]
    @FindBy(xpath = ("//XCUIElementTypeStaticText[@name=\"  Submit\"]"))
    WebElement SubmitBtn;

    @FindBy(xpath = ("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]"))
    WebElement MenuOptionBtn;

    @FindBy(name = "Discount")
    WebElement DiscountBtn;

    @FindBy(name = "Open Discount")
    WebElement OpenDiscountBtn;

    @FindBy(name = "Back")
    WebElement BackButton;

    @FindBy(name = " Back ")
    WebElement BackBtn;

    @FindBy(name = "Option")
    WebElement OptionButton;

    @FindBy(name = "Open Item")
    WebElement OpenItemOption;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]")
    WebElement CoursingName;

    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]")
    WebElement ItemNameTxtFld1;

    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]")
    WebElement priceTextFld;

    @FindBy( name = "Default")
    WebElement DefaultTax;

    @FindBy( name = "Quantity")
    WebElement QuantityTax;

    @FindBy( name = "Inclusive item")
    WebElement InclusiveTax;

    @FindBy(name = "exc tax1")
    WebElement exclusiveTax;

    @FindBy(name = "inclusive tax9")
    WebElement inclusiveTax;

    @FindBy(name = "Apply")
    WebElement applyBtn;

    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    WebElement percentageField;

    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextView")
    WebElement reasonField;

    @FindBy(name = "Re-Open Check")
    WebElement reopenCheckBtn;

//    public TaxRoundingOff() {
//        super();
//    }

    //  @FindBy(name = "testing menu7")
    // WebElement menu1;

    public void categoryArrowBtn() {
        elementClick(downarrow1, "Selected category arrow");
    }


    public void category1Selection() {
        elementClick(category1, "Selected FOOD ITEMS category");
    }

    public void menu1Selection() {
        elementClick(menu1, "Selected testing menu7 menu item");
    }

    public String MenuPriceAmount;

    public void checkingMenuPrice(String amount) {
        WebElement menuprice =  driver.findElement(By.xpath(amount));
        MenuPriceAmount = menuprice.getText();
        TestUtils.MenuItemPrice1 = MenuPriceAmount;
        utils.log().info("Price of the menu item is" + MenuPriceAmount);
    }

    public void verifyIfMenuAmountAndSubtotalAreEqual() {
        String ExpectedMenuAmount = TestUtils.MenuItemPrice1;
        WebElement ActualAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name='Linga POS']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String ActualMenuPriceAmount = ActualAmount.getText();
        String ActualPrice = ActualMenuPriceAmount.replaceAll("[A-Z$ ]", "");
        Assert.assertEquals(ExpectedMenuAmount, ActualPrice);

    }

    public String MenuItemQuantity;

    public void verifyIfTaxIsCalculatedAsPerTheQuantityTax(String quantity) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement quantityBtn =  driver.findElement(By.xpath(quantity));
        String MenuQuantity = quantityBtn.getText();
        TestUtils.MenuItemQuantity1 = MenuQuantity;
        utils.log().info("Qty of the menu item is " + MenuQuantity);

        int quantityFor1 = Integer.parseInt(MenuQuantity);
        String menuAmount = TestUtils.MenuItemPrice1;
        String menuAmount1 = menuAmount.replace(".", "");

        //double menuAmountDouble= Double.parseDouble(menuAmount);
        //int menuAmount1=(int)menuAmountDouble;

        utils.log().info("amount is " + menuAmount1);
        int menuValue = Integer.parseInt(menuAmount1);
        //utils.log().info(menuAmount1);


        //for(quantity=1;quantity<3;quantity++)
        //Verifying if Tax is calculated correctly
        double tax1 = 0.00025;
        double ExpectedTax = (menuValue * quantityFor1 * tax1);

        BigDecimal dd=new BigDecimal(ExpectedTax).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax2 = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax2);

        //RoundOffCalculation
        double c = aa - ExpectedTax;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

        WebElement ActualTax =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTaxAmount = ActualTax.getText();
        String ActualTaxValue = ActualTaxAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTaxValue);
        String ExpectedTaxValue = String.valueOf(ExpectedTax);

        Assert.assertEquals(ExpectedTaxValue, ActualTaxValue);

        //Verifying if Total is calculated correctly
        double menuAmount5 = Double.parseDouble(menuAmount);
        double ExpectedTotal = menuAmount5 + ExpectedTax;
        WebElement ActualTotal =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String ActualTotalAmount = ActualTotal.getText();
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue);
        String ExpectedTotalValue = String.valueOf(ExpectedTotal);
        utils.log().info("Expected total is " + ExpectedTotalValue);

        Assert.assertEquals(ExpectedTotalValue, ActualTotalValue);

        elementClick(PaymentBtn, "Selected Payment Button");
        elementClick(cashBtn, "Selected Cash Button");
        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();

    }

    public String MenuQuantity2;

    public void verifyIfTaxIsCalculatedAsPerTheQuantityTax2(String quantity2) throws InterruptedException {

        elementClick(downarrow1, "Selected category arrow");
        elementClick(category1, "Selected FOOD ITEMS category");
        elementClick(menu1, "Selected testing menu7 menu item");

        WebElement quantityBtnn =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]"));
        elementClick(quantityBtnn, "");
        elementClick(quantity3, "Selected 3 quantity");
        elementClick(ContinueBtn, "Selected continue button");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement quantityBtn2 =  driver.findElement(By.xpath(quantity2));

        String MenuQuantity3 = quantityBtn2.getText();
        TestUtils.MenuItemQuantity2 = MenuQuantity3;
        utils.log().info("Qty of the menu item is " + MenuQuantity3);

        int quantityFor3 = Integer.parseInt(MenuQuantity3);
        WebElement menuAmount2 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuAmount3 = menuAmount2.getText();
        // String menuAmount2 = TestUtils.MenuItemPrice1;
        String menuAmount4 = menuAmount3.replace(".", "");

        utils.log().info("amount is " + menuAmount4);
        int menuValue1 = Integer.parseInt(menuAmount4);
        //utils.log().info(menuAmount1);


        //for(quantity=1;quantity<3;quantity++)
        //Verifying if Tax is calculated correctly
        double tax2 = 0.00045;
        double ExpectedTax2 = (menuValue1 * tax2);

        BigDecimal dd=new BigDecimal(ExpectedTax2).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        double c = aa - ExpectedTax2;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);


        WebElement ActualTax2 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTaxAmount2 = ActualTax2.getText();
        String ActualTaxValue2 = ActualTaxAmount2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is" + ActualTaxValue2);
        String ExpectedTaxValue2 = String.valueOf(ExpectedTax2);

        Assert.assertEquals(ExpectedTaxValue2, ActualTaxValue2);

        //Verifying if Total is calculated correctly
        double menuAmount6 = Double.parseDouble(menuAmount3);
        double ExpectedTotal1 = menuAmount6 + ExpectedTax2;
        WebElement ActualTotal1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String ActualTotalAmount1 = ActualTotal1.getText();
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);
        String ExpectedTotalValue1 = String.valueOf(ExpectedTotal1);
        utils.log().info("Expected total is " + ExpectedTotalValue1);

        Assert.assertEquals(ExpectedTotalValue1, ActualTotalValue1);

        elementClick(PaymentBtn, "Selected Payment Button");
        elementClick(cashBtn, "Selected Cash Button");
        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();
    }
//////
//     //     elementClick(quantityBtn,"");
//            elementClick(quantity3, "Selected 3 quantity");
//            elementClick(ContinueBtn, "Selected continue button");
//
//        //WebElement quantityBtn3 =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]");
//
//            //String MenuQuantity3 = quantityBtn3.getText();
//        //int quantity3 = Integer.parseInt(MenuQuantity3);

//        WebElement menuItemPrice =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]");
//        String menuItemPrice1 = menuItemPrice.getText();
//        String menuAmount3 = menuItemPrice1.replace(".", "");
//
//        //double menuAmountDouble= Double.parseDouble(menuAmount);
//        //int menuAmount1=(int)menuAmountDouble;
//
//        utils.log().info("amount is" + menuAmount3);
//        int menuValue1 = Integer.parseInt(menuAmount3);
//        //utils.log().info(menuAmount1);
//
//
//        //for(quantity=1;quantity<3;quantity++)
//        // {
//        double tax2 = 0.00045;
//        double ExpectedTax1 = (menuValue1*tax2);
//
//        utils.log().info("Expected tax is" + ExpectedTax1);
//
//        WebElement ActualTax1 =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]");
//        String ActualTaxAmount1 = ActualTax1.getText();
//        String ActualTaxValue2 = ActualTaxAmount1.replaceAll("[A-Z$ ]", "");
//        utils.log().info("Actual tax is" + ActualTaxValue2);
//        String ExpectedTaxValue1 = String.valueOf(ExpectedTax1);
//
//        Assert.assertEquals(ExpectedTaxValue1, ActualTaxValue2);
//
//        ///////
//        quantityBtn.click();
//        elementClick(quantity5, "Selected 5 quantity");
//        elementClick(ContinueBtn, "Selected continue button");
//
//       // WebElement quantityBtn5 =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]");
//
//        //String MenuQuantity5 = quantityBtn5.getText();
//        //int quantity5 = Integer.parseInt(MenuQuantity5);
//        WebElement menuItemPrice2 =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]");
//        String menuItemPrice3 = menuItemPrice2.getText();
//        String menuAmount4 = menuItemPrice3.replace(".", "");
//
//        //double menuAmountDouble= Double.parseDouble(menuAmount);
//        //int menuAmount1=(int)menuAmountDouble;
//
//        utils.log().info("amount is" + menuAmount4);
//        int menuValue2 = Integer.parseInt(menuAmount4);
//        //utils.log().info(menuAmount1);
//
//
//        //for(quantity=1;quantity<3;quantity++)
//        // {
//        double tax3 = 0.00065;
//        double ExpectedTax2 = (menuValue2*tax3);
//
//        utils.log().info("Expected tax is" + ExpectedTax2);
//
//        WebElement ActualTax2 =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]");
//        String ActualTaxAmount2 = ActualTax2.getText();
//        String ActualTaxValue3 = ActualTaxAmount2.replaceAll("[A-Z$ ]", "");
//        utils.log().info("Actual tax is" + ActualTaxValue3);
//        String ExpectedTaxValue2 = String.valueOf(ExpectedTax2);

    //      Assert.assertEquals(ExpectedTaxValue2, ActualTaxValue3);   \\*


    public String MenuQuantity3;
    public void verifyIfTaxIsCalculatedAsPerTheQuantityTax3(String quantity3) throws InterruptedException {
        elementClick(downarrow1, "Selected category arrow");
        elementClick(category1, "Selected FOOD ITEMS category");
        elementClick(menu1, "Selected testing menu7 menu item");

        WebElement quantityBtnnn =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]"));
        elementClick(quantityBtnnn, "");
        elementClick(quantity5, "Selected 5 quantity");
        elementClick(ContinueBtn, "Selected continue button");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement quantityBtn3 =  driver.findElement(By.xpath(quantity3));

        String MenuQuantity5 = quantityBtn3.getText();
        TestUtils.MenuItemQuantity3 = MenuQuantity5;
        utils.log().info("Qty of the menu item is" + MenuQuantity5);

        int quantityFor5 = Integer.parseInt(MenuQuantity5);
        WebElement menuAmount5 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuAmount6 = menuAmount5.getText();
        String menuAmount7 = menuAmount6.replace(".", "");

        utils.log().info("amount is" + menuAmount7);
        int menuValue2 = Integer.parseInt(menuAmount7);
        //utils.log().info(menuAmount1);


        //for(quantity=1;quantity<3;quantity++)
        //Verifying if Tax is calculated correctly
        double tax3 = 0.00065;
        double ExpectedTax3 = (menuValue2 * tax3);

        BigDecimal dd=new BigDecimal(ExpectedTax3).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        double c = aa - ExpectedTax3;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);



        utils.log().info("Expected tax is" + ExpectedTax3);

        WebElement ActualTax3=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTaxAmount3 = ActualTax3.getText();
        String ActualTaxValue3 = ActualTaxAmount3.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is" + ActualTaxValue3);
        String ExpectedTaxValue3 = String.valueOf(ExpectedTax3);

        Assert.assertEquals(ExpectedTaxValue3, ActualTaxValue3);

        //Verifying if Total is calculated correctly
        double menuAmount8 = Double.parseDouble(menuAmount6);
        double ExpectedTotal3 = menuAmount8 + ExpectedTax3;
        WebElement ActualTotal3 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String ActualTotalAmount3 = ActualTotal3.getText();
        String ActualTotalValue3 = ActualTotalAmount3.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue3);
        String ExpectedTotalValue3 = String.valueOf(ExpectedTotal3);
        utils.log().info("Expected total is " + ExpectedTotalValue3);


        Assert.assertEquals(ExpectedTotalValue3, ActualTotalValue3);

        elementClick(PaymentBtn, "Selected Payment Button");
        elementClick(cashBtn, "Selected Cash Button");
        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();
    }

    public void SelectTheMenuItemWithTheInclusiveTax() throws InterruptedException {

        elementClick(downarrow1, "Selected category arrow");
        elementClick(category1, "Selected FOOD ITEMS category");
        elementClick(menu2, "Selected menu item with inclusive tax");


    }

    public void VerifyIfTheTaxIsCalculatedCorrectly() {
        WebElement menuItemAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount2 = menuItemAmount.getText();

        double menuItemAmount3 = Double.parseDouble(menuItemAmount2);
        double taxValue = 12;

        double a = taxValue / 100;
        double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is "+b);

        BigDecimal dd=new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is" + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa - b;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void VerifyIfTheTotalIsCalculatedCorrectly()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();
        String ExpectedTotal = menuItemAmount3;
        String ExpectedTotalValue = ExpectedTotal.replaceAll("[A-Z$ ]", "");
        WebElement ActualTotal =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String ActualTotalAmount = ActualTotal.getText();
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue);
        String ExpectedTotalValue3 = String.valueOf(ExpectedTotalValue);
        utils.log().info("Expected total is " + ExpectedTotalValue);

        Assert.assertEquals(ActualTotalValue, ExpectedTotalValue);

    }

    public void VerifyIfTheBalanceDueIsCalculatedCorrectly(){

        WebElement TotalAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String ActualTotalAmount = TotalAmount.getText();
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Expected Balance due is "+ActualTotalValue);

        elementClick(PaymentBtn, "Selected Payment Button");
        WebElement BalanceDue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String BalanceDueAmount = BalanceDue.getText();
        utils.log().info("test "+BalanceDueAmount);
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is "+BalanceDueValue);


        Assert.assertEquals(ActualTotalValue, BalanceDueValue);

    }

    public void VerifyIfTheBalanceDueIsCalculatedCorrectlyAfterPayment() throws InterruptedException {

        elementClick(cashBtn, "Selected Cash Button");
        String ExpectedDueAmount = "0.00";
        utils.log().info("Expected balance due after payment is "+ExpectedDueAmount);

        WebElement BalanceDue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String BalanceDueAmount = BalanceDue.getText();
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is "+BalanceDueValue);


        Assert.assertEquals(ExpectedDueAmount, BalanceDueValue);

        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();
    }

    public void SelectTheMenuItemWithTheExclusiveTax(){

        elementClick(downarrow1, "Selected category arrow");
        elementClick(category1, "Selected FOOD ITEMS category");
        elementClick(menu3, "Selected menu item with exclusive tax");
    }

    public void VerifyIfTheExcTaxIsCalculatedCorrectly() {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
        double taxValue = 0.10255;

        double a = menuItemAmount4 * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is "+a);


        BigDecimal dd=new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa - a;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void VerifyIfTotalValueIsCalculatedCorrectly()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

        double taxAmount4 = Double.parseDouble(ActualTax3);

        double ExpectedTotal = menuItemAmount4 + taxAmount4;
        String ExpectedTotalValue1 = String.valueOf(ExpectedTotal);

        utils.log().info("Expected total is " + ExpectedTotalValue1);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String ActualTotalAmount1 = ActualTotal1.getText();
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue1, ActualTotalValue1);
    }

    public void VerifyIfBalanceDueValueIsCalculatedCorrectly()
    {
        WebElement TotalAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String ActualTotalAmount = TotalAmount.getText();
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Expected Balance due is "+ActualTotalValue);

        elementClick(PaymentBtn, "Selected Payment Button");
        WebElement BalanceDue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String BalanceDueAmount = BalanceDue.getText();

        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is "+BalanceDueValue);


        Assert.assertEquals(ActualTotalValue, BalanceDueValue);
    }

    public void VerifyIfBalanceDueValueIsCalculatedCorrectlyAfterPayment() throws InterruptedException {
        elementClick(cashBtn, "Selected Cash Button");
        String ExpectedDueAmount = "0.00";
        utils.log().info("Expected balance due after payment is "+ExpectedDueAmount);

        WebElement BalanceDue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String BalanceDueAmount = BalanceDue.getText();
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is "+BalanceDueValue);


        Assert.assertEquals(ExpectedDueAmount, BalanceDueValue);
        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();
    }

    public void SelectTheMenuItemWithExclusiveTaxAndDiscount()
    {
        elementClick(downarrow1, "Selected category arrow");
        elementClick(category1, "Selected FOOD ITEMS category");
        elementClick(menu4, "Selected menu item with exclusive tax and discount");
    }

    public void ApplyItemDiscount(String DiscountName)
    {
        elementClick(DiscountBtn, "Selected discount button");
        WebElement Discount =  driver.findElement(By.xpath(DiscountName));
        elementClick(Discount, "Selected the item discount");
        elementClick(BackButton, "Selected the back button");
    }

    public String subtotalAfterDiscount3;
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOff()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        double DiscountPercent = 0.20;

        double discountAmount = menuItemAmount4 * DiscountPercent;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is "+cc);

        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is "+subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;


        //define tax percentage
        double taxPercent = 0.0622;

        double taxAmount = subtotalAfterDiscount2 * taxPercent;
        utils.log().info("Exact Tax is "+taxAmount);

        BigDecimal dd=new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //roundOff Calculation
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void VerifyIfTotalAmountIsCalculatedCorrectly()
    {
        double subTotal = Double.parseDouble(TestUtils.subtotalAfterDiscount4);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        utils.log().info("Tax is " + ActualTax2);
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

        double taxAmount4 = Double.parseDouble(ActualTax3);

        double ExpectedTotal = subTotal + taxAmount4;
        String ExpectedTotalValue1 = String.valueOf(ExpectedTotal);

        utils.log().info("Expected total is " + ExpectedTotalValue1);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String ActualTotalAmount1 = ActualTotal1.getText();
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue1, ActualTotalValue1);

    }

    public void VerifyIfBalanceDueAmountIsCalculatedCorrectly()
    {

        WebElement TotalAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String ActualTotalAmount = TotalAmount.getText();
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Expected Balance due is "+ActualTotalValue);

        elementClick(PaymentBtn, "Selected Payment Button");
        WebElement BalanceDue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String BalanceDueAmount = BalanceDue.getText();

        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is "+BalanceDueValue);


        Assert.assertEquals(ActualTotalValue, BalanceDueValue);
    }

    public void VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterPayment() throws InterruptedException {
        elementClick(cashBtn, "Selected Cash Button");
        String ExpectedDueAmount = "0.00";
        utils.log().info("Expected balance due after payment is "+ExpectedDueAmount);

        WebElement BalanceDue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String BalanceDueAmount = BalanceDue.getText();
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is "+BalanceDueValue);


        Assert.assertEquals(ExpectedDueAmount, BalanceDueValue);
        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();
    }

    public void SelectTheMenuItemWithInclusiveTaxAndDiscount()
    {
        elementClick(downarrow1, "Selected category arrow");
        elementClick(category1, "Selected FOOD ITEMS category");
        elementClick(menu5, "Selected menu item with exclusive tax and discount");
    }

    public void ApplyItemDiscount2(String discountName2)
    {
        elementClick(DiscountBtn, "Selected discount button");
        WebElement Discount =  driver.findElement(By.xpath(discountName2));
        elementClick(Discount, "Selected the item discount");
        elementClick(BackButton, "Selected the back button");
    }

    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOff()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        double DiscountPercent = 0.30;

        double discountAmount = menuItemAmount4 * DiscountPercent;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is "+cc);

        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is "+subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        //define tax percentage
        double taxPercent = 14.77;

        double a = taxPercent / 100;
        double b = subtotalAfterDiscount2 - (subtotalAfterDiscount2 / (1+a));
        utils.log().info("Exact tax amount is "+b);

        BigDecimal dd=new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //roundOff Calculation
        double d = aa - b;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void VerifyIfTotalAmountIsDisplayedCorrectly()
    {
        double subTotal = Double.parseDouble(TestUtils.subtotalAfterDiscount4);

        double ExpectedTotal = subTotal ;

        String ExpectedTotalValue1 = String.valueOf(ExpectedTotal);

        utils.log().info("Expected total is " + ExpectedTotalValue1);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String ActualTotalAmount1 = ActualTotal1.getText();
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue1, ActualTotalValue1);

    }

    public void VerifyIfBalanceDueAmountIsDisplayedCorrectly()
    {
        WebElement TotalAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String ActualTotalAmount = TotalAmount.getText();
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Expected Balance due is "+ActualTotalValue);

        elementClick(PaymentBtn, "Selected Payment Button");
        WebElement BalanceDue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String BalanceDueAmount = BalanceDue.getText();

        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is "+BalanceDueValue);


        Assert.assertEquals(ActualTotalValue, BalanceDueValue);
    }

    public void VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterThePayment() throws InterruptedException {
        elementClick(cashBtn, "Selected Cash Button");
        String ExpectedDueAmount = "0.00";
        utils.log().info("Expected balance due after payment is "+ExpectedDueAmount);

        WebElement BalanceDue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String BalanceDueAmount = BalanceDue.getText();
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is "+BalanceDueValue);


        Assert.assertEquals(ExpectedDueAmount, BalanceDueValue);
        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();
    }

    public void SelectOptionsButton()
    {
        elementClick(OptionButton,"Selected Option Button");
    }

    public void SelectedOpenItemOption()
    {
        elementClick(OpenItemOption,"Selected Open Item option");
    }

    public void SelectedTheCoursingNameField()
    {
        elementClick(CoursingName,"Selected Open Item option");

    }

    public void swipeToTheCourseName(String Name) throws InterruptedException {
        WebElement DatePickerWheel =mergeAndFindElement("//XCUIElementTypePicker","", TestUtils.XPath);

        List<WebElement> course= DatePickerWheel.findElements(By.xpath("//XCUIElementTypePickerWheel"));

        course.get(0).sendKeys(Name);
    }

    public void setMenuItemName(String name){

        sendKeys( ItemNameTxtFld1, name);

    }

    public void iSelectedPriceTextField()
    {
        elementClick(priceTextFld, "I selected the price text field");
    }

    public void iEnteredThePrice()
    {
        for(int i=0;i<=3;i++)
        {
            elementClick(press2, "Entered menu amount");
        }
    }

    public void iSelectedContinueButton()
    {
        elementClick(ContinueBtn, " I Selected continue button");
    }

    public void selectTheTax()
    {
        elementClick( DefaultTax, "Default Tax is de-selected");
    }

    public void selectTheTax2Exclusive()
    {
        elementClick( QuantityTax, "Quantity Tax is selected");
    }

    public void iSelectedBackButton()
    {
        elementClick( BackBtn, "Selected the Back button");
    }

    public void verifyIfTaxAndRoundOffAreCalculatedProperlyExclusive()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
        double taxValue = 0.1766;

        double a = menuItemAmount4 * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is "+a);

        BigDecimal dd=new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa - a;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void selectTheTax2Inclusive()
    {
        elementClick( InclusiveTax, "Quantity Tax is selected");
    }

    public void verifyIfTheTaxAndRoundOffAreCalculatedProperlyInclusive() {
        WebElement menuItemAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount2 = menuItemAmount.getText();

        double menuItemAmount3 = Double.parseDouble(menuItemAmount2);
        double taxValue = 13.450;

        double a = taxValue / 100;
        double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is "+b);

        BigDecimal dd=new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$, ]", "");
        utils.log().info("Actual tax is" + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa - b;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void selectMenuItemWithCheckTax()
    {
        elementClick(menu7,"Selected the menu item");
    }

    public void VerifyIfCheckTaxIsCalculatedCorrectlyAndCalculateRoundoff() {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
        double taxValue = 0.12444;

        double a = menuItemAmount4 * taxValue;
        utils.log().info("Exact tax amount is "+a);
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd=new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa - a;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void iEnteredPriceForTheOpenItem()
    {
        for(int i=0;i<=4;i++)
        {
            elementClick(press2, "Entered menu amount");
        }
    }

    public void selectMenuItemWithBothInclusiveAndExclusiveTax()
    {
        elementClick(menu8, "Select the menu item");
    }

    public void verifyIfBothTaxesAreCalculatedCorrectlyAndCalculateRoundoff()
    {
        //For exclusive
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
        double taxValue = 0.10255;

        double a = menuItemAmount4 * taxValue;
        utils.log().info("Exact tax1 amount is "+a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd=new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();

        String ExpectedExclusiveTax = String.valueOf(aa);
        utils.log().info("Exclusive tax amount is "+ExpectedExclusiveTax);

        //RoundOffCalculationForExclusiveTax
        double ExcTax = aa - a;
        BigDecimal ee = new BigDecimal(ExcTax).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue1 = String.valueOf(ff);
        utils.log().info("RoundOff value for exclusive is " + RoundOffValue1);

        //For inclusive
        WebElement menuAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuAmount2 = menuAmount.getText();

        double menuAmount11 = Double.parseDouble(menuAmount2);
        double taxPercent = 12.12;

        double x1 = taxPercent / 100;
        double y1 = menuAmount11 - (menuAmount11 / (1+x1));
        utils.log().info("Exact tax2 amount is "+y1);

        BigDecimal z1=new BigDecimal(y1).setScale(2, RoundingMode.HALF_UP);
        double xx1=z1.doubleValue();
        utils.log().info("test1 "+xx1);

        String ExpectedInclusiveTax = String.valueOf(xx1);
        utils.log().info("Inclusive tax amount is "+ExpectedInclusiveTax);

//        //Total Round-Off calculation
//        double totalRoundOff = ff + ww1;
//        String totalRoundOff1 = String.valueOf(totalRoundOff);
//        utils.log().info("Total RoundOff value is " + totalRoundOff1);

        //Total Tax Calculation
        double TotalExpectedTax = aa + xx1;
        BigDecimal ExpectedTax = new BigDecimal(TotalExpectedTax).setScale(2, RoundingMode.HALF_UP);
        double ExpectedTax1 = ExpectedTax.doubleValue();
        String ExpectedTax2 = String.valueOf(ExpectedTax1);
        utils.log().info("Total tax is " + ExpectedTax1);

        //RoundOffCalculation
        double totalExactTax = a + y1;
        BigDecimal totalExactTax1 = new BigDecimal(totalExactTax).setScale(4,RoundingMode.HALF_UP);
        Double totalExactTax2 = totalExactTax1.doubleValue();
        Double RoundOff = totalExactTax2 - ExpectedTax1;
        utils.log().info("Roundoff is " + RoundOff);


        //While having both inclusive and exclusive tax, total tax is mismatching (LIN-19721), so commenting the below steps
        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax2, ActualTax3);
    }

    public void verifyifTotalValueIsCalculatedCorrectlyBothInclusiveAndExclusive()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double taxValue = 0.10255;

        double a = menuItemAmount4 * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd=new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();

        double totalAmount = menuItemAmount4 + aa;
        String totalExpectedAmount = String.valueOf(totalAmount);

        utils.log().info("Expected total amount is "+totalExpectedAmount);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String ActualTotalAmount1 = ActualTotal1.getText();
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(totalExpectedAmount, ActualTotalValue1);
    }

    public void iSelectedTheExclusiveTax() throws Exception {

        //WebElement exclusiveTax = mergeAndFindElement("exc tax1", "", TestUtils.Accessibility);
        BasePage c = new BasePage();
        c.scrollToElementPayments(exclusiveTax, "up");
        //    scrollToElement(exclusiveTax, "up");
        Thread.sleep(5000);

        //elementClick(exclusiveTax,"tapped exclusive tax");

    }

    public void iClickedTheExclusiveTax()
    {
        elementClick(exclusiveTax,"tapped exclusive tax");
    }

    public void iSelectedTheInclusiveTax() throws Exception {
        scrollToElementPayments(inclusiveTax, "up");
        inclusiveTax.click();
    }

    public String subtotalAfterDiscount7;
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncAndExc()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        double DiscountPercent = 0.22;

        double discountAmount = menuItemAmount4 * DiscountPercent;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is "+cc);

        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is "+subtotalAfterDiscount2);
        subtotalAfterDiscount7 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount8 = subtotalAfterDiscount7;


        //define tax percentage(exclusive))
        double taxPercent = 0.10255;

        double taxAmount = subtotalAfterDiscount2 * taxPercent;
        utils.log().info("Exact Tax1 is "+taxAmount);

        BigDecimal dd=new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        String ExclusiveTax = String.valueOf(bb);
        utils.log().info("Exclusive Tax is "+ExclusiveTax);

        //roundOff Calculation
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value for exclusive tax is " + RoundOffValue);

        //define tax percentage(inclusive)
        double taxPercent2 = 12.12;

        double x1 = taxPercent2 / 100;
        double y1 = subtotalAfterDiscount2 - (subtotalAfterDiscount2 / (1+x1));
        utils.log().info("Exact Tax2 is "+y1);

        BigDecimal z1=new BigDecimal(y1).setScale(2, RoundingMode.HALF_UP);
        double xx1=z1.doubleValue();
        String ExpectedInclusiveTax = String.valueOf(xx1);
        utils.log().info("Inclusive tax amount is "+ExpectedInclusiveTax);

        //RoundOffCalculation
        double w1 = xx1 - y1;
        BigDecimal yy1 = new BigDecimal(w1).setScale(4, RoundingMode.HALF_UP);
        double ww1 = yy1.doubleValue();
        String RoundOffValue2 = String.valueOf(ww1);
        utils.log().info("RoundOff value for inclusive tax is " + RoundOffValue2);

        //Total Round-Off calculation
        double totalRoundOff = ff + ww1;
        String totalRoundOff1 = String.valueOf(totalRoundOff);
        utils.log().info("Total RoundOff value is " + totalRoundOff1);

        //Total tax calculation
        double totalTax = bb + xx1;

        BigDecimal totalTax1 = BigDecimal.valueOf(totalTax).setScale(2,RoundingMode.HALF_UP);
        double totalTax2 = totalTax1.doubleValue();
        String ExpectedTotalTax = String.valueOf(totalTax2);
        utils.log().info("Expected tax is " + ExpectedTotalTax);


        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        //While having both inclusive and exclusive tax, total tax is mismatching (LIN-19721), so commenting the below step
        //Assert.assertEquals(ExpectedTotalTax, ActualTax3);

    }

    public void VerifyIfTotalIsCalculatedProperlyAndCalculateRoundOffIncAndExcWithDiscount()
    {
        double subTotal = Double.parseDouble(TestUtils.subtotalAfterDiscount8);


        double taxValue = 0.10255;

        double a = subTotal * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd=new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();

        double totalAmount = subTotal + aa;
        String totalExpectedAmount = String.valueOf(totalAmount);

        utils.log().info("Expected total amount is "+totalExpectedAmount);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String ActualTotalAmount1 = ActualTotal1.getText();
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(totalExpectedAmount, ActualTotalValue1);
    }

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffExcWithAmountDiscount()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        double DiscountAmount = 23.66;

        double subtotalAfterDiscount = menuItemAmount4 - DiscountAmount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is "+subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;


        //define tax percentage
        double taxPercent = 0.0622;

        double taxAmount = subtotalAfterDiscount2 * taxPercent;
        BigDecimal dd=new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //roundOff Calculation
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncWithAmountDiscount()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        double DiscountAmount = 32.33;

        double subtotalAfterDiscount = menuItemAmount4 - DiscountAmount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is "+subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        //define tax percentage
        double taxPercent = 14.77;

        double a = taxPercent / 100;
        double b = (subtotalAfterDiscount2 - (subtotalAfterDiscount2 / (1+a)));
        utils.log().info("Exact tax amount is "+b);

        BigDecimal dd=new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax +b);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //roundOff Calculation
        double d = aa - b;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffExcWithSetPriceDiscount()
    {
        //set price discount is set as 11.12 so below value is given as subtotal
        double subtotalAfterDiscount = 11.12;

        //define tax percent
        double taxPercent = 0.0622;

        double taxAmount = subtotalAfterDiscount * taxPercent;
        utils.log().info("Exact Tax is "+taxAmount);


        BigDecimal dd=new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //roundOff Calculation
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncWithSetPriceDiscount()
    {
        //set price discount is set as 11.12 so below value is given as subtotal
        double subtotalAfterDiscount = 11.12;

        //define tax percentage
        double taxPercent = 14.77;

        double a = taxPercent / 100;
        double b = subtotalAfterDiscount - (subtotalAfterDiscount / (1+a));
        utils.log().info("Exact tax amount is "+b);


        BigDecimal dd=new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //roundOff Calculation
        double d = aa - b;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void SelectMenuItemsWithExclusiveTaxWithCheckDiscount()
    {
        elementClick(menu9,"selected the menu1");
        elementClick(menu10,"selected the menu2");

    }

    public void ApplyCheckDiscount(String DiscountName)
    {
        elementClick(DiscountBtn, "Selected discount button");
        WebElement Discount =  driver.findElement(By.xpath(DiscountName));
        elementClick(Discount, "Selected the item discount");
        elementClick(BackButton, "Selected the back button");
    }
    public String subtotalAfterDiscount9;
    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        double DiscountPercent = 0.24;
        //1st Menu Tax calculation
        WebElement Menu1Price =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String Menu1PriceAmount = Menu1Price.getText();
        double Menu1PriceValue = Double.parseDouble(Menu1PriceAmount);

        double discountAmount1 = Menu1PriceValue * DiscountPercent;
        BigDecimal discountAmount2 =new BigDecimal(discountAmount1).setScale(2, RoundingMode.HALF_UP);
        double discountAmount3 = discountAmount2.doubleValue();
        double menu1PriceAfterDiscount = Menu1PriceValue - discountAmount3;

        //define tax percentage for 1st menu and calculate tax
        double taxPercent = 0.10255;

        double taxAmount = menu1PriceAfterDiscount * taxPercent;
        utils.log().info("Exact Tax1 is "+taxAmount);

        BigDecimal dd=new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee1=new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ff = ee1.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is "+ExpectedTax);

        //2nd Menu Tax Calculation
        WebElement Menu2Price =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
        String Menu2PriceAmount = Menu2Price.getText();
        double Menu2PriceValue = Double.parseDouble(Menu2PriceAmount);

        double discountAmount4 = Menu2PriceValue * DiscountPercent;
        BigDecimal discountAmount5 =new BigDecimal(discountAmount4).setScale(2, RoundingMode.HALF_UP);
        double discountAmount6 = discountAmount5.doubleValue();
        double menu2PriceAfterDiscount = Menu2PriceValue - discountAmount6;

        //define tax percentage for 2nd menu and calculate tax
        double taxPercent2 = 0.0622;

        double taxAmount2 = menu2PriceAfterDiscount * taxPercent2;
        utils.log().info("Exact Tax2 is "+ExpectedTax);

        BigDecimal dd2=new BigDecimal(taxAmount2).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee2=new BigDecimal(taxAmount2).setScale(4, RoundingMode.HALF_UP);

        double bb2 = dd2.doubleValue();
        double gg = ee2.doubleValue();

        String ExpectedTax2 = String.valueOf(bb2);
        utils.log().info("Expected Tax2 is "+ExpectedTax2);

        double totalExpectedTax = bb + bb2;
        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
        utils.log().info("Total Expected Tax is "+totalExpectedTaxAmount);

        //total tax calculation new
        double newTotalTax = ff + gg;
        utils.log().info("Total New Tax is "+newTotalTax);


        //Commenting below steps as there is mismatch in exp and act tax when two exclusive are there (LIN-19736)

//        WebElement ActualTaxAmount=  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]");
//        String ActualTax2 = ActualTaxAmount.getText();
//        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
//        utils.log().info("Actual tax is " + ActualTax3);
//
//        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

        //RoundOff Calculation for 1st Tax
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double tt = ee.doubleValue();
        String RoundOffValue = String.valueOf(tt);
        utils.log().info("RoundOff value for Tax1 is " + RoundOffValue);

        //RoundOff Calculation for 2nd Tax
        double d2 = bb2 - taxAmount2;
        BigDecimal yy = new BigDecimal(d2).setScale(4, RoundingMode.HALF_UP);
        double ff2 = yy.doubleValue();
        String RoundOffValue2 = String.valueOf(ff2);
        utils.log().info("RoundOff value for Tax2 is " + RoundOffValue2);

        //Total RoundOff Calculation
        double totalRoundOff = ff + gg;
        String totalRoundOffValue = String.valueOf(totalRoundOff);
        utils.log().info("Total RoundOff value is " + totalRoundOffValue);

    }

    public void SelectMenuItemsWithInclusiveTaxWithCheckDiscount()
    {
        elementClick(menu11,"selected the menu1");
        elementClick(menu12,"selected the menu2");

    }

    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountInclusive()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        double DiscountPercent = 0.24;
        //1st Menu Tax calculation
        WebElement Menu1Price =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String Menu1PriceAmount = Menu1Price.getText();
        double Menu1PriceValue = Double.parseDouble(Menu1PriceAmount);

        double discountAmount1 = Menu1PriceValue * DiscountPercent;
        BigDecimal discountAmount2 =new BigDecimal(discountAmount1).setScale(2, RoundingMode.HALF_UP);
        double discountAmount3 = discountAmount2.doubleValue();
        double menu1PriceAfterDiscount = Menu1PriceValue - discountAmount3;

        //define tax percentage for 1st menu and calculate tax
        double taxPercent = 16.12;
        double a = taxPercent / 100;
        double b = menu1PriceAfterDiscount - (menu1PriceAfterDiscount / (1+a));
        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee1=new BigDecimal(b).setScale(4, RoundingMode.HALF_UP);

        double aa = dd.doubleValue();
        double ff = ee1.doubleValue();

        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Menu1 tax amount is "+ExpectedTax);

        //2nd Menu Tax Calculation
        WebElement Menu2Price =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
        String Menu2PriceAmount = Menu2Price.getText();
        double Menu2PriceValue = Double.parseDouble(Menu2PriceAmount);

        double discountAmount4 = Menu2PriceValue * DiscountPercent;
        BigDecimal discountAmount5 =new BigDecimal(discountAmount4).setScale(2, RoundingMode.HALF_UP);
        double discountAmount6 = discountAmount5.doubleValue();
        double menu2PriceAfterDiscount = Menu2PriceValue - discountAmount6;

        //define tax percentage for 2nd menu and calculate tax
        double taxPercent2 = 17.62;

        double a2 = taxPercent2 / 100;
        double b2 = menu2PriceAfterDiscount - (menu2PriceAfterDiscount / (1+a2));
        BigDecimal dd2 = new BigDecimal(b2).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ff1=new BigDecimal(b2).setScale(4, RoundingMode.HALF_UP);

        double aa2 = dd2.doubleValue();
        double gg = ff1.doubleValue();

        String ExpectedTax2 = String.valueOf(aa2);
        utils.log().info("Menu2 tax amount is "+ExpectedTax2);

        double totalExpectedTax = aa + aa2;
        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
        BigDecimal totalExpectedTaxAmount2 =new BigDecimal(totalExpectedTaxAmount).setScale(2, RoundingMode.HALF_UP);
        double totalExpectedTaxAmount3 = totalExpectedTaxAmount2.doubleValue();
        String totalExpectedTaxValue = String.valueOf(totalExpectedTaxAmount3);
        utils.log().info("Total Expected Tax is "+totalExpectedTaxAmount3);

        //Commenting below steps as there is mismatch in exp and act tax when two exclusive are there (LIN-19736)

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxValue, ActualTax3);

//         //RoundOff Calculation for 1st Tax
//         double d = aa - b;
//         BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
//         double f = ee.doubleValue();
//         String RoundOffValue = String.valueOf(f);
//         utils.log().info("RoundOff value for Tax1 is " + RoundOffValue);

//         //RoundOff Calculation for 2nd Tax
//         double d2 = aa2 - b2;
//         BigDecimal ee2 = new BigDecimal(d2).setScale(4, RoundingMode.HALF_UP);
//         double ff2 = ee2.doubleValue();
//         String RoundOffValue2 = String.valueOf(ff2);
//         utils.log().info("RoundOff value for Tax2 is " + RoundOffValue2);

        //Total tax Calculation
        double totalRoundOff = ff + gg;
        BigDecimal yy = new BigDecimal(totalRoundOff).setScale(2, RoundingMode.HALF_UP);
        double yy1 = yy.doubleValue();
        double yy2 = yy1 - totalRoundOff;
        BigDecimal yy3 = new BigDecimal(yy2).setScale(4, RoundingMode.HALF_UP);
        double yy4 = yy3.doubleValue();

        String totalRoundOffValue = String.valueOf(yy4);
        utils.log().info("Total RoundOff value is " + totalRoundOffValue);


    }

    public void SelectMenuItemWithTheExclusiveTaxForOpenDiscount()
    {
        elementClick(downarrow1, "Selected category arrow");
        elementClick(category1, "Selected FOOD ITEMS category");
        elementClick(menu13, "Selected menu item with exclusive tax");
    }

    public void iSelectedTheMenuOptions()
    {
        elementClick(MenuOptionBtn, "I selected Menu Options");
    }

    public void iSelectedTheOpenDiscount()
    {
        elementClick(OpenDiscountBtn, "I selected Menu Options");

    }

    public void iTappedPercentageField()
    {
        elementClick(percentageField, "I selected Menu Options");

    }

    public void iEneteredDiscountPercentage()
    {
        elementClick(press1,"I tapped 1");
        elementClick(press3,"I tapped 2");
        elementClick(press4,"I tapped 4");
        elementClick(press5,"I tapped 5");
    }

    public void iTheTappedReasonAndEnteredTheReason()
    {
        elementClick(reasonField,"I tapped reason field");
        reasonField.sendKeys("Open Item Discount");
    }

    public void iSelectedApplyButton()
    {
        elementClick(applyBtn,"Select Apply button");
    }

    public String subtotalAfterDiscount11;
    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountExclusive()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        double DiscountPercent = 0.1345;

        double discountAmount = menuItemAmount4 * DiscountPercent;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is "+cc);

        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is "+subtotalAfterDiscount2);
        subtotalAfterDiscount11 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount12 = subtotalAfterDiscount11;


        //define tax percentage
        double taxPercent = 0.10255;

        double taxAmount = subtotalAfterDiscount2 * taxPercent;
        utils.log().info("Exact Tax is "+taxAmount);

        BigDecimal dd=new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //roundOff Calculation
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void VerifyIfTotalAmountIsCalculatedCorrectlyExclusiveOpenDiscount()
    {
        double subTotal = Double.parseDouble(TestUtils.subtotalAfterDiscount12);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        utils.log().info("Tax is " + ActualTax2);
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

        double taxAmount4 = Double.parseDouble(ActualTax3);

        double ExpectedTotal = subTotal + taxAmount4;
        String ExpectedTotalValue1 = String.valueOf(ExpectedTotal);

        utils.log().info("Expected total is " + ExpectedTotalValue1);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String ActualTotalAmount1 = ActualTotal1.getText();
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue1, ActualTotalValue1);

    }

    public void SelectMenuItemWithTheInclusiveTaxForOpenDiscount()
    {
        elementClick(menu14, "Selected menu item with exclusive tax");

    }

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountInclusive()
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        double DiscountPercent = 0.1345;

        double discountAmount = menuItemAmount4 * DiscountPercent;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is "+cc);

        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is "+subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount12 = subtotalAfterDiscount3;

        //define tax percentage
        double taxPercent = 17.62;

        double a = taxPercent / 100;
        double b = subtotalAfterDiscount2 - (subtotalAfterDiscount2 / (1+a));
        utils.log().info("test1 is "+b);
        BigDecimal dd=new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        utils.log().info("test1 is "+aa);
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //roundOff Calculation
        double d = aa - b;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void iSelectedTheExclusiveTaxMenuItemWithAfterTaxItemDiscount()
    {
        elementClick(menu15,"I selected the menu item");
    }

    public void iSelectedTheQuantity(String quantity) throws InterruptedException {
        WebElement quantityBtnn =  driver.findElement(By.xpath("/html/body/app-root/app-dashboard-container/ion-app/ion-content/ion-grid/ion-row/ion-col[1]/app-order-list-container/ion-app/ion-content/div/app-ordered-list/ion-app/ion-content/div/div/div/div[2]/div/div/div[3]"));
        elementClick(quantityBtnn, "Selected QTY");
        WebElement quantityValue =  driver.findElement(By.xpath("//ion-col[@class='quantity_grid-row-col md hydrated']//span[contains(.,'"+quantity+"')]"));
        elementClick(quantityValue, "Entered the quantity");

        elementClick(ContinueBtn, "Selected continue button");
        Thread.sleep(1000);
    }

    public void verifyIfTaxAndDiscountAreCalculatedProperly(double taxAmount, double discountAmount)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxAmount;
        utils.log().info("Exact tax amount is "+a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd=new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa - a;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void iSelectedInclusiveTaxMenuItemWithAfterTaxItemDiscount()
    {
        elementClick(menu16,"Selected the menu item");
    }

    public void verifyIfTaxAndDiscountAreCalculatedProperlyInclusiveAfterTaxDiscount(double taxAmount, double discountAmount)
    {
        WebElement menuItemAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount2 = menuItemAmount.getText();

        double menuItemAmount3 = Double.parseDouble(menuItemAmount2);

        double a = taxAmount / 100;
        double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is "+b);


        BigDecimal dd=new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa - b;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void iSelectedExclusiveTaxMenuItemWithTaxOnItemTax()
    {
        elementClick(menu17,"I selected the menu item");
    }

    public void verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemTaxExclusive(double taxAmount1, double taxAmount2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define tax percentage for 1st menu and calculate tax

        double taxAmount = menuItemAmount4 * taxAmount1;
        BigDecimal dd=new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt=new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ss = tt.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is "+ExpectedTax);

        //calculate tax on item tax
        double taxOnItemTax = bb * taxAmount2;
        BigDecimal taxOnItemTax1 =new BigDecimal(taxOnItemTax).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt2 =new BigDecimal(taxOnItemTax).setScale(4, RoundingMode.HALF_UP);

        double taxOnItemTax2 = taxOnItemTax1.doubleValue();
        double ss2 = tt2.doubleValue();

        String taxOnItemTaxAmount = String.valueOf(taxOnItemTax2);
        utils.log().info("Expected Tax2 is "+taxOnItemTaxAmount);

        //Calculate total tax
        double totalExpectedTax = bb + taxOnItemTax2;
        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
        utils.log().info("Total Expected Tax is "+totalExpectedTaxAmount);

//        //RoundOff Calculation for 1st Tax
//        double d = bb - taxAmount;
//        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
//        double ff = ee.doubleValue();
//        String RoundOffValue = String.valueOf(ff);
//        utils.log().info("RoundOff value for Tax1 is " + RoundOffValue);

//        //RoundOff Calculation for 2nd Tax
//        double d2 = taxOnItemTax2 - taxOnItemTax;
//        BigDecimal ee2 = new BigDecimal(d2).setScale(4, RoundingMode.HALF_UP);
//        double ff2 = ee2.doubleValue();
//        String RoundOffValue2 = String.valueOf(ff2);
//        utils.log().info("RoundOff value for Tax2 is " + RoundOffValue2);

//        /

        //Total RoundOff Calculation
//        double totalTax4 = taxAmount + taxOnItemTax;
//        utils.log().info("value1 is " + totalTax4);
        double totalTax4 = ss + ss2;
        utils.log().info("value1 is " + totalTax4);
//          totalTax4 = totalTax4 * 100.0/100.0;

//         double tt3 = Math.round(totalTax4 * 100.0)/100.0;
        BigDecimal tt3 =new BigDecimal(totalTax4).setScale(2, RoundingMode.HALF_UP);
        double tt4 = tt3.doubleValue();
        utils.log().info("value2 is " + tt4);

        double tt5 = tt4 - totalTax4;
        BigDecimal tt6 =new BigDecimal(tt5).setScale(4, RoundingMode.HALF_UP);

        String tt7 = String.valueOf(tt6);
//         tt4 = tt4 * 10.0/10.0;
        utils.log().info("Total RoundOff value is " + tt7);

        //Commenting below steps as there is mismatch in exp and act tax when exclusive and tax on item tax are there (LIN-19736)

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

    }

    public void iSelectedInclusiveTaxMenuItemWithTaxOnItemTax()
    {
        elementClick(menu18,"I selected the menu item");
    }

    public void verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemTaxInclusive(double taxAmount1, double taxAmount2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define tax percentage for 1st menu and calculate tax
        double a = taxAmount1 / 100;
        double taxAmount = menuItemAmount4 - (menuItemAmount4 / (1+a));
        utils.log().info("Exact Tax1 is "+taxAmount);


        BigDecimal dd=new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt=new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ss = tt.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is "+ExpectedTax);

        //calculate tax on item tax
        double taxOnItemTax = ss * taxAmount2;
        utils.log().info("Exact Tax2 is "+taxOnItemTax);
        BigDecimal taxOnItemTax1 =new BigDecimal(taxOnItemTax).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt1 =new BigDecimal(taxOnItemTax).setScale(4, RoundingMode.HALF_UP);
        double ss1 = tt1.doubleValue();


        double taxOnItemTax2 = taxOnItemTax1.doubleValue();
        String taxOnItemTaxAmount = String.valueOf(taxOnItemTax2);
        utils.log().info("Expected Tax2 is "+taxOnItemTaxAmount);

        //Calculate total tax
        double totalExpectedTax = bb + taxOnItemTax2;
        BigDecimal totalExpectedTaxAmount =new BigDecimal(totalExpectedTax).setScale(2, RoundingMode.HALF_UP);

        String totalExpectedTaxAmount1 = String.valueOf(totalExpectedTaxAmount);
        utils.log().info("Total Expected Tax is "+totalExpectedTaxAmount1);

        //RoundOff Calculation for 1st Tax
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value for Tax1 is " + RoundOffValue);

        //RoundOff Calculation for 2nd Tax
        double d2 = taxOnItemTax2 - taxOnItemTax;
        BigDecimal ee2 = new BigDecimal(d2).setScale(4, RoundingMode.HALF_UP);
        double ff2 = ee2.doubleValue();
        String RoundOffValue2 = String.valueOf(ff2);
        utils.log().info("RoundOff value for Tax2 is " + RoundOffValue2);

        //total tax
        double totalTax4 = taxAmount + taxOnItemTax;
        utils.log().info("value1 is " + totalTax4);
//          totalTax4 = totalTax4 * 100.0/100.0;
//
//         double tt3 = Math.round(totalTax4 * 100.0)/100.0;
        BigDecimal tt2 =new BigDecimal(totalTax4).setScale(2, RoundingMode.HALF_UP);
        double tt3 = tt2.doubleValue();
        utils.log().info("value2 is " + tt3);

        double tt4 = tt3 - totalTax4;
        BigDecimal tt5 =new BigDecimal(tt4).setScale(4, RoundingMode.HALF_UP);

        String tt6 = String.valueOf(tt5);
//         tt4 = tt4 * 10.0/10.0;
        utils.log().info("Total RoundOff value is " + tt6);


//         //Total RoundOff Calculation
//         double totalRoundOff = ff + ff2;
//         String totalRoundOffValue = String.valueOf(totalRoundOff);
//         utils.log().info("Total RoundOff value is " + totalRoundOffValue);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount1, ActualTax3);
    }

    public void iSelectedMenuItemWithTaxOnCheckTax()
    {
        elementClick(menu19,"I selected the menu item");
    }

    public void iSelectedAllOption()
    {
        elementClick(AllButton,"I selected the ALL option");
    }

    public void iSelectedExclusiveTaxMenuItemWithMixAdMatchDiscout()
    {
        elementClick(menu20,"I selected the menu item");
    }

    public void ApplyMixAndMatchDiscount(String DiscountName)

    {
        elementClick(DiscountBtn, "Selected discount button");
        WebElement Discount =  driver.findElement(By.xpath(DiscountName));
        elementClick(Discount, "Selected the item discount");
        elementClick(BackButton, "Selected the back button");
    }

    public void verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffMixAndMatchExclusive(double taxAmount1)
    {
        double MenuAmountAfterDiscount = 1.32;

        double taxAmount = MenuAmountAfterDiscount * taxAmount1;
        utils.log().info("Exact Tax is "+taxAmount);
        BigDecimal dd=new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is "+ExpectedTax);

        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value for Tax1 is " + RoundOffValue);
    }

    public void category2Selection()
    {
        elementClick(category2,"I selected IceCreams Category");
    }

    public void iSelectedInclusiveTaxMenuItemWithMixAdMatchDiscount()
    {
        elementClick(menu21,"I selected the menu item");
    }

    public void verifyIfTheTaxAndDiscountAreCalculatedProperlyInclusiveBeforeTaxDiscount(double taxAmount, double discountAmount)
    {

        double a = taxAmount / 100;
        double b = discountAmount - (discountAmount / (1+a));
        utils.log().info("Exact tax amount is "+b);


        BigDecimal dd=new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$0 ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa - b;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void iSelectedExclusiveTaxMenuItemWithMixAdMatchDiscountPercentage()
    {
        elementClick(menu22,"I selected the menu item");

    }
    public void iSelectedModifierWithPrefix()
    {

        elementClick(modifier1,"I selected the modifier");
        elementClick(prefix1,"I selected the prefix");
        elementClick(donebtn,"I selected the prefix");

    }

    public void SelectCategory(String CategoryName)

    {
        WebElement Discount =  driver.findElement(By.xpath(CategoryName));
        elementClick(Discount, "Selected the category");
    }

    public void iSelectedMenuItem(String MenuItemName)

    {
        WebElement Discount =  driver.findElement(By.xpath(MenuItemName));
        elementClick(Discount, "Selected the menu item");
    }

    public void iSelectedSize(String Size)
    {
        WebElement Discount =  driver.findElement(By.xpath(Size));
        elementClick(Discount, "Selected the menu item size");
    }

    public void verifyTheExcTaxAndRoundOffCalculation(double taxValue)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is "+a);


        BigDecimal dd=new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa - a;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void verifyTheTotalValueWithFreeItemDiscount(double freeItemValue)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

        double taxAmount4 = Double.parseDouble(ActualTax3);

        double ExpectedTotal = menuItemAmount4 + taxAmount4 + freeItemValue;
        BigDecimal ExpectedTotalValue1 = new BigDecimal(ExpectedTotal).setScale(2,RoundingMode.HALF_UP);
        String ExpectedTotalValue2 = String.valueOf(ExpectedTotalValue1);


        utils.log().info("Expected total is " + ExpectedTotalValue2);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String ActualTotalAmount1 = ActualTotal1.getText();
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue2, ActualTotalValue1);
    }

    public void verifyTheIncTaxAndRoundOffCalculation(double taxValue)
    {
        WebElement menuItemAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount2 = menuItemAmount.getText();

        double menuItemAmount3 = Double.parseDouble(menuItemAmount2);

        double a = taxValue / 100;
        double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is "+b);

        BigDecimal dd=new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is "+ExpectedTax);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is" + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa - b;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void verifyTheTotalValueIncWithFreeItemDiscount(double freeItemValue)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

        double taxAmount4 = Double.parseDouble(ActualTax3);

        double ExpectedTotal = menuItemAmount4  + freeItemValue;
        BigDecimal ExpectedTotalValue1 = new BigDecimal(ExpectedTotal).setScale(2,RoundingMode.HALF_UP);
        String ExpectedTotalValue2 = String.valueOf(ExpectedTotalValue1);


        utils.log().info("Expected total is " + ExpectedTotalValue2);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String ActualTotalAmount1 = ActualTotal1.getText();
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue2, ActualTotalValue1);

    }

    public void verifyTheExcAndIncTaxAndRoundOffCalculation(double taxValue1, double taxValue2)
    {
        //For exclusive
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxValue1;
        utils.log().info("Exact tax1 amount is "+a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd=new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();

        String ExpectedExclusiveTax = String.valueOf(aa);
        utils.log().info("Exclusive tax amount is "+ExpectedExclusiveTax);

        //RoundOffCalculationForExclusiveTax
        double ExcTax = aa - a;
        BigDecimal ee = new BigDecimal(ExcTax).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue1 = String.valueOf(ff);
        utils.log().info("RoundOff value for exclusive is " + RoundOffValue1);

        //For inclusive
        WebElement menuAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuAmount2 = menuAmount.getText();

        double menuAmount11 = Double.parseDouble(menuAmount2);

        double x1 = taxValue2 / 100;
        double y1 = menuAmount11 - (menuAmount11 / (1+x1));
        utils.log().info("Exact tax2 amount is "+y1);

        BigDecimal z1=new BigDecimal(y1).setScale(2, RoundingMode.HALF_UP);
        double xx1=z1.doubleValue();
        utils.log().info("test1 "+xx1);

        String ExpectedInclusiveTax = String.valueOf(xx1);
        utils.log().info("Inclusive tax amount is "+ExpectedInclusiveTax);

        //RoundOffCalculation
        double w1 = xx1 - y1;
        BigDecimal yy1 = new BigDecimal(w1).setScale(4, RoundingMode.HALF_UP);
        double ww1 = yy1.doubleValue();
        String RoundOffValue2 = String.valueOf(ww1);
        utils.log().info("RoundOff value for inclusive tax is " + RoundOffValue2);

        //Total Round-Off calculation
        double totalRoundOff = ff + ww1;
        String totalRoundOff1 = String.valueOf(totalRoundOff);
        utils.log().info("Total RoundOff value is " + totalRoundOff1);

        //Total Tax Calculation
        double TotalExpectedTax = aa + xx1;
        BigDecimal ExpectedTax = new BigDecimal(TotalExpectedTax).setScale(2, RoundingMode.HALF_UP);
        double ExpectedTax1 = ExpectedTax.doubleValue();
        String ExpectedTax2 = String.valueOf(ExpectedTax1);
        utils.log().info("Total tax is " + ExpectedTax1);

        //While having both inclusive and exclusive tax, total tax is mismatching (LIN-19721), so commenting the below steps
        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax2, ActualTax3);
    }

    public void verifyTheTotalValueExcAndIncWithFreeItemDiscount(Double taxValue, Double freeItemValue)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is "+a);

        BigDecimal dd=new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa=dd.doubleValue();
        double ExpectedTotal = menuItemAmount4 + aa + freeItemValue;
        String ExpectedTotal1 = String.valueOf(ExpectedTotal);
        utils.log().info("Expected total amount is "+ExpectedTotal1);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String ActualTotalAmount1 = ActualTotal1.getText();
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotal1, ActualTotalValue1);
    }

    public void SeletcedCheckNumber(String CheckNumber)
    {
        WebElement CheckNum =  driver.findElement(By.xpath(CheckNumber));
        elementClick(CheckNum, "Selected the Check Number");
    }

    public void SeletcedReopenCheckOption()
    {
        elementClick(reopenCheckBtn,"Selected ReOpen Check Option");
    }

    public void iVoidedMenuItem()
    {

    }

}
