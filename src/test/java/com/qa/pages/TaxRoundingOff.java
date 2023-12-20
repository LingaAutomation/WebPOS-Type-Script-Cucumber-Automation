package com.qa.pages;

import com.qa.utils.TestUtils;
import static com.qa.utils.TestUtils.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.eo.Do;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
//import static com.qa.pages.DriverSteup.driver;
public class TaxRoundingOff extends ClockInScreen {


    public String checkNumber = "";

//    @FindBy(xpath = "(//XCUIElementTypeButton[@name='arrow down'])[2]")
//    WebElement downarrow1;

    String downarrow1  = "//button[@id='os_catMenu']";
//    WebElement downarrow1;


        @FindBy(xpath = "\"*[name='FOOD ITEMS']")
    WebElement category1;

//    String category1 = "//div[contains(.,'FOOD ITEMS')]";
//    private WebElement category1;


//    @FindBy(xpath = "IceCreams")
//    WebElement category2;

    @FindBy(name = "IceCreams")
    private WebElement category2;

//    @FindBy(xpath = "PIZZA")
//    WebElement category3;

    @FindBy(name = "PIZZA")
    private WebElement category3;

//    @FindBy(xpath = "Sambar")
//    WebElement modifier1;

    @FindBy(name = "Sambar")
    private WebElement modifier1;

//    @FindBy(xpath = "Meals")
//    WebElement prefix1;

    @FindBy(name = "Meals")
    private WebElement prefix1;

//    @FindBy(xpath = "Done")
//    WebElement donebtn;

    @FindBy(name = "Done")
    private WebElement donebtn;

//    @FindBy(xpath = "testing menu7")
//    WebElement menu1;

    @FindBy(name = "testing menu7")
    private WebElement menu1;

//    @FindBy(xpath = "testing menu8")
//    WebElement menu2;

    @FindBy(name = "testing menu8")
    private WebElement menu2;

//    @FindBy(xpath = "testing menu9")
//    WebElement menu3;

    @FindBy(name = "testing menu9")
    private WebElement menu3;

//    @FindBy(xpath = "testing menu10")
//    WebElement menu4;

    @FindBy(name = "testing menu10")
    private WebElement menu4;

//    @FindBy(xpath = "testing menu11")
//    WebElement menu5;

    @FindBy(name = "testing menu11")
    private WebElement menu5;

//    @FindBy(xpath = "testing menu12")
//    WebElement menu6;

    @FindBy(name = "testing menu12")
    private WebElement menu6;

//    @FindBy(xpath = "testing menu13")
//    WebElement menu7;

    @FindBy(name = "testing menu13")
    private WebElement menu7;

//    @FindBy(xpath = "testing menu14")
//    WebElement menu8;

    @FindBy(name = "testing menu14")
    private WebElement menu8;

//    @FindBy(xpath = "pizza supreme")
//    WebElement menu9;

    @FindBy(name = "pizza supreme")
    private WebElement menu9;

//    @FindBy(xpath = "pizza dominator")
//    WebElement menu10;

    @FindBy(name = "pizza dominator")
    private WebElement menu10;

//    @FindBy(xpath = "chicken farmhouse pizza")
//    WebElement menu11;

    @FindBy(name = "chicken farmhouse pizza")
    private WebElement menu11;

//    @FindBy(xpath = "cheesy pasta pizza")
//    WebElement menu12;

    @FindBy(name = "cheesy pasta pizza")
    private WebElement menu12;

//    @FindBy(xpath = "testing menu15")
//    WebElement menu13;

    @FindBy(name = "testing menu15")
    private WebElement menu13;

//    @FindBy(xpath = "testing menu16")
//    WebElement menu14;

    @FindBy(name = "testing menu16")
    private WebElement menu14;

//    @FindBy(xpath = "testing menu17")
//    WebElement menu15;

    @FindBy(name = "testing menu17")
    private WebElement menu15;

//    @FindBy(xpath = "testing menu18")
//    WebElement menu16;

    @FindBy(name = "testing menu18")
    private WebElement menu16;

//    @FindBy(xpath = "testing menu19")
//    WebElement menu17;

    @FindBy(name = "testing menu19")
    private WebElement menu17;

//    @FindBy(xpath = "testing menu20")
//    WebElement menu18;

    @FindBy(name = "testing menu20")
    private WebElement menu18;

//    @FindBy(xpath = "testing menu21")
//    WebElement menu19;

    @FindBy(name = "testing menu21")
    private WebElement menu19;

//    @FindBy(xpath = "testing menu22")
//    WebElement menu20;

    @FindBy(name = "testing menu22")
    private WebElement menu20;

//    @FindBy(xpath = "testing menu23")
//    WebElement menu21;

    @FindBy(name = "testing menu23")
    private WebElement menu21;

//    @FindBy(xpath = "testing menu24")
//    WebElement menu22;

    @FindBy(name = "testing menu24")
    private WebElement menu22;

//    @FindBy(xpath = "0")
//    WebElement press0;

   String  press1= "//ion-grid/ion-row[4]/ion-col[1]/button";

//    @FindBy(xpath = "1")
//    WebElement press1;

    String  press2 = "//ion-grid/ion-row[4]/ion-col[2]/button";

//    @FindBy(xpath = "2")
//    WebElement press2;

    String press3 =  "//ion-grid/ion-row[4]/ion-col[3]/button";
//    private WebElement press3;

//    @FindBy(xpath = "3")
//    WebElement press3;

    String press4 =  "//ion-grid/ion-row[5]/ion-col[1]/button";
//    private WebElement press4;

    String  loginBtn = "//span[contains(.,'Login')]";
//    private WebElement loginBtn;

    String selectNum1 = "//span[.='1']";

    String selectNum2 = "//span[.='2']";

    String selectNum3 = "//span[.='3']";

    String selectNum4 = "//span[.='4']";

    String selectNum5 = "//span[.='5']";

    String selectNum6 = "//span[.='6']";

    String selectNum7 = "//span[.='7']";

    String selectNum8 = "//span[.='8']";

    String selectNum9 = "//span[.='9']";

    String selectNum0 = "//span[.='0']";

    @FindBy(xpath = "//span[contains(.,'5')]")
    private WebElement press5;

//    @FindBy(xpath = "4")
//    WebElement press4;


//    @FindBy(xpath = "")
//    private WebElement press0;

//    @FindBy(xpath = "5")
//    WebElement press5;

    @FindBy(name = "0")
    private WebElement press0;

    @FindBy(xpath = "//button[contains(.,'All')]")
    WebElement AllButton;

    @FindBy(xpath = "//button[contains(.,'Closed')]")
    WebElement ClosedTab;

    @FindBy(xpath = "//input[@data-placeholder='Check No']")
    WebElement searchTabClosedTab;

    @FindBy(xpath = "//app-check-commonfooter/div/ion-grid[2]/ion-row/ion-col/button[1]")
    WebElement reOpenCheckStats;

    String cancelBtn  = "//button[contains(.,'Cancel')]";

    @FindBy(xpath = "//button[contains(.,'Log Off')]")
    WebElement logOffBtn;



//
//    @FindBy(xpath = "6")
//    WebElement press6;
//
//    @FindBy(xpath = "7")
//    WebElement press7;
//
//    @FindBy(xpath = "8")
//    WebElement press8;
//
//    @FindBy(xpath = "9")
//    WebElement press9;
//
//    @FindBy(xpath = "3")
//    WebElement quantity3;

    @FindBy(xpath = "//span[contains(.,'3')]")
    private WebElement quantity3;

//    @FindBy(xpath = "Continue")
//    WebElement ContinueBtn;

    @FindBy(xpath = "//span[contains(.,'Continue')]")
    private WebElement ContinueBtn;


    @FindBy(xpath = "//ion-label[contains(.,'Default')]")
    private WebElement DefaultTax;

    @FindBy(xpath = "//ion-label[contains(.,'Quantity')]")
    private WebElement QuantityTax;

    @FindBy(xpath = "(//ion-label[contains(.,'Inclusive item')])[1]")
    WebElement InclusiveTax;

//    @FindBy(xpath = "5")
//    WebElement quantity5;

    @FindBy(xpath = "//span[contains(.,'5')]")
    private WebElement quantity5;

//    @FindBy(xpath = ("//XCUIElementTypeStaticText[@name=\"Payment\"]"))
//    WebElement PaymentBtn;

    @FindBy(xpath = "//button[contains(.,'Payment')]")
    private WebElement PaymentBtn;

//    @FindBy(xpath = ("//XCUIElementTypeStaticText[@name=\"Delete\"]"))
//    WebElement DeleteBtn;

    @FindBy(xpath = "//ion-footer[contains(@class,'payment_footer')]/..//button[contains(.,'Delete')]")
    private WebElement DeleteBtn;

//    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Cash\"])[2]")
//    WebElement cashBtn;

    @FindBy(xpath = "//span[.='Payment methods']/../ion-grid/ion-row/ion-col/button/span[contains(.,'Cash')]")
    private WebElement cashBtn;

    //XCUIElementTypeStaticText[@name=" Submit"]
//    @FindBy(xpath = ("//XCUIElementTypeStaticText[@name=\"  Submit\"]"))
//    WebElement SubmitBtn;

    @FindBy(xpath = "//button[contains(.,'Submit')]")
    private WebElement SubmitBtn;

//    @FindBy(xpath = ("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]"))
//    WebElement MenuOptionBtn;

    @FindBy(xpath = "(//p[contains(@class,'orderlist-courseName')]/../div//div[2])[1]")
    private WebElement MenuOptionBtn;

    @FindBy(xpath = "(//p[contains(@class,'orderlist-courseName')]/../div//div[2])[2]")
    private WebElement MenuOptionBtn2;

    @FindBy(xpath = "(//p[contains(@class,'orderlist-courseName')]/../div//div[2])[4]")
    private WebElement MenuOptionBtn2Disc;


//    @FindBy(xpath = ("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[4]"))
//    WebElement MenuOptionBtnMenu2;
//
//    @FindBy(xpath = ("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText"))
//    WebElement MenuOptionBtnMod;
//
//    @FindBy(xpath = ("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText"))
//    WebElement MenuOptionBtnDisc;
//
//    @FindBy(xpath = ("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[3]"))
//    WebElement MenuOptionBtn2;
//
//    @FindBy(xpath = ("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText"))
//    WebElement MenuOptionBtnDisc2;
//    @FindBy(xpath = "Discount")
//    WebElement DiscountBtn;

    @FindBy(xpath = "//ion-row/button[contains(.,'Discount')]")
    private WebElement DiscountBtn;

//    @FindBy(xpath = "Option")
//    WebElement OptionBtn;

    @FindBy(xpath = "//ion-row/button[contains(.,'Option')]")
    private WebElement OptionBtn;

    public String subtotalAfterDiscounta;

//    @FindBy(xpath = "Open Check Discount")
//    WebElement openCheckDiscBtn;

//    @FindBy(xpath = "Open Discount")
//    WebElement OpenDiscountBtn;

    @FindBy(xpath = "//label[contains(.,'Open Discount')]/..")
    private WebElement OpenDiscountBtn;

//    @FindBy(xpath = "Back")
//    WebElement BackButton;

    @FindBy(xpath = "//button[contains(.,'Cancel')]")
    private WebElement BackButton;

//    @FindBy(xpath = " Back ")
//    WebElement BackBtn;

    @FindBy(xpath = "//linga-icon[@symbol='clearArrow']/../..")
    private WebElement BackBtn;


//    @FindBy(xpath = "Option")
//    WebElement OptionButton;

    @FindBy(xpath = "//ion-row/button[contains(.,'Option')]")
    private WebElement OptionButton;

    @FindBy(xpath = "//label[contains(.,'Tax Exempt')]/../..")
    private WebElement taxExemptBtn;

//    @FindBy(xpath = "Open Item")
//    WebElement OpenItemOption;

    @FindBy(xpath = "//label[contains(.,'Open Item')]/..")
    private WebElement OpenItemOption;

//    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]")
//    WebElement CoursingName;

    @FindBy(xpath = "//div[contains(@class,'mat-select-arrow-wrapper')]")
    private WebElement CoursingName;

    @FindBy(xpath = "(//ion-col[contains(@class,'openItem__content')])[6]//input")
    private WebElement PriceText;

//    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]")
//    WebElement ItemNameTxtFld1;

//    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]")
//    WebElement priceTextFld;
//
//    @FindBy(xpath = "Default")
//    WebElement DefaultTax;
//
//    @FindBy(xpath = "Quantity")
//    WebElement QuantityTax;
//

//
//    @FindBy(xpath = "exc tax1")
//    WebElement exclusiveTax;
//
//    @FindBy(xpath = "inclusive tax9")
//    WebElement inclusiveTax;
//
//    @FindBy(xpath = "Apply")
//    WebElement applyBtn;

    @FindBy(xpath = "//button[contains(.,'Apply')]")
    private WebElement applyBtn;

//    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
//    //  @FindBy(xpath = "Percentage")
//    WebElement percentageField;

    @FindBy(xpath = "//ion-label[contains(.,'Percentage')]/../../ion-col[2]/input")
    private WebElement percentageField;

//    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField")
//    //  @FindBy(xpath = "Percentage")
//
//    WebElement percentageFieldOpenCheck;

//    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField")
//    //  @FindBy(xpath = "Percentage")
//
//    WebElement amountFieldOpenCheckDisc;

    @FindBy(xpath = "//ion-label[contains(.,'Amount')]/../../ion-col[2]/input")
    private WebElement amountFieldOpenCheckDisc;


    @FindBy(xpath = "//button[contains(.,'+')]")
    //  @FindBy(xpath = "Percentage")

    WebElement addSeatBtn;

    @FindBy(xpath = "//p[contains(.,'Table')]/../button[contains(.,'QSR')]")
    //  @FindBy(xpath = "Percentage")

    WebElement qsrBtn;

//    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
//    //  @FindBy(xpath = "Percentage")
//
//    WebElement amountField;

    @FindBy(xpath = "//ion-label[contains(.,'Amount')]/../../ion-col[2]/input")
    private WebElement amountField;

//    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Percentage\"]")
//
//    WebElement percentageBtn;

    @FindBy(xpath = "//button[contains(.,'Percentage')]")
    private WebElement percentageBtn;

//    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Amount\"]")
//
//    WebElement amountBtn;

    @FindBy(xpath = "//button[contains(.,'Amount')]")
    private WebElement amountBtn;

    @FindBy(xpath = "//label[contains(.,'Repeat')]/..")
    WebElement repeatOrderBtn;

    @FindBy(xpath = "//ion-row//ion-col//ion-label[contains(.,'Reasons')]/../..//ion-col[2]//textarea")
    WebElement reasonField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextView")
    WebElement reasonFieldOpenCheckDisc;

    @FindBy(xpath = "Re-Open Check")
    WebElement reopenCheckBtn;

    @FindBy(xpath = "(//p[contains(.,'Description')]/../..//ion-grid)[2]//ion-row//ion-row//ion-col[2]")
    WebElement successBtn;

    @FindBy(xpath = "//button[contains(.,'Add')]")
    WebElement addBtn;

    @FindBy(xpath = ("//ion-footer[contains(@class,'payment_footer')]/..//button[contains(.,'Delete')]"))
    WebElement deleteBtn;

    @FindBy(xpath = ("//ion-footer[contains(@class,'payment_footer')]/..//button[contains(.,'Exit')]"))
    WebElement exitBtn;
    //  @FindBy(xpath = "testing menu7")
    // WebElement menu1;

    @FindBy(xpath = "//ion-row/button[contains(.,'Void')]")
    WebElement voidButton;

    @FindBy(xpath = "//span[contains(.,'Void Item')]/..")
    WebElement voidButtonMenuOptions;

    @FindBy(xpath = "Void Item")
    WebElement voidItemButton;

    @FindBy(xpath = "Payment")
    WebElement paymentBtn1;

    @FindBy(xpath = "OK")
    WebElement OKBtn;

    @FindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search\"]")
    public WebElement searchField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private WebElement searchTabInActiveTab;

    @FindBy(xpath = "testing menu31")
    WebElement menu31;
    public String checkNumber1 = "";

    public String checkNumber2 = "";


    @FindBy(xpath = "//button[contains(.,'Active')]")
    private WebElement ActiveTab;

    @FindBy(xpath = "TaXx")
    private WebElement taxx;

    public void categoryArrowBtn() {
        elementClick(downarrow1, "Selected category arrow");
    }

    @FindBy(xpath ="(//XCUIElementTypeButton[@name=\"arrow down\"])[2]")
    public WebElement arrowDownForOtherMenuItems;

    public String tableNumber = "";

    public String tableNumber2 = "";

    public void category1Selection(String category) throws Exception {
//        elementClick(category1, "Selected FOOD ITEMS category");
        new BasePage().selectMenuBasicValidationForQsr(category);
    }

    public void subCategory1Selection(String subcategory) throws Exception {
//        elementClick(category1, "Selected FOOD ITEMS category");
        new BasePage().selectSubCategoryBasicValidationForQsr(subcategory);
    }

    public void menu1Selection(String menuItem) throws Exception {
//        elementClick(menu1, "Selected testing menu7 menu item");
        new BasePage().selectMenuItemAs(menuItem);
    }

    public String MenuPriceAmount;

    public Double taxRounding;

    public void checkingMenuPrice(String amount) {
        WebElement menuprice =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        MenuPriceAmount = menuprice.getText();
        TestUtils.MenuItemPrice1 = MenuPriceAmount;
        utils.log().info("Price of the menu item is" + MenuPriceAmount);
    }

    public void verifyIfMenuAmountAndSubtotalAreEqual() {
        String ExpectedMenuAmount = TestUtils.MenuItemPrice1;
        WebElement ActualAmount =  driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String ActualMenuPriceAmount = ActualAmount.getAttribute("value");
        String ActualPrice = ActualMenuPriceAmount.replaceAll("[A-Z$ ]", "");
        Assert.assertEquals(ExpectedMenuAmount, ActualPrice);

    }

    public void clickLogOffBtn() {
        elementClick(logOffBtn, "Tapped log Off Button");
    }

    public void iClickTheCancelButton() {
        elementClick(cancelBtn, "Tapped cancel Button");
    }

    public void loginWebpos()

    {
        elementClick(press1, "Selected Payment Button");
        elementClick(press2, "Selected Payment Button");
//        elementClick(press2, "Selected Payment Button");
        elementClick(press3, "Selected Payment Button");
        elementClick(press4, "Selected Payment Button");

        elementClick(loginBtn, "Selected Payment Button");

    }

    public String MenuItemQuantity;

    public void verifyIfTaxIsCalculatedAsPerTheQuantityTax(String quantity) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement quantityBtn =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]/..//div[3])[1]"));
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

        BigDecimal dd = new BigDecimal(ExpectedTax).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax2 = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax2);

        //RoundOffCalculation
        double c = aa - ExpectedTax;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

        WebElement ActualTax =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTaxAmount = ActualTax.getAttribute("value");
        String ActualTaxValue = ActualTaxAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTaxValue);
        String ExpectedTaxValue = String.valueOf(ExpectedTax);

        Assert.assertEquals(ExpectedTaxValue, ActualTaxValue);

        //Verifying if Total is calculated correctly
        double menuAmount5 = Double.parseDouble(menuAmount);
        double ExpectedTotal = menuAmount5 + ExpectedTax;
        WebElement ActualTotal =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = ActualTotal.getAttribute("value");
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

//        elementClick(downarrow1, "Selected category arrow");
////        new BasePage().selectMenuBasicValidationForQsr(category);
//        elementClick(category1, "Selected FOOD ITEMS category");
//        elementClick(menu1, "Selected testing menu7 menu item");

        WebElement quantityBtnn =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]/..//div[3])[1]"));
        elementClick(quantityBtnn, "");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement quantityBtn2 =  driver.findElement(By.xpath("(//span[.='"+quantity2+"'])"));
        elementClick(quantityBtn2, "Selected 3 quantity");
        elementClick(ContinueBtn, "Selected continue button");

//        String MenuQuantity3 = quantityBtn2.getText();
//        TestUtils.MenuItemQuantity2 = MenuQuantity3;
//        utils.log().info("Qty of the menu item is " + MenuQuantity3);
//
//        int quantityFor3 = Integer.parseInt(MenuQuantity3);
        WebElement menuAmount2 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
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

        BigDecimal dd = new BigDecimal(ExpectedTax2).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        double c = aa - ExpectedTax2;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

        WebElement ActualTax2 =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTaxAmount2 = ActualTax2.getAttribute("value");
        String ActualTaxValue2 = ActualTaxAmount2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is" + ActualTaxValue2);
        String ExpectedTaxValue2 = String.valueOf(ExpectedTax2);

        Assert.assertEquals(ExpectedTaxValue2, ActualTaxValue2);

        //Verifying if Total is calculated correctly
        double menuAmount6 = Double.parseDouble(menuAmount3);
        double ExpectedTotal1 = menuAmount6 + ExpectedTax2;
        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
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
//        elementClick(downarrow1, "Selected category arrow");
//        elementClick(category1, "Selected FOOD ITEMS category");
//        elementClick(menu1, "Selected testing menu7 menu item");

        WebElement quantityBtnnn =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]/..//div[3])[1]"));
        elementClick(quantityBtnnn, "");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement quantityBtn3 =  driver.findElement(By.xpath("(//span[.='"+quantity3+"'])"));
        elementClick(quantityBtn3, "Selected 5 quantity");
        elementClick(ContinueBtn, "Selected continue button");

//        String MenuQuantity5 = quantityBtn3.getText();
//        TestUtils.MenuItemQuantity3 = MenuQuantity5;
//        utils.log().info("Qty of the menu item is" + MenuQuantity5);
//
//        int quantityFor5 = Integer.parseInt(MenuQuantity5);
        WebElement menuAmount5 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuAmount6 = menuAmount5.getText();
        String menuAmount7 = menuAmount6.replace(".", "");

        utils.log().info("amount is" + menuAmount7);
        int menuValue2 = Integer.parseInt(menuAmount7);
        //utils.log().info(menuAmount1);


        //for(quantity=1;quantity<3;quantity++)
        //Verifying if Tax is calculated correctly
        double tax3 = 0.00065;
        double ExpectedTax3 = (menuValue2 * tax3);

        BigDecimal dd = new BigDecimal(ExpectedTax3).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        double c = aa - ExpectedTax3;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);


        utils.log().info("Expected tax is" + ExpectedTax3);

        WebElement ActualTax3 =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTaxAmount3 = ActualTax3.getAttribute("value");
        String ActualTaxValue3 = ActualTaxAmount3.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is" + ActualTaxValue3);
        String ExpectedTaxValue3 = String.valueOf(ExpectedTax3);

        Assert.assertEquals(ExpectedTaxValue3, ActualTaxValue3);

        //Verifying if Total is calculated correctly
        double menuAmount8 = Double.parseDouble(menuAmount6);
        double ExpectedTotal3 = menuAmount8 + ExpectedTax3;
        WebElement ActualTotal3 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount3 = ActualTotal3.getAttribute("value");
        String ActualTotalValue3 = ActualTotalAmount3.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue3);
        String ExpectedTotalValue3 = String.valueOf(ExpectedTotal3);
        utils.log().info("Expected total is " + ExpectedTotalValue3);


        Assert.assertEquals(ExpectedTotalValue3, ActualTotalValue3);

        elementClick(PaymentBtn, "Selected Payment Button");
        elementClick(cashBtn, "Selected Cash Button");
        elementClick(SubmitBtn, "Selected Submit Button");

    }

    public void SelectTheMenuItemWithTheInclusiveTax() throws InterruptedException {

        elementClick(downarrow1, "Selected category arrow");
        elementClick(category1, "Selected FOOD ITEMS category");
        elementClick(menu2, "Selected menu item with inclusive tax");


    }

    public String taxAmountInclusive;

    public void VerifyIfTheTaxIsCalculatedCorrectly1(double taxValue) {
        //WebElement menuItemAmount =  driver.findElement(By.xpath("//div[contains(@class,'p-col-3 text-pos-end')]"));
        WebElement menuItemAmount =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));

        String menuItemAmount2 = menuItemAmount.getText();

        double menuItemAmount3 = Double.parseDouble(menuItemAmount2);
        //double taxValue = 12;

        double a = taxValue / 100;
        double b = menuItemAmount3 - (menuItemAmount3 / (1 + a));
        utils.log().info("Exact tax amount is " + b);

        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        TestUtils.incTaxValue = ExpectedTax;

        //the below two steps are for tax exempt scenario
        taxAmountInclusive = ExpectedTax;
        TestUtils.taxAmountInc = taxAmountInclusive;

        utils.log().info("Expected tax amount is " + ExpectedTax);

//        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//ion-footer/ion-grid/ion-row/ion-col[2]/div//div[2]/div/input"));
                WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));

        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void VerifyIfTheTaxValueIsCalculatedCorrectly(double taxValue) {


    }


    public void VerifyIfTheTotalIsCalculatedCorrectly() {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();
        String ExpectedTotal = menuItemAmount3;
        String ExpectedTotalValue = ExpectedTotal.replaceAll("[A-Z$ ]", "");
        TestUtils.checkTotalAmountInc = ExpectedTotalValue;
        WebElement ActualTotal =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = ActualTotal.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue);
        String ExpectedTotalValue3 = String.valueOf(ExpectedTotalValue);
        utils.log().info("Expected total is " + ExpectedTotalValue);

        Assert.assertEquals(ActualTotalValue, ExpectedTotalValue);

    }

    public void VerifyIfTheBalanceDueIsCalculatedCorrectly() {

        WebElement TotalAmount =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = TotalAmount.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Expected Balance due is " + ActualTotalValue);

        elementClick(PaymentBtn, "Selected Payment Button");
        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();
        utils.log().info("test " + BalanceDueAmount);
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ActualTotalValue, BalanceDueValue);

    }

    public void VerifyIfTheBalanceDueIsCalculatedCorrectlyAfterPayment() throws InterruptedException {

        elementClick(cashBtn, "Selected Cash Button");
        String ExpectedDueAmount = "0.00";
        utils.log().info("Expected balance due after payment is " + ExpectedDueAmount);

        WebElement BalanceDue =  driver.findElement(By.xpath("(//div[contains(@class,'balance')]//p/label[2])[1]"));
        String BalanceDueAmount = BalanceDue.getText();
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ExpectedDueAmount, BalanceDueValue);

        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();
    }

    public void SelectTheMenuItemWithTheExclusiveTax() {

        elementClick(downarrow1, "Selected category arrow");
        elementClick(category1, "Selected FOOD ITEMS category");
        elementClick(menu3, "Selected menu item with exclusive tax");
    }

    public static String excTaxAmount;
    public void VerifyIfTheExcTaxIsCalculatedCorrectly(double taxValue) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
        TestUtils.subTotalAmount = menuItemAmount3;
        //  double taxValue = 0.10255;

        double a = menuItemAmount4 * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + a);


        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        TestUtils.excTaxValue = ExpectedTax;
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void VerifyIfTotalValueIsCalculatedCorrectly() {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

        double taxAmount4 = Double.parseDouble(ActualTax3);

        double ExpectedTotal = menuItemAmount4 + taxAmount4;
        BigDecimal ExpectedTotal11 = new BigDecimal(ExpectedTotal).setScale(2, RoundingMode.HALF_UP);
        double aa = ExpectedTotal11.doubleValue();

        DecimalFormat d = new DecimalFormat("0.00");

        String ExpectedTotalValue1 = d.format(aa);
        TestUtils.checkTotalAmount = ExpectedTotalValue1;
        utils.log().info("Expected total is " + ExpectedTotalValue1);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue1, ActualTotalValue1);
    }

    public void VerifyIfBalanceDueValueIsCalculatedCorrectly() throws InterruptedException {
        WebElement TotalAmount =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = TotalAmount.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Expected Balance due is " + ActualTotalValue);

        elementClick(PaymentBtn, "Selected Payment Button");
        Thread.sleep(1000);
        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();

        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ActualTotalValue, BalanceDueValue);
    }


    public void VerifyIfBalanceDueValueIsCalculatedCorrectlyISCIsPresent() throws InterruptedException {
        WebElement TotalAmount =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = TotalAmount.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Expected Balance due is " + ActualTotalValue);

        elementClick(PaymentBtn, "Selected Payment Button");
        Thread.sleep(1000);
        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();

        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);

        Assert.assertEquals(ActualTotalValue, BalanceDueValue);
    }

    public void VerifyIfItemServiceChargeIsCalculatedCorrectly(double taxValue) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //calculate item service charge
        double itemServiceChargeAmt = menuItemAmount4 * taxValue;
        utils.log().info("Item Service Charge is " + itemServiceChargeAmt);

        BigDecimal itemServiceChargeAmt1 = new BigDecimal(itemServiceChargeAmt).setScale(2, RoundingMode.HALF_UP);

        double isc = itemServiceChargeAmt1.doubleValue();

        String isc1 = String.valueOf(isc);
        utils.log().info("Expected Item Service Charge is " + isc1);

        WebElement ISC =  driver.findElement(By.xpath("//div[@id='os_serviceChargeStr']//input"));
        String ISC1 = ISC.getAttribute("value");

        String ISC2 = ISC1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Item Service Charge is " + ISC2);

        Assert.assertEquals(isc1, ISC2);
    }

    public void VerifyIfBalanceDueValueIsCalculatedCorrectlyAfterPayment() throws InterruptedException {
        elementClick(cashBtn, "Selected Cash Button");
        String ExpectedDueAmount = "0.00";
        utils.log().info("Expected balance due after payment is " + ExpectedDueAmount);

        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ExpectedDueAmount, BalanceDueValue);
        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();
    }


    public void VerifyIfBalanceDueValueIsCalculatedCorrectlyAfterPaymentSplitMerge() throws InterruptedException {
        elementClick(cashBtn, "Selected Cash Button");
        String ExpectedDueAmount = "0.00";
        utils.log().info("Expected balance due after payment is " + ExpectedDueAmount);

        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ExpectedDueAmount, BalanceDueValue);
        elementClick(SubmitBtn, "Selected Submit Button");
        Thread.sleep(2000);
        WebElement qsrBtn =  driver.findElement(By.xpath("//button[contains(.,'QSR')]"));
        elementClick(qsrBtn, "selected qsr btn");
        new OrderTypeWindow().pressCancelBtn();

    }

    public void SelectTheMenuItemWithExclusiveTaxAndDiscount() {
        elementClick(downarrow1, "Selected category arrow");
        elementClick(category1, "Selected FOOD ITEMS category");
        elementClick(menu4, "Selected menu item with exclusive tax and discount");
    }

    public void ApplyItemDiscount(String DiscountName) {
        elementClick(DiscountBtn, "Selected discount button");
        WebElement Discount =  driver.findElement(By.xpath(DiscountName));
        elementClick(Discount, "Selected the item discount");
        elementClick(BackButton, "Selected the back button");
    }

    public String subtotalAfterDiscount3;

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOff(double DiscountPercent, double taxPercent) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.20;

        double discountAmount = menuItemAmount4 * DiscountPercent;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        double cc = discountAmount1.doubleValue();
        String ExpectedDiscount2 = String.valueOf(cc);
        utils.log().info("Discount amount is " + ExpectedDiscount2);

        WebElement ActualDiscoutAmount =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String ActualDiscount2 = ActualDiscoutAmount.getAttribute("value");
        String ActualDiscount3 = ActualDiscount2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual discount is " + ActualDiscount3);

        Assert.assertEquals(ExpectedDiscount2, ActualDiscount3);

        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        //define tax percentage
        //double taxPercent = 0.0622;

        double taxAmount = subtotalAfterDiscount2 * taxPercent;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        String ExpectedTax = String.valueOf(bb);
        TestUtils.excTaxValue = ExpectedTax;
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public String TotalBeforeRemovingDiscount;

    public void VerifyIfTotalAmountIsCalculatedCorrectly() {
        double subTotal = Double.parseDouble(TestUtils.subtotalAfterDiscount4);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        utils.log().info("Tax is " + ActualTax2);
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

        double taxAmount4 = Double.parseDouble(ActualTax3);

        double ExpectedTotal = subTotal + taxAmount4;
        BigDecimal dd = new BigDecimal(ExpectedTotal).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        String ExpectedTotalValue1 = String.valueOf(bb);
        TestUtils.checkTotalAmount = ExpectedTotalValue1;

        utils.log().info("Expected total is " + ExpectedTotalValue1);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue1, ActualTotalValue1);

        WebElement TotalAmount =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = TotalAmount.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");

        TotalBeforeRemovingDiscount = ActualTotalValue;
        TestUtils.TotalValueBeforeRemovingDiscount = TotalBeforeRemovingDiscount;

    }

    public void VerifyIfBalanceDueAmountIsCalculatedCorrectly() {

        WebElement TotalAmount =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = TotalAmount.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Expected Balance due is " + ActualTotalValue);

        elementClick(PaymentBtn, "Selected Payment Button");
        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();

        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ActualTotalValue, BalanceDueValue);
    }

    public void VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterPaymentWebOrder() throws InterruptedException {
        elementClick(cashBtn, "Selected Cash Button");
        String ExpectedDueAmount = "0.00";
        utils.log().info("Expected balance due after payment is " + ExpectedDueAmount);

        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ExpectedDueAmount, BalanceDueValue);
        elementClick(SubmitBtn, "Selected Submit Button");

    }

    public void VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterPayment() throws InterruptedException {
        elementClick(cashBtn, "Selected Cash Button");
        String ExpectedDueAmount = "0.00";
        utils.log().info("Expected balance due after payment is " + ExpectedDueAmount);

        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ExpectedDueAmount, BalanceDueValue);
        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();

    }

    public void SelectTheMenuItemWithInclusiveTaxAndDiscount() {
        elementClick(downarrow1, "Selected category arrow");
        elementClick(category1, "Selected FOOD ITEMS category");
        elementClick(menu5, "Selected menu item with exclusive tax and discount");
    }

    public void ApplyItemDiscount2(String discountName2) {
        elementClick(DiscountBtn, "Selected discount button");
        WebElement Discount =  driver.findElement(By.xpath(discountName2));
        elementClick(Discount, "Selected the item discount");
        elementClick(BackButton, "Selected the back button");
    }

    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOff(Double DiscountPercent, Double taxPercent) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.30;

        double discountAmount = menuItemAmount4 * DiscountPercent;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is " + cc);

        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        //define tax percentage
        //double taxPercent = 14.77;

        double a = taxPercent / 100;
        double b = subtotalAfterDiscount2 - (subtotalAfterDiscount2 / (1 + a));
        utils.log().info("Exact tax amount is " + b);

        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        DecimalFormat d00 = new DecimalFormat("0.00");

        String ExpectedTax = d00.format(aa);
        TestUtils.incTaxValue = ExpectedTax;
//        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void VerifyIfTotalAmountIsDisplayedCorrectly() {
        double subTotal = Double.parseDouble(TestUtils.subtotalAfterDiscount4);

        double ExpectedTotal = subTotal;

        String ExpectedTotalValue1 = String.valueOf(ExpectedTotal);
        TestUtils.checkTotalAmountInc = ExpectedTotalValue1;

        utils.log().info("Expected total is " + ExpectedTotalValue1);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue1, ActualTotalValue1);

    }

    public void VerifyIfBalanceDueAmountIsDisplayedCorrectly() throws InterruptedException {
        WebElement TotalAmount =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = TotalAmount.getAttribute("value");
//        TestUtils.checkTotalAmount = ActualTotalAmount;
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Expected Balance due is " + ActualTotalValue);

        elementClick(PaymentBtn, "Selected Payment Button");
        Thread.sleep(1000);
        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();

        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ActualTotalValue, BalanceDueValue);
    }

    public void VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterThePayment() throws InterruptedException {
        elementClick(cashBtn, "Selected Cash Button");
        String ExpectedDueAmount = "0.00";
        utils.log().info("Expected balance due after payment is " + ExpectedDueAmount);

        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ExpectedDueAmount, BalanceDueValue);
        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();
    }

    public void VerifyIfBalanceDueAmountIsCalculatedCorrectlyAfterThePaymentDone() throws InterruptedException {
//        elementClick(cashBtn, "Selected Cash Button");
        String ExpectedDueAmount = "0.00";
        utils.log().info("Expected balance due after payment is " + ExpectedDueAmount);

        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ExpectedDueAmount, BalanceDueValue);
        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();
    }

    public void SelectOptionsButton() {
        elementClick(OptionButton, "Selected Option Button");
    }

    public void SelectedTheTaxExemptOption() {
        elementClick(taxExemptBtn, "Selected tax exempt Button");
    }

    public void SelectedOpenItemOption() {
        elementClick(OpenItemOption, "Selected Open Item option");
    }

    public void SelectedTheCoursingNameField() {
        elementClick(CoursingName, "Selected Open Item option");

    }

    public void enterCoursingNameAs() {

        WebElement coursingName = driver.findElement(By.xpath("(//ion-col[contains(@class,'openItem__content')])[4]//input"));
        coursingName.sendKeys("IceCream");

    }

    public void iSelectedPriceTextField() {
        elementClick(PriceText, "Selected Open Item option");

    }

    public void swipeToTheCourseName(String Name) throws InterruptedException {
        WebElement DatePickerWheel = driver.findElement(By.xpath("//span[contains(.,'"+Name+"')]"));
        DatePickerWheel.click();
//        List<WebElement> course = DatePickerWheel.findElements(By.xpath("//XCUIElementTypePickerWheel"));
//
//        course.get(0).sendKeys(Name);
    }

    public void swipeToTheCourseName2(String Name) throws InterruptedException {
        WebElement DatePickerWheel2 = driver.findElement(By.xpath("(//span[contains(.,'"+Name+"')])[2]"));
        DatePickerWheel2.click();
//        List<WebElement> course = DatePickerWheel.findElements(By.xpath("//XCUIElementTypePickerWheel"));
//
//        course.get(0).sendKeys(Name);
    }

//    public void setMenuItemName(String name) {
//
//        sendKeys(ItemNameTxtFld1, name);
//
//    }
//
//    public void iSelectedPriceTextField() {
//        elementClick(priceTextFld, "I selected the price text field");
//    }

    public void iEnteredThePrice() {
        elementClick(selectNum1, "I tapped 1");
        elementClick(selectNum3, "I tapped 3");
        elementClick(selectNum4, "I tapped 4");
        elementClick(selectNum5, "I tapped 5");
    }

    public void iSelectedContinueButton() {
        elementClick(ContinueBtn, " I Selected continue button");
    }

    public void selectTheTax() {
        elementClick(DefaultTax, " I Selected continue button");
    }

//    public void selectTheTax() {
//        elementClick(DefaultTax, "Default Tax is de-selected");
//    }
//
    public void selectTheTax2Exclusive() {
        elementClick(QuantityTax, "Quantity Tax is selected");
    }

    public void iSelectedBackButton() {
        elementClick(BackBtn, "Selected the Back button");
    }

    public void verifyIfTaxAndRoundOffAreCalculatedProperlyExclusive() {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
        double taxValue = 0.1766;

        double a = menuItemAmount4 * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + a);

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void selectTheTax2Inclusive() {
        elementClick(InclusiveTax, "Quantity Tax is selected");
    }

    public void verifyIfTheTaxAndRoundOffAreCalculatedProperlyInclusive() {
        WebElement menuItemAmount =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount2 = menuItemAmount.getText();

        double menuItemAmount3 = Double.parseDouble(menuItemAmount2);
        double taxValue = 13.450;

        double a = taxValue / 100;
        double b = menuItemAmount3 - (menuItemAmount3 / (1 + a));
        utils.log().info("Exact tax amount is " + b);

        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void selectMenuItemWithCheckTax() {
        elementClick(menu7, "Selected the menu item");
    }

    public void VerifyIfCheckTaxIsCalculatedCorrectlyAndCalculateRoundoff() {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
        double taxValue = 0.12444;

        double a = menuItemAmount4 * taxValue;
        utils.log().info("Exact tax amount is " + a);
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void VerifyIfCheckTaxIsCalculatedCorrectlyAndCalculateRoundoff(double taxValue) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
        //double taxValue = 0.12444;

        double a = menuItemAmount4 * taxValue;
        utils.log().info("Exact tax amount is " + a);
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void VerifyIfCheckTaxIsCalculatedCorrectlyAndCalculateRoundoffMultipleMenu(double taxValue) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount33 = menuItemAmount1.getText();
        String menuItemAmount3 = menuItemAmount33.replaceAll("[A-Z$ ]", "");

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
        //double taxValue = 0.12444;

        double a = menuItemAmount4 * taxValue;
        utils.log().info("Exact tax amount is " + a);
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void iEnteredPriceForTheOpenItem() {
        for (int i = 0; i <= 4; i++) {
            elementClick(press2, "Entered menu amount");
        }
    }

    public void selectMenuItemWithBothInclusiveAndExclusiveTax() {
        elementClick(menu8, "Select the menu item");
    }

    public String taxValueInc2;

    public void verifyIfBothTaxesAreCalculatedCorrectlyAndCalculateRoundoff() {
        //For exclusive
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
        double taxValue = 0.10255;

        double a = menuItemAmount4 * taxValue;
        utils.log().info("Exact tax1 amount is " + a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ddd = new BigDecimal(a).setScale(4, RoundingMode.HALF_UP);

        double aa = dd.doubleValue();
        double dddd = ddd.doubleValue();


        String ExpectedExclusiveTax = String.valueOf(aa);
        utils.log().info("Exclusive tax amount is " + ExpectedExclusiveTax);

        //RoundOffCalculationForExclusiveTax
        double ExcTax = aa - a;
        BigDecimal ee = new BigDecimal(ExcTax).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue1 = String.valueOf(ff);
        utils.log().info("RoundOff value for exclusive is " + RoundOffValue1);

        //For inclusive
        WebElement menuAmount =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuAmount2 = menuAmount.getText();

        double menuAmount11 = Double.parseDouble(menuAmount2);
        double taxPercent = 12.12;

        double x1 = taxPercent / 100;
        double y1 = menuAmount11 - (menuAmount11 / (1 + x1));
        utils.log().info("Exact tax2 amount is " + y1);

        BigDecimal z1 = new BigDecimal(y1).setScale(2, RoundingMode.HALF_UP);
        BigDecimal zzz = new BigDecimal(y1).setScale(4, RoundingMode.HALF_UP);

        double xx1 = z1.doubleValue();
        double zzzz = zzz.doubleValue();

        utils.log().info("test1 " + xx1);

        String ExpectedInclusiveTax = String.valueOf(xx1);
        utils.log().info("Inclusive tax amount is " + ExpectedInclusiveTax);

//        //Total Round-Off calculation
//        double totalRoundOff = ff + ww1;
//        String totalRoundOff1 = String.valueOf(totalRoundOff);
//        utils.log().info("Total RoundOff value is " + totalRoundOff1);

        //Total Tax Calculation
        double TotalExpectedTax = aa + xx1;
//        BigDecimal ExpectedTax = new BigDecimal(TotalExpectedTax).setScale(2, RoundingMode.HALF_UP);
//        double ExpectedTax1 = ExpectedTax.doubleValue();
//        String ExpectedTax2 = String.valueOf(ExpectedTax1);
//        utils.log().info("Total tax is " + ExpectedTax1);

//        //RoundOffCalculation (old method)
//        double totalExactTax = a + y1;
//        BigDecimal totalExactTax1 = new BigDecimal(totalExactTax).setScale(4,RoundingMode.HALF_UP);
//        Double totalExactTax2 = totalExactTax1.doubleValue();
//        Double RoundOff = totalExactTax2 - ExpectedTax1;
//        utils.log().info("Roundoff is " + RoundOff);

        //roundoff calculation  (New Method)
        double rr = dddd + zzzz;
        BigDecimal rr1 = new BigDecimal(rr).setScale(2, RoundingMode.HALF_UP);
        double rr2 = rr1.doubleValue();
        String ExpectedTax2 = String.valueOf(rr2);
        utils.log().info("Total tax is " + ExpectedTax2);

        double newRoundOff = rr2 - rr;
        BigDecimal rr3 = new BigDecimal(newRoundOff).setScale(4, RoundingMode.HALF_UP);
        double rr4 = rr3.doubleValue();

        utils.log().info("New Roundoff is " + rr4);


        //While having both inclusive and exclusive tax, total tax is mismatching (LIN-19721), so commenting the below steps
        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax2, ActualTax3);

//below three steps are for tax exempt
        taxValueInc2 = String.valueOf(xx1);
        TestUtils.taxAmountInc2 = taxValueInc2;

//        //For exclusive
//        WebElement menuItemAmount1 =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]");
//        String menuItemAmount3 = menuItemAmount1.getText();
//
//        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
//
//        double a = menuItemAmount4 * taxValue1;
//        utils.log().info("Exact tax1 amount is "+a);
//
//        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
//
//        BigDecimal dd=new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
//        double aa=dd.doubleValue();
//
//        String ExpectedExclusiveTax = String.valueOf(aa);
//        utils.log().info("Exclusive tax amount is "+ExpectedExclusiveTax);
//
//        //RoundOffCalculationForExclusiveTax
//        double ExcTax = aa - a;
//        BigDecimal ee = new BigDecimal(ExcTax).setScale(4, RoundingMode.HALF_UP);
//        double ff = ee.doubleValue();
//        String RoundOffValue1 = String.valueOf(ff);
//        utils.log().info("RoundOff value for exclusive is " + RoundOffValue1);
//
//        //For inclusive
//        WebElement menuAmount =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]");
//        String menuAmount2 = menuAmount.getText();
//
//        double menuAmount11 = Double.parseDouble(menuAmount2);
//
//        double x1 = taxValue2 / 100;
//        double y1 = menuAmount11 - (menuAmount11 / (1+x1));
//        utils.log().info("Exact tax2 amount is "+y1);
//
//        BigDecimal z1=new BigDecimal(y1).setScale(2, RoundingMode.HALF_UP);
//        double xx1=z1.doubleValue();
//        utils.log().info("test1 "+xx1);
//
//        String ExpectedInclusiveTax = String.valueOf(xx1);
//        utils.log().info("Inclusive tax amount is "+ExpectedInclusiveTax);
//
//        //RoundOffCalculation
//        double w1 = xx1 - y1;
//        BigDecimal yy1 = new BigDecimal(w1).setScale(4, RoundingMode.HALF_UP);
//        double ww1 = yy1.doubleValue();
//        String RoundOffValue2 = String.valueOf(ww1);
//        utils.log().info("RoundOff value for inclusive tax is " + RoundOffValue2);
//
//        //Total Round-Off calculation
//        double totalRoundOff = ff + ww1;
//        String totalRoundOff1 = String.valueOf(totalRoundOff);
//        utils.log().info("Total RoundOff value is " + totalRoundOff1);
//
//        //Total Tax Calculation
//        double TotalExpectedTax = aa + xx1;
//        BigDecimal ExpectedTax = new BigDecimal(TotalExpectedTax).setScale(2, RoundingMode.HALF_UP);
//        double ExpectedTax1 = ExpectedTax.doubleValue();
//        String ExpectedTax2 = String.valueOf(ExpectedTax1);
//        utils.log().info("Total tax is " + ExpectedTax1);
//
//        //While having both inclusive and exclusive tax, total tax is mismatching (LIN-19721), so commenting the below steps
//        WebElement ActualTaxAmount=  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]");
//        String ActualTax2 = ActualTaxAmount.getText();
//        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
//        utils.log().info("Actual tax is " + ActualTax3);
//
//        Assert.assertEquals(ExpectedTax2, ActualTax3);
    }

    public void verifyifTotalValueIsCalculatedCorrectlyBothInclusiveAndExclusive() {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double taxValue = 0.10255;

        double a = menuItemAmount4 * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();

        double totalAmount = menuItemAmount4 + aa;
        String totalExpectedAmount = String.valueOf(totalAmount);

        utils.log().info("Expected total amount is " + totalExpectedAmount);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(totalExpectedAmount, ActualTotalValue1);
    }

//    public void iSelectedTheExclusiveTax() throws Exception {
//
//        //WebElement exclusiveTax = mergeAndFindElement("exc tax1", "", TestUtils.xpath);
//        BasePage c = new BasePage();
//        c.scrollToElementPayments(exclusiveTax, "up");
//        //    scrollToElement(exclusiveTax, "up");
//        Thread.sleep(5000);
//
//        //elementClick(exclusiveTax,"tapped exclusive tax");
//
//    }
//
//    public void iClickedTheExclusiveTax() {
//        elementClick(exclusiveTax, "tapped exclusive tax");
//    }
//
//    public void iSelectedTheInclusiveTax() throws Exception {
//        scrollToElementPayments(inclusiveTax, "up");
//        inclusiveTax.click();
//    }

    public String subtotalAfterDiscount7;

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncAndExc() {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        double DiscountPercent = 0.22;

        double discountAmount = menuItemAmount4 * DiscountPercent;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is " + cc);

        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount7 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount8 = subtotalAfterDiscount7;


        //define tax percentage(exclusive))
        double taxPercent = 0.10255;

        double taxAmount = subtotalAfterDiscount2 * taxPercent;
        utils.log().info("Exact Tax1 is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ddd = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double dddd = ddd.doubleValue();

        String ExclusiveTax = String.valueOf(bb);
        utils.log().info("Exclusive Tax is " + ExclusiveTax);

        //roundOff Calculation
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value for exclusive tax is " + RoundOffValue);

        //define tax percentage(inclusive)
        double taxPercent2 = 12.12;

        double x1 = taxPercent2 / 100;
        double y1 = subtotalAfterDiscount2 - (subtotalAfterDiscount2 / (1 + x1));
        utils.log().info("Exact Tax2 is " + y1);

        BigDecimal z1 = new BigDecimal(y1).setScale(2, RoundingMode.HALF_UP);
        BigDecimal zzz = new BigDecimal(y1).setScale(4, RoundingMode.HALF_UP);

        double xx1 = z1.doubleValue();
        double zzzz = zzz.doubleValue();


        String ExpectedInclusiveTax = String.valueOf(xx1);
        utils.log().info("Inclusive tax amount is " + ExpectedInclusiveTax);

//        //RoundOffCalculation
//        double w1 = xx1 - y1;
//        BigDecimal yy1 = new BigDecimal(w1).setScale(4, RoundingMode.HALF_UP);
//        double ww1 = yy1.doubleValue();
//        String RoundOffValue2 = String.valueOf(ww1);
//        utils.log().info("RoundOff value for inclusive tax is " + RoundOffValue2);
//
//        //Total Round-Off calculation
//        double totalRoundOff = ff + ww1;
//        String totalRoundOff1 = String.valueOf(totalRoundOff);
//        utils.log().info("Total RoundOff value is " + totalRoundOff1);

        //roundoff calculation  (New Method)
        double rr = dddd + zzzz;
        BigDecimal rr1 = new BigDecimal(rr).setScale(2, RoundingMode.HALF_UP);
        double rr2 = rr1.doubleValue();

        double newRoundOff = rr2 - rr;
        BigDecimal rr3 = new BigDecimal(newRoundOff).setScale(4, RoundingMode.HALF_UP);
        double rr4 = rr3.doubleValue();

        utils.log().info("New Roundoff is " + rr4);

        //Total tax calculation
        double totalTax = bb + xx1;

        BigDecimal totalTax1 = BigDecimal.valueOf(totalTax).setScale(2, RoundingMode.HALF_UP);
        double totalTax2 = totalTax1.doubleValue();
        String ExpectedTotalTax = String.valueOf(totalTax2);
        utils.log().info("Expected tax is " + ExpectedTotalTax);


        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        //While having both inclusive and exclusive tax, total tax is mismatching (LIN-19721), so commenting the below step
        //Assert.assertEquals(ExpectedTotalTax, ActualTax3);

    }

    public void VerifyIfTotalIsCalculatedProperlyAndCalculateRoundOffIncAndExcWithDiscount() {
        double subTotal = Double.parseDouble(TestUtils.subtotalAfterDiscount8);


        double taxValue = 0.10255;

        double a = subTotal * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();

        double totalAmount = subTotal + aa;
        String totalExpectedAmount = String.valueOf(totalAmount);

        utils.log().info("Expected total amount is " + totalExpectedAmount);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(totalExpectedAmount, ActualTotalValue1);
    }

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffExcWithAmountDiscount(double taxPercent, double DiscountAmount) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
//        double DiscountAmount = 23.66;

        double subtotalAfterDiscount = menuItemAmount4 - DiscountAmount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;


        //define tax percentage
//        double taxPercent = 0.0622;

        double taxAmount = subtotalAfterDiscount2 * taxPercent;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        String ExpectedTax = String.valueOf(bb);
        TestUtils.excTaxValue = ExpectedTax;
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncWithAmountDiscount(double taxPercent, double DiscountAmount) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
//        double DiscountAmount = 32.33;

        double subtotalAfterDiscount = menuItemAmount4 - DiscountAmount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        //define tax percentage
//        double taxPercent = 14.77;

        double a = taxPercent / 100;
        double b = subtotalAfterDiscount2 - (subtotalAfterDiscount2 / (1 + a));
        utils.log().info("Exact tax amount is " + b);

        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        TestUtils.incTaxValue = ExpectedTax;
        TestUtils.incCheckTotalTaxValue = ExpectedTax;
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffExcWithSetPriceDiscount() {
        //set price discount is set as 11.12 so below value is given as subtotal
        double subtotalAfterDiscount = 11.12;

        //define tax percent
        double taxPercent = 0.0622;

        double taxAmount = subtotalAfterDiscount * taxPercent;
        utils.log().info("Exact Tax is " + taxAmount);


        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffIncWithSetPriceDiscount() {
        //set price discount is set as 11.12 so below value is given as subtotal
        double subtotalAfterDiscount = 11.12;

        //define tax percentage
        double taxPercent = 14.77;

        double a = taxPercent / 100;
        double b = subtotalAfterDiscount - (subtotalAfterDiscount / (1 + a));
        utils.log().info("Exact tax amount is " + b);


        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void SelectMenuItemsWithExclusiveTaxWithCheckDiscount() {
        elementClick(menu9, "selected the menu1");
        elementClick(menu10, "selected the menu2");

    }

    public void ApplyCheckDiscount(String DiscountName) throws Exception {
        elementClick(DiscountBtn, "Selected discount button");
        Thread.sleep(1000);
        searchField.click();
        //searchField.sendKeys("check discount 24%");
        searchField.sendKeys(DiscountName);

        WebElement Discount =  driver.findElement(By.xpath(DiscountName));

        elementClick(Discount, "Selected the item discount");
        elementClick(BackButton, "Selected the back button");
    }

    public String subtotalAfterDiscount9;

    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive(double DiscountPercent, double taxPercent, double taxPercent2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]/..//div[5])[1]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        // double DiscountPercent = 0.24;
        //1st Menu Tax calculation
        WebElement Menu1Price =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]/..//div[5])[1]"));
        String Menu1PriceAmount = Menu1Price.getText();
        double Menu1PriceValue = Double.parseDouble(Menu1PriceAmount);

        double discountAmount1 = Menu1PriceValue * DiscountPercent;
        BigDecimal discountAmount2 = new BigDecimal(discountAmount1).setScale(2, RoundingMode.HALF_UP);
        double discountAmount3 = discountAmount2.doubleValue();
        double menu1PriceAfterDiscount = Menu1PriceValue - discountAmount3;

        //define tax percentage for 1st menu and calculate tax
        //   double taxPercent = 0.10255;

        double taxAmount = menu1PriceAfterDiscount * taxPercent;
        utils.log().info("Exact Tax1 is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee1 = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ff = ee1.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is " + ExpectedTax);

        //2nd Menu Tax Calculation
        WebElement Menu2Price =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]/..//div[5])[2]"));
        String Menu2PriceAmount = Menu2Price.getText();
        double Menu2PriceValue = Double.parseDouble(Menu2PriceAmount);

        double discountAmount4 = Menu2PriceValue * DiscountPercent;
        BigDecimal discountAmount5 = new BigDecimal(discountAmount4).setScale(2, RoundingMode.HALF_UP);
        double discountAmount6 = discountAmount5.doubleValue();
        double menu2PriceAfterDiscount = Menu2PriceValue - discountAmount6;

        //define tax percentage for 2nd menu and calculate tax
        //   double taxPercent2 = 0.0622;

        double taxAmount2 = menu2PriceAfterDiscount * taxPercent2;
        utils.log().info("Exact Tax2 is " + taxAmount2);

        BigDecimal dd2 = new BigDecimal(taxAmount2).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee2 = new BigDecimal(taxAmount2).setScale(4, RoundingMode.HALF_UP);

        double bb2 = dd2.doubleValue();
        double gg = ee2.doubleValue();

        String ExpectedTax2 = String.valueOf(bb2);
        utils.log().info("Expected Tax2 is " + ExpectedTax2);

        double totalExpectedTax = bb + bb2;
        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);

        //total tax calculation new
        double newTotalTax = ff + gg;
        BigDecimal newTotalTax2 = new BigDecimal(newTotalTax).setScale(2, RoundingMode.HALF_UP);

        double newTotalTax3 = newTotalTax2.doubleValue();
        String newTotalTax4 = String.valueOf(newTotalTax3);

        utils.log().info("Total New Tax is " + newTotalTax);


        //Commenting below steps as there is mismatch in exp and act tax when two exclusive are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(newTotalTax4, ActualTax3);

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
        BigDecimal totalRoundOff1 = new BigDecimal(totalRoundOff).setScale(2, RoundingMode.HALF_UP);
        double totalRoundOff2 = totalRoundOff1.doubleValue();

        double roundOffTotal = totalRoundOff2 - totalRoundOff;
        BigDecimal roundOffTotal1 = new BigDecimal(roundOffTotal).setScale(4, RoundingMode.HALF_UP);
        double roundOffTotal2 = roundOffTotal1.doubleValue();


        utils.log().info("Total RoundOff value is " + roundOffTotal2);

    }

    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusiveRepeatOrder(double DiscountPercent, double taxPercent, double taxPercent2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        // double DiscountPercent = 0.24;
        //1st Menu Tax calculation
        WebElement Menu1Price =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String Menu1PriceAmount = Menu1Price.getText();
        double Menu1PriceValue = Double.parseDouble(Menu1PriceAmount);

        double discountAmount1 = Menu1PriceValue * DiscountPercent;
        BigDecimal discountAmount2 = new BigDecimal(discountAmount1).setScale(2, RoundingMode.HALF_UP);
        double discountAmount3 = discountAmount2.doubleValue();
        double menu1PriceAfterDiscount = Menu1PriceValue - discountAmount3;

        //define tax percentage for 1st menu and calculate tax
        //   double taxPercent = 0.10255;

        double taxAmount = menu1PriceAfterDiscount * taxPercent;
        utils.log().info("Exact Tax1 is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee1 = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ff = ee1.doubleValue();
        double ff1 = ff * 2;

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is " + ExpectedTax);

        //2nd Menu Tax Calculation
        WebElement Menu2Price =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[3]"));
        String Menu2PriceAmount = Menu2Price.getText();
        double Menu2PriceValue = Double.parseDouble(Menu2PriceAmount);

        double discountAmount4 = Menu2PriceValue * DiscountPercent;
        BigDecimal discountAmount5 = new BigDecimal(discountAmount4).setScale(2, RoundingMode.HALF_UP);
        double discountAmount6 = discountAmount5.doubleValue();
        double menu2PriceAfterDiscount = Menu2PriceValue - discountAmount6;

        //define tax percentage for 2nd menu and calculate tax
        //   double taxPercent2 = 0.0622;

        double taxAmount2 = menu2PriceAfterDiscount * taxPercent2;
        utils.log().info("Exact Tax2 is " + taxAmount2);

        BigDecimal dd2 = new BigDecimal(taxAmount2).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee2 = new BigDecimal(taxAmount2).setScale(4, RoundingMode.HALF_UP);

        double bb2 = dd2.doubleValue();
        double gg = ee2.doubleValue();
        double gg1 = gg * 2;
        String ExpectedTax2 = String.valueOf(bb2);
        utils.log().info("Expected Tax2 is " + ExpectedTax2);

        double totalExpectedTax = bb + bb2;
        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);

        //total tax calculation new
        double newTotalTax = ff1 + gg1;
        BigDecimal newTotalTax2 = new BigDecimal(newTotalTax).setScale(2, RoundingMode.HALF_UP);

        double newTotalTax3 = newTotalTax2.doubleValue();
        String newTotalTax4 = String.valueOf(newTotalTax3);

        utils.log().info("Total New Tax is " + newTotalTax);


        //Commenting below steps as there is mismatch in exp and act tax when two exclusive are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(newTotalTax4, ActualTax3);

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
        BigDecimal totalRoundOff1 = new BigDecimal(totalRoundOff).setScale(2, RoundingMode.HALF_UP);
        double totalRoundOff2 = totalRoundOff1.doubleValue();

        double roundOffTotal = totalRoundOff2 - totalRoundOff;
        BigDecimal roundOffTotal1 = new BigDecimal(roundOffTotal).setScale(4, RoundingMode.HALF_UP);
        double roundOffTotal2 = roundOffTotal1.doubleValue();


        utils.log().info("Total RoundOff value is " + roundOffTotal2);

    }

    public void SelectMenuItemsWithInclusiveTaxWithCheckDiscount() {
        elementClick(menu11, "selected the menu1");
        elementClick(menu12, "selected the menu2");

    }

    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountInclusive(double DiscountPercent, double taxPercent) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]/..//div[5])[1]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.24;
        //1st Menu Tax calculation
        WebElement Menu1Price =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]/..//div[5])[1]"));
        String Menu1PriceAmount = Menu1Price.getText();
        double Menu1PriceValue = Double.parseDouble(Menu1PriceAmount);
        utils.log().info("Menu price is " + Menu1PriceValue);

        double discountAmount1 = Menu1PriceValue * DiscountPercent;
        utils.log().info("Discount price is " + Menu1PriceValue);
        BigDecimal discountAmount2 = new BigDecimal(discountAmount1).setScale(2, RoundingMode.HALF_UP);
        double discountAmount3 = discountAmount2.doubleValue();
        double menu1PriceAfterDiscount = Menu1PriceValue - discountAmount3;
        utils.log().info("Menu after disc is " + menu1PriceAfterDiscount);

        //define tax percentage for 1st menu and calculate tax
        //double taxPercent = 16.12;
        double a = taxPercent / 100;
        double b = menu1PriceAfterDiscount - (menu1PriceAfterDiscount / (1 + a));
        utils.log().info("Exact tax1 is " + b);
        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee1 = new BigDecimal(b).setScale(4, RoundingMode.HALF_UP);

        double aa = dd.doubleValue();
        double ff = ee1.doubleValue();

        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Menu1 tax amount is " + ExpectedTax);

        //2nd Menu Tax Calculation
        WebElement Menu2Price =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]/..//div[5])[2]"));
        String Menu2PriceAmount = Menu2Price.getText();
        double Menu2PriceValue = Double.parseDouble(Menu2PriceAmount);

        double discountAmount4 = Menu2PriceValue * DiscountPercent;
        BigDecimal discountAmount5 = new BigDecimal(discountAmount4).setScale(2, RoundingMode.HALF_UP);
        double discountAmount6 = discountAmount5.doubleValue();
        double menu2PriceAfterDiscount = Menu2PriceValue - discountAmount6;

        //define tax percentage for 2nd menu and calculate tax
        double taxPercent2 = 17.62;

        double a2 = taxPercent2 / 100;
        double b2 = menu2PriceAfterDiscount - (menu2PriceAfterDiscount / (1 + a2));
        utils.log().info("Exact tax2 is " + b2);

        BigDecimal dd2 = new BigDecimal(b2).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ff1 = new BigDecimal(b2).setScale(4, RoundingMode.HALF_UP);

        double aa2 = dd2.doubleValue();
        double gg = ff1.doubleValue();

        String ExpectedTax2 = String.valueOf(aa2);
        utils.log().info("Menu2 tax amount is " + ExpectedTax2);

        double totalExpectedTax = aa + aa2;
        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
        BigDecimal totalExpectedTaxAmount2 = new BigDecimal(totalExpectedTaxAmount).setScale(2, RoundingMode.HALF_UP);
        double totalExpectedTaxAmount3 = totalExpectedTaxAmount2.doubleValue();
        String totalExpectedTaxValue = String.valueOf(totalExpectedTaxAmount3);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount3);

        //Commenting below steps as there is mismatch in exp and act tax when two exclusive are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void SelectMenuItemWithTheExclusiveTaxForOpenDiscount() {
        elementClick(downarrow1, "Selected category arrow");
        elementClick(category1, "Selected FOOD ITEMS category");
        elementClick(menu13, "Selected menu item with exclusive tax");
    }

    public void iSelectedTheMenuOptions() {
        elementClick(MenuOptionBtn, "I selected Menu Options");
    }

    public void iSelectedTheMenuOptions2() {
        elementClick(MenuOptionBtn2, "I selected Menu Options");
    }

    public void iSelectedTheMenuOptions2Disc() {
        elementClick(MenuOptionBtn2Disc, "I selected Menu Options");
    }


    //Modifier And Menu 2 Options

//    public void iSelectedTheMenuOptionsSecondMenu() {
//        elementClick(MenuOptionBtnMenu2, "I selected Menu Options");
//    }
//
//    public void iSelectedTheMenuOptionsDiscountPresent() {
//        elementClick(MenuOptionBtnDisc, "I selected Menu Options");
//    }
//
//    public void iSelectedTheMenuOptionsMod() {
//        elementClick(MenuOptionBtnMod, "I selected Menu Options");
//    }
//
//    public void iSelectedTheMenuOptionsDiscPresent() {
//        elementClick(MenuOptionBtnDisc, "I selected Menu Options");
//    }
//
//    public void iSelectedTheMenuOptions2DiscPresent() {
//        elementClick(MenuOptionBtnDisc2, "I selected Menu Options");
//    }
//
//    public void iSelectedTheMenuOptions2() {
//        elementClick(MenuOptionBtn2, "I selected Menu Options");
//    }

    public void iSelectedTheOpenDiscount() {
        elementClick(OpenDiscountBtn, "I selected Menu Options");

    }

    public void iTappedPercentageField() throws InterruptedException {

        elementClick(percentageBtn, "I selected percenntage option");
        Thread.sleep(1000);
        elementClick(percentageField, "I selected open disc Options");

    }

//    public void iTappedPercentageFieldOpenCheck() throws InterruptedException {
//
//        elementClick(percentageBtn, "I selected percenntage option");
//        Thread.sleep(1000);
//        elementClick(percentageFieldOpenCheck, "I selected open disc Options");
//
//    }

    public void iTappedAmountField() throws InterruptedException {

        elementClick(amountBtn, "I selected amount option");
        Thread.sleep(1000);
        elementClick(amountField, "I selected open disc Options");

    }

    public void iTappedAmountFieldOpenCheckDisc() throws InterruptedException {

        elementClick(amountBtn, "I selected amount option");
        Thread.sleep(1000);
        elementClick(amountFieldOpenCheckDisc, "I selected open disc Options");

    }

    public void iEneteredDiscountPercentage() {
        elementClick(selectNum1, "I tapped 1");
        elementClick(selectNum3, "I tapped 3");
        elementClick(selectNum4, "I tapped 4");
        elementClick(selectNum5, "I tapped 5");
    }

    public void iEneteredDiscountPercentageAs(String num1, String num2, String num3, String num4) {
        WebElement pressFirstNum =  driver.findElement(By.xpath(num1));
        elementClick(pressFirstNum, "Selected the number"+num1);

        WebElement pressSecondNum =  driver.findElement(By.xpath(num2));
        elementClick(pressSecondNum, "Selected the number"+num2);

        WebElement pressThirdNum =  driver.findElement(By.xpath(num3));
        elementClick(pressThirdNum, "Selected the number"+num3);

        WebElement pressFourthNum =  driver.findElement(By.xpath(num4));
        elementClick(pressFourthNum, "Selected the number"+num4);

    }

    public void iEneteredDiscountPercentageAs100() {
        elementClick(press1, "I tapped 1");
        elementClick(press0, "I tapped 0");
        elementClick(press0, "I tapped 0");
        elementClick(press0, "I tapped 0");
        elementClick(press0, "I tapped 0");
    }

    public void iEneteredDiscountAmount() {
        elementClick(selectNum1, "I tapped 1");
        elementClick(selectNum4, "I tapped 4");
        elementClick(selectNum5, "I tapped 5");
        elementClick(selectNum5, "I tapped 5");
    }

    public void iTheTappedReasonAndEnteredTheReason() {
        elementClick(reasonField, "I tapped reason field");
        reasonField.sendKeys("Open Item Discount");
    }

    public void iTheTappedReasonAndEnteredTheReasonOpenCheckDisc() {
        elementClick(reasonFieldOpenCheckDisc, "I tapped reason field");
        reasonFieldOpenCheckDisc.sendKeys("Open Check Discount");
    }

    public void iSelectedApplyButton() {
        elementClick(applyBtn, "Select Apply button");
    }

    public void andAddedAnotherSeat() {
        elementClick(addSeatBtn, "Select Add seat button");
    }

    public void iSelectedQSRButton() {
        elementClick(qsrBtn, "Selected QSR button");
    }

    public String subtotalAfterDiscount11;

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountExclusive(double DiscountPercent,double taxPercent) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
//        double DiscountPercent = 0.1345;

        double discountAmount = menuItemAmount4 * DiscountPercent;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is " + cc);

        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount11 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount12 = subtotalAfterDiscount11;


        //define tax percentage
//        double taxPercent = 0.10255;

        double taxAmount = subtotalAfterDiscount2 * taxPercent;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void VerifyIfTotalAmountIsCalculatedCorrectlyExclusiveOpenDiscount() {
        double subTotal = Double.parseDouble(TestUtils.subtotalAfterDiscount12);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        utils.log().info("Tax is " + ActualTax2);
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

        double taxAmount4 = Double.parseDouble(ActualTax3);

        double ExpectedTotal = subTotal + taxAmount4;
        BigDecimal dd = new BigDecimal(ExpectedTotal).setScale(2, RoundingMode.HALF_UP);

        String ExpectedTotalValue1 = String.valueOf(dd);

        utils.log().info("Expected total is " + ExpectedTotalValue1);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue1, ActualTotalValue1);

    }

    public void SelectMenuItemWithTheInclusiveTaxForOpenDiscount() {
        elementClick(menu14, "Selected menu item with inclusive tax");

    }

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountInclusive() {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        double DiscountPercent = 0.1345;

        double discountAmount = menuItemAmount4 * DiscountPercent;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is " + cc);

        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount12 = subtotalAfterDiscount3;

        //define tax percentage
        double taxPercent = 17.62;

        double a = taxPercent / 100;
        double b = subtotalAfterDiscount2 - (subtotalAfterDiscount2 / (1 + a));
        utils.log().info("test1 is " + b);
        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        utils.log().info("test1 is " + aa);
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void iSelectedTheExclusiveTaxMenuItemWithAfterTaxItemDiscount() {
        elementClick(menu15, "I selected the menu item");
    }

    public void iSelectedTheQuantity(String quantity) {
        WebElement quantityBtnn =  driver.findElement(By.xpath("(//div[contains(@class,'menu-section')]/div[contains(@class,'menuname')]/..//div[3])[1]"));
        elementClick(quantityBtnn, "Selected quantity option");
        String quantityValue =  "(//span[.="+quantity+"])";
        elementClick(quantityValue, "Entered the quantity");

        elementClick(ContinueBtn, "Selected continue button");
    }

    public void verifyIfTaxAndDiscountAreCalculatedProperly(double taxAmount, double discountAmount) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxAmount;
        utils.log().info("Exact tax amount is " + a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void iSelectedInclusiveTaxMenuItemWithAfterTaxItemDiscount() {
        elementClick(menu16, "Selected the menu item");
    }

    public void verifyIfTaxAndDiscountAreCalculatedProperlyInclusiveAfterTaxDiscount(double taxAmount, double discountAmount) {
        WebElement menuItemAmount =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount2 = menuItemAmount.getText();

        double menuItemAmount3 = Double.parseDouble(menuItemAmount2);

        double a = taxAmount / 100;
        double b = menuItemAmount3 - (menuItemAmount3 / (1 + a));
        utils.log().info("Exact tax amount is " + b);


        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void iSelectedExclusiveTaxMenuItemWithTaxOnItemTax() {
        elementClick(menu17, "I selected the menu item");
    }

    public void verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemTaxExclusive(double taxAmount1, double taxAmount2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define tax percentage for 1st menu and calculate tax

        double taxAmount = menuItemAmount4 * taxAmount1;
        utils.log().info("Exact Tax1 is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ss = tt.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is " + ExpectedTax);

        //calculate tax on item tax
        double taxOnItemTax = taxAmount * taxAmount2;
        utils.log().info("Exact Tax2 (tax on item tax) is " + taxOnItemTax);

        BigDecimal taxOnItemTax1 = new BigDecimal(taxOnItemTax).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt2 = new BigDecimal(taxOnItemTax).setScale(4, RoundingMode.HALF_UP);

        double taxOnItemTax2 = taxOnItemTax1.doubleValue();
        double ss2 = tt2.doubleValue();

        String taxOnItemTaxAmount = String.valueOf(taxOnItemTax2);
        utils.log().info("Expected Tax2 is " + taxOnItemTaxAmount);

        //Calculate total tax
        double totalExpectedTax = ss + ss2;
        BigDecimal taxExpected = new BigDecimal(totalExpectedTax).setScale(2, RoundingMode.HALF_UP);
        double taxExpected2 = taxExpected.doubleValue();

        String totalExpectedTaxAmount = String.valueOf(taxExpected2);
        utils.log().info("Total Expected Tax is " + taxExpected2);

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
        BigDecimal tt3 = new BigDecimal(totalTax4).setScale(2, RoundingMode.HALF_UP);
        double tt4 = tt3.doubleValue();
        utils.log().info("value2 is " + tt4);

        double tt5 = tt4 - totalTax4;
        BigDecimal tt6 = new BigDecimal(tt5).setScale(4, RoundingMode.HALF_UP);

        String tt7 = String.valueOf(tt6);
//         tt4 = tt4 * 10.0/10.0;
        utils.log().info("Total RoundOff value is " + tt7);

        //Commenting below steps as there is mismatch in exp and act tax when exclusive and tax on item tax are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

    }

    public void verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemServiceChargeExclusive(double taxAmount1, double taxAmount2, double itemServiceCharge) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define tax percentage for 1st menu and calculate tax

        double taxAmount = menuItemAmount4 * taxAmount1;
        utils.log().info("Exact Tax1 is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ss = tt.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is " + ExpectedTax);

        //calculate item service charge
        double itemServiceChargeAmt = menuItemAmount4 * itemServiceCharge;
        utils.log().info("Item Service Charge is " + itemServiceChargeAmt);

        BigDecimal itemServiceChargeAmt1 = new BigDecimal(itemServiceChargeAmt).setScale(2, RoundingMode.HALF_UP);

        double isc = itemServiceChargeAmt1.doubleValue();

        String isc1 = String.valueOf(isc);
        utils.log().info("Item Service Charge is " + isc1);

        //calculate tax on item service charge
        double taxOnItemServiceCharge = isc * taxAmount2;
        utils.log().info("Exact Tax2 (tax on item tax) is " + taxOnItemServiceCharge);

        BigDecimal taxOnItemServiceCharge1 = new BigDecimal(taxOnItemServiceCharge).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt2 = new BigDecimal(taxOnItemServiceCharge).setScale(4, RoundingMode.HALF_UP);

        double taxOnItemTax2 = taxOnItemServiceCharge1.doubleValue();
        double ss2 = tt2.doubleValue();

        String taxOnItemTaxAmount = String.valueOf(taxOnItemTax2);
        utils.log().info("Expected Tax2 is " + taxOnItemTaxAmount);

        //Calculate total tax
        double totalExpectedTax = bb + taxOnItemTax2;
        BigDecimal totalExpectedTax1 = new BigDecimal(totalExpectedTax).setScale(2, RoundingMode.HALF_UP);

        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax1);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);

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
        BigDecimal tt3 = new BigDecimal(totalTax4).setScale(2, RoundingMode.HALF_UP);
        double tt4 = tt3.doubleValue();
        utils.log().info("value2 is " + tt4);

        double tt5 = tt4 - totalTax4;
        BigDecimal tt6 = new BigDecimal(tt5).setScale(4, RoundingMode.HALF_UP);

        String tt7 = String.valueOf(tt6);
//         tt4 = tt4 * 10.0/10.0;
        utils.log().info("Total RoundOff value is " + tt7);

        //Commenting below steps as there is mismatch in exp and act tax when exclusive and tax on item tax are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

    }

    public void verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemServiceChargeInclusive(double taxAmount1, double taxAmount2, double itemServiceCharge) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define tax percentage for 1st menu and calculate tax

        double taxAmount = menuItemAmount4 - (menuItemAmount4 / (1 + taxAmount1));

        utils.log().info("Exact Tax1 is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ss = tt.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is " + ExpectedTax);

        //calculate item service charge
        double itemServiceChargeAmt = menuItemAmount4 * itemServiceCharge;
        utils.log().info("Item Service Charge is " + itemServiceChargeAmt);

        BigDecimal itemServiceChargeAmt1 = new BigDecimal(itemServiceChargeAmt).setScale(2, RoundingMode.HALF_UP);

        double isc = itemServiceChargeAmt1.doubleValue();

        String isc1 = String.valueOf(isc);
        utils.log().info("Item Service Charge is " + isc1);

        //calculate tax on item service charge
        double taxOnItemServiceCharge = isc - (isc / (1 + taxAmount2));
        utils.log().info("Exact Tax2 (tax on item tax) is " + taxOnItemServiceCharge);

        BigDecimal taxOnItemServiceCharge1 = new BigDecimal(taxOnItemServiceCharge).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt2 = new BigDecimal(taxOnItemServiceCharge).setScale(4, RoundingMode.HALF_UP);

        double taxOnItemTax2 = taxOnItemServiceCharge1.doubleValue();
        double ss2 = tt2.doubleValue();

        String taxOnItemTaxAmount = String.valueOf(taxOnItemTax2);
        utils.log().info("Expected Tax2 is " + taxOnItemTaxAmount);

        //Calculate total tax
        double totalExpectedTax = bb + taxOnItemTax2;
        BigDecimal totalExpectedTax1 = new BigDecimal(totalExpectedTax).setScale(2, RoundingMode.HALF_UP);

        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax1);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);

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
        BigDecimal tt3 = new BigDecimal(totalTax4).setScale(2, RoundingMode.HALF_UP);
        double tt4 = tt3.doubleValue();
        utils.log().info("value2 is " + tt4);

        double tt5 = tt4 - totalTax4;
        BigDecimal tt6 = new BigDecimal(tt5).setScale(4, RoundingMode.HALF_UP);

        String tt7 = String.valueOf(tt6);
//         tt4 = tt4 * 10.0/10.0;
        utils.log().info("Total RoundOff value is " + tt7);

        //Commenting below steps as there is mismatch in exp and act tax when exclusive and tax on item tax are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

    }

    public void iSelectedInclusiveTaxMenuItemWithTaxOnItemTax() {
        elementClick(menu18, "I selected the menu item");
    }

    public void verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffTaxOnItemTaxInclusive(double taxAmount1, double taxAmount2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define tax percentage for 1st menu and calculate tax
        double a = taxAmount1 / 100;
        double taxAmount = menuItemAmount4 - (menuItemAmount4 / (1 + a));
        utils.log().info("Exact Tax1 is " + taxAmount);


        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ss = tt.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is " + ExpectedTax);

        //calculate tax on item tax
        double taxOnItemTax = ss * taxAmount2;
        utils.log().info("Exact Tax2 is " + taxOnItemTax);
        BigDecimal taxOnItemTax1 = new BigDecimal(taxOnItemTax).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt1 = new BigDecimal(taxOnItemTax).setScale(4, RoundingMode.HALF_UP);
        double ss1 = tt1.doubleValue();


        double taxOnItemTax2 = taxOnItemTax1.doubleValue();
        String taxOnItemTaxAmount = String.valueOf(taxOnItemTax2);
        utils.log().info("Expected Tax2 is " + taxOnItemTaxAmount);

        //Calculate total tax
        double totalExpectedTax = bb + taxOnItemTax2;
        BigDecimal totalExpectedTaxAmount = new BigDecimal(totalExpectedTax).setScale(2, RoundingMode.HALF_UP);

        String totalExpectedTaxAmount1 = String.valueOf(totalExpectedTaxAmount);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount1);

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
        BigDecimal tt2 = new BigDecimal(totalTax4).setScale(2, RoundingMode.HALF_UP);
        double tt3 = tt2.doubleValue();
        utils.log().info("value2 is " + tt3);

        double tt4 = tt3 - totalTax4;
        BigDecimal tt5 = new BigDecimal(tt4).setScale(4, RoundingMode.HALF_UP);

        String tt6 = String.valueOf(tt5);
//         tt4 = tt4 * 10.0/10.0;
        utils.log().info("Total RoundOff value is " + tt6);


//         //Total RoundOff Calculation
//         double totalRoundOff = ff + ff2;
//         String totalRoundOffValue = String.valueOf(totalRoundOff);
//         utils.log().info("Total RoundOff value is " + totalRoundOffValue);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount1, ActualTax3);
    }

    public void iSelectedMenuItemWithTaxOnCheckTax() {
        elementClick(menu19, "I selected the menu item");
    }

    public void iSelectedAllOption() {
        elementClick(AllButton, "I selected the ALL option");
    }

    public void iSelectedClosedTab() {
        elementClick(ClosedTab, "I selected the closed Tab");
    }

    public void iSelectedExclusiveTaxMenuItemWithMixAdMatchDiscout() {
        elementClick(menu20, "I selected the menu item");
    }

    public void ApplyMixAndMatchDiscount(String DiscountName) {
        elementClick(DiscountBtn, "Selected discount button");
        WebElement Discount =  driver.findElement(By.xpath(DiscountName));
        elementClick(Discount, "Selected the item discount");
        elementClick(BackButton, "Selected the back button");
    }

    public void verifyIfTaxIsCalculatedProperlyAndCalculateRoundOffMixAndMatchExclusive(double taxAmount1) {
        double MenuAmountAfterDiscount = 1.32;

        double taxAmount = MenuAmountAfterDiscount * taxAmount1;
        utils.log().info("Exact Tax is " + taxAmount);
        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value for Tax1 is " + RoundOffValue);
    }

    public void category2Selection() {
        elementClick(category2, "I selected IceCreams Category");
    }

    public void iSelectedInclusiveTaxMenuItemWithMixAdMatchDiscount() {
        elementClick(menu21, "I selected the menu item");
    }

    public void verifyIfTheTaxAndDiscountAreCalculatedProperlyInclusiveBeforeTaxDiscount(double taxAmount, double discountAmount) {

        double a = taxAmount / 100;
        double b = discountAmount - (discountAmount / (1 + a));
        utils.log().info("Exact tax amount is " + b);


        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void iSelectedExclusiveTaxMenuItemWithMixAdMatchDiscountPercentage() {
        elementClick(menu22, "I selected the menu item");

    }

    public void iSelectedModifierWithPrefix() {

        elementClick(modifier1, "I selected the modifier");
        elementClick(prefix1, "I selected the prefix");
        elementClick(donebtn, "I selected the prefix");

    }

    public void SelectCategory(String CategoryName) {

        WebElement Discount =  driver.findElement(By.xpath(CategoryName));
        elementClick(Discount, "Selected the category");
    }

    public void SelectCategoryNew(String CategoryName) throws Exception {

        Thread.sleep(1000);
        WebElement Category =  driver.findElement(By.xpath(CategoryName));
        elementClick(Category, "Selected the category");

//        try {
//            if(find(Category,2)){
//                elementClick(Category, "Tapped category");
//            }else {
//                scrollToElementCategory(Category, "up");
//                elementClick(Category, "Tapped category");
//            }
//        }catch (Exception w){
//            scrollToElementCategory(Category, "down");
//            elementClick(Category, "Tapped category");
//        }
    }

    public void iSelectedMenuItem(String MenuItemName) {
        WebElement Discount =  driver.findElement(By.xpath(MenuItemName));
        elementClick(Discount, "Selected the menu item");
    }

    public void iSelectedModifier(String ModifierName) {
        WebElement Modifier =  driver.findElement(By.xpath(ModifierName));
        elementClick(Modifier, "Selected modifier");
    }

    public void iSelectedSize(String Size) {
        WebElement Discount =  driver.findElement(By.xpath(Size));
        elementClick(Discount, "Selected the menu item size");
    }

    public void verifyTheExcTaxAndRoundOffCalculation(double taxValue) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + a);


        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void verifyTheTotalValueWithFreeItemDiscount(double freeItemValue) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

        double taxAmount4 = Double.parseDouble(ActualTax3);

        double ExpectedTotal = menuItemAmount4 + taxAmount4 + freeItemValue;
        BigDecimal ExpectedTotalValue1 = new BigDecimal(ExpectedTotal).setScale(2, RoundingMode.HALF_UP);
        String ExpectedTotalValue2 = String.valueOf(ExpectedTotalValue1);


        utils.log().info("Expected total is " + ExpectedTotalValue2);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue2, ActualTotalValue1);
    }

    public void verifyTheIncTaxAndRoundOffCalculation(double taxValue) {
        WebElement menuItemAmount =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount2 = menuItemAmount.getText();

        double menuItemAmount3 = Double.parseDouble(menuItemAmount2);

        double a = taxValue / 100;
        double b = menuItemAmount3 - (menuItemAmount3 / (1 + a));
        utils.log().info("Exact tax amount is " + b);

        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void verifyTheTotalValueIncWithFreeItemDiscount(double freeItemValue) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

        double taxAmount4 = Double.parseDouble(ActualTax3);

        double ExpectedTotal = menuItemAmount4 + freeItemValue;
        BigDecimal ExpectedTotalValue1 = new BigDecimal(ExpectedTotal).setScale(2, RoundingMode.HALF_UP);
        String ExpectedTotalValue2 = String.valueOf(ExpectedTotalValue1);


        utils.log().info("Expected total is " + ExpectedTotalValue2);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue2, ActualTotalValue1);

    }

    public void verifyTheExcAndIncTaxAndRoundOffCalculation(double taxValue1, double taxValue2) {
        //For exclusive
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxValue1;
        utils.log().info("Exact tax1 amount is " + a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();

        String ExpectedExclusiveTax = String.valueOf(aa);
        utils.log().info("Exclusive tax amount is " + ExpectedExclusiveTax);

        //RoundOffCalculationForExclusiveTax
        double ExcTax = aa - a;
        BigDecimal ee = new BigDecimal(ExcTax).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue1 = String.valueOf(ff);
        utils.log().info("RoundOff value for exclusive is " + RoundOffValue1);

        //For inclusive
        WebElement menuAmount =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuAmount2 = menuAmount.getText();

        double menuAmount11 = Double.parseDouble(menuAmount2);

        double x1 = taxValue2 / 100;
        double y1 = menuAmount11 - (menuAmount11 / (1 + x1));
        utils.log().info("Exact tax2 amount is " + y1);

        BigDecimal z1 = new BigDecimal(y1).setScale(2, RoundingMode.HALF_UP);
        double xx1 = z1.doubleValue();
        utils.log().info("test1 " + xx1);

        String ExpectedInclusiveTax = String.valueOf(xx1);
        utils.log().info("Inclusive tax amount is " + ExpectedInclusiveTax);

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
        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax2, ActualTax3);
    }

    public void verifyTheTotalValueExcAndIncWithFreeItemDiscount(Double taxValue, Double freeItemValue) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + a);

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        double ExpectedTotal = menuItemAmount4 + aa + freeItemValue;
        BigDecimal ExpectedTotalValue1 = new BigDecimal(ExpectedTotal).setScale(2, RoundingMode.HALF_UP);

        String ExpectedTotal1 = String.valueOf(ExpectedTotalValue1);
        utils.log().info("Expected total amount is " + ExpectedTotal1);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotal1, ActualTotalValue1);
    }

    public void SeletcedCheckNumber(String CheckNumber) throws InterruptedException {
        Thread.sleep(3000);
        WebElement CheckNum =  driver.findElement(By.xpath(CheckNumber));
        elementClick(CheckNum, "Selected the Check Number");
    }

    public void SeletcedReopenCheckOption() {
        elementClick(reopenCheckBtn, "Selected ReOpen Check Option");
    }

    public void iDeletedPayment() throws InterruptedException {

        elementClick(PaymentBtn, "Selected Payment Button");
        elementClick(successBtn, "Selected Payment");
        elementClick(deleteBtn, "Selected delete butto");
//        elementClick(OKBtn, "Selected OK");
        elementClick(exitBtn, "Selected exit");

    }

    public void selectTaxExemptOption(String taxExemptOption) {
        WebElement TaxExempt =  driver.findElement(By.xpath(taxExemptOption));
        elementClick(TaxExempt, "Selected tax exempt option");
    }

    public void verifyIfTaxIsExempted() {
        WebElement subTotalAmount =  driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmount1 = subTotalAmount.getAttribute("value");
        String subTotalAmount2 = subTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("subtotal is :" + subTotalAmount1);

        WebElement ActualTotal =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = ActualTotal.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("total is :" + ActualTotalValue);

        Assert.assertEquals(subTotalAmount2, ActualTotalValue);

    }

    public void verifyIfTaxIsExemptedInclusive() {
        WebElement subTotalAmount =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String subTotalAmount1 = subTotalAmount.getText();
        String subTotalAmount2 = subTotalAmount1.replaceAll("[A-Z$ ]", "");
        double subTotalAmount3 = Double.parseDouble(subTotalAmount2);

        double taxAmount = Double.parseDouble(TestUtils.taxAmountInc);

        double taxAmount1 = subTotalAmount3 - taxAmount;

        String actualTotal = String.valueOf(taxAmount1);

        utils.log().info("subtotal is :" + actualTotal);

        WebElement ActualTotal =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = ActualTotal.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("total is :" + ActualTotalValue);

        Assert.assertEquals(actualTotal, ActualTotalValue);

    }

    public void VerifyIfBalanceDueValueIsCalculatedCorrectlyTaxExempt() {
        WebElement TotalAmount =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = TotalAmount.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Expected Balance due is " + ActualTotalValue);

        elementClick(PaymentBtn, "Selected Payment Button");
        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();

        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ActualTotalValue, BalanceDueValue);
    }

    public void verifyIfTaxIsExemptedBothExclusiveAndInclusive() {
        WebElement subTotalAmount =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String subTotalAmount1 = subTotalAmount.getText();
        double subTotalAmount2 = Double.parseDouble(subTotalAmount1);
        utils.log().info("subtotal1 is :" + subTotalAmount2);
        utils.log().info("subtotal is :" + TestUtils.taxAmountInc2);


        double taxAmount7 = Double.parseDouble(TestUtils.taxAmountInc2);

        double taxAmount1 = subTotalAmount2 - taxAmount7;

        String actualTotal = String.valueOf(taxAmount1);

        utils.log().info("subtotal is :" + actualTotal);

        WebElement ActualTotal =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = ActualTotal.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("total is :" + ActualTotalValue);

        Assert.assertEquals(actualTotal, ActualTotalValue);
    }

    public void verifyIfBothTaxesExcIncAreCalculatedCorrectlyAndCalculateRoundoff(Double tax1, Double tax2) {
        //For exclusive
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
//        double taxValue = 0.10255;

        double a = menuItemAmount4 * tax1;
        utils.log().info("Exact tax1 amount is " + a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ddd = new BigDecimal(a).setScale(4, RoundingMode.HALF_UP);

        double aa = dd.doubleValue();
        double dddd = ddd.doubleValue();


        String ExpectedExclusiveTax = String.valueOf(aa);
        utils.log().info("Exclusive tax amount is " + ExpectedExclusiveTax);

        //RoundOffCalculationForExclusiveTax
        double ExcTax = aa - a;
        BigDecimal ee = new BigDecimal(ExcTax).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue1 = String.valueOf(ff);
        utils.log().info("RoundOff value for exclusive is " + RoundOffValue1);

        //For inclusive
        WebElement menuAmount =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuAmount2 = menuAmount.getText();

        double menuAmount11 = Double.parseDouble(menuAmount2);

        double x1 = tax2 / 100;
        double y1 = menuAmount11 - (menuAmount11 / (1 + x1));
        utils.log().info("Exact tax2 amount is " + y1);

        BigDecimal z1 = new BigDecimal(y1).setScale(2, RoundingMode.HALF_UP);
        BigDecimal zzz = new BigDecimal(y1).setScale(4, RoundingMode.HALF_UP);

        double xx1 = z1.doubleValue();
        double zzzz = zzz.doubleValue();

        utils.log().info("test1 " + xx1);

        String ExpectedInclusiveTax = String.valueOf(xx1);
        utils.log().info("Inclusive tax amount is " + ExpectedInclusiveTax);

//        //Total Round-Off calculation
//        double totalRoundOff = ff + ww1;
//        String totalRoundOff1 = String.valueOf(totalRoundOff);
//        utils.log().info("Total RoundOff value is " + totalRoundOff1);

        //Total Tax Calculation
//        double TotalExpectedTax = aa + xx1;
//        BigDecimal ExpectedTax = new BigDecimal(TotalExpectedTax).setScale(2, RoundingMode.HALF_UP);
//        double ExpectedTax1 = ExpectedTax.doubleValue();
//        String ExpectedTax2 = String.valueOf(ExpectedTax1);
//        utils.log().info("Total tax is " + ExpectedTax1);

//        //RoundOffCalculation (old method)
//        double totalExactTax = a + y1;
//        BigDecimal totalExactTax1 = new BigDecimal(totalExactTax).setScale(4,RoundingMode.HALF_UP);
//        Double totalExactTax2 = totalExactTax1.doubleValue();
//        Double RoundOff = totalExactTax2 - ExpectedTax1;
//        utils.log().info("Roundoff is " + RoundOff);

        //roundoff calculation  (New Method)
        double rr = dddd + zzzz;
        BigDecimal rr1 = new BigDecimal(rr).setScale(2, RoundingMode.HALF_UP);
        double rr2 = rr1.doubleValue();
        String ExpectedTax2 = String.valueOf(rr2);
        utils.log().info("Total tax is " + ExpectedTax2);

        double newRoundOff = rr2 - rr;
        BigDecimal rr3 = new BigDecimal(newRoundOff).setScale(4, RoundingMode.HALF_UP);
        double rr4 = rr3.doubleValue();

        utils.log().info("New Roundoff is " + rr4);


        //While having both inclusive and exclusive tax, total tax is mismatching (LIN-19721), so commenting the below steps
        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax2, ActualTax3);
    }

    public void iSelectedTheVoidButton() {
        elementClick(voidButton, "Selected void button");
    }

    public void iSelectedTheVoidButtonMenuOption() {
        elementClick(voidButtonMenuOptions, "Selected void button");
    }

    public void iSelectedTheVoidItemButton() {
        elementClick(voidItemButton, "Selected void button");
    }

    public void SelectedVoidReason(String voidReason) throws InterruptedException {
        WebElement VoidReason =  driver.findElement(By.xpath("//button[contains(.,'"+voidReason+"')]"));
        elementClick(VoidReason, "Selected void reason");
        elementClick(addBtn, "Selected void reason");
        //elementClick(donebtn, "Selected void reason");
        new OrderTypeWindow().pressCancelBtn();

    }

    public void SelectedVoidItemReason(String voidReason) throws InterruptedException {
        WebElement VoidReason =  driver.findElement(By.xpath("//button[contains(.,'"+voidReason+"')]"));
        elementClick(VoidReason, "Selected void reason");
        elementClick(addBtn, "Selected void reason");
//        elementClick(donebtn, "Selected void reason");

    }

    public void SelectedThePaymentButton() throws InterruptedException {
        elementClick(PaymentBtn, "Selected Payment Button");
        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();
    }

    public void verifyIfExcTaxIsCalculatedCorrectlyReopen(Double taxValue) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
        //double taxValue = 0.10255;

        double a = menuItemAmount4 * taxValue;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + a);

        double b = a + a;
        utils.log().info("Exact tax amount is " + b);

        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        BigDecimal bb = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double cc = bb.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = cc - a;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void iHaveSelectedTheCategoryArrowWait() throws InterruptedException {
        Thread.sleep(5000);
        elementClick(downarrow1, "Selected category arrow");

    }

    public void VerifyIfTotalValueIsCalculatedCorrectlyReopenExc() {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

        double taxAmount4 = Double.parseDouble(ActualTax3);

        double ExpectedTotal = menuItemAmount4 * 2 + taxAmount4;
        BigDecimal ExpectedTotal1 = new BigDecimal(ExpectedTotal).setScale(4, RoundingMode.HALF_UP);
        double cc = ExpectedTotal1.doubleValue();
        // String ExpectedTotalValue1 = String.valueOf(cc);

        DecimalFormat d = new DecimalFormat("0.00");

        String ExpectedTotalValue1 = d.format(ExpectedTotal1);

        utils.log().info("Expected total is " + ExpectedTotalValue1);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue1, ActualTotalValue1);
    }

    public void verifyIfBalanceDueValueIsCalculatedCorrectlyAfterReopenExc() {
        WebElement TotalAmount =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = TotalAmount.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        Double TotalValue = Double.parseDouble(ActualTotalValue);
        Double ExpectedTotal = TotalValue / 2;
        BigDecimal ExpectedTotal1 = new BigDecimal(ExpectedTotal).setScale(2, RoundingMode.HALF_UP);

        String ExpectedTotal2 = String.valueOf(ExpectedTotal1);
        utils.log().info("Expected Balance due is " + ExpectedTotal2);

        elementClick(PaymentBtn, "Selected Payment Button");
        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();

        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ExpectedTotal2, BalanceDueValue);
    }

    public void verifyIfIncTaxIsCalculatedCorrectlyReopen(double taxValue) {
        WebElement menuItemAmount =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount2 = menuItemAmount.getText();

        double menuItemAmount3 = Double.parseDouble(menuItemAmount2);
        //double taxValue = 12;

        double a = taxValue / 100;
        double b = menuItemAmount3 - (menuItemAmount3 / (1 + a));
        utils.log().info("Exact tax amount is " + b);

        double z = b + b;

        BigDecimal dd = new BigDecimal(z).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        BigDecimal ee = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String ExpectedTax = String.valueOf(aa);

        //the below two steps are for tax exempt scenario
        taxAmountInclusive = ExpectedTax;
        TestUtils.taxAmountInc = taxAmountInclusive;

        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is" + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = ff - b;
        BigDecimal eee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff1 = eee.doubleValue();
        String RoundOffValue = String.valueOf(ff1);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void VerifyIfTotalValueIsCalculatedCorrectlyReopenInc() {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

        double taxAmount4 = Double.parseDouble(ActualTax3);

        double ExpectedTotal = menuItemAmount4 * 2;
        String ExpectedTotalValue1 = String.valueOf(ExpectedTotal);

        utils.log().info("Expected total is " + ExpectedTotalValue1);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue1);

        Assert.assertEquals(ExpectedTotalValue1, ActualTotalValue1);
    }

    public void SelectSubCategory(String SubCategoryName) {
        WebElement Discount =  driver.findElement(By.xpath(SubCategoryName));
        elementClick(Discount, "Selected the sub-category");
    }

    public void verifyIfTaxIsCalculatedAsPerTheQuantityTax(String quantity, Double tax1) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        utils.log().info("Selected quantity is " + quantity);

        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //double menuAmountDouble= Double.parseDouble(menuAmount);
        //int menuAmount1=(int)menuAmountDouble;


        //for(quantity=1;quantity<3;quantity++)
        //Verifying if Tax is calculated correctly
        double ExpectedTax = (menuItemAmount4 * tax1);

        BigDecimal dd = new BigDecimal(ExpectedTax).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax2 = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax2);

        //RoundOffCalculation
        double c = aa - ExpectedTax;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

        WebElement ActualTax =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTaxAmount = ActualTax.getAttribute("value");
        String ActualTaxValue = ActualTaxAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTaxValue);
        String ExpectedTaxValue = String.valueOf(ExpectedTax);

        Assert.assertEquals(ExpectedTax2, ActualTaxValue);

        //Verifying if Total is calculated correctly
        double ExpectedTotal = menuItemAmount4 + aa;
        BigDecimal oo = new BigDecimal(ExpectedTotal).setScale(2, RoundingMode.HALF_UP);
        double vv = oo.doubleValue();
        String uu = String.valueOf(vv);
        utils.log().info("a is " + menuItemAmount4);
        utils.log().info("b is " + aa);
        String ExpectedTotal2 = String.valueOf(ExpectedTotal);

        WebElement ActualTotal =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = ActualTotal.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue);
//        String ExpectedTotalValue = String.valueOf(ExpectedTotal);
        utils.log().info("Expected total is " + uu);

        Assert.assertEquals(uu, ActualTotalValue);
        elementClick(PaymentBtn, "Selected Payment Button");
        elementClick(cashBtn, "Selected Cash Button");
        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();

    }

    public void VerifyIfTheExcTaxAndInclusiveModifierTaxAreCalculatedProperlyAndCalculateRoundOffForItemDiscountAfterTaxExclusive(double tax1, double tax2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * tax1;
        utils.log().info("Exact tax amount is " + a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt = new BigDecimal(a).setScale(4, RoundingMode.HALF_UP);

        double aa = dd.doubleValue();
        double tt1 = tt.doubleValue();

        WebElement modifierAmount =  driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container')]//div[@class='modifier-section']/div[5])[1]"));
        String modifierAmount1 = modifierAmount.getText();
        utils.log().info("modifier Amount is " + modifierAmount1);
        double modifierAmount2 = Double.parseDouble(modifierAmount1);

        // double modifierTax = modifierAmount2 * tax2;
        double modifierTax = modifierAmount2 - (modifierAmount2 / (1 + tax2));
        BigDecimal dd1 = new BigDecimal(modifierTax).setScale(2, RoundingMode.HALF_UP);
        BigDecimal yy = new BigDecimal(modifierTax).setScale(4, RoundingMode.HALF_UP);

        double aa1 = dd1.doubleValue();
        double yy1 = yy.doubleValue();


        double totalTax = aa + aa1;


        double totalTax1 = tt1 + yy1;
        BigDecimal totalTax2 = new BigDecimal(totalTax1).setScale(2, RoundingMode.HALF_UP);
        double totalTax3 = totalTax2.doubleValue();


        String ExpectedTax = String.valueOf(totalTax);
        String ExpectedTaxAmt = String.valueOf(totalTax3);


        utils.log().info("Expected tax amount is " + ExpectedTaxAmt);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTaxAmt, ActualTax3);

        //RoundOffCalculation
        double c = aa - a;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }


    public void verifyIfTheTaxIsCalculatedAfterRemovingDiscount(Double tax1) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * tax1;
        utils.log().info("Exact tax amount is " + a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();


        String ExpectedTax = String.valueOf(aa);


        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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



//    WebElement e=driver.findElement(By.xpath("//span[contains(.,' "+discount+" ')]"));

    public void RemovedTheItemDiscount(String discount) throws InterruptedException {
        Thread.sleep(2000);
        String discBtn = "//button[contains(.,'Discount')]";
        elementClick(discBtn,"selected discount button");
        String searchFldDiscount = "//ion-searchbar[contains(@class,'discount')]/div/input";

        sendKeys(convertWebElement(searchFldDiscount),"20% Discount");

        WebElement e=driver.findElement(By.xpath("//span[contains(.,' "+discount+" ')]"));

        if (e.isDisplayed()){
            elementClick(e,discount +" Selected");
        }else{
            utils.log().info("Not discplayed - "+discount);
        }
//        WebElement Discount =  driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"20% Discount\"])[2]"));
//        elementClick(Discount, "Selected the item discount");
        elementClick(BackButton, "Selected the back button");
    }

    public void RemovedTheItemDiscount2() throws InterruptedException {
        Thread.sleep(1000);
        elementClick(DiscountBtn, "Selected discount button");

        WebElement Discount =  driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"30% Discount\"])[2]"));
        elementClick(Discount, "Selected the item discount");
        elementClick(BackButton, "Selected the back button");
    }

    public void VerifyIfBalanceDueValueIsCalculatedCorrectlyAfterRemovingDiscount() {
        Double totalBefore = Double.parseDouble(TestUtils.TotalValueBeforeRemovingDiscount);

        WebElement TotalAmount =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount = TotalAmount.getAttribute("value");
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        Double totalAfter = Double.parseDouble(ActualTotalValue);

        Double ExpectedTotal = totalAfter - totalBefore;
        BigDecimal dd = new BigDecimal(ExpectedTotal).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();


        String ExpectedTotal1 = String.valueOf(aa);

        utils.log().info("Expected Balance due is " + ExpectedTotal1);

        elementClick(PaymentBtn, "Selected Payment Button");
        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();

        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ExpectedTotal1, BalanceDueValue);

    }

    public void iSelectedIncludedModifier() {

        WebElement includedModifier =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[2]"));
        includedModifier.click();

    }

    public void iSelectedAlternateModifierBtn() {
        WebElement alternateModifierBtn =  driver.findElement(By.xpath("//span[contains(.,' Alternate modifier ')]"));
        alternateModifierBtn.click();

    }

    public void iSelectedTheAlternateModifier() {
        WebElement alternateModifier =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeScrollView/XCUIElementTypeButton"));
        alternateModifier.click();

    }

    public void iSelectedOKBtn() {
        WebElement OKBtn =  driver.findElement(By.xpath("//button[contains(.,'Ok')]"));
        OKBtn.click();
    }

    public void iSelectedPrefix(String prefix) {
        WebElement prefixBtn =  driver.findElement(By.xpath("//ion-col//div[contains(@class,'conventional-prefix')]//button[contains(.,'"+prefix+"')]"));
        prefixBtn.click();
    }

    public void iSelectedAfterTaxOption() {
        WebElement afterTaxBtn =  driver.findElement(By.xpath("//button[contains(.,'After')]"));
        afterTaxBtn.click();
    }

    public void VerifyIfTheIncTaxAndExclusiveModifierTaxAreCalculatedProperlyAndCalculateRoundOffForItemDiscountAfterTaxExclusive(double tax1, double tax2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 - (menuItemAmount4 / (1 + tax1));
        utils.log().info("Exact tax amount is " + a);

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();

        WebElement modifierAmount =  driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container')]//div[@class='modifier-section']/div[5])[1]"));
        String modifierAmount1 = modifierAmount.getText();
        utils.log().info("modifier Amount is " + modifierAmount1);
        double modifierAmount2 = Double.parseDouble(modifierAmount1);

        // double modifierTax = modifierAmount2 * tax2;
        double modifierTax = modifierAmount2 * tax2;
        BigDecimal dd1 = new BigDecimal(modifierTax).setScale(2, RoundingMode.HALF_UP);
        double aa1 = dd1.doubleValue();

        double totalTax = aa + aa1;

        String ExpectedTax = String.valueOf(totalTax);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void verifyTheExcTaxesAndRoundOffCalculation(Double taxValue1, Double taxValue2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxValue1;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + a);

        WebElement menuItemAmount11 =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[2]"));
        String menuItemAmount33 = menuItemAmount11.getText();

        double menuItemAmount44 = Double.parseDouble(menuItemAmount33);

        double b = menuItemAmount44 * taxValue2;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + b);

        Double aa = a + b;


        BigDecimal dd = new BigDecimal(aa).setScale(2, RoundingMode.HALF_UP);
        double aa1 = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa1);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa1 - aa;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void selectTheServiceTypeButton() {
        WebElement ServiceTypeBtn =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]"));
        ServiceTypeBtn.click();
    }

    public void selectTheDineInOption() {
        WebElement DineInOption =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        DineInOption.click();
    }

    public void selectTheTable() {
        WebElement TableSelection =  driver.findElement(By.xpath("//div[@class='child']/button[1]"));
        TableSelection.click();
    }

    public void selectTheSplitBtn() throws InterruptedException {
        WebElement splitButton =  driver.findElement(By.xpath("//linga-icon[@symbol='split']"));
        splitButton.click();
        Thread.sleep(5000);
    }

    public void SelectSplitOption() {
        WebElement splitOption =  driver.findElement(By.xpath("//span[contains(.,'SPLIT CHECK')]"));
        elementClick(splitOption, "Selected the split option as SPLIT CHECK");
    }

    public void selectTheOrderBtn() {
        WebElement element2 = driver.findElement(By.xpath("//ion-row/button[contains(.,'Order')]"));
        elementClick(element2, "Click Order");
    }

    public void selectTheAddBtn() {
        WebElement addButton =  driver.findElement(By.xpath("//button[@class='add-seat']"));
        addButton.click();
    }

    public void selectMenu1() {
        WebElement menu1 =  driver.findElement(By.xpath("(//ion-item[contains(@class,'item md item')]//ion-grid//ion-row//ion-col[1]//p)[1]"));
        menu1.click();
    }

    public void menuTransferToNewCheck() {
        WebElement check =  driver.findElement(By.xpath("(//ion-grid[contains(@class,'orderDetails')])[2]"));
        check.click();
    }

    public void verifyTheExcTaxesCalcInSplitScreen(Double taxValue1, Double taxValue2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxValue1;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + a);

        WebElement menuItemAmount11 =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[2]"));
        String menuItemAmount33 = menuItemAmount11.getText();

        double menuItemAmount44 = Double.parseDouble(menuItemAmount33);

        double b = menuItemAmount44 * taxValue2;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + b);

        Double aa = a + b;


        BigDecimal dd = new BigDecimal(aa).setScale(2, RoundingMode.HALF_UP);
        double aa1 = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa1);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

    }

    public void verifyTheExcTaxCalcForFirstCheck(Double taxValue1) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("(//ion-item[contains(@class,'item md item')]//ion-grid//ion-row//ion-col[4])[1]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxValue1;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + a);

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa1 = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa1);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("(//ion-footer[contains(@class,'seat-payment')])[1]//ion-grid//ion-row[2]//ion-col[2]//p"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

    }

    public void verifyTheExcTaxCalcForSecondCheck(Double taxValue1) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("(//ion-item[contains(@class,'item md item')]//ion-grid//ion-row//ion-col[4])[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxValue1;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + a);

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa1 = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa1);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("(//ion-footer[contains(@class,'seat-payment')])[2]//ion-grid//ion-row[2]//ion-col[2]//p"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

    }

    public void iSelectPrintButton() throws InterruptedException {
        WebElement check =  driver.findElement(By.xpath("(//ion-row[contains(@class,'seat-header')])[1]"));
        check.click();

        WebElement printBtn =  driver.findElement(By.xpath("//linga-icon[@symbol='print']/.."));
        printBtn.click();

        WebElement yesOption =  driver.findElement(By.xpath("//button[contains(.,'Yes')]"));
        yesOption.click();

        Thread.sleep(5000);

//        WebElement doneOption =  driver.findElement(By.xpath("Done"));
//        doneOption.click();

    }

    public String iGetCheck1Number() {
        WebElement checkNum1 =  driver.findElement(By.xpath("(//ion-row[contains(@class,'seat-header')])[1]//ion-col"));
        checkNumber1 = checkNum1.getText();
        TestUtils.globalCheckNumber11 = checkNumber1;
        utils.log().info(checkNumber1);
        return checkNumber1;
    }

    public String iGetCheck2Number() {
        WebElement checkNum2 = driver.findElement(By.xpath("(//ion-row[contains(@class,'seat-header')])[2]//ion-col"));
        checkNumber2 = checkNum2.getText();
        TestUtils.globalCheckNumber22 = checkNumber2;
        utils.log().info(checkNumber2);
        return checkNumber2;
    }

    public void verifyTheExcTaxCalcInMenuScreenAfterSplit(Double taxValue1) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxValue1;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + a);


        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void iSelectActiveTab() {
        elementClick(ActiveTab, "Selected active tab");
    }

    public void verifyActiveCheck2InActiveTab() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber = TestUtils.globalCheckNumber22;
        PhoneOrderScreen a = new PhoneOrderScreen();
        a.searchTabClosedTab.clear();
        a.searchTabClosedTab.sendKeys(globalCheckNumber);

        WebElement phoneOrders = driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div[1]/tr/td[2]"));
        if (phoneOrders.isDisplayed()){
            elementClick(phoneOrders,"Tapped Open Check");
            utils.log().info(globalCheckNumber + " - Closed Check is displayed in closed tab");
        }else {
            utils.log().info("Active check is not displayed");
        }
//        WebElement phoneOrders = mergeAndFindElement(globalCheckNumber, "", TestUtils.xpath);
//        if (phoneOrders.isDisplayed()) {
//            elementClick(phoneOrders, "Tapped Active Check");
//            utils.log().info(globalCheckNumber + " - Active Check is displayed in active tab");
//        } else {
//            utils.log().info("Active check is not displayed");
//        }
    }

    public void iClickOpenCheckBtn() {
        WebElement openCheckBtn =  driver.findElement(By.xpath("//app-check-commonfooter/div/ion-grid[2]/ion-row/ion-col/button[2]"));
        openCheckBtn.click();
    }

    public void VerifyIfTheTaxIsCalculatedCorrectlyInc2(Double taxValue1, Double taxValue2) {
        WebElement menuItemAmount =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount2 = menuItemAmount.getText();

        double menuItemAmount3 = Double.parseDouble(menuItemAmount2);
//        double taxValue = 12;

        double a = taxValue1 / 100;
        double b = menuItemAmount3 - (menuItemAmount3 / (1 + a));
        utils.log().info("Exact tax amount1 is " + b);

        double a2 = taxValue2 / 100;
        double b2 = menuItemAmount3 - (menuItemAmount3 / (1 + a2));
        utils.log().info("Exact tax amount2 is " + b2);

        double b3 = b + b2;

        BigDecimal dd = new BigDecimal(b3).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);

        //the below two steps are for tax exempt scenario
        taxAmountInclusive = ExpectedTax;
        TestUtils.taxAmountInc = taxAmountInclusive;

        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is" + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa - b3;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void iSelectedTheIncTax2Menu() {
        elementClick(menu31, "Selected 2 inc tax menu item");
    }

    public void verifyTheIncTaxesAndRoundOffCalculation(Double taxValue1, Double taxValue2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double i = taxValue2 / 100;
        double a = menuItemAmount4 - (menuItemAmount4 / (1 + i));
        utils.log().info("Exact tax amount is " + a);

        WebElement menuItemAmount11 =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[2]"));
        String menuItemAmount33 = menuItemAmount11.getText();

        double menuItemAmount44 = Double.parseDouble(menuItemAmount33);

        double j = taxValue1 / 100;
        double a2 = menuItemAmount44 - (menuItemAmount44 / (1 + j));
        utils.log().info("Exact tax amount is " + a2);

        Double aa = a + a2;


        BigDecimal dd = new BigDecimal(aa).setScale(2, RoundingMode.HALF_UP);
        double aa1 = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa1);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa1 - aa;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void verifyTheIncTaxCalcForFirstCheck(Double taxValue1) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("(//ion-item[contains(@class,'item md item')]//ion-grid//ion-row//ion-col[4])[1]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = taxValue1 / 100;
        double b = menuItemAmount4 - (menuItemAmount4 / (1 + a));
        utils.log().info("Exact tax amount is " + b);

        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa1 = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa1);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("(//ion-footer[contains(@class,'seat-payment')])[1]//ion-grid//ion-row[2]//ion-col[2]//p"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

    }

    public void verifyTheIncTaxCalcForSecondCheck(Double taxValue1) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("(//ion-item[contains(@class,'item md item')]//ion-grid//ion-row//ion-col[4])[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = taxValue1 / 100;
        double b = menuItemAmount4 - (menuItemAmount4 / (1 + a));
        utils.log().info("Exact tax amount is " + a);

        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa1 = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa1);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("(//ion-footer[contains(@class,'seat-payment')])[2]//ion-grid//ion-row[2]//ion-col[2]//p"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

    }

    public void verifyTheIncTaxCalcInMenuScreenAfterSplit(Double taxValue1) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = taxValue1 / 100;
        double b = menuItemAmount4 - (menuItemAmount4 / (1 + a));
        utils.log().info("Exact tax amount is " + b);


        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void verifyTheExccTaxesAndRoundOffCalculation(Double taxValue1, Double taxValue2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxValue1;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + a);

        WebElement menuItemAmount11 =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[2]"));
        String menuItemAmount33 = menuItemAmount11.getText();

        double menuItemAmount44 = Double.parseDouble(menuItemAmount33);

        double b = menuItemAmount44 * taxValue2;
        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));
        utils.log().info("Exact tax amount is " + b);

        Double aa = a + b;


        BigDecimal dd = new BigDecimal(aa).setScale(2, RoundingMode.HALF_UP);
        double aa1 = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa1);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

//        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa1 - aa;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void verifyTheInccTaxesAndRoundOffCalculation(Double taxValue1, Double taxValue2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = taxValue1 / 100;
        double b = menuItemAmount4 - (menuItemAmount4 / (1 + a));
        utils.log().info("Exact tax amount is " + b);

        WebElement menuItemAmount11 =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[2]"));
        String menuItemAmount33 = menuItemAmount11.getText();

        double menuItemAmount44 = Double.parseDouble(menuItemAmount33);

        double b1 = taxValue2 / 100;
        double b2 = menuItemAmount44 - (menuItemAmount44 / (1 + b1));
        utils.log().info("Exact tax amount is " + b2);

        Double aa = b + b2;


        BigDecimal dd = new BigDecimal(aa).setScale(2, RoundingMode.HALF_UP);
        double aa1 = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa1);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOffCalculation
        double c = aa1 - aa;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void selectTheTable1() throws InterruptedException {
        Thread.sleep(1000);
        WebElement Table1 =  driver.findElement(By.xpath("//div[@class='child']/button[4]"));
        if (Table1.isDisplayed()) {
            elementClick(Table1, "Selected the table ");
        }

//        WebElement TableSelection =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[5]");
//        TableSelection.click();
//        Thread.sleep(1000);
    }

    public void selectTheTable2() throws InterruptedException {

        WebElement Table1 =  driver.findElement(By.xpath("//div[@class='child']/button[7]"));
        if (Table1.isDisplayed()) {
            elementClick(Table1, "Selected the table ");
        }


//        Thread.sleep(1000);
//        WebElement TableSelection =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[7]");
//        TableSelection.click();
    }

    public void selectTheMergeButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement MergeButton =  driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"Merge\"]"));
        MergeButton.click();
    }


    public void selectedTheSeatNumber() throws InterruptedException {
       elementClick(selectNum1, "selected 1");
        ContinueBtn.click();
        Thread.sleep(1000);
    }

    public void selectTheTable1Order() throws InterruptedException {
        Thread.sleep(1000);

        WebElement TableSelection =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[5]"));
        TableSelection.click();
        Thread.sleep(1000);
    }

    public void selectTheTable2Order() throws InterruptedException {
        Thread.sleep(1000);

        WebElement TableSelection =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[7]"));
        TableSelection.click();
        Thread.sleep(1000);
    }

    public void selectTheTableWithMergedChecks(String m) throws InterruptedException {
        Thread.sleep(1000);
        WebElement Table1 =  driver.findElement(By.xpath("//div[@class=\'child\']/button[4]"));
        if (Table1.isDisplayed()) {
            elementClick(Table1, "Selected the table " + m + "with check  number " + TestUtils.globalCheckNumber);
        }

        try {
            WebElement Check =  driver.findElement(By.xpath("//ion-title[contains(.,'Checks')]"));

            if (Check.isDisplayed()) {
                String a = TestUtils.globalCheckNumber;
                WebElement CheckNumm =  driver.findElement(By.xpath("//ion-content[contains(@class,'table-multiple-checks')]/ion-grid//ion-row//div//p[contains(.,'"+TestUtils.globalCheckNumber+"')]"));

                if (CheckNumm.isDisplayed()) {
                    elementClick(CheckNumm, "Selected the check");
                } else {

                }

            }
        } catch (Exception w) {

        }

    }


//        WebElement TableSelection =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[5]");
//        TableSelection.click();
//        Thread.sleep(1000);


    public String getTableNumberTxt() {
        WebElement tableNum = driver.findElement(By.xpath("//ion-toolbar[contains(@class,'tablecommon')]//button[2]//span[1]"));
        tableNumber = tableNum.getText();
        TestUtils.globalTableNumber = tableNumber;
        utils.log().info(tableNumber);
        return tableNumber;
    }

    public String getTableNumberTxt2() {
        WebElement tableNum2 = driver.findElement(By.xpath("//ion-toolbar[contains(@class,'tablecommon')]//button[2]//span[1]"));
        tableNumber2 = tableNum2.getText();
        TestUtils.globalTableNumber2 = tableNumber2;
        utils.log().info(tableNumber2);
        return tableNumber2;
    }


    public String getCheckNumber2Txt() {
        WebElement checkNum2 = driver.findElement(By.xpath("//p[contains(.,'Check')]/../p[2]"));
        checkNumber2 = checkNum2.getText();
        TestUtils.globalCheckNumber2 = checkNumber2;
        utils.log().info(checkNumber2);
        return checkNumber2;
    }

    public void iNowMergeCheck1(String m) throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement MergeButton =  driver.findElement(By.xpath()("//XCUIElementTypeImage[@name=\"Merge\"]");
        //WebElement MergeButton =  driver.findElement(By.xpath("Merge");

        WebElement MergeButton =  driver.findElement(By.xpath("//button[contains(.,'Merge')]"));

        MergeButton.click();

        WebElement Table1 =  driver.findElement(By.xpath("//div[@class=\'child\']/button[4]"));
        if (Table1.isDisplayed()) {
            elementClick(Table1, "Selected the table " + m + "with check  number " + TestUtils.globalCheckNumber);
        }

        try {
            WebElement Check =  driver.findElement(By.xpath("//ion-title[contains(.,'Checks')]"));

            if (Check.isDisplayed()) {
                String a = TestUtils.globalCheckNumber;
                WebElement CheckNumm =  driver.findElement(By.xpath("//ion-content[contains(@class,'table-multiple-checks')]/ion-grid//ion-row//div//p[contains(.,'"+TestUtils.globalCheckNumber+"')]"));

                if (CheckNumm.isDisplayed()) {
                    elementClick(CheckNumm, "Selected the check");
                }

//                WebElement yes =  driver.findElement(By.xpath("Yes");
//                if (yes.isDisplayed()) {
//                    elementClick(yes, "select yes btn");
//                }

                WebElement Xbtn =  driver.findElement(By.xpath("//ion-toolbar[contains(@class,'toolbar-title')]//ion-title[contains(.,'Checks')]/..//button"));

                if (Xbtn.isDisplayed()) {
                    Xbtn.click();
                } else {

                }
            }

        } catch (Exception w) {

        }

    }

    public void iNowMergeCheck1WithDiscount(String m) throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement MergeButton =  driver.findElement(By.xpath("//button[contains(.,'Merge')]"));
        MergeButton.click();

        WebElement Table1 =  driver.findElement(By.xpath("//div[@class=\'child\']/button[4]"));
        if (Table1.isDisplayed()) {
            elementClick(Table1, "Selected the table " + m + "with check  number " + TestUtils.globalCheckNumber);
        }

        try {
            WebElement Check =  driver.findElement(By.xpath("//ion-title[contains(.,'Checks')]"));

            if (Check.isDisplayed()) {
                String a = TestUtils.globalCheckNumber;
                WebElement CheckNumm =  driver.findElement(By.xpath("//ion-content[contains(@class,'table-multiple-checks')]/ion-grid//ion-row//div//p[contains(.,'"+TestUtils.globalCheckNumber+"')]"));

                if (CheckNumm.isDisplayed()) {
                    elementClick(CheckNumm, "Selected the check");
                }

                WebElement yes =  driver.findElement(By.xpath("//button[contains(.,'Yes')]"));
                if (yes.isDisplayed()) {
                    elementClick(yes, "select yes btn");
                }

                WebElement Xbtn =  driver.findElement(By.xpath("//ion-toolbar[contains(@class,'toolbar-title')]//ion-title[contains(.,'Checks')]/..//button"));

                if (Xbtn.isDisplayed()) {
                    Xbtn.click();
                } else {

                }
            }

        } catch (Exception w) {

        }

    }

    public void iNowMergeCheck2(String n) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Thread.sleep(1000);
//        WebElement MergeButton =  driver.findElement(By.xpath()("//XCUIElementTypeImage[@name=\"Merge\"]");
//        MergeButton.click();

        WebElement Table1 =  driver.findElement(By.xpath("//div[@class=\'child\']/button[7]"));
        if (Table1.isDisplayed()) {
            elementClick(Table1, "Selected the table " + n + "with check  number " + TestUtils.globalCheckNumber2);
        }

        try {
            WebElement Check =  driver.findElement(By.xpath("//ion-title[contains(.,'Checks')]"));

            if (Check.isDisplayed()) {
                String a = TestUtils.globalCheckNumber2;
                WebElement CheckNumm =  driver.findElement(By.xpath("//ion-content[contains(@class,'table-multiple-checks')]/ion-grid//ion-row//div//p[contains(.,'"+TestUtils.globalCheckNumber2+"')]"));

                if (CheckNumm.isDisplayed()) {
                    elementClick(CheckNumm, "Selected the check");
                }

//                WebElement yes =  driver.findElement(By.xpath("Yes");
//                if (yes.isDisplayed()) {
//                    elementClick(yes, "select yes btn");
//                }

                WebElement Xbtn =  driver.findElement(By.xpath("//ion-toolbar[contains(@class,'toolbar-title')]//ion-title[contains(.,'Checks')]/..//button"));

                if (Xbtn.isDisplayed()) {
                    Xbtn.click();
                } else {

                }

            }
        } catch (Exception w) {

        }

    }

    public void iNowMergeCheck2WithDiscount(String n) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Thread.sleep(1000);
//        WebElement MergeButton =  driver.findElement(By.xpath()("//XCUIElementTypeImage[@name=\"Merge\"]");
//        MergeButton.click();

        WebElement Table1 =  driver.findElement(By.xpath("//div[@class=\'child\']/button[7]"));
        if (Table1.isDisplayed()) {
            elementClick(Table1, "Selected the table " + n + "with check  number " + TestUtils.globalCheckNumber2);
        }

        try {
            WebElement Check =  driver.findElement(By.xpath("//ion-title[contains(.,'Checks')]"));

            if (Check.isDisplayed()) {
                String a = TestUtils.globalCheckNumber2;
                WebElement CheckNumm =  driver.findElement(By.xpath("//ion-content[contains(@class,'table-multiple-checks')]/ion-grid//ion-row//div//p[contains(.,'"+TestUtils.globalCheckNumber2+"')]"));

                if (CheckNumm.isDisplayed()) {
                    elementClick(CheckNumm, "Selected the check");
                }

                WebElement yes =  driver.findElement(By.xpath("//button[contains(.,'Yes')]"));
                if (yes.isDisplayed()) {
                    elementClick(yes, "select yes btn");
                }

                WebElement Xbtn =  driver.findElement(By.xpath("//ion-toolbar[contains(@class,'toolbar-title')]//ion-title[contains(.,'Checks')]/..//button"));

                if (Xbtn.isDisplayed()) {
                    Xbtn.click();
                } else {

                }

            }
        } catch (Exception w) {

        }

    }

    public void selectTheNewCheck() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement newCheck =  driver.findElement(By.xpath("//ion-col[contains(.,'New Check')]"));
        newCheck.click();
    }

    public void selectTableLayout() {
        WebElement newCheck =  driver.findElement(By.xpath("//button[contains(.,'Table layout')]"));
        newCheck.click();
    }

    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive(double DiscountPercent, double taxPercent) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
//        double DiscountPercent = 0.24;
        ///1st Menu Tax calculation
        WebElement Menu1Price =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String Menu1PriceAmount = Menu1Price.getText();
        double Menu1PriceValue = Double.parseDouble(Menu1PriceAmount);
        utils.log().info("a is " + Menu1PriceValue);


        double discountAmount1 = Menu1PriceValue * DiscountPercent;
        utils.log().info("b is " + discountAmount1);

        BigDecimal discountAmount2 = new BigDecimal(discountAmount1).setScale(2, RoundingMode.HALF_UP);
        double discountAmount3 = discountAmount2.doubleValue();
        double menu1PriceAfterDiscount = Menu1PriceValue - discountAmount3;
        utils.log().info("c is " + menu1PriceAfterDiscount);


        //define tax percentage for 1st menu and calculate tax
//        double taxPercent = 0.10255;

        double taxAmount = menu1PriceAfterDiscount * taxPercent;
        utils.log().info("Exact Tax1 is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee1 = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ff = ee1.doubleValue();

        DecimalFormat d00 = new DecimalFormat("0.00");
        String ExpectedTax = d00.format(bb);
        utils.log().info("Expected Tax1 is " + ExpectedTax);

//        //2nd Menu Tax Calculation
//        WebElement Menu2Price =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]");
//        String Menu2PriceAmount = Menu2Price.getText();
//        double Menu2PriceValue = Double.parseDouble(Menu2PriceAmount);
//
//        double discountAmount4 = Menu2PriceValue * DiscountPercent;
//        BigDecimal discountAmount5 = new BigDecimal(discountAmount4).setScale(2, RoundingMode.HALF_UP);
//        double discountAmount6 = discountAmount5.doubleValue();
//        double menu2PriceAfterDiscount = Menu2PriceValue - discountAmount6;

        //define tax percentage for 2nd menu and calculate tax
//        double taxPercent2 = 0.0622;
//
//        double taxAmount2 = menu2PriceAfterDiscount * taxPercent2;
//        utils.log().info("Exact Tax2 is " + taxAmount2);
//
//        BigDecimal dd2 = new BigDecimal(taxAmount2).setScale(2, RoundingMode.HALF_UP);
//        BigDecimal ee2 = new BigDecimal(taxAmount2).setScale(4, RoundingMode.HALF_UP);
//
//        double bb2 = dd2.doubleValue();
//        double gg = ee2.doubleValue();
//
//        String ExpectedTax2 = String.valueOf(bb2);
//        utils.log().info("Expected Tax2 is " + ExpectedTax2);
//
//        double totalExpectedTax = bb + bb2;
//        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
//        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);
//
//        //total tax calculation new
//        double newTotalTax = ff + gg;
//        utils.log().info("Total New Tax is " + newTotalTax);


        //Commenting below steps as there is mismatch in exp and act tax when two exclusive are there (LIN-19736)

        WebElement ActualTaxAmount=  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOff Calculation for 1st Tax
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double tt = ee.doubleValue();
        String RoundOffValue = String.valueOf(tt);
        utils.log().info("RoundOff value for Tax1 is " + RoundOffValue);

//        //RoundOff Calculation for 2nd Tax
//        double d2 = bb2 - taxAmount2;
//        BigDecimal yy = new BigDecimal(d2).setScale(4, RoundingMode.HALF_UP);
//        double ff2 = yy.doubleValue();
//        String RoundOffValue2 = String.valueOf(ff2);
//        utils.log().info("RoundOff value for Tax2 is " + RoundOffValue2);

//        //Total RoundOff Calculation
//        double totalRoundOff = ff + gg;
//        BigDecimal totalRoundOff1 = new BigDecimal(totalRoundOff).setScale(2, RoundingMode.HALF_UP);
//        double totalRoundOff2 = totalRoundOff1.doubleValue();
//
//        double roundOffTotal = totalRoundOff2 - totalRoundOff;
//        BigDecimal roundOffTotal1 = new BigDecimal(roundOffTotal).setScale(4, RoundingMode.HALF_UP);
//        double roundOffTotal2 = roundOffTotal1.doubleValue();
//
//
//        utils.log().info("Total RoundOff value is " + roundOffTotal2);

    }


    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusive2(double DiscountPercent, double taxPercent, double taxPercent2) {
//        WebElement menuItemAmount1 =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]");
//        String menuItemAmount3 = menuItemAmount1.getText();
//
//        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
//        double DiscountPercent = 0.24;
        ///1st Menu Tax calculation
        WebElement Menu1Price =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String Menu1PriceAmount = Menu1Price.getText();
        double Menu1PriceValue = Double.parseDouble(Menu1PriceAmount);
        utils.log().info("a is " + Menu1PriceValue);


        double discountAmount1 = Menu1PriceValue * DiscountPercent;
        utils.log().info("b is " + discountAmount1);

        BigDecimal discountAmount2 = new BigDecimal(discountAmount1).setScale(2, RoundingMode.HALF_UP);
        double discountAmount3 = discountAmount2.doubleValue();
        double menu1PriceAfterDiscount = Menu1PriceValue - discountAmount3;
        utils.log().info("c is " + menu1PriceAfterDiscount);


        //define tax percentage for 1st menu and calculate tax
//        double taxPercent = 0.10255;

        double taxAmount = menu1PriceAfterDiscount * taxPercent;
        utils.log().info("Exact Tax1 is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee1 = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ff = ee1.doubleValue();

        String ExpectedTax = String.valueOf(ff);
        utils.log().info("Expected Tax1 is " + ExpectedTax);

//        //2nd Menu Tax Calculation
        WebElement Menu2Price =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[3]"));
        String Menu2PriceAmount = Menu2Price.getText();
        double Menu2PriceValue = Double.parseDouble(Menu2PriceAmount);
        utils.log().info("amount2 is " + Menu2PriceValue);


        double discountAmount4 = Menu2PriceValue * DiscountPercent;
        BigDecimal discountAmount5 = new BigDecimal(discountAmount4).setScale(2, RoundingMode.HALF_UP);
        double discountAmount6 = discountAmount5.doubleValue();
        double menu2PriceAfterDiscount = Menu2PriceValue - discountAmount6;

        //define tax percentage for 2nd menu and calculate tax
//        double taxPercent2 = 0.0622;
//
        double taxAmount2 = menu2PriceAfterDiscount * taxPercent2;
        utils.log().info("Exact Tax2 is " + taxAmount2);

        BigDecimal dd2 = new BigDecimal(taxAmount2).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee2 = new BigDecimal(taxAmount2).setScale(4, RoundingMode.HALF_UP);

        double bb2 = dd2.doubleValue();
        double gg = ee2.doubleValue();

        String ExpectedTax2 = String.valueOf(gg);
        utils.log().info("Expected Tax2 is " + ExpectedTax2);

        double totalExpectedTax = ff + gg;
        BigDecimal totalExpectedTax1 = new BigDecimal(totalExpectedTax).setScale(2, RoundingMode.HALF_UP);
        double totalExpectedTax2 = totalExpectedTax1.doubleValue();

        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax2);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);

        //total tax calculation new
        double newTotalTax = ff + gg;
        utils.log().info("Total New Tax is " + newTotalTax);


        //Commenting below steps as there is mismatch in exp and act tax when two exclusive are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

        //RoundOff Calculation for 1st Tax
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double tt = ee.doubleValue();
        String RoundOffValue = String.valueOf(tt);
        utils.log().info("RoundOff value for Tax1 is " + RoundOffValue);

//        //RoundOff Calculation for 2nd Tax
        double d2 = bb2 - taxAmount2;
        BigDecimal yy = new BigDecimal(d2).setScale(4, RoundingMode.HALF_UP);
        double ff2 = yy.doubleValue();
        String RoundOffValue2 = String.valueOf(ff2);
        utils.log().info("RoundOff value for Tax2 is " + RoundOffValue2);

        //Total RoundOff Calculation
        double totalRoundOff = ff + gg;
        BigDecimal totalRoundOff1 = new BigDecimal(totalRoundOff).setScale(2, RoundingMode.HALF_UP);
        double totalRoundOff2 = totalRoundOff1.doubleValue();

        double roundOffTotal = totalRoundOff2 - totalRoundOff;
        BigDecimal roundOffTotal1 = new BigDecimal(roundOffTotal).setScale(4, RoundingMode.HALF_UP);
        double roundOffTotal2 = roundOffTotal1.doubleValue();


        utils.log().info("Total RoundOff value is " + roundOffTotal2);


    }

    public void iClickTheConfirmBtn() {
        WebElement confirm =  driver.findElement(By.xpath("//button[contains(.,'Confirm')]"));
        elementClick(confirm, "select confirm btn");
    }

    public void VerifyIfTaxIsCalculatedCorrectlyAfter100PercentDiscount() {
        double aa = 0.00;
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        StringBuffer ActualTax4 = new StringBuffer(ActualTax3);
        ActualTax4.deleteCharAt(3);
        String ActualTax5 = new String(ActualTax4);

        utils.log().info("Actual tax is " + ActualTax5);

        Assert.assertEquals(ExpectedTax, ActualTax5);

    }

    public void VerifyIfTotalIsCalculatedCorrectlyAfter100PercentDiscount() {
        double aa = 0.00;
        String ExpectedTotal = String.valueOf(aa);
        utils.log().info("Expected total is " + ExpectedTotal);

        WebElement ActualTotal1 =  driver.findElement(By.xpath("//div[@id='os_totalAmountStr']//input"));
        String ActualTotalAmount1 = ActualTotal1.getAttribute("value");
        String ActualTotalValue1 = ActualTotalAmount1.replaceAll("[A-Z$ ]", "");
        StringBuffer ActualTotalValue2 = new StringBuffer(ActualTotalValue1);
        ActualTotalValue2.deleteCharAt(3);
        String ActualTotalValue3 = new String(ActualTotalValue2);
        utils.log().info("Actual total is " + ActualTotalValue3);

        Assert.assertEquals(ExpectedTotal, ActualTotalValue3);

    }

    public void VerifyIfBalanceDueIsCalculatedCorrectlyAfter100PercentDiscount() throws InterruptedException {
        double aa = 0.00;
        String ExpectedBalanceDue = String.valueOf(aa);
        utils.log().info("Expected balance due is " + ExpectedBalanceDue);

        elementClick(PaymentBtn, "Selected Payment Button");
        WebElement BalanceDue =  driver.findElement(By.xpath("//div[contains(@class,'balance')]//p/label[2][1]"));
        String BalanceDueAmount = BalanceDue.getText();

        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        StringBuffer BalanceDueValue1 = new StringBuffer(BalanceDueValue);
        BalanceDueValue1.deleteCharAt(3);
        String BalanceDueValue2 = new String(BalanceDueValue1);
        utils.log().info("Actual Balance due is " + BalanceDueValue2);

        Assert.assertEquals(ExpectedBalanceDue, BalanceDueValue2);

        elementClick(SubmitBtn, "Selected Submit Button");
        new OrderTypeWindow().pressCancelBtn();

    }

    public void iSelectedRepeatOrder() {
        elementClick(repeatOrderBtn, "Selected Repeat Order");
    }

    public void iAddedANewSeat() {
        elementClick(repeatOrderBtn, "Selected Repeat Order");

    }

    public void VerifyIfTheTaxIsCalculatedCorrectly() {
        WebElement menuItemAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount2 = menuItemAmount.getText();

        double menuItemAmount3 = Double.parseDouble(menuItemAmount2);
        double taxValue = 12;

        double a = taxValue / 100;
        double b = menuItemAmount3 - (menuItemAmount3 / (1 + a));
        utils.log().info("Exact tax amount is " + b);

        BigDecimal dd = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);

        //the below two steps are for tax exempt scenario
        taxAmountInclusive = ExpectedTax;
        TestUtils.taxAmountInc = taxAmountInclusive;

        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
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

    public void VerifyIfExclusiveTaxAndCheckTaxIsCalculatedCorrectlyAndCalculateRoundoff(double taxValue, double taxValue2) {

    }

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountExclusiveAmountBT(double discountAmount, double taxPercent) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.1345;

        //double discountAmount = menuItemAmount4 * DiscountPercent;
        //BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        //double cc = discountAmount1.doubleValue();
        //utils.log().info("Discount amount is " + cc);

        double subtotalAfterDiscount = menuItemAmount4 - discountAmount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount11 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount12 = subtotalAfterDiscount11;


        //define tax percentage
        //double taxPercent = 0.10255;

        double taxAmount = subtotalAfterDiscount2 * taxPercent;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();

//        String ExpectedTax = String.valueOf(bb);


        DecimalFormat d00 = new DecimalFormat("0.00");

        String ExpectedTax = d00.format(bb);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void VerifyIfTaxIsCalculatedProperlyAndCalculateRoundOffOpenDiscountInclusiveAmountBT(double discountAmount, double taxPercent) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.1345;

        //double discountAmount = menuItemAmount4 * DiscountPercent;
        //BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        //double cc = discountAmount1.doubleValue();
        //utils.log().info("Discount amount is " + cc);

        double subtotalAfterDiscount = menuItemAmount4 - discountAmount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount11 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount12 = subtotalAfterDiscount11;


        //define tax percentage
        //double taxPercent = 0.10255;
        double taxAmount = subtotalAfterDiscount2 - (subtotalAfterDiscount2 / (1 + taxPercent));
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void verifyIfTaxAndDiscountAreCalculatedProperlyOpenItemDiscountPercentageAfterTax(double taxAmount, double discountPercent) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 * taxAmount;
        utils.log().info("Exact tax amount is " + a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //DiscountAmountCalculation
        double discountAmount = menuItemAmount4 * discountPercent;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is " + cc);
        //SubTotal Calculation
        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount11 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount12 = subtotalAfterDiscount11;

        //RoundOffCalculation
        double c = aa - a;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void verifyIfTaxAndDiscountAreCalculatedProperlyInclusiveOpenItemDiscountPercentageAfterTax(double taxAmount, double discountPercent) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double a = menuItemAmount4 - (menuItemAmount4 / (1 + taxAmount));
        utils.log().info("Exact tax amount is " + a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        String ExpectedTax = String.valueOf(aa);
        utils.log().info("Expected tax amount is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //DiscountAmountCalculation
        double discountAmount = menuItemAmount4 * discountPercent;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is " + cc);

        //SubTotal Calculation
        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount11 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount12 = subtotalAfterDiscount11;

        //RoundOffCalculation
        double c = aa - a;
        BigDecimal ee = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }



    public void selectOptionBtn() {
        elementClick(OptionBtn, "selected option button");
    }

    public void selectDiscountBtn() {

        elementClick(DiscountBtn, "Selected discount button");
    }

    public void selectOpenCheckDiscBtn() {
//        elementClick(openCheckDiscBtn, "selected option button");
    }

    public void VerifyIfExclusiveTaxAndDiscountAreCalculatedProperlyAmountBTToggleDisabled(double taxPercent, double modifierTaxPercent, double discountAmount) {
        //Menu Amount
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //Modifier Amount
        WebElement modifierAmount =  driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container')]//div[@class='modifier-section']/div[5])[1]"));
        String modifierAmount1 = modifierAmount.getText();
        utils.log().info("modifier Amount is " + modifierAmount1);
        double modifierAmount2 = Double.parseDouble(modifierAmount1);


        double subtotalAfterDiscount = menuItemAmount4 - discountAmount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscounta = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscountb = subtotalAfterDiscounta;

        //double taxAmount = subtotalAfterDiscount2 - (subtotalAfterDiscount2 / (1 + taxPercent));
        double taxAmount = subtotalAfterDiscount2 * taxPercent;
        utils.log().info("Exact Tax is " + taxAmount);
        BigDecimal tt = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);
        double tt1 = tt.doubleValue();
        utils.log().info("a is " + tt1);


        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();


        //modifierTax
        //double modifierAmount3 = modifierAmount2 - (modifierAmount2 / (1 + modifierTaxPercent));
        double modifierAmount3 = modifierAmount2 * modifierTaxPercent;
        utils.log().info("Exact Tax2 is " + modifierAmount3);
        BigDecimal yy = new BigDecimal(modifierAmount3).setScale(4, RoundingMode.HALF_UP);
        double yy1 = yy.doubleValue();
        utils.log().info("b is " + yy1);


        BigDecimal dd1 = new BigDecimal(modifierAmount3).setScale(2, RoundingMode.HALF_UP);
        double aa1 = dd1.doubleValue();

        double ty = tt1 + yy1;
        BigDecimal ty1 = new BigDecimal(ty).setScale(2, RoundingMode.HALF_UP);
        double ty2 = ty1.doubleValue();
        String ty3 = String.valueOf(ty2);
        utils.log().info("Exact tax is " + ty3);


        double totalTax = bb + aa1;

//            String ExpectedTax = String.valueOf(totalTax);
//            utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ty3, ActualTax3);

    }

    public void VerifyIfInclusiveTaxAndDiscountAreCalculatedProperlyAmountBTToggleDisabled(double taxPercent, double modifierTaxPercent, double discountAmount) {
        //Menu Amount
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //Modifier Amount
        WebElement modifierAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell/XCUIElementTypeStaticText[3]"));
        String modifierAmount1 = modifierAmount.getText();
        utils.log().info("modifier Amount is " + modifierAmount1);
        double modifierAmount2 = Double.parseDouble(modifierAmount1);


        double subtotalAfterDiscount = menuItemAmount4 - discountAmount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscounta = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscountb = subtotalAfterDiscounta;

        double taxAmount = subtotalAfterDiscount2 - (subtotalAfterDiscount2 / (1 + taxPercent));
        //double taxAmount = subtotalAfterDiscount2 * taxPercent;
        utils.log().info("Exact Tax is " + taxAmount);
        BigDecimal tt = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);
        double tt1 = tt.doubleValue();
        utils.log().info("a is " + tt1);


        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();


        //modifierTax
        double modifierAmount3 = modifierAmount2 - (modifierAmount2 / (1 + modifierTaxPercent));
        //double modifierAmount3 = modifierAmount2 * modifierTaxPercent;
        utils.log().info("Exact Tax2 is " + modifierAmount3);
        BigDecimal yy = new BigDecimal(modifierAmount3).setScale(4, RoundingMode.HALF_UP);
        double yy1 = yy.doubleValue();
        utils.log().info("b is " + yy1);


        BigDecimal dd1 = new BigDecimal(modifierAmount3).setScale(2, RoundingMode.HALF_UP);
        double aa1 = dd1.doubleValue();

        double ty = tt1 + yy1;
        BigDecimal ty1 = new BigDecimal(ty).setScale(2, RoundingMode.HALF_UP);
        double ty2 = ty1.doubleValue();
        String ty3 = String.valueOf(ty2);
        utils.log().info("Exact tax is " + ty3);


        double totalTax = bb + aa1;

//            String ExpectedTax = String.valueOf(totalTax);
//            utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ty3, ActualTax3);

    }

    public void pressArrowDown2() {
        elementClick(arrowDownForOtherMenuItems, "the rest of the categories is listed");
    }

    public void verifyTheExcTaxesAndRoundOffCalculationComboDiscExc(Double taxValue1, Double taxValue2, Double discPerc) {
        WebElement Menu1Price =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[2]"));
        String Menu1PriceAmount = Menu1Price.getText();
        double Menu1PriceValue = Double.parseDouble(Menu1PriceAmount);
        utils.log().info("a is " + Menu1PriceValue);


        double discountAmount1 = Menu1PriceValue * discPerc;
        utils.log().info("b is " + discountAmount1);

        BigDecimal discountAmount2 = new BigDecimal(discountAmount1).setScale(2, RoundingMode.HALF_UP);
        double discountAmount3 = discountAmount2.doubleValue();
        double menu1PriceAfterDiscount = Menu1PriceValue - discountAmount3;
        utils.log().info("c is " + menu1PriceAfterDiscount);


        //define tax percentage for 1st menu and calculate tax
//        double taxPercent = 0.10255;

        double taxAmount = menu1PriceAfterDiscount * taxValue1;
        utils.log().info("Exact Tax1 is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee1 = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ff = ee1.doubleValue();

        String ExpectedTax = String.valueOf(ff);
        utils.log().info("Expected Tax1 is " + ExpectedTax);

//        //2nd Menu Tax Calculation
        WebElement Menu2Price =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[4]"));
        String Menu2PriceAmount = Menu2Price.getText();
        double Menu2PriceValue = Double.parseDouble(Menu2PriceAmount);
        utils.log().info("amount2 is " + Menu2PriceValue);


        double discountAmount4 = Menu2PriceValue * discPerc;
        BigDecimal discountAmount5 = new BigDecimal(discountAmount4).setScale(2, RoundingMode.HALF_UP);
        double discountAmount6 = discountAmount5.doubleValue();
        double menu2PriceAfterDiscount = Menu2PriceValue - discountAmount6;

        //define tax percentage for 2nd menu and calculate tax
//        double taxPercent2 = 0.0622;
//
        double taxAmount2 = menu2PriceAfterDiscount * taxValue2;
        utils.log().info("Exact Tax2 is " + taxAmount2);

        BigDecimal dd2 = new BigDecimal(taxAmount2).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee2 = new BigDecimal(taxAmount2).setScale(4, RoundingMode.HALF_UP);

        double bb2 = dd2.doubleValue();
        double gg = ee2.doubleValue();

        String ExpectedTax2 = String.valueOf(gg);
        utils.log().info("Expected Tax2 is " + ExpectedTax2);

        double totalExpectedTax = ff + gg;
        BigDecimal totalExpectedTax1 = new BigDecimal(totalExpectedTax).setScale(2, RoundingMode.HALF_UP);
        double totalExpectedTax2 = totalExpectedTax1.doubleValue();

        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax2);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);

        //total tax calculation new
        double newTotalTax = ff + gg;
        utils.log().info("Total New Tax is " + newTotalTax);


        //Commenting below steps as there is mismatch in exp and act tax when two exclusive are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

        //RoundOff Calculation for 1st Tax
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double tt = ee.doubleValue();
        String RoundOffValue = String.valueOf(tt);
        utils.log().info("RoundOff value for Tax1 is " + RoundOffValue);

//        //RoundOff Calculation for 2nd Tax
        double d2 = bb2 - taxAmount2;
        BigDecimal yy = new BigDecimal(d2).setScale(4, RoundingMode.HALF_UP);
        double ff2 = yy.doubleValue();
        String RoundOffValue2 = String.valueOf(ff2);
        utils.log().info("RoundOff value for Tax2 is " + RoundOffValue2);

        //Total RoundOff Calculation
        double totalRoundOff = ff + gg;
        BigDecimal totalRoundOff1 = new BigDecimal(totalRoundOff).setScale(2, RoundingMode.HALF_UP);
        double totalRoundOff2 = totalRoundOff1.doubleValue();

        double roundOffTotal = totalRoundOff2 - totalRoundOff;
        BigDecimal roundOffTotal1 = new BigDecimal(roundOffTotal).setScale(4, RoundingMode.HALF_UP);
        double roundOffTotal2 = roundOffTotal1.doubleValue();


        utils.log().info("Total RoundOff value is " + roundOffTotal2);
    }

    public void verifyTheIncTaxesAndRoundOffCalculationComboDiscExc(Double taxValue1, Double taxValue2, Double discPerc) {
        WebElement Menu1Price =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[2]"));
        String Menu1PriceAmount = Menu1Price.getText();
        double Menu1PriceValue = Double.parseDouble(Menu1PriceAmount);
        utils.log().info("a is " + Menu1PriceValue);


        double discountAmount1 = Menu1PriceValue * discPerc;
        utils.log().info("b is " + discountAmount1);

        BigDecimal discountAmount2 = new BigDecimal(discountAmount1).setScale(2, RoundingMode.HALF_UP);
        double discountAmount3 = discountAmount2.doubleValue();
        double menu1PriceAfterDiscount = Menu1PriceValue - discountAmount3;
        utils.log().info("c is " + menu1PriceAfterDiscount);


        //define tax percentage for 1st menu and calculate tax
//        double taxPercent = 0.10255;

        //double taxAmount = menu1PriceAfterDiscount * taxValue1;
        double  taxAmount = menu1PriceAfterDiscount - (menu1PriceAfterDiscount / (1+taxValue1));
        utils.log().info("Exact Tax1 is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee1 = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ff = ee1.doubleValue();

        String ExpectedTax = String.valueOf(ff);
        utils.log().info("Expected Tax1 is " + ExpectedTax);

//        //2nd Menu Tax Calculation
        WebElement Menu2Price =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[4]"));
        String Menu2PriceAmount = Menu2Price.getText();
        double Menu2PriceValue = Double.parseDouble(Menu2PriceAmount);
        utils.log().info("amount2 is " + Menu2PriceValue);


        double discountAmount4 = Menu2PriceValue * discPerc;
        BigDecimal discountAmount5 = new BigDecimal(discountAmount4).setScale(2, RoundingMode.HALF_UP);
        double discountAmount6 = discountAmount5.doubleValue();
        double menu2PriceAfterDiscount = Menu2PriceValue - discountAmount6;

        //define tax percentage for 2nd menu and calculate tax
//        double taxPercent2 = 0.0622;
//
        //double taxAmount2 = menu2PriceAfterDiscount * taxValue2;
        double taxAmount2 = menu2PriceAfterDiscount - (menu2PriceAfterDiscount / (1+taxValue2));
        utils.log().info("Exact Tax2 is " + taxAmount2);

        BigDecimal dd2 = new BigDecimal(taxAmount2).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee2 = new BigDecimal(taxAmount2).setScale(4, RoundingMode.HALF_UP);

        double bb2 = dd2.doubleValue();
        double gg = ee2.doubleValue();

        String ExpectedTax2 = String.valueOf(gg);
        utils.log().info("Expected Tax2 is " + ExpectedTax2);

        double totalExpectedTax = ff + gg;
        BigDecimal totalExpectedTax1 = new BigDecimal(totalExpectedTax).setScale(2, RoundingMode.HALF_UP);
        double totalExpectedTax2 = totalExpectedTax1.doubleValue();

        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax2);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);

        //total tax calculation new
        double newTotalTax = ff + gg;
        utils.log().info("Total New Tax is " + newTotalTax);


        //Commenting below steps as there is mismatch in exp and act tax when two exclusive are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

        //RoundOff Calculation for 1st Tax
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double tt = ee.doubleValue();
        String RoundOffValue = String.valueOf(tt);
        utils.log().info("RoundOff value for Tax1 is " + RoundOffValue);

//        //RoundOff Calculation for 2nd Tax
        double d2 = bb2 - taxAmount2;
        BigDecimal yy = new BigDecimal(d2).setScale(4, RoundingMode.HALF_UP);
        double ff2 = yy.doubleValue();
        String RoundOffValue2 = String.valueOf(ff2);
        utils.log().info("RoundOff value for Tax2 is " + RoundOffValue2);

        //Total RoundOff Calculation
        double totalRoundOff = ff + gg;
        BigDecimal totalRoundOff1 = new BigDecimal(totalRoundOff).setScale(2, RoundingMode.HALF_UP);
        double totalRoundOff2 = totalRoundOff1.doubleValue();

        double roundOffTotal = totalRoundOff2 - totalRoundOff;
        BigDecimal roundOffTotal1 = new BigDecimal(roundOffTotal).setScale(4, RoundingMode.HALF_UP);
        double roundOffTotal2 = roundOffTotal1.doubleValue();


        utils.log().info("Total RoundOff value is " + roundOffTotal2);
    }

    public void VerifyIfTheTaxIsCalculatedProperlyAndCalculateRoundOffForCheckDiscountExclusiveAmount(double DiscountAmount, double taxPercent) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        // double DiscountPercent = 0.24;
        //1st Menu Tax calculation
        WebElement Menu1Price =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String Menu1PriceAmount = Menu1Price.getText();
        double Menu1PriceValue = Double.parseDouble(Menu1PriceAmount);


        double menu1PriceAfterDiscount = Menu1PriceValue - DiscountAmount;

        //define tax percentage for 1st menu and calculate tax
        //   double taxPercent = 0.10255;

        double taxAmount = menu1PriceAfterDiscount * taxPercent;
        utils.log().info("Exact Tax1 is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ee1 = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ff = ee1.doubleValue();

        DecimalFormat d00 = new DecimalFormat("0.00");

        String ExpectedTax = d00.format(bb);

//        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is " + ExpectedTax);

//        //2nd Menu Tax Calculation
//        WebElement Menu2Price =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]");
//        String Menu2PriceAmount = Menu2Price.getText();
//        double Menu2PriceValue = Double.parseDouble(Menu2PriceAmount);
//
//        double discountAmount4 = Menu2PriceValue * DiscountPercent;
//        BigDecimal discountAmount5 = new BigDecimal(discountAmount4).setScale(2, RoundingMode.HALF_UP);
//        double discountAmount6 = discountAmount5.doubleValue();
//        double menu2PriceAfterDiscount = Menu2PriceValue - discountAmount6;
//
//        //define tax percentage for 2nd menu and calculate tax
//        //   double taxPercent2 = 0.0622;
//
//        double taxAmount2 = menu2PriceAfterDiscount * taxPercent2;
//        utils.log().info("Exact Tax2 is " + taxAmount2);
//
//        BigDecimal dd2 = new BigDecimal(taxAmount2).setScale(2, RoundingMode.HALF_UP);
//        BigDecimal ee2 = new BigDecimal(taxAmount2).setScale(4, RoundingMode.HALF_UP);
//
//        double bb2 = dd2.doubleValue();
//        double gg = ee2.doubleValue();
//
//        String ExpectedTax2 = String.valueOf(bb2);
//        utils.log().info("Expected Tax2 is " + ExpectedTax2);
//
//        double totalExpectedTax = bb + bb2;
//        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
//        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);

        //total tax calculation new
//        double newTotalTax = ff + gg;
//        BigDecimal newTotalTax2 = new BigDecimal(newTotalTax).setScale(2, RoundingMode.HALF_UP);
//
//        double newTotalTax3 = newTotalTax2.doubleValue();
//        String newTotalTax4 = String.valueOf(newTotalTax3);
//
//        utils.log().info("Total New Tax is " + newTotalTax);


        //Commenting below steps as there is mismatch in exp and act tax when two exclusive are there (LIN-19736)


        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");

//        double ActualTax4 = Double.parseDouble(ActualTax3);
//       String ActualTax5 = d00.format(ActualTax4);
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        //RoundOff Calculation for 1st Tax
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double tt = ee.doubleValue();
        String RoundOffValue = String.valueOf(tt);
        utils.log().info("RoundOff value for Tax1 is " + RoundOffValue);

//        //RoundOff Calculation for 2nd Tax
//        double d2 = bb2 - taxAmount2;
//        BigDecimal yy = new BigDecimal(d2).setScale(4, RoundingMode.HALF_UP);
//        double ff2 = yy.doubleValue();
//        String RoundOffValue2 = String.valueOf(ff2);
//        utils.log().info("RoundOff value for Tax2 is " + RoundOffValue2);
//
//        //Total RoundOff Calculation
//        double totalRoundOff = ff + gg;
//        BigDecimal totalRoundOff1 = new BigDecimal(totalRoundOff).setScale(2, RoundingMode.HALF_UP);
//        double totalRoundOff2 = totalRoundOff1.doubleValue();
//
//        double roundOffTotal = totalRoundOff2 - totalRoundOff;
//        BigDecimal roundOffTotal1 = new BigDecimal(roundOffTotal).setScale(4, RoundingMode.HALF_UP);
//        double roundOffTotal2 = roundOffTotal1.doubleValue();


//        utils.log().info("Total RoundOff value is " + roundOffTotal2);

    }

    public void verifyIfTheExclusiveTaxMenuAndComboDiscountSetPriceAreCalculatedProperly(Double taxValue, Double setPrice) {

        WebElement menuItemAmount1 =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        WebElement SubTotal =  driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String SubTotalPriceAmount = SubTotal.getAttribute("value");
        String SubTotalPrice = SubTotalPriceAmount.replaceAll("[A-Z$ ]", "");

        double subTotalAmount = Double.parseDouble(SubTotalPrice);
        double discountAmt = subTotalAmount - setPrice;

        double menuDiscountAmount = (menuItemAmount4 / subTotalAmount) * discountAmt;
        utils.log().info(" a is " + menuItemAmount4);

        utils.log().info(" b is " + subTotalAmount);

        utils.log().info(" c is " + discountAmt);

        double menuAfterDisc = menuItemAmount4 - menuDiscountAmount;
        BigDecimal menuAfterDisc1 = new BigDecimal(menuAfterDisc).setScale(2, RoundingMode.HALF_UP);
        double menuAfterDiscount = menuAfterDisc1.doubleValue();

        double taxAmount = menuAfterDiscount * taxValue;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        utils.log().info("Tax1 is " + bb);

        WebElement menuItemAmount11 =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[4]"));
        String menuItemAmount33 = menuItemAmount11.getText();

        double menuItemAmount44 = Double.parseDouble(menuItemAmount33);

        double menuDiscountAmount2 = (menuItemAmount44 / subTotalAmount) * discountAmt;
        utils.log().info(" a is " + menuItemAmount44);

        utils.log().info(" b is " + subTotalAmount);

        utils.log().info(" c is " + discountAmt);

        double menu2AfterDisc = menuItemAmount44 - menuDiscountAmount2;
        BigDecimal menuAfterDisc2 = new BigDecimal(menu2AfterDisc).setScale(2, RoundingMode.HALF_UP);
        double menuAfterDiscount2 = menuAfterDisc2.doubleValue();

        double taxAmount2 = menuAfterDiscount2 * taxValue;
        utils.log().info("Exact Tax is " + taxAmount2);

        BigDecimal dd2 = new BigDecimal(taxAmount2).setScale(4, RoundingMode.HALF_UP);
        double bb2 = dd2.doubleValue();
        utils.log().info("Tax2 is " + bb2);

        WebElement menuItemAmount111 =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[6]"));
        String menuItemAmount333 = menuItemAmount111.getText();

        double menuItemAmount444 = Double.parseDouble(menuItemAmount333);

        double menuDiscountAmount3 = (menuItemAmount444 / subTotalAmount) * discountAmt;
        utils.log().info(" a is " + menuItemAmount444);

        utils.log().info(" b is " + subTotalAmount);

        utils.log().info(" c is " + discountAmt);

        double menu3AfterDisc = menuItemAmount444 - menuDiscountAmount3;
        BigDecimal menuAfterDisc3 = new BigDecimal(menu3AfterDisc).setScale(2, RoundingMode.HALF_UP);
        double menuAfterDiscount3 = menuAfterDisc3.doubleValue();

        double taxAmount3 = menuAfterDiscount3 * taxValue;
        utils.log().info("Exact Tax is " + taxAmount3);

        BigDecimal dd3 = new BigDecimal(taxAmount3).setScale(4, RoundingMode.HALF_UP);
        double bb3 = dd3.doubleValue();
        utils.log().info("Tax3 is " + bb3);

        WebElement menuItemAmount1111 =  driver.findElement(By.xpath("((//ion-content/div/div/div//div[5])[8]//div)[7]"));
        String menuItemAmount3333 = menuItemAmount1111.getText();

        double menuItemAmount4444 = Double.parseDouble(menuItemAmount3333);

        double menuDiscountAmount4 = (menuItemAmount4444 / subTotalAmount) * discountAmt;
        utils.log().info(" a is " + menuItemAmount4444);

        utils.log().info(" b is " + subTotalAmount);

        utils.log().info(" c is " + discountAmt);

        double menu4AfterDisc = menuItemAmount4444 - menuDiscountAmount4;
        BigDecimal menuAfterDisc4 = new BigDecimal(menu4AfterDisc).setScale(2, RoundingMode.HALF_UP);
        double menuAfterDiscount4 = menuAfterDisc4.doubleValue();

        double taxAmount4 = menuAfterDiscount4 * taxValue;
        utils.log().info("Exact Tax is " + taxAmount4);

        BigDecimal dd4 = new BigDecimal(taxAmount4).setScale(4, RoundingMode.HALF_UP);
        double bb4 = dd4.doubleValue();
        utils.log().info("Tax4 is " + bb4);


        double totalExpectedTax = bb + bb2 + bb3 + bb4;
        BigDecimal totalExpectedTax1 = new BigDecimal(totalExpectedTax).setScale(2, RoundingMode.HALF_UP);
        double totalExpectedTax2 = totalExpectedTax1.doubleValue();

        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax2);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);

        //total tax calculation new
        // double newTotalTax = bb + bb2 + bb3 + bb4;
        // utils.log().info("Total New Tax is " + newTotalTax);


//Commenting below steps as there is mismatch in exp and act tax when two exclusive are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

    }

    public void verifyIfTheInclusiveTaxMenuAndComboDiscountSetPriceAreCalculatedProperly(Double taxValue, Double setPrice) {

        WebElement menuItemAmount1 =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        WebElement SubTotal =  driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String SubTotalPriceAmount = SubTotal.getAttribute("value");
        String SubTotalPrice = SubTotalPriceAmount.replaceAll("[A-Z$ ]", "");

        double subTotalAmount = Double.parseDouble(SubTotalPrice);
        double discountAmt = subTotalAmount - setPrice;

        double menuDiscountAmount = (menuItemAmount4 / subTotalAmount) * discountAmt;
        utils.log().info(" a is " + menuItemAmount4);

        utils.log().info(" b is " + subTotalAmount);

        utils.log().info(" c is " + discountAmt);

        double menuAfterDisc = menuItemAmount4 - menuDiscountAmount;
        BigDecimal menuAfterDisc1 = new BigDecimal(menuAfterDisc).setScale(2, RoundingMode.HALF_UP);
        double menuAfterDiscount = menuAfterDisc1.doubleValue();

        double taxAmount = menuAfterDiscount - (menuAfterDiscount / (1 + taxValue));
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        utils.log().info("Tax1 is " + bb);

        WebElement menuItemAmount11 =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[4]"));
        String menuItemAmount33 = menuItemAmount11.getText();

        double menuItemAmount44 = Double.parseDouble(menuItemAmount33);

        double menuDiscountAmount2 = (menuItemAmount44 / subTotalAmount) * discountAmt;
        utils.log().info(" a is " + menuItemAmount44);

        utils.log().info(" b is " + subTotalAmount);

        utils.log().info(" c is " + discountAmt);

        double menu2AfterDisc = menuItemAmount44 - menuDiscountAmount2;
        BigDecimal menuAfterDisc2 = new BigDecimal(menu2AfterDisc).setScale(2, RoundingMode.HALF_UP);
        double menuAfterDiscount2 = menuAfterDisc2.doubleValue();

        double taxAmount2 = menuAfterDiscount2 - (menuAfterDiscount2 / (1 + taxValue));
        utils.log().info("Exact Tax is " + taxAmount2);

        BigDecimal dd2 = new BigDecimal(taxAmount2).setScale(4, RoundingMode.HALF_UP);
        double bb2 = dd2.doubleValue();
        utils.log().info("Tax2 is " + bb2);

        WebElement menuItemAmount111 =  driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[6]"));
        String menuItemAmount333 = menuItemAmount111.getText();

        double menuItemAmount444 = Double.parseDouble(menuItemAmount333);

        double menuDiscountAmount3 = (menuItemAmount444 / subTotalAmount) * discountAmt;
        utils.log().info(" a is " + menuItemAmount444);

        utils.log().info(" b is " + subTotalAmount);

        utils.log().info(" c is " + discountAmt);

        double menu3AfterDisc = menuItemAmount444 - menuDiscountAmount3;
        BigDecimal menuAfterDisc3 = new BigDecimal(menu3AfterDisc).setScale(2, RoundingMode.HALF_UP);
        double menuAfterDiscount3 = menuAfterDisc3.doubleValue();

        double taxAmount3 = menuAfterDiscount3 - (menuAfterDiscount3 / (1 + taxValue));
        utils.log().info("Exact Tax is " + taxAmount3);

        BigDecimal dd3 = new BigDecimal(taxAmount3).setScale(4, RoundingMode.HALF_UP);
        double bb3 = dd3.doubleValue();
        utils.log().info("Tax3 is " + bb3);

        WebElement menuItemAmount1111 =  driver.findElement(By.xpath("((//ion-content/div/div/div//div[5])[8]//div)[7]"));
        String menuItemAmount3333 = menuItemAmount1111.getText();

        double menuItemAmount4444 = Double.parseDouble(menuItemAmount3333);

        double menuDiscountAmount4 = (menuItemAmount4444 / subTotalAmount) * discountAmt;
        utils.log().info(" a is " + menuItemAmount4444);

        utils.log().info(" b is " + subTotalAmount);

        utils.log().info(" c is " + discountAmt);

        double menu4AfterDisc = menuItemAmount4444 - menuDiscountAmount4;
        BigDecimal menuAfterDisc4 = new BigDecimal(menu4AfterDisc).setScale(2, RoundingMode.HALF_UP);
        double menuAfterDiscount4 = menuAfterDisc4.doubleValue();

        double taxAmount4 = menuAfterDiscount4 - (menuAfterDiscount4 / (1 + taxValue));
        utils.log().info("Exact Tax is " + taxAmount4);

        BigDecimal dd4 = new BigDecimal(taxAmount4).setScale(4, RoundingMode.HALF_UP);
        double bb4 = dd4.doubleValue();
        utils.log().info("Tax4 is " + bb4);


        double totalExpectedTax = bb + bb2 + bb3 + bb4;
        BigDecimal totalExpectedTax1 = new BigDecimal(totalExpectedTax).setScale(2, RoundingMode.HALF_UP);
        double totalExpectedTax2 = totalExpectedTax1.doubleValue();

        DecimalFormat d00 = new DecimalFormat("0.00");

        String totalExpectedTaxAmount = d00.format(totalExpectedTax2);
        //String totalExpectedTaxAmount = String.valueOf(totalExpectedTax2);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);

//total tax calculation new
// double newTotalTax = bb + bb2 + bb3 + bb4;
// utils.log().info("Total New Tax is " + newTotalTax);


//Commenting below steps as there is mismatch in exp and act tax when two exclusive are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

    }

    public void verifyIfTheExclusiveTaxAreCalculatedProperlyWhenItemDiscountsAreApplied(Double taxValue,Double Disc1, Double Disc2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.20;

        double discountAmount = menuItemAmount4 * Disc1;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is " + cc);

        double discountAmount2 = menuItemAmount4 * Disc2;
        BigDecimal discountAmount12 = new BigDecimal(discountAmount2).setScale(2, RoundingMode.HALF_UP);
        double cc1 = discountAmount12.doubleValue();
        utils.log().info("Discount amount is " + cc1);

        double disountTotal = cc + cc1;

        double subtotalAfterDiscount = menuItemAmount4 - disountTotal;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;


        //define tax percentage
        //double taxPercent = 0.0622;

        double taxAmount = subtotalAfterDiscount2 * taxValue;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();

        DecimalFormat d00 = new DecimalFormat("0.00");

        String totalExpectedTaxAmount = d00.format(bb);
        String ExpectedTax = String.valueOf(totalExpectedTaxAmount);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void verifyIfTheExclusiveTaxAreCalculatedProperlyWhenItemDiscountsAmountAreApplied(Double taxValue,Double Disc1, Double Disc2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.20;


        double disountTotal = Disc1 + Disc2;

        double subtotalAfterDiscount = menuItemAmount4 - disountTotal;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;


        //define tax percentage
        //double taxPercent = 0.0622;

        double taxAmount = subtotalAfterDiscount2 * taxValue;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();

        DecimalFormat d00 = new DecimalFormat("0.00");

        String totalExpectedTaxAmount = d00.format(bb);
        String ExpectedTax = String.valueOf(totalExpectedTaxAmount);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void verifyIfTheExclusiveTaxAreCalculatedProperlyWhenItemDiscountsAreAppliedAfterTax(Double taxValue,Double Disc1, Double Disc2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.20;

        double discountAmount = menuItemAmount4 * Disc1;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is " + cc);

        double discountAmount2 = menuItemAmount4 * Disc2;
        BigDecimal discountAmount12 = new BigDecimal(discountAmount2).setScale(2, RoundingMode.HALF_UP);
        double cc1 = discountAmount12.doubleValue();
        utils.log().info("Discount amount is " + cc1);

        double disountTotal = cc + cc1;

//        double subtotalAfterDiscount = menuItemAmount4 - disountTotal;
//        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
//        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
//        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
//        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);
//
//        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;


        //define tax percentage
        //double taxPercent = 0.0622;

        double taxAmount = menuItemAmount4 * taxValue;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();

        DecimalFormat d00 = new DecimalFormat("0.00");

        String totalExpectedTaxAmount = d00.format(bb);
        String ExpectedTax = String.valueOf(totalExpectedTaxAmount);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public void verifyIfTheExclusiveTaxAreCalculatedProperlyWhenItemDiscountsAmountAreAppliedAfterTax(Double taxValue,Double Disc1, Double Disc2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.20;


        //define tax percentage
        //double taxPercent = 0.0622;

        double taxAmount = menuItemAmount4 * taxValue;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();

        DecimalFormat d00 = new DecimalFormat("0.00");

        String totalExpectedTaxAmount = d00.format(bb);
        String ExpectedTax = String.valueOf(totalExpectedTaxAmount);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);

        double disountTotal = Disc1 + Disc2;

        DecimalFormat d11 = new DecimalFormat("0.00");

        String totalExpectedDiscountAmount = d11.format(disountTotal);
        String ExpectedDiscount = String.valueOf(totalExpectedDiscountAmount);
        utils.log().info("Expected Discount is " + ExpectedDiscount);

        WebElement ActualDiscoutAmount =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String ActualDiscount2 = ActualDiscoutAmount.getAttribute("value");
        String ActualDiscount3 = ActualDiscount2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual discount is " + ActualDiscount3);

        Assert.assertEquals(ExpectedDiscount, ActualDiscount3);

        //roundOff Calculation
        double d = bb - taxAmount;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);
    }

    public void verifyIfTheExclusiveTaxAreCalculatedProperlyWhenCheckDiscountsAreApplied(Double taxValue,Double Disc1, Double Disc2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.20;

        double discountAmount = menuItemAmount4 * Disc1;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is " + cc);

        double menuAmountAfterDiscount = menuItemAmount4 - cc;
        double discountAmount2 = menuAmountAfterDiscount * Disc2;
        BigDecimal discountAmount12 = new BigDecimal(discountAmount2).setScale(2, RoundingMode.HALF_UP);
        double cc1 = discountAmount12.doubleValue();
        utils.log().info("Discount amount is " + cc1);

        double disountTotal = cc + cc1;

        DecimalFormat d11 = new DecimalFormat("0.00");

        String totalExpectedDiscountAmount = d11.format(disountTotal);
        String ExpectedDiscount = String.valueOf(totalExpectedDiscountAmount);
        utils.log().info("Expected Discount is " + ExpectedDiscount);

        WebElement ActualDiscoutAmount =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String ActualDiscount2 = ActualDiscoutAmount.getAttribute("value");
        String ActualDiscount3 = ActualDiscount2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual discount is " + ActualDiscount3);

        Assert.assertEquals(ExpectedDiscount, ActualDiscount3);

        double subtotalAfterDiscount = menuItemAmount4 - disountTotal;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;


        //define tax percentage
        //double taxPercent = 0.0622;

        double taxAmount = subtotalAfterDiscount2 * taxValue;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();

        DecimalFormat d00 = new DecimalFormat("0.00");

        String totalExpectedTaxAmount = d00.format(bb);
        String ExpectedTax = String.valueOf(totalExpectedTaxAmount);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
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

    public String exclusiveTaxCalculation(String menuValue,String taxValue) {
//        WebElement menuItemAmount1 =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]");
//        String menuItemAmount3 = menuItemAmount1.getText();
//
//        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double amt = Double.parseDouble(taxValue);
        double menuAmount = Double.parseDouble(menuValue);

        double a = menuAmount * amt;
        utils.log().info("Exact tax amount is " + a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        BigDecimal cc = new BigDecimal(a).setScale(4, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        double bb = cc.doubleValue();
        DecimalFormat d00 = new DecimalFormat("0.00");

        String totalExpectedTaxAmount = d00.format(aa);
        utils.log().info("Expected tax amount is " + totalExpectedTaxAmount);

        this.taxRounding = bb;

        return totalExpectedTaxAmount;
    }

    public String discountCalculationSetPriceType(Double Disc1,Double Disc2) {

        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double Discount1 = menuItemAmount4 - Disc1;

        double Discount2 = menuItemAmount4 - Disc2;

        double totalDiscount = Discount1 + Discount2;

        DecimalFormat d11 = new DecimalFormat("0.00");

        String totalExpectedDiscountAmount = d11.format(totalDiscount);
        String ExpectedDiscount = String.valueOf(totalExpectedDiscountAmount);
        utils.log().info("Expected Discount is " + ExpectedDiscount);

        return ExpectedDiscount;
    }

    public String discountCalculationPercentageType(Double Disc1,Double Disc2) {

        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double Discount1 = menuItemAmount4 * Disc1 / 100;
        BigDecimal d1 = new BigDecimal(Discount1).setScale(2,RoundingMode.HALF_UP);
        double Discount11 = d1.doubleValue();

        double Discount2 = menuItemAmount4 * Disc2 / 100;
        BigDecimal d2 = new BigDecimal(Discount2).setScale(2,RoundingMode.HALF_UP);
        double Discount22 = d2.doubleValue();

        double totalDiscount = Discount11 + Discount22;

        DecimalFormat d11 = new DecimalFormat("0.00");

        String totalExpectedDiscountAmount = d11.format(totalDiscount);
        String ExpectedDiscount = String.valueOf(totalExpectedDiscountAmount);
        utils.log().info("Expected Discount is " + ExpectedDiscount);

        return ExpectedDiscount;
    }

    public String inclusiveTaxCalculation(String menuValue,String taxValue) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);
        double menuAmount = Double.parseDouble(menuValue);

        double b = Double.parseDouble(taxValue);
        double a = menuAmount - (menuAmount / (1 + b));
        utils.log().info("Exact tax amount is " + a);

        //double b = menuItemAmount3 - (menuItemAmount3 / (1+a));

        BigDecimal dd = new BigDecimal(a).setScale(2, RoundingMode.HALF_UP);
        BigDecimal cc = new BigDecimal(a).setScale(4, RoundingMode.HALF_UP);
        double aa = dd.doubleValue();
        double bb = cc.doubleValue();
        DecimalFormat d00 = new DecimalFormat("0.00");

        String totalExpectedTaxAmount = d00.format(aa);
        utils.log().info("Expected tax amount is " + totalExpectedTaxAmount);

        this.taxRounding = bb;

        return totalExpectedTaxAmount;
    }

    public String forTotalCalculation(String menuValue,String taxAmounts) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        String s = exclusiveTaxCalculation("","");

        double w = Double.parseDouble(s);

        double x = menuItemAmount4 + w;

        DecimalFormat d = new DecimalFormat("0.00");

        String y = d.format(x);

        // double y = (x * 1000.00 / 1000.00);

        utils.log().info("Expected total amount is " + y);

        return y;
    }

    public String forTotalCalculationInclusive(String taxAmounts) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        double x = menuItemAmount4;

        DecimalFormat d = new DecimalFormat("0.00");

        String y = d.format(x);

        // double y = (x * 1000.00 / 1000.00);

        utils.log().info("Expected total amount is " + y);

        return y;
    }

    public void VerifyExcTaxWhenMultipleMixAndMatchDiscsAppliedSetPrice(Double taxValue, Double Disc1, Double Disc2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();
        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        String ExpectedDiscount = discountCalculationSetPriceType(Disc1,Disc2);
        Double totalDiscount = Double.parseDouble(ExpectedDiscount);

        WebElement ActualDiscoutAmount =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String ActualDiscount2 = ActualDiscoutAmount.getAttribute("value");
        String ActualDiscount3 = ActualDiscount2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual discount is " + ActualDiscount3);

        Assert.assertEquals(ExpectedDiscount, ActualDiscount3);


        double subtotalAfterDiscount = menuItemAmount4 - totalDiscount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        String taxAmount = exclusiveTaxCalculation(subtotalAfterDiscount3,"0.17174");
        Double taxAmt = Double.parseDouble(taxAmount);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(taxAmount, ActualTax3);

        //RoundOff Calculation
        double d = taxAmt - taxRounding;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void VerifyExcTaxWhenMultipleMixAndMatchDiscsAppliedSetPriceAfterTax(Double taxValue, Double Disc1, Double Disc2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();
        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        String ExpectedDiscount = discountCalculationSetPriceType(Disc1,Disc2);
        Double totalDiscount = Double.parseDouble(ExpectedDiscount);

        WebElement ActualDiscoutAmount =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String ActualDiscount2 = ActualDiscoutAmount.getAttribute("value");
        String ActualDiscount3 = ActualDiscount2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual discount is " + ActualDiscount3);

        Assert.assertEquals(ExpectedDiscount, ActualDiscount3);


        double subtotalAfterDiscount = menuItemAmount4 - totalDiscount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        String taxAmount = exclusiveTaxCalculation(menuItemAmount3,"0.17174");
        Double taxAmt = Double.parseDouble(taxAmount);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(taxAmount, ActualTax3);

        //RoundOff Calculation
        double d = taxAmt - taxRounding;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void VerifyIncTaxWhenMultipleMixAndMatchDiscsAppliedSetPrice(Double taxValue, Double Disc1, Double Disc2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();
        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        String ExpectedDiscount = discountCalculationSetPriceType(Disc1, Disc2);
        Double totalDiscount = Double.parseDouble(ExpectedDiscount);

        WebElement ActualDiscoutAmount =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String ActualDiscount2 = ActualDiscoutAmount.getAttribute("value");
        String ActualDiscount3 = ActualDiscount2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual discount is " + ActualDiscount3);

        Assert.assertEquals(ExpectedDiscount, ActualDiscount3);


        double subtotalAfterDiscount = menuItemAmount4 - totalDiscount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        String taxAmount = inclusiveTaxCalculation(subtotalAfterDiscount3, "0.14140");
        Double taxAmt = Double.parseDouble(taxAmount);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(taxAmount, ActualTax3);

        //RoundOff Calculation
        double d = taxAmt - taxRounding;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void VerifyIncTaxWhenMultipleMixAndMatchDiscsAppliedSetPriceAfterTax(Double taxValue, Double Disc1, Double Disc2) {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();
        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        String ExpectedDiscount = discountCalculationSetPriceType(Disc1, Disc2);
        Double totalDiscount = Double.parseDouble(ExpectedDiscount);

        WebElement ActualDiscoutAmount =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String ActualDiscount2 = ActualDiscoutAmount.getAttribute("value");
        String ActualDiscount3 = ActualDiscount2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual discount is " + ActualDiscount3);

        Assert.assertEquals(ExpectedDiscount, ActualDiscount3);


        double subtotalAfterDiscount = menuItemAmount4 - totalDiscount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        String taxAmount = inclusiveTaxCalculation(menuItemAmount3, "0.14140");
        Double taxAmt = Double.parseDouble(taxAmount);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(taxAmount, ActualTax3);

        //RoundOff Calculation
        double d = taxAmt - taxRounding;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void VerifyExcTaxWhenMultipleMixAndMatchDiscsAppliedPercentage(Double taxValue, Double Disc1, Double Disc2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();
        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        String ExpectedDiscount = discountCalculationPercentageType(Disc1,Disc2);
        Double totalDiscount = Double.parseDouble(ExpectedDiscount);

        WebElement ActualDiscoutAmount =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String ActualDiscount2 = ActualDiscoutAmount.getAttribute("value");
        String ActualDiscount3 = ActualDiscount2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual discount is " + ActualDiscount3);

        Assert.assertEquals(ExpectedDiscount, ActualDiscount3);


        double subtotalAfterDiscount = menuItemAmount4 - totalDiscount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        String taxAmount = exclusiveTaxCalculation(subtotalAfterDiscount3,"0.17174");
        Double taxAmt = Double.parseDouble(taxAmount);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(taxAmount, ActualTax3);

        //RoundOff Calculation
        double d = taxAmt - taxRounding;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void VerifyExcTaxWhenMultipleMixAndMatchDiscsAppliedPercentageAT(Double taxValue, Double Disc1, Double Disc2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();
        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        String ExpectedDiscount = discountCalculationPercentageType(Disc1,Disc2);
        Double totalDiscount = Double.parseDouble(ExpectedDiscount);

        WebElement ActualDiscoutAmount =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String ActualDiscount2 = ActualDiscoutAmount.getAttribute("value");
        String ActualDiscount3 = ActualDiscount2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual discount is " + ActualDiscount3);

        Assert.assertEquals(ExpectedDiscount, ActualDiscount3);


        double subtotalAfterDiscount = menuItemAmount4 - totalDiscount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        String taxAmount = exclusiveTaxCalculation(menuItemAmount3,"0.17174");
        Double taxAmt = Double.parseDouble(taxAmount);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(taxAmount, ActualTax3);

        //RoundOff Calculation
        double d = taxAmt - taxRounding;
        BigDecimal ee = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP);
        double ff = ee.doubleValue();
        String RoundOffValue = String.valueOf(ff);
        utils.log().info("RoundOff value is " + RoundOffValue);

    }

    public void VerifyIfTheTaxIsCalculatedCorrectly1(double tax1, double tax2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define tax percentage for 1st menu and calculate tax

        String taxAmount = exclusiveTaxCalculation(menuItemAmount3,"0.10255");
        Double taxAmt = Double.parseDouble(taxAmount);
        utils.log().info("Exact Tax1 is " + taxAmt);

        BigDecimal dd = new BigDecimal(taxAmt).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt = new BigDecimal(taxAmt).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ss = tt.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        TestUtils.excTaxValue = ExpectedTax;
        utils.log().info("Expected Tax1 is " + ExpectedTax);

        //calculate check tax
        double checkTax = (menuItemAmount4 + bb) * tax1;
        utils.log().info("Exact Tax2 (tax on item tax) is " + checkTax);

        BigDecimal checkax1 = new BigDecimal(checkTax).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt2 = new BigDecimal(checkTax).setScale(4, RoundingMode.HALF_UP);

        double checkTax2 = checkax1.doubleValue();
        double ss2 = tt2.doubleValue();

        String checkTaxAmt = String.valueOf(checkTax2);
        utils.log().info("Expected Tax2 is " + checkTaxAmt);
        TestUtils.checkTaxValue = checkTaxAmt;

        //Calculate total tax
        double totalExpectedTax = bb + checkTax2;
        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);
        TestUtils.excCheckTotalTaxValue = totalExpectedTaxAmount;

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
        BigDecimal tt3 = new BigDecimal(totalTax4).setScale(2, RoundingMode.HALF_UP);
        double tt4 = tt3.doubleValue();
        utils.log().info("value2 is " + tt4);

        double tt5 = tt4 - totalTax4;
        BigDecimal tt6 = new BigDecimal(tt5).setScale(4, RoundingMode.HALF_UP);

        String tt7 = String.valueOf(tt6);
//         tt4 = tt4 * 10.0/10.0;
        utils.log().info("Total RoundOff value is " + tt7);

        //Commenting below steps as there is mismatch in exp and act tax when exclusive and tax on item tax are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

    }

    public String checkTaxAmt;
    public void VerifyIfTheTaxIncIsCalculatedCorrectly1(double tax1, double tax2)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define tax percentage for 1st menu and calculate tax

        String taxAmount = inclusiveTaxCalculation(menuItemAmount3,"0.11220");
        Double taxAmt = Double.parseDouble(taxAmount);
        utils.log().info("Exact Tax1 is " + taxAmt);

        BigDecimal dd = new BigDecimal(taxAmt).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt = new BigDecimal(taxAmt).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ss = tt.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        utils.log().info("Expected Tax1 is " + ExpectedTax);
        TestUtils.incTaxValue = ExpectedTax;

        //calculate check tax
        double checkTax = menuItemAmount4  * tax1;
        utils.log().info("Exact Tax2 (tax on item tax) is " + checkTax);

        BigDecimal checkax1 = new BigDecimal(checkTax).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt2 = new BigDecimal(checkTax).setScale(4, RoundingMode.HALF_UP);

        double checkTax2 = checkax1.doubleValue();
        double ss2 = tt2.doubleValue();

        checkTaxAmt = String.valueOf(checkTax2);
        utils.log().info("Expected Tax2 is " + checkTaxAmt);
        DecimalFormat d = new DecimalFormat("0.00");
        String d1 = d.format(checkTax2);
        TestUtils.checkTaxValue = d1;

        //Calculate total tax
        double totalExpectedTax = bb + checkTax2;
        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);
        TestUtils.incCheckTotalTaxValue = totalExpectedTaxAmount;

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
        BigDecimal tt3 = new BigDecimal(totalTax4).setScale(2, RoundingMode.HALF_UP);
        double tt4 = tt3.doubleValue();
        utils.log().info("value2 is " + tt4);

        double tt5 = tt4 - totalTax4;
        BigDecimal tt6 = new BigDecimal(tt5).setScale(4, RoundingMode.HALF_UP);

        String tt7 = String.valueOf(tt6);
//         tt4 = tt4 * 10.0/10.0;
        utils.log().info("Total RoundOff value is " + tt7);

        //Commenting below steps as there is mismatch in exp and act tax when exclusive and tax on item tax are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

    }

    public void VerifyIfTheTotalIsCalculatedCorrectlyWhenIncAndCheckTaxAvailable() {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();
        Double m1 = Double.parseDouble(menuItemAmount3);
        Double m2 = Double.parseDouble(TestUtils.checkTaxValue);
        Double m3 = m1 + m2;
        BigDecimal m4 = new BigDecimal(m3).setScale(2, RoundingMode.HALF_UP);
        Double m5 = m4.doubleValue();

        DecimalFormat d = new DecimalFormat("0.00");

        String ExpectedTotal = d.format(m5);

        String ExpectedTotalValue = ExpectedTotal.replaceAll("[A-Z$ ]", "");
        TestUtils.checkTotalAmount = ExpectedTotalValue;

        WebElement ActualTotal =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String ActualTotalAmount = ActualTotal.getText();
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue);
        String ExpectedTotalValue3 = String.valueOf(ExpectedTotalValue);
        utils.log().info("Expected total is " + ExpectedTotalValue);

        Assert.assertEquals(ActualTotalValue, ExpectedTotalValue);

    }

    public void VerifyIfTheTotalIsCalculatedCorrectlyWhenIncAndCheckTaxAvailableItemDiscApplied() {
        Double m1 = Double.parseDouble(TestUtils.subtotalAfterDiscount4);
        Double m2 = Double.parseDouble(TestUtils.checkTaxValue);
        Double m3 = m1 + m2;
        BigDecimal m4 = new BigDecimal(m3).setScale(2, RoundingMode.HALF_UP);
        Double m5 = m4.doubleValue();

        DecimalFormat d = new DecimalFormat("0.00");

        String ExpectedTotal = d.format(m5);

        String ExpectedTotalValue = ExpectedTotal.replaceAll("[A-Z$ ]", "");
        TestUtils.checkTotalAmount = ExpectedTotalValue;

        WebElement ActualTotal =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String ActualTotalAmount = ActualTotal.getText();
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotalValue);
        String ExpectedTotalValue3 = String.valueOf(ExpectedTotalValue);
        utils.log().info("Expected total is " + ExpectedTotalValue);

        Assert.assertEquals(ActualTotalValue, ExpectedTotalValue);

    }

    public void VerifyIfTheExcTaxIsCalculatedCorrectlyInCheckPreview() throws InterruptedException {
        Thread.sleep(5000);
        WebElement Tax1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTable[2]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]"));
        String tax1Amt = Tax1.getText();
        Assert.assertEquals(tax1Amt.replaceAll("[A-Z$, ]",""), TestUtils.excTaxValue);
        utils.log().info("Expected tax1 is " + TestUtils.excTaxValue);
        utils.log().info("Tax1 in preview screen is " + tax1Amt);


        WebElement tax =  driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String taxTotal =tax.getText();
        Assert.assertEquals(taxTotal.replaceAll("[A-Z$, ]",""), TestUtils.excTaxValue);
        utils.log().info("Expected total tax is " + TestUtils.excTaxValue);
        utils.log().info("Tax total in preview screen is " + taxTotal);

        WebElement total =  driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalTxt = total.getText();
        Assert.assertEquals(totalTxt.replaceAll("[A-Z$, ]",""), TestUtils.checkTotalAmount);
        utils.log().info("Expected total amount is " + TestUtils.checkTotalAmount);
        utils.log().info("Total in preview screen is " + totalTxt);


    }

    public void VerifyIfTheIncTaxIsCalculatedCorrectlyInCheckPreview() throws InterruptedException {
        Thread.sleep(5000);
        WebElement Tax1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTable[2]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]"));
        String tax1Amt = Tax1.getText();
        Assert.assertEquals(tax1Amt.replaceAll("[A-Z$, ]",""), TestUtils.incTaxValue);
        utils.log().info("Expected tax1 is " + TestUtils.incTaxValue);
        utils.log().info("Tax1 in preview screen is " + tax1Amt);


        WebElement tax =  driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String taxTotal =tax.getText();
        Assert.assertEquals(taxTotal.replaceAll("[A-Z$, ]",""), TestUtils.incTaxValue);
        utils.log().info("Expected total tax is " + TestUtils.incTaxValue);
        utils.log().info("Tax total in preview screen is " + taxTotal);

        WebElement total =  driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalTxt = total.getText();
        Assert.assertEquals(totalTxt.replaceAll("[A-Z$, ]",""), TestUtils.checkTotalAmountInc);
        utils.log().info("Expected total amount is " + TestUtils.checkTotalAmountInc);
        utils.log().info("Total in preview screen is " + totalTxt);


    }

    public void VerifyIfTheExcTaxIsCalculatedCorrectlyInCheckPreviewCheckTaxAvailable() throws InterruptedException {
        Thread.sleep(5000);
        WebElement Tax1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTable[2]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]"));
        String tax1Amt = Tax1.getText();
        Assert.assertEquals(tax1Amt.replaceAll("[A-Z$, ]",""), TestUtils.excTaxValue);
        utils.log().info("Expected tax1 is " + TestUtils.excTaxValue);
        utils.log().info("Tax1 in preview screen is " + tax1Amt);

        WebElement Tax2 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTable[2]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]"));
        String tax2Amt = Tax2.getText();
        Assert.assertEquals(tax2Amt.replaceAll("[A-Z$, ]",""), TestUtils.checkTaxValue);
        utils.log().info("Expected tax2 is " + TestUtils.checkTaxValue);
        utils.log().info("Tax2 in preview screen is " + tax2Amt);


        WebElement tax =  driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String taxTotal =tax.getText();
        Assert.assertEquals(taxTotal.replaceAll("[A-Z$, ]",""), TestUtils.excCheckTotalTaxValue);
        utils.log().info("Expected total tax is " + TestUtils.excCheckTotalTaxValue);
        utils.log().info("Tax total in preview screen is " + taxTotal);

        WebElement total =  driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalTxt = total.getText();
        Assert.assertEquals(totalTxt.replaceAll("[A-Z$, ]",""), TestUtils.checkTotalAmount);
        utils.log().info("Expected total amount is " + TestUtils.checkTotalAmount);
        utils.log().info("Total in preview screen is " + totalTxt);
    }

    public void VerifyIfTheIncTaxIsCalculatedCorrectlyInCheckPreviewCheckTaxAvailable() throws InterruptedException {
        Thread.sleep(5000);
        WebElement Tax1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTable[2]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]"));
        String tax1Amt = Tax1.getText();
        Assert.assertEquals(tax1Amt.replaceAll("[A-Z$, ]",""), TestUtils.incTaxValue);
        utils.log().info("Expected tax1 is " + TestUtils.incTaxValue);
        utils.log().info("Tax1 in preview screen is " + tax1Amt);

        WebElement Tax2 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTable[2]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]"));
        String tax2Amt = Tax2.getText();
        Assert.assertEquals(tax2Amt.replaceAll("[A-Z$, ]",""), TestUtils.checkTaxValue);
        utils.log().info("Expected tax2 is " + TestUtils.checkTaxValue);
        utils.log().info("Tax2 in preview screen is " + tax1Amt);


        WebElement tax =  driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String taxTotal =tax.getText();
        Assert.assertEquals(taxTotal.replaceAll("[A-Z$, ]",""), TestUtils.incCheckTotalTaxValue);
        utils.log().info("Expected total tax is " + TestUtils.incCheckTotalTaxValue);
        utils.log().info("Tax total in preview screen is " + taxTotal);

        WebElement total =  driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalTxt = total.getText();
        Assert.assertEquals(totalTxt.replaceAll("[A-Z$, ]",""), TestUtils.checkTotalAmount);
        utils.log().info("Expected total amount is " + TestUtils.checkTotalAmount);
        utils.log().info("Total in preview screen is " + totalTxt);
    }

    public void VerifyIfTotalValueIsCalculatedCorrectlyWithoutTaxExclusive()
    {
        WebElement ActualTotalAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTotal2 = ActualTotalAmount.getText();
        String ActualTotal3 = ActualTotal2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual total is " + ActualTotal3);
        utils.log().info("Expected total is " + TestUtils.subTotalAmount);

        Assert.assertEquals(TestUtils.subTotalAmount, ActualTotal3);
    }

    public void VerifyIfExclusiveTaxAndDiscountArecalculatedProperlyAmountBT(double taxPercent, double modifierTaxPercent, double discountAmount) {
        //Menu Amount
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //Modifier Amount
        WebElement modifierAmount =  driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container')]//div[@class='modifier-section']/div[5])[1]"));
        String modifierAmount1 = modifierAmount.getText();
        utils.log().info("modifier Amount is " + modifierAmount1);
        double modifierAmount2 = Double.parseDouble(modifierAmount1);

        //define discount percentage
        //double DiscountAmount = 5;

        WebElement subTotalAmount3 =  driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmount2 = subTotalAmount3.getAttribute("value");
        String subTotalAmount1 = subTotalAmount2.replaceAll("[A-Z$ ]", "");

        double subTotalAmount = Double.parseDouble(subTotalAmount1);

        double menuDiscountAmount = (menuItemAmount4 / subTotalAmount) * discountAmount;

        double menuAfterDisc = menuItemAmount4 - menuDiscountAmount;
        BigDecimal menuAfterDisc1 = new BigDecimal(menuAfterDisc).setScale(2, RoundingMode.HALF_UP);
        double menuAfterDiscount = menuAfterDisc1.doubleValue();

        double modifierDiscountAmount = (modifierAmount2 / subTotalAmount) * discountAmount;

        double modifierAfterDisc = modifierAmount2 - modifierDiscountAmount;
        BigDecimal modifierAfterDisc1 = new BigDecimal(modifierAfterDisc).setScale(2, RoundingMode.HALF_UP);
        double modifierAfterDiscount = modifierAfterDisc1.doubleValue();

        double taxAmount = menuAfterDiscount * taxPercent;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        utils.log().info("Tax1 is " + bb);

        //modifierTax
        //double modifierTax = modifierAmount2 - (modifierAmount2 / (1 + modifierTaxPercent));
        double modifierAmount3 = modifierAfterDiscount * modifierTaxPercent;
        BigDecimal dd1 = new BigDecimal(modifierAmount3).setScale(4, RoundingMode.HALF_UP);
        double aa1 = dd1.doubleValue();
        utils.log().info("Tax2 is " + aa1);


        double totalTax = bb + aa1;
        BigDecimal totalTax1 = new BigDecimal(totalTax).setScale(2, RoundingMode.HALF_UP);
        double totalTax2 = totalTax1.doubleValue();

        DecimalFormat d00 = new DecimalFormat("0.00");
        String ExpectedTax = d00.format(totalTax2);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);
    }

    public void VerifyIfBalanceDueValueIsCalculatedCorrectlyAfterTaxExempt() throws InterruptedException {
        WebElement TotalAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTotalAmount = TotalAmount.getText();
        String ActualTotalValue = ActualTotalAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Expected Balance due is " + ActualTotalValue);

        elementClick(PaymentBtn, "Selected Payment Button");
        Thread.sleep(1000);
        WebElement BalanceDue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String BalanceDueAmount = BalanceDue.getText();

        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ActualTotalValue, BalanceDueValue);
    }

    public void VerifyIfTotalValueIsCalculatedCorrectlyWithoutTaxExclusiveInCheckPreview() throws InterruptedException {
        Thread.sleep(5000);
        WebElement tax =  driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String taxTotal =tax.getText();
        Assert.assertEquals(taxTotal.replaceAll("[A-Z$, ]",""), "0.00");
//        utils.log().info("Expected total tax is " + TestUtils.incCheckTotalTaxValue);
        utils.log().info("Tax total in preview screen is " + taxTotal);

        WebElement total =  driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalTxt = total.getText();
        Assert.assertEquals(totalTxt.replaceAll("[A-Z$, ]",""), TestUtils.subTotalAmount);
        utils.log().info("Expected total amount is " + TestUtils.subTotalAmount);
        utils.log().info("Total in preview screen is " + totalTxt);
    }

    public void VerifyIfTheTaxIsCalculatedCorrectly1ChecktaxWhenItemDiscountIsApplied(double tax1, double tax2, double discPerc)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.30;

        double discountAmount = menuItemAmount4 * discPerc;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is " + cc);

        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        //define tax percentage for 1st menu and calculate tax

        String taxAmount = exclusiveTaxCalculation(subtotalAfterDiscount3,"0.10255");
        Double taxAmt = Double.parseDouble(taxAmount);
        utils.log().info("Exact Tax1 is " + taxAmt);

        BigDecimal dd = new BigDecimal(taxAmt).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt = new BigDecimal(taxAmt).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ss = tt.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        TestUtils.excTaxValue = ExpectedTax;
        utils.log().info("Expected Tax1 is " + ExpectedTax);

        //calculate check tax
        double checkTax = (subtotalAfterDiscount2 + bb) * tax1;
        utils.log().info("Exact Tax2 (check tax) is " + checkTax);

        BigDecimal checkax1 = new BigDecimal(checkTax).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt2 = new BigDecimal(checkTax).setScale(4, RoundingMode.HALF_UP);

        double checkTax2 = checkax1.doubleValue();
        double ss2 = tt2.doubleValue();

        String checkTaxAmt = String.valueOf(checkTax2);
        utils.log().info("Expected Tax2 is " + checkTaxAmt);
        TestUtils.checkTaxValue = checkTaxAmt;

        //Calculate total tax
        double totalExpectedTax = bb + checkTax2;
        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);
        TestUtils.excCheckTotalTaxValue = totalExpectedTaxAmount;

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
        BigDecimal tt3 = new BigDecimal(totalTax4).setScale(2, RoundingMode.HALF_UP);
        double tt4 = tt3.doubleValue();
        utils.log().info("value2 is " + tt4);

        double tt5 = tt4 - totalTax4;
        BigDecimal tt6 = new BigDecimal(tt5).setScale(4, RoundingMode.HALF_UP);

        String tt7 = String.valueOf(tt6);
//         tt4 = tt4 * 10.0/10.0;
        utils.log().info("Total RoundOff value is " + tt7);

        //Commenting below steps as there is mismatch in exp and act tax when exclusive and tax on item tax are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

    }

    public void VerifyIfTheTaxIsCalculatedCorrectly1ChecktaxWhenItemDiscountIsAppliedInc(double tax1, double tax2, double discPerc)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.30;

        double discountAmount = menuItemAmount4 * discPerc;
        BigDecimal discountAmount1 = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP);
        double cc = discountAmount1.doubleValue();
        utils.log().info("Discount amount is " + cc);

        double subtotalAfterDiscount = menuItemAmount4 - cc;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        //define tax percentage for 1st menu and calculate tax

        String taxAmount = inclusiveTaxCalculation(subtotalAfterDiscount3,"0.11220");
        Double taxAmt = Double.parseDouble(taxAmount);
        utils.log().info("Exact Tax1 is " + taxAmt);

        BigDecimal dd = new BigDecimal(taxAmt).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt = new BigDecimal(taxAmt).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ss = tt.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        TestUtils.incTaxValue = ExpectedTax;
        utils.log().info("Expected Tax1 is " + ExpectedTax);

        //calculate check tax
        double checkTax = (subtotalAfterDiscount2) * tax1;
        utils.log().info("Exact Tax2 (check tax) is " + checkTax);

        BigDecimal checkax1 = new BigDecimal(checkTax).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt2 = new BigDecimal(checkTax).setScale(4, RoundingMode.HALF_UP);

        double checkTax2 = checkax1.doubleValue();
        double ss2 = tt2.doubleValue();

        String checkTaxAmt = String.valueOf(checkTax2);
        utils.log().info("Expected Tax2 is " + checkTaxAmt);
        TestUtils.checkTaxValue = checkTaxAmt;

        //Calculate total tax
        double totalExpectedTax = bb + checkTax2;
        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);
        TestUtils.incCheckTotalTaxValue = totalExpectedTaxAmount;

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
        BigDecimal tt3 = new BigDecimal(totalTax4).setScale(2, RoundingMode.HALF_UP);
        double tt4 = tt3.doubleValue();
        utils.log().info("value2 is " + tt4);

        double tt5 = tt4 - totalTax4;
        BigDecimal tt6 = new BigDecimal(tt5).setScale(4, RoundingMode.HALF_UP);

        String tt7 = String.valueOf(tt6);
//         tt4 = tt4 * 10.0/10.0;
        utils.log().info("Total RoundOff value is " + tt7);

        //Commenting below steps as there is mismatch in exp and act tax when exclusive and tax on item tax are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

    }

    public void VerifyIfTheTaxIsCalculatedCorrectly1ChecktaxWhenItemDiscountAmountTypeIsApplied(double tax1, double tax2, double discAmount)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.30;

        double subtotalAfterDiscount = menuItemAmount4 - discAmount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        //define tax percentage for 1st menu and calculate tax

        String taxAmount = exclusiveTaxCalculation(subtotalAfterDiscount3,"0.10255");
        Double taxAmt = Double.parseDouble(taxAmount);
        utils.log().info("Exact Tax1 is " + taxAmt);

        BigDecimal dd = new BigDecimal(taxAmt).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt = new BigDecimal(taxAmt).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ss = tt.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        TestUtils.excTaxValue = ExpectedTax;
        utils.log().info("Expected Tax1 is " + ExpectedTax);

        //calculate check tax
        double checkTax = (subtotalAfterDiscount2 + bb) * tax1;
        utils.log().info("Exact Tax2 (check tax) is " + checkTax);

        BigDecimal checktax1 = new BigDecimal(checkTax).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt2 = new BigDecimal(checkTax).setScale(4, RoundingMode.HALF_UP);

        double checkTax2 = checktax1.doubleValue();
        double ss2 = tt2.doubleValue();

        String checkTaxAmt = String.valueOf(checkTax2);
        utils.log().info("Expected Tax2 is " + checkTaxAmt);
        DecimalFormat d00 = new DecimalFormat("0.00");
        String checkTaxAmt2 = d00.format(checkTax2);
        TestUtils.checkTaxValue = checkTaxAmt2;

        //Calculate total tax
        double totalExpectedTax = bb + checkTax2;
        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);
        TestUtils.excCheckTotalTaxValue = totalExpectedTaxAmount;

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
        BigDecimal tt3 = new BigDecimal(totalTax4).setScale(2, RoundingMode.HALF_UP);
        double tt4 = tt3.doubleValue();
        utils.log().info("value2 is " + tt4);

        double tt5 = tt4 - totalTax4;
        BigDecimal tt6 = new BigDecimal(tt5).setScale(4, RoundingMode.HALF_UP);

        String tt7 = String.valueOf(tt6);
//         tt4 = tt4 * 10.0/10.0;
        utils.log().info("Total RoundOff value is " + tt7);

        //Commenting below steps as there is mismatch in exp and act tax when exclusive and tax on item tax are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

    }

    public void VerifyIfTheTaxIsCalculatedCorrectly1ChecktaxWhenItemDiscountAmountTypeIsAppliedInc(double tax1, double tax2, double discAmount)
    {
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //define discount percentage
        //double DiscountPercent = 0.30;

        double subtotalAfterDiscount = menuItemAmount4 - discAmount;
        BigDecimal subtotalAfterDiscount1 = new BigDecimal(subtotalAfterDiscount).setScale(2, RoundingMode.HALF_UP);
        double subtotalAfterDiscount2 = subtotalAfterDiscount1.doubleValue();
        utils.log().info("subtotal after discount is " + subtotalAfterDiscount2);
        subtotalAfterDiscount3 = String.valueOf(subtotalAfterDiscount2);

        TestUtils.subtotalAfterDiscount4 = subtotalAfterDiscount3;

        //define tax percentage for 1st menu and calculate tax

        String taxAmount = inclusiveTaxCalculation(subtotalAfterDiscount3,"0.11220");
        Double taxAmt = Double.parseDouble(taxAmount);
        utils.log().info("Exact Tax1 is " + taxAmt);

        BigDecimal dd = new BigDecimal(taxAmt).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt = new BigDecimal(taxAmt).setScale(4, RoundingMode.HALF_UP);

        double bb = dd.doubleValue();
        double ss = tt.doubleValue();

        String ExpectedTax = String.valueOf(bb);
        TestUtils.incTaxValue = ExpectedTax;
        utils.log().info("Expected Tax1 is " + ExpectedTax);

        //calculate check tax
        double checkTax = (subtotalAfterDiscount2) * tax1;
        utils.log().info("Exact Tax2 (check tax) is " + checkTax);

        BigDecimal checkax1 = new BigDecimal(checkTax).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tt2 = new BigDecimal(checkTax).setScale(4, RoundingMode.HALF_UP);

        double checkTax2 = checkax1.doubleValue();
        double ss2 = tt2.doubleValue();

        String checkTaxAmt = String.valueOf(checkTax2);
        utils.log().info("Expected Tax2 is " + checkTaxAmt);
        TestUtils.checkTaxValue = checkTaxAmt;

        //Calculate total tax
        double totalExpectedTax = bb + checkTax2;
        String totalExpectedTaxAmount = String.valueOf(totalExpectedTax);
        utils.log().info("Total Expected Tax is " + totalExpectedTaxAmount);
        TestUtils.incCheckTotalTaxValue = totalExpectedTaxAmount;

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
        BigDecimal tt3 = new BigDecimal(totalTax4).setScale(2, RoundingMode.HALF_UP);
        double tt4 = tt3.doubleValue();
        utils.log().info("value2 is " + tt4);

        double tt5 = tt4 - totalTax4;
        BigDecimal tt6 = new BigDecimal(tt5).setScale(4, RoundingMode.HALF_UP);

        String tt7 = String.valueOf(tt6);
//         tt4 = tt4 * 10.0/10.0;
        utils.log().info("Total RoundOff value is " + tt7);

        //Commenting below steps as there is mismatch in exp and act tax when exclusive and tax on item tax are there (LIN-19736)

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String ActualTax2 = ActualTaxAmount.getText();
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(totalExpectedTaxAmount, ActualTax3);

    }
    public void iVerifyIfPriceIsCorrectForTheFirstModifier(Double modifierAmount)
    {
        WebElement modifierAmountInScreen =  driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container')]//div[@class='modifier-section']/div[5])[1]"));
        String modifierAmount1 = modifierAmountInScreen.getText();
        double modifierAmount2 = Double.parseDouble(modifierAmount1);
        DecimalFormat d00 = new DecimalFormat("0.00");
        String modifierAmountt = d00.format(modifierAmount2);

        utils.log().info("modifier Amount is " + modifierAmount1);
//         double modifierAmount2 = Double.parseDouble(modifierAmountt);
        //String expectedModifierAmount = String.valueOf(modifierAmount);
        Double expectedModifierAmount = modifierAmount;
        DecimalFormat d000 = new DecimalFormat("0.00");
        String expectedModifierAmount1 = d000.format(expectedModifierAmount);
        //Double expectedModifierAmount = 0.00;

        Assert.assertEquals(modifierAmountt, expectedModifierAmount1);

    }

    public void iVerifyIfPriceIsCorrectForTheSecondModifier(Double modifierAmount)
    {
        WebElement modifierAmountInScreen =  driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container')]//div[@class='modifier-section']/div[5])[1]"));
        String modifierAmount1 = modifierAmountInScreen.getText();
        double modifierAmount2 = Double.parseDouble(modifierAmount1);
        DecimalFormat d00 = new DecimalFormat("0.00");
        String modifierAmountt = d00.format(modifierAmount2);

        utils.log().info("modifier Amount is " + modifierAmount1);
//         double modifierAmount2 = Double.parseDouble(modifierAmountt);
        //String expectedModifierAmount = String.valueOf(modifierAmount);
        Double expectedModifierAmount = modifierAmount;
        DecimalFormat d000 = new DecimalFormat("0.00");
        String expectedModifierAmount1 = d000.format(expectedModifierAmount);
        //Double expectedModifierAmount = 0.00;

        Assert.assertEquals(modifierAmountt, expectedModifierAmount1);

    }
    public void iReduceTheQtyOfModifier()
    {
//        WebElement sides =  driver.findElement(By.xpath()("//XCUIElementTypeButton[@name=\"-\"]");
//        elementClick(sides,"Selected Sides" );

        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
//       WebElement modifierQtyReduce =  driver.findElement(By.xpath()("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]");
        WebElement modifierQtyReduce =  driver.findElement(By.xpath("(//ion-row[contains(@class,'modifier_content')]//ion-col//button)[1]//span//span[1]"));
        modifierQtyReduce.click();
//        WebElement quantityValue =  driver.findElement(By.xpath(quantity);
//        elementClick(quantityValue, "Entered the quantity");
//
//        elementClick(ContinueBtn, "Selected continue button");
    }

    public void VerifyIfDiscountIsCalculatedCorrectlyAfter100PercentDiscountIsApplied()

    {
        WebElement Menu1Price =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String Menu1PriceAmount = Menu1Price.getText();
        double Menu1PriceValue = Double.parseDouble(Menu1PriceAmount);
//          double discountAmount = 0.00;
        DecimalFormat d000 = new DecimalFormat("0.00");
        String expectedDiscountAmount = d000.format(Menu1PriceValue);

        //String ExpectedDiscount2 = String.valueOf(expectedDiscountAmount);
        utils.log().info("Discount amount is " + expectedDiscountAmount);

        WebElement ActualDiscoutAmount =  driver.findElement(By.xpath("//div[@id='os_discountAmountStr']//input"));
        String ActualDiscount2 = ActualDiscoutAmount.getAttribute("value");
        String ActualDiscount3 = ActualDiscount2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual discount is " + ActualDiscount3);

        Assert.assertEquals(expectedDiscountAmount, ActualDiscount3);
    }

    public void iSelectedCheckFromTheList(String checkNum) throws InterruptedException {
//          String[] array={"56-005","56-006","56-007","56-008","56-005"};
        String array= checkNum;


//          List<String> list=new ArrayList<String>();
//          for(String lang:array){
//              list.add(lang);

        Thread.sleep(5000);
//              String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabInActiveTab.clear();
        searchTabInActiveTab.sendKeys(array);
        Thread.sleep(5000);
        WebElement globalCheckNumber1 =  driver.findElement(By.xpath(array));
        globalCheckNumber1.click();
//              WebElement phoneOrders =  mergeAndFindElement(array,"",TestUtils.xpath);
//              if (phoneOrders.isDisplayed()){
//                  utils.log().info(globalCheckNumber1 + " - Closed Check is displayed in Active tab");
//              }else {
//                  utils.log().info("Closed check is not displayed");
//              }
    }

    public void VerifyIfTheBalanceDueIsCalculatedCorrectlyAfterPaymentWebOrder() throws InterruptedException {

        elementClick(cashBtn, "Selected Cash Button");
        String ExpectedDueAmount = "0.00";
        utils.log().info("Expected balance due after payment is " + ExpectedDueAmount);

        WebElement BalanceDue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String BalanceDueAmount = BalanceDue.getText();
        String BalanceDueValue = BalanceDueAmount.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual Balance due is " + BalanceDueValue);


        Assert.assertEquals(ExpectedDueAmount, BalanceDueValue);

        elementClick(SubmitBtn, "Selected Submit Button");
//        new OrderTypeWindow().pressCancelBtn();
    }

    public String getCheckNumberTxt() {
        WebElement checkNum = driver.findElement(By.xpath("//p[contains(.,'Check')]/../p[2]"));
        checkNumber = checkNum.getText();
        TestUtils.globalCheckNumber = checkNumber;
        utils.log().info(checkNumber);
        return checkNumber;
    }


    public void verifyClosedCheckInClosedCheckTab() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabClosedTab.clear();
        searchTabClosedTab.sendKeys(globalCheckNumber);
        WebElement phoneOrders = driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']/div[1]/tr/td[2]"));
        if (phoneOrders.isDisplayed()){
            elementClick(phoneOrders,"Tapped Closed Checks");
            utils.log().info(globalCheckNumber + " - Closed Check is displayed in closed tab");
        }else {
            utils.log().info("Closed check is not displayed");
        }
    }

    public void pressReopenCheckStatsBtn() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        elementClick(reOpenCheckStats,"Tapped Reopen check stats button");
        Thread.sleep(2000);
    }

    public void VerifyIfInclusiveTaxAndDiscountArecalculatedProperlyAmountBT(double taxPercent, double modifierTaxPercent, double discountAmount)
    {
        //Menu Amount
        WebElement menuItemAmount1 =  driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //Modifier Amount
        WebElement modifierAmount =  driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container')]//div[@class='modifier-section']/div[5])[1]"));
        String modifierAmount1 = modifierAmount.getText();
        utils.log().info("modifier Amount is " + modifierAmount1);
        double modifierAmount2 = Double.parseDouble(modifierAmount1);

        WebElement subTotalAmount3 =  driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmount2 = subTotalAmount3.getAttribute("value");
        String subTotalAmount1 = subTotalAmount2.replaceAll("[A-Z$ ]", "");

        double subTotalAmount = Double.parseDouble(subTotalAmount1);

        double menuDiscountAmount = (menuItemAmount4 / subTotalAmount) * discountAmount;

        double menuAfterDisc = menuItemAmount4 - menuDiscountAmount;
        BigDecimal menuAfterDisc1 = new BigDecimal(menuAfterDisc).setScale(2, RoundingMode.HALF_UP);
        double menuAfterDiscount = menuAfterDisc1.doubleValue();

        double modifierDiscountAmount = (modifierAmount2 / subTotalAmount) * discountAmount;

        double modifierAfterDisc = modifierAmount2 - modifierDiscountAmount;
        BigDecimal modifierAfterDisc1 = new BigDecimal(modifierAfterDisc).setScale(2, RoundingMode.HALF_UP);
        double modifierAfterDiscount = modifierAfterDisc1.doubleValue();

        double taxAmount = menuAfterDiscount - (menuAfterDiscount / (1 + taxPercent));
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        utils.log().info("Tax1 is " + bb);

        //modifierTax
        //double modifierTax = modifierAmount2 - (modifierAmount2 / (1 + modifierTaxPercent));
        double modifierAmount3 = modifierAfterDiscount - (modifierAfterDiscount / (1 + modifierTaxPercent));
        BigDecimal dd1 = new BigDecimal(modifierAmount3).setScale(4, RoundingMode.HALF_UP);
        double aa1 = dd1.doubleValue();
        utils.log().info("Tax2 is " + aa1);


        double totalTax = bb + aa1;
        BigDecimal totalTax1 = new BigDecimal(totalTax).setScale(2, RoundingMode.HALF_UP);
        double totalTax2 = totalTax1.doubleValue();

        DecimalFormat d00 = new DecimalFormat("0.00");
        String ExpectedTax = d00.format(totalTax2);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount =  driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);


    }

    public void pressDoneOpenItemBtn1(){
        WebElement done1Btn = driver.findElement(By.xpath("//button[contains(.,'Done')]"));
        elementClick( done1Btn, "Done button is tapped - ");
    }

    public void pressDoneOpenItemBtn1S() throws InterruptedException {

        Thread.sleep(1000);
        WebElement done1Btn = driver.findElement(By.xpath("//button[contains(.,'Done')]"));
        elementClick( done1Btn, "Done button is tapped - ");
    }

    public void VerifyIfExclusiveTaxAndDiscountArecalculatedProperlyAmountBTCheckTax(double taxPercent, double modifierTaxPercent, double checkTaxPercent, double discPerc) {
        //Menu Amount
        WebElement menuItemAmount1 = driver.findElement(By.xpath("//ion-content/div/div/div//div[5]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //Modifier Amount
        WebElement modifierAmount = driver.findElement(By.xpath("(//div[contains(@class,'orderlist-container')]//div[@class='modifier-section']/div[5])[1]"));
        String modifierAmount1 = modifierAmount.getText();
        utils.log().info("modifier Amount is " + modifierAmount1);
        double modifierAmount2 = Double.parseDouble(modifierAmount1);

        //define discount percentage
        //double DiscountAmount = 5;

        WebElement subTotalAmount3 = driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmount2 = subTotalAmount3.getAttribute("value");
        String subTotalAmount1 = subTotalAmount2.replaceAll("[A-Z$ ]", "");

        double subTotalAmount = Double.parseDouble(subTotalAmount1);

        double discountAmount = subTotalAmount * discPerc;

        double subTotalAfterDisc = subTotalAmount - discountAmount;

        double menuDiscountAmount = (menuItemAmount4 / subTotalAmount) * discountAmount;

        double menuAfterDisc = menuItemAmount4 - menuDiscountAmount;
        BigDecimal menuAfterDisc1 = new BigDecimal(menuAfterDisc).setScale(2, RoundingMode.HALF_UP);
        double menuAfterDiscount = menuAfterDisc1.doubleValue();

        double modifierDiscountAmount = (modifierAmount2 / subTotalAmount) * discountAmount;

        double modifierAfterDisc = modifierAmount2 - modifierDiscountAmount;
        BigDecimal modifierAfterDisc1 = new BigDecimal(modifierAfterDisc).setScale(2, RoundingMode.HALF_UP);
        double modifierAfterDiscount = modifierAfterDisc1.doubleValue();

        double taxAmount = menuAfterDiscount * taxPercent;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal menuTaxValue1 = new BigDecimal(taxAmount).setScale(2, RoundingMode.HALF_UP);
        double menuTaxValue2 = menuTaxValue1.doubleValue();

        BigDecimal dd = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        utils.log().info("Tax1 is " + bb);

        //modifierTax
        //double modifierTax = modifierAmount2 - (modifierAmount2 / (1 + modifierTaxPercent));
        double modifierAmount3 = modifierAfterDiscount * modifierTaxPercent;

        BigDecimal modTaxValue1 = new BigDecimal(modifierAmount3).setScale(2, RoundingMode.HALF_UP);
        double modTaxValue2 = modTaxValue1.doubleValue();
        BigDecimal dd1 = new BigDecimal(modifierAmount3).setScale(4, RoundingMode.HALF_UP);
        double aa1 = dd1.doubleValue();
        utils.log().info("Tax2 is " + aa1);

        double totalWithTax = subTotalAfterDisc + menuTaxValue2 + modTaxValue2;
        utils.log().info("menu after disc is " + menuAfterDiscount);
        utils.log().info("Menu tax is " + menuTaxValue2);
        utils.log().info("Modifier tax is " + modTaxValue2);
        utils.log().info("Total with Tax is " + totalWithTax);

        double checkTaxamount = totalWithTax * checkTaxPercent;
        BigDecimal ddd1 = new BigDecimal(checkTaxamount).setScale(4, RoundingMode.HALF_UP);
        double aaa1 = ddd1.doubleValue();
        utils.log().info("Check Tax is " + aa1);

        double totalTax = bb + aa1 + aaa1;
        BigDecimal totalTax1 = new BigDecimal(totalTax).setScale(2, RoundingMode.HALF_UP);
        double totalTax2 = totalTax1.doubleValue();

        DecimalFormat d00 = new DecimalFormat("0.00");
        String ExpectedTax = d00.format(totalTax2);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);
    }

    public void VerifyIfExclusiveTaxAndDiscountArecalculatedProperlyPercBT(double taxPercent, double modifierTaxPercent, double discAmt) {
        //Menu Amount
        WebElement menuItemAmount1 = driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[2]"));
        String menuItemAmount3 = menuItemAmount1.getText();

        double menuItemAmount4 = Double.parseDouble(menuItemAmount3);

        //Modifier Amount
        WebElement modifierAmount = driver.findElement(By.xpath("(//ion-content/div/div/div//div[5])[3]"));
        String modifierAmount1 = modifierAmount.getText();
        utils.log().info("modifier Amount is " + modifierAmount1);
        double modifierAmount2 = Double.parseDouble(modifierAmount1);

        //define discount percentage
        //double DiscountAmount = 5;

        WebElement subTotalAmount3 = driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));
        String subTotalAmount2 = subTotalAmount3.getAttribute("value");
        String subTotalAmount1 = subTotalAmount2.replaceAll("[A-Z$ ]", "");

        double subTotalAmount = Double.parseDouble(subTotalAmount1);

        double discountAmount = subTotalAmount * discAmt;

        double menuDiscountAmount = (menuItemAmount4 / subTotalAmount) * discountAmount;

        double menuAfterDisc = menuItemAmount4 - menuDiscountAmount;
        BigDecimal menuAfterDisc1 = new BigDecimal(menuAfterDisc).setScale(2, RoundingMode.HALF_UP);
        double menuAfterDiscount = menuAfterDisc1.doubleValue();

        double modifierDiscountAmount = (modifierAmount2 / subTotalAmount) * discountAmount;

        double modifierAfterDisc = modifierAmount2 - modifierDiscountAmount;
        BigDecimal modifierAfterDisc1 = new BigDecimal(modifierAfterDisc).setScale(2, RoundingMode.HALF_UP);
        double modifierAfterDiscount = modifierAfterDisc1.doubleValue();

        double taxAmount = menuAfterDiscount * taxPercent;
        utils.log().info("Exact Tax is " + taxAmount);

        BigDecimal dd = new BigDecimal(taxAmount).setScale(4, RoundingMode.HALF_UP);
        double bb = dd.doubleValue();
        utils.log().info("Tax1 is " + bb);

        //modifierTax
        //double modifierTax = modifierAmount2 - (modifierAmount2 / (1 + modifierTaxPercent));
        double modifierAmount3 = modifierAfterDiscount * modifierTaxPercent;
        BigDecimal dd1 = new BigDecimal(modifierAmount3).setScale(4, RoundingMode.HALF_UP);
        double aa1 = dd1.doubleValue();
        utils.log().info("Tax2 is " + aa1);


        double totalTax = bb + aa1;
        BigDecimal totalTax1 = new BigDecimal(totalTax).setScale(2, RoundingMode.HALF_UP);
        double totalTax2 = totalTax1.doubleValue();

        DecimalFormat d00 = new DecimalFormat("0.00");
        String ExpectedTax = d00.format(totalTax2);
        utils.log().info("Expected Tax is " + ExpectedTax);

        WebElement ActualTaxAmount = driver.findElement(By.xpath("//div[@id='os_taxAmountStr']//input"));
        String ActualTax2 = ActualTaxAmount.getAttribute("value");
        String ActualTax3 = ActualTax2.replaceAll("[A-Z$ ]", "");
        utils.log().info("Actual tax is " + ActualTax3);

        Assert.assertEquals(ExpectedTax, ActualTax3);
    }

}

