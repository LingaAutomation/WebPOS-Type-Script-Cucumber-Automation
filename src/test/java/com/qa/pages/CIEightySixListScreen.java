package com.qa.pages;

import com.qa.utils.TestUtils;
import io.cucumber.java.bs.A;
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

    public void itemSearchField(String chickenBiriyani,String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement listQty = driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]"));
        sendKeys(listQty,chickenBiriyani,"Searched - "+chickenBiriyani);
    }

    public void verifyQuantity() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//table[@class='list86Component-menuList-table ng-star-inserted']//td[2]//input"));
        if(element.isEnabled()){
            utils.log().info("QTY is Selectable");
        }else{
            utils.log().info("QTY is Not Selectable");
            int w = 1/0;
        }

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

    public String getQuantityTextField(String Qty) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element=driver.findElement(By.xpath("//table[@class='list86Component-menuList-table ng-star-inserted']//input[@placeholder='"+Qty+"']"));
       if(element.isDisplayed()) {
           utils.log().info("Displayed QTY - "+Qty);
       }else {
           utils.log().info("Not Displayed QTY - "+Qty);
           int w = 1/0;
       }

        return Qty;
    }

    public String getBtnClose(String btnClose,String msg){
//        WebElement elementClose = mergeAndFindElement(btnClose,"", TestUtils.Accessibility);
//        String value=elementGetText(elementClose,msg);
        return findAndGetText(btnClose,"", TestUtils.Accessibility);
    }

    public void clickQtyTxtField(String msg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement elementQty = driver.findElement(By.xpath("//table[@class='list86Component-menuList-table ng-star-inserted']//td[2]"));
        elementClick(elementQty,msg);

    }

    public void getQty(String btnClose,String menu) throws InterruptedException {
        Thread.sleep(2500);
        WebElement elementQty = driver.findElement(By.xpath("(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'"+menu+"')])[1]/../span"));
        String value=elementQty.getText();

        Assert.assertEquals(value,btnClose);
        utils.log().info("Displayed  - "+btnClose);

    }

    public void getQty1(String btnClose,String menu) throws InterruptedException {
        Thread.sleep(2500);
        WebElement elementQty = driver.findElement(By.xpath("(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'"+menu+"')])[1]/../span"));
        String value=elementQty.getText();

        Assert.assertEquals(value,btnClose);
        utils.log().info("Displayed  - "+btnClose);

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
        WebElement element =driver.findElement(By.xpath("//p[.='"+popUp+"']"));
        return element.getText();
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
        WebElement element =driver.findElement(By.xpath(""));
        elementClick(element,msg);

    }

    public String getMenuItemQuantity(String btnValue,String msg){
        WebElement el4 = driver.findElement(By.xpath("//div[contains(@class,'p-col-2 orderlist-qty')]"));
        Assert.assertEquals(el4.getText(),btnValue);
        utils.log().info("Quantity is SAME - "+btnValue);
        return el4.getText();
    }

    public void clickLaterButton(String btnButton, String msg) {
//        WebElement element = mergeAndFindElement(btnButtonTwo, btnButton, TestUtils.XPath);
//        elementClick(element, msg);
        findandclick(btnButtonTwo, btnButton, TestUtils.XPath);
    }

    public void getFreeItemQty(String btnClose,String msg) throws InterruptedException {
        Thread.sleep(2500);
        WebElement elementQty = driver.findElement(By.xpath("(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'"+msg+"')])[1]/../span"));
        String value=elementQty.getText();

        Assert.assertEquals(value,btnClose);
        utils.log().info("Displayed  - "+btnClose);
    }

    public void clickSearchCloseOnThe86ListScreen() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='list86Component-searchField list86Component-searchField-pinContainer']//button[@aria-label='reset']")).click();

    }
    public void getEmptyList() throws InterruptedException {
        Thread.sleep(2000);
        try {
            WebElement elementEmptyList = driver.findElement(By.xpath("//ion-grid[@class='list86Component-menuList-pinContainer md hydrated']//tr[.='Chicken Biriyani']"));
          if(elementEmptyList.isDisplayed()){
              utils.log().info("Displayed Eight Six");
              Assert.assertEquals(elementEmptyList.getText(),"Chicken Biriyani");

          }
        }catch (Exception w){
          utils.log().info("Not Displayed");
          Thread.sleep(1000);
          driver.findElement(By.xpath("//div[@class='list86Component-searchField list86Component-searchField-pinContainer']//button[@aria-label='reset']")).click();

        }

    }

    public void getEmptyList1(String menu) throws InterruptedException {
        Thread.sleep(2000);
        try {
            WebElement elementEmptyList = driver.findElement(By.xpath("//ion-grid[@class='list86Component-menuList-pinContainer md hydrated']//tr[.='"+menu+"']"));
            if(elementEmptyList.isDisplayed()){
                utils.log().info("Displayed Eight Six");
                Assert.assertEquals(elementEmptyList.getText(),"kn");

            }
        }catch (Exception w){
            utils.log().info("Not Displayed");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class='list86Component-searchField list86Component-searchField-pinContainer']//button[@aria-label='reset']")).click();

        }

    }

    public void getEmptyList2(String menu) throws InterruptedException {
        Thread.sleep(2000);
        try {
            WebElement elementEmptyList = driver.findElement(By.xpath("//td[.='"+menu+"']"));
            if(elementEmptyList.isDisplayed()){
                utils.log().info("Displayed Eight Six");
                Assert.assertEquals(elementEmptyList.getText(),"Msn");

            }
        }catch (Exception w){
            utils.log().info("Not Displayed");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//ion-searchbar[@placeholder='Search']//button[@type='button']")).click();

        }

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

    public void shouldVerifyTheQuantityButton(String msg){
        try{

            if(driver.findElement(By.xpath("(//input[@placeholder='0'])[1]")).isSelected()){
                utils.log().info("Qty Is Enabled");
                Assert.assertEquals("Mks","NKs");
            }
        }catch (Exception h){
            utils.log().info("Qty Is Not Enabled ");
        }
    }

    public void getDisappearQtyXpath(String msg) {
        try {
            if (driver.findElement(By.xpath("//div[@id='react-menu']//div[2]//button//span")).isDisplayed()) {
                utils.log().info("Displayed 86 List Menus");
                Assert.assertEquals("mkn", "dss");
            }
        } catch (Exception w) {
            utils.log().info("NOT Displayed 86 List Menus - "+msg);
        }
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
    public void searchMenuItem(String menuItem) throws InterruptedException {

        Thread.sleep(2000);
        WebElement listQty = driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
        sendKeys(listQty,menuItem,"Searched - "+menuItem);
    }

    public void click86ListButtonInLoginScreen() throws InterruptedException {
        Thread.sleep(1000);
        WebElement phoneOrdersBtn =  driver.findElement(By.xpath("//button[.=' 86 List ']"));
        Assert.assertEquals(phoneOrdersBtn.getText(), "86 List");
        elementClick(phoneOrdersBtn, "Selected Btn As - " + phoneOrdersBtn.getText());
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


