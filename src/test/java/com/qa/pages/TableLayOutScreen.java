package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableLayOutScreen extends OrderManagementScreen {


    @FindBy(xpath = "Continue")
    private WebElement continueBtn;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"00:00\"]")
    private WebElement tableSeated;

    @FindBy(xpath = "2")
    private WebElement checkSeatNo;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Merge\"]")
    private WebElement mergeBtn;

    @FindBy(xpath = "Done")
    private WebElement mergeDoneBtn;

    @FindBy(xpath = "Transfer")
    private WebElement transferBtn;

    @FindBy(xpath = "T1")
    private WebElement tableToTransfer;

    @FindBy(xpath = "Pay Check")
    private WebElement payCheckBtn;

    //@FindBy(xpath = "Open check")
    @FindBy(xpath = "openCheck")
    private WebElement openCheckBtn;

    @FindBy(xpath = "Re-Print Check")
    private WebElement reprintCheck;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Engin T\"])[2]")
    private WebElement serverNameTableCheck;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[6]")
    private WebElement printBtn;

    @FindBy(xpath = "Auto r")
    private WebElement customerName;

    @FindBy(xpath = "Transferred Successfully")
    private WebElement transferSuccessfulMsg;

    @FindBy(xpath = "Transferred check success.")
    private WebElement itemTransferSuccessfulMsg;

    @FindBy(xpath = "Done")
    private WebElement itemTransferDone;

    @FindBy(xpath = "Check already added")
    private WebElement checkAlreadyAddedTxt;

    @FindBy(xpath = "Select at least 2 checks")
    private WebElement SelectAtleast2CheckTxt;

    @FindBy(xpath = "Cancel")
    private WebElement CancelBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[4]")
    private WebElement SplitBtn;

    @FindBy(xpath = "Split By Seat")
    private WebElement splitSeat;

    @FindBy(xpath = "Split Seat")
    private WebElement splitSeatPage;

    @FindBy(xpath = "Select valid check")
    private WebElement selectValid;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"French Friese \"])[2]")
    private WebElement item;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]")
    private WebElement seperateIcon;

    @FindBy(xpath = "Back")
    private WebElement BackBtn;

    @FindBy(xpath = "Changes made in split, save and close")
    private WebElement SplitPopup;

    @FindBy(xpath = "Done")
    private WebElement DonePopup;

    @FindBy(xpath = "Save & Close")
    WebElement SaveClose;

    @FindBy(xpath = "Seats")
    private WebElement Order1;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]")
    private WebElement splitEvent;

    @FindBy(xpath = "Select the Order to Proceed")
    private WebElement selectOrder;

    @FindBy(xpath = "Add")
    public WebElement AddBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]")
    private WebElement SplitEvenly;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    private WebElement seat1Table;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable")
    private WebElement seat2Table;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeTable")
    private WebElement seat3Table;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    private WebElement seat2Group;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    private WebElement seat1Group;

    @FindBy(xpath = "1")
    private WebElement seat1OrderScreen;

    @FindBy(xpath = "2")
    private WebElement seat2OrderScreen;

    @FindBy(xpath = "3")
    private WebElement seat3OrderScreen;

    @FindBy(xpath = "4")
    private WebElement seat4OrderScreen;

    @FindBy(xpath = "5")
    private WebElement seat5OrderScreen;

    @FindBy(xpath = "Done")
    private WebElement Done1;

    @FindBy(xpath = "Delete")
    private WebElement deleteBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]")
    private WebElement GroupSeat;

    @FindBy(xpath = "Select the seats to Merge")
    private WebElement popupSelectTheSeatsToMerge;

    @FindBy(xpath = "Start Over")
    private WebElement startOver;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[4]")
    private WebElement printSplitSeat;

    @FindBy(xpath = "Select the Seat to Print")
    private WebElement PopupSelectTheSeatToPrint;

    @FindBy(xpath = "Receipt Printer")
    private WebElement receiptPrinter;

    @FindBy(xpath = "select any one seat/check for print")
    private WebElement selectAnyOneSeatForPrint;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[5]")
    private WebElement PrintAllSplitSeat;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[6]")
    private WebElement paySplitSeat;

    @FindBy(xpath = "Select the Seat to Pay")
    private WebElement selectTheSeatToPay;

    @FindBy(xpath = "select any one seat/check for payment")
    private WebElement selectAnyoneSeatCheckForPayment;

    @FindBy(xpath = "Split is not allowed, no order(s) in this check")
    private WebElement splitIsNotAllowedNoOrderInThisCheck;

    @FindBy(xpath = "Split is not allowed, payment(s) has been made in this check")
    private WebElement SplitIsNotAllowedPaymentInThisCheck;

    @FindBy(xpath = "Split")
    private WebElement splitBtnOrderScreen;

    @FindBy(xpath = "SPLIT BY SEAT")
    private WebElement SplitBySeatOrderScreen;

    @FindBy(xpath = "SPLIT CHECK")
    private WebElement SplitCheckOrderScreen;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Cash\"])[2]")
    // @FindBy(xpath = "Cash")
    private WebElement CashbtnPaymentWindow;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[7]")
    private WebElement OperationBtnTableLayout;

    @FindBy(xpath = "Operation")
    private WebElement operationScreen;

    @FindBy(xpath = "No Thanks")
    private WebElement NoThanksBtn;

    //@FindBy(xpath = "Print Or Send Receipt")
    @FindBy(xpath = "Print Or Send Receipt")
    private WebElement printOrSendReceipt;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Egg White\"])[2]")
    private WebElement modifyToSwipe;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    private WebElement table1Seat;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    private WebElement mergeSlider;

    @FindBy(xpath = "Empty List")
    private WebElement emptyMergeList;

    @FindBy(xpath = "New Check")
    private WebElement newCheck;

    @FindBy(xpath = "Menu items(s) has to be sent to the kitchen")
    private WebElement menuItemHasToBeSentToKitchen;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement check1OpenForCompleteSale;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement check2OpenForCompleteSale;

    @FindBy(xpath = "item(s) need to send to kitchen")
    private WebElement itemNeedToSendToKitchen;

    @FindBy(xpath = "Cancel")
    private WebElement cancelBtn;

    @FindBy(xpath = "Right")
    private WebElement rightBtn;

    @FindBy(xpath = "Floor 2")
    private WebElement floor2Btn;

    @FindBy(xpath = "Left")
    private WebElement leftBtn;

    @FindBy(xpath = "Floor 1")
    private WebElement floor1Btn;

    @FindBy(xpath = "All Check")
    private WebElement allCheckBtn;

    @FindBy(xpath = "Seated")
    private WebElement seatedBtn;

    @FindBy(xpath = "Check Down")
    private WebElement checkDownBtn;

    @FindBy(xpath = "On Hold")
    private WebElement onHoldBtn;

    @FindBy(xpath = "Expired")
    private WebElement expiredBtn;

    @FindBy(xpath = "Multiple")
    private WebElement multipleBtn;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"0\"])[1]")
    private WebElement seatedStatus;

    @FindBy(xpath = "Transfer to Server")
    private WebElement transferToServerTxt;

    @FindBy(xpath = "Paid")
    private WebElement paidTxt;

    @FindBy(xpath = "Order cannot be moved, Payment(s) has been made in seat - 1")
    private WebElement orderCannotMovedTxt;

    @FindBy(xpath = "Order cannot be moved, Payment(s) has been made in seat - 2")
    private WebElement orderCannotMovedTxt1;

    @FindBy(xpath = "Subtotal")
    private WebElement subtotalTxt;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"TL 1.900,00\"])[2]")
    private WebElement subTotalPrice;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"TL 1.500,00\"])[2]")
    private WebElement subTotalPrice1;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"TL 400,00\"])[1]")
    private WebElement subTotalPrice2;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"TL 1.900,00\"])[1]")
    private WebElement subTotalPrice4;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"TL 190,00\"][4])")
    private WebElement subTotalPrice5;

    @FindBy(xpath = "1. Cash(#1)")
    private WebElement cashTxt;

    @FindBy(xpath = "Empty seat cannot paid")
    private WebElement emptySeatCannotPaidTxt;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[11]")
    private WebElement txt;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"GC-1111 \"])[2]")
    private WebElement gc;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeStaticText[2]")
    private WebElement multiple;


    /* Check if locators for common tables names in Floor1 and Floor2 are the same...Don't delete this comment*/

    public void selectTable(String tableNo) {
        WebElement e = mergeAndFindElement(tableNo, "", TestUtils.Accessibility);
        elementClick(e, tableNo + " selected");
    }

    public void selectSeatNo(String numberOfSeats) {
        WebElement e = mergeAndFindElement(numberOfSeats, "", TestUtils.Accessibility);
        elementClick(e, numberOfSeats + " selected");
    }

    public void selectSplit(String numberOfSplit) throws InterruptedException {
        // Thread.sleep(500);
        WebElement e = mergeAndFindElement(numberOfSplit, "", TestUtils.Accessibility);
        elementClick(e, numberOfSplit + " selected");
    }

    int j = 0;

    public void verifyMenuHasSeperated(String count) {
        List<WebElement> listOfMenus = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell"));
        for (int i = 1; i <= listOfMenus.size(); i++) {
            WebElement menuName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
            String menuNameTxt = menuName.getText();
            if ((TestUtils.menuNameSplitCheck).equalsIgnoreCase(menuNameTxt)) {
                int k = j + i;
                if (Integer.parseInt(count) == k) {
                    utils.log().info("Menu Count = " + k + " " + menuNameTxt);
                } else {
                }
            } else {
                utils.log().info("Menu Name - " + menuNameTxt);
            }
        }
    }

    public void pressContinueBtn() {
        elementClick(continueBtn, "Tapped Continue button");
    }

    public void pressTransfer() {
        elementClick(transferBtn, "Transfer button is tapped");
    }

    /****** Create Table Order Scenario ******/

    public void checkTableSeated() {
        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[7]
        try {
            WebElement element = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[T11]/XCUIElementTypeStaticText[2]", "", TestUtils.Accessibility);
            String numbers = element.getText();
            if (element.isDisplayed()) {
                utils.log().info("Table seated -  " + numbers);
            } else {
            }
        } catch (Exception h) {
            utils.log().info("table is not seated");
        }
    }


    public void checkTableSeatedDineIn() {
        WebElement element = mergeAndFindElement("//XCUIElementTypeStaticText[@name=\"1\"][1]", "", TestUtils.Accessibility);
        if (element.isDisplayed()) {
            utils.log().info("there is 1 seats in T1");
        } else {
            utils.log().info("Error table is not seated");
        }
    }

    public void checkTableSeatedByOne() {
        WebElement element = mergeAndFindElement("1", "", TestUtils.Accessibility);
        if (element.isDisplayed()) {
            utils.log().info("There is 1 seat in T2");
        } else {
            utils.log().info("Error table is not seated");
        }
    }

    public String getCustomerName() {
        return elementGetText(customerName, "The customer name is -");
    }

    /****** Merge Operations ******/

    public void pressMerge() {
        elementClick(mergeBtn, "Merge button is tapped");
    }

    public void pressMergeDone() {
        try {
            elementClick(mergeDoneBtn, "Done (Merge) button is tapped");
        } catch (Exception e) {

        }
    }

    public void verifyMergedPopupAfterMerge(){
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView
        WebElement mergedPopup = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView"));
        String mergePopupTxt = mergedPopup.getText();
        utils.log().info("Displayed popup as - "+mergePopupTxt);
    }
    public void findMergeBox() {
        if (find(emptyMergeList, 2)) {
            utils.log().info("Merge box is visible");
        } else {
            utils.log().info("Merge box is Hide");
        }

    }

    public void verifyMerge() {
        WebElement element = mergeAndFindElement("3", "", TestUtils.Accessibility);
        if (element.isDisplayed()) {
            utils.log().info("there is 3 seat in T1");
        } else {
            utils.log().info("Error table is not seated");
        }
    }

    public void pressDone1() {
        try {
            elementClick(Done1, "Tapped Done Button on the Popup");
        } catch (Exception e) {
            utils.log().info("Tapped Done");
        }
    }



    public String getCheckAlreadyMergedString() {

        return elementGetText(checkAlreadyAddedTxt, "Check already added text is Displayed -");

    }

    public String Atleast2Chceks() {
        return elementGetText(SelectAtleast2CheckTxt, "Select at least 2 check text is - ");
    }

    public void PressCancelBtn() {
        elementClick(CancelBtn, "Tapped Cancel to disappear the Merge Box");
    }

    public String getPrintOrReceiptMsg() {
        return elementGetText(printOrSendReceipt, "I Should see the Popup is - ");
    }

    /****** Check options - Hold Scenario ******/

    public void pressPayCheck() {
        elementClick(payCheckBtn, "Pay check button is tapped");
    }

    public void pressOpenCheck() {
        elementClick(openCheckBtn, "Open Check button is tapped");
    }

    public void pressReprintCheck() {
        elementClick(reprintCheck, "Tapped Reprint checks Button");
    }

    public void pressPrintBtn() {
        elementClick(printBtn, "Print button is tapped");
    }

    public void assertTableOperation() {
        if (serverNameTableCheck.isDisplayed())
            utils.log().info("Table operation is completed");
        else
            utils.log().info("Table operation is not completed!");
    }

    /****** Table transfer ******/

    public String getTransferSuccessfulMsg() {
        return elementGetText(transferSuccessfulMsg, "Transfer successful message is displayed - ");
    }

    public String getItemTransferSuccessfulMsg() {
        return elementGetText(itemTransferSuccessfulMsg, "Item transfer successful message is displayed - ");
    }

    public void verifyServer() {
        List<WebElement> customer = (List<WebElement>) driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Engin A\"])[2]"));
        if (customer.isEmpty()) {
            utils.log().info("Transfer to server is completed");

        } else
            utils.log().info("Transfer to server is not completed");

    }
    @FindBy(xpath = "On merging the particular checks Discount will be removed. Do you want to continue?")
    WebElement onMergingTheParticularChecksPopup;
    public void ShouldSeeOnMergingTheParticularCheckPopup(){
        Assert.assertEquals(onMergingTheParticularChecksPopup.getText(),"On merging the particular checks Discount will be removed. Do you want to continue?");
        utils.log().info("Displayed popup as - "+onMergingTheParticularChecksPopup.getText());
    }

    @FindBy(xpath = "Merge Checks Confirmation")
    WebElement mergeCheckPopup;
    public void mergeCheckConfirmationPopup(){
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        Assert.assertEquals(mergeCheckPopup.getText(),"Merge Checks Confirmation");
        utils.log().info("Displayed popup as - "+mergeCheckPopup.getText());
    }
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm\"]")
    WebElement confirmButton;
    public void clickConfirmButton(){
        elementClick(confirmButton,"Selected - "+confirmButton.getText());
    }

    public void pressItemTransferDone() {
        elementClick(itemTransferDone, "Item transfer done");
    }

    /******  Split Scenario ******/
    public void pressSplitBtn() {
        elementClick(SplitBtn, "Tapped the Split Button");
    }

    @FindBy(xpath = "Split Check")
    WebElement SplitCheckBtn;

    public void pressSplitCheckBtn() {
        elementClick(SplitCheckBtn, "Tapped the Split Check Button");
    }

    public void pressSplitBySeat() {
        elementClick(splitSeat, "Tapped Split Seat");
    }

    public void verifySplitScreen() {
        if (splitSeatPage.isDisplayed()) {
            utils.log().info("Split Seat Page is Visible");
        } else {
            utils.log().info("Split Seat Page is not Visible");
        }

    }

    @FindBy(xpath = "Seat 1")
    WebElement seat1Table1;

    public void verifySplitSeatIsAvailable() {
        Assert.assertEquals(seat1Table1.getText(), "Seat 1");
        utils.log().info("Available - " + seat1Table1.getText());
    }

    public String getSelectValidCheckMsg() {
        return elementGetText(selectValid, " Select Valid Check Msg is displayed - ");
    }

    public void selectItem() {
        elementClick(item, "Select Item");
    }

    public void selectItem1(String name) {
//XCUIElementTypeStaticText[@name="Garlic Bread "]
        WebElement Item = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"" + name + " \"])", "", TestUtils.Accessibility);
        elementClick(Item, "Select Item");
    }

    public void selectItem2() {
        WebElement item1 = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"Ravioli \"])[3]", "", TestUtils.Accessibility);
        elementClick(item1, "Select Item");
    }

    public void selectItem3() {
        WebElement item1 = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"cake \"])[3]", "", TestUtils.Accessibility);
        elementClick(item1, "Select Item");
    }

    public void selectItem6() {
        WebElement item1 = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"cake \"])[2]", "", TestUtils.Accessibility);
        elementClick(item1, "Select Item");
    }

    public void selectItem4() {
        WebElement item1 = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"Ravioli Pesto \"])[3]", "", TestUtils.Accessibility);
        elementClick(item1, "Select Item");
    }

    public void selectItem5() {

        WebElement item1 = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"Cheesecake \"])[3]", "", TestUtils.Accessibility);
        elementClick(item1, "Select Item");
    }

    public void selectRavioli() {
        WebElement item1 = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"Ravioli \"])[2]", "", TestUtils.Accessibility);
        elementClick(item1, "Select Item");
    }

    public void seperateItem() {
        elementClick(seperateIcon, "Tapped Seperate Button");
    }

    public void pressBack() {
        elementClick(BackBtn, "Tapped Back Button");
    }

    public String getChangesMadeinSplitMag() {
        return elementGetText(SplitPopup, "Changes made in Split Msg is displayed -");
    }

    public void clickDone() {
        try {
            elementClick(DonePopup, "Tapped Done Button on Pop_up");
        } catch (Exception e) {
        }
    }

    public void clickSaveandClose() {
        elementClick(SaveClose, "Tapped Save&Close on Split Seat");
    }

    public void orderScreen() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        Thread.sleep(500);
        Assert.assertEquals(Order1.getText(), "Seats");
        //  if (Order1.isDisplayed()) {
        utils.log().info("I should see Order Screen");
//            List<WebElement> Listmenu = (List<WebElement>) driver.findElement(By.xpath()("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell");
//            int countOfMenu = Listmenu.size();
//            for (int i = 2; i <= countOfMenu; i++) {
//                WebElement menu = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]");
//                WebElement prize = (WebElement) driver.findElement(By.xpath()("///XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[2]");
//                String menuName = menu.getText();
//                String priceOfPrize = prize.getText();
//                utils.log().info("Menus Are - " + menuName + " - " + priceOfPrize);
//                try {                                                                                  //XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable[1]
//                    List<WebElement> modifier = (List<WebElement>) driver.findElement(By.xpath()("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable/XCUIElementTypeCell");
//                    int sizeOfModifier = modifier.size();
//                    for (int w = 1; w <= sizeOfModifier; w++) {
//                        WebElement modi = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]");
//                        WebElement Modiprize = (WebElement) driver.findElement(By.xpath()("///XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[3]");
//                        String modiName = modi.getText();
//                        String priceOfModi = Modiprize.getText();
//                        utils.log().info("Modifiers Are - " + modiName + " - " + priceOfModi);
//                    }
//                } catch (Exception z) {
//
//                }
//            }
//            List<WebElement> ListofTotals = (List<WebElement>) driver.findElement(By.xpath()("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
//            int totals = ListofTotals.size();
//            for (int j = 1; j <= totals; j++) {
//                WebElement menu1 = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[" + j + "]");
//                WebElement prize1 = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[" + j + "]");
//                String menuName1 = menu1.getText();
//                String priceOfPrize1 = prize1.getText();
//                utils.log().info(" " + menuName1 + " - " + priceOfPrize1);
//            }

//        } else {
//            utils.log().info("Not see Order Screen");
//        }
    }

    public void splitEvently() {
        if (splitEvent.isEnabled()) {
            utils.log().info("Split Evently is Enabled");
        } else {
            utils.log().info("Split Evently is Disabled");
        }
    }

    public String getSelectTheOrderToProceedMsg() {
        return elementGetText(selectOrder, "Select the Order to Proceed is displayed - ");

    }

    public void pressAddBtn() {
        elementClick(AddBtn, "Tapped Add Button in the Split Seat");
    }

    public void pressSplitEvenly() {
        elementClick(SplitEvenly, "Tapped Split Evenly in the Split Seat");
    }
    @FindBy(xpath = "Cannot split as payment(s) has been made in seats - 2")
    WebElement cannotSplitAsPayment;
    public void verifyCannotSplitAsPayments(){
        Assert.assertEquals(cannotSplitAsPayment.getText(),"Cannot split as payment(s) has been made in seats - 2");
        utils.log().info("Displayed popup as - "+cannotSplitAsPayment.getText());
    }
    public void verifySeat2() {
        if (find(seat2OrderScreen, 2)) {
            utils.log().info("Seat2 is Added ");
        } else {
            utils.log().info("Seat2 is not Added");
        }

    }

    public void verifySeat3() {
        if (find(seat3OrderScreen, 2)) {
            utils.log().info("Seat3 is Added ");
        } else {
            utils.log().info("Seat3 is not Added");
        }
    }

    public void seperateItemIsVisble() {
        if (seperateIcon.isEnabled()) {
            utils.log().info("Seperate Icon Is Enable");
        } else {
            utils.log().info("Seperate Icon Is Disable");
        }

    }

    public void verify2Table() {
        String Table1 = seat1Table.getText();
        String Table2 = seat2Table.getText();
        if (Table1.equalsIgnoreCase(Table2)) {
            utils.log().info("Item & Modifier has seperated Equally");
        } else {
            utils.log().info("Item & Modifier has not Seperated Equally");
        }

    }

    public void pressGroupSeat() {
        elementClick(GroupSeat, "Tapped the Group Seats Button");
    }

    public String getPopupMessage() {
        return elementGetText(popupSelectTheSeatsToMerge, "Select the seats to Merge is displayed - ");
    }

    public void pressSeat3() {
        elementClick(seat3OrderScreen, "Seat 3 for add menu item");
    }

    public void pressSeat2() {
        elementClick(seat2OrderScreen, "Tapped Seat 2 for add menu item");
    }

    public void pressSeat4() {
        elementClick(seat4OrderScreen, "Seat 3 for add menu item");
    }

    public void pressSeat5() {
        elementClick(seat5OrderScreen, "Tapped Seat 2 for add menu item");
    }

    public void pressSeat2Table() {
        elementClick(seat2Table, "Tapped Seat 2 Table");
    }

    public void pressSeat3Table() {
        elementClick(seat3Table, "Tapped Seat 3 Table");
    }

    public void pressSeat2Group() {
        elementClick(seat2Group, "Tapped Seat 2 for Group");
    }

    public void pressSeat1() {
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        elementClick(seat1Table, "Tapped Seat 1");
    }

    public void pressSeat1Group() {
        elementClick(seat1Group, "Tapped seat 1 wants to merge and select item club");
    }

    public void verifyClubItem() {
        List<WebElement> element = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]"));
        if (element.isEmpty()) {
            utils.log().info("Seat 2 is Empty, Menu Item club into seat 1");
        } else {
            utils.log().info("Seat 2 is not Empty, not Club into seat 1");
        }
    }

    public void verifyTouchAndAdd() {
        if (item.isDisplayed()) {
            utils.log().info("Paste the item in seat 2");
        } else {
            utils.log().info("not Paste into seat 2");
        }
    }

    public void clickStartOver() {
        elementClick(startOver, "Tapped Start Over button to get back original page");
    }

    public void pressPrintInSplitSeat() {
        elementClick(printSplitSeat, "Tapped Print Button in the Split Seat Screen");
    }

    public String getSelectTheSeatToPrint() {
        return elementGetText(PopupSelectTheSeatToPrint, "select The seats to print is Displayed - ");
    }

    public String getReceiptPrinterMsg() {
        return elementGetText(receiptPrinter, "Receipt Printer is Displayed - ");
    }

    public String getSelectAnyOneSeatForPrint() {
        return elementGetText(selectAnyOneSeatForPrint, "Select Any One Seat For Print is Displayed - ");
    }

    public void pressPrintAll() {
        elementClick(PrintAllSplitSeat, "Tapped Print All Button in the Split seat");
    }

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]")
    WebElement printSplitCheck;

    public void clickPrintButtonSplitCheck() {
        elementClick(printSplitCheck, "Selcted Button as - " + printSplitCheck.getText());
    }

    @FindBy(xpath = "Print All")
    WebElement printAllBtn;

    public void printAllBtn() {
        elementClick(printAllBtn, "Selected Button as - " + printAllBtn.getText());
    }

    public void findSeat2() {
        if (find(seat2Group, 2)) {
            utils.log().info("Seat2 is visible");
        } else {
            utils.log().info("Seat2 is disbled");
        }
    }

    public void pressPayBtn() {
        elementClick(paySplitSeat, "Tapped Pay Button in Split Seat Screen");
    }

    public String getSelectTheSeatToPay() {
        return elementGetText(selectTheSeatToPay, "Select the seat to pay is Displayed - ");
    }

    public String getSelectAnyOneSeatCheckForPaymentMsg() {
        return elementGetText(selectAnyoneSeatCheckForPayment, "Select any one seat/check for payment is displayed - ");
    }

    public void pressCashBtnPaymentWindow() throws Exception {
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        try {
            if (find(CashbtnPaymentWindow, 2)) {
                elementClick(CashbtnPaymentWindow, "Tapped Cash Payment");
            } else {
                scrollToElementPayments(CashbtnPaymentWindow, "up");
                elementClick(CashbtnPaymentWindow, "Tapped Cash Payment");
            }
        } catch (Exception w) {
            scrollToElementPayments(CashbtnPaymentWindow, "down");
            elementClick(CashbtnPaymentWindow, "Tapped Cash Payment");
        }


    }

    public void pressSplitSeatFromOrder() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        elementClick(splitBtnOrderScreen, "Tapped Split Icon From Order Management Screen");
        Thread.sleep(1000);
        elementClick(SplitBySeatOrderScreen, "Tapped Split By Seat Button From Order Management Screen");
    }

    public void pressSplitCheckFromOrder() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        elementClick(splitBtnOrderScreen, "Tapped Split Icon From Order Management Screen");
        Thread.sleep(1000);
        elementClick(SplitCheckOrderScreen, "Tapped Split Check Button From Order Management Screen");
    }

    public String getSplitIsNotAllowedNoOrderInThisCheck() {
        return elementGetText(splitIsNotAllowedNoOrderInThisCheck, "Split Is Not Allowed No Order In This Check is Displayed - ");
    }

    public String getSplitIsNotAllowedPaymentInThisCheck() {
        return elementGetText(SplitIsNotAllowedPaymentInThisCheck, "Split Is Not Allowed Payment In This Check is Displayed - ");
    }

    public void pressOperation() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        elementClick(OperationBtnTableLayout, "Tapped Operation Button on the Table Layout");
    }

    public void getOperationScene() {
        try {
            if (find(operationScreen, 2)) {
                utils.log().info("Operation screen is Displayed");
            }
        } catch (Exception e) {
            utils.log().info("Operation screen is not Displayed");
        }

    }

    public void verifyAllSeatIsMerged(String numb) {
        pressArrowDown1();
        WebElement seat = mergeAndFindElement(numb, "", TestUtils.Accessibility);
        if (seat.isDisplayed()) {

            utils.log().info(numb + " Seats are Merged with menu Items ");
        } else {
            utils.log().info("Not Merged with menu items");
        }
        pressArrowDown1();
    }

    public void pressNoThanks() {
        elementClick(NoThanksBtn, "Tapped No Thanks button ");
    }

    public void selectModifiersFromModifyScreen(String Modifier) {
        WebElement modify = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"" + Modifier + "\"])[2]", "", TestUtils.Accessibility);
        if (find(modify, 2)) {
            utils.log().info(modify + " Modifiers add into Select Modifiers");
        } else {
            utils.log().info("Modifiers Not Add into Select Modifiers");
        }
    }

    public void swipeTheModifiers() throws InterruptedException {
        swipe(884, 561, 810, 561, 1000);

    }

    public void clickDeleteBtn() {
        elementClick(deleteBtn, "Tapped Delete Button");
    }

    public void pressMergeSlider() {
        elementClick(mergeSlider, "Tapped Merge Slider");
        elementClick(mergeSlider, "Tapped Merge Arrow ");
    }

    public void pressMergeSlider1() {
        elementClick(mergeSlider, "Tapped Merge Arrow ");
    }

    public void pressNewCheckButton() {
        // WebElement element = mergeAndFindMobileElement(newCheck,"", TestUtils.Accessibility);
        elementClick(newCheck, "Tapped New Check Button");
    }

    public void mulitpleCheckVisible() {
        String data = multiple.getText();
        if (find(multiple, 2)) {
            utils.log().info("Mulitiple check is visible - " + data);
        } else {
            utils.log().info("Multiple check is not visible");
        }
    }

    public void closeTheChecks1() {
        elementClick(check1OpenForCompleteSale, "Tapped ");
    }

    public void closeTheChecks2() {
        elementClick(check2OpenForCompleteSale, "Tapped ");
    }

    public String MenuItemHasToSentKitchen() {
        return elementGetText(menuItemHasToBeSentToKitchen, "Menu Item has to be sent to kitchen txt is displayed - ");
    }

    public String getItemsNeedToSendToKitchen() {
        return elementGetText(itemNeedToSendToKitchen, "items need to send to kitchen txt is dispalayed - ");
    }

    public void clickCancelBtn() {
        elementClick(cancelBtn, "Tapped cancel Button");
    }

    public void verifyCheckDownIsIncreased() {
        WebElement check1 = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[2]", "", TestUtils.Accessibility);
        String data = check1.getText();
        if (find(check1, 2)) {
            utils.log().info("Check Down is Increased - " + data);
        } else {
            utils.log().info("Check Down is not Increased");
        }
    }

    public void clickRightBtn() {
        elementClick(rightBtn, "Tapped Right Symbol Button");
    }

    public String verifyFloor2() {
        return elementGetText(floor2Btn, "Floor 2 is visible - ");
    }

    public void clickLeftBtn() {
        elementClick(leftBtn, "Tapped Left Symbol Button");
    }

    public String verifyFloor1() {
        return elementGetText(floor1Btn, "Floor 1 is visible - ");
    }

    public void verifyAllTypeChecks() {
        WebElement e1 = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]", "", TestUtils.Accessibility);
        String data = e1.getText();
        utils.log().info(data + "datas");
    }

    public void verifySeatedStatus() {
        String data = seatedStatus.getText();
        if (find(seatedStatus, 2)) {
            utils.log().info("Seated status - " + data);
        } else {
            utils.log().info("seated status is not - " + data);
        }
    }

    public String verifyTransferToServer() {
        return elementGetText(transferToServerTxt, "Transfer page is displayed - ");
    }

    public void verifyMenuItem(String name) {
        try {
            WebElement menuItem = mergeAndFindElement(name, "", TestUtils.Accessibility);
            if (menuItem.isDisplayed()) {
                utils.log().info("Menu Item is visible");
            }
        } catch (Exception e) {
            utils.log().info("menu item is not visible");
        }
    }

    public String verifyPaidTxt() {
        return elementGetText(paidTxt, "Paid is Displayed - ");
    }

    public void verifyCreatedSeat() {
        if (find(seat5OrderScreen, 2)) {
            utils.log().info("Seat 5 is displayed ");
        } else {
            utils.log().info("Seat is not displayed");
        }
    }

    public String verifyOrderCannotMovedPopup() {
        return elementGetText(orderCannotMovedTxt, "Order cannot moved txt is displayed - ");
    }

    public String verifyOrderCannotMovedPopup1() {
        return elementGetText(orderCannotMovedTxt1, "Order cannot moved txt is displayed - ");
    }

    public void verifyMenuAddedIntoNextSeat() {
        if (find(subTotalPrice, 2)) {
            utils.log().info("Menu Item Moved into seat two");
        } else {
            utils.log().info("Menu Item is not moved");
        }
    }

    public void verifyMenuAddedIntoNextSeat1() {
        if (find(subTotalPrice1, 2)) {
            utils.log().info("Menu Item Moved into seat two");
        } else {
            utils.log().info("Menu Item is not moved");
        }
    }

    public void verifyMenuAddedIntoNextSeat2() {
        if (find(subTotalPrice, 2)) {
            utils.log().info("Menu Item Moved into seat two");
        } else {
            utils.log().info("Menu Item is not moved");
        }
    }

    public void verifyMenuAddedIntoNextSeat3() {
        if (subTotalPrice2.isDisplayed()) {
            utils.log().info("Menu Item Moved into seat two");
        } else {
            utils.log().info("Menu Item is not moved");
        }
    }

    public void verifyMenuAddedIntoNextSeat4() {
        if (subTotalPrice4.isDisplayed()) {
            utils.log().info("Menu Item Moved into seat two");
        } else {
            utils.log().info("Menu Item is not moved");
        }
    }

    public String verifyCashApplied() {
        return elementGetText(cashTxt, "Cash is Displayed - ");

    }

    public void verifyCashApplied1(String money) {
        WebElement menu = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"" + money + "\"])[2]", "", TestUtils.Accessibility);
        if (menu.isDisplayed()) {
            utils.log().info("cash is Added - " + money);
        } else {
            utils.log().info("cash is not Added");

        }
    }

    public String verifyEmptySeatPopup() {
        return elementGetText(emptySeatCannotPaidTxt, "Empty seat Popup is displayed - ");
    }

    public void verifyPaidAmount(String prize) {
        WebElement paidAmount = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"" + prize + "\"])[5]", "", TestUtils.Accessibility);
        if (paidAmount.isDisplayed()) {
            utils.log().info("Paid AMount is Displayed - " + prize);
        } else {
            utils.log().info("Paid Amount is Not displayed");
        }
    }

    public void verifyPaidAmountFrenchFriese(String amount) {
        WebElement paidAmount = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"" + amount + "\"])[4]", "", TestUtils.Accessibility);
        if (find(paidAmount, 2)) {
            utils.log().info("Paid AMount is Displayed - " + amount);
        } else {
            utils.log().info("Paid Amount is Not displayed");
        }
    }

    public void verifyMenuItemPrizeSplit() {
        WebElement amount = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"TL 1.250,00\"])[1]", "", TestUtils.Accessibility);
        String money = amount.getText();
        if (amount.isDisplayed()) {
            utils.log().info("Menu Item Prize is split Evenly - " + money);
        } else {
            utils.log().info("Menu Item Prize is not split Evenly");
        }
    }

    public void verifyDiscountIsApplied(String Discount) {
        WebElement discount = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"" + Discount + "\"])[3]", "", TestUtils.Accessibility);
        WebElement discount1 = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"" + Discount + "\"])[5]", "", TestUtils.Accessibility);

        if ((discount.isDisplayed()) && (discount1.isDisplayed())) {
            utils.log().info("Discount is split - " + Discount);
        } else {
            utils.log().info("Discount is not split");
        }
    }

    public void verifyDiscountIsMovedIntoNextSeat(String Discount) {
        WebElement discount = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"" + Discount + "\"])[2]", "", TestUtils.Accessibility);
        if (discount.isDisplayed()) {
            utils.log().info("Discount is moved into next seat - " + Discount);
        } else {
            utils.log().info("Discount is not moved into next seat ");
        }
    }

    public void verifyDeliveryChargeAdded() {
        WebElement delivery = mergeAndFindElement("Delivery Charge ", "", TestUtils.Accessibility);//Prod
        //WebElement delivery = (WebElement) driver.findElement(By.xpath()("Delivery Charge  ");//Staging
        String charge = delivery.getText();
        WebElement amount = mergeAndFindElement("10,00", "", TestUtils.Accessibility);
        String Price = amount.getText();
        if ((delivery.isDisplayed()) && (amount.isDisplayed())) {
            utils.log().info(charge + Price);
        } else {
            utils.log().info("Delivery charge is not Added");
        }
    }

    public void verifyDeliveryChargeAddedForLoyalty() {
        WebElement delivery = mergeAndFindElement("Delivery Charge ", "", TestUtils.Accessibility);//Prod
        //WebElement delivery = (WebElement) driver.findElement(By.xpath()("Delivery Charge  ");//Staging
        String charge = delivery.getText();
        WebElement amount = mergeAndFindElement("25,00", "", TestUtils.Accessibility);
        String Price = amount.getText();
        if ((delivery.isDisplayed()) && (amount.isDisplayed())) {
            utils.log().info(charge);
        } else {
            utils.log().info("Delivery charge is not Added");
        }
    }

    public void verifySubtotalShouldNotChange() {
        WebElement delivery = mergeAndFindElement("Subtotal", "", TestUtils.Accessibility);
        String total = delivery.getText();
        WebElement amount = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"TL 0,00\"])[1]", "", TestUtils.Accessibility);
        String Price = amount.getText();
        if ((delivery.isDisplayed()) && (amount.isDisplayed())) {
            utils.log().info(total);
        } else {
            utils.log().info("Delivery charge is not Added");
        }
    }

    public void tapCloseDay() {
        WebElement closeDay = mergeAndFindElement("Close Day", "", TestUtils.Accessibility);
        elementClick(closeDay, "Tapped close day");
    }

    public void verifyCloseDayScreen() {
        WebElement closeDay = mergeAndFindElement("Close Day", "", TestUtils.Accessibility);
        if (closeDay.isDisplayed()) {
            utils.log().info("Close day is Displayed");
        } else {
            utils.log().info("Not Displayed");
        }
    }


    public void getCreditCardValue() {
//        iOSScrollToElementUsingMobileScroll(txt);
        WebElement credit = mergeAndFindElement("Credit Card", "", TestUtils.Accessibility);
        WebElement price = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"0,00\"])[1]", "", TestUtils.Accessibility);

        if (txt.isDisplayed()) {
            String data = credit.getText();
            String money = price.getText();
            utils.log().info(data + " - " + money);
        } else {
            utils.log().info("Not Shown");
        }

    }

    public void giftCardSeat1() {
        String Gift = gc.getText();
        WebElement sub = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"TL 100,00\"])[3]", "", TestUtils.Accessibility);
        String total = sub.getText();
        if (gc.isDisplayed() && sub.isDisplayed()) {
            utils.log().info("Gift card is displayed in seat 1 with amount - " + Gift + " - " + total);
        } else {
            utils.log().info("Gift card is not displayed ");
        }
    }

    public void giftCardSeat2() {
        String Gift = gc.getText();
        WebElement sub = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"TL 100,00\"])[3]", "", TestUtils.Accessibility);
        String total = sub.getText();
        if (gc.isDisplayed() && sub.isDisplayed()) {
            utils.log().info("Gift card is displayed in seat 2 with amount - " + Gift + " - " + total);
        } else {
            utils.log().info("Gift card is not displayed ");
        }
    }

    public void giftSeat1() {
        elementClick(gc, "Tapped Gift card in Seat 1");
    }

    @FindBy(xpath = "Batch/Tip Adjustment")
    WebElement batchTipAdjustBtn;

    public void clickBatchTipButton() {
        elementClick(batchTipAdjustBtn, " Tapped Batch/Tip Adjustment Button");
    }

    public void clickDeviceDropDownButtonBatchScreen() throws InterruptedException {
        Thread.sleep(4000);
        WebElement dropDown = (WebElement) driver.findElement(By.xpath("Down Arrow Black"));
        elementClick(dropDown,"Selected - Drop Down Black");
    }

    public void verifyChecksInBatchScreen() {
        List<WebElement> check = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell"));
        int checkCount = check.size();
        utils.log().info("Batch Check count - " + checkCount);
    }

    public void verifyBatchInitiatedPopup() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement batchPopup = (WebElement) driver.findElement(By.xpath("Batch process has been initiated and it may take some time to complete. Please check back after few minutes."));

        if (batchPopup.isDisplayed()) {
            utils.log().info("Batch initiated popup is shown");
        } else {
            utils.log().info("Batch initiated popup is NOT shown");
        }
    }

    public void selectTheMppgPaymentInDevice() throws Exception {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        List<WebElement> deviceList = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
        int deviceListCount = deviceList.size();
        utils.log().info("List of device - " + deviceListCount);
        WebElement listDevice = (WebElement) driver.findElement(By.xpath("MPPG Auth"));
        String listDeviceTxt = listDevice.getText();

        try {
            if (listDevice.isDisplayed()) {
                elementClick(listDevice, "MPPG AUTH device is selected - " + listDeviceTxt);
            } else {
                scrollToElementPayments(listDevice, "up");
                elementClick(listDevice, "MPPG AUTH device is selected - " + listDeviceTxt);
            }
        } catch (Exception w) {
            scrollToElementPayments(listDevice, "down");
            elementClick(listDevice, "MPPG AUTH device is selected - " + listDeviceTxt);
        }

    }

    public void verifyLastBatchStartedText() throws Exception {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement downBtn = (WebElement) driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Down Arrow Black\"])[1]"));
        elementClick(downBtn, "Down Btn Selected");
        selectTheMppgPaymentInDevice();
        WebElement lastBatchStarted = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]"));
        String lastBatchStartedTxt = lastBatchStarted.getText();
        WebElement dateTime = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String dateTimeTxt = dateTime.getText();
        try {
            verifyBatchCheckAvailable1();
            WebElement batchComplete = (WebElement) driver.findElement(By.xpath("Batch Completed"));
            String batchText = batchComplete.getText();
            if (lastBatchStarted.isDisplayed()) {
                utils.log().info("Seen " + lastBatchStartedTxt + " - " + dateTimeTxt + " " + batchText);
            } else {
                utils.log().info("Not Seen Last batch started text");
            }
        } catch (Exception w) {

        }
    }

    @FindBy(xpath = "Batch In Progress")
    WebElement batchInProgress;
    @FindBy(xpath = "Batch Completed")
    WebElement batchComplete;
    @FindBy(xpath = "ToggleIcon")
    WebElement ToggleIcon;


    public void verifyBatchCheckAvailable1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> check = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell"));
        int checkCount = check.size();
        utils.log().info("Batch Check count - " + checkCount);
        String batchText = batchInProgress.getText();
        String batchCompleteText = batchComplete.getText();
        while (true) {
            elementClick(ToggleIcon, "Toggle Icon Selected");
            Thread.sleep(1000);
            elementClick(batchTipAdjustBtn, "Batch/Tip Selected");
            Thread.sleep(1000);
            if (find(batchInProgress, 2)) {
                utils.log().info("Batch IN Process - " + batchText + " - Check Count - " + checkCount);
            } else {
                utils.log().info("Batch Process Has been Completed - " + batchCompleteText + " - Check count - " + checkCount);
                break;
            }
        }


    }

    @FindBy(xpath = "**/XCUIElementTypeTextField[`value == \"Search\"`]")
    WebElement searchTextField;

    public void clickTheCheckFromBatchScreen() {
        WebElement search = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeTextField[@value='Search']"));
        String globalCheckNumber = TestUtils.globalCheckNumber;
        sendKeys(search, globalCheckNumber);
        WebElement phoneOrders1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"" + globalCheckNumber + "\"]"));

        if (phoneOrders1.isDisplayed()) {
            elementClick(phoneOrders1, "Tapped Batch Check in Batch Screen - " + globalCheckNumber);
        } else {
            utils.log().info("Not Selected Batch check" + globalCheckNumber);
        }

    }

    public void clickTheCheckFromBatchScreen1() {
//        WebElement search = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeTextField[@value='Search']");
//        String globalCheckNumber = TestUtils.globalCheckNumber;
//        sendKeys(search, globalCheckNumber);
        WebElement phoneOrders1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"" + TestUtils.globalCheckNumber + "\"]"));

        if (phoneOrders1.isDisplayed()) {
            elementClick(phoneOrders1, "Tapped Batch Check in Batch Screen - " + TestUtils.globalCheckNumber);
        } else {
            utils.log().info("Not Selected Batch check" + TestUtils.globalCheckNumber);
        }

    }

    public String fieldTxt1;

    public String changeTipAmount() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        pressPinC();
        pressPin5();
        pressPin00();
        WebElement field = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));
        String fieldTxt = field.getText();
        fieldTxt1 = fieldTxt.replace("$", "");
        TestUtils.tipAmount = fieldTxt1;
        utils.log().info("Tip Amount Entered - " + fieldTxt1);
        elementClick(continueBtn, "Selected Continue ");
        return fieldTxt1;
    }

    public void changeTipAmount1() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        pressPinC();
        pressPin5();
        pressPin0();
        elementClick(continueBtn, "Selected Continue ");

    }

    public void shouldSeeInvalidTipAmountPopup(){
        WebElement invalidTipAmount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeTextView[@name=\"Total amount must be greater than check amount.\"]"));
        Assert.assertEquals(invalidTipAmount.getText(),"Total amount must be greater than check amount.");
        utils.log().info("Displayed as - "+"Total amount must be greater than check amount.");
    }

    public void VerifyTipAmountIsAppliedOrNot() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String tipAmount1 = TestUtils.tipAmount;
        utils.log().info("tipAmount1 - " + tipAmount1);
        WebElement search = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeTextField[@value=\"Search\"]"));
        String globalCheckNumber = TestUtils.globalCheckNumber;
        sendKeys(search, globalCheckNumber);
        WebElement checkkk = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell//XCUIElementTypeStaticText[7]"));
        String CheckTxt = checkkk.getText();
        utils.log().info("CheckTxt - " + CheckTxt);
        if (tipAmount1.equalsIgnoreCase(CheckTxt)) {
            utils.log().info("Changed Tip is Same - " + tipAmount1);
        } else {
            utils.log().info("Changed Tip is NOT Same - " + tipAmount1);
        }
    }


    public void verifyAmountWithDeliveryCharge() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement deliveryAmount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[2]"));
        String deliveryAmountTxt = deliveryAmount.getText();

        WebElement subtotal = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subtotalTxt = subtotal.getText();
        String subtotalTxt1 = subtotalTxt.replace("$", "");
        WebElement Tax = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taxTxt = Tax.getText();
        String taxTxt1 = taxTxt.replace("$", "");
        WebElement Total = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String totalTxt = Total.getText();
        String totalTxt1 = totalTxt.replace("$", "");
        WebElement paidAmount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String paidAmountTxt = paidAmount.getText();
        String paidAmountTxt1 = paidAmountTxt.replace("$", "");
        if (subtotalTxt1.equalsIgnoreCase(deliveryAmountTxt)) {
            utils.log().info("Subtotal Amount is same with delivery charge - " + subtotalTxt + " - Delivery charge as " + deliveryAmountTxt);
        } else if (taxTxt1.equalsIgnoreCase(deliveryAmountTxt)) {
            utils.log().info("Tax Amount is same with delivery charge - " + taxTxt + " - Delivery charge as " + deliveryAmountTxt);
        } else if (totalTxt1.equalsIgnoreCase(deliveryAmountTxt)) {
            utils.log().info("Total Amount is same with delivery charge - " + totalTxt + " - Delivery charge as " + deliveryAmountTxt);
        } else if (paidAmountTxt1.equalsIgnoreCase(deliveryAmountTxt)) {
            utils.log().info("Paid Amount is same with delivery charge - " + paidAmountTxt + " - Delivery charge as " + deliveryAmountTxt);
        } else {

            utils.log().info("Total Amount is Not Same- " + totalTxt + " - Delivery charge as " + deliveryAmountTxt);
            utils.log().info("Subtotal Amount is same with delivery charge - " + subtotalTxt);
            utils.log().info("Tax Amount is same with delivery charge - " + taxTxt);
            utils.log().info("Total Amount is same with delivery charge - " + totalTxt);
            utils.log().info("Paid Amount is same with delivery charge - " + paidAmountTxt);


        }

    }

    public void selectTheNumberOfSplitItem(String numb) {
        WebElement numberSelect = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"" + numb + "\"]"));
        elementClick(numberSelect, "Selected - " + numb);
    }

    public void clickSplitBySeatInSplitCheck() {
        WebElement splitBySeat = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]"));
        elementClick(splitBySeat, "Selected Button as - " + splitBySeat.getText());
    }

    public void verifySeatsAvaliableInSplitCheck() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String seatNumber = TestUtils.seatNumber;
        WebElement getSeatNumber = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
        String seatNumber1 = getSeatNumber.getText();
        String seatNumber11 = seatNumber1.replaceAll("[A-Za-z ]", "");
        utils.log().info("seatNumber - " + seatNumber);
        utils.log().info("seatNumber11 - " + seatNumber11);
        Assert.assertEquals(seatNumber, seatNumber11);
        utils.log().info("Seat Number - " + seatNumber11 + " is Available");
    }

    public void verifySeatsAvaliableInSplitCheck1() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String seatNumber = TestUtils.seatNumberOrderScreen;
        WebElement getSeatNumber = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
        String seatNumber1 = getSeatNumber.getText();
        String seatNumber11 = seatNumber1.replaceAll("[A-Za-z ]", "");
        utils.log().info("seatNumber - " + seatNumber);
        utils.log().info("seatNumber11 - " + seatNumber11);
        Assert.assertEquals(seatNumber, seatNumber11);
        utils.log().info("Seat Number - " + seatNumber11 + " is Available");
    }

    public void verifySplittedCheckAvailableInActiveCheck() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement searchTab = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));
        // String checkNumber = TestUtils.globalCheckNumber1;
        searchTab.sendKeys(TestUtils.globalCheckNumber1);
        WebElement phoneOrders = mergeAndFindElement(TestUtils.globalCheckNumber1, "", TestUtils.Accessibility);
        if (phoneOrders.isDisplayed()) {
            utils.log().info(TestUtils.globalCheckNumber1 + " - Closed Check is displayed in Active tab ");
            elementClick(phoneOrders, "Selected - " + TestUtils.globalCheckNumber1);
        } else {
            utils.log().info("Closed check is not displayed");
        }
    }

    public String[] MenuNameTxt = {" ", " ", " ", " "," "," "," "," "," "," "," "," "," "," "," "," "};
    public String[] MenuNamePrize = {" ", " ", " ", " "," "," "," "," "," "," "," "," "," "," "," "," "};

    public String[] MenuNameTxt2 = {" ", " ", " ", " "," "," "," "," "," "," "," "," "," "," "," "," "};
    public String[] MenuNamePrize2 = {" ", " ", " ", " "," "," "," "," "," "," "," "," "," "," "," "," "};

    public String[] ModifierName = {" ", " ", " ", " ", " ", " "," "," "," "," "," "," "};
    public String[] ModifierPrize = {" ", " ", " ", " ", " ", " "," "," "," "," "," "," "};

    public String[] ModifierName2 = {" ", " ", " ", " ", " ", " "," "," "," "," "," "," "};
    public String[] ModifierPrize2 = {" ", " ", " ", " ", " ", " "," "," "," "," "," "," "};

    public String[] MenuQty = {" ", " ", " ", " ", " ", " ", " "," "," "," "," "," "," "};
    public String[] MenuQty2 = {" ", " ", " ", " ", " ", " ", " "," "," "," "," "," "," "};

    public String[] ModifierQty = {" ", " ", " "," "," "," "," "," "," "," "," "," "," "," "," "};
    public String[] ModifierQty2 = {" ", " ", " "," "," "," "," "," "," "," "," "," "," "," "," "};

    public void verifyMenuIsSplittedEvenly() {
        List<WebElement> menus = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell"));
        for (int i = 1; i <= menus.size(); i++) {
            WebElement menuName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
            MenuNameTxt[i] = menuName.getText();
            TestUtils.SplitSeatMenus[i] = MenuNameTxt[i];
            WebElement menuQuantity = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeButton/XCUIElementTypeStaticText"));
            MenuQty[i] = menuQuantity.getText();
            TestUtils.MenuQuantity[i] = MenuQty[i];

            //    utils.log().info("Seat 1 Menu Name - " + MenuNameTxt[i]);
            WebElement menuPrize = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[2]"));
            MenuNamePrize[i] = menuPrize.getText();
            TestUtils.SplitSeatMenusPrize[i] = MenuNamePrize[i];
            utils.log().info("Seat 1 Menu Name  - "+i+" " + MenuNameTxt[i] + " Quantity - " + MenuQty[i] + " Prize - " + MenuNamePrize[i]);
            try {                                                                                       //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]
                List<WebElement> modifers = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
                for (int k = 1; k <= modifers.size(); k++) {

                    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]
                    WebElement modifierName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + k + "]/XCUIElementTypeStaticText[1]"));
                    ModifierName[i] = modifierName.getText();
                    TestUtils.ModifierName[i] = ModifierName[i];
                    //  utils.log().info("Seat 1 Modifier Name - "+ ModifierName[i]);
                    WebElement ModifierQtyy = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + k + "]/XCUIElementTypeStaticText[2]"));
                    ModifierQty[i] = ModifierQtyy.getText();
                    TestUtils.ModifierQty[i] = ModifierQty[i];
                    WebElement modifierPrize = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + k + "]/XCUIElementTypeStaticText[3]"));
                    ModifierPrize[i] = modifierPrize.getText();
                    TestUtils.ModifierPrize[i] = ModifierPrize[i];
                    utils.log().info("Seat 1 Modifier - "+i+" " + ModifierName[i] + " Qty - " + ModifierQty[i] + " Prize - " + ModifierPrize[i]);
                }
            } catch (Exception w) {

            }

        }
        List<WebElement> menus1 = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell"));
        for (int j = 1; j <= menus1.size(); j++) {
            WebElement menuName1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + j + "]/XCUIElementTypeStaticText[1]"));
            MenuNameTxt2[j] = menuName1.getText();
            TestUtils.SplitSeatMenus2[j] = MenuNameTxt2[j];
            // utils.log().info(" Seat 2 Menu Name - "+ MenuNameTxt2[j]);
            WebElement menuQuantity = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + j + "]/XCUIElementTypeButton/XCUIElementTypeStaticText"));
            MenuQty2[j] = menuQuantity.getText();
            TestUtils.MenuQuantity2[j] = MenuQty2[j];
            WebElement menuPrize1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + j + "]/XCUIElementTypeStaticText[2]"));
            MenuNamePrize2[j] = menuPrize1.getText();
            TestUtils.SplitSeatMenusPrize2[j] = MenuNamePrize2[j];
            utils.log().info("Seat 2 Menu Name - "+j+" " + MenuNameTxt2[j] + " Quantity - " + MenuQty2[j] + " Prize - " + MenuNamePrize2[j]);
            try {
                //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]
                List<WebElement> modifers = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+j+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
                for (int k = 1; k <= modifers.size(); k++) {
                    WebElement modifierName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+j+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + k + "]/XCUIElementTypeStaticText[1]"));
                    ModifierName2[j] = modifierName.getText();
                    TestUtils.ModifierName2[j] = ModifierName2[j];
                    //  utils.log().info("Seat 1 Modifier Name - "+ ModifierName[i]);
                    WebElement ModifierQty22 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+j+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + k + "]/XCUIElementTypeStaticText[2]"));
                    ModifierQty2[j] = ModifierQty22.getText();
                    TestUtils.ModifierQty2[j] = ModifierQty2[j];

                    WebElement modifierPrize = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+j+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + k + "]/XCUIElementTypeStaticText[3]"));
                    ModifierPrize2[j] = modifierPrize.getText();
                    TestUtils.ModifierPrize2[j] = ModifierPrize2[j];
                    utils.log().info("Seat 2 Modifier - "+j+" " + ModifierName2[j] + " Qty - " + ModifierQty2[j] + " Prize - " + ModifierPrize2[j]);
                }
            } catch (Exception z) {

            }

        }
        Assert.assertEquals(String.valueOf(menus.size()), String.valueOf(menus1.size()));
        utils.log().info("Menu Size is SAME - " + menus.size());
        for (int i = 1; i <= menus.size(); i++) {
            Assert.assertEquals(MenuNameTxt[i], MenuNameTxt2[i]);
            //    utils.log().info("Splitted Menu is SAME - " + MenuNameTxt[i]);
            Assert.assertEquals(MenuQty[i],MenuQty2[i]);
//            Assert.assertEquals(MenuNamePrize[i], MenuNamePrize2[i]);
            utils.log().info("Splitted Menu is SAME - " +i+" "+ MenuNameTxt[i] +" Qty - "+MenuQty[i] + " Prize - " + MenuNamePrize[i]);
            try {
                Assert.assertEquals(ModifierName[i], ModifierName2[i]);
                //Assert.assertEquals(ModifierPrize[i], ModifierPrize2[i]);
                Assert.assertEquals(ModifierQty[i], ModifierQty2[i]);
                utils.log().info("Splitted Modifier is SAME - "+i+" " + ModifierName[i] + " Qty - " + ModifierQty[i] + " Price - " + ModifierPrize[i]);
            } catch (Exception s) {

            }
        }
    }

    public void verifyAllMenuIsClubIntoSingleSeat() {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        List<WebElement> seat1TableMenuCount = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell"));
        int sizeOfCount = seat1TableMenuCount.size();
        Assert.assertEquals(sizeOfCount, 0);
        utils.log().info("Seat 1 Menu Count - " + sizeOfCount);
        List<WebElement> seat1TableMenuCount1 = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell"));
        int sizeOfCount1 = seat1TableMenuCount1.size();
        utils.log().info("Seat 2 Menu Count - " + sizeOfCount1);
//        for (int i = 1; i <= sizeOfCount1; i++) {
//            WebElement menus = (WebElement) driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]");
//            String menuTxt = menus.getText();
//            utils.log().info("After done Group Seats, Seat 2 Menus - " + menuTxt);
//        }

    }

    public void getSeat1Prize() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement subTotal = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        WebElement tax = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        WebElement paidAmount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        WebElement Total = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String subTotalTxt = subTotal.getText();
        String subTotalTxt1 = subTotalTxt.replaceAll("[A-Z$. ]","");
        String subTotalTxt11 = subTotalTxt1.replaceAll("[,]","");
        double subTotalTxt2 = Double.parseDouble(subTotalTxt11);
        TestUtils.subtotalTxt = subTotalTxt;
        utils.log().info("Seat 1 SubTotal - " + subTotalTxt);
        double subtotalValue = Double.parseDouble(subTotalTxt11);
        double taxValue = ((subtotalValue*8)/100);//DefaultTAx
        // TestUtils.taxTxtOfBeforeRound = String.valueOf(taxValue);


        BigDecimal taxx=new BigDecimal(taxValue).setScale(2, RoundingMode.HALF_UP);
        double a=taxx.doubleValue();
//        double a1 = (a*100.00/100.00) ;
        double a1 = (int)Math.round(a);
        DecimalFormat d= new DecimalFormat("0.00");
        d.format(a1);
        utils.log().info("Tax Value After Format - "+d.format(a1));
        String taxTxt = String.valueOf(d.format(a1));
//        String taxTxt = String.valueOf(a);
        TestUtils.taxTxtSeat1 = taxTxt;
        TestUtils.taxTxtOfBeforeRound1 = String.valueOf(taxValue);
        String ActualValueTax = tax.getText();
        String ActualValueTax1 = ActualValueTax.replaceAll("[A-Z$. ]","");
        String ActualValueTax2 = ActualValueTax1.replaceAll(",","");
//        String ActualValueTax3 =String.valueOf(Double.parseDouble(ActualValueTax2));

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String ActualValueTax3=decimalFormat.format(Double.parseDouble(ActualValueTax2));

        utils.log().info("taxTxt - " + taxTxt);
        utils.log().info("ActualValueTax3 - " + ActualValueTax3);
        Assert.assertEquals(taxTxt,ActualValueTax3);
        utils.log().info("Seat 1 Tax - " + taxTxt);
        String paidAmountTxt = paidAmount.getText();
        TestUtils.paidAmount = paidAmountTxt;
        utils.log().info("Seat 1 Paid Amount - " + paidAmountTxt);

        String TotalTxt = Total.getText();
        String TotalTxt1 = TotalTxt.replaceAll("[A-Z$. ]","");
        String TotalTxt11 = TotalTxt1.replaceAll("[,]","");
        double totalTxtt = Double.parseDouble(TotalTxt11);
        String totalTxtt1 = String.valueOf((int) Math.round(totalTxtt));

        double totalValuee = subTotalTxt2+taxValue;
        utils.log().info("subTotalTxt2 "+subTotalTxt2 );
//        utils.log().info("a "+a );
        BigDecimal totall=new BigDecimal(totalValuee).setScale(2, RoundingMode.HALF_UP);
        double totall1= totall.doubleValue();
        String totalValuee1 = String.valueOf((int) Math.round(totall1));
        TestUtils.totalTxt = String.valueOf(totalValuee);
        Assert.assertEquals(totalValuee1,totalTxtt1);

        utils.log().info("Seat 1 Total - " + TotalTxt);
    }

    public void getSeat2Prize() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement subTotal = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        WebElement tax = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        WebElement paidAmount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        WebElement Total = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
//        String subTotalTxt = subTotal.getText();
//        TestUtils.subtotalTxt1 = subTotalTxt;
//        utils.log().info("Seat 2 SubTotal - " + subTotalTxt);
//        String taxTxt = tax.getText();
//        TestUtils.taxTxt1 = taxTxt;
//        utils.log().info("Seat 2 Tax - " + taxTxt);
//        String paidAmountTxt = paidAmount.getText();
//        TestUtils.paidAmount1 = paidAmountTxt;
//        utils.log().info("Seat 2 Paid Amount - " + paidAmountTxt);
//        String TotalTxt = Total.getText();
//        TestUtils.totalTxt1 = TotalTxt;
//        utils.log().info("Seat 2 Total - " + TotalTxt);

        String subTotalTxt = subTotal.getText();
        String subTotalTxt1 = subTotalTxt.replaceAll("[A-Z$. ]","");
        String subTotalTxt11 = subTotalTxt1.replaceAll("[,]","");
        double subTotalTxt2 = Double.parseDouble(subTotalTxt11);
        TestUtils.subtotalTxt1 = subTotalTxt;
        utils.log().info("Seat 1 SubTotal - " + subTotalTxt);
        double subtotalValue = Double.parseDouble(subTotalTxt11);
        double taxValue = ((subtotalValue*8)/100);//DefaultTAx

        BigDecimal taxx=new BigDecimal(taxValue).setScale(2, RoundingMode.HALF_UP);
        double a=taxx.doubleValue();
//        double a1 = (a*100.00/100.00) ;
        double a1 = (int)Math.round(a);
        DecimalFormat d= new DecimalFormat("0.00");
        d.format(a1);
        String taxTxt = String.valueOf(d.format(a1));
//        String taxTxt = String.valueOf(a);
        TestUtils.taxTxtSeat2 = taxTxt;
        TestUtils.taxTxtOfBeforeRound2 = String.valueOf(taxValue);
        String ActualValueTax = tax.getText();
        String ActualValueTax1 = ActualValueTax.replaceAll("[A-Z$. ]","");
        String ActualValueTax2 = ActualValueTax1.replaceAll(",","");
        double ActualValueTax3 =Double.parseDouble(ActualValueTax2);
        DecimalFormat d1= new DecimalFormat("0.00");
        String taxTxt1 = d1.format(ActualValueTax3);
        Assert.assertEquals(taxTxt,taxTxt1);
        utils.log().info("Seat 2 Tax - " + taxTxt);
        String paidAmountTxt = paidAmount.getText();
        TestUtils.paidAmount1 = paidAmountTxt;
        utils.log().info("Seat 2 Paid Amount - " + paidAmountTxt);

        String TotalTxt = Total.getText();
        String TotalTxt1 = TotalTxt.replaceAll("[A-Z$. ]","");
        String TotalTxt11 = TotalTxt1.replaceAll("[,]","");
        double totalTxtt = Double.parseDouble(TotalTxt11);
        String totalTxtt1 = String.valueOf(totalTxtt);

        double totalValuee = subTotalTxt2+taxValue;
        utils.log().info("subTotalTxt2 "+subTotalTxt2 );
//        utils.log().info("a "+a );
        BigDecimal totall=new BigDecimal(totalValuee).setScale(2, RoundingMode.HALF_UP);
        double totall1= totall.doubleValue();
        String totalValuee1 = String.valueOf(Double.parseDouble(String.valueOf((int)Math.round(totall1))));
        TestUtils.totalTxt1 = String.valueOf(totalValuee);
        Assert.assertEquals(totalValuee1,totalTxtt1);

        utils.log().info("Seat 2 Total - " + TotalTxt);
    }

    public void verifySeat1PrizeAndSeat2PrizeIsSame() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement subTotal = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        WebElement tax = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        WebElement paidAmount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        WebElement Total = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        // Assert.assertEquals(subTotal.getText(), TestUtils.subtotalTxt);
        utils.log().info("Subtotal of Seat 1 & Seat 2 is SAME - " + subTotal.getText());
        String tax1 = tax.getText();
        String tax2 = tax1.replaceAll("[A-Z$. ]","");
        String tax3 = tax2.replaceAll(",","");
        Assert.assertEquals(tax3, TestUtils.taxTxt1);
        utils.log().info("Tax of Seat 1 & Seat 2 is SAME - " + tax.getText());
        Assert.assertEquals(paidAmount.getText(), TestUtils.paidAmount);
        utils.log().info("Paid Amount of Seat 1 & Seat 2 is SAME - " + paidAmount.getText());
        //  Assert.assertEquals(Total.getText(), TestUtils.totalTxt);
        utils.log().info("Total of Seat 1 & Seat 2 is SAME - " + Total.getText());
    }

    public void getTaxValueAndTotal(){

    }


    public void verifyPrizeDetailsAfterGroupSeats() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //////  SUBTOTAL AFTER GROUP SEATS  /////////
        String subTotalTxt1 = TestUtils.subtotalTxt;
        String subTotalTxt2 = subTotalTxt1.replaceAll("[A-Z$,. ]", "");
        int subTotalAmount1 = Integer.parseInt(subTotalTxt2);
        String subTotalTxt11 = TestUtils.subtotalTxt1;
        String subTotalTxt22 = subTotalTxt11.replaceAll("[A-Z$,. ]", "");
        int subTotalAmount2 = Integer.parseInt(subTotalTxt22);
        int subTotalAmount = subTotalAmount1 + subTotalAmount2;

        WebElement subTotal = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subtotal = subTotal.getText();
        TestUtils.subtotalTxt = subtotal;
        String subtotal1 = subtotal.replaceAll("[A-Z$., ]", "");
        int subtotalAmount = Integer.parseInt(subtotal1);
        Assert.assertEquals(String.valueOf(subTotalAmount), String.valueOf(subtotalAmount));
        utils.log().info("Subtotal is SAME After Group Seats Done - " + subtotal);

        //////  TAX AFTER GROUP SEATS  /////////

        String taxTxt1 = TestUtils.taxTxtOfBeforeRound1;
        // String taxTxt2 = taxTxt1.replaceAll("[A-Z$ ]", "");
        double taxAmount1 = Double.parseDouble(taxTxt1);
        String taxTxt11 = TestUtils.taxTxtOfBeforeRound2;
        //  String taxTxt22 = taxTxt11.replaceAll("[A-Z$ ]", "");
        double taxAmount2 = Double.parseDouble(taxTxt11);
        double taxAmount11 = taxAmount1 + taxAmount2;
        BigDecimal  taxAmount111=new BigDecimal(taxAmount11).setScale(2, RoundingMode.HALF_UP);
        double taxAmount8= taxAmount111.doubleValue();
        String taxAmount = String.valueOf(Double.parseDouble(String.valueOf((int)Math.round(taxAmount8))));

        WebElement tax = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taX = tax.getText();
        TestUtils.taxTxtGroup = taX;
        String taX1 = taX.replaceAll("[A-Z$. ]", "");
        String tax11 = taX1.replaceAll(",","");
        String taXAmount = String.valueOf(Double.parseDouble(tax11));
        Assert.assertEquals(taxAmount, taXAmount);
        utils.log().info("Tax is SAME After Group Seats Done - " + taX);

        //////  PAID AMOUNT AFTER GROUP SEATS  /////////

        String paidAmounT = TestUtils.paidAmount;
        String paidAmounT2 = paidAmounT.replaceAll("[A-Z$,. ]", "");
        int paidAmounT1 = Integer.parseInt(paidAmounT2);
        String paidAmounT11 = TestUtils.paidAmount1;
        String paidAmounT22 = paidAmounT11.replaceAll("[A-Z$,. ]", "");
        int paidAmounT12 = Integer.parseInt(paidAmounT22);
        int paidAmount = paidAmounT1 + paidAmounT12;

        WebElement paidAmountt = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String paidAmountt1 = paidAmountt.getText();
        TestUtils.paidAmount1 = paidAmountt1;
        String paidAmountt11 = paidAmountt1.replaceAll("[A-Z$., ]", "");
        int paidAmounTT = Integer.parseInt(paidAmountt11);
        Assert.assertEquals(String.valueOf(paidAmount), String.valueOf(paidAmounTT));
        utils.log().info("Paid AMount is SAME After Group Seats Done - " + paidAmountt1);

        //////  TOTAL AMOUNT AFTER GROUP SEATS  /////////

        String totalTxt1 = TestUtils.totalTxt;
        String totalTxt12 = totalTxt1.replaceAll("[A-Z$ ]", "");
        double totalTxt = Double.parseDouble(totalTxt12);
        String totalTxt11 = TestUtils.totalTxt1;
        String totalTxt22 = totalTxt11.replaceAll("[A-Z$ ]", "");
        double totalTxT2 = Double.parseDouble(totalTxt22);
        double totalTxTT2 = totalTxt + totalTxT2;
        BigDecimal  totalTxTT3=new BigDecimal(totalTxTT2).setScale(2, RoundingMode.HALF_UP);
        double totalTxTT9= totalTxTT3.doubleValue();
        String totalTxTT = String.valueOf(Double.parseDouble(String.valueOf((int)Math.round(totalTxTT9))));


        WebElement Total = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String Total1 = Total.getText();
        TestUtils.totalTxt = Total1;
        String Total11 = Total1.replaceAll("[A-Z$. ]", "");
        String Total111 = Total11.replaceAll(",","");
        String TotaL = String.valueOf(Double.parseDouble(Total111));

        Assert.assertEquals(totalTxTT, TotaL);
        utils.log().info("TOTAL is SAME After Group Seats Done - " + Total1);

    }

    public void verifySplitSeatPrizeWithOrderScreenPrize() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement subtotal = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        Assert.assertEquals(subtotal.getText(), TestUtils.subtotalTxt);
        utils.log().info("Subtotal is - " + subtotal.getText());

        WebElement tax = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        Assert.assertEquals(tax.getText(), TestUtils.taxTxtGroup);
        utils.log().info("Tax is - " + tax.getText());

        WebElement Total = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        Assert.assertEquals(Total.getText(), TestUtils.totalTxt);
        utils.log().info("Total is - " + Total.getText());

        WebElement paidAmount = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        Assert.assertEquals(paidAmount.getText(), TestUtils.paidAmount);
        utils.log().info("Paid Amount is - " + paidAmount.getText());

    }

    public String[] orderMenuName1 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifieR = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] orderMenuPrize = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifierPrize = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifieR1 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifierPrize1 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifierCheck1 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifierPrizeCheck1 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

    public String[] orderMenuName2 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifieR2 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] orderMenuPrize2 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifierPrize2 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

    public String[] discountName = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] discountCount = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] discountPrize = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

    public String[] discountName11 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] discountCount11 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] discountPrize11 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

    public String[] discountNameVerify1 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] discountCountVerify1 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] discountPrizeVerify1 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] discountNameVerify2 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] discountCountVerify2 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] discountPrizeVerify2 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

    public String[] discountName111 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] discountCount111 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] discountPrize111 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

    public void verifySplitMenuWithOrderScreenMenu() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell"));
        utils.log().info("orderMenu.size() "+orderMenu.size());
        for (int i = 2; i <= orderMenu.size(); i++) {

            WebElement orderMenuName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" +i+ "]/XCUIElementTypeStaticText[1]"));
            orderMenuName1[i-1] = orderMenuName.getText();
//            utils.log().info("Order Screen menu SAME with Split Menu1 - "+orderMenuName1[i]);
////            orderMenuNamee[i] = TestUtils.SplitSeatMenus2[i];
//            utils.log().info("Order Screen menu SAME with Split Menu2 - "+orderMenuNamee[i]);
            Assert.assertEquals(orderMenuName1[i-1], TestUtils.SplitSeatMenus2[i-1]);
            utils.log().info("Order Screen menu SAME with Split Menu - "+(i-1)+" " + orderMenuName1[i-1]);
            try{
                List<WebElement> modifier = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell["+(i)+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
                for(int m=1;m<=modifier.size();m++){
                    WebElement modifier1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+m+"]/XCUIElementTypeStaticText[1]"));
                    modifieR[m] = modifier1.getText();
                    Assert.assertEquals(modifieR[m],TestUtils.ModifierName2[i-1]);
                    utils.log().info("Modifier - "+modifieR[m]);
                }

            }catch(Exception g){

            }
        }

    }

    public void clickTableNumberOnTheOrderScreen(){
        WebElement tableNumber = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText"));
        elementClick(tableNumber,"Selected - "+tableNumber.getText());

    }
    public void verifyTheSeat2MenuWith1stCheck(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell"));
        utils.log().info("orderMenu.size() " + orderMenu.size());
        for (int i = 2; i <= orderMenu.size(); i++) {
            WebElement orderMenuName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
            orderMenuName1[i - 1] = orderMenuName.getText();

            TestUtils.orderMenuName2[i - 1] = orderMenuName1[i - 1];

            WebElement orderMenuPrize1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[2]"));
            orderMenuPrize[i - 1] = orderMenuPrize1.getText();
            TestUtils.orderMenuPrize2[i - 1] = orderMenuPrize[i - 1];
            Assert.assertEquals(TestUtils.orderMenuName2[i - 1],orderMenuName1[i - 1]);
            Assert.assertEquals(TestUtils.orderMenuPrize2[i - 1],orderMenuPrize[i - 1]);
            utils.log().info("Order Screen menu SAME with SEAT 2 Menu - " + (i - 1) + " " + orderMenuName1[i - 1] + " Prize " + orderMenuPrize[i - 1]);
            try {
                List<WebElement> modifier = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + m + "]/XCUIElementTypeStaticText[1]"));
                    modifierVerify1[m] = modifier1.getText();
                    // TestUtils.modifier[m] = modifieR[m];
                    WebElement modifierPrize1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + m + "]/XCUIElementTypeStaticText[3]"));
                    modifierPrizeVerify1[m] = modifierPrize1.getText();
                    //   TestUtils.modifierPrize[m] = modifierPrize[m];
                    Assert.assertEquals(TestUtils.modifier2[m],modifierVerify1[m]);
                    Assert.assertEquals(TestUtils.modifierPrize2[m],modifierPrizeVerify1[m]);
                    utils.log().info("Seat 2 Modifier - " + modifierVerify1[m] + " Prize - " + modifierPrizeVerify1[m]);
                }
                List<WebElement> discount = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[2]/XCUIElementTypeCell"));
                for(int h =1;h<=discount.size();h++){
                    WebElement discountName1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[2]/XCUIElementTypeCell["+h+"]/XCUIElementTypeStaticText[1]"));
                    discountNameVerify2[h] = discountName1.getText();
                    TestUtils.discountName1[h] = discountNameVerify2[h];

                    WebElement discountCount1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[2]/XCUIElementTypeCell["+h+"]/XCUIElementTypeStaticText[2]"));
                    discountCountVerify2[h] = discountCount1.getText();
                    TestUtils.discountCount1[h] = discountCountVerify2[h];

                    WebElement discountPrize1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[2]/XCUIElementTypeCell["+h+"]/XCUIElementTypeStaticText[3]"));
                    discountPrizeVerify2[h] = discountPrize1.getText();
                    TestUtils.discountPrize1[h] = discountPrizeVerify2[h];

                    Assert.assertEquals(TestUtils.discountName1[h],discountNameVerify2[h]);
                    Assert.assertEquals(TestUtils.discountCount1[h],discountCountVerify2[h]);
                    Assert.assertEquals(TestUtils.discountPrize1[h],discountPrizeVerify2[h]);
                    utils.log().info("Discount - "+discountNameVerify2[h]+" Qty - "+discountCountVerify2[h]+" Amount - "+discountPrizeVerify2[h]);
                }


            } catch (Exception g) {

            }
//        try{
//
//        }catch (Exception w){
//
//        }
        }
    }

    public String[] modifierVerify = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifierPrizeVerify = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifierVerify1 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
    public String[] modifierPrizeVerify1 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

    public void verifyTheSeat1MenuWith1stCheck() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> orderMenu = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell"));
        utils.log().info("orderMenu.size() " + orderMenu.size());
        for (int i = 2; i <= orderMenu.size(); i++) {

            WebElement orderMenuName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
            orderMenuName1[i - 1] = orderMenuName.getText();

            TestUtils.orderMenuName[i - 1] = orderMenuName1[i - 1];

            WebElement orderMenuPrize1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[2]"));
            orderMenuPrize[i - 1] = orderMenuPrize1.getText();
            TestUtils.orderMenuPrize[i - 1] = orderMenuPrize[i - 1];
            Assert.assertEquals(TestUtils.orderMenuName[i - 1], orderMenuName1[i - 1]);
            Assert.assertEquals(TestUtils.orderMenuPrize[i - 1], orderMenuPrize[i - 1]);
            utils.log().info("Order Screen menu SAME with Seat 1 Menu - " + (i - 1) + " " + orderMenuName1[i - 1] + " Prize " + orderMenuPrize[i - 1]);
            try {
                List<WebElement> modifier = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
                for (int m = 1; m <= modifier.size(); m++) {
                    WebElement modifier1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + m + "]/XCUIElementTypeStaticText[1]"));
                    modifierVerify[m] = modifier1.getText();
                    // TestUtils.modifier[m] = modifieR[m];
                    WebElement modifierPrize11 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + m + "]/XCUIElementTypeStaticText[3]"));
                    modifierPrizeVerify[m] = modifierPrize11.getText();
                    //   TestUtils.modifierPrize[m] = modifierPrize[m];
                    Assert.assertEquals(TestUtils.modifier[m], modifierVerify[m]);
                    Assert.assertEquals(TestUtils.modifierPrize[m], modifierPrizeVerify[m]);
                    utils.log().info("Seat 1 Modifier is SAME - " + modifierVerify[m] + " Prize - " + modifierPrizeVerify[m]);
                }
                List<WebElement> discount = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[2]/XCUIElementTypeCell"));
                for(int h =1;h<=discount.size();h++){
                    WebElement discountName1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[2]/XCUIElementTypeCell["+h+"]/XCUIElementTypeStaticText[1]"));
                    discountNameVerify1[h] = discountName1.getText();
                    TestUtils.discountName[h] = discountNameVerify1[h];

                    WebElement discountCount1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[2]/XCUIElementTypeCell["+h+"]/XCUIElementTypeStaticText[2]"));
                    discountCountVerify1[h] = discountCount1.getText();
                    TestUtils.discountCount[h] = discountCountVerify1[h];

                    WebElement discountPrize1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeTable[2]/XCUIElementTypeCell["+h+"]/XCUIElementTypeStaticText[3]"));
                    discountPrizeVerify1[h] = discountPrize1.getText();
                    TestUtils.discountPrize[h] = discountPrizeVerify1[h];

                    Assert.assertEquals(TestUtils.discountName[h],discountNameVerify1[h]);
                    Assert.assertEquals(TestUtils.discountCount[h],discountCountVerify1[h]);
                    Assert.assertEquals(TestUtils.discountPrize[h],discountPrizeVerify1[h]);
                    utils.log().info("Discount - "+discountNameVerify1[h]+" Qty - "+discountCountVerify1[h]+" Amount - "+discountPrizeVerify1[h]);
                }

            } catch (Exception g) {

            }
//            try{
//
//
//            }catch (Exception w){
//
//            }

        }
    }
    public void getMenuDetailsGroupSeat2() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> menus1 = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell"));
        utils.log().info("menus1.size - "+menus1.size());
        for (int j = 1; j <= menus1.size(); j++) {
            WebElement menuName1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + j + "]/XCUIElementTypeStaticText[1]"));
            MenuNameTxt2[j] = menuName1.getText();
            TestUtils.SplitSeatMenus2[j] = MenuNameTxt2[j];
            // utils.log().info(" Seat 2 Menu Name - "+ MenuNameTxt2[j]);
            WebElement menuQuantity = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + j + "]/XCUIElementTypeButton/XCUIElementTypeStaticText"));
            MenuQty2[j] = menuQuantity.getText();
            TestUtils.MenuQuantity2[j] = MenuQty[j];
            WebElement menuPrize1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[" + j + "]/XCUIElementTypeStaticText[2]"));
            MenuNamePrize2[j] = menuPrize1.getText();
            TestUtils.SplitSeatMenusPrize2[j] = MenuNamePrize2[j];
            utils.log().info("Seat 2 Menu Name - " +j+" "+ MenuNameTxt2[j] + " Quantity - " + MenuQty2[j] + " Prize - " + MenuNamePrize2[j]);
            try {
                List<WebElement> modifers = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+j+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell"));
                for (int k = 1; k <= modifers.size(); k++) {
                    WebElement modifierName = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+j+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + k + "]/XCUIElementTypeStaticText[1]"));
                    ModifierName2[j] = modifierName.getText();
                    TestUtils.ModifierName2[j] = ModifierName2[j];
                    //  utils.log().info("Seat 1 Modifier Name - "+ ModifierName[i]);
                    WebElement ModifierQty22 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+j+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + k + "]/XCUIElementTypeStaticText[2]"));
                    ModifierQty2[j] = ModifierQty22.getText();
                    TestUtils.ModifierQty2[j] = ModifierQty2[j];

                    WebElement modifierPrize = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell["+j+"]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" + k + "]/XCUIElementTypeStaticText[3]"));
                    ModifierPrize2[j] = modifierPrize.getText();
                    TestUtils.ModifierPrize2[j] = ModifierPrize2[j];
                    utils.log().info("Seat 2 Modifier - "+j + ModifierName2[j] + " Qty - " + ModifierQty2[j] + " Prize - " + ModifierPrize2[j]);
                }
            } catch (Exception z) {

            }

        }
    }

    public void verifySeatAsPaid(){
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        WebElement seats = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"));
        Assert.assertEquals(seats.getText(),"Paid");
        utils.log().info("Displayed as - "+seats.getText());
    }

    public void verifyTheMergedPopup(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }

    public void getFirstSeatPRizeDetails(){

    }

    public void verifyGratuityValueAfterAddAutoGratuity(String value){

        WebElement e11 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Subtotal\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        int subtotalValue = Integer.parseInt(e11.getText().replaceAll("[A-Z$., ]",""));

        int gratuityValue = Integer.parseInt(value);
       int gratuity = ( subtotalValue * gratuityValue )/100 ;
        String ExpectedGratuity = String.valueOf(gratuity);
        utils.log().info("Gratuity as - "+ gratuity);
        WebElement Gratuity1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Gratuity\"]/../../XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
       String actualGratuity = (Gratuity1.getText().replaceAll("[A-Z$,. ]",""));
        Assert.assertEquals(ExpectedGratuity,actualGratuity);

    }
}


