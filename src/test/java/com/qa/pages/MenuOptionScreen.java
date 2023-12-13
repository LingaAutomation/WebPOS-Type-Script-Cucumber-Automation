package com.qa.pages;
import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.qa.pages.DriverSteup.driver;

public class MenuOptionScreen extends ClockInScreen{

    @FindBy(name = "Fire")
    private WebElement fireBtn;

    @FindBy(name = "Repeat")
    private WebElement repeatBtn;

    @FindBy(name = "Quantity")
    private WebElement quantityBtn;

    @FindBy(name = "Attach")
    private WebElement attachBtn;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Discount\"])[1]")
    private WebElement discountBtn;

    @FindBy(name = "Add Notes")
    private WebElement addNotes;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextView")
    private WebElement notesPageScreen;

    @FindBy(name = "TOGO") //for Staging
    // @FindBy(xpath = "//XCUIElementTypeButton[@name=\"To Go\"]")
    private WebElement togoBtn;

    @FindBy(name = "Open Discount")
    private WebElement openDiscountBtn;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Open Discount\"])[1]")
    private WebElement openDiscountScreen;


    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    private WebElement enterAmountField;


    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"1\"])[2]")
    private WebElement pin1ForOpenDiscount;

    @FindBy(name = "00")
    private WebElement pin00ForOpenDiscount;

    @FindBy(name = "0")
    private WebElement pin0ForOpenDiscount;

    @FindBy(name = "9")
    private WebElement pin9ForOpenDiscount;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"1\"])[3]")
    private WebElement pin1ForOpenDiscountMenu;

    @FindBy (name = "7")
    private WebElement pin7ForOpenDiscount;

    @FindBy(name = "Continue")
    private WebElement continueButtonOpenDiscount;


    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextView")
    private WebElement txtFieldForReasonOPenDiscount;

    @FindBy(name = "Apply")
    private WebElement applyButton;


    @FindBy(name = "Open-Item Discount")
    private WebElement discountAppliedOrderScreen;

    @FindBy(name = "1,00")
    private WebElement discountAmount;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Discount\"])[1]")
    private WebElement discountOrderList;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeButton[9]")
    private WebElement tab;

    @FindBy(name = "Open Modifier")
    private WebElement openModifier;

    @FindBy(name = "Change Coursing")
    private WebElement changeCoursingBtn;

    @FindBy(name = "Open Modifiers")
    private WebElement openModifiersScreen;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private WebElement txtFieldForOpenModifierScreen;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    private WebElement priceField;

    @FindBy(name = "Add")
    private WebElement addBtn;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[2]")
    private WebElement doneBtn;

    @FindBy(name = "85,00")
    private WebElement upchargeAmount;

    @FindBy(name = "Delete")
    private WebElement deleteBtn;

    String syncBtn = "//button[@class='mat-focus-indicator ion-text-center mat-button mat-button-base _mat-animation-noopable ng-star-inserted'][1]";

    @FindBy(name = "Please close the sale to sync the data")
    private WebElement pleaseCloseTheSaleToSyncTheData;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Open Item\"])[2]")
    private WebElement openItemScreen;

    @FindBy(name = "Void Item")
    private WebElement voidBtnMenuOption;

    @FindBy(name = "Linga Close")
    private WebElement lingaCloseBtn;

    @FindBy(name = "Percentage")
    private WebElement percentageCheckOption;


    public String pressMenuItems(String menu){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement e=(WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+menu+" \"]"));
        elementClick(e,"Tapped Menu Items to see Menu Option Green");
        WebElement el9 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Menu Option - "+menu+" \"]"));
        return  elementGetText(el9,"Menu Option Screen is Displayed - ");
    }

    public String pressOpenItems(String item){
        WebElement e=mergeAndFindElement("//XCUIElementTypeStaticText[@name=\""+item+" \"]","",TestUtils.XPath);
        elementClick(e,"Tapped Menu Items to see Menu Option Green");
        WebElement el9 = mergeAndFindElement("//XCUIElementTypeStaticText[@name=\"Menu Option - "+item+" \"]","",TestUtils.XPath);
        return  elementGetText(el9,"Menu Option Screen is Displayed - ");
    }

    public void pressFire(){ elementClick(fireBtn,"Tapped Fire Button"); }

    public void pressRepeatMenuOption(){elementClick(repeatBtn,"Tapped Repeat Button");}

    public void verifyRepeatedMenuItem(String menu){
        WebElement el1 =mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\""+menu+" \"])[2]","",TestUtils.XPath);
        if(el1.isDisplayed()){
            utils.log().info("Repeated Menu item is Visible");
        }else {
            utils.log().info("Repeated Menu Item is not visible");
        }
    }

    public void pressQuantityBtn(){
        elementClick(quantityBtn,"Tapped Quantity Button");
    }

    public void pressQuantityNumber(String num){
        WebElement el3 = mergeAndFindElement(num,"",TestUtils.Accessibility);
        elementClick(el3,num +"selected");
    }

    public void verifyQuantityNumber(String num){
        WebElement el4 =mergeAndFindElement(num,"",TestUtils.Accessibility);
        if(el4.isDisplayed()){
            utils.log().info(num+" Is Visible");
        }else{
            utils.log().info("Quantity is not visible");
        }
    }
    public void pressAttachBtn(){
        elementClick(attachBtn,"Tapped Attach Button");
    }

    public void pressDiscountBtn(){
        elementClick(discountBtn,"Tapped Attach Button");
    }

    public void clickDiscountInDiscountWindow(String discount1){
        WebElement discount = mergeAndFindElement(discount1,"",TestUtils.Accessibility);
        String discountTxt = discount.getText();
        elementClick(discount,"selected Discount as - "+discountTxt);
    }
public void verifyDiscountIsApplied(String discount1){
    WebElement discount = mergeAndFindElement(discount1, "", TestUtils.Accessibility);
    if (discount.isDisplayed()) {
        utils.log().info("Discount is applied - " + discount.getText());
    }else{
        utils.log().info("Discount is NOT applied - " + discount.getText());
    }
}
    public void verifyItemDiscountIsApplied(String discount1) {
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        WebElement discount = mergeAndFindElement(discount1, "", TestUtils.Accessibility);

        //   WebElement discount = mergeAndFindElement(discount1, "", TestUtils.Accessibility);

        if (discount.isDisplayed()) {
            utils.log().info("Discount is applied - " + discount.getText());
            WebElement menuPrice = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]","",TestUtils.XPath);
            String menuPriceTxt = menuPrice.getText();
            utils.log().info("Actual Menu Prize - "+menuPriceTxt);
            String menuPrice1 = menuPriceTxt.replaceAll("[A-Z$,. ]","");

            int menuAmount = Integer.parseInt(menuPrice1);
            int Discount = 282;
            int Total = menuAmount-Discount;
            String Total1 = String.valueOf(Total);
            utils.log().info("Actual Discount - "+Total1);
            WebElement totalAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]","",TestUtils.XPath);
            String totalAmountTxt = totalAmount.getText();

            String totalAmountString = totalAmountTxt.replaceAll("[A-Z$,. ]","");
            int totalAmountInt = Integer.parseInt(totalAmountString);
            String totalAmountString1 = String.valueOf(totalAmountInt);
            Assert.assertEquals(Total1,totalAmountString1);
            utils.log().info("Total of the Menu is SAME - "+Total);
            String result = " ";
            for (int i=1; i <= totalAmountString1.length(); ++i) {
                char ch = totalAmountString1.charAt(totalAmountString1.length() - i);
                if (i % 2 == 1 && i > 1) {
                    result = "," + result;
                }
                result = ch + result;

            }
            utils.log().info("Total of Amount - "+result);
        }
    }
    public void verifyDiscountIsApplied(){
driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
            WebElement discount = mergeAndFindElement("IB-AfterTax-Amount", "", TestUtils.Accessibility);

         //   WebElement discount = mergeAndFindElement(discount1, "", TestUtils.Accessibility);

            if (discount.isDisplayed()) {
                utils.log().info("Discount is applied - " + discount.getText());
                WebElement menuPrice = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]","",TestUtils.XPath);
                String menuPriceTxt = menuPrice.getText();
                utils.log().info("Actual Menu Prize - "+menuPriceTxt);
                String menuPrice1 = menuPriceTxt.replaceAll("[A-Z$,. ]","");

                int menuAmount = Integer.parseInt(menuPrice1);
                int Discount = 282;
                int Total = menuAmount-Discount;
                String Total1 = String.valueOf(Total);
                utils.log().info("Actual Discount - "+Total1);
                WebElement totalAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]","",TestUtils.XPath);
                String totalAmountTxt = totalAmount.getText();

                String totalAmountString = totalAmountTxt.replaceAll("[A-Z$,. ]","");
                int totalAmountInt = Integer.parseInt(totalAmountString);
                String totalAmountString1 = String.valueOf(totalAmountInt);
                Assert.assertEquals(Total1,totalAmountString1);
                utils.log().info("Total of the Menu is SAME - "+Total);
                String result = " ";
                for (int i=1; i <= totalAmountString1.length(); ++i) {
                    char ch = totalAmountString1.charAt(totalAmountString1.length() - i);
                    if (i % 2 == 1 && i > 1) {
                        result = "," + result;
                    }
                    result = ch + result;

                }
                utils.log().info("Total of Amount - "+result);
            }
    }


    public String verifyAddNotesScreen(){
        return elementGetText(addNotes,"Add Notes Screen Is Displayed - ");
    }

    public void pressAddNotesReason(String reason){
        WebElement el2 = mergeAndFindElement(reason,"",TestUtils.Accessibility);
        elementClick(el2,"Tapped Reason  "+reason);

        String data=notesPageScreen.getText();
        if(data.equalsIgnoreCase(reason)){
            utils.log().info(reason +"Add Notes Reason is Tapped");
        }else{
            utils.log().info("Add Notes Reason are not Tapped");
        }

    }

    public void verifyAddNotesAddOnOrderScreen(String reason){
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        WebElement e=mergeAndFindElement(reason,"",TestUtils.Accessibility);
        if(e.isDisplayed()){
            utils.log().info(reason +"Add reason Is Applied on Order Screen");
        }else{
            utils.log().info("Add reason is applied on Order Screen");
        }
    }

    public void pressTogoBtn(){ elementClick(togoBtn,"Tapped Togo Button"); }

    public void pressOpenDiscount(){
        elementClick(openDiscountBtn,"Tapped Open Discount Button");
    }

    public void getOpenDiscountScreen(){
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        if(openDiscountScreen.isDisplayed()){
            utils.log().info("Open Discount Screen Is Visible");
        }else{
            utils.log().info("Open Discount Is not Visible");
        }
    }

    public void passAmountAndReason(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        elementClick(enterAmountField,"Tapped amount field");
        elementClick(pin1ForOpenDiscount,"Tapped pin 1 for open Discount ");
        elementClick(pin0ForOpenDiscount,"Tapped pin 0 for Open Discount");
        elementClick(pin00ForOpenDiscount,"Tapped pin 00 For open Discount");
        elementClick(continueButtonOpenDiscount,"Tapped continue button for Open Discount");
        txtFieldForReasonOPenDiscount.sendKeys("Open Item");
        elementClick(enterAmountField,"Tapped enter Amount Field");
        elementClick(lingaCloseBtn,"Tapped Close Button");
        elementClick(applyButton,"Tapped Apply Button");
    }
    public void passAmountAndReasonMenuOptionForSafetyPercentageValue(String name){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        click(enterAmountField,"Tapped amount field");
        pressPin2();
        pressPin0();
        pressPin00();
        elementClick(continueButtonOpenDiscount,"Tapped continue button for Open Discount");
        txtFieldForReasonOPenDiscount.sendKeys("Open Item");
        elementClick(enterAmountField,"Tapped enter Amount Field");
        elementClick(lingaCloseBtn,"Tapped Close Button");
        WebElement e1=mergeAndFindElement(name,"",TestUtils.Accessibility);
        elementClick(e1,"Tapped - "+ name);
        elementClick(applyButton,"Tapped Apply Button");
    }
    public void passAmountAndReasonMenuOptionForSafetyPercentageDecimalValue(String name){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        click(enterAmountField,"Tapped amount field");
        pressPin2();
        pressPin0();
        pressPin5();
        pressPin0();
        elementClick(continueButtonOpenDiscount,"Tapped continue button for Open Discount");
        txtFieldForReasonOPenDiscount.sendKeys("Open Item");
        elementClick(enterAmountField,"Tapped enter Amount Field");
        elementClick(lingaCloseBtn,"Tapped Close Button");
        WebElement e1=mergeAndFindElement(name,"",TestUtils.Accessibility);
        elementClick(e1,"Tapped - "+ name);
        elementClick(applyButton,"Tapped Apply Button");
    }
    public void passAmountAndReasonMenuOptionAsPercentage(String name){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        elementClick(percentageCheckOption,"Tapped Percentage Button");
        elementClick(enterAmountField,"Tapped amount field");
        pressPin2();
        elementClick(pin1ForOpenDiscountMenu,"Tapped pin 1");
        pressPin0();
        pressPin0();
        elementClick(continueButtonOpenDiscount,"Taped continue for open Discount");
//        WebDriverWait wait = new WebDriverWait(driver,3);
//       wait.until(ExpectedConditions.visibilityOfElementLocated((WebElement) By.xpath("")));
        txtFieldForReasonOPenDiscount.sendKeys("Open Item");
        elementClick(enterAmountField,"Tapped enter Amount Field");
        elementClick(lingaCloseBtn,"Tapped Close Button");
        WebElement e1=mergeAndFindElement(name,"",TestUtils.Accessibility);
        elementClick(e1,"Tapped - "+ name);
        elementClick(applyButton,"Tapped Apply Button");
    }
    @FindBy(xpath ="//*[@name=\"Hide keyboard\"]")
    private WebElement hideKeyboardButton;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"1\"])[2]")
    private WebElement pin1ForOpenDiscountMenu1;
    public void passAmountAndReasonMenuOptionAsPercentage1(String name){
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        elementClick(percentageCheckOption,"Tapped Percentage Button");
        elementClick(enterAmountField,"Tapped amount field");

       // elementClick(pin1ForOpenDiscountMenu1,"Tapped pin 1");
        pressPin2();
        pressPin2();
        pressPin3();
        pressPin2();
        elementClick(continueButtonOpenDiscount,"Taped continue for open Discount");
//        WebDriverWait wait = new WebDriverWait(driver,3);
//       wait.until(ExpectedConditions.visibilityOfElementLocated((WebElement) By.xpath("")));
        txtFieldForReasonOPenDiscount.sendKeys("Open Item");
       elementClick( hideKeyboardButton,"Selected - "+hideKeyboardButton.getText());
        WebElement e1= (WebElement) driver.findElements(By.xpath(name));
        elementClick(e1,"Tapped - "+ name);
        elementClick(applyButton,"Tapped Apply Button");
    }
    public String verifyDiscountAppliedOnOrderScreen(){
        return elementGetText(discountAppliedOrderScreen,"Discount is Added - ");
    }
    public void pressOpenModifierBtn(){
        elementClick(openModifier,"Tapped Open Modifier Button");
    }

    public void pressChangeCoursingBtn(){
        elementClick(changeCoursingBtn,"Tapped Open Modifier Button");
    }
    public String verifyOpenModifiersScreen(){
        return elementGetText(openModifiersScreen,"Open Modifiers Screen is displayed - ");
    }

    public void verifyChangeCoursing(String courseee){
        WebElement coursingName = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]","",TestUtils.XPath);
           String coursingNameTxt = coursingName.getText();
        if(coursingNameTxt.equalsIgnoreCase(courseee)){
            utils.log().info("Coursing name is Same - "+courseee);
        }else{
            utils.log().info("Coursing name is NOT Same - ");
        }
    }
    public void passNamePriceApplyTax(String modify){
        txtFieldForOpenModifierScreen.sendKeys(modify);
        elementClick(priceField,"Tapped price field");
        pressPin2();
        pressPin0();
        pressPin0();
        pressContinueBarTabLoginBtn();
        elementClick(addBtn,"Tapped Add Button");
    }

    public void passNamePriceApplyTaxForMenu(String modify){
        txtFieldForOpenModifierScreen.sendKeys(modify);
        elementClick(priceField,"Tapped price field");
        pressPin2();
        pressPin0();
        pressPin0();
        pressContinueBarTabLoginBtn();
        elementClick(addBtn,"Tapped Add Button");
    }
    public void getModifierAddedOnOpenModifier(String Modify) {

        try{
            WebElement e1 = mergeAndFindElement(Modify,"",TestUtils.Accessibility);
            if (e1.isDisplayed()) {
                utils.log().info(Modify + " - Modifiers Added in Open Modifier screen");
            } }catch(Exception e) {
            utils.log().info("Modifiers not Added in Open Modifier screen"); }
    }

    public void clickDone(){
        try{
            elementClick(doneBtn,"Tapped Done Button");}
        catch (Exception e){}
    }
    public void verifyModifyAddedOnOrderList(String modify){
        WebElement e=mergeAndFindElement("//XCUIElementTypeStaticText[@name=\" "+modify+"\"]","",TestUtils.XPath);
        if(e.isDisplayed()){
            utils.log().info(modify+" - Open Modifies is Added");
        }else{
            utils.log().info("Open Modifiers is Not Added");
        }
    }
    public void swipeModifiersForDeleteInOpenModifyScreen() throws InterruptedException {

        swipe(580,248,506,248,5000);
        elementClick(deleteBtn,"Tapped Delete Button");

    }
    public void swipeModifierForDeleteInOrderScreen() throws InterruptedException {
        swipe( 32, 320, -42, 320,5000);
        elementClick(deleteBtn,"Tapped Delete Button");
    }

    public void getAmount(String numb){
        WebElement e = mergeAndFindElement(numb,"",TestUtils.Accessibility);
        if(e.isDisplayed()){
            utils.log().info(numb + " Upcharge Amount Added");
        }else{
            utils.log().info("Upcharge Amount Not Added");
        }
    }

    public void pressSyncBtn() throws InterruptedException {

        elementClick(syncBtn,"Tapped Sync Button");
        Thread.sleep(3000);
    }

    public String getPopupTxt(){
        return elementGetText(pleaseCloseTheSaleToSyncTheData,"Close then Sale to sync the Data - ");
    }
    public String verifyOpenItemScreen(){
        return elementGetText(openItemScreen,"Open item Screen txt is Displayed - ");
    }

    public void pressVoidBtnMenuOperation(){
        elementClick(voidBtnMenuOption,"Tapped void button");
    }

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    private WebElement backBtnMenu;
    public void clickBackBtn(){
elementClick(backBtnMenu,"Back Button selected");
    }
}
