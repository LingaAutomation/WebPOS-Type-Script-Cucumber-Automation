package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    String payByTextField="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField";

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
            findandclick(id, "", TestUtils.Accessibility);

    }
//    public void commonAccessibilityId(String id,String msg){
//        WebElement element = mergeAndFindElement(id, "", TestUtils.Accessibility);
//        elementClick(element,msg);
//    }

    public String getTxtTotalNetSale(String Total, String msg) {
//        WebElement element = mergeAndFindElement(txtTotalNetSale, Total, TestUtils.XPath);
//        String txtTotal = getText(element, msg);
//        return txtTotal;
        return findAndGetText(txtTotalNetSale, Total, TestUtils.XPath);
    }

    public String getTxtGrossSale(String grossSaleAmt, String msg) {
//        WebElement elementSale = mergeAndFindElement(txtGrossSale, grossSaleAmt, TestUtils.XPath);
//        String txtSale = getText(elementSale, msg);
//        return txtSale;
        return findAndGetText(txtGrossSale, grossSaleAmt, TestUtils.XPath);
    }

    public String getTxtNewCustomer(String newCustomer, String msg) {
//        WebElement elementCust = mergeAndFindElement(txtNewCustomer, newCustomer, TestUtils.XPath);
//        String txtCustomer = getText(elementCust, msg);
//        return txtCustomer;
        return findAndGetText(txtNewCustomer, newCustomer, TestUtils.XPath);
    }

    public String getTxtAllEmployees(String msg) {
//        WebElement element = mergeAndFindElement(txtAllEmployees, "", TestUtils.XPath);
//        String txtEmployees = getText(element, msg);
//        return txtEmployees;
        return findAndGetText(txtAllEmployees, "", TestUtils.XPath);
    }

    public void btnCloseTheDay(String name, String msg) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(btnCloseTheDayForWait))));
//        WebElement elementchkClose = mergeAndFindElement(btnCloseTheDay, name, TestUtils.XPath);
//        click(elementchkClose, msg);
        findandclick(btnCloseTheDay, name, TestUtils.XPath);
    }

    public void clickTxtCashier(String msg) {
//        WebElement elementCashier = mergeAndFindElement(txtCashier, "", TestUtils.XPath);
//        click(elementCashier, msg);
        findandclick(txtCashier, "", TestUtils.XPath);
    }

    public void clickTxtGoknur(String msg) {
//        WebElement elementChr = mergeAndFindElement(txtGoknurBati, "", TestUtils.XPath);
//        click(elementChr, msg);
        findandclick(txtGoknurBati, "", TestUtils.XPath);
    }

    public void clickBtnCashier(String btnChrOut,String msg) {
//        WebElement elementChrOut = mergeAndFindElement(btnCloseTheDay, btnChrOut, TestUtils.XPath);
//        click(elementChrOut, msg);
        findandclick(btnCloseTheDay, btnChrOut, TestUtils.XPath);
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

    public void clickBtnPrint(String msg) {
//        WebElement elementPrint = mergeAndFindElement(btnPrint, "", TestUtils.XPath);
//        elementClick(elementPrint, msg);
        findandclick(btnPrint, "", TestUtils.XPath);
    }

    public String getTxtCustomer(String txtXpath, String msg) {
//        WebElement element = mergeAndFindElement(txtNewCustomer, txtXpath, TestUtils.XPath);
//        String txtSaleReport = getText(element, msg);
//        return txtSaleReport;
        return findAndGetText(txtNewCustomer, txtXpath, TestUtils.XPath);
    }

    public void clickTxtMenuItem(String msg) {
//        WebElement elementCancel = mergeAndFindElement(txtMenuItem, "", TestUtils.XPath);
//        elementClick(elementCancel, msg);
        findandclick(txtMenuItem, "", TestUtils.XPath);
    }

    public void clickGoknur(String msg) {
//        WebElement element = mergeAndFindElement(employeeGoknur, "", TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(employeeGoknur, "", TestUtils.XPath);
    }

    public String commonGetText(String Text, String msg) {
//        String text="Text";
//        try {
//            WebElement element = mergeAndFindElement(itemXPath, Text, TestUtils.XPath);
//            text = getText(element, msg);
//
//        }catch(Exception ex){
//
//        }
//        return text;
        return findAndGetText(itemXPath, Text, TestUtils.XPath);
    }

    public void getCashValue(String cashVal) throws Exception {
//        iOSScrollToElementUsingMobileScroll(txtCashValue);
        WebElement cashValue = mergeAndFindElement(cashVal, "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement(cashPrice, "", TestUtils.XPath);

        if (cashValue.isDisplayed()) {
            String data = cashValue.getText();
            String money = price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getTxtCreditCard(String creditCard) {
//        WebElement element = mergeAndFindElement(txtCreditCard, "", TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement credit = mergeAndFindElement(creditCard, "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement(creditCardValue, "", TestUtils.XPath);

        if (credit.isDisplayed()) {
            String data = credit.getText();
            String money = price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
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
//        WebElement element = mergeAndFindElement(txtGratuityValue, "", TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement gratuity = mergeAndFindElement(gratuityVal, "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement(gratuityPrice, "", TestUtils.XPath);

        if (gratuity.isDisplayed()) {
            String data = gratuity.getText();
            String money = price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public String getGrossRceipt(String msg) {
//        WebElement elementSale = mergeAndFindElement(txtGrossReceipt, "", TestUtils.XPath);
//        String Receipt = getText(elementSale, msg);
//        return Receipt;
        return findAndGetText(txtGrossReceipt, "", TestUtils.XPath);
    }

    public String getGrossSales(String msg) {
//        WebElement elementSale = mergeAndFindElement(txtSaleRecapGrossSale, "", TestUtils.XPath);
//        String Sale = getText(elementSale, msg);
//        return Sale;
        return findAndGetText(txtGrossReceipt, "", TestUtils.XPath);
    }

    public String getNetSales(String msg) {
//        WebElement elementSale = mergeAndFindElement(txtNetSales, "", TestUtils.XPath);
//        String Sale = getText(elementSale, msg);
//        return Sale;
        return findAndGetText(txtNetSales, "", TestUtils.XPath);
    }

    public String getNetSaleValue(String msg) {
//        WebElement elementSale = mergeAndFindElement(netTotalValue, "", TestUtils.XPath);
//        String netValue = getText(elementSale, msg);
//        return netValue;
        return findAndGetText(netTotalValue, "", TestUtils.XPath);
    }

    public String getTxtNetSale(String msg) {
//        WebElement elementSale = mergeAndFindElement(txtInitialNetSale, "", TestUtils.XPath);
//        String txtNetSale = getText(elementSale, msg);
//        return txtNetSale;
        return findAndGetText(txtInitialNetSale, "", TestUtils.XPath);
    }

    public String getNetVoidValue(String msg) {
//        WebElement elementSale = mergeAndFindElement(txtNetVoidValue, "", TestUtils.XPath);
//        String NetVoidValue = getText(elementSale, msg);
//        return NetVoidValue;
        return findAndGetText(txtNetVoidValue, "", TestUtils.XPath);
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

    public void getTaxExcemptValue(String initialTaxExempt) {
//        WebElement element = mergeAndFindElement(txtTaxExempt, "", TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement taxExcempt = mergeAndFindElement(initialTaxExempt, "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement(taxExemptAftPrice, "", TestUtils.XPath);

        if (taxExcempt.isDisplayed()) {
            String data = taxExcempt.getText();
            String money = price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public String getInitialGrossVoid(String msg) {
//        WebElement element = mergeAndFindElement(txtInitialGrossVoid, "", TestUtils.XPath);
//        String txtGrossVoid = getText(element, msg);
//        return txtGrossVoid;
        return findAndGetText(txtInitialGrossVoid, "", TestUtils.XPath);
    }

    public String getGrossVoidValue(String msg) {
//        WebElement element = mergeAndFindElement(txtGrossVoidValue, "", TestUtils.XPath);
//        String GrossVoidValue = getText(element, msg);
//        return GrossVoidValue;
        return findAndGetText(txtGrossVoidValue, "", TestUtils.XPath);
    }

    public String getInitialGrossSale(String msg) {
//        WebElement element = mergeAndFindElement(txtInitialGrossSale, "", TestUtils.XPath);
//        String txtGrossSale = getText(element, msg);
//        return txtGrossSale;
        return findAndGetText(txtInitialGrossSale, "", TestUtils.XPath);
    }

    public void getPaidInAmountValue(String initialPaidIn) {
//        WebElement element = mergeAndFindElement(txtPaidInValue, "", TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement paidIn = mergeAndFindElement(initialPaidIn, "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement(paidInPrice, "", TestUtils.XPath);

        if (paidIn.isDisplayed()) {
            String data = paidIn.getText();
            String money = price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getPaidOutValue(String initialPaidOut) {
//        WebElement element = mergeAndFindElement(txtPaidOutValue, "", TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement paidOut = mergeAndFindElement(initialPaidOut, "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement(paidOutPrice, "", TestUtils.XPath);

        if (paidOut.isDisplayed()) {
            String data = paidOut.getText();
            String money = price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void getOverShortageValue(String overShortageInitialVal) {
//        WebElement element = mergeAndFindElement(txtOverShortage, "", TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement overShortage = mergeAndFindElement(overShortageInitialVal, "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement(overShortagePrice, "", TestUtils.XPath);

        if (overShortage.isDisplayed()) {
            String data = overShortage.getText();
            String money = price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void clickBtnFinish(String msg) {
//        WebElement element = mergeAndFindElement(btnFinish, "",TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnFinish, "",TestUtils.XPath);
    }

    public void getBtnActiveCheck(String msg) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(btnActiveCheck, "",TestUtils.XPath);
//        elementClick(element, msg);

        findandclick(btnActiveCheck, "",TestUtils.XPath);
    }

    public String getTxtActiveCheck(String txtZeroActiveCheck,String msg) {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(txtActiveCheck, txtZeroActiveCheck, TestUtils.XPath);
//        String txtActive = getText(element, msg);
//        return txtActive;
        return findAndGetText(txtActiveCheck, txtZeroActiveCheck, TestUtils.XPath);
    }

    public void clickbtnPopupCancel(String msg) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(btnPopupCancel, "",TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnPopupCancel, "",TestUtils.XPath);
    }

    public String getTxtNoActiveChecks(String msg) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(txtNoActiveChecks, "", TestUtils.XPath);
//        String txtNoActive = getText(element, msg);
//        return txtNoActive;
        return findAndGetText(txtNoActiveChecks, "", TestUtils.XPath);
    }

    public void clickBtnDropDown(String btnDropDown,String msg) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(btnDropDownXpath, btnDropDown,TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnDropDownXpath, btnDropDown,TestUtils.XPath);
    }

    public void clickTextFieldPercentage(String msg){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(textFieldPercentage, "",TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(textFieldPercentage, "",TestUtils.XPath);
    }

    public void getDiscountValue(String Discount) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return findAndGetText(netTotal, "", TestUtils.XPath);
    }

    public void getCashExpectedValue(String cashExpBf) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(txtCashExpected, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement cashExpInitialVal = mergeAndFindElement(cashExpBf,"",TestUtils.Accessibility);
        WebElement cashExpPrice = mergeAndFindElement(cashExpBfVal,"",TestUtils.XPath);

        if (cashExpInitialVal.isDisplayed()) {
            String data=cashExpInitialVal.getText();
            String money = cashExpPrice.getText();
            utils.log().info(data +" - "+ money);

        } else {
            utils.log().info("not shown");
        }
    }

    public void clickBtnPayIn(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(btnPayIn,"", TestUtils.XPath);
//        elementClick(element, "Pay in clicked");
        findandclick(btnPayIn,"", TestUtils.XPath);
    }

    public void clickPayByTextField(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(payByTextField,"", TestUtils.XPath);
//        elementClick(element, "Pay in Text Field clicked");
        findandclick(payByTextField,"", TestUtils.XPath);
    }

    public void passNameBy(String txtName){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = mergeAndFindElement(payByTextField,"", TestUtils.XPath);
        element.sendKeys(txtName);
//        findandclick_Skeys(payByTextField,"", TestUtils.XPath,"SKeys",txtName);
    }

    public void getPaidInValue(String aftPaidIn,String aftPaidInVal) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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

    public void clickBtnPayOut(){
//        WebElement element = mergeAndFindElement(btnPayOut,"", TestUtils.XPath);
//        elementClick(element,"Pay out clicked");
        findandclick(btnPayOut,"", TestUtils.XPath);
    }

    public void getAftPaidOutValue(String paidOutAft,String paidOutVal) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(txtGiftCardSold, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement giftCardSold = mergeAndFindElement(giftCardSoldAft, "", TestUtils.Accessibility);
        WebElement Price = mergeAndFindElement(giftCardSoldAftVal, "", TestUtils.XPath);

        if (giftCardSold.isDisplayed()) {
            String data = giftCardSold.getText();
            String money = Price.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public boolean isDateTimeDisplayed(){
        WebElement element = mergeAndFindElement(txtDateTime, "",TestUtils.XPath);
        boolean value= element.isDisplayed();
        return value;
    }

    public String getFullGrossReceipt(){
//        WebElement element = mergeAndFindElement(txtAfterSaleGrossReceipt, "",TestUtils.XPath);
//        String value= elementGetText(element,"Gross Receipt verify");
//        return value;
        return findAndGetText(txtAfterSaleGrossReceipt, "",TestUtils.XPath);
    }

    public void getCreditCardValue(String creditCardPP,String creditCardPPVal) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(txtAfterSaleCashExpected, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement cashExpectedPaidOut = mergeAndFindElement(cashExpPaidOut, "", TestUtils.Accessibility);
        WebElement cashExpectedPaidOutPrice = mergeAndFindElement(commontxtXPathVal, cashExpAft, TestUtils.XPath);

        if (cashExpectedPaidOut.isDisplayed()) {
            String data = cashExpectedPaidOut.getText();
            String money = cashExpectedPaidOutPrice.getText();
            utils.log().info(data + "  -  " + money);

        } else {
            utils.log().info("not shown");
        }
    }

    public String getTxtAfterGrossSale(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(txtAfterGrossSales, "", TestUtils.XPath);
//        String value = getText(element,"verify gross sale");
//        return value;
        return findAndGetText(txtAfterGrossSales, "", TestUtils.XPath);
    }

    public String getTxtAfterSaleRecapGrossSale(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(txtAfterSaleRecapGrossSales, "", TestUtils.XPath);
//        String value = elementGetText(element,"verify gross sale");
//        return value;
        return findAndGetText(txtAfterSaleRecapGrossSales, "", TestUtils.XPath);
    }

    public String getTxtCoverCount(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(txtCoverCount, "", TestUtils.XPath);
//        String value = elementGetText(element,"Verify Cover Count");
//        return value;
        return findAndGetText(txtCoverCount, "", TestUtils.XPath);
    }

    public void clickNameTextField(String msg){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        WebElement element = mergeAndFindElement(txtNumberTextField,"", TestUtils.XPath);
        element.sendKeys(new TestUtils().dateTime()+ " - "+number );
//        findandclick_Skeys(txtNumberTextField,"", TestUtils.XPath,"SKeys",new TestUtils().dateTime()+ " - "+number);
    }
    public void passEmail(String number) {
        WebElement element = mergeAndFindElement(passEmailID,"", TestUtils.XPath);
        element.sendKeys(new TestUtils().dateTime(),number );
    }


    public void clickSave1(String msg) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(btnSave1,"", TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(passEmailID,"", TestUtils.XPath);
    }

    public void clickSave2(String msg) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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

    public void getTaxAmountValue(String tenPercentTax,String twentyPercentTax) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = mergeAndFindElement(txtTaxExempt, "",TestUtils.XPath);
//        iOSScrollToElementUsingMobileScroll(element);
        WebElement tenPercentPrice = mergeAndFindElement(commontxtXPathVal,tenPercentTax,TestUtils.XPath);
        WebElement twentyPercentPrice = mergeAndFindElement(commontxtXPathVal,twentyPercentTax,TestUtils.XPath);

        if (tenPercentPrice.isDisplayed()) {
            String money = tenPercentPrice.getText();
            String Price = twentyPercentPrice.getText();
            utils.log().info("Ten percent tax" +" - "+ money+" , "+"Twenty percent tax" +" - "+Price);
        } else {
            utils.log().info("not shown");
        }
    }

    public void getOverShortage(String overShortageVal,String txtOverShortageVal) throws Exception {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        iOSScrollToElementUsingMobileScroll(txtOverShortageAft);
        WebElement overShortage = mergeAndFindElement(overShortageVal,"",TestUtils.Accessibility);
        WebElement overShortagePrice = mergeAndFindElement(commontxtXPathVal,txtOverShortageVal,TestUtils.XPath);

        if (overShortage.isDisplayed()) {
            String data=overShortage.getText();
            String money = overShortagePrice.getText();
            utils.log().info(data +" - "+ money);
        } else {
            utils.log().info("not shown");
        }
    }

    public void clickBtnCancel(String msg) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement elementCancel = mergeAndFindElement(Cancel, "", TestUtils.XPath);
//        click(elementCancel, msg);
        findandclick(Cancel, "", TestUtils.XPath);
    }

    public void VerifycommonBtnLogoff(String btnLogOff){
        WebElement element = mergeAndFindElement(commonBtnLogOff, btnLogOff, TestUtils.XPath);
    }


}
