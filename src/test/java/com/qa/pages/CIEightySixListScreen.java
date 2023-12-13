package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.qa.utils.TestUtils.driver;

public class CIEightySixListScreen extends BasePage {

    TestUtils testUtils=new TestUtils();

    String itemSearchFieldXpath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSearchField";

    String btnToggleXPath="//XCUIElementTypeImage[@name=\"{0}\"]";

    String quantityTextField="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeTextField";

    String btnPos="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]";

    String menuItemQtyXpath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField";

    String commonBtnXpath="//XCUIElementTypeButton[@name=\"{0}\"]";

    String btnButtonTwo = "(//XCUIElementTypeButton[@name=\"{0}\"])[2]";

    String qtyTxtFieldXPath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeTextField";

    String qtyXPath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[@name=\"{0}\"]";

    String qtyXPath1="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[@name=\"{0}\"]";


    String courseXpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText";
    // List<WebElement> course=(List<WebElement>)driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText"));

    String courseXpath1="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[15]/XCUIElementTypeStaticText";
    //List<WebElement> course= (List<WebElement>)driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[15]/XCUIElementTypeStaticText"));

    String qtyXPath4="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[@name=\"{0}\"]";

    String servingQtyXpath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[@name=\"{0}\"]";

    String btnQSR="(//XCUIElementTypeStaticText[@name=\"{0}\"])[2]";

    String quantityTextField1="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField";

    String quantityTextField2="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField";

    String selectedMenuitem="(//XCUIElementTypeTable[@name=\"Empty list\"])[4]";

    String insufficientPopUp="//XCUIElementTypeTextView[@name=\"{0}\"]";

    String menuItemNumber="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton[@name=\"{0}\"]";

    String enableLightModeSwitch="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch";

    String freeItmQtyXpath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[@name=\"{0}\"]";

    String emptyListXpath="//XCUIElementTypeTable[@name=\"{0}\"]";

    String noCountDownXpath="//XCUIElementTypeStaticText[@name=\"{0}\"]";

    public void itemSearchField(String chickenBiriyani,String msg){
        WebElement elementSearchField = mergeAndFindElement(itemSearchFieldXpath,"", TestUtils.XPath);
        elementClick(elementSearchField,msg);
        elementSearchField.sendKeys(chickenBiriyani);
//        findandclick_Skeys(itemSearchFieldXpath,"", TestUtils.XPath,"Skeys",chickenBiriyani);
    }

    public Boolean verifyQuantity(){
        Boolean isDisplayed=false;
        WebElement element =mergeAndFindElement(quantityTextField,"",testUtils.XPath);
        if(element.isDisplayed()){
            isDisplayed=true;
        }
        return isDisplayed;
    }

    public Boolean verifyQuantityOrderScreen(){
        Boolean isDisplayed=false;
        //List<WebElement> course1=(List<WebElement>)driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeStaticText"));
        List<WebElement> course1=(List<WebElement>)driver.findElements(By.xpath(courseXpath));

        if(course1.size()==2){
            isDisplayed=true;
        }
        return isDisplayed;
    }

    public void clickBtnToggle(String btnToggle,String msg){
//        WebElement elementSearchField = mergeAndFindElement(btnToggle,"", TestUtils.Accessibility);
//        elementClick(elementSearchField,msg);
        findandclick(btnToggle,"", TestUtils.Accessibility);
    }

    public void getDynamicCount(String name,String msg){


    }

    public void clickPos(String msg){
//        WebElement elementSearchField = mergeAndFindElement(btnPos,"", TestUtils.XPath);
//        elementClick(elementSearchField,msg);
        findandclick(btnPos,"", TestUtils.XPath);
    }

    public String emptySearchField(String msg){
        WebElement elementEmptySearchField = mergeAndFindElement(itemSearchFieldXpath,"", TestUtils.XPath);
        String value=getAttribute(elementEmptySearchField,"value");
        utils.log().info(msg);
        return value;
    }

    public void clickMenuItemQty(String msg){
//        WebElement elementMenuItemQty = mergeAndFindElement(menuItemQtyXpath,"", TestUtils.XPath);
//        elementClick(elementMenuItemQty,msg);
        findandclick(menuItemQtyXpath,"", TestUtils.XPath);
    }

    public String getQuantityTextField(String msg){
        WebElement element=mergeAndFindElement(quantityTextField,"", TestUtils.XPath);
        String value= getAttribute(element,"value");
        utils.log().info(msg);
        return value;
    }

    public String getBtnClose(String btnClose,String msg){
//        WebElement elementClose = mergeAndFindElement(btnClose,"", TestUtils.Accessibility);
//        String value=elementGetText(elementClose,msg);
        return findAndGetText(btnClose,"", TestUtils.Accessibility);
    }

    public void clickQtyTxtField(String msg){
//        WebElement elementQty = mergeAndFindElement(qtyTxtFieldXPath,"", TestUtils.XPath);
//        elementClick(elementQty,msg);
        findandclick(qtyTxtFieldXPath,"", TestUtils.XPath);
    }

    public String getQty(String btnClose,String msg){
//        WebElement elementQty = mergeAndFindElement(qtyXPath,btnClose, TestUtils.XPath);
//        String value=elementGetText(elementQty,msg);
        return findAndGetText(qtyXPath,btnClose, TestUtils.XPath);
    }

    public String getQty1(String btnClose,String msg){
//        WebElement elementQty = mergeAndFindElement(qtyXPath1,btnClose, TestUtils.XPath);
//        String value=elementGetText(elementQty,msg);
        return findAndGetText(qtyXPath1,btnClose, TestUtils.XPath);
    }

    public String getQty2(String btnClose,String msg){
//        WebElement elementQty = mergeAndFindElement(qtyXPath4,btnClose, TestUtils.XPath);
//        String value=elementGetText(elementQty,msg);
        return findAndGetText(qtyXPath4,btnClose, TestUtils.XPath);
    }

    public void clickMenuItem(String msg){
//        WebElement element =mergeAndFindElement(selectedMenuitem,"",TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(selectedMenuitem,"",TestUtils.XPath);
    }

    public String getInsufficientPopUp(String popUp,String msg){
//        WebElement element =mergeAndFindElement(popUp,"",TestUtils.Accessibility);
        return findAndGetText(popUp,"",TestUtils.Accessibility);
    }

    public void clickQsrBtn(String btnQsr,String msg){
//        WebElement elementQty = mergeAndFindElement(btnQSR,btnQsr, TestUtils.XPath);
//        elementClick(elementQty,msg);
        findandclick(btnQSR,btnQsr, TestUtils.XPath);
    }

    public String getServingQty(String btnClose,String msg){
//        WebElement elementQty = mergeAndFindElement(servingQtyXpath,btnClose, TestUtils.XPath);
//        String value=elementGetText(elementQty,msg);
        return findAndGetText(servingQtyXpath,btnClose, TestUtils.XPath);
    }

    public void clickQuantityTextField1(String msg){
//        WebElement element=mergeAndFindElement(quantityTextField1,"", TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(quantityTextField1,"", TestUtils.XPath);
    }

    public void clickQuantityTextField2(String msg){
//        WebElement element=mergeAndFindElement(quantityTextField2,"", TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(quantityTextField2,"", TestUtils.XPath);
    }

    public String getQuantityTextField1(String msg){
        WebElement element=mergeAndFindElement(quantityTextField1,"", TestUtils.XPath);
        String value= getAttribute(element,"value");
        utils.log().info(msg);
        return value;
    }

    public String getQuantityTextField2(String msg){
        WebElement element=mergeAndFindElement(quantityTextField2,"", TestUtils.XPath);
        String value= getAttribute(element,"value");
        utils.log().info(msg);
        return value;
    }

    public void clickEnableLightMode(String msg){
//        WebElement element =mergeAndFindElement(enableLightModeSwitch,"",TestUtils.XPath);
//        elementClick(element,msg);
        findandclick(enableLightModeSwitch,"",TestUtils.XPath);
    }

    public String getMenuItemQuantity(String btnValue,String msg){
//        WebElement element =mergeAndFindElement(menuItemNumber,btnValue,TestUtils.XPath);
//        String value =elementGetText(element,msg);
        return findAndGetText(menuItemNumber,btnValue,TestUtils.XPath);
    }

    public void clickLaterButton(String btnButton, String msg) {
//        WebElement element = mergeAndFindElement(btnButtonTwo, btnButton, TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnButtonTwo, btnButton, TestUtils.XPath);
    }

    public String getFreeItemQty(String btnClose,String msg){
//        WebElement elementQty = mergeAndFindElement(freeItmQtyXpath,btnClose, TestUtils.XPath);
//        String value=elementGetText(elementQty,msg);
        return findAndGetText(freeItmQtyXpath,btnClose, TestUtils.XPath);
    }

    public String getEmptyList(String emptyList,String msg){
//        WebElement elementEmptyList = mergeAndFindElement(emptyList,"", TestUtils.Accessibility);
//        String value=elementGetText(elementEmptyList,msg);
        return findAndGetText(emptyList,"", TestUtils.Accessibility);
    }



    public String getNoCountDownItem(String txtNoCountDownItems,String msg){
        try {
            // wait 1 sec
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // handling InterruptedException
        }
//        WebElement elementEmptyList = mergeAndFindElement(txtNoCountDownItems,"", TestUtils.Accessibility);
//        String value=elementGetText(elementEmptyList,msg);
        return findAndGetText(txtNoCountDownItems,"", TestUtils.Accessibility);
    }

    public Boolean getDisappearQtyXpath(){
        Boolean isDisplayed=false;

        List<WebElement> course=(List<WebElement>)driver.findElements(By.xpath(courseXpath1));

        if(course.size()==1)
        {
            isDisplayed=true;
        }
        return isDisplayed;
    }

    public boolean getQtyBtn(){
        WebElement elementEmptyList = mergeAndFindElement(qtyTxtFieldXPath,"", TestUtils.XPath);
        boolean value = true;
        if(elementEmptyList.isEnabled())
        {
            value=false;
        }
        return value;
    }

    public String getQtyLoginScreen(){
        WebElement elementEmptyList = mergeAndFindElement(qtyTxtFieldXPath,"", TestUtils.XPath);
        String value=getAttribute(elementEmptyList,"value");
        return value;
    }

    public void getQtyOf86ListMenu(String QTY,String menu){
        List<WebElement> menuCollection = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell"));
        int sizeOfMenus=  menuCollection.size();
        for (int i =1;i<=sizeOfMenus;i++){
            WebElement menuName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell["+i+"]/XCUIElementTypeStaticText[2]"));
            String menuNameTxt = menuName.getText();
            if(menuNameTxt.equalsIgnoreCase(menu)){
                WebElement menuList = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell["+i+"]/XCUIElementTypeStaticText[1]"));
                String menuListCount = menuList.getText();
                Assert.assertEquals(menuListCount,QTY);
                utils.log().info("86 List Menu Count is equal");
            }

        }
    }



    public void verify86ListMenuQuantity(String menuName,String QTY){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement menus = (WebElement) driver.findElementByAccessibilityId(menuName);
//        String menuTxt = menus.getText();
//
        WebElement listQty = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeTextField"));
        String qtyOfMenu = listQty.getText();
        Assert.assertEquals(qtyOfMenu,QTY);
        utils.log().info("86 list menu as - "+menuName+" - "+QTY);
    }


}


