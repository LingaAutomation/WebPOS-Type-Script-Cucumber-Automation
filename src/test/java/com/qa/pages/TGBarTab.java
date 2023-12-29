package com.qa.pages;


import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static com.qa.utils.TestUtils.driver;
public class TGBarTab extends BasePage {

    //    String newTabButton = "//XCUIElementTypeStaticText[@name=\"New Tab\"]\n";
    String newTabButton = "//button[.=' New Tab ']";
    String transferBarTabOption = "//span[contains(.,'Transfer')]";
    //    String transferBarTabOption = "//XCUIElementTypeStaticText[@name=\"Transfer\"]";
    String splitBarTabOption = "//span[contains(.,'Split')]";
    //    String splitBarTabOption = "//XCUIElementTypeStaticText[@name=\"Split\"]";
    String splitBySeatBarTabOption = "//span[.=' Split By Seat ']";
    //    String splitBySeatBarTabOption = "//XCUIElementTypeStaticText[@name=\"Split By Seat\"]";
    String firstBarTabOrder = "//div[@class='bartab-row-col seated']//p[.='goknur bati']";

    String splitEvenlyBarTabOption = "//div[.='Split Evenly']";
    //    String splitEvenlyBarTabOption = "//XCUIElementTypeStaticText[@name=\"Split Evenly\"]";

    String mergeBarTabOption = "//div[.='Merge']";
    String mergeDoneButton = "Done";
//    String mergeDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";

    String payCheckBarTab = "Pay Check";
//    String payCheckBarTab = "//XCUIElementTypeStaticText[@name=\"Pay Check\"]";

    String firstBarTabCheck1 = "(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[1]";

    String firstBarTabCheck = "(//XCUIElementTypeStaticText[@name=\"Göknur B\"])[2]";

    String allTabIcon = "(//p[@class='tablebarfooter-total-firstrow-weight'])[1]";
    String seatedIcon = "(//p[@class='tablebarfooter-total-firstrow-weight'])[2]";
    //    String seatedIcon = "//XCUIElementTypeStaticText[@name=\"Seated\"]";
    String checkDownIcon = "(//p[@class='tablebarfooter-total-firstrow-weight'])[3]";
    //    String checkDownIcon = "//XCUIElementTypeStaticText[@name=\"Check Down\"]";
    String onHoldIcon = "(//p[@class='tablebarfooter-total-firstrow-weight'])[4]";
    //    String onHoldIcon = "//XCUIElementTypeStaticText[@name=\"On Hold\"]";
    String expiredIcon = "(//p[@class='tablebarfooter-total-firstrow-weight'])[5]";
    //    String expiredIcon = "//XCUIElementTypeStaticText[@name=\"Expired\"]";
    String sortAtoZ = "//span[.=' A-Z ']";
    //    String sortAtoZ = "//XCUIElementTypeStaticText[@name=\"Sort A - Z\"]";
    String sortZtoA = "//span[.=' Z-A ']";
//    String sortZtoA = "//XCUIElementTypeStaticText[@name=\"Sort Z - A\"]\n";

    String barTabSearchTextField = "//p[.='Test Automation']";
    String barTabSearchText = "Search Name or Check Number";
    //    String barTabSearchText = "//XCUIElementTypeStaticText[@name=\"Search Name or Check Number\"]";
    String barTabOrderCustomerName = "//p[.='goknur bati']";
    //not used
    String searchOrderWithCheckNumberOnBarTab = "//XCUIElementTypeStaticText[@name=\"TL 32,70\"]";
    String onHoldOrderNumber = "/html/body/app-root/app-dashboard-container/ion-app/ion-content/ion-grid/ion-row/ion-col[1]/app-order-list-container/ion-app/ion-content/div/app-ordered-list/ion-app/ion-content/div/div/div/div[2]/div/div/div[4]/img";
    //    String onHoldOrderNumber = "//XCUIElementTypeStaticText[@name=\"1\"]";
    String expiredOrderNumber = "goknur bati";
    //    String expiredOrderNumber = "//XCUIElementTypeStaticText[@name=\"Test Automation\"]";
    String firstBarTabOrderSortedAToZ = "(//p[.='auto l'])[1]";
    String lastBarTabOrderSortedAToZ = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[19]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[last]";
    String firstBarTabOrderSortedZToA = "(//p[.='Walkin'])[1]";
    String lastBarTabOrderSortedZToA = "//XCUIElementTypeStaticText[@name=\"Automation\"][1]";
    String deleteDiscountForMergeInfoText = "//XCUIElementTypeAlert[@name=\"Linga\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]";
    String deleteDiscountForMergeYesButton = "Yes";
    //    String deleteDiscountForMergeYesButton = "//XCUIElementTypeButton[@name=\"Yes\"]";
    String mergeCheckConfirmButton = "//button[.=' Confirm ']";
    //    String mergeCheckConfirmButton = "//XCUIElementTypeStaticText[@name=\"Confirm\"]";
    String cancelCustomerButton = "//button[contains(.,' Cancel ')]";
    //    String cancelCustomerButton = "//XCUIElementTypeStaticText[@name=\"Cancel\"]";
    String lastBarTabOrderWithWalkin = "//XCUIElementTypeStaticText[@name=\"Walkin\"][1]";
    String mergeSuccessDoneButton = "Done";
    //    String mergeSuccessDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String mergedCheck = "(//XCUIElementTypeStaticText[@name=\"Göknur B\"])[2]";
    String yesOptionForRemoveDiscount = "Yes";
    //    String yesOptionForRemoveDiscount = "//XCUIElementTypeButton[@name=\"Yes\"]";
    String firstBarTabOrderWillMerge = "(//XCUIElementTypeStaticText[@name=\"Goknur B\"])[2]";
    String secondBarTabOrderWillMerge = "(//XCUIElementTypeStaticText[@name=\"Goknur B\"])[3]";
    String splitButton = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[4]";
    String splitedOrder = "(//XCUIElementTypeStaticText[@name=\"Goknur B\"])[2]";
    String reminderOrder = "(//XCUIElementTypeStaticText[@name=\"Goknur B\"])[2]";
    public void selectSecondBarTabCheck(){
        WebElement barTabCheck = mergeAndFindMobileElement(secondBarTabCheck);
        elementClick(barTabCheck,"Select Second BarTab Check");
        findandclickM(By.id(yesOptionForRemoveDiscount));
    }
    public void selectRemainderOrder(){
        WebElement orderReminder = mergeAndFindMobileElement( reminderOrder);
        elementClick(orderReminder,"Select Remainder Order");
        findandclickM(By.id(yesOptionForRemoveDiscount));
    }
    public void selectOrderWhichIsSplit(){
        WebElement orderReminder = mergeAndFindMobileElement( splitedOrder);
        elementClick(orderReminder,"Select Order Which Is Split");
        findandclickM(By.id(yesOptionForRemoveDiscount));
    }
    public void clickSplitButtonOnBarTab(){
        WebElement btnSplit = mergeAndFindMobileElement( splitButton);
        elementClick(btnSplit,"Select Order Which Is Split");
    }
    public void clickLastBarTabOrderTypeCheck(){
        WebElement lastCheck = mergeAndFindMobileElement( lastBarTabOrderWithWalkin);
        elementClick(lastCheck,"Click Last BarTab OrderType Check");
        findandclickM(By.id(yesOptionForRemoveDiscount));
    }
    public void clickRemoveDiscountOptionOnBarTab(){
        WebElement removeDiscount = mergeAndFindMobileElement(lastBarTabOrderWithWalkin);
        elementClick(removeDiscount,"Click Remove Discount Option On BarTab");
        findandclickM(By.id(yesOptionForRemoveDiscount));
    }
    public void selectMergedCheckOnBarTab(){
        WebElement mergeCheck = mergeAndFindMobileElement(mergedCheck);
        elementClick(mergeCheck,"Select Merged Check On BarTab");
        findandclickM(By.id(yesOptionForRemoveDiscount));
    }
    public void verifyMergeSuccessMessage(){
        WebElement btnMergeDone = mergeAndFindMobileElement(mergeSuccessDoneButton);
        elementClick(btnMergeDone,"Merge Success Message");
    }
    public void selectSecondOrderWhichIsMerge(){
        WebElement secondMerge = mergeAndFindMobileElement(secondBarTabOrderWillMerge);
        elementClick(secondMerge,"Select Second Order Which Is Merge");
    }
    public void selectFirstOrderWhichIsMerge(){
        WebElement firstMerge = mergeAndFindMobileElement(firstBarTabOrderWillMerge);
        elementClick(firstMerge,"Select First Order Which Is Merge");
    }
    public void selectFirstBarTabOrderOnBarTabOrderTab(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]");
        phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]");
        phoneOrders.get(phoneOrders.size() - 1).click();
    }
    public void clickCancelButtonForCustomerNamePopup(){
try {
    WebElement popupCustomer = mergeAndFindMobileElement(cancelCustomerButton);
    if (popupCustomer.isDisplayed()) {
        elementClick(popupCustomer, "Click Cancel Button For CustomerName Popup");
    } else {

    }
}catch (Exception h){

}
    }
    public void clickNewTab(){
        WebElement tabNew = mergeAndFindMobileElement(newTabButton);
        elementClick(tabNew,"Click New Tab");
    }
    public void clickTransferBarTabButton(){
        WebElement tabNew = mergeAndFindMobileElement(transferBarTabOption);
        elementClick(tabNew,"Click New Tab");
    }
    public void clickSplitButton(){
        WebElement btnSplit = mergeAndFindMobileElement(splitBarTabOption);
        elementClick(btnSplit,"Click Split Button");
    }
    public void clickSplitBySeat(){
        WebElement btnSplitBySeat = mergeAndFindMobileElement(splitBySeatBarTabOption);
        elementClick(btnSplitBySeat,"Click Split By Seat");
    }
    public void selectFirstBarTabOrder(){
        WebElement firstOrder = mergeAndFindMobileElement(firstBarTabOrder);
        elementClick(firstOrder,"Select First BarTab Order");
        findandclickM(By.id(yesOptionForRemoveDiscount));
    }

    public void clickSplitEvenlyBarTab(){
        WebElement splitEvenly = mergeAndFindMobileElement(splitEvenlyBarTabOption);
        elementClick(splitEvenly,"Click Split Evenly BarTab");
    }
    public void clickMergeBarTabButton(){
        WebElement btnMerge = mergeAndFindMobileElement(mergeBarTabOption);
        elementClick(btnMerge,"Click Merge BarTab Button");
    }
    public void clickMergeDoneButton(){
        WebElement btnMerge = mergeAndFindMobileElement(mergeDoneButton);
        elementClick(btnMerge,"Click Merge BarTab Button");
    }
    public void clickPayCheckBarTabButton(){
        WebElement btnPayCheck = mergeAndFindMobileElement(payCheckBarTab);
        elementClick(btnPayCheck,"Click PayCheck BarTab Button");
    }
    public void clickFirstBarTabCheck(){
        WebElement barTabCheck = mergeAndFindMobileElement(firstBarTabCheck);
        elementClick(barTabCheck,"Click First BarTab Check");
        findandclickM(By.id(yesOptionForRemoveDiscount));
    }
    public void verifyAllTabIcon(){

        WebElement iconAll = mergeAndFindMobileElement(allTabIcon);
        String[] actualName = iconAll.getText().split(":");
        String expectedName = "All Tab";
        utils.log().info(actualName[0]);
        Assert.assertEquals(expectedName,actualName[0]);
    }
    public void verifySeatedIcon(){
        WebElement iconSeated = mergeAndFindMobileElement(seatedIcon);
        String[] actualName = iconSeated.getText().split(":");
        String expectedName = "Seated";
        utils.log().info(actualName[0]);
        Assert.assertEquals(expectedName,actualName[0]);
    }
    public void verifyCheckDownIcon(){
        WebElement iconCheckDown = mergeAndFindMobileElement(checkDownIcon);
        String[] actualName = iconCheckDown.getText().split(":");
        String expectedName = "Check Down";
        utils.log().info(actualName[0]);
        Assert.assertEquals(expectedName,actualName[0]);
    }
    public void verifyOnHoldIcon(){
        WebElement iconOnHold = mergeAndFindMobileElement(onHoldIcon);
        String[] actualName = iconOnHold.getText().split(":");
        String expectedName = "On Hold";
        utils.log().info(actualName[0]);
        Assert.assertEquals(expectedName,actualName[0]);
    }
    public void verifyExpiredIcon(){
        WebElement iconExpired = mergeAndFindMobileElement(expiredIcon);
        String[] actualName = iconExpired.getText().split(":");
        String expectedName = "Expired";
        utils.log().info(actualName[0]);
        Assert.assertEquals(expectedName,actualName[0]);
    }

    public void clickYes(){
        findandclickM(By.id(yesOptionForRemoveDiscount));
    }
    public void verifyDirectedBarTab(){
        WebElement directedBarTab = mergeAndFindMobileElement(sortAtoZ);
        String actualName = elementGetText(directedBarTab,"Verify Directed BarTab");
        String expectedName = "A-Z";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickSortAtoZButton(){
        WebElement btnSortAtoZ = mergeAndFindMobileElement(sortAtoZ);
        elementClick(btnSortAtoZ,"Click Sort AtoZ Button");
    }
    public void clickSortZtoAButton(){
        WebElement btnSortZtoA = mergeAndFindMobileElement(sortZtoA);
        elementClick(btnSortZtoA,"Click Sort AtoZ Button");
    }
    public void enterCustomerNameForSearch(){
        WebElement searchCustomer = mergeAndFindMobileElement(barTabSearchTextField);
        searchCustomer.sendKeys("Test Automation");
    }
    public void verifySearchCustomerName(){
        WebElement customerSearch = mergeAndFindMobileElement(barTabOrderCustomerName);
        String actualName = elementGetText(customerSearch,"Verify Search Customer Name");
        String expectedName = "goknur bati";

        Assert.assertEquals(actualName,expectedName);
    }
    public void checkNumberOnBarTabSearchTextfield(){
        WebElement checkNumber = mergeAndFindMobileElement(barTabSearchTextField);
        checkNumber.sendKeys("Test Automation");
    }
    public void clickSearchedBarTabOrder(){
        WebElement searchOrder = mergeAndFindMobileElement(searchOrderWithCheckNumberOnBarTab);
        elementClick(searchOrder,"Click Searched BarTab Order");
    }
    public void verifyLastBarTabOrder(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]");
        phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
        findandclickM(By.id(yesOptionForRemoveDiscount));
    }
    public void clickSearchedLastBarTabOrder(){
        List<WebElement> phoneOrders = selectAndFindElements("///XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]");
        phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
        findandclickM(By.id(yesOptionForRemoveDiscount));
    }
    public void verifyLastCustomerNameOnBarTab(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"goknur bati\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
        findandclickM(By.id(yesOptionForRemoveDiscount));
    }
    //new nov 18
    public void verifyLastUpdatedBarTabOrder(){

        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"thomas\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
        findandclickM(By.id(yesOptionForRemoveDiscount));

    }
    public void verifyHoldBarTabOrder(){

        WebElement holdOrder = mergeAndFindMobileElement(onHoldOrderNumber);
       if(holdOrder.isDisplayed()){
           utils.log().info("Displayed HOLD");
       }else{
           utils.log().info("Not Displayed HOLD");
       }
    }
    public void verifyExpiredBarTabOrder(){
        WebElement holdExpired = mergeAndFindMobileElement(expiredOrderNumber);
        String actualName = elementGetText(holdExpired,"Verify Expired BarTab Order");
        String expectedName = "goknur bati";

        Assert.assertEquals(actualName,expectedName);
    }

    public void verifyBarTabSearchTextField(){
        WebElement searchTxtField = mergeAndFindMobileElement(barTabSearchTextField);
        String actualName = elementGetText(searchTxtField,"Verify BarTab Search Text Field");
        String expectedName = "";

        Assert.assertEquals(actualName,expectedName);
    }
    public void selectLastBarTabCheck(){
        //  List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]");
        List<WebElement>     phoneOrders = selectAndFindElements("//XCUIElementTypeStaticText[@name=\"Test Automation\"]");
        phoneOrders.get(phoneOrders.size() - 1).click();
        findandclickM(By.id(yesOptionForRemoveDiscount));

    }
    public void selectLastBarTabCheckForMerge(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[1]");
        phoneOrders.get(phoneOrders.size() - 1).click();
    }
    public void selectFirstBarTabCheck(){
        WebElement barTabCheck = mergeAndFindMobileElement(firstBarTabCheck1);
        elementClick(barTabCheck,"Select First BarTab Check");
        findandclickM(By.id(yesOptionForRemoveDiscount));
//        WebElement btnYes = mergeAndFindMobileElement(yesButton);
//        elementClick(btnYes,"Click Yes");
    }
    public void closeDeleteDiscountInfoPopup(){
        WebElement infoText = mergeAndFindMobileElement(deleteDiscountForMergeInfoText);
        elementClick(infoText,"Close Delete Discount Info Popup");
        WebElement btnClose = mergeAndFindMobileElement(deleteDiscountForMergeYesButton);
        elementClick(btnClose,"Click Close");
    }
    public void confirmMergeChecksConfirmationPopup() throws InterruptedException {
        Thread.sleep(2000);
        WebElement btnConfirm = mergeAndFindMobileElement(mergeCheckConfirmButton);
        elementClick(btnConfirm,"Click Confirm");
    }

    public void selectTheCheckFromBarTab() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement searchTabBarTab =  driver.findElement(By.xpath("//input[@placeholder='Search Name or Check Number']"));
        searchTabBarTab.sendKeys(TestUtils.globalCheckNumber);
        Thread.sleep(2000);
        WebElement tabCheck =  driver.findElement(By.xpath("//ion-content[contains(@class,'barTabContent')]/app-bar-tab/ion-grid/ion-row/ion-col[1]"));
        elementClick(tabCheck,"Tapped select check - ");

    }

}
