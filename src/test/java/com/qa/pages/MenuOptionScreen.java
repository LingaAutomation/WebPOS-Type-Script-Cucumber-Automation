package com.qa.pages;
import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class MenuOptionScreen extends ClockInScreen{

    @FindBy(xpath = "//label[.='Fire']")
    private WebElement fireBtn;

    @FindBy(xpath = "//label[.='Repeat']")
    private WebElement repeatBtn;

    @FindBy(xpath = "//label[.='Quantity']")
    private WebElement quantityBtn;

    @FindBy(xpath = "//label[.='Attach']")
    private WebElement attachBtn;

    @FindBy(xpath = "//label[.='Discounts']")
    private WebElement discountBtn;

    @FindBy(xpath = "//p[.=' Add Notes ']")
    private WebElement addNotes;

    @FindBy(xpath = "//div[@class='textarea-row']")
    private WebElement notesPageScreen;

    @FindBy(xpath = "//label[.='TOGO']") //for Staging
    // @FindBy(xpath = "//XCUIElementTypeButton[@name=\"To Go\"]")
    private WebElement togoBtn;

    @FindBy(xpath = "//span[contains(.,'Open Discount')]")
    private WebElement openDiscountBtn;

    @FindBy(xpath = "//p[contains(.,'Open Discount')]")
    private WebElement openDiscountScreen;


    @FindBy(xpath = "//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')]")
    private WebElement enterAmountField;

//    @FindBy(xpath = "//input[@id='mat-input-14']")
//    private WebElement enterAmountField1;
//
//    @FindBy(xpath = "//input[@id='mat-input-22']")
//    private WebElement enterAmountField2;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"1\"])[2]")
    private WebElement pin1ForOpenDiscount;

    @FindBy(name = "00")
    private WebElement pin00ForOpenDiscount;

    @FindBy(name = "0")
    private WebElement pin0ForOpenDiscount;

    @FindBy(name = "9")
    private WebElement pin9ForOpenDiscount;

    @FindBy(xpath = "(//ion-col//button[contains(@class,'mat-focus-indicator')]//span[contains(.,'1')])[7]")
    private WebElement pin1ForOpenDiscountMenu;

    @FindBy (name = "7")
    private WebElement pin7ForOpenDiscount;

    @FindBy(xpath = "//button[contains(.,' Continue ')]")
    private WebElement continueButtonOpenDiscount;


    @FindBy(xpath = "//textarea[contains(@class,'mat-input-element mat-form-field-autofill-control openDiscount__content_grid-row-col-reason ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')]")
    private WebElement txtFieldForReasonOPenDiscount;

//    @FindBy(xpath = "//textarea[@id='mat-input-15']")
//    private WebElement txtFieldForReasonOPenDiscount1;
//
//    @FindBy(xpath = "//textarea[@id='mat-input-23']")
//    private WebElement txtFieldForReasonOPenDiscount2;

    @FindBy(xpath = "//span[contains(.,' Apply ')]")
    private WebElement applyButton;


    @FindBy(xpath = "//div[contains(@class,'discount-section')]//div[contains(.,'Open-Item Discount')]")
    private WebElement discountAppliedOrderScreen;

    @FindBy(name = "1,00")
    private WebElement discountAmount;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Discount\"])[1]")
    private WebElement discountOrderList;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeButton[9]")
    private WebElement tab;

    @FindBy(xpath = "//label[contains(.,'Open Modifier')]")
    private WebElement openModifier;

    @FindBy(xpath = "//label[contains(.,'Change Coursing')]")
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

    String pleaseCloseTheSaleToSyncTheData = "//p[contains(.,'Please close the sale to sync the data')]";

    @FindBy(xpath = "//p[contains(.,'Open Item')]")
    private WebElement openItemScreen;

    @FindBy(name = "Void Item")
    private WebElement voidBtnMenuOption;

    @FindBy(name = "Linga Close")
    private WebElement lingaCloseBtn;

    @FindBy(xpath = "//span[contains(.,' Percentage ')]")
    private WebElement percentageCheckOption;

    public String txt;

//    public MenuOptionScreen() {
//        super(TestUtils.driver);
//    }

    public String pressMenuItems(String menu) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement e= driver.findElement(By.xpath("//div[contains(@class,'p-col-4 orderlist-menuname')]"));
        utils.log().info(e.getText());
        if(e.getText().equals(menu)) {
            elementClick(e, "Tapped Menu Items to see Menu Option Screen");
            Thread.sleep(1000);
            WebElement el9 = driver.findElement(By.xpath("//p[contains(.,' Menu Option - "+menu+" ')]"));
            txt =el9.getText();
            utils.log().info(txt);
        }else{
            utils.log().info("Not Displayed Menu Option Screen");
        }
        return txt;
    }

    public String pressOpenItems(String item){
        WebElement e=driver.findElement(By.xpath("(//div[contains(@class,'p-col-4 orderlist-menuname')])[2]"));
        utils.log().info(e.getText());
        Assert.assertEquals(e.getText(),item);
        elementClick(e,"Tapped Menu Items to see Menu Option Green");
        WebElement el9 = driver.findElement(By.xpath("//p[contains(.,' Menu Option - "+item+" ')]"));
        if(el9.isDisplayed()){
            utils.log().info("Menu Option screen is displayed");
        }else{
            utils.log().info("Menu Option screen is NOT displayed");
        }
        return  elementGetText(el9,"Menu Option Screen is Displayed - ");
    }

    public void pressFire(){ elementClick(fireBtn,"Tapped Fire Button"); }

    public void pressRepeatMenuOption(){elementClick(repeatBtn,"Tapped Repeat Button");}

    public void verifyRepeatedMenuItem(String menu) throws InterruptedException {
        Thread.sleep(2000);
        WebElement el1 = driver.findElement(By.xpath("(//div[@class='p-col-4 orderlist-menuname'])[2]"));
        Assert.assertEquals(el1.getText(),menu);
    }

    public void pressQuantityBtn(){
        elementClick(quantityBtn,"Tapped Quantity Button");
    }

    public void pressQuantityNumber(String num) throws InterruptedException {
        Thread.sleep(2000);
        WebElement el3 =driver.findElement(By.xpath("//button[.='"+num+"']"));
        elementClick(el3,num +"selected");
    }

    public void verifyQuantityNumber(String num){
        WebElement el4 = driver.findElement(By.xpath("//div[contains(@class,'p-col-2 orderlist-qty')]"));
      Assert.assertEquals(el4.getText(),num);
      utils.log().info("Quantity is Incresed - "+num);
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
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
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
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
        WebElement el2 = driver.findElement(By.xpath("//button[.=' "+reason+" ']"));
        elementClick(el2,"Tapped Reason  "+reason);

//        String data=notesPageScreen.getText();
//        if(data.equalsIgnoreCase(reason)){
//            utils.log().info(reason +"Add Notes Reason is Tapped - "+reason);
//        }else{
//            utils.log().info("Add Notes Reason are not Tapped - "+data);
//            int w = 1/0;
//        }

    }

    public void verifyAddNotesAddOnOrderScreen(String reason){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement e= driver.findElement(By.xpath("//div[.='"+reason+"']"));
        if(e.isDisplayed()){
            utils.log().info(reason +"Add reason Is Applied on Order Screen");
        }else{
            utils.log().info("Add reason is applied on Order Screen");
            int w = 1/0;
        }
    }

    public void pressTogoBtn(){ elementClick(togoBtn,"Tapped Togo Button"); }

    public void pressOpenDiscount(){
        elementClick(openDiscountBtn,"Tapped Open Discount Button");
    }

    public void getOpenDiscountScreen(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        if(openDiscountScreen.isDisplayed()){
            utils.log().info("Open Discount Screen Is Visible");
        }else{
            utils.log().info("Open Discount Is not Visible");
        }
    }

    public void passAmountAndReason(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
    public void passAmountAndReasonMenuOptionForSafetyPercentageValue(String name) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(500);
        click(enterAmountField,"Tapped amount field");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'2')])","Selected - 2");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped pin 0");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped in 0");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped in 0");
        elementClick(continueButtonOpenDiscount,"Tapped continue button for Open Discount");
        txtFieldForReasonOPenDiscount.sendKeys("Open Item");
//        elementClick(hideKeyboardButton,"Hide Keyboard");
//        elementClick(enterAmountField,"Tapped enter Amount Field");
//        elementClick(lingaCloseBtn,"Tapped Close Button");

        elementClick("//span[contains(.,' "+name+" ')]","Tapped - "+ name);
        elementClick(applyButton,"Tapped Apply Button");
    }

    public void passAmountAndReasonMenuOptionForSafetyPercentageValue1(String name) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(500);
        click(enterAmountField,"Tapped amount field");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'2')])","Selected - 2");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped pin 0");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped in 0");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped in 0");
        elementClick(continueButtonOpenDiscount,"Tapped continue button for Open Discount");
        txtFieldForReasonOPenDiscount.sendKeys("Open Item");
//        elementClick(hideKeyboardButton,"Hide Keyboard");
//        elementClick(enterAmountField,"Tapped enter Amount Field");
//        elementClick(lingaCloseBtn,"Tapped Close Button");

        elementClick("//span[contains(.,' "+name+" ')]","Tapped - "+ name);
        elementClick(applyButton,"Tapped Apply Button");
    }

    public void passAmountAndReasonMenuOptionForSafetyPercentageDecimalValue(String name) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(500);
        click(enterAmountField,"Tapped amount field");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'2')])","Selected - 2");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped pin 0");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'5')])","Tapped in 5");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped in 0");

        elementClick(continueButtonOpenDiscount,"Tapped continue button for Open Discount");
        txtFieldForReasonOPenDiscount.sendKeys("Open Item");
//        elementClick(enterAmountField,"Tapped enter Amount Field");
//        elementClick(lingaCloseBtn,"Tapped Close Button");
//        WebElement e1=mergeAndFindElement(name,"",TestUtils.Accessibility);
        elementClick("//span[contains(.,' "+name+" ')]","Tapped - "+ name);
        elementClick(applyButton,"Tapped Apply Button");
    }

    public void passAmountAndReasonMenuOptionForSafetyPercentageDecimalValue1(String name) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(500);
        click(enterAmountField,"Tapped amount field");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'2')])","Selected - 2");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped pin 0");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'5')])","Tapped in 5");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped in 0");

        elementClick(continueButtonOpenDiscount,"Tapped continue button for Open Discount");
        txtFieldForReasonOPenDiscount.sendKeys("Open Item");
//        elementClick(enterAmountField,"Tapped enter Amount Field");
//        elementClick(lingaCloseBtn,"Tapped Close Button");
//        WebElement e1=mergeAndFindElement(name,"",TestUtils.Accessibility);
        elementClick("//span[contains(.,' "+name+" ')]","Tapped - "+ name);
        elementClick(applyButton,"Tapped Apply Button");
    }

    public void passAmountAndReasonMenuOptionForSafetyPercentageDecimalValue2(String name) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(500);
        click(enterAmountField,"Tapped amount field");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'2')])","Selected - 2");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped pin 0");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'5')])","Tapped in 5");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped in 0");

        elementClick(continueButtonOpenDiscount,"Tapped continue button for Open Discount");
        txtFieldForReasonOPenDiscount.sendKeys("Open Item");
//        elementClick(enterAmountField,"Tapped enter Amount Field");
//        elementClick(lingaCloseBtn,"Tapped Close Button");
//        WebElement e1=mergeAndFindElement(name,"",TestUtils.Accessibility);
        elementClick("//span[contains(.,' "+name+" ')]","Tapped - "+ name);
        elementClick(applyButton,"Tapped Apply Button");
    }


    public void passAmountAndReasonMenuOptionAsPercentage(String name){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        elementClick(percentageCheckOption,"Tapped Percentage Button");
        click(enterAmountField,"Tapped amount field");
//        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'2')])","Selected - 2");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'1')])","Tapped pin 0");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped in 5");
        elementClick("(//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//span[contains(.,'0')])","Tapped in 0");

        elementClick(continueButtonOpenDiscount,"Tapped continue button for Open Discount");
        txtFieldForReasonOPenDiscount.sendKeys("Open Item");
//        elementClick(enterAmountField,"Tapped enter Amount Field");
//        elementClick(lingaCloseBtn,"Tapped Close Button");
//        WebElement e1=mergeAndFindElement(name,"",TestUtils.Accessibility);
        elementClick("//span[contains(.,' "+name+" ')]","Tapped - "+ name);
        elementClick(applyButton,"Tapped Apply Button");
    }
    @FindBy(xpath ="//*[@name='Hide keyboard']")
    private WebElement hideKeyboardButton;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"1\"])[2]")
    private WebElement pin1ForOpenDiscountMenu1;
    public void passAmountAndReasonMenuOptionAsPercentage1(String name){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
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
        WebElement e1=  driver.findElement(By.xpath(name));
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
        WebElement e=driver.findElement(By.xpath("(//div[@class='modifier-section']//div[contains(.,'"+modify+"')])[1]"));
        if(e.isDisplayed()){
            utils.log().info(modify+" - Modifies is Added");
        }else{
            utils.log().info("Modifiers is Not Added");
        }
    }
   public WebElement e;
    public void verifyModifyAddedOnOrderList1(String modify){
        try{
         e=driver.findElement(By.xpath("(//div[@class='modifier-section']//div[contains(.,'"+modify+"')])[2]"));
        if(e.isDisplayed()) {
            utils.log().info(modify + " - Modifies is Added");
            Assert.assertEquals(e.getText(),modify);
        }
        }catch (Exception w){
            utils.log().info("Modifiers is Not Added");

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
        WebElement e = driver.findElement(By.xpath("//div[@id='os_subTotalStr']//input"));

            Assert.assertEquals(e.getAttribute("value"),numb);
        utils.log().info(numb + " Upcharge Amount Added");
    }

    public void pressSyncBtn() throws InterruptedException {

        elementClick(syncBtn,"Tapped Sync Button");
        Thread.sleep(3000);
    }

    public String getPopupTxt(){
        return elementGetText(convertWebElement(pleaseCloseTheSaleToSyncTheData),"Close then Sale to sync the Data - ");
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
