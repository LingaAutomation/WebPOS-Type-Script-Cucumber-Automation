package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.qa.pages.DriverSteup.driver;

public class PhoneOrderScreen extends BasePage {


    String phoneOrderTab = "//button//span[text()=' Phone/Web Orders ']";

    String driverStatusTabTitle= "//button//span[text()=' Future ']";

    @FindBy(name = "For Here")
    private WebElement forHereBtnPhoneOrderScreen;

    @FindBy(name = "To Go")
    private WebElement toGoBtnPhoneOrderScreen;

    @FindBy(name = "Edit")
    private WebElement editBtn;

    @FindBy(name = "Cancel Order")
    private  WebElement cancelOrderBtn;

    @FindBy(name = "Print")
    private WebElement printBtn;

//    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Driver is offline Still Do you want to continue\"]")
//    private WebElement driverOffline;

    @FindBy(name = "No")
    private WebElement noBtn;

    @FindBy(name = "Yes")
    private WebElement YesBtn;

    @FindBy(name = "Departure")
    private WebElement departureBtn;

    @FindBy(name = "Out")
    private WebElement outTabBtn;

    @FindBy(name = "Arrival")
    private WebElement arrivalBtn;

    @FindBy(name = "Cash")
    private WebElement cashBtn;

    @FindBy(name = "Delivery orders cannot be submitted here.")
    private WebElement deliveryOrderCannot;

    @FindBy(name = "Payment(s) made on this check,Can you return this to Auto r")
    private WebElement paymentMadeOnThisCheckPopup;

    @FindBy(name = "Future")
    private WebElement futureTab;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"New\"])")
    private WebElement newTabBtn;

    @FindBy(name = "New(1)")
    WebElement newTabBtn1;


    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[3]")
    private WebElement searchTabInFutureTab;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private WebElement searchTabInActiveTab;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private WebElement searchTabClosedTab;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    private WebElement searchTabInOutTab;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    private WebElement searchTabInCompleteTab;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    private WebElement searchTabNewTab;

    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSearchField
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSearchField")
    WebElement searchTabInBarTab;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSearchField")
    WebElement searchTabInBarTab1;

    @FindBy(name = "Clear text")
    WebElement clearTextBtn;

    public void clickPhoneOrderTab(){
        elementClick(phoneOrderTab,"Tapped Phone Order Button");
    }

    public void clickForHereTab(){
        elementClick(forHereBtnPhoneOrderScreen,"Tapped For Here Button in Phone Order Screen");
    }

    public void clickToGoTab(){
        elementClick(toGoBtnPhoneOrderScreen,"Tapped To Go Button in Phone Order Screen");
    }

    public void clickEditBtn(){
        elementClick (editBtn,"Tapped Edit Button in phone order tab");
    }

    public void clickCancelOrderBtn(){
        elementClick (cancelOrderBtn,"Tapped Cancel Order Button in phone order tab");
    }

    public void clickPrintBtn(){
        elementClick (printBtn,"Tapped print Button in phone order tab");
    }

    public String verifyPhoneOrderTab(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return elementGetText(convertWebElement(driverStatusTabTitle),"Phone order Tab is displayed - ");
    }

    public void clickActiveDriver(String name) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Thread.sleep(1000);
        WebElement Auto=(WebElement) driver.findElements(By.xpath(name));
        elementClick(Auto,"Tapped Active Diver as - "+name);
    }
    public void verifyDriverAdded(String Name){
        try{
            WebElement Auto=mergeAndFindElement(Name,"",TestUtils.Accessibility);
            if (Auto.isDisplayed()) {
                utils.log().info("Driver name is - "+ Name);
            }}
        catch (Exception e){
        }

    }


    public void verifyPopup(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // WebElement el2 = mergeAndFindElement("Driver is offline   Still Do you want to continue","",TestUtils.Accessibility);
        WebElement el2=mergeAndFindElement("//XCUIElementTypeStaticText[@name=\"Driver is offline   Still Do you want to continue\"]","",TestUtils.XPath);
        if(el2.isDisplayed()){
            utils.log().info("Driver Offline Popup is Displayed");
        }else {
            utils.log().info("Driver Offline Popup is not  Displayed");
        }
    }

    public void tapNoButton(){
        elementClick(noBtn,"Tapped No Button in the Driver offline popup");
    }

    public void tapYesButton(){
        elementClick(YesBtn,"Tapped No Button in the Driver offline popup");
    }

    public void clickDepartureBtn(){
        elementClick(departureBtn,"Tapped Departure Button");
    }

    public void clickOutTab() throws InterruptedException {
        //  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        Thread.sleep(900);
        elementClick(outTabBtn,"Tapped Out Tab Button");
    }

    public void clickArrivalTab(){
        elementClick(arrivalBtn,"Tapped Out Tab Button");
    }

    public String verifyCashWindow(){
        return elementGetText(cashBtn,"Tapped cash button");
    }

    public String getWarningMsg(){
        return elementGetText(deliveryOrderCannot,"Warning Message - ");
    }

    public String verifyPaymentMadePopup(){
        return elementGetText(paymentMadeOnThisCheckPopup,"Void Popup is Displayed - ");
    }

    public void clickFutureTab(){
        elementClick(futureTab,"Tapped Future Tab");
    }

    public void clickNewTab(){
        elementClick(newTabBtn,"Tapped New Tab");
    }

    public void clickNewTab1(){
        elementClick(newTabBtn1,"Tapped New Tab");
    }

    public void selectCloseCheckInFutureTab() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber = TestUtils.globalCheckNumber;
        searchTabInFutureTab.clear();
        searchTabInFutureTab.sendKeys(globalCheckNumber);
        //  WebElement phoneOrders = mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        // elementClick(phoneOrders,"Tapped Closed Check - "+ globalCheckNumber);
//        try {
//            WebElement phoneOrders = (WebElement) driver.findElement(By.xpath()("(//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"])[2]");
//
//            //   (//XCUIElementTypeStaticText[@name="Auto Ragav"])[1]
//
//            if (phoneOrders.isDisplayed()) {
//                //elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
//                utils.log().info("Closed Check be duplicate" + globalCheckNumber);
//            }
//        } catch (Exception h) {
        WebElement phoneOrders1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"]"));

        if (phoneOrders1.isDisplayed()) {
            elementClick(phoneOrders1, "Tapped Closed Check in Future tab - " + globalCheckNumber);
        }else{
            utils.log().info("Not see closed check "+globalCheckNumber);
        }

        // }
    }

    public void selectCloseCheckInOutTab() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        Thread.sleep(800);
        String globalCheckNumber = TestUtils.globalCheckNumber;
        searchTabInOutTab.clear();
        searchTabInOutTab.sendKeys(globalCheckNumber);
        //  WebElement phoneOrders = mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        // elementClick(phoneOrders,"Tapped Closed Check in out tab - "+ globalCheckNumber);
//        try {
//            WebElement phoneOrders = (WebElement) driver.findElement(By.xpath()("(//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"])[2]");
//
//            //   (//XCUIElementTypeStaticText[@name="Auto Ragav"])[1]
//
//            if (phoneOrders.isDisplayed()) {
//                //elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
//                utils.log().info("Closed Check be duplicate" + globalCheckNumber);
//            }
//        } catch (Exception h) {
        WebElement phoneOrders1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"]"));

        if (phoneOrders1.isDisplayed()) {
            elementClick(phoneOrders1, "Tapped Closed Check in Out tab - " + globalCheckNumber);
        }else {
            utils.log().info("closed check is not available"+ globalCheckNumber);
        }
//        }
    }

    public void selectCloseCheckInNewTab() throws InterruptedException {
        Thread.sleep(800);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabNewTab.clear();
        searchTabNewTab.sendKeys(globalCheckNumber);
        // WebElement phoneOrders =  mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        //elementClick(phoneOrders,"Tapped Closed Check in New Tab - "+ globalCheckNumber);
//      //  try {
//            WebElement phoneOrders = (WebElement) driver.findElement(By.xpath()("(//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"])[2]");
//
//            //   (//XCUIElementTypeStaticText[@name="Auto Ragav"])[1]
//
//            if (phoneOrders.isDisplayed()) {
//                //elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
//                utils.log().info("New Tab Check be duplicate" + globalCheckNumber);
//            }
        //  } catch (Exception h) {
        WebElement phoneOrders1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"]"));

        if (phoneOrders1.isDisplayed()) {
            elementClick(phoneOrders1, "Tapped Closed Check in New tab - " + globalCheckNumber);
        }else{
            utils.log().info("closed check is not available"+ globalCheckNumber);
        }
        //elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
        // }

    }

//    public void selectClosedCheckFromClosedTab() throws InterruptedException {
//        Thread.sleep(1200);
//        String globalCheckNumber=TestUtils.globalCheckNumber;
//        searchTabClosedTab.sendKeys(globalCheckNumber);
//        WebElement phoneOrders =  mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
//        elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
//    }

    public void selectClosedCheckFromClosedTab1() throws InterruptedException {
        //   driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        Thread.sleep(1000);
        String globalCheckNumber = TestUtils.globalCheckNumber1;
        searchTabClosedTab.clear();
        searchTabClosedTab.sendKeys(globalCheckNumber);
        //  WebElement phoneOrders =  mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
//        try {
//            WebElement phoneOrders = (WebElement) driver.findElement(By.xpath()("(//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"])[2]");
//
//            //   (//XCUIElementTypeStaticText[@name="Auto Ragav"])[1]
//
//            if (phoneOrders.isDisplayed()) {
//                //elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
//                utils.log().info("Closed Check be duplicate" + globalCheckNumber);
//            }
//        } catch (Exception h) {
        WebElement phoneOrders1 = (WebElement) driver.findElements(By.xpath(globalCheckNumber));

        if (phoneOrders1.isDisplayed()) {
            elementClick(phoneOrders1, "Tapped Closed Check in closed tab - " + globalCheckNumber);
        }else{
            utils.log().info("closed check is not available"+ globalCheckNumber);
        }
        //elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
        //   }

    }
    public void selectClosedCheckFromClosedTab() throws InterruptedException {
        //   driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        Thread.sleep(1000);
        String globalCheckNumber = TestUtils.globalCheckNumber;
        searchTabClosedTab.clear();
        searchTabClosedTab.sendKeys(globalCheckNumber);
        //  WebElement phoneOrders =  mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
//        try {
//            WebElement phoneOrders = (WebElement) driver.findElement(By.xpath()("(//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"])[2]");
//
//            //   (//XCUIElementTypeStaticText[@name="Auto Ragav"])[1]
//
//            if (phoneOrders.isDisplayed()) {
//                //elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
//                utils.log().info("Closed Check be duplicate" + globalCheckNumber);
//            }
//        } catch (Exception h) {
        WebElement phoneOrders1 = (WebElement) driver.findElements(By.xpath(globalCheckNumber));

        if (phoneOrders1.isDisplayed()) {
            elementClick(phoneOrders1, "Tapped Closed Check in closed tab - " + globalCheckNumber);
        }else{
            utils.log().info("closed check is not available"+ globalCheckNumber);
        }
        //elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
        //   }

    }
    public void selectClosedCheckFromActiveTab() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabInActiveTab.clear();
        searchTabInActiveTab.sendKeys(globalCheckNumber);
        // WebElement phoneOrders =  mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        //elementClick(phoneOrders,"Tapped Closed Check in active tab - "+ globalCheckNumber);
//        try {
//            WebElement phoneOrders = (WebElement) driver.findElement(By.xpath()("(//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"])[2]");
//
//            //   (//XCUIElementTypeStaticText[@name="Auto Ragav"])[1]
//
//            if (phoneOrders.isDisplayed()) {
//                //elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
//                utils.log().info("Active Check be duplicate" + globalCheckNumber);
//            }
//        } catch (Exception h) {
        WebElement phoneOrders1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"]"));

        if (phoneOrders1.isDisplayed()) {
            elementClick(phoneOrders1, "Tapped Closed Check in active tab - " + globalCheckNumber);
        }else{
            utils.log().info("closed check is not available"+ globalCheckNumber);
        }
        //elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
        // }

    }

    public void selectCloseCheckInCompleteTab() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabInCompleteTab.clear();
        searchTabInCompleteTab.sendKeys(globalCheckNumber);
        // WebElement phoneOrders =  mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        //elementClick(phoneOrders,"Tapped Closed Check in complete Tab - "+ globalCheckNumber);

//        try {
//            WebElement phoneOrders = (WebElement) driver.findElement(By.xpath()("(//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"])[2]");
//
//            //   (//XCUIElementTypeStaticText[@name="Auto Ragav"])[1]
//
//            if (phoneOrders.isDisplayed()) {
//                //elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
//                utils.log().info("Active Check be duplicate" + globalCheckNumber);
//            }
//        } catch (Exception h) {
        WebElement phoneOrders1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"]"));

        if (phoneOrders1.isDisplayed()) {
            elementClick(phoneOrders1, "Tapped Closed Check in Complete tab - " + globalCheckNumber);
        }else{
            utils.log().info("closed check is not available"+ globalCheckNumber);
        }
        //elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
        //  }
    }


    public void verifyClosedCheckInCompleteTab() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabInCompleteTab.clear();
        searchTabInCompleteTab.sendKeys(globalCheckNumber);
        WebElement phoneOrders =  mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        if (phoneOrders.isDisplayed()){
            utils.log().info(globalCheckNumber + " - Closed Check is displayed in complete tab");
        }else {
            utils.log().info("Closed check is not displayed");
        }
    }

    public void verifyClosedCheckInNewTab() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabNewTab.clear();
        searchTabNewTab.sendKeys(globalCheckNumber);
        WebElement phoneOrders =  mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        if (phoneOrders.isDisplayed()){
            utils.log().info(globalCheckNumber + " - Closed Check is displayed in new tab");
        }else {
            utils.log().info("Closed check is not displayed");
        }
    }

    public void verifyClosedCheckInOutTab() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabInOutTab.clear();
        searchTabInOutTab.sendKeys(globalCheckNumber);
        WebElement phoneOrders =  mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        if (phoneOrders.isDisplayed()){
            utils.log().info(globalCheckNumber + " - Closed Check is displayed in out tab");
        }else {
            utils.log().info("Closed check is not displayed");
        }
    }

    public void verifyClosedCheckInFutureTab() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabInFutureTab.clear();
        searchTabInFutureTab.sendKeys(globalCheckNumber);
        WebElement phoneOrders = mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        if (phoneOrders.isDisplayed()){
            utils.log().info(globalCheckNumber + " - Closed Check is displayed in future tab");
        }else {
            utils.log().info("Closed check is not displayed");
        }
    }

    public void verifyClosedCheckInActiveCheckTab() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabInActiveTab.clear();
        searchTabInActiveTab.sendKeys(globalCheckNumber);
        WebElement phoneOrders =  mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        if (phoneOrders.isDisplayed()){
            utils.log().info(globalCheckNumber + " - Closed Check is displayed in Active tab");
        }else {
            utils.log().info("Closed check is not displayed");
        }
    }

    public void verifyClosedCheckInClosedCheckTab() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabClosedTab.clear();
        searchTabClosedTab.sendKeys(globalCheckNumber);
        WebElement phoneOrders = mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        if (phoneOrders.isDisplayed()){
            elementClick(phoneOrders,"Tapped Closed Checks");
            utils.log().info(globalCheckNumber + " - Closed Check is displayed in closed tab");
        }else {
            utils.log().info("Closed check is not displayed");
        }
    }

    public void verifyPaidCheckIsVisibleOrNot() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabInOutTab.clear();
        searchTabInOutTab.sendKeys(globalCheckNumber);
        WebElement phoneOrders =  mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        if (phoneOrders.isDisplayed()){
            utils.log().info(globalCheckNumber + " - Closed Check is displayed in closed tab");
        }else {
            utils.log().info("Closed check is not displayed");
        }

    }

    //    Added Today

    public void pressClosedCheckInBarTab() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabInBarTab.clear();
        searchTabInBarTab.sendKeys(globalCheckNumber);
        WebElement phoneOrders =  mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]","",TestUtils.XPath);
        elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
    }
    public void pressClosedCheckInBarTab1() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber1;
        searchTabInBarTab.clear();
        searchTabInBarTab.sendKeys(globalCheckNumber);
        WebElement phoneOrders =  mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]","",TestUtils.XPath);
        elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
    }


    public void clickClearText() throws InterruptedException {
        Thread.sleep(100);
        elementClick(clearTextBtn,"Tapped Clear Text");
    }

    public void clickMergedBar() throws InterruptedException {
        Thread.sleep(500);
        String globalCheckNumber=TestUtils.globalCheckNumber;
        searchTabInBarTab1.clear();
        searchTabInBarTab1.sendKeys(globalCheckNumber);                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]
        WebElement phoneOrders =  mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]","",TestUtils.XPath);
        elementClick(phoneOrders,"Tapped Closed Check in closed tab - "+ globalCheckNumber);
    }
}
