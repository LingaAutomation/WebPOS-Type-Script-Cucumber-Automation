package com.qa.pages;


import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static com.qa.utils.TestUtils.driver;
public class TGBarTab extends BasePage {

    //    private By newTabButton = By.xpath("//XCUIElementTypeStaticText[@name=\"New Tab\"]\n");
    public By newTabButton = By.id("New Tab");
    public By transferBarTabOption = By.id("Transfer");
    //    private By transferBarTabOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer\"]");
    public By splitBarTabOption = By.id("Split");
    //    private By splitBarTabOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Split\"]");
    public By splitBySeatBarTabOption = By.id("Split By Seat");
    //    private By splitBySeatBarTabOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Split By Seat\"]");
    private By firstBarTabOrder = By.xpath("(//XCUIElementTypeStaticText[@name=\"goknur bati\"])[1]");

    public By splitEvenlyBarTabOption = By.id("Split Evenly");
    //    private By splitEvenlyBarTabOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Split Evenly\"]");

    private By mergeBarTabOption = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[3]");
    public By mergeDoneButton = By.id("Done");
//    private By mergeDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");

    public By payCheckBarTab = By.id("Pay Check");
//    private By payCheckBarTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Pay Check\"]");

    private By firstBarTabCheck1 = By.xpath("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[1]");

    private By firstBarTabCheck = By.xpath("(//XCUIElementTypeStaticText[@name=\"Göknur B\"])[2]");

    private By allTabIcon = By.xpath("//XCUIElementTypeStaticText[@name=\"All Tab\"]");
    public By seatedIcon = By.id("Seated");
    //    private By seatedIcon = By.xpath("//XCUIElementTypeStaticText[@name=\"Seated\"]");
    public By checkDownIcon = By.id("Check Down");
    //    private By checkDownIcon = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Down\"]");
    public By onHoldIcon = By.id("On Hold");
    //    private By onHoldIcon = By.xpath("//XCUIElementTypeStaticText[@name=\"On Hold\"]");
    public By expiredIcon = By.id("Expired");
    //    private By expiredIcon = By.xpath("//XCUIElementTypeStaticText[@name=\"Expired\"]");
    public By sortAtoZ = By.id("Sort A - Z");
    //    private By sortAtoZ = By.xpath("//XCUIElementTypeStaticText[@name=\"Sort A - Z\"]");
    public By sortZtoA = By.id("Sort Z - A");
//    private By sortZtoA = By.xpath("//XCUIElementTypeStaticText[@name=\"Sort Z - A\"]\n");

    private By barTabSearchTextField = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSearchField");
    public By barTabSearchText = By.id("Search Name or Check Number");
    //    private By barTabSearchText = By.xpath("//XCUIElementTypeStaticText[@name=\"Search Name or Check Number\"]");
    private By barTabOrderCustomerName = By.xpath("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[1]");
    //not used
    private By searchOrderWithCheckNumberOnBarTab = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 32,70\"]");
    public By onHoldOrderNumber = By.id("1");
    //    private By onHoldOrderNumber = By.xpath("//XCUIElementTypeStaticText[@name=\"1\"]");
    public By expiredOrderNumber = By.id("goknur bati");
    //    private By expiredOrderNumber = By.xpath("//XCUIElementTypeStaticText[@name=\"Test Automation\"]");
    private By firstBarTabOrderSortedAToZ = By.xpath("//XCUIElementTypeStaticText[@name=\"goknur bati\"][1]");
    private By lastBarTabOrderSortedAToZ = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[19]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[last]");
    private By firstBarTabOrderSortedZToA = By.xpath("(//XCUIElementTypeStaticText[@name=\"goknur bati\"])[1]");
    private By lastBarTabOrderSortedZToA = By.xpath("//XCUIElementTypeStaticText[@name=\"Automation\"][1]");
    private By deleteDiscountForMergeInfoText = By.xpath("//XCUIElementTypeAlert[@name=\"Linga\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");
    public By deleteDiscountForMergeYesButton = By.id("Yes");
    //    private By deleteDiscountForMergeYesButton = By.xpath("//XCUIElementTypeButton[@name=\"Yes\"]");
    public By mergeCheckConfirmButton = By.id("Confirm");
    //    private By mergeCheckConfirmButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Confirm\"]");
    public By cancelCustomerButton = By.id("Cancel");
    //    private By cancelCustomerButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Cancel\"]");
    private By lastBarTabOrderWithWalkin = By.xpath("//XCUIElementTypeStaticText[@name=\"Walkin\"][1]");
    public By mergeSuccessDoneButton = By.id("Done");
    //    private By mergeSuccessDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    private By mergedCheck = By.xpath("(//XCUIElementTypeStaticText[@name=\"Göknur B\"])[2]");
    public By yesOptionForRemoveDiscount = By.id("Yes");
    //    private By yesOptionForRemoveDiscount = By.xpath("//XCUIElementTypeButton[@name=\"Yes\"]");
    private By firstBarTabOrderWillMerge = By.xpath("(//XCUIElementTypeStaticText[@name=\"Goknur B\"])[2]");
    private By secondBarTabOrderWillMerge = By.xpath("(//XCUIElementTypeStaticText[@name=\"Goknur B\"])[3]");
    private By splitButton = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[4]");
    private By splitedOrder = By.xpath("(//XCUIElementTypeStaticText[@name=\"Goknur B\"])[2]");
    private By reminderOrder = By.xpath("(//XCUIElementTypeStaticText[@name=\"Goknur B\"])[2]");

    public void selectSecondBarTabCheck(){
        WebElement barTabCheck = mergeAndFindMobileElement(secondBarTabCheck);
        elementClick(barTabCheck,"Select Second BarTab Check");
        findandclickM(yesOptionForRemoveDiscount);
    }
    public void selectRemainderOrder(){
        WebElement orderReminder = mergeAndFindMobileElement(reminderOrder);
        elementClick(orderReminder,"Select Remainder Order");
        findandclickM(yesOptionForRemoveDiscount);
    }
    public void selectOrderWhichIsSplit(){
        WebElement orderReminder = mergeAndFindMobileElement(splitedOrder);
        elementClick(orderReminder,"Select Order Which Is Split");
        findandclickM(yesOptionForRemoveDiscount);
    }
    public void clickSplitButtonOnBarTab(){
        WebElement btnSplit = mergeAndFindMobileElement(splitButton);
        elementClick(btnSplit,"Select Order Which Is Split");
    }
    public void clickLastBarTabOrderTypeCheck(){
        WebElement lastCheck = mergeAndFindMobileElement(lastBarTabOrderWithWalkin);
        elementClick(lastCheck,"Click Last BarTab OrderType Check");
        findandclickM(yesOptionForRemoveDiscount);
    }
    public void clickRemoveDiscountOptionOnBarTab(){
        WebElement removeDiscount = mergeAndFindMobileElement(lastBarTabOrderWithWalkin);
        elementClick(removeDiscount,"Click Remove Discount Option On BarTab");
        findandclickM(yesOptionForRemoveDiscount);
    }
    public void selectMergedCheckOnBarTab(){
        WebElement mergeCheck = mergeAndFindMobileElement(mergedCheck);
        elementClick(mergeCheck,"Select Merged Check On BarTab");
        findandclickM(yesOptionForRemoveDiscount);
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
        WebElement popupCustomer = mergeAndFindMobileElement(cancelCustomerButton);
        elementClick(popupCustomer,"Click Cancel Button For CustomerName Popup");
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
        findandclickM(yesOptionForRemoveDiscount);
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
        findandclickM(yesOptionForRemoveDiscount);
    }
    public void verifyAllTabIcon(){

        WebElement iconAll = mergeAndFindMobileElement(allTabIcon);
        String actualName = elementGetText(iconAll,"Get All Tab icon");
        String expectedName = "All Tab";

        Assert.assertEquals(expectedName,actualName);
    }
    public void verifySeatedIcon(){
        WebElement iconSeated = mergeAndFindMobileElement(seatedIcon);
        String actualName = elementGetText(iconSeated,"Get Seated icon");
        String expectedName = "Seated";

        Assert.assertEquals(expectedName,actualName);
    }
    public void verifyCheckDownIcon(){
        WebElement iconCheckDown = mergeAndFindMobileElement(checkDownIcon);
        String actualName = elementGetText(iconCheckDown,"Get Check Down icon");
        String expectedName = "Check Down";

        Assert.assertEquals(expectedName,actualName);
    }
    public void verifyOnHoldIcon(){
        WebElement iconOnHold = mergeAndFindMobileElement(onHoldIcon);
        String actualName = elementGetText(iconOnHold,"Get On Hold icon");
        String expectedName = "On Hold";

        Assert.assertEquals(expectedName,actualName);
    }
    public void verifyExpiredIcon(){
        WebElement iconExpired = mergeAndFindMobileElement(expiredIcon);
        String actualName = elementGetText(iconExpired,"Get Expired icon");
        String expectedName = "Expired";

        Assert.assertEquals(expectedName,actualName);
    }

    public void clickYes(){
        findandclickM(yesOptionForRemoveDiscount);
    }
    public void verifyDirectedBarTab(){
        WebElement directedBarTab = mergeAndFindMobileElement(sortAtoZ);
        String actualName = elementGetText(directedBarTab,"Verify Directed BarTab");
        String expectedName = "Sort A - Z";

        Assert.assertEquals(actualName,expectedName);
    }
    public void clickSortAtoZButton(){
        WebElement btnSortAtoZ = mergeAndFindMobileElement(sortAtoZ);
        elementClick(btnSortAtoZ,"Click Sort AtoZ Button");
    }
    public void clickSortZtoAButton(){
        WebElement btnSortZtoA = mergeAndFindMobileElement(sortZtoA);
    }
    public void enterCustomerNameForSearch(){
        WebElement searchCustomer = mergeAndFindMobileElement(barTabSearchTextField);
        searchCustomer.sendKeys("Test Automation");
    }
    public void verifySearchCustomerName(){
        WebElement customerSearch = mergeAndFindMobileElement(barTabOrderCustomerName);
        String actualName = elementGetText(customerSearch,"Verify Search Customer Name");
        String expectedName = "Test Automation";

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
        findandclickM(yesOptionForRemoveDiscount);
    }
    public void clickSearchedLastBarTabOrder(){
        List<WebElement> phoneOrders = selectAndFindElements("///XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]");
        phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
        findandclickM(yesOptionForRemoveDiscount);
    }
    public void verifyLastCustomerNameOnBarTab(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"goknur bati\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
        findandclickM(yesOptionForRemoveDiscount);
    }
    //new nov 18
    public void verifyLastUpdatedBarTabOrder(){

        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"thomas\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();
        findandclickM(yesOptionForRemoveDiscount);

    }
    public void verifyHoldBarTabOrder(){
        WebElement holdOrder = mergeAndFindMobileElement(onHoldOrderNumber);
        String actualName = elementGetText(holdOrder,"Verify Hold BarTab Order");
        String expectedName = "1";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyExpiredBarTabOrder(){
        WebElement holdExpired = mergeAndFindMobileElement(expiredOrderNumber);
        String actualName = elementGetText(holdExpired,"Verify Expired BarTab Order");
        String expectedName = "goknur bati";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyBarTabOrdersSortedFromAToZ(){
        WebElement sortedFromAToZ = mergeAndFindMobileElement(firstBarTabOrderSortedAToZ);
        String actualName = elementGetText(sortedFromAToZ,"Verify BarTab Orders Sorted From AToZ");
        String expectedName = "goknur bati";

        Assert.assertEquals(actualName,expectedName);
    }
    public void verifyBarTabOrdersSortedFromZToA(){
        WebElement sortedFromZToA = mergeAndFindMobileElement(firstBarTabOrderSortedZToA);
        String actualName = elementGetText(sortedFromZToA,"Verify BarTab Orders Sorted From ZToA");
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
        findandclickM(yesOptionForRemoveDiscount);

    }
    public void selectLastBarTabCheckForMerge(){
        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[1]");
        phoneOrders.get(phoneOrders.size() - 1).click();
    }
    public void selectFirstBarTabCheck(){
        WebElement barTabCheck = mergeAndFindMobileElement(firstBarTabCheck1);
        elementClick(barTabCheck,"Select First BarTab Check");
        findandclickM(yesOptionForRemoveDiscount);
//        WebElement btnYes = mergeAndFindMobileElement(yesButton);
//        elementClick(btnYes,"Click Yes");
    }
    public void closeDeleteDiscountInfoPopup(){
        WebElement infoText = mergeAndFindMobileElement(deleteDiscountForMergeInfoText);
        elementClick(infoText,"Close Delete Discount Info Popup");
        WebElement btnClose = mergeAndFindMobileElement(deleteDiscountForMergeYesButton);
        elementClick(btnClose,"Click Close");
    }
    public void confirmMergeChecksConfirmationPopup(){
        WebElement btnConfirm = mergeAndFindMobileElement(mergeCheckConfirmButton);
        elementClick(btnConfirm,"Click Confirm");
    }
}
