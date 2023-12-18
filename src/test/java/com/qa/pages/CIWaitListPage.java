package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class CIWaitListPage extends BasePage {

    public WebDriver driver = TestUtils.driver;

    public CIWaitListPage() {

        this.driver = TestUtils.driver;

        PageFactory.initElements(this.driver,this);
    }

    String checkNumber = "";

    TestUtils testUtils=new TestUtils();

    String btnSearchField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSearchField";

    //String nameTest = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther";

    String nameTest="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]";

    String btnXpath = "//XCUIElementTypeButton[@name=\"{0}\"]";

    String staticTxtXpath = "//XCUIElementTypeStaticText[@name=\"{0}\"]";

    String commonWaitListXPath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[@name=\"{0}\"]";

    String tableTwoXPath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]";

//    String pickerXpath = "XCUIElementTypePickerWheel";

    String pickerXpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel";

    String customerNameXPath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]/XCUIElementTypeStaticText[2]";

    String btnColor = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[2]";

    String waitListRow="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell";

    String btnSubmit = "//XCUIElementTypeButton[@name=\"  Submit\"]";

    String nameField="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[1]";

    String phoneField="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[2]";

    String closedSearchField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField";

    // check number xpath in order screen
    String chkNumber = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]";

    String staticTxtXpath1="(//XCUIElementTypeButton[@name=\"{0}\"])[1]";



    public void commonBtn(String btnName, String msg) {
//        WebElement elementTxtInPopup = mergeAndFindElement(btnXpath,btnName , TestUtils.XPath);
//        elementClick(elementTxtInPopup, msg);
        findandclick(btnXpath,btnName , TestUtils.XPath);
    }

    public void clickAssign(String id,String msg){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell");
        if(phoneOrders.size()==1){
//            WebElement element=mergeAndFindElement(id,"",TestUtils.Accessibility);
//            elementClick(element,msg);
            findandclick(id,"", TestUtils.Accessibility);

        }
        else{
//            WebElement element=mergeAndFindElement(staticTxtXpath1,id,TestUtils.XPath);
//            elementClick(element,msg);
            findandclick(staticTxtXpath1,id,TestUtils.XPath);
        }
    }

    public void passName(String Name, String msg) {
        WebElement elementTxtInPopup = mergeAndFindElement(btnSearchField, "", TestUtils.XPath);
//        elementTxtInPopup.setValue(Name);
//        elementTxtInPopup.sendKeys(Name);
        sendKeys(elementTxtInPopup, Name, msg);

//        findandclick_Skeys(btnSearchField, "", TestUtils.XPath,"Skeys",Name);
    }

    public void swipeList(String id) throws InterruptedException {
        listScroller(id,618, 266, 470, 266, 5000);
    }

    public void passNotes(String btnKeyboard, String Name, String msg) {
        WebElement elementTxtInPopup = mergeAndFindElement(btnKeyboard,"" , TestUtils.Accessibility);
        sendKeys(elementTxtInPopup, Name, msg);
//        findandclick_Skeys(btnKeyboard,"" , TestUtils.Accessibility,"Skeys",Name);
    }

    public void clickName(String msg) {
//        WebElement elementTxtInPopup = mergeAndFindElement(nameTest, "", TestUtils.XPath);
//        elementClick(elementTxtInPopup, msg);
        findandclick(nameTest, "", TestUtils.XPath);
    }

    public String getTxtPopup(String txtEditPopup, String msg) {
//        WebElement elementTxtInPopup = mergeAndFindElement(txtEditPopup, "", TestUtils.Accessibility);
//        String text = elementGetText(elementTxtInPopup, msg);
        return findAndGetText(txtEditPopup, "", TestUtils.Accessibility);
    }

    public String getTxtSeatNumber(String commonWaitList, String msg) {
//        WebElement elementTxtSeatNo = mergeAndFindElement(commonWaitListXPath, commonWaitList, TestUtils.XPath);
//        String text = elementGetText(elementTxtSeatNo, msg);
        return findAndGetText(commonWaitListXPath, commonWaitList, TestUtils.XPath);
    }

    public void clickWaitingTime(String selectedText, String msg) {
        // Select text
        SelectPickerWheelValue(pickerXpath, selectedText, TestUtils.Order.NEXT, msg);
    }

    public void clickTableTwo(String msg) {
//        WebElement elementTableTwo = mergeAndFindElement(tableTwoXPath, "", TestUtils.XPath);
//        elementClick(elementTableTwo, msg);
        findandclick(tableTwoXPath, "", TestUtils.XPath);
        findandclickM(By.id("Yes"));
    }

    public String getCustomerName(String msg)  {
//        Thread.sleep(1000);
//        WebElement elementTxtCustomerName = mergeAndFindElement(customerNameXPath, "", TestUtils.XPath);
//        String text = elementGetText(elementTxtCustomerName, msg);
        return findAndGetText(customerNameXPath, "", TestUtils.XPath);
    }

    public void clickColor(String msg) {
//        WebElement elementTxtInPopup = mergeAndFindElement(btnColor, "", TestUtils.XPath);
//        elementClick(elementTxtInPopup, msg);
        findandclick(btnColor, "", TestUtils.XPath);
    }

    public void clickBtnSubmit(String msg) {
//        WebElement elementTxtInPopup = mergeAndFindElement(btnSubmit, "", TestUtils.XPath);
//        elementClick(elementTxtInPopup, msg);
        findandclick(btnSubmit, "", TestUtils.XPath);
    }

    public String getWaitList(String commonwaitList,String msg){
//        WebElement elementTxtInPopup = mergeAndFindElement(commonWaitListXPath, commonwaitList,TestUtils.XPath);
//        String text =elementGetText(elementTxtInPopup, msg);
        return findAndGetText(commonWaitListXPath, commonwaitList,TestUtils.XPath);
    }

    public void getWaitListRow(String msg){
        WebElement elementTxtInPopup = mergeAndFindElement(waitListRow, "",TestUtils.XPath);
        boolean value=false;
        if(elementTxtInPopup.isDisplayed()){
            value=true;
        }
        utils.log().info(msg + " is " + value);
    }

    public void passNameField(String name,String msg){
        WebElement elementTxtInPopup = mergeAndFindElement(nameField,"",TestUtils.XPath);
        sendKeys(elementTxtInPopup,name+"-"+testUtils.dateTimeFormat(),msg);
//        findandclick_Skeys(nameField,"",TestUtils.XPath,"Skeys",name+"-"+testUtils.dateTimeFormat());
    }

    public void passPhoneField(String phone,String msg){
        WebElement elementTxtInPopup = mergeAndFindElement(phoneField,"",TestUtils.XPath);
        sendKeys(elementTxtInPopup,testUtils.dateTime(),msg);
//        findandclick_Skeys(phoneField,"",TestUtils.XPath,"Skeys",testUtils.dateTime());
    }

    public void swipeListNew(String id) throws InterruptedException {
        listScroller(id,618,266,470,266,  10000);
    }

    public void passNameFieldNew(String name,String msg){
        WebElement elementTxtInPopup = mergeAndFindElement(btnSearchField,"",TestUtils.XPath);
        sendKeys(elementTxtInPopup,name+"-"+testUtils.dateTimeFormat(),msg);
//        findandclick_Skeys(btnSearchField,"",TestUtils.XPath,"Skeys",name+"-"+testUtils.dateTimeFormat());
    }

    // to get check number in order screen
    public void getCheckNumber(String msg)
    {
        try{
        WebElement element = driver.findElement(By.xpath("//div[@id='os_check']//p[contains(@class,'checkno')]"));
        checkNumber =elementGetText(element,"Text");
//        utils.log().info(msg + " - " +checkNumber);
        }
        catch (Exception e){
//            utils.log().info("unable to Get check Number");
        }
    }
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private WebElement searchTabClosedTab;
    public void passCheckNumber() throws Exception{

            // wait 1 sec
            Thread.sleep(800);

           // WebElement searchElement = (WebElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField");
           searchTabClosedTab.sendKeys(checkNumber);
//        findandclick_Skeys(closedSearchField, "", TestUtils.XPath,"Skeys",checkNumber);
//        WebElement tableElement = mergeAndFindElement(checkNumber,"" , TestUtils.Accessibility);
//        tableElement.click();
            findandclick(checkNumber,"" , TestUtils.Accessibility);



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

    String PrintFutureCommon=  "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[{0}]/XCUIElementTypeSwitch";

    public boolean verifyDisableBarTabAskCustomer() throws InterruptedException {
        listScroller("OVERWRITE CC SETTING",983,703,983,113,5000);
        boolean value=false;
        try{
            WebElement element = mergeAndFindElement(PrintFutureCommon, "11", TestUtils.XPath);
            String text =  element.getAttribute("value");
            if(text.contains("1")){
                findandclick(PrintFutureCommon, "11", TestUtils.XPath);
            }
            text =  element.getAttribute("value");
            if(text.contains("0")){
                value=true;
            }
        }catch(Exception e){}
        return value;
    }
    String readFromCommon= "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[{0}]/XCUIElementTypeSwitch";

    public boolean verifyEnableWaitList() throws InterruptedException {
        listScroller("OVERWRITE CC SETTING",983,703,983,113,5000);
        boolean value=false;
        try{
            WebElement element = mergeAndFindElement(readFromCommon, "6", TestUtils.XPath);
            String text =  element.getAttribute("value");
            if(text.contains("0")){
                findandclick(readFromCommon, "6", TestUtils.XPath);
            }
            text =  element.getAttribute("value");
            if(text.contains("1")){
                value=true;
            }}catch(Exception e){}

        return value;
    }




}
