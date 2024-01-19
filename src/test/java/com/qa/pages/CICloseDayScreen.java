package com.qa.pages;

import com.qa.utils.TestUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static com.qa.utils.TestUtils.driver;
public class CICloseDayScreen extends BasePage {

    String btnOperation="//XCUIElementTypeButton[@name=\"    Operation\"]";

    String txtTotalNetSale = "(//XCUIElementTypeStaticText[@name=\"{0}\"])[1]";

    String txtGrossSale = "(//XCUIElementTypeStaticText[@name=\"{0}\"])[2]";

    String txtNewCustomer = "(//XCUIElementTypeStaticText[@name=\"{0}\"])[1]";

    String txtAllEmployees="(//XCUIElementTypeStaticText[@name=\"0\"])[2]";

    String btnCloseTheDay = "//XCUIElementTypeButton[@name=\"{0}\"]";

    String btnCloseTheDayForWait = "//XCUIElementTypeButton[@name=\"Close The Day\"]";

    String txtCashier = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]";

    String txtGoknurBati  ="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell";

    String popupBtnCancel = "(//XCUIElementTypeButton[@name=\"Cancel\"])[1]";

    String txtCreditCardPrice="(//XCUIElementTypeStaticText[@name=\"10,00\"])[8]";

//    String txtZeroOpenCashier="//XCUIElementTypeStaticText[@name=\"You have 0 Open Cashier's\"]";

    String txtZeroOpenCashier="//XCUIElementTypeStaticText[@name=\"{0}\"]";

    String btnPrint ="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]";

    String txtMenuItem="(//XCUIElementTypeTable[@name=\"Empty list\"])[4]";

    String employeeGoknur="(//XCUIElementTypeStaticText[@name=\"Goknur B\"])[2]";

    String itemXPath = "//XCUIElementTypeStaticText[@name=\"{0}\"]";

    String txtCashValue="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[14]";

    String cashPrice = "(//XCUIElementTypeStaticText[@name=\"10,00\"])[8]";

    String txtCreditCard="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[11]";

    String creditCardValue = "(//XCUIElementTypeStaticText[@name=\"0,00\"])[1]";

    String txtGiftCardValue= "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[14]";

    String giftCardPrice = "(//XCUIElementTypeStaticText[@name=\"11,00\"])[5]";

    String txtGratuityValue="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[14]";

    String gratuityPrice= "(//XCUIElementTypeStaticText[@name=\"2,50\"])[1]";

    String txtGrossReceipt="(//XCUIElementTypeStaticText[@name=\"0,00\"])[7]";

    String txtSaleRecapGrossSale="(//XCUIElementTypeStaticText[@name=\"0,00\"])[2]";

    String txtNetSales="(//XCUIElementTypeStaticText[@name=\"0,00\"])[4]";

    String netTotalValue="(//XCUIElementTypeStaticText[@name=\"35,00\"])[1]";

    String txtInitialNetSale="(//XCUIElementTypeStaticText[@name=\"0,00\"])[3]";

    String txtNetVoidValue="//XCUIElementTypeStaticText[@name=\"15,00\"]";

    String txtInitialTaxExempt="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[11]";

    String taxExemptPrice = "(//XCUIElementTypeStaticText[@name=\"0,00\"])[12]";

    String txtTaxExempt="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[10]";

    String taxExemptAftPrice="//XCUIElementTypeStaticText[@name=\"1,50\"]";

    String txtInitialGrossVoid="(//XCUIElementTypeStaticText[@name=\"0,00\"])[8]";

    String txtGrossVoidValue="(//XCUIElementTypeStaticText[@name=\"10,00\"])[3]";

    String txtInitialGrossSale="(//XCUIElementTypeStaticText[@name=\"0,00\"])[6]";

    String txtPaidInValue= "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[14]";

    String paidInPrice = "(//XCUIElementTypeStaticText[@name=\"0,00\"])[15]";

    String txtPaidOutValue= "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[15]";

    String paidOutPrice = "(//XCUIElementTypeStaticText[@name=\"0,00\"])[16]";

    String txtOverShortage= "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[19]";

    String txtOverShortageAft="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[25]";

    String overShortagePrice = "(//XCUIElementTypeStaticText[@name=\"0,00\"])[20]";

    String btnFinish="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[9]";

    String btnActiveCheck="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]";

    // String txtActiveCheck="//XCUIElementTypeStaticText[@name=\"You have 0 Active check's\"]";

    String txtActiveCheck="//XCUIElementTypeStaticText[@name=\"{0}\"]";

    String btnPopupCancel= "//XCUIElementTypeButton[@name=\"Cancel\"]";

    String txtNoActiveChecks="//XCUIElementTypeTable[@name=\"No Active Checks\"]";

    String txtZeroActiveChecks="";

    String btnDropDownXpath="(//XCUIElementTypeButton[@name=\"{0}\"])[2]";

    String textFieldPercentage="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String txtDiscount="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[26]";

    String discountPrice = "//XCUIElementTypeStaticText[@name=\"0,50\"]";

    String txtDiscountTax="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[28]";

    String totalTip = "(//XCUIElementTypeStaticText[@name=\"2,00\"])[2]";


    String txtTotalTip="//XCUIElementTypeStaticText[@name=\"TIP / GRATUITY\"]";

    String netTotal = "(//XCUIElementTypeStaticText[@name=\"0,00\"])[1]";

    String txtCashExpected= "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[18]";

    String btnPayIn="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]";

    String payByTextField="/html/body/app-root/app-opearion/ion-content/app-till-management-container/ion-app/mat-tab-group/div/mat-tab-body[5]/div/div/ion-grid/ion-row/p/span/input";

    String txtPaidIn="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[22]";

    String btnPayOut="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[4]";

    String txtPaidOut= "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[18]";

    String txtGiftCardSold="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[18]";

    String txtDateTime="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable";

    String txtAfterSaleGrossReceipt="(//XCUIElementTypeStaticText[@name=\"25,00\"])[7]";

    String txtFullCreditcard="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[19]";

    String txtAfterGiftCard="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[15]";

    String txtAfterSaleTenderGrossReceipt="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[6]";

    String txtCashRecord="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[17]";

    String txtGrandSale="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[5]";

    String txtAfterSaleCashExpected="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[26]";

    String txtAfterGrossSales="(//XCUIElementTypeStaticText[@name=\"27,50\"])[1]";

    String txtAfterSaleRecapGrossSales= "(//XCUIElementTypeStaticText[@name=\"26,50\"])[2]";

    String txtCoverCount="(//XCUIElementTypeStaticText[@name=\"0\"])[2]";

    String txtNameTextField="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]";

    String btnAdd="(//XCUIElementTypeButton[@name=\"Add\"])[1]";

    String txtNumberTextField="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[5]";

    String btnSave1 = "//XCUIElementTypeStaticText[@name=\"Save\"]";

//    String btnSave2 = "//XCUIElementTypeStaticText[@name=\"Save\"]";

    String btnSave2 = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeButton[@name=\"Save\"]";

    String txtInitialTaxAmount="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[11]";

    String Cancel = "//XCUIElementTypeButton[@name=\"Cancel\"]";

    String commontxtXPathVal="//XCUIElementTypeStaticText[@name=\"{0}\"]";

    String commontxtXPathVal2="(//XCUIElementTypeStaticText[@name=\"{0}\"])[3]";

    String commontxtXPathVal3="(//XCUIElementTypeStaticText[@name=\"{0}\"])[6]";

    String initialTaxAmountVal="(//XCUIElementTypeStaticText[@name=\"0,00\"])[11]";

    String grossReceiptAftVal="(//XCUIElementTypeStaticText[@name=\"120,00\"])[4]";

    String grossReceiptAftValue="(//XCUIElementTypeStaticText[@name=\"45,00\"])[4]";

    String giftCardSoldAftVal="(//XCUIElementTypeStaticText[@name=\"100,00\"])[6]";

    String cashExpBfVal="(//XCUIElementTypeStaticText[@name=\"0,00\"])[19]";

    String cashRecordPPVal="(//XCUIElementTypeStaticText[@name=\"10,00\"])[2]";

    String commonBtnLogOff = "//XCUIElementTypeStaticText[@name=\"{0}\"]";

//    @iOSXCUITFindBy (xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
////@iOSXCUITFindBy (id = "ID")
//    private WebElement eMailTxtFld;

    //String passEmailID="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField";

    String passEmailID="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[7]";

    String floor="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText";

    String btnTextXPath = "//XCUIElementTypeStaticText[@name=\"{0}\"]";

    public void clickRight(String id,String floorNumber,String msg) {
        try {
//            WebElement element = mergeAndFindElement(floor, "", TestUtils.XPath);
//            String value = elementGetText(element, "Get Floor Number");
            String value=findAndGetText(floor, "", TestUtils.XPath);
            boolean isValid = value.equals(floorNumber);

            if (value.equals(floorNumber)) {
//                WebElement elementID = mergeAndFindElement(id, "", TestUtils.Accessibility);
//                elementClick(elementID, msg);
                findandclick(id, "", TestUtils.Accessibility);
            }
        }catch(Exception e){

        }

    }

    public void clickBtnOperation(String msg) {
//        WebElement element = mergeAndFindElement(btnOperation, "", TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(btnOperation, "", TestUtils.XPath);
    }

    public void clickBtnOperation() {

        WebElement element = driver.findElement(By.xpath("//button[@title='Operation']"));
        elementClick(element,"Selected Operation");

    }



    public String commonAccessibilityIdReturn(String id,String msg){
//        WebElement element = mergeAndFindElement(id, "", TestUtils.Accessibility);
//        String txtTotal = getText(element, msg);
        return findAndGetText(id, "", TestUtils.Accessibility);
    }

//    public void commonAccessibilityIdTryCatch(String id,String msg){
//        try{
//        WebElement element=(WebElement) driver.findElementsById(id);
//        elementClick(element,msg);
//        }
//        catch(Exception e){
//
//        }
//    }



    public void commonAccessibilityId(String id,String msg){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(id, "", TestUtils.Accessibility);
//        elementClick(element,msg);
        findandclick(id, "", TestUtils.Accessibility);
    }

    public void btnCustomerProfileClose(String id,String msg){

//            WebElement element = mergeAndFindElement(id, "", TestUtils.Accessibility);
//            elementClick(element, msg);
        driver.findElement(By.xpath("//linga-icon[@symbol='closeButton']")).click();

    }
//    public void commonAccessibilityId(String id,String msg){
//        WebElement element = mergeAndFindElement(id, "", TestUtils.Accessibility);
//        elementClick(element,msg);
//    }

    public void getTxtTotalNetSale(String Total, String msg) throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("(//ion-col[@class='satatusDetail-div-label md hydrated'])[1]//div[2]"));
        Assert.assertEquals(element.getText(),Total);
        utils.log().info("Displayed - "+Total+" "+msg);
    }

    public void getTxtGrossSale(String grossSaleAmt, String msg) {
        WebElement element = driver.findElement(By.xpath("(//ion-col[@class='satatusDetail-div-label md hydrated'])[2]//div[2]"));
        Assert.assertEquals(element.getText(),grossSaleAmt);

        utils.log().info("Displayed - "+grossSaleAmt+" "+msg);
    }

    public void getTxtGrossSale1(String grossSaleAmt, String msg) {
        WebElement element = driver.findElement(By.xpath("(//ion-item)[2]//ion-label[2]"));
        Assert.assertEquals(element.getText(),grossSaleAmt);

        utils.log().info("Displayed - "+grossSaleAmt+" "+msg);
    }



    public void getTxtNewCustomer(String newCustomer, String msg) {
        WebElement element = driver.findElement(By.xpath("(//ion-col[@class='satatusDetail-div-label md hydrated'])[3]//div[2]"));
        Assert.assertEquals(element.getText(),newCustomer);

        utils.log().info("Displayed - "+newCustomer+" "+msg);
    }

    public void getTxtAllEmployees(String employee, String msg) {
        WebElement element = driver.findElement(By.xpath("(//ion-col[@class='satatusDetail-div-label md hydrated'])[4]//div[2]"));
        Assert.assertEquals(element.getText(),employee);

        utils.log().info("Displayed - "+employee+" "+msg);
    }

    public void btnCloseTheDay(String name, String msg) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(btnCloseTheDayForWait))));
//        WebElement elementchkClose = mergeAndFindElement(btnCloseTheDay, name, TestUtils.XPath);
//        click(elementchkClose, msg);
        findandclick(btnCloseTheDay, name, TestUtils.XPath);
    }

    public void closeTheDayBtn() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//button[.=' Close The Day ']"));
        elementClick(element,"Selected - "+ "Close The Day");

    }

    public void clickTxtCashier(String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement elementCashier = driver.findElement(By.xpath("//ion-label[contains(.,'You Have 1 open cashier(s) ')]"));
        elementClick(elementCashier, msg);

    }

    public void clickTxtGoknur(String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement elementChr = driver.findElement(By.xpath("//ion-label[.=' Admin user']"));
        click(elementChr, msg);
//        findandclick(txtGoknurBati, "", TestUtils.XPath);
    }

    public void shouldNotSeeOpenCashierPopup(){
        WebElement elementChrOut = driver.findElement(By.xpath("//ion-label[contains(.,'You Have 0 open cashier(s) ')]"));
       Assert.assertEquals(elementChrOut.getText(),"You Have 0 open cashier(s)");
       utils.log().info("Displayed - "+"You Have 0 open cashier(s)");
    }

    public void clickBtnCashier(String btnChrOut,String msg) {
        WebElement elementChrOut = driver.findElement(By.xpath("//span[.=' "+btnChrOut+" ']"));
        click(elementChrOut, msg);
//        findandclick(btnCloseTheDay, btnChrOut, TestUtils.XPath);
    }

    public void clickPopupBtnCancel(String msg) {
//        WebElement elementCancel = mergeAndFindElement(popupBtnCancel, "", TestUtils.XPath);
//        click(elementCancel, msg);
        findandclick(popupBtnCancel, "", TestUtils.XPath);
    }

    public String getZeroOpenCashier(String btnZeroCashier,String msg) throws InterruptedException {
        Thread.sleep(5000);
//        WebElement element = mergeAndFindElement(txtZeroOpenCashier, btnZeroCashier, TestUtils.XPath);
//        String txtZeroCashier = getText(element, msg);
//        return txtZeroCashier;
        return findAndGetText(txtZeroOpenCashier, btnZeroCashier, TestUtils.XPath);
    }

    public void clickGenerateBtn(){
        WebElement elementChrOut = driver.findElement(By.xpath("//span[.=' Generate ']"));
        Assert.assertEquals(elementChrOut.getText(),"Generate");
        elementChrOut.click();
        utils.log().info("Displayed - "+"Genaerate");
    }

    public void clickBtnPrint(String msg) {
        WebElement elementPrint = driver.findElement(By.xpath("//span[.=' PRINT ']"));
        elementClick(elementPrint, msg);

    }

    public void getTxtCustomer(String txtXpath, String msg) {
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' "+txtXpath+"']"));
Assert.assertEquals(element.getText(),txtXpath);
        utils.log().info("Displayed - "+txtXpath);
    }

    public void clickTxtMenuItem(String msg) {
        WebElement elementCancel = mergeAndFindElement(txtMenuItem, "", TestUtils.XPath);
        elementClick(elementCancel, msg);
//        findandclick(txtMenuItem, "", TestUtils.XPath);
    }

    public void clickGoknur(String msg) {
//        WebElement element = mergeAndFindElement(employeeGoknur, "", TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(employeeGoknur, "", TestUtils.XPath);
    }

    public void commonGetText(String Text, String msg) throws InterruptedException {
        Thread.sleep(2500);
        WebElement elementQty = driver.findElement(By.xpath("(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'"+msg+"')])[1]/../span"));
        String value=elementQty.getText();
        String value1=elementQty.getAttribute("value");
        Assert.assertEquals(value,Text);
        utils.log().info("Displayed  - "+Text);
    }

    public void getCashValue(String cashVal) throws Exception {
        WebElement element = driver.findElement(By.xpath("//ion-label[.=' Cash']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),cashVal);
        utils.log().info("Displayed - "+cashVal);
    }

    public void getTxtCreditCard(String creditCard) {
        WebElement element = driver.findElement(By.xpath("(//ion-item)[9]//ion-label[2]"));
        Assert.assertEquals(element.getText(),creditCard);
        utils.log().info("Displayed - "+creditCard);
    }

    public void getGiftCardValue(String GiftCardAft) {
//        WebElement element = mergeAndFindElement(txtGiftCardValue, "", TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement giftCardValue = mergeAndFindElement(GiftCardAft, "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement(giftCardPrice, "", TestUtils.XPath);

        if (giftCardValue.isDisplayed()) {
            String data = giftCardValue.getText();
            String money = price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getGratuityValue(String gratuityVal) {
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' TIP / GRATUITY']/..//div//ion-item//ion-label[(.=' Gratuity')]/..//ion-label[@slot='end']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),gratuityVal);
        utils.log().info("Displayed - "+gratuityVal);
    }

    public void getGrossRceipt(String value, String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("(//ion-item)[6]//ion-label[2]"));
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value+" "+msg);
    }

    public void getGrossSales(String value,String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("(//ion-item)[6]//ion-label[2]"));
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value+" "+msg);
    }

    public String getNetSales(String msg) {
//        WebElement elementSale = mergeAndFindElement(txtNetSales, "", TestUtils.XPath);
//        String Sale = getText(elementSale, msg);
//        return Sale;
        return findAndGetText(txtNetSales, "", TestUtils.XPath);
    }

    public void getNetSaleValue(String value,String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' SALES']/..//div//ion-item//ion-label[(.=' Net Sales')]/..//ion-label[@slot='end']"));
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value+" "+msg);
    }

    public void getTxtNetSale(String value,String msg) throws InterruptedException {
        Thread.sleep(2000);
    WebElement element = driver.findElement(By.xpath("//ion-title[.=' SALES']/..//div//ion-item//ion-label[(.=' Net Sales')]/..//ion-label[@slot='end']"));
    Assert.assertEquals(element.getText(),value);
    utils.log().info("Displayed - "+value+" "+msg);
    }

    public void getNetVoidValue(String value,String msg) {
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' SALES']/..//div//ion-item//ion-label[(.=' Net Void')]/..//ion-label[@slot='end']"));
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value+" "+msg);
    }

    public void getInitialTaxExemptValue(String initalTaxExp) {
//        WebElement element = mergeAndFindElement(txtInitialTaxExempt, "", TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement taxExemptValue = mergeAndFindElement(initalTaxExp, "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement(taxExemptPrice, "", TestUtils.XPath);

        if (taxExemptValue.isDisplayed()) {
            String data = taxExemptValue.getText();
            String money = price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getTaxExcemptValue(String initialTaxExempt) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' TAXES']/..//div//ion-item//ion-label[(.=' Tax Exempt')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),initialTaxExempt);
        utils.log().info("Displayed - "+initialTaxExempt);
    }

    public void getInitialGrossVoid(String value,String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' SALES']/..//div//ion-item//ion-label[(.=' Gross Void')]/..//ion-label[@slot='end']"));
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value+" "+msg);
    }

    public void getGrossVoidValue(String value,String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' SALES']/..//div//ion-item//ion-label[(.=' Gross Void')]/..//ion-label[@slot='end']"));
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value+" "+msg);
    }

    public void getInitialGrossSale(String value, String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' SALES']/..//div//ion-item//ion-label[(.=' Gross Sales')]/..//ion-label[@slot='end']"));
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value+" "+msg);
    }

    public void getInitialGrandSale(String value, String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("(//ion-item)[5]//ion-label[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value+" "+msg);
    }

    public void getPaidInAmountValue(String value) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' SUMMARY']/..//div//ion-item//ion-label[(.=' Paid In')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value);
    }

    public void getPaidOutValue(String value) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' SUMMARY']/..//div//ion-item//ion-label[(.=' Paid Out')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value);
    }

    public void verifyEmployee(String employee) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-grid[@class='closeday_detailgrid md hydrated']//button[.=' "+employee+" ']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),employee);
        utils.log().info("Displayed - "+employee);
    }
    public void getOverShortageValue(String overShortageInitialVal) {
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' SUMMARY']/..//div//ion-item//ion-label[(.=' Over / Shortage')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),overShortageInitialVal);
        utils.log().info("Displayed - "+overShortageInitialVal);
    }

    public void clickBtnFinish(String msg) {
//        WebElement element = mergeAndFindElement(btnFinish, "",TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnFinish, "",TestUtils.XPath);
    }

    public void getBtnActiveCheck(String msg) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-label[contains(.,'You Have 1 active check(s) ')]"));
        elementClick(element, msg);

//        findandclick(btnActiveCheck, "",TestUtils.XPath);
    }

    public void getTxtActiveCheck(String txtZeroActiveCheck,String msg) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(7000);
        WebElement element = driver.findElement(By.xpath("//ion-label[contains(.,'You Have 0 active check(s) ')]"));
        Assert.assertEquals(element.getText(),"You Have 0 active check(s)");
        utils.log().info("Displayed - 0");


    }

    public void clickbtnPopupCancel(String msg) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(By.xpath("//button[.=' Cancel ']"));
        elementClick(element, msg);
//        findandclick(btnPopupCancel, "",TestUtils.XPath);
    }

    public void getTxtNoActiveChecks(String msg1,String msg) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("(//div[@class='check-stats-check']//div[.=' "+msg1+" '])[2]"));
        Assert.assertEquals(element.getText(),msg1);
        utils.log().info("Displayed - "+element.getText());
    }

    public void clickBtnDropDown(String btnDropDown,String msg) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(btnDropDownXpath, btnDropDown,TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnDropDownXpath, btnDropDown,TestUtils.XPath);
    }

    public void clickTextFieldPercentage(String msg){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(textFieldPercentage, "",TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(textFieldPercentage, "",TestUtils.XPath);
    }

    public void getDiscountValue(String Discount) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtDiscount, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement cash = mergeAndFindElement(Discount, "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement(discountPrice, "", TestUtils.XPath);

        if (cash.isDisplayed()) {
            String data = cash.getText();
            String money = price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getDiscountTaxValue(String discountTax) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtDiscountTax, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement cash = mergeAndFindElement(discountTax, "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement(discountPrice, "", TestUtils.XPath);

        if (cash.isDisplayed()) {
            String data = cash.getText();
            String money = price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getTotalTipValue(String txtTotal) {
//        WebElement element = mergeAndFindElement(txtCashExpected, "",TestUtils.XPath);

//        String id = "SUMMARY";
//        iOSScrollToElementUsingMobileScrollParent(element,id);
        //iOSScrollToElementUsingMobileScroll(element);
//        WebElement parent = (WebElement)driver.findElement(By.className("XCUIElementTypeTable"));
//        String parentID = parent.getId();
//        HashMap<String, String> scrollObject = new HashMap<String, String>();
//        scrollObject.put("element", parentID);
//        //scrollObject.put("predicateString", "label == 'SUMMARY'");
//        driver.executeScript("mobile:scroll", scrollObject);  // scroll to the
//        WebElement element1 = mergeAndFindElement(txtTotalTip, "",TestUtils.XPath);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement cash = mergeAndFindElement(txtTotal, "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement(totalTip, "", TestUtils.XPath);

        if (cash.isDisplayed()) {
            String data = cash.getText();
            String money = price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public String getNetTotal() {
//        WebElement elm = mergeAndFindElement(netTotal, "", TestUtils.XPath);
//        String Total = getText(elm, "verify netTotal");
//        return Total;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return findAndGetText(netTotal, "", TestUtils.XPath);
    }

    public void getCashExpectedValue(String value) {
        WebElement element = driver.findElement(By.xpath("(//ion-item)[18]//ion-label[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value);
    }

    public void clickBtnPayIn() throws InterruptedException {

        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//p[.='Pay In']"));
        elementClick(element,"Pay out clicked");
//        findandclick(btnPayIn,"", TestUtils.XPath);
    }

    public void clickPayByTextField(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-opearion/ion-content/app-till-management-container/ion-app/mat-tab-group/div/mat-tab-body[5]/div/div/ion-grid/ion-row/p/span/input"));
        elementClick(element, "Pay in Text Field clicked");
//        findandclick(payByTextField,"", TestUtils.XPath);
    }

    public void clickPayByTextField1(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-opearion/ion-content/app-till-management-container/ion-app/mat-tab-group/div/mat-tab-body[4]/div/div/ion-grid/ion-row/p/span/input"));
        elementClick(element, "Pay in Text Field clicked");
//        findandclick(payByTextField,"", TestUtils.XPath);
    }

    public void passNameBy1(String txtName){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-opearion/ion-content/app-till-management-container/ion-app/mat-tab-group/div/mat-tab-body[4]/div/div/ion-grid/ion-row/p/span/input"));
        element.sendKeys(txtName);
//        findandclick_Skeys(payByTextField,"", TestUtils.XPath,"SKeys",txtName);
    }
    public void passNameBy(String txtName){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(By.xpath(payByTextField));
        element.sendKeys(txtName);
//        findandclick_Skeys(payByTextField,"", TestUtils.XPath,"SKeys",txtName);
    }

    public void getPaidInValue(String aftPaidIn,String aftPaidInVal) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtPaidIn, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement PaidIn = mergeAndFindElement(aftPaidIn, "", TestUtils.Accessibility);
        WebElement PaidInPrice = mergeAndFindElement(commontxtXPathVal, aftPaidInVal, TestUtils.XPath);

        if (PaidIn.isDisplayed()) {
            String data = PaidIn.getText();
            String money = PaidInPrice.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void clickBtnPayOut() throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//p[.='Pay Out']"));
        elementClick(element,"Pay out clicked");

    }

    public void getAftPaidOutValue(String paidOutAft,String paidOutVal) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtPaidIn, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement PaidOut = mergeAndFindElement(paidOutAft, "", TestUtils.Accessibility);
        WebElement PaidOutPrice = mergeAndFindElement(commontxtXPathVal, paidOutVal, TestUtils.XPath);

        if (PaidOut.isDisplayed()) {
            String data = PaidOut.getText();
            String money = PaidOutPrice.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getGiftCardSoldValue(String giftCardSoldAft) {
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' NONSALE REVENUE']/..//div//ion-item//ion-label[(.=' Gift Card Sold')]/..//ion-label[@slot='end']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),giftCardSoldAft);
        utils.log().info("Displayed - "+giftCardSoldAft);
    }

    public void isDateTimeDisplayed(){
        WebElement element = driver.findElement(By.xpath("//ion-list[1]//p[1]"));
       String[] date1 =element.getText().split(" ");
       utils.log().info(date1[0]);
        utils.log().info(date1[1]);
        utils.log().info(date1[2]);
        utils.log().info(date1[3]);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String strDate= formatter.format(date);
        utils.log().info(strDate);
        Assert.assertEquals(strDate,date1[2]);
    }

    public String getFullGrossReceipt(){
//        WebElement element = mergeAndFindElement(txtAfterSaleGrossReceipt, "",TestUtils.XPath);
//        String value= elementGetText(element,"Gross Receipt verify");
//        return value;
        return findAndGetText(txtAfterSaleGrossReceipt, "",TestUtils.XPath);
    }

    public void getCreditCardValue(String creditCardPP,String creditCardPPVal) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtFullCreditcard, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement creditCard = mergeAndFindElement(creditCardPP, "", TestUtils.Accessibility);
        WebElement Price = mergeAndFindElement(commontxtXPathVal2,creditCardPPVal, TestUtils.XPath);

        if (creditCard.isDisplayed()) {
            String data = creditCard.getText();
            String money = Price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getAfterGiftCardValue(String giftCardPP,String giftCardPPVal) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtAfterGiftCard, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement giftCard = mergeAndFindElement(giftCardPP, "", TestUtils.Accessibility);
        WebElement Price = mergeAndFindElement(commontxtXPathVal,giftCardPPVal, TestUtils.XPath);

        if (giftCard.isDisplayed()) {
            String data = giftCard.getText();
            String money = Price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void scroll(String id,String msg) throws InterruptedException {

        listScroller(id,390, 756, 390, 424, 5000);
        utils.log().info(msg);

    }

    public void scroll2(String id,String msg) throws InterruptedException {
        listScroller(id,636,343,636,175,5000);
        utils.log().info(msg);

    }
//public void scroll(String num,String msg) throws InterruptedException {
//    JavascriptExecutor js;
//    HashMap<String, String> scrollObject = new HashMap<>();
//
//     iosScrollToAnElement(WebElement, el) {
//        scrollObject.put("direction", "down");
//        scrollObject.put("element", el.getId());
//        js.executeScript("mobile: swipe", scrollObject);
//    }
//
//}

    public void commGetValue(String grossReceiptAft) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtAfterSaleTenderGrossReceipt, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement grossReceipt = mergeAndFindElement(grossReceiptAft, "", TestUtils.Accessibility);
        WebElement Price = mergeAndFindElement(grossReceiptAftValue, "", TestUtils.XPath);

        if (grossReceipt.isDisplayed()) {
            String data = grossReceipt.getText();
            String money = Price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getCashRecordValue(String cashRecordPP) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtCashRecord, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement cashRecord = mergeAndFindElement(cashRecordPP, "", TestUtils.Accessibility);
        WebElement Price = mergeAndFindElement(cashRecordPPVal, "", TestUtils.XPath);

        if (cashRecord.isDisplayed()) {
            String data = cashRecord.getText();
            String money = Price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getGrandSaleValue(String grandSaleAft,String grandSaleAftVal) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtGrandSale, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement grandSale = mergeAndFindElement(grandSaleAft, "", TestUtils.Accessibility);
        WebElement Price = mergeAndFindElement(commontxtXPathVal3,grandSaleAftVal,  TestUtils.XPath);

        if (grandSale.isDisplayed()) {
            String data = grandSale.getText();
            String money = Price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getGrandSaleValue1(String grandSalePP,String grandSalePPVal) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtGrandSale, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement grandSale = mergeAndFindElement(grandSalePP, "", TestUtils.Accessibility);
        WebElement Price = mergeAndFindElement(commontxtXPathVal3,grandSalePPVal, TestUtils.XPath);

        if (grandSale.isDisplayed()) {
            String data = grandSale.getText();
            String money = Price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getAfterSaleCashExpected(String cashExpPaidOut,String cashExpAft) {
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' SUMMARY']/..//div//ion-item//ion-label[(.=' Cash Expected')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),cashExpPaidOut);
        utils.log().info("Displayed - "+cashExpPaidOut);

        WebElement element1 = driver.findElement(By.xpath("//ion-title[.=' SUMMARY']/..//div//ion-item//ion-label[(.=' Cash Expected')]/..//ion-label[@slot='end']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        Assert.assertEquals(element1.getText(),cashExpAft);
        utils.log().info("Displayed - "+cashExpAft+" "+cashExpPaidOut);
    }

    public String getTxtAfterGrossSale(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtAfterGrossSales, "", TestUtils.XPath);
//        String value = getText(element,"verify gross sale");
//        return value;
        return findAndGetText(txtAfterGrossSales, "", TestUtils.XPath);
    }

    public void getTxtAfterSaleRecapGrossSale(String grossSale) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' SALES']/..//div//ion-item//ion-label[(.=' Gross Sales')]/..//ion-label[@slot='end']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),grossSale);
        utils.log().info("Displayed - "+grossSale);
    }

    public void getTxtCoverCount(String txtCoverCount){
        WebElement element = driver.findElement(By.xpath("(//ion-item)[1]//ion-label[2]"));
        Assert.assertEquals(element.getText(),txtCoverCount);

        utils.log().info("Displayed - "+txtCoverCount);
    }

    public void clickNameTextField(String msg){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtNameTextField,"", TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(txtNameTextField,"", TestUtils.XPath);
    }

    public void passName(String name) {
        WebElement element = mergeAndFindElement(txtNameTextField,"", TestUtils.XPath);
        element.sendKeys(name+ "- "+ new TestUtils().dateTime());
    }

    public void clickAdd(String msg) {
        WebElement element = mergeAndFindElement(btnAdd,"", TestUtils.XPath);
        elementClick(element, msg);

    }

    public void passNumber(String number) {
        WebElement element = driver.findElement(By.xpath("//input[contains(@class,'quantity_grid-inputrow')]"));
        element.sendKeys(new TestUtils().dateTime()+ " - "+number );
//        findandclick_Skeys(txtNumberTextField,"", TestUtils.XPath,"SKeys",new TestUtils().dateTime()+ " - "+number);
    }
    public void passEmail(String number) {
        WebElement element = driver.findElement(By.xpath("//input[@data-placeholder='Email ID']"));
        element.sendKeys(new TestUtils().dateTime(),number );
    }


    public void clickSave1(String msg) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(btnSave1,"", TestUtils.XPath);
//        elementClick(element, msg);
        driver.findElement(By.xpath("//span[contains(.,' Continue ')]")).click();
    }

    public void clickSave2(String msg) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(btnSave2,"", TestUtils.XPath);
//        elementClick(element, msg);
        try {
//            findandclick(btnSave2, "", TestUtils.XPath);
//            findandclickM(By.id("Back"));
//            WebElement element = mergeAndFindMobileElement(btnSave2);
//            WebElement element=mergeAndFindMobileElement(btnSave2);
//            elementClick(element, msg);
            WebElement element = mergeAndFindElement(btnSave2,"", TestUtils.XPath);
             elementClick(element, msg);
        }
        catch(Exception e) {
            findandclickM(By.id("CustomerProfile Close"));
            findandclickM(By.id("Yes"));
        }
    }

    public void getInitialTaxAmountValue(String initialTaxAmt) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtInitialTaxAmount, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement taxAmount = mergeAndFindElement(initialTaxAmt,"",TestUtils.Accessibility);
        WebElement Price = mergeAndFindElement(initialTaxAmountVal,"",TestUtils.XPath);

        if (taxAmount.isDisplayed()) {
            String data=taxAmount.getText();
            String money = Price.getText();
            utils.log().info(data +" - "+ money);
        } else {
            utils.log().info("not shown");
        }
    }

    public void getCreditCard(String creditCardVal) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement element = mergeAndFindElement(txtCreditCard, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement creditCardValue = mergeAndFindElement(creditCardVal,"",TestUtils.Accessibility);
        WebElement creditCardPrice = mergeAndFindElement(txtCreditCardPrice,"",TestUtils.XPath);

        if (creditCardValue.isDisplayed()) {
            String data=creditCardValue.getText();
            String money = creditCardPrice.getText();
            utils.log().info(data +" - "+ money);
        } else {
            utils.log().info("not shown");
        }
    }

    public void getTaxAmountValue(String tenPercentTax,String twentyPercentTax) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' TAXES']/..//div//ion-item//ion-label[(.=' Twenty percent tax')]/..//ion-label[@slot='end']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),twentyPercentTax);
        utils.log().info("Displayed - "+twentyPercentTax);

        WebElement element1 = driver.findElement(By.xpath("//ion-title[.=' TAXES']/..//div//ion-item//ion-label[(.=' Ten percent tax')]/..//ion-label[@slot='end']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        Assert.assertEquals(element1.getText(),tenPercentTax);
        utils.log().info("Displayed - "+tenPercentTax);
    }

    public void getOverShortage(String overShortageVal,String txtOverShortageVal) throws Exception {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-label[.=' "+overShortageVal+"']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),overShortageVal);
        utils.log().info("Displayed - "+overShortageVal);

        WebElement element1 = driver.findElement(By.xpath("(//ion-item)[27]//ion-label[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        Assert.assertEquals(element1.getText(),txtOverShortageVal);
                utils.log().info("Displayed - "+txtOverShortageVal);
    }

    public void verifyCrediCardOption(String value,String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' PAYMENT SUMMARY']/..//div//ion-item//ion-label[(.=' Credit Card')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value+" "+msg);
    }

    public void verifyPaidOutValue(String value,String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' SUMMARY']/..//div//ion-item//ion-label[(.=' Paid Out')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),msg);
        utils.log().info("Displayed - "+value+" "+msg);

        WebElement element1 = driver.findElement(By.xpath("//ion-title[.=' SUMMARY']/..//div//ion-item//ion-label[(.=' Paid Out')]/..//ion-label[@slot='end']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        Assert.assertEquals(element1.getText(),value);
        utils.log().info("Displayed - "+value+" "+msg);
    }

    public void verifyPaidInValue(String value,String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//ion-title[.=' SUMMARY']/..//div//ion-item//ion-label[(.=' Paid In')]/..//ion-label[@slot='end']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value+" "+msg);
    }


    public void verifyCrediCardOption1(String value,String msg){
        WebElement element = driver.findElement(By.xpath("(//ion-item)[18]//ion-label[1]"));
        Assert.assertEquals(element.getText(),value);
        utils.log().info("Displayed - "+value+" "+msg);
    }

    public void clickBtnCancel(String msg) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement elementCancel = driver.findElement(By.xpath("//span[.=' Cancel ']"));
        click(elementCancel, msg);
//        findandclick(Cancel, "", TestUtils.XPath);
    }

    public void VerifycommonBtnLogoff(String btnLogOff){
        WebElement element = mergeAndFindElement(commonBtnLogOff, btnLogOff, TestUtils.XPath);
    }

    public void clickThe86ListButton() throws InterruptedException {
        WebElement elementCancel = driver.findElement(By.xpath("//button[.='86 List']"));
        click(elementCancel, "Selected - 86 List");
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//label[.='86 List']")).getText(),"86 List");
    }

}
