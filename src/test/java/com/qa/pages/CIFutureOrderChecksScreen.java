package com.qa.pages;

import com.qa.utils.TestUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.qa.pages.DriverSteup.driver;
import static java.lang.Integer.parseInt;

public class CIFutureOrderChecksScreen extends BasePage {

    String checkNumber = "";

    String futureCheckNumber = "";

    String checkNo="";

    TestUtils testUtils = new TestUtils();

    String staticTxtXpath = "//XCUIElementTypeStaticText[@name=\"{0}\"]";

    String staticTxtXpath1 = "(//XCUIElementTypeStaticText[@name=\"{0}\"])[1]";

    String staticTxtXpath2 = "(//XCUIElementTypeStaticText[@name=\"{0}\"])[2]";

    String courseXpath3 = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String futureFiltersXPath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[{0}]";

    String chkNumber = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]";

    String futureSearchField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[3]";

    String customerName = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell";

    String search = "//XCUIElementTypeSearchField[@name=\"{0}\"]";

    String check = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell";

    String newTabSearchField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String newTabSearchFieldXPath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String btnPhoneDeliveryXpath = "(//XCUIElementTypeStaticText[@name=\"{0}\"])[2]";

    String batchSearchField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]";

    String txtCheckXPath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell";

    String driverXpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[{0}]";

    String driverXPath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]";

    String voidSearchFieldXPath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]";

    String currentCheck = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[{0}]";

    String checksXPath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell";

    String loyaltyXPath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton";

    String amountXPath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]";

    String tlAmountXPath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]";

    String usDollarXpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[10]";

    String newTabXPath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton[{0}]";

    String btnTwoXPath = "(//XCUIElementTypeButton[@name=\"{0}\"])[2]";

    String btnOneXPath="(//XCUIElementTypeButton[@name=\"{0}\"])[1]";

    String applyTotalXpath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch";

    String commonBtn="//XCUIElementTypeButton[@name=\"{0}\"]";

    String phoneOrder="//XCUIElementTypeTable[@name=\"{0}\"]";

    String serviceType1="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[@name=\"{0}\"]";

    String refundSearchFieldXPath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[{0}]";

    String refundCheckXPath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell[1]";

    String reasonXpath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView";

    String tipPopupXPath="//XCUIElementTypeTextView[@name=\"{0}\"]";

    String cardXPath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[{0}]";

    String activeXPath="//XCUIElementTypeStaticText[@name=\"You have 1 Active check's\"]";

    String noPayments="//XCUIElementTypeTable[@name=\"{0}\"]";

    String enableOrderType="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[{0}]/XCUIElementTypeSwitch";

    String wifiXPath="//XCUIElementTypeSwitch[@name=\"wifi-button\"]";

    String password="//XCUIElementTypeOther[@name=\"Sign In\"]/XCUIElementTypeSecureTextField";

    String email="//XCUIElementTypeOther[@name=\"Sign In\"]/XCUIElementTypeTextField";

    String signIn="//XCUIElementTypeButton[@name=\"Sign in\"]";

    String backOffice="//XCUIElementTypeButton[@name=\"    Back Office\"]";

    String pickerXpath1 = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeDatePicker/XCUIElementTypePicker/XCUIElementTypePickerWheel[2]";

    String saleDropDownXPath="//XCUIElementTypeOther[@name=\"Linga rOS\"]/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[{0}]";

    String timeDropDownXPat="//XCUIElementTypeOther[@name=\"Linga rOS\"]/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[{0}]";

    String timeDropDownXPa="//XCUIElementTypeOther[@name=\"Linga rOSs\"]/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]";

    String timeDropDownXPath="(//XCUIElementTypeStaticText[@name=\"Select an Option\"])[1]";

    String btnRunXPat="//XCUIElementTypeOther[@name=\"Linga rOS\"]/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]";

    String btnRunXPath="//XCUIElementTypeOther[@name=\"Linga rOS\"]/XCUIElementTypeOther[4]/XCUIElementTypeOther[4]/XCUIElementTypeLink[@name=\"\uE99C Inventory \uF105\"]";
    public void getFutureTabCheckNumber(String msg) {
//        WebElement element = mergeAndFindElement(chkNumber, "", TestUtils.XPath);
//        checkNumber = elementGetText(element, "test");
        checkNumber=findAndGetText(chkNumber, "", TestUtils.XPath);
        utils.log().info(msg + " - " + checkNumber);
    }

    public void getCheckNo(String msg) {
//        WebElement element = mergeAndFindElement(chkNumber, "", TestUtils.XPath);
//        checkNo = elementGetText(element, "test");
        checkNo=findAndGetText(chkNumber, "", TestUtils.XPath);
        utils.log().info(msg + " - " + checkNo);
    }

    public boolean isCheckDisplayed(String msg) {
        WebElement element = mergeAndFindElement(staticTxtXpath, checkNumber, TestUtils.XPath);
        Boolean isDisplayed = false;
        if (element.isDisplayed()) {
            isDisplayed = true;
        }
        utils.log().info(msg + " is " + isDisplayed);

        return isDisplayed;
    }

    public void getOrderDate(String filter, String msg) {
        WebElement element = mergeAndFindElement(futureFiltersXPath, filter, TestUtils.XPath);
        futureCheckNumber = getAttribute(element, "value");
        utils.log().info(msg + " - " + futureCheckNumber);
    }

    public void clickOrderDate(String filter, String msg) {
//        WebElement element = mergeAndFindElement(futureFiltersXPath, filter, TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(futureFiltersXPath, filter, TestUtils.XPath);
    }
    public boolean getFutureOrderDate(String msg) {
        WebElement element = mergeAndFindElement(staticTxtXpath, futureCheckNumber, TestUtils.XPath);
        Boolean isDisplayed = false;
        if (element.isDisplayed()) {
            isDisplayed = true;
        }
        utils.log().info(msg + " is " + isDisplayed);
        return isDisplayed;
    }

    public void passCheckNumber1(String msg) {
        try {
            // wait 1 sec
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            // handling InterruptedException
        }
        WebElement searchElement = mergeAndFindElement(futureSearchField, "", TestUtils.XPath);
        searchElement.sendKeys(checkNumber);
//        WebElement element = mergeAndFindElement(staticTxtXpath, checkNumber, TestUtils.XPath);
//        elementClick(element, msg);
//        findandclick_Skeys(futureSearchField, "", TestUtils.XPath,"SKeys",checkNumber);
        findandclick(staticTxtXpath, checkNumber, TestUtils.XPath);
        utils.log().info(msg);

    }

    public String getFirstCharacter() {
        String first = String.valueOf(checkNumber.charAt(0));
        return first;
    }

    public Boolean getFiltersInFutureTab() {
        Boolean isDisplayed = false;

        List<WebElement> course = (List<WebElement>) driver.findElements(By.xpath(courseXpath3));

        if (course.size() == 3) {
            isDisplayed = true;
        }
        return isDisplayed;
    }

    public void clickCustomer(String msg) {
//        WebElement element = mergeAndFindElement(customerName, "", TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(customerName, "", TestUtils.XPath);
    }

    public void passName(String customerName, String msg) {
        WebElement element = mergeAndFindElement(search, "Search", TestUtils.XPath);
        elementClick(element, msg);
        element.sendKeys(customerName);
//        findandclick_Skeys(search, "Search", TestUtils.XPath,"SKeys",customerName);
    }

    public void clickCheck(String msg) {
//        WebElement element = mergeAndFindElement(check, "", TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(check, "", TestUtils.XPath);
    }

    public void passNewTabSearch(String msg) {
        try {
            // wait 1 sec
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            // handling InterruptedException
        }
        WebElement element = mergeAndFindElement(newTabSearchField, "", TestUtils.XPath);
        element.sendKeys(checkNumber);
//        findandclick_Skeys(newTabSearchField, "", TestUtils.XPath,"SKeys",checkNumber);
    }

    public void clickPhoneDelivery(String btnName, String msg) {
//        WebElement element = mergeAndFindElement(btnPhoneDeliveryXpath, btnName, TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnPhoneDeliveryXpath, btnName, TestUtils.XPath);
    }

    public void passCheckNumber2(String msg) {
        try {
            // wait 1 sec
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            // handling InterruptedException
        }
        WebElement searchElement = mergeAndFindElement(batchSearchField, "", TestUtils.XPath);
        searchElement.sendKeys(checkNumber);
//        findandclick_Skeys(batchSearchField, "", TestUtils.XPath,"SKeys",checkNumber);
        utils.log().info(msg);
    }

    public void clickCheckInBatch(String msg) {
//        WebElement element = mergeAndFindElement(txtCheckXPath, "", TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(txtCheckXPath, "", TestUtils.XPath);
    }

    public boolean getDriver(String driverJohn) {
        WebElement elementEmptyList = mergeAndFindElement(driverXpath, driverJohn, TestUtils.XPath);
        boolean value = true;
        if (elementEmptyList.isEnabled()) {
            value = false;
        }
        return value;
    }

    public void getNewTabCheckNo(String msg) {
//        try {
//            // wait 1 sec
//            Thread.sleep(5000);
//
//        } catch (InterruptedException e) {
//            // handling InterruptedException
//        }
        WebElement searchElement = mergeAndFindElement(newTabSearchFieldXPath, "", TestUtils.XPath);
        searchElement.sendKeys(checkNumber);
//        WebElement element = mergeAndFindElement(staticTxtXpath, checkNumber, TestUtils.XPath);
//        elementClick(element, msg);
//        findandclick_Skeys(newTabSearchFieldXPath, "", TestUtils.XPath,"SKeys",checkNumber);
        findandclick(staticTxtXpath, checkNumber, TestUtils.XPath);
        utils.log().info(msg);
    }

    public void PassCheckNoInVoidTab(String msg) {
        try {
            // wait 1 sec
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            // handling InterruptedException
        }
        WebElement searchElement = mergeAndFindElement(voidSearchFieldXPath, "", TestUtils.XPath);
        searchElement.sendKeys(checkNumber);
//        findandclick_Skeys(voidSearchFieldXPath, "", TestUtils.XPath,"SKeys",checkNumber);
        utils.log().info(msg);
    }

    public boolean getVoidCheck(String msg) {
        WebElement element = mergeAndFindElement(staticTxtXpath, checkNumber, TestUtils.XPath);
        Boolean isDisplayed = false;
        if (element.isDisplayed()) {
            isDisplayed = true;
        }
        utils.log().info(msg + " is " + isDisplayed);
        return isDisplayed;
    }

    public void clickFutureCheck() {
        try {
            // wait 1 sec
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            // handling InterruptedException
        }
        WebElement searchElement = mergeAndFindElement(futureSearchField, "", TestUtils.XPath);
        searchElement.sendKeys(checkNumber);
//        WebElement tableElement = mergeAndFindElement(staticTxtXpath, checkNumber, TestUtils.XPath);
//        tableElement.click();
//        findandclick_Skeys(futureSearchField, "", TestUtils.XPath,"SKeys",checkNumber);
        findandclick(staticTxtXpath, checkNumber, TestUtils.XPath);
    }

    public void passVoidCheckNo(String msg) {
        try {
            // wait 1 sec
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            // handling InterruptedException
        }
        WebElement searchElement = mergeAndFindElement(voidSearchFieldXPath, "", TestUtils.XPath);
        searchElement.sendKeys(checkNumber);
        utils.log().info(msg);
//        WebElement tableElement = mergeAndFindElement(staticTxtXpath, checkNumber, TestUtils.XPath);
//        tableElement.click();
//        findandclick_Skeys(voidSearchFieldXPath, "", TestUtils.XPath,"SKeys",checkNumber);
        findandclick(staticTxtXpath, checkNumber, TestUtils.XPath);
    }

    public boolean getCurrentDateCheck(String msg) {
        List<WebElement> checks = (List<WebElement>) driver.findElements(By.xpath(checksXPath));
        int value = checks.size();
        WebElement element = mergeAndFindElement(currentCheck,String.valueOf(value), TestUtils.XPath);
        Boolean isDisplayed = false;
        if (element.isDisplayed()) {
            isDisplayed = true;
        }
        utils.log().info(msg + " is " + isDisplayed);
        return isDisplayed;
    }

    public void clickLoyalty(String msg) {
//        WebElement element = mergeAndFindElement(loyaltyXPath, "", TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(loyaltyXPath, "", TestUtils.XPath);
    }

    public void clickWaitingTime(String msg){
        int value=parseInt(TestUtils.dateTimeFormatHour())+2;
        if(value>12){
            value = value - 12;
        }
        String temp = String.valueOf(value);
        SelectPickerWheelValue(pickerXpath1, temp+" o’clock", TestUtils.Order.NEXT, msg);
    }

    public void clickAmount(String msg) {
//        WebElement element = mergeAndFindElement(amountXPath, "", TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(amountXPath, "", TestUtils.XPath);
    }

    public void scrollPayments(String msg) throws Exception {
//        WebElement element = mergeAndFindElement(usDollarXpath, "", TestUtils.XPath);
        scrollToElementPayments( "up");
        utils.log().info(msg);
    }

    public void clickDriver(String driver,String msg) {
        try {

            WebElement element = mergeAndFindElement(driverXpath, driver, TestUtils.XPath);
            elementClick(element, msg);
        }
        catch(Exception ex){
            utils.log().info(msg);
        }
    }

    public Boolean getDriverInNewTab(String msg) {
        WebElement element = mergeAndFindElement(driverXPath, "", TestUtils.XPath);
        Boolean isDisplayed = false;
        if (element.isDisplayed()) {
            isDisplayed = true;
        }
        utils.log().info(msg + " is " + isDisplayed);
        return isDisplayed;
    }

    public void clickNewTab(String phoneOrderTab, String msg) {
        try {
            // wait 1 sec
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // handling InterruptedException
        }
//        WebElement element = mergeAndFindElement(newTabXPath, phoneOrderTab, TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(newTabXPath, phoneOrderTab, TestUtils.XPath);
    }

    public void clickDropDown(String btnDropDown, String msg) {
//        WebElement element = mergeAndFindElement(btnTwoXPath, btnDropDown, TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnTwoXPath, btnDropDown, TestUtils.XPath);
    }

    public String getTotalTip(String totalTip, String msg) {
//        WebElement element = mergeAndFindElement(staticTxtXpath, totalTip, TestUtils.XPath);
//        String value = elementGetText(element, msg);
//        return value;
        return findAndGetText(staticTxtXpath, totalTip, TestUtils.XPath);
    }

    public void clickApplyTotal(String msg) {
//        WebElement element = mergeAndFindElement(applyTotalXpath, "", TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(applyTotalXpath, "", TestUtils.XPath);
    }

    public void clickTLAmount(String amount,String msg){
//        WebElement element = mergeAndFindElement(tlAmountXPath, amount, TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(tlAmountXPath, amount, TestUtils.XPath);
    }

    public boolean checkServiceTypeAccesible(String btnName,String msg){
        WebElement element=mergeAndFindElement(commonBtn,btnName,TestUtils.XPath);
        Boolean isEnabled=true;
        if(element.isEnabled()){
            isEnabled=false;
        }
        utils.log().info(msg +" is "+isEnabled);
        return isEnabled;
    }

    public String getCheckNumber(){
        return checkNumber;
    }

    public boolean getSameCheckNo(String msg){
        WebElement element=mergeAndFindElement(staticTxtXpath,checkNumber,TestUtils.XPath);
        Boolean isDisplayed=false;
        if(element.isDisplayed()){
            isDisplayed=true;
        }
        utils.log().info(msg +" is "+isDisplayed);
        return isDisplayed;
    }

    public String getEmptyList(String emptyList,String msg){
//        WebElement element=mergeAndFindElement(phoneOrder,emptyList,TestUtils.XPath);
//        String text = elementGetText(element,msg);
//        return text;
        return findAndGetText(phoneOrder,emptyList,TestUtils.XPath);
    }

    public String getServiceType1(String serviceType,String msg){
//        WebElement element=mergeAndFindElement(serviceType1,serviceType,TestUtils.XPath);
//        String text = elementGetText(element,msg);
//        return text;
        return findAndGetText(serviceType1,serviceType,TestUtils.XPath);
    }

    public String commonGetText1(String text,String msg){
//        WebElement element=mergeAndFindElement(staticTxtXpath1,text,TestUtils.XPath);
//        String value=elementGetText(element,msg);
//        return value;
        return findAndGetText(staticTxtXpath1,text,TestUtils.XPath);
    }

    public String commonGetText2(String text,String msg){
//        WebElement element=mergeAndFindElement(staticTxtXpath2,text,TestUtils.XPath);
//        String value=elementGetText(element,msg);
//        return value;
        return findAndGetText(staticTxtXpath2,text,TestUtils.XPath);
    }

    public String getItem(String msg){
//        WebElement element = mergeAndFindElement("Mutton biryani ","", TestUtils.Accessibility);
//        String value=elementGetText(element, msg);
//        return value;
        return findAndGetText("Mutton biryani ","", TestUtils.Accessibility);
    }

    public void clickActiveCheck(String msg){
//        WebElement element = mergeAndFindElement(staticTxtXpath, checkNumber, TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(staticTxtXpath, checkNumber, TestUtils.XPath);
    }

    public void clickRefundSearchField(String txtSearchField,String msg){
        WebElement element = mergeAndFindElement(refundSearchFieldXPath, txtSearchField, TestUtils.XPath);
        elementClick(element,msg);
        element.sendKeys(checkNumber);
//        findandclick_Skeys(refundSearchFieldXPath, txtSearchField, TestUtils.XPath,"SKeys",checkNumber);
    }

    public void clickRefundReason(String reason,String msg){
        WebElement element = mergeAndFindElement(reasonXpath, "", TestUtils.XPath);
        element.sendKeys(reason);
//        findandclick_Skeys(reasonXpath, "", TestUtils.XPath,"SKeys",reason);
        utils.log().info(msg);
    }

    public void clickRefundCheck(String msg){
//        WebElement element = mergeAndFindElement(refundCheckXPath, "", TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(refundCheckXPath, "", TestUtils.XPath);
    }

    public boolean getProcessOffline(String btnProcessOffline){
        WebElement element = mergeAndFindElement(commonBtn,btnProcessOffline, TestUtils.XPath);
        boolean value = false;
        if(element.isEnabled())
        {
            value=true;
        }
        return value;
    }

    public void clickBtnOne(String btnDropDown, String msg) {
//        WebElement element = mergeAndFindElement(btnOneXPath, btnDropDown, TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnOneXPath, btnDropDown, TestUtils.XPath);
    }

    public String getTip(String txtTip,String msg){
//        WebElement element = mergeAndFindElement(tipPopupXPath,txtTip, TestUtils.Accessibility);
//        String value=elementGetText(element, msg);
//        return value;
        return findAndGetText(tipPopupXPath,txtTip, TestUtils.Accessibility);
    }

    public String getActiveCheckCount(String activeCount,String msg){
//        WebElement element = mergeAndFindElement(activeXPath,"", TestUtils.XPath);
//        String value=elementGetText(element, msg);
//        return value;
        return findAndGetText(activeXPath,"", TestUtils.XPath);
    }

    public boolean getPrint(String print) {
        WebElement elementEmptyList = mergeAndFindElement(commonBtn, print, TestUtils.XPath);
        boolean value = false;
        if (elementEmptyList.isEnabled()) {
            value = true;
        }
        return value;
    }

    public boolean getSppaxEbt(String btnSPPAXEbt) {
        WebElement element = mergeAndFindElement(staticTxtXpath,btnSPPAXEbt, TestUtils.XPath);
        boolean value = false;
        if (element.isEnabled()) {
            value = true;
        }
        return value;
    }

    public void clickCard(String btnCard,String msg){
//        WebElement element = mergeAndFindElement(cardXPath, btnCard, TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(cardXPath, btnCard, TestUtils.XPath);
    }

    public String checkNumber2(String msg){
//        WebElement element = mergeAndFindElement(staticTxtXpath, checkNo, TestUtils.XPath);
//        String value = elementGetText(element,msg);
//        return value;
        return findAndGetText(staticTxtXpath, checkNo, TestUtils.XPath);
    }

    public String accessibilityId(String id,String msg){
//        WebElement element = mergeAndFindElement(id, "", TestUtils.Accessibility);
//        String value = elementGetText(element,msg);
//        return value;
        return findAndGetText(id, "", TestUtils.Accessibility);
    }

    public String getTextBatch(String txtBatch,String msg){
//        WebElement element=mergeAndFindElement(noPayments,txtBatch,TestUtils.XPath);
//        String text=elementGetText(element,msg);
//        return text;
        return findAndGetText(noPayments,txtBatch,TestUtils.XPath);
    }

    public boolean checkSPPaxEnabled(String btnName,String msg){
        WebElement element=mergeAndFindElement(staticTxtXpath,btnName,TestUtils.XPath);
        Boolean isEnabled=false;
        if(element.isEnabled()){
            isEnabled=true;
        }
        utils.log().info(msg +" is "+isEnabled);
        return isEnabled;
    }

    public void enableOrderType(String pin,String msg){
//        WebElement element=mergeAndFindElement(enableOrderType,pin,TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(enableOrderType,pin,TestUtils.XPath);
    }

    public void clickWifi(String msg){
//        WebElement element=mergeAndFindElement(wifiXPath,"",TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(wifiXPath,"",TestUtils.XPath);
    }

    public void email(String text,String msg){
        WebElement element=mergeAndFindElement(email,"",TestUtils.XPath);
        element.click();
        element.sendKeys(text);
//        findandclick_Skeys(email,"",TestUtils.XPath,"SKeys",text);
        utils.log().info(msg);
    }

    public void password(String text,String msg){
        WebElement element=mergeAndFindElement(password,"",TestUtils.XPath);
        element.sendKeys(text);
//        findandclick_Skeys(password,"",TestUtils.XPath,"SKeys",text);
        utils.log().info(msg);
    }

    public void clickSignIn(String msg){
//        WebElement element=mergeAndFindElement(signIn,"",TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(signIn,"",TestUtils.XPath);
    }

    public void clickReport(String button,String msg){
//        WebElement element=mergeAndFindElement(button,"",TestUtils.Accessibility);
//        elementClick(element,msg);
        findandclick(button,"",TestUtils.Accessibility);
    }

    public void clickSale(String button,String msg){
//        WebElement element=mergeAndFindElement(button,"",TestUtils.Accessibility);
//        elementClick(element,msg);
        findandclick(button,"",TestUtils.Accessibility);
    }

    public void clickSaleRecap(String button,String msg){
//        WebElement element=mergeAndFindElement(button,"",TestUtils.Accessibility);
//        elementClick(element,msg);
        findandclick(button,"",TestUtils.Accessibility);
    }

    public void clickBackOffice(String msg){
//        WebElement element=mergeAndFindElement(backOffice,"",TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(backOffice,"",TestUtils.XPath);
    }

    public boolean getBORefundReport(String msg){
        WebElement element = mergeAndFindElement(staticTxtXpath, checkNumber, TestUtils.XPath);
        Boolean isDisplayed = false;
        if (element.isDisplayed()) {
            isDisplayed = true;
        }
        utils.log().info(msg + " is " + isDisplayed);
        return isDisplayed;
    }

    public void getLatestCheck(String msg) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> phoneOrders = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable"));
        phoneOrders = (List<WebElement>) driver.findElement(By.xpath(checkNumber));
        phoneOrders.get(phoneOrders.size() - 1).click();
        utils.log().info(msg);

    }

    public void clickSaleDropDown(String btnDropDown,String msg){
//        WebElement element=mergeAndFindElement(saleDropDownXPath,btnDropDown,TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(saleDropDownXPath,btnDropDown,TestUtils.XPath);
    }

    public void clickTimeDropDown(String msg){
//        WebElement element=mergeAndFindElement(timeDropDownXPath,"",TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(timeDropDownXPath,"",TestUtils.XPath);
    }

    public void clickBtnRun(String msg){
//        WebElement element=mergeAndFindElement(btnRunXPath,"",TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(btnRunXPath,"",TestUtils.XPath);
    }

}
