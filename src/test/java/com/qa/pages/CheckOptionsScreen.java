package com.qa.pages;

import com.qa.utils.TestUtils;
import static com.qa.utils.TestUtils.driver;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import static com.qa.pages.DriverSteup.driver;

public class CheckOptionsScreen extends OrderManagementScreen {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Hold\"]")
    WebElement holdBtn;

    @FindBy(name = "Tax Exempt")
    WebElement taxExemptBtn;

    @FindBy(name = "Open Item")
    WebElement openItemBtn;

    @FindBy(name = "Resend To Kitchen")
    WebElement resendToKitchenBtn;

    @FindBy(name = "Modify")
    WebElement modifyBtn;

//    @FindBy(name = "Done")
//    WebElement doneHoldBtn;

    // Nov 19
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
    WebElement doneHoldBtn;

    @FindBy(name = " Back ")
    WebElement backBtn;

    @FindBy(name = "   Back")
    WebElement backBtnForFireCoursing;

    @FindBy(name = "Check Options")
    WebElement checkOptionsTitle;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Tax Exempt\"])[2]")
    WebElement taxExemptTitle;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther")
    WebElement schoolTaxExemptReason;

    @FindBy(name = "Paid amount exceeds the sale amount") //Changed to xpath by Engin...
    WebElement paidAmountExceedsTxt;                                                                 //because the text couldn't be found with name = id (why!?)

    @FindBy(name = "Done")
    WebElement paidAmountExceedsPopupDoneBtn;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\" Back \"])[1]")
    WebElement backOnTaxExemptBtn;
//    (//XCUIElementTypeButton[@name=" Back "])[1]

    @FindBy(name = "Tax Exempt Removed Successfully")
    WebElement taxExemptRemovedTxt;

    // @FindBy(xpath ="//XCUIElementTypeTextView[@name=\"Can't Hold on this time\"]") //Changed to xpath by Engin...
    @FindBy(name = "Can't Hold on this time")
    WebElement cantHoldOnThisTimeTxt;                                                   //because the text couldn't be found with name = id (why!?)

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]")
    WebElement coursingNameTxt;

    @FindBy(name = "Gratuity")
    WebElement gratuity;

    @FindBy(name = "Gratuity")
    WebElement gratuityBtn;

    @FindBy(name = "Add Gratuity")
    WebElement addGratuityScreen;

    @FindBy(name = "Fixed Gratuity")
    WebElement gratuityFixedBtn;

    @FindBy(name = "Gratuity Varying")
    WebElement gratuityVaryingBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    WebElement passPercentageValue;

    @FindBy(name = "Apply")
    WebElement applyBtn;

    @FindBy(name = "Enter Percentage")
    WebElement enterPercentagePopup;

    @FindBy(name = "Enter Value from 5.0 - 15.0")
    WebElement enterValue;

    @FindBy(name = "Automatic")
    WebElement automaticBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypePicker[2]/XCUIElementTypePickerWheel")
    WebElement minuteDropDown;

    @FindBy(xpath = "/XCUIElementTypePickerWheel[`value == \"00\"`][2]")
    WebElement minuteDrop1;

    @FindBy(name = "Open Cash Drawer")
    WebElement openCashDrawerBtn;

    @FindBy(name = "Fire Coursing") //Nov 16
    WebElement fireCoursingBtn;

    @FindBy(name = "Fire Coursing")
    WebElement fireCoursingTxt;

    @FindBy(name = "10%")
    private WebElement tenPercentage;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField")
    private WebElement enterAmountFieldCheckOption;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private WebElement continueBtnCheckOption;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextView")
    private WebElement txtFieldForReasonCheckOption;

    @FindBy(name = "Linga Close")
    private WebElement lingaClose;

    @FindBy(name = "Apply")
    private WebElement applyButton;

    @FindBy(name = "Discount")
    private WebElement discountOnOption;

    @FindBy(name = "Item Discount")
    private WebElement itemDiscountBtn;

    @FindBy(name = "Check Discount")
    private WebElement checkDiscountBtn;

    @FindBy(name = "Open Check Discount")
    private WebElement openCheckDiscountOptionScreen;

    @FindBy(name = "Open Check Discount")
    private WebElement openCheckDiscountIsVisible;

    @FindBy(name = "Percentage")
    private WebElement percentageCheckOption;

    @FindBy(name = "Amount")
    private WebElement amountCheckOption;

    @FindBy(name = "After")
    private WebElement afterCheckOption;

    @FindBy(name = "Before")
    private WebElement beforeCheckOption;

    @FindBy(name = "Need to Attach Customer")
    private WebElement needToAttachCustomer;

    @FindBy(name = "Item Discount")
    private WebElement itemDiscountText;

    @FindBy(name = "Check Discount")
    private WebElement checkDiscountText;

    @FindBy(name = "Gift Card")
    private WebElement giftCardBtn;

    @FindBy(name = "0000 0000 0000 0000")
    private WebElement cardNumber;

    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther")
    private WebElement chargeAmountField;

    @FindBy(name = "GC-1111 ")
    private WebElement giftCardAddUp;


    public String getCheckOptionsTitle() {
        return elementGetText(checkOptionsTitle, "Check Options title is - ");
    }

    public String getPaidAmountExceedsTxt() {
        return elementGetText(paidAmountExceedsTxt, "Paid amount exceeds text is - ");
    }

    public String getTaxExemptRemovedTxt() {
        return elementGetText(taxExemptRemovedTxt, "Tax exempt removed text is - ");
    }

    public String getTaxExemptTitle() {
        return elementGetText(taxExemptTitle, "Tax Exempt title is - ");
    }

    public String getCantHoldOnThisTimeTxt() {

        return elementGetText(cantHoldOnThisTimeTxt, "Can't Hold On This Time Txt is - ");
    }

    public void selectHold() {
        elementClick(holdBtn, "- Hold option is selected");
    }

    public void selectCoursingNameTxtField() {
        elementClick(coursingNameTxt, "Coursing name text field clicked - ");
    }

    ;

    public void pressDoneHold() {
        try {
            elementClick(doneHoldBtn, "- Done hold is tapped");
        } catch (Exception e) {
        }
    }

    public void pressTaxExempt() {
        elementClick(taxExemptBtn, "- Tax Exempt is tapped");
    }

    public void pressModify() {
        elementClick(modifyBtn, "- Modify is tapped");
    }

    public CheckOptionsScreen pressOpenItem() {
        elementClick(openItemBtn, "- Tax Exempt is tapped");
        return new CheckOptionsScreen();
    }

    public void pressResendToKitchen() {
        elementClick(resendToKitchenBtn, "- Resend to kitchen is tapped");
    }

    public void selectSchoolAsTaxExemptReason() {
        elementClick(schoolTaxExemptReason, "- School Tax Exempt Reason is selected");
    }

    public void pressBack() {
        elementClick(backBtn, "- Back button is tapped");
    }

    public void pressBackOnTaxExempt() {
        elementClick(backOnTaxExemptBtn, "- Back button on tax exempt window is tapped");
    }

    public void pressBackForFireCoursing() {
        elementClick(backBtnForFireCoursing, "Tapped Back Button");
    }

    public void pressPaidAmountExceedsPopupDoneBtn() {
        try {
            elementClick(paidAmountExceedsPopupDoneBtn, "- Done button is tapped on the Paid Amount Exceeds Pop-up ");
        } catch (Exception e) {
            utils.log().info("Done button");
        }
    }


    /****** Verifications ******/

    public void verifyPaidAmountExceeds() {
        if (paidAmountExceedsTxt.isDisplayed()) {
            utils.log().info("Paid amount exceeds pop-up is thrown");
        } else {
            utils.log().info("Paid amount exceeds pop-up is not thrown");
        }
    }

    public void pressGratuityBtn() {
        elementClick(gratuityBtn, "Tapped Gratuity Button");
    }

    public String verifyAddGratuityScreen() {
        return elementGetText(addGratuityScreen, "Add Gratuity Screen is Displayed - ");
    }

    public void pressGratuityFixedBtn() {
        elementClick(gratuityFixedBtn, "Tapped Gratuity Fixed Button");
    }

    public void pressGratuityVaryingBtn() {
        elementClick(gratuityVaryingBtn, "Tapped Gratuity Varying Button");
    }

    public void checkGratuityExists() {
        if (find(gratuity, 2)) {
            utils.log().info("Gratuity is Applied");
        } else {
            utils.log().info("Gratuity is not Applied");
        }
    }

    public void passPercentage(String number) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        elementClick(passPercentageValue, "Pass percentage value field is clicked.");
        elementClick(pinC, "Tapped Pin C");
        WebElement el2 =  driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"" + number + "\"]"));
        elementClick(el2, "Tapped number as - " + number);

        WebElement el5 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
        elementClick(el5, "Tapped continue Button ");

        elementClick(applyBtn, "Tapped Apply button");
    }

    public String a = " ";

    public String passPercentageEngin1() {
        a = "8";
        WebElement valueBetween =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextField"));
        String valueBetweenTxt = valueBetween.getText();
        utils.log().info("Percentage value - " + valueBetweenTxt);
        elementClick(passPercentageValue, "Pass percentage value field is clicked.");

        WebElement el2 =  driver.findElement(By.xpath(a));
        TestUtils.percent = a;
        String number = el2.getText();
        elementClick(el2, "Tapped number as - " + number);

        WebElement el5 =  driver.findElement(By.xpath("Continue"));
        elementClick(el5, "Tapped continue Button ");

        elementClick(applyBtn, "Tapped Apply button");

        return a;

    }


    public String passPercentageEngin2(String value) {

        WebElement valueBetween =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextField"));
        String valueBetweenTxt = valueBetween.getText();
        utils.log().info("Percentage value - " + valueBetweenTxt);
        elementClick(passPercentageValue, "Pass percentage value field is clicked.");

        WebElement el2 =  driver.findElement(By.xpath(value));
        TestUtils.percent = value;
        String number = el2.getText();
        elementClick(el2, "Tapped number as - " + number);

        WebElement el5 =  driver.findElement(By.xpath("Continue"));
        elementClick(el5, "Tapped continue Button ");

        elementClick(applyBtn, "Tapped Apply button");

        return value;

    }

    public void passPercentageEngin() {

        elementClick(passPercentageValue, "Pass percentage value field is clicked.");

        WebElement el2 =  driver.findElement(By.xpath("8"));
        String number = el2.getText();
        elementClick(el2, "Tapped number as - " + number);

        WebElement el5 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]"));
        elementClick(el5, "Tapped continue Button ");

        elementClick(applyBtn, "Tapped Apply button");
    }

    public void verifyEnterPercentage() {
        if (find(enterPercentagePopup, 2)) {
            utils.log().info("Percentage popup is visible");
        } else {
            utils.log().info("Percentage popup is not visible");
        }
    }

    public String enterValueAccordingBo() {
        return elementGetText(enterValue, "Enter value txt is displayed - ");
    }

    public void pressAutomaticBtn() {
        elementClick(automaticBtn, "Tapped Automatic Hold Button");
    }

    public void setTimeForAutomaticHold() {
        WebElement DatePickerWheel =  driver.findElement(By.xpath("//XCUIElementTypePicker[2]"));

        List<WebElement> course = DatePickerWheel.findElements(By.xpath("//XCUIElementTypePickerWheel"));

        course.get(0).sendKeys("01");
    }

    public void pressOpenCashDrawer() {
        elementClick(openCashDrawerBtn, "Tapped Open Cash Drawer Button");
    }

    public void pressFireCoursing() {
        elementClick(fireCoursingBtn, "Tapped Fire coursing Button");
    }

    public String verifyFireCoursing() {
        return elementGetText(fireCoursingTxt, "Fire coursing is Displayed - ");
    }

    public void pressCoursing(String Entree) {

        WebElement courseName =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"" + Entree + "\"]"));
        elementClick(courseName, "Tapped Course Name in the Fire Coursing");
    }


    public void press10percentage() throws InterruptedException {
//        iOSScrollToElementUsingMobileScroll(tenPercentage);
        if (tenPercentage.isDisplayed()) {
            elementClick(tenPercentage, "Tapped 10 Percentage");
//        List<WebElement> tax=(List<WebElement>) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable[1]");
//        for (int index = 0; index < tax.size(); index++) {
//            utils.log().info(tax.size());
//            tax= (List<WebElement>) driver.findElement(By.xpath()("//XCUIElementTypeStaticText[@name=\"10%\"]");
//            Thread.sleep(500);
//            tax.get(tax.size()-1).click();

        } else {
            utils.log().info("Not Tapped");
        }

    }

    public void selectDiscountOnCheckOption() {

        elementClick(discountOnOption, "Tapped Discount Button");
        //click(discountOnOptionScreen,"Tapped Discount Button");
    }

    public void selectItemDiscount() {
        elementClick(itemDiscountBtn, "Tapped Item Discount Button");
    }

    public void selectCheckDiscount() {
        elementClick(checkDiscountBtn, "Tapped Check Discount Button");
    }

    public void selectOpenCheckDiscountBtn() {
        elementClick(openCheckDiscountOptionScreen, "Tapped Open check Discount Button");
    }

    public String verifyOpenDiscountAppliedOnOrderScreen() {
        return elementGetText(openCheckDiscountIsVisible, "open check Discount txt is displayed - ");
    }

    public void passTheAmountForOpenCheckDiscountSafetyPercentageWholeValue(String name) {

        elementClick(enterAmountFieldCheckOption, "Tapped amount field");
        elementClick(pin2, "Tapped Pin 2");
        elementClick(pin0, "Tapped Pin 0");
        elementClick(pin00, "Tapped Pin 00");
        elementClick(continueBtnCheckOption, "Tapped Continue");
        txtFieldForReasonCheckOption.sendKeys("Open Item");
        elementClick(enterAmountFieldCheckOption, "Tapped Enter Field");
        elementClick(lingaClose, "Tapped Close");
        WebElement e1 = mergeAndFindElement(name, "", TestUtils.Accessibility);
        elementClick(e1, "Tapped as - " + name);
        click(applyButton, "Tapped Apply Button");
    }

    public void passTheAmountForOpenCheckDiscountSafetyPercentageDecimalPrecision(String name) {

        click(enterAmountFieldCheckOption, "Tapped amount field");
        elementClick(pin2, "Tapped Pin 2");
        elementClick(pin0, "Tapped Pin 0");
        elementClick(pin5, "Tapped Pin 5");
        elementClick(pin0, "Tapped Pin 0");
        elementClick(continueBtnCheckOption, "Tapped Continue");
        txtFieldForReasonCheckOption.sendKeys("Open Item");
        elementClick(enterAmountFieldCheckOption, "Tapped Enter Field");
        elementClick(lingaClose, "Tapped Close");
        WebElement e1 = mergeAndFindElement(name, "", TestUtils.Accessibility);
        elementClick(e1, "Tapped as - " + name);
        elementClick(applyButton, "Tapped Apply Button");
    }

    public void passTheAmountForOpenCheckDiscountAsPercentage(String name) {
        elementClick(percentageCheckOption, "Tapped Percentage Button");
        elementClick(enterAmountFieldCheckOption, "Tapped amount field");
        elementClick(pin2, "Tapped Pin 2");
        elementClick(pin0, "Tapped Pin 0");
        elementClick(pin00, "Tapped Pin 00");
        elementClick(continueBtnCheckOption, "Tapped Continue");
        txtFieldForReasonCheckOption.sendKeys("Open Item");
        elementClick(enterAmountFieldCheckOption, "Tapped Enter Field");
        elementClick(lingaClose, "Tapped Close");
        WebElement e1 = mergeAndFindElement(name, "", TestUtils.Accessibility);
        elementClick(e1, "Tapped as - " + name);
        elementClick(applyButton, "Tapped Apply Button");
    }

    public String amount1 = " ";

    public void passTheAmountForOpenCheckDiscountAsAmountttt(String amount, String name) {
        // elementClick(percentageCheckOption,"Tapped Percentage Button");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        elementClick(enterAmountFieldCheckOption, "Tapped amount field");

        amount1 = amount.replaceAll("[$.A-Z, ]", "");
        TestUtils.amountTxt = amount1;
        for (int i = 0; i < amount1.length(); i++) {
            char numbb = amount1.charAt(i);
            WebElement num1 = mergeAndFindElement(String.valueOf(numbb), "", TestUtils.Accessibility);
            elementClick(num1, "Tapped numbers are - " + numbb);
        }

        elementClick(continueBtnCheckOption, "Tapped Continue");
        txtFieldForReasonCheckOption.sendKeys("Open Item");
        elementClick(enterAmountFieldCheckOption, "Tapped Enter Field");
        elementClick(lingaClose, "Tapped Close");
        WebElement e1 = mergeAndFindElement(name, "", TestUtils.Accessibility);
        elementClick(e1, "Tapped as - " + name);
        elementClick(applyButton, "Tapped Apply Button");
    }

    public String verifyNeedToAttachCustomer() {
        return elementGetText(needToAttachCustomer, "need to attach popup is displayed - ");
    }

    public String verifyOpenItemScreen() {
        return elementGetText(itemDiscountText, "Item discount is displayed - ");
    }

    public String verifyCheckDiscount() {
        return elementGetText(checkDiscountText, " Check discount is displayed - ");
    }

    public String verifyOpenCheckDiscount() {
        return elementGetText(openCheckDiscountIsVisible, "Open check discount is displayed - ");
    }

    public void clickGiftCardBtn() {
        elementClick(giftCardBtn, "Tapped Gift Card Button");
    }

    public String verifyGiftCardWindow() {
        return elementGetText(giftCardBtn, "Gift card screen is displayed - ");
    }

    public void enterGiftCardNumber() {
        WebElement el1 = mergeAndFindElement("0000  0000  0000  0000", "", TestUtils.Accessibility);
        elementClick(el1, "Tapped Card Number Field");
        //click(cardNumber,"Tapped Card Number Field");
        elementClick(pin1, "Tapped Pin 1");
        elementClick(pin1, "Tapped Pin 1");
        elementClick(pin1, "Tapped Pin 1");
        elementClick(pin1, "Tapped Pin 1");
        //WebElement el2 = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]","",TestUtils.XPath);
        WebElement el2 = mergeAndFindElement("//XCUIElementTypeStaticText[@name=\"Continue\"]", "", TestUtils.XPath);
        elementClick(el2, "Tapped Continue ");
    }

    public void clickChargeAmountFieldPassAmount() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        elementClick(chargeAmountField, "Tapped Charge Amount Field");
        elementClick(pin1, "Tapped Pin 1");
        elementClick(pin00, "Tapped Pin 00");
        elementClick(pin00, "Tapped Pin 00");
        // WebElement el2 = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]","",TestUtils.XPath);
        WebElement el2 = mergeAndFindElement("//XCUIElementTypeStaticText[@name=\"Continue\"]", "", TestUtils.XPath);
        elementClick(el2, "Tapped ");
    }

    public void clickChargeAmountField() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        elementClick(chargeAmountField, "Tapped Charge Amount Field");
    }

    public String verifyGiftCardAddup() {
        return elementGetText(giftCardAddUp, "Gift Card is Add to Order screen - ");
    }

    public void verifyFixedGratuityAmount() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement subTotalOfMenu =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subTotalOfMenuTxt = subTotalOfMenu.getText();
        String subTotalOfMenuTxt1 = subTotalOfMenuTxt.replaceAll("[$A-Z,.]", "");
        double subDouble = Double.parseDouble(subTotalOfMenuTxt1);
        WebElement tax =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taxTxt = tax.getText();
        String taxTxt1 = taxTxt.replaceAll("[$A-Z,.]", "");
        WebElement fixedGratuity =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String fixedGratuityTxt = fixedGratuity.getText();
        WebElement Total =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String totalTxt = Total.getText();
        WebElement cashOption =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
        String cashOptionTxt = cashOption.getText();
        String totalTxt1 = totalTxt.replaceAll("[$A-Z,.]", "");
        double totalDouble = Double.parseDouble(totalTxt1);
        String subTotal1 = subTotalOfMenuTxt.replaceAll("[$A-Z,.]", "");

        double fixedGratuityTxt1 = Double.parseDouble(subTotal1);

        double percentage = (fixedGratuityTxt1 * 10) / 100;

        String percentage1 = String.valueOf(percentage);

        String percentage2 = "$ " + percentage1;

        utils.log().info("Subtotal Of Menu - " + subTotalOfMenuTxt);

        utils.log().info("Tax of Menu - " + taxTxt);

        double taxDouble = Double.parseDouble(taxTxt1);
        BigDecimal dd = new BigDecimal(percentage1).setScale(2, RoundingMode.HALF_UP);
        double a = dd.doubleValue();

        String percentage3 = String.valueOf(a);
        String Percentage4 = "$ " + percentage3;

        utils.log().info("Expected Gratuity Of Menu - " + fixedGratuityTxt);

        if (fixedGratuityTxt.equalsIgnoreCase(Percentage4)) {
            utils.log().info("Actual Fixed Gratuity is same with Expected Fixed Gratuity - " + Percentage4);
        } else {
            utils.log().info("Actual Fixed Gratuity is NOT same with Expected Fixed Gratuity - " + Percentage4);
        }


//        double totalVerify = percentage+taxDouble+subDouble;
//
//        if(totalDouble==totalVerify){
//            utils.log().info("Total of Menu is - $ "+totalVerify);
//        }else{
//            utils.log().info("Total of Menu is not Correct - $ "+totalVerify);
//        }

        utils.log().info("Total Of Menu - " + totalTxt);
        utils.log().info("Cash option Of Menu - " + cashOptionTxt);
    }

    public void verifyGratuityVarying() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement subTotalOfMenu =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subTotalOfMenuTxt = subTotalOfMenu.getText();
        String subTotalOfMenuTxt1 = subTotalOfMenuTxt.replaceAll("[$A-Z,.]", "");
        double subDouble = Double.parseDouble(subTotalOfMenuTxt1);
        WebElement tax =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taxTxt = tax.getText();
        String taxTxt1 = taxTxt.replaceAll("[$A-Z,.]", "");
        WebElement gratuity =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String fixedGratuityTxt = gratuity.getText();
        WebElement Total =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String totalTxt = Total.getText();
        WebElement cashOption =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
        String cashOptionTxt = cashOption.getText();


        String totalTxt1 = totalTxt.replaceAll("[$A-Z,.]", "");
        double totalDouble = Double.parseDouble(totalTxt1);
        String subTotal1 = subTotalOfMenuTxt.replaceAll("[$A-Z,.]", "");

        double fixedGratuityTxt1 = Double.parseDouble(subTotal1);

        String number = TestUtils.percent;

        double number1 = Double.parseDouble(number);

        utils.log().info("gratuity percentage - " + number1);

        double percentage = (fixedGratuityTxt1 * number1) / 100;

        String percentage1 = String.valueOf(percentage);

        String percentage2 = "$ " + percentage1;

        utils.log().info("Subtotal Of Menu - " + subTotalOfMenuTxt);

        utils.log().info("Tax of Menu - " + taxTxt);

        double taxDouble = Double.parseDouble(taxTxt1);
        BigDecimal dd = new BigDecimal(percentage1).setScale(2, RoundingMode.HALF_UP);
        double a = dd.doubleValue();

        String percentage3 = String.valueOf(a);
        String Percentage4 = "$ " + percentage3;

        utils.log().info("Expected Gratuity Of Menu - " + fixedGratuityTxt);

        if (fixedGratuityTxt.equalsIgnoreCase(Percentage4)) {
            utils.log().info("Actual Fixed Gratuity is same with Expected Fixed Gratuity - " + Percentage4);
        } else {
            utils.log().info("Actual Fixed Gratuity is NOT same with Expected Fixed Gratuity - " + Percentage4);
        }

        utils.log().info("Total Of Menu - " + totalTxt);
        utils.log().info("Cash option Of Menu - " + cashOptionTxt);
    }

    public void verifyAutoGratuityApplied() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement gratuity =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]"));
        String autoGratuityTxt = gratuity.getText();

        if (autoGratuityTxt.equals("Gratuity")) {
            WebElement subTotalOfMenu =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Subtotal\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subTotalOfMenuTxt = subTotalOfMenu.getText();
            utils.log().info("Subtotal of Menu - " + subTotalOfMenuTxt);
        } else {
            utils.log().info("GRATUITY IS NOT APPLIED");
            int i =1/0;
        }
    }


    public void verifyAutoGratuityAppliedOrNot() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement gratuity =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]"));
        String autoGratuityTxt = gratuity.getText();

        if (autoGratuityTxt.equals("Gratuity")) {
            WebElement subTotalOfMenu =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Subtotal\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subTotalOfMenuTxt = subTotalOfMenu.getText();
            utils.log().info("Subtotal of Menu - " + subTotalOfMenuTxt);

            WebElement tax =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Tax\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxTxt = tax.getText();
            utils.log().info("Tax of Menu - " + taxTxt);

            WebElement gratuity1 =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Gratuity\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String autoGratuity1 = gratuity1.getText();
            utils.log().info("Gratuity of Menu - " + autoGratuity1);

            WebElement Total =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
            String totalTxt = Total.getText();
            utils.log().info("Total of Menu - " + totalTxt);

            WebElement cashOption =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Price\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
            String cashOptionTxt = cashOption.getText();
            utils.log().info("Cash Price of Menu - " + cashOptionTxt);

        } else {
            utils.log().info("GRATUITY IS NOT APPLIED");
        }
    }

    @FindBy(name = "Auto Varying Gratuity")
    WebElement autoGratuityVaryingBtn;

    @FindBy(name = "Auto Fixed Gratuity")
    WebElement autoFixedGratuityBtn;

    public void pressAutoGratuityVaryingBtn() {
        elementClick(autoGratuityVaryingBtn, "Tapped Auto Varying Gratuity button");
    }

    public void pressAutoGratuityFixedBtn() {
        elementClick(autoFixedGratuityBtn, "Tapped Auto Varying Gratuity button");
    }

    public void selectAutoGratuityAs(String Gratuity){
        driver.manage().timeouts().implicitlyWait(TestUtils.driverWAIT,TimeUnit.SECONDS);
        WebElement selectGratuity =  driver.findElement(By.xpath(Gratuity));
        elementClick(selectGratuity,"Selected - "+selectGratuity.getText());
    }
    public void verifyAutoGratuityAppliedOrNotInSeat() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement gratuity =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]"));
        String autoGratuityTxt = gratuity.getText();

        if (autoGratuityTxt.equals("Gratuity")) {
            WebElement subTotalOfMenu =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
            String subTotalOfMenuTxt = subTotalOfMenu.getText();
            utils.log().info("Subtotal of Menu - " + subTotalOfMenuTxt);

            WebElement tax =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
            String taxTxt = tax.getText();
            utils.log().info("Tax of Menu - " + taxTxt);

            WebElement gratuity1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
            String autoGratuity1 = gratuity1.getText();
            utils.log().info("Gratuity of Menu - " + autoGratuity1);

            WebElement Total =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
            String totalTxt = Total.getText();
            utils.log().info("Total of Menu - " + totalTxt);

            WebElement cashOption =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]"));
            String cashOptionTxt = cashOption.getText();
            utils.log().info("Cash Price of Menu - " + cashOptionTxt);

        } else {
            utils.log().info("GRATUITY IS NOT APPLIED");
        }
    }

    @FindBy(name = "Enter Gratuity Percentage")
    WebElement enterGratuityPercentage;

    public String verifyGratuityPercentage() {
        return getText(enterGratuityPercentage, "Gratuity Popup as - ");
    }


    public void clickTableOrderScreen() {
        WebElement table =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        String tableTxt = table.getText();
        elementClick(table, "selected Table - " + tableTxt);
    }

    public void selectCardFromOrderType() {
        List<WebElement> cards = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        int cardCount = cards.size();
        utils.log().info("Card count - " + cardCount);

        WebElement card1 =  driver.findElement(By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]"));
        String card1Txt = card1.getText();
        elementClick(card1, " Selected card - " + card1Txt);

    }

    public String element2 = " ";

    public String selectPrefixModifier() {
        List<WebElement> element = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        int sizeOfPrefix = element.size();
        utils.log().info("Size of the Prefix modifiers - " + sizeOfPrefix);
        WebElement element1 =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeStaticText[1]"));
        element2 = element1.getText();
        TestUtils.prefixModi = element2;
        elementClick(element1, " Selected prefix as - " + element2);
        return element2;
    }

    public void verifyPrefixAddedToTheMenu() {
        try {
            WebElement prefixModi =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
            String prefixModiTxt = prefixModi.getText();

            if (prefixModiTxt.contains(TestUtils.prefixModi)) {
                utils.log().info("Prefix modifiers is Added with Menu Item - " + prefixModiTxt);
            } else {
                utils.log().info("Prefix modifiers is NOT Added with Menu Item - " + prefixModiTxt);
            }
        } catch (Exception h) {
            WebElement prefixModi =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
            String prefixModiTxt = prefixModi.getText();

            if (prefixModiTxt.contains(TestUtils.prefixModi)) {
                utils.log().info("Prefix modifiers is Added with Menu Item - " + prefixModiTxt);
            } else {
                utils.log().info("Prefix modifiers is NOT Added with Menu Item - " + prefixModiTxt);
            }
        }
    }

    public void clickCheckDiscount() {
        elementClick(checkDiscountBtn, "Tapped Check Discount ");
    }

    public void selectTax(String tax) {
        WebElement taxess = mergeAndFindElement(tax, "", TestUtils.Accessibility);
        elementClick(taxess, "Tapped tax as - " + taxess.getText());
    }

    public void selectDiscountAs(String discountName) {
        WebElement discountTxt = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell/XCUIElementTypeStaticText[1]", "", TestUtils.XPath);
        String discountTxt1 = discountTxt.getText();
        Assert.assertEquals(discountName, discountTxt1);
        utils.log().info("Applied Discount as - " + discountName);
    }

    public void verifyCheckDiscountIsApplied() {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        WebElement discount = mergeAndFindElement("Check-Based Percentage", "", TestUtils.Accessibility);
        if (discount.isDisplayed()) {
            utils.log().info("Discount is applied - " + discount.getText());
            WebElement menuPrice = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]", "", TestUtils.XPath);
            String menuPriceTxt = menuPrice.getText();
            utils.log().info("Actual Menu Prize - " + menuPriceTxt);
            String menuPrice1 = menuPriceTxt.replaceAll("[A-Z,.$ ]", "");

            int menuAmount = Integer.parseInt(menuPrice1);
            WebElement discounts =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell/XCUIElementTypeStaticText[3]"));
            String discounts1 = discounts.getText().replaceAll("[A-Z$,. ]", "");
            int Discount1 = Integer.parseInt(discounts1);

            WebElement discountAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]", "", TestUtils.XPath);
            String discountAmountTxt = discountAmount.getText();
            utils.log().info("Actual Discount - " + discountAmountTxt);
            String discountAmountTxt1 = discountAmountTxt.replaceAll("[A-Z$,. ]", "");
            int Discount2 = Integer.parseInt(discountAmountTxt1);

            WebElement taxAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]", "", TestUtils.XPath);
            String taxAmountTxt = taxAmount.getText();
            utils.log().info("Actual Tax - " + taxAmountTxt);
            String taxAmountTxt1 = taxAmountTxt.replaceAll("[A-Z$,. ]", "");
            int tax2 = Integer.parseInt(taxAmountTxt1);
            Assert.assertEquals(Discount2, Discount1);
            utils.log().info(" Expected and Actual Discount is Same - " + Discount2);
            int realTotal = (menuAmount+tax2) - Discount2;  //Subtract menutotal with Discount
            String realTotalTxt = String.valueOf(realTotal);
            WebElement totalAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]", "", TestUtils.XPath);
            String totalAmountTxt = totalAmount.getText();
            utils.log().info(" Actual Total - " + totalAmountTxt);
            String totalAmountString = totalAmountTxt.replaceAll("[A-Z$,. ]", "");
            int totalAmountInt = Integer.parseInt(totalAmountString);
            String totalAmountString1 = String.valueOf(totalAmountInt);
            Assert.assertEquals(realTotalTxt, totalAmountString1);
            utils.log().info("Expected and Actual Total is Same - " + realTotalTxt);
            String result = " ";
            for (int i = 1; i <= realTotalTxt.length(); ++i) {
                char ch = realTotalTxt.charAt(realTotalTxt.length() - i);
                if (i % 2 == 1 && i > 1) {
                    result = "," + result;
                }
                result = ch + result;

            }
            utils.log().info("Total of MENU ITEMs - " + result);
        }
    }

    public void verifyOpenCheckDiscountIsApplied() {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        WebElement discount = mergeAndFindElement("Open Check Discount", "", TestUtils.Accessibility);
        if (discount.isDisplayed()) {
            utils.log().info("Discount is applied - " + discount.getText());
            WebElement menuPrice = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]", "", TestUtils.XPath);
            String menuPriceTxt = menuPrice.getText();
            utils.log().info("Actual Menu Prize - " + menuPriceTxt);
            String menuPrice1 = menuPriceTxt.replaceAll("[A-Z$., ]", "");

            int menuAmount = Integer.parseInt(menuPrice1);

            int Discount = Integer.parseInt(TestUtils.amountTxt);
            int Discount1 = (menuAmount - Discount);
            String Discount3 = String.valueOf(Discount1);
            WebElement discountAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]", "", TestUtils.XPath);
            String discountAmountTxt = discountAmount.getText();
            utils.log().info("Actual Discount - " + discountAmountTxt);
            String discountAmountTxt1 = discountAmountTxt.replaceAll("[A-Z$., ]", "");
            int Discount2 = Integer.parseInt(discountAmountTxt1);
            Assert.assertEquals(Discount2, Discount);
            utils.log().info(" Expected and Actual Discount is Same - " + Discount2);
            WebElement taxAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]", "", TestUtils.XPath);
            String taxAmountTxt = taxAmount.getText();
            utils.log().info("Actual Discount - " + taxAmountTxt);
            String taxAmountTxt1 = taxAmountTxt.replaceAll("[A-Z$., ]", "");
            int tax2 = Integer.parseInt(taxAmountTxt1);
            int realTotal = (menuAmount+tax2) - Discount2;  //Subtract menutotal with Discount
            String realTotalTxt = String.valueOf(realTotal);
            WebElement totalAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]", "", TestUtils.XPath);
            String totalAmountTxt = totalAmount.getText();
            utils.log().info(" Actual Total - " + totalAmountTxt);
            String totalAmountString = totalAmountTxt.replaceAll("[A-Z$., ]", "");
            int totalAmountInt = Integer.parseInt(totalAmountString);
            String totalAmountString1 = String.valueOf(totalAmountInt);
            Assert.assertEquals(realTotalTxt, totalAmountString1);
            utils.log().info("Expected and Actual Total is Same - " + realTotalTxt);
            String result = " ";
            for (int i = 1; i <= realTotalTxt.length(); ++i) {
                char ch = realTotalTxt.charAt(realTotalTxt.length() - i);
                if (i % 2 == 1 && i > 1) {
                    result = "," + result;
                }
                result = ch + result;

            }
            utils.log().info("Total of MENU ITEMs - " + result);
        }
    }

    @FindBy(name = "Discount exceeds the safety limit")
    WebElement discountExceedsTheSafetyLimit;

    public void verifyDiscountExceedLimitPopup() {
        String discountExceedsTheSafetyLimitTxt = discountExceedsTheSafetyLimit.getText();
        Assert.assertEquals(discountExceedsTheSafetyLimitTxt, "Discount exceeds the safety limit");
    }

    public void verifyItemDiscountIsAppliedOrNot() {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        WebElement discount = mergeAndFindElement("IB-AfterTax-Amount", "", TestUtils.Accessibility);
        if (discount.isDisplayed()) {
            utils.log().info("Discount is applied - " + discount.getText());
            WebElement menuPrice = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]", "", TestUtils.XPath);
            String menuPriceTxt = menuPrice.getText();
            utils.log().info("Actual Menu Prize - " + menuPriceTxt);
            String menuPrice1 = menuPriceTxt.replaceAll("[A-Z$,. ]", "");
            int menuAmount = Integer.parseInt(menuPrice1);
            utils.log().info("Menu Amount - "+menuAmount);
            WebElement discounts =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell/XCUIElementTypeStaticText[3]"));
            String discounts1 = discounts.getText().replaceAll("[A-Z$,. ]", "");
            int Discount1 = Integer.parseInt(discounts1);

            //                int Discount = 10;
//                int Discount1 = ((menuAmount*Discount)/100);
            // String Discount3 = String.valueOf(Discount1);
            WebElement discountAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]", "", TestUtils.XPath);
            String discountAmountTxt = discountAmount.getText();
            utils.log().info("Actual Discount - " + discountAmountTxt);
            String discountAmountTxt1 = discountAmountTxt.replaceAll("[A-Z$,. ]", "");
            int Discount2 = Integer.parseInt(discountAmountTxt1);
            Assert.assertEquals(Discount2, Discount1);
            WebElement taxAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]", "", TestUtils.XPath);
            String taxAmountTxt = taxAmount.getText();
            utils.log().info("Actual Tax - " + taxAmountTxt);
            String taxAmountTxt1 = taxAmountTxt.replaceAll("[A-Z$,. ]", "");
            int tax2 = Integer.parseInt(taxAmountTxt1);
            utils.log().info(" Expected and Actual Discount is Same - " + Discount2);
            int realTotal = (menuAmount+tax2) - Discount2;  //Subtract menutotal with Discount
            String realTotalTxt = String.valueOf(realTotal);
            WebElement totalAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]", "", TestUtils.XPath);
            String totalAmountTxt = totalAmount.getText();
            utils.log().info(" Actual Total - " + totalAmountTxt);
            String totalAmountString = totalAmountTxt.replaceAll("[A-Z$,. ]", "");
            int totalAmountInt = Integer.parseInt(totalAmountString);
            String totalAmountString1 = String.valueOf(totalAmountInt);
            Assert.assertEquals(realTotalTxt, totalAmountString1);
            utils.log().info("Expected and Actual Total is Same - " + realTotalTxt);
            String result = " ";
            for (int i = 1; i <= realTotalTxt.length(); ++i) {
                char ch = realTotalTxt.charAt(realTotalTxt.length() - i);
                if (i % 2 == 1 && i > 1) {
                    result = "," + result;
                }
                result = ch + result;

            }
            utils.log().info("Total of MENU ITEMs - " + result);
        }
    }

    @FindBy(name = "Continue")
    WebElement continueBtnn;

    public String recurringBalanceTxt2 = " ";

    public void verifyBeginningBalanceAndRecurringBalanceAndChargeAmountGiveX() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
Thread.sleep(4000);
        WebElement beginningBalance =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[5]"));
        String beginingBalanceTxt = beginningBalance.getText();
        utils.log().info("Beginning Balance - " + beginingBalanceTxt);
        WebElement recurringBalance =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[7]"));
        String recurringBalanceTxt = recurringBalance.getText();
        Assert.assertEquals(beginingBalanceTxt, recurringBalanceTxt);
        utils.log().info("Beginning Balance & Recurring Balance Is SAME - " + beginingBalanceTxt);
    }
        public void verifyBeginningBalanceAndRecurringBalanceAndChargeAmount() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            Thread.sleep(4000);
        WebElement beginningBalance =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[5]"));
        String beginingBalanceTxt = beginningBalance.getText();
        utils.log().info("Beginning Balance - " + beginingBalanceTxt);
        WebElement recurringBalance =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[7]"));
        String recurringBalanceTxt = recurringBalance.getText();
        Assert.assertEquals(beginingBalanceTxt, recurringBalanceTxt);
        utils.log().info("Beginning Balance & Recurring Balance Is SAME - " + beginingBalanceTxt);

//            utils.log().info("recurringBalanceInter - "+recurringBalanceInter);
//            int ActualRecurringBalance = recurringBalanceInter;
//             recurringBalanceTxt2 = String.valueOf(ActualRecurringBalance);
//            utils.log().info("recurringBalanceTxt2 - "+recurringBalanceTxt2);
//            int expectedChargeAmount = ActualRecurringBalance-chargeAmountInte;
//            String expectedChargeAmountTxt = String.valueOf(expectedChargeAmount);
//            utils.log().info("expectedChargeAmountTxt - "+expectedChargeAmountTxt);
//            Assert.assertEquals(recurringBalanceTxt2,expectedChargeAmountTxt);
//            utils.log().info("Recurring Balance same with Charge Amount - "+recurringBalanceTxt);
//            WebElement beginningBalanceAmount =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[5]");
//             String beginningBalanceAmountTxt = beginningBalanceAmount.getText();
//             utils.log().info("Beginning Balance - "+beginningBalanceAmountTxt);

        // int chargeAmountInte = Integer.parseInt(number);
    }

    public String giveXValue;

    public void enterTheChargeAmountOnTheGiftCardWindow(String number) {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        giveXValue = number;
        TestUtils.giveXvalue = giveXValue;
        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField
        WebElement numberField =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther"));
        elementClick(numberField, "Tapped number field");
        int numberTxt = number.length();
        for (int i = 0; i < numberTxt; i++) {

            char money = number.charAt(i);
            String moneyTxt = String.valueOf(money);

            try {
                WebElement text =  driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"" + moneyTxt + "\"]"));
                elementClick(text, "Selected - " + moneyTxt);
            } catch (Exception h) {

            }
        }
        elementClick(continueBtnn, "Continue Selected");
    }

    public void clickSuspendAccountBtn() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch
        WebElement activeAccount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch"));
        elementClick(activeAccount, "Selected Active Account Button");
    }

    public void clickActiveAccountBtn() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch
        WebElement activeAccount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch"));
        elementClick(activeAccount, "Selected Active Account Button");
    }

    public void giftCardInactivatedSuccessfullPopup() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement giftCardInActivateSuccesFully =  driver.findElement(By.xpath("Gift card inactivated successfully"));
        Assert.assertEquals(giftCardInActivateSuccesFully.getText(), "Gift card inactivated successfully");

    }

    public void giftCardactivatedSuccessfullPopup() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement giftCardInActivateSuccesFully =  driver.findElement(By.xpath("Gift card activated successfully"));
        Assert.assertEquals(giftCardInActivateSuccesFully.getText(), "Gift card activated successfully");

    }

    @FindBy(name = "Done")
    WebElement doneee;

    public void clickDoneIfItsSelectable() {
        if (doneee.isSelected()) {
            utils.log().info("Done is selectable");
        } else {
            utils.log().info("Done is not selectable");
        }
    }

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"GiveX\"]")
    WebElement giveXOption;

    public void clickGiveXBtn() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        elementClick(giveXOption, "Tapped GiveX ");
    }

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"GiveX\"])[2]")
    WebElement givexScreen;

    public void shouldSeeGiveXScreen() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(givexScreen.getText(), "GiveX");
        utils.log().info("GiveX Screen is Displayed");
    }

    public void verifyRechargeGivexAmountIsSameWithOrderScreenGivexAmount() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        givexCardNumber();
        WebElement givexValue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]"));
        String givexValueTxt = givexValue.getText();
        String givexValueTxt1 = givexValueTxt.replaceAll("[,. ]", "");
        String giveXValue = TestUtils.giveXvalue;
        String giveXValue1 = giveXValue.replaceAll("[,. ]", "");
        Assert.assertEquals(givexValueTxt1, giveXValue1);
        WebElement subTotalValue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subTotalValue1 = subTotalValue.getText();
        String subTotalValue2 = subTotalValue1.replaceAll("[A-Z$., ]", "");
        Assert.assertEquals(subTotalValue2, giveXValue1);
        utils.log().info("GiveX value is SAME - " + givexValueTxt);
    }
    public void givexCardNumber(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement givexCardNumberOrderScreen =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
        String givexCardNumberOrderScreen1 = givexCardNumberOrderScreen.getText();
        String givexCardNumberOrderScreen2 = givexCardNumberOrderScreen1.replaceAll("[A-Z-., ]","");
        String GivexCardNuumberGiveXScreen = TestUtils.GiveXCardNumber;
        String GivexCardNuumberGiveXScreen1 = GivexCardNuumberGiveXScreen.replaceAll("[A-Z$-,. ]","");
        Assert.assertEquals(givexCardNumberOrderScreen2,GivexCardNuumberGiveXScreen1);
        utils.log().info("GiveX Card Number is SAME - "+givexCardNumberOrderScreen1);
    }
}