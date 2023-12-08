package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;

import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;


import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.qa.pages.DriverSteup.driver;

public class CustomerProfileWindow extends OrderTypeWindow{

    public String loyalty="";

    @FindBy(name = "Customer Profile")
    private WebElement titleTxt;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"*\"])[1]")
    private WebElement phoneAsterisk;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"*\"])[2]")
    private WebElement addressAsterisk;

    @FindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search\"]")
    private WebElement searchField;

    //    @FindBy(name = "Auto ragav  +919080344 ")
    @FindBy(name = "Auto ragav 9876887899 ")   // Nov 16
    // @FindBy (name = "Engin  Basarand +905012345 ")
    private WebElement customerToSelect;


    @FindBy(name = "auto membership 876997065 ")   // Nov 16
    // @FindBy (name = "Engin  Basarand +905012345 ")
    private WebElement customerToSelectForMembership;

    @FindBy(name = "tax exe 787679878 ")
    private WebElement customerToSelectForTaxExempt;

    //    @FindBy(name = "Auto ragav  +919080344 ")
    @FindBy(name = "auto test 9878789 ")
    // @FindBy (name = "Engin  Basarand +905012345 ")
    private WebElement customerToSelectForNmi;


    @FindBy(xpath =  "//XCUIElementTypeButton[@name=\"Save\"]")
    private WebElement saveBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch")
    private WebElement taxExemptCustomer;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Customer Plan\"]")
    private WebElement customerPlanButton;

    @FindBy(name = "Account Types")
    private WebElement accountTypeScreen;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]")
    private WebElement houseAccTxtField;

    @FindBy(name = "House Account")
    private WebElement houseAccount;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[3]")
    private WebElement rechargeField;

    //@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[6]")
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"CustomerProfile DownArrow\"])[6]")
    private WebElement limitField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[4]")
    private WebElement limitTxtField;

    @FindBy(name = "Daily")
    private WebElement dailyBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]")
    private WebElement cardNumberFld;

    @FindBy(name = "Continue")
    private WebElement continueBtn;

    @FindBy(name = "Update")
    private WebElement updateBtn;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Save\"])[2]")
    private WebElement saveAccType;

    @FindBy(name = "HA-3578655")
    private WebElement houseAccountHA;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch[1]")
    private WebElement limitEnable;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]")
    private WebElement firstNameFld;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[2]")
    private WebElement lastNameFld;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[5]")
    private WebElement mobileNumberFld;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[7]")
    private WebElement mailNameFld;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Add\"])[1]")
    private WebElement addMobileNumber;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Save\"])[1]")
    private WebElement saveMobileNumber;

    @FindBy(name = "Loyalty   0,00")
    private WebElement loyaltyBtn;

    @FindBy(name = "auto loyaltytest 67891234598 ")
    private WebElement loyalCustomer;

    @FindBy(name = "Loyalty Balance")
    private WebElement loyaltyBalanceScreen;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell")
    private WebElement verifyLoyalty;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"CustomerProfile Close\"])[2]")
    WebElement closeLoyaltyBalance;

    @FindBy(name = "Enter Email Id or Mobile Number")
    WebElement emailMobileNumberTxt;

    @FindBy(name = "CustomerProfile Close")
    WebElement customerProfileCloseBtn;


    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch[1]")
    WebElement limitDisableBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[4]")
    WebElement limitValueBtn;

    public String verifyAccountType(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        return elementGetText(accountTypeScreen,"Account Type is displayed - ");
    }



    public void clickAccountTypeField(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        try {
            WebElement limitEnabledBtn = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeSwitch[@value='1']"));
            if (limitEnabledBtn.isDisplayed()) {
                utils.log().info("Limit Button is Enabled");
            }
        }catch (Exception z){
            elementClick(limitDisableBtn,"limit disable Btn is selected");
            elementClick(limitValueBtn,"limit Value Btn selected");
            pressPin2();
            elementClick(pin00,"00 Tapped");
            elementClick(pin00,"00 Tapped");
            elementClick(pin00,"00 Tapped");
            elementClick(pin00,"00 Tapped");
            elementClick(continueBtn,"Tapped continue Button");
        }
        elementClick(rechargeField,"Tapped Recharge field");
        elementClick(pin9,"9 Tapped");
        elementClick(pin0,"0 Tapped");
        elementClick(pin00,"00 Tapped");
        elementClick(continueBtn,"Tapped continue Button");
    }
    

    public String getTitle() {
        return elementGetText(titleTxt, "user login window's title is - ");
    }

    public String getPhoneAsterisk() {
        return elementGetText(phoneAsterisk, "* next to Phone field - ");
    }

    public String getAddressAsterisk() {
        return elementGetText(addressAsterisk, "* next to Phone field - ");
    }

    public void pressSearchField() {
        elementClick(searchField, "Tapped search Phone");
    }
    @FindBy(xpath ="//*[@name=\"Hide keyboard\"]")
    private WebElement hideKeyboardButton;

    @FindBy(name = "New Customer")
    private WebElement addCustomerToTableBtn;

    @FindBy(name = "Add New")
    private WebElement addNewBtn;

    @FindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search\"]")
    private WebElement search;

    @FindBy(xpath = "**/XCUIElementTypeTextField[`value == \"5876568\"`]")
    WebElement cardNumber;
    @FindBy(xpath = "**/XCUIElementTypeTextField[`value == \"Basic Level 2\"`]")
    WebElement membershipName;
    @FindBy(xpath = "**/XCUIElementTypeTextField[`value == \"Price Level 2\"`]")
    WebElement membershipType;


    public void verifyTheCustomerIsAvailableInTheCustomerProfileWindow(String name) throws Exception {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        elementClick(searchField, "Tapped search Phone");
        sendKeys(searchField,name,"Enter the customer - "+name);
       // try{
            WebElement emptyList = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText"));
            if(find(emptyList,2)){
                WebElement selectCustomer = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText"));
                elementClick(selectCustomer,"Selected Customer as - "+selectCustomer.getText());
                elementClick(customerPlanButton,"Tapped Customer Plan Button");
                Assert.assertEquals(accountTypeScreen.getText(),"Account Types");
                utils.log().info("Account Types Screen is Displayed");
                selectMembershipFromAccountType();
                Thread.sleep(100);
                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField[1]
             //   WebElement cardNumber = (WebElement) driver.findElementBy("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField[1]");
                String cardNumberTxt = cardNumber.getText();
                Assert.assertEquals(cardNumberTxt,"5876568");
                utils.log().info("Card Number - "+cardNumberTxt);
              //  WebElement membershipName = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[1]");
                Assert.assertEquals(membershipName.getText(),"Basic Level 2");
                utils.log().info("Membership Name - "+membershipName.getText());
              //  WebElement membershipType = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[2]");
                Assert.assertEquals(membershipType.getText(),"Price Level 2");
                utils.log().info("Membership Type - "+membershipType.getText());
//                                                                                                XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther
//                WebElement balanceAmount = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[5]");
//                utils.log().info("Balance Amount - "+balanceAmount.getText());
                elementClick(updateBtn,"Update Button selected");
            }else{

                WebElement clearText = (WebElement) driver.findElement(By.xpath("Clear text"));
                elementClick(clearText,"Selected as - "+clearText.getText());
                elementClick(hideKeyboardButton, "Keyboard hidden.");
                WebElement addNew = (WebElement) driver.findElement(By.xpath(""));
                elementClick(addNew,"Selected Button as - "+addNew.getText());
                WebElement firstName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]"));
                sendKeys(firstName,"auto","Enter the first name - "+"auto");
                elementClick(hideKeyboardButton, "Keyboard hidden.");
                WebElement lastName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[2]"));
                sendKeys(lastName,"membership1","Enter the last name - "+"membership1");
                WebElement el1 = (WebElement) driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Add\"])[1]"));
                sendKeys(el1,"98574589","Enter the number - "+"98574589");
                WebElement saveBtn1 = (WebElement) driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Save\"])[1]"));
                elementClick(saveBtn1,"Save Button");
                Thread.sleep(200);
                elementClick(saveBtn,"Save Button");
                elementClick(addCustomerToTableBtn, "customer list is opened");
                elementClick(addNewBtn,"Tapped Add New Button");
                elementClick(searchField, "Tapped search Phone");
                WebElement selectCustomer = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText"));
                elementClick(selectCustomer,"Selected Customer as - "+selectCustomer.getText());
                elementClick(customerPlanButton,"Tapped Customer Plan Button");
                Assert.assertEquals(accountTypeScreen.getText(),"Account Types");
                utils.log().info("Account Types Screen is Displayed");
                selectMembershipFromAccountType();
                WebElement cardNumber = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField[1]"));
                sendKeys(cardNumber,"8758457","Enter Number - "+"8758457");
                setTheMembershipName();
                setTheMembershipType();
                setTheIssueDate();
                setTheExpiryDate();
                enterTheRechargeAmount(String.valueOf(16478));
                clickSaveBtnInTheAccountTypeScreen();
            }
//        }catch (Exception w){
//
//        }

    }

    public void sendCustomerName(String name) {
        sendKeys(searchField, name, "Customer name is entered - "+ name );}


    public void sendAndSelectCustomerName(String name) {
        sendKeys(searchField, name, "Customer name is entered - "+ name );

    }

    public void clickRepeatOrderButton(){
      WebElement repeatOrderBtn = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Repeat Order\"]"));
      elementClick(repeatOrderBtn,"Selected Repeat Order Btn");
    }

     public void selectTheLastSaleOfTheCustomer(){
        WebElement lastCustomer = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]"));
        elementClick(lastCustomer,"Selected Latest sale of customer");
     }

    public void selectCustomer() {
        elementClick(customerToSelect, "Customer selected ");
    }

    public void selectCustomerForMembership(){
        elementClick(customerToSelectForMembership,"Selected Customer - "+customerToSelectForMembership.getText());
    }

    public void selectCustomerforTaxExempt(){
        elementClick(customerToSelectForTaxExempt, "Customer selected ");
    }

    public void selectCustomerForNmi() {
        elementClick(customerToSelectForNmi, "Customer selected ");
    }

    public void pressSaveBtn() throws InterruptedException {
       //Thread.sleep(100);
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        elementClick(saveBtn, "pressed Save button");
    }
    public void selectTaxExemptCustomerProfile() throws InterruptedException {

        elementClick(taxExemptCustomer,"Tapped Tax Exempt on customer Profile");
    }

    public void selectCustomerPlan(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        elementClick(customerPlanButton,"Tapped Customer Plan Button");
    }



    public void clickUpdateBtn(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        elementClick(updateBtn, "Tapped Update Button");
    }

    public String houseAccountOnOrderScreen(){
        return elementGetText(houseAccountHA,"House Account is displayed - ");
    }

    public void iEnterCustomerFirstName(String name){ sendKeys(firstNameFld,name); }

    public void iEnterCustomerLastName(String name){sendKeys(lastNameFld,name);}

    public void iEnterCustomerMobileNumber(String number){
        elementClick(addMobileNumber,"Tapped Add button for Enter Mobile Number");
        sendKeys(mobileNumberFld,number);
        elementClick(saveMobileNumber,"Tapped Save button");
    }
    public void iEnterCustomerEmail(String name){
        sendKeys(mailNameFld,name);
        mailNameFld.sendKeys(Keys.ENTER);
    }
    public void clickLoyaltyButton(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement loyal=mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeButton[4]/XCUIElementTypeStaticText[1]","",TestUtils.XPath);
        String loyal1=loyal.getText();
        elementClick(loyal,loyal1 + " - Tapped Loyalty Button");

    }

    public String verifyLoyaltyScreen(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        return elementGetText(loyaltyBalanceScreen,"Loyalty Balance window is displayed - ");
    }

    public void selectCustomerLoyalty(){
        elementClick(loyalCustomer,"Tapped Customer");
    }

    public void verifyLoyalty(){
        if(verifyLoyalty.isDisplayed()){
            utils.log().info("loyalty check is available");
        }else {
            utils.log().info("Loyalty check is not available");
        }
    }

    public void verifyLoyaltyBalance() throws Exception {
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        String globalCheckNumber = TestUtils.globalCheckNumber;


//        List<WebElement> list= (List<WebElement>) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell");
//        int size1=list.size();

//

        WebElement check = mergeAndFindElement(globalCheckNumber,"",TestUtils.Accessibility);
        scrollToElementPayments(check,"up");
        if (find(check,2)) {
            utils.log().info(globalCheckNumber);
        }else{
            utils.log().info(globalCheckNumber);
        }

//            WebElement balanceDate = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
//            String date = balanceDate.getText();
//            WebElement CheckNo = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]");
//            String number = CheckNo.getText();
//            WebElement type = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]");
//            String Type = type.getText();
//            WebElement amount = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[4]");
//            String money = amount.getText();
//
//            if (globalCheckNumber.equals(number)) {
//                utils.log().info(date + "  " + number + "  " + Type + "  " + money);
//            } else {
//                utils.log().info("Loyalty balance not shown");
//            }
    }

    public void compareLoyaltyBalance(){
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        String loyal1=TestUtils.loyaltyBalance;
        WebElement loyal=mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeButton[4]/XCUIElementTypeStaticText[1]","",TestUtils.XPath);
        String loyal2=loyal.getText();
        if(loyal1.equals(loyal2)){
            utils.log().info("Loyalty Balance is Same"+" Before Sale"+ " "+loyal1+ " & "+"After Sale"+" "+loyal2);
        }else{
            utils.log().info("Loyalty Balance is Changed"+" Before Sale"+ " "+loyal1+ " & "+"After Sale"+" "+loyal2);
        }

    }

    public void verifyLoyaltyBalanceInCustomerProfileWindow(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement loyal=mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeButton[4]/XCUIElementTypeStaticText[1]","",TestUtils.XPath);
        String loyal2=loyal.getText();
        utils.log().info("Loyalty balance in Customer profile Window - "+loyal2);
    }
    public String getLoyaltyBalance() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(1000);
        WebElement loyal=mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeButton[4]/XCUIElementTypeStaticText[1]","",TestUtils.XPath);
        loyalty=loyal.getText();
        TestUtils.loyaltyBalance=loyalty;
        utils.log().info("Loyalty balance in Customer profile Window - "+loyalty);
        return loyalty;
    }

    public void closeLoyaltyBalanceWindow(){
        elementClick(closeLoyaltyBalance,"Closed Loyalty balance Window");
    }

    public String verifyEmailOrMobileTxt(){
        return getText(emailMobileNumberTxt,"Email number txt is displayed -");
    }

    public void closedCustomerProfile(){
        elementClick(customerProfileCloseBtn,"Tapped close button of Customer profile");
    }

    public void selectMembershipFromAccountType() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

                                                                                          //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]
        WebElement membershipArrow = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]"));
         elementClick(membershipArrow,"Selected Arrow - ");

         Thread.sleep(50);
                                                                                         //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]
         WebElement memberShipBtn = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
          elementClick( memberShipBtn,"Selected button as - "+memberShipBtn.getText());

    }

    public void enterTheCardNumberAccountTypeScreen(String number){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement cardNumber = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField[1]"));
        sendKeys(cardNumber,number,"Enter Number - "+number);
    }

    public void setTheMembershipName() throws Exception {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement membershipName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[1]"));
        elementClick(membershipName,"Selected Button as - "+membershipName.getText());
        List<WebElement> getMemberShipNAme = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell"));
         for(int i=1;i<=getMemberShipNAme.size();i++){
             WebElement selectMemberShipName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeStaticText"));
             if((selectMemberShipName.getText()).equals("BasicLevel2")){
             elementClick(selectMemberShipName,"Selected Name as - "+selectMemberShipName.getText());
             }else{
                 scrollToElement(selectMemberShipName,"up");
             }

         }

    }

    public void setTheMembershipType() throws Exception {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement membershipType = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
        elementClick(membershipType,"Selected Button as - "+membershipType.getText());
        List<WebElement> getMemberShipType = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell"));
        for(int i=1;i<=getMemberShipType.size();i++){
            WebElement selectMemberShipType = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeStaticText"));
            if((selectMemberShipType.getText()).equals("Price Level 2")){
                elementClick(selectMemberShipType,"Selected Name as - "+selectMemberShipType.getText());
            }else{
                scrollToElement(selectMemberShipType,"up");
            }

        }
    }

    public void setTheIssueDate(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement issueDate = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField[4]"));
        elementClick(issueDate,"selected Issue Date");
        WebElement doneBtn = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
        elementClick(doneBtn,"Selected Done ");
    }

    public void setTheExpiryDate(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement expiryDate = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
        elementClick(expiryDate,"selected Expiry Date");
        WebElement DatePickerWheel =(WebElement) driver.findElement(By.xpath("//XCUIElementTypePicker"));

        List<WebElement> course= DatePickerWheel.findElements(By.xpath("//XCUIElementTypePickerWheel"));

        course.get(2).sendKeys("2024");
        WebElement doneBtn = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
        elementClick(doneBtn,"Selected Done ");
    }

    public void enterTheRechargeAmount(String number){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement rechargeAmount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
        elementClick(rechargeAmount,"Selected recharge Amount");
        for(int i=1;i<=number.length();i++){
            char num = number.charAt(i);
            WebElement  numberrr = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\""+num+"\"]"));
           elementClick(numberrr,"Selected number as - "+numberrr.getText());

        }
    }

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Save\"])[2]")
    WebElement saveBtnnn;
    public void clickSaveBtnInTheAccountTypeScreen(){
        elementClick(saveBtnnn,"Selected Save Btn");
    }
}

