package com.qa.pages;

import com.qa.utils.TestUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MenuOptionScreen extends ClockInScreen{

    public  WebDriver driver;

    public MenuOptionScreen(WebDriver driver) {

        super(TestUtils.driver);

        this.driver = TestUtils.driver;

        PageFactory.initElements(this.driver,this);
    }

    @FindBy(xpath = "//button[.='Fire']")
    private WebElement fireBtn;

    @FindBy(xpath = "//button[contains(.,'Repeat')]")
    private WebElement repeatBtn;

    @FindBy(xpath = "//label[.='Quantity']")
    private WebElement quantityBtn;

    @FindBy(xpath = "//label[.='Attach']")
    private WebElement attachBtn;

    @FindBy(xpath = "//label[.='Discounts']")
    private WebElement discountBtn;

    @FindBy(xpath = "//p[contains(.,'Add Notes')]")
    private WebElement addNotes;

    @FindBy(xpath = "")
    private WebElement notesPageScreen;

    @FindBy(xpath = "TOGO") //for Staging
    // @FindBy(xpath = "//XCUIElementTypeButton[@name=\"To Go\"]")
    private WebElement togoBtn;

    @FindBy(xpath = "//label[.='Open Discount']")
    private WebElement openDiscountBtn;

    @FindBy(xpath = "//p[.='Open Discount']")
    private WebElement openDiscountScreen;


    @FindBy(xpath = "//ion-col[contains(@class,'openDiscount__content_grid')]//input")
    private WebElement enterAmountField;


    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"1\"])[2]")
    private WebElement pin1ForOpenDiscount;

    @FindBy(xpath = "00")
    private WebElement pin00ForOpenDiscount;

    @FindBy(xpath = "0")
    private WebElement pin0ForOpenDiscount;

    @FindBy(xpath = "9")
    private WebElement pin9ForOpenDiscount;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"1\"])[3]")
    private WebElement pin1ForOpenDiscountMenu;

    @FindBy (xpath = "7")
    private WebElement pin7ForOpenDiscount;

    @FindBy(xpath = "//button[contains(.,'Continue')]")
    private WebElement continueButtonOpenDiscount;


    @FindBy(xpath = "//textarea[contains(@class,'openDiscount__content_grid')]")
    private WebElement txtFieldForReasonOPenDiscount;

    @FindBy(xpath = "//button[contains(.,'Apply')]")
    private WebElement applyButton;


    @FindBy(xpath = "//div[@class='discount-section']//div[contains(.,'Item Discount')]")
    private WebElement discountAppliedOrderScreen;

    @FindBy(xpath = "1,00")
    private WebElement discountAmount;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Discount\"])[1]")
    private WebElement discountOrderList;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeButton[9]")
    private WebElement tab;

    @FindBy(xpath = "//label[.='Open Modifier']")
    private WebElement openModifier;

    @FindBy(xpath = "//label[.='Change Coursing']")
    private WebElement changeCoursingBtn;

    @FindBy(xpath = "//div[.='Open Modifier']")
    private WebElement openModifiersScreen;

    @FindBy(xpath = "//div[contains(@class,'openModifier__content')]//input")
    private WebElement txtFieldForOpenModifierScreen;

    @FindBy(xpath = "//ion-row[contains(@class,'openModifier__content')]//label[.='Price']/..//input")
    private WebElement priceField;

    @FindBy(xpath = "//button[.='Add']")
    private WebElement addBtn;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[2]")
    private WebElement doneBtn;

    @FindBy(xpath = "85,00")
    private WebElement upchargeAmount;

    @FindBy(xpath = "Delete")
    private WebElement deleteBtn;

    @FindBy(xpath = "Sync")
    private WebElement syncBtn;

    @FindBy(xpath = "Please close the sale to sync the data")
    private WebElement pleaseCloseTheSaleToSyncTheData;

    @FindBy(xpath = "//p[.='Open Item']")
    private WebElement openItemScreen;

    @FindBy(xpath = "//button[.='Void Item']")
    private WebElement voidBtnMenuOption;

    @FindBy(xpath = "Linga Close")
    private WebElement lingaCloseBtn;

    @FindBy(xpath = "//button[contains(.,'Percentage')]")
    private WebElement percentageCheckOption;




    public String pressMenuItems(String menu){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement e=(WebElement) driver.findElement(By.xpath("(//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']//div[text()='"+menu+"'])[1]"));
        elementClick(e,"Tapped Menu Items to see Menu Option Green");
        WebElement el9 = (WebElement) driver.findElement(By.xpath("//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']//div[text()='"+menu+"']"));
        TestUtils.MenuItem_Name = menu;
        return  elementGetText(el9,"Text");
    }

    public String pressOpenItems(String item){
        WebElement e=mergeAndFindElement("//XCUIElementTypeStaticText[@name=\""+item+" \"]","",TestUtils.Accessibility);
        elementClick(e,"Tapped Menu Items to see Menu Option Green");
        WebElement el9 = mergeAndFindElement("//XCUIElementTypeStaticText[@name=\"Menu Option - "+item+" \"]","",TestUtils.Accessibility);
        return  elementGetText(el9,"Text");
    }

    public void pressFire(){ elementClick(fireBtn,"Tapped Fire Button"); }

    public void pressRepeatMenuOption(){elementClick(repeatBtn,"Tapped Repeat Button");}

    public void verifyRepeatedMenuItem(String menu){
        WebElement el1 = driver.findElement(By.xpath("(//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']//div[text()='"+menu+"'])[2]"));
        if(el1.isDisplayed()){
//            utils.log().info("Repeated Menu item is Visible");
        }else {
//            utils.log().info("Repeated Menu Item is not visible");
        }
    }

    public void pressQuantityBtn(){
        elementClick(quantityBtn,"Tapped Quantity Button");
    }

    public void pressQuantityNumber(String num){
        WebElement el3 = driver.findElement(By.xpath("//span[.='"+num+"']"));
        elementClick(el3,num +"selected");
    }

    public void verifyQuantityNumber(String num){
        WebElement el4 = driver.findElement(By.xpath("//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']//div[text()='mongo test']/../div[.='"+num+"']"));
        if(el4.isDisplayed()){
//            utils.log().info(num+" Is Visible");
        }else{
//            utils.log().info("Quantity is not visible");
        }
    }

    public void verifyQuantityNumber1(String num){
        String Menu = TestUtils.MenuItem_Name;
        WebElement el4 = driver.findElement(By.xpath("//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']//div[text()='"+Menu+"']/../div[.='"+num+"']"));
        if(el4.isDisplayed()){
//            utils.log().info(num+" Is Visible");
        }else{
//            utils.log().info("Quantity is not visible");
        }
    }
    public void pressAttachBtn(){
        elementClick(attachBtn,"Tapped Attach Button");
    }

    public void pressDiscountBtn(){
        elementClick(discountBtn,"Tapped Attach Button");
    }

    public void clickDiscountInDiscountWindow(String discount1){
        WebElement discount = driver.findElement(By.xpath("//button[contains(.,'"+discount1+"')]"));
        String discountTxt = discount.getText();
        elementClick(discount,"selected Discount as - "+discountTxt);
    }
public void verifyDiscountIsApplied(String discount1){
    WebElement discount = driver.findElement(By.xpath("//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']/..//div[@class='discount-section']//div[.='"+discount1+"']"));
    if (discount.isDisplayed()) {
//        utils.log().info("Discount is applied - " + discount.getText());
    }else{
//        utils.log().info("Discount is NOT applied - " + discount.getText());
    }
}
    public void verifyItemDiscountIsApplied(String discount1) {
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        WebElement discount = mergeAndFindElement(discount1, "", TestUtils.Accessibility);

        //   WebElement discount = mergeAndFindElement(discount1, "", TestUtils.Accessibility);

        if (discount.isDisplayed()) {
            utils.log().info("Discount is applied - " + discount.getText());
            WebElement menuPrice = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]","",TestUtils.Accessibility);
            String menuPriceTxt = menuPrice.getText();
            utils.log().info("Actual Menu Prize - "+menuPriceTxt);
            String menuPrice1 = menuPriceTxt.replaceAll("[A-Z$,. ]","");

            int menuAmount = Integer.parseInt(menuPrice1);
            int Discount = 282;
            int Total = menuAmount-Discount;
            String Total1 = String.valueOf(Total);
            utils.log().info("Actual Discount - "+Total1);
            WebElement totalAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]","",TestUtils.Accessibility);
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
                WebElement menuPrice = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]","",TestUtils.Accessibility);
                String menuPriceTxt = menuPrice.getText();
                utils.log().info("Actual Menu Prize - "+menuPriceTxt);
                String menuPrice1 = menuPriceTxt.replaceAll("[A-Z$,. ]","");

                int menuAmount = Integer.parseInt(menuPrice1);
                int Discount = 282;
                int Total = menuAmount-Discount;
                String Total1 = String.valueOf(Total);
                utils.log().info("Actual Discount - "+Total1);
                WebElement totalAmount = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[6]","",TestUtils.Accessibility);
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
        return elementGetText(addNotes,"Text");
    }

    public void pressAddNotesReason(String reason){
        WebElement el2 = driver.findElement(By.xpath("//textarea[contains(@class,'element mat-form-field')]"));
        elementClick(el2,"Tapped Reason  "+reason);
        el2.sendKeys(reason);

//        String data=notesPageScreen.getText();
//        if(data.equalsIgnoreCase(reason)){
////            utils.log().info(reason +"Add Notes Reason is Tapped");
//        }else{
////            utils.log().info("Add Notes Reason are not Tapped");
//        }

    }

    public void verifyAddNotesAddOnOrderScreen(String reason){
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        WebElement e = driver.findElement(By.xpath("//div[@id='react-orders-render']//div//div//div//div//div[@class='menu-section orderlist-flex ']/..//div[text()='"+reason+"']"));
        if(e.isDisplayed()){
//            utils.log().info(reason +"Add reason Is Applied on Order Screen");
        }else{
//            utils.log().info("Add reason is applied on Order Screen");
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
//       elementClick( hideKeyboardButton,"Selected - "+hideKeyboardButton.getText());
        WebElement e1 = driver.findElement(By.xpath("//button[contains(.,'"+name+"')]"));
        elementClick(e1,"Tapped - "+ name);
        elementClick(applyButton,"Tapped Apply Button");
    }
    public String verifyDiscountAppliedOnOrderScreen(){
        return elementGetText(discountAppliedOrderScreen,"Text");
    }
    public void pressOpenModifierBtn(){
        elementClick(openModifier,"Tapped Open Modifier Button");
    }

    public void pressChangeCoursingBtn(){
        elementClick(changeCoursingBtn,"Tapped Open Modifier Button");
    }
    public String verifyOpenModifiersScreen(){
        return elementGetText(openModifiersScreen,"Text");
    }

    public void verifyChangeCoursing(String courseee){
        WebElement coursingName = driver.findElement(By.xpath("//p[contains(.,'"+courseee+"')]"));
           String coursingNameTxt = coursingName.getText();
        if(coursingNameTxt.equalsIgnoreCase(courseee)){
//            utils.log().info("Coursing name is Same - "+courseee);
        }else{
//            utils.log().info("Coursing name is NOT Same - ");
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
            WebElement e1 = driver.findElement(By.xpath("//li[contains(.,'"+Modify+"')]"));
            if (e1.isDisplayed()) {
//                utils.log().info(Modify + " - Modifiers Added in Open Modifier screen");
            } }catch(Exception e) {
//            utils.log().info("Modifiers not Added in Open Modifier screen");
        }
    }

    public void clickDone(){
        try{
            elementClick(doneBtn,"Tapped Done Button");}
        catch (Exception e){}
    }
    public void verifyModifyAddedOnOrderList(String modify){
        WebElement e = driver.findElement(By.xpath("//div[@class='modifier-section']//div[text()='"+modify+"']"));
        if(e.isDisplayed()){
//            utils.log().info(modify+" - Open Modifies is Added");
        }else{
//            utils.log().info("Open Modifiers is Not Added");
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
        Thread.sleep(2000);
    }

    public String getPopupTxt(){
        return elementGetText(pleaseCloseTheSaleToSyncTheData,"Text");
    }
    public String verifyOpenItemScreen(){
        return elementGetText(openItemScreen,"Text");
    }

    public void pressVoidBtnMenuOperation(){
        elementClick(voidBtnMenuOption,"Tapped void button");
    }

    @FindBy(xpath = "")
    private WebElement backBtnMenu;
    public void clickBackBtn(){
elementClick(backBtnMenu,"Back Button selected");
    }
}
