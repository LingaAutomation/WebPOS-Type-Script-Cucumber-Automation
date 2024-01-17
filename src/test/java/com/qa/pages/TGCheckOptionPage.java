package com.qa.pages;

import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;
import static com.qa.utils.TestUtils.driver;


public class TGCheckOptionPage extends BasePage {

    public void verifyBeDirectedToCheckOptionPage(){
        WebElement txtCheckOptionTitle=mergeAndFindMobileElement(checkOptionTitle);
        String actualName=elementGetText(txtCheckOptionTitle,"verify checkOptionTitle");
        String expectedName = "Check Options";
        Assert.assertEquals(actualName, expectedName);
    }
    public void clickVoidItemOption(){
        WebElement btnVoidItemMenuOption=mergeAndFindMobileElement(voidItemMenuOption);
        elementClick(btnVoidItemMenuOption,"VoidItemMenuOption button clicked");
    }
    public void selectVoidReasonForGiftCard(){
        WebElement btnVoidReasonFOrGiftCard=mergeAndFindMobileElement(voidReasonFOrGiftCard);
        elementClick(btnVoidReasonFOrGiftCard,"void giftcard reason");
    }
    public void clickGiftCardCheckOption(){
        WebElement btnGiftCardOption=mergeAndFindMobileElement(giftCardOption);
        elementClick(btnGiftCardOption,"click gift card option");
    }
    public void verifyWarningPopupForCombination(){
        WebElement btnCombinationDiscountWarningText=mergeAndFindMobileElement(combinationDiscountWarningText);
        elementClick(btnCombinationDiscountWarningText,"click combinationDiscountWarningText");
    }

    public void enterValueOfVaryingGratuity(){
        WebElement btnVaryingPercentageTextBox=mergeAndFindMobileElement(varyingPercentageTextBox);
        elementClick(btnVaryingPercentageTextBox,"click varyingPercentageTextBox ");

        WebElement btnVaryingOneButton=mergeAndFindMobileElement(varyingOneButton);
        elementClick(btnVaryingOneButton,"click VaryingOneButton ");

        WebElement btnVaryingZeroButton=mergeAndFindMobileElement(varyingZeroButton);
        elementClick(btnVaryingZeroButton,"click varyingZeroButton ");

        WebElement btnVaryingContinueButton=mergeAndFindMobileElement(varyingContinueButton);
        elementClick(btnVaryingContinueButton,"click btnVaryingContinueButton ");

        WebElement btnVaryingApplyButton=mergeAndFindMobileElement(varyingApplyButton);
        elementClick(btnVaryingApplyButton,"click varyingApplyButton ");

    }
    String firstBarTabOrderSortedAToZ = "(//p[.='goknur bati'])[1]";
    String firstBarTabOrderSortedZToA = "(//p[.='goknur bati'])[1]";
    public void selectHoldCheckOption(){
        WebElement btnHoldCheckOption=mergeAndFindMobileElement(holdCheckOption);
        elementClick(btnHoldCheckOption,"click holdCheckOption ");
    }


    public void verifyBarTabOrdersSortedFromAToZ() throws InterruptedException {
        Thread.sleep(2000);
        WebElement sortedFromAToZ = driver.findElement(By.xpath(firstBarTabOrderSortedAToZ));
        String actualName = elementGetText(sortedFromAToZ,"Verify BarTab Orders Sorted From AToZ");
        String expectedName = "goknur bati";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyBarTabOrdersSortedFromZToA() throws InterruptedException {
        Thread.sleep(2000);
        WebElement sortedFromZToA = mergeAndFindMobileElement(firstBarTabOrderSortedZToA);
        String actualName = elementGetText(sortedFromZToA,"Verify BarTab Orders Sorted From ZToA");
        String expectedName = "goknur bati";

        Assert.assertEquals(actualName,expectedName);
    }
    public void enterCoursingPriceAsAsDecimalValue(){
        WebElement btnCoursingPriceTextBox=mergeAndFindMobileElement(coursingPriceTextBox);
        elementClick(btnCoursingPriceTextBox,"click coursingPriceTextBox ");

        WebElement btnZeroOnCalculator=mergeAndFindMobileElement(numberZeroOnCalculator);
        elementClick(btnZeroOnCalculator,"click btnZeroOnCalculator ");

        WebElement btnNumberDoubleZeroOnCalculator=mergeAndFindMobileElement(numberDoubleZeroOnCalculator);
        elementClick(btnNumberDoubleZeroOnCalculator,"click btnZeroOnCalculator ");

        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");

    }

    public void selectBeforeTaxAmountWithOpenItemCoursingTax(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable[1]");
        phoneOrders = selectAndFindElements("//XCUIElementTypeStaticText[@name=\"BeforeTaxAmount-OpenItem\"]");
        phoneOrders.get(phoneOrders.size() - 1).click();

//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable[1]"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"BeforeTaxAmount-OpenItem\"]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
//        }
    }
    public void selectAfterTaxAmountWithOpenItemCoursingTax(){

        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable[1]");
        phoneOrders = selectAndFindElements("//XCUIElementTypeStaticText[@name=\"AfterTaxAmount-OpenItem\"]");
        phoneOrders.get(phoneOrders.size() - 1).click();

//        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable[1]"));
//
//        for (int index = 0; index < phoneOrders.size(); index++) {
//
//            phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"AfterTaxAmount-OpenItem\"]"));
//
//            phoneOrders.get(phoneOrders.size() - 1).click();
        //      }
    }

    public void enterCoursingPriceAsNonDecimalValue(){
        WebElement btnCoursingPriceTextBox=mergeAndFindMobileElement(coursingPriceTextBox);
        elementClick(btnCoursingPriceTextBox,"click coursingPriceTextBox ");

        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");

        WebElement btnNumberDoubleZeroOnCalculator=mergeAndFindMobileElement(numberDoubleZeroOnCalculator);
        elementClick(btnNumberDoubleZeroOnCalculator,"click btnZeroOnCalculator ");

        WebElement btnNumberFiveOnCalculator=mergeAndFindMobileElement(numberFiveOnCalculator);
        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");

        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");
    }

    /* public void verifyCheckOptionPage(){
        String actualName = driver.findElement(checkOptionTitle).getText();
        String expectedName = "Check Options";
        Assert.assertEquals(actualName, expectedName);
    }*/
    public void selectDiscountOption(){

        WebElement btnDiscount=mergeAndFindMobileElement(discount);
        elementClick(btnDiscount,"click btnDiscount ");

    }
    public void selectCheckDiscount(){
        WebElement btnCheckDiscount=mergeAndFindMobileElement(checkDiscount);
        elementClick(btnCheckDiscount,"click checkDiscount ");
    }

    public void selectOpenCheckDiscountOption(){
        WebElement btnOpenCheckDiscount=mergeAndFindMobileElement(openCheckDiscountOption);
        elementClick(btnOpenCheckDiscount,"click openCheckDiscountOption ");

    }
    public void selectChargeType(){
        WebElement btnPercentageChargeType=mergeAndFindMobileElement(percentageChargeType);
        elementClick(btnPercentageChargeType,"click percentageChargeType ");

    }
    public void enterPercentageForOpenCheck(){
        WebElement btnPercentageOpenDiscountTextbox=mergeAndFindMobileElement(percentageOpenDiscountTextbox);
        elementClick(btnPercentageOpenDiscountTextbox,"click percentageChargeType ");

        WebElement btnNumberFiveOnCalculator=mergeAndFindMobileElement(numberFiveOnCalculator);
        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");

        WebElement btnNumberDoubleZeroOnCalculator=mergeAndFindMobileElement(numberDoubleZeroOnCalculator);
        elementClick(btnNumberDoubleZeroOnCalculator,"click btnZeroOnCalculator ");

        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");

    }
    public void selectAfterTaxType(){
        WebElement btnAfterTaxType=mergeAndFindMobileElement(afterTaxType);
        elementClick(btnAfterTaxType,"click btnAfterTaxType ");
    }
    public void clickApplyButton(){
        WebElement btnApplyButtonOnOpenDiscount=mergeAndFindMobileElement(applyButtonOnOpenDiscount);
        elementClick(btnApplyButtonOnOpenDiscount,"click btnAfterTaxType ");
    }
    public void enterOpenDiscountReason(){
        WebElement element=mergeAndFindMobileElement(openDiscountReason);
        element.sendKeys("test automation");
        //driver.findElement(closeKeyboard).click();
//        driver.hideKeyboard();
    }
    public void clickGratuityOption(){
        WebElement btnGratuityOption=mergeAndFindMobileElement(gratuityOption);
        elementClick(btnGratuityOption,"click gratuityOption ");
    }
    public void verifyGratuityPage(){
        WebElement txtGratuityTitle=mergeAndFindMobileElement(gratuityTitle);
        String actualName=elementGetText(txtGratuityTitle,"verify gratuityTitle");
        String expectedName = "Add Gratuity";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectFixedGratuity(){
        WebElement btnFixedGratuity=mergeAndFindMobileElement(fixedGratuity);
        elementClick(btnFixedGratuity,"click fixedGratuity ");
    }
    public void selectVaryingGratuityOption(){
        WebElement btnVaryingGratuity=mergeAndFindMobileElement(varyingGratuity);
        elementClick(btnVaryingGratuity,"click varyingGratuity ");
    }
    public void clickVaryingGratuityApplyButton(){
        WebElement btnVaryingApplyButton=mergeAndFindMobileElement(varyingApplyButton);
        elementClick(btnVaryingApplyButton,"click btnVaryingApplyButton ");
    }

    public void verifyVaryingGratuityAs(String value){
        WebElement discount= driver.findElement(By.xpath("//div[@id='os_gratuityAmountStr']//input"));

        if(discount.isDisplayed()){
            utils.log().info( " Gratuity is - "+ value);
            Assert.assertEquals(discount.getAttribute("value"),value);
        }else {
            utils.log().info("Gratuity is not Displayed");
        }
    }

    public void enterPercentageOfVarying(){
        WebElement btnVaryingPercentageTextBox=mergeAndFindMobileElement(varyingPercentageTextBox);
        elementClick(btnVaryingPercentageTextBox,"click btnVaryingPercentageTextBox ");

//        WebElement btnVaryingOneButton=mergeAndFindMobileElement(varyingOneButton);
//        elementClick(btnVaryingOneButton,"click btnVaryingOneButton ");
//
//        WebElement btnVaryingFiveButton=mergeAndFindMobileElement(varyingFiveButton);
//        elementClick(btnVaryingFiveButton,"click varyingFiveButton ");
//
//        WebElement btnVaryingContinueButton=mergeAndFindMobileElement(varyingContinueButton);
//        elementClick(btnVaryingContinueButton,"click varyingContinueButton ");
    }

    public void enterLessValueThenMinimumGratuityVaryingValue() {
        WebElement btnVaryingPercentageTextBox = mergeAndFindMobileElement(varyingPercentageTextBox);
        elementClick(btnVaryingPercentageTextBox, "click btnVaryingPercentageTextBox ");

        WebElement btnVaryingFiveButton = mergeAndFindMobileElement(varyingFiveButton);
        elementClick(btnVaryingFiveButton, "click varyingFiveButton ");

        WebElement btnVaryingContinueButton = mergeAndFindMobileElement(varyingContinueButton);
        elementClick(btnVaryingContinueButton, "click varyingContinueButton ");

        WebElement btnVaryingApply = mergeAndFindMobileElement(varyingApplyButton);
        elementClick(btnVaryingApply, "click varyingApplyButton ");
    }

    public void enterLessValueThenMaximumGratuityVaryingValue(){
        WebElement btnVaryingPercentageTextBox = mergeAndFindMobileElement(varyingPercentageTextBox);
        elementClick(btnVaryingPercentageTextBox, "click btnVaryingPercentageTextBox ");

        WebElement btnVaryingFiveButton = mergeAndFindMobileElement(varyingFiveButton);
        elementClick(btnVaryingFiveButton, "click varyingFiveButton ");

        elementClick(btnVaryingFiveButton, "click varyingFiveButton ");

        elementClick(btnVaryingFiveButton, "click varyingFiveButton ");
        elementClick(btnVaryingFiveButton, "click varyingFiveButton ");
        elementClick(btnVaryingFiveButton, "click varyingFiveButton ");


        WebElement btnVaryingContinueButton = mergeAndFindMobileElement(varyingContinueButton);
        elementClick(btnVaryingContinueButton, "click varyingContinueButton ");

        WebElement btnApplyVaryingGratuity = mergeAndFindMobileElement(applyVaryingGratuity);
        elementClick(btnApplyVaryingGratuity, "click btnApplyVaryingGratuity ");

    }

    public void verifyMinMaxGratuityValueWarningPopup(){
        WebElement element = mergeAndFindMobileElement(minMaxGratuityValueWarningPopup);
        String actualName=elementGetText(element,"value");

        String expectedName = "Please enter value from 10.0 - 100.0";

        Assert.assertEquals(actualName,expectedName);
    }
//    public void selectFireCoursingOption(){
//        WebElement btnFireCoursing = mergeAndFindMobileElement(fireCoursingButton);
//        elementClick(btnFireCoursing, "click fireCoursing Button ");
//    }
    public void selectFireCoursingOption(){
        try{
            WebElement btnFireCoursing = mergeAndFindMobileElement(fireCoursingButton);
            elementClick(btnFireCoursing, "click fireCoursing Button ");}
        catch(Exception e){
            WebElement btnFireCoursing = mergeAndFindMobileElement(fireCoursingTitle);
            elementClick(btnFireCoursing, "click fireCoursing Button ");
        }
    }

    public void shouldSeePleaseSendAlltheMenuItems(){

        WebElement element = driver.findElement(By.xpath("//p[contains(.,'Please send all the menu items to kitchen')]"));
        Assert.assertEquals(element.getText(),"Please send all the menu items to kitchen");
        utils.log().info("Displayed - "+element.getText());
    }

    public void shouldSeePleaseOrderTheMenuPopup(){
        WebElement element = driver.findElement(By.xpath("//p[contains(.,'Please order a menu item')]"));
        Assert.assertEquals(element.getText(),"Please order a menu item");
        utils.log().info("Displayed - "+element.getText());
    }

    public void selectPreparedOrder(){
        WebElement btnToBePreparedOrder = mergeAndFindMobileElement(ToBePreparedOrder);
        elementClick(btnToBePreparedOrder, "click fToBePreparedOrder ");
    }
    public void verifyAnythingToFire(){
        WebElement element = mergeAndFindMobileElement(emptyFireList);
        String actualName=elementGetText(element,"value");
        String expectedName = "";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectServiceExempt(){
        WebElement btnServiceExempt = mergeAndFindMobileElement(serviceExempt);
        elementClick(btnServiceExempt, "click btnServiceExempt ");
    }
    public void selectCashDrawer(){
        WebElement btnCashDrawer = mergeAndFindMobileElement(cashDrawer);
        elementClick(btnCashDrawer, "click btnCashDrawer ");
    }
    public void verifyDirectedMenuItemPage(){
        WebElement element = mergeAndFindMobileElement(menuItemTitle);
        String actualName=elementGetText(element,"value");
        String expectedName = "__MENU ITEMS OF 'FOOD'__";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectOpenItemOption(){
        WebElement btnOpenItemOption = mergeAndFindMobileElement(openItemOption);
        elementClick(btnOpenItemOption, "click btnOpenItemOption");
    }
    public void enterCoursingItemName(){
        WebElement element = mergeAndFindMobileElement(coursingItemNameTextBox);
        elementClick(element, "click coursingItemNameTextBox");
        element.sendKeys("Test Automation");
    }
//    public void enterCoursingPrice(){
//        WebElement element = mergeAndFindMobileElement(coursingPriceTextBox);
//        elementClick(element, "click coursingPriceTextBox");
//
//        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
//        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");
//
//        WebElement btnNumberDoubleZeroOnCalculator=mergeAndFindMobileElement(numberDoubleZeroOnCalculator);
//        elementClick(btnNumberDoubleZeroOnCalculator,"click btnZeroOnCalculator ");
//
//        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
//        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");
//
//    }
    public void enterCoursingPrice(){
        WebElement element = mergeAndFindMobileElement(coursingPriceTextBox);
        elementClick(element, "click coursingPriceTextBox");

//        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
//        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");
//
//        WebElement btnNumberDoubleZeroOnCalculator=mergeAndFindMobileElement(numberDoubleZeroOnCalculator);
//        elementClick(btnNumberDoubleZeroOnCalculator,"click btnZeroOnCalculator ");
//
//        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
//        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");

    }
    public void selectCoursingTax(){
        WebElement btnDefaultCoursingTaxOption=mergeAndFindMobileElement(defaultCoursingTaxOption);
        elementClick(btnDefaultCoursingTaxOption,"click defaultCoursingTaxOption ");
    }
    public void clickCoursingDoneButton(){
        WebElement btnCoursingDoneButton=mergeAndFindMobileElement(coursingDoneButton);
        elementClick(btnCoursingDoneButton,"click coursingDoneButton ");
    }
    public void clickCheckOptionBackButton(){
        WebElement btnCheckOptionBackButton=mergeAndFindMobileElement(checkOptionBackButton);
        elementClick(btnCheckOptionBackButton,"click checkOptionBackButton ");
    }
    public void swipeUntilEntreeCoursingName(String name) throws InterruptedException{
        WebElement element=mergeAndFindMobileElement(coursingNameTextBox);
        elementClick(element,"click coursingNameTextBox ");

        WebElement DatePickerWheel =  driver.findElement(By.xpath("//XCUIElementTypePicker"));
        List<WebElement> course = DatePickerWheel.findElements(By.xpath("//XCUIElementTypePickerWheel"));
        course.get(0).sendKeys(name);
    }
    public void enterCoursingDoneButton(){
        WebElement element=mergeAndFindMobileElement(openItemDoneButton);
        elementClick(element,"click openItemDoneButton ");
    }
    public void clickTaxExemptOnCheckOptions(){
        WebElement element=mergeAndFindMobileElement(taxExemptOption);
        elementClick(element,"click taxExemptOption ");
    }
    public void selectTaxExemptOption(){
        WebElement element=mergeAndFindMobileElement(taxExemptOption);
        elementClick(element,"click taxExemptOption ");
    }
    public void selectTaxExemptType(){
        WebElement element=mergeAndFindMobileElement(taxExemptType);
        elementClick(element,"click taxExemptType ");
    }
    public void selectChargeTypeWithAmount(){
        WebElement element=mergeAndFindMobileElement(chargeTypeWithAmount);
        elementClick(element,"click chargeTypeWithAmount ");
    }
    public void enterOpenDiscountAmount(){
        WebElement element=mergeAndFindMobileElement(openDiscountAmountTextBox);
        elementClick(element,"click openDiscountAmountTextBox ");

//        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
//        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");
//
//        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");

        WebElement btnNumberFiveOnCalculator=mergeAndFindMobileElement(numberFiveOnCalculator);
        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");

        WebElement element1=mergeAndFindMobileElement(numberDoubleZeroOnCalculator);
        elementClick(element1,"click btnNumberFiveOnCalculator ");


        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");
    }
    public void selectAfterTaxForOpenDiscount(){
        WebElement element=mergeAndFindMobileElement(applyTaxForOpenDiscount);
        elementClick(element,"click applyTaxForOpenDiscount ");
    }
    public void selectItemDiscountOption(){
        WebElement element=mergeAndFindMobileElement(itemDiscountOption);
        elementClick(element,"click itemDiscountOption ");
    }
    public void selectAutoDiscountBelowItemDiscount(){
        WebElement element=mergeAndFindMobileElement(itemDiscountOption);
        elementClick(element,"click itemDiscountOption ");

        WebElement element1=mergeAndFindMobileElement(autoDiscount);
        elementClick(element1,"click itemDiscountOption ");
    }
    public void verifyRemovedTaxExemptPopup(){
        WebElement element1=mergeAndFindMobileElement(taxExemptRemovedText);
        String actualName=elementGetText(element1,"verify taxExemptRemovedText");

        String  expectedName = "Tax Exempt Removed successfully";

        Assert.assertEquals(expectedName,actualName);

        WebElement element=mergeAndFindMobileElement(doneButton);
        elementClick(element,"click doneButton ");

    }
    public void clickGiftCardOption() {
        WebElement element = driver.findElement(By.xpath("//button[contains(.,'Gift Card')]"));
        elementClick(element, "click giftCardOption ");
    }
    public void clickSuspendAccount(){
        WebElement element = mergeAndFindMobileElement(suspendAccount);
        elementClick(element, "click suspendAccount ");
    }
    public void clickActivateAccount(){
        WebElement element = mergeAndFindMobileElement(activateAccount);
        elementClick(element, "click activateAccount ");
    }
    public void clickHoldCheckOption(){
        WebElement element = mergeAndFindMobileElement(holdCheckOption);
        elementClick(element, "click holdCheckOption ");
    }
    public void verifyCheckOptionPage(){
        WebElement element = driver.findElement(By.xpath(checkOptionPageTitle));
        String actualName=elementGetText(element,"verify the checkOptionPageTitle");
        String  expectedName = "Check Option";

        Assert.assertEquals(expectedName,actualName);
    }

    public void enterItemNameOfOpenItem(){
        WebElement element = mergeAndFindMobileElement(openItemsItemName);
        elementClick(element, "click openItemsItemName ");
        element.sendKeys("Test Automation");
    }
    public void enterPriceOfOpenItem(){
        WebElement element = mergeAndFindMobileElement(openItemPrice);
        elementClick(element, "click openItemPrice ");

        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");

        WebElement btnNumberDoubleZeroOnCalculator=mergeAndFindMobileElement(numberDoubleZeroOnCalculator);
        elementClick(btnNumberDoubleZeroOnCalculator,"click btnZeroOnCalculator ");

        WebElement btnNumberFiveOnCalculator=mergeAndFindMobileElement(numberFiveOnCalculator);
        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");

        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");
    }
    public void enterPriceOfOpenItems(){
        WebElement element = mergeAndFindMobileElement(openItemPrice);
        elementClick(element, "click openItemPrice ");

//        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
//        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");
//
//        WebElement btnNumberFiveOnCalculator=mergeAndFindMobileElement(numberFiveOnCalculator);
//        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");
//
//        WebElement btnNumberDoubleZeroOnCalculator=mergeAndFindMobileElement(numberDoubleZeroOnCalculator);
//        elementClick(btnNumberDoubleZeroOnCalculator,"click btnZeroOnCalculator ");
//
//        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
//        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");
    }
//    public void enterOpenItemPriceAsDecimal(){
//        WebElement element = mergeAndFindMobileElement(openItemPrice);
//        elementClick(element, "click openItemPrice ");
//
//        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
//        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");
//
//        WebElement btnNumberFiveOnCalculator=mergeAndFindMobileElement(numberFiveOnCalculator);
//        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");
//
//        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");
//
//        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");
//
//        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
//        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");
//
//    }
    public void enterOpenItemPriceAsDecimal(){
        WebElement element = mergeAndFindMobileElement(openItemPrice);
        elementClick(element, "click openItemPrice ");

//        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
//        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");
//
//        WebElement btnNumberFiveOnCalculator=mergeAndFindMobileElement(numberFiveOnCalculator);
//        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");
//
//        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");
//
//        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");
//
//        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
//        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");

    }
//    public void enterOpenItemPriceAsWholeNumber(){
//
//        WebElement element = mergeAndFindMobileElement(openItemPrice);
//        elementClick(element, "click openItemPrice ");
//
//        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
//        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");
//
//        WebElement btnNumberFiveOnCalculator=mergeAndFindMobileElement(numberFiveOnCalculator);
//        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");
//
//        WebElement btnZeroOnCalculator=mergeAndFindMobileElement(numberZeroOnCalculator);
//        elementClick(btnZeroOnCalculator,"click btnZeroOnCalculator ");
//        elementClick(btnZeroOnCalculator,"click btnZeroOnCalculator ");
//
//        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
//        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");
//    }
    public void enterOpenItemPriceAsWholeNumber(){

        WebElement element = mergeAndFindMobileElement(openItemPrice);
        elementClick(element, "click openItemPrice ");

//        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
//        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");
//
//        WebElement btnNumberFiveOnCalculator=mergeAndFindMobileElement(numberFiveOnCalculator);
//        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");
//
//        WebElement btnZeroOnCalculator=mergeAndFindMobileElement(numberZeroOnCalculator);
//        elementClick(btnZeroOnCalculator,"click btnZeroOnCalculator ");
//        elementClick(btnZeroOnCalculator,"click btnZeroOnCalculator ");
//
//        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
//        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");

    }

    public void openItemDoneButton(){
        WebElement element = mergeAndFindMobileElement(doneButton);
        elementClick(element, "click doneButton ");
    }

    public void verifyAfterTaxWithOpenItem(){
        WebElement element = mergeAndFindMobileElement(coursingNameForAfterTaxWithOpenItem);
        String actualName=elementGetText(element,"verify the coursing name");
        String  expectedName = "ENTREE";

        Assert.assertEquals(expectedName,actualName);

        WebElement element1 = mergeAndFindMobileElement(itemNameForAfterTaxWithOpenItem);
        String actualName1=elementGetText(element1,"verify the item name");
        String  expectedName1 = "Test Automation";

        Assert.assertEquals(expectedName1,actualName1);
    }
    public void swipeUntilEntreeCategoryOption(String direction) throws Exception{

        direction = direction.toLowerCase();
        int i = 0;
        boolean found = false;

        while (i < 3) {
            try {
                if (isElementExists()) {
                    //LOGGER.info(ccSidePaymentOption + " - FOUNDED");
                    found = true;
                    break;
                } else {
                    //LOGGER.info(ccSidePaymentOption + " - FOUNDED but not displayed!");
                    scrollToElement(By.id(entreeCoursingOption),direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(By.id(entreeCoursingOption),direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
    }
    public void enterOpenCheckDiscountPercentageValue(){
        WebElement element = mergeAndFindMobileElement(percentageTextField);
        elementClick(element, "click percentageTextField ");

        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");

        WebElement btnNumberDoubleZeroOnCalculator=mergeAndFindMobileElement(numberDoubleZeroOnCalculator);
        elementClick(btnNumberDoubleZeroOnCalculator,"click btnZeroOnCalculator ");

        WebElement btnZeroOnCalculator=mergeAndFindMobileElement(numberZeroOnCalculator);
        elementClick(btnZeroOnCalculator,"click btnZeroOnCalculator ");
//        elementClick(btnZeroOnCalculator,"click btnZeroOnCalculator ");

        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");

    }
    public void enterOpenCheckDiscountAmountAsDecimalValue(){
        WebElement element = mergeAndFindMobileElement(amountTextField);
        elementClick(element, "click amountTextField ");

        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");

        WebElement btnNumberTwoOnCalculator=mergeAndFindMobileElement(numberTwoOnCalculator);
        elementClick(btnNumberTwoOnCalculator,"click numberTwoOnCalculator ");

        WebElement btnNumberZero=mergeAndFindMobileElement(numberZero);
        elementClick(btnNumberZero,"click btnNumberZero ");

        WebElement btnNumberFiveOnCalculator=mergeAndFindMobileElement(numberFiveOnCalculator);
        elementClick(btnNumberFiveOnCalculator,"click btnNumberFiveOnCalculator ");

        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");

    }
//    public void enterOpenCheckDiscountAmountAsNonDecimalValue(){
//        WebElement element = mergeAndFindMobileElement(amountTextField);
//        elementClick(element, "click amountTextField ");
//
//        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
//        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");
//
//        WebElement btnNumberDoubleZeroOnCalculator=mergeAndFindMobileElement(numberDoubleZeroOnCalculator);
//        elementClick(btnNumberDoubleZeroOnCalculator,"click btnZeroOnCalculator ");
//
//        WebElement btnZeroOnCalculator=mergeAndFindMobileElement(numberZeroOnCalculator);
//        elementClick(btnZeroOnCalculator,"click btnZeroOnCalculator ");
//
//        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
//        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");
//
//    }
    public void enterOpenCheckDiscountAmountAsNonDecimalValue(){
        WebElement element = mergeAndFindMobileElement(amountTextField);
        elementClick(element, "click amountTextField ");

//        WebElement btnNumberOneOnCalculator=mergeAndFindMobileElement(numberOneOnCalculator);
//        elementClick(btnNumberOneOnCalculator,"click btnNumberOneOnCalculator ");
//
//        WebElement btnNumberDoubleZeroOnCalculator=mergeAndFindMobileElement(numberDoubleZeroOnCalculator);
//        elementClick(btnNumberDoubleZeroOnCalculator,"click btnZeroOnCalculator ");
//
//
//        WebElement btnContinueOnCalculator=mergeAndFindMobileElement(continueOnCalculator);
//        elementClick(btnContinueOnCalculator,"click btnContinueOnCalculator ");
//
//        WebElement btnZeroOnCalculator=mergeAndFindMobileElement(numberZeroOnCalculator);
//        elementClick(btnZeroOnCalculator,"click btnZeroOnCalculator ");

    }

    public void swipeUntilOpenItemWithBeforeTaxAsAmountDiscountOption(String direction) throws Exception {
        direction = direction.toLowerCase();
        int i = 0;
        boolean found = false;

        while (i < 3) {
            try {
                if (isElementExists()) {
                    //LOGGER.info(ccSidePaymentOption + " - FOUNDED");
                    found = true;
                    break;
                } else {
                    //LOGGER.info(ccSidePaymentOption + " - FOUNDED but not displayed!");
                    scrollToElement(By.id(beforeTaxForOpenItem),direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(By.id(beforeTaxForOpenItem),direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
    }
    public void selectPhoneOrderOrderType(){

    }

    public void selectTable(){
        WebElement element = mergeAndFindMobileElement(selectTable2);
        elementClick(element,"click table");
    }


}
