package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;


public class ClockInScreen extends UserLoginScreen{

    public WebDriver driver = TestUtils.driver;

    public ClockInScreen() {

        PageFactory.initElements(this.driver,this);
    }


    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"1\"])[3]")
    WebElement paymentPin1;

    @FindBy(xpath = "//span[.=' Clear ']")
    WebElement pinC;

//    @FindBy(name = "00")
//    private WebElement pin00;

    @FindBy (name = "00")
    WebElement pin00;

    @FindBy(name = "0")
    WebElement pin0;

    @FindBy (name = "1")
    WebElement pin1;

    @FindBy (name = "2")
    WebElement pin2;

    @FindBy (name = "3")
    WebElement pin3;

    @FindBy (name = "4")
    WebElement pin4;

    @FindBy (name = "5")
    WebElement pin5;

    @FindBy (name = "6")
    WebElement pin6;

    @FindBy (name = "7")
    WebElement pin7;

    @FindBy (name = "8")
    WebElement pin8;

    @FindBy (name = "9")
    WebElement pin9;

    @FindBy (name = "Clear")
    private WebElement clearBtn;

    String loginBtn = "//button[contains(.,'Login')]";


    @FindBy (id = "To Login enter your ID number or swipe the card")
    private WebElement titleTxt;

    @FindBy (xpath  = "//XCUIElementTypeButton[@name='Done']")
    private WebElement doneBtn;

    @FindBy (name = "Invalid Pin")
    private WebElement errTxt;

    //XCUIElementTypeButton[@name=\"    Bar Tab\"]
    @FindBy(name = "    Bar Tab")
    WebElement barTabBtn;

    @FindBy (xpath = "//XCUIElementTypeButton[@name='Continue']")
    private WebElement continueBtn;

    String accessibilityIdForPin1 = "1";
    String accessibilityIdForPin2 = "2";
    String accessibilityIdForPin3 = "3";
    String accessibilityIdForPin4 = "4";
    String btnLoginXPath = "//XCUIElementTypeButton[@name=\"Login\"]";


    public String getTitle() {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        return elementGetText(titleTxt, "user login window's title is - ");
    }

    public void pressPin0() {
        elementClick(pin0, "Tapped pin0");
    }

    public void pressPin00(){elementClick(pin00,"Tapped pin00");}

    public void press1InPaymentWindow(){elementClick(paymentPin1,"Tapped payment1");}

    public void pressPin1() { elementClick(pin1, "Tapped pin1"); }

    public void pressPin2() {
        elementClick(pin2, "Tapped pin2");
    }

    public void pressPin3() {
        elementClick(pin3, "Tapped pin3");
    }

    public void pressPin4() {
        elementClick(pin4, "Tapped pin4");
    }

    public void pressPin5() {
        elementClick(pin5, "Tapped pin5");
    }


    public void pressPin6() {
        elementClick(pin6, "Tapped pin5");
    }

    public void pressPin6Time() {
        elementClick(pin6Time1, "Tapped pin 6");
    }

    public void pressPin5Time() {
        elementClick(pin5Time1, "Tapped pin 5");
    }
    public void pressPin7Time() {
        elementClick(pin7Time1, "Tapped pin7 ");
    }
    public void pressPin8Time() {
        elementClick(pin8Time1, "Tapped pin 8");
    }
    public void pressPin4Time() {
        elementClick(pin4Time1, "Tapped pin 4");
    }
    public void pressPin3Time() {
        elementClick(pin3Time1, "Tapped pin 3");
    }

    public void pressPin2Time() {
        elementClick(pin2Time1, "Tapped pin 2");
    }
    public void pressPin1Time() {

        elementClick(driver.findElement(By.xpath("//ion-grid/ion-row[4]/ion-col[1]/button")), "Tapped pin 1");
    }
    public void pressPin0Time() {
        elementClick(pin0Time1, "Tapped pin 0");
    }
    public void pressPinclr() {
        elementClick(pinClrTime1, "Tapped pin Clr");
    }
    public void pressPin9Time() {
        elementClick(pin9Time1, "Tapped pin 9 ");
    }
    public void pressPin7() {
        elementClick(pin7, "Tapped pin7");
    }

    public void pressPin8() {
        elementClick(pin8, "Tapped pin8");
    }

    public void pressPin9() {
        elementClick(pin9, "Tapped pin9");
    }

    public void pressPinC(){elementClick (pinC, "Tapped pinC");}

    public void pressClear() {
        elementClick(clearBtn, "Pin text field is cleared.");
    }

    public void pressLogin(){
        elementClick(loginBtn, "Tapped Login.");

    }


    public void pressDone(){
        elementClick(doneBtn, "Tapped Done button.");
    }

    public void pressBarTabBtn() throws InterruptedException { elementClick(barTabBtn, "Tapped BarTab button.");}

    public void pressContinueBarTabLoginBtn(){
        elementClick(continueBtn, "Tapped Continue button.");
    }

    public String getErrTxt() {
        String err = getText(errTxt, "error text is - ");
        return err;
    }

//    public OrderTypeWindow ClockIn (){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        pressPin1Time();
//        pressPin2Time();
//        pressPin3Time();
//        pressPin4Time();
//        pressLogin();
//        return new OrderTypeWindow();
//    }

    public void clockinPin(){
        pressPin1();
        pressPin2();
        pressPin3();
        pressPin4();
    }

    public void clockInPinForServerRole(){
        pressPin4();
        pressPin5();
        pressPin6();
        pressPin7();
    }

    public void clockInPinForServerRole1(){
        pressPin7();
        pressPin6();
        pressPin5();
        pressPin4();
    }

    public void clockOutPinForServerRole(){
        pressPin4();
        pressPin5();
        pressPin6();
        pressPin7();
    }

    public void clockOutPinForServerRole1(){
        pressPin7();
        pressPin6();
        pressPin5();
        pressPin4();
    }
    @FindBy(name = "Shift Record")
    WebElement shiftRecordWindow;
    public void verifyShiftRecordWindow(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        Assert.assertEquals(shiftRecordWindow.getText(),"Shift Record");
        utils.log().info("Shift record window is visible");
    }

    public void clickShiftRole(String name){
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        WebElement role = (WebElement) driver.findElement(By.xpath(""));
//        elementClick(role,"Selected Role as - "+role.getText());
    }
    public void ClockInForClockInRequired(){
        pressPin0();
        pressPin9();
        pressPin0();
        pressPin9();
        pressLogin();
    }

    public void ClockInForClockInRequired1(){
        pressPin0();
        pressPin9();
        pressPin0();
        pressPin9();

    }

    public void loggedInOfMultiRoleForClockInRequired(){
        pressPin5();
        pressPin6();
        pressPin5();
        pressPin6();
        pressLogin();
    }
    @FindBy(name = "Clockin is required to log in")
    WebElement clockInRequiredLogin;
    public void ClockIsInRequiredForClockIn()
    {
        Assert.assertEquals(clockInRequiredLogin.getText(),"Clockin is required to log in");
    }

    public BarTabScreen  ClockInForBarTab(){
        pressPin0();
        pressPin0();
        pressPin0();
        pressPin1();
        pressLogin();
        return new BarTabScreen();
    }

    public BarTabScreen  ClockInForBarTabForBasicValidation(){
        pressPin9Time();
        pressPin8Time();
        pressPin9Time();
        pressPin8Time();
        pressLogin();
        return new BarTabScreen();
    }
    public void ClockInForBarTab1(){
        pressPin0();
        pressPin0();
        pressPin0();
        pressPin1();


    }

    public void clockInForDineIn(){
        pressPin0();
        pressPin0();
        pressPin0();
        pressPin2();
        pressLogin();
    }

    public void clockInForDineIn1(){
        pressPin0();
        pressPin0();
        pressPin0();
        pressPin2();

    }
    public void clockInForEachSale(){
       pressPin6();
       pressPin5();
        pressPin6();
        pressPin5();
        pressLogin();
    }
    public void ClockIn (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pressPin1Time();
        pressPin2Time();
        pressPin3Time();
        pressPin4Time();
        pressLogin();
    }

    public ClockInScreen ClockInForBarTabUsingBarTabButton(){
        pressPin1();
        pressPin2();
        pressPin3();
        pressPin4();
        return new ClockInScreen();
    }

    public TableLayOutScreen ClockInForTableScreen(){
        pressPin2();
        pressPin2();
        pressPin2();
        pressPin2();
        pressLogin();
        return new TableLayOutScreen();
    }
    public void priceFrenchFries(){
        pressPin7();
        pressPin5();
        pressPin00();
    }
    public void enterHugePayment(){
        pressPinC();
        pressPin9();
        pressPin9();
        pressPin00();
    }

    public void enterManualPayment(String number){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        int numbers = number.length();
        pressPinC();
        for(int i=0;i<numbers;i++) {
            char numb = number.charAt(i);

            WebElement num = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\""+numb+"\"]"));
            elementClick(num,"Selected - "+num.getText());
        }
    }
    public void enterFrenchFrieseAmount(){
        pressPinC();
        press1InPaymentWindow();
        pressPin7();
        pressPin0();
        pressPin00();
    }
    public void enterFrenchFrieseAmount3seat(){
        pressPinC();
        pressPin8();
        pressPin5();
        pressPin00();
    }

    public void logInWithValidPin(){
        WebElement pin1 = mergeAndFindElement(accessibilityIdForPin1,"", TestUtils.Accessibility);
        WebElement pin2 = mergeAndFindElement(accessibilityIdForPin2,"",TestUtils.Accessibility);
        WebElement pin3 = mergeAndFindElement(accessibilityIdForPin3,"",TestUtils.Accessibility);
        WebElement pin4 = mergeAndFindElement(accessibilityIdForPin4,"",TestUtils.Accessibility);
        WebElement btnLogin = mergeAndFindElement(btnLoginXPath,"",TestUtils.XPath);
        elementClick(pin1,"Tapped pin1");
        elementClick(pin2,"Tapped pin2");
        elementClick(pin3,"Tapped pin3");
        elementClick(pin4,"Tapped pin4");
        elementClick(btnLogin,"Tapped Login.");
    };

    public void LogInWithValidPin(){
        WebElement pin1 = mergeAndFindElement(accessibilityIdForPin1,"", TestUtils.Accessibility);
        WebElement btnLogin = mergeAndFindElement(btnLoginXPath,"",TestUtils.XPath);
        elementClick(pin1,"Tapped pin1");
        elementClick(pin1,"Tapped pin1");
        elementClick(pin1,"Tapped pin1");
        elementClick(pin1,"Tapped pin1");
        elementClick(btnLogin,"Tapped Login.");
    }

    public void enterClockPinForPhone(){
//        pressPin4();
//        pressPin3();
//        pressPin2();
//        pressPin1();
        pressPin4Time();
        pressPin3Time();
        pressPin2Time();
        pressPin1Time();
        pressLogin();
    }

    public void enterClockPinForPhone1(){
        pressPin4();
        pressPin3();
        pressPin2();
        pressPin1();

    }
    @FindBy(name = "Clockin")
    WebElement clockInBtn;
    public void clickClockIn(){
        elementClick(clockInBtn,"Clock In Selected");
    }

    @FindBy(name = "Enter Approver PIN or Swipe Card")
    WebElement pinOrSwipeCard;

    public String verifyApproverPin(){
        return  elementGetText(pinOrSwipeCard,"Display Pin or Swipe Card popup ");
    }

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"TIME  CLOCK\"]")
    WebElement timeClockBtn;

    public void clickTimeClockButtonInTheClockInScreen() throws InterruptedException {
//        Thread.sleep(1000);
//        WebElement timeClockBtn = (WebElement) driver.findElement(By.xpath()("TIME CLOCK");
        elementClick(timeClockBtn, "Selected - " + timeClockBtn.getText());
    }

    @FindBy(name = "Clocked In Successfully")
    WebElement clockInSuccessPopup;
    public String verifyClockInPopup(){
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        return elementGetText(clockInSuccessPopup,"popup As - ");
    }

    @FindBy(name = "Clocked Out Successfully")
    WebElement clockOutSuccessPopup;
    public String verifyClockOutPopup(){
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        return elementGetText(clockOutSuccessPopup,"popup As - ");
    }
    @FindBy(name = "Clock Out")
    WebElement clockOutBtn;
    public void clickClockOut(){
        elementClick(clockOutBtn,"Clock Out Selected");
    }
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"1\"])")
    WebElement enterPin1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"2\"])")
    WebElement enterPin2;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"3\"])")
    WebElement enterPin3;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"4\"])")
    WebElement enterPin4;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"5\"])")
    WebElement enterPin5;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"6\"])")
    WebElement enterPin6;
    //XCUIElementTypeButton[@name="Continue"]
    @FindBy(name = "Continue")
    WebElement enterContinueBtn;

    public void enterClockPin(){
//        elementClick(enterPin4,"Selected Pin 4");
//        elementClick(enterPin3,"Selected Pin 3");
//        elementClick(enterPin2,"Selected Pin 2");
//        elementClick(enterPin1,"Selected Pin 1");
        pressPin4Time();
        pressPin3Time();
        pressPin2Time();
        pressPin1Time();
        elementClick(enterContinueBtn,"Selected continue");
    }

    public void enterClockPin1(){

        pressPin1();
        pressPin2();
        pressPin3();
        pressPin4();

        elementClick(enterContinueBtn,"Selected continue");
    }


    public void enterClockPinOut(){

        pressPin1();
        pressPin2();
        pressPin3();
        pressPin4();
        elementClick(enterContinueBtn,"Selected continue");
    }

    public void enterClockPinOutForMultiRole(){
        pressPin5();
        pressPin6();
        pressPin5();
        pressPin6();

        elementClick(enterContinueBtn,"Selected continue");
    }

    public void enterClockPin1ForMultiRole(){
//        elementClick(enterPin5,"Selected Pin 5");
//        elementClick(enterPin6,"Selected Pin 6");
//        elementClick(enterPin5,"Selected Pin 5");
//        elementClick(enterPin6,"Selected Pin 6");

        pressPin5();
        pressPin6();
        pressPin5();
        pressPin6();

        elementClick(enterContinueBtn,"Selected continue");
    }

    public void enterClockPin1ForMultiRole1(){
//        elementClick(enterPin5,"Selected Pin 5");
//        elementClick(enterPin6,"Selected Pin 6");
//        elementClick(enterPin5,"Selected Pin 5");
//        elementClick(enterPin6,"Selected Pin 6");

        pressPin5();
        pressPin6();
        pressPin5();
        pressPin6();


    }
    public void enterInvalidClockInPin(){
        pressPin2();
        pressPin1();
        pressPin3();
        pressPin4();
//
//        elementClick(enterPin2,"Selected Pin 2");
//        elementClick(enterPin1,"Selected Pin 1");
//        elementClick(enterPin3,"Selected Pin 3");
//
//        elementClick(enterPin4,"Selected Pin 4");

        elementClick(enterContinueBtn,"Selected continue");
    }

    public void enterInvalidClockOutPin(){

//        elementClick(enterPin2,"Selected Pin 2");
//        elementClick(enterPin1,"Selected Pin 1");
//        elementClick(enterPin3,"Selected Pin 3");
//
//        elementClick(enterPin4,"Selected Pin 4");
        pressPin2();
        pressPin1();
        pressPin3();
        pressPin4();
        elementClick(enterContinueBtn,"Selected continue");
    }
    public String bussiness = " ";

    public void getBussinessDate(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//        WebElement bussinessDate = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]");
        WebElement bussinessDate = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[8]/XCUIElementTypeStaticText[3]"));
        String bussinessTxt = bussinessDate.getText();
        utils.log().info("Current "+bussinessTxt);

        // Split the String by Regex Pattern
        Pattern P =Pattern.compile("-");

        String[] splitt = P.split(bussinessTxt,2);
        bussiness = splitt[1];
        TestUtils.bussiness1 = bussiness;
        utils.log().info("Date - "+bussiness);
    }

    public void verifyBussinessDateWithCloseDayScreen(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        WebElement close_BusinessDate = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeStaticText[1]"));
        String close_BusinessDateTxt = close_BusinessDate.getText();
        utils.log().info("In Close day Business Date "+close_BusinessDateTxt);
        if(close_BusinessDateTxt.contains(TestUtils.bussiness1)){
            utils.log().info("Bussiness Date is SAME");
        }else{
            utils.log().info("Bussiness Date is NOT SAME");
        }
    }

    public void verifyInvalidPin(){
        WebElement invalidPin = (WebElement) driver.findElement(By.xpath("Invalid Pin"));
        if(invalidPin.isDisplayed()){
            utils.log().info("Invalid Pin Popup is Displayed");
        }else{
            utils.log().info("Invalid Pin Popup is NOT Displayed");
        }
    }

    public void verifyPopupAsYouHaveClockedInAlreadyPopup(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement invalidPin = (WebElement) driver.findElement(By.xpath("You have clocked in already"));
        if(invalidPin.isDisplayed()){
            utils.log().info(invalidPin.getText()+ " -  Popup is Displayed");
        }else{
            utils.log().info(invalidPin.getText()+" - Popup is NOT Displayed");
        }
    }

    public void verifyPopupAsYouHaveClockedOutAlreadyPopup(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement invalidPin = (WebElement) driver.findElement(By.xpath("You have clocked out already"));
        if(invalidPin.isDisplayed()){
            utils.log().info(invalidPin.getText()+" - Popup is Displayed");
        }else{
            utils.log().info(invalidPin.getText()+" - Popup is NOT Displayed");
        }
    }
@FindBy(xpath = "//XCUIElementTypeButton[@name=\"    Operation\"]")
WebElement operationBtnClockInScreen;
    public void clickOperationButton(){
        elementClick(operationBtnClockInScreen,"Operation Button Selected - "+operationBtnClockInScreen.getText());
    }

    public void verifyOperationScreen(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(operationBtnClockInScreen.getText()," Operation");
        utils.log().info("Operation screen is visible");
    }


    public void clickQsrButton() throws Exception {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

                                                                                 //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[12]/XCUIElementTypeSwitch
        WebElement qsrPos = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[12]/XCUIElementTypeSwitch"));

    //    scrollToElement(qsrPos,"up");
     //   elementClick(qsrPos,"Qsr Selected");

        try {
            if(find(qsrPos,2)){
                elementClick(qsrPos, "Tapped QSR ");
            }else {
                scrollToElement(qsrPos,"up");
                elementClick(qsrPos, "Tapped QSR");
            }
        }catch (Exception w){
            scrollToElement(qsrPos,"up");
            elementClick(qsrPos, "Tapped QSR");
        }
    }

    public void clickBarTabButton() throws Exception {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

         WebElement BarTabPos = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[8]/XCUIElementTypeSwitch"));


        try {
            if(find(BarTabPos,2)){
                elementClick(BarTabPos, "Tapped BArTab");
            }else {
                scrollToElement(BarTabPos,"up");
                elementClick(BarTabPos, "Tapped BarTab");
            }
        }catch (Exception w){
            scrollToElement(BarTabPos,"up");
            elementClick(BarTabPos, "Tapped BarTab");
        }
    }

    public void clickDineInButtonInPOSSettings() throws Exception {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

         WebElement BarTabPos = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch"));


        try {
            if(find(BarTabPos,2)){
                elementClick(BarTabPos, "Tapped Dine-IN ");
            }else {
                scrollToElement(BarTabPos,"up");
                elementClick(BarTabPos, "Tapped Dine-IN");
            }
        }catch (Exception w){
            scrollToElement(BarTabPos,"up");
            elementClick(BarTabPos, "Tapped Dine-IN");
        }
    }

    @FindBy(name = "QSR service is disabled in POS settings.")
    WebElement qsrServiceIsDisabled;
    public void verifyQsrServiceIsDisabled(){
        Assert.assertEquals(qsrServiceIsDisabled.getText(),"QSR service is disabled in POS settings.");
        utils.log().info(" POPup is - "+qsrServiceIsDisabled.getText());
    }
    @FindBy(name = "BarTab is disabled in POS settings.")
    WebElement barTabServiceIsDisabled;
    public void verifyBarTabServiceIsDisabled(){
        Assert.assertEquals(barTabServiceIsDisabled.getText(),"BarTab is disabled in POS settings.");
        utils.log().info(" POPup is - "+barTabServiceIsDisabled.getText());
    }

    @FindBy(name = "Dine is disabled in POS settings.")
    WebElement dineInServiceIsDisabled;
    public void verifyDineInServiceIsDisabled(){

    }

    @FindBy(name = "Access denied")
    WebElement accessDeniedPopup;
    public void verifyTheAccessDeniedPopup(){
        String accessDeniedPopupTxt = accessDeniedPopup.getText();
        Assert.assertEquals(accessDeniedPopupTxt,"Access denied");
    }

    public void enterClockInForServerManagerRole(){
        pressPin0();
        pressPin7();
        pressPin6();
        pressPin5();
    }
    @FindBy(name = "You can’t punch out with open till,Do you want to close the till")
    WebElement youCantPunchOutPopup;
    public void verifyYouCantPunchOutOpenTillPopup(){
        String youCantPunchOutTxt = youCantPunchOutPopup.getText();
        Assert.assertEquals(youCantPunchOutTxt,"You can’t punch out with open till,Do you want to close the till");
       utils.log().info("popup is displayed as - "+youCantPunchOutTxt);
    }

    @FindBy(name = "You can’t punch out with active cashier")
    WebElement youCantPunchOutWithActiveCashierPopup;

    public void verifyYouCantPunchOutWithActiveCashierPopup(){
        String youCantPunchOutWithActiveCashierPopupTxt = youCantPunchOutWithActiveCashierPopup.getText();
        Assert.assertEquals(youCantPunchOutWithActiveCashierPopupTxt,"You can’t punch out with active cashier");
        utils.log().info("popup is displayed as - "+youCantPunchOutWithActiveCashierPopupTxt);
    }

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"6\"])[1]")
    WebElement pin6Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"5\"])[1]")
    WebElement pin5Time1;
    String pin4Time1 = "//ion-grid/ion-row[5]/ion-col[1]/button";
    String pin3Time1 = "//ion-grid/ion-row[4]/ion-col[3]/button";
    String pin2Time1 = "//ion-grid/ion-row[4]/ion-col[2]/button";
    String pin1Time1= "//ion-grid/ion-row[4]/ion-col[1]/button";

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"7\"])[1]")
    WebElement pin7Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"8\"])[1]")
    WebElement pin8Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"9\"])[1]")
    WebElement pin9Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"0\"])[1]")
    WebElement pin0Time1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Clear\"])[1]")
    WebElement pinClrTime1;
    public void loggedInForCashier1(){
//        pressPin6();
//        pressPin7();
//        pressPin5();
//        pressPin6();
        pressPin6Time();
        pressPin7Time();
        pressPin5Time();
        pressPin6Time();
        pressLogin();
    }

    public void loggedInForCashier2(){
//        pressPin5();
//        pressPin4();
//        pressPin6();
//        pressPin4();

        pressPin5Time();
        pressPin4Time();
        pressPin6Time();
        pressPin4Time();
        pressLogin();
    }

    public void loggedInForCashier4(){
        pressPin3Time();
        pressPin6Time();
        pressPin3Time();
        pressPin9Time();
//        pressPin3();
//        pressPin6();
//        pressPin3();
//        pressPin9();
        pressLogin();
    }
    public void loggedInForCashier3(){
//        pressPin0();
//        pressPin7();
//        pressPin8();
//        pressPin7();
        pressPin0Time();
        pressPin7Time();
        pressPin8Time();
        pressPin7Time();
        pressLogin();
    }
    public static WebDriver driver1;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"BACK OFFICE\"]")
    WebElement backOffice;
    public void goToBO() throws InterruptedException {
//     elementClick(backOffice,"Selected "+backOffice.getText());
//        a.Login(driver, test);

//     WebDriver driver1 = new ChromeDriver();


        Thread.sleep(2000);
        //Call the chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/Ragav-QA-Mac-IN/Downloads/chromedriver");
        driver1=new ChromeDriver();

        //Maximize the Chrome window
        driver1.manage().window().maximize();
        Thread.sleep(1000);
        //Launch the URL
        driver1.get("https://mystore.lingapos.com/#/login");
//        ClockIn();
        Thread.sleep(1000);
        new OrderTypeWindow().pressCancelBtn();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//
//        Actions a = new Actions(driver1);
//
//                WebElement downBtn =  driver1.findElement(By.xpath("//div[contains(@id,'min_window')]"));
//        a.moveToElement(downBtn);
//        a.click().perform();
//            WebElement downBtn =  driver1.findElement(By.xpath("//div[@id='min_window']"));
//            downBtn.click();

        WebElement emailAddress = driver1.findElement(By.xpath("//input[contains (@name  ,'emailId')]"));
        emailAddress.click();
        emailAddress.sendKeys("appiumtest@mail.com");
        WebElement password = driver1.findElement(By.xpath("//input[contains (@name ,'password')]"));
        password.click();
        password.sendKeys("auto1234");
        WebElement signIn = driver1.findElement(By.xpath("//button[contains(@id,'round1')]"));
        signIn.click();

    }
    @FindBy(name = "logOff")
    private WebElement logOffBtn;


    @FindBy(name = "All")
    WebElement allB;
    public WebElement syncBtn;
    public void selectTheStore(String store) throws InterruptedException {
        Thread.sleep(5000);
        WebElement searchText = driver1.findElement(By.xpath("//input[contains(@ng-model,'searchText')]"));
        searchText.sendKeys(store);
//        elementClick(allB,"All");
        syncBtn = (WebElement) driver.findElement(By.xpath("Sync"));
        elementClick(syncBtn,"Tapped Sync Button");
        Thread.sleep(5000);
        WebElement store1 = driver1.findElement(By.xpath("//div[@class='content-block']/div[4]/div/div[1]//a"));
        store1.click();
        Thread.sleep(15000);
        driver1.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
        WebElement settingsBtn = driver1.findElement(By.xpath("//ul[@class='nav nav-list']/li[5]/a/span[1]"));
        settingsBtn.click();
        Thread.sleep(4000);
        elementClick(syncBtn,"Tapped Sync Button");
        WebElement storeBtn = driver1.findElement(By.xpath("//ul[@class='nav nav-list']/li[5]/ul/li[1]"));
        storeBtn.click();
        Thread.sleep(4000);
        WebElement paymentsBtn = driver1.findElement(By.xpath("//div[contains(@class,'container-fluid')]/div/div[2]/div[1]/div/div/div/div/scrollable-tabset/div/div/div/ul/li[3]"));
        paymentsBtn.click();
        Thread.sleep(4000);//input[contains(@ng-model,'storeSettings.cashDiscountEnable')]
        elementClick(syncBtn,"Tapped Sync Button");
        DisableCashDiscount();
        Thread.sleep(4000);
        disableCashReward();
        clickPrinterAndVerifyReceiptPrinter();
        Thread.sleep(3000);
        clickProductAndItem();
        elementClick(syncBtn,"Tapped Sync Button");
        gratuityClick();
        searchGratuity("Fixxy2");
        seatCountAs4();
        searchGratuity("Fixxy1");
        seatCountAs3();
        searchGratuity("Auto Varying Gratuity");
        seatCountAs3();
        searchGratuity("Auto Fixed Gratuity");
        seatCountAs3();
        doPublishBtn1();
        elementClick(syncBtn,"Tapped Sync Button");
        Thread.sleep(4000);
        elementClick(logOffBtn,"Tapped log Off Button");
    }

    public void clickPrinterAndVerifyReceiptPrinter() throws InterruptedException {
        WebElement printer= driver1.findElement(By.xpath("//div[contains(@class,'container-fluid')]/div/div[2]/div[1]/div/div/div/div/scrollable-tabset/div/div/div/ul/li[4]"));
        printer.click();
        Thread.sleep(2000);
        WebElement receiptPrinter = driver1.findElement(By.xpath("//div[contains(@class,'container-fluid')]/div/div[2]/div[2]/div/div/div/div/scrollable-tabset/div/div/div/ul/li[7]"));
        receiptPrinter.click();
        Thread.sleep(3000);
        WebElement digitalReceiptScreen = driver1.findElement(By.xpath("//input[contains(@ng-model,'storeSettings.isDigitalReceiptAvail')]"));
//        String digitt = digitalReceiptScreen.getAttribute("value");

        if(digitalReceiptScreen.isSelected()){
            digitalReceiptScreen.click();
            utils.log().info("Already Enabled");
            WebElement submitBtn = driver1.findElement(By.xpath("//button[contains(@type,'submit')]"));
            submitBtn.click();
            Thread.sleep(3000);
            doPublishBtn1();
        }else{
            utils.log().info("Already Disabled");
        }

    }
    public void seatCountAs4(){
        WebElement enterSeatNumber = driver1.findElement(By.xpath("//input[contains(@name,'autoGratuitySeatCount')]"));
        utils.log().info(enterSeatNumber.getText());
//        if(enterSeatNumber.getText().equals("7")){
        enterSeatNumber.clear();
        enterSeatNumber.sendKeys("4");
//        }else{
//            utils.log().info("Actual Gratuity Value - "+enterSeatNumber.getText());
//        }
        WebElement submitBtn = driver1.findElement(By.xpath("//button[contains(@type,'submit')]"));
        submitBtn.click();
    }

    public void seatCountAs3(){
        WebElement enterSeatNumber = driver1.findElement(By.xpath("//input[contains(@name,'autoGratuitySeatCount')]"));
//        utils.log().info(enterSeatNumber.getText());
//        if(enterSeatNumber.getText().equals("7")){
        enterSeatNumber.clear();
        enterSeatNumber.sendKeys("3");
//        }else{
//            utils.log().info("Actual Gratuity Value - "+enterSeatNumber.getText());
//        }
        WebElement submitBtn = driver1.findElement(By.xpath("//button[contains(@type,'submit')]"));
        submitBtn.click();
    }

    public void gratuityClick() throws InterruptedException {
        WebElement gratuityClick = driver1.findElement(By.xpath("//ul[contains(@class,'nav nav-list')]/li[3]/ul/li[15]"));
        JavascriptExecutor js=(JavascriptExecutor)driver1;
        js.executeScript("arguments[0].scrollIntoView(true);", gratuityClick);
        Thread.sleep(2000);
        gratuityClick.click();
        Thread.sleep(2000);
    }
    public void searchGratuity(String gratuity) throws InterruptedException {
        WebElement searchTxt = driver1.findElement(By.xpath("//input[contains(@ng-model,'searchText')]"));
        searchTxt.clear();
        searchTxt.sendKeys(gratuity);
        Thread.sleep(2000);
        WebElement pinSearch = driver1.findElement(By.xpath("//a[contains(@ng-click,'openTipForm(tip.id)')]"));
        pinSearch.click();
        Thread.sleep(2000);
    }
    public void disableCashReward() throws InterruptedException {
        WebElement cashReward = driver1.findElement(By.xpath("//input[contains(@ng-model,'storeSettings.cashRewardEnable')]"));
        if(cashReward.isSelected()) {
            cashReward.click();
            utils.log().info("Cash discount is Disabled");
            WebElement updateBtn = driver1.findElement(By.xpath("//button[contains(@type,'submit')]"));
            updateBtn.click();
            Thread.sleep(4000);
            doPublishBtn1();
        }else{
            utils.log().info("Cash discount is Disabled");
        }
    }

    public void DisableCashDiscount(){
        WebElement cashDiscount = driver1.findElement(By.xpath("//input[contains(@ng-model,'storeSettings.cashDiscountEnable')]"));
        if(cashDiscount.isSelected() ){
            utils.log().info("Cash discount & Cash Reward is Enabled");
            cashDiscount.click();
            utils.log().info("Cash discount is Disabled");
            WebElement yesBtn = driver1.findElement(By.xpath("//a[contains(@ng-click,'ok()')]"));
            yesBtn.click();
        }else{
            utils.log().info("Cash discount is Disabled");
        }
    }

    public void clickProductAndItem() throws InterruptedException {

        WebElement productTime = driver1.findElement(By.xpath("//li[contains(@ng-if,'checkPrivilege(productOrItemPrivileges)')]"));
        productTime.click();
        utils.log().info("Product time selected");
        Thread.sleep(4000);
    }
    public void doPublishBtn1(){
        WebElement publishBtn = driver1.findElement(By.xpath("//li[contains(@uib-tooltip,'Publish Your Menu Changes To POS')]"));
        publishBtn.click();
    }
    public void doPublishBtn(){
        WebElement publishBtn = driver1.findElement(By.xpath("//li[contains(@uib-tooltip,'Your Changes are Successfully Published to POS')]"));
        publishBtn.click();
    }
    public void enableCashDiscountEnabled(){
        WebElement cashDiscount = driver1.findElement(By.xpath("//input[contains(@ng-model,'storeSettings.cashDiscountEnable')]"));
        if(!cashDiscount.isSelected()){

            cashDiscount.click();

            utils.log().info("Cash discount is Disabled ");
            WebElement yesBtn = driver1.findElement(By.xpath("//a[contains(@ng-click,'ok()')]"));
            yesBtn.click();

        }else{
            utils.log().info("Cash discount is Disabled");
        }
        WebElement updateBtn = driver1.findElement(By.xpath("//button[contains(@type,'submit')]"));
        updateBtn.click();
    }



}
