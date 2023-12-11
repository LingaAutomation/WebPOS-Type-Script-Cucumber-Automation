package com.qa.pages;

import com.qa.utils.TestUtils;
//import com.sun.corba.se.impl.protocol.RequestCanceledException;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CheckAndItemTransfer extends BasePage{

    public String check = " ";

    public String FirstMenuItem = "";

    public String FirstTableName = "", ServerName = "", ServerName1 = "", ServerName2 = "";

    public String Table1 = "", Table2 = "";

    public String FTable1 = "", FTable2 = "";

    public int itemToSelect1;

    @FindBy(xpath ="(//XCUIElementTypeButton[@name=\"arrow down\"])[2]")
    private WebElement arrowDownForOtherMenuItems;

    @FindBy(xpath = "Salad" )
    private WebElement saladCategoryBtn;

    @FindBy(xpath = "finish")
    private WebElement finishOrderBtn;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[1]")
    private WebElement doneButton;

    public void clickTheAllButtonInQSRScreen(){
        WebElement element = mergeAndFindMobileElement(allTabInQSR);
        elementClick(element,"Click the All button in QSR Screen");
    }

    public void clickTheTableLayoutButton()
    {
        WebElement ele = mergeAndFindMobileElement(tableLayoutTab);
        elementClick(ele,"Click the Table Layout tab");
    }

    public void clickTheEmptyTableFromTheListOfTable()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Get The total number of tables
        List<WebElement> table = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        int count = table.size();
        utils.log().info(String.valueOf(count));

        //Click the Table
        for(int i = 1; i<= count; i++)
        {
            List<WebElement> Emptytable = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton["+i+"]/XCUIElementTypeStaticText[@name]"));
            int cnt = Emptytable.size();
            utils.log().info(String.valueOf(cnt));
            if(cnt == 2)
            {
                driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton["+i+"]")).click();
                break;
            }
        }
    }

    public void selectTheNumberOfSeatAndClickContinue()
    {
        WebElement ele = mergeAndFindMobileElement(selectTheNumberOfTable);
        elementClick(ele,"Select the number of Table");

        WebElement cont = mergeAndFindMobileElement(continueButton);
        elementClick(cont,"Click the Continue button");
    }

    public void pressArrowDown2 (){
        elementClick(arrowDownForOtherMenuItems, "the rest of the categories is listed");
    }

    public void selectFoodCategory(){
        pressArrowDown2();
        elementClick(saladCategoryBtn, "Salad Category selected");
    }

    public void selectTheMenuRandomly()
    {
        WebElement order = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]"));
        check = order.getText();
        TestUtils.tableNumberof = check;
        utils.log().info(check);
       new Regression(driver).getCheckNumberTxt();
        selectFoodCategory();

        List<WebElement> menuCollection = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        int count1 = menuCollection.size();
        Random rand1 = new Random();

        for (int j = 1; j <= 2; j++){
            itemToSelect1 = rand1.nextInt(count1);

            if (itemToSelect1 == 0) {
                itemToSelect1 = 1;
            }
            utils.log().info(String.valueOf(itemToSelect1));
            WebElement menu = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]"));
            // utils.log().info(menu.getText());
            elementClick(menu, "Tapped Menu - " +menu.getText());
            try {
                WebElement mainModi = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                if ((mainModi.isDisplayed())) {
                    String mainModifier = mainModi.getText();
                    elementClick(mainModi, mainModifier + " - Tapped Main Modifier");

                    try {
                        WebElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", String.valueOf(TestUtils.driverWAIT));
                        WebElement subModi1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                        WebElement subModi2 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]"));
                        WebElement subModi3 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"));
                        if (remainingModi.isDisplayed()) {
                            String SubModifier1 = subModi1.getText();
                            elementClick(subModi1, SubModifier1 + " - SubModifier");
                            String SubModifier2 = subModi2.getText();
                            elementClick(subModi2, SubModifier2 + " - SubModifier");
                            String SubModifier3 = subModi3.getText();
                            elementClick(subModi3, SubModifier3 + " - SubModifier");
                            elementClick(doneButton, "Tapped Done");

                        }
                    } catch (Exception h) {
                        elementClick(doneButton, "Tapped Done");
                    }
                }

            } catch (Exception x) {
                try {
                    WebElement size1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                    WebElement size2 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]"));
                    WebElement minimum = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]"));
                    String mini = minimum.getText();
                    if (find(size2, 1)) {
                        String data = size1.getText();
                        elementClick(size1, data + " - selected");
                        WebElement mainModi1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]"));
                        String mainModi = mainModi1.getText();
                        elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
                        elementClick(doneButton, "Tapped Done");
                    } else if (find(minimum, 1)) {
                        utils.log().info(mini + " - Additional Modifiers ");
                        //             if (find(minimum, 2)) {
                        WebElement addMeats = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]"));
                        String modiname = addMeats.getText();
                        elementClick(addMeats, "Modifier selected - " + modiname);
                        elementClick(doneButton, "Tapped Done");
                    }
                } catch (Exception z) {

                }
            }


        }

        elementClick(finishOrderBtn, "Finish Button");
    }

    public void selectTheTransferOption(){
        WebElement ele = mergeAndFindMobileElement(transferBtn);
        elementClick(ele,"Click the Transfer Button in Table Layout tab");
    }

    public void selectTheTransferItemBtn(){
        WebElement ele = mergeAndFindMobileElement(transferItemBtn);
        elementClick(ele,"Click the Transfer Item button in the Transfer window");
    }

    public String verifyTransferToServerBtnInTransferWindow()
    {
        WebElement ele1 = mergeAndFindMobileElement(transferToServerBtn);
        return getText(ele1,"Text");
    }

    public String verifyTransferToTableBtnInTransferWindow()
    {
        WebElement ele2 = mergeAndFindMobileElement(transferToTableBtn);
        return getText(ele2,"Text");
    }

    public String verifyTransferItemBtnInTransferWindow()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement ele3 = mergeAndFindMobileElement(transferItemBtn);
        return getText(ele3,"Text");
    }

    public void selectTheFirstTableFromTheTransferFromTable()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement ele = mergeAndFindMobileElement(firstElementOfTransferFromTable);
        Table1 = getText(ele,"Text");
        Table1 = Table1.substring(Table1.lastIndexOf("T"));
        TestUtils.FirstTable = Table1;

        elementClick(ele,"Click the first table from the List of table in the Transfer From table");

    }

    public void selectTheFirstOptionFromTheMenuItemTable()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement ele = mergeAndFindMobileElement(firstIteminMenuItemTable);
        elementClick(ele,"Click the first menu item from the List of menu items in the Menu Item table - "+ele.getText());
        String el = getText(ele,"Text");
        FirstMenuItem = el;
        TestUtils.FirstMenuItem = FirstMenuItem;
        utils.log().info(FirstMenuItem);
    }

    public void selectTheFirstTableFromTheTransferToTable()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement ele = mergeAndFindMobileElement(firstElementOfTransferToTable);
        elementClick(ele,"Click the first table from the List of table in the Transfer To table");

        Table2 = getText(ele,"Text");
        Table2 = Table2.substring(Table2.lastIndexOf("T"));
        TestUtils.SecondTable = Table2;
    }

    public void clickTheDoneBtn()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement ele = mergeAndFindMobileElement(doneBtnInTransferWindow);
        elementClick(ele,"Click the Done button");
    }

    public String getTheSuccessmessage()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement ele = mergeAndFindMobileElement(successmessageOfTransfer);
        return getText(ele,"Text");
    }

    public void clickTheFromTableFromTheListOfTables()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+TestUtils.FirstTable+"\"]")).click();
    }

    public void verifyTheMenuItemInTheSendingTable()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        TestUtils.FirstMenuItem = TestUtils.FirstMenuItem.substring(0,TestUtils.FirstMenuItem.indexOf(" "));
        try {
            if(driver.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name,\""+TestUtils.FirstMenuItem+"\")]")).getText().contains(TestUtils.FirstMenuItem))
            {
                utils.log().info("Transferred Menu item is still available in the already transferred table - "+TestUtils.FirstMenuItem);
            }
        }catch(Exception e)
        {
            utils.log().info("Menu item is not available in the Transferred Table");
        }
    }

    public void verifyTheMenuItemInOrderScreenAfterTransferDone(){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
       List<WebElement> listOfMenu = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell"));
       int count = listOfMenu.size();
       String actualMenuItem = TestUtils.FirstMenuItem;
       String[] actualMenuItem1 = actualMenuItem.split(" ");
       for(int i=2;i<=count;i++){
           WebElement menus = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeStaticText[1]"));
           String menusTxt = menus.getText();
           try{
               Assert.assertEquals(menusTxt,actualMenuItem1[0]);
               utils.log().info("Transferred Menu is Presented - "+menusTxt);

           }catch (Exception w){
               utils.log().info("Transferred Menu is not Available - "+menusTxt);
           }
       }
    }
    public void clickTheFinishButton()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement ele = mergeAndFindMobileElement(finishbtnInOrderScreen);
        elementClick(ele,"Click the Finish button");
    }

    public void clickTheToTableFromTheListOfTables()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+TestUtils.SecondTable+"\"]")).click();
    }

    public void verifyTheMenuItemInTheReceivingTable() {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        String actualMenuItem = TestUtils.FirstMenuItem;
        String[] actualMenuItem1 = actualMenuItem.split(" ");
        try {
            if (driver.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name,\"" + actualMenuItem1[0] + "\")]")).getText().contains(FirstMenuItem)) {
                utils.log().info("Transferred Menu item is available in the transferred to table - "+actualMenuItem1[0]);
            }
        } catch (Exception e) {
            utils.log().info("Menu item is not available in the Transferred to Table");
        }
    }



    public void closeTheActiveChecks()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement ele = mergeAndFindMobileElement(checkStatstab);
        elementClick(ele,"Click the Check Stats tab to check or close the active checks");

        List<WebElement> e = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"CheckDetialsIconDisable\"]"));
        int count = e.size();

        for(int i = 1; i <= count; i++)
        {
            //Click the check
            driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"CheckDetialsIconDisable\"]/..")).click();

            //click the open check button
            elementClick(mergeAndFindMobileElement(openCheckbuttonInCheckStatsScreen),"Click the Open Check button in the Check Stats Screen");

            //Click the void button
            elementClick(mergeAndFindMobileElement(voidTab),"Click the Void tab in the Order Screen");

            //Click Anyone reason
            elementClick(mergeAndFindMobileElement(voidCauseType),"Click anyone reason for Void");

            //Click the Add button in Void reason popup
            elementClick(mergeAndFindMobileElement(addVoidTypeButton),"Click the Add button in the Void Reason popup");

            //Click the Done button
            elementClick(mergeAndFindMobileElement(successPopup),"Click the Done button in the Order Type Popup");

            // clickTheAllButtonInQSRScreen();

            if (i == count)
            {
                //Click The QSR button
                elementClick(mergeAndFindMobileElement(tableOfTabOnClosedCheck),"Click the QSR button");

                //Click the cancel button
                elementClick(mergeAndFindMobileElement(cancel),"Click the Cancel button from the order Type Popup");

                //Click the logoff button
                elementClick(mergeAndFindMobileElement(logOffButton),"Click the log off button");
            }
        }
    }

    public void clickTheTransferredToTableOption()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        elementClick(mergeAndFindMobileElement(transferToTableBtn),"Click the Transferred To Table button");
    }

    public void selectTheTransferToTableFromTheTransferFromTable()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement ele = mergeAndFindMobileElement(firstElementOfTransferFromTable);
        elementClick(ele,"Click the first table from the List of table in the Transfer From table");

        FTable1 = getText(ele,"Text");
        FTable1 = FTable1.substring(FTable1.lastIndexOf("-"));
        TestUtils.FTable1 = FTable1;
    }

    public void selectTheFirstCheckFromTheCheckTable()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement ele = mergeAndFindMobileElement(firstCheckInChecksTable);
        elementClick(ele,"Click the first Check from the List of Checks in the Check table");

        String el = getText(mergeAndFindMobileElement(tableNameInTheFirstCheckAndTheCheckInChecksTable),"Get the text of Table name from the First Check from the Checks Table");
        TestUtils.FirstTableName = el;
        utils.log().info(TestUtils.FirstTableName);

        String el2 = getText(mergeAndFindMobileElement(serverNameInTheFirstCheckAndTheCheckInChecksTable),"Get the text of Server name from the First Check from the Checks Table");
        ServerName = el2;
        utils.log().info(ServerName);
        TestUtils.ServerNamee = ServerName;
    }

    @FindBy(xpath = "**/XCUIElementTypeTextField[`value == \"Search Checks\"`]")
    WebElement searchChecks;
    public void selectThecheckFromTheTransferServer(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        searchChecks.sendKeys(TestUtils.globalCheckNumber);
        elementClick(hideKeyboardButton, "Keyboard hidden.");
        WebElement ele = mergeAndFindMobileElement(firstCheckInChecksTable);
        elementClick(ele,"Click the first Check from the List of Checks in the Check table- "+TestUtils.globalCheckNumber);

    }
    public void selectTheFirstTableforTransferChecksFromTheTransferToTable()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement ele = mergeAndFindMobileElement(firstElementOfTransferToTable);
        elementClick(ele,"Click the first table from the List of table in the Transfer To table");

        FTable2 = getText(ele,"Get the Text of corresponding Table");
        FTable2 = FTable2.substring(FTable2.lastIndexOf("-")+1);
        TestUtils.FTable2 = FTable2;
    }

    public String getTheSuccessmessageForTransferToTable()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement ele = mergeAndFindMobileElement(successmessageOfCheckTransfer);
        String d = getText(ele,"Get the Successful message of Transfer To Table");

        return d;
    }

    public void verifyTheCheckTransferredToTheCorrespondingTableOrNotFromTheBeginningTable()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        List<WebElement> e = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+TestUtils.FTable1+"\"]/../XCUIElementTypeStaticText[@name]"));
        int count = e.size();

        if(count == 2)
        {
            utils.log().info("The Check is transferred from the required table");
        }
    }

    public void verifyTheCheckTransferredToTheCorrespondingTableOrNotToTheReceivingTable()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+TestUtils.FTable2+"\"]")).click();

        List<WebElement> e = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell"));
        int count = e.size();

        if(count == 2)
        {
            utils.log().info("The Check is transferred to the corresponding table");
        }
    }

    public void clickTheCloseBtn()
    {
        elementClick(mergeAndFindMobileElement(closeBtnFromChecksPopup),"Click The close button");
    }

    public void clickTheTransferredToServerOption()
    {
        elementClick(mergeAndFindMobileElement(transferToServerBtn),"Click the Transferred To Server button");
    }

    public String getTheServerFromTheTable()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        String e = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"T1\"]/../XCUIElementTypeStaticText[@name][5]")).getText();

        ServerName1 = e;

        TestUtils.ServerName1 = ServerName1;
        utils.log().info("Server NAme - "+ServerName1);
        return ServerName1;
    }
@FindBy(xpath = "**/XCUIElementTypeTextField[`value == \"Search\"`][1]")
WebElement searchField;
    @FindBy(xpath ="//*[@name=\"Hide keyboard\"]")
    private WebElement hideKeyboardButton;

    public void selectTheRequiredServerFromTheListOfServersTableFrom()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        utils.log().info(" TestUtils.ServerName1 - "+TestUtils.ServerName1);
        searchField.sendKeys(TestUtils.ServerName1);
        elementClick(hideKeyboardButton, "Keyboard hidden.");
        WebElement server = (WebElement) driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\""+TestUtils.ServerName1+"\"])[1]"));
        elementClick(server,"Tapped - "+TestUtils.ServerName1);
//        driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\""+TestUtils.ServerName1+"\"])[1]")).click();
    }

    public void selectTheTransferredToServerFromTheListOfTransferTo()
    {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        String s = getText(mergeAndFindMobileElement(firstElementOfTransferToTable),"Get the text of Transferred To server");

        ServerName2 = s;

        TestUtils.ServerName2 = ServerName2;

        elementClick(mergeAndFindMobileElement(firstElementOfTransferToTable),"Click the required Transferred To Server");

        try{
            if(mergeAndFindMobileElement(offlineServerTransactionConfirmation).isDisplayed())
            {
                elementClick(mergeAndFindMobileElement(yesButton),"Click the Yes button");
            }
        }catch (Exception d){}
    }

    public void verifyTheTransferredToServer()
    { driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        String e = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"T1\"]/../XCUIElementTypeStaticText[@name][5]")).getText();

        if(e.contentEquals(TestUtils.ServerName2))
        {
            utils.log().info("Server Transferred Successfully in the required place - "+TestUtils.ServerName2);
        }
    }

    public void selectTheCheckForTransfer() throws InterruptedException {
       driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
       WebElement searchField = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField"));
       sendKeys(searchField,TestUtils.globalCheckNumber,"Enter the Check number - "+TestUtils.globalCheckNumber);

       WebElement selectCheck = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText"));
       String selectCheckTxt = selectCheck.getText();
       elementClick(selectCheck,"Selected - "+selectCheckTxt);

    }

    public int itemToSelect;

    public void selectTheCheckForTransfer1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        List<WebElement> tablee = (List<WebElement>) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer To\"]/../XCUIElementTypeTable/XCUIElementTypeCell"));
        int count = tablee.size();
        utils.log().info(String.valueOf(count));

        Random rand = new Random();

        for (int i = 1; i <= 1; i++) {
            itemToSelect = rand.nextInt(count);

            if (itemToSelect == 0) {
                itemToSelect = 1;
            }
            utils.log().info(String.valueOf(itemToSelect));
             selectedCheck();
        }
    }

    public void selectedCheck() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        WebElement selectCheck = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer To\"]/../XCUIElementTypeTable/XCUIElementTypeCell[" + itemToSelect + "]/XCUIElementTypeStaticText"));
        String selectCheckTxt= (selectCheck.getText()).substring(7);
        TestUtils.Transfertable = selectCheckTxt.replaceAll(" ","");
        utils.log().info("TestUtils.Transfertable - "+TestUtils.Transfertable);
        TestUtils.TransferCheckNumber = (selectCheck.getText()).substring(0,5);
        utils.log().info("TestUtils.TransferCheckNumber - "+TestUtils.TransferCheckNumber);
        if(selectCheckTxt.contains("T")) {
           if((!"ToG".equals(selectCheckTxt)&&(!"Bar".equals(selectCheckTxt)))) {
                elementClick(selectCheck, "Selected - " + selectCheckTxt);
            }else{ }
        }else{
            selectTheCheckForTransfer1();
        }
    }

    public void clickTheTransferredTable() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
    String m = (TestUtils.Transfertable).replaceAll("[- ]","");

        utils.log().info("m - "+m);
        WebElement tableSelect = (WebElement) driver.findElement(By.xpath(m));
        if (tableSelect.isDisplayed()) {                                                                     //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[15]

            Thread.sleep(100);
            elementClick(tableSelect, "Selected Table - " + tableSelect.getText());
            try {
                WebElement checks = (WebElement) driver.findElement(By.xpath("Checks"));

                if (checks.isDisplayed()) {
                    Thread.sleep(200);
                    String globalCheckNumber = TestUtils.TransferCheckNumber;

                    WebElement checkNumberrr = (WebElement) driver.findElement(By.xpath(globalCheckNumber));
                    if (checkNumberrr.isDisplayed()) {
                        elementClick(checkNumberrr, "Selected Check Number - " + checkNumberrr.getText());
                    } else {
                    }

                } else {
                    WebElement table1 = (WebElement) driver.findElement(By.xpath(m));
                    elementClick(table1, "table SELECTED - " + m);

                }
            } catch (Exception w) {

            }
        }
    }



}