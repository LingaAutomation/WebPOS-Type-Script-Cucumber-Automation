package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class TransferWindow extends TableLayOutScreen{

    public TransferWindow(WebDriver driver) {
        super(driver);
    }
    @FindBy( xpath = "Transfer to Table" )
    private WebElement transferToTableBtn;

    @FindBy( xpath = "Floor 1-T1" )
    private WebElement selectTransferFromTableBtn;

    @FindBy( xpath = ("//XCUIElementTypeStaticText[@name=\"Floor 1-T10\"])[1]") )
    private WebElement selectTransferToTableBtn;

    @FindBy( xpath = "Done" )
    private WebElement transferDoneBtn;

    @FindBy(xpath = "Transfer to Server")
    private WebElement transferToServerBtn;

    //@FindBy( xpath = "(//XCUIElementTypeStaticText[@name=\"Ragav N\"])[1]" )
    @FindBy( xpath = "(//XCUIElementTypeStaticText[@name=\"Engin T\"])[1]" )
    private WebElement serverFromEnginT;

    // @FindBy( xpath = "(//XCUIElementTypeStaticText[@name=\"ragav 1\"])[2]" )
    @FindBy( xpath = "(//XCUIElementTypeStaticText[@name=\"Engin A\"])[2]" )
    private WebElement serverToEnginA;

    //@FindBy( xpath = "//XCUIElementTypeStaticText[@name=\"Employee is offline Still Do you want to continue\"]" )
    //private WebElement employeeIsOfflineMsg;

    @FindBy( xpath = "Employee is offline Still Do you want to continue" )
    private WebElement employeeIsOfflineMsg;

    @FindBy( xpath = "Yes" )
    private WebElement yesToEmployeeIsOffline;

    @FindBy( xpath = "Transfer Item" )
    private WebElement transferItemBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]" )
    private WebElement transferItemFrom;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell")
    private WebElement itemToTransfer;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell")
    private WebElement tableToTransferTheItem;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement checkTransfer;



    public void pressTransferToTable(){
        elementClick(transferToTableBtn, "Transfer to table button tapped" );
    }

    public void pressTransferToServer(){
        elementClick(transferToServerBtn, "Transfer to server button tapped" );
    }

    public void pressTransferItem(){
        elementClick(transferItemBtn, "Transfer to server button tapped" );
    }

    public void selectServerTransferFrom(){
        elementClick(serverFromEnginT, "Transfer from server is selected" );
    }

    public void selectServerTransferTo(){
        elementClick(serverToEnginA, "Transfer to server is selected" );
    }

    public void selectTransferFromTable(String tableFrom){
        WebElement e = mergeAndFindElement(tableFrom,"", TestUtils.Accessibility);
        elementClick(e, tableFrom + " is selected" );
    }

    public void selectCheck(String checkTable) throws Exception {
        WebElement e = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"" + checkTable +"\"])[1]","",TestUtils.XPath);
        scrollToElementPayments(e,"up");
        elementClick(e, "Check in " + checkTable + " is selected");
    }

    public void selectCheckTransfer(){
        elementClick(checkTransfer,"Selected check to Transfer");
    }

    public void selectTableTransferTo(String tableTo){
        //"//XCUIElementTypeOther[@name=\"" + title + "\"]/following-sibling::*[1]/child::XCUIElementTypeStaticText[@name=\"test-Price\"]"
        WebElement e = mergeAndFindElement("(//XCUIElementTypeStaticText[@name=\"Floor 1-T11\"])[2]","",TestUtils.XPath);
        elementClick(e, tableTo + " is selected");
    }

    public void selectTransferItemFrom(){
        elementClick(transferItemFrom, "Table that an item will be transferred from is selected");
    }

    public void selectItemToTransfer(){
        elementClick(itemToTransfer, "Item to be transferred is selected");
    }

    public void selectTableToTransferTheItem(){
        elementClick(tableToTransferTheItem, "Table to transfer the item is selected.");
    }

    public void pressTransferDone(){
        elementClick(transferDoneBtn, "Done (Transfer) button is tapped" );
    }

    public void pressYes(){
        elementClick(yesToEmployeeIsOffline, "Yes button is tapped in the employee is offline pop-up" );
    }

    public void verifyTransfer(){
        WebElement e2=mergeAndFindElement("//XCUIElementTypeStaticText[@name=\"3\"]","",TestUtils.XPath);
        if(e2.isDisplayed()){
            utils.log().info("there is 3 seat in T9");
        }
        else
        {
            utils.log().info("Error!! table is not seated");
        }
    }

    public String getEmployeeOfflineMsg(){
        return elementGetText(employeeIsOfflineMsg, "Employee offline message is displayed" );
    }


}
