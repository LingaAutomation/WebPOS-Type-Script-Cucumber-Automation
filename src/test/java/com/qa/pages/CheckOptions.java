package com.qa.pages;

import com.qa.pages.OrderManagementScreen;
import com.qa.utils.TestUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class CheckOptions extends OrderManagementScreen {

    @FindBy(xpath = "//span[.='Open Cash Drawer']")
    WebElement openCashDrawerBtn;

    @FindBy(xpath = "//label[contains(.,'fireCoursing')]") //Nov 16
    WebElement fireCoursingBtn;

    @FindBy(xpath = "//p[contains(.,'fireCoursing')]")
    WebElement fireCoursingTxt;

    @FindBy(xpath = "//label[contains(.,'Gratuity')]")
    WebElement gratuityBtn;

    @FindBy(xpath = "//ion-title[contains(.,'Add Gratuity')]")
    WebElement addGratuityScreen;

    @FindBy(xpath = "//button[.=' Fixed Gratuity ']")
    WebElement gratuityFixedBtn;

    @FindBy(xpath = "//button[.=' Gratuity Varying ']")
    WebElement gratuityVaryingBtn;

    @FindBy(xpath = "//input[contains(@placeholder,'Enter value between 5.0-15.0')]")
    WebElement passPercentageValue;

    @FindBy(xpath = "//ion-title[contains(.,'Enter Gratuity Percentage')]")
    WebElement enterPercentagePopup;

    @FindBy(xpath = "//button[contains(.,' Apply ')]")
    WebElement applyBtn;

    @FindBy(xpath = "//label[contains(.,'Hold')]")
    WebElement holdBtn;

    @FindBy(xpath = "//label[contains(.,'Tax Exempt')]")
    WebElement taxExemptBtn;

    @FindBy(xpath = "//label[contains(.,'Open Item')]")
    WebElement openItemBtn;

    @FindBy(xpath = "//label[contains(.,'Resend To Kitchen')]")
    WebElement resendToKitchenBtn;

    @FindBy(xpath = "//label[contains(.,'Modify')]")
    WebElement modifyBtn;

    public void checkGratuityNotExists(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        try {
            if (driver.findElement(By.xpath("//p[@id='os_gratuityAmount']")).isDisplayed()) {
                utils.log().info("Gratuity is Applied");
                int i = 1 / 0;
            }
        }catch (Exception w){
            utils.log().info("Gratuity is not Applied");

        }
    }
    @FindBy(xpath = "//p[.='Please enter value from 5.0 - 15.0']")
    WebElement enterValue;
    public String enterValueAccordingBo() {
        return elementGetText(enterValue, "Enter value txt is displayed - ");
    }

    public void pressGratuityBtn() {
        elementClick(gratuityBtn, "Tapped Gratuity Button");
    }
    public void verifyEnterPercentage() {
        if (enterPercentagePopup.isDisplayed()) {
            utils.log().info("Percentage popup is visible");
        } else {
            utils.log().info("Percentage popup is not visible");
        }
    }
    public String verifyAddGratuityScreen() {
        return elementGetText(addGratuityScreen, "Add Gratuity Screen is Displayed - ");
    }

    public void pressGratuityFixedBtn() {
        elementClick(gratuityFixedBtn, "Tapped Gratuity Fixed Button");
    }

    @FindBy(name = "Gratuity")
    WebElement gratuity;

    public void checkGratuityExists() {
        if (driver.findElement(By.xpath("//p[@id='os_gratuityAmount']")).isDisplayed()) {
            utils.log().info("Gratuity is Applied");
        } else {
            utils.log().info("Gratuity is not Applied");
        }
    }

    public void pressGratuityVaryingBtn() {
        elementClick(gratuityVaryingBtn, "Tapped Gratuity Varying Button");
    }

    public void passPercentage(String number) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        elementClick(passPercentageValue, "Pass percentage value field is clicked.");
        elementClick("//ion-col[contains(@class,'quantity_grid-row-col')]//button[contains(.,'C')]", "Tapped Pin C");
        WebElement el2 =  driver.findElement(By.xpath("//ion-col[contains(@class,'quantity_grid-row-col')]//button[contains(.,'"+number+"')]"));
        elementClick(el2, "Tapped number as - " + number);
        elementClick("//ion-col[contains(@class,'quantity_grid-row-col')]//button[contains(.,'00')]", "Tapped Pin 00");
        WebElement el5 =  driver.findElement(By.xpath("//span[contains(.,'Continue')]"));
        elementClick(el5, "Tapped continue Button ");

        elementClick(applyBtn, "Tapped Apply button");
    }
    public String a = " ";

    public WebElement Select_RandomTable() throws Exception
    {

//		if(driver.findElement(By.xpath(Utility.getXpathProperty(""))).isDisplayed())
//		{
//
//		}
        WebElement randomTab;



        if(driver.findElement(By.xpath("//div[@class='child']/button")).isDisplayed())
        {
//            test.log(LogStatus.INFO, "Table Layout is displayed");
        }
        else
        {
            if(driver.findElement(By.xpath("//p[.='You not created any Floors in your Store']")).isDisplayed())
            {

                //Click the Done button
                driver.findElement(By.xpath("//span[.='Done']/..")).click();

//                test.log(LogStatus.INFO, "Here Floor is not created");
            }

        }

        List<WebElement> TableList=driver.findElements(By.xpath("//div[@class='child']/button"));


        int tableSize=TableList.size();


        int randomTable= ThreadLocalRandom.current().nextInt(1, tableSize);

        System.out.println("Table No is : "+randomTable);
        try
        {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class='child']/button["+randomTable+"]")).click();
        }
        catch(Exception lk) {}
        randomTab=driver.findElement(By.xpath("//div[@class='child']/button["+randomTable+"]"));

        return randomTab;

    }



    public String selectMenuForDineInForSplitCheck(String cate) throws Exception {

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement New = driver.findElement(By.xpath("//div[contains(.,'New Check')]"));
        elementClick(New, "Tapped New");
        Select_RandomTable();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        try
        {
            if(driver.findElement(By.xpath("//linga-icon[@symbol='closeButton']")).isDisplayed())
            {
//                test.log(LogStatus.INFO, "Seat Quantity entering Screen displayed successfully");
            }
        }
        catch(Exception w)
        {
//            test.log(LogStatus.FAIL, "Seat Quantity entering Screen is not displayed");
        }

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        //Click the required number seat from numpad
        String seatcount = driver.findElement(By.xpath("//ion-col[contains(@class,'quantity_grid-row')]//button//span[.='2']")).getText();
        driver.findElement(By.xpath("//ion-col[contains(@class,'quantity_grid-row')]//button//span[.='2']")).click();
        TestUtils.seatNumber = seatcount;
        //Click the Continue button
        driver.findElement(By.xpath("//span[contains(.,'Continue')]")).click();
        Thread.sleep(1500);

        getCheckNumberTxt();
        elementClick(arrowDownForOtherMenuItems, "Arrow Down");
        WebElement cate2 = driver.findElement(By.xpath("//div[contains(@class,'center-name category-container')]//div[contains(.,'"+cate+"')]"));
        elementClick(cate2, "Tapped category");
        Thread.sleep(5000);
        WebElement seatNum = driver.findElement(By.xpath("//button[@id='os_selectedSeat']//span[1]"));
        TestUtils.tableNumberof = seatNum.getText();
        /***  RandOm Select Menu **/
        Select_RandomMenuItems(driver);
        return check;
    }
    String check = null;
    public void Select_RandomMenuItems(WebDriver driver) throws Exception
    {

        for(int i=1;i<=3;i++)
        {
            List<WebElement> MenuList=driver.findElements(By.xpath("//button[contains(@id,'menu-item')]"));


            int MenusSize=MenuList.size()-1;


            int randomMenu= ThreadLocalRandom.current().nextInt(1, MenusSize-1);

            //Remove Comment lines
	/*	Thread.sleep(1000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement menuEle=driver.findElement(By.xpath("//button[@id='menu-item-"+randomMenu+"']"));
		js.executeScript("arguments[0].scrollIntoView(true);", menuEle);
		menuEle.click();
		*/
		/*
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement menuEle=driver.findElement(By.xpath("//div[@id='catAndMenuDiv']/div/div[3]/button["+randomMenu+"]"));
		js.executeScript("arguments[0].scrollIntoView(true);", menuEle);
		menuEle.click();
	*/

            JavascriptExecutor js=(JavascriptExecutor)driver;
            WebElement menuEle=driver.findElement(By.xpath("//div[contains(@class,'menuItem')]/button["+randomMenu+"]"));
            js.executeScript("arguments[0].scrollIntoView(true);", menuEle);
            menuEle.click();
		/*
		Reading_Excel_With_2_Menu_Item sw = new Reading_Excel_With_2_Menu_Item();
		sw.select_Some_MenuItems(driver, test);
		*/
            try
            {

                if(driver.findElement(By.xpath("//*[contains(@class,'modifier_content')]")).isDisplayed())
                {


                    List<WebElement> ModList=driver.findElements(By.xpath("//*[contains(@class,'modifier_content')]/ion-col[1]/button"));


                    int ModSize=ModList.size();


                    int randomMod=ThreadLocalRandom.current().nextInt(1, ModSize);



                    JavascriptExecutor js1=(JavascriptExecutor)driver;
                    WebElement modEle=driver.findElement(By.xpath("//*[contains(@class,'modifier_content')]/ion-col[1]/button["+randomMod+"]"));
                    js1.executeScript("arguments[0].scrollIntoView(true);", modEle);
                    modEle.click();



                    driver.findElement(By.xpath("//button[contains(.,'Done')]")).click();
                }
                if(driver.findElement(By.xpath("//*[contains(@class,'conversational_content')]")).isDisplayed())
                {


                    List<WebElement> ModList=driver.findElements(By.xpath("//*[contains(@class,'conversational_content')]/ion-col[1]/button"));


                    int ModSize=ModList.size();


                    int randomMod=ThreadLocalRandom.current().nextInt(1, ModSize);



                    JavascriptExecutor js1=(JavascriptExecutor)driver;
                    WebElement modEle=driver.findElement(By.xpath("//*[contains(@class,'conversational_content')]/ion-col[1]/button["+randomMod+"]"));
                    js1.executeScript("arguments[0].scrollIntoView(true);", modEle);
                    modEle.click();



                    driver.findElement(By.xpath("//button[contains(.,'Done')]")).click();
                }


            }
            catch(Exception cj)
            {

                try {
                    if (driver.findElement(By.xpath("//button[contains(.,'Done')]")).isDisplayed()) {

                        driver.findElement(By.xpath("//button[contains(.,'Done')]")).click();

                    }
                }catch (Exception e) {

                }

            }
        }

    }

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

    public String getPaidAmountExceedsTxt1() {
        return elementGetText(paidAmountExceedsTxt1, "Paid amount exceeds text is - ");
    }

    public String getPaidAmountExceedsTxt() {
        return elementGetText(paidAmountExceedsTxt, "Paid amount exceeds text is - ");
    }


    @FindBy(xpath = "//p[.='Paid Amount exceeding Sale Amount']") //Changed to xpath by Engin...
    WebElement paidAmountExceedsTxt1;
    @FindBy(xpath = "//p[(.='Paid amount exceeds the sale amount')]") //Changed to xpath by Engin...
    WebElement paidAmountExceedsTxt;
    public void verifyPaidAmountExceeds() {
        if (paidAmountExceedsTxt.isDisplayed()) {
            utils.log().info("Paid amount exceeds pop-up is thrown");
        } else {
            utils.log().info("Paid amount exceeds pop-up is not thrown");
        }
    }
    public void verifyPaidAmountExceeds1() {
        if (paidAmountExceedsTxt1.isDisplayed()) {
            utils.log().info("Paid amount exceeds pop-up is thrown");
        } else {
            utils.log().info("Paid amount exceeds pop-up is not thrown");
        }
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

    public void pressTaxExempt() {
        elementClick(taxExemptBtn, "- Tax Exempt is tapped");
    }

    public void selectHold() {
        elementClick(holdBtn, "- Hold option is selected");
    }

    public void pressModify() throws InterruptedException {
        Thread.sleep(2000);
        elementClick(modifyBtn, "- Modify is tapped");
    }



    public void pressResendToKitchen() {
        elementClick(resendToKitchenBtn, "- Resend to kitchen is tapped");
    }

    @FindBy(name = "Tax Exempt Removed Successfully")
    WebElement taxExemptRemovedTxt;

    public String getTaxExemptRemovedTxt() {
        return elementGetText(taxExemptRemovedTxt, "Tax exempt removed text is - ");
    }

    public String getTaxExemptTitle() {
        return elementGetText(taxExemptTitle, "Tax Exempt title is - ");
    }


    @FindBy(xpath = "//label[contains(.,'Tax Exempt')]")
    WebElement taxExemptTitle;

    @FindBy(xpath = "//button[contains(.,'School')]")
    WebElement schoolTaxExemptReason;

    public void selectSchoolAsTaxExemptReason() {
        elementClick(schoolTaxExemptReason, "- School Tax Exempt Reason is selected");
    }

    public void pressOpenItem() {
//        openItemBtn.click();
        elementClick(openItemBtn, "Tax Exempt is tapped");
    }

    @FindBy( xpath = "(//ion-item[@role='listitem'])//ion-label[.=' 7% Sales Tax ']")
    WebElement percent7Tax;


    public void selectTax(){
        elementClick( percent7Tax, "%7 Tax is selected - ");
    }

    public void swipeToCourseName(String Name) throws InterruptedException {
        Thread.sleep(300);
//        List<WebElement> element = driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));

        WebElement element = driver.findElement(By.xpath("//mat-option//span[contains(.,' "+Name+" ')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(300);
        element.click();
//        Select s = new Select(element);
//        Thread.sleep(300);
//        s.selectByVisibleText(Name);
    }

    public void pressOpenItemTextFieldMenuOption() throws InterruptedException {
        Thread.sleep(300);
        elementClick(CoursingNameTxtFldMenuOption,"Tapped Coursing name field");
    }

//    public void pressOpenItemTextFieldMenuOption1() throws InterruptedException {
//        Thread.sleep(300);
//        elementClick(CoursingNameTxtFldMenuOption1,"Tapped Coursing name field");
//    }
//
//    public void pressOpenItemTextFieldMenuOption2() throws InterruptedException {
//        Thread.sleep(300);
//        elementClick(CoursingNameTxtFldMenuOption2,"Tapped Coursing name field");
//    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-open-item/ion-content/ion-grid/ion-row[1]/ion-col[2]/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
    WebElement CoursingNameTxtFldMenuOption;

//    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-open-item/ion-content/ion-grid/ion-row[1]/ion-col[2]/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
//    WebElement CoursingNameTxtFldMenuOption1;
//
//    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-open-item/ion-content/ion-grid/ion-row[1]/ion-col[2]/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
//    WebElement CoursingNameTxtFldMenuOption2;

    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])[1]")
    WebElement ItemNameTxtFldMenuOption;

//    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])[1]")
//    WebElement ItemNameTxtFldMenuOption1;
//
//    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])[1]")
//    WebElement ItemNameTxtFldMenuOption2;

    @FindBy( xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])[1]")
    WebElement ItemNameTxtFld;


    @FindBy( xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])")
    WebElement priceFld;
    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]

    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])")
    WebElement priceFldMenuOption;

//    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])")
//    WebElement priceFldMenuOption1;
//
//    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored')])")
//    WebElement priceFldMenuOption2;

    public void setOpenItemNameMenuOption(String item) throws InterruptedException {
        Thread.sleep(300);
        sendKeys( ItemNameTxtFldMenuOption, item);
    }

//    public void setOpenItemNameMenuOption1(String item) throws InterruptedException {
//        Thread.sleep(300);
//        sendKeys( ItemNameTxtFldMenuOption1, item);
//    }
//
//    public void setOpenItemNameMenuOption2(String item) throws InterruptedException {
//        Thread.sleep(300);
//        sendKeys( ItemNameTxtFldMenuOption2, item);
//    }


    public void setItemName(String name) throws InterruptedException {
        Thread.sleep(200);
        sendKeys( ItemNameTxtFld, name);
    }

    public void setItemNameMenuOption(){
        sendKeys( ItemNameTxtFldMenuOption, "Tiramisu");
    }


    public void selectPriceFld(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        elementClick( priceFld, "Price field selected - ");
    }

    public void selectPriceFldMenuOption(){
        elementClick(priceFldMenuOption,"Price Field selected");
    }

//    public void selectPriceFldMenuOption1(){
//        elementClick(priceFldMenuOption1,"Price Field selected");
//    }
//
//    public void selectPriceFldMenuOption2(){
//        elementClick(priceFldMenuOption2,"Price Field selected");
//    }
    @FindBy( xpath = "//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//button[contains(.,'1')]")
    WebElement price1;

    public void press1(){
        elementClick( price1, "1 is selected ");
    }

    @FindBy( xpath = "//ion-col[contains(@class,'quantity_grid-row-col md hydrated')]//button[contains(.,'4')]")
    WebElement price4;

    public void press4(){
        elementClick( price4, "4 is selected ");
    }

    @FindBy(xpath = "//ion-col[contains(@class,'quantity_grid-row-col')]//button[contains(.,'00')]")
    WebElement price00;
    public void press00(){
        elementClick( price00, "00 is selected - ");
    }

    @FindBy(xpath = "(//ion-col[contains(@class,'quantity_grid-row-col')]//button[contains(.,'0')])[2]")
    WebElement price0;
    public void press0(){
        elementClick( price0, "00 is selected - ");
    }

    @FindBy( xpath = "//button[contains(.,' Continue ')]")
    WebElement continueBtn;

    public void pressContinueAddingOpenItem(){
        elementClick( continueBtn, "Continue button is tapped - " );
    }

    @FindBy(xpath = "//button[contains(.,' Done ')]")
    WebElement doneBtn;
    public void pressDoneOpenItemBtn(){
        elementClick( doneBtn, "Done button is tapped - ");
    }

    public void verifyOpenItem(String name) throws InterruptedException {
        Thread.sleep(1300);
        WebElement menu=driver.findElement(By.xpath("(//div[contains(@class,'p-col-4 orderlist-menuname')])[2]"));

        if(menu.isDisplayed())
        {
            utils.log().info("Open Item is added - "+menu.getText());
            Assert.assertEquals(menu.getText(), name);
        }
        else {
            utils.log().info("Open Item is not added - "+name);
        }
    }

    public void verifyOpenItem1(String name) throws InterruptedException {
        Thread.sleep(1300);
        WebElement menu=driver.findElement(By.xpath("(//div[contains(@class,'p-col-4 orderlist-menuname')])[1]"));

        if(menu.isDisplayed())
        {
            utils.log().info("Open Item is added - "+menu.getText());
            Assert.assertEquals(menu.getText(), name);
        }
        else {
            utils.log().info("Open Item is not added - "+name);
        }
    }
    @FindBy(xpath = "//ion-toolbar//div//button[contains(.,' Process ')]")
    WebElement processBtn;

    public void clickProcessButton() throws InterruptedException {
        Thread.sleep(3000);
       elementClick("/html/body/div/div[4]/div/mat-dialog-container/app-pay/ion-footer/ion-toolbar/div/button[4]","Selected Process");
    }
    @FindBy(xpath = "//button[.='Gift Card']")
    private WebElement giftCardBtn;

    public void pressBack1() {
        elementClick("//button[.=' Back ']", "- Back button is tapped");
    }

    @FindBy(xpath = "//button[.=' Cancel ']")
    WebElement backOnTaxExemptBtn;

    public void pressBackOnTaxExempt() {
        elementClick(backOnTaxExemptBtn, "- Back button on tax exempt window is tapped");
    }

    @FindBy(xpath = "//ion-title[.='Gift Card']")
    private WebElement giftCardBtn1;

    @FindBy(xpath = "//label[contains(.,'Discount')]")
    private WebElement discountOnOption;

    public void clickGiftCardBtn() {
        elementClick(giftCardBtn, "Tapped Gift Card Button");
    }
    public String verifyGiftCardWindow() {
        return elementGetText(giftCardBtn1, "Gift card screen is displayed - ");
    }
    public void selectDiscountOnCheckOption() {

        elementClick(discountOnOption, "Tapped Discount Button");
        //click(discountOnOptionScreen,"Tapped Discount Button");
    }
    @FindBy(name = "Open Check Discount")
    private WebElement openCheckDiscountOptionScreen;
    public void selectOpenCheckDiscountBtn() {
        elementClick(openCheckDiscountOptionScreen, "Tapped Open check Discount Button");
    }

    public void clickChargeAmountFieldPassAmount() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        elementClick("/html/body/div[1]/div[2]/div/mat-dialog-container/app-gift-card/ion-grid/mat-tab-group/div/mat-tab-body[1]/div/div/app-gift-card-recharge/ion-grid/ion-row[1]/ion-col[2]/div[2]", "Tapped Charge Amount Field");
        elementClick("//span[.='1']", "Tapped Pin 1");
        elementClick("//span[.='00']", "Tapped Pin 00");
        elementClick("//span[.='00']", "Tapped Pin 00");
        // WebElement el2 = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]","",TestUtils.XPath);
//        WebElement el2 = mergeAndFindElement("//XCUIElementTypeStaticText[@name=\"Continue\"]", "", TestUtils.XPath);
        elementClick("//span[.=' Continue ']", "Tapped ");
    }
    @FindBy(xpath = "//div[@class='menu-section orderlist-flex ']//div[contains(.,'GC-1111')]")
    private WebElement giftCardAddUp;
    public String verifyGiftCardAddup() throws InterruptedException {
        Thread.sleep(2000);
        return elementGetText(giftCardAddUp, "Gift Card is Add to Order screen - ");
    }

    @FindBy(xpath = "//div[@class='menu-section orderlist-flex ']//div[contains(.,'GC-12345')]")
    private WebElement giftCardAddUp1;
    public String verifyGiftCardAddup1() throws InterruptedException {
        Thread.sleep(2000);
        return elementGetText(giftCardAddUp1, "Gift Card is Add to Order screen - ");
    }

    public void enterGiftCardNumber() throws InterruptedException {
        Thread.sleep(2000);
        WebElement el1 = driver.findElement(By.xpath("//p[.=' 0000 0000 0000 0000 ']"));
        elementClick(el1, "Tapped Card Number Field");
        //click(cardNumber,"Tapped Card Number Field");
        elementClick("//button[.='1']", "Tapped Pin 1");
        elementClick("//button[.='1']", "Tapped Pin 1");
        elementClick("//button[.='1']", "Tapped Pin 1");
        elementClick("//button[.='1']", "Tapped Pin 1");
        //WebElement el2 = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]","",TestUtils.XPath);
//        WebElement el2 = mergeAndFindElement("//XCUIElementTypeStaticText[@name=\"Continue\"]", "", TestUtils.XPath);
        elementClick("//button[.=' Continue ']", "Tapped Continue ");
    }

    public void enterGiftCardNumber1() throws InterruptedException {
        Thread.sleep(2000);
        WebElement el1 = driver.findElement(By.xpath("//p[.=' 0000 0000 0000 0000 ']"));
        elementClick(el1, "Tapped Card Number Field");
        //click(cardNumber,"Tapped Card Number Field");
        elementClick("//button[.='1']", "Tapped Pin 1");
        elementClick("//button[.='2']", "Tapped Pin 2");
        elementClick("//button[.='3']", "Tapped Pin 3");
        elementClick("//button[.='4']", "Tapped Pin 4");
        elementClick("//button[.='5']", "Tapped Pin 5");
        //WebElement el2 = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]","",TestUtils.XPath);
//        WebElement el2 = mergeAndFindElement("//XCUIElementTypeStaticText[@name=\"Continue\"]", "", TestUtils.XPath);
        elementClick("//button[.=' Continue ']", "Tapped Continue ");
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
    @FindBy(xpath = "//button[.='Cancel']")
    WebElement backBtn;
    public void pressBack() throws InterruptedException {
        Thread.sleep(2000);
        elementClick(backBtn, "- Back button is tapped");
    }
}